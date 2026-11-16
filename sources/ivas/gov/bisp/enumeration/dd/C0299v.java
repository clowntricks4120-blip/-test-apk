package ivas.gov.bisp.enumeration.dd;

import android.app.ProgressDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.GenderActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0299v implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ GenderActivity c;

    public C0299v(GenderActivity genderActivity) {
        this.c = genderActivity;
    }

    public void b(Object obj) {
        byte[] bArrB;
        String string;
        Toast toastMakeText;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 66) << 1) - (i2 ^ 66)) - 1;
        a = i3 % 128;
        Object obj2 = null;
        try {
            if (i3 % 2 == 0) {
                ProgressDialog progressDialog = this.c.ad;
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                this.c.ad.dismiss();
                String string2 = jSONObject.getString("result");
                GenderActivity genderActivity = this.c;
                int i4 = (-2) - ((b + 14) ^ (-1));
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    bArrB = b.b(genderActivity.ac.k());
                    int i5 = 43 / 0;
                } else {
                    bArrB = b.b(genderActivity.ac.k());
                }
                int i6 = (-2) - ((b + 48) ^ (-1));
                a = i6 % 128;
                int i7 = i6 % 2;
                JSONObject jSONObject2 = new JSONObject(b.c(string2, bArrB, b.b(this.c.ac.m())));
                int i8 = b;
                int i9 = i8 & 65;
                int i10 = (i8 ^ 65) | i9;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    string = jSONObject2.getString("message");
                    toastMakeText = Toast.makeText(this.c, string, 1);
                } else {
                    string = jSONObject2.getString("message");
                    toastMakeText = Toast.makeText(this.c, string, 0);
                }
                toastMakeText.show();
                if (string.contains("Updated")) {
                    int i12 = b;
                    int i13 = ((i12 | 11) << 1) - (i12 ^ 11);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        this.c.onBackPressed();
                        int i14 = 98 / 0;
                    } else {
                        this.c.onBackPressed();
                    }
                    int i15 = b;
                    int i16 = i15 & 113;
                    int i17 = -(-((i15 ^ 113) | i16));
                    int i18 = (i16 & i17) + (i17 | i16);
                    a = i18 % 128;
                    if (i18 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i19 = b + 17;
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 92 / 0;
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        } catch (JSONException unused) {
        }
    }
}
