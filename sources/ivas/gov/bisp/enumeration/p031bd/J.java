package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;

/* JADX INFO: loaded from: classes.dex */
public class J implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ x c;

    public J(x xVar) {
        this.c = xVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        DobDiscrepancy dobDiscrepancy = this.c.c;
        Intent intent = new Intent(this.c.c, (Class<?>) DiscrepancyRosterListActivity.class);
        int i3 = a + 113;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            dobDiscrepancy.startActivity(intent);
            this.c.c.finish();
            dialogInterface.cancel();
            int i4 = 52 / 0;
        } else {
            dobDiscrepancy.startActivity(intent);
            this.c.c.finish();
            dialogInterface.cancel();
        }
        int i5 = b + 21;
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
