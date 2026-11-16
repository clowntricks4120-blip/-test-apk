package ivas.gov.bisp.enumeration.aS;

import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aS.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079m {
    private static int a = 0;
    private static int b = 1;
    public static final CopyOnWriteArrayList<N> c = new CopyOnWriteArrayList<>();

    static {
        int i = b;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    public static N b(String str) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 43) | (i2 & 43)) << 1;
        int i4 = -(((~i2) & 43) | (i2 & (-44)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = b;
        int i8 = i7 & 27;
        int i9 = (i7 | 27) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        for (N n : c) {
            int i13 = b;
            int i14 = i13 & 55;
            int i15 = -(-((i13 ^ 55) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            if (n.e(str)) {
                int i18 = b;
                int i19 = i18 + 87;
                a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = i18 & 37;
                int i22 = ((i18 ^ 37) | i21) << 1;
                int i23 = -((i18 | 37) & (~i21));
                int i24 = (i22 & i23) + (i23 | i22);
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    return n;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        throw new GeneralSecurityException(j.r("No KMS client does support: ", str));
    }
}
