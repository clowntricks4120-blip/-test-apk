package ivas.gov.bisp.enumeration.p044bq;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.AsyncTask;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.models.Batch;
import ivas.gov.bisp.enumeration.models.EnumeratorModel;
import ivas.gov.bisp.enumeration.models.PersonInfo;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.SupervisorParseObject;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.models.SurveyInfo;
import ivas.gov.bisp.enumeration.models.VerificationQuestionsCount;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p096p.h;
import java.util.ArrayList;
import java.util.UUID;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ap extends AsyncTask<Void, String, String> {
    private static int a = 1;
    private static int b;
    public double c;
    public ProgressDialog d;
    public ArrayList<String> e;
    public h f;
    public boolean g;
    public Context h;
    public ArrayList<String> i;
    public Survey j;
    public Survey k;
    public EnumeratorModel l;
    public ArrayList<Roster> m;
    public VerificationQuestionsCount n;

    public ap(Context context, boolean z, h hVar, ArrayList<String> arrayList, ArrayList<String> arrayList2, Survey survey, Survey survey2, double d, EnumeratorModel enumeratorModel, ArrayList<Roster> arrayList3, VerificationQuestionsCount verificationQuestionsCount) {
        this.h = context;
        this.n = verificationQuestionsCount;
        this.m = arrayList3;
        this.l = enumeratorModel;
        this.c = d;
        this.k = survey2;
        this.j = survey;
        this.i = arrayList2;
        this.e = arrayList;
        this.g = z;
        this.f = hVar;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        int i = 2 % 2;
        try {
            ProgressDialog progressDialog = new ProgressDialog(this.h);
            int i2 = a;
            int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
            b = i3 % 128;
            int i4 = i3 % 2;
            this.d = progressDialog;
            progressDialog.setCancelable(false);
            ProgressDialog progressDialog2 = this.d;
            int i5 = a + 33;
            b = i5 % 128;
            int i6 = i5 % 2;
            progressDialog2.setTitle("Saving Survey");
            ProgressDialog progressDialog3 = this.d;
            int i7 = b;
            int i8 = (i7 & 93) + (i7 | 93);
            a = i8 % 128;
            int i9 = i8 % 2;
            progressDialog3.setMessage("Please Wait...");
            this.d.setIndeterminate(true);
            ProgressDialog progressDialog4 = this.d;
            int i10 = a;
            int i11 = (((i10 ^ 117) | (i10 & 117)) << 1) - (((~i10) & 117) | (i10 & (-118)));
            b = i11 % 128;
            if (i11 % 2 != 0) {
                progressDialog4.show();
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            progressDialog4.show();
            int i12 = b;
            int i13 = (i12 & 79) + (i12 | 79);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 44 / 0;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public final void c() {
        int i;
        boolean z;
        int i2;
        int i3;
        Survey survey;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & (-18)) | ((~i5) & 17);
        int i7 = (i5 & 17) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        String str = this.j.location;
        if (i9 == 0) {
            if (str != null) {
                if (str.equals(BuildConfig.FLAVOR)) {
                    int i10 = a;
                    int i11 = i10 | 51;
                    int i12 = i11 << 1;
                    int i13 = -(i11 & (~(i10 & 51)));
                    i = (i12 ^ i13) + ((i13 & i12) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i14 = i10 ^ 65;
                    int i15 = ((i10 & 65) | i14) << 1;
                    int i16 = -i14;
                    int i17 = (i15 & i16) + (i15 | i16);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            if (!z) {
                int i19 = b;
                int i20 = i19 & 83;
                int i21 = (i19 | 83) & (~i20);
                int i22 = i20 << 1;
                i3 = ((i21 | i22) << 1) - (i21 ^ i22);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    survey = this.j;
                } else {
                    survey = this.j;
                }
                String[] strArrSplit = survey.location.split(",");
                int i23 = a + 59;
                b = i23 % 128;
                int i24 = i23 % 2;
                survey.latitude = strArrSplit[0];
                Survey survey2 = this.j;
                String str2 = survey2.location;
                int i25 = b + 49;
                a = i25 % 128;
                int i26 = i25 % 2;
                survey2.longitude = str2.split(",")[1];
                int i27 = b;
                int i28 = i27 & 31;
                int i29 = (i27 | 31) & (~i28);
                int i30 = -(-(i28 << 1));
                int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                a = i31 % 128;
                int i32 = i31 % 2;
            }
            int i33 = b;
            i2 = ((i33 ^ 78) + ((i33 & 78) << 1)) - 1;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
        int i34 = 92 / 0;
        if (str != null) {
            if (str.equals(BuildConfig.FLAVOR)) {
                int i110 = a;
                int i111 = i110 | 51;
                int i112 = i111 << 1;
                int i113 = -(i111 & (~(i110 & 51)));
                i = (i112 ^ i113) + ((i113 & i112) << 1);
                b = i % 128;
                if (i % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i114 = i110 ^ 65;
                int i115 = ((i110 & 65) | i114) << 1;
                int i116 = -i114;
                int i117 = (i115 & i116) + (i115 | i116);
                b = i117 % 128;
                int i118 = i117 % 2;
            }
        }
        if (!z) {
            int i119 = b;
            int i210 = i119 & 83;
            int i211 = (i119 | 83) & (~i210);
            int i212 = i210 << 1;
            i3 = ((i211 | i212) << 1) - (i211 ^ i212);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                survey = this.j;
            } else {
                survey = this.j;
            }
            String[] strArrSplit2 = survey.location.split(",");
            int i213 = a + 59;
            b = i213 % 128;
            int i214 = i213 % 2;
            survey.latitude = strArrSplit2[0];
            Survey survey3 = this.j;
            String str3 = survey3.location;
            int i215 = b + 49;
            a = i215 % 128;
            int i216 = i215 % 2;
            survey3.longitude = str3.split(",")[1];
            int i217 = b;
            int i218 = i217 & 31;
            int i219 = (i217 | 31) & (~i218);
            int i35 = -(-(i218 << 1));
            int i36 = ((i219 | i35) << 1) - (i219 ^ i35);
            a = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = b;
        i2 = ((i38 ^ 78) + ((i38 & 78) << 1)) - 1;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i39 = b;
        int i40 = i39 ^ 63;
        int i41 = -(-((i39 & 63) << 1));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        a = i42 % 128;
        int i43 = i42 % 2;
        z = true;
        if (!z) {
            int i1110 = b;
            int i2110 = i1110 & 83;
            int i2111 = (i1110 | 83) & (~i2110);
            int i2112 = i2110 << 1;
            i3 = ((i2111 | i2112) << 1) - (i2111 ^ i2112);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                survey = this.j;
            } else {
                survey = this.j;
            }
            String[] strArrSplit3 = survey.location.split(",");
            int i2113 = a + 59;
            b = i2113 % 128;
            int i2114 = i2113 % 2;
            survey.latitude = strArrSplit3[0];
            Survey survey4 = this.j;
            String str4 = survey4.location;
            int i2115 = b + 49;
            a = i2115 % 128;
            int i2116 = i2115 % 2;
            survey4.longitude = str4.split(",")[1];
            int i2117 = b;
            int i2118 = i2117 & 31;
            int i2119 = (i2117 | 31) & (~i2118);
            int i310 = -(-(i2118 << 1));
            int i311 = ((i2119 | i310) << 1) - (i2119 ^ i310);
            a = i311 % 128;
            int i312 = i311 % 2;
        }
        int i313 = b;
        i2 = ((i313 ^ 78) + ((i313 & 78) << 1)) - 1;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 59;
        int i4 = (i2 ^ 59) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = str;
        try {
            ProgressDialog progressDialog = this.d;
            if (progressDialog != null && progressDialog.isShowing()) {
                int i6 = b;
                int i7 = (((i6 & (-96)) | ((~i6) & 95)) - (~(-(-((i6 & 95) << 1))))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                this.d.dismiss();
                int i9 = a + 21;
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 % 4;
                }
            }
            if (str2 == null) {
                this.f.aJ(false, "Error");
                int i11 = b;
                int i12 = (i11 & (-102)) | ((~i11) & 101);
                int i13 = -(-((i11 & 101) << 1));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                a = i14 % 128;
                int i15 = i14 % 2;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i16 = b;
            int i17 = (i16 & (-24)) | ((~i16) & 23);
            int i18 = (i16 & 23) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                sb.append("Percentage : ");
                sb.append(str2);
                int i20 = 41 / 0;
            } else {
                sb.append("Percentage : ");
                sb.append(str2);
            }
            sb.append("\n Saved Successfully!");
            String string = sb.toString();
            int i21 = b;
            int i22 = i21 & 115;
            int i23 = (i21 ^ 115) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            a = i24 % 128;
            int i25 = i24 % 2;
            this.f.aJ(true, string);
            int i26 = b;
            int i27 = i26 & 91;
            int i28 = (i26 | 91) & (~i27);
            int i29 = i27 << 1;
            int i30 = (i28 & i29) + (i28 | i29);
            a = i30 % 128;
            int i31 = i30 % 2;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[PHI: r9
  0x0086: PHI (r9v53 android.content.ComponentCallbacks2) = (r9v52 android.content.ComponentCallbacks2), (r9v72 android.content.ComponentCallbacks2) binds: [B:20:0x0084, B:17:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0 A[Catch: Exception -> 0x063b, TRY_ENTER, TryCatch #9 {Exception -> 0x063b, blocks: (B:5:0x0026, B:7:0x002b, B:10:0x0048, B:12:0x0050, B:15:0x0067, B:31:0x00b4, B:34:0x00cd, B:37:0x00e5, B:39:0x0108, B:40:0x0110, B:44:0x0114, B:45:0x011d, B:46:0x0120, B:23:0x00a0, B:26:0x00a9, B:27:0x00ae, B:28:0x00b1, B:19:0x0078, B:49:0x0123, B:51:0x012d, B:53:0x014a, B:55:0x015f, B:58:0x0185, B:61:0x01c1, B:62:0x01ca, B:68:0x01fa, B:71:0x0217, B:76:0x022e, B:80:0x0251, B:81:0x0255, B:82:0x0258, B:85:0x025b, B:88:0x0270, B:93:0x0293, B:95:0x02a1, B:101:0x02b2, B:106:0x02d8, B:109:0x02ef, B:121:0x032f, B:125:0x0361, B:127:0x036a, B:135:0x03d9, B:137:0x03f4, B:139:0x040f, B:142:0x042c, B:145:0x0447, B:147:0x0463, B:150:0x0486, B:152:0x04a3, B:154:0x04d1, B:155:0x04dd, B:159:0x04e1, B:161:0x04ef, B:164:0x0506, B:166:0x052f, B:168:0x0552, B:170:0x0559, B:173:0x056e, B:175:0x0585, B:178:0x05a1, B:181:0x05bd, B:183:0x05cd, B:186:0x05e6, B:188:0x05f8, B:189:0x05ff, B:190:0x0602, B:193:0x0605, B:194:0x060d, B:126:0x0366, B:128:0x036e, B:131:0x038b, B:133:0x03ad, B:198:0x0611, B:199:0x061d, B:200:0x0620, B:111:0x0306, B:115:0x0320, B:116:0x0326, B:117:0x032b, B:203:0x0623, B:204:0x0626, B:100:0x02a6, B:89:0x0278, B:69:0x0206, B:63:0x01cd, B:207:0x0629, B:208:0x0637), top: B:235:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    @Override // android.os.AsyncTask
    public String doInBackground(Void[] voidArr) {
        char c;
        Survey survey;
        ah ahVar;
        ComponentCallbacks2 componentCallbacks2FindFragmentByTag;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-60)) | ((~i3) & 59);
        int i5 = (i3 & 59) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        String strValueOf = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        try {
            int size = 0;
            if (!this.g && this.e != null) {
                int i8 = ((i7 | 5) << 1) - (i7 ^ 5);
                b = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 & 93;
                int i11 = ((i7 | 93) & (~i10)) + (i10 << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 0;
                while (i13 < this.e.size()) {
                    String strG = ac.g(this.e.get(i13));
                    int i14 = b + 111;
                    a = i14 % 128;
                    if (i14 % 2 == 0) {
                        componentCallbacks2FindFragmentByTag = ((Activity) this.h).getFragmentManager().findFragmentByTag(strG);
                        int i15 = 3 / 0;
                        if (componentCallbacks2FindFragmentByTag == null) {
                            int i16 = a;
                            int i17 = (i16 & (-116)) | ((~i16) & 115);
                            int i18 = -(-((i16 & 115) << 1));
                            i = (i17 ^ i18) + ((i18 & i17) << 1);
                            b = i % 128;
                            if (i % 2 == 0) {
                                this.i.contains(strG);
                                strValueOf.hashCode();
                                throw null;
                            }
                            if (this.i.contains(strG)) {
                                continue;
                            }
                        }
                        int i19 = i13 & 1;
                        i13 = (((i13 | 1) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
                        int i20 = a;
                        int i21 = ((i20 | 57) << 1) - (i20 ^ 57);
                        b = i21 % 128;
                        int i22 = i21 % 2;
                    } else {
                        componentCallbacks2FindFragmentByTag = ((Activity) this.h).getFragmentManager().findFragmentByTag(strG);
                        if (componentCallbacks2FindFragmentByTag == null) {
                            int i110 = a;
                            int i111 = (i110 & (-116)) | ((~i110) & 115);
                            int i112 = -(-((i110 & 115) << 1));
                            i = (i111 ^ i112) + ((i112 & i111) << 1);
                            b = i % 128;
                            if (i % 2 == 0) {
                                this.i.contains(strG);
                                strValueOf.hashCode();
                                throw null;
                            }
                            if (this.i.contains(strG)) {
                                continue;
                            }
                        }
                        int i113 = i13 & 1;
                        i13 = (((i13 | 1) & (~i113)) - (~(-(-(i113 << 1))))) - 1;
                        int i23 = a;
                        int i24 = ((i23 | 57) << 1) - (i23 ^ 57);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                    }
                    SupervisorParseObject jsonForSupervisor = ((e) componentCallbacks2FindFragmentByTag).parseJsonForSupervisor();
                    int i26 = b;
                    int i27 = (-2) - ((((i26 | 120) << 1) - (i26 ^ 120)) ^ (-1));
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        this.j = jsonForSupervisor.getSurveySupervisor();
                        jsonForSupervisor.getVerificationQuestionsCount();
                        strValueOf.hashCode();
                        throw null;
                    }
                    this.j = jsonForSupervisor.getSurveySupervisor();
                    VerificationQuestionsCount verificationQuestionsCount = jsonForSupervisor.getVerificationQuestionsCount();
                    int i28 = b;
                    int i29 = (i28 & 119) + (i28 | 119);
                    a = i29 % 128;
                    if (i29 % 2 == 0) {
                        this.n = verificationQuestionsCount;
                        this.c = jsonForSupervisor.getDividerForPercentage();
                        throw null;
                    }
                    this.n = verificationQuestionsCount;
                    this.c = jsonForSupervisor.getDividerForPercentage();
                    int i114 = i13 & 1;
                    i13 = (((i13 | 1) & (~i114)) - (~(-(-(i114 << 1))))) - 1;
                    int i210 = a;
                    int i211 = ((i210 | 57) << 1) - (i210 ^ 57);
                    b = i211 % 128;
                    int i212 = i211 % 2;
                }
            }
            PersonInfo personInfo = (PersonInfo) SugarRecord.first(PersonInfo.class);
            if (personInfo != null) {
                this.j.supervisor_name = personInfo.name;
                int i30 = a;
                int i31 = i30 & 45;
                int i32 = ((i30 ^ 45) | i31) << 1;
                int i33 = -((i30 | 45) & (~i31));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
            }
            Survey survey2 = this.j;
            Survey survey3 = this.k;
            survey2.form_no = survey3.form_no;
            int i36 = a;
            int i37 = (i36 ^ 103) + ((i36 & 103) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
            survey2.uuid = survey3.uuid;
            survey2.imei_number = ah.c.d.getString("imei_mac", BuildConfig.FLAVOR);
            Survey survey4 = this.j;
            int i39 = b;
            int i40 = i39 & 103;
            int i41 = (i39 ^ 103) | i40;
            int i42 = (i40 & i41) + (i41 | i40);
            a = i42 % 128;
            if (i42 % 2 == 0) {
                survey4.endTime = z.e();
                this.j.endTimeGPS = ak.c();
                throw null;
            }
            survey4.endTime = z.e();
            this.j.endTimeGPS = ak.c();
            this.j.time = z.b();
            this.j.timeGPS = ak.e();
            this.j.date = z.f();
            this.j.dateGPS = ak.d();
            Survey survey5 = this.j;
            int i43 = a + 31;
            b = i43 % 128;
            if (i43 % 2 != 0) {
                survey5.batchName = this.k.batchName;
                survey5.userType = 4;
            } else {
                survey5.batchName = this.k.batchName;
                survey5.userType = 3;
            }
            double d = this.c;
            int i44 = a;
            int i45 = ((i44 | 17) << 1) - (i44 ^ 17);
            b = i45 % 128;
            int i46 = i45 % 2;
            if (d != 0.0d) {
                int i47 = (((i44 & (-12)) | ((~i44) & 11)) - (~((i44 & 11) << 1))) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
                this.j.validation_percentage = ag.m(survey5.validation_percentage / d, 2);
            } else {
                survey5.validation_percentage = 0.0d;
                int i49 = a;
                int i50 = i49 & 67;
                int i51 = ((i49 | 67) & (~i50)) + (i50 << 1);
                b = i51 % 128;
                int i52 = i51 % 2;
            }
            if (ag.q == this.k.totalRosters) {
                int i53 = b;
                int i54 = ((i53 | 3) << 1) - (i53 ^ 3);
                a = i54 % 128;
                if (i54 % 2 == 0) {
                    double d2 = this.j.validation_percentage;
                    strValueOf.hashCode();
                    throw null;
                }
                this.j.validation_percentage += 20.0d;
                int i55 = b;
                int i56 = i55 & 21;
                int i57 = ((((i55 ^ 21) | i56) << 1) - (~(-((i55 | 21) & (~i56))))) - 1;
                a = i57 % 128;
                if (i57 % 2 == 0) {
                    int i58 = 5 / 3;
                }
            }
            double dM = ag.m(this.j.validation_percentage, 2);
            String[] strArr = new String[2];
            int i59 = b + 61;
            a = i59 % 128;
            if (i59 % 2 == 0) {
                strArr[1] = this.k.uuid;
                c = 0;
            } else {
                strArr[0] = this.k.uuid;
                c = 1;
            }
            int i60 = b;
            int i61 = (((i60 | 90) << 1) - (i60 ^ 90)) - 1;
            a = i61 % 128;
            if (i61 % 2 == 0) {
                strArr[c] = "1";
                survey = (Survey) SugarRecord.singleFindByQuery(Survey.class, "uuid=? and user_type=?", strArr);
                ahVar = ah.c;
                int i62 = 87 / 0;
            } else {
                strArr[c] = "1";
                survey = (Survey) SugarRecord.singleFindByQuery(Survey.class, "uuid=? and user_type=?", strArr);
                ahVar = ah.c;
            }
            long j = ahVar.d.getLong("validation_percentage", 0L);
            int i63 = b;
            int i64 = i63 & 17;
            int i65 = (i63 | 17) & (~i64);
            int i66 = i64 << 1;
            int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
            a = i67 % 128;
            if (i67 % 2 == 0) {
                strValueOf.hashCode();
                throw null;
            }
            if (dM >= j) {
                this.j.survey_verified = "yes";
                if (survey != null) {
                    int i68 = a;
                    int i69 = i68 ^ 29;
                    int i70 = ((i68 & 29) | i69) << 1;
                    int i71 = -i69;
                    int i72 = (i70 & i71) + (i70 | i71);
                    b = i72 % 128;
                    int i73 = i72 % 2;
                    survey.survey_verified = "yes";
                    survey.save();
                    int i74 = a;
                    int i75 = i74 & 99;
                    int i76 = (i75 - (~(-(-((i74 ^ 99) | i75))))) - 1;
                    b = i76 % 128;
                    int i77 = i76 % 2;
                }
            } else {
                this.j.survey_verified = "no";
                if (survey != null) {
                    int i78 = a;
                    int i79 = i78 ^ 29;
                    int i80 = ((i78 & 29) | i79) << 1;
                    int i81 = -i79;
                    int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                    b = i82 % 128;
                    if (i82 % 2 != 0) {
                        survey.survey_verified = "no";
                        survey.save();
                        throw null;
                    }
                    survey.survey_verified = "no";
                    survey.save();
                }
            }
            ArrayList arrayList = new ArrayList(SugarRecord.find(EnumeratorModel.class, "enumerator_imei = ?", this.l.getEnumeratorImei()));
            EnumeratorModel enumeratorModel = new EnumeratorModel();
            if (arrayList.size() > 0) {
                int i83 = a;
                int i84 = ((i83 ^ 84) + ((i83 & 84) << 1)) - 1;
                b = i84 % 128;
                enumeratorModel = (EnumeratorModel) (i84 % 2 != 0 ? arrayList.get(0) : arrayList.get(0));
            } else {
                enumeratorModel.setEnumeratorId(this.l.getEnumeratorId());
                EnumeratorModel enumeratorModel2 = this.l;
                int i85 = a;
                int i86 = i85 | 17;
                int i87 = (i86 << 1) - ((~(i85 & 17)) & i86);
                b = i87 % 128;
                if (i87 % 2 != 0) {
                    enumeratorModel.setEnumeratorCnic(enumeratorModel2.getEnumeratorCnic());
                    this.l.getEnumeratorContact();
                    strValueOf.hashCode();
                    throw null;
                }
                enumeratorModel.setEnumeratorCnic(enumeratorModel2.getEnumeratorCnic());
                enumeratorModel.setEnumeratorContact(this.l.getEnumeratorContact());
                enumeratorModel.setEnumeratorImei(this.l.getEnumeratorImei());
                int i88 = b + 17;
                a = i88 % 128;
                int i89 = i88 % 2;
                enumeratorModel.setEnumeratorName(this.l.getEnumeratorName());
                enumeratorModel.save();
                int i90 = b;
                int i91 = (((i90 ^ 77) | (i90 & 77)) << 1) - (((~i90) & 77) | (i90 & (-78)));
                int i92 = i91 % 128;
                a = i92;
                int i93 = i91 % 2;
                int i94 = ((i92 & 118) + (i92 | 118)) - 1;
                b = i94 % 128;
                int i95 = i94 % 2;
            }
            c();
            Survey survey6 = this.j;
            UUID uuidRandomUUID = UUID.randomUUID();
            int i96 = a;
            int i97 = i96 & 89;
            int i98 = -(-((i96 ^ 89) | i97));
            int i99 = (i97 & i98) + (i98 | i97);
            b = i99 % 128;
            int i100 = i99 % 2;
            survey6.uniqueID = uuidRandomUUID.toString();
            long jSave = survey6.save();
            int i101 = a;
            int i102 = i101 & 33;
            int i103 = (i101 ^ 33) | i102;
            int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
            b = i104 % 128;
            int i105 = i104 % 2;
            if (this.m != null) {
                int i106 = i101 & 61;
                int i107 = (i106 - (~(-(-((i101 ^ 61) | i106))))) - 1;
                int i108 = i107 % 128;
                b = i108;
                int i109 = i107 % 2;
                int i115 = (i108 & 5) + (i108 | 5);
                a = i115 % 128;
                int i116 = i115 % 2;
                int i117 = 0;
                while (i117 < this.m.size()) {
                    int i118 = a;
                    int i119 = i118 ^ 93;
                    int i120 = -(-((i118 & 93) << 1));
                    int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                    b = i121 % 128;
                    int i122 = i121 % 2;
                    this.m.get(i117).fk_id = jSave;
                    int i123 = a;
                    int i124 = i123 ^ 31;
                    int i125 = ((((i123 & 31) | i124) << 1) - (~(-i124))) - 1;
                    b = i125 % 128;
                    int i126 = i125 % 2;
                    this.m.get(i117).surveyFormNo = survey6.form_no;
                    int i127 = b;
                    int i128 = (i127 & (-50)) | ((~i127) & 49);
                    int i129 = (i127 & 49) << 1;
                    int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                    a = i130 % 128;
                    if (i130 % 2 == 0) {
                        this.m.get(i117).surveyUuid = survey6.uniqueID;
                        throw null;
                    }
                    this.m.get(i117).surveyUuid = survey6.uniqueID;
                    int i131 = a;
                    int i132 = ((i131 | 10) << 1) - (i131 ^ 10);
                    int i133 = (i132 ^ (-1)) + (i132 << 1);
                    b = i133 % 128;
                    int i134 = i133 % 2;
                    this.m.get(i117).surveyType = "3";
                    int i135 = b;
                    int i136 = (i135 & (-30)) | ((~i135) & 29);
                    int i137 = (i135 & 29) << 1;
                    int i138 = (i136 & i137) + (i137 | i136);
                    int i139 = i138 % 128;
                    a = i139;
                    int i140 = i138 % 2;
                    i117 = (-2) - ((i117 + 2) ^ (-1));
                    int i141 = i139 + 115;
                    b = i141 % 128;
                    int i142 = i141 % 2;
                }
                SugarRecord.saveInTx(this.m);
                int i143 = a + 69;
                b = i143 % 128;
                int i144 = i143 % 2;
            }
            VerificationQuestionsCount verificationQuestionsCount2 = this.n;
            Survey survey7 = this.j;
            int i145 = a;
            int i146 = ((i145 & (-54)) | ((~i145) & 53)) + ((i145 & 53) << 1);
            b = i146 % 128;
            if (i146 % 2 != 0) {
                verificationQuestionsCount2.uuid = survey7.uuid;
                verificationQuestionsCount2.formNo = survey7.form_no;
                throw null;
            }
            verificationQuestionsCount2.uuid = survey7.uuid;
            verificationQuestionsCount2.formNo = survey7.form_no;
            verificationQuestionsCount2.enumCnic = this.l.getEnumeratorCnic();
            VerificationQuestionsCount verificationQuestionsCount3 = this.n;
            int i147 = b;
            int i148 = i147 & 115;
            int i149 = ((i147 ^ 115) | i148) << 1;
            int i150 = -((i147 | 115) & (~i148));
            int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
            a = i151 % 128;
            int i152 = i151 % 2;
            verificationQuestionsCount3.imeiMac = this.l.getEnumeratorImei().toLowerCase();
            VerificationQuestionsCount verificationQuestionsCount4 = this.n;
            int i153 = b;
            int i154 = (i153 & (-16)) | ((~i153) & 15);
            int i155 = (i153 & 15) << 1;
            int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
            a = i156 % 128;
            int i157 = i156 % 2;
            verificationQuestionsCount4.save();
            ArrayList<Roster> arrayList2 = this.m;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                int i158 = b;
                int i159 = i158 & 41;
                int i160 = i158 | 41;
                int i161 = (i159 & i160) + (i160 | i159);
                a = i161 % 128;
                int i162 = i161 % 2;
            }
            ArrayList<Roster> arrayList3 = arrayList2;
            String enumeratorCnic = this.l.getEnumeratorCnic();
            int i163 = a;
            int i164 = ((i163 & (-14)) | ((~i163) & 13)) + ((i163 & 13) << 1);
            b = i164 % 128;
            int i165 = i164 % 2;
            String lowerCase = this.l.getEnumeratorImei().toLowerCase();
            ArrayList<Roster> arrayList4 = this.m;
            if (arrayList4 != null) {
                int i166 = a;
                int i167 = i166 ^ 107;
                int i168 = (((i166 & 107) | i167) << 1) - i167;
                b = i168 % 128;
                int i169 = i168 % 2;
                size = arrayList4.size();
                int i170 = a;
                int i171 = i170 & 91;
                int i172 = ((i170 ^ 91) | i171) << 1;
                int i173 = -((i170 | 91) & (~i171));
                int i174 = (i172 & i173) + (i173 | i172);
                b = i174 % 128;
                int i175 = i174 % 2;
            }
            SurveyInfo surveyInfo = new SurveyInfo(survey6, enumeratorCnic, lowerCase, arrayList3, size);
            int i176 = a + 57;
            b = i176 % 128;
            int i177 = i176 % 2;
            surveyInfo.save();
            d(survey6, enumeratorModel);
            int i178 = a;
            int i179 = ((i178 & (-26)) | ((~i178) & 25)) + ((i178 & 25) << 1);
            b = i179 % 128;
            if (i179 % 2 != 0) {
                String.valueOf(this.j.validation_percentage);
                strValueOf.hashCode();
                throw null;
            }
            strValueOf = String.valueOf(this.j.validation_percentage);
            int i180 = a + 15;
            b = i180 % 128;
            int i181 = i180 % 2;
            int i182 = b;
            int i183 = i182 & 91;
            int i184 = (i182 ^ 91) | i183;
            int i185 = (i183 & i184) + (i184 | i183);
            a = i185 % 128;
            int i186 = i185 % 2;
            return strValueOf;
        } catch (Exception unused) {
        }
    }

    public final void d(Survey survey, EnumeratorModel enumeratorModel) {
        String[] strArr;
        char c;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(SugarRecord.find(Batch.class, "name = ?", survey.batchName));
        int i2 = a + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (arrayList.size() > 0) {
            int i4 = a;
            int i5 = (i4 & 125) + (i4 | 125);
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 != 0) {
                strArr = new String[2];
                strArr[0] = "1";
            } else {
                strArr = new String[3];
                strArr[0] = "1";
            }
            int i7 = (((i6 | 6) << 1) - (i6 ^ 6)) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                strArr[1] = ((Batch) arrayList.get(0)).getName();
                c = 5;
            } else {
                strArr[1] = ((Batch) arrayList.get(0)).getName();
                c = 2;
            }
            strArr[c] = BuildConfig.FLAVOR;
            ArrayList arrayList2 = new ArrayList(SugarRecord.find(Survey.class, "(is_selected_at_random = ? and batch_name = ? and surveyverified = ?)", strArr));
            int i8 = a + 83;
            b = i8 % 128;
            int i9 = i8 % 2;
            double dM = ag.m(survey.validation_percentage, 2);
            Object obj = arrayList.get(0);
            int i10 = a;
            int i11 = ((i10 & 109) - (~(i10 | 109))) - 1;
            b = i11 % 128;
            Object obj2 = null;
            if (i11 % 2 != 0) {
                ((Batch) obj).getVerified().equals(BuildConfig.FLAVOR);
                obj2.hashCode();
                throw null;
            }
            if (((Batch) obj).getVerified().equals(BuildConfig.FLAVOR)) {
                int i12 = b;
                int i13 = (i12 & 43) + (i12 | 43);
                a = i13 % 128;
                int i14 = i13 % 2;
                ((Batch) arrayList.get(0)).setPercentage(dM);
                int i15 = a;
                int i16 = i15 & 29;
                int i17 = (i15 ^ 29) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
            } else {
                Batch batch = (Batch) arrayList.get(0);
                Batch batch2 = (Batch) arrayList.get(0);
                int i20 = a;
                int i21 = i20 & 61;
                int i22 = (((i20 | 61) & (~i21)) - (~(i21 << 1))) - 1;
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    batch.setPercentage((batch2.getPercentage() - dM) + 2.0d);
                } else {
                    batch.setPercentage((batch2.getPercentage() + dM) / 2.0d);
                }
                int i23 = a;
                int i24 = i23 & 39;
                int i25 = i24 + ((i23 ^ 39) | i24);
                b = i25 % 128;
                int i26 = i25 % 2;
            }
            double percentage = ((Batch) arrayList.get(0)).getPercentage();
            int i27 = b;
            int i28 = i27 ^ 63;
            int i29 = ((i27 & 63) | i28) << 1;
            int i30 = -i28;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            a = i31 % 128;
            int i32 = i31 % 2;
            long j = ah.c.d.getLong("validation_percentage", 0L);
            int i33 = a;
            int i34 = ((i33 & 52) + (i33 | 52)) - 1;
            b = i34 % 128;
            if (i34 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (percentage >= j) {
                ((Batch) arrayList.get(0)).setVerified("yes");
                int i35 = b;
                int i36 = i35 & 25;
                int i37 = (i36 - (~(-(-((i35 ^ 25) | i36))))) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
                ((Batch) arrayList.get(0)).setIsRejectBoxShown(1);
                Object obj3 = arrayList.get(0);
                int i39 = a;
                int i40 = i39 & 5;
                int i41 = (5 | i39) & (~i40);
                int i42 = -(-(i40 << 1));
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                b = i43 % 128;
                int i44 = i43 % 2;
                ((Batch) obj3).setIsRejected(0);
                int i45 = b;
                int i46 = i45 & 121;
                int i47 = (i46 - (~((i45 ^ 121) | i46))) - 1;
                a = i47 % 128;
                if (i47 % 2 == 0) {
                    int i48 = 4 / 4;
                }
            } else {
                ((Batch) arrayList.get(0)).setIsRejected(1);
                int i49 = a;
                int i50 = (i49 & (-102)) | ((~i49) & 101);
                int i51 = -(-((i49 & 101) << 1));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                b = i52 % 128;
                int i53 = i52 % 2;
                ((Batch) arrayList.get(0)).setVerified("no");
                int i54 = b;
                int i55 = i54 & 39;
                int i56 = (i54 | 39) & (~i55);
                int i57 = i55 << 1;
                int i58 = (i56 & i57) + (i56 | i57);
                a = i58 % 128;
                if (i58 % 2 == 0) {
                    ((Batch) arrayList.get(1)).setIsRejectBoxShown(0);
                } else {
                    ((Batch) arrayList.get(0)).setIsRejectBoxShown(0);
                }
            }
            if (arrayList2.size() == 0) {
                int i59 = b;
                int i60 = i59 & 89;
                int i61 = ((i59 ^ 89) | i60) << 1;
                int i62 = -((i59 | 89) & (~i60));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                a = i63 % 128;
                int i64 = i63 % 2;
                ((Batch) arrayList.get(0)).setIsMarked(1);
                int i65 = a + 99;
                b = i65 % 128;
                int i66 = i65 % 2;
            }
            SugarRecord.saveInTx(arrayList);
            int i67 = a;
            int i68 = ((i67 | 115) << 1) - (i67 ^ 115);
            b = i68 % 128;
            int i69 = i68 % 2;
        }
        enumeratorModel.setEnumeratorTotalDoneVerifyCount(enumeratorModel.getEnumeratorTotalDoneVerifyCount() + 1);
        enumeratorModel.save();
        int i70 = a;
        int i71 = i70 & 89;
        int i72 = (~i71) & (i70 | 89);
        int i73 = -(-(i71 << 1));
        int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
        b = i74 % 128;
        int i75 = i74 % 2;
        int i76 = i70 + 41;
        b = i76 % 128;
        int i77 = i76 % 2;
    }
}
