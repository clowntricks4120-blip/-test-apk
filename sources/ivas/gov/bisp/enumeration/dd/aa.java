package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateMaritalRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aa implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateMaritalRosterListActivity c;

    public aa(UpdateMaritalRosterListActivity updateMaritalRosterListActivity) {
        this.c = updateMaritalRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-76)) | ((~i2) & 75)) - (~(-(-((i2 & 75) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.c.ac.dismiss();
        UpdateMaritalRosterListActivity updateMaritalRosterListActivity = this.c;
        int i5 = b + 42;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        af.b(updateMaritalRosterListActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i8 = a;
        int i9 = ((i8 ^ 103) - (~(-(-((i8 & 103) << 1))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.ac.dismiss();
        try {
            String string = jSONObject.getString("result");
            int i7 = b;
            int i8 = i7 & 19;
            int i9 = ((i7 ^ 19) | i8) << 1;
            int i10 = -((i7 | 19) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                this.c.ad.k();
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            String strC = b.c(string, b.b(this.c.ad.k()), b.b(this.c.ad.m()));
            JSONObject jSONObject2 = new JSONObject(strC);
            int i12 = a + 55;
            b = i12 % 128;
            int i13 = i12 % 2;
            if (jSONObject2.getInt("status") == 4) {
                int i14 = b;
                int i15 = (((i14 | 111) << 1) - (~(-(((~i14) & 111) | (i14 & (-112)))))) - 1;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    UpdateMaritalRosterListActivity.u(this.c, strC);
                    return;
                } else {
                    UpdateMaritalRosterListActivity.u(this.c, strC);
                    int i16 = 33 / 0;
                    return;
                }
            }
            UpdateMaritalRosterListActivity updateMaritalRosterListActivity = this.c;
            ArrayList<RosterItem> arrayList = new ArrayList<>();
            int i17 = a;
            int i18 = i17 & 89;
            int i19 = i18 + ((i17 ^ 89) | i18);
            b = i19 % 128;
            int i20 = i19 % 2;
            updateMaritalRosterListActivity.af = arrayList;
            UpdateMaritalRosterListActivity updateMaritalRosterListActivity2 = this.c;
            BISPApplication bISPApplication = updateMaritalRosterListActivity2.ag;
            int i21 = a;
            int i22 = ((i21 ^ 45) - (~((i21 & 45) << 1))) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            bISPApplication.N = updateMaritalRosterListActivity2.af;
            int i24 = b;
            int i25 = i24 & 29;
            int i26 = -(-((i24 ^ 29) | i25));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            int i28 = i27 % 2;
        } catch (JSONException unused) {
        }
    }
}
