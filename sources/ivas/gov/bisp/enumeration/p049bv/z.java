package ivas.gov.bisp.enumeration.p049bv;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.aA.aK;
import ivas.gov.bisp.enumeration.aA.aX;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.VersionResponse;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class z implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ActivityEnumeratorMain c;

    public z(ActivityEnumeratorMain activityEnumeratorMain) {
        this.c = activityEnumeratorMain;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 71) + (i2 | 71);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String lowerCase = responseMessage.getErrorMessage().toLowerCase();
        if (i4 != 0) {
            lowerCase.contains("session");
            obj.hashCode();
            throw null;
        }
        if (!(!lowerCase.contains("session"))) {
            this.c.E();
            int i5 = a;
            int i6 = i5 & 15;
            int i7 = -(-((i5 ^ 15) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            BISPApplication.c().H(false);
            aK aKVar = new aK();
            int i10 = a;
            int i11 = ((i10 & 73) - (~(-(-(i10 | 73))))) - 1;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                this.c.getString(R.string.offline_messaeg);
                throw null;
            }
            ActivityEnumeratorMain activityEnumeratorMain = this.c;
            String string = activityEnumeratorMain.getString(R.string.offline_messaeg);
            ActivityEnumeratorMain activityEnumeratorMain2 = this.c;
            Dialog dialog = new Dialog(activityEnumeratorMain);
            int i12 = a;
            int i13 = i12 & 51;
            int i14 = -(-((i12 ^ 51) | i13));
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            aKVar.a = activityEnumeratorMain2;
            dialog.requestWindowFeature(1);
            int i17 = b + 55;
            a = i17 % 128;
            int i18 = i17 % 2;
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.custom_dialog_layout);
            ((TextView) dialog.findViewById(R.id.message_textView_dialog)).setText(string);
            Button button = (Button) dialog.findViewById(R.id.survey_offline_button_dialog);
            aX aXVar = new aX(aKVar, dialog);
            int i19 = b;
            int i20 = (i19 ^ 65) + ((i19 & 65) << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                button.setOnClickListener(aXVar);
                dialog.show();
                obj.hashCode();
                throw null;
            }
            button.setOnClickListener(aXVar);
            dialog.show();
            int i21 = b;
            int i22 = i21 & 47;
            int i23 = ((i21 ^ 47) | i22) << 1;
            int i24 = -((i21 | 47) & (~i22));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            a = i25 % 128;
            int i26 = i25 % 2;
        }
        ax.b(this.c.ai);
        int i27 = a + 121;
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 62 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b + 103;
        a = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ax.b(this.c.ai);
                BISPApplication.c().H(false);
            } else {
                ax.b(this.c.ai);
                BISPApplication.c().H(true);
            }
            int i3 = a;
            int i4 = i3 ^ 39;
            int i5 = ((((i3 & 39) | i4) << 1) - (~(-i4))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            String string = jSONObject.getString("result");
            SessionManager sessionManager = this.c.aj;
            int i7 = b;
            int i8 = i7 & 15;
            int i9 = -(-(i7 | 15));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            String strC = b.c(string, b.b(sessionManager.k()), b.b(this.c.aj.m()));
            C c = new C();
            int i12 = a + 105;
            b = i12 % 128;
            Object obj = null;
            if (i12 % 2 != 0) {
                Double.parseDouble("7.6");
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            VersionResponse versionResponse = (VersionResponse) c.f(strC, VersionResponse.class);
            double d = Double.parseDouble("7.6");
            int i13 = a;
            int i14 = ((i13 ^ 92) + ((i13 & 92) << 1)) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            this.c.aj.E(versionResponse.isFingerPrintEnabled());
            int i16 = a + 7;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                versionResponse.getVersion();
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (versionResponse.getVersion() > d) {
                ax.f(this.c, "Alert", "Kindly Update app first.");
                int i17 = a;
                int i18 = (i17 & 62) + (i17 | 62);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 21 / 0;
                    return;
                }
                return;
            }
            int i21 = b;
            int i22 = i21 ^ 75;
            int i23 = (i21 & 75) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            a = i24 % 128;
            int i25 = i24 % 2;
            SharedPreferences sharedPreferences = this.c.aj.c;
            int i26 = b;
            int i27 = i26 & 35;
            int i28 = ((i26 ^ 35) | i27) << 1;
            int i29 = -((i26 | 35) & (~i27));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                sharedPreferences.getString("k_token_expiry", BuildConfig.FLAVOR);
                try {
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (ag.g(sharedPreferences.getString("k_token_expiry", BuildConfig.FLAVOR), false)) {
                this.c.E();
                int i31 = a;
                int i32 = i31 & 17;
                int i33 = (i31 | 17) & (~i32);
                int i34 = i32 << 1;
                int i35 = (i33 & i34) + (i33 | i34);
                b = i35 % 128;
                if (i35 % 2 != 0) {
                    int i36 = 14 / 0;
                    return;
                }
                return;
            }
            int i37 = a;
            int i38 = ((i37 & 30) + (i37 | 30)) - 1;
            b = i38 % 128;
            if (i38 % 2 != 0) {
                SessionManager sessionManager2 = this.c.aj;
                versionResponse.getMorningTime();
                SharedPreferences.Editor editor = sessionManager2.d;
                try {
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            SessionManager sessionManager3 = this.c.aj;
            String morningTime = versionResponse.getMorningTime();
            SharedPreferences.Editor editor2 = sessionManager3.d;
            int i39 = b;
            int i40 = i39 & 115;
            int i41 = -(-((i39 ^ 115) | i40));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            a = i42 % 128;
            if (i42 % 2 == 0) {
                editor2.putString("morningTime", morningTime);
                sessionManager3.d.apply();
                try {
                    throw null;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            editor2.putString("morningTime", morningTime);
            sessionManager3.d.apply();
            sessionManager3.d.commit();
            SessionManager sessionManager4 = this.c.aj;
            int i43 = b;
            int i44 = (-2) - (((i43 ^ 92) + ((i43 & 92) << 1)) ^ (-1));
            a = i44 % 128;
            int i45 = i44 % 2;
            sessionManager4.d.putString("eveningTime", versionResponse.getEveningTime());
            int i46 = a;
            int i47 = i46 & 103;
            int i48 = (i46 | 103) & (~i47);
            int i49 = -(-(i47 << 1));
            int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
            b = i50 % 128;
            int i51 = i50 % 2;
            sessionManager4.d.apply();
            sessionManager4.d.commit();
            ActivityEnumeratorMain activityEnumeratorMain = this.c;
            Intent intent = new Intent(this.c, (Class<?>) TokenActivity.class);
            int i52 = a;
            int i53 = i52 & 89;
            int i54 = (i52 | 89) & (~i53);
            int i55 = i53 << 1;
            int i56 = (i54 & i55) + (i54 | i55);
            b = i56 % 128;
            int i57 = i56 % 2;
            activityEnumeratorMain.startActivity(intent);
            int i58 = b;
            int i59 = ((i58 ^ 75) | (i58 & 75)) << 1;
            int i60 = -(((~i58) & 75) | (i58 & (-76)));
            int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
            a = i61 % 128;
            if (i61 % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            ActivityEnumeratorMain activityEnumeratorMain2 = this.c;
            StringBuilder sbW = j.w("Exception ");
            sbW.append(e.getMessage());
            ax.f(activityEnumeratorMain2, "Alert", sbW.toString());
        }
    }
}
