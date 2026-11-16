package ivas.gov.bisp.enumeration.T;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public class c implements TypeEvaluator<Integer> {
    private static int a = 1;
    private static int b;
    public static final c c = new c();

    static {
        int i = a;
        int i2 = (((i & (-16)) | ((~i) & 15)) - (~(-(-((i & 15) << 1))))) - 1;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        Integer num3;
        int iIntValue;
        float f2;
        float f3;
        float f4;
        float f5;
        int iIntValue2;
        int i;
        int i2;
        float fPow;
        float fPow2;
        int iRound;
        float f6;
        int i3 = 2 % 2;
        int i4 = b + 50;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            num3 = num2;
            iIntValue = num.intValue();
            f2 = ((iIntValue >>> 55) & 2157) + 255.0f;
            f3 = ((iIntValue >>> 91) & 25551) + 255.0f;
        } else {
            num3 = num2;
            iIntValue = num.intValue();
            f2 = ((iIntValue >> 24) & 255) / 255.0f;
            f3 = ((iIntValue >> 16) & 255) / 255.0f;
        }
        int i6 = a;
        int i7 = i6 ^ 65;
        int i8 = ((((i6 & 65) | i7) << 1) - (~(-i7))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = iIntValue << 82;
            f4 = ((i9 & 32197) | (i9 ^ 32197)) * 255.0f;
            int i10 = iIntValue & 441;
            f5 = (((iIntValue ^ 441) | i10) & (~i10)) - 255.0f;
            iIntValue2 = num3.intValue();
            i = iIntValue2 >>> 103;
            i2 = 2910;
        } else {
            f4 = ((iIntValue >> 8) & 255) / 255.0f;
            f5 = (iIntValue & 255) / 255.0f;
            iIntValue2 = num3.intValue();
            i = iIntValue2 >> 24;
            i2 = 255;
        }
        float f7 = (i & i2) / 255.0f;
        float f8 = ((iIntValue2 >> 16) & 255) / 255.0f;
        float f9 = ((iIntValue2 >> 8) & 255) / 255.0f;
        int i11 = 255 & iIntValue2;
        int i12 = b;
        int i13 = (i12 & 28) + (i12 | 28);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        float f10 = i11 / 255.0f;
        float fPow3 = (float) Math.pow(f3, 2.2d);
        float fPow4 = (float) Math.pow(f4, 2.2d);
        float fPow5 = (float) Math.pow(f5, 2.2d);
        int i16 = a;
        int i17 = i16 & 51;
        int i18 = i17 + ((i16 ^ 51) | i17);
        b = i18 % 128;
        Object obj = null;
        if (i18 % 2 != 0) {
            Math.pow(f8, 2.2d);
            Math.pow(f9, 2.2d);
            Math.pow(f10, 2.2d);
            ivas.gov.bisp.enumeration.p091n.j.e(f7, f2, f, f2);
            obj.hashCode();
            throw null;
        }
        float fPow6 = (float) Math.pow(f8, 2.2d);
        float fPow7 = (float) Math.pow(f9, 2.2d);
        float fPow8 = (float) Math.pow(f10, 2.2d);
        float fE = ivas.gov.bisp.enumeration.p091n.j.e(f7, f2, f, f2);
        float fE2 = ivas.gov.bisp.enumeration.p091n.j.e(fPow6, fPow3, f, fPow3);
        float fE3 = ivas.gov.bisp.enumeration.p091n.j.e(fPow7, fPow4, f, fPow4);
        float fE4 = ivas.gov.bisp.enumeration.p091n.j.e(fPow8, fPow5, f, fPow5);
        double dPow = Math.pow(fE2, 0.45454545454545453d);
        int i19 = a;
        int i20 = (((i19 | 50) << 1) - (i19 ^ 50)) - 1;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            fPow = (float) Math.pow(fE3, 0.45454545454545453d);
            fPow2 = (float) Math.pow(fE4, 0.45454545454545453d);
            iRound = Math.round(fE / 255.0f);
            f6 = ((float) dPow) % 255.0f;
        } else {
            fPow = (float) Math.pow(fE3, 0.45454545454545453d);
            fPow2 = (float) Math.pow(fE4, 0.45454545454545453d);
            iRound = Math.round(fE * 255.0f);
            f6 = ((float) dPow) * 255.0f;
        }
        int iRound2 = Math.round(f6);
        int i21 = b;
        int i22 = i21 & 123;
        int i23 = (i21 ^ 123) | i22;
        int i24 = (i22 & i23) + (i23 | i22);
        a = i24 % 128;
        int i25 = i24 % 2;
        int iRound3 = Math.round(fPow * 255.0f);
        int iRound4 = Math.round(fPow2 * 255.0f);
        int i26 = iRound2 << 16;
        int i27 = iRound << 24;
        int i28 = i26 & i27;
        int i29 = (i26 | i27) & (~i28);
        int i30 = (i29 & i28) | (i29 ^ i28);
        int i31 = iRound3 << 8;
        int i32 = i30 ^ i31;
        int i33 = i30 & i31;
        int i34 = (i33 & i32) | (i32 ^ i33);
        Integer numValueOf = Integer.valueOf((iRound4 & i34) | (iRound4 ^ i34));
        int i35 = a;
        int i36 = (i35 ^ 117) + ((i35 & 117) << 1);
        b = i36 % 128;
        if (i36 % 2 == 0) {
            return numValueOf;
        }
        throw null;
    }
}
