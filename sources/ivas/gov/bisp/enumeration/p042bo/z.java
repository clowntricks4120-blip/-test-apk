package ivas.gov.bisp.enumeration.p042bo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.UpdateSplittingRosterListActivity;
import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class z implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateNadraRosterList c;

    public z(UpdateNadraRosterList updateNadraRosterList) {
        this.c = updateNadraRosterList;
    }

    public void b(Object obj) {
        int i = 2 % 2;
        int i2 = a + 38;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                ProgressDialog progressDialog = this.c.al;
                throw null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            ProgressDialog progressDialog2 = this.c.al;
            int i4 = b;
            int i5 = ((i4 ^ 121) | (i4 & 121)) << 1;
            int i6 = -(((~i4) & 121) | (i4 & (-122)));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                progressDialog2.dismiss();
                jSONObject.getString("result");
                throw null;
            }
            progressDialog2.dismiss();
            String string = jSONObject.getString("result");
            String strK = this.c.ag.k();
            int i8 = a;
            int i9 = ((i8 ^ 17) | (i8 & 17)) << 1;
            int i10 = -(((~i8) & 17) | (i8 & (-18)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                b.b(strK);
                SessionManager sessionManager = this.c.ag;
                throw null;
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string, b.b(strK), b.b(this.c.ag.m())));
            int i12 = a;
            int i13 = (((i12 & (-90)) | ((~i12) & 89)) - (~(-(-((i12 & 89) << 1))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            String string2 = jSONObject2.getString("message");
            Toast toastMakeText = Toast.makeText(this.c, string2, 0);
            int i15 = b;
            int i16 = i15 & 51;
            int i17 = (i15 | 51) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 & i18) + (i17 | i18);
            a = i19 % 128;
            int i20 = i19 % 2;
            toastMakeText.show();
            if (string2.contains("Updated")) {
                Intent intent = new Intent(this.c, (Class<?>) UpdateSplittingRosterListActivity.class);
                int i21 = a;
                int i22 = i21 & 17;
                int i23 = (i22 - (~((i21 ^ 17) | i22))) - 1;
                b = i23 % 128;
                int i24 = i23 % 2;
                this.c.startActivity(intent);
                this.c.finish();
                int i25 = a;
                int i26 = (((i25 | 13) << 1) - (~(-(((~i25) & 13) | (i25 & (-14)))))) - 1;
                b = i26 % 128;
                int i27 = i26 % 2;
                return;
            }
            int i28 = b;
            int i29 = i28 & 49;
            int i30 = ((i28 ^ 49) | i29) << 1;
            int i31 = -((i28 | 49) & (~i29));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
        } catch (JSONException unused) {
        }
    }
}
