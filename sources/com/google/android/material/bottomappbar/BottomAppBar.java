package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.P.J;
import ivas.gov.bisp.enumeration.da.c;
import ivas.gov.bisp.enumeration.da.h;
import ivas.gov.bisp.enumeration.da.i;
import ivas.gov.bisp.enumeration.da.j;
import ivas.gov.bisp.enumeration.da.p;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p103z.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.OooO0O0 {
    public static final /* synthetic */ int R = 0;
    public Animator S;
    public Integer T;
    public Animator U;
    public int V;
    public boolean W;
    public int aa;
    public int ab;
    public boolean ac;
    public Behavior ad;
    public int ae;

    public static class OooO00o extends l {
        public static final Parcelable.Creator<OooO00o> CREATOR = new C0005OooO00o();
        public int b;
        public boolean c;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0005OooO00o implements Parcelable.ClassLoaderCreator<OooO00o> {
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

        public OooO00o(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public OooO00o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readInt();
            this.c = parcel.readInt() != 0;
        }
    }

    public static void a(BottomAppBar bottomAppBar) {
        bottomAppBar.aa--;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return E(this.ae);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private p getTopEdgeTreatment() {
        throw null;
    }

    public final View B() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).i(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final FloatingActionButton C() {
        View viewB = B();
        if (viewB instanceof FloatingActionButton) {
            return (FloatingActionButton) viewB;
        }
        return null;
    }

    public int D(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zC = J.c(this);
        int measuredWidth = zC ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.OooO) && (((Toolbar.OooO) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = zC ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - (zC ? actionMenuView.getRight() : actionMenuView.getLeft());
    }

    public final float E(int i) {
        boolean zC = J.c(this);
        if (i == 1) {
            return (getMeasuredWidth() / 2) * (zC ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean F() {
        FloatingActionButton floatingActionButtonC = C();
        return floatingActionButtonC != null && floatingActionButtonC.o();
    }

    public final void G() {
        getTopEdgeTreatment().m = getFabTranslationX();
        B();
        if (this.ac) {
            F();
        }
        throw null;
    }

    public boolean H(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().j) {
            return false;
        }
        getTopEdgeTreatment().j = f;
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().k;
    }

    public int getFabAlignmentMode() {
        return this.ae;
    }

    public int getFabAnimationMode() {
        return this.V;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().a;
    }

    public boolean getHideOnScroll() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r.C(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.S;
            if (animator2 != null) {
                animator2.cancel();
            }
            G();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.U != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (F()) {
            actionMenuView.setTranslationX(D(actionMenuView, this.ae, this.ac));
        } else {
            actionMenuView.setTranslationX(D(actionMenuView, 0, false));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO00o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO00o oooO00o = (OooO00o) parcelable;
        super.onRestoreInstanceState(oooO00o.e);
        this.ae = oooO00o.b;
        this.ac = oooO00o.c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        OooO00o oooO00o = new OooO00o(super.onSaveInstanceState());
        oooO00o.b = this.ae;
        oooO00o.c = this.ac;
        return oooO00o;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            p topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f < 0.0f) {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            topEdgeTreatment.k = f;
            throw null;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        this.ab = 0;
        boolean z = this.ac;
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aXa.d(this)) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (F()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - D(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.addListener(new ivas.gov.bisp.enumeration.da.r(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.U = animatorSet2;
            animatorSet2.addListener(new h(this));
            this.U.start();
        } else {
            int i3 = this.ab;
            if (i3 != 0) {
                this.ab = 0;
                getMenu().clear();
                q(i3);
            }
        }
        if (this.ae != i && T.aXa.d(this)) {
            Animator animator2 = this.S;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.V == 1) {
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(C(), "translationX", E(i));
                objectAnimatorOfFloat3.setDuration(300L);
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                FloatingActionButton floatingActionButtonC = C();
                if (floatingActionButtonC != null && !floatingActionButtonC.n()) {
                    this.aa++;
                    floatingActionButtonC.g(new c(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.S = animatorSet3;
            animatorSet3.addListener(new j(this));
            this.S.start();
        }
        this.ae = i;
    }

    public void setFabAnimationMode(int i) {
        this.V = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().l) {
            return;
        }
        getTopEdgeTreatment().l = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().b = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().a = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.W = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.T != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.T.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.T = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    public Behavior getBehavior() {
        if (this.ad == null) {
            this.ad = new Behavior();
        }
        return this.ad;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public WeakReference<BottomAppBar> e;
        public final Rect f;
        public int g;
        public final View.OnLayoutChangeListener h;

        public class OooO00o implements View.OnLayoutChangeListener {
            public OooO00o() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.e.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.p(rect);
                int iHeight = Behavior.this.f.height();
                bottomAppBar.H(iHeight);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().j.b(new RectF(Behavior.this.f)));
                CoordinatorLayout.OooOO0 oooOO0 = (CoordinatorLayout.OooOO0) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    int measuredHeight = (floatingActionButton.getMeasuredHeight() - iHeight) / 2;
                    ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(ivas.gov.bisp.enumeration.R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                    ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin = bottomAppBar.getRightInset();
                    if (J.c(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin = ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin = ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin;
                    }
                }
            }
        }

        public Behavior() {
            this.h = new OooO00o();
            this.f = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.e = new WeakReference<>(bottomAppBar);
            View viewB = bottomAppBar.B();
            if (viewB != null) {
                WeakHashMap<View, R> weakHashMap = T.c;
                if (!T.aXa.d(viewB)) {
                    CoordinatorLayout.OooOO0 oooOO0 = (CoordinatorLayout.OooOO0) viewB.getLayoutParams();
                    oooOO0.e = 49;
                    this.g = ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin;
                    if (viewB instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewB;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(ivas.gov.bisp.enumeration.R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(ivas.gov.bisp.enumeration.R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.h);
                        floatingActionButton.i(null);
                        floatingActionButton.k(new i(bottomAppBar));
                        floatingActionButton.j(null);
                    }
                    bottomAppBar.G();
                    throw null;
                }
            }
            coordinatorLayout.z(bottomAppBar, i);
            this.a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return ((BottomAppBar) view).getHideOnScroll() && i == 2;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new OooO00o();
            this.f = new Rect();
        }
    }
}
