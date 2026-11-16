package ivas.gov.bisp.enumeration.otp;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.dj.C0302a;
import ivas.gov.bisp.enumeration.dj.O;
import ivas.gov.bisp.enumeration.dj.S;
import ivas.gov.bisp.enumeration.dj.T;
import ivas.gov.bisp.enumeration.dj.z;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0192u;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import ivas.gov.bisp.enumeration.p043bp.am;
import java.util.Objects;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PasswordResetActivity extends AppCompatActivity {
    private static int p = 0;
    private static int q = 1;
    public static final Pattern r;
    public static final Pattern s = Pattern.compile("^.{8,12}$");
    public static final Pattern t = Pattern.compile("(?=.*[A-Z]).+");
    public static final Pattern u;
    public EditText A;
    public TextView B;
    public TextView C;
    public LinearLayout D;
    public AppCompatButton E;
    public ImageView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView L;
    public EditText[] M;
    public TextView N;
    public TextView O;
    public TextView P;
    public AppCompatButton Q;
    public ProgressBar S;
    public CountDownTimer V;
    public EditText v;
    public LinearLayout w;
    public EditText x;
    public TextView y;
    public TextView z;
    public String R = BuildConfig.FLAVOR;
    public int T = 0;
    public String U = BuildConfig.FLAVOR;
    public String K = BuildConfig.FLAVOR;

    public class OooO00o implements I {
        private static int a = 1;
        private static int b;

        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onError(ResponseMessage responseMessage) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 87;
            int i4 = i3 + ((i2 ^ 87) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            PasswordResetActivity passwordResetActivity = PasswordResetActivity.this;
            Pattern pattern = PasswordResetActivity.s;
            passwordResetActivity.v(false);
            int i6 = a;
            int i7 = ((i6 ^ 108) + ((i6 & 108) << 1)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            PasswordResetActivity passwordResetActivity2 = PasswordResetActivity.this;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Send OTP Failed: ");
            String errorMessage = responseMessage.getErrorMessage();
            int i9 = a;
            int i10 = ((i9 | 89) << 1) - (i9 ^ 89);
            b = i10 % 128;
            int i11 = i10 % 2;
            sbW.append(errorMessage);
            Toast.makeText(passwordResetActivity2, sbW.toString(), 1).show();
            int i12 = a;
            int i13 = i12 | 19;
            int i14 = i13 << 1;
            int i15 = -((~(i12 & 19)) & i13);
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            int i17 = i16 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onSuccess(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 52) << 1) - (i2 ^ 52)) - 1;
            b = i3 % 128;
            PasswordResetActivity passwordResetActivity = i3 % 2 != 0 ? PasswordResetActivity.this : PasswordResetActivity.this;
            Pattern pattern = PasswordResetActivity.s;
            passwordResetActivity.v(false);
            try {
                boolean zOptBoolean = jSONObject.optBoolean("status", false);
                int i4 = a + 4;
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                b = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    jSONObject.optString("message", BuildConfig.FLAVOR);
                    throw null;
                }
                String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
                if (!zOptBoolean) {
                    Toast.makeText(PasswordResetActivity.this, strOptString, 1).show();
                    int i6 = b + 61;
                    a = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
                int i8 = a;
                int i9 = i8 & 25;
                int i10 = (i9 - (~((i8 ^ 25) | i9))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                PasswordResetActivity passwordResetActivity2 = PasswordResetActivity.this;
                jSONObject.optString("transaction_id", BuildConfig.FLAVOR);
                Objects.requireNonNull(passwordResetActivity2);
                int i12 = a + 101;
                b = i12 % 128;
                (i12 % 2 != 0 ? Toast.makeText(PasswordResetActivity.this, strOptString, 0) : Toast.makeText(PasswordResetActivity.this, strOptString, 0)).show();
                PasswordResetActivity.p(PasswordResetActivity.this);
                int i13 = b + 1;
                a = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    static {
        int i = p + 71;
        q = i % 128;
        int i2 = i % 2;
        r = Pattern.compile("(?=.*[0-9]).+");
        u = Pattern.compile("(?=.*[@#$%^&+=!._*-]).+");
        int i3 = p;
        int i4 = ((i3 | 57) << 1) - (i3 ^ 57);
        q = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void q(PasswordResetActivity passwordResetActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(passwordResetActivity);
        b.aIz aiz = new b.aIz(passwordResetActivity);
        int i2 = q;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        p = i6 % 128;
        int i7 = i6 % 2;
        aiz.a.e = "Reset Failed / پاس ورڈ تبدیل نہ ہو سکا";
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(str, "\n\nPlease verify your OTP code and try again.");
        int i8 = q + 39;
        p = i8 % 128;
        int i9 = i8 % 2;
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.f = strR;
        DialogInterfaceOnClickListenerC0217y dialogInterfaceOnClickListenerC0217y = DialogInterfaceOnClickListenerC0217y.h;
        int i10 = q;
        int i11 = i10 & 69;
        int i12 = i11 + ((i10 ^ 69) | i11);
        p = i12 % 128;
        int i13 = i12 % 2;
        oooO0O0.h = "Try Again / دوبارہ کوشش کریں";
        oooO0O0.i = dialogInterfaceOnClickListenerC0217y;
        aiz.d();
        int i14 = q + 85;
        p = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 105;
        int i4 = i3 + ((i2 ^ 105) | i3);
        p = i4 % 128;
        int i5 = i4 % 2;
        CountDownTimer countDownTimer = this.V;
        if (countDownTimer != null) {
            int i6 = i2 | 125;
            int i7 = (i6 << 1) - ((~(i2 & 125)) & i6);
            p = i7 % 128;
            if (i7 % 2 != 0) {
                countDownTimer.cancel();
                int i8 = 82 / 0;
            } else {
                countDownTimer.cancel();
            }
        }
        super.onDestroy();
        int i9 = q;
        int i10 = i9 & 59;
        int i11 = i10 + ((i9 ^ 59) | i10);
        p = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void u() {
        EditText[] editTextArr;
        int length;
        int i = 2 % 2;
        int i2 = q + 101;
        p = i2 % 128;
        if (i2 % 2 != 0) {
            editTextArr = this.M;
            length = editTextArr.length;
        } else {
            editTextArr = this.M;
            length = editTextArr.length;
        }
        int i3 = 0;
        while (i3 < length) {
            int i4 = q;
            int i5 = ((i4 | 125) << 1) - (i4 ^ 125);
            p = i5 % 128;
            int i6 = i5 % 2;
            editTextArr[i3].setText(BuildConfig.FLAVOR);
            i3 = ((((i3 ^ 1) | (i3 & 1)) << 1) - (~(-(((~i3) & 1) | (i3 & (-2)))))) - 1;
            int i7 = q;
            int i8 = i7 & 123;
            int i9 = -(-(i7 | 123));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            p = i10 % 128;
            int i11 = i10 % 2;
        }
        this.M[0].requestFocus();
        int i12 = p;
        int i13 = i12 & 11;
        int i14 = (i12 ^ 11) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        q = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[PHI: r3
  0x0040: PHI (r3v6 android.widget.ProgressBar) = (r3v5 android.widget.ProgressBar), (r3v10 android.widget.ProgressBar) binds: [B:8:0x0021, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r3
  0x0023: PHI (r3v9 android.widget.ProgressBar) = (r3v5 android.widget.ProgressBar), (r3v10 android.widget.ProgressBar) binds: [B:8:0x0021, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void v(boolean z) {
        ProgressBar progressBar;
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 ^ 35;
        int i4 = (((i2 & 35) | i3) << 1) - i3;
        p = i4 % 128;
        int i5 = 0;
        if (i4 % 2 != 0) {
            progressBar = this.S;
            int i6 = 47 / 0;
            if ((!z ? 1 : 0) != 0) {
                int i7 = (i2 & 87) + (i2 | 87);
                p = i7 % 128;
                int i8 = i7 % 2;
                i5 = 8;
            } else {
                int i9 = ((i2 ^ 94) + ((i2 & 94) << 1)) - 1;
                p = i9 % 128;
                int i10 = i9 % 2;
                int i11 = ((i2 ^ 32) + ((i2 & 32) << 1)) - 1;
                p = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            progressBar = this.S;
            if (z) {
                int i13 = ((i2 ^ 94) + ((i2 & 94) << 1)) - 1;
                p = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((i2 ^ 32) + ((i2 & 32) << 1)) - 1;
                p = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = (i2 & 87) + (i2 | 87);
                p = i17 % 128;
                int i18 = i17 % 2;
                i5 = 8;
            }
        }
        progressBar.setVisibility(i5);
        AppCompatButton appCompatButton = this.E;
        int i19 = (z ? 1 : 0) & 1;
        appCompatButton.setEnabled((i19 | (!z ? 1 : 0)) & (~i19));
        int i20 = q;
        int i21 = ((i20 & 7) - (~(-(-(i20 | 7))))) - 1;
        p = i21 % 128;
        int i22 = i21 % 2;
        this.Q.setEnabled(((~(z ? 1 : 0)) & 1) ^ ((z ? 1 : 0) & (-2)));
    }

    public static void r(PasswordResetActivity passwordResetActivity, TextView textView, boolean z, String str) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = (i2 | 7) << 1;
        int i4 = -(((~i2) & 7) | (i2 & (-8)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        p = i5 % 128;
        if (i5 % 2 != 0) {
            Objects.requireNonNull(passwordResetActivity);
            throw null;
        }
        Objects.requireNonNull(passwordResetActivity);
        if (!z) {
            textView.setTextColor(-10193781);
            textView.setText(str);
            int i6 = q;
            int i7 = i6 & 67;
            int i8 = (i6 ^ 67) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            p = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        textView.setTextColor(-16411031);
        StringBuilder sb = new StringBuilder();
        int i11 = q;
        int i12 = i11 | 59;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & 59)) & i12);
        int i15 = (i13 & i14) + (i14 | i13);
        p = i15 % 128;
        if (i15 % 2 != 0) {
            sb.append("✓ ");
            int i16 = 68 / 0;
        } else {
            sb.append("✓ ");
        }
        sb.append(str.replace("• ", BuildConfig.FLAVOR));
        String string = sb.toString();
        int i17 = q;
        int i18 = ((((i17 ^ 77) | (i17 & 77)) << 1) - (~(-(((~i17) & 77) | (i17 & (-78)))))) - 1;
        p = i18 % 128;
        int i19 = i18 % 2;
        textView.setText(string);
        int i20 = (-2) - ((p + 52) ^ (-1));
        q = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
    }

    public final void t() {
        EditText[] editTextArr;
        int length;
        int i;
        int i2 = 2 % 2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setInterpolator(new CycleInterpolator(4.0f));
        int i3 = q;
        int i4 = i3 ^ 111;
        int i5 = -(-((i3 & 111) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        p = i7;
        if (i6 % 2 != 0) {
            editTextArr = this.M;
            length = editTextArr.length;
            i = 1;
        } else {
            editTextArr = this.M;
            length = editTextArr.length;
            i = 0;
        }
        int i8 = i7 & 99;
        int i9 = i8 + ((i7 ^ 99) | i8);
        q = i9 % 128;
        int i10 = i9 % 2;
        while (i < length) {
            int i11 = q;
            int i12 = ((i11 ^ 50) + ((i11 & 50) << 1)) - 1;
            p = i12 % 128;
            if (i12 % 2 != 0) {
                editTextArr[i].startAnimation(translateAnimation);
                int i13 = (i & 12) + (i | 12);
                int i14 = ((i13 ^ (-1)) + (i13 << 1)) - 5;
                i = (i14 ^ (-1)) + (i14 << 1);
            } else {
                editTextArr[i].startAnimation(translateAnimation);
                i++;
            }
        }
        int i15 = q;
        int i16 = ((i15 & (-64)) | ((~i15) & 63)) + ((i15 & 63) << 1);
        p = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 30 / 0;
        }
    }

    public static void o(PasswordResetActivity passwordResetActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(passwordResetActivity);
        b.aIz aiz = new b.aIz(passwordResetActivity);
        int i2 = q;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        p = i3 % 128;
        if (i3 % 2 != 0) {
            aiz.a.e = "Password Reset Successful / کامیابی";
            ivas.gov.bisp.enumeration.p091n.j.r(str, "\n\nYour password has been updated. Please log in with your new password.\nبرائے مہربانی اپنے نئے پاس ورڈ سے لاگ ان کریں۔");
            throw null;
        }
        aiz.a.e = "Password Reset Successful / کامیابی";
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(str, "\n\nYour password has been updated. Please log in with your new password.\nبرائے مہربانی اپنے نئے پاس ورڈ سے لاگ ان کریں۔");
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.f = strR;
        oooO0O0.k = false;
        am amVar = new am(passwordResetActivity, 6);
        oooO0O0.h = "GO TO LOGIN / لاگ ان کریں";
        int i4 = q;
        int i5 = (((i4 | 122) << 1) - (i4 ^ 122)) - 1;
        p = i5 % 128;
        int i6 = i5 % 2;
        oooO0O0.i = amVar;
        aiz.d();
        int i7 = q;
        int i8 = (i7 & 99) + (i7 | 99);
        p = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void s() {
        String strTrim;
        int i = 2 % 2;
        v(true);
        try {
            StringBuilder sb = new StringBuilder();
            int i2 = p;
            int i3 = (((i2 ^ 89) | (i2 & 89)) << 1) - (((~i2) & 89) | (i2 & (-90)));
            q = i3 % 128;
            if (i3 % 2 == 0) {
                sb.append(this.U);
                sb.append("/api/Users/SendOTP");
                throw null;
            }
            sb.append(this.U);
            sb.append("/api/Users/SendOTP");
            String string = sb.toString();
            JSONObject jSONObject = new JSONObject();
            EditText editText = this.v;
            int i4 = p;
            int i5 = (((i4 ^ 119) | (i4 & 119)) << 1) - (((~i4) & 119) | (i4 & (-120)));
            q = i5 % 128;
            if (i5 % 2 == 0) {
                strTrim = editText.getText().toString().replace("-", BuildConfig.FLAVOR).trim();
                int i6 = 84 / 0;
            } else {
                strTrim = editText.getText().toString().replace("-", BuildConfig.FLAVOR).trim();
            }
            int i7 = p;
            int i8 = i7 & 21;
            int i9 = ((i7 ^ 21) | i8) << 1;
            int i10 = -((i7 | 21) & (~i8));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            q = i11 % 128;
            int i12 = i11 % 2;
            if (strTrim.length() != 13) {
                int i13 = q + 107;
                p = i13 % 128;
                int i14 = i13 % 2;
                this.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                int i15 = q + 7;
                p = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            jSONObject.put("username", strTrim);
            jSONObject.put("otptype", "Login");
            OooO00o oooO00o = new OooO00o();
            int i17 = q;
            int i18 = ((i17 ^ 111) | (i17 & 111)) << 1;
            int i19 = -(((~i17) & 111) | (i17 & (-112)));
            int i20 = (i18 & i19) + (i19 | i18);
            p = i20 % 128;
            int i21 = i20 % 2;
            ax.e(jSONObject, this, string, oooO00o);
            int i22 = p;
            int i23 = (i22 ^ 19) + ((i22 & 19) << 1);
            q = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
            v(false);
        }
    }

    public static void p(PasswordResetActivity passwordResetActivity) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 43;
        int i4 = (i2 | 43) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        q = i6 % 128;
        int i7 = i6 % 2;
        passwordResetActivity.w.setVisibility(8);
        passwordResetActivity.D.setVisibility(0);
        int i8 = p + 125;
        q = i8 % 128;
        int i9 = i8 % 2;
        TextView textView = passwordResetActivity.G;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("CNIC / ID: ");
        String str = passwordResetActivity.R;
        int i10 = q;
        int i11 = i10 & 91;
        int i12 = (i10 ^ 91) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        p = i13 % 128;
        int i14 = i13 % 2;
        sbW.append(str);
        textView.setText(sbW.toString());
        if (passwordResetActivity.T == 0) {
            int i15 = p;
            int i16 = (i15 & 69) + (i15 | 69);
            q = i16 % 128;
            int i17 = i16 % 2;
            passwordResetActivity.F.setImageResource(R.drawable.stat_sys_phone_call);
            TextView textView2 = passwordResetActivity.H;
            int i18 = p + 79;
            q = i18 % 128;
            int i19 = i18 % 2;
            textView2.setText("Registered Mobile SIM OTP");
            passwordResetActivity.I.setText("A 6-digit OTP has been sent via SMS to your registered SIM.");
            int i20 = p + 25;
            q = i20 % 128;
            int i21 = i20 % 2;
            passwordResetActivity.J.setText("آپ کے رجسٹرڈ موبائل سم پر 6 ہندسوں کا کوڈ بھیجا گیا ہے۔");
            int i22 = q;
            int i23 = (i22 ^ 53) + ((i22 & 53) << 1);
            p = i23 % 128;
            int i24 = i23 % 2;
        } else {
            passwordResetActivity.F.setImageResource(R.drawable.ic_dialog_email);
            TextView textView3 = passwordResetActivity.H;
            int i25 = p;
            int i26 = i25 | 53;
            int i27 = i26 << 1;
            int i28 = -((~(i25 & 53)) & i26);
            int i29 = (i27 & i28) + (i28 | i27);
            q = i29 % 128;
            if (i29 % 2 == 0) {
                textView3.setText("Official Registered Email OTP");
                passwordResetActivity.I.setText("A 6-digit OTP has been sent to your registered Email address.");
                TextView textView4 = passwordResetActivity.J;
                throw null;
            }
            textView3.setText("Official Registered Email OTP");
            passwordResetActivity.I.setText("A 6-digit OTP has been sent to your registered Email address.");
            passwordResetActivity.J.setText("آپ کے سرکاری ای میل ایڈریس پر 6 ہندسوں کا کوڈ بھیجا گیا ہے۔");
            int i30 = q;
            int i31 = (i30 & (-34)) | ((~i30) & 33);
            int i32 = (i30 & 33) << 1;
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            p = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 4 % 5;
            }
        }
        passwordResetActivity.u();
        passwordResetActivity.L.setVisibility(8);
        TextView textView5 = passwordResetActivity.N;
        int i35 = p;
        int i36 = i35 & 43;
        int i37 = i36 + ((i35 ^ 43) | i36);
        q = i37 % 128;
        if (i37 % 2 == 0) {
            textView5.setVisibility(1);
            passwordResetActivity.O.setVisibility(1);
        } else {
            textView5.setVisibility(0);
            passwordResetActivity.O.setVisibility(0);
        }
        CountDownTimer countDownTimer = passwordResetActivity.V;
        if (countDownTimer != null) {
            int i38 = p;
            int i39 = ((i38 & (-8)) | ((~i38) & 7)) + ((i38 & 7) << 1);
            q = i39 % 128;
            int i40 = i39 % 2;
            countDownTimer.cancel();
            int i41 = p;
            int i42 = ((i41 ^ 41) | (i41 & 41)) << 1;
            int i43 = -(((~i41) & 41) | (i41 & (-42)));
            int i44 = (i42 & i43) + (i43 | i42);
            q = i44 % 128;
            int i45 = i44 % 2;
        }
        S s2 = new S(passwordResetActivity, 60000L, 1000L);
        int i46 = q;
        int i47 = (i46 & (-126)) | ((~i46) & 125);
        int i48 = (i46 & 125) << 1;
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        p = i49 % 128;
        int i50 = i49 % 2;
        passwordResetActivity.V = s2.start();
        int i51 = p;
        int i52 = (i51 & 117) + (i51 | 117);
        q = i52 % 128;
        int i53 = i52 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        final int i = 2;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = i3 & 81;
        int i5 = -(-(i3 | 81));
        int i6 = (i4 & i5) + (i5 | i4);
        p = i6 % 128;
        final int i7 = 0;
        if (i6 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(ivas.gov.bisp.enumeration.R.layout.activity_password_reset);
            int i8 = 19 / 0;
        } else {
            super.onCreate(bundle);
            setContentView(ivas.gov.bisp.enumeration.R.layout.activity_password_reset);
        }
        int i9 = p;
        int i10 = i9 & 101;
        final int i11 = 1;
        int i12 = ((((i9 ^ 101) | i10) << 1) - (~(-((i9 | 101) & (~i10))))) - 1;
        q = i12 % 128;
        if (i12 % 2 == 0) {
            stringExtra = getIntent().getStringExtra("USERNAME");
            int i13 = 90 / 0;
        } else {
            stringExtra = getIntent().getStringExtra("USERNAME");
        }
        this.R = stringExtra;
        Intent intent = getIntent();
        int i14 = p;
        int i15 = i14 & 95;
        int i16 = -(-(i14 | 95));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        q = i17 % 128;
        if (i17 % 2 == 0) {
            this.T = intent.getIntExtra("SESSION_SOURCE_ALLOWED", 0);
        } else {
            this.T = intent.getIntExtra("SESSION_SOURCE_ALLOWED", 0);
        }
        int i18 = p + 93;
        q = i18 % 128;
        if (i18 % 2 == 0) {
            getIntent().getStringExtra("IP_URL");
            throw null;
        }
        String stringExtra2 = getIntent().getStringExtra("IP_URL");
        int i19 = q;
        int i20 = i19 & 93;
        int i21 = i19 | 93;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        p = i22 % 128;
        int i23 = i22 % 2;
        this.U = stringExtra2;
        if (stringExtra2 == null) {
            int i24 = (i19 & (-102)) | ((~i19) & 101);
            int i25 = (i19 & 101) << 1;
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            p = i26 % 128;
            int i27 = i26 % 2;
            this.U = BuildConfig.FLAVOR;
            int i28 = i19 & 49;
            int i29 = i28 + ((i19 ^ 49) | i28);
            p = i29 % 128;
            int i30 = i29 % 2;
        }
        ((ImageButton) findViewById(ivas.gov.bisp.enumeration.R.id.btnBack)).setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.N
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ PasswordResetActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText[] editTextArr;
                int length;
                int i31 = 2 % 2;
                int i32 = a;
                int i33 = ((i32 ^ 33) - (~(-(-((i32 & 33) << 1))))) - 1;
                int i34 = i33 % 128;
                b = i34;
                int i35 = i33 % 2;
                int i36 = i7;
                if (i36 == 0) {
                    PasswordResetActivity passwordResetActivity = this.d;
                    Pattern pattern = PasswordResetActivity.s;
                    passwordResetActivity.finish();
                    int i37 = b;
                    int i38 = i37 & 103;
                    int i39 = -(-((i37 ^ 103) | i38));
                    int i40 = (i38 & i39) + (i39 | i38);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    return;
                }
                if (i36 == 1) {
                    PasswordResetActivity passwordResetActivity2 = this.d;
                    passwordResetActivity2.D.setVisibility(8);
                    int i42 = b + 63;
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    passwordResetActivity2.w.setVisibility(0);
                    int i44 = b;
                    int i45 = i44 & 21;
                    int i46 = (i44 | 21) & (~i45);
                    int i47 = i45 << 1;
                    int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                    a = i48 % 128;
                    if (i48 % 2 != 0) {
                        int i49 = 58 / 0;
                        return;
                    }
                    return;
                }
                int i50 = i34 & 1;
                int i51 = ((((i34 ^ 1) | i50) << 1) - (~(-((i34 | 1) & (~i50))))) - 1;
                a = i51 % 128;
                if (i51 % 2 != 0) {
                    int i52 = 5 / 2;
                }
                PasswordResetActivity passwordResetActivity3 = this.d;
                StringBuilder sb = new StringBuilder();
                int i53 = b;
                int i54 = (-2) - (((i53 ^ 42) + ((i53 & 42) << 1)) ^ (-1));
                a = i54 % 128;
                if (i54 % 2 != 0) {
                    editTextArr = passwordResetActivity3.M;
                    length = editTextArr.length;
                } else {
                    editTextArr = passwordResetActivity3.M;
                    length = editTextArr.length;
                }
                int i55 = a;
                int i56 = i55 | 35;
                int i57 = i56 << 1;
                int i58 = -((~(i55 & 35)) & i56);
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                b = i59 % 128;
                int i60 = i59 % 2;
                int i61 = 0;
                while (i61 < length) {
                    int i62 = a;
                    int i63 = ((i62 ^ 59) - (~(-(-((i62 & 59) << 1))))) - 1;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    Editable text = editTextArr[i61].getText();
                    int i65 = a;
                    int i66 = i65 & 49;
                    int i67 = (((i65 | 49) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                    b = i67 % 128;
                    int i68 = i67 % 2;
                    sb.append(text.toString().trim());
                    int i69 = i61 & 1;
                    i61 = ((i61 ^ 1) | i69) + i69;
                    int i70 = b;
                    int i71 = i70 ^ 121;
                    int i72 = (i70 & 121) << 1;
                    int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                    a = i73 % 128;
                    int i74 = i73 % 2;
                }
                String string = sb.toString();
                if (string.length() < 6) {
                    int i75 = b;
                    int i76 = (i75 & (-74)) | ((~i75) & 73);
                    int i77 = (i75 & 73) << 1;
                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                    a = i78 % 128;
                    int i79 = i78 % 2;
                    passwordResetActivity3.t();
                    Toast.makeText(passwordResetActivity3, "Please enter all 6 digits of the OTP", 0).show();
                    int i80 = b;
                    int i81 = i80 & 105;
                    int i82 = i81 + ((i80 ^ 105) | i81);
                    a = i82 % 128;
                    int i83 = i82 % 2;
                    return;
                }
                String str = passwordResetActivity3.K;
                passwordResetActivity3.v(true);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i84 = a;
                    int i85 = i84 & 117;
                    int i86 = ((i84 ^ 117) | i85) << 1;
                    int i87 = -((i84 | 117) & (~i85));
                    int i88 = (i86 & i87) + (i87 | i86);
                    b = i88 % 128;
                    int i89 = i88 % 2;
                    sb2.append(passwordResetActivity3.U);
                    sb2.append("/api/Users/PasswordReset");
                    String string2 = sb2.toString();
                    JSONObject jSONObject = new JSONObject();
                    int i90 = a;
                    int i91 = i90 | 109;
                    int i92 = ((i91 << 1) - (~(-((~(i90 & 109)) & i91)))) - 1;
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    jSONObject.put("otp_code", string);
                    int i94 = a;
                    int i95 = (i94 & (-36)) | ((~i94) & 35);
                    int i96 = -(-((i94 & 35) << 1));
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    b = i97 % 128;
                    if (i97 % 2 == 0) {
                        jSONObject.put("password", str);
                        passwordResetActivity3.v.getText().toString();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    jSONObject.put("password", str);
                    String string3 = passwordResetActivity3.v.getText().toString();
                    int i98 = a;
                    int i99 = i98 & 87;
                    int i100 = (i98 ^ 87) | i99;
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    b = i101 % 128;
                    int i102 = i101 % 2;
                    String strTrim = string3.replace("-", BuildConfig.FLAVOR).trim();
                    int i103 = b;
                    int i104 = i103 & 63;
                    int i105 = (i104 - (~((i103 ^ 63) | i104))) - 1;
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    if (strTrim.length() != 13) {
                        int i107 = b;
                        int i108 = i107 & 103;
                        int i109 = i107 | 103;
                        int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                        a = i110 % 128;
                        if (i110 % 2 == 0) {
                            passwordResetActivity3.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                            return;
                        } else {
                            passwordResetActivity3.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                            int i111 = 14 / 0;
                            return;
                        }
                    }
                    jSONObject.put("username", strTrim);
                    jSONObject.put("otptype", "Login");
                    Q q2 = new Q(passwordResetActivity3);
                    int i112 = a;
                    int i113 = i112 & 47;
                    int i114 = -(-((i112 ^ 47) | i113));
                    int i115 = (i113 & i114) + (i114 | i113);
                    b = i115 % 128;
                    if (i115 % 2 == 0) {
                        ax.e(jSONObject, passwordResetActivity3, string2, q2);
                        int i116 = 75 / 0;
                    } else {
                        ax.e(jSONObject, passwordResetActivity3, string2, q2);
                    }
                    int i117 = a;
                    int i118 = ((i117 ^ 55) | (i117 & 55)) << 1;
                    int i119 = -(((~i117) & 55) | (i117 & (-56)));
                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                    b = i120 % 128;
                    if (i120 % 2 == 0) {
                        int i121 = 19 / 0;
                    }
                } catch (Exception unused) {
                    passwordResetActivity3.v(false);
                }
            }
        });
        this.w = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.layoutStep1Form);
        EditText editText = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etCnic);
        this.v = editText;
        editText.addTextChangedListener(new C0302a(editText));
        EditText editText2 = this.v;
        String str = this.R;
        int i31 = p + 88;
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        q = i32 % 128;
        int i33 = i32 % 2;
        editText2.setText(str);
        this.x = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etNewPassword);
        this.A = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etConfirmPassword);
        this.z = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleLength);
        this.B = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleUpper);
        this.C = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleNumber);
        int i34 = p;
        int i35 = (i34 & 117) + (i34 | 117);
        q = i35 % 128;
        int i36 = i35 % 2;
        this.y = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleSpecial);
        this.E = (AppCompatButton) findViewById(ivas.gov.bisp.enumeration.R.id.btnProceedToVerification);
        this.D = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.layoutStep2Otp);
        this.F = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivOtpChannelIcon);
        this.H = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpChannelTitle);
        int i37 = q;
        int i38 = i37 & 33;
        int i39 = (((i37 | 33) & (~i38)) - (~(i38 << 1))) - 1;
        p = i39 % 128;
        int i40 = i39 % 2;
        this.G = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpTargetCnic);
        this.I = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpChannelMessageEn);
        this.J = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpChannelMessageUr);
        int i41 = q + 59;
        p = i41 % 128;
        int i42 = i41 % 2;
        int i43 = 3;
        this.M = new EditText[]{(EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox1), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox2), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox3), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox4), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox5), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox6)};
        this.N = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvTimerPrefix);
        int i44 = q + 17;
        p = i44 % 128;
        int i45 = i44 % 2;
        this.O = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvTimerCountdown);
        this.L = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.btnResendOtp);
        this.P = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.btnBackToForm);
        this.Q = (AppCompatButton) findViewById(ivas.gov.bisp.enumeration.R.id.btnSubmitPasswordReset);
        this.S = (ProgressBar) findViewById(ivas.gov.bisp.enumeration.R.id.pbLoading);
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.m
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ PasswordResetActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:20:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:22:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:24:0x0108  */
            /* JADX WARN: Code duplicated, block: B:26:0x012c  */
            /* JADX WARN: Code duplicated, block: B:28:0x014e  */
            /* JADX WARN: Code duplicated, block: B:31:0x015f  */
            /* JADX WARN: Code duplicated, block: B:33:0x016c A[PHI: r3
  0x016c: PHI (r3v20 androidx.appcompat.app.b) = (r3v19 androidx.appcompat.app.b), (r3v25 androidx.appcompat.app.b) binds: [B:32:0x016a, B:29:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:35:0x01b9  */
            /* JADX WARN: Code duplicated, block: B:36:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:40:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:42:0x0220  */
            /* JADX WARN: Code duplicated, block: B:43:0x022e  */
            /* JADX WARN: Code duplicated, block: B:46:0x025b  */
            /* JADX WARN: Code duplicated, block: B:49:0x0269  */
            /* JADX WARN: Code duplicated, block: B:51:0x0273 A[PHI: r4
  0x0273: PHI (r4v19 android.widget.TextView) = (r4v18 android.widget.TextView), (r4v24 android.widget.TextView) binds: [B:50:0x0271, B:47:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:53:0x028b  */
            /* JADX WARN: Code duplicated, block: B:54:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:56:0x02b2 A[PHI: r4
  0x02b2: PHI (r4v22 android.widget.TextView) = (r4v18 android.widget.TextView), (r4v24 android.widget.TextView) binds: [B:50:0x0271, B:47:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:58:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:59:0x02d5  */
            /* JADX WARN: Code duplicated, block: B:63:0x0322  */
            /* JADX WARN: Code duplicated, block: B:65:0x032c  */
            /* JADX WARN: Code duplicated, block: B:67:0x033a  */
            /* JADX WARN: Code duplicated, block: B:69:0x034b  */
            /* JADX WARN: Code duplicated, block: B:70:0x0354  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i46;
                b.aIz aiz;
                int i47;
                View viewInflate;
                int i48;
                b bVarB;
                DisplayMetrics displayMetrics;
                int i49;
                int i50;
                int iMin;
                ImageView imageView;
                View viewFindViewById;
                int i51;
                TextView textView;
                TextView textView2;
                int i52;
                TextView textView3;
                View viewFindViewById2;
                TextView textView4;
                int i53;
                TextView textView5;
                int i54;
                int i55;
                int i56 = 2 % 2;
                int i57 = a;
                int i58 = i57 & 71;
                int i59 = (((i57 ^ 71) | i58) << 1) - ((~i58) & (i57 | 71));
                b = i59 % 128;
                int i60 = i59 % 2;
                if (i7 != 0) {
                    int i61 = ((i57 ^ 83) - (~((i57 & 83) << 1))) - 1;
                    int i62 = i61 % 128;
                    b = i62;
                    int i63 = i61 % 2;
                    int i64 = i62 & 105;
                    int i65 = (((i62 ^ 105) | i64) << 1) - ((i62 | 105) & (~i64));
                    a = i65 % 128;
                    int i66 = i65 % 2;
                    PasswordResetActivity passwordResetActivity = this.d;
                    Pattern pattern = PasswordResetActivity.s;
                    passwordResetActivity.s();
                    int i67 = b + 65;
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    return;
                }
                PasswordResetActivity passwordResetActivity2 = this.d;
                String strTrim = passwordResetActivity2.x.getText().toString().trim();
                int i69 = b;
                int i70 = (i69 ^ 63) + ((i69 & 63) << 1);
                a = i70 % 128;
                Object obj = null;
                if (i70 % 2 != 0) {
                    passwordResetActivity2.A.getText().toString().trim();
                    throw null;
                }
                String strTrim2 = passwordResetActivity2.A.getText().toString().trim();
                int i71 = b + 12;
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                a = i72 % 128;
                if (i72 % 2 != 0) {
                    int i73 = 7 / 0;
                    if (PasswordResetActivity.s.matcher(strTrim).matches()) {
                        if (PasswordResetActivity.t.matcher(strTrim).matches()) {
                            int i74 = b;
                            int i75 = (i74 & (-70)) | ((~i74) & 69);
                            int i76 = (i74 & 69) << 1;
                            int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                            a = i77 % 128;
                            int i78 = i77 % 2;
                            if (PasswordResetActivity.r.matcher(strTrim).matches()) {
                                int i79 = b;
                                int i80 = (i79 & (-18)) | ((~i79) & 17);
                                int i81 = -(-((i79 & 17) << 1));
                                int i82 = (i80 & i81) + (i81 | i80);
                                a = i82 % 128;
                                int i83 = i82 % 2;
                                if (PasswordResetActivity.u.matcher(strTrim).matches()) {
                                    int i84 = b;
                                    int i85 = (((i84 | 8) << 1) - (i84 ^ 8)) - 1;
                                    a = i85 % 128;
                                    int i86 = i85 % 2;
                                    if (strTrim.equals(strTrim2)) {
                                        int i87 = a;
                                        i46 = (i87 ^ 69) + ((i87 & 69) << 1);
                                        b = i46 % 128;
                                        if (i46 % 2 == 0) {
                                            passwordResetActivity2.A.setError("Passwords do not match");
                                            int i88 = 76 / 0;
                                        } else {
                                            passwordResetActivity2.A.setError("Passwords do not match");
                                        }
                                        int i89 = a;
                                        int i90 = (i89 ^ 93) + ((i89 & 93) << 1);
                                        b = i90 % 128;
                                        int i91 = i90 % 2;
                                        return;
                                    }
                                    passwordResetActivity2.K = strTrim;
                                    aiz = new b.aIz(passwordResetActivity2);
                                    int i92 = a;
                                    i47 = ((((i92 ^ 57) | (i92 & 57)) << 1) - (~(-(((~i92) & 57) | (i92 & (-58)))))) - 1;
                                    b = i47 % 128;
                                    if (i47 % 2 != 0) {
                                        LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                        AlertController.OooO0O0 oooO0O0 = aiz.a;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    viewInflate = LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                    AlertController.OooO0O0 oooO0O1 = aiz.a;
                                    oooO0O1.f1o = viewInflate;
                                    oooO0O1.k = false;
                                    int i93 = b;
                                    int i94 = (i93 | 27) << 1;
                                    int i95 = -(i93 ^ 27);
                                    i48 = (i94 ^ i95) + ((i95 & i94) << 1);
                                    a = i48 % 128;
                                    if (i48 % 2 != 0) {
                                        bVarB = aiz.b();
                                        bVarB.show();
                                        int i96 = 70 / 0;
                                        if (bVarB.getWindow() != null) {
                                            int i97 = b;
                                            int i98 = ((i97 ^ 15) - (~((i97 & 15) << 1))) - 1;
                                            a = i98 % 128;
                                            int i99 = i98 % 2;
                                            bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                            Resources resources = passwordResetActivity2.getResources();
                                            int i100 = a;
                                            int i101 = i100 & 49;
                                            int i102 = (i100 | 49) & (~i101);
                                            int i103 = i101 << 1;
                                            int i104 = ((i102 | i103) << 1) - (i102 ^ i103);
                                            b = i104 % 128;
                                            int i105 = i104 % 2;
                                            displayMetrics = resources.getDisplayMetrics();
                                            i49 = (int) (displayMetrics.density * 600.0f);
                                            int i106 = b;
                                            i50 = (i106 & 69) + (i106 | 69);
                                            a = i50 % 128;
                                            if (i50 % 2 != 0) {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            } else {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            }
                                            bVarB.getWindow().setLayout(iMin, -2);
                                            int i107 = b + 27;
                                            a = i107 % 128;
                                            int i108 = i107 % 2;
                                        }
                                    } else {
                                        bVarB = aiz.b();
                                        bVarB.show();
                                        if (bVarB.getWindow() != null) {
                                            int i910 = b;
                                            int i911 = ((i910 ^ 15) - (~((i910 & 15) << 1))) - 1;
                                            a = i911 % 128;
                                            int i912 = i911 % 2;
                                            bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                            Resources resources2 = passwordResetActivity2.getResources();
                                            int i109 = a;
                                            int i1010 = i109 & 49;
                                            int i1011 = (i109 | 49) & (~i1010);
                                            int i1012 = i1010 << 1;
                                            int i1013 = ((i1011 | i1012) << 1) - (i1011 ^ i1012);
                                            b = i1013 % 128;
                                            int i1014 = i1013 % 2;
                                            displayMetrics = resources2.getDisplayMetrics();
                                            i49 = (int) (displayMetrics.density * 600.0f);
                                            int i1015 = b;
                                            i50 = (i1015 & 69) + (i1015 | 69);
                                            a = i50 % 128;
                                            if (i50 % 2 != 0) {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            } else {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            }
                                            bVarB.getWindow().setLayout(iMin, -2);
                                            int i1016 = b + 27;
                                            a = i1016 % 128;
                                            int i1017 = i1016 % 2;
                                        }
                                    }
                                    imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                                    viewFindViewById = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                                    int i110 = b;
                                    i51 = (i110 ^ 25) + ((i110 & 25) << 1);
                                    a = i51 % 128;
                                    if (i51 % 2 == 0) {
                                        throw null;
                                    }
                                    textView = (TextView) viewFindViewById;
                                    textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                                    int i111 = b;
                                    int i112 = (i111 ^ 14) + ((i111 & 14) << 1);
                                    i52 = (i112 ^ (-1)) + (i112 << 1);
                                    a = i52 % 128;
                                    if (i52 % 2 != 0) {
                                        textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                        viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                        int i113 = 55 / 0;
                                    } else {
                                        textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                        viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                    }
                                    textView4 = (TextView) viewFindViewById2;
                                    AppCompatButton appCompatButton = (AppCompatButton) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                                    int i114 = b;
                                    int i115 = i114 & 97;
                                    int i116 = (~i115) & (i114 | 97);
                                    int i117 = i115 << 1;
                                    i53 = (i116 & i117) + (i116 | i117);
                                    a = i53 % 128;
                                    if (i53 % 2 != 0) {
                                        textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                        int i118 = 16 / 0;
                                        if (passwordResetActivity2.T == 0) {
                                            int i119 = b;
                                            i54 = ((i119 ^ 59) - (~(-(-((i119 & 59) << 1))))) - 1;
                                            a = i54 % 128;
                                            if (i54 % 2 == 0) {
                                                imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                                textView.setText("Mobile SIM Verification (SMS)");
                                                throw null;
                                            }
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                            textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i120 = a + 107;
                                            b = i120 % 128;
                                            int i121 = i120 % 2;
                                        } else {
                                            imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                            textView.setText("Official Email Verification");
                                            int i122 = a;
                                            i55 = (i122 ^ 111) + ((i122 & 111) << 1);
                                            b = i55 % 128;
                                            if (i55 % 2 == 0) {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                                int i123 = 43 / 0;
                                            } else {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            }
                                            int i124 = b;
                                            int i125 = i124 & 117;
                                            int i126 = -(-((i124 ^ 117) | i125));
                                            int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                                            a = i127 % 128;
                                            int i128 = i127 % 2;
                                            textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i129 = b;
                                            int i130 = ((i129 ^ 36) + ((i129 & 36) << 1)) - 1;
                                            a = i130 % 128;
                                            int i131 = i130 % 2;
                                        }
                                    } else {
                                        textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                        if (passwordResetActivity2.T == 0) {
                                            int i1110 = b;
                                            i54 = ((i1110 ^ 59) - (~(-(-((i1110 & 59) << 1))))) - 1;
                                            a = i54 % 128;
                                            if (i54 % 2 == 0) {
                                                imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                                textView.setText("Mobile SIM Verification (SMS)");
                                                throw null;
                                            }
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                            textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i1210 = a + 107;
                                            b = i1210 % 128;
                                            int i1211 = i1210 % 2;
                                        } else {
                                            imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                            textView.setText("Official Email Verification");
                                            int i1212 = a;
                                            i55 = (i1212 ^ 111) + ((i1212 & 111) << 1);
                                            b = i55 % 128;
                                            if (i55 % 2 == 0) {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                                int i1213 = 43 / 0;
                                            } else {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            }
                                            int i1214 = b;
                                            int i1215 = i1214 & 117;
                                            int i1216 = -(-((i1214 ^ 117) | i1215));
                                            int i1217 = (i1215 ^ i1216) + ((i1216 & i1215) << 1);
                                            a = i1217 % 128;
                                            int i1218 = i1217 % 2;
                                            textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i1219 = b;
                                            int i132 = ((i1219 ^ 36) + ((i1219 & 36) << 1)) - 1;
                                            a = i132 % 128;
                                            int i133 = i132 % 2;
                                        }
                                    }
                                    textView5.setOnClickListener(new ivas.gov.bisp.enumeration.p036bi.N(bVarB, 3));
                                    appCompatButton.setOnClickListener(new ViewOnClickListenerC0192u(passwordResetActivity2, bVarB, 4));
                                    int i134 = b;
                                    int i135 = (i134 & 73) + (i134 | 73);
                                    a = i135 % 128;
                                    int i136 = i135 % 2;
                                    return;
                                }
                            }
                        }
                    }
                } else if (PasswordResetActivity.s.matcher(strTrim).matches()) {
                    if (PasswordResetActivity.t.matcher(strTrim).matches()) {
                        int i710 = b;
                        int i711 = (i710 & (-70)) | ((~i710) & 69);
                        int i712 = (i710 & 69) << 1;
                        int i713 = (i711 ^ i712) + ((i712 & i711) << 1);
                        a = i713 % 128;
                        int i714 = i713 % 2;
                        if (PasswordResetActivity.r.matcher(strTrim).matches()) {
                            int i715 = b;
                            int i810 = (i715 & (-18)) | ((~i715) & 17);
                            int i811 = -(-((i715 & 17) << 1));
                            int i812 = (i810 & i811) + (i811 | i810);
                            a = i812 % 128;
                            int i813 = i812 % 2;
                            if (PasswordResetActivity.u.matcher(strTrim).matches()) {
                                int i814 = b;
                                int i815 = (((i814 | 8) << 1) - (i814 ^ 8)) - 1;
                                a = i815 % 128;
                                int i816 = i815 % 2;
                                if (strTrim.equals(strTrim2)) {
                                    int i817 = a;
                                    i46 = (i817 ^ 69) + ((i817 & 69) << 1);
                                    b = i46 % 128;
                                    if (i46 % 2 == 0) {
                                        passwordResetActivity2.A.setError("Passwords do not match");
                                        int i818 = 76 / 0;
                                    } else {
                                        passwordResetActivity2.A.setError("Passwords do not match");
                                    }
                                    int i819 = a;
                                    int i913 = (i819 ^ 93) + ((i819 & 93) << 1);
                                    b = i913 % 128;
                                    int i914 = i913 % 2;
                                    return;
                                }
                                passwordResetActivity2.K = strTrim;
                                aiz = new b.aIz(passwordResetActivity2);
                                int i915 = a;
                                i47 = ((((i915 ^ 57) | (i915 & 57)) << 1) - (~(-(((~i915) & 57) | (i915 & (-58)))))) - 1;
                                b = i47 % 128;
                                if (i47 % 2 != 0) {
                                    LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                    AlertController.OooO0O0 oooO0O2 = aiz.a;
                                    obj.hashCode();
                                    throw null;
                                }
                                viewInflate = LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                AlertController.OooO0O0 oooO0O3 = aiz.a;
                                oooO0O3.f1o = viewInflate;
                                oooO0O3.k = false;
                                int i916 = b;
                                int i917 = (i916 | 27) << 1;
                                int i918 = -(i916 ^ 27);
                                i48 = (i917 ^ i918) + ((i918 & i917) << 1);
                                a = i48 % 128;
                                if (i48 % 2 != 0) {
                                    bVarB = aiz.b();
                                    bVarB.show();
                                    int i919 = 70 / 0;
                                    if (bVarB.getWindow() != null) {
                                        int i9110 = b;
                                        int i9111 = ((i9110 ^ 15) - (~((i9110 & 15) << 1))) - 1;
                                        a = i9111 % 128;
                                        int i9112 = i9111 % 2;
                                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                        Resources resources3 = passwordResetActivity2.getResources();
                                        int i1018 = a;
                                        int i1019 = i1018 & 49;
                                        int i10110 = (i1018 | 49) & (~i1019);
                                        int i10111 = i1019 << 1;
                                        int i10112 = ((i10110 | i10111) << 1) - (i10110 ^ i10111);
                                        b = i10112 % 128;
                                        int i10113 = i10112 % 2;
                                        displayMetrics = resources3.getDisplayMetrics();
                                        i49 = (int) (displayMetrics.density * 600.0f);
                                        int i10114 = b;
                                        i50 = (i10114 & 69) + (i10114 | 69);
                                        a = i50 % 128;
                                        if (i50 % 2 != 0) {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        } else {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        }
                                        bVarB.getWindow().setLayout(iMin, -2);
                                        int i10115 = b + 27;
                                        a = i10115 % 128;
                                        int i10116 = i10115 % 2;
                                    }
                                } else {
                                    bVarB = aiz.b();
                                    bVarB.show();
                                    if (bVarB.getWindow() != null) {
                                        int i9113 = b;
                                        int i9114 = ((i9113 ^ 15) - (~((i9113 & 15) << 1))) - 1;
                                        a = i9114 % 128;
                                        int i9115 = i9114 % 2;
                                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                        Resources resources4 = passwordResetActivity2.getResources();
                                        int i10117 = a;
                                        int i10118 = i10117 & 49;
                                        int i10119 = (i10117 | 49) & (~i10118);
                                        int i101110 = i10118 << 1;
                                        int i101111 = ((i10119 | i101110) << 1) - (i10119 ^ i101110);
                                        b = i101111 % 128;
                                        int i101112 = i101111 % 2;
                                        displayMetrics = resources4.getDisplayMetrics();
                                        i49 = (int) (displayMetrics.density * 600.0f);
                                        int i101113 = b;
                                        i50 = (i101113 & 69) + (i101113 | 69);
                                        a = i50 % 128;
                                        if (i50 % 2 != 0) {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        } else {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        }
                                        bVarB.getWindow().setLayout(iMin, -2);
                                        int i101114 = b + 27;
                                        a = i101114 % 128;
                                        int i101115 = i101114 % 2;
                                    }
                                }
                                imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                                viewFindViewById = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                                int i1111 = b;
                                i51 = (i1111 ^ 25) + ((i1111 & 25) << 1);
                                a = i51 % 128;
                                if (i51 % 2 == 0) {
                                    throw null;
                                }
                                textView = (TextView) viewFindViewById;
                                textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                                int i1112 = b;
                                int i1113 = (i1112 ^ 14) + ((i1112 & 14) << 1);
                                i52 = (i1113 ^ (-1)) + (i1113 << 1);
                                a = i52 % 128;
                                if (i52 % 2 != 0) {
                                    textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                    viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                    int i1114 = 55 / 0;
                                } else {
                                    textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                    viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                }
                                textView4 = (TextView) viewFindViewById2;
                                AppCompatButton appCompatButton2 = (AppCompatButton) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                                int i1115 = b;
                                int i1116 = i1115 & 97;
                                int i1117 = (~i1116) & (i1115 | 97);
                                int i1118 = i1116 << 1;
                                i53 = (i1117 & i1118) + (i1117 | i1118);
                                a = i53 % 128;
                                if (i53 % 2 != 0) {
                                    textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                    int i1119 = 16 / 0;
                                    if (passwordResetActivity2.T == 0) {
                                        int i11110 = b;
                                        i54 = ((i11110 ^ 59) - (~(-(-((i11110 & 59) << 1))))) - 1;
                                        a = i54 % 128;
                                        if (i54 % 2 == 0) {
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            throw null;
                                        }
                                        imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                        textView.setText("Mobile SIM Verification (SMS)");
                                        textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                        textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i12110 = a + 107;
                                        b = i12110 % 128;
                                        int i12111 = i12110 % 2;
                                    } else {
                                        imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                        textView.setText("Official Email Verification");
                                        int i12112 = a;
                                        i55 = (i12112 ^ 111) + ((i12112 & 111) << 1);
                                        b = i55 % 128;
                                        if (i55 % 2 == 0) {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            int i12113 = 43 / 0;
                                        } else {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                        }
                                        int i12114 = b;
                                        int i12115 = i12114 & 117;
                                        int i12116 = -(-((i12114 ^ 117) | i12115));
                                        int i12117 = (i12115 ^ i12116) + ((i12116 & i12115) << 1);
                                        a = i12117 % 128;
                                        int i12118 = i12117 % 2;
                                        textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i12119 = b;
                                        int i137 = ((i12119 ^ 36) + ((i12119 & 36) << 1)) - 1;
                                        a = i137 % 128;
                                        int i138 = i137 % 2;
                                    }
                                } else {
                                    textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                    if (passwordResetActivity2.T == 0) {
                                        int i11111 = b;
                                        i54 = ((i11111 ^ 59) - (~(-(-((i11111 & 59) << 1))))) - 1;
                                        a = i54 % 128;
                                        if (i54 % 2 == 0) {
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            throw null;
                                        }
                                        imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                        textView.setText("Mobile SIM Verification (SMS)");
                                        textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                        textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i121110 = a + 107;
                                        b = i121110 % 128;
                                        int i121111 = i121110 % 2;
                                    } else {
                                        imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                        textView.setText("Official Email Verification");
                                        int i121112 = a;
                                        i55 = (i121112 ^ 111) + ((i121112 & 111) << 1);
                                        b = i55 % 128;
                                        if (i55 % 2 == 0) {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            int i121113 = 43 / 0;
                                        } else {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                        }
                                        int i121114 = b;
                                        int i121115 = i121114 & 117;
                                        int i121116 = -(-((i121114 ^ 117) | i121115));
                                        int i121117 = (i121115 ^ i121116) + ((i121116 & i121115) << 1);
                                        a = i121117 % 128;
                                        int i121118 = i121117 % 2;
                                        textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i121119 = b;
                                        int i139 = ((i121119 ^ 36) + ((i121119 & 36) << 1)) - 1;
                                        a = i139 % 128;
                                        int i1310 = i139 % 2;
                                    }
                                }
                                textView5.setOnClickListener(new ivas.gov.bisp.enumeration.p036bi.N(bVarB, 3));
                                appCompatButton2.setOnClickListener(new ViewOnClickListenerC0192u(passwordResetActivity2, bVarB, 4));
                                int i1311 = b;
                                int i1312 = (i1311 & 73) + (i1311 | 73);
                                a = i1312 % 128;
                                int i1313 = i1312 % 2;
                                return;
                            }
                        }
                    }
                }
                Toast.makeText(passwordResetActivity2, "Password must be 8-12 characters, include 1 uppercase, 1 number, and 1 special character", 1).show();
                int i140 = b;
                int i141 = ((i140 | 41) << 1) - (i140 ^ 41);
                a = i141 % 128;
                int i142 = i141 % 2;
            }
        });
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.N
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ PasswordResetActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText[] editTextArr;
                int length;
                int i310 = 2 % 2;
                int i311 = a;
                int i312 = ((i311 ^ 33) - (~(-(-((i311 & 33) << 1))))) - 1;
                int i313 = i312 % 128;
                b = i313;
                int i314 = i312 % 2;
                int i315 = i11;
                if (i315 == 0) {
                    PasswordResetActivity passwordResetActivity = this.d;
                    Pattern pattern = PasswordResetActivity.s;
                    passwordResetActivity.finish();
                    int i316 = b;
                    int i317 = i316 & 103;
                    int i318 = -(-((i316 ^ 103) | i317));
                    int i46 = (i317 & i318) + (i318 | i317);
                    a = i46 % 128;
                    int i47 = i46 % 2;
                    return;
                }
                if (i315 == 1) {
                    PasswordResetActivity passwordResetActivity2 = this.d;
                    passwordResetActivity2.D.setVisibility(8);
                    int i48 = b + 63;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    passwordResetActivity2.w.setVisibility(0);
                    int i410 = b;
                    int i411 = i410 & 21;
                    int i412 = (i410 | 21) & (~i411);
                    int i413 = i411 << 1;
                    int i414 = ((i412 | i413) << 1) - (i412 ^ i413);
                    a = i414 % 128;
                    if (i414 % 2 != 0) {
                        int i415 = 58 / 0;
                        return;
                    }
                    return;
                }
                int i50 = i313 & 1;
                int i51 = ((((i313 ^ 1) | i50) << 1) - (~(-((i313 | 1) & (~i50))))) - 1;
                a = i51 % 128;
                if (i51 % 2 != 0) {
                    int i52 = 5 / 2;
                }
                PasswordResetActivity passwordResetActivity3 = this.d;
                StringBuilder sb = new StringBuilder();
                int i53 = b;
                int i54 = (-2) - (((i53 ^ 42) + ((i53 & 42) << 1)) ^ (-1));
                a = i54 % 128;
                if (i54 % 2 != 0) {
                    editTextArr = passwordResetActivity3.M;
                    length = editTextArr.length;
                } else {
                    editTextArr = passwordResetActivity3.M;
                    length = editTextArr.length;
                }
                int i55 = a;
                int i56 = i55 | 35;
                int i57 = i56 << 1;
                int i58 = -((~(i55 & 35)) & i56);
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                b = i59 % 128;
                int i60 = i59 % 2;
                int i61 = 0;
                while (i61 < length) {
                    int i62 = a;
                    int i63 = ((i62 ^ 59) - (~(-(-((i62 & 59) << 1))))) - 1;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    Editable text = editTextArr[i61].getText();
                    int i65 = a;
                    int i66 = i65 & 49;
                    int i67 = (((i65 | 49) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                    b = i67 % 128;
                    int i68 = i67 % 2;
                    sb.append(text.toString().trim());
                    int i69 = i61 & 1;
                    i61 = ((i61 ^ 1) | i69) + i69;
                    int i70 = b;
                    int i71 = i70 ^ 121;
                    int i72 = (i70 & 121) << 1;
                    int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                    a = i73 % 128;
                    int i74 = i73 % 2;
                }
                String string = sb.toString();
                if (string.length() < 6) {
                    int i75 = b;
                    int i76 = (i75 & (-74)) | ((~i75) & 73);
                    int i77 = (i75 & 73) << 1;
                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                    a = i78 % 128;
                    int i79 = i78 % 2;
                    passwordResetActivity3.t();
                    Toast.makeText(passwordResetActivity3, "Please enter all 6 digits of the OTP", 0).show();
                    int i80 = b;
                    int i81 = i80 & 105;
                    int i82 = i81 + ((i80 ^ 105) | i81);
                    a = i82 % 128;
                    int i83 = i82 % 2;
                    return;
                }
                String str2 = passwordResetActivity3.K;
                passwordResetActivity3.v(true);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i84 = a;
                    int i85 = i84 & 117;
                    int i86 = ((i84 ^ 117) | i85) << 1;
                    int i87 = -((i84 | 117) & (~i85));
                    int i88 = (i86 & i87) + (i87 | i86);
                    b = i88 % 128;
                    int i89 = i88 % 2;
                    sb2.append(passwordResetActivity3.U);
                    sb2.append("/api/Users/PasswordReset");
                    String string2 = sb2.toString();
                    JSONObject jSONObject = new JSONObject();
                    int i90 = a;
                    int i91 = i90 | 109;
                    int i92 = ((i91 << 1) - (~(-((~(i90 & 109)) & i91)))) - 1;
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    jSONObject.put("otp_code", string);
                    int i94 = a;
                    int i95 = (i94 & (-36)) | ((~i94) & 35);
                    int i96 = -(-((i94 & 35) << 1));
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    b = i97 % 128;
                    if (i97 % 2 == 0) {
                        jSONObject.put("password", str2);
                        passwordResetActivity3.v.getText().toString();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    jSONObject.put("password", str2);
                    String string3 = passwordResetActivity3.v.getText().toString();
                    int i98 = a;
                    int i99 = i98 & 87;
                    int i100 = (i98 ^ 87) | i99;
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    b = i101 % 128;
                    int i102 = i101 % 2;
                    String strTrim = string3.replace("-", BuildConfig.FLAVOR).trim();
                    int i103 = b;
                    int i104 = i103 & 63;
                    int i105 = (i104 - (~((i103 ^ 63) | i104))) - 1;
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    if (strTrim.length() != 13) {
                        int i107 = b;
                        int i108 = i107 & 103;
                        int i109 = i107 | 103;
                        int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                        a = i110 % 128;
                        if (i110 % 2 == 0) {
                            passwordResetActivity3.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                            return;
                        } else {
                            passwordResetActivity3.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                            int i111 = 14 / 0;
                            return;
                        }
                    }
                    jSONObject.put("username", strTrim);
                    jSONObject.put("otptype", "Login");
                    Q q2 = new Q(passwordResetActivity3);
                    int i112 = a;
                    int i113 = i112 & 47;
                    int i114 = -(-((i112 ^ 47) | i113));
                    int i115 = (i113 & i114) + (i114 | i113);
                    b = i115 % 128;
                    if (i115 % 2 == 0) {
                        ax.e(jSONObject, passwordResetActivity3, string2, q2);
                        int i116 = 75 / 0;
                    } else {
                        ax.e(jSONObject, passwordResetActivity3, string2, q2);
                    }
                    int i117 = a;
                    int i118 = ((i117 ^ 55) | (i117 & 55)) << 1;
                    int i119 = -(((~i117) & 55) | (i117 & (-56)));
                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                    b = i120 % 128;
                    if (i120 % 2 == 0) {
                        int i121 = 19 / 0;
                    }
                } catch (Exception unused) {
                    passwordResetActivity3.v(false);
                }
            }
        });
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.m
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ PasswordResetActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:20:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:22:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:24:0x0108  */
            /* JADX WARN: Code duplicated, block: B:26:0x012c  */
            /* JADX WARN: Code duplicated, block: B:28:0x014e  */
            /* JADX WARN: Code duplicated, block: B:31:0x015f  */
            /* JADX WARN: Code duplicated, block: B:33:0x016c A[PHI: r3
  0x016c: PHI (r3v20 androidx.appcompat.app.b) = (r3v19 androidx.appcompat.app.b), (r3v25 androidx.appcompat.app.b) binds: [B:32:0x016a, B:29:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:35:0x01b9  */
            /* JADX WARN: Code duplicated, block: B:36:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:40:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:42:0x0220  */
            /* JADX WARN: Code duplicated, block: B:43:0x022e  */
            /* JADX WARN: Code duplicated, block: B:46:0x025b  */
            /* JADX WARN: Code duplicated, block: B:49:0x0269  */
            /* JADX WARN: Code duplicated, block: B:51:0x0273 A[PHI: r4
  0x0273: PHI (r4v19 android.widget.TextView) = (r4v18 android.widget.TextView), (r4v24 android.widget.TextView) binds: [B:50:0x0271, B:47:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:53:0x028b  */
            /* JADX WARN: Code duplicated, block: B:54:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:56:0x02b2 A[PHI: r4
  0x02b2: PHI (r4v22 android.widget.TextView) = (r4v18 android.widget.TextView), (r4v24 android.widget.TextView) binds: [B:50:0x0271, B:47:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:58:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:59:0x02d5  */
            /* JADX WARN: Code duplicated, block: B:63:0x0322  */
            /* JADX WARN: Code duplicated, block: B:65:0x032c  */
            /* JADX WARN: Code duplicated, block: B:67:0x033a  */
            /* JADX WARN: Code duplicated, block: B:69:0x034b  */
            /* JADX WARN: Code duplicated, block: B:70:0x0354  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i46;
                b.aIz aiz;
                int i47;
                View viewInflate;
                int i48;
                b bVarB;
                DisplayMetrics displayMetrics;
                int i49;
                int i50;
                int iMin;
                ImageView imageView;
                View viewFindViewById;
                int i51;
                TextView textView;
                TextView textView2;
                int i52;
                TextView textView3;
                View viewFindViewById2;
                TextView textView4;
                int i53;
                TextView textView5;
                int i54;
                int i55;
                int i56 = 2 % 2;
                int i57 = a;
                int i58 = i57 & 71;
                int i59 = (((i57 ^ 71) | i58) << 1) - ((~i58) & (i57 | 71));
                b = i59 % 128;
                int i60 = i59 % 2;
                if (i11 != 0) {
                    int i61 = ((i57 ^ 83) - (~((i57 & 83) << 1))) - 1;
                    int i62 = i61 % 128;
                    b = i62;
                    int i63 = i61 % 2;
                    int i64 = i62 & 105;
                    int i65 = (((i62 ^ 105) | i64) << 1) - ((i62 | 105) & (~i64));
                    a = i65 % 128;
                    int i66 = i65 % 2;
                    PasswordResetActivity passwordResetActivity = this.d;
                    Pattern pattern = PasswordResetActivity.s;
                    passwordResetActivity.s();
                    int i67 = b + 65;
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    return;
                }
                PasswordResetActivity passwordResetActivity2 = this.d;
                String strTrim = passwordResetActivity2.x.getText().toString().trim();
                int i69 = b;
                int i70 = (i69 ^ 63) + ((i69 & 63) << 1);
                a = i70 % 128;
                Object obj = null;
                if (i70 % 2 != 0) {
                    passwordResetActivity2.A.getText().toString().trim();
                    throw null;
                }
                String strTrim2 = passwordResetActivity2.A.getText().toString().trim();
                int i71 = b + 12;
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                a = i72 % 128;
                if (i72 % 2 != 0) {
                    int i73 = 7 / 0;
                    if (PasswordResetActivity.s.matcher(strTrim).matches()) {
                        if (PasswordResetActivity.t.matcher(strTrim).matches()) {
                            int i710 = b;
                            int i711 = (i710 & (-70)) | ((~i710) & 69);
                            int i712 = (i710 & 69) << 1;
                            int i713 = (i711 ^ i712) + ((i712 & i711) << 1);
                            a = i713 % 128;
                            int i714 = i713 % 2;
                            if (PasswordResetActivity.r.matcher(strTrim).matches()) {
                                int i715 = b;
                                int i810 = (i715 & (-18)) | ((~i715) & 17);
                                int i811 = -(-((i715 & 17) << 1));
                                int i812 = (i810 & i811) + (i811 | i810);
                                a = i812 % 128;
                                int i813 = i812 % 2;
                                if (PasswordResetActivity.u.matcher(strTrim).matches()) {
                                    int i814 = b;
                                    int i815 = (((i814 | 8) << 1) - (i814 ^ 8)) - 1;
                                    a = i815 % 128;
                                    int i816 = i815 % 2;
                                    if (strTrim.equals(strTrim2)) {
                                        int i817 = a;
                                        i46 = (i817 ^ 69) + ((i817 & 69) << 1);
                                        b = i46 % 128;
                                        if (i46 % 2 == 0) {
                                            passwordResetActivity2.A.setError("Passwords do not match");
                                            int i818 = 76 / 0;
                                        } else {
                                            passwordResetActivity2.A.setError("Passwords do not match");
                                        }
                                        int i819 = a;
                                        int i913 = (i819 ^ 93) + ((i819 & 93) << 1);
                                        b = i913 % 128;
                                        int i914 = i913 % 2;
                                        return;
                                    }
                                    passwordResetActivity2.K = strTrim;
                                    aiz = new b.aIz(passwordResetActivity2);
                                    int i915 = a;
                                    i47 = ((((i915 ^ 57) | (i915 & 57)) << 1) - (~(-(((~i915) & 57) | (i915 & (-58)))))) - 1;
                                    b = i47 % 128;
                                    if (i47 % 2 != 0) {
                                        LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                        AlertController.OooO0O0 oooO0O2 = aiz.a;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    viewInflate = LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                    AlertController.OooO0O0 oooO0O3 = aiz.a;
                                    oooO0O3.f1o = viewInflate;
                                    oooO0O3.k = false;
                                    int i916 = b;
                                    int i917 = (i916 | 27) << 1;
                                    int i918 = -(i916 ^ 27);
                                    i48 = (i917 ^ i918) + ((i918 & i917) << 1);
                                    a = i48 % 128;
                                    if (i48 % 2 != 0) {
                                        bVarB = aiz.b();
                                        bVarB.show();
                                        int i919 = 70 / 0;
                                        if (bVarB.getWindow() != null) {
                                            int i9113 = b;
                                            int i9114 = ((i9113 ^ 15) - (~((i9113 & 15) << 1))) - 1;
                                            a = i9114 % 128;
                                            int i9115 = i9114 % 2;
                                            bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                            Resources resources4 = passwordResetActivity2.getResources();
                                            int i10117 = a;
                                            int i10118 = i10117 & 49;
                                            int i10119 = (i10117 | 49) & (~i10118);
                                            int i101110 = i10118 << 1;
                                            int i101111 = ((i10119 | i101110) << 1) - (i10119 ^ i101110);
                                            b = i101111 % 128;
                                            int i101112 = i101111 % 2;
                                            displayMetrics = resources4.getDisplayMetrics();
                                            i49 = (int) (displayMetrics.density * 600.0f);
                                            int i101113 = b;
                                            i50 = (i101113 & 69) + (i101113 | 69);
                                            a = i50 % 128;
                                            if (i50 % 2 != 0) {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            } else {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            }
                                            bVarB.getWindow().setLayout(iMin, -2);
                                            int i101114 = b + 27;
                                            a = i101114 % 128;
                                            int i101115 = i101114 % 2;
                                        }
                                    } else {
                                        bVarB = aiz.b();
                                        bVarB.show();
                                        if (bVarB.getWindow() != null) {
                                            int i9116 = b;
                                            int i9117 = ((i9116 ^ 15) - (~((i9116 & 15) << 1))) - 1;
                                            a = i9117 % 128;
                                            int i9118 = i9117 % 2;
                                            bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                            Resources resources5 = passwordResetActivity2.getResources();
                                            int i101116 = a;
                                            int i101117 = i101116 & 49;
                                            int i101118 = (i101116 | 49) & (~i101117);
                                            int i101119 = i101117 << 1;
                                            int i1011110 = ((i101118 | i101119) << 1) - (i101118 ^ i101119);
                                            b = i1011110 % 128;
                                            int i1011111 = i1011110 % 2;
                                            displayMetrics = resources5.getDisplayMetrics();
                                            i49 = (int) (displayMetrics.density * 600.0f);
                                            int i1011112 = b;
                                            i50 = (i1011112 & 69) + (i1011112 | 69);
                                            a = i50 % 128;
                                            if (i50 % 2 != 0) {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            } else {
                                                iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                            }
                                            bVarB.getWindow().setLayout(iMin, -2);
                                            int i1011113 = b + 27;
                                            a = i1011113 % 128;
                                            int i1011114 = i1011113 % 2;
                                        }
                                    }
                                    imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                                    viewFindViewById = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                                    int i1111 = b;
                                    i51 = (i1111 ^ 25) + ((i1111 & 25) << 1);
                                    a = i51 % 128;
                                    if (i51 % 2 == 0) {
                                        throw null;
                                    }
                                    textView = (TextView) viewFindViewById;
                                    textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                                    int i1112 = b;
                                    int i1113 = (i1112 ^ 14) + ((i1112 & 14) << 1);
                                    i52 = (i1113 ^ (-1)) + (i1113 << 1);
                                    a = i52 % 128;
                                    if (i52 % 2 != 0) {
                                        textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                        viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                        int i1114 = 55 / 0;
                                    } else {
                                        textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                        viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                    }
                                    textView4 = (TextView) viewFindViewById2;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                                    int i1115 = b;
                                    int i1116 = i1115 & 97;
                                    int i1117 = (~i1116) & (i1115 | 97);
                                    int i1118 = i1116 << 1;
                                    i53 = (i1117 & i1118) + (i1117 | i1118);
                                    a = i53 % 128;
                                    if (i53 % 2 != 0) {
                                        textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                        int i1119 = 16 / 0;
                                        if (passwordResetActivity2.T == 0) {
                                            int i11111 = b;
                                            i54 = ((i11111 ^ 59) - (~(-(-((i11111 & 59) << 1))))) - 1;
                                            a = i54 % 128;
                                            if (i54 % 2 == 0) {
                                                imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                                textView.setText("Mobile SIM Verification (SMS)");
                                                throw null;
                                            }
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                            textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i121110 = a + 107;
                                            b = i121110 % 128;
                                            int i121111 = i121110 % 2;
                                        } else {
                                            imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                            textView.setText("Official Email Verification");
                                            int i121112 = a;
                                            i55 = (i121112 ^ 111) + ((i121112 & 111) << 1);
                                            b = i55 % 128;
                                            if (i55 % 2 == 0) {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                                int i121113 = 43 / 0;
                                            } else {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            }
                                            int i121114 = b;
                                            int i121115 = i121114 & 117;
                                            int i121116 = -(-((i121114 ^ 117) | i121115));
                                            int i121117 = (i121115 ^ i121116) + ((i121116 & i121115) << 1);
                                            a = i121117 % 128;
                                            int i121118 = i121117 % 2;
                                            textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i121119 = b;
                                            int i139 = ((i121119 ^ 36) + ((i121119 & 36) << 1)) - 1;
                                            a = i139 % 128;
                                            int i1310 = i139 % 2;
                                        }
                                    } else {
                                        textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                        if (passwordResetActivity2.T == 0) {
                                            int i11112 = b;
                                            i54 = ((i11112 ^ 59) - (~(-(-((i11112 & 59) << 1))))) - 1;
                                            a = i54 % 128;
                                            if (i54 % 2 == 0) {
                                                imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                                textView.setText("Mobile SIM Verification (SMS)");
                                                throw null;
                                            }
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                            textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i1211110 = a + 107;
                                            b = i1211110 % 128;
                                            int i1211111 = i1211110 % 2;
                                        } else {
                                            imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                            textView.setText("Official Email Verification");
                                            int i1211112 = a;
                                            i55 = (i1211112 ^ 111) + ((i1211112 & 111) << 1);
                                            b = i55 % 128;
                                            if (i55 % 2 == 0) {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                                int i1211113 = 43 / 0;
                                            } else {
                                                textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            }
                                            int i1211114 = b;
                                            int i1211115 = i1211114 & 117;
                                            int i1211116 = -(-((i1211114 ^ 117) | i1211115));
                                            int i1211117 = (i1211115 ^ i1211116) + ((i1211116 & i1211115) << 1);
                                            a = i1211117 % 128;
                                            int i1211118 = i1211117 % 2;
                                            textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                            textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                            int i1211119 = b;
                                            int i1311 = ((i1211119 ^ 36) + ((i1211119 & 36) << 1)) - 1;
                                            a = i1311 % 128;
                                            int i1312 = i1311 % 2;
                                        }
                                    }
                                    textView5.setOnClickListener(new ivas.gov.bisp.enumeration.p036bi.N(bVarB, 3));
                                    appCompatButton2.setOnClickListener(new ViewOnClickListenerC0192u(passwordResetActivity2, bVarB, 4));
                                    int i1313 = b;
                                    int i1314 = (i1313 & 73) + (i1313 | 73);
                                    a = i1314 % 128;
                                    int i1315 = i1314 % 2;
                                    return;
                                }
                            }
                        }
                    }
                } else if (PasswordResetActivity.s.matcher(strTrim).matches()) {
                    if (PasswordResetActivity.t.matcher(strTrim).matches()) {
                        int i716 = b;
                        int i717 = (i716 & (-70)) | ((~i716) & 69);
                        int i718 = (i716 & 69) << 1;
                        int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                        a = i719 % 128;
                        int i7110 = i719 % 2;
                        if (PasswordResetActivity.r.matcher(strTrim).matches()) {
                            int i7111 = b;
                            int i8110 = (i7111 & (-18)) | ((~i7111) & 17);
                            int i8111 = -(-((i7111 & 17) << 1));
                            int i8112 = (i8110 & i8111) + (i8111 | i8110);
                            a = i8112 % 128;
                            int i8113 = i8112 % 2;
                            if (PasswordResetActivity.u.matcher(strTrim).matches()) {
                                int i8114 = b;
                                int i8115 = (((i8114 | 8) << 1) - (i8114 ^ 8)) - 1;
                                a = i8115 % 128;
                                int i8116 = i8115 % 2;
                                if (strTrim.equals(strTrim2)) {
                                    int i8117 = a;
                                    i46 = (i8117 ^ 69) + ((i8117 & 69) << 1);
                                    b = i46 % 128;
                                    if (i46 % 2 == 0) {
                                        passwordResetActivity2.A.setError("Passwords do not match");
                                        int i8118 = 76 / 0;
                                    } else {
                                        passwordResetActivity2.A.setError("Passwords do not match");
                                    }
                                    int i8119 = a;
                                    int i9110 = (i8119 ^ 93) + ((i8119 & 93) << 1);
                                    b = i9110 % 128;
                                    int i9111 = i9110 % 2;
                                    return;
                                }
                                passwordResetActivity2.K = strTrim;
                                aiz = new b.aIz(passwordResetActivity2);
                                int i9112 = a;
                                i47 = ((((i9112 ^ 57) | (i9112 & 57)) << 1) - (~(-(((~i9112) & 57) | (i9112 & (-58)))))) - 1;
                                b = i47 % 128;
                                if (i47 % 2 != 0) {
                                    LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                    AlertController.OooO0O0 oooO0O4 = aiz.a;
                                    obj.hashCode();
                                    throw null;
                                }
                                viewInflate = LayoutInflater.from(passwordResetActivity2).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                AlertController.OooO0O0 oooO0O5 = aiz.a;
                                oooO0O5.f1o = viewInflate;
                                oooO0O5.k = false;
                                int i9119 = b;
                                int i9120 = (i9119 | 27) << 1;
                                int i9121 = -(i9119 ^ 27);
                                i48 = (i9120 ^ i9121) + ((i9121 & i9120) << 1);
                                a = i48 % 128;
                                if (i48 % 2 != 0) {
                                    bVarB = aiz.b();
                                    bVarB.show();
                                    int i9122 = 70 / 0;
                                    if (bVarB.getWindow() != null) {
                                        int i91110 = b;
                                        int i91111 = ((i91110 ^ 15) - (~((i91110 & 15) << 1))) - 1;
                                        a = i91111 % 128;
                                        int i91112 = i91111 % 2;
                                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                        Resources resources6 = passwordResetActivity2.getResources();
                                        int i1011115 = a;
                                        int i1011116 = i1011115 & 49;
                                        int i1011117 = (i1011115 | 49) & (~i1011116);
                                        int i1011118 = i1011116 << 1;
                                        int i1011119 = ((i1011117 | i1011118) << 1) - (i1011117 ^ i1011118);
                                        b = i1011119 % 128;
                                        int i10111110 = i1011119 % 2;
                                        displayMetrics = resources6.getDisplayMetrics();
                                        i49 = (int) (displayMetrics.density * 600.0f);
                                        int i10111111 = b;
                                        i50 = (i10111111 & 69) + (i10111111 | 69);
                                        a = i50 % 128;
                                        if (i50 % 2 != 0) {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        } else {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        }
                                        bVarB.getWindow().setLayout(iMin, -2);
                                        int i10111112 = b + 27;
                                        a = i10111112 % 128;
                                        int i10111113 = i10111112 % 2;
                                    }
                                } else {
                                    bVarB = aiz.b();
                                    bVarB.show();
                                    if (bVarB.getWindow() != null) {
                                        int i91113 = b;
                                        int i91114 = ((i91113 ^ 15) - (~((i91113 & 15) << 1))) - 1;
                                        a = i91114 % 128;
                                        int i91115 = i91114 % 2;
                                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                        Resources resources7 = passwordResetActivity2.getResources();
                                        int i10111114 = a;
                                        int i10111115 = i10111114 & 49;
                                        int i10111116 = (i10111114 | 49) & (~i10111115);
                                        int i10111117 = i10111115 << 1;
                                        int i10111118 = ((i10111116 | i10111117) << 1) - (i10111116 ^ i10111117);
                                        b = i10111118 % 128;
                                        int i10111119 = i10111118 % 2;
                                        displayMetrics = resources7.getDisplayMetrics();
                                        i49 = (int) (displayMetrics.density * 600.0f);
                                        int i101111110 = b;
                                        i50 = (i101111110 & 69) + (i101111110 | 69);
                                        a = i50 % 128;
                                        if (i50 % 2 != 0) {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        } else {
                                            iMin = Math.min(i49, (int) (((double) displayMetrics.widthPixels) * 0.85d));
                                        }
                                        bVarB.getWindow().setLayout(iMin, -2);
                                        int i101111111 = b + 27;
                                        a = i101111111 % 128;
                                        int i101111112 = i101111111 % 2;
                                    }
                                }
                                imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                                viewFindViewById = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                                int i11110 = b;
                                i51 = (i11110 ^ 25) + ((i11110 & 25) << 1);
                                a = i51 % 128;
                                if (i51 % 2 == 0) {
                                    throw null;
                                }
                                textView = (TextView) viewFindViewById;
                                textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                                int i11113 = b;
                                int i11114 = (i11113 ^ 14) + ((i11113 & 14) << 1);
                                i52 = (i11114 ^ (-1)) + (i11114 << 1);
                                a = i52 % 128;
                                if (i52 % 2 != 0) {
                                    textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                    viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                    int i11115 = 55 / 0;
                                } else {
                                    textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                    viewFindViewById2 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                }
                                textView4 = (TextView) viewFindViewById2;
                                AppCompatButton appCompatButton3 = (AppCompatButton) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                                int i11116 = b;
                                int i11117 = i11116 & 97;
                                int i11118 = (~i11117) & (i11116 | 97);
                                int i11119 = i11117 << 1;
                                i53 = (i11118 & i11119) + (i11118 | i11119);
                                a = i53 % 128;
                                if (i53 % 2 != 0) {
                                    textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                    int i11120 = 16 / 0;
                                    if (passwordResetActivity2.T == 0) {
                                        int i111110 = b;
                                        i54 = ((i111110 ^ 59) - (~(-(-((i111110 & 59) << 1))))) - 1;
                                        a = i54 % 128;
                                        if (i54 % 2 == 0) {
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            throw null;
                                        }
                                        imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                        textView.setText("Mobile SIM Verification (SMS)");
                                        textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                        textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i12111110 = a + 107;
                                        b = i12111110 % 128;
                                        int i12111111 = i12111110 % 2;
                                    } else {
                                        imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                        textView.setText("Official Email Verification");
                                        int i12111112 = a;
                                        i55 = (i12111112 ^ 111) + ((i12111112 & 111) << 1);
                                        b = i55 % 128;
                                        if (i55 % 2 == 0) {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            int i12111113 = 43 / 0;
                                        } else {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                        }
                                        int i12111114 = b;
                                        int i12111115 = i12111114 & 117;
                                        int i12111116 = -(-((i12111114 ^ 117) | i12111115));
                                        int i12111117 = (i12111115 ^ i12111116) + ((i12111116 & i12111115) << 1);
                                        a = i12111117 % 128;
                                        int i12111118 = i12111117 % 2;
                                        textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i12111119 = b;
                                        int i1316 = ((i12111119 ^ 36) + ((i12111119 & 36) << 1)) - 1;
                                        a = i1316 % 128;
                                        int i1317 = i1316 % 2;
                                    }
                                } else {
                                    textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                    if (passwordResetActivity2.T == 0) {
                                        int i111111 = b;
                                        i54 = ((i111111 ^ 59) - (~(-(-((i111111 & 59) << 1))))) - 1;
                                        a = i54 % 128;
                                        if (i54 % 2 == 0) {
                                            imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                            textView.setText("Mobile SIM Verification (SMS)");
                                            throw null;
                                        }
                                        imageView.setImageResource(android.R.drawable.stat_sys_phone_call);
                                        textView.setText("Mobile SIM Verification (SMS)");
                                        textView2.setText("رجسٹرڈ سم (ایس ایم ایس) کے ذریعے تصدیق");
                                        textView3.setText("A 6-digit OTP code will be sent via SMS to your registered SIM to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے رجسٹرڈ سم کارڈ پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i121111110 = a + 107;
                                        b = i121111110 % 128;
                                        int i121111111 = i121111110 % 2;
                                    } else {
                                        imageView.setImageResource(android.R.drawable.ic_dialog_email);
                                        textView.setText("Official Email Verification");
                                        int i121111112 = a;
                                        i55 = (i121111112 ^ 111) + ((i121111112 & 111) << 1);
                                        b = i55 % 128;
                                        if (i55 % 2 == 0) {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                            int i121111113 = 43 / 0;
                                        } else {
                                            textView2.setText("سرکاری ای میل کے ذریعے تصدیق");
                                        }
                                        int i121111114 = b;
                                        int i121111115 = i121111114 & 117;
                                        int i121111116 = -(-((i121111114 ^ 117) | i121111115));
                                        int i121111117 = (i121111115 ^ i121111116) + ((i121111116 & i121111115) << 1);
                                        a = i121111117 % 128;
                                        int i121111118 = i121111117 % 2;
                                        textView3.setText("A 6-digit OTP code will be sent to your registered Official Email to authorize this password reset.");
                                        textView4.setText("پاس ورڈ کی تجدید کے لیے آپ کے سرکاری رجسٹرڈ ای میل پر 6 ہندسوں کا سیکیورٹی کوڈ بھیجا جائے گا۔");
                                        int i121111119 = b;
                                        int i1318 = ((i121111119 ^ 36) + ((i121111119 & 36) << 1)) - 1;
                                        a = i1318 % 128;
                                        int i1319 = i1318 % 2;
                                    }
                                }
                                textView5.setOnClickListener(new ivas.gov.bisp.enumeration.p036bi.N(bVarB, 3));
                                appCompatButton3.setOnClickListener(new ViewOnClickListenerC0192u(passwordResetActivity2, bVarB, 4));
                                int i13110 = b;
                                int i13111 = (i13110 & 73) + (i13110 | 73);
                                a = i13111 % 128;
                                int i13112 = i13111 % 2;
                                return;
                            }
                        }
                    }
                }
                Toast.makeText(passwordResetActivity2, "Password must be 8-12 characters, include 1 uppercase, 1 number, and 1 special character", 1).show();
                int i140 = b;
                int i141 = ((i140 | 41) << 1) - (i140 ^ 41);
                a = i141 % 128;
                int i142 = i141 % 2;
            }
        });
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.N
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ PasswordResetActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText[] editTextArr;
                int length;
                int i310 = 2 % 2;
                int i311 = a;
                int i312 = ((i311 ^ 33) - (~(-(-((i311 & 33) << 1))))) - 1;
                int i313 = i312 % 128;
                b = i313;
                int i314 = i312 % 2;
                int i315 = i;
                if (i315 == 0) {
                    PasswordResetActivity passwordResetActivity = this.d;
                    Pattern pattern = PasswordResetActivity.s;
                    passwordResetActivity.finish();
                    int i316 = b;
                    int i317 = i316 & 103;
                    int i318 = -(-((i316 ^ 103) | i317));
                    int i46 = (i317 & i318) + (i318 | i317);
                    a = i46 % 128;
                    int i47 = i46 % 2;
                    return;
                }
                if (i315 == 1) {
                    PasswordResetActivity passwordResetActivity2 = this.d;
                    passwordResetActivity2.D.setVisibility(8);
                    int i48 = b + 63;
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    passwordResetActivity2.w.setVisibility(0);
                    int i410 = b;
                    int i411 = i410 & 21;
                    int i412 = (i410 | 21) & (~i411);
                    int i413 = i411 << 1;
                    int i414 = ((i412 | i413) << 1) - (i412 ^ i413);
                    a = i414 % 128;
                    if (i414 % 2 != 0) {
                        int i415 = 58 / 0;
                        return;
                    }
                    return;
                }
                int i50 = i313 & 1;
                int i51 = ((((i313 ^ 1) | i50) << 1) - (~(-((i313 | 1) & (~i50))))) - 1;
                a = i51 % 128;
                if (i51 % 2 != 0) {
                    int i52 = 5 / 2;
                }
                PasswordResetActivity passwordResetActivity3 = this.d;
                StringBuilder sb = new StringBuilder();
                int i53 = b;
                int i54 = (-2) - (((i53 ^ 42) + ((i53 & 42) << 1)) ^ (-1));
                a = i54 % 128;
                if (i54 % 2 != 0) {
                    editTextArr = passwordResetActivity3.M;
                    length = editTextArr.length;
                } else {
                    editTextArr = passwordResetActivity3.M;
                    length = editTextArr.length;
                }
                int i55 = a;
                int i56 = i55 | 35;
                int i57 = i56 << 1;
                int i58 = -((~(i55 & 35)) & i56);
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                b = i59 % 128;
                int i60 = i59 % 2;
                int i61 = 0;
                while (i61 < length) {
                    int i62 = a;
                    int i63 = ((i62 ^ 59) - (~(-(-((i62 & 59) << 1))))) - 1;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    Editable text = editTextArr[i61].getText();
                    int i65 = a;
                    int i66 = i65 & 49;
                    int i67 = (((i65 | 49) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                    b = i67 % 128;
                    int i68 = i67 % 2;
                    sb.append(text.toString().trim());
                    int i69 = i61 & 1;
                    i61 = ((i61 ^ 1) | i69) + i69;
                    int i70 = b;
                    int i71 = i70 ^ 121;
                    int i72 = (i70 & 121) << 1;
                    int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                    a = i73 % 128;
                    int i74 = i73 % 2;
                }
                String string = sb.toString();
                if (string.length() < 6) {
                    int i75 = b;
                    int i76 = (i75 & (-74)) | ((~i75) & 73);
                    int i77 = (i75 & 73) << 1;
                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                    a = i78 % 128;
                    int i79 = i78 % 2;
                    passwordResetActivity3.t();
                    Toast.makeText(passwordResetActivity3, "Please enter all 6 digits of the OTP", 0).show();
                    int i80 = b;
                    int i81 = i80 & 105;
                    int i82 = i81 + ((i80 ^ 105) | i81);
                    a = i82 % 128;
                    int i83 = i82 % 2;
                    return;
                }
                String str2 = passwordResetActivity3.K;
                passwordResetActivity3.v(true);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i84 = a;
                    int i85 = i84 & 117;
                    int i86 = ((i84 ^ 117) | i85) << 1;
                    int i87 = -((i84 | 117) & (~i85));
                    int i88 = (i86 & i87) + (i87 | i86);
                    b = i88 % 128;
                    int i89 = i88 % 2;
                    sb2.append(passwordResetActivity3.U);
                    sb2.append("/api/Users/PasswordReset");
                    String string2 = sb2.toString();
                    JSONObject jSONObject = new JSONObject();
                    int i90 = a;
                    int i91 = i90 | 109;
                    int i92 = ((i91 << 1) - (~(-((~(i90 & 109)) & i91)))) - 1;
                    b = i92 % 128;
                    int i93 = i92 % 2;
                    jSONObject.put("otp_code", string);
                    int i94 = a;
                    int i95 = (i94 & (-36)) | ((~i94) & 35);
                    int i96 = -(-((i94 & 35) << 1));
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    b = i97 % 128;
                    if (i97 % 2 == 0) {
                        jSONObject.put("password", str2);
                        passwordResetActivity3.v.getText().toString();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    jSONObject.put("password", str2);
                    String string3 = passwordResetActivity3.v.getText().toString();
                    int i98 = a;
                    int i99 = i98 & 87;
                    int i100 = (i98 ^ 87) | i99;
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    b = i101 % 128;
                    int i102 = i101 % 2;
                    String strTrim = string3.replace("-", BuildConfig.FLAVOR).trim();
                    int i103 = b;
                    int i104 = i103 & 63;
                    int i105 = (i104 - (~((i103 ^ 63) | i104))) - 1;
                    a = i105 % 128;
                    int i106 = i105 % 2;
                    if (strTrim.length() != 13) {
                        int i107 = b;
                        int i108 = i107 & 103;
                        int i109 = i107 | 103;
                        int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                        a = i110 % 128;
                        if (i110 % 2 == 0) {
                            passwordResetActivity3.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                            return;
                        } else {
                            passwordResetActivity3.v.setError("Please enter complete 13-digit CNIC (13 ہندسوں کا شناختی کارڈ درج کریں)");
                            int i111 = 14 / 0;
                            return;
                        }
                    }
                    jSONObject.put("username", strTrim);
                    jSONObject.put("otptype", "Login");
                    Q q2 = new Q(passwordResetActivity3);
                    int i112 = a;
                    int i113 = i112 & 47;
                    int i114 = -(-((i112 ^ 47) | i113));
                    int i115 = (i113 & i114) + (i114 | i113);
                    b = i115 % 128;
                    if (i115 % 2 == 0) {
                        ax.e(jSONObject, passwordResetActivity3, string2, q2);
                        int i116 = 75 / 0;
                    } else {
                        ax.e(jSONObject, passwordResetActivity3, string2, q2);
                    }
                    int i117 = a;
                    int i118 = ((i117 ^ 55) | (i117 & 55)) << 1;
                    int i119 = -(((~i117) & 55) | (i117 & (-56)));
                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                    b = i120 % 128;
                    if (i120 % 2 == 0) {
                        int i121 = 19 / 0;
                    }
                } catch (Exception unused) {
                    passwordResetActivity3.v(false);
                }
            }
        });
        ImageView imageView = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivToggleNewPassword);
        ImageView imageView2 = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivToggleConfirmPassword);
        imageView.setOnClickListener(new ViewOnClickListenerC0192u(this.x, imageView, i43));
        imageView2.setOnClickListener(new ViewOnClickListenerC0192u(this.A, imageView2, i43));
        this.x.addTextChangedListener(new O(this));
        int i46 = p;
        int i47 = (-2) - (((i46 & 112) + (i46 | 112)) ^ (-1));
        q = i47 % 128;
        while (true) {
            int i48 = i47 % 2;
            EditText[] editTextArr = this.M;
            if (i7 >= editTextArr.length) {
                int i49 = q;
                int i50 = ((i49 & 6) + (6 | i49)) - 1;
                p = i50 % 128;
                int i51 = i50 % 2;
                return;
            }
            editTextArr[i7].addTextChangedListener(new T(this, i7));
            EditText editText3 = this.M[i7];
            z zVar = new z(this, i7, 1);
            int i52 = q;
            int i53 = (i52 ^ 3) + ((i52 & 3) << 1);
            p = i53 % 128;
            int i54 = i53 % 2;
            editText3.setOnKeyListener(zVar);
            int i55 = (i7 & (-83)) + (i7 | (-83));
            i7 = ((i55 | 84) << 1) - (i55 ^ 84);
            i47 = q + 21;
            p = i47 % 128;
        }
    }
}
