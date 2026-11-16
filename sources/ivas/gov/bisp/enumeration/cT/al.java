package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.cP.InterfaceC0247v;

/* JADX INFO: loaded from: classes.dex */
public class al extends S {
    private static int a = 1;
    private static int b;
    public static final al c = new al();

    static {
        int i = a;
        int i2 = i & 93;
        int i3 = (i2 - (~(-(-((i ^ 93) | i2))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 94) + ((i2 & 94) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 & 30) + (i2 | 30)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return InterfaceC0247v.class;
        }
        throw null;
    }
}
