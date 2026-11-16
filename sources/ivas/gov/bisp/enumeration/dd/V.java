package ivas.gov.bisp.enumeration.dd;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.GenderActivity;

/* JADX INFO: loaded from: classes.dex */
public class V implements DialogInterface.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ GenderActivity c;

    public V(GenderActivity genderActivity) {
        this.c = genderActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 37;
        int i5 = (((i3 | 37) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.onBackPressed();
        dialogInterface.cancel();
        int i7 = a + 25;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 4 / 0;
        }
    }
}
