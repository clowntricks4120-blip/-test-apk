package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ r.aOB b;
    public final /* synthetic */ r c;

    public h(r rVar, boolean z, r.aOB aob) {
        this.c = rVar;
        this.a = z;
        this.b = aob;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        r rVar = this.c;
        rVar.z = 0;
        rVar.u = null;
        r.aOB aob = this.b;
        if (aob != null) {
            j jVar = (j) aob;
            jVar.a.c(jVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.c.E.d(0, this.a);
        r rVar = this.c;
        rVar.z = 2;
        rVar.u = animator;
    }
}
