package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.L.i;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import ivas.gov.bisp.enumeration.p081d.z;
import ivas.gov.bisp.enumeration.p103z.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.OooO0O0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public am h;
    public boolean i;
    public boolean j;
    public boolean k;
    public WeakReference<View> l;
    public int m;
    public ValueAnimator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<OooO0o> f31o;
    public Drawable p;
    public int[] q;

    public static class BaseBehavior<T extends AppBarLayout> extends ivas.gov.bisp.enumeration.o0Oo0oo.OooO0O0<T> {
        public int a;
        public int b;
        public ValueAnimator l;
        public WeakReference<View> m;
        public OooO00o n;

        public BaseBehavior() {
        }

        public static boolean F(int i, int i2) {
            return (i & i2) == i2;
        }

        public void A(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Y(coordinatorLayout, appBarLayout);
            if (appBarLayout.k) {
                appBarLayout.d(appBarLayout.e(W(coordinatorLayout)));
            }
        }

        public int B() {
            return u() + this.a;
        }

        public int D(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iB = B();
            int i4 = 0;
            if (i2 == 0 || iB < i2 || iB > i3) {
                this.a = 0;
            } else {
                int iQ = ivas.gov.bisp.enumeration.O.r.q(i, i2, i3);
                if (iB != iQ) {
                    if (!appBarLayout.e) {
                        top = iQ;
                        break;
                    }
                    int iAbs = Math.abs(iQ);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
                            Interpolator interpolator = oooO0OO.c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = oooO0OO.a;
                                if ((i6 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) oooO0OO).topMargin + ((LinearLayout.LayoutParams) oooO0OO).bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        WeakHashMap<View, R> weakHashMap = T.c;
                                        topInset -= T.aWX.f(childAt);
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap<View, R> weakHashMap2 = T.c;
                                if (T.aWX.d(childAt)) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iQ);
                                    break;
                                }
                            }
                        }
                        top = iQ;
                        break;
                    }
                    boolean zV = v(top);
                    this.a = iQ - top;
                    if (zV) {
                        for (int i7 = 0; i7 < appBarLayout.getChildCount(); i7++) {
                            OooO0OO oooO0OO2 = (OooO0OO) appBarLayout.getChildAt(i7).getLayoutParams();
                            OooO00o oooO00o = oooO0OO2.b;
                            if (oooO00o != null && (oooO0OO2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i7);
                                float fU = u();
                                OooO0O0 oooO0O0 = (OooO0O0) oooO00o;
                                Rect rect = oooO0O0.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float fAbs = oooO0O0.a.top - Math.abs(fU);
                                if (fAbs <= 0.0f) {
                                    float fAbs2 = Math.abs(fAbs / oooO0O0.a.height());
                                    float f2 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
                                    float fHeight = (-fAbs) - ((oooO0O0.a.height() * 0.3f) * (1.0f - (f2 * f2)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(oooO0O0.b);
                                    oooO0O0.b.offset(0, (int) (-fHeight));
                                    Rect rect2 = oooO0O0.b;
                                    WeakHashMap<View, R> weakHashMap3 = T.c;
                                    T.aWZ.d(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, R> weakHashMap4 = T.c;
                                    T.aWZ.d(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!zV && appBarLayout.e) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.b = u();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, R> weakHashMap5 = T.c;
                        T.aWX.l(appBarLayout);
                    }
                    Z(coordinatorLayout, appBarLayout, iQ, iQ < iB ? -1 : 1, false);
                    i4 = iB - iQ;
                }
            }
            V(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final void U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int iAbs = Math.abs(B() - i);
            float fAbs = Math.abs(f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f);
            int iB = B();
            if (iB == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(ivas.gov.bisp.enumeration.T.j.g);
                this.l.addUpdateListener(new c(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iB, i);
            this.l.start();
        }

        public final void V(CoordinatorLayout coordinatorLayout, T t) {
            al.aXC axc = al.aXC.d;
            T.o(axc.e(), coordinatorLayout);
            T.k(coordinatorLayout, 0);
            al.aXC axc2 = al.aXC.f;
            T.o(axc2.e(), coordinatorLayout);
            T.k(coordinatorLayout, 0);
            View viewW = W(coordinatorLayout);
            if (viewW == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.OooOO0) viewW.getLayoutParams()).b instanceof ScrollingViewBehavior)) {
                return;
            }
            if (B() != (-t.getTotalScrollRange()) && viewW.canScrollVertically(1)) {
                T.n(coordinatorLayout, axc, null, new r(this, t, false));
            }
            if (B() != 0) {
                if (!viewW.canScrollVertically(-1)) {
                    T.n(coordinatorLayout, axc2, null, new r(this, t, true));
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    T.n(coordinatorLayout, axc2, null, new h(this, coordinatorLayout, t, viewW, i));
                }
            }
        }

        public final View W(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof z) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    iArr[1] = C(coordinatorLayout, appBarLayout, i, i3, i4);
                }
            }
            if (appBarLayout.k) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public final void Y(CoordinatorLayout coordinatorLayout, T t) {
            int iB = B();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
                if (F(oooO0OO.a, 32)) {
                    top -= ((LinearLayout.LayoutParams) oooO0OO).topMargin;
                    bottom += ((LinearLayout.LayoutParams) oooO0OO).bottomMargin;
                }
                int i2 = -iB;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                OooO0OO oooO0OO2 = (OooO0OO) childAt2.getLayoutParams();
                int i3 = oooO0OO2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int iF = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        iF += t.getPaddingTop() + t.getTopInset();
                    }
                    if (F(i3, 2)) {
                        WeakHashMap<View, R> weakHashMap = T.c;
                        iF += T.aWX.f(childAt2);
                    } else if (F(i3, 5)) {
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        int iF2 = T.aWX.f(childAt2) + iF;
                        if (iB < iF2) {
                            i4 = iF2;
                        } else {
                            iF = iF2;
                        }
                    }
                    if (F(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) oooO0OO2).topMargin;
                        iF -= ((LinearLayout.LayoutParams) oooO0OO2).bottomMargin;
                    }
                    if (iB < (iF + i4) / 2) {
                        i4 = iF;
                    }
                    U(coordinatorLayout, t, ivas.gov.bisp.enumeration.O.r.q(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005b  */
        public final void Z(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View childAt;
            boolean zE;
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = t.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((OooO0OO) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, R> weakHashMap = T.c;
                    int iF = T.aWX.f(childAt);
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - iF) - t.getTopInset() : (-i) < (childAt.getBottom() - iF) - t.getTopInset()) {
                        zE = false;
                    } else {
                        zE = true;
                    }
                } else {
                    zE = false;
                }
            } else {
                zE = false;
            }
            if (t.k) {
                zE = t.e(W(coordinatorLayout));
            }
            boolean zD = t.d(zE);
            if (!z) {
                if (zD) {
                    List<View> listI = coordinatorLayout.i(t);
                    int size = listI.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.OooO0OO oooO0OO = ((CoordinatorLayout.OooOO0) listI.get(i5).getLayoutParams()).b;
                        if (oooO0OO instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) oooO0OO).g == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            t.jumpDrawablesToCurrentState();
        }

        public boolean c(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooOO0) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.C(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            OooO00o oooO00o = this.n;
            if (oooO00o == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            U(coordinatorLayout, appBarLayout, i2, 0.0f);
                        } else {
                            E(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            U(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (oooO00o.b) {
                E(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(oooO00o.f);
                int i3 = -childAt.getBottom();
                if (this.n.g) {
                    WeakHashMap<View, R> weakHashMap = T.c;
                    iRound = appBarLayout.getTopInset() + T.aWX.f(childAt) + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.n.c) + i3;
                }
                E(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.g = 0;
            this.n = null;
            v(ivas.gov.bisp.enumeration.O.r.q(u(), -appBarLayout.getTotalScrollRange(), 0));
            Z(coordinatorLayout, appBarLayout, u(), 0, true);
            appBarLayout.b = u();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, R> weakHashMap2 = T.c;
                T.aWX.l(appBarLayout);
            }
            V(coordinatorLayout, appBarLayout);
            return true;
        }

        public /* synthetic */ void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            X(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = C(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                V(coordinatorLayout, appBarLayout);
            }
        }

        public void o(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (parcelable instanceof OooO00o) {
                this.n = (OooO00o) parcelable;
            } else {
                this.n = null;
            }
        }

        public Parcelable q(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iU = u();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iU;
                if (childAt.getTop() + iU <= 0 && bottom >= 0) {
                    OooO00o oooO00o = new OooO00o(absSavedState);
                    oooO00o.b = (-u()) >= appBarLayout.getTotalScrollRange();
                    oooO00o.f = i;
                    WeakHashMap<View, R> weakHashMap = T.c;
                    oooO00o.g = bottom == appBarLayout.getTopInset() + T.aWX.f(childAt);
                    oooO00o.c = bottom / childAt.getHeight();
                    return oooO00o;
                }
            }
            return absSavedState;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) != 0) {
                z = true;
                if (!appBarLayout.k && (appBarLayout.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight())) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.m = null;
            this.b = i2;
            return z;
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.b == 0 || i == 1) {
                Y(coordinatorLayout, appBarLayout);
                if (appBarLayout.k) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.m = new WeakReference<>(view2);
        }

        public int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public boolean y(View view) {
            WeakReference<View> weakReference = this.m;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        public int z(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class OooO00o extends l {
            public static final Parcelable.Creator<OooO00o> CREATOR = new C0004OooO00o();
            public boolean b;
            public float c;
            public int f;
            public boolean g;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0004OooO00o implements Parcelable.ClassLoaderCreator<OooO00o> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final OooO00o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new OooO00o(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OooO00o[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new OooO00o(parcel, null);
                }
            }

            public OooO00o(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.b = parcel.readByte() != 0;
                this.f = parcel.readInt();
                this.c = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.e, i);
                parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f);
                parcel.writeFloat(this.c);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }

            public OooO00o(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OooO00o {
    }

    public static class OooO0O0 extends OooO00o {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    public interface OooO0o {
        void b(float f, int i);
    }

    public static class ScrollingViewBehavior extends ivas.gov.bisp.enumeration.L.h {
        public ScrollingViewBehavior() {
        }

        @Override // ivas.gov.bisp.enumeration.L.h
        public int B(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.OooO0OO oooO0OO = ((CoordinatorLayout.OooOO0) view2.getLayoutParams()).b;
            if (oooO0OO instanceof BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                int i = ((BaseBehavior) oooO0OO).a;
                int i2 = this.h;
                int iA = A(view2);
                WeakHashMap<View, R> weakHashMap = T.c;
                view.offsetTopAndBottom((((bottom - top) + i) + i2) - iA);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.k) {
                return false;
            }
            appBarLayout.d(appBarLayout.e(view));
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                T.o(al.aXC.d.e(), coordinatorLayout);
                T.k(coordinatorLayout, 0);
                T.o(al.aXC.f.e(), coordinatorLayout);
                T.k(coordinatorLayout, 0);
            }
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.k(view));
            if (appBarLayoutZ != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.e;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutZ.c(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.L.h
        public float x(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.OooO0OO oooO0OO = ((CoordinatorLayout.OooOO0) appBarLayout.getLayoutParams()).b;
                int iB = oooO0OO instanceof BaseBehavior ? ((BaseBehavior) oooO0OO).B() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iB > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iB / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // ivas.gov.bisp.enumeration.L.h
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public AppBarLayout z(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.L);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.appBarLayoutStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_AppBarLayout), attributeSet, ivas.gov.bisp.enumeration.R.attr.appBarLayoutStyle);
        this.c = -1;
        this.d = -1;
        this.f = -1;
        this.g = 0;
        this.f31o = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayE = a.e(context3, attributeSet, i.c, ivas.gov.bisp.enumeration.R.attr.appBarLayoutStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayE.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayE.getResourceId(0, 0)));
            }
            typedArrayE.recycle();
            TypedArray typedArrayE2 = a.e(context2, attributeSet, ivas.gov.bisp.enumeration.O.r.c, ivas.gov.bisp.enumeration.R.attr.appBarLayoutStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayE2.getDrawable(0);
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aWX.s(this, drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                C0019p c0019p = new C0019p();
                c0019p.u(ColorStateList.valueOf(colorDrawable.getColor()));
                c0019p.e.e = new S(context2);
                c0019p.w();
                T.aWX.s(this, c0019p);
            }
            if (typedArrayE2.hasValue(4)) {
                c(typedArrayE2.getBoolean(4, false), false, false);
            }
            if (typedArrayE2.hasValue(3)) {
                i.b(this, typedArrayE2.getDimensionPixelSize(3, 0));
            }
            if (i >= 26) {
                if (typedArrayE2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayE2.getBoolean(2, false));
                }
                if (typedArrayE2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayE2.getBoolean(1, false));
                }
            }
            this.k = typedArrayE2.getBoolean(5, false);
            this.m = typedArrayE2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayE2.getDrawable(7));
            typedArrayE2.recycle();
            T.aXb.v(this, new ivas.gov.bisp.enumeration.L.j(this));
        } catch (Throwable th) {
            typedArrayE.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OooO0OO generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new OooO0OO((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooO0OO((ViewGroup.MarginLayoutParams) layoutParams) : new OooO0OO(layoutParams);
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        this.g = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO0OO;
    }

    public boolean d(boolean z) {
        if (!(!this.a) || this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        if (!this.k || !(getBackground() instanceof C0019p)) {
            return true;
        }
        C0019p c0019p = (C0019p) getBackground();
        float dimension = getResources().getDimension(ivas.gov.bisp.enumeration.R.dimen.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
        this.n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(ivas.gov.bisp.enumeration.R.integer.app_bar_elevation_anim_duration));
        this.n.setInterpolator(ivas.gov.bisp.enumeration.T.j.c);
        this.n.addUpdateListener(new j(this, c0019p));
        this.n.start();
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.p == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.b);
        this.p.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public boolean e(View view) {
        int i;
        if (this.l == null && (i = this.m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (viewFindViewById != null) {
                this.l = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.l;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final void f() {
        setWillNotDraw(!(this.p != null && getTopInset() > 0));
    }

    public final boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, R> weakHashMap = T.c;
        return !T.aWX.d(childAt);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO0OO(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    public CoordinatorLayout.OooO0OO<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int iF;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = oooO0OO.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) oooO0OO).topMargin + ((LinearLayout.LayoutParams) oooO0OO).bottomMargin;
                if ((i3 & 8) != 0) {
                    WeakHashMap<View, R> weakHashMap = T.c;
                    iF = T.aWX.f(childAt);
                } else {
                    if ((i3 & 2) != 0) {
                        WeakHashMap<View, R> weakHashMap2 = T.c;
                        iF = measuredHeight - T.aWX.f(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0) {
                        WeakHashMap<View, R> weakHashMap3 = T.c;
                        if (T.aWX.d(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
                iMin = i4 + iF;
                if (childCount == 0) {
                    WeakHashMap<View, R> weakHashMap4 = T.c;
                    if (T.aWX.d(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.d = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iF = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = ((LinearLayout.LayoutParams) oooO0OO).topMargin;
            int i4 = ((LinearLayout.LayoutParams) oooO0OO).bottomMargin;
            int i5 = oooO0OO.a;
            if ((i5 & 1) == 0) {
                break;
            }
            iF += i3 + i4 + measuredHeight;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, R> weakHashMap = T.c;
                iF -= T.aWX.f(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iF);
        this.f = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, R> weakHashMap = T.c;
        int iF = T.aWX.f(this);
        if (iF == 0) {
            int childCount = getChildCount();
            iF = childCount > 0 ? T.aWX.f(getChildAt(childCount - 1)) : 0;
            if (iF == 0) {
                return getHeight() / 3;
            }
        }
        return (iF * 2) + topInset;
    }

    public int getPendingAction() {
        return this.g;
    }

    public Drawable getStatusBarForeground() {
        return this.p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        am amVar = this.h;
        if (amVar != null) {
            return amVar.j();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iF = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OooO0OO oooO0OO = (OooO0OO) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = oooO0OO.a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) oooO0OO).topMargin + ((LinearLayout.LayoutParams) oooO0OO).bottomMargin + iF;
            if (i2 == 0) {
                WeakHashMap<View, R> weakHashMap = T.c;
                if (T.aWX.d(childAt)) {
                    topInset -= getTopInset();
                }
            }
            iF = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, R> weakHashMap2 = T.c;
                iF -= T.aWX.f(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iF);
        this.c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0019p) {
            ivas.gov.bisp.enumeration.O.r.C(this, (C0019p) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.i;
        iArr[0] = z ? ivas.gov.bisp.enumeration.R.attr.state_liftable : -2130969386;
        iArr[1] = (z && this.j) ? ivas.gov.bisp.enumeration.R.attr.state_lifted : -2130969387;
        iArr[2] = z ? ivas.gov.bisp.enumeration.R.attr.state_collapsible : -2130969384;
        iArr[3] = (z && this.j) ? ivas.gov.bisp.enumeration.R.attr.state_collapsed : -2130969383;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, R> weakHashMap = T.c;
        boolean z2 = true;
        if (T.aWX.d(this) && g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.c = -1;
        this.d = -1;
        this.f = -1;
        this.e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((OooO0OO) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.a) {
            return;
        }
        if (!this.k) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((OooO0OO) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, R> weakHashMap = T.c;
            if (T.aWX.d(this) && g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    int measuredHeight2 = getMeasuredHeight();
                    measuredHeight = ivas.gov.bisp.enumeration.O.r.q(getTopInset() + measuredHeight2, 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.c = -1;
        this.d = -1;
        this.f = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ivas.gov.bisp.enumeration.O.r.A(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, R> weakHashMap = T.c;
        c(z, T.aXa.d(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.k = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        WeakReference<View> weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.a = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap<View, R> weakHashMap = T.c;
                drawable3.setLayoutDirection(T.aWY.f(this));
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            f();
            WeakHashMap<View, R> weakHashMap2 = T.c;
            T.aWX.l(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(A.c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        i.b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new OooO0OO(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO0OO(getContext(), attributeSet);
    }

    public static class OooO0OO extends LinearLayout.LayoutParams {
        public int a;
        public OooO00o b;
        public Interpolator c;

        public OooO0OO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.k);
            this.a = typedArrayObtainStyledAttributes.getInt(1, 0);
            this.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new OooO0O0();
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public OooO0OO(int i, int i2) {
            super(i, i2);
            this.a = 1;
        }

        public OooO0OO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public OooO0OO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public OooO0OO(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
