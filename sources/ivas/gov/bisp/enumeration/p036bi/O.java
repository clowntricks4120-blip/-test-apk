package ivas.gov.bisp.enumeration.p036bi;

import android.view.View;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.activity.CnicValidationActivity;

/* JADX INFO: loaded from: classes.dex */
public class O implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ b c;

    public O(CnicValidationActivity cnicValidationActivity, b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 21;
        int i4 = (((i2 ^ 21) | i3) << 1) - ((i2 | 21) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        this.c.dismiss();
        int i6 = a;
        int i7 = (i6 | 63) << 1;
        int i8 = -(((~i6) & 63) | (i6 & (-64)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 70 / 0;
        }
    }
}
