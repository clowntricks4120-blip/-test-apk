package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateGenderActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;

/* JADX INFO: loaded from: classes.dex */
public class K implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateGenderActivity c;

    public K(UpdateGenderActivity updateGenderActivity) {
        this.c = updateGenderActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 87) | (i2 & 87)) << 1) - (~(-(((~i2) & 87) | (i2 & (-88)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.ac.dismiss();
        UpdateGenderActivity updateGenderActivity = this.c;
        int i5 = a;
        int i6 = (i5 & (-50)) | ((~i5) & 49);
        int i7 = (i5 & 49) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        af.b(updateGenderActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i10 = b;
        int i11 = i10 & 35;
        int i12 = (i11 - (~(-(-((i10 ^ 35) | i11))))) - 1;
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r2.getInt("status") == 4) goto L19;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dd.K.onSuccess(org.json.JSONObject):void");
    }
}
