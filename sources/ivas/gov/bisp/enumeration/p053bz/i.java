package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.aS.z;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class i implements z {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<Cipher> c;
    public static final ThreadLocal<Cipher> d = new bty();
    public final byte[] e;
    public final byte[] f;
    public final SecretKeySpec g;
    public final int h;

    public class bty extends ThreadLocal<Cipher> {
        private static int a = 1;
        private static int b;

        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 11) | (i2 & 11)) << 1;
            int i4 = -(((~i2) & 11) | (i2 & (-12)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    throw null;
                }
                Cipher cipher = (Cipher) J.f.c("AES/ECB/NOPADDING");
                int i6 = a + 27;
                b = i6 % 128;
                int i7 = i6 % 2;
                return cipher;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public class btz extends ThreadLocal<Cipher> {
        private static int a = 1;
        private static int b;

        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 33;
            int i4 = (i2 ^ 33) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            try {
                Cipher cipher = (Cipher) J.f.c("AES/CTR/NOPADDING");
                int i7 = a;
                int i8 = i7 & 87;
                int i9 = (i7 | 87) & (~i8);
                int i10 = -(-(i8 << 1));
                int i11 = (i9 & i10) + (i9 | i10);
                b = i11 % 128;
                int i12 = i11 % 2;
                return cipher;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    static {
        btz btzVar = new btz();
        int i = a;
        int i2 = ((i ^ 45) | (i & 45)) << 1;
        int i3 = -(((~i) & 45) | (i & (-46)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        c = btzVar;
        int i7 = i5 + 51;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public i(byte[] bArr, int i) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.h = i;
        T.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 16) + ((i2 & 16) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        this.g = secretKeySpec;
        Cipher cipher = d.get();
        int i5 = b;
        int i6 = i5 ^ 99;
        int i7 = (i5 & 99) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        cipher.init(1, secretKeySpec);
        byte[] bArrDoFinal = cipher.doFinal(new byte[16]);
        int i10 = a;
        int i11 = ((i10 ^ 54) + ((i10 & 54) << 1)) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            byte[] bArrC = c(bArrDoFinal);
            this.e = bArrC;
            this.f = c(bArrC);
        } else {
            byte[] bArrC2 = c(bArrDoFinal);
            this.e = bArrC2;
            this.f = c(bArrC2);
            int i12 = 46 / 0;
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 95;
        int i9 = ((~i8) & (i7 | 95)) + (i8 << 1);
        b = i9 % 128;
        int i10 = 0;
        if (i9 % 2 != 0) {
            bArr2 = new byte[6];
            i = 1;
        } else {
            bArr2 = new byte[16];
            i = 0;
        }
        int i11 = i7 & 39;
        int i12 = ((i7 ^ 39) | i11) << 1;
        int i13 = -((i7 | 39) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        while (i < 15) {
            int i16 = b;
            int i17 = i16 ^ 109;
            int i18 = (((i16 & 109) | i17) << 1) - i17;
            int i19 = i18 % 128;
            a = i19;
            if (i18 % 2 == 0) {
                i3 = bArr[i] / 0;
                i2 = i;
            } else {
                i2 = (((i | 2) << 1) - (i ^ 2)) - 1;
                i3 = bArr[i] << 1;
            }
            int i20 = i19 + 111;
            int i21 = i20 % 128;
            b = i21;
            if (i20 % 2 != 0) {
                i4 = i3 & ((bArr[i2] & 23960) * 127);
                i5 = 6671;
            } else {
                int i22 = (bArr[i2] & 255) >>> 7;
                int i23 = (~i22) & i3;
                int i24 = (~i3) & i22;
                i4 = (i24 & i23) | (i23 ^ i24);
                i5 = 255;
            }
            bArr2[i] = (byte) (i4 & i5);
            int i25 = i21 & 57;
            int i26 = (((i21 ^ 57) | i25) << 1) - ((~i25) & (i21 | 57));
            a = i26 % 128;
            int i27 = i26 % 2;
            i = i2;
        }
        byte b2 = bArr[15];
        if ((bArr[0] & 128) == 0) {
            int i28 = a;
            int i29 = i28 ^ 43;
            int i30 = ((i28 & 43) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 & i31) + (i30 | i31);
            int i33 = i32 % 128;
            b = i33;
            int i34 = i32 % 2;
            int i35 = i33 & 73;
            int i36 = (i33 ^ 73) | i35;
            int i37 = (i35 & i36) + (i36 | i35);
            a = i37 % 128;
            int i38 = i37 % 2;
        } else {
            int i39 = b;
            int i40 = (-2) - (((i39 ^ 10) + ((i39 & 10) << 1)) ^ (-1));
            a = i40 % 128;
            int i41 = i40 % 2;
            i10 = 135;
        }
        int i42 = b2 << 1;
        bArr2[15] = (byte) ((i42 | i10) & (~(i42 & i10)));
        int i43 = a;
        int i44 = (((i43 | 4) << 1) - (i43 ^ 4)) - 1;
        b = i44 % 128;
        int i45 = i44 % 2;
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 87;
        b = i3 % 128;
        int i4 = i3 % 2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i5 = (-2) - ((((i2 | 36) << 1) - (i2 ^ 36)) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < length) {
            int i8 = a;
            int i9 = i8 ^ 51;
            int i10 = ((i8 & 51) | i9) << 1;
            int i11 = -i9;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                byte b2 = bArr[i7];
                byte b3 = bArr2[i7];
                bArr3[i7] = (byte) ((b2 & b3) | (b2 ^ b3));
                i7 += 40;
            } else {
                byte b4 = bArr[i7];
                byte b5 = bArr2[i7];
                int i13 = (~b5) & b4;
                int i14 = (~b4) & b5;
                bArr3[i7] = (byte) ((i14 & i13) | (i13 ^ i14));
                int i15 = i7 & 28;
                int i16 = (i15 - (~(-(-((i7 ^ 28) | i15))))) - 1;
                i7 = ((i16 & (-26)) + (i16 | (-26))) - 1;
            }
        }
        int i17 = b;
        int i18 = ((i17 | 56) << 1) - (i17 ^ 56);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            return bArr3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0077 A[PHI: r4
  0x0077: PHI (r4v19 byte[]) = (r4v18 byte[]), (r4v32 byte[]) binds: [B:11:0x0075, B:7:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0086  */
    /* JADX WARN: Code duplicated, block: B:15:0x0089  */
    /* JADX WARN: Code duplicated, block: B:9:0x006b A[PHI: r4
  0x006b: PHI (r4v30 byte[]) = (r4v18 byte[]), (r4v32 byte[]) binds: [B:11:0x0075, B:7:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrG;
        int i;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 119) << 1;
        int i5 = -(i3 ^ 119);
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int length = bArr.length;
        int i9 = -this.h;
        int i10 = length & i9;
        int i11 = ((length ^ i9) | i10) << 1;
        int i12 = -((length | i9) & (~i10));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = (i13 ^ (-16)) + ((i13 & (-16)) << 1);
        if (i14 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i15 = i7 + 123;
        a = i15 % 128;
        int i16 = i15 % 2;
        Cipher cipher = d.get();
        cipher.init(1, this.g);
        int i17 = this.h;
        int i18 = b;
        int i19 = i18 & 111;
        int i20 = ((i18 ^ 111) | i19) << 1;
        int i21 = -((i18 | 111) & (~i19));
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        int i23 = 0;
        if (i22 % 2 == 0) {
            bArrG = g(cipher, 0, bArr, 0, i17);
            if (bArr2 == null) {
                int i24 = b;
                i = ((i24 | 113) << 1) - (i24 ^ 113);
                int i25 = i % 128;
                a = i25;
                if (i % 2 == 0) {
                    bArr3 = new byte[1];
                } else {
                    bArr3 = new byte[0];
                }
                int i26 = ((i25 | 39) << 1) - (i25 ^ 39);
                b = i26 % 128;
                int i27 = i26 % 2;
                bArr4 = bArrG;
                bArr5 = bArr3;
            } else {
                bArr5 = bArr2;
                bArr4 = bArrG;
            }
        } else {
            bArrG = g(cipher, 0, bArr, 0, i17);
            if (bArr2 == null) {
                int i28 = b;
                i = ((i28 | 113) << 1) - (i28 ^ 113);
                int i29 = i % 128;
                a = i29;
                if (i % 2 == 0) {
                    bArr3 = new byte[1];
                } else {
                    bArr3 = new byte[0];
                }
                int i210 = ((i29 | 39) << 1) - (i29 ^ 39);
                b = i210 % 128;
                int i211 = i210 % 2;
                bArr4 = bArrG;
                bArr5 = bArr3;
            } else {
                bArr5 = bArr2;
                bArr4 = bArrG;
            }
        }
        byte[] bArrG2 = g(cipher, 1, bArr5, 0, bArr5.length);
        int i30 = a;
        int i31 = (i30 ^ 116) + ((i30 & 116) << 1);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        b = i32 % 128;
        byte[] bArrG3 = i32 % 2 != 0 ? g(cipher, 2, bArr, this.h, i14) : g(cipher, 2, bArr, this.h, i14);
        int length2 = bArr.length;
        int i33 = b;
        int i34 = i33 & 55;
        int i35 = ((i33 ^ 55) | i34) << 1;
        int i36 = -((i33 | 55) & (~i34));
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        a = i37 % 128;
        int i38 = i37 % 2;
        byte b2 = 0;
        while (i23 < 16) {
            int i39 = a;
            int i40 = ((i39 ^ 27) | (i39 & 27)) << 1;
            int i41 = -(((~i39) & 27) | (i39 & (-28)));
            int i42 = (i40 & i41) + (i41 | i40);
            int i43 = i42 % 128;
            b = i43;
            int i44 = i42 % 2;
            int i45 = (-2) - ((((length2 | (-15)) << 1) - (length2 ^ (-15))) ^ (-1));
            int i46 = ~i23;
            byte b3 = bArr[((((i45 ^ i23) | (i45 & i23)) << 1) - (~(-(((~i45) & i23) | (i45 & i46))))) - 1];
            byte b4 = bArrG2[i23];
            int i47 = (~b4) & b3;
            int i48 = (~b3) & b4;
            int i49 = (i48 & i47) | (i47 ^ i48);
            int i50 = (i43 & 29) + (i43 | 29);
            a = i50 % 128;
            int i51 = i50 % 2;
            byte b5 = bArr4[i23];
            int i52 = ((~i49) & b5) | ((~b5) & i49);
            byte b6 = bArrG3[i23];
            int i53 = (~b6) & i52;
            int i54 = (~i52) & b6;
            int i55 = (i54 & i53) | (i53 ^ i54);
            int i56 = ((~i55) & b2) | ((~b2) & i55);
            int i57 = b2 & i55;
            b2 = (byte) ((i57 & i56) | (i56 ^ i57));
            int i58 = (i23 & (-45)) | (i46 & 44);
            int i59 = -(-((i23 & 44) << 1));
            int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
            int i61 = i60 & (-43);
            int i62 = (~i61) & (i60 | (-43));
            int i63 = -(-(i61 << 1));
            i23 = (i62 & i63) + (i63 | i62);
            int i64 = i43 + 74;
            int i65 = (i64 ^ (-1)) + (i64 << 1);
            a = i65 % 128;
            int i66 = i65 % 2;
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        int i67 = a;
        int i68 = i67 & 105;
        int i69 = (i68 - (~((i67 ^ 105) | i68))) - 1;
        b = i69 % 128;
        int i70 = i69 % 2;
        Cipher cipher2 = c.get();
        SecretKeySpec secretKeySpec = this.g;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        int i71 = b;
        int i72 = (i71 & 55) + (i71 | 55);
        a = i72 % 128;
        int i73 = i72 % 2;
        cipher2.init(1, secretKeySpec, ivParameterSpec);
        int i74 = this.h;
        int i75 = a;
        int i76 = (i75 & 89) + (i75 | 89);
        b = i76 % 128;
        int i77 = i76 % 2;
        byte[] bArrDoFinal = cipher2.doFinal(bArr, i74, i14);
        int i78 = a;
        int i79 = (i78 ^ 81) + ((i78 & 81) << 1);
        b = i79 % 128;
        if (i79 % 2 == 0) {
            return bArrDoFinal;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        r2 = r20.doFinal(r8);
        r7 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r8 = (((r7 | 40) << 1) - (r7 ^ 40)) - 1;
        ivas.gov.bisp.enumeration.p053bz.i.b = r8 % 128;
        r8 = r8 % 2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        r12 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if ((((r24 | r12) << 1) - (r24 ^ r12)) <= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r14 = (r13 ^ 43) + ((r13 & 43) << 1);
        ivas.gov.bisp.enumeration.p053bz.i.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if ((r14 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r7 = r13 & 23;
        r15 = (((r13 ^ 23) | r7) << 1) - ((~r7) & (r13 | 23));
        ivas.gov.bisp.enumeration.p053bz.i.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if ((r15 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        r7 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (r14 >= r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        r7 = ivas.gov.bisp.enumeration.p053bz.i.b + 41;
        r13 = r7 % 128;
        ivas.gov.bisp.enumeration.p053bz.i.a = r13;
        r7 = r7 % 2;
        r7 = r2[r14];
        r15 = -r12;
        r16 = (r23 & r15) + (r15 | r23);
        r15 = r13 & 37;
        r17 = (r13 ^ 37) | r15;
        r15 = ((r15 | r17) << 1) - (r15 ^ r17);
        ivas.gov.bisp.enumeration.p053bz.i.b = r15 % 128;
        r15 = r15 % 2;
        r10 = -(-r14);
        r15 = r16 & r10;
        r10 = (r16 | r10) & (~r15);
        r11 = -(-(r15 << 1));
        r10 = r22[(r10 & r11) + (r10 | r11)];
        r11 = (~r10) & r7;
        r7 = (~r7) & r10;
        r2[r14] = (byte) ((r7 & r11) | (r11 ^ r7));
        r14 = r14 + 1;
        r7 = (r13 ^ 19) + ((r13 & 19) << 1);
        ivas.gov.bisp.enumeration.p053bz.i.b = r7 % 128;
        r7 = r7 % 2;
        r11 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
    
        r2 = r20.doFinal(r2);
        r7 = (r8 & (-48)) | ((~r8) & 47);
        r8 = -(-((r8 & 47) << 1));
        r10 = ((r7 | r8) << 1) - (r7 ^ r8);
        r7 = ((r10 | (-30)) << 1) - (r10 ^ (-30));
        r8 = (r7 ^ (-1)) + (r7 << 1);
        r7 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r10 = ((r7 | 37) << 1) - (r7 ^ 37);
        ivas.gov.bisp.enumeration.p053bz.i.a = r10 % 128;
        r10 = r10 % 2;
        r11 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0136, code lost:
    
        r7 = -(-r23);
        r10 = r8 & r7;
        r7 = (r7 ^ r8) | r10;
        r5 = -(~r24);
        r3 = java.util.Arrays.copyOfRange(r22, (r10 ^ r7) + ((r7 & r10) << 1), (-2) - (((r23 & r5) + (r23 | r5)) ^ (-1)));
        r4 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r5 = r4 + 39;
        ivas.gov.bisp.enumeration.p053bz.i.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
    
        if ((r5 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015d, code lost:
    
        if (r3.length != 82) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0163, code lost:
    
        if (r3.length != 16) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0165, code lost:
    
        r5 = r4 & 55;
        r4 = ((r4 | 55) & (~r5)) + (r5 << 1);
        ivas.gov.bisp.enumeration.p053bz.i.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0172, code lost:
    
        if ((r4 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0174, code lost:
    
        r3 = d(r3, r19.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
    
        d(r3, r19.e);
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0185, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0186, code lost:
    
        r4 = java.util.Arrays.copyOf(r19.f, 16);
        r5 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r7 = r5 & 55;
        r5 = r5 | 55;
        r8 = ((r7 | r5) << 1) - (r5 ^ r7);
        ivas.gov.bisp.enumeration.p053bz.i.b = r8 % 128;
        r8 = r8 % 2;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        if (r7 >= r3.length) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a2, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r8 = r5 & 95;
        r5 = ((r5 | 95) & (~r8)) + (r8 << 1);
        ivas.gov.bisp.enumeration.p053bz.i.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b1, code lost:
    
        if ((r5 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b3, code lost:
    
        r4[r7] = (byte) (r4[r7] & r3[r7]);
        r7 = r7 - 4;
        r5 = ((r7 | 108) << 1) - (r7 ^ 108);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c5, code lost:
    
        r5 = r4[r7];
        r8 = r3[r7];
        r10 = (~r8) & r5;
        r5 = (~r5) & r8;
        r4[r7] = (byte) ((r5 & r10) | (r10 ^ r5));
        r7 = r7 + 120;
        r5 = (r7 & (-119)) + (r7 | (-119));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01dc, code lost:
    
        r5 = r3.length;
        r3 = r4[r3.length];
        r7 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r8 = ((r7 ^ 9) | (r7 & 9)) << 1;
        r10 = -((r7 & (-10)) | ((~r7) & 9));
        r11 = (r8 & r10) + (r8 | r10);
        ivas.gov.bisp.enumeration.p053bz.i.a = r11 % 128;
        r11 = r11 % 2;
        r8 = r3 & 128;
        r4[r5] = (byte) (((r3 ^ 128) | r8) & (~r8));
        r3 = r7 & 87;
        r5 = (r7 ^ 87) | r3;
        r7 = (r3 & r5) + (r3 | r5);
        ivas.gov.bisp.enumeration.p053bz.i.a = r7 % 128;
        r7 = r7 % 2;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0211, code lost:
    
        r1 = r20.doFinal(d(r2, r3));
        r2 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r3 = (((r2 | 22) << 1) - (r2 ^ 22)) - 1;
        ivas.gov.bisp.enumeration.p053bz.i.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0227, code lost:
    
        if ((r3 % 2) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0229, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r24 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r24 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r2 = ((((r7 ^ 47) | (r7 & 47)) << 1) - (~(-((r7 & (-48)) | ((~r7) & 47))))) - 1;
        ivas.gov.bisp.enumeration.p053bz.i.a = r2 % 128;
        r2 = r2 % 2;
        r1 = r20.doFinal(d(r8, r19.e));
        r2 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r3 = r2 & 49;
        r2 = -(-((r2 ^ 49) | r3));
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p053bz.i.a = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] g(javax.crypto.Cipher r20, int r21, byte[] r22, int r23, int r24) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p053bz.i.g(javax.crypto.Cipher, int, byte[], int, int):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0097, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
    
        r0 = r0;
        r0.init(0, r16.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        r0 = r0;
        r0.init(1, r16.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r1 = r0 & 45;
        r1 = r1 + ((r0 ^ 45) | r1);
        ivas.gov.bisp.enumeration.p053bz.i.b = r1 % 128;
        r1 = r1 % 2;
        r14 = g(r13, 0, r3, 0, r3.length);
        r0 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r1 = r0 & 19;
        r0 = -(-((r0 ^ 19) | r1));
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        r0 = r2 % 128;
        ivas.gov.bisp.enumeration.p053bz.i.a = r0;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
    
        if (r18 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
    
        r0 = r0 + 123;
        ivas.gov.bisp.enumeration.p053bz.i.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dd, code lost:
    
        if ((r0 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00df, code lost:
    
        r0 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        r0 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e4, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e6, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e8, code lost:
    
        r15 = g(r13, 1, r3, 0, r3.length);
        r0 = ivas.gov.bisp.enumeration.p053bz.i.c;
        r1 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r2 = r1 & 31;
        r1 = (r1 ^ 31) | r2;
        r3 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.p053bz.i.b = r3 % 128;
        r3 = r3 % 2;
        r0 = r0.get();
        r0.init(1, r16.g, new javax.crypto.spec.IvParameterSpec(r14));
        r1 = ivas.gov.bisp.enumeration.p053bz.i.a + 35;
        ivas.gov.bisp.enumeration.p053bz.i.b = r1 % 128;
        r1 = r1 % 2;
        r0.doFinal(r17, 0, r17.length, r11, r16.h);
        r0 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r1 = r0 & 35;
        r1 = (r1 - (~(-(-((r0 ^ 35) | r1))))) - 1;
        ivas.gov.bisp.enumeration.p053bz.i.b = r1 % 128;
        r1 = r1 % 2;
        r0 = g(r13, 2, r11, r16.h, r17.length);
        r1 = r17.length;
        r2 = r16.h;
        r3 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r4 = r3 & 111;
        r4 = r4 + ((r3 ^ 111) | r4);
        r3 = r4 % 128;
        ivas.gov.bisp.enumeration.p053bz.i.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0156, code lost:
    
        if ((r4 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0158, code lost:
    
        r4 = r3 & 19;
        r3 = -(-((r3 ^ 19) | r4));
        r7 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.p053bz.i.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0169, code lost:
    
        if (r12 >= r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016b, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r4 = (r3 ^ 99) + ((r3 & 99) << 1);
        r3 = r4 % 128;
        ivas.gov.bisp.enumeration.p053bz.i.a = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0178, code lost:
    
        if ((r4 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x017a, code lost:
    
        r4 = r1 / r2;
        r7 = -r12;
        r13 = r4 & r7;
        r13 = r13 + ((r4 ^ r7) | r13);
        r4 = r15[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0185, code lost:
    
        r4 = (r1 - (~(-(-r2)))) - 1;
        r7 = -(-r12);
        r13 = r4 ^ r7;
        r13 = (((r4 & r7) | r13) << 1) - r13;
        r4 = r15[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0196, code lost:
    
        r7 = r14[r12];
        r10 = r4 & r7;
        r4 = ((r4 ^ r7) | r10) & (~r10);
        r5 = r0[r12];
        r11[r13] = (byte) ((r4 | r5) & (~(r4 & r5)));
        r12 = ((r12 | 1) << 1) - (r12 ^ 1);
        r4 = r3 & 59;
        r4 = r4 + ((r3 ^ 59) | r4);
        ivas.gov.bisp.enumeration.p053bz.i.b = r4 % 128;
        r4 = r4 % 2;
        r10 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01bd, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r1 = r0 ^ 39;
        r0 = -(-((r0 & 39) << 1));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        ivas.gov.bisp.enumeration.p053bz.i.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d0, code lost:
    
        if ((r2 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d2, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d3, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d8, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e4, code lost:
    
        throw new java.security.GeneralSecurityException("plaintext too long");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r1 <= ((Integer.MAX_VALUE >> r2) % 30)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (r1 <= ((r0 & r4) + (r0 | r4))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r0 = r17.length + r2;
        r10 = 16;
        r11 = new byte[(r0 ^ 16) + ((r0 & 16) << 1)];
        r0 = r3 | 5;
        r1 = ((r0 << 1) - (~(-(r0 & (~(r3 & 5)))))) - 1;
        ivas.gov.bisp.enumeration.p053bz.i.a = r1 % 128;
        r1 = r1 % 2;
        r3 = ivas.gov.bisp.enumeration.p053bz.Q.b(r2);
        r0 = r16.h;
        r1 = ivas.gov.bisp.enumeration.p053bz.i.b;
        r2 = (r1 ^ 17) + ((r1 & 17) << 1);
        ivas.gov.bisp.enumeration.p053bz.i.a = r2 % 128;
        r2 = r2 % 2;
        r12 = 0;
        java.lang.System.arraycopy(r3, 0, r11, 0, r0);
        r0 = ivas.gov.bisp.enumeration.p053bz.i.d.get();
        r1 = ivas.gov.bisp.enumeration.p053bz.i.a;
        r2 = r1 & 15;
        r1 = (((r1 | 15) & (~r2)) - (~(-(-(r2 << 1))))) - 1;
        ivas.gov.bisp.enumeration.p053bz.i.b = r1 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.aS.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] b(byte[] r17, byte[] r18) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p053bz.i.b(byte[], byte[]):byte[]");
    }
}
