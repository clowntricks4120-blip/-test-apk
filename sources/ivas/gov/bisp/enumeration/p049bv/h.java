package ivas.gov.bisp.enumeration.p049bv;

import android.widget.ProgressBar;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public h(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        ProgressBar progressBar;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 69;
        int i5 = (i3 | 69) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            progressBar = this.c.al;
            i = 63;
        } else {
            progressBar = this.c.al;
            i = 8;
        }
        progressBar.setVisibility(i);
        ActivityEnumeratorMain activityEnumeratorMain = this.c;
        int i8 = (-2) - ((a + 78) ^ (-1));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            Toast.makeText(activityEnumeratorMain, "Failed to fetch operators", 1).show();
        } else {
            Toast.makeText(activityEnumeratorMain, "Failed to fetch operators", 0).show();
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = (i2 | 85) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.al.setVisibility(8);
        int i8 = b + 43;
        a = i8 % 128;
        int i9 = i8 % 2;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("operators");
            if (jSONArrayOptJSONArray != null) {
                int i10 = a;
                int i11 = (i10 & 109) + (i10 | 109);
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    ActivityEnumeratorMain.v(this.c, jSONArrayOptJSONArray);
                    return;
                }
                ActivityEnumeratorMain.v(this.c, jSONArrayOptJSONArray);
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
            Toast.makeText(this.c, "Invalid server response", 0).show();
        }
        int i12 = b;
        int i13 = (((i12 | 10) << 1) - (i12 ^ 10)) - 1;
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 48 / 0;
        }
    }
}
