package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.utils.SessionManager;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0193v implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DashboardActivity c;

    public DialogInterfaceOnClickListenerC0193v(DashboardActivity dashboardActivity) {
        this.c = dashboardActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-80)) | ((~i3) & 79)) + ((i3 & 79) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        dialogInterface.cancel();
        DashboardActivity dashboardActivity = this.c;
        SessionManager sessionManager = dashboardActivity.af;
        int i6 = b;
        int i7 = i6 & 91;
        int i8 = (i6 ^ 91) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        dashboardActivity.z(sessionManager.r());
        int i11 = a;
        int i12 = i11 & 51;
        int i13 = -(-((i11 ^ 51) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 60 / 0;
        }
    }
}
