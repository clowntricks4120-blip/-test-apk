package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.F.A;
import ivas.gov.bisp.enumeration.F.K;
import ivas.gov.bisp.enumeration.F.Y;
import ivas.gov.bisp.enumeration.F.Z;
import ivas.gov.bisp.enumeration.F.aa;
import ivas.gov.bisp.enumeration.F.ab;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import ivas.gov.bisp.enumeration.aM.C0072l;
import ivas.gov.bisp.enumeration.p001aa.P;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final K b = new Z();
    public static final K c;

    public interface aLv {
    }

    public static class aLw {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public a e;
        public boolean f;
    }

    static {
        K k;
        try {
            k = (K) C0072l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            k = null;
        }
        c = k;
    }

    public static Object b(K k, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return k.l(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    public static void c(ArrayList<View> arrayList, OooO0o<String, View> oooO0o, Collection<String> collection) {
        for (int i = oooO0o.i - 1; i >= 0; i--) {
            View view = (View) oooO0o.n(i);
            WeakHashMap<View, R> weakHashMap = T.c;
            if (collection.contains(T.aXb.l(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0058  */
    /* JADX WARN: Code duplicated, block: B:60:0x0078  */
    /* JADX WARN: Code duplicated, block: B:61:0x007a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0082  */
    /* JADX WARN: Code duplicated, block: B:65:0x0085  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d  */
    /* JADX WARN: Code duplicated, block: B:70:0x008f  */
    public static void d(a aVar, g.aLk alk, SparseArray<aLw> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        View view;
        boolean z5;
        Fragment fragment = alk.b;
        if (fragment == null || (i = fragment.mContainerId) == 0) {
            return;
        }
        int i2 = z ? a[alk.a] : alk.a;
        boolean z6 = true;
        boolean z7 = false;
        if (i2 == 1) {
            if (z2) {
                z3 = fragment.mIsNewlyAdded;
            } else if (!fragment.mAdded || fragment.mHidden) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = false;
        } else if (i2 == 3) {
            if (z2 ? !fragment.mAdded || fragment.mHidden : fragment.mAdded || (view = fragment.mView) == null || view.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) {
                z5 = false;
            } else {
                z5 = true;
            }
            z4 = z5;
            z3 = false;
            z7 = true;
            z6 = false;
        } else if (i2 == 4) {
            if (!z2 ? !(!fragment.mAdded || fragment.mHidden) : fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden) {
                z5 = false;
            } else {
                z5 = true;
            }
            z4 = z5;
            z3 = false;
            z7 = true;
            z6 = false;
        } else if (i2 == 5) {
            if (!z2) {
                z3 = fragment.mHidden;
            } else if (fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = false;
        } else if (i2 == 6) {
            if (z2) {
                z5 = false;
            } else {
                z5 = false;
            }
            z4 = z5;
            z3 = false;
            z7 = true;
            z6 = false;
        } else if (i2 != 7) {
            z3 = false;
            z6 = false;
            z4 = false;
        } else {
            if (z2) {
                z3 = fragment.mIsNewlyAdded;
            } else {
                if (fragment.mAdded) {
                }
                z3 = false;
            }
            z4 = false;
        }
        aLw alw = sparseArray.get(i);
        if (z3) {
            if (alw == null) {
                alw = new aLw();
                sparseArray.put(i, alw);
            }
            alw.a = fragment;
            alw.b = z;
            alw.c = aVar;
        }
        if (!z2 && z6) {
            if (alw != null && alw.d == fragment) {
                alw.d = null;
            }
            if (!aVar.f23o) {
                h hVar = aVar.p;
                hVar.d.l(hVar.k(fragment));
                hVar.R(fragment, hVar.p);
            }
        }
        if (z4 && (alw == null || alw.d == null)) {
            if (alw == null) {
                aLw alw2 = new aLw();
                sparseArray.put(i, alw2);
                alw = alw2;
            }
            alw.d = fragment;
            alw.f = z;
            alw.e = aVar;
        }
        if (z2 || !z7 || alw == null || alw.a != fragment) {
            return;
        }
        alw.a = null;
    }

    public static void e(Fragment fragment, Fragment fragment2, boolean z, OooO0o<String, View> oooO0o, boolean z2) {
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    public static boolean f(K k, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!k.k(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static OooO0o<String, View> g(K k, OooO0o<String, String> oooO0o, Object obj, aLw alw) {
        ArrayList<String> arrayList;
        if (oooO0o.isEmpty() || obj == null) {
            oooO0o.clear();
            return null;
        }
        Fragment fragment = alw.d;
        ivas.gov.bisp.enumeration.p001aa.r rVar = new ivas.gov.bisp.enumeration.p001aa.r();
        k.f(rVar, fragment.requireView());
        a aVar = alw.e;
        if (alw.f) {
            fragment.getEnterTransitionCallback();
            arrayList = aVar.m;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = aVar.n;
        }
        if (arrayList != null) {
            P.d(rVar, arrayList);
        }
        P.d(oooO0o, rVar.keySet());
        return rVar;
    }

    public static OooO0o<String, View> h(K k, OooO0o<String, String> oooO0o, Object obj, aLw alw) {
        ArrayList<String> arrayList;
        Fragment fragment = alw.a;
        View view = fragment.getView();
        if (oooO0o.isEmpty() || obj == null || view == null) {
            oooO0o.clear();
            return null;
        }
        ivas.gov.bisp.enumeration.p001aa.r rVar = new ivas.gov.bisp.enumeration.p001aa.r();
        k.f(rVar, view);
        a aVar = alw.c;
        if (alw.b) {
            fragment.getExitTransitionCallback();
            arrayList = aVar.n;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = aVar.m;
        }
        if (arrayList != null) {
            P.d(rVar, arrayList);
            P.d(rVar, oooO0o.values());
        }
        n(oooO0o, rVar);
        return rVar;
    }

    public static K i(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        K k = b;
        if (f(k, arrayList)) {
            return k;
        }
        K k2 = c;
        if (k2 == null || !f(k2, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return k2;
    }

    public static ArrayList<View> j(K k, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            k.j(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        k.h(obj, arrayList2);
        return arrayList2;
    }

    public static Object k(K k, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return k.l(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    public static View l(OooO0o<String, View> oooO0o, aLw alw, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar = alw.c;
        if (obj == null || oooO0o == null || (arrayList = aVar.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) oooO0o.get(z ? aVar.n.get(0) : aVar.m.get(0));
    }

    public static Object m(K k, Fragment fragment, Fragment fragment2, boolean z) {
        return k.A(k.l(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    public static void n(OooO0o<String, String> oooO0o, OooO0o<String, View> oooO0o2) {
        int i = oooO0o.i;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!oooO0o2.containsKey((String) oooO0o.n(i))) {
                oooO0o.l(i);
            }
        }
    }

    public static Object o(K k, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        if (obj != null && obj2 != null && fragment != null) {
            if (!(z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap())) {
                return k.n(obj2, obj, obj3);
            }
        }
        return k.p(obj2, obj, obj3);
    }

    public static void p(K k, Object obj, Object obj2, OooO0o<String, View> oooO0o, boolean z, a aVar) {
        ArrayList<String> arrayList = aVar.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) oooO0o.get(z ? aVar.m.get(0) : aVar.n.get(0));
        k.x(obj, view);
        if (obj2 != null) {
            k.x(obj2, view);
        }
    }

    public static void q(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0389  */
    /* JADX WARN: Code duplicated, block: B:134:0x0391  */
    /* JADX WARN: Code duplicated, block: B:136:0x0397  */
    /* JADX WARN: Code duplicated, block: B:139:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x041b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x0237 A[ADDED_TO_REGION] */
    public static void r(Context context, A a2, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, aLv alv) {
        int i3;
        SparseArray sparseArray;
        int i4;
        ViewGroup viewGroup;
        Object obj;
        Object obj2;
        K k;
        ArrayList<View> arrayListJ;
        Object objO;
        Object obj3;
        ivas.gov.bisp.enumeration.p001aa.r rVar;
        boolean z2;
        Fragment fragment;
        Fragment fragment2;
        Rect rect;
        Fragment fragment3;
        Object obj4;
        ArrayList<View> arrayListJ2;
        ArrayList<View> arrayListJ3;
        Object objO2;
        Object obj5;
        View view;
        Rect rect2;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayList<a> arrayList5 = arrayList;
        ArrayList<Boolean> arrayList6 = arrayList2;
        int i5 = i2;
        boolean z3 = z;
        SparseArray sparseArray2 = new SparseArray();
        int i6 = i;
        while (true) {
            i3 = 0;
            if (i6 >= i5) {
                break;
            }
            a aVar = arrayList5.get(i6);
            if (!arrayList6.get(i6).booleanValue()) {
                int size = aVar.b.size();
                for (int i7 = 0; i7 < size; i7++) {
                    d(aVar, aVar.b.get(i7), sparseArray2, false, z3);
                }
            } else if (aVar.p.q.d()) {
                for (int size2 = aVar.b.size() - 1; size2 >= 0; size2--) {
                    d(aVar, aVar.b.get(size2), sparseArray2, true, z3);
                }
            }
            i6++;
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(context);
            int size3 = sparseArray2.size();
            int i8 = 0;
            while (i8 < size3) {
                int iKeyAt = sparseArray2.keyAt(i8);
                ivas.gov.bisp.enumeration.p001aa.r rVar2 = new ivas.gov.bisp.enumeration.p001aa.r();
                int i9 = i5 - 1;
                while (i9 >= i) {
                    a aVar2 = arrayList5.get(i9);
                    if (aVar2.m(iKeyAt)) {
                        boolean zBooleanValue = arrayList6.get(i9).booleanValue();
                        ArrayList<String> arrayList7 = aVar2.n;
                        if (arrayList7 != null) {
                            int size4 = arrayList7.size();
                            if (zBooleanValue) {
                                arrayList3 = aVar2.n;
                                arrayList4 = aVar2.m;
                            } else {
                                ArrayList<String> arrayList8 = aVar2.n;
                                arrayList3 = aVar2.m;
                                arrayList4 = arrayList8;
                            }
                            while (i3 < size4) {
                                String str = arrayList4.get(i3);
                                String str2 = arrayList3.get(i3);
                                String str3 = (String) rVar2.remove(str2);
                                if (str3 != null) {
                                    rVar2.put(str, str3);
                                } else {
                                    rVar2.put(str, str2);
                                }
                                i3++;
                            }
                        }
                    }
                    i9--;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    i3 = 0;
                }
                aLw alw = (aLw) sparseArray2.valueAt(i8);
                if (!a2.d() || (viewGroup = (ViewGroup) a2.c(iKeyAt)) == null) {
                    sparseArray = sparseArray2;
                    i4 = i8;
                    size3 = size3;
                } else {
                    if (z3) {
                        Fragment fragment4 = alw.a;
                        Fragment fragment5 = alw.d;
                        K kI = i(fragment5, fragment4);
                        if (kI == null) {
                            sparseArray = sparseArray2;
                            i4 = i8;
                            size3 = size3;
                        } else {
                            boolean z4 = alw.b;
                            boolean z5 = alw.f;
                            ArrayList<View> arrayList9 = new ArrayList<>();
                            ArrayList<View> arrayList10 = new ArrayList<>();
                            Object objB = b(kI, fragment4, z4);
                            Object objK = k(kI, fragment5, z5);
                            sparseArray = sparseArray2;
                            Fragment fragment6 = alw.a;
                            Fragment fragment7 = alw.d;
                            i4 = i8;
                            if (fragment6 != null) {
                                fragment6.requireView().setVisibility(0);
                            }
                            if (fragment6 == null || fragment7 == null) {
                                fragment3 = fragment4;
                                z4 = z4;
                            } else {
                                boolean z6 = alw.b;
                                Object objM = rVar2.isEmpty() ? null : m(kI, fragment6, fragment7, z6);
                                OooO0o<String, View> oooO0oG = g(kI, rVar2, objM, alw);
                                fragment3 = fragment4;
                                OooO0o<String, View> oooO0oH = h(kI, rVar2, objM, alw);
                                if (rVar2.isEmpty()) {
                                    if (oooO0oG != null) {
                                        oooO0oG.clear();
                                    }
                                    if (oooO0oH != null) {
                                        oooO0oH.clear();
                                    }
                                    obj5 = null;
                                } else {
                                    c(arrayList10, oooO0oG, rVar2.keySet());
                                    c(arrayList9, oooO0oH, rVar2.values());
                                    obj5 = objM;
                                }
                                if (objB != null || objK != null || obj5 != null) {
                                    e(fragment6, fragment7, z6, oooO0oG, true);
                                    if (obj5 != null) {
                                        arrayList9.add(view2);
                                        kI.z(obj5, view2, arrayList10);
                                        p(kI, obj5, objK, oooO0oG, alw.f, alw.e);
                                        Rect rect3 = new Rect();
                                        View viewL = l(oooO0oH, alw, objB, z6);
                                        if (viewL != null) {
                                            kI.u(objB, rect3);
                                        }
                                        view = viewL;
                                        rect2 = rect3;
                                    } else {
                                        view = null;
                                        rect2 = null;
                                    }
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new x(fragment6, fragment7, z6, oooO0oH, view, kI, rect2));
                                    obj4 = obj5;
                                }
                                if (objB == null || obj4 != null || objK != null) {
                                    arrayListJ2 = j(kI, objK, fragment5, arrayList10, view2);
                                    Fragment fragment8 = fragment3;
                                    arrayListJ3 = j(kI, objB, fragment8, arrayList9, view2);
                                    q(arrayListJ3, 4);
                                    objO2 = o(kI, objB, objK, obj4, fragment8, z4);
                                    if (fragment5 != null && arrayListJ2 != null && (arrayListJ2.size() > 0 || arrayList10.size() > 0)) {
                                        ivas.gov.bisp.enumeration.H.c cVar = new ivas.gov.bisp.enumeration.H.c();
                                        h.aLC alc = (h.aLC) alv;
                                        alc.c(fragment5, cVar);
                                        kI.w(fragment5, objO2, cVar, new y(alc, fragment5, cVar));
                                    }
                                    if (objO2 != null) {
                                        if (fragment5 != null && objK != null && fragment5.mAdded && fragment5.mHidden && fragment5.mHiddenChanged) {
                                            fragment5.setHideReplaced(true);
                                            kI.t(objK, fragment5.getView(), arrayListJ2);
                                            ivas.gov.bisp.enumeration.p081d.x.c(fragment5.mContainer, new Y(arrayListJ2));
                                        }
                                        ArrayList<String> arrayListO = kI.o(arrayList9);
                                        kI.s(objO2, objB, arrayListJ3, objK, arrayListJ2, obj4, arrayList9);
                                        kI.i(viewGroup, objO2);
                                        kI.y(viewGroup, arrayList10, arrayList9, arrayListO, rVar2);
                                        q(arrayListJ3, 0);
                                        kI.v(obj4, arrayList10, arrayList9);
                                    }
                                }
                            }
                            obj4 = null;
                            if (objB == null) {
                                arrayListJ2 = j(kI, objK, fragment5, arrayList10, view2);
                                Fragment fragment9 = fragment3;
                                arrayListJ3 = j(kI, objB, fragment9, arrayList9, view2);
                                q(arrayListJ3, 4);
                                objO2 = o(kI, objB, objK, obj4, fragment9, z4);
                                if (fragment5 != null) {
                                    ivas.gov.bisp.enumeration.H.c cVar2 = new ivas.gov.bisp.enumeration.H.c();
                                    h.aLC alc2 = (h.aLC) alv;
                                    alc2.c(fragment5, cVar2);
                                    kI.w(fragment5, objO2, cVar2, new y(alc2, fragment5, cVar2));
                                }
                                if (objO2 != null) {
                                    if (fragment5 != null) {
                                        fragment5.setHideReplaced(true);
                                        kI.t(objK, fragment5.getView(), arrayListJ2);
                                        ivas.gov.bisp.enumeration.p081d.x.c(fragment5.mContainer, new Y(arrayListJ2));
                                    }
                                    ArrayList<String> arrayListO2 = kI.o(arrayList9);
                                    kI.s(objO2, objB, arrayListJ3, objK, arrayListJ2, obj4, arrayList9);
                                    kI.i(viewGroup, objO2);
                                    kI.y(viewGroup, arrayList10, arrayList9, arrayListO2, rVar2);
                                    q(arrayListJ3, 0);
                                    kI.v(obj4, arrayList10, arrayList9);
                                }
                            } else {
                                arrayListJ2 = j(kI, objK, fragment5, arrayList10, view2);
                                Fragment fragment10 = fragment3;
                                arrayListJ3 = j(kI, objB, fragment10, arrayList9, view2);
                                q(arrayListJ3, 4);
                                objO2 = o(kI, objB, objK, obj4, fragment10, z4);
                                if (fragment5 != null) {
                                    ivas.gov.bisp.enumeration.H.c cVar3 = new ivas.gov.bisp.enumeration.H.c();
                                    h.aLC alc3 = (h.aLC) alv;
                                    alc3.c(fragment5, cVar3);
                                    kI.w(fragment5, objO2, cVar3, new y(alc3, fragment5, cVar3));
                                }
                                if (objO2 != null) {
                                    if (fragment5 != null) {
                                        fragment5.setHideReplaced(true);
                                        kI.t(objK, fragment5.getView(), arrayListJ2);
                                        ivas.gov.bisp.enumeration.p081d.x.c(fragment5.mContainer, new Y(arrayListJ2));
                                    }
                                    ArrayList<String> arrayListO3 = kI.o(arrayList9);
                                    kI.s(objO2, objB, arrayListJ3, objK, arrayListJ2, obj4, arrayList9);
                                    kI.i(viewGroup, objO2);
                                    kI.y(viewGroup, arrayList10, arrayList9, arrayListO3, rVar2);
                                    q(arrayListJ3, 0);
                                    kI.v(obj4, arrayList10, arrayList9);
                                }
                            }
                        }
                    } else {
                        sparseArray = sparseArray2;
                        ivas.gov.bisp.enumeration.p001aa.r rVar3 = rVar2;
                        i4 = i8;
                        size3 = size3;
                        Fragment fragment11 = alw.a;
                        Fragment fragment12 = alw.d;
                        K kI2 = i(fragment12, fragment11);
                        if (kI2 != null) {
                            boolean z7 = alw.b;
                            boolean z8 = alw.f;
                            Object objB2 = b(kI2, fragment11, z7);
                            Object objK2 = k(kI2, fragment12, z8);
                            ArrayList<View> arrayList11 = new ArrayList<>();
                            ArrayList<View> arrayList12 = new ArrayList<>();
                            Fragment fragment13 = alw.a;
                            Fragment fragment14 = alw.d;
                            if (fragment13 != null && fragment14 != null) {
                                boolean z9 = alw.b;
                                Object objM2 = rVar3.isEmpty() ? null : m(kI2, fragment13, fragment14, z9);
                                OooO0o<String, View> oooO0oG2 = g(kI2, rVar3, objM2, alw);
                                if (rVar3.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    arrayList11.addAll(oooO0oG2.values());
                                    obj3 = objM2;
                                }
                                if (objB2 != null || objK2 != null || obj3 != null) {
                                    fragment11 = fragment11;
                                    e(fragment13, fragment14, z9, oooO0oG2, true);
                                    if (obj3 != null) {
                                        rect = new Rect();
                                        kI2.z(obj3, view2, arrayList11);
                                        obj = obj3;
                                        rVar = rVar3;
                                        z2 = z9;
                                        fragment = fragment14;
                                        fragment2 = fragment13;
                                        arrayList12 = arrayList12;
                                        p(kI2, obj, objK2, oooO0oG2, alw.f, alw.e);
                                        if (objB2 != null) {
                                            kI2.u(objB2, rect);
                                        }
                                    } else {
                                        obj = obj3;
                                        rVar = rVar3;
                                        z2 = z9;
                                        fragment = fragment14;
                                        fragment2 = fragment13;
                                        arrayList12 = arrayList12;
                                        rect = null;
                                    }
                                    arrayList11 = arrayList11;
                                    alw = alw;
                                    objK2 = objK2;
                                    rVar3 = rVar;
                                    i4 = i4;
                                    kI2 = kI2;
                                    size3 = size3;
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new v(kI2, rVar, obj, alw, arrayList12, view2, fragment2, fragment, z2, arrayList11, objB2, rect));
                                    obj2 = objB2;
                                }
                                if (obj2 == null || obj != null || objK2 != null) {
                                    k = kI2;
                                    arrayListJ = j(k, objK2, fragment12, arrayList11, view2);
                                    if (arrayListJ != null || arrayListJ.isEmpty()) {
                                        objK2 = null;
                                    }
                                    k.g(obj2, view2);
                                    objO = o(k, obj2, objK2, obj, fragment11, alw.b);
                                    if (fragment12 != null && arrayListJ != null && (arrayListJ.size() > 0 || arrayList11.size() > 0)) {
                                        ivas.gov.bisp.enumeration.H.c cVar4 = new ivas.gov.bisp.enumeration.H.c();
                                        h.aLC alc4 = (h.aLC) alv;
                                        alc4.c(fragment12, cVar4);
                                        k.w(fragment12, objO, cVar4, new u(alc4, fragment12, cVar4));
                                    }
                                    if (objO != null) {
                                        ArrayList<View> arrayList13 = new ArrayList<>();
                                        ArrayList<View> arrayList14 = arrayList12;
                                        k.s(objO, obj2, arrayList13, objK2, arrayListJ, obj, arrayList14);
                                        ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new ivas.gov.bisp.enumeration.F.q(obj2, k, view2, fragment11, arrayList14, arrayList13, arrayListJ, objK2));
                                        ArrayList<View> arrayList15 = arrayList12;
                                        ivas.gov.bisp.enumeration.p001aa.r rVar4 = rVar3;
                                        ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new aa(k, arrayList15, rVar4));
                                        k.i(viewGroup, objO);
                                        ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new ab(k, arrayList15, rVar4));
                                    }
                                }
                            }
                            obj2 = objB2;
                            obj = null;
                            if (obj2 == null) {
                                k = kI2;
                                arrayListJ = j(k, objK2, fragment12, arrayList11, view2);
                                if (arrayListJ != null) {
                                    objK2 = null;
                                } else {
                                    objK2 = null;
                                }
                                k.g(obj2, view2);
                                objO = o(k, obj2, objK2, obj, fragment11, alw.b);
                                if (fragment12 != null) {
                                    ivas.gov.bisp.enumeration.H.c cVar5 = new ivas.gov.bisp.enumeration.H.c();
                                    h.aLC alc5 = (h.aLC) alv;
                                    alc5.c(fragment12, cVar5);
                                    k.w(fragment12, objO, cVar5, new u(alc5, fragment12, cVar5));
                                }
                                if (objO != null) {
                                    ArrayList<View> arrayList16 = new ArrayList<>();
                                    ArrayList<View> arrayList17 = arrayList12;
                                    k.s(objO, obj2, arrayList16, objK2, arrayListJ, obj, arrayList17);
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new ivas.gov.bisp.enumeration.F.q(obj2, k, view2, fragment11, arrayList17, arrayList16, arrayListJ, objK2));
                                    ArrayList<View> arrayList18 = arrayList12;
                                    ivas.gov.bisp.enumeration.p001aa.r rVar5 = rVar3;
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new aa(k, arrayList18, rVar5));
                                    k.i(viewGroup, objO);
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new ab(k, arrayList18, rVar5));
                                }
                            } else {
                                k = kI2;
                                arrayListJ = j(k, objK2, fragment12, arrayList11, view2);
                                if (arrayListJ != null) {
                                    objK2 = null;
                                } else {
                                    objK2 = null;
                                }
                                k.g(obj2, view2);
                                objO = o(k, obj2, objK2, obj, fragment11, alw.b);
                                if (fragment12 != null) {
                                    ivas.gov.bisp.enumeration.H.c cVar6 = new ivas.gov.bisp.enumeration.H.c();
                                    h.aLC alc6 = (h.aLC) alv;
                                    alc6.c(fragment12, cVar6);
                                    k.w(fragment12, objO, cVar6, new u(alc6, fragment12, cVar6));
                                }
                                if (objO != null) {
                                    ArrayList<View> arrayList19 = new ArrayList<>();
                                    ArrayList<View> arrayList110 = arrayList12;
                                    k.s(objO, obj2, arrayList19, objK2, arrayListJ, obj, arrayList110);
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new ivas.gov.bisp.enumeration.F.q(obj2, k, view2, fragment11, arrayList110, arrayList19, arrayListJ, objK2));
                                    ArrayList<View> arrayList111 = arrayList12;
                                    ivas.gov.bisp.enumeration.p001aa.r rVar6 = rVar3;
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new aa(k, arrayList111, rVar6));
                                    k.i(viewGroup, objO);
                                    ivas.gov.bisp.enumeration.p081d.x.c(viewGroup, new ab(k, arrayList111, rVar6));
                                }
                            }
                        }
                    }
                    i4 = i4;
                    size3 = size3;
                }
                i8 = i4 + 1;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
                i5 = i2;
                z3 = z;
                size3 = size3;
                sparseArray2 = sparseArray;
                i3 = 0;
            }
        }
    }
}
