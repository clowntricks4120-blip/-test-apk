package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class O implements TextWatcher {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ PasswordResetActivity c;

    public O(PasswordResetActivity passwordResetActivity) {
        this.c = passwordResetActivity;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & 79) + (i5 | 79);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 ^ 53;
        int i7 = ((i5 & 53) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String string;
        PasswordResetActivity passwordResetActivity;
        TextView textView;
        Pattern pattern;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            string = editable.toString();
            passwordResetActivity = this.c;
            textView = passwordResetActivity.z;
            pattern = PasswordResetActivity.s;
            int i4 = 87 / 0;
        } else {
            string = editable.toString();
            passwordResetActivity = this.c;
            textView = passwordResetActivity.z;
            pattern = PasswordResetActivity.s;
        }
        PasswordResetActivity.r(passwordResetActivity, textView, pattern.matcher(string).matches(), "• 8 to 12 characters long");
        int i5 = b;
        int i6 = (i5 & (-44)) | ((~i5) & 43);
        int i7 = -(-((i5 & 43) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            TextView textView2 = this.c.B;
            Pattern pattern2 = PasswordResetActivity.t;
            throw null;
        }
        PasswordResetActivity passwordResetActivity2 = this.c;
        TextView textView3 = passwordResetActivity2.B;
        Pattern pattern3 = PasswordResetActivity.t;
        int i9 = b;
        int i10 = ((i9 | 113) << 1) - (i9 ^ 113);
        a = i10 % 128;
        int i11 = i10 % 2;
        PasswordResetActivity.r(passwordResetActivity2, textView3, pattern3.matcher(string).matches(), "• At least 1 Uppercase letter (A-Z)");
        PasswordResetActivity passwordResetActivity3 = this.c;
        int i12 = b;
        int i13 = (i12 ^ 103) + ((i12 & 103) << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        TextView textView4 = passwordResetActivity3.C;
        Matcher matcher = PasswordResetActivity.r.matcher(string);
        int i15 = a + 123;
        b = i15 % 128;
        int i16 = i15 % 2;
        PasswordResetActivity.r(passwordResetActivity3, textView4, matcher.matches(), "• At least 1 Number (0-9)");
        PasswordResetActivity passwordResetActivity4 = this.c;
        TextView textView5 = passwordResetActivity4.y;
        int i17 = b;
        int i18 = (i17 & (-38)) | ((~i17) & 37);
        int i19 = (i17 & 37) << 1;
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        boolean zMatches = PasswordResetActivity.u.matcher(string).matches();
        int i22 = a;
        int i23 = ((i22 & 33) - (~(i22 | 33))) - 1;
        b = i23 % 128;
        int i24 = i23 % 2;
        PasswordResetActivity.r(passwordResetActivity4, textView5, zMatches, "• At least 1 Special character (@#$%!^&*)");
        if (i24 == 0) {
            int i25 = 94 / 0;
        }
    }
}
