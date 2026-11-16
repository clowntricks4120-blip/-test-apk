package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.Single_Discrepancy;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0185n implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ X c;

    public DialogInterfaceOnClickListenerC0185n(X x) {
        this.c = x;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        DisabilityActivity disabilityActivity = this.c.c;
        Intent intent = new Intent(this.c.c, (Class<?>) Single_Discrepancy.class);
        int i3 = a + 17;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            disabilityActivity.startActivity(intent);
            this.c.c.finish();
            dialogInterface.cancel();
            throw null;
        }
        disabilityActivity.startActivity(intent);
        this.c.c.finish();
        dialogInterface.cancel();
        int i4 = b;
        int i5 = ((i4 & 6) + (i4 | 6)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
