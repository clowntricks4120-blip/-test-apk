package ivas.gov.bisp.enumeration.p026az;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class a implements TextWatcher {
    private static int a = 1;
    private static int b;

    public a(EditText editText) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 61;
        int i7 = -(-((i5 ^ 61) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 ^ 56) + ((i5 & 56) << 1)) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
