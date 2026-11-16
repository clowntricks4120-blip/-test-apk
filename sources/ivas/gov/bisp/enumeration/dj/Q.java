package ivas.gov.bisp.enumeration.dj;

import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Q implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ PasswordResetActivity c;

    public Q(PasswordResetActivity passwordResetActivity) {
        this.c = passwordResetActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = -(-((i2 ^ 51) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            PasswordResetActivity passwordResetActivity = this.c;
            Pattern pattern = PasswordResetActivity.s;
            passwordResetActivity.v(true);
        } else {
            PasswordResetActivity passwordResetActivity2 = this.c;
            Pattern pattern2 = PasswordResetActivity.s;
            passwordResetActivity2.v(false);
        }
        int i6 = b;
        int i7 = i6 ^ 111;
        int i8 = ((((i6 & 111) | i7) << 1) - (~(-i7))) - 1;
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.c.t();
            this.c.u();
            throw null;
        }
        this.c.t();
        this.c.u();
        PasswordResetActivity passwordResetActivity3 = this.c;
        StringBuilder sbW = j.w("Server Error: ");
        sbW.append(responseMessage.getErrorMessage());
        int i9 = a + 111;
        b = i9 % 128;
        int i10 = i9 % 2;
        PasswordResetActivity.q(passwordResetActivity3, sbW.toString());
        int i11 = b;
        int i12 = i11 & 7;
        int i13 = (i11 ^ 7) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 38) + (i2 | 38)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            PasswordResetActivity passwordResetActivity = this.c;
            Pattern pattern = PasswordResetActivity.s;
            passwordResetActivity.v(true);
        } else {
            PasswordResetActivity passwordResetActivity2 = this.c;
            Pattern pattern2 = PasswordResetActivity.s;
            passwordResetActivity2.v(false);
        }
        try {
            String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
            if (!jSONObject.optBoolean("status", false)) {
                int i4 = a;
                int i5 = i4 & 99;
                int i6 = -(-((i4 ^ 99) | i5));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                b = i7 % 128;
                Object obj = null;
                if (i7 % 2 != 0) {
                    strOptString.equalsIgnoreCase("Password Updated");
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!strOptString.equalsIgnoreCase("Password Updated") && (!strOptString.toLowerCase().contains("updated successfully"))) {
                    this.c.t();
                    PasswordResetActivity passwordResetActivity3 = this.c;
                    int i8 = a;
                    int i9 = i8 & 55;
                    int i10 = (((i8 ^ 55) | i9) << 1) - ((i8 | 55) & (~i9));
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        passwordResetActivity3.u();
                        strOptString.isEmpty();
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    passwordResetActivity3.u();
                    PasswordResetActivity passwordResetActivity4 = this.c;
                    if (strOptString.isEmpty()) {
                        strOptString = "Password could not be updated. Invalid OTP or request.";
                        int i11 = a + 93;
                        b = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    PasswordResetActivity.q(passwordResetActivity4, strOptString);
                    int i13 = a;
                    int i14 = (i13 & 91) + (i13 | 91);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    return;
                }
            }
            int i16 = a;
            int i17 = i16 & 95;
            int i18 = (i16 ^ 95) | i17;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            int i22 = i20 ^ 51;
            int i23 = ((i20 & 51) | i22) << 1;
            int i24 = -i22;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            a = i25 % 128;
            int i26 = i25 % 2;
            PasswordResetActivity passwordResetActivity5 = this.c;
            if (strOptString.isEmpty()) {
                int i27 = a;
                int i28 = i27 & 103;
                int i29 = ((i27 ^ 103) | i28) << 1;
                int i30 = -((i27 | 103) & (~i28));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 38 / 0;
                }
                strOptString = "Password Updated Successfully!";
            }
            PasswordResetActivity.o(passwordResetActivity5, strOptString);
            int i33 = a;
            int i34 = (i33 ^ 20) + ((i33 & 20) << 1);
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            b = i35 % 128;
            int i36 = i35 % 2;
        } catch (Exception unused) {
        }
    }
}
