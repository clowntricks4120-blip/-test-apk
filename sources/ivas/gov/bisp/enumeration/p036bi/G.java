package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.activity.NADRARosterListActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.p044bq.w;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class G implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ NADRARosterListActivity e;

    public G(NADRARosterListActivity nADRARosterListActivity, EditText editText, AlertDialog alertDialog) {
        this.e = nADRARosterListActivity;
        this.c = editText;
        this.d = alertDialog;
    }

    public class bmG implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public bmG() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            NADRARosterListActivity nADRARosterListActivity = G.this.e;
            w wVar = new w(nADRARosterListActivity, nADRARosterListActivity.ak);
            int i3 = b;
            int i4 = (((i3 ^ 117) | (i3 & 117)) << 1) - (((~i3) & 117) | (i3 & (-118)));
            a = i4 % 128;
            int i5 = i4 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i6 = a;
            int i7 = i6 & 41;
            int i8 = (i7 - (~((i6 ^ 41) | i7))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 45;
        int i4 = (((i2 & 45) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            string = this.c.getText().toString();
            int i5 = 11 / 0;
        } else {
            string = this.c.getText().toString();
        }
        ag.f = string.replace("-", BuildConfig.FLAVOR);
        NADRARosterListActivity nADRARosterListActivity = this.e;
        int i6 = b;
        int i7 = (-2) - (((i6 & 34) + (i6 | 34)) ^ (-1));
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            nADRARosterListActivity.ak.k().length();
            obj.hashCode();
            throw null;
        }
        if (nADRARosterListActivity.ak.k().length() > 0) {
            NADRARosterListActivity nADRARosterListActivity2 = this.e;
            String str = ag.f;
            String strC = nADRARosterListActivity2.ak.c();
            int i8 = b;
            int i9 = i8 & 43;
            int i10 = -(-(i8 | 43));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            nADRARosterListActivity2.u(str, strC);
            int i13 = a;
            int i14 = (i13 ^ 93) + ((i13 & 93) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.e);
            int i16 = a;
            int i17 = i16 & 5;
            int i18 = ((i16 | 5) & (~i17)) + (i17 << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                builder.setTitle("Session Expire");
            } else {
                builder.setTitle("Session Expire");
            }
            builder.setMessage("Session Expire Please Login Again.!");
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new bmG());
            int i19 = a + 93;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                builder.create().show();
                throw null;
            }
            builder.create().show();
            int i20 = b;
            int i21 = ((((i20 ^ 119) | (i20 & 119)) << 1) - (~(-(((~i20) & 119) | (i20 & (-120)))))) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        this.d.dismiss();
        int i23 = b;
        int i24 = (((i23 & (-34)) | ((~i23) & 33)) - (~(-(-((i23 & 33) << 1))))) - 1;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 79 / 0;
        }
    }
}
