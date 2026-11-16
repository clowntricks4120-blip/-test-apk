package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.dd.aa;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p025ay.C0100at;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateMaritalRosterListActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long d$s40$78 = 4482921164457859914L;
    private static int p = 0;
    private static int q = 1;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public ArrayList<RosterItem> af;
    public BISPApplication ag;
    public TextView ah;
    public RecyclerView ai;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) Single_Discrepancy.class));
        finish();
        int i2 = p + 85;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 115;
        int i3 = i2 % 128;
        q = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 69;
        p = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_update_cnicactivity;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        if (view.getId() == R.id.iv_back) {
            int i2 = q + 53;
            p = i2 % 128;
            if (i2 % 2 != 0) {
                onBackPressed();
                throw null;
            }
            onBackPressed();
        }
        int i3 = q + 1;
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void u(UpdateMaritalRosterListActivity updateMaritalRosterListActivity, String str) {
        String string;
        int i;
        String string2;
        String str2 = "bank_address";
        String str3 = "mobile_no";
        int i2 = 2;
        int i3 = 2 % 2;
        Objects.requireNonNull(updateMaritalRosterListActivity);
        updateMaritalRosterListActivity.af = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string3 = jSONObject.getString("hhid".toLowerCase());
            String string4 = jSONObject.getString("message".toLowerCase());
            String string5 = jSONObject.getString("hH_Name".toLowerCase());
            String string6 = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int length = jSONArray.length();
            int i4 = 0;
            while (i4 < length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                String string7 = jSONObject2.getString("cnic".toLowerCase());
                int i5 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string8 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string9 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string10 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string10);
                int i6 = jSONObject2.getInt("educationLevelCode".toLowerCase());
                int i7 = jSONObject2.getInt("employmentCode".toLowerCase());
                String string11 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string12 = jSONObject2.getString("gender".toLowerCase());
                int i8 = jSONObject2.getInt("goneToSchoolCode".toLowerCase());
                int i9 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string13 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                int i10 = jSONObject2.getInt("lastWeekWorkingHours".toLowerCase());
                String string14 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i11 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string15 = jSONObject2.getString("message".toLowerCase());
                int i12 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string16 = jSONObject2.getString("workStatus".toLowerCase());
                int i13 = jSONObject2.getInt("workStatusCode".toLowerCase());
                String string17 = jSONObject2.has(str3.toLowerCase()) ? jSONObject2.getString(str3.toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("mobile_network_name".toLowerCase())) {
                    int i14 = q + 95;
                    p = i14 % 128;
                    if (i14 % i2 != 0) {
                        jSONObject2.getString("mobile_network_name".toLowerCase());
                        Object obj = null;
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    string = jSONObject2.getString("mobile_network_name".toLowerCase());
                } else {
                    string = BuildConfig.FLAVOR;
                }
                String string18 = jSONObject2.has("banks_name".toLowerCase()) ? jSONObject2.getString("banks_name".toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("branch_code".toLowerCase())) {
                    int i15 = p + 111;
                    q = i15 % 128;
                    int i16 = i15 % 2;
                    i = jSONObject2.getInt("branch_code".toLowerCase());
                } else {
                    i = 0;
                }
                if (jSONObject2.has(str2.toLowerCase())) {
                    int i17 = p + 73;
                    q = i17 % 128;
                    int i18 = i17 % i2;
                    string2 = jSONObject2.getString(str2.toLowerCase());
                } else {
                    string2 = BuildConfig.FLAVOR;
                }
                updateMaritalRosterListActivity.af.add(new RosterItem(string3, z, string4, string5, string7, i5, string8, string9, string10, i6, i7, string11, string6, string12, i8, i9, string13, z2, i10, string14, i11, string15, i12, j, string16, i13, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string17, string, string18, i, string2, jSONObject2.has("account_title".toLowerCase()) ? jSONObject2.getString("account_title".toLowerCase()) : BuildConfig.FLAVOR, jSONObject2.has("account_number".toLowerCase()) ? jSONObject2.getString("account_number".toLowerCase()) : BuildConfig.FLAVOR));
                i4++;
                str3 = str3;
                str2 = str2;
                length = length;
                i2 = 2;
            }
            ArrayList<RosterItem> arrayList = updateMaritalRosterListActivity.af;
            updateMaritalRosterListActivity.ac.dismiss();
            updateMaritalRosterListActivity.ai.setLayoutManager(new LinearLayoutManager(1, false));
            updateMaritalRosterListActivity.ai.setAdapter(new C0100at(updateMaritalRosterListActivity, arrayList));
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = (BISPApplication) getApplicationContext().getApplicationContext();
        this.ac = new ProgressDialog(this);
        this.ad = new SessionManager(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.ah = (TextView) findViewById(R.id.tv_benif);
        this.ai = (RecyclerView) findViewById(R.id.recycler_view);
        ((TextView) findViewById(R.id.tv_heading)).setText(R.string.marital_status_eng);
        ProgressDialog progressDialog = this.ac;
        if (progressDialog != null) {
            int i2 = q + 3;
            p = i2 % 128;
            if (i2 % 2 != 0) {
                progressDialog.isShowing();
                throw null;
            }
            if (progressDialog.isShowing()) {
                this.ac.cancel();
            }
        }
        this.ac.setCancelable(false);
        this.ac.setMessage("Please Wait...");
        this.ac.setProgressStyle(0);
        this.ac.show();
        String strR = this.ad.r();
        Objects.requireNonNull(this.ad.j());
        String strTrim = strR.replace("-", BuildConfig.FLAVOR).trim();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("CNICNumber", strTrim);
            jSONObject.put("call_origin", 100);
            jSONObject.put("fingerIndex", this.ag.p);
            jSONObject.put("fingerTemplate", this.ag.q);
            jSONObject.put("ipAddress", ac.h(true));
            jSONObject.put("isFingerPrint", false);
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ad.k()), b.b(this.ad.m())));
            byte[] bArrB = b.b(this.ad.k());
            byte[] bArrB2 = b.b(this.ad.m());
            Object[] objArr = new Object[1];
            a(-TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), new char[]{9078, 9009, 11238, 56894, 4007, 52734, 4784, 48258, 47853, 44004, 47268, 17065, 4332, 12752, 57000, 59545, 61150, 40906, 17563, 36534, 17631, 26088, 60090, 5289, 8945, 50152, 4338, 47834, 47265, 43425, 46817, 16582, 5807, 14242, 56570, 59105, 60580, 40365, 17046}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new aa(this));
        } catch (JSONException unused) {
        }
        this.ah.setText(this.ad.d());
        this.ae.setOnClickListener(this);
        int i3 = q + 19;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        g gVar = new g();
        char[] cArrB = g.b(d$s40$78 ^ (-3439381718914712265L), cArr, i);
        gVar.a = 4;
        while (gVar.a < cArrB.length) {
            int i3 = $11 + 65;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            gVar.c = gVar.a - 4;
            cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$78 ^ (-3439381718914712265L))));
            gVar.a++;
        }
        String str = new String(cArrB, 4, cArrB.length - 4);
        int i5 = $11 + 113;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }
}
