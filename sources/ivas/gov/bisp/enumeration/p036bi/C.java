package ivas.gov.bisp.enumeration.p036bi;

import android.content.DialogInterface;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p091n.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class C implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ DashboardActivity c;

    public C(DashboardActivity dashboardActivity) {
        this.c = dashboardActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = (i2 | 97) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        C0104p c0104pC = C0104p.c();
        DashboardActivity dashboardActivity = this.c;
        int i8 = b;
        int i9 = ((i8 | 22) << 1) - (i8 ^ 22);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        StringBuilder sbW = j.w("But Error on Token Processing ");
        sbW.append(responseMessage.getErrorMessage());
        String string = sbW.toString();
        V v = new V(this, 2);
        int i12 = b;
        int i13 = i12 & 45;
        int i14 = ((i12 ^ 45) | i13) << 1;
        int i15 = -((i12 | 45) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        c0104pC.e(dashboardActivity, "Alert!", string, v, false);
        int i18 = a;
        int i19 = ((i18 ^ 78) + ((i18 & 78) << 1)) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        ax.b(this.c.am);
        int i21 = a;
        int i22 = i21 & 75;
        int i23 = (i22 - (~((i21 ^ 75) | i22))) - 1;
        b = i23 % 128;
        int i24 = i23 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 97) + (i2 | 97);
        a = i3 % 128;
        int i4 = i3 % 2;
        ax.b(this.c.am);
        final int i5 = 1;
        try {
            try {
                String string = jSONObject.getString("result");
                int i6 = a;
                int i7 = (i6 & 5) + (i6 | 5);
                b = i7 % 128;
                Object obj = null;
                if (i7 % 2 == 0) {
                    b.b(this.c.af.k());
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    boolean z = new JSONObject(b.c(string, b.b(this.c.af.k()), b.b(this.c.af.m()))).getBoolean("status");
                    int i8 = b;
                    int i9 = (i8 & 23) + (i8 | 23);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    final int i11 = 0;
                    if (!z) {
                        C0104p c0104pC = C0104p.c();
                        DashboardActivity dashboardActivity = this.c;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bi.am
                            private static int a = 1;
                            private static int b;
                            public final /* synthetic */ C d;

                            {
                                this.d = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                int i13 = 2 % 2;
                                int i14 = b;
                                int i15 = i14 ^ 67;
                                int i16 = -(-((i14 & 67) << 1));
                                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                                a = i17 % 128;
                                Object obj2 = null;
                                if (i17 % 2 == 0) {
                                    throw null;
                                }
                                if (i11 == 0) {
                                    DashboardActivity.w(this.d.c);
                                    int i18 = a;
                                    int i19 = i18 & 35;
                                    int i20 = i19 + ((i18 ^ 35) | i19);
                                    b = i20 % 128;
                                    int i21 = i20 % 2;
                                    return;
                                }
                                int i22 = i14 + 41;
                                a = i22 % 128;
                                int i23 = i22 % 2;
                                int i24 = i14 & 63;
                                int i25 = (i14 | 63) & (~i24);
                                int i26 = -(-(i24 << 1));
                                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                                a = i27 % 128;
                                int i28 = i27 % 2;
                                DashboardActivity.w(this.d.c);
                                int i29 = a;
                                int i30 = (i29 & 79) + (i29 | 79);
                                b = i30 % 128;
                                if (i30 % 2 == 0) {
                                    return;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        int i12 = a;
                        int i13 = i12 | 21;
                        int i14 = i13 << 1;
                        int i15 = -((~(i12 & 21)) & i13);
                        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            c0104pC.e(dashboardActivity, "Alert!", "Token Not Processed.", onClickListener, true);
                            return;
                        } else {
                            c0104pC.e(dashboardActivity, "Alert!", "Token Not Processed.", onClickListener, false);
                            return;
                        }
                    }
                    C0104p c0104pC2 = C0104p.c();
                    DashboardActivity dashboardActivity2 = this.c;
                    V v = new V(this, 0);
                    int i17 = a;
                    int i18 = i17 & 41;
                    int i19 = (i17 ^ 41) | i18;
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    c0104pC2.e(dashboardActivity2, "Alert!", "Token processed successfully.", v, false);
                    int i22 = a;
                    int i23 = (((i22 | 80) << 1) - (i22 ^ 80)) - 1;
                    b = i23 % 128;
                    if (i23 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                } catch (JSONException e) {
                    C0104p c0104pC3 = C0104p.c();
                    DashboardActivity dashboardActivity3 = this.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception on Token Processing ");
                    sb.append(e.getMessage());
                    c0104pC3.e(dashboardActivity3, "Alert!", sb.toString(), new V(this, 1), false);
                }
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (UnsupportedOperationException e3) {
                throw e3;
            }
        } catch (Exception e4) {
            C0104p c0104pC4 = C0104p.c();
            DashboardActivity dashboardActivity4 = this.c;
            StringBuilder sbW = j.w("\n\nException on Token Processing ");
            sbW.append(e4.getMessage());
            c0104pC4.e(dashboardActivity4, "Alert!", sbW.toString(), new DialogInterface.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.bi.am
                private static int a = 1;
                private static int b;
                public final /* synthetic */ C d;

                {
                    this.d = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i110) {
                    int i111 = 2 % 2;
                    int i112 = b;
                    int i113 = i112 ^ 67;
                    int i114 = -(-((i112 & 67) << 1));
                    int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                    a = i115 % 128;
                    Object obj2 = null;
                    if (i115 % 2 == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        DashboardActivity.w(this.d.c);
                        int i116 = a;
                        int i117 = i116 & 35;
                        int i24 = i117 + ((i116 ^ 35) | i117);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        return;
                    }
                    int i26 = i112 + 41;
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    int i28 = i112 & 63;
                    int i29 = (i112 | 63) & (~i28);
                    int i210 = -(-(i28 << 1));
                    int i211 = ((i29 | i210) << 1) - (i29 ^ i210);
                    a = i211 % 128;
                    int i212 = i211 % 2;
                    DashboardActivity.w(this.d.c);
                    int i213 = a;
                    int i30 = (i213 & 79) + (i213 | 79);
                    b = i30 % 128;
                    if (i30 % 2 == 0) {
                        return;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }, false);
        }
    }
}
