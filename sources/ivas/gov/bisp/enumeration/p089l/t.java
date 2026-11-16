package ivas.gov.bisp.enumeration.p089l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static int a = 1;
    private static int b;

    public static void b(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & 93) + (i5 | 93);
        b = i6 % 128;
        int i7 = i6 % 2;
        popupWindow.showAsDropDown(view, i, i2, i3);
        int i8 = b;
        int i9 = (i8 | 31) << 1;
        int i10 = -(((~i8) & 31) | (i8 & (-32)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }
}
