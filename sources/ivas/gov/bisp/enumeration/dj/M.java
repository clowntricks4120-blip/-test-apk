package ivas.gov.bisp.enumeration.dj;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.otp.OtpVerificationActivity;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p091n.j;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class M implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OtpVerificationActivity c;

    public M(OtpVerificationActivity otpVerificationActivity) {
        this.c = otpVerificationActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 123;
        int i4 = (((i2 & 123) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        OtpVerificationActivity otpVerificationActivity = this.c;
        OtpVerificationActivity.OooO0O0 oooO0O0 = OtpVerificationActivity.r;
        int i6 = b;
        int i7 = ((((i6 ^ 29) | (i6 & 29)) << 1) - (~(-(((~i6) & 29) | (i6 & (-30)))))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            otpVerificationActivity.s(false);
            j.w("Failed to resend: ");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        otpVerificationActivity.s(false);
        OtpVerificationActivity otpVerificationActivity2 = this.c;
        StringBuilder sbW = j.w("Failed to resend: ");
        sbW.append(responseMessage.getErrorMessage());
        int i8 = a;
        int i9 = (i8 & 15) + (i8 | 15);
        b = i9 % 128;
        int i10 = i9 % 2;
        Toast.makeText(otpVerificationActivity2, sbW.toString(), 1).show();
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 108) + (i2 | 108)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        OtpVerificationActivity otpVerificationActivity = this.c;
        OtpVerificationActivity.OooO0O0 oooO0O0 = OtpVerificationActivity.r;
        otpVerificationActivity.s(false);
        int i5 = b;
        int i6 = i5 & 115;
        int i7 = (i5 ^ 115) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        try {
            boolean zOptBoolean = jSONObject.optBoolean("status", false);
            String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
            int i10 = b;
            int i11 = (i10 | 99) << 1;
            int i12 = -((i10 & (-100)) | ((~i10) & 99));
            int i13 = (i11 & i12) + (i11 | i12);
            a = i13 % 128;
            int i14 = i13 % 2;
            Object obj = null;
            if (!zOptBoolean) {
                Toast.makeText(this.c, strOptString, 1).show();
                int i15 = b;
                int i16 = i15 & 27;
                int i17 = -(-((i15 ^ 27) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i19 = (i10 & (-42)) | ((~i10) & 41);
            int i20 = (i10 & 41) << 1;
            int i21 = (i19 & i20) + (i19 | i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            OtpVerificationActivity otpVerificationActivity2 = this.c;
            String strOptString2 = jSONObject.optString("transaction_id", BuildConfig.FLAVOR);
            int i23 = b + 39;
            a = i23 % 128;
            int i24 = i23 % 2;
            otpVerificationActivity2.D = strOptString2;
            Toast.makeText(this.c, strOptString, 0).show();
            int i25 = a;
            int i26 = (i25 ^ 5) + ((i25 & 5) << 1);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                OtpVerificationActivity.o(this.c);
                throw null;
            }
            OtpVerificationActivity.o(this.c);
            this.c.p(60000L);
            int i27 = a;
            int i28 = (i27 & 55) + (i27 | 55);
            b = i28 % 128;
            if (i28 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
