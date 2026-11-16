package ivas.gov.bisp.enumeration.p036bi;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aV implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ SimConfirmationActivity c;

    public aV(SimConfirmationActivity simConfirmationActivity) {
        this.c = simConfirmationActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 3;
        int i4 = ((i2 & 3) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.x.setEnabled(true);
        SimConfirmationActivity simConfirmationActivity = this.c;
        int i8 = a;
        int i9 = i8 & 59;
        int i10 = i9 + ((i8 ^ 59) | i9);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            simConfirmationActivity.D.setVisibility(38);
        } else {
            simConfirmationActivity.D.setVisibility(8);
        }
        this.c.z.setVisibility(8);
        SimConfirmationActivity simConfirmationActivity2 = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i11 = a + 121;
        b = i11 % 128;
        int i12 = i11 % 2;
        Toast.makeText(simConfirmationActivity2, errorMessage, 0).show();
        String lowerCase = responseMessage.getErrorMessage().toLowerCase();
        int i13 = a;
        int i14 = ((i13 | 37) << 1) - (i13 ^ 37);
        b = i14 % 128;
        Object obj = null;
        if (i14 % 2 != 0) {
            lowerCase.contains("session");
            throw null;
        }
        if (lowerCase.contains("session")) {
            int i15 = a + 115;
            b = i15 % 128;
            int i16 = i15 % 2;
            this.c.v();
            int i17 = b;
            int i18 = ((i17 & 109) - (~(i17 | 109))) - 1;
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = i20 & 77;
        int i22 = ((i20 ^ 77) | i21) << 1;
        int i23 = -((i20 | 77) & (~i21));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01a1  */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 105) | (i2 & 105)) << 1;
        int i4 = -(((~i2) & 105) | (i2 & (-106)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        (i5 % 2 != 0 ? this.c.x : this.c.x).setEnabled(true);
        this.c.D.setVisibility(8);
        String strOptString = jSONObject.optString("isBene", BuildConfig.FLAVOR);
        int i6 = b;
        int i7 = (-2) - (((i6 & 2) + (i6 | 2)) ^ (-1));
        int i8 = i7 % 128;
        a = i8;
        Object obj = null;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (strOptString != null) {
            int i9 = ((i8 ^ 57) | (i8 & 57)) << 1;
            int i10 = -(((~i8) & 57) | (i8 & (-58)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (strOptString.trim().isEmpty()) {
                this.c.z.setVisibility(8);
                int i13 = b;
                int i14 = (-2) - (((i13 ^ 72) + ((i13 & 72) << 1)) ^ (-1));
                a = i14 % 128;
                int i15 = i14 % 2;
                this.c.t("Warning", "No Data Found");
                int i16 = a;
                int i17 = i16 & 5;
                int i18 = i17 + ((i16 ^ 5) | i17);
                b = i18 % 128;
                int i19 = i18 % 2;
            } else {
                int i20 = a + 119;
                b = i20 % 128;
                int i21 = i20 % 2;
                if (strOptString.equalsIgnoreCase("null")) {
                    this.c.z.setVisibility(8);
                    int i110 = b;
                    int i111 = (-2) - (((i110 ^ 72) + ((i110 & 72) << 1)) ^ (-1));
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    this.c.t("Warning", "No Data Found");
                    int i113 = a;
                    int i114 = i113 & 5;
                    int i115 = i114 + ((i113 ^ 5) | i114);
                    b = i115 % 128;
                    int i116 = i115 % 2;
                } else {
                    int i22 = b;
                    int i23 = (i22 ^ 115) + ((i22 & 115) << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    if (!(!strOptString.equalsIgnoreCase("yes"))) {
                        int i25 = a;
                        int i26 = i25 & 119;
                        int i27 = ((i25 | 119) & (~i26)) + (i26 << 1);
                        b = i27 % 128;
                        int i28 = i27 % 2;
                        this.c.z.setVisibility(0);
                        int i29 = a;
                        int i30 = ((i29 ^ 62) + ((i29 & 62) << 1)) - 1;
                        b = i30 % 128;
                        if (i30 % 2 != 0) {
                            Toast.makeText(this.c, "Please enter sim data", 1).show();
                        } else {
                            Toast.makeText(this.c, "Please enter sim data", 0).show();
                        }
                        int i31 = b;
                        int i32 = i31 & 119;
                        int i33 = (i31 | 119) & (~i32);
                        int i34 = i32 << 1;
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                        SimConfirmationActivity simConfirmationActivity = this.c;
                        String strOptString2 = jSONObject.optString("uniqueHhId", BuildConfig.FLAVOR);
                        int i37 = a;
                        int i38 = i37 ^ 1;
                        int i39 = ((i37 & 1) | i38) << 1;
                        int i40 = -i38;
                        int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                        b = i41 % 128;
                        if (i41 % 2 == 0) {
                            simConfirmationActivity.K = strOptString2;
                            return;
                        } else {
                            simConfirmationActivity.K = strOptString2;
                            int i42 = 82 / 0;
                            return;
                        }
                    }
                    if (!(!strOptString.equalsIgnoreCase("no"))) {
                        int i43 = a;
                        int i44 = i43 & 49;
                        int i45 = (i43 | 49) & (~i44);
                        int i46 = i44 << 1;
                        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                        b = i47 % 128;
                        int i48 = i47 % 2;
                        this.c.z.setVisibility(8);
                        int i49 = b;
                        int i50 = (i49 | 45) << 1;
                        int i51 = -(((~i49) & 45) | (i49 & (-46)));
                        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                        a = i52 % 128;
                        if (i52 % 2 != 0) {
                            this.c.t("Warning", "Respondent is not a beneficiary");
                            return;
                        } else {
                            this.c.t("Warning", "Respondent is not a beneficiary");
                            throw null;
                        }
                    }
                    if (!(!strOptString.equalsIgnoreCase("Beneficiary Already Existed"))) {
                        int i53 = a;
                        int i54 = i53 & 27;
                        int i55 = -(-((i53 ^ 27) | i54));
                        int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                        b = i56 % 128;
                        if (i56 % 2 != 0) {
                            this.c.z.setVisibility(38);
                        } else {
                            this.c.z.setVisibility(8);
                        }
                        this.c.t("Warning", "Beneficiary Already Existed");
                        int i57 = b;
                        int i58 = i57 & 9;
                        int i59 = (i57 ^ 9) | i58;
                        int i60 = (i58 & i59) + (i59 | i58);
                        a = i60 % 128;
                        int i61 = i60 % 2;
                        return;
                    }
                }
            }
        } else {
            this.c.z.setVisibility(8);
            int i117 = b;
            int i118 = (-2) - (((i117 ^ 72) + ((i117 & 72) << 1)) ^ (-1));
            a = i118 % 128;
            int i119 = i118 % 2;
            this.c.t("Warning", "No Data Found");
            int i1110 = a;
            int i1111 = i1110 & 5;
            int i1112 = i1111 + ((i1110 ^ 5) | i1111);
            b = i1112 % 128;
            int i1113 = i1112 % 2;
        }
        int i62 = a;
        int i63 = (i62 ^ 79) + ((i62 & 79) << 1);
        b = i63 % 128;
        int i64 = i63 % 2;
    }
}
