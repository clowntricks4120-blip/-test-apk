package ivas.gov.bisp.enumeration.p038bk;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class bf implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;

    public bf(bs bsVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 41;
        int i5 = (((i3 ^ 41) | i4) << 1) - ((i3 | 41) & (~i4));
        b = i5 % 128;
        int i6 = i5 % 2;
        dialogInterface.cancel();
        int i7 = b;
        int i8 = i7 | 87;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 87)) & i8);
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
    }
}
