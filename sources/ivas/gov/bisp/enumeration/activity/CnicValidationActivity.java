package ivas.gov.bisp.enumeration.activity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.ActivityBeginSurvey;
import ivas.gov.bisp.enumeration.BISPApplication;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.ax.av.buW;
import ivas.gov.bisp.enumeration.bK.G;
import ivas.gov.bisp.enumeration.bK.ac;
import ivas.gov.bisp.enumeration.bK.ag;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.bK.ak;
import ivas.gov.bisp.enumeration.bK.an;
import ivas.gov.bisp.enumeration.bK.b;
import ivas.gov.bisp.enumeration.enumerator.ActivityEnumeratorMain;
import ivas.gov.bisp.enumeration.fragments.FragmentPictures;
import ivas.gov.bisp.enumeration.models.RosterItem;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p024ax.av;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.N;
import ivas.gov.bisp.enumeration.p036bi.O;
import ivas.gov.bisp.enumeration.p036bi.Q;
import ivas.gov.bisp.enumeration.p036bi.S;
import ivas.gov.bisp.enumeration.p036bi.T;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0184m;
import ivas.gov.bisp.enumeration.p085h.k;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import o.g;
import o.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CnicValidationActivity extends AppCompatActivity implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s76$1748 = 4096;
    private static char b$s75$1748 = 39884;
    private static char c$s74$1748 = 11907;
    private static char d$s73$1748 = 33650;
    private static int p = 1;
    private static int q;
    public static final /* synthetic */ int r = 0;
    public Dialog A;
    public ImageView B;
    public Spinner D;
    public RadioGroup E;
    public RadioGroup F;
    public RadioButton G;
    public Button H;
    public RadioButton I;
    public ImageView J;
    public ivas.gov.bisp.enumeration.p037bj.c K;
    public String L;
    public ExecutorService N;
    public boolean O;
    public byte[] R;
    public Bitmap T;
    public TextView U;
    public String V;
    public LinearLayout W;
    public RadioButton X;
    public RadioGroup Y;
    public RadioButton Z;
    public LinearLayout aa;
    public Context ab;
    public ProgressDialog ac;
    public List<RosterItem> ad;
    public ProgressDialog af;
    public SessionManager ag;
    public String ah;
    public RelativeLayout ai;
    public RelativeLayout aj;
    public BISPApplication am;
    public EditText w;
    public EditText y;
    public TextView z;
    public final String[] x = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public int C = 0;
    public int P = 256;
    public int M = 360;
    public byte[] Q = new byte[92160];
    public String S = BuildConfig.FLAVOR;
    public boolean ae = false;
    public String[] ak = {"برائے مہربانی  جواب دہندہ کی انگلی کا انتخاب کریں", "انگوٹھا", "شہادت کی انگلی", "درمیانی انگلی", "انگوٹھی والی انگلی", "چھوٹی انگلی"};
    public Handler al = new OooO0OO();

    public class OooO0O0 implements DialogInterface.OnClickListener {
        private static int a = 1;
        private static int b;

        public OooO0O0(CnicValidationActivity cnicValidationActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 93;
            int i5 = -(-(i3 | 93));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            dialogInterface.cancel();
            if (i7 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i8 = a;
            int i9 = ((i8 ^ 25) | (i8 & 25)) << 1;
            int i10 = -(((~i8) & 25) | (i8 & (-26)));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public class OooOO0 implements RadioGroup.OnCheckedChangeListener {
        private static int a = 1;
        private static int b;

        public OooOO0() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-92)) | ((~i3) & 91);
            int i5 = -(-((i3 & 91) << 1));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            CnicValidationActivity.this.C = i;
            int i8 = b + 5;
            a = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public class OooOOO0 extends AsyncTask<Void, Void, Void> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int c = 1;
        private static int d = 0;
        private static long d$s40$44 = 3254382592023333959L;
        public String f = "CnicValidation_Tag";
        public String g;

        public OooOOO0(String str, String str2) {
            CnicValidationActivity.this.ac.setCancelable(false);
            CnicValidationActivity.this.ac.setMessage("Please Wait...");
            CnicValidationActivity.this.ac.setProgressStyle(0);
            CnicValidationActivity.this.ac.setCancelable(false);
            CnicValidationActivity.this.ac.show();
            this.g = str;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            int i = 2 % 2;
            Log.e(this.f, "doInBackground: createjson");
            String strReplace = this.g.replace("-", BuildConfig.FLAVOR);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("CNICNumber", strReplace);
                jSONObject.put("call_origin", 100);
                jSONObject.put("fingerIndex", CnicValidationActivity.this.C);
                jSONObject.put("fingerTemplate", CnicValidationActivity.this.S);
                jSONObject.put("ipAddress", ac.h(true));
                jSONObject.put("isFingerPrint", true);
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(CnicValidationActivity.this.ag.k()), b.b(CnicValidationActivity.this.ag.m())));
                byte[] bArrB = b.b(CnicValidationActivity.this.ag.k());
                byte[] bArrB2 = b.b(CnicValidationActivity.this.ag.m());
                Object[] objArr = new Object[1];
                a(KeyEvent.getMaxKeyCode() >> 16, new char[]{53662, 7866, 27139, 49767, 53721, 44975, 2199, 54885, 5169, 27129, 17111, 6162, 23148, 8729, 33815, 24022, 32938, 7295, 56912, 42933, 50919, 54921, 5037, 59774, 3357, 37061, 21969, 13105, 29553, 19768, 28430, 29945, 47531, 1895, 41281, 48786, 65516, 49564, 64209}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                ax.h(CnicValidationActivity.this.af, "Please wait!");
                SessionManager sessionManager = CnicValidationActivity.this.ag;
                sessionManager.d.putString("k_nadra_data", BuildConfig.FLAVOR);
                sessionManager.d.apply();
                String str = this.f;
                StringBuilder sb = new StringBuilder();
                sb.append("requestCNICData: ");
                sb.append(strReplace);
                Log.e(str, sb.toString());
                ax.e(jSONObject2, CnicValidationActivity.this, "https://meladeskapp.bisp.gov.pk/api/Roster/bZJVzTu9rHlQm0D", new c(this, strReplace));
            } catch (JSONException unused) {
            }
            int i2 = c + 79;
            d = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r4) {
            int i = 2 % 2;
            int i2 = c + 103;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                super.onPostExecute(r4);
            } else {
                super.onPostExecute(r4);
                throw null;
            }
        }

        private static void a(int i, char[] cArr, Object[] objArr) {
            int i2 = 2 % 2;
            g gVar = new g();
            char[] cArrB = g.b(d$s40$44 ^ (-3439381718914712265L), cArr, i);
            gVar.a = 4;
            while (gVar.a < cArrB.length) {
                int i3 = $10 + 39;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                gVar.c = gVar.a - 4;
                cArrB[gVar.a] = (char) (((long) (cArrB[gVar.a] ^ cArrB[gVar.a % 4])) ^ (((long) gVar.c) * (d$s40$44 ^ (-3439381718914712265L))));
                gVar.a++;
            }
            String str = new String(cArrB, 4, cArrB.length - 4);
            int i5 = $10 + 83;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    public static /* synthetic */ ProgressDialog p(CnicValidationActivity cnicValidationActivity) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 + 47;
        q = i3 % 128;
        int i4 = i3 % 2;
        ProgressDialog progressDialog = cnicValidationActivity.ac;
        if (i4 != 0) {
            int i5 = 90 / 0;
        }
        int i6 = i2 + 75;
        q = i6 % 128;
        int i7 = i6 % 2;
        return progressDialog;
    }

    public static void q(CnicValidationActivity cnicValidationActivity, String str, String str2) {
        int i = 2 % 2;
        Typeface typefaceB = C0084m.b(cnicValidationActivity.ab, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(cnicValidationActivity);
        View viewInflate = LayoutInflater.from(cnicValidationActivity).inflate(R.layout.custom_dialog_new, (ViewGroup) cnicValidationActivity.findViewById(android.R.id.content), false);
        aiz.c(viewInflate);
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        textView.setTypeface(typefaceB);
        textView2.setTypeface(typefaceB);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_no);
        textView3.setOnClickListener(new j(cnicValidationActivity, bVarB));
        textView4.setOnClickListener(new T(cnicValidationActivity, bVarB));
        int i2 = q + 109;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void t(CnicValidationActivity cnicValidationActivity, String str, ArrayList arrayList) {
        int i = 2 % 2;
        int i2 = q + 71;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            cnicValidationActivity.x(str, arrayList);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        cnicValidationActivity.x(str, arrayList);
        int i3 = q + 89;
        p = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
    }

    public static void v(CnicValidationActivity cnicValidationActivity, String str, String str2) {
        int i = 2 % 2;
        C0084m.b(cnicValidationActivity.ab, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(cnicValidationActivity);
        View viewInflate = LayoutInflater.from(cnicValidationActivity).inflate(R.layout.custom_dialog_new, (ViewGroup) cnicValidationActivity.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText("Fingerprint Error");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        textView2.setText(sb.toString());
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        ((TextView) viewInflate.findViewById(R.id.btn_no)).setVisibility(8);
        textView3.setText("OK");
        textView3.setOnClickListener(new S(cnicValidationActivity, bVarB));
        int i2 = q + 23;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(this);
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.e = "Alert!";
        oooO0O0.f = "Do you wants to exit";
        oooO0O0.k = false;
        OooO00o oooO00o = new OooO00o();
        oooO0O0.h = "yes";
        oooO0O0.i = oooO00o;
        OooO0O0 oooO0O1 = new OooO0O0(this);
        oooO0O0.a = "no";
        oooO0O0.j = oooO0O1;
        aiz.b().show();
        int i2 = q + 41;
        p = i2 % 128;
        int i3 = i2 % 2;
    }

    public class OooO00o implements DialogInterface.OnClickListener {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = 2 % 2;
            CnicValidationActivity cnicValidationActivity = CnicValidationActivity.this;
            Intent intent = new Intent(CnicValidationActivity.this, (Class<?>) ActivityEnumeratorMain.class);
            int i3 = b + 80;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                cnicValidationActivity.startActivity(intent);
                CnicValidationActivity.this.finishAffinity();
                int i5 = 75 / 0;
            } else {
                cnicValidationActivity.startActivity(intent);
                CnicValidationActivity.this.finishAffinity();
            }
            int i6 = b;
            int i7 = i6 & 117;
            int i8 = (i6 | 117) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                dialogInterface.cancel();
            } else {
                dialogInterface.cancel();
                throw null;
            }
        }
    }

    public class OooO0OO extends Handler {
        private static int a = 1;
        private static int b;

        public OooO0OO() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[PHI: r5
  0x0037: PHI (r5v13 ivas.gov.bisp.enumeration.activity.CnicValidationActivity) = 
  (r5v12 ivas.gov.bisp.enumeration.activity.CnicValidationActivity)
  (r5v23 ivas.gov.bisp.enumeration.activity.CnicValidationActivity)
 binds: [B:10:0x0035, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:13:0x003b  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CnicValidationActivity cnicValidationActivity;
            byte[] bArr;
            int i = 2 % 2;
            int i2 = (-2) - ((a + 20) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            if (message.what == 0) {
                int i4 = b;
                int i5 = i4 & 5;
                int i6 = (i5 - (~((i4 ^ 5) | i5))) - 1;
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    cnicValidationActivity = CnicValidationActivity.this;
                    int i7 = 70 / 0;
                    if (cnicValidationActivity.O) {
                        bArr = cnicValidationActivity.R;
                        if (bArr != null) {
                            int i8 = a;
                            int i9 = (i8 ^ 82) + ((i8 & 82) << 1);
                            int i10 = (i9 ^ (-1)) + (i9 << 1);
                            b = i10 % 128;
                            int i11 = i10 % 2;
                            cnicValidationActivity.T = G.c(bArr);
                            CnicValidationActivity cnicValidationActivity2 = CnicValidationActivity.this;
                            ImageView imageView = cnicValidationActivity2.J;
                            int i12 = a;
                            int i13 = (i12 & 103) + (i12 | 103);
                            b = i13 % 128;
                            int i14 = i13 % 2;
                            imageView.setImageBitmap(cnicValidationActivity2.T);
                            CnicValidationActivity cnicValidationActivity3 = CnicValidationActivity.this;
                            ImageView imageView2 = cnicValidationActivity3.B;
                            int i15 = b;
                            int i16 = ((i15 & 110) + (i15 | 110)) - 1;
                            a = i16 % 128;
                            int i17 = i16 % 2;
                            imageView2.setImageBitmap(cnicValidationActivity3.T);
                            int i18 = b;
                            int i19 = ((i18 | 32) << 1) - (i18 ^ 32);
                            int i20 = (i19 ^ (-1)) + (i19 << 1);
                            a = i20 % 128;
                            int i21 = i20 % 2;
                        }
                    }
                } else {
                    cnicValidationActivity = CnicValidationActivity.this;
                    if (cnicValidationActivity.O) {
                        bArr = cnicValidationActivity.R;
                        if (bArr != null) {
                            int i22 = a;
                            int i23 = (i22 ^ 82) + ((i22 & 82) << 1);
                            int i110 = (i23 ^ (-1)) + (i23 << 1);
                            b = i110 % 128;
                            int i111 = i110 % 2;
                            cnicValidationActivity.T = G.c(bArr);
                            CnicValidationActivity cnicValidationActivity4 = CnicValidationActivity.this;
                            ImageView imageView3 = cnicValidationActivity4.J;
                            int i112 = a;
                            int i113 = (i112 & 103) + (i112 | 103);
                            b = i113 % 128;
                            int i114 = i113 % 2;
                            imageView3.setImageBitmap(cnicValidationActivity4.T);
                            CnicValidationActivity cnicValidationActivity5 = CnicValidationActivity.this;
                            ImageView imageView4 = cnicValidationActivity5.B;
                            int i115 = b;
                            int i116 = ((i115 & 110) + (i115 | 110)) - 1;
                            a = i116 % 128;
                            int i117 = i116 % 2;
                            imageView4.setImageBitmap(cnicValidationActivity5.T);
                            int i118 = b;
                            int i119 = ((i118 | 32) << 1) - (i118 ^ 32);
                            int i24 = (i119 ^ (-1)) + (i119 << 1);
                            a = i24 % 128;
                            int i25 = i24 % 2;
                        }
                    }
                }
            }
            int i26 = b;
            int i27 = (i26 & 55) + (i26 | 55);
            a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 36 / 0;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = p + 69;
        q = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (!TextUtils.isEmpty(this.ah)) {
            int i4 = q + 103;
            p = i4 % 128;
            int i5 = i4 % 2;
            this.w.setText(this.ah);
        }
        this.y.setText(BuildConfig.FLAVOR);
    }

    public class OooO0o implements AdapterView.OnItemSelectedListener {
        private static int a = 0;
        private static int b = 1;

        public OooO0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 100) + ((i2 & 100) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-58)) | ((~i3) & 57);
            int i5 = -(-((i3 & 57) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                CnicValidationActivity.this.F.getCheckedRadioButtonId();
                obj.hashCode();
                throw null;
            }
            int checkedRadioButtonId = CnicValidationActivity.this.F.getCheckedRadioButtonId();
            CnicValidationActivity cnicValidationActivity = CnicValidationActivity.this;
            int i7 = a;
            int i8 = i7 ^ 101;
            int i9 = (i7 & 101) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                cnicValidationActivity.I.getId();
                throw null;
            }
            if (checkedRadioButtonId == cnicValidationActivity.I.getId()) {
                CnicValidationActivity.this.C = i;
                int i11 = b;
                int i12 = i11 & 19;
                int i13 = ((((i11 ^ 19) | i12) << 1) - (~(-((i11 | 19) & (~i12))))) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                return;
            }
            if (checkedRadioButtonId == CnicValidationActivity.this.G.getId()) {
                int i15 = b;
                int i16 = i15 + 27;
                a = i16 % 128;
                if (i16 % 2 == 0 ? i != 1 : i != 0) {
                    int i17 = ((i15 | 121) << 1) - (i15 ^ 121);
                    int i18 = i17 % 128;
                    a = i18;
                    if (i17 % 2 == 0 ? i == 2 : i == 2) {
                        CnicValidationActivity.this.C = 7;
                        int i19 = a;
                        int i20 = (i19 ^ 37) + ((i19 & 37) << 1);
                        b = i20 % 128;
                        if (i20 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    if (i == 3) {
                        CnicValidationActivity.this.C = 8;
                        int i21 = b;
                        int i22 = (i21 | 55) << 1;
                        int i23 = -(i21 ^ 55);
                        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                        a = i24 % 128;
                        if (i24 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    int i25 = i18 + 81;
                    int i26 = i25 % 128;
                    b = i26;
                    int i27 = i25 % 2;
                    if (i == 4) {
                        CnicValidationActivity.this.C = 9;
                        int i28 = a;
                        int i29 = (i28 & (-56)) | ((~i28) & 55);
                        int i30 = (i28 & 55) << 1;
                        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                        return;
                    }
                    int i33 = ((i26 & 98) + (i26 | 98)) - 1;
                    int i34 = i33 % 128;
                    a = i34;
                    int i35 = i33 % 2;
                    if (i != 5) {
                        int i36 = (i34 & 59) + (i34 | 59);
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        CnicValidationActivity.this.C = 0;
                        int i38 = a + 41;
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        return;
                    }
                    CnicValidationActivity.this.C = 10;
                    int i40 = a;
                    int i41 = i40 ^ 9;
                    int i42 = ((((i40 & 9) | i41) << 1) - (~(-i41))) - 1;
                    b = i42 % 128;
                    if (i42 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                CnicValidationActivity.this.C = 6;
                int i43 = a + 20;
                int i44 = (i43 ^ (-1)) + (i43 << 1);
                b = i44 % 128;
                int i45 = i44 % 2;
            }
            int i46 = a;
            int i47 = i46 & 119;
            int i48 = ((i46 ^ 119) | i47) << 1;
            int i49 = -((i46 | 119) & (~i47));
            int i50 = (i48 & i49) + (i49 | i48);
            b = i50 % 128;
            if (i50 % 2 == 0) {
                throw null;
            }
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
            int i2 = b;
            int i3 = ((i2 & 12) + (i2 | 12)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (!(!CnicValidationActivity.this.O)) {
                while (true) {
                    CnicValidationActivity cnicValidationActivity = CnicValidationActivity.this;
                    if (!cnicValidationActivity.O) {
                        break;
                    }
                    int i5 = a;
                    int i6 = i5 ^ 31;
                    int i7 = ((i5 & 31) | i6) << 1;
                    int i8 = -i6;
                    int i9 = (i7 & i8) + (i7 | i8);
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    Objects.requireNonNull(cnicValidationActivity.K);
                    CnicValidationActivity cnicValidationActivity2 = CnicValidationActivity.this;
                    int i11 = a;
                    int i12 = i11 & 113;
                    int i13 = i11 | 113;
                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        cnicValidationActivity2.K.i(cnicValidationActivity2.Q);
                        obj.hashCode();
                        throw null;
                    }
                    int i15 = cnicValidationActivity2.K.i(cnicValidationActivity2.Q);
                    CnicValidationActivity cnicValidationActivity3 = CnicValidationActivity.this;
                    ivas.gov.bisp.enumeration.p037bj.c cVar = cnicValidationActivity3.K;
                    byte[] bArr = cnicValidationActivity3.Q;
                    int i16 = b;
                    int i17 = (i16 ^ 67) + ((i16 & 67) << 1);
                    a = i17 % 128;
                    if (i17 % 2 != 0) {
                        cVar.g(bArr);
                        Log.e("fenglei", "capture get data end");
                        obj.hashCode();
                        throw null;
                    }
                    cVar.g(bArr);
                    Log.e("fenglei", "capture get data end");
                    int i18 = b;
                    int i19 = (i18 & (-126)) | ((~i18) & 125);
                    int i20 = -(-((i18 & 125) << 1));
                    int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    if (i15 == 1) {
                        int i23 = (((i18 | 122) << 1) - (i18 ^ 122)) - 1;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        Base64.encodeToString(CnicValidationActivity.this.Q, 2);
                        CnicValidationActivity cnicValidationActivity4 = CnicValidationActivity.this;
                        int i25 = b + 53;
                        a = i25 % 128;
                        if (i25 % 2 != 0) {
                            G.d(cnicValidationActivity4.Q, cnicValidationActivity4.P, cnicValidationActivity4.M);
                            throw null;
                        }
                        G.d(cnicValidationActivity4.Q, cnicValidationActivity4.P, cnicValidationActivity4.M);
                        int i26 = b;
                        int i27 = (i26 ^ 87) + ((i26 & 87) << 1);
                        a = i27 % 128;
                        if (i27 % 2 != 0) {
                            CnicValidationActivity cnicValidationActivity5 = CnicValidationActivity.this;
                            byte[] bArr2 = cnicValidationActivity5.Q;
                            int i28 = cnicValidationActivity5.P;
                            throw null;
                        }
                        CnicValidationActivity cnicValidationActivity6 = CnicValidationActivity.this;
                        cnicValidationActivity6.R = G.b(cnicValidationActivity6.Q, cnicValidationActivity6.P, cnicValidationActivity6.M);
                        Message message = new Message();
                        int i29 = a + 21;
                        b = i29 % 128;
                        if (i29 % 2 == 0) {
                            message.what = 1;
                        } else {
                            message.what = 0;
                        }
                        Handler handler = CnicValidationActivity.this.al;
                        int i30 = a;
                        int i31 = (i30 & 14) + (i30 | 14);
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        handler.sendMessage(message);
                        int i34 = a;
                        int i35 = i34 & 9;
                        int i36 = (((i34 | 9) & (~i35)) - (~(-(-(i35 << 1))))) - 1;
                        b = i36 % 128;
                        int i37 = i36 % 2;
                    }
                }
            }
            int i38 = a;
            int i39 = i38 & 101;
            int i40 = (i38 | 101) & (~i39);
            int i41 = -(-(i39 << 1));
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            b = i42 % 128;
            if (i42 % 2 == 0) {
                throw null;
            }
        }
    }

    public class OooO implements RadioGroup.OnCheckedChangeListener {
        private static int a = 1;
        private static int b;

        public OooO() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            r10 = (r1 ^ 103) + ((r1 & 103) << 1);
            ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.a = r10 % 128;
            r10 = r10 % 2;
            r8.c.W.setVisibility(0);
            r10 = r8.c;
            r0 = ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.a;
            r1 = r0 ^ 27;
            r0 = (r0 & 27) << 1;
            r3 = ((r1 | r0) << 1) - (r0 ^ r1);
            ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.b = r3 % 128;
            r3 = r3 % 2;
            r10.aa.setVisibility(8);
            r10 = r8.c.w;
            r0 = ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.a;
            r1 = r0 ^ 73;
            r0 = -(-((r0 & 73) << 1));
            r2 = (r1 ^ r0) + ((r0 & r1) << 1);
            ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
        
            if ((r2 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
        
            r10.setText(net.sqlcipher.BuildConfig.FLAVOR);
            r8.c.y.setText(net.sqlcipher.BuildConfig.FLAVOR);
            r10 = ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.a;
            r10 = (-2) - ((((r10 | 66) << 1) - (r10 ^ 66)) ^ (-1));
            ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.b = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
        
            if ((r10 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
        
            r10.setText(net.sqlcipher.BuildConfig.FLAVOR);
            r9 = r8.c.y;
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
        
            if (r10 == ivas.gov.bisp.enumeration.R.id.rdofrm) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        
            if (r10 == ivas.gov.bisp.enumeration.R.id.rdofrm) goto L10;
         */
        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCheckedChanged(android.widget.RadioGroup r9, int r10) {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.activity.CnicValidationActivity.OooO.onCheckedChanged(android.widget.RadioGroup, int):void");
        }
    }

    public void y() {
        int i = 2 % 2;
        int i2 = p + 45;
        q = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((ivas.gov.bisp.enumeration.de.j) this.ag.h(this.ab)).getInt("last_time_started", -1);
        int i5 = Calendar.getInstance().get(6);
        if (i5 == i4) {
            z();
            return;
        }
        int i6 = q + 3;
        p = i6 % 128;
        int i7 = i6 % 2;
        ((ivas.gov.bisp.enumeration.de.j) this.ag.h(this.ab)).edit().putInt("last_time_started", i5).apply();
        ((ivas.gov.bisp.enumeration.de.j) this.ag.h(this.ab)).edit().putInt("survey_count", 0).apply();
        z();
    }

    public final void z() {
        int i = 2 % 2;
        int i2 = q + 3;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            ak.g(this);
            throw null;
        }
        if (!ak.g(this)) {
            Toast.makeText(getApplicationContext(), "You need to sync your application in order to proceed.", 1).show();
            return;
        }
        if (ah.c.d.getInt("enum_survey_limit", 100) > 0) {
            Objects.requireNonNull((BISPApplication) getApplicationContext());
            BISPApplication.f = false;
            startActivity(new Intent(this, (Class<?>) ActivityBeginSurvey.class));
            finish();
            return;
        }
        Toast.makeText(getApplicationContext(), "Maximum survey limit reached. Sync with supervisor to proceed", 1).show();
        int i3 = q + 103;
        p = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        int i = 2 % 2;
        int id = view.getId();
        if (id == R.id.btn_login) {
            String string = this.w.getText().toString();
            this.V = string;
            if (TextUtils.isEmpty(string)) {
                int i2 = p + 105;
                q = i2 % 128;
                int i3 = i2 % 2;
                Toast.makeText(this, "Please enter CNIC", 0).show();
                return;
            }
            BISPApplication bISPApplication = BISPApplication.c;
            if (this.S.equals(BuildConfig.FLAVOR)) {
                int i4 = q + 43;
                p = i4 % 128;
                int i5 = i4 % 2;
                if (this.ag.v() == 1) {
                    int i6 = q + 85;
                    p = i6 % 128;
                    (i6 % 2 == 0 ? Toast.makeText(this, "Please scan finger", 1) : Toast.makeText(this, "Please scan finger", 0)).show();
                    return;
                }
            }
            this.U.setEnabled(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("Data", "BISP NSER Dynamic Registry");
                jSONObject2.put("string1", b.d(jSONObject.toString(), b.b(this.ag.k()), b.b(this.ag.m())));
                byte[] bArrB = b.b(this.ag.k());
                byte[] bArrB2 = b.b(this.ag.m());
                Object[] objArr = new Object[1];
                a(super.getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 11, new char[]{46724, 1985, 53777, 48065, 22758, 48117, 13727, 39094, 4311, 38118, 64291, 62014, 30506, 20384, 36637, 15383}, objArr);
                jSONObject2.put("string2", b.d(((String) objArr[0]).intern(), bArrB, bArrB2));
                ax.h(this.af, "Kindly wait for time checking!");
                Log.e("CnicValidationActivity", "requestServerTime API Call");
                ax.e(jSONObject2, this, "https://meladeskapp.bisp.gov.pk/api/Users/UbZJVzTu9rHlQm0D", new Q(this));
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        if (id == R.id.img_fp) {
            x("0", new ArrayList<>());
            return;
        }
        int i7 = q + 41;
        p = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (id == R.id.select_finger) {
            if (this.w.getText().toString().length() <= 0) {
                Toast.makeText(getApplicationContext(), "Kindly Enter CNIC First", 0).show();
                this.A.dismiss();
                return;
            }
            if (this.C <= 0) {
                Toast.makeText(getApplicationContext(), "Kindly select from given options", 0).show();
                return;
            }
            int i8 = p + 119;
            q = i8 % 128;
            int i9 = i8 % 2;
            this.S = BuildConfig.FLAVOR;
            Base64.encodeToString(this.Q, 2);
            if (this.T == null) {
                Toast.makeText(this, "Please Place Finger", 1).show();
                return;
            }
            int i10 = q + 95;
            p = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (this.O) {
                this.O = false;
                this.N.shutdownNow();
                this.N = null;
                this.K.e();
            }
            byte[] bArrD = an.c().d(this.T);
            this.S = Base64.encodeToString(bArrD, 0);
            Base64.encodeToString(bArrD, 0);
            this.A.dismiss();
        }
    }

    public static void r(CnicValidationActivity cnicValidationActivity, int i, String str, String str2) {
        int i2 = 2 % 2;
        Typeface typefaceB = C0084m.b(cnicValidationActivity.ab, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(cnicValidationActivity);
        View viewInflate = LayoutInflater.from(cnicValidationActivity).inflate(R.layout.custom_dialog_new, (ViewGroup) cnicValidationActivity.findViewById(android.R.id.content), false);
        aiz.a.f1o = viewInflate;
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        textView.setText(str);
        textView2.setText(str2);
        if (!Pattern.compile("^[a-zA-Z\\.\\?\\ ]*$").matcher(str2).matches()) {
            int i3 = q + 99;
            p = i3 % 128;
            if (i3 % 2 == 0) {
                textView2.setTypeface(typefaceB);
                throw null;
            }
            textView2.setTypeface(typefaceB);
        }
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_no);
        textView3.setOnClickListener(new ViewOnClickListenerC0184m(cnicValidationActivity, bVarB, i));
        textView4.setOnClickListener(new O(cnicValidationActivity, bVarB));
        int i4 = q + 83;
        p = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void u(CnicValidationActivity cnicValidationActivity) {
        int i = 2 % 2;
        Typeface typefaceB = C0084m.b(cnicValidationActivity, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(cnicValidationActivity);
        int i2 = 0;
        View viewInflate = LayoutInflater.from(cnicValidationActivity).inflate(R.layout.custom_dialog_new, (ViewGroup) cnicValidationActivity.findViewById(android.R.id.content), false);
        aiz.c(viewInflate);
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_no);
        textView.setText("Roster Update");
        textView.setTextColor(-65536);
        textView.setTextSize(20.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView2.setText("رَوسٹر دستیاب نہیں ہے۔\nسروے کی اپ ڈیٹ دستیاب نہیں ہے۔");
        if (!Pattern.compile("^[a-zA-Z\\.\\?\\ ]*$").matcher("رَوسٹر دستیاب نہیں ہے۔\nسروے کی اپ ڈیٹ دستیاب نہیں ہے۔").matches()) {
            int i3 = p + 95;
            q = i3 % 128;
            int i4 = i3 % 2;
            textView2.setTypeface(typefaceB);
        }
        textView3.setText("OK");
        textView3.setOnClickListener(new N(bVarB, i2));
        textView4.setVisibility(8);
        int i5 = p + 69;
        q = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void s(CnicValidationActivity cnicValidationActivity, String str) {
        int i = 2 % 2;
        Typeface typefaceB = C0084m.b(cnicValidationActivity, R.font.jameel_noori_nastaleeq);
        androidx.appcompat.app.b.aIz aiz = new androidx.appcompat.app.b.aIz(cnicValidationActivity);
        View viewInflate = LayoutInflater.from(cnicValidationActivity).inflate(R.layout.custom_dialog_new, (ViewGroup) cnicValidationActivity.findViewById(android.R.id.content), false);
        aiz.c(viewInflate);
        androidx.appcompat.app.b bVarB = aiz.b();
        bVarB.show();
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_heading);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_message);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_ok);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_no);
        textView.setText("Survey Count Exhausted");
        textView.setTextColor(-65536);
        textView.setTextSize(20.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        textView2.setText(str);
        if (!Pattern.compile("^[a-zA-Z\\.\\?\\ ]*$").matcher(str).matches()) {
            textView2.setTypeface(typefaceB);
            int i2 = q + 123;
            p = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 3;
            }
        }
        textView3.setText("OK");
        textView3.setOnClickListener(new ivas.gov.bisp.enumeration.p043bp.T(bVarB, 1));
        textView4.setVisibility(8);
        int i4 = q + 123;
        p = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0232  */
    /* JADX WARN: Code duplicated, block: B:80:0x0264  */
    /* JADX WARN: Code duplicated, block: B:83:0x0274  */
    /* JADX WARN: Code duplicated, block: B:85:0x0281 A[Catch: JSONException -> 0x0351, TRY_ENTER, TryCatch #1 {JSONException -> 0x0351, blocks: (B:3:0x0021, B:5:0x005c, B:7:0x0075, B:10:0x0092, B:13:0x00d9, B:15:0x00e6, B:19:0x0101, B:21:0x010b, B:23:0x0118, B:25:0x0122, B:27:0x012f, B:29:0x013a, B:31:0x0147, B:35:0x015d, B:37:0x0167, B:45:0x017a, B:47:0x0184, B:49:0x0191, B:54:0x01b5, B:56:0x01bb, B:65:0x01d6, B:67:0x01e6, B:69:0x01ec, B:71:0x01fb, B:73:0x021f, B:75:0x0225, B:77:0x0234, B:81:0x026e, B:85:0x0281, B:87:0x028e, B:89:0x0299, B:92:0x02ed, B:94:0x02f3, B:96:0x0302, B:86:0x0288, B:57:0x01c8, B:59:0x01cc, B:60:0x01cf, B:42:0x016d, B:18:0x00f7, B:97:0x0336, B:6:0x0069), top: B:106:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0288 A[Catch: JSONException -> 0x0351, TryCatch #1 {JSONException -> 0x0351, blocks: (B:3:0x0021, B:5:0x005c, B:7:0x0075, B:10:0x0092, B:13:0x00d9, B:15:0x00e6, B:19:0x0101, B:21:0x010b, B:23:0x0118, B:25:0x0122, B:27:0x012f, B:29:0x013a, B:31:0x0147, B:35:0x015d, B:37:0x0167, B:45:0x017a, B:47:0x0184, B:49:0x0191, B:54:0x01b5, B:56:0x01bb, B:65:0x01d6, B:67:0x01e6, B:69:0x01ec, B:71:0x01fb, B:73:0x021f, B:75:0x0225, B:77:0x0234, B:81:0x026e, B:85:0x0281, B:87:0x028e, B:89:0x0299, B:92:0x02ed, B:94:0x02f3, B:96:0x0302, B:86:0x0288, B:57:0x01c8, B:59:0x01cc, B:60:0x01cf, B:42:0x016d, B:18:0x00f7, B:97:0x0336, B:6:0x0069), top: B:106:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0295  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f3 A[Catch: JSONException -> 0x0351, TryCatch #1 {JSONException -> 0x0351, blocks: (B:3:0x0021, B:5:0x005c, B:7:0x0075, B:10:0x0092, B:13:0x00d9, B:15:0x00e6, B:19:0x0101, B:21:0x010b, B:23:0x0118, B:25:0x0122, B:27:0x012f, B:29:0x013a, B:31:0x0147, B:35:0x015d, B:37:0x0167, B:45:0x017a, B:47:0x0184, B:49:0x0191, B:54:0x01b5, B:56:0x01bb, B:65:0x01d6, B:67:0x01e6, B:69:0x01ec, B:71:0x01fb, B:73:0x021f, B:75:0x0225, B:77:0x0234, B:81:0x026e, B:85:0x0281, B:87:0x028e, B:89:0x0299, B:92:0x02ed, B:94:0x02f3, B:96:0x0302, B:86:0x0288, B:57:0x01c8, B:59:0x01cc, B:60:0x01cf, B:42:0x016d, B:18:0x00f7, B:97:0x0336, B:6:0x0069), top: B:106:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0300  */
    public static void o(CnicValidationActivity cnicValidationActivity, String str) {
        String str2;
        String str3;
        int i;
        String string;
        int i2;
        String string2;
        int i3;
        String string3;
        int i4;
        String string4;
        int i5;
        int i6;
        String str4;
        String string5;
        String str5 = "bank_address";
        String str6 = "branch_code";
        String str7 = "banks_name";
        String str8 = "mobile_no";
        int i7 = 2 % 2;
        Objects.requireNonNull(cnicValidationActivity);
        cnicValidationActivity.ad = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_Benificiary".toLowerCase());
            String string6 = jSONObject.getString("hhid".toLowerCase());
            String string7 = jSONObject.getString("message".toLowerCase());
            String string8 = jSONObject.getString("hH_Name".toLowerCase());
            String string9 = jSONObject.getString("form_number".toLowerCase());
            if (!z) {
                cnicValidationActivity.ag.A(cnicValidationActivity.getString(R.string.no));
            } else {
                cnicValidationActivity.ag.A(cnicValidationActivity.getString(R.string.yes));
            }
            JSONArray jSONArray = jSONObject.getJSONArray("rosterList".toLowerCase());
            int length = jSONArray.length();
            int i8 = p + 79;
            q = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String string10 = jSONObject2.getString("cnic".toLowerCase());
                int i11 = jSONObject2.getInt("disabilityCode".toLowerCase());
                String string11 = jSONObject2.getString("disabilityStatus".toLowerCase());
                String string12 = jSONObject2.getString("discrepancy_status".toLowerCase());
                String string13 = jSONObject2.getString("dob".toLowerCase());
                ag.k(string13);
                JSONArray jSONArray2 = jSONArray;
                String string14 = jSONObject2.has(str8.toLowerCase()) ? jSONObject2.getString(str8.toLowerCase()) : BuildConfig.FLAVOR;
                String str9 = str8;
                String string15 = jSONObject2.has("mobile_network_name".toLowerCase()) ^ true ? BuildConfig.FLAVOR : jSONObject2.getString("mobile_network_name".toLowerCase());
                String string16 = jSONObject2.has(str7.toLowerCase()) ? jSONObject2.getString(str7.toLowerCase()) : BuildConfig.FLAVOR;
                int i12 = jSONObject2.has(str6.toLowerCase()) ? jSONObject2.getInt(str6.toLowerCase()) : 0;
                String string17 = !(jSONObject2.has(str5.toLowerCase()) ^ true) ? jSONObject2.getString(str5.toLowerCase()) : BuildConfig.FLAVOR;
                if (jSONObject2.has("account_title".toLowerCase())) {
                    int i13 = q + 77;
                    p = i13 % 128;
                    if (i13 % 2 == 0) {
                        string5 = jSONObject2.getString("account_title".toLowerCase());
                        int i14 = 18 / 0;
                    } else {
                        string5 = jSONObject2.getString("account_title".toLowerCase());
                    }
                    str2 = string5;
                } else {
                    str2 = BuildConfig.FLAVOR;
                }
                String string18 = jSONObject2.has("account_number".toLowerCase()) ? jSONObject2.getString("account_number".toLowerCase()) : BuildConfig.FLAVOR;
                String string19 = jSONObject2.getString("educationLevelCode".toLowerCase());
                String str10 = str5;
                if (string19.equals("null")) {
                    str3 = str6;
                } else {
                    int i15 = p + 105;
                    str3 = str6;
                    q = i15 % 128;
                    if (i15 % 2 != 0) {
                        string19.equals(BuildConfig.FLAVOR);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!string19.equals(BuildConfig.FLAVOR)) {
                        i = Integer.parseInt(string19.split("\\.")[0]);
                    }
                    string = jSONObject2.getString("employmentCode".toLowerCase());
                    if (!string.equals("null") || string.equals(BuildConfig.FLAVOR)) {
                        i2 = -1;
                    } else {
                        i2 = Integer.parseInt(string.split("\\.")[0]);
                    }
                    String string20 = jSONObject2.getString("employmentStatus".toLowerCase());
                    String string21 = jSONObject2.getString("gender".toLowerCase());
                    string2 = jSONObject2.getString("goneToSchoolCode".toLowerCase());
                    if (!string2.equals("null") || string2.equals(BuildConfig.FLAVOR)) {
                        i3 = -1;
                    } else {
                        i3 = Integer.parseInt(string2.split("\\.")[0]);
                    }
                    int i16 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                    String string22 = jSONObject2.getString("hhMemberNames".toLowerCase());
                    boolean z2 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                    string3 = jSONObject2.getString("lastWeekWorkingHours".toLowerCase());
                    if (!string3.equals("null")) {
                        int i17 = q + 99;
                        p = i17 % 128;
                        int i18 = i17 % 2;
                        if (string3.equals(BuildConfig.FLAVOR)) {
                            i4 = 0;
                        } else {
                            i6 = q + 65;
                            p = i6 % 128;
                            if (i6 % 2 == 0) {
                                str4 = string3.split("\\.")[0];
                            } else {
                                str4 = string3.split("\\.")[0];
                            }
                            i4 = Integer.parseInt(str4);
                        }
                    } else {
                        i4 = 0;
                    }
                    String string23 = jSONObject2.getString("maritalStatus".toLowerCase());
                    int i19 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                    String string24 = jSONObject2.getString("message".toLowerCase());
                    int i20 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                    long j = jSONObject2.getLong("rId".toLowerCase());
                    String string25 = jSONObject2.getString("workStatus".toLowerCase());
                    string4 = jSONObject2.getString("workStatusCode".toLowerCase());
                    if (string4.equals("null")) {
                        i5 = -1;
                    } else {
                        int i21 = q + 23;
                        p = i21 % 128;
                        int i22 = i21 % 2;
                        if (string4.equals(BuildConfig.FLAVOR)) {
                            i5 = -1;
                        } else {
                            i5 = Integer.parseInt(string4.split("\\.")[0]);
                        }
                    }
                    cnicValidationActivity.ad.add(new RosterItem(string6, z, string7, string8, string10, i11, string11, string12, string13, i, i2, string20, string9, string21, i3, i16, string22, z2, i4, string23, i19, string24, i20, j, string25, i5, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string14, string15, string16, i12, string17, str2, string18));
                    i10++;
                    length = length;
                    jSONArray = jSONArray2;
                    str8 = str9;
                    str5 = str10;
                    str6 = str3;
                    str7 = str7;
                }
                i = -1;
                string = jSONObject2.getString("employmentCode".toLowerCase());
                if (string.equals("null")) {
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                String string26 = jSONObject2.getString("employmentStatus".toLowerCase());
                String string27 = jSONObject2.getString("gender".toLowerCase());
                string2 = jSONObject2.getString("goneToSchoolCode".toLowerCase());
                if (string2.equals("null")) {
                    i3 = -1;
                } else {
                    i3 = -1;
                }
                int i110 = jSONObject2.getInt("havingChronicDiseaseCode".toLowerCase());
                String string28 = jSONObject2.getString("hhMemberNames".toLowerCase());
                boolean z3 = jSONObject2.getBoolean("isLiterate".toLowerCase());
                string3 = jSONObject2.getString("lastWeekWorkingHours".toLowerCase());
                if (!string3.equals("null")) {
                    int i111 = q + 99;
                    p = i111 % 128;
                    int i112 = i111 % 2;
                    if (string3.equals(BuildConfig.FLAVOR)) {
                        i6 = q + 65;
                        p = i6 % 128;
                        if (i6 % 2 == 0) {
                            str4 = string3.split("\\.")[0];
                        } else {
                            str4 = string3.split("\\.")[0];
                        }
                        i4 = Integer.parseInt(str4);
                    } else {
                        i4 = 0;
                    }
                } else {
                    i4 = 0;
                }
                String string29 = jSONObject2.getString("maritalStatus".toLowerCase());
                int i113 = jSONObject2.getInt("maritalStatusCode".toLowerCase());
                String string210 = jSONObject2.getString("message".toLowerCase());
                int i23 = jSONObject2.getInt("relationToHhHead".toLowerCase());
                long j2 = jSONObject2.getLong("rId".toLowerCase());
                String string211 = jSONObject2.getString("workStatus".toLowerCase());
                string4 = jSONObject2.getString("workStatusCode".toLowerCase());
                if (string4.equals("null")) {
                    int i24 = q + 23;
                    p = i24 % 128;
                    int i25 = i24 % 2;
                    if (string4.equals(BuildConfig.FLAVOR)) {
                        i5 = Integer.parseInt(string4.split("\\.")[0]);
                    } else {
                        i5 = -1;
                    }
                } else {
                    i5 = -1;
                }
                cnicValidationActivity.ad.add(new RosterItem(string6, z, string7, string8, string10, i11, string11, string12, string13, i, i2, string26, string9, string27, i3, i110, string28, z3, i4, string29, i113, string210, i23, j2, string211, i5, jSONObject2.getJSONObject("duplicateRosters".toLowerCase()).toString(), string14, string15, string16, i12, string17, str2, string18));
                i10++;
                length = length;
                jSONArray = jSONArray2;
                str8 = str9;
                str5 = str10;
                str6 = str3;
                str7 = str7;
            }
            BISPApplication bISPApplication = cnicValidationActivity.am;
            bISPApplication.N = null;
            bISPApplication.N = cnicValidationActivity.ad;
            int i26 = p + 53;
            q = i26 % 128;
            if (i26 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8 A[Catch: Exception -> 0x013b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x013b, blocks: (B:21:0x00a7, B:25:0x00b8, B:38:0x00e5, B:41:0x0120, B:42:0x0125, B:43:0x012e), top: B:66:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0125 A[SYNTHETIC] */
    public final void x(String str, ArrayList<String> arrayList) {
        int i;
        int i2;
        int i3;
        String str2;
        RadioButton radioButton;
        int i4 = 2 % 2;
        C0084m.b(this, R.font.jameel_noori_nastaleeq);
        if (this.w.getText().toString().length() <= 0) {
            Toast.makeText(getApplicationContext(), "Please Enter CNIC.", 0).show();
            return;
        }
        if (!FragmentPictures.hasPermissions(this, this.x)) {
            k.c(this, this.x, 1);
            return;
        }
        this.Q = new byte[this.P * this.M];
        this.K = ivas.gov.bisp.enumeration.p037bj.c.c(getApplicationContext());
        if (this.ac.isShowing()) {
            this.ac.dismiss();
            this.ac.cancel();
        }
        this.ac.setCancelable(false);
        this.ac.setMessage("Please Wait...");
        this.ac.setProgressStyle(0);
        this.ac.show();
        Object obj = null;
        if (str.equals("701")) {
            this.ai.setVisibility(0);
            this.aj.setVisibility(8);
            this.C = 0;
            this.E.clearCheck();
            this.E.removeAllViews();
            this.z.setText("دی گئی انگلیوں کی فہرست میں سے ایک کا انتخاب کریں۔");
            for (i = 0; i < arrayList.size(); i++) {
                try {
                    i2 = p + 119;
                    q = i2 % 128;
                    if (i2 % 2 != 0) {
                        Integer.parseInt(arrayList.get(i));
                        obj.hashCode();
                        throw null;
                    }
                    i3 = Integer.parseInt(arrayList.get(i));
                    switch (i3) {
                        case 1:
                            str2 = "دائیں ہاتھ کاانگوٹھا";
                            break;
                        case 2:
                            str2 = "دائیں ہاتھ کی شہادت کی انگلی";
                            break;
                        case 3:
                            str2 = "دائیں ہاتھ کی درمیانی انگلی";
                            break;
                        case 4:
                            str2 = "دائیں ہاتھ کی انگوٹھی والی انگلی";
                            break;
                        case 5:
                            str2 = "دائیں ہاتھ کی چھوٹی انگلی";
                            break;
                        case 6:
                            str2 = "بائیں ہاتھ کاانگوٹھا";
                            break;
                        case 7:
                            str2 = "بائیں ہاتھ کی شہادت کی انگلی";
                            break;
                        case 8:
                            str2 = "بائیں ہاتھ کی درمیانی انگلی";
                            break;
                        case 9:
                            str2 = "بائیں ہاتھ کی انگوٹھی والی انگلی";
                            break;
                        case 10:
                            str2 = "بائیں ہاتھ کی چھوٹی انگلی";
                            break;
                        default:
                            str2 = BuildConfig.FLAVOR;
                            break;
                    }
                    radioButton = new RadioButton(this);
                    radioButton.setText(str2);
                    radioButton.setId(i3);
                    RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                    layoutParams.setMargins(16, 16, 16, 0);
                    radioButton.setLayoutParams(layoutParams);
                    radioButton.setTextSize(2, 24.0f);
                    radioButton.setTextColor(-16777216);
                    radioButton.setLayoutDirection(1);
                    radioButton.setGravity(8388608);
                    if (arrayList.size() == 1) {
                        int i5 = p + 27;
                        q = i5 % 128;
                        int i6 = i5 % 2;
                        radioButton.setChecked(true);
                        this.C = i3;
                    }
                    this.E.addView(radioButton);
                } catch (Exception unused) {
                }
            }
            this.E.setOnCheckedChangeListener(new OooOO0());
            int i7 = p + 41;
            q = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = q + 11;
            p = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 22 / 0;
                if (str.equals("702")) {
                    this.ai.setVisibility(0);
                    this.aj.setVisibility(8);
                    this.C = 0;
                    this.E.clearCheck();
                    this.E.removeAllViews();
                    this.z.setText("دی گئی انگلیوں کی فہرست میں سے ایک کا انتخاب کریں۔");
                    while (i < arrayList.size()) {
                        i2 = p + 119;
                        q = i2 % 128;
                        if (i2 % 2 != 0) {
                            Integer.parseInt(arrayList.get(i));
                            obj.hashCode();
                            throw null;
                        }
                        i3 = Integer.parseInt(arrayList.get(i));
                        switch (i3) {
                            case 1:
                                str2 = "دائیں ہاتھ کاانگوٹھا";
                                break;
                            case 2:
                                str2 = "دائیں ہاتھ کی شہادت کی انگلی";
                                break;
                            case 3:
                                str2 = "دائیں ہاتھ کی درمیانی انگلی";
                                break;
                            case 4:
                                str2 = "دائیں ہاتھ کی انگوٹھی والی انگلی";
                                break;
                            case 5:
                                str2 = "دائیں ہاتھ کی چھوٹی انگلی";
                                break;
                            case 6:
                                str2 = "بائیں ہاتھ کاانگوٹھا";
                                break;
                            case 7:
                                str2 = "بائیں ہاتھ کی شہادت کی انگلی";
                                break;
                            case 8:
                                str2 = "بائیں ہاتھ کی درمیانی انگلی";
                                break;
                            case 9:
                                str2 = "بائیں ہاتھ کی انگوٹھی والی انگلی";
                                break;
                            case 10:
                                str2 = "بائیں ہاتھ کی چھوٹی انگلی";
                                break;
                            default:
                                str2 = BuildConfig.FLAVOR;
                                break;
                        }
                        radioButton = new RadioButton(this);
                        radioButton.setText(str2);
                        radioButton.setId(i3);
                        RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(-1, -2);
                        layoutParams2.setMargins(16, 16, 16, 0);
                        radioButton.setLayoutParams(layoutParams2);
                        radioButton.setTextSize(2, 24.0f);
                        radioButton.setTextColor(-16777216);
                        radioButton.setLayoutDirection(1);
                        radioButton.setGravity(8388608);
                        if (arrayList.size() == 1) {
                            int i11 = p + 27;
                            q = i11 % 128;
                            int i12 = i11 % 2;
                            radioButton.setChecked(true);
                            this.C = i3;
                        }
                        this.E.addView(radioButton);
                    }
                    this.E.setOnCheckedChangeListener(new OooOO0());
                    int i13 = p + 41;
                    q = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else if (!(!str.equals("702"))) {
                this.ai.setVisibility(0);
                this.aj.setVisibility(8);
                this.C = 0;
                this.E.clearCheck();
                this.E.removeAllViews();
                this.z.setText("دی گئی انگلیوں کی فہرست میں سے ایک کا انتخاب کریں۔");
                while (i < arrayList.size()) {
                    i2 = p + 119;
                    q = i2 % 128;
                    if (i2 % 2 != 0) {
                        Integer.parseInt(arrayList.get(i));
                        obj.hashCode();
                        throw null;
                    }
                    i3 = Integer.parseInt(arrayList.get(i));
                    switch (i3) {
                        case 1:
                            str2 = "دائیں ہاتھ کاانگوٹھا";
                            break;
                        case 2:
                            str2 = "دائیں ہاتھ کی شہادت کی انگلی";
                            break;
                        case 3:
                            str2 = "دائیں ہاتھ کی درمیانی انگلی";
                            break;
                        case 4:
                            str2 = "دائیں ہاتھ کی انگوٹھی والی انگلی";
                            break;
                        case 5:
                            str2 = "دائیں ہاتھ کی چھوٹی انگلی";
                            break;
                        case 6:
                            str2 = "بائیں ہاتھ کاانگوٹھا";
                            break;
                        case 7:
                            str2 = "بائیں ہاتھ کی شہادت کی انگلی";
                            break;
                        case 8:
                            str2 = "بائیں ہاتھ کی درمیانی انگلی";
                            break;
                        case 9:
                            str2 = "بائیں ہاتھ کی انگوٹھی والی انگلی";
                            break;
                        case 10:
                            str2 = "بائیں ہاتھ کی چھوٹی انگلی";
                            break;
                        default:
                            str2 = BuildConfig.FLAVOR;
                            break;
                    }
                    radioButton = new RadioButton(this);
                    radioButton.setText(str2);
                    radioButton.setId(i3);
                    RadioGroup.LayoutParams layoutParams3 = new RadioGroup.LayoutParams(-1, -2);
                    layoutParams3.setMargins(16, 16, 16, 0);
                    radioButton.setLayoutParams(layoutParams3);
                    radioButton.setTextSize(2, 24.0f);
                    radioButton.setTextColor(-16777216);
                    radioButton.setLayoutDirection(1);
                    radioButton.setGravity(8388608);
                    if (arrayList.size() == 1) {
                        int i15 = p + 27;
                        q = i15 % 128;
                        int i16 = i15 % 2;
                        radioButton.setChecked(true);
                        this.C = i3;
                    }
                    this.E.addView(radioButton);
                }
                this.E.setOnCheckedChangeListener(new OooOO0());
                int i17 = p + 41;
                q = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        this.J.setImageResource(R.drawable.image_boarder);
        if (this.O) {
            this.O = false;
            this.N.shutdownNow();
            this.N = null;
        }
        this.K.d();
        this.A.show();
        this.I.setChecked(true);
        this.G.setChecked(false);
        int iF = this.K.f();
        int iH = this.K.h();
        int iJ = this.K.j();
        if (iH == 1) {
            int i19 = q + 9;
            p = i19 % 128;
            int i20 = i19 % 2;
            if (iJ == 1 && iF == 1) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.N = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new OooOO0O());
                this.O = true;
            } else {
                Toast.makeText(getApplicationContext(), "Drivers not initialized,Please try again", 0).show();
                this.A.dismiss();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Drivers not initialized,Please try again", 0).show();
            this.A.dismiss();
        }
        if (this.ac.isShowing()) {
            int i21 = p + 125;
            q = i21 % 128;
            int i22 = i21 % 2;
            this.ac.dismiss();
            this.ac.cancel();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_cnic_validation);
        this.ac = new ProgressDialog(this);
        SessionManager sessionManager = new SessionManager(this);
        this.ag = sessionManager;
        sessionManager.d.putString("k_nadra_data", BuildConfig.FLAVOR);
        sessionManager.d.apply();
        this.ag.C(new ArrayList<>());
        StringBuilder sb = new StringBuilder();
        sb.append("onErrorResponse: IP Address:  ");
        sb.append(ac.h(true));
        sb.append("\nCitizen Data : ");
        sb.append(this.ag.f());
        Log.e("CnicValidationActivity", sb.toString());
        Dialog dialog = new Dialog(this);
        this.A = dialog;
        dialog.setContentView(R.layout.dialog_capturefinger);
        this.A.setCancelable(false);
        this.J = (ImageView) this.A.findViewById(R.id.imageview_fp);
        this.E = (RadioGroup) this.A.findViewById(R.id.radio_group_fingers);
        this.F = (RadioGroup) this.A.findViewById(R.id.rg_hands);
        this.G = (RadioButton) this.A.findViewById(R.id.left_hand);
        this.I = (RadioButton) this.A.findViewById(R.id.right_hand);
        this.H = (Button) this.A.findViewById(R.id.select_finger);
        this.ai = (RelativeLayout) this.A.findViewById(R.id.rlfingerMain);
        this.aj = (RelativeLayout) this.A.findViewById(R.id.rlMain);
        this.z = (TextView) this.A.findViewById(R.id.hand_selection_heading_textView);
        this.D = (Spinner) this.A.findViewById(R.id.finger_index_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, this.ak);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        this.D.setAdapter((SpinnerAdapter) arrayAdapter);
        this.D.setOnItemSelectedListener(new OooO0o());
        String stringExtra = getIntent().getStringExtra("cnic");
        this.ah = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            SessionManager sessionManager2 = this.ag;
            sessionManager2.d.putString("token_cnic", this.ah);
            sessionManager2.d.apply();
            sessionManager2.d.commit();
            int i2 = p + 97;
            q = i2 % 128;
            int i3 = i2 % 2;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.af = progressDialog;
        progressDialog.setCancelable(false);
        ((TextView) findViewById(R.id.application_version_textView)).setText("v7.6 (LIVE)\n11 Nov 2026");
        this.ab = this;
        this.am = (BISPApplication) getApplicationContext();
        this.Y = (RadioGroup) findViewById(R.id.radio_group);
        this.X = (RadioButton) findViewById(R.id.rdoCNIC);
        this.Z = (RadioButton) findViewById(R.id.rdofrm);
        this.w = (EditText) findViewById(R.id.et_cnic);
        this.y = (EditText) findViewById(R.id.et_frm);
        this.B = (ImageView) findViewById(R.id.img_fp);
        this.U = (TextView) findViewById(R.id.btn_login);
        this.W = (LinearLayout) findViewById(R.id.ll_frm);
        this.aa = (LinearLayout) findViewById(R.id.ll_cnic);
        this.y.setText(BuildConfig.FLAVOR);
        this.w.addTextChangedListener(new av(this).new buW(this.w));
        this.w.setText(this.ah);
        this.w.setEnabled(false);
        this.B.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.Y.setEnabled(false);
        this.X.setEnabled(false);
        this.Z.setEnabled(false);
        this.Y.setOnCheckedChangeListener(new OooO());
        if (this.ag.v() == 1) {
            this.B.setVisibility(0);
            return;
        }
        int i4 = p + 73;
        q = i4 % 128;
        int i5 = i4 % 2;
        this.B.setVisibility(8);
    }

    private static void a(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        hVar.d = 0;
        char[] cArr3 = new char[2];
        while (hVar.d < cArr.length) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[hVar.d];
            cArr3[1] = cArr[hVar.d + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (((long) b$s75$1748) ^ 6963871449151285300L)))) ^ ((c2 >>> 5) + ((char) (((long) a$s76$1748) ^ 6963871449151285300L)))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) c$s74$1748) ^ 6963871449151285300L))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (((long) d$s73$1748) ^ 6963871449151285300L))))));
                i5 -= 40503;
            }
            cArr2[hVar.d] = cArr3[0];
            cArr2[hVar.d + 1] = cArr3[1];
            hVar.d += 2;
            int i7 = $10 + 119;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
