package ivas.gov.bisp.enumeration.dj;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import java.util.Objects;
import java.util.regex.Pattern;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements View.OnKeyListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z(AppCompatActivity appCompatActivity, int i, int i2) {
        this.c = i2;
        this.e = appCompatActivity;
        this.d = i;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 125;
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (this.c == 0) {
            ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) this.e;
            int i6 = this.d;
            Pattern pattern = ChangePasswordActivity.r;
            int i7 = a;
            int i8 = ((i7 | 69) << 1) - (i7 ^ 69);
            b = i8 % 128;
            int i9 = i8 % 2;
            Objects.requireNonNull(changePasswordActivity);
            if (keyEvent.getAction() == 0) {
                int i10 = b;
                int i11 = i10 & 119;
                int i12 = ((i10 | 119) & (~i11)) + (i11 << 1);
                a = i12 % 128;
                if (i12 % 2 != 0 ? i == 67 : i == 13) {
                    if (changePasswordActivity.N[i6].getText().length() == 0) {
                        int i13 = a;
                        int i14 = i13 & 119;
                        int i15 = ((i13 ^ 119) | i14) << 1;
                        int i16 = -((i13 | 119) & (~i14));
                        int i17 = (i15 & i16) + (i16 | i15);
                        b = i17 % 128;
                        if (i17 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (i6 > 0) {
                            int i18 = (-2) - (i6 ^ (-1));
                            changePasswordActivity.N[i18].requestFocus();
                            int i19 = b;
                            int i20 = i19 & 61;
                            int i21 = -(-((i19 ^ 61) | i20));
                            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                            a = i22 % 128;
                            if (i22 % 2 == 0) {
                                changePasswordActivity.N[i18].setText(BuildConfig.FLAVOR);
                                int i23 = 67 / 0;
                            } else {
                                changePasswordActivity.N[i18].setText(BuildConfig.FLAVOR);
                            }
                            int i24 = b + 27;
                            a = i24 % 128;
                            int i25 = i24 % 2;
                        }
                    }
                }
            }
            int i26 = a + 57;
            b = i26 % 128;
            int i27 = i26 % 2;
            return false;
        }
        int i28 = i3 & 37;
        int i29 = (i28 - (~(-(-((i3 ^ 37) | i28))))) - 1;
        b = i29 % 128;
        int i30 = i29 % 2;
        PasswordResetActivity passwordResetActivity = (PasswordResetActivity) this.e;
        int i31 = this.d;
        Pattern pattern2 = PasswordResetActivity.s;
        int i32 = b;
        int i33 = i32 & 111;
        int i34 = i33 + ((i32 ^ 111) | i33);
        a = i34 % 128;
        if (i34 % 2 == 0) {
            Objects.requireNonNull(passwordResetActivity);
            keyEvent.getAction();
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(passwordResetActivity);
        if (keyEvent.getAction() == 0) {
            int i35 = b;
            int i36 = i35 & 63;
            int i37 = ((i35 ^ 63) | i36) << 1;
            int i38 = -((i35 | 63) & (~i36));
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            int i40 = i39 % 128;
            a = i40;
            if (i39 % 2 != 0 ? i == 67 : i == 110) {
                int i41 = (i40 & (-116)) | ((~i40) & 115);
                int i42 = (i40 & 115) << 1;
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                b = i43 % 128;
                if (i43 % 2 != 0) {
                    passwordResetActivity.M[i31].getText().length();
                    obj.hashCode();
                    throw null;
                }
                if (passwordResetActivity.M[i31].getText().length() == 0) {
                    int i44 = (-2) - ((a + 58) ^ (-1));
                    b = i44 % 128;
                    if (i44 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i31 > 0) {
                        int i45 = i31 - 1;
                        passwordResetActivity.M[i45].requestFocus();
                        int i46 = a;
                        int i47 = i46 & 7;
                        int i48 = i47 + ((i46 ^ 7) | i47);
                        b = i48 % 128;
                        if (i48 % 2 != 0) {
                            passwordResetActivity.M[i45].setText(BuildConfig.FLAVOR);
                            throw null;
                        }
                        passwordResetActivity.M[i45].setText(BuildConfig.FLAVOR);
                        int i49 = a;
                        int i50 = i49 & 87;
                        int i51 = (i49 ^ 87) | i50;
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        b = i52 % 128;
                        if (i52 % 2 != 0) {
                            int i53 = 2 / 3;
                        }
                    }
                }
            }
        }
        int i54 = a;
        int i55 = i54 ^ 61;
        int i56 = (((i54 & 61) | i55) << 1) - i55;
        b = i56 % 128;
        int i57 = i56 % 2;
        return false;
    }
}
