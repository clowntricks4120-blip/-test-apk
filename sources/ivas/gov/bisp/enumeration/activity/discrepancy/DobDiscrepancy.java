package ivas.gov.bisp.enumeration.activity.discrepancy;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
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
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p031bd.C0133a;
import ivas.gov.bisp.enumeration.p031bd.M;
import ivas.gov.bisp.enumeration.p031bd.N;
import ivas.gov.bisp.enumeration.p031bd.ViewOnClickListenerC0136l;
import ivas.gov.bisp.enumeration.p031bd.u;
import ivas.gov.bisp.enumeration.p031bd.x;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import ivas.gov.bisp.enumeration.p043bp.am;
import ivas.gov.bisp.enumeration.p044bq.w;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.f;
import o.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DobDiscrepancy extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s60$951 = 31405;
    public static final /* synthetic */ int ac = 0;
    private static char[] c$s59$951 = {20309, 19625, 20310, 20316, 20304, 20314, 20336, 20311, 20225, 20289, 20325, 20306, 19624, 20295, 20308, 20317};
    private static int p = 1;
    private static int q;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public long aF;
    public String aG;
    public ImageView aH;
    public String aI;
    public String aJ;
    public String aK;
    public String aL;
    public String aM;
    public String aN;
    public String aO;
    public String aP;
    public String aQ;
    public String aR;
    public TextView aS;
    public String aT;
    public String aU;
    public String aV;
    public String aW;
    public String aX;
    public TextView aY;
    public ProgressDialog ad;
    public BISPApplication ae;
    public RosterItem af;
    public int ag;
    public SessionManager ah;
    public TextView ai;
    public EditText aj;
    public TextView ak;
    public TextView al;
    public int am;
    public boolean an;
    public String ao;
    public String ap;
    public String aq;
    public int ar;
    public boolean as;
    public int at;
    public int au;
    public int av;
    public int aw;
    public int ax;
    public String ay;
    public int az;

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            DobDiscrepancy dobDiscrepancy = DobDiscrepancy.this;
            w wVar = new w(dobDiscrepancy, dobDiscrepancy.ah);
            int i3 = a + 21;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                wVar.execute(new Void[1]);
            } else {
                wVar.execute(new Void[0]);
            }
            dialogInterface.cancel();
        }
    }

    public static void u(DobDiscrepancy dobDiscrepancy, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(dobDiscrepancy, R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(dobDiscrepancy);
        View viewInflate = LayoutInflater.from(dobDiscrepancy).inflate(R.layout.new_custom_dialog, (ViewGroup) dobDiscrepancy.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new ViewOnClickListenerC0136l(dobDiscrepancy, bVarB));
        int i3 = p + 25;
        q = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) DiscrepancyActivity.class);
        intent.putExtra("roster_data", this.af);
        intent.putExtra("roster_index", this.ag);
        startActivity(intent);
        finish();
        int i2 = q + 45;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q + 39;
        int i3 = i2 % 128;
        p = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        q = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_dob_discrepancy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
            jSONObject.put("sessionUserCnic", this.ah.r());
            jSONObject.put("call_origin", 100);
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ah.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ah.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ah.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ah.m());
            Object[] objArr = new Object[1];
            a((byte) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 59), super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, new char[]{7, 14, 6, 5, 14, 6, '\r', '\t', 1, 4, 7, '\b', 1, '\t', 7, 3, 11, '\t'}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ad, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0133a(this));
            int i2 = q + 41;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            Intent intent = new Intent(DobDiscrepancy.this, (Class<?>) UpdatePhoneNoActivity.class);
            int i3 = a;
            int i4 = i3 & 103;
            int i5 = -(-((i3 ^ 103) | i4));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            RosterItem rosterItem = DobDiscrepancy.this.af;
            int i8 = a;
            int i9 = ((((i8 ^ 43) | (i8 & 43)) << 1) - (~(-(((~i8) & 43) | (i8 & (-44)))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            intent.putExtra("roster_data", rosterItem);
            DobDiscrepancy dobDiscrepancy = DobDiscrepancy.this;
            int i11 = a;
            int i12 = (i11 & (-62)) | ((~i11) & 61);
            int i13 = -(-((i11 & 61) << 1));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            intent.putExtra("roster_cnic", dobDiscrepancy.aK);
            DobDiscrepancy dobDiscrepancy2 = DobDiscrepancy.this;
            int i16 = a + 41;
            b = i16 % 128;
            int i17 = i16 % 2;
            dobDiscrepancy2.startActivity(intent);
            dialogInterface.cancel();
            int i18 = b;
            int i19 = (i18 ^ 6) + ((i18 & 6) << 1);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
        }
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
            int i6 = i5 ^ 37;
            int i7 = (i5 & 37) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = (((i5 | 82) << 1) - (i5 ^ 82)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 27) << 1;
            int i4 = -(i2 ^ 27);
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            DobDiscrepancy.this.ai.setVisibility(8);
            int i7 = b;
            int i8 = i7 ^ 7;
            int i9 = (((i7 & 7) | i8) << 1) - i8;
            a = i9 % 128;
            int i10 = i9 % 2;
            DobDiscrepancy.this.ak.setVisibility(0);
            int i11 = b;
            int i12 = (i11 & (-34)) | ((~i11) & 33);
            int i13 = -(-((i11 & 33) << 1));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = q + 89;
        p = i3 % 128;
        int i4 = i3 % 2;
        switch (view.getId()) {
            case R.id.btn_update /* 2131361971 */:
                this.aJ = this.ah.p();
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Phone Number.!");
                StringBuilder sbW = j.w("Please Comfirm your Phone # ");
                sbW.append(this.aJ);
                builder.setMessage(sbW.toString());
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO00o());
                builder.setNegativeButton("No", new OooO0O0());
                builder.create().show();
                int i5 = q + 93;
                p = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case R.id.btn_validate /* 2131361973 */:
                y();
                return;
            case R.id.iv_back /* 2131362305 */:
                onBackPressed();
                return;
            case R.id.tv_dob /* 2131363198 */:
                C0104p.c().h(this, "Warning", "If you change age of household then all added rosters will be removed. Are you sure you want to change age?? ", new am(this, i), DialogInterfaceOnClickListenerC0217y.g, true);
                return;
            default:
                return;
        }
    }

    public final void y() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hH_ID", this.aI);
            jSONObject.put("cnic", this.aK);
            jSONObject.put("r_id", this.aF);
            jSONObject.put("update_type", "dob");
            this.ad.setCancelable(true);
            this.ad.setMessage("Please Wait...");
            this.ad.setProgressStyle(0);
            this.ad.show();
            if (this.ah.k().length() <= 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Session Expire");
                builder.setMessage("Session Expire Please Login Again.!");
                builder.setCancelable(true);
                builder.setPositiveButton("Confirm", new OooO0o());
                builder.create().show();
                int i2 = q + 73;
                p = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = q + 117;
            p = i4 % 128;
            if (i4 % 2 != 0) {
                z(this.aK);
                return;
            }
            z(this.aK);
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

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int a$s26$36 = 270212488;
        private static byte[] b$s29$36 = {-72, 109, -97, 101, -106, 110, -110, 104, -112, 108, -109, 105, 70, 97, -80, 72, -68, -110, 112, -98, -105, 120};
        private static int c = 0;
        private static short[] c$s30$36 = null;
        private static int d = 1;
        private static int d$s27$36 = -179885480;
        private static int e$s28$36 = 1109737774;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String hhid = DobDiscrepancy.this.af.getHhid();
                int relationToHouseholdHead = DobDiscrepancy.this.af.getRelationToHouseholdHead();
                StringBuilder sb = new StringBuilder();
                sb.append(DobDiscrepancy.this.af.getrId());
                String string = sb.toString();
                jSONObject.put("HH_ID", hhid);
                jSONObject.put("cnic", DobDiscrepancy.this.aK);
                jSONObject.put("relation_to_hh", relationToHouseholdHead);
                jSONObject.put("dob", DobDiscrepancy.this.aY.getText().toString());
                jSONObject.put("r_id", string);
                jSONObject.put("SessionId", BISPApplication.c().s);
                jSONObject.put("IpAddress", ac.h(true));
                jSONObject.put("sessionUserCnic", DobDiscrepancy.this.ah.r());
                jSONObject.put("discrepency_status", "10");
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(DobDiscrepancy.this.ah.k()), ivas.gov.bisp.enumeration.bK.b.b(DobDiscrepancy.this.ah.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(DobDiscrepancy.this.ah.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(DobDiscrepancy.this.ah.m());
                Object[] objArr = new Object[1];
                a((byte) (ViewConfiguration.getTouchSlop() >> 8), 1218286856 + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) - 60, 446941205 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                DobDiscrepancy.this.ad.setCancelable(false);
                DobDiscrepancy.this.ad.setMessage("Please Wait...");
                DobDiscrepancy.this.ad.setProgressStyle(0);
                DobDiscrepancy.this.ad.show();
                DobDiscrepancy dobDiscrepancy = DobDiscrepancy.this;
                Objects.requireNonNull(dobDiscrepancy);
                N n = new N(dobDiscrepancy, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new x(dobDiscrepancy), new M(dobDiscrepancy));
                n.m = new z(130000, 0, 0.0f);
                n.k = false;
                a.b(dobDiscrepancy).c(n);
            } catch (JSONException unused) {
            }
            dialogInterface.cancel();
            int i3 = d + 57;
            c = i3 % 128;
            int i4 = i3 % 2;
        }

        private static void a(byte b, int i, short s, int i2, int i3, Object[] objArr) {
            int i4;
            int i5 = 2 % 2;
            f fVar = new f();
            StringBuilder sb = new StringBuilder();
            int i6 = i2 + ((int) (((long) d$s27$36) ^ (-1399694120703284637L)));
            if (i6 == -1) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = b$s29$36;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        bArr2[i9] = (byte) (((long) bArr[i9]) ^ (-1399694120703284637L));
                    }
                    bArr = bArr2;
                }
                i6 = bArr != null ? (byte) (((byte) (((long) b$s29$36[i3 + ((int) (((long) a$s26$36) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$36) ^ (-1399694120703284637L)))) : (short) (((short) (((long) c$s30$36[i3 + ((int) (((long) a$s26$36) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$36) ^ (-1399694120703284637L))));
            }
            if (i6 > 0) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                fVar.d = ((i3 + i6) - 2) + ((int) (((long) a$s26$36) ^ (-1399694120703284637L))) + i4;
                fVar.e = (char) (((int) (((long) e$s28$36) ^ (-1399694120703284637L))) + i);
                sb.append(fVar.e);
                fVar.a = fVar.e;
                byte[] bArr3 = b$s29$36;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i12 = $10 + 89;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr4[i14] = (byte) (((long) bArr3[i14]) ^ (-1399694120703284637L));
                    }
                    bArr3 = bArr4;
                }
                boolean z = bArr3 != null;
                fVar.c = 1;
                while (fVar.c < i6) {
                    if (z) {
                        byte[] bArr5 = b$s29$36;
                        int i15 = fVar.d;
                        fVar.d = i15 - 1;
                        fVar.e = (char) (fVar.a + (((byte) (((byte) (((long) bArr5[i15]) ^ (-1399694120703284637L))) + s)) ^ b));
                    } else {
                        short[] sArr = c$s30$36;
                        int i16 = fVar.d;
                        fVar.d = i16 - 1;
                        fVar.e = (char) (fVar.a + (((short) (((short) (((long) sArr[i16]) ^ (-1399694120703284637L))) + s)) ^ b));
                    }
                    sb.append(fVar.e);
                    fVar.a = fVar.e;
                    fVar.c++;
                }
            }
            objArr[0] = sb.toString();
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ad = new ProgressDialog(this);
        this.ae = (BISPApplication) getApplicationContext();
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        Intent intent = getIntent();
        this.af = (RosterItem) intent.getSerializableExtra("roster_data");
        this.ag = intent.getIntExtra("roster_index", 0);
        this.ah = new SessionManager(this);
        this.aH = (ImageView) findViewById(R.id.iv_back);
        this.aj = (EditText) findViewById(R.id.et_cnic);
        this.ai = (TextView) findViewById(R.id.btn_update);
        this.ak = (TextView) findViewById(R.id.btn_validate);
        this.aS = (TextView) findViewById(R.id.tv_heading);
        this.aY = (TextView) findViewById(R.id.tv_dob);
        this.al = (TextView) findViewById(R.id.tv_nser_dob);
        this.aS.setText("UPDATE DATE OF BIRTH");
        this.aH.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.ak.setVisibility(8);
        this.ai.setVisibility(0);
        this.ai.setEnabled(false);
        this.aY.setOnClickListener(this);
        this.aj.addTextChangedListener(new OooO0OO());
        this.aI = this.af.getHhid();
        this.an = this.af.isIs_Benificiary();
        this.af.getMessage();
        this.aK = this.af.getCnic();
        this.ar = this.af.getDisabilityCode();
        this.aN = this.af.getDisabilityStatus();
        this.aW = this.af.getDiscrepancy_status();
        this.aM = this.af.getDob();
        this.at = this.af.get_educationLevelCode();
        this.au = this.af.get_employmentCode();
        this.aL = this.af.getEmployment_status();
        this.aT = this.af.getForm_no();
        this.aU = this.af.getGender();
        this.av = this.af.get_goneToSchoolCode();
        this.aC = this.af.getHavingChronicDiseaseCode();
        this.aV = this.af.getHhMemberNames();
        this.as = this.af.isLiterate();
        this.aw = this.af.get_lastWeekWorkingHours();
        this.aQ = this.af.getMaritalStatus();
        this.ax = this.af.getMaritalStatusCode();
        this.aR = this.af.getMessage();
        this.am = this.af.getRelationToHouseholdHead();
        this.aF = this.af.getrId();
        this.aP = this.af.getWorkStatus();
        this.aE = this.af.get_workStatusCode();
        this.ay = this.af.getDupRosterList();
        this.aX = this.af.getMobilenumber();
        this.aO = this.af.getMobile_network();
        this.aG = this.af.getBank_name();
        this.aA = this.af.getBranch_code();
        this.ao = this.af.getBank_address();
        this.ap = this.af.getAcc_title();
        this.aq = this.af.getAcc_number();
        this.aj.setText(ag.b(this.aK));
        this.aY.setText(this.aM);
        this.al.setText(this.aM);
        if (!this.aK.equals(BuildConfig.FLAVOR)) {
            int i2 = p + 27;
            q = i2 % 128;
            int i3 = i2 % 2;
            if (!this.aK.equalsIgnoreCase("NA")) {
                int i4 = p + 89;
                q = i4 % 128;
                if (i4 % 2 == 0) {
                    y();
                    return;
                } else {
                    y();
                    int i5 = 75 / 0;
                    return;
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
        textView.setOnClickListener(new u(this, editText, alertDialogK));
    }

    private static void a(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        k kVar = new k();
        char[] cArr2 = c$s59$951;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 69;
                $10 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr3[i4] = (char) (((long) cArr2[i4]) ^ 3459633260503792297L);
                    i4++;
                } else {
                    cArr3[i4] = (char) (((long) cArr2[i4]) - 3459633260503792297L);
                    i4 >>>= 1;
                }
            }
            cArr2 = cArr3;
        }
        char c = (char) (3459633260503792297L ^ ((long) a$s60$951));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            kVar.c = 0;
            while (kVar.c < i2) {
                kVar.e = cArr[kVar.c];
                kVar.b = cArr[kVar.c + 1];
                if (kVar.e != kVar.b) {
                    kVar.a = kVar.e / c;
                    kVar.h = kVar.e % c;
                    kVar.d = kVar.b / c;
                    kVar.f = kVar.b % c;
                    if (kVar.h == kVar.f) {
                        kVar.a = ((kVar.a + c) - 1) % c;
                        kVar.d = ((kVar.d + c) - 1) % c;
                        int i8 = (kVar.a * c) + kVar.h;
                        int i9 = (kVar.d * c) + kVar.f;
                        cArr4[kVar.c] = cArr2[i8];
                        cArr4[kVar.c + 1] = cArr2[i9];
                    } else if (kVar.a == kVar.d) {
                        kVar.h = ((kVar.h + c) - 1) % c;
                        kVar.f = ((kVar.f + c) - 1) % c;
                        int i10 = (kVar.a * c) + kVar.h;
                        int i11 = (kVar.d * c) + kVar.f;
                        cArr4[kVar.c] = cArr2[i10];
                        cArr4[kVar.c + 1] = cArr2[i11];
                    } else {
                        int i12 = (kVar.a * c) + kVar.f;
                        int i13 = (kVar.d * c) + kVar.h;
                        cArr4[kVar.c] = cArr2[i12];
                        cArr4[kVar.c + 1] = cArr2[i13];
                    }
                } else {
                    int i14 = $10 + 89;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        cArr4[kVar.c] = (char) (kVar.e * b);
                        cArr4[kVar.c] = (char) (kVar.b + b);
                    } else {
                        cArr4[kVar.c] = (char) (kVar.e - b);
                        cArr4[kVar.c + 1] = (char) (kVar.b - b);
                    }
                }
                kVar.c += 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
