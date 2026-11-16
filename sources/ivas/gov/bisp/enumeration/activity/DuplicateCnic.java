package ivas.gov.bisp.enumeration.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.af;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p022av.C0094m;
import ivas.gov.bisp.enumeration.p022av.T;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.C0098p;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.C0163ap;
import ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnClickListenerC0158ak;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0182k;
import ivas.gov.bisp.enumeration.p038bk.bk;
import ivas.gov.bisp.enumeration.p038bk.bs;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DuplicateCnic extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a$s14$918 = 1962649080;
    private static int p = 1;
    private static int q;
    public ProgressDialog ac;
    public String ae;
    public String af;
    public String ag;
    public String ah;
    public String aj;
    public String ak;
    public List<RosterItem> al;
    public RecyclerView am;
    public RecyclerView an;
    public BISPApplication ao;
    public TextView ap;
    public ArrayList<RosterItem> aq;
    public SessionManager ar;
    public RosterItem as;
    public long ad = 0;
    public long ai = 0;

    public class OooO0OO extends C0098p {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO(int i, String str, JSONObject jSONObject, C0094m.bar barVar, C0094m.bas basVar) {
            super(i, str, jSONObject, barVar, basVar);
        }

        public Map<String, String> i() {
            int i = 2 % 2;
            HashMap map = new HashMap();
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Bearer ");
            SessionManager sessionManager = new SessionManager(DuplicateCnic.this);
            int i2 = a + 14;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            ivas.gov.bisp.enumeration.p091n.j.z(sessionManager, sbW, map, "Authorization");
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = (-2) - ((a + 4) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }
    }

    public static void u(DuplicateCnic duplicateCnic, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(duplicateCnic, R.font.jameel_noori_nastaleeq);
        b.aIz aiz = new b.aIz(duplicateCnic);
        View viewInflate = LayoutInflater.from(duplicateCnic).inflate(R.layout.new_custom_dialog, (ViewGroup) duplicateCnic.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView2.setTypeface(typefaceB);
        ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new ViewOnClickListenerC0182k(duplicateCnic, bVarB));
        int i3 = p + 69;
        q = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) DiscrepancyRosterListActivity.class));
        finish();
        int i2 = q + 31;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 23;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_duplicate_cnic;
        }
        throw null;
    }

    public final void z(JSONObject jSONObject) {
        int i = 2 % 2;
        OooO0OO oooO0OO = new OooO0OO(1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject, new OooO00o(), new OooO0O0());
        oooO0OO.m = new z(130000, 0, 0.0f);
        oooO0OO.k = false;
        a.b(this).c(oooO0OO);
        int i2 = p + 67;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public class OooO00o implements o00Ooo.OooO0O0<JSONObject> {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        public void b(Object obj) {
            int i = 2 % 2;
            int i2 = a + 75;
            b = i2 % 128;
            Object obj2 = null;
            try {
                if (i2 % 2 == 0) {
                    try {
                        ((JSONObject) obj).getString("result");
                        throw null;
                    } catch (ClassCastException e) {
                        throw e;
                    }
                }
                JSONObject jSONObject = new JSONObject(ivas.gov.bisp.enumeration.bK.b.c(((JSONObject) obj).getString("result"), ivas.gov.bisp.enumeration.bK.b.b(DuplicateCnic.this.ar.k()), ivas.gov.bisp.enumeration.bK.b.b(DuplicateCnic.this.ar.m())));
                int i3 = b;
                int i4 = ((i3 | 123) << 1) - (i3 ^ 123);
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    jSONObject.getString("message").contains("Invalid Cnic");
                    throw null;
                }
                String string = jSONObject.getString("message");
                if (string.contains("Invalid Cnic")) {
                    int i5 = b;
                    int i6 = (-2) - ((((i5 | 36) << 1) - (i5 ^ 36)) ^ (-1));
                    a = i6 % 128;
                    int i7 = i6 % 2;
                    DuplicateCnic.u(DuplicateCnic.this, 1, "Alert.!", string);
                    int i8 = a;
                    int i9 = (i8 & 93) + (i8 | 93);
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
                        return;
                    }
                    obj2.hashCode();
                    throw null;
                }
                if (!(!string.contains("Cnic Discrepancy Removed"))) {
                    int i10 = a;
                    int i11 = i10 & 15;
                    int i12 = (i10 | 15) & (~i11);
                    int i13 = -(-(i11 << 1));
                    int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    Toast.makeText(DuplicateCnic.this, "message", 0).show();
                    Intent intent = new Intent(DuplicateCnic.this, (Class<?>) DiscrepancyRosterListActivity.class);
                    int i16 = a;
                    int i17 = (i16 ^ 59) + ((i16 & 59) << 1);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    DuplicateCnic.this.startActivity(intent);
                    int i19 = a;
                    int i20 = (((i19 & (-8)) | ((~i19) & 7)) - (~((i19 & 7) << 1))) - 1;
                    b = i20 % 128;
                    if (i20 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i21 = a;
                int i22 = i21 & 75;
                int i23 = (i21 | 75) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            } catch (JSONException unused) {
            }
        }
    }

    public class OooO0O0 implements C0094m.bas {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002e  */
        @Override // ivas.gov.bisp.enumeration.p022av.C0094m.bas
        public void b(T t) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 38) + ((i2 & 38) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
                if (DuplicateCnic.this.ac.isShowing()) {
                    DuplicateCnic.this.ac.dismiss();
                    int i5 = a;
                    int i6 = i5 & 121;
                    int i7 = -(-((i5 ^ 121) | i6));
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    b = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (DuplicateCnic.this.ac.isShowing()) {
                DuplicateCnic.this.ac.dismiss();
                int i10 = a;
                int i11 = i10 & 121;
                int i12 = -(-((i10 ^ 121) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            ResponseMessage responseMessageE = ag.e(t);
            DuplicateCnic duplicateCnic = DuplicateCnic.this;
            String errorMessage = responseMessageE.getErrorMessage();
            int i15 = b;
            int i16 = (i15 ^ 69) + ((i15 & 69) << 1);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                af.b(duplicateCnic, errorMessage, responseMessageE.isLogout());
                int i17 = 19 / 0;
            } else {
                af.b(duplicateCnic, errorMessage, responseMessageE.isLogout());
            }
            int i18 = b;
            int i19 = ((i18 ^ 92) + ((i18 & 92) << 1)) - 1;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 61 / 0;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 95;
        p = i2 % 128;
        int i3 = i2 % 2;
        switch (view.getId()) {
            case R.id.btn_F1update /* 2131361928 */:
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("hH_ID", this.af);
                    jSONObject.put("cnic", this.ae);
                    jSONObject.put("r_id", this.ad);
                    jSONObject.put("SessionId", BISPApplication.c().s);
                    jSONObject.put("IpAddress", ac.h(true));
                    jSONObject.put("sessionUserCnic", this.ar.r());
                    jSONObject.put("update_type", "duplicate_cnic");
                    jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ar.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ar.m())));
                    byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ar.k());
                    byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ar.m());
                    Object[] objArr = new Object[1];
                    a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 44, true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 17, 111 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{15, 65532, 65535, 11, 65520, '\n', 1, '\t', 65508, 65534, 4, 14, 65532, 65501, '\r', 0, 15, 14, '\n', 65517, 0}, objArr);
                    jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                    z(jSONObject2);
                    int i4 = q + 21;
                    p = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 99 / 0;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            case R.id.btn_F2update /* 2131361929 */:
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject3.put("hH_ID", this.aj);
                    jSONObject3.put("cnic", this.ah);
                    jSONObject3.put("r_id", this.ai);
                    jSONObject3.put("SessionId", BISPApplication.c().s);
                    jSONObject3.put("IpAddress", ac.h(true));
                    jSONObject3.put("sessionUserCnic", this.ar.r());
                    jSONObject3.put("update_type", "duplicate_cnic");
                    jSONObject4.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject3.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ar.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ar.m())));
                    byte[] bArrB3 = ivas.gov.bisp.enumeration.bK.b.b(this.ar.k());
                    byte[] bArrB4 = ivas.gov.bisp.enumeration.bK.b.b(this.ar.m());
                    Object[] objArr2 = new Object[1];
                    a(getApplicationInfo().targetSdkVersion - 26, true, super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 28, getApplicationInfo().targetSdkVersion + 79, new char[]{15, 65532, 65535, 11, 65520, '\n', 1, '\t', 65508, 65534, 4, 14, 65532, 65501, '\r', 0, 15, 14, '\n', 65517, 0}, objArr2);
                    jSONObject4.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr2[0]).intern(), bArrB3, bArrB4));
                    z(jSONObject4);
                } catch (JSONException unused2) {
                    return;
                }
                break;
            default:
                int i6 = p + 81;
                q = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 23 / 0;
                }
                break;
        }
    }

    public static void v(DuplicateCnic duplicateCnic, String str) {
        String string;
        String str2;
        String string2;
        String string3;
        String str3 = "bank_address";
        String str4 = "message";
        int i = 2 % 2;
        if (!(!duplicateCnic.ac.isShowing())) {
            duplicateCnic.ac.cancel();
        }
        duplicateCnic.aq = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string4 = jSONObject.getString("hhid".toLowerCase());
            String string5 = jSONObject.getString("message".toLowerCase());
            String string6 = jSONObject.getString("hH_Name".toLowerCase());
            String string7 = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int i2 = 0;
            for (int length = jSONArray.length(); i2 < length; length = length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string8 = jSONObject2.getString("cnic".toLowerCase());
                int i3 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string9 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string10 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string11 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string11);
                int i4 = jSONObject2.getInt("educationLevelCode".toLowerCase());
                int i5 = jSONObject2.getInt("employmentCode".toLowerCase());
                String string12 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string13 = jSONObject2.getString("gender".toLowerCase());
                int i6 = jSONObject2.getInt("goneToSchoolCode".toLowerCase());
                int i7 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string14 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                int i8 = jSONObject2.getInt("lastWeekWorkingHours".toLowerCase());
                String string15 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i9 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string16 = jSONObject2.getString(str4.toLowerCase());
                int i10 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string17 = jSONObject2.getString("workStatus".toLowerCase());
                int i11 = jSONObject2.getInt("workStatusCode".toLowerCase());
                if (jSONObject2.has("mobile_no".toLowerCase())) {
                    int i12 = q + 97;
                    p = i12 % 128;
                    int i13 = i12 % 2;
                    string = jSONObject2.getString("mobile_no".toLowerCase());
                } else {
                    string = BuildConfig.FLAVOR;
                }
                String string18 = jSONObject2.has("mobile_network_name".toLowerCase()) ? jSONObject2.getString("mobile_network_name".toLowerCase()) : BuildConfig.FLAVOR;
                String string19 = jSONObject2.has("banks_name".toLowerCase()) ? jSONObject2.getString("banks_name".toLowerCase()) : BuildConfig.FLAVOR;
                int i14 = jSONObject2.has("branch_code".toLowerCase()) ? jSONObject2.getInt("branch_code".toLowerCase()) : 0;
                if (jSONObject2.has(str3.toLowerCase())) {
                    int i15 = p + 55;
                    q = i15 % 128;
                    int i16 = i15 % 2;
                    String string20 = jSONObject2.getString(str3.toLowerCase());
                    int i17 = q + 47;
                    p = i17 % 128;
                    int i18 = i17 % 2;
                    str2 = string20;
                } else {
                    str2 = BuildConfig.FLAVOR;
                }
                if (jSONObject2.has("account_title".toLowerCase())) {
                    int i19 = q + 99;
                    p = i19 % 128;
                    if (i19 % 2 == 0) {
                        jSONObject2.getString("account_title".toLowerCase());
                        Object obj = null;
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    string2 = jSONObject2.getString("account_title".toLowerCase());
                } else {
                    string2 = BuildConfig.FLAVOR;
                }
                if (jSONObject2.has("account_number".toLowerCase())) {
                    string3 = jSONObject2.getString("account_number".toLowerCase());
                } else {
                    int i20 = q + 75;
                    p = i20 % 128;
                    int i21 = i20 % 2;
                    string3 = BuildConfig.FLAVOR;
                }
                duplicateCnic.aq.add(new RosterItem(string4, z, string5, string6, string8, i3, string9, string10, string11, i4, i5, string12, string7, string13, i6, i7, string14, z2, i8, string15, i9, string16, i10, j, string17, i11, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string, string18, string19, i14, str2, string2, string3));
                i2++;
                str4 = str4;
                str3 = str3;
            }
            ArrayList<RosterItem> arrayList = duplicateCnic.aq;
            duplicateCnic.am.setLayoutManager(new LinearLayoutManager(1, false));
            duplicateCnic.am.setAdapter(new bs(duplicateCnic, arrayList));
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a6 A[Catch: JSONException -> 0x042a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x03b6 A[Catch: JSONException -> 0x042a, TRY_ENTER, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:113:0x03cd A[Catch: JSONException -> 0x042a, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x03e7 A[Catch: JSONException -> 0x042a, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x021d  */
    /* JADX WARN: Code duplicated, block: B:56:0x024d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0261 A[Catch: JSONException -> 0x042d, TryCatch #5 {JSONException -> 0x042d, blocks: (B:26:0x013b, B:31:0x0196, B:33:0x019c, B:42:0x01be, B:44:0x01ce, B:46:0x01d4, B:48:0x01e4, B:50:0x0208, B:52:0x020e, B:54:0x021f, B:57:0x025b, B:59:0x0261, B:62:0x0275, B:66:0x02d2, B:34:0x01a8, B:36:0x01ac), top: B:147:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x026f  */
    /* JADX WARN: Code duplicated, block: B:65:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0303  */
    /* JADX WARN: Code duplicated, block: B:76:0x0318  */
    /* JADX WARN: Code duplicated, block: B:79:0x0326 A[Catch: JSONException -> 0x042a, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0333  */
    /* JADX WARN: Code duplicated, block: B:83:0x0341 A[Catch: JSONException -> 0x042a, TRY_LEAVE, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x034e  */
    /* JADX WARN: Code duplicated, block: B:87:0x035a  */
    /* JADX WARN: Code duplicated, block: B:91:0x036a A[Catch: JSONException -> 0x042a, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0377  */
    /* JADX WARN: Code duplicated, block: B:95:0x0383 A[Catch: JSONException -> 0x042a, TryCatch #3 {JSONException -> 0x042a, blocks: (B:69:0x02e3, B:72:0x02f9, B:75:0x030d, B:77:0x031a, B:79:0x0326, B:81:0x0335, B:83:0x0341, B:89:0x035e, B:91:0x036a, B:93:0x0379, B:95:0x0383, B:97:0x0390, B:101:0x03a6, B:103:0x03b1, B:111:0x03c3, B:113:0x03cd, B:115:0x03da, B:117:0x03e7, B:118:0x03ef, B:108:0x03b6), top: B:144:0x02e3 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x038e  */
    /* JADX WARN: Code duplicated, block: B:99:0x039a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() throws JSONException {
        int i;
        String str;
        JSONArray jSONArray;
        int i2;
        String string;
        int i3;
        String string2;
        String string3;
        int i4;
        String string4;
        int i5;
        int i6;
        long j;
        String string5;
        String str2;
        String str3;
        String str4;
        int i7;
        String string6;
        String string7;
        int i8;
        String string8;
        int i9;
        String string9;
        String str5;
        String string10;
        int i10;
        String string11;
        int i11 = 2;
        int i12 = 2 % 2;
        super.t();
        this.ac = new ProgressDialog(this);
        this.ar = new SessionManager(this);
        Intent intent = getIntent();
        intent.getIntExtra("roster_index", 0);
        this.as = (RosterItem) intent.getSerializableExtra("roster_data");
        this.am = (RecyclerView) findViewById(R.id.rv_family1);
        this.an = (RecyclerView) findViewById(R.id.rv_family2);
        this.ap = (TextView) findViewById(R.id.btn_F2update);
        ((TextView) findViewById(R.id.btn_F1update)).setOnClickListener(this);
        this.ap.setOnClickListener(this);
        this.ao = (BISPApplication) getApplicationContext();
        RosterItem rosterItem = this.as;
        this.al = new ArrayList();
        boolean zIsIs_Benificiary = rosterItem.isIs_Benificiary();
        rosterItem.getHhMemberNames();
        this.ae = rosterItem.getCnic();
        this.af = rosterItem.getHhid();
        this.ag = rosterItem.getMessage();
        this.ad = rosterItem.getrId();
        String dupRosterList = rosterItem.getDupRosterList();
        String str6 = BuildConfig.FLAVOR;
        if (dupRosterList == null || dupRosterList.isEmpty()) {
            i = 1;
            str = BuildConfig.FLAVOR;
        } else {
            String str7 = "null";
            if (dupRosterList.equals("null")) {
                i = 1;
                str = BuildConfig.FLAVOR;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(dupRosterList);
                    if (!(!jSONObject.getString("duplicateRosterList".toLowerCase()).equals("null"))) {
                        if (this.ac.isShowing()) {
                            this.ac.dismiss();
                        }
                        b.aIz aiz = new b.aIz(this);
                        AlertController.OooO0O0 oooO0O0 = aiz.a;
                        oooO0O0.e = "Alert.!";
                        oooO0O0.f = "duplicateRosterList is Null";
                        oooO0O0.k = true;
                        DialogInterfaceOnClickListenerC0158ak dialogInterfaceOnClickListenerC0158ak = new DialogInterfaceOnClickListenerC0158ak(this);
                        oooO0O0.h = "Ok";
                        oooO0O0.i = dialogInterfaceOnClickListenerC0158ak;
                        aiz.b().show();
                        i = 1;
                        str = BuildConfig.FLAVOR;
                    } else {
                        if (this.ac.isShowing()) {
                            this.ac.dismiss();
                        }
                        if (jSONObject.has("hhid")) {
                            int i13 = q + 27;
                            p = i13 % 128;
                            int i14 = i13 % 2;
                            this.ak = jSONObject.getString("hhid");
                        }
                        JSONArray jSONArray2 = jSONObject.getJSONArray("duplicateRosterList".toLowerCase());
                        int length = jSONArray2.length();
                        int i15 = 0;
                        while (i15 < length) {
                            int i16 = q + 13;
                            p = i16 % 128;
                            int i17 = i16 % i11;
                            try {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(i15);
                                String string12 = jSONObject2.getString("cnic".toLowerCase());
                                int i18 = jSONObject2.getInt("disabilityCode".toLowerCase());
                                String string13 = jSONObject2.getString("disabilityStatus".toLowerCase());
                                String string14 = jSONObject2.getString("discrepancy_status".toLowerCase());
                                String string15 = jSONObject2.getString("dob".toLowerCase());
                                ag.k(string15);
                                String string16 = jSONObject2.getString("educationLevelCode".toLowerCase());
                                try {
                                    if (string16.equals(str7)) {
                                        jSONArray = jSONArray2;
                                    } else {
                                        int i19 = q + 123;
                                        jSONArray = jSONArray2;
                                        p = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            string16.equals(str6);
                                            try {
                                                throw null;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (!string16.equals(str6)) {
                                            i2 = Integer.parseInt(string16.split("\\.")[0]);
                                        }
                                        string = jSONObject2.getString("employmentCode".toLowerCase());
                                        if (!string.equals(str7) || string.equals(str6)) {
                                            i3 = -1;
                                        } else {
                                            i3 = Integer.parseInt(string.split("\\.")[0]);
                                        }
                                        string2 = jSONObject2.getString("employmentStatus".toLowerCase());
                                        String string17 = jSONObject2.getString("gender".toLowerCase());
                                        string3 = jSONObject2.getString("goneToSchoolCode".toLowerCase());
                                        if (!string3.equals(str7) || string3.equals(str6)) {
                                            i4 = -1;
                                        } else {
                                            i4 = Integer.parseInt(string3.split("\\.")[0]);
                                        }
                                        int i20 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                                        String string18 = jSONObject2.getString("hhMemberNames".toLowerCase());
                                        boolean z = jSONObject2.getBoolean("isLiterate".toLowerCase());
                                        string4 = jSONObject2.getString("lastWeekWorkingHours".toLowerCase());
                                        if (string4.equals(str7)) {
                                            i5 = length;
                                            i6 = i15;
                                        } else {
                                            i5 = length;
                                            int i21 = q + 33;
                                            i6 = i15;
                                            p = i21 % 128;
                                            int i22 = i21 % 2;
                                            int i23 = string4.equals(str6) ? 0 : Integer.parseInt(string4.split("\\.")[0]);
                                            String string19 = jSONObject2.getString("maritalStatus".toLowerCase());
                                            int i24 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                                            String string20 = jSONObject2.getString("message".toLowerCase());
                                            int i25 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                                            j = jSONObject2.getLong("rId".toLowerCase());
                                            String string21 = jSONObject2.getString("workStatus".toLowerCase());
                                            string5 = jSONObject2.getString("workStatusCode".toLowerCase());
                                            if (string5.equals(str7)) {
                                                str2 = string2;
                                                str3 = str7;
                                            } else {
                                                str3 = str7;
                                                int i26 = p + 49;
                                                str2 = string2;
                                                q = i26 % 128;
                                                int i27 = i26 % 2;
                                                if (!string5.equals(str6)) {
                                                    int i28 = p + 5;
                                                    str4 = str6;
                                                    q = i28 % 128;
                                                    int i29 = i28 % 2;
                                                    try {
                                                        i7 = Integer.parseInt(string5.split("\\.")[0]);
                                                    } catch (JSONException unused) {
                                                        str = str4;
                                                    }
                                                }
                                                if (jSONObject2.has("mobile_no".toLowerCase())) {
                                                    int i30 = p + 97;
                                                    q = i30 % 128;
                                                    int i31 = i30 % 2;
                                                    string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                                } else {
                                                    string6 = str4;
                                                }
                                                if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                                    string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                                } else {
                                                    string7 = str4;
                                                }
                                                if (jSONObject2.has("banks_name".toLowerCase())) {
                                                    string8 = jSONObject2.getString("banks_name".toLowerCase());
                                                } else {
                                                    i8 = p + 81;
                                                    q = i8 % 128;
                                                    if (i8 % 2 != 0) {
                                                        int i32 = 5 / 5;
                                                    }
                                                    string8 = str4;
                                                }
                                                if (jSONObject2.has("branch_code".toLowerCase())) {
                                                    i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                                } else {
                                                    i9 = 0;
                                                }
                                                if (jSONObject2.has("bank_address".toLowerCase())) {
                                                    string9 = jSONObject2.getString("bank_address".toLowerCase());
                                                } else {
                                                    string9 = str4;
                                                }
                                                if (jSONObject2.has("account_title".toLowerCase())) {
                                                    i10 = q + 75;
                                                    p = i10 % 128;
                                                    if (i10 % 2 == 0) {
                                                        string11 = jSONObject2.getString("account_title".toLowerCase());
                                                        int i33 = 93 / 0;
                                                    } else {
                                                        string11 = jSONObject2.getString("account_title".toLowerCase());
                                                    }
                                                    str5 = string11;
                                                } else {
                                                    str5 = str4;
                                                }
                                                if (jSONObject2.has("account_number".toLowerCase())) {
                                                    string10 = jSONObject2.getString("account_number".toLowerCase());
                                                } else {
                                                    string10 = str4;
                                                }
                                                JSONArray jSONArray3 = new JSONArray();
                                                if (string12.equals(this.ae)) {
                                                    this.ah = string12;
                                                    this.aj = this.ak;
                                                    this.ai = j;
                                                }
                                                String str8 = this.ak;
                                                String str9 = this.ag;
                                                String string22 = jSONArray3.toString();
                                                String str10 = str3;
                                                str = str4;
                                                this.al.add(new RosterItem(str8, zIsIs_Benificiary, str9, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string19, i24, string20, i25, j, string21, i7, string22, string6, string7, string8, i9, string9, str5, string10));
                                                str7 = str10;
                                                length = i5;
                                                str6 = str;
                                                i11 = 2;
                                                i15 = i6 + 1;
                                                jSONArray2 = jSONArray;
                                            }
                                            str4 = str6;
                                            i7 = -1;
                                            if (jSONObject2.has("mobile_no".toLowerCase())) {
                                                int i34 = p + 97;
                                                q = i34 % 128;
                                                int i35 = i34 % 2;
                                                string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                            } else {
                                                string6 = str4;
                                            }
                                            if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                                string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                            } else {
                                                string7 = str4;
                                            }
                                            if (jSONObject2.has("banks_name".toLowerCase())) {
                                                string8 = jSONObject2.getString("banks_name".toLowerCase());
                                            } else {
                                                i8 = p + 81;
                                                q = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    int i36 = 5 / 5;
                                                }
                                                string8 = str4;
                                            }
                                            if (jSONObject2.has("branch_code".toLowerCase())) {
                                                i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                            } else {
                                                i9 = 0;
                                            }
                                            if (jSONObject2.has("bank_address".toLowerCase())) {
                                                string9 = jSONObject2.getString("bank_address".toLowerCase());
                                            } else {
                                                string9 = str4;
                                            }
                                            if (jSONObject2.has("account_title".toLowerCase())) {
                                                i10 = q + 75;
                                                p = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    string11 = jSONObject2.getString("account_title".toLowerCase());
                                                    int i37 = 93 / 0;
                                                } else {
                                                    string11 = jSONObject2.getString("account_title".toLowerCase());
                                                }
                                                str5 = string11;
                                            } else {
                                                str5 = str4;
                                            }
                                            if (jSONObject2.has("account_number".toLowerCase())) {
                                                string10 = jSONObject2.getString("account_number".toLowerCase());
                                            } else {
                                                string10 = str4;
                                            }
                                            JSONArray jSONArray4 = new JSONArray();
                                            if (string12.equals(this.ae)) {
                                                this.ah = string12;
                                                this.aj = this.ak;
                                                this.ai = j;
                                            }
                                            String str11 = this.ak;
                                            String str12 = this.ag;
                                            String string23 = jSONArray4.toString();
                                            String str13 = str3;
                                            str = str4;
                                            this.al.add(new RosterItem(str11, zIsIs_Benificiary, str12, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string19, i24, string20, i25, j, string21, i7, string23, string6, string7, string8, i9, string9, str5, string10));
                                            str7 = str13;
                                            length = i5;
                                            str6 = str;
                                            i11 = 2;
                                            i15 = i6 + 1;
                                            jSONArray2 = jSONArray;
                                        }
                                        String string110 = jSONObject2.getString("maritalStatus".toLowerCase());
                                        int i210 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                                        String string24 = jSONObject2.getString("message".toLowerCase());
                                        int i211 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                                        j = jSONObject2.getLong("rId".toLowerCase());
                                        String string25 = jSONObject2.getString("workStatus".toLowerCase());
                                        string5 = jSONObject2.getString("workStatusCode".toLowerCase());
                                        if (string5.equals(str7)) {
                                            str3 = str7;
                                            int i212 = p + 49;
                                            str2 = string2;
                                            q = i212 % 128;
                                            int i213 = i212 % 2;
                                            if (!string5.equals(str6)) {
                                                int i214 = p + 5;
                                                str4 = str6;
                                                q = i214 % 128;
                                                int i215 = i214 % 2;
                                                i7 = Integer.parseInt(string5.split("\\.")[0]);
                                            }
                                            if (jSONObject2.has("mobile_no".toLowerCase())) {
                                                int i38 = p + 97;
                                                q = i38 % 128;
                                                int i39 = i38 % 2;
                                                string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                            } else {
                                                string6 = str4;
                                            }
                                            if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                                string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                            } else {
                                                string7 = str4;
                                            }
                                            if (jSONObject2.has("banks_name".toLowerCase())) {
                                                string8 = jSONObject2.getString("banks_name".toLowerCase());
                                            } else {
                                                i8 = p + 81;
                                                q = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    int i310 = 5 / 5;
                                                }
                                                string8 = str4;
                                            }
                                            if (jSONObject2.has("branch_code".toLowerCase())) {
                                                i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                            } else {
                                                i9 = 0;
                                            }
                                            if (jSONObject2.has("bank_address".toLowerCase())) {
                                                string9 = jSONObject2.getString("bank_address".toLowerCase());
                                            } else {
                                                string9 = str4;
                                            }
                                            if (jSONObject2.has("account_title".toLowerCase())) {
                                                i10 = q + 75;
                                                p = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    string11 = jSONObject2.getString("account_title".toLowerCase());
                                                    int i311 = 93 / 0;
                                                } else {
                                                    string11 = jSONObject2.getString("account_title".toLowerCase());
                                                }
                                                str5 = string11;
                                            } else {
                                                str5 = str4;
                                            }
                                            if (jSONObject2.has("account_number".toLowerCase())) {
                                                string10 = jSONObject2.getString("account_number".toLowerCase());
                                            } else {
                                                string10 = str4;
                                            }
                                            JSONArray jSONArray5 = new JSONArray();
                                            if (string12.equals(this.ae)) {
                                                this.ah = string12;
                                                this.aj = this.ak;
                                                this.ai = j;
                                            }
                                            String str14 = this.ak;
                                            String str15 = this.ag;
                                            String string26 = jSONArray5.toString();
                                            String str16 = str3;
                                            str = str4;
                                            this.al.add(new RosterItem(str14, zIsIs_Benificiary, str15, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string110, i210, string24, i211, j, string25, i7, string26, string6, string7, string8, i9, string9, str5, string10));
                                            str7 = str16;
                                            length = i5;
                                            str6 = str;
                                            i11 = 2;
                                            i15 = i6 + 1;
                                            jSONArray2 = jSONArray;
                                        } else {
                                            str2 = string2;
                                            str3 = str7;
                                        }
                                        str4 = str6;
                                        i7 = -1;
                                        if (jSONObject2.has("mobile_no".toLowerCase())) {
                                            int i312 = p + 97;
                                            q = i312 % 128;
                                            int i313 = i312 % 2;
                                            string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                        } else {
                                            string6 = str4;
                                        }
                                        if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                            string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                        } else {
                                            string7 = str4;
                                        }
                                        if (jSONObject2.has("banks_name".toLowerCase())) {
                                            string8 = jSONObject2.getString("banks_name".toLowerCase());
                                        } else {
                                            i8 = p + 81;
                                            q = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                int i314 = 5 / 5;
                                            }
                                            string8 = str4;
                                        }
                                        if (jSONObject2.has("branch_code".toLowerCase())) {
                                            i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                        } else {
                                            i9 = 0;
                                        }
                                        if (jSONObject2.has("bank_address".toLowerCase())) {
                                            string9 = jSONObject2.getString("bank_address".toLowerCase());
                                        } else {
                                            string9 = str4;
                                        }
                                        if (jSONObject2.has("account_title".toLowerCase())) {
                                            i10 = q + 75;
                                            p = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                string11 = jSONObject2.getString("account_title".toLowerCase());
                                                int i315 = 93 / 0;
                                            } else {
                                                string11 = jSONObject2.getString("account_title".toLowerCase());
                                            }
                                            str5 = string11;
                                        } else {
                                            str5 = str4;
                                        }
                                        if (jSONObject2.has("account_number".toLowerCase())) {
                                            string10 = jSONObject2.getString("account_number".toLowerCase());
                                        } else {
                                            string10 = str4;
                                        }
                                        JSONArray jSONArray6 = new JSONArray();
                                        if (string12.equals(this.ae)) {
                                            this.ah = string12;
                                            this.aj = this.ak;
                                            this.ai = j;
                                        }
                                        String str17 = this.ak;
                                        String str18 = this.ag;
                                        String string27 = jSONArray6.toString();
                                        String str19 = str3;
                                        str = str4;
                                        this.al.add(new RosterItem(str17, zIsIs_Benificiary, str18, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string110, i210, string24, i211, j, string25, i7, string27, string6, string7, string8, i9, string9, str5, string10));
                                        str7 = str19;
                                        length = i5;
                                        str6 = str;
                                        i11 = 2;
                                        i15 = i6 + 1;
                                        jSONArray2 = jSONArray;
                                        i = 1;
                                    }
                                    if (string4.equals(str7)) {
                                        i5 = length;
                                        int i216 = q + 33;
                                        i6 = i15;
                                        p = i216 % 128;
                                        int i217 = i216 % 2;
                                        if (string4.equals(str6)) {
                                        }
                                        String string111 = jSONObject2.getString("maritalStatus".toLowerCase());
                                        int i218 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                                        String string28 = jSONObject2.getString("message".toLowerCase());
                                        int i219 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                                        j = jSONObject2.getLong("rId".toLowerCase());
                                        String string29 = jSONObject2.getString("workStatus".toLowerCase());
                                        string5 = jSONObject2.getString("workStatusCode".toLowerCase());
                                        if (string5.equals(str7)) {
                                            str3 = str7;
                                            int i2110 = p + 49;
                                            str2 = string2;
                                            q = i2110 % 128;
                                            int i2111 = i2110 % 2;
                                            if (!string5.equals(str6)) {
                                                int i2112 = p + 5;
                                                str4 = str6;
                                                q = i2112 % 128;
                                                int i2113 = i2112 % 2;
                                                i7 = Integer.parseInt(string5.split("\\.")[0]);
                                            }
                                            if (jSONObject2.has("mobile_no".toLowerCase())) {
                                                int i316 = p + 97;
                                                q = i316 % 128;
                                                int i317 = i316 % 2;
                                                string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                            } else {
                                                string6 = str4;
                                            }
                                            if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                                string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                            } else {
                                                string7 = str4;
                                            }
                                            if (jSONObject2.has("banks_name".toLowerCase())) {
                                                string8 = jSONObject2.getString("banks_name".toLowerCase());
                                            } else {
                                                i8 = p + 81;
                                                q = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    int i318 = 5 / 5;
                                                }
                                                string8 = str4;
                                            }
                                            if (jSONObject2.has("branch_code".toLowerCase())) {
                                                i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                            } else {
                                                i9 = 0;
                                            }
                                            if (jSONObject2.has("bank_address".toLowerCase())) {
                                                string9 = jSONObject2.getString("bank_address".toLowerCase());
                                            } else {
                                                string9 = str4;
                                            }
                                            if (jSONObject2.has("account_title".toLowerCase())) {
                                                i10 = q + 75;
                                                p = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    string11 = jSONObject2.getString("account_title".toLowerCase());
                                                    int i319 = 93 / 0;
                                                } else {
                                                    string11 = jSONObject2.getString("account_title".toLowerCase());
                                                }
                                                str5 = string11;
                                            } else {
                                                str5 = str4;
                                            }
                                            if (jSONObject2.has("account_number".toLowerCase())) {
                                                string10 = jSONObject2.getString("account_number".toLowerCase());
                                            } else {
                                                string10 = str4;
                                            }
                                            JSONArray jSONArray7 = new JSONArray();
                                            if (string12.equals(this.ae)) {
                                                this.ah = string12;
                                                this.aj = this.ak;
                                                this.ai = j;
                                            }
                                            String str110 = this.ak;
                                            String str111 = this.ag;
                                            String string210 = jSONArray7.toString();
                                            String str112 = str3;
                                            str = str4;
                                            this.al.add(new RosterItem(str110, zIsIs_Benificiary, str111, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string111, i218, string28, i219, j, string29, i7, string210, string6, string7, string8, i9, string9, str5, string10));
                                            str7 = str112;
                                            length = i5;
                                            str6 = str;
                                            i11 = 2;
                                            i15 = i6 + 1;
                                            jSONArray2 = jSONArray;
                                        } else {
                                            str2 = string2;
                                            str3 = str7;
                                        }
                                        str4 = str6;
                                        i7 = -1;
                                        if (jSONObject2.has("mobile_no".toLowerCase())) {
                                            int i3110 = p + 97;
                                            q = i3110 % 128;
                                            int i3111 = i3110 % 2;
                                            string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                        } else {
                                            string6 = str4;
                                        }
                                        if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                            string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                        } else {
                                            string7 = str4;
                                        }
                                        if (jSONObject2.has("banks_name".toLowerCase())) {
                                            string8 = jSONObject2.getString("banks_name".toLowerCase());
                                        } else {
                                            i8 = p + 81;
                                            q = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                int i3112 = 5 / 5;
                                            }
                                            string8 = str4;
                                        }
                                        if (jSONObject2.has("branch_code".toLowerCase())) {
                                            i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                        } else {
                                            i9 = 0;
                                        }
                                        if (jSONObject2.has("bank_address".toLowerCase())) {
                                            string9 = jSONObject2.getString("bank_address".toLowerCase());
                                        } else {
                                            string9 = str4;
                                        }
                                        if (jSONObject2.has("account_title".toLowerCase())) {
                                            i10 = q + 75;
                                            p = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                string11 = jSONObject2.getString("account_title".toLowerCase());
                                                int i3113 = 93 / 0;
                                            } else {
                                                string11 = jSONObject2.getString("account_title".toLowerCase());
                                            }
                                            str5 = string11;
                                        } else {
                                            str5 = str4;
                                        }
                                        if (jSONObject2.has("account_number".toLowerCase())) {
                                            string10 = jSONObject2.getString("account_number".toLowerCase());
                                        } else {
                                            string10 = str4;
                                        }
                                        JSONArray jSONArray8 = new JSONArray();
                                        if (string12.equals(this.ae)) {
                                            this.ah = string12;
                                            this.aj = this.ak;
                                            this.ai = j;
                                        }
                                        String str113 = this.ak;
                                        String str114 = this.ag;
                                        String string211 = jSONArray8.toString();
                                        String str115 = str3;
                                        str = str4;
                                        this.al.add(new RosterItem(str113, zIsIs_Benificiary, str114, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string111, i218, string28, i219, j, string29, i7, string211, string6, string7, string8, i9, string9, str5, string10));
                                        str7 = str115;
                                        length = i5;
                                        str6 = str;
                                        i11 = 2;
                                        i15 = i6 + 1;
                                        jSONArray2 = jSONArray;
                                    } else {
                                        i5 = length;
                                        i6 = i15;
                                    }
                                    if (string5.equals(str7)) {
                                        str3 = str7;
                                        int i2114 = p + 49;
                                        str2 = string2;
                                        q = i2114 % 128;
                                        int i2115 = i2114 % 2;
                                        if (!string5.equals(str6)) {
                                            int i2116 = p + 5;
                                            str4 = str6;
                                            q = i2116 % 128;
                                            int i2117 = i2116 % 2;
                                            i7 = Integer.parseInt(string5.split("\\.")[0]);
                                        }
                                        if (jSONObject2.has("mobile_no".toLowerCase())) {
                                            int i3114 = p + 97;
                                            q = i3114 % 128;
                                            int i3115 = i3114 % 2;
                                            string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                        } else {
                                            string6 = str4;
                                        }
                                        if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                            string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                        } else {
                                            string7 = str4;
                                        }
                                        if (jSONObject2.has("banks_name".toLowerCase())) {
                                            string8 = jSONObject2.getString("banks_name".toLowerCase());
                                        } else {
                                            i8 = p + 81;
                                            q = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                int i3116 = 5 / 5;
                                            }
                                            string8 = str4;
                                        }
                                        if (jSONObject2.has("branch_code".toLowerCase())) {
                                            i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                        } else {
                                            i9 = 0;
                                        }
                                        if (jSONObject2.has("bank_address".toLowerCase())) {
                                            string9 = jSONObject2.getString("bank_address".toLowerCase());
                                        } else {
                                            string9 = str4;
                                        }
                                        if (jSONObject2.has("account_title".toLowerCase())) {
                                            i10 = q + 75;
                                            p = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                string11 = jSONObject2.getString("account_title".toLowerCase());
                                                int i3117 = 93 / 0;
                                            } else {
                                                string11 = jSONObject2.getString("account_title".toLowerCase());
                                            }
                                            str5 = string11;
                                        } else {
                                            str5 = str4;
                                        }
                                        if (jSONObject2.has("account_number".toLowerCase())) {
                                            string10 = jSONObject2.getString("account_number".toLowerCase());
                                        } else {
                                            string10 = str4;
                                        }
                                        JSONArray jSONArray9 = new JSONArray();
                                        if (string12.equals(this.ae)) {
                                            this.ah = string12;
                                            this.aj = this.ak;
                                            this.ai = j;
                                        }
                                        String str116 = this.ak;
                                        String str117 = this.ag;
                                        String string212 = jSONArray9.toString();
                                        String str118 = str3;
                                        str = str4;
                                        this.al.add(new RosterItem(str116, zIsIs_Benificiary, str117, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string111, i218, string28, i219, j, string29, i7, string212, string6, string7, string8, i9, string9, str5, string10));
                                        str7 = str118;
                                        length = i5;
                                        str6 = str;
                                        i11 = 2;
                                        i15 = i6 + 1;
                                        jSONArray2 = jSONArray;
                                    } else {
                                        str2 = string2;
                                        str3 = str7;
                                    }
                                    this.al.add(new RosterItem(str116, zIsIs_Benificiary, str117, null, string12, i18, string13, string14, string15, i2, i3, str2, null, string17, i4, i20, string18, z, i23, string111, i218, string28, i219, j, string29, i7, string212, string6, string7, string8, i9, string9, str5, string10));
                                    str7 = str118;
                                    length = i5;
                                    str6 = str;
                                    i11 = 2;
                                    i15 = i6 + 1;
                                    jSONArray2 = jSONArray;
                                } catch (JSONException unused2) {
                                }
                                int i40 = q + 15;
                                p = i40 % 128;
                                int i41 = i40 % 2;
                                i2 = -1;
                                string = jSONObject2.getString("employmentCode".toLowerCase());
                                if (string.equals(str7)) {
                                    i3 = -1;
                                } else {
                                    i3 = -1;
                                }
                                string2 = jSONObject2.getString("employmentStatus".toLowerCase());
                                String string112 = jSONObject2.getString("gender".toLowerCase());
                                string3 = jSONObject2.getString("goneToSchoolCode".toLowerCase());
                                if (string3.equals(str7)) {
                                    i4 = -1;
                                } else {
                                    i4 = -1;
                                }
                                int i220 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                                String string113 = jSONObject2.getString("hhMemberNames".toLowerCase());
                                boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                                string4 = jSONObject2.getString("lastWeekWorkingHours".toLowerCase());
                                String string114 = jSONObject2.getString("maritalStatus".toLowerCase());
                                int i2118 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                                String string213 = jSONObject2.getString("message".toLowerCase());
                                int i2119 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                                j = jSONObject2.getLong("rId".toLowerCase());
                                String string214 = jSONObject2.getString("workStatus".toLowerCase());
                                string5 = jSONObject2.getString("workStatusCode".toLowerCase());
                                str4 = str6;
                                i7 = -1;
                                if (jSONObject2.has("mobile_no".toLowerCase())) {
                                    int i3118 = p + 97;
                                    q = i3118 % 128;
                                    int i3119 = i3118 % 2;
                                    string6 = jSONObject2.getString("mobile_no".toLowerCase());
                                } else {
                                    string6 = str4;
                                }
                                if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                                    string7 = jSONObject2.getString("mobile_network_name".toLowerCase());
                                } else {
                                    string7 = str4;
                                }
                                if (jSONObject2.has("banks_name".toLowerCase())) {
                                    string8 = jSONObject2.getString("banks_name".toLowerCase());
                                } else {
                                    i8 = p + 81;
                                    q = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i31110 = 5 / 5;
                                    }
                                    string8 = str4;
                                }
                                if (jSONObject2.has("branch_code".toLowerCase())) {
                                    i9 = jSONObject2.getInt("branch_code".toLowerCase());
                                } else {
                                    i9 = 0;
                                }
                                if (jSONObject2.has("bank_address".toLowerCase())) {
                                    string9 = jSONObject2.getString("bank_address".toLowerCase());
                                } else {
                                    string9 = str4;
                                }
                                if (jSONObject2.has("account_title".toLowerCase())) {
                                    i10 = q + 75;
                                    p = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        string11 = jSONObject2.getString("account_title".toLowerCase());
                                        int i31111 = 93 / 0;
                                    } else {
                                        string11 = jSONObject2.getString("account_title".toLowerCase());
                                    }
                                    str5 = string11;
                                } else {
                                    str5 = str4;
                                }
                                if (jSONObject2.has("account_number".toLowerCase())) {
                                    string10 = jSONObject2.getString("account_number".toLowerCase());
                                } else {
                                    string10 = str4;
                                }
                                JSONArray jSONArray10 = new JSONArray();
                                if (string12.equals(this.ae)) {
                                    this.ah = string12;
                                    this.aj = this.ak;
                                    this.ai = j;
                                }
                                String str119 = this.ak;
                                String str1110 = this.ag;
                                String string215 = jSONArray10.toString();
                                String str1111 = str3;
                                str = str4;
                            } catch (JSONException unused3) {
                                str = str6;
                            }
                        }
                        str = str6;
                        BISPApplication bISPApplication = this.ao;
                        bISPApplication.N = null;
                        List<RosterItem> list = this.al;
                        bISPApplication.N = list;
                        i = 1;
                        i = 1;
                        try {
                            this.an.setLayoutManager(new LinearLayoutManager(1, false));
                            this.an.setAdapter(new bk(this, list));
                        } catch (JSONException unused4) {
                        }
                    }
                } catch (JSONException unused5) {
                }
            }
        }
        if (this.ac.isShowing()) {
            this.ac.dismiss();
        }
        this.ac.setCancelable(false);
        this.ac.setMessage("Please Wait...");
        this.ac.setProgressStyle(0);
        this.ac.show();
        String strR = this.ar.r();
        Objects.requireNonNull(this.ar.j());
        String strTrim = strR.replace("-", str).trim();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject3.put("CNICNumber", strTrim);
            jSONObject3.put("call_origin", 100);
            jSONObject3.put("fingerIndex", this.ao.p);
            jSONObject3.put("fingerTemplate", this.ao.q);
            jSONObject3.put("ipAddress", ac.h(i));
            jSONObject3.put("isFingerPrint", false);
            jSONObject4.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject3.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ar.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ar.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ar.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ar.m());
            Object[] objArr = new Object[i];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 6, false, getApplicationInfo().targetSdkVersion + 4, getApplicationInfo().targetSdkVersion + 74, new char[]{19, 20, 5, 18, 65523, 20, 1, 20, 21, 19, 65506, 25, 65507, 65518, 65513, 65507, 65519, 18, 65510, 15, 18, '\r', 65518, 21, '\r', 2, 5, 18, 65526, 65490, 65511, 5, 20, 65522, 15}, objArr);
            jSONObject4.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.e(jSONObject4, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0163ap(this));
        } catch (JSONException unused6) {
        }
    }

    private static void a(int i, boolean z, int i2, int i3, char[] cArr, Object[] objArr) {
        int i4 = 2 % 2;
        o.a aVar = new o.a();
        char[] cArr2 = new char[i2];
        aVar.b = 0;
        while (aVar.b < i2) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            aVar.a = cArr[aVar.b];
            cArr2[aVar.b] = (char) (aVar.a + i3);
            int i7 = aVar.b;
            cArr2[i7] = (char) (cArr2[i7] - ((int) (((long) a$s14$918) ^ (-3199524018197912079L))));
            aVar.b++;
            int i8 = $10 + 39;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (i > 0) {
            aVar.c = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - aVar.c, aVar.c);
            System.arraycopy(cArr3, aVar.c, cArr2, 0, i2 - aVar.c);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            aVar.b = 0;
            while (aVar.b < i2) {
                cArr4[aVar.b] = cArr2[(i2 - aVar.b) - 1];
                aVar.b++;
            }
            int i10 = $11 + 105;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
