package ivas.gov.bisp.enumeration.p036bi;

import android.app.ProgressDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0154af implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyActivity c;

    public C0154af(DiscrepancyActivity discrepancyActivity) {
        this.c = discrepancyActivity;
    }

    public void b(Object obj) {
        JSONObject jSONObject;
        ProgressDialog progressDialog;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = (i2 | 49) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            jSONObject = (JSONObject) obj;
            progressDialog = this.c.an;
            int i7 = 49 / 0;
        } else {
            jSONObject = (JSONObject) obj;
            progressDialog = this.c.an;
        }
        progressDialog.dismiss();
        try {
            String string = jSONObject.getString("result");
            int i8 = a;
            int i9 = i8 & 47;
            int i10 = (((i8 ^ 47) | i9) << 1) - ((i8 | 47) & (~i9));
            b = i10 % 128;
            int i11 = i10 % 2;
            byte[] bArrB = b.b(this.c.at.k());
            int i12 = a;
            int i13 = (i12 & 43) + (i12 | 43);
            b = i13 % 128;
            int i14 = i13 % 2;
            JSONObject jSONObject2 = new JSONObject(b.c(string, bArrB, b.b(this.c.at.m())));
            int i15 = b + 37;
            a = i15 % 128;
            int i16 = i15 % 2;
            boolean zEqualsIgnoreCase = jSONObject2.getString("message").equalsIgnoreCase("Record deleted");
            Object obj2 = null;
            if (!zEqualsIgnoreCase) {
                Toast.makeText(this.c, "Please try again", 0).show();
                int i17 = b;
                int i18 = (i17 & 47) + (i17 | 47);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
            int i19 = a;
            int i20 = i19 & 61;
            int i21 = -(-((i19 ^ 61) | i20));
            int i22 = (i20 & i21) + (i21 | i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            Toast.makeText(this.c, "Discrepancy Resolved Successfully", 0).show();
            int i24 = b;
            int i25 = ((i24 | 119) << 1) - (i24 ^ 119);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }
}
