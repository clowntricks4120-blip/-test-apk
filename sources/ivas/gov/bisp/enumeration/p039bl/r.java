package ivas.gov.bisp.enumeration.p039bl;

import android.app.ProgressDialog;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Authentication c;

    public r(Authentication authentication) {
        this.c = authentication;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = i3 + ((i2 ^ 97) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        Authentication authentication = this.c;
        int i6 = Authentication.ac;
        ProgressDialog progressDialog = authentication.U;
        int i7 = a;
        int i8 = ((i7 ^ 34) + ((i7 & 34) << 1)) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            progressDialog.dismiss();
            responseMessage.getErrorMessage();
            responseMessage.isLogout();
            throw null;
        }
        progressDialog.dismiss();
        Authentication authentication2 = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        boolean zIsLogout = responseMessage.isLogout();
        int i9 = a;
        int i10 = i9 ^ 79;
        int i11 = (((i9 & 79) | i10) << 1) - i10;
        b = i11 % 128;
        int i12 = i11 % 2;
        af.b(authentication2, errorMessage, zIsLogout);
        int i13 = b;
        int i14 = ((i13 & 5) - (~(i13 | 5))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 75 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (i3 - (~(-(-((i2 ^ 51) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        try {
            int i6 = jSONObject.getInt("statusCode");
            jSONObject.getString("message");
            int i7 = a;
            int i8 = i7 & 15;
            int i9 = -(-((i7 ^ 15) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0 ? i6 == 200 : i6 == 20339) {
                Authentication.v(this.c);
                int i11 = b;
                int i12 = i11 & 41;
                int i13 = ((i11 ^ 41) | i12) << 1;
                int i14 = -((i11 | 41) & (~i12));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                a = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            Authentication authentication = this.c;
            int i17 = Authentication.ac;
            authentication.U.dismiss();
            int i18 = a;
            int i19 = ((i18 | 65) << 1) - (i18 ^ 65);
            b = i19 % 128;
            Toast.makeText(i19 % 2 != 0 ? this.c : this.c, "Kindly try again! Your login failed.", 1).show();
            int i20 = a;
            int i21 = ((i20 | 65) << 1) - (i20 ^ 65);
            b = i21 % 128;
            int i22 = i21 % 2;
        } catch (JSONException unused) {
            Authentication authentication2 = this.c;
            int i23 = Authentication.ac;
            authentication2.U.dismiss();
        }
    }
}
