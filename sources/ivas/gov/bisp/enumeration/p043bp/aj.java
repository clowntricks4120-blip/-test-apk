package ivas.gov.bisp.enumeration.p043bp;

import ivas.gov.bisp.enumeration.SplashScreen;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p091n.j;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class aj implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ SplashScreen c;

    public aj(SplashScreen splashScreen) {
        this.c = splashScreen;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = (i3 - (~(-(-((i2 ^ 117) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            responseMessage.getErrorMessage().toLowerCase().contains("session");
            throw null;
        }
        if (responseMessage.getErrorMessage().toLowerCase().contains("session")) {
            this.c.z();
            int i5 = a;
            int i6 = i5 & 77;
            int i7 = i6 + ((i5 ^ 77) | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            SplashScreen splashScreen = this.c;
            StringBuilder sbW = j.w(BuildConfig.FLAVOR);
            int i9 = b;
            int i10 = i9 & 115;
            int i11 = -(-((i9 ^ 115) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                sbW.append(responseMessage.getErrorMessage());
                throw null;
            }
            sbW.append(responseMessage.getErrorMessage());
            ax.f(splashScreen, "Alert", sbW.toString());
            int i13 = a;
            int i14 = (i13 & (-2)) | ((~i13) & 1);
            int i15 = -(-((i13 & 1) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        ax.b(this.c.v);
        int i18 = b;
        int i19 = (i18 ^ 89) + ((i18 & 89) << 1);
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0104, code lost:
    
        if ((!ivas.gov.bisp.enumeration.bK.ag.g(r2.getString("k_token_expiry", net.sqlcipher.BuildConfig.FLAVOR), false)) != true) goto L23;
     */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p043bp.aj.onSuccess(org.json.JSONObject):void");
    }
}
