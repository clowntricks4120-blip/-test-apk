package ivas.gov.bisp.enumeration.p042bo;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.nadra.SelectHouseHoldActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ SelectHouseHoldActivity c;

    public e(SelectHouseHoldActivity selectHouseHoldActivity) {
        this.c = selectHouseHoldActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 123;
        int i4 = -(-((i2 & 123) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            ax.b(this.c.am);
            throw null;
        }
        ax.b(this.c.am);
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i6 = a;
        int i7 = i6 & 61;
        int i8 = i7 + ((i6 ^ 61) | i7);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 123) + ((i2 & 123) << 1);
        a = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                ax.b(this.c.am);
                try {
                    jSONObject.getString("result");
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
            ax.b(this.c.am);
            String string = jSONObject.getString("result");
            int i4 = b;
            int i5 = (i4 & 31) + (i4 | 31);
            a = i5 % 128;
            int i6 = i5 % 2;
            this.c.ao.I(string);
            SelectHouseHoldActivity selectHouseHoldActivity = this.c;
            int i7 = a;
            int i8 = i7 & 53;
            int i9 = (i7 | 53) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                b.b(selectHouseHoldActivity.ao.k());
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            byte[] bArrB = b.b(selectHouseHoldActivity.ao.k());
            SelectHouseHoldActivity selectHouseHoldActivity2 = this.c;
            int i12 = a;
            int i13 = i12 & 69;
            int i14 = (((i12 | 69) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            byte[] bArrB2 = b.b(selectHouseHoldActivity2.ao.m());
            int i16 = b;
            int i17 = i16 & 53;
            int i18 = (i16 ^ 53) | i17;
            int i19 = (i17 & i18) + (i18 | i17);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                this.c.w(b.c(string, bArrB, bArrB2));
            } else {
                this.c.w(b.c(string, bArrB, bArrB2));
                int i20 = 42 / 0;
            }
        } catch (JSONException unused) {
            Toast.makeText(this.c, "Nadra Data Exception", 1).show();
        }
    }
}
