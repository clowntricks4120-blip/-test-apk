package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public class n implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ w.aLv c;
    public final /* synthetic */ ivas.gov.bisp.enumeration.H.c d;

    public class aKZ implements Runnable {
        public aKZ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n.this.b.getAnimatingAway() != null) {
                n.this.b.setAnimatingAway(null);
                n nVar = n.this;
                ((h.aLC) nVar.c).b(nVar.b, nVar.d);
            }
        }
    }

    public n(ViewGroup viewGroup, Fragment fragment, w.aLv alv, ivas.gov.bisp.enumeration.H.c cVar) {
        this.a = viewGroup;
        this.b = fragment;
        this.c = alv;
        this.d = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.a.post(new aKZ());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
