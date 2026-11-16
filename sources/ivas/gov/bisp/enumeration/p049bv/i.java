package ivas.gov.bisp.enumeration.p049bv;

import android.view.View;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class i implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public i(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ActivityEnumeratorMain activityEnumeratorMain;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-90)) | ((~i2) & 89)) + ((i2 & 89) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            activityEnumeratorMain = this.c;
            ah.c.d.getInt("app_version", 1);
        } else {
            activityEnumeratorMain = this.c;
            ah.c.d.getInt("app_version", 0);
        }
        int i4 = b + 83;
        a = i4 % 128;
        int i5 = i4 % 2;
        ah.c.d.getString("imei_mac", BuildConfig.FLAVOR);
        int i6 = a;
        int i7 = (i6 & 89) + (i6 | 89);
        b = i7 % 128;
        int i8 = i7 % 2;
        int i9 = ah.c.d.getInt("user_id", 0);
        ah.c.d.getInt("supervisorID", 0);
        ah ahVar = ah.c;
        int i10 = a;
        int i11 = (i10 & 48) + (i10 | 48);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        ahVar.d.getString("full_name", BuildConfig.FLAVOR);
        ah ahVar2 = ah.c;
        int i14 = a + 107;
        b = i14 % 128;
        int i15 = i14 % 2;
        ahVar2.d.getString("user_cnic", BuildConfig.FLAVOR);
        ag.q(activityEnumeratorMain, i9);
        int i16 = b;
        int i17 = i16 & 43;
        int i18 = i16 | 43;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        a = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 47 / 0;
        }
    }
}
