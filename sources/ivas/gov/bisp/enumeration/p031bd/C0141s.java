package ivas.gov.bisp.enumeration.p031bd;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0141s implements I {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ MaritalDiscrepancy c;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bd.s$bik */
    public class bik implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public bik(C0141s c0141s) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 59) << 1) - (i3 ^ 59);
            b = i4 % 128;
            int i5 = i4 % 2;
            dialogInterface.cancel();
            int i6 = b + 117;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public C0141s(MaritalDiscrepancy maritalDiscrepancy) {
        this.c = maritalDiscrepancy;
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = ((i2 | 43) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            ax.b(this.c.ac);
            throw null;
        }
        ax.b(this.c.ac);
        this.c.ah.setVisibility(8);
        MaritalDiscrepancy maritalDiscrepancy = this.c;
        int i5 = a + 119;
        b = i5 % 128;
        int i6 = i5 % 2;
        maritalDiscrepancy.aj.setVisibility(0);
        TextView textView = this.c.ah;
        int i7 = a;
        int i8 = i7 & 19;
        int i9 = (((i7 | 19) & (~i8)) - (~(i8 << 1))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        textView.setEnabled(false);
        EditText editText = this.c.ai;
        int i11 = a;
        int i12 = (((i11 | 17) << 1) - (~(-(((~i11) & 17) | (i11 & (-18)))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        editText.setEnabled(true);
        MaritalDiscrepancy maritalDiscrepancy2 = this.c;
        String errorMessage = responseMessage.getErrorMessage();
        int i14 = b + 85;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            af.b(maritalDiscrepancy2, errorMessage, responseMessage.isLogout());
        } else {
            af.b(maritalDiscrepancy2, errorMessage, responseMessage.isLogout());
            int i15 = 2 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        String lowerCase;
        String string;
        String lowerCase2;
        Spinner spinner;
        Spinner spinner2;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 81;
        int i5 = -(-((i3 ^ 81) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        ax.b(this.c.ac);
        int i8 = b + 53;
        a = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                jSONObject.getString("result");
                this.c.ag.k();
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String string2 = jSONObject.getString("result");
                String strK = this.c.ag.k();
                int i9 = b;
                int i10 = i9 & 87;
                int i11 = (i9 | 87) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                JSONObject jSONObject2 = new JSONObject(b.c(string2, b.b(strK), b.b(this.c.ag.m())));
                int i15 = a;
                int i16 = i15 & 13;
                int i17 = (i15 ^ 13) | i16;
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                String string3 = jSONObject2.getString("message".toLowerCase());
                String lowerCase3 = "citizen_status".toLowerCase();
                int i20 = a;
                int i21 = ((i20 & (-54)) | ((~i20) & 53)) + ((i20 & 53) << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
                jSONObject2.getString(lowerCase3);
                if (!string3.equalsIgnoreCase("Cnic Data Found In Nadra")) {
                    this.c.ah.setVisibility(8);
                    int i23 = b;
                    int i24 = ((i23 | 70) << 1) - (i23 ^ 70);
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    this.c.aj.setVisibility(0);
                    int i27 = a;
                    int i28 = (i27 & (-14)) | ((~i27) & 13);
                    int i29 = (i27 & 13) << 1;
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i30 % 128;
                    (i30 % 2 == 0 ? this.c : this.c).ah.setEnabled(false);
                    int i31 = b;
                    int i32 = i31 & 55;
                    int i33 = (i32 - (~((i31 ^ 55) | i32))) - 1;
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    this.c.ai.setEnabled(true);
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
                    int i35 = a;
                    int i36 = (i35 & (-112)) | ((~i35) & 111);
                    int i37 = (i35 & 111) << 1;
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    builder.setTitle("Alert!");
                    builder.setMessage(string3);
                    builder.setCancelable(false);
                    builder.setPositiveButton("OK", new bik(this));
                    int i40 = b;
                    int i41 = (i40 & (-112)) | ((~i40) & 111);
                    int i42 = (i40 & 111) << 1;
                    int i43 = (i41 & i42) + (i42 | i41);
                    a = i43 % 128;
                    if (i43 % 2 == 0) {
                        builder.create().show();
                        return;
                    }
                    builder.create().show();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("data".toLowerCase()));
                int i44 = a;
                int i45 = ((i44 | 63) << 1) - (((~i44) & 63) | (i44 & (-64)));
                b = i45 % 128;
                if (i45 % 2 == 0) {
                    jSONObject3.getString("relation".toLowerCase());
                    lowerCase = "cardStatus".toLowerCase();
                    int i46 = 25 / 0;
                } else {
                    jSONObject3.getString("relation".toLowerCase());
                    lowerCase = "cardStatus".toLowerCase();
                }
                int i47 = a + 117;
                b = i47 % 128;
                int i48 = i47 % 2;
                jSONObject3.getString(lowerCase);
                String string4 = jSONObject3.getString("citizenNumber".toLowerCase());
                int i49 = b;
                int i50 = i49 & 117;
                int i51 = -(-((i49 ^ 117) | i50));
                int i52 = (i50 & i51) + (i51 | i50);
                a = i52 % 128;
                if (i52 % 2 != 0) {
                    string = jSONObject3.getString("name".toLowerCase());
                    lowerCase2 = "gender".toLowerCase();
                    int i53 = 74 / 0;
                } else {
                    string = jSONObject3.getString("name".toLowerCase());
                    lowerCase2 = "gender".toLowerCase();
                }
                jSONObject3.getString(lowerCase2);
                String string5 = jSONObject3.getString("age".toLowerCase());
                int i54 = b + 9;
                a = i54 % 128;
                int i55 = i54 % 2;
                String string6 = jSONObject3.getString("martial_Status".toLowerCase());
                String lowerCase4 = "disability".toLowerCase();
                int i56 = b + 83;
                a = i56 % 128;
                int i57 = i56 % 2;
                jSONObject3.getString(lowerCase4);
                if (!string.equalsIgnoreCase("null")) {
                    int i58 = a;
                    int i59 = i58 | 91;
                    int i60 = (i59 << 1) - ((~(i58 & 91)) & i59);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    try {
                        if (!this.c.aT.equalsIgnoreCase("null")) {
                            int i62 = a;
                            int i63 = i62 & 103;
                            int i64 = (i62 | 103) & (~i63);
                            int i65 = i63 << 1;
                            int i66 = (i64 & i65) + (i64 | i65);
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            if (!string5.equalsIgnoreCase("null")) {
                                int i68 = a + 64;
                                int i69 = (i68 ^ (-1)) + (i68 << 1);
                                b = i69 % 128;
                                try {
                                    if (i69 % 2 == 0) {
                                        string6.equalsIgnoreCase("null");
                                        Object obj2 = null;
                                        try {
                                            obj2.hashCode();
                                            throw null;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    if (!string6.equalsIgnoreCase("null")) {
                                        MaritalDiscrepancy maritalDiscrepancy = this.c;
                                        maritalDiscrepancy.aL = string4;
                                        ArrayList<Item> arrayList = maritalDiscrepancy.aQ;
                                        Spinner spinner3 = maritalDiscrepancy.aW;
                                        ArrayAdapter arrayAdapter = new ArrayAdapter(maritalDiscrepancy, R.layout.spinner_item, arrayList);
                                        int i70 = a + 41;
                                        b = i70 % 128;
                                        int i71 = i70 % 2;
                                        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
                                        spinner3.setAdapter((SpinnerAdapter) arrayAdapter);
                                        am amVar = new am(maritalDiscrepancy, spinner3, arrayList);
                                        int i72 = a;
                                        int i73 = i72 & 73;
                                        int i74 = i73 + ((i72 ^ 73) | i73);
                                        b = i74 % 128;
                                        if (i74 % 2 == 0) {
                                            spinner3.setOnItemSelectedListener(amVar);
                                            string6.equalsIgnoreCase("Widowed");
                                            Object obj3 = null;
                                            try {
                                                obj3.hashCode();
                                                throw null;
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        spinner3.setOnItemSelectedListener(amVar);
                                        boolean zEqualsIgnoreCase = string6.equalsIgnoreCase("Widowed");
                                        int i75 = b;
                                        int i76 = i75 & 31;
                                        int i77 = ((i75 ^ 31) | i76) << 1;
                                        int i78 = -((~i76) & (i75 | 31));
                                        int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                                        a = i79 % 128;
                                        int i80 = i79 % 2;
                                        if (zEqualsIgnoreCase) {
                                            int i81 = i75 & 15;
                                            int i82 = -(-((i75 ^ 15) | i81));
                                            int i83 = (i81 & i82) + (i81 | i82);
                                            a = i83 % 128;
                                            if (i83 % 2 != 0) {
                                                Spinner spinner4 = this.c.aW;
                                                Object obj4 = null;
                                                try {
                                                    obj4.hashCode();
                                                    throw null;
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                            try {
                                                Spinner spinner5 = this.c.aW;
                                                int i84 = a + 3;
                                                b = i84 % 128;
                                                if (i84 % 2 == 0) {
                                                    spinner5.setSelection(3);
                                                    spinner = this.c.aW;
                                                } else {
                                                    spinner5.setSelection(3);
                                                    spinner = this.c.aW;
                                                }
                                                int i85 = b + 31;
                                                a = i85 % 128;
                                                int i86 = i85 % 2;
                                                spinner.setEnabled(false);
                                                int i87 = b + 53;
                                                a = i87 % 128;
                                                int i88 = i87 % 2;
                                            } catch (JSONException unused) {
                                                return;
                                            }
                                        } else if (string6.equalsIgnoreCase("Married")) {
                                            int i89 = b;
                                            int i90 = (((i89 ^ 27) | (i89 & 27)) << 1) - (((~i89) & 27) | (i89 & (-28)));
                                            a = i90 % 128;
                                            int i91 = i90 % 2;
                                            Spinner spinner6 = this.c.aW;
                                            int i92 = a + 29;
                                            b = i92 % 128;
                                            if (i92 % 2 == 0) {
                                                spinner6.setSelection(2);
                                            } else {
                                                spinner6.setSelection(2);
                                            }
                                            this.c.aW.setEnabled(false);
                                            int i93 = a + 7;
                                            b = i93 % 128;
                                            if (i93 % 2 == 0) {
                                                int i94 = 5 / 4;
                                            }
                                        } else if (!(!string6.equalsIgnoreCase("Unmarried"))) {
                                            int i95 = a;
                                            int i96 = (i95 & (-12)) | ((~i95) & 11);
                                            int i97 = -(-((i95 & 11) << 1));
                                            int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                                            b = i98 % 128;
                                            if (i98 % 2 == 0) {
                                                Spinner spinner7 = this.c.aW;
                                                try {
                                                    throw null;
                                                } catch (Throwable th6) {
                                                    throw th6;
                                                }
                                            }
                                            this.c.aW.setSelection(1);
                                            MaritalDiscrepancy maritalDiscrepancy2 = this.c;
                                            int i99 = a;
                                            int i100 = i99 & 45;
                                            int i101 = (i99 | 45) & (~i100);
                                            int i102 = i100 << 1;
                                            int i103 = (i101 ^ i102) + ((i101 & i102) << 1);
                                            b = i103 % 128;
                                            int i104 = i103 % 2;
                                            maritalDiscrepancy2.aW.setEnabled(false);
                                            int i105 = a;
                                            int i106 = ((i105 | 102) << 1) - (i105 ^ 102);
                                            int i107 = (i106 ^ (-1)) + (i106 << 1);
                                            b = i107 % 128;
                                            int i108 = i107 % 2;
                                        } else if (string6.equalsIgnoreCase("divorced")) {
                                            int i109 = a;
                                            int i110 = ((i109 | 36) << 1) - (i109 ^ 36);
                                            int i111 = (i110 ^ (-1)) + (i110 << 1);
                                            b = i111 % 128;
                                            if (i111 % 2 == 0) {
                                                spinner2 = this.c.aW;
                                                i = 5;
                                            } else {
                                                spinner2 = this.c.aW;
                                                i = 4;
                                            }
                                            int i112 = b;
                                            int i113 = (i112 ^ 53) + ((i112 & 53) << 1);
                                            a = i113 % 128;
                                            if (i113 % 2 != 0) {
                                                spinner2.setSelection(i);
                                                Spinner spinner8 = this.c.aW;
                                                try {
                                                    throw null;
                                                } catch (Throwable th7) {
                                                    throw th7;
                                                }
                                            }
                                            spinner2.setSelection(i);
                                            this.c.aW.setEnabled(false);
                                            int i114 = (-2) - ((a + 62) ^ (-1));
                                            b = i114 % 128;
                                            int i115 = i114 % 2;
                                        } else {
                                            Spinner spinner9 = this.c.aW;
                                            int i116 = b;
                                            int i117 = ((i116 & 102) + (i116 | 102)) - 1;
                                            a = i117 % 128;
                                            int i118 = i117 % 2;
                                            spinner9.setSelection(0);
                                            MaritalDiscrepancy maritalDiscrepancy3 = this.c;
                                            int i119 = a + 119;
                                            b = i119 % 128;
                                            if (i119 % 2 == 0) {
                                                maritalDiscrepancy3.aW.setEnabled(false);
                                            } else {
                                                maritalDiscrepancy3.aW.setEnabled(true);
                                            }
                                        }
                                        try {
                                            this.c.ah.setVisibility(0);
                                            TextView textView = this.c.aj;
                                            int i120 = b;
                                            int i121 = i120 & 43;
                                            int i122 = -(-((i120 ^ 43) | i121));
                                            int i123 = (i121 & i122) + (i122 | i121);
                                            a = i123 % 128;
                                            if (i123 % 2 != 0) {
                                                textView.setVisibility(71);
                                                this.c.ah.setEnabled(false);
                                            } else {
                                                textView.setVisibility(8);
                                                this.c.ah.setEnabled(true);
                                            }
                                            this.c.ai.setEnabled(false);
                                            MaritalDiscrepancy maritalDiscrepancy4 = this.c;
                                            RosterItem rosterItem = new RosterItem(maritalDiscrepancy4.aG, maritalDiscrepancy4.ar, string3, BuildConfig.FLAVOR, maritalDiscrepancy4.aL, maritalDiscrepancy4.at, maritalDiscrepancy4.aU, maritalDiscrepancy4.aK, maritalDiscrepancy4.aJ, maritalDiscrepancy4.au, maritalDiscrepancy4.aA, maritalDiscrepancy4.aR, maritalDiscrepancy4.aS, maritalDiscrepancy4.aT, maritalDiscrepancy4.av, maritalDiscrepancy4.aw, maritalDiscrepancy4.aO, maritalDiscrepancy4.aq, maritalDiscrepancy4.al, maritalDiscrepancy4.aP, maritalDiscrepancy4.ay, maritalDiscrepancy4.aN, maritalDiscrepancy4.aC, maritalDiscrepancy4.aD, maritalDiscrepancy4.aV, maritalDiscrepancy4.ax, maritalDiscrepancy4.az, maritalDiscrepancy4.aM, maritalDiscrepancy4.aE, maritalDiscrepancy4.an, maritalDiscrepancy4.aB, maritalDiscrepancy4.ao, maritalDiscrepancy4.ap, maritalDiscrepancy4.am);
                                            int i124 = a;
                                            int i125 = (((i124 ^ 35) | (i124 & 35)) << 1) - (((~i124) & 35) | (i124 & (-36)));
                                            b = i125 % 128;
                                            if (i125 % 2 == 0) {
                                                maritalDiscrepancy4.ae = rosterItem;
                                                Object obj5 = null;
                                                try {
                                                    obj5.hashCode();
                                                    throw null;
                                                } catch (Throwable th8) {
                                                    throw th8;
                                                }
                                            }
                                            maritalDiscrepancy4.ae = rosterItem;
                                            int i126 = a + 31;
                                            b = i126 % 128;
                                            if (i126 % 2 == 0) {
                                                int i127 = 25 / 0;
                                                return;
                                            }
                                            return;
                                        } catch (JSONException unused2) {
                                            return;
                                        }
                                    }
                                    int i128 = a;
                                    int i129 = (((i128 | 102) << 1) - (i128 ^ 102)) - 1;
                                    b = i129 % 128;
                                    int i130 = i129 % 2;
                                } catch (JSONException unused3) {
                                    return;
                                }
                            }
                        }
                    } catch (JSONException unused4) {
                        return;
                    }
                }
                MaritalDiscrepancy maritalDiscrepancy5 = this.c;
                Objects.requireNonNull(maritalDiscrepancy5);
                AlertDialog.Builder builder2 = new AlertDialog.Builder(maritalDiscrepancy5);
                int i131 = b;
                int i132 = i131 & 87;
                int i133 = (i131 ^ 87) | i132;
                int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                a = i134 % 128;
                int i135 = i134 % 2;
                builder2.setTitle("Citizen Validation");
                builder2.setMessage("Citizen data against this member not fetched from NADRA.");
                builder2.setCancelable(true);
                A a2 = new A(maritalDiscrepancy5);
                int i136 = b;
                int i137 = i136 & 11;
                int i138 = -(-(i136 | 11));
                int i139 = (i137 ^ i138) + ((i138 & i137) << 1);
                a = i139 % 128;
                int i140 = i139 % 2;
                builder2.setPositiveButton("Ok", a2);
                AlertDialog alertDialogCreate = builder2.create();
                int i141 = a;
                int i142 = ((i141 ^ 105) | (i141 & 105)) << 1;
                int i143 = -(((~i141) & 105) | (i141 & (-106)));
                int i144 = ((i142 | i143) << 1) - (i143 ^ i142);
                b = i144 % 128;
                int i145 = i144 % 2;
                alertDialogCreate.show();
                int i146 = a;
                int i147 = ((i146 ^ 107) | (i146 & 107)) << 1;
                int i148 = -(((~i146) & 107) | (i146 & (-108)));
                int i149 = (i147 ^ i148) + ((i148 & i147) << 1);
                b = i149 % 128;
                if (i149 % 2 == 0) {
                    throw null;
                }
            } catch (JSONException unused5) {
            }
        } catch (JSONException unused6) {
        }
    }
}
