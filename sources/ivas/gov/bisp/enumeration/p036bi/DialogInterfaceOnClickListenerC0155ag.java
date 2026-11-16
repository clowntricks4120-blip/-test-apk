package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0155ag implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ DiscrepancyRosterListActivity d;

    public DialogInterfaceOnClickListenerC0155ag(DiscrepancyRosterListActivity discrepancyRosterListActivity, boolean z) {
        this.d = discrepancyRosterListActivity;
        this.c = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 113) - (~(i3 | 113))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            dialogInterface.cancel();
            throw null;
        }
        dialogInterface.cancel();
        if (this.c) {
            this.d.finish();
            int i5 = b;
            int i6 = (i5 | 71) << 1;
            int i7 = -(((~i5) & 71) | (i5 & (-72)));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = (i10 | 77) << 1;
        int i12 = -(i10 ^ 77);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        int i14 = i13 % 2;
    }
}
