package ivas.gov.bisp.enumeration.U;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.j;

/* JADX INFO: loaded from: classes.dex */
public class r implements ValueAnimator.AnimatorUpdateListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ j c;

    public r(j jVar) {
        this.c = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i5 = b + 35;
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.e.setAlpha(fFloatValue);
        int i7 = a;
        int i8 = ((i7 ^ 2) + ((i7 & 2) << 1)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
