package ivas.gov.bisp.enumeration.activitybase;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.G;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.an;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.bK.w;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p026az.C0104p;
import ivas.gov.bisp.enumeration.p043bp.am;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import net.sqlcipher.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAuth extends AppCompatActivity implements View.OnClickListener, c.aPw {
    private static int p = 0;
    private static int q = 1;
    public static final /* synthetic */ int r = 0;
    public RadioButton A;
    public RadioGroup B;
    public RadioButton C;
    public ImageView D;
    public Button E;
    public ivas.gov.bisp.enumeration.p037bj.c F;
    public ExecutorService G;
    public Context H;
    public boolean J;
    public int K;
    public byte[] N;
    public Bitmap P;
    public TextView Q;
    public BISPApplication R;
    public RelativeLayout S;
    public SessionManager T;
    public ProgressDialog U;
    public RelativeLayout V;
    public EditText s;
    public ImageView u;
    public RadioGroup v;
    public Dialog x;
    public Spinner y;
    public TextView z;
    public final String[] t = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public int w = 0;
    public int L = 256;
    public int I = 360;
    public byte[] M = new byte[92160];
    public String O = BuildConfig.FLAVOR;
    public c W = new c(this, this);
    public String[] ab = {"برائے مہربانی  جواب دہندہ کی انگلی کا انتخاب کریں", "انگوٹھا", "شہادت کی انگلی", "درمیانی انگلی", "انگوٹھی والی انگلی", "چھوٹی انگلی"};
    public String X = "0.0";
    public String Y = "0.0";
    public Handler Z = new OooO00o();
    public Boolean aa = Boolean.FALSE;

    public class OooO implements View.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 11;
            int i4 = i3 + ((i2 ^ 11) | i3);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                BaseAuth.this.r();
                return;
            }
            BaseAuth.this.r();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public class OooO0O0 implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0O0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 83;
            int i4 = (i3 << 1) - ((~(i2 & 83)) & i3);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 61;
            int i5 = (((i3 | 61) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            a = i5 % 128;
            int i6 = i5 % 2;
            int checkedRadioButtonId = BaseAuth.this.v.getCheckedRadioButtonId();
            int i7 = a;
            int i8 = ((i7 | 19) << 1) - (i7 ^ 19);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (checkedRadioButtonId == BaseAuth.this.C.getId()) {
                int i10 = b;
                int i11 = i10 ^ 71;
                int i12 = (i10 & 71) << 1;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    BaseAuth.this.w = i;
                    throw null;
                }
                BaseAuth.this.w = i;
                int i14 = a;
                int i15 = i14 & 111;
                int i16 = ((((i14 ^ 111) | i15) << 1) - (~(-((i14 | 111) & (~i15))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                return;
            }
            if (checkedRadioButtonId == BaseAuth.this.A.getId()) {
                int i18 = b;
                int i19 = i18 + 35;
                a = i19 % 128;
                if (i19 % 2 == 0 ? i != 1 : i != 0) {
                    if (i == 2) {
                        BaseAuth.this.w = 7;
                        int i20 = b;
                        int i21 = ((i20 | 21) << 1) - (i20 ^ 21);
                        a = i21 % 128;
                        if (i21 % 2 != 0) {
                            int i22 = 94 / 0;
                            return;
                        }
                        return;
                    }
                    int i23 = ((i18 | 82) << 1) - (i18 ^ 82);
                    int i24 = (i23 ^ (-1)) + (i23 << 1);
                    int i25 = i24 % 128;
                    a = i25;
                    int i26 = i24 % 2;
                    if (i == 3) {
                        BaseAuth.this.w = 8;
                        int i27 = a;
                        int i28 = (((i27 ^ 3) | (i27 & 3)) << 1) - ((3 & (~i27)) | (i27 & (-4)));
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        return;
                    }
                    int i30 = i25 & 47;
                    int i31 = (i25 | 47) & (~i30);
                    int i32 = -(-(i30 << 1));
                    int i33 = (i31 & i32) + (i31 | i32);
                    int i34 = i33 % 128;
                    b = i34;
                    if (i33 % 2 != 0 ? i == 4 : i == 3) {
                        BaseAuth.this.w = 9;
                        int i35 = b;
                        int i36 = ((i35 | 109) << 1) - (i35 ^ 109);
                        a = i36 % 128;
                        if (i36 % 2 != 0) {
                            int i37 = 69 / 0;
                            return;
                        }
                        return;
                    }
                    int i38 = i34 + 19;
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    if (i == 5) {
                        BaseAuth.this.w = 10;
                        int i40 = b;
                        int i41 = i40 & 7;
                        int i42 = (((i40 | 7) & (~i41)) - (~(i41 << 1))) - 1;
                        a = i42 % 128;
                        int i43 = i42 % 2;
                        return;
                    }
                    int i44 = i34 ^ 51;
                    int i45 = (i34 & 51) << 1;
                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                    a = i46 % 128;
                    int i47 = i46 % 2;
                    BaseAuth.this.w = 0;
                    int i48 = b;
                    int i49 = i48 & 67;
                    int i50 = -(-((i48 ^ 67) | i49));
                    int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                    a = i51 % 128;
                    if (i51 % 2 != 0) {
                        int i52 = 20 / 0;
                        return;
                    }
                    return;
                }
                BaseAuth.this.w = 6;
                int i53 = b + 77;
                a = i53 % 128;
                int i54 = i53 % 2;
            }
            int i55 = b + 77;
            a = i55 % 128;
            if (i55 % 2 != 0) {
                throw null;
            }
        }
    }

    public class OooO0OO implements OooOO0 {
        private static int a = 0;
        private static int b = 1;

        public OooO0OO() {
        }

        @Override // ivas.gov.bisp.enumeration.activitybase.BaseAuth.OooOO0
        public void actionPerform() {
            BaseAuth baseAuth;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 13;
            int i4 = (i3 - (~(-(-((i2 ^ 13) | i3))))) - 1;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                BaseAuth.this.x.dismiss();
                baseAuth = BaseAuth.this;
                int i5 = 56 / 0;
            } else {
                BaseAuth.this.x.dismiss();
                baseAuth = BaseAuth.this;
            }
            int i6 = a;
            int i7 = i6 ^ 65;
            int i8 = ((((i6 & 65) | i7) << 1) - (~(-i7))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            baseAuth.W.c();
            BaseAuth baseAuth2 = BaseAuth.this;
            int i10 = baseAuth2.K;
            int i11 = b;
            int i12 = (i11 & 21) + (i11 | 21);
            a = i12 % 128;
            int i13 = i12 % 2;
            if (i10 == 2) {
                int i14 = (i11 & 76) + (i11 | 76);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    baseAuth2.K = 0;
                } else {
                    baseAuth2.K = 0;
                }
                baseAuth2.w = 0;
                baseAuth2.O = BuildConfig.FLAVOR;
                int i16 = a;
                int i17 = i16 & 21;
                int i18 = (i16 ^ 21) | i17;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 5 % 3;
                }
            }
            c cVar = baseAuth2.W;
            int i21 = cVar.c;
            int i22 = (i21 ^ 2) + ((i21 & 2) << 1);
            cVar.c = (i22 ^ (-1)) + (i22 << 1);
            int i23 = a + 96;
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    public class OooO0o implements RadioGroup.OnCheckedChangeListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 35) | (i3 & 35)) << 1;
            int i5 = -(((~i3) & 35) | (i3 & (-36)));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                BaseAuth.this.w = i;
                int i7 = 51 / 0;
            } else {
                BaseAuth.this.w = i;
            }
            int i8 = a;
            int i9 = ((i8 & 10) + (i8 | 10)) - 1;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public interface OooOO0 {
        void actionPerform();
    }

    public class OooOOO0 extends AsyncTask<Void, Void, Void> {
        private static int a = 0;
        private static int b = 1;
        public String c = "CnicValidation_Tag";
        public String d;
        public OooOO0 e;

        public OooOOO0(String str, Boolean bool, OooOO0 oooOO0) {
            BaseAuth.this.U.setCancelable(false);
            BaseAuth.this.U.setMessage("Please Wait...");
            BaseAuth.this.U.setProgressStyle(0);
            BaseAuth.this.U.setCancelable(false);
            BaseAuth.this.U.show();
            this.d = str;
            this.e = oooOO0;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r5) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 33;
            int i4 = (i3 - (~((i2 ^ 33) | i3))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            super.onPostExecute(r5);
            int i6 = b;
            int i7 = (i6 | 95) << 1;
            int i8 = -(((~i6) & 95) | (i6 & (-96)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            SessionManager sessionManager;
            SharedPreferences.Editor editor;
            int i = 2 % 2;
            Log.e(this.c, "doInBackground: createjson");
            String strReplace = this.d.replace("-", BuildConfig.FLAVOR);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                try {
                    jSONObject.put("CNICNumber", strReplace);
                    int i2 = b;
                    int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
                    a = i3 % 128;
                    int i4 = i3 % 2;
                    jSONObject.put("call_origin", 100);
                    jSONObject.put("ipAddress", ac.h(true));
                    jSONObject.put("isFingerPrint", true);
                    jSONObject.put("latitude", BaseAuth.this.X.toString());
                    jSONObject.put("longitude", BaseAuth.this.Y.toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(BaseAuth.this.aa);
                    jSONObject.put("isScreenLogin", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    int i5 = a + 47;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    sb2.append(BaseAuth.this.K);
                    jSONObject.put("counter", sb2.toString());
                    jSONObject.put("fingerIndex", BaseAuth.this.w);
                    jSONObject.put("fingerTemplate", BaseAuth.this.O);
                    int i7 = a;
                    int i8 = (-2) - (((i7 & 116) + (i7 | 116)) ^ (-1));
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    Log.e("params", jSONObject.toString());
                    String string = jSONObject.toString();
                    byte[] bArrB = b.b(BaseAuth.this.T.k());
                    byte[] bArrB2 = b.b(BaseAuth.this.T.m());
                    int i10 = b;
                    int i11 = i10 | 109;
                    int i12 = i11 << 1;
                    int i13 = -((~(i10 & 109)) & i11);
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    jSONObject2.put("string1", b.d(string, bArrB, bArrB2));
                    byte[] bArrB3 = b.b(BaseAuth.this.T.k());
                    byte[] bArrB4 = b.b(BaseAuth.this.T.m());
                    int i16 = b;
                    int i17 = (i16 & (-32)) | ((~i16) & 31);
                    int i18 = -(-((i16 & 31) << 1));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i19 % 128;
                    if (i19 % 2 != 0) {
                        jSONObject2.put("string2", b.d("VerifyUserFingerPrint", bArrB3, bArrB4));
                        Log.e("params", jSONObject2.toString());
                        ax.h(BaseAuth.this.U, "Please wait!");
                        sessionManager = BaseAuth.this.T;
                        editor = sessionManager.d;
                        int i20 = 18 / 0;
                    } else {
                        jSONObject2.put("string2", b.d("VerifyUserFingerPrint", bArrB3, bArrB4));
                        Log.e("params", jSONObject2.toString());
                        ax.h(BaseAuth.this.U, "Please wait!");
                        sessionManager = BaseAuth.this.T;
                        editor = sessionManager.d;
                    }
                    editor.putString("k_nadra_data", BuildConfig.FLAVOR);
                    sessionManager.d.apply();
                    ax.e(jSONObject2, BaseAuth.this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new j(this));
                    int i21 = b;
                    int i22 = ((i21 ^ 93) | (i21 & 93)) << 1;
                    int i23 = -(((~i21) & 93) | (i21 & (-94)));
                    int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                } catch (ClassCastException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw e3;
                }
            } catch (JSONException unused) {
            }
            int i26 = b;
            int i27 = i26 ^ 67;
            int i28 = (((i26 & 67) | i27) << 1) - i27;
            a = i28 % 128;
            int i29 = i28 % 2;
            return null;
        }
    }

    public static void o(BaseAuth baseAuth, String str, String str2) {
        int i = 2 % 2;
        C0084m.b(baseAuth.H, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(baseAuth);
        int i2 = q;
        int i3 = ((i2 & (-54)) | ((~i2) & 53)) + ((i2 & 53) << 1);
        p = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = LayoutInflater.from(baseAuth).inflate(R.layout.custom_dialog_new, (ViewGroup) baseAuth.findViewById(android.R.id.content), false);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        int i5 = q;
        int i6 = (((i5 | 90) << 1) - (i5 ^ 90)) - 1;
        p = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            oooO0O0.f1o = viewInflate;
            aiz.b().show();
            obj.hashCode();
            throw null;
        }
        oooO0O0.f1o = viewInflate;
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText("Fingerprint Error");
        StringBuilder sb = new StringBuilder();
        int i7 = q;
        int i8 = ((i7 ^ 56) + ((i7 & 56) << 1)) - 1;
        p = i8 % 128;
        int i9 = i8 % 2;
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        int i10 = q;
        int i11 = i10 ^ 97;
        int i12 = -(-((i10 & 97) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        p = i13 % 128;
        if (i13 % 2 != 0) {
            textView2.setText(sb.toString());
            throw null;
        }
        textView2.setText(sb.toString());
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        ((TextView) viewInflate.findViewById(R.id.btn_no)).setVisibility(8);
        textView3.setText("OK");
        ivas.gov.bisp.enumeration.p048bu.j jVar = new ivas.gov.bisp.enumeration.p048bu.j(baseAuth, bVarB);
        int i14 = p;
        int i15 = ((i14 | 69) << 1) - (i14 ^ 69);
        q = i15 % 128;
        if (i15 % 2 != 0) {
            textView3.setOnClickListener(jVar);
        } else {
            textView3.setOnClickListener(jVar);
            int i16 = 85 / 0;
        }
    }

    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (i2 & (-8)) | ((~i2) & 7);
        int i4 = (i2 & 7) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        q = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 101;
        int i4 = (i3 - (~((i2 ^ 101) | i3))) - 1;
        p = i4 % 128;
        int i5 = i4 % 2;
        super.onDestroy();
        if (!this.aa.booleanValue()) {
            int i6 = q;
            int i7 = i6 & 121;
            int i8 = (~i7) & (i6 | 121);
            int i9 = i7 << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            p = i10 % 128;
            int i11 = i10 % 2;
            c cVar = this.W;
            if (cVar != null) {
                int i12 = (i6 & (-70)) | ((~i6) & 69);
                int i13 = -(-((i6 & 69) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                p = i14 % 128;
                int i15 = i14 % 2;
                cVar.d();
                int i16 = q;
                int i17 = i16 & 83;
                int i18 = i16 | 83;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                p = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        int i21 = q;
        int i22 = ((i21 & 113) - (~(-(-(i21 | 113))))) - 1;
        p = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 89 / 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 103;
        int i4 = ((i2 | 103) & (~i3)) + (i3 << 1);
        p = i4 % 128;
        int i5 = i4 % 2;
        super.onPause();
        if (i5 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        BISPApplication.d = null;
        new w(this);
        int i2 = q;
        int i3 = (((i2 ^ 95) | (i2 & 95)) << 1) - (((~i2) & 95) | (i2 & (-96)));
        p = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public abstract int p();

    public abstract void t();

    @Override // ivas.gov.bisp.enumeration.activitybase.c.aPw
    public void timerFinish() {
        int i = 2 % 2;
        q("0", new ArrayList<>());
        int i2 = q + 9;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void s() {
        String str;
        boolean z;
        int i = 2 % 2;
        int i2 = p + 49;
        q = i2 % 128;
        int i3 = i2 % 2;
        C0104p c0104pC = C0104p.c();
        Context context = this.H;
        String string = getResources().getString(R.string.enable_location);
        am amVar = new am(this, 3);
        int i4 = q;
        int i5 = (i4 ^ 43) + ((i4 & 43) << 1);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            str = "No location!";
            z = true;
        } else {
            str = "No location!";
            z = false;
        }
        c0104pC.e(context, str, string, amVar, z);
    }

    public class OooO00o extends Handler {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r1
  0x0045: PHI (r1v19 byte[]) = (r1v18 byte[]), (r1v36 byte[]) binds: [B:14:0x0043, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x007d  */
        /* JADX WARN: Code duplicated, block: B:21:0x008e  */
        /* JADX WARN: Code duplicated, block: B:23:0x009f  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            BaseAuth baseAuth;
            int i;
            BaseAuth baseAuth2;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 ^ 95;
            int i6 = (((i4 & 95) | i5) << 1) - i5;
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                int i7 = message.what;
                obj.hashCode();
                throw null;
            }
            if (message.what == 0) {
                BaseAuth baseAuth3 = BaseAuth.this;
                if (baseAuth3.J) {
                    int i8 = a;
                    int i9 = (((i8 & (-72)) | ((~i8) & 71)) - (~(-(-((i8 & 71) << 1))))) - 1;
                    b = i9 % 128;
                    if (i9 % 2 != 0) {
                        bArr = baseAuth3.N;
                        int i10 = 98 / 0;
                        if (bArr != null) {
                            int i11 = b;
                            int i12 = ((i11 | 117) << 1) - (i11 ^ 117);
                            a = i12 % 128;
                            int i13 = i12 % 2;
                            baseAuth3.P = G.c(bArr);
                            baseAuth = BaseAuth.this;
                            int i14 = b;
                            i = ((i14 & (-50)) | ((~i14) & 49)) + ((i14 & 49) << 1);
                            a = i % 128;
                            if (i % 2 == 0) {
                                baseAuth.D.setImageBitmap(baseAuth.P);
                                baseAuth2 = BaseAuth.this;
                                int i15 = 66 / 0;
                            } else {
                                baseAuth.D.setImageBitmap(baseAuth.P);
                                baseAuth2 = BaseAuth.this;
                            }
                            if (baseAuth2.aa.booleanValue()) {
                                int i16 = b;
                                i2 = (((i16 | 2) << 1) - (i16 ^ 2)) - 1;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    BaseAuth baseAuth4 = BaseAuth.this;
                                    baseAuth4.u.setImageBitmap(baseAuth4.P);
                                    obj.hashCode();
                                    throw null;
                                }
                                BaseAuth baseAuth5 = BaseAuth.this;
                                baseAuth5.u.setImageBitmap(baseAuth5.P);
                                int i17 = a + 77;
                                b = i17 % 128;
                                int i18 = i17 % 2;
                            }
                        }
                    } else {
                        bArr = baseAuth3.N;
                        if (bArr != null) {
                            int i19 = b;
                            int i110 = ((i19 | 117) << 1) - (i19 ^ 117);
                            a = i110 % 128;
                            int i111 = i110 % 2;
                            baseAuth3.P = G.c(bArr);
                            baseAuth = BaseAuth.this;
                            int i112 = b;
                            i = ((i112 & (-50)) | ((~i112) & 49)) + ((i112 & 49) << 1);
                            a = i % 128;
                            if (i % 2 == 0) {
                                baseAuth.D.setImageBitmap(baseAuth.P);
                                baseAuth2 = BaseAuth.this;
                                int i113 = 66 / 0;
                            } else {
                                baseAuth.D.setImageBitmap(baseAuth.P);
                                baseAuth2 = BaseAuth.this;
                            }
                            if (baseAuth2.aa.booleanValue()) {
                                int i114 = b;
                                i2 = (((i114 | 2) << 1) - (i114 ^ 2)) - 1;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    BaseAuth baseAuth6 = BaseAuth.this;
                                    baseAuth6.u.setImageBitmap(baseAuth6.P);
                                    obj.hashCode();
                                    throw null;
                                }
                                BaseAuth baseAuth7 = BaseAuth.this;
                                baseAuth7.u.setImageBitmap(baseAuth7.P);
                                int i115 = a + 77;
                                b = i115 % 128;
                                int i116 = i115 % 2;
                            }
                        }
                    }
                }
            }
            int i20 = a;
            int i21 = ((i20 ^ 91) | (i20 & 91)) << 1;
            int i22 = -(((~i20) & 91) | (i20 & (-92)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
        }
    }

    public class OooOO0O implements Runnable {
        private static int a = 0;
        private static int b = 1;

        public OooOO0O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 71;
            int i4 = ((((i2 & 71) | i3) << 1) - (~(-i3))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (!(!BaseAuth.this.J)) {
                while (true) {
                    BaseAuth baseAuth = BaseAuth.this;
                    if (!baseAuth.J) {
                        break;
                    }
                    int i6 = b;
                    int i7 = (i6 & 76) + (i6 | 76);
                    int i8 = (i7 ^ (-1)) + (i7 << 1);
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    Objects.requireNonNull(baseAuth.F);
                    BaseAuth baseAuth2 = BaseAuth.this;
                    int i10 = a;
                    int i11 = i10 & 75;
                    int i12 = (i10 | 75) & (~i11);
                    int i13 = -(-(i11 << 1));
                    int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = baseAuth2.F.i(baseAuth2.M);
                    BaseAuth baseAuth3 = BaseAuth.this;
                    int i17 = a;
                    int i18 = (i17 & 75) + (i17 | 75);
                    b = i18 % 128;
                    if (i18 % 2 == 0) {
                        baseAuth3.F.g(baseAuth3.M);
                        int i19 = 51 / 0;
                    } else {
                        baseAuth3.F.g(baseAuth3.M);
                    }
                    int i20 = b + 11;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    Log.e("fenglei", "capture get data end");
                    if (i16 == 1) {
                        int i22 = a;
                        int i23 = i22 & 7;
                        int i24 = (i23 - (~((i22 ^ 7) | i23))) - 1;
                        b = i24 % 128;
                        if (i24 % 2 == 0) {
                            Base64.encodeToString(BaseAuth.this.M, 2);
                        } else {
                            Base64.encodeToString(BaseAuth.this.M, 2);
                        }
                        int i25 = a;
                        int i26 = (i25 ^ 66) + ((i25 & 66) << 1);
                        int i27 = (i26 ^ (-1)) + (i26 << 1);
                        b = i27 % 128;
                        int i28 = i27 % 2;
                        BaseAuth baseAuth4 = BaseAuth.this;
                        byte[] bArr = baseAuth4.M;
                        int i29 = b;
                        int i30 = i29 ^ 75;
                        int i31 = ((i29 & 75) | i30) << 1;
                        int i32 = -i30;
                        int i33 = (i31 & i32) + (i31 | i32);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                        G.d(bArr, baseAuth4.L, baseAuth4.I);
                        int i35 = a;
                        int i36 = i35 ^ 53;
                        int i37 = (i35 & 53) << 1;
                        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        BaseAuth baseAuth5 = BaseAuth.this;
                        baseAuth5.N = G.b(baseAuth5.M, baseAuth5.L, baseAuth5.I);
                        Message message = new Message();
                        int i40 = a;
                        int i41 = i40 & 89;
                        int i42 = -(-((i40 ^ 89) | i41));
                        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                        b = i43 % 128;
                        if (i43 % 2 == 0) {
                            message.what = 1;
                        } else {
                            message.what = 0;
                        }
                        Handler handler = BaseAuth.this.Z;
                        int i44 = b;
                        int i45 = i44 ^ 77;
                        int i46 = (((i44 & 77) | i45) << 1) - i45;
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        handler.sendMessage(message);
                        int i48 = b;
                        int i49 = ((i48 | 37) << 1) - (i48 ^ 37);
                        a = i49 % 128;
                        if (i49 % 2 != 0) {
                            int i50 = 2 % 4;
                        }
                    }
                }
            }
            int i51 = b + 73;
            a = i51 % 128;
            int i52 = i51 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x011a  */
    public void r() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = q;
        int i6 = i5 & 3;
        int i7 = -(-((i5 ^ 3) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        p = i8 % 128;
        int i9 = i8 % 2;
        Object obj = null;
        if (this.T == null) {
            SessionManager sessionManager = new SessionManager(this.H);
            int i10 = q;
            int i11 = i10 & 97;
            int i12 = (i11 - (~((i10 ^ 97) | i11))) - 1;
            p = i12 % 128;
            if (i12 % 2 != 0) {
                this.T = sessionManager;
                obj.hashCode();
                throw null;
            }
            this.T = sessionManager;
        }
        String string = this.T.z().toString();
        int i13 = q;
        int i14 = i13 & 51;
        int i15 = ((((i13 ^ 51) | i14) << 1) - (~(-((i13 | 51) & (~i14))))) - 1;
        int i16 = i15 % 128;
        p = i16;
        int i17 = i15 % 2;
        EditText editText = this.s;
        if (editText != null) {
            int i18 = ((i16 ^ 73) | (i16 & 73)) << 1;
            int i19 = -(((~i16) & 73) | (i16 & (-74)));
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            q = i20 % 128;
            if (i20 % 2 == 0) {
                editText.getText().toString();
                throw null;
            }
            string = editText.getText().toString();
        }
        BISPApplication bISPApplication = BISPApplication.c;
        if (string.length() <= 0) {
            Toast.makeText(getApplicationContext(), "Kindly Enter CNIC First", 0).show();
            Dialog dialog = this.x;
            int i21 = p;
            int i22 = ((i21 ^ 39) | (i21 & 39)) << 1;
            int i23 = -(((~i21) & 39) | (i21 & (-40)));
            int i24 = (i22 & i23) + (i23 | i22);
            q = i24 % 128;
            if (i24 % 2 != 0) {
                dialog.dismiss();
                return;
            } else {
                dialog.dismiss();
                throw null;
            }
        }
        int i25 = q + 33;
        p = i25 % 128;
        if (i25 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.w <= 0) {
            Toast.makeText(getApplicationContext(), "Kindly select from given options", 0).show();
            int i26 = q;
            int i27 = ((i26 & 27) - (~(i26 | 27))) - 1;
            p = i27 % 128;
            int i28 = i27 % 2;
            return;
        }
        this.O = BuildConfig.FLAVOR;
        Base64.encodeToString(this.M, 2);
        int i29 = q;
        int i30 = ((i29 ^ 39) | (i29 & 39)) << 1;
        int i31 = -((i29 & (-40)) | ((~i29) & 39));
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        p = i32 % 128;
        int i33 = i32 % 2;
        if (this.P == null) {
            Toast.makeText(this, "Please Place Finger", 1).show();
            int i34 = q;
            int i35 = ((i34 | 115) << 1) - (i34 ^ 115);
            p = i35 % 128;
            int i36 = i35 % 2;
            return;
        }
        int i37 = ((i29 & 25) - (~(i29 | 25))) - 1;
        p = i37 % 128;
        int i38 = i37 % 2;
        boolean z = this.J;
        if (i38 != 0) {
            int i39 = 6 / 0;
            if (z) {
                this.J = false;
                this.G.shutdownNow();
                int i40 = q;
                int i41 = i40 & 43;
                i = (((i40 | 43) & (~i41)) - (~(-(-(i41 << 1))))) - 1;
                p = i % 128;
                if (i % 2 == 0) {
                    this.G = null;
                    this.F.e();
                    obj.hashCode();
                    throw null;
                }
                this.G = null;
                this.F.e();
                i2 = p;
                i3 = i2 + 115;
                q = i3 % 128;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i42 = i2 + 89;
                q = i42 % 128;
                int i43 = i42 % 2;
            }
        } else if (z) {
            this.J = false;
            this.G.shutdownNow();
            int i44 = q;
            int i45 = i44 & 43;
            i = (((i44 | 43) & (~i45)) - (~(-(-(i45 << 1))))) - 1;
            p = i % 128;
            if (i % 2 == 0) {
                this.G = null;
                this.F.e();
                obj.hashCode();
                throw null;
            }
            this.G = null;
            this.F.e();
            i2 = p;
            i3 = i2 + 115;
            q = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i46 = i2 + 89;
            q = i46 % 128;
            int i47 = i46 % 2;
        }
        byte[] bArrD = an.c().d(this.P);
        int i48 = q;
        int i49 = i48 & 107;
        int i50 = i49 + ((i48 ^ 107) | i49);
        p = i50 % 128;
        this.O = i50 % 2 != 0 ? Base64.encodeToString(bArrD, 1) : Base64.encodeToString(bArrD, 0);
        int i51 = q + 29;
        p = i51 % 128;
        int i52 = i51 % 2;
        Base64.encodeToString(bArrD, 0);
        if (this.aa.booleanValue()) {
            this.x.dismiss();
            int i53 = p;
            int i54 = i53 ^ 37;
            int i55 = ((i53 & 37) | i54) << 1;
            int i56 = -i54;
            int i57 = (i55 & i56) + (i55 | i56);
            q = i57 % 128;
            int i58 = i57 % 2;
            return;
        }
        OooOOO0 oooOOO0 = new OooOOO0(this.T.z(), this.aa, new OooO0OO());
        int i59 = q + 23;
        p = i59 % 128;
        if (i59 % 2 != 0) {
            oooOOO0.execute(new Void[1]);
        } else {
            oooOOO0.execute(new Void[0]);
        }
        int i60 = q;
        int i61 = i60 ^ 85;
        int i62 = ((i60 & 85) | i61) << 1;
        int i63 = -i61;
        int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
        p = i64 % 128;
        int i65 = i64 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0436  */
    /* JADX WARN: Code duplicated, block: B:110:0x0450  */
    /* JADX WARN: Code duplicated, block: B:115:0x048a  */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0493, code lost:
    
        ivas.gov.bisp.enumeration.p085h.k.c(r17, r17.t, 1);
        r1 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.p;
        r3 = ((r1 ^ 116) + ((r1 & 116) << 1)) - 1;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04a6, code lost:
    
        if ((r3 % 2) == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04a9, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (ivas.gov.bisp.enumeration.fragments.FragmentPictures.hasPermissions(r17, r17.t) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (ivas.gov.bisp.enumeration.fragments.FragmentPictures.hasPermissions(r17, r17.t) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r17.M = new byte[r17.L * r17.I];
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q + 97;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r9 % 128;
        r9 = r9 % 2;
        r17.F = ivas.gov.bisp.enumeration.p037bj.c.c(getApplicationContext());
        r9 = r17.U;
        r12 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.p;
        r14 = r12 & 53;
        r13 = (((r12 ^ 53) | r14) << 1) - ((r12 | 53) & (~r14));
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if ((r13 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        r12 = 2 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        if (r9.isShowing() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        if ((!r9.isShowing()) == true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        r17.U.dismiss();
        r9 = r17.U;
        r12 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r13 = (r12 & (-98)) | ((~r12) & 97);
        r11 = -(-((97 & r12) << 1));
        r12 = (r13 & r11) + (r11 | r13);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r12 % 128;
        r12 = r12 % 2;
        r9.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010b, code lost:
    
        r17.U.setCancelable(false);
        r17.U.setMessage("Please Wait...");
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r11 = (((r9 | 98) << 1) - (r9 ^ 98)) - 1;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r11 % 128;
        r11 = r11 % 2;
        r17.U.setProgressStyle(0);
        r17.U.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0135, code lost:
    
        if (r18.equals("701") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0137, code lost:
    
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.p;
        r11 = (((r9 | 18) << 1) - (r9 ^ 18)) - 1;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014b, code lost:
    
        if (r18.equals("702") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014d, code lost:
    
        r17.V.setVisibility(0);
        r1 = r17.S;
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.p;
        r11 = r9 & 123;
        r9 = ((r9 | 123) & (~r11)) + (r11 << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r9 % 128;
        r9 = r9 % 2;
        r1.setVisibility(8);
        r17.w = 0;
        r17.B.clearCheck();
        r1 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q + 73;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r1 % 128;
        r1 = r1 % 2;
        r17.B.removeAllViews();
        r1 = r17.z;
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.p;
        r11 = (r9 & 21) + (r9 | 21);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018d, code lost:
    
        if ((r11 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018f, code lost:
    
        r1.setText("دی گئی انگلیوں کی فہرست میں سے ایک کا انتخاب کریں۔");
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0194, code lost:
    
        r1.setText("دی گئی انگلیوں کی فہرست میں سے ایک کا انتخاب کریں۔");
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0198, code lost:
    
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r11 = (r9 ^ 25) + ((r9 & 25) << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a5, code lost:
    
        if ((r11 % 2) == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a7, code lost:
    
        r9 = 2 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ad, code lost:
    
        if (r1 >= r19.size()) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01af, code lost:
    
        r9 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r11 = r9 & 117;
        r9 = r9 | 117;
        r12 = (r11 ^ r9) + ((r9 & r11) << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c1, code lost:
    
        r11 = java.lang.Integer.parseInt(r19.get(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cb, code lost:
    
        r12 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r13 = (((r12 | 122) << 1) - (r12 ^ 122)) - 1;
        r14 = r13 % 128;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d9, code lost:
    
        if ((r13 % 2) != 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01db, code lost:
    
        switch(r11) {
            case 1: goto L62;
            case 2: goto L58;
            case 3: goto L57;
            case 4: goto L56;
            case 5: goto L55;
            case 6: goto L54;
            case 7: goto L53;
            case 8: goto L52;
            case 9: goto L51;
            case 10: goto L50;
            default: goto L49;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01de, code lost:
    
        r12 = (r14 ^ 105) + ((r14 & 105) << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ea, code lost:
    
        r12 = (r14 ^ 37) + ((r14 & 37) << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r12 % 128;
        r12 = r12 % 2;
        r12 = "بائیں ہاتھ کی چھوٹی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f8, code lost:
    
        r12 = r14 & 93;
        r12 = (r12 - (~((r14 ^ 93) | r12))) - 1;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r12 % 128;
        r12 = r12 % 2;
        r12 = "بائیں ہاتھ کی انگوٹھی والی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0208, code lost:
    
        r12 = "بائیں ہاتھ کی درمیانی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x020b, code lost:
    
        r12 = (-2) - ((r12 + 32) ^ (-1));
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r12 % 128;
        r12 = r12 % 2;
        r12 = "بائیں ہاتھ کی شہادت کی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0218, code lost:
    
        r12 = "بائیں ہاتھ کاانگوٹھا";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x021b, code lost:
    
        r12 = r12 + 97;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r12 % 128;
        r12 = r12 % 2;
        r12 = "دائیں ہاتھ کی چھوٹی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0225, code lost:
    
        r12 = "دائیں ہاتھ کی انگوٹھی والی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0228, code lost:
    
        r12 = "دائیں ہاتھ کی درمیانی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022b, code lost:
    
        r13 = (r12 ^ 17) + ((r12 & 17) << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0236, code lost:
    
        if ((r13 % 2) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0238, code lost:
    
        r12 = 5 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023a, code lost:
    
        r12 = "دائیں ہاتھ کی شہادت کی انگلی";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023d, code lost:
    
        r13 = r12 | 101;
        r14 = ((r13 << 1) - (~(-((~(r12 & 101)) & r13)))) - 1;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r14 % 128;
        r14 = r14 % 2;
        r12 = "دائیں ہاتھ کاانگوٹھا";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0251, code lost:
    
        r12 = net.sqlcipher.BuildConfig.FLAVOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0253, code lost:
    
        r13 = new android.widget.RadioButton(r17);
        r13.setText(r12);
        r13.setId(r11);
        r12 = new android.widget.RadioGroup.LayoutParams(-1, -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0263, code lost:
    
        r14 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r15 = r14 & 1;
        r14 = r14 | 1;
        r14 = (r15 & r14) + (r14 | r15);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0272, code lost:
    
        if ((r14 % 2) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0278, code lost:
    
        r12.setMargins(69, 91, 10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x027b, code lost:
    
        r13.setLayoutParams(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027f, code lost:
    
        r12.setMargins(16, 16, 16, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0285, code lost:
    
        r13.setTextSize(2, 24.0f);
        r13.setTextColor(-16777216);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028f, code lost:
    
        r12 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q + 55;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029a, code lost:
    
        r13.setLayoutDirection(1);
        r13.setGravity(8388608);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a0, code lost:
    
        r12 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.q;
        r14 = r12 ^ 43;
        r12 = (r12 & 43) << 1;
        r15 = (r14 ^ r12) + ((r12 & r14) << 1);
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.p = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b5, code lost:
    
        if (r19.size() != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b7, code lost:
    
        r12 = ivas.gov.bisp.enumeration.activitybase.BaseAuth.p + 113;
        ivas.gov.bisp.enumeration.activitybase.BaseAuth.q = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02c0, code lost:
    
        if ((r12 % 2) != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c2, code lost:
    
        r13.setChecked(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c5, code lost:
    
        r17.w = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c8, code lost:
    
        r13.setChecked(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cc, code lost:
    
        r17.B.addView(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02d1, code lost:
    
        r11 = r1 ^ 1;
        r1 = (r1 & 1) << 1;
        r1 = ((r1 & r11) << 1) + (r11 ^ r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02dd, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02e0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(java.lang.String r18, java.util.ArrayList<java.lang.String> r19) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activitybase.BaseAuth.q(java.lang.String, java.util.ArrayList):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int iV;
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(p());
        this.H = this;
        this.U = new ProgressDialog(this);
        this.R = (BISPApplication) getApplicationContext();
        t();
        Object obj = null;
        BISPApplication.d = null;
        new w(this);
        this.K = 0;
        Dialog dialog = new Dialog(this);
        this.x = dialog;
        dialog.setContentView(R.layout.dialog_capturefinger);
        int i2 = q;
        int i3 = ((i2 | 73) << 1) - (((~i2) & 73) | (i2 & (-74)));
        p = i3 % 128;
        int i4 = i3 % 2;
        this.x.setCancelable(false);
        this.D = (ImageView) this.x.findViewById(R.id.imageview_fp);
        this.B = (RadioGroup) this.x.findViewById(R.id.radio_group_fingers);
        int i5 = p;
        int i6 = i5 & 19;
        int i7 = (i5 | 19) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        q = i9 % 128;
        int i10 = i9 % 2;
        this.v = (RadioGroup) this.x.findViewById(R.id.rg_hands);
        this.A = (RadioButton) this.x.findViewById(R.id.left_hand);
        Dialog dialog2 = this.x;
        int i11 = q;
        int i12 = ((i11 & (-120)) | ((~i11) & 119)) + ((i11 & 119) << 1);
        p = i12 % 128;
        int i13 = i12 % 2;
        this.C = (RadioButton) dialog2.findViewById(R.id.right_hand);
        this.E = (Button) this.x.findViewById(R.id.select_finger);
        RelativeLayout relativeLayout = (RelativeLayout) this.x.findViewById(R.id.rlfingerMain);
        int i14 = q + 75;
        p = i14 % 128;
        if (i14 % 2 != 0) {
            this.V = relativeLayout;
            this.S = (RelativeLayout) this.x.findViewById(R.id.rlMain);
            this.z = (TextView) this.x.findViewById(R.id.hand_selection_heading_textView);
            obj.hashCode();
            throw null;
        }
        this.V = relativeLayout;
        this.S = (RelativeLayout) this.x.findViewById(R.id.rlMain);
        this.z = (TextView) this.x.findViewById(R.id.hand_selection_heading_textView);
        this.y = (Spinner) this.x.findViewById(R.id.finger_index_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, this.ab);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.y.setAdapter((SpinnerAdapter) arrayAdapter);
        this.y.setOnItemSelectedListener(new OooO0O0());
        TextView textView = (TextView) findViewById(R.id.application_version_textView);
        if (textView != null) {
            int i15 = p;
            int i16 = (i15 & 49) + (i15 | 49);
            q = i16 % 128;
            int i17 = i16 % 2;
            textView.setText("v7.6 (LIVE)\n11 Nov 2026");
            int i18 = p;
            int i19 = i18 & 99;
            int i20 = ((i18 | 99) & (~i19)) + (i19 << 1);
            q = i20 % 128;
            int i21 = i20 % 2;
        }
        this.s = (EditText) findViewById(R.id.et_cnic);
        int i22 = q;
        int i23 = i22 & 85;
        int i24 = ((i22 ^ 85) | i23) << 1;
        int i25 = -((i22 | 85) & (~i23));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        p = i26 % 128;
        if (i26 % 2 != 0) {
            this.u = (ImageView) findViewById(R.id.img_fp);
            int i27 = 96 / 0;
        } else {
            this.u = (ImageView) findViewById(R.id.img_fp);
        }
        int i28 = p;
        int i29 = ((i28 ^ 26) + ((i28 & 26) << 1)) - 1;
        q = i29 % 128;
        if (i29 % 2 == 0) {
            this.Q = (TextView) findViewById(R.id.btn_login);
            obj.hashCode();
            throw null;
        }
        this.Q = (TextView) findViewById(R.id.btn_login);
        int i30 = p;
        int i31 = i30 & 113;
        int i32 = (((i30 ^ 113) | i31) << 1) - ((i30 | 113) & (~i31));
        q = i32 % 128;
        int i33 = i32 % 2;
        EditText editText = this.s;
        if (editText != null) {
            av.buW buw = new av(this).new buW(this.s);
            int i34 = q;
            int i35 = i34 & 43;
            int i36 = (i34 | 43) & (~i35);
            int i37 = -(-(i35 << 1));
            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
            p = i38 % 128;
            int i39 = i38 % 2;
            editText.addTextChangedListener(buw);
            int i40 = p;
            int i41 = (i40 ^ 79) + ((i40 & 79) << 1);
            q = i41 % 128;
            int i42 = i41 % 2;
        }
        Button button = this.E;
        if (button != null) {
            int i43 = q;
            int i44 = i43 & 43;
            int i45 = i44 + ((i43 ^ 43) | i44);
            p = i45 % 128;
            int i46 = i45 % 2;
            button.setOnClickListener(this);
            int i47 = p;
            int i48 = (((i47 & (-6)) | ((~i47) & 5)) - (~((i47 & 5) << 1))) - 1;
            q = i48 % 128;
            int i49 = i48 % 2;
        }
        TextView textView2 = this.Q;
        if (textView2 != null) {
            int i50 = q;
            int i51 = (((i50 ^ 121) | (i50 & 121)) << 1) - (((~i50) & 121) | (i50 & (-122)));
            p = i51 % 128;
            int i52 = i51 % 2;
            textView2.setOnClickListener(this);
            int i53 = q;
            int i54 = ((i53 | 39) << 1) - (i53 ^ 39);
            p = i54 % 128;
            int i55 = i54 % 2;
        }
        ImageView imageView = this.u;
        if (imageView != null) {
            int i56 = p + 123;
            q = i56 % 128;
            if (i56 % 2 == 0) {
                imageView.setOnClickListener(this);
                iV = this.T.v();
                int i57 = 33 / 0;
            } else {
                imageView.setOnClickListener(this);
                iV = this.T.v();
            }
            int i58 = p;
            int i59 = i58 ^ 43;
            int i60 = ((i58 & 43) | i59) << 1;
            int i61 = -i59;
            int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
            q = i62 % 128;
            if (i62 % 2 != 0 ? iV == 1 : iV == 0) {
                BISPApplication bISPApplication = BISPApplication.c;
                this.u.setVisibility(0);
                int i63 = p;
                int i64 = i63 & 93;
                int i65 = ((i63 | 93) & (~i64)) + (i64 << 1);
                q = i65 % 128;
                if (i65 % 2 == 0) {
                    int i66 = 4 / 3;
                }
            } else {
                this.u.setVisibility(8);
                int i67 = p;
                int i68 = (i67 & (-104)) | ((~i67) & 103);
                int i69 = -(-((i67 & 103) << 1));
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                q = i70 % 128;
                int i71 = i70 % 2;
            }
        }
        if (!(!BISPApplication.f())) {
            s();
            Log.e("enablelocation", BISPApplication.e());
            int i72 = p;
            int i73 = (((i72 & (-98)) | ((~i72) & 97)) - (~((i72 & 97) << 1))) - 1;
            q = i73 % 128;
            int i74 = i73 % 2;
            return;
        }
        int i75 = q;
        int i76 = i75 & 3;
        int i77 = (i75 ^ 3) | i76;
        int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
        p = i78 % 128;
        int i79 = i78 % 2;
        String[] strArrSplit = BISPApplication.e().split(",");
        this.X = i79 != 0 ? strArrSplit[0] : strArrSplit[0];
        int i80 = p;
        int i81 = ((i80 & 88) + (i80 | 88)) - 1;
        q = i81 % 128;
        int i82 = i81 % 2;
        this.Y = BISPApplication.e().split(",")[1];
        int i83 = p;
        int i84 = (((i83 | 72) << 1) - (i83 ^ 72)) - 1;
        q = i84 % 128;
        if (i84 % 2 != 0) {
            Log.e("location", BISPApplication.e());
        } else {
            Log.e("location", BISPApplication.e());
            int i85 = 66 / 0;
        }
    }
}
