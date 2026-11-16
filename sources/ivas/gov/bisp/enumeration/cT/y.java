package ivas.gov.bisp.enumeration.cT;

/* JADX INFO: loaded from: classes.dex */
public class y extends S {
    private static int a = 0;
    private static int b = 1;
    public static final y c = new y();

    static {
        int i = b;
        int i2 = ((i | 105) << 1) - (i ^ 105);
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 113;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 | 103) << 1) - (((~i2) & 103) | (i2 & (-104)));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return ivas.gov.bisp.enumeration.cP.L.class;
        }
        throw null;
    }
}
