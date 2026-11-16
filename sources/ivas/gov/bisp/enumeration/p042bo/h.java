package ivas.gov.bisp.enumeration.p042bo;

import android.widget.Toast;
import ivas.gov.bisp.enumeration.activity.nadra.NewFormNadraRoster;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ NewFormNadraRoster c;

    public h(NewFormNadraRoster newFormNadraRoster) {
        this.c = newFormNadraRoster;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 53) << 1) - (i2 ^ 53);
        b = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                ax.b(this.c.as);
                jSONObject.getString("result");
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ax.b(this.c.as);
            try {
                String string = jSONObject.getString("result");
                this.c.am.I(string);
                int i4 = b;
                int i5 = i4 & 35;
                int i6 = (i4 | 35) & (~i5);
                int i7 = -(-(i5 << 1));
                int i8 = (i6 & i7) + (i6 | i7);
                a = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArrB = b.b(this.c.am.k());
                NewFormNadraRoster newFormNadraRoster = this.c;
                int i10 = b;
                int i11 = ((((i10 ^ 115) | (i10 & 115)) << 1) - (~(-(((~i10) & 115) | (i10 & (-116)))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
                String strC = b.c(string, bArrB, b.b(newFormNadraRoster.am.m()));
                int i13 = a;
                int i14 = ((i13 | 11) << 1) - (i13 ^ 11);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    this.c.w(strC);
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.c.w(strC);
                int i15 = a;
                int i16 = (i15 & 25) + (i15 | 25);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 61 / 0;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (JSONException unused) {
            Toast.makeText(this.c, "Nadra Data Exception", 1).show();
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (i3 - (~((i2 ^ 65) | i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            ax.b(this.c.as);
            throw null;
        }
        ax.b(this.c.as);
        NewFormNadraRoster newFormNadraRoster = this.c;
        int i5 = b;
        int i6 = ((i5 ^ 67) | (i5 & 67)) << 1;
        int i7 = -(((~i5) & 67) | (i5 & (-68)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        String errorMessage = responseMessage.getErrorMessage();
        boolean zIsLogout = responseMessage.isLogout();
        if (i9 == 0) {
            af.b(newFormNadraRoster, errorMessage, zIsLogout);
        } else {
            af.b(newFormNadraRoster, errorMessage, zIsLogout);
            int i10 = 81 / 0;
        }
    }
}
