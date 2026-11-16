package ivas.gov.bisp.enumeration.activity.nadra;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.DashboardActivity;
import ivas.gov.bisp.enumeration.activity.TokenActivity;
import ivas.gov.bisp.enumeration.activity.UpdateSplittingRosterListActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.models.NADRARosterItem;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p038bk.bt;
import ivas.gov.bisp.enumeration.p042bo.C0198p;
import ivas.gov.bisp.enumeration.p042bo.P;
import ivas.gov.bisp.enumeration.p042bo.t;
import ivas.gov.bisp.enumeration.p042bo.z;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateNadraRosterList extends BaseTouch {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final /* synthetic */ int ac = 0;
    private static int c$s65$914 = 937766639;
    private static boolean e$s68$914 = true;
    private static int p = 0;
    private static int q = 1;
    public ImageView ad;
    public TextView ae;
    public bt af;
    public SessionManager ag;
    public List<NADRARosterItem> ah;
    public RosterItem ai;
    public RecyclerView aj;
    public BISPApplication ak;
    public ProgressDialog al;
    private static char[] b$s64$914 = {12036, 12063, 12043, 12040, 12059, 12052, 12089, 12062, 12058, 12057, 12075, 12048, 12051};
    private static boolean a$s67$914 = true;

    public class OooO implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            UpdateNadraRosterList updateNadraRosterList = UpdateNadraRosterList.this;
            Intent intent = new Intent(UpdateNadraRosterList.this, (Class<?>) DashboardActivity.class);
            int i3 = b;
            int i4 = (((i3 | 40) << 1) - (i3 ^ 40)) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            updateNadraRosterList.startActivity(intent);
            UpdateNadraRosterList.this.finish();
            dialogInterface.cancel();
            int i6 = b;
            int i7 = i6 & 47;
            int i8 = -(-((i6 ^ 47) | i7));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0(UpdateNadraRosterList updateNadraRosterList) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 45;
            int i5 = ((i3 & 45) | i4) << 1;
            int i6 = -i4;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            dialogInterface.cancel();
            int i9 = a;
            int i10 = ((i9 ^ 30) + ((i9 & 30) << 1)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooOO0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooOO0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            UpdateNadraRosterList updateNadraRosterList = UpdateNadraRosterList.this;
            Intent intent = new Intent(UpdateNadraRosterList.this, (Class<?>) TokenActivity.class);
            int i3 = a;
            int i4 = (((i3 ^ 29) | (i3 & 29)) << 1) - (((~i3) & 29) | (i3 & (-30)));
            b = i4 % 128;
            int i5 = i4 % 2;
            updateNadraRosterList.startActivity(intent);
            UpdateNadraRosterList.this.finish();
            int i6 = a;
            int i7 = (i6 & 101) + (i6 | 101);
            b = i7 % 128;
            int i8 = i7 % 2;
            dialogInterface.cancel();
            if (i8 == 0) {
                throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = q + 97;
        p = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = p + 69;
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 13;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = i2 + 71;
        q = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_update_nadra_roster_list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void x(String str, String str2) {
        int i = 2 % 2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setCancelable(true);
        builder.setPositiveButton("Retry", new OooO00o());
        builder.setNegativeButton("Cancel", new OooO0O0(this));
        builder.create().show();
        int i2 = p + 75;
        q = i2 % 128;
        int i3 = i2 % 2;
    }

    public class OooO0OO implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ag.f = BuildConfig.FLAVOR;
            Intent intent = new Intent();
            int i3 = a;
            int i4 = ((i3 ^ 87) | (i3 & 87)) << 1;
            int i5 = -(((~i3) & 87) | (i3 & (-88)));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            UpdateNadraRosterList updateNadraRosterList = UpdateNadraRosterList.this;
            int i8 = UpdateNadraRosterList.ac;
            Objects.requireNonNull(updateNadraRosterList);
            int i9 = a;
            int i10 = i9 & 71;
            int i11 = ((i9 | 71) & (~i10)) + (i10 << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            intent.putExtra("roster", (Serializable) null);
            UpdateNadraRosterList updateNadraRosterList2 = UpdateNadraRosterList.this;
            int i13 = a;
            int i14 = i13 & 123;
            int i15 = (i13 | 123) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            updateNadraRosterList2.setResult(-1, intent);
            UpdateNadraRosterList.this.finish();
            int i19 = b;
            int i20 = ((i19 | 67) << 1) - (i19 ^ 67);
            a = i20 % 128;
            int i21 = i20 % 2;
            dialogInterface.cancel();
            int i22 = a + 73;
            b = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 53 / 0;
            }
        }
    }

    public class OooO0o implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            ag.f = BuildConfig.FLAVOR;
            Intent intent = new Intent();
            int i3 = a;
            int i4 = i3 & 115;
            int i5 = ((i3 ^ 115) | i4) << 1;
            int i6 = -((i3 | 115) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            UpdateNadraRosterList updateNadraRosterList = UpdateNadraRosterList.this;
            int i9 = UpdateNadraRosterList.ac;
            Objects.requireNonNull(updateNadraRosterList);
            int i10 = a;
            int i11 = i10 & 69;
            int i12 = (i10 | 69) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            b = i14 % 128;
            Object obj = null;
            if (i14 % 2 != 0) {
                intent.putExtra("roster", (Serializable) null);
                obj.hashCode();
                throw null;
            }
            intent.putExtra("roster", (Serializable) null);
            UpdateNadraRosterList.this.setResult(-1, intent);
            UpdateNadraRosterList.this.finish();
            int i15 = a + 14;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            b = i16 % 128;
            if (i16 % 2 != 0) {
                dialogInterface.cancel();
                throw null;
            }
            dialogInterface.cancel();
            int i17 = b + 3;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b + 13;
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                UpdateNadraRosterList.this.ag.r();
                throw null;
            }
            UpdateNadraRosterList updateNadraRosterList = UpdateNadraRosterList.this;
            String strR = updateNadraRosterList.ag.r();
            int i4 = a;
            int i5 = i4 & 113;
            int i6 = (((i4 | 113) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                UpdateNadraRosterList.this.ag.c();
                obj.hashCode();
                throw null;
            }
            updateNadraRosterList.u(strR, UpdateNadraRosterList.this.ag.c());
            dialogInterface.cancel();
            int i7 = a;
            int i8 = (i7 ^ 13) + ((i7 & 13) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 31 / 0;
            }
        }
    }

    public final void u(String str, String str2) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("Cnic", str);
            jSONObject.put("HHId", str2);
            jSONObject.put("SessionId", BISPApplication.c().s);
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.ag.r());
            jSONObject.put("Type", "update");
            jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ag.k()), b.b(this.ag.m())));
            ax.h(this.al, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", new C0198p(this));
            int i2 = p + 91;
            q = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (r5.ag.n().equals(net.sqlcipher.BuildConfig.FLAVOR) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        w(ivas.gov.bisp.enumeration.bK.b.c(r5.ag.n(), ivas.gov.bisp.enumeration.bK.b.b(r5.ag.k()), ivas.gov.bisp.enumeration.bK.b.b(r5.ag.m())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ad, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
    
        u(r5.ag.r(), r5.ag.c());
        r1 = ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList.p + 125;
        ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList.q = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c6, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007d, code lost:
    
        if (r5.ag.n().equals(net.sqlcipher.BuildConfig.FLAVOR) == false) goto L11;
     */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.nadra.UpdateNadraRosterList.t():void");
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        double dC;
        String str4 = "female";
        int i3 = 2;
        int i4 = 2 % 2;
        int id = view.getId();
        if (id == R.id.iv_back) {
            onBackPressed();
            return;
        }
        if (id == R.id.tv_add) {
            String str5 = "male";
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                String ipAddress = Formatter.formatIpAddress(((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
                this.ak = (BISPApplication) getApplicationContext();
                jSONObject.put("house_hold_id", this.ag.c());
                jSONObject.put("is_pmt", 0);
                jSONObject.put("type", "add_roster");
                JSONArray jSONArray = new JSONArray();
                int size = this.af.h().size();
                int i5 = 0;
                while (i5 < size) {
                    String martial_Status = this.af.h().get(i5).getMartial_Status();
                    if (martial_Status.equalsIgnoreCase("Widowed")) {
                        i = 202;
                    } else if (!(!martial_Status.equalsIgnoreCase("Married"))) {
                        i = 201;
                    } else if (!(!martial_Status.equalsIgnoreCase("Unmarried"))) {
                        int i6 = q + 89;
                        p = i6 % 128;
                        int i7 = i6 % i3;
                        i = 200;
                    } else if (martial_Status.equalsIgnoreCase("divorced")) {
                        int i8 = p + 23;
                        q = i8 % 128;
                        i = i8 % i3 == 0 ? 28032 : 203;
                    } else {
                        i = 204;
                    }
                    if (this.af.h().get(i5).getGender().equalsIgnoreCase(str5)) {
                        str = str5;
                    } else {
                        str = this.af.h().get(i5).getGender().equalsIgnoreCase(str4) ? str4 : BuildConfig.FLAVOR;
                    }
                    if (!this.af.h().get(i5).getDisability().equalsIgnoreCase("t")) {
                        int i9 = q + 117;
                        p = i9 % 128;
                        int i10 = i9 % i3;
                        i2 = this.af.h().get(i5).getDisability().equalsIgnoreCase(BuildConfig.FLAVOR) ? 1 : 6;
                    }
                    try {
                        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.af.h().get(i5).getAge());
                        Calendar calendar = Calendar.getInstance();
                        str3 = str5;
                        try {
                            calendar.setTimeInMillis(date.getTime());
                            str2 = str4;
                            try {
                                dC = ag.c(calendar.get(5), calendar.get(2), calendar.get(1));
                            } catch (ParseException unused) {
                                dC = 0.0d;
                            }
                        } catch (ParseException unused2) {
                            str2 = str4;
                        }
                    } catch (ParseException unused3) {
                        str2 = str4;
                        str3 = str5;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    int i11 = size;
                    jSONObject3.put("rId", 0);
                    jSONObject3.put("cnicEnc", this.af.h().get(i5).getCitizen_number());
                    jSONObject3.put("cnic", this.af.h().get(i5).getCitizen_number());
                    jSONObject3.put("hhMemberNames", this.af.h().get(i5).getName());
                    jSONObject3.put("hhMemberNamesEnc", this.af.h().get(i5).getName());
                    jSONObject3.put("dob", this.af.h().get(i5).getAge());
                    jSONObject3.put("age", dC);
                    jSONObject3.put("maritalStatus", BuildConfig.FLAVOR);
                    jSONObject3.put("maritalStatusCode", i);
                    jSONObject3.put("gender", str);
                    jSONObject3.put("relationToHhHead", 0);
                    jSONObject3.put("formNo", this.ag.j());
                    jSONObject3.put("disabilityStatus", BuildConfig.FLAVOR);
                    jSONObject3.put("disabilityCode", i2);
                    jSONObject3.put("havingChronicDiseaseCode", 0);
                    jSONObject3.put("isLiterate", BuildConfig.FLAVOR);
                    jSONObject3.put("goneToSchoolCode", 0);
                    jSONObject3.put("educationLevelCode", 0);
                    jSONObject3.put("workStatusCode", 0);
                    jSONObject3.put("workStatus", BuildConfig.FLAVOR);
                    jSONObject3.put("lastWeekWorkingHours", 0);
                    jSONObject3.put("employmentCode", 0);
                    jSONObject3.put("employmentStatus", BuildConfig.FLAVOR);
                    jSONObject3.put("endBy", this.ag.z());
                    jSONObject3.put("endByIp", ipAddress);
                    jSONObject3.put("relation", 0);
                    jSONObject3.put("update_type", "add_roster");
                    jSONArray.put(i5, jSONObject3);
                    RosterItem rosterItem = new RosterItem(this.ag.c(), false, BuildConfig.FLAVOR, this.ag.c.getString("k_hh_name", BuildConfig.FLAVOR), this.af.h().get(i5).getCitizen_number(), i2, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.af.h().get(i5).getAge(), 0, 0, BuildConfig.FLAVOR, this.ag.j(), str, 0, 0, BuildConfig.FLAVOR, false, 0, BuildConfig.FLAVOR, i, BuildConfig.FLAVOR, 0, 0L, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    this.ai = rosterItem;
                    BISPApplication bISPApplication = this.ak;
                    if (bISPApplication != null) {
                        bISPApplication.N.add(rosterItem);
                        i3 = 2;
                    } else {
                        BISPApplication bISPApplication2 = (BISPApplication) getApplicationContext();
                        this.ak = bISPApplication2;
                        bISPApplication2.N.add(this.ai);
                        int i12 = q + 61;
                        p = i12 % 128;
                        i3 = 2;
                        int i13 = i12 % 2;
                    }
                    i5++;
                    str5 = str3;
                    str4 = str2;
                    size = i11;
                }
                jSONObject.put("rosterList", jSONArray);
                this.al.setCancelable(false);
                this.al.setMessage("Please Wait...");
                this.al.setProgressStyle(0);
                this.al.show();
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ag.k()), b.b(this.ag.m())));
                byte[] bArrB = b.b(this.ag.k());
                byte[] bArrB2 = b.b(this.ag.m());
                Object[] objArr = new Object[1];
                a(getPackageName().codePointAt(14) + 26, null, new byte[]{-115, -116, -124, -123, -122, -117, -118, -122, -123, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                t tVar = new t(this, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new z(this), new P(this));
                tVar.m = new ivas.gov.bisp.enumeration.p022av.z(130000, 0, 0.0f);
                tVar.k = false;
                a.b(this).c(tVar);
            } catch (JSONException unused4) {
            }
        }
    }

    public final void w(String str) {
        String str2;
        String string;
        int i = 2 % 2;
        try {
            this.ah = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("code")) {
                x("Fetching Data", "Problem in Fetching Data");
                return;
            }
            if (jSONObject.isNull("code".toLowerCase())) {
                x("Fetching Data", "Problem in Fetching Data");
                return;
            }
            int i2 = jSONObject.getInt("code");
            Object obj = null;
            if (i2 != 200) {
                if (i2 != 0) {
                    x("Fetching Data", "Problem in Fetching Data");
                    return;
                }
                int i3 = q + 79;
                p = i3 % 128;
                if (i3 % 2 == 0) {
                    x("Fetching Data", "Problem in Fetching Data");
                    return;
                }
                x("Fetching Data", "Problem in Fetching Data");
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = jSONObject.getString("message".toLowerCase());
            if (!jSONObject.has("familyMembers".toLowerCase())) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Exist in NSER");
                builder.setMessage("Do you want to update Rosters?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new OooO());
                builder.setNegativeButton("no", new OooOO0());
                builder.create().show();
                return;
            }
            if (jSONObject.isNull("familyMembers".toLowerCase())) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setTitle("CNIC NOT REGISTERED");
                builder2.setMessage(" This CNIC : null is Not Registered in NADRA");
                builder2.setCancelable(false);
                builder2.setPositiveButton("OK", new OooO0o());
                builder2.create().show();
                int i4 = q + 97;
                p = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("familyMembers".toLowerCase());
            int length = jSONArray.length();
            if (!(!string2.equalsIgnoreCase("Cnic Data Found In Nadra"))) {
                int i6 = q + 53;
                p = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                if (length != 0) {
                    for (int i7 = 0; i7 < length; i7++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                        boolean zHas = jSONObject2.has("name".toLowerCase());
                        String string3 = BuildConfig.FLAVOR;
                        String string4 = zHas ? jSONObject2.getString("relation".toLowerCase()) : BuildConfig.FLAVOR;
                        String string5 = jSONObject2.has("name".toLowerCase()) ? jSONObject2.getString("name".toLowerCase()) : BuildConfig.FLAVOR;
                        String string6 = jSONObject2.has("englishname".toLowerCase()) ? jSONObject2.getString("englishname".toLowerCase()) : BuildConfig.FLAVOR;
                        String string7 = jSONObject2.has("citizenNumber".toLowerCase()) ? jSONObject2.getString("citizenNumber".toLowerCase()) : BuildConfig.FLAVOR;
                        String string8 = jSONObject2.has("cardStatus".toLowerCase()) ? jSONObject2.getString("cardStatus".toLowerCase()) : BuildConfig.FLAVOR;
                        if (jSONObject2.has("gender".toLowerCase())) {
                            int i8 = q + 23;
                            p = i8 % 128;
                            if (i8 % 2 != 0) {
                                string = jSONObject2.getString("gender".toLowerCase());
                                int i9 = 70 / 0;
                            } else {
                                string = jSONObject2.getString("gender".toLowerCase());
                            }
                            str2 = string;
                        } else {
                            str2 = BuildConfig.FLAVOR;
                        }
                        String string9 = jSONObject2.has("age".toLowerCase()) ? jSONObject2.getString("age".toLowerCase()) : BuildConfig.FLAVOR;
                        String string10 = !(jSONObject2.has("martial_Status".toLowerCase()) ^ true) ? jSONObject2.getString("martial_Status".toLowerCase()) : BuildConfig.FLAVOR;
                        if (jSONObject2.has("disability".toLowerCase())) {
                            string3 = jSONObject2.getString("disability".toLowerCase());
                        }
                        this.ah.add(new NADRARosterItem(string4, string8, string7, string5, string6, str2, string9, string10, string3));
                        List<NADRARosterItem> list = this.ah;
                        this.aj.setLayoutManager(new LinearLayoutManager(1, false));
                        bt btVar = new bt(this, list);
                        this.af = btVar;
                        this.aj.setAdapter(btVar);
                    }
                    return;
                }
            }
            AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
            builder3.setTitle("CNIC NOT REGISTERED");
            builder3.setMessage(" This CNIC : null is Not Registered in NADRA");
            builder3.setCancelable(false);
            builder3.setPositiveButton("OK", new OooO0OO());
            builder3.create().show();
        } catch (Exception unused) {
            Toast.makeText(this, "Error : No Family Members Return", 0).show();
            Toast.makeText(this, "Please Enter Another CNIC", 0).show();
            startActivity(new Intent(this, (Class<?>) UpdateSplittingRosterListActivity.class));
            finish();
        }
    }

    private static void a(int i, char[] cArr, byte[] bArr, int[] iArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr2 = b$s64$914;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr3[i4] = (char) (((long) cArr2[i4]) ^ 1962356595541487140L);
            }
            cArr2 = cArr3;
        }
        int i5 = (int) (1962356595541487140L ^ ((long) c$s65$914));
        if (e$s68$914) {
            int i6 = $11 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            lVar.d = bArr.length;
            char[] cArr4 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                int i8 = $11 + 25;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[lVar.a] = (char) (cArr2[bArr[lVar.d % lVar.a] + i] - i5);
                    i2 = lVar.a;
                } else {
                    cArr4[lVar.a] = (char) (cArr2[bArr[(lVar.d - 1) - lVar.a] + i] - i5);
                    i2 = lVar.a + 1;
                }
                lVar.a = i2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (a$s67$914) {
            lVar.d = cArr.length;
            char[] cArr5 = new char[lVar.d];
            lVar.a = 0;
            while (lVar.a < lVar.d) {
                int i9 = $11 + 121;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[lVar.a] = (char) (cArr2[cArr[(lVar.d - 1) - lVar.a] - i] - i5);
                lVar.a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        lVar.d = iArr.length;
        char[] cArr6 = new char[lVar.d];
        lVar.a = 0;
        while (lVar.a < lVar.d) {
            cArr6[lVar.a] = (char) (cArr2[iArr[(lVar.d - 1) - lVar.a] - i] - i5);
            lVar.a++;
            int i11 = $11 + 55;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr6);
    }
}
