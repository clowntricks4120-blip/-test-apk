package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aL implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ SimConfirmationActivity c;

    public aL(SimConfirmationActivity simConfirmationActivity) {
        this.c = simConfirmationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0080  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0095  */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 61) | (i3 & 61)) << 1) - (((~i3) & 61) | (i3 & (-62)));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.D.setVisibility(123);
        } else {
            this.c.D.setVisibility(8);
        }
        SimConfirmationActivity simConfirmationActivity = this.c;
        int i5 = b;
        int i6 = (i5 & (-36)) | ((~i5) & 35);
        int i7 = (i5 & 35) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        simConfirmationActivity.t("Error", responseMessage.getErrorMessage());
        String errorMessage = responseMessage.getErrorMessage();
        int i10 = a;
        int i11 = i10 & 105;
        int i12 = -(-(i10 | 105));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        Object obj = null;
        boolean zContains = errorMessage.toLowerCase().contains("session");
        if (i14 != 0) {
            int i15 = 37 / 0;
            if (!(!zContains)) {
                int i16 = a;
                i = (i16 ^ 123) + ((i16 & 123) << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    this.c.v();
                    throw null;
                }
                this.c.v();
            }
        } else if (zContains) {
            int i17 = a;
            i = (i17 ^ 123) + ((i17 & 123) << 1);
            b = i % 128;
            if (i % 2 == 0) {
                this.c.v();
                throw null;
            }
            this.c.v();
        }
        int i18 = b;
        int i19 = i18 & 113;
        int i20 = ((i18 | 113) & (~i19)) + (i19 << 1);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        String strOptString;
        SimConfirmationActivity simConfirmationActivity;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.D.setVisibility(8);
        int i5 = b;
        int i6 = i5 & 21;
        int i7 = (i5 | 21) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            strOptString = jSONObject.optString("totalSimsRegistered", BuildConfig.FLAVOR);
            simConfirmationActivity = this.c;
            int i10 = 57 / 0;
        } else {
            strOptString = jSONObject.optString("totalSimsRegistered", BuildConfig.FLAVOR);
            simConfirmationActivity = this.c;
        }
        int i11 = b;
        int i12 = i11 & 119;
        int i13 = ((i11 | 119) & (~i12)) + (i12 << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        simConfirmationActivity.t("Total Registered SIMs (Today)", strOptString);
        int i15 = a;
        int i16 = ((i15 | 7) << 1) - (i15 ^ 7);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
