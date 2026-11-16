package ivas.gov.bisp.enumeration.L;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import ivas.gov.bisp.enumeration.p081d.InterfaceC0282a;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class j implements InterfaceC0282a {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ AppBarLayout c;

    public j(AppBarLayout appBarLayout) {
        this.c = appBarLayout;
    }

    @Override // ivas.gov.bisp.enumeration.p081d.InterfaceC0282a
    public am b(View view, am amVar) {
        am amVar2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = -(-((i2 & 75) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        AppBarLayout appBarLayout = this.c;
        Objects.requireNonNull(appBarLayout);
        WeakHashMap<View, R> weakHashMap = T.c;
        int i7 = b + 97;
        a = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        if (T.aWX.d(appBarLayout)) {
            int i9 = a;
            int i10 = ((i9 & (-12)) | ((~i9) & 11)) + ((i9 & 11) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 / 0;
            }
            amVar2 = amVar;
        } else {
            int i12 = a;
            int i13 = i12 ^ 91;
            int i14 = ((((i12 & 91) | i13) << 1) - (~(-i13))) - 1;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 4;
            }
            amVar2 = null;
        }
        if (!Objects.equals(appBarLayout.h, amVar2)) {
            int i16 = a;
            int i17 = ((((i16 ^ 33) | (i16 & 33)) << 1) - (~(-(((~i16) & 33) | (i16 & (-34)))))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            appBarLayout.h = amVar2;
            appBarLayout.f();
            appBarLayout.requestLayout();
            int i19 = a;
            int i20 = ((i19 ^ 54) + ((i19 & 54) << 1)) - 1;
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = a;
        int i23 = i22 & 95;
        int i24 = (i22 | 95) & (~i23);
        int i25 = i23 << 1;
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        b = i26 % 128;
        if (i26 % 2 != 0) {
            return amVar;
        }
        obj.hashCode();
        throw null;
    }
}
