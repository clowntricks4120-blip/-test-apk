package ivas.gov.bisp.enumeration.activity.authentication;

import android.app.Activity;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p091n.j;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ProgressBar c;
    public final /* synthetic */ AppCompatButton d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ androidx.appcompat.app.b f;
    public final /* synthetic */ JSONObject g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Authentication.OooOo00 j;

    public e(Authentication.OooOo00 oooOo00, ProgressBar progressBar, AppCompatButton appCompatButton, Activity activity, androidx.appcompat.app.b bVar, String str, JSONObject jSONObject, int i) {
        this.j = oooOo00;
        this.c = progressBar;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = (~i3) & (i2 | 69);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        this.d = appCompatButton;
        this.e = activity;
        if (i7 != 0) {
            throw null;
        }
        int i8 = i2 & 51;
        int i9 = (i2 ^ 51) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            this.f = bVar;
            this.h = str;
            int i11 = 0 / 0;
        } else {
            this.f = bVar;
            this.h = str;
        }
        this.g = jSONObject;
        this.i = i;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = ((i2 ^ 1) | i3) << 1;
        int i5 = -((~i3) & (i2 | 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            int i8 = ((i2 | 15) << 1) - (i2 ^ 15);
            a = i8 % 128;
            int i9 = i8 % 2;
            progressBar.setVisibility(8);
            int i10 = a;
            int i11 = i10 & 55;
            int i12 = (i11 - (~(-(-((i10 ^ 55) | i11))))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        AppCompatButton appCompatButton = this.d;
        if (appCompatButton != null) {
            int i14 = b;
            int i15 = i14 & 33;
            int i16 = i15 + ((i14 ^ 33) | i15);
            a = i16 % 128;
            int i17 = i16 % 2;
            appCompatButton.setEnabled(true);
            int i18 = a;
            int i19 = (i18 & (-54)) | ((~i18) & 53);
            int i20 = (i18 & 53) << 1;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            b = i21 % 128;
            int i22 = i21 % 2;
        }
        Activity activity = this.e;
        StringBuilder sbW = j.w("Send OTP Error: ");
        String errorMessage = responseMessage.getErrorMessage();
        int i23 = b;
        int i24 = i23 & 73;
        int i25 = (((i23 | 73) & (~i24)) - (~(i24 << 1))) - 1;
        a = i25 % 128;
        int i26 = i25 % 2;
        sbW.append(errorMessage);
        String string = sbW.toString();
        boolean zIsLogout = responseMessage.isLogout();
        int i27 = b;
        int i28 = (i27 & 69) + (i27 | 69);
        a = i28 % 128;
        Object obj = null;
        if (i28 % 2 != 0) {
            af.b(activity, string, zIsLogout);
            obj.hashCode();
            throw null;
        }
        af.b(activity, string, zIsLogout);
        int i29 = a;
        int i30 = (i29 & 13) + (i29 | 13);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 51) << 1;
        int i4 = -(i2 ^ 51);
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            int i8 = i6 + 109;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                progressBar.setVisibility(113);
            } else {
                progressBar.setVisibility(8);
            }
            int i9 = b;
            int i10 = (i9 & 103) + (i9 | 103);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        AppCompatButton appCompatButton = this.d;
        if (appCompatButton != null) {
            int i12 = a;
            int i13 = i12 & 21;
            int i14 = (i12 ^ 21) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                appCompatButton.setEnabled(true);
            } else {
                appCompatButton.setEnabled(true);
            }
            int i16 = b;
            int i17 = i16 & 57;
            int i18 = i17 + ((i16 ^ 57) | i17);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        try {
            boolean zOptBoolean = jSONObject.optBoolean("status", false);
            int i20 = b;
            int i21 = (i20 & 103) + (i20 | 103);
            a = i21 % 128;
            Object obj = null;
            if (i21 % 2 != 0) {
                jSONObject.optString("message", BuildConfig.FLAVOR);
                throw null;
            }
            String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
            if (!zOptBoolean) {
                af.b(this.e, strOptString, false);
                int i22 = a + 5;
                b = i22 % 128;
                int i23 = i22 % 2;
                return;
            }
            String strOptString2 = jSONObject.optString("transaction_id", BuildConfig.FLAVOR);
            Activity activity = this.e;
            int i24 = a;
            int i25 = i24 & 31;
            int i26 = (i24 | 31) & (~i25);
            int i27 = -(-(i25 << 1));
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                Toast.makeText(activity, strOptString, 1).show();
            } else {
                Toast.makeText(activity, strOptString, 0).show();
            }
            androidx.appcompat.app.b bVar = this.f;
            if (bVar != null) {
                int i29 = a;
                int i30 = (i29 & (-18)) | ((~i29) & 17);
                int i31 = -(-((i29 & 17) << 1));
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                b = i32 % 128;
                if (i32 % 2 == 0) {
                    bVar.isShowing();
                    obj.hashCode();
                    throw null;
                }
                if (bVar.isShowing()) {
                    int i33 = b;
                    int i34 = i33 & 105;
                    int i35 = (((i33 | 105) & (~i34)) - (~(i34 << 1))) - 1;
                    a = i35 % 128;
                    if (i35 % 2 != 0) {
                        this.f.dismiss();
                        throw null;
                    }
                    this.f.dismiss();
                }
            }
            Authentication.OooOo00 oooOo00 = this.j;
            String str = this.h;
            JSONObject jSONObject2 = this.g;
            int i36 = a;
            int i37 = ((i36 | 121) << 1) - (i36 ^ 121);
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = jSONObject2.getInt("userID");
            int i40 = this.i;
            JSONObject jSONObject3 = this.g;
            int i41 = a;
            int i42 = (i41 & (-122)) | ((~i41) & 121);
            int i43 = (i41 & 121) << 1;
            int i44 = (i42 & i43) + (i43 | i42);
            b = i44 % 128;
            if (i44 % 2 != 0) {
                Authentication.OooOo00.e(oooOo00, str, strOptString2, i39, i40, jSONObject3, this.e);
            } else {
                Authentication.OooOo00.e(oooOo00, str, strOptString2, i39, i40, jSONObject3, this.e);
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
