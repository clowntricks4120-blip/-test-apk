package ivas.gov.bisp.enumeration.p049bv;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.SurveyTimeLimits;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p091n.j;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public c(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        ActivityEnumeratorMain activityEnumeratorMain;
        StringBuilder sbW;
        String errorMessage;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 5) + (i2 | 5);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            activityEnumeratorMain = this.c;
            sbW = j.w(BuildConfig.FLAVOR);
            errorMessage = responseMessage.getErrorMessage();
            int i4 = 1 / 0;
        } else {
            activityEnumeratorMain = this.c;
            sbW = j.w(BuildConfig.FLAVOR);
            errorMessage = responseMessage.getErrorMessage();
        }
        sbW.append(errorMessage);
        ax.f(activityEnumeratorMain, "Alert", sbW.toString());
        int i5 = a;
        int i6 = ((i5 ^ 19) | (i5 & 19)) << 1;
        int i7 = -(((~i5) & 19) | (i5 & (-20)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            ax.b(this.c.ai);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ax.b(this.c.ai);
        int i9 = a;
        int i10 = i9 | 19;
        int i11 = ((i10 << 1) - (~(-((~(i9 & 19)) & i10)))) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 30 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        byte[] bArrB;
        Toast toastMakeText;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 111) + ((i2 & 111) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        ax.b(this.c.ai);
        try {
            String string = jSONObject.getString("result");
            int i5 = a;
            int i6 = ((i5 ^ 73) | (i5 & 73)) << 1;
            int i7 = -(((~i5) & 73) | (i5 & (-74)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                bArrB = b.b(this.c.aj.k());
                int i9 = 90 / 0;
            } else {
                bArrB = b.b(this.c.aj.k());
            }
            try {
                SurveyTimeLimits surveyTimeLimits = (SurveyTimeLimits) new C().f(b.c(string, bArrB, b.b(this.c.aj.m())), SurveyTimeLimits.class);
                int i10 = a;
                int i11 = ((i10 & 116) + (i10 | 116)) - 1;
                b = i11 % 128;
                if (i11 % 2 == 0) {
                    ag.n(surveyTimeLimits);
                    toastMakeText = Toast.makeText(this.c, "Screens Time Updated Successfully!", 1);
                } else {
                    ag.n(surveyTimeLimits);
                    toastMakeText = Toast.makeText(this.c, "Screens Time Updated Successfully!", 0);
                }
                toastMakeText.show();
            } catch (Exception e) {
                ActivityEnumeratorMain activityEnumeratorMain = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Time Parse Exception ");
                sb.append(e.getMessage());
                ax.f(activityEnumeratorMain, "Alert", sb.toString());
            }
        } catch (Exception e2) {
            ActivityEnumeratorMain activityEnumeratorMain2 = this.c;
            StringBuilder sbW = j.w("Exception ");
            sbW.append(e2.getMessage());
            ax.f(activityEnumeratorMain2, "Alert", sbW.toString());
        }
    }
}
