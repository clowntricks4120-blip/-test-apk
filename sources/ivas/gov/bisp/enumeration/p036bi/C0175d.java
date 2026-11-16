package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.DiscrepancyRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0175d implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DiscrepancyRosterListActivity c;

    public C0175d(DiscrepancyRosterListActivity discrepancyRosterListActivity) {
        this.c = discrepancyRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 108) << 1) - (i2 ^ 108)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ax.b(this.c.ac);
        int i5 = a;
        int i6 = i5 ^ 61;
        int i7 = ((((i5 & 61) | i6) << 1) - (~(-i6))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        DiscrepancyRosterListActivity discrepancyRosterListActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        boolean zIsLogout = responseMessage.isLogout();
        int i9 = b;
        int i10 = i9 & 71;
        int i11 = (i9 ^ 71) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        af.b(discrepancyRosterListActivity, errorMessage, zIsLogout);
        int i14 = b;
        int i15 = i14 & 89;
        int i16 = (i15 - (~(-(-((i14 ^ 89) | i15))))) - 1;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = (((i2 ^ 69) | i3) << 1) - ((i2 | 69) & (~i3));
        b = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                ax.b(this.c.ac);
                throw null;
            }
            ax.b(this.c.ac);
            int i5 = a;
            int i6 = (((i5 ^ 111) | (i5 & 111)) << 1) - (((~i5) & 111) | (i5 & (-112)));
            b = i6 % 128;
            int i7 = i6 % 2;
            String string = jSONObject.getString("result");
            SessionManager sessionManager = this.c.ad;
            int i8 = a;
            int i9 = i8 & 75;
            int i10 = -(-(i8 | 75));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            byte[] bArrB = b.b(sessionManager.k());
            DiscrepancyRosterListActivity discrepancyRosterListActivity = this.c;
            int i13 = a;
            int i14 = ((i13 | 59) << 1) - (i13 ^ 59);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                b.b(discrepancyRosterListActivity.ad.m());
                throw null;
            }
            String strC = b.c(string, bArrB, b.b(discrepancyRosterListActivity.ad.m()));
            JSONObject jSONObject2 = new JSONObject(strC);
            int i15 = b;
            int i16 = i15 & 9;
            int i17 = ((i15 ^ 9) | i16) << 1;
            int i18 = -((i15 | 9) & (~i16));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            if (jSONObject2.getInt("status") == 4) {
                int i21 = a;
                int i22 = ((i21 | 91) << 1) - (i21 ^ 91);
                b = i22 % 128;
                if (i22 % 2 == 0) {
                    DiscrepancyRosterListActivity.u(this.c, strC);
                    throw null;
                }
                DiscrepancyRosterListActivity.u(this.c, strC);
                int i23 = a;
                int i24 = (i23 ^ 125) + ((i23 & 125) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
                return;
            }
            DiscrepancyRosterListActivity discrepancyRosterListActivity2 = this.c;
            ArrayList<RosterItem> arrayList = new ArrayList<>();
            int i26 = b;
            int i27 = ((i26 | 13) << 1) - (i26 ^ 13);
            a = i27 % 128;
            int i28 = i27 % 2;
            discrepancyRosterListActivity2.aj = arrayList;
            DiscrepancyRosterListActivity discrepancyRosterListActivity3 = this.c;
            BISPApplication bISPApplication = discrepancyRosterListActivity3.ag;
            ArrayList<RosterItem> arrayList2 = discrepancyRosterListActivity3.aj;
            int i29 = (-2) - ((a + 106) ^ (-1));
            b = i29 % 128;
            if (i29 % 2 != 0) {
                bISPApplication.N = arrayList2;
            } else {
                bISPApplication.N = arrayList2;
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}
