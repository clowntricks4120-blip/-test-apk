package ivas.gov.bisp.enumeration.p002ab;

import android.graphics.Color;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.p007ag.j;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ab.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0085o {
    private static int a = 0;
    private static int b = 1;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public C0085o(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f7;
        this.h = f8;
        this.g = f9;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[PHI: r11
  0x0043: PHI (r11v25 double) = (r11v24 double), (r11v29 double) binds: [B:10:0x0041, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    public int e(T t) {
        float f;
        double d;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 | 107;
        int i5 = (i4 << 1) - ((~(i3 & 107)) & i4);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        float f2 = this.d;
        if (f2 != 0.0d) {
            int i8 = (-2) - (((i6 ^ 34) + ((i6 & 34) << 1)) ^ (-1));
            int i9 = i8 % 128;
            b = i9;
            if (i8 % 2 == 0) {
                d = this.e;
                if (d != 0.0d) {
                    int i10 = i9 + 33;
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    double dSqrt = Math.sqrt(d / 100.0d);
                    int i12 = b + 41;
                    int i13 = i12 % 128;
                    a = i13;
                    int i14 = i12 % 2;
                    f = f2 / ((float) dSqrt);
                    int i15 = i13 & 47;
                    i = ((i13 | 47) & (~i15)) + (i15 << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i16 = 3 / 5;
                    }
                } else {
                    int i17 = b;
                    int i18 = ((i17 | 11) << 1) - (i17 ^ 11);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    f = 0.0f;
                }
            } else {
                d = this.e;
                if (d != 0.0d) {
                    int i110 = i9 + 33;
                    a = i110 % 128;
                    int i111 = i110 % 2;
                    double dSqrt2 = Math.sqrt(d / 100.0d);
                    int i112 = b + 41;
                    int i113 = i112 % 128;
                    a = i113;
                    int i114 = i112 % 2;
                    f = f2 / ((float) dSqrt2);
                    int i115 = i113 & 47;
                    i = ((i113 | 47) & (~i115)) + (i115 << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        int i116 = 3 / 5;
                    }
                } else {
                    int i117 = b;
                    int i118 = ((i117 | 11) << 1) - (i117 ^ 11);
                    a = i118 % 128;
                    int i119 = i118 % 2;
                    f = 0.0f;
                }
            }
        } else {
            int i1110 = b;
            int i1111 = ((i1110 | 11) << 1) - (i1110 ^ 11);
            a = i1111 % 128;
            int i1112 = i1111 % 2;
            f = 0.0f;
        }
        float fPow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, t.i), 0.73d), 1.1111111111111112d);
        double d2 = (this.c * 3.1415927f) / 180.0f;
        float fCos = (float) (Math.cos(2.0d + d2) + 3.8d);
        float f3 = t.e;
        float f4 = this.e;
        int i20 = b;
        int i21 = i20 & 47;
        int i22 = (((i20 ^ 47) | i21) << 1) - ((~i21) & (i20 | 47));
        a = i22 % 128;
        int i23 = i22 % 2;
        float fPow2 = (float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) t.h)) / ((double) t.m));
        float f5 = t.j;
        float f6 = t.g;
        float f7 = (f3 * fPow2) / t.f;
        float fSin = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        int i24 = b;
        int i25 = i24 & 45;
        int i26 = -(-(i24 | 45));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        int i28 = i27 % 128;
        a = i28;
        int i29 = i27 % 2;
        float f8 = (((0.305f + f7) * 23.0f) * fPow) / (((108.0f * fPow) * fSin) + (((fPow * 11.0f) * fCos2) + (((((fCos * 0.25f) * 3846.1538f) * f5) * f6) * 23.0f)));
        float f9 = fCos2 * f8;
        float f10 = f8 * fSin;
        float f11 = f7 * 460.0f;
        float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
        int i30 = ((i28 | 75) << 1) - ((i28 & (-76)) | ((~i28) & 75));
        b = i30 % 128;
        int i31 = i30 % 2;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12))));
        float fSignum = Math.signum(f12);
        float f15 = t.l;
        int i32 = b;
        int i33 = i32 ^ 101;
        int i34 = (((i32 & 101) | i33) << 1) - i33;
        a = i34 % 128;
        int i35 = i34 % 2;
        float fPow3 = (float) Math.pow(fMax, 2.380952380952381d);
        float fMax2 = (float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13))));
        float fSignum2 = Math.signum(f13);
        float f16 = 100.0f / t.l;
        float fPow4 = (float) Math.pow(fMax2, 2.380952380952381d);
        double dAbs = Math.abs(f14);
        int i36 = b;
        int i37 = i36 & 25;
        int i38 = ((~i37) & (i36 | 25)) + (i37 << 1);
        a = i38 % 128;
        int i39 = i38 % 2;
        float fMax3 = (float) Math.max(0.0d, (dAbs * 27.13d) / (400.0d - ((double) Math.abs(f14))));
        float fSignum3 = Math.signum(f14);
        float f17 = 100.0f / t.l;
        float fPow5 = (float) Math.pow(fMax3, 2.380952380952381d);
        float[] fArr = t.k;
        float f18 = (((100.0f / f15) * fSignum) * fPow3) / fArr[0];
        float f19 = ((f16 * fSignum2) * fPow4) / fArr[1];
        int i40 = b;
        int i41 = i40 & 97;
        int i42 = i41 + ((i40 ^ 97) | i41);
        a = i42 % 128;
        int i43 = i42 % 2;
        float f20 = ((fSignum3 * f17) * fPow5) / fArr[2];
        float[][] fArr2 = i.e;
        float[] fArr3 = fArr2[0];
        float f21 = fArr3[0];
        float f22 = fArr3[1];
        float f23 = fArr3[2];
        float[] fArr4 = fArr2[1];
        float f24 = fArr4[0];
        float f25 = fArr4[1];
        float f26 = fArr4[2];
        float[] fArr5 = fArr2[2];
        float f27 = fArr5[0];
        float f28 = fArr5[1];
        float f29 = fArr5[2];
        int i44 = a;
        int i45 = i44 & 35;
        int i46 = (i45 - (~((i44 ^ 35) | i45))) - 1;
        b = i46 % 128;
        int i47 = i46 % 2;
        int iB = j.b((f23 * f20) + (f22 * f19) + (f21 * f18), (f26 * f20) + (f25 * f19) + (f24 * f18), (f20 * f29) + (f19 * f28) + (f18 * f27));
        int i48 = a;
        int i49 = ((i48 & 125) - (~(i48 | 125))) - 1;
        b = i49 % 128;
        int i50 = i49 % 2;
        return iB;
    }

    public static C0085o d(float f, float f2, float f3) {
        T t;
        float f4;
        double d;
        float f5;
        double d2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            t = T.c;
            f4 = 4.0f / t.h;
            d = ((double) f) % 100.0d;
        } else {
            t = T.c;
            f4 = 4.0f / t.h;
            d = ((double) f) / 100.0d;
        }
        double dSqrt = Math.sqrt(d);
        int i4 = b;
        int i5 = (i4 & (-44)) | ((~i4) & 43);
        int i6 = (i4 & 43) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        float f6 = (float) dSqrt;
        float f7 = t.e;
        float f8 = t.d;
        float f9 = f2 * f8;
        int i9 = b;
        int i10 = i9 ^ 67;
        int i11 = ((((i9 & 67) | i10) << 1) - (~(-i10))) - 1;
        a = i11 % 128;
        float fSqrt = (float) Math.sqrt((i11 % 2 != 0 ? (f2 / ((float) Math.sqrt(d))) / t.h : (f2 / ((float) Math.sqrt(d))) * t.h) / (t.e + 4.0f));
        float f10 = (3.1415927f * f3) / 180.0f;
        float f11 = 1.7f * f;
        int i12 = a;
        int i13 = ((i12 & (-64)) | ((~i12) & 63)) + ((i12 & 63) << 1);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            f5 = f11 / ((0.007f % f) + 0.0f);
            d2 = (((double) f9) + 0.0228d) - 1.0d;
        } else {
            f5 = f11 / ((0.007f * f) + 1.0f);
            d2 = (((double) f9) * 0.0228d) + 1.0d;
        }
        float fLog = ((float) Math.log(d2)) * 43.85965f;
        double d3 = f10;
        C0085o c0085o = new C0085o(f3, f2, f, (f7 + 4.0f) * f4 * f6 * f8, f9, fSqrt * 50.0f, f5, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
        int i14 = b + 43;
        a = i14 % 128;
        int i15 = i14 % 2;
        return c0085o;
    }

    public static C0085o c(int i) {
        float f;
        float f2;
        float f3;
        double d;
        float f4;
        float f5;
        double dSqrt;
        float f6;
        float f7;
        float f8;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 63;
        int i5 = ((i3 ^ 63) | i4) << 1;
        int i6 = -((i3 | 63) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        T t = T.c;
        float fO = i.o(Color.red(i));
        float fO2 = i.o(Color.green(i));
        float fO3 = i.o(Color.blue(i));
        float[][] fArr = i.f;
        float[] fArr2 = fArr[0];
        float f9 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f12 = fArr3[0];
        float f13 = fArr3[1];
        int i9 = b + 19;
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        float f14 = fArr3[2];
        float[] fArr4 = fArr[2];
        float f15 = fArr4[0];
        float f16 = fArr4[1];
        float f17 = fO3 * fArr4[2];
        int i12 = (-2) - (((i10 & 106) + (i10 | 106)) ^ (-1));
        b = i12 % 128;
        int i13 = i12 % 2;
        float[] fArr5 = {(f11 * fO3) + (f10 * fO2) + (f9 * fO), (f14 * fO3) + (f13 * fO2) + (f12 * fO), f17 + (fO2 * f16) + (fO * f15)};
        float[][] fArr6 = i.d;
        float f18 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f19 = fArr7[0];
        float f20 = fArr5[1];
        float f21 = fArr7[1];
        float f22 = fArr5[2];
        float f23 = fArr7[2];
        float[] fArr8 = fArr6[1];
        float f24 = fArr8[0];
        int i14 = (-2) - ((a + 98) ^ (-1));
        b = i14 % 128;
        int i15 = i14 % 2;
        float f25 = fArr8[1];
        float f26 = fArr8[2];
        float[] fArr9 = fArr6[2];
        float f27 = fArr9[0];
        float f28 = fArr9[1];
        float f29 = fArr9[2];
        float[] fArr10 = t.k;
        float f30 = fArr10[0];
        int i16 = b + 115;
        a = i16 % 128;
        int i17 = i16 % 2;
        float f31 = f30 * ((f23 * f22) + (f21 * f20) + (f19 * f18));
        float f32 = fArr10[1] * ((f26 * f22) + (f25 * f20) + (f24 * f18));
        float f33 = fArr10[2] * ((f22 * f29) + (f20 * f28) + (f18 * f27));
        double dAbs = ((double) (Math.abs(f31) * t.l)) / 100.0d;
        int i18 = b;
        int i19 = ((i18 ^ 103) | (i18 & 103)) << 1;
        int i20 = -(((~i18) & 103) | (i18 & (-104)));
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        float fPow = (float) Math.pow(dAbs, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f32) * t.l)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f33) * t.l)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f31) * 400.0f) * fPow) / (fPow + 27.13f);
        int i23 = b;
        int i24 = i23 & 43;
        int i25 = (i23 | 43) & (~i24);
        int i26 = -(-(i24 << 1));
        int i27 = (i25 & i26) + (i25 | i26);
        a = i27 % 128;
        int i28 = i27 % 2;
        float fSignum2 = ((Math.signum(f32) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f33) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f34 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d2)) / 11.0f;
        float f35 = (float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d));
        int i29 = b;
        int i30 = ((i29 ^ 31) | (i29 & 31)) << 1;
        int i31 = -(((~i29) & 31) | (i29 & (-32)));
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        a = i32 % 128;
        int i33 = i32 % 2;
        float f36 = f35 / 9.0f;
        float f37 = fSignum2 * 20.0f;
        float f38 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f37)) / 20.0f;
        float f39 = (((fSignum * 40.0f) + f37) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f36, f34)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            int i34 = b;
            int i35 = i34 | 39;
            int i36 = i35 << 1;
            int i37 = -((~(i34 & 39)) & i35);
            int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
            int i39 = i38 % 128;
            a = i39;
            fAtan2 = i38 % 2 != 0 ? fAtan2 - 360.0f : fAtan2 + 360.0f;
            int i40 = (i39 ^ 89) + ((i39 & 89) << 1);
            b = i40 % 128;
            int i41 = i40 % 2;
        } else if (fAtan2 >= 360.0f) {
            int i42 = b;
            int i43 = (((i42 | 94) << 1) - (i42 ^ 94)) - 1;
            a = i43 % 128;
            int i44 = i43 % 2;
            fAtan2 -= 360.0f;
            int i45 = i42 & 61;
            int i46 = i42 | 61;
            int i47 = (i45 & i46) + (i45 | i46);
            a = i47 % 128;
            int i48 = i47 % 2;
        }
        float f40 = (3.1415927f * fAtan2) / 180.0f;
        float f41 = t.f;
        int i49 = a;
        int i50 = (i49 & 61) + (i49 | 61);
        b = i50 % 128;
        double dPow = Math.pow((i50 % 2 == 0 ? f39 - f41 : f39 * f41) / t.e, t.h * t.m);
        int i51 = b;
        int i52 = i51 & 121;
        int i53 = ((((i51 ^ 121) | i52) << 1) - (~(-((i51 | 121) & (~i52))))) - 1;
        a = i53 % 128;
        if (i53 % 2 != 0) {
            f = ((float) dPow) * 100.0f;
            f2 = 4.0f - t.h;
        } else {
            f = ((float) dPow) * 100.0f;
            f2 = 4.0f / t.h;
        }
        int i54 = b;
        int i55 = (((i54 | 32) << 1) - (i54 ^ 32)) - 1;
        a = i55 % 128;
        int i56 = i55 % 2;
        float fSqrt = (float) Math.sqrt(f / 100.0f);
        float f42 = t.e;
        int i57 = b;
        int i58 = ((i57 ^ 126) + ((i57 & 126) << 1)) - 1;
        a = i58 % 128;
        if (i58 % 2 != 0) {
            int i59 = 46 / 0;
            d = fAtan2;
            f3 = t.d;
        } else {
            f3 = t.d;
            d = fAtan2;
        }
        if (d < 20.14d) {
            int i60 = b;
            int i61 = (i60 ^ 93) + ((i60 & 93) << 1);
            int i62 = i61 % 128;
            a = i62;
            int i63 = i61 % 2;
            f4 = 360.0f + fAtan2;
            int i64 = ((i62 & 88) + (i62 | 88)) - 1;
            b = i64 % 128;
            if (i64 % 2 == 0) {
                int i65 = 4 / 3;
            }
        } else {
            int i66 = b + 91;
            a = i66 % 128;
            int i67 = i66 % 2;
            f4 = fAtan2;
        }
        float fCos = (float) (Math.cos(((((double) f4) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d);
        float f43 = t.j;
        int i68 = a;
        int i69 = (i68 ^ 109) + ((i68 & 109) << 1);
        b = i69 % 128;
        if (i69 % 2 == 0) {
            f5 = (((fCos - 0.25f) * 3846.1538f) % f43) - t.g;
            dSqrt = Math.sqrt((f36 * f36) / (f34 / f34));
        } else {
            f5 = fCos * 0.25f * 3846.1538f * f43 * t.g;
            dSqrt = Math.sqrt((f36 * f36) + (f34 * f34));
        }
        float f44 = (f5 * ((float) dSqrt)) / (f38 + 0.305f);
        double dPow2 = Math.pow(1.64d - Math.pow(0.29d, t.i), 0.73d);
        int i70 = a;
        int i71 = i70 & 55;
        int i72 = ((((i70 ^ 55) | i71) << 1) - (~(-((i70 | 55) & (~i71))))) - 1;
        b = i72 % 128;
        int i73 = i72 % 2;
        float fPow4 = ((float) dPow2) * ((float) Math.pow(f44, 0.9d));
        double dSqrt2 = Math.sqrt(((double) f) / 100.0d);
        int i74 = a;
        int i75 = i74 & 31;
        int i76 = -(-((i74 ^ 31) | i75));
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        b = i77 % 128;
        if (i77 % 2 == 0) {
            f6 = ((float) dSqrt2) + fPow4;
            f7 = t.d * f6;
            f8 = (fPow4 - t.h) - (t.e % 4.0f);
        } else {
            f6 = ((float) dSqrt2) * fPow4;
            f7 = t.d * f6;
            f8 = (fPow4 * t.h) / (t.e + 4.0f);
        }
        float f45 = f7;
        float fSqrt2 = (float) Math.sqrt(f8);
        float fLog = ((float) Math.log((0.0228f * f45) + 1.0f)) * 43.85965f;
        double d3 = f40;
        C0085o c0085o = new C0085o(fAtan2, f6, f, (f42 + 4.0f) * fSqrt * f2 * f3, f45, fSqrt2 * 50.0f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
        int i78 = b;
        int i79 = (i78 | 21) << 1;
        int i80 = -(((~i78) & 21) | (i78 & (-22)));
        int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
        a = i81 % 128;
        if (i81 % 2 != 0) {
            int i82 = 94 / 0;
        }
        return c0085o;
    }
}
