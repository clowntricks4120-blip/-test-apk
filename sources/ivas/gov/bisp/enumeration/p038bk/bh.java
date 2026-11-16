package ivas.gov.bisp.enumeration.p038bk;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class bh implements View.OnClickListener {
    private static int a = 1;
    private static int b;

    public bh(bk bkVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 31;
        int i4 = -(-(i2 | 31));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
    }
}
