package ivas.gov.bisp.enumeration.p066cl;

import android.database.sqlite.SQLiteProgram;
import ivas.gov.bisp.enumeration.K.J;

/* JADX INFO: loaded from: classes.dex */
public class r implements J {
    private static int a = 1;
    private static int b;
    public final SQLiteProgram c;

    public r(SQLiteProgram sQLiteProgram) {
        this.c = sQLiteProgram;
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindBlob(int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 105) + (i3 | 105);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.bindBlob(i, bArr);
            throw null;
        }
        this.c.bindBlob(i, bArr);
        int i5 = a;
        int i6 = (((i5 | 100) << 1) - (i5 ^ 100)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindDouble(int i, double d) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 103) << 1) - (i3 ^ 103);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.bindDouble(i, d);
        if (i5 == 0) {
            int i6 = 4 / 0;
        }
        int i7 = b;
        int i8 = i7 & 23;
        int i9 = i8 + ((i7 ^ 23) | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindLong(int i, long j) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-84)) | ((~i3) & 83);
        int i5 = -(-((i3 & 83) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.c.bindLong(i, j);
        if (i7 == 0) {
            int i8 = 8 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindNull(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 23) + (i3 | 23);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.bindNull(i);
        if (i5 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.K.J
    public void bindString(int i, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 23;
        int i5 = i4 + ((i3 ^ 23) | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.bindString(i, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c.bindString(i, str);
        int i6 = b;
        int i7 = (i6 & 17) + (i6 | 17);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = ((i2 | 29) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.close();
        if (i5 == 0) {
            int i6 = 34 / 0;
        }
    }
}
