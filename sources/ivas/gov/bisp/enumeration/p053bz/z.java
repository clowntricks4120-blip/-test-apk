package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.aS.InterfaceC0081t;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC0081t {
    private static int a = 0;
    private static int b = 1;
    public static final Collection<Integer> c;
    public static final byte[] d;
    public static final byte[] e;
    public final N f;
    public final byte[] g;

    static {
        List listAsList = Arrays.asList(64);
        int i = a;
        int i2 = i & 59;
        int i3 = (i | 59) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            c = listAsList;
            d = new byte[49];
            e = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        } else {
            c = listAsList;
            d = new byte[16];
            e = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        }
    }

    public z(byte[] bArr) throws InvalidKeyException {
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(j.s(j.w("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.g = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        N n = new N(bArrCopyOfRange);
        int i = b;
        int i2 = (((i | 51) << 1) - (~(-(i ^ 51)))) - 1;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f = n;
            obj.hashCode();
            throw null;
        }
        this.f = n;
        int i3 = i + 27;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090 A[SYNTHETIC] */
    public final byte[] f(byte[]... bArr) {
        byte[] bArrAl;
        int i;
        byte b2;
        byte[] bArr2;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 125) + ((i4 & 125) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int length = bArr.length;
            throw null;
        }
        int i6 = 0;
        if (bArr.length == 0) {
            byte[] bArrB = this.f.b(e, 16);
            int i7 = a;
            int i8 = (i7 ^ 63) + ((i7 & 63) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 9 / 0;
            }
            return bArrB;
        }
        byte[] bArrB2 = this.f.b(d, 16);
        int i10 = a;
        int i11 = i10 & 91;
        int i12 = ((i10 | 91) & (~i11)) + (i11 << 1);
        b = i12 % 128;
        int i13 = i12 % 2 == 0 ? 1 : 0;
        while (i13 < bArr.length - 1) {
            int i14 = b;
            int i15 = i14 + 11;
            int i16 = i15 % 128;
            a = i16;
            if (i15 % 2 != 0) {
                int i17 = 32 / 0;
                if (bArr[i13] == null) {
                    bArr2 = new byte[0];
                    int i18 = ((i14 & 16) + (i14 | 16)) - 1;
                    a = i18 % 128;
                    int i19 = i18 % 2;
                } else {
                    bArr2 = bArr[i13];
                    int i20 = i16 & 29;
                    int i21 = (i16 | 29) & (~i20);
                    int i22 = i20 << 1;
                    i2 = (i21 & i22) + (i22 | i21);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i23 = 4 % 2;
                    }
                }
            } else if (bArr[i13] == null) {
                bArr2 = new byte[0];
                int i110 = ((i14 & 16) + (i14 | 16)) - 1;
                a = i110 % 128;
                int i111 = i110 % 2;
            } else {
                bArr2 = bArr[i13];
                int i24 = i16 & 29;
                int i25 = (i16 | 29) & (~i24);
                int i26 = i24 << 1;
                i2 = (i25 & i26) + (i26 | i25);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i27 = 4 % 2;
                }
            }
            byte[] bArrJ = i.j(bArrB2);
            byte[] bArrB3 = this.f.b(bArr2, 16);
            int i28 = a;
            int i29 = i28 & 13;
            int i30 = (i28 | 13) & (~i29);
            int i31 = i29 << 1;
            int i32 = (i30 & i31) + (i30 | i31);
            b = i32 % 128;
            int i33 = i32 % 2;
            bArrB2 = r.al(bArrJ, bArrB3);
            i13 = (i13 | 1) + (i13 & 1);
            int i34 = a;
            int i35 = ((i34 | 27) << 1) - (i34 ^ 27);
            b = i35 % 128;
            int i36 = i35 % 2;
        }
        int length2 = bArr.length;
        int i37 = ~length2;
        int i38 = -(-(length2 << 1));
        byte[] bArr3 = bArr[(i37 & i38) + (i38 | i37)];
        if (bArr3.length >= 16) {
            int i39 = a;
            int i40 = i39 | 9;
            int i41 = i40 << 1;
            int i42 = -((~(9 & i39)) & i40);
            int i43 = (i41 & i42) + (i42 | i41);
            int i44 = i43 % 128;
            b = i44;
            int i45 = i43 % 2;
            if (bArr3.length < bArrB2.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i46 = ((i44 | 43) << 1) - (i44 ^ 43);
            a = i46 % 128;
            int i47 = i46 % 2;
            int length3 = bArr3.length;
            int length4 = bArrB2.length;
            int length5 = bArr3.length;
            int i48 = ((i44 | 72) << 1) - (i44 ^ 72);
            int i49 = (i48 ^ (-1)) + (i48 << 1);
            a = i49 % 128;
            int i50 = i49 % 2;
            bArrAl = Arrays.copyOf(bArr3, length5);
            int i51 = a;
            int i52 = i51 & 119;
            int i53 = ((i51 ^ 119) | i52) << 1;
            int i54 = -((i51 | 119) & (~i52));
            int i55 = (i53 & i54) + (i54 | i53);
            b = i55 % 128;
            int i56 = i55 % 2;
            while (i6 < bArrB2.length) {
                int i57 = b;
                int i58 = (-2) - (((i57 & 88) + (i57 | 88)) ^ (-1));
                int i59 = i58 % 128;
                a = i59;
                if (i58 % 2 != 0) {
                    i = (length3 >>> length4) << i6;
                    b2 = bArrAl[i];
                } else {
                    int i60 = (length3 - (~(-(~(-length4))))) - 2;
                    int i61 = i60 ^ i6;
                    int i62 = ((i60 & i6) | i61) << 1;
                    int i63 = -i61;
                    i = (i62 | i63) + (i62 & i63);
                    b2 = bArrAl[i];
                }
                int i64 = ((i59 | 119) << 1) - (i59 ^ 119);
                b = i64 % 128;
                if (i64 % 2 == 0) {
                    byte b3 = bArrB2[i6];
                    int i65 = b2 & b3;
                    bArrAl[i] = (byte) (((b2 ^ b3) | i65) & (~i65));
                    int i66 = (((i6 ^ 133) | (i6 & 133)) << 1) - (((~i6) & 133) | (i6 & (-134)));
                    i6 = ((i66 & (-96)) + (i66 | (-96))) - 1;
                } else {
                    byte b4 = bArrB2[i6];
                    bArrAl[i] = (byte) ((b2 | b4) & (~(b2 & b4)));
                    int i67 = (((i6 | (-52)) << 1) - (i6 ^ (-52))) - 1;
                    int i68 = i67 & 54;
                    i6 = (((i67 ^ 54) | i68) << 1) - ((i67 | 54) & (~i68));
                }
                int i69 = (-2) - ((((i59 | 104) << 1) - (i59 ^ 104)) ^ (-1));
                b = i69 % 128;
                if (i69 % 2 == 0) {
                    int i70 = 5 % 2;
                }
            }
        } else {
            bArrAl = r.al(i.h(bArr3), i.j(bArrB2));
            int i71 = a + 89;
            b = i71 % 128;
            int i72 = i71 % 2;
        }
        byte[] bArrB4 = this.f.b(bArrAl, 16);
        int i73 = a;
        int i74 = ((i73 ^ 105) | (i73 & 105)) << 1;
        int i75 = -(((~i73) & 105) | (i73 & (-106)));
        int i76 = (i74 & i75) + (i75 | i74);
        b = i76 % 128;
        int i77 = i76 % 2;
        return bArrB4;
    }

    @Override // ivas.gov.bisp.enumeration.aS.InterfaceC0081t
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher;
        byte[][] bArr3;
        byte b2;
        char c2;
        byte b3;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = i2 | 83;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int length = bArr.length;
            throw null;
        }
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i6 = i2 + 15;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            cipher = (Cipher) J.f.c("AES/CTR/NoPadding");
            bArr3 = new byte[3][];
        } else {
            cipher = (Cipher) J.f.c("AES/CTR/NoPadding");
            bArr3 = new byte[2][];
        }
        int i7 = a;
        int i8 = (i7 | 81) << 1;
        int i9 = -(((~i7) & 81) | (i7 & (-82)));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            bArr3[0] = bArr2;
            bArr3[1] = bArr;
        } else {
            bArr3[0] = bArr2;
            bArr3[1] = bArr;
        }
        byte[] bArrF = f(bArr3);
        byte[] bArr4 = (byte[]) bArrF.clone();
        int i11 = a;
        int i12 = i11 & 19;
        int i13 = -(-((i11 ^ 19) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            byte b4 = bArr4[8];
            bArr4[8] = (byte) (((~b4) & 104) ^ (b4 & (-105)));
            b3 = bArr4[103];
            c2 = '@';
            b2 = 98;
        } else {
            b2 = 127;
            bArr4[8] = (byte) (bArr4[8] & 127);
            c2 = '\f';
            b3 = bArr4[12];
        }
        bArr4[c2] = (byte) (b3 & b2);
        cipher.init(1, new SecretKeySpec(this.g, "AES"), new IvParameterSpec(bArr4));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        int i15 = a;
        int i16 = i15 & 87;
        int i17 = (i15 | 87) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        int i20 = i19 % 2;
        byte[] bArrM = r.m(bArrF, bArrDoFinal);
        int i21 = a;
        int i22 = i21 ^ 37;
        int i23 = -(-((i21 & 37) << 1));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        b = i24 % 128;
        int i25 = i24 % 2;
        return bArrM;
    }

    @Override // ivas.gov.bisp.enumeration.aS.InterfaceC0081t
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        char c2;
        byte b2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 118) + (i2 | 118)) - 1;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0 ? bArr.length < 16 : bArr.length < 108) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        int i5 = i4 & 89;
        int i6 = (i4 ^ 89) | i5;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        Cipher cipher = (Cipher) J.f.c("AES/CTR/NoPadding");
        int i9 = a;
        int i10 = ((i9 | 123) << 1) - (i9 ^ 123);
        b = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        int i12 = b;
        int i13 = ((i12 & 24) + (i12 | 24)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        byte b3 = (byte) (bArr3[8] & 127);
        int i15 = i12 + 95;
        a = i15 % 128;
        if (i15 % 2 != 0) {
            bArr3[8] = b3;
            byte b4 = bArr3[13];
            int i16 = b4 & 91;
            b2 = (byte) (((b4 ^ 91) | i16) & (~i16));
            c2 = '-';
        } else {
            bArr3[8] = b3;
            c2 = '\f';
            b2 = (byte) (bArr3[12] & 127);
        }
        bArr3[c2] = b2;
        cipher.init(2, new SecretKeySpec(this.g, "AES"), new IvParameterSpec(bArr3));
        int i17 = b;
        int i18 = i17 & 7;
        int i19 = (i18 - (~((i17 ^ 7) | i18))) - 1;
        a = i19 % 128;
        int i20 = i19 % 2;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        int i21 = a;
        int i22 = (i21 ^ 31) + ((i21 & 31) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        if (bArrCopyOfRange2.length == 0) {
            int i24 = i21 + 63;
            b = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
            if (bArrDoFinal == null && r.R()) {
                int i25 = b;
                int i26 = (i25 & 121) + (i25 | 121);
                a = i26 % 128;
                int i27 = i26 % 2;
                bArrDoFinal = new byte[0];
                int i28 = (((i25 | 100) << 1) - (i25 ^ 100)) - 1;
                a = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        byte[][] bArr4 = {bArr2, bArrDoFinal};
        int i30 = b;
        int i31 = (((i30 & (-8)) | ((~i30) & 7)) - (~((i30 & 7) << 1))) - 1;
        a = i31 % 128;
        if (i31 % 2 != 0) {
            r.C(bArrCopyOfRange, f(bArr4));
            throw null;
        }
        if (!r.C(bArrCopyOfRange, f(bArr4))) {
            throw new AEADBadTagException("Integrity check failed.");
        }
        int i32 = b;
        int i33 = ((i32 & (-36)) | ((~i32) & 35)) + ((i32 & 35) << 1);
        a = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 91 / 0;
        }
        return bArrDoFinal;
    }
}
