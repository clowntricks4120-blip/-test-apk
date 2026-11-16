package ivas.gov.bisp.enumeration.bO;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static int a = 0;
    private static int b = 1;
    public static final o c;

    static {
        o oVar;
        try {
            oVar = (o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
            int i = b;
            int i2 = ((i & 50) + (i | 50)) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = i | 31;
            int i5 = i4 << 1;
            int i6 = -((~(i & 31)) & i4);
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            oVar = null;
        }
        if (oVar == null) {
            oVar = new o();
            int i9 = a + 93;
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        c = oVar;
        int i12 = b;
        int i13 = ((i12 | 33) << 1) - (i12 ^ 33);
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
