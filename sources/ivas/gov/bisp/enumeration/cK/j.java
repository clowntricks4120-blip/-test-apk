package ivas.gov.bisp.enumeration.cK;

import ivas.gov.bisp.enumeration.O.i;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 1;
    private static int b;
    public int c;
    public int d;
    public int[][] e;
    public int f;

    public j(int i, int[][] iArr) {
        int i2;
        int[] iArr2;
        int i3;
        int i4 = 0;
        int[] iArr3 = iArr[0];
        if (iArr3.length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.d = i;
        this.c = iArr.length;
        int i5 = a;
        int i6 = i5 & 13;
        int i7 = (i5 | 13) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        this.f = iArr3.length;
        int i12 = i & 31;
        if (i12 == 0) {
            int i13 = i10 & 117;
            int i14 = (i10 | 117) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            int i17 = i16 % 128;
            a = i17;
            if (i16 % 2 == 0) {
                int i18 = 97 / 0;
            }
            int i19 = i17 + 3;
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            i2 = -1;
        } else {
            i2 = (1 << i12) - 1;
            int i22 = i10 & 7;
            int i23 = ((i10 | 7) & (~i22)) + (i22 << 1);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 2 % 2;
            }
        }
        while (i4 < this.c) {
            int i25 = b;
            int i26 = i25 & 37;
            int i27 = (i26 - (~(-(-((i25 ^ 37) | i26))))) - 1;
            a = i27 % 128;
            if (i27 % 2 == 0) {
                iArr2 = iArr[i4];
                int i28 = this.f;
                i3 = (i28 << 1) - i28;
            } else {
                iArr2 = iArr[i4];
                i3 = this.f - 1;
            }
            int i29 = i25 & 83;
            int i30 = i29 + ((i25 ^ 83) | i29);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                iArr2[i3] = iArr2[i3] & i2;
                i4 += 76;
            } else {
                iArr2[i3] = iArr2[i3] & i2;
                i4++;
            }
            int i31 = 2 % 2;
        }
        this.e = iArr;
        int i32 = a;
        int i33 = (i32 & 99) + (i32 | 99);
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    public byte[] e() {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = 2 % 2;
        int i6 = a + 65;
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 != 0) {
            i = this.d;
            i2 = this.c;
            i3 = 40;
        } else {
            i = this.d;
            i2 = this.c;
            i3 = 8;
        }
        int i8 = ((i7 ^ 125) | (i7 & 125)) << 1;
        int i9 = -((i7 & (-126)) | ((~i7) & 125));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = (i ^ (-21)) + ((i & (-21)) << 1);
            int i12 = (((i11 ^ (-1)) + (i11 << 1)) * 5) << i2;
            i4 = (((i12 ^ 64) | (i12 & 64)) << 1) - (((~i12) & 64) | (i12 & (-65)));
        } else {
            int i13 = i & 7;
            int i14 = -(-((i ^ 7) | i13));
            int i15 = (((i13 & i14) + (i14 | i13)) >>> 3) * i2;
            int i16 = i15 & 8;
            int i17 = -(-(i15 | 8));
            i4 = (i16 ^ i17) + ((i17 & i16) << 1);
        }
        int i18 = (i7 ^ 25) + ((i7 & 25) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            bArr = new byte[i4];
            i.e(i2, bArr, 0);
        } else {
            bArr = new byte[i4];
            i.e(i2, bArr, 0);
        }
        i.e(this.d, bArr, 4);
        int i19 = this.d;
        int i20 = b;
        int i21 = (i20 & 97) + (i20 | 97);
        int i22 = i21 % 128;
        a = i22;
        int i23 = i21 % 2 == 0 ? i19 * 4 : i19 >>> 5;
        int i24 = i22 & 87;
        int i25 = (i24 - (~((i22 ^ 87) | i24))) - 1;
        b = i25 % 128;
        int i26 = i25 % 2;
        int i27 = 0;
        while (i27 < this.c) {
            int i28 = b;
            int i29 = i28 & 65;
            int i30 = ((i28 ^ 65) | i29) << 1;
            int i31 = -((~i29) & (i28 | 65));
            int i32 = (i30 & i31) + (i30 | i31);
            a = i32 % 128;
            int i33 = i32 % 2;
            int i34 = i28 + 16;
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
            int i37 = 0;
            while (i37 < i23) {
                int i38 = a;
                int i39 = (-2) - (((i38 & 66) + (i38 | 66)) ^ (-1));
                b = i39 % 128;
                if (i39 % 2 != 0) {
                    i.e(this.e[i27][i37], bArr, i3);
                    int i40 = 89 / 0;
                } else {
                    i.e(this.e[i27][i37], bArr, i3);
                }
                int i41 = a;
                int i42 = (((i41 | 54) << 1) - (i41 ^ 54)) - 1;
                b = i42 % 128;
                int i43 = i42 % 2;
                int i44 = (i37 & (-103)) + (i37 | (-103));
                i37 = ((i44 | 104) << 1) - (i44 ^ 104);
                int i45 = i3 & 4;
                i3 = (((i3 | 4) & (~i45)) - (~(-(-(i45 << 1))))) - 1;
                int i46 = i41 ^ 3;
                int i47 = (i41 & 3) << 1;
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                b = i48 % 128;
                int i49 = i48 % 2;
            }
            int i50 = a;
            int i51 = ((i50 & 56) + (i50 | 56)) - 1;
            b = i51 % 128;
            int i52 = i51 % 2;
            int i53 = 0;
            while (i53 < (i19 & 31)) {
                int i54 = b;
                int i55 = i54 + 87;
                a = i55 % 128;
                bArr[i3] = (byte) ((i55 % 2 == 0 ? this.e[i27][i23] / i53 : this.e[i27][i23] >>> i53) & 255);
                int i56 = i53 & 8;
                int i57 = i53 | 8;
                i53 = ((i57 & i56) << 1) + (i56 ^ i57);
                int i58 = i3 & 122;
                int i59 = (((i3 | 122) & (~i58)) - (~(i58 << 1))) - 1;
                int i60 = i59 & (-121);
                int i61 = -(-(i59 | (-121)));
                i3 = (i61 | i60) + (i60 & i61);
                int i62 = i54 & 81;
                int i63 = (i54 | 81) & (~i62);
                int i64 = -(-(i62 << 1));
                int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                a = i65 % 128;
                int i66 = i65 % 2;
            }
            i27++;
            int i67 = a;
            int i68 = (i67 ^ 15) + ((i67 & 15) << 1);
            b = i68 % 128;
            int i69 = i68 % 2;
        }
        int i70 = b;
        int i71 = (i70 & (-34)) | ((~i70) & 33);
        int i72 = (i70 & 33) << 1;
        int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
        a = i73 % 128;
        int i74 = i73 % 2;
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r8.f == r9.f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r8.f == r9.f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        r1 = r2 + 11;
        ivas.gov.bisp.enumeration.cK.j.a = r1 % 128;
        r1 = r1 % 2;
        r1 = r2 ^ 113;
        r2 = (r2 & 113) << 1;
        r3 = (r1 ^ r2) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.cK.j.a = r3 % 128;
        r3 = r3 % 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r1 >= r8.c) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cK.j.b;
        r3 = r2 & 21;
        r6 = ((~r3) & (r2 | 21)) + (r3 << 1);
        ivas.gov.bisp.enumeration.cK.j.a = r6 % 128;
        r6 = r6 % 2;
        r3 = r8.e[r1];
        r6 = r9.e[r1];
        r7 = ((r2 ^ 74) + ((r2 & 74) << 1)) - 1;
        ivas.gov.bisp.enumeration.cK.j.a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (ivas.gov.bisp.enumeration.p100w.r.E(r3, r6) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        r9 = ivas.gov.bisp.enumeration.cK.j.a + 19;
        r1 = r9 % 128;
        ivas.gov.bisp.enumeration.cK.j.b = r1;
        r9 = r9 % 2;
        r9 = (-2) - ((((r1 | 90) << 1) - (r1 ^ 90)) ^ (-1));
        ivas.gov.bisp.enumeration.cK.j.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        r1 = ((r1 & 1) - (~(-(-(r1 | 1))))) - 1;
        r2 = ivas.gov.bisp.enumeration.cK.j.a;
        r6 = r2 & 51;
        r3 = ((((r2 ^ 51) | r6) << 1) - (~(-((r2 | 51) & (~r6))))) - 1;
        ivas.gov.bisp.enumeration.cK.j.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        r9 = ivas.gov.bisp.enumeration.cK.j.b;
        r1 = (r9 & (-126)) | ((~r9) & 125);
        r9 = -(-((r9 & 125) << 1));
        r2 = (r1 ^ r9) + ((r9 & r1) << 1);
        ivas.gov.bisp.enumeration.cK.j.a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cK.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iG;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 10) + (i2 | 10);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.c * 31;
        int i7 = this.d;
        int i8 = i2 & 91;
        int i9 = ((i2 | 91) & (~i8)) + (i8 << 1);
        int i10 = i9 % 128;
        a = i10;
        if (i9 % 2 == 0) {
            iG = ((i6 << i7) * 69) / this.f;
        } else {
            int i11 = i6 & i7;
            int i12 = ((i11 - (~(-(-((i6 ^ i7) | i11))))) - 1) * 31;
            int i13 = -(-this.f);
            iG = (i12 | i13) + (i12 & i13);
        }
        int i14 = i10 + 53;
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i10 + 27;
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < this.c) {
            int i19 = b + 63;
            a = i19 % 128;
            int i20 = i19 % 2;
            iG = (iG * 31) + ivas.gov.bisp.enumeration.p064cj.j.g(this.e[i18]);
            int i21 = a;
            int i22 = (((i21 & (-106)) | ((~i21) & 105)) - (~(-(-((i21 & 105) << 1))))) - 1;
            b = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = i18 | (-31);
                i18 = (-2) - ((((i23 << 1) - ((~(i18 & (-31))) & i23)) + 46) ^ (-1));
            } else {
                int i24 = (i18 ^ 2) + ((i18 & 2) << 1);
                i18 = (i24 ^ (-1)) + (i24 << 1);
            }
        }
        int i25 = a;
        int i26 = i25 & 105;
        int i27 = (i25 | 105) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        b = i29 % 128;
        if (i29 % 2 == 0) {
            return iG;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = (((i2 ^ 77) | i3) << 1) - ((~i3) & (i2 | 77));
        a = i4 % 128;
        int i5 = i4 % 2 == 0 ? this.d & 16 : this.d & 31;
        int i6 = this.f;
        if (i5 != 0) {
            int i7 = i2 & 17;
            int i8 = i7 + ((i2 ^ 17) | i7);
            int i9 = i8 % 128;
            a = i9;
            if (i8 % 2 == 0) {
                int i10 = i6 ^ 137;
                int i11 = (i6 & 137) << 1;
                i6 = ((i10 ^ i11) + ((i11 & i10) << 1)) - 28;
            } else {
                int i12 = (((i6 & (-115)) | ((~i6) & 114)) - (~((i6 & 114) << 1))) - 1;
                i6 = (-2) - (((i12 ^ (-114)) + ((i12 & (-114)) << 1)) ^ (-1));
            }
            int i13 = i9 & 21;
            int i14 = (i9 | 21) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i18 = a;
        int i19 = (i18 & 91) + (i18 | 91);
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        while (i21 < this.c) {
            StringBuilder sb = new StringBuilder();
            sb.append(i21);
            int i22 = b;
            int i23 = i22 & 39;
            int i24 = (i22 | 39) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            a = i26 % 128;
            int i27 = i26 % 2;
            sb.append(": ");
            if (i27 == 0) {
                sb.toString();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = sb.toString();
            int i28 = b;
            int i29 = i28 & 123;
            int i30 = i29 + ((i28 ^ 123) | i29);
            a = i30 % 128;
            int i31 = i30 % 2;
            stringBuffer.append(string);
            int i32 = i31 == 0 ? 1 : 0;
            while (i32 < i6) {
                int i33 = a;
                int i34 = (i33 ^ 57) + ((i33 & 57) << 1);
                b = i34 % 128;
                int i35 = i34 % 2;
                int i36 = this.e[i21][i32];
                int i37 = i33 ^ 15;
                int i38 = ((i33 & 15) | i37) << 1;
                int i39 = -i37;
                int i40 = (i38 & i39) + (i38 | i39);
                b = i40 % 128;
                int i41 = i40 % 2;
                int i42 = 0;
                while (i42 < 32) {
                    int i43 = b;
                    int i44 = ((i43 ^ 6) + ((i43 & 6) << 1)) - 1;
                    int i45 = i44 % 128;
                    a = i45;
                    int i46 = i44 % 2;
                    if (((i36 >>> i42) & 1) == 0) {
                        int i47 = i45 & 27;
                        int i48 = ((((i45 ^ 27) | i47) << 1) - (~(-((i45 | 27) & (~i47))))) - 1;
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        stringBuffer.append('0');
                        int i50 = b;
                        int i51 = i50 | 49;
                        int i52 = (i51 << 1) - ((~(i50 & 49)) & i51);
                        a = i52 % 128;
                        int i53 = i52 % 2;
                    } else {
                        stringBuffer.append('1');
                        int i54 = a + 71;
                        b = i54 % 128;
                        int i55 = i54 % 2;
                    }
                    int i56 = i42 ^ 1;
                    int i57 = ((i42 & 1) | i56) << 1;
                    int i58 = -i56;
                    i42 = (i57 | i58) + (i57 & i58);
                    int i59 = b + 109;
                    a = i59 % 128;
                    int i60 = i59 % 2;
                }
                stringBuffer.append(' ');
                int i61 = i32 & (-114);
                int i62 = -(-((i32 ^ (-114)) | i61));
                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                int i64 = ((i63 ^ 115) | (i63 & 115)) << 1;
                int i65 = -((i63 & (-116)) | ((~i63) & 115));
                i32 = (i64 | i65) + (i64 & i65);
                int i66 = b;
                int i67 = i66 & 41;
                int i68 = (i66 ^ 41) | i67;
                int i69 = (i67 & i68) + (i68 | i67);
                a = i69 % 128;
                int i70 = i69 % 2;
            }
            int[] iArr = this.e[i21];
            int i71 = this.f;
            int i72 = b;
            int i73 = i72 + 45;
            a = i73 % 128;
            int i74 = i73 % 2;
            int i75 = iArr[(i71 ^ (-1)) + (i71 << 1)];
            int i76 = (-2) - ((((i72 | 86) << 1) - (i72 ^ 86)) ^ (-1));
            a = i76 % 128;
            int i77 = i76 % 2;
            int i78 = 0;
            while (i78 < i5) {
                int i79 = b;
                int i80 = i79 ^ 89;
                int i81 = ((((i79 & 89) | i80) << 1) - (~(-i80))) - 1;
                a = i81 % 128;
                int i82 = i81 % 2;
                if (((i75 >>> i78) & 1) == 0) {
                    int i83 = (i79 | 83) << 1;
                    int i84 = -(i79 ^ 83);
                    int i85 = (i83 & i84) + (i84 | i83);
                    a = i85 % 128;
                    int i86 = i85 % 2;
                    stringBuffer.append('0');
                    int i87 = b;
                    int i88 = i87 & 43;
                    int i89 = (i87 | 43) & (~i88);
                    int i90 = -(-(i88 << 1));
                    int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                    a = i91 % 128;
                    if (i91 % 2 == 0) {
                        int i92 = 4 % 4;
                    }
                } else {
                    stringBuffer.append('1');
                    int i93 = a;
                    int i94 = ((i93 ^ 47) | (i93 & 47)) << 1;
                    int i95 = -(((~i93) & 47) | (i93 & (-48)));
                    int i96 = (i94 & i95) + (i95 | i94);
                    b = i96 % 128;
                    int i97 = i96 % 2;
                }
                int i98 = (-2) - ((((i78 | 29) << 1) - (i78 ^ 29)) ^ (-1));
                int i99 = i98 & (-27);
                int i100 = (i98 ^ (-27)) | i99;
                i78 = ((i100 & i99) << 1) + (i99 ^ i100);
                int i101 = b;
                int i102 = (i101 | 73) << 1;
                int i103 = -(((~i101) & 73) | (i101 & (-74)));
                int i104 = (i102 & i103) + (i103 | i102);
                a = i104 % 128;
                int i105 = i104 % 2;
            }
            stringBuffer.append('\n');
            int i106 = (-2) - ((i21 - 75) ^ (-1));
            i21 = ((i106 & 77) - (~(-(-(i106 | 77))))) - 1;
            int i107 = b;
            int i108 = ((i107 | 42) << 1) - (i107 ^ 42);
            int i109 = (i108 ^ (-1)) + (i108 << 1);
            a = i109 % 128;
            int i110 = i109 % 2;
        }
        String string2 = stringBuffer.toString();
        int i111 = b;
        int i112 = i111 & 93;
        int i113 = ((i111 ^ 93) | i112) << 1;
        int i114 = -((i111 | 93) & (~i112));
        int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
        a = i115 % 128;
        int i116 = i115 % 2;
        return string2;
    }

    public j(j jVar) {
        this.d = jVar.d;
        this.c = jVar.c;
        this.f = jVar.f;
        this.e = new int[jVar.e.length][];
        int i = 2 % 2;
        int i2 = 0;
        while (true) {
            int[][] iArr = this.e;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = a;
            int i4 = i3 & 47;
            int i5 = ((i3 ^ 47) | i4) << 1;
            int i6 = -((i3 | 47) & (~i4));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            int[][] iArr2 = jVar.e;
            if (i8 != 0) {
                iArr[i2] = ivas.gov.bisp.enumeration.p100w.r.j(iArr2[i2]);
                int i9 = 0 / 0;
            } else {
                iArr[i2] = ivas.gov.bisp.enumeration.p100w.r.j(iArr2[i2]);
            }
            int i10 = i2 & (-54);
            int i11 = (i2 ^ (-54)) | i10;
            i2 = (i10 ^ i11) + ((i11 & i10) << 1) + 55;
            int i12 = a;
            int i13 = (i12 & 89) + (i12 | 89);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = i15 ^ 31;
        int i17 = (((i15 & 31) | i16) << 1) - i16;
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public j(byte[] bArr) {
        int length;
        int i;
        int i2;
        int i3;
        int[] iArr;
        char c;
        Class cls;
        int i4;
        int i5;
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.c = i.f(bArr, 0);
        int iF = i.f(bArr, 4);
        int i6 = a + 19;
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        this.d = iF;
        int i9 = this.c;
        if (i9 > 0) {
            int i10 = (((i7 ^ 21) | (i7 & 21)) << 1) - ((i7 & (-22)) | ((~i7) & 21));
            a = i10 % 128;
            if (i10 % 2 == 0) {
                length = bArr.length;
                i = iF / 102;
                i3 = 5;
                i2 = 59;
            } else {
                length = bArr.length;
                int i11 = iF & 7;
                i = (i11 << 1) + ((~i11) & (iF | 7));
                i2 = 8;
                i3 = 3;
            }
            int i12 = ((i7 ^ 77) | (i7 & 77)) << 1;
            int i13 = -((i7 & (-78)) | ((~i7) & 77));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            if ((i >>> i3) * i9 == (-2) - ((length - 7) ^ (-1))) {
                int i16 = (-2) - (((i7 ^ 50) + ((i7 & 50) << 1)) ^ (-1));
                a = i16 % 128;
                int i17 = i16 % 2;
                int i18 = (iF + 31) >>> 5;
                int i19 = ((i7 | 85) << 1) - (i7 ^ 85);
                int i20 = i19 % 128;
                a = i20;
                int i21 = i19 % 2;
                this.f = i18;
                if (i21 == 0) {
                    iArr = new int[2];
                    c = 0;
                } else {
                    iArr = new int[2];
                    c = 1;
                }
                int i22 = i20 & 23;
                int i23 = -(-((i20 ^ 23) | i22));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    iArr[c] = i18;
                    iArr[1] = i9;
                    cls = Integer.TYPE;
                } else {
                    iArr[c] = i18;
                    iArr[0] = i9;
                    cls = Integer.TYPE;
                }
                this.e = (int[][]) Array.newInstance((Class<?>) cls, iArr);
                int i25 = this.d;
                int i26 = b;
                int i27 = i26 & 73;
                int i28 = i27 + ((i26 ^ 73) | i27);
                a = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = i25 & 5;
                    i4 = ((((i25 ^ 5) | i29) << 1) - (~(-((~i29) & (i25 | 5))))) - 1;
                    i5 = 1;
                } else {
                    i4 = i25 >> 5;
                    i5 = 0;
                }
                int i30 = (i26 & 59) + (i26 | 59);
                a = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 2 % 2;
                }
                while (i5 < this.c) {
                    int i32 = a;
                    int i33 = i32 & 121;
                    int i34 = -(-((i32 ^ 121) | i33));
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    int i36 = i35 % 128;
                    b = i36;
                    int i37 = i35 % 2;
                    int i38 = i36 + 5;
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = 2 % 2;
                    int i41 = 0;
                    while (i41 < i4) {
                        int i42 = b;
                        int i43 = i42 ^ 53;
                        int i44 = ((i42 & 53) | i43) << 1;
                        int i45 = -i43;
                        int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                        a = i46 % 128;
                        if (i46 % 2 == 0) {
                            this.e[i5][i41] = i.f(bArr, i2);
                            int i47 = i41 & 85;
                            int i48 = (i41 ^ 85) | i47;
                            i41 = (i47 ^ i48) + ((i48 & i47) << 1);
                        } else {
                            this.e[i5][i41] = i.f(bArr, i2);
                            int i49 = i41 & (-25);
                            int i50 = (i49 - (~((i41 ^ (-25)) | i49))) - 1;
                            i41 = (i50 ^ 26) + ((i50 & 26) << 1);
                        }
                        i2 = (i2 ^ 4) + ((i2 & 4) << 1);
                        int i51 = a;
                        int i52 = i51 & 93;
                        int i53 = (i51 | 93) & (~i52);
                        int i54 = i52 << 1;
                        int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                        b = i55 % 128;
                        int i56 = i55 % 2;
                    }
                    int i57 = b;
                    int i58 = (((i57 | 38) << 1) - (i57 ^ 38)) - 1;
                    a = i58 % 128;
                    int i59 = i58 % 2;
                    int i60 = 0;
                    while (i60 < (i25 & 31)) {
                        int i61 = a;
                        int i62 = i61 & 31;
                        int i63 = (i61 ^ 31) | i62;
                        int i64 = (i62 & i63) + (i62 | i63);
                        b = i64 % 128;
                        if (i64 % 2 != 0) {
                            int i65 = this.e[i5][i4];
                            throw null;
                        }
                        int[] iArr2 = this.e[i5];
                        int i66 = iArr2[i4];
                        int i67 = ((i61 ^ 18) + ((i61 & 18) << 1)) - 1;
                        b = i67 % 128;
                        int i68 = (i67 % 2 != 0 ? bArr[i2] & 30098 : bArr[i2] & 255) << i60;
                        iArr2[i4] = (i66 | i68) & (~(i68 & i66));
                        int i69 = (-2) - ((i60 + 94) ^ (-1));
                        i60 = ((i69 & (-84)) + (i69 | (-84))) - 1;
                        int i70 = ((i2 ^ 1) | (i2 & 1)) << 1;
                        int i71 = -((i2 & (-2)) | ((~i2) & 1));
                        i2 = (i70 & i71) + (i70 | i71);
                        int i72 = i61 & 43;
                        int i73 = (i72 - (~(-(-((i61 ^ 43) | i72))))) - 1;
                        b = i73 % 128;
                        if (i73 % 2 != 0) {
                            int i74 = 5 % 2;
                        }
                    }
                    int i75 = i5 | (-58);
                    int i76 = ((i75 << 1) - (~(-(i75 & (~(i5 & (-58))))))) - 1;
                    int i77 = i76 ^ 59;
                    int i78 = (i76 & 59) << 1;
                    int i79 = (i77 | i78) + (i77 & i78);
                    int i80 = b + 3;
                    a = i80 % 128;
                    int i81 = i80 % 2;
                    i5 = i79;
                }
                int i82 = a;
                int i83 = (i82 & 41) + (i82 | 41);
                b = i83 % 128;
                if (i83 % 2 != 0) {
                    int i84 = 5 / 0;
                    return;
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
