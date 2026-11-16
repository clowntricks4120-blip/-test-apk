package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cR.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248j extends c {
    private static int a = 0;
    private static int b = 1;
    public transient ivas.gov.bisp.enumeration.cP.P A;
    public transient ivas.gov.bisp.enumeration.cP.P B;
    public transient ivas.gov.bisp.enumeration.cP.P C;
    public transient ivas.gov.bisp.enumeration.cP.P D;
    public transient ivas.gov.bisp.enumeration.cP.P E;
    public transient ivas.gov.bisp.enumeration.cP.P F;
    public transient ivas.gov.bisp.enumeration.cP.P G;
    public transient ivas.gov.bisp.enumeration.cP.P H;
    public transient ivas.gov.bisp.enumeration.cP.P I;
    public transient ivas.gov.bisp.enumeration.cP.P J;
    public transient ivas.gov.bisp.enumeration.cP.P K;
    public transient ivas.gov.bisp.enumeration.cP.P L;
    public transient ivas.gov.bisp.enumeration.cP.P M;
    public transient ivas.gov.bisp.enumeration.cP.P N;
    public transient int O;
    public transient ivas.gov.bisp.enumeration.cP.J d;
    public final ivas.gov.bisp.enumeration.p096p.h e;
    public final Object f;
    public transient ivas.gov.bisp.enumeration.cP.J g;
    public transient ivas.gov.bisp.enumeration.cP.J h;
    public transient ivas.gov.bisp.enumeration.cP.J i;
    public transient ivas.gov.bisp.enumeration.cP.J j;
    public transient ivas.gov.bisp.enumeration.cP.J k;
    public transient ivas.gov.bisp.enumeration.cP.J l;
    public transient ivas.gov.bisp.enumeration.cP.J m;
    public transient ivas.gov.bisp.enumeration.cP.J n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient ivas.gov.bisp.enumeration.cP.J f82o;
    public transient ivas.gov.bisp.enumeration.cP.J p;
    public transient ivas.gov.bisp.enumeration.cP.J q;
    public transient ivas.gov.bisp.enumeration.cP.P r;
    public transient ivas.gov.bisp.enumeration.cP.P s;
    public transient ivas.gov.bisp.enumeration.cP.P t;
    public transient ivas.gov.bisp.enumeration.cP.P u;
    public transient ivas.gov.bisp.enumeration.cP.P v;
    public transient ivas.gov.bisp.enumeration.cP.P w;
    public transient ivas.gov.bisp.enumeration.cP.P x;
    public transient ivas.gov.bisp.enumeration.cP.P y;
    public transient ivas.gov.bisp.enumeration.cP.P z;

    /* JADX WARN: Code duplicated, block: B:187:0x052d  */
    public AbstractC0248j(ivas.gov.bisp.enumeration.p096p.h hVar, Object obj) {
        int i;
        int i2;
        this.e = hVar;
        this.f = obj;
        bFA bfa = new bFA();
        if (hVar != null) {
            bfa.e(hVar);
        }
        bx(bfa);
        ivas.gov.bisp.enumeration.cP.J jAA = bfa.d;
        if (jAA == null) {
            int i3 = b;
            int i4 = i3 & 27;
            int i5 = (i3 ^ 27) | i4;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            jAA = super.aA();
            int i8 = a;
            int i9 = ((i8 | 49) << 1) - (i8 ^ 49);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 5;
            } else {
                int i11 = 2 % 2;
            }
        }
        this.h = jAA;
        ivas.gov.bisp.enumeration.cP.J jAO = bfa.e;
        if (jAO == null) {
            int i12 = a;
            int i13 = i12 & 35;
            int i14 = ((((i12 ^ 35) | i13) << 1) - (~(-((i12 | 35) & (~i13))))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            jAO = super.aO();
        }
        this.g = jAO;
        ivas.gov.bisp.enumeration.cP.J jAR = bfa.f;
        int i16 = 0;
        if (jAR == null) {
            int i17 = a;
            int i18 = i17 & 71;
            int i19 = -(-((i17 ^ 71) | i18));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                jAR = super.aR();
                int i21 = 75 / 0;
            } else {
                jAR = super.aR();
            }
        }
        this.i = jAR;
        ivas.gov.bisp.enumeration.cP.J jBh = bfa.g;
        if (jBh == null) {
            int i22 = b + 31;
            a = i22 % 128;
            int i23 = i22 % 2;
            jBh = super.bh();
            int i24 = a;
            int i25 = (i24 ^ 51) + ((i24 & 51) << 1);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 2 % 2;
            }
        }
        this.j = jBh;
        ivas.gov.bisp.enumeration.cP.J jBq = bfa.i;
        if (jBq == null) {
            int i27 = b;
            int i28 = ((i27 | 77) << 1) - (i27 ^ 77);
            a = i28 % 128;
            int i29 = i28 % 2;
            jBq = super.bq();
        }
        this.d = jBq;
        ivas.gov.bisp.enumeration.cP.J jZ = bfa.h;
        if (jZ == null) {
            int i30 = a;
            int i31 = i30 & 53;
            int i32 = (i31 - (~((i30 ^ 53) | i31))) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
            jZ = super.z();
            int i34 = 2 % 2;
        }
        this.k = jZ;
        ivas.gov.bisp.enumeration.cP.J jAU = bfa.j;
        if (jAU == null) {
            int i35 = b;
            int i36 = i35 & 115;
            int i37 = i36 + ((i35 ^ 115) | i36);
            a = i37 % 128;
            int i38 = i37 % 2;
            jAU = super.aU();
        }
        this.l = jAU;
        ivas.gov.bisp.enumeration.cP.J j = bfa.k;
        this.m = j == null ? super.at() : j;
        ivas.gov.bisp.enumeration.cP.J jAF = bfa.c;
        if (jAF == null) {
            int i39 = a;
            int i40 = i39 & 19;
            int i41 = (i39 ^ 19) | i40;
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            b = i42 % 128;
            int i43 = i42 % 2;
            jAF = super.aF();
        }
        this.f82o = jAF;
        ivas.gov.bisp.enumeration.cP.J jAY = bfa.l;
        if (jAY == null) {
            int i44 = a;
            int i45 = i44 & 49;
            int i46 = -(-((i44 ^ 49) | i45));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            b = i47 % 128;
            int i48 = i47 % 2;
            jAY = super.aY();
        }
        this.n = jAY;
        ivas.gov.bisp.enumeration.cP.J jS = bfa.m;
        Object obj2 = null;
        if (jS == null) {
            int i49 = a + 87;
            b = i49 % 128;
            if (i49 % 2 == 0) {
                super.s();
                throw null;
            }
            jS = super.s();
        }
        this.p = jS;
        ivas.gov.bisp.enumeration.cP.J jR = bfa.n;
        if (jR == null) {
            int i50 = a;
            int i51 = (-2) - (((i50 ^ 8) + ((i50 & 8) << 1)) ^ (-1));
            b = i51 % 128;
            int i52 = i51 % 2;
            jR = super.R();
            int i53 = b;
            int i54 = ((i53 & 33) - (~(i53 | 33))) - 1;
            a = i54 % 128;
            int i55 = i54 % 2;
            int i56 = 2 % 2;
        }
        this.q = jR;
        ivas.gov.bisp.enumeration.cP.P pAu = bfa.p;
        if (pAu == null) {
            int i57 = a;
            int i58 = ((i57 | 35) << 1) - (i57 ^ 35);
            b = i58 % 128;
            int i59 = i58 % 2;
            pAu = super.au();
            int i60 = a;
            int i61 = i60 & 125;
            int i62 = (i60 | 125) & (~i61);
            int i63 = -(-(i61 << 1));
            int i64 = (i62 & i63) + (i62 | i63);
            b = i64 % 128;
            int i65 = i64 % 2;
            int i66 = 2 % 2;
        }
        this.s = pAu;
        ivas.gov.bisp.enumeration.cP.P pAB = bfa.f83o;
        if (pAB == null) {
            int i67 = b;
            int i68 = (i67 & (-56)) | ((~i67) & 55);
            int i69 = -(-((i67 & 55) << 1));
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            a = i70 % 128;
            int i71 = i70 % 2;
            pAB = super.aB();
            int i72 = a;
            int i73 = ((i72 ^ 31) | (i72 & 31)) << 1;
            int i74 = -(((~i72) & 31) | (i72 & (-32)));
            int i75 = (i73 & i74) + (i74 | i73);
            b = i75 % 128;
            if (i75 % 2 == 0) {
                int i76 = 5 / 2;
            } else {
                int i77 = 2 % 2;
            }
        }
        this.r = pAB;
        ivas.gov.bisp.enumeration.cP.P pAM = bfa.q;
        if (pAM == null) {
            int i78 = b;
            int i79 = i78 & 85;
            int i80 = ((((i78 ^ 85) | i79) << 1) - (~(-((i78 | 85) & (~i79))))) - 1;
            a = i80 % 128;
            int i81 = i80 % 2;
            pAM = super.aM();
        }
        this.t = pAM;
        ivas.gov.bisp.enumeration.cP.P pAK = bfa.r;
        if (pAK == null) {
            int i82 = b;
            int i83 = (i82 & 35) + (i82 | 35);
            a = i83 % 128;
            if (i83 % 2 != 0) {
                super.aK();
                throw null;
            }
            pAK = super.aK();
            int i84 = 2 % 2;
        }
        this.w = pAK;
        ivas.gov.bisp.enumeration.cP.P pAV = bfa.t;
        if (pAV == null) {
            int i85 = a;
            int i86 = (i85 & (-78)) | ((~i85) & 77);
            int i87 = (i85 & 77) << 1;
            int i88 = (i86 & i87) + (i87 | i86);
            b = i88 % 128;
            if (i88 % 2 == 0) {
                super.aV();
                throw null;
            }
            pAV = super.aV();
            int i89 = 2 % 2;
        }
        this.v = pAV;
        ivas.gov.bisp.enumeration.cP.P pAE = bfa.s;
        if (pAE == null) {
            int i90 = b;
            int i91 = (i90 & (-100)) | ((~i90) & 99);
            int i92 = (i90 & 99) << 1;
            int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
            a = i93 % 128;
            int i94 = i93 % 2;
            pAE = super.aE();
        }
        this.x = pAE;
        ivas.gov.bisp.enumeration.cP.P pBw = bfa.u;
        if (pBw == null) {
            int i95 = b;
            int i96 = ((i95 | 37) << 1) - (i95 ^ 37);
            a = i96 % 128;
            if (i96 % 2 != 0) {
                super.bw();
                obj2.hashCode();
                throw null;
            }
            pBw = super.bw();
            int i97 = b;
            int i98 = i97 & 77;
            int i99 = -(-(77 | i97));
            int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
            a = i100 % 128;
            int i101 = i100 % 2;
            int i102 = 2 % 2;
        }
        this.y = pBw;
        ivas.gov.bisp.enumeration.cP.P pU = bfa.x;
        if (pU == null) {
            int i103 = b;
            int i104 = (i103 & 63) + (i103 | 63);
            a = i104 % 128;
            int i105 = i104 % 2;
            pU = super.u();
            int i106 = b;
            int i107 = i106 & 41;
            int i108 = (i106 | 41) & (~i107);
            int i109 = i107 << 1;
            int i110 = (i108 & i109) + (i108 | i109);
            a = i110 % 128;
            if (i110 % 2 == 0) {
                int i111 = 2 % 2;
            }
        }
        this.u = pU;
        ivas.gov.bisp.enumeration.cP.P pBg = bfa.w;
        if (pBg == null) {
            int i112 = b;
            int i113 = (i112 & 75) + (i112 | 75);
            a = i113 % 128;
            if (i113 % 2 != 0) {
                super.bg();
                throw null;
            }
            pBg = super.bg();
        }
        this.A = pBg;
        ivas.gov.bisp.enumeration.cP.P pV = bfa.y;
        if (pV == null) {
            int i114 = b + 35;
            a = i114 % 128;
            if (i114 % 2 != 0) {
                pV = super.v();
                int i115 = 85 / 0;
            } else {
                pV = super.v();
            }
            int i116 = b;
            int i117 = i116 ^ 49;
            int i118 = (i116 & 49) << 1;
            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
            a = i119 % 128;
            int i120 = i119 % 2;
            int i121 = 2 % 2;
        }
        this.z = pV;
        ivas.gov.bisp.enumeration.cP.P pAs = bfa.z;
        if (pAs == null) {
            int i122 = a + 81;
            b = i122 % 128;
            int i123 = i122 % 2;
            pAs = super.as();
            int i124 = 2 % 2;
        }
        this.B = pAs;
        ivas.gov.bisp.enumeration.cP.P pW = bfa.v;
        if (pW == null) {
            int i125 = a + 40;
            int i126 = (i125 ^ (-1)) + (i125 << 1);
            b = i126 % 128;
            if (i126 % 2 == 0) {
                pW = super.w();
                int i127 = 75 / 0;
            } else {
                pW = super.w();
            }
        }
        this.D = pW;
        ivas.gov.bisp.enumeration.cP.P pX = bfa.B;
        if (pX == null) {
            int i128 = b + 43;
            a = i128 % 128;
            int i129 = i128 % 2;
            pX = super.x();
            int i130 = b;
            int i131 = i130 & 65;
            int i132 = (i130 ^ 65) | i131;
            int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
            a = i133 % 128;
            if (i133 % 2 != 0) {
                int i134 = 2 / 2;
            } else {
                int i135 = 2 % 2;
            }
        }
        this.C = pX;
        ivas.gov.bisp.enumeration.cP.P pY = bfa.A;
        if (pY == null) {
            int i136 = b;
            int i137 = (-2) - (((i136 ^ 2) + ((i136 & 2) << 1)) ^ (-1));
            a = i137 % 128;
            int i138 = i137 % 2;
            pY = super.y();
            int i139 = b;
            int i140 = (((i139 & (-126)) | ((~i139) & 125)) - (~(-(-((i139 & 125) << 1))))) - 1;
            a = i140 % 128;
            int i141 = i140 % 2;
            int i142 = 2 % 2;
        }
        this.E = pY;
        ivas.gov.bisp.enumeration.cP.P pAT = bfa.C;
        if (pAT == null) {
            int i143 = a;
            int i144 = (i143 & 61) + (i143 | 61);
            b = i144 % 128;
            if (i144 % 2 == 0) {
                pAT = super.aT();
                int i145 = 80 / 0;
            } else {
                pAT = super.aT();
            }
        }
        this.F = pAT;
        ivas.gov.bisp.enumeration.cP.P p = bfa.E;
        this.H = p == null ? super.aW() : p;
        ivas.gov.bisp.enumeration.cP.P pAX = bfa.D;
        if (pAX == null) {
            int i146 = a;
            int i147 = ((i146 ^ 47) | (i146 & 47)) << 1;
            int i148 = -(((~i146) & 47) | (i146 & (-48)));
            int i149 = ((i147 | i148) << 1) - (i148 ^ i147);
            b = i149 % 128;
            if (i149 % 2 == 0) {
                super.aX();
                obj2.hashCode();
                throw null;
            }
            pAX = super.aX();
            int i150 = 2 % 2;
        }
        this.I = pAX;
        ivas.gov.bisp.enumeration.cP.P pAD = bfa.F;
        if (pAD == null) {
            int i151 = b;
            int i152 = (((i151 ^ 75) | (i151 & 75)) << 1) - (((~i151) & 75) | (i151 & (-76)));
            a = i152 % 128;
            if (i152 % 2 != 0) {
                pAD = super.aD();
                int i153 = 95 / 0;
            } else {
                pAD = super.aD();
            }
        }
        this.J = pAD;
        ivas.gov.bisp.enumeration.cP.P pBd = bfa.G;
        if (pBd == null) {
            int i154 = a;
            int i155 = ((i154 | 65) << 1) - (i154 ^ 65);
            b = i155 % 128;
            int i156 = i155 % 2;
            pBd = super.bd();
        }
        this.G = pBd;
        ivas.gov.bisp.enumeration.cP.P pBb = bfa.I;
        if (pBb == null) {
            int i157 = b;
            int i158 = (((i157 & (-52)) | ((~i157) & 51)) - (~((i157 & 51) << 1))) - 1;
            a = i158 % 128;
            if (i158 % 2 != 0) {
                pBb = super.bb();
                int i159 = 88 / 0;
            } else {
                pBb = super.bb();
            }
        }
        this.K = pBb;
        ivas.gov.bisp.enumeration.cP.P pAZ = bfa.J;
        if (pAZ == null) {
            int i160 = b;
            int i161 = ((i160 & 44) + (i160 | 44)) - 1;
            a = i161 % 128;
            int i162 = i161 % 2;
            pAZ = super.aZ();
            int i163 = 2 % 2;
        }
        this.L = pAZ;
        ivas.gov.bisp.enumeration.cP.P p2 = bfa.K;
        this.N = p2 == null ? super.t() : p2;
        ivas.gov.bisp.enumeration.cP.P pO = bfa.H;
        if (pO == null) {
            int i164 = b;
            int i165 = i164 ^ 89;
            int i166 = (i164 & 89) << 1;
            int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
            a = i167 % 128;
            int i168 = i167 % 2;
            pO = super.O();
            int i169 = a;
            int i170 = ((i169 | 61) << 1) - (i169 ^ 61);
            b = i170 % 128;
            int i171 = i170 % 2;
            int i172 = 2 % 2;
        }
        this.M = pO;
        if (hVar != null) {
            if (this.y == hVar.bw()) {
                int i173 = a;
                int i174 = i173 ^ 81;
                int i175 = ((i173 & 81) | i174) << 1;
                int i176 = -i174;
                int i177 = (i175 ^ i176) + ((i175 & i176) << 1);
                b = i177 % 128;
                if (i177 % 2 == 0) {
                    hVar.aV();
                    obj2.hashCode();
                    throw null;
                }
                if (this.v == hVar.aV()) {
                    int i178 = a;
                    int i179 = i178 & 47;
                    int i180 = ((i178 ^ 47) | i179) << 1;
                    int i181 = -((i178 | 47) & (~i179));
                    int i182 = ((i180 | i181) << 1) - (i181 ^ i180);
                    b = i182 % 128;
                    if (i182 % 2 == 0) {
                        hVar.aM();
                        throw null;
                    }
                    if (this.t == hVar.aM() && this.s == hVar.au()) {
                        int i183 = a;
                        int i184 = (i183 & (-126)) | ((~i183) & 125);
                        int i185 = (i183 & 125) << 1;
                        int i186 = (i184 & i185) + (i185 | i184);
                        b = i186 % 128;
                        int i187 = i186 % 2;
                        i = 1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (this.r == hVar.aB()) {
                int i188 = b;
                int i189 = (((i188 | 124) << 1) - (i188 ^ 124)) - 1;
                a = i189 % 128;
                int i190 = i189 % 2;
                int i191 = 2 % 2;
                i2 = 2;
            } else {
                int i192 = b + 97;
                a = i192 % 128;
                int i193 = i192 % 2;
                int i194 = 2 % 2;
                i2 = 0;
            }
            if (this.G == hVar.bd()) {
                int i195 = b;
                int i196 = i195 ^ 27;
                int i197 = (i195 & 27) << 1;
                int i198 = (i196 ^ i197) + ((i197 & i196) << 1);
                a = i198 % 128;
                int i199 = i198 % 2;
                if (this.J == hVar.aD() && this.C == hVar.x()) {
                    int i200 = a;
                    int i201 = i200 ^ 5;
                    int i202 = ((i200 & 5) | i201) << 1;
                    int i203 = -i201;
                    int i204 = (i202 & i203) + (i202 | i203);
                    b = i204 % 128;
                    if (i204 % 2 != 0) {
                        int i205 = 2 % 2;
                    }
                    i16 = 4;
                }
            }
            int i206 = ((~i2) & i) | ((~i) & i2);
            i16 = ((~i206) & i16) | (i206 & (~i16));
        }
        this.O = i16;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P O() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 47;
        int i4 = (((i2 & 47) | i3) << 1) - i3;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.M;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J R() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 47) << 1) - (i2 ^ 47);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.q;
        int i5 = i2 & 87;
        int i6 = -(-(i2 | 87));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J aA() {
        int i = 2 % 2;
        int i2 = b + 17;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.h;
        int i5 = i3 ^ 111;
        int i6 = ((i3 & 111) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aB() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (((i2 | 17) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.r;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aD() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-124)) | ((~i2) & 123);
        int i4 = (i2 & 123) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.J;
        if (i7 != 0) {
            int i8 = 26 / 0;
        }
        int i9 = i6 + 69;
        b = i9 % 128;
        int i10 = i9 % 2;
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aE() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 15) << 1) - (((~i2) & 15) | (i2 & (-16)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.x;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J aF() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 99) << 1;
        int i4 = -(i2 ^ 99);
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.f82o;
        if (i6 == 0) {
            int i7 = 91 / 0;
        }
        int i8 = ((i2 & 47) - (~(i2 | 47))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aK() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = (~i3) & (i2 | 33);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.w;
        int i8 = (((i2 | 121) << 1) - (~(-(i2 ^ 121)))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aM() {
        int i = 2 % 2;
        int i2 = b + 99;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.t;
        int i5 = i3 & 99;
        int i6 = -(-((i3 ^ 99) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 54 / 0;
        }
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J aO() {
        int i = 2 % 2;
        int i2 = b + 23;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.g;
        int i5 = ((i3 & 34) + (i3 | 34)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J aR() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-120)) | ((~i2) & 119)) + ((i2 & 119) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.i;
        int i6 = i4 + 123;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aT() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 115) + ((i2 & 115) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.F;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J aU() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 53) + (i2 | 53);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.J j = this.l;
        int i5 = i4 & 97;
        int i6 = i5 + ((i4 ^ 97) | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aV() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 43;
        int i4 = i3 + ((i2 ^ 43) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.v;
        if (i5 == 0) {
            int i6 = 58 / 0;
        }
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aW() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.H;
        int i5 = (((i2 | 86) << 1) - (i2 ^ 86)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return p;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aX() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.I;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J aY() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 86) + ((i2 & 86) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.n;
        int i5 = (i2 & (-90)) | ((~i2) & 89);
        int i6 = -(-((i2 & 89) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 / 0;
        }
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P aZ() {
        int i = 2 % 2;
        int i2 = a + 48;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.L;
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public AbstractC0242a ap() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = i3 + ((i2 ^ 9) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        if (hVar == null) {
            int i7 = i5 & 35;
            int i8 = ((i5 ^ 35) | i7) << 1;
            int i9 = -((i5 | 35) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = i5 + 59;
        b = i12 % 128;
        int i13 = i12 % 2;
        AbstractC0242a abstractC0242aAp = hVar.ap();
        int i14 = a;
        int i15 = i14 & 79;
        int i16 = -(-((i14 ^ 79) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        return abstractC0242aAp;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P as() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = (i2 ^ 9) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.B;
        int i8 = ((i6 ^ 125) | (i6 & 125)) << 1;
        int i9 = -(((~i6) & 125) | (i6 & (-126)));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 23 / 0;
        }
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J at() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 97;
        int i4 = i3 + ((i2 ^ 97) | i3);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return this.m;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P au() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 57) + (i2 | 57);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.s;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P bb() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.K;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P bd() {
        int i = 2 % 2;
        int i2 = a + 113;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.G;
        }
        int i3 = 41 / 0;
        return this.G;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P bg() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 75) - (~(-(-((i2 & 75) << 1))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.A;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J bh() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = (i2 | 87) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.J j = this.j;
        int i8 = i7 & 49;
        int i9 = i8 + ((i7 ^ 49) | i8);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J bq() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = ((~i3) & (i2 | 121)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.d;
        int i6 = (i2 ^ 77) + ((i2 & 77) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P bw() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 73;
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.y;
        int i5 = i2 & 61;
        int i6 = (i5 - (~((i2 ^ 61) | i5))) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 44 / 0;
        }
        return p;
    }

    public abstract void bx(bFA bfa);

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-106)) | ((~i2) & 105)) - (~((i2 & 105) << 1))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.p;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P t() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (i2 ^ 67) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.N;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P u() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = (i2 ^ 51) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.u;
        int i7 = ((i2 & (-58)) | ((~i2) & 57)) + ((i2 & 57) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P v() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-54)) | ((~i2) & 53);
        int i4 = (i2 & 53) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.z;
        int i7 = ((i2 | 69) << 1) - (i2 ^ 69);
        b = i7 % 128;
        int i8 = i7 % 2;
        return p;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 45;
        int i4 = (i2 & 45) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.D;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P x() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 31;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.P p = this.C;
        int i4 = ((i2 | 5) << 1) - (i2 ^ 5);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return p;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.P y() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 99;
        int i4 = i2 | 99;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.E;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.cP.J z() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 85) - (~(-(-((i2 & 85) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.k;
        int i6 = i4 ^ 3;
        int i7 = (i4 & 3) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r12.O & 5) == 5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r3 = ((r2 | 25) << 1) - (r2 ^ 25);
        ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r3 % 128;
        r3 = r3 % 2;
        r2 = r4.ae(r13, r14, r15, r16, r17, r18, r19);
        r4 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.a;
        r5 = ((r4 | 125) << 1) - (r4 ^ 125);
        ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (((r5 | 4) & (~(r5 & 4))) == 5) goto L11;
     */
    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long ae(int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        /*
            r12 = this;
            r0 = r12
            r1 = 2
            int r2 = r1 % r1
            int r2 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.a
            r3 = r2 ^ 84
            r4 = r2 & 84
            int r4 = r4 << 1
            int r3 = r3 + r4
            int r3 = r3 + (-1)
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r4
            int r3 = r3 % r1
            ivas.gov.bisp.enumeration.p.h r4 = r0.e
            if (r4 == 0) goto L6b
            r3 = r2 | 65
            int r3 = r3 << 1
            r5 = r2 & (-66)
            int r2 = ~r2
            r2 = r2 & 65
            r2 = r2 | r5
            int r2 = -r2
            r5 = r3 | r2
            int r5 = r5 << 1
            r2 = r2 ^ r3
            int r5 = r5 - r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r2
            int r5 = r5 % r1
            r3 = 5
            if (r5 != 0) goto L3c
            int r5 = r0.O
            r6 = r5 & 4
            int r6 = ~r6
            r5 = r5 | 4
            r5 = r5 & r6
            if (r5 != r3) goto L6b
            goto L41
        L3c:
            int r5 = r0.O
            r5 = r5 & r3
            if (r5 != r3) goto L6b
        L41:
            r3 = r2 | 25
            int r3 = r3 << 1
            r2 = r2 ^ 25
            int r3 = r3 - r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r2
            int r3 = r3 % r1
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            long r2 = r4.ae(r5, r6, r7, r8, r9, r10, r11)
            int r4 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.a
            r5 = r4 | 125(0x7d, float:1.75E-43)
            int r5 = r5 << 1
            r4 = r4 ^ 125(0x7d, float:1.75E-43)
            int r5 = r5 - r4
            int r4 = r5 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r4
            int r5 = r5 % r1
            return r2
        L6b:
            long r2 = super.ae(r13, r14, r15, r16, r17, r18, r19)
            int r4 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.b
            r5 = r4 & 51
            r4 = r4 ^ 51
            r4 = r4 | r5
            int r4 = -r4
            int r4 = -r4
            r6 = r5 | r4
            int r6 = r6 << 1
            r4 = r4 ^ r5
            int r6 = r6 - r4
            int r4 = r6 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r4
            int r6 = r6 % r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.AbstractC0248j.ae(int, int, int, int, int, int, int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r6.O & 6) == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r4 = r2 & 117;
        r2 = -(-((r2 ^ 117) | r4));
        r5 = (r4 ^ r2) + ((r2 & r4) << 1);
        ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r5 % 128;
        r5 = r5 % 2;
        r7 = r1.aa(r7, r8, r9, r10);
        r9 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.a;
        r10 = (r9 & 27) + (r9 | 27);
        ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if ((r10 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if ((((~r4) & 53) ^ (r4 & (-54))) == 83) goto L13;
     */
    @Override // ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long aa(int r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.b
            r2 = r1 ^ 108(0x6c, float:1.51E-43)
            r1 = r1 & 108(0x6c, float:1.51E-43)
            int r1 = r1 << 1
            int r2 = r2 + r1
            r1 = r2 ^ (-1)
            int r1 = (-2) - r1
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L7d
            ivas.gov.bisp.enumeration.p.h r1 = r6.e
            if (r1 == 0) goto L6a
            r4 = r2 & 3
            int r5 = ~r4
            r2 = r2 | 3
            r2 = r2 & r5
            int r4 = r4 << 1
            r5 = r2 ^ r4
            r2 = r2 & r4
            int r2 = r2 << 1
            int r5 = r5 + r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L3e
            int r4 = r6.O
            r5 = r4 & (-54)
            int r4 = ~r4
            r4 = r4 & 53
            r4 = r4 ^ r5
            r5 = 83
            if (r4 != r5) goto L6a
            goto L44
        L3e:
            int r4 = r6.O
            r5 = 6
            r4 = r4 & r5
            if (r4 != r5) goto L6a
        L44:
            r4 = r2 & 117(0x75, float:1.64E-43)
            r2 = r2 ^ 117(0x75, float:1.64E-43)
            r2 = r2 | r4
            int r2 = -r2
            int r2 = -r2
            r5 = r4 ^ r2
            r2 = r2 & r4
            int r2 = r2 << 1
            int r5 = r5 + r2
            int r2 = r5 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r2
            int r5 = r5 % r0
            long r7 = r1.aa(r7, r8, r9, r10)
            int r9 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.a
            r10 = r9 & 27
            r9 = r9 | 27
            int r10 = r10 + r9
            int r9 = r10 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.b = r9
            int r10 = r10 % r0
            if (r10 == 0) goto L69
            return r7
        L69:
            throw r3
        L6a:
            long r7 = super.aa(r7, r8, r9, r10)
            int r9 = ivas.gov.bisp.enumeration.cR.AbstractC0248j.b
            r10 = r9 | 41
            int r10 = r10 << 1
            r9 = r9 ^ 41
            int r10 = r10 - r9
            int r9 = r10 % 128
            ivas.gov.bisp.enumeration.cR.AbstractC0248j.a = r9
            int r10 = r10 % r0
            return r7
        L7d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.AbstractC0248j.aa(int, int, int, int):long");
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cR.j$bFA */
    public static final class bFA {
        private static int a = 1;
        private static int b;
        public ivas.gov.bisp.enumeration.cP.P A;
        public ivas.gov.bisp.enumeration.cP.P B;
        public ivas.gov.bisp.enumeration.cP.P C;
        public ivas.gov.bisp.enumeration.cP.P D;
        public ivas.gov.bisp.enumeration.cP.P E;
        public ivas.gov.bisp.enumeration.cP.P F;
        public ivas.gov.bisp.enumeration.cP.P G;
        public ivas.gov.bisp.enumeration.cP.P H;
        public ivas.gov.bisp.enumeration.cP.P I;
        public ivas.gov.bisp.enumeration.cP.P J;
        public ivas.gov.bisp.enumeration.cP.P K;
        public ivas.gov.bisp.enumeration.cP.J c;
        public ivas.gov.bisp.enumeration.cP.J d;
        public ivas.gov.bisp.enumeration.cP.J e;
        public ivas.gov.bisp.enumeration.cP.J f;
        public ivas.gov.bisp.enumeration.cP.J g;
        public ivas.gov.bisp.enumeration.cP.J h;
        public ivas.gov.bisp.enumeration.cP.J i;
        public ivas.gov.bisp.enumeration.cP.J j;
        public ivas.gov.bisp.enumeration.cP.J k;
        public ivas.gov.bisp.enumeration.cP.J l;
        public ivas.gov.bisp.enumeration.cP.J m;
        public ivas.gov.bisp.enumeration.cP.J n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ivas.gov.bisp.enumeration.cP.P f83o;
        public ivas.gov.bisp.enumeration.cP.P p;
        public ivas.gov.bisp.enumeration.cP.P q;
        public ivas.gov.bisp.enumeration.cP.P r;
        public ivas.gov.bisp.enumeration.cP.P s;
        public ivas.gov.bisp.enumeration.cP.P t;
        public ivas.gov.bisp.enumeration.cP.P u;
        public ivas.gov.bisp.enumeration.cP.P v;
        public ivas.gov.bisp.enumeration.cP.P w;
        public ivas.gov.bisp.enumeration.cP.P x;
        public ivas.gov.bisp.enumeration.cP.P y;
        public ivas.gov.bisp.enumeration.cP.P z;

        public static boolean c(ivas.gov.bisp.enumeration.cP.P p) {
            boolean zX;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 ^ 3) | (i3 & 3)) << 1;
            int i5 = -((i3 & (-4)) | ((~i3) & 3));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (p == null) {
                int i8 = i3 ^ 97;
                int i9 = ((((i3 & 97) | i8) << 1) - (~(-i8))) - 1;
                int i10 = i9 % 128;
                a = i10;
                zX = i9 % 2 == 0;
                int i11 = i10 & 117;
                int i12 = -(-((i10 ^ 117) | i11));
                i = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i % 128;
            } else {
                zX = p.x();
                int i13 = b;
                int i14 = i13 ^ 21;
                int i15 = (i13 & 21) << 1;
                i = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i % 128;
            }
            int i16 = i % 2;
            int i17 = a;
            int i18 = (((i17 | 8) << 1) - (i17 ^ 8)) - 1;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                return zX;
            }
            throw null;
        }

        public static boolean d(ivas.gov.bisp.enumeration.cP.J j) {
            boolean zJ;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 115;
            int i4 = (i3 - (~(-(-((i2 ^ 115) | i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (j == null) {
                int i6 = ((i2 | 85) << 1) - (i2 ^ 85);
                int i7 = i6 % 128;
                b = i7;
                int i8 = i6 % 2;
                int i9 = i7 ^ 67;
                int i10 = (((i7 & 67) | i9) << 1) - i9;
                a = i10 % 128;
                int i11 = i10 % 2;
                zJ = false;
            } else {
                zJ = j.j();
                int i12 = b;
                int i13 = (i12 & (-94)) | ((~i12) & 93);
                int i14 = -(-((i12 & 93) << 1));
                int i15 = (i13 & i14) + (i14 | i13);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = a;
            int i18 = i17 & 89;
            int i19 = (i17 ^ 89) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            b = i20 % 128;
            int i21 = i20 % 2;
            return zJ;
        }

        public final void e(ivas.gov.bisp.enumeration.p096p.h hVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-106)) | ((~i2) & 105)) - (~(-(-((i2 & 105) << 1))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            ivas.gov.bisp.enumeration.cP.J jAA = hVar.aA();
            if (d(jAA)) {
                int i5 = b;
                int i6 = i5 & 79;
                int i7 = (~i6) & (i5 | 79);
                int i8 = i6 << 1;
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                if (i9 % 2 == 0) {
                    this.d = jAA;
                    int i10 = 57 / 0;
                } else {
                    this.d = jAA;
                }
                int i11 = (i5 & 19) + (i5 | 19);
                a = i11 % 128;
                int i12 = i11 % 2;
            }
            ivas.gov.bisp.enumeration.cP.J jAO = hVar.aO();
            Object obj = null;
            if (d(jAO)) {
                int i13 = a + 21;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    this.e = jAO;
                    throw null;
                }
                this.e = jAO;
            }
            ivas.gov.bisp.enumeration.cP.J jAR = hVar.aR();
            if (d(jAR)) {
                int i14 = b;
                int i15 = ((i14 & 74) + (i14 | 74)) - 1;
                int i16 = i15 % 128;
                a = i16;
                if (i15 % 2 == 0) {
                    this.f = jAR;
                    int i17 = 54 / 0;
                } else {
                    this.f = jAR;
                }
                int i18 = i16 + 111;
                b = i18 % 128;
                int i19 = i18 % 2;
            }
            ivas.gov.bisp.enumeration.cP.J jBh = hVar.bh();
            if (d(jBh)) {
                int i20 = a;
                int i21 = i20 & 37;
                int i22 = (i20 ^ 37) | i21;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    this.g = jBh;
                    obj.hashCode();
                    throw null;
                }
                this.g = jBh;
            }
            ivas.gov.bisp.enumeration.cP.J jBq = hVar.bq();
            if (d(jBq)) {
                int i24 = a;
                int i25 = i24 | 35;
                int i26 = (i25 << 1) - (i25 & (~(i24 & 35)));
                b = i26 % 128;
                int i27 = i26 % 2;
                this.i = jBq;
                int i28 = (i24 ^ 117) + ((i24 & 117) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
            }
            ivas.gov.bisp.enumeration.cP.J jZ = hVar.z();
            if (d(jZ)) {
                int i30 = b;
                int i31 = (i30 & 87) + (i30 | 87);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    this.h = jZ;
                    int i32 = 0 / 0;
                } else {
                    this.h = jZ;
                }
            }
            ivas.gov.bisp.enumeration.cP.J jAU = hVar.aU();
            if (!(!d(jAU))) {
                int i33 = a;
                int i34 = i33 + 53;
                b = i34 % 128;
                int i35 = i34 % 2;
                this.j = jAU;
                int i36 = i33 & 115;
                int i37 = ((((i33 ^ 115) | i36) << 1) - (~(-((i33 | 115) & (~i36))))) - 1;
                b = i37 % 128;
                int i38 = i37 % 2;
            }
            ivas.gov.bisp.enumeration.cP.J jAt = hVar.at();
            if (!(!d(jAt))) {
                int i39 = a;
                int i40 = ((i39 ^ 95) | (i39 & 95)) << 1;
                int i41 = -(((~i39) & 95) | (i39 & (-96)));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                b = i42 % 128;
                int i43 = i42 % 2;
                this.k = jAt;
            }
            ivas.gov.bisp.enumeration.cP.J jAF = hVar.aF();
            if (d(jAF)) {
                int i44 = b;
                int i45 = (i44 & 93) + (i44 | 93);
                a = i45 % 128;
                if (i45 % 2 == 0) {
                    this.c = jAF;
                    int i46 = 30 / 0;
                } else {
                    this.c = jAF;
                }
            }
            ivas.gov.bisp.enumeration.cP.J jAY = hVar.aY();
            if (d(jAY)) {
                int i47 = b;
                int i48 = i47 & 21;
                int i49 = (((i47 | 21) & (~i48)) - (~(-(-(i48 << 1))))) - 1;
                int i50 = i49 % 128;
                a = i50;
                if (i49 % 2 == 0) {
                    this.l = jAY;
                    obj.hashCode();
                    throw null;
                }
                this.l = jAY;
                int i51 = i50 ^ 95;
                int i52 = (i50 & 95) << 1;
                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                b = i53 % 128;
                int i54 = i53 % 2;
            }
            ivas.gov.bisp.enumeration.cP.J jS = hVar.s();
            if (!(!d(jS))) {
                int i55 = b;
                int i56 = (i55 & (-56)) | ((~i55) & 55);
                int i57 = -(-((i55 & 55) << 1));
                int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                a = i58 % 128;
                if (i58 % 2 == 0) {
                    this.m = jS;
                    int i59 = 26 / 0;
                } else {
                    this.m = jS;
                }
            }
            ivas.gov.bisp.enumeration.cP.J jR = hVar.R();
            if (d(jR)) {
                int i60 = b;
                int i61 = i60 & 33;
                int i62 = ((i60 | 33) & (~i61)) + (i61 << 1);
                a = i62 % 128;
                if (i62 % 2 == 0) {
                    this.n = jR;
                    obj.hashCode();
                    throw null;
                }
                this.n = jR;
            }
            ivas.gov.bisp.enumeration.cP.P pAu = hVar.au();
            if (c(pAu)) {
                int i63 = b + 105;
                a = i63 % 128;
                if (i63 % 2 == 0) {
                    this.p = pAu;
                    throw null;
                }
                this.p = pAu;
            }
            ivas.gov.bisp.enumeration.cP.P pAB = hVar.aB();
            if (c(pAB)) {
                int i64 = a;
                int i65 = ((i64 ^ 94) + ((i64 & 94) << 1)) - 1;
                b = i65 % 128;
                if (i65 % 2 != 0) {
                    this.f83o = pAB;
                    throw null;
                }
                this.f83o = pAB;
            }
            ivas.gov.bisp.enumeration.cP.P pAM = hVar.aM();
            if (c(pAM)) {
                int i66 = b;
                int i67 = ((i66 | 57) << 1) - (i66 ^ 57);
                a = i67 % 128;
                if (i67 % 2 == 0) {
                    this.q = pAM;
                    obj.hashCode();
                    throw null;
                }
                this.q = pAM;
            }
            ivas.gov.bisp.enumeration.cP.P pAK = hVar.aK();
            if (c(pAK)) {
                int i68 = b + 25;
                a = i68 % 128;
                int i69 = i68 % 2;
                this.r = pAK;
            }
            ivas.gov.bisp.enumeration.cP.P pAV = hVar.aV();
            if (!(!c(pAV))) {
                int i70 = b;
                int i71 = ((i70 ^ 52) + ((i70 & 52) << 1)) - 1;
                int i72 = i71 % 128;
                a = i72;
                int i73 = i71 % 2;
                this.t = pAV;
                int i74 = (((i72 | 40) << 1) - (i72 ^ 40)) - 1;
                b = i74 % 128;
                int i75 = i74 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pAE = hVar.aE();
            if (c(pAE)) {
                int i76 = b;
                int i77 = i76 | 109;
                int i78 = i77 << 1;
                int i79 = -((~(i76 & 109)) & i77);
                int i80 = (i78 & i79) + (i79 | i78);
                a = i80 % 128;
                if (i80 % 2 == 0) {
                    this.s = pAE;
                    int i81 = 90 / 0;
                } else {
                    this.s = pAE;
                }
            }
            ivas.gov.bisp.enumeration.cP.P pBw = hVar.bw();
            if (c(pBw)) {
                int i82 = b;
                int i83 = ((i82 ^ 52) + ((i82 & 52) << 1)) - 1;
                int i84 = i83 % 128;
                a = i84;
                int i85 = i83 % 2;
                this.u = pBw;
                int i86 = i84 & 119;
                int i87 = (i84 ^ 119) | i86;
                int i88 = (i86 ^ i87) + ((i86 & i87) << 1);
                b = i88 % 128;
                int i89 = i88 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pU = hVar.u();
            if (c(pU)) {
                int i90 = b;
                int i91 = i90 & 123;
                int i92 = (i90 | 123) & (~i91);
                int i93 = i91 << 1;
                int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                a = i94 % 128;
                if (i94 % 2 == 0) {
                    this.x = pU;
                    throw null;
                }
                this.x = pU;
            }
            ivas.gov.bisp.enumeration.cP.P pBg = hVar.bg();
            if (!(!c(pBg))) {
                int i95 = b;
                int i96 = i95 & 1;
                int i97 = (i95 | 1) & (~i96);
                int i98 = i96 << 1;
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                a = i99 % 128;
                if (i99 % 2 == 0) {
                    this.w = pBg;
                    int i100 = 68 / 0;
                } else {
                    this.w = pBg;
                }
            }
            ivas.gov.bisp.enumeration.cP.P pV = hVar.v();
            if (c(pV)) {
                int i101 = a;
                int i102 = ((i101 | 77) << 1) - (((~i101) & 77) | (i101 & (-78)));
                b = i102 % 128;
                if (i102 % 2 != 0) {
                    this.y = pV;
                    obj.hashCode();
                    throw null;
                }
                this.y = pV;
            }
            ivas.gov.bisp.enumeration.cP.P pAs = hVar.as();
            if (!(!c(pAs))) {
                int i103 = b;
                int i104 = i103 & 5;
                int i105 = i104 + ((i103 ^ 5) | i104);
                a = i105 % 128;
                if (i105 % 2 == 0) {
                    this.z = pAs;
                    int i106 = 28 / 0;
                } else {
                    this.z = pAs;
                }
                int i107 = i103 & 71;
                int i108 = (i103 ^ 71) | i107;
                int i109 = (i107 & i108) + (i107 | i108);
                a = i109 % 128;
                int i110 = i109 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pW = hVar.w();
            if (c(pW)) {
                int i111 = b;
                int i112 = i111 & 79;
                int i113 = -(-((i111 ^ 79) | i112));
                int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                a = i114 % 128;
                if (i114 % 2 == 0) {
                    this.v = pW;
                    obj.hashCode();
                    throw null;
                }
                this.v = pW;
            }
            ivas.gov.bisp.enumeration.cP.P pX = hVar.x();
            if (!(!c(pX))) {
                int i115 = b;
                int i116 = i115 & 97;
                int i117 = -(-((i115 ^ 97) | i116));
                int i118 = (i116 & i117) + (i117 | i116);
                a = i118 % 128;
                int i119 = i118 % 2;
                this.B = pX;
            }
            ivas.gov.bisp.enumeration.cP.P pY = hVar.y();
            if (c(pY)) {
                int i120 = b;
                int i121 = i120 & 105;
                int i122 = (((i120 | 105) & (~i121)) - (~(-(-(i121 << 1))))) - 1;
                a = i122 % 128;
                if (i122 % 2 == 0) {
                    this.A = pY;
                    throw null;
                }
                this.A = pY;
            }
            ivas.gov.bisp.enumeration.cP.P pAT = hVar.aT();
            if (c(pAT)) {
                int i123 = a;
                int i124 = (i123 & 23) + (i123 | 23);
                int i125 = i124 % 128;
                b = i125;
                if (i124 % 2 != 0) {
                    this.C = pAT;
                    throw null;
                }
                this.C = pAT;
                int i126 = ((i125 | 1) << 1) - (i125 ^ 1);
                a = i126 % 128;
                int i127 = i126 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pAW = hVar.aW();
            if (c(pAW)) {
                int i128 = a;
                int i129 = (i128 & 113) + (i128 | 113);
                b = i129 % 128;
                if (i129 % 2 != 0) {
                    this.E = pAW;
                    obj.hashCode();
                    throw null;
                }
                this.E = pAW;
            }
            ivas.gov.bisp.enumeration.cP.P pAX = hVar.aX();
            if (c(pAX)) {
                int i130 = a;
                int i131 = i130 & 61;
                int i132 = ((i130 | 61) & (~i131)) + (i131 << 1);
                int i133 = i132 % 128;
                b = i133;
                if (i132 % 2 != 0) {
                    this.D = pAX;
                    throw null;
                }
                this.D = pAX;
                int i134 = i133 & 9;
                int i135 = -(-((i133 ^ 9) | i134));
                int i136 = (i134 & i135) + (i134 | i135);
                a = i136 % 128;
                int i137 = i136 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pAD = hVar.aD();
            if (c(pAD)) {
                int i138 = b;
                int i139 = i138 & 125;
                int i140 = (i139 - (~((i138 ^ 125) | i139))) - 1;
                int i141 = i140 % 128;
                a = i141;
                if (i140 % 2 == 0) {
                    this.F = pAD;
                    throw null;
                }
                this.F = pAD;
                int i142 = ((i141 | 47) << 1) - (i141 ^ 47);
                b = i142 % 128;
                if (i142 % 2 != 0) {
                    int i143 = 3 / 3;
                }
            }
            ivas.gov.bisp.enumeration.cP.P pBd = hVar.bd();
            if (c(pBd)) {
                int i144 = a;
                int i145 = ((i144 & (-84)) | ((~i144) & 83)) + ((i144 & 83) << 1);
                b = i145 % 128;
                int i146 = i145 % 2;
                this.G = pBd;
            }
            ivas.gov.bisp.enumeration.cP.P pBb = hVar.bb();
            if (c(pBb)) {
                int i147 = b;
                int i148 = ((i147 & 5) - (~(-(-(i147 | 5))))) - 1;
                a = i148 % 128;
                int i149 = i148 % 2;
                this.I = pBb;
                int i150 = ((i147 ^ 35) | (i147 & 35)) << 1;
                int i151 = -(((~i147) & 35) | (i147 & (-36)));
                int i152 = (i150 ^ i151) + ((i150 & i151) << 1);
                a = i152 % 128;
                int i153 = i152 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pAZ = hVar.aZ();
            if (!(!c(pAZ))) {
                int i154 = b;
                int i155 = i154 ^ 57;
                int i156 = (((i154 & 57) | i155) << 1) - i155;
                int i157 = i156 % 128;
                a = i157;
                if (i156 % 2 == 0) {
                    this.J = pAZ;
                    throw null;
                }
                this.J = pAZ;
                int i158 = i157 & 89;
                int i159 = (((~i158) & (i157 | 89)) - (~(i158 << 1))) - 1;
                b = i159 % 128;
                int i160 = i159 % 2;
            }
            ivas.gov.bisp.enumeration.cP.P pT = hVar.t();
            if (c(pT)) {
                int i161 = b;
                int i162 = i161 & 49;
                int i163 = ((i161 ^ 49) | i162) << 1;
                int i164 = -((i161 | 49) & (~i162));
                int i165 = (i163 ^ i164) + ((i164 & i163) << 1);
                a = i165 % 128;
                int i166 = i165 % 2;
                this.K = pT;
            }
            ivas.gov.bisp.enumeration.cP.P pO = hVar.O();
            if (c(pO)) {
                int i167 = b;
                int i168 = (i167 ^ 121) + ((i167 & 121) << 1);
                int i169 = i168 % 128;
                a = i169;
                int i170 = i168 % 2;
                this.H = pO;
                int i171 = (i169 & (-96)) | ((~i169) & 95);
                int i172 = -(-((i169 & 95) << 1));
                int i173 = (i171 & i172) + (i171 | i172);
                b = i173 % 128;
                if (i173 % 2 != 0) {
                    int i174 = 5 % 2;
                }
            }
        }
    }
}
