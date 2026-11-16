package ivas.gov.bisp.enumeration.utils;

import android.content.Context;
import android.util.AttributeSet;
import ivas.gov.bisp.enumeration.OooOOO0.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public class NoPasteEditText extends OooOOOO {
    private static int a = 1;
    private static int b;

    public NoPasteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (-2) - ((i2 + 36) ^ (-1));
        b = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.OooOOO0.OooOOOO, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 1) << 1) - (i3 ^ 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (i != 16908322) {
            int i6 = i3 & 11;
            int i7 = (((~i6) & (i3 | 11)) - (~(-(-(i6 << 1))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            if (i != 16908337) {
                int i9 = i3 & 119;
                int i10 = (i3 | 119) & (~i9);
                int i11 = i9 << 1;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                if (i != 16908321) {
                    int i15 = (-2) - (((i13 ^ 88) + ((i13 & 88) << 1)) ^ (-1));
                    int i16 = i15 % 128;
                    a = i16;
                    int i17 = i15 % 2;
                    if (i != 16908320) {
                        int i18 = i16 & 75;
                        int i19 = ((((i16 ^ 75) | i18) << 1) - (~(-((i16 | 75) & (~i18))))) - 1;
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
                        if (i20 != 0) {
                            int i21 = 80 / 0;
                        }
                        return zOnTextContextMenuItem;
                    }
                }
            }
        }
        int i22 = b + 61;
        a = i22 % 128;
        int i23 = i22 % 2;
        return false;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 37;
        int i6 = ((i4 ^ 37) | i5) << 1;
        int i7 = -((i4 | 37) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        Object obj = null;
        if (i == getText().length()) {
            int i10 = a;
            int i11 = i10 ^ 13;
            int i12 = -(-((i10 & 13) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (i2 == getText().length()) {
                int i15 = b;
                int i16 = ((i15 & 33) - (~(i15 | 33))) - 1;
                a = i16 % 128;
                if (i16 % 2 == 0) {
                    super.onSelectionChanged(i, i2);
                    throw null;
                }
                super.onSelectionChanged(i, i2);
                int i17 = a;
                int i18 = (i17 & 13) + (i17 | 13);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 57 / 0;
                    return;
                }
                return;
            }
        }
        setSelection(getText().length());
        int i20 = b;
        int i21 = i20 & 83;
        int i22 = (i20 | 83) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 & i23) + (i22 | i23);
        a = i24 % 128;
        if (i24 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
