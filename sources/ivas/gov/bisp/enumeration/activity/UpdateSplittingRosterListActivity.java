package ivas.gov.bisp.enumeration.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p025ay.aT;
import ivas.gov.bisp.enumeration.p036bi.aS;
import ivas.gov.bisp.enumeration.p036bi.aU;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateSplittingRosterListActivity extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int p = 1;
    private static int q;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public TextView af;
    public BISPApplication ag;
    public RecyclerView ah;
    public ArrayList<RosterItem> ai;
    public TextView aj;
    private static char[] e$s2$710 = {7843, 16791, 41148, 1012, 25299, 50681, 9236, 34587, 58918, 18801, 43084, 2935, 27544, 51855, 11683, 36076, 61437, 20177, 45350, 4111, 29471, 53861, 13682, 37976, 62619, 22448, 46773, 6648, 30969, 56311, 14866, 40235, 64598, 24420, 48698};
    private static long d$s3$710 = 560254069175756397L;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.ag.N.size());
        int i2 = 0;
        Toast.makeText(this, sb.toString(), 0).show();
        while (i2 < this.ag.N.size()) {
            if (this.ag.N.get(i2).getGender().equals("null")) {
                b.aIz aiz = new b.aIz(this);
                View viewInflate = getLayoutInflater().inflate(R.layout.new_custom_dialog, (ViewGroup) null);
                aiz.c(viewInflate);
                b bVarB = aiz.b();
                bVarB.show();
                ((TextView) viewInflate.findViewById(R.id.tv_message)).setText("Please Fill Roster Data");
                ((TextView) viewInflate.findViewById(R.id.btn_ok)).setOnClickListener(new aU(this, bVarB));
                return;
            }
            i2++;
            int i3 = q + 25;
            p = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = q + 81;
        p = i5 % 128;
        int i6 = i5 % 2;
        finish();
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = q + 59;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_splitting_roster_list;
        }
        int i3 = 74 / 0;
        return R.layout.activity_splitting_roster_list;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ag = (BISPApplication) getApplicationContext().getApplicationContext();
        this.ac = new ProgressDialog(this);
        this.ad = new SessionManager(this);
        this.ae = (ImageView) findViewById(R.id.iv_back);
        this.af = (TextView) findViewById(R.id.tv_add);
        this.aj = (TextView) findViewById(R.id.tv_benif);
        this.ah = (RecyclerView) findViewById(R.id.recycler_view);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ag = (BISPApplication) getApplicationContext().getApplicationContext();
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
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(this.ad.k()), ivas.gov.bisp.enumeration.bK.b.b(this.ad.m())));
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(this.ad.k());
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.ad.m());
            Object[] objArr = new Object[1];
            a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 1, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26527), View.MeasureSpec.getMode(0), objArr);
            jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new aS(this));
        } catch (JSONException unused) {
        }
        this.aj.setText(this.ad.d());
        this.ae.setOnClickListener(this);
        this.af.setOnClickListener(this);
        int i2 = q + 57;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p + 59;
        q = i2 % 128;
        int i3 = i2 % 2;
        int id = view.getId();
        if (id != R.id.iv_back) {
            if (id == R.id.tv_add) {
                startActivity(new Intent(this, (Class<?>) UpdateNadraRosterList.class));
                finish();
                return;
            }
            return;
        }
        onBackPressed();
        int i4 = p + 11;
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void u(UpdateSplittingRosterListActivity updateSplittingRosterListActivity, String str) {
        String string;
        String string2;
        String string3;
        String str2 = "bank_address";
        String str3 = "mobile_network_name";
        int i = 2 % 2;
        Objects.requireNonNull(updateSplittingRosterListActivity);
        updateSplittingRosterListActivity.ai = new ArrayList<>();
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
                String string16 = jSONObject2.getString("message".toLowerCase());
                int i10 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string17 = jSONObject2.getString("workStatus".toLowerCase());
                int i11 = jSONObject2.getInt("workStatusCode".toLowerCase());
                String string18 = jSONObject2.has("mobile_no".toLowerCase()) ^ true ? BuildConfig.FLAVOR : jSONObject2.getString("mobile_no".toLowerCase());
                String string19 = jSONObject2.has(str3.toLowerCase()) ? jSONObject2.getString(str3.toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("banks_name".toLowerCase())) {
                    int i12 = q + 29;
                    p = i12 % 128;
                    int i13 = i12 % 2;
                    string = jSONObject2.getString("banks_name".toLowerCase());
                } else {
                    string = BuildConfig.FLAVOR;
                }
                int i14 = jSONObject2.has("branch_code".toLowerCase()) ? jSONObject2.getInt("branch_code".toLowerCase()) : 0;
                if (jSONObject2.has(str2.toLowerCase())) {
                    int i15 = q + 113;
                    p = i15 % 128;
                    int i16 = i15 % 2;
                    string2 = jSONObject2.getString(str2.toLowerCase());
                } else {
                    string2 = BuildConfig.FLAVOR;
                }
                String string20 = jSONObject2.has("account_title".toLowerCase()) ? jSONObject2.getString("account_title".toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("account_number".toLowerCase())) {
                    string3 = jSONObject2.getString("account_number".toLowerCase());
                } else {
                    int i17 = q + 31;
                    p = i17 % 128;
                    int i18 = i17 % 2;
                    string3 = BuildConfig.FLAVOR;
                }
                updateSplittingRosterListActivity.ai.add(new RosterItem(string4, z, string5, string6, string8, i3, string9, string10, string11, i4, i5, string12, string7, string13, i6, i7, string14, z2, i8, string15, i9, string16, i10, j, string17, i11, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string18, string19, string, i14, string2, string20, string3));
                i2++;
                str3 = str3;
                str2 = str2;
            }
            BISPApplication bISPApplication = updateSplittingRosterListActivity.ag;
            bISPApplication.N = null;
            ArrayList<RosterItem> arrayList = updateSplittingRosterListActivity.ai;
            bISPApplication.N = arrayList;
            updateSplittingRosterListActivity.ah.setLayoutManager(new LinearLayoutManager(1, false));
            updateSplittingRosterListActivity.ah.setAdapter(new aT(updateSplittingRosterListActivity, arrayList));
        } catch (JSONException unused) {
        }
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        e eVar = new e();
        long[] jArr = new long[i];
        eVar.d = 0;
        while (eVar.d < i) {
            jArr[eVar.d] = (((long) ((char) (((long) e$s2$710[i2 + eVar.d]) ^ (-9150281428767639173L)))) ^ (((long) eVar.d) * ((-9150281428767639173L) ^ d$s3$710))) ^ ((long) c);
            eVar.d++;
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
        }
        char[] cArr = new char[i];
        eVar.d = 0;
        while (eVar.d < i) {
            int i6 = $11 + 11;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr[eVar.d] = (char) jArr[eVar.d];
            eVar.d++;
        }
        objArr[0] = new String(cArr);
    }
}
