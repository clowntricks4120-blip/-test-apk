package ivas.gov.bisp.enumeration.p036bi;

import android.app.ProgressDialog;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class K implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DiscrepancyActivity c;

    public K(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    public void b(Object obj) {
        JSONObject jSONObject;
        ProgressDialog progressDialog;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 117) + (i2 | 117);
        b = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                jSONObject = (JSONObject) obj;
                try {
                    progressDialog = this.c.an;
                    int i4 = 17 / 0;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } else {
                jSONObject = (JSONObject) obj;
                progressDialog = this.c.an;
            }
            progressDialog.dismiss();
            String string = jSONObject.getString("result");
            SessionManager sessionManager = this.c.at;
            int i5 = a;
            int i6 = (i5 & 59) + (i5 | 59);
            b = i6 % 128;
            Object obj2 = null;
            if (i6 % 2 != 0) {
                b.b(sessionManager.k());
                this.c.at.m();
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string, b.b(sessionManager.k()), b.b(this.c.at.m())));
            int i7 = b;
            int i8 = i7 & 75;
            int i9 = i8 + ((i7 ^ 75) | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            String string2 = jSONObject2.getString("message");
            if (string2.contains("Invalid Cnic")) {
                int i11 = b;
                int i12 = ((i11 & 64) + (i11 | 64)) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                DiscrepancyActivity.v(this.c, 1, "Alert.!", string2);
                return;
            }
            if (!string2.equalsIgnoreCase("Cnic Found In Nadra Family")) {
                this.c.A();
                DiscrepancyActivity discrepancyActivity = this.c;
                int i14 = b;
                int i15 = i14 | 55;
                int i16 = i15 << 1;
                int i17 = -((~(i14 & 55)) & i15);
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                DiscrepancyActivity.v(discrepancyActivity, 1, "Alert.!", string2);
                int i20 = a;
                int i21 = (i20 & (-8)) | ((~i20) & 7);
                int i22 = -(-((i20 & 7) << 1));
                int i23 = (i21 & i22) + (i22 | i21);
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
            int i24 = b;
            int i25 = i24 & 99;
            int i26 = i24 | 99;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            DiscrepancyActivity discrepancyActivity2 = this.c;
            if (discrepancyActivity2.al) {
                int i29 = a;
                int i30 = i29 & 67;
                int i31 = i30 + ((i29 ^ 67) | i30);
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    boolean z = discrepancyActivity2.am;
                    try {
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!discrepancyActivity2.am) {
                    int i32 = a;
                    int i33 = (i32 ^ 81) + ((i32 & 81) << 1);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    DiscrepancyActivity.u(discrepancyActivity2, "1");
                    int i35 = b;
                    int i36 = ((i35 ^ 29) - (~((i35 & 29) << 1))) - 1;
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
            }
            DiscrepancyActivity discrepancyActivity3 = this.c;
            if (!discrepancyActivity3.al) {
                int i38 = b + 98;
                int i39 = (i38 ^ (-1)) + (i38 << 1);
                a = i39 % 128;
                int i40 = i39 % 2;
                if (discrepancyActivity3.am) {
                    int i41 = b;
                    int i42 = i41 & 95;
                    int i43 = -(-((i41 ^ 95) | i42));
                    int i44 = (i42 & i43) + (i43 | i42);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    DiscrepancyActivity.u(discrepancyActivity3, "3");
                    int i46 = b;
                    int i47 = i46 & 95;
                    int i48 = (i47 - (~((i46 ^ 95) | i47))) - 1;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                }
            }
            DiscrepancyActivity discrepancyActivity4 = this.c;
            if (!(!discrepancyActivity4.al)) {
                int i50 = b;
                int i51 = (-2) - (((i50 ^ 28) + ((i50 & 28) << 1)) ^ (-1));
                a = i51 % 128;
                if (i51 % 2 == 0) {
                    boolean z2 = discrepancyActivity4.am;
                    try {
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (discrepancyActivity4.am) {
                    int i52 = a;
                    int i53 = i52 & 115;
                    int i54 = -(-((i52 ^ 115) | i53));
                    int i55 = (i53 & i54) + (i54 | i53);
                    b = i55 % 128;
                    int i56 = i55 % 2;
                    DiscrepancyActivity.u(discrepancyActivity4, "1");
                    int i57 = b;
                    int i58 = (i57 & 29) + (i57 | 29);
                    a = i58 % 128;
                    if (i58 % 2 == 0) {
                        int i59 = 48 / 0;
                        return;
                    }
                    return;
                }
            }
            int i60 = b + 35;
            a = i60 % 128;
            int i61 = i60 % 2;
        } catch (JSONException unused) {
            this.c.an.dismiss();
        }
    }
}
