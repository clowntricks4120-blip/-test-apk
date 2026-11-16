package ivas.gov.bisp.enumeration.p029bb;

import ivas.gov.bisp.enumeration.aC.C0036n;
import ivas.gov.bisp.enumeration.aS.R;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bb.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0132m {
    private static int a = 0;
    private static int b = 1;

    static {
        new N();
        int i = C0036n.CONFIG_NAME_FIELD_NUMBER;
        try {
            b();
            int i2 = a;
            int i3 = ((i2 & 98) + (i2 | 98)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void b() {
        int i = 2 % 2;
        R.g(new N(), true);
        R.g(new M(), true);
        R.i(new O());
        int i2 = a;
        int i3 = ((i2 ^ 107) - (~(-(-((i2 & 107) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
    }
}
