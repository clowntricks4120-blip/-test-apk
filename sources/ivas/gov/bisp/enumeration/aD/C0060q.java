package ivas.gov.bisp.enumeration.aD;

import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060q {
    private static int a = 1;
    private static int b;
    public static final X c;
    public static final X d;

    static {
        X x;
        try {
            Constructor<?> declaredConstructor = Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]);
            int i = b;
            int i2 = i ^ 23;
            int i3 = (i & 23) << 1;
            int i4 = (i2 & i3) + (i3 | i2);
            a = i4 % 128;
            x = i4 % 2 == 0 ? (X) declaredConstructor.newInstance(new Object[0]) : (X) declaredConstructor.newInstance(new Object[0]);
            int i5 = a + 63;
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (Exception unused) {
            x = null;
        }
        c = x;
        d = new Y();
        int i8 = a;
        int i9 = ((i8 & (-90)) | ((~i8) & 89)) + ((i8 & 89) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
    }
}
