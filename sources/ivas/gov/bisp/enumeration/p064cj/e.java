package ivas.gov.bisp.enumeration.p064cj;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
public final class e implements PrivilegedAction {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;

    public e(String str) {
        this.c = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = 2 % 2;
        int i2 = b + 126;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        String property = System.getProperty(this.c);
        int i5 = b;
        int i6 = i5 ^ 63;
        int i7 = -(-((i5 & 63) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return property;
    }
}
