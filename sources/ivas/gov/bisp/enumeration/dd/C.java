package ivas.gov.bisp.enumeration.dd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class C implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ MaritalStatusActivity e;

    public C(MaritalStatusActivity maritalStatusActivity, EditText editText, AlertDialog alertDialog) {
        this.e = maritalStatusActivity;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 41;
        int i4 = (i3 << 1) - ((~(i2 & 41)) & i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            string = this.c.getText().toString();
            int i5 = 11 / 0;
        } else {
            string = this.c.getText().toString();
        }
        int i6 = b;
        int i7 = ((i6 & 17) - (~(i6 | 17))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        String strReplace = string.replace("-", BuildConfig.FLAVOR);
        ag.f = strReplace;
        MaritalStatusActivity maritalStatusActivity = this.e;
        int i9 = a;
        int i10 = (i9 ^ 115) + ((i9 & 115) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            maritalStatusActivity.aK = strReplace;
            this.c.setText(strReplace);
            throw null;
        }
        maritalStatusActivity.aK = strReplace;
        this.c.setText(strReplace);
        int i11 = a;
        int i12 = i11 & 47;
        int i13 = -(-((i11 ^ 47) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        this.e.u();
        this.d.dismiss();
        int i16 = a + 123;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }
}
