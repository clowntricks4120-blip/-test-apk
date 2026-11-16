package ivas.gov.bisp.enumeration.aE;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public class c implements TypeEvaluator<Float> {
    private static int a = 0;
    private static int b = 1;
    public FloatEvaluator c = new FloatEvaluator();

    public c(com.google.android.material.floatingactionbutton.r rVar) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f, Float f2, Float f3) {
        Float f4;
        Float f5;
        FloatEvaluator floatEvaluator;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            f4 = f2;
            f5 = f3;
            floatEvaluator = this.c;
            int i4 = 67 / 0;
        } else {
            f4 = f2;
            f5 = f3;
            floatEvaluator = this.c;
        }
        int i5 = ((i2 & (-30)) | ((~i2) & 29)) + ((i2 & 29) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        float fFloatValue = floatEvaluator.evaluate(f, (Number) f4, (Number) f5).floatValue();
        if (fFloatValue < 0.1f) {
            int i7 = b;
            int i8 = (i7 & (-38)) | ((~i7) & 37);
            int i9 = -(-((i7 & 37) << 1));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            fFloatValue = 0.0f;
        }
        Float fValueOf = Float.valueOf(fFloatValue);
        int i12 = b;
        int i13 = ((i12 & 54) + (i12 | 54)) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 63 / 0;
        }
        return fValueOf;
    }
}
