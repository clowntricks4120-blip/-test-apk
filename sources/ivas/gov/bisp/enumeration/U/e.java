package ivas.gov.bisp.enumeration.U;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.j;

/* JADX INFO: loaded from: classes.dex */
public class e implements ValueAnimator.AnimatorUpdateListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ j c;

    public e(j jVar) {
        this.c = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        j jVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 41) + (i2 | 41);
        a = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i5 = (-2) - ((a + 94) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.e.setScaleX(fFloatValue);
            jVar = this.c;
            int i6 = 85 / 0;
        } else {
            this.c.e.setScaleX(fFloatValue);
            jVar = this.c;
        }
        jVar.e.setScaleY(fFloatValue);
        int i7 = a;
        int i8 = i7 & 123;
        int i9 = (((i7 ^ 123) | i8) << 1) - ((i7 | 123) & (~i8));
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 38 / 0;
        }
    }
}
