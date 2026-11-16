package ivas.gov.bisp.enumeration.p034bg;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.p034bg.c
    public final void c(AccessibleObject accessibleObject) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = -(-(i2 | 111));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        accessibleObject.setAccessible(true);
        int i7 = a;
        int i8 = (i7 & 9) + (i7 | 9);
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
