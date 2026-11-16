package ivas.gov.bisp.enumeration.activity.discrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.au;
import ivas.gov.bisp.enumeration.databaseModels.Item;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p031bd.C0142t;
import ivas.gov.bisp.enumeration.p031bd.DialogInterfaceOnClickListenerC0140r;
import ivas.gov.bisp.enumeration.p031bd.P;
import ivas.gov.bisp.enumeration.p031bd.ViewOnClickListenerC0134c;
import ivas.gov.bisp.enumeration.p031bd.e;
import ivas.gov.bisp.enumeration.p031bd.h;
import ivas.gov.bisp.enumeration.p031bd.i;
import ivas.gov.bisp.enumeration.p031bd.z;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DisabilityDiscrepancyActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s14$948 = 1962648907;
    private static int p = 1;
    private static int q;
    public String aA;
    public String aB;
    public String aC;
    public SessionManager aD;
    public int aE;
    public boolean aF = false;
    public String aG;
    public String aH;
    public int aI;
    public int aJ;
    public String aK;
    public String aL;
    public int aM;
    public String aN;
    public int aO;
    public int aP;
    public ProgressDialog aQ;
    public String aR;
    public String aS;
    public String aT;
    public boolean aU;
    public String aV;
    public RosterItem aW;
    public BISPApplication ac;
    public int ad;
    public EditText ae;
    public TextView af;
    public ArrayList<Item> ag;
    public ImageView ah;
    public Spinner ai;
    public TextView aj;
    public TextView ak;
    public int al;
    public String am;
    public String an;
    public boolean ao;
    public int ap;
    public String aq;
    public int ar;
    public int as;
    public long at;
    public String au;
    public String av;
    public String aw;
    public int ax;
    public String ay;
    public String az;

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 ^ 67;
            int i5 = ((i3 & 67) | i4) << 1;
            int i6 = -i4;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = DisabilityDiscrepancyActivity.this;
            disabilityDiscrepancyActivity.y(disabilityDiscrepancyActivity.aK);
            int i9 = a + 11;
            b = i9 % 128;
            int i10 = i9 % 2;
            dialogInterface.cancel();
            int i11 = b;
            int i12 = i11 ^ 95;
            int i13 = -(-((i11 & 95) << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 & 73) - (~(i3 | 73))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static void u(DisabilityDiscrepancyActivity disabilityDiscrepancyActivity, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(disabilityDiscrepancyActivity, R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(disabilityDiscrepancyActivity);
        View viewInflate = LayoutInflater.from(disabilityDiscrepancyActivity).inflate(R.layout.new_custom_dialog, (ViewGroup) disabilityDiscrepancyActivity.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new i(disabilityDiscrepancyActivity, bVarB));
        int i3 = q + 105;
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 77;
        p = i2 % 128;
        int i3 = i2 % 2;
        int id = view.getId();
        if (id != R.id.btn_update) {
            int i4 = q + 69;
            p = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (id == R.id.iv_back) {
                onBackPressed();
                int i5 = q + 79;
                p = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        if (!this.aF) {
            Toast.makeText(this, "Please select a disability", 0).show();
            return;
        }
        this.aH = this.aD.p();
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

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 117;
        p = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 35;
        p = i4 % 128;
        if (i4 % 2 != 0) {
            return R.layout.activity_disability;
        }
        throw null;
    }

    public void z(String str, String str2) {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setCancelable(true);
        builder.setPositiveButton("Retry", new OooO00o());
        builder.setNegativeButton("Cancel", new OooO0O0(this));
        builder.create().show();
        int i2 = q + 87;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) DiscrepancyActivity.class);
        intent.putExtra("roster_data", this.aW);
        intent.putExtra("roster_index", this.ad);
        startActivity(intent);
        finish();
        int i2 = q + 69;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(DisabilityDiscrepancyActivity.this, (Class<?>) UpdatePhoneNoActivity.class);
            DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = DisabilityDiscrepancyActivity.this;
            int i3 = (-2) - ((a + 8) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 == 0) {
                intent.putExtra("roster_data", disabilityDiscrepancyActivity.aW);
                throw null;
            }
            intent.putExtra("roster_data", disabilityDiscrepancyActivity.aW);
            int i4 = a + 99;
            b = i4 % 128;
            int i5 = i4 % 2;
            intent.putExtra("roster_cnic", DisabilityDiscrepancyActivity.this.aK);
            DisabilityDiscrepancyActivity.this.startActivity(intent);
            int i6 = b;
            int i7 = i6 & 89;
            int i8 = i7 + ((i6 ^ 89) | i7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                dialogInterface.cancel();
                int i9 = 58 / 0;
            } else {
                dialogInterface.cancel();
            }
            int i10 = a;
            int i11 = i10 ^ 27;
            int i12 = ((((i10 & 27) | i11) << 1) - (~(-i11))) - 1;
            b = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public final void y(String str) {
        int i = 2 % 2;
        String strReplace = str.replace("-", BuildConfig.FLAVOR);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Cnic", strReplace);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.aD.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.aD.k()), ivas.gov.bisp.enumeration.bK.b.b(this.aD.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.aD.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.aD.m());
            Object[] objArr = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 28, true, getPackageName().length() - 7, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 247, new char[]{7, '\f', 65505, 65488, 65524, '\f', '\r', 7, 18, 65535, 1, 7, 4, 7, 16, 3, 65524, 1}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.aQ, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new e(this));
            int i2 = p + 57;
            q = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int a$s26$36 = -2106869182;
        private static byte[] b$s29$36 = {-58, 74, 107, 67, 103, 125, 101, 65, 96, 126, 91, -67, 123, 125, 115, 126, 119, 98, 126, 91, -111, 103, 69, 115, 100, 77};
        private static int c = 0;
        private static short[] c$s30$36 = null;
        private static int d = 1;
        private static int d$s27$36 = -179885546;
        private static int e$s28$36 = 805553069;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String hhid = DisabilityDiscrepancyActivity.this.aW.getHhid();
                int relationToHouseholdHead = DisabilityDiscrepancyActivity.this.aW.getRelationToHouseholdHead();
                StringBuilder sb = new StringBuilder();
                sb.append(DisabilityDiscrepancyActivity.this.aW.getrId());
                String string = sb.toString();
                jSONObject.put("HH_ID", hhid);
                jSONObject.put("cnic", DisabilityDiscrepancyActivity.this.aK);
                jSONObject.put("relation_to_hh", relationToHouseholdHead);
                jSONObject.put("disablity_status", DisabilityDiscrepancyActivity.this.aG);
                jSONObject.put("disablity_code", DisabilityDiscrepancyActivity.this.aI);
                jSONObject.put("r_id", string);
                jSONObject.put("SessionId", BISPApplication.c().s);
                jSONObject.put("IpAddress", ac.h(true));
                jSONObject.put("sessionUserCnic", DisabilityDiscrepancyActivity.this.aD.r());
                jSONObject.put("discrepency_status", "4");
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(DisabilityDiscrepancyActivity.this.aD.k()), ivas.gov.bisp.enumeration.bK.b.b(DisabilityDiscrepancyActivity.this.aD.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(DisabilityDiscrepancyActivity.this.aD.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(DisabilityDiscrepancyActivity.this.aD.m());
                Object[] objArr = new Object[1];
                a((byte) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 985339527 - View.combineMeasuredStates(0, 0), (short) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) - 19), (ViewConfiguration.getTapTimeout() >> 16) - 118, ((Process.getThreadPriority(0) + 20) >> 6) - 1999409185, objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                DisabilityDiscrepancyActivity.this.aQ.setCancelable(false);
                DisabilityDiscrepancyActivity.this.aQ.setMessage("Please Wait...");
                DisabilityDiscrepancyActivity.this.aQ.setProgressStyle(0);
                DisabilityDiscrepancyActivity.this.aQ.show();
                DisabilityDiscrepancyActivity disabilityDiscrepancyActivity = DisabilityDiscrepancyActivity.this;
                Objects.requireNonNull(disabilityDiscrepancyActivity);
                C0142t c0142t = new C0142t(disabilityDiscrepancyActivity, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new z(disabilityDiscrepancyActivity), new P(disabilityDiscrepancyActivity));
                c0142t.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                c0142t.k = false;
                a.b(disabilityDiscrepancyActivity).c(c0142t);
                int i3 = c + 107;
                d = i3 % 128;
                int i4 = i3 % 2;
            } catch (JSONException unused) {
            }
            dialogInterface.cancel();
        }

        private static void a(byte b, int i, short s, int i2, int i3, Object[] objArr) {
            boolean z;
            int length;
            byte[] bArr;
            int i4 = 2 % 2;
            f fVar = new f();
            StringBuilder sb = new StringBuilder();
            int i5 = i2 + ((int) (((long) d$s27$36) ^ (-1399694120703284637L)));
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr2 = b$s29$36;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = $10 + 113;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            bArr3[i7] = (byte) (((long) bArr2[i7]) * (-1399694120703284637L));
                            i7 %= 0;
                        } else {
                            bArr3[i7] = (byte) (((long) bArr2[i7]) ^ (-1399694120703284637L));
                            i7++;
                        }
                    }
                    bArr2 = bArr3;
                }
                i5 = bArr2 != null ? (byte) (((byte) (((long) b$s29$36[i3 + ((int) (((long) a$s26$36) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$36) ^ (-1399694120703284637L)))) : (short) (((short) (((long) c$s30$36[i3 + ((int) (((long) a$s26$36) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$36) ^ (-1399694120703284637L))));
            }
            if (i5 > 0) {
                fVar.d = ((i3 + i5) - 2) + ((int) (((long) a$s26$36) ^ (-1399694120703284637L))) + i6;
                fVar.e = (char) (((int) (((long) e$s28$36) ^ (-1399694120703284637L))) + i);
                sb.append(fVar.e);
                fVar.a = fVar.e;
                byte[] bArr4 = b$s29$36;
                if (bArr4 != null) {
                    int i9 = $11 + 51;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr4.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr4.length;
                        bArr = new byte[length];
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        bArr[i10] = (byte) (((long) bArr4[i10]) ^ (-1399694120703284637L));
                    }
                    bArr4 = bArr;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i11 = $10 + 67;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    z = false;
                }
                fVar.c = 1;
                while (fVar.c < i5) {
                    int i13 = $10 + 63;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr5 = b$s29$36;
                        int i14 = fVar.d;
                        fVar.d = i14 - 1;
                        fVar.e = (char) (fVar.a + (((byte) (((byte) (((long) bArr5[i14]) ^ (-1399694120703284637L))) + s)) ^ b));
                    } else {
                        short[] sArr = c$s30$36;
                        int i15 = fVar.d;
                        fVar.d = i15 - 1;
                        fVar.e = (char) (fVar.a + (((short) (((short) (((long) sArr[i15]) ^ (-1399694120703284637L))) + s)) ^ b));
                    }
                    sb.append(fVar.e);
                    fVar.a = fVar.e;
                    fVar.c++;
                    int i16 = $10 + 121;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            objArr[0] = sb.toString();
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.aQ = new ProgressDialog(this);
        this.ac = (BISPApplication) getApplicationContext();
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        Intent intent = getIntent();
        this.aW = (RosterItem) intent.getSerializableExtra("roster_data");
        this.ad = intent.getIntExtra("roster_index", 0);
        this.aD = new SessionManager(this);
        this.ae = (EditText) findViewById(R.id.et_cnic);
        this.af = (TextView) findViewById(R.id.tv_roster_disability);
        this.ai = (Spinner) findViewById(R.id.sp_disability);
        this.ah = (ImageView) findViewById(R.id.iv_back);
        this.aj = (TextView) findViewById(R.id.btn_update);
        this.ak = (TextView) findViewById(R.id.btn_validate);
        this.ah.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        this.aL = this.aW.getHhid();
        this.aW.gethH_Name();
        this.aU = this.aW.isIs_Benificiary();
        this.aW.getMessage();
        String cnic = this.aW.getCnic();
        this.aK = cnic;
        this.ae.setText(ag.b(cnic));
        this.aJ = this.aW.getDisabilityCode();
        this.aR = this.aW.getDisabilityStatus();
        this.aS = this.aW.getDiscrepancy_status();
        this.aT = this.aW.getDob();
        this.aO = this.aW.get_educationLevelCode();
        this.aP = this.aW.get_employmentCode();
        this.aN = this.aW.getEmployment_status();
        this.aV = this.aW.getForm_no();
        this.aW.getGender();
        this.aM = this.aW.get_goneToSchoolCode();
        this.aE = this.aW.getHavingChronicDiseaseCode();
        this.an = this.aW.getHhMemberNames();
        this.ao = this.aW.isLiterate();
        this.ap = this.aW.get_lastWeekWorkingHours();
        this.am = this.aW.getMaritalStatus();
        this.ar = this.aW.getMaritalStatusCode();
        this.aq = this.aW.getMessage();
        this.as = this.aW.getRelationToHouseholdHead();
        this.at = this.aW.getrId();
        this.au = this.aW.getWorkStatus();
        this.aA = this.aW.getMobilenumber();
        this.av = this.aW.getMobile_network();
        this.aw = this.aW.getBank_name();
        this.al = this.aW.getBranch_code();
        this.ay = this.aW.getBank_address();
        this.aC = this.aW.getAcc_title();
        this.aB = this.aW.getAcc_number();
        this.ax = this.aW.get_workStatusCode();
        this.az = this.aW.getDupRosterList();
        if (this.aK.equals(BuildConfig.FLAVOR) || this.aK.equalsIgnoreCase("NA")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
            builder.setView(viewInflate);
            AlertDialog alertDialogK = j.k(builder, false);
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
            TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
            editText.addTextChangedListener(new av(this).new buW(this.ae));
            textView.setOnClickListener(new ViewOnClickListenerC0134c(this, editText, alertDialogK));
            int i2 = p + 111;
            q = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = p + 31;
            q = i4 % 128;
            int i5 = i4 % 2;
            try {
                this.aQ.setCancelable(false);
                this.aQ.setMessage("Please Wait...");
                this.aQ.setProgressStyle(0);
                this.aQ.show();
                if (this.aD.k().length() > 0) {
                    int i6 = q + 125;
                    p = i6 % 128;
                    int i7 = i6 % 2;
                    y(this.aK);
                } else {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                    builder2.setTitle("Session Expire");
                    builder2.setMessage("Session Expire Please Login Again.!");
                    builder2.setCancelable(true);
                    builder2.setPositiveButton("Confirm", new DialogInterfaceOnClickListenerC0140r(this));
                    builder2.create().show();
                }
            } catch (Exception unused) {
            }
        }
        if (!this.aR.equals(BuildConfig.FLAVOR)) {
            this.af.setText(this.aR);
            int i8 = q + 33;
            p = i8 % 128;
            int i9 = i8 % 2;
        }
        new au(this, "disability_status", getResources().getString(R.string.disablity_status), this.ai, new h(this)).execute(new Void[0]);
    }

    private static void a(int i, boolean z, int i2, int i3, char[] cArr, Object[] objArr) {
        int i4 = 2 % 2;
        o.a aVar = new o.a();
        char[] cArr2 = new char[i2];
        aVar.b = 0;
        while (aVar.b < i2) {
            int i5 = $11 + 67;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            aVar.a = cArr[aVar.b];
            cArr2[aVar.b] = (char) (aVar.a + i3);
            int i7 = aVar.b;
            cArr2[i7] = (char) (cArr2[i7] - ((int) (((long) a$s14$948) ^ (-3199524018197912079L))));
            aVar.b++;
        }
        if (i > 0) {
            int i8 = $10 + 95;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            aVar.c = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - aVar.c, aVar.c);
            System.arraycopy(cArr3, aVar.c, cArr2, 0, i2 - aVar.c);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            aVar.b = 0;
            while (aVar.b < i2) {
                cArr4[aVar.b] = cArr2[(i2 - aVar.b) - 1];
                aVar.b++;
                int i10 = $11 + 41;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
