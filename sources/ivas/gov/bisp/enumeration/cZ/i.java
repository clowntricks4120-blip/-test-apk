package ivas.gov.bisp.enumeration.cZ;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends Drawable {
    private static int a = 1;
    private static int b;
    public Drawable c;

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 57;
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            super.clearColorFilter();
            int i5 = a;
            int i6 = ((i5 & 118) + (i5 | 118)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = (i2 ^ 29) + ((i2 & 29) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        drawable.clearColorFilter();
        int i10 = a;
        int i11 = i10 & 27;
        int i12 = (i10 ^ 27) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 123) + ((i2 & 123) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            int minimumWidth = super.getMinimumWidth();
            int i5 = b;
            int i6 = (((i5 | 2) << 1) - (i5 ^ 2)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return minimumWidth;
        }
        int i8 = i2 & 99;
        int i9 = i8 + ((i2 ^ 99) | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return drawable.getMinimumWidth();
        }
        int i10 = 36 / 0;
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 4) + ((i2 & 4) << 1)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            int i4 = i2 & 49;
            int i5 = i4 + ((i2 ^ 49) | i4);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return drawable.getState();
            }
            int i6 = 29 / 0;
            return drawable.getState();
        }
        int[] state = super.getState();
        int i7 = b;
        int i8 = i7 & 31;
        int i9 = (((i7 ^ 31) | i8) << 1) - ((i7 | 31) & (~i8));
        a = i9 % 128;
        int i10 = i9 % 2;
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 51) << 1) - (i3 ^ 51);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            super.setChangingConfigurations(i);
            int i7 = b;
            int i8 = i7 & 89;
            int i9 = ((i7 | 89) & (~i8)) + (i8 << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i10 = ((i5 | 49) << 1) - (i5 ^ 49);
        a = i10 % 128;
        int i11 = i10 % 2;
        drawable.setChangingConfigurations(i);
        int i12 = a;
        int i13 = (i12 & 79) + (i12 | 79);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = ((i4 ^ 48) + ((i4 & 48) << 1)) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            drawable.setHotspot(f, f2);
            int i7 = b;
            int i8 = i7 & 87;
            int i9 = (((i7 ^ 87) | i8) << 1) - ((i7 | 87) & (~i8));
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b + 117;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 110) + (i2 | 110)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            int i4 = i2 & 89;
            int i5 = (i2 | 89) & (~i4);
            int i6 = -(-(i4 << 1));
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                drawable.applyTheme(theme);
                int i8 = 26 / 0;
            } else {
                drawable.applyTheme(theme);
            }
            int i9 = b;
            int i10 = (-2) - (((i9 & 90) + (i9 | 90)) ^ (-1));
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a + 85;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 101;
        b = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = (-2) - ((i2 + 108) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            int minimumHeight = drawable.getMinimumHeight();
            int i7 = a;
            int i8 = (i7 & 71) + (i7 | 71);
            b = i8 % 128;
            int i9 = i8 % 2;
            return minimumHeight;
        }
        int minimumHeight2 = super.getMinimumHeight();
        int i10 = b;
        int i11 = ((i10 ^ 39) | (i10 & 39)) << 1;
        int i12 = -(((~i10) & 39) | (i10 & (-40)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return minimumHeight2;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            boolean padding = drawable.getPadding(rect);
            int i6 = a + 55;
            b = i6 % 128;
            int i7 = i6 % 2;
            return padding;
        }
        boolean padding2 = super.getPadding(rect);
        int i8 = a + 35;
        b = i8 % 128;
        int i9 = i8 % 2;
        return padding2;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 30) + (i2 | 30)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable == null) {
            Region transparentRegion = super.getTransparentRegion();
            int i4 = a;
            int i5 = (i4 ^ 11) + ((i4 & 11) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 36 / 0;
            }
            return transparentRegion;
        }
        int i7 = (((i2 | 46) << 1) - (i2 ^ 46)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        Region transparentRegion2 = drawable.getTransparentRegion();
        int i9 = a;
        int i10 = i9 & 59;
        int i11 = (i9 ^ 59) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        return transparentRegion2;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int i = 2 % 2;
        int i2 = b + 27;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            int i4 = i3 & 39;
            int i5 = (i4 - (~((i3 ^ 39) | i4))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            drawable.jumpToCurrentState();
            int i7 = b;
            int i8 = i7 | 65;
            int i9 = i8 << 1;
            int i10 = -((~(i7 & 65)) & i8);
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 % 4;
            }
        }
        int i13 = a;
        int i14 = ((((i13 ^ 105) | (i13 & 105)) << 1) - (~(-(((~i13) & 105) | (i13 & (-106)))))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 6) + (i2 | 6)) ^ (-1));
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = (i4 & (-8)) | ((~i4) & 7);
            int i6 = -(-((i4 & 7) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                drawable.setFilterBitmap(z);
                throw null;
            }
            drawable.setFilterBitmap(z);
            int i8 = b;
            int i9 = i8 & 37;
            int i10 = ((i8 | 37) & (~i9)) + (i9 << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = (((i12 | 122) << 1) - (i12 ^ 122)) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 50 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 ^ 121;
        int i8 = -(-((i6 & 121) << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i11 = i6 & 71;
            int i12 = (i11 - (~(-(-((i6 ^ 71) | i11))))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            drawable.setHotspotBounds(i, i2, i3, i4);
            if (i13 != 0) {
                throw null;
            }
        }
        int i14 = b;
        int i15 = ((i14 | 85) << 1) - (i14 ^ 85);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 50 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable == null) {
            boolean state = super.setState(iArr);
            int i4 = a;
            int i5 = (i4 ^ 91) + ((i4 & 91) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return state;
            }
            obj.hashCode();
            throw null;
        }
        boolean state2 = drawable.setState(iArr);
        int i6 = a;
        int i7 = ((i6 ^ 39) | (i6 & 39)) << 1;
        int i8 = -(((~i6) & 39) | (i6 & (-40)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return state2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 58) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.c;
        if (drawable != null) {
            int i5 = (i2 & 54) + (i2 | 54);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            Drawable current = drawable.getCurrent();
            if (i7 == 0) {
                int i8 = 19 / 0;
            }
            return current;
        }
        Drawable current2 = super.getCurrent();
        int i9 = b;
        int i10 = (i9 | 73) << 1;
        int i11 = -(((~i9) & 73) | (i9 & (-74)));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        if (i12 % 2 != 0) {
            return current2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 31;
        int i5 = (i3 | 31) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        Drawable drawable = this.c;
        if (drawable == null) {
            boolean zOnLevelChange = super.onLevelChange(i);
            int i8 = b + 23;
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return zOnLevelChange;
            }
            throw null;
        }
        boolean level = drawable.setLevel(i);
        int i9 = a;
        int i10 = (-2) - ((((i9 | 70) << 1) - (i9 ^ 70)) ^ (-1));
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 88 / 0;
        }
        return level;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 113;
        int i5 = -(-((i3 ^ 113) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        Drawable drawable = this.c;
        if (drawable == null) {
            super.setColorFilter(i, mode);
            int i9 = b;
            int i10 = i9 | 41;
            int i11 = i10 << 1;
            int i12 = -((~(i9 & 41)) & i10);
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        int i15 = i7 + 30;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        drawable.setColorFilter(i, mode);
        if (i17 == 0) {
            int i18 = 93 / 0;
        }
        int i19 = b + 99;
        a = i19 % 128;
        int i20 = i19 % 2;
    }
}
