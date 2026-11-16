package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import ivas.gov.bisp.enumeration.aH.r;

/* JADX INFO: loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ r a;
    public final /* synthetic */ Drawable b;

    public c(FabTransformationBehavior fabTransformationBehavior, r rVar, Drawable drawable) {
        this.a = rVar;
        this.b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}
