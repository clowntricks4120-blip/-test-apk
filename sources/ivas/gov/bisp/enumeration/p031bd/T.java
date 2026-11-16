package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class T implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ GenderDiscrepancy c;

    public T(GenderDiscrepancy genderDiscrepancy) {
        this.c = genderDiscrepancy;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = (((i2 ^ 57) | i3) << 1) - ((i2 | 57) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        try {
            try {
                String string = ((JSONObject) obj).getString("message".toLowerCase());
                int i6 = a;
                int i7 = (i6 | 95) << 1;
                int i8 = -(((~i6) & 95) | (i6 & (-96)));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                b = i9 % 128;
                if (i9 % 2 == 0) {
                    this.c.ac.dismiss();
                    throw null;
                }
                this.c.ac.dismiss();
                if (string.contains("Gender Updated")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
                    builder.setTitle("Gender Discrepancy.!");
                    StringBuilder sb = new StringBuilder();
                    int i10 = b;
                    int i11 = i10 & 105;
                    int i12 = (i10 ^ 105) | i11;
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        sb.append("Gender is Updated agaist this CNIC : ");
                        sb.append(this.c.at);
                        throw null;
                    }
                    sb.append("Gender is Updated agaist this CNIC : ");
                    sb.append(this.c.at);
                    builder.setMessage(sb.toString());
                    builder.setCancelable(true);
                    Q q = new Q(this);
                    int i14 = a;
                    int i15 = (i14 & 67) + (i14 | 67);
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        builder.setPositiveButton("Confirm", q);
                        builder.create().show();
                        int i16 = 58 / 0;
                    } else {
                        builder.setPositiveButton("Confirm", q);
                        builder.create().show();
                    }
                    int i17 = a;
                    int i18 = ((i17 ^ 44) + ((i17 & 44) << 1)) - 1;
                    b = i18 % 128;
                    if (i18 % 2 == 0) {
                        this.c.ad.t = false;
                    } else {
                        this.c.ad.t = true;
                    }
                    int i19 = b;
                    int i20 = ((i19 & 106) + (i19 | 106)) - 1;
                    a = i20 % 128;
                    if (i20 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                if (!string.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                    GenderDiscrepancy.u(this.c, 1, "Alert.!", string);
                    int i21 = a;
                    int i22 = (i21 ^ 103) + ((i21 & 103) << 1);
                    b = i22 % 128;
                    if (i22 % 2 == 0) {
                        Toast.makeText(this.c, string, 0).show();
                    } else {
                        Toast.makeText(this.c, string, 0).show();
                    }
                    int i23 = a;
                    int i24 = ((i23 ^ 38) + ((i23 & 38) << 1)) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    return;
                }
                GenderDiscrepancy genderDiscrepancy = this.c;
                StringBuilder sb2 = new StringBuilder();
                int i26 = a;
                int i27 = (i26 & 39) + (i26 | 39);
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    sb2.append("This CNIC : ");
                    EditText editText = this.c.ai;
                    throw null;
                }
                sb2.append("This CNIC : ");
                EditText editText2 = this.c.ai;
                int i28 = b;
                int i29 = i28 & 105;
                int i30 = -(-((i28 ^ 105) | i29));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                a = i31 % 128;
                if (i31 % 2 != 0) {
                    sb2.append(editText2.getText().toString());
                    sb2.append(" Not Found in Nadra Family of this HouseHold");
                    int i32 = 16 / 0;
                } else {
                    sb2.append(editText2.getText().toString());
                    sb2.append(" Not Found in Nadra Family of this HouseHold");
                }
                Toast.makeText(genderDiscrepancy, sb2.toString(), 0).show();
                GenderDiscrepancy genderDiscrepancy2 = this.c;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("This CNIC : ");
                int i33 = b;
                int i34 = (((i33 & (-118)) | ((~i33) & 117)) - (~((i33 & 117) << 1))) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                Editable text = this.c.ai.getText();
                int i36 = a;
                int i37 = ((i36 & 90) + (i36 | 90)) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
                sb3.append(text.toString());
                sb3.append(" Not Found in Nadra Family of this HouseHold");
                int i39 = a;
                int i40 = (i39 ^ 79) + ((i39 & 79) << 1);
                b = i40 % 128;
                int i41 = i40 % 2;
                GenderDiscrepancy.u(genderDiscrepancy2, 1, "Alert.!", sb3.toString());
                int i42 = b;
                int i43 = ((i42 | 89) << 1) - (i42 ^ 89);
                a = i43 % 128;
                int i44 = i43 % 2;
            } catch (JSONException unused) {
            }
        } catch (ArrayStoreException e) {
            throw e;
        }
    }
}
