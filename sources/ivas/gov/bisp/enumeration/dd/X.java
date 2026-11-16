package ivas.gov.bisp.enumeration.dd;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;

/* JADX INFO: loaded from: classes.dex */
public class X implements DialogInterface.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalStatusActivity c;

    public X(MaritalStatusActivity maritalStatusActivity) {
        this.c = maritalStatusActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 51) << 1;
        int i5 = -(i3 ^ 51);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.onBackPressed();
            dialogInterface.cancel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c.onBackPressed();
        dialogInterface.cancel();
        int i7 = a;
        int i8 = i7 & 29;
        int i9 = -(-((i7 ^ 29) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
