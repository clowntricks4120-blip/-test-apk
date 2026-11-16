package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l extends AnimatorListenerAdapter {
    public final /* synthetic */ o.aNb a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ o d;

    public l(o oVar, o.aNb anb, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = oVar;
        this.a = anb;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.d(this.a.a);
        this.d.r.remove(this.a.a);
        this.d.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        o oVar = this.d;
        RecyclerView.o0O0O00 o0o0o00 = this.a.a;
        Objects.requireNonNull(oVar);
    }
}
