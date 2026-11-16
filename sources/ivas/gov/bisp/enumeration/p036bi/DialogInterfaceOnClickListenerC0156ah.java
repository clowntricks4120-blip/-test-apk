package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0156ah implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyRosterListActivity c;

    public DialogInterfaceOnClickListenerC0156ah(DiscrepancyRosterListActivity discrepancyRosterListActivity) {
        this.c = discrepancyRosterListActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a + 93;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.c.ac.isShowing())) {
            int i5 = b;
            int i6 = (i5 & 93) + (i5 | 93);
            a = i6 % 128;
            int i7 = i6 % 2;
            this.c.ac.dismiss();
            int i8 = a;
            int i9 = (i8 & (-56)) | ((~i8) & 55);
            int i10 = (i8 & 55) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        dialogInterface.cancel();
        DiscrepancyRosterListActivity discrepancyRosterListActivity = this.c;
        int i13 = b;
        int i14 = (i13 & (-106)) | ((~i13) & 105);
        int i15 = -(-((i13 & 105) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        a = i16 % 128;
        int i17 = i16 % 2;
        discrepancyRosterListActivity.B(discrepancyRosterListActivity.ad.r());
        int i18 = b;
        int i19 = (i18 | 1) << 1;
        int i20 = -(((~i18) & 1) | (i18 & (-2)));
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        int i22 = i21 % 2;
    }
}
