package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ o b;

    public d(o oVar, ArrayList arrayList) {
        this.b = oVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (RecyclerView.o0O0O00 o0o0o00 : this.a) {
            o oVar = this.b;
            Objects.requireNonNull(oVar);
            View view = o0o0o00.c;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            oVar.p.add(o0o0o00);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(oVar.c).setListener(new j(oVar, o0o0o00, view, viewPropertyAnimatorAnimate)).start();
        }
        this.a.clear();
        this.b.m.remove(this.a);
    }
}
