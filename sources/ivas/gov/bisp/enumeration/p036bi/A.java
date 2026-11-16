package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;

/* JADX INFO: loaded from: classes.dex */
public class A implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;

    public A(DashboardActivity dashboardActivity) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 83;
        int i5 = -(-((i3 ^ 83) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            dialogInterface.cancel();
            int i7 = 32 / 0;
        } else {
            dialogInterface.cancel();
        }
        int i8 = a;
        int i9 = i8 & 67;
        int i10 = -(-((i8 ^ 67) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }
}
