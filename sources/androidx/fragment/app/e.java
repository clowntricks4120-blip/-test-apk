package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import ivas.gov.bisp.enumeration.F.K;
import ivas.gov.bisp.enumeration.F.S;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.p001aa.P;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e extends i {

    public class aKM implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ i.aLo b;

        public aKM(List list, i.aLo alo) {
            this.a = list;
            this.b = alo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.contains(this.b)) {
                this.a.remove(this.b);
                e eVar = e.this;
                i.aLo alo = this.b;
                Objects.requireNonNull(eVar);
                alo.a.g(alo.c.mView);
            }
        }
    }

    public static class aKN {
        public final i.aLo a;
        public final ivas.gov.bisp.enumeration.H.c b;

        public aKN(i.aLo alo, ivas.gov.bisp.enumeration.H.c cVar) {
            this.a = alo;
            this.b = cVar;
        }

        public void b() {
            i.aLo alo = this.a;
            if (alo.f.remove(this.b) && alo.f.isEmpty()) {
                alo.c();
            }
        }

        public boolean c() {
            i.aLo.aLs als;
            i.aLo.aLs alsD = i.aLo.aLs.d(this.a.c.mView);
            i.aLo.aLs als2 = this.a.a;
            return alsD == als2 || !(alsD == (als = i.aLo.aLs.VISIBLE) || als2 == als);
        }
    }

    public static class aKO extends aKN {
        public boolean c;
        public boolean d;
        public p.aLc e;

        public aKO(i.aLo alo, ivas.gov.bisp.enumeration.H.c cVar, boolean z) {
            super(alo, cVar);
            this.d = false;
            this.c = z;
        }

        public p.aLc d(Context context) {
            if (this.d) {
                return this.e;
            }
            i.aLo alo = this.a;
            p.aLc alcA = p.a(context, alo.c, alo.a == i.aLo.aLs.VISIBLE, this.c);
            this.e = alcA;
            this.d = true;
            return alcA;
        }
    }

    public static class aKP extends aKN {
        public final Object c;
        public final boolean d;
        public final Object e;

        public aKP(i.aLo alo, ivas.gov.bisp.enumeration.H.c cVar, boolean z, boolean z2) {
            super(alo, cVar);
            if (alo.a == i.aLo.aLs.VISIBLE) {
                this.c = z ? alo.c.getReenterTransition() : alo.c.getEnterTransition();
                this.d = z ? alo.c.getAllowReturnTransitionOverlap() : alo.c.getAllowEnterTransitionOverlap();
            } else {
                this.c = z ? alo.c.getReturnTransition() : alo.c.getExitTransition();
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = alo.c.getSharedElementReturnTransition();
            } else {
                this.e = alo.c.getSharedElementEnterTransition();
            }
        }

        public final K d(Object obj) {
            if (obj == null) {
                return null;
            }
            K k = w.b;
            if (obj instanceof Transition) {
                return k;
            }
            K k2 = w.c;
            if (k2 != null && k2.k(obj)) {
                return k2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(this.a.c);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public e(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.i
    public void f(List<i.aLo> list, boolean z) {
        ArrayList<aKO> arrayList;
        AbstractMap abstractMap;
        ArrayList arrayList2;
        i.aLo.aLs als;
        boolean z2;
        Object obj;
        Object objP;
        i.aLo.aLs als2;
        i.aLo.aLs als3;
        View view;
        ArrayList<View> arrayList3;
        i.aLo.aLs als4;
        View view2;
        HashMap map;
        i.aLo alo;
        ArrayList<View> arrayList4;
        K k;
        int i;
        View view3;
        boolean z3 = z;
        i.aLo.aLs als5 = i.aLo.aLs.GONE;
        i.aLo.aLs als6 = i.aLo.aLs.VISIBLE;
        i.aLo alo2 = null;
        i.aLo alo3 = null;
        for (i.aLo alo4 : list) {
            i.aLo.aLs alsD = i.aLo.aLs.d(alo4.c.mView);
            int iOrdinal = alo4.a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                    }
                } else if (alsD != als6) {
                    alo3 = alo4;
                }
            }
            if (alsD == als6 && alo2 == null) {
                alo2 = alo4;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList<aKP> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList(list);
        Iterator<i.aLo> it = list.iterator();
        while (it.hasNext()) {
            i.aLo next = it.next();
            ivas.gov.bisp.enumeration.H.c cVar = new ivas.gov.bisp.enumeration.H.c();
            next.e();
            next.f.add(cVar);
            arrayList5.add(new aKO(next, cVar, z3));
            ivas.gov.bisp.enumeration.H.c cVar2 = new ivas.gov.bisp.enumeration.H.c();
            next.e();
            next.f.add(cVar2);
            arrayList6.add(new aKP(next, cVar2, z3, !z3 ? next != alo3 : next != alo2));
            next.d.add(new aKM(arrayList7, next));
        }
        HashMap map2 = new HashMap();
        K k2 = null;
        for (aKP akp : arrayList6) {
            if (!akp.c()) {
                K kD = akp.d(akp.c);
                K kD2 = akp.d(akp.e);
                if (kD != null && kD2 != null && kD != kD2) {
                    StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbW.append(akp.a.c);
                    sbW.append(" returned Transition ");
                    sbW.append(akp.c);
                    sbW.append(" which uses a different Transition  type than its shared element transition ");
                    sbW.append(akp.e);
                    throw new IllegalArgumentException(sbW.toString());
                }
                if (kD == null) {
                    kD = kD2;
                }
                if (k2 == null) {
                    k2 = kD;
                } else if (kD != null && k2 != kD) {
                    StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbW2.append(akp.a.c);
                    sbW2.append(" returned Transition ");
                    sbW2.append(akp.c);
                    sbW2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sbW2.toString());
                }
            }
        }
        if (k2 == null) {
            for (aKP akp2 : arrayList6) {
                map2.put(akp2.a, Boolean.FALSE);
                akp2.b();
            }
            arrayList2 = arrayList7;
            arrayList = arrayList5;
            z2 = false;
            als = als5;
            abstractMap = map2;
        } else {
            View view4 = new View(this.a.getContext());
            Rect rect = new Rect();
            ArrayList<View> arrayList8 = new ArrayList<>();
            ArrayList<View> arrayList9 = new ArrayList<>();
            ivas.gov.bisp.enumeration.p001aa.r rVar = new ivas.gov.bisp.enumeration.p001aa.r();
            Iterator it2 = arrayList6.iterator();
            ArrayList arrayList10 = arrayList7;
            ArrayList arrayList11 = arrayList6;
            i.aLo alo5 = alo3;
            arrayList = arrayList5;
            Object obj2 = null;
            View view5 = null;
            boolean z4 = false;
            i.aLo alo6 = alo2;
            while (it2.hasNext()) {
                i.aLo.aLs als7 = als6;
                Object obj3 = ((aKP) it2.next()).e;
                if (obj3 == null || alo6 == null || alo5 == null) {
                    arrayList3 = arrayList9;
                    als4 = als5;
                    view2 = view4;
                    map = map2;
                    alo = alo6;
                    arrayList4 = arrayList8;
                    k = k2;
                } else {
                    Object objA = k2.A(k2.l(obj3));
                    ArrayList<String> sharedElementSourceNames = alo5.c.getSharedElementSourceNames();
                    K k3 = k2;
                    ArrayList<String> sharedElementSourceNames2 = alo6.c.getSharedElementSourceNames();
                    als4 = als5;
                    ArrayList<String> sharedElementTargetNames = alo6.c.getSharedElementTargetNames();
                    view2 = view4;
                    HashMap map3 = map2;
                    int i2 = 0;
                    while (i2 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                        ArrayList<String> arrayList12 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                        }
                        i2++;
                        sharedElementTargetNames = arrayList12;
                    }
                    ArrayList<String> sharedElementTargetNames2 = alo5.c.getSharedElementTargetNames();
                    if (z3) {
                        alo6.c.getEnterTransitionCallback();
                        alo5.c.getExitTransitionCallback();
                    } else {
                        alo6.c.getExitTransitionCallback();
                        alo5.c.getEnterTransitionCallback();
                    }
                    int i3 = 0;
                    for (int size = sharedElementSourceNames.size(); i3 < size; size = size) {
                        rVar.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                        i3++;
                    }
                    OooO0o<String, View> rVar2 = new ivas.gov.bisp.enumeration.p001aa.r<>();
                    l(rVar2, alo6.c.mView);
                    P.d(rVar2, sharedElementSourceNames);
                    P.d(rVar, rVar2.keySet());
                    OooO0o<String, View> rVar3 = new ivas.gov.bisp.enumeration.p001aa.r<>();
                    l(rVar3, alo5.c.mView);
                    P.d(rVar3, sharedElementTargetNames2);
                    P.d(rVar3, rVar.values());
                    w.n(rVar, rVar3);
                    m(rVar2, rVar.keySet());
                    m(rVar3, rVar.values());
                    if (rVar.isEmpty()) {
                        arrayList8.clear();
                        arrayList9.clear();
                        arrayList3 = arrayList9;
                        alo = alo6;
                        map = map3;
                        view2 = view2;
                        obj2 = null;
                        arrayList4 = arrayList8;
                        k = k3;
                    } else {
                        w.e(alo5.c, alo6.c, z3, rVar2, true);
                        arrayList3 = arrayList9;
                        arrayList4 = arrayList8;
                        i.aLo alo7 = alo3;
                        i.aLo alo8 = alo2;
                        ivas.gov.bisp.enumeration.p081d.x.c(this.a, new j(this, alo3, alo2, z, rVar3));
                        arrayList4.addAll(rVar2.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            k = k3;
                            i = 0;
                        } else {
                            i = 0;
                            View view6 = (View) rVar2.get((String) sharedElementSourceNames.get(0));
                            k = k3;
                            k.x(objA, view6);
                            view5 = view6;
                        }
                        arrayList3.addAll(rVar3.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view3 = (View) rVar3.get((String) sharedElementTargetNames2.get(i))) != null) {
                            ivas.gov.bisp.enumeration.p081d.x.c(this.a, new k(this, k, view3, rect));
                            z4 = true;
                        }
                        k.z(objA, view2, arrayList4);
                        k.s(objA, null, null, null, null, objA, arrayList3);
                        Boolean bool = Boolean.TRUE;
                        map = map3;
                        alo2 = alo8;
                        map.put(alo2, bool);
                        alo3 = alo7;
                        map.put(alo3, bool);
                        obj2 = objA;
                        alo = alo2;
                        alo5 = alo3;
                    }
                }
                view4 = view2;
                k2 = k;
                map2 = map;
                arrayList8 = arrayList4;
                rVar = rVar;
                als6 = als7;
                als5 = als4;
                arrayList10 = arrayList10;
                arrayList11 = arrayList11;
                alo6 = alo;
                arrayList9 = arrayList3;
                z3 = z;
            }
            ivas.gov.bisp.enumeration.p001aa.r rVar4 = rVar;
            ArrayList<View> arrayList13 = arrayList9;
            i.aLo.aLs als8 = als5;
            i.aLo.aLs als9 = als6;
            View view7 = view4;
            abstractMap = map2;
            i.aLo alo9 = alo6;
            arrayList2 = arrayList10;
            ArrayList<aKP> arrayList14 = arrayList11;
            ArrayList<View> arrayList15 = arrayList8;
            K k4 = k2;
            ArrayList arrayList16 = new ArrayList();
            Iterator it3 = arrayList14.iterator();
            Object objP2 = null;
            Object obj4 = null;
            while (it3.hasNext()) {
                aKP akp3 = (aKP) it3.next();
                if (akp3.c()) {
                    abstractMap.put(akp3.a, Boolean.FALSE);
                    akp3.b();
                    it3 = it3;
                    alo3 = alo3;
                } else {
                    Iterator it4 = it3;
                    i.aLo alo10 = alo3;
                    Object objL = k4.l(akp3.c);
                    i.aLo alo11 = akp3.a;
                    boolean z5 = obj2 != null && (alo11 == alo9 || alo11 == alo5);
                    if (objL == null) {
                        if (!z5) {
                            abstractMap.put(alo11, Boolean.FALSE);
                            akp3.b();
                        }
                        view7 = view7;
                        obj = obj2;
                        objP = obj4;
                        view = view5;
                        als3 = als9;
                        als2 = als8;
                    } else {
                        obj = obj2;
                        ArrayList<View> arrayList17 = new ArrayList<>();
                        objP = obj4;
                        k(arrayList17, alo11.c.mView);
                        if (z5) {
                            if (alo11 == alo9) {
                                arrayList17.removeAll(arrayList15);
                            } else {
                                arrayList17.removeAll(arrayList13);
                            }
                        }
                        if (arrayList17.isEmpty()) {
                            k4.g(objL, view7);
                            als2 = als8;
                        } else {
                            k4.h(objL, arrayList17);
                            k4.s(objL, objL, arrayList17, null, null, null, null);
                            als2 = als8;
                            if (alo11.a == als2) {
                                arrayList2.remove(alo11);
                                ArrayList<View> arrayList18 = new ArrayList<>(arrayList17);
                                arrayList18.remove(alo11.c.mView);
                                k4.t(objL, alo11.c.mView, arrayList18);
                                ivas.gov.bisp.enumeration.p081d.x.c(this.a, new l(this, arrayList17));
                            }
                        }
                        als3 = als9;
                        if (alo11.a == als3) {
                            arrayList16.addAll(arrayList17);
                            if (z4) {
                                k4.u(objL, rect);
                            }
                            view = view5;
                        } else {
                            view = view5;
                            k4.x(objL, view);
                        }
                        abstractMap.put(alo11, Boolean.TRUE);
                        if (akp3.d) {
                            objP2 = k4.p(objP2, objL, null);
                        } else {
                            objP = k4.p(objP, objL, null);
                        }
                    }
                    it3 = it4;
                    view5 = view;
                    als9 = als3;
                    als8 = als2;
                    obj2 = obj;
                    obj4 = objP;
                    view7 = view7;
                    alo5 = alo10;
                    alo3 = alo5;
                }
            }
            Object obj5 = obj2;
            i.aLo alo12 = alo3;
            Object obj6 = obj4;
            als = als8;
            Object objN = k4.n(objP2, obj6, obj5);
            for (aKP akp4 : arrayList14) {
                if (!akp4.c()) {
                    Object obj7 = akp4.c;
                    i.aLo alo13 = akp4.a;
                    i.aLo alo14 = alo12;
                    boolean z6 = obj5 != null && (alo13 == alo9 || alo13 == alo14);
                    if (obj7 != null || z6) {
                        ViewGroup viewGroup = this.a;
                        WeakHashMap<View, R> weakHashMap = T.c;
                        if (T.aXa.d(viewGroup)) {
                            k4.w(akp4.a.c, objN, akp4.b, new m(this, akp4));
                        } else {
                            if (h.b(2)) {
                                Objects.toString(this.a);
                                Objects.toString(alo13);
                            }
                            akp4.b();
                        }
                    }
                    alo12 = alo14;
                }
            }
            ViewGroup viewGroup2 = this.a;
            WeakHashMap<View, R> weakHashMap2 = T.c;
            if (T.aXa.d(viewGroup2)) {
                w.q(arrayList16, 4);
                ArrayList<String> arrayListO = k4.o(arrayList13);
                k4.i(this.a, objN);
                k4.y(this.a, arrayList15, arrayList13, arrayListO, rVar4);
                z2 = false;
                w.q(arrayList16, 0);
                k4.v(obj5, arrayList15, arrayList13);
            } else {
                z2 = false;
            }
        }
        boolean zContainsValue = abstractMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.a;
        Context context = viewGroup3.getContext();
        ArrayList<aKO> arrayList19 = new ArrayList();
        boolean z7 = z2;
        for (aKO ako : arrayList) {
            if (ako.c()) {
                ako.b();
            } else {
                p.aLc alcD = ako.d(context);
                if (alcD == null) {
                    ako.b();
                } else {
                    Animator animator = alcD.b;
                    if (animator == null) {
                        arrayList19.add(ako);
                    } else {
                        i.aLo alo15 = ako.a;
                        Fragment fragment = alo15.c;
                        if (Boolean.TRUE.equals(abstractMap.get(alo15))) {
                            if (h.b(2)) {
                                Objects.toString(fragment);
                            }
                            ako.b();
                        } else {
                            boolean z8 = alo15.a == als ? true : z2;
                            ArrayList arrayList20 = arrayList2;
                            if (z8) {
                                arrayList20.remove(alo15);
                            }
                            View view8 = fragment.mView;
                            viewGroup3.startViewTransition(view8);
                            animator.addListener(new c(this, viewGroup3, view8, z8, alo15, ako));
                            animator.setTarget(view8);
                            animator.start();
                            ako.b.d(new S(this, animator));
                            arrayList2 = arrayList20;
                            abstractMap = abstractMap;
                            z7 = true;
                            z2 = false;
                        }
                    }
                }
            }
        }
        ArrayList<i.aLo> arrayList21 = arrayList2;
        for (aKO ako2 : arrayList19) {
            i.aLo alo16 = ako2.a;
            Fragment fragment2 = alo16.c;
            if (zContainsValue) {
                if (h.b(2)) {
                    Objects.toString(fragment2);
                }
                ako2.b();
            } else if (z7) {
                if (h.b(2)) {
                    Objects.toString(fragment2);
                }
                ako2.b();
            } else {
                View view9 = fragment2.mView;
                p.aLc alcD2 = ako2.d(context);
                Objects.requireNonNull(alcD2);
                Animation animation = alcD2.a;
                Objects.requireNonNull(animation);
                if (alo16.a != i.aLo.aLs.REMOVED) {
                    view9.startAnimation(animation);
                    ako2.b();
                } else {
                    viewGroup3.startViewTransition(view9);
                    p.aLd ald = new p.aLd(animation, viewGroup3, view9);
                    ald.setAnimationListener(new d(this, viewGroup3, view9, ako2));
                    view9.startAnimation(ald);
                }
                ako2.b.d(new f(this, view9, viewGroup3, ako2));
            }
        }
        for (i.aLo alo17 : arrayList21) {
            alo17.a.g(alo17.c.mView);
        }
        arrayList21.clear();
    }

    public void k(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                k(arrayList, childAt);
            }
        }
    }

    public void l(Map<String, View> map, View view) {
        WeakHashMap<View, R> weakHashMap = T.c;
        String strL = T.aXb.l(view);
        if (strL != null) {
            map.put(strL, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    l(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(OooO0o<String, View> oooO0o, Collection<String> collection) {
        Iterator it = ((P.aTw) oooO0o.entrySet()).iterator();
        while (true) {
            P.aTy aty = (P.aTy) it;
            if (!aty.hasNext()) {
                return;
            }
            aty.next();
            View view = (View) aty.getValue();
            WeakHashMap<View, R> weakHashMap = T.c;
            if (!collection.contains(T.aXb.l(view))) {
                aty.remove();
            }
        }
    }
}
