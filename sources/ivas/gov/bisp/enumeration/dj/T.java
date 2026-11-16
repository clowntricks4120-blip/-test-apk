package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.otp.PasswordResetActivity;

/* JADX INFO: loaded from: classes.dex */
public class T implements TextWatcher {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ PasswordResetActivity d;

    public T(PasswordResetActivity passwordResetActivity, int i) {
        this.d = passwordResetActivity;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a + 109;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 43;
        int i7 = (i5 | 43) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 13;
        int i4 = i2 | 13;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0 ? editable.length() == 1 : editable.length() == 0) {
            int i6 = a;
            int i7 = i6 & 113;
            int i8 = (i6 | 113) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            int i12 = this.c;
            EditText[] editTextArr = this.d.M;
            int i13 = b;
            int i14 = (((i13 | 68) << 1) - (i13 ^ 68)) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0 ? i12 < editTextArr.length - 1 : i12 < editTextArr.length) {
                editTextArr[((i12 ^ 1) - (~((i12 & 1) << 1))) - 1].requestFocus();
                int i15 = b;
                int i16 = i15 & 77;
                int i17 = (i15 ^ 77) | i16;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 4 % 4;
                }
            }
        }
        int i20 = a + 97;
        b = i20 % 128;
        int i21 = i20 % 2;
    }
}
