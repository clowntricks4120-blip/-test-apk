package ivas.gov.bisp.enumeration.U;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class z implements ValueAnimator.AnimatorUpdateListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ com.google.android.material.textfield.c c;

    public z(com.google.android.material.textfield.c cVar) {
        this.c = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 5) << 1) - (((~i2) & 5) | (i2 & (-6)));
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            throw null;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        com.google.android.material.textfield.c cVar = this.c;
        int i4 = b;
        int i5 = i4 & 67;
        int i6 = -(-((i4 ^ 67) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            cVar.e.setAlpha(fFloatValue);
        } else {
            cVar.e.setAlpha(fFloatValue);
            obj.hashCode();
            throw null;
        }
    }
}
