package ivas.gov.bisp.enumeration.cK;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static int a = 1;
    private static int b;

    static {
        BigInteger.valueOf(0L);
        BigInteger.valueOf(1L);
        BigInteger.valueOf(2L);
        int i = b;
        int i2 = i & 11;
        int i3 = (i | 11) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        BigInteger.valueOf(4L);
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int b(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 23) + ((i3 & 23) << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            int i6 = i5 & 115;
            int i7 = (~i6) & (i5 | 115);
            int i8 = i6 << 1;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return 1;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = 0;
        if (i < 0) {
            int i11 = (i3 & 53) + (i3 | 53);
            a = i11 % 128;
            i = -i;
            if (i11 % 2 == 0) {
                int i12 = 51 / 0;
            }
            int i13 = ((i3 ^ 61) | (i3 & 61)) << 1;
            int i14 = -(((~i3) & 61) | (i3 & (-62)));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = i17 ^ 75;
        int i19 = ((i17 & 75) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 & i20) + (i19 | i20);
        b = i21 % 128;
        int i22 = i21 % 2;
        while (i > 0) {
            int i23 = a;
            int i24 = (((i23 | 12) << 1) - (i23 ^ 12)) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = i10 & 1;
            i10 = (i26 - (~(-(-((i10 ^ 1) | i26))))) - 1;
            i >>>= 8;
            int i27 = ((i23 ^ 39) | (i23 & 39)) << 1;
            int i28 = -(((~i23) & 39) | (i23 & (-40)));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            b = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 3 % 2;
            }
        }
        int i31 = a;
        int i32 = ((i31 | 59) << 1) - (i31 ^ 59);
        b = i32 % 128;
        int i33 = i32 % 2;
        return i10;
    }
}
