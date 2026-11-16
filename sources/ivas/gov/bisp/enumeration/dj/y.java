package ivas.gov.bisp.enumeration.dj;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatButton;
import ivas.gov.bisp.enumeration.models.ResponseMessage;
import ivas.gov.bisp.enumeration.p024ax.I;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import net.sqlcipher.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y implements I {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ ProgressBar d;
    public final /* synthetic */ AppCompatButton e;
    public final /* synthetic */ AppCompatActivity f;
    public final /* synthetic */ String g;
    public final /* synthetic */ b h;
    public final /* synthetic */ CountDownTimer i;
    public final /* synthetic */ ProgressDialog j;
    public final /* synthetic */ AtomicReference k;
    public final /* synthetic */ EditText[] l;

    public y(ProgressBar progressBar, AppCompatButton appCompatButton, AppCompatActivity appCompatActivity, String str, CountDownTimer countDownTimer, b bVar, ProgressDialog progressDialog, AtomicReference atomicReference, CountDownLatch countDownLatch, EditText[] editTextArr) {
        this.d = progressBar;
        this.e = appCompatButton;
        this.f = appCompatActivity;
        int i = b;
        int i2 = i & 91;
        int i3 = (i ^ 91) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            this.g = str;
            this.i = countDownTimer;
            throw null;
        }
        this.g = str;
        this.i = countDownTimer;
        int i6 = i5 ^ 109;
        int i7 = -(-((i5 & 109) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        this.h = bVar;
        this.j = progressDialog;
        int i11 = i9 & 55;
        int i12 = -(-((i9 ^ 55) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        this.k = atomicReference;
        this.c = countDownLatch;
        if (i14 != 0) {
            this.l = editTextArr;
        } else {
            this.l = editTextArr;
            obj.hashCode();
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onError(ResponseMessage responseMessage) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = i3 + ((i2 ^ 23) | i3);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.d.setVisibility(101);
            this.e.setEnabled(false);
        } else {
            this.d.setVisibility(8);
            this.e.setEnabled(true);
        }
        C.f(this.l);
        C.c(this.l);
        AppCompatActivity appCompatActivity = this.f;
        int i5 = a;
        int i6 = ((i5 ^ 56) + ((i5 & 56) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = j.w("Verification Failed: ");
        sbW.append(responseMessage.getErrorMessage());
        int i8 = a;
        int i9 = i8 & 15;
        int i10 = (i8 ^ 15) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        (i11 % 2 != 0 ? Toast.makeText(appCompatActivity, sbW.toString(), 0) : Toast.makeText(appCompatActivity, sbW.toString(), 1)).show();
    }

    @Override // ivas.gov.bisp.enumeration.p024ax.I
    public void onSuccess(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 53) + (i2 | 53);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        this.e.setEnabled(true);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("status", false);
            String strOptString = jSONObject.optString("message", BuildConfig.FLAVOR);
            int i4 = a;
            int i5 = i4 + 125;
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!zOptBoolean) {
                int i6 = i4 & 5;
                int i7 = (i4 | 5) & (~i6);
                int i8 = i6 << 1;
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                if (i9 % 2 != 0) {
                    strOptString.toLowerCase().contains("verified");
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!strOptString.toLowerCase().contains("verified")) {
                    int i10 = a;
                    int i11 = i10 ^ 83;
                    int i12 = (i10 & 83) << 1;
                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    if (!strOptString.toLowerCase().contains("success")) {
                        int i15 = b + 116;
                        int i16 = (i15 ^ (-1)) + (i15 << 1);
                        a = i16 % 128;
                        int i17 = i16 % 2;
                        C.f(this.l);
                        EditText[] editTextArr = this.l;
                        int i18 = a + 47;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        C.c(editTextArr);
                        AppCompatActivity appCompatActivity = this.f;
                        int i20 = (-2) - ((a + 118) ^ (-1));
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        if (strOptString.isEmpty()) {
                            int i22 = b;
                            int i23 = (((i22 ^ 31) | (i22 & 31)) << 1) - (((~i22) & 31) | (i22 & (-32)));
                            int i24 = i23 % 128;
                            a = i24;
                            if (i23 % 2 == 0) {
                                int i25 = 76 / 0;
                            }
                            int i26 = i24 & 3;
                            int i27 = -(-(i24 | 3));
                            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            strOptString = "Invalid OTP. Please try again.";
                        }
                        Toast.makeText(appCompatActivity, strOptString, 1).show();
                        int i30 = (-2) - ((b + 22) ^ (-1));
                        a = i30 % 128;
                        if (i30 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    int i31 = a;
                    int i32 = ((i31 | 3) << 1) - (i31 ^ 3);
                    b = i32 % 128;
                    if (i32 % 2 != 0) {
                        int i33 = 4 % 4;
                    }
                }
            }
            int i34 = a;
            int i35 = i34 ^ 21;
            int i36 = (i34 & 21) << 1;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            int i38 = i37 % 128;
            b = i38;
            int i39 = i37 % 2;
            int i40 = i38 & 15;
            int i41 = (((i38 ^ 15) | i40) << 1) - ((i38 | 15) & (~i40));
            a = i41 % 128;
            int i42 = i41 % 2;
            Toast.makeText(this.f, "OTP Verified! (Valid for 5 Surveys)", 0).show();
            AppCompatActivity appCompatActivity2 = this.f;
            int i43 = b;
            int i44 = i43 & 33;
            int i45 = (i43 ^ 33) | i44;
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            a = i46 % 128;
            int i47 = i46 % 2;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(appCompatActivity2).edit();
            String str = this.g;
            int i48 = b;
            int i49 = ((i48 & 60) + (i48 | 60)) - 1;
            a = i49 % 128;
            int i50 = i49 % 2;
            editorEdit.putString("pref_submission_otp", str).putInt("pref_submission_otp_usage_count", 1).apply();
            this.i.cancel();
            b bVar = this.h;
            int i51 = b;
            int i52 = i51 & 75;
            int i53 = (i51 ^ 75) | i52;
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            a = i54 % 128;
            if (i54 % 2 == 0) {
                bVar.dismiss();
                throw null;
            }
            bVar.dismiss();
            ProgressDialog progressDialog = this.j;
            if (progressDialog != null) {
                int i55 = b;
                int i56 = (i55 & 7) + (i55 | 7);
                a = i56 % 128;
                if (i56 % 2 == 0) {
                    progressDialog.show();
                    int i57 = 15 / 0;
                } else {
                    progressDialog.show();
                }
            }
            this.k.set(this.g);
            this.c.countDown();
            int i58 = b + 57;
            a = i58 % 128;
            if (i58 % 2 == 0) {
                int i59 = 77 / 0;
            }
        } catch (Exception unused) {
            C.f(this.l);
        }
    }
}
