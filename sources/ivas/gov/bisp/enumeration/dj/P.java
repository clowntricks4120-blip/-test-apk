package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class P implements TextWatcher {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ChangePasswordActivity c;

    public P(ChangePasswordActivity changePasswordActivity) {
        this.c = changePasswordActivity;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b + 9;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 & (-42)) | ((~i5) & 41)) + ((i5 & 41) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        boolean zMatches;
        int i = 2 % 2;
        int i2 = b + 47;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            editable.toString();
            TextView textView = this.c.B;
            Pattern pattern = ChangePasswordActivity.r;
            obj.hashCode();
            throw null;
        }
        String string = editable.toString();
        ChangePasswordActivity changePasswordActivity = this.c;
        TextView textView2 = changePasswordActivity.B;
        Pattern pattern2 = ChangePasswordActivity.r;
        int i3 = a;
        int i4 = ((i3 & 40) + (i3 | 40)) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            ChangePasswordActivity.r(changePasswordActivity, textView2, pattern2.matcher(string).matches(), "• 8 to 12 characters long");
            int i5 = 24 / 0;
        } else {
            ChangePasswordActivity.r(changePasswordActivity, textView2, pattern2.matcher(string).matches(), "• 8 to 12 characters long");
        }
        ChangePasswordActivity changePasswordActivity2 = this.c;
        TextView textView3 = changePasswordActivity2.C;
        Pattern pattern3 = ChangePasswordActivity.s;
        int i6 = b + 109;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            ChangePasswordActivity.r(changePasswordActivity2, textView3, pattern3.matcher(string).matches(), "• At least 1 Uppercase letter (A-Z)");
            throw null;
        }
        ChangePasswordActivity.r(changePasswordActivity2, textView3, pattern3.matcher(string).matches(), "• At least 1 Uppercase letter (A-Z)");
        ChangePasswordActivity changePasswordActivity3 = this.c;
        int i7 = a;
        int i8 = ((i7 | 44) << 1) - (i7 ^ 44);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        TextView textView4 = changePasswordActivity3.y;
        Matcher matcher = ChangePasswordActivity.u.matcher(string);
        int i11 = b;
        int i12 = i11 & 71;
        int i13 = ((i11 | 71) & (~i12)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            ChangePasswordActivity.r(changePasswordActivity3, textView4, matcher.matches(), "• At least 1 Number (0-9)");
            TextView textView5 = this.c.E;
            obj.hashCode();
            throw null;
        }
        ChangePasswordActivity.r(changePasswordActivity3, textView4, matcher.matches(), "• At least 1 Number (0-9)");
        ChangePasswordActivity changePasswordActivity4 = this.c;
        TextView textView6 = changePasswordActivity4.E;
        int i14 = (-2) - ((a + 66) ^ (-1));
        b = i14 % 128;
        if (i14 % 2 != 0) {
            zMatches = ChangePasswordActivity.t.matcher(string).matches();
            int i15 = 94 / 0;
        } else {
            zMatches = ChangePasswordActivity.t.matcher(string).matches();
        }
        ChangePasswordActivity.r(changePasswordActivity4, textView6, zMatches, "• At least 1 Special character (@#$%!^&*)");
        int i16 = b;
        int i17 = (((i16 ^ 25) | (i16 & 25)) << 1) - (((~i16) & 25) | (i16 & (-26)));
        a = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }
}
