package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class C extends S implements V {
    private static int a = 0;
    private static int b = 1;
    public static final C c = new C();

    static {
        int i = b + 105;
        a = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        Class<Long> cls;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = i3 + ((i2 ^ 61) | i3);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            cls = Long.class;
            int i6 = 50 / 0;
        } else {
            cls = Long.class;
        }
        int i7 = i5 & 87;
        int i8 = ((i5 | 87) & (~i7)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return cls;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public long d(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 35) | (i2 & 35)) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            ((Long) obj).longValue();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        long jLongValue = ((Long) obj).longValue();
        int i6 = b;
        int i7 = (i6 & (-96)) | ((~i6) & 95);
        int i8 = -(-((i6 & 95) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return jLongValue;
    }
}
