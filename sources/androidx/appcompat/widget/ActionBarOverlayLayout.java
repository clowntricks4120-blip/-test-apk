package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.p;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.C0284l;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0289t;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import ivas.gov.bisp.enumeration.p081d.u;
import ivas.gov.bisp.enumeration.p087j.v;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0320s;
import ivas.gov.bisp.enumeration.p088k.InterfaceC0323y;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0320s, InterfaceC0289t, u {
    public static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Runnable A;
    public final C0284l B;
    public boolean b;
    public int c;
    public int d;
    public ContentFrameLayout e;
    public InterfaceC0323y f;
    public ActionBarContainer g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f10o;
    public final Rect p;
    public am q;
    public final Rect r;
    public am s;
    public ViewPropertyAnimator t;
    public am u;
    public am v;
    public OooO0o w;
    public OverScroller x;
    public final Runnable y;
    public final AnimatorListenerAdapter z;

    public static class OooO extends ViewGroup.MarginLayoutParams {
        public OooO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public OooO(int i, int i2) {
            super(i, i2);
        }

        public OooO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.t = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.t = null;
            actionBarOverlayLayout.l = false;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.t = actionBarOverlayLayout.g.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.z);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.t = actionBarOverlayLayout.g.animate().translationY(-ActionBarOverlayLayout.this.g.getHeight()).setListener(ActionBarOverlayLayout.this.z);
        }
    }

    public interface OooO0o {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.f10o = new Rect();
        this.p = new Rect();
        this.r = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        am amVar = am.c;
        this.q = amVar;
        this.s = amVar;
        this.v = amVar;
        this.u = amVar;
        this.z = new OooO00o();
        this.y = new OooO0O0();
        this.A = new OooO0OO();
        t(context);
        this.B = new C0284l();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public boolean a() {
        v();
        return this.f.a();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public void b(Menu menu, p.aIX aix) {
        v();
        this.f.b(menu, aix);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public boolean c() {
        v();
        return this.f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooO;
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public boolean d() {
        v();
        return this.f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.h == null || this.i) {
            return;
        }
        if (this.g.getVisibility() == 0) {
            translationY = (int) (this.g.getTranslationY() + this.g.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.h.setBounds(0, translationY, getWidth(), this.h.getIntrinsicHeight() + translationY);
        this.h.draw(canvas);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public boolean e() {
        v();
        return this.f.e();
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public void f() {
        v();
        this.f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public boolean g() {
        v();
        return this.f.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.d();
    }

    public CharSequence getTitle() {
        v();
        return this.f.getTitle();
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public void i(int i) {
        v();
        if (i == 2) {
            this.f.y();
        } else if (i == 5) {
            this.f.z();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public boolean j(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void n(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        v();
        am amVarD = am.d(windowInsets, this);
        boolean zS = s(this.g, new Rect(amVarD.h(), amVarD.j(), amVarD.i(), amVarD.g()), true, true, false, true);
        Rect rect = this.f10o;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aXb.d(this, amVarD, rect);
        Rect rect2 = this.f10o;
        am amVarC = amVarD.d.c(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.q = amVarC;
        if (!this.s.equals(amVarC)) {
            this.s = this.q;
            zS = true;
        }
        if (this.p.equals(this.f10o)) {
            if (zS) {
            }
            return amVarD.d.d().d.f().d.e().l();
        }
        this.p.set(this.f10o);
        requestLayout();
        return amVarD.d.d().d.f().d.e().l();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t(getContext());
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aXd.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                OooO oooO = (OooO) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) oooO).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) oooO).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        am.aWz awb;
        v();
        measureChildWithMargins(this.g, i, 0, i2, 0);
        OooO oooO = (OooO) this.g.getLayoutParams();
        int iMax = Math.max(0, this.g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooO).leftMargin + ((ViewGroup.MarginLayoutParams) oooO).rightMargin);
        int iMax2 = Math.max(0, this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO).topMargin + ((ViewGroup.MarginLayoutParams) oooO).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.g.getMeasuredState());
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        boolean z = (T.aWX.i(this) & 256) != 0;
        if (z) {
            measuredHeight = this.c;
            if (this.j && this.g.getTabContainer() != null) {
                measuredHeight += this.c;
            }
        } else {
            measuredHeight = this.g.getVisibility() != 8 ? this.g.getMeasuredHeight() : 0;
        }
        this.r.set(this.f10o);
        am amVar = this.q;
        this.v = amVar;
        if (this.b || z) {
            ivas.gov.bisp.enumeration.p007ag.c cVarC = ivas.gov.bisp.enumeration.p007ag.c.c(amVar.h(), this.v.j() + measuredHeight, this.v.i(), this.v.g());
            am amVar2 = this.v;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                awb = new am.aWC(amVar2);
            } else {
                awb = i3 >= 29 ? new am.aWB(amVar2) : new am.aWA(amVar2);
            }
            awb.g(cVarC);
            this.v = awb.e();
        } else {
            Rect rect = this.r;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.v = amVar.d.c(0, measuredHeight, 0, 0);
        }
        s(this.e, this.r, true, true, true, true);
        if (!this.u.equals(this.v)) {
            am amVar3 = this.v;
            this.u = amVar3;
            T.e(this.e, amVar3);
        }
        measureChildWithMargins(this.e, i, 0, i2, 0);
        OooO oooO2 = (OooO) this.e.getLayoutParams();
        int iMax3 = Math.max(iMax, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooO2).leftMargin + ((ViewGroup.MarginLayoutParams) oooO2).rightMargin);
        int iMax4 = Math.max(iMax2, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooO2).topMargin + ((ViewGroup.MarginLayoutParams) oooO2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.g.getHeight()) {
            u();
            this.A.run();
        } else {
            u();
            this.y.run();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.n + i2;
        this.n = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        v vVar;
        ivas.gov.bisp.enumeration.p099u.p pVar;
        this.B.c = i;
        this.n = getActionBarHideOffset();
        u();
        OooO0o oooO0o = this.w;
        if (oooO0o == null || (pVar = (vVar = (v) oooO0o).z) == null) {
            return;
        }
        pVar.c();
        vVar.z = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.g.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.n <= this.g.getHeight()) {
                u();
                postDelayed(this.y, 600L);
            } else {
                u();
                postDelayed(this.A, 600L);
            }
        }
        OooO0o oooO0o = this.w;
        if (oooO0o != null) {
            Objects.requireNonNull(oooO0o);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        v();
        int i2 = this.m;
        this.m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        OooO0o oooO0o = this.w;
        if (oooO0o != null) {
            v vVar = (v) oooO0o;
            vVar.t = !z2;
            if (z || !z2) {
                if (vVar.v) {
                    vVar.v = false;
                    vVar.w(true);
                }
            } else if (!vVar.v) {
                vVar.v = true;
                vVar.w(true);
            }
        }
        if (((i ^ i2) & 256) == 0 || this.w == null) {
            return;
        }
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aXd.d(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.d = i;
        OooO0o oooO0o = this.w;
        if (oooO0o != null) {
            ((v) oooO0o).s = i;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public void p() {
        v();
        this.f.n();
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void q(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p081d.u
    public void r(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final boolean s(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        OooO oooO = (OooO) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) oooO).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) oooO).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) oooO).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) oooO).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) oooO).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) oooO).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) oooO).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) oooO).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    public void setActionBarHideOffset(int i) {
        u();
        this.g.setTranslationY(-Math.max(0, Math.min(i, this.g.getHeight())));
    }

    public void setActionBarVisibilityCallback(OooO0o oooO0o) {
        this.w = oooO0o;
        if (getWindowToken() != null) {
            ((v) this.w).s = this.d;
            int i = this.m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aXd.d(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        v();
        this.f.setIcon(i);
    }

    public void setLogo(int i) {
        v();
        this.f.r(i);
    }

    public void setOverlayMode(boolean z) {
        this.b = z;
        this.i = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public void setWindowCallback(Window.Callback callback) {
        v();
        this.f.setWindowCallback(callback);
    }

    @Override // ivas.gov.bisp.enumeration.p088k.InterfaceC0320s
    public void setWindowTitle(CharSequence charSequence) {
        v();
        this.f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.h = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.i = context.getApplicationInfo().targetSdkVersion < 19;
        this.x = new OverScroller(context);
    }

    public void u() {
        removeCallbacks(this.y);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void v() {
        InterfaceC0323y wrapper;
        if (this.e == null) {
            this.e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0323y) {
                wrapper = (InterfaceC0323y) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbW = j.w("Can't make a decor toolbar out of ");
                    sbW.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbW.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        v();
        this.f.setIcon(drawable);
    }
}
