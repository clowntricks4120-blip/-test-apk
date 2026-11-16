package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;

/* JADX INFO: loaded from: classes.dex */
public class R implements DialogInterface.OnClickListener {
    private static int a = 0x00000001;
    private static int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ DashboardActivity d;

    public R(DashboardActivity dashboardActivity, boolean z) {
        this.d = dashboardActivity;
        this.c = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 69;
        int i5 = (i3 | 69) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            dialogInterface.cancel();
            obj.hashCode();
            throw null;
        }
        dialogInterface.cancel();
        if (this.c) {
            this.d.finish();
            int i8 = b;
            int i9 = i8 & 113;
            int i10 = -(-((i8 ^ 113) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = i13 & 7;
        int i15 = (((i13 ^ 7) | i14) << 1) - ((i13 | 7) & (~i14));
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
