package ivas.gov.bisp.enumeration.aR;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static int a = 1;
    private static int b;

    public static PorterDuffColorFilter b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (colorStateList == null || mode == null) {
            int i5 = i4 & 15;
            int i6 = (~i5) & (i4 | 15);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        int i10 = a;
        int i11 = i10 & 79;
        int i12 = (i10 | 79) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        b = i14 % 128;
        int i15 = i14 % 2;
        return porterDuffColorFilter;
    }
}
