package ivas.gov.bisp.enumeration.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.p022av.N;
import ivas.gov.bisp.enumeration.p022av.z;
import ivas.gov.bisp.enumeration.p023aw.a;
import ivas.gov.bisp.enumeration.p036bi.aM;
import ivas.gov.bisp.enumeration.p036bi.aN;
import ivas.gov.bisp.enumeration.p036bi.aW;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UpdateElectricityGassRefActivity extends BaseTouch {
    private static int p = 1;
    private static int q;
    public ImageView ac;
    public TextView ad;
    public SessionManager ae;
    public ProgressDialog af;
    public EditText ag;
    public EditText ai;
    public ImageView ak;
    public String ah = BuildConfig.FLAVOR;
    public String aj = BuildConfig.FLAVOR;
    public boolean al = false;

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 75;
        int i4 = (i2 ^ 75) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        q = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i6 = (i2 & (-12)) | ((~i2) & 11);
        int i7 = -(-((i2 & 11) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        q = i8 % 128;
        if (i8 % 2 == 0) {
            return R.layout.activity_electricity_gas_meter_update;
        }
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) DashboardActivity.class);
        int i2 = p;
        int i3 = (-2) - (((i2 & 30) + (i2 | 30)) ^ (-1));
        q = i3 % 128;
        if (i3 % 2 != 0) {
            startActivity(intent);
            finish();
            int i4 = 18 / 0;
        } else {
            startActivity(intent);
            finish();
        }
        int i5 = q;
        int i6 = i5 ^ 11;
        int i7 = ((i5 & 11) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        p = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        int i = 2 % 2;
        super.t();
        this.ae = new SessionManager(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        int i2 = q;
        int i3 = ((i2 & (-26)) | ((~i2) & 25)) + ((i2 & 25) << 1);
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.af = progressDialog;
            ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
            findViewById(R.id.iv_back);
            obj.hashCode();
            throw null;
        }
        this.af = progressDialog;
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)");
        View viewFindViewById = findViewById(R.id.iv_back);
        int i4 = q;
        int i5 = i4 & 25;
        int i6 = (i5 - (~((i4 ^ 25) | i5))) - 1;
        p = i6 % 128;
        if (i6 % 2 == 0) {
            this.ac = (ImageView) viewFindViewById;
            this.ad = (TextView) findViewById(R.id.btn_update);
            throw null;
        }
        this.ac = (ImageView) viewFindViewById;
        this.ad = (TextView) findViewById(R.id.btn_update);
        int i7 = q;
        int i8 = (i7 | 117) << 1;
        int i9 = -(i7 ^ 117);
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        p = i10 % 128;
        int i11 = i10 % 2;
        this.ak = (ImageView) findViewById(R.id.img_edit);
        this.ag = (EditText) findViewById(R.id.et_electricity_ref);
        int i12 = p;
        int i13 = i12 ^ 103;
        int i14 = ((i12 & 103) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        q = i16 % 128;
        if (i16 % 2 != 0) {
            this.ai = (EditText) findViewById(R.id.et_gas_ref);
            this.ac.setOnClickListener(this);
            int i17 = 27 / 0;
        } else {
            this.ai = (EditText) findViewById(R.id.et_gas_ref);
            this.ac.setOnClickListener(this);
        }
        this.ad.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.af.setCancelable(false);
        int i18 = q;
        int i19 = (((i18 ^ 123) | (i18 & 123)) << 1) - (((~i18) & 123) | (i18 & (-124)));
        p = i19 % 128;
        int i20 = i19 % 2;
        this.af.setMessage("Please Wait...");
        this.af.setProgressStyle(0);
        String str = this.ah;
        int i21 = p;
        int i22 = (i21 & (-80)) | ((~i21) & 79);
        int i23 = (i21 & 79) << 1;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        q = i24 % 128;
        int i25 = i24 % 2;
        u(false, str, this.aj);
        int i26 = p + 105;
        q = i26 % 128;
        int i27 = i26 % 2;
    }

    public final void u(boolean z, String str, String str2) {
        String str3;
        String string;
        byte[] bArrB;
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 119;
        int i4 = ((((i2 ^ 119) | i3) << 1) - (~(-((i2 | 119) & (~i3))))) - 1;
        int i5 = i4 % 128;
        q = i5;
        int i6 = i4 % 2;
        if (!(!z)) {
            int i7 = (i5 & (-100)) | ((~i5) & 99);
            int i8 = -(-((i5 & 99) << 1));
            int i9 = (i7 & i8) + (i8 | i7);
            int i10 = i9 % 128;
            p = i10;
            int i11 = i9 % 2;
            int i12 = (-2) - ((((i10 | 32) << 1) - (i10 ^ 32)) ^ (-1));
            q = i12 % 128;
            int i13 = i12 % 2;
            str3 = "UpdateMeterNo";
        } else {
            int i14 = i5 & 119;
            int i15 = ((i5 | 119) & (~i14)) + (i14 << 1);
            p = i15 % 128;
            int i16 = i15 % 2;
            str3 = "GetMeterNo";
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i17 = q + 73;
        p = i17 % 128;
        try {
            if (i17 % 2 == 0) {
                jSONObject.put("hH_ID", this.ae.c());
                throw null;
            }
            jSONObject.put("hH_ID", this.ae.c());
            if (z) {
                int i18 = q + 1;
                p = i18 % 128;
                int i19 = i18 % 2;
                jSONObject.put("electricityRefNo", str);
                int i20 = q;
                int i21 = (((i20 | 22) << 1) - (i20 ^ 22)) - 1;
                p = i21 % 128;
                if (i21 % 2 == 0) {
                    jSONObject.put("gasRefNo", str2);
                    int i22 = 84 / 0;
                } else {
                    jSONObject.put("gasRefNo", str2);
                }
                int i23 = q;
                int i24 = i23 ^ 47;
                int i25 = -(-((i23 & 47) << 1));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                p = i26 % 128;
                int i27 = i26 % 2;
            }
            this.af.setCancelable(false);
            this.af.setMessage("Please Wait...");
            this.af.setProgressStyle(0);
            int i28 = q;
            int i29 = i28 & 89;
            int i30 = ((i28 ^ 89) | i29) << 1;
            int i31 = -((i28 | 89) & (~i29));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            p = i32 % 128;
            if (i32 % 2 == 0) {
                this.af.show();
                string = jSONObject.toString();
                bArrB = b.b(this.ae.k());
                int i33 = 90 / 0;
            } else {
                this.af.show();
                string = jSONObject.toString();
                bArrB = b.b(this.ae.k());
            }
            String strD = b.d(string, bArrB, b.b(this.ae.m()));
            int i34 = q;
            int i35 = i34 & 87;
            int i36 = -(-((i34 ^ 87) | i35));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            p = i37 % 128;
            if (i37 % 2 == 0) {
                jSONObject2.put("string1", strD);
                b.b(this.ae.k());
                throw null;
            }
            jSONObject2.put("string1", strD);
            jSONObject2.put("string2", b.d(str3, b.b(this.ae.k()), b.b(this.ae.m())));
            aW aWVar = new aW(this, 1, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", jSONObject2, new aM(this, z), new aN(this));
            aWVar.m = new z(130000, 0, 0.0f);
            aWVar.k = false;
            N nB = a.b(this);
            int i38 = q;
            int i39 = i38 & 49;
            int i40 = ((i38 | 49) & (~i39)) + (i39 << 1);
            p = i40 % 128;
            if (i40 % 2 == 0) {
                nB.c(aWVar);
                int i41 = 71 / 0;
            } else {
                nB.c(aWVar);
            }
            int i42 = p + 101;
            q = i42 % 128;
            int i43 = i42 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r9 == ivas.gov.bisp.enumeration.R.id.iv_back) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r2 = r1 & 65;
        r9 = ((r1 ^ 65) | r2) << 1;
        r1 = -((r1 | 65) & (~r2));
        r2 = ((r9 | r1) << 1) - (r9 ^ r1);
        ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity.p = r2 % 128;
        r2 = r2 % 2;
        onBackPressed();
        r9 = ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity.q;
        r1 = (r9 & 106) + (r9 | 106);
        r9 = (r1 ^ (-1)) + (r1 << 1);
        ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity.p = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r9 == ivas.gov.bisp.enumeration.R.id.iv_back) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.UpdateElectricityGassRefActivity.onClick(android.view.View):void");
    }
}
