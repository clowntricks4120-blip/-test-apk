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
import ivas.gov.bisp.enumeration.dd.Z;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p025ay.f;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateDobRosterListActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int c$s65$711 = 937766413;
    private static boolean e$s68$711 = true;
    private static int p = 0;
    private static int q = 1;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public ArrayList<RosterItem> af;
    public BISPApplication ag;
    public TextView ah;
    public RecyclerView ai;
    private static char[] b$s64$711 = {11860, 11946, 11961, 11871, 11964, 11960, 11967, 11864, 11950, 11962, 11855, 11910, 11848, 11859, 11862, 11868, 11851, 11954, 11951, 11867, 11903};
    private static boolean a$s67$711 = true;

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p + 67;
        int i3 = i2 % 128;
        q = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 109;
        p = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return R.layout.activity_update_cnicactivity;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) Single_Discrepancy.class));
        finish();
        int i2 = p + 53;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = q + 17;
        p = i2 % 128;
        int i3 = i2 % 2;
        if (view.getId() == R.id.iv_back) {
            onBackPressed();
            int i4 = q + 111;
            p = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
            }
        }
        int i6 = q + 37;
        p = i6 % 128;
        int i7 = i6 % 2;
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
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.ah = (TextView) findViewById(R.id.tv_benif);
        this.ai = (RecyclerView) findViewById(R.id.recycler_view);
        ((TextView) findViewById(R.id.tv_heading)).setText(R.string.dob_eng);
        ProgressDialog progressDialog2 = this.ac;
        if (progressDialog2 != null) {
            int i2 = p + 33;
            q = i2 % 128;
            int i3 = i2 % 2;
            if (progressDialog2.isShowing()) {
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
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 91, null, new byte[]{-107, -108, -121, -126, -109, -110, -118, -114, -110, -121, -123, -111, -121, -112, -115, -113, -114, -115, -116, -117, -122, -118, -125, -119, -125, -120, -121, -126, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new Z(this));
        } catch (JSONException unused) {
        }
        this.ah.setText(this.ad.d());
        this.ae.setOnClickListener(this);
        int i4 = p + 123;
        q = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void u(UpdateDobRosterListActivity updateDobRosterListActivity, String str) throws Exception {
        String string;
        int i;
        String string2;
        String str2 = "bank_address";
        String str3 = "message";
        int i2 = 2;
        int i3 = 2 % 2;
        Objects.requireNonNull(updateDobRosterListActivity);
        updateDobRosterListActivity.af = new ArrayList<>();
        try {
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
                    String string15 = jSONObject2.getString(str3.toLowerCase());
                    int i12 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                    long j = jSONObject2.getLong("rId".toLowerCase());
                    String string16 = jSONObject2.getString("workStatus".toLowerCase());
                    int i13 = jSONObject2.getInt("workStatusCode".toLowerCase());
                    if (jSONObject2.has("mobile_no".toLowerCase())) {
                        int i14 = p + 9;
                        q = i14 % 128;
                        int i15 = i14 % i2;
                        string = jSONObject2.getString("mobile_no".toLowerCase());
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    String string17 = jSONObject2.has("mobile_network_name".toLowerCase()) ? jSONObject2.getString("mobile_network_name".toLowerCase()) : BuildConfig.FLAVOR;
                    String string18 = jSONObject2.has("banks_name".toLowerCase()) ? jSONObject2.getString("banks_name".toLowerCase()) : BuildConfig.FLAVOR;
                    if (jSONObject2.has("branch_code".toLowerCase())) {
                        int i16 = p + 117;
                        q = i16 % 128;
                        if (i16 % i2 == 0) {
                            jSONObject2.getInt("branch_code".toLowerCase());
                            throw null;
                        }
                        i = jSONObject2.getInt("branch_code".toLowerCase());
                    } else {
                        i = 0;
                    }
                    String string19 = !(jSONObject2.has(str2.toLowerCase()) ^ true) ? jSONObject2.getString(str2.toLowerCase()) : BuildConfig.FLAVOR;
                    String string20 = jSONObject2.has("account_title".toLowerCase()) ? jSONObject2.getString("account_title".toLowerCase()) : BuildConfig.FLAVOR;
                    if (jSONObject2.has("account_number".toLowerCase())) {
                        int i17 = p + 105;
                        q = i17 % 128;
                        int i18 = i17 % i2;
                        string2 = jSONObject2.getString("account_number".toLowerCase());
                    } else {
                        string2 = BuildConfig.FLAVOR;
                    }
                    updateDobRosterListActivity.af.add(new RosterItem(string3, z, string4, string5, string7, i5, string8, string9, string10, i6, i7, string11, string6, string12, i8, i9, string13, z2, i10, string14, i11, string15, i12, j, string16, i13, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string, string17, string18, i, string19, string20, string2));
                    i4++;
                    str3 = str3;
                    str2 = str2;
                    length = length;
                    i2 = 2;
                }
                ArrayList<RosterItem> arrayList = updateDobRosterListActivity.af;
                updateDobRosterListActivity.ac.dismiss();
                updateDobRosterListActivity.ai.setLayoutManager(new LinearLayoutManager(1, false));
                updateDobRosterListActivity.ai.setAdapter(new f(updateDobRosterListActivity, arrayList));
            } catch (Exception e) {
                throw e;
            }
        } catch (JSONException unused) {
        }
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$711;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $11 + 109;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr3[i3] = (char) (((long) cArr2[i3]) / 1962356595541487140L);
                    i3 /= 0;
                } else {
                    cArr3[i3] = (char) (((long) cArr2[i3]) ^ 1962356595541487140L);
                    i3++;
                }
            }
            cArr2 = cArr3;
        }
        int i5 = (int) (1962356595541487140L ^ ((long) c$s65$711));
        if (e$s68$711) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i5);
                lVar.a++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!a$s67$711) {
            lVar.d = iArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                cArr5[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i5);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        lVar.d = cArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            cArr6[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i5);
            lVar.a++;
            int i8 = $11 + 23;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
