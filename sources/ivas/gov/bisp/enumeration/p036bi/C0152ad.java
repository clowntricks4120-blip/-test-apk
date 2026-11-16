package ivas.gov.bisp.enumeration.p036bi;

import android.content.Intent;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0152ad implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DiscrepancyActivity c;

    public C0152ad(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    public void b(Object obj) {
        String string;
        DiscrepancyActivity discrepancyActivity;
        int i;
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(((JSONObject) obj).getString("result"));
            int i3 = b;
            int i4 = i3 & 113;
            int i5 = -(-((i3 ^ 113) | i4));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                string = jSONObject.getString("message");
                discrepancyActivity = this.c;
                i = 1;
            } else {
                string = jSONObject.getString("message");
                discrepancyActivity = this.c;
                i = 0;
            }
            int i7 = b + 59;
            a = i7 % 128;
            int i8 = i7 % 2;
            Toast.makeText(discrepancyActivity, string, i).show();
            if (string.contains("Cnic Updated")) {
                int i9 = b;
                int i10 = i9 & 65;
                int i11 = (((i9 ^ 65) | i10) << 1) - ((i9 | 65) & (~i10));
                a = i11 % 128;
                int i12 = i11 % 2;
                DiscrepancyActivity discrepancyActivity2 = this.c;
                discrepancyActivity2.au = discrepancyActivity2.ar;
                int i13 = b;
                int i14 = ((i13 ^ 3) | (i13 & 3)) << 1;
                int i15 = -(((~i13) & 3) | (i13 & (-4)));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    discrepancyActivity2.ag.setVisibility(16);
                } else {
                    discrepancyActivity2.ag.setVisibility(8);
                }
                DiscrepancyActivity discrepancyActivity3 = this.c;
                discrepancyActivity3.ac.r = true;
                int i17 = b + 29;
                a = i17 % 128;
                Object obj2 = null;
                if (i17 % 2 == 0) {
                    boolean z = discrepancyActivity3.am;
                    obj2.hashCode();
                    throw null;
                }
                if (!discrepancyActivity3.am) {
                    discrepancyActivity3.an.dismiss();
                    int i18 = b;
                    int i19 = ((i18 | 1) << 1) - (i18 ^ 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                }
                DiscrepancyActivity discrepancyActivity4 = this.c;
                if (!(!discrepancyActivity4.am)) {
                    int i21 = b;
                    int i22 = i21 ^ 105;
                    int i23 = (i21 & 105) << 1;
                    int i24 = (i22 & i23) + (i23 | i22);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    DiscrepancyActivity.u(discrepancyActivity4, "3");
                    int i26 = b;
                    int i27 = i26 & 113;
                    int i28 = (((i26 | 113) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                }
                DiscrepancyActivity discrepancyActivity5 = this.c;
                Intent intent = new Intent(this.c, (Class<?>) DiscrepancyRosterListActivity.class);
                int i30 = a + 97;
                b = i30 % 128;
                int i31 = i30 % 2;
                discrepancyActivity5.startActivity(intent);
                this.c.finish();
                int i32 = a;
                int i33 = i32 & 3;
                int i34 = (i33 - (~((i32 ^ 3) | i33))) - 1;
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        } catch (JSONException unused) {
        }
        int i35 = b + 85;
        a = i35 % 128;
        int i36 = i35 % 2;
    }
}
