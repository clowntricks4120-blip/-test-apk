package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0216x implements Runnable {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityAgriculture c;

    public RunnableC0216x(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = ((((i2 & 77) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.c.recyclerViewRabi.setNestedScrollingEnabled(true);
        if (this.c.recyclerViewKhareef.getVisibility() != 0) {
            this.c.recyclerViewKhareef.setNestedScrollingEnabled(false);
            int i6 = b;
            int i7 = i6 & 55;
            int i8 = (((i6 ^ 55) | i7) << 1) - ((i6 | 55) & (~i7));
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 42 / 0;
                return;
            }
            return;
        }
        int i10 = a;
        int i11 = (i10 | 99) << 1;
        int i12 = -(i10 ^ 99);
        int i13 = (i11 & i12) + (i12 | i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            this.c.recyclerViewKhareef.setNestedScrollingEnabled(false);
        } else {
            this.c.recyclerViewKhareef.setNestedScrollingEnabled(true);
        }
        int i14 = b;
        int i15 = i14 & 55;
        int i16 = -(-((i14 ^ 55) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
