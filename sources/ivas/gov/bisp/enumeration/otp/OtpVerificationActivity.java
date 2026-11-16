package ivas.gov.bisp.enumeration.otp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.activity.authentication.f;
import ivas.gov.bisp.enumeration.dj.J;
import ivas.gov.bisp.enumeration.dj.x;
import ivas.gov.bisp.enumeration.otp.OtpVerificationActivity;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0191t;
import java.util.Locale;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class OtpVerificationActivity extends AppCompatActivity {
    private static int p = 0;
    private static int q = 1;
    public static OooO0O0 r;
    public ProgressBar A;
    public AppCompatButton B;
    public ImageButton C;
    public String D;
    public String E;
    public int F;
    public String G;
    public CountDownTimer H;
    public TextView s;
    public EditText[] t;
    public TextView u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    public interface OooO0O0 {
    }

    public static void o(OtpVerificationActivity otpVerificationActivity) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((i2 ^ 118) + ((i2 & 118) << 1)) - 1;
        int i4 = i3 % 128;
        p = i4;
        int i5 = i3 % 2;
        EditText[] editTextArr = otpVerificationActivity.t;
        int length = editTextArr.length;
        int i6 = i4 & 41;
        int i7 = i6 + ((i4 ^ 41) | i6);
        q = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < length) {
            int i10 = p;
            int i11 = ((i10 | 73) << 1) - (i10 ^ 73);
            q = i11 % 128;
            int i12 = i11 % 2;
            editTextArr[i9].setText(BuildConfig.FLAVOR);
            int i13 = i9 ^ (-63);
            int i14 = ((i9 & (-63)) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            int i17 = i16 & 64;
            int i18 = (~i17) & (i16 | 64);
            int i19 = -(-(i17 << 1));
            i9 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i20 = p;
            int i21 = i20 & 61;
            int i22 = -(-((i20 ^ 61) | i21));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            q = i23 % 128;
            int i24 = i23 % 2;
        }
        otpVerificationActivity.t[0].requestFocus();
        int i25 = q;
        int i26 = i25 & 103;
        int i27 = (i26 - (~((i25 ^ 103) | i26))) - 1;
        p = i27 % 128;
        int i28 = i27 % 2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = (-2) - (((i2 ^ 32) + ((i2 & 32) << 1)) ^ (-1));
        q = i3 % 128;
        if (i3 % 2 == 0) {
            q(true);
        } else {
            q(false);
        }
        int i4 = p;
        int i5 = (i4 ^ 45) + ((i4 & 45) << 1);
        q = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void q(boolean z) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = ((((i2 ^ 99) | (i2 & 99)) << 1) - (~(-((i2 & (-100)) | ((~i2) & 99))))) - 1;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!z) {
            int i4 = ((i2 | 3) << 1) - (i2 ^ 3);
            int i5 = i4 % 128;
            p = i5;
            int i6 = i4 % 2;
            OooO0O0 oooO0O0 = r;
            if (oooO0O0 != null) {
                int i7 = i5 & 5;
                int i8 = i7 + ((i5 ^ 5) | i7);
                q = i8 % 128;
                Toast.makeText((i8 % 2 == 0 ? (f) oooO0O0 : (f) oooO0O0).a, "OTP verification cancelled.", 0).show();
                r = null;
                int i9 = p;
                int i10 = i9 & 81;
                int i11 = i10 + ((i9 ^ 81) | i10);
                q = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        finish();
        int i13 = q + 31;
        p = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public final void r() {
        int i = 2 % 2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setInterpolator(new CycleInterpolator(4.0f));
        int i2 = q;
        int i3 = (i2 | 55) << 1;
        int i4 = -((i2 & (-56)) | ((~i2) & 55));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        p = i5 % 128;
        int i6 = i5 % 2;
        EditText[] editTextArr = this.t;
        int length = editTextArr.length;
        int i7 = i2 & 7;
        int i8 = ((i2 ^ 7) | i7) << 1;
        int i9 = -((i2 | 7) & (~i7));
        int i10 = (i8 & i9) + (i9 | i8);
        p = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < length) {
            int i13 = p;
            int i14 = ((i13 & (-92)) | ((~i13) & 91)) + ((i13 & 91) << 1);
            q = i14 % 128;
            if (i14 % 2 == 0) {
                editTextArr[i12].startAnimation(translateAnimation);
                int i15 = ((i12 | (-121)) << 1) - (i12 ^ (-121));
                i12 = (i15 ^ 124) + ((i15 & 124) << 1);
            } else {
                editTextArr[i12].startAnimation(translateAnimation);
                int i16 = i12 & 1;
                int i17 = (i12 | 1) & (~i16);
                int i18 = i16 << 1;
                i12 = (i17 & i18) + (i17 | i18);
            }
        }
        int i19 = q + 15;
        p = i19 % 128;
        int i20 = i19 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033 A[PHI: r2
  0x0033: PHI (r2v12 android.widget.ProgressBar) = (r2v5 android.widget.ProgressBar), (r2v13 android.widget.ProgressBar) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v6 android.widget.ProgressBar) = (r2v5 android.widget.ProgressBar), (r2v13 android.widget.ProgressBar) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s(boolean z) {
        ProgressBar progressBar;
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = i3 & 81;
        int i5 = (((i3 ^ 81) | i4) << 1) - ((i3 | 81) & (~i4));
        int i6 = i5 % 128;
        p = i6;
        int i7 = 0;
        if (i5 % 2 != 0) {
            progressBar = this.A;
            int i8 = 62 / 0;
            if (z) {
                int i9 = (i6 ^ 117) + ((i6 & 117) << 1);
                q = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = i6 ^ 15;
                i = (((i6 & 15) | i11) << 1) - i11;
                q = i % 128;
                if (i % 2 == 0) {
                    int i12 = 5 / 3;
                }
                i7 = 8;
            }
        } else {
            progressBar = this.A;
            if ((!z ? 1 : 0) != 1) {
                int i13 = (i6 ^ 117) + ((i6 & 117) << 1);
                q = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = i6 ^ 15;
                i = (((i6 & 15) | i15) << 1) - i15;
                q = i % 128;
                if (i % 2 == 0) {
                    int i16 = 5 / 3;
                }
                i7 = 8;
            }
        }
        progressBar.setVisibility(i7);
        this.B.setEnabled(((~(z ? 1 : 0)) & 1) | ((z ? 1 : 0) & (-2)));
        int i17 = q;
        int i18 = i17 & 29;
        int i19 = i17 | 29;
        int i20 = (i18 & i19) + (i19 | i18);
        p = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        int i4 = i3 % 128;
        q = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        CountDownTimer countDownTimer = this.H;
        if (countDownTimer != null) {
            int i5 = i4 & 31;
            int i6 = -(-((i4 ^ 31) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            p = i7 % 128;
            if (i7 % 2 != 0) {
                countDownTimer.cancel();
                throw null;
            }
            countDownTimer.cancel();
        }
        super.onDestroy();
        int i8 = p;
        int i9 = (i8 & 21) + (i8 | 21);
        q = i9 % 128;
        int i10 = i9 % 2;
    }

    public class OooO00o extends CountDownTimer {
        private static int a = 1;
        private static int b;

        public OooO00o(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 121;
            int i4 = ((i2 | 121) & (~i3)) + (i3 << 1);
            b = i4 % 128;
            int i5 = i4 % 2 != 0 ? (int) (j & 1000) : (int) (j / 1000);
            TextView textView = OtpVerificationActivity.this.y;
            Locale locale = Locale.getDefault();
            int i6 = b;
            int i7 = i6 ^ 79;
            int i8 = (i6 & 79) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            Integer numValueOf = Integer.valueOf(i5 % 60);
            int i11 = b;
            int i12 = ((i11 | 65) << 1) - (i11 ^ 65);
            a = i12 % 128;
            int i13 = i12 % 2;
            textView.setText(String.format(locale, "%02d:%02d", Integer.valueOf(i5 / 60), numValueOf));
            int i14 = b;
            int i15 = (-2) - (((i14 & 60) + (i14 | 60)) ^ (-1));
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            int i = 2 % 2;
            int i2 = a + 1;
            b = i2 % 128;
            int i3 = i2 % 2;
            OtpVerificationActivity.this.w.setVisibility(8);
            OtpVerificationActivity otpVerificationActivity = OtpVerificationActivity.this;
            int i4 = a;
            int i5 = i4 ^ 33;
            int i6 = ((i4 & 33) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                otpVerificationActivity.y.setVisibility(82);
            } else {
                otpVerificationActivity.y.setVisibility(8);
            }
            OtpVerificationActivity.this.z.setVisibility(0);
            int i9 = b;
            int i10 = (i9 | 39) << 1;
            int i11 = -(i9 ^ 39);
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e A[PHI: r2
  0x004e: PHI (r2v6 android.os.CountDownTimer) = (r2v5 android.os.CountDownTimer), (r2v9 android.os.CountDownTimer) binds: [B:13:0x004c, B:10:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    public final void p(long j) {
        CountDownTimer countDownTimer;
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 119;
        int i4 = (i2 | 119) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        q = i6 % 128;
        if (i6 % 2 == 0) {
            this.z.setVisibility(73);
        } else {
            this.z.setVisibility(8);
        }
        this.w.setVisibility(0);
        int i7 = p + 115;
        q = i7 % 128;
        if (i7 % 2 == 0) {
            this.y.setVisibility(0);
            countDownTimer = this.H;
            if (countDownTimer != null) {
                int i8 = q;
                int i9 = i8 & 73;
                int i10 = (73 ^ i8) | i9;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                p = i11 % 128;
                int i12 = i11 % 2;
                countDownTimer.cancel();
                int i13 = q;
                int i14 = i13 & 39;
                int i15 = (i13 | 39) & (~i14);
                int i16 = i14 << 1;
                int i17 = (i15 & i16) + (i15 | i16);
                p = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            this.y.setVisibility(0);
            countDownTimer = this.H;
            if (countDownTimer != null) {
                int i19 = q;
                int i20 = i19 & 73;
                int i110 = (73 ^ i19) | i20;
                int i111 = (i20 ^ i110) + ((i110 & i20) << 1);
                p = i111 % 128;
                int i112 = i111 % 2;
                countDownTimer.cancel();
                int i113 = q;
                int i114 = i113 & 39;
                int i115 = (i113 | 39) & (~i114);
                int i116 = i114 << 1;
                int i117 = (i115 & i116) + (i115 | i116);
                p = i117 % 128;
                int i118 = i117 % 2;
            }
        }
        OooO00o oooO00o = new OooO00o(j, 1000L);
        int i21 = p + 110;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        q = i22 % 128;
        int i23 = i22 % 2;
        this.H = oooO00o.start();
        int i24 = p;
        int i25 = ((i24 | 91) << 1) - (i24 ^ 91);
        q = i25 % 128;
        int i26 = i25 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 5;
        int i4 = (i2 | 5) & (~i3);
        final int i5 = 1;
        int i6 = i3 << 1;
        int i7 = ((i4 | i6) << 1) - (i4 ^ i6);
        p = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(R.layout.activity_otp_verification);
            this.E = getIntent().getStringExtra("USERNAME");
            this.D = getIntent().getStringExtra("TRANSACTION_ID");
            getIntent();
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_otp_verification);
        this.E = getIntent().getStringExtra("USERNAME");
        this.D = getIntent().getStringExtra("TRANSACTION_ID");
        Intent intent = getIntent();
        int i8 = q;
        int i9 = i8 & 1;
        int i10 = (i9 - (~((i8 ^ 1) | i9))) - 1;
        p = i10 % 128;
        final int i11 = 0;
        if (i10 % 2 != 0) {
            this.F = intent.getIntExtra("USER_ID", 1);
        } else {
            this.F = intent.getIntExtra("USER_ID", 0);
        }
        this.G = getIntent().getStringExtra("IP_URL");
        PreferenceManager.getDefaultSharedPreferences(this).getBoolean("isVpnEnabled", false);
        this.C = (ImageButton) findViewById(R.id.btnBack);
        int i12 = q + 73;
        p = i12 % 128;
        if (i12 % 2 != 0) {
            this.v = (ImageView) findViewById(R.id.ivChannelIcon);
            this.s = (TextView) findViewById(R.id.tvChannelTitle);
            this.u = (TextView) findViewById(R.id.tvTargetIdentifier);
            findViewById(R.id.tvChannelSubtitle);
            obj.hashCode();
            throw null;
        }
        this.v = (ImageView) findViewById(R.id.ivChannelIcon);
        this.s = (TextView) findViewById(R.id.tvChannelTitle);
        this.u = (TextView) findViewById(R.id.tvTargetIdentifier);
        this.x = (TextView) findViewById(R.id.tvChannelSubtitle);
        this.w = (TextView) findViewById(R.id.tvTimerPrefix);
        this.y = (TextView) findViewById(R.id.tvTimerCountdown);
        this.z = (TextView) findViewById(R.id.btnResend);
        int i13 = q;
        int i14 = ((i13 | 96) << 1) - (i13 ^ 96);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        p = i15 % 128;
        int i16 = i15 % 2;
        this.B = (AppCompatButton) findViewById(R.id.btnVerify);
        this.A = (ProgressBar) findViewById(R.id.pbLoading);
        int i17 = q;
        int i18 = i17 & 85;
        int i19 = (i17 | 85) & (~i18);
        int i20 = i18 << 1;
        int i21 = (i19 & i20) + (i19 | i20);
        p = i21 % 128;
        int i22 = i21 % 2;
        this.t = new EditText[]{(EditText) findViewById(R.id.otp1), (EditText) findViewById(R.id.otp2), (EditText) findViewById(R.id.otp3), (EditText) findViewById(R.id.otp4), (EditText) findViewById(R.id.otp5), (EditText) findViewById(R.id.otp6)};
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.o
            private static int a = 1;
            private static int b;
            public final /* synthetic */ OtpVerificationActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i23 = 2 % 2;
                int i24 = b + 3;
                int i25 = i24 % 128;
                a = i25;
                Object obj2 = null;
                if (i24 % 2 == 0) {
                    throw null;
                }
                if (i11 == 0) {
                    OtpVerificationActivity otpVerificationActivity = this.d;
                    OtpVerificationActivity.OooO0O0 oooO0O0 = OtpVerificationActivity.r;
                    otpVerificationActivity.q(false);
                    int i26 = a;
                    int i27 = i26 & 27;
                    int i28 = -(-((i26 ^ 27) | i27));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i30 = (-2) - (((i25 ^ 112) + ((i25 & 112) << 1)) ^ (-1));
                int i31 = i30 % 128;
                b = i31;
                if (i30 % 2 != 0) {
                    int i32 = 4 % 4;
                }
                int i33 = ((i31 & (-24)) | ((~i31) & 23)) + ((i31 & 23) << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
                OtpVerificationActivity otpVerificationActivity2 = this.d;
                OtpVerificationActivity.OooO0O0 oooO0O1 = OtpVerificationActivity.r;
                otpVerificationActivity2.s(true);
                try {
                    StringBuilder sb = new StringBuilder();
                    String str = otpVerificationActivity2.G;
                    int i35 = b;
                    int i36 = i35 & 39;
                    int i37 = i36 + ((i35 ^ 39) | i36);
                    a = i37 % 128;
                    if (i37 % 2 == 0) {
                        sb.append(str);
                        sb.append("/api/Users/SendOTP");
                        obj2.hashCode();
                        throw null;
                    }
                    sb.append(str);
                    sb.append("/api/Users/SendOTP");
                    String string = sb.toString();
                    JSONObject jSONObject = new JSONObject();
                    int i38 = (-2) - ((a + 50) ^ (-1));
                    b = i38 % 128;
                    if (i38 % 2 != 0) {
                        jSONObject.put("username", otpVerificationActivity2.E);
                        throw null;
                    }
                    jSONObject.put("username", otpVerificationActivity2.E);
                    jSONObject.put("otptype", "Login");
                    M m = new M(otpVerificationActivity2);
                    int i39 = a;
                    int i40 = i39 & 59;
                    int i41 = (i39 ^ 59) | i40;
                    int i42 = (i40 & i41) + (i41 | i40);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                    ax.e(jSONObject, otpVerificationActivity2, string, m);
                    int i44 = a + 85;
                    b = i44 % 128;
                    int i45 = i44 % 2;
                } catch (Exception unused) {
                    otpVerificationActivity2.s(false);
                }
            }
        });
        this.B.setOnClickListener(new ViewOnClickListenerC0191t(this, 4));
        this.z.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.o
            private static int a = 1;
            private static int b;
            public final /* synthetic */ OtpVerificationActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i23 = 2 % 2;
                int i24 = b + 3;
                int i25 = i24 % 128;
                a = i25;
                Object obj2 = null;
                if (i24 % 2 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    OtpVerificationActivity otpVerificationActivity = this.d;
                    OtpVerificationActivity.OooO0O0 oooO0O0 = OtpVerificationActivity.r;
                    otpVerificationActivity.q(false);
                    int i26 = a;
                    int i27 = i26 & 27;
                    int i28 = -(-((i26 ^ 27) | i27));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i30 = (-2) - (((i25 ^ 112) + ((i25 & 112) << 1)) ^ (-1));
                int i31 = i30 % 128;
                b = i31;
                if (i30 % 2 != 0) {
                    int i32 = 4 % 4;
                }
                int i33 = ((i31 & (-24)) | ((~i31) & 23)) + ((i31 & 23) << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
                OtpVerificationActivity otpVerificationActivity2 = this.d;
                OtpVerificationActivity.OooO0O0 oooO0O1 = OtpVerificationActivity.r;
                otpVerificationActivity2.s(true);
                try {
                    StringBuilder sb = new StringBuilder();
                    String str = otpVerificationActivity2.G;
                    int i35 = b;
                    int i36 = i35 & 39;
                    int i37 = i36 + ((i35 ^ 39) | i36);
                    a = i37 % 128;
                    if (i37 % 2 == 0) {
                        sb.append(str);
                        sb.append("/api/Users/SendOTP");
                        obj2.hashCode();
                        throw null;
                    }
                    sb.append(str);
                    sb.append("/api/Users/SendOTP");
                    String string = sb.toString();
                    JSONObject jSONObject = new JSONObject();
                    int i38 = (-2) - ((a + 50) ^ (-1));
                    b = i38 % 128;
                    if (i38 % 2 != 0) {
                        jSONObject.put("username", otpVerificationActivity2.E);
                        throw null;
                    }
                    jSONObject.put("username", otpVerificationActivity2.E);
                    jSONObject.put("otptype", "Login");
                    M m = new M(otpVerificationActivity2);
                    int i39 = a;
                    int i40 = i39 & 59;
                    int i41 = (i39 ^ 59) | i40;
                    int i42 = (i40 & i41) + (i41 | i40);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                    ax.e(jSONObject, otpVerificationActivity2, string, m);
                    int i44 = a + 85;
                    b = i44 % 128;
                    int i45 = i44 % 2;
                } catch (Exception unused) {
                    otpVerificationActivity2.s(false);
                }
            }
        });
        if (getIntent().getIntExtra("SESSION_SOURCE_ALLOWED", 0) == 0) {
            int i23 = p + 101;
            q = i23 % 128;
            if (i23 % 2 == 0) {
                this.s.setText("Mobile SIM Verification (SMS)");
                textView = this.x;
                int i24 = 8 / 0;
            } else {
                this.s.setText("Mobile SIM Verification (SMS)");
                textView = this.x;
            }
            int i25 = p;
            int i26 = ((i25 & 32) + (i25 | 32)) - 1;
            q = i26 % 128;
            if (i26 % 2 == 0) {
                textView.setText("A 6-digit OTP has been sent via SMS to your registered cellular SIM number.\nرجسٹرڈ سم پر بھیجا گیا 6 ہندسوں کا کوڈ درج کریں۔");
                this.v.setImageResource(android.R.drawable.stat_sys_phone_call);
                int i27 = 21 / 0;
            } else {
                textView.setText("A 6-digit OTP has been sent via SMS to your registered cellular SIM number.\nرجسٹرڈ سم پر بھیجا گیا 6 ہندسوں کا کوڈ درج کریں۔");
                this.v.setImageResource(android.R.drawable.stat_sys_phone_call);
            }
        } else {
            this.s.setText("Official Email Verification");
            TextView textView2 = this.x;
            int i28 = p;
            int i29 = (i28 & (-28)) | ((~i28) & 27);
            int i30 = (i28 & 27) << 1;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            q = i31 % 128;
            int i32 = i31 % 2;
            textView2.setText("A 6-digit OTP has been sent to your official registered Email address.\nسرکاری ای میل پر بھیجا گیا 6 ہندسوں کا کوڈ درج کریں۔");
            ImageView imageView = this.v;
            int i33 = q;
            int i34 = i33 ^ 115;
            int i35 = ((i33 & 115) | i34) << 1;
            int i36 = -i34;
            int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
            p = i37 % 128;
            if (i37 % 2 != 0) {
                imageView.setImageResource(android.R.drawable.ic_dialog_email);
                int i38 = 72 / 0;
            } else {
                imageView.setImageResource(android.R.drawable.ic_dialog_email);
            }
            int i39 = q;
            int i40 = ((i39 | 29) << 1) - (i39 ^ 29);
            p = i40 % 128;
            int i41 = i40 % 2;
        }
        TextView textView3 = this.u;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("ID / Username: ");
        String str = this.E;
        int i42 = p + 23;
        q = i42 % 128;
        int i43 = i42 % 2;
        sbW.append(str);
        textView3.setText(sbW.toString());
        int i44 = p;
        int i45 = i44 & 39;
        int i46 = (((i44 ^ 39) | i45) << 1) - ((i44 | 39) & (~i45));
        q = i46 % 128;
        if (i46 % 2 == 0) {
            int i47 = 3 % 2;
        }
        int i48 = 0;
        while (true) {
            EditText[] editTextArr = this.t;
            if (i48 >= editTextArr.length) {
                p(60000L);
                int i49 = p + 49;
                q = i49 % 128;
                int i50 = i49 % 2;
                return;
            }
            editTextArr[i48].addTextChangedListener(new x(this, i48));
            EditText editText = this.t[i48];
            J j = new J(this, i48, 0);
            int i51 = p + 25;
            q = i51 % 128;
            if (i51 % 2 == 0) {
                editText.setOnKeyListener(j);
                int i52 = i48 + 253;
                i48 = (i52 ^ (-126)) + ((i52 & (-126)) << 1);
            } else {
                editText.setOnKeyListener(j);
                int i53 = i48 ^ (-35);
                int i54 = (i48 & (-35)) << 1;
                int i55 = (i53 & i54) + (i54 | i53);
                int i56 = i55 & 36;
                int i57 = (i55 ^ 36) | i56;
                i48 = (i56 & i57) + (i56 | i57);
            }
        }
    }
}
