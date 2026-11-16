package ivas.gov.bisp.enumeration.p036bi;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Log;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.CnicValidationActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Q implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ CnicValidationActivity c;

    public Q(CnicValidationActivity cnicValidationActivity) {
        this.c = cnicValidationActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 51) << 1;
        int i4 = -(((~i2) & 51) | (i2 & (-52)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        this.c.U.setEnabled(true);
        CnicValidationActivity cnicValidationActivity = this.c;
        int i7 = a;
        int i8 = (i7 & 7) + (i7 | 7);
        b = i8 % 128;
        int i9 = i8 % 2;
        StringBuilder sbW = j.w(BuildConfig.FLAVOR);
        sbW.append(responseMessage.getErrorMessage());
        int i10 = b;
        int i11 = i10 & 7;
        int i12 = -(-(i10 | 7));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        int i14 = i13 % 2;
        ax.f(cnicValidationActivity, "Alert", sbW.toString());
        ProgressDialog progressDialog = this.c.af;
        int i15 = b;
        int i16 = (((i15 ^ 33) | (i15 & 33)) << 1) - (((~i15) & 33) | (i15 & (-34)));
        a = i16 % 128;
        if (i16 % 2 == 0) {
            ax.b(progressDialog);
        } else {
            ax.b(progressDialog);
            int i17 = 48 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        SessionManager sessionManager;
        SharedPreferences sharedPreferences;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = i2 | 71;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.c.U.setEnabled(true);
            ax.b(this.c.af);
        } else {
            this.c.U.setEnabled(true);
            ax.b(this.c.af);
        }
        try {
            String string = jSONObject.getString("result");
            int i6 = a;
            int i7 = (i6 ^ 1) + ((i6 & 1) << 1);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                b.b(this.c.ag.k());
                this.c.ag.m();
                obj.hashCode();
                throw null;
            }
            try {
                String string2 = new JSONObject(b.c(string, b.b(this.c.ag.k()), b.b(this.c.ag.m()))).getString("time");
                CnicValidationActivity cnicValidationActivity = this.c;
                int i8 = a;
                int i9 = i8 & 103;
                int i10 = -(-((i8 ^ 103) | i9));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                ivas.gov.bisp.enumeration.de.j.bJI bji = (ivas.gov.bisp.enumeration.de.j.bJI) ((ivas.gov.bisp.enumeration.de.j) cnicValidationActivity.ag.h(cnicValidationActivity.ab)).edit();
                bji.putString("surveyStartTime", string2);
                bji.apply();
                StringBuilder sb = new StringBuilder();
                sb.append("requestServerTime: ");
                int i13 = b;
                int i14 = i13 & 5;
                int i15 = -(-((i13 ^ 5) | i14));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    sb.append(string2);
                    Log.e("CnicValidationActivity", sb.toString());
                    sessionManager = this.c.ag;
                    int i17 = 15 / 0;
                } else {
                    sb.append(string2);
                    Log.e("CnicValidationActivity", sb.toString());
                    sessionManager = this.c.ag;
                }
                int i18 = b;
                int i19 = i18 & 61;
                int i20 = i19 + ((i18 ^ 61) | i19);
                a = i20 % 128;
                int i21 = i20 % 2;
                String string3 = sessionManager.c.getString("morningTime", "08:00");
                SharedPreferences sharedPreferences2 = this.c.ag.c;
                int i22 = b;
                int i23 = i22 & 79;
                int i24 = i23 + ((i22 ^ 79) | i23);
                a = i24 % 128;
                int i25 = i24 % 2;
                if (!ag.i(string2, string3, sharedPreferences2.getString("eveningTime", "05:00"), false)) {
                    int i26 = a;
                    int i27 = (i26 ^ 107) + ((i26 & 107) << 1);
                    b = i27 % 128;
                    if (i27 % 2 == 0) {
                        this.c.getResources();
                        obj.hashCode();
                        throw null;
                    }
                    CnicValidationActivity cnicValidationActivity2 = this.c;
                    String string4 = cnicValidationActivity2.getResources().getString(R.string.consent_message_heading);
                    Resources resources = this.c.getResources();
                    int i28 = b;
                    int i29 = i28 & 7;
                    int i30 = ((i28 | 7) & (~i29)) + (i29 << 1);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    CnicValidationActivity.q(cnicValidationActivity2, string4, resources.getString(R.string.consent_message));
                    int i32 = b + 65;
                    a = i32 % 128;
                    if (i32 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                CnicValidationActivity cnicValidationActivity3 = this.c;
                StringBuilder sb2 = new StringBuilder();
                int i33 = a;
                int i34 = i33 & 125;
                int i35 = i34 + ((i33 ^ 125) | i34);
                b = i35 % 128;
                int i36 = i35 % 2;
                sb2.append("You can not search CNIC after ");
                SessionManager sessionManager2 = this.c.ag;
                int i37 = a;
                int i38 = ((i37 | 59) << 1) - (i37 ^ 59);
                b = i38 % 128;
                int i39 = i38 % 2;
                String string5 = sessionManager2.c.getString("eveningTime", "05:00");
                int i40 = a;
                int i41 = i40 & 95;
                int i42 = i41 + ((i40 ^ 95) | i41);
                b = i42 % 128;
                int i43 = i42 % 2;
                sb2.append(string5);
                sb2.append(" PM and before ");
                int i44 = b;
                int i45 = i44 & 11;
                int i46 = -(-((i44 ^ 11) | i45));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                a = i47 % 128;
                if (i47 % 2 != 0) {
                    sharedPreferences = this.c.ag.c;
                    int i48 = 70 / 0;
                } else {
                    sharedPreferences = this.c.ag.c;
                }
                sb2.append(sharedPreferences.getString("morningTime", "08:00"));
                int i49 = b;
                int i50 = i49 ^ 59;
                int i51 = ((i49 & 59) | i50) << 1;
                int i52 = -i50;
                int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
                a = i53 % 128;
                int i54 = i53 % 2;
                sb2.append(" AM.");
                String string6 = sb2.toString();
                int i55 = b;
                int i56 = ((i55 | 61) << 1) - (i55 ^ 61);
                a = i56 % 128;
                int i57 = i56 % 2;
                Toast.makeText(cnicValidationActivity3, string6, 1).show();
                int i58 = b + 71;
                a = i58 % 128;
                if (i58 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (JSONException e) {
                CnicValidationActivity cnicValidationActivity4 = this.c;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Time Parse Exception ");
                sb3.append(e.getMessage());
                ax.f(cnicValidationActivity4, "Alert", sb3.toString());
            }
        } catch (Exception e2) {
            CnicValidationActivity cnicValidationActivity5 = this.c;
            StringBuilder sbW = j.w("Exception ");
            sbW.append(e2.getMessage());
            ax.f(cnicValidationActivity5, "Alert", sbW.toString());
        }
    }
}
