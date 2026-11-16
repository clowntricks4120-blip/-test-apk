package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ivas.gov.bisp.enumeration.M.D;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class w extends C0283j {
    public final RecyclerView a;
    public final aNy b;

    public static class aNy extends C0283j {
        public final w a;
        public Map<View, C0283j> b = new WeakHashMap();

        public aNy(w wVar) {
            this.a = wVar;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            C0283j c0283j = this.b.get(view);
            if (c0283j != null) {
                c0283j.d(view, accessibilityEvent);
            } else {
                this.d.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public boolean e(View view, AccessibilityEvent accessibilityEvent) {
            C0283j c0283j = this.b.get(view);
            return c0283j != null ? c0283j.e(view, accessibilityEvent) : this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public D f(View view) {
            C0283j c0283j = this.b.get(view);
            return c0283j != null ? c0283j.f(view) : super.f(view);
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void g(View view, AccessibilityEvent accessibilityEvent) {
            C0283j c0283j = this.b.get(view);
            if (c0283j != null) {
                c0283j.g(view, accessibilityEvent);
            } else {
                this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            if (this.a.m() || this.a.a.getLayoutManager() == null) {
                this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
                return;
            }
            this.a.a.getLayoutManager().ad(view, alVar);
            C0283j c0283j = this.b.get(view);
            if (c0283j != null) {
                c0283j.h(view, alVar);
            } else {
                this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
            }
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0283j c0283j = this.b.get(viewGroup);
            return c0283j != null ? c0283j.i(viewGroup, view, accessibilityEvent) : this.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void j(View view, AccessibilityEvent accessibilityEvent) {
            C0283j c0283j = this.b.get(view);
            if (c0283j != null) {
                c0283j.j(view, accessibilityEvent);
            } else {
                this.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public boolean k(View view, int i, Bundle bundle) {
            if (this.a.m() || this.a.a.getLayoutManager() == null) {
                return super.k(view, i, bundle);
            }
            C0283j c0283j = this.b.get(view);
            if (c0283j != null) {
                if (c0283j.k(view, i, bundle)) {
                    return true;
                }
            } else if (super.k(view, i, bundle)) {
                return true;
            }
            RecyclerView.o00Ooo o00ooo = this.a.a.getLayoutManager().c.f;
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void l(View view, int i) {
            C0283j c0283j = this.b.get(view);
            if (c0283j != null) {
                c0283j.l(view, i);
            } else {
                this.d.sendAccessibilityEvent(view, i);
            }
        }
    }

    public w(RecyclerView recyclerView) {
        this.a = recyclerView;
        aNy any = this.b;
        if (any != null) {
            this.b = any;
        } else {
            this.b = new aNy(this);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void g(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().ac(accessibilityEvent);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public void h(View view, al alVar) {
        this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
        if (m() || this.a.getLayoutManager() == null) {
            return;
        }
        RecyclerView.Oooo000 layoutManager = this.a.getLayoutManager();
        RecyclerView recyclerView = layoutManager.c;
        RecyclerView.o00Ooo o00ooo = recyclerView.f;
        RecyclerView.o0Oo0oo o0oo0oo = recyclerView.ai;
        if (recyclerView.canScrollVertically(-1) || layoutManager.c.canScrollHorizontally(-1)) {
            alVar.d.addAction(8192);
            alVar.d.setScrollable(true);
        }
        if (layoutManager.c.canScrollVertically(1) || layoutManager.c.canScrollHorizontally(1)) {
            alVar.d.addAction(4096);
            alVar.d.setScrollable(true);
        }
        alVar.e(al.aXD.c(layoutManager.U(o00ooo, o0oo0oo), layoutManager.B(o00ooo, o0oo0oo), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[PHI: r1
  0x0082: PHI (r1v6 int) = (r1v2 int), (r1v10 int) binds: [B:26:0x0073, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.p081d.C0283j
    public boolean k(View view, int i, Bundle bundle) {
        int iH;
        int iQ;
        int i2;
        int i3;
        if (super.k(view, i, bundle)) {
            return true;
        }
        if (m() || this.a.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.Oooo000 layoutManager = this.a.getLayoutManager();
        RecyclerView recyclerView = layoutManager.c;
        RecyclerView.o00Ooo o00ooo = recyclerView.f;
        if (i == 4096) {
            iH = recyclerView.canScrollVertically(1) ? (layoutManager.f26o - layoutManager.H()) - layoutManager.O() : 0;
            if (layoutManager.c.canScrollHorizontally(1)) {
                iQ = (layoutManager.m - layoutManager.Q()) - layoutManager.R();
            } else {
                iQ = 0;
            }
            i2 = iQ;
            i3 = iH;
        } else if (i != 8192) {
            i2 = 0;
            i3 = 0;
        } else {
            iH = recyclerView.canScrollVertically(-1) ? -((layoutManager.f26o - layoutManager.H()) - layoutManager.O()) : 0;
            if (layoutManager.c.canScrollHorizontally(-1)) {
                iQ = -((layoutManager.m - layoutManager.Q()) - layoutManager.R());
            } else {
                iQ = 0;
            }
            i2 = iQ;
            i3 = iH;
        }
        if (i3 == 0 && i2 == 0) {
            return false;
        }
        layoutManager.c.aj(i2, i3, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean m() {
        return this.a.P();
    }
}
