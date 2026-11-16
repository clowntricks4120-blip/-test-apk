package ivas.gov.bisp.enumeration.p044bq;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.ActivityUnassignedSurvey;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.EnumeratorModel;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ac extends AsyncTask<Void, Void, Void> {
    private static int a = 0;
    private static int b = 1;
    public ProgressDialog c;
    public ActivityUnassignedSurvey.OooO0O0 d;
    public List<Survey> e;
    public Context f;

    public ac(Context context, List<Survey> list, ActivityUnassignedSurvey.OooO0O0 oooO0O0) {
        this.f = context;
        this.e = list;
        this.d = oooO0O0;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r8) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 36) << 1) - (i2 ^ 36)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        super.onPostExecute(r8);
        int i5 = b;
        int i6 = i5 & 1;
        int i7 = -(-((i5 ^ 1) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        a = i9;
        Object obj = null;
        if (i8 % 2 != 0) {
            throw null;
        }
        try {
            ProgressDialog progressDialog = this.c;
            if (progressDialog != null) {
                int i10 = ((i9 & (-76)) | ((~i9) & 75)) + ((i9 & 75) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                if (!(!progressDialog.isShowing())) {
                    int i12 = a;
                    int i13 = i12 & 103;
                    int i14 = (i12 ^ 103) | i13;
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        this.c.dismiss();
                        int i16 = 21 / 0;
                    } else {
                        this.c.dismiss();
                    }
                }
            }
            ActivityUnassignedSurvey.OooO0O0 oooO0O0 = this.d;
            if (oooO0O0 != null) {
                int i17 = b;
                int i18 = (i17 ^ 91) + ((i17 & 91) << 1);
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    ((ActivityUnassignedSurvey.OooO00o) oooO0O0).c();
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((ActivityUnassignedSurvey.OooO00o) oooO0O0).c();
                int i19 = b;
                int i20 = i19 & 91;
                int i21 = (i20 - (~((i19 ^ 91) | i20))) - 1;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 21 / 0;
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        int i23 = a;
        int i24 = i23 & 19;
        int i25 = (i23 | 19) & (~i24);
        int i26 = i24 << 1;
        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
        b = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        int i = 2 % 2;
        try {
            ProgressDialog progressDialog = new ProgressDialog(this.f);
            int i2 = b;
            int i3 = ((i2 & 102) + (i2 | 102)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            this.c = progressDialog;
            progressDialog.setCancelable(false);
            ProgressDialog progressDialog2 = this.c;
            int i5 = a;
            int i6 = i5 ^ 81;
            int i7 = ((i5 & 81) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                progressDialog2.setMessage("Recovering surveys...");
            } else {
                progressDialog2.setMessage("Recovering surveys...");
            }
            this.c.setIndeterminate(true);
            int i10 = a;
            int i11 = (i10 & 19) + (i10 | 19);
            b = i11 % 128;
            int i12 = i11 % 2;
            this.c.show();
            int i13 = b;
            int i14 = ((i13 & 16) + (i13 | 16)) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:22:0x011c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0150  */
    /* JADX WARN: Code duplicated, block: B:26:0x016d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0189  */
    /* JADX WARN: Code duplicated, block: B:30:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0204  */
    /* JADX WARN: Code duplicated, block: B:40:0x020e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0215 A[PHI: r13
  0x0215: PHI (r13v29 int) = (r13v28 int), (r13v39 int) binds: [B:41:0x0213, B:38:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0232  */
    /* JADX WARN: Code duplicated, block: B:45:0x0240  */
    /* JADX WARN: Code duplicated, block: B:48:0x027b  */
    /* JADX WARN: Code duplicated, block: B:49:0x028a  */
    /* JADX WARN: Code duplicated, block: B:53:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0309  */
    /* JADX WARN: Code duplicated, block: B:63:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0435  */
    /* JADX WARN: Code duplicated, block: B:75:0x043c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x043e  */
    /* JADX WARN: Code duplicated, block: B:78:0x044f  */
    /* JADX WARN: Code duplicated, block: B:80:0x045e  */
    /* JADX WARN: Code duplicated, block: B:81:0x046c  */
    /* JADX WARN: Code duplicated, block: B:83:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0512  */
    /* JADX WARN: Code duplicated, block: B:88:0x0521  */
    /* JADX WARN: Code duplicated, block: B:90:0x0534  */
    /* JADX WARN: Code duplicated, block: B:91:0x0539  */
    /* JADX WARN: Code duplicated, block: B:93:0x055b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0588  */
    @Override // android.os.AsyncTask
    public Void doInBackground(Void[] voidArr) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        Survey survey;
        int i4;
        int i5;
        int size;
        String str4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        StringBuilder sbW;
        int i12;
        char c;
        int i13;
        int i14;
        int i15;
        String str5;
        Survey survey2;
        int i16;
        int i17;
        String str6;
        String str7;
        Survey survey3;
        int i18;
        String str8;
        Survey survey4;
        int i19;
        String[] strArr;
        StringBuilder sbW2;
        int i20;
        int i21;
        int i22;
        List listFind;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31 = 2;
        int i32 = 2 % 2;
        List<Survey> list = this.e;
        if (list != null) {
            int i33 = b + 79;
            a = i33 % 128;
            if (i33 % 2 != 0) {
                list.size();
                throw null;
            }
            if (list.size() > 0) {
                int i34 = a;
                int i35 = 1;
                int i36 = ((((i34 ^ 47) | (i34 & 47)) << 1) - (~(-(((~i34) & 47) | (i34 & (-48)))))) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
                int i38 = 0;
                String str9 = list.get(0).batchName;
                int i39 = b;
                int i40 = i39 & 5;
                int i41 = ((i39 ^ 5) | i40) << 1;
                int i42 = -((i39 | 5) & (~i40));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                int i44 = i43 % 128;
                a = i44;
                if (i43 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i45 = i44 & 21;
                int i46 = (((i44 ^ 21) | i45) << 1) - ((~i45) & (i44 | 21));
                b = i46 % 128;
                int i47 = i46 % 2;
                int i48 = i44 & 5;
                int i49 = (i44 | 5) & (~i48);
                int i50 = -(-(i48 << 1));
                int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                b = i51 % 128;
                int i52 = i51 % 2;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int enumeratorId = 0;
                String str10 = BuildConfig.FLAVOR;
                String str11 = str10;
                String str12 = str11;
                String enumeratorName = str12;
                String enumeratorImei = enumeratorName;
                String enumeratorCnic = enumeratorImei;
                String enumeratorContact = enumeratorCnic;
                List listFind2 = null;
                while (i53 < list.size()) {
                    Survey survey5 = list.get(i53);
                    int i57 = a;
                    int i58 = i57 & 41;
                    int i59 = (i57 | 41) & (~i58);
                    int i60 = i58 << i35;
                    int i61 = ((i59 | i60) << i35) - (i59 ^ i60);
                    b = i61 % 128;
                    if (i61 % i31 == 0) {
                        int i62 = 42 / i38;
                        if (((str9.equalsIgnoreCase(survey5.batchName) ? 1 : 0) ^ i35) != i35) {
                            i = i53;
                            int i63 = b + 105;
                            a = i63 % 128;
                            int i64 = i63 % i31;
                            int i65 = i54 & 1;
                            int i66 = ((i54 ^ 1) | i65) << 1;
                            int i67 = -((~i65) & (i54 | 1));
                            i2 = ((i66 | i67) << 1) - (i66 ^ i67);
                            Survey survey6 = list.get(i);
                            int i68 = a;
                            int i69 = ((i68 ^ 68) + ((i68 & 68) << 1)) - 1;
                            b = i69 % 128;
                            int i70 = i69 % i31;
                            i3 = survey6.appVersion;
                            Survey survey7 = list.get(i);
                            int i71 = a;
                            int i72 = i71 & 107;
                            int i73 = (((i71 ^ 107) | i72) << 1) - ((i71 | 107) & (~i72));
                            b = i73 % 128;
                            int i74 = i73 % i31;
                            str = survey7.appVersionName;
                            Survey survey8 = list.get(i);
                            int i75 = a;
                            int i76 = i75 & 105;
                            int i77 = i76 + ((i75 ^ 105) | i76);
                            b = i77 % 128;
                            int i78 = i77 % i31;
                            str2 = survey8.startTime;
                            Survey survey9 = list.get(i);
                            int i79 = a;
                            int i80 = (i79 & (-120)) | (119 & (~i79));
                            int i81 = (i79 & 119) << 1;
                            int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                            b = i82 % 128;
                            int i83 = i82 % i31;
                            str3 = survey9.supervisorSentTimeStamp;
                            survey = list.get(i);
                            int i84 = b;
                            int i85 = ((i84 | 31) << 1) - (i84 ^ 31);
                            a = i85 % 128;
                            int i86 = i85 % i31;
                            if (survey.visit_status_id == 3) {
                                i55++;
                                int i87 = b + 53;
                                a = i87 % 128;
                                int i88 = i87 % i31;
                            }
                            i4 = i55;
                            if (listFind2 == null) {
                                int i89 = a + 119;
                                b = i89 % 128;
                                int i90 = i89 % i31;
                                String[] strArr2 = new String[1];
                                sbW = j.w(BuildConfig.FLAVOR);
                                int i91 = b;
                                int i92 = ((i91 ^ 15) | (i91 & 15)) << 1;
                                int i93 = -((i91 & (-16)) | ((~i91) & 15));
                                i12 = (i92 ^ i93) + ((i92 & i93) << 1);
                                a = i12 % 128;
                                if (i12 % i31 != 0) {
                                    sbW.append(list.get(i).enumerator_id);
                                    c = 0;
                                    int i94 = 37 / 0;
                                } else {
                                    c = 0;
                                    sbW.append(list.get(i).enumerator_id);
                                }
                                strArr2[c] = sbW.toString();
                                int i95 = b;
                                int i96 = i95 & 61;
                                int i97 = (~i96) & (i95 | 61);
                                int i98 = i96 << 1;
                                int i99 = (i97 & i98) + (i97 | i98);
                                a = i99 % 128;
                                int i100 = i99 % 2;
                                listFind2 = SugarRecord.find(EnumeratorModel.class, "enumerator_id=?", strArr2);
                                i13 = a;
                                i14 = ((i13 | 37) << 1) - (i13 ^ 37);
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i101 = 91 / 0;
                                    if (listFind2 != null) {
                                        int i102 = (i13 & 107) + (i13 | 107);
                                        b = i102 % 128;
                                        int i103 = i102 % 2;
                                        if (listFind2.size() > 0) {
                                            int i104 = a;
                                            i15 = (i104 & 31) + (i104 | 31);
                                            b = i15 % 128;
                                            if (i15 % 2 == 0) {
                                                enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                            } else {
                                                enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                            }
                                            int i105 = a + 37;
                                            b = i105 % 128;
                                            int i106 = i105 % 2;
                                            enumeratorName = ((EnumeratorModel) listFind2.get(0)).getEnumeratorName();
                                            int i107 = a;
                                            int i108 = (i107 | 97) << 1;
                                            int i109 = -(((~i107) & 97) | (i107 & (-98)));
                                            int i110 = (i108 & i109) + (i109 | i108);
                                            b = i110 % 128;
                                            int i111 = i110 % 2;
                                            enumeratorContact = ((EnumeratorModel) listFind2.get(0)).getEnumeratorContact();
                                            int i112 = b;
                                            int i113 = i112 & 45;
                                            int i114 = i113 + ((i112 ^ 45) | i113);
                                            a = i114 % 128;
                                            int i115 = i114 % 2;
                                            enumeratorCnic = ((EnumeratorModel) listFind2.get(0)).getEnumeratorCnic();
                                            int i116 = a;
                                            int i117 = i116 & 107;
                                            int i118 = (i116 ^ 107) | i117;
                                            int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                                            b = i119 % 128;
                                            int i120 = i119 % 2;
                                            enumeratorImei = ((EnumeratorModel) listFind2.get(0)).getEnumeratorImei();
                                            int i121 = b;
                                            int i122 = i121 & 41;
                                            int i123 = (i121 ^ 41) | i122;
                                            int i124 = (i122 & i123) + (i123 | i122);
                                            a = i124 % 128;
                                            int i125 = i124 % 2;
                                        }
                                    }
                                } else if (listFind2 != null) {
                                    int i1010 = (i13 & 107) + (i13 | 107);
                                    b = i1010 % 128;
                                    int i1011 = i1010 % 2;
                                    if (listFind2.size() > 0) {
                                        int i1012 = a;
                                        i15 = (i1012 & 31) + (i1012 | 31);
                                        b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                        } else {
                                            enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                        }
                                        int i1013 = a + 37;
                                        b = i1013 % 128;
                                        int i1014 = i1013 % 2;
                                        enumeratorName = ((EnumeratorModel) listFind2.get(0)).getEnumeratorName();
                                        int i1015 = a;
                                        int i1016 = (i1015 | 97) << 1;
                                        int i1017 = -(((~i1015) & 97) | (i1015 & (-98)));
                                        int i1110 = (i1016 & i1017) + (i1017 | i1016);
                                        b = i1110 % 128;
                                        int i1111 = i1110 % 2;
                                        enumeratorContact = ((EnumeratorModel) listFind2.get(0)).getEnumeratorContact();
                                        int i1112 = b;
                                        int i1113 = i1112 & 45;
                                        int i1114 = i1113 + ((i1112 ^ 45) | i1113);
                                        a = i1114 % 128;
                                        int i1115 = i1114 % 2;
                                        enumeratorCnic = ((EnumeratorModel) listFind2.get(0)).getEnumeratorCnic();
                                        int i1116 = a;
                                        int i1117 = i1116 & 107;
                                        int i1118 = (i1116 ^ 107) | i1117;
                                        int i1119 = ((i1117 | i1118) << 1) - (i1118 ^ i1117);
                                        b = i1119 % 128;
                                        int i126 = i1119 % 2;
                                        enumeratorImei = ((EnumeratorModel) listFind2.get(0)).getEnumeratorImei();
                                        int i127 = b;
                                        int i128 = i127 & 41;
                                        int i129 = (i127 ^ 41) | i128;
                                        int i1210 = (i128 & i129) + (i129 | i128);
                                        a = i1210 % 128;
                                        int i1211 = i1210 % 2;
                                    }
                                }
                            } else {
                                int i130 = b;
                                int i131 = i130 & 89;
                                i5 = ((((i130 ^ 89) | i131) << 1) - (~(-((i130 | 89) & (~i131))))) - 1;
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i132 = 26 / 0;
                                }
                            }
                            size = list.size();
                            if (i == (size ^ (-1)) + (size << 1)) {
                                int i133 = b;
                                i11 = (((i133 | 27) << 1) - (~(-(i133 ^ 27)))) - 1;
                                a = i11 % 128;
                                if (i11 % 2 != 0) {
                                    i7 = 0;
                                    int i134 = 38 / 0;
                                } else {
                                    i7 = 0;
                                }
                                str4 = str;
                                i6 = i3;
                                ag.d(str2, str3, str9, enumeratorId, enumeratorName, enumeratorImei, enumeratorCnic, enumeratorContact, i2, i4, i6, str4);
                                listFind2 = null;
                            } else {
                                str4 = str;
                                i6 = i3;
                                i7 = 0;
                            }
                            i8 = b;
                            int i135 = i8 & 85;
                            int i136 = -(-((i8 ^ 85) | i135));
                            int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                            a = i137 % 128;
                            int i138 = i137 % 2;
                            int i139 = i8 ^ 35;
                            i9 = 1;
                            i10 = (((i8 & 35) | i139) << 1) - i139;
                            a = i10 % 128;
                            if (i10 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i140 = i8 + 97;
                            a = i140 % 128;
                            int i141 = i140 % 2;
                            str11 = str3;
                            i55 = i4;
                            i54 = i2;
                            str10 = str2;
                            str12 = str4;
                            i56 = i6;
                        } else {
                            int i142 = a;
                            int i143 = ((i142 ^ 101) | (i142 & 101)) << i35;
                            int i144 = -(((~i142) & 101) | (i142 & (-102)));
                            int i145 = (i143 & i144) + (i144 | i143);
                            b = i145 % 128;
                            int i146 = i145 % i31;
                            i = i53;
                            ag.d(str10, str11, str9, enumeratorId, enumeratorName, enumeratorImei, enumeratorCnic, enumeratorContact, i54, i55, i56, str12);
                            Survey survey10 = list.get(i);
                            int i147 = a + 103;
                            b = i147 % 128;
                            int i148 = i147 % i31;
                            str5 = survey10.batchName;
                            survey2 = list.get(i);
                            int i149 = b;
                            i16 = (i149 ^ 21) + ((i149 & 21) << i35);
                            a = i16 % 128;
                            if (i16 % i31 == 0) {
                                Object obj3 = null;
                                int i150 = survey2.appVersion;
                                list.get(i);
                                obj3.hashCode();
                                throw null;
                            }
                            i17 = survey2.appVersion;
                            str6 = list.get(i).appVersionName;
                            Survey survey11 = list.get(i);
                            int i151 = (-2) - ((a + 66) ^ (-1));
                            b = i151 % 128;
                            int i152 = i151 % i31;
                            str7 = survey11.startTime;
                            survey3 = list.get(i);
                            int i153 = a;
                            i18 = ((i153 | 123) << i35) - (i153 ^ 123);
                            b = i18 % 128;
                            if (i18 % i31 != 0) {
                                Object obj4 = null;
                                String str13 = survey3.supervisorSentTimeStamp;
                                list.get(i);
                                obj4.hashCode();
                                throw null;
                            }
                            str8 = survey3.supervisorSentTimeStamp;
                            survey4 = list.get(i);
                            int i154 = b;
                            int i155 = i154 & 77;
                            int i156 = (i155 - (~((i154 ^ 77) | i155))) - i35;
                            a = i156 % 128;
                            int i157 = i156 % i31;
                            if (survey4.visit_status_id == 3) {
                                int i158 = a;
                                int i159 = (i158 ^ 117) + ((i158 & 117) << i35);
                                int i160 = i159 % 128;
                                b = i160;
                                int i161 = i159 % i31;
                                int i162 = i160 & 43;
                                int i163 = ((i160 | 43) & (~i162)) + (i162 << i35);
                                a = i163 % 128;
                                int i164 = i163 % i31;
                                i19 = i35;
                            } else {
                                i19 = 0;
                            }
                            strArr = new String[i35];
                            sbW2 = j.w(BuildConfig.FLAVOR);
                            int i165 = a + 45;
                            b = i165 % 128;
                            int i166 = i165 % i31;
                            i20 = list.get(i).enumerator_id;
                            int i167 = b;
                            i21 = (i167 & 71) + (i167 | 71);
                            a = i21 % 128;
                            if (i21 % i31 != 0) {
                                sbW2.append(i20);
                                i22 = 1;
                                strArr[1] = sbW2.toString();
                            } else {
                                i22 = 1;
                                sbW2.append(i20);
                                strArr[0] = sbW2.toString();
                            }
                            int i168 = b;
                            int i169 = (i168 | 109) << i22;
                            int i170 = -((109 & (~i168)) | (i168 & (-110)));
                            int i171 = (i169 ^ i170) + ((i170 & i169) << i22);
                            a = i171 % 128;
                            int i172 = i171 % i31;
                            listFind = SugarRecord.find(EnumeratorModel.class, "enumerator_id=?", strArr);
                            int i173 = a;
                            i23 = (i173 ^ 15) + ((i173 & 15) << 1);
                            i24 = i23 % 128;
                            b = i24;
                            if (i23 % i31 != 0) {
                                throw null;
                            }
                            if (listFind != null) {
                                int i174 = i24 + 100;
                                i26 = (i174 ^ (-1)) + (i174 << 1);
                                a = i26 % 128;
                                if (i26 % i31 != 0) {
                                    i27 = 0;
                                    int i175 = 7 / 0;
                                    if (listFind.size() > 0) {
                                        enumeratorId = ((EnumeratorModel) listFind.get(i27)).getEnumeratorId();
                                        int i176 = a;
                                        int i177 = i176 & 23;
                                        int i178 = -(-(i176 | 23));
                                        i28 = (i177 & i178) + (i178 | i177);
                                        b = i28 % 128;
                                        if (i28 % i31 == 0) {
                                            enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                        } else {
                                            enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                        }
                                        int i179 = b;
                                        int i180 = i179 & 69;
                                        int i181 = ((i179 ^ 69) | i180) << 1;
                                        int i182 = -((i179 | 69) & (~i180));
                                        int i183 = (i181 ^ i182) + ((i182 & i181) << 1);
                                        a = i183 % 128;
                                        int i184 = i183 % i31;
                                        enumeratorContact = ((EnumeratorModel) listFind.get(0)).getEnumeratorContact();
                                        i29 = a + 97;
                                        b = i29 % 128;
                                        if (i29 % i31 == 0) {
                                            enumeratorCnic = ((EnumeratorModel) listFind.get(1)).getEnumeratorCnic();
                                            i30 = 0;
                                        } else {
                                            i30 = 0;
                                            enumeratorCnic = ((EnumeratorModel) listFind.get(0)).getEnumeratorCnic();
                                        }
                                        enumeratorImei = ((EnumeratorModel) listFind.get(i30)).getEnumeratorImei();
                                        int i185 = a;
                                        int i186 = ((i185 | 117) << 1) - (i185 ^ 117);
                                        b = i186 % 128;
                                        int i187 = i186 % i31;
                                    }
                                } else {
                                    i27 = 0;
                                    if (listFind.size() > 0) {
                                        enumeratorId = ((EnumeratorModel) listFind.get(i27)).getEnumeratorId();
                                        int i1710 = a;
                                        int i1711 = i1710 & 23;
                                        int i1712 = -(-(i1710 | 23));
                                        i28 = (i1711 & i1712) + (i1712 | i1711);
                                        b = i28 % 128;
                                        if (i28 % i31 == 0) {
                                            enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                        } else {
                                            enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                        }
                                        int i1713 = b;
                                        int i188 = i1713 & 69;
                                        int i189 = ((i1713 ^ 69) | i188) << 1;
                                        int i1810 = -((i1713 | 69) & (~i188));
                                        int i1811 = (i189 ^ i1810) + ((i1810 & i189) << 1);
                                        a = i1811 % 128;
                                        int i1812 = i1811 % i31;
                                        enumeratorContact = ((EnumeratorModel) listFind.get(0)).getEnumeratorContact();
                                        i29 = a + 97;
                                        b = i29 % 128;
                                        if (i29 % i31 == 0) {
                                            enumeratorCnic = ((EnumeratorModel) listFind.get(1)).getEnumeratorCnic();
                                            i30 = 0;
                                        } else {
                                            i30 = 0;
                                            enumeratorCnic = ((EnumeratorModel) listFind.get(0)).getEnumeratorCnic();
                                        }
                                        enumeratorImei = ((EnumeratorModel) listFind.get(i30)).getEnumeratorImei();
                                        int i1813 = a;
                                        int i1814 = ((i1813 | 117) << 1) - (i1813 ^ 117);
                                        b = i1814 % 128;
                                        int i1815 = i1814 % i31;
                                    }
                                }
                            }
                            int i190 = b;
                            int i191 = (i190 ^ 45) + ((i190 & 45) << 1);
                            a = i191 % 128;
                            int i192 = i191 % i31;
                            i25 = i190 + 99;
                            a = i25 % 128;
                            if (i25 % i31 != 0) {
                                int i193 = 36 / 0;
                            }
                            int i194 = i190 & 71;
                            int i195 = ((i190 ^ 71) | i194) << 1;
                            int i196 = -((i190 | 71) & (~i194));
                            int i197 = (i195 & i196) + (i196 | i195);
                            a = i197 % 128;
                            int i198 = i197 % i31;
                            i55 = i19;
                            str9 = str5;
                            i56 = i17;
                            str12 = str6;
                            str10 = str7;
                            str11 = str8;
                            i7 = 0;
                            i9 = 1;
                            i54 = 1;
                            listFind2 = listFind;
                        }
                    } else if (str9.equalsIgnoreCase(survey5.batchName) != i35) {
                        int i1410 = a;
                        int i1411 = ((i1410 ^ 101) | (i1410 & 101)) << i35;
                        int i1412 = -(((~i1410) & 101) | (i1410 & (-102)));
                        int i1413 = (i1411 & i1412) + (i1412 | i1411);
                        b = i1413 % 128;
                        int i1414 = i1413 % i31;
                        i = i53;
                        ag.d(str10, str11, str9, enumeratorId, enumeratorName, enumeratorImei, enumeratorCnic, enumeratorContact, i54, i55, i56, str12);
                        Survey survey12 = list.get(i);
                        int i1415 = a + 103;
                        b = i1415 % 128;
                        int i1416 = i1415 % i31;
                        str5 = survey12.batchName;
                        survey2 = list.get(i);
                        int i1417 = b;
                        i16 = (i1417 ^ 21) + ((i1417 & 21) << i35);
                        a = i16 % 128;
                        if (i16 % i31 == 0) {
                            Object obj5 = null;
                            int i1510 = survey2.appVersion;
                            list.get(i);
                            obj5.hashCode();
                            throw null;
                        }
                        i17 = survey2.appVersion;
                        str6 = list.get(i).appVersionName;
                        Survey survey13 = list.get(i);
                        int i1511 = (-2) - ((a + 66) ^ (-1));
                        b = i1511 % 128;
                        int i1512 = i1511 % i31;
                        str7 = survey13.startTime;
                        survey3 = list.get(i);
                        int i1513 = a;
                        i18 = ((i1513 | 123) << i35) - (i1513 ^ 123);
                        b = i18 % 128;
                        if (i18 % i31 != 0) {
                            Object obj6 = null;
                            String str14 = survey3.supervisorSentTimeStamp;
                            list.get(i);
                            obj6.hashCode();
                            throw null;
                        }
                        str8 = survey3.supervisorSentTimeStamp;
                        survey4 = list.get(i);
                        int i1514 = b;
                        int i1515 = i1514 & 77;
                        int i1516 = (i1515 - (~((i1514 ^ 77) | i1515))) - i35;
                        a = i1516 % 128;
                        int i1517 = i1516 % i31;
                        if (survey4.visit_status_id == 3) {
                            int i1518 = a;
                            int i1519 = (i1518 ^ 117) + ((i1518 & 117) << i35);
                            int i1610 = i1519 % 128;
                            b = i1610;
                            int i1611 = i1519 % i31;
                            int i1612 = i1610 & 43;
                            int i1613 = ((i1610 | 43) & (~i1612)) + (i1612 << i35);
                            a = i1613 % 128;
                            int i1614 = i1613 % i31;
                            i19 = i35;
                        } else {
                            i19 = 0;
                        }
                        strArr = new String[i35];
                        sbW2 = j.w(BuildConfig.FLAVOR);
                        int i1615 = a + 45;
                        b = i1615 % 128;
                        int i1616 = i1615 % i31;
                        i20 = list.get(i).enumerator_id;
                        int i1617 = b;
                        i21 = (i1617 & 71) + (i1617 | 71);
                        a = i21 % 128;
                        if (i21 % i31 != 0) {
                            sbW2.append(i20);
                            i22 = 1;
                            strArr[1] = sbW2.toString();
                        } else {
                            i22 = 1;
                            sbW2.append(i20);
                            strArr[0] = sbW2.toString();
                        }
                        int i1618 = b;
                        int i1619 = (i1618 | 109) << i22;
                        int i1714 = -((109 & (~i1618)) | (i1618 & (-110)));
                        int i1715 = (i1619 ^ i1714) + ((i1714 & i1619) << i22);
                        a = i1715 % 128;
                        int i1716 = i1715 % i31;
                        listFind = SugarRecord.find(EnumeratorModel.class, "enumerator_id=?", strArr);
                        int i1717 = a;
                        i23 = (i1717 ^ 15) + ((i1717 & 15) << 1);
                        i24 = i23 % 128;
                        b = i24;
                        if (i23 % i31 != 0) {
                            throw null;
                        }
                        if (listFind != null) {
                            int i1718 = i24 + 100;
                            i26 = (i1718 ^ (-1)) + (i1718 << 1);
                            a = i26 % 128;
                            if (i26 % i31 != 0) {
                                i27 = 0;
                                int i1719 = 7 / 0;
                                if (listFind.size() > 0) {
                                    enumeratorId = ((EnumeratorModel) listFind.get(i27)).getEnumeratorId();
                                    int i17110 = a;
                                    int i17111 = i17110 & 23;
                                    int i17112 = -(-(i17110 | 23));
                                    i28 = (i17111 & i17112) + (i17112 | i17111);
                                    b = i28 % 128;
                                    if (i28 % i31 == 0) {
                                        enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                    } else {
                                        enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                    }
                                    int i17113 = b;
                                    int i1816 = i17113 & 69;
                                    int i1817 = ((i17113 ^ 69) | i1816) << 1;
                                    int i1818 = -((i17113 | 69) & (~i1816));
                                    int i1819 = (i1817 ^ i1818) + ((i1818 & i1817) << 1);
                                    a = i1819 % 128;
                                    int i18110 = i1819 % i31;
                                    enumeratorContact = ((EnumeratorModel) listFind.get(0)).getEnumeratorContact();
                                    i29 = a + 97;
                                    b = i29 % 128;
                                    if (i29 % i31 == 0) {
                                        enumeratorCnic = ((EnumeratorModel) listFind.get(1)).getEnumeratorCnic();
                                        i30 = 0;
                                    } else {
                                        i30 = 0;
                                        enumeratorCnic = ((EnumeratorModel) listFind.get(0)).getEnumeratorCnic();
                                    }
                                    enumeratorImei = ((EnumeratorModel) listFind.get(i30)).getEnumeratorImei();
                                    int i18111 = a;
                                    int i18112 = ((i18111 | 117) << 1) - (i18111 ^ 117);
                                    b = i18112 % 128;
                                    int i18113 = i18112 % i31;
                                }
                            } else {
                                i27 = 0;
                                if (listFind.size() > 0) {
                                    enumeratorId = ((EnumeratorModel) listFind.get(i27)).getEnumeratorId();
                                    int i17114 = a;
                                    int i17115 = i17114 & 23;
                                    int i17116 = -(-(i17114 | 23));
                                    i28 = (i17115 & i17116) + (i17116 | i17115);
                                    b = i28 % 128;
                                    if (i28 % i31 == 0) {
                                        enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                    } else {
                                        enumeratorName = ((EnumeratorModel) listFind.get(0)).getEnumeratorName();
                                    }
                                    int i17117 = b;
                                    int i18114 = i17117 & 69;
                                    int i18115 = ((i17117 ^ 69) | i18114) << 1;
                                    int i18116 = -((i17117 | 69) & (~i18114));
                                    int i18117 = (i18115 ^ i18116) + ((i18116 & i18115) << 1);
                                    a = i18117 % 128;
                                    int i18118 = i18117 % i31;
                                    enumeratorContact = ((EnumeratorModel) listFind.get(0)).getEnumeratorContact();
                                    i29 = a + 97;
                                    b = i29 % 128;
                                    if (i29 % i31 == 0) {
                                        enumeratorCnic = ((EnumeratorModel) listFind.get(1)).getEnumeratorCnic();
                                        i30 = 0;
                                    } else {
                                        i30 = 0;
                                        enumeratorCnic = ((EnumeratorModel) listFind.get(0)).getEnumeratorCnic();
                                    }
                                    enumeratorImei = ((EnumeratorModel) listFind.get(i30)).getEnumeratorImei();
                                    int i18119 = a;
                                    int i181110 = ((i18119 | 117) << 1) - (i18119 ^ 117);
                                    b = i181110 % 128;
                                    int i181111 = i181110 % i31;
                                }
                            }
                        }
                        int i199 = b;
                        int i1910 = (i199 ^ 45) + ((i199 & 45) << 1);
                        a = i1910 % 128;
                        int i1911 = i1910 % i31;
                        i25 = i199 + 99;
                        a = i25 % 128;
                        if (i25 % i31 != 0) {
                            int i1912 = 36 / 0;
                        }
                        int i1913 = i199 & 71;
                        int i1914 = ((i199 ^ 71) | i1913) << 1;
                        int i1915 = -((i199 | 71) & (~i1913));
                        int i1916 = (i1914 & i1915) + (i1915 | i1914);
                        a = i1916 % 128;
                        int i1917 = i1916 % i31;
                        i55 = i19;
                        str9 = str5;
                        i56 = i17;
                        str12 = str6;
                        str10 = str7;
                        str11 = str8;
                        i7 = 0;
                        i9 = 1;
                        i54 = 1;
                        listFind2 = listFind;
                    } else {
                        i = i53;
                        int i610 = b + 105;
                        a = i610 % 128;
                        int i611 = i610 % i31;
                        int i612 = i54 & 1;
                        int i613 = ((i54 ^ 1) | i612) << 1;
                        int i614 = -((~i612) & (i54 | 1));
                        i2 = ((i613 | i614) << 1) - (i613 ^ i614);
                        Survey survey14 = list.get(i);
                        int i615 = a;
                        int i616 = ((i615 ^ 68) + ((i615 & 68) << 1)) - 1;
                        b = i616 % 128;
                        int i710 = i616 % i31;
                        i3 = survey14.appVersion;
                        Survey survey15 = list.get(i);
                        int i711 = a;
                        int i712 = i711 & 107;
                        int i713 = (((i711 ^ 107) | i712) << 1) - ((i711 | 107) & (~i712));
                        b = i713 % 128;
                        int i714 = i713 % i31;
                        str = survey15.appVersionName;
                        Survey survey16 = list.get(i);
                        int i715 = a;
                        int i716 = i715 & 105;
                        int i717 = i716 + ((i715 ^ 105) | i716);
                        b = i717 % 128;
                        int i718 = i717 % i31;
                        str2 = survey16.startTime;
                        Survey survey17 = list.get(i);
                        int i719 = a;
                        int i810 = (i719 & (-120)) | (119 & (~i719));
                        int i811 = (i719 & 119) << 1;
                        int i812 = (i810 ^ i811) + ((i811 & i810) << 1);
                        b = i812 % 128;
                        int i813 = i812 % i31;
                        str3 = survey17.supervisorSentTimeStamp;
                        survey = list.get(i);
                        int i814 = b;
                        int i815 = ((i814 | 31) << 1) - (i814 ^ 31);
                        a = i815 % 128;
                        int i816 = i815 % i31;
                        if (survey.visit_status_id == 3) {
                            i55++;
                            int i817 = b + 53;
                            a = i817 % 128;
                            int i818 = i817 % i31;
                        }
                        i4 = i55;
                        if (listFind2 == null) {
                            int i819 = a + 119;
                            b = i819 % 128;
                            int i910 = i819 % i31;
                            String[] strArr3 = new String[1];
                            sbW = j.w(BuildConfig.FLAVOR);
                            int i911 = b;
                            int i912 = ((i911 ^ 15) | (i911 & 15)) << 1;
                            int i913 = -((i911 & (-16)) | ((~i911) & 15));
                            i12 = (i912 ^ i913) + ((i912 & i913) << 1);
                            a = i12 % 128;
                            if (i12 % i31 != 0) {
                                sbW.append(list.get(i).enumerator_id);
                                c = 0;
                                int i914 = 37 / 0;
                            } else {
                                c = 0;
                                sbW.append(list.get(i).enumerator_id);
                            }
                            strArr3[c] = sbW.toString();
                            int i915 = b;
                            int i916 = i915 & 61;
                            int i917 = (~i916) & (i915 | 61);
                            int i918 = i916 << 1;
                            int i919 = (i917 & i918) + (i917 | i918);
                            a = i919 % 128;
                            int i1018 = i919 % 2;
                            listFind2 = SugarRecord.find(EnumeratorModel.class, "enumerator_id=?", strArr3);
                            i13 = a;
                            i14 = ((i13 | 37) << 1) - (i13 ^ 37);
                            b = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i1019 = 91 / 0;
                                if (listFind2 != null) {
                                    int i10110 = (i13 & 107) + (i13 | 107);
                                    b = i10110 % 128;
                                    int i10111 = i10110 % 2;
                                    if (listFind2.size() > 0) {
                                        int i10112 = a;
                                        i15 = (i10112 & 31) + (i10112 | 31);
                                        b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                        } else {
                                            enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                        }
                                        int i10113 = a + 37;
                                        b = i10113 % 128;
                                        int i10114 = i10113 % 2;
                                        enumeratorName = ((EnumeratorModel) listFind2.get(0)).getEnumeratorName();
                                        int i10115 = a;
                                        int i10116 = (i10115 | 97) << 1;
                                        int i10117 = -(((~i10115) & 97) | (i10115 & (-98)));
                                        int i11110 = (i10116 & i10117) + (i10117 | i10116);
                                        b = i11110 % 128;
                                        int i11111 = i11110 % 2;
                                        enumeratorContact = ((EnumeratorModel) listFind2.get(0)).getEnumeratorContact();
                                        int i11112 = b;
                                        int i11113 = i11112 & 45;
                                        int i11114 = i11113 + ((i11112 ^ 45) | i11113);
                                        a = i11114 % 128;
                                        int i11115 = i11114 % 2;
                                        enumeratorCnic = ((EnumeratorModel) listFind2.get(0)).getEnumeratorCnic();
                                        int i11116 = a;
                                        int i11117 = i11116 & 107;
                                        int i11118 = (i11116 ^ 107) | i11117;
                                        int i11119 = ((i11117 | i11118) << 1) - (i11118 ^ i11117);
                                        b = i11119 % 128;
                                        int i1212 = i11119 % 2;
                                        enumeratorImei = ((EnumeratorModel) listFind2.get(0)).getEnumeratorImei();
                                        int i1213 = b;
                                        int i1214 = i1213 & 41;
                                        int i1215 = (i1213 ^ 41) | i1214;
                                        int i1216 = (i1214 & i1215) + (i1215 | i1214);
                                        a = i1216 % 128;
                                        int i1217 = i1216 % 2;
                                    }
                                }
                            } else if (listFind2 != null) {
                                int i10118 = (i13 & 107) + (i13 | 107);
                                b = i10118 % 128;
                                int i10119 = i10118 % 2;
                                if (listFind2.size() > 0) {
                                    int i101110 = a;
                                    i15 = (i101110 & 31) + (i101110 | 31);
                                    b = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                    } else {
                                        enumeratorId = ((EnumeratorModel) listFind2.get(0)).getEnumeratorId();
                                    }
                                    int i101111 = a + 37;
                                    b = i101111 % 128;
                                    int i101112 = i101111 % 2;
                                    enumeratorName = ((EnumeratorModel) listFind2.get(0)).getEnumeratorName();
                                    int i101113 = a;
                                    int i101114 = (i101113 | 97) << 1;
                                    int i101115 = -(((~i101113) & 97) | (i101113 & (-98)));
                                    int i111110 = (i101114 & i101115) + (i101115 | i101114);
                                    b = i111110 % 128;
                                    int i111111 = i111110 % 2;
                                    enumeratorContact = ((EnumeratorModel) listFind2.get(0)).getEnumeratorContact();
                                    int i111112 = b;
                                    int i111113 = i111112 & 45;
                                    int i111114 = i111113 + ((i111112 ^ 45) | i111113);
                                    a = i111114 % 128;
                                    int i111115 = i111114 % 2;
                                    enumeratorCnic = ((EnumeratorModel) listFind2.get(0)).getEnumeratorCnic();
                                    int i111116 = a;
                                    int i111117 = i111116 & 107;
                                    int i111118 = (i111116 ^ 107) | i111117;
                                    int i111119 = ((i111117 | i111118) << 1) - (i111118 ^ i111117);
                                    b = i111119 % 128;
                                    int i1218 = i111119 % 2;
                                    enumeratorImei = ((EnumeratorModel) listFind2.get(0)).getEnumeratorImei();
                                    int i1219 = b;
                                    int i12110 = i1219 & 41;
                                    int i12111 = (i1219 ^ 41) | i12110;
                                    int i12112 = (i12110 & i12111) + (i12111 | i12110);
                                    a = i12112 % 128;
                                    int i12113 = i12112 % 2;
                                }
                            }
                        } else {
                            int i1310 = b;
                            int i1311 = i1310 & 89;
                            i5 = ((((i1310 ^ 89) | i1311) << 1) - (~(-((i1310 | 89) & (~i1311))))) - 1;
                            a = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i1312 = 26 / 0;
                            }
                        }
                        size = list.size();
                        if (i == (size ^ (-1)) + (size << 1)) {
                            int i1313 = b;
                            i11 = (((i1313 | 27) << 1) - (~(-(i1313 ^ 27)))) - 1;
                            a = i11 % 128;
                            if (i11 % 2 != 0) {
                                i7 = 0;
                                int i1314 = 38 / 0;
                            } else {
                                i7 = 0;
                            }
                            str4 = str;
                            i6 = i3;
                            ag.d(str2, str3, str9, enumeratorId, enumeratorName, enumeratorImei, enumeratorCnic, enumeratorContact, i2, i4, i6, str4);
                            listFind2 = null;
                        } else {
                            str4 = str;
                            i6 = i3;
                            i7 = 0;
                        }
                        i8 = b;
                        int i1315 = i8 & 85;
                        int i1316 = -(-((i8 ^ 85) | i1315));
                        int i1317 = ((i1315 | i1316) << 1) - (i1315 ^ i1316);
                        a = i1317 % 128;
                        int i1318 = i1317 % 2;
                        int i1319 = i8 ^ 35;
                        i9 = 1;
                        i10 = (((i8 & 35) | i1319) << 1) - i1319;
                        a = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object obj7 = null;
                            obj7.hashCode();
                            throw null;
                        }
                        int i1418 = i8 + 97;
                        a = i1418 % 128;
                        int i1419 = i1418 % 2;
                        str11 = str3;
                        i55 = i4;
                        i54 = i2;
                        str10 = str2;
                        str12 = str4;
                        i56 = i6;
                    }
                    int i200 = i - 20;
                    i53 = (i200 & 21) + (i200 | 21);
                    i38 = i7;
                    i35 = i9;
                    i31 = 2;
                }
            }
        }
        int i201 = b;
        int i202 = i201 & 9;
        int i203 = i202 + ((i201 ^ 9) | i202);
        a = i203 % 128;
        int i204 = i203 % 2;
        return null;
    }
}
