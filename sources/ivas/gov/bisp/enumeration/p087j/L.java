package ivas.gov.bisp.enumeration.p087j;

/* JADX INFO: loaded from: classes.dex */
public class L {
    private static int a = 1;
    private static int b;
    public static L c;
    public long d;
    public long e;
    public int f;

    public void c(long j, double d, double d2) {
        double dSin;
        double dSin2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-46)) | ((~i2) & 45);
        int i4 = (i2 & 45) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin3 = Math.sin(d3);
        int i7 = a;
        int i8 = ((i7 & 68) + (i7 | 68)) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            dSin = Math.sin(0.0f / f2);
            dSin2 = Math.sin(f2 - 3.0f) / 5.236000106378924E-6d;
        } else {
            dSin = Math.sin(2.0f * f2);
            dSin2 = Math.sin(f2 * 3.0f) * 5.236000106378924E-6d;
        }
        int i9 = a;
        int i10 = i9 | 41;
        int i11 = ((i10 << 1) - (~(-((~(i9 & 41)) & i10)))) - 1;
        b = i11 % 128;
        double d4 = i11 % 2 != 0 ? ((dSin2 % ((dSin % 3.4906598739326E-4d) % ((dSin3 % 0.03341960161924362d) / d3))) % 1.796593063d) / 3.141592653589793d : dSin2 + (dSin * 3.4906598739326E-4d) + (dSin3 * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d2) / 360.0d;
        double dRound = Math.round(((double) (f - 9.0E-4f)) - d5) + 9.0E-4f;
        double dSin4 = Math.sin(d3);
        int i12 = b;
        int i13 = ((i12 ^ 38) + ((i12 & 38) << 1)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        double dSin5 = (Math.sin(2.0d * d4) * (-0.0069d)) + (dSin4 * 0.0053d) + dRound + d5;
        int i15 = b;
        int i16 = i15 ^ 67;
        int i17 = ((i15 & 67) | i16) << 1;
        int i18 = -i16;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        a = i19 % 128;
        int i20 = i19 % 2;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(d4));
        double d6 = 0.01745329238474369d * d;
        int i21 = a;
        int i22 = i21 & 79;
        int i23 = (i22 - (~((i21 ^ 79) | i22))) - 1;
        b = i23 % 128;
        Object obj = null;
        if (i23 % 2 != 0) {
            Math.sin(-0.10471975803375244d);
            Math.sin(d6);
            Math.sin(dAsin);
            Math.cos(d6);
            throw null;
        }
        double dSin6 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d6))) / (Math.cos(dAsin) * Math.cos(d6));
        if (dSin6 >= 1.0d) {
            int i24 = a;
            int i25 = (i24 ^ 115) + ((i24 & 115) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            this.f = 1;
            this.d = -1L;
            int i27 = ((i24 & 54) + (i24 | 54)) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
            this.e = -1L;
            int i29 = i24 & 23;
            int i30 = (i24 ^ 23) | i29;
            int i31 = (i29 & i30) + (i30 | i29);
            b = i31 % 128;
            int i32 = i31 % 2;
            return;
        }
        if (dSin6 <= -1.0d) {
            int i33 = b;
            int i34 = i33 & 29;
            int i35 = i34 + ((i33 ^ 29) | i34);
            int i36 = i35 % 128;
            a = i36;
            int i37 = i35 % 2;
            this.f = 0;
            this.d = -1L;
            int i38 = (((i36 | 104) << 1) - (i36 ^ 104)) - 1;
            b = i38 % 128;
            if (i38 % 2 == 0) {
                this.e = -1L;
                return;
            } else {
                this.e = -1L;
                obj.hashCode();
                throw null;
            }
        }
        double dAcos = (float) (Math.acos(dSin6) / 6.283185307179586d);
        int i39 = a;
        int i40 = i39 & 123;
        int i41 = (i39 | 123) & (~i40);
        int i42 = -(-(i40 << 1));
        int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
        b = i43 % 128;
        int i44 = i43 % 2;
        this.d = Math.round((dSin5 + dAcos) * 8.64E7d) + 946728000000L;
        int i45 = b;
        int i46 = ((i45 | 49) << 1) - (i45 ^ 49);
        a = i46 % 128;
        int i47 = i46 % 2;
        long jRound = Math.round((dSin5 - dAcos) * 8.64E7d) + 946728000000L;
        int i48 = b;
        int i49 = (((i48 | 74) << 1) - (i48 ^ 74)) - 1;
        int i50 = i49 % 128;
        a = i50;
        int i51 = i49 % 2;
        this.e = jRound;
        if (jRound < j) {
            int i52 = (i50 & 17) + (i50 | 17);
            b = i52 % 128;
            if (i52 % 2 != 0) {
                throw null;
            }
            if (this.d > j) {
                int i53 = (i50 & 103) + (i50 | 103);
                int i54 = i53 % 128;
                b = i54;
                int i55 = i53 % 2;
                this.f = 0;
                int i56 = i54 & 83;
                int i57 = -(-(i54 | 83));
                int i58 = (i56 & i57) + (i57 | i56);
                a = i58 % 128;
                int i59 = i58 % 2;
                return;
            }
        }
        this.f = 1;
        int i60 = i50 + 95;
        b = i60 % 128;
        if (i60 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
