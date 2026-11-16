package ivas.gov.bisp.enumeration.p036bi;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.NADRARosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0161an implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ NADRARosterListActivity c;

    public C0161an(NADRARosterListActivity nADRARosterListActivity) {
        this.c = nADRARosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = -(-(i2 | 83));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ax.b(this.c.ai);
        int i7 = a;
        int i8 = i7 & 53;
        int i9 = i7 | 53;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            responseMessage.getErrorMessage();
            responseMessage.isLogout();
            throw null;
        }
        NADRARosterListActivity nADRARosterListActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        boolean zIsLogout = responseMessage.isLogout();
        int i11 = b;
        int i12 = i11 & 87;
        int i13 = ((i11 ^ 87) | i12) << 1;
        int i14 = -((i11 | 87) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        af.b(nADRARosterListActivity, errorMessage, zIsLogout);
        int i17 = a;
        int i18 = ((i17 ^ 96) + ((i17 & 96) << 1)) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                ax.b(this.c.ai);
                try {
                    jSONObject.getString("result");
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            ax.b(this.c.ai);
            String string = jSONObject.getString("result");
            this.c.ak.I(string);
            int i6 = a;
            int i7 = i6 ^ 51;
            int i8 = -(-((i6 & 51) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            NADRARosterListActivity nADRARosterListActivity = this.c;
            nADRARosterListActivity.ad.u = false;
            int i11 = a;
            int i12 = ((i11 ^ 53) - (~((i11 & 53) << 1))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
            byte[] bArrB = b.b(nADRARosterListActivity.ak.k());
            NADRARosterListActivity nADRARosterListActivity2 = this.c;
            int i14 = b;
            int i15 = ((i14 & (-72)) | ((~i14) & 71)) + ((i14 & 71) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            byte[] bArrB2 = b.b(nADRARosterListActivity2.ak.m());
            int i17 = a;
            int i18 = ((i17 ^ 33) | (i17 & 33)) << 1;
            int i19 = -(((~i17) & 33) | (i17 & (-34)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            if (i20 % 2 != 0) {
                this.c.y(b.c(string, bArrB, bArrB2));
            } else {
                this.c.y(b.c(string, bArrB, bArrB2));
                int i21 = 75 / 0;
            }
        } catch (JSONException unused) {
            this.c.ai.dismiss();
            Toast.makeText(this.c, "Error : No Family Members Return", 0).show();
            Toast.makeText(this.c, "Please Enter Another CNIC", 0).show();
            ag.f = BuildConfig.FLAVOR;
        }
    }
}
