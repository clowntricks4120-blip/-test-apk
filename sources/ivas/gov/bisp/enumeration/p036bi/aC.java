package ivas.gov.bisp.enumeration.p036bi;

import android.widget.Button;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aC implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ SimConfirmationActivity c;

    public aC(SimConfirmationActivity simConfirmationActivity) {
        this.c = simConfirmationActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-80)) | ((~i2) & 79)) - (~((i2 & 79) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.D.setVisibility(8);
        int i5 = b;
        int i6 = (i5 ^ 123) + ((i5 & 123) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.w.setEnabled(false);
        } else {
            this.c.w.setEnabled(true);
        }
        SimConfirmationActivity simConfirmationActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i7 = b;
        int i8 = (i7 & (-102)) | ((~i7) & 101);
        int i9 = (i7 & 101) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        simConfirmationActivity.t("Submission failed", errorMessage);
        String lowerCase = responseMessage.getErrorMessage().toLowerCase();
        int i12 = a;
        int i13 = (i12 & 43) + (i12 | 43);
        b = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            lowerCase.contains("session");
            throw null;
        }
        if (lowerCase.contains("session")) {
            int i14 = b;
            int i15 = i14 & 121;
            int i16 = i14 | 121;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            a = i17 % 128;
            if (i17 % 2 != 0) {
                this.c.v();
                obj.hashCode();
                throw null;
            }
            this.c.v();
        }
        int i18 = (-2) - ((b + 46) ^ (-1));
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        SimConfirmationActivity simConfirmationActivity;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 & 74) + (i2 | 74)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.w.setEnabled(true);
        this.c.D.setVisibility(8);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        int i5 = a;
        int i6 = (((i5 ^ 49) | (i5 & 49)) << 1) - (((~i5) & 49) | (i5 & (-50)));
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (jSONObjectOptJSONObject == null) {
            Toast.makeText(this.c, "Invalid server response", 0).show();
            int i8 = a;
            int i9 = ((i8 | 117) << 1) - (i8 ^ 117);
            b = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        int i11 = (((i7 | 64) << 1) - (i7 ^ 64)) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
        String strOptString = jSONObjectOptJSONObject.optString("message", "Success");
        if (!strOptString.equals("Data Saved Successfully")) {
            this.c.t("Response", strOptString);
            SimConfirmationActivity simConfirmationActivity2 = this.c;
            int i13 = b;
            int i14 = i13 & 87;
            int i15 = (i13 | 87) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            simConfirmationActivity2.z.setVisibility(8);
            SimConfirmationActivity simConfirmationActivity3 = this.c;
            int i19 = b;
            int i20 = (((i19 ^ 43) | (i19 & 43)) << 1) - (((~i19) & 43) | (i19 & (-44)));
            a = i20 % 128;
            int i21 = i20 % 2;
            simConfirmationActivity3.t.setText(BuildConfig.FLAVOR);
            SimConfirmationActivity simConfirmationActivity4 = this.c;
            int i22 = b + 56;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                simConfirmationActivity4.s.setText(BuildConfig.FLAVOR);
                simConfirmationActivity = this.c;
                int i24 = 67 / 0;
            } else {
                simConfirmationActivity4.s.setText(BuildConfig.FLAVOR);
                simConfirmationActivity = this.c;
            }
            int i25 = a;
            int i26 = i25 & 91;
            int i27 = (i25 ^ 91) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                simConfirmationActivity.u.setText(BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            simConfirmationActivity.u.setText(BuildConfig.FLAVOR);
            SimConfirmationActivity simConfirmationActivity5 = this.c;
            int i29 = a;
            int i30 = (i29 & 111) + (i29 | 111);
            b = i30 % 128;
            if (i30 % 2 == 0) {
                simConfirmationActivity5.x.setEnabled(true);
            } else {
                simConfirmationActivity5.x.setEnabled(false);
            }
            this.c.w.setEnabled(false);
            int i31 = a + 39;
            b = i31 % 128;
            if (i31 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i32 = a;
        int i33 = i32 & 107;
        int i34 = (i32 | 107) & (~i33);
        int i35 = -(-(i33 << 1));
        int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
        b = i36 % 128;
        if (i36 % 2 == 0) {
            this.c.t("Success", strOptString);
            obj.hashCode();
            throw null;
        }
        this.c.t("Success", strOptString);
        this.c.z.setVisibility(8);
        SimConfirmationActivity simConfirmationActivity6 = this.c;
        int i37 = a;
        int i38 = (i37 ^ 31) + ((i37 & 31) << 1);
        b = i38 % 128;
        if (i38 % 2 == 0) {
            simConfirmationActivity6.t.setText(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        simConfirmationActivity6.t.setText(BuildConfig.FLAVOR);
        SimConfirmationActivity simConfirmationActivity7 = this.c;
        int i39 = (-2) - ((a + 92) ^ (-1));
        b = i39 % 128;
        if (i39 % 2 == 0) {
            simConfirmationActivity7.s.setText(BuildConfig.FLAVOR);
            throw null;
        }
        simConfirmationActivity7.s.setText(BuildConfig.FLAVOR);
        SimConfirmationActivity simConfirmationActivity8 = this.c;
        int i40 = a;
        int i41 = (i40 & 89) + (i40 | 89);
        b = i41 % 128;
        int i42 = i41 % 2;
        simConfirmationActivity8.u.setText(BuildConfig.FLAVOR);
        SimConfirmationActivity simConfirmationActivity9 = this.c;
        int i43 = a;
        int i44 = i43 & 115;
        int i45 = ((i43 ^ 115) | i44) << 1;
        int i46 = -((i43 | 115) & (~i44));
        int i47 = (i45 & i46) + (i46 | i45);
        b = i47 % 128;
        if (i47 % 2 == 0) {
            simConfirmationActivity9.x.setEnabled(true);
        } else {
            simConfirmationActivity9.x.setEnabled(false);
        }
        Button button = this.c.w;
        int i48 = a;
        int i49 = i48 & 105;
        int i50 = -(-((i48 ^ 105) | i49));
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        b = i51 % 128;
        int i52 = i51 % 2;
        button.setEnabled(false);
        int i53 = a;
        int i54 = i53 & 111;
        int i55 = (i53 ^ 111) | i54;
        int i56 = (i54 & i55) + (i55 | i54);
        b = i56 % 128;
        if (i56 % 2 == 0) {
            throw null;
        }
    }
}
