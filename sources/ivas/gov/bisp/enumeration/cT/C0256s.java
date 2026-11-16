package ivas.gov.bisp.enumeration.cT;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cT.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0256s extends S implements V {
    private static int a = 0;
    private static int b = 1;
    public static final C0256s c = new C0256s();

    static {
        int i = a;
        int i2 = (i & 37) + (i | 37);
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 94) + (i2 | 94)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 15;
        b = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
