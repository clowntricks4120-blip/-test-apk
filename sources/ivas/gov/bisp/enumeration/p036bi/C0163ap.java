package ivas.gov.bisp.enumeration.p036bi;

import ivas.gov.bisp.enumeration.activity.DuplicateCnic;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bi.ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0163ap implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DuplicateCnic c;

    public C0163ap(DuplicateCnic duplicateCnic) {
        this.c = duplicateCnic;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b + 123;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.c.ac.dismiss();
            obj.hashCode();
            throw null;
        }
        this.c.ac.dismiss();
        int i3 = a;
        int i4 = (i3 | 51) << 1;
        int i5 = -(i3 ^ 51);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            responseMessage.getErrorMessage();
            responseMessage.isLogout();
            obj.hashCode();
            throw null;
        }
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i7 = b;
        int i8 = ((i7 & 79) - (~(i7 | 79))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r1.getInt("status") == 4) goto L28;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p036bi.C0163ap.onSuccess(org.json.JSONObject):void");
    }
}
