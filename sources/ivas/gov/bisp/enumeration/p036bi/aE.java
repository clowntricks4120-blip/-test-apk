package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.view.View;
import ivas.gov.bisp.enumeration.activity.SimConfirmationActivity;
import ivas.gov.bisp.enumeration.p024ax.ax;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aE implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ SimConfirmationActivity d;

    public /* synthetic */ aE(SimConfirmationActivity simConfirmationActivity, int i) {
        this.c = i;
        this.d = simConfirmationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091 A[PHI: r1
  0x0091: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v24 java.lang.String) binds: [B:22:0x008f, B:19:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strReplaceAll;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = i3 + ((i2 ^ 51) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.c != 0) {
            int i6 = i2 & 37;
            int i7 = i6 + ((i2 ^ 37) | i6);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 3;
            }
            int i9 = ((i2 | 57) << 1) - (i2 ^ 57);
            a = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                AlertDialog alertDialog = this.d.N;
                obj.hashCode();
                throw null;
            }
            SimConfirmationActivity simConfirmationActivity = this.d;
            AlertDialog alertDialog2 = simConfirmationActivity.N;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
                simConfirmationActivity.N = null;
                int i10 = a;
                int i11 = (i10 ^ 49) + ((i10 & 49) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = b + 91;
            a = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        SimConfirmationActivity simConfirmationActivity2 = this.d;
        String string = simConfirmationActivity2.t.getText().toString();
        int i15 = a + 11;
        b = i15 % 128;
        if (i15 % 2 == 0) {
            strReplaceAll = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
            if (strReplaceAll.length() == 79) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                int i16 = b;
                int i17 = i16 | 99;
                int i18 = i17 << 1;
                int i19 = -((~(i16 & 99)) & i17);
                int i20 = (i18 & i19) + (i19 | i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                try {
                    jSONObject.put("Data", "BISP NSER Dynamic Registry");
                    jSONObject2.put("cnic", strReplaceAll);
                    int i22 = a;
                    int i23 = (i22 ^ 27) + ((i22 & 27) << 1);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    simConfirmationActivity2.x.setEnabled(false);
                    simConfirmationActivity2.D.setVisibility(0);
                    ax.e(jSONObject2, simConfirmationActivity2, "https://meladeskapp.bisp.gov.pk/api/Roster/GetBeneDataForEWallets", new aV(simConfirmationActivity2));
                    int i25 = a;
                    int i26 = i25 & 23;
                    int i27 = ((i25 | 23) & (~i26)) + (i26 << 1);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    return;
                } catch (JSONException unused) {
                }
            }
        } else {
            strReplaceAll = string.replaceAll("[^\\d]", BuildConfig.FLAVOR);
            if (strReplaceAll.length() == 13) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                int i110 = b;
                int i111 = i110 | 99;
                int i112 = i111 << 1;
                int i113 = -((~(i110 & 99)) & i111);
                int i29 = (i112 & i113) + (i113 | i112);
                a = i29 % 128;
                int i210 = i29 % 2;
                jSONObject3.put("Data", "BISP NSER Dynamic Registry");
                jSONObject4.put("cnic", strReplaceAll);
                int i211 = a;
                int i212 = (i211 ^ 27) + ((i211 & 27) << 1);
                b = i212 % 128;
                int i213 = i212 % 2;
                simConfirmationActivity2.x.setEnabled(false);
                simConfirmationActivity2.D.setVisibility(0);
                ax.e(jSONObject4, simConfirmationActivity2, "https://meladeskapp.bisp.gov.pk/api/Roster/GetBeneDataForEWallets", new aV(simConfirmationActivity2));
                int i214 = a;
                int i215 = i214 & 23;
                int i216 = ((i214 | 23) & (~i215)) + (i215 << 1);
                b = i216 % 128;
                int i217 = i216 % 2;
                return;
            }
        }
        int i30 = b;
        int i31 = (((i30 | 61) << 1) - (~(-(((~i30) & 61) | (i30 & (-62)))))) - 1;
        a = i31 % 128;
        int i32 = i31 % 2;
    }
}
