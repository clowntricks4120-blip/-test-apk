package ivas.gov.bisp.enumeration.aD;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    private static int a = 1;
    private static int b;
    public static final ai c;
    public static final ai d;

    static {
        ai aiVar;
        try {
            Constructor<?> declaredConstructor = Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]);
            int i = b;
            int i2 = ((i ^ 82) + ((i & 82) << 1)) - 1;
            a = i2 % 128;
            int i3 = i2 % 2;
            aiVar = (ai) declaredConstructor.newInstance(new Object[0]);
            int i4 = a;
            int i5 = (i4 ^ 23) + ((i4 & 23) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (Exception unused) {
            aiVar = null;
        }
        c = aiVar;
        d = new ae();
        int i8 = b;
        int i9 = (((i8 ^ 123) | (i8 & 123)) << 1) - (((~i8) & 123) | (i8 & (-124)));
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 13 / 0;
        }
    }
}
