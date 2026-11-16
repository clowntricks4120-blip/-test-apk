package ivas.gov.bisp.enumeration.dd;

import android.app.ProgressDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class T implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DobActivity c;

    public T(DobActivity dobActivity) {
        this.c = dobActivity;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 69) << 1;
        int i4 = -(i2 ^ 69);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj2 = null;
        try {
            if (i5 % 2 != 0) {
                ProgressDialog progressDialog = this.c.ak;
                obj2.hashCode();
                throw null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            ProgressDialog progressDialog2 = this.c.ak;
            int i6 = a;
            int i7 = i6 & 51;
            int i8 = (i6 ^ 51) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            progressDialog2.dismiss();
            String string = jSONObject.getString("result");
            DobActivity dobActivity = this.c;
            int i11 = a;
            int i12 = i11 & 79;
            int i13 = (((i11 ^ 79) | i12) << 1) - ((i11 | 79) & (~i12));
            b = i13 % 128;
            if (i13 % 2 != 0) {
                b.b(dobActivity.aE.k());
                SessionManager sessionManager = this.c.aE;
                throw null;
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string, b.b(dobActivity.aE.k()), b.b(this.c.aE.m())));
            int i14 = b;
            int i15 = i14 & 27;
            int i16 = ((((i14 ^ 27) | i15) << 1) - (~(-((i14 | 27) & (~i15))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            String string2 = jSONObject2.getString("message");
            Toast toastMakeText = Toast.makeText(this.c, string2, 0);
            int i18 = a + 119;
            b = i18 % 128;
            int i19 = i18 % 2;
            toastMakeText.show();
            if (string2.contains("Updated")) {
                int i20 = a;
                int i21 = i20 ^ 15;
                int i22 = ((i20 & 15) | i21) << 1;
                int i23 = -i21;
                int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    this.c.onBackPressed();
                    obj2.hashCode();
                    throw null;
                }
                this.c.onBackPressed();
                int i25 = a;
                int i26 = i25 & 87;
                int i27 = ((i25 | 87) & (~i26)) + (i26 << 1);
                b = i27 % 128;
                if (i27 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
            int i28 = b;
            int i29 = i28 & 123;
            int i30 = i29 + ((i28 ^ 123) | i29);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}
