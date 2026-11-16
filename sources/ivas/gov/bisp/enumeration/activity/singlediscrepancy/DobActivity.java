package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import android.widget.TextView;
import android.widget.Toast;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.DobActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.dd.O;
import ivas.gov.bisp.enumeration.dd.Q;
import ivas.gov.bisp.enumeration.dd.S;
import ivas.gov.bisp.enumeration.dd.T;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import net.sqlcipher.BuildConfig;
import o.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DobActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s47$851 = 32118;
    public static final /* synthetic */ int ac = 0;
    private static int b$s46$851 = 1174568310;
    private static long d$s45$851 = 969399186380149360L;
    private static int p = 0;
    private static int q = 1;
    public String aA;
    public String aB;
    public String aC;
    public String aD;
    public SessionManager aE;
    public int aF;
    public int aG;
    public String aH;
    public String aI;
    public boolean aJ;
    public String aK;
    public int aL;
    public String aM;
    public int aN;
    public String aO;
    public int aP;
    public String aQ;
    public int aR;
    public String aS;
    public String aT;
    public int aU;
    public String aV;
    public String aW;
    public int aX;
    public ImageView ad;
    public EditText ae;
    public TextView af;
    public TextView ag;
    public TextView ah;
    public TextView ai;
    public TextView aj;
    public ProgressDialog ak;
    public RosterItem al;
    public int am;
    public String an;
    public String ao;
    public boolean ap;
    public int aq;
    public String ar;
    public int as;
    public int at;
    public long au;
    public String av;
    public String aw;
    public String ax;
    public int ay;
    public String az;

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            DobActivity dobActivity = DobActivity.this;
            w wVar = new w(dobActivity, dobActivity.aE);
            int i3 = a;
            int i4 = ((i3 & 70) + (i3 | 70)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i6 = b;
            int i7 = i6 & 111;
            int i8 = (i6 | 111) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) UpdateDobRosterListActivity.class));
        finish();
        int i2 = p + 97;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = p + 3;
        q = i3 % 128;
        int i4 = i3 % 2;
        switch (view.getId()) {
            case R.id.btn_update /* 2131361971 */:
                this.aH = this.aE.p();
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Phone Number.!");
                StringBuilder sbW = j.w("Please Comfirm your Phone # ");
                sbW.append(this.aH);
                builder.setMessage(sbW.toString());
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO0O0());
                builder.setNegativeButton("No", new OooO0OO());
                builder.create().show();
                break;
            case R.id.btn_validate /* 2131361973 */:
                u();
                break;
            case R.id.iv_back /* 2131362305 */:
                onBackPressed();
                int i5 = q + 47;
                p = i5 % 128;
                int i6 = i5 % 2;
                break;
            case R.id.tv_dob /* 2131363198 */:
                C0104p.c().h(this, "Warning", "If you change age of household then all added rosters will be removed. Are you sure you want to change age?? ", new DialogInterfaceOnClickListenerC0204j(this, i), new DialogInterface.OnClickListener() { // from class: ivas.gov.bisp.enumeration.dd.m
                    private static int a = 1;
                    private static int b;

                    static {
                        int i7 = a;
                        int i8 = ((i7 | 25) << 1) - (i7 ^ 25);
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        int i8 = 2 % 2;
                        int i9 = b;
                        int i10 = (((i9 | 96) << 1) - (i9 ^ 96)) - 1;
                        a = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = DobActivity.ac;
                        dialogInterface.dismiss();
                        int i13 = b;
                        int i14 = i13 ^ 71;
                        int i15 = -(-((i13 & 71) << 1));
                        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                        a = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }, true);
                break;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 123;
        int i3 = i2 % 128;
        q = i3;
        if (i2 % 2 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = i3 + 77;
        p = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_dob;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
            jSONObject.put("sessionUserCnic", this.aE.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.aE.k()), b.b(this.aE.m())));
            byte[] bArrB = b.b(this.aE.k());
            byte[] bArrB2 = b.b(this.aE.m());
            Object[] objArr = new Object[1];
            a((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), new char[]{44806, 50111, 21349, 65010}, (char) (46036 - View.MeasureSpec.getSize(0)), new char[]{21353, 20835, 54458, 49843}, new char[]{61931, 35816, 57724, 30351, 62525, 14826, 16443, 22075, 32336, 51423, 47708, 44014, 49324, 25225, 31788, 50813, 40306, 29420}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            Toast.makeText(this, "سروے کی اپ ڈیٹ دستیاب نہیں ہے", 0).show();
            int i2 = q + 85;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
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
            int i5 = b;
            int i6 = (i5 ^ 113) + ((i5 & 113) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 8 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 & 39) + (i5 | 39);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 9;
            int i4 = (i2 ^ 9) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            DobActivity.this.af.setVisibility(8);
            DobActivity dobActivity = DobActivity.this;
            int i7 = b;
            int i8 = ((i7 | 5) << 1) - (((~i7) & 5) | (i7 & (-6)));
            a = i8 % 128;
            int i9 = i8 % 2;
            dobActivity.ag.setVisibility(0);
            int i10 = a + 119;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(DobActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = a;
            int i4 = i3 & 75;
            int i5 = (i3 | 75) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                intent.putExtra("roster_data", DobActivity.this.al);
                throw null;
            }
            intent.putExtra("roster_data", DobActivity.this.al);
            int i8 = b;
            int i9 = (((i8 & (-58)) | ((~i8) & 57)) - (~(-(-((i8 & 57) << 1))))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                DobActivity.this.startActivity(intent);
                dialogInterface.cancel();
                obj.hashCode();
                throw null;
            }
            DobActivity.this.startActivity(intent);
            dialogInterface.cancel();
            int i10 = b;
            int i11 = i10 ^ 39;
            int i12 = -(-((i10 & 39) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public final void u() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.aI);
            jSONObject.put("cnic", this.aV);
            jSONObject.put("r_id", this.au);
            jSONObject.put("update_type", "dob");
            this.ak.setCancelable(true);
            this.ak.setMessage("Please Wait...");
            this.ak.setProgressStyle(0);
            this.ak.show();
            if (this.aE.k().length() <= 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Session Expire");
                builder.setMessage("Session Expire Please Login Again.!");
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO0o());
                builder.create().show();
                return;
            }
            int i2 = p + 89;
            q = i2 % 128;
            if (i2 % 2 == 0) {
                w(this.aV);
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                w(this.aV);
                int i3 = p + 1;
                q = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ak = new ProgressDialog(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        Intent intent = getIntent();
        this.al = (RosterItem) intent.getSerializableExtra("roster_data");
        intent.getIntExtra("roster_index", 0);
        this.aE = new SessionManager(this);
        this.ad = (ImageView) findViewById(R.id.iv_back);
        this.ae = (EditText) findViewById(R.id.et_cnic);
        this.af = (TextView) findViewById(R.id.btn_update);
        this.ag = (TextView) findViewById(R.id.btn_validate);
        this.ah = (TextView) findViewById(R.id.tv_heading);
        this.aj = (TextView) findViewById(R.id.tv_dob);
        this.ai = (TextView) findViewById(R.id.tv_nser_dob);
        this.ah.setText("UPDATE DATE OF BIRTH");
        this.ad.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.ag.setVisibility(8);
        this.af.setVisibility(0);
        this.af.setEnabled(false);
        this.aj.setOnClickListener(this);
        this.ae.addTextChangedListener(new OooO00o());
        this.aI = this.al.getHhid();
        this.aJ = this.al.isIs_Benificiary();
        this.aM = this.al.getMessage();
        this.aV = this.al.getCnic();
        this.aL = this.al.getDisabilityCode();
        this.aK = this.al.getDisabilityStatus();
        this.aS = this.al.getDiscrepancy_status();
        this.aT = this.al.getDob();
        this.aU = this.al.get_educationLevelCode();
        this.aP = this.al.get_employmentCode();
        this.aQ = this.al.getEmployment_status();
        this.aO = this.al.getForm_no();
        this.aW = this.al.getGender();
        this.aN = this.al.get_goneToSchoolCode();
        this.aF = this.al.getHavingChronicDiseaseCode();
        this.ao = this.al.getHhMemberNames();
        this.ap = this.al.isLiterate();
        this.aq = this.al.get_lastWeekWorkingHours();
        this.an = this.al.getMaritalStatus();
        this.as = this.al.getMaritalStatusCode();
        this.ar = this.al.getMessage();
        this.at = this.al.getRelationToHouseholdHead();
        this.au = this.al.getrId();
        this.av = this.al.getWorkStatus();
        this.ay = this.al.get_workStatusCode();
        this.aA = this.al.getDupRosterList();
        this.aB = this.al.getMobilenumber();
        this.aw = this.al.getMobile_network();
        this.ax = this.al.getBank_name();
        this.am = this.al.getBranch_code();
        this.az = this.al.getBank_address();
        this.aD = this.al.getAcc_title();
        this.aC = this.al.getAcc_number();
        this.ae.setText(ag.b(this.aV));
        this.aj.setText(this.aT);
        this.ai.setText(this.aT);
        if (!this.aV.equals(BuildConfig.FLAVOR)) {
            int i2 = q + 71;
            p = i2 % 128;
            int i3 = i2 % 2;
            if (!this.aV.equalsIgnoreCase("NA")) {
                int i4 = p + 29;
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    u();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                u();
                int i5 = p + 101;
                q = i5 % 128;
                int i6 = i5 % 2;
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
        textView.setOnClickListener(new Q(this, editText, alertDialogK));
        int i7 = q + 1;
        p = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 67 / 0;
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 1;
        private static int d = 0;
        private static long d$s40$32 = 1085774396193372179L;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            int i2;
            String str2;
            double dC;
            int i3 = 2 % 2;
            DobActivity dobActivity = DobActivity.this;
            dobActivity.al = new RosterItem(dobActivity.aI, dobActivity.aJ, dobActivity.aM, BuildConfig.FLAVOR, dobActivity.aV, dobActivity.aL, dobActivity.aK, dobActivity.aS, dobActivity.aT, dobActivity.aU, dobActivity.aP, dobActivity.aQ, dobActivity.aO, dobActivity.aW, dobActivity.aN, dobActivity.aF, dobActivity.ao, dobActivity.ap, dobActivity.aq, dobActivity.an, dobActivity.as, dobActivity.ar, dobActivity.at, dobActivity.au, dobActivity.av, dobActivity.ay, dobActivity.aA, dobActivity.aB, dobActivity.aw, dobActivity.ax, dobActivity.am, dobActivity.az, dobActivity.aD, dobActivity.aC);
            DobActivity dobActivity2 = DobActivity.this;
            RosterItem rosterItem = dobActivity2.al;
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
            int i8 = rosterItem.get_workStatusCode();
            if (!(!zIsLiterate)) {
                str = "1";
            } else {
                int i9 = d + 31;
                c = i9 % 128;
                int i10 = i9 % 2;
                str = "0";
            }
            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
                Calendar calendar = Calendar.getInstance();
                i2 = disabilityCode;
                str2 = disabilityStatus;
                try {
                    calendar.setTimeInMillis(date.getTime());
                    dC = ag.c(calendar.get(5), calendar.get(2), calendar.get(1));
                    int i11 = c + 67;
                    d = i11 % 128;
                    int i12 = i11 % 2;
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
                String ipAddress = Formatter.formatIpAddress(((WifiManager) dobActivity2.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                jSONObject.put("house_hold_id", hhid);
                jSONObject.put("is_pmt", 0);
                jSONObject.put("type", "dob");
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("rId", j);
                jSONObject3.put("cnicEnc", dobActivity2.aV);
                jSONObject3.put("cnic", dobActivity2.aV);
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
                jSONObject3.put("isLiterate", str);
                jSONObject3.put("goneToSchoolCode", i6);
                jSONObject3.put("educationLevelCode", i4);
                jSONObject3.put("workStatusCode", i8);
                jSONObject3.put("workStatus", workStatus);
                jSONObject3.put("lastWeekWorkingHours", i7);
                jSONObject3.put("mobile_no", dobActivity2.aB);
                jSONObject3.put("mobile_network_name", dobActivity2.aw);
                jSONObject3.put("update_type", "dob");
                jSONObject3.put("banks_name", dobActivity2.ax);
                jSONObject3.put("branch_code", dobActivity2.am);
                jSONObject3.put("bank_address", dobActivity2.az);
                jSONObject3.put("account_title", dobActivity2.aD);
                jSONObject3.put("account_number", dobActivity2.aC);
                jSONObject3.put("employmentCode", i5);
                jSONObject3.put("employmentStatus", employment_status);
                jSONObject3.put("endBy", dobActivity2.aE.z());
                jSONObject3.put("endByIp", ipAddress);
                jSONArray.put(0, jSONObject3);
                jSONObject.put("rosterList", jSONArray);
                dobActivity2.ak.setCancelable(true);
                dobActivity2.ak.setMessage("Please Wait...");
                dobActivity2.ak.setProgressStyle(0);
                dobActivity2.ak.show();
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(dobActivity2.aE.k()), b.b(dobActivity2.aE.m())));
                byte[] bArrB = b.b(dobActivity2.aE.k());
                byte[] bArrB2 = b.b(dobActivity2.aE.m());
                Object[] objArr = new Object[1];
                a(Drawable.resolveOpacity(0, 0), new char[]{63616, 4747, 63701, 6675, 4938, 22495, 36927, 56391, 60516, 19290, 33945, 61657, 53715, 31931, 43294, 60340, 50548, 36922, 56735, 7735, 43689, 34179}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                O o2 = new O(dobActivity2, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new T(dobActivity2), new S(dobActivity2));
                o2.m = new z(130000, 0, 0.0f);
                o2.k = false;
                a.b(dobActivity2).c(o2);
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
                int i3 = $11 + 119;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                gVar.c = gVar.a - 4;
                cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$32 ^ (-3439381718914712265L))));
                gVar.a++;
                int i5 = $10 + 119;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
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
            int i3 = $10 + 55;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (jVar.a + 2) % 4;
            int i6 = (jVar.a + 3) % 4;
            jVar.e = (char) (((cArr4[jVar.a % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = jVar.e;
            cArr6[jVar.a] = (char) (((((long) (cArr4[i6] ^ cArr3[jVar.a])) ^ (d$s45$851 ^ (-1116422076781920906L))) ^ ((long) ((int) (((long) b$s46$851) ^ (-1116422076781920906L))))) ^ ((long) ((char) (((long) a$s47$851) ^ (-1116422076781920906L)))));
            jVar.a++;
        }
        String str = new String(cArr6);
        int i7 = $10 + 115;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }
}
