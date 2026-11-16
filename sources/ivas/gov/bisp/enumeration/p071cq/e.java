package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class e extends j {
    private static int a = 0;
    private static int b = 1;
    public static final int[] f = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f91o = new int[64];
    public int p;

    static {
        int i = 1 & 123;
        int i2 = (i - (~((1 ^ 123) | i))) - 1;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public e() {
        m();
    }

    public static int h(int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 83;
        int i8 = i7 + ((i6 ^ 83) | i7);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = ~i;
            int i10 = ~i;
            int i11 = i9 & (i10 | i);
            int i12 = (~i3) & i11;
            int i13 = i3 & (~i11);
            int i14 = (i13 & i12) | (i12 ^ i13);
            int i15 = (i2 & i10) | ((~i2) & i);
            int i16 = i & i2;
            int i17 = (i16 & i15) | (i15 ^ i16);
            int i18 = i14 & i17;
            int i19 = (i17 | i14) & (~i18);
            i4 = (i19 & i18) | (i19 ^ i18);
        } else {
            int i20 = i3 & (~i);
            int i21 = i & i2;
            int i22 = i20 & i21;
            i4 = ((i21 ^ i20) | i22) & (~i22);
        }
        int i23 = i6 & 75;
        int i24 = (i23 - (~(-(-((i6 ^ 75) | i23))))) - 1;
        b = i24 % 128;
        int i25 = i24 % 2;
        return i4;
    }

    public static int i(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b + 105;
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 != 0) {
            i2 = (i >>> 122) & (i >> 123);
            i3 = 4;
        } else {
            i2 = (i << 10) | (i >>> 22);
            i3 = 2;
        }
        int i7 = i >>> i3;
        int i8 = i << 30;
        int i9 = i7 & i8;
        int i10 = (i7 | i8) & (~i9);
        int i11 = (i10 & i9) | (i10 ^ i9);
        int i12 = i >>> 13;
        int i13 = i6 + 80;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        int i15 = i14 % 128;
        b = i15;
        int i16 = i14 % 2;
        int i17 = i << 19;
        int i18 = (i17 & i12) | (i12 ^ i17);
        int i19 = i11 & i18;
        int i20 = ((i18 ^ i11) | i19) & (~i19);
        int i21 = i2 & i20;
        int i22 = ((i20 ^ i2) | i21) & (~i21);
        int i23 = i15 & 63;
        int i24 = -(-((i15 ^ 63) | i23));
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        a = i25 % 128;
        if (i25 % 2 == 0) {
            return i22;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int n(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 125;
        int i9 = (((i7 | 125) & (~i8)) - (~(i8 << 1))) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = ((~i2) & i) | ((~i) & i2);
            int i11 = i10 & i3;
            int i12 = ((i3 ^ i10) | i11) & (~i11);
            int i13 = i & i2;
            i4 = (~i13) & i12;
            i5 = i13 & (~i12);
        } else {
            int i14 = i & i2;
            int i15 = ((i ^ i2) | i14) & (~i14) & i3;
            i4 = ((~i14) & i15) | ((~i15) & i14);
            i5 = i15 & i14;
        }
        return i5 | i4;
    }

    public static int o(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 ^ 77) | (i5 & 77)) << 1;
        int i7 = -((i5 & (-78)) | ((~i5) & 77));
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = i << 46;
            int i10 = (i ^ (-7)) + ((i & (-7)) << 1);
            int i11 = i9 & i10;
            i2 = ((i9 ^ i10) | i11) & (~i11);
            i3 = 55;
        } else {
            int i12 = i << 7;
            int i13 = i >>> 25;
            i2 = (i12 & i13) | ((~i13) & i12) | ((~i12) & i13);
            i3 = 6;
        }
        int i14 = i5 & 11;
        int i15 = (i5 ^ 11) | i14;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i >>> i3;
        int i19 = i << 26;
        int i20 = i18 & i19;
        int i21 = ((i18 | i19) & (~i20)) | i20;
        int i22 = i5 & 121;
        int i23 = i22 + ((i5 ^ 121) | i22);
        int i24 = i23 % 128;
        a = i24;
        int i25 = i23 % 2;
        int i26 = (i << 21) | (i >>> 11);
        int i27 = (~i26) & i21;
        int i28 = i26 & (~i21);
        int i29 = (i28 & i27) | (i27 ^ i28);
        int i30 = i2 & i29;
        int i31 = ((i29 ^ i2) | i30) & (~i30);
        int i32 = i24 & 9;
        int i33 = (i24 | 9) & (~i32);
        int i34 = i32 << 1;
        int i35 = (i33 & i34) + (i33 | i34);
        b = i35 % 128;
        int i36 = i35 % 2;
        return i31;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int b(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 & (-62)) | ((~i5) & 61)) + ((i5 & 61) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        j();
        h.i(this.h, bArr, i);
        int i8 = b;
        int i9 = (-2) - (((i8 ^ 48) + ((i8 & 48) << 1)) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 != 0) {
            i2 = this.j;
            i3 = i / 5;
        } else {
            i2 = this.j;
            i3 = i + 4;
        }
        h.i(i2, bArr, i3);
        int i10 = this.i;
        int i11 = a;
        int i12 = i11 & 89;
        int i13 = ((i11 | 89) & (~i12)) + (i12 << 1);
        b = i13 % 128;
        h.i(i10, bArr, i13 % 2 == 0 ? i >>> 20 : (i & 8) + (i | 8));
        int i14 = this.k;
        int i15 = a;
        int i16 = i15 ^ 123;
        int i17 = ((i15 & 123) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = i & 12;
        int i22 = ((i ^ 12) | i21) << 1;
        int i23 = -((~i21) & (i | 12));
        h.i(i14, bArr, (i22 & i23) + (i22 | i23));
        int i24 = this.l;
        int i25 = a;
        int i26 = i25 & 103;
        int i27 = (i26 - (~(-(-((i25 ^ 103) | i26))))) - 1;
        b = i27 % 128;
        int i28 = i27 % 2;
        int i29 = i & 16;
        h.i(i24, bArr, ((((i ^ 16) | i29) << 1) - (~(-((~i29) & (i | 16))))) - 1);
        int i30 = this.g;
        int i31 = a + 19;
        b = i31 % 128;
        int i32 = i31 % 2;
        h.i(i30, bArr, (i ^ 20) + ((i & 20) << 1));
        int i33 = this.m;
        int i34 = (i & (-25)) | ((~i) & 24);
        int i35 = (i & 24) << 1;
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = b;
        int i38 = i37 & 101;
        int i39 = (i37 | 101) & (~i38);
        int i40 = -(-(i38 << 1));
        int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
        a = i41 % 128;
        int i42 = i41 % 2;
        h.i(i33, bArr, i36);
        int i43 = this.n;
        if (i42 != 0) {
            int i44 = i & (-82);
            int i45 = -(-(i | (-82)));
            h.i(i43, bArr, ((i44 | i45) << 1) - (i45 ^ i44));
        } else {
            h.i(i43, bArr, i + 28);
        }
        int i46 = a;
        int i47 = ((i46 | 47) << 1) - (((~i46) & 47) | (i46 & (-48)));
        b = i47 % 128;
        int i48 = i47 % 2;
        m();
        int i49 = i48 == 0 ? 118 : 32;
        int i50 = b;
        int i51 = i50 ^ 107;
        int i52 = (((i50 & 107) | i51) << 1) - i51;
        a = i52 % 128;
        if (i52 % 2 == 0) {
            return i49;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 35) + (i2 | 35);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return "SHA-256";
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int d() {
        int i = 2 % 2;
        int i2 = b + 99;
        a = i2 % 128;
        return i2 % 2 != 0 ? 16 : 32;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void g(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 44) + ((i2 & 44) << 1)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (this.p > 14) {
            int i6 = i4 & 115;
            int i7 = i4 | 115;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            k();
            if (i9 == 0) {
                throw null;
            }
            int i10 = a;
            int i11 = (i10 & 115) + (i10 | 115);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int[] iArr = this.f91o;
        iArr[14] = (int) (j >>> 32);
        int i13 = b;
        int i14 = (((i13 | 118) << 1) - (i13 ^ 118)) - 1;
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        iArr[15] = (int) j;
        int i17 = i15 & 15;
        int i18 = i17 + ((15 ^ i15) | i17);
        b = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = a;
        int i11 = i10 & 105;
        int i12 = ((i10 ^ 105) | i11) << 1;
        int i13 = -((i10 | 105) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        int i15 = i14 % 2 == 0 ? 98 : 16;
        while (i15 <= 63) {
            int i16 = b;
            int i17 = i16 & 23;
            int i18 = (i16 ^ 23) | i17;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            a = i20;
            int i21 = i19 % 2;
            int[] iArr = this.f91o;
            int i22 = i15 & (-2);
            int i23 = ((i15 ^ (-2)) | i22) << 1;
            int i24 = -((~i22) & (i15 | (-2)));
            int i25 = iArr[(i23 & i24) + (i23 | i24)];
            int i26 = ((i20 | 70) << 1) - (i20 ^ 70);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i15 & (-7);
            int i30 = (i15 ^ (-7)) | i29;
            int i31 = iArr[(i29 ^ i30) + ((i29 & i30) << 1)];
            int i32 = iArr[((i15 | (-15)) << 1) - (i15 ^ (-15))];
            int i33 = i20 & 9;
            int i34 = (i20 | 9) & (~i33);
            int i35 = i33 << 1;
            int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
            int i37 = i36 % 128;
            b = i37;
            if (i36 % 2 == 0) {
                i4 = i25 / 15;
                i6 = 82;
                i5 = (i25 >>> 17) & (i25 << 41);
            } else {
                i4 = i25 >>> 10;
                int i38 = i25 >>> 17;
                int i39 = i25 << 15;
                int i40 = i38 & i39;
                int i41 = (i38 | i39) & (~i40);
                i5 = (i41 & i40) | (i41 ^ i40);
                i6 = 19;
            }
            int i42 = (i37 & 15) + (i37 | 15);
            a = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = i25 / i6;
                int i44 = i25 % 96;
                int i45 = i43 & i44;
                int i46 = (i43 | i44) & (~i45);
                int i47 = (i46 & i45) | (i46 ^ i45);
                int i48 = i5 & i47;
                int i49 = (i47 | i5) & (~i48);
                i7 = (((i49 & i48) | (i49 ^ i48)) & i4) / i31;
                i8 = i32 / 5;
            } else {
                int i50 = i25 >>> i6;
                int i51 = i25 << 13;
                int i52 = i50 & i51;
                int i53 = (i50 | i51) & (~i52);
                int i54 = (i53 & i52) | (i53 ^ i52);
                int i55 = (i54 & (~i5)) | ((~i54) & i5);
                int i56 = i4 & i55;
                int i57 = ((i55 ^ i4) | i56) & (~i56);
                int i58 = -(-i31);
                int i59 = i57 ^ i58;
                int i60 = ((i57 & i58) | i59) << 1;
                int i61 = -i59;
                i7 = (i60 | i61) + (i60 & i61);
                i8 = i32 >>> 3;
            }
            int i62 = i32 >>> 7;
            int i63 = i32 << 25;
            int i64 = i62 & i63;
            int i65 = (i62 | i63) & (~i64);
            int i66 = (i65 & i64) | (i65 ^ i64);
            int i67 = i32 >>> 18;
            int i68 = ((i37 | 38) << 1) - (i37 ^ 38);
            int i69 = (i68 ^ (-1)) + (i68 << 1);
            int i70 = i69 % 128;
            a = i70;
            if (i69 % 2 != 0) {
                int i71 = i32 % 20;
                int i72 = (i67 ^ i71) | (i71 & i67);
                int i73 = i66 & i72;
                int i74 = ((i72 ^ i66) | i73) & (~i73);
                int i75 = i8 & i74;
                int i76 = -(((i74 ^ i8) | i75) & (~i75));
                int i77 = i7 & i76;
                int i78 = -(-((i76 ^ i7) | i77));
                iArr[i15] = ((i77 & i78) + (i78 | i77)) << iArr[i15 / 16];
            } else {
                int i79 = i32 << 14;
                int i80 = i67 ^ i79;
                int i81 = i79 & i67;
                int i82 = (i81 & i80) | (i80 ^ i81);
                int i83 = (i82 | i66) & (~(i66 & i82));
                int i84 = (~i83) & i8;
                int i85 = i83 & (~i8);
                int i86 = -(~(-(-((i85 & i84) | (i84 ^ i85)))));
                int i87 = (-2) - ((((i7 | i86) << 1) - (i86 ^ i7)) ^ (-1));
                int i88 = i15 - 15;
                int i89 = -(-iArr[(i88 ^ (-1)) + (i88 << 1)]);
                iArr[i15] = ((((i87 ^ i89) | (i87 & i89)) << 1) - (~(-(((~i87) & i89) | ((~i89) & i87))))) - 1;
            }
            int i90 = (((i70 | 6) << 1) - (i70 ^ 6)) - 1;
            b = i90 % 128;
            if (i90 % 2 == 0) {
                int i91 = (i15 & (-130)) | ((~i15) & 129);
                int i92 = (i15 & 129) << 1;
                int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                int i94 = i93 ^ (-104);
                i15 = (((i93 & (-104)) | i94) << 1) - i94;
            } else {
                int i95 = i15 ^ 1;
                int i96 = (i15 & 1) << 1;
                i15 = (i95 ^ i96) + ((i96 & i95) << 1);
            }
        }
        int i97 = this.h;
        int i98 = this.j;
        int i99 = this.i;
        int i100 = b;
        int i101 = i100 + 91;
        a = i101 % 128;
        if (i101 % 2 != 0) {
            i = this.k;
            i2 = this.l;
            i3 = this.g;
            int i102 = 56 / 0;
        } else {
            i = this.k;
            i2 = this.l;
            i3 = this.g;
        }
        int i103 = this.m;
        int i104 = this.n;
        int i105 = i100 + 53;
        a = i105 % 128;
        int i106 = i105 % 2;
        int i107 = 0;
        int i108 = 0;
        while (i107 < 8) {
            int i109 = a;
            int i110 = (i109 & 5) + (i109 | 5);
            b = i110 % 128;
            int i111 = i110 % 2;
            int iO = o(i2);
            int iH = h(i2, i3, i103);
            int[] iArr2 = f;
            int i112 = iH - (~(-(-iO)));
            int i113 = (i112 ^ (-1)) + (i112 << 1);
            int i114 = -(~iArr2[i108]);
            int i115 = ((i113 ^ i114) + ((i113 & i114) << 1)) - 1;
            int i116 = this.f91o[i108];
            int i117 = ((i115 | i116) << 1) - (i115 ^ i116);
            int i118 = -(-i104);
            int i119 = ((((~i117) & i118) | ((~i118) & i117)) - (~((i118 & i117) << 1))) - 1;
            int i120 = (i ^ i119) + ((i & i119) << 1);
            int i121 = i(i97);
            int iN = n(i97, i98, i99);
            int i122 = -(~(-(-i121)));
            int i123 = (((iN | i122) << 1) - (i122 ^ iN)) - 1;
            int i124 = b;
            int i125 = i124 & 73;
            int i126 = (~i125) & (i124 | 73);
            int i127 = -(-(i125 << 1));
            int i128 = ((i126 | i127) << 1) - (i126 ^ i127);
            a = i128 % 128;
            int i129 = i128 % 2;
            int i130 = i123 & i119;
            int i131 = ((i123 ^ i119) | i130) << 1;
            int i132 = -((~i130) & (i119 | i123));
            int i133 = (i131 & i132) + (i131 | i132);
            int i134 = i108 | (-111);
            int i135 = i134 << 1;
            int i136 = -(i134 & (~(i108 & (-111))));
            int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
            int i138 = (i137 & (-113)) | ((~i137) & 112);
            int i139 = -(-((i137 & 112) << 1));
            int i140 = (i138 ^ i139) + ((i138 & i139) << 1);
            int iO2 = o(i120);
            int iH2 = h(i120, i2, i3);
            int i141 = -(-iO2);
            int i142 = ((iH2 | i141) << 1) - (i141 ^ iH2);
            int i143 = -(-iArr2[i140]);
            int i144 = i142 & i143;
            int i145 = ((i143 | i142) & (~i144)) + (i144 << 1);
            int i146 = -(-this.f91o[i140]);
            int i147 = i145 & i146;
            int i148 = -(-((i145 ^ i146) | i147));
            int i149 = (i147 ^ i148) + ((i148 & i147) << 1);
            int i150 = -(-i103);
            int i151 = i149 & i150;
            int i152 = (i150 | i149) & (~i151);
            int i153 = -(-(i151 << 1));
            int i154 = ((i152 | i153) << 1) - (i152 ^ i153);
            int i155 = -(-i154);
            int i156 = i99 & i155;
            int i157 = (((i99 ^ i155) | i156) << 1) - ((i155 | i99) & (~i156));
            int i158 = i(i133);
            int iN2 = n(i133, i97, i98);
            int i159 = -(-i158);
            int i160 = ((iN2 ^ i159) | (iN2 & i159)) << 1;
            int i161 = -((i159 & (~iN2)) | ((~i159) & iN2));
            int i162 = (i160 & i161) + (i161 | i160);
            int i163 = -(~i154);
            int i164 = (-2) - ((((i162 | i163) << 1) - (i163 ^ i162)) ^ (-1));
            int i165 = b;
            int i166 = ((i165 & (-30)) | ((~i165) & 29)) + ((i165 & 29) << 1);
            a = i166 % 128;
            int i167 = i166 % 2;
            int i168 = ((i140 & 2) + (i140 | 2)) - 1;
            int iO3 = o(i157);
            int iH3 = h(i157, i120, i2);
            int i169 = -(-iO3);
            int i170 = iH3 ^ i169;
            int i171 = -(-((i169 & iH3) << 1));
            int i172 = (i170 & i171) + (i171 | i170);
            int i173 = iArr2[i168];
            int i174 = i172 & i173;
            int i175 = ((((i173 | i172) & (~i174)) + (i174 << 1)) - (~(-(~(-(-this.f91o[i168])))))) - 2;
            int i176 = i175 & i3;
            int i177 = -(-((i3 ^ i175) | i176));
            int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
            int i179 = i98 + i178;
            int i180 = i(i164);
            int iN3 = n(i164, i133, i97);
            int i181 = ((iN3 ^ i180) - (~(-(-((i180 & iN3) << 1))))) - 1;
            int i182 = -(-i178);
            int i183 = ((i181 | i182) << 1) - (i182 ^ i181);
            int i184 = b;
            int i185 = i184 & 29;
            int i186 = ((((i184 ^ 29) | i185) << 1) - (~(-((i184 | 29) & (~i185))))) - 1;
            a = i186 % 128;
            int i187 = i186 % 2;
            int i188 = (((i168 | (-72)) << 1) - (i168 ^ (-72))) - 1;
            int i189 = i188 & 74;
            int i190 = ((i188 ^ 74) | i189) << 1;
            int i191 = -((i188 | 74) & (~i189));
            int i192 = ((i190 | i191) << 1) - (i190 ^ i191);
            int iO4 = o(i179);
            int iH4 = h(i179, i157, i120);
            int i193 = iH4 & iO4;
            int i194 = (iO4 | iH4) & (~i193);
            int i195 = i193 << 1;
            int i196 = (i194 ^ i195) + ((i194 & i195) << 1);
            int i197 = -(-iArr2[i192]);
            int i198 = i196 & i197;
            int i199 = (((i197 | i196) & (~i198)) - (~(i198 << 1))) - 1;
            int i200 = this.f91o[i192];
            int i201 = (i199 & i200) + (i199 | i200);
            int i202 = -(-i2);
            int i203 = i201 ^ i202;
            int i204 = (i202 & i201) << 1;
            int i205 = (i203 & i204) + (i204 | i203);
            int i206 = i97 & i205;
            int i207 = (i97 ^ i205) | i206;
            int i208 = ((i206 | i207) << 1) - (i207 ^ i206);
            int i209 = i(i183);
            int iN4 = n(i183, i164, i133);
            int i210 = (((((~i209) & iN4) | ((~iN4) & i209)) + ((i209 & iN4) << 1)) - (~(-(~i205)))) - 1;
            int i211 = (i210 ^ (-1)) + (i210 << 1);
            int i212 = i192 & 1;
            int i213 = -(-((i192 ^ 1) | i212));
            int i214 = (i212 & i213) + (i212 | i213);
            int iO5 = o(i208);
            int i215 = b + 55;
            a = i215 % 128;
            int i216 = i215 % 2;
            int iH5 = (h(i208, i179, i157) - (~(-(~iO5)))) - 1;
            int i217 = (iH5 ^ (-1)) + (iH5 << 1);
            int i218 = iArr2[i214];
            int i219 = i217 & i218;
            int i220 = -(-((i217 ^ i218) | i219));
            int i221 = (i219 & i220) + (i220 | i219);
            int i222 = -(-this.f91o[i214]);
            int i223 = i221 & i222;
            int i224 = -(-((i222 ^ i221) | i223));
            int i225 = (i223 ^ i224) + ((i224 & i223) << 1);
            int i226 = (i225 | i120) << 1;
            int i227 = -((i120 & (~i225)) | ((~i120) & i225));
            int i228 = -(-((i226 & i227) + (i227 | i226)));
            int i229 = ((i133 | i228) << 1) - (i133 ^ i228);
            int i230 = i(i211);
            int iN5 = n(i211, i183, i164);
            int i231 = -(~i230);
            int i232 = ((iN5 | i231) << 1) - (i231 ^ iN5);
            int i233 = (i232 ^ (-1)) + (i232 << 1);
            int i234 = (i228 | i233) + (i233 & i228);
            int i235 = (i214 | (-72)) << 1;
            int i236 = -((i214 & 71) | ((~i214) & (-72)));
            int i237 = (i235 ^ i236) + ((i235 & i236) << 1);
            int i238 = i237 ^ 73;
            int i239 = (i237 & 73) << 1;
            int i240 = (i238 & i239) + (i238 | i239);
            int iO6 = o(i229);
            int i241 = b;
            int i242 = i241 | 85;
            int i243 = ((i242 << 1) - (~(-((~(i241 & 85)) & i242)))) - 1;
            a = i243 % 128;
            int i244 = i243 % 2;
            int iH6 = h(i229, i208, i179);
            int i245 = -(-iO6);
            int i246 = iH6 & i245;
            int i247 = (i245 ^ iH6) | i246;
            int i248 = (i246 ^ i247) + ((i247 & i246) << 1);
            int i249 = iArr2[i240];
            int i250 = (((i248 | i249) << 1) - (~(-((i249 & (~i248)) | ((~i249) & i248))))) - 1;
            int i251 = -(-this.f91o[i240]);
            int i252 = i250 & i251;
            int i253 = i252 + ((i251 ^ i250) | i252);
            int i254 = ((i253 ^ i157) | (i253 & i157)) << 1;
            int i255 = -((i157 & (~i253)) | ((~i157) & i253));
            int i256 = ((i254 | i255) << 1) - (i255 ^ i254);
            int i257 = -(-i256);
            int i258 = i164 & i257;
            int i259 = (i258 - (~(-(-((i164 ^ i257) | i258))))) - 1;
            int i260 = i(i234);
            int iN6 = n(i234, i211, i183);
            int i261 = -(-i260);
            int i262 = iN6 & i261;
            int i263 = i262 + ((i261 ^ iN6) | i262);
            int i264 = (i263 & i256) + (i263 | i256);
            int i265 = ((i240 ^ 2) + ((i240 & 2) << 1)) - 1;
            int iO7 = o(i259);
            int i266 = a;
            int i267 = ((((i266 ^ 7) | (i266 & 7)) << 1) - (~(-((7 & (~i266)) | (i266 & (-8)))))) - 1;
            b = i267 % 128;
            int i268 = i267 % 2;
            int iH7 = h(i259, i229, i208);
            int i269 = -(-iO7);
            int i270 = iH7 & i269;
            int i271 = i270 + ((i269 ^ iH7) | i270);
            int i272 = iArr2[i265];
            int i273 = ((~i272) & i271) | ((~i271) & i272);
            int i274 = -(-((i272 & i271) << 1));
            int i275 = (i273 ^ i274) + ((i274 & i273) << 1);
            int i276 = this.f91o[i265];
            int i277 = ((~i276) & i275) | ((~i275) & i276);
            int i278 = (i276 & i275) << 1;
            int i279 = (i277 & i278) + (i278 | i277);
            int i280 = -(-i179);
            int i281 = ((((~i280) & i279) | ((~i279) & i280)) - (~(-(-((i280 & i279) << 1))))) - 1;
            int i282 = (i183 - (~i281)) - 1;
            int iN7 = (n(i264, i234, i211) - (~(-(~(-(-i(i264))))))) - 1;
            int i283 = (iN7 ^ (-1)) + (iN7 << 1);
            int i284 = -(-i281);
            int i285 = i283 & i284;
            int i286 = ((i283 ^ i284) | i285) << 1;
            int i287 = -((i284 | i283) & (~i285));
            int i288 = (i287 | i286) + (i286 & i287);
            int i289 = (((i265 ^ (-5)) | (i265 & (-5))) << 1) - (((~i265) & (-5)) | (i265 & 4));
            int i290 = ((i289 & 7) + (i289 | 7)) - 1;
            int iO8 = o(i282);
            int i291 = b;
            int i292 = (i291 | 19) << 1;
            int i293 = -(((~i291) & 19) | (i291 & (-20)));
            int i294 = ((i292 | i293) << 1) - (i293 ^ i292);
            a = i294 % 128;
            int i295 = i294 % 2;
            int iH8 = h(i282, i259, i229);
            int i296 = -(~(-(-iO8)));
            int i297 = (((iH8 | i296) << 1) - (i296 ^ iH8)) - 1;
            int i298 = -(-iArr2[i290]);
            int i299 = ((i297 | i298) << 1) - (i298 ^ i297);
            int i300 = -(-this.f91o[i290]);
            int i301 = (i299 ^ i300) + ((i300 & i299) << 1);
            int i302 = -(-i208);
            int i303 = i301 & i302;
            int i304 = (i302 | i301) & (~i303);
            int i305 = -(-(i303 << 1));
            int i306 = ((i304 | i305) << 1) - (i304 ^ i305);
            int i307 = i(i288);
            int iN8 = n(i288, i264, i234);
            int i308 = i290 & 1;
            i108 = (i308 - (~(-(-((i290 ^ 1) | i308))))) - 1;
            int i309 = (i107 | 1) << 1;
            int i310 = -(((~i107) & 1) | (i107 & (-2)));
            i107 = ((i309 | i310) << 1) - (i310 ^ i309);
            int i311 = i211 & i306;
            int i312 = (i311 - (~(-(-((i211 ^ i306) | i311))))) - 1;
            int i313 = -(-i307);
            int i314 = iN8 | i313;
            int i315 = ((i314 << 1) - (~(-((~(i313 & iN8)) & i314)))) - 1;
            int i316 = i315 ^ i306;
            int i317 = -(-((i315 & i306) << 1));
            int i318 = ((i316 & i317) << 1) + (i316 ^ i317);
            int i319 = b;
            int i320 = (i319 ^ 85) + ((i319 & 85) << 1);
            a = i320 % 128;
            int i321 = i320 % 2;
            i2 = i312;
            i103 = i259;
            i104 = i229;
            i99 = i264;
            i97 = i318;
            i = i234;
            i3 = i282;
            i98 = i288;
        }
        int i322 = this.h;
        int i323 = -(~i97);
        this.h = ((i322 & i323) + (i322 | i323)) - 1;
        int i324 = this.j;
        int i325 = a;
        int i326 = i325 ^ 65;
        int i327 = ((i325 & 65) | i326) << 1;
        int i328 = -i326;
        int i329 = (i327 ^ i328) + ((i328 & i327) << 1);
        b = i329 % 128;
        if (i329 % 2 == 0) {
            this.j = i324 * i98;
            this.i >>= i99;
        } else {
            int i330 = -(-i98);
            int i331 = i324 & i330;
            int i332 = i324 | i330;
            this.j = ((i331 | i332) << 1) - (i332 ^ i331);
            int i333 = this.i;
            int i334 = i333 & i99;
            this.i = i334 + ((i333 ^ i99) | i334);
        }
        int i335 = (i325 & 10) + (i325 | 10);
        int i336 = (i335 ^ (-1)) + (i335 << 1);
        int i337 = i336 % 128;
        b = i337;
        if (i336 % 2 == 0) {
            this.k /= i;
        } else {
            int i338 = this.k;
            int i339 = -(-i);
            this.k = (i338 ^ i339) + ((i338 & i339) << 1);
        }
        int i340 = this.l;
        int i341 = -(-i2);
        int i342 = i340 & i341;
        int i343 = i340 | i341;
        this.l = ((i342 | i343) << 1) - (i343 ^ i342);
        int i344 = this.g;
        int i345 = -(-i3);
        this.g = ((((~i345) & i344) | ((~i344) & i345)) - (~(-(-((i344 & i345) << 1))))) - 1;
        int i346 = i337 & 107;
        int i347 = ((((i337 ^ 107) | i346) << 1) - (~(-((~i346) & (i337 | 107))))) - 1;
        a = i347 % 128;
        this.m = i347 % 2 != 0 ? this.m >>> i103 : (-2) - (((this.m - (~(-(~i103)))) - 1) ^ (-1));
        int i348 = this.n;
        int i349 = i337 & 25;
        int i350 = ((~i349) & (i337 | 25)) + (i349 << 1);
        a = i350 % 128;
        int i351 = i350 % 2;
        this.n = (((i348 | i104) << 1) - (~(-(i348 ^ i104)))) - 1;
        this.p = 0;
        int i352 = i337 & 123;
        int i353 = ((i337 ^ 123) | i352) << 1;
        int i354 = -((i337 | 123) & (~i352));
        int i355 = (i353 ^ i354) + ((i354 & i353) << 1);
        a = i355 % 128;
        int i356 = i355 % 2;
        int i357 = 0;
        while (i357 < 16) {
            int i358 = a + 57;
            int i359 = i358 % 128;
            b = i359;
            int i360 = i358 % 2;
            this.f91o[i357] = 0;
            i357 = ((i357 | 1) << 1) - (((~i357) & 1) | (i357 & (-2)));
            int i361 = (i359 ^ 9) + ((i359 & 9) << 1);
            a = i361 % 128;
            int i362 = i361 % 2;
        }
        int i363 = a;
        int i364 = ((i363 ^ 35) | (i363 & 35)) << 1;
        int i365 = -(((~i363) & 35) | (i363 & (-36)));
        int i366 = (i364 & i365) + (i365 | i364);
        b = i366 % 128;
        int i367 = i366 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void l(byte[] bArr, int i) {
        byte b2;
        int i2;
        int i3;
        int i4;
        byte b3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = b;
        int i11 = (-2) - (((i10 ^ 76) + ((i10 & 76) << 1)) ^ (-1));
        a = i11 % 128;
        if (i11 % 2 != 0) {
            b2 = bArr[i];
            i2 = i >> 1;
        } else {
            b2 = bArr[i];
            i2 = (i | 1) + (i & 1);
        }
        byte b4 = bArr[i2];
        int i12 = i2 & 1;
        int i13 = i12 + ((i2 ^ 1) | i12);
        byte b5 = bArr[i13];
        int i14 = i10 & 99;
        int i15 = (i10 ^ 99) | i14;
        int i16 = (i14 & i15) + (i14 | i15);
        a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i13 & 1;
        byte b6 = bArr[(((i13 | 1) & (~i18)) - (~(i18 << 1))) - 1];
        int[] iArr = this.f91o;
        int i19 = i10 & 53;
        int i20 = (i10 ^ 53) | i19;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        int i22 = i21 % 128;
        a = i22;
        int i23 = i21 % 2;
        int i24 = this.p;
        int i25 = i22 & 67;
        int i26 = (~i25) & (i22 | 67);
        int i27 = -(-(i25 << 1));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            i3 = b6 & 6909;
            i4 = b2 << 32;
            b3 = 28383;
        } else {
            i3 = b6 & 255;
            i4 = b2 << 24;
            b3 = 255;
        }
        int i29 = (((i22 | 24) << 1) - (i22 ^ 24)) - 1;
        int i30 = i29 % 128;
        b = i30;
        if (i29 % 2 == 0) {
            int i31 = (~b3) & b4;
            int i32 = (~b4) & b3;
            i5 = i4 ^ (((i32 & i31) | (i31 ^ i32)) * 40);
            int i33 = b5 ^ 19730;
            int i34 = b5 & 19730;
            i6 = (i34 & i33) | (i33 ^ i34);
            i7 = 20;
        } else {
            int i35 = (b4 & b3) << 16;
            int i36 = i4 ^ i35;
            int i37 = i4 & i35;
            i5 = (i37 & i36) | (i36 ^ i37);
            i6 = b5 & 255;
            i7 = 8;
        }
        int i38 = (i30 ^ 89) + ((i30 & 89) << 1);
        a = i38 % 128;
        if (i38 % 2 != 0) {
            int i39 = i6 >> i7;
            iArr[i24] = i3 & ((i39 & (~i5)) | ((~i39) & i5));
            i8 = i24 >> 1;
        } else {
            int i40 = i6 << i7;
            int i41 = i5 & i40;
            int i42 = (i40 | i5) & (~i41);
            int i43 = (i42 & i41) | (i42 ^ i41);
            int i44 = i3 & i43;
            iArr[i24] = ((i3 | i43) & (~i44)) | i44;
            i8 = i24 + 1;
        }
        this.p = i8;
        if (i8 == 16) {
            int i45 = ((i30 | 19) << 1) - (i30 ^ 19);
            a = i45 % 128;
            int i46 = i45 % 2;
            k();
            int i47 = a + 103;
            b = i47 % 128;
            if (i47 % 2 == 0) {
                int i48 = 4 / 3;
            }
        }
        int i49 = a;
        int i50 = i49 & 61;
        int i51 = (i49 ^ 61) | i50;
        int i52 = (i50 & i51) + (i51 | i50);
        b = i52 % 128;
        if (i52 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void m() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 77;
        int i5 = -(-((i3 ^ 77) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        super.m();
        this.h = 1779033703;
        if (i7 == 0) {
            obj.hashCode();
            throw null;
        }
        this.j = -1150833019;
        this.i = 1013904242;
        this.k = -1521486534;
        int i8 = b;
        int i9 = i8 & 15;
        int i10 = (i9 - (~((i8 ^ 15) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        this.l = 1359893119;
        this.g = -1694144372;
        if (i11 != 0) {
            throw null;
        }
        int i12 = i8 ^ 93;
        int i13 = ((i8 & 93) | i12) << 1;
        int i14 = -i12;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        this.m = 528734635;
        this.n = 1541459225;
        this.p = 0;
        int i17 = i8 + 33;
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (true) {
            int[] iArr = this.f91o;
            if (i19 == iArr.length) {
                int i20 = a + 99;
                b = i20 % 128;
                int i21 = i20 % 2;
                return;
            }
            int i22 = b + 125;
            a = i22 % 128;
            if (i22 % 2 != 0) {
                iArr[i19] = 0;
                int i23 = ((i19 & 15) | ((~i19) & (-16))) + ((i19 & (-16)) << 1);
                int i24 = (i23 | 80) << 1;
                int i25 = -(((~i23) & 80) | (i23 & (-81)));
                i = ((i24 | i25) << 1) - (i24 ^ i25);
            } else {
                iArr[i19] = 0;
                int i26 = i19 & 1;
                int i27 = (i19 ^ 1) | i26;
                i = (i26 & i27) + (i27 | i26);
            }
            i19 = i;
        }
    }
}
