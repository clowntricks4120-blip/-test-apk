package ivas.gov.bisp.enumeration.Q;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class u implements View.OnClickListener {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ com.google.android.material.datepicker.z c;
    public final /* synthetic */ com.google.android.material.datepicker.h d;

    public u(com.google.android.material.datepicker.h hVar, com.google.android.material.datepicker.z zVar) {
        this.d = hVar;
        this.c = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 95;
        int i4 = (i3 - (~((i2 ^ 95) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int iBr = this.d.d().br();
        int i6 = ~iBr;
        int i7 = -(-(iBr << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = a;
        int i10 = i9 ^ 117;
        int i11 = ((i9 & 117) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i8 >= 0) {
            int i14 = i9 & 55;
            int i15 = i9 | 55;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                this.d.g(this.c.h(i8));
                int i17 = 99 / 0;
            } else {
                this.d.g(this.c.h(i8));
            }
            int i18 = a + 15;
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = b;
        int i21 = i20 & 61;
        int i22 = i21 + ((i20 ^ 61) | i21);
        a = i22 % 128;
        int i23 = i22 % 2;
    }
}
