package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class C implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ MaritalDiscrepancy e;

    public C(MaritalDiscrepancy maritalDiscrepancy, EditText editText, AlertDialog alertDialog) {
        this.e = maritalDiscrepancy;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 103;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 103)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        String string = this.c.getText().toString();
        int i8 = b + 52;
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            ag.f = string.replace("-", BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        String strReplace = string.replace("-", BuildConfig.FLAVOR);
        ag.f = strReplace;
        this.e.aL = strReplace;
        this.c.setText(strReplace);
        MaritalDiscrepancy maritalDiscrepancy = this.e;
        int i10 = a;
        int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            maritalDiscrepancy.y();
            this.d.dismiss();
        } else {
            maritalDiscrepancy.y();
            this.d.dismiss();
            throw null;
        }
    }
}
