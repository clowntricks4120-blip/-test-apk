package ivas.gov.bisp.enumeration.otp;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.activity.authentication.f;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ OtpVerificationActivity c;

    public j(OtpVerificationActivity otpVerificationActivity) {
        this.c = otpVerificationActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 31) | (i2 & 31)) << 1) - (((~i2) & 31) | (i2 & (-32)));
        a = i3 % 128;
        int i4 = i3 % 2;
        OtpVerificationActivity otpVerificationActivity = this.c;
        OtpVerificationActivity.OooO0O0 oooO0O0 = OtpVerificationActivity.r;
        otpVerificationActivity.s(false);
        int i5 = a;
        int i6 = i5 & 113;
        int i7 = ((i5 ^ 113) | i6) << 1;
        int i8 = -((i5 | 113) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        this.c.r();
        OtpVerificationActivity.o(this.c);
        OtpVerificationActivity otpVerificationActivity2 = this.c;
        int i11 = b;
        int i12 = (i11 & 81) + (i11 | 81);
        a = i12 % 128;
        int i13 = i12 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Verification failed: ");
        sbW.append(responseMessage.getErrorMessage());
        int i14 = b;
        int i15 = (((i14 ^ 21) | (i14 & 21)) << 1) - (((~i14) & 21) | (i14 & (-22)));
        a = i15 % 128;
        int i16 = i15 % 2;
        Toast.makeText(otpVerificationActivity2, sbW.toString(), 1).show();
        int i17 = a;
        int i18 = (((i17 | 18) << 1) - (i17 ^ 18)) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[Catch: Exception -> 0x0114, PHI: r9
  0x007e: PHI (r9v28 ivas.gov.bisp.enumeration.otp.OtpVerificationActivity$OooO0O0) = 
  (r9v27 ivas.gov.bisp.enumeration.otp.OtpVerificationActivity$OooO0O0)
  (r9v38 ivas.gov.bisp.enumeration.otp.OtpVerificationActivity$OooO0O0)
 binds: [B:25:0x007c, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0114, blocks: (B:7:0x0020, B:9:0x0036, B:14:0x0052, B:15:0x0054, B:20:0x0072, B:30:0x00af, B:26:0x007e, B:28:0x009d, B:24:0x007a, B:16:0x005c, B:33:0x00be, B:36:0x00dd, B:39:0x00fa, B:44:0x010e, B:45:0x0111), top: B:51:0x0020 }] */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        OtpVerificationActivity.OooO0O0 oooO0O0;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 112) << 1) - (i2 ^ 112)) - 1;
        b = i3 % 128;
        OtpVerificationActivity otpVerificationActivity = i3 % 2 == 0 ? this.c : this.c;
        OtpVerificationActivity.OooO0O0 oooO0O1 = OtpVerificationActivity.r;
        otpVerificationActivity.s(false);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("status", false);
            int i4 = b;
            int i5 = (i4 & 71) + (i4 | 71);
            a = i5 % 128;
            int i6 = i5 % 2;
            String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
            if (!zOptBoolean) {
                this.c.r();
                OtpVerificationActivity.o(this.c);
                int i7 = b;
                int i8 = i7 ^ 75;
                int i9 = ((i7 & 75) | i8) << 1;
                int i10 = -i8;
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    strOptString.isEmpty();
                    throw null;
                }
                OtpVerificationActivity otpVerificationActivity2 = this.c;
                if (strOptString.isEmpty()) {
                    int i12 = a;
                    int i13 = (((i12 & (-34)) | ((~i12) & 33)) - (~((i12 & 33) << 1))) - 1;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    strOptString = "Incorrect OTP Code. Please re-enter.";
                }
                Toast.makeText(otpVerificationActivity2, strOptString, 1).show();
                int i15 = b + 69;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int i16 = a;
            int i17 = i16 & 103;
            int i18 = (i17 - (~(-(-((i16 ^ 103) | i17))))) - 1;
            b = i18 % 128;
            Toast.makeText(i18 % 2 == 0 ? this.c : this.c, "OTP Verified Successfully!", 0).show();
            int i19 = a;
            int i20 = ((i19 & (-78)) | ((~i19) & 77)) + ((i19 & 77) << 1);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                oooO0O0 = OtpVerificationActivity.r;
                int i21 = 17 / 0;
                if (oooO0O0 != null) {
                    f fVar = (f) oooO0O0;
                    Toast.makeText(fVar.a, "OTP Verified! Completing login...", 0).show();
                    int i22 = a;
                    int i23 = i22 & 67;
                    int i24 = (i22 ^ 67) | i23;
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    Authentication.OooOo00.d(fVar.c, fVar.b);
                    OtpVerificationActivity.r = null;
                    int i27 = a + 119;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
            } else {
                oooO0O0 = OtpVerificationActivity.r;
                if (oooO0O0 != null) {
                    f fVar2 = (f) oooO0O0;
                    Toast.makeText(fVar2.a, "OTP Verified! Completing login...", 0).show();
                    int i29 = a;
                    int i210 = i29 & 67;
                    int i211 = (i29 ^ 67) | i210;
                    int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                    b = i212 % 128;
                    int i213 = i212 % 2;
                    Authentication.OooOo00.d(fVar2.c, fVar2.b);
                    OtpVerificationActivity.r = null;
                    int i214 = a + 119;
                    b = i214 % 128;
                    int i215 = i214 % 2;
                }
            }
            this.c.finish();
            int i30 = a + 87;
            b = i30 % 128;
            int i31 = i30 % 2;
        } catch (Exception unused) {
        }
    }
}
