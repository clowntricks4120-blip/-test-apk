package ivas.gov.bisp.enumeration.aY;

import ivas.gov.bisp.enumeration.aC.C0036n;
import ivas.gov.bisp.enumeration.aS.R;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ int c = 0;

    static {
        new O();
        int i = C0036n.CONFIG_NAME_FIELD_NUMBER;
        try {
            try {
                R.g(new O(), true);
                T t = new T();
                int i2 = a + 73;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    R.i(t);
                    Object obj = null;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                R.i(t);
                int i3 = a;
                int i4 = (i3 & (-106)) | ((~i3) & 105);
                int i5 = -(-((i3 & 105) << 1));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 0;
                }
            } catch (ClassCastException e) {
                throw e;
            }
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
