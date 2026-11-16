package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.aS.O;
import ivas.gov.bisp.enumeration.aS.z;
import ivas.gov.bisp.enumeration.p100w.r;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bz.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0231o implements z {
    private static int a = 1;
    private static int b;
    public final M c;
    public final O d;
    public final int e;

    public C0231o(M m, O o2, int i) {
        this.c = m;
        this.d = o2;
        this.e = i;
    }

    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE;
        byte[][] bArr3;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (((i2 ^ 3) | i3) << 1) - ((i2 | 3) & (~i3));
        a = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArrB = this.c.b(bArr);
        int i6 = a;
        int i7 = i6 + 6;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
            int i9 = (i6 & 47) + (i6 | 47);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        long length = bArr2.length;
        int i11 = a;
        int i12 = i11 & 51;
        int i13 = (i11 | 51) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        byte[] bArrCopyOf = i15 % 2 != 0 ? Arrays.copyOf(byteBufferAllocate.putLong(length & 8).array(), 62) : Arrays.copyOf(byteBufferAllocate.putLong(length * 8).array(), 8);
        O o2 = this.d;
        int i16 = b;
        int i17 = ((i16 & 88) + (i16 | 88)) - 1;
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        int i20 = ((i18 | 11) << 1) - (i18 ^ 11);
        b = i20 % 128;
        int i21 = i20 % 2;
        byte[] bArrM = r.m(bArr2, bArrB, bArrCopyOf);
        int i22 = a;
        int i23 = (i22 & (-122)) | ((~i22) & 121);
        int i24 = -(-((i22 & 121) << 1));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            bArrE = o2.e(bArrM);
            bArr3 = new byte[3][];
        } else {
            bArrE = o2.e(bArrM);
            bArr3 = new byte[2][];
        }
        bArr3[0] = bArrB;
        bArr3[1] = bArrE;
        byte[] bArrM2 = r.m(bArr3);
        int i26 = b;
        int i27 = i26 | 1;
        int i28 = i27 << 1;
        int i29 = -((~(i26 & 1)) & i27);
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        a = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 0 / 0;
        }
        return bArrM2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0087 A[PHI: r12
  0x0087: PHI (r12v5 byte[]) = (r12v4 byte[]), (r12v9 byte[]) binds: [B:14:0x0085, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x009b  */
    @Override // ivas.gov.bisp.enumeration.aS.z
    public final byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOfRange;
        int i;
        byte[][] bArr3;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - ((((i3 | 92) << 1) - (i3 ^ 92)) ^ (-1));
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            int length = bArr.length;
            obj.hashCode();
            throw null;
        }
        int length2 = bArr.length;
        int i6 = this.e;
        if (length2 < i6) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i7 = (((i5 ^ 37) | (i5 & 37)) << 1) - (((~i5) & 37) | (i5 & (-38)));
        a = i7 % 128;
        int i8 = i7 % 2;
        int length3 = bArr.length;
        int i9 = -(~(-i6));
        int i10 = (length3 & i9) + (length3 | i9);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 0, (i10 ^ (-1)) + (i10 << 1));
        int length4 = bArr.length;
        int i11 = b;
        int i12 = ((i11 ^ 27) | (i11 & 27)) << 1;
        int i13 = -((i11 & (-28)) | ((~i11) & 27));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int length5 = bArr.length;
            obj.hashCode();
            throw null;
        }
        int i15 = this.e;
        int length6 = bArr.length;
        int i16 = (i11 & 105) + (i11 | 105);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, length4 << i15, length6);
            if (bArr2 == null) {
                bArr2 = new byte[0];
                int i17 = b;
                int i18 = i17 & 35;
                int i19 = i17 | 35;
                i = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i % 128;
                if (i % 2 == 0) {
                    int i20 = 4 % 2;
                }
            }
        } else {
            int i21 = -i15;
            int i22 = ((~i21) & length4) | ((~length4) & i21);
            int i23 = (length4 & i21) << 1;
            bArrCopyOfRange = Arrays.copyOfRange(bArr, ((i22 | i23) << 1) - (i23 ^ i22), length6);
            if (bArr2 == null) {
                bArr2 = new byte[0];
                int i110 = b;
                int i111 = i110 & 35;
                int i112 = i110 | 35;
                i = (i111 ^ i112) + ((i112 & i111) << 1);
                a = i % 128;
                if (i % 2 == 0) {
                    int i24 = 4 % 2;
                }
            }
        }
        ByteBuffer byteBufferPutLong = ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8);
        int i25 = b;
        int i26 = i25 & 75;
        int i27 = (i25 | 75) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        a = i29 % 128;
        byte[] bArrCopyOf = i29 % 2 == 0 ? Arrays.copyOf(byteBufferPutLong.array(), 45) : Arrays.copyOf(byteBufferPutLong.array(), 8);
        O o2 = this.d;
        int i30 = a;
        int i31 = ((i30 | 27) << 1) - (((~i30) & 27) | (i30 & (-28)));
        int i32 = i31 % 128;
        b = i32;
        if (i31 % 2 != 0) {
            bArr3 = new byte[4][];
            bArr3[1] = bArr2;
        } else {
            byte[][] bArr4 = new byte[3][];
            bArr4[0] = bArr2;
            bArr3 = bArr4;
        }
        bArr3[1] = bArrCopyOfRange2;
        bArr3[2] = bArrCopyOf;
        int i33 = i32 & 29;
        int i34 = i33 + ((i32 ^ 29) | i33);
        a = i34 % 128;
        int i35 = i34 % 2;
        o2.b(bArrCopyOfRange, r.m(bArr3));
        M m = this.c;
        int i36 = a + 75;
        b = i36 % 128;
        int i37 = i36 % 2;
        byte[] bArrE = m.e(bArrCopyOfRange2);
        int i38 = a;
        int i39 = i38 ^ 63;
        int i40 = (((i38 & 63) | i39) << 1) - i39;
        b = i40 % 128;
        if (i40 % 2 == 0) {
            return bArrE;
        }
        throw null;
    }
}
