package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public class t extends J {
    private static int a = 1;
    private static int b;
    public ivas.gov.bisp.enumeration.cB.t[] c;
    public C0258a d;
    public C0278x e;
    public byte[][] f;
    public byte[][] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    public t(Q q) {
        int i;
        byte[][][][] bArr;
        byte[][][] bArr2;
        Q q2;
        i iVarU;
        int i2;
        byte[][] bArr3;
        i iVarU2;
        byte[] bArr4;
        int i3;
        int i4;
        byte[][] bArr5;
        i iVarU3;
        int i5 = 0;
        if (q.u(0) instanceof C0258a) {
            this.d = C0258a.p(q.u(0));
            int i6 = b + 121;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            this.e = C0278x.o(q.u(0));
            int i8 = a;
            int i9 = i8 & 71;
            int i10 = (i8 ^ 71) | i9;
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        int i14 = 1;
        Q q3 = (Q) q.u(1);
        int size = q3.size();
        int i15 = a + 97;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            this.f = new byte[size][];
        } else {
            this.f = new byte[size][];
        }
        int i16 = 2 % 2;
        int i17 = 0;
        while (i17 < q3.size()) {
            int i18 = a;
            int i19 = ((i18 & 68) + (i18 | 68)) - 1;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                bArr5 = this.f;
                iVarU3 = q3.u(i17);
                int i20 = 76 / 0;
            } else {
                bArr5 = this.f;
                iVarU3 = q3.u(i17);
            }
            byte[] bArr6 = ((M) iVarU3).c;
            int i21 = b;
            int i22 = i21 & 67;
            int i23 = -(-((i21 ^ 67) | i22));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
            bArr5[i17] = bArr6;
            int i26 = (i17 ^ (-85)) + ((i17 & (-85)) << 1);
            i17 = ((i26 | 86) << 1) - (i26 ^ 86);
            int i27 = ((i21 ^ 39) | (i21 & 39)) << 1;
            int i28 = -((i21 & (-40)) | ((~i21) & 39));
            int i29 = (i27 & i28) + (i27 | i28);
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        M m = (M) ((Q) q.u(2)).u(0);
        int i31 = b + 107;
        a = i31 % 128;
        if (i31 % 2 == 0) {
            this.h = m.c;
        } else {
            this.h = m.c;
        }
        i iVarU4 = q.u(3);
        int i32 = b;
        int i33 = i32 & 95;
        int i34 = (((i32 ^ 95) | i33) << 1) - ((i32 | 95) & (~i33));
        a = i34 % 128;
        int i35 = i34 % 2;
        Q q4 = (Q) iVarU4;
        byte[][] bArr7 = new byte[q4.size()][];
        int i36 = b;
        int i37 = i36 + 1;
        a = i37 % 128;
        if (i37 % 2 == 0) {
            this.g = bArr7;
        } else {
            this.g = bArr7;
        }
        int i38 = (((i36 ^ 1) | (i36 & 1)) << 1) - (((~i36) & 1) | (i36 & (-2)));
        a = i38 % 128;
        int i39 = i38 % 2;
        int i40 = 0;
        while (i40 < q4.size()) {
            int i41 = b + 55;
            a = i41 % 128;
            int i42 = i41 % 2;
            byte[][] bArr8 = this.g;
            M m2 = (M) q4.u(i40);
            int i43 = a;
            int i44 = (i43 & (-18)) | ((~i43) & 17);
            int i45 = -(-((i43 & 17) << 1));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            b = i46 % 128;
            int i47 = i46 % 2;
            bArr8[i40] = m2.c;
            int i48 = i40 - 89;
            i40 = ((i48 & 90) << 1) + (i48 ^ 90);
            int i49 = b;
            int i50 = (i49 & (-32)) | ((~i49) & 31);
            int i51 = -(-((i49 & 31) << 1));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            a = i52 % 128;
            if (i52 % 2 == 0) {
                int i53 = 2 / 5;
            }
        }
        M m3 = (M) ((Q) q.u(4)).u(0);
        int i54 = b;
        int i55 = ((i54 & (-62)) | ((~i54) & 61)) + ((i54 & 61) << 1);
        a = i55 % 128;
        int i56 = i55 % 2;
        this.i = m3.c;
        i iVarU5 = q.u(5);
        int i57 = a;
        int i58 = (((i57 | 26) << 1) - (i57 ^ 26)) - 1;
        b = i58 % 128;
        int i59 = i58 % 2;
        byte[] bArr9 = ((M) ((Q) iVarU5).u(0)).c;
        int i60 = a;
        int i61 = ((i60 ^ 31) | (i60 & 31)) << 1;
        int i62 = -(((~i60) & 31) | (i60 & (-32)));
        int i63 = (i61 & i62) + (i62 | i61);
        b = i63 % 128;
        if (i63 % 2 != 0) {
            this.j = bArr9;
            i = 106;
        } else {
            this.j = bArr9;
            i = 6;
        }
        Q q5 = (Q) q.u(i);
        byte[][][][] bArr10 = new byte[q5.size()][][][];
        int size2 = q5.size();
        int i64 = a + 31;
        b = i64 % 128;
        if (i64 % 2 != 0) {
            bArr = new byte[size2][][][];
            bArr2 = new byte[q5.size()][][];
            int i65 = 44 / 0;
        } else {
            bArr = new byte[size2][][][];
            bArr2 = new byte[q5.size()][][];
        }
        int i66 = b + 25;
        a = i66 % 128;
        int i67 = i66 % 2;
        byte[][] bArr11 = new byte[q5.size()][];
        int i68 = a + 125;
        b = i68 % 128;
        int i69 = i68 % 2;
        int i70 = 0;
        while (i70 < q5.size()) {
            int i71 = a;
            int i72 = (((i71 ^ 79) | (i71 & 79)) << i14) - (((~i71) & 79) | (i71 & (-80)));
            b = i72 % 128;
            if (i72 % 2 != 0) {
                q2 = (Q) q5.u(i70);
                iVarU = q2.u(i5);
            } else {
                q2 = (Q) q5.u(i70);
                iVarU = q2.u(i5);
            }
            Q q6 = (Q) iVarU;
            byte[][][] bArr12 = new byte[q6.size()][][];
            int i73 = a;
            int i74 = (((i73 | 22) << i14) - (i73 ^ 22)) - i14;
            int i75 = i74 % 128;
            b = i75;
            int i76 = i74 % 2;
            bArr10[i70] = bArr12;
            int i77 = (((i75 | 13) << i14) - (~(-(((~i75) & 13) | (i75 & (-14)))))) - i14;
            a = i77 % 128;
            int i78 = i77 % 2;
            int i79 = i5;
            while (i79 < q6.size()) {
                int i80 = b + 77;
                a = i80 % 128;
                int i81 = i80 % 2;
                Q q7 = (Q) q6.u(i79);
                int i82 = a;
                int i83 = i82 & 49;
                int i84 = (i82 ^ 49) | i83;
                int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
                b = i85 % 128;
                int i86 = i85 % 2;
                bArr10[i70][i79] = new byte[q7.size()][];
                int i87 = a;
                int i88 = ((i87 | 79) << i14) - (i87 ^ 79);
                b = i88 % 128;
                int i89 = i88 % 2;
                int i90 = i87 + 71;
                b = i90 % 128;
                int i91 = i90 % 2;
                int i92 = 0;
                while (i92 < q7.size()) {
                    int i93 = b;
                    int i94 = i93 + 31;
                    a = i94 % 128;
                    if (i94 % 2 == 0) {
                        byte[][] bArr13 = bArr10[i70][i79];
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    byte[][] bArr14 = bArr10[i70][i79];
                    int i95 = i93 & 93;
                    int i96 = (i93 ^ 93) | i95;
                    int i97 = (i95 & i96) + (i96 | i95);
                    a = i97 % 128;
                    int i98 = i97 % 2;
                    byte[] bArr15 = ((M) q7.u(i92)).c;
                    int i99 = b;
                    int i100 = i99 & 71;
                    int i101 = -(-(i99 | 71));
                    int i102 = (i100 ^ i101) + ((i100 & i101) << 1);
                    Q q8 = q5;
                    a = i102 % 128;
                    if (i102 % 2 == 0) {
                        bArr14[i92] = bArr15;
                        int i103 = i92 & 106;
                        int i104 = -(-((i92 ^ 106) | i103));
                        i3 = i103 & i104;
                        i4 = i103 | i104;
                    } else {
                        bArr14[i92] = bArr15;
                        int i105 = i92 & (-18);
                        int i106 = (i92 | (-18)) & (~i105);
                        int i107 = i105 << 1;
                        int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                        int i109 = i108 | 19;
                        int i110 = i109 << 1;
                        int i111 = -(i109 & (~(i108 & 19)));
                        i3 = i110 ^ i111;
                        i4 = (i111 & i110) << 1;
                    }
                    i92 = i3 + i4;
                    q5 = q8;
                }
                Q q9 = q5;
                int i112 = i79 & 1;
                int i113 = ((i79 ^ 1) | i112) << 1;
                int i114 = -((~i112) & (i79 | 1));
                i79 = ((i113 | i114) << 1) - (i113 ^ i114);
                int i115 = b + 55;
                a = i115 % 128;
                int i116 = i115 % 2;
                q5 = q9;
                i14 = 1;
            }
            Q q10 = q5;
            int i117 = i14;
            Q q11 = (Q) q2.u(i117);
            int i118 = a;
            int i119 = (i118 & (-82)) | ((~i118) & 81);
            int i120 = -(-((i118 & 81) << i117));
            int i121 = (i119 & i120) + (i120 | i119);
            b = i121 % 128;
            if (i121 % 2 != 0) {
                bArr[i70] = new byte[q11.size()][][];
            } else {
                bArr[i70] = new byte[q11.size()][][];
            }
            int i122 = b;
            int i123 = i122 & 33;
            int i124 = i123 + ((i122 ^ 33) | i123);
            a = i124 % 128;
            int i125 = i124 % 2;
            int i126 = 0;
            while (i126 < q11.size()) {
                int i127 = a;
                int i128 = i127 ^ 57;
                int i129 = ((i127 & 57) | i128) << 1;
                int i130 = -i128;
                int i131 = (i129 & i130) + (i129 | i130);
                b = i131 % 128;
                int i132 = i131 % 2;
                Q q12 = (Q) q11.u(i126);
                byte[][][] bArr16 = bArr[i70];
                int i133 = (-2) - ((b + 120) ^ (-1));
                a = i133 % 128;
                if (i133 % 2 == 0) {
                    bArr16[i126] = new byte[q12.size()][];
                } else {
                    bArr16[i126] = new byte[q12.size()][];
                }
                int i134 = b;
                int i135 = i134 & 83;
                int i136 = i134 | 83;
                int i137 = (i135 & i136) + (i136 | i135);
                a = i137 % 128;
                int i138 = i137 % 2;
                int i139 = 0;
                while (i139 < q12.size()) {
                    int i140 = a;
                    int i141 = (i140 & (-74)) | ((~i140) & 73);
                    int i142 = -(-((i140 & 73) << 1));
                    int i143 = (i141 & i142) + (i142 | i141);
                    b = i143 % 128;
                    if (i143 % 2 != 0) {
                        bArr3 = bArr[i70][i126];
                        iVarU2 = q12.u(i139);
                        int i144 = 84 / 0;
                    } else {
                        bArr3 = bArr[i70][i126];
                        iVarU2 = q12.u(i139);
                    }
                    int i145 = a;
                    int i146 = i145 & 51;
                    int i147 = i146 + ((i145 ^ 51) | i146);
                    b = i147 % 128;
                    if (i147 % 2 != 0) {
                        bArr4 = ((M) iVarU2).c;
                        int i148 = 17 / 0;
                    } else {
                        bArr4 = ((M) iVarU2).c;
                    }
                    int i149 = a;
                    int i150 = ((i149 ^ 125) | (i149 & 125)) << 1;
                    int i151 = -((i149 & (-126)) | ((~i149) & 125));
                    int i152 = (i150 & i151) + (i150 | i151);
                    Q q13 = q11;
                    b = i152 % 128;
                    int i153 = i152 % 2;
                    bArr3[i139] = bArr4;
                    int i154 = i139 - 36;
                    int i155 = (i154 ^ (-1)) + (i154 << 1);
                    int i156 = i155 & 38;
                    i139 = (i156 - (~((i155 ^ 38) | i156))) - 1;
                    int i157 = (i149 ^ 72) + ((i149 & 72) << 1);
                    int i158 = (i157 ^ (-1)) + (i157 << 1);
                    b = i158 % 128;
                    int i159 = i158 % 2;
                    q11 = q13;
                }
                Q q14 = q11;
                int i160 = i126 & 1;
                i126 = ((i126 ^ 1) | i160) + i160;
                int i161 = a;
                int i162 = (i161 ^ 41) + ((i161 & 41) << 1);
                b = i162 % 128;
                int i163 = i162 % 2;
                q11 = q14;
            }
            Q q15 = (Q) q2.u(2);
            int i164 = b;
            int i165 = i164 & 41;
            int i166 = ((i164 ^ 41) | i165) << 1;
            int i167 = -((i164 | 41) & (~i165));
            int i168 = (i166 & i167) + (i167 | i166);
            a = i168 % 128;
            if (i168 % 2 == 0) {
                bArr2[i70] = new byte[q15.size()][];
                i2 = 1;
            } else {
                bArr2[i70] = new byte[q15.size()][];
                i2 = 0;
            }
            while (i2 < q15.size()) {
                int i169 = b + 51;
                a = i169 % 128;
                int i170 = i169 % 2;
                byte[][] bArr17 = bArr2[i70];
                M m4 = (M) q15.u(i2);
                int i171 = b + 23;
                a = i171 % 128;
                int i172 = i171 % 2;
                bArr17[i2] = m4.c;
                int i173 = i2 << 1;
                int i174 = -i2;
                i2 = (i173 ^ i174) + ((i174 & i173) << 1) + 1;
                int i175 = a;
                int i176 = ((i175 | 19) << 1) - (i175 ^ 19);
                b = i176 % 128;
                int i177 = i176 % 2;
            }
            byte[] bArr18 = ((M) q2.u(3)).c;
            int i178 = a;
            int i179 = i178 & 25;
            int i180 = ((((i178 ^ 25) | i179) << 1) - (~(-((i178 | 25) & (~i179))))) - 1;
            b = i180 % 128;
            int i181 = i180 % 2;
            bArr11[i70] = bArr18;
            int i182 = i70 & 1;
            int i183 = (i70 ^ 1) | i182;
            int i184 = i182 ^ i183;
            int i185 = i182 & i183;
            i14 = 1;
            i70 = i184 + (i185 << 1);
            q5 = q10;
            i5 = 0;
        }
        int length = this.j.length;
        int i186 = length ^ (-1);
        int i187 = (length | i186) << i14;
        int i188 = -i186;
        int i189 = ((i187 | i188) << i14) - (i187 ^ i188);
        int i190 = a;
        int i191 = ((i190 ^ 70) + ((i190 & 70) << i14)) - 1;
        b = i191 % 128;
        if (i191 % 2 != 0) {
            this.c = new ivas.gov.bisp.enumeration.cB.t[i189];
        } else {
            this.c = new ivas.gov.bisp.enumeration.cB.t[i189];
        }
        int i192 = (i190 & 119) + (i190 | 119);
        b = i192 % 128;
        int i193 = i192 % 2;
        int i194 = 0;
        while (i194 < i189) {
            byte[] bArr19 = this.j;
            int i195 = i194 + 2;
            int i196 = (i195 << 1) + (i195 ^ (-1));
            ivas.gov.bisp.enumeration.cB.t tVar = new ivas.gov.bisp.enumeration.cB.t(bArr19[i194], bArr19[i196], r.v(bArr10[i194]), r.v(bArr[i194]), r.q(bArr2[i194]), r.p(bArr11[i194]));
            int i197 = a + 109;
            int i198 = i197 % 128;
            b = i198;
            int i199 = i197 % 2;
            this.c[i194] = tVar;
            int i200 = i198 & 69;
            int i201 = (i198 ^ 69) | i200;
            int i202 = (i200 & i201) + (i200 | i201);
            a = i202 % 128;
            int i203 = i202 % 2;
            i194 = i196;
        }
        int i204 = a;
        int i205 = i204 & 85;
        int i206 = ((i204 ^ 85) | i205) << 1;
        int i207 = -((i204 | 85) & (~i205));
        int i208 = (i206 & i207) + (i207 | i206);
        b = i208 % 128;
        int i209 = i208 % 2;
    }

    public t(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, ivas.gov.bisp.enumeration.cB.t[] tVarArr) {
        this.d = new C0258a(1L);
        this.f = r.r(sArr);
        this.h = r.o(sArr2);
        this.g = r.r(sArr3);
        this.i = r.o(sArr4);
        byte[] bArr = new byte[iArr.length];
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = a;
            int i4 = i3 & 23;
            int i5 = (i4 - (~((i3 ^ 23) | i4))) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                bArr[i2] = (byte) iArr[i2];
                int i6 = ((i2 & 15) + (i2 | 15)) - 1;
                int i7 = (i6 & (-7)) | ((~i6) & 6);
                int i8 = -(-((i6 & 6) << 1));
                i2 = (i7 & i8) + (i7 | i8);
            } else {
                bArr[i2] = (byte) iArr[i2];
                i2 = (-2) - (((i2 & 2) + (i2 | 2)) ^ (-1));
            }
        }
        this.j = bArr;
        this.c = tVarArr;
        int i9 = b;
        int i10 = i9 & 91;
        int i11 = ((((i9 ^ 91) | i10) << 1) - (~(-((i9 | 91) & (~i10))))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        byte[][][] bArrS;
        int i;
        int i2;
        C0278x c0278x;
        int i3 = 2 % 2;
        int i4 = 10;
        C0270p c0270p = new C0270p(10);
        int i5 = b;
        int i6 = i5 & 33;
        int i7 = -(-((i5 ^ 33) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        i iVar = this.d;
        if (iVar == null) {
            int i11 = ((i9 ^ 93) | (i9 & 93)) << 1;
            int i12 = -(((~i9) & 93) | (i9 & (-94)));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                c0278x = this.e;
                int i14 = 52 / 0;
            } else {
                c0278x = this.e;
            }
            iVar = c0278x;
        }
        c0270p.c(iVar);
        C0270p c0270p2 = new C0270p(10);
        int i15 = a;
        int i16 = i15 & 69;
        int i17 = -(-((i15 ^ 69) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        int i19 = i18 % 2 != 0 ? 1 : 0;
        while (true) {
            byte[][] bArr = this.f;
            if (i19 >= bArr.length) {
                break;
            }
            c0270p2.c(new B(bArr[i19]));
            int i20 = b;
            int i21 = (((i20 | 114) << 1) - (i20 ^ 114)) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((i19 | 2) << 1) - (i19 ^ 2);
            i19 = (i23 ^ (-1)) + (i23 << 1);
            int i24 = ((i20 & (-114)) | ((~i20) & 113)) + ((i20 & 113) << 1);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        c0270p.c(new ac(c0270p2));
        C0270p c0270p3 = new C0270p(10);
        c0270p3.c(new B(this.h));
        c0270p.c(new ac(c0270p3));
        C0270p c0270p4 = new C0270p(10);
        int i26 = b;
        int i27 = i26 & 109;
        int i28 = (i27 - (~(-(-((i26 ^ 109) | i27))))) - 1;
        a = i28 % 128;
        int i29 = i28 % 2 == 0 ? 1 : 0;
        while (true) {
            byte[][] bArr2 = this.g;
            if (i29 >= bArr2.length) {
                break;
            }
            B b2 = new B(bArr2[i29]);
            int i30 = a;
            int i31 = ((i30 & 10) + (i30 | 10)) - 1;
            b = i31 % 128;
            if (i31 % 2 != 0) {
                c0270p4.c(b2);
                int i32 = i29 & 102;
                i2 = i32 + ((i29 ^ 102) | i32);
            } else {
                c0270p4.c(b2);
                i2 = ((i29 & 1) - (~(-(-(i29 | 1))))) - 1;
            }
            i29 = i2;
        }
        c0270p.c(new ac(c0270p4));
        C0270p c0270p5 = new C0270p(10);
        c0270p5.c(new B(this.i));
        c0270p.c(new ac(c0270p5));
        C0270p c0270p6 = new C0270p(10);
        c0270p6.c(new B(this.j));
        c0270p.c(new ac(c0270p6));
        C0270p c0270p7 = new C0270p(10);
        int i33 = a;
        int i34 = ((i33 | 21) << 1) - (i33 ^ 21);
        b = i34 % 128;
        int i35 = i34 % 2;
        int i36 = 0;
        while (i36 < this.c.length) {
            C0270p c0270p8 = new C0270p(i4);
            byte[][][] bArrS2 = r.s(this.c[i36].f);
            C0270p c0270p9 = new C0270p(i4);
            int i37 = b;
            int i38 = (i37 & 83) + (i37 | 83);
            a = i38 % 128;
            int i39 = i38 % 2;
            int i40 = 0;
            while (i40 < bArrS2.length) {
                C0270p c0270p10 = new C0270p(i4);
                int i41 = b;
                int i42 = i41 & 15;
                int i43 = (((~i42) & (i41 | 15)) - (~(-(-(i42 << 1))))) - 1;
                a = i43 % 128;
                int i44 = i43 % 2;
                int i45 = 0;
                while (i45 < bArrS2[i40].length) {
                    c0270p10.c(new B(bArrS2[i40][i45]));
                    int i46 = b;
                    int i47 = i46 & 5;
                    int i48 = i46 | 5;
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    int i50 = i49 % 128;
                    a = i50;
                    int i51 = i49 % 2;
                    i45 = ((i45 & 1) << 1) + (i45 ^ 1);
                    int i52 = i50 & 109;
                    int i53 = ((((i50 ^ 109) | i52) << 1) - (~(-((~i52) & (i50 | 109))))) - 1;
                    b = i53 % 128;
                    int i54 = i53 % 2;
                }
                ac acVar = new ac(c0270p10);
                int i55 = b;
                int i56 = ((i55 ^ 62) + ((i55 & 62) << 1)) - 1;
                a = i56 % 128;
                if (i56 % 2 == 0) {
                    c0270p9.c(acVar);
                    int i57 = (i40 & (-130)) | ((~i40) & 129);
                    int i58 = (i40 & 129) << 1;
                    int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                    i = ((i59 ^ (-95)) - (~((i59 & (-95)) << 1))) - 1;
                } else {
                    c0270p9.c(acVar);
                    i = ((i40 | 1) << 1) - (i40 ^ 1);
                }
                i40 = i;
                int i60 = a;
                int i61 = i60 & 3;
                int i62 = (i60 | 3) & (~i61);
                int i63 = i61 << 1;
                int i64 = (i62 ^ i63) + ((i62 & i63) << 1);
                b = i64 % 128;
                int i65 = i64 % 2;
                i4 = 10;
            }
            c0270p8.c(new ac(c0270p9));
            int i66 = a;
            int i67 = i66 ^ 55;
            int i68 = ((i66 & 55) | i67) << 1;
            int i69 = -i67;
            int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
            b = i70 % 128;
            if (i70 % 2 != 0) {
                bArrS = r.s(this.c[i36].h);
                int i71 = 38 / 0;
            } else {
                bArrS = r.s(this.c[i36].h);
            }
            C0270p c0270p11 = new C0270p(10);
            int i72 = b + 112;
            int i73 = (i72 ^ (-1)) + (i72 << 1);
            a = i73 % 128;
            int i74 = i73 % 2;
            int i75 = 0;
            while (i75 < bArrS.length) {
                C0270p c0270p12 = new C0270p(10);
                int i76 = a;
                int i77 = (i76 & 43) + (i76 | 43);
                b = i77 % 128;
                int i78 = i77 % 2 != 0 ? 1 : 0;
                while (i78 < bArrS[i75].length) {
                    B b3 = new B(bArrS[i75][i78]);
                    int i79 = b;
                    int i80 = i79 & 81;
                    int i81 = (i79 ^ 81) | i80;
                    int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                    a = i82 % 128;
                    if (i82 % 2 == 0) {
                        c0270p12.c(b3);
                        int i83 = ((i78 | 38) << 1) - (i78 ^ 38);
                        i78 = (i83 ^ (-1)) + (i83 << 1);
                    } else {
                        c0270p12.c(b3);
                        int i84 = i78 & 1;
                        int i85 = (i78 ^ 1) | i84;
                        i78 = ((i84 | i85) << 1) - (i85 ^ i84);
                    }
                    int i86 = a;
                    int i87 = ((i86 ^ 17) | (i86 & 17)) << 1;
                    int i88 = -((17 & (~i86)) | (i86 & (-18)));
                    int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                    b = i89 % 128;
                    int i90 = i89 % 2;
                }
                c0270p11.c(new ac(c0270p12));
                int i91 = b;
                int i92 = i91 & 95;
                int i93 = -(-((i91 ^ 95) | i92));
                int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                int i95 = i94 % 128;
                a = i95;
                int i96 = i94 % 2;
                i75 = ((i75 & 1) << 1) + (i75 ^ 1);
                int i97 = i95 & 41;
                int i98 = (i95 | 41) & (~i97);
                int i99 = i97 << 1;
                int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
                b = i100 % 128;
                int i101 = i100 % 2;
            }
            c0270p8.c(new ac(c0270p11));
            int i102 = a;
            int i103 = ((i102 & 99) - (~(-(-(i102 | 99))))) - 1;
            b = i103 % 128;
            if (i103 % 2 != 0) {
                r.r(this.c[i36].g);
                throw null;
            }
            byte[][] bArrR = r.r(this.c[i36].g);
            C0270p c0270p13 = new C0270p(10);
            int i104 = a;
            int i105 = ((i104 | 109) << 1) - (((~i104) & 109) | (i104 & (-110)));
            b = i105 % 128;
            int i106 = i105 % 2;
            int i107 = 0;
            while (i107 < bArrR.length) {
                B b4 = new B(bArrR[i107]);
                int i108 = b + 93;
                a = i108 % 128;
                if (i108 % 2 == 0) {
                    c0270p13.c(b4);
                    int i109 = i107 & 6;
                    int i110 = ((i107 | 6) & (~i109)) + (i109 << 1);
                    int i111 = i110 & 106;
                    i107 = i111 + ((i110 ^ 106) | i111);
                } else {
                    c0270p13.c(b4);
                    int i112 = ((i107 | 115) << 1) - (i107 ^ 115);
                    i107 = (i112 & (-114)) + (i112 | (-114));
                }
            }
            c0270p8.c(new ac(c0270p13));
            int i113 = a;
            int i114 = ((i113 | 21) << 1) - (i113 ^ 21);
            b = i114 % 128;
            if (i114 % 2 != 0) {
                short[] sArr = this.c[i36].i;
                throw null;
            }
            c0270p8.c(new B(r.o(this.c[i36].i)));
            ac acVar2 = new ac(c0270p8);
            int i115 = a;
            int i116 = i115 & 83;
            int i117 = i116 + ((i115 ^ 83) | i116);
            b = i117 % 128;
            int i118 = i117 % 2;
            c0270p7.c(acVar2);
            i36 = ((i36 & 2) + (i36 | 2)) - 1;
            int i119 = a;
            int i120 = i119 & 115;
            int i121 = -(-((i119 ^ 115) | i120));
            int i122 = (i120 & i121) + (i121 | i120);
            b = i122 % 128;
            int i123 = i122 % 2;
            i4 = 10;
        }
        c0270p.c(new ac(c0270p7));
        ac acVar3 = new ac(c0270p);
        int i124 = a;
        int i125 = (i124 & 66) + (i124 | 66);
        int i126 = (i125 ^ (-1)) + (i125 << 1);
        b = i126 % 128;
        if (i126 % 2 != 0) {
            int i127 = 60 / 0;
        }
        return acVar3;
    }
}
