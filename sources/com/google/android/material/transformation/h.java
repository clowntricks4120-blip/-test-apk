package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ivas.gov.bisp.enumeration.aH.r;

/* JADX INFO: loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ r a;

    public h(FabTransformationBehavior fabTransformationBehavior, r rVar) {
        this.a = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        r.bdX revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
