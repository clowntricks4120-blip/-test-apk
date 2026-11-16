package ivas.gov.bisp.enumeration.dd;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class Q implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ DobActivity e;

    public Q(DobActivity dobActivity, EditText editText, AlertDialog alertDialog) {
        this.e = dobActivity;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 10) << 1) - (i2 ^ 10)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        String string = this.c.getText().toString();
        int i5 = a;
        int i6 = i5 & 71;
        int i7 = ((i5 ^ 71) | i6) << 1;
        int i8 = -((i5 | 71) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            ag.f = string.replace("-", BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        String strReplace = string.replace("-", BuildConfig.FLAVOR);
        ag.f = strReplace;
        DobActivity dobActivity = this.e;
        int i10 = b;
        int i11 = i10 ^ 15;
        int i12 = ((((i10 & 15) | i11) << 1) - (~(-i11))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        dobActivity.aV = strReplace;
        this.c.setText(strReplace);
        DobActivity dobActivity2 = this.e;
        int i14 = b;
        int i15 = i14 & 95;
        int i16 = ((i14 ^ 95) | i15) << 1;
        int i17 = -((i14 | 95) & (~i15));
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            dobActivity2.u();
            this.d.dismiss();
        } else {
            dobActivity2.u();
            this.d.dismiss();
            throw null;
        }
    }
}
