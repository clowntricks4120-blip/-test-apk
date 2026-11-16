package ivas.gov.bisp.enumeration.p043bp;

import android.app.AlertDialog;
import android.view.View;
import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: loaded from: classes.dex */
public class J implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityAgriculture c;

    public J(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AlertDialog alertDialog;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 99;
        int i4 = -(-((i2 & 99) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            AlertDialog alertDialog2 = this.c.al;
            throw null;
        }
        ActivityAgriculture activityAgriculture = this.c;
        if (activityAgriculture.al != null) {
            int i6 = a;
            int i7 = i6 & 75;
            int i8 = (i6 | 75) & (~i7);
            int i9 = i7 << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                activityAgriculture.ah.setAdapter(activityAgriculture.aF);
                alertDialog = activityAgriculture.al;
                int i11 = 86 / 0;
            } else {
                activityAgriculture.ah.setAdapter(activityAgriculture.aF);
                alertDialog = activityAgriculture.al;
            }
            alertDialog.show();
            int i12 = b;
            int i13 = (i12 ^ 103) + ((i12 & 103) << 1);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 3 % 2;
            }
        }
        int i15 = a;
        int i16 = ((i15 ^ 3) | (i15 & 3)) << 1;
        int i17 = -(((~i15) & 3) | (i15 & (-4)));
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
    }
}
