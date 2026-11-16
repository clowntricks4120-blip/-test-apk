package ivas.gov.bisp.enumeration.cT;

/* JADX INFO: loaded from: classes.dex */
public class D extends S {
    private static int a = 1;
    private static int b;
    public static final D c = new D();

    static {
        int i = b;
        int i2 = (((i & (-20)) | ((~i) & 19)) - (~(-(-((i & 19) << 1))))) - 1;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 103;
        int i4 = (i3 - (~((i2 ^ 103) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return ivas.gov.bisp.enumeration.cP.A.class;
    }
}
