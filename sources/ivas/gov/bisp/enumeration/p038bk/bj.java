package ivas.gov.bisp.enumeration.p038bk;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class bj implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;

    public bj(bk bkVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & 37) - (~(i3 | 37))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        dialogInterface.cancel();
        int i6 = a;
        int i7 = ((i6 ^ 123) | (i6 & 123)) << 1;
        int i8 = -(((~i6) & 123) | (i6 & (-124)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 66 / 0;
        }
    }
}
