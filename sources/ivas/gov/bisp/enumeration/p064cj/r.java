package ivas.gov.bisp.enumeration.p064cj;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: loaded from: classes.dex */
public final class r implements PrivilegedAction {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;

    public r(String str) {
        this.c = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 37) << 1) - (((~i2) & 37) | (i2 & (-38)));
        a = i3 % 128;
        int i4 = i3 % 2;
        String property = Security.getProperty(this.c);
        int i5 = b;
        int i6 = ((i5 & 90) + (i5 | 90)) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return property;
    }
}
