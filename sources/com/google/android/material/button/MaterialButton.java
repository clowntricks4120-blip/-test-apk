package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.o;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.aG.j;
import ivas.gov.bisp.enumeration.aL.h;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p103z.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o {
    public static final int[] d = {R.attr.state_checkable};
    public static final int[] e = {R.attr.state_checked};
    public ColorStateList f;
    public final LinkedHashSet<OooO00o> g;
    public final j h;
    public OooO0O0 i;
    public PorterDuff.Mode j;
    public Drawable k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33o;
    public boolean p;
    public boolean q;
    public int r;

    public interface OooO00o {
        void b(MaterialButton materialButton, boolean z);
    }

    public interface OooO0O0 {
    }

    public static class OooO0OO extends l {
        public static final Parcelable.Creator<OooO0OO> CREATOR = new OooO00o();
        public boolean b;

        public static final class OooO00o implements Parcelable.ClassLoaderCreator<OooO0OO> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final OooO0OO createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new OooO0OO(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OooO0OO[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new OooO0OO(parcel, null);
            }
        }

        public OooO0OO(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public OooO0OO(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readInt() == 1;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.materialButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Button), attributeSet, ivas.gov.bisp.enumeration.R.attr.materialButtonStyle);
        this.g = new LinkedHashSet<>();
        this.p = false;
        this.q = false;
        Context context2 = getContext();
        TypedArray typedArrayE = a.e(context2, attributeSet, r.y, ivas.gov.bisp.enumeration.R.attr.materialButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.n = typedArrayE.getDimensionPixelSize(12, 0);
        this.j = ivas.gov.bisp.enumeration.P.J.d(typedArrayE.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f = h.b(getContext(), typedArrayE, 14);
        this.k = h.d(getContext(), typedArrayE, 10);
        this.r = typedArrayE.getInteger(11, 1);
        this.l = typedArrayE.getDimensionPixelSize(13, 0);
        j jVar = new j(this, t.e(context2, attributeSet, ivas.gov.bisp.enumeration.R.attr.materialButtonStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Button).e());
        this.h = jVar;
        jVar.f = typedArrayE.getDimensionPixelOffset(1, 0);
        jVar.g = typedArrayE.getDimensionPixelOffset(2, 0);
        jVar.i = typedArrayE.getDimensionPixelOffset(3, 0);
        jVar.h = typedArrayE.getDimensionPixelOffset(4, 0);
        if (typedArrayE.hasValue(8)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(8, -1);
            jVar.j = dimensionPixelSize;
            jVar.h(jVar.e.h(dimensionPixelSize));
            jVar.r = true;
        }
        jVar.k = typedArrayE.getDimensionPixelSize(20, 0);
        jVar.c = ivas.gov.bisp.enumeration.P.J.d(typedArrayE.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        jVar.l = h.b(getContext(), typedArrayE, 6);
        jVar.m = h.b(getContext(), typedArrayE, 19);
        jVar.n = h.b(getContext(), typedArrayE, 16);
        jVar.t = typedArrayE.getBoolean(5, false);
        jVar.u = typedArrayE.getDimensionPixelSize(9, 0);
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        int iG = T.aWY.g(this);
        int paddingTop = getPaddingTop();
        int iH = T.aWY.h(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            jVar.q = true;
            setSupportBackgroundTintList(jVar.l);
            setSupportBackgroundTintMode(jVar.c);
        } else {
            jVar.i();
        }
        T.aWY.l(this, iG + jVar.f, paddingTop + jVar.i, iH + jVar.g, paddingBottom + jVar.h);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.n);
        l(this.k != null);
    }

    private String getA11yClassName() {
        return (f() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public boolean f() {
        j jVar = this.h;
        return jVar != null && jVar.t;
    }

    public final boolean g() {
        int i = this.r;
        return i == 3 || i == 4;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (k()) {
            return this.h.j;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public int getIconGravity() {
        return this.r;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.l;
    }

    public ColorStateList getIconTint() {
        return this.f;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.j;
    }

    public int getInsetBottom() {
        return this.h.h;
    }

    public int getInsetTop() {
        return this.h.i;
    }

    public ColorStateList getRippleColor() {
        if (k()) {
            return this.h.n;
        }
        return null;
    }

    public t getShapeAppearanceModel() {
        if (k()) {
            return this.h.e;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (k()) {
            return this.h.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (k()) {
            return this.h.k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return k() ? this.h.l : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return k() ? this.h.c : super.getSupportBackgroundTintMode();
    }

    public final boolean h() {
        int i = this.r;
        return i == 1 || i == 2;
    }

    public final boolean i() {
        int i = this.r;
        return i == 16 || i == 32;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.p;
    }

    public final void j() {
        if (h()) {
            setCompoundDrawablesRelative(this.k, null, null, null);
        } else if (g()) {
            setCompoundDrawablesRelative(null, null, this.k, null);
        } else if (i()) {
            setCompoundDrawablesRelative(null, this.k, null, null);
        }
    }

    public final boolean k() {
        j jVar = this.h;
        return (jVar == null || jVar.q) ? false : true;
    }

    public final void l(boolean z) {
        Drawable drawable = this.k;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.k = drawableMutate;
            drawableMutate.setTintList(this.f);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.k.setTintMode(mode);
            }
            int intrinsicWidth = this.l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.k.getIntrinsicWidth();
            }
            int intrinsicHeight = this.l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.k;
            int i = this.m;
            int i2 = this.f33o;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.k.setVisible(true, z);
        }
        if (z) {
            j();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!h() || drawable3 == this.k) && ((!g() || drawable5 == this.k) && (!i() || drawable4 == this.k))) {
            return;
        }
        j();
    }

    public final void m(int i, int i2) {
        if (this.k == null || getLayout() == null) {
            return;
        }
        if (!h() && !g()) {
            if (i()) {
                this.m = 0;
                if (this.r == 16) {
                    this.f33o = 0;
                    l(false);
                    return;
                }
                int intrinsicHeight = this.l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.k.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2;
                if (this.f33o != textHeight) {
                    this.f33o = textHeight;
                    l(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f33o = 0;
        int i3 = this.r;
        if (i3 == 1 || i3 == 3) {
            this.m = 0;
            l(false);
            return;
        }
        int intrinsicWidth = this.l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.k.getIntrinsicWidth();
        }
        int textWidth = getTextWidth();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        int iH = (((((i - textWidth) - T.aWY.h(this)) - intrinsicWidth) - this.n) - T.aWY.g(this)) / 2;
        if ((T.aWY.f(this) == 1) != (this.r == 4)) {
            iH = -iH;
        }
        if (this.m != iH) {
            this.m = iH;
            l(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (k()) {
            r.C(this, this.h.d());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (f()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, d);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO0OO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO0OO oooO0OO = (OooO0OO) parcelable;
        super.onRestoreInstanceState(oooO0OO.e);
        setChecked(oooO0OO.b);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        OooO0OO oooO0OO = new OooO0OO(super.onSaveInstanceState());
        oooO0OO.b = this.p;
        return oooO0OO;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.k != null) {
            if (this.k.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!k()) {
            super.setBackgroundColor(i);
            return;
        }
        j jVar = this.h;
        if (jVar.d() != null) {
            jVar.d().setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (k()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            j jVar = this.h;
            jVar.q = true;
            jVar.d.setSupportBackgroundTintList(jVar.l);
            jVar.d.setSupportBackgroundTintMode(jVar.c);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? A.c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (k()) {
            this.h.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (f() && isEnabled() && this.p != z) {
            this.p = z;
            refreshDrawableState();
            if (this.q) {
                return;
            }
            this.q = true;
            Iterator<OooO00o> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().b(this, this.p);
            }
            this.q = false;
        }
    }

    public void setCornerRadius(int i) {
        if (k()) {
            j jVar = this.h;
            if (jVar.r && jVar.j == i) {
                return;
            }
            jVar.j = i;
            jVar.r = true;
            jVar.h(jVar.e.h(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (k()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (k()) {
            C0019p c0019pD = this.h.d();
            C0019p.bfp bfpVar = c0019pD.e;
            if (bfpVar.q != f) {
                bfpVar.q = f;
                c0019pD.w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.k != drawable) {
            this.k = drawable;
            l(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.r != i) {
            this.r = i;
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? A.c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.l != i) {
            this.l = i;
            l(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            l(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            l(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(A.b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        j jVar = this.h;
        jVar.g(jVar.i, i);
    }

    public void setInsetTop(int i) {
        j jVar = this.h;
        jVar.g(i, jVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(OooO0O0 oooO0O0) {
        this.i = oooO0O0;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        OooO0O0 oooO0O0 = this.i;
        if (oooO0O0 != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (k()) {
            j jVar = this.h;
            if (jVar.n != colorStateList) {
                jVar.n = colorStateList;
                if (jVar.d.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) jVar.d.getBackground()).setColor(ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (k()) {
            setRippleColor(A.b(getContext(), i));
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.o
    public void setShapeAppearanceModel(t tVar) {
        if (!k()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.h.h(tVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (k()) {
            j jVar = this.h;
            jVar.f59o = z;
            jVar.j();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (k()) {
            j jVar = this.h;
            if (jVar.m != colorStateList) {
                jVar.m = colorStateList;
                jVar.j();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (k()) {
            setStrokeColor(A.b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (k()) {
            j jVar = this.h;
            if (jVar.k != i) {
                jVar.k = i;
                jVar.j();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (k()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!k()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        j jVar = this.h;
        if (jVar.l != colorStateList) {
            jVar.l = colorStateList;
            if (jVar.d() != null) {
                jVar.d().setTintList(jVar.l);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!k()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        j jVar = this.h;
        if (jVar.c != mode) {
            jVar.c = mode;
            if (jVar.d() == null || jVar.c == null) {
                return;
            }
            jVar.d().setTintMode(jVar.c);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.p);
    }
}
