package ivas.gov.bisp.enumeration.U;

import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public class i extends l {
    private static int a = 1;
    private static int b;

    public i(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 61) + (i2 | 61);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.c.setEndIconDrawable(this.f);
        TextInputLayout textInputLayout = this.c;
        int i5 = b;
        int i6 = i5 & 3;
        int i7 = ((((i5 ^ 3) | i6) << 1) - (~(-((i5 | 3) & (~i6))))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            textInputLayout.setEndIconOnClickListener(null);
            this.c.setEndIconOnLongClickListener(null);
            int i8 = 85 / 0;
        } else {
            textInputLayout.setEndIconOnClickListener(null);
            this.c.setEndIconOnLongClickListener(null);
        }
        int i9 = a;
        int i10 = (((i9 | 64) << 1) - (i9 ^ 64)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
