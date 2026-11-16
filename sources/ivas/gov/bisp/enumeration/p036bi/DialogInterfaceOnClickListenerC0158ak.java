package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DuplicateCnic;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0158ak implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;

    public DialogInterfaceOnClickListenerC0158ak(DuplicateCnic duplicateCnic) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a + 97;
        b = i3 % 128;
        int i4 = i3 % 2;
        dialogInterface.cancel();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = b;
        int i6 = i5 & 45;
        int i7 = ((i5 ^ 45) | i6) << 1;
        int i8 = -((i5 | 45) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
