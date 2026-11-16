package ivas.gov.bisp.enumeration.o0000O00;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.IMediaSession;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.OooO0O0;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.P.a;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0 extends OooO0O0 {
    private static int p = 0;
    private static int q = 1;
    public final Rect r;
    public Drawable s;
    public final Rect t;
    public boolean u;
    public int v;
    public boolean w;

    public OooOO0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public Drawable getForeground() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (i2 | 77) << 1;
        int i4 = -(((~i2) & 77) | (i2 & (-78)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        q = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        Drawable drawable = this.s;
        int i7 = i6 & 19;
        int i8 = (i7 - (~(-(-((i6 ^ 19) | i7))))) - 1;
        p = i8 % 128;
        int i9 = i8 % 2;
        return drawable;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 57;
        int i4 = ((i2 & 57) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        p = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.v;
        int i9 = i2 + 5;
        p = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0057  */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = q;
        boolean z = true;
        int i3 = ((i2 & (-30)) | ((~i2) & 29)) + ((i2 & 29) << 1);
        p = i3 % 128;
        if (i3 % 2 != 0) {
            super.verifyDrawable(drawable);
            throw null;
        }
        if (super.verifyDrawable(drawable)) {
            int i4 = p;
            int i5 = (((i4 | 34) << 1) - (i4 ^ 34)) - 1;
            q = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = q;
            int i8 = i7 ^ 41;
            int i9 = ((i7 & 41) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            p = i12;
            int i13 = i11 % 2;
            if (drawable != this.s) {
                int i14 = (-2) - ((i12 + 120) ^ (-1));
                int i15 = i14 % 128;
                q = i15;
                int i16 = i14 % 2;
                int i17 = ((i15 ^ 29) | (i15 & 29)) << 1;
                int i18 = -(((~i15) & 29) | (i15 & (-30)));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                p = i19 % 128;
                int i20 = i19 % 2;
                z = false;
            } else {
                int i21 = p;
                int i22 = (((i21 | 34) << 1) - (i21 ^ 34)) - 1;
                q = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        int i24 = q + 23;
        p = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    public OooOO0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new Rect();
        this.t = new Rect();
        this.v = 119;
        this.u = true;
        this.w = false;
        int[] iArr = r.v;
        a.b(context, attributeSet, i, 0);
        a.c(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.v = typedArrayObtainStyledAttributes.getInt(1, this.v);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
            int i2 = p;
            int i3 = i2 & 27;
            int i4 = i3 + ((i2 ^ 27) | i3);
            q = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.u = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
        int i7 = p;
        int i8 = i7 ^ 123;
        int i9 = -(-((i7 & 123) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        q = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 16 / 0;
        }
    }

    @Override // android.view.View
    @TargetApi(IMediaSession.Stub.TRANSACTION_previous)
    public void drawableHotspotChanged(float f, float f2) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 ^ 31) | (i2 & 31)) << 1) - (((~i2) & 31) | (i2 & (-32)));
        q = i3 % 128;
        if (i3 % 2 == 0) {
            super.drawableHotspotChanged(f, f2);
            throw null;
        }
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
            int i4 = p;
            int i5 = ((i4 | 3) << 1) - (i4 ^ 3);
            q = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = q + 85;
        p = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 ^ 79;
        int i4 = ((i2 & 79) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        q = i6 % 128;
        if (i6 % 2 == 0) {
            super.jumpDrawablesToCurrentState();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            int i7 = q;
            int i8 = ((i7 | 27) << 1) - (i7 ^ 27);
            p = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = p;
        int i11 = i10 ^ 69;
        int i12 = ((i10 & 69) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        q = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 43 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.widget.OooO0O0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = 2 % 2;
        int i6 = p;
        int i7 = i6 & 59;
        int i8 = -(-((i6 ^ 59) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        q = i9 % 128;
        int i10 = i9 % 2;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = q;
        int i12 = i11 + 11;
        p = i12 % 128;
        if (i12 % 2 != 0) {
            boolean z3 = this.w;
            int i13 = (z ? 1 : 0) & (z3 ? 1 : 0);
            z2 = (((z ? 1 : 0) | (z3 ? 1 : 0)) & (~i13)) | i13;
        } else {
            boolean z4 = this.w;
            z2 = ((z ? 1 : 0) & (z4 ? 1 : 0)) | (((~(z4 ? 1 : 0)) & (z ? 1 : 0)) == true ? 1 : 0) | (((~(z ? 1 : 0)) & (z4 ? 1 : 0)) == true ? 1 : 0);
        }
        this.w = z2;
        int i14 = i11 & 125;
        int i15 = -(-((i11 ^ 125) | i14));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        p = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 17 / 0;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = q;
        int i7 = ((i6 | 106) << 1) - (i6 ^ 106);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        p = i8 % 128;
        if (i8 % 2 != 0) {
            super.onSizeChanged(i, i2, i3, i4);
            this.w = false;
        } else {
            super.onSizeChanged(i, i2, i3, i4);
            this.w = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 ^ 44) + ((i2 & 44) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        p = i4 % 128;
        if (i4 % 2 != 0) {
            super.drawableStateChanged();
            throw null;
        }
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable != null) {
            int i5 = p + 92;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            q = i6 % 128;
            int i7 = i6 % 2;
            if (!(!drawable.isStateful())) {
                int i8 = q;
                int i9 = i8 ^ 123;
                int i10 = (i8 & 123) << 1;
                int i11 = (i9 & i10) + (i10 | i9);
                p = i11 % 128;
                int i12 = i11 % 2;
                this.s.setState(getDrawableState());
                int i13 = q;
                int i14 = i13 & 105;
                int i15 = i13 | 105;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                p = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        int i18 = p;
        int i19 = i18 & 61;
        int i20 = (i18 | 61) & (~i19);
        int i21 = i19 << 1;
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        q = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 & (-114)) | ((~i2) & 113)) + ((i2 & 113) << 1);
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.draw(canvas);
            obj.hashCode();
            throw null;
        }
        super.draw(canvas);
        Drawable drawable = this.s;
        if (drawable != null) {
            int i4 = p;
            int i5 = (((i4 | 12) << 1) - (i4 ^ 12)) - 1;
            int i6 = i5 % 128;
            q = i6;
            int i7 = i5 % 2;
            if (!(!this.w)) {
                int i8 = i6 + 59;
                p = i8 % 128;
                int i9 = i8 % 2;
                this.w = false;
                Rect rect = this.r;
                int i10 = (i6 ^ 45) + ((i6 & 45) << 1);
                p = i10 % 128;
                int i11 = i10 % 2;
                Rect rect2 = this.t;
                int right = getRight();
                int i12 = q;
                int i13 = i12 & 35;
                int i14 = (i13 - (~(-(-((i12 ^ 35) | i13))))) - 1;
                p = i14 % 128;
                int i15 = i14 % 2;
                int i16 = -getLeft();
                int i17 = ((right | i16) << 1) - (right ^ i16);
                int bottom = getBottom();
                int top = getTop();
                int i18 = p;
                int i19 = i18 & 71;
                int i20 = (i18 ^ 71) | i19;
                int i21 = (i19 & i20) + (i19 | i20);
                q = i21 % 128;
                int i22 = i21 % 2;
                int i23 = -top;
                int i24 = ((((bottom ^ i23) | (bottom & i23)) << 1) - (~(-(((~bottom) & i23) | ((~i23) & bottom))))) - 1;
                if (!(!this.u)) {
                    int i25 = (i18 ^ 66) + ((i18 & 66) << 1);
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    q = i26 % 128;
                    if (i26 % 2 == 0) {
                        rect.set(1, 1, i17, i24);
                    } else {
                        rect.set(0, 0, i17, i24);
                    }
                    int i27 = (-2) - ((p + 112) ^ (-1));
                    q = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    int paddingLeft = getPaddingLeft();
                    int paddingTop = getPaddingTop();
                    int i29 = q;
                    int i30 = i29 ^ 53;
                    int i31 = (((i29 & 53) | i30) << 1) - i30;
                    p = i31 % 128;
                    if (i31 % 2 != 0) {
                        getPaddingRight();
                        getPaddingBottom();
                        obj.hashCode();
                        throw null;
                    }
                    int paddingRight = getPaddingRight();
                    int paddingBottom = getPaddingBottom();
                    int i32 = -paddingRight;
                    int i33 = (i17 & i32) + (i17 | i32);
                    int i34 = q + 23;
                    p = i34 % 128;
                    int i35 = i34 % 2;
                    int i36 = -paddingBottom;
                    int i37 = ((~i36) & i24) | ((~i24) & i36);
                    int i38 = (i36 & i24) << 1;
                    rect.set(paddingLeft, paddingTop, i33, (i37 & i38) + (i38 | i37));
                    int i39 = q;
                    int i40 = (i39 & 22) + (i39 | 22);
                    int i41 = (i40 ^ (-1)) + (i40 << 1);
                    p = i41 % 128;
                    if (i41 % 2 != 0) {
                        int i42 = 3 / 3;
                    }
                }
                int i43 = this.v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int i44 = p;
                int i45 = i44 ^ 73;
                int i46 = -(-((i44 & 73) << 1));
                int i47 = (i45 & i46) + (i46 | i45);
                q = i47 % 128;
                int i48 = i47 % 2;
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i49 = p;
                int i50 = i49 & 69;
                int i51 = (i49 ^ 69) | i50;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                q = i52 % 128;
                if (i52 % 2 == 0) {
                    Gravity.apply(i43, intrinsicWidth, intrinsicHeight, rect, rect2);
                    drawable.setBounds(rect2);
                    int i53 = 48 / 0;
                } else {
                    Gravity.apply(i43, intrinsicWidth, intrinsicHeight, rect, rect2);
                    drawable.setBounds(rect2);
                }
                int i54 = p;
                int i55 = i54 & 15;
                int i56 = (i54 | 15) & (~i55);
                int i57 = i55 << 1;
                int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                q = i58 % 128;
                int i59 = i58 % 2;
            }
            drawable.draw(canvas);
            int i60 = p;
            int i61 = ((i60 & 51) - (~(i60 | 51))) - 1;
            q = i61 % 128;
            int i62 = i61 % 2;
        }
        int i63 = q;
        int i64 = (((i63 & (-50)) | ((~i63) & 49)) - (~((i63 & 49) << 1))) - 1;
        p = i64 % 128;
        if (i64 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        int i2 = 2 % 2;
        int i3 = p;
        int i4 = (i3 ^ 39) + ((i3 & 39) << 1);
        q = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.v != i) {
            if ((8388615 & i) == 0) {
                int i5 = (i3 & (-80)) | ((~i3) & 79);
                int i6 = -(-((i3 & 79) << 1));
                int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                q = i7 % 128;
                int i8 = i ^ 8388611;
                int i9 = i & 8388611;
                if (i7 % 2 == 0) {
                    i = (i9 & i8) | (i8 ^ i9);
                } else {
                    i = i9 | i8;
                }
                int i10 = i3 | 65;
                int i11 = (i10 << 1) - ((~(i3 & 65)) & i10);
                q = i11 % 128;
                int i12 = i11 % 2;
            }
            if ((i & 112) == 0) {
                int i13 = q;
                int i14 = i13 & 73;
                int i15 = i14 + ((i13 ^ 73) | i14);
                int i16 = i15 % 128;
                p = i16;
                i = i15 % 2 != 0 ? i & 37 : i | 48;
                int i17 = i16 & 69;
                int i18 = ((i16 ^ 69) | i17) << 1;
                int i19 = -((i16 | 69) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                q = i20 % 128;
                int i21 = i20 % 2;
            }
            this.v = i;
            if (i == 119) {
                int i22 = (-2) - ((p + 34) ^ (-1));
                q = i22 % 128;
                int i23 = i22 % 2;
                if (this.s != null) {
                    this.s.getPadding(new Rect());
                    int i24 = p;
                    int i25 = i24 & 55;
                    int i26 = ((i24 ^ 55) | i25) << 1;
                    int i27 = -((i24 | 55) & (~i25));
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    int i29 = i28 % 128;
                    q = i29;
                    int i30 = i28 % 2;
                    int i31 = ((i29 ^ 17) | (i29 & 17)) << 1;
                    int i32 = -(((~i29) & 17) | (i29 & (-18)));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    p = i33 % 128;
                    int i34 = i33 % 2;
                }
            }
            requestLayout();
            int i35 = p;
            int i36 = i35 & 29;
            int i37 = (i35 ^ 29) | i36;
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            q = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = q + 75;
        p = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = 68 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = ((i3 ^ 108) + ((i3 & 108) << 1)) - 1;
        int i5 = i4 % 128;
        p = i5;
        int i6 = i4 % 2;
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            int i7 = i5 & 51;
            int i8 = (i5 ^ 51) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            q = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 58 / 0;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                    unscheduleDrawable(this.s);
                    int i11 = p + 109;
                    q = i11 % 128;
                    int i12 = i11 % 2;
                }
            } else if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.s);
                int i13 = p + 109;
                q = i13 % 128;
                int i14 = i13 % 2;
            }
            this.s = drawable;
            if (drawable != null) {
                int i15 = p;
                int i16 = ((i15 | 3) << 1) - (3 ^ i15);
                q = i16 % 128;
                if (i16 % 2 == 0) {
                    setWillNotDraw(false);
                    drawable.setCallback(this);
                    if (drawable.isStateful()) {
                        drawable.setState(getDrawableState());
                        i = q + 35;
                        p = i % 128;
                        if (i % 2 != 0) {
                            int i17 = 3 / 2;
                        }
                    }
                } else {
                    setWillNotDraw(false);
                    drawable.setCallback(this);
                    if (!(!drawable.isStateful())) {
                        drawable.setState(getDrawableState());
                        i = q + 35;
                        p = i % 128;
                        if (i % 2 != 0) {
                            int i18 = 3 / 2;
                        }
                    }
                }
                if (this.v == 119) {
                    drawable.getPadding(new Rect());
                    int i19 = q;
                    int i20 = (i19 ^ 5) + ((i19 & 5) << 1);
                    p = i20 % 128;
                    int i21 = i20 % 2;
                }
            } else {
                setWillNotDraw(true);
                int i22 = q;
                int i23 = ((((i22 ^ 23) | (i22 & 23)) << 1) - (~(-(((~i22) & 23) | (i22 & (-24)))))) - 1;
                p = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 3 / 5;
                }
            }
            requestLayout();
            invalidate();
            int i25 = p;
            int i26 = i25 & 75;
            int i27 = ((i25 | 75) & (~i26)) + (i26 << 1);
            q = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = q;
        int i30 = ((((i29 ^ 125) | (i29 & 125)) << 1) - (~(-(((~i29) & 125) | (i29 & (-126)))))) - 1;
        p = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 64 / 0;
        }
    }
}
