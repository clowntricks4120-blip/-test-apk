package ivas.gov.bisp.enumeration.bA;

import android.view.View;
import ivas.gov.bisp.enumeration.fragments.FragmentPictures;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FragmentPictures d;

    public /* synthetic */ h(FragmentPictures fragmentPictures, int i) {
        this.c = i;
        this.d = fragmentPictures;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i8 = this.c;
        if (i8 == 0) {
            FragmentPictures.f(this.d, view);
            int i9 = b + 109;
            a = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        if (i8 == 1) {
            FragmentPictures.k(this.d, view);
            int i11 = b + 107;
            a = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        if (i8 == 2) {
            FragmentPictures.c(this.d, view);
            int i13 = b;
            int i14 = i13 & 95;
            int i15 = (((i13 | 95) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        int i17 = i7 ^ 37;
        int i18 = ((((i7 & 37) | i17) << 1) - (~(-i17))) - 1;
        int i19 = i18 % 128;
        b = i19;
        int i20 = i18 % 2;
        int i21 = i19 + 59;
        a = i21 % 128;
        int i22 = i21 % 2;
        FragmentPictures.e(this.d, view);
        int i23 = a;
        int i24 = i23 & 37;
        int i25 = (i23 ^ 37) | i24;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        b = i26 % 128;
        int i27 = i26 % 2;
    }
}
