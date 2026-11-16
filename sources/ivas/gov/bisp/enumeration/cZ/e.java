package ivas.gov.bisp.enumeration.cZ;

import android.animation.TypeEvaluator;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class e implements TypeEvaluator {
    private static int a = 0;
    private static int b = 1;
    public static final e c = new e();

    static {
        int i = a;
        int i2 = (i & (-114)) | ((~i) & 113);
        int i3 = -(-((i & 113) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue;
        float f2;
        float f3;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 29) - (~(-(-((i3 & 29) << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            iIntValue = ((Integer) obj).intValue();
            f2 = ((iIntValue >> 97) & 12859) / 255.0f;
            f3 = ((iIntValue + 15) & 15078) / 255.0f;
            i = 59;
        } else {
            iIntValue = ((Integer) obj).intValue();
            f2 = ((iIntValue >> 24) & 255) / 255.0f;
            f3 = ((iIntValue >> 16) & 255) / 255.0f;
            i = 8;
        }
        int i5 = a;
        int i6 = i5 & 11;
        int i7 = -(-((i5 ^ 11) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i10 = a;
        int i11 = i10 & 31;
        int i12 = (~i11) & (i10 | 31);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        float f4 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float f5 = ((iIntValue2 >> 16) & 255) / 255.0f;
        float f6 = ((iIntValue2 >> 8) & 255) / 255.0f;
        int i16 = i10 + 109;
        b = i16 % 128;
        int i17 = i16 % 2;
        float f7 = (iIntValue2 & 255) / 255.0f;
        float f8 = f2;
        float fPow = (float) Math.pow(f3, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> i) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        int i18 = a + 91;
        b = i18 % 128;
        Object obj3 = null;
        if (i18 % 2 == 0) {
            Math.pow(f5, 2.2d);
            Math.pow(f6, 2.2d);
            Math.pow(f7, 2.2d);
            j.e(f4, f8, f, f8);
            obj3.hashCode();
            throw null;
        }
        float fPow4 = (float) Math.pow(f5, 2.2d);
        float fPow5 = (float) Math.pow(f6, 2.2d);
        float fPow6 = (float) Math.pow(f7, 2.2d);
        float fE = j.e(f4, f8, f, f8);
        int i19 = b + 1;
        a = i19 % 128;
        int i20 = i19 % 2;
        float fE2 = j.e(fPow4, fPow, f, fPow);
        float fE3 = j.e(fPow5, fPow2, f, fPow2);
        float fE4 = j.e(fPow6, fPow3, f, fPow3);
        double dPow = Math.pow(fE2, 0.45454545454545453d);
        int i21 = a;
        int i22 = ((i21 & 52) + (i21 | 52)) - 1;
        b = i22 % 128;
        int i23 = i22 % 2;
        float fPow7 = (float) Math.pow(fE3, 0.45454545454545453d);
        float fPow8 = (float) Math.pow(fE4, 0.45454545454545453d);
        int iRound = Math.round(fE * 255.0f);
        int iRound2 = Math.round(((float) dPow) * 255.0f);
        int i24 = b + 19;
        a = i24 % 128;
        int i25 = i24 % 2;
        int iRound3 = Math.round(fPow7 * 255.0f);
        int iRound4 = Math.round(fPow8 * 255.0f);
        int i26 = iRound2 << 16;
        int i27 = iRound << 24;
        int i28 = ((~i27) & i26) | ((~i26) & i27);
        int i29 = i26 & i27;
        int i30 = (i29 & i28) | (i28 ^ i29);
        int i31 = iRound3 << 8;
        int i32 = i30 & i31;
        int i33 = (i30 | i31) & (~i32);
        int i34 = (i33 & i32) | (i33 ^ i32);
        Integer numValueOf = Integer.valueOf((iRound4 & i34) | (iRound4 ^ i34));
        int i35 = b + 117;
        a = i35 % 128;
        if (i35 % 2 == 0) {
            return numValueOf;
        }
        obj3.hashCode();
        throw null;
    }
}
