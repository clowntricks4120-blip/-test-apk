package ivas.gov.bisp.enumeration.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.cardview.widget.CardView;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.updatecnic.activity.UpdateCNICActivity;
import ivas.gov.bisp.enumeration.activitybase.BaseTouch;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.A;
import ivas.gov.bisp.enumeration.p036bi.C;
import ivas.gov.bisp.enumeration.p036bi.DialogInterfaceOnClickListenerC0193v;
import ivas.gov.bisp.enumeration.p036bi.L;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import o.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DashboardActivity extends BaseTouch {
    public static final /* synthetic */ int ac = 0;
    private static int p = 0;
    private static int q = 1;
    public final String ad = DashboardActivity.class.getName();
    public BISPApplication ae;
    public SessionManager af;
    public ImageView ag;
    public CardView ah;
    public CardView ai;
    public CardView aj;
    public CardView ak;
    public CardView al;
    public ProgressDialog am;

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0(DashboardActivity dashboardActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b + 111;
            a = i3 % 128;
            int i4 = i3 % 2;
            dialogInterface.cancel();
            int i5 = a;
            int i6 = ((i5 & (-4)) | ((~i5) & 3)) + ((i5 & 3) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (((i2 | 112) << 1) - (i2 ^ 112)) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        if (this.ae.t) {
            int i5 = p;
            int i6 = ((i5 & (-50)) | ((~i5) & 49)) + ((i5 & 49) << 1);
            q = i6 % 128;
            int i7 = i6 % 2;
            this.ai.setVisibility(8);
            int i8 = (-2) - ((p + 52) ^ (-1));
            q = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 2;
            }
        }
        int i10 = p;
        int i11 = i10 & 121;
        int i12 = ((((i10 ^ 121) | i11) << 1) - (~(-((i10 | 121) & (~i11))))) - 1;
        q = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public int p() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 & (-76)) | ((~i2) & 75)) + ((i2 & 75) << 1);
        int i4 = i3 % 128;
        q = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 71;
        int i7 = ((i4 ^ 71) | i6) << 1;
        int i8 = -((i4 | 71) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        p = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 38 / 0;
        }
        return R.layout.activity_dashboard;
    }

    public final void A() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 89;
        int i4 = (i2 | 89) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
        this.aj.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        int i8 = q + 57;
        p = i8 % 128;
        if (i8 % 2 != 0) {
            this.ak.setOnClickListener(this);
            this.al.setOnClickListener(this);
            int i9 = 58 / 0;
        } else {
            this.ak.setOnClickListener(this);
            this.al.setOnClickListener(this);
        }
        this.ai.setVisibility(8);
        this.ak.setVisibility(0);
        int i10 = q + 5;
        p = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 82 / 0;
        }
    }

    public static void v(DashboardActivity dashboardActivity, String str, String str2) {
        AlertController.OooO0O0 oooO0O0;
        int i = 2 % 2;
        Objects.requireNonNull(dashboardActivity);
        b.aIz aiz = new b.aIz(dashboardActivity);
        int i2 = p;
        int i3 = ((((i2 ^ 109) | (i2 & 109)) << 1) - (~(-(((~i2) & 109) | (i2 & (-110)))))) - 1;
        q = i3 % 128;
        if (i3 % 2 == 0) {
            oooO0O0 = aiz.a;
            oooO0O0.e = str;
            int i4 = 1 / 0;
        } else {
            oooO0O0 = aiz.a;
            oooO0O0.e = str;
        }
        int i5 = p;
        int i6 = i5 & 87;
        int i7 = (i6 - (~(-(-((i5 ^ 87) | i6))))) - 1;
        q = i7 % 128;
        if (i7 % 2 == 0) {
            oooO0O0.f = str2;
            oooO0O0.k = false;
        } else {
            oooO0O0.f = str2;
            oooO0O0.k = true;
        }
        DialogInterfaceOnClickListenerC0193v dialogInterfaceOnClickListenerC0193v = new DialogInterfaceOnClickListenerC0193v(dashboardActivity);
        oooO0O0.h = "Retry";
        oooO0O0.i = dialogInterfaceOnClickListenerC0193v;
        A a = new A(dashboardActivity);
        int i8 = p + 29;
        q = i8 % 128;
        if (i8 % 2 == 0) {
            oooO0O0.a = "Cancel";
            oooO0O0.j = a;
            int i9 = 83 / 0;
        } else {
            oooO0O0.a = "Cancel";
            oooO0O0.j = a;
        }
        aiz.b().show();
        int i10 = q;
        int i11 = i10 ^ 107;
        int i12 = (((i10 & 107) | i11) << 1) - i11;
        p = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseTouch, ivas.gov.bisp.enumeration.activitybase.BaseAuth
    public void t() {
        CardView cardView;
        int i = 2 % 2;
        super.t();
        this.ae = (BISPApplication) getApplicationContext();
        this.af = new SessionManager(this);
        this.am = new ProgressDialog(this);
        View viewFindViewById = findViewById(R.id.application_version_textView);
        int i2 = q;
        int i3 = i2 & 69;
        int i4 = (i2 ^ 69) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        p = i5 % 128;
        int i6 = i5 % 2;
        ((TextView) viewFindViewById).setText("v7.6 (LIVE)");
        this.ag = (ImageView) findViewById(R.id.iv_back);
        int i7 = p;
        int i8 = ((i7 & (-78)) | ((~i7) & 77)) + ((i7 & 77) << 1);
        q = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            this.ah = (CardView) findViewById(R.id.cv_basic_info);
            findViewById(R.id.cv_cnic);
            obj.hashCode();
            throw null;
        }
        this.ah = (CardView) findViewById(R.id.cv_basic_info);
        this.aj = (CardView) findViewById(R.id.cv_cnic);
        this.ai = (CardView) findViewById(R.id.cv_disability);
        int i9 = q;
        int i10 = i9 & 41;
        int i11 = (i9 ^ 41) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        p = i12 % 128;
        if (i12 % 2 != 0) {
            this.ak = (CardView) findViewById(R.id.cv_roster);
            cardView = (CardView) findViewById(R.id.cv_electricity_gass_bill);
            int i13 = 61 / 0;
        } else {
            this.ak = (CardView) findViewById(R.id.cv_roster);
            cardView = (CardView) findViewById(R.id.cv_electricity_gass_bill);
        }
        int i14 = p;
        int i15 = i14 & 7;
        int i16 = i15 + ((i14 ^ 7) | i15);
        q = i16 % 128;
        int i17 = i16 % 2;
        this.al = cardView;
        this.ag.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        int i18 = q;
        int i19 = (-2) - ((((i18 | 90) << 1) - (i18 ^ 90)) ^ (-1));
        p = i19 % 128;
        int i20 = i19 % 2;
        if (this.af.n().equals(BuildConfig.FLAVOR)) {
            z(this.af.r());
            int i21 = p + 23;
            q = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 5 / 0;
                return;
            }
            return;
        }
        int i23 = p;
        int i24 = i23 & 3;
        int i25 = i23 | 3;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        q = i26 % 128;
        if (i26 % 2 == 0) {
            A();
            throw null;
        }
        A();
        int i27 = q;
        int i28 = i27 & 47;
        int i29 = (i27 ^ 47) | i28;
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        p = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 2 / 0;
        }
    }

    public static void w(DashboardActivity dashboardActivity) {
        int i = 2 % 2;
        Objects.requireNonNull(dashboardActivity);
        Intent intent = new Intent(dashboardActivity, (Class<?>) TokenActivity.class);
        int i2 = p;
        int i3 = i2 ^ 99;
        int i4 = -(-((i2 & 99) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        q = i5 % 128;
        int i6 = i5 % 2;
        dashboardActivity.startActivity(intent);
        dashboardActivity.finishAffinity();
        int i7 = p;
        int i8 = i7 & 113;
        int i9 = ((i7 | 113) & (~i8)) + (i8 << 1);
        q = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 ^ 19) | (i2 & 19)) << 1;
        int i4 = -(((~i2) & 19) | (i2 & (-20)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        q = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        switch (view.getId()) {
            case R.id.cv_basic_info /* 2131362059 */:
                Intent intent = new Intent(this, (Class<?>) AddressActivity.class);
                int i7 = q;
                int i8 = ((i7 ^ 18) + ((i7 & 18) << 1)) - 1;
                p = i8 % 128;
                if (i8 % 2 != 0) {
                    startActivity(intent);
                    finish();
                    obj.hashCode();
                    throw null;
                }
                startActivity(intent);
                finish();
                int i9 = q;
                int i10 = i9 & 73;
                int i11 = -(-((i9 ^ 73) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                p = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 76 / 0;
                    return;
                }
                return;
            case R.id.cv_cnic /* 2131362061 */:
                startActivity(new Intent(this, (Class<?>) UpdateCNICActivity.class));
                int i14 = p;
                int i15 = ((i14 | 111) << 1) - (i14 ^ 111);
                q = i15 % 128;
                int i16 = i15 % 2;
                finish();
                int i17 = p;
                int i18 = i17 & 37;
                int i19 = (i18 - (~(-(-((i17 ^ 37) | i18))))) - 1;
                q = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 64 / 0;
                    return;
                }
                return;
            case R.id.cv_electricity_gass_bill /* 2131362069 */:
                Intent intent2 = new Intent(this, (Class<?>) UpdateElectricityGassRefActivity.class);
                int i21 = p;
                int i22 = i21 ^ 101;
                int i23 = ((i21 & 101) | i22) << 1;
                int i24 = -i22;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                q = i25 % 128;
                int i26 = i25 % 2;
                startActivity(intent2);
                finish();
                int i27 = p;
                int i28 = i27 & 93;
                int i29 = -(-(i27 | 93));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                q = i30 % 128;
                int i31 = i30 % 2;
                return;
            case R.id.iv_back /* 2131362305 */:
                onBackPressed();
                int i32 = q;
                int i33 = i32 ^ 105;
                int i34 = ((i32 & 105) | i33) << 1;
                int i35 = -i33;
                int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
                p = i36 % 128;
                if (i36 % 2 != 0) {
                    throw null;
                }
                return;
            default:
                int i37 = q;
                int i38 = (i37 & 13) + (i37 | 13);
                p = i38 % 128;
                if (i38 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        b.aIz aiz = new b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i2 = p;
        int i3 = i2 & 23;
        int i4 = i3 + ((i2 ^ 23) | i3);
        q = i4 % 128;
        int i5 = i4 % 2;
        oooO0O0.e = "Alert!";
        oooO0O0.f = "Do you wants to exit form Dashboard";
        oooO0O0.k = false;
        OooO00o oooO00o = new OooO00o();
        int i6 = q;
        int i7 = (i6 | 27) << 1;
        int i8 = -(((~i6) & 27) | (i6 & (-28)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        p = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            oooO0O0.h = "yes";
            oooO0O0.i = oooO00o;
            throw null;
        }
        oooO0O0.h = "yes";
        oooO0O0.i = oooO00o;
        OooO0O0 oooO0O1 = new OooO0O0(this);
        int i10 = p;
        int i11 = i10 & 15;
        int i12 = ((((i10 ^ 15) | i11) << 1) - (~(-((i10 | 15) & (~i11))))) - 1;
        q = i12 % 128;
        if (i12 % 2 == 0) {
            oooO0O0.a = "no";
            oooO0O0.j = oooO0O1;
            aiz.b();
            obj.hashCode();
            throw null;
        }
        oooO0O0.a = "no";
        oooO0O0.j = oooO0O1;
        b bVarB = aiz.b();
        int i13 = q;
        int i14 = i13 & 9;
        int i15 = -(-((i13 ^ 9) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        p = i16 % 128;
        int i17 = i16 % 2;
        bVarB.show();
        int i18 = q;
        int i19 = i18 ^ 3;
        int i20 = ((i18 & 3) | i19) << 1;
        int i21 = -i19;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        p = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 87 / 0;
        }
    }

    public static void u(DashboardActivity dashboardActivity, String str, String str2, boolean z) {
        int i = 2 % 2;
        Objects.requireNonNull(dashboardActivity);
        AlertDialog.Builder builder = new AlertDialog.Builder(dashboardActivity);
        int i2 = p;
        int i3 = ((((i2 ^ 115) | (i2 & 115)) << 1) - (~(-(((~i2) & 115) | (i2 & (-116)))))) - 1;
        q = i3 % 128;
        int i4 = i3 % 2;
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setCancelable(true);
        ivas.gov.bisp.enumeration.p036bi.R r = new ivas.gov.bisp.enumeration.p036bi.R(dashboardActivity, z);
        int i5 = p + 14;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
        builder.setPositiveButton("Ok", r);
        builder.create().show();
        int i8 = q;
        int i9 = i8 & 33;
        int i10 = i9 + ((i8 ^ 33) | i9);
        p = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void z(String str) {
        int i = 2 % 2;
        Log.e(this.ad, "createJSON: Nadra Family call");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = p;
        int i3 = ((i2 & (-90)) | ((~i2) & 89)) + ((i2 & 89) << 1);
        q = i3 % 128;
        int i4 = i3 % 2;
        try {
            jSONObject.put("Cnic", str);
            jSONObject.put("HHId", this.af.c());
            int i5 = p;
            int i6 = i5 ^ 11;
            int i7 = (((i5 & 11) | i6) << 1) - i6;
            q = i7 % 128;
            int i8 = i7 % 2;
            jSONObject.put("SessionId", BISPApplication.c().s);
            int i9 = q;
            int i10 = i9 & 115;
            int i11 = (i9 | 115) & (~i10);
            int i12 = i10 << 1;
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            p = i13 % 128;
            int i14 = i13 % 2;
            jSONObject.put("IpAddress", ac.h(true));
            jSONObject.put("sessionUserCnic", this.af.r());
            int i15 = q;
            int i16 = i15 & 103;
            int i17 = -(-((i15 ^ 103) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            p = i18 % 128;
            Object obj = null;
            if (i18 % 2 != 0) {
                jSONObject.put("Type", "update");
                jSONObject.toString();
                this.af.k();
                obj.hashCode();
                throw null;
            }
            jSONObject.put("Type", "update");
            String string = jSONObject.toString();
            String strK = this.af.k();
            int i19 = p;
            int i20 = i19 | 41;
            int i21 = i20 << 1;
            int i22 = -((~(i19 & 41)) & i20);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            q = i23 % 128;
            int i24 = i23 % 2;
            byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(strK);
            byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(this.af.m());
            int i25 = p;
            int i26 = i25 & 79;
            int i27 = (i25 ^ 79) | i26;
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            q = i28 % 128;
            int i29 = i28 % 2;
            jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(string, bArrB, bArrB2));
            ax.h(this.am, "Please wait!");
            ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Roster/V8MVu3ODp1hu5Dw3DWwA", new L(this));
            int i30 = p;
            int i31 = i30 & 45;
            int i32 = ((i30 | 45) & (~i31)) + (i31 << 1);
            q = i32 % 128;
            if (i32 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 0;
        private static int[] c$s11$32 = {-1207663274, -567379189, -303954624, 1275420505, 2062931516, 441268521, -641792373, -1217123362, 498978194, -1878133, -900412260, -656594863, -975916307, 512790370, 1580244700, -1668983678, -1007060336, -599432221};
        private static int d = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            DashboardActivity dashboardActivity = DashboardActivity.this;
            int i3 = DashboardActivity.ac;
            Objects.requireNonNull(dashboardActivity);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("CenterCode", dashboardActivity.af.e());
                jSONObject.put("Cnic", dashboardActivity.af.c.getString("token_cnic", BuildConfig.FLAVOR));
                jSONObject2.put("string1", ivas.gov.bisp.enumeration.bK.b.d(jSONObject.toString(), ivas.gov.bisp.enumeration.bK.b.b(dashboardActivity.af.k()), ivas.gov.bisp.enumeration.bK.b.b(dashboardActivity.af.m())));
                byte[] bArrB = ivas.gov.bisp.enumeration.bK.b.b(dashboardActivity.af.k());
                byte[] bArrB2 = ivas.gov.bisp.enumeration.bK.b.b(dashboardActivity.af.m());
                Object[] objArr = new Object[1];
                a(KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 19, new int[]{1771518590, -366996683, -2063531546, -1927127023, 557580246, -890849359, -920239230, -1880434022, 1335332508, -1347869486}, objArr);
                jSONObject2.put("string2", ivas.gov.bisp.enumeration.bK.b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                ax.h(dashboardActivity.am, "Fetching Tokens!");
                ax.e(jSONObject2, dashboardActivity, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new C(dashboardActivity));
            } catch (JSONException unused) {
            }
            dialogInterface.cancel();
            int i4 = c + 9;
            d = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void a(int i, int[] iArr, Object[] objArr) {
            int i2 = 2 % 2;
            d dVar = new d();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = c$s11$32;
            if (iArr2 != null) {
                int i3 = $10 + 115;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 23;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        iArr3[i5] = (int) (((long) iArr2[i5]) - (-2705551458099060901L));
                        i5 >>>= 1;
                    } else {
                        iArr3[i5] = (int) (((long) iArr2[i5]) ^ (-2705551458099060901L));
                        i5++;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = c$s11$32;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    iArr6[i7] = (int) (((long) iArr5[i7]) ^ (-2705551458099060901L));
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            dVar.a = 0;
            while (dVar.a < iArr.length) {
                int i8 = $10 + 59;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr[0] = (char) (iArr[dVar.a] >> 16);
                cArr[1] = (char) iArr[dVar.a];
                cArr[2] = (char) (iArr[dVar.a + 1] >> 16);
                cArr[3] = (char) iArr[dVar.a + 1];
                dVar.e = (cArr[0] << 16) + cArr[1];
                dVar.d = (cArr[2] << 16) + cArr[3];
                d.b(iArr4);
                for (int i10 = 0; i10 < 16; i10++) {
                    dVar.e ^= iArr4[i10];
                    dVar.d = d.c(dVar.e) ^ dVar.d;
                    int i11 = dVar.e;
                    dVar.e = dVar.d;
                    dVar.d = i11;
                }
                int i12 = dVar.e;
                dVar.e = dVar.d;
                dVar.d = i12;
                dVar.d ^= iArr4[16];
                dVar.e ^= iArr4[17];
                int i13 = dVar.e;
                int i14 = dVar.d;
                cArr[0] = (char) (dVar.e >>> 16);
                cArr[1] = (char) dVar.e;
                cArr[2] = (char) (dVar.d >>> 16);
                cArr[3] = (char) dVar.d;
                d.b(iArr4);
                cArr2[dVar.a * 2] = cArr[0];
                cArr2[(dVar.a * 2) + 1] = cArr[1];
                cArr2[(dVar.a * 2) + 2] = cArr[2];
                cArr2[(dVar.a * 2) + 3] = cArr[3];
                dVar.a += 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }
}
