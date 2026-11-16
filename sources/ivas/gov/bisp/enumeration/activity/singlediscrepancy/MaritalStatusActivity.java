package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.dd.C;
import ivas.gov.bisp.enumeration.dd.C0293n;
import ivas.gov.bisp.enumeration.dd.C0301y;
import ivas.gov.bisp.enumeration.dd.D;
import ivas.gov.bisp.enumeration.dd.W;
import ivas.gov.bisp.enumeration.dd.al;
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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import net.sqlcipher.BuildConfig;
import o.d;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MaritalStatusActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long d$s51$847 = 4690714783308752609L;
    private static int p = 0;
    private static int q = 1;
    public String aA;
    public int aB;
    public String aC;
    public String aD;
    public String aE;
    public String aF;
    public boolean aG;
    public String aH;
    public String aI;
    public String aJ;
    public String aK;
    public int aL;
    public String aM;
    public String aN;
    public String aO;
    public RosterItem aP;
    public String aQ;
    public int aR;
    public int aS;
    public int aT;
    public int aU;
    public boolean aV = false;
    public ArrayList<Item> ac;
    public Spinner ad;
    public ImageView ae;
    public EditText af;
    public TextView ag;
    public TextView ah;
    public TextView ai;
    public TextView aj;
    public ProgressDialog ak;
    public String al;
    public int am;
    public boolean an;
    public int ao;
    public String ap;
    public int aq;
    public String ar;
    public long as;
    public String at;
    public String au;
    public String av;
    public int aw;
    public String ax;
    public String ay;
    public SessionManager az;

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            MaritalStatusActivity maritalStatusActivity = MaritalStatusActivity.this;
            w wVar = new w(maritalStatusActivity, maritalStatusActivity.az);
            int i3 = b + 11;
            a = i3 % 128;
            int i4 = i3 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i5 = b + 103;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) UpdateMaritalRosterListActivity.class));
        finish();
        int i2 = p + 17;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p + 9;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            view.getId();
            throw null;
        }
        int id = view.getId();
        if (id == R.id.btn_update) {
            if (!this.aV) {
                Toast.makeText(this, "Please select a Marital status", 0).show();
                return;
            }
            this.aE = this.az.p();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Phone Number.!");
            StringBuilder sbW = j.w("Please Comfirm your Phone # ");
            sbW.append(this.aE);
            builder.setMessage(sbW.toString());
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new OooO00o());
            builder.setNegativeButton("No", new OooO0O0());
            builder.create().show();
            return;
        }
        if (id == R.id.btn_validate) {
            u();
            return;
        }
        int i3 = q + 115;
        int i4 = i3 % 128;
        p = i4;
        if (i3 % 2 != 0) {
            int i5 = 45 / 0;
            if (id != R.id.iv_back) {
                return;
            }
        } else if (id != R.id.iv_back) {
            return;
        }
        int i6 = i4 + 17;
        q = i6 % 128;
        int i7 = i6 % 2;
        onBackPressed();
        int i8 = q + 121;
        p = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q + 35;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        q = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_marital_status;
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
            jSONObject.put("sessionUserCnic", this.az.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.az.k()), b.b(this.az.m())));
            byte[] bArrB = b.b(this.az.k());
            byte[] bArrB2 = b.b(this.az.m());
            Object[] objArr = new Object[1];
            a(getPackageName().codePointAt(13) + 1765, new char[]{10246, 12088, 9738, 15647, 13407, 2943, 581, 6569, 4283, 6023, 28312, 26101, 31957, 29659, 19232, 16950, 22819, 20532}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ak, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new W(this));
            int i2 = q + 7;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            RosterItem rosterItem;
            int i2 = 2 % 2;
            Intent intent = new Intent(MaritalStatusActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = a;
            int i4 = i3 & 35;
            int i5 = ((((i3 ^ 35) | i4) << 1) - (~(-((i3 | 35) & (~i4))))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                rosterItem = MaritalStatusActivity.this.aP;
                int i6 = 95 / 0;
            } else {
                rosterItem = MaritalStatusActivity.this.aP;
            }
            intent.putExtra("roster_data", rosterItem);
            MaritalStatusActivity.this.startActivity(intent);
            int i7 = a;
            int i8 = ((i7 | 125) << 1) - (i7 ^ 125);
            b = i8 % 128;
            int i9 = i8 % 2;
            dialogInterface.cancel();
            if (i9 == 0) {
                int i10 = 85 / 0;
            }
        }
    }

    public class OooO0OO implements TextWatcher {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 & (-92)) | ((~i5) & 91)) + ((i5 & 91) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = i5 & 31;
            int i7 = -(-((i5 ^ 31) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextView textView;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 17) << 1) - (i3 ^ 17);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                textView = MaritalStatusActivity.this.ai;
                i = 41;
            } else {
                textView = MaritalStatusActivity.this.ai;
                i = 8;
            }
            textView.setVisibility(i);
            int i5 = b + 97;
            a = i5 % 128;
            int i6 = i5 % 2;
            MaritalStatusActivity.this.ag.setVisibility(0);
            int i7 = a;
            int i8 = i7 & 11;
            int i9 = (((i7 ^ 11) | i8) << 1) - ((i7 | 11) & (~i8));
            b = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public final void u() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.aF);
            jSONObject.put("cnic", this.aK);
            jSONObject.put("r_id", this.as);
            jSONObject.put("update_type", "marital_status");
            this.ak.setCancelable(false);
            this.ak.setMessage("Please Wait...");
            this.ak.setProgressStyle(0);
            this.ak.show();
            if (this.az.k().length() > 0) {
                int i2 = p + 21;
                q = i2 % 128;
                if (i2 % 2 != 0) {
                    w(this.aK);
                    return;
                } else {
                    w(this.aK);
                    int i3 = 94 / 0;
                    return;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Session Expire");
            builder.setMessage("Session Expire Please Login Again.!");
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new OooO0o());
            builder.create().show();
            int i4 = q + 103;
            p = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ak = new ProgressDialog(this);
        Intent intent = getIntent();
        this.aP = (RosterItem) intent.getSerializableExtra("roster_data");
        intent.getIntExtra("roster_index", 0);
        this.az = new SessionManager(this);
        this.ad = (Spinner) findViewById(R.id.sp_merital_status);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.af = (EditText) findViewById(R.id.et_cnic);
        this.ai = (TextView) findViewById(R.id.btn_update);
        this.ag = (TextView) findViewById(R.id.btn_validate);
        this.ah = (TextView) findViewById(R.id.tv_heading);
        this.aj = (TextView) findViewById(R.id.tv_nser_marital_status);
        this.ah.setText("Marital Status");
        this.ae.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.ag.setVisibility(8);
        this.ai.setVisibility(0);
        this.af.addTextChangedListener(new OooO0OO());
        this.aF = this.aP.getHhid();
        this.aG = this.aP.isIs_Benificiary();
        this.aH = this.aP.getMessage();
        this.aK = this.aP.getCnic();
        this.aT = this.aP.getDisabilityCode();
        this.aJ = this.aP.getDisabilityStatus();
        this.aI = this.aP.getDiscrepancy_status();
        this.aQ = this.aP.getDob();
        this.aR = this.aP.get_educationLevelCode();
        this.aS = this.aP.get_employmentCode();
        this.aN = this.aP.getEmployment_status();
        this.aO = this.aP.getForm_no();
        this.aM = this.aP.getGender();
        this.aU = this.aP.get_goneToSchoolCode();
        this.aL = this.aP.getHavingChronicDiseaseCode();
        this.aD = this.aP.getHhMemberNames();
        this.an = this.aP.isLiterate();
        this.ao = this.aP.get_lastWeekWorkingHours();
        this.ap = this.aP.getMaritalStatus();
        this.am = this.aP.getMaritalStatusCode();
        this.ar = this.aP.getMessage();
        this.aq = this.aP.getRelationToHouseholdHead();
        this.as = this.aP.getrId();
        this.at = this.aP.getWorkStatus();
        this.aB = this.aP.get_workStatusCode();
        this.au = this.aP.getMobilenumber();
        this.aA = this.aP.getMobile_network();
        this.av = this.aP.getBank_name();
        this.aw = this.aP.getBranch_code();
        this.al = this.aP.getBank_address();
        this.ay = this.aP.getAcc_title();
        this.aC = this.aP.getAcc_number();
        this.ax = this.aP.getDupRosterList();
        this.af.setText(ag.b(this.aK));
        this.aj.setText(this.ap);
        new au(this, "marital_status", getResources().getString(R.string.marital_status), this.ad, new C0301y(this)).execute(new Void[0]);
        if (!this.aK.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            int i2 = q + 83;
            p = i2 % 128;
            int i3 = i2 % 2;
            if (!this.aK.equalsIgnoreCase("NA")) {
                int i4 = q + 49;
                p = i4 % 128;
                int i5 = i4 % 2;
                u();
                if (i5 != 0) {
                    int i6 = 17 / 0;
                    return;
                }
                return;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        builder.setView(viewInflate);
        AlertDialog alertDialogK = j.k(builder, false);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        editText.addTextChangedListener(new av(this).new buW(editText));
        textView.setOnClickListener(new C(this, editText, alertDialogK));
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 0;
        private static int[] c$s11$32 = {1368685550, 1751275272, 1663215685, -1539444131, 262363775, 480671479, -1128207524, 954710416, 990895874, 529439292, -1345043038, -1345042668, 738519479, -1291639637, -1259880003, 590312064, 1532200068, 273618977};
        private static int d = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            String str2;
            int i2;
            double dC;
            int i3 = 2 % 2;
            MaritalStatusActivity maritalStatusActivity = MaritalStatusActivity.this;
            maritalStatusActivity.aP = new RosterItem(maritalStatusActivity.aF, maritalStatusActivity.aG, maritalStatusActivity.aH, BuildConfig.FLAVOR, maritalStatusActivity.aK, maritalStatusActivity.aT, maritalStatusActivity.aJ, maritalStatusActivity.aI, maritalStatusActivity.aQ, maritalStatusActivity.aR, maritalStatusActivity.aS, maritalStatusActivity.aN, maritalStatusActivity.aO, maritalStatusActivity.aM, maritalStatusActivity.aU, maritalStatusActivity.aL, maritalStatusActivity.aD, maritalStatusActivity.an, maritalStatusActivity.ao, maritalStatusActivity.ap, maritalStatusActivity.am, maritalStatusActivity.ar, maritalStatusActivity.aq, maritalStatusActivity.as, maritalStatusActivity.at, maritalStatusActivity.aB, maritalStatusActivity.ax, maritalStatusActivity.au, maritalStatusActivity.aA, maritalStatusActivity.av, maritalStatusActivity.aw, maritalStatusActivity.al, maritalStatusActivity.ay, maritalStatusActivity.aC);
            MaritalStatusActivity maritalStatusActivity2 = MaritalStatusActivity.this;
            RosterItem rosterItem = maritalStatusActivity2.aP;
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
            if (zIsLiterate) {
                int i9 = c + 55;
                d = i9 % 128;
                int i10 = i9 % 2;
                str = "1";
            } else {
                str = "0";
            }
            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
                Calendar calendar = Calendar.getInstance();
                str2 = str;
                i2 = disabilityCode;
                try {
                    calendar.setTimeInMillis(date.getTime());
                    int i11 = calendar.get(1);
                    dC = ag.c(calendar.get(5), calendar.get(2), i11);
                } catch (ParseException unused) {
                    dC = 0.0d;
                }
            } catch (ParseException unused2) {
                str2 = str;
                i2 = disabilityCode;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String ipAddress = Formatter.formatIpAddress(((WifiManager) maritalStatusActivity2.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                jSONObject.put("house_hold_id", hhid);
                jSONObject.put("is_pmt", 0);
                jSONObject.put("type", "update_marital_status");
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("rId", j);
                jSONObject3.put("cnicEnc", maritalStatusActivity2.aK);
                jSONObject3.put("cnic", maritalStatusActivity2.aK);
                jSONObject3.put("hhMemberNames", hhMemberNames);
                jSONObject3.put("hhMemberNamesEnc", hhMemberNames);
                jSONObject3.put("dob", dob);
                jSONObject3.put("age", dC);
                jSONObject3.put("maritalStatus", maritalStatus);
                jSONObject3.put("maritalStatusCode", maritalStatusCode);
                jSONObject3.put("gender", gender);
                jSONObject3.put("relationToHhHead", relationToHouseholdHead);
                jSONObject3.put("formNo", form_no);
                jSONObject3.put("disabilityStatus", disabilityStatus);
                jSONObject3.put("disabilityCode", i2);
                jSONObject3.put("havingChronicDiseaseCode", havingChronicDiseaseCode);
                jSONObject3.put("isLiterate", str2);
                jSONObject3.put("goneToSchoolCode", i6);
                jSONObject3.put("educationLevelCode", i4);
                jSONObject3.put("workStatusCode", i8);
                jSONObject3.put("workStatus", workStatus);
                jSONObject3.put("lastWeekWorkingHours", i7);
                jSONObject3.put("employmentCode", i5);
                jSONObject3.put("employmentStatus", employment_status);
                jSONObject3.put("mobile_no", mobilenumber);
                jSONObject3.put("mobile_network_name", maritalStatusActivity2.aA);
                jSONObject3.put("update_type", "update_marital_status");
                jSONObject3.put("banks_name", maritalStatusActivity2.av);
                jSONObject3.put("branch_code", maritalStatusActivity2.aw);
                jSONObject3.put("bank_address", maritalStatusActivity2.al);
                jSONObject3.put("account_title", maritalStatusActivity2.ay);
                jSONObject3.put("account_number", maritalStatusActivity2.aC);
                jSONObject3.put("endBy", maritalStatusActivity2.az.z());
                jSONObject3.put("endByIp", ipAddress);
                jSONArray.put(0, jSONObject3);
                jSONObject.put("rosterList", jSONArray);
                maritalStatusActivity2.ak.setCancelable(false);
                maritalStatusActivity2.ak.setMessage("Please Wait...");
                maritalStatusActivity2.ak.setProgressStyle(0);
                maritalStatusActivity2.ak.show();
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(maritalStatusActivity2.az.k()), b.b(maritalStatusActivity2.az.m())));
                byte[] bArrB = b.b(maritalStatusActivity2.az.k());
                byte[] bArrB2 = b.b(maritalStatusActivity2.az.m());
                Object[] objArr = new Object[1];
                a(18 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), new int[]{-1461631789, -1549132684, 1914667473, -982660421, -1298332735, -498888743, -643966701, -968068175, -1230665233, -556783737}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                C0293n c0293n = new C0293n(maritalStatusActivity2, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new al(maritalStatusActivity2), new D(maritalStatusActivity2));
                c0293n.m = new z(130000, 0, 0.0f);
                c0293n.k = false;
                a.b(maritalStatusActivity2).c(c0293n);
                int i12 = c + 81;
                d = i12 % 128;
                int i13 = i12 % 2;
            } catch (JSONException unused3) {
            }
            dialogInterface.cancel();
        }

        private static void a(int i, int[] iArr, Object[] objArr) {
            d dVar;
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            d dVar2 = new d();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = c$s11$32;
            if (iArr3 != null) {
                int i4 = $11 + 53;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i5 = $10 + 115;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        iArr2[i2] = (int) (((long) iArr3[i2]) / (-2705551458099060901L));
                        i2 >>= 1;
                    } else {
                        iArr2[i2] = (int) (((long) iArr3[i2]) ^ (-2705551458099060901L));
                        i2++;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = c$s11$32;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i6 = 0;
                while (i6 < length3) {
                    int i7 = $11 + 95;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    iArr6[i6] = (int) (((long) iArr5[i6]) ^ (-2705551458099060901L));
                    i6++;
                    dVar2 = dVar2;
                }
                dVar = dVar2;
                iArr5 = iArr6;
            } else {
                dVar = dVar2;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            d dVar3 = dVar;
            dVar3.a = 0;
            while (dVar3.a < iArr.length) {
                int i9 = $11 + 55;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr[0] = (char) (iArr[dVar3.a] >> 16);
                cArr[1] = (char) iArr[dVar3.a];
                cArr[2] = (char) (iArr[dVar3.a + 1] >> 16);
                cArr[3] = (char) iArr[dVar3.a + 1];
                dVar3.e = (cArr[0] << 16) + cArr[1];
                dVar3.d = (cArr[2] << 16) + cArr[3];
                d.b(iArr4);
                for (int i11 = 0; i11 < 16; i11++) {
                    int i12 = $11 + 87;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    dVar3.e ^= iArr4[i11];
                    dVar3.d = d.c(dVar3.e) ^ dVar3.d;
                    int i14 = dVar3.e;
                    dVar3.e = dVar3.d;
                    dVar3.d = i14;
                }
                int i15 = dVar3.e;
                dVar3.e = dVar3.d;
                dVar3.d = i15;
                dVar3.d ^= iArr4[16];
                dVar3.e ^= iArr4[17];
                int i16 = dVar3.e;
                int i17 = dVar3.d;
                cArr[0] = (char) (dVar3.e >>> 16);
                cArr[1] = (char) dVar3.e;
                cArr[2] = (char) (dVar3.d >>> 16);
                cArr[3] = (char) dVar3.d;
                d.b(iArr4);
                cArr2[dVar3.a * 2] = cArr[0];
                cArr2[(dVar3.a * 2) + 1] = cArr[1];
                cArr2[(dVar3.a * 2) + 2] = cArr[2];
                cArr2[(dVar3.a * 2) + 3] = cArr[3];
                dVar3.a += 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
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
            int i4 = $10 + 81;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) % (((long) mVar.e) | ((long) mVar.d))) + (6031393033645231780L ^ d$s51$847);
                i2 = mVar.e;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$847) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        int i5 = $11 + 119;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (mVar.e < cArr.length) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
        }
        objArr[0] = new String(cArr2);
    }
}
