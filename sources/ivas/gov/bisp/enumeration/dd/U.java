package ivas.gov.bisp.enumeration.dd;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class U implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdatePhoneNoActivity c;

    public U(UpdatePhoneNoActivity updatePhoneNoActivity) {
        this.c = updatePhoneNoActivity;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = (JSONObject) obj;
        try {
            ProgressDialog progressDialog = this.c.ag;
            int i5 = a;
            int i6 = ((i5 ^ 125) | (i5 & 125)) << 1;
            int i7 = -(((~i5) & 125) | (i5 & (-126)));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            Object obj2 = null;
            if (i8 % 2 != 0) {
                progressDialog.dismiss();
                jSONObject.getString("message");
                throw null;
            }
            progressDialog.dismiss();
            String string = jSONObject.getString("message");
            if (string.contains("Updated")) {
                int i9 = b;
                int i10 = i9 ^ 5;
                int i11 = ((i9 & 5) | i10) << 1;
                int i12 = -i10;
                int i13 = (i11 & i12) + (i11 | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                Toast.makeText(this.c, string, 0).show();
                UpdatePhoneNoActivity updatePhoneNoActivity = this.c;
                SessionManager sessionManager = updatePhoneNoActivity.am;
                int i15 = a + 2;
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    updatePhoneNoActivity.ae.getText().toString();
                    SharedPreferences.Editor editor = sessionManager.d;
                    obj2.hashCode();
                    throw null;
                }
                sessionManager.d.putString("k_phone", updatePhoneNoActivity.ae.getText().toString());
                sessionManager.d.apply();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
                builder.setTitle("Phone Number.!");
                StringBuilder sb = new StringBuilder();
                sb.append("Phone # ");
                int i17 = b;
                int i18 = ((i17 & 28) + (i17 | 28)) - 1;
                a = i18 % 128;
                int i19 = i18 % 2;
                sb.append(this.c.ae.getText().toString());
                int i20 = b + 57;
                a = i20 % 128;
                int i21 = i20 % 2;
                sb.append(" is Updated.");
                builder.setMessage(sb.toString());
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new ab(this));
                AlertDialog alertDialogCreate = builder.create();
                int i22 = b;
                int i23 = ((i22 ^ 57) | (i22 & 57)) << 1;
                int i24 = -(((~i22) & 57) | (i22 & (-58)));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                a = i25 % 128;
                int i26 = i25 % 2;
                alertDialogCreate.show();
                int i27 = a;
                int i28 = i27 ^ 5;
                int i29 = (((i27 & 5) | i28) << 1) - i28;
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i30 = a;
            int i31 = i30 ^ 19;
            int i32 = (((i30 & 19) | i31) << 1) - i31;
            b = i32 % 128;
            int i33 = i32 % 2;
        } catch (JSONException unused) {
        }
    }
}
