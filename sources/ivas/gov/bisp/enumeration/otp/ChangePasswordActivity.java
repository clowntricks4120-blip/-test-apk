package ivas.gov.bisp.enumeration.otp;

import android.R;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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
import ivas.gov.bisp.enumeration.dj.CountDownTimerC0303l;
import ivas.gov.bisp.enumeration.dj.P;
import ivas.gov.bisp.enumeration.dj.u;
import ivas.gov.bisp.enumeration.dj.z;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p036bi.I;
import ivas.gov.bisp.enumeration.p036bi.ViewOnClickListenerC0192u;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0204j;
import ivas.gov.bisp.enumeration.p043bp.DialogInterfaceOnClickListenerC0217y;
import java.util.Objects;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ChangePasswordActivity extends AppCompatActivity {
    private static int p = 0;
    private static int q = 1;
    public static final Pattern r = Pattern.compile("^.{8,12}$");
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public EditText A;
    public TextView B;
    public TextView C;
    public AppCompatButton D;
    public TextView E;
    public LinearLayout F;
    public TextView G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView L;
    public TextView M;
    public EditText[] N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public ProgressBar R;
    public AppCompatButton S;
    public CountDownTimer V;
    public EditText v;
    public LinearLayout w;
    public EditText x;
    public TextView y;
    public EditText z;
    public String T = BuildConfig.FLAVOR;
    public String U = BuildConfig.FLAVOR;
    public String K = BuildConfig.FLAVOR;
    public String W = BuildConfig.FLAVOR;
    public boolean X = false;

    static {
        Pattern patternCompile = Pattern.compile("(?=.*[A-Z]).+");
        int i = p + 73;
        q = i % 128;
        if (i % 2 == 0) {
            s = patternCompile;
            u = Pattern.compile("(?=.*[0-9]).+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        s = patternCompile;
        u = Pattern.compile("(?=.*[0-9]).+");
        int i2 = q;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        p = i6 % 128;
        if (i6 % 2 == 0) {
            t = Pattern.compile("(?=.*[@#$%^&+=!._*-]).+");
        } else {
            t = Pattern.compile("(?=.*[@#$%^&+=!._*-]).+");
            int i7 = 97 / 0;
        }
    }

    public static void r(ChangePasswordActivity changePasswordActivity, TextView textView, boolean z, String str) {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 99;
        int i4 = ((i2 ^ 99) | i3) << 1;
        int i5 = -((i2 | 99) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        q = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        Objects.requireNonNull(changePasswordActivity);
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!z) {
            textView.setTextColor(-10193781);
            textView.setText(str);
            int i8 = q;
            int i9 = (((i8 | 31) << 1) - (~(-(i8 ^ 31)))) - 1;
            p = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        textView.setTextColor(-16411031);
        StringBuilder sb = new StringBuilder();
        int i10 = q;
        int i11 = i10 & 15;
        int i12 = -(-((i10 ^ 15) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        p = i13 % 128;
        int i14 = i13 % 2;
        sb.append("✓ ");
        int i15 = p;
        int i16 = i15 & 11;
        int i17 = (i16 - (~(-(-((i15 ^ 11) | i16))))) - 1;
        q = i17 % 128;
        int i18 = i17 % 2;
        sb.append(str.replace("• ", BuildConfig.FLAVOR));
        textView.setText(sb.toString());
        int i19 = p;
        int i20 = i19 & 89;
        int i21 = i20 + ((i19 ^ 89) | i20);
        q = i21 % 128;
        int i22 = i21 % 2;
    }

    public final void s(String str) {
        int i = 2 % 2;
        w(true);
        try {
            StringBuilder sb = new StringBuilder();
            int i2 = p;
            int i3 = i2 & 79;
            int i4 = ((i2 ^ 79) | i3) << 1;
            int i5 = -((i2 | 79) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            q = i6 % 128;
            int i7 = i6 % 2;
            sb.append(this.T);
            sb.append("/api/Users/SendOTP");
            String string = sb.toString();
            JSONObject jSONObject = new JSONObject();
            int i8 = q;
            int i9 = i8 & 117;
            int i10 = (((i8 ^ 117) | i9) << 1) - ((i8 | 117) & (~i9));
            p = i10 % 128;
            Object obj = null;
            if (i10 % 2 != 0) {
                jSONObject.put("username", str);
                jSONObject.put("otptype", "Password");
                obj.hashCode();
                throw null;
            }
            jSONObject.put("username", str);
            jSONObject.put("otptype", "Password");
            ax.e(jSONObject, this, string, new OooO00o());
            int i11 = p;
            int i12 = (i11 ^ 19) + ((i11 & 19) << 1);
            q = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
            w(false);
        }
    }

    public final void t(EditText editText, ImageView imageView) {
        int i = 2 % 2;
        I i2 = new I(editText, imageView, 2);
        int i3 = q;
        int i4 = i3 & 49;
        int i5 = (i3 | 49) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        p = i7 % 128;
        int i8 = i7 % 2;
        imageView.setOnClickListener(i2);
        int i9 = q;
        int i10 = (i9 ^ 65) + ((i9 & 65) << 1);
        p = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 32 / 0;
        }
    }

    public final void v() {
        int i = 2 % 2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setInterpolator(new CycleInterpolator(4.0f));
        int i2 = p;
        int i3 = (i2 ^ 41) + ((i2 & 41) << 1);
        q = i3 % 128;
        int i4 = i3 % 2;
        EditText[] editTextArr = this.N;
        int length = i4 == 0 ? editTextArr.length : editTextArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = q + 65;
            p = i6 % 128;
            int i7 = i6 % 2;
            editTextArr[i5].startAnimation(translateAnimation);
            int i8 = i5 | 1;
            int i9 = i8 << 1;
            int i10 = -((~(i5 & 1)) & i8);
            i5 = ((i9 | i10) << 1) - (i10 ^ i9);
            int i11 = q;
            int i12 = (((i11 | 90) << 1) - (i11 ^ 90)) - 1;
            p = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = p;
        int i15 = (i14 ^ 79) + ((i14 & 79) << 1);
        q = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 86 / 0;
        }
    }

    public class OooO00o implements ivas.gov.bisp.enumeration.p024ax.I {
        private static int a = 0;
        private static int b = 1;

        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onError(ResponseMessage responseMessage) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 39) + (i2 | 39);
            a = i3 % 128;
            int i4 = i3 % 2;
            ChangePasswordActivity changePasswordActivity = ChangePasswordActivity.this;
            Pattern pattern = ChangePasswordActivity.r;
            changePasswordActivity.w(false);
            int i5 = a;
            int i6 = (-2) - (((i5 & 68) + (i5 | 68)) ^ (-1));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                ivas.gov.bisp.enumeration.p091n.j.w("Send OTP Failed: ");
                responseMessage.getErrorMessage();
                throw null;
            }
            ChangePasswordActivity changePasswordActivity2 = ChangePasswordActivity.this;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Send OTP Failed: ");
            sbW.append(responseMessage.getErrorMessage());
            Toast.makeText(changePasswordActivity2, sbW.toString(), 1).show();
            int i7 = a;
            int i8 = i7 & 37;
            int i9 = (i7 | 37) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onSuccess(JSONObject jSONObject) {
            ChangePasswordActivity changePasswordActivity;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 81;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 81)) & i3);
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            ChangePasswordActivity changePasswordActivity2 = ChangePasswordActivity.this;
            Pattern pattern = ChangePasswordActivity.r;
            changePasswordActivity2.w(false);
            int i8 = b + 113;
            a = i8 % 128;
            try {
                boolean zOptBoolean = i8 % 2 != 0 ? jSONObject.optBoolean("status", true) : jSONObject.optBoolean("status", false);
                String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
                int i9 = b;
                int i10 = ((i9 ^ 21) | (i9 & 21)) << 1;
                int i11 = -(((~i9) & 21) | (i9 & (-22)));
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                if (!zOptBoolean) {
                    Toast.makeText(ChangePasswordActivity.this, strOptString, 1).show();
                    int i13 = b;
                    int i14 = i13 & 63;
                    int i15 = (i14 - (~(-(-((i13 ^ 63) | i14))))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    return;
                }
                ChangePasswordActivity changePasswordActivity3 = ChangePasswordActivity.this;
                jSONObject.optString("transaction_id", BuildConfig.FLAVOR);
                int i17 = a;
                int i18 = (((i17 ^ 79) | (i17 & 79)) << 1) - (((~i17) & 79) | (i17 & (-80)));
                b = i18 % 128;
                int i19 = i18 % 2;
                Objects.requireNonNull(changePasswordActivity3);
                ChangePasswordActivity changePasswordActivity4 = ChangePasswordActivity.this;
                int i20 = a + 35;
                b = i20 % 128;
                changePasswordActivity4.X = i20 % 2 == 0 ? jSONObject.optBoolean("isVpnEnabled", false) : jSONObject.optBoolean("isVpnEnabled", false);
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(ChangePasswordActivity.this).edit();
                ChangePasswordActivity changePasswordActivity5 = ChangePasswordActivity.this;
                int i21 = a;
                int i22 = ((i21 ^ 37) | (i21 & 37)) << 1;
                int i23 = -(((~i21) & 37) | (i21 & (-38)));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                int i25 = i24 % 2;
                SharedPreferences.Editor editorPutBoolean = editorEdit.putBoolean("isVpnEnabled", changePasswordActivity5.X);
                int i26 = b;
                int i27 = (i26 & 101) + (i26 | 101);
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    editorPutBoolean.apply();
                    changePasswordActivity = ChangePasswordActivity.this;
                } else {
                    editorPutBoolean.apply();
                    changePasswordActivity = ChangePasswordActivity.this;
                }
                Toast.makeText(changePasswordActivity, strOptString, 0).show();
                ChangePasswordActivity changePasswordActivity6 = ChangePasswordActivity.this;
                ChangePasswordActivity.p(changePasswordActivity6, changePasswordActivity6.X);
                int i28 = a;
                int i29 = i28 & 105;
                int i30 = ((((i28 ^ 105) | i29) << 1) - (~(-((i28 | 105) & (~i29))))) - 1;
                b = i30 % 128;
                if (i30 % 2 == 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r1
  0x0029: PHI (r1v9 android.os.CountDownTimer) = (r1v8 android.os.CountDownTimer), (r1v21 android.os.CountDownTimer) binds: [B:8:0x0027, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CountDownTimer countDownTimer;
        int i = 2 % 2;
        int i2 = q;
        int i3 = (((i2 & (-116)) | ((~i2) & 115)) - (~(-(-((i2 & 115) << 1))))) - 1;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            countDownTimer = this.V;
            int i4 = 46 / 0;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                int i5 = p;
                int i6 = i5 | 39;
                int i7 = i6 << 1;
                int i8 = -((~(i5 & 39)) & i6);
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                q = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            countDownTimer = this.V;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                int i11 = p;
                int i12 = i11 | 39;
                int i13 = i12 << 1;
                int i14 = -((~(i11 & 39)) & i12);
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                q = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        super.onDestroy();
        int i17 = q;
        int i18 = (i17 & 35) + (i17 | 35);
        p = i18 % 128;
        int i19 = i18 % 2;
    }

    public final void u() {
        int i = 2 % 2;
        int i2 = p;
        int i3 = i2 & 9;
        int i4 = (i3 - (~((i2 ^ 9) | i3))) - 1;
        int i5 = i4 % 128;
        q = i5;
        int i6 = i4 % 2;
        EditText[] editTextArr = this.N;
        int length = editTextArr.length;
        int i7 = ((i5 ^ 120) + ((i5 & 120) << 1)) - 1;
        p = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < length) {
            int i10 = q;
            int i11 = ((i10 | 15) << 1) - (i10 ^ 15);
            p = i11 % 128;
            if (i11 % 2 != 0) {
                editTextArr[i9].setText(BuildConfig.FLAVOR);
                int i12 = (i9 | 106) << 1;
                int i13 = -(((~i9) & 106) | (i9 & (-107)));
                i9 = (i12 & i13) + (i13 | i12);
            } else {
                editTextArr[i9].setText(BuildConfig.FLAVOR);
                int i14 = i9 | (-71);
                int i15 = ((i14 << 1) - (~(-((~(i9 & (-71))) & i14)))) + 72;
                i9 = (i15 ^ (-1)) + (i15 << 1);
            }
        }
        this.N[0].requestFocus();
        int i16 = p;
        int i17 = i16 ^ 91;
        int i18 = ((i16 & 91) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        q = i20 % 128;
        if (i20 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[PHI: r2
  0x002a: PHI (r2v14 android.widget.ProgressBar) = (r2v3 android.widget.ProgressBar), (r2v15 android.widget.ProgressBar) binds: [B:8:0x001c, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e A[PHI: r2
  0x001e: PHI (r2v4 android.widget.ProgressBar) = (r2v3 android.widget.ProgressBar), (r2v15 android.widget.ProgressBar) binds: [B:8:0x001c, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void w(boolean z) {
        ProgressBar progressBar;
        int i;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = (i3 & 85) + (i3 | 85);
        p = i4 % 128;
        int i5 = 0;
        if (i4 % 2 != 0) {
            progressBar = this.R;
            int i6 = 61 / 0;
            if (z) {
                i = i3 + 51;
                p = i % 128;
                if (i % 2 != 0) {
                    int i7 = 4 % 4;
                }
            } else {
                int i8 = ((i3 ^ 117) | (i3 & 117)) << 1;
                int i9 = -(((~i3) & 117) | (i3 & (-118)));
                int i10 = (i8 & i9) + (i9 | i8);
                p = i10 % 128;
                int i11 = i10 % 2;
                i5 = 8;
            }
        } else {
            progressBar = this.R;
            if (z) {
                i = i3 + 51;
                p = i % 128;
                if (i % 2 != 0) {
                    int i12 = 4 % 4;
                }
            } else {
                int i13 = ((i3 ^ 117) | (i3 & 117)) << 1;
                int i14 = -(((~i3) & 117) | (i3 & (-118)));
                int i15 = (i13 & i14) + (i14 | i13);
                p = i15 % 128;
                int i16 = i15 % 2;
                i5 = 8;
            }
        }
        progressBar.setVisibility(i5);
        this.D.setEnabled(((z ? 1 : 0) & (-2)) | ((~(z ? 1 : 0)) & 1));
        int i17 = q;
        int i18 = ((i17 & (-62)) | ((~i17) & 61)) + ((i17 & 61) << 1);
        p = i18 % 128;
        int i19 = i18 % 2;
        this.S.setEnabled(((z ? 1 : 0) | 1) & (~((z ? 1 : 0) & 1)));
        int i20 = p;
        int i21 = i20 & 23;
        int i22 = i21 + ((i20 ^ 23) | i21);
        q = i22 % 128;
        int i23 = i22 % 2;
    }

    public static void p(ChangePasswordActivity changePasswordActivity, boolean z) {
        int i = 2 % 2;
        int i2 = q;
        int i3 = i2 & 117;
        int i4 = (((i2 | 117) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        p = i4 % 128;
        int i5 = i4 % 2;
        changePasswordActivity.w.setVisibility(8);
        LinearLayout linearLayout = changePasswordActivity.F;
        int i6 = p;
        int i7 = (((i6 ^ 113) | (i6 & 113)) << 1) - (((~i6) & 113) | (i6 & (-114)));
        q = i7 % 128;
        if (i7 % 2 == 0) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(0);
        }
        TextView textView = changePasswordActivity.I;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("CNIC / ID: ");
        sbW.append(changePasswordActivity.U);
        int i8 = p;
        int i9 = (((i8 | 8) << 1) - (i8 ^ 8)) - 1;
        q = i9 % 128;
        int i10 = i9 % 2;
        textView.setText(sbW.toString());
        Object obj = null;
        if (z) {
            int i11 = p + 23;
            q = i11 % 128;
            int i12 = i11 % 2;
            changePasswordActivity.H.setImageResource(R.drawable.ic_dialog_email);
            TextView textView2 = changePasswordActivity.G;
            int i13 = p;
            int i14 = (i13 & 105) + (i13 | 105);
            q = i14 % 128;
            if (i14 % 2 == 0) {
                textView2.setText("Official Email OTP");
                changePasswordActivity.J.setText("A 6-digit OTP has been dispatched to your official registered Email address.");
                obj.hashCode();
                throw null;
            }
            textView2.setText("Official Email OTP");
            changePasswordActivity.J.setText("A 6-digit OTP has been dispatched to your official registered Email address.");
            changePasswordActivity.M.setText("آپ کے سرکاری رجسٹرڈ ای میل ایڈریس پر 6 ہندسوں کا کوڈ بھیجا گیا ہے۔");
            int i15 = p;
            int i16 = i15 & 93;
            int i17 = (i15 | 93) & (~i16);
            int i18 = i16 << 1;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            q = i19 % 128;
            int i20 = i19 % 2;
        } else {
            changePasswordActivity.H.setImageResource(R.drawable.stat_sys_phone_call);
            TextView textView3 = changePasswordActivity.G;
            int i21 = q + 31;
            p = i21 % 128;
            if (i21 % 2 != 0) {
                textView3.setText("Registered SIM OTP");
                changePasswordActivity.J.setText("A 6-digit OTP has been dispatched via SMS to your registered SIM.");
                TextView textView4 = changePasswordActivity.M;
                throw null;
            }
            textView3.setText("Registered SIM OTP");
            changePasswordActivity.J.setText("A 6-digit OTP has been dispatched via SMS to your registered SIM.");
            TextView textView5 = changePasswordActivity.M;
            int i22 = q;
            int i23 = i22 & 59;
            int i24 = (((i22 | 59) & (~i23)) - (~(i23 << 1))) - 1;
            p = i24 % 128;
            if (i24 % 2 != 0) {
                textView5.setText("آپ کے رجسٹرڈ موبائل سم پر 6 ہندسوں کا کوڈ بھیجا گیا ہے۔");
                obj.hashCode();
                throw null;
            }
            textView5.setText("آپ کے رجسٹرڈ موبائل سم پر 6 ہندسوں کا کوڈ بھیجا گیا ہے۔");
        }
        changePasswordActivity.u();
        changePasswordActivity.P.setVisibility(8);
        int i25 = p;
        int i26 = (((i25 | 59) << 1) - (~(-(((~i25) & 59) | (i25 & (-60)))))) - 1;
        q = i26 % 128;
        if (i26 % 2 == 0) {
            changePasswordActivity.O.setVisibility(1);
        } else {
            changePasswordActivity.O.setVisibility(0);
        }
        changePasswordActivity.L.setVisibility(0);
        CountDownTimer countDownTimer = changePasswordActivity.V;
        if (countDownTimer != null) {
            int i27 = p + 5;
            q = i27 % 128;
            if (i27 % 2 == 0) {
                countDownTimer.cancel();
                throw null;
            }
            countDownTimer.cancel();
            int i28 = p + 47;
            q = i28 % 128;
            int i29 = i28 % 2;
        }
        CountDownTimerC0303l countDownTimerC0303l = new CountDownTimerC0303l(changePasswordActivity, 60000L, 1000L);
        int i30 = q;
        int i31 = i30 ^ 81;
        int i32 = (i30 & 81) << 1;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        p = i33 % 128;
        int i34 = i33 % 2;
        changePasswordActivity.V = countDownTimerC0303l.start();
        if (i34 != 0) {
            obj.hashCode();
            throw null;
        }
        int i35 = q;
        int i36 = (i35 ^ 45) + ((i35 & 45) << 1);
        p = i36 % 128;
        if (i36 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void q(ChangePasswordActivity changePasswordActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(changePasswordActivity);
        b.aIz aiz = new b.aIz(changePasswordActivity);
        int i2 = q;
        int i3 = (i2 & 121) + (i2 | 121);
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            aiz.a.e = "Update Failed / پاس ورڈ تبدیل نہ ہو سکا";
            throw null;
        }
        aiz.a.e = "Update Failed / پاس ورڈ تبدیل نہ ہو سکا";
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(str, "\n\nPlease verify your OTP code and try again.");
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.f = strR;
        int i4 = q;
        int i5 = i4 & 113;
        int i6 = ((((i4 ^ 113) | i5) << 1) - (~(-((i4 | 113) & (~i5))))) - 1;
        p = i6 % 128;
        int i7 = i6 % 2;
        DialogInterfaceOnClickListenerC0217y dialogInterfaceOnClickListenerC0217y = DialogInterfaceOnClickListenerC0217y.f;
        oooO0O0.h = "Try Again / دوبارہ کوشش کریں";
        int i8 = q;
        int i9 = ((i8 | 113) << 1) - (i8 ^ 113);
        p = i9 % 128;
        if (i9 % 2 != 0) {
            oooO0O0.i = dialogInterfaceOnClickListenerC0217y;
            aiz.d();
            obj.hashCode();
            throw null;
        }
        oooO0O0.i = dialogInterfaceOnClickListenerC0217y;
        aiz.d();
        int i10 = q;
        int i11 = (i10 & (-14)) | ((~i10) & 13);
        int i12 = (i10 & 13) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        p = i13 % 128;
        int i14 = i13 % 2;
    }

    public static void o(ChangePasswordActivity changePasswordActivity, String str) {
        int i = 2 % 2;
        Objects.requireNonNull(changePasswordActivity);
        b.aIz aiz = new b.aIz(changePasswordActivity);
        int i2 = q;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((i2 | 11) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        p = i6 % 128;
        int i7 = i6 % 2;
        aiz.a.e = "Success / کامیابی";
        int i8 = p + 75;
        q = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            aiz.a.f = ivas.gov.bisp.enumeration.p091n.j.r(str, "\n\nPlease login using your new password.\nبرائے مہربانی اپنے نئے پاس ورڈ سے لاگ ان کریں۔");
            throw null;
        }
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(str, "\n\nPlease login using your new password.\nبرائے مہربانی اپنے نئے پاس ورڈ سے لاگ ان کریں۔");
        AlertController.OooO0O0 oooO0O0 = aiz.a;
        oooO0O0.f = strR;
        oooO0O0.k = false;
        DialogInterfaceOnClickListenerC0204j dialogInterfaceOnClickListenerC0204j = new DialogInterfaceOnClickListenerC0204j(changePasswordActivity, 4);
        int i9 = q;
        int i10 = ((i9 | 23) << 1) - (i9 ^ 23);
        p = i10 % 128;
        if (i10 % 2 != 0) {
            oooO0O0.h = "OK / لاگ ان کریں";
            oooO0O0.i = dialogInterfaceOnClickListenerC0204j;
            obj.hashCode();
            throw null;
        }
        oooO0O0.h = "OK / لاگ ان کریں";
        oooO0O0.i = dialogInterfaceOnClickListenerC0204j;
        int i11 = q + 117;
        p = i11 % 128;
        int i12 = i11 % 2;
        aiz.d();
        if (i12 != 0) {
            int i13 = 32 / 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        final int i = 2;
        int i2 = 2 % 2;
        int i3 = q;
        int i4 = (i3 & 95) + (i3 | 95);
        p = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(ivas.gov.bisp.enumeration.R.layout.activity_change_password);
            getIntent();
            obj.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        setContentView(ivas.gov.bisp.enumeration.R.layout.activity_change_password);
        String stringExtra = getIntent().getStringExtra("IP_URL");
        this.T = stringExtra;
        final int i5 = 1;
        if (stringExtra == null) {
            int i6 = q;
            int i7 = ((i6 ^ 8) + ((i6 & 8) << 1)) - 1;
            p = i7 % 128;
            if (i7 % 2 != 0) {
                this.T = BuildConfig.FLAVOR;
                obj.hashCode();
                throw null;
            }
            this.T = BuildConfig.FLAVOR;
        }
        final int i8 = 0;
        this.X = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("isVpnEnabled", false);
        ((ImageButton) findViewById(ivas.gov.bisp.enumeration.R.id.btnBack)).setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.i
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ChangePasswordActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            
                if (r0 != 1) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
            
                r0 = (r1 & (-96)) | ((~r1) & 95);
                r1 = -(-((r1 & 95) << 1));
                r4 = ((r0 | r1) << 1) - (r0 ^ r1);
                ivas.gov.bisp.enumeration.dj.i.a = r4 % 128;
                r4 = r4 % 2;
                r0 = r12.d;
                r1 = new java.lang.StringBuilder();
                r4 = ivas.gov.bisp.enumeration.dj.i.a;
                r5 = (r4 ^ 11) + ((r4 & 11) << 1);
                ivas.gov.bisp.enumeration.dj.i.b = r5 % 128;
                r5 = r5 % 2;
                r4 = r0.N;
                r5 = r4.length;
                r6 = ivas.gov.bisp.enumeration.dj.i.b;
                r7 = r6 ^ 61;
                r6 = ((r6 & 61) | r7) << 1;
                r7 = -r7;
                r9 = ((r6 | r7) << 1) - (r6 ^ r7);
                r6 = r9 % 128;
                ivas.gov.bisp.enumeration.dj.i.a = r6;
                r9 = r9 % 2;
                r6 = r6 + 117;
                ivas.gov.bisp.enumeration.dj.i.b = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
            
                if ((r6 % 2) != 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
            
                r6 = 3 % 3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
            
                r6 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
            
                r7 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
            
                if (r6 >= r5) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
            
                r9 = ivas.gov.bisp.enumeration.dj.i.b;
                r10 = ((r9 | 17) << 1) - (r9 ^ 17);
                ivas.gov.bisp.enumeration.dj.i.a = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
            
                if ((r10 % 2) != 0) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
            
                r1.append(r4[r6].getText().toString().trim());
                r7 = (r6 & (-119)) + (r6 | (-119));
                r6 = (r7 & 120) + (r7 | 120);
                r7 = ivas.gov.bisp.enumeration.dj.i.a + 103;
                ivas.gov.bisp.enumeration.dj.i.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
            
                r4[r6].getText();
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
            
                r1 = r1.toString();
                r4 = r1.length();
                r5 = ivas.gov.bisp.enumeration.dj.i.b;
                r6 = r5 ^ 23;
                r5 = ((r5 & 23) | r6) << 1;
                r6 = -r6;
                r9 = (r5 & r6) + (r5 | r6);
                ivas.gov.bisp.enumeration.dj.i.a = r9 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
            
                if ((r9 % 2) == 0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
            
                if (r4 >= 32) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
            
                if (r4 >= 6) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
            
                r0.v();
                android.widget.Toast.makeText(r0, "Please enter complete 6-digit OTP", 0).show();
                r0 = ivas.gov.bisp.enumeration.dj.i.a;
                r1 = (r0 & 119) + (r0 | 119);
                ivas.gov.bisp.enumeration.dj.i.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
            
                if ((r1 % 2) == 0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
            
                r7.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
            
                r4 = r0.W;
                r5 = r0.K;
                r6 = r0.U;
                r0.w(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
            
                r7 = new java.lang.StringBuilder();
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
            
                r7.append(r0.T);
                r7.append("/api/Users/PasswordReset");
                r7 = r7.toString();
                r9 = new org.json.JSONObject();
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
            
                r10 = ivas.gov.bisp.enumeration.dj.i.b;
                r11 = r10 & 79;
                r11 = (r11 - (~(-(-((r10 ^ 79) | r11))))) - 1;
                ivas.gov.bisp.enumeration.dj.i.a = r11 % 128;
                r11 = r11 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
            
                r9.put("otp_code", r1);
                r9.put("oldpassword", r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
            
                r1 = ivas.gov.bisp.enumeration.dj.i.a;
                r4 = r1 & 41;
                r4 = r4 + ((r1 ^ 41) | r4);
                ivas.gov.bisp.enumeration.dj.i.b = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
            
                if ((r4 % 2) != 0) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
            
                r9.put("password", r5);
                r9.put("username", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
            
                r1 = 81 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
            
                r9.put("password", r5);
                r9.put("username", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x014d, code lost:
            
                r9.put("otptype", "Password");
                r1 = new ivas.gov.bisp.enumeration.dj.C0308t(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
            
                r4 = ivas.gov.bisp.enumeration.dj.i.a;
                r5 = (r4 & (-62)) | ((~r4) & 61);
                r4 = (r4 & 61) << 1;
                r6 = (r5 ^ r4) + ((r4 & r5) << 1);
                ivas.gov.bisp.enumeration.dj.i.b = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
            
                ivas.gov.bisp.enumeration.p024ax.ax.e(r9, r0, r7, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0170, code lost:
            
                r0 = ivas.gov.bisp.enumeration.dj.i.b + 79;
                ivas.gov.bisp.enumeration.dj.i.a = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x017a, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x017c, code lost:
            
                r0.w(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0180, code lost:
            
                r0 = r12.d;
                r0.F.setVisibility(8);
                r0 = r0.w;
                r1 = ivas.gov.bisp.enumeration.dj.i.a;
                r4 = (((r1 | 122) << 1) - (r1 ^ 122)) - 1;
                ivas.gov.bisp.enumeration.dj.i.b = r4 % 128;
                r4 = r4 % 2;
                r0.setVisibility(0);
                r0 = ivas.gov.bisp.enumeration.dj.i.b;
                r1 = (r0 & (-46)) | ((~r0) & 45);
                r0 = -(-((r0 & 45) << 1));
                r2 = (r1 & r0) + (r0 | r1);
                ivas.gov.bisp.enumeration.dj.i.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x01b2, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r0 != 1) goto L11;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r13) {
                /*
                    Method dump skipped, instruction units count: 464
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dj.i.onClick(android.view.View):void");
            }
        });
        this.w = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.layoutStep1Form);
        EditText editText = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etCnic);
        this.v = editText;
        C0302a c0302a = new C0302a(editText);
        int i9 = p;
        int i10 = i9 & 69;
        int i11 = (i9 ^ 69) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        q = i12 % 128;
        int i13 = i12 % 2;
        editText.addTextChangedListener(c0302a);
        this.A = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etNewPassword);
        this.x = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etOldPassword);
        this.z = (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.etConfirmPassword);
        this.B = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleLength);
        this.C = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleUpper);
        int i14 = q;
        int i15 = ((i14 & 118) + (i14 | 118)) - 1;
        p = i15 % 128;
        int i16 = i15 % 2;
        this.y = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleNumber);
        this.E = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvRuleSpecial);
        this.D = (AppCompatButton) findViewById(ivas.gov.bisp.enumeration.R.id.btnProceedToVerification);
        this.F = (LinearLayout) findViewById(ivas.gov.bisp.enumeration.R.id.layoutStep2Otp);
        this.H = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivOtpChannelIcon);
        View viewFindViewById = findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpChannelTitle);
        int i17 = p;
        int i18 = ((i17 | 89) << 1) - (i17 ^ 89);
        q = i18 % 128;
        int i19 = i18 % 2;
        this.G = (TextView) viewFindViewById;
        this.I = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpTargetCnic);
        this.J = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpChannelMessageEn);
        this.M = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvOtpChannelMessageUr);
        View viewFindViewById2 = findViewById(ivas.gov.bisp.enumeration.R.id.otpBox2);
        int i20 = q + 41;
        p = i20 % 128;
        int i21 = i20 % 2;
        this.N = new EditText[]{(EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox1), (EditText) viewFindViewById2, (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox3), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox4), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox5), (EditText) findViewById(ivas.gov.bisp.enumeration.R.id.otpBox6)};
        this.O = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvTimerPrefix);
        this.L = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.tvTimerCountdown);
        this.P = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.btnResendOtp);
        this.Q = (TextView) findViewById(ivas.gov.bisp.enumeration.R.id.btnBackToForm);
        this.S = (AppCompatButton) findViewById(ivas.gov.bisp.enumeration.R.id.btnSubmitPasswordReset);
        this.R = (ProgressBar) findViewById(ivas.gov.bisp.enumeration.R.id.pbLoading);
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.p
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ChangePasswordActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strTrim;
                EditText editText2;
                View viewInflate;
                int i22 = 2;
                int i23 = 2 % 2;
                int i24 = a;
                int i25 = i24 ^ 63;
                int i26 = -(-((i24 & 63) << 1));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                b = i27 % 128;
                Object obj2 = null;
                if (i27 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (i8 != 0) {
                    int i28 = ((i24 & 52) + (i24 | 52)) - 1;
                    int i29 = i28 % 128;
                    b = i29;
                    int i30 = i28 % 2;
                    int i31 = i29 & 23;
                    int i32 = ((i29 ^ 23) | i31) << 1;
                    int i33 = -((i29 | 23) & (~i31));
                    int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                    a = i34 % 128;
                    if (i34 % 2 != 0) {
                        ChangePasswordActivity changePasswordActivity = this.d;
                        changePasswordActivity.s(changePasswordActivity.U);
                        throw null;
                    }
                    ChangePasswordActivity changePasswordActivity2 = this.d;
                    changePasswordActivity2.s(changePasswordActivity2.U);
                    int i35 = a;
                    int i36 = ((i35 & (-86)) | ((~i35) & 85)) + ((i35 & 85) << 1);
                    b = i36 % 128;
                    if (i36 % 2 == 0) {
                        int i37 = 81 / 0;
                        return;
                    }
                    return;
                }
                ChangePasswordActivity changePasswordActivity3 = this.d;
                Editable text = changePasswordActivity3.v.getText();
                int i38 = b;
                int i39 = (-2) - ((((i38 | 90) << 1) - (i38 ^ 90)) ^ (-1));
                a = i39 % 128;
                int i40 = i39 % 2;
                String strTrim2 = text.toString().replace("-", BuildConfig.FLAVOR).trim();
                int i41 = a + 75;
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    changePasswordActivity3.A.getText().toString();
                    throw null;
                }
                String strTrim3 = changePasswordActivity3.A.getText().toString().trim();
                Editable text2 = changePasswordActivity3.x.getText();
                int i42 = b;
                int i43 = ((i42 ^ 95) | (i42 & 95)) << 1;
                int i44 = -(((~i42) & 95) | (i42 & (-96)));
                int i45 = (i43 & i44) + (i44 | i43);
                a = i45 % 128;
                if (i45 % 2 != 0) {
                    strTrim = text2.toString().trim();
                    editText2 = changePasswordActivity3.z;
                    int i46 = 47 / 0;
                } else {
                    strTrim = text2.toString().trim();
                    editText2 = changePasswordActivity3.z;
                }
                String strTrim4 = editText2.getText().toString().trim();
                int i47 = b;
                int i48 = i47 & 95;
                int i49 = ((i47 ^ 95) | i48) << 1;
                int i50 = -((i47 | 95) & (~i48));
                int i51 = (i49 & i50) + (i50 | i49);
                a = i51 % 128;
                if (i51 % 2 != 0) {
                    strTrim2.isEmpty();
                    obj2.hashCode();
                    throw null;
                }
                if (!(!strTrim2.isEmpty())) {
                    int i52 = (-2) - ((b + 32) ^ (-1));
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    changePasswordActivity3.v.setError("CNIC is required");
                    int i54 = b;
                    int i55 = i54 & 27;
                    int i56 = ((i54 ^ 27) | i55) << 1;
                    int i57 = -((i54 | 27) & (~i55));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    return;
                }
                if (!(!strTrim.isEmpty())) {
                    int i60 = b;
                    int i61 = i60 & 85;
                    int i62 = (((i60 ^ 85) | i61) << 1) - ((i60 | 85) & (~i61));
                    a = i62 % 128;
                    if (i62 % 2 != 0) {
                        changePasswordActivity3.x.setError("Old Password is required");
                        obj2.hashCode();
                        throw null;
                    }
                    changePasswordActivity3.x.setError("Old Password is required");
                    int i63 = a + 83;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    return;
                }
                if (ChangePasswordActivity.r.matcher(strTrim3).matches()) {
                    int i65 = b;
                    int i66 = i65 & 57;
                    int i67 = ((i65 | 57) & (~i66)) + (i66 << 1);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    if (ChangePasswordActivity.s.matcher(strTrim3).matches()) {
                        int i69 = b + 5;
                        a = i69 % 128;
                        if (i69 % 2 != 0) {
                            ChangePasswordActivity.u.matcher(strTrim3).matches();
                            throw null;
                        }
                        if (!(!ChangePasswordActivity.u.matcher(strTrim3).matches())) {
                            int i70 = a;
                            int i71 = i70 & 109;
                            int i72 = ((i70 ^ 109) | i71) << 1;
                            int i73 = -((i70 | 109) & (~i71));
                            int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                            b = i74 % 128;
                            int i75 = i74 % 2;
                            if (ChangePasswordActivity.t.matcher(strTrim3).matches()) {
                                int i76 = a;
                                int i77 = ((i76 | 52) << 1) - (i76 ^ 52);
                                int i78 = (i77 ^ (-1)) + (i77 << 1);
                                b = i78 % 128;
                                if (i78 % 2 == 0) {
                                    strTrim3.equals(strTrim4);
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (!strTrim3.equals(strTrim4)) {
                                    changePasswordActivity3.z.setError("Passwords do not match");
                                    int i79 = a;
                                    int i80 = ((i79 | 123) << 1) - (((~i79) & 123) | (i79 & (-124)));
                                    b = i80 % 128;
                                    if (i80 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                changePasswordActivity3.U = strTrim2;
                                changePasswordActivity3.K = strTrim3;
                                changePasswordActivity3.W = strTrim;
                                b.aIz aiz = new b.aIz(changePasswordActivity3);
                                int i81 = b + 38;
                                int i82 = (i81 ^ (-1)) + (i81 << 1);
                                a = i82 % 128;
                                if (i82 % 2 != 0) {
                                    viewInflate = LayoutInflater.from(changePasswordActivity3).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                    int i83 = 81 / 0;
                                } else {
                                    viewInflate = LayoutInflater.from(changePasswordActivity3).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                }
                                int i84 = b;
                                int i85 = i84 ^ 107;
                                int i86 = -(-((i84 & 107) << 1));
                                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                                a = i87 % 128;
                                int i88 = i87 % 2;
                                AlertController.OooO0O0 oooO0O0 = aiz.a;
                                oooO0O0.f1o = viewInflate;
                                int i89 = a;
                                int i90 = (i89 & 1) + (i89 | 1);
                                b = i90 % 128;
                                int i91 = i90 % 2;
                                oooO0O0.k = false;
                                b bVarB = aiz.b();
                                if (bVarB.getWindow() != null) {
                                    int i92 = b;
                                    int i93 = i92 & 53;
                                    int i94 = ((i92 ^ 53) | i93) << 1;
                                    int i95 = -((i92 | 53) & (~i93));
                                    int i96 = (i94 & i95) + (i95 | i94);
                                    a = i96 % 128;
                                    if (i96 % 2 != 0) {
                                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                        changePasswordActivity3.getResources();
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                    DisplayMetrics displayMetrics = changePasswordActivity3.getResources().getDisplayMetrics();
                                    float f = displayMetrics.density * 600.0f;
                                    int i97 = a;
                                    int i98 = (((i97 & (-78)) | (77 & (~i97))) - (~((i97 & 77) << 1))) - 1;
                                    b = i98 % 128;
                                    int i99 = i98 % 2;
                                    int i100 = (int) (((double) displayMetrics.widthPixels) * 0.85d);
                                    int i101 = a;
                                    int i102 = ((i101 ^ 33) | (i101 & 33)) << 1;
                                    int i103 = -(((~i101) & 33) | (i101 & (-34)));
                                    int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                                    b = i104 % 128;
                                    int i105 = i104 % 2;
                                    int iMin = Math.min((int) f, i100);
                                    Window window = bVarB.getWindow();
                                    int i106 = a + 73;
                                    b = i106 % 128;
                                    if (i106 % 2 == 0) {
                                        window.setLayout(iMin, -2);
                                        throw null;
                                    }
                                    window.setLayout(iMin, -2);
                                    int i107 = b + 41;
                                    a = i107 % 128;
                                    int i108 = i107 % 2;
                                }
                                ImageView imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                                TextView textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                                int i109 = b;
                                int i110 = i109 ^ 43;
                                int i111 = (i109 & 43) << 1;
                                int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                                a = i112 % 128;
                                if (i112 % 2 != 0) {
                                    throw null;
                                }
                                TextView textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                                TextView textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                int i113 = b + 27;
                                a = i113 % 128;
                                int i114 = i113 % 2;
                                TextView textView4 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                View viewFindViewById3 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                                int i115 = b;
                                int i116 = i115 & 35;
                                int i117 = i116 + ((i115 ^ 35) | i116);
                                a = i117 % 128;
                                int i118 = i117 % 2;
                                TextView textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                int i119 = b;
                                int i120 = ((i119 ^ 16) + ((i119 & 16) << 1)) - 1;
                                a = i120 % 128;
                                int i121 = i120 % 2;
                                imageView.setImageResource(android.R.drawable.ic_lock_lock);
                                textView.setText("OTP Authentication Notice");
                                textView2.setText("تصدیقی کوڈ (OTP) کی ترسیل");
                                textView3.setText("Your 6-digit OTP will be dispatched to your registered Official Email (if Wi-Fi / VPN is authorized) or via SMS to your registered SIM.");
                                textView4.setText("آپ کا 6 ہندسوں کا او ٹی پی رجسٹرڈ سرکاری ای میل (اگر وائی فائی یا وی پی این فعال ہے) یا رجسٹرڈ سم پر بذریعہ ایس ایم ایس بھیجا جائے گا۔");
                                textView5.setOnClickListener(new ivas.gov.bisp.enumeration.p036bi.N(bVarB, i22));
                                ((AppCompatButton) viewFindViewById3).setOnClickListener(new ViewOnClickListenerC0192u(changePasswordActivity3, bVarB, i22));
                                int i122 = b;
                                int i123 = i122 ^ 81;
                                int i124 = ((i122 & 81) | i123) << 1;
                                int i125 = -i123;
                                int i126 = (i124 & i125) + (i124 | i125);
                                a = i126 % 128;
                                int i127 = i126 % 2;
                                bVarB.show();
                                int i128 = b;
                                int i129 = ((((i128 ^ 57) | (i128 & 57)) << 1) - (~(-(((~i128) & 57) | (i128 & (-58)))))) - 1;
                                a = i129 % 128;
                                if (i129 % 2 != 0) {
                                    int i130 = 93 / 0;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Toast.makeText(changePasswordActivity3, "Password does not meet all criteria (8-12 chars, 1 uppercase, 1 number, 1 special character)", 1).show();
                int i131 = b;
                int i132 = (i131 & 19) + (i131 | 19);
                a = i132 % 128;
                if (i132 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        });
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.i
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ChangePasswordActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            
                if (r0 != 1) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
            
                r0 = (r1 & (-96)) | ((~r1) & 95);
                r1 = -(-((r1 & 95) << 1));
                r4 = ((r0 | r1) << 1) - (r0 ^ r1);
                ivas.gov.bisp.enumeration.dj.i.a = r4 % 128;
                r4 = r4 % 2;
                r0 = r12.d;
                r1 = new java.lang.StringBuilder();
                r4 = ivas.gov.bisp.enumeration.dj.i.a;
                r5 = (r4 ^ 11) + ((r4 & 11) << 1);
                ivas.gov.bisp.enumeration.dj.i.b = r5 % 128;
                r5 = r5 % 2;
                r4 = r0.N;
                r5 = r4.length;
                r6 = ivas.gov.bisp.enumeration.dj.i.b;
                r7 = r6 ^ 61;
                r6 = ((r6 & 61) | r7) << 1;
                r7 = -r7;
                r9 = ((r6 | r7) << 1) - (r6 ^ r7);
                r6 = r9 % 128;
                ivas.gov.bisp.enumeration.dj.i.a = r6;
                r9 = r9 % 2;
                r6 = r6 + 117;
                ivas.gov.bisp.enumeration.dj.i.b = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
            
                if ((r6 % 2) != 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
            
                r6 = 3 % 3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
            
                r6 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
            
                r7 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
            
                if (r6 >= r5) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
            
                r9 = ivas.gov.bisp.enumeration.dj.i.b;
                r10 = ((r9 | 17) << 1) - (r9 ^ 17);
                ivas.gov.bisp.enumeration.dj.i.a = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
            
                if ((r10 % 2) != 0) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
            
                r1.append(r4[r6].getText().toString().trim());
                r7 = (r6 & (-119)) + (r6 | (-119));
                r6 = (r7 & 120) + (r7 | 120);
                r7 = ivas.gov.bisp.enumeration.dj.i.a + 103;
                ivas.gov.bisp.enumeration.dj.i.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
            
                r4[r6].getText();
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
            
                r1 = r1.toString();
                r4 = r1.length();
                r5 = ivas.gov.bisp.enumeration.dj.i.b;
                r6 = r5 ^ 23;
                r5 = ((r5 & 23) | r6) << 1;
                r6 = -r6;
                r9 = (r5 & r6) + (r5 | r6);
                ivas.gov.bisp.enumeration.dj.i.a = r9 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
            
                if ((r9 % 2) == 0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
            
                if (r4 >= 32) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
            
                if (r4 >= 6) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
            
                r0.v();
                android.widget.Toast.makeText(r0, "Please enter complete 6-digit OTP", 0).show();
                r0 = ivas.gov.bisp.enumeration.dj.i.a;
                r1 = (r0 & 119) + (r0 | 119);
                ivas.gov.bisp.enumeration.dj.i.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
            
                if ((r1 % 2) == 0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
            
                r7.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
            
                r4 = r0.W;
                r5 = r0.K;
                r6 = r0.U;
                r0.w(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
            
                r7 = new java.lang.StringBuilder();
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
            
                r7.append(r0.T);
                r7.append("/api/Users/PasswordReset");
                r7 = r7.toString();
                r9 = new org.json.JSONObject();
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
            
                r10 = ivas.gov.bisp.enumeration.dj.i.b;
                r11 = r10 & 79;
                r11 = (r11 - (~(-(-((r10 ^ 79) | r11))))) - 1;
                ivas.gov.bisp.enumeration.dj.i.a = r11 % 128;
                r11 = r11 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
            
                r9.put("otp_code", r1);
                r9.put("oldpassword", r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
            
                r1 = ivas.gov.bisp.enumeration.dj.i.a;
                r4 = r1 & 41;
                r4 = r4 + ((r1 ^ 41) | r4);
                ivas.gov.bisp.enumeration.dj.i.b = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
            
                if ((r4 % 2) != 0) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
            
                r9.put("password", r5);
                r9.put("username", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
            
                r1 = 81 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
            
                r9.put("password", r5);
                r9.put("username", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x014d, code lost:
            
                r9.put("otptype", "Password");
                r1 = new ivas.gov.bisp.enumeration.dj.C0308t(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
            
                r4 = ivas.gov.bisp.enumeration.dj.i.a;
                r5 = (r4 & (-62)) | ((~r4) & 61);
                r4 = (r4 & 61) << 1;
                r6 = (r5 ^ r4) + ((r4 & r5) << 1);
                ivas.gov.bisp.enumeration.dj.i.b = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
            
                ivas.gov.bisp.enumeration.p024ax.ax.e(r9, r0, r7, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0170, code lost:
            
                r0 = ivas.gov.bisp.enumeration.dj.i.b + 79;
                ivas.gov.bisp.enumeration.dj.i.a = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x017a, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x017c, code lost:
            
                r0.w(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0180, code lost:
            
                r0 = r12.d;
                r0.F.setVisibility(8);
                r0 = r0.w;
                r1 = ivas.gov.bisp.enumeration.dj.i.a;
                r4 = (((r1 | 122) << 1) - (r1 ^ 122)) - 1;
                ivas.gov.bisp.enumeration.dj.i.b = r4 % 128;
                r4 = r4 % 2;
                r0.setVisibility(0);
                r0 = ivas.gov.bisp.enumeration.dj.i.b;
                r1 = (r0 & (-46)) | ((~r0) & 45);
                r0 = -(-((r0 & 45) << 1));
                r2 = (r1 & r0) + (r0 | r1);
                ivas.gov.bisp.enumeration.dj.i.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x01b2, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r0 != 1) goto L11;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r13) {
                /*
                    Method dump skipped, instruction units count: 464
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dj.i.onClick(android.view.View):void");
            }
        });
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.p
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ChangePasswordActivity d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strTrim;
                EditText editText2;
                View viewInflate;
                int i22 = 2;
                int i23 = 2 % 2;
                int i24 = a;
                int i25 = i24 ^ 63;
                int i26 = -(-((i24 & 63) << 1));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                b = i27 % 128;
                Object obj2 = null;
                if (i27 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (i5 != 0) {
                    int i28 = ((i24 & 52) + (i24 | 52)) - 1;
                    int i29 = i28 % 128;
                    b = i29;
                    int i30 = i28 % 2;
                    int i31 = i29 & 23;
                    int i32 = ((i29 ^ 23) | i31) << 1;
                    int i33 = -((i29 | 23) & (~i31));
                    int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                    a = i34 % 128;
                    if (i34 % 2 != 0) {
                        ChangePasswordActivity changePasswordActivity = this.d;
                        changePasswordActivity.s(changePasswordActivity.U);
                        throw null;
                    }
                    ChangePasswordActivity changePasswordActivity2 = this.d;
                    changePasswordActivity2.s(changePasswordActivity2.U);
                    int i35 = a;
                    int i36 = ((i35 & (-86)) | ((~i35) & 85)) + ((i35 & 85) << 1);
                    b = i36 % 128;
                    if (i36 % 2 == 0) {
                        int i37 = 81 / 0;
                        return;
                    }
                    return;
                }
                ChangePasswordActivity changePasswordActivity3 = this.d;
                Editable text = changePasswordActivity3.v.getText();
                int i38 = b;
                int i39 = (-2) - ((((i38 | 90) << 1) - (i38 ^ 90)) ^ (-1));
                a = i39 % 128;
                int i40 = i39 % 2;
                String strTrim2 = text.toString().replace("-", BuildConfig.FLAVOR).trim();
                int i41 = a + 75;
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    changePasswordActivity3.A.getText().toString();
                    throw null;
                }
                String strTrim3 = changePasswordActivity3.A.getText().toString().trim();
                Editable text2 = changePasswordActivity3.x.getText();
                int i42 = b;
                int i43 = ((i42 ^ 95) | (i42 & 95)) << 1;
                int i44 = -(((~i42) & 95) | (i42 & (-96)));
                int i45 = (i43 & i44) + (i44 | i43);
                a = i45 % 128;
                if (i45 % 2 != 0) {
                    strTrim = text2.toString().trim();
                    editText2 = changePasswordActivity3.z;
                    int i46 = 47 / 0;
                } else {
                    strTrim = text2.toString().trim();
                    editText2 = changePasswordActivity3.z;
                }
                String strTrim4 = editText2.getText().toString().trim();
                int i47 = b;
                int i48 = i47 & 95;
                int i49 = ((i47 ^ 95) | i48) << 1;
                int i50 = -((i47 | 95) & (~i48));
                int i51 = (i49 & i50) + (i50 | i49);
                a = i51 % 128;
                if (i51 % 2 != 0) {
                    strTrim2.isEmpty();
                    obj2.hashCode();
                    throw null;
                }
                if (!(!strTrim2.isEmpty())) {
                    int i52 = (-2) - ((b + 32) ^ (-1));
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    changePasswordActivity3.v.setError("CNIC is required");
                    int i54 = b;
                    int i55 = i54 & 27;
                    int i56 = ((i54 ^ 27) | i55) << 1;
                    int i57 = -((i54 | 27) & (~i55));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    return;
                }
                if (!(!strTrim.isEmpty())) {
                    int i60 = b;
                    int i61 = i60 & 85;
                    int i62 = (((i60 ^ 85) | i61) << 1) - ((i60 | 85) & (~i61));
                    a = i62 % 128;
                    if (i62 % 2 != 0) {
                        changePasswordActivity3.x.setError("Old Password is required");
                        obj2.hashCode();
                        throw null;
                    }
                    changePasswordActivity3.x.setError("Old Password is required");
                    int i63 = a + 83;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    return;
                }
                if (ChangePasswordActivity.r.matcher(strTrim3).matches()) {
                    int i65 = b;
                    int i66 = i65 & 57;
                    int i67 = ((i65 | 57) & (~i66)) + (i66 << 1);
                    a = i67 % 128;
                    int i68 = i67 % 2;
                    if (ChangePasswordActivity.s.matcher(strTrim3).matches()) {
                        int i69 = b + 5;
                        a = i69 % 128;
                        if (i69 % 2 != 0) {
                            ChangePasswordActivity.u.matcher(strTrim3).matches();
                            throw null;
                        }
                        if (!(!ChangePasswordActivity.u.matcher(strTrim3).matches())) {
                            int i70 = a;
                            int i71 = i70 & 109;
                            int i72 = ((i70 ^ 109) | i71) << 1;
                            int i73 = -((i70 | 109) & (~i71));
                            int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                            b = i74 % 128;
                            int i75 = i74 % 2;
                            if (ChangePasswordActivity.t.matcher(strTrim3).matches()) {
                                int i76 = a;
                                int i77 = ((i76 | 52) << 1) - (i76 ^ 52);
                                int i78 = (i77 ^ (-1)) + (i77 << 1);
                                b = i78 % 128;
                                if (i78 % 2 == 0) {
                                    strTrim3.equals(strTrim4);
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (!strTrim3.equals(strTrim4)) {
                                    changePasswordActivity3.z.setError("Passwords do not match");
                                    int i79 = a;
                                    int i80 = ((i79 | 123) << 1) - (((~i79) & 123) | (i79 & (-124)));
                                    b = i80 % 128;
                                    if (i80 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                changePasswordActivity3.U = strTrim2;
                                changePasswordActivity3.K = strTrim3;
                                changePasswordActivity3.W = strTrim;
                                b.aIz aiz = new b.aIz(changePasswordActivity3);
                                int i81 = b + 38;
                                int i82 = (i81 ^ (-1)) + (i81 << 1);
                                a = i82 % 128;
                                if (i82 % 2 != 0) {
                                    viewInflate = LayoutInflater.from(changePasswordActivity3).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                    int i83 = 81 / 0;
                                } else {
                                    viewInflate = LayoutInflater.from(changePasswordActivity3).inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                                }
                                int i84 = b;
                                int i85 = i84 ^ 107;
                                int i86 = -(-((i84 & 107) << 1));
                                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                                a = i87 % 128;
                                int i88 = i87 % 2;
                                AlertController.OooO0O0 oooO0O0 = aiz.a;
                                oooO0O0.f1o = viewInflate;
                                int i89 = a;
                                int i90 = (i89 & 1) + (i89 | 1);
                                b = i90 % 128;
                                int i91 = i90 % 2;
                                oooO0O0.k = false;
                                b bVarB = aiz.b();
                                if (bVarB.getWindow() != null) {
                                    int i92 = b;
                                    int i93 = i92 & 53;
                                    int i94 = ((i92 ^ 53) | i93) << 1;
                                    int i95 = -((i92 | 53) & (~i93));
                                    int i96 = (i94 & i95) + (i95 | i94);
                                    a = i96 % 128;
                                    if (i96 % 2 != 0) {
                                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                        changePasswordActivity3.getResources();
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                    DisplayMetrics displayMetrics = changePasswordActivity3.getResources().getDisplayMetrics();
                                    float f = displayMetrics.density * 600.0f;
                                    int i97 = a;
                                    int i98 = (((i97 & (-78)) | (77 & (~i97))) - (~((i97 & 77) << 1))) - 1;
                                    b = i98 % 128;
                                    int i99 = i98 % 2;
                                    int i100 = (int) (((double) displayMetrics.widthPixels) * 0.85d);
                                    int i101 = a;
                                    int i102 = ((i101 ^ 33) | (i101 & 33)) << 1;
                                    int i103 = -(((~i101) & 33) | (i101 & (-34)));
                                    int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                                    b = i104 % 128;
                                    int i105 = i104 % 2;
                                    int iMin = Math.min((int) f, i100);
                                    Window window = bVarB.getWindow();
                                    int i106 = a + 73;
                                    b = i106 % 128;
                                    if (i106 % 2 == 0) {
                                        window.setLayout(iMin, -2);
                                        throw null;
                                    }
                                    window.setLayout(iMin, -2);
                                    int i107 = b + 41;
                                    a = i107 % 128;
                                    int i108 = i107 % 2;
                                }
                                ImageView imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                                TextView textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                                int i109 = b;
                                int i110 = i109 ^ 43;
                                int i111 = (i109 & 43) << 1;
                                int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                                a = i112 % 128;
                                if (i112 % 2 != 0) {
                                    throw null;
                                }
                                TextView textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                                TextView textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                                int i113 = b + 27;
                                a = i113 % 128;
                                int i114 = i113 % 2;
                                TextView textView4 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                                View viewFindViewById3 = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                                int i115 = b;
                                int i116 = i115 & 35;
                                int i117 = i116 + ((i115 ^ 35) | i116);
                                a = i117 % 128;
                                int i118 = i117 % 2;
                                TextView textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                                int i119 = b;
                                int i120 = ((i119 ^ 16) + ((i119 & 16) << 1)) - 1;
                                a = i120 % 128;
                                int i121 = i120 % 2;
                                imageView.setImageResource(android.R.drawable.ic_lock_lock);
                                textView.setText("OTP Authentication Notice");
                                textView2.setText("تصدیقی کوڈ (OTP) کی ترسیل");
                                textView3.setText("Your 6-digit OTP will be dispatched to your registered Official Email (if Wi-Fi / VPN is authorized) or via SMS to your registered SIM.");
                                textView4.setText("آپ کا 6 ہندسوں کا او ٹی پی رجسٹرڈ سرکاری ای میل (اگر وائی فائی یا وی پی این فعال ہے) یا رجسٹرڈ سم پر بذریعہ ایس ایم ایس بھیجا جائے گا۔");
                                textView5.setOnClickListener(new ivas.gov.bisp.enumeration.p036bi.N(bVarB, i22));
                                ((AppCompatButton) viewFindViewById3).setOnClickListener(new ViewOnClickListenerC0192u(changePasswordActivity3, bVarB, i22));
                                int i122 = b;
                                int i123 = i122 ^ 81;
                                int i124 = ((i122 & 81) | i123) << 1;
                                int i125 = -i123;
                                int i126 = (i124 & i125) + (i124 | i125);
                                a = i126 % 128;
                                int i127 = i126 % 2;
                                bVarB.show();
                                int i128 = b;
                                int i129 = ((((i128 ^ 57) | (i128 & 57)) << 1) - (~(-(((~i128) & 57) | (i128 & (-58)))))) - 1;
                                a = i129 % 128;
                                if (i129 % 2 != 0) {
                                    int i130 = 93 / 0;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Toast.makeText(changePasswordActivity3, "Password does not meet all criteria (8-12 chars, 1 uppercase, 1 number, 1 special character)", 1).show();
                int i131 = b;
                int i132 = (i131 & 19) + (i131 | 19);
                a = i132 % 128;
                if (i132 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        });
        this.S.setOnClickListener(new View.OnClickListener(this) { // from class: ivas.gov.bisp.enumeration.dj.i
            private static int a = 0;
            private static int b = 1;
            public final /* synthetic */ ChangePasswordActivity d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x01cc  */
            /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            
                if (r0 != 1) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
            
                r0 = (r1 & (-96)) | ((~r1) & 95);
                r1 = -(-((r1 & 95) << 1));
                r4 = ((r0 | r1) << 1) - (r0 ^ r1);
                ivas.gov.bisp.enumeration.dj.i.a = r4 % 128;
                r4 = r4 % 2;
                r0 = r12.d;
                r1 = new java.lang.StringBuilder();
                r4 = ivas.gov.bisp.enumeration.dj.i.a;
                r5 = (r4 ^ 11) + ((r4 & 11) << 1);
                ivas.gov.bisp.enumeration.dj.i.b = r5 % 128;
                r5 = r5 % 2;
                r4 = r0.N;
                r5 = r4.length;
                r6 = ivas.gov.bisp.enumeration.dj.i.b;
                r7 = r6 ^ 61;
                r6 = ((r6 & 61) | r7) << 1;
                r7 = -r7;
                r9 = ((r6 | r7) << 1) - (r6 ^ r7);
                r6 = r9 % 128;
                ivas.gov.bisp.enumeration.dj.i.a = r6;
                r9 = r9 % 2;
                r6 = r6 + 117;
                ivas.gov.bisp.enumeration.dj.i.b = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
            
                if ((r6 % 2) != 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
            
                r6 = 3 % 3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
            
                r6 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
            
                r7 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
            
                if (r6 >= r5) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
            
                r9 = ivas.gov.bisp.enumeration.dj.i.b;
                r10 = ((r9 | 17) << 1) - (r9 ^ 17);
                ivas.gov.bisp.enumeration.dj.i.a = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
            
                if ((r10 % 2) != 0) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
            
                r1.append(r4[r6].getText().toString().trim());
                r7 = (r6 & (-119)) + (r6 | (-119));
                r6 = (r7 & 120) + (r7 | 120);
                r7 = ivas.gov.bisp.enumeration.dj.i.a + 103;
                ivas.gov.bisp.enumeration.dj.i.b = r7 % 128;
                r7 = r7 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
            
                r4[r6].getText();
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
            
                r1 = r1.toString();
                r4 = r1.length();
                r5 = ivas.gov.bisp.enumeration.dj.i.b;
                r6 = r5 ^ 23;
                r5 = ((r5 & 23) | r6) << 1;
                r6 = -r6;
                r9 = (r5 & r6) + (r5 | r6);
                ivas.gov.bisp.enumeration.dj.i.a = r9 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
            
                if ((r9 % 2) == 0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
            
                if (r4 >= 32) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
            
                if (r4 >= 6) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
            
                r0.v();
                android.widget.Toast.makeText(r0, "Please enter complete 6-digit OTP", 0).show();
                r0 = ivas.gov.bisp.enumeration.dj.i.a;
                r1 = (r0 & 119) + (r0 | 119);
                ivas.gov.bisp.enumeration.dj.i.b = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
            
                if ((r1 % 2) == 0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
            
                r7.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
            
                r4 = r0.W;
                r5 = r0.K;
                r6 = r0.U;
                r0.w(true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
            
                r7 = new java.lang.StringBuilder();
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
            
                r7.append(r0.T);
                r7.append("/api/Users/PasswordReset");
                r7 = r7.toString();
                r9 = new org.json.JSONObject();
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
            
                r10 = ivas.gov.bisp.enumeration.dj.i.b;
                r11 = r10 & 79;
                r11 = (r11 - (~(-(-((r10 ^ 79) | r11))))) - 1;
                ivas.gov.bisp.enumeration.dj.i.a = r11 % 128;
                r11 = r11 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
            
                r9.put("otp_code", r1);
                r9.put("oldpassword", r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
            
                r1 = ivas.gov.bisp.enumeration.dj.i.a;
                r4 = r1 & 41;
                r4 = r4 + ((r1 ^ 41) | r4);
                ivas.gov.bisp.enumeration.dj.i.b = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
            
                if ((r4 % 2) != 0) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
            
                r9.put("password", r5);
                r9.put("username", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
            
                r1 = 81 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
            
                r9.put("password", r5);
                r9.put("username", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x014d, code lost:
            
                r9.put("otptype", "Password");
                r1 = new ivas.gov.bisp.enumeration.dj.C0308t(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
            
                r4 = ivas.gov.bisp.enumeration.dj.i.a;
                r5 = (r4 & (-62)) | ((~r4) & 61);
                r4 = (r4 & 61) << 1;
                r6 = (r5 ^ r4) + ((r4 & r5) << 1);
                ivas.gov.bisp.enumeration.dj.i.b = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
            
                ivas.gov.bisp.enumeration.p024ax.ax.e(r9, r0, r7, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0170, code lost:
            
                r0 = ivas.gov.bisp.enumeration.dj.i.b + 79;
                ivas.gov.bisp.enumeration.dj.i.a = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x017a, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x017c, code lost:
            
                r0.w(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0180, code lost:
            
                r0 = r12.d;
                r0.F.setVisibility(8);
                r0 = r0.w;
                r1 = ivas.gov.bisp.enumeration.dj.i.a;
                r4 = (((r1 | 122) << 1) - (r1 ^ 122)) - 1;
                ivas.gov.bisp.enumeration.dj.i.b = r4 % 128;
                r4 = r4 % 2;
                r0.setVisibility(0);
                r0 = ivas.gov.bisp.enumeration.dj.i.b;
                r1 = (r0 & (-46)) | ((~r0) & 45);
                r0 = -(-((r0 & 45) << 1));
                r2 = (r1 & r0) + (r0 | r1);
                ivas.gov.bisp.enumeration.dj.i.a = r2 % 128;
                r2 = r2 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x01b2, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r0 != 1) goto L11;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r13) {
                /*
                    Method dump skipped, instruction units count: 464
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.dj.i.onClick(android.view.View):void");
            }
        });
        ImageView imageView = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivToggleNewPassword);
        ImageView imageView2 = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivToggleOldPassword);
        ImageView imageView3 = (ImageView) findViewById(ivas.gov.bisp.enumeration.R.id.ivToggleConfirmPassword);
        t(this.A, imageView);
        t(this.x, imageView2);
        t(this.z, imageView3);
        this.A.addTextChangedListener(new P(this));
        int i22 = p;
        int i23 = ((i22 ^ 43) | (i22 & 43)) << 1;
        int i24 = -(((~i22) & 43) | (i22 & (-44)));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        q = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 4 % 2;
        }
        int i27 = 0;
        while (true) {
            EditText[] editTextArr = this.N;
            if (i27 >= editTextArr.length) {
                break;
            }
            editTextArr[i27].addTextChangedListener(new u(this, i27));
            EditText editText2 = this.N[i27];
            z zVar = new z(this, i27, 0);
            int i28 = p;
            int i29 = i28 & 113;
            int i30 = (i28 ^ 113) | i29;
            int i31 = (i29 & i30) + (i30 | i29);
            q = i31 % 128;
            int i32 = i31 % 2;
            editText2.setOnKeyListener(zVar);
            int i33 = i27 & 38;
            int i34 = (i27 | 38) & (~i33);
            int i35 = -(-(i33 << 1));
            int i36 = (i34 & i35) + (i34 | i35);
            int i37 = (i36 & 36) | ((~i36) & (-37));
            int i38 = (i36 & (-37)) << 1;
            i27 = ((i37 & i38) << 1) + (i37 ^ i38);
            int i39 = p;
            int i40 = i39 & 3;
            int i41 = -(-(i39 | 3));
            int i42 = (i40 & i41) + (i41 | i40);
            q = i42 % 128;
            int i43 = i42 % 2;
        }
        int i44 = p;
        int i45 = (i44 | 105) << 1;
        int i46 = -(i44 ^ 105);
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        q = i47 % 128;
        if (i47 % 2 == 0) {
            throw null;
        }
    }
}
