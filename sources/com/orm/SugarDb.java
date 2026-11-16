package com.orm;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.orm.helper.ManifestHelper;
import com.orm.util.ContextUtil;
import com.orm.util.SugarCursorFactory;

/* JADX INFO: loaded from: classes.dex */
public class SugarDb extends SQLiteOpenHelper {
    private static final String LOG_TAG = "Sugar";
    private int openedConnections;
    private final SchemaGenerator schemaGenerator;
    private SQLiteDatabase sqLiteDatabase;

    private SugarDb() {
        super(ContextUtil.getContext(), ManifestHelper.getDbName(), new SugarCursorFactory(ManifestHelper.isDebugEnabled()), ManifestHelper.getDatabaseVersion());
        this.openedConnections = 0;
        this.schemaGenerator = SchemaGenerator.getInstance();
    }

    public static SugarDb getInstance() {
        return new SugarDb();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            int i = this.openedConnections - 1;
            this.openedConnections = i;
            if (i == 0) {
                super.close();
            }
        }
    }

    public SQLiteDatabase getDB() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this) {
            if (this.sqLiteDatabase == null) {
                this.sqLiteDatabase = getWritableDatabase();
            }
            sQLiteDatabase = this.sqLiteDatabase;
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase;
        synchronized (this) {
            ManifestHelper.isDebugEnabled();
            this.openedConnections++;
            readableDatabase = super.getReadableDatabase();
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        SugarDbConfiguration dbConfiguration = SugarContext.getDbConfiguration();
        if (dbConfiguration != null) {
            sQLiteDatabase.setLocale(dbConfiguration.getDatabaseLocale());
            sQLiteDatabase.setMaximumSize(dbConfiguration.getMaxSize().longValue());
            sQLiteDatabase.setPageSize(dbConfiguration.getPageSize().longValue());
        }
        super.onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.schemaGenerator.createDatabase(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
