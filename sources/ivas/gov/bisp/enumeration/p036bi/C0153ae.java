package ivas.gov.bisp.enumeration.p036bi;

import android.app.ProgressDialog;
import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0153ae implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyActivity c;

    public C0153ae(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        JSONObject jSONObject = (JSONObject) obj;
        try {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("result"));
                int i2 = a;
                int i3 = i2 & 113;
                int i4 = (i2 ^ 113) | i3;
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    jSONObject2.getString("message");
                    ProgressDialog progressDialog = this.c.an;
                    Object obj2 = null;
                    try {
                        obj2.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String string = jSONObject2.getString("message");
                this.c.an.dismiss();
                if (!string.contains("Cnic Updated")) {
                    DiscrepancyActivity.v(this.c, 1, "Warning", jSONObject.getString("message"));
                    int i6 = b;
                    int i7 = ((i6 & 31) - (~(i6 | 31))) - 1;
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 94 / 0;
                        return;
                    }
                    return;
                }
                int i9 = b + 49;
                a = i9 % 128;
                int i10 = i9 % 2;
                DiscrepancyActivity discrepancyActivity = this.c;
                discrepancyActivity.au = discrepancyActivity.ar;
                int i11 = a + 61;
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    discrepancyActivity.ag.setVisibility(102);
                } else {
                    discrepancyActivity.ag.setVisibility(8);
                }
                DiscrepancyActivity discrepancyActivity2 = this.c;
                discrepancyActivity2.ac.r = true;
                if (!discrepancyActivity2.al) {
                    int i12 = b;
                    int i13 = ((i12 ^ 14) + ((i12 & 14) << 1)) - 1;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    discrepancyActivity2.an.dismiss();
                    int i15 = a;
                    int i16 = i15 & 123;
                    int i17 = i15 | 123;
                    int i18 = (i16 & i17) + (i17 | i16);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
                DiscrepancyActivity discrepancyActivity3 = this.c;
                if (!(!discrepancyActivity3.al)) {
                    int i20 = b;
                    int i21 = i20 & 51;
                    int i22 = -(-((i20 ^ 51) | i21));
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    DiscrepancyActivity.u(discrepancyActivity3, "1");
                    int i25 = b;
                    int i26 = ((i25 & 22) + (i25 | 22)) - 1;
                    a = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 5 / 2;
                    }
                }
                DiscrepancyActivity discrepancyActivity4 = this.c;
                Intent intent = new Intent(this.c, (Class<?>) DiscrepancyRosterListActivity.class);
                int i28 = b;
                int i29 = (((i28 & (-94)) | ((~i28) & 93)) - (~(-(-((i28 & 93) << 1))))) - 1;
                a = i29 % 128;
                int i30 = i29 % 2;
                discrepancyActivity4.startActivity(intent);
                this.c.finish();
                int i31 = b;
                int i32 = i31 & 1;
                int i33 = ((i31 | 1) & (~i32)) + (i32 << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
            } catch (JSONException unused) {
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
