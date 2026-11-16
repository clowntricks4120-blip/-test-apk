package ivas.gov.bisp.enumeration.activity.discrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DiscrepancyActivity;
import ivas.gov.bisp.enumeration.activity.singlediscrepancy.UpdatePhoneNoActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p031bd.L;
import ivas.gov.bisp.enumeration.p031bd.O;
import ivas.gov.bisp.enumeration.p031bd.S;
import ivas.gov.bisp.enumeration.p031bd.T;
import ivas.gov.bisp.enumeration.p031bd.ViewOnClickListenerC0137m;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GenderDiscrepancy extends BaseTouch implements RadioGroup.OnCheckedChangeListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s47$1022 = 3763;
    private static int b$s46$1022 = 1174568310;
    private static long d$s45$1022 = -1116422076781920906L;
    private static int p = 0;
    private static int q = 1;
    public ProgressDialog ac;
    public BISPApplication ad;
    public RosterItem ae;
    public int af;
    public SessionManager ag;
    public TextView ah;
    public EditText ai;
    public TextView aj;
    public TextView ak;
    public RadioButton al;
    public RadioButton am;
    public ImageView an;
    public String ao;
    public long ap;
    public String aq;
    public String ar;
    public RadioGroup as;
    public String at;
    public RadioButton au;

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            GenderDiscrepancy genderDiscrepancy = GenderDiscrepancy.this;
            w wVar = new w(genderDiscrepancy, genderDiscrepancy.ag);
            int i3 = b;
            int i4 = ((i3 | 80) << 1) - (i3 ^ 80);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            wVar.execute(new Void[0]);
            dialogInterface.cancel();
            int i7 = b;
            int i8 = i7 & 103;
            int i9 = ((((i7 ^ 103) | i8) << 1) - (~(-((i7 | 103) & (~i8))))) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static void u(GenderDiscrepancy genderDiscrepancy, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(genderDiscrepancy, R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(genderDiscrepancy);
        View viewInflate = LayoutInflater.from(genderDiscrepancy).inflate(R.layout.new_custom_dialog, (ViewGroup) genderDiscrepancy.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new O(genderDiscrepancy, bVarB));
        int i3 = p + 17;
        q = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r5 != ivas.gov.bisp.enumeration.R.id.btn_validate) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r5 != ivas.gov.bisp.enumeration.R.id.iv_back) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        onBackPressed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r4.at.length() != 13) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r5 = ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.p + 17;
        ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.q = r5 % 128;
        r5 = r5 % 2;
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        android.widget.Toast.makeText(r4, "Please enter valid CNIC.", 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r5 != ivas.gov.bisp.enumeration.R.id.btn_validate) goto L12;
     */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.p
            int r1 = r1 + 61
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.q = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L9b
            int r5 = r5.getId()
            r1 = 2131361971(0x7f0a00b3, float:1.834371E38)
            if (r5 == r1) goto L57
            int r1 = ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.q
            int r1 = r1 + 95
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.p = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 2131361973(0x7f0a00b5, float:1.8343713E38)
            if (r1 == 0) goto L2b
            r1 = 5
            int r1 = r1 / r2
            if (r5 == r3) goto L36
            goto L2d
        L2b:
            if (r5 == r3) goto L36
        L2d:
            r0 = 2131362305(0x7f0a0201, float:1.8344387E38)
            if (r5 != r0) goto L9a
            r4.onBackPressed()
            return
        L36:
            java.lang.String r5 = r4.at
            int r5 = r5.length()
            r1 = 13
            if (r5 != r1) goto L4d
            int r5 = ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.p
            int r5 = r5 + 17
            int r1 = r5 % 128
            ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.q = r1
            int r5 = r5 % r0
            r4.y()
            return
        L4d:
            java.lang.String r5 = "Please enter valid CNIC."
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r2)
            r5.show()
            return
        L57:
            ivas.gov.bisp.enumeration.utils.SessionManager r5 = r4.ag
            java.lang.String r5 = r5.p()
            r4.ar = r5
            android.app.AlertDialog$Builder r5 = new android.app.AlertDialog$Builder
            r5.<init>(r4)
            java.lang.String r0 = "Phone Number.!"
            r5.setTitle(r0)
            java.lang.String r0 = "Please Comfirm your Phone # "
            java.lang.StringBuilder r0 = ivas.gov.bisp.enumeration.p091n.j.w(r0)
            java.lang.String r1 = r4.ar
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.setMessage(r0)
            r0 = 1
            r5.setCancelable(r0)
            ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy$OooO00o r0 = new ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy$OooO00o
            r0.<init>()
            java.lang.String r1 = "Confirm"
            r5.setPositiveButton(r1, r0)
            ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy$OooO0O0 r0 = new ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy$OooO0O0
            r0.<init>()
            java.lang.String r1 = "No"
            r5.setNegativeButton(r1, r0)
            android.app.AlertDialog r5 = r5.create()
            r5.show()
        L9a:
            return
        L9b:
            r5.getId()
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy.onClick(android.view.View):void");
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 47;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 35;
        p = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_gender_discrepancy;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ac = new ProgressDialog(this);
        this.ad = (BISPApplication) getApplicationContext();
        Intent intent = getIntent();
        this.ae = (RosterItem) intent.getSerializableExtra("roster_data");
        this.af = intent.getIntExtra("roster_index", 0);
        this.ag = new SessionManager(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ai = (EditText) findViewById(R.id.et_cnic);
        this.ak = (TextView) findViewById(R.id.tv_nser_gender);
        this.as = (RadioGroup) findViewById(R.id.rg_gender);
        this.au = (RadioButton) findViewById(R.id.rb_male);
        this.al = (RadioButton) findViewById(R.id.rb_female);
        this.am = (RadioButton) findViewById(R.id.rb_trans_gender);
        this.ah = (TextView) findViewById(R.id.btn_update);
        this.aj = (TextView) findViewById(R.id.btn_validate);
        this.an = (ImageView) findViewById(R.id.iv_back);
        ((TextView) findViewById(R.id.tv_heading)).setText("Update Gender Discrepancy");
        this.an.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        this.as.setOnCheckedChangeListener(this);
        this.ai.addTextChangedListener(new OooO0OO());
        this.ao = this.ae.getHhid();
        this.ae.gethH_Name();
        this.ae.isIs_Benificiary();
        this.ae.getMessage();
        this.at = this.ae.getCnic();
        this.ae.getDisabilityCode();
        this.ae.getDisabilityStatus();
        this.ae.getDiscrepancy_status();
        this.ae.getDob();
        this.ae.get_educationLevelCode();
        this.ae.get_employmentCode();
        this.ae.getEmployment_status();
        this.ae.getForm_no();
        this.aq = this.ae.getGender();
        this.ae.get_goneToSchoolCode();
        this.ae.getHavingChronicDiseaseCode();
        this.ae.getHhMemberNames();
        this.ae.isLiterate();
        this.ae.get_lastWeekWorkingHours();
        this.ae.getMaritalStatus();
        this.ae.getMaritalStatusCode();
        this.ae.getMessage();
        this.ae.getRelationToHouseholdHead();
        this.ap = this.ae.getrId();
        this.ae.getWorkStatus();
        this.ae.get_workStatusCode();
        this.ae.getMobilenumber();
        this.ae.getMobile_network();
        this.ae.getBank_name();
        this.ae.getBranch_code();
        this.ae.getBank_address();
        this.ae.getAcc_title();
        this.ae.getAcc_number();
        this.ae.getDupRosterList();
        this.ai.setText(ag.b(this.at));
        this.ak.setText(this.aq);
        if (!this.at.equals(BuildConfig.FLAVOR) && !this.at.equalsIgnoreCase("NA")) {
            int i2 = q + 87;
            p = i2 % 128;
            int i3 = i2 % 2;
            y();
            int i4 = p + 9;
            q = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        builder.setView(viewInflate);
        AlertDialog alertDialogK = j.k(builder, false);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        editText.addTextChangedListener(new av(this).new buW(editText));
        textView.setOnClickListener(new ViewOnClickListenerC0137m(this, editText, alertDialogK));
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            int i2 = 2 % 2;
            Intent intent = new Intent(GenderDiscrepancy.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = b;
            int i4 = (i3 & 53) + (i3 | 53);
            a = i4 % 128;
            int i5 = i4 % 2;
            RosterItem rosterItem = GenderDiscrepancy.this.ae;
            int i6 = a;
            int i7 = (i6 & (-110)) | ((~i6) & 109);
            int i8 = -(-((i6 & 109) << 1));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                intent.putExtra("roster_data", rosterItem);
                str = GenderDiscrepancy.this.at;
                int i10 = 3 / 0;
            } else {
                intent.putExtra("roster_data", rosterItem);
                str = GenderDiscrepancy.this.at;
            }
            int i11 = a;
            int i12 = i11 & 61;
            int i13 = ((i11 | 61) & (~i12)) + (i12 << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                intent.putExtra("roster_cnic", str);
                GenderDiscrepancy.this.startActivity(intent);
                throw null;
            }
            intent.putExtra("roster_cnic", str);
            GenderDiscrepancy.this.startActivity(intent);
            int i14 = b;
            int i15 = ((((i14 ^ 33) | (i14 & 33)) << 1) - (~(-(((~i14) & 33) | (i14 & (-34)))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            dialogInterface.cancel();
            int i17 = a;
            int i18 = (i17 ^ 77) + ((i17 & 77) << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        if (i == this.au.getId()) {
            int i3 = p + 119;
            q = i3 % 128;
            int i4 = i3 % 2;
            this.aq = "male";
            if (i4 == 0) {
                int i5 = 84 / 0;
                return;
            }
            return;
        }
        if (i == this.al.getId()) {
            this.aq = "female";
        } else if (i == this.am.getId()) {
            int i6 = q + 95;
            p = i6 % 128;
            int i7 = i6 % 2;
            this.aq = "transgender";
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) DiscrepancyActivity.class);
        intent.putExtra("roster_data", this.ae);
        intent.putExtra("roster_index", this.af);
        startActivity(intent);
        finish();
        int i2 = p + 15;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class OooO0OO implements TextWatcher {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 & 80) + (i5 | 80)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (((i5 & (-22)) | ((~i5) & 21)) - (~(-(-((i5 & 21) << 1))))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 41 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            GenderDiscrepancy genderDiscrepancy;
            EditText editText;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 21;
            int i4 = -(-((i2 ^ 21) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            String lowerCase = GenderDiscrepancy.this.ai.getText().toString().toLowerCase();
            int i7 = a;
            int i8 = (i7 & 3) + (i7 | 3);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (!lowerCase.contains("x")) {
                int i10 = a + 57;
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    genderDiscrepancy = GenderDiscrepancy.this;
                    editText = genderDiscrepancy.ai;
                    int i11 = 58 / 0;
                } else {
                    genderDiscrepancy = GenderDiscrepancy.this;
                    editText = genderDiscrepancy.ai;
                }
                int i12 = a;
                int i13 = ((i12 | 1) << 1) - (i12 ^ 1);
                b = i13 % 128;
                int i14 = i13 % 2;
                genderDiscrepancy.at = editText.getText().toString();
                int i15 = a + 123;
                b = i15 % 128;
                int i16 = i15 % 2;
            }
            GenderDiscrepancy.this.ah.setVisibility(8);
            int i17 = b + 17;
            a = i17 % 128;
            int i18 = i17 % 2;
            GenderDiscrepancy.this.aj.setVisibility(0);
            int i19 = a;
            int i20 = i19 ^ 37;
            int i21 = ((i19 & 37) | i20) << 1;
            int i22 = -i20;
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
    }

    public final void y() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.ao);
            jSONObject.put("cnic", this.at);
            jSONObject.put("r_id", this.ap);
            jSONObject.put("update_type", "update_gender");
            this.ac.setCancelable(false);
            this.ac.setMessage("Please Wait...");
            this.ac.setProgressStyle(0);
            this.ac.show();
            if (this.ag.k().length() <= 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Session Expire");
                builder.setMessage("Session Expire Please Login Again.!");
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO0o());
                builder.create().show();
                int i2 = q + 63;
                p = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = p + 101;
            q = i4 % 128;
            if (i4 % 2 != 0) {
                z(this.at);
                return;
            }
            z(this.at);
            Object obj = null;
            try {
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        } catch (JSONException unused) {
        }
    }

    public final void z(String str) {
        int i = 2 % 2;
        String strReplace = str.replace("-", BuildConfig.FLAVOR);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Cnic", strReplace);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.ag.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ag.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ag.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ag.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ag.m());
            Object[] objArr = new Object[1];
            a(getPackageName().codePointAt(6) - 111, new char[]{0, 0, 0, 0}, (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 41382), new char[]{51467, 7326, 42641, 45985}, new char[]{12798, 41649, 3252, 18350, 38891, 65106, 11129, 25023, 54320, 13701, 15243, 14061, 35771, 44363, 20214, 24130, 64338, 60808}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            Toast.makeText(this, "سروے کی اپ ڈیٹ دستیاب نہیں ہے", 0).show();
            int i2 = p + 121;
            q = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char a$s47$34 = 36240;
        private static int b$s46$34 = 1174568310;
        private static int c = 0;
        private static int d = 1;
        private static long d$s45$34 = -1116422076781920906L;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String hhid = GenderDiscrepancy.this.ae.getHhid();
                int relationToHouseholdHead = GenderDiscrepancy.this.ae.getRelationToHouseholdHead();
                StringBuilder sb = new StringBuilder();
                sb.append(GenderDiscrepancy.this.ae.getrId());
                String string = sb.toString();
                jSONObject.put("HH_ID", hhid);
                jSONObject.put("cnic", GenderDiscrepancy.this.at);
                jSONObject.put("relation_to_hh", relationToHouseholdHead);
                Objects.requireNonNull(GenderDiscrepancy.this);
                jSONObject.put("gender", (Object) null);
                jSONObject.put("r_id", string);
                jSONObject.put("SessionId", BISPApplication.c().s);
                jSONObject.put("IpAddress", ac.h(true));
                jSONObject.put("sessionUserCnic", GenderDiscrepancy.this.ag.r());
                jSONObject.put("discrepency_status", "8");
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(GenderDiscrepancy.this.ag.k()), ivas.gov.bisp.enumeration.bK.b.b(GenderDiscrepancy.this.ag.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(GenderDiscrepancy.this.ag.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(GenderDiscrepancy.this.ag.m());
                Object[] objArr = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1122957957, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{31672, 4357, 8125, 399}, new char[]{59900, 50906, 27184, 21300, 24713, 54170, 895, 8037, 63702, 53463, 24286, 11012, 18413, 15744, 27444, 38311, 47003, 13127, 10415, 57529, 42873, 9420, 52531, 6731, 35648}, objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                GenderDiscrepancy.this.ac.setCancelable(false);
                GenderDiscrepancy.this.ac.setMessage("Please Wait...");
                GenderDiscrepancy.this.ac.setProgressStyle(0);
                GenderDiscrepancy.this.ac.show();
                GenderDiscrepancy genderDiscrepancy = GenderDiscrepancy.this;
                Objects.requireNonNull(genderDiscrepancy);
                L l = new L(genderDiscrepancy, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new T(genderDiscrepancy), new S(genderDiscrepancy));
                l.m = new z(130000, 0, 0.0f);
                l.k = false;
                a.b(genderDiscrepancy).c(l);
                int i3 = c + 109;
                d = i3 % 128;
                int i4 = i3 % 2;
            } catch (JSONException unused) {
            }
            dialogInterface.cancel();
            int i5 = c + 7;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
        }

        private static void a(int i, char[] cArr, char c2, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            o.j jVar = new o.j();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            jVar.a = 0;
            while (jVar.a < length3) {
                int i3 = $10 + 3;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = (jVar.a + 2) % 4;
                int i6 = (jVar.a + 3) % 4;
                jVar.e = (char) (((cArr4[jVar.a % 4] * 32718) + cArr5[i5]) % 65535);
                cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
                cArr4[i6] = jVar.e;
                cArr6[jVar.a] = (char) (((((long) (cArr4[i6] ^ cArr3[jVar.a])) ^ (d$s45$34 ^ (-1116422076781920906L))) ^ ((long) ((int) (((long) b$s46$34) ^ (-1116422076781920906L))))) ^ ((long) ((char) (((long) a$s47$34) ^ (-1116422076781920906L)))));
                jVar.a++;
                int i7 = $10 + 41;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr6);
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
        int i3 = $11 + 69;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (jVar.a >= length3) {
                break;
            }
            int i5 = (jVar.a + 2) % 4;
            int i6 = (jVar.a + 3) % 4;
            jVar.e = (char) (((cArr4[jVar.a % 4] * 32718) + cArr5[i5]) % 65535);
            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
            cArr4[i6] = jVar.e;
            cArr6[jVar.a] = (char) (((((long) (cArr4[i6] ^ cArr3[jVar.a])) ^ (d$s45$1022 ^ (-1116422076781920906L))) ^ ((long) ((int) (((long) b$s46$1022) ^ (-1116422076781920906L))))) ^ ((long) ((char) (((long) a$s47$1022) ^ (-1116422076781920906L)))));
            jVar.a++;
            i3 = $10 + 33;
            $11 = i3 % 128;
        }
        String str = new String(cArr6);
        int i7 = $10 + 57;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
