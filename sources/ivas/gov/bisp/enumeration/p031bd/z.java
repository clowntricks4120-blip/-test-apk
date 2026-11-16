package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class z implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DisabilityDiscrepancyActivity c;

    public z(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity) {
        this.c = disabilityDiscrepancyActivity;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = a + 90;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            String string = ((JSONObject) obj).getString("message".toLowerCase());
            int i5 = a + 70;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                this.c.aQ.dismiss();
                int i7 = 15 / 0;
            } else {
                this.c.aQ.dismiss();
            }
            int i8 = b;
            int i9 = ((i8 ^ 26) + ((i8 & 26) << 1)) - 1;
            a = i9 % 128;
            Object obj2 = null;
            if (i9 % 2 == 0) {
                string.contains("Disablity Updated");
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (string.contains("Disablity Updated")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
                builder.setTitle("Disability Discrepancy.!");
                StringBuilder sb = new StringBuilder();
                int i10 = a;
                int i11 = i10 & 75;
                int i12 = (i10 | 75) & (~i11);
                int i13 = i11 << 1;
                int i14 = (i12 & i13) + (i12 | i13);
                b = i14 % 128;
                int i15 = i14 % 2;
                sb.append("Disability is Updated agaist this CNIC : ");
                String str = this.c.aK;
                int i16 = b;
                int i17 = ((i16 & 96) + (i16 | 96)) - 1;
                a = i17 % 128;
                if (i17 % 2 == 0) {
                    sb.append(str);
                    builder.setMessage(sb.toString());
                    try {
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                sb.append(str);
                builder.setMessage(sb.toString());
                builder.setCancelable(true);
                DialogInterfaceOnClickListenerC0139p dialogInterfaceOnClickListenerC0139p = new DialogInterfaceOnClickListenerC0139p(this);
                int i18 = a;
                int i19 = (-2) - ((((i18 | 74) << 1) - (i18 ^ 74)) ^ (-1));
                b = i19 % 128;
                int i20 = i19 % 2;
                builder.setPositiveButton("Confirm", dialogInterfaceOnClickListenerC0139p);
                AlertDialog alertDialogCreate = builder.create();
                int i21 = a + 29;
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    alertDialogCreate.show();
                    BISPApplication bISPApplication = this.c.ac;
                    try {
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                alertDialogCreate.show();
                BISPApplication bISPApplication2 = this.c.ac;
                int i22 = b;
                int i23 = ((i22 | 49) << 1) - (i22 ^ 49);
                a = i23 % 128;
                int i24 = i23 % 2;
                bISPApplication2.t = true;
                int i25 = a;
                int i26 = (i25 & 36) + (i25 | 36);
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                b = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 10 / 0;
                    return;
                }
                return;
            }
            if (!string.contains("Cnic Not Found In Nadra")) {
                DisabilityDiscrepancyActivity.u(this.c, 1, "Alert.!", string);
                DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = this.c;
                int i29 = a;
                int i30 = (i29 & 97) + (i29 | 97);
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    Toast.makeText(disabilityDiscrepancyActivity, string, 0).show();
                } else {
                    Toast.makeText(disabilityDiscrepancyActivity, string, 0).show();
                }
                int i31 = a;
                int i32 = i31 & 111;
                int i33 = -(-((i31 ^ 111) | i32));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
                return;
            }
            DisabilityDiscrepancyActivity disabilityDiscrepancyActivity2 = this.c;
            StringBuilder sb2 = new StringBuilder();
            int i36 = a;
            int i37 = (i36 ^ 7) + ((i36 & 7) << 1);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                sb2.append("This CNIC : ");
                String str2 = this.c.aK;
                try {
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            sb2.append("This CNIC : ");
            sb2.append(this.c.aK);
            sb2.append(" Not Found in Nadra Family of this HouseHold");
            int i38 = a;
            int i39 = i38 & 17;
            int i40 = i38 | 17;
            int i41 = (i39 & i40) + (i40 | i39);
            b = i41 % 128;
            int i42 = i41 % 2;
            Toast.makeText(disabilityDiscrepancyActivity2, sb2.toString(), 0).show();
            DisabilityDiscrepancyActivity disabilityDiscrepancyActivity3 = this.c;
            StringBuilder sb3 = new StringBuilder();
            int i43 = a;
            int i44 = (i43 & 27) + (i43 | 27);
            b = i44 % 128;
            if (i44 % 2 != 0) {
                sb3.append("This CNIC : ");
                String str3 = this.c.aK;
                try {
                    throw null;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            sb3.append("This CNIC : ");
            String str4 = this.c.aK;
            int i45 = b;
            int i46 = ((i45 ^ 3) | (i45 & 3)) << 1;
            int i47 = -(((~i45) & 3) | (i45 & (-4)));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            a = i48 % 128;
            if (i48 % 2 == 0) {
                sb3.append(str4);
                sb3.append(" Not Found in Nadra Family of this HouseHold");
            } else {
                sb3.append(str4);
                sb3.append(" Not Found in Nadra Family of this HouseHold");
            }
            int i49 = a;
            int i50 = (-2) - ((((i49 | 94) << 1) - (i49 ^ 94)) ^ (-1));
            b = i50 % 128;
            int i51 = i50 % 2;
            DisabilityDiscrepancyActivity.u(disabilityDiscrepancyActivity3, 1, "Alert.!", sb3.toString());
            int i52 = b;
            int i53 = i52 ^ 53;
            int i54 = (((i52 & 53) | i53) << 1) - i53;
            a = i54 % 128;
            if (i54 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }
}
