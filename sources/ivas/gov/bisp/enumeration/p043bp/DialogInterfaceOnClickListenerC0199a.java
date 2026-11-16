package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0199a implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;

    public DialogInterfaceOnClickListenerC0199a(ActivityAgriculture activityAgriculture) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a + 55;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
    }
}
