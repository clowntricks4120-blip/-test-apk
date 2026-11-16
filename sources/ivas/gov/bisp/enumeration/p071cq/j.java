package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p101x.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements i {
    private static int a = 1;
    private static int b;
    public final byte[] c = new byte[4];
    public int d = 0;
    public long e;

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public void e(byte b2) {
        byte[] bArr;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 87;
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            bArr = this.c;
            i = this.d;
            i2 = i;
        } else {
            bArr = this.c;
            i = this.d;
            int i6 = i & 1;
            int i7 = ((i ^ 1) | i6) << 1;
            int i8 = -((~i6) & (i | 1));
            i2 = (i7 | i8) + (i7 & i8);
        }
        int i9 = (i5 ^ 68) + ((i5 & 68) << 1);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        this.d = i2;
        bArr[i] = b2;
        if (i2 == bArr.length) {
            int i12 = i5 + 81;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                l(bArr, 1);
                this.d = 1;
            } else {
                l(bArr, 0);
                this.d = 0;
            }
            int i13 = b;
            int i14 = i13 & 87;
            int i15 = (i13 | 87) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = (i15 & i16) + (i15 | i16);
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        this.e++;
        int i19 = a;
        int i20 = i19 & 57;
        int i21 = (i19 | 57) & (~i20);
        int i22 = i20 << 1;
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public void f(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 53;
        int i8 = -(-((i6 ^ 53) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        int iMax = Math.max(0, i2);
        if (this.d != 0) {
            int i12 = a;
            int i13 = i12 ^ 111;
            int i14 = (i12 & 111) << 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2 != 0 ? 1 : 0;
            int i18 = (i16 & 42) + (i16 | 42);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            while (true) {
                if (i17 >= iMax) {
                    i11 = i17;
                    break;
                }
                int i21 = a;
                int i22 = ((i21 | 83) << 1) - (i21 ^ 83);
                int i23 = i22 % 128;
                b = i23;
                int i24 = i22 % 2;
                byte[] bArr2 = this.c;
                int i25 = this.d;
                int i26 = i25 & 1;
                int i27 = (~i26) & (i25 | 1);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 & i28) + (i28 | i27);
                int i30 = (i23 & 29) + (i23 | 29);
                a = i30 % 128;
                int i31 = i30 % 2;
                this.d = i29;
                int i32 = i17 & 1;
                int i33 = (i17 ^ 1) | i32;
                int i34 = ((i32 & i33) << 1) + (i32 ^ i33);
                int i35 = i23 & 43;
                int i36 = ((i23 ^ 43) | i35) << 1;
                int i37 = -((i23 | 43) & (~i35));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                int i39 = i38 % 128;
                a = i39;
                if (i38 % 2 == 0) {
                    bArr2[i25] = bArr[i17 % i];
                    if (i29 == 5) {
                        l(bArr2, 0);
                        this.d = 0;
                        int i40 = a;
                        int i41 = (i40 ^ 34) + ((i40 & 34) << 1);
                        int i42 = (i41 ^ (-1)) + (i41 << 1);
                        int i43 = i42 % 128;
                        b = i43;
                        int i44 = i42 % 2;
                        int i45 = (i43 | 11) << 1;
                        int i46 = -(((~i43) & 11) | (i43 & (-12)));
                        int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                        a = i47 % 128;
                        int i48 = i47 % 2;
                        i11 = i34;
                        break;
                    }
                    int i49 = i39 + 94;
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    b = i50 % 128;
                    int i51 = i50 % 2;
                    i17 = i34;
                } else {
                    int i52 = i17 & i;
                    int i53 = i17 | i;
                    bArr2[i25] = bArr[((i52 | i53) << 1) - (i53 ^ i52)];
                    if (i29 == 4) {
                        l(bArr2, 0);
                        this.d = 0;
                        int i410 = a;
                        int i411 = (i410 ^ 34) + ((i410 & 34) << 1);
                        int i412 = (i411 ^ (-1)) + (i411 << 1);
                        int i413 = i412 % 128;
                        b = i413;
                        int i414 = i412 % 2;
                        int i415 = (i413 | 11) << 1;
                        int i416 = -(((~i413) & 11) | (i413 & (-12)));
                        int i417 = ((i415 | i416) << 1) - (i415 ^ i416);
                        a = i417 % 128;
                        int i418 = i417 % 2;
                        i11 = i34;
                        break;
                    }
                    int i419 = i39 + 94;
                    int i54 = (i419 ^ (-1)) + (i419 << 1);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                    i17 = i34;
                }
            }
        }
        int i56 = a;
        int i57 = i56 & 35;
        int i58 = (i56 | 35) & (~i57);
        int i59 = -(-(i57 << 1));
        int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
        b = i60 % 128;
        int i61 = i60 % 2;
        int i62 = i11;
        while (true) {
            int i63 = a;
            int i64 = ((i63 & (-94)) | ((~i63) & 93)) + ((i63 & 93) << 1);
            b = i64 % 128;
            int i65 = i64 % 2;
            int i66 = -i11;
            int i67 = iMax & i66;
            if (i62 >= ((((i67 - (~(-(-((iMax ^ i66) | i67))))) - 1) & (-4)) - (~(-i66))) - 1) {
                break;
            }
            int i68 = (i63 ^ 91) + ((i63 & 91) << 1);
            b = i68 % 128;
            int i69 = i68 % 2;
            int i70 = -(~(-(-i62)));
            l(bArr, (-2) - (((i ^ i70) + ((i70 & i) << 1)) ^ (-1)));
            int i71 = a;
            int i72 = ((i71 ^ 109) - (~((i71 & 109) << 1))) - 1;
            int i73 = i72 % 128;
            b = i73;
            if (i72 % 2 != 0) {
                i62 = (i62 ^ 3) + ((i62 & 3) << 1);
            } else {
                int i74 = i62 & 4;
                int i75 = (i62 | 4) & (~i74);
                int i76 = i74 << 1;
                i62 = (i75 ^ i76) + ((i75 & i76) << 1);
            }
            int i77 = (i73 ^ 39) + ((i73 & 39) << 1);
            a = i77 % 128;
            int i78 = i77 % 2;
        }
        while (i62 < iMax) {
            int i79 = a;
            int i80 = i79 & 29;
            int i81 = (i79 ^ 29) | i80;
            int i82 = (i80 & i81) + (i80 | i81);
            b = i82 % 128;
            int i83 = i82 % 2;
            byte[] bArr3 = this.c;
            int i84 = this.d;
            int i85 = i79 & 85;
            int i86 = (i85 - (~(-(-((i79 ^ 85) | i85))))) - 1;
            int i87 = i86 % 128;
            b = i87;
            int i88 = i86 % 2;
            int i89 = i84 & 1;
            int i90 = (i84 ^ 1) | i89;
            this.d = (i89 ^ i90) + ((i89 & i90) << 1);
            int i91 = (i62 - (~i)) - 1;
            int i92 = i87 + 9;
            a = i92 % 128;
            if (i92 % 2 == 0) {
                bArr3[i84] = bArr[i91];
                i3 = i62 & 125;
                i4 = i62 | 125;
            } else {
                bArr3[i84] = bArr[i91];
                int i93 = i62 & 1;
                i3 = ((i62 ^ 1) | i93) << 1;
                i4 = -((i62 | 1) & (~i93));
            }
            i62 = (i3 ^ i4) + ((i3 & i4) << 1);
        }
        this.e += (long) iMax;
        int i94 = a + 39;
        b = i94 % 128;
        int i95 = i94 % 2;
    }

    public abstract void g(long j);

    public void j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 47;
        b = i3 % 128;
        int i4 = i3 % 2;
        long j = this.e;
        int i5 = ((i2 ^ 101) | (i2 & 101)) << 1;
        int i6 = -(((~i2) & 101) | (i2 & (-102)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        byte b2 = -128;
        while (true) {
            e(b2);
            if (this.d == 0) {
                g(j << 3);
                k();
                int i9 = b + 101;
                a = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            int i11 = a;
            int i12 = ((i11 | 73) << 1) - (i11 ^ 73);
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (i11 & 111) + (i11 | 111);
            b = i14 % 128;
            int i15 = i14 % 2;
            b2 = 0;
        }
    }

    public abstract void k();

    public abstract void l(byte[] bArr, int i);

    public void m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 8) + (i2 | 8);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.e = 0L;
        this.d = 0;
        int i6 = ((i2 ^ 17) | (i2 & 17)) << 1;
        int i7 = -(((~i2) & 17) | (i2 & (-18)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        int i11 = i9 & 31;
        int i12 = -(-(i9 | 31));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 2 % 5;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i15 >= bArr.length) {
                break;
            }
            int i16 = b;
            int i17 = i16 & 21;
            int i18 = -(-((i16 ^ 21) | i17));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                bArr[i15] = 1;
                i15 += 17;
            } else {
                bArr[i15] = 0;
                int i20 = i15 & 1;
                i15 = i20 + ((i15 ^ 1) | i20);
            }
            int i21 = i16 & 117;
            int i22 = -(-(i16 | 117));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = a;
        int i26 = i25 & 97;
        int i27 = ((((i25 ^ 97) | i26) << 1) - (~(-((i25 | 97) & (~i26))))) - 1;
        b = i27 % 128;
        if (i27 % 2 != 0) {
            throw null;
        }
    }
}
