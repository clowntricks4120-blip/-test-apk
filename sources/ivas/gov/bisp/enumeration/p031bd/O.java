package ivas.gov.bisp.enumeration.p031bd;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;

/* JADX INFO: loaded from: classes.dex */
public class O implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ b c;

    public O(GenderDiscrepancy genderDiscrepancy, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 102) + (i2 | 102)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.dismiss();
        } else {
            this.c.dismiss();
            throw null;
        }
    }
}
