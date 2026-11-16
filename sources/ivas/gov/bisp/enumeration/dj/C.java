package ivas.gov.bisp.enumeration.dj;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.bK.ah;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p024ax.ax;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.utils.SessionManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class C {
    private static int a = 1;
    private static int b;

    public static void c(EditText[] editTextArr) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 77;
        int i4 = i3 % 128;
        a = i4;
        if (i3 % 2 == 0) {
            length = editTextArr.length;
            i = 1;
        } else {
            length = editTextArr.length;
            i = 0;
        }
        int i5 = i4 & 69;
        int i6 = ((i4 | 69) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        while (i < length) {
            int i8 = a;
            int i9 = i8 ^ 25;
            int i10 = ((i8 & 25) | i9) << 1;
            int i11 = -i9;
            int i12 = (i10 & i11) + (i10 | i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            editTextArr[i].setText(BuildConfig.FLAVOR);
            int i14 = i ^ 1;
            int i15 = ((i & 1) | i14) << 1;
            int i16 = -i14;
            i = (i15 ^ i16) + ((i16 & i15) << 1);
            int i17 = b;
            int i18 = (i17 & (-34)) | ((~i17) & 33);
            int i19 = -(-((i17 & 33) << 1));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
        }
        if (editTextArr.length > 0) {
            int i22 = b;
            int i23 = (i22 ^ 85) + ((i22 & 85) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            editTextArr[0].requestFocus();
            int i25 = a + 33;
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = a;
        int i28 = i27 ^ 125;
        int i29 = -(-((i27 & 125) << 1));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        b = i30 % 128;
        if (i30 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void d(AppCompatActivity appCompatActivity, SessionManager sessionManager, ProgressDialog progressDialog, CountDownLatch countDownLatch, AtomicReference<String> atomicReference) {
        String string;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(e());
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = (((i2 | 123) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            sb.append("/api/Users/SendOTP");
            string = sb.toString();
            int i5 = 84 / 0;
        } else {
            sb.append("/api/Users/SendOTP");
            string = sb.toString();
        }
        String str = string;
        String strZ = sessionManager.z();
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                int i6 = a;
                int i7 = (((i6 & (-44)) | ((~i6) & 43)) - (~(-(-((i6 & 43) << 1))))) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    jSONObject.put("username", strZ);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jSONObject.put("username", strZ);
                jSONObject.put("otptype", "Submission");
                bLq blq = new bLq(appCompatActivity, sessionManager, progressDialog, countDownLatch, atomicReference);
                int i8 = a;
                int i9 = i8 & 5;
                int i10 = i9 + ((i8 ^ 5) | i9);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    ax.e(jSONObject, appCompatActivity, str, blq);
                } else {
                    ax.e(jSONObject, appCompatActivity, str, blq);
                    int i11 = 15 / 0;
                }
            } catch (ClassCastException e) {
                throw e;
            }
        } catch (Exception unused) {
            atomicReference.set(null);
            countDownLatch.countDown();
        }
    }

    public static void f(EditText[] editTextArr) {
        int length;
        int i;
        int i2 = 2 % 2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(400L);
        CycleInterpolator cycleInterpolator = new CycleInterpolator(4.0f);
        int i3 = a;
        int i4 = i3 & 85;
        int i5 = i4 + ((i3 ^ 85) | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            translateAnimation.setInterpolator(cycleInterpolator);
            length = editTextArr.length;
            i = 1;
        } else {
            translateAnimation.setInterpolator(cycleInterpolator);
            length = editTextArr.length;
            i = 0;
        }
        int i6 = a;
        int i7 = (i6 ^ 43) + ((i6 & 43) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        while (i < length) {
            int i9 = b + 49;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                editTextArr[i].startAnimation(translateAnimation);
                int i10 = (i & 32) + (i | 32);
                int i11 = i10 & 88;
                i = ((((i10 ^ 88) | i11) << 1) - (~(-((i10 | 88) & (~i11))))) - 1;
            } else {
                editTextArr[i].startAnimation(translateAnimation);
                int i12 = (i & (-2)) | ((~i) & 1);
                int i13 = (i & 1) << 1;
                i = ((i12 | i13) << 1) - (i13 ^ i12);
            }
            int i14 = b;
            int i15 = i14 ^ 67;
            int i16 = ((i14 & 67) | i15) << 1;
            int i17 = -i15;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = i20 & 47;
        int i22 = ((i20 ^ 47) | i21) << 1;
        int i23 = -((i20 | 47) & (~i21));
        int i24 = (i22 & i23) + (i23 | i22);
        a = i24 % 128;
        int i25 = i24 % 2;
    }

    public static String e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 123;
        int i4 = ((i2 & 123) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = ((i7 ^ 1) - (~(-(-((i7 & 1) << 1))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return "https://meladeskapp.bisp.gov.pk";
    }

    public class bLq implements I {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ AppCompatActivity c;
        public final /* synthetic */ SessionManager d;
        public final /* synthetic */ ProgressDialog e;
        public final /* synthetic */ CountDownLatch f;
        public final /* synthetic */ AtomicReference g;

        public bLq(AppCompatActivity appCompatActivity, SessionManager sessionManager, ProgressDialog progressDialog, CountDownLatch countDownLatch, AtomicReference atomicReference) {
            this.c = appCompatActivity;
            this.d = sessionManager;
            this.e = progressDialog;
            int i = b;
            int i2 = (((i | 6) << 1) - (i ^ 6)) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            this.f = countDownLatch;
            this.g = atomicReference;
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onError(ResponseMessage responseMessage) {
            String string;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 73;
            int i5 = -(-(i3 | 73));
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                j.w("Send OTP Failed: ");
                throw null;
            }
            AppCompatActivity appCompatActivity = this.c;
            StringBuilder sbW = j.w("Send OTP Failed: ");
            int i7 = b;
            int i8 = i7 & 1;
            int i9 = -(-((i7 ^ 1) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                sbW.append(responseMessage.getErrorMessage());
                string = sbW.toString();
                i = 0;
            } else {
                sbW.append(responseMessage.getErrorMessage());
                string = sbW.toString();
                i = 1;
            }
            int i11 = a;
            int i12 = (i11 ^ 51) + ((i11 & 51) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            Toast.makeText(appCompatActivity, string, i).show();
            this.g.set(null);
            int i14 = b;
            int i15 = i14 & 29;
            int i16 = (i14 | 29) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                this.f.countDown();
            } else {
                this.f.countDown();
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.p024ax.I
        public void onSuccess(JSONObject jSONObject) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-76)) | ((~i2) & 75);
            int i4 = (i2 & 75) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj = null;
            try {
                boolean zOptBoolean = i5 % 2 != 0 ? jSONObject.optBoolean("status", true) : jSONObject.optBoolean("status", false);
                String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
                if (!zOptBoolean) {
                    AppCompatActivity appCompatActivity = this.c;
                    if (strOptString.isEmpty()) {
                        int i6 = b;
                        int i7 = i6 & 47;
                        int i8 = (~i7) & (i6 | 47);
                        int i9 = i7 << 1;
                        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                        a = i10 % 128;
                        int i11 = i10 % 2;
                        strOptString = "Failed to send OTP";
                        int i12 = (i6 ^ 107) + ((i6 & 107) << 1);
                        a = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    Toast.makeText(appCompatActivity, strOptString, 1).show();
                    this.g.set(null);
                    int i14 = a + 13;
                    b = i14 % 128;
                    if (i14 % 2 != 0) {
                        this.f.countDown();
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.f.countDown();
                    int i15 = a;
                    int i16 = i15 & 105;
                    int i17 = (i15 ^ 105) | i16;
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = 99 / 0;
                        return;
                    }
                    return;
                }
                int i20 = a;
                int i21 = i20 & 9;
                int i22 = -(-(i20 | 9));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                int i24 = i23 % 2;
                String strOptString2 = jSONObject.optString("transaction_id", BuildConfig.FLAVOR);
                boolean zOptBoolean2 = jSONObject.optBoolean("isVpnEnabled", false);
                int i25 = a + 11;
                b = i25 % 128;
                int i26 = i25 % 2;
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
                int i27 = b;
                int i28 = (i27 & (-36)) | ((~i27) & 35);
                int i29 = -(-((i27 & 35) << 1));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                a = i30 % 128;
                int i31 = i30 % 2;
                editorEdit.putBoolean("isVpnEnabled", zOptBoolean2).apply();
                int i32 = b;
                int i33 = ((i32 ^ 113) - (~((i32 & 113) << 1))) - 1;
                a = i33 % 128;
                if (i33 % 2 == 0) {
                    strOptString.isEmpty();
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AppCompatActivity appCompatActivity2 = this.c;
                if (strOptString.isEmpty()) {
                    strOptString = "OTP Dispatched";
                    int i34 = b;
                    int i35 = i34 & 47;
                    int i36 = (i34 ^ 47) | i35;
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                }
                Toast.makeText(appCompatActivity2, strOptString, 0).show();
                AppCompatActivity appCompatActivity3 = this.c;
                int i39 = a;
                int i40 = ((i39 | 121) << 1) - (i39 ^ 121);
                b = i40 % 128;
                if (i40 % 2 != 0) {
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } else {
                    C.b(appCompatActivity3, this.d, this.e, this.f, this.g, strOptString2, zOptBoolean2);
                    int i41 = a;
                    int i42 = ((i41 | 81) << 1) - (i41 ^ 81);
                    b = i42 % 128;
                    int i43 = i42 % 2;
                }
            } catch (Exception unused) {
                this.g.set(null);
                this.f.countDown();
            }
        }
    }

    public static String g(final AppCompatActivity appCompatActivity, final SessionManager sessionManager, final ProgressDialog progressDialog) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 38) + ((i2 & 38) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appCompatActivity);
        int i5 = a;
        int i6 = (i5 & 85) + (i5 | 85);
        b = i6 % 128;
        int i7 = i6 % 2;
        String string = defaultSharedPreferences.getString("pref_submission_otp", BuildConfig.FLAVOR);
        int i8 = a + 109;
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = defaultSharedPreferences.getInt("pref_submission_otp_usage_count", 0);
        if (!string.isEmpty()) {
            int i11 = b;
            int i12 = ((i11 | 47) << 1) - (((~i11) & 47) | (i11 & (-48)));
            a = i12 % 128;
            if (i12 % 2 != 0 ? i10 < 5 : i10 < 3) {
                SharedPreferences.Editor editorPutInt = defaultSharedPreferences.edit().putInt("pref_submission_otp_usage_count", ((i10 ^ 2) + ((i10 & 2) << 1)) - 1);
                int i13 = b;
                int i14 = (((i13 | 14) << 1) - (i13 ^ 14)) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                editorPutInt.apply();
                int i16 = a + 85;
                b = i16 % 128;
                int i17 = i16 % 2;
                return string;
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Object obj = null;
        final AtomicReference atomicReference = new AtomicReference(null);
        Runnable runnable = new Runnable() { // from class: ivas.gov.bisp.enumeration.dj.V
            private static int a = 0;
            private static int b = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i18 = 2 % 2;
                int i19 = a;
                int i20 = (i19 & 103) + (i19 | 103);
                b = i20 % 128;
                Object obj2 = null;
                if (i20 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                final ProgressDialog progressDialog2 = progressDialog;
                final AppCompatActivity appCompatActivity2 = appCompatActivity;
                final SessionManager sessionManager2 = sessionManager;
                int i21 = i19 & 111;
                int i22 = -(-((i19 ^ 111) | i21));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = i23 % 128;
                b = i24;
                if (i23 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                final CountDownLatch countDownLatch2 = countDownLatch;
                final AtomicReference atomicReference2 = atomicReference;
                int i25 = (-2) - ((i24 + 100) ^ (-1));
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    throw null;
                }
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    int i26 = b + 59;
                    a = i26 % 128;
                    if (i26 % 2 != 0) {
                        progressDialog2.hide();
                        int i27 = 90 / 0;
                    } else {
                        progressDialog2.hide();
                    }
                }
                b.aIz aiz = new b.aIz(appCompatActivity2);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(appCompatActivity2);
                int i28 = b;
                int i29 = i28 | 49;
                int i30 = ((i29 << 1) - (~(-((~(i28 & 49)) & i29)))) - 1;
                a = i30 % 128;
                int i31 = i30 % 2;
                View viewInflate = layoutInflaterFrom.inflate(ivas.gov.bisp.enumeration.R.layout.dialog_channel_readiness, (ViewGroup) null);
                aiz.c(viewInflate);
                int i32 = b;
                int i33 = ((i32 | 65) << 1) - (i32 ^ 65);
                a = i33 % 128;
                int i34 = i33 % 2;
                aiz.a.k = false;
                final b bVarB = aiz.b();
                int i35 = a;
                int i36 = i35 & 111;
                int i37 = (i35 ^ 111) | i36;
                int i38 = (i36 & i37) + (i37 | i36);
                b = i38 % 128;
                int i39 = i38 % 2;
                if (bVarB.getWindow() != null) {
                    int i40 = a;
                    int i41 = i40 & 103;
                    int i42 = ((i40 | 103) & (~i41)) + (i41 << 1);
                    b = i42 % 128;
                    if (i42 % 2 == 0) {
                        bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                        obj2.hashCode();
                        throw null;
                    }
                    bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    DisplayMetrics displayMetrics = appCompatActivity2.getResources().getDisplayMetrics();
                    float f = displayMetrics.density;
                    int i43 = a;
                    int i44 = i43 | 59;
                    int i45 = i44 << 1;
                    int i46 = -((~(i43 & 59)) & i44);
                    int i47 = (i45 & i46) + (i45 | i46);
                    b = i47 % 128;
                    int iMin = Math.min((int) (i47 % 2 == 0 ? f % 600.0f : f * 600.0f), (int) (((double) displayMetrics.widthPixels) * 0.85d));
                    Window window = bVarB.getWindow();
                    int i48 = b + 87;
                    a = i48 % 128;
                    if (i48 % 2 != 0) {
                        window.setLayout(iMin, 34);
                    } else {
                        window.setLayout(iMin, -2);
                    }
                    int i49 = b;
                    int i50 = i49 & 5;
                    int i51 = ((((i49 ^ 5) | i50) << 1) - (~(-((i49 | 5) & (~i50))))) - 1;
                    a = i51 % 128;
                    if (i51 % 2 != 0) {
                        int i52 = 4 / 3;
                    }
                }
                ImageView imageView = (ImageView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.ivDialogTopIcon);
                TextView textView = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleEn);
                int i53 = a;
                int i54 = (i53 & 29) + (i53 | 29);
                b = i54 % 128;
                if (i54 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                TextView textView2 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogTitleUr);
                TextView textView3 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageEn);
                TextView textView4 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.tvDialogMessageUr);
                View viewFindViewById = viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogSendOtp);
                int i55 = b;
                int i56 = ((i55 & 86) + (i55 | 86)) - 1;
                a = i56 % 128;
                int i57 = i56 % 2;
                AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById;
                TextView textView5 = (TextView) viewInflate.findViewById(ivas.gov.bisp.enumeration.R.id.btnDialogCancel);
                int i58 = a;
                int i59 = i58 & 27;
                int i60 = (~i59) & (i58 | 27);
                int i61 = -(-(i59 << 1));
                int i62 = (i60 & i61) + (i60 | i61);
                b = i62 % 128;
                if (i62 % 2 == 0) {
                    imageView.setImageResource(android.R.drawable.ic_lock_lock);
                    textView.setText("Survey Submission Authorization");
                    textView2.setText("سروے جمع کروانے کے لیے تصدیقی کوڈ (OTP)");
                    textView3.setText("A 6-digit OTP will be dispatched to your registered Official Email (if Wi-Fi / VPN is authorized) or via SMS to your registered SIM. This OTP will authorize your next 5 survey submissions.");
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                imageView.setImageResource(android.R.drawable.ic_lock_lock);
                textView.setText("Survey Submission Authorization");
                textView2.setText("سروے جمع کروانے کے لیے تصدیقی کوڈ (OTP)");
                textView3.setText("A 6-digit OTP will be dispatched to your registered Official Email (if Wi-Fi / VPN is authorized) or via SMS to your registered SIM. This OTP will authorize your next 5 survey submissions.");
                textView4.setText("آپ کا 6 ہندسوں کا تصدیقی کوڈ سرکاری ای میل یا رجسٹرڈ سم پر بھیجا جائے گا۔ یہ کوڈ آپ کے اگلے 5 سروے جمع کروانے کے لیے کارآمد ہوگا۔");
                textView5.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.dj.A
                    private static int a = 1;
                    private static int b;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i63 = 2 % 2;
                        int i64 = b + 115;
                        a = i64 % 128;
                        Object obj4 = null;
                        if (i64 % 2 == 0) {
                            obj4.hashCode();
                            throw null;
                        }
                        b bVar = bVarB;
                        AtomicReference atomicReference3 = atomicReference2;
                        CountDownLatch countDownLatch3 = countDownLatch2;
                        bVar.dismiss();
                        atomicReference3.set(null);
                        countDownLatch3.countDown();
                        int i65 = a;
                        int i66 = i65 & 99;
                        int i67 = -(-((i65 ^ 99) | i66));
                        int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                        b = i68 % 128;
                        if (i68 % 2 != 0) {
                            int i69 = 86 / 0;
                        }
                    }
                });
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.dj.v
                    private static int a = 0;
                    private static int b = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i63 = 2 % 2;
                        int i64 = a + 105;
                        int i65 = i64 % 128;
                        b = i65;
                        int i66 = i64 % 2;
                        b bVar = bVarB;
                        AppCompatActivity appCompatActivity3 = appCompatActivity2;
                        SessionManager sessionManager3 = sessionManager2;
                        int i67 = ((i65 ^ 99) | (i65 & 99)) << 1;
                        int i68 = -(((~i65) & 99) | (i65 & (-100)));
                        int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                        a = i69 % 128;
                        Object obj4 = null;
                        if (i69 % 2 != 0) {
                            obj4.hashCode();
                            throw null;
                        }
                        ProgressDialog progressDialog3 = progressDialog2;
                        CountDownLatch countDownLatch3 = countDownLatch2;
                        AtomicReference atomicReference3 = atomicReference2;
                        bVar.dismiss();
                        int i70 = a;
                        int i71 = (i70 & (-6)) | ((~i70) & 5);
                        int i72 = -(-((i70 & 5) << 1));
                        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                        b = i73 % 128;
                        if (i73 % 2 == 0) {
                            C.d(appCompatActivity3, sessionManager3, progressDialog3, countDownLatch3, atomicReference3);
                            obj4.hashCode();
                            throw null;
                        }
                        C.d(appCompatActivity3, sessionManager3, progressDialog3, countDownLatch3, atomicReference3);
                        int i74 = a;
                        int i75 = (i74 & (-90)) | ((~i74) & 89);
                        int i76 = (i74 & 89) << 1;
                        int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                        b = i77 % 128;
                        if (i77 % 2 == 0) {
                            throw null;
                        }
                    }
                };
                int i63 = b;
                int i64 = ((i63 | 29) << 1) - (i63 ^ 29);
                a = i64 % 128;
                if (i64 % 2 == 0) {
                    appCompatButton.setOnClickListener(onClickListener);
                    bVarB.show();
                } else {
                    appCompatButton.setOnClickListener(onClickListener);
                    bVarB.show();
                    int i65 = 66 / 0;
                }
            }
        };
        int i18 = a;
        int i19 = ((i18 ^ 102) + ((i18 & 102) << 1)) - 1;
        b = i19 % 128;
        try {
            if (i19 % 2 != 0) {
                appCompatActivity.runOnUiThread(runnable);
                countDownLatch.await();
                obj.hashCode();
                throw null;
            }
            appCompatActivity.runOnUiThread(runnable);
            countDownLatch.await();
            String str = (String) atomicReference.get();
            int i20 = a;
            int i21 = i20 & 75;
            int i22 = (i20 ^ 75) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            return str;
        } catch (InterruptedException unused) {
        }
    }

    public static void b(final AppCompatActivity appCompatActivity, final SessionManager sessionManager, final ProgressDialog progressDialog, final CountDownLatch countDownLatch, final AtomicReference atomicReference, final String str, boolean z) {
        int i;
        String str2;
        int i2 = 2 % 2;
        b.aIz aiz = new b.aIz(appCompatActivity);
        aiz.a.k = false;
        LinearLayout linearLayout = new LinearLayout(appCompatActivity);
        int i3 = a;
        int i4 = (i3 & 43) + (i3 | 43);
        b = i4 % 128;
        int i5 = i4 % 2;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(40, 36, 40, 36);
        linearLayout.setBackgroundColor(-1);
        ImageView imageView = new ImageView(appCompatActivity);
        int i6 = a;
        int i7 = i6 & 123;
        int i8 = i7 + ((i6 ^ 123) | i7);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (z) {
            int i11 = i9 ^ 3;
            int i12 = (i9 & 3) << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = (-2) - (((i14 & 24) + (i14 | 24)) ^ (-1));
            b = i16 % 128;
            int i17 = i16 % 2;
            i = android.R.drawable.ic_dialog_email;
        } else {
            int i18 = i6 & 89;
            int i19 = (i6 ^ 89) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            i = android.R.drawable.stat_sys_phone_call;
        }
        imageView.setImageResource(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(120, 120);
        int i22 = 17;
        int i23 = b + 17;
        a = i23 % 128;
        int i24 = i23 % 2;
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(appCompatActivity);
        Object obj = null;
        if (!z) {
            int i25 = a + 107;
            b = i25 % 128;
            int i26 = i25 % 2;
            str2 = "SIM SMS OTP Verification\nرجسٹرڈ سم پر موصول شدہ کوڈ";
        } else {
            int i27 = b;
            int i28 = (i27 ^ 3) + ((i27 & 3) << 1);
            int i29 = i28 % 128;
            a = i29;
            if (i28 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i30 = (i29 ^ 83) + ((i29 & 83) << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
            str2 = "Official Email OTP Verification\nسرکاری ای میل پر موصول شدہ کوڈ";
        }
        textView.setText(str2);
        textView.setTextSize(17.0f);
        textView.setTextColor(-14800581);
        int i32 = b + 106;
        int i33 = (i32 ^ (-1)) + (i32 << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
        textView.setGravity(17);
        textView.setTypeface(null, 1);
        textView.setPadding(0, 16, 0, 8);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(appCompatActivity);
        textView2.setText("Enter the 6-digit code to authorize the next 5 survey submissions\nبراہ کرم اگلے 5 سروے جمع کروانے کے لیے 6 ہندسوں کا کوڈ درج کریں");
        int i35 = b + 95;
        a = i35 % 128;
        int i36 = i35 % 2;
        textView2.setTextSize(13.0f);
        textView2.setTextColor(-10193781);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(appCompatActivity);
        linearLayout2.setOrientation(0);
        int i37 = a;
        int i38 = ((i37 & 12) + (i37 | 12)) - 1;
        b = i38 % 128;
        int i39 = i38 % 2;
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, 24, 0, 16);
        int i40 = 6;
        final EditText[] editTextArr = new EditText[6];
        int i41 = b;
        int i42 = i41 & 71;
        int i43 = ((i41 ^ 71) | i42) << 1;
        int i44 = -((~i42) & (i41 | 71));
        int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
        a = i45 % 128;
        int i46 = i45 % 2;
        int i47 = (int) (appCompatActivity.getResources().getDisplayMetrics().density * 48.0f);
        DisplayMetrics displayMetrics = appCompatActivity.getResources().getDisplayMetrics();
        int i48 = a;
        int i49 = ((i48 & 76) + (i48 | 76)) - 1;
        b = i49 % 128;
        int i50 = i49 % 2;
        int i51 = (int) (displayMetrics.density * 6.0f);
        int i52 = a;
        int i53 = i52 & 85;
        int i54 = i53 + ((i52 ^ 85) | i53);
        b = i54 % 128;
        int i55 = i54 % 2;
        int i56 = 0;
        while (i56 < i40) {
            EditText editText = new EditText(appCompatActivity);
            int i57 = b + 53;
            a = i57 % 128;
            int i58 = i57 % 2;
            editText.setInputType(2);
            editText.setGravity(i22);
            int i59 = b;
            int i60 = i59 & 77;
            int i61 = (((i59 ^ 77) | i60) << 1) - ((i59 | 77) & (~i60));
            a = i61 % 128;
            int i62 = i61 % 2;
            editText.setTextSize(18.0f);
            editText.setTextColor(-15788246);
            editText.setBackgroundResource(ivas.gov.bisp.enumeration.R.drawable.bg_otp_box);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i47, i47);
            int i63 = a;
            int i64 = i63 ^ 53;
            int i65 = (i63 & 53) << 1;
            int i66 = (i64 & i65) + (i65 | i64);
            b = i66 % 128;
            int i67 = i66 % 2;
            layoutParams2.setMargins(i51, 0, i51, 0);
            int i68 = a;
            int i69 = (i68 ^ 113) + ((i68 & 113) << 1);
            b = i69 % 128;
            if (i69 % 2 != 0) {
                editText.setLayoutParams(layoutParams2);
                linearLayout2.addView(editText);
                throw null;
            }
            editText.setLayoutParams(layoutParams2);
            linearLayout2.addView(editText);
            editTextArr[i56] = editText;
            int i70 = ((i56 ^ (-107)) | (i56 & (-107))) << 1;
            int i71 = -((i56 & 106) | ((~i56) & (-107)));
            int i72 = (((i70 | i71) << 1) - (i70 ^ i71)) + 109;
            i56 = (i72 ^ (-1)) + (i72 << 1);
            int i73 = b;
            int i74 = i73 & 115;
            int i75 = ((i73 ^ 115) | i74) << 1;
            int i76 = -((i73 | 115) & (~i74));
            int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
            a = i77 % 128;
            int i78 = i77 % 2;
            i40 = 6;
            i22 = 17;
        }
        linearLayout.addView(linearLayout2);
        int i79 = b;
        int i80 = (i79 & 47) + (i79 | 47);
        a = i80 % 128;
        int i81 = i80 % 2;
        int i82 = 0;
        while (i82 < 6) {
            editTextArr[i82].addTextChangedListener(new W(i82, editTextArr));
            EditText editText2 = editTextArr[i82];
            J j = new J(editTextArr, i82, 1);
            int i83 = a;
            int i84 = i83 & 17;
            int i85 = i83 | 17;
            int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
            b = i86 % 128;
            if (i86 % 2 != 0) {
                editText2.setOnKeyListener(j);
                i82 = (-2) - ((i82 + 114) ^ (-1));
            } else {
                editText2.setOnKeyListener(j);
                int i87 = i82 - 34;
                i82 = (i87 & 35) + (i87 | 35);
            }
        }
        TextView textView3 = new TextView(appCompatActivity);
        textView3.setText("Resend code in: 01:00");
        textView3.setGravity(17);
        textView3.setTextSize(13.0f);
        textView3.setTextColor(-10193781);
        linearLayout.addView(textView3);
        TextView textView4 = new TextView(appCompatActivity);
        textView4.setText("Resend OTP / دوبارہ کوڈ بھیجیں");
        textView4.setGravity(17);
        textView4.setTextSize(14.0f);
        textView4.setTextColor(-14326805);
        textView4.setVisibility(8);
        textView4.setPadding(0, 8, 0, 8);
        linearLayout.addView(textView4);
        final ProgressBar progressBar = new ProgressBar(appCompatActivity);
        progressBar.setVisibility(8);
        linearLayout.addView(progressBar);
        LinearLayout linearLayout3 = new LinearLayout(appCompatActivity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout3.setPadding(0, 24, 0, 0);
        TextView textView5 = new TextView(appCompatActivity);
        textView5.setText("Cancel / منسوخ");
        textView5.setTextColor(-10193781);
        textView5.setTextSize(15.0f);
        textView5.setPadding(30, 20, 30, 20);
        linearLayout3.addView(textView5);
        final AppCompatButton appCompatButton = new AppCompatButton(appCompatActivity, null);
        int i88 = a + 6;
        int i89 = (i88 ^ (-1)) + (i88 << 1);
        b = i89 % 128;
        int i90 = i89 % 2;
        appCompatButton.setText("Verify & Submit / تصدیق کر کے جمع کریں");
        appCompatButton.setBackgroundColor(-16411031);
        appCompatButton.setTextColor(-1);
        appCompatButton.setPadding(36, 18, 36, 18);
        linearLayout3.addView(appCompatButton);
        int i91 = b;
        int i92 = (((i91 ^ 113) | (i91 & 113)) << 1) - (((~i91) & 113) | (i91 & (-114)));
        a = i92 % 128;
        int i93 = i92 % 2;
        linearLayout.addView(linearLayout3);
        aiz.a.f1o = linearLayout;
        final b bVarB = aiz.b();
        if (bVarB.getWindow() != null) {
            int i94 = a;
            int i95 = (i94 ^ 115) + ((i94 & 115) << 1);
            b = i95 % 128;
            int i96 = i95 % 2;
            bVarB.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            DisplayMetrics displayMetrics2 = appCompatActivity.getResources().getDisplayMetrics();
            int i97 = b;
            int i98 = (i97 & 101) + (i97 | 101);
            a = i98 % 128;
            int i99 = i98 % 2;
            int i100 = (int) (displayMetrics2.density * 600.0f);
            Window window = bVarB.getWindow();
            int iMin = Math.min(i100, (int) (((double) displayMetrics2.widthPixels) * 0.85d));
            int i101 = a;
            int i102 = (i101 ^ 69) + ((i101 & 69) << 1);
            b = i102 % 128;
            int i103 = i102 % 2;
            window.setLayout(iMin, -2);
            int i104 = b + 81;
            a = i104 % 128;
            int i105 = i104 % 2;
        }
        final CountDownTimer countDownTimerStart = new CountDownTimerC0307s(60000L, 1000L, textView3, textView4).start();
        textView4.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.dj.L
            private static int a = 1;
            private static int b;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i106 = 2 % 2;
                int i107 = b;
                int i108 = i107 & 91;
                int i109 = i108 + ((i107 ^ 91) | i108);
                a = i109 % 128;
                Object obj2 = null;
                if (i109 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                CountDownTimer countDownTimer = countDownTimerStart;
                b bVar = bVarB;
                AppCompatActivity appCompatActivity2 = appCompatActivity;
                SessionManager sessionManager2 = sessionManager;
                ProgressDialog progressDialog2 = progressDialog;
                int i110 = ((i107 ^ 119) - (~(-(-((i107 & 119) << 1))))) - 1;
                a = i110 % 128;
                if (i110 % 2 == 0) {
                    throw null;
                }
                CountDownLatch countDownLatch2 = countDownLatch;
                AtomicReference atomicReference2 = atomicReference;
                countDownTimer.cancel();
                bVar.dismiss();
                int i111 = a;
                int i112 = i111 & 111;
                int i113 = -(-((i111 ^ 111) | i112));
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                b = i114 % 128;
                int i115 = i114 % 2;
                C.d(appCompatActivity2, sessionManager2, progressDialog2, countDownLatch2, atomicReference2);
                int i116 = b;
                int i117 = i116 & 103;
                int i118 = (((i116 | 103) & (~i117)) - (~(i117 << 1))) - 1;
                a = i118 % 128;
                int i119 = i118 % 2;
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.dj.R
            private static int a = 0x00000001;
            private static int b;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i106 = 2 % 2;
                int i107 = a;
                int i108 = i107 ^ 41;
                int i109 = ((i107 & 41) | i108) << 1;
                int i110 = -i108;
                int i111 = ((i109 | i110) << 1) - (i109 ^ i110);
                int i112 = i111 % 128;
                b = i112;
                int i113 = i111 % 2;
                CountDownTimer countDownTimer = countDownTimerStart;
                b bVar = bVarB;
                int i114 = i112 + 65;
                int i115 = i114 % 128;
                a = i115;
                int i116 = i114 % 2;
                AtomicReference atomicReference2 = atomicReference;
                CountDownLatch countDownLatch2 = countDownLatch;
                int i117 = (((i115 | 126) << 1) - (i115 ^ 126)) - 1;
                b = i117 % 128;
                int i118 = i117 % 2;
                countDownTimer.cancel();
                bVar.dismiss();
                atomicReference2.set(null);
                int i119 = a;
                int i120 = (((i119 ^ 33) | (i119 & 33)) << 1) - (((~i119) & 33) | (i119 & (-34)));
                b = i120 % 128;
                int i121 = i120 % 2;
                countDownLatch2.countDown();
                if (i121 != 0) {
                    throw null;
                }
                int i122 = b;
                int i123 = (((i122 | 62) << 1) - (i122 ^ 62)) - 1;
                a = i123 % 128;
                if (i123 % 2 == 0) {
                    throw null;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ivas.gov.bisp.enumeration.dj.am
            private static int a = 0;
            private static int b = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar;
                CountDownTimer countDownTimer;
                ProgressDialog progressDialog2;
                int length;
                int i106;
                AppCompatButton appCompatButton2;
                int i107;
                int i108 = 2 % 2;
                int i109 = a;
                int i110 = i109 ^ 47;
                int i111 = (i109 & 47) << 1;
                int i112 = (i110 & i111) + (i111 | i110);
                int i113 = i112 % 128;
                b = i113;
                if (i112 % 2 == 0) {
                    throw null;
                }
                EditText[] editTextArr2 = editTextArr;
                AppCompatActivity appCompatActivity2 = appCompatActivity;
                ProgressBar progressBar2 = progressBar;
                AppCompatButton appCompatButton3 = appCompatButton;
                SessionManager sessionManager2 = sessionManager;
                String str3 = str;
                int i114 = (i113 ^ 7) + ((i113 & 7) << 1);
                a = i114 % 128;
                if (i114 % 2 != 0) {
                    bVar = bVarB;
                    countDownTimer = countDownTimerStart;
                    progressDialog2 = progressDialog;
                    int i115 = 74 / 0;
                } else {
                    bVar = bVarB;
                    countDownTimer = countDownTimerStart;
                    progressDialog2 = progressDialog;
                }
                b bVar2 = bVar;
                CountDownTimer countDownTimer2 = countDownTimer;
                ProgressDialog progressDialog3 = progressDialog2;
                CountDownLatch countDownLatch2 = countDownLatch;
                AtomicReference atomicReference2 = atomicReference;
                StringBuilder sb = new StringBuilder();
                int i116 = a;
                int i117 = i116 & 111;
                int i118 = (i116 ^ 111) | i117;
                int i119 = ((i117 | i118) << 1) - (i117 ^ i118);
                b = i119 % 128;
                if (i119 % 2 == 0) {
                    length = editTextArr2.length;
                    i106 = 1;
                } else {
                    length = editTextArr2.length;
                    i106 = 0;
                }
                int i120 = ((i116 & 13) - (~(-(-(i116 | 13))))) - 1;
                b = i120 % 128;
                int i121 = i120 % 2;
                while (i106 < length) {
                    int i122 = a;
                    int i123 = i122 & 23;
                    int i124 = (i123 - (~(-(-((i122 ^ 23) | i123))))) - 1;
                    b = i124 % 128;
                    if (i124 % 2 == 0) {
                        editTextArr2[i106].getText().toString();
                        throw null;
                    }
                    sb.append(editTextArr2[i106].getText().toString().trim());
                    int i125 = ((i106 | 2) << 1) - (i106 ^ 2);
                    i106 = (i125 ^ (-1)) + (i125 << 1);
                    int i126 = a + 25;
                    b = i126 % 128;
                    int i127 = i126 % 2;
                }
                String string = sb.toString();
                if (string.length() < 6) {
                    int i128 = a;
                    int i129 = (i128 & (-26)) | ((~i128) & 25);
                    int i130 = (i128 & 25) << 1;
                    int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                    b = i131 % 128;
                    if (i131 % 2 == 0) {
                        C.f(editTextArr2);
                        i107 = 0;
                    } else {
                        i107 = 0;
                        C.f(editTextArr2);
                    }
                    Toast toastMakeText = Toast.makeText(appCompatActivity2, "Please enter complete 6-digit OTP", i107);
                    int i132 = a + 25;
                    b = i132 % 128;
                    if (i132 % 2 == 0) {
                        toastMakeText.show();
                        int i133 = 8 / i107;
                    } else {
                        toastMakeText.show();
                    }
                    int i134 = a + 91;
                    b = i134 % 128;
                    int i135 = i134 % 2;
                    return;
                }
                progressBar2.setVisibility(0);
                appCompatButton3.setEnabled(false);
                StringBuilder sb2 = new StringBuilder();
                int i136 = a;
                int i137 = (i136 & 101) + (i136 | 101);
                b = i137 % 128;
                int i138 = i137 % 2;
                sb2.append(C.e());
                sb2.append("/api/Users/VerifyOTP");
                String string2 = sb2.toString();
                int i139 = a + 103;
                b = i139 % 128;
                int i140 = i139 % 2;
                String strZ = sessionManager2.z();
                int i141 = ah.c.d.getInt("user_id", 0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("otp_code", string);
                    int i142 = a;
                    int i143 = i142 & 85;
                    int i144 = (i142 ^ 85) | i143;
                    int i145 = (i143 ^ i144) + ((i143 & i144) << 1);
                    b = i145 % 128;
                    int i146 = i145 % 2;
                    jSONObject.put("username", strZ);
                    jSONObject.put("transaction_id", str3);
                    jSONObject.put("user_id", i141);
                    jSONObject.put("otptype", "Submission");
                    appCompatButton2 = appCompatButton3;
                    try {
                        y yVar = new y(progressBar2, appCompatButton3, appCompatActivity2, string, countDownTimer2, bVar2, progressDialog3, atomicReference2, countDownLatch2, editTextArr2);
                        int i147 = b;
                        int i148 = ((i147 ^ 69) | (i147 & 69)) << 1;
                        int i149 = -(((~i147) & 69) | (i147 & (-70)));
                        int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                        a = i150 % 128;
                        int i151 = i150 % 2;
                        ax.e(jSONObject, appCompatActivity2, string2, yVar);
                        int i152 = b;
                        int i153 = i152 & 7;
                        int i154 = -(-(i152 | 7));
                        int i155 = (i153 & i154) + (i154 | i153);
                        a = i155 % 128;
                        int i156 = i155 % 2;
                    } catch (Exception unused) {
                        progressBar2.setVisibility(8);
                        appCompatButton2.setEnabled(true);
                    }
                } catch (Exception unused2) {
                    appCompatButton2 = appCompatButton3;
                }
            }
        };
        int i106 = b;
        int i107 = (i106 ^ 119) + ((i106 & 119) << 1);
        a = i107 % 128;
        if (i107 % 2 != 0) {
            appCompatButton.setOnClickListener(onClickListener);
            bVarB.show();
        } else {
            appCompatButton.setOnClickListener(onClickListener);
            bVarB.show();
            throw null;
        }
    }
}
