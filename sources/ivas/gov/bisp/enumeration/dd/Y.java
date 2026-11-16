package ivas.gov.bisp.enumeration.dd;

import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateDisabilityActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;

/* JADX INFO: loaded from: classes.dex */
public class Y implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateDisabilityActivity c;

    public Y(UpdateDisabilityActivity updateDisabilityActivity) {
        this.c = updateDisabilityActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        UpdateDisabilityActivity updateDisabilityActivity;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 37) | (i2 & 37)) << 1;
        int i4 = -(((~i2) & 37) | (i2 & (-38)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.c.ac.dismiss();
            updateDisabilityActivity = this.c;
            int i6 = 67 / 0;
        } else {
            this.c.ac.dismiss();
            updateDisabilityActivity = this.c;
        }
        int i7 = b + 27;
        a = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            af.b(updateDisabilityActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
            obj.hashCode();
            throw null;
        }
        af.b(updateDisabilityActivity, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i8 = a;
        int i9 = i8 ^ 109;
        int i10 = -(-((i8 & 109) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r2.getInt("status") == 4) goto L26;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dd.Y.onSuccess(org.json.JSONObject):void");
    }
}
