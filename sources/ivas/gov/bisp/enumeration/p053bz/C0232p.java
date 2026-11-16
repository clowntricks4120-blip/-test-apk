package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.aS.z;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bz.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0232p implements z {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<Cipher> c = new btB();
    public final SecretKey d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bz.p$btB */
    public class btB extends ThreadLocal<Cipher> {
        private static int a = 1;
        private static int b;

        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            Cipher cipher;
            int i = 2 % 2;
            int i2 = b + 111;
            a = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    cipher = (Cipher) J.f.c("AES/GCM/NoPadding");
                    int i3 = 28 / 0;
                } else {
                    cipher = (Cipher) J.f.c("AES/GCM/NoPadding");
                }
                return cipher;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    static {
        int i = a;
        int i2 = ((i ^ 31) | (i & 31)) << 1;
        int i3 = -(((~i) & 31) | (i & (-32)));
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public C0232p(byte[] bArr) throws InvalidAlgorithmParameterException {
        T.b(bArr.length);
        this.d = new SecretKeySpec(bArr, "AES");
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (((i2 ^ 25) | i3) << 1) - ((~i3) & (i2 | 25));
        b = i4 % 128;
        int i5 = i4 % 2;
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i6 = i2 ^ 15;
        int i7 = ((i2 & 15) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = c;
        Cipher cipher = threadLocal.get();
        int i11 = a;
        int i12 = i11 & 81;
        int i13 = (i12 - (~((i11 ^ 81) | i12))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        cipher.init(2, this.d, algorithmParameterSpecC);
        if (bArr2 != null) {
            int i15 = a + 105;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            if (bArr2.length != 0) {
                int i18 = (i16 & 7) + (i16 | 7);
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    threadLocal.get().updateAAD(bArr2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                threadLocal.get().updateAAD(bArr2);
                int i19 = b;
                int i20 = ((i19 ^ 77) | (i19 & 77)) << 1;
                int i21 = -(((~i19) & 77) | (i19 & (-78)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                a = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 5 / 2;
                }
            }
        }
        Cipher cipher2 = threadLocal.get();
        int length = bArr.length;
        int i24 = a + 65;
        b = i24 % 128;
        int i25 = i24 % 2;
        byte[] bArrDoFinal = cipher2.doFinal(bArr, 12, (length & (-12)) + (length | (-12)));
        int i26 = a + 29;
        b = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 46 / 0;
        }
        return bArrDoFinal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r1 <= 19) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.spec.AlgorithmParameterSpec c(byte[] r5, int r6, int r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p053bz.C0232p.b
            r2 = r1 ^ 91
            r1 = r1 & 91
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p053bz.C0232p.a = r1
            int r2 = r2 % r0
            boolean r1 = ivas.gov.bisp.enumeration.p100w.r.R()
            if (r1 == 0) goto L72
            int r1 = ivas.gov.bisp.enumeration.p053bz.C0232p.b
            r2 = r1 & 63
            int r3 = ~r2
            r1 = r1 | 63
            r1 = r1 & r3
            int r2 = r2 << 1
            int r1 = r1 + r2
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p053bz.C0232p.a = r2
            int r1 = r1 % r0
            java.lang.String r2 = "SDK_INT"
            java.lang.String r3 = "android.os.Build$VERSION"
            r4 = 0
            if (r1 == 0) goto L48
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L56
            int r1 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L56
            int r2 = ivas.gov.bisp.enumeration.p053bz.C0232p.b
            int r2 = r2 + 7
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p053bz.C0232p.a = r3
            int r2 = r2 % r0
            r2 = 19
            if (r1 > r2) goto L72
            goto L56
        L48:
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L56 java.lang.Throwable -> L56
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L56 java.lang.Throwable -> L56
            r1.getInt(r4)     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L56 java.lang.Throwable -> L56
            throw r4     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L56 java.lang.Throwable -> L56 java.lang.Throwable -> L56
        L54:
            r5 = move-exception
            throw r5
        L56:
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r5, r6, r7)
            int r5 = ivas.gov.bisp.enumeration.p053bz.C0232p.a
            r6 = r5 & 43
            r5 = r5 ^ 43
            r5 = r5 | r6
            int r5 = ~r5
            int r6 = r6 - r5
            int r6 = r6 + (-1)
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.p053bz.C0232p.b = r5
            int r6 = r6 % r0
            if (r6 != 0) goto L6e
            return r1
        L6e:
            r4.hashCode()
            throw r4
        L72:
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2, r5, r6, r7)
            int r5 = ivas.gov.bisp.enumeration.p053bz.C0232p.a
            int r5 = r5 + 17
            int r6 = r5 % 128
            ivas.gov.bisp.enumeration.p053bz.C0232p.b = r6
            int r5 = r5 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p053bz.C0232p.c(byte[], int, int):java.security.spec.AlgorithmParameterSpec");
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int iDoFinal;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 125) << 1) - (i3 ^ 125);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i7 = i5 + 37;
        b = i7 % 128;
        int i8 = i7 % 2;
        int length = bArr.length;
        int i9 = ((length & 12) - (~(length | 12))) - 1;
        int i10 = i9 ^ 16;
        int i11 = ((i9 & 16) | i10) << 1;
        int i12 = -i10;
        byte[] bArr3 = new byte[(i11 ^ i12) + ((i12 & i11) << 1)];
        byte[] bArrB = Q.b(12);
        int i13 = b;
        int i14 = i13 ^ 105;
        int i15 = (((i13 & 105) | i14) << 1) - i14;
        a = i15 % 128;
        if (i15 % 2 == 0) {
            System.arraycopy(bArrB, 0, bArr3, 0, 67);
            i = 1;
        } else {
            System.arraycopy(bArrB, 0, bArr3, 0, 12);
            i = 0;
        }
        int i16 = a;
        int i17 = (-2) - ((((i16 | 82) << 1) - (i16 ^ 82)) ^ (-1));
        b = i17 % 128;
        int i18 = i17 % 2;
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrB, i, bArrB.length);
        ThreadLocal<Cipher> threadLocal = c;
        Cipher cipher = threadLocal.get();
        int i19 = a + 40;
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        cipher.init(1, this.d, algorithmParameterSpecC);
        if (bArr2 != null) {
            int i22 = a;
            int i23 = i22 + 25;
            b = i23 % 128;
            int i24 = i23 % 2;
            if (bArr2.length != 0) {
                int i25 = (i22 & 45) + (i22 | 45);
                b = i25 % 128;
                int i26 = i25 % 2;
                threadLocal.get().updateAAD(bArr2);
                int i27 = a + 91;
                b = i27 % 128;
                int i28 = i27 % 2;
            }
        }
        Cipher cipher2 = threadLocal.get();
        int length2 = bArr.length;
        int i29 = b;
        int i30 = i29 & 97;
        int i31 = (((i29 | 97) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
        a = i31 % 128;
        if (i31 % 2 != 0 ? (iDoFinal = cipher2.doFinal(bArr, 0, length2, bArr3, 12)) != (-2) - ((bArr.length + 17) ^ (-1)) : (iDoFinal = cipher2.doFinal(bArr, 0, length2, bArr3, 12)) != (bArr.length >> 88)) {
            int i32 = -(~(-bArr.length));
            int i33 = ((iDoFinal | i32) << 1) - (iDoFinal ^ i32);
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf((i33 ^ (-1)) + (i33 << 1))));
        }
        int i34 = a;
        int i35 = i34 & 73;
        int i36 = ((i34 | 73) & (~i35)) + (i35 << 1);
        b = i36 % 128;
        if (i36 % 2 == 0) {
            return bArr3;
        }
        throw null;
    }
}
