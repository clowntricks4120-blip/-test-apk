package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.C0151ac;
import ivas.gov.bisp.enumeration.p036bi.C0175d;
import ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnClickListenerC0155ag;
import ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnClickListenerC0156ah;
import ivas.gov.bisp.enumeration.p036bi.aj;
import ivas.gov.bisp.enumeration.p051bx.C0229m;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DiscrepancyRosterListActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long d$s40$119 = -6581507298317129355L;
    private static int p = 0;
    private static int q = 1;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public TextView af;
    public BISPApplication ag;
    public TextView ah;
    public RecyclerView ai;
    public ArrayList<RosterItem> aj;

    public static void w(DiscrepancyRosterListActivity discrepancyRosterListActivity, String str, String str2) {
        int i = 2 % 2;
        Objects.requireNonNull(discrepancyRosterListActivity);
        b.aIz aiz = new b.aIz(discrepancyRosterListActivity);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.e = str;
        oooO0O0.f = str2;
        oooO0O0.k = true;
        DialogInterfaceOnClickListenerC0156ah dialogInterfaceOnClickListenerC0156ah = new DialogInterfaceOnClickListenerC0156ah(discrepancyRosterListActivity);
        oooO0O0.h = "Retry";
        oooO0O0.i = dialogInterfaceOnClickListenerC0156ah;
        aj ajVar = new aj(discrepancyRosterListActivity);
        oooO0O0.a = "Cancel";
        oooO0O0.j = ajVar;
        aiz.b().show();
        int i2 = q + 39;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = p + 43;
        q = i2 % 128;
        if (i2 % 2 != 0) {
            finish();
            return;
        }
        finish();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 39;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            view.getId();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view.getId() == R.id.iv_back) {
            onBackPressed();
            int i3 = q + 73;
            p = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 55;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = i2 + 97;
        p = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_roster_list;
    }

    public static void v(DiscrepancyRosterListActivity discrepancyRosterListActivity, String str, String str2, boolean z) {
        int i = 2 % 2;
        Objects.requireNonNull(discrepancyRosterListActivity);
        AlertDialog.Builder builder = new AlertDialog.Builder(discrepancyRosterListActivity);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterfaceOnClickListenerC0155ag(discrepancyRosterListActivity, z));
        builder.create().show();
        int i2 = q + 109;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void B(String str) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Cnic", str);
            jSONObject.put("HHId", this.ad.c());
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.ad.r());
            jSONObject.put("Type", "update");
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ad.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ad.m())));
            ax.h(this.ac, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", new C0151ac(this));
            int i2 = q + 57;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = (BISPApplication) getApplicationContext().getApplicationContext();
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.ac = progressDialog;
        progressDialog.setCancelable(false);
        this.ac.setMessage("Please Wait...");
        this.ac.setProgressStyle(0);
        this.ad = new SessionManager(this);
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.af = (TextView) findViewById(R.id.tv_add);
        this.ah = (TextView) findViewById(R.id.tv_benif);
        this.ai = (RecyclerView) findViewById(R.id.recycler_view);
        this.ae.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.af.setVisibility(8);
        this.af.setVisibility(8);
        this.ah.setText(this.ad.d());
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        ProgressDialog progressDialog2 = this.ac;
        if (progressDialog2 != null) {
            int i2 = p + 1;
            q = i2 % 128;
            if (i2 % 2 == 0) {
                progressDialog2.isShowing();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (progressDialog2.isShowing()) {
                this.ac.dismiss();
            }
        }
        if (this.ad.n().equals(BuildConfig.FLAVOR)) {
            B(this.ad.r());
            return;
        }
        int i3 = p + 5;
        q = i3 % 128;
        int i4 = i3 % 2;
        A();
        if (i4 == 0) {
            int i5 = 54 / 0;
        }
    }

    public final void A() {
        int i = 2 % 2;
        String strR = this.ad.r();
        Objects.requireNonNull(this.ad.j());
        Objects.requireNonNull(strR.replace("-", BuildConfig.FLAVOR));
        String strReplace = strR.replace("-", BuildConfig.FLAVOR);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("CNICNumber", strReplace);
            jSONObject.put("call_origin", 100);
            jSONObject.put("fingerIndex", this.ag.p);
            jSONObject.put("fingerTemplate", this.ag.q);
            jSONObject.put("ipAddress", ac.h(true));
            jSONObject.put("isFingerPrint", false);
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ad.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ad.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ad.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ad.m());
            Object[] objArr = new Object[1];
            a(getApplicationInfo().targetSdkVersion - 31, new char[]{21691, 21756, 57302, 1811, 54321, 52209, 12259, 59557, 1500, 47855, 32491, 22938, 63193, 27095, 52723, 2694, 42967, 55545, 7420, 64429, 4322, 34807, 27641, 21662, 49616, 30451, 47821, 1433, 45796, 9686, 2506, 63113, 25590, 38081, 22733, 42922, 56457, 17154, 47077}, objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ac, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0175d(this));
            int i2 = q + 41;
            p = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
    }

    public static void u(DiscrepancyRosterListActivity discrepancyRosterListActivity, String str) {
        String string;
        int i;
        String str2;
        int i2;
        String string2;
        String string3;
        String str3 = "bank_address";
        String str4 = "message";
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = p + 17;
        q = i5 % 128;
        int i6 = i5 % 2;
        ProgressDialog progressDialog = discrepancyRosterListActivity.ac;
        if (progressDialog != null && progressDialog.isShowing()) {
            discrepancyRosterListActivity.ac.dismiss();
        }
        discrepancyRosterListActivity.aj = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string4 = jSONObject.getString("hhid".toLowerCase());
            String string5 = jSONObject.getString("message".toLowerCase());
            String string6 = jSONObject.getString("hH_Name".toLowerCase());
            String string7 = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int length = jSONArray.length();
            int i7 = 0;
            while (i7 < length) {
                int i8 = p + 111;
                q = i8 % 128;
                int i9 = i8 % i3;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                String string8 = jSONObject2.getString("cnic".toLowerCase());
                int i10 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string9 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string10 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string11 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string11);
                int i11 = jSONObject2.getInt("educationLevelCode".toLowerCase());
                int i12 = jSONObject2.getInt("employmentCode".toLowerCase());
                String string12 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string13 = jSONObject2.getString("gender".toLowerCase());
                int i13 = jSONObject2.getInt("goneToSchoolCode".toLowerCase());
                int i14 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string14 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                int i15 = jSONObject2.getInt("lastWeekWorkingHours".toLowerCase());
                String string15 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i16 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string16 = jSONObject2.getString(str4.toLowerCase());
                int i17 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string17 = jSONObject2.getString("workStatus".toLowerCase());
                int i18 = jSONObject2.getInt("workStatusCode".toLowerCase());
                if (!jSONObject2.has("mobile_no".toLowerCase())) {
                    string = BuildConfig.FLAVOR;
                } else {
                    int i19 = q + 47;
                    p = i19 % 128;
                    int i20 = i19 % i3;
                    string = jSONObject2.getString("mobile_no".toLowerCase());
                }
                if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                    int i21 = q + 7;
                    p = i21 % 128;
                    if (i21 % i3 != 0) {
                        string3 = jSONObject2.getString("mobile_network_name".toLowerCase());
                        i = 0;
                        int i22 = 29 / 0;
                    } else {
                        i = 0;
                        string3 = jSONObject2.getString("mobile_network_name".toLowerCase());
                    }
                    str2 = string3;
                } else {
                    i = 0;
                    int i23 = q + 1;
                    p = i23 % 128;
                    int i24 = i23 % i3;
                    str2 = BuildConfig.FLAVOR;
                }
                String string18 = jSONObject2.has("banks_name".toLowerCase()) ? jSONObject2.getString("banks_name".toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("branch_code".toLowerCase())) {
                    int i25 = p + 95;
                    q = i25 % 128;
                    int i26 = i25 % i3;
                    i2 = jSONObject2.getInt("branch_code".toLowerCase());
                } else {
                    i2 = i;
                }
                String string19 = jSONObject2.has(str3.toLowerCase()) ? jSONObject2.getString(str3.toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("account_title".toLowerCase())) {
                    int i27 = q + 123;
                    p = i27 % 128;
                    int i28 = i27 % i3;
                    string2 = jSONObject2.getString("account_title".toLowerCase());
                } else {
                    string2 = BuildConfig.FLAVOR;
                }
                discrepancyRosterListActivity.aj.add(new RosterItem(string4, z, string5, string6, string8, i10, string9, string10, string11, i11, i12, string12, string7, string13, i13, i14, string14, z2, i15, string15, i16, string16, i17, j, string17, i18, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string, str2, string18, i2, string19, string2, jSONObject2.has("account_number".toLowerCase()) ? jSONObject2.getString("account_number".toLowerCase()) : BuildConfig.FLAVOR));
                i7++;
                str4 = str4;
                str3 = str3;
                length = length;
                i3 = 2;
            }
            ArrayList<RosterItem> arrayList = discrepancyRosterListActivity.aj;
            ProgressDialog progressDialog2 = discrepancyRosterListActivity.ac;
            if (progressDialog2 != null) {
                int i29 = p + 53;
                q = i29 % 128;
                int i30 = i29 % 2;
                if (progressDialog2.isShowing()) {
                    discrepancyRosterListActivity.ac.dismiss();
                }
            }
            discrepancyRosterListActivity.ai.setLayoutManager(new LinearLayoutManager(1, false));
            discrepancyRosterListActivity.ai.setAdapter(new C0229m(discrepancyRosterListActivity, arrayList));
        } catch (JSONException unused) {
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        g gVar = new g();
        char[] cArrB = g.b(d$s40$119 ^ (-3439381718914712265L), cArr, i);
        gVar.a = 4;
        while (gVar.a < cArrB.length) {
            int i3 = $10 + 99;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            gVar.c = gVar.a - 4;
            cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$119 ^ (-3439381718914712265L))));
            gVar.a++;
        }
        String str = new String(cArrB, 4, cArrB.length - 4);
        int i5 = $10 + 45;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
