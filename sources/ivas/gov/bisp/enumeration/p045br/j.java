package ivas.gov.bisp.enumeration.p045br;

import ivas.gov.bisp.enumeration.activity.updatecnic.activity.UpdateCNICActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;

/* JADX INFO: loaded from: classes.dex */
public class j implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateCNICActivity c;

    public j(UpdateCNICActivity updateCNICActivity) {
        this.c = updateCNICActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (((i2 | 115) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        ax.b(this.c.ad);
        UpdateCNICActivity updateCNICActivity = this.c;
        int i6 = b;
        int i7 = ((((i6 ^ 115) | (i6 & 115)) << 1) - (~(-(((~i6) & 115) | (i6 & (-116)))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        af.b(updateCNICActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i9 = a + 87;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r1.getInt("status") == 4) goto L17;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p045br.j.onSuccess(org.json.JSONObject):void");
    }
}
