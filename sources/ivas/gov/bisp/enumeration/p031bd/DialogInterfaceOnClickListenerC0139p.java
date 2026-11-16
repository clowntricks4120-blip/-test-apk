package ivas.gov.bisp.enumeration.p031bd;

import android.content.DialogInterface;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0139p implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ z c;

    public DialogInterfaceOnClickListenerC0139p(z zVar) {
        this.c = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = this.c.c;
        Intent intent = new Intent(this.c.c, (Class<?>) DiscrepancyRosterListActivity.class);
        int i3 = b + 11;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            disabilityDiscrepancyActivity.startActivity(intent);
            this.c.c.finish();
            throw null;
        }
        disabilityDiscrepancyActivity.startActivity(intent);
        this.c.c.finish();
        int i4 = b;
        int i5 = i4 & 121;
        int i6 = ((i4 | 121) & (~i5)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        dialogInterface.cancel();
        if (i7 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
