package ivas.gov.bisp.enumeration.p031bd;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0136l implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public ViewOnClickListenerC0136l(DobDiscrepancy dobDiscrepancy, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = ((((i2 ^ 9) | i3) << 1) - (~(-((i2 | 9) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.dismiss();
        } else {
            this.c.dismiss();
            int i5 = 56 / 0;
        }
    }
}
