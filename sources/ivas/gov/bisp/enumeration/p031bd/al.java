package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class al implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ MaritalDiscrepancy c;

    public al(MaritalDiscrepancy maritalDiscrepancy) {
        this.c = maritalDiscrepancy;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-124)) | ((~i2) & 123)) + ((i2 & 123) << 1);
        a = i3 % 128;
        Object obj2 = null;
        try {
            if (i3 % 2 != 0) {
                ((JSONObject) obj).getString("message".toLowerCase());
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string = ((JSONObject) obj).getString("message".toLowerCase());
            int i4 = a;
            int i5 = i4 & 45;
            int i6 = i5 + ((i4 ^ 45) | i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            this.c.ac.dismiss();
            int i8 = b;
            int i9 = i8 & 23;
            int i10 = (i8 | 23) & (~i9);
            int i11 = i9 << 1;
            int i12 = (i10 & i11) + (i10 | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (string.contains("Marital Status Updated")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
                builder.setTitle("Marital Discrepancy.!");
                StringBuilder sb = new StringBuilder();
                int i14 = a;
                int i15 = ((((i14 ^ 93) | (i14 & 93)) << 1) - (~(-(((~i14) & 93) | (i14 & (-94)))))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                sb.append("Marital Status is Updated agaist this CNIC : ");
                String str = this.c.aL;
                int i17 = b + 13;
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    sb.append(str);
                    builder.setMessage(sb.toString());
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                sb.append(str);
                builder.setMessage(sb.toString());
                builder.setCancelable(true);
                W w = new W(this);
                int i18 = b + 11;
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    builder.setPositiveButton("Confirm", w);
                    builder.create();
                    try {
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                builder.setPositiveButton("Confirm", w);
                AlertDialog alertDialogCreate = builder.create();
                int i19 = a;
                int i20 = ((i19 ^ 60) + ((i19 & 60) << 1)) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
                alertDialogCreate.show();
                BISPApplication bISPApplication = this.c.ad;
                int i22 = b;
                int i23 = i22 ^ 119;
                int i24 = -(-((i22 & 119) << 1));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    bISPApplication.t = false;
                } else {
                    bISPApplication.t = true;
                }
                int i26 = a;
                int i27 = (i26 | 81) << 1;
                int i28 = -(((~i26) & 81) | (i26 & (-82)));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                b = i29 % 128;
                int i30 = i29 % 2;
                return;
            }
            if (!string.contains("Cnic Not Found In Nadra")) {
                MaritalDiscrepancy.u(this.c, 1, "Alert.!", string);
                int i31 = b;
                int i32 = (i31 ^ 21) + ((i31 & 21) << 1);
                a = i32 % 128;
                if (i32 % 2 != 0) {
                    Toast.makeText(this.c, string, 1).show();
                    return;
                } else {
                    Toast.makeText(this.c, string, 0).show();
                    return;
                }
            }
            MaritalDiscrepancy maritalDiscrepancy = this.c;
            StringBuilder sb2 = new StringBuilder();
            int i33 = b;
            int i34 = i33 ^ 109;
            int i35 = ((i33 & 109) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            a = i37 % 128;
            int i38 = i37 % 2;
            sb2.append("This CNIC : ");
            EditText editText = this.c.ai;
            int i39 = a;
            int i40 = (i39 & 15) + (i39 | 15);
            b = i40 % 128;
            if (i40 % 2 == 0) {
                sb2.append(editText.getText().toString());
                sb2.append(" Not Found in Nadra Family of this HouseHold");
                int i41 = 89 / 0;
            } else {
                sb2.append(editText.getText().toString());
                sb2.append(" Not Found in Nadra Family of this HouseHold");
            }
            int i42 = b;
            int i43 = i42 & 13;
            int i44 = (((i42 ^ 13) | i43) << 1) - ((i42 | 13) & (~i43));
            a = i44 % 128;
            int i45 = i44 % 2;
            Toast.makeText(maritalDiscrepancy, sb2.toString(), 0).show();
            MaritalDiscrepancy maritalDiscrepancy2 = this.c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("This CNIC : ");
            int i46 = b + 89;
            a = i46 % 128;
            int i47 = i46 % 2;
            Editable text = this.c.ai.getText();
            int i48 = a;
            int i49 = i48 & 81;
            int i50 = (((81 | i48) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
            b = i50 % 128;
            int i51 = i50 % 2;
            sb3.append(text.toString());
            sb3.append(" Not Found in Nadra Family of this HouseHold");
            int i52 = b;
            int i53 = ((i52 ^ 125) - (~((i52 & 125) << 1))) - 1;
            a = i53 % 128;
            if (i53 % 2 != 0) {
                MaritalDiscrepancy.u(maritalDiscrepancy2, 1, "Alert.!", sb3.toString());
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            MaritalDiscrepancy.u(maritalDiscrepancy2, 1, "Alert.!", sb3.toString());
            int i54 = a;
            int i55 = i54 | 31;
            int i56 = i55 << 1;
            int i57 = -((~(i54 & 31)) & i55);
            int i58 = (i56 & i57) + (i57 | i56);
            b = i58 % 128;
            if (i58 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}
