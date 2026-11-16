package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.N.q;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.o;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.OooOOO0.OooO;
import ivas.gov.bisp.enumeration.P.a;
import ivas.gov.bisp.enumeration.T.C0026p;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p008ah.c;
import ivas.gov.bisp.enumeration.p011ak.am;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p096p.h;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends OooO implements j.aNX, o {
    public View.OnClickListener h;
    public j i;
    public InsetDrawable j;
    public RippleDrawable k;
    public CompoundButton.OnCheckedChangeListener l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34o;
    public boolean p;
    public boolean q;
    public int r;
    public final OooO0O0 s;
    public int t;
    public boolean u;
    public final RectF v;
    public final Rect w;
    public final h x;
    public static final Rect b = new Rect();
    public static final int[] a = {R.attr.state_selected};
    public static final int[] g = {R.attr.state_checkable};

    public class OooO00o extends h {
        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aG(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            j jVar = chip.i;
            chip.setText(jVar.an ? jVar.J : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // ivas.gov.bisp.enumeration.p096p.h
        public void aH(int i) {
        }
    }

    public class OooO0O0 extends q {
        public OooO0O0(Chip chip) {
            super(chip);
        }

        @Override // ivas.gov.bisp.enumeration.N.q
        public void q(List<Integer> list) {
            Chip chip;
            j jVar;
            list.add(0);
            if (!Chip.this.n() || (jVar = (chip = Chip.this).i) == null || !jVar.N || chip.h == null) {
                return;
            }
            list.add(1);
        }

        @Override // ivas.gov.bisp.enumeration.N.q
        public boolean s(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.o();
            }
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.N.q
        public void u(int i, al alVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i != 1) {
                alVar.d.setContentDescription(BuildConfig.FLAVOR);
                alVar.d.setBoundsInParent(Chip.b);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                alVar.d.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                alVar.d.setContentDescription(context.getString(ivas.gov.bisp.enumeration.R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            alVar.d.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            alVar.f(al.aXC.e);
            alVar.d.setEnabled(Chip.this.isEnabled());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(J.b(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, ivas.gov.bisp.enumeration.R.attr.chipStyle);
        this.w = new Rect();
        this.v = new RectF();
        this.x = new OooO00o();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        j jVar = new j(context2, attributeSet, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action);
        Context context3 = jVar.ah;
        int[] iArr = r.f48o;
        TypedArray typedArrayE = a.e(context3, attributeSet, iArr, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        jVar.ao = typedArrayE.hasValue(37);
        ColorStateList colorStateListB = ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 24);
        if (jVar.A != colorStateListB) {
            jVar.A = colorStateListB;
            jVar.onStateChange(jVar.getState());
        }
        jVar.I(ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 11));
        jVar.W(typedArrayE.getDimension(19, 0.0f));
        if (typedArrayE.hasValue(12)) {
            jVar.T(typedArrayE.getDimension(12, 0.0f));
        }
        jVar.Y(ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 22));
        jVar.Z(typedArrayE.getDimension(23, 0.0f));
        jVar.aj(ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 36));
        jVar.az(typedArrayE.getText(5));
        ivas.gov.bisp.enumeration.aL.r rVar = (!typedArrayE.hasValue(0) || (resourceId = typedArrayE.getResourceId(0, 0)) == 0) ? null : new ivas.gov.bisp.enumeration.aL.r(jVar.ah, resourceId);
        rVar.m = typedArrayE.getDimension(1, rVar.m);
        jVar.ar.d(rVar, jVar.ah);
        int i = typedArrayE.getInt(3, 0);
        if (i == 1) {
            jVar.am = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            jVar.am = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            jVar.am = TextUtils.TruncateAt.END;
        }
        jVar.at(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            jVar.at(typedArrayE.getBoolean(15, false));
        }
        jVar.U(ivas.gov.bisp.enumeration.aL.h.d(jVar.ah, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            jVar.V(ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 17));
        }
        jVar.R(typedArrayE.getDimension(16, -1.0f));
        jVar.ah(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            jVar.ah(typedArrayE.getBoolean(26, false));
        }
        jVar.aa(ivas.gov.bisp.enumeration.aL.h.d(jVar.ah, typedArrayE, 25));
        jVar.af(ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 30));
        jVar.ac(typedArrayE.getDimension(28, 0.0f));
        jVar.O(typedArrayE.getBoolean(6, false));
        jVar.Q(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            jVar.Q(typedArrayE.getBoolean(8, false));
        }
        jVar.N(ivas.gov.bisp.enumeration.aL.h.d(jVar.ah, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            jVar.P(ivas.gov.bisp.enumeration.aL.h.b(jVar.ah, typedArrayE, 9));
        }
        jVar.W = C0026p.c(jVar.ah, typedArrayE, 39);
        jVar.X = C0026p.c(jVar.ah, typedArrayE, 33);
        jVar.X(typedArrayE.getDimension(21, 0.0f));
        jVar.ai(typedArrayE.getDimension(35, 0.0f));
        jVar.ag(typedArrayE.getDimension(34, 0.0f));
        jVar.au(typedArrayE.getDimension(41, 0.0f));
        jVar.aE(typedArrayE.getDimension(40, 0.0f));
        jVar.ad(typedArrayE.getDimension(29, 0.0f));
        jVar.ab(typedArrayE.getDimension(27, 0.0f));
        jVar.S(typedArrayE.getDimension(13, 0.0f));
        jVar.ak = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        a.b(context2, attributeSet, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action);
        a.c(context2, attributeSet, iArr, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action);
        this.q = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.t = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(jVar);
        jVar.s(T.aXb.b(this));
        a.b(context2, attributeSet, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action);
        a.c(context2, attributeSet, iArr, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, ivas.gov.bisp.enumeration.R.attr.chipStyle, ivas.gov.bisp.enumeration.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.s = new OooO0O0(this);
        j();
        if (!zHasValue) {
            setOutlineProvider(new ivas.gov.bisp.enumeration.aI.j(this));
        }
        setChecked(this.m);
        setText(jVar.J);
        setEllipsize(jVar.am);
        s();
        if (!this.i.an) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        r();
        if (this.q) {
            setMinHeight(this.t);
        }
        this.r = T.aWY.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.v.setEmpty();
        if (n() && this.h != null) {
            j jVar = this.i;
            jVar.E(jVar.getBounds(), this.v);
        }
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.w.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.w;
    }

    private ivas.gov.bisp.enumeration.aL.r getTextAppearance() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.ar.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.j.aNX
    public void b() {
        l(this.t);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        if (!this.u) {
            return super.dispatchHoverEvent(motionEvent);
        }
        OooO0O0 oooO0O0 = this.s;
        if (oooO0O0.n.isEnabled() && oooO0O0.n.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int i2 = (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY())) ? 1 : 0;
                int i3 = oooO0O0.r;
                if (i3 != i2) {
                    oooO0O0.r = i2;
                    oooO0O0.v(i2, 128);
                    oooO0O0.v(i3, 256);
                }
            } else if (action != 10 || (i = oooO0O0.r) == Integer.MIN_VALUE) {
                z = false;
            } else if (i != Integer.MIN_VALUE) {
                oooO0O0.r = Integer.MIN_VALUE;
                oooO0O0.v(Integer.MIN_VALUE, 128);
                oooO0O0.v(i, 256);
            }
            z = true;
        } else {
            z = false;
        }
        return z || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[RETURN] */
    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zP;
        int i;
        if (!this.u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        OooO0O0 oooO0O0 = this.s;
        Objects.requireNonNull(oooO0O0);
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case IMediaSession.Stub.TRANSACTION_stop /* 19 */:
                        case IMediaSession.Stub.TRANSACTION_next /* 20 */:
                        case IMediaSession.Stub.TRANSACTION_previous /* 21 */:
                        case IMediaSession.Stub.TRANSACTION_fastForward /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount();
                                int i3 = 0;
                                zP = false;
                                while (i3 < repeatCount + 1 && oooO0O0.p(i2, null)) {
                                    i3++;
                                    zP = true;
                                }
                                if (zP) {
                                    if (this.s.q != Integer.MIN_VALUE) {
                                        return true;
                                    }
                                }
                            }
                            break;
                        case IMediaSession.Stub.TRANSACTION_rewind /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = oooO0O0.q;
                                if (i != Integer.MIN_VALUE) {
                                    oooO0O0.s(i, 16, null);
                                }
                                if (this.s.q != Integer.MIN_VALUE) {
                                    return true;
                                }
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = oooO0O0.q;
                    if (i != Integer.MIN_VALUE) {
                        oooO0O0.s(i, 16, null);
                    }
                    if (this.s.q != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    zP = oooO0O0.p(2, null);
                } else if (keyEvent.hasModifiers(1)) {
                    zP = oooO0O0.p(1, null);
                }
                if (zP) {
                    if (this.s.q != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // ivas.gov.bisp.enumeration.OooOOO0.OooO, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        j jVar = this.i;
        if (jVar == null || !j.c(jVar.P)) {
            return;
        }
        j jVar2 = this.i;
        ?? IsEnabled = isEnabled();
        if (this.f34o) {
            i = IsEnabled;
            i = IsEnabled + 1;
        }
        i = IsEnabled;
        int i2 = i;
        if (this.p) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.n) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f34o) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.p) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.n) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        if (jVar2.ae(iArr)) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!m()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.j;
        return insetDrawable == null ? this.i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.V;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.aq;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.B;
        }
        return null;
    }

    public float getChipCornerRadius() {
        j jVar = this.i;
        if (jVar != null) {
            return Math.max(0.0f, jVar.H());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.i;
    }

    public float getChipEndPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.af;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        j jVar = this.i;
        if (jVar == null || (drawable = jVar.H) == 0) {
            return null;
        }
        return drawable instanceof c ? ((c) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.L;
        }
        return null;
    }

    public float getChipMinHeight() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.E;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.F;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.J();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.S;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.ae;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.T;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.ad;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.G;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.am;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.u) {
            OooO0O0 oooO0O0 = this.s;
            if (oooO0O0.q == 1 || oooO0O0.p == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0026p getHideMotionSpec() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.X;
        }
        return null;
    }

    public float getIconEndPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.aa;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.I;
        }
        return null;
    }

    public t getShapeAppearanceModel() {
        return this.i.e.d;
    }

    public C0026p getShowMotionSpec() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.W;
        }
        return null;
    }

    public float getTextEndPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.ac;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        j jVar = this.i;
        if (jVar != null) {
            return jVar.ab;
        }
        return 0.0f;
    }

    public final void j() {
        j jVar;
        if (!n() || (jVar = this.i) == null || !jVar.N || this.h == null) {
            T.q(this, null);
            this.u = false;
        } else {
            T.q(this, this.s);
            this.u = true;
        }
    }

    public boolean l(int i) {
        this.t = i;
        if (!this.q) {
            if (this.j != null) {
                p();
            } else {
                q();
            }
            return false;
        }
        int iMax = Math.max(0, i - ((int) this.i.D));
        int iMax2 = Math.max(0, i - this.i.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.j != null) {
                p();
            } else {
                q();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                q();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.j = new InsetDrawable((Drawable) this.i, i2, i3, i2, i3);
        q();
        return true;
    }

    public boolean m() {
        j jVar = this.i;
        return jVar != null && jVar.U;
    }

    public final boolean n() {
        j jVar = this.i;
        return (jVar == null || jVar.J() == null) ? false : true;
    }

    public boolean o() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.u) {
            this.s.v(1, 1);
        }
        return z;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r.C(this, this.i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, a);
        }
        if (m()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.u) {
            OooO0O0 oooO0O0 = this.s;
            int i2 = oooO0O0.q;
            if (i2 != Integer.MIN_VALUE) {
                oooO0O0.n(i2);
            }
            if (z) {
                oooO0O0.p(i, rect);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.e) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(ivas.gov.bisp.enumeration.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) al.aXE.c(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).c);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(IMediaSession.Stub.TRANSACTION_seekTo)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(IMediaSession.Stub.TRANSACTION_skipToQueueItem)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.r != i) {
            this.r = i;
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L41
        L21:
            boolean r0 = r5.n
            if (r0 == 0) goto L41
            if (r1 != 0) goto L49
            r5.setCloseIconPressed(r3)
            goto L49
        L2b:
            boolean r0 = r5.n
            if (r0 == 0) goto L34
            r5.o()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            if (r0 != 0) goto L49
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.setCloseIconPressed(r2)
            goto L49
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
            goto L49
        L48:
            r2 = r3
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.j != null) {
            this.j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = ivas.gov.bisp.enumeration.p041bn.j.c;
            q();
        }
    }

    public final void q() {
        this.k = new RippleDrawable(ivas.gov.bisp.enumeration.p041bn.j.c(this.i.I), getBackgroundDrawable(), null);
        this.i.av(false);
        RippleDrawable rippleDrawable = this.k;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.s(this, rippleDrawable);
        r();
    }

    public final void r() {
        j jVar;
        if (TextUtils.isEmpty(getText()) || (jVar = this.i) == null) {
            return;
        }
        int iG = (int) (jVar.G() + jVar.af + jVar.ac);
        j jVar2 = this.i;
        int iD = (int) (jVar2.D() + jVar2.Y + jVar2.ab);
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            iD += rect.left;
            iG += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWY.l(this, iD, paddingTop, iG, paddingBottom);
    }

    public final void s() {
        TextPaint paint = getPaint();
        j jVar = this.i;
        if (jVar != null) {
            paint.drawableState = jVar.getState();
        }
        ivas.gov.bisp.enumeration.aL.r textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.h(getContext(), paint, this.x);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.k) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // ivas.gov.bisp.enumeration.OooOOO0.OooO, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.k) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // ivas.gov.bisp.enumeration.OooOOO0.OooO, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.O(z);
        }
    }

    public void setCheckableResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.O(jVar.ah.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        j jVar = this.i;
        if (jVar == null) {
            this.m = z;
            return;
        }
        if (jVar.U) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.l) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.N(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.N(A.c(jVar.ah, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.P(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.P(A.b(jVar.ah, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.Q(jVar.ah.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        j jVar = this.i;
        if (jVar == null || jVar.B == colorStateList) {
            return;
        }
        jVar.B = colorStateList;
        jVar.onStateChange(jVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.I(A.b(jVar.ah, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.T(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.T(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(j jVar) {
        j jVar2 = this.i;
        if (jVar2 != jVar) {
            if (jVar2 != null) {
                jVar2.al = new WeakReference<>(null);
            }
            this.i = jVar;
            jVar.an = false;
            Objects.requireNonNull(jVar);
            jVar.al = new WeakReference<>(this);
            l(this.t);
        }
    }

    public void setChipEndPadding(float f) {
        j jVar = this.i;
        if (jVar == null || jVar.af == f) {
            return;
        }
        jVar.af = f;
        jVar.invalidateSelf();
        jVar.L();
    }

    public void setChipEndPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.S(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.U(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.U(A.c(jVar.ah, i));
        }
    }

    public void setChipIconSize(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.R(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.R(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.V(A.b(jVar.ah, i));
        }
    }

    public void setChipIconVisible(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.at(jVar.ah.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        j jVar = this.i;
        if (jVar == null || jVar.D == f) {
            return;
        }
        jVar.D = f;
        jVar.invalidateSelf();
        jVar.L();
    }

    public void setChipMinHeightResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.W(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        j jVar = this.i;
        if (jVar == null || jVar.Y == f) {
            return;
        }
        jVar.Y = f;
        jVar.invalidateSelf();
        jVar.L();
    }

    public void setChipStartPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.X(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.Y(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.Y(A.b(jVar.ah, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.Z(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.Z(jVar.ah.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.aa(drawable);
        }
        j();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        j jVar = this.i;
        if (jVar == null || jVar.S == charSequence) {
            return;
        }
        am amVarE = am.e();
        jVar.S = amVarE.f(charSequence, amVarE.j, true);
        jVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ab(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ab(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.aa(A.c(jVar.ah, i));
        }
        j();
    }

    public void setCloseIconSize(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ac(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ac(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ad(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ad(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.af(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.af(A.b(jVar.ah, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        j jVar = this.i;
        if (jVar != null) {
            C0019p.bfp bfpVar = jVar.e;
            if (bfpVar.q != f) {
                bfpVar.q = f;
                jVar.w();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.i == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        j jVar = this.i;
        if (jVar != null) {
            jVar.am = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.q = z;
        l(this.t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0026p c0026p) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.X = c0026p;
        }
    }

    public void setHideMotionSpecResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.X = C0026p.d(jVar.ah, i);
        }
    }

    public void setIconEndPadding(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ag(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ag(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ai(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ai(jVar.ah.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.i == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        j jVar = this.i;
        if (jVar != null) {
            jVar.ak = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        j();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.aj(colorStateList);
        }
        if (this.i.ay) {
            return;
        }
        q();
    }

    public void setRippleColorResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.aj(A.b(jVar.ah, i));
            if (this.i.ay) {
                return;
            }
            q();
        }
    }

    @Override // ivas.gov.bisp.enumeration.O.o
    public void setShapeAppearanceModel(t tVar) {
        j jVar = this.i;
        jVar.e.d = tVar;
        jVar.invalidateSelf();
    }

    public void setShowMotionSpec(C0026p c0026p) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.W = c0026p;
        }
    }

    public void setShowMotionSpecResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.W = C0026p.d(jVar.ah, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        j jVar = this.i;
        if (jVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(jVar.an ? null : charSequence, bufferType);
        j jVar2 = this.i;
        if (jVar2 != null) {
            jVar2.az(charSequence);
        }
    }

    public void setTextAppearance(ivas.gov.bisp.enumeration.aL.r rVar) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ar.d(rVar, jVar.ah);
        }
        s();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        j jVar = this.i;
        if (jVar == null || jVar.ac == f) {
            return;
        }
        jVar.ac = f;
        jVar.invalidateSelf();
        jVar.L();
    }

    public void setTextEndPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.aE(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        j jVar = this.i;
        if (jVar == null || jVar.ab == f) {
            return;
        }
        jVar.ab = f;
        jVar.invalidateSelf();
        jVar.L();
    }

    public void setTextStartPaddingResource(int i) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.au(jVar.ah.getResources().getDimension(i));
        }
    }

    public void setCloseIconVisible(boolean z) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.ah(z);
        }
        j();
    }

    public void setCheckedIconVisible(boolean z) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.Q(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        j jVar = this.i;
        if (jVar != null) {
            jVar.at(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        j jVar = this.i;
        if (jVar != null) {
            jVar.ar.d(new ivas.gov.bisp.enumeration.aL.r(jVar.ah, i), jVar.ah);
        }
        s();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        j jVar = this.i;
        if (jVar != null) {
            jVar.ar.d(new ivas.gov.bisp.enumeration.aL.r(jVar.ah, i), jVar.ah);
        }
        s();
    }
}
