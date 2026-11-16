package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ i.aLo d;
    public final /* synthetic */ e.aKO e;

    public c(e eVar, ViewGroup viewGroup, View view, boolean z, i.aLo alo, e.aKO ako) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = alo;
        this.e = ako;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            this.d.a.g(this.b);
        }
        this.e.b();
    }
}
