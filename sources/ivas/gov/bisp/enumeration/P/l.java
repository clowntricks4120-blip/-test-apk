package ivas.gov.bisp.enumeration.P;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
public class l implements TextWatcher {
    private static int a = 0;
    private static int b = 1;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 49) << 1) - (~(-(((~i2) & 49) | (i2 & (-50)))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 19;
        int i7 = (((i5 ^ 19) | i6) << 1) - ((i5 | 19) & (~i6));
        a = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 3;
        int i7 = i6 + ((i5 ^ 3) | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 49 / 0;
        }
    }
}
