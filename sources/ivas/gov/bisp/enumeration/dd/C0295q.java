package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateDisablilityRosterListActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dd.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0295q implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ UpdateDisablilityRosterListActivity c;

    public C0295q(UpdateDisablilityRosterListActivity updateDisablilityRosterListActivity) {
        this.c = updateDisablilityRosterListActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        String errorMessage;
        boolean zIsLogout;
        int i = 2 % 2;
        int i2 = b + 105;
        a = i2 % 128;
        int i3 = i2 % 2;
        ax.b(this.c.ac);
        int i4 = b;
        int i5 = (i4 & 7) + (i4 | 7);
        a = i5 % 128;
        int i6 = i5 % 2;
        UpdateDisablilityRosterListActivity updateDisablilityRosterListActivity = this.c;
        if (i6 == 0) {
            errorMessage = responseMessage.getErrorMessage();
            zIsLogout = responseMessage.isLogout();
            int i7 = 25 / 0;
        } else {
            errorMessage = responseMessage.getErrorMessage();
            zIsLogout = responseMessage.isLogout();
        }
        af.b(updateDisablilityRosterListActivity, errorMessage, zIsLogout);
        int i8 = a + 89;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r1.getInt("status") == 4) goto L29;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dd.C0295q.onSuccess(org.json.JSONObject):void");
    }
}
