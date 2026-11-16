package ivas.gov.bisp.enumeration.Q;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class P implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ com.google.android.material.datepicker.h c;

    public P(com.google.android.material.datepicker.h hVar) {
        this.c = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 113) << 1) - (i2 ^ 113);
        b = i3 % 128;
        int i4 = i3 % 2;
        com.google.android.material.datepicker.h hVar = this.c;
        int i5 = hVar.h;
        if (i5 == 2) {
            int i6 = a;
            int i7 = i6 ^ 125;
            int i8 = -(-((i6 & 125) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                hVar.f(0);
            } else {
                hVar.f(1);
            }
            int i10 = a;
            int i11 = i10 & 55;
            int i12 = (i11 - (~(-(-((i10 ^ 55) | i11))))) - 1;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i5 == 1) {
            int i13 = a;
            int i14 = (((i13 | 118) << 1) - (i13 ^ 118)) - 1;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                hVar.f(3);
            } else {
                hVar.f(2);
            }
            int i15 = a + 45;
            b = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = b;
        int i18 = (i17 & 16) + (i17 | 16);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        a = i19 % 128;
        int i20 = i19 % 2;
    }
}
