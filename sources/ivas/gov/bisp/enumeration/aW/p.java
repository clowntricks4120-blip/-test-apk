package ivas.gov.bisp.enumeration.aW;

import android.animation.ValueAnimator;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public class p implements ValueAnimator.AnimatorUpdateListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ OooOO0 d;

    public p(OooOO0 oooOO0, float f) {
        this.d = oooOO0;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = -(-((i2 ^ 109) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        OooOO0 oooOO0 = this.d;
        int i7 = a;
        int i8 = (i7 ^ 21) + ((i7 & 21) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            oooOO0.o(fFloatValue, this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        oooOO0.o(fFloatValue, this.c);
        int i9 = b;
        int i10 = ((((i9 ^ 5) | (i9 & 5)) << 1) - (~(-(((~i9) & 5) | (i9 & (-6)))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
