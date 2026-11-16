package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.o0O0O00 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ o e;
    public final /* synthetic */ ViewPropertyAnimator f;

    public k(o oVar, RecyclerView.o0O0O00 o0o0o00, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = oVar;
        this.a = o0o0o00;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f.setListener(null);
        this.e.d(this.a);
        this.e.q.remove(this.a);
        this.e.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.e);
    }
}
