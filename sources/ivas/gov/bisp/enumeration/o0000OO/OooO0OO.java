package ivas.gov.bisp.enumeration.o0000OO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.aL.h;
import ivas.gov.bisp.enumeration.aN.c;
import ivas.gov.bisp.enumeration.aN.j;
import ivas.gov.bisp.enumeration.aQ.J;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO extends FrameLayout {
    private static int a = 0;
    private static int b = 1;
    public static final View.OnTouchListener c = new bfb();
    public ColorStateList d;
    public c e;
    public j f;
    public int g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public PorterDuff.Mode l;

    public static final class bfb implements View.OnTouchListener {
        private static int a = 0;
        private static int b = 1;

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 74) + ((i2 & 74) << 1)) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = i4 & 33;
            int i7 = ((((i4 ^ 33) | i6) << 1) - (~(-((i4 | 33) & (~i6))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
    }

    static {
        int i = b;
        int i2 = (i & 13) + (i | 13);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public OooO0OO(Context context, AttributeSet attributeSet) {
        super(J.b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r.O);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap<View, R> weakHashMap = T.c;
            int i = a;
            int i2 = i & 9;
            int i3 = i2 + ((i ^ 9) | i2);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                T.aXb.t(this, dimensionPixelSize);
                int i4 = 19 / 0;
            } else {
                T.aXb.t(this, dimensionPixelSize);
            }
            int i5 = 2 % 2;
        }
        this.g = typedArrayObtainStyledAttributes.getInt(2, 0);
        int i6 = b;
        int i7 = (i6 & 113) + (i6 | 113);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.i = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        ColorStateList colorStateListB = h.b(context2, typedArrayObtainStyledAttributes, 4);
        int i9 = a;
        int i10 = ((i9 & (-30)) | ((~i9) & 29)) + ((i9 & 29) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        setBackgroundTintList(colorStateListB);
        int i12 = typedArrayObtainStyledAttributes.getInt(5, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i13 = b;
        int i14 = i13 & 5;
        int i15 = (i14 - (~((5 ^ i13) | i14))) - 1;
        a = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            setBackgroundTintMode(ivas.gov.bisp.enumeration.P.J.d(i12, mode));
            obj.hashCode();
            throw null;
        }
        setBackgroundTintMode(ivas.gov.bisp.enumeration.P.J.d(i12, mode));
        this.h = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        int i16 = a + 111;
        b = i16 % 128;
        int i17 = i16 % 2;
        this.j = dimensionPixelSize2;
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        int i18 = b;
        int i19 = i18 & 81;
        int i20 = (i18 ^ 81) | i19;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(c);
            setFocusable(false);
        } else {
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(c);
            setFocusable(true);
        }
        int i22 = b;
        int i23 = i22 ^ 93;
        int i24 = ((i22 & 93) | i23) << 1;
        int i25 = -i23;
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        a = i26 % 128;
        if (i26 % 2 != 0) {
            getBackground();
            obj.hashCode();
            throw null;
        }
        if (getBackground() == null) {
            float dimension = getResources().getDimension(ivas.gov.bisp.enumeration.R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i27 = a;
            int i28 = ((i27 | 9) << 1) - (i27 ^ 9);
            b = i28 % 128;
            int i29 = i28 % 2;
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            int i30 = a;
            int i31 = (i30 & 23) + (i30 | 23);
            b = i31 % 128;
            int i32 = i31 % 2;
            float backgroundOverlayColorAlpha = getBackgroundOverlayColorAlpha();
            int iU = r.u(this, ivas.gov.bisp.enumeration.R.attr.colorSurface);
            int i33 = b;
            int i34 = (i33 | 41) << 1;
            int i35 = -(i33 ^ 41);
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                r.v(iU, r.u(this, ivas.gov.bisp.enumeration.R.attr.colorOnSurface), backgroundOverlayColorAlpha);
                throw null;
            }
            int iV = r.v(iU, r.u(this, ivas.gov.bisp.enumeration.R.attr.colorOnSurface), backgroundOverlayColorAlpha);
            int i37 = a;
            int i38 = ((i37 ^ 81) | (i37 & 81)) << 1;
            int i39 = -(((~i37) & 81) | (i37 & (-82)));
            int i40 = (i38 & i39) + (i39 | i38);
            b = i40 % 128;
            int i41 = i40 % 2;
            gradientDrawable.setColor(iV);
            ColorStateList colorStateList = this.d;
            if (colorStateList != null) {
                int i42 = a;
                int i43 = ((i42 ^ 37) | (i42 & 37)) << 1;
                int i44 = -(((~i42) & 37) | (i42 & (-38)));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                b = i45 % 128;
                if (i45 % 2 == 0) {
                    gradientDrawable.setTintList(colorStateList);
                    int i46 = 67 / 0;
                } else {
                    gradientDrawable.setTintList(colorStateList);
                }
                int i47 = a;
                int i48 = i47 & 23;
                int i49 = (((i47 | 23) & (~i48)) - (~(i48 << 1))) - 1;
                b = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 2 % 2;
                }
            }
            WeakHashMap<View, R> weakHashMap2 = T.c;
            T.aWX.s(this, gradientDrawable);
            int i51 = a;
            int i52 = i51 ^ 19;
            int i53 = (i51 & 19) << 1;
            int i54 = (i52 & i53) + (i53 | i52);
            b = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = 2 % 2;
            }
        }
        int i56 = a;
        int i57 = i56 & 105;
        int i58 = (i57 - (~(-(-((i56 ^ 105) | i57))))) - 1;
        b = i58 % 128;
        int i59 = i58 % 2;
    }

    public float getActionTextColorAlpha() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = (i2 ^ 97) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        float f = this.h;
        int i7 = i2 + 69;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getAnimationMode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.g;
        int i6 = ((i2 ^ 93) | (i2 & 93)) << 1;
        int i7 = -(((~i2) & 93) | (i2 & (-94)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }

    public float getBackgroundOverlayColorAlpha() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 77) | (i2 & 77)) << 1) - (((~i2) & 77) | (i2 & (-78)));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        float f = this.i;
        int i6 = i4 & 39;
        int i7 = (i6 - (~((i4 ^ 39) | i6))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public int getMaxInlineActionWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 112) << 1) - (i2 ^ 112)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.k;
        int i6 = i2 & 75;
        int i7 = -(-((i2 ^ 75) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 23 / 0;
        }
        return i5;
    }

    public int getMaxWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 71) | (i2 & 71)) << 1) - (((~i2) & 71) | (i2 & (-72)));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.j;
        int i7 = i4 & 19;
        int i8 = -(-(i4 | 19));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 92 / 0;
        }
        return i6;
    }

    public void setAnimationMode(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 49;
        int i5 = (i3 ^ 49) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.g = i;
        if (i7 == 0) {
            int i8 = 60 / 0;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 23) | (i2 & 23)) << 1;
        int i4 = -(((~i2) & 23) | (i2 & (-24)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        setBackgroundDrawable(drawable);
        if (i6 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        int i;
        ColorStateList colorStateList;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 91) << 1) - (i3 ^ 91);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (drawable != null) {
            int i6 = ((i3 ^ 67) - (~((i3 & 67) << 1))) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 58 / 0;
                if (this.d != null) {
                    i = i3 + 101;
                    a = i % 128;
                    if (i % 2 != 0) {
                        drawable = drawable.mutate();
                        colorStateList = this.d;
                        int i8 = 95 / 0;
                    } else {
                        drawable = drawable.mutate();
                        colorStateList = this.d;
                    }
                    drawable.setTintList(colorStateList);
                    drawable.setTintMode(this.l);
                    int i9 = a;
                    int i10 = i9 & 109;
                    int i11 = ((i9 | 109) & (~i10)) + (i10 << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                }
            } else if (this.d != null) {
                i = i3 + 101;
                a = i % 128;
                if (i % 2 != 0) {
                    drawable = drawable.mutate();
                    colorStateList = this.d;
                    int i13 = 95 / 0;
                } else {
                    drawable = drawable.mutate();
                    colorStateList = this.d;
                }
                drawable.setTintList(colorStateList);
                drawable.setTintMode(this.l);
                int i14 = a;
                int i15 = i14 & 109;
                int i16 = ((i14 | 109) & (~i15)) + (i15 << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        super.setBackgroundDrawable(drawable);
        int i18 = a + 112;
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOnAttachStateChangeListener(j jVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 35;
        int i4 = ((((i2 & 35) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.f = jVar;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i2 & 77;
        int i7 = i6 + ((i2 ^ 77) | i6);
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (onClickListener != null) {
            int i6 = i4 ^ 125;
            int i7 = ((i4 & 125) | i6) << 1;
            int i8 = -i6;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            int i10 = i9 % 128;
            a = i10;
            onTouchListener = null;
            if (i9 % 2 != 0) {
                onTouchListener.hashCode();
                throw null;
            }
            int i11 = i10 + 111;
            b = i11 % 128;
            int i12 = i11 % 2;
        } else {
            onTouchListener = c;
            int i13 = i2 & 109;
            int i14 = i13 + ((i2 ^ 109) | i13);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
        int i16 = a + 63;
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    public void setOnLayoutChangeListener(c cVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-88)) | ((~i2) & 87)) - (~((i2 & 87) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.e = cVar;
        int i5 = ((((i2 ^ 15) | (i2 & 15)) << 1) - (~(-(((~i2) & 15) | (i2 & (-16)))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (i6 ^ 95) + ((i6 & 95) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.e;
        int i9 = a;
        int i10 = (((i9 ^ 83) | (i9 & 83)) << 1) - (((~i9) & 83) | (i9 & (-84)));
        b = i10 % 128;
        if (i10 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (cVar != null) {
            cVar.b(this, i, i2, i3, i4);
            int i11 = a + 69;
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = (i13 & 57) + (i13 | 57);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 6 / 0;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 81;
        int i6 = ((i4 & 81) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            super.onMeasure(i, i2);
            throw null;
        }
        super.onMeasure(i, i2);
        if (this.j > 0) {
            int i9 = b;
            int i10 = (i9 & (-100)) | ((~i9) & 99);
            int i11 = -(-((i9 & 99) << 1));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            int measuredWidth = getMeasuredWidth();
            int i14 = this.j;
            int i15 = b;
            int i16 = (i15 & (-22)) | ((~i15) & 21);
            int i17 = -(-((i15 & 21) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            int i19 = i18 % 128;
            a = i19;
            int i20 = i18 % 2;
            if (measuredWidth > i14) {
                int i21 = i19 & 107;
                int i22 = ((i19 ^ 107) | i21) << 1;
                int i23 = -((i19 | 107) & (~i21));
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i2);
                    int i25 = 88 / 0;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i2);
                }
            }
        }
        int i26 = a + 121;
        b = i26 % 128;
        if (i26 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            super.onDetachedFromWindow();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onDetachedFromWindow();
        j jVar = this.f;
        if (jVar != null) {
            int i4 = a;
            int i5 = i4 & 105;
            int i6 = (((i4 ^ 105) | i5) << 1) - ((i4 | 105) & (~i5));
            b = i6 % 128;
            int i7 = i6 % 2;
            jVar.onViewDetachedFromWindow(this);
            int i8 = a;
            int i9 = ((i8 | 101) << 1) - (i8 ^ 101);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = (i11 ^ 71) + ((i11 & 71) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        super.onAttachedToWindow();
        j jVar = this.f;
        if (jVar != null) {
            int i5 = b + 74;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            jVar.onViewAttachedToWindow(this);
            int i8 = a;
            int i9 = (i8 ^ 95) + ((i8 & 95) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        WeakHashMap<View, R> weakHashMap = T.c;
        T.aXd.d(this);
        int i11 = b;
        int i12 = i11 & 53;
        int i13 = (i11 ^ 53) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Drawable drawableMutate;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 39) << 1) - (~(-(((~i2) & 39) | (i2 & (-40)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.l = mode;
        if (getBackground() != null) {
            int i5 = a;
            int i6 = (((i5 | 46) << 1) - (i5 ^ 46)) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
                int i7 = 51 / 0;
            } else {
                drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
            }
            if (drawableMutate != getBackground()) {
                int i8 = b;
                int i9 = i8 & 77;
                int i10 = (((i8 | 77) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    super.setBackgroundDrawable(drawableMutate);
                    int i11 = 21 / 0;
                } else {
                    super.setBackgroundDrawable(drawableMutate);
                }
                int i12 = b;
                int i13 = ((i12 & (-46)) | ((~i12) & 45)) + ((i12 & 45) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = a;
        int i16 = i15 & 13;
        int i17 = (i15 ^ 13) | i16;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = -(-((i2 ^ 115) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.d = colorStateList;
        if (getBackground() != null) {
            int i7 = a;
            int i8 = (i7 & 25) + (i7 | 25);
            b = i8 % 128;
            int i9 = i8 % 2;
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            int i10 = b;
            int i11 = i10 & 45;
            int i12 = ((i10 ^ 45) | i11) << 1;
            int i13 = -((i10 | 45) & (~i11));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            drawableMutate.setTintMode(this.l);
            if (drawableMutate != getBackground()) {
                int i16 = a;
                int i17 = i16 ^ 111;
                int i18 = (((i16 & 111) | i17) << 1) - i17;
                b = i18 % 128;
                int i19 = i18 % 2;
                super.setBackgroundDrawable(drawableMutate);
                if (i19 == 0) {
                    int i20 = 76 / 0;
                }
                int i21 = a;
                int i22 = i21 ^ 55;
                int i23 = -(-((i21 & 55) << 1));
                int i24 = (i22 & i23) + (i23 | i22);
                b = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 4 / 5;
                }
            }
        }
        int i26 = a;
        int i27 = (i26 ^ 81) + ((i26 & 81) << 1);
        b = i27 % 128;
        int i28 = i27 % 2;
    }
}
