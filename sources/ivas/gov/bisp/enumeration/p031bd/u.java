package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class u implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ DobDiscrepancy e;

    public u(DobDiscrepancy dobDiscrepancy, EditText editText, AlertDialog alertDialog) {
        this.e = dobDiscrepancy;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        int i = 2 % 2;
        int i2 = b + 7;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            string = this.c.getText().toString();
            int i3 = 10 / 0;
        } else {
            string = this.c.getText().toString();
        }
        String strReplace = string.replace("-", BuildConfig.FLAVOR);
        ag.f = strReplace;
        DobDiscrepancy dobDiscrepancy = this.e;
        int i4 = b;
        int i5 = i4 & 13;
        int i6 = -(-(i4 | 13));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        dobDiscrepancy.aK = strReplace;
        this.c.setText(strReplace);
        int i9 = a;
        int i10 = i9 ^ 61;
        int i11 = ((i9 & 61) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            this.e.y();
            this.d.dismiss();
        } else {
            this.e.y();
            this.d.dismiss();
            throw null;
        }
    }
}
