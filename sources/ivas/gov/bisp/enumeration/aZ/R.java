package ivas.gov.bisp.enumeration.aZ;

import android.security.keystore.KeyGenParameterSpec;
import ivas.gov.bisp.enumeration.aS.N;
import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class R implements N {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public static final /* synthetic */ int c = 0;
    public KeyStore d = new bhB().a;

    public static final class bhB {
        public KeyStore a;

        public bhB() throws Exception {
            this.a = null;
            int i = R.c;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                e = e;
                throw new IllegalStateException(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                throw new IllegalStateException(e);
            } catch (Exception e3) {
                throw e3;
            }
        }
    }

    @Override // ivas.gov.bisp.enumeration.aS.N
    public final z b(String str) {
        L l;
        synchronized (this) {
            l = new L(T.c("android-keystore://", str), this.d);
            byte[] bArrB = Q.b(10);
            byte[] bArr = new byte[0];
            if (!Arrays.equals(bArrB, l.e(l.b(bArrB, bArr), bArr))) {
                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
            }
        }
        return l;
    }

    @Override // ivas.gov.bisp.enumeration.aS.N
    public final boolean e(String str) {
        boolean zStartsWith;
        synchronized (this) {
            zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return zStartsWith;
    }

    public final boolean f(String str) {
        boolean zContainsAlias;
        synchronized (this) {
            String strC = T.c("android-keystore://", str);
            try {
                zContainsAlias = this.d.containsAlias(strC);
            } catch (NullPointerException unused) {
                try {
                    Thread.sleep(20L);
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.d = keyStore;
                    keyStore.load(null);
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                } catch (InterruptedException unused2) {
                }
                return this.d.containsAlias(strC);
            }
        }
        return zContainsAlias;
    }

    public static void c(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec.Builder keySize;
        String[] strArr;
        char c2;
        int i = 2 % 2;
        if (new R().f(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        int i2 = b + 75;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            T.c("android-keystore://", str);
            KeyGenerator.getInstance("AES", "AndroidKeyStore");
            throw null;
        }
        String strC = T.c("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(strC, 3);
        int i3 = a;
        int i4 = i3 ^ 107;
        int i5 = -(-((i3 & 107) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            keySize = builder.setKeySize(256);
            strArr = new String[0];
            c2 = 1;
        } else {
            keySize = builder.setKeySize(256);
            strArr = new String[1];
            c2 = 0;
        }
        int i7 = a;
        int i8 = ((i7 ^ 5) - (~(-(-((i7 & 5) << 1))))) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            strArr[c2] = "GCM";
        } else {
            strArr[c2] = "GCM";
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = keySize.setBlockModes(strArr).setEncryptionPaddings("NoPadding").build();
        int i9 = a;
        int i10 = ((i9 | 27) << 1) - (i9 ^ 27);
        b = i10 % 128;
        int i11 = i10 % 2;
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        int i12 = a + 98;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }
}
