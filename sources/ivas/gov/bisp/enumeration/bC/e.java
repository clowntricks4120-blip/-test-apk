package ivas.gov.bisp.enumeration.bC;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 0;
    private static int b = 1;

    public static Bitmap c(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = (i3 - (~((i2 ^ 47) | i3))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        int i6 = b;
        int i7 = ((((i6 ^ 85) | (i6 & 85)) << 1) - (~(-(((~i6) & 85) | (i6 & (-86)))))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return bitmapDecodeByteArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void d(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 95;
        int i7 = (i5 ^ 95) | i6;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            bArr2 = new byte[i];
            i3 = 1;
        } else {
            bArr2 = new byte[i];
            i3 = 0;
        }
        int i9 = (i5 & (-22)) | ((~i5) & 21);
        int i10 = -(-((i5 & 21) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        while (i3 < i2 / 2) {
            int i13 = a;
            int i14 = (-2) - ((((i13 | 44) << 1) - (i13 ^ 44)) ^ (-1));
            b = i14 % 128;
            int i15 = i14 % 2 == 0 ? i >>> i3 : i * i3;
            System.arraycopy(bArr, i15, bArr2, 0, i);
            int i16 = (i2 - (~(-i3))) - 1;
            int i17 = (((i16 ^ (-1)) - (~(-(-(i16 << 1))))) - 1) * i;
            int i18 = b;
            int i19 = i18 & 79;
            int i20 = i19 + ((i18 ^ 79) | i19);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                System.arraycopy(bArr, i17, bArr, i15, i);
                System.arraycopy(bArr2, 1, bArr, i17, i);
                int i21 = (i3 & (-68)) | ((~i3) & 67);
                int i22 = -(-((i3 & 67) << 1));
                i3 = (i21 & i22) + (i21 | i22);
            } else {
                System.arraycopy(bArr, i17, bArr, i15, i);
                System.arraycopy(bArr2, 0, bArr, i17, i);
                int i23 = (i3 | (-42)) << 1;
                int i24 = -(((~i3) & (-42)) | (i3 & 41));
                int i25 = (i23 & i24) + (i23 | i24);
                i3 = ((i25 & (-44)) | ((~i25) & 43)) + ((i25 & 43) << 1);
            }
        }
        int i26 = a;
        int i27 = (i26 ^ 116) + ((i26 & 116) << 1);
        int i28 = (i27 ^ (-1)) + (i27 << 1);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 18 / 0;
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        char c;
        long j3;
        long j4;
        char c2;
        int i3;
        int i4;
        byte b2;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 & (-124)) | ((~i6) & 123)) + ((i6 & 123) << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = i * i2;
        byte[] bArr2 = new byte[i10 + 1078];
        byte[] bArr3 = new byte[1078];
        int i11 = i8 & 21;
        int i12 = (i11 - (~(-(-((i8 ^ 21) | i11))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        System.arraycopy(new byte[]{66, 77, 0, 0, 0, 0, 0, 0, 0, 0, 54, 4, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, bArr3, 0, 54);
        long j5 = i;
        long j6 = j5 & 255;
        int i14 = b;
        int i15 = (i14 ^ 9) + ((i14 & 9) << 1);
        a = i15 % 128;
        if (i15 % 2 != 0) {
            bArr3[18] = (byte) j6;
            j = j5 >>> 106;
            bArr3[36] = (byte) (j ^ 255);
        } else {
            bArr3[18] = (byte) j6;
            j = j5 >> 8;
            bArr3[19] = (byte) (j & 255);
        }
        int i16 = i14 & 99;
        int i17 = (i14 ^ 99) | i16;
        int i18 = (i16 & i17) + (i16 | i17);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            j2 = j >>> 112;
            bArr3[63] = (byte) (j2 ^ 255);
            c = '1';
        } else {
            j2 = j >> 8;
            bArr3[20] = (byte) (j2 & 255);
            c = 21;
        }
        bArr3[c] = (byte) ((j2 >> 8) & 255);
        long j7 = i2;
        int i19 = (-2) - ((i14 + 32) ^ (-1));
        int i20 = i19 % 128;
        a = i20;
        byte b3 = (byte) (j7 & 255);
        if (i19 % 2 != 0) {
            bArr3[22] = b3;
            j3 = j7 >>> 72;
            bArr3[22] = (byte) (j3 / 255);
        } else {
            bArr3[22] = b3;
            j3 = j7 >> 8;
            bArr3[23] = (byte) (j3 & 255);
        }
        int i21 = i20 & 13;
        int i22 = -(-(i20 | 13));
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            j4 = j3 >>> 82;
            bArr3[34] = (byte) (j4 % 255);
            c2 = 'g';
        } else {
            j4 = j3 >> 8;
            bArr3[24] = (byte) (j4 & 255);
            c2 = 25;
        }
        int i24 = i20 ^ 51;
        int i25 = ((i20 & 51) | i24) << 1;
        int i26 = -i24;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        b = i27 % 128;
        if (i27 % 2 == 0) {
            bArr3[c2] = (byte) ((j4 << 96) & 255);
            i4 = 41;
            i3 = 1;
        } else {
            bArr3[c2] = (byte) ((j4 >> 8) & 255);
            i3 = 0;
            i4 = 54;
        }
        while (i4 < 1078) {
            int i28 = a;
            int i29 = (-2) - (((i28 ^ 124) + ((i28 & 124) << 1)) ^ (-1));
            b = i29 % 128;
            if (i29 % 2 == 0) {
                b2 = (byte) i3;
                bArr3[i4 + 4] = b2;
            } else {
                b2 = (byte) i3;
                int i30 = i4 & 2;
                bArr3[i30 + ((i4 ^ 2) | i30)] = b2;
            }
            int i31 = (i28 & (-72)) | ((~i28) & 71);
            int i32 = -(-((i28 & 71) << 1));
            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
            b = i33 % 128;
            int i34 = i33 % 2;
            int i35 = (i4 & (-2)) | ((~i4) & 1);
            int i36 = (i4 & 1) << 1;
            bArr3[((i35 | i36) << 1) - (i35 ^ i36)] = b2;
            bArr3[i4] = b2;
            int i37 = (i28 & (-16)) | ((~i28) & 15);
            int i38 = (i28 & 15) << 1;
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
            bArr3[((i4 | 3) << 1) - (i4 ^ 3)] = 0;
            int i41 = i3 & 1;
            int i42 = -(-(i3 | 1));
            i3 = (i42 | i41) + (i41 & i42);
            int i43 = (i4 & (-76)) + (i4 | (-76));
            i4 = (((i43 | 81) << 1) - (i43 ^ 81)) - 1;
            int i44 = i28 + 21;
            b = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = 2 % 3;
            }
        }
        System.arraycopy(bArr3, 0, bArr2, 0, 1078);
        int i46 = a;
        int i47 = i46 & 47;
        int i48 = (i46 | 47) & (~i47);
        int i49 = i47 << 1;
        int i50 = (i48 & i49) + (i48 | i49);
        b = i50 % 128;
        int i51 = i50 % 2;
        System.arraycopy(bArr, 0, bArr2, 1078, i10);
        int i52 = a;
        int i53 = (i52 ^ 64) + ((i52 & 64) << 1);
        int i54 = (i53 ^ (-1)) + (i53 << 1);
        b = i54 % 128;
        int i55 = i54 % 2;
        return bArr2;
    }
}
