package ivas.gov.bisp.enumeration.p066cl;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j implements SupportSQLiteDatabase {
    private static int a = 0;
    public final SQLiteDatabase d;
    public static final String[] c = new String[0];
    private static int b = 43 % 128;

    public class bAX implements SQLiteDatabase.CursorFactory {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ SupportSQLiteQuery c;

        public bAX(j jVar, SupportSQLiteQuery supportSQLiteQuery) {
            this.c = supportSQLiteQuery;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            int i = 2 % 2;
            this.c.e(new r(sQLiteQuery));
            SQLiteCursor sQLiteCursor = new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            int i2 = a;
            int i3 = (i2 & 121) + (i2 | 121);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return sQLiteCursor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class bAY implements SQLiteDatabase.CursorFactory {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ SupportSQLiteQuery c;

        public bAY(j jVar, SupportSQLiteQuery supportSQLiteQuery) {
            this.c = supportSQLiteQuery;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            int i = 2 % 2;
            this.c.e(new r(sQLiteQuery));
            SQLiteCursor sQLiteCursor = new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            int i2 = a;
            int i3 = i2 & 31;
            int i4 = -(-((i2 ^ 31) | i3));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return sQLiteCursor;
            }
            throw null;
        }
    }

    static {
        if (43 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public j(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = (i2 & 113) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d.beginTransaction();
        int i7 = a;
        int i8 = ((i7 ^ 115) | (i7 & 115)) << 1;
        int i9 = -(((~i7) & 115) | (i7 & (-116)));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<Pair<String, String>> c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        List<Pair<String, String>> attachedDbs = this.d.getAttachedDbs();
        int i7 = a;
        int i8 = i7 & 11;
        int i9 = (((i7 | 11) & (~i8)) - (~(i8 << 1))) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 21 / 0;
        }
        return attachedDbs;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-38)) | ((~i2) & 37)) + ((i2 & 37) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.d.close();
        int i5 = b + 77;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String str) {
        int i = 2 % 2;
        e eVar = new e(this.d.compileStatement(str));
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = -(-((i2 ^ 63) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String d() {
        int i = 2 % 2;
        int i2 = a + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        String path = this.d.getPath();
        int i4 = b;
        int i5 = (i4 & 49) + (i4 | 49);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return path;
        }
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 125;
        int i4 = (i3 << 1) - ((~(i2 & 125)) & i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.d.endTransaction();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.d.endTransaction();
        int i5 = a;
        int i6 = (i5 & 59) + (i5 | 59);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 19 / 0;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String str) {
        int i = 2 % 2;
        int i2 = a + 67;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.d.execSQL(str);
        int i4 = a;
        int i5 = i4 & 75;
        int i6 = (i4 ^ 75) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 31 / 0;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        int i = 2 % 2;
        int i2 = a + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zInTransaction = this.d.inTransaction();
        int i4 = b;
        int i5 = (i4 & (-120)) | ((~i4) & 119);
        int i6 = -(-((i4 & 119) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return zInTransaction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        int i = 2 % 2;
        int i2 = b + 71;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOpen = this.d.isOpen();
        int i4 = b + 113;
        a = i4 % 128;
        int i5 = i4 % 2;
        return zIsOpen;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String str) {
        int i = 2 % 2;
        Cursor cursorQuery = query(new C0321u(str));
        int i2 = b;
        int i3 = (-2) - ((((i2 | 110) << 1) - (i2 ^ 110)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return cursorQuery;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        int i = 2 % 2;
        int i2 = b + 75;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.d.setTransactionSuccessful();
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        String strC;
        String[] strArr;
        int i = 2 % 2;
        SQLiteDatabase sQLiteDatabase = this.d;
        bAX bax = new bAX(this, supportSQLiteQuery);
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = ((((i2 ^ 33) | i3) << 1) - (~(-((i2 | 33) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            strC = supportSQLiteQuery.c();
            strArr = c;
            int i5 = 98 / 0;
        } else {
            strC = supportSQLiteQuery.c();
            strArr = c;
        }
        int i6 = a;
        int i7 = i6 & 103;
        int i8 = i7 + ((i6 ^ 103) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(bax, strC, strArr, null);
        int i10 = b;
        int i11 = i10 & 33;
        int i12 = ((i10 ^ 33) | i11) << 1;
        int i13 = -((i10 | 33) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        int i = 2 % 2;
        SQLiteDatabase sQLiteDatabase = this.d;
        bAY bay = new bAY(this, supportSQLiteQuery);
        int i2 = b;
        int i3 = ((i2 & (-72)) | ((~i2) & 71)) + ((i2 & 71) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        String strC = supportSQLiteQuery.c();
        String[] strArr = c;
        int i5 = a;
        int i6 = i5 & 113;
        int i7 = -(-((i5 ^ 113) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(bay, strC, strArr, null, cancellationSignal);
        int i10 = a;
        int i11 = (((i10 ^ 13) | (i10 & 13)) << 1) - (((~i10) & 13) | (i10 & (-14)));
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return cursorRawQueryWithFactory;
        }
        throw null;
    }
}
