package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.C0284l;
import ivas.gov.bisp.enumeration.p081d.P;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.u;
import ivas.gov.bisp.enumeration.p081d.z;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements u, z {
    public final P A;
    public OooO0O0 B;
    public boolean c;
    public long d;
    public final Rect e;
    public OverScroller f;
    public EdgeEffect g;
    public EdgeEffect h;
    public int i;
    public boolean j;
    public View k;
    public boolean l;
    public VelocityTracker m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20o;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public final C0284l u;
    public int v;
    public final int[] w;
    public int x;
    public OooO0OO y;
    public float z;
    public static final OooO00o b = new OooO00o();
    public static final int[] a = {R.attr.fillViewport};

    public static class OooO00o extends C0283j {
        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void g(View view, AccessibilityEvent accessibilityEvent) {
            this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public void h(View view, al alVar) {
            int scrollRange;
            this.d.onInitializeAccessibilityNodeInfo(view, alVar.d);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            alVar.d.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            alVar.d.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                alVar.f(al.aXC.f);
                alVar.f(al.aXC.i);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                alVar.f(al.aXC.d);
                alVar.f(al.aXC.j);
            }
        }

        @Override // ivas.gov.bisp.enumeration.p081d.C0283j
        public boolean k(View view, int i, Bundle bundle) {
            if (super.k(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int height = nestedScrollView.getHeight();
                    int paddingBottom = nestedScrollView.getPaddingBottom();
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.F(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), SQLiteDatabase.MAX_SQL_CACHE_SIZE, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int height2 = nestedScrollView.getHeight();
            int paddingBottom2 = nestedScrollView.getPaddingBottom();
            int paddingTop = nestedScrollView.getPaddingTop();
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - paddingTop), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.F(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), SQLiteDatabase.MAX_SQL_CACHE_SIZE, true);
            return true;
        }
    }

    public interface OooO0O0 {
    }

    public static class OooO0OO extends View.BaseSavedState {
        public static final Parcelable.Creator<OooO0OO> CREATOR = new OooO00o();
        public int b;

        public class OooO00o implements Parcelable.Creator<OooO0OO> {
            @Override // android.os.Parcelable.Creator
            public OooO0OO createFromParcel(Parcel parcel) {
                return new OooO0OO(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public OooO0OO[] newArray(int i) {
                return new OooO0OO[i];
            }
        }

        public OooO0OO(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbW = j.w("HorizontalScrollView.SavedState{");
            sbW.append(Integer.toHexString(System.identityHashCode(this)));
            sbW.append(" scrollPosition=");
            return j.s(sbW, this.b, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }

        public OooO0OO(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.nestedScrollViewStyle);
        this.e = new Rect();
        this.j = true;
        this.c = false;
        this.k = null;
        this.l = false;
        this.n = true;
        this.r = -1;
        this.t = new int[2];
        this.w = new int[2];
        this.h = ivas.gov.bisp.enumeration.H.j.b() ? ivas.gov.bisp.enumeration.l.z.aVe.b(context, attributeSet) : new EdgeEffect(context);
        this.g = ivas.gov.bisp.enumeration.H.j.b() ? ivas.gov.bisp.enumeration.l.z.aVe.b(context, attributeSet) : new EdgeEffect(context);
        this.f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.p = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a, ivas.gov.bisp.enumeration.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.u = new C0284l();
        this.A = new P(this);
        setNestedScrollingEnabled(true);
        T.q(this, b);
    }

    public static int c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public static boolean d(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && d((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean A(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            l(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public boolean B(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z = true;
        } else if (i9 < i13) {
            z = true;
            i9 = i13;
        } else {
            z = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z2 = true;
        } else if (i11 < i15) {
            z2 = true;
            i11 = i15;
        } else {
            z2 = false;
        }
        if (z2 && !x(1)) {
            this.f.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    public final void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.i = (int) motionEvent.getY(i);
            this.r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void D() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public final void E(boolean z) {
        if (z) {
            H(2, 1);
        } else {
            this.A.l(1);
        }
        this.x = getScrollY();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.l(this);
    }

    public final void F(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.d > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i4 = layoutParams.topMargin;
            int i5 = layoutParams.bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.f.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, i3);
            E(z);
        } else {
            if (!this.f.isFinished()) {
                g();
            }
            scrollBy(i, i2);
        }
        this.d = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void G(View view) {
        view.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(view, this.e);
        int iK = k(this.e);
        if (iK != 0) {
            scrollBy(0, iK);
        }
    }

    public boolean H(int i, int i2) {
        return this.A.c(i, i2);
    }

    public final boolean I(MotionEvent motionEvent) {
        boolean z;
        if (ivas.gov.bisp.enumeration.p089l.z.b(this.h) != 0.0f) {
            ivas.gov.bisp.enumeration.p089l.z.c(this.h, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        } else {
            z = false;
        }
        if (ivas.gov.bisp.enumeration.p089l.z.b(this.g) == 0.0f) {
            return z;
        }
        ivas.gov.bisp.enumeration.p089l.z.c(this.g, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f.isFinished()) {
            return;
        }
        this.f.computeScrollOffset();
        int currY = this.f.getCurrY();
        int i = currY - this.x;
        this.x = currY;
        int[] iArr = this.w;
        iArr[1] = 0;
        m(0, i, iArr, null, 1);
        int i2 = i - this.w[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            B(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.w;
            iArr2[1] = 0;
            this.A.h(0, scrollY2, 0, i3, this.t, 1, iArr2);
            i2 = i3 - this.w[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i2 < 0) {
                    if (this.h.isFinished()) {
                        this.h.onAbsorb((int) this.f.getCurrVelocity());
                    }
                } else if (this.g.isFinished()) {
                    this.g.onAbsorb((int) this.f.getCurrVelocity());
                }
            }
            g();
        }
        if (this.f.isFinished()) {
            this.A.l(1);
        } else {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWX.l(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A.d(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A.e(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A.i(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.h.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.h.setSize(width, height);
            if (this.h.draw(canvas)) {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aWX.l(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.g.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.g.setSize(width2, height2);
        if (this.g.draw(canvas)) {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
            T.aWX.l(this);
        }
        canvas.restoreToCount(iSave2);
    }

    public final void g() {
        this.f.abortAnimation();
        this.A.l(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.u.d();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int height = childAt.getHeight();
        int i = layoutParams.topMargin;
        return Math.max(0, ((height + i) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void h(View view, int i) {
        C0284l c0284l = this.u;
        if (i == 1) {
            c0284l.d = 0;
        } else {
            c0284l.c = 0;
        }
        this.A.l(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public boolean i(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !y(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                maxScrollAmount = Math.min((childAt.getBottom() + layoutParams.bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            l(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.e);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.e);
            l(k(this.e));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!y(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.A.f;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public boolean j(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public int k(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void l(int i) {
        if (i != 0) {
            if (this.n) {
                F(0, i, SQLiteDatabase.MAX_SQL_CACHE_SIZE, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public boolean m(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.A.f(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + paddingLeft, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        view.measure(FrameLayout.getChildMeasureSpec(i, paddingRight + paddingLeft + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void n(View view, View view2, int i, int i2) {
        C0284l c0284l = this.u;
        if (i2 == 1) {
            c0284l.d = i;
        } else {
            c0284l.c = i;
        }
        H(2, i2);
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        m(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.l) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!I(motionEvent) && this.f.isFinished()) {
                        z = false;
                    }
                    this.l = z;
                    D();
                } else {
                    this.i = y;
                    this.r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.m;
                    if (velocityTracker == null) {
                        this.m = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.m.addMovement(motionEvent);
                    this.f.computeScrollOffset();
                    if (!I(motionEvent) && this.f.isFinished()) {
                        z = false;
                    }
                    this.l = z;
                    H(2, 0);
                }
            } else {
                if (!I(motionEvent)) {
                    z = false;
                }
                this.l = z;
                D();
            }
        } else if (i == 1) {
            this.l = false;
            this.r = -1;
            D();
            if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aWX.l(this);
            }
            this.A.l(0);
        } else if (i == 2) {
            int i2 = this.r;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(i2);
                    sb.append(" in onInterceptTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.i) > this.p && (2 & getNestedScrollAxes()) == 0) {
                        this.l = true;
                        this.i = y2;
                        if (this.m == null) {
                            this.m = VelocityTracker.obtain();
                        }
                        this.m.addMovement(motionEvent);
                        this.v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.l = false;
            this.r = -1;
            D();
            if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                T.aWX.l(this);
            }
            this.A.l(0);
        } else if (i == 6) {
            C(motionEvent);
        }
        return this.l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.j = false;
        View view = this.k;
        if (view != null && d(view, this)) {
            G(this.k);
        }
        this.k = null;
        if (!this.c) {
            if (this.y != null) {
                scrollTo(getScrollX(), this.y.b);
                this.y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int iC = c(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, measuredHeight);
            if (iC != scrollY) {
                scrollTo(getScrollX(), iC);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.c = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f20o && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i3 = layoutParams.leftMargin;
                childAt.measure(FrameLayout.getChildMeasureSpec(i, paddingRight + paddingLeft + i3 + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        s((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        z(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.u.c = i;
        H(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ y(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO0OO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO0OO oooO0OO = (OooO0OO) parcelable;
        super.onRestoreInstanceState(oooO0OO.getSuperState());
        this.y = oooO0OO;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        OooO0OO oooO0OO = new OooO0OO(super.onSaveInstanceState());
        oooO0OO.b = getScrollY();
        return oooO0OO;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OooO0O0 oooO0O0 = this.B;
        if (oooO0O0 != null) {
            ivas.gov.bisp.enumeration.p087j.P p = (ivas.gov.bisp.enumeration.p087j.P) oooO0O0;
            AlertController.c(this, p.a, p.b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !y(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(viewFindFocus, this.e);
        l(k(this.e));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.u.c = 0;
        this.A.l(0);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:76:0x01de  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0207  */
    /* JADX WARN: Code duplicated, block: B:81:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x024f  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fC;
        int iRound;
        int i;
        int i2;
        int i3;
        int scrollY;
        int scrollRange;
        int overScrollMode;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        ViewParent parent2;
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.m;
                velocityTracker.computeCurrentVelocity(1000, this.s);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) >= this.q) {
                    if (ivas.gov.bisp.enumeration.p089l.z.b(this.h) != 0.0f) {
                        this.h.onAbsorb(yVelocity);
                    } else if (ivas.gov.bisp.enumeration.p089l.z.b(this.g) != 0.0f) {
                        this.g.onAbsorb(-yVelocity);
                    } else {
                        int i6 = -yVelocity;
                        float f2 = i6;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            s(i6);
                        }
                    }
                } else if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    T.aWX.l(this);
                }
                this.r = -1;
                this.l = false;
                D();
                this.A.l(0);
                this.h.onRelease();
                this.g.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex == -1) {
                    StringBuilder sbW = j.w("Invalid pointerId=");
                    sbW.append(this.r);
                    sbW.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sbW.toString());
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i7 = this.i - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i7 / getHeight();
                    if (ivas.gov.bisp.enumeration.p089l.z.b(this.h) != 0.0f) {
                        fC = -ivas.gov.bisp.enumeration.p089l.z.c(this.h, -height, x);
                        if (ivas.gov.bisp.enumeration.p089l.z.b(this.h) == 0.0f) {
                            this.h.onRelease();
                        }
                    } else if (ivas.gov.bisp.enumeration.p089l.z.b(this.g) != 0.0f) {
                        fC = ivas.gov.bisp.enumeration.p089l.z.c(this.g, height, 1.0f - x);
                        if (ivas.gov.bisp.enumeration.p089l.z.b(this.g) == 0.0f) {
                            this.g.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i7 - iRound;
                        if (!this.l && Math.abs(i) > this.p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.l = true;
                            if (i > 0) {
                                i -= this.p;
                            } else {
                                i += this.p;
                            }
                        }
                        i2 = i;
                        if (this.l) {
                            if (m(0, i2, this.w, this.t, 0)) {
                                i2 -= this.w[1];
                                this.v += this.t[1];
                            }
                            i3 = i2;
                            this.i = y - this.t[1];
                            scrollY = getScrollY();
                            scrollRange = getScrollRange();
                            overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (B(0, i3, 0, getScrollY(), 0, scrollRange, 0, 0) || x(0)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.w;
                            iArr[1] = 0;
                            this.A.h(0, scrollY2, 0, i3 - scrollY2, this.t, 0, iArr);
                            int i8 = this.i;
                            int i9 = this.t[1];
                            this.i = i8 - i9;
                            this.v += i9;
                            if (!z) {
                                i4 = i3 - this.w[1];
                                i5 = scrollY + i4;
                                if (i5 < 0) {
                                    ivas.gov.bisp.enumeration.p089l.z.c(this.h, (-i4) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                    if (!this.g.isFinished()) {
                                        this.g.onRelease();
                                    }
                                } else if (i5 > scrollRange) {
                                    ivas.gov.bisp.enumeration.p089l.z.c(this.g, i4 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                    if (!this.h.isFinished()) {
                                        this.h.onRelease();
                                    }
                                }
                                if (this.h.isFinished() || !this.g.isFinished()) {
                                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                                    T.aWX.l(this);
                                } else if (z2) {
                                    this.m.clear();
                                }
                            } else if (z2) {
                                this.m.clear();
                            }
                        }
                    }
                    f = fC;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i7 - iRound;
                    if (!this.l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.l = true;
                        if (i > 0) {
                            i -= this.p;
                        } else {
                            i += this.p;
                        }
                    }
                    i2 = i;
                    if (this.l) {
                        if (m(0, i2, this.w, this.t, 0)) {
                            i2 -= this.w[1];
                            this.v += this.t[1];
                        }
                        i3 = i2;
                        this.i = y - this.t[1];
                        scrollY = getScrollY();
                        scrollRange = getScrollRange();
                        overScrollMode = getOverScrollMode();
                        if (overScrollMode != 0) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (B(0, i3, 0, getScrollY(), 0, scrollRange, 0, 0)) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        int scrollY3 = getScrollY() - scrollY;
                        int[] iArr2 = this.w;
                        iArr2[1] = 0;
                        this.A.h(0, scrollY3, 0, i3 - scrollY3, this.t, 0, iArr2);
                        int i10 = this.i;
                        int i11 = this.t[1];
                        this.i = i10 - i11;
                        this.v += i11;
                        if (!z) {
                            i4 = i3 - this.w[1];
                            i5 = scrollY + i4;
                            if (i5 < 0) {
                                ivas.gov.bisp.enumeration.p089l.z.c(this.h, (-i4) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.g.isFinished()) {
                                    this.g.onRelease();
                                }
                            } else if (i5 > scrollRange) {
                                ivas.gov.bisp.enumeration.p089l.z.c(this.g, i4 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.h.isFinished()) {
                                    this.h.onRelease();
                                }
                            }
                            if (this.h.isFinished()) {
                            }
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                            T.aWX.l(this);
                        } else if (z2) {
                            this.m.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.l && getChildCount() > 0 && this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap4 = T.c;
                    T.aWX.l(this);
                }
                this.r = -1;
                this.l = false;
                D();
                this.A.l(0);
                this.h.onRelease();
                this.g.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.i = (int) motionEvent.getY(actionIndex);
                this.r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f.isFinished()) {
                g();
            }
            this.i = (int) motionEvent.getY();
            this.r = motionEvent.getPointerId(0);
            H(2, 0);
        }
        VelocityTracker velocityTracker2 = this.m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean p(KeyEvent keyEvent) {
        this.e.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return !keyEvent.isAltPressed() ? i(33) : t(33);
                }
                if (keyCode == 20) {
                    return !keyEvent.isAltPressed() ? i(130) : t(130);
                }
                if (keyCode != 62) {
                    return false;
                }
                int i = keyEvent.isShiftPressed() ? 33 : 130;
                boolean z = i == 130;
                int height = getHeight();
                if (z) {
                    this.e.top = getScrollY() + height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                        Rect rect = this.e;
                        if (rect.top + height > paddingBottom) {
                            rect.top = paddingBottom - height;
                        }
                    }
                } else {
                    this.e.top = getScrollY() - height;
                    Rect rect2 = this.e;
                    if (rect2.top < 0) {
                        rect2.top = 0;
                    }
                }
                Rect rect3 = this.e;
                int i2 = rect3.top;
                int i3 = height + i2;
                rect3.bottom = i3;
                A(i, i2, i3);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0289t
    public void q(View view, int i, int i2, int i3, int i4, int i5) {
        z(i4, i5, null);
    }

    @Override // ivas.gov.bisp.enumeration.p081d.u
    public void r(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        z(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.j) {
            this.k = view2;
        } else {
            G(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iK = k(rect);
        boolean z2 = iK != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iK);
            } else {
                F(0, iK, SQLiteDatabase.MAX_SQL_CACHE_SIZE, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            D();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.j = true;
        super.requestLayout();
    }

    public void s(int i) {
        if (getChildCount() > 0) {
            this.f.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            E(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = layoutParams.leftMargin;
            int i4 = layoutParams.rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = layoutParams.topMargin;
            int i6 = layoutParams.bottomMargin;
            int iC = c(i, (width - paddingLeft) - paddingRight, width2 + i3 + i4);
            int iC2 = c(i2, (height - paddingTop) - paddingBottom, height2 + i5 + i6);
            if (iC == getScrollX() && iC2 == getScrollY()) {
                return;
            }
            super.scrollTo(iC, iC2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f20o) {
            this.f20o = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        P p = this.A;
        if (p.f) {
            View view = p.e;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aXb.z(view);
        }
        p.f = z;
    }

    public void setOnScrollChangeListener(OooO0O0 oooO0O0) {
        this.B = oooO0O0;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.A.c(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.A.l(0);
    }

    public boolean t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.e.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.e;
        return A(i, rect3.top, rect3.bottom);
    }

    public boolean x(int i) {
        return this.A.j(i) != null;
    }

    public final boolean y(View view, int i, int i2) {
        view.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(view, this.e);
        return this.e.bottom + i >= getScrollY() && this.e.top - i <= getScrollY() + i2;
    }

    public final void z(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.g(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
