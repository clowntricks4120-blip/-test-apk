package ivas.gov.bisp.enumeration.dd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.Single_Discrepancy;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ai implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateRosterListActivity c;

    public ai(UpdateRosterListActivity updateRosterListActivity) {
        this.c = updateRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = ((i2 | 15) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.ac.isShowing();
            throw null;
        }
        if (this.c.ac.isShowing()) {
            this.c.ac.dismiss();
            int i5 = b;
            int i6 = i5 ^ 17;
            int i7 = ((((i5 & 17) | i6) << 1) - (~(-i6))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
        }
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i9 = a;
        int i10 = (((i9 | 38) << 1) - (i9 ^ 38)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = (i2 | 23) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        Object obj = null;
        try {
            if (i6 % 2 == 0) {
                this.c.ac.dismiss();
                throw null;
            }
            this.c.ac.dismiss();
            int i7 = b;
            int i8 = (((i7 | 32) << 1) - (i7 ^ 32)) - 1;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                jSONObject.getString("message").equalsIgnoreCase("PMT Updated");
                throw null;
            }
            if (!jSONObject.getString("message").equalsIgnoreCase("PMT Updated")) {
                Toast.makeText(this.c.ag, "Please try again", 0).show();
                int i9 = a;
                int i10 = i9 & 29;
                int i11 = (((i9 ^ 29) | i10) << 1) - ((i9 | 29) & (~i10));
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            SessionManager sessionManager = this.c.ad;
            SharedPreferences.Editor editor = sessionManager.d;
            int i12 = b;
            int i13 = ((i12 ^ 121) | (i12 & 121)) << 1;
            int i14 = -(((~i12) & 121) | (i12 & (-122)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                editor.putBoolean("is_nadra_added", true);
            } else {
                editor.putBoolean("is_nadra_added", false);
            }
            sessionManager.d.apply();
            UpdateRosterListActivity updateRosterListActivity = this.c;
            Intent intent = new Intent(this.c, (Class<?>) Single_Discrepancy.class);
            int i16 = a;
            int i17 = (i16 & 77) + (i16 | 77);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                updateRosterListActivity.startActivity(intent);
                this.c.finish();
            } else {
                updateRosterListActivity.startActivity(intent);
                this.c.finish();
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}
