package ivas.gov.bisp.enumeration.rosterActivity;

import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class P implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OfflineRosterActivity.OooOo c;

    public P(OfflineRosterActivity.OooOo oooOo) {
        this.c = oooOo;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = (i2 | 73) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        OfflineRosterActivity.this.et_hoursWorked.setText(BuildConfig.FLAVOR);
        int i8 = a;
        int i9 = (i8 | 17) << 1;
        int i10 = -(((~i8) & 17) | (i8 & (-18)));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 66 / 0;
        }
    }
}
