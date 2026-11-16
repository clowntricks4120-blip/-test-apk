package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Z extends O {
    private static int a = 1;
    private static int b;
    public final char[] c;

    public Z(char[] cArr) {
        this.c = cArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 103) + (i2 | 103);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (!(o2 instanceof Z)) {
            int i6 = (((i4 | 54) << 1) - (i4 ^ 54)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        char[] cArr = this.c;
        char[] cArr2 = ((Z) o2).c;
        int i8 = i2 + 113;
        b = i8 % 128;
        int i9 = i8 % 2;
        boolean zEquals = Arrays.equals(cArr, cArr2);
        int i10 = a;
        int i11 = ((i10 | 17) << 1) - (i10 ^ 17);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 107) << 1) - (i3 ^ 107);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        char[] cArr = this.c;
        if (cArr == null) {
            int i7 = i3 + 65;
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i3 & 97;
            int i10 = i3 | 97;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 % 5;
            }
            i = 0;
        } else {
            int length = cArr.length;
            int i13 = (length ^ 1) + ((length & 1) << 1);
            int i14 = (i5 & (-112)) | ((~i5) & 111);
            int i15 = (i5 & 111) << 1;
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            while (true) {
                int i18 = ((((length ^ 83) | (length & 83)) << 1) - (~(-(((~length) & 83) | (length & (-84)))))) - 1;
                int i19 = i18 & (-84);
                int i20 = ((i18 ^ (-84)) | i19) << 1;
                int i21 = -((i18 | (-84)) & (~i19));
                length = ((i20 & i21) << 1) + (i20 ^ i21);
                if (length < 0) {
                    break;
                }
                int i22 = b;
                int i23 = i22 & 19;
                int i24 = ((i22 ^ 19) | i23) << 1;
                int i25 = -((i22 | 19) & (~i23));
                int i26 = (i24 & i25) + (i25 | i24);
                int i27 = i26 % 128;
                a = i27;
                int i28 = i26 % 2;
                int i29 = i13 * 257;
                char c = cArr[length];
                int i30 = i29 & c;
                i13 = ((i29 ^ c) | i30) & (~i30);
                int i31 = ((i27 & (-106)) | ((~i27) & 105)) + ((i27 & 105) << 1);
                b = i31 % 128;
                int i32 = i31 % 2;
            }
            i = i13;
        }
        int i33 = a;
        int i34 = (-2) - (((i33 ^ 88) + ((i33 & 88) << 1)) ^ (-1));
        b = i34 % 128;
        int i35 = i34 % 2;
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 45) + (i2 | 45);
        b = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = this.c;
        int iB = az.b(i4 != 0 ? cArr.length >> 3 : cArr.length * 2);
        int length = this.c.length * 2;
        int i5 = -(-(((iB & 2) + (iB | 2)) - 1));
        int i6 = length & i5;
        int i7 = ((((length ^ i5) | i6) << 1) - (~(-((i5 | length) & (~i6))))) - 1;
        int i8 = a + 125;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 47) + (i2 | 47);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 17;
        int i7 = ((i4 ^ 17) | i6) << 1;
        int i8 = -((i4 | 17) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        String str = new String(this.c);
        int i2 = a;
        int i3 = (i2 & 34) + (i2 | 34);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        Object obj;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 95) << 1) - (i3 ^ 95);
        b = i4 % 128;
        int i5 = i4 % 2;
        int length = this.c.length;
        if (!(!z)) {
            int i6 = i3 & 93;
            int i7 = ((i3 ^ 93) | i6) << 1;
            int i8 = -((i3 | 93) & (~i6));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            aVar.r(30);
            int i11 = b;
            int i12 = (((i11 | 60) << 1) - (i11 ^ 60)) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        aVar.w(length * 2);
        byte[] bArr = new byte[8];
        int i14 = a;
        int i15 = ((i14 ^ 94) + ((i14 & 94) << 1)) - 1;
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i14 ^ 39;
        int i18 = ((i14 & 39) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 & i19) + (i18 | i19);
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 0;
        while (i22 < (length & (-4))) {
            int i23 = b;
            int i24 = (i23 ^ 27) + ((i23 & 27) << 1);
            int i25 = i24 % 128;
            a = i25;
            int i26 = i24 % 2;
            char[] cArr = this.c;
            char c = cArr[i22];
            int i27 = i22 & 1;
            int i28 = -(-((i22 ^ 1) | i27));
            char c2 = cArr[(i27 ^ i28) + ((i27 & i28) << 1)];
            int i29 = i25 & 95;
            int i30 = (i25 ^ 95) | i29;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            int i32 = i31 % 128;
            b = i32;
            int i33 = i31 % 2;
            int i34 = (i22 | 2) << 1;
            int i35 = ~i22;
            int i36 = -((i22 & (-3)) | (2 & i35));
            char c3 = cArr[((i34 | i36) << 1) - (i34 ^ i36)];
            int i37 = i22 ^ 3;
            int i38 = (i37 | (i22 & 3)) << 1;
            int i39 = -i37;
            char c4 = cArr[(i38 & i39) + (i38 | i39)];
            int i40 = i32 + 11;
            int i41 = i40 % 128;
            a = i41;
            if (i40 % 2 == 0) {
                int i42 = (i22 | 104) << 1;
                int i43 = -((i35 & 104) | (i22 & (-105)));
                i22 = (i42 ^ i43) + ((i43 & i42) << 1);
                bArr[0] = (byte) (c * '8');
            } else {
                int i44 = (i22 & 87) + (i22 | 87);
                i22 = (((i44 & 82) | ((-83) & (~i44))) - (~((i44 & (-83)) << 1))) - 1;
                bArr[0] = (byte) (c >> '\b');
            }
            int i45 = i41 + 93;
            int i46 = i45 % 128;
            b = i46;
            int i47 = i45 % 2;
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            int i48 = (((i46 & (-76)) | ((~i46) & 75)) - (~(-(-((i46 & 75) << 1))))) - 1;
            a = i48 % 128;
            if (i48 % 2 == 0) {
                bArr[3] = (byte) c2;
                bArr[4] = (byte) (c3 << '0');
            } else {
                bArr[3] = (byte) c2;
                bArr[4] = (byte) (c3 >> '\b');
            }
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            int i49 = (i46 ^ 35) + ((i46 & 35) << 1);
            a = i49 % 128;
            if (i49 % 2 == 0) {
                bArr[27] = (byte) c4;
                obj = aVar.c;
            } else {
                bArr[7] = (byte) c4;
                obj = aVar.c;
            }
            ((OutputStream) obj).write(bArr, 0, 8);
            int i50 = b + 109;
            a = i50 % 128;
            int i51 = i50 % 2;
        }
        if (i22 < length) {
            int i52 = b;
            int i53 = (i52 | 45) << 1;
            int i54 = -(((~i52) & 45) | (i52 & (-46)));
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            a = i55 % 128;
            int i56 = i55 % 2 == 0 ? 1 : 0;
            do {
                char c5 = this.c[i22];
                i22++;
                int i57 = a;
                int i58 = ((i57 ^ 82) + ((i57 & 82) << 1)) - 1;
                int i59 = i58 % 128;
                b = i59;
                int i60 = i58 % 2;
                int i61 = ((i56 & 2) + (i56 | 2)) - 1;
                byte b2 = (byte) (c5 >> '\b');
                int i62 = i59 + 79;
                i = i62 % 128;
                a = i;
                if (i62 % 2 == 0) {
                    bArr[i56] = b2;
                    i56 = i61 % 0;
                    bArr[i61] = (byte) c5;
                } else {
                    bArr[i56] = b2;
                    i56 = (i61 & 1) + (i61 | 1);
                    bArr[i61] = (byte) c5;
                }
            } while (i22 < length);
            int i63 = i & 113;
            int i64 = i63 + ((i ^ 113) | i63);
            b = i64 % 128;
            int i65 = i64 % 2;
            ((OutputStream) aVar.c).write(bArr, 0, i56);
            int i66 = a;
            int i67 = (i66 & (-68)) | ((~i66) & 67);
            int i68 = -(-((i66 & 67) << 1));
            int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
            b = i69 % 128;
            int i70 = i69 % 2;
        }
        int i71 = a;
        int i72 = (i71 ^ 1) + ((i71 & 1) << 1);
        b = i72 % 128;
        int i73 = i72 % 2;
    }
}
