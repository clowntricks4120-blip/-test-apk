package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public j(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
