package ivas.gov.bisp.enumeration.J;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class aC {
    private static int a = 0;
    private static int b = 1;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final aI d;
    public volatile SupportSQLiteStatement e;

    public aC(aI aIVar) {
        this.d = aIVar;
    }

    public abstract String e();

    public void f(SupportSQLiteStatement supportSQLiteStatement) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 6) + ((i2 & 6) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (supportSQLiteStatement == this.e) {
            this.c.set(false);
            int i5 = a;
            int i6 = ((i5 | 63) << 1) - (i5 ^ 63);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b;
        int i9 = ((i8 & 75) - (~(-(-(i8 | 75))))) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 76 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0051  */
    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x0097  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    public SupportSQLiteStatement c() {
        SupportSQLiteStatement supportSQLiteStatementD;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-2)) | ((~i3) & 1);
        int i5 = (i3 & 1) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.d.d();
            if (!(!this.c.compareAndSet(false, false))) {
                if (this.e == null) {
                    int i7 = b;
                    int i8 = ((((i7 ^ 91) | (i7 & 91)) << 1) - (~(-(((~i7) & 91) | (i7 & (-92)))))) - 1;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    this.e = d();
                    int i10 = b;
                    int i11 = i10 ^ 41;
                    int i12 = -(-((i10 & 41) << 1));
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                }
                supportSQLiteStatementD = this.e;
                int i15 = b;
                i = (i15 ^ 75) + ((i15 & 75) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i16 = 2 % 5;
                }
            } else {
                supportSQLiteStatementD = d();
                int i17 = b;
                int i18 = (i17 | 49) << 1;
                int i19 = -(((~i17) & 49) | (i17 & (-50)));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
            }
        } else {
            this.d.d();
            if (!this.c.compareAndSet(false, true)) {
                supportSQLiteStatementD = d();
                int i110 = b;
                int i111 = (i110 | 49) << 1;
                int i112 = -(((~i110) & 49) | (i110 & (-50)));
                int i22 = (i111 ^ i112) + ((i112 & i111) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
            } else {
                if (this.e == null) {
                    int i24 = b;
                    int i25 = ((((i24 ^ 91) | (i24 & 91)) << 1) - (~(-(((~i24) & 91) | (i24 & (-92)))))) - 1;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    this.e = d();
                    int i113 = b;
                    int i114 = i113 ^ 41;
                    int i115 = -(-((i113 & 41) << 1));
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    a = i116 % 128;
                    int i117 = i116 % 2;
                }
                supportSQLiteStatementD = this.e;
                int i118 = b;
                i = (i118 ^ 75) + ((i118 & 75) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i119 = 2 % 5;
                }
            }
        }
        int i27 = b;
        int i28 = ((i27 | 37) << 1) - (i27 ^ 37);
        a = i28 % 128;
        int i29 = i28 % 2;
        return supportSQLiteStatementD;
    }

    public final SupportSQLiteStatement d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String strE = e();
        aI aIVar = this.d;
        aIVar.d();
        int i5 = a;
        int i6 = (i5 & 71) + (i5 | 71);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            aIVar.e();
            aIVar.f.getWritableDatabase();
            obj.hashCode();
            throw null;
        }
        aIVar.e();
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = aIVar.f.getWritableDatabase().compileStatement(strE);
        int i7 = a;
        int i8 = i7 | 71;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 71)) & i8);
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return supportSQLiteStatementCompileStatement;
        }
        throw null;
    }
}
