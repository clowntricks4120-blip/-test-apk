package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class r extends j {
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
    public int[] f92o = new int[64];
    public int p;

    static {
        int i = (~0) & 125;
        b = i % 128;
        int i2 = i % 2;
    }

    public r() {
        m();
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int b(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = (-2) - ((a + 104) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        j();
        if (i6 == 0) {
            h.i(this.h, bArr, i);
            throw null;
        }
        h.i(this.h, bArr, i);
        int i7 = this.j;
        int i8 = a;
        int i9 = ((i8 ^ 73) | (i8 & 73)) << 1;
        int i10 = -(((~i8) & 73) | (i8 & (-74)));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i & 4;
        int i14 = (~i13) & (i | 4);
        int i15 = -(-(i13 << 1));
        h.i(i7, bArr, ((i14 | i15) << 1) - (i15 ^ i14));
        int i16 = a;
        int i17 = ((i16 ^ 91) | (i16 & 91)) << 1;
        int i18 = -(((~i16) & 91) | (i16 & (-92)));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        h.i(this.i, bArr, (i ^ 8) + ((i & 8) << 1));
        h.i(this.k, bArr, ((i & 12) - (~(i | 12))) - 1);
        int i21 = a + 7;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            i2 = this.l;
            i3 = i % 43;
        } else {
            i2 = this.l;
            i3 = ((i & 17) + (i | 17)) - 1;
        }
        h.i(i2, bArr, i3);
        int i22 = this.g;
        int i23 = i & 20;
        int i24 = ((i ^ 20) | i23) << 1;
        int i25 = -((~i23) & (i | 20));
        h.i(i22, bArr, (i24 ^ i25) + ((i24 & i25) << 1));
        int i26 = this.m;
        int i27 = (((i & (-25)) | ((~i) & 24)) - (~((i & 24) << 1))) - 1;
        int i28 = b;
        int i29 = i28 & 113;
        int i30 = (i28 | 113) & (~i29);
        int i31 = i29 << 1;
        int i32 = (i30 & i31) + (i30 | i31);
        a = i32 % 128;
        int i33 = i32 % 2;
        h.i(i26, bArr, i27);
        m();
        int i34 = i33 != 0 ? 36 : 28;
        int i35 = b;
        int i36 = i35 & 125;
        int i37 = (((i35 ^ 125) | i36) << 1) - ((i35 | 125) & (~i36));
        a = i37 % 128;
        if (i37 % 2 == 0) {
            return i34;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = (((i2 | 15) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return "SHA-224";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 54) + (i2 | 54)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 7;
        int i6 = -(-(i2 | 7));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return 28;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void g(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 66) + (i2 | 66)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0 ? this.p > 14 : this.p > 6) {
            int i4 = i2 & 111;
            int i5 = -(-(i2 | 111));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            k();
            if (i7 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int[] iArr = this.f92o;
        int i8 = a;
        int i9 = (i8 & 93) + (i8 | 93);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        int i12 = (i10 ^ 29) + ((i10 & 29) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 2 % 2;
        int i15 = b;
        int i16 = i15 & 53;
        int i17 = (i16 - (~((i15 ^ 53) | i16))) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = i15 & 43;
        int i20 = (i15 | 43) & (~i19);
        int i21 = i19 << 1;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        a = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 16;
        while (i24 <= 63) {
            int i25 = a;
            int i26 = i25 & 61;
            int i27 = ((i25 ^ 61) | i26) << 1;
            int i28 = -((i25 | 61) & (~i26));
            int i29 = (i27 & i28) + (i28 | i27);
            int i30 = i29 % 128;
            b = i30;
            int i31 = i29 % 2;
            int[] iArr = this.f92o;
            int i32 = i24 & (-2);
            int i33 = iArr[(((i24 ^ (-2)) | i32) << 1) - ((~i32) & (i24 | (-2)))];
            int i34 = (23 & (~i30)) | (i30 & (-24));
            int i35 = (i30 & 23) << 1;
            int i36 = (i34 & i35) + (i34 | i35);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                i7 = iArr[i24 * 7];
                i8 = iArr[((i24 | (-15)) << 1) - (i24 ^ (-15))];
            } else {
                int i37 = ~i24;
                int i38 = (i24 & 6) | ((-7) & i37);
                int i39 = -(-((i24 & (-7)) << 1));
                i7 = iArr[(i38 & i39) + (i38 | i39)];
                int i40 = (i24 | (-15)) << 1;
                int i41 = -((i37 & (-15)) | (i24 & 14));
                i8 = iArr[((i40 | i41) << 1) - (i41 ^ i40)];
            }
            int i42 = i33 >>> 10;
            int i43 = i33 >>> 17;
            int i44 = i33 << 15;
            int i45 = (-2) - ((((i30 | 68) << 1) - (i30 ^ 68)) ^ (-1));
            a = i45 % 128;
            if (i45 % 2 != 0) {
                int i46 = i43 & i44;
                int i47 = i33 * 100;
                int i48 = i33 ^ (-18);
                int i49 = (i33 & (-18)) << 1;
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                int i51 = (i47 ^ i50) | (i47 & i50);
                int i52 = ((~i51) & i46) | ((~i46) & i51);
                int i53 = i51 & i46;
                i9 = ((((i53 & i52) | (i52 ^ i53)) & i42) - (~(-i7))) - 1;
            } else {
                int i54 = ((~i44) & i43) | ((~i43) & i44);
                int i55 = i43 & i44;
                int i56 = (i55 & i54) | (i54 ^ i55);
                int i57 = i33 >>> 19;
                int i58 = i33 << 13;
                int i59 = ((~i58) & i57) | ((~i57) & i58);
                int i60 = i58 & i57;
                int i61 = (i60 & i59) | (i59 ^ i60);
                int i62 = i56 & i61;
                int i63 = ((i61 ^ i56) | i62) & (~i62);
                int i64 = i42 & i63;
                int i65 = ((i63 ^ i42) | i64) & (~i64);
                int i66 = -(-i7);
                int i67 = i65 & i66;
                i9 = (i67 - (~(-(-((i66 ^ i65) | i67))))) - 1;
            }
            int i68 = (-2) - (((i30 ^ 124) + ((i30 & 124) << 1)) ^ (-1));
            int i69 = i68 % 128;
            a = i69;
            if (i68 % 2 != 0) {
                i10 = i8 * 4;
                i11 = (i8 & (-54)) + (i8 | (-54));
                i12 = i8 << 105;
            } else {
                i10 = i8 >>> 3;
                i11 = i8 >>> 7;
                i12 = i8 << 25;
            }
            int i70 = i11 & i12;
            int i71 = (i11 | i12) & (~i70);
            int i72 = (i71 & i70) | (i71 ^ i70);
            int i73 = i8 >>> 18;
            int i74 = i8 << 14;
            int i75 = i73 & i74;
            int i76 = (i74 | i73) & (~i75);
            int i77 = (i76 & i75) | (i76 ^ i75);
            int i78 = (i77 & (~i72)) | ((~i77) & i72);
            int i79 = (~i78) & i10;
            int i80 = (~i10) & i78;
            int i81 = (i9 - (~((i80 & i79) | (i79 ^ i80)))) - 1;
            int i82 = ((i69 ^ 93) | (i69 & 93)) << 1;
            int i83 = -((93 & (~i69)) | (i69 & (-94)));
            int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
            b = i84 % 128;
            int i85 = i84 % 2;
            int i86 = i24 & (-16);
            int i87 = (~i86) & (i24 | (-16));
            int i88 = -(-(i86 << 1));
            int i89 = -(~(-(-iArr[(i87 ^ i88) + ((i88 & i87) << 1)])));
            iArr[i24] = (((i81 | i89) << 1) - (i89 ^ i81)) - 1;
            int i90 = i24 & 1;
            int i91 = -(-(i24 | 1));
            i24 = (i91 | i90) + (i90 & i91);
            int i92 = i69 | 67;
            int i93 = (i92 << 1) - (i92 & (~(i69 & 67)));
            b = i93 % 128;
            int i94 = i93 % 2;
        }
        int i95 = this.h;
        int i96 = this.j;
        int i97 = b;
        int i98 = i97 + 25;
        a = i98 % 128;
        if (i98 % 2 != 0) {
            i = this.i;
            i2 = this.k;
            int i99 = 91 / 0;
        } else {
            i = this.i;
            i2 = this.k;
        }
        int i100 = this.l;
        int i101 = this.g;
        int i102 = this.m;
        int i103 = (i97 & 113) + (i97 | 113);
        int i104 = i103 % 128;
        a = i104;
        if (i103 % 2 != 0) {
            i3 = this.n;
            i4 = 1;
        } else {
            i3 = this.n;
            i4 = 0;
        }
        int i105 = (((i104 & (-8)) | ((~i104) & 7)) - (~((i104 & 7) << 1))) - 1;
        b = i105 % 128;
        int i106 = i105 % 2;
        int i107 = 0;
        int i108 = i4;
        while (i108 < 8) {
            int i109 = b;
            int i110 = i109 & 41;
            int i111 = i109 | 41;
            int i112 = (i110 & i111) + (i110 | i111);
            a = i112 % 128;
            int i113 = i112 % i13;
            int iQ = q(i100);
            int iN = n(i100, i101, i102);
            int[] iArr2 = f;
            int i114 = (iN - (~(-(~iQ)))) - i13;
            int i115 = -(~(-(-iArr2[i107])));
            int i116 = ((i114 & i115) + (i115 | i114)) - 1;
            int i117 = -(-this.f92o[i107]);
            int i118 = (i116 ^ i117) + ((i116 & i117) << 1);
            int i119 = (i118 ^ i3) + ((i118 & i3) << 1);
            int i120 = i2 ^ i119;
            int i121 = -(-((i2 & i119) << 1));
            int i122 = ((i120 | i121) << 1) - (i120 ^ i121);
            int iP = (p(i95, i96, i) - (~(-(~o(i95))))) - i13;
            int i123 = a;
            int i124 = ((i123 | 95) << 1) - (i123 ^ 95);
            b = i124 % 128;
            int i125 = i124 % i13;
            int i126 = -(-i119);
            int i127 = ((iP | i126) << 1) - (i126 ^ iP);
            int i128 = i107 & 1;
            int i129 = ((i107 | 1) & (~i128)) + (i128 << 1);
            int iQ2 = q(i122);
            int iN2 = n(i122, i100, i101);
            int i130 = -(~(-(-iQ2)));
            int i131 = (((iN2 | i130) << 1) - (i130 ^ iN2)) - 1;
            int i132 = -(-iArr2[i129]);
            int i133 = i131 ^ i132;
            int i134 = (i132 & i131) << 1;
            int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
            int i136 = -(-this.f92o[i129]);
            int i137 = i135 & i136;
            int i138 = ((i135 ^ i136) | i137) << 1;
            int i139 = -((~i137) & (i136 | i135));
            int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
            int i141 = -(-(((i140 | i102) << 1) - (i140 ^ i102)));
            int i142 = (i & i141) + (i | i141);
            int iO = o(i127);
            int iP2 = p(i127, i95, i96);
            int i143 = iP2 ^ iO;
            int i144 = (iO & iP2) << 1;
            int i145 = (i143 & i144) + (i144 | i143);
            int i146 = i145 & i141;
            int i147 = (i141 ^ i145) | i146;
            int i148 = (i146 & i147) + (i147 | i146);
            int i149 = a;
            int i150 = (i149 | 27) << 1;
            int i151 = -(((~i149) & 27) | (i149 & (-28)));
            int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
            b = i152 % 128;
            int i153 = i152 % 2;
            int i154 = i129 & 1;
            int i155 = i154 + ((i129 ^ 1) | i154);
            int iQ3 = q(i142);
            int iN3 = n(i142, i122, i100);
            int i156 = -(-iQ3);
            int i157 = (iN3 ^ i156) + ((i156 & iN3) << 1);
            int i158 = -(-iArr2[i155]);
            int i159 = (i157 | i158) << 1;
            int i160 = -(i158 ^ i157);
            int i161 = (i159 & i160) + (i160 | i159);
            int i162 = -(-this.f92o[i155]);
            int i163 = i161 & i162;
            int i164 = i163 + ((i162 ^ i161) | i163);
            int i165 = -(-i101);
            int i166 = ((i164 ^ i165) | (i164 & i165)) << 1;
            int i167 = -((i165 & (~i164)) | ((~i165) & i164));
            int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
            int i169 = -(-i168);
            int i170 = ((~i169) & i96) | ((~i96) & i169);
            int i171 = (i96 & i169) << 1;
            int i172 = (i170 & i171) + (i171 | i170);
            int iO2 = o(i148);
            int iP3 = p(i148, i127, i95);
            int i173 = ((~iO2) & iP3) | ((~iP3) & iO2);
            int i174 = (iO2 & iP3) << 1;
            int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
            int i176 = i175 ^ i168;
            int i177 = (i168 & i175) << 1;
            int i178 = ((i176 | i177) << 1) - (i176 ^ i177);
            int i179 = a;
            int i180 = i179 & 59;
            int i181 = (i179 ^ 59) | i180;
            int i182 = (i180 & i181) + (i181 | i180);
            b = i182 % 128;
            int i183 = i182 % 2;
            int i184 = i155 & 1;
            int i185 = i184 + ((i155 ^ 1) | i184);
            int iN4 = n(i172, i142, i122) + q(i172);
            int i186 = iArr2[i185];
            int i187 = iN4 & i186;
            int i188 = -(-((i186 ^ iN4) | i187));
            int i189 = (i187 ^ i188) + ((i188 & i187) << 1);
            int i190 = -(~(-(-this.f92o[i185])));
            int i191 = (-2) - (((i189 ^ i190) + ((i190 & i189) << 1)) ^ (-1));
            int i192 = -(-i100);
            int i193 = (((~i192) & i191) | ((~i191) & i192)) + ((i191 & i192) << 1);
            int i194 = ((i95 ^ i193) | (i95 & i193)) << 1;
            int i195 = -(((~i95) & i193) | ((~i193) & i95));
            int i196 = ((i194 | i195) << 1) - (i194 ^ i195);
            int iO3 = o(i178);
            int iP4 = p(i178, i148, i127);
            int i197 = -(-iO3);
            int i198 = iP4 & i197;
            int i199 = (i197 ^ iP4) | i198;
            int i200 = (i198 & i199) + (i199 | i198);
            int i201 = -(-i193);
            int i202 = ((((i200 ^ i201) | (i200 & i201)) << 1) - (~(-((i201 & (~i200)) | ((~i201) & i200))))) - 1;
            int i203 = i185 & 111;
            int i204 = ((~i203) & (i185 | 111)) + (i203 << 1);
            int i205 = (i204 ^ (-109)) + ((i204 & (-109)) << 1);
            int i206 = i205 - 1;
            int i207 = a;
            int i208 = ((i207 | 41) << 1) - (i207 ^ 41);
            b = i208 % 128;
            int i209 = i208 % 2;
            int iQ4 = q(i196);
            int iN5 = n(i196, i172, i142);
            int i210 = iN5 & iQ4;
            int i211 = -(-(iQ4 | iN5));
            int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
            int i213 = -(~iArr2[i206]);
            int i214 = ((((-2) - (((i212 ^ i213) + ((i213 & i212) << 1)) ^ (-1))) + this.f92o[i206]) - (~(-(~i122)))) - 2;
            int i215 = i127 & i214;
            int i216 = (i127 ^ i214) | i215;
            i3 = (i215 & i216) + (i215 | i216);
            int iO4 = o(i202);
            int iP5 = p(i202, i178, i148);
            int i217 = -(-iO4);
            int i218 = iP5 & i217;
            int i219 = ((i217 | iP5) & (~i218)) + (i218 << 1);
            int i220 = i219 & i214;
            int i221 = ((i219 ^ i214) | i220) + i220;
            int i222 = i205 - 113;
            int i223 = (i222 ^ 113) + ((i222 & 113) << 1);
            int iQ5 = q(i3);
            int i224 = b;
            int i225 = (i224 & 27) + (i224 | 27);
            a = i225 % 128;
            int i226 = i225 % 2;
            int iN6 = n(i3, i196, i172);
            int i227 = -(-iQ5);
            int i228 = (iN6 ^ i227) + ((i227 & iN6) << 1);
            int i229 = -(-iArr2[i223]);
            int i230 = ((i228 | i229) << 1) - (i229 ^ i228);
            int i231 = this.f92o[i223];
            int i232 = i230 & i231;
            int i233 = -(-(i231 | i230));
            int i234 = (i232 ^ i233) + ((i233 & i232) << 1);
            int i235 = i234 & i142;
            int i236 = i235 + ((i142 ^ i234) | i235);
            int i237 = i148 & i236;
            int i238 = i148 | i236;
            i102 = (i237 ^ i238) + ((i237 & i238) << 1);
            int iO5 = o(i221);
            int iP6 = p(i221, i202, i178);
            int i239 = (((((~iO5) & iP6) | ((~iP6) & iO5)) + ((iO5 & iP6) << 1)) - (~(-(-i236)))) - 1;
            int i240 = i223 & (-11);
            int i241 = i240 + ((i223 ^ (-11)) | i240);
            int i242 = (i241 & (-13)) | ((~i241) & 12);
            int i243 = -(-((i241 & 12) << 1));
            int i244 = (i242 ^ i243) + ((i242 & i243) << 1);
            int iQ6 = q(i102);
            int i245 = a + 121;
            b = i245 % 128;
            int i246 = i245 % 2;
            int iN7 = (((-2) - ((n(i102, i3, i196) - (~iQ6)) ^ (-1))) - (~iArr2[i244])) - 1;
            int i247 = -(-this.f92o[i244]);
            int i248 = (iN7 & i247) + (iN7 | i247);
            int i249 = i248 & i172;
            int i250 = i249 + ((i248 ^ i172) | i249);
            int i251 = -(-i250);
            int i252 = i178 & i251;
            i101 = ((i251 | i178) & (~i252)) + (i252 << 1);
            int iP7 = p(i239, i221, i202) + o(i239);
            i96 = (i250 | iP7) + (iP7 & i250);
            int i253 = i244 ^ 1;
            int i254 = ((i244 & 1) | i253) << 1;
            int i255 = -i253;
            int i256 = (i254 ^ i255) + ((i255 & i254) << 1);
            int iQ7 = q(i101);
            int i257 = b + 19;
            a = i257 % 128;
            int i258 = i257 % 2;
            int iN8 = n(i101, i102, i3);
            int i259 = ((((iN8 | iQ7) << 1) - (iQ7 ^ iN8)) - (~(-(-iArr2[i256])))) - 1;
            int i260 = -(-this.f92o[i256]);
            int i261 = ((~i260) & i259) | ((~i259) & i260);
            int i262 = -(-((i260 & i259) << 1));
            int i263 = (i261 & i262) + (i262 | i261);
            int i264 = (i263 | i196) << 1;
            int i265 = -(i263 ^ i196);
            int i266 = (i264 ^ i265) + ((i264 & i265) << 1);
            int iO6 = o(i96);
            int iP8 = p(i96, i239, i221);
            i107 = i256 + 1;
            i108 = ((i108 | 1) << 1) - (i108 ^ 1);
            i100 = ((i202 | i266) << 1) - (i202 ^ i266);
            int i267 = iP8 ^ iO6;
            int i268 = ((iO6 & iP8) | i267) << 1;
            int i269 = -i267;
            int i270 = ((((i268 | i269) << 1) - (i268 ^ i269)) - (~(-(~i266)))) - 2;
            int i271 = a;
            int i272 = (i271 ^ 93) + ((i271 & 93) << 1);
            b = i272 % 128;
            int i273 = i272 % 2;
            i = i239;
            i2 = i221;
            i95 = i270;
            i13 = 2;
        }
        int i274 = this.h;
        int i275 = -(-i95);
        int i276 = i274 & i275;
        this.h = (i276 - (~(-(-((i274 ^ i275) | i276))))) - 1;
        int i277 = this.j;
        int i278 = b + 31;
        int i279 = i278 % 128;
        a = i279;
        if (i278 % 2 != 0) {
            this.j = i277 << i96;
            i5 = this.i >>> i;
        } else {
            this.j = (i277 - (~(-(-i96)))) - 1;
            i5 = (this.i - (~(-(-i)))) - 1;
        }
        this.i = i5;
        int i280 = i279 & 89;
        int i281 = (~i280) & (i279 | 89);
        int i282 = i280 << 1;
        int i283 = (i281 ^ i282) + ((i282 & i281) << 1);
        int i284 = i283 % 128;
        b = i284;
        int i285 = i283 % 2;
        int i286 = this.k;
        this.k = i285 == 0 ? i286 << i2 : i286 + i2;
        int i287 = this.l;
        int i288 = i284 & 17;
        int i289 = -(-((i284 ^ 17) | i288));
        int i290 = (i288 & i289) + (i289 | i288);
        int i291 = i290 % 128;
        a = i291;
        if (i290 % 2 != 0) {
            this.l = i287 / i100;
            this.g >>= i101;
        } else {
            int i292 = i287 & i100;
            int i293 = ((i287 ^ i100) | i292) << 1;
            int i294 = -((i287 | i100) & (~i292));
            this.l = (i293 ^ i294) + ((i294 & i293) << 1);
            int i295 = this.g;
            int i296 = i295 & i101;
            int i297 = (i295 ^ i101) | i296;
            this.g = ((i296 | i297) << 1) - (i297 ^ i296);
        }
        int i298 = this.m;
        int i299 = -(-i102);
        int i300 = i298 & i299;
        int i301 = (i298 ^ i299) | i300;
        this.m = (i300 & i301) + (i301 | i300);
        int i302 = this.n;
        int i303 = ((i291 ^ 23) | (i291 & 23)) << 1;
        int i304 = -(((~i291) & 23) | (i291 & (-24)));
        int i305 = ((i303 | i304) << 1) - (i304 ^ i303);
        b = i305 % 128;
        if (i305 % 2 == 0) {
            this.n = i302 * i3;
            this.p = 0;
            i6 = 1;
        } else {
            int i306 = -(-i3);
            int i307 = i302 & i306;
            this.n = (((i306 | i302) & (~i307)) - (~(-(-(i307 << 1))))) - 1;
            this.p = 0;
            i6 = 0;
        }
        while (i6 < 16) {
            int i308 = a;
            int i309 = i308 & 23;
            int i310 = -(-((i308 ^ 23) | i309));
            int i311 = ((i309 | i310) << 1) - (i310 ^ i309);
            b = i311 % 128;
            int i312 = i311 % 2;
            int[] iArr3 = this.f92o;
            if (i312 == 0) {
                iArr3[i6] = 0;
                int i313 = i6 & (-32);
                int i314 = ((i6 | (-32)) & (~i313)) + (i313 << 1);
                int i315 = i314 & 42;
                i6 = (i315 - (~((i314 ^ 42) | i315))) - 1;
            } else {
                iArr3[i6] = 0;
                int i316 = i6 & 1;
                int i317 = ((i6 ^ 1) | i316) << 1;
                int i318 = -((i6 | 1) & (~i316));
                i6 = (i317 & i318) + (i318 | i317);
            }
        }
        int i319 = b;
        int i320 = ((i319 ^ 56) + ((i319 & 56) << 1)) - 1;
        a = i320 % 128;
        int i321 = i320 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void l(byte[] bArr, int i) {
        byte b2;
        byte b3;
        byte b4;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 105;
        int i6 = ((i4 ^ 105) | i5) << 1;
        int i7 = -((i4 | 105) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        a = i9;
        if (i8 % 2 != 0) {
            b2 = bArr[i];
            b3 = bArr[i];
        } else {
            b2 = bArr[i];
            i = ((i | 1) << 1) - (i ^ 1);
            b3 = bArr[i];
        }
        int i10 = ((i ^ 1) | (i & 1)) << 1;
        int i11 = -(((~i) & 1) | (i & (-2)));
        int i12 = (i10 & i11) + (i11 | i10);
        byte b5 = bArr[i12];
        int i13 = (i9 & (-18)) | ((~i9) & 17);
        int i14 = -(-((i9 & 17) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        int i16 = i15 % 128;
        b = i16;
        if (i15 % 2 == 0) {
            b4 = bArr[i12 >> 1];
        } else {
            int i17 = i12 & 1;
            int i18 = (i12 ^ 1) | i17;
            b4 = bArr[(i17 ^ i18) + ((i17 & i18) << 1)];
        }
        int[] iArr = this.f92o;
        int i19 = this.p;
        int i20 = b4 & 255;
        int i21 = i16 & 75;
        int i22 = (i16 ^ 75) | i21;
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        int i25 = b2 << 24;
        int i26 = (b3 & 255) << 16;
        int i27 = (i25 & i26) | (i25 ^ i26);
        int i28 = (i16 ^ 29) + ((i16 & 29) << 1);
        a = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = b5 & 255;
            int i30 = (b5 | 255) & (~i29);
            int i31 = ((i30 & i29) | (i30 ^ i29)) * 92;
            iArr[i19] = i20 & (i31 | i27) & (~(i27 & i31));
            int i32 = i19 << 1;
            int i33 = -i19;
            i2 = (i32 & i33) + (i32 | i33);
        } else {
            int i34 = (b5 & 255) << 8;
            int i35 = ((~i34) & i27) | ((~i27) & i34);
            int i36 = i34 & i27;
            int i37 = (i36 & i35) | (i35 ^ i36);
            int i38 = i20 & i37;
            int i39 = (i20 | i37) & (~i38);
            iArr[i19] = (i39 & i38) | (i39 ^ i38);
            i2 = ((i19 & 2) + (i19 | 2)) - 1;
        }
        int i40 = i16 & 33;
        int i41 = (i16 ^ 33) | i40;
        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
        a = i42 % 128;
        int i43 = i42 % 2;
        this.p = i2;
        if (i2 == 16) {
            int i44 = (i16 & 113) + (i16 | 113);
            a = i44 % 128;
            int i45 = i44 % 2;
            k();
            int i46 = a;
            int i47 = (i46 ^ 121) + ((i46 & 121) << 1);
            b = i47 % 128;
            int i48 = i47 % 2;
        }
        int i49 = b + 115;
        a = i49 % 128;
        int i50 = i49 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.j
    public void m() {
        int i = 2 % 2;
        int i2 = a + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.m();
        this.h = -1056596264;
        this.j = 914150663;
        int i4 = b + 85;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        this.i = 812702999;
        this.k = -150054599;
        this.l = -4191439;
        if (i6 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.g = 1750603025;
        this.m = 1694076839;
        this.n = -1090891868;
        int i7 = (((i5 & (-40)) | ((~i5) & 39)) - (~(-(-((i5 & 39) << 1))))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            this.p = 1;
        } else {
            this.p = 0;
        }
        int i8 = 0;
        while (true) {
            int[] iArr = this.f92o;
            if (i8 == iArr.length) {
                int i9 = a;
                int i10 = (i9 ^ 105) + ((i9 & 105) << 1);
                b = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = b;
            int i13 = i12 & 33;
            int i14 = (((i12 | 33) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            iArr[i8] = 0;
            int i17 = (i8 ^ (-117)) + ((i8 & (-117)) << 1);
            int i18 = i17 & 118;
            int i19 = ((i17 ^ 118) | i18) << 1;
            int i20 = -((i17 | 118) & (~i18));
            i8 = ((i19 | i20) << 1) - (i19 ^ i20);
            int i21 = i15 | 33;
            int i22 = i21 << 1;
            int i23 = -(i21 & (~(i15 & 33)));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    public final int n(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 115) - (~(-(-((i5 & 115) << 1))))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i3 & (~i);
        int i9 = i & i2;
        int i10 = i8 & i9;
        int i11 = ((i9 ^ i8) | i10) & (~i10);
        int i12 = i5 + 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        return i11;
    }

    public final int o(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 107;
        int i5 = (i3 | 107) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = i << 10;
        int i11 = i >>> 22;
        int i12 = i10 ^ i11;
        int i13 = i10 & i11;
        int i14 = (i13 & i12) | (i12 ^ i13);
        int i15 = i >>> 2;
        int i16 = ((i8 & (-102)) | ((~i8) & 101)) + ((i8 & 101) << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = i >> 30;
            int i18 = i15 & i17;
            int i19 = (i17 | i15) & (~i18);
            return (i + 27) & (i >>> 125) & ((i19 & i18) | (i19 ^ i18)) & i14;
        }
        int i20 = i << 30;
        int i21 = (i20 & i15) | (i15 ^ i20);
        int i22 = i >>> 13;
        int i23 = i << 19;
        int i24 = i22 ^ i23;
        int i25 = i23 & i22;
        int i26 = (i25 & i24) | (i24 ^ i25);
        int i27 = (i26 & (~i21)) | ((~i26) & i21);
        return (i27 | i14) & (~(i14 & i27));
    }

    public final int p(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 & 9;
        int i9 = (~i8) & (i7 | 9);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i & i3;
        if (i11 % 2 != 0) {
            int i13 = (~i12) & (i | i3);
            int i14 = ~i3;
            int i15 = i12 | i13;
            int i16 = ~i2;
            int i17 = (i & i16) | ((~i) & i2);
            int i18 = i & i2;
            int i19 = (i18 & i17) | (i17 ^ i18);
            int i20 = i15 & i19;
            int i21 = (i19 | i15) & (~i20);
            int i22 = (i21 & i20) | (i21 ^ i20);
            int i23 = (i2 & i14) | (i16 & i3);
            int i24 = i2 & i3;
            int i25 = (i24 & i23) | (i23 ^ i24);
            i4 = ((~i25) & i22) | ((~i22) & i25);
            i5 = i22 & i25;
        } else {
            int i26 = i & i2;
            int i27 = (i26 | i12) & (~(i12 & i26));
            int i28 = i2 & i3;
            i4 = (~i28) & i27;
            i5 = (~i27) & i28;
        }
        int i29 = (i5 & i4) | (i4 ^ i5);
        int i30 = i7 & 91;
        int i31 = -(-((i7 ^ 91) | i30));
        int i32 = (i30 & i31) + (i30 | i31);
        a = i32 % 128;
        if (i32 % 2 == 0) {
            return i29;
        }
        throw null;
    }

    public final int q(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 & 59) - (~(i5 | 59))) - 1;
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0) {
            i2 = (i >>> 27) & (i >>> 8);
            i3 = i >>> 55;
        } else {
            int i8 = i << 7;
            int i9 = i >>> 25;
            i2 = (i8 & i9) | (i8 ^ i9);
            i3 = i >>> 6;
        }
        int i10 = i7 & 25;
        int i11 = (((i7 ^ 25) | i10) << 1) - ((~i10) & (i7 | 25));
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i << 26;
        int i14 = i3 & i13;
        int i15 = (i3 | i13) & (~i14);
        int i16 = (i15 & i14) | (i15 ^ i14);
        int i17 = i >>> 11;
        int i18 = i << 21;
        int i19 = i17 ^ i18;
        int i20 = i18 & i17;
        int i21 = (i20 & i19) | (i19 ^ i20);
        int i22 = i16 & i21;
        int i23 = ((i21 ^ i16) | i22) & (~i22);
        int i24 = (i7 ^ 62) + ((i7 & 62) << 1);
        int i25 = (i24 ^ (-1)) + (i24 << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        int i27 = i2 & i23;
        int i28 = ((i23 ^ i2) | i27) & (~i27);
        int i29 = i7 & 109;
        int i30 = (i7 | 109) & (~i29);
        int i31 = i29 << 1;
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        a = i32 % 128;
        if (i32 % 2 == 0) {
            return i28;
        }
        throw null;
    }
}
