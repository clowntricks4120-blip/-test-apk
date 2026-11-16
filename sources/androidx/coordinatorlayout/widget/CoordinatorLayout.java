package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p003ac.e;
import ivas.gov.bisp.enumeration.p005ae.z;
import ivas.gov.bisp.enumeration.p010aj.L;
import ivas.gov.bisp.enumeration.p010aj.S;
import ivas.gov.bisp.enumeration.p081d.C0284l;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0282a;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0289t;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import ivas.gov.bisp.enumeration.p081d.u;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0289t, u {
    public static final Comparator<View> a;
    public static final String b;
    public static final Class<?>[] c;
    public static final ThreadLocal<Map<String, Constructor<OooO0OO>>> d;
    public static final S e;
    public boolean f;
    public final List<View> g;
    public final e h;
    public final List<View> i;
    public final int[] j;
    public final List<View> k;
    public final int[] l;
    public boolean m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f18o;
    public View p;
    public boolean q;
    public OooOO0O r;
    public am s;
    public boolean t;
    public ViewGroup.OnHierarchyChangeListener u;
    public Drawable v;
    public InterfaceC0282a w;
    public final C0284l x;

    public class OooO implements ViewGroup.OnHierarchyChangeListener {
        public OooO() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.x(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OooO00o implements InterfaceC0282a {
        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0282a
        public am b(View view, am amVar) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.s, amVar)) {
                coordinatorLayout.s = amVar;
                boolean z = amVar.j() > 0;
                coordinatorLayout.t = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!amVar.k()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, R> weakHashMap = T.c;
                        if (T.aWX.d(childAt) && ((OooOO0) childAt.getLayoutParams()).b != null && amVar.k()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return amVar;
        }
    }

    public interface OooO0O0 {
        OooO0OO getBehavior();
    }

    public static abstract class OooO0OO<V extends View> {
        public OooO0OO() {
        }

        public boolean c(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void f(OooOO0 oooOO0) {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void h() {
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        public void n(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public void o(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public Parcelable q(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public OooO0OO(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface OooO0o {
        Class<? extends OooO0OO> value();
    }

    public class OooOO0O implements ViewTreeObserver.OnPreDrawListener {
        public OooOO0O() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.x(0);
            return true;
        }
    }

    public static class OooOOO implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            WeakHashMap<View, R> weakHashMap = T.c;
            float fO = T.aXb.o(view);
            float fO2 = T.aXb.o(view2);
            if (fO > fO2) {
                return -1;
            }
            return fO < fO2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        b = r0 != null ? r0.getName() : null;
        a = new OooOOO();
        c = new Class[]{Context.class, AttributeSet.class};
        d = new ThreadLocal<>();
        e = new L(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.coordinatorLayoutStyle);
        this.g = new ArrayList();
        this.h = new e(1);
        this.i = new ArrayList();
        this.k = new ArrayList();
        this.j = new int[2];
        this.l = new int[2];
        this.x = new C0284l();
        int[] iArr = r.p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, ivas.gov.bisp.enumeration.R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, ivas.gov.bisp.enumeration.R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.n = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.n.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.n;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.v = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        F();
        super.setOnHierarchyChangeListener(new OooO());
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aWX.e(this) == 0) {
            T.aWX.t(this, 1);
        }
    }

    public static Rect c() {
        Rect rect = (Rect) e.e();
        return rect == null ? new Rect() : rect;
    }

    public final void A(View view, int i) {
        OooOO0 oooOO0 = (OooOO0) view.getLayoutParams();
        int i2 = oooOO0.a;
        if (i2 != i) {
            WeakHashMap<View, R> weakHashMap = T.c;
            view.offsetLeftAndRight(i - i2);
            oooOO0.a = i;
        }
    }

    public final boolean B(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.i;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = a;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zJ = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            OooOO0 oooOO0 = (OooOO0) view.getLayoutParams();
            OooO0OO oooO0OO = oooOO0.b;
            if (!(zJ || z2) || actionMasked == 0) {
                if (!zJ && oooO0OO != null) {
                    if (i == 0) {
                        zJ = oooO0OO.j(this, view, motionEvent);
                    } else if (i == 1) {
                        zJ = oooO0OO.s(this, view, motionEvent);
                    }
                    if (zJ) {
                        this.f18o = view;
                    }
                }
                if (oooOO0.b == null) {
                    oooOO0.n = false;
                }
                boolean z3 = oooOO0.n;
                if (z3) {
                    z = true;
                } else {
                    oooOO0.n = z3;
                    z = z3;
                }
                z2 = z && !z3;
                if (z && !z2) {
                    break;
                }
            } else if (oooO0OO != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    oooO0OO.j(this, view, motionEventObtain);
                } else if (i == 1) {
                    oooO0OO.s(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zJ;
    }

    public void C(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:94:0x0088 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0094
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void D() {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.D():void");
    }

    public final void E(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            OooO0OO oooO0OO = ((OooOO0) childAt.getLayoutParams()).b;
            if (oooO0OO != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    oooO0OO.j(this, childAt, motionEventObtain);
                } else {
                    oooO0OO.s(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((OooOO0) getChildAt(i2).getLayoutParams()).n = false;
        }
        this.f18o = null;
        this.m = false;
    }

    public final void F() {
        WeakHashMap<View, R> weakHashMap = T.c;
        if (!T.aWX.d(this)) {
            T.aXb.v(this, null);
            return;
        }
        if (this.w == null) {
            this.w = new OooO00o();
        }
        T.aXb.v(this, this.w);
        setSystemUiVisibility(1280);
    }

    public final void G(View view, int i) {
        OooOO0 oooOO0 = (OooOO0) view.getLayoutParams();
        int i2 = oooOO0.j;
        if (i2 != i) {
            WeakHashMap<View, R> weakHashMap = T.c;
            view.offsetTopAndBottom(i - i2);
            oooOO0.j = i;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof OooOO0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        OooO0OO oooO0OO = ((OooOO0) view.getLayoutParams()).b;
        if (oooO0OO != null) {
            Objects.requireNonNull(oooO0OO);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(OooOO0 oooOO0, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int i3 = ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin;
        int i4 = paddingLeft + i3;
        int iMax = Math.max(i4, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin));
        int paddingTop = getPaddingTop();
        int i5 = ((ViewGroup.MarginLayoutParams) oooOO0).topMargin;
        int i6 = paddingTop + i5;
        int iMax2 = Math.max(i6, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public void f(View view) {
        List list = (List) ((t) this.h.d).getOrDefault(view, null);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            OooO0OO oooO0OO = ((OooOO0) view2.getLayoutParams()).b;
            if (oooO0OO != null) {
                oooO0OO.g(this, view2, view);
            }
        }
    }

    public void g(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            l(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooOO0(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooOO0(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        D();
        return Collections.unmodifiableList(this.g);
    }

    public final am getLastWindowInsets() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.d();
    }

    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void h(View view, int i) {
        C0284l c0284l = this.x;
        if (i == 1) {
            c0284l.d = 0;
        } else {
            c0284l.c = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OooOO0 oooOO0 = (OooOO0) childAt.getLayoutParams();
            if (oooOO0.f(i)) {
                OooO0OO oooO0OO = oooOO0.b;
                if (oooO0OO != null) {
                    oooO0OO.t(this, childAt, view, i);
                }
                oooOO0.g(i, false);
                oooOO0.p = false;
            }
        }
        this.p = null;
    }

    public List<View> i(View view) {
        List list = (List) ((t) this.h.d).getOrDefault(view, null);
        this.k.clear();
        if (list != null) {
            this.k.addAll(list);
        }
        return this.k;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public boolean j(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                OooOO0 oooOO0 = (OooOO0) childAt.getLayoutParams();
                OooO0OO oooO0OO = oooOO0.b;
                if (oooO0OO != null) {
                    boolean zR = oooO0OO.r(this, childAt, view, view2, i, i2);
                    z |= zR;
                    oooOO0.g(i2, zR);
                } else {
                    oooOO0.g(i2, false);
                }
            }
        }
        return z;
    }

    public List<View> k(View view) {
        e eVar = this.h;
        int i = ((t) eVar.d).i;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((t) eVar.d).n(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((t) eVar.d).k(i2));
            }
        }
        this.k.clear();
        if (arrayList != null) {
            this.k.addAll(arrayList);
        }
        return this.k;
    }

    public void l(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = z.c;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = z.c;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        z.b(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = z.d;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void n(View view, View view2, int i, int i2) {
        C0284l c0284l = this.x;
        if (i2 == 1) {
            c0284l.d = i;
        } else {
            c0284l.c = i;
        }
        this.p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((OooOO0) getChildAt(i3).getLayoutParams()).f(i2);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        OooO0OO oooO0OO;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                OooOO0 oooOO0 = (OooOO0) childAt.getLayoutParams();
                if (oooOO0.f(i3) && (oooO0OO = oooOO0.b) != null) {
                    int[] iArr2 = this.j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    oooO0OO.m(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.j;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.j;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            x(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        E(false);
        if (this.q) {
            if (this.r == null) {
                this.r = new OooOO0O();
            }
            getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if (this.s == null) {
            WeakHashMap<View, R> weakHashMap = T.c;
            if (T.aWX.d(this)) {
                T.aXd.d(this);
            }
        }
        this.f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        E(false);
        if (this.q && this.r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        View view = this.p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.t || this.v == null) {
            return;
        }
        am amVar = this.s;
        int iJ = amVar != null ? amVar.j() : 0;
        if (iJ > 0) {
            this.v.setBounds(0, 0, getWidth(), iJ);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            E(true);
        }
        boolean zB = B(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            E(true);
        }
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO0OO oooO0OO;
        WeakHashMap<View, R> weakHashMap = T.c;
        int iF = T.aWY.f(this);
        int size = this.g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.g.get(i5);
            if (view.getVisibility() != 8 && ((oooO0OO = ((OooOO0) view.getLayoutParams()).b) == null || !oooO0OO.k(this, view, iF))) {
                z(view, iF);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        OooO0OO oooO0OO;
        int i8;
        int i9;
        int i10;
        D();
        int childCount = getChildCount();
        int i11 = 0;
        loop0: while (true) {
            if (i11 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = this.h;
            int i12 = ((t) eVar.d).i;
            for (int i13 = 0; i13 < i12; i13++) {
                ArrayList arrayList = (ArrayList) ((t) eVar.d).n(i13);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i11++;
        }
        if (z != this.q) {
            if (z) {
                if (this.f) {
                    if (this.r == null) {
                        this.r = new OooOO0O();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.r);
                }
                this.q = true;
            } else {
                if (this.f && this.r != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.r);
                }
                this.q = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, R> weakHashMap = T.c;
        int iF = T.aWY.f(this);
        boolean z3 = iF == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.s != null && T.aWX.d(this);
        int size3 = this.g.size();
        int iMax2 = suggestedMinimumWidth;
        int iMax3 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i14 = 0;
        while (i14 < size3) {
            View view = this.g.get(i14);
            if (view.getVisibility() != 8) {
                OooOO0 oooOO0 = (OooOO0) view.getLayoutParams();
                int i15 = oooOO0.g;
                if (i15 < 0 || mode == 0) {
                    i6 = iCombineMeasuredStates;
                    i7 = i14;
                } else {
                    int iS = s(i15);
                    i6 = iCombineMeasuredStates;
                    int i16 = oooOO0.d;
                    if (i16 == 0) {
                        i16 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i16, iF) & 7;
                    i7 = i14;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iS);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iS - paddingLeft);
                    }
                    if (z4 || T.aWX.d(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iH = this.s.h();
                        int i17 = this.s.i();
                        int iJ = this.s.j();
                        int iG = this.s.g();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (i17 + iH), mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - (iG + iJ), mode2);
                    }
                    oooO0OO = oooOO0.b;
                    if (oooO0OO != null) {
                        int i18 = i6;
                        i3 = i7;
                        z2 = false;
                        i9 = i18;
                        i10 = iMax3;
                        i8 = iMax2;
                        i4 = size3;
                        i5 = mode2;
                        if (!oooO0OO.c(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        iMax2 = Math.max(i8, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin + ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin);
                        iMax3 = Math.max(i10, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) oooOO0).topMargin + ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    } else {
                        i8 = iMax2;
                        i4 = size3;
                        i9 = i6;
                        i3 = i7;
                        i10 = iMax3;
                        z2 = false;
                        i5 = mode2;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    iMax2 = Math.max(i8, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin + ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin);
                    iMax3 = Math.max(i10, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) oooOO0).topMargin + ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                }
                iMax = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                oooO0OO = oooOO0.b;
                if (oooO0OO != null) {
                    int i19 = i6;
                    i3 = i7;
                    z2 = false;
                    i9 = i19;
                    i10 = iMax3;
                    i8 = iMax2;
                    i4 = size3;
                    i5 = mode2;
                    if (!oooO0OO.c(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    iMax2 = Math.max(i8, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin + ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin);
                    iMax3 = Math.max(i10, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) oooOO0).topMargin + ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                } else {
                    i8 = iMax2;
                    i4 = size3;
                    i9 = i6;
                    i3 = i7;
                    i10 = iMax3;
                    z2 = false;
                    i5 = mode2;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                iMax2 = Math.max(i8, view.getMeasuredWidth() + paddingLeft + paddingRight + ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin + ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin);
                iMax3 = Math.max(i10, view.getMeasuredHeight() + paddingTop + paddingBottom + ((ViewGroup.MarginLayoutParams) oooOO0).topMargin + ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
            } else {
                i3 = i14;
                i4 = size3;
                i5 = mode2;
                z2 = false;
                iCombineMeasuredStates = iCombineMeasuredStates;
            }
            i14 = i3 + 1;
            size3 = i4;
            mode2 = i5;
        }
        int i20 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(iMax2, i, (-16777216) & i20), View.resolveSizeAndState(iMax3, i2, i20 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                OooOO0 oooOO0 = (OooOO0) childAt.getLayoutParams();
                if (oooOO0.f(0)) {
                    OooO0OO oooO0OO = oooOO0.b;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        OooO0OO oooO0OO;
        int childCount = getChildCount();
        boolean zL = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                OooOO0 oooOO0 = (OooOO0) childAt.getLayoutParams();
                if (oooOO0.f(0) && (oooO0OO = oooOO0.b) != null) {
                    zL |= oooO0OO.l(this, childAt, view, f, f2);
                }
            }
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        r(view, i, i2, i3, i4, 0, this.l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        n(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof OooOOO0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooOOO0 oooOOO0 = (OooOOO0) parcelable;
        super.onRestoreInstanceState(oooOOO0.e);
        SparseArray<Parcelable> sparseArray = oooOOO0.b;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            OooO0OO oooO0OO = w(childAt).b;
            if (id != -1 && oooO0OO != null && (parcelable2 = sparseArray.get(id)) != null) {
                oooO0OO.o(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableQ;
        OooOOO0 oooOOO0 = new OooOOO0(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            OooO0OO oooO0OO = ((OooOO0) childAt.getLayoutParams()).b;
            if (id != -1 && oooO0OO != null && (parcelableQ = oooO0OO.q(this, childAt)) != null) {
                sparseArray.append(id, parcelableQ);
            }
        }
        oooOOO0.b = sparseArray;
        return oooOOO0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return j(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
  0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB;
        boolean zS;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18o == null) {
            zB = B(motionEvent, 1);
            if (!zB) {
                zS = false;
            }
            motionEventObtain = null;
            if (this.f18o == null) {
                zS |= super.onTouchEvent(motionEvent);
            } else if (zB) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                E(false);
            }
            return zS;
        }
        zB = false;
        OooO0OO oooO0OO = ((OooOO0) this.f18o.getLayoutParams()).b;
        if (oooO0OO != null) {
            zS = oooO0OO.s(this, this.f18o, motionEvent);
        } else {
            zS = false;
        }
        motionEventObtain = null;
        if (this.f18o == null) {
            zS |= super.onTouchEvent(motionEvent);
        } else if (zB) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            E(false);
        } else {
            E(false);
        }
        return zS;
    }

    public final void p(int i, Rect rect, Rect rect2, OooOO0 oooOO0, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = oooOO0.d;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = oooOO0.e;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void q(View view, int i, int i2, int i3, int i4, int i5) {
        r(view, i, i2, i3, i4, 0, this.l);
    }

    @Override // ivas.gov.bisp.enumeration.p081d.u
    public void r(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooO0OO oooO0OO;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                OooOO0 oooOO0 = (OooOO0) childAt.getLayoutParams();
                if (oooOO0.f(i5) && (oooO0OO = oooOO0.b) != null) {
                    int[] iArr2 = this.j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    oooO0OO.n(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.j;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, this.j[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, this.j[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            x(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        OooO0OO oooO0OO = ((OooOO0) view.getLayoutParams()).b;
        if (oooO0OO == null || !oooO0OO.p(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.m) {
            return;
        }
        E(false);
        this.m = true;
    }

    public final int s(int i) {
        int[] iArr = this.n;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Keyline index ");
        sb2.append(i);
        sb2.append(" out of range for ");
        sb2.append(this);
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        F();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.v = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable3 = this.v;
                WeakHashMap<View, R> weakHashMap = T.c;
                drawable3.setLayoutDirection(T.aWY.f(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            WeakHashMap<View, R> weakHashMap2 = T.c;
            T.aWX.l(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawableC;
        if (i != 0) {
            Context context = getContext();
            Object obj = l.c;
            drawableC = l.aUH.c(context, i);
        } else {
            drawableC = null;
        }
        setStatusBarBackground(drawableC);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.v;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.v.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0 w(View view) {
        OooOO0 oooOO0 = (OooOO0) view.getLayoutParams();
        if (!oooOO0.c) {
            if (view instanceof OooO0O0) {
                OooO0OO behavior = ((OooO0O0) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                OooO0OO oooO0OO = oooOO0.b;
                if (oooO0OO != behavior) {
                    if (oooO0OO != null) {
                        oooO0OO.h();
                    }
                    oooOO0.b = behavior;
                    oooOO0.c = true;
                    if (behavior != null) {
                        behavior.f(oooOO0);
                    }
                }
                oooOO0.c = true;
            } else {
                OooO0o oooO0o = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    oooO0o = (OooO0o) superclass.getAnnotation(OooO0o.class);
                    if (oooO0o != null) {
                        break;
                    }
                }
                if (oooO0o != null) {
                    try {
                        OooO0OO oooO0OONewInstance = oooO0o.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        OooO0OO oooO0OO2 = oooOO0.b;
                        if (oooO0OO2 != oooO0OONewInstance) {
                            if (oooO0OO2 != null) {
                                oooO0OO2.h();
                            }
                            oooOO0.b = oooO0OONewInstance;
                            oooOO0.c = true;
                            if (oooO0OONewInstance != null) {
                                oooO0OONewInstance.f(oooOO0);
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder sbW = j.w("Default behavior class ");
                        sbW.append(oooO0o.value().getName());
                        sbW.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sbW.toString(), e2);
                    }
                }
                oooOO0.c = true;
            }
        }
        return oooOO0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    public final void x(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean zG;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        View view;
        OooO0OO oooO0OO;
        WeakHashMap<View, R> weakHashMap = T.c;
        int iF = T.aWY.f(this);
        int size = this.g.size();
        Rect rectC = c();
        Rect rectC2 = c();
        Rect rectC3 = c();
        int i10 = 0;
        while (i10 < size) {
            View view2 = this.g.get(i10);
            OooOO0 oooOO0 = (OooOO0) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                i3 = size;
                rect = rectC3;
                i2 = i10;
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    if (oooOO0.l == this.g.get(i11)) {
                        OooOO0 oooOO1 = (OooOO0) view2.getLayoutParams();
                        if (oooOO1.k != null) {
                            Rect rectC4 = c();
                            Rect rectC5 = c();
                            Rect rectC6 = c();
                            l(oooOO1.k, rectC4);
                            g(view2, false, rectC5);
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            view = view2;
                            p(iF, rectC4, rectC6, oooOO1, measuredWidth, measuredHeight);
                            boolean z3 = (rectC6.left == rectC5.left && rectC6.top == rectC5.top) ? false : true;
                            e(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00af: INVOKE 
                                  (r24v0 'this' androidx.coordinatorlayout.widget.CoordinatorLayout A[IMMUTABLE_TYPE, THIS])
                                  (r20v0 androidx.coordinatorlayout.widget.CoordinatorLayout$OooOO0)
                                  (r14v2 'rectC6' android.graphics.Rect)
                                  (r3v25 'measuredWidth' int)
                                  (r10v9 'measuredHeight' int)
                                 VIRTUAL call: androidx.coordinatorlayout.widget.CoordinatorLayout.e(androidx.coordinatorlayout.widget.CoordinatorLayout$OooOO0, android.graphics.Rect, int, int):void A[MD:(androidx.coordinatorlayout.widget.CoordinatorLayout$OooOO0, android.graphics.Rect, int, int):void (m)] (LINE:23) in method: androidx.coordinatorlayout.widget.CoordinatorLayout.x(int):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 androidx.coordinatorlayout.widget.CoordinatorLayout$OooOO0
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 757
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.x(int):void");
                        }

                        public boolean y(View view, int i, int i2) {
                            Rect rectC = c();
                            l(view, rectC);
                            try {
                                return rectC.contains(i, i2);
                            } finally {
                                rectC.setEmpty();
                                e.g(rectC);
                            }
                        }

                        public void z(View view, int i) {
                            int i2;
                            OooOO0 oooOO0 = (OooOO0) view.getLayoutParams();
                            View view2 = oooOO0.k;
                            if (view2 == null && oooOO0.f != -1) {
                                throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
                            }
                            if (view2 != null) {
                                Rect rectC = c();
                                Rect rectC2 = c();
                                try {
                                    l(view2, rectC);
                                    OooOO0 oooOO1 = (OooOO0) view.getLayoutParams();
                                    int measuredWidth = view.getMeasuredWidth();
                                    int measuredHeight = view.getMeasuredHeight();
                                    p(i, rectC, rectC2, oooOO1, measuredWidth, measuredHeight);
                                    e(oooOO1, rectC2, measuredWidth, measuredHeight);
                                    view.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
                                    return;
                                } finally {
                                    rectC.setEmpty();
                                    S s = e;
                                    s.g(rectC);
                                    rectC2.setEmpty();
                                    s.g(rectC2);
                                }
                            }
                            int i3 = oooOO0.g;
                            if (i3 >= 0) {
                                OooOO0 oooOO2 = (OooOO0) view.getLayoutParams();
                                int i4 = oooOO2.d;
                                if (i4 == 0) {
                                    i4 = 8388661;
                                }
                                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                                int i5 = absoluteGravity & 7;
                                int i6 = absoluteGravity & 112;
                                int width = getWidth();
                                int height = getHeight();
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                if (i == 1) {
                                    i3 = width - i3;
                                }
                                int iS = s(i3) - measuredWidth2;
                                if (i5 == 1) {
                                    iS += measuredWidth2 / 2;
                                } else if (i5 == 5) {
                                    iS += measuredWidth2;
                                }
                                if (i6 != 16) {
                                    i2 = i6 != 80 ? 0 : measuredHeight2;
                                } else {
                                    i2 = measuredHeight2 / 2;
                                }
                                int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooOO2).leftMargin, Math.min(iS, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) oooOO2).rightMargin));
                                int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooOO2).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) oooOO2).bottomMargin));
                                view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
                                return;
                            }
                            OooOO0 oooOO3 = (OooOO0) view.getLayoutParams();
                            Rect rectC3 = c();
                            rectC3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooOO3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) oooOO3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooOO3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooOO3).bottomMargin);
                            if (this.s != null) {
                                WeakHashMap<View, R> weakHashMap = T.c;
                                if (T.aWX.d(this) && !T.aWX.d(view)) {
                                    rectC3.left = this.s.h() + rectC3.left;
                                    rectC3.top = this.s.j() + rectC3.top;
                                    rectC3.right -= this.s.i();
                                    rectC3.bottom -= this.s.g();
                                }
                            }
                            Rect rectC4 = c();
                            int i7 = oooOO3.d;
                            if ((i7 & 7) == 0) {
                                i7 |= 8388611;
                            }
                            if ((i7 & 112) == 0) {
                                i7 |= 48;
                            }
                            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), rectC3, rectC4, i);
                            view.layout(rectC4.left, rectC4.top, rectC4.right, rectC4.bottom);
                            rectC3.setEmpty();
                            S s2 = e;
                            s2.g(rectC3);
                            rectC4.setEmpty();
                            s2.g(rectC4);
                        }

                        @Override // android.view.ViewGroup
                        public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
                            if (layoutParams instanceof OooOO0) {
                                return new OooOO0((OooOO0) layoutParams);
                            }
                            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooOO0((ViewGroup.MarginLayoutParams) layoutParams) : new OooOO0(layoutParams);
                        }

                        public static class OooOOO0 extends ivas.gov.bisp.enumeration.p103z.l {
                            public static final Parcelable.Creator<OooOOO0> CREATOR = new OooO00o();
                            public SparseArray<Parcelable> b;

                            public static final class OooO00o implements Parcelable.ClassLoaderCreator<OooOOO0> {
                                @Override // android.os.Parcelable.ClassLoaderCreator
                                public final OooOOO0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                                    return new OooOOO0(parcel, classLoader);
                                }

                                @Override // android.os.Parcelable.Creator
                                public final Object[] newArray(int i) {
                                    return new OooOOO0[i];
                                }

                                @Override // android.os.Parcelable.Creator
                                public final Object createFromParcel(Parcel parcel) {
                                    return new OooOOO0(parcel, null);
                                }
                            }

                            public OooOOO0(Parcel parcel, ClassLoader classLoader) {
                                super(parcel, classLoader);
                                int i = parcel.readInt();
                                int[] iArr = new int[i];
                                parcel.readIntArray(iArr);
                                Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
                                this.b = new SparseArray<>(i);
                                for (int i2 = 0; i2 < i; i2++) {
                                    this.b.append(iArr[i2], parcelableArray[i2]);
                                }
                            }

                            @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
                            public void writeToParcel(Parcel parcel, int i) {
                                parcel.writeParcelable(this.e, i);
                                SparseArray<Parcelable> sparseArray = this.b;
                                int size = sparseArray != null ? sparseArray.size() : 0;
                                parcel.writeInt(size);
                                int[] iArr = new int[size];
                                Parcelable[] parcelableArr = new Parcelable[size];
                                for (int i2 = 0; i2 < size; i2++) {
                                    iArr[i2] = this.b.keyAt(i2);
                                    parcelableArr[i2] = this.b.valueAt(i2);
                                }
                                parcel.writeIntArray(iArr);
                                parcel.writeParcelableArray(parcelableArr, i);
                            }

                            public OooOOO0(Parcelable parcelable) {
                                super(parcelable);
                            }
                        }

                        public static class OooOO0 extends ViewGroup.MarginLayoutParams {
                            public int a;
                            public OooO0OO b;
                            public boolean c;
                            public int d;
                            public int e;
                            public int f;
                            public int g;
                            public int h;
                            public int i;
                            public int j;
                            public View k;
                            public View l;
                            public boolean m;
                            public boolean n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            public boolean f19o;
                            public boolean p;
                            public final Rect q;

                            public OooOO0(int i, int i2) {
                                super(i, i2);
                                this.c = false;
                                this.d = 0;
                                this.e = 0;
                                this.g = -1;
                                this.f = -1;
                                this.h = 0;
                                this.i = 0;
                                this.q = new Rect();
                            }

                            public boolean f(int i) {
                                if (i == 0) {
                                    return this.m;
                                }
                                if (i != 1) {
                                    return false;
                                }
                                return this.f19o;
                            }

                            public void g(int i, boolean z) {
                                if (i == 0) {
                                    this.m = z;
                                } else if (i == 1) {
                                    this.f19o = z;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public OooOO0(Context context, AttributeSet attributeSet) {
                                OooO0OO oooO0OONewInstance;
                                super(context, attributeSet);
                                this.c = false;
                                this.d = 0;
                                this.e = 0;
                                this.g = -1;
                                this.f = -1;
                                this.h = 0;
                                this.i = 0;
                                this.q = new Rect();
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.q);
                                this.d = typedArrayObtainStyledAttributes.getInteger(0, 0);
                                this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                                this.e = typedArrayObtainStyledAttributes.getInteger(2, 0);
                                this.g = typedArrayObtainStyledAttributes.getInteger(6, -1);
                                this.h = typedArrayObtainStyledAttributes.getInt(5, 0);
                                this.i = typedArrayObtainStyledAttributes.getInt(4, 0);
                                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
                                this.c = zHasValue;
                                if (zHasValue) {
                                    String string = typedArrayObtainStyledAttributes.getString(3);
                                    String str = CoordinatorLayout.b;
                                    if (TextUtils.isEmpty(string)) {
                                        oooO0OONewInstance = null;
                                    } else {
                                        if (string.startsWith(".")) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(context.getPackageName());
                                            sb.append(string);
                                            string = sb.toString();
                                        } else if (string.indexOf(46) < 0) {
                                            String str2 = CoordinatorLayout.b;
                                            if (!TextUtils.isEmpty(str2)) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str2);
                                                sb2.append('.');
                                                sb2.append(string);
                                                string = sb2.toString();
                                            }
                                        }
                                        try {
                                            ThreadLocal<Map<String, Constructor<OooO0OO>>> threadLocal = CoordinatorLayout.d;
                                            Map<String, Constructor<OooO0OO>> map = threadLocal.get();
                                            if (map == null) {
                                                map = new HashMap<>();
                                                threadLocal.set(map);
                                            }
                                            Constructor<OooO0OO> constructor = map.get(string);
                                            if (constructor == null) {
                                                constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.c);
                                                constructor.setAccessible(true);
                                                map.put(string, constructor);
                                            }
                                            oooO0OONewInstance = constructor.newInstance(context, attributeSet);
                                        } catch (Exception e) {
                                            throw new RuntimeException(j.r("Could not inflate Behavior subclass ", string), e);
                                        }
                                    }
                                    this.b = oooO0OONewInstance;
                                }
                                typedArrayObtainStyledAttributes.recycle();
                                OooO0OO oooO0OO = this.b;
                                if (oooO0OO != null) {
                                    oooO0OO.f(this);
                                }
                            }

                            public OooOO0(OooOO0 oooOO0) {
                                super((ViewGroup.MarginLayoutParams) oooOO0);
                                this.c = false;
                                this.d = 0;
                                this.e = 0;
                                this.g = -1;
                                this.f = -1;
                                this.h = 0;
                                this.i = 0;
                                this.q = new Rect();
                            }

                            public OooOO0(ViewGroup.MarginLayoutParams marginLayoutParams) {
                                super(marginLayoutParams);
                                this.c = false;
                                this.d = 0;
                                this.e = 0;
                                this.g = -1;
                                this.f = -1;
                                this.h = 0;
                                this.i = 0;
                                this.q = new Rect();
                            }

                            public OooOO0(ViewGroup.LayoutParams layoutParams) {
                                super(layoutParams);
                                this.c = false;
                                this.d = 0;
                                this.e = 0;
                                this.g = -1;
                                this.f = -1;
                                this.h = 0;
                                this.i = 0;
                                this.q = new Rect();
                            }
                        }
                    }
