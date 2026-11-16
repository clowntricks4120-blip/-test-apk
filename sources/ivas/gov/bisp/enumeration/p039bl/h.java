package ivas.gov.bisp.enumeration.p039bl;

import android.content.Intent;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.SurveyTimeLimits;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ Authentication c;

    public h(Authentication authentication) {
        this.c = authentication;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a + 17;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Authentication authentication = this.c;
            int i3 = Authentication.ac;
            ax.b(authentication.U);
            int i4 = 51 / 0;
        } else {
            Authentication authentication2 = this.c;
            int i5 = Authentication.ac;
            ax.b(authentication2.U);
        }
        try {
            String string = jSONObject.getString("result");
            SessionManager sessionManager = this.c.T;
            int i6 = b;
            int i7 = ((i6 ^ 31) | (i6 & 31)) << 1;
            int i8 = -(((~i6) & 31) | (i6 & (-32)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            byte[] bArrB = b.b(sessionManager.k());
            Authentication authentication3 = this.c;
            int i11 = a;
            int i12 = ((i11 ^ 11) | (i11 & 11)) << 1;
            int i13 = -(((~i11) & 11) | (i11 & (-12)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            try {
                ag.n((SurveyTimeLimits) new C().f(b.c(string, bArrB, b.b(authentication3.T.m())), SurveyTimeLimits.class));
                Authentication authentication4 = this.c;
                Intent intent = new Intent(this.c, (Class<?>) ActivityEnumeratorMain.class);
                int i16 = a;
                int i17 = i16 & 59;
                int i18 = (i16 | 59) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    authentication4.startActivity(intent);
                    this.c.finish();
                } else {
                    authentication4.startActivity(intent);
                    this.c.finish();
                    int i21 = 32 / 0;
                }
            } catch (Exception e) {
                Authentication authentication5 = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Time Parse Exception ");
                sb.append(e.getMessage());
                ax.f(authentication5, "Alert", sb.toString());
            }
        } catch (Exception e2) {
            Authentication authentication6 = this.c;
            StringBuilder sbW = j.w("Exception ");
            sbW.append(e2.getMessage());
            ax.f(authentication6, "Alert", sbW.toString());
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = -(-(i2 | 63));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            j.w(BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        Authentication authentication = this.c;
        StringBuilder sbW = j.w(BuildConfig.FLAVOR);
        sbW.append(responseMessage.getErrorMessage());
        int i6 = a;
        int i7 = (i6 ^ 71) + ((i6 & 71) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        ax.f(authentication, "Alert", sbW.toString());
        Authentication authentication2 = this.c;
        int i9 = a;
        int i10 = i9 & 105;
        int i11 = -(-(i9 | 105));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = Authentication.ac;
            ax.b(authentication2.U);
        } else {
            int i14 = Authentication.ac;
            ax.b(authentication2.U);
            obj.hashCode();
            throw null;
        }
    }
}
