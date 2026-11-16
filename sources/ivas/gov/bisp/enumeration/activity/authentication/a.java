package ivas.gov.bisp.enumeration.activity.authentication;

import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.aE;

/* JADX INFO: loaded from: classes.dex */
public class a implements aE {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ Authentication c;

    public a(Authentication authentication) {
        this.c = authentication;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 37) + (i2 | 37);
        a = i3 % 128;
        int i4 = i3 % 2;
        Authentication authentication = this.c;
        int i5 = Authentication.ac;
        authentication.U.dismiss();
        int i6 = a;
        int i7 = i6 & 23;
        int i8 = ((i6 ^ 23) | i7) << 1;
        int i9 = -((i6 | 23) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i11 = b;
        int i12 = i11 & 97;
        int i13 = -(-((i11 ^ 97) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0131, code lost:
    
        if ((!ivas.gov.bisp.enumeration.bK.ag.g(r14.getString("addressLibraryCallTime", net.sqlcipher.BuildConfig.FLAVOR), true)) != false) goto L36;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.aE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r14) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.authentication.a.onSuccess(org.json.JSONObject):void");
    }
}
