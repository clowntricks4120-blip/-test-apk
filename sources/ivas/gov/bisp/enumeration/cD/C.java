package ivas.gov.bisp.enumeration.cD;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
public final class C implements PrivilegedAction {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ String c;

    public C(String str) {
        this.c = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = 2 % 2;
        int i2 = a + 39;
        b = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Class.forName(this.c);
                throw null;
            }
            Class<?> cls = Class.forName(this.c);
            int i3 = a;
            int i4 = i3 & 43;
            int i5 = -(-(i3 | 43));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return cls;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }
}
