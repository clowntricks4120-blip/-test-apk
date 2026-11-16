package ivas.gov.bisp.enumeration.p088k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable {
    private static int a = 1;
    private static int b;
    public final ActionBarContainer c;

    public c(ActionBarContainer actionBarContainer) {
        this.c = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 27;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 27)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (i2 & (-60)) | ((~i2) & 59);
        int i9 = -(-((i2 & 59) << 1));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((((i3 ^ 105) | (i3 & 105)) << 1) - (~(-(((~i3) & 105) | (i3 & (-106)))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 11) + (i2 | 11);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-112)) | ((~i2) & 111);
        int i4 = (i2 & 111) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ActionBarContainer actionBarContainer = this.c;
        Object obj = null;
        if (!actionBarContainer.a) {
            Drawable drawable = actionBarContainer.e;
            if (drawable != null) {
                int i7 = b;
                int i8 = i7 & 31;
                int i9 = (((i7 | 31) & (~i8)) - (~(i8 << 1))) - 1;
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    drawable.getOutline(outline);
                    obj.hashCode();
                    throw null;
                }
                drawable.getOutline(outline);
                int i10 = a + 91;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 / 2;
                }
            }
        } else {
            int i12 = a;
            int i13 = i12 & 89;
            int i14 = i13 + ((i12 ^ 89) | i13);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                Drawable drawable2 = actionBarContainer.h;
                obj.hashCode();
                throw null;
            }
            Drawable drawable3 = actionBarContainer.h;
            if (drawable3 != null) {
                int i15 = b;
                int i16 = i15 & 3;
                int i17 = (i16 - (~((i15 ^ 3) | i16))) - 1;
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    drawable3.getOutline(outline);
                    return;
                } else {
                    drawable3.getOutline(outline);
                    int i18 = 98 / 0;
                    return;
                }
            }
        }
        int i19 = b;
        int i20 = i19 ^ 53;
        int i21 = ((i19 & 53) | i20) << 1;
        int i22 = -i20;
        int i23 = (i21 & i22) + (i21 | i22);
        a = i23 % 128;
        int i24 = i23 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 32) + (i2 | 32)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ActionBarContainer actionBarContainer = this.c;
        Object obj = null;
        if (!actionBarContainer.a) {
            Drawable drawable = actionBarContainer.e;
            if (drawable != null) {
                int i5 = b;
                int i6 = (i5 ^ 87) + ((i5 & 87) << 1);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    drawable.draw(canvas);
                    throw null;
                }
                drawable.draw(canvas);
            }
            ActionBarContainer actionBarContainer2 = this.c;
            Drawable drawable2 = actionBarContainer2.g;
            if (drawable2 != null) {
                int i7 = a;
                int i8 = i7 & 7;
                int i9 = ((((i7 ^ 7) | i8) << 1) - (~(-((i7 | 7) & (~i8))))) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                if (!(!actionBarContainer2.i)) {
                    int i11 = b;
                    int i12 = i11 & 77;
                    int i13 = i12 + ((i11 ^ 77) | i12);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        drawable2.draw(canvas);
                        obj.hashCode();
                        throw null;
                    }
                    drawable2.draw(canvas);
                    int i14 = b + 33;
                    a = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
        } else {
            int i16 = a;
            int i17 = ((i16 | 109) << 1) - (i16 ^ 109);
            b = i17 % 128;
            int i18 = i17 % 2;
            Drawable drawable3 = actionBarContainer.h;
            if (drawable3 != null) {
                int i19 = b;
                int i20 = (i19 & 71) + (i19 | 71);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    drawable3.draw(canvas);
                    return;
                } else {
                    drawable3.draw(canvas);
                    throw null;
                }
            }
        }
        int i21 = a;
        int i22 = (((i21 | 56) << 1) - (i21 ^ 56)) - 1;
        b = i22 % 128;
        if (i22 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
