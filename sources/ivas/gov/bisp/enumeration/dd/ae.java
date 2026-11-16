package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ae implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateRosterListActivity c;

    public ae(UpdateRosterListActivity updateRosterListActivity) {
        this.c = updateRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = (i3 - (~((i2 ^ 1) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.c.ac.dismiss();
        UpdateRosterListActivity updateRosterListActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i6 = a;
        int i7 = i6 & 91;
        int i8 = (i6 ^ 91) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        af.b(updateRosterListActivity, errorMessage, responseMessage.isLogout());
        int i11 = a;
        int i12 = i11 & 67;
        int i13 = i12 + ((i11 ^ 67) | i12);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a + 107;
        b = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.c.ac.dismiss();
                jSONObject.getString("result");
                throw null;
            }
            this.c.ac.dismiss();
            try {
                String string = jSONObject.getString("result");
                String strK = this.c.ad.k();
                int i3 = b;
                int i4 = i3 ^ 97;
                int i5 = ((i3 & 97) | i4) << 1;
                int i6 = -i4;
                int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                a = i7 % 128;
                if (i7 % 2 != 0) {
                    b.b(strK);
                    SessionManager sessionManager = this.c.ad;
                    obj.hashCode();
                    throw null;
                }
                String strC = b.c(string, b.b(strK), b.b(this.c.ad.m()));
                JSONObject jSONObject2 = new JSONObject(strC);
                int i8 = a;
                int i9 = (i8 ^ 25) + ((i8 & 25) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                if (jSONObject2.getInt("status") == 4) {
                    int i11 = a;
                    int i12 = ((i11 | 101) << 1) - (((~i11) & 101) | (i11 & (-102)));
                    b = i12 % 128;
                    if (i12 % 2 == 0) {
                        UpdateRosterListActivity.u(this.c, strC);
                        int i13 = 26 / 0;
                    } else {
                        UpdateRosterListActivity.u(this.c, strC);
                    }
                    int i14 = b;
                    int i15 = i14 ^ 83;
                    int i16 = (i14 & 83) << 1;
                    int i17 = (i15 & i16) + (i16 | i15);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    return;
                }
                UpdateRosterListActivity updateRosterListActivity = this.c;
                ArrayList<RosterItem> arrayList = new ArrayList<>();
                int i19 = b;
                int i20 = (((i19 | 44) << 1) - (i19 ^ 44)) - 1;
                a = i20 % 128;
                int i21 = i20 % 2;
                updateRosterListActivity.ak = arrayList;
                UpdateRosterListActivity updateRosterListActivity2 = this.c;
                BISPApplication bISPApplication = updateRosterListActivity2.ag;
                int i22 = a + 63;
                b = i22 % 128;
                int i23 = i22 % 2;
                bISPApplication.N = updateRosterListActivity2.ak;
                int i24 = b;
                int i25 = i24 ^ 111;
                int i26 = ((i24 & 111) | i25) << 1;
                int i27 = -i25;
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                a = i28 % 128;
                int i29 = i28 % 2;
            } catch (NumberFormatException | IllegalArgumentException e) {
                throw e;
            }
        } catch (JSONException unused) {
        }
    }
}
