package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p003ac.P;
import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.N;
import ivas.gov.bisp.enumeration.p004ad.T;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class X extends Y {
    private static int a = 0;
    private static int b = 1;
    public s m;
    public C0015y n;

    public X(C0087m c0087m) {
        super(c0087m);
        s sVar = new s(this);
        this.m = sVar;
        this.n = null;
        this.k.i = 6;
        this.c.i = 7;
        sVar.i = 8;
        this.h = 1;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void i() {
        int i = 2 % 2;
        int i2 = b + 95;
        a = i2 % 128;
        int i3 = i2 % 2;
        s sVar = this.k;
        if (!(!sVar.l)) {
            int i4 = b + 41;
            a = i4 % 128;
            int i5 = i4 % 2;
            this.e.U = sVar.j;
            int i6 = b;
            int i7 = i6 & 95;
            int i8 = (i6 ^ 95) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = ((i11 | 64) << 1) - (i11 ^ 64);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public boolean m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 103;
        int i4 = ((i2 & 103) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.g;
        if (i7 != 0 ? i8 != 3 : i8 != 2) {
            int i9 = b;
            int i10 = i9 & 39;
            int i11 = -(-((i9 ^ 39) | i10));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (this.e.m != 0) {
            int i13 = a + 81;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i14 = a;
        int i15 = ((i14 | 31) << 1) - (i14 ^ 31);
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        int i18 = i16 ^ 29;
        int i19 = ((i16 & 29) | i18) << 1;
        int i20 = -i18;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 50 / 0;
        }
        return true;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = -(-((i2 ^ 89) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            j.w("VerticalRun ");
            String str = this.e.Z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = j.w("VerticalRun ");
        String str2 = this.e.Z;
        int i6 = a;
        int i7 = ((i6 & 110) + (i6 | 110)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        sbW.append(str2);
        String string = sbW.toString();
        int i9 = a;
        int i10 = ((i9 | 74) << 1) - (i9 ^ 74);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    @Override // ivas.gov.bisp.enumeration.B.Y, ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        s sVar;
        List<s> list;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        int i3;
        int i4 = 2 % 2;
        if (P.c(this.l) == 3) {
            C0087m c0087m = this.e;
            n(c0087m.A, c0087m.E, 1);
            int i5 = b;
            int i6 = i5 & 111;
            int i7 = (i5 | 111) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        C0015y c0015y = this.i;
        int i11 = 0;
        Object obj = null;
        if (c0015y.f) {
            int i12 = b;
            int i13 = ((i12 | 31) << 1) - (i12 ^ 31);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                boolean z = c0015y.l;
                obj.hashCode();
                throw null;
            }
            if (!c0015y.l && this.g == 3) {
                int i14 = b;
                int i15 = i14 | 111;
                int i16 = i15 << 1;
                int i17 = -((~(i14 & 111)) & i15);
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                C0087m c0087m2 = this.e;
                int i20 = c0087m2.m;
                int i21 = a;
                int i22 = i21 & 35;
                int i23 = (~i22) & (i21 | 35);
                int i24 = i22 << 1;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                b = i25 % 128;
                int i26 = i25 % 2;
                if (i20 != 2) {
                    int i27 = i21 & 91;
                    int i28 = (i21 ^ 91) | i27;
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    b = i29 % 128;
                    if (i29 % 2 != 0 ? i20 == 3 : i20 == 2) {
                        C0015y c0015y2 = c0087m2.g.i;
                        if (!(!c0015y2.l)) {
                            int i30 = b;
                            int i31 = i30 & 43;
                            int i32 = -(-((i30 ^ 43) | i31));
                            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                            a = i33 % 128;
                            if (i33 % 2 != 0) {
                                int i34 = c0087m2.R;
                                throw null;
                            }
                            int i35 = c0087m2.R;
                            if (i35 != -1) {
                                int i36 = a;
                                int i37 = i36 & 109;
                                int i38 = (i37 - (~((i36 ^ 109) | i37))) - 1;
                                b = i38 % 128;
                                if (i38 % 2 == 0) {
                                    int i39 = 73 / 0;
                                    if (i35 == 0) {
                                        f4 = c0015y2.j * c0087m2.Q;
                                        int i40 = b;
                                        int i41 = (i40 | 17) << 1;
                                        int i42 = -(i40 ^ 17);
                                        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                                        a = i43 % 128;
                                        int i44 = i43 % 2;
                                        i3 = (int) (f4 + 0.5f);
                                        int i45 = b;
                                        int i46 = (((i45 | 112) << 1) - (i45 ^ 112)) - 1;
                                        a = i46 % 128;
                                        int i47 = i46 % 2;
                                    } else if (i35 != 1) {
                                        int i48 = (i36 & 21) + (i36 | 21);
                                        int i49 = i48 % 128;
                                        b = i49;
                                        int i50 = i48 % 2;
                                        int i51 = i49 + 103;
                                        a = i51 % 128;
                                        int i52 = i51 % 2;
                                        i3 = 0;
                                    } else {
                                        f2 = c0015y2.j;
                                        f3 = c0087m2.Q;
                                    }
                                    c0015y.e(i3);
                                } else {
                                    if (i35 == 0) {
                                        f4 = c0015y2.j * c0087m2.Q;
                                        int i410 = b;
                                        int i411 = (i410 | 17) << 1;
                                        int i412 = -(i410 ^ 17);
                                        int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                                        a = i413 % 128;
                                        int i414 = i413 % 2;
                                        i3 = (int) (f4 + 0.5f);
                                        int i415 = b;
                                        int i416 = (((i415 | 112) << 1) - (i415 ^ 112)) - 1;
                                        a = i416 % 128;
                                        int i417 = i416 % 2;
                                    } else if (i35 != 1) {
                                        int i418 = (i36 & 21) + (i36 | 21);
                                        int i419 = i418 % 128;
                                        b = i419;
                                        int i53 = i418 % 2;
                                        int i54 = i419 + 103;
                                        a = i54 % 128;
                                        int i55 = i54 % 2;
                                        i3 = 0;
                                    } else {
                                        f2 = c0015y2.j;
                                        f3 = c0087m2.Q;
                                    }
                                    c0015y.e(i3);
                                }
                            } else {
                                f2 = c0015y2.j;
                                f3 = c0087m2.Q;
                                int i56 = b;
                                int i57 = i56 & 37;
                                int i58 = (((i56 | 37) & (~i57)) - (~(i57 << 1))) - 1;
                                a = i58 % 128;
                                int i59 = i58 % 2;
                            }
                            f4 = f2 / f3;
                            int i60 = a + 57;
                            b = i60 % 128;
                            int i61 = i60 % 2;
                            i3 = (int) (f4 + 0.5f);
                            int i4110 = b;
                            int i4111 = (((i4110 | 112) << 1) - (i4110 ^ 112)) - 1;
                            a = i4111 % 128;
                            int i4112 = i4111 % 2;
                            c0015y.e(i3);
                        }
                    }
                } else {
                    C0087m c0087m3 = c0087m2.N;
                    if (c0087m3 != null) {
                        int i62 = b;
                        int i63 = i62 & 101;
                        int i64 = -(-((i62 ^ 101) | i63));
                        int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                        a = i65 % 128;
                        if (i65 % 2 != 0) {
                            C0015y c0015y3 = c0087m3.i.i;
                            obj.hashCode();
                            throw null;
                        }
                        C0015y c0015y4 = c0087m3.i.i;
                        int i66 = b;
                        int i67 = ((i66 ^ 3) - (~((i66 & 3) << 1))) - 1;
                        a = i67 % 128;
                        int i68 = i67 % 2;
                        if (c0015y4.l) {
                            float f5 = c0087m2.s;
                            int i69 = c0015y4.j;
                            int i70 = a;
                            int i71 = i70 & 41;
                            int i72 = ((i70 ^ 41) | i71) << 1;
                            int i73 = -((~i71) & (i70 | 41));
                            int i74 = (i72 & i73) + (i72 | i73);
                            b = i74 % 128;
                            int i75 = i74 % 2;
                            int i76 = (int) ((i69 * f5) + 0.5f);
                            int i77 = i70 & 77;
                            int i78 = -(-((i70 ^ 77) | i77));
                            int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
                            b = i79 % 128;
                            if (i79 % 2 == 0) {
                                c0015y.e(i76);
                                obj.hashCode();
                                throw null;
                            }
                            c0015y.e(i76);
                        }
                    }
                }
            }
        }
        s sVar2 = this.k;
        if (sVar2.f) {
            int i80 = a;
            int i81 = ((((i80 ^ 115) | (i80 & 115)) << 1) - (~(-(((~i80) & 115) | (i80 & (-116)))))) - 1;
            b = i81 % 128;
            int i82 = i81 % 2;
            s sVar3 = this.c;
            if (sVar3.f) {
                if (sVar2.l) {
                    int i83 = a;
                    int i84 = ((i83 | 113) << 1) - (i83 ^ 113);
                    b = i84 % 128;
                    if (i84 % 2 == 0) {
                        boolean z2 = sVar3.l;
                        obj.hashCode();
                        throw null;
                    }
                    if (sVar3.l) {
                        int i85 = b + 45;
                        a = i85 % 128;
                        int i86 = i85 % 2;
                        if (this.i.l) {
                            return;
                        }
                    }
                }
                if (!this.i.l) {
                    int i87 = a;
                    int i88 = i87 ^ 115;
                    int i89 = (i87 & 115) << 1;
                    int i90 = (i88 & i89) + (i89 | i88);
                    b = i90 % 128;
                    if (i90 % 2 != 0 ? this.g == 3 : this.g == 4) {
                        int i91 = a;
                        int i92 = (i91 & 47) + (i91 | 47);
                        b = i92 % 128;
                        int i93 = i92 % 2;
                        C0087m c0087m4 = this.e;
                        if (c0087m4.l == 0 && (!c0087m4.w())) {
                            s sVar4 = this.k.n.get(0);
                            int i94 = b + 37;
                            a = i94 % 128;
                            int i95 = i94 % 2;
                            s sVar5 = this.c.n.get(0);
                            int i96 = b;
                            int i97 = ((i96 ^ 67) | (i96 & 67)) << 1;
                            int i98 = -(((~i96) & 67) | (i96 & (-68)));
                            int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                            a = i99 % 128;
                            if (i99 % 2 != 0) {
                                int i100 = sVar4.j;
                                s sVar6 = this.k;
                                throw null;
                            }
                            int i101 = sVar4.j;
                            s sVar7 = this.k;
                            int i102 = i101 + sVar7.h;
                            int i103 = sVar5.j;
                            int i104 = this.c.h;
                            int i105 = ((i103 | i104) << 1) - (i103 ^ i104);
                            sVar7.e(i102);
                            this.c.e(i105);
                            int i106 = -i102;
                            int i107 = i105 & i106;
                            this.i.e(((i106 | i105) & (~i107)) + (i107 << 1));
                            int i108 = b;
                            int i109 = i108 & 1;
                            int i110 = ((i108 | 1) & (~i109)) + (i109 << 1);
                            a = i110 % 128;
                            if (i110 % 2 == 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
                if (!this.i.l) {
                    int i111 = a;
                    int i112 = (i111 & (-38)) | ((~i111) & 37);
                    int i113 = -(-((i111 & 37) << 1));
                    int i114 = (i112 & i113) + (i113 | i112);
                    b = i114 % 128;
                    int i115 = i114 % 2;
                    if (this.g == 3) {
                        int i116 = a;
                        int i117 = i116 & 43;
                        int i118 = (i117 - (~(-(-((i116 ^ 43) | i117))))) - 1;
                        b = i118 % 128;
                        int i119 = i118 % 2;
                        if (this.d == 1) {
                            int i120 = b;
                            int i121 = (i120 & 15) + (i120 | 15);
                            a = i121 % 128;
                            if (i121 % 2 != 0) {
                                this.k.n.size();
                                obj.hashCode();
                                throw null;
                            }
                            if (this.k.n.size() > 0 && this.c.n.size() > 0) {
                                s sVar8 = this.k.n.get(0);
                                int i122 = b;
                                int i123 = i122 & 59;
                                int i124 = (i122 | 59) & (~i123);
                                int i125 = i123 << 1;
                                int i126 = (i124 & i125) + (i124 | i125);
                                a = i126 % 128;
                                s sVar9 = i126 % 2 != 0 ? sVar8 : sVar8;
                                s sVar10 = this.c.n.get(0);
                                int i127 = sVar9.j;
                                int i128 = a + 61;
                                b = i128 % 128;
                                if (i128 % 2 == 0) {
                                    i = this.k.h;
                                    int i129 = 83 / 0;
                                } else {
                                    i = this.k.h;
                                }
                                int i130 = a;
                                int i131 = i130 & 31;
                                int i132 = i131 + ((i130 ^ 31) | i131);
                                b = i132 % 128;
                                if (i132 % 2 == 0) {
                                    i2 = sVar10.j / this.c.h;
                                } else {
                                    int i133 = sVar10.j;
                                    int i134 = this.c.h;
                                    i2 = ((i133 | i134) << 1) - (((~i133) & i134) | ((~i134) & i133));
                                }
                                int i135 = b;
                                int i136 = i135 & 89;
                                int i137 = (i136 - (~(-(-((i135 ^ 89) | i136))))) - 1;
                                a = i137 % 128;
                                int i138 = i137 % 2;
                                int i139 = -((i127 ^ i) + ((i127 & i) << 1));
                                int i140 = ((~i139) & i2) | ((~i2) & i139);
                                int i141 = -(-((i139 & i2) << 1));
                                int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                                C0015y c0015y5 = this.i;
                                int i143 = c0015y5.f41o;
                                if (i142 < i143) {
                                    c0015y5.e(i142);
                                    int i144 = a;
                                    int i145 = (i144 & (-84)) | ((~i144) & 83);
                                    int i146 = -(-((i144 & 83) << 1));
                                    int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                                    b = i147 % 128;
                                    int i148 = i147 % 2;
                                } else {
                                    c0015y5.e(i143);
                                    int i149 = b + 101;
                                    a = i149 % 128;
                                    int i150 = i149 % 2;
                                }
                            }
                        }
                    }
                }
                if (!this.i.l) {
                    int i151 = a;
                    int i152 = (i151 & (-2)) | ((~i151) & 1);
                    int i153 = -(-((i151 & 1) << 1));
                    int i154 = ((i152 | i153) << 1) - (i153 ^ i152);
                    b = i154 % 128;
                    int i155 = i154 % 2;
                    return;
                }
                if (this.k.n.size() > 0) {
                    int i156 = b;
                    int i157 = i156 & 25;
                    int i158 = (i156 | 25) & (~i157);
                    int i159 = -(-(i157 << 1));
                    int i160 = ((i158 | i159) << 1) - (i158 ^ i159);
                    a = i160 % 128;
                    if (i160 % 2 != 0) {
                        this.c.n.size();
                        obj.hashCode();
                        throw null;
                    }
                    if (this.c.n.size() > 0) {
                        int i161 = a;
                        int i162 = (i161 ^ 59) + ((i161 & 59) << 1);
                        b = i162 % 128;
                        int i163 = i162 % 2;
                        s sVar11 = this.k.n.get(0);
                        int i164 = b + 23;
                        a = i164 % 128;
                        if (i164 % 2 != 0) {
                            sVar = sVar11;
                            list = this.c.n;
                            i11 = 1;
                        } else {
                            sVar = sVar11;
                            list = this.c.n;
                        }
                        int i165 = b;
                        int i166 = (((i165 ^ 119) | (i165 & 119)) << 1) - (((~i165) & 119) | (i165 & (-120)));
                        a = i166 % 128;
                        int i167 = i166 % 2;
                        s sVar12 = list.get(i11);
                        int i168 = sVar.j;
                        int i169 = b;
                        int i170 = (i169 ^ 69) + ((i169 & 69) << 1);
                        a = i170 % 128;
                        int i171 = i170 % 2;
                        s sVar13 = this.k;
                        int i172 = sVar13.h;
                        int i173 = a;
                        int i174 = ((((~i173) & 61) | (i173 & (-62))) - (~((i173 & 61) << 1))) - 1;
                        b = i174 % 128;
                        int i175 = i174 % 2;
                        int i176 = sVar12.j;
                        s sVar14 = this.c;
                        int i177 = a;
                        int i178 = ((((i177 ^ 55) | (i177 & 55)) << 1) - (~(-((i177 & (-56)) | (55 & (~i177)))))) - 1;
                        b = i178 % 128;
                        if (i178 % 2 == 0) {
                            int i179 = sVar14.h;
                            float f6 = this.e.af;
                            obj.hashCode();
                            throw null;
                        }
                        int i180 = sVar14.h;
                        float f7 = this.e.af;
                        int i181 = b;
                        int i182 = (((i181 | 67) << 1) - (~(-(i181 ^ 67)))) - 1;
                        int i183 = i182 % 128;
                        a = i183;
                        int i184 = i182 % 2;
                        if (sVar == sVar12) {
                            int i185 = i183 & 79;
                            int i186 = (i185 - (~(-(-((i183 ^ 79) | i185))))) - 1;
                            int i187 = i186 % 128;
                            b = i187;
                            if (i186 % 2 == 0) {
                                throw null;
                            }
                            int i188 = i187 & 19;
                            int i189 = i187 | 19;
                            int i190 = (i188 ^ i189) + ((i188 & i189) << 1);
                            a = i190 % 128;
                            if (i190 % 2 != 0) {
                                int i191 = 4 / 5;
                            }
                            f7 = 0.5f;
                        } else {
                            i168 = (i172 - (~(-(-i168)))) - 1;
                            int i192 = i180 & i176;
                            int i193 = -(-((i180 ^ i176) | i192));
                            i176 = ((i192 | i193) << 1) - (i192 ^ i193);
                            int i194 = ((i183 & (-70)) | ((~i183) & 69)) + ((i183 & 69) << 1);
                            b = i194 % 128;
                            int i195 = i194 % 2;
                        }
                        int i196 = this.i.j;
                        float f8 = i168;
                        int i197 = b;
                        int i198 = (i197 ^ 77) + ((i197 & 77) << 1);
                        a = i198 % 128;
                        if (i198 % 2 != 0) {
                            f = (((i176 >> i168) % i196) + f7) - (f8 - 0.5f);
                        } else {
                            int i199 = (i176 - (~(-i168))) - 1;
                            int i200 = -i196;
                            int i201 = i199 & i200;
                            f = (((i201 - (~((i200 ^ i199) | i201))) - 1) * f7) + f8 + 0.5f;
                        }
                        sVar13.e((int) f);
                        s sVar15 = this.c;
                        int i202 = b;
                        int i203 = i202 ^ 119;
                        int i204 = (i202 & 119) << 1;
                        int i205 = (i203 & i204) + (i204 | i203);
                        a = i205 % 128;
                        int i206 = i205 % 2;
                        int i207 = this.k.j;
                        int i208 = -(-this.i.j);
                        int i209 = i207 & i208;
                        int i210 = (i207 ^ i208) | i209;
                        sVar15.e(((i209 | i210) << 1) - (i210 ^ i209));
                        int i211 = a;
                        int i212 = ((i211 ^ 89) | (i211 & 89)) << 1;
                        int i213 = -(((~i211) & 89) | (i211 & (-90)));
                        int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                        b = i214 % 128;
                        int i215 = i214 % 2;
                    }
                }
            }
        }
        int i216 = b;
        int i217 = ((i216 & (-84)) | ((~i216) & 83)) + ((i216 & 83) << 1);
        a = i217 % 128;
        int i218 = i217 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.B.Y
    public void h() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 95) << 1) - (i2 ^ 95);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.f = null;
        this.k.d();
        s sVar = this.c;
        int i5 = b + 115;
        a = i5 % 128;
        int i6 = i5 % 2;
        sVar.d();
        this.m.d();
        C0015y c0015y = this.i;
        int i7 = (-2) - ((b + 32) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        c0015y.d();
        this.j = false;
        int i9 = a;
        int i10 = i9 | 117;
        int i11 = i10 << 1;
        int i12 = -((~(i9 & 117)) & i10);
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = i3 + ((i2 ^ 41) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        this.j = false;
        this.k.d();
        s sVar = this.k;
        int i6 = b;
        int i7 = (((i6 | 90) << 1) - (i6 ^ 90)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        sVar.l = false;
        this.c.d();
        s sVar2 = this.c;
        int i9 = a;
        int i10 = (-2) - (((i9 ^ 20) + ((i9 & 20) << 1)) ^ (-1));
        b = i10 % 128;
        if (i10 % 2 == 0) {
            sVar2.l = true;
        } else {
            sVar2.l = false;
        }
        this.m.d();
        this.m.l = false;
        this.i.l = false;
        int i11 = b;
        int i12 = ((i11 ^ 65) | (i11 & 65)) << 1;
        int i13 = -(((~i11) & 65) | (i11 & (-66)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:243:0x085d A[PHI: r1
  0x085d: PHI (r1v35 ivas.gov.bisp.enumeration.ad.m) = (r1v34 ivas.gov.bisp.enumeration.ad.m), (r1v43 ivas.gov.bisp.enumeration.ad.m) binds: [B:242:0x085b, B:239:0x0852] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0868  */
    /* JADX WARN: Code duplicated, block: B:246:0x0870  */
    /* JADX WARN: Code duplicated, block: B:248:0x0876  */
    /* JADX WARN: Code duplicated, block: B:250:0x088f  */
    /* JADX WARN: Code duplicated, block: B:251:0x08aa  */
    @Override // ivas.gov.bisp.enumeration.B.Y
    public void g() {
        C0087m c0087m;
        C0087m c0087m2;
        int i;
        D d;
        int i2;
        int i3;
        s sVarK;
        C0087m c0087m3;
        s sVar;
        N[] nArr;
        s sVar2;
        N n;
        C0087m c0087m4;
        int i4 = 2 % 2;
        C0087m c0087m5 = this.e;
        if (c0087m5.d) {
            int i5 = b;
            int i6 = i5 ^ 73;
            int i7 = ((i5 & 73) | i6) << 1;
            int i8 = -i6;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.i.e(c0087m5.c());
        }
        Object obj = null;
        if (!this.i.l) {
            int i11 = (-2) - ((b + 52) ^ (-1));
            a = i11 % 128;
            int i12 = i11 % 2;
            this.g = this.e.n();
            if (this.e.z) {
                this.n = new C0014v(this);
                int i13 = b;
                int i14 = ((i13 | 73) << 1) - (i13 ^ 73);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = this.g;
            if (i16 != 3) {
                if (i16 == 4 && (c0087m4 = this.e.N) != null && c0087m4.n() == 1) {
                    int i17 = a;
                    int i18 = (i17 & (-64)) | ((~i17) & 63);
                    int i19 = (i17 & 63) << 1;
                    int i20 = (i18 & i19) + (i19 | i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    int iC = c0087m4.c();
                    int iD = this.e.A.d();
                    int i22 = a + 59;
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    int iD2 = this.e.E.d();
                    s sVar3 = this.k;
                    s sVar4 = c0087m4.i.k;
                    C0087m c0087m6 = this.e;
                    int i24 = (-2) - ((-1) ^ (b + 126));
                    a = i24 % 128;
                    if (i24 % 2 != 0) {
                        e(sVar3, sVar4, c0087m6.A.d());
                        s sVar5 = this.c;
                        obj.hashCode();
                        throw null;
                    }
                    e(sVar3, sVar4, c0087m6.A.d());
                    s sVar6 = this.c;
                    s sVar7 = c0087m4.i.c;
                    N n2 = this.e.E;
                    int i25 = a + 42;
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    e(sVar6, sVar7, -n2.d());
                    C0015y c0015y = this.i;
                    int i28 = (iC - (~(-(~(-iD))))) - 2;
                    int i29 = -iD2;
                    c0015y.e((i28 ^ i29) + ((i29 & i28) << 1));
                    return;
                }
                if (this.g == 1) {
                    int i30 = a;
                    int i31 = (i30 & (-92)) | ((~i30) & 91);
                    int i32 = (i30 & 91) << 1;
                    int i33 = (i31 & i32) + (i32 | i31);
                    b = i33 % 128;
                    if (i33 % 2 == 0) {
                        this.i.e(this.e.c());
                        obj.hashCode();
                        throw null;
                    }
                    this.i.e(this.e.c());
                }
            }
        } else if (this.g == 4 && (c0087m = this.e.N) != null) {
            int i34 = b;
            int i35 = ((i34 ^ 29) | (i34 & 29)) << 1;
            int i36 = -(((~i34) & 29) | (i34 & (-30)));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            a = i37 % 128;
            if (i37 % 2 == 0 ? c0087m.n() == 1 : c0087m.n() == 1) {
                s sVar8 = this.k;
                s sVar9 = c0087m.i.k;
                C0087m c0087m7 = this.e;
                int i38 = b;
                int i39 = i38 & 103;
                int i40 = (((i38 ^ 103) | i39) << 1) - ((i38 | 103) & (~i39));
                a = i40 % 128;
                int i41 = i40 % 2;
                e(sVar8, sVar9, c0087m7.A.d());
                s sVar10 = this.c;
                int i42 = a;
                int i43 = (((i42 | 83) << 1) - (~(-(((~i42) & 83) | (i42 & (-84)))))) - 1;
                b = i43 % 128;
                int i44 = i43 % 2;
                e(sVar10, c0087m.i.c, -this.e.E.d());
                int i45 = a;
                int i46 = i45 & 29;
                int i47 = (i46 - (~((i45 ^ 29) | i46))) - 1;
                b = i47 % 128;
                int i48 = i47 % 2;
                return;
            }
        }
        C0015y c0015y2 = this.i;
        boolean z = c0015y2.l;
        if (!(!z)) {
            C0087m c0087m8 = this.e;
            if (c0087m8.d) {
                N[] nArr2 = c0087m8.K;
                if (nArr2[2].f != null) {
                    int i49 = (-2) - ((-1) ^ (b + 72));
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    if (nArr2[3].f != null) {
                        if (c0087m8.w()) {
                            int i51 = b;
                            int i52 = ((i51 | 125) << 1) - (i51 ^ 125);
                            a = i52 % 128;
                            if (i52 % 2 != 0) {
                                sVar2 = this.k;
                                n = this.e.K[5];
                            } else {
                                sVar2 = this.k;
                                n = this.e.K[2];
                            }
                            int iD3 = n.d();
                            int i53 = b;
                            int i54 = ((i53 | 43) << 1) - (((~i53) & 43) | (i53 & (-44)));
                            a = i54 % 128;
                            int i55 = i54 % 2;
                            sVar2.h = iD3;
                            s sVar11 = this.c;
                            N[] nArr3 = this.e.K;
                            int i56 = b;
                            int i57 = (i56 | 21) << 1;
                            int i58 = -(((~i56) & 21) | (i56 & (-22)));
                            int i59 = (i57 & i58) + (i58 | i57);
                            a = i59 % 128;
                            int i60 = i59 % 2;
                            sVar11.h = -nArr3[3].d();
                            int i61 = b;
                            int i62 = (i61 ^ 85) + ((i61 & 85) << 1);
                            a = i62 % 128;
                            int i63 = i62 % 2;
                        } else {
                            s sVarK2 = k(this.e.K[2]);
                            if (sVarK2 != null) {
                                int i64 = b;
                                int i65 = i64 ^ 81;
                                int i66 = -(-((i64 & 81) << 1));
                                int i67 = (i65 & i66) + (i66 | i65);
                                a = i67 % 128;
                                if (i67 % 2 != 0) {
                                    sVar = this.k;
                                    nArr = this.e.K;
                                    int i68 = 18 / 0;
                                } else {
                                    sVar = this.k;
                                    nArr = this.e.K;
                                }
                                int iD4 = nArr[2].d();
                                List<s> list = sVar.n;
                                int i69 = a;
                                int i70 = (i69 & 125) + (i69 | 125);
                                b = i70 % 128;
                                if (i70 % 2 == 0) {
                                    list.add(sVarK2);
                                    sVar.h = iD4;
                                    int i71 = 10 / 0;
                                } else {
                                    list.add(sVarK2);
                                    sVar.h = iD4;
                                }
                                int i72 = b;
                                int i73 = i72 & 27;
                                int i74 = (i72 ^ 27) | i73;
                                int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                                a = i75 % 128;
                                if (i75 % 2 != 0) {
                                    sVarK2.m.add(sVar);
                                    obj.hashCode();
                                    throw null;
                                }
                                sVarK2.m.add(sVar);
                                int i76 = a + 19;
                                b = i76 % 128;
                                int i77 = i76 % 2;
                            }
                            s sVarK3 = k(this.e.K[3]);
                            if (sVarK3 != null) {
                                s sVar12 = this.c;
                                int i78 = -this.e.K[3].d();
                                sVar12.n.add(sVarK3);
                                sVar12.h = i78;
                                sVarK3.m.add(sVar12);
                            }
                            this.k.e = true;
                            this.c.e = true;
                        }
                        C0087m c0087m9 = this.e;
                        if (c0087m9.z) {
                            e(this.m, this.k, c0087m9.T);
                            return;
                        }
                        return;
                    }
                }
                if (nArr2[2].f != null) {
                    s sVarK4 = k(nArr2[2]);
                    if (sVarK4 != null) {
                        s sVar13 = this.k;
                        int iD5 = this.e.K[2].d();
                        sVar13.n.add(sVarK4);
                        int i79 = a;
                        int i80 = i79 & 17;
                        int i81 = (i79 | 17) & (~i80);
                        int i82 = -(-(i80 << 1));
                        int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                        b = i83 % 128;
                        int i84 = i83 % 2;
                        sVar13.h = iD5;
                        sVarK4.m.add(sVar13);
                        s sVar14 = this.c;
                        s sVar15 = this.k;
                        C0015y c0015y3 = this.i;
                        int i85 = b;
                        int i86 = (((i85 & (-56)) | ((~i85) & 55)) - (~(-(-((i85 & 55) << 1))))) - 1;
                        a = i86 % 128;
                        if (i86 % 2 != 0) {
                            e(sVar14, sVar15, c0015y3.j);
                            boolean z2 = this.e.z;
                            throw null;
                        }
                        e(sVar14, sVar15, c0015y3.j);
                        C0087m c0087m10 = this.e;
                        if (c0087m10.z) {
                            e(this.m, this.k, c0087m10.T);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (nArr2[3].f != null) {
                    s sVarK5 = k(nArr2[3]);
                    if (sVarK5 != null) {
                        s sVar16 = this.c;
                        int i87 = -this.e.K[3].d();
                        List<s> list2 = sVar16.n;
                        int i88 = a;
                        int i89 = (i88 & (-80)) | ((~i88) & 79);
                        int i90 = -(-((i88 & 79) << 1));
                        int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                        b = i91 % 128;
                        if (i91 % 2 == 0) {
                            list2.add(sVarK5);
                            sVar16.h = i87;
                            int i92 = 11 / 0;
                        } else {
                            list2.add(sVarK5);
                            sVar16.h = i87;
                        }
                        sVarK5.m.add(sVar16);
                        e(this.k, this.c, -this.i.j);
                    }
                    C0087m c0087m11 = this.e;
                    if (!(!c0087m11.z)) {
                        e(this.m, this.k, c0087m11.T);
                        return;
                    }
                    return;
                }
                if (nArr2[4].f == null) {
                    if ((c0087m8 instanceof T) || c0087m8.N == null) {
                        return;
                    }
                    int i93 = b;
                    int i94 = ((i93 ^ 80) + ((i93 & 80) << 1)) - 1;
                    a = i94 % 128;
                    int i95 = i94 % 2;
                    if (c0087m8.g(N.aTW.i).f == null) {
                        C0087m c0087m12 = this.e;
                        e(this.k, c0087m12.N.i.k, c0087m12.s());
                        e(this.c, this.k, this.i.j);
                        int i96 = b;
                        int i97 = ((i96 & (-106)) | ((~i96) & 105)) + ((i96 & 105) << 1);
                        a = i97 % 128;
                        if (i97 % 2 != 0) {
                            c0087m3 = this.e;
                            int i98 = 73 / 0;
                            if (!c0087m3.z) {
                                return;
                            }
                        } else {
                            c0087m3 = this.e;
                            if (!c0087m3.z) {
                                return;
                            }
                        }
                        e(this.m, this.k, c0087m3.T);
                        return;
                    }
                    return;
                }
                s sVarK6 = k(nArr2[4]);
                if (sVarK6 != null) {
                    s sVar17 = this.m;
                    sVar17.n.add(sVarK6);
                    sVar17.h = 0;
                    sVarK6.m.add(sVar17);
                    s sVar18 = this.k;
                    s sVar19 = this.m;
                    int i99 = this.e.T;
                    int i100 = b;
                    int i101 = ((i100 | 113) << 1) - (i100 ^ 113);
                    a = i101 % 128;
                    if (i101 % 2 != 0) {
                        e(sVar18, sVar19, -i99);
                        int i102 = 64 / 0;
                    } else {
                        e(sVar18, sVar19, -i99);
                    }
                    s sVar20 = this.c;
                    s sVar21 = this.k;
                    int i103 = this.i.j;
                    int i104 = b;
                    int i105 = i104 & 79;
                    int i106 = (i105 - (~(-(-((i104 ^ 79) | i105))))) - 1;
                    a = i106 % 128;
                    if (i106 % 2 == 0) {
                        e(sVar20, sVar21, i103);
                        return;
                    } else {
                        e(sVar20, sVar21, i103);
                        throw null;
                    }
                }
                return;
            }
        }
        if (z || this.g != 3) {
            c0015y2.m.add(this);
            if (c0015y2.l) {
                int i107 = a;
                int i108 = (i107 ^ 37) + ((i107 & 37) << 1);
                b = i108 % 128;
                int i109 = i108 % 2;
                b(this);
            }
        } else {
            C0087m c0087m13 = this.e;
            int i110 = c0087m13.m;
            if (i110 == 2) {
                C0087m c0087m14 = c0087m13.N;
                if (c0087m14 != null) {
                    C0015y c0015y4 = c0087m14.i.i;
                    c0015y2.n.add(c0015y4);
                    c0015y4.m.add(this.i);
                    int i111 = a;
                    int i112 = (i111 & (-110)) | ((~i111) & 109);
                    int i113 = -(-((i111 & 109) << 1));
                    int i114 = (i112 & i113) + (i113 | i112);
                    b = i114 % 128;
                    int i115 = i114 % 2;
                    C0015y c0015y5 = this.i;
                    c0015y5.e = true;
                    c0015y5.m.add(this.k);
                    this.i.m.add(this.c);
                }
            } else if (i110 == 3 && !c0087m13.w()) {
                C0087m c0087m15 = this.e;
                if (c0087m15.l != 3) {
                    C0015y c0015y6 = c0087m15.g.i;
                    this.i.n.add(c0015y6);
                    c0015y6.m.add(this.i);
                    C0015y c0015y7 = this.i;
                    c0015y7.e = true;
                    int i116 = a;
                    int i117 = i116 & 61;
                    int i118 = (i116 | 61) & (~i117);
                    int i119 = i117 << 1;
                    int i120 = (i118 & i119) + (i118 | i119);
                    b = i120 % 128;
                    int i121 = i120 % 2;
                    c0015y7.m.add(this.k);
                    this.i.m.add(this.c);
                }
            }
        }
        C0087m c0087m16 = this.e;
        N[] nArr4 = c0087m16.K;
        if (nArr4[2].f != null && nArr4[3].f != null) {
            int i122 = a;
            int i123 = ((i122 | 81) << 1) - (i122 ^ 81);
            b = i123 % 128;
            int i124 = i123 % 2;
            if (!c0087m16.w()) {
                s sVarK7 = k(this.e.K[2]);
                int i125 = a + 125;
                b = i125 % 128;
                int i126 = i125 % 2;
                s sVarK8 = k(this.e.K[3]);
                sVarK7.m.add(this);
                if (sVarK7.l) {
                    b(this);
                }
                sVarK8.m.add(this);
                if (sVarK8.l) {
                    int i127 = b;
                    int i128 = i127 & 23;
                    int i129 = (i127 ^ 23) | i128;
                    int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                    a = i130 % 128;
                    int i131 = i130 % 2;
                    b(this);
                    int i132 = b;
                    int i133 = i132 & 125;
                    int i134 = (i132 ^ 125) | i133;
                    int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                    a = i135 % 128;
                    int i136 = i135 % 2;
                }
                this.l = 4;
                int i137 = b;
                int i138 = i137 & 93;
                int i139 = (i137 | 93) & (~i138);
                int i140 = i138 << 1;
                int i141 = (i139 ^ i140) + ((i139 & i140) << 1);
                a = i141 % 128;
                int i142 = i141 % 2;
            } else {
                this.k.h = this.e.K[2].d();
                this.c.h = -this.e.K[3].d();
            }
            if (this.e.z) {
                int i143 = b;
                int i144 = ((i143 | 23) << 1) - (i143 ^ 23);
                a = i144 % 128;
                if (i144 % 2 != 0) {
                    f(this.m, this.k, 0, this.n);
                } else {
                    f(this.m, this.k, 1, this.n);
                }
            }
        } else if (nArr4[2].f != null) {
            int i145 = a;
            int i146 = i145 & 87;
            int i147 = -(-(i145 | 87));
            int i148 = (i146 ^ i147) + ((i147 & i146) << 1);
            b = i148 % 128;
            if (i148 % 2 != 0 ? (sVarK = k(nArr4[2])) != null : (sVarK = k(nArr4[2])) != null) {
                s sVar22 = this.k;
                int iD6 = this.e.K[2].d();
                sVar22.n.add(sVarK);
                sVar22.h = iD6;
                sVarK.m.add(sVar22);
                f(this.c, this.k, 1, this.i);
                if (!(!this.e.z)) {
                    f(this.m, this.k, 1, this.n);
                }
                if (this.g == 3) {
                    C0087m c0087m17 = this.e;
                    if (c0087m17.Q > 0.0f) {
                        int i149 = b + 51;
                        a = i149 % 128;
                        int i150 = i149 % 2;
                        D d2 = c0087m17.g;
                        if (d2.g == 3) {
                            int i151 = a;
                            int i152 = i151 ^ 119;
                            int i153 = (i151 & 119) << 1;
                            int i154 = ((i152 | i153) << 1) - (i153 ^ i152);
                            b = i154 % 128;
                            if (i154 % 2 == 0) {
                                d2.i.m.add(this.i);
                                int i155 = 32 / 0;
                            } else {
                                d2.i.m.add(this.i);
                            }
                            int i156 = b;
                            int i157 = i156 & 61;
                            int i158 = -(-(i156 | 61));
                            int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                            a = i159 % 128;
                            if (i159 % 2 != 0) {
                                List<s> list3 = this.i.n;
                                C0015y c0015y8 = this.e.g.i;
                                obj.hashCode();
                                throw null;
                            }
                            this.i.n.add(this.e.g.i);
                            this.i.d = this;
                        }
                    }
                }
            }
        } else if (nArr4[3].f != null) {
            s sVarK9 = k(nArr4[3]);
            if (sVarK9 != null) {
                s sVar23 = this.c;
                int i160 = -this.e.K[3].d();
                sVar23.n.add(sVarK9);
                int i161 = (-2) - ((a + 106) ^ (-1));
                b = i161 % 128;
                if (i161 % 2 == 0) {
                    sVar23.h = i160;
                    sVarK9.m.add(sVar23);
                    throw null;
                }
                sVar23.h = i160;
                sVarK9.m.add(sVar23);
                f(this.k, this.c, -1, this.i);
                if (!(!this.e.z)) {
                    f(this.m, this.k, 1, this.n);
                }
            }
        } else if (nArr4[4].f != null) {
            s sVarK10 = k(nArr4[4]);
            if (sVarK10 != null) {
                s sVar24 = this.m;
                sVar24.n.add(sVarK10);
                int i162 = b;
                int i163 = i162 & 65;
                int i164 = ((i162 ^ 65) | i163) << 1;
                int i165 = -((i162 | 65) & (~i163));
                int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                a = i166 % 128;
                if (i166 % 2 != 0) {
                    sVar24.h = 1;
                } else {
                    sVar24.h = 0;
                }
                sVarK10.m.add(sVar24);
                f(this.k, this.m, -1, this.n);
                int i167 = b;
                int i168 = i167 & 85;
                int i169 = -(-((i167 ^ 85) | i168));
                int i170 = (i168 & i169) + (i169 | i168);
                a = i170 % 128;
                if (i170 % 2 != 0) {
                    f(this.c, this.k, 0, this.i);
                } else {
                    f(this.c, this.k, 1, this.i);
                }
            }
        } else if (!(c0087m16 instanceof T)) {
            int i171 = a;
            int i172 = ((i171 & (-44)) | ((~i171) & 43)) + ((i171 & 43) << 1);
            b = i172 % 128;
            int i173 = i172 % 2;
            C0087m c0087m18 = c0087m16.N;
            if (c0087m18 != null) {
                e(this.k, c0087m18.i.k, c0087m16.s());
                f(this.c, this.k, 1, this.i);
                int i174 = b + 101;
                a = i174 % 128;
                int i175 = i174 % 2;
                if (this.e.z) {
                    s sVar25 = this.m;
                    s sVar26 = this.k;
                    C0015y c0015y9 = this.n;
                    int i176 = b;
                    int i177 = (-2) - ((((i176 | 118) << 1) - (i176 ^ 118)) ^ (-1));
                    a = i177 % 128;
                    int i178 = i177 % 2;
                    f(sVar25, sVar26, 1, c0015y9);
                }
                if (this.g == 3) {
                    int i179 = (-2) - ((a + 70) ^ (-1));
                    b = i179 % 128;
                    if (i179 % 2 == 0) {
                        c0087m2 = this.e;
                        if (c0087m2.Q > 1.0f) {
                            i = b + 31;
                            a = i % 128;
                            if (i % 2 != 0) {
                                d = c0087m2.g;
                                i2 = d.g;
                                int i180 = 89 / 0;
                            } else {
                                d = c0087m2.g;
                                i2 = d.g;
                            }
                            if (i2 == 3) {
                                int i181 = b;
                                i3 = ((((i181 ^ 87) | (i181 & 87)) << 1) - (~(-(((~i181) & 87) | (i181 & (-88)))))) - 1;
                                a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    List<V> list4 = d.i.m;
                                    C0015y c0015y10 = this.i;
                                    obj.hashCode();
                                    throw null;
                                }
                                d.i.m.add(this.i);
                                this.i.n.add(this.e.g.i);
                                this.i.d = this;
                            }
                        }
                    } else {
                        c0087m2 = this.e;
                        if (c0087m2.Q > 0.0f) {
                            i = b + 31;
                            a = i % 128;
                            if (i % 2 != 0) {
                                d = c0087m2.g;
                                i2 = d.g;
                                int i182 = 89 / 0;
                            } else {
                                d = c0087m2.g;
                                i2 = d.g;
                            }
                            if (i2 == 3) {
                                int i183 = b;
                                i3 = ((((i183 ^ 87) | (i183 & 87)) << 1) - (~(-(((~i183) & 87) | (i183 & (-88)))))) - 1;
                                a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    List<V> list5 = d.i.m;
                                    C0015y c0015y11 = this.i;
                                    obj.hashCode();
                                    throw null;
                                }
                                d.i.m.add(this.i);
                                this.i.n.add(this.e.g.i);
                                this.i.d = this;
                            }
                        }
                    }
                }
            }
        }
        if (this.i.n.size() == 0) {
            this.i.f = true;
        }
    }
}
