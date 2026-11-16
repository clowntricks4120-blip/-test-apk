package ivas.gov.bisp.enumeration.cT;

/* JADX INFO: loaded from: classes.dex */
public class A {
    private static int a = 1;
    private static int b;
    public final R[] c;
    public bGz[] d = new bGz[16];

    public static class bGz {
        public final Class<?> a;
        public final R b;

        public bGz(Class<?> cls, R r) {
            this.a = cls;
            this.b = r;
        }
    }

    public A(R[] rArr) {
        this.c = rArr;
    }

    public A c(int i, R[] rArr) {
        R[] rArr2;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-108)) | ((~i4) & 107);
        int i6 = (i4 & 107) << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        R[] rArr3 = this.c;
        int length = rArr3.length;
        if (i >= length) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = (i4 | 61) << 1;
        int i10 = -(i4 ^ 61);
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        int i12 = i11 % 128;
        a = i12;
        int i13 = 0;
        if (i11 % 2 == 0) {
            int i14 = (length << 1) - length;
            rArr2 = new R[(i14 ^ (-1)) + (i14 << 1)];
            i2 = 1;
        } else {
            rArr2 = new R[(~length) + (length << 1)];
            i2 = 0;
        }
        int i15 = i12 + 61;
        b = i15 % 128;
        int i16 = i15 % 2;
        while (i2 < length) {
            int i17 = a;
            int i18 = (i17 ^ 121) + ((i17 & 121) << 1);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            if (i2 != i) {
                int i19 = (-2) - (((i17 ^ 94) + ((i17 & 94) << 1)) ^ (-1));
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    rArr2[i13] = rArr3[i2];
                    i13 >>= 1;
                } else {
                    rArr2[i13] = rArr3[i2];
                    i13 = (i13 | 1) + (i13 & 1);
                }
            }
            i2++;
            int i20 = i17 & 29;
            int i21 = (i20 - (~(-(-((i17 ^ 29) | i20))))) - 1;
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        A a2 = new A(rArr2);
        int i23 = a;
        int i24 = (i23 ^ 11) + ((i23 & 11) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        return a2;
    }
}
