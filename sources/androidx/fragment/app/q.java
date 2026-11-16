package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class q extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ w.aLv d;
    public final /* synthetic */ ivas.gov.bisp.enumeration.H.c e;

    public q(ViewGroup viewGroup, View view, Fragment fragment, w.aLv alv, ivas.gov.bisp.enumeration.H.c cVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
        this.d = alv;
        this.e = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator animator2 = this.c.getAnimator();
        this.c.setAnimator(null);
        if (animator2 == null || this.a.indexOfChild(this.b) >= 0) {
            return;
        }
        ((h.aLC) this.d).b(this.c, this.e);
    }
}
