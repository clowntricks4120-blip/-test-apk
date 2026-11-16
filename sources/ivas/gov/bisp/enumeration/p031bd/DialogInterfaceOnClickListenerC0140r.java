package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.p044bq.w;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0140r implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DisabilityDiscrepancyActivity c;

    public DialogInterfaceOnClickListenerC0140r(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity) {
        this.c = disabilityDiscrepancyActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = this.c;
        w wVar = new w(disabilityDiscrepancyActivity, disabilityDiscrepancyActivity.aD);
        int i3 = a;
        int i4 = i3 & 81;
        int i5 = i3 | 81;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        wVar.execute(new Void[0]);
        dialogInterface.cancel();
        int i8 = b;
        int i9 = (((i8 | 112) << 1) - (i8 ^ 112)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }
}
