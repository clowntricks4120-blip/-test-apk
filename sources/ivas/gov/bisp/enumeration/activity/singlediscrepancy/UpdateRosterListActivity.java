package ivas.gov.bisp.enumeration.activity.singlediscrepancy;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.I.i;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO;
import ivas.gov.bisp.enumeration.OooO0Oo.OooO0o;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.NADRARosterListActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.dd.ae;
import ivas.gov.bisp.enumeration.dd.ai;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p025ay.aI;
import ivas.gov.bisp.enumeration.p084g.h;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateRosterListActivity extends BaseTouch implements aI.baK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] c$s11$817 = {626544964, 2022050260, 853331446, 952284313, 1612945813, -388964644, 587518748, -1091711710, -2021557663, 1080884001, -1699796606, -1757280756, -1694229252, 756354377, 55883849, 1135322588, -410446480, 1729291817};
    private static int p = 0;
    private static int q = 1;
    public ProgressDialog ac;
    public SessionManager ad;
    public ImageView ae;
    public TextView af;
    public BISPApplication ag;
    public RecyclerView ah;
    public aI ai;
    public TextView aj;
    public ArrayList<RosterItem> ak;
    public String al;
    public String am;
    public boolean an;
    public Button ao;
    public OooO<Intent> ap = h(new i(), new OooO00o());
    public String aq;
    public String ar;

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 3;
        q = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        q = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_roster_list;
    }

    public static void u(UpdateRosterListActivity updateRosterListActivity, String str) {
        String string;
        String string2;
        String str2 = "branch_code";
        String str3 = "banks_name";
        String str4 = "mobile_network_name";
        int i = 2;
        int i2 = 2 % 2;
        if (updateRosterListActivity.ac.isShowing()) {
            int i3 = p + 57;
            q = i3 % 128;
            if (i3 % 2 == 0) {
                updateRosterListActivity.ac.dismiss();
                throw null;
            }
            updateRosterListActivity.ac.dismiss();
        }
        updateRosterListActivity.ak = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            updateRosterListActivity.an = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            updateRosterListActivity.aq = jSONObject.getString("hhid".toLowerCase());
            updateRosterListActivity.ar = jSONObject.getString("message".toLowerCase());
            updateRosterListActivity.al = jSONObject.getString("hH_Name".toLowerCase());
            updateRosterListActivity.am = jSONObject.getString("form_number".toLowerCase());
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int length = jSONArray.length();
            int i4 = 0;
            while (i4 < length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                String string3 = jSONObject2.getString("cnic".toLowerCase());
                int i5 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string4 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string5 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string6 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string6);
                int i6 = jSONObject2.getInt("educationLevelCode".toLowerCase());
                int i7 = jSONObject2.getInt("employmentCode".toLowerCase());
                String string7 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string8 = jSONObject2.getString("gender".toLowerCase());
                int i8 = jSONObject2.getInt("goneToSchoolCode".toLowerCase());
                int i9 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string9 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z = jSONObject2.getBoolean("isLiterate".toLowerCase());
                int i10 = jSONObject2.getInt("lastWeekWorkingHours".toLowerCase());
                String string10 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i11 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string11 = jSONObject2.getString("message".toLowerCase());
                int i12 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j = jSONObject2.getLong("rId".toLowerCase());
                String string12 = jSONObject2.getString("workStatus".toLowerCase());
                int i13 = jSONObject2.getInt("workStatusCode".toLowerCase());
                if (jSONObject2.has("mobile_no".toLowerCase())) {
                    int i14 = p + 111;
                    q = i14 % 128;
                    if (i14 % i == 0) {
                        jSONObject2.getString("mobile_no".toLowerCase());
                        Object obj = null;
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    string = jSONObject2.getString("mobile_no".toLowerCase());
                } else {
                    string = BuildConfig.FLAVOR;
                }
                if (jSONObject2.has(str4.toLowerCase())) {
                    int i15 = q + 97;
                    p = i15 % 128;
                    int i16 = i15 % 2;
                    string2 = jSONObject2.getString(str4.toLowerCase());
                } else {
                    string2 = BuildConfig.FLAVOR;
                }
                updateRosterListActivity.ak.add(new RosterItem(updateRosterListActivity.aq, updateRosterListActivity.an, updateRosterListActivity.ar, updateRosterListActivity.al, string3, i5, string4, string5, string6, i6, i7, string7, updateRosterListActivity.am, string8, i8, i9, string9, z, i10, string10, i11, string11, i12, j, string12, i13, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string, string2, jSONObject2.has(str3.toLowerCase()) ? jSONObject2.getString(str3.toLowerCase()) : BuildConfig.FLAVOR, jSONObject2.has(str2.toLowerCase()) ? jSONObject2.getInt(str2.toLowerCase()) : 0, jSONObject2.has("bank_address".toLowerCase()) ? jSONObject2.getString("bank_address".toLowerCase()) : BuildConfig.FLAVOR, jSONObject2.has("account_title".toLowerCase()) ? jSONObject2.getString("account_title".toLowerCase()) : BuildConfig.FLAVOR, jSONObject2.has("account_number".toLowerCase()) ? jSONObject2.getString("account_number".toLowerCase()) : BuildConfig.FLAVOR));
                i4++;
                str2 = str2;
                str3 = str3;
                str4 = str4;
                i = 2;
            }
            if (BISPApplication.c().w > 0) {
                ArrayList<RosterItem> arrayList = BISPApplication.c().v;
                Collections.reverse(updateRosterListActivity.ak);
                updateRosterListActivity.ak.addAll(arrayList);
                Collections.reverse(updateRosterListActivity.ak);
            }
            updateRosterListActivity.y(updateRosterListActivity.ak);
            BISPApplication bISPApplication = updateRosterListActivity.ag;
            if (bISPApplication == null) {
                BISPApplication bISPApplication2 = (BISPApplication) updateRosterListActivity.getApplicationContext().getApplicationContext();
                updateRosterListActivity.ag = bISPApplication2;
                bISPApplication2.N = updateRosterListActivity.ak;
            } else {
                int i17 = p + 63;
                q = i17 % 128;
                int i18 = i17 % 2;
                bISPApplication.N = updateRosterListActivity.ak;
            }
        } catch (JSONException unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = q + 105;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.ak != null) {
            for (int i3 = 0; i3 < this.ak.size(); i3++) {
                if (this.ak.get(i3).getHavingChronicDiseaseCode() != 0 && this.ak.get(i3).getRelationToHouseholdHead() != 0) {
                    int i4 = q + 13;
                    p = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            int i6 = p + 63;
            q = i6 % 128;
            if (i6 % 2 == 0) {
                Toast.makeText(this.ag, "Please press finish button", 0).show();
                this.ao.setVisibility(1);
                return;
            } else {
                Toast.makeText(this.ag, "Please press finish button", 0).show();
                this.ao.setVisibility(0);
                return;
            }
        }
        Toast.makeText(this.ag, "Please fill all roster data", 0).show();
    }

    public final void y(List<RosterItem> list) {
        int i = 2 % 2;
        this.ac.dismiss();
        boolean z = false;
        this.ah.setLayoutManager(new LinearLayoutManager(1, false));
        if (this.ak != null) {
            for (int i2 = 0; i2 < this.ak.size(); i2++) {
                int i3 = q + 55;
                p = i3 % 128;
                if (i3 % 2 != 0) {
                    if (this.ak.get(i2).getRelationToHouseholdHead() == 9614) {
                        z = true;
                        break;
                    }
                } else {
                    if (this.ak.get(i2).getRelationToHouseholdHead() == 186) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (!z) {
            int i4 = q + 115;
            p = i4 % 128;
            int i5 = i4 % 2;
            Toast.makeText(this, "Kindly select household first!", 1).show();
        }
        aI aIVar = new aI(this, list, z, this);
        this.ai = aIVar;
        this.ah.setAdapter(aIVar);
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p + 77;
        q = i2 % 128;
        int i3 = i2 % 2;
        int id = view.getId();
        if (id == R.id.btn_save) {
            if (!this.ad.c.getBoolean("is_nadra_added", false)) {
                startActivity(new Intent(this, (Class<?>) Single_Discrepancy.class));
                finish();
                return;
            }
            this.ac.setCancelable(true);
            this.ac.setMessage("Please Wait...");
            this.ac.setProgressStyle(0);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("HHId", this.ad.c());
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ad.k()), b.b(this.ad.m())));
                byte[] bArrB = b.b(this.ad.k());
                byte[] bArrB2 = b.b(this.ad.m());
                Object[] objArr = new Object[1];
                a(getApplicationInfo().targetSdkVersion - 16, new int[]{-1378829094, 437520421, 788216541, -1295123885, 1808526841, -1622866345, 1786542068, 689541049}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                ax.h(this.ac, "Fetching Tokens!");
                ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new ai(this));
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        if (id == R.id.iv_back) {
            onBackPressed();
            return;
        }
        if (id != R.id.tv_add || this.ak == null) {
            return;
        }
        for (int i4 = 0; i4 < this.ak.size(); i4++) {
            int i5 = q + 109;
            p = i5 % 128;
            int i6 = i5 % 2;
            if (this.ak.get(i4).getRelationToHouseholdHead() == 186) {
                break;
            }
            int i7 = q + 91;
            p = i7 % 128;
            int i8 = i7 % 2;
        }
        Intent intent = new Intent(this, (Class<?>) NADRARosterListActivity.class);
        intent.putExtra("hhid", this.aq);
        intent.putExtra("message", this.ar);
        intent.putExtra("hH_Name", this.al);
        intent.putExtra("form_number", this.am);
        intent.putExtra("is_Benificiary", this.an);
        this.ap.c(intent, null);
    }

    public class OooO00o implements OooO0o<h> {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0051  */
        /* JADX WARN: Code duplicated, block: B:12:0x005d  */
        /* JADX WARN: Code duplicated, block: B:15:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:17:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:18:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:20:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r7
  0x0023: PHI (r7v2 ivas.gov.bisp.enumeration.g.h) = (r7v1 ivas.gov.bisp.enumeration.g.h), (r7v16 ivas.gov.bisp.enumeration.g.h) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        public void b(Object obj) {
            h hVar;
            ArrayList<RosterItem> arrayList;
            int i;
            aI aIVar;
            ArrayList<RosterItem> arrayList2;
            int i2;
            Object obj2;
            BISPApplication bISPApplicationC;
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 & 97) + (i5 | 97);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                hVar = (h) obj;
                int i7 = 54 / 0;
                if (hVar.d == -1) {
                    arrayList = (ArrayList) hVar.e.getSerializableExtra("rosterList");
                    int i8 = a;
                    int i9 = i8 & 33;
                    int i10 = (i8 ^ 33) | i9;
                    int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    Collections.reverse(UpdateRosterListActivity.this.ak);
                    i = b + 81;
                    a = i % 128;
                    if (i % 2 != 0) {
                        UpdateRosterListActivity.this.ak.addAll(arrayList);
                        int i13 = 70 / 0;
                    } else {
                        UpdateRosterListActivity.this.ak.addAll(arrayList);
                    }
                    int i14 = b;
                    int i15 = i14 & 33;
                    int i16 = ((i14 ^ 33) | i15) << 1;
                    int i17 = -((i14 | 33) & (~i15));
                    int i18 = (i16 & i17) + (i17 | i16);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    Collections.reverse(UpdateRosterListActivity.this.ak);
                    UpdateRosterListActivity updateRosterListActivity = UpdateRosterListActivity.this;
                    int i20 = b;
                    int i21 = (i20 & (-18)) | ((~i20) & 17);
                    int i22 = (i20 & 17) << 1;
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    aIVar = updateRosterListActivity.ai;
                    arrayList2 = updateRosterListActivity.ak;
                    i2 = b + 19;
                    a = i2 % 128;
                    obj2 = null;
                    if (i2 % 2 == 0) {
                        aIVar.g = arrayList2;
                        aIVar.a.c();
                        BISPApplication.c();
                        obj2.hashCode();
                        throw null;
                    }
                    aIVar.g = arrayList2;
                    aIVar.a.c();
                    BISPApplication.c().w = arrayList.size();
                    bISPApplicationC = BISPApplication.c();
                    i3 = b + 63;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        bISPApplicationC.v = arrayList;
                        throw null;
                    }
                    bISPApplicationC.v = arrayList;
                }
            } else {
                hVar = (h) obj;
                if (hVar.d == -1) {
                    arrayList = (ArrayList) hVar.e.getSerializableExtra("rosterList");
                    int i25 = a;
                    int i26 = i25 & 33;
                    int i110 = (i25 ^ 33) | i26;
                    int i111 = (i26 ^ i110) + ((i110 & i26) << 1);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    Collections.reverse(UpdateRosterListActivity.this.ak);
                    i = b + 81;
                    a = i % 128;
                    if (i % 2 != 0) {
                        UpdateRosterListActivity.this.ak.addAll(arrayList);
                        int i113 = 70 / 0;
                    } else {
                        UpdateRosterListActivity.this.ak.addAll(arrayList);
                    }
                    int i114 = b;
                    int i115 = i114 & 33;
                    int i116 = ((i114 ^ 33) | i115) << 1;
                    int i117 = -((i114 | 33) & (~i115));
                    int i118 = (i116 & i117) + (i117 | i116);
                    a = i118 % 128;
                    int i119 = i118 % 2;
                    Collections.reverse(UpdateRosterListActivity.this.ak);
                    UpdateRosterListActivity updateRosterListActivity2 = UpdateRosterListActivity.this;
                    int i27 = b;
                    int i28 = (i27 & (-18)) | ((~i27) & 17);
                    int i29 = (i27 & 17) << 1;
                    int i210 = ((i28 | i29) << 1) - (i29 ^ i28);
                    a = i210 % 128;
                    int i211 = i210 % 2;
                    aIVar = updateRosterListActivity2.ai;
                    arrayList2 = updateRosterListActivity2.ak;
                    i2 = b + 19;
                    a = i2 % 128;
                    obj2 = null;
                    if (i2 % 2 == 0) {
                        aIVar.g = arrayList2;
                        aIVar.a.c();
                        BISPApplication.c();
                        obj2.hashCode();
                        throw null;
                    }
                    aIVar.g = arrayList2;
                    aIVar.a.c();
                    BISPApplication.c().w = arrayList.size();
                    bISPApplicationC = BISPApplication.c();
                    i3 = b + 63;
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        bISPApplicationC.v = arrayList;
                        throw null;
                    }
                    bISPApplicationC.v = arrayList;
                }
            }
            int i30 = b;
            int i31 = ((i30 ^ 21) | (i30 & 21)) << 1;
            int i32 = -(((~i30) & 21) | (i30 & (-22)));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 11 / 0;
            }
        }
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
        Button button = (Button) findViewById(R.id.btn_save);
        this.ao = button;
        button.setVisibility(8);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        this.ag = (BISPApplication) getApplicationContext().getApplicationContext();
        ProgressDialog progressDialog = this.ac;
        if (progressDialog != null) {
            int i2 = q + 121;
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
            a(35 - View.resolveSizeAndState(0, 0, 0), new int[]{567514381, -1859070900, -1475592658, -170446719, -2056242356, 2091118841, -898793051, -98373561, 274229566, 661815761, 1950476518, -2054128824, 1592910358, -1081481777, 1497568997, -195338357, -73311918, -193051323}, objArr);
            jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new ae(this));
        } catch (JSONException unused) {
        }
        this.aj.setText(this.ad.d());
        this.ae.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.ao.setOnClickListener(this);
        int i3 = q + 101;
        p = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(int i, int[] iArr, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        d dVar = new d();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = c$s11$817;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                int i5 = $11 + 77;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                iArr4[i4] = (int) (((long) iArr3[i4]) ^ (-2705551458099060901L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = c$s11$817;
        if (iArr6 != null) {
            int i7 = $10 + 9;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (((long) iArr6[i2]) ^ (-2705551458099060901L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        dVar.a = 0;
        while (dVar.a < iArr.length) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[0] = (char) (iArr[dVar.a] >> 16);
            cArr[1] = (char) iArr[dVar.a];
            cArr[2] = (char) (iArr[dVar.a + 1] >> 16);
            cArr[3] = (char) iArr[dVar.a + 1];
            dVar.e = (cArr[0] << 16) + cArr[1];
            dVar.d = (cArr[2] << 16) + cArr[3];
            d.b(iArr5);
            for (int i10 = 0; i10 < 16; i10++) {
                dVar.e ^= iArr5[i10];
                dVar.d = d.c(dVar.e) ^ dVar.d;
                int i11 = dVar.e;
                dVar.e = dVar.d;
                dVar.d = i11;
            }
            int i12 = dVar.e;
            dVar.e = dVar.d;
            dVar.d = i12;
            dVar.d ^= iArr5[16];
            dVar.e ^= iArr5[17];
            int i13 = dVar.e;
            int i14 = dVar.d;
            cArr[0] = (char) (dVar.e >>> 16);
            cArr[1] = (char) dVar.e;
            cArr[2] = (char) (dVar.d >>> 16);
            cArr[3] = (char) dVar.d;
            d.b(iArr5);
            cArr2[dVar.a * 2] = cArr[0];
            cArr2[(dVar.a * 2) + 1] = cArr[1];
            cArr2[(dVar.a * 2) + 2] = cArr[2];
            cArr2[(dVar.a * 2) + 3] = cArr[3];
            dVar.a += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
