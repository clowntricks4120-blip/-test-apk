package ivas.gov.bisp.enumeration.p043bp;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bp.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0215v implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ActivityBeginSurvey d;

    public C0215v(ActivityBeginSurvey activityBeginSurvey, String str) {
        this.d = activityBeginSurvey;
        this.c = str;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 41) | (i2 & 41)) << 1;
        int i4 = -(((~i2) & 41) | (i2 & (-42)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ax.b(this.d.ag);
        C0104p c0104pC = C0104p.c();
        AppCompatActivity appCompatActivity = this.d.ae;
        StringBuilder sb = new StringBuilder();
        int i7 = a + 47;
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            sb.append(this.c);
            throw null;
        }
        sb.append(this.c);
        sb.append("\n\nBut Error on Token Processing ");
        int i8 = b;
        int i9 = ((i8 ^ 72) + ((i8 & 72) << 1)) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            sb.append(responseMessage.getErrorMessage());
            sb.toString();
            obj.hashCode();
            throw null;
        }
        sb.append(responseMessage.getErrorMessage());
        String string = sb.toString();
        R r = new R(this, 0);
        int i10 = b;
        int i11 = i10 & 33;
        int i12 = (i11 - (~((i10 ^ 33) | i11))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        c0104pC.e(appCompatActivity, "Alert!", string, r, false);
        int i14 = a;
        int i15 = i14 ^ 3;
        int i16 = ((((i14 & 3) | i15) << 1) - (~(-i15))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) throws Exception {
        String strC;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = i3 - (~((i2 ^ 123) | i3));
        final int i5 = 1;
        int i6 = i4 - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        ax.b(this.d.ag);
        try {
            try {
                String string = jSONObject.getString("result");
                int i8 = a;
                int i9 = ((i8 ^ 29) | (i8 & 29)) << 1;
                int i10 = -(((~i8) & 29) | (i8 & (-30)));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                byte[] bArrB = b.b(this.d.at.k());
                int i13 = b;
                int i14 = (-2) - ((((i13 | 36) << 1) - (i13 ^ 36)) ^ (-1));
                a = i14 % 128;
                final int i15 = 0;
                if (i14 % 2 == 0) {
                    strC = b.c(string, bArrB, b.b(this.d.at.m()));
                    int i16 = 47 / 0;
                } else {
                    strC = b.c(string, bArrB, b.b(this.d.at.m()));
                }
                boolean z = new JSONObject(strC).getBoolean("Status");
                int i17 = a;
                int i18 = i17 & 13;
                int i19 = (i17 ^ 13) | i18;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                int i21 = i20 % 128;
                b = i21;
                int i22 = i20 % 2;
                if (!z) {
                    C0104p c0104pC = C0104p.c();
                    AppCompatActivity appCompatActivity = this.d.ae;
                    StringBuilder sb = new StringBuilder();
                    int i23 = b + 93;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    sb.append(this.c);
                    sb.append("\n\nBut Token Not Processed.");
                    String string2 = sb.toString();
                    R r = new R(this, i5);
                    int i25 = (-2) - ((b + 100) ^ (-1));
                    a = i25 % 128;
                    if (i25 % 2 == 0) {
                        c0104pC.e(appCompatActivity, "Alert!", string2, r, false);
                        return;
                    } else {
                        c0104pC.e(appCompatActivity, "Alert!", string2, r, false);
                        return;
                    }
                }
                int i26 = i21 ^ 113;
                int i27 = (i21 & 113) << 1;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                a = i28 % 128;
                int i29 = i28 % 2;
                C0104p c0104pC2 = C0104p.c();
                AppCompatActivity appCompatActivity2 = this.d.ae;
                String str = this.c;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bp.L
                    private static int a = 0;
                    private static int b = 1;
                    public final /* synthetic */ C0215v d;

                    {
                        this.d = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i30) {
                        int i31 = 2 % 2;
                        int i32 = b;
                        int i33 = ((i32 & (-32)) | ((~i32) & 31)) + ((i32 & 31) << 1);
                        a = i33 % 128;
                        if (i33 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (i15 == 0) {
                            ActivityBeginSurvey activityBeginSurvey = this.d.d;
                            int i34 = ActivityBeginSurvey.af;
                            activityBeginSurvey.y();
                            int i35 = b;
                            int i36 = i35 & 77;
                            int i37 = (i36 - (~(-(-((i35 ^ 77) | i36))))) - 1;
                            a = i37 % 128;
                            if (i37 % 2 != 0) {
                                int i38 = 49 / 0;
                                return;
                            }
                            return;
                        }
                        int i39 = (i32 ^ 33) + ((i32 & 33) << 1);
                        int i40 = i39 % 128;
                        a = i40;
                        int i41 = i39 % 2;
                        int i42 = (i40 & (-102)) | ((~i40) & 101);
                        int i43 = -(-((i40 & 101) << 1));
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        if (i44 % 2 != 0) {
                            ActivityBeginSurvey activityBeginSurvey2 = this.d.d;
                            int i45 = ActivityBeginSurvey.af;
                            activityBeginSurvey2.y();
                        } else {
                            ActivityBeginSurvey activityBeginSurvey3 = this.d.d;
                            int i46 = ActivityBeginSurvey.af;
                            activityBeginSurvey3.y();
                            int i47 = 58 / 0;
                        }
                    }
                };
                int i30 = a;
                int i31 = (((i30 | 18) << 1) - (i30 ^ 18)) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
                c0104pC2.e(appCompatActivity2, "Alert!", str, onClickListener, false);
                int i33 = b;
                int i34 = (i33 & (-4)) | ((~i33) & 3);
                int i35 = (i33 & 3) << 1;
                int i36 = (i34 & i35) + (i35 | i34);
                a = i36 % 128;
                int i37 = i36 % 2;
            } catch (JSONException e) {
                C0104p c0104pC3 = C0104p.c();
                AppCompatActivity appCompatActivity3 = this.d.ae;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.c);
                sb2.append("\n\nException on Token Processing ");
                sb2.append(e.getMessage());
                c0104pC3.e(appCompatActivity3, "Alert!", sb2.toString(), new DialogInterface.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bp.L
                    private static int a = 0;
                    private static int b = 1;
                    public final /* synthetic */ C0215v d;

                    {
                        this.d = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i38) {
                        int i39 = 2 % 2;
                        int i310 = b;
                        int i311 = ((i310 & (-32)) | ((~i310) & 31)) + ((i310 & 31) << 1);
                        a = i311 % 128;
                        if (i311 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (i5 == 0) {
                            ActivityBeginSurvey activityBeginSurvey = this.d.d;
                            int i312 = ActivityBeginSurvey.af;
                            activityBeginSurvey.y();
                            int i313 = b;
                            int i314 = i313 & 77;
                            int i315 = (i314 - (~(-(-((i313 ^ 77) | i314))))) - 1;
                            a = i315 % 128;
                            if (i315 % 2 != 0) {
                                int i316 = 49 / 0;
                                return;
                            }
                            return;
                        }
                        int i317 = (i310 ^ 33) + ((i310 & 33) << 1);
                        int i40 = i317 % 128;
                        a = i40;
                        int i41 = i317 % 2;
                        int i42 = (i40 & (-102)) | ((~i40) & 101);
                        int i43 = -(-((i40 & 101) << 1));
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        b = i44 % 128;
                        if (i44 % 2 != 0) {
                            ActivityBeginSurvey activityBeginSurvey2 = this.d.d;
                            int i45 = ActivityBeginSurvey.af;
                            activityBeginSurvey2.y();
                        } else {
                            ActivityBeginSurvey activityBeginSurvey3 = this.d.d;
                            int i46 = ActivityBeginSurvey.af;
                            activityBeginSurvey3.y();
                            int i47 = 58 / 0;
                        }
                    }
                }, false);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
