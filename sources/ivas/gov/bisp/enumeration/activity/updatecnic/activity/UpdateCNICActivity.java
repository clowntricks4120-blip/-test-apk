package ivas.gov.bisp.enumeration.activity.updatecnic.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p045br.j;
import ivas.gov.bisp.enumeration.p047bt.r;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateCNICActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long d$s51$78 = -7708670623904636747L;
    private static int p = 1;
    private static int q;
    public ImageView ac;
    public ProgressDialog ad;
    public SessionManager ae;
    public ArrayList<RosterItem> af;
    public BISPApplication ag;
    public TextView ah;
    public RecyclerView ai;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) DashboardActivity.class));
        finish();
        int i2 = q + 83;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 17;
        int i3 = i2 % 128;
        q = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 91;
        p = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_update_cnicactivity;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        if (view.getId() == R.id.iv_back) {
            int i2 = q + 5;
            p = i2 % 128;
            int i3 = i2 % 2;
            onBackPressed();
        }
        int i4 = p + 117;
        q = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = (BISPApplication) getApplicationContext().getApplicationContext();
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.ad = progressDialog;
        progressDialog.setCancelable(false);
        this.ad.setMessage("Please Wait...");
        this.ad.setProgressStyle(0);
        this.ae = new SessionManager(this);
        this.ac = (ImageView) findViewById(R.id.iv_back);
        this.ah = (TextView) findViewById(R.id.tv_benif);
        this.ai = (RecyclerView) findViewById(R.id.recycler_view);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ac.setOnClickListener(this);
        ProgressDialog progressDialog2 = this.ad;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            int i2 = q + 97;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                this.ad.cancel();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.ad.cancel();
        }
        String strR = this.ae.r();
        Objects.requireNonNull(this.ae.j());
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
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ae.k()), b.b(this.ae.m())));
            byte[] bArrB = b.b(this.ae.k());
            byte[] bArrB2 = b.b(this.ae.m());
            Object[] objArr = new Object[1];
            a(KeyEvent.normalizeMetaState(0) + 11777, new char[]{28246, 16501, 12903, 58432, 54906, 34919, 31331, 11379, 7787, 61515, 41583, 38011, 18025, 14441, 60012, 56412, 36472, 24643, 21069, 1099, 63046, 43083, 39541, 19520, 15974, 4218, 49766, 46148, 26232, 22625, 2669, 64619, 44611, 32870, 29185}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.h(this.ad, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new j(this));
            int i3 = p + 81;
            q = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException unused) {
        }
        this.ah.setText(this.ae.d());
    }

    public static void u(UpdateCNICActivity updateCNICActivity, String str) {
        int i;
        String str2;
        char c;
        String string;
        String string2;
        String str3 = "bank_address";
        String str4 = "branch_code";
        int i2 = 2 % 2;
        Objects.requireNonNull(updateCNICActivity);
        updateCNICActivity.af = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string3 = jSONObject.getString("hhid".toLowerCase());
            String string4 = jSONObject.getString("message".toLowerCase());
            String string5 = jSONObject.getString("hH_Name".toLowerCase());
            String string6 = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int i3 = 0;
            for (int length = jSONArray.length(); i3 < length; length = length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                String string7 = jSONObject2.getString("cnic".toLowerCase());
                int i4 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string8 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string9 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string10 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string10);
                int i5 = jSONObject2.getInt("educationLevelCode".toLowerCase());
                int i6 = jSONObject2.getInt("employmentCode".toLowerCase());
                String string11 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string12 = jSONObject2.getString("gender".toLowerCase());
                int i7 = jSONObject2.getInt("goneToSchoolCode".toLowerCase());
                int i8 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string13 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                int i9 = jSONObject2.getInt("lastWeekWorkingHours".toLowerCase());
                String string14 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i10 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string15 = jSONObject2.getString("message".toLowerCase());
                int i11 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string16 = jSONObject2.getString("workStatus".toLowerCase());
                int i12 = jSONObject2.getInt("workStatusCode".toLowerCase());
                String string17 = jSONObject2.has("mobile_no".toLowerCase()) ? jSONObject2.getString("mobile_no".toLowerCase()) : BuildConfig.FLAVOR;
                String string18 = !(jSONObject2.has("mobile_network_name".toLowerCase()) ^ true) ? jSONObject2.getString("mobile_network_name".toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("banks_name".toLowerCase())) {
                    int i13 = q + 51;
                    p = i13 % 128;
                    if (i13 % 2 == 0) {
                        string2 = jSONObject2.getString("banks_name".toLowerCase());
                        i = 0;
                        int i14 = 66 / 0;
                    } else {
                        i = 0;
                        string2 = jSONObject2.getString("banks_name".toLowerCase());
                    }
                    str2 = string2;
                } else {
                    i = 0;
                    int i15 = q + 3;
                    p = i15 % 128;
                    int i16 = i15 % 2;
                    str2 = BuildConfig.FLAVOR;
                }
                int i17 = !(jSONObject2.has(str4.toLowerCase()) ^ true) ? jSONObject2.getInt(str4.toLowerCase()) : i;
                String string19 = jSONObject2.has(str3.toLowerCase()) ? jSONObject2.getString(str3.toLowerCase()) : BuildConfig.FLAVOR;
                if (!(!jSONObject2.has("account_title".toLowerCase()))) {
                    int i18 = q + 13;
                    p = i18 % 128;
                    c = 2;
                    int i19 = i18 % 2;
                    string = jSONObject2.getString("account_title".toLowerCase());
                } else {
                    c = 2;
                    string = BuildConfig.FLAVOR;
                }
                updateCNICActivity.af.add(new RosterItem(string3, z, string4, string5, string7, i4, string8, string9, string10, i5, i6, string11, string6, string12, i7, i8, string13, z2, i9, string14, i10, string15, i11, j, string16, i12, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string17, string18, str2, i17, string19, string, !(jSONObject2.has("account_number".toLowerCase()) ^ true) ? jSONObject2.getString("account_number".toLowerCase()) : BuildConfig.FLAVOR));
                i3++;
                str3 = str3;
                str4 = str4;
            }
            ArrayList<RosterItem> arrayList = updateCNICActivity.af;
            updateCNICActivity.ai.setLayoutManager(new LinearLayoutManager(1, false));
            updateCNICActivity.ai.setAdapter(new r(updateCNICActivity, arrayList));
        } catch (JSONException unused) {
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        m mVar = new m();
        mVar.d = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                jArr[mVar.e] = (((long) cArr[mVar.e]) & (((long) mVar.e) ^ ((long) mVar.d))) + (d$s51$78 % 6031393033645231780L);
                i3 = mVar.e;
            } else {
                jArr[mVar.e] = (6031393033645231780L ^ d$s51$78) ^ (((long) cArr[mVar.e]) ^ (((long) mVar.e) * ((long) mVar.d)));
                i3 = mVar.e + 1;
            }
            mVar.e = i3;
        }
        char[] cArr2 = new char[length];
        mVar.e = 0;
        while (mVar.e < cArr.length) {
            int i6 = $10 + 35;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                i2 = mVar.e << 1;
            } else {
                cArr2[mVar.e] = (char) jArr[mVar.e];
                i2 = mVar.e + 1;
            }
            mVar.e = i2;
        }
        objArr[0] = new String(cArr2);
    }
}
