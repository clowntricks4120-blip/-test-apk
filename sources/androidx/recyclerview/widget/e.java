package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ o b;

    public e(o oVar, ArrayList arrayList) {
        this.b = oVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (o.aNc anc : this.a) {
            o oVar = this.b;
            RecyclerView.o0O0O00 o0o0o00 = anc.a;
            int i = anc.b;
            int i2 = anc.c;
            int i3 = anc.d;
            int i4 = anc.e;
            Objects.requireNonNull(oVar);
            View view = o0o0o00.c;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            oVar.q.add(o0o0o00);
            viewPropertyAnimatorAnimate.setDuration(oVar.f).setListener(new k(oVar, o0o0o00, i5, view, i6, viewPropertyAnimatorAnimate)).start();
        }
        this.a.clear();
        this.b.f29o.remove(this.a);
    }
}
