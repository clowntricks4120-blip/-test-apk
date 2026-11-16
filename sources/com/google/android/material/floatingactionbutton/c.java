package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r.aOB c;
    public final /* synthetic */ r d;

    public c(r rVar, boolean z, r.aOB aob) {
        this.d = rVar;
        this.b = z;
        this.c = aob;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        r rVar = this.d;
        rVar.z = 0;
        rVar.u = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = rVar.E;
        boolean z = this.b;
        floatingActionButton.d(z ? 8 : 4, z);
        r.aOB aob = this.c;
        if (aob != null) {
            j jVar = (j) aob;
            jVar.a.b(jVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.d.E.d(0, this.b);
        r rVar = this.d;
        rVar.z = 1;
        rVar.u = animator;
        this.a = false;
    }
}
