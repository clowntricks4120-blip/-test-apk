package ivas.gov.bisp.enumeration.p043bp;

import android.app.AlertDialog;
import android.view.View;
import ivas.gov.bisp.enumeration.ActivityAgriculture;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0208o implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityAgriculture c;

    public ViewOnClickListenerC0208o(ActivityAgriculture activityAgriculture) {
        this.c = activityAgriculture;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 59;
        int i4 = (i2 | 59) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        ActivityAgriculture activityAgriculture = this.c;
        if (activityAgriculture.ak != null) {
            int i8 = b + 55;
            a = i8 % 128;
            int i9 = i8 % 2;
            activityAgriculture.ag.setAdapter(activityAgriculture.aG);
            AlertDialog alertDialog = activityAgriculture.ak;
            int i10 = a;
            int i11 = ((i10 | 13) << 1) - (i10 ^ 13);
            b = i11 % 128;
            int i12 = i11 % 2;
            alertDialog.show();
            int i13 = b;
            int i14 = ((i13 & (-120)) | ((~i13) & 119)) + ((i13 & 119) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 ^ 5;
        int i18 = (((i16 & 5) | i17) << 1) - i17;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 46 / 0;
        }
    }
}
