package ivas.gov.bisp.enumeration.cT;

/* JADX INFO: loaded from: classes.dex */
public class n extends S {
    private static int a = 1;
    private static int b;
    public static final n c = new n();

    static {
        int i = b + 89;
        a = i % 128;
        int i2 = i % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 55) + (i2 | 55);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = (i4 | 113) << 1;
        int i7 = -(((~i4) & 113) | (i4 & (-114)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return ivas.gov.bisp.enumeration.cP.am.class;
    }
}
