package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import ivas.gov.bisp.enumeration.otp.ChangePasswordActivity;

/* JADX INFO: loaded from: classes.dex */
public class u implements TextWatcher {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ChangePasswordActivity d;

    public u(ChangePasswordActivity changePasswordActivity, int i) {
        this.d = changePasswordActivity;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i;
        EditText editText;
        int i2 = 2 % 2;
        int i3 = a + 15;
        b = i3 % 128;
        int i4 = i3 % 2;
        int length = editable.length();
        if (i4 == 0 ? length == 1 : length == 0) {
            int i5 = (-2) - ((b + 92) ^ (-1));
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = this.c;
            EditText[] editTextArr = this.d.N;
            int i8 = b;
            int i9 = ((i8 & 28) + (i8 | 28)) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int length2 = editTextArr.length;
                int i10 = (length2 ^ (-1)) | length2;
                if (i7 < ((length2 | i10) << 1) - (length2 ^ i10)) {
                    i = (i8 ^ 103) + ((i8 & 103) << 1);
                    a = i % 128;
                    if (i % 2 == 0) {
                        editText = editTextArr[i7];
                    } else {
                        editText = editTextArr[((i7 | 1) << 1) - (i7 ^ 1)];
                    }
                    editText.requestFocus();
                }
            } else if (i7 < editTextArr.length) {
                i = (i8 ^ 103) + ((i8 & 103) << 1);
                a = i % 128;
                if (i % 2 == 0) {
                    editText = editTextArr[i7];
                } else {
                    editText = editTextArr[((i7 | 1) << 1) - (i7 ^ 1)];
                }
                editText.requestFocus();
            }
        }
        int i11 = b;
        int i12 = i11 & 9;
        int i13 = i11 | 9;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 5;
        int i7 = (i5 ^ 5) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 60) + ((i5 & 60) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }
}
