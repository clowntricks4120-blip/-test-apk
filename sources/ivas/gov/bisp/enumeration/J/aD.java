package ivas.gov.bisp.enumeration.J;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class aD extends aC {
    private static int a = 1;
    private static int b;

    public /* synthetic */ aD(aI aIVar) {
        super(aIVar);
    }

    public abstract void h(SupportSQLiteStatement supportSQLiteStatement, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.sqlite.db.SupportSQLiteStatement, int] */
    public void g(Iterable iterable) {
        int i = 2 % 2;
        int i2 = b;
        ?? r2 = (i2 | 43) << 1;
        int i3 = -(((~i2) & 43) | (i2 & (-44)));
        int i4 = ((r2 | i3) << 1) - (i3 ^ r2);
        a = i4 % 128;
        Object obj = null;
        try {
            if (i4 % 2 == 0) {
                c();
                iterable.iterator();
                obj.hashCode();
                throw null;
            }
            SupportSQLiteStatement supportSQLiteStatementC = c();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int i5 = a;
                int i6 = i5 & 17;
                int i7 = (i6 - (~((i5 ^ 17) | i6))) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    h(supportSQLiteStatementC, it.next());
                    throw null;
                }
                h(supportSQLiteStatementC, it.next());
                supportSQLiteStatementC.executeInsert();
                int i8 = b;
                int i9 = (-2) - (((i8 ^ 72) + ((i8 & 72) << 1)) ^ (-1));
                a = i9 % 128;
                int i10 = i9 % 2;
            }
            f(supportSQLiteStatementC);
            int i11 = b;
            int i12 = (i11 & 125) + (i11 | 125);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            f(r2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.sqlite.db.SupportSQLiteStatement] */
    public void i(Object obj) {
        SupportSQLiteStatement supportSQLiteStatementC;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        ?? r2 = i3 ^ 39;
        int i4 = (i3 & 39) << 1;
        int i5 = (r2 ^ i4) + ((i4 & r2) << 1);
        b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                supportSQLiteStatementC = c();
                h(supportSQLiteStatementC, obj);
                int i6 = 88 / 0;
            } else {
                supportSQLiteStatementC = c();
                h(supportSQLiteStatementC, obj);
            }
            int i7 = b + 29;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                supportSQLiteStatementC.executeInsert();
                int i8 = 47 / 0;
                if (supportSQLiteStatementC == this.e) {
                    int i9 = a;
                    int i10 = i9 ^ 119;
                    i = (((i9 & 119) | i10) << 1) - i10;
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.c.set(true);
                    } else {
                        this.c.set(false);
                    }
                }
            } else {
                supportSQLiteStatementC.executeInsert();
                if (supportSQLiteStatementC == this.e) {
                    int i11 = a;
                    int i12 = i11 ^ 119;
                    i = (((i11 & 119) | i12) << 1) - i12;
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.c.set(true);
                    } else {
                        this.c.set(false);
                    }
                }
            }
            int i13 = a;
            int i14 = (i13 & 125) + (i13 | 125);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            f(r2);
            throw th;
        }
    }

    public long j(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = ((i2 ^ 85) | i3) << 1;
        int i5 = -((i2 | 85) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        SupportSQLiteStatement supportSQLiteStatementC = c();
        try {
            h(supportSQLiteStatementC, obj);
            int i8 = b;
            int i9 = (((i8 | 98) << 1) - (i8 ^ 98)) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            long jExecuteInsert = supportSQLiteStatementC.executeInsert();
            if (supportSQLiteStatementC == this.e) {
                int i11 = a;
                int i12 = ((i11 & 20) + (i11 | 20)) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
                this.c.set(false);
                int i14 = b;
                int i15 = (i14 & (-48)) | ((~i14) & 47);
                int i16 = -(-((i14 & 47) << 1));
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = b + 83;
            a = i19 % 128;
            int i20 = i19 % 2;
            return jExecuteInsert;
        } catch (Throwable th) {
            f(supportSQLiteStatementC);
            throw th;
        }
    }
}
