package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058o {
    private static int a = 0;
    private static int b = 1;
    public static final Class<?> c;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
            int i = a + 110;
            int i2 = (i ^ (-1)) + (i << 1);
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        c = cls;
        int i5 = a;
        int i6 = i5 & 35;
        int i7 = (i5 | 35) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
    }
}
