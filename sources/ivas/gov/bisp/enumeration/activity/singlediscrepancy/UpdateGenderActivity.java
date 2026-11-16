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
import ivas.gov.bisp.enumeration.dd.K;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p025ay.aq;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateGenderActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c$s65$911 = 937766596;
    private static boolean e$s68$911 = true;
    private static int p = 0;
    private static int q = 1;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public ArrayList<RosterItem> af;
    public BISPApplication ag;
    public TextView ah;
    public RecyclerView ai;
    private static char[] b$s64$911 = {12035, 12129, 12144, 12054, 12139, 12151, 12150, 12055, 12133, 12145, 12038, 12157, 12039, 12042, 12045, 12043, 12034, 12137, 12134, 12050, 12086};
    private static boolean a$s67$911 = true;

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v5 android.app.ProgressDialog) = (r1v4 android.app.ProgressDialog), (r1v14 android.app.ProgressDialog) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ProgressDialog progressDialog;
        int i = 2 % 2;
        int i2 = p + 91;
        q = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            progressDialog = this.ac;
            int i3 = 69 / 0;
            if (progressDialog != null) {
                if (progressDialog.isShowing()) {
                    this.ac.cancel();
                    int i4 = q + 45;
                    p = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } else {
            super.onDestroy();
            progressDialog = this.ac;
            if (progressDialog != null) {
                if (progressDialog.isShowing()) {
                    this.ac.cancel();
                    int i6 = q + 45;
                    p = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        int i8 = p + 43;
        q = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = q + 1;
        p = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = q + 89;
        p = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 67;
        int i3 = i2 % 128;
        q = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        p = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_update_cnicactivity;
        }
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) Single_Discrepancy.class));
        finish();
        int i2 = q + 27;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 47;
        p = i2 % 128;
        int i3 = i2 % 2;
        if (view.getId() == R.id.iv_back) {
            int i4 = q + 119;
            p = i4 % 128;
            if (i4 % 2 != 0) {
                onBackPressed();
                throw null;
            }
            onBackPressed();
        }
        int i5 = q + 11;
        p = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
    }

    public static void u(UpdateGenderActivity updateGenderActivity, String str) {
        int i;
        String str2;
        String str3 = "bank_address";
        String str4 = "banks_name";
        int i2 = 2 % 2;
        Objects.requireNonNull(updateGenderActivity);
        updateGenderActivity.af = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string = jSONObject.getString("hhid".toLowerCase());
            String string2 = jSONObject.getString("message".toLowerCase());
            String string3 = jSONObject.getString("hH_Name".toLowerCase());
            String string4 = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int i3 = 0;
            for (int length = jSONArray.length(); i3 < length; length = length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                String string5 = jSONObject2.getString("cnic".toLowerCase());
                int i4 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string6 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string7 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string8 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string8);
                int i5 = jSONObject2.getInt("educationLevelCode".toLowerCase());
                int i6 = jSONObject2.getInt("employmentCode".toLowerCase());
                String string9 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string10 = jSONObject2.getString("gender".toLowerCase());
                int i7 = jSONObject2.getInt("goneToSchoolCode".toLowerCase());
                int i8 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string11 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                int i9 = jSONObject2.getInt("lastWeekWorkingHours".toLowerCase());
                String string12 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i10 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string13 = jSONObject2.getString("message".toLowerCase());
                int i11 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string14 = jSONObject2.getString("workStatus".toLowerCase());
                int i12 = jSONObject2.getInt("workStatusCode".toLowerCase());
                String string15 = jSONObject2.has("mobile_no".toLowerCase()) ? jSONObject2.getString("mobile_no".toLowerCase()) : BuildConfig.FLAVOR;
                String string16 = !jSONObject2.has("mobile_network_name".toLowerCase()) ? BuildConfig.FLAVOR : jSONObject2.getString("mobile_network_name".toLowerCase());
                String string17 = jSONObject2.has(str4.toLowerCase()) ^ true ? BuildConfig.FLAVOR : jSONObject2.getString(str4.toLowerCase());
                if (jSONObject2.has("branch_code".toLowerCase())) {
                    int i13 = q + 101;
                    p = i13 % 128;
                    if (i13 % 2 != 0) {
                        jSONObject2.getInt("branch_code".toLowerCase());
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    i = jSONObject2.getInt("branch_code".toLowerCase());
                } else {
                    i = 0;
                }
                String string18 = jSONObject2.has(str3.toLowerCase()) ? jSONObject2.getString(str3.toLowerCase()) : BuildConfig.FLAVOR;
                String string19 = jSONObject2.has("account_title".toLowerCase()) ? jSONObject2.getString("account_title".toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("account_number".toLowerCase())) {
                    int i14 = q + 9;
                    p = i14 % 128;
                    int i15 = i14 % 2;
                    String string20 = jSONObject2.getString("account_number".toLowerCase());
                    int i16 = p + 121;
                    q = i16 % 128;
                    int i17 = i16 % 2;
                    str2 = string20;
                } else {
                    str2 = BuildConfig.FLAVOR;
                }
                updateGenderActivity.af.add(new RosterItem(string, z, string2, string3, string5, i4, string6, string7, string8, i5, i6, string9, string4, string10, i7, i8, string11, z2, i9, string12, i10, string13, i11, j, string14, i12, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string15, string16, string17, i, string18, string19, str2));
                i3++;
                str3 = str3;
                str4 = str4;
            }
            ArrayList<RosterItem> arrayList = updateGenderActivity.af;
            updateGenderActivity.ac.dismiss();
            updateGenderActivity.ai.setLayoutManager(new LinearLayoutManager(1, false));
            updateGenderActivity.ai.setAdapter(new aq(updateGenderActivity, arrayList));
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
        ((TextView) findViewById(R.id.tv_heading)).setText(R.string.gender_info);
        ProgressDialog progressDialog = this.ac;
        if (progressDialog != null && progressDialog.isShowing()) {
            int i2 = q + 117;
            p = i2 % 128;
            int i3 = i2 % 2;
            this.ac.cancel();
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
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 91, null, new byte[]{-107, -108, -121, -126, -109, -110, -118, -114, -110, -121, -123, -111, -121, -112, -115, -113, -114, -115, -116, -117, -122, -118, -125, -119, -125, -120, -121, -126, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new K(this));
            int i4 = p + 67;
            q = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
        this.ah.setText(this.ad.d());
        this.ae.setOnClickListener(this);
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$911;
        if (cArr2 != null) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr3[i6] = (char) (((long) cArr2[i6]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i7 = (int) (1962356595541487140L ^ ((long) c$s65$911));
        if (e$s68$911) {
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                int i8 = $10 + 119;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d % 0) >>> lVar.a] >> i] - i7);
                    i2 = lVar.a >>> 1;
                } else {
                    cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i7);
                    i2 = lVar.a + 1;
                }
                lVar.a = i2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!a$s67$911) {
            lVar.d = iArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            int i9 = $11 + 105;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i7);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        lVar.d = cArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        int i11 = $10 + 25;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 2 % 4;
        }
        while (lVar.a < lVar.d) {
            cArr6[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i7);
            lVar.a++;
        }
        objArr[0] = new String(cArr6);
    }
}
