package ivas.gov.bisp.enumeration.p053bz;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class S extends u {
    private static int a = 1;
    private static int b;

    public S(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.u
    public int o() {
        int i = 2 % 2;
        int i2 = a + 79;
        b = i2 % 128;
        return i2 % 2 != 0 ? 47 : 24;
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.u
    public int[] l(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        char c;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 87;
        int i5 = -(-((i3 & 87) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int i9 = (((i7 & (-100)) | ((~i7) & 99)) - (~(-(-((i7 & 99) << 1))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            iArr3 = new int[63];
            iArr4 = this.d;
            iArr2 = new int[34];
        } else {
            iArr2 = new int[16];
            iArr3 = new int[16];
            iArr4 = this.d;
        }
        u.f(iArr2, iArr4);
        iArr2[12] = iArr[0];
        int i10 = a + 29;
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        iArr2[13] = iArr[1];
        char c2 = 14;
        iArr2[14] = iArr[2];
        int i13 = iArr[3];
        int i14 = i11 & 35;
        int i15 = -(-((i11 ^ 35) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            iArr2[15] = i13;
            u.g(iArr2);
            iArr2[3] = iArr2[25];
            c = 4;
        } else {
            iArr2[15] = i13;
            u.g(iArr2);
            iArr2[4] = iArr2[12];
            c = 5;
        }
        int i17 = a;
        int i18 = i17 & 17;
        int i19 = (~i18) & (i17 | 17);
        int i20 = i18 << 1;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        int i22 = i21 % 128;
        b = i22;
        int i23 = i21 % 2;
        iArr2[c] = iArr2[13];
        iArr2[6] = iArr2[14];
        int i24 = (i22 & 15) + (i22 | 15);
        a = i24 % 128;
        int i25 = i24 % 2;
        iArr2[7] = iArr2[15];
        int[] iArrCopyOf = Arrays.copyOf(iArr2, 8);
        int i26 = a;
        int i27 = ((i26 | 115) << 1) - (i26 ^ 115);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            u.f(iArr3, iArrCopyOf);
            iArr3[79] = i;
            iArr3[54] = 1;
            c2 = '\n';
        } else {
            u.f(iArr3, iArrCopyOf);
            iArr3[12] = i;
            iArr3[13] = 0;
        }
        int i28 = b;
        int i29 = i28 & 35;
        int i30 = i29 + ((i28 ^ 35) | i29);
        int i31 = i30 % 128;
        a = i31;
        int i32 = i30 % 2;
        iArr3[c2] = iArr[4];
        iArr3[15] = iArr[5];
        int i33 = i31 & 49;
        int i34 = i31 | 49;
        int i35 = (i33 & i34) + (i33 | i34);
        b = i35 % 128;
        int i36 = i35 % 2;
        return iArr3;
    }
}
