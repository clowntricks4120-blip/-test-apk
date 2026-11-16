package ivas.gov.bisp.enumeration.bK;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public class k implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ w c;

    public k(w wVar) {
        this.c = wVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 22) + ((i3 & 22) << 1)) ^ (-1));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.c.finish();
            dialogInterface.cancel();
            throw null;
        }
        this.c.c.finish();
        dialogInterface.cancel();
        int i5 = b;
        int i6 = ((i5 | 70) << 1) - (i5 ^ 70);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
    }
}
