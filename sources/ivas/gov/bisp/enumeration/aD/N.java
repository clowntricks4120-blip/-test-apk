package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class N {
    private static int a = 1;
    private static int b;
    public static final o0OoOo0<?> c = new M();
    public static final o0OoOo0<?> d;

    static {
        AbstractC0067x abstractC0067x;
        try {
            Class<?> cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull");
            int i = b + 109;
            a = i % 128;
            abstractC0067x = (AbstractC0067x) (i % 2 == 0 ? cls.getDeclaredConstructor(new Class[1]).newInstance(new Object[1]) : cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            int i2 = b;
            int i3 = ((i2 & 114) + (i2 | 114)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (Exception unused) {
            abstractC0067x = null;
        }
        d = abstractC0067x;
        int i6 = a;
        int i7 = (i6 & 101) + (i6 | 101);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 58 / 0;
        }
    }
}
