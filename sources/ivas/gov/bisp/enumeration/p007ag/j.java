package ivas.gov.bisp.enumeration.p007ag;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 0;
    private static int b = 1;

    static {
        int i = 1 & 101;
        int i2 = i + ((1 ^ 101) | i);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = ((i7 ^ 100) + ((i7 & 100) << 1)) - 1;
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 == 0) {
            throw null;
        }
        if (i5 == 0) {
            int i10 = ((i9 & (-14)) | ((~i9) & 13)) + ((i9 & 13) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 & 67;
            int i13 = -(-((i9 ^ 67) | i12));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            return 0;
        }
        int i16 = -(~(-i2));
        int i17 = (((i16 ^ 255) + ((i16 & 255) << 1)) - 1) * i3 * i4;
        int i18 = i9 & 117;
        int i19 = i9 | 117;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        int i22 = -(-(i * 255 * i2));
        int i23 = ((((i17 ^ i22) | (i17 & i22)) << 1) - ((i22 & (~i17)) | ((~i22) & i17))) / (i5 * 255);
        int i24 = ((i9 | 7) << 1) - (i9 ^ 7);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 37 / 0;
        }
        return i23;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    public static int e(int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 & (-122)) | ((~i6) & 121)) + ((i6 & 121) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (i >= i2) {
            int i9 = (i6 & 87) + (i6 | 87);
            int i10 = i9 % 128;
            b = i10;
            if (i9 % 2 == 0) {
                int i11 = 54 / 0;
                if (i > i3) {
                    int i12 = i10 & 75;
                    int i13 = -(-((i10 ^ 75) | i12));
                    int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                    int i15 = i14 % 128;
                    a = i15;
                    int i16 = i14 % 2;
                    int i17 = i15 & 25;
                    int i18 = (i15 | 25) & (~i17);
                    int i19 = i17 << 1;
                    i4 = ((i18 | i19) << 1) - (i18 ^ i19);
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i20 = 3 / 2;
                    }
                    i = i3;
                }
            } else if (i > i3) {
                int i110 = i10 & 75;
                int i111 = -(-((i10 ^ 75) | i110));
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                int i113 = i112 % 128;
                a = i113;
                int i114 = i112 % 2;
                int i115 = i113 & 25;
                int i116 = (i113 | 25) & (~i115);
                int i117 = i115 << 1;
                i4 = ((i116 | i117) << 1) - (i116 ^ i117);
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i21 = 3 / 2;
                }
                i = i3;
            }
        } else {
            i = i2;
        }
        int i22 = b;
        int i23 = i22 & 99;
        int i24 = -(-((i22 ^ 99) | i23));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        return i;
    }

    public static int f(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 & (-52)) | ((~i5) & 51);
        int i7 = -(-((i5 & 51) << 1));
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        if (i2 >= 0) {
            int i10 = i5 & 49;
            int i11 = -(-((i5 ^ 49) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            if (i2 <= 255) {
                int i15 = i13 | 85;
                int i16 = i15 << 1;
                int i17 = -(i15 & (~(i13 & 85)));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i & 16777215;
                if (i18 % 2 == 0) {
                    i3 = i19 & (i2 >>> 114);
                } else {
                    int i20 = i2 << 24;
                    int i21 = i19 & i20;
                    i3 = ((i19 | i20) & (~i21)) | i21;
                }
                int i22 = i13 & 1;
                int i23 = i22 + ((i13 ^ 1) | i22);
                b = i23 % 128;
                int i24 = i23 % 2;
                return i3;
            }
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int b(double d, double d2, double d3) {
        double dPow;
        double dPow2;
        double d4;
        int iE;
        double d5;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 31;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 31)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        double d6 = i6 % 2 != 0 ? (-0.4986d) / d3 : (-0.4986d) * d3;
        int i7 = ((i2 | 9) << 1) - (i2 ^ 9);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        double d7 = (d6 + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        int i10 = i8 + 101;
        b = i10 % 128;
        double d8 = i10 % 2 == 0 ? (0.0415d - d3) * ((1.8758d % d2) / ((-0.9689d) / d)) : (0.0415d * d3) + (1.8758d * d2) + ((-0.9689d) * d);
        int i11 = ((i8 | 13) << 1) - (i8 ^ 13);
        b = i11 % 128;
        int i12 = i11 % 2;
        double d9 = d8 / 100.0d;
        double d10 = 1.057d * d3;
        double d11 = (-0.204d) * d2;
        int i13 = i8 & 101;
        int i14 = ((i8 ^ 101) | i13) << 1;
        int i15 = -((~i13) & (i8 | 101));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        b = i16 % 128;
        double d12 = (i16 % 2 == 0 ? d10 / (d11 + (d + 0.0557d)) : d10 + (d11 + (d * 0.0557d))) / 100.0d;
        if (d7 > 0.0031308d) {
            int i17 = i8 + 41;
            b = i17 % 128;
            dPow = (i17 % 2 == 0 ? Math.pow(d7, 0.4166666666666667d) / 1.055d : Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
            int i18 = b;
            int i19 = i18 & 103;
            int i20 = ((i18 ^ 103) | i19) << 1;
            int i21 = -((i18 | 103) & (~i19));
            int i22 = (i20 & i21) + (i21 | i20);
            a = i22 % 128;
            int i23 = i22 % 2;
        } else {
            dPow = d7 * 12.92d;
            int i24 = i8 ^ 21;
            int i25 = ((i8 & 21) | i24) << 1;
            int i26 = -i24;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        if (d9 > 0.0031308d) {
            int i29 = b + 30;
            int i30 = (i29 ^ (-1)) + (i29 << 1);
            a = i30 % 128;
            int i31 = i30 % 2;
            dPow2 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
            int i32 = a;
            int i33 = ((i32 | 101) << 1) - (i32 ^ 101);
            b = i33 % 128;
            int i34 = i33 % 2;
        } else {
            dPow2 = d9 * 12.92d;
            int i35 = b;
            int i36 = i35 & 17;
            int i37 = (((i35 ^ 17) | i36) << 1) - ((i35 | 17) & (~i36));
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        if (d12 > 0.0031308d) {
            int i39 = a;
            int i40 = (i39 & 61) + (i39 | 61);
            b = i40 % 128;
            if (i40 % 2 == 0) {
                Math.pow(d12, 0.4166666666666667d);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            double dPow3 = Math.pow(d12, 0.4166666666666667d);
            int i41 = b;
            int i42 = ((i41 ^ 56) + ((i41 & 56) << 1)) - 1;
            a = i42 % 128;
            int i43 = i42 % 2;
            d4 = (dPow3 * 1.055d) - 0.055d;
            int i44 = (-2) - ((((i41 | 124) << 1) - (i41 ^ 124)) ^ (-1));
            a = i44 % 128;
            int i45 = i44 % 2;
        } else {
            d4 = d12 * 12.92d;
            int i46 = b;
            int i47 = (i46 & 45) + (i46 | 45);
            a = i47 % 128;
            int i48 = i47 % 2;
        }
        int iRound = (int) Math.round(dPow * 255.0d);
        int i49 = b;
        int i50 = (((i49 & (-92)) | ((~i49) & 91)) - (~((i49 & 91) << 1))) - 1;
        a = i50 % 128;
        if (i50 % 2 != 0) {
            iE = e(iRound, 0, 255);
            d5 = dPow2 - 255.0d;
        } else {
            iE = e(iRound, 0, 255);
            d5 = dPow2 * 255.0d;
        }
        int iRound2 = (int) Math.round(d5);
        int i51 = b;
        int i52 = i51 & 89;
        int i53 = i52 + ((i51 ^ 89) | i52);
        a = i53 % 128;
        int iE2 = i53 % 2 != 0 ? e(iRound2, 0, 7093) : e(iRound2, 0, 255);
        int iE3 = e((int) Math.round(d4 * 255.0d), 0, 255);
        int i54 = b;
        int i55 = (-2) - (((i54 & 126) + (i54 | 126)) ^ (-1));
        a = i55 % 128;
        int i56 = i55 % 2;
        int iRgb = Color.rgb(iE, iE2, iE3);
        int i57 = a;
        int i58 = ((i57 ^ 32) + ((i57 & 32) << 1)) - 1;
        b = i58 % 128;
        if (i58 % 2 == 0) {
            int i59 = 25 / 0;
        }
        return iRgb;
    }

    public static int c(int i, int i2) {
        int i3;
        int iBlue;
        int iBlue2;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 71;
        int i7 = (i6 - (~(-(-((i5 ^ 71) | i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i9 = a;
        int i10 = ((i9 | 101) << 1) - (i9 ^ 101);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            i3 = 255 >>> (((255 % iAlpha2) / (4352 >>> iAlpha)) << 18353);
        } else {
            int i11 = -iAlpha2;
            int i12 = i11 & 255;
            int i13 = i12 + ((i11 ^ 255) | i12);
            int i14 = -iAlpha;
            int i15 = i14 & 255;
            int i16 = -(~(-((i13 * (i15 + ((i14 ^ 255) | i15))) / 255)));
            int i17 = (i16 & 255) + (255 | i16);
            i3 = (i17 ^ (-1)) + (i17 << 1);
        }
        int iRed = Color.red(i);
        int iRed2 = Color.red(i2);
        int i18 = a + 17;
        b = i18 % 128;
        int i19 = i18 % 2;
        int iD = d(iRed, iAlpha2, iRed2, iAlpha, i3);
        int iGreen = Color.green(i);
        int i20 = a;
        int i21 = ((i20 ^ 1) | (i20 & 1)) << 1;
        int i22 = -(((~i20) & 1) | (i20 & (-2)));
        int i23 = (i21 & i22) + (i22 | i21);
        b = i23 % 128;
        int i24 = i23 % 2;
        int iD2 = d(iGreen, iAlpha2, Color.green(i2), iAlpha, i3);
        int i25 = a + 38;
        int i26 = (i25 ^ (-1)) + (i25 << 1);
        b = i26 % 128;
        if (i26 % 2 == 0) {
            iBlue = Color.blue(i);
            iBlue2 = Color.blue(i2);
            int i27 = 7 / 0;
        } else {
            iBlue = Color.blue(i);
            iBlue2 = Color.blue(i2);
        }
        int iArgb = Color.argb(i3, iD, iD2, d(iBlue, iAlpha2, iBlue2, iAlpha, i3));
        int i28 = a;
        int i29 = i28 & 23;
        int i30 = ((i28 | 23) & (~i29)) + (i29 << 1);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            return iArgb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
