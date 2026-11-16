package ivas.gov.bisp.enumeration.F;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends Writer {
    private static int a = 1;
    private static int b;
    public StringBuilder c = new StringBuilder(128);

    public ad(String str) {
    }

    public final void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = ((i2 | 99) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.length();
            throw null;
        }
        if (this.c.length() > 0) {
            StringBuilder sb = this.c;
            int i5 = b;
            int i6 = i5 & 79;
            int i7 = (i5 ^ 79) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                sb.delete(1, sb.length());
            } else {
                sb.delete(0, sb.length());
            }
            int i9 = a;
            int i10 = i9 & 77;
            int i11 = (i9 ^ 77) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = a;
        int i15 = (i14 & (-6)) | ((~i14) & 5);
        int i16 = (i14 & 5) << 1;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        b = i17 % 128;
        int i18 = i17 % 2;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 45) | (i2 & 45)) << 1) - (~(-(((~i2) & 45) | (i2 & (-46)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        c();
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = b;
        int i6 = i5 ^ 107;
        int i7 = ((i5 & 107) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 124) << 1) - (i2 ^ 124);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        c();
        if (i5 == 0) {
            throw null;
        }
        int i6 = a;
        int i7 = (i6 ^ 26) + ((i6 & 26) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 115;
        int i6 = ((i4 | 115) & (~i5)) + (i5 << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 125;
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < i2) {
            int i12 = b;
            int i13 = ((i12 | 31) << 1) - (i12 ^ 31);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = -(~i11);
            char c = cArr[(((i | i15) << 1) - (i15 ^ i)) - 1];
            if (c == '\n') {
                int i16 = i12 + 72;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    c();
                    int i18 = 97 / 0;
                } else {
                    c();
                }
            } else {
                this.c.append(c);
                int i19 = a;
                int i20 = ((i19 ^ 53) | (i19 & 53)) << 1;
                int i21 = -(((~i19) & 53) | (i19 & (-54)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
            }
            i11 = ((i11 ^ 2) + ((i11 & 2) << 1)) - 1;
            int i24 = a;
            int i25 = i24 & 61;
            int i26 = -(-(i24 | 61));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = a;
        int i30 = i29 & 81;
        int i31 = (((i29 | 81) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
        b = i31 % 128;
        if (i31 % 2 != 0) {
            throw null;
        }
    }
}
