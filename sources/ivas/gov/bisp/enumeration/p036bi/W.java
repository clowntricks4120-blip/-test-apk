package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.Single_Discrepancy;

/* JADX INFO: loaded from: classes.dex */
public class W implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DisabilityActivity c;

    public W(DisabilityActivity disabilityActivity) {
        this.c = disabilityActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        DisabilityActivity disabilityActivity = this.c;
        Intent intent = new Intent(this.c, (Class<?>) Single_Discrepancy.class);
        int i3 = a + 17;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            disabilityActivity.startActivity(intent);
            this.c.finish();
            int i4 = 21 / 0;
        } else {
            disabilityActivity.startActivity(intent);
            this.c.finish();
        }
        dialogInterface.cancel();
        int i5 = b + 107;
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
