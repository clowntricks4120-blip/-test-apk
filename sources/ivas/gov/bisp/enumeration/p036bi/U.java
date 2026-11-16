package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;

/* JADX INFO: loaded from: classes.dex */
public class U implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public U(DiscrepancyActivity discrepancyActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 1) + (i2 | 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.dismiss();
        int i5 = b;
        int i6 = i5 & 85;
        int i7 = (((i5 ^ 85) | i6) << 1) - ((i5 | 85) & (~i6));
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
