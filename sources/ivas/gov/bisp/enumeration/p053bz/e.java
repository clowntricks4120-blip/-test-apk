package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class e implements M {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<Cipher> c = new btw();
    public final SecretKeySpec d;
    public final int e;
    public final int f;

    public class btw extends ThreadLocal<Cipher> {
        private static int a = 0;
        private static int b = 1;

        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 80) + ((i2 & 80) << 1)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            try {
                Cipher cipher = (Cipher) J.f.c("AES/CTR/NoPadding");
                int i5 = a;
                int i6 = i5 & 35;
                int i7 = (~i6) & (i5 | 35);
                int i8 = -(-(i6 << 1));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i5 + 108;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    return cipher;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    static {
        int i = a;
        int i2 = i & 7;
        int i3 = (i ^ 7) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public e(byte[] bArr, int i) throws GeneralSecurityException {
        T.b(bArr.length);
        this.d = new SecretKeySpec(bArr, "AES");
        int blockSize = c.get().getBlockSize();
        this.f = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = (i2 | 115) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.e = i;
        int i9 = i7 + 7;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.M
    public final byte[] e(byte[] bArr) throws GeneralSecurityException {
        int i;
        byte[] bArr2;
        int i2 = 2 % 2;
        int i3 = a + 9;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int length = bArr.length;
        int i6 = this.e;
        if (length < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i7 = i4 | 39;
        int i8 = i7 << 1;
        int i9 = -(i7 & (~(i4 & 39)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr3 = new byte[i6];
        System.arraycopy(bArr, 0, bArr3, 0, i6);
        int i12 = a;
        int i13 = i12 + 41;
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int length2 = bArr.length;
            i = this.e;
            bArr2 = new byte[length2 >> i];
        } else {
            int length3 = bArr.length;
            i = this.e;
            int i14 = -i;
            bArr2 = new byte[(((~i14) & length3) | ((~length3) & i14)) + ((length3 & i14) << 1)];
        }
        int i15 = i;
        int i16 = i12 ^ 121;
        int i17 = (i12 & 121) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        int length4 = bArr.length;
        int i20 = -i15;
        f(bArr, i15, (((~i20) & length4) | ((~length4) & i20)) + ((length4 & i20) << 1), bArr2, 0, bArr3, false);
        int i21 = a;
        int i22 = i21 & 67;
        int i23 = ((((i21 ^ 67) | i22) << 1) - (~(-((i21 | 67) & (~i22))))) - 1;
        b = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 59 / 0;
        }
        return bArr2;
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.M
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 45;
        b = i4 % 128;
        int i5 = i4 % 2;
        int length2 = bArr.length;
        int i6 = this.e;
        int i7 = -i6;
        int i8 = -(((~i7) & Integer.MAX_VALUE) | (Integer.MIN_VALUE & i7));
        if (length2 > (((-2) | i8) << 1) - (i8 ^ (-2))) {
            StringBuilder sbW = j.w("plaintext length can not exceed ");
            sbW.append((-2) - ((-this.e) ^ Integer.MAX_VALUE));
            throw new GeneralSecurityException(sbW.toString());
        }
        int i9 = i3 ^ 41;
        int i10 = (i3 & 41) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        int length3 = bArr.length;
        int i13 = -(~(-i7));
        byte[] bArr2 = new byte[((length3 ^ i13) + ((length3 & i13) << 1)) - 1];
        byte[] bArrB = Q.b(i6);
        int i14 = b;
        int i15 = ((i14 | 113) << 1) - (i14 ^ 113);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            System.arraycopy(bArrB, 0, bArr2, 0, this.e);
            length = bArr.length;
            i = 1;
        } else {
            System.arraycopy(bArrB, 0, bArr2, 0, this.e);
            length = bArr.length;
            i = 0;
        }
        f(bArr, i, length, bArr2, this.e, bArrB, true);
        int i16 = b;
        int i17 = i16 & 67;
        int i18 = (((i16 ^ 67) | i17) << 1) - ((i16 | 67) & (~i17));
        a = i18 % 128;
        int i19 = i18 % 2;
        return bArr2;
    }

    public final void f(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher;
        byte[] bArr4;
        int i4 = 2 % 2;
        int i5 = b + 113;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            cipher = c.get();
            bArr4 = new byte[this.f];
            int i6 = 79 / 0;
        } else {
            cipher = c.get();
            bArr4 = new byte[this.f];
        }
        Cipher cipher2 = cipher;
        System.arraycopy(bArr3, 0, bArr4, 0, this.e);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        int i7 = b + 43;
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        if (z) {
            int i10 = i8 & 67;
            int i11 = (i8 ^ 67) | i10;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            cipher2.init(1, this.d, ivParameterSpec);
            int i14 = b + 83;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 / 2;
            }
        } else {
            cipher2.init(2, this.d, ivParameterSpec);
            int i16 = a;
            int i17 = i16 & 39;
            int i18 = ((i16 | 39) & (~i17)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        int iDoFinal = cipher2.doFinal(bArr, i, i2, bArr2, i3);
        int i20 = a;
        int i21 = (-2) - (((i20 ^ 26) + ((i20 & 26) << 1)) ^ (-1));
        b = i21 % 128;
        Object obj = null;
        if (i21 % 2 != 0) {
            throw null;
        }
        if (iDoFinal != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i22 = i20 & 113;
        int i23 = ((i20 ^ 113) | i22) << 1;
        int i24 = -((i20 | 113) & (~i22));
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        b = i25 % 128;
        if (i25 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
