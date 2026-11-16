package ivas.gov.bisp.enumeration.p036bi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import ivas.gov.bisp.enumeration.activity.DisabilityActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p091n.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class D implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ DisabilityActivity c;

    public class bmm implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public bmm(D d) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 & 6) + (i3 | 6)) - 1;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                dialogInterface.cancel();
                throw null;
            }
            dialogInterface.cancel();
            int i5 = a;
            int i6 = (((i5 | 64) << 1) - (i5 ^ 64)) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public D(DisabilityActivity disabilityActivity) {
        this.c = disabilityActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = (i2 ^ 81) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.aj.dismiss();
            throw null;
        }
        this.c.aj.dismiss();
        DisabilityActivity disabilityActivity = this.c;
        int i6 = b;
        int i7 = (i6 ^ 44) + ((i6 & 44) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        disabilityActivity.ag.setVisibility(8);
        TextView textView = this.c.ai;
        int i10 = a;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = (i10 & 67) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            textView.setVisibility(0);
            this.c.ag.setEnabled(true);
        } else {
            textView.setVisibility(0);
            this.c.ag.setEnabled(false);
        }
        this.c.af.setEnabled(true);
        DisabilityActivity disabilityActivity2 = this.c;
        int i14 = a;
        int i15 = (i14 ^ 12) + ((i14 & 12) << 1);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        af.b(disabilityActivity2, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i18 = a;
        int i19 = i18 & 123;
        int i20 = (i19 - (~(-(-((i18 ^ 123) | i19))))) - 1;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03d9  */
    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        Date date;
        Calendar calendar;
        int i;
        int i2;
        D d = this;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 87) << 1) - (i4 ^ 87);
        a = i5 % 128;
        int i6 = i5 % 2;
        ax.b(d.c.aj);
        Object obj = null;
        int i7 = a + 55;
        b = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                jSONObject.getString("result");
                d.c.ax.k();
                Object obj2 = null;
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            JSONObject jSONObject2 = new JSONObject(b.c(jSONObject.getString("result"), b.b(d.c.ax.k()), b.b(d.c.ax.m())));
            int i8 = b;
            int i9 = (i8 & 91) + (i8 | 91);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                jSONObject2.getString("message".toLowerCase());
                "citizen_status".toLowerCase();
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String string = jSONObject2.getString("message".toLowerCase());
            String lowerCase = "citizen_status".toLowerCase();
            int i10 = a + 113;
            b = i10 % 128;
            int i11 = i10 % 2;
            jSONObject2.getString(lowerCase);
            if (!string.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                d.c.ag.setVisibility(8);
                int i12 = b;
                int i13 = (i12 ^ 116) + ((i12 & 116) << 1);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
                d.c.ai.setVisibility(0);
                int i16 = a;
                int i17 = (((i16 & (-78)) | ((~i16) & 77)) - (~(-(-((i16 & 77) << 1))))) - 1;
                b = i17 % 128;
                (i17 % 2 != 0 ? d.c.ag : d.c.ag).setEnabled(false);
                d.c.af.setEnabled(true);
                AlertDialog.Builder builder = new AlertDialog.Builder(d.c);
                builder.setTitle("Alert!");
                builder.setMessage(string);
                builder.setCancelable(false);
                bmm bmmVar = new bmm(d);
                int i18 = b;
                int i19 = ((i18 ^ 27) - (~((i18 & 27) << 1))) - 1;
                a = i19 % 128;
                int i20 = i19 % 2;
                builder.setPositiveButton("OK", bmmVar);
                builder.create().show();
                int i21 = a;
                int i22 = ((i21 ^ 111) | (i21 & 111)) << 1;
                int i23 = -(((~i21) & 111) | (i21 & (-112)));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                int i25 = i24 % 2;
                return;
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("data".toLowerCase()));
            int i26 = a;
            int i27 = i26 & 69;
            int i28 = ((i26 | 69) & (~i27)) + (i27 << 1);
            b = i28 % 128;
            if (i28 % 2 != 0) {
                jSONObject3.getString("relation".toLowerCase());
                "cardStatus".toLowerCase();
                try {
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            jSONObject3.getString("relation".toLowerCase());
            String lowerCase2 = "cardStatus".toLowerCase();
            int i29 = a;
            int i30 = (((i29 & (-4)) | ((~i29) & 3)) - (~(-(-((i29 & 3) << 1))))) - 1;
            b = i30 % 128;
            if (i30 % 2 != 0) {
                jSONObject3.getString(lowerCase2);
                jSONObject3.getString("citizenNumber".toLowerCase());
                try {
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            jSONObject3.getString(lowerCase2);
            String string2 = jSONObject3.getString("citizenNumber".toLowerCase());
            String string3 = jSONObject3.getString("name".toLowerCase());
            int i31 = a;
            int i32 = ((i31 & 66) + (i31 | 66)) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
            String string4 = jSONObject3.getString("gender".toLowerCase());
            String string5 = jSONObject3.getString("age".toLowerCase());
            int i34 = a;
            int i35 = i34 ^ 35;
            int i36 = -(-((i34 & 35) << 1));
            int i37 = (i35 & i36) + (i36 | i35);
            b = i37 % 128;
            int i38 = i37 % 2;
            String string6 = jSONObject3.getString("martial_Status".toLowerCase());
            int i39 = b + 35;
            a = i39 % 128;
            if (i39 % 2 == 0) {
                jSONObject3.getString("disability".toLowerCase());
                string3.equalsIgnoreCase("null");
                try {
                    throw null;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            String string7 = jSONObject3.getString("disability".toLowerCase());
            if (!string3.equalsIgnoreCase("null")) {
                int i40 = a;
                int i41 = (i40 & (-20)) | (19 & (~i40));
                int i42 = -(-((i40 & 19) << 1));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                b = i43 % 128;
                try {
                    if (i43 % 2 != 0) {
                        string4.equalsIgnoreCase("null");
                        Object obj3 = null;
                        try {
                            obj3.hashCode();
                            throw null;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (string4.equalsIgnoreCase("null")) {
                        d = this;
                    } else {
                        int i44 = a;
                        int i45 = ((i44 ^ 90) + ((i44 & 90) << 1)) - 1;
                        b = i45 % 128;
                        if (i45 % 2 != 0) {
                            int i46 = 89 / 0;
                            if (!string5.equalsIgnoreCase("null")) {
                            }
                        } else if (string5.equalsIgnoreCase("null")) {
                            d = this;
                        }
                        if (!string6.equalsIgnoreCase("null")) {
                            DisabilityActivity disabilityActivity = d.c;
                            disabilityActivity.aH = string2;
                            disabilityActivity.aI = string5;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                            int i47 = a;
                            int i48 = (i47 ^ 111) + ((i47 & 111) << 1);
                            b = i48 % 128;
                            try {
                                if (i48 % 2 != 0) {
                                    date = simpleDateFormat.parse(string5);
                                    calendar = Calendar.getInstance();
                                    int i49 = 53 / 0;
                                } else {
                                    date = simpleDateFormat.parse(string5);
                                    calendar = Calendar.getInstance();
                                }
                                int i50 = a;
                                int i51 = i50 & 15;
                                int i52 = -(-((i50 ^ 15) | i51));
                                int i53 = (i51 & i52) + (i52 | i51);
                                b = i53 % 128;
                                if (i53 % 2 != 0) {
                                    calendar.setTimeInMillis(date.getTime());
                                    i = calendar.get(1);
                                    i2 = 5;
                                } else {
                                    calendar.setTimeInMillis(date.getTime());
                                    i = calendar.get(1);
                                    i2 = 2;
                                }
                                int i54 = calendar.get(i2);
                                int i55 = calendar.get(5);
                                DisabilityActivity disabilityActivity2 = d.c;
                                int i56 = b;
                                int i57 = i56 ^ 7;
                                int i58 = (i56 & 7) << 1;
                                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                                a = i59 % 128;
                                int i60 = i59 % 2;
                                disabilityActivity2.az = ag.c(i55, i54, i);
                                int i61 = b;
                                int i62 = ((i61 & 104) + (i61 | 104)) - 1;
                                a = i62 % 128;
                                int i63 = i62 % 2;
                            } catch (ParseException unused) {
                            }
                            TextView textView = d.c.ag;
                            int i64 = b + 101;
                            a = i64 % 128;
                            int i65 = i64 % 2;
                            textView.setVisibility(0);
                            TextView textView2 = d.c.ai;
                            int i66 = a;
                            int i67 = ((i66 | 50) << 1) - (i66 ^ 50);
                            int i68 = (i67 ^ (-1)) + (i67 << 1);
                            b = i68 % 128;
                            if (i68 % 2 != 0) {
                                textView2.setVisibility(80);
                            } else {
                                textView2.setVisibility(8);
                            }
                            d.c.ag.setEnabled(true);
                            DisabilityActivity disabilityActivity3 = d.c;
                            int i69 = b + 83;
                            a = i69 % 128;
                            if (i69 % 2 == 0) {
                                disabilityActivity3.af.setEnabled(true);
                            } else {
                                disabilityActivity3.af.setEnabled(false);
                            }
                            int i70 = a;
                            int i71 = i70 & 89;
                            int i72 = -(-(i70 | 89));
                            int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                            b = i73 % 128;
                            int i74 = i73 % 2;
                            if (string7.equals("f")) {
                                int i75 = b + 27;
                                a = i75 % 128;
                                if (i75 % 2 == 0) {
                                    Spinner spinner = d.c.ad;
                                    try {
                                        obj.hashCode();
                                        throw null;
                                    } catch (Throwable th7) {
                                        throw th7;
                                    }
                                }
                                Spinner spinner2 = d.c.ad;
                                int i76 = b;
                                int i77 = i76 & 17;
                                int i78 = (i76 | 17) & (~i77);
                                int i79 = -(-(i77 << 1));
                                int i80 = (i78 ^ i79) + ((i78 & i79) << 1);
                                a = i80 % 128;
                                int i81 = i80 % 2;
                                spinner2.setSelection(1);
                                DisabilityActivity disabilityActivity4 = d.c;
                                int i82 = b + 123;
                                a = i82 % 128;
                                int i83 = i82 % 2;
                                disabilityActivity4.ad.setEnabled(false);
                                int i84 = b;
                                int i85 = (i84 ^ 75) + ((i84 & 75) << 1);
                                a = i85 % 128;
                                int i86 = i85 % 2;
                            } else {
                                Spinner spinner3 = d.c.ad;
                                int i87 = a;
                                int i88 = (i87 & 13) + (i87 | 13);
                                b = i88 % 128;
                                int i89 = i88 % 2;
                                spinner3.setEnabled(true);
                                int i90 = b;
                                int i91 = (i90 ^ 43) + ((i90 & 43) << 1);
                                a = i91 % 128;
                                int i92 = i91 % 2;
                            }
                            DisabilityActivity disabilityActivity5 = d.c;
                            String str = disabilityActivity5.aE;
                            boolean z = disabilityActivity5.aF;
                            String str2 = disabilityActivity5.aH;
                            int optionId = disabilityActivity5.ac.get(disabilityActivity5.ad.getSelectedItemPosition()).getOptionId();
                            DisabilityActivity disabilityActivity6 = d.c;
                            String option = disabilityActivity6.ac.get(disabilityActivity6.ad.getSelectedItemPosition()).getOption();
                            DisabilityActivity disabilityActivity7 = d.c;
                            RosterItem rosterItem = new RosterItem(str, z, string, BuildConfig.FLAVOR, str2, optionId, option, disabilityActivity7.aJ, disabilityActivity7.aI, disabilityActivity7.aQ, disabilityActivity7.aR, disabilityActivity7.aS, disabilityActivity7.aN, string4, disabilityActivity7.aM, disabilityActivity7.aU, disabilityActivity7.aL, disabilityActivity7.aD, disabilityActivity7.an, disabilityActivity7.ao, disabilityActivity7.ap, disabilityActivity7.am, disabilityActivity7.ar, disabilityActivity7.aq, disabilityActivity7.as, disabilityActivity7.aC, disabilityActivity7.aB, disabilityActivity7.at, disabilityActivity7.au, disabilityActivity7.aA, disabilityActivity7.av, disabilityActivity7.aw, disabilityActivity7.al, disabilityActivity7.ay);
                            int i93 = b;
                            int i94 = i93 & 105;
                            int i95 = (i93 | 105) & (~i94);
                            int i96 = i94 << 1;
                            int i97 = ((i95 | i96) << 1) - (i95 ^ i96);
                            a = i97 % 128;
                            if (i97 % 2 != 0) {
                                disabilityActivity5.ak = rosterItem;
                                return;
                            }
                            disabilityActivity5.ak = rosterItem;
                            try {
                                throw null;
                            } catch (Throwable th8) {
                                throw th8;
                            }
                        }
                        int i98 = a + 19;
                        b = i98 % 128;
                        int i99 = i98 % 2;
                    }
                } catch (JSONException e) {
                    e = e;
                    d = this;
                    DisabilityActivity disabilityActivity8 = d.c;
                    StringBuilder sbW = j.w("Exception ");
                    int i100 = b;
                    int i101 = (((i100 | 92) << 1) - (i100 ^ 92)) - 1;
                    a = i101 % 128;
                    int i102 = i101 % 2;
                    sbW.append(e.getMessage());
                    int i103 = a;
                    int i104 = (i103 ^ 47) + ((i103 & 47) << 1);
                    b = i104 % 128;
                    if (i104 % 2 != 0) {
                        ax.f(disabilityActivity8, "Alert", sbW.toString());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    ax.f(disabilityActivity8, "Alert", sbW.toString());
                    int i105 = a;
                    int i106 = ((i105 | 23) << 1) - (i105 ^ 23);
                    b = i106 % 128;
                    int i107 = i106 % 2;
                    return;
                }
            } else {
                d = this;
            }
            DisabilityActivity disabilityActivity9 = d.c;
            Objects.requireNonNull(disabilityActivity9);
            androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(disabilityActivity9);
            int i108 = a;
            int i109 = i108 & 27;
            int i110 = i109 + ((i108 ^ 27) | i109);
            b = i110 % 128;
            if (i110 % 2 != 0) {
                AlertController.OooO0O0 oooO0O0 = aiz.a;
                Object obj5 = null;
                try {
                    obj5.hashCode();
                    throw null;
                } catch (Throwable th9) {
                    throw th9;
                }
            }
            AlertController.OooO0O0 oooO0O1 = aiz.a;
            int i111 = a;
            int i112 = i111 ^ 65;
            int i113 = -(-((i111 & 65) << 1));
            int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
            b = i114 % 128;
            if (i114 % 2 != 0) {
                oooO0O1.e = "Citizen Validation";
                oooO0O1.f = "Citizen data against this member not fetched from NADRA.";
                int i115 = 58 / 0;
            } else {
                oooO0O1.e = "Citizen Validation";
                oooO0O1.f = "Citizen data against this member not fetched from NADRA.";
            }
            oooO0O1.k = true;
            W w = new W(disabilityActivity9);
            int i116 = a + 67;
            b = i116 % 128;
            int i117 = i116 % 2;
            oooO0O1.h = "Ok";
            int i118 = b + 49;
            a = i118 % 128;
            if (i118 % 2 != 0) {
                oooO0O1.i = w;
                aiz.b().show();
            } else {
                oooO0O1.i = w;
                aiz.b().show();
                int i119 = 68 / 0;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }
}
