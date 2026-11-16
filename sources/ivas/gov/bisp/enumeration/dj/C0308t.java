package ivas.gov.bisp.enumeration.dj;

import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dj.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0308t implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ChangePasswordActivity c;

    public C0308t(ChangePasswordActivity changePasswordActivity) {
        this.c = changePasswordActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        ChangePasswordActivity changePasswordActivity;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = ((i2 ^ 103) | i3) << 1;
        int i5 = -((i2 | 103) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ChangePasswordActivity changePasswordActivity2 = this.c;
        Pattern pattern = ChangePasswordActivity.r;
        changePasswordActivity2.w(false);
        int i8 = a + 109;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            this.c.v();
            this.c.u();
            changePasswordActivity = this.c;
            int i9 = 32 / 0;
        } else {
            this.c.v();
            this.c.u();
            changePasswordActivity = this.c;
        }
        int i10 = b;
        int i11 = i10 & 51;
        int i12 = (i10 | 51) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        StringBuilder sbW = j.w("Password Reset Failed: ");
        sbW.append(responseMessage.getErrorMessage());
        int i16 = b;
        int i17 = (i16 | 75) << 1;
        int i18 = -(i16 ^ 75);
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        ChangePasswordActivity.q(changePasswordActivity, sbW.toString());
        int i21 = b;
        int i22 = i21 & 101;
        int i23 = (((i21 | 101) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
        a = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = (i3 - (~((i2 ^ 33) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ChangePasswordActivity changePasswordActivity = this.c;
            Pattern pattern = ChangePasswordActivity.r;
            changePasswordActivity.w(true);
        } else {
            ChangePasswordActivity changePasswordActivity2 = this.c;
            Pattern pattern2 = ChangePasswordActivity.r;
            changePasswordActivity2.w(false);
        }
        try {
            String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
            Object obj = null;
            if (!jSONObject.optBoolean("status", false)) {
                int i5 = a;
                int i6 = i5 & 51;
                int i7 = -(-((i5 ^ 51) | i6));
                int i8 = (i6 & i7) + (i7 | i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                if (!strOptString.equalsIgnoreCase("Password Updated")) {
                    int i10 = a + 73;
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        strOptString.toLowerCase().contains("updated successfully");
                        throw null;
                    }
                    if (!strOptString.toLowerCase().contains("updated successfully")) {
                        this.c.v();
                        ChangePasswordActivity changePasswordActivity3 = this.c;
                        int i11 = a;
                        int i12 = i11 & 45;
                        int i13 = (((i11 ^ 45) | i12) << 1) - ((i11 | 45) & (~i12));
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        changePasswordActivity3.u();
                        ChangePasswordActivity changePasswordActivity4 = this.c;
                        if (strOptString.isEmpty()) {
                            int i15 = b;
                            int i16 = i15 & 3;
                            int i17 = (i16 - (~((i15 ^ 3) | i16))) - 1;
                            a = i17 % 128;
                            if (i17 % 2 == 0) {
                                throw null;
                            }
                            int i18 = (i15 ^ 19) + ((i15 & 19) << 1);
                            a = i18 % 128;
                            int i19 = i18 % 2;
                            strOptString = "Password could not be updated. Invalid OTP or request.";
                        }
                        ChangePasswordActivity.q(changePasswordActivity4, strOptString);
                        int i20 = b;
                        int i21 = (i20 & (-70)) | ((~i20) & 69);
                        int i22 = -(-((i20 & 69) << 1));
                        int i23 = (i21 & i22) + (i22 | i21);
                        a = i23 % 128;
                        if (i23 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            int i24 = a;
            int i25 = (i24 ^ 59) + ((i24 & 59) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            int i27 = (i24 & 33) + (i24 | 33);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                strOptString.isEmpty();
                obj.hashCode();
                throw null;
            }
            ChangePasswordActivity changePasswordActivity5 = this.c;
            if (strOptString.isEmpty()) {
                int i28 = a;
                int i29 = (i28 & (-122)) | ((~i28) & 121);
                int i30 = -(-((i28 & 121) << 1));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    throw null;
                }
                strOptString = "Password Updated Successfully!";
            }
            ChangePasswordActivity.o(changePasswordActivity5, strOptString);
            int i32 = b;
            int i33 = i32 & 115;
            int i34 = ((i32 | 115) & (~i33)) + (i33 << 1);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }
}
