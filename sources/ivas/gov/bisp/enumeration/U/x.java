package ivas.gov.bisp.enumeration.U;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public class x extends l {
    private static int a = 0;
    private static int b = 1;

    public x(TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    @Override // ivas.gov.bisp.enumeration.U.l
    public void c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 38) + ((i2 & 38) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.setEndIconOnClickListener(null);
            TextInputLayout textInputLayout = this.c;
            throw null;
        }
        this.c.setEndIconOnClickListener(null);
        this.c.setEndIconDrawable((Drawable) null);
        this.c.setEndIconContentDescription((CharSequence) null);
        int i5 = b;
        int i6 = ((i5 & 66) + (i5 | 66)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
    }
}
