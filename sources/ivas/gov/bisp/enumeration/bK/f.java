package ivas.gov.bisp.enumeration.bK;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public class f {
    private static int a = 1;
    private static int b;

    public static PublicKey d() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 88) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            int i4 = b;
            int i5 = i4 & 109;
            int i6 = (i4 | 109) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            publicKey = keyStore.getCertificate("chacha)chui").getPublicKey();
            int i10 = a;
            int i11 = i10 & 45;
            int i12 = ((i10 ^ 45) | i11) << 1;
            int i13 = -((i10 | 45) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            int i15 = i14 % 2;
        } catch (Exception unused) {
        }
        int i16 = a;
        int i17 = i16 & 105;
        int i18 = (((i16 | 105) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
        b = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 41 / 0;
        }
        return publicKey;
    }

    public static String b(String str) {
        PrivateKey privateKey;
        Cipher cipher;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 65) | (i2 & 65)) << 1;
        int i4 = -(((~i2) & 65) | (i2 & (-66)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            int i7 = b;
            int i8 = i7 & 85;
            int i9 = i8 + ((i7 ^ 85) | i8);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                privateKey = (PrivateKey) keyStore.getKey("chacha)chui", null);
                cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                int i10 = 4 / 0;
            } else {
                privateKey = (PrivateKey) keyStore.getKey("chacha)chui", null);
                cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            }
            cipher.init(2, privateKey);
            String str2 = new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
            int i11 = a + 111;
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 63 / 0;
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static KeyPair c() {
        int i = 2 % 2;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("chacha)chui", 3);
            int i2 = b + 121;
            a = i2 % 128;
            int i3 = i2 % 2;
            KeyGenParameterSpec.Builder blockModes = builder.setBlockModes("ECB");
            int i4 = b;
            int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            KeyGenParameterSpec.Builder encryptionPaddings = blockModes.setEncryptionPaddings("PKCS1Padding");
            int i7 = a;
            int i8 = (i7 | 13) << 1;
            int i9 = -(((~i7) & 13) | (i7 & (-14)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            keyPairGenerator.initialize(i10 % 2 != 0 ? encryptionPaddings.setRandomizedEncryptionRequired(false).build() : encryptionPaddings.setRandomizedEncryptionRequired(false).build());
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            int i11 = b + 103;
            a = i11 % 128;
            int i12 = i11 % 2;
            return keyPairGenerateKeyPair;
        } catch (Exception unused) {
            return null;
        }
    }
}
