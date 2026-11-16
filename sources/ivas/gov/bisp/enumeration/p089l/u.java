package ivas.gov.bisp.enumeration.p089l;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class u {
    private static int a = 0;
    private static int b = 1;

    public static boolean b(PopupWindow popupWindow) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 111;
        int i4 = ((i2 ^ 111) | i3) << 1;
        int i5 = -((i2 | 111) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        boolean overlapAnchor = popupWindow.getOverlapAnchor();
        int i8 = a;
        int i9 = ((i8 ^ 89) | (i8 & 89)) << 1;
        int i10 = -(((~i8) & 89) | (i8 & (-90)));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return overlapAnchor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int c(PopupWindow popupWindow) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 43;
        int i4 = (i2 | 43) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            popupWindow.getWindowLayoutType();
            obj.hashCode();
            throw null;
        }
        int windowLayoutType = popupWindow.getWindowLayoutType();
        int i7 = a;
        int i8 = i7 & 39;
        int i9 = i7 | 39;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return windowLayoutType;
        }
        obj.hashCode();
        throw null;
    }

    public static void d(PopupWindow popupWindow, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        b = i3 % 128;
        int i4 = i3 % 2;
        popupWindow.setOverlapAnchor(z);
        if (i4 == 0) {
            int i5 = 24 / 0;
        }
        int i6 = a;
        int i7 = (((i6 ^ 67) | (i6 & 67)) << 1) - (((~i6) & 67) | (i6 & (-68)));
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void e(PopupWindow popupWindow, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 21;
        int i5 = i4 + ((i3 ^ 21) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        popupWindow.setWindowLayoutType(i);
        int i7 = b + 39;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }
}
