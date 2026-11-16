package ivas.gov.bisp.enumeration.dd;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.MaritalStatusActivity;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class W implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ MaritalStatusActivity c;

    public class bJb implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public bJb(W w) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 ^ 82) + ((i3 & 82) << 1);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            dialogInterface.cancel();
            int i7 = a + 3;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public W(MaritalStatusActivity maritalStatusActivity) {
        this.c = maritalStatusActivity;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a + 119;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ax.b(this.c.ak);
            obj.hashCode();
            throw null;
        }
        ax.b(this.c.ak);
        this.c.ai.setVisibility(8);
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = (((i3 ^ 109) | i4) << 1) - ((i3 | 109) & (~i4));
        a = i5 % 128;
        int i6 = i5 % 2;
        this.c.ag.setVisibility(0);
        int i7 = b;
        int i8 = (((i7 | 34) << 1) - (i7 ^ 34)) - 1;
        a = i8 % 128;
        (i8 % 2 == 0 ? this.c : this.c).ai.setEnabled(false);
        this.c.af.setEnabled(true);
        int i9 = a + 125;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            responseMessage.getErrorMessage();
            responseMessage.isLogout();
            throw null;
        }
        MaritalStatusActivity maritalStatusActivity = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        boolean zIsLogout = responseMessage.isLogout();
        int i10 = b + 33;
        a = i10 % 128;
        int i11 = i10 % 2;
        af.b(maritalStatusActivity, errorMessage, zIsLogout);
        int i12 = a;
        int i13 = ((i12 & 1) - (~(-(-(i12 | 1))))) - 1;
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        String string;
        String lowerCase;
        MaritalStatusActivity maritalStatusActivity;
        Spinner spinner;
        W w = this;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 13) | (i2 & 13)) << 1) - (((~i2) & 13) | (i2 & (-14)));
        a = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                ax.b(w.c.ak);
                Object obj2 = null;
                try {
                    obj2.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ax.b(w.c.ak);
            String string2 = jSONObject.getString("result");
            SessionManager sessionManager = w.c.az;
            int i4 = b;
            int i5 = i4 & 115;
            int i6 = ((((i4 ^ 115) | i5) << 1) - (~(-((i4 | 115) & (~i5))))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                b.b(sessionManager.k());
                SessionManager sessionManager2 = w.c.az;
                Object obj3 = null;
                try {
                    obj3.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            JSONObject jSONObject2 = new JSONObject(b.c(string2, b.b(sessionManager.k()), b.b(w.c.az.m())));
            int i7 = b;
            int i8 = ((i7 ^ 99) | (i7 & 99)) << 1;
            int i9 = -(((~i7) & 99) | (i7 & (-100)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                jSONObject2.getString("message".toLowerCase());
                try {
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            String string3 = jSONObject2.getString("message".toLowerCase());
            jSONObject2.getString("citizen_status".toLowerCase());
            if (!string3.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                w.c.ai.setVisibility(8);
                int i11 = a;
                int i12 = i11 & 33;
                int i13 = (i12 - (~((i11 ^ 33) | i12))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                w.c.ag.setVisibility(0);
                int i15 = a;
                int i16 = ((i15 | 52) << 1) - (i15 ^ 52);
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    w.c.ai.setEnabled(true);
                } else {
                    w.c.ai.setEnabled(false);
                }
                int i18 = b;
                int i19 = (i18 & 21) + (i18 | 21);
                a = i19 % 128;
                int i20 = i19 % 2;
                w.c.af.setEnabled(true);
                AlertDialog.Builder builder = new AlertDialog.Builder(w.c);
                int i21 = b;
                int i22 = i21 & 27;
                int i23 = (i21 ^ 27) | i22;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    builder.setTitle("Alert!");
                    builder.setMessage(string3);
                    builder.setCancelable(true);
                } else {
                    builder.setTitle("Alert!");
                    builder.setMessage(string3);
                    builder.setCancelable(false);
                }
                builder.setPositiveButton("OK", new bJb(w));
                int i25 = a;
                int i26 = (i25 & 83) + (i25 | 83);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    builder.create().show();
                    int i27 = 9 / 0;
                } else {
                    builder.create().show();
                }
                int i28 = a;
                int i29 = ((i28 & 30) + (i28 | 30)) - 1;
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    return;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("data".toLowerCase()));
            int i30 = a;
            int i31 = i30 & 87;
            int i32 = (((i30 | 87) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
            jSONObject3.getString("relation".toLowerCase());
            String lowerCase2 = "cardStatus".toLowerCase();
            int i34 = a;
            int i35 = ((i34 | 53) << 1) - (i34 ^ 53);
            b = i35 % 128;
            if (i35 % 2 != 0) {
                jSONObject3.getString(lowerCase2);
                jSONObject3.getString("citizenNumber".toLowerCase());
                try {
                    throw null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            jSONObject3.getString(lowerCase2);
            String string4 = jSONObject3.getString("citizenNumber".toLowerCase());
            int i36 = b;
            int i37 = ((i36 ^ 85) | (i36 & 85)) << 1;
            int i38 = -(((~i36) & 85) | (i36 & (-86)));
            int i39 = (i37 & i38) + (i38 | i37);
            a = i39 % 128;
            if (i39 % 2 == 0) {
                jSONObject3.getString("name".toLowerCase());
                "gender".toLowerCase();
                Object obj5 = null;
                try {
                    obj5.hashCode();
                    throw null;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            String string5 = jSONObject3.getString("name".toLowerCase());
            String lowerCase3 = "gender".toLowerCase();
            int i40 = b;
            int i41 = (i40 & 33) + (i40 | 33);
            a = i41 % 128;
            if (i41 % 2 == 0) {
                jSONObject3.getString(lowerCase3);
                jSONObject3.getString("age".toLowerCase());
                try {
                    throw null;
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            jSONObject3.getString(lowerCase3);
            String string6 = jSONObject3.getString("age".toLowerCase());
            int i42 = a;
            int i43 = i42 ^ 35;
            int i44 = -(-((i42 & 35) << 1));
            int i45 = (i43 & i44) + (i44 | i43);
            b = i45 % 128;
            if (i45 % 2 != 0) {
                string = jSONObject3.getString("martial_Status".toLowerCase());
                lowerCase = "disability".toLowerCase();
                int i46 = 2 / 0;
            } else {
                string = jSONObject3.getString("martial_Status".toLowerCase());
                lowerCase = "disability".toLowerCase();
            }
            jSONObject3.getString(lowerCase);
            if (!string5.equalsIgnoreCase("null")) {
                int i47 = a;
                int i48 = ((i47 | 107) << 1) - (i47 ^ 107);
                b = i48 % 128;
                try {
                    if (i48 % 2 != 0) {
                        w.c.aM.equalsIgnoreCase("null");
                        try {
                            throw null;
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    if (!w.c.aM.equalsIgnoreCase("null")) {
                        try {
                            if (!string6.equalsIgnoreCase("null")) {
                                int i49 = (-2) - ((a + 64) ^ (-1));
                                b = i49 % 128;
                                int i50 = i49 % 2;
                                if (!string.equalsIgnoreCase("null")) {
                                    MaritalStatusActivity maritalStatusActivity2 = w.c;
                                    maritalStatusActivity2.aK = string4;
                                    int i51 = a + 71;
                                    b = i51 % 128;
                                    int i52 = i51 % 2;
                                    maritalStatusActivity2.aQ = string6;
                                    ArrayList<Item> arrayList = maritalStatusActivity2.ac;
                                    Spinner spinner2 = maritalStatusActivity2.ad;
                                    ArrayAdapter arrayAdapter = new ArrayAdapter(maritalStatusActivity2, ivas.gov.bisp.enumeration.R.layout.spinner_item, arrayList);
                                    int i53 = b;
                                    int i54 = (i53 & 59) + (i53 | 59);
                                    a = i54 % 128;
                                    if (i54 % 2 == 0) {
                                        arrayAdapter.setDropDownViewResource(ivas.gov.bisp.enumeration.R.layout.spinner_item_dropdown);
                                        spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
                                        Object obj6 = null;
                                        try {
                                            obj6.hashCode();
                                            throw null;
                                        } catch (Throwable th8) {
                                            throw th8;
                                        }
                                    }
                                    arrayAdapter.setDropDownViewResource(ivas.gov.bisp.enumeration.R.layout.spinner_item_dropdown);
                                    spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
                                    C0296s c0296s = new C0296s(maritalStatusActivity2, spinner2, arrayList);
                                    int i55 = a;
                                    int i56 = i55 & 65;
                                    int i57 = (((i55 | 65) & (~i56)) - (~(i56 << 1))) - 1;
                                    b = i57 % 128;
                                    int i58 = i57 % 2;
                                    spinner2.setOnItemSelectedListener(c0296s);
                                    boolean zEqualsIgnoreCase = string.equalsIgnoreCase("Widowed");
                                    int i59 = b + 27;
                                    int i60 = i59 % 128;
                                    a = i60;
                                    int i61 = i59 % 2;
                                    int i62 = 4;
                                    if (zEqualsIgnoreCase) {
                                        int i63 = ((i60 | 49) << 1) - (i60 ^ 49);
                                        b = i63 % 128;
                                        if (i63 % 2 != 0) {
                                            Spinner spinner3 = w.c.ad;
                                            try {
                                                obj.hashCode();
                                                throw null;
                                            } catch (Throwable th9) {
                                                throw th9;
                                            }
                                        }
                                        Spinner spinner4 = w.c.ad;
                                        int i64 = b;
                                        int i65 = i64 & 43;
                                        int i66 = (i64 ^ 43) | i65;
                                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                        a = i67 % 128;
                                        if (i67 % 2 == 0) {
                                            spinner4.setSelection(4);
                                        } else {
                                            spinner4.setSelection(3);
                                        }
                                        w.c.ad.setEnabled(false);
                                        int i68 = a + 98;
                                        int i69 = (i68 ^ (-1)) + (i68 << 1);
                                        b = i69 % 128;
                                        int i70 = i69 % 2;
                                    } else if (string.equalsIgnoreCase("Married")) {
                                        int i71 = a + 117;
                                        b = i71 % 128;
                                        if (i71 % 2 != 0) {
                                            Spinner spinner5 = w.c.ad;
                                            try {
                                                throw null;
                                            } catch (Throwable th10) {
                                                throw th10;
                                            }
                                        }
                                        w.c.ad.setSelection(2);
                                        MaritalStatusActivity maritalStatusActivity3 = w.c;
                                        int i72 = b;
                                        int i73 = i72 & 27;
                                        int i74 = i72 | 27;
                                        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                                        a = i75 % 128;
                                        (i75 % 2 == 0 ? maritalStatusActivity3.ad : maritalStatusActivity3.ad).setEnabled(false);
                                        int i76 = a + 89;
                                        b = i76 % 128;
                                        if (i76 % 2 != 0) {
                                            int i77 = 5 % 2;
                                        }
                                    } else if (string.equalsIgnoreCase("Unmarried")) {
                                        int i78 = b;
                                        int i79 = ((i78 ^ 121) | (i78 & 121)) << 1;
                                        int i80 = -(((~i78) & 121) | (i78 & (-122)));
                                        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                                        a = i81 % 128;
                                        int i82 = i81 % 2;
                                        Spinner spinner6 = w.c.ad;
                                        int i83 = a;
                                        int i84 = i83 & 93;
                                        int i85 = (i84 - (~((i83 ^ 93) | i84))) - 1;
                                        b = i85 % 128;
                                        int i86 = i85 % 2;
                                        spinner6.setSelection(1);
                                        MaritalStatusActivity maritalStatusActivity4 = w.c;
                                        int i87 = b;
                                        int i88 = i87 & 79;
                                        int i89 = -(-((i87 ^ 79) | i88));
                                        int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                                        a = i90 % 128;
                                        int i91 = i90 % 2;
                                        maritalStatusActivity4.ad.setEnabled(false);
                                        int i92 = b + 117;
                                        a = i92 % 128;
                                        int i93 = i92 % 2;
                                    } else if (!(!string.equalsIgnoreCase("divorced"))) {
                                        int i94 = b;
                                        int i95 = i94 & 87;
                                        int i96 = i94 | 87;
                                        int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                                        a = i97 % 128;
                                        if (i97 % 2 == 0) {
                                            spinner = w.c.ad;
                                            i62 = 5;
                                        } else {
                                            spinner = w.c.ad;
                                        }
                                        int i98 = b;
                                        int i99 = (i98 ^ 51) + ((i98 & 51) << 1);
                                        a = i99 % 128;
                                        if (i99 % 2 == 0) {
                                            spinner.setSelection(i62);
                                            Spinner spinner7 = w.c.ad;
                                            try {
                                                obj.hashCode();
                                                throw null;
                                            } catch (Throwable th11) {
                                                throw th11;
                                            }
                                        }
                                        spinner.setSelection(i62);
                                        w.c.ad.setEnabled(false);
                                        int i100 = b;
                                        int i101 = ((i100 ^ 95) | (i100 & 95)) << 1;
                                        int i102 = -(((~i100) & 95) | (i100 & (-96)));
                                        int i103 = (i101 & i102) + (i102 | i101);
                                        a = i103 % 128;
                                        int i104 = i103 % 2;
                                    } else {
                                        Spinner spinner8 = w.c.ad;
                                        int i105 = a;
                                        int i106 = i105 & 21;
                                        int i107 = -(-((i105 ^ 21) | i106));
                                        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                        b = i108 % 128;
                                        if (i108 % 2 != 0) {
                                            spinner8.setSelection(1);
                                            maritalStatusActivity = w.c;
                                        } else {
                                            spinner8.setSelection(0);
                                            maritalStatusActivity = w.c;
                                        }
                                        int i109 = b;
                                        int i110 = ((i109 & (-42)) | ((~i109) & 41)) + ((i109 & 41) << 1);
                                        a = i110 % 128;
                                        int i111 = i110 % 2;
                                        Spinner spinner9 = maritalStatusActivity.ad;
                                        int i112 = a;
                                        int i113 = i112 & 19;
                                        int i114 = (i112 | 19) & (~i113);
                                        int i115 = i113 << 1;
                                        int i116 = (i114 & i115) + (i114 | i115);
                                        b = i116 % 128;
                                        int i117 = i116 % 2;
                                        spinner9.setEnabled(true);
                                        int i118 = b;
                                        int i119 = (i118 ^ 49) + ((i118 & 49) << 1);
                                        a = i119 % 128;
                                        if (i119 % 2 == 0) {
                                            int i120 = 4 / 3;
                                        }
                                    }
                                    w.c.ai.setVisibility(0);
                                    TextView textView = w.c.ag;
                                    int i121 = b;
                                    int i122 = i121 | 45;
                                    int i123 = ((i122 << 1) - (~(-((~(i121 & 45)) & i122)))) - 1;
                                    a = i123 % 128;
                                    int i124 = i123 % 2;
                                    textView.setVisibility(8);
                                    w.c.ai.setEnabled(true);
                                    w.c.af.setEnabled(false);
                                    MaritalStatusActivity maritalStatusActivity5 = w.c;
                                    RosterItem rosterItem = new RosterItem(maritalStatusActivity5.aF, maritalStatusActivity5.aG, string3, BuildConfig.FLAVOR, maritalStatusActivity5.aK, maritalStatusActivity5.aT, maritalStatusActivity5.aJ, maritalStatusActivity5.aI, maritalStatusActivity5.aQ, maritalStatusActivity5.aR, maritalStatusActivity5.aS, maritalStatusActivity5.aN, maritalStatusActivity5.aO, maritalStatusActivity5.aM, maritalStatusActivity5.aU, maritalStatusActivity5.aL, maritalStatusActivity5.aD, maritalStatusActivity5.an, maritalStatusActivity5.ao, maritalStatusActivity5.ap, maritalStatusActivity5.am, maritalStatusActivity5.ar, maritalStatusActivity5.aq, maritalStatusActivity5.as, maritalStatusActivity5.at, maritalStatusActivity5.aB, maritalStatusActivity5.ax, maritalStatusActivity5.au, maritalStatusActivity5.aA, maritalStatusActivity5.av, maritalStatusActivity5.aw, maritalStatusActivity5.al, maritalStatusActivity5.ay, maritalStatusActivity5.aC);
                                    int i125 = b;
                                    int i126 = ((i125 | 57) << 1) - (i125 ^ 57);
                                    a = i126 % 128;
                                    if (i126 % 2 != 0) {
                                        maritalStatusActivity5.aP = rosterItem;
                                        return;
                                    }
                                    maritalStatusActivity5.aP = rosterItem;
                                    try {
                                        throw null;
                                    } catch (Throwable th12) {
                                        throw th12;
                                    }
                                }
                                int i127 = b;
                                int i128 = i127 ^ 55;
                                int i129 = (i127 & 55) << 1;
                                int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                                a = i130 % 128;
                                int i131 = i130 % 2;
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    } else {
                        w = this;
                    }
                } catch (JSONException unused2) {
                    return;
                }
            }
            MaritalStatusActivity maritalStatusActivity6 = w.c;
            Objects.requireNonNull(maritalStatusActivity6);
            AlertDialog.Builder builder2 = new AlertDialog.Builder(maritalStatusActivity6);
            int i132 = a;
            int i133 = i132 & 57;
            int i134 = (((i132 | 57) & (~i133)) - (~(i133 << 1))) - 1;
            b = i134 % 128;
            int i135 = i134 % 2;
            builder2.setTitle("Citizen Validation");
            builder2.setMessage("Citizen data against this member not fetched from NADRA.");
            builder2.setCancelable(true);
            X x = new X(maritalStatusActivity6);
            int i136 = b;
            int i137 = i136 & 55;
            int i138 = (((i136 | 55) & (~i137)) - (~(i137 << 1))) - 1;
            a = i138 % 128;
            int i139 = i138 % 2;
            builder2.setPositiveButton("Ok", x);
            AlertDialog alertDialogCreate = builder2.create();
            int i140 = a + 55;
            b = i140 % 128;
            if (i140 % 2 != 0) {
                alertDialogCreate.show();
                int i141 = 50 / 0;
            } else {
                alertDialogCreate.show();
            }
            int i142 = a + 11;
            b = i142 % 128;
            int i143 = i142 % 2;
        } catch (JSONException unused3) {
        }
    }
}
