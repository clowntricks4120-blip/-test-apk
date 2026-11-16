package ivas.gov.bisp.enumeration.bA;

import android.view.View;
import ivas.gov.bisp.enumeration.fragments.FragmentDeskbasedSurvey;
import ivas.gov.bisp.enumeration.fragments.FragmentPictures;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ c c = new c(0);
    public static final /* synthetic */ c d = new c(1);
    public static final /* synthetic */ c e = new c(2);
    public final /* synthetic */ int f;

    static {
        int i = a;
        int i2 = i & 33;
        int i3 = (i2 - (~(-(-((i ^ 33) | i2))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ c(int i) {
        this.f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 98) << 1) - (i2 ^ 98)) ^ (-1));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = this.f;
        if (i6 == 0) {
            FragmentDeskbasedSurvey.e(view);
            int i7 = b;
            int i8 = ((i7 ^ 83) | (i7 & 83)) << 1;
            int i9 = -(((~i7) & 83) | (i7 & (-84)));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i6 == 1) {
            FragmentPictures.j(view);
            int i11 = b;
            int i12 = ((i11 & 46) + (i11 | 46)) - 1;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 37 / 0;
                return;
            }
            return;
        }
        int i14 = i4 + 73;
        a = i14 % 128;
        int i15 = i14 % 2;
        FragmentPictures.i(view);
        int i16 = b + 95;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 73 / 0;
        }
    }
}
