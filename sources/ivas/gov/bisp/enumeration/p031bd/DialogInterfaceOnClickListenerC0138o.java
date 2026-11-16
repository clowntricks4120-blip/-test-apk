package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0138o implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DobDiscrepancy c;

    public DialogInterfaceOnClickListenerC0138o(DobDiscrepancy dobDiscrepancy) {
        this.c = dobDiscrepancy;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        DobDiscrepancy dobDiscrepancy = this.c;
        Intent intent = new Intent(this.c, (Class<?>) DiscrepancyRosterListActivity.class);
        int i3 = b + 49;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            dobDiscrepancy.startActivity(intent);
            this.c.finish();
            dialogInterface.cancel();
            int i4 = 17 / 0;
        } else {
            dobDiscrepancy.startActivity(intent);
            this.c.finish();
            dialogInterface.cancel();
        }
        int i5 = b + 113;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }
}
