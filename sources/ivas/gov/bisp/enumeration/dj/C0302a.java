package ivas.gov.bisp.enumeration.dj;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.dj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0302a implements TextWatcher {
    private static int a = 0;
    private static int b = 1;
    public final EditText c;
    public boolean d = false;

    public C0302a(EditText editText) {
        this.c = editText;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 ^ 77) | (i5 & 77)) << 1;
        int i7 = -(((~i5) & 77) | (i5 & (-78)));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a + 73;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String strReplaceAll;
        int length;
        int length2;
        int i;
        EditText editText;
        int length3;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 29;
        int i5 = i4 + ((i3 ^ 29) | i4);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (this.d) {
            int i8 = i6 & 49;
            int i9 = (i8 - (~(-(-((i6 ^ 49) | i8))))) - 1;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.d = true;
        String string = editable.toString();
        int i10 = a;
        int i11 = ((i10 ^ 81) | (i10 & 81)) << 1;
        int i12 = -(((~i10) & 81) | (i10 & (-82)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            strReplaceAll = string.replaceAll("[^0-9]", BuildConfig.FLAVOR);
            length = strReplaceAll.length();
            int i14 = 9 / 0;
        } else {
            strReplaceAll = string.replaceAll("[^0-9]", BuildConfig.FLAVOR);
            length = strReplaceAll.length();
        }
        int i15 = b;
        int i16 = (i15 & 19) + (i15 | 19);
        a = i16 % 128;
        if (i16 % 2 == 0 ? length > 13 : length > 15) {
            strReplaceAll = strReplaceAll.substring(0, 13);
            int i17 = b + 99;
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        StringBuilder sb = new StringBuilder();
        int i19 = a;
        int i20 = (i19 & 68) + (i19 | 68);
        int i21 = (i20 ^ (-1)) + (i20 << 1);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            length2 = strReplaceAll.length();
            i = 1;
        } else {
            length2 = strReplaceAll.length();
            i = 0;
        }
        while (i < length2) {
            int i22 = a;
            int i23 = i22 ^ 9;
            int i24 = -(-((i22 & 9) << 1));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            int i26 = i25 % 2;
            sb.append(strReplaceAll.charAt(i));
            int i27 = b;
            int i28 = (i27 ^ 57) + ((i27 & 57) << 1);
            a = i28 % 128;
            if (i28 % 2 == 0 ? i != 4 : i != 2) {
                int i29 = i27 + 95;
                a = i29 % 128;
                if (i29 % 2 == 0 ? i == 11 : i == 66) {
                    if (i != (-2) - (length2 ^ (-1))) {
                        int i30 = i27 & 33;
                        int i31 = (i27 ^ 33) | i30;
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        a = i32 % 128;
                        int i33 = i32 % 2;
                        sb.append("-");
                        int i34 = a + 19;
                        b = i34 % 128;
                        int i35 = i34 % 2;
                    }
                }
            } else if (i != (-2) - (length2 ^ (-1))) {
                int i36 = i27 & 33;
                int i37 = (i27 ^ 33) | i36;
                int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                a = i38 % 128;
                int i39 = i38 % 2;
                sb.append("-");
                int i310 = a + 19;
                b = i310 % 128;
                int i311 = i310 % 2;
            }
            int i40 = i & 1;
            int i41 = ((i ^ 1) | i40) << 1;
            int i42 = -((i | 1) & (~i40));
            i = (i42 | i41) + (i41 & i42);
            int i43 = a;
            int i44 = (i43 & (-58)) | ((~i43) & 57);
            int i45 = -(-((i43 & 57) << 1));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            b = i46 % 128;
            if (i46 % 2 == 0) {
                int i47 = 3 % 4;
            }
        }
        int length4 = editable.length();
        String string2 = sb.toString();
        int i48 = b;
        int i49 = ((i48 & 26) + (i48 | 26)) - 1;
        a = i49 % 128;
        if (i49 % 2 != 0) {
            editable.replace(0, length4, string2);
            editText = this.c;
            length3 = editable.length();
            int i50 = 41 / 0;
        } else {
            editable.replace(0, length4, string2);
            editText = this.c;
            length3 = editable.length();
        }
        int i51 = b + 88;
        int i52 = (i51 ^ (-1)) + (i51 << 1);
        a = i52 % 128;
        if (i52 % 2 != 0) {
            editText.setSelection(length3);
        } else {
            editText.setSelection(length3);
        }
        this.d = false;
    }
}
