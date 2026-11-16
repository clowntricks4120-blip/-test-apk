package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class h extends j {
    private static int a = 1;
    private static int b;
    public int[] f = new int[80];
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public h() {
        m();
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int b(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 29;
        int i5 = (i3 & 29) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        j();
        ivas.gov.bisp.enumeration.p096p.h.i(this.g, bArr, i);
        int i8 = b;
        int i9 = (((i8 | 88) << 1) - (i8 ^ 88)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i & 4;
        int i12 = -(-((i ^ 4) | i11));
        ivas.gov.bisp.enumeration.p096p.h.i(this.i, bArr, (i11 ^ i12) + ((i11 & i12) << 1));
        int i13 = a;
        int i14 = i13 & 11;
        int i15 = -(-(i13 | 11));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = this.h;
        int i19 = ~i;
        ivas.gov.bisp.enumeration.p096p.h.i(i18, bArr, ((i | 8) << 1) - ((i & (-9)) | (8 & i19)));
        int i20 = a;
        int i21 = ((((i20 ^ 41) | (i20 & 41)) << 1) - (~(-(((~i20) & 41) | (i20 & (-42)))))) - 1;
        b = i21 % 128;
        ivas.gov.bisp.enumeration.p096p.h.i(this.j, bArr, i21 % 2 != 0 ? i >>> 89 : (-2) - ((i + 13) ^ (-1)));
        int i22 = b;
        int i23 = i22 ^ 5;
        int i24 = ((((i22 & 5) | i23) << 1) - (~(-i23))) - 1;
        a = i24 % 128;
        int i25 = i24 % 2;
        int i26 = ((i ^ 16) | (i & 16)) << 1;
        int i27 = -((i & (-17)) | (16 & i19));
        ivas.gov.bisp.enumeration.p096p.h.i(this.k, bArr, ((i26 | i27) << 1) - (i27 ^ i26));
        int i28 = b + 65;
        a = i28 % 128;
        int i29 = i28 % 2;
        m();
        int i30 = a + 101;
        b = i30 % 128;
        if (i30 % 2 != 0) {
            int i31 = 78 / 0;
        }
        return 20;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 21;
        int i4 = (i2 ^ 21) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = (i2 ^ 105) + ((i2 & 105) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return "SHA-1";
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 38) << 1) - (i2 ^ 38)) ^ (-1));
        a = i3 % 128;
        return i3 % 2 == 0 ? 6 : 20;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void g(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = (i2 | 7) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.l;
        if (i7 != 0 ? i8 > 14 : i8 > 70) {
            k();
            int i9 = b;
            int i10 = i9 & 1;
            int i11 = ((i9 | 1) & (~i10)) + (i10 << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 / 2;
            }
        }
        int[] iArr = this.f;
        iArr[14] = (int) (j >>> 32);
        int i13 = b;
        int i14 = i13 + 11;
        a = i14 % 128;
        int i15 = i14 % 2;
        iArr[15] = (int) j;
        int i16 = i13 & 7;
        int i17 = -(-((i13 ^ 7) | i16));
        int i18 = (i16 & i17) + (i16 | i17);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void k() {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        int i12;
        int iF;
        int i13;
        int i14;
        int i15;
        int iF2;
        int i16;
        int i17;
        int iF3;
        int i18;
        int i19;
        int i20;
        int i21;
        int iN;
        int[] iArr3;
        int i22;
        int iF4;
        int iF5;
        int i23;
        int iN2;
        int i24;
        int i25;
        int[] iArr4;
        int i26;
        int i27 = 2;
        int i28 = 2 % 2;
        int i29 = b;
        int i30 = i29 & 53;
        int i31 = -(-((i29 ^ 53) | i30));
        int i32 = (i30 & i31) + (i31 | i30);
        int i33 = i32 % 128;
        a = i33;
        int i34 = i32 % 2;
        int i35 = ((i33 ^ 21) | (i33 & 21)) << 1;
        int i36 = -(((~i33) & 21) | (i33 & (-22)));
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        b = i37 % 128;
        int i38 = i37 % 2;
        int i39 = 16;
        while (i39 < 80) {
            int i40 = a;
            int i41 = (-2) - (((i40 ^ 98) + ((i40 & 98) << 1)) ^ (-1));
            int i42 = i41 % 128;
            b = i42;
            if (i41 % 2 != 0) {
                iArr4 = this.f;
                i26 = iArr4[(((-3) & (~i39)) | (i39 & 2)) + ((i39 & (-3)) << 1)];
            } else {
                iArr4 = this.f;
                int i43 = i39 & (-3);
                i26 = iArr4[((~i43) & (i39 | (-3))) + (i43 << 1)];
            }
            int i44 = i39 & (-8);
            int i45 = (~i44) & (i39 | (-8));
            int i46 = -(-(i44 << 1));
            int i47 = iArr4[(i45 ^ i46) + ((i46 & i45) << 1)];
            int i48 = (~i47) & i26;
            int i49 = (~i26) & i47;
            int i50 = (i49 & i48) | (i48 ^ i49);
            int i51 = (i39 & 13) | ((~i39) & (-14));
            int i52 = -(-((i39 & (-14)) << 1));
            int i53 = iArr4[(i51 & i52) + (i51 | i52)];
            int i54 = ((~i50) & i53) | ((~i53) & i50);
            int i55 = i42 ^ 121;
            int i56 = (((i42 & 121) | i55) << 1) - i55;
            int i57 = i56 % 128;
            a = i57;
            if (i56 % 2 == 0) {
                int i58 = i54 & iArr4[i39 << 16];
                iArr4[i39] = (i58 >> 1) & (i58 / 7);
            } else {
                int i59 = i39 & (-16);
                int i60 = iArr4[(i59 - (~(-(-((i39 ^ (-16)) | i59))))) - 1];
                int i61 = (~i60) & i54;
                int i62 = (~i54) & i60;
                int i63 = (i62 & i61) | (i61 ^ i62);
                int i64 = i63 >>> 31;
                int i65 = i63 << 1;
                int i66 = i64 ^ i65;
                int i67 = i65 & i64;
                iArr4[i39] = (i67 & i66) | (i66 ^ i67);
            }
            i39++;
            int i68 = i57 & 107;
            int i69 = ((i57 ^ 107) | i68) << 1;
            int i70 = -((~i68) & (i57 | 107));
            int i71 = (i69 & i70) + (i69 | i70);
            b = i71 % 128;
            int i72 = i71 % 2;
        }
        int iF6 = this.g;
        int iF7 = this.i;
        int i73 = b + 1;
        int i74 = i73 % 128;
        a = i74;
        if (i73 % 2 == 0) {
            i = this.h;
            i2 = this.j;
            i3 = this.k;
            int i75 = 99 / 0;
        } else {
            i = this.h;
            i2 = this.j;
            i3 = this.k;
        }
        int i76 = ((i74 | 101) << 1) - (i74 ^ 101);
        b = i76 % 128;
        int i77 = i76 % 2;
        int i78 = 0;
        int i79 = 0;
        while (true) {
            if (i78 >= 4) {
                break;
            }
            int i80 = a;
            int i81 = i80 ^ 37;
            int i82 = ((i80 & 37) | i81) << 1;
            int i83 = -i81;
            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
            b = i84 % 128;
            int i85 = i84 % i27;
            int iN3 = n(iF7, i, i2);
            int[] iArr5 = this.f;
            int i86 = (i79 & 1) + (i79 | 1);
            int i87 = iF6 << 5;
            int i88 = iF6 >>> 27;
            int i89 = i87 & i88;
            int i90 = -(-(i89 | ((~i89) & (i87 | i88))));
            int i91 = iN3 & i90;
            int i92 = (i90 | iN3) & (~i91);
            int i93 = i91 << 1;
            int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
            int i95 = a;
            int i96 = ((i95 | 57) << 1) - (i95 ^ 57);
            b = i96 % 128;
            int i97 = i96 % i27;
            int iF8 = j.f(i94, iArr5[i79], 1518500249, i3);
            int i98 = iF7 >>> 2;
            int i99 = iF7 << 30;
            int i100 = ((~i99) & i98) | ((~i98) & i99);
            int i101 = i99 & i98;
            int i102 = (i101 & i100) | (i100 ^ i101);
            int iN4 = n(iF6, i102, i);
            int i103 = a;
            int i104 = i103 & 83;
            int i105 = (i103 ^ 83) | i104;
            int i106 = (i104 & i105) + (i105 | i104);
            b = i106 % 128;
            int i107 = i106 % i27;
            int[] iArr6 = this.f;
            int i108 = ((i86 & 1) - (~(-(-(i86 | 1))))) - 1;
            int i109 = iF8 << 5;
            int i110 = iF8 >>> 27;
            int i111 = (i109 & i110) | (i109 ^ i110);
            int iF9 = j.f((iN4 ^ i111) + ((iN4 & i111) << 1), iArr6[i86], 1518500249, i2);
            int i112 = b;
            int i113 = ((i112 ^ 124) + ((i112 & 124) << 1)) - 1;
            a = i113 % 128;
            if (i113 % i27 == 0) {
                i21 = (iF6 >>> 30) | (iF6 * 2);
                iN = n(iF8, i21, i102);
                iArr3 = this.f;
                i22 = i108;
            } else {
                int i114 = iF6 >>> 2;
                int i115 = iF6 << 30;
                i21 = (i115 & i114) | (i114 ^ i115);
                iN = n(iF8, i21, i102);
                iArr3 = this.f;
                i22 = ((i108 | 1) << 1) - (i108 ^ 1);
            }
            int i116 = b;
            int i117 = ((i116 ^ 48) + ((i116 & 48) << 1)) - 1;
            a = i117 % 128;
            if (i117 % i27 == 0) {
                iF4 = j.f(iN / (((iF9 & 2) + (iF9 | 2)) & (iF9 >>> 9)), iArr3[i108], 1518500249, i);
                int i118 = iF8 >> 2;
                int i119 = iF8 / 86;
                int i120 = i118 & i119;
                i3 = ((i119 | i118) & (~i120)) | i120;
            } else {
                int i121 = iF9 << 5;
                int i122 = iF9 >>> 27;
                int i123 = i121 & i122;
                int i124 = (~i123) & (i121 | i122);
                int i125 = (i123 & i124) | (i124 ^ i123);
                int i126 = iN & i125;
                int i127 = (i125 ^ iN) | i126;
                iF4 = j.f(((i126 | i127) << 1) - (i127 ^ i126), iArr3[i108], 1518500249, i);
                int i128 = iF8 >>> 2;
                int i129 = iF8 << 30;
                i3 = (i128 & i129) | (i128 ^ i129);
            }
            int iN5 = n(iF9, i3, i21);
            int[] iArr7 = this.f;
            int i130 = (((i22 ^ 1) | (i22 & 1)) << 1) - ((i22 & (-2)) | ((~i22) & 1));
            int i131 = iF4 << 5;
            int i132 = iF4 >>> 27;
            int i133 = i131 ^ i132;
            int i134 = i131 & i132;
            int i135 = -(-((i134 & i133) | (i133 ^ i134)));
            int i136 = iN5 & i135;
            int i137 = (iN5 ^ i135) | i136;
            int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
            int i139 = b;
            int i140 = i139 | 39;
            int i141 = ((i140 << 1) - (~(-((~(i139 & 39)) & i140)))) - 1;
            a = i141 % 128;
            if (i141 % 2 == 0) {
                iF5 = j.f(i138, iArr7[i22], 1518500249, i102);
                int i142 = iF9 & (-4);
                i23 = (i142 + ((iF9 ^ (-4)) | i142)) & (iF9 / 94);
                iN2 = n(iF4, i23, i3);
                i24 = iF5 >>> 3;
                i25 = 68;
            } else {
                iF5 = j.f(i138, iArr7[i22], 1518500249, i102);
                int i143 = iF9 >>> 2;
                int i144 = iF9 << 30;
                int i145 = i143 ^ i144;
                int i146 = i143 & i144;
                i23 = (i146 & i145) | (i145 ^ i146);
                iN2 = n(iF4, i23, i3);
                i24 = iF5 << 5;
                i25 = 27;
            }
            int i147 = iN2;
            iF7 = iF5;
            int i148 = iF7 >>> i25;
            iF6 = j.f(i147 + ((i24 & i148) | (i24 ^ i148)), this.f[i130], 1518500249, i21);
            int i149 = iF4 >>> 2;
            int i150 = iF4 << 30;
            int i151 = ((~i150) & i149) | ((~i149) & i150);
            int i152 = i149 & i150;
            i = (i151 ^ i152) | (i152 & i151);
            int i153 = (i78 & (-2)) | ((~i78) & 1);
            int i154 = (i78 & 1) << 1;
            i78 = (i153 ^ i154) + ((i153 & i154) << 1);
            int i155 = i130 & (-83);
            int i156 = (i130 ^ (-83)) | i155;
            int i157 = ((i155 | i156) << 1) - (i155 ^ i156);
            int i158 = ((i157 ^ 84) | (i157 & 84)) << 1;
            int i159 = -((i157 & (-85)) | ((~i157) & 84));
            i79 = (i158 ^ i159) + ((i158 & i159) << 1);
            int i160 = b;
            int i161 = ((i160 ^ 55) | (i160 & 55)) << 1;
            int i162 = -(((~i160) & 55) | (i160 & (-56)));
            int i163 = ((i161 | i162) << 1) - (i162 ^ i161);
            a = i163 % 128;
            int i164 = i163 % 2;
            i2 = i23;
            i27 = 2;
        }
        int i165 = b;
        int i166 = i165 & 1;
        int i167 = ((i165 ^ 1) | i166) << 1;
        int i168 = -((i165 | 1) & (~i166));
        int i169 = (i167 & i168) + (i168 | i167);
        a = i169 % 128;
        int i170 = 2;
        int i171 = i169 % 2;
        int i172 = 0;
        for (i4 = 4; i172 < i4; i4 = 4) {
            int i173 = b + 91;
            int i174 = i173 % 128;
            a = i174;
            int i175 = i173 % i170;
            int[] iArr8 = this.f;
            int i176 = ((i79 ^ 1) | (i79 & 1)) << 1;
            int i177 = -((i79 & (-2)) | ((~i79) & 1));
            int i178 = ((i176 | i177) << 1) - (i176 ^ i177);
            int i179 = iF6 << 5;
            int i180 = iF6 >>> 27;
            int i181 = i179 ^ i180;
            int i182 = i179 & i180;
            int i183 = (i181 & i182) | (i181 ^ i182);
            int i184 = (~i) & iF7;
            int i185 = (~iF7) & i;
            int i186 = (i184 ^ i185) | (i184 & i185);
            int i187 = -(-((i186 | i2) & (~(i186 & i2))));
            int i188 = i183 & i187;
            int i189 = (i183 ^ i187) | i188;
            int i190 = (i188 ^ i189) + ((i189 & i188) << 1);
            int i191 = ((i174 | 51) << 1) - (i174 ^ 51);
            b = i191 % 128;
            if (i191 % 2 != 0) {
                iF2 = j.f(i190, iArr8[i79], 1859775393, i3);
                i16 = (iF7 * 92) & (iF7 / 4);
                i17 = i178 / 0;
            } else {
                iF2 = j.f(i190, iArr8[i79], 1859775393, i3);
                int i192 = iF7 >>> 2;
                int i193 = iF7 << 30;
                i16 = (i193 & i192) | (i192 ^ i193);
                i17 = ((i178 & 1) - (~(i178 | 1))) - 1;
            }
            int i194 = a + 91;
            b = i194 % 128;
            int i195 = i194 % 2;
            int i196 = iF2 << 5;
            int i197 = iF2 >>> 27;
            int i198 = i196 ^ i197;
            int i199 = i196 & i197;
            int i200 = (i199 & i198) | (i198 ^ i199);
            int i201 = (~i16) & iF6;
            int i202 = (~iF6) & i16;
            int i203 = (i201 ^ i202) | (i201 & i202);
            int i204 = i203 & i;
            int iF10 = j.f(i200 + (((i203 ^ i) | i204) & (~i204)), iArr8[i178], 1859775393, i2);
            int i205 = b;
            int i206 = (((i205 ^ 113) | (i205 & 113)) << 1) - ((i205 & (-114)) | ((~i205) & 113));
            a = i206 % 128;
            int i207 = i206 % 2;
            int i208 = iF6 >>> 2;
            int i209 = iF6 << 30;
            int i210 = ((~i209) & i208) | ((~i208) & i209);
            int i211 = i209 & i208;
            int i212 = (i211 & i210) | (i210 ^ i211);
            int i213 = ((i17 | 1) << 1) - ((i17 & (-2)) | ((~i17) & 1));
            int i214 = iF10 << 5;
            int i215 = iF10 >>> 27;
            int i216 = i214 & i215;
            int i217 = ((~i216) & (i214 | i215)) | i216;
            int i218 = ~i212;
            int i219 = iF2 & i218;
            int i220 = (~iF2) & i212;
            int i221 = (i219 ^ i220) | (i219 & i220);
            int i222 = i205 & 83;
            int i223 = -(-((i205 ^ 83) | i222));
            int i224 = ((i222 | i223) << 1) - (i223 ^ i222);
            a = i224 % 128;
            if (i224 % 2 == 0) {
                int i225 = i221 & i16;
                iF3 = j.f(i217 + ((i225 | (i221 ^ i16)) & (~i225)), iArr8[i17], 1859775393, i);
                i3 = (iF2 % 107) & (iF2 * 4);
                i18 = 0;
            } else {
                int i226 = i221 & i16;
                int i227 = (i226 | (i221 ^ i16)) & (~i226);
                int i228 = i217 ^ i227;
                int i229 = -(-((i217 & i227) << 1));
                iF3 = j.f((i228 ^ i229) + ((i229 & i228) << 1), iArr8[i17], 1859775393, i);
                int i230 = iF2 >>> 2;
                int i231 = iF2 << 30;
                i3 = (i231 & i230) | (i230 ^ i231);
                i18 = 1;
            }
            int i232 = ((i213 | i18) << 1) - (i18 ^ i213);
            int i233 = iF3 << 5;
            int i234 = iF3 >>> 27;
            int i235 = (i233 & i234) | (i233 ^ i234);
            int i236 = (~i3) & iF10;
            int i237 = (~iF10) & i3;
            int i238 = (i236 & i237) | (i236 ^ i237);
            iF7 = j.f((i235 - (~(((~i238) & i212) | (i218 & i238)))) - 1, iArr8[i213], 1859775393, i16);
            int i239 = b;
            int i240 = ((i239 | 93) << 1) - (i239 ^ 93);
            a = i240 % 128;
            if (i240 % 2 == 0) {
                i19 = (iF10 % 5) & (iF10 % 59);
                int i241 = iF7 * 4;
                int i242 = iF7 / 101;
                int i243 = i241 ^ i242;
                int i244 = i241 & i242;
                int i245 = (i244 & i243) | (i243 ^ i244);
                int i246 = (~i19) & iF3;
                int i247 = (~iF3) & i19;
                i20 = i245 % (((i246 & i247) | (i246 ^ i247)) & i3);
            } else {
                int i248 = iF10 >>> 2;
                int i249 = iF10 << 30;
                i19 = (i248 & i249) | (i248 ^ i249);
                int i250 = iF7 << 5;
                int i251 = iF7 >>> 27;
                int i252 = i250 & i251;
                int i253 = (i250 | i251) & (~i252);
                int i254 = (i253 & i252) | (i253 ^ i252);
                int i255 = (~i19) & iF3;
                int i256 = (~iF3) & i19;
                int i257 = (i255 & i256) | (i255 ^ i256);
                int i258 = -(-((i257 | i3) & (~(i257 & i3))));
                int i259 = i254 & i258;
                i20 = ((i254 | i258) & (~i259)) + (i259 << 1);
            }
            i2 = i19;
            iF6 = j.f(i20, iArr8[i232], 1859775393, i212);
            int i260 = iF3 >>> 2;
            int i261 = iF3 << 30;
            int i262 = ((~i261) & i260) | ((~i260) & i261);
            int i263 = i260 & i261;
            i = (i262 ^ i263) | (i263 & i262);
            i172++;
            int i264 = ((i232 & 101) + (i232 | 101)) - 1;
            i79 = (-2) - (((i264 ^ (-98)) + ((i264 & (-98)) << 1)) ^ (-1));
            int i265 = b;
            int i266 = ((i265 ^ 83) | (i265 & 83)) << 1;
            int i267 = -(((~i265) & 83) | (i265 & (-84)));
            int i268 = (i266 ^ i267) + ((i267 & i266) << 1);
            a = i268 % 128;
            int i269 = i268 % 2;
            i170 = 2;
        }
        int i270 = a;
        int i271 = (i270 & 73) + (i270 | 73);
        b = i271 % 128;
        int i272 = 2;
        int i273 = i271 % 2;
        int i274 = 0;
        while (i274 < 4) {
            int i275 = b + 93;
            a = i275 % 128;
            int i276 = i275 % i272;
            int iO = o(iF7, i, i2);
            if (i276 == 0) {
                iArr2 = this.f;
                int i277 = -(-((iF6 * 5) & (iF6 * 100)));
                i12 = (iO & i277) + (iO | i277);
                i11 = i79;
            } else {
                iArr2 = this.f;
                i11 = (i79 ^ 1) + ((i79 & 1) << 1);
                int i278 = -(-((iF6 << 5) | (iF6 >>> 27)));
                i12 = ((((~i278) & iO) | ((~iO) & i278)) - (~(-(-((iO & i278) << 1))))) - 1;
            }
            int i279 = a;
            int i280 = (i279 ^ 51) + ((i279 & 51) << 1);
            b = i280 % 128;
            int i281 = i280 % 2;
            int iF11 = j.f(i12, iArr2[i79], -1894007588, i3);
            int i282 = iF7 >>> 2;
            int i283 = iF7 << 30;
            int i284 = i282 ^ i283;
            int i285 = i283 & i282;
            int i286 = (i285 & i284) | (i284 ^ i285);
            int iO2 = o(iF6, i286, i);
            int i287 = b;
            int i288 = ((i287 | 29) << 1) - (i287 ^ 29);
            a = i288 % 128;
            int i289 = i288 % 2;
            int[] iArr9 = this.f;
            int i290 = (((i11 ^ 1) | (i11 & 1)) << 1) - ((i11 & (-2)) | ((~i11) & 1));
            int i291 = iF11 << 5;
            int i292 = iF11 >>> 27;
            int i293 = -(-((i291 ^ i292) | (i291 & i292)));
            int i294 = (iO2 | i293) << 1;
            int i295 = -(iO2 ^ i293);
            int iF12 = j.f((i294 ^ i295) + ((i295 & i294) << 1), iArr9[i11], -1894007588, i2);
            int i296 = a;
            int i297 = (i296 ^ 103) + ((i296 & 103) << 1);
            b = i297 % 128;
            int i298 = i297 % 2;
            int i299 = iF6 >>> 2;
            int i300 = iF6 << 30;
            int i301 = i299 ^ i300;
            int i302 = i300 & i299;
            int i303 = (i302 & i301) | (i301 ^ i302);
            int iO3 = o(iF11, i303, i286);
            int[] iArr10 = this.f;
            int i304 = i290 & 1;
            int i305 = (((i290 ^ 1) | i304) << 1) - ((~i304) & (i290 | 1));
            int i306 = a;
            int i307 = ((i306 ^ 101) | (i306 & 101)) << 1;
            int i308 = -((i306 & (-102)) | (101 & (~i306)));
            int i309 = (i307 ^ i308) + ((i308 & i307) << 1);
            b = i309 % 128;
            if (i309 % 2 != 0) {
                int i310 = iF12 / 3;
                int i311 = iF12 % 124;
                int i312 = -(-(((~i311) & i310) | ((~i310) & i311)));
                int i313 = iO3 ^ i312;
                iF = j.f(((((i312 & iO3) | i313) << 1) - (~(-i313))) - 1, iArr10[i290], -1894007588, i);
                int i314 = iF11 % 2;
                int i315 = iF11 << 113;
                int i316 = ((~i315) & i314) | ((~i314) & i315);
                int i317 = i315 & i314;
                i13 = (i317 & i316) | (i316 ^ i317);
            } else {
                int i318 = iF12 << 5;
                int i319 = iF12 >>> 27;
                int i320 = i318 & i319;
                int i321 = (i318 | i319) & (~i320);
                int i322 = (i321 & i320) | (i321 ^ i320);
                int i323 = iO3 ^ i322;
                int i324 = ((i322 & iO3) | i323) << 1;
                int i325 = -i323;
                iF = j.f((i324 ^ i325) + ((i324 & i325) << 1), iArr10[i290], -1894007588, i);
                int i326 = iF11 >>> 2;
                int i327 = iF11 << 30;
                i13 = (i327 & i326) | ((~i327) & i326) | ((~i326) & i327);
            }
            i3 = i13;
            int i328 = a;
            int i329 = (i328 | 93) << 1;
            int i330 = -(((~i328) & 93) | (i328 & (-94)));
            int i331 = (i329 ^ i330) + ((i330 & i329) << 1);
            b = i331 % 128;
            int i332 = i331 % 2;
            int iO4 = o(iF12, i3, i303);
            int[] iArr11 = this.f;
            if (i332 != 0) {
                i14 = i305 / 0;
                i15 = iO4 >>> ((iF >> 4) & (iF << 38));
            } else {
                int i333 = i305 & 1;
                int i334 = (i305 ^ 1) | i333;
                i14 = ((i333 & i334) << 1) + (i333 ^ i334);
                int i335 = iF << 5;
                int i336 = iF >>> 27;
                int i337 = i335 ^ i336;
                int i338 = i335 & i336;
                int i339 = -(-((i338 & i337) | (i337 ^ i338)));
                int i340 = iO4 ^ i339;
                i15 = (((iO4 & i339) | i340) << 1) - i340;
            }
            iF7 = j.f(i15, iArr11[i305], -1894007588, i286);
            int i341 = iF12 >>> 2;
            int i342 = iF12 << 30;
            i2 = (i341 ^ i342) | (i341 & i342);
            int iO5 = o(iF, i2, i3);
            int i343 = iF7 << 5;
            int i344 = b;
            int i345 = ((i344 ^ 71) - (~(-(-((i344 & 71) << 1))))) - 1;
            a = i345 % 128;
            int i346 = i345 % 2;
            int i347 = iF7 >>> 27;
            int i348 = i343 ^ i347;
            int i349 = i343 & i347;
            int i350 = (i349 & i348) | (i348 ^ i349);
            int i351 = iO5 & i350;
            int i352 = -(-((iO5 ^ i350) | i351));
            iF6 = j.f((i351 ^ i352) + ((i352 & i351) << 1), this.f[i14], -1894007588, i303);
            int i353 = iF >>> 2;
            int i354 = iF << 30;
            i = (i353 ^ i354) | (i353 & i354);
            i274 = ((i274 | 1) << 1) - (i274 ^ 1);
            i79 = (i14 & 1) + (i14 | 1);
            int i355 = a;
            int i356 = (i355 | 39) << 1;
            int i357 = -(((~i355) & 39) | (i355 & (-40)));
            int i358 = (i356 ^ i357) + ((i357 & i356) << 1);
            b = i358 % 128;
            int i359 = i358 % 2;
            i272 = 2;
        }
        int i360 = a;
        int i361 = ((i360 ^ 64) + ((i360 & 64) << 1)) - 1;
        b = i361 % 128;
        int i362 = i361 % 2;
        int i363 = 60;
        int i364 = 0;
        while (i364 <= 3) {
            int i365 = a + 55;
            b = i365 % 128;
            if (i365 % 2 != 0) {
                iArr = this.f;
                int i366 = i363 ^ 1;
                int i367 = ((i363 & 1) | i366) << 1;
                int i368 = -i366;
                i5 = (i367 ^ i368) + ((i368 & i367) << 1);
                int i369 = (iF6 / 2) & ((((iF6 | 103) << 1) - (~(-((iF6 & (-104)) | ((~iF6) & 103))))) - 1);
                int i370 = (iF7 ^ i) | (iF7 & i);
                int i371 = -(-((i370 | i2) & (~(i370 & i2))));
                int i372 = i369 ^ i371;
                int i373 = ((i369 & i371) | i372) << 1;
                int i374 = -i372;
                i6 = ((i373 | i374) << 1) - (i373 ^ i374);
            } else {
                iArr = this.f;
                i5 = ((i363 & 1) - (~(-(-(i363 | 1))))) - 1;
                int i375 = iF6 << 5;
                int i376 = iF6 >>> 27;
                int i377 = (i375 & i376) | (i375 ^ i376);
                int i378 = (~(iF7 & i)) & (iF7 | i);
                int i379 = (~i2) & i378;
                int i380 = (~i378) & i2;
                int i381 = -(-((i380 & i379) | (i379 ^ i380)));
                i6 = (i377 & i381) + (i377 | i381);
            }
            int iF13 = j.f(i6, iArr[i363], -899497514, i3);
            int i382 = iF7 >>> 2;
            int i383 = iF7 << 30;
            int i384 = ((~i383) & i382) | ((~i382) & i383);
            int i385 = i383 & i382;
            int i386 = (i385 & i384) | (i384 ^ i385);
            int i387 = i5 & 1;
            int i388 = (~i387) & (i5 | 1);
            int i389 = i387 << 1;
            int i390 = (i388 ^ i389) + ((i389 & i388) << 1);
            int i391 = a;
            int i392 = (i391 & 125) + (i391 | 125);
            b = i392 % 128;
            if (i392 % 2 != 0) {
                int i393 = (iF13 / 4) & (iF13 % 17);
                int i394 = iF6 & i386;
                int i395 = (~i394) & (iF6 | i386);
                int i396 = (i394 & i395) | (i395 ^ i394);
                int i397 = (~i) & i396;
                int i398 = (~i396) & i;
                int i399 = (i398 & i397) | (i397 ^ i398);
                i7 = (i393 ^ i399) + ((i393 & i399) << 1);
                i8 = iArr[i5];
            } else {
                int i400 = iF13 << 5;
                int i401 = iF13 >>> 27;
                int i402 = (i400 & i401) | ((~i401) & i400) | ((~i400) & i401);
                int i403 = (~i386) & iF6;
                int i404 = (~iF6) & i386;
                int i405 = (i403 & i404) | (i403 ^ i404);
                int i406 = (~i) & i405;
                int i407 = (~i405) & i;
                int i408 = (i407 & i406) | (i406 ^ i407);
                i7 = (i402 ^ i408) + ((i402 & i408) << 1);
                i8 = iArr[i5];
            }
            int iF14 = j.f(i7, i8, -899497514, i2);
            int i409 = b + 13;
            int i410 = i409 % 128;
            a = i410;
            int i411 = i409 % 2;
            int i412 = iF6 >>> 2;
            int i413 = iF6 << 30;
            int i414 = i412 & i413;
            int i415 = (i413 | i412) & (~i414);
            int i416 = (i415 & i414) | (i415 ^ i414);
            int i417 = i390 & 1;
            int i418 = ((i390 ^ 1) | i417) << 1;
            int i419 = -((~i417) & (i390 | 1));
            int i420 = (i418 ^ i419) + ((i418 & i419) << 1);
            int i421 = iF14 << 5;
            int i422 = iF14 >>> 27;
            int i423 = i421 & i422;
            int i424 = (~i423) & (i421 | i422);
            int i425 = (i424 & i423) | (i424 ^ i423);
            int i426 = ((~i416) & iF13) | ((~iF13) & i416);
            int i427 = i410 + 115;
            b = i427 % 128;
            int i428 = i427 % 2;
            int i429 = (i426 | i386) & (~(i426 & i386));
            int i430 = ((~i429) & i425) | ((~i425) & i429);
            int i431 = -(-((i425 & i429) << 1));
            int iF15 = j.f((i430 ^ i431) + ((i431 & i430) << 1), iArr[i390], -899497514, i);
            int i432 = iF13 >>> 2;
            int i433 = iF13 << 30;
            int i434 = i432 ^ i433;
            int i435 = i433 & i432;
            i3 = (i434 ^ i435) | (i435 & i434);
            int i436 = a;
            int i437 = i436 & 117;
            int i438 = -(-((i436 ^ 117) | i437));
            int i439 = ((i437 | i438) << 1) - (i438 ^ i437);
            b = i439 % 128;
            int i440 = i439 % 2;
            int i441 = ((i420 & 2) + (i420 | 2)) - 1;
            int i442 = iF15 << 5;
            int i443 = iF15 >>> 27;
            int i444 = i442 & i443;
            int i445 = (i442 | i443) & (~i444);
            int i446 = (i445 & i444) | (i445 ^ i444);
            int i447 = ~i3;
            int i448 = (iF14 & i447) | ((~iF14) & i3);
            int i449 = i448 & i416;
            iF7 = j.f((i446 - (~(-(-(((i448 ^ i416) | i449) & (~i449)))))) - 1, iArr[i420], -899497514, i386);
            int i450 = b;
            int i451 = i450 & 25;
            int i452 = (i450 ^ 25) | i451;
            int i453 = (i451 & i452) + (i452 | i451);
            a = i453 % 128;
            if (i453 % 2 == 0) {
                i9 = (iF14 << 3) & (iF14 * 27);
                int i454 = iF7 >>> 5;
                int i455 = iF7 / 109;
                int i456 = i454 & i455;
                int i457 = (i454 | i455) & (~i456);
                int i458 = (i457 & i456) | (i457 ^ i456);
                int i459 = (iF15 ^ i9) | (iF15 & i9);
                int i460 = i459 & i3;
                int i461 = (i459 | i3) & (~i460);
                i10 = i458 / ((i461 & i460) | (i461 ^ i460));
            } else {
                int i462 = iF14 >>> 2;
                int i463 = iF14 << 30;
                int i464 = i462 & i463;
                i9 = ((i462 | i463) & (~i464)) | i464;
                int i465 = iF7 << 5;
                int i466 = iF7 >>> 27;
                int i467 = i465 & i466;
                int i468 = (i465 | i466) & (~i467);
                int i469 = (i468 & i467) | (i468 ^ i467);
                int i470 = (~i9) & iF15;
                int i471 = (~iF15) & i9;
                int i472 = (i470 & i471) | (i470 ^ i471);
                int i473 = (i447 & i472) | ((~i472) & i3);
                int i474 = i469 & i473;
                i10 = ((((i469 ^ i473) | i474) << 1) - (~(-((i469 | i473) & (~i474))))) - 1;
            }
            i2 = i9;
            iF6 = j.f(i10, iArr[i441], -899497514, i416);
            int i475 = iF15 >>> 2;
            int i476 = iF15 << 30;
            int i477 = i475 & i476;
            int i478 = (i475 | i476) & (~i477);
            i = (i478 ^ i477) | (i478 & i477);
            i364++;
            i363 = ((i441 ^ 67) + ((i441 & 67) << 1)) - 66;
            int i479 = a;
            int i480 = ((i479 ^ 25) - (~(-(-((i479 & 25) << 1))))) - 1;
            b = i480 % 128;
            int i481 = i480 % 2;
        }
        int i482 = this.g;
        this.g = (i482 & iF6) + (i482 | iF6);
        int i483 = b;
        int i484 = (i483 & (-108)) | ((~i483) & 107);
        int i485 = (i483 & 107) << 1;
        int i486 = (i484 ^ i485) + ((i484 & i485) << 1);
        a = i486 % 128;
        int i487 = i486 % 2;
        int i488 = this.i;
        int i489 = i488 & iF7;
        this.i = ((((i488 ^ iF7) | i489) << 1) - (~(-((i488 | iF7) & (~i489))))) - 1;
        int i490 = (i483 & (-70)) | ((~i483) & 69);
        int i491 = (i483 & 69) << 1;
        int i492 = (i490 & i491) + (i491 | i490);
        int i493 = i492 % 128;
        a = i493;
        int i494 = i492 % 2;
        int i495 = this.h;
        int i496 = i495 & i;
        int i497 = -(-(i495 | i));
        this.h = ((i496 | i497) << 1) - (i497 ^ i496);
        int i498 = i493 + 73;
        b = i498 % 128;
        if (i498 % 2 != 0) {
            this.j = (this.j - (~(-(~i2)))) - 2;
        } else {
            int i499 = this.j;
            int i500 = i499 ^ i2;
            int i501 = ((i499 & i2) | i500) << 1;
            int i502 = -i500;
            this.j = ((i501 | i502) << 1) - (i501 ^ i502);
        }
        this.k = (this.k - (~i3)) - 1;
        this.l = 0;
        int i503 = ((i493 ^ 47) | (i493 & 47)) << 1;
        int i504 = -(((~i493) & 47) | (i493 & (-48)));
        int i505 = (i503 ^ i504) + ((i504 & i503) << 1);
        b = i505 % 128;
        int i506 = 2;
        int i507 = i505 % 2 != 0 ? 1 : 0;
        while (i507 < 16) {
            int i508 = b - (-3);
            a = i508 % 128;
            int i509 = i508 % i506;
            int[] iArr12 = this.f;
            if (i509 == 0) {
                iArr12[i507] = 1;
                int i510 = (i507 & 136) + (i507 | 136);
                int i511 = ((i510 ^ (-63)) | (i510 & (-63))) << 1;
                int i512 = -(((~i510) & (-63)) | (i510 & 62));
                i507 = (i511 ^ i512) + ((i512 & i511) << 1);
            } else {
                iArr12[i507] = 0;
                int i513 = i507 & 1;
                int i514 = (i507 ^ 1) | i513;
                i507 = (i513 & i514) + (i513 | i514);
            }
            i506 = 2;
        }
        int i515 = b;
        int i516 = i515 & 75;
        int i517 = (i516 - (~((i515 ^ 75) | i516))) - 1;
        a = i517 % 128;
        int i518 = i517 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void l(byte[] bArr, int i) {
        byte b2;
        byte b3;
        int i2;
        int i3;
        int i4;
        byte b4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((i6 ^ 122) + ((i6 & 122) << 1)) - 1;
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        byte b5 = bArr[i];
        int i10 = i & 1;
        int i11 = (i ^ 1) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = (i8 | 123) << 1;
        int i14 = -((i8 & (-124)) | ((~i8) & 123));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            b2 = bArr[i12];
            b3 = bArr[i12];
        } else {
            b2 = bArr[i12];
            int i16 = i12 & 1;
            int i17 = ((i12 ^ 1) | i16) << 1;
            int i18 = -((i12 | 1) & (~i16));
            i12 = (i17 & i18) + (i17 | i18);
            b3 = bArr[i12];
        }
        int i19 = ((i8 ^ 75) | (i8 & 75)) << 1;
        int i20 = -((i8 & (-76)) | ((~i8) & 75));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        b = i21 % 128;
        int i22 = i21 % 2;
        byte b6 = bArr[i12 + 1];
        int[] iArr = this.f;
        int i23 = i8 + 21;
        b = i23 % 128;
        if (i23 % 2 != 0) {
            i2 = this.l;
            int i24 = 20 / 0;
        } else {
            i2 = this.l;
        }
        int i25 = (i8 & (-62)) | ((~i8) & 61);
        int i26 = (i8 & 61) << 1;
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            i3 = (b6 & 14180) | (b6 ^ 14180);
            i4 = b5 >>> 96;
            b4 = 354;
        } else {
            i3 = b6 & 255;
            i4 = b5 << 24;
            b4 = 255;
        }
        int i28 = (b2 & b4) << 16;
        int i29 = i4 ^ i28;
        int i30 = i28 & i4;
        int i31 = (i30 & i29) | (i29 ^ i30);
        int i32 = b3 & 255;
        int i33 = ((i8 ^ 94) + ((i8 & 94) << 1)) - 1;
        b = i33 % 128;
        int i34 = i33 % 2;
        int i35 = i32 << 8;
        int i36 = i31 & i35;
        int i37 = ((i31 | i35) & (~i36)) | i36;
        iArr[i2] = (i3 & i37) | (i3 ^ i37);
        int i38 = i2 & 1;
        int i39 = ((~i38) & (i2 | 1)) + (i38 << 1);
        this.l = i39;
        int i40 = i8 & 15;
        int i41 = (i8 ^ 15) | i40;
        int i42 = (i40 & i41) + (i40 | i41);
        b = i42 % 128;
        if (i42 % 2 == 0 ? i39 == 16 : i39 == 96) {
            k();
            int i43 = a + 5;
            b = i43 % 128;
            int i44 = i43 % 2;
        }
        int i45 = a;
        int i46 = i45 & 45;
        int i47 = -(-((i45 ^ 45) | i46));
        int i48 = (i46 & i47) + (i47 | i46);
        b = i48 % 128;
        if (i48 % 2 != 0) {
            int i49 = 27 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void m() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 49) + ((i3 & 49) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        super.m();
        this.g = 1732584193;
        this.i = -271733879;
        int i6 = b;
        int i7 = (i6 & 47) + (i6 | 47);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        this.h = -1732584194;
        this.j = 271733878;
        this.k = -1009589776;
        if (i9 == 0) {
            int i10 = 31 / 0;
        }
        int i11 = i8 + 66;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        int i13 = i12 % 128;
        b = i13;
        if (i12 % 2 != 0) {
            this.l = 1;
        } else {
            this.l = 0;
        }
        int i14 = i13 & 97;
        int i15 = i14 + ((i13 ^ 97) | i14);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 3 / 5;
        }
        int i17 = 0;
        while (true) {
            int[] iArr = this.f;
            if (i17 == iArr.length) {
                break;
            }
            int i18 = b;
            int i19 = i18 & 43;
            int i20 = (i18 ^ 43) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                iArr[i17] = 0;
                int i22 = ((i17 ^ 61) - (~(-(-((i17 & 61) << 1))))) - 1;
                int i23 = i22 & (-36);
                i = ((i22 | (-36)) & (~i23)) + (i23 << 1);
            } else {
                iArr[i17] = 0;
                int i24 = ((i17 ^ 24) | (i17 & 24)) << 1;
                int i25 = -(((~i17) & 24) | (i17 & (-25)));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                int i27 = i26 & (-23);
                i = (((~i27) & (i26 | (-23))) - (~(-(-(i27 << 1))))) - 1;
            }
            i17 = i;
        }
        int i28 = b;
        int i29 = (i28 & 87) + (i28 | 87);
        a = i29 % 128;
        if (i29 % 2 == 0) {
            throw null;
        }
    }

    public final int n(int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = ((i6 ^ 15) | (i6 & 15)) << 1;
        int i8 = -((i6 & (-16)) | ((~i6) & 15));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = ~i;
        if (i10 != 0) {
            int i12 = (i11 & i) | (i11 ^ i);
            int i13 = (i3 & i12) | (i12 ^ i3);
            int i14 = i2 & i;
            int i15 = (i | i2) & (~i14);
            i4 = ((i15 & i14) | (i15 ^ i14)) & i13;
        } else {
            int i16 = i3 & i11;
            int i17 = i & i2;
            int i18 = i16 & i17;
            int i19 = (i17 | i16) & (~i18);
            i4 = (i19 & i18) | (i19 ^ i18);
        }
        int i20 = i6 & 53;
        int i21 = i6 | 53;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        b = i22 % 128;
        int i23 = i22 % 2;
        return i4;
    }

    public final int o(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & 29) + (i5 | 29);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = i & i3;
        int i10 = i & i2;
        int i11 = (i10 & i9) | (i9 ^ i10);
        int i12 = i2 & i3;
        int i13 = (i11 & i12) | (i11 ^ i12);
        int i14 = (((i7 | 78) << 1) - (i7 ^ 78)) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 16 / 0;
        }
        return i13;
    }
}
