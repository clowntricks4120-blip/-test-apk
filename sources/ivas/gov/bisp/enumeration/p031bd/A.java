package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;

/* JADX INFO: loaded from: classes.dex */
public class A implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalDiscrepancy c;

    public A(MaritalDiscrepancy maritalDiscrepancy) {
        this.c = maritalDiscrepancy;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        dialogInterface.cancel();
        MaritalDiscrepancy maritalDiscrepancy = this.c;
        Intent intent = new Intent(this.c, (Class<?>) DiscrepancyRosterListActivity.class);
        int i3 = b;
        int i4 = ((i3 | 31) << 1) - (i3 ^ 31);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            maritalDiscrepancy.startActivity(intent);
            this.c.finish();
        } else {
            maritalDiscrepancy.startActivity(intent);
            this.c.finish();
            int i5 = 49 / 0;
        }
    }
}
