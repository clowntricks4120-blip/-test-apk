package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.UpdateSplittingRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;

/* JADX INFO: loaded from: classes.dex */
public class aS implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateSplittingRosterListActivity c;

    public aS(UpdateSplittingRosterListActivity updateSplittingRosterListActivity) {
        this.c = updateSplittingRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 71;
        int i4 = (((i2 & 71) | i3) << 1) - i3;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            this.c.ac.dismiss();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c.ac.dismiss();
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i5 = b + 57;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r1.getInt("status") == 4) goto L23;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p036bi.aS.onSuccess(org.json.JSONObject):void");
    }
}
