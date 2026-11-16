package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityAgriculture c;

    public i(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 1) | (i2 & 1)) << 1) - (((~i2) & 1) | (i2 & (-2)));
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.recyclerViewKhareef.setNestedScrollingEnabled(true);
        ActivityAgriculture activityAgriculture = this.c;
        int i5 = a;
        int i6 = i5 & 3;
        int i7 = ((((i5 ^ 3) | i6) << 1) - (~(-((i5 | 3) & (~i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        if (activityAgriculture.recyclerViewRabi.getVisibility() != 0) {
            this.c.recyclerViewRabi.setNestedScrollingEnabled(false);
            int i9 = a;
            int i10 = i9 & 21;
            int i11 = -(-((i9 ^ 21) | i10));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        int i14 = b;
        int i15 = (i14 & 93) + (i14 | 93);
        a = i15 % 128;
        int i16 = i15 % 2;
        this.c.recyclerViewRabi.setNestedScrollingEnabled(true);
        int i17 = b;
        int i18 = i17 & 125;
        int i19 = i18 + ((i17 ^ 125) | i18);
        a = i19 % 128;
        int i20 = i19 % 2;
    }
}
