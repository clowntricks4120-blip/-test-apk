package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;

/* JADX INFO: loaded from: classes.dex */
public class W implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ al c;

    public W(al alVar) {
        this.c = alVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        MaritalDiscrepancy maritalDiscrepancy = this.c.c;
        Intent intent = new Intent(this.c.c, (Class<?>) DiscrepancyRosterListActivity.class);
        int i3 = a;
        int i4 = i3 & 121;
        int i5 = ((i3 | 121) & (~i4)) + (i4 << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            maritalDiscrepancy.startActivity(intent);
            this.c.c.finish();
            throw null;
        }
        maritalDiscrepancy.startActivity(intent);
        this.c.c.finish();
        int i6 = b;
        int i7 = ((i6 | 85) << 1) - (i6 ^ 85);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            dialogInterface.cancel();
        } else {
            dialogInterface.cancel();
            obj.hashCode();
            throw null;
        }
    }
}
