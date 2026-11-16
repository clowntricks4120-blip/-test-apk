package ivas.gov.bisp.enumeration.o000OOo;

import android.content.Context;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p095o0000oO.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 extends OooOO0 {
    private static int a = 1;
    private static int b;

    public OooO0O0(Context context) {
        super(context);
    }

    @Override // ivas.gov.bisp.enumeration.p095o0000oO.OooOO0
    public int getItemDefaultMarginResId() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = ((~i3) & (i2 | 123)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i2 & 105;
        int i6 = (i2 | 105) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 11 / 0;
        }
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // ivas.gov.bisp.enumeration.p095o0000oO.OooOO0
    public int getItemLayoutResId() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 9) + (i2 | 9);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 & (-92)) | ((~i2) & 91)) + ((i2 & 91) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.design_bottom_navigation_item;
    }
}
