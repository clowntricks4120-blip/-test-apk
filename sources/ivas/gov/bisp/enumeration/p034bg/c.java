package ivas.gov.bisp.enumeration.p034bg;

import ivas.gov.bisp.enumeration.p102y.a;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private static int a = 0;
    private static int b = 1;
    public static final c c;

    static {
        c hVar;
        if (a.c < 9) {
            hVar = new j();
            int i = a;
            int i2 = ((i & 36) + (i | 36)) - 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
            }
            c = hVar;
            int i3 = a + 41;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
        hVar = new h();
        int i5 = b;
        int i6 = (-2) - ((((i5 | 34) << 1) - (i5 ^ 34)) ^ (-1));
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 2 % 2;
        c = hVar;
        int i9 = a + 41;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    public abstract void c(AccessibleObject accessibleObject);
}
