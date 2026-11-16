package ivas.gov.bisp.enumeration.dd;

import android.app.ProgressDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class al implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ MaritalStatusActivity c;

    public al(MaritalStatusActivity maritalStatusActivity) {
        this.c = maritalStatusActivity;
    }

    public void b(Object obj) {
        String string;
        MaritalStatusActivity maritalStatusActivity;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 9) + ((i2 & 9) << 1);
        b = i3 % 128;
        Object obj2 = null;
        try {
            if (i3 % 2 == 0) {
                ProgressDialog progressDialog = this.c.ak;
                throw null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            ProgressDialog progressDialog2 = this.c.ak;
            int i4 = a;
            int i5 = i4 & 35;
            int i6 = (((i4 ^ 35) | i5) << 1) - ((i4 | 35) & (~i5));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                progressDialog2.dismiss();
                jSONObject.getString("result");
                throw null;
            }
            progressDialog2.dismiss();
            String string2 = jSONObject.getString("result");
            byte[] bArrB = b.b(this.c.az.k());
            int i7 = b;
            int i8 = ((i7 ^ 3) | (i7 & 3)) << 1;
            int i9 = -(((~i7) & 3) | (i7 & (-4)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                b.b(this.c.az.m());
                obj2.hashCode();
                throw null;
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string2, bArrB, b.b(this.c.az.m())));
            int i11 = a;
            int i12 = i11 & 109;
            int i13 = -(-(i11 | 109));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                string = jSONObject2.getString("message");
                maritalStatusActivity = this.c;
                int i15 = 27 / 0;
            } else {
                string = jSONObject2.getString("message");
                maritalStatusActivity = this.c;
            }
            int i16 = b;
            int i17 = (i16 & (-102)) | ((~i16) & 101);
            int i18 = -(-((i16 & 101) << 1));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            Toast.makeText(maritalStatusActivity, string, 0).show();
            if (string.contains("Updated")) {
                int i21 = (-2) - ((a + 96) ^ (-1));
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    this.c.onBackPressed();
                    return;
                } else {
                    this.c.onBackPressed();
                    obj2.hashCode();
                    throw null;
                }
            }
            int i22 = a;
            int i23 = i22 & 1;
            int i24 = -(-((i22 ^ 1) | i23));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
        } catch (JSONException unused) {
        }
    }
}
