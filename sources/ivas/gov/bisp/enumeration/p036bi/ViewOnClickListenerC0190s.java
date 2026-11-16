package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0190s implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ DisabilityActivity e;

    public ViewOnClickListenerC0190s(DisabilityActivity disabilityActivity, EditText editText, AlertDialog alertDialog) {
        this.e = disabilityActivity;
        this.c = editText;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = (i2 | 13) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            this.c.getText().toString();
            throw null;
        }
        String string = this.c.getText().toString();
        int i7 = b + 19;
        a = i7 % 128;
        int i8 = i7 % 2;
        String strReplace = string.replace("-", BuildConfig.FLAVOR);
        ag.f = strReplace;
        int i9 = a;
        int i10 = (((i9 ^ 47) | (i9 & 47)) << 1) - (((~i9) & 47) | (i9 & (-48)));
        b = i10 % 128;
        int i11 = i10 % 2;
        this.e.aH = strReplace;
        EditText editText = this.c;
        int i12 = b + 27;
        a = i12 % 128;
        if (i12 % 2 != 0) {
            editText.setText(strReplace);
            this.e.u();
            obj.hashCode();
            throw null;
        }
        editText.setText(strReplace);
        this.e.u();
        this.d.dismiss();
        int i13 = a + 35;
        b = i13 % 128;
        int i14 = i13 % 2;
    }
}
