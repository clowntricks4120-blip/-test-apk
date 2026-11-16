package ivas.gov.bisp.enumeration.p036bi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.activity.UpdateRosterActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateRosterListActivity;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aK implements o00Ooo.OooO0O0<JSONObject> {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ UpdateRosterActivity c;

    public aK(UpdateRosterActivity updateRosterActivity) {
        this.c = updateRosterActivity;
    }

    public void b(Object obj) {
        JSONObject jSONObject;
        UpdateRosterActivity updateRosterActivity;
        String string;
        UpdateRosterActivity updateRosterActivity2;
        String cnic;
        UpdateRosterActivity updateRosterActivity3;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 59) + (i2 | 59);
        a = i3 % 128;
        aK aKVar = null;
        try {
            if (i3 % 2 != 0) {
                jSONObject = (JSONObject) obj;
                updateRosterActivity = this.c;
                int i4 = 88 / 0;
            } else {
                jSONObject = (JSONObject) obj;
                updateRosterActivity = this.c;
            }
            if (updateRosterActivity.bu.isShowing()) {
                int i5 = b;
                int i6 = (i5 ^ 103) + ((i5 & 103) << 1);
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    ProgressDialog progressDialog = this.c.bu;
                    aKVar.hashCode();
                    throw null;
                }
                this.c.bu.dismiss();
                int i7 = b;
                int i8 = ((i7 & 92) + (i7 | 92)) - 1;
                a = i8 % 128;
                int i9 = i8 % 2;
            }
            String string2 = jSONObject.getString("result");
            SessionManager sessionManager = this.c.bg;
            int i10 = a;
            int i11 = i10 & 113;
            int i12 = (i10 | 113) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            b = i14 % 128;
            try {
                if (i14 % 2 == 0) {
                    b.b(sessionManager.k());
                    SessionManager sessionManager2 = this.c.bg;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                JSONObject jSONObject2 = new JSONObject(b.c(string2, b.b(sessionManager.k()), b.b(this.c.bg.m())));
                int i15 = b;
                int i16 = ((i15 | 113) << 1) - (i15 ^ 113);
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    string = jSONObject2.getString("message");
                    updateRosterActivity2 = this.c;
                    int i17 = 53 / 0;
                } else {
                    string = jSONObject2.getString("message");
                    updateRosterActivity2 = this.c;
                }
                Toast.makeText(updateRosterActivity2, string, 0).show();
                UpdateRosterActivity updateRosterActivity4 = this.c;
                int i18 = b;
                int i19 = i18 & 101;
                int i20 = -(-(i18 | 101));
                int i21 = (i19 & i20) + (i20 | i19);
                a = i21 % 128;
                int i22 = i21 % 2;
                updateRosterActivity4.bv = 0;
                EditText editText = updateRosterActivity4.ao;
                int i23 = b;
                int i24 = i23 & 3;
                int i25 = (i23 | 3) & (~i24);
                int i26 = i24 << 1;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                a = i27 % 128;
                int i28 = i27 % 2;
                if (!editText.getText().toString().isEmpty()) {
                    UpdateRosterActivity updateRosterActivity5 = this.c;
                    EditText editText2 = updateRosterActivity5.ao;
                    int i29 = b;
                    int i30 = ((i29 | 62) << 1) - (i29 ^ 62);
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    String string3 = editText2.getText().toString();
                    int i33 = b;
                    int i34 = (i33 | 23) << 1;
                    int i35 = -(i33 ^ 23);
                    int i36 = (i34 & i35) + (i35 | i34);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                    updateRosterActivity5.bA = string3;
                    int i38 = b;
                    int i39 = (i38 ^ 125) + ((i38 & 125) << 1);
                    a = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    int i41 = a;
                    int i42 = i41 & 25;
                    int i43 = i42 + ((i41 ^ 25) | i42);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    this.c.bA = BuildConfig.FLAVOR;
                    int i45 = a + 63;
                    b = i45 % 128;
                    int i46 = i45 % 2;
                }
                Editable text = this.c.at.getText();
                int i47 = a + 31;
                b = i47 % 128;
                int i48 = i47 % 2;
                if (text.toString().isEmpty()) {
                    int i49 = a;
                    int i50 = (i49 & 97) + (i49 | 97);
                    b = i50 % 128;
                    if (i50 % 2 == 0) {
                        this.c.bB = BuildConfig.FLAVOR;
                        int i51 = 10 / 0;
                    } else {
                        this.c.bB = BuildConfig.FLAVOR;
                    }
                } else {
                    UpdateRosterActivity updateRosterActivity6 = this.c;
                    EditText editText3 = updateRosterActivity6.at;
                    int i52 = b;
                    int i53 = i52 & 59;
                    int i54 = -(-((i52 ^ 59) | i53));
                    int i55 = (i53 & i54) + (i54 | i53);
                    a = i55 % 128;
                    int i56 = i55 % 2;
                    String string4 = editText3.getText().toString();
                    int i57 = b;
                    int i58 = i57 & 29;
                    int i59 = -(-((i57 ^ 29) | i58));
                    int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                    a = i60 % 128;
                    if (i60 % 2 != 0) {
                        updateRosterActivity6.bB = string4;
                        int i61 = 14 / 0;
                    } else {
                        updateRosterActivity6.bB = string4;
                    }
                }
                EditText editText4 = this.c.as;
                int i62 = a + 121;
                b = i62 % 128;
                int i63 = i62 % 2;
                if (editText4.getText().toString().isEmpty()) {
                    int i64 = a;
                    int i65 = ((i64 & 35) - (~(-(-(i64 | 35))))) - 1;
                    b = i65 % 128;
                    int i66 = i65 % 2;
                    this.c.bw = BuildConfig.FLAVOR;
                    int i67 = a;
                    int i68 = (i67 ^ 73) + ((i67 & 73) << 1);
                    b = i68 % 128;
                    int i69 = i68 % 2;
                } else {
                    UpdateRosterActivity updateRosterActivity7 = this.c;
                    EditText editText5 = updateRosterActivity7.as;
                    int i70 = b;
                    int i71 = i70 & 103;
                    int i72 = -(-((i70 ^ 103) | i71));
                    int i73 = (i71 & i72) + (i72 | i71);
                    a = i73 % 128;
                    if (i73 % 2 != 0) {
                        updateRosterActivity7.bw = editText5.getText().toString();
                        throw null;
                    }
                    updateRosterActivity7.bw = editText5.getText().toString();
                }
                UpdateRosterActivity updateRosterActivity8 = this.c;
                String str = updateRosterActivity8.bC;
                boolean z = updateRosterActivity8.ai;
                String str2 = updateRosterActivity8.bn;
                String str3 = updateRosterActivity8.bo;
                int optionId = updateRosterActivity8.bd.get(updateRosterActivity8.aE.getSelectedItemPosition()).getOptionId();
                UpdateRosterActivity updateRosterActivity9 = this.c;
                String option = updateRosterActivity9.bd.get(updateRosterActivity9.aE.getSelectedItemPosition()).getOption();
                UpdateRosterActivity updateRosterActivity10 = this.c;
                String str4 = updateRosterActivity10.bt;
                String string5 = updateRosterActivity10.aP.getText().toString();
                UpdateRosterActivity updateRosterActivity11 = this.c;
                int optionId2 = updateRosterActivity11.bk.get(updateRosterActivity11.aM.getSelectedItemPosition()).getOptionId();
                UpdateRosterActivity updateRosterActivity12 = this.c;
                int optionId3 = updateRosterActivity12.aZ.get(updateRosterActivity12.aV.getSelectedItemPosition()).getOptionId();
                UpdateRosterActivity updateRosterActivity13 = this.c;
                String option2 = updateRosterActivity13.aZ.get(updateRosterActivity13.aV.getSelectedItemPosition()).getOption();
                UpdateRosterActivity updateRosterActivity14 = this.c;
                String str5 = updateRosterActivity14.bq;
                String str6 = updateRosterActivity14.bp;
                int optionId4 = updateRosterActivity14.ba.get(updateRosterActivity14.aJ.getSelectedItemPosition()).getOptionId();
                UpdateRosterActivity updateRosterActivity15 = this.c;
                int optionId5 = updateRosterActivity15.bm.get(updateRosterActivity15.aD.getSelectedItemPosition()).getOptionId();
                String string6 = this.c.ar.getText().toString();
                boolean zBooleanValue = this.c.bD.booleanValue();
                StringBuilder sb = new StringBuilder();
                sb.append(this.c.aR.getText().toString());
                int i74 = Integer.parseInt(sb.toString());
                UpdateRosterActivity updateRosterActivity16 = this.c;
                String option3 = updateRosterActivity16.bl.get(updateRosterActivity16.bh.getSelectedItemPosition()).getOption();
                UpdateRosterActivity updateRosterActivity17 = this.c;
                int optionId6 = updateRosterActivity17.bl.get(updateRosterActivity17.bh.getSelectedItemPosition()).getOptionId();
                UpdateRosterActivity updateRosterActivity18 = this.c;
                int optionId7 = updateRosterActivity18.aY.get(updateRosterActivity18.au.getSelectedItemPosition()).getOptionId();
                UpdateRosterActivity updateRosterActivity19 = this.c;
                try {
                    long j = updateRosterActivity19.aj;
                    String option4 = updateRosterActivity19.aX.get(updateRosterActivity19.aN.getSelectedItemPosition()).getOption();
                    UpdateRosterActivity updateRosterActivity20 = this.c;
                    int optionId8 = updateRosterActivity20.aX.get(updateRosterActivity20.aN.getSelectedItemPosition()).getOptionId();
                    UpdateRosterActivity updateRosterActivity21 = this.c;
                    String str7 = updateRosterActivity21.bi;
                    String string7 = updateRosterActivity21.aS.getText().toString();
                    String string8 = this.c.aO.getSelectedItem().toString();
                    String string9 = this.c.aL.getSelectedItem().toString();
                    UpdateRosterActivity updateRosterActivity22 = this.c;
                    RosterItem rosterItem = new RosterItem(str, z, string, str2, str3, optionId, option, str4, string5, optionId2, optionId3, option2, str5, str6, optionId4, optionId5, string6, zBooleanValue, i74, option3, optionId6, string, optionId7, j, option4, optionId8, str7, string7, string8, string9, updateRosterActivity22.bv, updateRosterActivity22.bA, updateRosterActivity22.bB, updateRosterActivity22.bw);
                    int i75 = b + 113;
                    a = i75 % 128;
                    int i76 = i75 % 2;
                    updateRosterActivity8.be = rosterItem;
                    if (BISPApplication.c().w > 0) {
                        int i77 = a + 57;
                        b = i77 % 128;
                        if (i77 % 2 == 0) {
                            BISPApplication.c().v.iterator();
                            throw null;
                        }
                        ArrayList<RosterItem> arrayList = BISPApplication.c().v;
                        int i78 = a;
                        int i79 = i78 & 91;
                        int i80 = ((i78 ^ 91) | i79) << 1;
                        int i81 = -((i78 | 91) & (~i79));
                        int i82 = (i80 & i81) + (i81 | i80);
                        b = i82 % 128;
                        if (i82 % 2 == 0) {
                            throw null;
                        }
                        for (RosterItem rosterItem2 : arrayList) {
                            int i83 = a;
                            int i84 = i83 & 31;
                            int i85 = (i83 | 31) & (~i84);
                            int i86 = i84 << 1;
                            int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                            b = i87 % 128;
                            int i88 = i87 % 2;
                            int i89 = b;
                            int i90 = i89 & 51;
                            int i91 = -(-(i89 | 51));
                            int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                            a = i92 % 128;
                            if (i92 % 2 != 0) {
                                cnic = rosterItem2.getCnic();
                                updateRosterActivity3 = this.c;
                                int i93 = 42 / 0;
                            } else {
                                cnic = rosterItem2.getCnic();
                                updateRosterActivity3 = this.c;
                            }
                            int i94 = a;
                            int i95 = ((i94 | 117) << 1) - (i94 ^ 117);
                            b = i95 % 128;
                            if (i95 % 2 == 0) {
                                cnic.equals(updateRosterActivity3.bo);
                                throw null;
                            }
                            if (cnic.equals(updateRosterActivity3.bo)) {
                                arrayList.remove(rosterItem2);
                                BISPApplication bISPApplicationC = BISPApplication.c();
                                int i96 = a;
                                int i97 = i96 & 13;
                                int i98 = -(-(i96 | 13));
                                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                                b = i99 % 128;
                                if (i99 % 2 == 0) {
                                    bISPApplicationC.w = arrayList.size();
                                    BISPApplication.c();
                                    throw null;
                                }
                                bISPApplicationC.w = arrayList.size();
                                BISPApplication bISPApplicationC2 = BISPApplication.c();
                                int i100 = a;
                                int i101 = (i100 & (-70)) | ((~i100) & 69);
                                int i102 = -(-((i100 & 69) << 1));
                                int i103 = (i101 & i102) + (i102 | i101);
                                b = i103 % 128;
                                if (i103 % 2 == 0) {
                                    bISPApplicationC2.v = arrayList;
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                bISPApplicationC2.v = arrayList;
                            }
                        }
                    }
                    UpdateRosterActivity updateRosterActivity23 = this.c;
                    Intent intent = new Intent(this.c, (Class<?>) UpdateRosterListActivity.class);
                    int i104 = a + 59;
                    b = i104 % 128;
                    if (i104 % 2 == 0) {
                        updateRosterActivity23.startActivity(intent);
                        this.c.finish();
                        throw null;
                    }
                    updateRosterActivity23.startActivity(intent);
                    this.c.finish();
                    int i105 = b;
                    int i106 = i105 & 81;
                    int i107 = -(-((i105 ^ 81) | i106));
                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                    a = i108 % 128;
                    if (i108 % 2 != 0) {
                        throw null;
                    }
                } catch (JSONException unused) {
                    aKVar = this;
                    if (aKVar.c.bu.isShowing()) {
                        int i109 = a + 7;
                        b = i109 % 128;
                        if (i109 % 2 == 0) {
                            aKVar.c.bu.dismiss();
                            throw null;
                        }
                        aKVar.c.bu.dismiss();
                        int i110 = b;
                        int i111 = (((i110 | 84) << 1) - (i110 ^ 84)) - 1;
                        a = i111 % 128;
                        int i112 = i111 % 2;
                    }
                    int i113 = b;
                    int i114 = i113 & 35;
                    int i115 = -(-((i113 ^ 35) | i114));
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    a = i116 % 128;
                    int i117 = i116 % 2;
                }
            } catch (JSONException unused2) {
            }
        } catch (JSONException unused3) {
            aKVar = this;
        }
    }
}
