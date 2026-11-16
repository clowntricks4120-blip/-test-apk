package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends RecyclerView.o000oOoO {
    public RecyclerView a;
    public final RecyclerView.o00O0O b = new aNu();

    public class aNu extends RecyclerView.o00O0O {
        public boolean a = false;

        public aNu() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public void b(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                C.this.c();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public void c(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public abstract int[] b(RecyclerView.Oooo000 oooo000, View view);

    public void c() {
        RecyclerView.Oooo000 layoutManager;
        View viewE;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        u uVar = (u) this;
        if (layoutManager.j()) {
            viewE = uVar.e(layoutManager, uVar.f(layoutManager));
        } else {
            viewE = layoutManager.k() ? uVar.e(layoutManager, uVar.g(layoutManager)) : null;
        }
        if (viewE == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.aj(i, iArrB[1], null, Integer.MIN_VALUE, false);
    }
}
