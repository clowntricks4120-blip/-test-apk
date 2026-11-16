package ivas.gov.bisp.enumeration.bK;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes.dex */
public class G {
    private static int a = 0;
    private static int b = 1;

    public static Bitmap c(byte[] bArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((i2 | 11) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        int i8 = b;
        int i9 = i8 & 83;
        int i10 = (i8 ^ 83) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return bitmapDecodeByteArray;
    }

    public static void d(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 & 4) + (i5 | 4)) - 1;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        byte[] bArr2 = new byte[i];
        int i9 = ((i7 ^ 1) | (i7 & 1)) << 1;
        int i10 = -(((~i7) & 1) | (i7 & (-2)));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < i2 / 2) {
            int i14 = a;
            int i15 = i14 & 5;
            int i16 = -(-(i14 | 5));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i * i13;
            int i20 = (i14 & 21) + (i14 | 21);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                System.arraycopy(bArr, i19, bArr2, 0, i);
                i3 = (i2 >>> i13) << 1;
            } else {
                System.arraycopy(bArr, i19, bArr2, 0, i);
                int i21 = -i13;
                int i22 = (i2 & i21) + (i21 | i2);
                i3 = (i22 ^ (-1)) + (i22 << 1);
            }
            int i23 = a;
            int i24 = (-2) - (((i23 & 30) + (i23 | 30)) ^ (-1));
            b = i24 % 128;
            int i25 = i24 % 2 == 0 ? i3 >>> i : i3 * i;
            System.arraycopy(bArr, i25, bArr, i19, i);
            int i26 = a;
            int i27 = i26 & 107;
            int i28 = (i26 ^ 107) | i27;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
            System.arraycopy(bArr2, 0, bArr, i25, i);
            i13 = ((i13 ^ 2) + ((i13 & 2) << 1)) - 1;
            int i31 = b;
            int i32 = (i31 & (-92)) | ((~i31) & 91);
            int i33 = -(-((i31 & 91) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = a;
        int i37 = i36 & 31;
        int i38 = (i36 ^ 31) | i37;
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        b = i39 % 128;
        int i40 = i39 % 2;
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        long j;
        char c;
        long j2;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 ^ 17) + ((i5 & 17) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            i3 = i + i2;
            bArr2 = new byte[((i3 | (-22894)) << 1) - (i3 ^ (-22894))];
            bArr3 = new byte[]{66, 77, 0, 0, 0, 0, 0, 0, 0, 0, 54, 4, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            bArr4 = new byte[30139];
        } else {
            i3 = i * i2;
            int i7 = i3 ^ 1078;
            int i8 = (i3 & 1078) << 1;
            bArr2 = new byte[(i7 & i8) + (i7 | i8)];
            bArr3 = new byte[]{66, 77, 0, 0, 0, 0, 0, 0, 0, 0, 54, 4, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            bArr4 = new byte[1078];
        }
        int i9 = i5 ^ 59;
        int i10 = ((i5 & 59) | i9) << 1;
        int i11 = -i9;
        int i12 = (i10 & i11) + (i10 | i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        System.arraycopy(bArr3, 0, bArr4, 0, 54);
        long j3 = i;
        byte[] bArr5 = bArr2;
        int i14 = b;
        int i15 = (-2) - (((i14 ^ 118) + ((i14 & 118) << 1)) ^ (-1));
        int i16 = i15 % 128;
        a = i16;
        int i17 = i15 % 2;
        bArr4[18] = (byte) (j3 & 255);
        long j4 = j3 >> 8;
        int i18 = i3;
        bArr4[19] = (byte) (j4 & 255);
        int i19 = (i16 & 55) + (i16 | 55);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            j = j4 << 50;
            bArr4[75] = (byte) (j % 255);
            c = 'd';
        } else {
            j = j3 >> 16;
            bArr4[20] = (byte) (j & 255);
            c = 21;
        }
        bArr4[c] = (byte) ((j >> 8) & 255);
        long j5 = i2;
        long j6 = j5 & 255;
        int i20 = (i16 ^ 39) + ((i16 & 39) << 1);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            bArr4[22] = (byte) j6;
            j2 = j5 >>> 14;
            bArr4[20] = (byte) (j2 - 255);
        } else {
            bArr4[22] = (byte) j6;
            j2 = j5 >> 8;
            bArr4[23] = (byte) (j2 & 255);
        }
        bArr4[24] = (byte) ((j2 >> 8) & 255);
        int i21 = i16 + 67;
        b = i21 % 128;
        int i22 = i21 % 2;
        bArr4[25] = (byte) ((j2 >> 16) & 255);
        int i23 = (((i16 ^ 75) | (i16 & 75)) << 1) - (((~i16) & 75) | (i16 & (-76)));
        b = i23 % 128;
        int i24 = i23 % 2;
        int i25 = 0;
        int i26 = 54;
        while (i26 < 1078) {
            int i27 = b;
            int i28 = ((i27 | 55) << 1) - (i27 ^ 55);
            int i29 = i28 % 128;
            a = i29;
            int i30 = i28 % 2;
            byte b2 = (byte) i25;
            int i31 = (i26 | 2) << 1;
            int i32 = ~i26;
            int i33 = -((i26 & (-3)) | (2 & i32));
            bArr4[((i31 | i33) << 1) - (i33 ^ i31)] = b2;
            int i34 = (i29 & 53) + (i29 | 53);
            b = i34 % 128;
            int i35 = i34 % 2;
            int i36 = (i26 | 1) << 1;
            int i37 = -((i26 & (-2)) | (i32 & 1));
            bArr4[(i36 & i37) + (i36 | i37)] = b2;
            bArr4[i26] = b2;
            int i38 = i29 & 47;
            int i39 = ((i29 | 47) & (~i38)) + (i38 << 1);
            int i40 = i39 % 128;
            b = i40;
            if (i39 % 2 == 0) {
                int i41 = i26 ^ (-5);
                bArr4[((((i26 & (-5)) | i41) << 1) - (~(-i41))) - 1] = 0;
                i25 = (-2) - ((((i25 | 127) << 1) - (i25 ^ 127)) ^ (-1));
                int i42 = i26 ^ 15;
                int i43 = ((i26 & 15) | i42) << 1;
                int i44 = -i42;
                int i45 = (i43 & i44) + (i44 | i43);
                int i46 = i45 & 39;
                i26 = (((i45 ^ 39) | i46) << 1) - ((~i46) & (i45 | 39));
            } else {
                int i47 = i26 & 3;
                int i48 = (i26 ^ 3) | i47;
                bArr4[((i47 | i48) << 1) - (i47 ^ i48)] = 0;
                int i49 = i25 ^ 86;
                int i50 = (i25 & 86) << 1;
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                int i52 = i51 & (-85);
                int i53 = (i51 ^ (-85)) | i52;
                int i54 = (i52 & i53) + (i52 | i53);
                int i55 = i26 ^ 63;
                int i56 = ((i26 & 63) | i55) << 1;
                int i57 = -i55;
                int i58 = (i56 & i57) + (i57 | i56);
                int i59 = i58 & (-59);
                int i60 = -(-(i58 | (-59)));
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                i25 = i54;
                i26 = i61;
            }
            int i62 = (((i40 ^ 99) | (i40 & 99)) << 1) - (((~i40) & 99) | (i40 & (-100)));
            a = i62 % 128;
            int i63 = i62 % 2;
        }
        System.arraycopy(bArr4, 0, bArr5, 0, 1078);
        int i64 = b;
        int i65 = ((i64 | 9) << 1) - (i64 ^ 9);
        a = i65 % 128;
        if (i65 % 2 != 0) {
            System.arraycopy(bArr, 0, bArr5, 31106, i18);
        } else {
            System.arraycopy(bArr, 0, bArr5, 1078, i18);
        }
        return bArr5;
    }
}
