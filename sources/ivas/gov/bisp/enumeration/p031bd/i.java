package ivas.gov.bisp.enumeration.p031bd;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;

/* JADX INFO: loaded from: classes.dex */
public class i implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public i(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 44) << 1) - (i2 ^ 44)) ^ (-1));
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.dismiss();
            throw null;
        }
        this.c.dismiss();
        int i4 = b;
        int i5 = i4 & 109;
        int i6 = ((i4 ^ 109) | i5) << 1;
        int i7 = -((i4 | 109) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
