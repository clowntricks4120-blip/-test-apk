package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0013c implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ o b;

    public RunnableC0013c(o oVar, ArrayList arrayList) {
        this.b = oVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (o.aNb anb : this.a) {
            o oVar = this.b;
            Objects.requireNonNull(oVar);
            RecyclerView.o0O0O00 o0o0o00 = anb.a;
            View view = o0o0o00 == null ? null : o0o0o00.c;
            RecyclerView.o0O0O00 o0o0o01 = anb.b;
            View view2 = o0o0o01 != null ? o0o0o01.c : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(oVar.e);
                oVar.r.add(anb.a);
                duration.translationX(anb.f - anb.c);
                duration.translationY(anb.e - anb.d);
                duration.alpha(0.0f).setListener(new l(oVar, anb, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                oVar.r.add(anb.b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(oVar.e).alpha(1.0f).setListener(new m(oVar, anb, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
        this.a.clear();
        this.b.n.remove(this.a);
    }
}
