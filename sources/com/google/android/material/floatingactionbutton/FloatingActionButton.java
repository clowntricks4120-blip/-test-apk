package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.o;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.S.L;
import ivas.gov.bisp.enumeration.S.R;
import ivas.gov.bisp.enumeration.T.C0026p;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.o0000O00.o00O0O;
import ivas.gov.bisp.enumeration.o0OOO0o.OooOOO;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p088k.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends o00O0O implements L, o, CoordinatorLayout.OooO0O0 {
    public int a;
    public ColorStateList b;
    public PorterDuff.Mode d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public ColorStateList g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final Rect l;
    public boolean m;
    public final Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ivas.gov.bisp.enumeration.p088k.o f36o;
    public r p;
    public final R q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OooO00o {
        public void b(FloatingActionButton floatingActionButton) {
        }

        public void c(FloatingActionButton floatingActionButton) {
        }
    }

    public class OooO0O0 implements ivas.gov.bisp.enumeration.R.c {
        public OooO0O0() {
        }
    }

    public class OooO0OO<T extends FloatingActionButton> implements r.aOz {
        public final OooOOO<T> a;

        public OooO0OO(OooOOO<T> oooOOO) {
            this.a = oooOOO;
        }

        @Override // com.google.android.material.floatingactionbutton.r.aOz
        public void b() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.r.aOz
        public void e() {
            this.a.e(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof OooO0OO) && ((OooO0OO) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.floatingActionButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_FloatingActionButton), attributeSet, ivas.gov.bisp.enumeration.R.attr.floatingActionButtonStyle);
        this.l = new Rect();
        this.n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = a.e(context2, attributeSet, ivas.gov.bisp.enumeration.O.r.r, ivas.gov.bisp.enumeration.R.attr.floatingActionButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.b = ivas.gov.bisp.enumeration.aL.h.b(context2, typedArrayE, 1);
        this.d = ivas.gov.bisp.enumeration.P.J.d(typedArrayE.getInt(2, -1), null);
        this.g = ivas.gov.bisp.enumeration.aL.h.b(context2, typedArrayE, 12);
        this.a = typedArrayE.getInt(7, -1);
        this.i = typedArrayE.getDimensionPixelSize(6, 0);
        this.h = typedArrayE.getDimensionPixelSize(3, 0);
        float dimension = typedArrayE.getDimension(4, 0.0f);
        float dimension2 = typedArrayE.getDimension(9, 0.0f);
        float dimension3 = typedArrayE.getDimension(11, 0.0f);
        this.m = typedArrayE.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayE.getDimensionPixelSize(10, 0));
        C0026p c0026pC = C0026p.c(context2, typedArrayE, 15);
        C0026p c0026pC2 = C0026p.c(context2, typedArrayE, 8);
        t tVarE = t.f(context2, attributeSet, ivas.gov.bisp.enumeration.R.attr.floatingActionButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_FloatingActionButton, t.c).e();
        boolean z = typedArrayE.getBoolean(5, false);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        ivas.gov.bisp.enumeration.p088k.o oVar = new ivas.gov.bisp.enumeration.p088k.o(this);
        this.f36o = oVar;
        oVar.d(attributeSet, ivas.gov.bisp.enumeration.R.attr.floatingActionButtonStyle);
        this.q = new R(this);
        getImpl().s(tVarE);
        getImpl().j(this.b, this.d, this.g, this.h);
        getImpl().r = dimensionPixelSize;
        r impl = getImpl();
        if (impl.p != dimension) {
            impl.p = dimension;
            impl.p(dimension, impl.h, impl.q);
        }
        r impl2 = getImpl();
        if (impl2.h != dimension2) {
            impl2.h = dimension2;
            impl2.p(impl2.p, dimension2, impl2.q);
        }
        r impl3 = getImpl();
        if (impl3.q != dimension3) {
            impl3.q = dimension3;
            impl3.p(impl3.p, impl3.h, dimension3);
        }
        getImpl().t = c0026pC;
        getImpl().v = c0026pC2;
        getImpl().m = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static int e(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private r getImpl() {
        if (this.p == null) {
            this.p = new ivas.gov.bisp.enumeration.aE.r(this, new OooO0O0());
        }
        return this.p;
    }

    @Override // ivas.gov.bisp.enumeration.S.L
    public boolean b() {
        return this.q.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().n(getDrawableState());
    }

    public void g(OooO00o oooO00o, boolean z) {
        r impl = getImpl();
        j jVar = oooO00o == null ? null : new j(this, oooO00o);
        if (impl.k()) {
            return;
        }
        Animator animator = impl.u;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.x()) {
            impl.E.d(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.a.b(jVar.b);
                return;
            }
            return;
        }
        C0026p c0026p = impl.v;
        AnimatorSet animatorSetE = c0026p != null ? impl.e(c0026p, 0.0f, 0.0f, 0.0f) : impl.f(0.0f, 0.4f, 0.4f);
        animatorSetE.addListener(new c(impl, z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.B;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetE.addListener(it.next());
            }
        }
        animatorSetE.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0O0
    public CoordinatorLayout.OooO0OO<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().i();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().h;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().q;
    }

    public Drawable getContentBackground() {
        return getImpl().n;
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        return this.q.c;
    }

    public C0026p getHideMotionSpec() {
        return getImpl().v;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.g;
    }

    public t getShapeAppearanceModel() {
        t tVar = getImpl().i;
        Objects.requireNonNull(tVar);
        return tVar;
    }

    public C0026p getShowMotionSpec() {
        return getImpl().t;
    }

    public int getSize() {
        return this.a;
    }

    public int getSizeDimension() {
        return m(this.a);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    public void i(Animator.AnimatorListener animatorListener) {
        r impl = getImpl();
        if (impl.B == null) {
            impl.B = new ArrayList<>();
        }
        impl.B.add(null);
    }

    public void j(OooOOO<? extends FloatingActionButton> oooOOO) {
        r impl = getImpl();
        OooO0OO oooO0OO = new OooO0OO(null);
        if (impl.D == null) {
            impl.D = new ArrayList<>();
        }
        impl.D.add(oooO0OO);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().l();
    }

    public void k(Animator.AnimatorListener animatorListener) {
        r impl = getImpl();
        if (impl.C == null) {
            impl.C = new ArrayList<>();
        }
        impl.C.add(animatorListener);
    }

    @Deprecated
    public boolean l(Rect rect) {
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if (!T.aXa.d(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public final int m(int i) {
        int i2 = this.i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m(1) : m(0);
    }

    public boolean n() {
        return getImpl().k();
    }

    public boolean o() {
        return getImpl().c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r impl = getImpl();
        C0019p c0019p = impl.j;
        if (c0019p != null) {
            ivas.gov.bisp.enumeration.O.r.C(impl.E, c0019p);
        }
        if (!(impl instanceof ivas.gov.bisp.enumeration.aE.r)) {
            ViewTreeObserver viewTreeObserver = impl.E.getViewTreeObserver();
            if (impl.I == null) {
                impl.I = new ivas.gov.bisp.enumeration.aE.h(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.I);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.E.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.I;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.I = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.k) / 2;
        getImpl().z();
        int iMin = Math.min(e(sizeDimension, i), e(sizeDimension, i2));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ivas.gov.bisp.enumeration.aP.j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ivas.gov.bisp.enumeration.aP.j jVar = (ivas.gov.bisp.enumeration.aP.j) parcelable;
        super.onRestoreInstanceState(jVar.e);
        R r = this.q;
        Object orDefault = jVar.f.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = (Bundle) orDefault;
        Objects.requireNonNull(r);
        r.b = bundle.getBoolean("expanded", false);
        r.c = bundle.getInt("expandedComponentIdHint", 0);
        if (r.b) {
            ViewParent parent = r.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).f(r.a);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ivas.gov.bisp.enumeration.aP.j jVar = new ivas.gov.bisp.enumeration.aP.j(parcelableOnSaveInstanceState);
        OooOOOO<String, Bundle> oooOOOO = jVar.f;
        R r = this.q;
        Objects.requireNonNull(r);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", r.b);
        bundle.putInt("expandedComponentIdHint", r.c);
        oooOOOO.put("expandableWidgetHelper", bundle);
        return jVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && l(this.n) && !this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.l;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(P.d(colorForState, mode));
    }

    public void r(OooO00o oooO00o, boolean z) {
        r impl = getImpl();
        j jVar = oooO00o == null ? null : new j(this, oooO00o);
        if (impl.c()) {
            return;
        }
        Animator animator = impl.u;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.t == null;
        if (!impl.x()) {
            impl.E.d(0, z);
            impl.E.setAlpha(1.0f);
            impl.E.setScaleY(1.0f);
            impl.E.setScaleX(1.0f);
            impl.r(1.0f);
            if (jVar != null) {
                jVar.a.c(jVar.b);
                return;
            }
            return;
        }
        if (impl.E.getVisibility() != 0) {
            impl.E.setAlpha(0.0f);
            impl.E.setScaleY(z2 ? 0.4f : 0.0f);
            impl.E.setScaleX(z2 ? 0.4f : 0.0f);
            impl.r(z2 ? 0.4f : 0.0f);
        }
        C0026p c0026p = impl.t;
        AnimatorSet animatorSetE = c0026p != null ? impl.e(c0026p, 1.0f, 1.0f, 1.0f) : impl.f(1.0f, 1.0f, 1.0f);
        animatorSetE.addListener(new h(impl, z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.C;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetE.addListener(it.next());
            }
        }
        animatorSetE.start();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            r impl = getImpl();
            C0019p c0019p = impl.j;
            if (c0019p != null) {
                c0019p.setTintList(colorStateList);
            }
            ivas.gov.bisp.enumeration.aE.j jVar = impl.l;
            if (jVar != null) {
                jVar.d(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            C0019p c0019p = getImpl().j;
            if (c0019p != null) {
                c0019p.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        r impl = getImpl();
        if (impl.p != f) {
            impl.p = f;
            impl.p(f, impl.h, impl.q);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        r impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.p(impl.p, f, impl.q);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        r impl = getImpl();
        if (impl.q != f) {
            impl.q = f;
            impl.p(impl.p, impl.h, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().v(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m) {
            getImpl().m = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.q.c = i;
    }

    public void setHideMotionSpec(C0026p c0026p) {
        getImpl().v = c0026p;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0026p.d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            r impl = getImpl();
            impl.r(impl.y);
            if (this.f != null) {
                q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f36o.e(i);
        q();
    }

    public void setMaxImageSize(int i) {
        this.k = i;
        r impl = getImpl();
        if (impl.x != i) {
            impl.x = i;
            impl.r(impl.y);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().o();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().o();
    }

    public void setShadowPaddingEnabled(boolean z) {
        r impl = getImpl();
        impl.f37o = z;
        impl.z();
    }

    @Override // ivas.gov.bisp.enumeration.O.o
    public void setShapeAppearanceModel(t tVar) {
        getImpl().s(tVar);
    }

    public void setShowMotionSpec(C0026p c0026p) {
        getImpl().t = c0026p;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0026p.d(getContext(), i));
    }

    public void setSize(int i) {
        this.i = 0;
        if (i != this.a) {
            this.a = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().q();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().q();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().q();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            getImpl().m();
        }
    }

    @Override // ivas.gov.bisp.enumeration.o0000O00.o00O0O, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.OooO0OO<T> {
        public Rect a;
        public boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean d(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public void f(CoordinatorLayout.OooOO0 oooOO0) {
            if (oooOO0.i == 0) {
                oooOO0.i = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.OooOO0) || !(((CoordinatorLayout.OooOO0) layoutParams).b instanceof BottomSheetBehavior)) {
                return false;
            }
            v(view2, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> listK = coordinatorLayout.k(floatingActionButton);
            int size = listK.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = listK.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.OooOO0) && (((CoordinatorLayout.OooOO0) layoutParams).b instanceof BottomSheetBehavior) && v(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.z(floatingActionButton, i);
            Rect rect = floatingActionButton.l;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.OooOO0 oooOO0 = (CoordinatorLayout.OooOO0) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) oooOO0).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) oooOO0).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) oooOO0).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) oooOO0).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((CoordinatorLayout.OooOO0) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean v(View view, FloatingActionButton floatingActionButton) {
            if (!u(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.OooOO0) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.r(null, false);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!u(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ivas.gov.bisp.enumeration.P.r.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.r(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.t);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            getImpl().t(this.g);
        }
    }
}
