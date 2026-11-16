package ivas.gov.bisp.enumeration.dd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.GenderActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class L implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ GenderActivity e;

    public L(GenderActivity genderActivity, EditText editText, AlertDialog alertDialog) {
        this.e = genderActivity;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        String strReplace;
        GenderActivity genderActivity;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = -(-((i2 ^ 67) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            string = this.c.getText().toString();
            int i6 = 79 / 0;
        } else {
            string = this.c.getText().toString();
        }
        int i7 = a;
        int i8 = i7 & 87;
        int i9 = -(-((i7 ^ 87) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            strReplace = string.replace("-", BuildConfig.FLAVOR);
            ag.f = strReplace;
            genderActivity = this.e;
            int i11 = 97 / 0;
        } else {
            strReplace = string.replace("-", BuildConfig.FLAVOR);
            ag.f = strReplace;
            genderActivity = this.e;
        }
        int i12 = b;
        int i13 = i12 ^ 7;
        int i14 = -(-((i12 & 7) << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        genderActivity.aP = strReplace;
        this.c.setText(strReplace);
        int i17 = b;
        int i18 = ((i17 & 85) - (~(i17 | 85))) - 1;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            this.e.u();
            this.d.dismiss();
            int i19 = 87 / 0;
        } else {
            this.e.u();
            this.d.dismiss();
        }
        int i20 = a;
        int i21 = i20 & 55;
        int i22 = (i20 | 55) & (~i21);
        int i23 = i21 << 1;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        b = i24 % 128;
        int i25 = i24 % 2;
    }
}
