package ivas.gov.bisp.enumeration.dd;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.CnicActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class M implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ CnicActivity c;

    public M(CnicActivity cnicActivity) {
        this.c = cnicActivity;
    }

    public void b(Object obj) throws Exception {
        byte[] bArrB;
        SessionManager sessionManager;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 47) + (i2 | 47);
        b = i3 % 128;
        Object obj2 = null;
        try {
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                this.c.ai.dismiss();
                int i4 = b;
                int i5 = i4 & 55;
                int i6 = ((i4 ^ 55) | i5) << 1;
                int i7 = -((i4 | 55) & (~i5));
                int i8 = (i6 & i7) + (i7 | i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                String string = jSONObject.getString("result");
                SessionManager sessionManager2 = this.c.ax;
                int i10 = a + 27;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    bArrB = b.b(sessionManager2.k());
                    sessionManager = this.c.ax;
                    int i11 = 54 / 0;
                } else {
                    bArrB = b.b(sessionManager2.k());
                    sessionManager = this.c.ax;
                }
                JSONObject jSONObject2 = new JSONObject(b.c(string, bArrB, b.b(sessionManager.m())));
                int i12 = b;
                int i13 = (i12 & (-72)) | ((~i12) & 71);
                int i14 = -(-((i12 & 71) << 1));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    jSONObject2.getString("message").contains("Updated");
                    throw null;
                }
                if (jSONObject2.getString("message").contains("Updated")) {
                    int i16 = a;
                    int i17 = i16 ^ 75;
                    int i18 = (i16 & 75) << 1;
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    b = i19 % 128;
                    (i19 % 2 != 0 ? Toast.makeText(this.c, "Roster CNIC is Updated", 1) : Toast.makeText(this.c, "Roster CNIC is Updated", 0)).show();
                    int i20 = b;
                    int i21 = i20 & 105;
                    int i22 = ((i20 ^ 105) | i21) << 1;
                    int i23 = -((i20 | 105) & (~i21));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    a = i24 % 128;
                    if (i24 % 2 == 0) {
                        this.c.onBackPressed();
                        obj2.hashCode();
                        throw null;
                    }
                    this.c.onBackPressed();
                    int i25 = a + 66;
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    return;
                }
                int i28 = b + 47;
                a = i28 % 128;
                int i29 = i28 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (JSONException unused) {
        }
    }
}
