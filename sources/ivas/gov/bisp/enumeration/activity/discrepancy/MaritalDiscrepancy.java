package ivas.gov.bisp.enumeration.activity.discrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
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
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p031bd.C;
import ivas.gov.bisp.enumeration.p031bd.C0141s;
import ivas.gov.bisp.enumeration.p031bd.C0143v;
import ivas.gov.bisp.enumeration.p031bd.V;
import ivas.gov.bisp.enumeration.p031bd.al;
import ivas.gov.bisp.enumeration.p031bd.y;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.d;
import o.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MaritalDiscrepancy extends BaseTouch implements RadioGroup.OnCheckedChangeListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] c$s11$1048 = {-1443203185, -1002801035, 207711275, -513069167, -1281540530, -308730828, -1358323170, -808616872, 442435312, -1835104491, -1533929105, 1465385379, -1470416403, 1362331334, -533089427, 1890061432, 1003922120, -121561297};
    private static int p = 1;
    private static int q;
    public int aA;
    public int aB;
    public int aC;
    public long aD;
    public String aE;
    public ImageView aF;
    public String aG;
    public String aH;
    public String aI;
    public String aJ;
    public String aK;
    public String aL;
    public String aM;
    public String aN;
    public String aO;
    public String aP;
    public ArrayList<Item> aQ;
    public String aR;
    public String aS;
    public String aT;
    public String aU;
    public String aV;
    public Spinner aW;
    public ProgressDialog ac;
    public BISPApplication ad;
    public RosterItem ae;
    public int af;
    public SessionManager ag;
    public TextView ah;
    public EditText ai;
    public TextView aj;
    public TextView ak;
    public int al;
    public String am;
    public String an;
    public String ao;
    public String ap;
    public boolean aq;
    public boolean ar;
    public boolean as = false;
    public int at;
    public int au;
    public int av;
    public int aw;
    public int ax;
    public int ay;
    public String az;

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            MaritalDiscrepancy maritalDiscrepancy = MaritalDiscrepancy.this;
            w wVar = new w(maritalDiscrepancy, maritalDiscrepancy.ag);
            int i3 = a;
            int i4 = ((i3 ^ 46) + ((i3 & 46) << 1)) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                wVar.execute(new Void[1]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
            int i5 = a + 40;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(MaritalDiscrepancy.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = b;
            int i4 = (i3 & 74) + (i3 | 74);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                intent.putExtra("roster_data", MaritalDiscrepancy.this.ae);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            intent.putExtra("roster_data", MaritalDiscrepancy.this.ae);
            Editable text = MaritalDiscrepancy.this.ai.getText();
            int i6 = b;
            int i7 = i6 & 45;
            int i8 = (i6 | 45) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                intent.putExtra("roster_cnic", text.toString());
                MaritalDiscrepancy.this.startActivity(intent);
                int i11 = 47 / 0;
            } else {
                intent.putExtra("roster_cnic", text.toString());
                MaritalDiscrepancy.this.startActivity(intent);
            }
            dialogInterface.cancel();
            int i12 = b;
            int i13 = ((((i12 ^ 75) | (i12 & 75)) << 1) - (~(-(((~i12) & 75) | (i12 & (-76)))))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public static void u(MaritalDiscrepancy maritalDiscrepancy, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(maritalDiscrepancy, R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(maritalDiscrepancy);
        View viewInflate = LayoutInflater.from(maritalDiscrepancy).inflate(R.layout.new_custom_dialog, (ViewGroup) maritalDiscrepancy.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new y(maritalDiscrepancy, bVarB));
        int i3 = p + 23;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
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
        int i2 = q + 93;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = q + 59;
        p = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 113;
        q = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 87;
        q = i4 % 128;
        if (i4 % 2 == 0) {
            return R.layout.activity_marital_discrepancy;
        }
        obj.hashCode();
        throw null;
    }

    public class OooO00o implements TextWatcher {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 ^ 36) + ((i5 & 36) << 1)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 35 / 0;
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (i5 & 59) + (i5 | 59);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = a + 50;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            MaritalDiscrepancy.this.ah.setVisibility(8);
            int i5 = b + 87;
            a = i5 % 128;
            int i6 = i5 % 2;
            MaritalDiscrepancy.this.aj.setVisibility(0);
            int i7 = b + 49;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p + 121;
        q = i2 % 128;
        int i3 = i2 % 2;
        int id = view.getId();
        if (id != R.id.btn_update) {
            if (id == R.id.btn_validate) {
                y();
                return;
            }
            if (id == R.id.iv_back) {
                onBackPressed();
                int i4 = p + 5;
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 76 / 0;
                    return;
                }
                return;
            }
            return;
        }
        if (!this.as) {
            Toast.makeText(this, "Please select a Marital status", 0).show();
            return;
        }
        this.aH = this.ag.p();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Phone Number.!");
        StringBuilder sbW = j.w("Please Comfirm your Phone # ");
        sbW.append(this.aH);
        builder.setMessage(sbW.toString());
        builder.setCancelable(true);
        builder.setPositiveButton("Confirm", new OooO0OO());
        builder.setNegativeButton("No", new OooO0o());
        builder.create().show();
    }

    public final void y() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.aG);
            jSONObject.put("cnic", this.ai.getText().toString());
            jSONObject.put("r_id", this.aD);
            jSONObject.put("update_type", "marital_status");
            this.ac.setCancelable(false);
            this.ac.setMessage("Please Wait...");
            this.ac.setProgressStyle(0);
            this.ac.show();
            if (this.ag.k().length() > 0) {
                int i2 = p + 15;
                q = i2 % 128;
                if (i2 % 2 == 0) {
                    z(this.ai.getText().toString());
                    return;
                } else {
                    z(this.ai.getText().toString());
                    int i3 = 30 / 0;
                    return;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Session Expire");
            builder.setMessage("Session Expire Please Login Again.!");
            builder.setCancelable(true);
            builder.setPositiveButton("Confirm", new OooO0O0());
            builder.create().show();
            int i4 = p + 87;
            q = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
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
            a(getApplicationInfo().targetSdkVersion - 13, new int[]{591806595, -160368605, -1141606136, -1602885893, -2052830617, -202901428, 1547635367, -1913010330, 1390872478, 396110284}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ac, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0141s(this));
            int i2 = q + 9;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
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
        this.ak = (TextView) findViewById(R.id.tv_nser_marital_status);
        this.aW = (Spinner) findViewById(R.id.sp_merital_status);
        this.ah = (TextView) findViewById(R.id.btn_update);
        this.aj = (TextView) findViewById(R.id.btn_validate);
        this.aF = (ImageView) findViewById(R.id.iv_back);
        ((TextView) findViewById(R.id.tv_heading)).setText("Update Marital Status Discrepancy");
        this.aF.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        this.ai.addTextChangedListener(new OooO00o());
        this.aG = this.ae.getHhid();
        this.ar = this.ae.isIs_Benificiary();
        this.aI = this.ae.getMessage();
        this.aL = this.ae.getCnic();
        this.at = this.ae.getDisabilityCode();
        this.aU = this.ae.getDisabilityStatus();
        this.aK = this.ae.getDiscrepancy_status();
        this.aJ = this.ae.getDob();
        this.au = this.ae.get_educationLevelCode();
        this.aA = this.ae.get_employmentCode();
        this.aR = this.ae.getEmployment_status();
        this.aS = this.ae.getForm_no();
        this.aT = this.ae.getGender();
        this.av = this.ae.get_goneToSchoolCode();
        this.aw = this.ae.getHavingChronicDiseaseCode();
        this.aO = this.ae.getHhMemberNames();
        this.aq = this.ae.isLiterate();
        this.al = this.ae.get_lastWeekWorkingHours();
        this.aP = this.ae.getMaritalStatus();
        this.ay = this.ae.getMaritalStatusCode();
        this.aN = this.ae.getMessage();
        this.aC = this.ae.getRelationToHouseholdHead();
        this.aD = this.ae.getrId();
        this.aV = this.ae.getWorkStatus();
        this.ax = this.ae.get_workStatusCode();
        this.aM = this.ae.getMobilenumber();
        this.aE = this.ae.getMobile_network();
        this.an = this.ae.getBank_name();
        this.aB = this.ae.getBranch_code();
        this.ao = this.ae.getBank_address();
        this.ap = this.ae.getAcc_title();
        this.am = this.ae.getAcc_number();
        this.az = this.ae.getDupRosterList();
        this.ai.setText(this.aL);
        this.ak.setText(this.aP);
        new au(this, "marital_status", getResources().getString(R.string.marital_status), this.aW, new V(this)).execute(new Void[0]);
        if (!this.aL.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            int i2 = q + 73;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                this.aL.equalsIgnoreCase("NA");
                throw null;
            }
            if (!this.aL.equalsIgnoreCase("NA")) {
                y();
                int i3 = q + 93;
                p = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 88 / 0;
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

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char a$s76$35 = 54167;
        private static char b$s75$35 = 35709;
        private static int c = 0;
        private static char c$s74$35 = 6234;
        private static int d = 1;
        private static char d$s73$35 = 50082;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String hhid = MaritalDiscrepancy.this.ae.getHhid();
                int relationToHouseholdHead = MaritalDiscrepancy.this.ae.getRelationToHouseholdHead();
                StringBuilder sb = new StringBuilder();
                sb.append(MaritalDiscrepancy.this.ae.getrId());
                String string = sb.toString();
                jSONObject.put("HH_ID", hhid);
                jSONObject.put("cnic", MaritalDiscrepancy.this.ai.getText().toString());
                jSONObject.put("relation_to_hh", relationToHouseholdHead);
                MaritalDiscrepancy maritalDiscrepancy = MaritalDiscrepancy.this;
                jSONObject.put("marital_status", maritalDiscrepancy.aQ.get(maritalDiscrepancy.aW.getSelectedItemPosition()).getOption());
                MaritalDiscrepancy maritalDiscrepancy2 = MaritalDiscrepancy.this;
                jSONObject.put("marital_status_code", maritalDiscrepancy2.aQ.get(maritalDiscrepancy2.aW.getSelectedItemPosition()).getOptionId());
                jSONObject.put("r_id", string);
                jSONObject.put("SessionId", BISPApplication.c().s);
                jSONObject.put("IpAddress", ac.h(true));
                jSONObject.put("sessionUserCnic", MaritalDiscrepancy.this.ag.r());
                jSONObject.put("discrepency_status", "9");
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(MaritalDiscrepancy.this.ag.k()), ivas.gov.bisp.enumeration.bK.b.b(MaritalDiscrepancy.this.ag.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(MaritalDiscrepancy.this.ag.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(MaritalDiscrepancy.this.ag.m());
                Object[] objArr = new Object[1];
                a(32 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), new char[]{24151, 41812, 26491, 51036, 11768, 18821, 17581, 44618, 35664, 65475, 62962, 20741, 21792, 47115, 62962, 20741, 10154, 18995, 23172, 48838, 39974, 19327, 12734, 28663, 60728, 51294, 59809, 62753, 34297, 41457, 49648, 39408}, objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                MaritalDiscrepancy.this.ac.setCancelable(false);
                MaritalDiscrepancy.this.ac.setMessage("Please Wait...");
                MaritalDiscrepancy.this.ac.setProgressStyle(0);
                MaritalDiscrepancy.this.ac.show();
                MaritalDiscrepancy maritalDiscrepancy3 = MaritalDiscrepancy.this;
                Objects.requireNonNull(maritalDiscrepancy3);
                C0143v c0143v = new C0143v(maritalDiscrepancy3, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new al(maritalDiscrepancy3), new ivas.gov.bisp.enumeration.p031bd.R(maritalDiscrepancy3));
                c0143v.m = new z(130000, 0, 0.0f);
                c0143v.k = false;
                a.b(maritalDiscrepancy3).c(c0143v);
                int i3 = c + 121;
                d = i3 % 128;
                int i4 = i3 % 2;
            } catch (JSONException unused) {
            }
            dialogInterface.cancel();
        }

        private static void a(int i, char[] cArr, Object[] objArr) {
            int i2 = 2 % 2;
            h hVar = new h();
            char[] cArr2 = new char[cArr.length];
            hVar.d = 0;
            char[] cArr3 = new char[2];
            while (hVar.d < cArr.length) {
                cArr3[0] = cArr[hVar.d];
                cArr3[1] = cArr[hVar.d + 1];
                int i3 = 58224;
                for (int i4 = 0; i4 < 16; i4++) {
                    int i5 = $11 + 1;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    char c4 = (char) (c2 - (((c3 + i3) ^ ((c3 << 4) + ((char) (((long) b$s75$35) ^ 6963871449151285300L)))) ^ ((c3 >>> 5) + ((char) (((long) a$s76$35) ^ 6963871449151285300L)))));
                    cArr3[1] = c4;
                    cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) c$s74$35) ^ 6963871449151285300L))) ^ ((c4 + i3) ^ ((c4 << 4) + ((char) (((long) d$s73$35) ^ 6963871449151285300L))))));
                    i3 -= 40503;
                }
                cArr2[hVar.d] = cArr3[0];
                cArr2[hVar.d + 1] = cArr3[1];
                hVar.d += 2;
                int i7 = $10 + 69;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 2;
                }
            }
            String str = new String(cArr2, 0, i);
            int i9 = $10 + 19;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        d dVar = new d();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = c$s11$1048;
        if (iArr3 != null) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 115;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                iArr2[i4] = (int) (((long) iArr3[i4]) ^ (-2705551458099060901L));
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = c$s11$1048;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                iArr6[i7] = (int) (((long) iArr5[i7]) ^ (-2705551458099060901L));
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        dVar.a = 0;
        while (dVar.a < iArr.length) {
            cArr[0] = (char) (iArr[dVar.a] >> 16);
            cArr[1] = (char) iArr[dVar.a];
            cArr[2] = (char) (iArr[dVar.a + 1] >> 16);
            cArr[3] = (char) iArr[dVar.a + 1];
            dVar.e = (cArr[0] << 16) + cArr[1];
            dVar.d = (cArr[2] << 16) + cArr[3];
            d.b(iArr4);
            for (int i8 = 0; i8 < 16; i8++) {
                dVar.e ^= iArr4[i8];
                dVar.d = d.c(dVar.e) ^ dVar.d;
                int i9 = dVar.e;
                dVar.e = dVar.d;
                dVar.d = i9;
            }
            int i10 = dVar.e;
            dVar.e = dVar.d;
            dVar.d = i10;
            dVar.d ^= iArr4[16];
            dVar.e ^= iArr4[17];
            int i11 = dVar.e;
            int i12 = dVar.d;
            cArr[0] = (char) (dVar.e >>> 16);
            cArr[1] = (char) dVar.e;
            cArr[2] = (char) (dVar.d >>> 16);
            cArr[3] = (char) dVar.d;
            d.b(iArr4);
            cArr2[dVar.a * 2] = cArr[0];
            cArr2[(dVar.a * 2) + 1] = cArr[1];
            cArr2[(dVar.a * 2) + 2] = cArr[2];
            cArr2[(dVar.a * 2) + 3] = cArr[3];
            dVar.a += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
