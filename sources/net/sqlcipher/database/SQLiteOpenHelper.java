package net.sqlcipher.database;

import android.content.Context;
import android.util.Log;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.File;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DefaultDatabaseErrorHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class SQLiteOpenHelper {
    private static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mDeferSetWriteAheadLoggingEnabled;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private final SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null, new DefaultDatabaseErrorHandler());
    }

    public void close() {
        synchronized (this) {
            if (this.mIsInitializing) {
                throw new IllegalStateException("Closed during initialization");
            }
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public SQLiteDatabase getReadableDatabase(String str) {
        SQLiteDatabase readableDatabase;
        synchronized (this) {
            readableDatabase = getReadableDatabase(str == null ? null : str.toCharArray());
        }
        return readableDatabase;
    }

    public SQLiteDatabase getWritableDatabase(String str) {
        SQLiteDatabase writableDatabase;
        synchronized (this) {
            writableDatabase = getWritableDatabase(str == null ? null : str.toCharArray());
        }
        return writableDatabase;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new SQLiteException(sb.toString());
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.mDatabase.isReadOnly()) {
                    this.mDeferSetWriteAheadLoggingEnabled = z;
                } else {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                    this.mEnableWriteAheadLogging = z;
                }
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(context, str, cursorFactory, i, sQLiteDatabaseHook, new DefaultDatabaseErrorHandler());
    }

    public SQLiteDatabase getReadableDatabase(char[] cArr) {
        SQLiteDatabase readableDatabase;
        synchronized (this) {
            readableDatabase = getReadableDatabase(cArr == null ? null : SQLiteDatabase.getBytes(cArr));
        }
        return readableDatabase;
    }

    public SQLiteDatabase getWritableDatabase(char[] cArr) {
        SQLiteDatabase writableDatabase;
        synchronized (this) {
            writableDatabase = getWritableDatabase(cArr == null ? null : SQLiteDatabase.getBytes(cArr));
        }
        return writableDatabase;
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        this.mDatabase = null;
        this.mIsInitializing = false;
        if (i <= 0) {
            throw new IllegalArgumentException(j.o("Version must be >= 1, was ", i));
        }
        if (databaseErrorHandler != null) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mHook = sQLiteDatabaseHook;
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
    }

    public SQLiteDatabase getReadableDatabase(byte[] bArr) {
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return this.mDatabase;
            }
            if (!this.mIsInitializing) {
                try {
                    return getWritableDatabase(bArr);
                } catch (SQLiteException e) {
                    if (this.mName != null) {
                        String str = TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't open ");
                        sb.append(this.mName);
                        sb.append(" for writing (will try read-only):");
                        Log.e(str, sb.toString(), e);
                        AutoCloseable autoCloseable = null;
                        try {
                            this.mIsInitializing = true;
                            String path = this.mContext.getDatabasePath(this.mName).getPath();
                            File file = new File(path);
                            File file2 = new File(this.mContext.getDatabasePath(this.mName).getParent());
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            if (!file.exists()) {
                                this.mIsInitializing = false;
                                SQLiteDatabase writableDatabase = getWritableDatabase(bArr);
                                this.mIsInitializing = true;
                                writableDatabase.close();
                            }
                            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(path, bArr, this.mFactory, 1, this.mHook, this.mErrorHandler);
                            if (sQLiteDatabaseOpenDatabase.getVersion() == this.mNewVersion) {
                                onOpen(sQLiteDatabaseOpenDatabase);
                                this.mDatabase = sQLiteDatabaseOpenDatabase;
                                this.mIsInitializing = false;
                                return sQLiteDatabaseOpenDatabase;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Can't upgrade read-only database from version ");
                            sb2.append(sQLiteDatabaseOpenDatabase.getVersion());
                            sb2.append(" to ");
                            sb2.append(this.mNewVersion);
                            sb2.append(": ");
                            sb2.append(path);
                            throw new SQLiteException(sb2.toString());
                        } catch (Throwable th) {
                            this.mIsInitializing = false;
                            if (0 != 0 && null != this.mDatabase) {
                                autoCloseable.close();
                            }
                            throw th;
                        }
                    }
                    throw e;
                }
            }
            throw new IllegalStateException("getReadableDatabase called recursively");
        }
    }

    public SQLiteDatabase getWritableDatabase(byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
            if (!this.mIsInitializing) {
                SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.lock();
                }
                SQLiteDatabase sQLiteDatabase3 = null;
                try {
                    this.mIsInitializing = true;
                    String str = this.mName;
                    if (str == null) {
                        sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null, BuildConfig.FLAVOR);
                    } else {
                        String path = this.mContext.getDatabasePath(str).getPath();
                        File file = new File(path);
                        if (!file.exists()) {
                            file.getParentFile().mkdirs();
                        }
                        sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(path, bArr, this.mFactory, this.mHook, this.mErrorHandler);
                    }
                    sQLiteDatabase3 = sQLiteDatabaseOpenOrCreateDatabase;
                    if (this.mDeferSetWriteAheadLoggingEnabled) {
                        this.mEnableWriteAheadLogging = sQLiteDatabase3.enableWriteAheadLogging();
                    }
                    onConfigure(sQLiteDatabase3);
                    int version = sQLiteDatabase3.getVersion();
                    if (version != this.mNewVersion) {
                        sQLiteDatabase3.beginTransaction();
                        try {
                            if (version == 0) {
                                onCreate(sQLiteDatabase3);
                            } else {
                                int i = this.mNewVersion;
                                if (version > i) {
                                    onDowngrade(sQLiteDatabase3, version, i);
                                } else {
                                    onUpgrade(sQLiteDatabase3, version, i);
                                }
                            }
                            sQLiteDatabase3.setVersion(this.mNewVersion);
                            sQLiteDatabase3.setTransactionSuccessful();
                            sQLiteDatabase3.endTransaction();
                        } catch (Throwable th) {
                            sQLiteDatabase3.endTransaction();
                            throw th;
                        }
                    }
                    onOpen(sQLiteDatabase3);
                    this.mIsInitializing = false;
                    SQLiteDatabase sQLiteDatabase4 = this.mDatabase;
                    if (sQLiteDatabase4 != null) {
                        try {
                            sQLiteDatabase4.close();
                        } catch (Exception unused) {
                        }
                        this.mDatabase.unlock();
                    }
                    this.mDatabase = sQLiteDatabase3;
                    return sQLiteDatabase3;
                } catch (Throwable th2) {
                    this.mIsInitializing = false;
                    SQLiteDatabase sQLiteDatabase5 = this.mDatabase;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.unlock();
                    }
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("getWritableDatabase called recursively");
        }
    }
}
