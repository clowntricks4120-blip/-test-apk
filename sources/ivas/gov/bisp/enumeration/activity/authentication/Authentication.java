package ivas.gov.bisp.enumeration.activity.authentication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.textfield.TextInputEditText;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.W.P;
import ivas.gov.bisp.enumeration.activity.authentication.Authentication;
import ivas.gov.bisp.enumeration.activity.authentication.e;
import ivas.gov.bisp.enumeration.activitybase.BaseAuth;
import ivas.gov.bisp.enumeration.ax.av.buX;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.databaseModels.SurveyTimeLimits;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.AppDatabase;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.district;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.not_at_home;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.offline_survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.province;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.survey_count;
import ivas.gov.bisp.enumeration.ivas_code.DATABASE_OPERATIONS.schema.tehsil;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.otp.OtpVerificationActivity;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p024ax.aA;
import ivas.gov.bisp.enumeration.p024ax.aD;
import ivas.gov.bisp.enumeration.p024ax.aF;
import ivas.gov.bisp.enumeration.p024ax.at;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.aw;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p024ax.ay;
import ivas.gov.bisp.enumeration.p024ax.az;
import ivas.gov.bisp.enumeration.p036bi.N;
import ivas.gov.bisp.enumeration.p039bl.h;
import ivas.gov.bisp.enumeration.p039bl.r;
import ivas.gov.bisp.enumeration.p043bp.T;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.sqlcipher.BuildConfig;
import o.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Authentication extends BaseAuth implements P {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final /* synthetic */ int ac = 0;
    private static int c$s65$1032 = 937766409;
    private static boolean e$s68$1032 = true;
    private static int p = 1;
    private static int q;
    public LinearLayout aA;
    public int aB;
    public String aD;
    public EditText ad;
    public TextInputEditText ae;
    public TextView af;
    public String ag;
    public String ah;
    public String ai;
    public String aj;
    public Context ak;
    public String al;
    public String am;
    public String an;
    public String ao;
    public int ap;
    public int ar;
    public int as;
    public boolean av;
    public BISPApplication aw;
    public String ax;
    public RadioGroup ay;
    public LinearLayout az;
    private static char[] b$s64$1032 = {11856, 11958, 11909, 11940, 11956, 11963, 11967, 11941, 11954, 11966, 11908, 11943, 11899};
    private static boolean a$s67$1032 = true;
    public int aq = 0;
    public String au = "0.0";
    public String aC = "0.0";
    public ExecutorService at = Executors.newSingleThreadExecutor();

    public class OooO extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            AppDatabase appDatabaseL;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 3) + (i2 | 3);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                appDatabaseL = AppDatabase.l(Authentication.this.getApplicationContext());
                int i4 = 30 / 0;
            } else {
                appDatabaseL = AppDatabase.l(Authentication.this.getApplicationContext());
            }
            int i5 = (-2) - ((b + 58) ^ (-1));
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                appDatabaseL.m().G();
                appDatabaseL.m().B();
                obj.hashCode();
                throw null;
            }
            appDatabaseL.m().G();
            appDatabaseL.m().B();
            int i6 = a + 33;
            b = i6 % 128;
            int i7 = i6 % 2;
            appDatabaseL.m().J();
            appDatabaseL.m().I();
            int i8 = a + 55;
            b = i8 % 128;
            int i9 = i8 % 2;
            appDatabaseL.m().M();
            int i10 = a;
            int i11 = i10 & 93;
            int i12 = -(-((i10 ^ 93) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r4) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 4) + (i2 | 4);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            super.onPostExecute(r4);
            int i6 = a;
            int i7 = ((i6 ^ 17) | (i6 & 17)) << 1;
            int i8 = -(((~i6) & 17) | (i6 & (-18)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 74 / 0;
            }
        }
    }

    public class OooO0OO implements aF {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public OooO0OO(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public void c(ResponseMessage responseMessage) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 9;
            int i4 = -(-((i2 & 9) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                Authentication authentication = Authentication.this;
                int i6 = Authentication.ac;
                authentication.U.dismiss();
                throw null;
            }
            Authentication authentication2 = Authentication.this;
            int i7 = Authentication.ac;
            authentication2.U.dismiss();
            af.b(Authentication.this, responseMessage.getErrorMessage(), responseMessage.isLogout());
            int i8 = a + 43;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public class OooO0o extends HashMap<String, ArrayList<String>> {
        public OooO0o(Authentication authentication) {
            put(BuildConfig.FLAVOR, new ArrayList());
        }
    }

    public class OooOO0 extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public district c;

        public OooOO0(district districtVar) {
            this.c = districtVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 | 5) << 1;
            int i4 = -(i2 ^ 5);
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            AppDatabase appDatabaseL = AppDatabase.l(Authentication.this.getApplicationContext());
            int i7 = a;
            int i8 = (i7 & 121) + (i7 | 121);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                appDatabaseL.m().bl(this.c);
                return null;
            }
            appDatabaseL.m().bl(this.c);
            int i9 = 31 / 0;
            return null;
        }
    }

    public class OooOOO0 extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public tehsil c;

        public OooOOO0(tehsil tehsilVar) {
            this.c = tehsilVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 7;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 7)) & i3);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                Authentication.this.getApplicationContext();
                throw null;
            }
            Context applicationContext = Authentication.this.getApplicationContext();
            int i7 = b;
            int i8 = ((i7 | 75) << 1) - (i7 ^ 75);
            a = i8 % 128;
            int i9 = i8 % 2;
            AppDatabase.l(applicationContext).m().bc(this.c);
            int i10 = b;
            int i11 = i10 & 59;
            int i12 = -(-((i10 ^ 59) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    public class OooOo00 extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public static final /* synthetic */ int c = 0;
        public JSONObject d;

        public OooOo00(Context context) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 71) - (~(i2 | 71))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            super.onPreExecute();
            int i5 = b;
            int i6 = i5 & 13;
            int i7 = ((i5 ^ 13) | i6) << 1;
            int i8 = -((i5 | 13) & (~i6));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r4) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (-2) - ((((i2 | 32) << 1) - (i2 ^ 32)) ^ (-1));
            b = i3 % 128;
            int i4 = i3 % 2;
            super.onPostExecute(r4);
            int i5 = b;
            int i6 = (i5 ^ 97) + ((i5 & 97) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 34 / 0;
            }
        }

        public static void d(OooOo00 oooOo00, JSONObject jSONObject) {
            Authentication authentication;
            SessionManager sessionManager;
            ah ahVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 18) + ((i2 & 18) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            Objects.requireNonNull(oooOo00);
            try {
                Authentication.this.ap = jSONObject.getInt("tehsilCode");
                int i5 = a;
                int i6 = i5 & 125;
                int i7 = ((i5 ^ 125) | i6) << 1;
                int i8 = -((i5 | 125) & (~i6));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                Authentication.this.as = jSONObject.getInt("centerCode");
                Authentication authentication2 = Authentication.this;
                int i11 = a + 7;
                b = i11 % 128;
                int i12 = i11 % 2;
                authentication2.aB = jSONObject.getInt("tokenSkipAllowed");
                Authentication authentication3 = Authentication.this;
                int i13 = b;
                int i14 = i13 & 3;
                int i15 = (i13 ^ 3) | i14;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                authentication3.ar = jSONObject.getInt("isFingerprintEnabled");
                Object obj = null;
                if (jSONObject.has("loginAttempt")) {
                    int i18 = a;
                    int i19 = (((i18 & (-10)) | ((~i18) & 9)) - (~(-(-((i18 & 9) << 1))))) - 1;
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        Authentication authentication4 = Authentication.this;
                        jSONObject.getInt("loginAttempt");
                        throw null;
                    }
                    Authentication.this.K = jSONObject.getInt("loginAttempt");
                    int i20 = b;
                    int i21 = i20 & 75;
                    int i22 = (i21 - (~(-(-((i20 ^ 75) | i21))))) - 1;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                }
                if (!(!jSONObject.has("userMode"))) {
                    int i24 = a;
                    int i25 = i24 & 23;
                    int i26 = (((i24 ^ 23) | i25) << 1) - ((i24 | 23) & (~i25));
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        Authentication.this.aq = jSONObject.getInt("userMode");
                        int i27 = 44 / 0;
                    } else {
                        Authentication.this.aq = jSONObject.getInt("userMode");
                    }
                } else {
                    Authentication.this.aq = 1;
                    int i28 = b;
                    int i29 = (((i28 | 4) << 1) - (i28 ^ 4)) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                }
                Authentication authentication5 = Authentication.this;
                SessionManager sessionManager2 = authentication5.T;
                sessionManager2.d.putString("k_userid", authentication5.am);
                sessionManager2.d.apply();
                int i31 = b;
                int i32 = (i31 & 99) + (i31 | 99);
                a = i32 % 128;
                int i33 = i32 % 2;
                sessionManager2.d.commit();
                Authentication authentication6 = Authentication.this;
                authentication6.T.S(authentication6.al);
                Authentication authentication7 = Authentication.this;
                SessionManager sessionManager3 = authentication7.T;
                int i34 = a;
                int i35 = i34 & 41;
                int i36 = -(-(i34 | 41));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                b = i37 % 128;
                int i38 = i37 % 2;
                sessionManager3.Q(authentication7.ax);
                Authentication authentication8 = Authentication.this;
                authentication8.T.R(authentication8.aD);
                Authentication authentication9 = Authentication.this;
                SessionManager sessionManager4 = authentication9.T;
                int i39 = b;
                int i40 = i39 | 101;
                int i41 = ((i40 << 1) - (~(-((~(i39 & 101)) & i40)))) - 1;
                a = i41 % 128;
                int i42 = i41 % 2;
                sessionManager4.d.putInt("tehsilCode", authentication9.ap);
                sessionManager4.d.apply();
                Authentication authentication10 = Authentication.this;
                SessionManager sessionManager5 = authentication10.T;
                int i43 = a;
                int i44 = ((i43 | 45) << 1) - (i43 ^ 45);
                b = i44 % 128;
                if (i44 % 2 != 0) {
                    sessionManager5.d.putInt("centerCode", authentication10.as);
                    sessionManager5.d.apply();
                    authentication = Authentication.this;
                    sessionManager = authentication.T;
                    int i45 = 10 / 0;
                } else {
                    sessionManager5.d.putInt("centerCode", authentication10.as);
                    sessionManager5.d.apply();
                    authentication = Authentication.this;
                    sessionManager = authentication.T;
                }
                sessionManager.d.putInt("tokenSkip", authentication.aB);
                sessionManager.d.apply();
                Authentication authentication11 = Authentication.this;
                SessionManager sessionManager6 = authentication11.T;
                int i46 = b;
                int i47 = (i46 | 83) << 1;
                int i48 = -(((~i46) & 83) | (i46 & (-84)));
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                a = i49 % 128;
                if (i49 % 2 == 0) {
                    sessionManager6.E(authentication11.ar);
                    Authentication authentication12 = Authentication.this;
                    authentication12.T.K(Integer.valueOf(authentication12.aq));
                    ahVar = ah.c;
                    int i50 = 47 / 0;
                } else {
                    sessionManager6.E(authentication11.ar);
                    Authentication authentication13 = Authentication.this;
                    authentication13.T.K(Integer.valueOf(authentication13.aq));
                    ahVar = ah.c;
                }
                ahVar.e.putInt("user_id", jSONObject.getInt("userID"));
                ahVar.e.commit();
                if (ivas.gov.bisp.enumeration.bK.f.d() != null) {
                    Authentication.v(Authentication.this);
                    int i51 = a;
                    int i52 = ((i51 & (-12)) | ((~i51) & 11)) + ((i51 & 11) << 1);
                    b = i52 % 128;
                    if (i52 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i53 = b;
                int i54 = (i53 & 9) + (i53 | 9);
                a = i54 % 128;
                int i55 = i54 % 2;
                ivas.gov.bisp.enumeration.bK.f.c();
                Authentication authentication14 = Authentication.this;
                Objects.requireNonNull(authentication14);
                int i56 = a + 101;
                b = i56 % 128;
                try {
                    if (i56 % 2 != 0) {
                        ivas.gov.bisp.enumeration.bK.f.d().getEncoded();
                        obj.hashCode();
                        throw null;
                    }
                    String strEncodeToString = Base64.encodeToString(ivas.gov.bisp.enumeration.bK.f.d().getEncoded(), 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("string1", strEncodeToString);
                    r rVar = new r(authentication14);
                    int i57 = a;
                    int i58 = (i57 ^ 37) + ((i57 & 37) << 1);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    ax.e(jSONObject2, authentication14, "https://meladeskapp.bisp.gov.pk/api/Users/gdiaM39suzsbWAPKxss", rVar);
                    int i60 = b;
                    int i61 = (i60 & (-86)) | ((~i60) & 85);
                    int i62 = -(-((i60 & 85) << 1));
                    int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                    a = i63 % 128;
                    int i64 = i63 % 2;
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }

        public static void e(OooOo00 oooOo00, String str, String str2, int i, int i2, JSONObject jSONObject, Activity activity) {
            int i3 = 2 % 2;
            Objects.requireNonNull(oooOo00);
            OtpVerificationActivity.r = new f(oooOo00, activity, jSONObject);
            Intent intent = new Intent(activity, (Class<?>) OtpVerificationActivity.class);
            int i4 = b + 73;
            a = i4 % 128;
            int i5 = i4 % 2;
            intent.putExtra("USERNAME", str);
            int i6 = a + 71;
            b = i6 % 128;
            int i7 = i6 % 2;
            intent.putExtra("TRANSACTION_ID", str2);
            intent.putExtra("USER_ID", i);
            int i8 = a;
            int i9 = (i8 & 51) + (i8 | 51);
            b = i9 % 128;
            int i10 = i9 % 2;
            intent.putExtra("SESSION_SOURCE_ALLOWED", i2);
            intent.putExtra("IP_URL", "https://meladeskapp.bisp.gov.pk");
            int i11 = b;
            int i12 = (i11 & (-80)) | ((~i11) & 79);
            int i13 = (i11 & 79) << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            activity.startActivity(intent);
            int i16 = a;
            int i17 = ((i16 & (-50)) | ((~i16) & 49)) + ((i16 & 49) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x006d A[PHI: r1
  0x006d: PHI (r1v3 androidx.appcompat.app.b) = (r1v2 androidx.appcompat.app.b), (r1v11 androidx.appcompat.app.b) binds: [B:12:0x006b, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:15:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:16:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:19:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:20:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:22:0x00f6 A[PHI: r1
  0x00f6: PHI (r1v10 androidx.appcompat.app.b) = (r1v2 androidx.appcompat.app.b), (r1v11 androidx.appcompat.app.b) binds: [B:12:0x006b, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
        public static void c(final OooOo00 oooOo00, final int i, final String str, final JSONObject jSONObject, final Activity activity) {
            View viewInflate;
            androidx.appcompat.app.b bVarB;
            DisplayMetrics displayMetrics;
            int i2;
            int i3;
            int iMin;
            int i4;
            TextView textView;
            int i5 = 2 % 2;
            Objects.requireNonNull(oooOo00);
            androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(activity);
            int i6 = b;
            int i7 = i6 & 115;
            int i8 = 1;
            int i9 = ((((i6 ^ 115) | i7) << 1) - (~(-((i6 | 115) & (~i7))))) - 1;
            a = i9 % 128;
            Object obj = null;
            if (i9 % 2 == 0) {
                viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_otp_readiness, (ViewGroup) null);
                int i10 = 57 / 0;
            } else {
                viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_otp_readiness, (ViewGroup) null);
            }
            AlertController.OooO0O0 oooO0O0 = aiz.a;
            oooO0O0.f1o = viewInflate;
            oooO0O0.k = false;
            int i11 = b;
            int i12 = ((i11 & 46) + (i11 | 46)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                bVarB = aiz.b();
                int i13 = 32 / 0;
                if (bVarB.getWindow() != null) {
                    bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    Resources resources = Authentication.this.getResources();
                    int i14 = a;
                    int i15 = (i14 & 117) + (i14 | 117);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    displayMetrics = resources.getDisplayMetrics();
                    i2 = (int) (displayMetrics.density * 600.0f);
                    int i17 = b;
                    int i18 = (i17 & (-36)) | ((~i17) & 35);
                    int i19 = (i17 & 35) << 1;
                    i3 = (i18 & i19) + (i19 | i18);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        iMin = Math.min(i2, (int) (((double) displayMetrics.widthPixels) % 0.85d));
                    } else {
                        iMin = Math.min(i2, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                    }
                    i4 = b + 67;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        bVarB.getWindow().setLayout(iMin, 121);
                    } else {
                        bVarB.getWindow().setLayout(iMin, -2);
                    }
                    int i20 = a;
                    int i21 = i20 & 49;
                    int i22 = ((i20 ^ 49) | i21) << 1;
                    int i23 = -((i20 | 49) & (~i21));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                }
            } else {
                bVarB = aiz.b();
                if (bVarB.getWindow() != null) {
                    bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    Resources resources2 = Authentication.this.getResources();
                    int i110 = a;
                    int i111 = (i110 & 117) + (i110 | 117);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    displayMetrics = resources2.getDisplayMetrics();
                    i2 = (int) (displayMetrics.density * 600.0f);
                    int i113 = b;
                    int i114 = (i113 & (-36)) | ((~i113) & 35);
                    int i115 = (i113 & 35) << 1;
                    i3 = (i114 & i115) + (i115 | i114);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        iMin = Math.min(i2, (int) (((double) displayMetrics.widthPixels) % 0.85d));
                    } else {
                        iMin = Math.min(i2, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                    }
                    i4 = b + 67;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        bVarB.getWindow().setLayout(iMin, 121);
                    } else {
                        bVarB.getWindow().setLayout(iMin, -2);
                    }
                    int i26 = a;
                    int i27 = i26 & 49;
                    int i28 = ((i26 ^ 49) | i27) << 1;
                    int i29 = -((i26 | 49) & (~i27));
                    int i210 = ((i28 | i29) << 1) - (i29 ^ i28);
                    b = i210 % 128;
                    int i211 = i210 % 2;
                }
            }
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ivChannelIcon);
            int i30 = a + 107;
            b = i30 % 128;
            if (i30 % 2 != 0) {
                textView = (TextView) viewInflate.findViewById(R.id.tvChannelTitleEn);
                int i31 = 18 / 0;
            } else {
                textView = (TextView) viewInflate.findViewById(R.id.tvChannelTitleEn);
            }
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvChannelTitleUr);
            View viewFindViewById = viewInflate.findViewById(R.id.tvChannelMessageEn);
            int i32 = a;
            int i33 = i32 ^ 115;
            int i34 = ((i32 & 115) | i33) << 1;
            int i35 = -i33;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            b = i36 % 128;
            int i37 = i36 % 2;
            TextView textView3 = (TextView) viewFindViewById;
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tvChannelMessageUr);
            int i38 = b;
            int i39 = (i38 & 89) + (i38 | 89);
            a = i39 % 128;
            if (i39 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            final AppCompatButton appCompatButton = (AppCompatButton) viewInflate.findViewById(R.id.btnProceedSendOtp);
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.btnCancelOtpNotice);
            int i40 = a;
            int i41 = (i40 ^ 33) + ((i40 & 33) << 1);
            b = i41 % 128;
            int i42 = i41 % 2;
            final ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.pbDialogLoading);
            if (i == 0) {
                int i43 = b;
                int i44 = (i43 & 53) + (i43 | 53);
                a = i44 % 128;
                int i45 = i44 % 2;
                imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                textView.setText("Registered Mobile SIM (SMS)");
                int i46 = b;
                int i47 = i46 & 3;
                int i48 = (((i46 ^ 3) | i47) << 1) - ((i46 | 3) & (~i47));
                a = i48 % 128;
                int i49 = i48 % 2;
                textView2.setText("رجسٹرڈ سم (ایس ایم ایس)");
                textView3.setText("Your one-time password (OTP) will be dispatched via SMS to your registered SIM. Please make sure your mobile SIM has active signals.");
                int i50 = a;
                int i51 = i50 & 121;
                int i52 = i50 | 121;
                int i53 = (i51 & i52) + (i52 | i51);
                b = i53 % 128;
                int i54 = i53 % 2;
                textView4.setText("آپ کا 6 ہندسوں کا سیکیورٹی کوڈ (OTP) آپ کے رجسٹرڈ سم کارڈ پر ایس ایم ایس کے ذریعے بھیجا جائے گا۔ براہ کرم اپنے موبائل نیٹ ورک سگنلز کی موجودگی یقینی بنائیں۔");
                int i55 = a;
                int i56 = i55 & 113;
                int i57 = (((i55 ^ 113) | i56) << 1) - ((i55 | 113) & (~i56));
                b = i57 % 128;
                int i58 = i57 % 2;
            } else {
                imageView.setImageResource(android.R.drawable.ic_dialog_email);
                textView.setText("Official Registered Email");
                int i59 = a;
                int i60 = (i59 ^ 11) + ((i59 & 11) << 1);
                b = i60 % 128;
                int i61 = i60 % 2;
                textView2.setText("سرکاری رجسٹرڈ ای میل");
                textView3.setText("Your one-time password (OTP) will be dispatched to your official registered Email address. Please check your inbox or spam folder.");
                int i62 = a;
                int i63 = i62 & 61;
                int i64 = (i62 | 61) & (~i63);
                int i65 = -(-(i63 << 1));
                int i66 = (i64 & i65) + (i64 | i65);
                b = i66 % 128;
                int i67 = i66 % 2;
                textView4.setText("آپ کا 6 ہندسوں کا سیکیورٹی کوڈ (OTP) آپ کے سرکاری رجسٹرڈ ای میل پر بھیجا جائے گا۔ براہ کرم اپنا ای میل ان باکس یا اسپیم فولڈر چیک کریں۔");
                int i68 = a;
                int i69 = (i68 | 91) << 1;
                int i70 = -(((~i68) & 91) | (i68 & (-92)));
                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                b = i71 % 128;
                int i72 = i71 % 2;
            }
            textView5.setOnClickListener(new N(bVarB, i8));
            final androidx.appcompat.app.b bVar = bVarB;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.bl.i
                private static int a = 0;
                private static int b = 1;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i73 = 2 % 2;
                    int i74 = a;
                    int i75 = i74 & 39;
                    int i76 = ((~i75) & (i74 | 39)) + (i75 << 1);
                    b = i76 % 128;
                    if (i76 % 2 == 0) {
                        throw null;
                    }
                    Authentication.OooOo00 oooOo01 = this.d;
                    AppCompatButton appCompatButton2 = appCompatButton;
                    ProgressBar progressBar2 = progressBar;
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    int i77 = i;
                    int i78 = (i74 & (-118)) | ((~i74) & 117);
                    int i79 = (i74 & 117) << 1;
                    int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                    b = i80 % 128;
                    if (i80 % 2 == 0) {
                        Objects.requireNonNull(oooOo01);
                        throw null;
                    }
                    b bVar2 = bVar;
                    Activity activity2 = activity;
                    Objects.requireNonNull(oooOo01);
                    appCompatButton2.setEnabled(false);
                    progressBar2.setVisibility(0);
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        int i81 = a;
                        int i82 = (i81 & (-60)) | ((~i81) & 59);
                        int i83 = -(-((i81 & 59) << 1));
                        int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
                        b = i84 % 128;
                        if (i84 % 2 == 0) {
                            jSONObject3.put("username", str2);
                            throw null;
                        }
                        jSONObject3.put("username", str2);
                        jSONObject3.put("otptype", "Login");
                        e eVar = new e(oooOo01, progressBar2, appCompatButton2, activity2, bVar2, str2, jSONObject2, i77);
                        int i85 = a;
                        int i86 = i85 ^ 77;
                        int i87 = -(-((i85 & 77) << 1));
                        int i88 = (i86 & i87) + (i87 | i86);
                        b = i88 % 128;
                        int i89 = i88 % 2;
                        ax.e(jSONObject3, activity2, "https://meladeskapp.bisp.gov.pk/api/Users/SendOTP", eVar);
                        int i90 = b;
                        int i91 = i90 & 25;
                        int i92 = -(-((i90 ^ 25) | i91));
                        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                        a = i93 % 128;
                        int i94 = i93 % 2;
                    } catch (Exception unused) {
                        progressBar2.setVisibility(8);
                        appCompatButton2.setEnabled(true);
                    }
                }
            };
            int i73 = a;
            int i74 = i73 | 17;
            int i75 = ((i74 << 1) - (~(-((~(i73 & 17)) & i74)))) - 1;
            b = i75 % 128;
            if (i75 % 2 != 0) {
                Object obj2 = null;
                appCompatButton.setOnClickListener(onClickListener);
                bVarB.show();
                obj2.hashCode();
                throw null;
            }
            appCompatButton.setOnClickListener(onClickListener);
            bVarB.show();
            int i76 = b;
            int i77 = ((i76 | 67) << 1) - (i76 ^ 67);
            a = i77 % 128;
            if (i77 % 2 != 0) {
                return;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            double d;
            Authentication authentication;
            JSONObject jSONObject;
            int i = 2 % 2;
            JSONObject jSONObject2 = new JSONObject();
            int i2 = a;
            int i3 = (i2 ^ 93) + ((i2 & 93) << 1);
            b = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    this.d = jSONObject2;
                    d = Double.parseDouble("7.6");
                    authentication = Authentication.this;
                    int i4 = 84 / 0;
                } else {
                    this.d = jSONObject2;
                    d = Double.parseDouble("7.6");
                    authentication = Authentication.this;
                }
                if (authentication.ag.length() <= 0) {
                    int i5 = b;
                    int i6 = ((i5 | 23) << 1) - (i5 ^ 23);
                    a = i6 % 128;
                    int i7 = i6 % 2;
                    Authentication authentication2 = Authentication.this;
                    authentication2.ah = authentication2.ah.replace("-", BuildConfig.FLAVOR);
                    this.d.put("username", Authentication.this.ag);
                    JSONObject jSONObject3 = this.d;
                    int i8 = a;
                    int i9 = i8 & 53;
                    int i10 = ((((i8 ^ 53) | i9) << 1) - (~(-((i8 | 53) & (~i9))))) - 1;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    jSONObject3.put("password", Authentication.this.aj);
                    this.d.put("imei", Authentication.this.ai);
                    this.d.put("origin", 100);
                    JSONObject jSONObject4 = this.d;
                    int i12 = b;
                    int i13 = (i12 ^ 79) + ((i12 & 79) << 1);
                    a = i13 % 128;
                    if (i13 % 2 == 0) {
                        jSONObject4.put("app_version", d);
                        this.d.put("CNICNumber", Authentication.this.ah);
                        this.d.put("call_origin", 5);
                    } else {
                        jSONObject4.put("app_version", d);
                        this.d.put("CNICNumber", Authentication.this.ah);
                        this.d.put("call_origin", 100);
                    }
                    this.d.put("ipAddress", ac.h(true));
                    this.d.put("isFingerPrint", true);
                    this.d.put("latitude", Authentication.this.au.toString());
                    this.d.put("longitude", Authentication.this.aC.toString());
                    JSONObject jSONObject5 = this.d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(Authentication.this.aa);
                    jSONObject5.put("isScreenLogin", sb.toString());
                    JSONObject jSONObject6 = this.d;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Authentication.this.K);
                    int i14 = a;
                    int i15 = ((i14 | 83) << 1) - (i14 ^ 83);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    jSONObject6.put("counter", sb2.toString());
                    this.d.put("fingerIndex", Authentication.this.w);
                    JSONObject jSONObject7 = this.d;
                    int i17 = b;
                    int i18 = i17 & 15;
                    int i19 = (((i17 ^ 15) | i18) << 1) - ((i17 | 15) & (~i18));
                    a = i19 % 128;
                    if (i19 % 2 == 0) {
                        jSONObject7.put("fingerTemplate", Authentication.this.O);
                        this.d.put("IpAddress", ac.h(true));
                    } else {
                        jSONObject7.put("fingerTemplate", Authentication.this.O);
                        this.d.put("IpAddress", ac.h(true));
                    }
                    int i20 = b;
                    int i21 = i20 & 41;
                    int i22 = i21 + ((i20 ^ 41) | i21);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    this.d.put("username", Authentication.this.ag);
                    this.d.put("password", Authentication.this.aj);
                    JSONObject jSONObject8 = this.d;
                    int i24 = a + 3;
                    b = i24 % 128;
                    if (i24 % 2 != 0) {
                        jSONObject8.put("imei", Authentication.this.ai);
                        this.d.put("origin", 22);
                        jSONObject = this.d;
                    } else {
                        jSONObject8.put("imei", Authentication.this.ai);
                        this.d.put("origin", 100);
                        jSONObject = this.d;
                    }
                    jSONObject.put("app_version", d);
                    this.d.put("CNICNumber", Authentication.this.ah);
                    this.d.put("call_origin", 100);
                    this.d.put("ipAddress", ac.h(true));
                    JSONObject jSONObject9 = this.d;
                    int i25 = a + 65;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    jSONObject9.put("isFingerPrint", true);
                    this.d.put("latitude", Authentication.this.au.toString());
                    this.d.put("longitude", Authentication.this.aC.toString());
                    JSONObject jSONObject10 = this.d;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Authentication.this.aa);
                    jSONObject10.put("isScreenLogin", sb3.toString());
                    JSONObject jSONObject11 = this.d;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(Authentication.this.K);
                    String string = sb4.toString();
                    int i27 = a + 121;
                    b = i27 % 128;
                    if (i27 % 2 != 0) {
                        jSONObject11.put("counter", string);
                        this.d.put("fingerIndex", Authentication.this.w);
                        String str = Authentication.this.O;
                        throw null;
                    }
                    jSONObject11.put("counter", string);
                    this.d.put("fingerIndex", Authentication.this.w);
                    this.d.put("fingerTemplate", Authentication.this.O);
                    this.d.put("IpAddress", ac.h(true));
                    int i28 = b;
                    int i29 = (i28 | 89) << 1;
                    int i30 = -(i28 ^ 89);
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                }
            } catch (JSONException unused) {
            }
            JSONObject jSONObject12 = this.d;
            if (jSONObject12 != null) {
                Authentication authentication3 = Authentication.this;
                d dVar = new d(this, authentication3);
                int i33 = a;
                int i34 = i33 & 61;
                int i35 = i34 + ((i33 ^ 61) | i34);
                b = i35 % 128;
                int i36 = i35 % 2;
                ax.e(jSONObject12, authentication3, "https://meladeskapp.bisp.gov.pk/api/Users/authenticate_v2", dVar);
                int i37 = a;
                int i38 = ((i37 & (-74)) | ((~i37) & 73)) + ((i37 & 73) << 1);
                b = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 2 / 3;
                }
            }
            int i40 = b;
            int i41 = i40 ^ 103;
            int i42 = (((i40 & 103) | i41) << 1) - i41;
            a = i42 % 128;
            if (i42 % 2 != 0) {
                return null;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Authentication() {
        new Handler(Looper.getMainLooper());
        new ArrayList();
        new OooO0o(this);
    }

    public static void u(Authentication authentication) {
        int i = 2 % 2;
        Objects.requireNonNull(authentication);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Data", "BISP NSER Dynamic Registry");
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(authentication.T.k()), ivas.gov.bisp.enumeration.bK.b.b(authentication.T.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(authentication.T.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(authentication.T.m());
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, new byte[]{-115, -116, -117, -126, -118, -119, -120, -121, -126, -126, -122, -123, -124, -125, -126, -127}, null, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(authentication.U, "Please wait!");
            ax.e(jSONObject2, authentication, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new h(authentication));
            int i2 = q + 49;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public void B(String str, String str2) {
        int i = 2 % 2;
        this.U.setCancelable(false);
        this.U.setMessage("Please Wait Address Library Loading...");
        this.U.setProgressStyle(0);
        this.U.show();
        Context context = this.ak;
        OooO0OO oooO0OO = new OooO0OO(str, str2);
        try {
            aD aDVar = new aD(0, "https://meladeskapp.bisp.gov.pk/api/Roster/GetAddressLibrary", new az(oooO0OO), new aA(oooO0OO), context);
            aDVar.m = new z(130000, 0, 0.0f);
            aDVar.k = false;
            BISPApplication.c().h(aDVar);
            int i2 = p + 97;
            q = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            oooO0OO.c(new ResponseMessage(0, e.getMessage(), false));
        }
    }

    @Override // ivas.gov.bisp.enumeration.W.P
    public void n(ArrayList<not_at_home> arrayList, ArrayList<survey_count> arrayList2, ArrayList<offline_survey_count> arrayList3) {
        int i = 2 % 2;
        int i2 = q + 5;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 45;
        p = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return R.layout.activity_authentication;
    }

    public class OooOO0O extends AsyncTask<Void, Void, Void> {
        private static int a = 1;
        private static int b;
        public province c;

        public OooOO0O(province provinceVar) {
            this.c = provinceVar;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            Context applicationContext;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = ((i2 ^ 121) | i3) << 1;
            int i5 = -((i2 | 121) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                applicationContext = Authentication.this.getApplicationContext();
                int i7 = 12 / 0;
            } else {
                applicationContext = Authentication.this.getApplicationContext();
            }
            int i8 = a;
            int i9 = (((i8 ^ 33) | (i8 & 33)) << 1) - (((~i8) & 33) | (i8 & (-34)));
            b = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                AppDatabase.l(applicationContext).m().bt(this.c);
                obj.hashCode();
                throw null;
            }
            AppDatabase.l(applicationContext).m().bt(this.c);
            int i10 = b;
            int i11 = i10 & 13;
            int i12 = i11 + ((i10 ^ 13) | i11);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 76 / 0;
            }
            return null;
        }
    }

    public class OooOOO extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;

        public OooOOO() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            Authentication authentication;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 7;
            int i4 = (i3 - (~(-(-((i2 ^ 7) | i3))))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                authentication = Authentication.this;
                int i5 = authentication.aq;
                int i6 = 82 / 0;
            } else {
                authentication = Authentication.this;
                int i7 = authentication.aq;
            }
            authentication.runOnUiThread(new c(this));
            int i8 = a + 125;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r11) {
            Authentication authentication;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 65;
            int i4 = (i3 - (~((i2 ^ 65) | i3))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                super.onPostExecute(r11);
                authentication = Authentication.this;
                int i5 = Authentication.ac;
                int i6 = 7 / 0;
            } else {
                super.onPostExecute(r11);
                authentication = Authentication.this;
                int i7 = Authentication.ac;
            }
            authentication.U.dismiss();
            Integer numL = Authentication.this.T.l();
            int i8 = (-2) - ((a + 82) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
            if (numL.intValue() != 2) {
                int i10 = a;
                int i11 = i10 & 103;
                int i12 = (i10 | 103) & (~i11);
                int i13 = i11 << 1;
                int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                int iIntValue = Authentication.this.T.l().intValue();
                int i16 = a;
                int i17 = ((i16 | 113) << 1) - (i16 ^ 113);
                b = i17 % 128;
                if (i17 % 2 != 0 ? iIntValue != 3 : iIntValue != 2) {
                    int i18 = i16 & 121;
                    int i19 = ((((i16 ^ 121) | i18) << 1) - (~(-((i16 | 121) & (~i18))))) - 1;
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        Authentication.u(Authentication.this);
                        return;
                    } else {
                        Authentication.u(Authentication.this);
                        int i20 = 6 / 0;
                        return;
                    }
                }
            }
            if (BISPApplication.c().g) {
                Authentication.u(Authentication.this);
                int i21 = a;
                int i22 = i21 & 75;
                int i23 = (i21 | 75) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                b = i25 % 128;
                int i26 = i25 % 2;
                return;
            }
            ag.n(new SurveyTimeLimits(0, 0, 0, 0, 0, 0, 0, 0));
            Authentication authentication2 = Authentication.this;
            Intent intent = new Intent(Authentication.this, (Class<?>) ActivityEnumeratorMain.class);
            int i27 = a;
            int i28 = (((i27 | 62) << 1) - (i27 ^ 62)) - 1;
            b = i28 % 128;
            int i29 = i28 % 2;
            authentication2.startActivity(intent);
            Authentication.this.finish();
            int i30 = b + 125;
            a = i30 % 128;
            int i31 = i30 % 2;
        }
    }

    public class OooO00o implements View.OnLongClickListener {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int i = 2 % 2;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            int i2 = b;
            int i3 = i2 & 3;
            int i4 = -(-(i2 | 3));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            calendar.add(5, -1);
            Date time = calendar.getTime();
            int i7 = a;
            int i8 = i7 & 73;
            int i9 = ((((i7 ^ 73) | i8) << 1) - (~(-((i7 | 73) & (~i8))))) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                simpleDateFormat.format(time);
                int i10 = Authentication.ac;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = simpleDateFormat.format(time);
            Authentication authentication = Authentication.this;
            int i11 = Authentication.ac;
            authentication.T.B(str);
            try {
                OooO oooO = Authentication.this.new OooO();
                int i12 = a;
                int i13 = i12 & 103;
                int i14 = ((i12 ^ 103) | i13) << 1;
                int i15 = -((i12 | 103) & (~i13));
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                oooO.execute(new Void[0]);
                int i18 = a;
                int i19 = ((i18 & 99) - (~(i18 | 99))) - 1;
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 4 / 5;
                }
            } catch (Exception unused) {
            }
            Toast.makeText(Authentication.this, "Kindly Login with your credentials.", 0).show();
            int i21 = b;
            int i22 = i21 | 37;
            int i23 = ((i22 << 1) - (~(-((~(i21 & 37)) & i22)))) - 1;
            a = i23 % 128;
            int i24 = i23 % 2;
            return false;
        }
    }

    public class OooO0O0 implements RadioGroup.OnCheckedChangeListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 31;
            int i5 = i3 | 31;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            switch (i) {
                case R.id.rdoCNIC /* 2131362760 */:
                    Authentication.this.az.setVisibility(8);
                    Authentication authentication = Authentication.this;
                    int i9 = b;
                    int i10 = i9 & 45;
                    int i11 = (i9 | 45) & (~i10);
                    int i12 = -(-(i10 << 1));
                    int i13 = (i11 & i12) + (i11 | i12);
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        authentication.aA.setVisibility(1);
                    } else {
                        authentication.aA.setVisibility(0);
                    }
                    int i14 = a + 119;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    return;
                case R.id.rdoPhn /* 2131362761 */:
                    Authentication.this.az.setVisibility(0);
                    Authentication authentication2 = Authentication.this;
                    int i16 = a;
                    int i17 = i16 ^ 39;
                    int i18 = (i16 & 39) << 1;
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    authentication2.aA.setVisibility(8);
                    int i21 = a;
                    int i22 = ((i21 ^ 23) | (i21 & 23)) << 1;
                    int i23 = -(((~i21) & 23) | (i21 & (-24)));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    b = i24 % 128;
                    if (i24 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                default:
                    int i25 = i7 & 93;
                    int i26 = (((i7 ^ 93) | i25) << 1) - ((i7 | 93) & (~i25));
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    return;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        try {
            this.aa = Boolean.TRUE;
            A();
            new OooOOOO(this).execute(new Void[0]);
            int i2 = p + 45;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
        } catch (Exception e) {
            Log.e("Excepion", e.toString());
        }
    }

    public static void v(Authentication authentication) {
        int i = 2 % 2;
        Objects.requireNonNull(authentication);
        a aVar = new a(authentication);
        try {
            aw awVar = new aw(0, "https://meladeskapp.bisp.gov.pk/api/Users/LpaGo6ep8607Z3cjXQ0", null, new at(aVar), new ay(aVar), authentication);
            awVar.m = new z(130000, 0, 0.0f);
            awVar.k = false;
            BISPApplication.c().h(awVar);
            int i2 = p + 61;
            q = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            aVar.onError(new ResponseMessage(0, e.getMessage(), false));
        }
    }

    public class OooOOOO extends AsyncTask<Void, Void, String> {
        private static int a = 1;
        private static int b;

        public OooOOOO(Authentication authentication) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String str) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 101;
            int i4 = ((i2 | 101) & (~i3)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            int i7 = ((i5 | 123) << 1) - (i5 ^ 123);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 41 / 0;
            }
        }

        @Override // android.os.AsyncTask
        public String doInBackground(Void[] voidArr) {
            String string;
            SSLSocketFactory sSLSocketFactory;
            int i;
            Certificate[] peerCertificates;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 | 3) << 1;
            int i5 = -(((~i3) & 3) | (i3 & (-4)));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                    i = 29059;
                } else {
                    sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                    i = 443;
                }
                int i7 = a;
                int i8 = (i7 & (-86)) | ((~i7) & 85);
                int i9 = -(-((i7 & 85) << 1));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket("https://meladeskapp.bisp.gov.pk", i);
                    sSLSocket.startHandshake();
                    peerCertificates = sSLSocket.getSession().getPeerCertificates();
                    int i11 = 27 / 0;
                } else {
                    SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket("https://meladeskapp.bisp.gov.pk", i);
                    sSLSocket2.startHandshake();
                    peerCertificates = sSLSocket2.getSession().getPeerCertificates();
                }
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(peerCertificates[0].getEncoded());
                StringBuilder sb = new StringBuilder();
                int length = bArrDigest.length;
                int i12 = b;
                int i13 = (((i12 | 96) << 1) - (i12 ^ 96)) - 1;
                a = i13 % 128;
                int i14 = (i13 % 2 == 0 ? 0 : 1) ^ 1;
                int i15 = i12 | 49;
                int i16 = i15 << 1;
                int i17 = -((~(i12 & 49)) & i15);
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 3 % 3;
                }
                while (i14 < length) {
                    int i20 = b;
                    int i21 = i20 & 125;
                    int i22 = -(-(i20 | 125));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    int i24 = i23 % 128;
                    a = i24;
                    int i25 = i23 % 2;
                    byte b2 = bArrDigest[i14];
                    Object[] objArr = new Object[1];
                    int i26 = (((i24 & (-68)) | ((~i24) & 67)) - (~(-(-((i24 & 67) << 1))))) - 1;
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        objArr[0] = Byte.valueOf(b2);
                        sb.append(String.format("%02X:", objArr));
                        throw null;
                    }
                    objArr[0] = Byte.valueOf(b2);
                    sb.append(String.format("%02X:", objArr));
                    int i27 = a;
                    int i28 = i27 ^ 5;
                    int i29 = -(-((i27 & 5) << 1));
                    int i30 = (i28 & i29) + (i29 | i28);
                    b = i30 % 128;
                    if (i30 % 2 != 0) {
                        int i31 = i14 & 22;
                        int i32 = ((i14 ^ 22) | i31) << 1;
                        int i33 = -((i14 | 22) & (~i31));
                        i14 = (i32 & i33) + (i32 | i33);
                    } else {
                        int i34 = i14 ^ 1;
                        i14 = (((i14 & 1) | i34) << 1) - i34;
                    }
                }
                string = sb.toString().replaceAll(":$", BuildConfig.FLAVOR);
                int i35 = a;
                int i36 = ((i35 ^ 117) | (i35 & 117)) << 1;
                int i37 = -(((~i35) & 117) | (i35 & (-118)));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                b = i38 % 128;
                int i39 = i38 % 2;
            } catch (Exception e) {
                string = e.toString();
            }
            int i40 = a;
            int i41 = (i40 | 3) << 1;
            int i42 = -(((~i40) & 3) | (i40 & (-4)));
            int i43 = (i41 & i42) + (i42 | i41);
            b = i43 % 128;
            int i44 = i43 % 2;
            return string;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        int i = 2 % 2;
        int id = view.getId();
        if (id != R.id.btn_login) {
            if (id == R.id.img_fp) {
                q("0", new ArrayList<>());
                return;
            }
            int i2 = q + 109;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
                if (id != R.id.select_finger) {
                    return;
                }
            } else if (id != R.id.select_finger) {
                return;
            }
            r();
            return;
        }
        if (!(!TextUtils.isEmpty(this.s.getText().toString()))) {
            Toast.makeText(this, "Please enter CNIC", 0).show();
            return;
        }
        BISPApplication bISPApplication = BISPApplication.c;
        if (this.O.equals(BuildConfig.FLAVOR)) {
            int i4 = q + 39;
            p = i4 % 128;
            int i5 = i4 % 2;
            if (this.T.v() == 1) {
                int i6 = p + 33;
                q = i6 % 128;
                if (i6 % 2 != 0) {
                    Toast.makeText(this, "Please scan finger", 0).show();
                    return;
                } else {
                    Toast.makeText(this, "Please scan finger", 0).show();
                    return;
                }
            }
        }
        if (ac.h(true).equals(BuildConfig.FLAVOR)) {
            int i7 = q + 123;
            p = i7 % 128;
            int i8 = i7 % 2;
            Toast.makeText(this, "IP Not Found", 0).show();
            int i9 = q + 103;
            p = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        Objects.requireNonNull(this.aw);
        this.ag = this.s.getText().toString();
        this.ah = this.ad.getText().toString();
        this.aj = this.ae.getText().toString();
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = p + 63;
            q = i11 % 128;
            if (i11 % 2 != 0) {
                this.ai = Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.ai = Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
        } else {
            this.ai = telephonyManager.getDeviceId();
        }
        if (this.U.isShowing()) {
            int i12 = p + 67;
            q = i12 % 128;
            if (i12 % 2 != 0) {
                this.U.dismiss();
                int i13 = 35 / 0;
            } else {
                this.U.dismiss();
            }
        }
        this.U.setCancelable(false);
        this.U.setMessage("Please Wait...");
        this.U.setProgressStyle(0);
        this.U.show();
        new OooOo00(this.ak).execute(new Void[0]);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    public void A() {
        int i = 2 % 2;
        int i2 = q + 95;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            this.aw = (BISPApplication) getApplicationContext();
            this.av = false;
            ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)\n11 Nov 2026");
            if (BISPApplication.f()) {
                s();
                Log.e("enablelocation", BISPApplication.e());
                int i3 = p + 75;
                q = i3 % 128;
                int i4 = i3 % 2;
            } else {
                this.au = BISPApplication.e().split(",")[0];
                this.aC = BISPApplication.e().split(",")[1];
                Log.e("location", BISPApplication.e());
            }
        } else {
            this.aw = (BISPApplication) getApplicationContext();
            this.av = false;
            ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)\n11 Nov 2026");
            if (BISPApplication.f()) {
                s();
                Log.e("enablelocation", BISPApplication.e());
                int i5 = p + 75;
                q = i5 % 128;
                int i6 = i5 % 2;
            } else {
                this.au = BISPApplication.e().split(",")[0];
                this.aC = BISPApplication.e().split(",")[1];
                Log.e("location", BISPApplication.e());
            }
        }
        this.ay = (RadioGroup) findViewById(R.id.radio_group);
        this.ad = (EditText) findViewById(R.id.et_phone);
        this.ae = (TextInputEditText) findViewById(R.id.et_password);
        this.az = (LinearLayout) findViewById(R.id.ll_phno);
        this.aA = (LinearLayout) findViewById(R.id.ll_cnic);
        this.af = (TextView) findViewById(R.id.btn_login);
        ((TextView) findViewById(R.id.tvChangePassword)).setOnClickListener(new T(this, 4));
        this.ak = this;
        this.T = new SessionManager(this);
        ((ImageView) findViewById(R.id.imgfound)).setOnLongClickListener(new OooO00o());
        ac.e(this.ad);
        this.ad.addTextChangedListener(new av(this).new buX(this.ad));
        this.af.setOnClickListener(this);
        this.ay.setOnCheckedChangeListener(new OooO0O0());
        ProgressDialog progressDialog = this.U;
        if (progressDialog != null && !(!progressDialog.isShowing())) {
            this.U.dismiss();
        }
        this.U.setTitle("DataBase Checking");
        this.U.setMessage("Please Wait...!");
        this.U.setProgressStyle(0);
        this.U.setCancelable(false);
        this.U.show();
        if (this.T == null) {
            this.T = new SessionManager(this);
        }
        if (this.T.c.getBoolean("isUserLoggedIn", false)) {
            int i7 = p + 93;
            q = i7 % 128;
            if (i7 % 2 != 0) {
                this.av = false;
            } else {
                this.av = true;
            }
        } else {
            this.av = false;
        }
        if (this.av) {
            ProgressDialog progressDialog2 = this.U;
            if (progressDialog2 != null) {
                int i8 = p + 123;
                q = i8 % 128;
                int i9 = i8 % 2;
                if (progressDialog2.isShowing()) {
                    this.U.dismiss();
                }
            }
            startActivity(new Intent(this, (Class<?>) ActivityEnumeratorMain.class));
            finish();
            int i10 = p + 85;
            q = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 % 4;
            }
        } else {
            ProgressDialog progressDialog3 = this.U;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                int i12 = q + 93;
                p = i12 % 128;
                int i13 = i12 % 2;
                this.U.dismiss();
            }
            Toast.makeText(this, "Please Login with valid Username/password", 0).show();
            int i14 = p + 119;
            q = i14 % 128;
            int i15 = i14 % 2;
        }
        System.out.println("the value of a before left shift is: 7.8");
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("the value of a after applying left shift is: ");
        sb.append(112);
        printStream.println(sb.toString());
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$1032;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i4 = (int) (1962356595541487140L ^ ((long) c$s65$1032));
        if (e$s68$1032) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i4);
                lVar.a++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!a$s67$1032) {
            lVar.d = iArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i4);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $11 + 53;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        lVar.d = cArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            cArr6[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i4);
            lVar.a++;
        }
        objArr[0] = new String(cArr6);
    }
}
