package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: loaded from: classes.dex */
public class T implements K {
    private static int a = 0;
    private static int b = 1;
    public static final T c = new T();

    static {
        int i = a;
        int i2 = i & 47;
        int i3 = -(-((i ^ 47) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aD.K
    public boolean b(Class<?> cls) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 47) + (i2 | 47);
        a = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsAssignableFrom = S.class.isAssignableFrom(cls);
        int i5 = a;
        int i6 = ((i5 | 101) << 1) - (i5 ^ 101);
        b = i6 % 128;
        int i7 = i6 % 2;
        return zIsAssignableFrom;
    }

    @Override // ivas.gov.bisp.enumeration.aD.K
    public Z e(Class<?> cls) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-10)) | ((~i2) & 9)) - (~(-(-((i2 & 9) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        if (!S.class.isAssignableFrom(cls)) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Unsupported message type: ");
            sbW.append(cls.getName());
            throw new IllegalArgumentException(sbW.toString());
        }
        int i5 = b;
        int i6 = ((i5 | 89) << 1) - (i5 ^ 89);
        a = i6 % 128;
        try {
            if (i6 % 2 != 0) {
                S.j(cls.asSubclass(S.class));
                S.bkM bkm = S.bkM.f;
                throw null;
            }
            S sJ = S.j(cls.asSubclass(S.class));
            S.bkM bkm2 = S.bkM.f;
            int i7 = a;
            int i8 = i7 & 11;
            int i9 = i8 + ((i7 ^ 11) | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            Z z = (Z) sJ.C(bkm2, null, null);
            int i11 = a;
            int i12 = (-2) - (((i11 & 86) + (i11 | 86)) ^ (-1));
            int i13 = i12 % 128;
            b = i13;
            int i14 = i12 % 2;
            int i15 = (i13 ^ 25) + ((i13 & 25) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            return z;
        } catch (Exception e) {
            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w("Unable to get message info for ");
            sbW2.append(cls.getName());
            throw new RuntimeException(sbW2.toString(), e);
        }
    }
}
