package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.otp.OtpVerificationActivity;

/* JADX INFO: loaded from: classes.dex */
public class x implements TextWatcher {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ OtpVerificationActivity d;

    public x(OtpVerificationActivity otpVerificationActivity, int i) {
        this.d = otpVerificationActivity;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 68) + ((i5 & 68) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 21;
        int i7 = i5 | 21;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        EditText editText;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 85) - (~(i2 | 85))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int length = editable.length();
        if (i4 != 0 ? length == 1 : length == 1) {
            int i5 = this.c;
            EditText[] editTextArr = this.d.t;
            int i6 = b;
            int i7 = i6 | 49;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 49)) & i7);
            int i10 = (i8 & i9) + (i9 | i8);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int length2 = editTextArr.length;
            int i13 = length2 ^ (-1);
            if (i5 < (((length2 | i13) << 1) - (~(-i13))) - 1) {
                int i14 = (i11 & (-48)) | ((~i11) & 47);
                int i15 = -(-((i11 & 47) << 1));
                int i16 = (i14 & i15) + (i15 | i14);
                b = i16 % 128;
                if (i16 % 2 == 0) {
                    editText = editTextArr[0];
                } else {
                    int i17 = i5 & 1;
                    int i18 = (i5 | 1) & (~i17);
                    int i19 = i17 << 1;
                    editText = editTextArr[(i18 ^ i19) + ((i18 & i19) << 1)];
                }
                editText.requestFocus();
            }
        }
        int i20 = a;
        int i21 = (i20 ^ 1) + ((i20 & 1) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
    }
}
