package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0205l implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;

    public DialogInterfaceOnClickListenerC0205l(ActivityAgriculture activityAgriculture) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b + 37;
        a = i3 % 128;
        int i4 = i3 % 2;
    }
}
