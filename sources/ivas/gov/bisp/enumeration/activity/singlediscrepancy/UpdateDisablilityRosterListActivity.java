package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.ProgressDialog;
import android.content.Intent;
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
import ivas.gov.bisp.enumeration.dd.C0295q;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p025ay.w;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateDisablilityRosterListActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long d$s51$109 = -4467472578307628354L;
    private static int p = 1;
    private static int q;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public ArrayList<RosterItem> af;
    public BISPApplication ag;
    public RecyclerView ah;
    public w ai;
    public TextView aj;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) Single_Discrepancy.class));
        finish();
        int i2 = p + 115;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q + 95;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = q + 5;
        p = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 + 7;
        p = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 123;
        p = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_update_cnicactivity;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 99;
        p = i2 % 128;
        int i3 = i2 % 2;
        if (view.getId() == R.id.iv_back) {
            int i4 = p + 95;
            q = i4 % 128;
            if (i4 % 2 != 0) {
                onBackPressed();
                throw null;
            }
            onBackPressed();
        }
        int i5 = p + 49;
        q = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        ProgressDialog progressDialog = this.ac;
        if (progressDialog != null) {
            int i2 = q + 117;
            p = i2 % 128;
            int i3 = i2 % 2;
            if (!progressDialog.isShowing()) {
                return;
            }
            int i4 = q + 73;
            p = i4 % 128;
            int i5 = i4 % 2;
            this.ac.cancel();
            if (i5 == 0) {
                int i6 = 30 / 0;
            }
        }
    }

    public final void y(List<RosterItem> list) {
        int i = 2 % 2;
        this.ac.dismiss();
        this.ah.setLayoutManager(new LinearLayoutManager(1, false));
        this.ai = new w(this, list);
        this.ah.getRecycledViewPool().b();
        this.ai.a.c();
        this.ah.setAdapter(this.ai);
        int i2 = p + 57;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void u(UpdateDisablilityRosterListActivity updateDisablilityRosterListActivity, String str) {
        String str2;
        String str3;
        String string;
        String str4;
        String string2;
        String str5 = "mobile_network_name";
        String str6 = "mobile_no";
        int i = 2 % 2;
        Objects.requireNonNull(updateDisablilityRosterListActivity);
        updateDisablilityRosterListActivity.af = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string3 = jSONObject.getString("hhid".toLowerCase());
            String string4 = jSONObject.getString("message".toLowerCase());
            String string5 = jSONObject.getString("hH_Name".toLowerCase());
            String string6 = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int i2 = p + 71;
            q = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 2;
            }
            int i4 = 0;
            for (int length = jSONArray.length(); i4 < length; length = length) {
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
                String string17 = jSONObject2.has(str6.toLowerCase()) ? jSONObject2.getString(str6.toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has(str5.toLowerCase())) {
                    int i14 = p + 79;
                    q = i14 % 128;
                    int i15 = i14 % 2;
                    String string18 = jSONObject2.getString(str5.toLowerCase());
                    int i16 = q + 57;
                    p = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 2 % 5;
                    }
                    str2 = string18;
                } else {
                    str2 = BuildConfig.FLAVOR;
                }
                String string19 = jSONObject2.has("banks_name".toLowerCase()) ? jSONObject2.getString("banks_name".toLowerCase()) : BuildConfig.FLAVOR;
                int i18 = jSONObject2.has("branch_code".toLowerCase()) ^ true ? 0 : jSONObject2.getInt("branch_code".toLowerCase());
                if (jSONObject2.has("bank_address".toLowerCase())) {
                    int i19 = q + 55;
                    p = i19 % 128;
                    if (i19 % 2 == 0) {
                        string2 = jSONObject2.getString("bank_address".toLowerCase());
                        int i20 = 91 / 0;
                    } else {
                        string2 = jSONObject2.getString("bank_address".toLowerCase());
                    }
                    str3 = string2;
                } else {
                    str3 = BuildConfig.FLAVOR;
                }
                String string20 = jSONObject2.has("account_title".toLowerCase()) ? jSONObject2.getString("account_title".toLowerCase()) : BuildConfig.FLAVOR;
                if (!jSONObject2.has("account_number".toLowerCase())) {
                    str4 = BuildConfig.FLAVOR;
                } else {
                    int i21 = p + 51;
                    q = i21 % 128;
                    if (i21 % 2 != 0) {
                        string = jSONObject2.getString("account_number".toLowerCase());
                        int i22 = 64 / 0;
                    } else {
                        string = jSONObject2.getString("account_number".toLowerCase());
                    }
                    str4 = string;
                }
                updateDisablilityRosterListActivity.af.add(new RosterItem(string3, z, string4, string5, string7, i5, string8, string9, string10, i6, i7, string11, string6, string12, i8, i9, string13, z2, i10, string14, i11, string15, i12, j, string16, i13, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string17, str2, string19, i18, str3, string20, str4));
                i4++;
                str6 = str6;
                str5 = str5;
            }
            updateDisablilityRosterListActivity.y(updateDisablilityRosterListActivity.af);
        } catch (JSONException unused) {
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = (BISPApplication) getApplicationContext();
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.ac = progressDialog;
        progressDialog.setCancelable(false);
        this.ac.setMessage("Please Wait...");
        this.ac.setProgressStyle(0);
        this.ad = new SessionManager(this);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.aj = (TextView) findViewById(R.id.tv_benif);
        this.ah = (RecyclerView) findViewById(R.id.recycler_view);
        ((TextView) findViewById(R.id.tv_heading)).setText(R.string.disability);
        ProgressDialog progressDialog2 = this.ac;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            int i2 = q + 47;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                this.ac.cancel();
                throw null;
            }
            this.ac.cancel();
        }
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
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ad.k()), b.b(this.ad.m())));
            byte[] bArrB = b.b(this.ad.k());
            byte[] bArrB2 = b.b(this.ad.m());
            Object[] objArr = new Object[1];
            a(getApplicationInfo().targetSdkVersion + 40392, new char[]{27741, 61848, 22432, 46589, 7145, 31210, 57092, 15662, 33616, 57686, 18280, 42134, 2746, 26836, 52939, 11473, 45587, 4110, 30314, 54390, 14933, 40870, 64946, 17309, 41437, 2023, 25857, 51977, 10539, 36700, 60778, 29318, 53384, 13963, 38022}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ac, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new C0295q(this));
            int i3 = p + 45;
            q = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
        this.aj.setText(this.ad.d());
        this.ae.setOnClickListener(this);
        int i5 = p + 57;
        q = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            jArr[mVar.e] = (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d))) ^ (d$s51$109 ^ 6031393033645231780L);
            mVar.e++;
            int i5 = $11 + 61;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            cArr2[mVar.e] = (char) jArr[mVar.e];
            mVar.e++;
        }
        objArr[0] = new String(cArr2);
    }
}
