package ivas.gov.bisp.enumeration.dd;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertController;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.GenderActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class R implements I {
    private static int a = 0x00000001;
    private static int b;
    public final /* synthetic */ GenderActivity c;

    public class bJA implements DialogInterface.OnClickListener {
        private static int a = 0x00000000;
        private static int b = 0x00000001;

        public bJA(R r) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 29) << 1) - (i3 ^ 29);
            a = i4 % 128;
            int i5 = i4 % 2;
            dialogInterface.cancel();
            int i6 = a + 105;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 13 / 0;
            }
        }
    }

    public R(GenderActivity genderActivity) {
        this.c = genderActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        ax.b(this.c.ad);
        GenderActivity genderActivity = this.c;
        int i4 = b;
        int i5 = (i4 & (-66)) | ((~i4) & 65);
        int i6 = (i4 & 65) << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            genderActivity.aw.setVisibility(42);
        } else {
            genderActivity.aw.setVisibility(8);
        }
        this.c.al.setVisibility(0);
        this.c.aw.setEnabled(false);
        int i8 = a;
        int i9 = i8 & 73;
        int i10 = -(-((i8 ^ 73) | i9));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            this.c.af.setEnabled(false);
        } else {
            this.c.af.setEnabled(true);
        }
        this.c.aB.setEnabled(false);
        RadioButton radioButton = this.c.ax;
        int i12 = a;
        int i13 = ((i12 & (-38)) | ((~i12) & 37)) + ((i12 & 37) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        radioButton.setEnabled(false);
        this.c.az.setEnabled(false);
        int i15 = a;
        int i16 = (i15 & (-124)) | ((~i15) & 123);
        int i17 = (i15 & 123) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        af.b(this.c, responseMessage.getErrorMessage(), responseMessage.isLogout());
        int i20 = a;
        int i21 = ((i20 & 10) + (i20 | 10)) - 1;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 54 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        String string;
        SessionManager sessionManager;
        SessionManager sessionManager2;
        AlertController.OooO0O0 oooO0O0;
        String lowerCase;
        GenderActivity genderActivity;
        R r = this;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 43) | (i2 & 43)) << 1;
        int i4 = -(((~i2) & 43) | (i2 & (-44)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ax.b(r.c.ad);
        int i7 = b;
        int i8 = (i7 | 115) << 1;
        int i9 = -(((~i7) & 115) | (i7 & (-116)));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        boolean z = false;
        try {
            if (i10 % 2 == 0) {
                string = jSONObject.getString("result");
                sessionManager = r.c.ac;
                int i11 = 50 / 0;
            } else {
                string = jSONObject.getString("result");
                sessionManager = r.c.ac;
            }
            byte[] bArrB = b.b(sessionManager.k());
            GenderActivity genderActivity2 = r.c;
            int i12 = b + 17;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                sessionManager2 = genderActivity2.ac;
                int i13 = 82 / 0;
            } else {
                sessionManager2 = genderActivity2.ac;
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string, bArrB, b.b(sessionManager2.m())));
            int i14 = b;
            int i15 = ((((i14 ^ 45) | (i14 & 45)) << 1) - (~(-(((~i14) & 45) | (i14 & (-46)))))) - 1;
            a = i15 % 128;
            if (i15 % 2 == 0) {
                jSONObject2.getString("message".toLowerCase());
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = jSONObject2.getString("message".toLowerCase());
            int i16 = a;
            int i17 = i16 & 7;
            int i18 = i17 + ((i16 ^ 7) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            jSONObject2.getString("citizen_status".toLowerCase());
            if (!string2.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                r.c.aw.setVisibility(8);
                GenderActivity genderActivity3 = r.c;
                int i20 = a;
                int i21 = (-2) - (((i20 & 102) + (i20 | 102)) ^ (-1));
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    genderActivity3.al.setVisibility(1);
                    r.c.aw.setEnabled(true);
                } else {
                    genderActivity3.al.setVisibility(0);
                    r.c.aw.setEnabled(false);
                }
                int i22 = a;
                int i23 = i22 & 43;
                int i24 = (i22 ^ 43) | i23;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                b = i25 % 128;
                int i26 = i25 % 2;
                r.c.af.setEnabled(true);
                RadioButton radioButton = r.c.aB;
                int i27 = b;
                int i28 = (i27 & 1) + (i27 | 1);
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    radioButton.setEnabled(true);
                    r.c.ax.setEnabled(true);
                } else {
                    radioButton.setEnabled(false);
                    r.c.ax.setEnabled(false);
                }
                r.c.az.setEnabled(false);
                androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(r.c);
                int i29 = b;
                int i30 = i29 & 81;
                int i31 = ((i29 ^ 81) | i30) << 1;
                int i32 = -((i29 | 81) & (~i30));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    oooO0O0 = aiz.a;
                    oooO0O0.e = "Alert!";
                    oooO0O0.f = string2;
                    z = true;
                } else {
                    oooO0O0 = aiz.a;
                    oooO0O0.e = "Alert!";
                    oooO0O0.f = string2;
                }
                oooO0O0.k = z;
                bJA bja = new bJA(r);
                oooO0O0.h = "OK";
                int i34 = a;
                int i35 = (i34 ^ 67) + ((i34 & 67) << 1);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    oooO0O0.i = bja;
                    aiz.b().show();
                    return;
                } else {
                    oooO0O0.i = bja;
                    aiz.b().show();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("data".toLowerCase()));
            int i36 = b;
            int i37 = (i36 ^ 37) + ((i36 & 37) << 1);
            a = i37 % 128;
            if (i37 % 2 == 0) {
                jSONObject3.getString("relation".toLowerCase());
                lowerCase = "cardStatus".toLowerCase();
                int i38 = 44 / 0;
            } else {
                jSONObject3.getString("relation".toLowerCase());
                lowerCase = "cardStatus".toLowerCase();
            }
            int i39 = a;
            int i40 = ((i39 & 79) - (~(i39 | 79))) - 1;
            b = i40 % 128;
            int i41 = i40 % 2;
            jSONObject3.getString(lowerCase);
            String string3 = jSONObject3.getString("citizenNumber".toLowerCase());
            int i42 = a;
            int i43 = ((i42 & (-126)) | ((~i42) & 125)) + ((i42 & 125) << 1);
            b = i43 % 128;
            if (i43 % 2 != 0) {
                jSONObject3.getString("name".toLowerCase());
                "gender".toLowerCase();
                Object obj2 = null;
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            String string4 = jSONObject3.getString("name".toLowerCase());
            String lowerCase2 = "gender".toLowerCase();
            int i44 = a;
            int i45 = i44 & 5;
            int i46 = (i45 - (~(-(-((i44 ^ 5) | i45))))) - 1;
            b = i46 % 128;
            if (i46 % 2 != 0) {
                jSONObject3.getString(lowerCase2);
                jSONObject3.getString("age".toLowerCase());
                try {
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            String string5 = jSONObject3.getString(lowerCase2);
            String string6 = jSONObject3.getString("age".toLowerCase());
            String string7 = jSONObject3.getString("martial_Status".toLowerCase());
            String lowerCase3 = "disability".toLowerCase();
            int i47 = b + 53;
            a = i47 % 128;
            int i48 = i47 % 2;
            jSONObject3.getString(lowerCase3);
            if (!string4.equalsIgnoreCase("null")) {
                int i49 = a;
                int i50 = (i49 & (-120)) | ((~i49) & 119);
                int i51 = (i49 & 119) << 1;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                b = i52 % 128;
                try {
                    if (i52 % 2 != 0) {
                        r.c.aI.equalsIgnoreCase("null");
                        try {
                            throw null;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    try {
                        if (r.c.aI.equalsIgnoreCase("null")) {
                            r = this;
                        } else if (!string6.equalsIgnoreCase("null")) {
                            int i53 = b;
                            int i54 = ((i53 ^ 1) - (~((i53 & 1) << 1))) - 1;
                            a = i54 % 128;
                            int i55 = i54 % 2;
                            if (!string7.equalsIgnoreCase("null")) {
                                GenderActivity genderActivity4 = r.c;
                                genderActivity4.aP = string3;
                                int i56 = a;
                                int i57 = (((i56 ^ 51) | (i56 & 51)) << 1) - (((~i56) & 51) | (i56 & (-52)));
                                b = i57 % 128;
                                int i58 = i57 % 2;
                                genderActivity4.aG = string6;
                                boolean zEqualsIgnoreCase = string5.equalsIgnoreCase("Male");
                                int i59 = a;
                                int i60 = i59 & 45;
                                int i61 = (i59 ^ 45) | i60;
                                int i62 = (i60 & i61) + (i61 | i60);
                                b = i62 % 128;
                                if (i62 % 2 != 0) {
                                    throw null;
                                }
                                if (zEqualsIgnoreCase) {
                                    r.c.aB.setChecked(true);
                                    int i63 = b + 103;
                                    a = i63 % 128;
                                    int i64 = i63 % 2;
                                    r.c.aI = "male";
                                    int i65 = (-2) - ((b + 94) ^ (-1));
                                    a = i65 % 128;
                                    int i66 = i65 % 2;
                                } else if (string5.equalsIgnoreCase("Female")) {
                                    int i67 = b;
                                    int i68 = i67 & 53;
                                    int i69 = i68 + ((i67 ^ 53) | i68);
                                    a = i69 % 128;
                                    int i70 = i69 % 2;
                                    RadioButton radioButton2 = r.c.ax;
                                    int i71 = a;
                                    int i72 = (-2) - (((i71 ^ 108) + ((i71 & 108) << 1)) ^ (-1));
                                    b = i72 % 128;
                                    int i73 = i72 % 2;
                                    radioButton2.setChecked(true);
                                    r.c.aI = "female";
                                    int i74 = b;
                                    int i75 = (i74 & (-62)) | ((~i74) & 61);
                                    int i76 = (i74 & 61) << 1;
                                    int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                                    a = i77 % 128;
                                    int i78 = i77 % 2;
                                } else {
                                    RadioButton radioButton3 = r.c.az;
                                    int i79 = b;
                                    int i80 = (i79 & 3) + (i79 | 3);
                                    a = i80 % 128;
                                    int i81 = i80 % 2;
                                    radioButton3.setChecked(true);
                                    r.c.aI = "transgender";
                                    int i82 = b;
                                    int i83 = i82 | 27;
                                    int i84 = (i83 << 1) - ((~(i82 & 27)) & i83);
                                    a = i84 % 128;
                                    int i85 = i84 % 2;
                                }
                                r.c.aw.setVisibility(0);
                                r.c.al.setVisibility(8);
                                int i86 = (-2) - ((b + 14) ^ (-1));
                                a = i86 % 128;
                                int i87 = i86 % 2;
                                r.c.aw.setEnabled(true);
                                r.c.af.setEnabled(false);
                                GenderActivity genderActivity5 = r.c;
                                int i88 = b;
                                int i89 = (i88 & 51) + (i88 | 51);
                                a = i89 % 128;
                                if (i89 % 2 == 0) {
                                    genderActivity5.aB.setEnabled(false);
                                    r.c.ax.setEnabled(true);
                                    genderActivity = r.c;
                                } else {
                                    genderActivity5.aB.setEnabled(false);
                                    r.c.ax.setEnabled(false);
                                    genderActivity = r.c;
                                }
                                genderActivity.az.setEnabled(false);
                                GenderActivity genderActivity6 = r.c;
                                RosterItem rosterItem = new RosterItem(genderActivity6.ai, genderActivity6.aj, string2, BuildConfig.FLAVOR, genderActivity6.aP, genderActivity6.aV, genderActivity6.aE, genderActivity6.aF, genderActivity6.aG, genderActivity6.aH, genderActivity6.aK, genderActivity6.aT, genderActivity6.aJ, genderActivity6.aI, genderActivity6.aQ, genderActivity6.aR, genderActivity6.aS, genderActivity6.aN, genderActivity6.aO, genderActivity6.aM, genderActivity6.aU, genderActivity6.aL, genderActivity6.aD, genderActivity6.an, genderActivity6.ao, genderActivity6.aA, genderActivity6.av, genderActivity6.ap, genderActivity6.am, genderActivity6.ar, genderActivity6.aq, genderActivity6.as, genderActivity6.at, genderActivity6.au);
                                int i90 = a;
                                int i91 = i90 ^ 95;
                                int i92 = (((i90 & 95) | i91) << 1) - i91;
                                b = i92 % 128;
                                int i93 = i92 % 2;
                                genderActivity6.ae = rosterItem;
                                int i94 = b + 9;
                                a = i94 % 128;
                                int i95 = i94 % 2;
                                return;
                            }
                            int i96 = a;
                            int i97 = i96 & 47;
                            int i98 = (i96 ^ 47) | i97;
                            int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                            b = i99 % 128;
                            int i100 = i99 % 2;
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                } catch (JSONException unused2) {
                    return;
                }
            }
            GenderActivity genderActivity7 = r.c;
            Objects.requireNonNull(genderActivity7);
            AlertDialog.Builder builder = new AlertDialog.Builder(genderActivity7);
            int i101 = b;
            int i102 = i101 & 107;
            int i103 = (((i101 ^ 107) | i102) << 1) - ((i101 | 107) & (~i102));
            a = i103 % 128;
            int i104 = i103 % 2;
            builder.setTitle("Citizen Validation");
            builder.setMessage("Citizen data against this member not fetched from NADRA.");
            builder.setCancelable(true);
            V v = new V(genderActivity7);
            int i105 = a;
            int i106 = ((i105 | 67) << 1) - (i105 ^ 67);
            b = i106 % 128;
            int i107 = i106 % 2;
            builder.setPositiveButton("Ok", v);
            AlertDialog alertDialogCreate = builder.create();
            int i108 = b;
            int i109 = i108 & 17;
            int i110 = (((i108 | 17) & (~i109)) - (~(i109 << 1))) - 1;
            a = i110 % 128;
            if (i110 % 2 != 0) {
                alertDialogCreate.show();
                return;
            }
            alertDialogCreate.show();
            Object obj3 = null;
            try {
                obj3.hashCode();
                throw null;
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (JSONException unused3) {
        }
    }
}
