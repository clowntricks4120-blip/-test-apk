package ivas.gov.bisp.enumeration.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.discrepancy.DisabilityDiscrepancyActivity;
import ivas.gov.bisp.enumeration.activity.discrepancy.DobDiscrepancy;
import ivas.gov.bisp.enumeration.activity.discrepancy.GenderDiscrepancy;
import ivas.gov.bisp.enumeration.activity.discrepancy.MaritalDiscrepancy;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p036bi.B;
import ivas.gov.bisp.enumeration.p036bi.C0152ad;
import ivas.gov.bisp.enumeration.p036bi.C0153ae;
import ivas.gov.bisp.enumeration.p036bi.C0154af;
import ivas.gov.bisp.enumeration.p036bi.C0157ai;
import ivas.gov.bisp.enumeration.p036bi.C0173b;
import ivas.gov.bisp.enumeration.p036bi.E;
import ivas.gov.bisp.enumeration.p036bi.F;
import ivas.gov.bisp.enumeration.p036bi.U;
import ivas.gov.bisp.enumeration.p036bi.Z;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;
import o.f;
import o.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DiscrepancyActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s26$1125 = -729639967;
    private static byte[] b$s29$1125 = {117, -106, 110, -110, 104, -112, 108, -109, 105, 70, -126, -103, -104, 72, -67, -110, 112, -98, -105, 120, 120, -77, 84, -77, 110, -110, 98, 103, -98, 110, -110, 108, -102, 100, 66, 99, 99};
    private static short[] c$s30$1125 = null;
    private static int d$s27$1125 = -179885542;
    private static int e$s28$1125 = 39417586;
    private static int p = 1;
    private static int q;
    public BISPApplication ac;
    public RosterItem ad;
    public int ae;
    public ImageView af;
    public CardView ag;
    public CardView ah;
    public CardView ai;
    public CardView aj;
    public CardView ak;
    public boolean al = false;
    public boolean am = false;
    public ProgressDialog an;
    public String ao;
    public long ap;
    public int aq;
    public String ar;
    public CardView as;
    public SessionManager at;
    public String au;
    public CardView av;

    public static void v(DiscrepancyActivity discrepancyActivity, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(discrepancyActivity, R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(discrepancyActivity);
        View viewInflate = LayoutInflater.from(discrepancyActivity).inflate(R.layout.new_custom_dialog, (ViewGroup) discrepancyActivity.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new U(discrepancyActivity, bVarB));
        int i3 = p + 95;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) DiscrepancyRosterListActivity.class));
        finish();
        int i2 = q + 83;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 121;
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 87;
        p = i4 % 128;
        if (i4 % 2 != 0) {
            return R.layout.activity_discrepancy;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 75;
        p = i2 % 128;
        int i3 = i2 % 2;
        switch (view.getId()) {
            case R.id.cv_cnic /* 2131362061 */:
                A();
                int i4 = q + 109;
                p = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            case R.id.cv_disability /* 2131362064 */:
                Intent intent = new Intent(this, (Class<?>) DisabilityDiscrepancyActivity.class);
                intent.putExtra("roster_data", this.ad);
                intent.putExtra("roster_index", this.ae);
                startActivity(intent);
                finish();
                return;
            case R.id.cv_dob_info /* 2131362067 */:
                Intent intent2 = new Intent(this, (Class<?>) DobDiscrepancy.class);
                intent2.putExtra("roster_data", this.ad);
                intent2.putExtra("roster_index", this.ae);
                startActivity(intent2);
                finish();
                return;
            case R.id.cv_duplicate_cnic /* 2131362068 */:
                z(this.ad.getrId());
                return;
            case R.id.cv_gender_update /* 2131362070 */:
                Intent intent3 = new Intent(this, (Class<?>) GenderDiscrepancy.class);
                intent3.putExtra("roster_data", this.ad);
                intent3.putExtra("roster_index", this.ae);
                startActivity(intent3);
                finish();
                return;
            case R.id.cv_marital_info /* 2131362076 */:
                Intent intent4 = new Intent(this, (Class<?>) MaritalDiscrepancy.class);
                intent4.putExtra("roster_data", this.ad);
                intent4.putExtra("roster_index", this.ae);
                startActivity(intent4);
                finish();
                return;
            case R.id.cv_splitting_cnic /* 2131362083 */:
                z(this.ad.getrId());
                return;
            case R.id.iv_back /* 2131362305 */:
                onBackPressed();
                int i5 = p + 29;
                q = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (!(!this.ac.r)) {
            int i2 = p + 85;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                this.ag.setVisibility(109);
            } else {
                this.ag.setVisibility(8);
            }
        }
        if (this.ac.t) {
            int i3 = p + 69;
            q = i3 % 128;
            int i4 = i3 % 2;
            CardView cardView = this.ai;
            if (i4 != 0) {
                cardView.setVisibility(84);
            } else {
                cardView.setVisibility(8);
            }
        }
    }

    public final void A() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.cnic_dialog, (ViewGroup) findViewById(android.R.id.content), false);
        aiz.c(viewInflate);
        b bVarB = aiz.b();
        bVarB.show();
        bVarB.setCancelable(true);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_cnic);
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_ok);
        editText.addTextChangedListener(new av(this).new buW(editText));
        textView.setOnClickListener(new OooO00o(editText, bVarB));
        int i2 = q + 69;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void z(long j) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("roster_id", j);
            this.an.setCancelable(false);
            this.an.setTitle("Deleting Roster");
            this.an.setMessage("Please Wait...");
            this.an.setProgressStyle(0);
            this.an.show();
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.at.k()), ivas.gov.bisp.enumeration.bK.b.b(this.at.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.at.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.at.m());
            Object[] objArr = new Object[1];
            a((byte) (getPackageName().length() - 25), 149005120 + super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3), (short) (super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), getApplicationInfo().targetSdkVersion - 136, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 566606194, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            Z z = new Z(this, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new C0154af(this), new C0173b(this));
            z.m = new z(130000, 0, 0.0f);
            z.k = false;
            a.b(this).c(z);
            int i2 = q + 101;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public static void u(DiscrepancyActivity discrepancyActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(discrepancyActivity);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("HH_ID", discrepancyActivity.ao);
            jSONObject.put("cnic", discrepancyActivity.ar);
            jSONObject.put("old_cnic", discrepancyActivity.au);
            jSONObject.put("relation_to_hh", discrepancyActivity.aq);
            jSONObject.put("r_id", discrepancyActivity.ap);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("discrepency_status", str);
            jSONObject.put("sessionUserCnic", discrepancyActivity.at.r());
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(discrepancyActivity.at.k()), ivas.gov.bisp.enumeration.bK.b.b(discrepancyActivity.at.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(discrepancyActivity.at.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(discrepancyActivity.at.m());
            Object[] objArr = new Object[1];
            a((byte) (ViewConfiguration.getTapTimeout() >> 16), 149005252 + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (Process.myTid() >> 22), ExpandableListView.getPackedPositionType(0L) - 100, (-566606210) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            if (str.equals("1")) {
                C0157ai c0157ai = new C0157ai(discrepancyActivity, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new C0152ad(discrepancyActivity), new E(discrepancyActivity));
                c0157ai.m = new z(130000, 0, 0.0f);
                c0157ai.k = false;
                a.b(discrepancyActivity).c(c0157ai);
                return;
            }
            B b = new B(discrepancyActivity, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new C0153ae(discrepancyActivity), new F(discrepancyActivity));
            b.m = new z(130000, 0, 0.0f);
            b.k = false;
            a.b(discrepancyActivity).c(b);
            int i2 = p + 123;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 24 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    public class OooO00o implements View.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char a$s60$35 = 31405;
        private static int c = 1;
        private static char[] c$s59$35 = {20304, 20295, 20317, 20306, 20326, 20310, 20314, 20321, 20337, 20311, 20316, 20289, 20288, 20309, 20346, 20291};
        private static int d;
        public final /* synthetic */ EditText g;
        public final /* synthetic */ b h;

        public OooO00o(EditText editText, b bVar) {
            this.g = editText;
            this.h = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
        
            if (r1.ac.x != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
        
            r3 = r1.ar;
            java.util.Objects.requireNonNull(r1);
            r4 = new org.json.JSONObject();
            r8 = new org.json.JSONObject();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            r4.put("hH_ID", r1.ao);
            r4.put("cnic", r3);
            r4.put("CnicEnc", r3);
            r4.put("r_id", r1.ap);
            r4.put("SessionId", ivas.gov.bisp.enumeration.BISPApplication.c().s);
            r4.put("IpAddress", ivas.gov.bisp.enumeration.bK.ac.h(true));
            r4.put("sessionUserCnic", r1.at.r());
            r4.put("update_type", "cnic");
            r1.an.setCancelable(false);
            r1.an.setMessage("Please Wait...");
            r1.an.setProgressStyle(0);
            r1.an.show();
            r8.put("string1", ivas.gov.bisp.enumeration.bK.b.d(r4.toString(), ivas.gov.bisp.enumeration.bK.b.b(r1.at.k()), ivas.gov.bisp.enumeration.bK.b.b(r1.at.m())));
            r12 = ivas.gov.bisp.enumeration.bK.b.b(r1.at.k());
            r3 = ivas.gov.bisp.enumeration.bK.b.b(r1.at.m());
            r5 = new java.lang.Object[1];
            a((byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 66), 21 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), new char[]{7, '\f', 11, 1, 5, '\t', 6, 11, '\r', 0, 7, '\t', 11, 0, 14, 4, 2, '\f', 1, 14, 13880}, r5);
            r8.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((java.lang.String) r5[0]).intern(), r12, r3));
            r12 = new ivas.gov.bisp.enumeration.p036bi.C0150ab(r1, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", r8, new ivas.gov.bisp.enumeration.p036bi.K(r1), new ivas.gov.bisp.enumeration.p036bi.C0149aa(r1));
            r12.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
            r12.k = false;
            ivas.gov.bisp.enumeration.p023aw.a.b(r1).c(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x013f, code lost:
        
            r12 = ivas.gov.bisp.enumeration.activity.DiscrepancyActivity.OooO00o.d + 3;
            ivas.gov.bisp.enumeration.activity.DiscrepancyActivity.OooO00o.c = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
        
            if (r1.ac.x != false) goto L11;
         */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r12) {
            /*
                Method dump skipped, instruction units count: 367
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.DiscrepancyActivity.OooO00o.onClick(android.view.View):void");
        }

        private static void a(byte b, int i, char[] cArr, Object[] objArr) {
            int i2;
            int i3 = 2 % 2;
            k kVar = new k();
            char[] cArr2 = c$s59$35;
            if (cArr2 != null) {
                int i4 = $10 + 89;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    cArr3[i6] = (char) (((long) cArr2[i6]) ^ 3459633260503792297L);
                }
                cArr2 = cArr3;
            }
            char c2 = (char) (3459633260503792297L ^ ((long) a$s60$35));
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $11 + 115;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    i2 = i + 43;
                    cArr4[i2] = (char) (cArr[i2] >> b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i8 = $11 + 67;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                kVar.c = 0;
                while (kVar.c < i2) {
                    kVar.e = cArr[kVar.c];
                    kVar.b = cArr[kVar.c + 1];
                    if (kVar.e == kVar.b) {
                        int i10 = $11 + 9;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            cArr4[kVar.c] = (char) (kVar.e - b);
                            cArr4[kVar.c + 1] = (char) (kVar.b % b);
                        } else {
                            cArr4[kVar.c] = (char) (kVar.e - b);
                            cArr4[kVar.c + 1] = (char) (kVar.b - b);
                        }
                    } else {
                        kVar.a = kVar.e / c2;
                        kVar.h = kVar.e % c2;
                        kVar.d = kVar.b / c2;
                        kVar.f = kVar.b % c2;
                        if (kVar.h == kVar.f) {
                            int i11 = $10 + 123;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            kVar.a = ((kVar.a + c2) - 1) % c2;
                            kVar.d = ((kVar.d + c2) - 1) % c2;
                            int i13 = (kVar.a * c2) + kVar.h;
                            int i14 = (kVar.d * c2) + kVar.f;
                            cArr4[kVar.c] = cArr2[i13];
                            cArr4[kVar.c + 1] = cArr2[i14];
                        } else if (kVar.a == kVar.d) {
                            kVar.h = ((kVar.h + c2) - 1) % c2;
                            kVar.f = ((kVar.f + c2) - 1) % c2;
                            int i15 = (kVar.a * c2) + kVar.h;
                            int i16 = (kVar.d * c2) + kVar.f;
                            cArr4[kVar.c] = cArr2[i15];
                            cArr4[kVar.c + 1] = cArr2[i16];
                            int i17 = $11 + 9;
                            $10 = i17 % 128;
                            if (i17 % 2 != 0) {
                                int i18 = 4 / 5;
                            }
                        } else {
                            int i19 = (kVar.a * c2) + kVar.f;
                            int i20 = (kVar.d * c2) + kVar.h;
                            cArr4[kVar.c] = cArr2[i19];
                            cArr4[kVar.c + 1] = cArr2[i20];
                        }
                    }
                    kVar.c += 2;
                }
            }
            int i21 = 0;
            while (i21 < i) {
                int i22 = $10 + 19;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr4[i21] = (char) (cArr4[i21] ^ 10789);
                    i21 += 109;
                } else {
                    cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                    i21++;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x01e4  */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ac = (BISPApplication) getApplicationContext();
        this.an = new ProgressDialog(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        Intent intent = getIntent();
        this.ad = (RosterItem) intent.getSerializableExtra("roster_data");
        this.ae = intent.getIntExtra("roster_index", 0);
        intent.getStringExtra("data");
        this.af = (ImageView) findViewById(R.id.iv_back);
        this.ag = (CardView) findViewById(R.id.cv_cnic);
        this.ai = (CardView) findViewById(R.id.cv_disability);
        this.ah = (CardView) findViewById(R.id.cv_duplicate_cnic);
        this.aj = (CardView) findViewById(R.id.cv_splitting_cnic);
        this.ak = (CardView) findViewById(R.id.cv_gender_update);
        this.as = (CardView) findViewById(R.id.cv_marital_info);
        this.av = (CardView) findViewById(R.id.cv_dob_info);
        this.af.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.as.setOnClickListener(this);
        this.av.setOnClickListener(this);
        this.at = new SessionManager(this);
        this.ao = this.ad.getHhid();
        this.ad.isIs_Benificiary();
        this.ad.getMessage();
        this.au = this.ad.getCnic();
        this.ad.getDisabilityCode();
        this.ad.getDisabilityStatus();
        this.ad.getDiscrepancy_status();
        this.ad.getDob();
        this.ad.get_educationLevelCode();
        this.ad.get_employmentCode();
        this.ad.getEmployment_status();
        this.ad.getForm_no();
        this.ad.getGender();
        this.ad.get_goneToSchoolCode();
        this.ad.getHavingChronicDiseaseCode();
        this.ad.getHhMemberNames();
        this.ad.isLiterate();
        this.ad.get_lastWeekWorkingHours();
        this.ad.getMaritalStatus();
        this.ad.getMaritalStatusCode();
        this.ad.getMessage();
        this.aq = this.ad.getRelationToHouseholdHead();
        this.ap = this.ad.getrId();
        this.ad.getWorkStatus();
        this.ad.get_workStatusCode();
        this.ad.getMobilenumber();
        this.ad.getMobile_network();
        this.ad.getBank_name();
        this.ad.getBranch_code();
        this.ad.getBank_address();
        this.ad.getAcc_title();
        this.ad.getAcc_number();
        this.ad.getDupRosterList();
        this.ai.setVisibility(8);
        this.ag.setVisibility(8);
        this.ah.setVisibility(8);
        this.aj.setVisibility(8);
        this.ak.setVisibility(8);
        this.as.setVisibility(8);
        this.av.setVisibility(8);
        String discrepancy_status = this.ad.getDiscrepancy_status();
        for (String str : discrepancy_status.split(",")) {
            if (str.equals("4")) {
                this.ai.setVisibility(0);
                int i2 = p + 17;
                q = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 % 5;
                }
            }
            if (str.equals("1")) {
                this.ag.setVisibility(0);
            } else {
                int i4 = p + 11;
                q = i4 % 128;
                int i5 = i4 % 2;
                if (!(!str.equals("3"))) {
                    this.ag.setVisibility(0);
                }
            }
            if (str.equals("2")) {
                this.ah.setVisibility(0);
            }
            if (!(!str.equals("6"))) {
                this.aj.setVisibility(0);
            }
            if (str.equals("8")) {
                this.ak.setVisibility(0);
            }
            if (str.equals("9")) {
                int i6 = q + 121;
                p = i6 % 128;
                int i7 = i6 % 2;
                this.as.setVisibility(0);
            }
            if (str.equals("10")) {
                int i8 = p + 9;
                q = i8 % 128;
                if (i8 % 2 != 0) {
                    this.av.setVisibility(1);
                } else {
                    this.av.setVisibility(0);
                }
            }
        }
        if (discrepancy_status.contains("1")) {
            int i9 = q + 123;
            p = i9 % 128;
            int i10 = i9 % 2;
            this.al = true;
            this.am = false;
        }
        if (discrepancy_status.contains("3")) {
            this.al = false;
            this.am = true;
        }
        if (discrepancy_status.contains("1")) {
            int i11 = p + 53;
            q = i11 % 128;
            int i12 = i11 % 2;
            if (discrepancy_status.contains("3")) {
                this.al = true;
                this.am = true;
            }
        }
    }

    private static void a(byte b, int i, short s, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 2 % 2;
        f fVar = new f();
        StringBuilder sb = new StringBuilder();
        int i6 = i2 + ((int) (((long) d$s27$1125) ^ (-1399694120703284637L)));
        boolean z = i6 == -1;
        if (z) {
            byte[] bArr = b$s29$1125;
            if (bArr != null) {
                int i7 = $11 + 89;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i9 = 0; i9 < length; i9++) {
                    bArr2[i9] = (byte) (((long) bArr[i9]) ^ (-1399694120703284637L));
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (((long) b$s29$1125[i3 + ((int) (((long) a$s26$1125) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$1125) ^ (-1399694120703284637L)))) : (short) (((short) (((long) c$s30$1125[i3 + ((int) (((long) a$s26$1125) ^ (-1399694120703284637L)))]) ^ (-1399694120703284637L))) + ((int) (((long) d$s27$1125) ^ (-1399694120703284637L))));
        }
        if (i6 > 0) {
            int i10 = ((i3 + i6) - 2) + ((int) (((long) a$s26$1125) ^ (-1399694120703284637L)));
            if (z) {
                int i11 = $10 + 17;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            fVar.d = i10 + i4;
            fVar.e = (char) (((int) (((long) e$s28$1125) ^ (-1399694120703284637L))) + i);
            sb.append(fVar.e);
            fVar.a = fVar.e;
            byte[] bArr3 = b$s29$1125;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i13 = 0; i13 < length2; i13++) {
                    int i14 = $10 + 37;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    bArr4[i13] = (byte) (((long) bArr3[i13]) ^ (-1399694120703284637L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            fVar.c = 1;
            int i16 = $11 + 45;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            while (fVar.c < i6) {
                if (z2) {
                    int i18 = $11 + 121;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    byte[] bArr5 = b$s29$1125;
                    int i20 = fVar.d;
                    fVar.d = i20 - 1;
                    fVar.e = (char) (fVar.a + (((byte) (((byte) (((long) bArr5[i20]) ^ (-1399694120703284637L))) + s)) ^ b));
                } else {
                    short[] sArr = c$s30$1125;
                    int i21 = fVar.d;
                    fVar.d = i21 - 1;
                    fVar.e = (char) (fVar.a + (((short) (((short) (((long) sArr[i21]) ^ (-1399694120703284637L))) + s)) ^ b));
                }
                sb.append(fVar.e);
                fVar.a = fVar.e;
                fVar.c++;
            }
        }
        String string = sb.toString();
        int i22 = $10 + 23;
        $11 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = string;
    }
}
