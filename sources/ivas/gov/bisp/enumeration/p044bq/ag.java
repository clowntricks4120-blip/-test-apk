package ivas.gov.bisp.enumeration.p044bq;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.orm.SugarRecord;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.X.e;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.de.j;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.BeneficiaryEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.IndividualNadraDataWithRelation;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.NadraFamilyData;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.TabletLogEntity;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.models.EnumeratorModel;
import ivas.gov.bisp.enumeration.models.PersonInfo;
import ivas.gov.bisp.enumeration.models.RespondantNic;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.Roster;
import ivas.gov.bisp.enumeration.models.Survey;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.z;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p088k.af;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ag extends AsyncTask<Void, Boolean, Boolean> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c = 0;
    private static int d = 1;
    private static long d$s51$1326;
    public static final /* synthetic */ int e = 0;
    public SessionManager A;
    public JSONObject B;
    public int g;
    public ProgressDialog h;
    public ArrayList<String> i;
    public ArrayList<String> j;
    public h k;
    public Survey l;
    public AppCompatActivity m;
    public EnumeratorModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<Roster> f74o;
    public Context p;
    public int r;
    public JSONObject s;
    public JSONObject t;
    public JSONObject u;
    public JSONObject v;
    public JSONObject w;
    public JSONObject x;
    public JSONObject y;
    public String q = "Survey uploaded successfully";
    public String C = BuildConfig.FLAVOR;
    public volatile boolean D = false;
    public String z = BuildConfig.FLAVOR;

    static {
        c();
        int i = d + 29;
        c = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ag(int i, AppCompatActivity appCompatActivity, int i2, h hVar, ArrayList<String> arrayList, ArrayList<String> arrayList2, Survey survey, EnumeratorModel enumeratorModel, ArrayList<Roster> arrayList3, Context context) {
        this.r = 0;
        this.r = i;
        this.l = survey;
        this.m = appCompatActivity;
        this.f74o = arrayList3;
        this.n = enumeratorModel;
        this.i = arrayList;
        this.j = arrayList2;
        this.k = hVar;
        this.g = i2;
        this.p = context;
        this.A = new SessionManager(appCompatActivity);
    }

    static void c() {
        d$s51$1326 = -5050574608165028947L;
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"WrongThread"})
    public /* synthetic */ Boolean doInBackground(Void[] voidArr) {
        int i = 2 % 2;
        int i2 = d + 11;
        c = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolF = f();
        int i4 = c + 47;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return boolF;
    }

    public final void e(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = d + 11;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            AppDatabase.l(this.m.getApplicationContext()).m().ab();
            throw null;
        }
        List listAb = AppDatabase.l(this.m.getApplicationContext()).m().ab();
        if (listAb == null || listAb.isEmpty()) {
            int i3 = c + 43;
            d = i3 % 128;
            int i4 = i3 % 2;
            ax.d(false, jSONObject, this.m, "/api/Roster/bZJVzTu9rHlQm0D", new aj(this, jSONObject));
            return;
        }
        int i5 = d;
        int i6 = i5 + 63;
        c = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 7;
        c = i8 % 128;
        int i9 = i8 % 2;
        List listAb2 = AppDatabase.l(this.m.getApplicationContext()).m().ab();
        if (listAb2 == null || listAb2.isEmpty()) {
            ax.d(false, jSONObject, this.m, "/api/Roster/bZJVzTu9rHlQm0D", new aj(this, jSONObject));
            return;
        }
        int i10 = c + 19;
        d = i10 % 128;
        if (i10 % 2 == 0) {
            i(1, listAb2, jSONObject);
        } else {
            i(0, listAb2, jSONObject);
        }
    }

    public final void j() {
        int i = 2 % 2;
        int i2 = d + 111;
        c = i2 % 128;
        int i3 = i2 % 2;
        String str = this.l.location;
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            int i4 = c + 25;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
                return;
            }
            return;
        }
        int i6 = c + 59;
        int i7 = i6 % 128;
        d = i7;
        if (i6 % 2 == 0) {
            return;
        }
        int i8 = i7 + 113;
        c = i8 % 128;
        if (i8 % 2 != 0) {
            Survey survey = this.l;
            survey.latitude = survey.location.split(",")[0];
            Survey survey2 = this.l;
            survey2.longitude = survey2.location.split(",")[0];
            return;
        }
        Survey survey3 = this.l;
        survey3.latitude = survey3.location.split(",")[0];
        Survey survey4 = this.l;
        survey4.longitude = survey4.location.split(",")[1];
    }

    public class bwF extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;

        public bwF() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:12:0x00df  */
        /* JADX WARN: Code duplicated, block: B:9:0x0044  */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 | 11) << 1) - (i3 ^ 11);
            a = i4 % 128;
            int i5 = i4 % 2;
            AppDatabase appDatabaseL = AppDatabase.l(ag.this.m);
            ArrayList arrayList = new ArrayList(appDatabaseL.m().P());
            int i6 = a + 67;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 92 / 0;
                if (arrayList.size() > 0) {
                    int i8 = a;
                    int i9 = (((i8 & (-56)) | ((~i8) & 55)) - (~((i8 & 55) << 1))) - 1;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    survey_count survey_countVar = (survey_count) arrayList.get(0);
                    h hVarM = appDatabaseL.m();
                    int i11 = b;
                    int i12 = ((i11 & 2) + (i11 | 2)) - 1;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    long j = survey_countVar.id;
                    int i14 = survey_countVar.sync_count;
                    int i15 = survey_countVar.not_sync_count;
                    int i16 = b;
                    int i17 = i16 & 75;
                    int i18 = ((i16 ^ 75) | i17) << 1;
                    int i19 = -((i16 | 75) & (~i17));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = i14 ^ 1;
                    hVarM.aS(j, ((((i14 & 1) | i22) << 1) - (~(-i22))) - 1, i15);
                    int i23 = a;
                    int i24 = i23 & 13;
                    int i25 = i23 | 13;
                    int i26 = (i24 & i25) + (i25 | i24);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    h hVarM2 = appDatabaseL.m();
                    survey_count survey_countVar2 = new survey_count(new Date().getTime(), 1, 0);
                    int i28 = a;
                    int i29 = i28 ^ 17;
                    int i30 = ((((i28 & 17) | i29) << 1) - (~(-i29))) - 1;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    hVarM2.bn(survey_countVar2);
                    int i32 = a;
                    int i33 = i32 & 61;
                    int i34 = i32 | 61;
                    i = ((i33 | i34) << 1) - (i34 ^ i33);
                    b = i % 128;
                    if (i % 2 != 0) {
                        int i35 = 3 % 4;
                    }
                }
            } else if (arrayList.size() > 0) {
                int i36 = a;
                int i37 = (((i36 & (-56)) | ((~i36) & 55)) - (~((i36 & 55) << 1))) - 1;
                b = i37 % 128;
                int i110 = i37 % 2;
                survey_count survey_countVar3 = (survey_count) arrayList.get(0);
                h hVarM3 = appDatabaseL.m();
                int i111 = b;
                int i112 = ((i111 & 2) + (i111 | 2)) - 1;
                a = i112 % 128;
                int i113 = i112 % 2;
                long j2 = survey_countVar3.id;
                int i114 = survey_countVar3.sync_count;
                int i115 = survey_countVar3.not_sync_count;
                int i116 = b;
                int i117 = i116 & 75;
                int i118 = ((i116 ^ 75) | i117) << 1;
                int i119 = -((i116 | 75) & (~i117));
                int i210 = ((i118 | i119) << 1) - (i119 ^ i118);
                a = i210 % 128;
                int i211 = i210 % 2;
                int i212 = i114 ^ 1;
                hVarM3.aS(j2, ((((i114 & 1) | i212) << 1) - (~(-i212))) - 1, i115);
                int i213 = a;
                int i214 = i213 & 13;
                int i215 = i213 | 13;
                int i216 = (i214 & i215) + (i215 | i214);
                b = i216 % 128;
                int i217 = i216 % 2;
            } else {
                h hVarM4 = appDatabaseL.m();
                survey_count survey_countVar4 = new survey_count(new Date().getTime(), 1, 0);
                int i218 = a;
                int i219 = i218 ^ 17;
                int i38 = ((((i218 & 17) | i219) << 1) - (~(-i219))) - 1;
                b = i38 % 128;
                int i39 = i38 % 2;
                hVarM4.bn(survey_countVar4);
                int i310 = a;
                int i311 = i310 & 61;
                int i312 = i310 | 61;
                i = ((i311 | i312) << 1) - (i312 ^ i311);
                b = i % 128;
                if (i % 2 != 0) {
                    int i313 = 3 % 4;
                }
            }
            int i40 = a;
            int i41 = ((i40 ^ 29) | (i40 & 29)) << 1;
            int i42 = -(((~i40) & 29) | (i40 & (-30)));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            b = i43 % 128;
            int i44 = i43 % 2;
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r11) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 119) << 1) - (~(-(((~i2) & 119) | (i2 & (-120)))))) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.onPostExecute(r11);
                throw null;
            }
            super.onPostExecute(r11);
            ag agVar = ag.this;
            int i4 = b;
            int i5 = (((i4 | 26) << 1) - (i4 ^ 26)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                ProgressDialog progressDialog = agVar.h;
                throw null;
            }
            ProgressDialog progressDialog2 = agVar.h;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                int i6 = a;
                int i7 = i6 ^ 93;
                int i8 = ((i6 & 93) | i7) << 1;
                int i9 = -i7;
                int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    ag.this.h.dismiss();
                    int i11 = 76 / 0;
                } else {
                    ag.this.h.dismiss();
                }
                int i12 = a;
                int i13 = i12 ^ 125;
                int i14 = (i12 & 125) << 1;
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            ag agVar2 = ag.this;
            SessionManager sessionManager = agVar2.A;
            int i17 = agVar2.r;
            SharedPreferences.Editor editor = sessionManager.d;
            int i18 = b;
            int i19 = i18 ^ 17;
            int i20 = -(-((i18 & 17) << 1));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                editor.putInt("k_count", i17);
                sessionManager.d.apply();
                int i22 = 18 / 0;
            } else {
                editor.putInt("k_count", i17);
                sessionManager.d.apply();
            }
            ag agVar3 = ag.this;
            SessionManager sessionManager2 = agVar3.A;
            AppCompatActivity appCompatActivity = agVar3.m;
            int i23 = b;
            int i24 = i23 & 59;
            int i25 = ((i23 ^ 59) | i24) << 1;
            int i26 = -((i23 | 59) & (~i24));
            int i27 = (i25 & i26) + (i26 | i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            int i29 = ((j) sessionManager2.h(appCompatActivity)).getInt("survey_count", 0);
            ag agVar4 = ag.this;
            int i30 = a;
            int i31 = (i30 & (-86)) | ((~i30) & 85);
            int i32 = -(-((i30 & 85) << 1));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            b = i33 % 128;
            if (i33 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            j.bJI bji = (j.bJI) ((j) agVar4.A.h(agVar4.m)).edit();
            bji.putInt("survey_count", i29 + 1);
            int i34 = b;
            int i35 = i34 & 75;
            int i36 = (i34 | 75) & (~i35);
            int i37 = -(-(i35 << 1));
            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
            a = i38 % 128;
            int i39 = i38 % 2;
            bji.apply();
            ag agVar5 = ag.this;
            h hVar = agVar5.k;
            int i40 = b;
            int i41 = (((i40 ^ 119) | (i40 & 119)) << 1) - (((~i40) & 119) | (i40 & (-120)));
            a = i41 % 128;
            if (i41 % 2 != 0) {
                hVar.aJ(true, agVar5.q);
            } else {
                hVar.aJ(true, agVar5.q);
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        int i = 2 % 2;
        try {
            ProgressDialog progressDialog = new ProgressDialog(this.m);
            this.h = progressDialog;
            progressDialog.setCancelable(false);
            this.h.setMessage("Please Wait...");
            this.h.setIndeterminate(true);
            this.h.show();
            int i2 = c + 119;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r8.before(r3) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (r7 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r2)
            r2 = 0
            java.lang.String r3 = ivas.gov.bisp.enumeration.p026az.z.f()     // Catch: java.text.ParseException -> L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.text.ParseException -> L63
            r4.<init>()     // Catch: java.text.ParseException -> L63
            r4.append(r3)     // Catch: java.text.ParseException -> L63
            java.lang.String r5 = " 07:00:00"
            r4.append(r5)     // Catch: java.text.ParseException -> L63
            java.lang.String r4 = r4.toString()     // Catch: java.text.ParseException -> L63
            java.util.Date r4 = r1.parse(r4)     // Catch: java.text.ParseException -> L63
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.text.ParseException -> L63
            r5.<init>()     // Catch: java.text.ParseException -> L63
            r5.append(r3)     // Catch: java.text.ParseException -> L63
            java.lang.String r3 = " 19:00:00"
            r5.append(r3)     // Catch: java.text.ParseException -> L63
            java.lang.String r3 = r5.toString()     // Catch: java.text.ParseException -> L63
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L63
            java.util.Date r7 = r1.parse(r7)     // Catch: java.text.ParseException -> L63
            java.util.Date r8 = r1.parse(r8)     // Catch: java.text.ParseException -> L63
            boolean r7 = r7.after(r4)     // Catch: java.text.ParseException -> L63
            if (r7 == 0) goto L63
            int r7 = ivas.gov.bisp.enumeration.p044bq.ag.c
            int r7 = r7 + 33
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.p044bq.ag.d = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L5c
            boolean r7 = r8.before(r3)     // Catch: java.text.ParseException -> L63
            r8 = 83
            int r8 = r8 / r2
            if (r7 == 0) goto L63
            goto L62
        L5c:
            boolean r7 = r8.before(r3)     // Catch: java.text.ParseException -> L63
            if (r7 == 0) goto L63
        L62:
            return r2
        L63:
            int r7 = ivas.gov.bisp.enumeration.p044bq.ag.d
            int r7 = r7 + 109
            int r8 = r7 % 128
            ivas.gov.bisp.enumeration.p044bq.ag.c = r8
            int r7 = r7 % r0
            r8 = 1
            if (r7 == 0) goto L72
            r7 = 99
            int r7 = r7 / r2
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p044bq.ag.h(java.lang.String, java.lang.String):boolean");
    }

    public class bwD implements I {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ AtomicReference c;
        public final /* synthetic */ CountDownLatch d;

        public bwD(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.c = atomicReference;
            this.d = countDownLatch;
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onError(ResponseMessage responseMessage) {
            int i = 2 % 2;
            int i2 = a + 15;
            b = i2 % 128;
            int i3 = i2 % 2;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Server Time Error: ");
            sbW.append(responseMessage.getErrorMessage());
            int i4 = a;
            int i5 = i4 ^ 85;
            int i6 = ((i4 & 85) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                Log.e("AsyncTaskSaveDataEnum", sbW.toString());
                throw null;
            }
            Log.e("AsyncTaskSaveDataEnum", sbW.toString());
            this.d.countDown();
            int i9 = a;
            int i10 = (i9 ^ 101) + ((i9 & 101) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onSuccess(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 123) + (i2 | 123);
            a = i3 % 128;
            int i4 = i3 % 2;
            try {
                try {
                    String string = jSONObject.getString("result");
                    SessionManager sessionManager = ag.this.A;
                    int i5 = b;
                    int i6 = i5 ^ 27;
                    int i7 = (((i5 & 27) | i6) << 1) - i6;
                    a = i7 % 128;
                    if (i7 % 2 == 0) {
                        b.b(sessionManager.k());
                        SessionManager sessionManager2 = ag.this.A;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    String string2 = new JSONObject(b.c(string, b.b(sessionManager.k()), b.b(ag.this.A.m()))).getString("time");
                    int i8 = b;
                    int i9 = i8 & 15;
                    int i10 = i9 + ((i8 ^ 15) | i9);
                    a = i10 % 128;
                    int i11 = i10 % 2;
                    this.c.set(string2);
                    ag agVar = ag.this;
                    int i12 = a;
                    int i13 = i12 & 53;
                    int i14 = (i12 | 53) & (~i13);
                    int i15 = -(-(i13 << 1));
                    int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    SharedPreferences sharedPreferencesH = agVar.A.h(agVar.m);
                    int i18 = a;
                    int i19 = i18 & 11;
                    int i20 = ((i18 ^ 11) | i19) << 1;
                    int i21 = -((i18 | 11) & (~i19));
                    int i22 = (i20 & i21) + (i21 | i20);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    SharedPreferences.Editor editorPutString = ((j) sharedPreferencesH).edit().putString("surveyEndTime", string2);
                    int i24 = a;
                    int i25 = (i24 | 9) << 1;
                    int i26 = -(i24 ^ 9);
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    editorPutString.apply();
                    int i29 = b;
                    int i30 = (-2) - (((i29 & 92) + (i29 | 92)) ^ (-1));
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    this.d.countDown();
                    int i32 = b;
                    int i33 = i32 & 73;
                    int i34 = (((i32 ^ 73) | i33) << 1) - ((i32 | 73) & (~i33));
                    a = i34 % 128;
                    if (i34 % 2 == 0) {
                        int i35 = 96 / 0;
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Server Time Decrypt/Parse Error: ");
                    sb.append(e.getMessage());
                    Log.e("AsyncTaskSaveDataEnum", sb.toString());
                }
            } catch (Throwable th) {
                this.d.countDown();
                throw th;
            }
        }
    }

    public class bwE extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public String c;

        public bwE(String str) {
            this.c = str;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0040  */
        /* JADX WARN: Code duplicated, block: B:12:0x0046  */
        /* JADX WARN: Code duplicated, block: B:14:0x0055  */
        /* JADX WARN: Code duplicated, block: B:16:0x0070  */
        /* JADX WARN: Code duplicated, block: B:17:0x0073  */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((((i4 ^ 77) | (i4 & 77)) << 1) - (~(-(((~i4) & 77) | (i4 & (-78)))))) - 1;
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                super.onPostExecute(r9);
                ProgressDialog progressDialog = ag.this.h;
                obj.hashCode();
                throw null;
            }
            super.onPostExecute(r9);
            ProgressDialog progressDialog2 = ag.this.h;
            int i6 = b;
            int i7 = (((i6 | 102) << 1) - (i6 ^ 102)) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 55 / 0;
                if (progressDialog2 != null) {
                    if (progressDialog2.isShowing()) {
                        int i9 = a;
                        i = (i9 ^ 69) + ((i9 & 69) << 1);
                        b = i % 128;
                        if (i % 2 == 0) {
                            ag.this.h.dismiss();
                            throw null;
                        }
                        ag.this.h.dismiss();
                        int i10 = a;
                        int i11 = i10 & 91;
                        int i12 = -(-(i10 | 91));
                        i2 = ((i11 | i12) << 1) - (i12 ^ i11);
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i13 = 3 / 2;
                        }
                    }
                }
            } else if (progressDialog2 != null) {
                if (progressDialog2.isShowing()) {
                    int i14 = a;
                    i = (i14 ^ 69) + ((i14 & 69) << 1);
                    b = i % 128;
                    if (i % 2 == 0) {
                        ag.this.h.dismiss();
                        throw null;
                    }
                    ag.this.h.dismiss();
                    int i15 = a;
                    int i16 = i15 & 91;
                    int i17 = -(-(i15 | 91));
                    i2 = ((i16 | i17) << 1) - (i17 ^ i16);
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i18 = 3 / 2;
                    }
                }
            }
            ag agVar = ag.this;
            agVar.q = "Survey locally saved successfully";
            SessionManager sessionManager = agVar.A;
            int i19 = agVar.r;
            int i20 = b;
            int i21 = i20 & 51;
            int i22 = i21 + ((i20 ^ 51) | i21);
            a = i22 % 128;
            int i23 = i22 % 2;
            sessionManager.d.putInt("k_count", i19);
            SharedPreferences.Editor editor = sessionManager.d;
            int i24 = a;
            int i25 = i24 & 61;
            int i26 = ((i24 ^ 61) | i25) << 1;
            int i27 = -((i24 | 61) & (~i25));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            b = i28 % 128;
            int i29 = i28 % 2;
            editor.apply();
            ag agVar2 = ag.this;
            SessionManager sessionManager2 = agVar2.A;
            AppCompatActivity appCompatActivity = agVar2.m;
            int i30 = a + 51;
            b = i30 % 128;
            int i31 = (i30 % 2 != 0 ? (j) sessionManager2.h(appCompatActivity) : (j) sessionManager2.h(appCompatActivity)).getInt("survey_count", 0);
            ag agVar3 = ag.this;
            j jVar = (j) agVar3.A.h(agVar3.m);
            int i32 = b;
            int i33 = ((i32 ^ 35) - (~((i32 & 35) << 1))) - 1;
            a = i33 % 128;
            int i34 = i33 % 2;
            j.bJI bji = (j.bJI) jVar.edit();
            bji.putInt("survey_count", i31 + 1);
            int i35 = b;
            int i36 = ((i35 ^ 51) | (i35 & 51)) << 1;
            int i37 = -(((~i35) & 51) | (i35 & (-52)));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            a = i38 % 128;
            int i39 = i38 % 2;
            bji.apply();
            ag agVar4 = ag.this;
            h hVar = agVar4.k;
            String str = agVar4.q;
            int i40 = a;
            int i41 = (-2) - (((i40 ^ 86) + ((i40 & 86) << 1)) ^ (-1));
            b = i41 % 128;
            int i42 = i41 % 2;
            hVar.aJ(true, str);
            int i43 = a;
            int i44 = ((i43 | 25) << 1) - (i43 ^ 25);
            b = i44 % 128;
            if (i44 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0352  */
        /* JADX WARN: Code duplicated, block: B:102:0x0354  */
        /* JADX WARN: Code duplicated, block: B:105:0x0358 A[Catch: Exception -> 0x03e3, TRY_LEAVE, TryCatch #8 {Exception -> 0x03e3, blocks: (B:76:0x02ef, B:79:0x030c, B:81:0x0312, B:90:0x032d, B:92:0x0334, B:103:0x0355, B:105:0x0358, B:108:0x0385, B:113:0x039e, B:115:0x03a3, B:119:0x03a7, B:122:0x03dd, B:123:0x03e0, B:97:0x033a, B:86:0x0319), top: B:147:0x02ef }] */
        /* JADX WARN: Code duplicated, block: B:108:0x0385 A[Catch: Exception -> 0x03e3, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x03e3, blocks: (B:76:0x02ef, B:79:0x030c, B:81:0x0312, B:90:0x032d, B:92:0x0334, B:103:0x0355, B:105:0x0358, B:108:0x0385, B:113:0x039e, B:115:0x03a3, B:119:0x03a7, B:122:0x03dd, B:123:0x03e0, B:97:0x033a, B:86:0x0319), top: B:147:0x02ef }] */
        /* JADX WARN: Code duplicated, block: B:111:0x038c  */
        /* JADX WARN: Code duplicated, block: B:113:0x039e A[Catch: Exception -> 0x03e3, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x03e3, blocks: (B:76:0x02ef, B:79:0x030c, B:81:0x0312, B:90:0x032d, B:92:0x0334, B:103:0x0355, B:105:0x0358, B:108:0x0385, B:113:0x039e, B:115:0x03a3, B:119:0x03a7, B:122:0x03dd, B:123:0x03e0, B:97:0x033a, B:86:0x0319), top: B:147:0x02ef }] */
        /* JADX WARN: Code duplicated, block: B:119:0x03a7 A[Catch: Exception -> 0x03e3, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x03e3, blocks: (B:76:0x02ef, B:79:0x030c, B:81:0x0312, B:90:0x032d, B:92:0x0334, B:103:0x0355, B:105:0x0358, B:108:0x0385, B:113:0x039e, B:115:0x03a3, B:119:0x03a7, B:122:0x03dd, B:123:0x03e0, B:97:0x033a, B:86:0x0319), top: B:147:0x02ef }] */
        /* JADX WARN: Code duplicated, block: B:152:0x02e0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:154:0x0268 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x03dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x03b6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0255 A[PHI: r3
  0x0255: PHI (r3v33 java.lang.String[]) = (r3v32 java.lang.String[]), (r3v34 java.lang.String[]) binds: [B:53:0x0253, B:48:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:57:0x026b A[Catch: Exception -> 0x02e4, TRY_LEAVE, TryCatch #6 {Exception -> 0x02e4, blocks: (B:39:0x020f, B:41:0x0222, B:45:0x0241, B:47:0x0248, B:55:0x0268, B:57:0x026b, B:60:0x029b, B:62:0x02a1, B:70:0x02af, B:67:0x02a7, B:52:0x024e), top: B:143:0x020f }] */
        /* JADX WARN: Code duplicated, block: B:60:0x029b A[Catch: Exception -> 0x02e4, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x02e4, blocks: (B:39:0x020f, B:41:0x0222, B:45:0x0241, B:47:0x0248, B:55:0x0268, B:57:0x026b, B:60:0x029b, B:62:0x02a1, B:70:0x02af, B:67:0x02a7, B:52:0x024e), top: B:143:0x020f }] */
        /* JADX WARN: Code duplicated, block: B:67:0x02a7 A[Catch: Exception -> 0x02e4, TRY_ENTER, TryCatch #6 {Exception -> 0x02e4, blocks: (B:39:0x020f, B:41:0x0222, B:45:0x0241, B:47:0x0248, B:55:0x0268, B:57:0x026b, B:60:0x029b, B:62:0x02a1, B:70:0x02af, B:67:0x02a7, B:52:0x024e), top: B:143:0x020f }] */
        /* JADX WARN: Code duplicated, block: B:69:0x02ae  */
        /* JADX WARN: Code duplicated, block: B:70:0x02af A[Catch: Exception -> 0x02e4, TRY_LEAVE, TryCatch #6 {Exception -> 0x02e4, blocks: (B:39:0x020f, B:41:0x0222, B:45:0x0241, B:47:0x0248, B:55:0x0268, B:57:0x026b, B:60:0x029b, B:62:0x02a1, B:70:0x02af, B:67:0x02a7, B:52:0x024e), top: B:143:0x020f }] */
        /* JADX WARN: Code duplicated, block: B:88:0x031f  */
        /* JADX WARN: Code duplicated, block: B:90:0x032d A[Catch: Exception -> 0x03e3, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x03e3, blocks: (B:76:0x02ef, B:79:0x030c, B:81:0x0312, B:90:0x032d, B:92:0x0334, B:103:0x0355, B:105:0x0358, B:108:0x0385, B:113:0x039e, B:115:0x03a3, B:119:0x03a7, B:122:0x03dd, B:123:0x03e0, B:97:0x033a, B:86:0x0319), top: B:147:0x02ef }] */
        /* JADX WARN: Code duplicated, block: B:97:0x033a A[Catch: Exception -> 0x03e3, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x03e3, blocks: (B:76:0x02ef, B:79:0x030c, B:81:0x0312, B:90:0x032d, B:92:0x0334, B:103:0x0355, B:105:0x0358, B:108:0x0385, B:113:0x039e, B:115:0x03a3, B:119:0x03a7, B:122:0x03dd, B:123:0x03e0, B:97:0x033a, B:86:0x0319), top: B:147:0x02ef }] */
        /* JADX WARN: Code duplicated, block: B:99:0x0341 A[PHI: r3
  0x0341: PHI (r3v20 java.lang.String[]) = (r3v19 java.lang.String[]), (r3v21 java.lang.String[]) binds: [B:98:0x033f, B:93:0x0335] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i;
            String[] list;
            int i2;
            int i3;
            File file;
            int i4;
            int i5;
            String[] list2;
            int i6;
            File file2;
            int i7;
            int i8;
            int i9 = 2 % 2;
            int i10 = a;
            int i11 = ((i10 & (-96)) | ((~i10) & 95)) + ((i10 & 95) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            AppDatabase appDatabaseL = AppDatabase.l(ag.this.m);
            appDatabaseL.m().bp(new survey(new Date().getTime(), this.c));
            ArrayList arrayList = new ArrayList(appDatabaseL.m().P());
            int i13 = a;
            int i14 = ((i13 ^ 39) | (i13 & 39)) << 1;
            int i15 = -(((~i13) & 39) | (i13 & (-40)));
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            Object obj = null;
            if (i16 % 2 != 0) {
                arrayList.size();
                obj.hashCode();
                throw null;
            }
            if (arrayList.size() > 0) {
                int i17 = a + 42;
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                survey_count survey_countVar = (survey_count) arrayList.get(0);
                h hVarM = appDatabaseL.m();
                int i20 = a;
                int i21 = i20 ^ 27;
                int i22 = (i20 & 27) << 1;
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                int i24 = i23 % 2;
                long j = survey_countVar.id;
                int i25 = survey_countVar.sync_count;
                int i26 = a;
                int i27 = i26 ^ 117;
                int i28 = ((i26 & 117) | i27) << 1;
                int i29 = -i27;
                int i30 = (i28 & i29) + (i28 | i29);
                b = i30 % 128;
                int i31 = i30 % 2;
                int i32 = survey_countVar.not_sync_count;
                int i33 = b;
                int i34 = i33 ^ 111;
                int i35 = ((i33 & 111) | i34) << 1;
                int i36 = -i34;
                int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                a = i37 % 128;
                if (i37 % 2 == 0) {
                    hVarM.aS(j, i25, i32);
                } else {
                    int i38 = i32 & 1;
                    hVarM.aS(j, i25, (i38 - (~(-(-((i32 ^ 1) | i38))))) - 1);
                }
            } else {
                h hVarM2 = appDatabaseL.m();
                survey_count survey_countVar2 = new survey_count(new Date().getTime(), 0, 1);
                int i39 = b + 59;
                a = i39 % 128;
                if (i39 % 2 == 0) {
                    hVarM2.bn(survey_countVar2);
                    int i40 = 78 / 0;
                } else {
                    hVarM2.bn(survey_countVar2);
                }
                int i41 = a;
                int i42 = i41 & 25;
                int i43 = -(-((i41 ^ 25) | i42));
                int i44 = (i42 & i43) + (i43 | i42);
                b = i44 % 128;
                int i45 = i44 % 2;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                sb.append("/Pictures");
                File file3 = new File(sb.toString());
                int i46 = b;
                int i47 = i46 | 101;
                int i48 = ((i47 << 1) - (~(-((~(i46 & 101)) & i47)))) - 1;
                a = i48 % 128;
                int i49 = i48 % 2;
                if (file3.isDirectory()) {
                    int i50 = b;
                    int i51 = ((((i50 ^ 123) | (i50 & 123)) << 1) - (~(-(((~i50) & 123) | (i50 & (-124)))))) - 1;
                    a = i51 % 128;
                    int i52 = i51 % 2;
                    String[] list3 = file3.list();
                    if (list3.length > 0) {
                        int i53 = b;
                        int i54 = (i53 | 117) << 1;
                        int i55 = -((i53 & (-118)) | ((~i53) & 117));
                        int i56 = (i54 & i55) + (i54 | i55);
                        a = i56 % 128;
                        int i57 = i56 % 2;
                        int i58 = i53 & 111;
                        int i59 = (i53 ^ 111) | i58;
                        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                        a = i60 % 128;
                        int i61 = i60 % 2;
                        int i62 = 0;
                        while (i62 < list3.length) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file3.toString());
                            sb2.append("/");
                            sb2.append(list3[i62]);
                            File file4 = new File(sb2.toString());
                            int i63 = b;
                            int i64 = i63 & 15;
                            int i65 = (i63 | 15) & (~i64);
                            int i66 = i64 << 1;
                            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                            a = i67 % 128;
                            int i68 = i67 % 2;
                            if (file4.exists()) {
                                int i69 = a;
                                int i70 = ((((i69 ^ 61) | (i69 & 61)) << 1) - (~(-(((~i69) & 61) | (i69 & (-62)))))) - 1;
                                b = i70 % 128;
                                if (i70 % 2 != 0) {
                                    file4.delete();
                                    throw null;
                                }
                                file4.delete();
                                int i71 = b;
                                int i72 = i71 ^ 103;
                                int i73 = (((i71 & 103) | i72) << 1) - i72;
                                a = i73 % 128;
                                int i74 = i73 % 2;
                            }
                            i62 = (i62 | 1) + (i62 & 1);
                            int i75 = b;
                            int i76 = ((i75 ^ 28) + ((i75 & 28) << 1)) - 1;
                            a = i76 % 128;
                            int i77 = i76 % 2;
                        }
                    }
                }
            } catch (Exception unused) {
                Toast.makeText(ag.this.m, "Error Has Been occurs..!", 0).show();
            }
            try {
                AppCompatActivity appCompatActivity = ag.this.m;
                String str = Environment.DIRECTORY_PICTURES;
                int i78 = a;
                int i79 = i78 & 113;
                int i80 = i79 + ((i78 ^ 113) | i79);
                b = i80 % 128;
                int i81 = i80 % 2;
                File externalFilesDir = appCompatActivity.getExternalFilesDir(str);
                if (externalFilesDir.isDirectory()) {
                    int i82 = b;
                    int i83 = i82 ^ 11;
                    int i84 = ((i82 & 11) | i83) << 1;
                    int i85 = -i83;
                    int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
                    a = i86 % 128;
                    if (i86 % 2 == 0) {
                        list2 = externalFilesDir.list();
                        int i87 = 99 / 0;
                        if (list2.length > 0) {
                            int i88 = a;
                            int i89 = i88 ^ 55;
                            int i90 = -(-((i88 & 55) << 1));
                            int i91 = (i89 & i90) + (i90 | i89);
                            b = i91 % 128;
                            int i92 = i91 % 2;
                            i6 = 0;
                            while (i6 < list2.length) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(externalFilesDir.toString());
                                sb3.append("/");
                                sb3.append(list2[i6]);
                                file2 = new File(sb3.toString());
                                int i93 = b;
                                int i94 = i93 ^ 29;
                                int i95 = (i93 & 29) << 1;
                                i7 = (i94 ^ i95) + ((i95 & i94) << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i96 = 49 / 0;
                                    if (file2.exists()) {
                                        file2.delete();
                                        int i97 = a;
                                        int i98 = i97 & 103;
                                        int i99 = ((i97 ^ 103) | i98) << 1;
                                        int i100 = -((i97 | 103) & (~i98));
                                        int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                                        b = i101 % 128;
                                        int i102 = i101 % 2;
                                    }
                                } else if (!file2.exists()) {
                                    file2.delete();
                                    int i910 = a;
                                    int i911 = i910 & 103;
                                    int i912 = ((i910 ^ 103) | i911) << 1;
                                    int i103 = -((i910 | 103) & (~i911));
                                    int i104 = ((i912 | i103) << 1) - (i103 ^ i912);
                                    b = i104 % 128;
                                    int i105 = i104 % 2;
                                }
                                i6++;
                                int i106 = a;
                                int i107 = i106 & 25;
                                int i108 = -(-((i106 ^ 25) | i107));
                                i8 = (i107 & i108) + (i108 | i107);
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i109 = 4 / 5;
                                }
                            }
                        }
                    } else {
                        list2 = externalFilesDir.list();
                        if (list2.length > 0) {
                            int i810 = a;
                            int i811 = i810 ^ 55;
                            int i913 = -(-((i810 & 55) << 1));
                            int i914 = (i811 & i913) + (i913 | i811);
                            b = i914 % 128;
                            int i915 = i914 % 2;
                            i6 = 0;
                            while (i6 < list2.length) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(externalFilesDir.toString());
                                sb4.append("/");
                                sb4.append(list2[i6]);
                                file2 = new File(sb4.toString());
                                int i916 = b;
                                int i917 = i916 ^ 29;
                                int i918 = (i916 & 29) << 1;
                                i7 = (i917 ^ i918) + ((i918 & i917) << 1);
                                a = i7 % 128;
                                if (i7 % 2 == 0) {
                                    int i919 = 49 / 0;
                                    if (file2.exists()) {
                                        file2.delete();
                                        int i9110 = a;
                                        int i9111 = i9110 & 103;
                                        int i9112 = ((i9110 ^ 103) | i9111) << 1;
                                        int i1010 = -((i9110 | 103) & (~i9111));
                                        int i1011 = ((i9112 | i1010) << 1) - (i1010 ^ i9112);
                                        b = i1011 % 128;
                                        int i1012 = i1011 % 2;
                                    }
                                } else if (!file2.exists()) {
                                    file2.delete();
                                    int i9113 = a;
                                    int i9114 = i9113 & 103;
                                    int i9115 = ((i9113 ^ 103) | i9114) << 1;
                                    int i1013 = -((i9113 | 103) & (~i9114));
                                    int i1014 = ((i9115 | i1013) << 1) - (i1013 ^ i9115);
                                    b = i1014 % 128;
                                    int i1015 = i1014 % 2;
                                }
                                i6++;
                                int i1016 = a;
                                int i1017 = i1016 & 25;
                                int i1018 = -(-((i1016 ^ 25) | i1017));
                                i8 = (i1017 & i1018) + (i1018 | i1017);
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i1019 = 4 / 5;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                Toast.makeText(ag.this.m, "Error Has Been occurs..!", 0).show();
            }
            try {
                File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                int i110 = a;
                int i111 = ((i110 ^ 36) + ((i110 & 36) << 1)) - 1;
                b = i111 % 128;
                if (i111 % 2 != 0) {
                    int i112 = 40 / 0;
                    if (file5.isDirectory()) {
                        int i113 = a;
                        i = (i113 & 119) + (i113 | 119);
                        b = i % 128;
                        if (i % 2 != 0) {
                            list = file5.list();
                            int i114 = 9 / 0;
                            if (list.length > 0) {
                                int i115 = a;
                                i2 = ((i115 & (-2)) | ((~i115) & 1)) + ((i115 & 1) << 1);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                while (i3 < list.length) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(file5.toString());
                                    sb5.append("/");
                                    sb5.append(list[i3]);
                                    file = new File(sb5.toString());
                                    int i116 = a;
                                    i4 = ((i116 & 89) - (~(i116 | 89))) - 1;
                                    b = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        file.exists();
                                        throw null;
                                    }
                                    if (!file.exists()) {
                                        int i117 = a;
                                        int i118 = i117 & 23;
                                        int i119 = i117 | 23;
                                        i5 = ((i118 | i119) << 1) - (i119 ^ i118);
                                        b = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            file.delete();
                                            int i120 = 31 / 0;
                                        } else {
                                            file.delete();
                                        }
                                        int i121 = a;
                                        int i122 = (i121 & 9) + (i121 | 9);
                                        b = i122 % 128;
                                        int i123 = i122 % 2;
                                    }
                                    int i124 = (i3 & (-2)) | ((~i3) & 1);
                                    int i125 = -(-((i3 & 1) << 1));
                                    i3 = ((i124 | i125) << 1) - (i125 ^ i124);
                                    int i126 = a;
                                    int i127 = (i126 | 117) << 1;
                                    int i128 = -(((~i126) & 117) | (i126 & (-118)));
                                    int i129 = ((i127 | i128) << 1) - (i128 ^ i127);
                                    b = i129 % 128;
                                    int i130 = i129 % 2;
                                }
                            }
                        } else {
                            list = file5.list();
                            if (list.length > 0) {
                                int i1110 = a;
                                i2 = ((i1110 & (-2)) | ((~i1110) & 1)) + ((i1110 & 1) << 1);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                while (i3 < list.length) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(file5.toString());
                                    sb6.append("/");
                                    sb6.append(list[i3]);
                                    file = new File(sb6.toString());
                                    int i1111 = a;
                                    i4 = ((i1111 & 89) - (~(i1111 | 89))) - 1;
                                    b = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        file.exists();
                                        throw null;
                                    }
                                    if (!file.exists()) {
                                        int i1112 = a;
                                        int i1113 = i1112 & 23;
                                        int i1114 = i1112 | 23;
                                        i5 = ((i1113 | i1114) << 1) - (i1114 ^ i1113);
                                        b = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            file.delete();
                                            int i1210 = 31 / 0;
                                        } else {
                                            file.delete();
                                        }
                                        int i1211 = a;
                                        int i1212 = (i1211 & 9) + (i1211 | 9);
                                        b = i1212 % 128;
                                        int i1213 = i1212 % 2;
                                    }
                                    int i1214 = (i3 & (-2)) | ((~i3) & 1);
                                    int i1215 = -(-((i3 & 1) << 1));
                                    i3 = ((i1214 | i1215) << 1) - (i1215 ^ i1214);
                                    int i1216 = a;
                                    int i1217 = (i1216 | 117) << 1;
                                    int i1218 = -(((~i1216) & 117) | (i1216 & (-118)));
                                    int i1219 = ((i1217 | i1218) << 1) - (i1218 ^ i1217);
                                    b = i1219 % 128;
                                    int i131 = i1219 % 2;
                                }
                            }
                        }
                    }
                } else if (file5.isDirectory()) {
                    int i1115 = a;
                    i = (i1115 & 119) + (i1115 | 119);
                    b = i % 128;
                    if (i % 2 != 0) {
                        list = file5.list();
                        int i1116 = 9 / 0;
                        if (list.length > 0) {
                            int i1117 = a;
                            i2 = ((i1117 & (-2)) | ((~i1117) & 1)) + ((i1117 & 1) << 1);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            while (i3 < list.length) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(file5.toString());
                                sb7.append("/");
                                sb7.append(list[i3]);
                                file = new File(sb7.toString());
                                int i1118 = a;
                                i4 = ((i1118 & 89) - (~(i1118 | 89))) - 1;
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    file.exists();
                                    throw null;
                                }
                                if (!file.exists()) {
                                    int i1119 = a;
                                    int i11110 = i1119 & 23;
                                    int i11111 = i1119 | 23;
                                    i5 = ((i11110 | i11111) << 1) - (i11111 ^ i11110);
                                    b = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        file.delete();
                                        int i12110 = 31 / 0;
                                    } else {
                                        file.delete();
                                    }
                                    int i12111 = a;
                                    int i12112 = (i12111 & 9) + (i12111 | 9);
                                    b = i12112 % 128;
                                    int i12113 = i12112 % 2;
                                }
                                int i12114 = (i3 & (-2)) | ((~i3) & 1);
                                int i12115 = -(-((i3 & 1) << 1));
                                i3 = ((i12114 | i12115) << 1) - (i12115 ^ i12114);
                                int i12116 = a;
                                int i12117 = (i12116 | 117) << 1;
                                int i12118 = -(((~i12116) & 117) | (i12116 & (-118)));
                                int i12119 = ((i12117 | i12118) << 1) - (i12118 ^ i12117);
                                b = i12119 % 128;
                                int i132 = i12119 % 2;
                            }
                        }
                    } else {
                        list = file5.list();
                        if (list.length > 0) {
                            int i11112 = a;
                            i2 = ((i11112 & (-2)) | ((~i11112) & 1)) + ((i11112 & 1) << 1);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            while (i3 < list.length) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(file5.toString());
                                sb8.append("/");
                                sb8.append(list[i3]);
                                file = new File(sb8.toString());
                                int i11113 = a;
                                i4 = ((i11113 & 89) - (~(i11113 | 89))) - 1;
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    file.exists();
                                    throw null;
                                }
                                if (!file.exists()) {
                                    int i11114 = a;
                                    int i11115 = i11114 & 23;
                                    int i11116 = i11114 | 23;
                                    i5 = ((i11115 | i11116) << 1) - (i11116 ^ i11115);
                                    b = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        file.delete();
                                        int i121110 = 31 / 0;
                                    } else {
                                        file.delete();
                                    }
                                    int i121111 = a;
                                    int i121112 = (i121111 & 9) + (i121111 | 9);
                                    b = i121112 % 128;
                                    int i121113 = i121112 % 2;
                                }
                                int i121114 = (i3 & (-2)) | ((~i3) & 1);
                                int i121115 = -(-((i3 & 1) << 1));
                                i3 = ((i121114 | i121115) << 1) - (i121115 ^ i121114);
                                int i121116 = a;
                                int i121117 = (i121116 | 117) << 1;
                                int i121118 = -(((~i121116) & 117) | (i121116 & (-118)));
                                int i121119 = ((i121117 | i121118) << 1) - (i121118 ^ i121117);
                                b = i121119 % 128;
                                int i133 = i121119 % 2;
                            }
                        }
                    }
                }
            } catch (Exception unused3) {
                Toast.makeText(ag.this.m, "Error Has Been occurs..!", 0).show();
            }
            int i134 = a;
            int i135 = ((i134 | 1) << 1) - (((~i134) & 1) | (i134 & (-2)));
            b = i135 % 128;
            int i136 = i135 % 2;
            return null;
        }
    }

    public final void k(String str) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = d + 51;
        c = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.D) {
                new Handler(Looper.getMainLooper()).post(new af(this, i));
                return;
            }
            this.y = new JSONObject();
            this.y.put("string1", b.d(str, b.b(this.A.k()), b.b(this.A.m())));
            if (this.A.l().intValue() != 2 && this.A.l().intValue() != 3) {
                this.y.put("string2", b.d("StoreHouseholdSurveyData29102026", b.b(this.A.k()), b.b(this.A.m())));
                e(this.y);
                return;
            }
            if (BISPApplication.c().g) {
                this.y.put("string2", b.d("StoreHouseholdSurveyData29102026", b.b(this.A.k()), b.b(this.A.m())));
                e(this.y);
            } else {
                new H(this.y.toString(), this.m, this.k).execute(new Void[0]);
                int i4 = d + 19;
                c = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00db  */
    /* JADX WARN: Code duplicated, block: B:20:0x0101  */
    public final String g() {
        int i;
        int i2 = 2 % 2;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference(null);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Data", "BISP NSER Dynamic Registry");
            byte[] bArrB = b.b(this.A.k());
            byte[] bArrB2 = b.b(this.A.m());
            String strD = b.d(jSONObject.toString(), bArrB, bArrB2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("string1", strD);
            Object[] objArr = new Object[1];
            a(43481 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{46414, 7349, 59087, 18641, 4616, 58438, 20073, 4483, 64435, 19964, 5914, 63799, 17216, 5466, 64741}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            StringBuilder sb = new StringBuilder();
            sb.append("https://meladeskapp.bisp.gov.pk");
            sb.append("/api/Users/UbZJVzTu9rHlQm0D");
            ax.e(jSONObject2, this.m, sb.toString(), new bwD(atomicReference, countDownLatch));
            countDownLatch.await(10L, TimeUnit.SECONDS);
            int i3 = d + 107;
            c = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fetchServerTimeSync Exception: ");
            sb2.append(e2.getMessage());
            Log.e("AsyncTaskSaveDataEnum", sb2.toString());
            countDownLatch.countDown();
        }
        String strE = (String) atomicReference.get();
        if (strE != null) {
            int i5 = d + 121;
            c = i5 % 128;
            if (i5 % 2 != 0) {
                strE.trim().isEmpty();
                throw null;
            }
            if (strE.trim().isEmpty()) {
                strE = z.e();
                ((j) this.A.h(this.m)).edit().putString("surveyEndTime", strE).apply();
                i = d + 59;
                c = i % 128;
                if (i % 2 != 0) {
                    int i6 = 2 / 3;
                }
            }
        } else {
            strE = z.e();
            ((j) this.A.h(this.m)).edit().putString("surveyEndTime", strE).apply();
            i = d + 59;
            c = i % 128;
            if (i % 2 != 0) {
                int i7 = 2 / 3;
            }
        }
        return strE;
    }

    public final void i(int i, List<TabletLogEntity> list, JSONObject jSONObject) {
        int i2 = 2 % 2;
        while (i < list.size()) {
            TabletLogEntity tabletLogEntity = list.get(i);
            String str = tabletLogEntity.tabletLogJson;
            if (str != null) {
                int i3 = c + 5;
                d = i3 % 128;
                int i4 = i3 % 2;
                if (str.trim().isEmpty()) {
                    continue;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = new JSONObject(tabletLogEntity.tabletLogJson).optString("respondantNic", BuildConfig.FLAVOR);
                        String strY = this.A.y();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("JsonLogData", tabletLogEntity.tabletLogJson);
                        jSONObject3.put("respondantNic", strOptString);
                        jSONObject3.put("userId", strY);
                        jSONObject2.put("string1", b.d(jSONObject3.toString(), b.b(this.A.k()), b.b(this.A.m())));
                        jSONObject2.put("string2", b.d("TabletNadraLog", b.b(this.A.k()), b.b(this.A.m())));
                        ax.e(jSONObject2, this.m, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new ah(this, tabletLogEntity.id, i, list, jSONObject));
                        return;
                    } catch (JSONException unused) {
                        continue;
                    }
                }
            }
            i++;
        }
        ax.d(false, jSONObject, this.m, "/api/Roster/bZJVzTu9rHlQm0D", new aj(this, jSONObject));
        int i5 = c + 37;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004f A[Catch: Exception -> 0x00f1, TryCatch #1 {Exception -> 0x00f1, blocks: (B:3:0x0009, B:5:0x000f, B:9:0x0020, B:10:0x0026, B:12:0x002c, B:13:0x002f, B:26:0x005b, B:28:0x005f, B:30:0x0066, B:34:0x007f, B:36:0x0095, B:40:0x00ae, B:42:0x00c9, B:44:0x00d5, B:46:0x00e4, B:18:0x003d, B:23:0x0046, B:25:0x004f, B:21:0x0042), top: B:51:0x0009 }] */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        int i = 2 % 2;
        Boolean bool2 = bool;
        try {
            if (!(!BISPApplication.f)) {
                int i2 = d + 19;
                c = i2 % 128;
                if (i2 % 2 != 0) {
                    if (ivas.gov.bisp.enumeration.bK.ag.n == 2) {
                        if (!(!this.h.isShowing())) {
                            this.h.dismiss();
                            this.q = "Survey locally saved successfully";
                            this.k.aJ(true, "Survey locally saved successfully");
                        }
                    }
                } else if (ivas.gov.bisp.enumeration.bK.ag.n == 2) {
                    if (!(!this.h.isShowing())) {
                        this.h.dismiss();
                        this.q = "Survey locally saved successfully";
                        this.k.aJ(true, "Survey locally saved successfully");
                    }
                }
            } else if (bool2.booleanValue()) {
                int i3 = c + 25;
                d = i3 % 128;
                if (i3 % 2 == 0) {
                    this.h.isShowing();
                    Object obj = null;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.h.isShowing();
            }
            if (this.g == 2) {
                Survey survey = this.l;
                if (survey.visit_status_id == 3) {
                    if (!survey.survey_type.equalsIgnoreCase("sampling")) {
                        if (this.l.survey_type.equalsIgnoreCase("snowball")) {
                            long j = ah.c.d.getLong("snowball_count", 0L);
                            if (this.l.snowball_type == 4) {
                                ah ahVar = ah.c;
                                ahVar.e.putLong("snowball_count", j + 1);
                                ahVar.e.commit();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i4 = d + 23;
                    c = i4 % 128;
                    int i5 = i4 % 2;
                    long j2 = ah.c.d.getLong("sampling_count", 0L);
                    long j3 = ah.c.d.getLong("snowball_count", 0L);
                    int i6 = this.l.bisp_survey_taken_before;
                    if (i6 == 1) {
                        ah ahVar2 = ah.c;
                        ahVar2.e.putLong("sampling_count", j2 + 1);
                        ahVar2.e.commit();
                        int i7 = c + 87;
                        d = i7 % 128;
                        int i8 = i7 % 2;
                        return;
                    }
                    if (i6 == 0) {
                        ah ahVar3 = ah.c;
                        ahVar3.e.putLong("sampling_count", j2 + 1);
                        ahVar3.e.commit();
                        ah ahVar4 = ah.c;
                        ahVar4.e.putLong("snowball_count", j3 + 1);
                        ahVar4.e.commit();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0540 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x054e A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0558 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0575 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:140:0x0710  */
    /* JADX WARN: Code duplicated, block: B:142:0x071c A[Catch: Exception -> 0x106c, TRY_ENTER, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0724 A[Catch: Exception -> 0x106c, TRY_LEAVE, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0732 A[Catch: Exception -> 0x106c, TRY_ENTER, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x09d5 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x09eb A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x09f5 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x09fd A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0a16 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:192:0x0bba A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0c32  */
    /* JADX WARN: Code duplicated, block: B:213:0x0cd6 A[Catch: Exception -> 0x106c, TRY_ENTER, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0ce6 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0d1f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0d80 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0dd9 A[Catch: Exception -> 0x106c, TRY_LEAVE, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0df2  */
    /* JADX WARN: Code duplicated, block: B:238:0x0f24 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x0f3e A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x0f4c A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0f54 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x0fb0 A[Catch: Exception -> 0x106c, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0fc5 A[Catch: Exception -> 0x106c, TRY_LEAVE, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x0feb A[Catch: Exception -> 0x106c, TRY_LEAVE, TryCatch #4 {Exception -> 0x106c, blocks: (B:68:0x02e3, B:70:0x02f3, B:72:0x0303, B:75:0x0314, B:79:0x0332, B:90:0x0363, B:91:0x036e, B:94:0x0435, B:97:0x0444, B:99:0x0458, B:101:0x0479, B:103:0x0482, B:106:0x0517, B:108:0x0524, B:111:0x0532, B:116:0x0561, B:118:0x056f, B:120:0x0575, B:122:0x0589, B:124:0x0599, B:126:0x05a9, B:136:0x05f5, B:137:0x0600, B:142:0x071c, B:150:0x0739, B:152:0x09d5, B:155:0x09e3, B:160:0x0a04, B:162:0x0a16, B:164:0x0a26, B:166:0x0a36, B:170:0x0a58, B:172:0x0a6a, B:187:0x0abb, B:188:0x0ac6, B:190:0x0b4c, B:192:0x0bba, B:194:0x0bca, B:197:0x0be4, B:199:0x0bf8, B:201:0x0c08, B:208:0x0c3a, B:209:0x0c47, B:210:0x0cc8, B:213:0x0cd6, B:215:0x0ce6, B:217:0x0d21, B:218:0x0d28, B:220:0x0d80, B:222:0x0d90, B:224:0x0da0, B:226:0x0db0, B:228:0x0dc0, B:231:0x0dd1, B:236:0x0df5, B:238:0x0f24, B:241:0x0f32, B:246:0x0f5b, B:248:0x0fb0, B:252:0x0fd4, B:254:0x0feb, B:257:0x1004, B:260:0x1037, B:262:0x103f, B:249:0x0fc5, B:242:0x0f3e, B:244:0x0f4c, B:245:0x0f54, B:232:0x0dd9, B:204:0x0c1b, B:175:0x0a83, B:177:0x0a98, B:179:0x0aa8, B:180:0x0aab, B:156:0x09eb, B:158:0x09f5, B:159:0x09fd, B:143:0x0724, B:145:0x072c, B:146:0x072f, B:149:0x0732, B:129:0x05c2, B:131:0x05d3, B:112:0x0540, B:114:0x054e, B:115:0x0558, B:82:0x0343, B:83:0x034d, B:85:0x035b, B:86:0x035e), top: B:561:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x1129  */
    /* JADX WARN: Code duplicated, block: B:370:0x152d A[Catch: JSONException -> 0x1640, Exception -> 0x18fa, TRY_LEAVE, TryCatch #8 {JSONException -> 0x1640, blocks: (B:368:0x1515, B:370:0x152d, B:375:0x153d, B:383:0x155c), top: B:568:0x1515 }] */
    /* JADX WARN: Code duplicated, block: B:374:0x153b A[Catch: JSONException -> 0x154e, Exception -> 0x18fa, TRY_LEAVE, TryCatch #24 {Exception -> 0x18fa, blocks: (B:265:0x106f, B:266:0x1075, B:272:0x1094, B:274:0x10a4, B:276:0x10b4, B:278:0x10c4, B:281:0x10e0, B:314:0x11cc, B:318:0x11d3, B:322:0x11da, B:326:0x11e1, B:330:0x11e8, B:333:0x11ed, B:337:0x11f4, B:340:0x13a0, B:343:0x13ad, B:353:0x13d7, B:355:0x13f5, B:357:0x13fb, B:358:0x13fe, B:360:0x1414, B:362:0x141f, B:364:0x1426, B:366:0x14f5, B:368:0x1515, B:370:0x152d, B:372:0x1531, B:374:0x153b, B:375:0x153d, B:377:0x1541, B:379:0x154b, B:383:0x155c, B:385:0x1560, B:387:0x1564, B:389:0x1568, B:391:0x156e, B:393:0x1582, B:395:0x1586, B:397:0x1590, B:402:0x159c, B:404:0x15a4, B:407:0x15b2, B:409:0x15b7, B:411:0x15bc, B:421:0x15e8, B:348:0x13c6, B:350:0x13d0, B:352:0x13d4, B:284:0x10f1, B:286:0x10f7), top: B:600:0x106f }] */
    /* JADX WARN: Code duplicated, block: B:375:0x153d A[Catch: JSONException -> 0x1640, Exception -> 0x18fa, PHI: r8
  0x153d: PHI (r8v106 java.lang.String) = (r8v103 java.lang.String), (r8v103 java.lang.String), (r8v105 java.lang.String) binds: [B:371:0x152f, B:373:0x1539, B:374:0x153b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {JSONException -> 0x1640, blocks: (B:368:0x1515, B:370:0x152d, B:375:0x153d, B:383:0x155c), top: B:568:0x1515 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x1541 A[Catch: JSONException -> 0x154e, Exception -> 0x18fa, TRY_ENTER, TryCatch #24 {Exception -> 0x18fa, blocks: (B:265:0x106f, B:266:0x1075, B:272:0x1094, B:274:0x10a4, B:276:0x10b4, B:278:0x10c4, B:281:0x10e0, B:314:0x11cc, B:318:0x11d3, B:322:0x11da, B:326:0x11e1, B:330:0x11e8, B:333:0x11ed, B:337:0x11f4, B:340:0x13a0, B:343:0x13ad, B:353:0x13d7, B:355:0x13f5, B:357:0x13fb, B:358:0x13fe, B:360:0x1414, B:362:0x141f, B:364:0x1426, B:366:0x14f5, B:368:0x1515, B:370:0x152d, B:372:0x1531, B:374:0x153b, B:375:0x153d, B:377:0x1541, B:379:0x154b, B:383:0x155c, B:385:0x1560, B:387:0x1564, B:389:0x1568, B:391:0x156e, B:393:0x1582, B:395:0x1586, B:397:0x1590, B:402:0x159c, B:404:0x15a4, B:407:0x15b2, B:409:0x15b7, B:411:0x15bc, B:421:0x15e8, B:348:0x13c6, B:350:0x13d0, B:352:0x13d4, B:284:0x10f1, B:286:0x10f7), top: B:600:0x106f }] */
    /* JADX WARN: Code duplicated, block: B:382:0x155a  */
    /* JADX WARN: Code duplicated, block: B:393:0x1582 A[Catch: JSONException -> 0x161c, Exception -> 0x18fa, TRY_LEAVE, TryCatch #24 {Exception -> 0x18fa, blocks: (B:265:0x106f, B:266:0x1075, B:272:0x1094, B:274:0x10a4, B:276:0x10b4, B:278:0x10c4, B:281:0x10e0, B:314:0x11cc, B:318:0x11d3, B:322:0x11da, B:326:0x11e1, B:330:0x11e8, B:333:0x11ed, B:337:0x11f4, B:340:0x13a0, B:343:0x13ad, B:353:0x13d7, B:355:0x13f5, B:357:0x13fb, B:358:0x13fe, B:360:0x1414, B:362:0x141f, B:364:0x1426, B:366:0x14f5, B:368:0x1515, B:370:0x152d, B:372:0x1531, B:374:0x153b, B:375:0x153d, B:377:0x1541, B:379:0x154b, B:383:0x155c, B:385:0x1560, B:387:0x1564, B:389:0x1568, B:391:0x156e, B:393:0x1582, B:395:0x1586, B:397:0x1590, B:402:0x159c, B:404:0x15a4, B:407:0x15b2, B:409:0x15b7, B:411:0x15bc, B:421:0x15e8, B:348:0x13c6, B:350:0x13d0, B:352:0x13d4, B:284:0x10f1, B:286:0x10f7), top: B:600:0x106f }] */
    /* JADX WARN: Code duplicated, block: B:397:0x1590 A[Catch: JSONException -> 0x1593, Exception -> 0x18fa, TryCatch #24 {Exception -> 0x18fa, blocks: (B:265:0x106f, B:266:0x1075, B:272:0x1094, B:274:0x10a4, B:276:0x10b4, B:278:0x10c4, B:281:0x10e0, B:314:0x11cc, B:318:0x11d3, B:322:0x11da, B:326:0x11e1, B:330:0x11e8, B:333:0x11ed, B:337:0x11f4, B:340:0x13a0, B:343:0x13ad, B:353:0x13d7, B:355:0x13f5, B:357:0x13fb, B:358:0x13fe, B:360:0x1414, B:362:0x141f, B:364:0x1426, B:366:0x14f5, B:368:0x1515, B:370:0x152d, B:372:0x1531, B:374:0x153b, B:375:0x153d, B:377:0x1541, B:379:0x154b, B:383:0x155c, B:385:0x1560, B:387:0x1564, B:389:0x1568, B:391:0x156e, B:393:0x1582, B:395:0x1586, B:397:0x1590, B:402:0x159c, B:404:0x15a4, B:407:0x15b2, B:409:0x15b7, B:411:0x15bc, B:421:0x15e8, B:348:0x13c6, B:350:0x13d0, B:352:0x13d4, B:284:0x10f1, B:286:0x10f7), top: B:600:0x106f }] */
    /* JADX WARN: Code duplicated, block: B:399:0x1597  */
    /* JADX WARN: Code duplicated, block: B:401:0x159a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:419:0x15df  */
    /* JADX WARN: Code duplicated, block: B:423:0x1619  */
    /* JADX WARN: Code duplicated, block: B:429:0x162f  */
    /* JADX WARN: Code duplicated, block: B:511:0x191f A[Catch: Exception -> 0x193b, TryCatch #58 {Exception -> 0x193b, blocks: (B:501:0x18fd, B:502:0x1907, B:504:0x190c, B:506:0x1912, B:507:0x1917, B:509:0x191a, B:511:0x191f, B:513:0x1925, B:514:0x192a, B:256:0x0ff5), top: B:666:0x0fe9, inners: #27 }] */
    /* JADX WARN: Code duplicated, block: B:522:0x193f  */
    /* JADX WARN: Code duplicated, block: B:525:0x1948 A[Catch: Exception -> 0x19b9, LOOP:4: B:523:0x1940->B:525:0x1948, LOOP_END, TryCatch #59 {Exception -> 0x19b9, blocks: (B:3:0x0022, B:5:0x002a, B:7:0x0042, B:9:0x004a, B:12:0x005b, B:11:0x0056, B:13:0x005e, B:15:0x0068, B:16:0x006e, B:18:0x0097, B:21:0x00a5, B:23:0x00eb, B:26:0x012b, B:31:0x015c, B:32:0x0160, B:35:0x0199, B:37:0x01bb, B:38:0x01d0, B:53:0x0219, B:520:0x193b, B:523:0x1940, B:525:0x1948, B:526:0x1975, B:528:0x197b, B:530:0x19ac, B:531:0x19b0, B:33:0x0166, B:34:0x016c, B:39:0x01d8, B:45:0x01eb, B:49:0x01fd, B:50:0x0200, B:51:0x0203, B:52:0x0207, B:532:0x19b1, B:20:0x00a1), top: B:667:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:528:0x197b A[Catch: Exception -> 0x19b9, TryCatch #59 {Exception -> 0x19b9, blocks: (B:3:0x0022, B:5:0x002a, B:7:0x0042, B:9:0x004a, B:12:0x005b, B:11:0x0056, B:13:0x005e, B:15:0x0068, B:16:0x006e, B:18:0x0097, B:21:0x00a5, B:23:0x00eb, B:26:0x012b, B:31:0x015c, B:32:0x0160, B:35:0x0199, B:37:0x01bb, B:38:0x01d0, B:53:0x0219, B:520:0x193b, B:523:0x1940, B:525:0x1948, B:526:0x1975, B:528:0x197b, B:530:0x19ac, B:531:0x19b0, B:33:0x0166, B:34:0x016c, B:39:0x01d8, B:45:0x01eb, B:49:0x01fd, B:50:0x0200, B:51:0x0203, B:52:0x0207, B:532:0x19b1, B:20:0x00a1), top: B:667:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:530:0x19ac A[Catch: Exception -> 0x19b9, TryCatch #59 {Exception -> 0x19b9, blocks: (B:3:0x0022, B:5:0x002a, B:7:0x0042, B:9:0x004a, B:12:0x005b, B:11:0x0056, B:13:0x005e, B:15:0x0068, B:16:0x006e, B:18:0x0097, B:21:0x00a5, B:23:0x00eb, B:26:0x012b, B:31:0x015c, B:32:0x0160, B:35:0x0199, B:37:0x01bb, B:38:0x01d0, B:53:0x0219, B:520:0x193b, B:523:0x1940, B:525:0x1948, B:526:0x1975, B:528:0x197b, B:530:0x19ac, B:531:0x19b0, B:33:0x0166, B:34:0x016c, B:39:0x01d8, B:45:0x01eb, B:49:0x01fd, B:50:0x0200, B:51:0x0203, B:52:0x0207, B:532:0x19b1, B:20:0x00a1), top: B:667:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:561:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x1531 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x02b0 A[Catch: Exception -> 0x1931, TryCatch #39 {Exception -> 0x1931, blocks: (B:57:0x0292, B:60:0x02a0, B:65:0x02bb, B:61:0x02a6, B:63:0x02b0, B:64:0x02b6), top: B:630:0x0292 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x02b6 A[Catch: Exception -> 0x1931, TryCatch #39 {Exception -> 0x1931, blocks: (B:57:0x0292, B:60:0x02a0, B:65:0x02bb, B:61:0x02a6, B:63:0x02b0, B:64:0x02b6), top: B:630:0x0292 }] */
    /* JADX WARN: Code duplicated, block: B:658:0x1586 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0d28 A[EDGE_INSN: B:676:0x0d28->B:218:0x0d28 BREAK  A[LOOP:1: B:210:0x0cc8->B:217:0x0d21], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0361  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 12 */
    @SuppressLint({"WrongThread"})
    public Boolean f() {
        int i;
        Survey survey;
        int i2;
        BISPApplication bISPApplication;
        int i3;
        Object obj;
        ?? r11;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        Object obj4;
        String str3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        String str4;
        Object obj14;
        String str5;
        Object obj15;
        String str6;
        String str7;
        String str8;
        int i4;
        String str9;
        String str10;
        int i5;
        String str11;
        Object obj16;
        Object obj17;
        String string;
        String strG;
        ProgressDialog progressDialog;
        C c2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Object obj18;
        String str12;
        Object obj19;
        String str13;
        String str14;
        String str15;
        BeneficiaryEntity beneficiaryEntityAd;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        NadraFamilyData nadraFamilyDataAf;
        String str21;
        String str22;
        int i6;
        String str23 = "createdDatetime";
        String str24 = "endDate";
        String str25 = "formNo";
        int i7 = 2 % 2;
        String str26 = "endBy";
        String str27 = "householdMemberUrduName";
        String str28 = "householdMemberNames";
        int i8 = c + 53;
        d = i8 % 128;
        int i9 = i8 % 2;
        for (int i10 = 0; i10 < this.i.size(); i10++) {
            try {
                String strG2 = ac.g(this.i.get(i10));
                ComponentCallbacks2 componentCallbacks2FindFragmentByTag = this.m.getFragmentManager().findFragmentByTag(strG2);
                if (componentCallbacks2FindFragmentByTag != null || (this.j.contains(strG2) && !strG2.toLowerCase().contains("tree"))) {
                    ((e) componentCallbacks2FindFragmentByTag).parseJson();
                }
            } catch (Exception unused) {
                this.h.dismiss();
                return Boolean.FALSE;
            }
        }
        PersonInfo personInfo = (PersonInfo) SugarRecord.first(PersonInfo.class);
        if (personInfo != null) {
            this.l.enumerator_name = personInfo.name;
        }
        this.D = true;
        this.z = "Roster Data and Nadra Data mismatch. Please initiate survey again";
        this.l.imei_number = ah.c().e("imei_mac", BuildConfig.FLAVOR);
        this.l.enumerator_id = ah.c().d("user_id", 0);
        String strG3 = g();
        if (strG3 == null || strG3.trim().isEmpty()) {
            strG3 = z.e();
        }
        this.l.endTime = strG3;
        String string2 = ((j) this.A.h(this.m)).getString("surveyStartTime", BuildConfig.FLAVOR);
        Survey survey2 = this.l;
        survey2.startTime = string2;
        survey2.endTimeGPS = ak.c();
        this.l.time = z.b();
        this.l.timeGPS = ak.e();
        this.l.date = z.f();
        this.l.dateGPS = ak.d();
        BISPApplication bISPApplication2 = (BISPApplication) this.p;
        if (BISPApplication.d == null) {
            this.h.dismiss();
            return Boolean.FALSE;
        }
        this.l.location = BISPApplication.e();
        String str29 = strG3;
        this.l.locationAccuracy = BISPApplication.d.getAccuracy();
        EnumeratorModel enumeratorModel = new EnumeratorModel();
        Survey survey3 = this.l;
        survey3.appVersion = 33;
        survey3.appVersionName = "7.6";
        survey3.uniqueID = UUID.randomUUID().toString();
        this.l.uuid = UUID.randomUUID().toString();
        if (ivas.gov.bisp.enumeration.bK.ag.d) {
            ArrayList arrayList = new ArrayList(SugarRecord.find(EnumeratorModel.class, "enumerator_imei = ?", this.n.getEnumeratorImei()));
            if (arrayList.size() > 0) {
                int i11 = d + 23;
                c = i11 % 128;
                ((EnumeratorModel) (i11 % 2 != 0 ? arrayList.get(1) : arrayList.get(0))).getId();
            } else {
                enumeratorModel.setEnumeratorId(this.n.getEnumeratorId());
                enumeratorModel.setEnumeratorCnic(this.n.getEnumeratorCnic());
                enumeratorModel.setEnumeratorContact(this.n.getEnumeratorContact());
                enumeratorModel.setEnumeratorImei(this.n.getEnumeratorImei());
                enumeratorModel.setEnumeratorName(this.n.getEnumeratorName());
            }
            ArrayList arrayList2 = new ArrayList(SugarRecord.find(Survey.class, "uuid=? and user_type=?", this.l.uuid, "1"));
            if (arrayList2.size() > 0) {
                ((Survey) arrayList2.get(0)).form_no_not_at_home = this.l.form_no_not_at_home;
                ((Survey) arrayList2.get(0)).survey_verified = "no";
            }
            this.l.survey_verified = "no";
            str29 = str29;
            i = 2;
        } else {
            int i12 = this.g;
            i = (i12 == 1 || i12 != 2) ? 0 : 5;
            if (h(string2, str29)) {
                int i13 = d + 75;
                c = i13 % 128;
                if (i13 % 2 != 0) {
                    survey = this.l;
                    i2 = 0;
                } else {
                    survey = this.l;
                    i2 = 1;
                }
                survey.isOffHour = i2;
            }
            ah.c().e("structure_no", BuildConfig.FLAVOR);
            ah.c().e("last_survey_location", BuildConfig.FLAVOR);
        }
        this.l.userType = i;
        j();
        AppDatabase appDatabaseL = AppDatabase.l(this.m.getApplicationContext());
        C c3 = new C();
        try {
            this.t = new JSONObject();
            this.s = new JSONObject();
            this.u = new JSONObject();
            this.v = new JSONObject();
            this.x = new JSONObject();
            new JSONObject();
            String strH = ac.h(true);
            String str30 = "householdMemberNamesEnc";
            this.x.put("image_thumb_benificiary", bISPApplication2.v());
            i3 = i;
            if (this.A.l().intValue() == 2) {
                if (BISPApplication.c().B()) {
                    this.t.put("surveyorType", "ver7.6 - Dynamic Registry");
                } else {
                    this.t.put("surveyorType", "ver7.6 - Offline Dynamic Registry");
                }
                bISPApplication = bISPApplication2;
                str = "resurvey";
                String str31 = "splitting";
                if (this.A.t().toLowerCase().equals("expire_2")) {
                    obj2 = "disaster";
                    this.t.put("enumeratorSurveyId", this.A.c());
                } else if (this.A.t().toLowerCase().equals("expire_3")) {
                    obj2 = "disaster";
                    this.t.put("enumeratorSurveyId", this.A.c());
                } else {
                    obj2 = "disaster";
                    this.t.put("enumeratorSurveyId", this.A.c());
                }
                str2 = "enumeratorSurveyId";
                this.t.put("longitudeEnc", this.l.longitude);
                this.t.put("longitude", this.l.longitude);
                this.t.put("latitudeEnc", this.l.latitude);
                this.t.put("latitude", this.l.latitude);
                this.t.put("latitude", this.l.latitude);
                this.t.put("areaClassification", this.l.region);
                this.t.put("provinceId", this.l.province_id);
                this.t.put("provinceName", this.l.province_name);
                this.t.put("provinceName", this.l.province_name);
                this.t.put("districtId", this.l.district_id);
                this.t.put("districtName", this.l.district_name);
                this.t.put("tehsilId", this.l.tehsil_id);
                this.t.put("tehsilName", this.l.tehsil_name);
                this.t.put("ucId", this.l.uc_id);
                this.t.put("ucName", this.l.uc_name);
                this.t.put("villageId", this.l.village_id);
                this.t.put("villageName", this.l.village_name);
                obj3 = null;
                this.t.put("nserBlockId", 0);
                this.t.put("nserBlockName", BuildConfig.FLAVOR);
                obj3 = null;
                this.t.put("nserEaId", 0);
                this.t.put("nserEaName", BuildConfig.FLAVOR);
                this.t.put("formNo", BuildConfig.FLAVOR);
                this.t.put("uuid", this.l.uuid);
                this.t.put("createdDatetime", this.l.date);
                this.t.put("householdHeadNameEnc", this.l.name_of_head);
                String str32 = "householdHeadNameEnc";
                this.t.put("householdHeadName", this.l.name_of_head);
                String str33 = "householdHeadName";
                this.t.put("houseAddressEnc", this.l.address_of_house);
                this.t.put("houseAddress", this.l.address_of_house);
                this.t.put("mobileNoEnc", this.l.mobile_number);
                this.t.put("mobileNo", this.l.mobile_number);
                this.t.put("householdNo", BuildConfig.FLAVOR);
                this.t.put("structureNo", BuildConfig.FLAVOR);
                this.t.put("structureId", BuildConfig.FLAVOR);
                this.t.put("motherLangId", this.l.mother_lang_id);
                this.t.put("isBispBeneficiary", this.l.bisp_benificiary);
                this.t.put("endDate", str29);
                this.t.put("endBy", this.A.z());
                this.t.put("endByIp", strH);
                this.t.put("nserProvcode", this.l.province_id);
                this.t.put("nserDistcode", this.l.district_id);
                this.t.put("nserTehsilcode", this.l.tehsil_id);
                obj4 = null;
                this.u.put("uniqueHhId", 0);
                if (this.A.l().intValue() != 2) {
                    str3 = "surveyorType";
                    obj5 = "ver7.6 - Dynamic Registry";
                    if (BISPApplication.c().B()) {
                        obj6 = "ver7.6 - Offline Dynamic Registry";
                        this.u.put(str3, obj5);
                    } else {
                        obj6 = "ver7.6 - Offline Dynamic Registry";
                        this.u.put(str3, obj6);
                    }
                } else {
                    str3 = "surveyorType";
                    obj5 = "ver7.6 - Dynamic Registry";
                    if (BISPApplication.c().B()) {
                        obj6 = "ver7.6 - Offline Dynamic Registry";
                        this.u.put(str3, obj6);
                    } else {
                        obj6 = "ver7.6 - Offline Dynamic Registry";
                        this.u.put(str3, obj5);
                    }
                }
                obj7 = obj6;
                if (!this.A.t().toLowerCase().equals("expire_2")) {
                    obj8 = "expire_2";
                    obj = "expire_3";
                    if (!this.A.t().toLowerCase().equals(obj)) {
                        obj9 = "duplicate";
                    } else {
                        obj9 = "duplicate";
                    }
                    String str34 = str2;
                    this.u.put("householdHeadId", (Object) null);
                    this.u.put("presentOccupancyStatus", this.l.occupacy_status_code);
                    this.u.put("presentOccupancyStatusStatus", this.l.occupacy_status);
                    this.u.put("wallMaterialUsed", this.l.wall_material_code);
                    this.u.put("wallMaterialUsedStatus", this.l.wall_material_status);
                    this.u.put("roofMaterialUsed", this.l.roof_material_code);
                    this.u.put("roofMaterialUsedStatus", this.l.roof_material_status);
                    this.u.put("householdRooms", this.l.number_of_rooms);
                    this.u.put("cookingFuelUsed", this.l.cooking_fuel_code);
                    this.u.put("cookingFuelUsedStatus", this.l.cooking_fuel_status);
                    this.u.put("toiletUsed", this.l.toilet_code);
                    this.u.put("toiletUsedStatus", this.l.toilet_status);
                    this.u.put("sourceOfDrinkingWater", this.l.drinking_water_code);
                    this.u.put("sourceOfDrinkingWaterStatus", this.l.drinking_water_status);
                    this.u.put("hasElectricityConnection", this.l.electricity_code);
                    this.u.put("hasElectricityConnectionStatus", this.l.electricity_status);
                    this.u.put("hasGasConnection", this.l.gas_code);
                    this.u.put("hasGasConnectionStatus", this.l.gas_status);
                    this.u.put("hasPhoneConnection", this.l.landline_code);
                    this.u.put("hasPhoneConnectionStatus", this.l.landline_status);
                    this.u.put("isMultiStory", bISPApplication.x());
                    this.u.put("isSingleStory", bISPApplication.z());
                    this.u.put("isCompound", bISPApplication.w());
                    this.u.put("ownAnyLivestock", this.l.animal);
                    if (this.l.animal == 1) {
                        i6 = c + 17;
                        d = i6 % 128;
                        if (i6 % 2 != 0) {
                            this.u.put("ownAnyLivestockStatus", "yes");
                            Object obj20 = null;
                            obj20.hashCode();
                            throw null;
                        }
                        this.u.put("ownAnyLivestockStatus", "yes");
                    } else {
                        this.u.put("ownAnyLivestockStatus", "no");
                    }
                    this.u.put("noOfBuffalo", this.l.buffalo);
                    this.u.put("noOfBuffaloStatus", BuildConfig.FLAVOR);
                    this.u.put("noOfCowCattle", this.l.cow);
                    this.u.put("noOfCowCattleStatus", BuildConfig.FLAVOR);
                    this.u.put("noOfGoatSheep", this.l.goat);
                    this.u.put("noOfGoatSheepStatus", BuildConfig.FLAVOR);
                    this.u.put("noOfHorseDonkey", this.l.horse);
                    this.u.put("noOfHorseDonkeyStatus", BuildConfig.FLAVOR);
                    this.u.put("noOfCamel", this.l.camel);
                    this.u.put("noOfCamelStatus", BuildConfig.FLAVOR);
                    this.u.put("isOwnAgriculturalLand", this.l.household_agriculture_land);
                    this.u.put("isOwnAgriculturalLandStatus", BuildConfig.FLAVOR);
                    this.u.put("howMuchLandOwned", this.l.land_number);
                    this.u.put("howMuchLandOwnedStatus", this.l.land_unit_status);
                    this.u.put("unitOfLand", this.l.land_unit_code);
                    this.u.put("unitOfLandStatus", this.l.land_unit_status);
                    this.u.put("hasHeater", this.l.heater);
                    this.u.put("hasHeaterStatus", BuildConfig.FLAVOR);
                    this.u.put("hasWashingMachine", this.l.washing_machine);
                    this.u.put("hasWashingMachineStatus", BuildConfig.FLAVOR);
                    this.u.put("hasGeyser", this.l.geyser);
                    this.u.put("hasGeyserStatus", BuildConfig.FLAVOR);
                    this.u.put("hasAircooler", this.l.air_cooler);
                    this.u.put("hasAircoolerStatus", BuildConfig.FLAVOR);
                    this.u.put("hasAirConditioner", this.l.air_conditioner);
                    this.u.put("hasAirConditionerStatus", BuildConfig.FLAVOR);
                    this.u.put("hasFan", this.l.fan);
                    this.u.put("hasFanStatus", BuildConfig.FLAVOR);
                    this.u.put("hasCookingRange", this.l.cooking_range);
                    this.u.put("hasCookingRangeStatus", BuildConfig.FLAVOR);
                    this.u.put("hasCookingStove", this.l.cooking_stove);
                    this.u.put("hasCookingStoveStatus", BuildConfig.FLAVOR);
                    this.u.put("hasTv", this.l.tv);
                    this.u.put("hasTvStatus", BuildConfig.FLAVOR);
                    this.u.put("hasVideoPlayer", this.l.vcr);
                    this.u.put("hasVideoPlayerStatus", BuildConfig.FLAVOR);
                    this.u.put("hasRefrigerator", this.l.refrigerator);
                    this.u.put("hasRefrigeratorStatus", BuildConfig.FLAVOR);
                    this.u.put("hasFreezer", this.l.freezer);
                    this.u.put("hasFreezerStatus", BuildConfig.FLAVOR);
                    this.u.put("hasGeneratorUps", this.l.generator);
                    this.u.put("hasGeneratorUpsStatus", BuildConfig.FLAVOR);
                    this.u.put("hasSewingMachine", this.l.sewing);
                    this.u.put("hasSewingMachineStatus", BuildConfig.FLAVOR);
                    this.u.put("hasPersonalComputer", this.l.computer);
                    this.u.put("hasPersonalComputerStatus", BuildConfig.FLAVOR);
                    this.u.put("hasMotorcycle", this.l.motorcycle);
                    this.u.put("hasMotorcycleStatus", BuildConfig.FLAVOR);
                    this.u.put("hasTractor", this.l.tractor);
                    this.u.put("hasTractorStatus", BuildConfig.FLAVOR);
                    this.u.put("hasVehicle", this.l.car);
                    this.u.put("hasVehicleStatus", BuildConfig.FLAVOR);
                    this.u.put("hasPhone", this.l.mobile);
                    this.u.put("hasPhoneStatus", BuildConfig.FLAVOR);
                    this.u.put("hasInternet", this.l.internet);
                    this.u.put("hasInternetStatus", BuildConfig.FLAVOR);
                    this.u.put("hasMobileInternet", this.l.m_internet);
                    this.u.put("hasMobileInternetStatus", BuildConfig.FLAVOR);
                    this.u.put("electricityMeter", bISPApplication.r());
                    this.u.put("gasMeter", bISPApplication.u());
                    this.u.put("formNo", BuildConfig.FLAVOR);
                    this.u.put("uuid", this.l.uuid);
                    this.u.put("uniqueId", this.l.uniqueID);
                    this.u.put("createdDatetime", this.l.date);
                    this.u.put("endDate", str29);
                    this.u.put("endBy", this.A.z());
                    this.u.put("endByIp", strH);
                    this.u.put("hyderralIndividual", bISPApplication.n());
                    this.u.put("hyderralSocial", bISPApplication.o());
                    this.u.put("hyderralSolar", bISPApplication.g());
                    this.u.put("hyderralWind", bISPApplication.p());
                    if (this.A.l().intValue() == 2) {
                        if (BISPApplication.c().B()) {
                            obj10 = obj7;
                            this.v.put(str3, obj5);
                        } else {
                            obj10 = obj7;
                            this.v.put(str3, obj10);
                        }
                    } else if (BISPApplication.c().B()) {
                        obj10 = obj7;
                        this.v.put(str3, obj10);
                    } else {
                        obj10 = obj7;
                        this.v.put(str3, obj5);
                    }
                    obj11 = obj8;
                    if (!this.A.t().toLowerCase().equals(obj11)) {
                        obj12 = obj10;
                        obj13 = obj5;
                        str4 = str3;
                        obj14 = obj2;
                        str5 = str34;
                        this.v.put(str5, this.A.c());
                    } else {
                        obj12 = obj10;
                        obj13 = obj5;
                        str4 = str3;
                        obj14 = obj2;
                        str5 = str34;
                        this.v.put(str5, this.A.c());
                    }
                    String str35 = str5;
                    this.v.put("willingForFinancialAsst", this.l.financial_assistance);
                    this.v.put("isMigratedForEconomicActivities", this.l.migration);
                    this.v.put("isInfantDeath", this.l.infant_death);
                    this.v.put("isInfantBirth", this.l.infant_birth);
                    this.v.put("howResolvePersonalDisputes", this.l.resolve_complaint);
                    this.v.put("howResolveComplaintsAgainstStateDept", this.l.resolve_complaint);
                    this.v.put("levelOfSatisfiactionWithStateJustice", this.l.satisfaction_level);
                    this.v.put("takenLoan", this.l.taken_loan);
                    this.v.put("monthlyIncome", this.l.monthly_income);
                    this.v.put("defenceJob", this.l.defence_job);
                    this.v.put("formNo", BuildConfig.FLAVOR);
                    this.v.put("uuid", this.l.uuid);
                    this.v.put("uniqueId", this.l.uniqueID);
                    this.v.put("createdDatetime", this.l.date);
                    this.v.put("endDate", str29);
                    this.v.put("endBy", this.A.z());
                    this.v.put("endByIp", strH);
                    this.v.put("financialDifficulties", bISPApplication.l());
                    this.v.put("poorEducationQuality", bISPApplication.q());
                    this.v.put("childLabor", bISPApplication.k());
                    this.v.put("childHealth", bISPApplication.j());
                    this.v.put("notWillingToStudy", bISPApplication.m());
                    if (this.A.t().toLowerCase().equals(obj11)) {
                        obj15 = obj9;
                        str6 = str;
                        str7 = str35;
                        this.s.put(str7, this.A.c());
                    } else {
                        obj15 = obj9;
                        str6 = str;
                        str7 = str35;
                        this.s.put(str7, this.A.c());
                    }
                    String str36 = str7;
                    this.s.put("agriJson", this.l.agriJson);
                    this.s.put("agriTypeOption", this.l.agriTypeOption);
                    this.s.put("agriTypeOptionId", this.l.agriTypeOptionId);
                    this.s.put("batchId", BuildConfig.FLAVOR);
                    this.s.put("userId", this.A.y());
                    this.s.put("firmId", bISPApplication.s());
                    str8 = string2;
                    this.s.put("startDatetime", str8);
                    this.s.put("endDatetime", str29);
                    String str37 = str29;
                    this.s.put("startTimeGps", this.l.startTimeGPS);
                    this.s.put("endTimeGps", this.l.endTimeGPS);
                    this.s.put("enumeratorImei", this.l.imei_number);
                    this.s.put("enuName", this.l.enumerator_name);
                    i4 = 0;
                    while (true) {
                        str9 = "cnic";
                        str10 = "-";
                        if (i4 < this.f74o.size()) {
                            break;
                            break;
                        }
                        String str38 = str8;
                        if (this.f74o.get(i4).relation_to_household_id == 186) {
                            this.s.put("HhName", this.f74o.get(i4).name_of_member);
                            this.s.put("cnic", this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                            this.C = this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR);
                        }
                        i4++;
                        str8 = str38;
                        str23 = str23;
                    }
                    String str39 = str23;
                    String str40 = str8;
                    this.s.put("submissionDate", this.l.date);
                    this.s.put("completeForm", this.l.complete_form);
                    this.s.put("enuNumber", bISPApplication.t());
                    this.s.put("interviewStatusId", ivas.gov.bisp.enumeration.bK.ag.n);
                    this.s.put("enumeratorVerified", BuildConfig.FLAVOR);
                    this.s.put("validationPercentage", this.l.validation_percentage);
                    this.s.put("formNo", BuildConfig.FLAVOR);
                    if (this.A.t().toLowerCase().equals(obj11)) {
                        this.s.put("oldFormNumber", this.A.j());
                        i5 = d + 55;
                        c = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i14 = 5 % 4;
                        }
                    } else {
                        this.s.put("oldFormNumber", this.A.j());
                        i5 = d + 55;
                        c = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i15 = 5 % 4;
                        }
                    }
                    this.s.put("resurvey_status", this.A.t());
                    this.s.put("apkType", bISPApplication.i());
                    this.s.put("formNoNotAtHome", BuildConfig.FLAVOR);
                    this.s.put("uuid", this.l.uuid);
                    this.s.put("comments", this.l.comments);
                    this.s.put("isRecollected", bISPApplication.y());
                    this.s.put("uniqueId", this.l.uniqueID);
                    this.s.put("isNewSurvey", this.l.isNewSurvey);
                    this.s.put("isDuplicate", BuildConfig.FLAVOR);
                    this.s.put("interviewStatusReason", BuildConfig.FLAVOR);
                    this.s.put("locationAccuracy", this.l.locationAccuracy);
                    this.s.put("contactDetailStart", this.l.contactDetailStart);
                    this.s.put("contactDetailEnd", this.l.contactDetailEnd);
                    this.s.put("diffContactDetail", this.l.diffContactDetail);
                    this.s.put("householdStart", this.l.householdStart);
                    this.s.put("householdEnd", this.l.householdEnd);
                    this.s.put("diffHousehold", this.l.diffHousehold);
                    this.s.put("miscellaneousStart", this.l.miscellaneousStart);
                    this.s.put("miscellaneousEnd", this.l.miscellaneousEnd);
                    this.s.put("diffMiscellaneous", this.l.diffMiscellaneous);
                    this.s.put(str39, this.l.date);
                    this.s.put("startDatetimePick", str40);
                    this.s.put("origFormNo", this.l.form_no);
                    this.s.put("isResurveyCorrected", BuildConfig.FLAVOR);
                    this.s.put("isOverrideDiscrepant", BuildConfig.FLAVOR);
                    this.s.put("isDeleted", BuildConfig.FLAVOR);
                    this.s.put("saLongitude", this.l.longitude);
                    this.s.put("saLongitude", this.l.latitude);
                    this.s.put("isPmtReady", 1);
                    if (this.A.l().intValue() != 2) {
                        str11 = str4;
                        obj16 = obj13;
                        if (BISPApplication.c().B()) {
                            obj17 = obj12;
                            this.s.put(str11, obj16);
                        } else {
                            obj17 = obj12;
                            this.s.put(str11, obj17);
                        }
                    } else {
                        str11 = str4;
                        obj16 = obj13;
                        if (BISPApplication.c().B()) {
                            obj17 = obj12;
                            this.s.put(str11, obj17);
                        } else {
                            obj17 = obj12;
                            this.s.put(str11, obj16);
                        }
                    }
                    String str41 = "uuid";
                    String str42 = str24;
                    this.s.put(str42, str37);
                    String str43 = str42;
                    String str44 = str26;
                    this.s.put(str44, this.A.z());
                    String str45 = str44;
                    this.s.put("endByIp", strH);
                    String str46 = strH;
                    String str47 = "endByIp";
                    this.s.put("isSingleStory", bISPApplication.z());
                    this.s.put("isCompound", bISPApplication.w());
                    string = ((j) this.A.h(this.m)).getString("shock_json", BuildConfig.FLAVOR);
                    if (string.equals(BuildConfig.FLAVOR)) {
                        this.s.put("SurveyDisasterData", BuildConfig.FLAVOR);
                        obj4 = null;
                        this.s.put("isDisaster", 0);
                    } else {
                        this.s.put("SurveyDisasterData", new JSONObject(string));
                        this.s.put("isDisaster", 1);
                    }
                    this.s.put("data_collection_modality", this.l.data_collection_modality);
                    strG = ivas.gov.bisp.enumeration.dj.C.g(this.m, this.A, this.h);
                    if (strG != null) {
                    }
                    progressDialog = this.h;
                    if (progressDialog != null) {
                        this.h.dismiss();
                    }
                    return Boolean.FALSE;
                }
                str = "resurvey";
                obj8 = "expire_2";
                obj = "expire_3";
                obj9 = "duplicate";
                this.u.put(str2, this.A.c());
                String str310 = str2;
                this.u.put("householdHeadId", (Object) null);
                this.u.put("presentOccupancyStatus", this.l.occupacy_status_code);
                this.u.put("presentOccupancyStatusStatus", this.l.occupacy_status);
                this.u.put("wallMaterialUsed", this.l.wall_material_code);
                this.u.put("wallMaterialUsedStatus", this.l.wall_material_status);
                this.u.put("roofMaterialUsed", this.l.roof_material_code);
                this.u.put("roofMaterialUsedStatus", this.l.roof_material_status);
                this.u.put("householdRooms", this.l.number_of_rooms);
                this.u.put("cookingFuelUsed", this.l.cooking_fuel_code);
                this.u.put("cookingFuelUsedStatus", this.l.cooking_fuel_status);
                this.u.put("toiletUsed", this.l.toilet_code);
                this.u.put("toiletUsedStatus", this.l.toilet_status);
                this.u.put("sourceOfDrinkingWater", this.l.drinking_water_code);
                this.u.put("sourceOfDrinkingWaterStatus", this.l.drinking_water_status);
                this.u.put("hasElectricityConnection", this.l.electricity_code);
                this.u.put("hasElectricityConnectionStatus", this.l.electricity_status);
                this.u.put("hasGasConnection", this.l.gas_code);
                this.u.put("hasGasConnectionStatus", this.l.gas_status);
                this.u.put("hasPhoneConnection", this.l.landline_code);
                this.u.put("hasPhoneConnectionStatus", this.l.landline_status);
                this.u.put("isMultiStory", bISPApplication.x());
                this.u.put("isSingleStory", bISPApplication.z());
                this.u.put("isCompound", bISPApplication.w());
                this.u.put("ownAnyLivestock", this.l.animal);
                if (this.l.animal == 1) {
                    i6 = c + 17;
                    d = i6 % 128;
                    if (i6 % 2 != 0) {
                        this.u.put("ownAnyLivestockStatus", "yes");
                        Object obj21 = null;
                        obj21.hashCode();
                        throw null;
                    }
                    this.u.put("ownAnyLivestockStatus", "yes");
                } else {
                    this.u.put("ownAnyLivestockStatus", "no");
                }
                this.u.put("noOfBuffalo", this.l.buffalo);
                this.u.put("noOfBuffaloStatus", BuildConfig.FLAVOR);
                this.u.put("noOfCowCattle", this.l.cow);
                this.u.put("noOfCowCattleStatus", BuildConfig.FLAVOR);
                this.u.put("noOfGoatSheep", this.l.goat);
                this.u.put("noOfGoatSheepStatus", BuildConfig.FLAVOR);
                this.u.put("noOfHorseDonkey", this.l.horse);
                this.u.put("noOfHorseDonkeyStatus", BuildConfig.FLAVOR);
                this.u.put("noOfCamel", this.l.camel);
                this.u.put("noOfCamelStatus", BuildConfig.FLAVOR);
                this.u.put("isOwnAgriculturalLand", this.l.household_agriculture_land);
                this.u.put("isOwnAgriculturalLandStatus", BuildConfig.FLAVOR);
                this.u.put("howMuchLandOwned", this.l.land_number);
                this.u.put("howMuchLandOwnedStatus", this.l.land_unit_status);
                this.u.put("unitOfLand", this.l.land_unit_code);
                this.u.put("unitOfLandStatus", this.l.land_unit_status);
                this.u.put("hasHeater", this.l.heater);
                this.u.put("hasHeaterStatus", BuildConfig.FLAVOR);
                this.u.put("hasWashingMachine", this.l.washing_machine);
                this.u.put("hasWashingMachineStatus", BuildConfig.FLAVOR);
                this.u.put("hasGeyser", this.l.geyser);
                this.u.put("hasGeyserStatus", BuildConfig.FLAVOR);
                this.u.put("hasAircooler", this.l.air_cooler);
                this.u.put("hasAircoolerStatus", BuildConfig.FLAVOR);
                this.u.put("hasAirConditioner", this.l.air_conditioner);
                this.u.put("hasAirConditionerStatus", BuildConfig.FLAVOR);
                this.u.put("hasFan", this.l.fan);
                this.u.put("hasFanStatus", BuildConfig.FLAVOR);
                this.u.put("hasCookingRange", this.l.cooking_range);
                this.u.put("hasCookingRangeStatus", BuildConfig.FLAVOR);
                this.u.put("hasCookingStove", this.l.cooking_stove);
                this.u.put("hasCookingStoveStatus", BuildConfig.FLAVOR);
                this.u.put("hasTv", this.l.tv);
                this.u.put("hasTvStatus", BuildConfig.FLAVOR);
                this.u.put("hasVideoPlayer", this.l.vcr);
                this.u.put("hasVideoPlayerStatus", BuildConfig.FLAVOR);
                this.u.put("hasRefrigerator", this.l.refrigerator);
                this.u.put("hasRefrigeratorStatus", BuildConfig.FLAVOR);
                this.u.put("hasFreezer", this.l.freezer);
                this.u.put("hasFreezerStatus", BuildConfig.FLAVOR);
                this.u.put("hasGeneratorUps", this.l.generator);
                this.u.put("hasGeneratorUpsStatus", BuildConfig.FLAVOR);
                this.u.put("hasSewingMachine", this.l.sewing);
                this.u.put("hasSewingMachineStatus", BuildConfig.FLAVOR);
                this.u.put("hasPersonalComputer", this.l.computer);
                this.u.put("hasPersonalComputerStatus", BuildConfig.FLAVOR);
                this.u.put("hasMotorcycle", this.l.motorcycle);
                this.u.put("hasMotorcycleStatus", BuildConfig.FLAVOR);
                this.u.put("hasTractor", this.l.tractor);
                this.u.put("hasTractorStatus", BuildConfig.FLAVOR);
                this.u.put("hasVehicle", this.l.car);
                this.u.put("hasVehicleStatus", BuildConfig.FLAVOR);
                this.u.put("hasPhone", this.l.mobile);
                this.u.put("hasPhoneStatus", BuildConfig.FLAVOR);
                this.u.put("hasInternet", this.l.internet);
                this.u.put("hasInternetStatus", BuildConfig.FLAVOR);
                this.u.put("hasMobileInternet", this.l.m_internet);
                this.u.put("hasMobileInternetStatus", BuildConfig.FLAVOR);
                this.u.put("electricityMeter", bISPApplication.r());
                this.u.put("gasMeter", bISPApplication.u());
                this.u.put("formNo", BuildConfig.FLAVOR);
                this.u.put("uuid", this.l.uuid);
                this.u.put("uniqueId", this.l.uniqueID);
                this.u.put("createdDatetime", this.l.date);
                this.u.put("endDate", str29);
                this.u.put("endBy", this.A.z());
                this.u.put("endByIp", strH);
                this.u.put("hyderralIndividual", bISPApplication.n());
                this.u.put("hyderralSocial", bISPApplication.o());
                this.u.put("hyderralSolar", bISPApplication.g());
                this.u.put("hyderralWind", bISPApplication.p());
                if (this.A.l().intValue() == 2) {
                    if (BISPApplication.c().B()) {
                        obj10 = obj7;
                        this.v.put(str3, obj10);
                    } else {
                        obj10 = obj7;
                        this.v.put(str3, obj5);
                    }
                } else if (BISPApplication.c().B()) {
                    obj10 = obj7;
                    this.v.put(str3, obj10);
                } else {
                    obj10 = obj7;
                    this.v.put(str3, obj5);
                }
                obj11 = obj8;
                if (!this.A.t().toLowerCase().equals(obj11)) {
                    obj12 = obj10;
                    obj13 = obj5;
                    str4 = str3;
                    obj14 = obj2;
                    str5 = str310;
                    this.v.put(str5, this.A.c());
                } else {
                    obj12 = obj10;
                    obj13 = obj5;
                    str4 = str3;
                    obj14 = obj2;
                    str5 = str310;
                    this.v.put(str5, this.A.c());
                }
                String str311 = str5;
                this.v.put("willingForFinancialAsst", this.l.financial_assistance);
                this.v.put("isMigratedForEconomicActivities", this.l.migration);
                this.v.put("isInfantDeath", this.l.infant_death);
                this.v.put("isInfantBirth", this.l.infant_birth);
                this.v.put("howResolvePersonalDisputes", this.l.resolve_complaint);
                this.v.put("howResolveComplaintsAgainstStateDept", this.l.resolve_complaint);
                this.v.put("levelOfSatisfiactionWithStateJustice", this.l.satisfaction_level);
                this.v.put("takenLoan", this.l.taken_loan);
                this.v.put("monthlyIncome", this.l.monthly_income);
                this.v.put("defenceJob", this.l.defence_job);
                this.v.put("formNo", BuildConfig.FLAVOR);
                this.v.put("uuid", this.l.uuid);
                this.v.put("uniqueId", this.l.uniqueID);
                this.v.put("createdDatetime", this.l.date);
                this.v.put("endDate", str29);
                this.v.put("endBy", this.A.z());
                this.v.put("endByIp", strH);
                this.v.put("financialDifficulties", bISPApplication.l());
                this.v.put("poorEducationQuality", bISPApplication.q());
                this.v.put("childLabor", bISPApplication.k());
                this.v.put("childHealth", bISPApplication.j());
                this.v.put("notWillingToStudy", bISPApplication.m());
                if (this.A.t().toLowerCase().equals(obj11)) {
                    obj15 = obj9;
                    str6 = str;
                    str7 = str311;
                    this.s.put(str7, this.A.c());
                } else {
                    obj15 = obj9;
                    str6 = str;
                    str7 = str311;
                    this.s.put(str7, this.A.c());
                }
                String str312 = str7;
                this.s.put("agriJson", this.l.agriJson);
                this.s.put("agriTypeOption", this.l.agriTypeOption);
                this.s.put("agriTypeOptionId", this.l.agriTypeOptionId);
                this.s.put("batchId", BuildConfig.FLAVOR);
                this.s.put("userId", this.A.y());
                this.s.put("firmId", bISPApplication.s());
                str8 = string2;
                this.s.put("startDatetime", str8);
                this.s.put("endDatetime", str29);
                String str313 = str29;
                this.s.put("startTimeGps", this.l.startTimeGPS);
                this.s.put("endTimeGps", this.l.endTimeGPS);
                this.s.put("enumeratorImei", this.l.imei_number);
                this.s.put("enuName", this.l.enumerator_name);
                i4 = 0;
                while (true) {
                    str9 = "cnic";
                    str10 = "-";
                    if (i4 < this.f74o.size()) {
                        break;
                        break;
                    }
                    String str314 = str8;
                    if (this.f74o.get(i4).relation_to_household_id == 186) {
                        this.s.put("HhName", this.f74o.get(i4).name_of_member);
                        this.s.put("cnic", this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                        this.C = this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR);
                    }
                    i4++;
                    str8 = str314;
                    str23 = str23;
                }
                String str315 = str23;
                String str48 = str8;
                this.s.put("submissionDate", this.l.date);
                this.s.put("completeForm", this.l.complete_form);
                this.s.put("enuNumber", bISPApplication.t());
                this.s.put("interviewStatusId", ivas.gov.bisp.enumeration.bK.ag.n);
                this.s.put("enumeratorVerified", BuildConfig.FLAVOR);
                this.s.put("validationPercentage", this.l.validation_percentage);
                this.s.put("formNo", BuildConfig.FLAVOR);
                if (this.A.t().toLowerCase().equals(obj11)) {
                    this.s.put("oldFormNumber", this.A.j());
                    i5 = d + 55;
                    c = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i16 = 5 % 4;
                    }
                } else {
                    this.s.put("oldFormNumber", this.A.j());
                    i5 = d + 55;
                    c = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i17 = 5 % 4;
                    }
                }
                this.s.put("resurvey_status", this.A.t());
                this.s.put("apkType", bISPApplication.i());
                this.s.put("formNoNotAtHome", BuildConfig.FLAVOR);
                this.s.put("uuid", this.l.uuid);
                this.s.put("comments", this.l.comments);
                this.s.put("isRecollected", bISPApplication.y());
                this.s.put("uniqueId", this.l.uniqueID);
                this.s.put("isNewSurvey", this.l.isNewSurvey);
                this.s.put("isDuplicate", BuildConfig.FLAVOR);
                this.s.put("interviewStatusReason", BuildConfig.FLAVOR);
                this.s.put("locationAccuracy", this.l.locationAccuracy);
                this.s.put("contactDetailStart", this.l.contactDetailStart);
                this.s.put("contactDetailEnd", this.l.contactDetailEnd);
                this.s.put("diffContactDetail", this.l.diffContactDetail);
                this.s.put("householdStart", this.l.householdStart);
                this.s.put("householdEnd", this.l.householdEnd);
                this.s.put("diffHousehold", this.l.diffHousehold);
                this.s.put("miscellaneousStart", this.l.miscellaneousStart);
                this.s.put("miscellaneousEnd", this.l.miscellaneousEnd);
                this.s.put("diffMiscellaneous", this.l.diffMiscellaneous);
                this.s.put(str315, this.l.date);
                this.s.put("startDatetimePick", str48);
                this.s.put("origFormNo", this.l.form_no);
                this.s.put("isResurveyCorrected", BuildConfig.FLAVOR);
                this.s.put("isOverrideDiscrepant", BuildConfig.FLAVOR);
                this.s.put("isDeleted", BuildConfig.FLAVOR);
                this.s.put("saLongitude", this.l.longitude);
                this.s.put("saLongitude", this.l.latitude);
                this.s.put("isPmtReady", 1);
                if (this.A.l().intValue() != 2) {
                    str11 = str4;
                    obj16 = obj13;
                    if (BISPApplication.c().B()) {
                        obj17 = obj12;
                        this.s.put(str11, obj17);
                    } else {
                        obj17 = obj12;
                        this.s.put(str11, obj16);
                    }
                } else {
                    str11 = str4;
                    obj16 = obj13;
                    if (BISPApplication.c().B()) {
                        obj17 = obj12;
                        this.s.put(str11, obj17);
                    } else {
                        obj17 = obj12;
                        this.s.put(str11, obj16);
                    }
                }
                String str49 = "uuid";
                String str410 = str24;
                this.s.put(str410, str313);
                String str411 = str410;
                String str412 = str26;
                this.s.put(str412, this.A.z());
                String str413 = str412;
                this.s.put("endByIp", strH);
                String str414 = strH;
                String str415 = "endByIp";
                this.s.put("isSingleStory", bISPApplication.z());
                this.s.put("isCompound", bISPApplication.w());
                string = ((j) this.A.h(this.m)).getString("shock_json", BuildConfig.FLAVOR);
                if (string.equals(BuildConfig.FLAVOR)) {
                    this.s.put("SurveyDisasterData", new JSONObject(string));
                    this.s.put("isDisaster", 1);
                } else {
                    this.s.put("SurveyDisasterData", BuildConfig.FLAVOR);
                    obj4 = null;
                    this.s.put("isDisaster", 0);
                }
                this.s.put("data_collection_modality", this.l.data_collection_modality);
                strG = ivas.gov.bisp.enumeration.dj.C.g(this.m, this.A, this.h);
                if (strG != null) {
                }
                progressDialog = this.h;
                if (progressDialog != null) {
                    this.h.dismiss();
                }
                return Boolean.FALSE;
            }
            try {
                if (this.A.l().intValue() != 3) {
                    this.t.put("surveyorType", "ver7.6 - Dynamic Registry");
                } else if (BISPApplication.c().B()) {
                    this.t.put("surveyorType", "ver7.6 - Offline Dynamic Registry");
                } else {
                    this.t.put("surveyorType", "ver7.6 - Dynamic Registry");
                }
                bISPApplication = bISPApplication2;
                str = "resurvey";
                String str316 = "splitting";
                if (this.A.t().toLowerCase().equals("expire_2")) {
                    try {
                        if (this.A.t().toLowerCase().equals("expire_3") || this.A.t().toLowerCase().equals("splitting") || this.A.t().toLowerCase().equals("duplicate") || this.A.t().toLowerCase().equals("disaster")) {
                            obj2 = "disaster";
                        } else {
                            int i18 = c + 65;
                            obj2 = "disaster";
                            d = i18 % 128;
                            if (i18 % 2 == 0) {
                                this.A.t().toLowerCase().contains("resurvey");
                                Object obj22 = null;
                                obj22.hashCode();
                                throw null;
                            }
                            if (!this.A.t().toLowerCase().contains("resurvey")) {
                                this.t.put("enumeratorSurveyId", this.l.enumerator_id);
                            }
                        }
                        this.t.put("enumeratorSurveyId", this.A.c());
                    } catch (Exception unused2) {
                        obj = null;
                    }
                } else {
                    obj2 = "disaster";
                    this.t.put("enumeratorSurveyId", this.A.c());
                }
                str2 = "enumeratorSurveyId";
                this.t.put("longitudeEnc", this.l.longitude);
                this.t.put("longitude", this.l.longitude);
                this.t.put("latitudeEnc", this.l.latitude);
                this.t.put("latitude", this.l.latitude);
                this.t.put("latitude", this.l.latitude);
                this.t.put("areaClassification", this.l.region);
                this.t.put("provinceId", this.l.province_id);
                this.t.put("provinceName", this.l.province_name);
                this.t.put("provinceName", this.l.province_name);
                this.t.put("districtId", this.l.district_id);
                this.t.put("districtName", this.l.district_name);
                this.t.put("tehsilId", this.l.tehsil_id);
                this.t.put("tehsilName", this.l.tehsil_name);
                this.t.put("ucId", this.l.uc_id);
                this.t.put("ucName", this.l.uc_name);
                this.t.put("villageId", this.l.village_id);
                this.t.put("villageName", this.l.village_name);
                obj3 = null;
                try {
                    this.t.put("nserBlockId", 0);
                    this.t.put("nserBlockName", BuildConfig.FLAVOR);
                    obj3 = null;
                    this.t.put("nserEaId", 0);
                    this.t.put("nserEaName", BuildConfig.FLAVOR);
                    this.t.put("formNo", BuildConfig.FLAVOR);
                    this.t.put("uuid", this.l.uuid);
                    this.t.put("createdDatetime", this.l.date);
                    this.t.put("householdHeadNameEnc", this.l.name_of_head);
                    String str317 = "householdHeadNameEnc";
                    this.t.put("householdHeadName", this.l.name_of_head);
                    String str318 = "householdHeadName";
                    this.t.put("houseAddressEnc", this.l.address_of_house);
                    this.t.put("houseAddress", this.l.address_of_house);
                    this.t.put("mobileNoEnc", this.l.mobile_number);
                    this.t.put("mobileNo", this.l.mobile_number);
                    this.t.put("householdNo", BuildConfig.FLAVOR);
                    this.t.put("structureNo", BuildConfig.FLAVOR);
                    this.t.put("structureId", BuildConfig.FLAVOR);
                    this.t.put("motherLangId", this.l.mother_lang_id);
                    this.t.put("isBispBeneficiary", this.l.bisp_benificiary);
                    this.t.put("endDate", str29);
                    this.t.put("endBy", this.A.z());
                    this.t.put("endByIp", strH);
                    this.t.put("nserProvcode", this.l.province_id);
                    this.t.put("nserDistcode", this.l.district_id);
                    this.t.put("nserTehsilcode", this.l.tehsil_id);
                    obj4 = null;
                    try {
                        this.u.put("uniqueHhId", 0);
                        if (this.A.l().intValue() != 2 || this.A.l().intValue() == 3) {
                            str3 = "surveyorType";
                            obj5 = "ver7.6 - Dynamic Registry";
                            if (BISPApplication.c().B()) {
                                obj6 = "ver7.6 - Offline Dynamic Registry";
                                this.u.put(str3, obj6);
                            } else {
                                obj6 = "ver7.6 - Offline Dynamic Registry";
                                this.u.put(str3, obj5);
                            }
                        } else {
                            str3 = "surveyorType";
                            obj5 = "ver7.6 - Dynamic Registry";
                            this.u.put(str3, obj5);
                            obj6 = "ver7.6 - Offline Dynamic Registry";
                        }
                        obj7 = obj6;
                        try {
                            if (!this.A.t().toLowerCase().equals("expire_2")) {
                                obj8 = "expire_2";
                                obj = "expire_3";
                                if (!this.A.t().toLowerCase().equals(obj) && !this.A.t().toLowerCase().equals("splitting") && !this.A.t().toLowerCase().equals("duplicate")) {
                                    obj9 = "duplicate";
                                    Object obj23 = obj2;
                                    obj2 = obj23;
                                    if ((!this.A.t().toLowerCase().equals(obj23)) && (!this.A.t().toLowerCase().contains("resurvey"))) {
                                        str = "resurvey";
                                        str2 = str2;
                                        this.u.put(str2, this.l.enumerator_id);
                                    }
                                    String str319 = str2;
                                    this.u.put("householdHeadId", (Object) null);
                                    this.u.put("presentOccupancyStatus", this.l.occupacy_status_code);
                                    this.u.put("presentOccupancyStatusStatus", this.l.occupacy_status);
                                    this.u.put("wallMaterialUsed", this.l.wall_material_code);
                                    this.u.put("wallMaterialUsedStatus", this.l.wall_material_status);
                                    this.u.put("roofMaterialUsed", this.l.roof_material_code);
                                    this.u.put("roofMaterialUsedStatus", this.l.roof_material_status);
                                    this.u.put("householdRooms", this.l.number_of_rooms);
                                    this.u.put("cookingFuelUsed", this.l.cooking_fuel_code);
                                    this.u.put("cookingFuelUsedStatus", this.l.cooking_fuel_status);
                                    this.u.put("toiletUsed", this.l.toilet_code);
                                    this.u.put("toiletUsedStatus", this.l.toilet_status);
                                    this.u.put("sourceOfDrinkingWater", this.l.drinking_water_code);
                                    this.u.put("sourceOfDrinkingWaterStatus", this.l.drinking_water_status);
                                    this.u.put("hasElectricityConnection", this.l.electricity_code);
                                    this.u.put("hasElectricityConnectionStatus", this.l.electricity_status);
                                    this.u.put("hasGasConnection", this.l.gas_code);
                                    this.u.put("hasGasConnectionStatus", this.l.gas_status);
                                    this.u.put("hasPhoneConnection", this.l.landline_code);
                                    this.u.put("hasPhoneConnectionStatus", this.l.landline_status);
                                    this.u.put("isMultiStory", bISPApplication.x());
                                    this.u.put("isSingleStory", bISPApplication.z());
                                    this.u.put("isCompound", bISPApplication.w());
                                    this.u.put("ownAnyLivestock", this.l.animal);
                                    if (this.l.animal == 1) {
                                        i6 = c + 17;
                                        d = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            this.u.put("ownAnyLivestockStatus", "yes");
                                            Object obj24 = null;
                                            obj24.hashCode();
                                            throw null;
                                        }
                                        this.u.put("ownAnyLivestockStatus", "yes");
                                    } else {
                                        this.u.put("ownAnyLivestockStatus", "no");
                                    }
                                    this.u.put("noOfBuffalo", this.l.buffalo);
                                    this.u.put("noOfBuffaloStatus", BuildConfig.FLAVOR);
                                    this.u.put("noOfCowCattle", this.l.cow);
                                    this.u.put("noOfCowCattleStatus", BuildConfig.FLAVOR);
                                    this.u.put("noOfGoatSheep", this.l.goat);
                                    this.u.put("noOfGoatSheepStatus", BuildConfig.FLAVOR);
                                    this.u.put("noOfHorseDonkey", this.l.horse);
                                    this.u.put("noOfHorseDonkeyStatus", BuildConfig.FLAVOR);
                                    this.u.put("noOfCamel", this.l.camel);
                                    this.u.put("noOfCamelStatus", BuildConfig.FLAVOR);
                                    this.u.put("isOwnAgriculturalLand", this.l.household_agriculture_land);
                                    this.u.put("isOwnAgriculturalLandStatus", BuildConfig.FLAVOR);
                                    this.u.put("howMuchLandOwned", this.l.land_number);
                                    this.u.put("howMuchLandOwnedStatus", this.l.land_unit_status);
                                    this.u.put("unitOfLand", this.l.land_unit_code);
                                    this.u.put("unitOfLandStatus", this.l.land_unit_status);
                                    this.u.put("hasHeater", this.l.heater);
                                    this.u.put("hasHeaterStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasWashingMachine", this.l.washing_machine);
                                    this.u.put("hasWashingMachineStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasGeyser", this.l.geyser);
                                    this.u.put("hasGeyserStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasAircooler", this.l.air_cooler);
                                    this.u.put("hasAircoolerStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasAirConditioner", this.l.air_conditioner);
                                    this.u.put("hasAirConditionerStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasFan", this.l.fan);
                                    this.u.put("hasFanStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasCookingRange", this.l.cooking_range);
                                    this.u.put("hasCookingRangeStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasCookingStove", this.l.cooking_stove);
                                    this.u.put("hasCookingStoveStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasTv", this.l.tv);
                                    this.u.put("hasTvStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasVideoPlayer", this.l.vcr);
                                    this.u.put("hasVideoPlayerStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasRefrigerator", this.l.refrigerator);
                                    this.u.put("hasRefrigeratorStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasFreezer", this.l.freezer);
                                    this.u.put("hasFreezerStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasGeneratorUps", this.l.generator);
                                    this.u.put("hasGeneratorUpsStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasSewingMachine", this.l.sewing);
                                    this.u.put("hasSewingMachineStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasPersonalComputer", this.l.computer);
                                    this.u.put("hasPersonalComputerStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasMotorcycle", this.l.motorcycle);
                                    this.u.put("hasMotorcycleStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasTractor", this.l.tractor);
                                    this.u.put("hasTractorStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasVehicle", this.l.car);
                                    this.u.put("hasVehicleStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasPhone", this.l.mobile);
                                    this.u.put("hasPhoneStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasInternet", this.l.internet);
                                    this.u.put("hasInternetStatus", BuildConfig.FLAVOR);
                                    this.u.put("hasMobileInternet", this.l.m_internet);
                                    this.u.put("hasMobileInternetStatus", BuildConfig.FLAVOR);
                                    this.u.put("electricityMeter", bISPApplication.r());
                                    this.u.put("gasMeter", bISPApplication.u());
                                    this.u.put("formNo", BuildConfig.FLAVOR);
                                    this.u.put("uuid", this.l.uuid);
                                    this.u.put("uniqueId", this.l.uniqueID);
                                    this.u.put("createdDatetime", this.l.date);
                                    this.u.put("endDate", str29);
                                    this.u.put("endBy", this.A.z());
                                    this.u.put("endByIp", strH);
                                    this.u.put("hyderralIndividual", bISPApplication.n());
                                    this.u.put("hyderralSocial", bISPApplication.o());
                                    this.u.put("hyderralSolar", bISPApplication.g());
                                    this.u.put("hyderralWind", bISPApplication.p());
                                    if (this.A.l().intValue() == 2 && this.A.l().intValue() != 3) {
                                        this.v.put(str3, obj5);
                                        obj10 = obj7;
                                    } else if (BISPApplication.c().B()) {
                                        obj10 = obj7;
                                        this.v.put(str3, obj10);
                                    } else {
                                        obj10 = obj7;
                                        this.v.put(str3, obj5);
                                    }
                                    obj11 = obj8;
                                    if (!this.A.t().toLowerCase().equals(obj11) && !this.A.t().toLowerCase().equals(obj) && !this.A.t().toLowerCase().equals("splitting")) {
                                        obj12 = obj10;
                                        Object obj25 = obj9;
                                        if (this.A.t().toLowerCase().equals(obj25)) {
                                            obj9 = obj25;
                                        } else {
                                            int i19 = c + 29;
                                            obj13 = obj5;
                                            d = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                this.A.t().toLowerCase().equals(obj2);
                                                Object obj26 = null;
                                                obj26.hashCode();
                                                throw null;
                                            }
                                            obj14 = obj2;
                                            if (this.A.t().toLowerCase().equals(obj14)) {
                                                obj9 = obj25;
                                                str4 = str3;
                                            } else {
                                                str4 = str3;
                                                String str50 = str;
                                                if (this.A.t().toLowerCase().contains(str50)) {
                                                    obj9 = obj25;
                                                    str = str50;
                                                } else {
                                                    str = str50;
                                                    obj9 = obj25;
                                                    str5 = str319;
                                                    this.v.put(str5, this.l.enumerator_id);
                                                }
                                            }
                                            str5 = str319;
                                            this.v.put(str5, this.A.c());
                                        }
                                        String str3110 = str5;
                                        this.v.put("willingForFinancialAsst", this.l.financial_assistance);
                                        this.v.put("isMigratedForEconomicActivities", this.l.migration);
                                        this.v.put("isInfantDeath", this.l.infant_death);
                                        this.v.put("isInfantBirth", this.l.infant_birth);
                                        this.v.put("howResolvePersonalDisputes", this.l.resolve_complaint);
                                        this.v.put("howResolveComplaintsAgainstStateDept", this.l.resolve_complaint);
                                        this.v.put("levelOfSatisfiactionWithStateJustice", this.l.satisfaction_level);
                                        this.v.put("takenLoan", this.l.taken_loan);
                                        this.v.put("monthlyIncome", this.l.monthly_income);
                                        this.v.put("defenceJob", this.l.defence_job);
                                        this.v.put("formNo", BuildConfig.FLAVOR);
                                        this.v.put("uuid", this.l.uuid);
                                        this.v.put("uniqueId", this.l.uniqueID);
                                        this.v.put("createdDatetime", this.l.date);
                                        this.v.put("endDate", str29);
                                        this.v.put("endBy", this.A.z());
                                        this.v.put("endByIp", strH);
                                        this.v.put("financialDifficulties", bISPApplication.l());
                                        this.v.put("poorEducationQuality", bISPApplication.q());
                                        this.v.put("childLabor", bISPApplication.k());
                                        this.v.put("childHealth", bISPApplication.j());
                                        this.v.put("notWillingToStudy", bISPApplication.m());
                                        if (this.A.t().toLowerCase().equals(obj11) || this.A.t().toLowerCase().equals(obj) || this.A.t().toLowerCase().equals("splitting")) {
                                            obj15 = obj9;
                                            str6 = str;
                                        } else {
                                            int i20 = c + 55;
                                            d = i20 % 128;
                                            int i21 = i20 % 2;
                                            obj15 = obj9;
                                            if (!(!this.A.t().toLowerCase().equals(obj15)) || this.A.t().toLowerCase().equals(obj14)) {
                                                str6 = str;
                                                str7 = str3110;
                                                this.s.put(str7, this.A.c());
                                            } else {
                                                str6 = str;
                                                if (!this.A.t().toLowerCase().contains(str6)) {
                                                    str26 = "endBy";
                                                    str24 = "endDate";
                                                    str7 = str3110;
                                                    this.s.put(str7, this.l.enumerator_id);
                                                }
                                            }
                                            String str3111 = str7;
                                            this.s.put("agriJson", this.l.agriJson);
                                            this.s.put("agriTypeOption", this.l.agriTypeOption);
                                            this.s.put("agriTypeOptionId", this.l.agriTypeOptionId);
                                            this.s.put("batchId", BuildConfig.FLAVOR);
                                            this.s.put("userId", this.A.y());
                                            this.s.put("firmId", bISPApplication.s());
                                            str8 = string2;
                                            this.s.put("startDatetime", str8);
                                            this.s.put("endDatetime", str29);
                                            String str3112 = str29;
                                            this.s.put("startTimeGps", this.l.startTimeGPS);
                                            this.s.put("endTimeGps", this.l.endTimeGPS);
                                            this.s.put("enumeratorImei", this.l.imei_number);
                                            this.s.put("enuName", this.l.enumerator_name);
                                            i4 = 0;
                                            while (true) {
                                                str9 = "cnic";
                                                str10 = "-";
                                                if (i4 < this.f74o.size()) {
                                                    break;
                                                }
                                                String str3113 = str8;
                                                if (this.f74o.get(i4).relation_to_household_id == 186) {
                                                    this.s.put("HhName", this.f74o.get(i4).name_of_member);
                                                    this.s.put("cnic", this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                                                    this.C = this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR);
                                                }
                                                i4++;
                                                str8 = str3113;
                                                str23 = str23;
                                            }
                                            String str3114 = str23;
                                            String str416 = str8;
                                            this.s.put("submissionDate", this.l.date);
                                            this.s.put("completeForm", this.l.complete_form);
                                            this.s.put("enuNumber", bISPApplication.t());
                                            this.s.put("interviewStatusId", ivas.gov.bisp.enumeration.bK.ag.n);
                                            this.s.put("enumeratorVerified", BuildConfig.FLAVOR);
                                            this.s.put("validationPercentage", this.l.validation_percentage);
                                            this.s.put("formNo", BuildConfig.FLAVOR);
                                            if (this.A.t().toLowerCase().equals(obj11) || this.A.t().toLowerCase().equals(obj) || this.A.t().toLowerCase().equals("splitting") || this.A.t().toLowerCase().equals(obj15) || this.A.t().toLowerCase().equals(obj14) || this.A.t().toLowerCase().contains(str6)) {
                                                this.s.put("oldFormNumber", this.A.j());
                                                i5 = d + 55;
                                                c = i5 % 128;
                                                if (i5 % 2 != 0) {
                                                    int i110 = 5 % 4;
                                                }
                                            } else {
                                                this.s.put("oldFormNumber", BuildConfig.FLAVOR);
                                            }
                                            this.s.put("resurvey_status", this.A.t());
                                            this.s.put("apkType", bISPApplication.i());
                                            this.s.put("formNoNotAtHome", BuildConfig.FLAVOR);
                                            this.s.put("uuid", this.l.uuid);
                                            this.s.put("comments", this.l.comments);
                                            this.s.put("isRecollected", bISPApplication.y());
                                            this.s.put("uniqueId", this.l.uniqueID);
                                            this.s.put("isNewSurvey", this.l.isNewSurvey);
                                            this.s.put("isDuplicate", BuildConfig.FLAVOR);
                                            this.s.put("interviewStatusReason", BuildConfig.FLAVOR);
                                            this.s.put("locationAccuracy", this.l.locationAccuracy);
                                            this.s.put("contactDetailStart", this.l.contactDetailStart);
                                            this.s.put("contactDetailEnd", this.l.contactDetailEnd);
                                            this.s.put("diffContactDetail", this.l.diffContactDetail);
                                            this.s.put("householdStart", this.l.householdStart);
                                            this.s.put("householdEnd", this.l.householdEnd);
                                            this.s.put("diffHousehold", this.l.diffHousehold);
                                            this.s.put("miscellaneousStart", this.l.miscellaneousStart);
                                            this.s.put("miscellaneousEnd", this.l.miscellaneousEnd);
                                            this.s.put("diffMiscellaneous", this.l.diffMiscellaneous);
                                            this.s.put(str3114, this.l.date);
                                            this.s.put("startDatetimePick", str416);
                                            this.s.put("origFormNo", this.l.form_no);
                                            this.s.put("isResurveyCorrected", BuildConfig.FLAVOR);
                                            this.s.put("isOverrideDiscrepant", BuildConfig.FLAVOR);
                                            this.s.put("isDeleted", BuildConfig.FLAVOR);
                                            this.s.put("saLongitude", this.l.longitude);
                                            this.s.put("saLongitude", this.l.latitude);
                                            this.s.put("isPmtReady", 1);
                                            if (this.A.l().intValue() != 2 || this.A.l().intValue() == 3) {
                                                str11 = str4;
                                                obj16 = obj13;
                                                if (BISPApplication.c().B()) {
                                                    obj17 = obj12;
                                                    this.s.put(str11, obj17);
                                                } else {
                                                    obj17 = obj12;
                                                    this.s.put(str11, obj16);
                                                }
                                            } else {
                                                str11 = str4;
                                                obj16 = obj13;
                                                this.s.put(str11, obj16);
                                                obj17 = obj12;
                                            }
                                            String str417 = "uuid";
                                            String str418 = str24;
                                            this.s.put(str418, str3112);
                                            String str419 = str418;
                                            String str4110 = str26;
                                            this.s.put(str4110, this.A.z());
                                            String str4111 = str4110;
                                            this.s.put("endByIp", strH);
                                            String str4112 = strH;
                                            String str4113 = "endByIp";
                                            this.s.put("isSingleStory", bISPApplication.z());
                                            this.s.put("isCompound", bISPApplication.w());
                                            string = ((j) this.A.h(this.m)).getString("shock_json", BuildConfig.FLAVOR);
                                            if (string.equals(BuildConfig.FLAVOR)) {
                                                this.s.put("SurveyDisasterData", new JSONObject(string));
                                                this.s.put("isDisaster", 1);
                                            } else {
                                                this.s.put("SurveyDisasterData", BuildConfig.FLAVOR);
                                                obj4 = null;
                                                this.s.put("isDisaster", 0);
                                            }
                                            this.s.put("data_collection_modality", this.l.data_collection_modality);
                                            strG = ivas.gov.bisp.enumeration.dj.C.g(this.m, this.A, this.h);
                                            if (strG != null || strG.trim().isEmpty()) {
                                                progressDialog = this.h;
                                                if (progressDialog != null && progressDialog.isShowing()) {
                                                    this.h.dismiss();
                                                }
                                                return Boolean.FALSE;
                                            }
                                            try {
                                                this.s.put("submission_otp", Integer.parseInt(strG.trim()));
                                                this.s.put("geoLocationData", this.t);
                                                this.s.put("HouseHoldAssetsData", this.u);
                                                this.s.put("HouseHoldMiscellaneousData", this.v);
                                                this.s.put("SurveyImagesData", this.x);
                                                if (this.f74o != null) {
                                                    int i22 = d + 25;
                                                    c = i22 % 128;
                                                    int i23 = i22 % 2;
                                                    for (int i24 = 0; i24 < this.f74o.size(); i24++) {
                                                        this.f74o.get(i24).surveyFormNo = this.l.form_no;
                                                        this.f74o.get(i24).surveyUuid = this.l.uniqueID;
                                                        this.f74o.get(i24).surveyType = String.valueOf(i3);
                                                    }
                                                    try {
                                                        JSONArray jSONArray3 = new JSONArray();
                                                        int i25 = 0;
                                                        while (i25 < this.f74o.size()) {
                                                            try {
                                                                JSONObject jSONObject = new JSONObject();
                                                                JSONArray jSONArray4 = jSONArray3;
                                                                try {
                                                                    if (this.A.t().toLowerCase().equals(obj11)) {
                                                                        obj18 = obj;
                                                                        str13 = str3111;
                                                                        jSONObject.put(str13, this.A.c());
                                                                    } else {
                                                                        try {
                                                                            if (this.A.t().toLowerCase().equals(obj) || this.A.t().toLowerCase().equals(str316) || this.A.t().toLowerCase().equals(obj15) || this.A.t().toLowerCase().equals(obj14)) {
                                                                                obj18 = obj;
                                                                            } else {
                                                                                int i26 = d + 99;
                                                                                obj18 = obj;
                                                                                c = i26 % 128;
                                                                                int i27 = i26 % 2;
                                                                                try {
                                                                                    if (!this.A.t().toLowerCase().contains(str6)) {
                                                                                        str13 = str3111;
                                                                                        try {
                                                                                            jSONObject.put(str13, this.l.enumerator_id);
                                                                                        } catch (JSONException unused3) {
                                                                                            str3111 = str13;
                                                                                            str10 = str10;
                                                                                            obj11 = obj11;
                                                                                            str6 = str6;
                                                                                            str12 = str30;
                                                                                            str4112 = str4112;
                                                                                            str4111 = str4111;
                                                                                            str419 = str419;
                                                                                            obj = null;
                                                                                            str25 = str25;
                                                                                            str316 = str316;
                                                                                            str27 = str27;
                                                                                            str417 = str417;
                                                                                            str4113 = str4113;
                                                                                            obj16 = obj16;
                                                                                            str11 = str11;
                                                                                            obj14 = obj14;
                                                                                            str28 = str28;
                                                                                            obj19 = obj15;
                                                                                        }
                                                                                    }
                                                                                } catch (JSONException unused4) {
                                                                                    str13 = str3111;
                                                                                    str3111 = str13;
                                                                                    str10 = str10;
                                                                                    obj11 = obj11;
                                                                                    str6 = str6;
                                                                                    str12 = str30;
                                                                                    str4112 = str4112;
                                                                                    str4111 = str4111;
                                                                                    str419 = str419;
                                                                                    obj = null;
                                                                                    str25 = str25;
                                                                                    str316 = str316;
                                                                                    str27 = str27;
                                                                                    str417 = str417;
                                                                                    str4113 = str4113;
                                                                                    obj16 = obj16;
                                                                                    str11 = str11;
                                                                                    obj14 = obj14;
                                                                                    str28 = str28;
                                                                                    obj19 = obj15;
                                                                                    try {
                                                                                        jSONArray4.put(jSONObject);
                                                                                        i25++;
                                                                                        jSONArray3 = jSONArray4;
                                                                                        obj15 = obj19;
                                                                                        obj16 = obj16;
                                                                                        obj = obj18;
                                                                                        str11 = str11;
                                                                                        str25 = str25;
                                                                                        str4113 = str4113;
                                                                                        str417 = str417;
                                                                                        str419 = str419;
                                                                                        str28 = str28;
                                                                                        str4111 = str4111;
                                                                                        str4112 = str4112;
                                                                                        obj14 = obj14;
                                                                                        obj11 = obj11;
                                                                                        str6 = str6;
                                                                                        str27 = str27;
                                                                                        str316 = str316;
                                                                                        str30 = str12;
                                                                                        str10 = str10;
                                                                                    } catch (Exception unused5) {
                                                                                        c2 = c3;
                                                                                        Objects.requireNonNull(c2.k(this.l));
                                                                                        if (this.f74o != null) {
                                                                                            for (r11 = obj; r11 < this.f74o.size(); r11++) {
                                                                                                this.f74o.get(r11).surveyFormNo = this.l.form_no;
                                                                                                this.f74o.get(r11).surveyUuid = this.l.uniqueID;
                                                                                                this.f74o.get(r11).surveyType = String.valueOf(i3);
                                                                                            }
                                                                                        }
                                                                                        if (!BISPApplication.d()) {
                                                                                            Objects.requireNonNull(bISPApplication);
                                                                                            throw null;
                                                                                        }
                                                                                        k(this.s.toString());
                                                                                        ah ahVarC = ah.c();
                                                                                        StringBuilder sb = new StringBuilder();
                                                                                        sb.append(this.l.date);
                                                                                        sb.append(" ");
                                                                                        sb.append(this.l.time);
                                                                                        ahVarC.f("last_survey_loc_timestamp", sb.toString());
                                                                                        return Boolean.TRUE;
                                                                                    }
                                                                                }
                                                                            }
                                                                            str13 = str3111;
                                                                            try {
                                                                                jSONObject.put(str13, this.A.c());
                                                                            } catch (JSONException unused6) {
                                                                                str3111 = str13;
                                                                                str12 = str30;
                                                                                obj = null;
                                                                                obj19 = obj15;
                                                                                jSONArray4.put(jSONObject);
                                                                                i25++;
                                                                                jSONArray3 = jSONArray4;
                                                                                obj15 = obj19;
                                                                                obj16 = obj16;
                                                                                obj = obj18;
                                                                                str11 = str11;
                                                                                str25 = str25;
                                                                                str4113 = str4113;
                                                                                str417 = str417;
                                                                                str419 = str419;
                                                                                str28 = str28;
                                                                                str4111 = str4111;
                                                                                str4112 = str4112;
                                                                                obj14 = obj14;
                                                                                obj11 = obj11;
                                                                                str6 = str6;
                                                                                str27 = str27;
                                                                                str316 = str316;
                                                                                str30 = str12;
                                                                                str10 = str10;
                                                                            }
                                                                        } catch (JSONException unused7) {
                                                                            obj18 = obj;
                                                                        }
                                                                    }
                                                                    str3111 = str13;
                                                                    try {
                                                                        jSONObject.put("cnicEnc", this.f74o.get(i25).cnic);
                                                                        String str51 = str9;
                                                                        try {
                                                                            jSONObject.put(str51, this.f74o.get(i25).cnic);
                                                                            str9 = str51;
                                                                            String str52 = str30;
                                                                            try {
                                                                                jSONObject.put(str52, this.f74o.get(i25).name_of_member);
                                                                                str316 = str316;
                                                                                str28 = str28;
                                                                                try {
                                                                                    jSONObject.put(str28, this.f74o.get(i25).name_of_member);
                                                                                    obj19 = obj15;
                                                                                    str27 = str27;
                                                                                    try {
                                                                                        jSONObject.put(str27, this.f74o.get(i25).urdu_name_of_member);
                                                                                        obj14 = obj14;
                                                                                        String str53 = str317;
                                                                                        try {
                                                                                            jSONObject.put(str53, this.l.name_of_head);
                                                                                            str317 = str53;
                                                                                            String str54 = str318;
                                                                                            try {
                                                                                                jSONObject.put(str54, this.l.name_of_head);
                                                                                                str318 = str54;
                                                                                                try {
                                                                                                    jSONObject.put("relationToHouseholdHead", this.f74o.get(i25).relation_to_household_id);
                                                                                                    try {
                                                                                                        IndividualNadraDataWithRelation individualNadraDataWithRelationBf = appDatabaseL.m().bf(this.f74o.get(i25).cnic.replaceAll(str10, BuildConfig.FLAVOR).trim());
                                                                                                        if (individualNadraDataWithRelationBf != null) {
                                                                                                            try {
                                                                                                                String str55 = individualNadraDataWithRelationBf.spouseName;
                                                                                                                if (str55 == null) {
                                                                                                                    str55 = BuildConfig.FLAVOR;
                                                                                                                }
                                                                                                                obj11 = obj11;
                                                                                                                try {
                                                                                                                    String str56 = individualNadraDataWithRelationBf.spouseNic;
                                                                                                                    if (str56 == null) {
                                                                                                                        str56 = BuildConfig.FLAVOR;
                                                                                                                    }
                                                                                                                    str6 = str6;
                                                                                                                    try {
                                                                                                                        String str57 = individualNadraDataWithRelationBf.fatherName;
                                                                                                                        if (str57 == null) {
                                                                                                                            str57 = BuildConfig.FLAVOR;
                                                                                                                        }
                                                                                                                        str27 = str27;
                                                                                                                        try {
                                                                                                                            String str58 = individualNadraDataWithRelationBf.fatherNic;
                                                                                                                            if (str58 == null) {
                                                                                                                                str58 = BuildConfig.FLAVOR;
                                                                                                                            }
                                                                                                                            str28 = str28;
                                                                                                                            try {
                                                                                                                                String str59 = individualNadraDataWithRelationBf.motherName;
                                                                                                                                if (str59 == null) {
                                                                                                                                    str59 = BuildConfig.FLAVOR;
                                                                                                                                }
                                                                                                                                String str60 = individualNadraDataWithRelationBf.motherNic;
                                                                                                                                if (str60 == null) {
                                                                                                                                    str60 = BuildConfig.FLAVOR;
                                                                                                                                }
                                                                                                                                str12 = str52;
                                                                                                                                try {
                                                                                                                                    jSONObject.put("spouseName", str55);
                                                                                                                                    jSONObject.put("spouseCnic", str56);
                                                                                                                                    jSONObject.put("fatherName", str57);
                                                                                                                                    jSONObject.put("fatherCnic", str58);
                                                                                                                                    jSONObject.put("motherName", str59);
                                                                                                                                    jSONObject.put("motherCnic", str60);
                                                                                                                                    jSONObject.put("relationToHouseholdHeadStatus", this.f74o.get(i25).relation_to_household_id);
                                                                                                                                    jSONObject.put("gender", this.f74o.get(i25).gender);
                                                                                                                                    jSONObject.put("dob", this.f74o.get(i25).date_of_birth);
                                                                                                                                    jSONObject.put("dobDate", BuildConfig.FLAVOR);
                                                                                                                                    jSONObject.put("age", this.f74o.get(i25).age);
                                                                                                                                    jSONObject.put("ageCalculationTimestamp", BuildConfig.FLAVOR);
                                                                                                                                    jSONObject.put("maritalStatusCode", this.f74o.get(i25).marital_status);
                                                                                                                                    jSONObject.put("maritalStatus", this.f74o.get(i25).merital_status_name);
                                                                                                                                    jSONObject.put("spouseCode", this.f74o.get(i25).id_spouse);
                                                                                                                                    jSONObject.put("motherCode", this.f74o.get(i25).id_mother);
                                                                                                                                    jSONObject.put("fatherCode", this.f74o.get(i25).id_father);
                                                                                                                                    jSONObject.put("cnicOption", this.f74o.get(i25).cnicOption);
                                                                                                                                    jSONObject.put("rosterRelationalId", this.f74o.get(i25).roster_relational_id);
                                                                                                                                    jSONObject.put("disabilityCode", this.f74o.get(i25).disability);
                                                                                                                                    jSONObject.put("disabilityStatus", this.f74o.get(i25).disability_name);
                                                                                                                                    jSONObject.put("havingChronicDiseaseCode", this.f74o.get(i25).chronic_disease);
                                                                                                                                    jSONObject.put("havingChronicDiseaseStatus", this.f74o.get(i25).chronic_disease_name);
                                                                                                                                    jSONObject.put("isLiterate", this.f74o.get(i25).language);
                                                                                                                                    jSONObject.put("goneToSchoolCode", this.f74o.get(i25).attended_school);
                                                                                                                                    jSONObject.put("goneToSchoolStatus", this.f74o.get(i25).attended_school_name);
                                                                                                                                    jSONObject.put("educationLevelCode", this.f74o.get(i25).higher_education);
                                                                                                                                    jSONObject.put("educationLevelStatus", this.f74o.get(i25).higher_education_name);
                                                                                                                                    jSONObject.put("workStatusCode", this.f74o.get(i25).work_activity);
                                                                                                                                    jSONObject.put("workStatus", this.f74o.get(i25).work_activity_name);
                                                                                                                                    jSONObject.put("lastWeekWorkingHours", this.f74o.get(i25).hours_worked);
                                                                                                                                    jSONObject.put("employmentCode", this.f74o.get(i25).employment_status);
                                                                                                                                    jSONObject.put("employmentStatus", this.f74o.get(i25).employment_status_name);
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (this.A.l().intValue() != 2) {
                                                                                                                                                                    try {
                                                                                                                                                                        if (this.A.l().intValue() != 3) {
                                                                                                                                                                            try {
                                                                                                                                                                                jSONObject.put(str11, obj16);
                                                                                                                                                                            } catch (JSONException unused8) {
                                                                                                                                                                                str10 = str10;
                                                                                                                                                                                str27 = str27;
                                                                                                                                                                                str28 = str28;
                                                                                                                                                                                str12 = str12;
                                                                                                                                                                                obj = null;
                                                                                                                                                                                str417 = str417;
                                                                                                                                                                                str4113 = str4113;
                                                                                                                                                                                obj16 = obj16;
                                                                                                                                                                                str11 = str11;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        jSONObject.put("insertionTimestamp", this.f74o.get(i25).start);
                                                                                                                                                                        jSONObject.put(str25, BuildConfig.FLAVOR);
                                                                                                                                                                        str417 = str417;
                                                                                                                                                                        jSONObject.put(str417, this.f74o.get(i25).surveyUuid);
                                                                                                                                                                        jSONObject.put("personStatus", 1);
                                                                                                                                                                        jSONObject.put("statusRemarks", BuildConfig.FLAVOR);
                                                                                                                                                                        jSONObject.put("disiblityCertificateNumber", BuildConfig.FLAVOR);
                                                                                                                                                                        str14 = str419;
                                                                                                                                                                        jSONObject.put(str14, this.f74o.get(i25).end);
                                                                                                                                                                        str4111 = str4111;
                                                                                                                                                                        jSONObject.put(str4111, this.A.z());
                                                                                                                                                                        str15 = str4113;
                                                                                                                                                                        str4112 = str4112;
                                                                                                                                                                        jSONObject.put(str15, str4112);
                                                                                                                                                                        jSONObject.put("mobile_network_name", this.f74o.get(i25).mobile_network_name);
                                                                                                                                                                        jSONObject.put("mobile_no", this.f74o.get(i25).mobile_no);
                                                                                                                                                                        jSONObject.put("banks_name", this.f74o.get(i25).banks_name);
                                                                                                                                                                        jSONObject.put("branch_code", this.f74o.get(i25).branch_code);
                                                                                                                                                                        jSONObject.put("bank_address", this.f74o.get(i25).bank_address);
                                                                                                                                                                        jSONObject.put("account_title", this.f74o.get(i25).account_title);
                                                                                                                                                                        jSONObject.put("account_number", this.f74o.get(i25).account_number);
                                                                                                                                                                        jSONObject.put("isImmunized", this.f74o.get(i25).isImmunized);
                                                                                                                                                                        jSONObject.put("height_of_child", this.f74o.get(i25).height_of_child);
                                                                                                                                                                        jSONObject.put("weight_of_child", this.f74o.get(i25).weight_of_child);
                                                                                                                                                                        jSONObject.put("RosterVaccinations", new JSONArray(this.f74o.get(i25).rosterVaccinationsJson));
                                                                                                                                                                        beneficiaryEntityAd = appDatabaseL.m().ad(this.f74o.get(i25).cnic.replace(str10, BuildConfig.FLAVOR));
                                                                                                                                                                        str16 = this.f74o.get(i25).name_of_member;
                                                                                                                                                                        obj16 = obj16;
                                                                                                                                                                        str17 = this.f74o.get(i25).urdu_name_of_member;
                                                                                                                                                                        String str61 = this.f74o.get(i25).gender;
                                                                                                                                                                        str25 = str25;
                                                                                                                                                                        double d2 = this.f74o.get(i25).age;
                                                                                                                                                                        int i28 = this.f74o.get(i25).marital_status;
                                                                                                                                                                        int i29 = this.f74o.get(i25).disability;
                                                                                                                                                                        if (beneficiaryEntityAd != null) {
                                                                                                                                                                            str18 = beneficiaryEntityAd.englishName;
                                                                                                                                                                            if (str18 != null) {
                                                                                                                                                                                try {
                                                                                                                                                                                    if (!str18.trim().isEmpty()) {
                                                                                                                                                                                        str16 = beneficiaryEntityAd.englishName;
                                                                                                                                                                                    }
                                                                                                                                                                                    str19 = beneficiaryEntityAd.urduName;
                                                                                                                                                                                    if (str19 != null || str19.trim().isEmpty()) {
                                                                                                                                                                                        str20 = str17;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        str20 = beneficiaryEntityAd.urduName;
                                                                                                                                                                                    }
                                                                                                                                                                                    String str62 = beneficiaryEntityAd.gender;
                                                                                                                                                                                    str11 = str11;
                                                                                                                                                                                    try {
                                                                                                                                                                                        String str63 = beneficiaryEntityAd.dob;
                                                                                                                                                                                        str4113 = str15;
                                                                                                                                                                                        try {
                                                                                                                                                                                            double d3 = beneficiaryEntityAd.age;
                                                                                                                                                                                            str417 = str417;
                                                                                                                                                                                            try {
                                                                                                                                                                                                str419 = str14;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    nadraFamilyDataAf = appDatabaseL.m().af(this.f74o.get(i25).cnic.replace(str10, BuildConfig.FLAVOR));
                                                                                                                                                                                                    if (nadraFamilyDataAf != null) {
                                                                                                                                                                                                        str21 = nadraFamilyDataAf.urduName;
                                                                                                                                                                                                        if (str21 == null) {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (str21.trim().isEmpty()) {
                                                                                                                                                                                                                    str22 = BuildConfig.FLAVOR;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    str22 = nadraFamilyDataAf.urduName;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (JSONException unused9) {
                                                                                                                                                                                                                str10 = str10;
                                                                                                                                                                                                                str27 = str27;
                                                                                                                                                                                                                str28 = str28;
                                                                                                                                                                                                                str12 = str12;
                                                                                                                                                                                                                obj = null;
                                                                                                                                                                                                                jSONArray4.put(jSONObject);
                                                                                                                                                                                                                i25++;
                                                                                                                                                                                                                jSONArray3 = jSONArray4;
                                                                                                                                                                                                                obj15 = obj19;
                                                                                                                                                                                                                obj16 = obj16;
                                                                                                                                                                                                                obj = obj18;
                                                                                                                                                                                                                str11 = str11;
                                                                                                                                                                                                                str25 = str25;
                                                                                                                                                                                                                str4113 = str4113;
                                                                                                                                                                                                                str417 = str417;
                                                                                                                                                                                                                str419 = str419;
                                                                                                                                                                                                                str28 = str28;
                                                                                                                                                                                                                str4111 = str4111;
                                                                                                                                                                                                                str4112 = str4112;
                                                                                                                                                                                                                obj14 = obj14;
                                                                                                                                                                                                                obj11 = obj11;
                                                                                                                                                                                                                str6 = str6;
                                                                                                                                                                                                                str27 = str27;
                                                                                                                                                                                                                str316 = str316;
                                                                                                                                                                                                                str30 = str12;
                                                                                                                                                                                                                str10 = str10;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            str22 = BuildConfig.FLAVOR;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (str20 != null || str22 == null) {
                                                                                                                                                                                                            str10 = str10;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            str10 = str10;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (str20.replaceAll("\\s+", BuildConfig.FLAVOR).equals(str22.replaceAll("\\s+", BuildConfig.FLAVOR))) {
                                                                                                                                                                                                                    str12 = str12;
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        jSONObject.put(str12, str16);
                                                                                                                                                                                                                        str28 = str28;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            jSONObject.put(str28, str16);
                                                                                                                                                                                                                            str27 = str27;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                jSONObject.put(str27, str20);
                                                                                                                                                                                                                                jSONObject.put("gender", str62);
                                                                                                                                                                                                                                jSONObject.put("age", d3);
                                                                                                                                                                                                                                jSONObject.put("dob", str63);
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    this.D = false;
                                                                                                                                                                                                                                } catch (Exception unused10) {
                                                                                                                                                                                                                                    obj = null;
                                                                                                                                                                                                                                    c2 = c3;
                                                                                                                                                                                                                                    Objects.requireNonNull(c2.k(this.l));
                                                                                                                                                                                                                                    if (this.f74o != null) {
                                                                                                                                                                                                                                        while (r11 < this.f74o.size()) {
                                                                                                                                                                                                                                            this.f74o.get(r11).surveyFormNo = this.l.form_no;
                                                                                                                                                                                                                                            this.f74o.get(r11).surveyUuid = this.l.uniqueID;
                                                                                                                                                                                                                                            this.f74o.get(r11).surveyType = String.valueOf(i3);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (!BISPApplication.d()) {
                                                                                                                                                                                                                                        Objects.requireNonNull(bISPApplication);
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    k(this.s.toString());
                                                                                                                                                                                                                                    ah ahVarC2 = ah.c();
                                                                                                                                                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                                                                                                                                                    sb2.append(this.l.date);
                                                                                                                                                                                                                                    sb2.append(" ");
                                                                                                                                                                                                                                    sb2.append(this.l.time);
                                                                                                                                                                                                                                    ahVarC2.f("last_survey_loc_timestamp", sb2.toString());
                                                                                                                                                                                                                                    return Boolean.TRUE;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } catch (JSONException unused11) {
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } catch (JSONException unused12) {
                                                                                                                                                                                                                            str27 = str27;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } catch (JSONException unused13) {
                                                                                                                                                                                                                        str27 = str27;
                                                                                                                                                                                                                        str28 = str28;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (JSONException unused14) {
                                                                                                                                                                                                                str27 = str27;
                                                                                                                                                                                                                str28 = str28;
                                                                                                                                                                                                                str12 = str12;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        str27 = str27;
                                                                                                                                                                                                        str28 = str28;
                                                                                                                                                                                                        str12 = str12;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            this.D = true;
                                                                                                                                                                                                            StringBuilder sb3 = new StringBuilder();
                                                                                                                                                                                                            sb3.append("CNIC: ");
                                                                                                                                                                                                            sb3.append(this.f74o.get(i25).cnic);
                                                                                                                                                                                                            sb3.append("\nSaved Urdu Name: ");
                                                                                                                                                                                                            sb3.append(str20);
                                                                                                                                                                                                            sb3.append("\nNADRA Urdu Name: ");
                                                                                                                                                                                                            sb3.append(str22);
                                                                                                                                                                                                            this.z = sb3.toString();
                                                                                                                                                                                                        } catch (JSONException unused15) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (JSONException unused16) {
                                                                                                                                                                                                    str10 = str10;
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (JSONException unused17) {
                                                                                                                                                                                                str419 = str14;
                                                                                                                                                                                                str27 = str27;
                                                                                                                                                                                                str28 = str28;
                                                                                                                                                                                                str12 = str12;
                                                                                                                                                                                                obj = null;
                                                                                                                                                                                                jSONArray4.put(jSONObject);
                                                                                                                                                                                                i25++;
                                                                                                                                                                                                jSONArray3 = jSONArray4;
                                                                                                                                                                                                obj15 = obj19;
                                                                                                                                                                                                obj16 = obj16;
                                                                                                                                                                                                obj = obj18;
                                                                                                                                                                                                str11 = str11;
                                                                                                                                                                                                str25 = str25;
                                                                                                                                                                                                str4113 = str4113;
                                                                                                                                                                                                str417 = str417;
                                                                                                                                                                                                str419 = str419;
                                                                                                                                                                                                str28 = str28;
                                                                                                                                                                                                str4111 = str4111;
                                                                                                                                                                                                str4112 = str4112;
                                                                                                                                                                                                obj14 = obj14;
                                                                                                                                                                                                obj11 = obj11;
                                                                                                                                                                                                str6 = str6;
                                                                                                                                                                                                str27 = str27;
                                                                                                                                                                                                str316 = str316;
                                                                                                                                                                                                str30 = str12;
                                                                                                                                                                                                str10 = str10;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (JSONException unused18) {
                                                                                                                                                                                            str417 = str417;
                                                                                                                                                                                            str419 = str14;
                                                                                                                                                                                            str27 = str27;
                                                                                                                                                                                            str28 = str28;
                                                                                                                                                                                            str12 = str12;
                                                                                                                                                                                            obj = null;
                                                                                                                                                                                            jSONArray4.put(jSONObject);
                                                                                                                                                                                            i25++;
                                                                                                                                                                                            jSONArray3 = jSONArray4;
                                                                                                                                                                                            obj15 = obj19;
                                                                                                                                                                                            obj16 = obj16;
                                                                                                                                                                                            obj = obj18;
                                                                                                                                                                                            str11 = str11;
                                                                                                                                                                                            str25 = str25;
                                                                                                                                                                                            str4113 = str4113;
                                                                                                                                                                                            str417 = str417;
                                                                                                                                                                                            str419 = str419;
                                                                                                                                                                                            str28 = str28;
                                                                                                                                                                                            str4111 = str4111;
                                                                                                                                                                                            str4112 = str4112;
                                                                                                                                                                                            obj14 = obj14;
                                                                                                                                                                                            obj11 = obj11;
                                                                                                                                                                                            str6 = str6;
                                                                                                                                                                                            str27 = str27;
                                                                                                                                                                                            str316 = str316;
                                                                                                                                                                                            str30 = str12;
                                                                                                                                                                                            str10 = str10;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (JSONException unused19) {
                                                                                                                                                                                        str4113 = str15;
                                                                                                                                                                                        str417 = str417;
                                                                                                                                                                                        str419 = str14;
                                                                                                                                                                                        str27 = str27;
                                                                                                                                                                                        str28 = str28;
                                                                                                                                                                                        str12 = str12;
                                                                                                                                                                                        obj = null;
                                                                                                                                                                                        jSONArray4.put(jSONObject);
                                                                                                                                                                                        i25++;
                                                                                                                                                                                        jSONArray3 = jSONArray4;
                                                                                                                                                                                        obj15 = obj19;
                                                                                                                                                                                        obj16 = obj16;
                                                                                                                                                                                        obj = obj18;
                                                                                                                                                                                        str11 = str11;
                                                                                                                                                                                        str25 = str25;
                                                                                                                                                                                        str4113 = str4113;
                                                                                                                                                                                        str417 = str417;
                                                                                                                                                                                        str419 = str419;
                                                                                                                                                                                        str28 = str28;
                                                                                                                                                                                        str4111 = str4111;
                                                                                                                                                                                        str4112 = str4112;
                                                                                                                                                                                        obj14 = obj14;
                                                                                                                                                                                        obj11 = obj11;
                                                                                                                                                                                        str6 = str6;
                                                                                                                                                                                        str27 = str27;
                                                                                                                                                                                        str316 = str316;
                                                                                                                                                                                        str30 = str12;
                                                                                                                                                                                        str10 = str10;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (JSONException unused20) {
                                                                                                                                                                                    str11 = str11;
                                                                                                                                                                                    str4113 = str15;
                                                                                                                                                                                    str10 = str10;
                                                                                                                                                                                    str417 = str417;
                                                                                                                                                                                    str419 = str14;
                                                                                                                                                                                    str27 = str27;
                                                                                                                                                                                    str28 = str28;
                                                                                                                                                                                    str12 = str12;
                                                                                                                                                                                    obj = null;
                                                                                                                                                                                    jSONArray4.put(jSONObject);
                                                                                                                                                                                    i25++;
                                                                                                                                                                                    jSONArray3 = jSONArray4;
                                                                                                                                                                                    obj15 = obj19;
                                                                                                                                                                                    obj16 = obj16;
                                                                                                                                                                                    obj = obj18;
                                                                                                                                                                                    str11 = str11;
                                                                                                                                                                                    str25 = str25;
                                                                                                                                                                                    str4113 = str4113;
                                                                                                                                                                                    str417 = str417;
                                                                                                                                                                                    str419 = str419;
                                                                                                                                                                                    str28 = str28;
                                                                                                                                                                                    str4111 = str4111;
                                                                                                                                                                                    str4112 = str4112;
                                                                                                                                                                                    obj14 = obj14;
                                                                                                                                                                                    obj11 = obj11;
                                                                                                                                                                                    str6 = str6;
                                                                                                                                                                                    str27 = str27;
                                                                                                                                                                                    str316 = str316;
                                                                                                                                                                                    str30 = str12;
                                                                                                                                                                                    str10 = str10;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                str19 = beneficiaryEntityAd.urduName;
                                                                                                                                                                                if (str19 != null) {
                                                                                                                                                                                    str20 = str17;
                                                                                                                                                                                } else {
                                                                                                                                                                                    str20 = str17;
                                                                                                                                                                                }
                                                                                                                                                                                String str64 = beneficiaryEntityAd.gender;
                                                                                                                                                                                str11 = str11;
                                                                                                                                                                                String str65 = beneficiaryEntityAd.dob;
                                                                                                                                                                                str4113 = str15;
                                                                                                                                                                                double d4 = beneficiaryEntityAd.age;
                                                                                                                                                                                str417 = str417;
                                                                                                                                                                                str419 = str14;
                                                                                                                                                                                nadraFamilyDataAf = appDatabaseL.m().af(this.f74o.get(i25).cnic.replace(str10, BuildConfig.FLAVOR));
                                                                                                                                                                                if (nadraFamilyDataAf != null) {
                                                                                                                                                                                    str21 = nadraFamilyDataAf.urduName;
                                                                                                                                                                                    if (str21 == null) {
                                                                                                                                                                                        str22 = BuildConfig.FLAVOR;
                                                                                                                                                                                    } else if (str21.trim().isEmpty()) {
                                                                                                                                                                                        str22 = nadraFamilyDataAf.urduName;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        str22 = BuildConfig.FLAVOR;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (str20 != null) {
                                                                                                                                                                                        str10 = str10;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        str10 = str10;
                                                                                                                                                                                    }
                                                                                                                                                                                    str27 = str27;
                                                                                                                                                                                    str28 = str28;
                                                                                                                                                                                    str12 = str12;
                                                                                                                                                                                    this.D = true;
                                                                                                                                                                                    StringBuilder sb4 = new StringBuilder();
                                                                                                                                                                                    sb4.append("CNIC: ");
                                                                                                                                                                                    sb4.append(this.f74o.get(i25).cnic);
                                                                                                                                                                                    sb4.append("\nSaved Urdu Name: ");
                                                                                                                                                                                    sb4.append(str20);
                                                                                                                                                                                    sb4.append("\nNADRA Urdu Name: ");
                                                                                                                                                                                    sb4.append(str22);
                                                                                                                                                                                    this.z = sb4.toString();
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            obj = null;
                                                                                                                                                                            jSONArray4.put(jSONObject);
                                                                                                                                                                            i25++;
                                                                                                                                                                            jSONArray3 = jSONArray4;
                                                                                                                                                                            obj15 = obj19;
                                                                                                                                                                            obj16 = obj16;
                                                                                                                                                                            obj = obj18;
                                                                                                                                                                            str11 = str11;
                                                                                                                                                                            str25 = str25;
                                                                                                                                                                            str4113 = str4113;
                                                                                                                                                                            str417 = str417;
                                                                                                                                                                            str419 = str419;
                                                                                                                                                                            str28 = str28;
                                                                                                                                                                            str4111 = str4111;
                                                                                                                                                                            str4112 = str4112;
                                                                                                                                                                            obj14 = obj14;
                                                                                                                                                                            obj11 = obj11;
                                                                                                                                                                            str6 = str6;
                                                                                                                                                                            str27 = str27;
                                                                                                                                                                            str316 = str316;
                                                                                                                                                                            str30 = str12;
                                                                                                                                                                            str10 = str10;
                                                                                                                                                                        } else {
                                                                                                                                                                            str11 = str11;
                                                                                                                                                                            str4113 = str15;
                                                                                                                                                                            str417 = str417;
                                                                                                                                                                            str419 = str14;
                                                                                                                                                                        }
                                                                                                                                                                        str27 = str27;
                                                                                                                                                                        str28 = str28;
                                                                                                                                                                        str12 = str12;
                                                                                                                                                                        obj = null;
                                                                                                                                                                    } catch (JSONException unused21) {
                                                                                                                                                                    }
                                                                                                                                                                    jSONArray4.put(jSONObject);
                                                                                                                                                                    i25++;
                                                                                                                                                                    jSONArray3 = jSONArray4;
                                                                                                                                                                    obj15 = obj19;
                                                                                                                                                                    obj16 = obj16;
                                                                                                                                                                    obj = obj18;
                                                                                                                                                                    str11 = str11;
                                                                                                                                                                    str25 = str25;
                                                                                                                                                                    str4113 = str4113;
                                                                                                                                                                    str417 = str417;
                                                                                                                                                                    str419 = str419;
                                                                                                                                                                    str28 = str28;
                                                                                                                                                                    str4111 = str4111;
                                                                                                                                                                    str4112 = str4112;
                                                                                                                                                                    obj14 = obj14;
                                                                                                                                                                    obj11 = obj11;
                                                                                                                                                                    str6 = str6;
                                                                                                                                                                    str27 = str27;
                                                                                                                                                                    str316 = str316;
                                                                                                                                                                    str30 = str12;
                                                                                                                                                                    str10 = str10;
                                                                                                                                                                }
                                                                                                                                                                double d5 = this.f74o.get(i25).age;
                                                                                                                                                                int i210 = this.f74o.get(i25).marital_status;
                                                                                                                                                                int i211 = this.f74o.get(i25).disability;
                                                                                                                                                                if (beneficiaryEntityAd != null) {
                                                                                                                                                                    str18 = beneficiaryEntityAd.englishName;
                                                                                                                                                                    if (str18 != null) {
                                                                                                                                                                        if (!str18.trim().isEmpty()) {
                                                                                                                                                                            str16 = beneficiaryEntityAd.englishName;
                                                                                                                                                                        }
                                                                                                                                                                        str19 = beneficiaryEntityAd.urduName;
                                                                                                                                                                        if (str19 != null) {
                                                                                                                                                                            str20 = str17;
                                                                                                                                                                        } else {
                                                                                                                                                                            str20 = str17;
                                                                                                                                                                        }
                                                                                                                                                                        String str66 = beneficiaryEntityAd.gender;
                                                                                                                                                                        str11 = str11;
                                                                                                                                                                        String str67 = beneficiaryEntityAd.dob;
                                                                                                                                                                        str4113 = str15;
                                                                                                                                                                        double d6 = beneficiaryEntityAd.age;
                                                                                                                                                                        str417 = str417;
                                                                                                                                                                        str419 = str14;
                                                                                                                                                                        nadraFamilyDataAf = appDatabaseL.m().af(this.f74o.get(i25).cnic.replace(str10, BuildConfig.FLAVOR));
                                                                                                                                                                        if (nadraFamilyDataAf != null) {
                                                                                                                                                                            str21 = nadraFamilyDataAf.urduName;
                                                                                                                                                                            if (str21 == null) {
                                                                                                                                                                                str22 = BuildConfig.FLAVOR;
                                                                                                                                                                            } else if (str21.trim().isEmpty()) {
                                                                                                                                                                                str22 = nadraFamilyDataAf.urduName;
                                                                                                                                                                            } else {
                                                                                                                                                                                str22 = BuildConfig.FLAVOR;
                                                                                                                                                                            }
                                                                                                                                                                            if (str20 != null) {
                                                                                                                                                                                str10 = str10;
                                                                                                                                                                            } else {
                                                                                                                                                                                str10 = str10;
                                                                                                                                                                            }
                                                                                                                                                                            str27 = str27;
                                                                                                                                                                            str28 = str28;
                                                                                                                                                                            str12 = str12;
                                                                                                                                                                            this.D = true;
                                                                                                                                                                            StringBuilder sb5 = new StringBuilder();
                                                                                                                                                                            sb5.append("CNIC: ");
                                                                                                                                                                            sb5.append(this.f74o.get(i25).cnic);
                                                                                                                                                                            sb5.append("\nSaved Urdu Name: ");
                                                                                                                                                                            sb5.append(str20);
                                                                                                                                                                            sb5.append("\nNADRA Urdu Name: ");
                                                                                                                                                                            sb5.append(str22);
                                                                                                                                                                            this.z = sb5.toString();
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        str19 = beneficiaryEntityAd.urduName;
                                                                                                                                                                        if (str19 != null) {
                                                                                                                                                                            str20 = str17;
                                                                                                                                                                        } else {
                                                                                                                                                                            str20 = str17;
                                                                                                                                                                        }
                                                                                                                                                                        String str68 = beneficiaryEntityAd.gender;
                                                                                                                                                                        str11 = str11;
                                                                                                                                                                        String str69 = beneficiaryEntityAd.dob;
                                                                                                                                                                        str4113 = str15;
                                                                                                                                                                        double d7 = beneficiaryEntityAd.age;
                                                                                                                                                                        str417 = str417;
                                                                                                                                                                        str419 = str14;
                                                                                                                                                                        nadraFamilyDataAf = appDatabaseL.m().af(this.f74o.get(i25).cnic.replace(str10, BuildConfig.FLAVOR));
                                                                                                                                                                        if (nadraFamilyDataAf != null) {
                                                                                                                                                                            str21 = nadraFamilyDataAf.urduName;
                                                                                                                                                                            if (str21 == null) {
                                                                                                                                                                                str22 = BuildConfig.FLAVOR;
                                                                                                                                                                            } else if (str21.trim().isEmpty()) {
                                                                                                                                                                                str22 = nadraFamilyDataAf.urduName;
                                                                                                                                                                            } else {
                                                                                                                                                                                str22 = BuildConfig.FLAVOR;
                                                                                                                                                                            }
                                                                                                                                                                            if (str20 != null) {
                                                                                                                                                                                str10 = str10;
                                                                                                                                                                            } else {
                                                                                                                                                                                str10 = str10;
                                                                                                                                                                            }
                                                                                                                                                                            str27 = str27;
                                                                                                                                                                            str28 = str28;
                                                                                                                                                                            str12 = str12;
                                                                                                                                                                            this.D = true;
                                                                                                                                                                            StringBuilder sb6 = new StringBuilder();
                                                                                                                                                                            sb6.append("CNIC: ");
                                                                                                                                                                            sb6.append(this.f74o.get(i25).cnic);
                                                                                                                                                                            sb6.append("\nSaved Urdu Name: ");
                                                                                                                                                                            sb6.append(str20);
                                                                                                                                                                            sb6.append("\nNADRA Urdu Name: ");
                                                                                                                                                                            sb6.append(str22);
                                                                                                                                                                            this.z = sb6.toString();
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    obj = null;
                                                                                                                                                                    jSONArray4.put(jSONObject);
                                                                                                                                                                    i25++;
                                                                                                                                                                    jSONArray3 = jSONArray4;
                                                                                                                                                                    obj15 = obj19;
                                                                                                                                                                    obj16 = obj16;
                                                                                                                                                                    obj = obj18;
                                                                                                                                                                    str11 = str11;
                                                                                                                                                                    str25 = str25;
                                                                                                                                                                    str4113 = str4113;
                                                                                                                                                                    str417 = str417;
                                                                                                                                                                    str419 = str419;
                                                                                                                                                                    str28 = str28;
                                                                                                                                                                    str4111 = str4111;
                                                                                                                                                                    str4112 = str4112;
                                                                                                                                                                    obj14 = obj14;
                                                                                                                                                                    obj11 = obj11;
                                                                                                                                                                    str6 = str6;
                                                                                                                                                                    str27 = str27;
                                                                                                                                                                    str316 = str316;
                                                                                                                                                                    str30 = str12;
                                                                                                                                                                    str10 = str10;
                                                                                                                                                                } else {
                                                                                                                                                                    str11 = str11;
                                                                                                                                                                    str4113 = str15;
                                                                                                                                                                    str417 = str417;
                                                                                                                                                                    str419 = str14;
                                                                                                                                                                }
                                                                                                                                                                str27 = str27;
                                                                                                                                                                str28 = str28;
                                                                                                                                                                str12 = str12;
                                                                                                                                                            } catch (JSONException unused22) {
                                                                                                                                                                str11 = str11;
                                                                                                                                                                str4113 = str15;
                                                                                                                                                                str417 = str417;
                                                                                                                                                                str419 = str14;
                                                                                                                                                                str27 = str27;
                                                                                                                                                                str28 = str28;
                                                                                                                                                                str12 = str12;
                                                                                                                                                                obj = null;
                                                                                                                                                                jSONArray4.put(jSONObject);
                                                                                                                                                                i25++;
                                                                                                                                                                jSONArray3 = jSONArray4;
                                                                                                                                                                obj15 = obj19;
                                                                                                                                                                obj16 = obj16;
                                                                                                                                                                obj = obj18;
                                                                                                                                                                str11 = str11;
                                                                                                                                                                str25 = str25;
                                                                                                                                                                str4113 = str4113;
                                                                                                                                                                str417 = str417;
                                                                                                                                                                str419 = str419;
                                                                                                                                                                str28 = str28;
                                                                                                                                                                str4111 = str4111;
                                                                                                                                                                str4112 = str4112;
                                                                                                                                                                obj14 = obj14;
                                                                                                                                                                obj11 = obj11;
                                                                                                                                                                str6 = str6;
                                                                                                                                                                str27 = str27;
                                                                                                                                                                str316 = str316;
                                                                                                                                                                str30 = str12;
                                                                                                                                                                str10 = str10;
                                                                                                                                                            }
                                                                                                                                                            str17 = this.f74o.get(i25).urdu_name_of_member;
                                                                                                                                                            String str610 = this.f74o.get(i25).gender;
                                                                                                                                                            str25 = str25;
                                                                                                                                                        } catch (JSONException unused23) {
                                                                                                                                                            str25 = str25;
                                                                                                                                                            str11 = str11;
                                                                                                                                                            str4113 = str15;
                                                                                                                                                            str417 = str417;
                                                                                                                                                            str419 = str14;
                                                                                                                                                            str27 = str27;
                                                                                                                                                            str28 = str28;
                                                                                                                                                            str12 = str12;
                                                                                                                                                            obj = null;
                                                                                                                                                            jSONArray4.put(jSONObject);
                                                                                                                                                            i25++;
                                                                                                                                                            jSONArray3 = jSONArray4;
                                                                                                                                                            obj15 = obj19;
                                                                                                                                                            obj16 = obj16;
                                                                                                                                                            obj = obj18;
                                                                                                                                                            str11 = str11;
                                                                                                                                                            str25 = str25;
                                                                                                                                                            str4113 = str4113;
                                                                                                                                                            str417 = str417;
                                                                                                                                                            str419 = str419;
                                                                                                                                                            str28 = str28;
                                                                                                                                                            str4111 = str4111;
                                                                                                                                                            str4112 = str4112;
                                                                                                                                                            obj14 = obj14;
                                                                                                                                                            obj11 = obj11;
                                                                                                                                                            str6 = str6;
                                                                                                                                                            str27 = str27;
                                                                                                                                                            str316 = str316;
                                                                                                                                                            str30 = str12;
                                                                                                                                                            str10 = str10;
                                                                                                                                                        }
                                                                                                                                                        jSONObject.put(str15, str4112);
                                                                                                                                                        jSONObject.put("mobile_network_name", this.f74o.get(i25).mobile_network_name);
                                                                                                                                                        jSONObject.put("mobile_no", this.f74o.get(i25).mobile_no);
                                                                                                                                                        jSONObject.put("banks_name", this.f74o.get(i25).banks_name);
                                                                                                                                                        jSONObject.put("branch_code", this.f74o.get(i25).branch_code);
                                                                                                                                                        jSONObject.put("bank_address", this.f74o.get(i25).bank_address);
                                                                                                                                                        jSONObject.put("account_title", this.f74o.get(i25).account_title);
                                                                                                                                                        jSONObject.put("account_number", this.f74o.get(i25).account_number);
                                                                                                                                                        jSONObject.put("isImmunized", this.f74o.get(i25).isImmunized);
                                                                                                                                                        jSONObject.put("height_of_child", this.f74o.get(i25).height_of_child);
                                                                                                                                                        jSONObject.put("weight_of_child", this.f74o.get(i25).weight_of_child);
                                                                                                                                                        jSONObject.put("RosterVaccinations", new JSONArray(this.f74o.get(i25).rosterVaccinationsJson));
                                                                                                                                                        beneficiaryEntityAd = appDatabaseL.m().ad(this.f74o.get(i25).cnic.replace(str10, BuildConfig.FLAVOR));
                                                                                                                                                        str16 = this.f74o.get(i25).name_of_member;
                                                                                                                                                        obj16 = obj16;
                                                                                                                                                    } catch (JSONException unused24) {
                                                                                                                                                        obj16 = obj16;
                                                                                                                                                    }
                                                                                                                                                    jSONObject.put(str4111, this.A.z());
                                                                                                                                                    str15 = str4113;
                                                                                                                                                    str4112 = str4112;
                                                                                                                                                } catch (JSONException unused25) {
                                                                                                                                                    obj16 = obj16;
                                                                                                                                                    str10 = str10;
                                                                                                                                                    str417 = str417;
                                                                                                                                                    str419 = str14;
                                                                                                                                                    str4113 = str4113;
                                                                                                                                                    str4112 = str4112;
                                                                                                                                                    str27 = str27;
                                                                                                                                                    str28 = str28;
                                                                                                                                                    str12 = str12;
                                                                                                                                                    str25 = str25;
                                                                                                                                                    str11 = str11;
                                                                                                                                                }
                                                                                                                                                jSONObject.put(str14, this.f74o.get(i25).end);
                                                                                                                                                str4111 = str4111;
                                                                                                                                            } catch (JSONException unused26) {
                                                                                                                                                str419 = str14;
                                                                                                                                                str11 = str11;
                                                                                                                                            }
                                                                                                                                            jSONObject.put("personStatus", 1);
                                                                                                                                            jSONObject.put("statusRemarks", BuildConfig.FLAVOR);
                                                                                                                                            jSONObject.put("disiblityCertificateNumber", BuildConfig.FLAVOR);
                                                                                                                                            str14 = str419;
                                                                                                                                        } catch (JSONException unused27) {
                                                                                                                                            obj16 = obj16;
                                                                                                                                            str10 = str10;
                                                                                                                                            str4112 = str4112;
                                                                                                                                            str4111 = str4111;
                                                                                                                                            str419 = str419;
                                                                                                                                            str27 = str27;
                                                                                                                                            str12 = str12;
                                                                                                                                            str25 = str25;
                                                                                                                                            str417 = str417;
                                                                                                                                            str28 = str28;
                                                                                                                                            str11 = str11;
                                                                                                                                        }
                                                                                                                                        jSONObject.put(str417, this.f74o.get(i25).surveyUuid);
                                                                                                                                    } catch (JSONException unused28) {
                                                                                                                                        str419 = str419;
                                                                                                                                    }
                                                                                                                                    if (BISPApplication.c().B()) {
                                                                                                                                        jSONObject.put(str11, obj16);
                                                                                                                                    } else {
                                                                                                                                        jSONObject.put(str11, obj17);
                                                                                                                                    }
                                                                                                                                    jSONObject.put("insertionTimestamp", this.f74o.get(i25).start);
                                                                                                                                    jSONObject.put(str25, BuildConfig.FLAVOR);
                                                                                                                                    str417 = str417;
                                                                                                                                } catch (JSONException unused29) {
                                                                                                                                    str10 = str10;
                                                                                                                                    str4112 = str4112;
                                                                                                                                    str4111 = str4111;
                                                                                                                                    str419 = str419;
                                                                                                                                    str27 = str27;
                                                                                                                                    str28 = str28;
                                                                                                                                    str12 = str12;
                                                                                                                                    str417 = str417;
                                                                                                                                    obj16 = obj16;
                                                                                                                                    str11 = str11;
                                                                                                                                    obj = null;
                                                                                                                                    jSONArray4.put(jSONObject);
                                                                                                                                    i25++;
                                                                                                                                    jSONArray3 = jSONArray4;
                                                                                                                                    obj15 = obj19;
                                                                                                                                    obj16 = obj16;
                                                                                                                                    obj = obj18;
                                                                                                                                    str11 = str11;
                                                                                                                                    str25 = str25;
                                                                                                                                    str4113 = str4113;
                                                                                                                                    str417 = str417;
                                                                                                                                    str419 = str419;
                                                                                                                                    str28 = str28;
                                                                                                                                    str4111 = str4111;
                                                                                                                                    str4112 = str4112;
                                                                                                                                    obj14 = obj14;
                                                                                                                                    obj11 = obj11;
                                                                                                                                    str6 = str6;
                                                                                                                                    str27 = str27;
                                                                                                                                    str316 = str316;
                                                                                                                                    str30 = str12;
                                                                                                                                    str10 = str10;
                                                                                                                                }
                                                                                                                            } catch (JSONException unused30) {
                                                                                                                                str10 = str10;
                                                                                                                                str27 = str27;
                                                                                                                                str28 = str28;
                                                                                                                                str12 = str52;
                                                                                                                                str417 = str417;
                                                                                                                                obj16 = obj16;
                                                                                                                                str11 = str11;
                                                                                                                                obj = null;
                                                                                                                                jSONArray4.put(jSONObject);
                                                                                                                                i25++;
                                                                                                                                jSONArray3 = jSONArray4;
                                                                                                                                obj15 = obj19;
                                                                                                                                obj16 = obj16;
                                                                                                                                obj = obj18;
                                                                                                                                str11 = str11;
                                                                                                                                str25 = str25;
                                                                                                                                str4113 = str4113;
                                                                                                                                str417 = str417;
                                                                                                                                str419 = str419;
                                                                                                                                str28 = str28;
                                                                                                                                str4111 = str4111;
                                                                                                                                str4112 = str4112;
                                                                                                                                obj14 = obj14;
                                                                                                                                obj11 = obj11;
                                                                                                                                str6 = str6;
                                                                                                                                str27 = str27;
                                                                                                                                str316 = str316;
                                                                                                                                str30 = str12;
                                                                                                                                str10 = str10;
                                                                                                                            }
                                                                                                                        } catch (JSONException unused31) {
                                                                                                                            str28 = str28;
                                                                                                                            str10 = str10;
                                                                                                                            str27 = str27;
                                                                                                                        }
                                                                                                                    } catch (JSONException unused32) {
                                                                                                                        str28 = str28;
                                                                                                                        str10 = str10;
                                                                                                                        str27 = str27;
                                                                                                                        str12 = str52;
                                                                                                                        str417 = str417;
                                                                                                                        obj16 = obj16;
                                                                                                                        str11 = str11;
                                                                                                                        obj = null;
                                                                                                                        jSONArray4.put(jSONObject);
                                                                                                                        i25++;
                                                                                                                        jSONArray3 = jSONArray4;
                                                                                                                        obj15 = obj19;
                                                                                                                        obj16 = obj16;
                                                                                                                        obj = obj18;
                                                                                                                        str11 = str11;
                                                                                                                        str25 = str25;
                                                                                                                        str4113 = str4113;
                                                                                                                        str417 = str417;
                                                                                                                        str419 = str419;
                                                                                                                        str28 = str28;
                                                                                                                        str4111 = str4111;
                                                                                                                        str4112 = str4112;
                                                                                                                        obj14 = obj14;
                                                                                                                        obj11 = obj11;
                                                                                                                        str6 = str6;
                                                                                                                        str27 = str27;
                                                                                                                        str316 = str316;
                                                                                                                        str30 = str12;
                                                                                                                        str10 = str10;
                                                                                                                    }
                                                                                                                } catch (JSONException unused33) {
                                                                                                                    str6 = str6;
                                                                                                                    str12 = str52;
                                                                                                                    str417 = str417;
                                                                                                                    obj16 = obj16;
                                                                                                                    str11 = str11;
                                                                                                                    obj = null;
                                                                                                                    jSONArray4.put(jSONObject);
                                                                                                                    i25++;
                                                                                                                    jSONArray3 = jSONArray4;
                                                                                                                    obj15 = obj19;
                                                                                                                    obj16 = obj16;
                                                                                                                    obj = obj18;
                                                                                                                    str11 = str11;
                                                                                                                    str25 = str25;
                                                                                                                    str4113 = str4113;
                                                                                                                    str417 = str417;
                                                                                                                    str419 = str419;
                                                                                                                    str28 = str28;
                                                                                                                    str4111 = str4111;
                                                                                                                    str4112 = str4112;
                                                                                                                    obj14 = obj14;
                                                                                                                    obj11 = obj11;
                                                                                                                    str6 = str6;
                                                                                                                    str27 = str27;
                                                                                                                    str316 = str316;
                                                                                                                    str30 = str12;
                                                                                                                    str10 = str10;
                                                                                                                }
                                                                                                            } catch (JSONException unused34) {
                                                                                                                obj11 = obj11;
                                                                                                            }
                                                                                                            obj = null;
                                                                                                            jSONArray4.put(jSONObject);
                                                                                                            i25++;
                                                                                                            jSONArray3 = jSONArray4;
                                                                                                            obj15 = obj19;
                                                                                                            obj16 = obj16;
                                                                                                            obj = obj18;
                                                                                                            str11 = str11;
                                                                                                            str25 = str25;
                                                                                                            str4113 = str4113;
                                                                                                            str417 = str417;
                                                                                                            str419 = str419;
                                                                                                            str28 = str28;
                                                                                                            str4111 = str4111;
                                                                                                            str4112 = str4112;
                                                                                                            obj14 = obj14;
                                                                                                            obj11 = obj11;
                                                                                                            str6 = str6;
                                                                                                            str27 = str27;
                                                                                                            str316 = str316;
                                                                                                            str30 = str12;
                                                                                                            str10 = str10;
                                                                                                        } else {
                                                                                                            str28 = str28;
                                                                                                            str10 = str10;
                                                                                                            str27 = str27;
                                                                                                            obj11 = obj11;
                                                                                                            str6 = str6;
                                                                                                            str4112 = str4112;
                                                                                                            str4111 = str4111;
                                                                                                            str419 = str419;
                                                                                                            str25 = str25;
                                                                                                            str12 = str52;
                                                                                                            str417 = str417;
                                                                                                            str4113 = str4113;
                                                                                                            obj16 = obj16;
                                                                                                            str11 = str11;
                                                                                                            try {
                                                                                                                obj = null;
                                                                                                                try {
                                                                                                                    Toast.makeText(this.m, "Relation Data not set", 0).show();
                                                                                                                    return Boolean.FALSE;
                                                                                                                } catch (JSONException unused35) {
                                                                                                                    jSONArray4.put(jSONObject);
                                                                                                                    i25++;
                                                                                                                    jSONArray3 = jSONArray4;
                                                                                                                    obj15 = obj19;
                                                                                                                    obj16 = obj16;
                                                                                                                    obj = obj18;
                                                                                                                    str11 = str11;
                                                                                                                    str25 = str25;
                                                                                                                    str4113 = str4113;
                                                                                                                    str417 = str417;
                                                                                                                    str419 = str419;
                                                                                                                    str28 = str28;
                                                                                                                    str4111 = str4111;
                                                                                                                    str4112 = str4112;
                                                                                                                    obj14 = obj14;
                                                                                                                    obj11 = obj11;
                                                                                                                    str6 = str6;
                                                                                                                    str27 = str27;
                                                                                                                    str316 = str316;
                                                                                                                    str30 = str12;
                                                                                                                    str10 = str10;
                                                                                                                }
                                                                                                            } catch (JSONException unused36) {
                                                                                                                obj = null;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (JSONException unused37) {
                                                                                                        str28 = str28;
                                                                                                        str10 = str10;
                                                                                                        str27 = str27;
                                                                                                        obj11 = obj11;
                                                                                                        str6 = str6;
                                                                                                        obj = null;
                                                                                                        str12 = str52;
                                                                                                    }
                                                                                                } catch (JSONException unused38) {
                                                                                                    str28 = str28;
                                                                                                    str10 = str10;
                                                                                                    str27 = str27;
                                                                                                    obj11 = obj11;
                                                                                                    str6 = str6;
                                                                                                    obj = null;
                                                                                                    str12 = str52;
                                                                                                }
                                                                                            } catch (JSONException unused39) {
                                                                                                str10 = str10;
                                                                                                str318 = str54;
                                                                                                obj11 = obj11;
                                                                                                str6 = str6;
                                                                                                obj = null;
                                                                                                str12 = str52;
                                                                                                str28 = str28;
                                                                                                str27 = str27;
                                                                                            }
                                                                                        } catch (JSONException unused40) {
                                                                                            str317 = str53;
                                                                                            obj11 = obj11;
                                                                                            str6 = str6;
                                                                                            obj = null;
                                                                                            str12 = str52;
                                                                                            str28 = str28;
                                                                                            str27 = str27;
                                                                                            str417 = str417;
                                                                                            str4113 = str4113;
                                                                                            obj16 = obj16;
                                                                                            str11 = str11;
                                                                                            jSONArray4.put(jSONObject);
                                                                                            i25++;
                                                                                            jSONArray3 = jSONArray4;
                                                                                            obj15 = obj19;
                                                                                            obj16 = obj16;
                                                                                            obj = obj18;
                                                                                            str11 = str11;
                                                                                            str25 = str25;
                                                                                            str4113 = str4113;
                                                                                            str417 = str417;
                                                                                            str419 = str419;
                                                                                            str28 = str28;
                                                                                            str4111 = str4111;
                                                                                            str4112 = str4112;
                                                                                            obj14 = obj14;
                                                                                            obj11 = obj11;
                                                                                            str6 = str6;
                                                                                            str27 = str27;
                                                                                            str316 = str316;
                                                                                            str30 = str12;
                                                                                            str10 = str10;
                                                                                        }
                                                                                    } catch (JSONException unused41) {
                                                                                        obj14 = obj14;
                                                                                    }
                                                                                } catch (JSONException unused42) {
                                                                                    str10 = str10;
                                                                                    obj19 = obj15;
                                                                                    obj11 = obj11;
                                                                                    str6 = str6;
                                                                                    str4112 = str4112;
                                                                                    str4111 = str4111;
                                                                                    str419 = str419;
                                                                                    obj = null;
                                                                                    str25 = str25;
                                                                                    str12 = str52;
                                                                                    str417 = str417;
                                                                                    str4113 = str4113;
                                                                                    obj16 = obj16;
                                                                                    str11 = str11;
                                                                                    Object obj27 = obj14;
                                                                                    str28 = str28;
                                                                                    str27 = str27;
                                                                                    obj14 = obj27;
                                                                                }
                                                                            } catch (JSONException unused43) {
                                                                                obj = null;
                                                                                str12 = str52;
                                                                                obj19 = obj15;
                                                                                jSONArray4.put(jSONObject);
                                                                                i25++;
                                                                                jSONArray3 = jSONArray4;
                                                                                obj15 = obj19;
                                                                                obj16 = obj16;
                                                                                obj = obj18;
                                                                                str11 = str11;
                                                                                str25 = str25;
                                                                                str4113 = str4113;
                                                                                str417 = str417;
                                                                                str419 = str419;
                                                                                str28 = str28;
                                                                                str4111 = str4111;
                                                                                str4112 = str4112;
                                                                                obj14 = obj14;
                                                                                obj11 = obj11;
                                                                                str6 = str6;
                                                                                str27 = str27;
                                                                                str316 = str316;
                                                                                str30 = str12;
                                                                                str10 = str10;
                                                                            }
                                                                        } catch (JSONException unused44) {
                                                                            str9 = str51;
                                                                            str12 = str30;
                                                                            obj = null;
                                                                            obj19 = obj15;
                                                                            jSONArray4.put(jSONObject);
                                                                            i25++;
                                                                            jSONArray3 = jSONArray4;
                                                                            obj15 = obj19;
                                                                            obj16 = obj16;
                                                                            obj = obj18;
                                                                            str11 = str11;
                                                                            str25 = str25;
                                                                            str4113 = str4113;
                                                                            str417 = str417;
                                                                            str419 = str419;
                                                                            str28 = str28;
                                                                            str4111 = str4111;
                                                                            str4112 = str4112;
                                                                            obj14 = obj14;
                                                                            obj11 = obj11;
                                                                            str6 = str6;
                                                                            str27 = str27;
                                                                            str316 = str316;
                                                                            str30 = str12;
                                                                            str10 = str10;
                                                                        }
                                                                    } catch (JSONException unused45) {
                                                                    }
                                                                } catch (JSONException unused46) {
                                                                    obj18 = obj;
                                                                }
                                                            } catch (Exception unused47) {
                                                                obj = null;
                                                            }
                                                        }
                                                        JSONArray jSONArray5 = jSONArray3;
                                                        obj = null;
                                                        this.s.put("HouseHoldRosterData", jSONArray5);
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        JSONArray jSONArray6 = new JSONArray();
                                                        JSONArray jSONArray7 = new JSONArray();
                                                        new JSONObject();
                                                        JSONArray jSONArray8 = new JSONArray();
                                                        try {
                                                            List listV = appDatabaseL.m().V();
                                                            List listAr = appDatabaseL.m().ar();
                                                            List listQ = appDatabaseL.m().Q();
                                                            c2 = c3;
                                                            try {
                                                                jSONArray = new JSONArray(c2.k(listV));
                                                                try {
                                                                    jSONArray2 = new JSONArray(c2.k(listAr));
                                                                    try {
                                                                        new JSONObject(c2.k(new RespondantNic(this.C)));
                                                                        if (listQ != null && !listQ.isEmpty()) {
                                                                            jSONArray8 = new JSONArray(c2.k(listQ));
                                                                        }
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        jSONArray7 = jSONArray2;
                                                                        jSONArray6 = jSONArray;
                                                                        try {
                                                                            Log.e("JSON_CONVERSION", "Error converting Room data to JSONArray", e);
                                                                            jSONArray = jSONArray6;
                                                                            jSONArray2 = jSONArray7;
                                                                        } catch (Exception unused48) {
                                                                        }
                                                                    }
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            c2 = c3;
                                                        }
                                                        jSONObject2.put("familyNadraData", jSONArray);
                                                        jSONObject2.put("individualNadraData", jSONArray2);
                                                        jSONObject2.put("individualNadraDataWithRelation", jSONArray8);
                                                        jSONObject2.put("rosterDataSetByTablet", jSONArray5);
                                                        jSONObject2.put("respondantNic", this.C);
                                                        TabletLogEntity tabletLogEntity = new TabletLogEntity();
                                                        tabletLogEntity.tabletLogJson = jSONObject2.toString();
                                                        appDatabaseL.m().bm(tabletLogEntity);
                                                    } catch (Exception unused49) {
                                                        c2 = c3;
                                                        obj = null;
                                                    }
                                                } else {
                                                    c2 = c3;
                                                    obj = null;
                                                }
                                                Objects.requireNonNull(c2.k(this.l));
                                            } catch (Exception unused50) {
                                                ProgressDialog progressDialog2 = this.h;
                                                if (progressDialog2 != null && progressDialog2.isShowing()) {
                                                    this.h.dismiss();
                                                }
                                                return Boolean.FALSE;
                                            }
                                        }
                                        str7 = str3110;
                                        this.s.put(str7, this.A.c());
                                        String str3115 = str7;
                                        this.s.put("agriJson", this.l.agriJson);
                                        this.s.put("agriTypeOption", this.l.agriTypeOption);
                                        this.s.put("agriTypeOptionId", this.l.agriTypeOptionId);
                                        this.s.put("batchId", BuildConfig.FLAVOR);
                                        this.s.put("userId", this.A.y());
                                        this.s.put("firmId", bISPApplication.s());
                                        str8 = string2;
                                        this.s.put("startDatetime", str8);
                                        this.s.put("endDatetime", str29);
                                        String str3116 = str29;
                                        this.s.put("startTimeGps", this.l.startTimeGPS);
                                        this.s.put("endTimeGps", this.l.endTimeGPS);
                                        this.s.put("enumeratorImei", this.l.imei_number);
                                        this.s.put("enuName", this.l.enumerator_name);
                                        i4 = 0;
                                        while (true) {
                                            str9 = "cnic";
                                            str10 = "-";
                                            if (i4 < this.f74o.size()) {
                                                break;
                                                break;
                                            }
                                            String str3117 = str8;
                                            if (this.f74o.get(i4).relation_to_household_id == 186) {
                                                this.s.put("HhName", this.f74o.get(i4).name_of_member);
                                                this.s.put("cnic", this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                                                this.C = this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR);
                                            }
                                            i4++;
                                            str8 = str3117;
                                            str23 = str23;
                                        }
                                        String str3118 = str23;
                                        String str4114 = str8;
                                        this.s.put("submissionDate", this.l.date);
                                        this.s.put("completeForm", this.l.complete_form);
                                        this.s.put("enuNumber", bISPApplication.t());
                                        this.s.put("interviewStatusId", ivas.gov.bisp.enumeration.bK.ag.n);
                                        this.s.put("enumeratorVerified", BuildConfig.FLAVOR);
                                        this.s.put("validationPercentage", this.l.validation_percentage);
                                        this.s.put("formNo", BuildConfig.FLAVOR);
                                        if (this.A.t().toLowerCase().equals(obj11)) {
                                            this.s.put("oldFormNumber", this.A.j());
                                            i5 = d + 55;
                                            c = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                int i111 = 5 % 4;
                                            }
                                        } else {
                                            this.s.put("oldFormNumber", this.A.j());
                                            i5 = d + 55;
                                            c = i5 % 128;
                                            if (i5 % 2 != 0) {
                                                int i112 = 5 % 4;
                                            }
                                        }
                                        this.s.put("resurvey_status", this.A.t());
                                        this.s.put("apkType", bISPApplication.i());
                                        this.s.put("formNoNotAtHome", BuildConfig.FLAVOR);
                                        this.s.put("uuid", this.l.uuid);
                                        this.s.put("comments", this.l.comments);
                                        this.s.put("isRecollected", bISPApplication.y());
                                        this.s.put("uniqueId", this.l.uniqueID);
                                        this.s.put("isNewSurvey", this.l.isNewSurvey);
                                        this.s.put("isDuplicate", BuildConfig.FLAVOR);
                                        this.s.put("interviewStatusReason", BuildConfig.FLAVOR);
                                        this.s.put("locationAccuracy", this.l.locationAccuracy);
                                        this.s.put("contactDetailStart", this.l.contactDetailStart);
                                        this.s.put("contactDetailEnd", this.l.contactDetailEnd);
                                        this.s.put("diffContactDetail", this.l.diffContactDetail);
                                        this.s.put("householdStart", this.l.householdStart);
                                        this.s.put("householdEnd", this.l.householdEnd);
                                        this.s.put("diffHousehold", this.l.diffHousehold);
                                        this.s.put("miscellaneousStart", this.l.miscellaneousStart);
                                        this.s.put("miscellaneousEnd", this.l.miscellaneousEnd);
                                        this.s.put("diffMiscellaneous", this.l.diffMiscellaneous);
                                        this.s.put(str3118, this.l.date);
                                        this.s.put("startDatetimePick", str4114);
                                        this.s.put("origFormNo", this.l.form_no);
                                        this.s.put("isResurveyCorrected", BuildConfig.FLAVOR);
                                        this.s.put("isOverrideDiscrepant", BuildConfig.FLAVOR);
                                        this.s.put("isDeleted", BuildConfig.FLAVOR);
                                        this.s.put("saLongitude", this.l.longitude);
                                        this.s.put("saLongitude", this.l.latitude);
                                        this.s.put("isPmtReady", 1);
                                        if (this.A.l().intValue() != 2) {
                                            str11 = str4;
                                            obj16 = obj13;
                                            if (BISPApplication.c().B()) {
                                                obj17 = obj12;
                                                this.s.put(str11, obj17);
                                            } else {
                                                obj17 = obj12;
                                                this.s.put(str11, obj16);
                                            }
                                        } else {
                                            str11 = str4;
                                            obj16 = obj13;
                                            if (BISPApplication.c().B()) {
                                                obj17 = obj12;
                                                this.s.put(str11, obj17);
                                            } else {
                                                obj17 = obj12;
                                                this.s.put(str11, obj16);
                                            }
                                        }
                                        String str4115 = "uuid";
                                        String str4116 = str24;
                                        this.s.put(str4116, str3116);
                                        String str4117 = str4116;
                                        String str4118 = str26;
                                        this.s.put(str4118, this.A.z());
                                        String str4119 = str4118;
                                        this.s.put("endByIp", strH);
                                        String str41110 = strH;
                                        String str41111 = "endByIp";
                                        this.s.put("isSingleStory", bISPApplication.z());
                                        this.s.put("isCompound", bISPApplication.w());
                                        string = ((j) this.A.h(this.m)).getString("shock_json", BuildConfig.FLAVOR);
                                        if (string.equals(BuildConfig.FLAVOR)) {
                                            this.s.put("SurveyDisasterData", new JSONObject(string));
                                            this.s.put("isDisaster", 1);
                                        } else {
                                            this.s.put("SurveyDisasterData", BuildConfig.FLAVOR);
                                            obj4 = null;
                                            this.s.put("isDisaster", 0);
                                        }
                                        this.s.put("data_collection_modality", this.l.data_collection_modality);
                                        strG = ivas.gov.bisp.enumeration.dj.C.g(this.m, this.A, this.h);
                                        if (strG != null) {
                                        }
                                        progressDialog = this.h;
                                        if (progressDialog != null) {
                                            this.h.dismiss();
                                        }
                                        return Boolean.FALSE;
                                    }
                                    obj12 = obj10;
                                    obj13 = obj5;
                                    str4 = str3;
                                    obj14 = obj2;
                                    str5 = str319;
                                    this.v.put(str5, this.A.c());
                                    String str3119 = str5;
                                    this.v.put("willingForFinancialAsst", this.l.financial_assistance);
                                    this.v.put("isMigratedForEconomicActivities", this.l.migration);
                                    this.v.put("isInfantDeath", this.l.infant_death);
                                    this.v.put("isInfantBirth", this.l.infant_birth);
                                    this.v.put("howResolvePersonalDisputes", this.l.resolve_complaint);
                                    this.v.put("howResolveComplaintsAgainstStateDept", this.l.resolve_complaint);
                                    this.v.put("levelOfSatisfiactionWithStateJustice", this.l.satisfaction_level);
                                    this.v.put("takenLoan", this.l.taken_loan);
                                    this.v.put("monthlyIncome", this.l.monthly_income);
                                    this.v.put("defenceJob", this.l.defence_job);
                                    this.v.put("formNo", BuildConfig.FLAVOR);
                                    this.v.put("uuid", this.l.uuid);
                                    this.v.put("uniqueId", this.l.uniqueID);
                                    this.v.put("createdDatetime", this.l.date);
                                    this.v.put("endDate", str29);
                                    this.v.put("endBy", this.A.z());
                                    this.v.put("endByIp", strH);
                                    this.v.put("financialDifficulties", bISPApplication.l());
                                    this.v.put("poorEducationQuality", bISPApplication.q());
                                    this.v.put("childLabor", bISPApplication.k());
                                    this.v.put("childHealth", bISPApplication.j());
                                    this.v.put("notWillingToStudy", bISPApplication.m());
                                    if (this.A.t().toLowerCase().equals(obj11)) {
                                        obj15 = obj9;
                                        str6 = str;
                                        str7 = str3119;
                                        this.s.put(str7, this.A.c());
                                    } else {
                                        obj15 = obj9;
                                        str6 = str;
                                        str7 = str3119;
                                        this.s.put(str7, this.A.c());
                                    }
                                    String str31110 = str7;
                                    this.s.put("agriJson", this.l.agriJson);
                                    this.s.put("agriTypeOption", this.l.agriTypeOption);
                                    this.s.put("agriTypeOptionId", this.l.agriTypeOptionId);
                                    this.s.put("batchId", BuildConfig.FLAVOR);
                                    this.s.put("userId", this.A.y());
                                    this.s.put("firmId", bISPApplication.s());
                                    str8 = string2;
                                    this.s.put("startDatetime", str8);
                                    this.s.put("endDatetime", str29);
                                    String str31111 = str29;
                                    this.s.put("startTimeGps", this.l.startTimeGPS);
                                    this.s.put("endTimeGps", this.l.endTimeGPS);
                                    this.s.put("enumeratorImei", this.l.imei_number);
                                    this.s.put("enuName", this.l.enumerator_name);
                                    i4 = 0;
                                    while (true) {
                                        str9 = "cnic";
                                        str10 = "-";
                                        if (i4 < this.f74o.size()) {
                                            break;
                                            break;
                                        }
                                        String str31112 = str8;
                                        if (this.f74o.get(i4).relation_to_household_id == 186) {
                                            this.s.put("HhName", this.f74o.get(i4).name_of_member);
                                            this.s.put("cnic", this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                                            this.C = this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR);
                                        }
                                        i4++;
                                        str8 = str31112;
                                        str23 = str23;
                                    }
                                    String str31113 = str23;
                                    String str41112 = str8;
                                    this.s.put("submissionDate", this.l.date);
                                    this.s.put("completeForm", this.l.complete_form);
                                    this.s.put("enuNumber", bISPApplication.t());
                                    this.s.put("interviewStatusId", ivas.gov.bisp.enumeration.bK.ag.n);
                                    this.s.put("enumeratorVerified", BuildConfig.FLAVOR);
                                    this.s.put("validationPercentage", this.l.validation_percentage);
                                    this.s.put("formNo", BuildConfig.FLAVOR);
                                    if (this.A.t().toLowerCase().equals(obj11)) {
                                        this.s.put("oldFormNumber", this.A.j());
                                        i5 = d + 55;
                                        c = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            int i113 = 5 % 4;
                                        }
                                    } else {
                                        this.s.put("oldFormNumber", this.A.j());
                                        i5 = d + 55;
                                        c = i5 % 128;
                                        if (i5 % 2 != 0) {
                                            int i114 = 5 % 4;
                                        }
                                    }
                                    this.s.put("resurvey_status", this.A.t());
                                    this.s.put("apkType", bISPApplication.i());
                                    this.s.put("formNoNotAtHome", BuildConfig.FLAVOR);
                                    this.s.put("uuid", this.l.uuid);
                                    this.s.put("comments", this.l.comments);
                                    this.s.put("isRecollected", bISPApplication.y());
                                    this.s.put("uniqueId", this.l.uniqueID);
                                    this.s.put("isNewSurvey", this.l.isNewSurvey);
                                    this.s.put("isDuplicate", BuildConfig.FLAVOR);
                                    this.s.put("interviewStatusReason", BuildConfig.FLAVOR);
                                    this.s.put("locationAccuracy", this.l.locationAccuracy);
                                    this.s.put("contactDetailStart", this.l.contactDetailStart);
                                    this.s.put("contactDetailEnd", this.l.contactDetailEnd);
                                    this.s.put("diffContactDetail", this.l.diffContactDetail);
                                    this.s.put("householdStart", this.l.householdStart);
                                    this.s.put("householdEnd", this.l.householdEnd);
                                    this.s.put("diffHousehold", this.l.diffHousehold);
                                    this.s.put("miscellaneousStart", this.l.miscellaneousStart);
                                    this.s.put("miscellaneousEnd", this.l.miscellaneousEnd);
                                    this.s.put("diffMiscellaneous", this.l.diffMiscellaneous);
                                    this.s.put(str31113, this.l.date);
                                    this.s.put("startDatetimePick", str41112);
                                    this.s.put("origFormNo", this.l.form_no);
                                    this.s.put("isResurveyCorrected", BuildConfig.FLAVOR);
                                    this.s.put("isOverrideDiscrepant", BuildConfig.FLAVOR);
                                    this.s.put("isDeleted", BuildConfig.FLAVOR);
                                    this.s.put("saLongitude", this.l.longitude);
                                    this.s.put("saLongitude", this.l.latitude);
                                    this.s.put("isPmtReady", 1);
                                    if (this.A.l().intValue() != 2) {
                                        str11 = str4;
                                        obj16 = obj13;
                                        if (BISPApplication.c().B()) {
                                            obj17 = obj12;
                                            this.s.put(str11, obj17);
                                        } else {
                                            obj17 = obj12;
                                            this.s.put(str11, obj16);
                                        }
                                    } else {
                                        str11 = str4;
                                        obj16 = obj13;
                                        if (BISPApplication.c().B()) {
                                            obj17 = obj12;
                                            this.s.put(str11, obj17);
                                        } else {
                                            obj17 = obj12;
                                            this.s.put(str11, obj16);
                                        }
                                    }
                                    String str41113 = "uuid";
                                    String str41114 = str24;
                                    this.s.put(str41114, str31111);
                                    String str41115 = str41114;
                                    String str41116 = str26;
                                    this.s.put(str41116, this.A.z());
                                    String str41117 = str41116;
                                    this.s.put("endByIp", strH);
                                    String str41118 = strH;
                                    String str41119 = "endByIp";
                                    this.s.put("isSingleStory", bISPApplication.z());
                                    this.s.put("isCompound", bISPApplication.w());
                                    string = ((j) this.A.h(this.m)).getString("shock_json", BuildConfig.FLAVOR);
                                    if (string.equals(BuildConfig.FLAVOR)) {
                                        this.s.put("SurveyDisasterData", new JSONObject(string));
                                        this.s.put("isDisaster", 1);
                                    } else {
                                        this.s.put("SurveyDisasterData", BuildConfig.FLAVOR);
                                        obj4 = null;
                                        this.s.put("isDisaster", 0);
                                    }
                                    this.s.put("data_collection_modality", this.l.data_collection_modality);
                                    strG = ivas.gov.bisp.enumeration.dj.C.g(this.m, this.A, this.h);
                                    if (strG != null) {
                                    }
                                    progressDialog = this.h;
                                    if (progressDialog != null) {
                                        this.h.dismiss();
                                    }
                                    return Boolean.FALSE;
                                }
                                obj9 = "duplicate";
                            } else {
                                str = "resurvey";
                                obj8 = "expire_2";
                                obj = "expire_3";
                                obj9 = "duplicate";
                            }
                            if (strG != null) {
                            }
                            progressDialog = this.h;
                            if (progressDialog != null) {
                                this.h.dismiss();
                            }
                            return Boolean.FALSE;
                        } catch (Exception unused51) {
                        }
                        this.u.put(str2, this.A.c());
                        String str3120 = str2;
                        this.u.put("householdHeadId", (Object) null);
                        this.u.put("presentOccupancyStatus", this.l.occupacy_status_code);
                        this.u.put("presentOccupancyStatusStatus", this.l.occupacy_status);
                        this.u.put("wallMaterialUsed", this.l.wall_material_code);
                        this.u.put("wallMaterialUsedStatus", this.l.wall_material_status);
                        this.u.put("roofMaterialUsed", this.l.roof_material_code);
                        this.u.put("roofMaterialUsedStatus", this.l.roof_material_status);
                        this.u.put("householdRooms", this.l.number_of_rooms);
                        this.u.put("cookingFuelUsed", this.l.cooking_fuel_code);
                        this.u.put("cookingFuelUsedStatus", this.l.cooking_fuel_status);
                        this.u.put("toiletUsed", this.l.toilet_code);
                        this.u.put("toiletUsedStatus", this.l.toilet_status);
                        this.u.put("sourceOfDrinkingWater", this.l.drinking_water_code);
                        this.u.put("sourceOfDrinkingWaterStatus", this.l.drinking_water_status);
                        this.u.put("hasElectricityConnection", this.l.electricity_code);
                        this.u.put("hasElectricityConnectionStatus", this.l.electricity_status);
                        this.u.put("hasGasConnection", this.l.gas_code);
                        this.u.put("hasGasConnectionStatus", this.l.gas_status);
                        this.u.put("hasPhoneConnection", this.l.landline_code);
                        this.u.put("hasPhoneConnectionStatus", this.l.landline_status);
                        this.u.put("isMultiStory", bISPApplication.x());
                        this.u.put("isSingleStory", bISPApplication.z());
                        this.u.put("isCompound", bISPApplication.w());
                        this.u.put("ownAnyLivestock", this.l.animal);
                        if (this.l.animal == 1) {
                            i6 = c + 17;
                            d = i6 % 128;
                            if (i6 % 2 != 0) {
                                this.u.put("ownAnyLivestockStatus", "yes");
                                Object obj28 = null;
                                obj28.hashCode();
                                throw null;
                            }
                            this.u.put("ownAnyLivestockStatus", "yes");
                        } else {
                            this.u.put("ownAnyLivestockStatus", "no");
                        }
                        this.u.put("noOfBuffalo", this.l.buffalo);
                        this.u.put("noOfBuffaloStatus", BuildConfig.FLAVOR);
                        this.u.put("noOfCowCattle", this.l.cow);
                        this.u.put("noOfCowCattleStatus", BuildConfig.FLAVOR);
                        this.u.put("noOfGoatSheep", this.l.goat);
                        this.u.put("noOfGoatSheepStatus", BuildConfig.FLAVOR);
                        this.u.put("noOfHorseDonkey", this.l.horse);
                        this.u.put("noOfHorseDonkeyStatus", BuildConfig.FLAVOR);
                        this.u.put("noOfCamel", this.l.camel);
                        this.u.put("noOfCamelStatus", BuildConfig.FLAVOR);
                        this.u.put("isOwnAgriculturalLand", this.l.household_agriculture_land);
                        this.u.put("isOwnAgriculturalLandStatus", BuildConfig.FLAVOR);
                        this.u.put("howMuchLandOwned", this.l.land_number);
                        this.u.put("howMuchLandOwnedStatus", this.l.land_unit_status);
                        this.u.put("unitOfLand", this.l.land_unit_code);
                        this.u.put("unitOfLandStatus", this.l.land_unit_status);
                        this.u.put("hasHeater", this.l.heater);
                        this.u.put("hasHeaterStatus", BuildConfig.FLAVOR);
                        this.u.put("hasWashingMachine", this.l.washing_machine);
                        this.u.put("hasWashingMachineStatus", BuildConfig.FLAVOR);
                        this.u.put("hasGeyser", this.l.geyser);
                        this.u.put("hasGeyserStatus", BuildConfig.FLAVOR);
                        this.u.put("hasAircooler", this.l.air_cooler);
                        this.u.put("hasAircoolerStatus", BuildConfig.FLAVOR);
                        this.u.put("hasAirConditioner", this.l.air_conditioner);
                        this.u.put("hasAirConditionerStatus", BuildConfig.FLAVOR);
                        this.u.put("hasFan", this.l.fan);
                        this.u.put("hasFanStatus", BuildConfig.FLAVOR);
                        this.u.put("hasCookingRange", this.l.cooking_range);
                        this.u.put("hasCookingRangeStatus", BuildConfig.FLAVOR);
                        this.u.put("hasCookingStove", this.l.cooking_stove);
                        this.u.put("hasCookingStoveStatus", BuildConfig.FLAVOR);
                        this.u.put("hasTv", this.l.tv);
                        this.u.put("hasTvStatus", BuildConfig.FLAVOR);
                        this.u.put("hasVideoPlayer", this.l.vcr);
                        this.u.put("hasVideoPlayerStatus", BuildConfig.FLAVOR);
                        this.u.put("hasRefrigerator", this.l.refrigerator);
                        this.u.put("hasRefrigeratorStatus", BuildConfig.FLAVOR);
                        this.u.put("hasFreezer", this.l.freezer);
                        this.u.put("hasFreezerStatus", BuildConfig.FLAVOR);
                        this.u.put("hasGeneratorUps", this.l.generator);
                        this.u.put("hasGeneratorUpsStatus", BuildConfig.FLAVOR);
                        this.u.put("hasSewingMachine", this.l.sewing);
                        this.u.put("hasSewingMachineStatus", BuildConfig.FLAVOR);
                        this.u.put("hasPersonalComputer", this.l.computer);
                        this.u.put("hasPersonalComputerStatus", BuildConfig.FLAVOR);
                        this.u.put("hasMotorcycle", this.l.motorcycle);
                        this.u.put("hasMotorcycleStatus", BuildConfig.FLAVOR);
                        this.u.put("hasTractor", this.l.tractor);
                        this.u.put("hasTractorStatus", BuildConfig.FLAVOR);
                        this.u.put("hasVehicle", this.l.car);
                        this.u.put("hasVehicleStatus", BuildConfig.FLAVOR);
                        this.u.put("hasPhone", this.l.mobile);
                        this.u.put("hasPhoneStatus", BuildConfig.FLAVOR);
                        this.u.put("hasInternet", this.l.internet);
                        this.u.put("hasInternetStatus", BuildConfig.FLAVOR);
                        this.u.put("hasMobileInternet", this.l.m_internet);
                        this.u.put("hasMobileInternetStatus", BuildConfig.FLAVOR);
                        this.u.put("electricityMeter", bISPApplication.r());
                        this.u.put("gasMeter", bISPApplication.u());
                        this.u.put("formNo", BuildConfig.FLAVOR);
                        this.u.put("uuid", this.l.uuid);
                        this.u.put("uniqueId", this.l.uniqueID);
                        this.u.put("createdDatetime", this.l.date);
                        this.u.put("endDate", str29);
                        this.u.put("endBy", this.A.z());
                        this.u.put("endByIp", strH);
                        this.u.put("hyderralIndividual", bISPApplication.n());
                        this.u.put("hyderralSocial", bISPApplication.o());
                        this.u.put("hyderralSolar", bISPApplication.g());
                        this.u.put("hyderralWind", bISPApplication.p());
                        if (this.A.l().intValue() == 2) {
                            if (BISPApplication.c().B()) {
                                obj10 = obj7;
                                this.v.put(str3, obj10);
                            } else {
                                obj10 = obj7;
                                this.v.put(str3, obj5);
                            }
                        } else if (BISPApplication.c().B()) {
                            obj10 = obj7;
                            this.v.put(str3, obj10);
                        } else {
                            obj10 = obj7;
                            this.v.put(str3, obj5);
                        }
                        obj11 = obj8;
                        if (!this.A.t().toLowerCase().equals(obj11)) {
                            obj12 = obj10;
                            obj13 = obj5;
                            str4 = str3;
                            obj14 = obj2;
                            str5 = str3120;
                            this.v.put(str5, this.A.c());
                        } else {
                            obj12 = obj10;
                            obj13 = obj5;
                            str4 = str3;
                            obj14 = obj2;
                            str5 = str3120;
                            this.v.put(str5, this.A.c());
                        }
                        String str31114 = str5;
                        this.v.put("willingForFinancialAsst", this.l.financial_assistance);
                        this.v.put("isMigratedForEconomicActivities", this.l.migration);
                        this.v.put("isInfantDeath", this.l.infant_death);
                        this.v.put("isInfantBirth", this.l.infant_birth);
                        this.v.put("howResolvePersonalDisputes", this.l.resolve_complaint);
                        this.v.put("howResolveComplaintsAgainstStateDept", this.l.resolve_complaint);
                        this.v.put("levelOfSatisfiactionWithStateJustice", this.l.satisfaction_level);
                        this.v.put("takenLoan", this.l.taken_loan);
                        this.v.put("monthlyIncome", this.l.monthly_income);
                        this.v.put("defenceJob", this.l.defence_job);
                        this.v.put("formNo", BuildConfig.FLAVOR);
                        this.v.put("uuid", this.l.uuid);
                        this.v.put("uniqueId", this.l.uniqueID);
                        this.v.put("createdDatetime", this.l.date);
                        this.v.put("endDate", str29);
                        this.v.put("endBy", this.A.z());
                        this.v.put("endByIp", strH);
                        this.v.put("financialDifficulties", bISPApplication.l());
                        this.v.put("poorEducationQuality", bISPApplication.q());
                        this.v.put("childLabor", bISPApplication.k());
                        this.v.put("childHealth", bISPApplication.j());
                        this.v.put("notWillingToStudy", bISPApplication.m());
                        if (this.A.t().toLowerCase().equals(obj11)) {
                            obj15 = obj9;
                            str6 = str;
                            str7 = str31114;
                            this.s.put(str7, this.A.c());
                        } else {
                            obj15 = obj9;
                            str6 = str;
                            str7 = str31114;
                            this.s.put(str7, this.A.c());
                        }
                        String str31115 = str7;
                        this.s.put("agriJson", this.l.agriJson);
                        this.s.put("agriTypeOption", this.l.agriTypeOption);
                        this.s.put("agriTypeOptionId", this.l.agriTypeOptionId);
                        this.s.put("batchId", BuildConfig.FLAVOR);
                        this.s.put("userId", this.A.y());
                        this.s.put("firmId", bISPApplication.s());
                        str8 = string2;
                        this.s.put("startDatetime", str8);
                        this.s.put("endDatetime", str29);
                        String str31116 = str29;
                        this.s.put("startTimeGps", this.l.startTimeGPS);
                        this.s.put("endTimeGps", this.l.endTimeGPS);
                        this.s.put("enumeratorImei", this.l.imei_number);
                        this.s.put("enuName", this.l.enumerator_name);
                        i4 = 0;
                        while (true) {
                            str9 = "cnic";
                            str10 = "-";
                            if (i4 < this.f74o.size()) {
                                break;
                                break;
                            }
                            String str31117 = str8;
                            if (this.f74o.get(i4).relation_to_household_id == 186) {
                                this.s.put("HhName", this.f74o.get(i4).name_of_member);
                                this.s.put("cnic", this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR));
                                this.C = this.f74o.get(i4).cnic.replaceAll("-", BuildConfig.FLAVOR);
                            }
                            i4++;
                            str8 = str31117;
                            str23 = str23;
                        }
                        String str31118 = str23;
                        String str411110 = str8;
                        this.s.put("submissionDate", this.l.date);
                        this.s.put("completeForm", this.l.complete_form);
                        this.s.put("enuNumber", bISPApplication.t());
                        this.s.put("interviewStatusId", ivas.gov.bisp.enumeration.bK.ag.n);
                        this.s.put("enumeratorVerified", BuildConfig.FLAVOR);
                        this.s.put("validationPercentage", this.l.validation_percentage);
                        this.s.put("formNo", BuildConfig.FLAVOR);
                        if (this.A.t().toLowerCase().equals(obj11)) {
                            this.s.put("oldFormNumber", this.A.j());
                            i5 = d + 55;
                            c = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i115 = 5 % 4;
                            }
                        } else {
                            this.s.put("oldFormNumber", this.A.j());
                            i5 = d + 55;
                            c = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i116 = 5 % 4;
                            }
                        }
                        this.s.put("resurvey_status", this.A.t());
                        this.s.put("apkType", bISPApplication.i());
                        this.s.put("formNoNotAtHome", BuildConfig.FLAVOR);
                        this.s.put("uuid", this.l.uuid);
                        this.s.put("comments", this.l.comments);
                        this.s.put("isRecollected", bISPApplication.y());
                        this.s.put("uniqueId", this.l.uniqueID);
                        this.s.put("isNewSurvey", this.l.isNewSurvey);
                        this.s.put("isDuplicate", BuildConfig.FLAVOR);
                        this.s.put("interviewStatusReason", BuildConfig.FLAVOR);
                        this.s.put("locationAccuracy", this.l.locationAccuracy);
                        this.s.put("contactDetailStart", this.l.contactDetailStart);
                        this.s.put("contactDetailEnd", this.l.contactDetailEnd);
                        this.s.put("diffContactDetail", this.l.diffContactDetail);
                        this.s.put("householdStart", this.l.householdStart);
                        this.s.put("householdEnd", this.l.householdEnd);
                        this.s.put("diffHousehold", this.l.diffHousehold);
                        this.s.put("miscellaneousStart", this.l.miscellaneousStart);
                        this.s.put("miscellaneousEnd", this.l.miscellaneousEnd);
                        this.s.put("diffMiscellaneous", this.l.diffMiscellaneous);
                        this.s.put(str31118, this.l.date);
                        this.s.put("startDatetimePick", str411110);
                        this.s.put("origFormNo", this.l.form_no);
                        this.s.put("isResurveyCorrected", BuildConfig.FLAVOR);
                        this.s.put("isOverrideDiscrepant", BuildConfig.FLAVOR);
                        this.s.put("isDeleted", BuildConfig.FLAVOR);
                        this.s.put("saLongitude", this.l.longitude);
                        this.s.put("saLongitude", this.l.latitude);
                        this.s.put("isPmtReady", 1);
                        if (this.A.l().intValue() != 2) {
                            str11 = str4;
                            obj16 = obj13;
                            if (BISPApplication.c().B()) {
                                obj17 = obj12;
                                this.s.put(str11, obj17);
                            } else {
                                obj17 = obj12;
                                this.s.put(str11, obj16);
                            }
                        } else {
                            str11 = str4;
                            obj16 = obj13;
                            if (BISPApplication.c().B()) {
                                obj17 = obj12;
                                this.s.put(str11, obj17);
                            } else {
                                obj17 = obj12;
                                this.s.put(str11, obj16);
                            }
                        }
                        String str411111 = "uuid";
                        String str411112 = str24;
                        this.s.put(str411112, str31116);
                        String str411113 = str411112;
                        String str411114 = str26;
                        this.s.put(str411114, this.A.z());
                        String str411115 = str411114;
                        this.s.put("endByIp", strH);
                        String str411116 = strH;
                        String str411117 = "endByIp";
                        this.s.put("isSingleStory", bISPApplication.z());
                        this.s.put("isCompound", bISPApplication.w());
                        string = ((j) this.A.h(this.m)).getString("shock_json", BuildConfig.FLAVOR);
                        if (string.equals(BuildConfig.FLAVOR)) {
                            this.s.put("SurveyDisasterData", new JSONObject(string));
                            this.s.put("isDisaster", 1);
                        } else {
                            this.s.put("SurveyDisasterData", BuildConfig.FLAVOR);
                            obj4 = null;
                            this.s.put("isDisaster", 0);
                        }
                        this.s.put("data_collection_modality", this.l.data_collection_modality);
                        strG = ivas.gov.bisp.enumeration.dj.C.g(this.m, this.A, this.h);
                    } catch (Exception unused52) {
                        obj = obj4;
                    }
                } catch (Exception unused53) {
                    obj = obj3;
                }
            } catch (Exception unused54) {
                bISPApplication = bISPApplication2;
                obj = null;
                if (this.f74o != null) {
                    while (r11 < this.f74o.size()) {
                        this.f74o.get(r11).surveyFormNo = this.l.form_no;
                        this.f74o.get(r11).surveyUuid = this.l.uniqueID;
                        this.f74o.get(r11).surveyType = String.valueOf(i3);
                    }
                }
                if (!BISPApplication.d()) {
                    Objects.requireNonNull(bISPApplication);
                    throw null;
                }
                k(this.s.toString());
                ah ahVarC3 = ah.c();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(this.l.date);
                sb7.append(" ");
                sb7.append(this.l.time);
                ahVarC3.f("last_survey_loc_timestamp", sb7.toString());
                return Boolean.TRUE;
            }
        } catch (Exception unused55) {
            bISPApplication = bISPApplication2;
            i3 = i;
        }
        if (this.f74o != null) {
            while (r11 < this.f74o.size()) {
                this.f74o.get(r11).surveyFormNo = this.l.form_no;
                this.f74o.get(r11).surveyUuid = this.l.uniqueID;
                this.f74o.get(r11).surveyType = String.valueOf(i3);
            }
        }
        if (!BISPApplication.d()) {
            Objects.requireNonNull(bISPApplication);
            throw null;
        }
        k(this.s.toString());
        ah ahVarC4 = ah.c();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(this.l.date);
        sb8.append(" ");
        sb8.append(this.l.time);
        ahVarC4.f("last_survey_loc_timestamp", sb8.toString());
        return Boolean.TRUE;
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i4 = $11 + 101;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) | ((long) mVar.d))) | (d$s51$1326 / 6031393033645231780L);
                i2 = mVar.e;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$1326) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
        }
        String str = new String(cArr2);
        int i5 = $11 + 89;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }
}
