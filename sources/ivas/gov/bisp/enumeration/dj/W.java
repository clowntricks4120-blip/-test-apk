package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class W implements TextWatcher {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ EditText[] d;

    public W(int i, EditText[] editTextArr) {
        this.c = i;
        this.d = editTextArr;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 35;
        int i7 = ((i5 | 35) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 41 / 0;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 ^ 33) | (i5 & 33)) << 1;
        int i7 = -(((~i5) & 33) | (i5 & (-34)));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 85;
        int i4 = (((i2 & 85) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (editable.length() == 1) {
            int i6 = a;
            int i7 = i6 ^ 63;
            int i8 = (((i6 & 63) | i7) << 1) - i7;
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = this.c;
            EditText[] editTextArr = this.d;
            int i12 = i9 & 71;
            int i13 = -(-((i9 ^ 71) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            int length = editTextArr.length;
            if (i16 != 0 ? i11 < length - 1 : i11 < length) {
                int i17 = i15 & 73;
                int i18 = ((i15 ^ 73) | i17) << 1;
                int i19 = -((i15 | 73) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                b = i20 % 128;
                (i20 % 2 != 0 ? editTextArr[i11] : editTextArr[((i11 ^ 2) + ((i11 & 2) << 1)) - 1]).requestFocus();
            }
        }
        int i21 = b;
        int i22 = ((i21 ^ 15) | (i21 & 15)) << 1;
        int i23 = -(((~i21) & 15) | (i21 & (-16)));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
    }
}
