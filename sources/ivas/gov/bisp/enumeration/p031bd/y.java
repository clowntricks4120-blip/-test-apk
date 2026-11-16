package ivas.gov.bisp.enumeration.p031bd;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;

/* JADX INFO: loaded from: classes.dex */
public class y implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public y(MaritalDiscrepancy maritalDiscrepancy, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = i2 | 15;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.dismiss();
        int i7 = a;
        int i8 = i7 & 63;
        int i9 = (i8 - (~((i7 ^ 63) | i8))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }
}
