package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import ivas.gov.bisp.enumeration.O.C0019p;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0019p a;
    public final /* synthetic */ AppBarLayout b;

    public j(AppBarLayout appBarLayout, C0019p c0019p) {
        this.b = appBarLayout;
        this.a = c0019p;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.s(fFloatValue);
        Drawable drawable = this.b.p;
        if (drawable instanceof C0019p) {
            ((C0019p) drawable).s(fFloatValue);
        }
        Iterator<AppBarLayout.OooO0o> it = this.b.f31o.iterator();
        while (it.hasNext()) {
            it.next().b(fFloatValue, this.a.y);
        }
    }
}
