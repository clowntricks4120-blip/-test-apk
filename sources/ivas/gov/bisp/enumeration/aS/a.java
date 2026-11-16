package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.aC.A;
import ivas.gov.bisp.enumeration.aC.D;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static int a = 0;
    private static int b = 1;
    public final A c;

    public a(A a2) {
        this.c = a2;
    }

    public static a c(String str, byte[] bArr, int i) {
        D d;
        int i2 = 2 % 2;
        int i3 = b + 79;
        a = i3 % 128;
        int i4 = i3 % 2;
        A.bdh bdhVarY = A.y();
        bdhVarY.f();
        A a2 = bdhVarY.d;
        int i5 = b;
        int i6 = (i5 ^ 5) + ((i5 & 5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        A.t(a2, str);
        AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArr, 0, bArr.length);
        int i8 = b;
        int i9 = i8 & 107;
        int i10 = (i8 ^ 107) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            bdhVarY.f();
            A.w(bdhVarY.d, abstractC0069zE);
            throw null;
        }
        bdhVarY.f();
        A.w(bdhVarY.d, abstractC0069zE);
        int i12 = a;
        int i13 = (i12 & 25) + (i12 | 25);
        b = i13 % 128;
        if (i13 % 2 == 0 || i == 0) {
            throw null;
        }
        int i14 = (~i) | i;
        int i15 = (i & i14) + (i | i14);
        if (i15 != 0) {
            int i16 = i12 & 89;
            int i17 = (~i16) & (i12 | 89);
            int i18 = i16 << 1;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            b = i19 % 128;
            int i20 = i19 % 2;
            if (i15 != 1) {
                int i21 = ((i12 & 82) + (i12 | 82)) - 1;
                b = i21 % 128;
                int i22 = i21 % 2;
                if (i15 != 2) {
                    int i23 = i12 & 113;
                    int i24 = (i12 ^ 113) | i23;
                    int i25 = (i23 & i24) + (i24 | i23);
                    b = i25 % 128;
                    if (i25 % 2 != 0 ? i15 != 3 : i15 != 5) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                    d = D.h;
                    int i26 = a;
                    int i27 = i26 & 107;
                    int i28 = ((i26 | 107) & (~i27)) + (i27 << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    d = D.f;
                    int i30 = a;
                    int i31 = ((i30 | 5) << 1) - (i30 ^ 5);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                }
            } else {
                d = D.g;
                int i33 = b + 47;
                a = i33 % 128;
                int i34 = i33 % 2;
            }
        } else {
            d = D.e;
            int i35 = a;
            int i36 = (-2) - ((((i35 | 86) << 1) - (i35 ^ 86)) ^ (-1));
            b = i36 % 128;
            int i37 = i36 % 2;
        }
        bdhVarY.f();
        A.v(bdhVarY.d, d);
        a aVar = new a((A) bdhVarY.c());
        int i38 = a;
        int i39 = ((((i38 ^ 27) | (i38 & 27)) << 1) - (~(-(((~i38) & 27) | (i38 & (-28)))))) - 1;
        b = i39 % 128;
        if (i39 % 2 != 0) {
            return aVar;
        }
        obj.hashCode();
        throw null;
    }
}
