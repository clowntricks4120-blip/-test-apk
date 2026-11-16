package ivas.gov.bisp.enumeration.p038bk;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class bq implements View.OnClickListener {
    private static int a = 1;
    private static int b;

    public bq(bs bsVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 101;
        int i4 = (((i2 ^ 101) | i3) << 1) - ((i2 | 101) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
    }
}
