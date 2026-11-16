package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0036n;
import ivas.gov.bisp.enumeration.aS.R;
import ivas.gov.bisp.enumeration.p029bb.C0132m;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static int a = 1;
    private static int b;

    static {
        new e();
        new z();
        new P();
        new C0082p();
        new u();
        new a();
        new t();
        new o();
        int i = C0036n.CONFIG_NAME_FIELD_NUMBER;
        int i2 = a;
        int i3 = ((i2 ^ 4) + ((i2 & 4) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            b();
            int i5 = a;
            int i6 = ((i5 | 73) << 1) - (i5 ^ 73);
            b = i6 % 128;
            int i7 = i6 % 2;
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void b() throws Exception {
        boolean z;
        int i = 2 % 2;
        C0132m.b();
        R.g(new e(), true);
        R.g(new C0082p(), true);
        z zVar = new z();
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (i2 | 87) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        try {
            if (i6 % 2 == 0) {
                R.g(zVar, true);
                try {
                    Cipher.getInstance("AES/GCM-SIV/NoPadding");
                    z = false;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                R.g(zVar, true);
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                z = true;
            }
            if (z) {
                R.g(new P(), true);
                int i7 = a;
                int i8 = i7 & 25;
                int i9 = ((i7 ^ 25) | i8) << 1;
                int i10 = -((i7 | 25) & (~i8));
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        R.g(new t(), true);
        R.g(new u(), true);
        R.g(new a(), true);
        R.g(new o(), true);
        R.i(new r());
        int i13 = b;
        int i14 = i13 & 27;
        int i15 = i14 + ((i13 ^ 27) | i14);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 39 / 0;
        }
    }
}
