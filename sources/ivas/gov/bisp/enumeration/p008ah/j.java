package ivas.gov.bisp.enumeration.p008ah;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static int a = 0;
    private static int b = 1;

    public static void b(Drawable drawable, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 117;
        int i5 = (i3 & 117) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        drawable.setTint(i);
        int i8 = a;
        int i9 = i8 & 93;
        int i10 = (((i8 | 93) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 76 / 0;
        }
    }

    public static void c(Drawable drawable, ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = (i2 ^ 95) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            drawable.setTintList(colorStateList);
            return;
        }
        drawable.setTintList(colorStateList);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void d(Drawable drawable, PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (i2 | 63) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            drawable.setTintMode(mode);
        } else {
            drawable.setTintMode(mode);
            throw null;
        }
    }
}
