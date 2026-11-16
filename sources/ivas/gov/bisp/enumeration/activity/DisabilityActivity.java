package ivas.gov.bisp.enumeration.activity;

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
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdateDisablilityRosterListActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p036bi.C0159al;
import ivas.gov.bisp.enumeration.p036bi.C0188q;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0190s;
import ivas.gov.bisp.enumeration.p036bi.X;
import ivas.gov.bisp.enumeration.p036bi.Y;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DisabilityActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s47$749 = 32118;
    private static int b$s46$749 = 1174568310;
    private static long d$s45$749 = 1751064338497517763L;
    private static int p = 1;
    private static int q;
    public String aA;
    public String aB;
    public int aC;
    public boolean aD;
    public String aE;
    public boolean aF;
    public String aG;
    public String aH;
    public String aI;
    public String aJ;
    public int aK;
    public String aL;
    public int aM;
    public String aN;
    public String aO;
    public int aQ;
    public int aR;
    public String aS;
    public String aT;
    public int aU;
    public String aV;
    public ArrayList<Item> ac;
    public Spinner ad;
    public ImageView ae;
    public EditText af;
    public TextView ag;
    public TextView ah;
    public TextView ai;
    public ProgressDialog aj;
    public RosterItem ak;
    public String al;
    public String am;
    public int an;
    public String ao;
    public int ap;
    public long aq;
    public int ar;
    public String as;
    public String at;
    public String au;
    public int av;
    public String aw;
    public SessionManager ax;
    public String ay;
    public boolean aP = false;
    public double az = 0.0d;

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            DisabilityActivity disabilityActivity = DisabilityActivity.this;
            w wVar = new w(disabilityActivity, disabilityActivity.ax);
            int i3 = b;
            int i4 = (-2) - (((i3 ^ 114) + ((i3 & 114) << 1)) ^ (-1));
            a = i4 % 128;
            if (i4 % 2 == 0) {
                wVar.execute(new Void[0]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 101;
        p = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 113;
        p = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_disability;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) UpdateDisablilityRosterListActivity.class));
        finish();
        int i2 = p + 97;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(DisabilityActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = b;
            int i4 = ((i3 & (-112)) | ((~i3) & 111)) + ((i3 & 111) << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                RosterItem rosterItem = DisabilityActivity.this.ak;
                throw null;
            }
            intent.putExtra("roster_data", DisabilityActivity.this.ak);
            DisabilityActivity.this.startActivity(intent);
            int i5 = (-2) - ((b + 28) ^ (-1));
            a = i5 % 128;
            int i6 = i5 % 2;
            dialogInterface.cancel();
            int i7 = b + 61;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    public class OooO00o implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (-2) - ((((i5 | 64) << 1) - (i5 ^ 64)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b + 83;
            a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 15;
            int i4 = (i3 - (~((i2 ^ 15) | i3))) - 1;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                DisabilityActivity.this.ag.setVisibility(95);
            } else {
                DisabilityActivity.this.ag.setVisibility(8);
            }
            DisabilityActivity disabilityActivity = DisabilityActivity.this;
            int i5 = b;
            int i6 = i5 & 23;
            int i7 = ((((i5 ^ 23) | i6) << 1) - (~(-((i5 | 23) & (~i6))))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            disabilityActivity.ai.setVisibility(0);
            int i9 = a;
            int i10 = ((i9 & (-96)) | ((~i9) & 95)) + ((95 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        r1.put("Cnic", r0);
        r1.put("SessionId", ivas.gov.bisp.enumeration.BISPApplication.c().s);
        r1.put("IpAddress", ivas.gov.bisp.enumeration.bK.ac.h(true));
        r1.put("sessionUserCnic", r15.ax.r());
        r1.put("call_origin", 100);
        r2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(r1.toString(), ivas.gov.bisp.enumeration.bK.b.b(r15.ax.k()), ivas.gov.bisp.enumeration.bK.b.b(r15.ax.m())));
        r0 = ivas.gov.bisp.enumeration.bK.b.b(r15.ax.k());
        r1 = ivas.gov.bisp.enumeration.bK.b.b(r15.ax.m());
        r3 = new java.lang.Object[1];
        a(super.getResources().getString(ivas.gov.bisp.enumeration.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{50613, 17661, 43956, 59596}, (char) (super.getResources().getString(ivas.gov.bisp.enumeration.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 9472), new char[]{20997, 27583, 1065, 36133}, new char[]{60698, 13608, 10406, 35318, 12036, 60665, 1484, 20331, 30040, 5852, 2008, 30985, 48473, 6036, 41389, 51901, 28886, 35480}, r3);
        r2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((java.lang.String) r3[0]).intern(), r0, r1));
        ivas.gov.bisp.enumeration.p024ax.ax.h(r15.aj, "Please wait!");
        ivas.gov.bisp.enumeration.p024ax.ax.e(r2, r15, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new ivas.gov.bisp.enumeration.p036bi.D(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0129, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x012a, code lost:
    
        r1 = new android.app.AlertDialog.Builder(r15);
        r1.setTitle("Session Expire");
        r1.setMessage("Session Expire Please Login Again.!");
        r1.setCancelable(true);
        r1.setPositiveButton("Confirm", new ivas.gov.bisp.enumeration.activity.DisabilityActivity.OooO0O0(r15));
        r1.create().show();
        r1 = ivas.gov.bisp.enumeration.activity.DisabilityActivity.p + 105;
        ivas.gov.bisp.enumeration.activity.DisabilityActivity.q = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0156, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0158, code lost:
    
        r0 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x015b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r15.ax.k().length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r15.ax.k().length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        r0 = r15.aH.replace("-", net.sqlcipher.BuildConfig.FLAVOR);
        r1 = new org.json.JSONObject();
        r2 = new org.json.JSONObject();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.DisabilityActivity.u():void");
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int id = view.getId();
        if (id == R.id.btn_update) {
            if (!this.aP) {
                Toast.makeText(this, "Please select a disability", 0).show();
                int i2 = p + 67;
                q = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.aV = this.ax.p();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Phone Number.!");
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Please Comfirm your Phone # ");
            sbW.append(this.aV);
            builder.setMessage(sbW.toString());
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new OooO0OO());
            builder.setNegativeButton("No", new OooO0o());
            builder.create().show();
            return;
        }
        if (id == R.id.btn_validate) {
            u();
            int i4 = q + 93;
            p = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = q + 25;
        int i6 = i5 % 128;
        p = i6;
        int i7 = i5 % 2;
        if (id == R.id.iv_back) {
            int i8 = i6 + 123;
            q = i8 % 128;
            int i9 = i8 % 2;
            onBackPressed();
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.aj = new ProgressDialog(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        Intent intent = getIntent();
        this.ak = (RosterItem) intent.getSerializableExtra("roster_data");
        intent.getIntExtra("roster_index", 0);
        this.ax = new SessionManager(this);
        this.af = (EditText) findViewById(R.id.et_cnic);
        this.ad = (Spinner) findViewById(R.id.sp_disability);
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.ag = (TextView) findViewById(R.id.btn_update);
        this.ai = (TextView) findViewById(R.id.btn_validate);
        this.ah = (TextView) findViewById(R.id.tv_roster_disability);
        this.ae.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ai.setVisibility(8);
        this.ag.setVisibility(0);
        this.af.addTextChangedListener(new OooO00o());
        this.aE = this.ak.getHhid();
        this.ak.gethH_Name();
        this.aF = this.ak.isIs_Benificiary();
        this.aG = this.ak.getMessage();
        this.aH = this.ak.getCnic();
        this.aK = this.ak.getDisabilityCode();
        this.aT = this.ak.getDisabilityStatus();
        this.aJ = this.ak.getDiscrepancy_status();
        this.aI = this.ak.getDob();
        this.aQ = this.ak.get_educationLevelCode();
        this.aR = this.ak.get_employmentCode();
        this.aS = this.ak.getEmployment_status();
        this.aN = this.ak.getForm_no();
        this.aO = this.ak.getGender();
        this.aM = this.ak.get_goneToSchoolCode();
        this.aU = this.ak.getHavingChronicDiseaseCode();
        this.aL = this.ak.getHhMemberNames();
        this.aD = this.ak.isLiterate();
        this.an = this.ak.get_lastWeekWorkingHours();
        this.ao = this.ak.getMaritalStatus();
        this.ap = this.ak.getMaritalStatusCode();
        this.am = this.ak.getMessage();
        this.ar = this.ak.getRelationToHouseholdHead();
        this.aq = this.ak.getrId();
        this.as = this.ak.getWorkStatus();
        this.at = this.ak.getMobilenumber();
        this.au = this.ak.getMobile_network();
        this.aA = this.ak.getBank_name();
        this.av = this.ak.getBranch_code();
        this.aw = this.ak.getBank_address();
        this.al = this.ak.getAcc_title();
        this.ay = this.ak.getAcc_number();
        this.aC = this.ak.get_workStatusCode();
        this.aB = this.ak.getDupRosterList();
        this.af.setText(ag.b(this.aH));
        this.ah.setText(this.aT);
        new au(this, "disability_status", getResources().getString(R.string.disablity_status), this.ad, new C0159al(this)).execute(new Void[0]);
        if (!this.aH.equals(BuildConfig.FLAVOR)) {
            int i2 = q + 43;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                this.aH.equalsIgnoreCase("NA");
                throw null;
            }
            if (!this.aH.equalsIgnoreCase("NA")) {
                u();
                int i3 = q + 59;
                p = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        builder.setView(viewInflate);
        AlertDialog alertDialogK = ivas.gov.bisp.enumeration.p091n.j.k(builder, false);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        editText.addTextChangedListener(new av(this).new buW(editText));
        textView.setOnClickListener(new ViewOnClickListenerC0190s(this, editText, alertDialogK));
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 0;
        private static int d = 1;
        private static long d$s51$32 = -7608782913609639734L;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            int i2 = 2 % 2;
            DisabilityActivity disabilityActivity = DisabilityActivity.this;
            String str2 = disabilityActivity.aE;
            boolean z = disabilityActivity.aF;
            String str3 = disabilityActivity.aG;
            String str4 = disabilityActivity.aH;
            int optionId = disabilityActivity.ac.get(disabilityActivity.ad.getSelectedItemPosition()).getOptionId();
            DisabilityActivity disabilityActivity2 = DisabilityActivity.this;
            String option = disabilityActivity2.ac.get(disabilityActivity2.ad.getSelectedItemPosition()).getOption();
            DisabilityActivity disabilityActivity3 = DisabilityActivity.this;
            disabilityActivity.ak = new RosterItem(str2, z, str3, BuildConfig.FLAVOR, str4, optionId, option, disabilityActivity3.aJ, disabilityActivity3.aI, disabilityActivity3.aQ, disabilityActivity3.aR, disabilityActivity3.aS, disabilityActivity3.aN, disabilityActivity3.aO, disabilityActivity3.aM, disabilityActivity3.aU, disabilityActivity3.aL, disabilityActivity3.aD, disabilityActivity3.an, disabilityActivity3.ao, disabilityActivity3.ap, disabilityActivity3.am, disabilityActivity3.ar, disabilityActivity3.aq, disabilityActivity3.as, disabilityActivity3.aC, disabilityActivity3.aB, disabilityActivity3.at, disabilityActivity3.au, disabilityActivity3.aA, disabilityActivity3.av, disabilityActivity3.aw, disabilityActivity3.al, disabilityActivity3.ay);
            DisabilityActivity disabilityActivity4 = DisabilityActivity.this;
            RosterItem rosterItem = disabilityActivity4.ak;
            Object hhid = rosterItem.getHhid();
            rosterItem.gethH_Name();
            rosterItem.isIs_Benificiary();
            rosterItem.getMessage();
            rosterItem.getDiscrepancy_status();
            rosterItem.getCnic();
            int i3 = rosterItem.get_educationLevelCode();
            int disabilityCode = rosterItem.getDisabilityCode();
            String disabilityStatus = rosterItem.getDisabilityStatus();
            int i4 = rosterItem.get_employmentCode();
            String employment_status = rosterItem.getEmployment_status();
            String form_no = rosterItem.getForm_no();
            String gender = rosterItem.getGender();
            int i5 = rosterItem.get_goneToSchoolCode();
            int havingChronicDiseaseCode = rosterItem.getHavingChronicDiseaseCode();
            String hhMemberNames = rosterItem.getHhMemberNames();
            String dob = rosterItem.getDob();
            boolean zIsLiterate = rosterItem.isLiterate();
            int i6 = rosterItem.get_lastWeekWorkingHours();
            int maritalStatusCode = rosterItem.getMaritalStatusCode();
            String maritalStatus = rosterItem.getMaritalStatus();
            rosterItem.getMessage();
            String mobilenumber = rosterItem.getMobilenumber();
            int relationToHouseholdHead = rosterItem.getRelationToHouseholdHead();
            long j = rosterItem.getrId();
            String workStatus = rosterItem.getWorkStatus();
            int i7 = rosterItem.get_workStatusCode();
            if (zIsLiterate) {
                int i8 = d + 25;
                c = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 0;
                }
                str = "1";
            } else {
                str = "0";
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String str5 = str;
                String ipAddress = Formatter.formatIpAddress(((WifiManager) disabilityActivity4.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                jSONObject.put("house_hold_id", hhid);
                jSONObject.put("is_pmt", 0);
                jSONObject.put("type", "update_disablity");
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("rId", j);
                jSONObject3.put("cnicEnc", disabilityActivity4.aH);
                jSONObject3.put("cnic", disabilityActivity4.aH);
                jSONObject3.put("hhMemberNames", hhMemberNames);
                jSONObject3.put("hhMemberNamesEnc", hhMemberNames);
                jSONObject3.put("dob", dob);
                jSONObject3.put("age", disabilityActivity4.az);
                jSONObject3.put("maritalStatus", maritalStatus);
                jSONObject3.put("maritalStatusCode", maritalStatusCode);
                jSONObject3.put("gender", gender);
                jSONObject3.put("relationToHhHead", relationToHouseholdHead);
                jSONObject3.put("formNo", form_no);
                jSONObject3.put("disabilityStatus", disabilityStatus);
                jSONObject3.put("disabilityCode", disabilityCode);
                jSONObject3.put("havingChronicDiseaseCode", havingChronicDiseaseCode);
                jSONObject3.put("isLiterate", str5);
                jSONObject3.put("goneToSchoolCode", i5);
                jSONObject3.put("mobile_no", mobilenumber);
                jSONObject3.put("mobile_network_name", disabilityActivity4.au);
                jSONObject3.put("update_type", "update_disablity");
                jSONObject3.put("banks_name", disabilityActivity4.aA);
                jSONObject3.put("branch_code", disabilityActivity4.av);
                jSONObject3.put("bank_address", disabilityActivity4.aw);
                jSONObject3.put("account_title", disabilityActivity4.al);
                jSONObject3.put("account_number", disabilityActivity4.ay);
                jSONObject3.put("educationLevelCode", i3);
                jSONObject3.put("workStatusCode", i7);
                jSONObject3.put("workStatus", workStatus);
                jSONObject3.put("lastWeekWorkingHours", i6);
                jSONObject3.put("employmentCode", i4);
                jSONObject3.put("employmentStatus", employment_status);
                jSONObject3.put("endBy", disabilityActivity4.ax.z());
                jSONObject3.put("endByIp", ipAddress);
                jSONArray.put(0, jSONObject3);
                jSONObject.put("rosterList", jSONArray);
                disabilityActivity4.aj.setCancelable(false);
                disabilityActivity4.aj.setMessage("Please Wait...");
                disabilityActivity4.aj.setProgressStyle(0);
                disabilityActivity4.aj.show();
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(disabilityActivity4.ax.k()), b.b(disabilityActivity4.ax.m())));
                byte[] bArrB = b.b(disabilityActivity4.ax.k());
                byte[] bArrB2 = b.b(disabilityActivity4.ax.m());
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getScrollBarSize() >> 8) + 4931, new char[]{54843, 50525, 61580, 61382, 39702, 46660, 42414, 20692, 19461, 31553, 5781, 1533, 12558, 11372, 56240, 63202, 57911, 37233}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                C0188q c0188q = new C0188q(disabilityActivity4, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new X(disabilityActivity4), new Y(disabilityActivity4));
                c0188q.m = new z(130000, 0, 0.0f);
                c0188q.k = false;
                a.b(disabilityActivity4).c(c0188q);
            } catch (JSONException unused) {
            }
            dialogInterface.cancel();
            int i10 = d + 117;
            c = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 25 / 0;
            }
        }

        private static void a(int i, char[] cArr, Object[] objArr) {
            int i2 = 2 % 2;
            m mVar = new m();
            mVar.d = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            mVar.e = 0;
            while (mVar.e < cArr.length) {
                int i3 = $11 + 63;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d))) ^ (d$s51$32 ^ 6031393033645231780L);
                mVar.e++;
                int i5 = $11 + 37;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            char[] cArr2 = new char[length];
            mVar.e = 0;
            int i7 = $10 + 15;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 3;
            }
            while (mVar.e < cArr.length) {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                mVar.e++;
            }
            objArr[0] = new String(cArr2);
        }
    }

    private static void a(int i, char[] cArr, char c, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        o.j jVar = new o.j();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        jVar.a = 0;
        while (jVar.a < length3) {
            int i3 = $11 + 83;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (jVar.a + 2) % 4;
            int i6 = (jVar.a + 3) % 4;
            jVar.e = (char) (((cArr4[jVar.a % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = jVar.e;
            cArr6[jVar.a] = (char) (((((long) (cArr4[i6] ^ cArr3[jVar.a])) ^ (d$s45$749 ^ (-1116422076781920906L))) ^ ((long) ((int) (((long) b$s46$749) ^ (-1116422076781920906L))))) ^ ((long) ((char) (((long) a$s47$749) ^ (-1116422076781920906L)))));
            jVar.a++;
        }
        String str = new String(cArr6);
        int i7 = $11 + 19;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }
}
