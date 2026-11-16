package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.F.E;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public final ViewGroup a;
    public final ArrayList<aLo> b = new ArrayList<>();
    public final ArrayList<aLo> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    public class aLm implements Runnable {
        public final /* synthetic */ aLp a;

        public aLm(aLp alp) {
            this.a = alp;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.b.contains(this.a)) {
                aLp alp = this.a;
                alp.a.g(alp.c.mView);
            }
        }
    }

    public class aLn implements Runnable {
        public final /* synthetic */ aLp a;

        public aLn(aLp alp) {
            this.a = alp;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.b.remove(this.a);
            i.this.c.remove(this.a);
        }
    }

    public static class aLo {
        public aLs a;
        public aLr b;
        public final Fragment c;
        public final List<Runnable> d = new ArrayList();
        public final HashSet<ivas.gov.bisp.enumeration.H.c> f = new HashSet<>();
        public boolean e = false;
        public boolean g = false;

        public class aLq implements ivas.gov.bisp.enumeration.H.c.aKS {
            public aLq() {
            }

            @Override // ivas.gov.bisp.enumeration.H.c.aKS
            public void onCancel() {
                aLo.this.b();
            }
        }

        public enum aLr {
            NONE,
            ADDING,
            REMOVING
        }

        public enum aLs {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static aLs c(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Unknown visibility ", i));
            }

            public static aLs d(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            public final void g(View view) {
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        h.b(2);
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (h.b(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (iOrdinal == 2) {
                    if (h.b(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else if (iOrdinal == 3) {
                    if (h.b(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public aLo(aLs als, aLr alr, Fragment fragment, ivas.gov.bisp.enumeration.H.c cVar) {
            this.a = als;
            this.b = alr;
            this.c = fragment;
            cVar.d(new aLq());
        }

        public final void b() {
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.f.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f).iterator();
            while (it.hasNext()) {
                ((ivas.gov.bisp.enumeration.H.c) it.next()).c();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            h.b(2);
            this.g = true;
            Iterator<Runnable> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(aLs als, aLr alr) {
            aLs als2 = aLs.REMOVED;
            int iOrdinal = alr.ordinal();
            if (iOrdinal == 0) {
                if (this.a != als2) {
                    if (h.b(2)) {
                        Objects.toString(this.c);
                        Objects.toString(this.a);
                        Objects.toString(als);
                    }
                    this.a = als;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.a == als2) {
                    if (h.b(2)) {
                        Objects.toString(this.c);
                        Objects.toString(this.b);
                    }
                    this.a = aLs.VISIBLE;
                    this.b = aLr.ADDING;
                    return;
                }
                return;
            }
            if (iOrdinal == 2) {
                if (h.b(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.a);
                    Objects.toString(this.b);
                }
                this.a = als2;
                this.b = aLr.REMOVING;
            }
        }

        public void e() {
        }

        public String toString() {
            StringBuilder sbB = P.b("Operation ", "{");
            sbB.append(Integer.toHexString(System.identityHashCode(this)));
            sbB.append("} ");
            sbB.append("{");
            sbB.append("mFinalState = ");
            sbB.append(this.a);
            sbB.append("} ");
            sbB.append("{");
            sbB.append("mLifecycleImpact = ");
            sbB.append(this.b);
            sbB.append("} ");
            sbB.append("{");
            sbB.append("mFragment = ");
            sbB.append(this.c);
            sbB.append("}");
            return sbB.toString();
        }
    }

    public static class aLp extends aLo {
        public final t h;

        public aLp(aLo.aLs als, aLo.aLr alr, t tVar, ivas.gov.bisp.enumeration.H.c cVar) {
            super(als, alr, tVar.c, cVar);
            this.h = tVar;
        }

        @Override // androidx.fragment.app.i.aLo
        public void c() {
            super.c();
            this.h.n();
        }

        @Override // androidx.fragment.app.i.aLo
        public void e() {
            if (this.b == aLo.aLr.ADDING) {
                Fragment fragment = this.h.c;
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    h.b(2);
                }
                View viewRequireView = this.c.requireView();
                if (viewRequireView.getParent() == null) {
                    this.h.f();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    public i(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static i b(ViewGroup viewGroup, h hVar) {
        return c(viewGroup, hVar.P());
    }

    public static i c(ViewGroup viewGroup, E e) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof i) {
            return (i) tag;
        }
        Objects.requireNonNull((h.aLF) e);
        e eVar = new e(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
        return eVar;
    }

    public final void d() {
        for (aLo alo : this.b) {
            if (alo.b == aLo.aLr.ADDING) {
                alo.d(aLo.aLs.c(alo.c.requireView().getVisibility()), aLo.aLr.NONE);
            }
        }
    }

    public final void e(aLo.aLs als, aLo.aLr alr, t tVar) {
        synchronized (this.b) {
            ivas.gov.bisp.enumeration.H.c cVar = new ivas.gov.bisp.enumeration.H.c();
            aLo aloH = h(tVar.c);
            if (aloH != null) {
                aloH.d(als, alr);
                return;
            }
            aLp alp = new aLp(als, alr, tVar, cVar);
            this.b.add(alp);
            alp.d.add(new aLm(alp));
            alp.d.add(new aLn(alp));
        }
    }

    public abstract void f(List<aLo> list, boolean z);

    public void g() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if (!T.aXa.c(viewGroup)) {
            i();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList<aLo> arrayList = new ArrayList(this.c);
                this.c.clear();
                for (aLo alo : arrayList) {
                    if (h.b(2)) {
                        Objects.toString(alo);
                    }
                    alo.b();
                    if (!alo.g) {
                        this.c.add(alo);
                    }
                }
                d();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((aLo) it.next()).e();
                }
                f(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public final aLo h(Fragment fragment) {
        for (aLo alo : this.b) {
            if (alo.c.equals(fragment) && !alo.e) {
                return alo;
            }
        }
        return null;
    }

    public void i() {
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aXa.c(viewGroup);
        synchronized (this.b) {
            d();
            Iterator<aLo> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            for (aLo alo : new ArrayList(this.c)) {
                if (h.b(2)) {
                    Objects.toString(alo);
                }
                alo.b();
            }
            for (aLo alo2 : new ArrayList(this.b)) {
                if (h.b(2)) {
                    Objects.toString(alo2);
                }
                alo2.b();
            }
        }
    }

    public void j() {
        synchronized (this.b) {
            d();
            this.e = false;
            for (int size = this.b.size() - 1; size >= 0; size--) {
                aLo alo = this.b.get(size);
                aLo.aLs alsD = aLo.aLs.d(alo.c.mView);
                aLo.aLs als = alo.a;
                aLo.aLs als2 = aLo.aLs.VISIBLE;
                if (als == als2 && alsD != als2) {
                    this.e = alo.c.isPostponed();
                    break;
                }
            }
        }
    }
}
