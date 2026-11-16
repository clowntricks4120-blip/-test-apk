package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0134c implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ DisabilityDiscrepancyActivity e;

    public ViewOnClickListenerC0134c(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity, EditText editText, AlertDialog alertDialog) {
        this.e = disabilityDiscrepancyActivity;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = i3 + ((i2 ^ 15) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        String string = this.c.getText().toString();
        int i6 = b;
        int i7 = i6 & 23;
        int i8 = i7 + ((i6 ^ 23) | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        string.replace("-", BuildConfig.FLAVOR);
        this.e.ae.setText(string);
        int i10 = b;
        int i11 = i10 | 37;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 37)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            this.e.aK = string;
            this.d.dismiss();
            int i15 = 78 / 0;
        } else {
            this.e.aK = string;
            this.d.dismiss();
        }
        int i16 = a;
        int i17 = ((i16 | 9) << 1) - (i16 ^ 9);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 84 / 0;
        }
    }
}
