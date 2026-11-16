package ivas.gov.bisp.enumeration.p046bs;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import ivas.gov.bisp.enumeration.P.J;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p081d.am;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r implements J.bdL {
    private static int a = 1;
    private static int b;

    public r(BottomNavigationView bottomNavigationView) {
    }

    @Override // ivas.gov.bisp.enumeration.P.J.bdL
    public am b(View view, am amVar, J.beS bes) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 103) + ((i3 & 103) << 1);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = bes.d;
            amVar.g();
            obj.hashCode();
            throw null;
        }
        int i6 = bes.d;
        int iG = amVar.g();
        int i7 = -(-i6);
        int i8 = iG & i7;
        int i9 = i7 | iG;
        bes.d = (i8 ^ i9) + ((i9 & i8) << 1);
        WeakHashMap<View, R> weakHashMap = T.c;
        int iF = T.aWY.f(view);
        int i10 = b;
        int i11 = i10 & 111;
        int i12 = (i11 - (~(-(-((i10 ^ 111) | i11))))) - 1;
        int i13 = i12 % 128;
        a = i13;
        if (i12 % 2 != 0 ? iF == 1 : iF == 0) {
            z = true;
        } else {
            int i14 = i13 & 47;
            int i15 = (((~i14) & (i13 | 47)) - (~(i14 << 1))) - 1;
            b = i15 % 128;
            z = i15 % 2 != 0;
            int i16 = i13 & 5;
            int i17 = i16 + ((i13 ^ 5) | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        int iH = amVar.h();
        int i19 = amVar.i();
        int i20 = bes.a;
        int i21 = a;
        int i22 = (i21 & 47) + (i21 | 47);
        b = i22 % 128;
        int i23 = i22 % 2;
        if (!z) {
            int i24 = i21 & 31;
            int i25 = ((((i21 ^ 31) | i24) << 1) - (~(-((i21 | 31) & (~i24))))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            i = iH;
        } else {
            int i27 = (i21 ^ 47) + ((i21 & 47) << 1);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i = i19;
        }
        int i28 = i20 & i;
        int i29 = (i20 ^ i) | i28;
        int i30 = (i28 & i29) + (i29 | i28);
        bes.a = i30;
        int i31 = bes.c;
        int i32 = a;
        int i33 = i32 & 99;
        int i34 = (i32 ^ 99) | i33;
        int i35 = (i33 & i34) + (i33 | i34);
        b = i35 % 128;
        int i36 = i35 % 2;
        if (!z) {
            int i37 = i32 + 91;
            int i38 = i37 % 128;
            b = i38;
            int i39 = i37 % 2;
            int i40 = i38 + 27;
            a = i40 % 128;
            int i41 = i40 % 2;
            iH = i19;
        }
        int i42 = i31 & iH;
        int i43 = (iH ^ i31) | i42;
        int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
        bes.c = i44;
        int i45 = a;
        int i46 = (i45 ^ 55) + ((i45 & 55) << 1);
        b = i46 % 128;
        int i47 = i46 % 2;
        int i48 = bes.b;
        int i49 = bes.d;
        int i50 = b + 121;
        a = i50 % 128;
        if (i50 % 2 == 0) {
            T.aWY.l(view, i30, i48, i44, i49);
            throw null;
        }
        T.aWY.l(view, i30, i48, i44, i49);
        int i51 = b;
        int i52 = i51 & 103;
        int i53 = (i51 | 103) & (~i52);
        int i54 = i52 << 1;
        int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
        a = i55 % 128;
        int i56 = i55 % 2;
        return amVar;
    }
}
