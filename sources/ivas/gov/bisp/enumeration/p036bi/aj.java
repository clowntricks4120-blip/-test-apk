package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;

/* JADX INFO: loaded from: classes.dex */
public class aj implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;

    public aj(DiscrepancyRosterListActivity discrepancyRosterListActivity) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 109;
        int i5 = (((i3 & 109) | i4) << 1) - i4;
        a = i5 % 128;
        int i6 = i5 % 2;
        dialogInterface.cancel();
        int i7 = b;
        int i8 = (i7 & 3) + (i7 | 3);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
