package ivas.gov.bisp.enumeration.p087j;

import android.view.View;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class N extends r {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ LayoutInflaterFactory2C0312o u;

    public N(LayoutInflaterFactory2C0312o layoutInflaterFactory2C0312o) {
        this.u = layoutInflaterFactory2C0312o;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.v
    public void e(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 18) + ((i2 & 18) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        this.u.u.setAlpha(1.0f);
        R r = this.u.x;
        int i5 = a;
        int i6 = ((i5 | 15) << 1) - (i5 ^ 15);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            r.f(null);
            this.u.x = null;
        } else {
            r.f(null);
            this.u.x = null;
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p100w.r, ivas.gov.bisp.enumeration.p081d.v
    public void c(View view) {
        View view2;
        int i = 2 % 2;
        int i2 = b + 9;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            this.u.u.setVisibility(1);
        } else {
            this.u.u.setVisibility(0);
        }
        if (this.u.u.getParent() instanceof View) {
            int i3 = b;
            int i4 = i3 & 67;
            int i5 = (i3 | 67) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                view2 = (View) this.u.u.getParent();
                WeakHashMap<View, R> weakHashMap = T.c;
                int i8 = 10 / 0;
            } else {
                view2 = (View) this.u.u.getParent();
                WeakHashMap<View, R> weakHashMap2 = T.c;
            }
            int i9 = a;
            int i10 = i9 ^ 63;
            int i11 = ((((i9 & 63) | i10) << 1) - (~(-i10))) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            T.aXd.d(view2);
            int i13 = b;
            int i14 = (((i13 | 10) << 1) - (10 ^ i13)) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = a;
        int i17 = i16 & 97;
        int i18 = ((i16 ^ 97) | i17) << 1;
        int i19 = -((i16 | 97) & (~i17));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
    }
}
