package ivas.gov.bisp.enumeration.F;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ivas.gov.bisp.enumeration.H.c;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class K {
    private static int a = 1;
    private static int b;

    public class aYR implements Runnable {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;

        public aYR(K k, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.c = i;
            this.d = arrayList;
            int i2 = a;
            int i3 = (((i2 ^ 91) | (i2 & 91)) << 1) - (((~i2) & 91) | (i2 & (-92)));
            b = i3 % 128;
            int i4 = i3 % 2;
            this.e = arrayList2;
            this.g = arrayList3;
            this.f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 3;
            int i4 = i2 | 3;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 81;
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < this.c) {
                int i10 = a + 81;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    view = (View) this.d.get(i9);
                    arrayList = this.e;
                    int i11 = 82 / 0;
                } else {
                    view = (View) this.d.get(i9);
                    arrayList = this.e;
                }
                String str = (String) arrayList.get(i9);
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aXb.x(view, str);
                int i12 = a;
                int i13 = ((i12 & (-80)) | ((~i12) & 79)) + ((i12 & 79) << 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                View view2 = (View) this.g.get(i9);
                ArrayList arrayList2 = this.f;
                int i15 = b;
                int i16 = i15 ^ 51;
                int i17 = ((i15 & 51) | i16) << 1;
                int i18 = -i16;
                int i19 = (i17 & i18) + (i17 | i18);
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    T.aXb.x(view2, (String) arrayList2.get(i9));
                    int i20 = i9 & 68;
                    i9 = -(-(i20 + ((i9 ^ 68) | i20)));
                } else {
                    T.aXb.x(view2, (String) arrayList2.get(i9));
                    int i21 = i9 & (-38);
                    int i22 = (i9 | (-38)) & (~i21);
                    int i23 = -(-(i21 << 1));
                    int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                    int i25 = (i24 & (-40)) | ((~i24) & 39);
                    int i26 = (i24 & 39) << 1;
                    i9 = (i25 & i26) + (i25 | i26);
                }
            }
            int i27 = a;
            int i28 = i27 & 23;
            int i29 = (((i27 | 23) & (~i28)) - (~(i28 << 1))) - 1;
            b = i29 % 128;
            int i30 = i29 % 2;
        }
    }

    public static boolean d(List<View> list, View view, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 61;
        int i5 = (i3 ^ 61) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            Object obj = null;
            if (i8 >= i) {
                int i9 = a + 41;
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            int i10 = a;
            int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (list.get(i8) == view) {
                int i13 = b;
                int i14 = i13 & 85;
                int i15 = -(-((i13 ^ 85) | i14));
                int i16 = (i14 & i15) + (i14 | i15);
                a = i16 % 128;
                int i17 = i16 % 2;
                int i18 = i13 & 89;
                int i19 = (i13 ^ 89) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i21 = i8 ^ 1;
            int i22 = (i8 & 1) << 1;
            i8 = (i22 | i21) + (i21 & i22);
            int i23 = b;
            int i24 = i23 & 3;
            int i25 = -(-((i23 ^ 3) | i24));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            a = i26 % 128;
            int i27 = i26 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static boolean e(List list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        b = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            if (list != null) {
                int i4 = (i2 & (-118)) | ((~i2) & 117);
                int i5 = (i2 & 117) << 1;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                b = i6 % 128;
                int i7 = i6 % 2;
                if (!list.isEmpty()) {
                    int i8 = a;
                    int i9 = (i8 ^ 115) + ((i8 & 115) << 1);
                    int i10 = i9 % 128;
                    b = i10;
                    int i11 = i9 % 2;
                    int i12 = i10 + 95;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            int i14 = b;
            int i15 = (i14 & (-120)) | ((~i14) & 119);
            int i16 = -(-((i14 & 119) << 1));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            return z;
        }
        int i19 = 14 / 0;
        if (list != null) {
            int i20 = (i2 & (-118)) | ((~i2) & 117);
            int i21 = (i2 & 117) << 1;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            b = i22 % 128;
            int i23 = i22 % 2;
            if (!list.isEmpty()) {
                int i24 = a;
                int i25 = (i24 ^ 115) + ((i24 & 115) << 1);
                int i110 = i25 % 128;
                b = i110;
                int i111 = i25 % 2;
                int i112 = i110 + 95;
                a = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        int i114 = b;
        int i115 = (i114 & (-120)) | ((~i114) & 119);
        int i116 = -(-((i114 & 119) << 1));
        int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
        a = i117 % 128;
        int i118 = i117 % 2;
        return z;
        int i26 = b;
        int i27 = ((i26 ^ 52) + ((i26 & 52) << 1)) - 1;
        a = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 5 / 3;
        }
        z = true;
        int i119 = b;
        int i1110 = (i119 & (-120)) | ((~i119) & 119);
        int i1111 = -(-((i119 & 119) << 1));
        int i1112 = ((i1110 | i1111) << 1) - (i1111 ^ i1110);
        a = i1112 % 128;
        int i1113 = i1112 % 2;
        return z;
    }

    public abstract Object A(Object obj);

    public abstract void g(Object obj, View view);

    public abstract void h(Object obj, ArrayList<View> arrayList);

    public abstract void i(ViewGroup viewGroup, Object obj);

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[LOOP:0: B:22:0x0081->B:23:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c2  */
    public void j(ArrayList<View> arrayList, View view) {
        ViewGroup viewGroup;
        int childCount;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 & (-64)) | ((~i3) & 63)) - (~((i3 & 63) << 1))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            view.getVisibility();
            throw null;
        }
        if (view.getVisibility() == 0) {
            int i5 = b;
            int i6 = ((i5 & (-70)) | ((~i5) & 69)) + ((i5 & 69) << 1);
            a = i6 % 128;
            int i7 = 0;
            if (i6 % 2 == 0) {
                int i8 = 55 / 0;
                if (!(!(view instanceof ViewGroup))) {
                    int i9 = ((i5 ^ 48) + ((i5 & 48) << 1)) - 1;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    viewGroup = (ViewGroup) view;
                    if (viewGroup.isTransitionGroup()) {
                        int i11 = a;
                        i = (-2) - (((i11 ^ 26) + ((i11 & 26) << 1)) ^ (-1));
                        b = i % 128;
                        if (i % 2 == 0) {
                            arrayList.add(viewGroup);
                            return;
                        } else {
                            arrayList.add(viewGroup);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    childCount = viewGroup.getChildCount();
                    int i12 = a + 21;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    while (i7 < childCount) {
                        int i14 = a;
                        int i15 = ((i14 ^ 99) - (~(-(-((i14 & 99) << 1))))) - 1;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        j(arrayList, viewGroup.getChildAt(i7));
                        int i17 = b;
                        int i18 = ((i17 | 23) << 1) - (i17 ^ 23);
                        a = i18 % 128;
                        int i19 = i18 % 2;
                        int i20 = i7 & 1;
                        int i21 = (i7 ^ 1) | i20;
                        i7 = (i20 & i21) + (i20 | i21);
                        int i22 = i17 & 33;
                        int i23 = (i17 ^ 33) | i22;
                        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                        a = i24 % 128;
                        int i25 = i24 % 2;
                    }
                } else {
                    arrayList.add(view);
                    int i26 = b;
                    int i27 = i26 & 123;
                    int i28 = -(-(i26 | 123));
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    a = i29 % 128;
                    int i30 = i29 % 2;
                }
            } else if (view instanceof ViewGroup) {
                int i31 = ((i5 ^ 48) + ((i5 & 48) << 1)) - 1;
                a = i31 % 128;
                int i110 = i31 % 2;
                viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    int i111 = a;
                    i = (-2) - (((i111 ^ 26) + ((i111 & 26) << 1)) ^ (-1));
                    b = i % 128;
                    if (i % 2 == 0) {
                        arrayList.add(viewGroup);
                        return;
                    } else {
                        arrayList.add(viewGroup);
                        obj.hashCode();
                        throw null;
                    }
                }
                childCount = viewGroup.getChildCount();
                int i112 = a + 21;
                b = i112 % 128;
                int i113 = i112 % 2;
                while (i7 < childCount) {
                    int i114 = a;
                    int i115 = ((i114 ^ 99) - (~(-(-((i114 & 99) << 1))))) - 1;
                    b = i115 % 128;
                    int i116 = i115 % 2;
                    j(arrayList, viewGroup.getChildAt(i7));
                    int i117 = b;
                    int i118 = ((i117 | 23) << 1) - (i117 ^ 23);
                    a = i118 % 128;
                    int i119 = i118 % 2;
                    int i210 = i7 & 1;
                    int i211 = (i7 ^ 1) | i210;
                    i7 = (i210 & i211) + (i210 | i211);
                    int i212 = i117 & 33;
                    int i213 = (i117 ^ 33) | i212;
                    int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                    a = i214 % 128;
                    int i215 = i214 % 2;
                }
            } else {
                arrayList.add(view);
                int i216 = b;
                int i217 = i216 & 123;
                int i218 = -(-(i216 | 123));
                int i219 = (i217 ^ i218) + ((i218 & i217) << 1);
                a = i219 % 128;
                int i32 = i219 % 2;
            }
        }
        int i33 = a + 67;
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    public abstract boolean k(Object obj);

    public abstract Object l(Object obj);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    public abstract void q(Object obj, View view);

    public abstract void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void t(Object obj, View view, ArrayList<View> arrayList);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public void w(Fragment fragment, Object obj, c cVar, Runnable runnable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 71;
        int i4 = (((i2 & 71) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            runnable.run();
            int i5 = 61 / 0;
        } else {
            runnable.run();
        }
        int i6 = a;
        int i7 = i6 | 19;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 19)) & i7);
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 59 / 0;
        }
    }

    public abstract void x(Object obj, View view);

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);

    public void m(View view, Rect rect) {
        Matrix matrix;
        int i = 2 % 2;
        int i2 = (-2) - ((b + 52) ^ (-1));
        a = i2 % 128;
        int i3 = i2 % 2;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if (!T.aXa.c(view)) {
            int i4 = a;
            int i5 = ((((i4 ^ 65) | (i4 & 65)) << 1) - (~(-(((~i4) & 65) | (i4 & (-66)))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        RectF rectF = new RectF();
        int i7 = a;
        int i8 = (i7 & 85) + (i7 | 85);
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            throw null;
        }
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int i9 = b + 69;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            view.getMatrix().mapRect(rectF);
            view.getLeft();
            throw null;
        }
        view.getMatrix().mapRect(rectF);
        int left = view.getLeft();
        int i10 = a + 93;
        b = i10 % 128;
        int i11 = i10 % 2;
        rectF.offset(left, view.getTop());
        Object parent = view.getParent();
        int i12 = b;
        int i13 = ((i12 | 97) << 1) - (i12 ^ 97);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        int i14 = i12 + 65;
        a = i14 % 128;
        while (true) {
            int i15 = i14 % 2;
            if (!(parent instanceof View)) {
                break;
            }
            int i16 = b;
            int i17 = (-2) - (((i16 & 8) + (i16 | 8)) ^ (-1));
            a = i17 % 128;
            int i18 = i17 % 2;
            View view2 = (View) parent;
            float f = -view2.getScrollX();
            int i19 = a;
            int i20 = (i19 ^ 77) + ((i19 & 77) << 1);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                rectF.offset(f, -view2.getScrollY());
                matrix = view2.getMatrix();
                int i21 = 16 / 0;
            } else {
                rectF.offset(f, -view2.getScrollY());
                matrix = view2.getMatrix();
            }
            matrix.mapRect(rectF);
            float left2 = view2.getLeft();
            int i22 = b;
            int i23 = ((i22 & (-68)) | ((~i22) & 67)) + ((i22 & 67) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            rectF.offset(left2, view2.getTop());
            parent = view2.getParent();
            i14 = a + 81;
            b = i14 % 128;
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        int i25 = a + 35;
        b = i25 % 128;
        if (i25 % 2 != 0) {
            rectF.offset(iArr[0], iArr[1]);
        } else {
            rectF.offset(iArr[0], iArr[1]);
        }
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int i26 = a;
        int i27 = (-2) - ((((i26 | 106) << 1) - (i26 ^ 106)) ^ (-1));
        b = i27 % 128;
        int i28 = i27 % 2;
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        int i29 = a;
        int i30 = ((i29 ^ 109) | (i29 & 109)) << 1;
        int i31 = -(((~i29) & 109) | (i29 & (-110)));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            rect.set(iRound, iRound2, iRound3, iRound4);
            obj.hashCode();
            throw null;
        }
        rect.set(iRound, iRound2, iRound3, iRound4);
        int i33 = b;
        int i34 = (i33 & 99) + (i33 | 99);
        a = i34 % 128;
        int i35 = i34 % 2;
    }

    public ArrayList<String> o(ArrayList<View> arrayList) {
        int i = 2 % 2;
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i2 = a;
        int i3 = i2 ^ 5;
        int i4 = (i2 & 5) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 & 73;
        int i8 = -(-((i2 ^ 73) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 4 / 5;
        }
        int i11 = 0;
        while (i11 < size) {
            int i12 = b + 61;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                arrayList.get(i11);
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                throw null;
            }
            View view = arrayList.get(i11);
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
            int i13 = a;
            int i14 = i13 ^ 45;
            int i15 = (((i13 & 45) | i14) << 1) - i14;
            b = i15 % 128;
            if (i15 % 2 != 0) {
                arrayList2.add(T.aXb.l(view));
                int i16 = 86 / 0;
            } else {
                arrayList2.add(T.aXb.l(view));
            }
            T.aXb.x(view, null);
            i11++;
            int i17 = b;
            int i18 = ((i17 ^ 92) + ((i17 & 92) << 1)) - 1;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 4 % 5;
            }
        }
        int i20 = b;
        int i21 = i20 & 35;
        int i22 = i20 | 35;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        a = i23 % 128;
        if (i23 % 2 != 0) {
            return arrayList2;
        }
        throw null;
    }

    public void f(Map<String, View> map, View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 22) + ((i2 & 22) << 1)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            view.getVisibility();
            throw null;
        }
        if (view.getVisibility() == 0) {
            int i4 = a;
            int i5 = i4 & 73;
            int i6 = (i4 | 73) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aXb.l(view);
                throw null;
            }
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
            String strL = T.aXb.l(view);
            if (strL != null) {
                map.put(strL, view);
                int i9 = a;
                int i10 = ((i9 | 25) << 1) - (i9 ^ 25);
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            if (view instanceof ViewGroup) {
                int i12 = a;
                int i13 = (i12 | 43) << 1;
                int i14 = -(i12 ^ 43);
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i17 = 0;
                while (i17 < childCount) {
                    int i18 = a;
                    int i19 = i18 & 69;
                    int i20 = ((i18 ^ 69) | i19) << 1;
                    int i21 = -((i18 | 69) & (~i19));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    View childAt = viewGroup.getChildAt(i17);
                    int i24 = a;
                    int i25 = i24 ^ 53;
                    int i26 = -(-((i24 & 53) << 1));
                    int i27 = (i25 & i26) + (i26 | i25);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    f(map, childAt);
                    int i29 = i17 & 1;
                    int i30 = (i17 ^ 1) | i29;
                    i17 = ((i29 | i30) << 1) - (i30 ^ i29);
                    int i31 = b + 95;
                    a = i31 % 128;
                    int i32 = i31 % 2;
                }
            }
        }
        int i33 = a + 75;
        b = i33 % 128;
        if (i33 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ad A[PHI: r1
  0x00ad: PHI (r1v29 android.view.View) = (r1v18 android.view.View), (r1v34 android.view.View) binds: [B:24:0x00ab, B:21:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[SYNTHETIC] */
    public static void c(List<View> list, View view) {
        View view2;
        int i;
        ViewGroup viewGroup;
        int childCount;
        int i2;
        View childAt;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 | 117) << 1) - (i6 ^ 117);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            d(list, view, list.size());
            obj.hashCode();
            throw null;
        }
        int size = list.size();
        if (d(list, view, size)) {
            int i8 = b;
            int i9 = i8 & 121;
            int i10 = (((i8 | 121) & (~i9)) - (~(i9 << 1))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if (T.aXb.l(view) != null) {
            int i12 = a + 28;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            list.add(view);
            if (i14 != 0) {
                obj.hashCode();
                throw null;
            }
            int i15 = b;
            int i16 = i15 | 107;
            int i17 = i16 << 1;
            int i18 = -((~(i15 & 107)) & i16);
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = b;
        int i22 = (-2) - ((((i21 | 108) << 1) - (i21 ^ 108)) ^ (-1));
        a = i22 % 128;
        int i23 = i22 % 2;
        int i24 = size;
        while (i24 < list.size()) {
            int i25 = a;
            int i26 = (i25 & (-70)) | ((~i25) & 69);
            int i27 = -(-((i25 & 69) << 1));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            b = i28 % 128;
            if (i28 % 2 != 0) {
                view2 = list.get(i24);
                int i29 = 91 / 0;
                if (view2 instanceof ViewGroup) {
                    i = a + 117;
                    b = i % 128;
                    if (i % 2 != 0) {
                        viewGroup = (ViewGroup) view2;
                        childCount = viewGroup.getChildCount();
                        i2 = 1;
                    } else {
                        viewGroup = (ViewGroup) view2;
                        childCount = viewGroup.getChildCount();
                        i2 = 0;
                    }
                    while (i2 < childCount) {
                        int i30 = a + 105;
                        b = i30 % 128;
                        int i31 = i30 % 2;
                        childAt = viewGroup.getChildAt(i2);
                        if (!d(list, childAt, size)) {
                            int i32 = b;
                            int i33 = i32 ^ 125;
                            int i34 = -(-((i32 & 125) << 1));
                            i3 = (i33 ^ i34) + ((i34 & i33) << 1);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i35 = 58 / 0;
                                if (T.aXb.l(childAt) != null) {
                                    list.add(childAt);
                                    i4 = b + 91;
                                    a = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        int i36 = 2 % 5;
                                    }
                                }
                            } else if (T.aXb.l(childAt) != null) {
                                list.add(childAt);
                                i4 = b + 91;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i37 = 2 % 5;
                                }
                            }
                        }
                        int i38 = i2 & (-82);
                        int i39 = ((i2 | (-82)) & (~i38)) + (i38 << 1);
                        i2 = (-2) - (((i39 ^ 84) + ((i39 & 84) << 1)) ^ (-1));
                        int i40 = a;
                        int i41 = ((i40 | 45) << 1) - (i40 ^ 45);
                        b = i41 % 128;
                        int i42 = i41 % 2;
                    }
                }
            } else {
                view2 = list.get(i24);
                if (view2 instanceof ViewGroup) {
                    i = a + 117;
                    b = i % 128;
                    if (i % 2 != 0) {
                        viewGroup = (ViewGroup) view2;
                        childCount = viewGroup.getChildCount();
                        i2 = 1;
                    } else {
                        viewGroup = (ViewGroup) view2;
                        childCount = viewGroup.getChildCount();
                        i2 = 0;
                    }
                    while (i2 < childCount) {
                        int i310 = a + 105;
                        b = i310 % 128;
                        int i311 = i310 % 2;
                        childAt = viewGroup.getChildAt(i2);
                        if (!d(list, childAt, size)) {
                            int i312 = b;
                            int i313 = i312 ^ 125;
                            int i314 = -(-((i312 & 125) << 1));
                            i3 = (i313 ^ i314) + ((i314 & i313) << 1);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i315 = 58 / 0;
                                if (T.aXb.l(childAt) != null) {
                                    list.add(childAt);
                                    i4 = b + 91;
                                    a = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        int i316 = 2 % 5;
                                    }
                                }
                            } else if (T.aXb.l(childAt) != null) {
                                list.add(childAt);
                                i4 = b + 91;
                                a = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i317 = 2 % 5;
                                }
                            }
                        }
                        int i318 = i2 & (-82);
                        int i319 = ((i2 | (-82)) & (~i318)) + (i318 << 1);
                        i2 = (-2) - (((i319 ^ 84) + ((i319 & 84) << 1)) ^ (-1));
                        int i43 = a;
                        int i44 = ((i43 | 45) << 1) - (i43 ^ 45);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
            }
            int i46 = (((i24 ^ (-117)) | (i24 & (-117))) << 1) - (((~i24) & (-117)) | (i24 & 116));
            int i47 = i46 & 118;
            int i48 = ((i46 ^ 118) | i47) << 1;
            int i49 = -((i46 | 118) & (~i47));
            i24 = ((i48 | i49) << 1) - (i48 ^ i49);
            int i50 = a + 119;
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = b;
        int i53 = (i52 ^ 63) + ((i52 & 63) << 1);
        a = i53 % 128;
        if (i53 % 2 == 0) {
            int i54 = 28 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        String strL;
        int i = 2 % 2;
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        int i2 = a;
        int i3 = i2 & 91;
        int i4 = -(-((i2 ^ 91) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            Object obj = null;
            if (i7 >= size) {
                aYR ayr = new aYR(this, size, arrayList2, arrayList3, arrayList, arrayList4);
                int i8 = b;
                int i9 = ((((i8 ^ 85) | (i8 & 85)) << 1) - (~(-(((~i8) & 85) | (i8 & (-86)))))) - 1;
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    x.c(view, ayr);
                    return;
                } else {
                    x.c(view, ayr);
                    throw null;
                }
            }
            int i10 = a;
            int i11 = ((i10 & 97) - (~(-(-(i10 | 97))))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            View view2 = arrayList.get(i7);
            int i13 = a;
            int i14 = i13 & 45;
            int i15 = i14 + ((i13 ^ 45) | i14);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                strL = T.aXb.l(view2);
                int i16 = 10 / 0;
            } else {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                strL = T.aXb.l(view2);
            }
            int i17 = a + 33;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                arrayList4.add(strL);
                obj.hashCode();
                throw null;
            }
            arrayList4.add(strL);
            if (strL == null) {
                break;
                break;
            }
            T.aXb.x(view2, null);
            int i18 = b;
            int i19 = (i18 ^ 5) + ((i18 & 5) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            String str = (String) ((t) map).getOrDefault(strL, null);
            int i21 = b;
            int i22 = (i21 ^ 63) + ((i21 & 63) << 1);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 4 / 3;
            }
            int i24 = 0;
            while (true) {
                if (i24 >= size) {
                    break;
                }
                int i25 = b;
                int i26 = i25 | 35;
                int i27 = ((i26 << 1) - (~(-((~(i25 & 35)) & i26)))) - 1;
                a = i27 % 128;
                int i28 = i27 % 2;
                if (!(!str.equals(arrayList3.get(i24)))) {
                    int i29 = b;
                    int i30 = ((i29 & 122) + (i29 | 122)) - 1;
                    a = i30 % 128;
                    if (i30 % 2 == 0) {
                        T.aXb.x(arrayList2.get(i24), strL);
                        int i31 = 11 / 0;
                    } else {
                        T.aXb.x(arrayList2.get(i24), strL);
                    }
                    int i32 = b;
                    int i33 = i32 & 113;
                    int i34 = -(-((i32 ^ 113) | i33));
                    int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                    a = i35 % 128;
                    if (i35 % 2 != 0) {
                        break;
                    }
                    int i36 = 3 / 4;
                    break;
                }
                i24++;
                int i37 = b;
                int i38 = i37 & 123;
                int i39 = (i38 - (~(-(-((i37 ^ 123) | i38))))) - 1;
                a = i39 % 128;
                int i40 = i39 % 2;
            }
            int i41 = i7 + 107;
            i7 = (i41 | (-106)) + (i41 & (-106));
            int i42 = b + 51;
            a = i42 % 128;
            int i43 = i42 % 2;
        }
    }
}
