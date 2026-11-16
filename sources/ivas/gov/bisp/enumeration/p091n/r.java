package ivas.gov.bisp.enumeration.p091n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class r extends Drawable implements Drawable.Callback {
    private static int a = 1;
    private static int b;
    public Drawable c;

    public r(Drawable drawable) {
        Drawable drawable2 = this.c;
        Object obj = null;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            int i = b;
            int i2 = ((i & 6) + (i | 6)) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.c = drawable;
        if (drawable != null) {
            int i5 = a;
            int i6 = i5 | 37;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 37)) & i6);
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            drawable.setCallback(this);
            int i11 = b;
            int i12 = i11 & 1;
            int i13 = ((i11 ^ 1) | i12) << 1;
            int i14 = -((i11 | 1) & (~i12));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
        }
        int i18 = a;
        int i19 = (i18 & (-96)) | ((~i18) & 95);
        int i20 = -(-((i18 & 95) << 1));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = b + 81;
        a = i2 % 128;
        int i3 = i2 % 2;
        this.c.draw(canvas);
        int i4 = a;
        int i5 = ((i4 ^ 2) + ((i4 & 2) << 1)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 8) + (i2 | 8);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            this.c.getChangingConfigurations();
            throw null;
        }
        int changingConfigurations = this.c.getChangingConfigurations();
        int i5 = b;
        int i6 = (i5 & (-36)) | ((~i5) & 35);
        int i7 = -(-((i5 & 35) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 103) + (i2 | 103);
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (i4 != 0) {
            return drawable.getCurrent();
        }
        drawable.getCurrent();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
        a = i3 % 128;
        int i4 = i3 % 2;
        int intrinsicHeight = this.c.getIntrinsicHeight();
        int i5 = b;
        int i6 = ((i5 ^ 85) - (~((i5 & 85) << 1))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return intrinsicHeight;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = ((((i2 ^ 113) | i3) << 1) - (~(-((i2 | 113) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawable = this.c;
        if (i5 != 0) {
            return drawable.getIntrinsicWidth();
        }
        drawable.getIntrinsicWidth();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 93) + (i2 | 93);
        b = i3 % 128;
        int i4 = i3 % 2;
        int minimumHeight = this.c.getMinimumHeight();
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
        return minimumHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = -(-(i2 | 65));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int minimumWidth = this.c.getMinimumWidth();
        int i7 = b + 33;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 11 / 0;
        }
        return minimumWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-32)) | ((~i2) & 31)) + ((i2 & 31) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.c.getOpacity();
        }
        this.c.getOpacity();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = (((i2 | 41) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean padding = this.c.getPadding(rect);
        int i6 = a + 91;
        b = i6 % 128;
        int i7 = i6 % 2;
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = ((((i2 ^ 63) | i3) << 1) - (~(-((i2 | 63) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int[] state = this.c.getState();
        int i6 = a;
        int i7 = ((i6 | 116) << 1) - (i6 ^ 116);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return state;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i2 | 45) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.c.getTransparentRegion();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Region transparentRegion = this.c.getTransparentRegion();
        int i7 = (-2) - ((a + 62) ^ (-1));
        b = i7 % 128;
        int i8 = i7 % 2;
        return transparentRegion;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = i3 + ((i2 ^ 123) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        invalidateSelf();
        if (i5 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 95) << 1) - (i2 ^ 95);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.c.isStateful();
        }
        int i4 = 66 / 0;
        return this.c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 33) - (~(i2 | 33))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.jumpToCurrentState();
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 109) + (i2 | 109);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.setBounds(rect);
        int i5 = a;
        int i6 = i5 & 121;
        int i7 = ((i5 ^ 121) | i6) << 1;
        int i8 = -((i5 | 121) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 87;
        int i5 = (i3 & 87) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        Drawable drawable = this.c;
        if (i7 != 0) {
            return drawable.setLevel(i);
        }
        drawable.setLevel(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = -(-((i2 & 105) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        scheduleSelf(runnable, j);
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = a + 67;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.setAlpha(i);
        } else {
            this.c.setAlpha(i);
            int i4 = 19 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 5;
        int i4 = -(-((i2 & 5) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.setAutoMirrored(z);
        int i7 = a;
        int i8 = (((i7 ^ 105) | (i7 & 105)) << 1) - (((~i7) & 105) | (i7 & (-106)));
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 113;
        int i5 = (i3 | 113) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        this.c.setChangingConfigurations(i);
        int i9 = b;
        int i10 = ((i9 & 31) - (~(-(-(i9 | 31))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 118) << 1) - (i2 ^ 118);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.c.setColorFilter(colorFilter);
        int i6 = a;
        int i7 = i6 & 99;
        int i8 = -(-((i6 ^ 99) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 109) - (~(i2 | 109))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.setDither(z);
        int i5 = a;
        int i6 = (i5 ^ 101) + ((i5 & 101) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-98)) | ((~i2) & 97);
        int i4 = (i2 & 97) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.setFilterBitmap(z);
        int i7 = b;
        int i8 = (i7 & (-62)) | ((~i7) & 61);
        int i9 = -(-((i7 & 61) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.c.setState(iArr);
        }
        int i4 = 60 / 0;
        return this.c.setState(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        boolean z3 = true;
        int i4 = ((i3 & (-12)) | ((~i3) & 11)) + ((i3 & 11) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!(!super.setVisible(z, z2))) {
            int i6 = b;
            int i7 = i6 & 99;
            int i8 = i6 | 99;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = b;
            int i12 = (i11 & 11) + (i11 | 11);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                boolean visible = this.c.setVisible(z, z2);
                int i13 = 33 / 0;
                if (!visible) {
                    int i14 = b;
                    int i15 = (((i14 ^ 3) | (i14 & 3)) << 1) - (((~i14) & 3) | (i14 & (-4)));
                    int i16 = i15 % 128;
                    a = i16;
                    int i17 = i15 % 2;
                    i = ((i16 | 95) << 1) - (i16 ^ 95);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i18 = 4 % 2;
                    }
                    z3 = false;
                } else {
                    int i19 = b;
                    int i20 = i19 & 99;
                    int i21 = i19 | 99;
                    int i22 = (i20 & i21) + (i21 | i20);
                    a = i22 % 128;
                    int i110 = i22 % 2;
                }
            } else if (this.c.setVisible(z, z2)) {
                int i111 = b;
                int i23 = i111 & 99;
                int i24 = i111 | 99;
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                int i112 = i25 % 2;
            } else {
                int i113 = b;
                int i114 = (((i113 ^ 3) | (i113 & 3)) << 1) - (((~i113) & 3) | (i113 & (-4)));
                int i115 = i114 % 128;
                a = i115;
                int i116 = i114 % 2;
                i = ((i115 | 95) << 1) - (i115 ^ 95);
                b = i % 128;
                if (i % 2 != 0) {
                    int i117 = 4 % 2;
                }
                z3 = false;
            }
        }
        int i26 = (-2) - ((b + 46) ^ (-1));
        a = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = 56 / 0;
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = ((i2 ^ 107) | i3) << 1;
        int i5 = -((i2 | 107) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        unscheduleSelf(runnable);
        if (i7 != 0) {
            throw null;
        }
        int i8 = a;
        int i9 = ((i8 | 55) << 1) - (i8 ^ 55);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        int i = 2 % 2;
        int i2 = b + 39;
        a = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsAutoMirrored = this.c.isAutoMirrored();
        int i4 = a;
        int i5 = i4 ^ 97;
        int i6 = (i4 & 97) << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return zIsAutoMirrored;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i3 - (~((i2 ^ 45) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.setHotspot(f, f2);
        int i6 = a;
        int i7 = ((((i6 ^ 113) | (i6 & 113)) << 1) - (~(-(((~i6) & 113) | (i6 & (-114)))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b + 3;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.setHotspotBounds(i, i2, i3, i4);
        } else {
            this.c.setHotspotBounds(i, i2, i3, i4);
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        int i2 = 2 % 2;
        int i3 = a + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.setTint(i);
        int i5 = a + 25;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.setTintList(colorStateList);
        int i5 = b;
        int i6 = i5 | 3;
        int i7 = i6 << 1;
        int i8 = -((~(i5 & 3)) & i6);
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 97) + ((i2 & 97) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.setTintMode(mode);
        int i5 = a;
        int i6 = i5 & 57;
        int i7 = i6 + ((i5 ^ 57) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
