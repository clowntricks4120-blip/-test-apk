package ivas.gov.bisp.enumeration.aX;

import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.p053bz.J;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class x implements z {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<Cipher> c = new bht();
    public final SecretKey d;

    public class bht extends ThreadLocal<Cipher> {
        private static int a = 0;
        private static int b = 1;

        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 7;
            int i4 = ((i2 ^ 7) | i3) << 1;
            int i5 = -((i2 | 7) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            try {
                Cipher cipher = (Cipher) J.f.c("AES/GCM-SIV/NoPadding");
                int i8 = b;
                int i9 = i8 + 9;
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 & 19;
                int i12 = (((i8 ^ 19) | i11) << 1) - ((i8 | 19) & (~i11));
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 / 0;
                }
                return cipher;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    static {
        int i = b;
        int i2 = i & 83;
        int i3 = -(-((i ^ 83) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    public x(byte[] bArr) throws InvalidAlgorithmParameterException {
        T.b(bArr.length);
        this.d = new SecretKeySpec(bArr, "AES");
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 113;
        int i4 = ((i2 & 113) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i9 = i7 + 92;
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        AlgorithmParameterSpec algorithmParameterSpecC = i10 % 2 == 0 ? c(bArr, 1, 120) : c(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = c;
        Cipher cipher = threadLocal.get();
        SecretKey secretKey = this.d;
        int i11 = b + 43;
        a = i11 % 128;
        Object obj = null;
        if (i11 % 2 == 0) {
            cipher.init(2, secretKey, algorithmParameterSpecC);
            throw null;
        }
        cipher.init(2, secretKey, algorithmParameterSpecC);
        if (bArr2 != null) {
            int i12 = b;
            int i13 = i12 + 57;
            a = i13 % 128;
            int i14 = i13 % 2;
            if (bArr2.length != 0) {
                int i15 = (-2) - ((i12 + 70) ^ (-1));
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    threadLocal.get().updateAAD(bArr2);
                    int i16 = 31 / 0;
                } else {
                    threadLocal.get().updateAAD(bArr2);
                }
                int i17 = a;
                int i18 = (((i17 ^ 19) | (i17 & 19)) << 1) - (((~i17) & 19) | (i17 & (-20)));
                b = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        Cipher cipher2 = threadLocal.get();
        int length = bArr.length;
        int i20 = b;
        int i21 = (-2) - (((i20 ^ 64) + ((i20 & 64) << 1)) ^ (-1));
        a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = length & (-12);
        byte[] bArrDoFinal = cipher2.doFinal(bArr, 12, (i23 - (~(-(-((length ^ (-12)) | i23))))) - 1);
        int i24 = b;
        int i25 = i24 ^ 41;
        int i26 = -(-((i24 & 41) << 1));
        int i27 = (i25 & i26) + (i26 | i25);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            return bArrDoFinal;
        }
        obj.hashCode();
        throw null;
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        int i3 = 2 % 2;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, i, i2);
            int i4 = b;
            int i5 = i4 & 27;
            int i6 = i5 + ((i4 ^ 27) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i4 | 7) << 1) - (i4 ^ 7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return gCMParameterSpec;
            }
            throw null;
        } catch (ClassNotFoundException unused) {
            if (!r.R()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr, i, i2);
            int i9 = b + 73;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 62 / 0;
            }
            return ivParameterSpec;
        }
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrB;
        Cipher cipher;
        SecretKey secretKey;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 89) + (i3 | 89);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int length = bArr.length;
            throw null;
        }
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i5 = i3 + 110;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int length2 = bArr.length;
        int i8 = length2 & 12;
        int i9 = (((length2 | 12) & (~i8)) - (~(i8 << 1))) - 1;
        int i10 = i9 & 16;
        int i11 = -(-((i9 ^ 16) | i10));
        byte[] bArr3 = new byte[((i10 | i11) << 1) - (i11 ^ i10)];
        int i12 = (((i3 & (-38)) | ((~i3) & 37)) - (~((i3 & 37) << 1))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            bArrB = Q.b(12);
            System.arraycopy(bArrB, 1, bArr3, 0, 122);
        } else {
            bArrB = Q.b(12);
            System.arraycopy(bArrB, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrB, 0, bArrB.length);
        ThreadLocal<Cipher> threadLocal = c;
        int i13 = a;
        int i14 = (((i13 & (-10)) | ((~i13) & 9)) - (~(-(-((i13 & 9) << 1))))) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            cipher = threadLocal.get();
            secretKey = this.d;
            i = 0;
        } else {
            cipher = threadLocal.get();
            secretKey = this.d;
            i = 1;
        }
        int i15 = a;
        int i16 = i15 & 119;
        int i17 = (~i16) & (i15 | 119);
        int i18 = i16 << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        b = i19 % 128;
        if (i19 % 2 != 0) {
            cipher.init(i, secretKey, algorithmParameterSpecC);
            throw null;
        }
        cipher.init(i, secretKey, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            int i20 = a;
            int i21 = (i20 & 84) + (i20 | 84);
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            b = i22 % 128;
            if (i22 % 2 != 0) {
                threadLocal.get().updateAAD(bArr2);
                obj.hashCode();
                throw null;
            }
            threadLocal.get().updateAAD(bArr2);
            int i23 = a;
            int i24 = i23 | 3;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 3)) & i24);
            int i27 = (i25 & i26) + (i26 | i25);
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        Cipher cipher2 = threadLocal.get();
        int length3 = bArr.length;
        int i29 = a;
        int i30 = i29 & 21;
        int i31 = i30 + ((i29 ^ 21) | i30);
        b = i31 % 128;
        int i32 = i31 % 2;
        int iDoFinal = cipher2.doFinal(bArr, 0, length3, bArr3, 12);
        int length4 = bArr.length + 17;
        if (iDoFinal != (length4 ^ (-1)) + (length4 << 1)) {
            int length5 = bArr.length;
            int i33 = a;
            int i34 = ((i33 ^ 101) | (i33 & 101)) << 1;
            int i35 = -(((~i33) & 101) | (i33 & (-102)));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            b = i36 % 128;
            int i37 = i36 % 2;
            int i38 = -(~(-length5));
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(((iDoFinal & i38) + (iDoFinal | i38)) - 1)));
        }
        int i39 = a;
        int i40 = ((i39 ^ 43) - (~((i39 & 43) << 1))) - 1;
        int i41 = i40 % 128;
        b = i41;
        if (i40 % 2 != 0) {
            int i42 = 51 / 0;
        }
        int i43 = i41 + 109;
        a = i43 % 128;
        int i44 = i43 % 2;
        return bArr3;
    }
}
