package ivas.gov.bisp.enumeration.aZ;

import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class L implements z {
    private static int a = 1;
    private static int b;
    public final SecretKey c;

    public L(String str, KeyStore keyStore) throws InvalidKeyException {
        Object obj = null;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.c = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(j.r("Keystore cannot load the key with ID: ", str));
        }
        int i = b;
        int i2 = (i & 51) + (i | 51);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b + 81;
        a = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                g(bArr, bArr2);
                obj.hashCode();
                throw null;
            }
            byte[] bArrG = g(bArr, bArr2);
            int i3 = a;
            int i4 = (i3 | 13) << 1;
            int i5 = -(i3 ^ 13);
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return bArrG;
            }
            obj.hashCode();
            throw null;
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            byte[] bArrG2 = g(bArr, bArr2);
            int i7 = a;
            int i8 = (-2) - ((((i7 | 38) << 1) - (i7 ^ 38)) ^ (-1));
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 12 / 0;
            }
            return bArrG2;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            byte[] bArrF = f(bArr, bArr2);
            int i5 = b;
            int i6 = ((i5 ^ 126) + ((i5 & 126) << 1)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return bArrF;
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            byte[] bArrF2 = f(bArr, bArr2);
            int i8 = a;
            int i9 = i8 & 5;
            int i10 = ((((i8 ^ 5) | i9) << 1) - (~(-((i8 | 5) & (~i9))))) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 98 / 0;
            }
            return bArrF2;
        }
    }

    public final byte[] f(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 53;
        int i4 = (i2 & 53) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0 ? bArr.length < 28 : bArr.length < 43) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        int i6 = b + 49;
        a = i6 % 128;
        int i7 = i6 % 2;
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        int i8 = a;
        int i9 = i8 & 13;
        int i10 = -(-(i8 | 13));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            cipher.init(2, this.c, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            int i12 = 62 / 0;
        } else {
            cipher.init(2, this.c, gCMParameterSpec);
            cipher.updateAAD(bArr2);
        }
        int length = bArr.length;
        byte[] bArrDoFinal = cipher.doFinal(bArr, 12, (((length & 11) | ((~length) & (-12))) - (~(-(-((length & (-12)) << 1))))) - 1);
        int i13 = a;
        int i14 = (((i13 & (-112)) | ((~i13) & 111)) - (~((i13 & 111) << 1))) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 53 / 0;
        }
        return bArrDoFinal;
    }

    public final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = -(-(i2 | 3));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i8 = ((i6 | 109) << 1) - (i6 ^ 109);
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 != 0) {
            length = (bArr.length / 57) / 113;
        } else {
            int length2 = bArr.length;
            int i10 = length2 & 12;
            int i11 = length2 | 12;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            int i13 = i12 & 16;
            length = (((i12 ^ 16) | i13) << 1) - ((~i13) & (i12 | 16));
        }
        byte[] bArr3 = new byte[length];
        int i14 = i9 & 15;
        int i15 = i14 + ((i9 ^ 15) | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SecretKey secretKey = this.c;
        int i17 = b;
        int i18 = (i17 ^ 99) + ((i17 & 99) << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        cipher.init(1, secretKey);
        cipher.updateAAD(bArr2);
        int length3 = bArr.length;
        int i20 = b;
        int i21 = i20 & 99;
        int i22 = -(-((i20 ^ 99) | i21));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        cipher.doFinal(bArr, 0, length3, bArr3, 12);
        int i25 = a;
        int i26 = i25 ^ 1;
        int i27 = -(-((i25 & 1) << 1));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        b = i28 % 128;
        int i29 = i28 % 2;
        byte[] iv = cipher.getIV();
        int i30 = a;
        int i31 = i30 & 95;
        int i32 = i30 | 95;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        b = i33 % 128;
        if (i33 % 2 == 0) {
            System.arraycopy(iv, 0, bArr3, 0, 12);
            return bArr3;
        }
        System.arraycopy(iv, 0, bArr3, 0, 12);
        throw null;
    }
}
