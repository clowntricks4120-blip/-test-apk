package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final long d;
    public final int e;
    public final int f;

    public static abstract class bCP<T extends bCP> {
        private static int a = 0;
        private static int b = 1;
        public final int c;
        public int d = 0;
        public long e = 0;
        public int f = 0;

        public bCP(int i) {
            this.c = i;
        }

        public abstract T c();

        public T d(int i) {
            int i2 = 2 % 2;
            int i3 = a + 107;
            b = i3 % 128;
            int i4 = i3 % 2;
            this.f = i;
            T t = (T) c();
            int i5 = a;
            int i6 = i5 ^ 59;
            int i7 = ((i5 & 59) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return t;
        }

        public T e(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 ^ 101) + ((i3 & 101) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            this.d = i;
            T t = (T) c();
            int i6 = b;
            int i7 = (i6 & (-24)) | ((~i6) & 23);
            int i8 = -(-((i6 & 23) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return t;
        }

        public T f(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 45;
            int i4 = -(-(i2 | 45));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            this.e = j;
            T t = (T) c();
            int i7 = a;
            int i8 = i7 & 123;
            int i9 = (i7 | 123) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return t;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public x(bCP bcp) {
        this.c = bcp.d;
        this.d = bcp.e;
        this.e = bcp.c;
        this.f = bcp.f;
    }

    public byte[] c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = -(-(i2 | 73));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = new byte[32];
        h.i(this.c, bArr, 0);
        int i7 = a;
        int i8 = ((i7 | 55) << 1) - (i7 ^ 55);
        b = i8 % 128;
        int i9 = i8 % 2;
        h.l(this.d, bArr, 4);
        int i10 = this.e;
        int i11 = b;
        int i12 = i11 & 103;
        int i13 = i12 + ((i11 ^ 103) | i12);
        a = i13 % 128;
        int i14 = i13 % 2;
        h.i(i10, bArr, 12);
        h.i(this.f, bArr, 28);
        int i15 = a;
        int i16 = (i15 & (-98)) | ((~i15) & 97);
        int i17 = (i15 & 97) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        int i19 = i18 % 128;
        b = i19;
        int i20 = i18 % 2;
        int i21 = i19 ^ 7;
        int i22 = (i19 & 7) << 1;
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        return bArr;
    }
}
