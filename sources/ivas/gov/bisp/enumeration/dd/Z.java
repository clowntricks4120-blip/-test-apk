package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateDobRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;

/* JADX INFO: loaded from: classes.dex */
public class Z implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateDobRosterListActivity c;

    public Z(UpdateDobRosterListActivity updateDobRosterListActivity) {
        this.c = updateDobRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 27) | (i2 & 27)) << 1;
        int i4 = -(((~i2) & 27) | (i2 & (-28)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.ac.dismiss();
        UpdateDobRosterListActivity updateDobRosterListActivity = this.c;
        int i7 = a + 63;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            af.b(updateDobRosterListActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
            int i8 = 88 / 0;
        } else {
            af.b(updateDobRosterListActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
        }
        int i9 = a;
        int i10 = ((i9 | 41) << 1) - (i9 ^ 41);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r1.getInt("status") == 4) goto L23;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dd.Z.onSuccess(org.json.JSONObject):void");
    }
}
