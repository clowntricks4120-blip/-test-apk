package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0137m implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ GenderDiscrepancy e;

    public ViewOnClickListenerC0137m(GenderDiscrepancy genderDiscrepancy, EditText editText, AlertDialog alertDialog) {
        this.e = genderDiscrepancy;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String strReplace;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 36) + (i2 | 36)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        String string = this.c.getText().toString();
        int i5 = b;
        int i6 = i5 & 37;
        int i7 = (i5 ^ 37) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            strReplace = string.replace("-", BuildConfig.FLAVOR);
            ag.f = strReplace;
            this.e.at = strReplace;
            int i9 = 98 / 0;
        } else {
            strReplace = string.replace("-", BuildConfig.FLAVOR);
            ag.f = strReplace;
            this.e.at = strReplace;
        }
        int i10 = a + 95;
        b = i10 % 128;
        int i11 = i10 % 2;
        this.c.setText(strReplace);
        this.e.y();
        int i12 = a;
        int i13 = i12 & 71;
        int i14 = (i12 | 71) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            this.d.dismiss();
        } else {
            this.d.dismiss();
            int i17 = 39 / 0;
        }
    }
}
