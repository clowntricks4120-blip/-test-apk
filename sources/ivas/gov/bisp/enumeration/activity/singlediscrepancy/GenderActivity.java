package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.dd.A;
import ivas.gov.bisp.enumeration.dd.C0299v;
import ivas.gov.bisp.enumeration.dd.L;
import ivas.gov.bisp.enumeration.dd.am;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import net.sqlcipher.BuildConfig;
import o.f;
import o.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GenderActivity extends BaseTouch implements RadioGroup.OnCheckedChangeListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s26$951 = -1345902127;
    private static byte[] b$s29$951 = {-50, -38, -77, -76, -91, -121, -84, -88, -73, -83, -85, -67, -125, -89, -88, -81, -97, 99};
    private static short[] c$s30$951 = null;
    private static int d$s27$951 = -179885532;
    private static int e$s28$951 = -818653363;
    private static int p = 1;
    private static int q;
    public int aA;
    public RadioButton aB;
    public RadioGroup aC;
    public int aD;
    public String aE;
    public String aF;
    public String aG;
    public int aH;
    public String aI;
    public String aJ;
    public int aK;
    public String aL;
    public String aM;
    public boolean aN;
    public int aO;
    public String aP;
    public int aQ;
    public int aR;
    public String aS;
    public String aT;
    public int aU;
    public int aV;
    public SessionManager ac;
    public ProgressDialog ad;
    public RosterItem ae;
    public EditText af;
    public ImageView ag;
    public String ah;
    public String ai;
    public boolean aj;
    public String ak;
    public TextView al;
    public String am;
    public long an;
    public String ao;
    public String ap;
    public int aq;
    public String ar;
    public String as;
    public String at;
    public String au;
    public String av;
    public TextView aw;
    public RadioButton ax;
    public TextView ay;
    public RadioButton az;

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(GenderActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = a;
            int i4 = ((((i3 ^ 13) | (i3 & 13)) << 1) - (~(-(((~i3) & 13) | (i3 & (-14)))))) - 1;
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                RosterItem rosterItem = GenderActivity.this.ae;
                obj.hashCode();
                throw null;
            }
            RosterItem rosterItem2 = GenderActivity.this.ae;
            int i5 = b;
            int i6 = i5 & 125;
            int i7 = (i5 ^ 125) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                intent.putExtra("roster_data", rosterItem2);
                GenderActivity.this.startActivity(intent);
                throw null;
            }
            intent.putExtra("roster_data", rosterItem2);
            GenderActivity.this.startActivity(intent);
            dialogInterface.cancel();
            int i9 = a;
            int i10 = (i9 ^ 57) + ((i9 & 57) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public class OooO0OO implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b + 69;
            a = i2 % 128;
            int i3 = i2 % 2;
            GenderActivity.this.aw.setVisibility(8);
            GenderActivity genderActivity = GenderActivity.this;
            int i4 = b;
            int i5 = (((i4 ^ 3) | (i4 & 3)) << 1) - (((~i4) & 3) | (i4 & (-4)));
            a = i5 % 128;
            int i6 = i5 % 2;
            genderActivity.al.setVisibility(0);
            int i7 = a;
            int i8 = (((i7 & (-62)) | ((~i7) & 61)) - (~(-(-((i7 & 61) << 1))))) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = ((i5 | 17) << 1) - (i5 ^ 17);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 25 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (((i5 | 11) << 1) - (~(-(((~i5) & 11) | (i5 & (-12)))))) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 58 / 0;
            }
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        if (i == this.aB.getId()) {
            int i3 = p + 27;
            q = i3 % 128;
            int i4 = i3 % 2;
            this.aI = "male";
            return;
        }
        if (i == this.ax.getId()) {
            int i5 = p + 79;
            q = i5 % 128;
            int i6 = i5 % 2;
            this.aI = "female";
            if (i6 != 0) {
                throw null;
            }
            return;
        }
        if (i == this.az.getId()) {
            int i7 = q + 5;
            p = i7 % 128;
            int i8 = i7 % 2;
            this.aI = "transgender";
            if (i8 == 0) {
                throw null;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 91;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_gender;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            GenderActivity genderActivity = GenderActivity.this;
            w wVar = new w(genderActivity, genderActivity.ac);
            int i3 = b;
            int i4 = i3 & 3;
            int i5 = i4 + ((i3 ^ 3) | i4);
            a = i5 % 128;
            int i6 = i5 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i7 = b;
            int i8 = i7 & 39;
            int i9 = -(-((i7 ^ 39) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 99 / 0;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) UpdateGenderActivity.class));
        finish();
        int i2 = p + 55;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 23;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            view.getId();
            throw null;
        }
        int id = view.getId();
        if (id != R.id.btn_update) {
            if (id == R.id.btn_validate) {
                u();
                return;
            } else {
                if (id == R.id.iv_back) {
                    int i3 = q + 7;
                    p = i3 % 128;
                    int i4 = i3 % 2;
                    onBackPressed();
                    return;
                }
                return;
            }
        }
        this.ah = this.ac.p();
        b.aIz aiz = new b.aIz(this);
        aiz.a.e = "Phone Number.!";
        StringBuilder sbW = j.w("Please Comfirm your Phone # ");
        sbW.append(this.ah);
        String string = sbW.toString();
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.f = string;
        oooO0O0.k = true;
        OooO00o oooO00o = new OooO00o();
        oooO0O0.h = "Confirm";
        oooO0O0.i = oooO00o;
        OooO0O0 oooO0O1 = new OooO0O0();
        oooO0O0.a = "No";
        oooO0O0.j = oooO0O1;
        aiz.b().show();
    }

    public final void u() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.ai);
            jSONObject.put("cnic", this.aP);
            jSONObject.put("r_id", this.an);
            jSONObject.put("update_type", "update_gender");
            this.ad.setCancelable(false);
            this.ad.setMessage("Please Wait...");
            this.ad.setProgressStyle(0);
            this.ad.show();
            if (this.ac.k().length() <= 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Session Expire");
                builder.setMessage("Session Expire Please Login Again.!");
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO0o());
                builder.create().show();
                return;
            }
            int i2 = q + 19;
            p = i2 % 128;
            int i3 = i2 % 2;
            w(this.aP);
            int i4 = p + 31;
            q = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    public final void w(String str) {
        int i = 2 % 2;
        String strReplace = str.replace("-", BuildConfig.FLAVOR);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Cnic", strReplace);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.ac.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ac.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ac.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ac.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ac.m());
            Object[] objArr = new Object[1];
            a((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), (-980647178) + getApplicationInfo().targetSdkVersion, (short) (getApplicationInfo().targetSdkVersion + 16), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 57, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 1518339030, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ad, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new ivas.gov.bisp.enumeration.dd.R(this));
            int i2 = p + 65;
            q = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 0;
        private static int d = 1;
        private static long d$s40$32 = -5209145241704118766L;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            int i2;
            String str2;
            double dC;
            int i3 = 2 % 2;
            GenderActivity genderActivity = GenderActivity.this;
            genderActivity.ae = new RosterItem(genderActivity.ai, genderActivity.aj, genderActivity.ak, BuildConfig.FLAVOR, genderActivity.aP, genderActivity.aV, genderActivity.aE, genderActivity.aF, genderActivity.aG, genderActivity.aH, genderActivity.aK, genderActivity.aT, genderActivity.aJ, genderActivity.aI, genderActivity.aQ, genderActivity.aR, genderActivity.aS, genderActivity.aN, genderActivity.aO, genderActivity.aM, genderActivity.aU, genderActivity.aL, genderActivity.aD, genderActivity.an, genderActivity.ao, genderActivity.aA, genderActivity.av, genderActivity.ap, genderActivity.am, genderActivity.ar, genderActivity.aq, genderActivity.as, genderActivity.at, genderActivity.au);
            GenderActivity genderActivity2 = GenderActivity.this;
            RosterItem rosterItem = genderActivity2.ae;
            Object hhid = rosterItem.getHhid();
            rosterItem.gethH_Name();
            rosterItem.isIs_Benificiary();
            rosterItem.getMessage();
            rosterItem.getDiscrepancy_status();
            rosterItem.getCnic();
            int i4 = rosterItem.get_educationLevelCode();
            int disabilityCode = rosterItem.getDisabilityCode();
            String disabilityStatus = rosterItem.getDisabilityStatus();
            int i5 = rosterItem.get_employmentCode();
            String employment_status = rosterItem.getEmployment_status();
            String form_no = rosterItem.getForm_no();
            String gender = rosterItem.getGender();
            int i6 = rosterItem.get_goneToSchoolCode();
            int havingChronicDiseaseCode = rosterItem.getHavingChronicDiseaseCode();
            String hhMemberNames = rosterItem.getHhMemberNames();
            String dob = rosterItem.getDob();
            boolean zIsLiterate = rosterItem.isLiterate();
            int i7 = rosterItem.get_lastWeekWorkingHours();
            int maritalStatusCode = rosterItem.getMaritalStatusCode();
            String maritalStatus = rosterItem.getMaritalStatus();
            rosterItem.getMessage();
            int relationToHouseholdHead = rosterItem.getRelationToHouseholdHead();
            long j = rosterItem.getrId();
            String workStatus = rosterItem.getWorkStatus();
            String mobilenumber = rosterItem.getMobilenumber();
            int i8 = rosterItem.get_workStatusCode();
            if (!zIsLiterate) {
                str = "0";
            } else {
                int i9 = d + 69;
                c = i9 % 128;
                int i10 = i9 % 2;
                str = "1";
            }
            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
                Calendar calendar = Calendar.getInstance();
                i2 = disabilityCode;
                str2 = disabilityStatus;
                try {
                    calendar.setTimeInMillis(date.getTime());
                    int i11 = calendar.get(1);
                    dC = ag.c(calendar.get(5), calendar.get(2), i11);
                } catch (ParseException unused) {
                    dC = 0.0d;
                }
            } catch (ParseException unused2) {
                i2 = disabilityCode;
                str2 = disabilityStatus;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String str3 = str;
                String ipAddress = Formatter.formatIpAddress(((WifiManager) genderActivity2.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                jSONObject.put("house_hold_id", hhid);
                jSONObject.put("is_pmt", 0);
                jSONObject.put("type", "update_gender");
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("rId", j);
                jSONObject3.put("cnicEnc", genderActivity2.aP);
                jSONObject3.put("cnic", genderActivity2.aP);
                jSONObject3.put("hhMemberNames", hhMemberNames);
                jSONObject3.put("hhMemberNamesEnc", hhMemberNames);
                jSONObject3.put("dob", dob);
                jSONObject3.put("age", dC);
                jSONObject3.put("maritalStatus", maritalStatus);
                jSONObject3.put("maritalStatusCode", maritalStatusCode);
                jSONObject3.put("gender", gender);
                jSONObject3.put("relationToHhHead", relationToHouseholdHead);
                jSONObject3.put("formNo", form_no);
                jSONObject3.put("disabilityStatus", str2);
                jSONObject3.put("disabilityCode", i2);
                jSONObject3.put("havingChronicDiseaseCode", havingChronicDiseaseCode);
                jSONObject3.put("isLiterate", str3);
                jSONObject3.put("goneToSchoolCode", i6);
                jSONObject3.put("educationLevelCode", i4);
                jSONObject3.put("workStatusCode", i8);
                jSONObject3.put("workStatus", workStatus);
                jSONObject3.put("mobile_no", mobilenumber);
                jSONObject3.put("mobile_network_name", genderActivity2.am);
                jSONObject3.put("update_type", "update_gender");
                jSONObject3.put("banks_name", genderActivity2.ar);
                jSONObject3.put("branch_code", genderActivity2.aq);
                jSONObject3.put("bank_address", genderActivity2.as);
                jSONObject3.put("account_title", genderActivity2.at);
                jSONObject3.put("account_number", genderActivity2.au);
                jSONObject3.put("lastWeekWorkingHours", i7);
                jSONObject3.put("employmentCode", i5);
                jSONObject3.put("employmentStatus", employment_status);
                jSONObject3.put("mobile_no", mobilenumber);
                jSONObject3.put("endBy", genderActivity2.ac.z());
                jSONObject3.put("endByIp", ipAddress);
                jSONArray.put(0, jSONObject3);
                jSONObject.put("rosterList", jSONArray);
                genderActivity2.ad.setCancelable(false);
                genderActivity2.ad.setMessage("Please Wait...");
                genderActivity2.ad.setProgressStyle(0);
                genderActivity2.ad.show();
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(genderActivity2.ac.k()), ivas.gov.bisp.enumeration.bK.b.b(genderActivity2.ac.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(genderActivity2.ac.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(genderActivity2.ac.m());
                Object[] objArr = new Object[1];
                a(1 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{155, 206, 47081, 19644, 51633, 16287, 43519, 60539, 22769, 20533, 56595, 34461, 55744, 25552, 61576, 37396, 50531, 30573, 33773, 61371, 45730, 6896}, objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                am amVar = new am(genderActivity2, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new C0299v(genderActivity2), new A(genderActivity2));
                amVar.m = new z(130000, 0, 0.0f);
                amVar.k = false;
                a.b(genderActivity2).c(amVar);
                int i12 = c + 27;
                d = i12 % 128;
                int i13 = i12 % 2;
            } catch (JSONException unused3) {
            }
            dialogInterface.cancel();
        }

        private static void a(int i, char[] cArr, Object[] objArr) {
            int i2 = 2 % 2;
            g gVar = new g();
            char[] cArrB = g.b(d$s40$32 ^ (-3439381718914712265L), cArr, i);
            gVar.a = 4;
            while (gVar.a < cArrB.length) {
                int i3 = $10 + 59;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                gVar.c = gVar.a - 4;
                cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$32 ^ (-3439381718914712265L))));
                gVar.a++;
            }
            String str = new String(cArrB, 4, cArrB.length - 4);
            int i5 = $11 + 45;
            $10 = i5 % 128;
            if (i5 % 2 == 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ad = new ProgressDialog(this);
        Intent intent = getIntent();
        this.ae = (RosterItem) intent.getSerializableExtra("roster_data");
        intent.getIntExtra("roster_index", 0);
        this.ac = new SessionManager(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.af = (EditText) findViewById(R.id.et_cnic);
        this.ay = (TextView) findViewById(R.id.tv_nser_gender);
        this.aC = (RadioGroup) findViewById(R.id.rg_gender);
        this.aB = (RadioButton) findViewById(R.id.rb_male);
        this.ax = (RadioButton) findViewById(R.id.rb_female);
        this.az = (RadioButton) findViewById(R.id.rb_trans_gender);
        this.aw = (TextView) findViewById(R.id.btn_update);
        this.al = (TextView) findViewById(R.id.btn_validate);
        this.ag = (ImageView) findViewById(R.id.iv_back);
        ((TextView) findViewById(R.id.tv_heading)).setText("Update Gender");
        this.ag.setOnClickListener(this);
        this.aw.setOnClickListener(this);
        this.al.setOnClickListener(this);
        this.aC.setOnCheckedChangeListener(this);
        this.af.addTextChangedListener(new OooO0OO());
        this.ai = this.ae.getHhid();
        this.ae.gethH_Name();
        this.aj = this.ae.isIs_Benificiary();
        this.ak = this.ae.getMessage();
        this.aP = this.ae.getCnic();
        this.aV = this.ae.getDisabilityCode();
        this.aE = this.ae.getDisabilityStatus();
        this.aF = this.ae.getDiscrepancy_status();
        this.aG = this.ae.getDob();
        this.aH = this.ae.get_educationLevelCode();
        this.aK = this.ae.get_employmentCode();
        this.aT = this.ae.getEmployment_status();
        this.aJ = this.ae.getForm_no();
        this.aI = this.ae.getGender();
        this.aQ = this.ae.get_goneToSchoolCode();
        this.aR = this.ae.getHavingChronicDiseaseCode();
        this.aS = this.ae.getHhMemberNames();
        this.aN = this.ae.isLiterate();
        this.aO = this.ae.get_lastWeekWorkingHours();
        this.aM = this.ae.getMaritalStatus();
        this.aU = this.ae.getMaritalStatusCode();
        this.aL = this.ae.getMessage();
        this.aD = this.ae.getRelationToHouseholdHead();
        this.an = this.ae.getrId();
        this.ao = this.ae.getWorkStatus();
        this.aA = this.ae.get_workStatusCode();
        this.ap = this.ae.getMobilenumber();
        this.am = this.ae.getMobile_network();
        this.ar = this.ae.getBank_name();
        this.aq = this.ae.getBranch_code();
        this.as = this.ae.getBank_address();
        this.at = this.ae.getAcc_title();
        this.au = this.ae.getAcc_number();
        this.av = this.ae.getDupRosterList();
        this.af.setText(ag.b(this.aP));
        this.ay.setText(this.aI);
        Object obj = null;
        if (!this.aP.equals(BuildConfig.FLAVOR)) {
            int i2 = p + 87;
            q = i2 % 128;
            int i3 = i2 % 2;
            if (!this.aP.equalsIgnoreCase("NA")) {
                int i4 = p + 5;
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    u();
                    return;
                } else {
                    u();
                    obj.hashCode();
                    throw null;
                }
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        builder.setView(viewInflate);
        AlertDialog alertDialogK = j.k(builder, false);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        editText.addTextChangedListener(new av(this).new buW(editText));
        textView.setOnClickListener(new L(this, editText, alertDialogK));
        int i5 = q + 115;
        p = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(byte b, int i, short s, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4;
        int i5 = 2 % 2;
        f fVar = new f();
        StringBuilder sb = new StringBuilder();
        int i6 = i2 + ((int) (((long) d$s27$951) ^ (-1399694120703284637L)));
        if (i6 == -1) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = b$s29$951;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $11 + 103;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        bArr2[i9] = (byte) (((long) bArr[i9]) - 1399694120703284637L);
                    } else {
                        bArr2[i9] = (byte) (((long) bArr[i9]) ^ (-1399694120703284637L));
                        i9++;
                    }
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i11 = $11 + 9;
                $10 = i11 % 128;
                i6 = (byte) (i11 % 2 != 0 ? ((byte) (((long) b$s29$951[i3 % ((int) (((long) a$s26$951) / (-1399694120703284637L)))]) & (-1399694120703284637L))) >> ((int) (((long) d$s27$951) - 1399694120703284637L)) : ((byte) (((long) b$s29$951[i3 + ((int) (((long) a$s26$951) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$951) ^ (-1399694120703284637L))));
            } else {
                i6 = (short) (((short) (((long) c$s30$951[i3 + ((int) (((long) a$s26$951) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$951) ^ (-1399694120703284637L))));
            }
        }
        if (i6 > 0) {
            int i12 = ((i3 + i6) - 2) + ((int) (((long) a$s26$951) ^ (-1399694120703284637L)));
            if (z) {
                int i13 = $10 + 99;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            fVar.d = i12 + i4;
            fVar.e = (char) (((int) (((long) e$s28$951) ^ (-1399694120703284637L))) + i);
            sb.append(fVar.e);
            fVar.a = fVar.e;
            byte[] bArr3 = b$s29$951;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    int i16 = $10 + 27;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    bArr4[i15] = (byte) (((long) bArr3[i15]) ^ (-1399694120703284637L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            fVar.c = 1;
            while (fVar.c < i6) {
                int i18 = $10 + 101;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                if (z2) {
                    byte[] bArr5 = b$s29$951;
                    int i20 = fVar.d;
                    fVar.d = i20 - 1;
                    fVar.e = (char) (fVar.a + (((byte) (((byte) (((long) bArr5[i20]) ^ (-1399694120703284637L))) + s)) ^ b));
                } else {
                    short[] sArr = c$s30$951;
                    int i21 = fVar.d;
                    fVar.d = i21 - 1;
                    fVar.e = (char) (fVar.a + (((short) (((short) (((long) sArr[i21]) ^ (-1399694120703284637L))) + s)) ^ b));
                }
                sb.append(fVar.e);
                fVar.a = fVar.e;
                fVar.c++;
            }
        }
        objArr[0] = sb.toString();
    }
}
