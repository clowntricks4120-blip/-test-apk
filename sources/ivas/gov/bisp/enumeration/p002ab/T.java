package ivas.gov.bisp.enumeration.p002ab;

import ivas.gov.bisp.enumeration.O.i;

/* JADX INFO: loaded from: classes.dex */
public final class T {
    private static int a = 1;
    private static int b;
    public static final T c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float[] k;
    public final float l;
    public final float m;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        char c2;
        float fCbrt;
        float fT;
        double d;
        double dSqrt;
        float[] fArr;
        double d2;
        double d3;
        float f7;
        float[] fArr2 = i.g;
        float fT2 = (float) ((((double) i.t(50.0f)) * 63.66197723675813d) / 100.0d);
        float[][] fArr3 = i.d;
        int i = a;
        int i2 = i + 36;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            f = fArr2[1];
            f3 = fArr3[0][0];
            f4 = fArr2[0];
            f2 = fArr3[1][1];
        } else {
            f = fArr2[0];
            float[] fArr4 = fArr3[0];
            float f8 = fArr4[0];
            float f9 = fArr2[1];
            f2 = fArr4[1];
            f3 = f8;
            f4 = f9;
        }
        float f10 = fArr2[2];
        float f11 = (fArr3[0][2] * f10) + (f4 * f2) + (f * f3);
        int i4 = i & 81;
        int i5 = -(-((i ^ 81) | i4));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        float f12 = fArr2[0];
        float[] fArr5 = fArr3[1];
        float f13 = fArr5[0];
        float f14 = fArr2[1];
        float f15 = fArr5[1];
        int i8 = i & 51;
        int i9 = (((i ^ 51) | i8) << 1) - ((~i8) & (i | 51));
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        float f16 = (fArr5[2] * f10) + (f15 * f14) + (f13 * f12);
        int i12 = (i10 & 59) + (i10 | 59);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            c2 = 5;
            f5 = fArr3[5][0];
            f6 = fArr3[4][1];
            f10 = fArr2[5];
        } else {
            float[] fArr6 = fArr3[2];
            f5 = fArr6[0];
            f6 = fArr6[1];
            c2 = 2;
        }
        int i13 = (i10 & 101) + (i10 | 101);
        a = i13 % 128;
        int i14 = i13 % 2;
        float f17 = (f10 * fArr3[c2][2]) + (f14 * f6) + (f12 * f5);
        int i15 = ((i10 & 103) - (~(i10 | 103))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        float fExp = (1.0f - (((float) Math.exp(((-fT2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = fExp;
        if (d4 > 1.0d) {
            int i17 = a;
            int i18 = ((i17 | 89) << 1) - (i17 ^ 89);
            b = i18 % 128;
            fExp = i18 % 2 != 0 ? 2.0f : 1.0f;
            int i19 = 2 % 2;
        } else if (d4 < 0.0d) {
            int i20 = b;
            int i21 = ((i20 | 110) << 1) - (i20 ^ 110);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            a = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i20 + 103;
            a = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 2 % 2;
            fExp = 0.0f;
        }
        int i27 = b;
        int i28 = (i27 & (-104)) | ((~i27) & 103);
        int i29 = -(-((i27 & 103) << 1));
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        a = i30 % 128;
        int i31 = i30 % 2;
        float[] fArr7 = {(((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f18 = 1.0f / ((5.0f * fT2) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        double d5 = fT2;
        float f21 = 0.1f * f20 * f20;
        int i32 = i27 ^ 75;
        int i33 = ((((i27 & 75) | i32) << 1) - (~(-i32))) - 1;
        a = i33 % 128;
        if (i33 % 2 == 0) {
            fCbrt = (f21 % ((float) Math.cbrt(d5 % 5.0d))) - (f19 + fT2);
            fT = i.t(50.0f) + fArr2[0];
            d = fT;
            dSqrt = Math.sqrt(d);
        } else {
            fCbrt = (f21 * ((float) Math.cbrt(d5 * 5.0d))) + (f19 * fT2);
            fT = i.t(50.0f) / fArr2[1];
            d = fT;
            dSqrt = Math.sqrt(d);
        }
        float f22 = (float) dSqrt;
        float fPow = (float) Math.pow(d, 0.2d);
        float f23 = fT;
        int i34 = b;
        int i35 = i34 & 59;
        int i36 = ((((i34 ^ 59) | i35) << 1) - (~(-((i34 | 59) & (~i35))))) - 1;
        a = i36 % 128;
        if (i36 % 2 == 0) {
            float f24 = 0.725f + fPow;
            fArr = new float[]{(float) Math.pow(((double) ((fArr7[0] * fCbrt) - f11)) - 100.0d, 0.42d), 0.0f};
            d3 = (fArr7[1] - fCbrt) - f16;
            f7 = f24;
            d2 = 100.0d;
        } else {
            float f25 = 0.725f / fPow;
            d2 = 100.0d;
            fArr = new float[]{(float) Math.pow(((double) ((fArr7[0] * fCbrt) * f11)) / 100.0d, 0.42d), 0.0f, 0.0f};
            d3 = fArr7[1] * fCbrt * f16;
            f7 = f25;
        }
        fArr[1] = (float) Math.pow(d3 / d2, 0.42d);
        float fPow2 = (float) Math.pow(((double) ((fArr7[2] * fCbrt) * f17)) / d2, 0.42d);
        fArr[2] = fPow2;
        int i37 = a;
        int i38 = i37 & 99;
        int i39 = -(-((i37 ^ 99) | i38));
        int i40 = (i38 & i39) + (i39 | i38);
        b = i40 % 128;
        int i41 = i40 % 2;
        float f26 = fArr[0];
        float f27 = (f26 * 400.0f) / (f26 + 27.13f);
        float f28 = fArr[1];
        T t = new T(f23, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (f27 * 2.0f) + ((f28 * 400.0f) / (f28 + 27.13f))) * f7, f7, f7, 0.69f, 1.0f, fArr7, fCbrt, (float) Math.pow(fCbrt, 0.25d), f22 + 1.48f);
        int i42 = b;
        int i43 = i42 & 19;
        int i44 = (i42 | 19) & (~i43);
        int i45 = i43 << 1;
        int i46 = (i44 & i45) + (i44 | i45);
        int i47 = i46 % 128;
        a = i47;
        int i48 = i46 % 2;
        c = t;
        int i49 = (i47 & 63) + (i47 | 63);
        b = i49 % 128;
        int i50 = i49 % 2;
    }

    public T(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.i = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.j = f6;
        this.k = fArr;
        this.l = f7;
        this.d = f8;
        this.m = f9;
    }
}
