package ivas.gov.bisp.enumeration.cO;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static int a = 1;
    private static int b;
    public static final short[] c = new short[128];
    public static final byte[] d;

    static {
        int i;
        int i2;
        int i3;
        byte b2;
        byte b3;
        byte[] bArr = new byte[112];
        d = bArr;
        byte[] bArr2 = new byte[128];
        a = 33 % 128;
        int i4 = 33 % 2;
        b(bArr2, 0, 15, (byte) 1);
        b(bArr2, 16, 31, (byte) 2);
        b(bArr2, 32, 63, (byte) 3);
        b(bArr2, 64, 65, (byte) 0);
        int i5 = b;
        int i6 = ((i5 | 27) << 1) - (i5 ^ 27);
        a = i6 % 128;
        int i7 = 95;
        if (i6 % 2 == 0) {
            b(bArr2, 39, 87, (byte) 2);
            b(bArr2, 4, 95, (byte) 5);
            b(bArr2, 90, 67, (byte) 45);
            i = 38;
        } else {
            b(bArr2, 66, 95, (byte) 4);
            b(bArr2, 96, 96, (byte) 5);
            b(bArr2, 97, 108, (byte) 6);
            i = 109;
            i7 = 109;
        }
        b(bArr2, i, i7, (byte) 7);
        b(bArr2, 110, 111, (byte) 6);
        b(bArr2, 112, 112, (byte) 8);
        int i8 = b;
        int i9 = ((i8 | 97) << 1) - (i8 ^ 97);
        a = i9 % 128;
        int i10 = i9 % 2;
        b(bArr2, 113, 115, (byte) 9);
        b(bArr2, 116, 116, (byte) 10);
        b(bArr2, 117, 127, (byte) 0);
        int i11 = b;
        int i12 = i11 & 119;
        int i13 = i12 + ((i11 ^ 119) | i12);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            b(bArr, 0, 111, (byte) 118);
            b(bArr, 68, 0, (byte) -1);
            b(bArr, 48, 46, (byte) 0);
            i2 = 108;
            i3 = 124;
        } else {
            b(bArr, 0, 111, (byte) -2);
            b(bArr, 8, 11, (byte) -1);
            b(bArr, 24, 27, (byte) 0);
            i2 = 40;
            i3 = 43;
        }
        b(bArr, i2, i3, (byte) 16);
        b(bArr, 58, 59, (byte) 0);
        b(bArr, 72, 73, (byte) 0);
        int i14 = b;
        int i15 = (i14 & 3) + (i14 | 3);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            b(bArr, 89, 91, (byte) 60);
            b(bArr, 119, 69, (byte) 63);
        } else {
            b(bArr, 89, 91, (byte) 16);
            b(bArr, 104, 104, (byte) 16);
        }
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        int i16 = a;
        int i17 = ((i16 ^ 6) + ((i16 & 6) << 1)) - 1;
        b = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 2 % 2;
        }
        int i19 = 0;
        while (i19 < 128) {
            int i20 = a;
            int i21 = (i20 & (-42)) | ((~i20) & 41);
            int i22 = -(-((i20 & 41) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            int i24 = i23 % 128;
            b = i24;
            if (i23 % 2 != 0) {
                byte b4 = bArr2[i19];
                b2 = bArr3[b4];
                b3 = bArr4[b4];
                int i25 = 85 / 0;
            } else {
                byte b5 = bArr2[i19];
                b2 = bArr3[b5];
                b3 = bArr4[b5];
            }
            short[] sArr = c;
            int i26 = (b2 & i19) << 8;
            int i27 = (b3 & i26) | (b3 ^ i26);
            int i28 = (-2) - (((i24 & 94) + (i24 | 94)) ^ (-1));
            a = i28 % 128;
            int i29 = i28 % 2;
            sArr[i19] = (short) i27;
            i19++;
            int i30 = i24 + 123;
            a = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 2 % 2;
            }
        }
        int i32 = b + 99;
        a = i32 % 128;
        int i33 = i32 % 2;
    }

    public static void b(byte[] bArr, int i, int i2, byte b2) {
        int i3 = 2 % 2;
        while (i <= i2) {
            int i4 = a;
            int i5 = i4 & 85;
            int i6 = -(-((i4 ^ 85) | i5));
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            bArr[i] = b2;
            int i9 = i & 1;
            i = ((i | 1) & (~i9)) + (i9 << 1);
            int i10 = i4 & 51;
            int i11 = (((i4 ^ 51) | i10) << 1) - ((i4 | 51) & (~i10));
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = i13 & 65;
        int i15 = (((i13 | 65) & (~i14)) - (~(i14 << 1))) - 1;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }
}
