package ivas.gov.bisp.enumeration.p066cl;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public class e extends r implements SupportSQLiteStatement {
    private static int a = 0;
    private static int b = 1;
    public final SQLiteStatement d;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.d = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = i3 + ((i2 ^ 27) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        long jExecuteInsert = this.d.executeInsert();
        int i6 = a;
        int i7 = (i6 | 41) << 1;
        int i8 = -(i6 ^ 41);
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return jExecuteInsert;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        int i = 2 % 2;
        int i2 = b + 14;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.executeUpdateDelete();
            throw null;
        }
        int iExecuteUpdateDelete = this.d.executeUpdateDelete();
        int i4 = a + 111;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return iExecuteUpdateDelete;
        }
        throw null;
    }
}
