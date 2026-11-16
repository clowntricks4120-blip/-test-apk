package ivas.gov.bisp.enumeration.p004ad;

import ivas.gov.bisp.enumeration.B.A;
import ivas.gov.bisp.enumeration.B.C;
import ivas.gov.bisp.enumeration.B.C0015y;
import ivas.gov.bisp.enumeration.B.D;
import ivas.gov.bisp.enumeration.B.Y;
import ivas.gov.bisp.enumeration.B.am;
import ivas.gov.bisp.enumeration.p003ac.i;
import ivas.gov.bisp.enumeration.p003ac.r;
import ivas.gov.bisp.enumeration.p003ac.t;
import ivas.gov.bisp.enumeration.p006af.h;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class O extends R {
    private static int a = 0;
    private static int b = 1;
    public int as;
    public int au;
    public A ah = new A(this);
    public C aj = new C(this);
    public A.aJL ai = null;
    public boolean ak = false;
    public i al = new i();
    public int am = 0;
    public int an = 0;
    public M[] ao = new M[4];
    public M[] ap = new M[4];
    public int ar = 263;
    public boolean at = false;
    public boolean aq = false;

    @Override // ivas.gov.bisp.enumeration.p004ad.C0087m
    public void C(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 5) + ((i2 & 5) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        super.C(z, z2);
        int size = this.ag.size();
        int i5 = a;
        int i6 = i5 & 103;
        int i7 = -(-((i5 ^ 103) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = (i8 % 2 == 0 ? 0 : 1) ^ 1;
        while (i9 < size) {
            int i10 = a;
            int i11 = ((i10 & 76) + (i10 | 76)) - 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            this.ag.get(i9).C(z, z2);
            int i13 = b;
            int i14 = ((i13 | 95) << 1) - (i13 ^ 95);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i9 ^ 1;
            int i17 = ((i9 & 1) | i16) << 1;
            int i18 = -i16;
            i9 = ((i17 | i18) << 1) - (i17 ^ i18);
            int i19 = (i13 & 53) + (i13 | 53);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = b;
        int i22 = i21 & 117;
        int i23 = ((i21 ^ 117) | i22) << 1;
        int i24 = -((i21 | 117) & (~i22));
        int i25 = (i23 & i24) + (i24 | i23);
        a = i25 % 128;
        int i26 = i25 % 2;
    }

    public void G() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            this.aj.d = false;
        } else {
            this.aj.d = true;
        }
    }

    public void K(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 80;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.ar = i;
            i2 = 25807;
        } else {
            this.ar = i;
            i2 = 256;
        }
        i.d = h.i(i, i2);
        int i6 = b;
        int i7 = (i6 & (-42)) | ((~i6) & 41);
        int i8 = (i6 & 41) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p004ad.R, ivas.gov.bisp.enumeration.p004ad.C0087m
    public void v() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = (i2 | 47) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        (i6 % 2 == 0 ? this.al : this.al).v();
        this.as = 0;
        this.au = 0;
        super.v();
        int i7 = a;
        int i8 = (i7 & 113) + (i7 | 113);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 47 / 0;
        }
    }

    public void H(C0087m c0087m, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 17;
        int i5 = -(-((i3 & 17) << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (i == 0) {
            int i8 = (i3 & (-12)) | ((~i3) & 11);
            int i9 = -(-((i3 & 11) << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i11 = this.am;
            M[] mArr = this.ap;
            int i12 = i11 & 1;
            if (i12 + ((i11 ^ 1) | i12) >= mArr.length) {
                int i13 = i3 & 121;
                int i14 = -(-((i3 ^ 121) | i13));
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                b = i15 % 128;
                M[] mArr2 = (M[]) Arrays.copyOf(mArr, i15 % 2 == 0 ? mArr.length << 2 : mArr.length * 2);
                int i16 = a;
                int i17 = (i16 | 21) << 1;
                int i18 = -(i16 ^ 21);
                int i19 = (i17 & i18) + (i18 | i17);
                b = i19 % 128;
                if (i19 % 2 == 0) {
                    this.ap = mArr2;
                    int i20 = 43 / 0;
                } else {
                    this.ap = mArr2;
                }
            }
            M[] mArr3 = this.ap;
            int i21 = this.am;
            mArr3[i21] = new M(c0087m, 0, this.ak);
            int i22 = b;
            int i23 = ((i22 ^ 88) + ((i22 & 88) << 1)) - 1;
            a = i23 % 128;
            this.am = i23 % 2 != 0 ? -(-i21) : ((i21 | 1) << 1) - (i21 ^ 1);
            int i24 = i22 & 9;
            int i25 = (i22 | 9) & (~i24);
            int i26 = i24 << 1;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            a = i27 % 128;
            int i28 = i27 % 2;
            return;
        }
        if (i == 1) {
            int i29 = (i3 & (-44)) | ((~i3) & 43);
            int i30 = (i3 & 43) << 1;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            b = i31 % 128;
            int i32 = i31 % 2;
            int i33 = this.an;
            M[] mArr4 = this.ao;
            int i34 = i33 + 1;
            int i35 = i3 & 61;
            int i36 = ((~i35) & (i3 | 61)) + (i35 << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            if (i34 >= mArr4.length) {
                int i38 = i3 & 1;
                int i39 = (i3 | 1) & (~i38);
                int i40 = i38 << 1;
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                b = i41 % 128;
                int i42 = i41 % 2;
                M[] mArr5 = (M[]) Arrays.copyOf(mArr4, mArr4.length * 2);
                int i43 = b;
                int i44 = i43 & 27;
                int i45 = -(-(i43 | 27));
                int i46 = (i44 & i45) + (i45 | i44);
                int i47 = i46 % 128;
                a = i47;
                if (i46 % 2 != 0) {
                    this.ao = mArr5;
                    int i48 = 94 / 0;
                } else {
                    this.ao = mArr5;
                }
                int i49 = i47 & 61;
                int i50 = i49 + ((i47 ^ 61) | i49);
                b = i50 % 128;
                int i51 = i50 % 2;
            }
            M[] mArr6 = this.ao;
            int i52 = this.an;
            mArr6[i52] = new M(c0087m, 1, this.ak);
            int i53 = a;
            int i54 = i53 & 95;
            int i55 = (i53 | 95) & (~i54);
            int i56 = i54 << 1;
            int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
            int i58 = i57 % 128;
            b = i58;
            int i59 = i57 % 2;
            this.an = ((i52 & (-2)) | ((~i52) & 1)) + ((i52 & 1) << 1);
            int i60 = (i58 ^ 59) + ((i58 & 59) << 1);
            a = i60 % 128;
            int i61 = i60 % 2;
        }
        int i62 = a;
        int i63 = (i62 & 47) + (i62 | 47);
        b = i63 % 128;
        if (i63 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x0471  */
    /* JADX WARN: Code duplicated, block: B:128:0x048b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:180:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x013d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d9  */
    public boolean I(i iVar) {
        int size;
        char c;
        int i;
        N n;
        t tVarN;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = i7 | 43;
        int i9 = (i8 << 1) - ((~(i7 & 43)) & i8);
        a = i9 % 128;
        int i10 = 0;
        if (i9 % 2 != 0) {
            d(iVar);
            size = this.ag.size();
            int i11 = 12 / 0;
        } else {
            d(iVar);
            size = this.ag.size();
        }
        int i12 = 0;
        boolean z = false;
        while (i12 < size) {
            C0087m c0087m = this.ag.get(i12);
            boolean[] zArr = c0087m.I;
            int i13 = b;
            int i14 = i13 & 9;
            int i15 = (i13 ^ 9) | i14;
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = i16 % 128;
            a = i17;
            if (i16 % 2 != 0) {
                zArr[1] = false;
                zArr[1] = true;
                if (c0087m instanceof x) {
                    int i18 = i17 + 103;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                }
            } else {
                zArr[0] = false;
                zArr[1] = false;
                if (c0087m instanceof x) {
                    int i110 = i17 + 103;
                    b = i110 % 128;
                    int i111 = i110 % 2;
                    z = true;
                }
            }
            int i20 = (i12 ^ 113) + ((i12 & 113) << 1);
            int i21 = i20 & (-112);
            i12 = ((((i20 ^ (-112)) | i21) << 1) - (~(-((i20 | (-112)) & (~i21))))) - 1;
            int i22 = i17 & 109;
            int i23 = ((i17 ^ 109) | i22) << 1;
            int i24 = -((~i22) & (i17 | 109));
            int i25 = (i23 & i24) + (i23 | i24);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        Object obj = null;
        if (z) {
            int i27 = a;
            int i28 = ((i27 ^ 11) | (i27 & 11)) << 1;
            int i29 = -(((~i27) & 11) | (i27 & (-12)));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 0;
            while (i32 < size) {
                int i33 = b;
                int i34 = ((((i33 ^ 93) | (i33 & 93)) << 1) - (~(-(((~i33) & 93) | (i33 & (-94)))))) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                C0087m c0087m2 = this.ag.get(i32);
                int i36 = a;
                int i37 = i36 + 29;
                b = i37 % 128;
                if (i37 % 2 == 0) {
                    boolean z2 = c0087m2 instanceof x;
                    throw null;
                }
                if (c0087m2 instanceof x) {
                    x xVar = (x) c0087m2;
                    int i38 = i36 + 95;
                    b = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = 0;
                    while (i40 < xVar.ah) {
                        C0087m c0087m3 = xVar.ag[i40];
                        int i41 = xVar.aj;
                        if (i41 != 0) {
                            int i42 = a;
                            int i43 = (((i42 ^ 125) | (i42 & 125)) << 1) - ((125 & (~i42)) | (i42 & (-126)));
                            int i44 = i43 % 128;
                            b = i44;
                            int i45 = i43 % 2;
                            if (i41 != 1) {
                                int i46 = i44 & 77;
                                int i47 = -(-((i44 ^ 77) | i46));
                                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                                int i49 = i48 % 128;
                                a = i49;
                                int i50 = i48 % 2;
                                if (i41 != 2) {
                                    int i51 = (((i49 & (-52)) | (51 & (~i49))) - (~(-(-((i49 & 51) << 1))))) - 1;
                                    b = i51 % 128;
                                    int i52 = i51 % 2;
                                    if (i41 == 3) {
                                        c0087m3.I[1] = true;
                                    }
                                } else {
                                    c0087m3.I[1] = true;
                                }
                            } else {
                                c0087m3.I[0] = true;
                            }
                        } else {
                            c0087m3.I[0] = true;
                        }
                        int i53 = i40 & 1;
                        int i54 = -(-((i40 ^ 1) | i53));
                        i40 = ((i54 & i53) << 1) + (i53 ^ i54);
                    }
                }
                int i55 = i32 & (-104);
                int i56 = (i55 - (~((i32 ^ (-104)) | i55))) - 1;
                int i57 = i56 & 105;
                i32 = (i57 - (~(-(-((i56 ^ 105) | i57))))) - 1;
                int i58 = b;
                int i59 = i58 & 17;
                int i60 = ((i58 ^ 17) | i59) << 1;
                int i61 = -((i58 | 17) & (~i59));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                a = i62 % 128;
                int i63 = i62 % 2;
            }
        }
        int i64 = 0;
        while (i64 < size) {
            C0087m c0087m4 = this.ag.get(i64);
            int i65 = a;
            int i66 = i65 & 57;
            int i67 = -(-((i65 ^ 57) | i66));
            int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
            b = i68 % 128;
            if (i68 % 2 == 0) {
                Objects.requireNonNull(c0087m4);
                boolean z3 = c0087m4 instanceof L;
                obj.hashCode();
                throw null;
            }
            Objects.requireNonNull(c0087m4);
            if (c0087m4 instanceof L) {
                int i69 = b;
                i4 = (i69 ^ 117) + ((i69 & 117) << 1);
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    c0087m4.d(iVar);
                    throw null;
                }
                c0087m4.d(iVar);
                int i70 = b;
                int i71 = (i70 & 36) + (i70 | 36);
                i5 = (i71 ^ (-1)) + (i71 << 1);
                a = i5 % 128;
            } else {
                int i72 = a;
                int i73 = (i72 ^ 59) + ((i72 & 59) << 1);
                int i74 = i73 % 128;
                b = i74;
                int i75 = i73 % 2;
                if (c0087m4 instanceof Q) {
                    int i610 = b;
                    i4 = (i610 ^ 117) + ((i610 & 117) << 1);
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        c0087m4.d(iVar);
                        throw null;
                    }
                    c0087m4.d(iVar);
                    int i76 = b;
                    int i77 = (i76 & 36) + (i76 | 36);
                    i5 = (i77 ^ (-1)) + (i77 << 1);
                    a = i5 % 128;
                } else {
                    int i78 = i74 & 53;
                    i5 = (((i74 ^ 53) | i78) << 1) - ((i74 | 53) & (~i78));
                    a = i5 % 128;
                }
            }
            int i79 = i5 % 2;
            int i80 = (((i64 | (-91)) << 1) - (i64 ^ (-91))) - 1;
            int i81 = i80 & 93;
            i64 = (i81 - (~(-(-((i80 ^ 93) | i81))))) - 1;
            int i82 = b + 75;
            a = i82 % 128;
            int i83 = i82 % 2;
        }
        int i84 = 0;
        while (i84 < size) {
            int i85 = a;
            int i86 = (((i85 | 98) << 1) - (i85 ^ 98)) - 1;
            b = i86 % 128;
            int i87 = i86 % 2;
            C0087m c0087m5 = this.ag.get(i84);
            int i88 = a;
            int i89 = i88 + 14;
            int i90 = (i89 ^ (-1)) + (i89 << 1);
            b = i90 % 128;
            int i91 = i90 % 2;
            if (c0087m5 instanceof O) {
                int i92 = ((((i88 ^ 39) | (i88 & 39)) << 1) - (~(-(((~i88) & 39) | (i88 & (-40)))))) - 1;
                b = i92 % 128;
                if (i92 % 2 == 0) {
                    iArr = c0087m5.M;
                    i3 = iArr[i10];
                } else {
                    iArr = c0087m5.M;
                    i3 = iArr[i10];
                }
                int i93 = iArr[1];
                if (i3 == 2) {
                    iArr[i10] = 1;
                    int i94 = (-2) - ((b + 52) ^ (-1));
                    a = i94 % 128;
                    int i95 = i94 % 2;
                }
                if (i93 == 2) {
                    int i96 = a;
                    int i97 = i96 & 89;
                    int i98 = ((((i96 ^ 89) | i97) << 1) - (~(-((~i97) & (i96 | 89))))) - 1;
                    int i99 = i98 % 128;
                    b = i99;
                    int i100 = i98 % 2;
                    iArr[1] = 1;
                    int i101 = ((i99 & 120) + (i99 | 120)) - 1;
                    a = i101 % 128;
                    int i102 = i101 % 2;
                }
                c0087m5.d(iVar);
                if (i3 == 2) {
                    int i103 = b;
                    int i104 = ((i103 ^ 108) + ((i103 & 108) << 1)) - 1;
                    a = i104 % 128;
                    if (i104 % 2 != 0) {
                        c0087m5.u(i3);
                        obj.hashCode();
                        throw null;
                    }
                    c0087m5.u(i3);
                }
                if (i93 == 2) {
                    int i105 = a;
                    int i106 = i105 & 65;
                    int i107 = (i105 ^ 65) | i106;
                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                    b = i108 % 128;
                    int i109 = i108 % 2;
                    c0087m5.B(i93);
                }
                c = ']';
            } else {
                c0087m5.k = -1;
                c0087m5.c = -1;
                int[] iArr2 = this.M;
                int i112 = a;
                int i113 = i112 & 41;
                int i114 = (((i112 ^ 41) | i113) << 1) - ((i112 | 41) & (~i113));
                b = i114 % 128;
                if (i114 % 2 != 0 ? iArr2[i10] == 2 : iArr2[1] == 4) {
                    c = ']';
                } else if (c0087m5.M[i10] == 4) {
                    int i115 = b;
                    int i116 = (i115 ^ 77) + ((i115 & 77) << 1);
                    a = i116 % 128;
                    int i117 = i116 % 2;
                    int i118 = c0087m5.B.h;
                    int iP = p() - c0087m5.C.h;
                    N n2 = c0087m5.B;
                    int i119 = b;
                    int i120 = ((i119 & 95) - (~(i119 | 95))) - 1;
                    a = i120 % 128;
                    int i121 = i120 % 2;
                    n2.i = iVar.n(n2);
                    N n3 = c0087m5.C;
                    int i122 = b;
                    int i123 = i122 & 33;
                    int i124 = i123 + ((i122 ^ 33) | i123);
                    a = i124 % 128;
                    if (i124 % 2 != 0) {
                        n3.i = iVar.n(n3);
                        int i125 = 4 / i10;
                    } else {
                        n3.i = iVar.n(n3);
                    }
                    iVar.i(c0087m5.B.i, i118);
                    N n4 = c0087m5.C;
                    int i126 = a;
                    c = ']';
                    int i127 = (93 & (~i126)) | (i126 & (-94));
                    int i128 = (i126 & 93) << 1;
                    int i129 = (i127 & i128) + (i127 | i128);
                    b = i129 % 128;
                    int i130 = i129 % 2;
                    iVar.i(n4.i, iP);
                    c0087m5.k = 2;
                    int i131 = a;
                    int i132 = (i131 & 79) + (i131 | 79);
                    b = i132 % 128;
                    int i133 = i132 % 2;
                    c0087m5.H = i118;
                    int i134 = -(~(-i118));
                    int i135 = ((iP ^ i134) + ((i134 & iP) << 1)) - 1;
                    c0087m5.P = i135;
                    int i136 = b;
                    int i137 = (((i136 | 106) << 1) - (i136 ^ 106)) - 1;
                    a = i137 % 128;
                    if (i137 % 2 != 0) {
                        int i138 = c0087m5.V;
                        obj.hashCode();
                        throw null;
                    }
                    int i139 = c0087m5.V;
                    if (i135 < i139) {
                        int i140 = a;
                        int i141 = (i140 ^ 9) + ((i140 & 9) << 1);
                        b = i141 % 128;
                        if (i141 % 2 == 0) {
                            c0087m5.P = i139;
                            throw null;
                        }
                        c0087m5.P = i139;
                    }
                } else {
                    c = ']';
                }
                if (this.M[1] != 2) {
                    int i142 = b;
                    int i143 = i142 & 19;
                    int i144 = (i142 ^ 19) | i143;
                    int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                    a = i145 % 128;
                    int i146 = i145 % 2;
                    if (c0087m5.M[1] == 4) {
                        int i147 = a;
                        int i148 = i147 & 95;
                        int i149 = (i147 ^ 95) | i148;
                        int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                        b = i150 % 128;
                        int i151 = i150 % 2;
                        int i152 = c0087m5.A.h;
                        int iC = c();
                        int i153 = b;
                        int i154 = ((i153 | 79) << 1) - (79 ^ i153);
                        a = i154 % 128;
                        if (i154 % 2 != 0) {
                            i = iC % c0087m5.E.h;
                        } else {
                            int i155 = -(~(-c0087m5.E.h));
                            i = ((iC & i155) + (iC | i155)) - 1;
                        }
                        N n5 = c0087m5.A;
                        n5.i = iVar.n(n5);
                        N n6 = c0087m5.E;
                        int i156 = a;
                        int i157 = i156 & 29;
                        int i158 = (((i156 ^ 29) | i157) << 1) - ((i156 | 29) & (~i157));
                        b = i158 % 128;
                        int i159 = i158 % 2;
                        n6.i = iVar.n(n6);
                        iVar.i(c0087m5.A.i, i152);
                        N n7 = c0087m5.E;
                        int i160 = b;
                        int i161 = ((i160 | 27) << 1) - (i160 ^ 27);
                        a = i161 % 128;
                        int i162 = i161 % 2;
                        iVar.i(n7.i, i);
                        if (c0087m5.T <= 0) {
                            int i163 = b;
                            int i164 = ((i163 | 33) << 1) - (i163 ^ 33);
                            a = i164 % 128;
                            if (i164 % 2 == 0 ? c0087m5.Y == 8 : c0087m5.Y == 8) {
                                n = c0087m5.D;
                                tVarN = iVar.n(n);
                                int i165 = b;
                                int i166 = i165 & 81;
                                i2 = (((i165 ^ 81) | i166) << 1) - ((i165 | 81) & (~i166));
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    n.i = tVarN;
                                    t tVar = c0087m5.D.i;
                                    throw null;
                                }
                                n.i = tVarN;
                                t tVar2 = c0087m5.D.i;
                                int i167 = c0087m5.T;
                                int i168 = i167 & i152;
                                int i169 = ((i167 ^ i152) | i168) << 1;
                                int i170 = -((i167 | i152) & (~i168));
                                iVar.i(tVar2, ((i169 | i170) << 1) - (i170 ^ i169));
                            }
                        } else {
                            n = c0087m5.D;
                            tVarN = iVar.n(n);
                            int i1610 = b;
                            int i1611 = i1610 & 81;
                            i2 = (((i1610 ^ 81) | i1611) << 1) - ((i1610 | 81) & (~i1611));
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                n.i = tVarN;
                                t tVar3 = c0087m5.D.i;
                                throw null;
                            }
                            n.i = tVarN;
                            t tVar4 = c0087m5.D.i;
                            int i1612 = c0087m5.T;
                            int i1613 = i1612 & i152;
                            int i1614 = ((i1612 ^ i152) | i1613) << 1;
                            int i171 = -((i1612 | i152) & (~i1613));
                            iVar.i(tVar4, ((i1614 | i171) << 1) - (i171 ^ i1614));
                        }
                        c0087m5.c = 2;
                        c0087m5.U = i152;
                        int i172 = b;
                        int i173 = i172 ^ 29;
                        int i174 = (i172 & 29) << 1;
                        int i175 = (i173 & i174) + (i174 | i173);
                        a = i175 % 128;
                        int i176 = i175 % 2;
                        int i177 = -i152;
                        int i178 = (((i ^ i177) | (i & i177)) << 1) - ((i177 & (~i)) | ((~i177) & i));
                        c0087m5.O = i178;
                        int i179 = c0087m5.S;
                        int i180 = b;
                        int i181 = i180 + 8;
                        int i182 = (i181 ^ (-1)) + (i181 << 1);
                        a = i182 % 128;
                        int i183 = i182 % 2;
                        if (i178 < i179) {
                            int i184 = i180 & 65;
                            int i185 = (i180 ^ 65) | i184;
                            int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
                            a = i186 % 128;
                            int i187 = i186 % 2;
                            c0087m5.O = i179;
                        }
                    }
                }
                if (c0087m5 instanceof L) {
                    continue;
                } else {
                    int i188 = a;
                    int i189 = i188 & 55;
                    int i190 = -(-((i188 ^ 55) | i189));
                    int i191 = (i189 ^ i190) + ((i190 & i189) << 1);
                    int i192 = i191 % 128;
                    b = i192;
                    if (i191 % 2 == 0) {
                        boolean z4 = c0087m5 instanceof Q;
                        throw null;
                    }
                    if (c0087m5 instanceof Q) {
                        continue;
                    } else {
                        int i193 = i192 & 47;
                        int i194 = ((i192 | 47) & (~i193)) + (i193 << 1);
                        a = i194 % 128;
                        if (i194 % 2 != 0) {
                            c0087m5.d(iVar);
                            obj.hashCode();
                            throw null;
                        }
                        c0087m5.d(iVar);
                    }
                }
            }
            i84 = ((i84 | 1) << 1) - (i84 ^ 1);
            int i195 = b;
            int i196 = (i195 ^ 49) + ((i195 & 49) << 1);
            a = i196 % 128;
            int i197 = i196 % 2;
            i10 = 0;
        }
        if (this.am > 0) {
            int i198 = a;
            int i199 = (((i198 | 118) << 1) - (i198 ^ 118)) - 1;
            b = i199 % 128;
            int i200 = i199 % 2;
            ivas.gov.bisp.enumeration.O.i.g(this, iVar, 0);
        }
        if (this.an > 0) {
            int i201 = a;
            int i202 = (((i201 ^ 29) | (i201 & 29)) << 1) - (((~i201) & 29) | (i201 & (-30)));
            b = i202 % 128;
            int i203 = i202 % 2;
            ivas.gov.bisp.enumeration.O.i.g(this, iVar, 1);
        }
        int i204 = a;
        int i205 = i204 ^ 109;
        int i206 = ((((i204 & 109) | i205) << 1) - (~(-i205))) - 1;
        b = i206 % 128;
        if (i206 % 2 == 0) {
            int i207 = 79 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0129  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0154  */
    /* JADX WARN: Code duplicated, block: B:43:0x016f  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:46:0x018c  */
    /* JADX WARN: Code duplicated, block: B:48:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0190  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x020b  */
    /* JADX WARN: Code duplicated, block: B:74:0x02e9  */
    public boolean J(boolean z, int i) {
        C c;
        boolean z2;
        O o2;
        boolean z3;
        boolean z4;
        Y next;
        Iterator<Y> it;
        int i2;
        int i3;
        O o3;
        O o4;
        C0015y c0015y;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        O o5;
        O o6;
        int i9;
        int i10;
        Y next2;
        int i11 = 2 % 2;
        int i12 = a;
        int i13 = (-2) - ((((i12 | 80) << 1) - (i12 ^ 80)) ^ (-1));
        b = i13 % 128;
        if (i13 % 2 == 0) {
            c = this.aj;
            o2 = c.c;
            z2 = z;
        } else {
            c = this.aj;
            z2 = z & true;
            o2 = c.c;
        }
        int i14 = b;
        int i15 = (i14 | 29) << 1;
        int i16 = -(i14 ^ 29);
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        int i18 = i17 % 2;
        int iJ = o2.j(0);
        int iJ2 = c.c.j(1);
        int i19 = a;
        int i20 = i19 & 83;
        int i21 = (i19 | 83) & (~i20);
        int i22 = -(-(i20 << 1));
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        b = i23 % 128;
        int i24 = i23 % 2;
        int iQ = c.c.q();
        int i25 = b;
        int i26 = ((i25 | 81) << 1) - (i25 ^ 81);
        a = i26 % 128;
        int i27 = i26 % 2;
        int iS = c.c.s();
        if (z2) {
            int i28 = b;
            int i29 = ((i28 ^ 40) + ((i28 & 40) << 1)) - 1;
            int i30 = i29 % 128;
            a = i30;
            if (i29 % 2 == 0 ? iJ == 2 : iJ == 4) {
                it = c.h.iterator();
                int i31 = a;
                int i32 = i31 & 57;
                int i33 = i32 + ((i31 ^ 57) | i32);
                b = i33 % 128;
                int i34 = i33 % 2;
                while (it.hasNext()) {
                    int i35 = a;
                    i10 = (((~i35) & 87) | (i35 & (-88))) + ((i35 & 87) << 1);
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        it.next();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    next2 = it.next();
                    if (next2.h == i) {
                        int i36 = b;
                        int i37 = ((i36 & 108) + (i36 | 108)) - 1;
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        if (!next2.m()) {
                            int i39 = a;
                            int i40 = ((((i39 ^ 103) | (i39 & 103)) << 1) - (~(-(((~i39) & 103) | (i39 & (-104)))))) - 1;
                            b = i40 % 128;
                            int i41 = i40 % 2;
                            z2 = false;
                            break;
                        }
                    }
                }
                if (i == 0) {
                    int i42 = a;
                    i5 = ((i42 | 13) << 1) - (i42 ^ 13);
                    i6 = i5 % 128;
                    b = i6;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    if (z2) {
                        int i43 = (i6 & 109) + (i6 | 109);
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        if (iJ == 2) {
                            int i45 = i6 & 53;
                            int i46 = ((i6 ^ 53) | i45) << 1;
                            int i47 = -((i6 | 53) & (~i45));
                            i7 = ((i46 | i47) << 1) - (i46 ^ i47);
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                o5 = c.c;
                                i8 = 0;
                                o5.M[1] = 0;
                            } else {
                                i8 = 0;
                                o5 = c.c;
                                o5.M[0] = 1;
                            }
                            o5.D(c.f(o5, i8));
                            o6 = c.c;
                            i9 = b + 125;
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                o6.g.i.e(o6.p());
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            o6.g.i.e(o6.p());
                        }
                    }
                } else if (z2) {
                    int i48 = b;
                    int i49 = (i48 & (-4)) | ((~i48) & 3);
                    int i50 = -(-((i48 & 3) << 1));
                    int i51 = (i49 & i50) + (i50 | i49);
                    i2 = i51 % 128;
                    a = i2;
                    int i52 = i51 % 2;
                    if (iJ2 == 2) {
                        i3 = i2 + 63;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            o3 = c.c;
                            o3.M[1] = 0;
                        } else {
                            o3 = c.c;
                            o3.M[1] = 1;
                        }
                        int i53 = a;
                        int i54 = ((i53 | 41) << 1) - (i53 ^ 41);
                        b = i54 % 128;
                        int i55 = i54 % 2;
                        o3.y(c.f(o3, 1));
                        int i56 = b + 7;
                        a = i56 % 128;
                        int i57 = i56 % 2;
                        o4 = c.c;
                        c0015y = o4.i.i;
                        int i58 = b;
                        int i59 = (i58 & (-56)) | ((~i58) & 55);
                        int i60 = -(-((i58 & 55) << 1));
                        i4 = ((i59 | i60) << 1) - (i60 ^ i59);
                        a = i4 % 128;
                        if (i4 % 2 == 0) {
                            c0015y.e(o4.c());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        c0015y.e(o4.c());
                        int i61 = a + 33;
                        b = i61 % 128;
                        int i62 = i61 % 2;
                    }
                }
            } else {
                int i63 = i30 ^ 33;
                int i64 = ((((i30 & 33) | i63) << 1) - (~(-i63))) - 1;
                b = i64 % 128;
                if (i64 % 2 != 0 ? iJ2 == 2 : iJ2 == 3) {
                    it = c.h.iterator();
                    int i310 = a;
                    int i311 = i310 & 57;
                    int i312 = i311 + ((i310 ^ 57) | i311);
                    b = i312 % 128;
                    int i313 = i312 % 2;
                    while (it.hasNext()) {
                        int i314 = a;
                        i10 = (((~i314) & 87) | (i314 & (-88))) + ((i314 & 87) << 1);
                        b = i10 % 128;
                        if (i10 % 2 != 0) {
                            it.next();
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        next2 = it.next();
                        if (next2.h == i) {
                            int i315 = b;
                            int i316 = ((i315 & 108) + (i315 | 108)) - 1;
                            a = i316 % 128;
                            int i317 = i316 % 2;
                            if (!next2.m()) {
                                int i318 = a;
                                int i410 = ((((i318 ^ 103) | (i318 & 103)) << 1) - (~(-(((~i318) & 103) | (i318 & (-104)))))) - 1;
                                b = i410 % 128;
                                int i411 = i410 % 2;
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (i == 0) {
                        int i412 = a;
                        i5 = ((i412 | 13) << 1) - (i412 ^ 13);
                        i6 = i5 % 128;
                        b = i6;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        if (z2) {
                            int i413 = (i6 & 109) + (i6 | 109);
                            a = i413 % 128;
                            int i414 = i413 % 2;
                            if (iJ == 2) {
                                int i415 = i6 & 53;
                                int i416 = ((i6 ^ 53) | i415) << 1;
                                int i417 = -((i6 | 53) & (~i415));
                                i7 = ((i416 | i417) << 1) - (i416 ^ i417);
                                a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    o5 = c.c;
                                    i8 = 0;
                                    o5.M[1] = 0;
                                } else {
                                    i8 = 0;
                                    o5 = c.c;
                                    o5.M[0] = 1;
                                }
                                o5.D(c.f(o5, i8));
                                o6 = c.c;
                                i9 = b + 125;
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    o6.g.i.e(o6.p());
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                                o6.g.i.e(o6.p());
                            }
                        }
                    } else if (z2) {
                        int i418 = b;
                        int i419 = (i418 & (-4)) | ((~i418) & 3);
                        int i510 = -(-((i418 & 3) << 1));
                        int i511 = (i419 & i510) + (i510 | i419);
                        i2 = i511 % 128;
                        a = i2;
                        int i512 = i511 % 2;
                        if (iJ2 == 2) {
                            i3 = i2 + 63;
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                o3 = c.c;
                                o3.M[1] = 0;
                            } else {
                                o3 = c.c;
                                o3.M[1] = 1;
                            }
                            int i513 = a;
                            int i514 = ((i513 | 41) << 1) - (i513 ^ 41);
                            b = i514 % 128;
                            int i515 = i514 % 2;
                            o3.y(c.f(o3, 1));
                            int i516 = b + 7;
                            a = i516 % 128;
                            int i517 = i516 % 2;
                            o4 = c.c;
                            c0015y = o4.i.i;
                            int i518 = b;
                            int i519 = (i518 & (-56)) | ((~i518) & 55);
                            int i65 = -(-((i518 & 55) << 1));
                            i4 = ((i519 | i65) << 1) - (i65 ^ i519);
                            a = i4 % 128;
                            if (i4 % 2 == 0) {
                                c0015y.e(o4.c());
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                            c0015y.e(o4.c());
                            int i66 = a + 33;
                            b = i66 % 128;
                            int i67 = i66 % 2;
                        }
                    }
                }
            }
        }
        if (i == 0) {
            int i68 = b;
            int i69 = i68 & 93;
            int i70 = (i68 | 93) & (~i69);
            int i71 = i69 << 1;
            int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
            a = i72 % 128;
            int i73 = i72 % 2;
            O o7 = c.c;
            int i74 = o7.M[0];
            int i75 = b + 34;
            int i76 = (i75 ^ (-1)) + (i75 << 1);
            int i77 = i76 % 128;
            a = i77;
            int i78 = i76 % 2;
            if (i74 != 1) {
                int i79 = ((i77 | 93) << 1) - (i77 ^ 93);
                b = i79 % 128;
                int i80 = i79 % 2;
                if (i74 != 4) {
                    int i81 = a;
                    int i82 = (i81 ^ 45) + ((i81 & 45) << 1);
                    b = i82 % 128;
                    int i83 = i82 % 2;
                    z3 = false;
                }
            }
            int iP = o7.p();
            int i84 = ((iP ^ iQ) | (iP & iQ)) << 1;
            int i85 = -(((~iP) & iQ) | ((~iQ) & iP));
            int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
            D d = c.c.g;
            int i87 = a;
            int i88 = i87 & 81;
            int i89 = ((i87 ^ 81) | i88) << 1;
            int i90 = -((i87 | 81) & (~i88));
            int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
            b = i91 % 128;
            int i92 = i91 % 2;
            d.c.e(i86);
            C0015y c0015y2 = c.c.g.i;
            int i93 = a;
            int i94 = (i93 & 117) + (i93 | 117);
            b = i94 % 128;
            if (i94 % 2 == 0) {
                c0015y2.e((i86 - (~(-iQ))) - 1);
            } else {
                int i95 = -(~(-iQ));
                c0015y2.e(((i86 ^ i95) + ((i95 & i86) << 1)) - 1);
            }
            int i96 = b;
            int i97 = i96 & 15;
            int i98 = (i96 ^ 15) | i97;
            int i99 = (i97 & i98) + (i98 | i97);
            a = i99 % 128;
            int i100 = i99 % 2;
            int i101 = b;
            int i102 = i101 | 79;
            int i103 = i102 << 1;
            int i104 = -((~(i101 & 79)) & i102);
            int i105 = (i103 & i104) + (i104 | i103);
            a = i105 % 128;
            int i106 = i105 % 2;
            z3 = true;
        } else {
            O o8 = c.c;
            int[] iArr = o8.M;
            int i107 = a;
            int i108 = i107 & 87;
            int i109 = i108 + ((i107 ^ 87) | i108);
            int i110 = i109 % 128;
            b = i110;
            int i111 = i109 % 2;
            int i112 = iArr[1];
            if (i112 != 1) {
                int i113 = (((i110 ^ 125) | (i110 & 125)) << 1) - (((~i110) & 125) | (i110 & (-126)));
                a = i113 % 128;
                int i114 = i113 % 2;
                if (i112 != 4) {
                    int i810 = a;
                    int i811 = (i810 ^ 45) + ((i810 & 45) << 1);
                    b = i811 % 128;
                    int i812 = i811 % 2;
                    z3 = false;
                }
            }
            int iC = o8.c();
            int i115 = (iC & iS) + (iC | iS);
            int i116 = b;
            int i117 = (i116 & 125) + (i116 | 125);
            a = i117 % 128;
            if (i117 % 2 != 0) {
                c.c.i.c.e(i115);
                throw null;
            }
            c.c.i.c.e(i115);
            int i118 = a;
            int i119 = (i118 ^ 75) + ((i118 & 75) << 1);
            b = i119 % 128;
            int i120 = i119 % 2;
            C0015y c0015y3 = c.c.i.i;
            int i121 = b;
            int i122 = i121 ^ 91;
            int i123 = ((i121 & 91) | i122) << 1;
            int i124 = -i122;
            int i125 = (i123 & i124) + (i123 | i124);
            a = i125 % 128;
            int i126 = i125 % 2;
            int i127 = -iS;
            int i128 = i115 & i127;
            int i129 = ((i115 ^ i127) | i128) << 1;
            int i130 = -((i115 | i127) & (~i128));
            c0015y3.e((i129 & i130) + (i130 | i129));
            int i131 = b;
            int i132 = i131 & 67;
            int i133 = (i131 ^ 67) | i132;
            int i134 = (i132 & i133) + (i133 | i132);
            a = i134 % 128;
            int i135 = i134 % 2;
            int i1010 = b;
            int i1011 = i1010 | 79;
            int i1012 = i1011 << 1;
            int i1013 = -((~(i1010 & 79)) & i1011);
            int i1014 = (i1012 & i1013) + (i1013 | i1012);
            a = i1014 % 128;
            int i1015 = i1014 % 2;
            z3 = true;
        }
        c.i();
        Iterator<Y> it2 = c.h.iterator();
        int i136 = b + 43;
        a = i136 % 128;
        if (i136 % 2 != 0) {
            int i137 = 42 / 0;
        }
        while (it2.hasNext()) {
            int i138 = b;
            int i139 = (i138 ^ 11) + ((i138 & 11) << 1);
            a = i139 % 128;
            if (i139 % 2 != 0) {
                next = it2.next();
                int i140 = 30 / 0;
            } else {
                next = it2.next();
            }
            int i141 = b;
            int i142 = (i141 & 23) + (i141 | 23);
            a = i142 % 128;
            if (i142 % 2 != 0) {
                int i143 = next.h;
                Object obj7 = null;
                obj7.hashCode();
                throw null;
            }
            if (next.h == i) {
                if (next.e == c.c) {
                    int i144 = a;
                    int i145 = i144 ^ 23;
                    int i146 = ((i144 & 23) | i145) << 1;
                    int i147 = -i145;
                    int i148 = (i146 & i147) + (i146 | i147);
                    b = i148 % 128;
                    if (i148 % 2 == 0) {
                        boolean z5 = next.j;
                        throw null;
                    }
                    if (next.j) {
                    }
                }
                next.i();
                int i149 = b;
                int i150 = i149 & 65;
                int i151 = i150 + ((i149 ^ 65) | i150);
                a = i151 % 128;
                int i152 = i151 % 2;
            }
        }
        Iterator<Y> it3 = c.h.iterator();
        int i153 = b;
        int i154 = ((i153 & (-74)) | ((~i153) & 73)) + ((i153 & 73) << 1);
        a = i154 % 128;
        int i155 = i154 % 2;
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            int i156 = a + 29;
            b = i156 % 128;
            if (i156 % 2 == 0) {
                Object obj8 = null;
                int i157 = it3.next().h;
                obj8.hashCode();
                throw null;
            }
            Y next3 = it3.next();
            int i158 = next3.h;
            int i159 = a;
            int i160 = i159 & 41;
            int i161 = (~i160) & (i159 | 41);
            int i162 = -(-(i160 << 1));
            int i163 = (i161 & i162) + (i162 | i161);
            b = i163 % 128;
            int i164 = i163 % 2;
            if (i158 == i) {
                int i165 = i159 & 13;
                int i166 = ((((i159 ^ 13) | i165) << 1) - (~(-((~i165) & (i159 | 13))))) - 1;
                b = i166 % 128;
                int i167 = i166 % 2;
                if (!z3) {
                    int i168 = ((i159 | 19) << 1) - (i159 ^ 19);
                    b = i168 % 128;
                    int i169 = i168 % 2;
                    if (next3.e == c.c) {
                        continue;
                    }
                }
                if (next3.k.l) {
                    int i170 = b;
                    int i171 = i170 & 103;
                    int i172 = ((i170 ^ 103) | i171) << 1;
                    int i173 = -((i170 | 103) & (~i171));
                    int i174 = ((i172 | i173) << 1) - (i173 ^ i172);
                    a = i174 % 128;
                    int i175 = i174 % 2;
                    if (next3.c.l) {
                        int i176 = a;
                        int i177 = (i176 & 36) + (i176 | 36);
                        int i178 = (i177 ^ (-1)) + (i177 << 1);
                        int i179 = i178 % 128;
                        b = i179;
                        int i180 = i178 % 2;
                        if (next3 instanceof am) {
                            continue;
                        } else {
                            int i181 = i179 & 27;
                            int i182 = ((((i179 ^ 27) | i181) << 1) - (~(-((i179 | 27) & (~i181))))) - 1;
                            a = i182 % 128;
                            if (i182 % 2 != 0) {
                                boolean z6 = next3.i.l;
                                throw null;
                            }
                            if (!(!next3.i.l)) {
                            }
                        }
                    }
                }
                int i183 = b;
                int i184 = i183 & 115;
                int i185 = ((i183 | 115) & (~i184)) + (i184 << 1);
                a = i185 % 128;
                int i186 = i185 % 2;
                z4 = false;
                break;
            }
        }
        c.c.u(iJ);
        O o9 = c.c;
        int i187 = a;
        int i188 = i187 & 7;
        int i189 = -(-((i187 ^ 7) | i188));
        int i190 = ((i188 | i189) << 1) - (i189 ^ i188);
        b = i190 % 128;
        if (i190 % 2 == 0) {
            o9.B(iJ2);
            throw null;
        }
        o9.B(iJ2);
        int i191 = b;
        int i192 = i191 & 67;
        int i193 = (i192 - (~(-(-((i191 ^ 67) | i192))))) - 1;
        a = i193 % 128;
        int i194 = i193 % 2;
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0520  */
    /* JADX WARN: Code duplicated, block: B:204:0x0650  */
    /* JADX WARN: Code duplicated, block: B:205:0x066e A[PHI: r0 r2
  0x066e: PHI (r0v58 boolean) = (r0v57 boolean), (r0v83 boolean), (r0v83 boolean), (r0v83 boolean), (r0v83 boolean) binds: [B:173:0x0593, B:195:0x062e, B:196:0x0630, B:203:0x064e, B:200:0x0647] A[DONT_GENERATE, DONT_INLINE]
  0x066e: PHI (r2v37 int) = (r2v36 int), (r2v54 int), (r2v54 int), (r2v54 int), (r2v54 int) binds: [B:173:0x0593, B:195:0x062e, B:196:0x0630, B:203:0x064e, B:200:0x0647] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
    @Override // ivas.gov.bisp.enumeration.p004ad.R
    public void F() {
        int iMax;
        int iMax2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        boolean z6;
        C0087m c0087m;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = b + 49;
        a = i6 % 128;
        int i7 = 0;
        int i8 = 1;
        if (i6 % 2 != 0) {
            this.H = 1;
        } else {
            this.H = 0;
        }
        this.U = 0;
        int iP = p();
        int i9 = b;
        int i10 = (i9 & 27) + (i9 | 27);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            iMax = Math.max(0, iP);
            iMax2 = Math.max(1, c());
        } else {
            iMax = Math.max(0, iP);
            iMax2 = Math.max(0, c());
        }
        int i11 = iMax2;
        int i12 = iMax;
        int i13 = b;
        int i14 = i13 | 51;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 51)) & i14);
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        this.at = false;
        this.aq = false;
        int i20 = this.ar;
        int i21 = ~i20;
        if ((i20 & 64) == 64) {
            int i22 = ((i18 & 64) + (i18 | 64)) - 1;
            b = i22 % 128;
            int i23 = i22 % 2;
            z = true;
        } else {
            int i24 = i18 & 41;
            int i25 = -(-((i18 ^ 41) | i24));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = (i21 & 5924) | (i20 & (-5925));
                int i28 = i20 & 5924;
                if (((i27 & i28) | (i27 ^ i28)) == 4027) {
                    int i29 = i18 & 113;
                    int i30 = (i29 - (~((i18 ^ 113) | i29))) - 1;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    int i210 = ((i18 & 64) + (i18 | 64)) - 1;
                    b = i210 % 128;
                    int i211 = i210 % 2;
                    z = true;
                } else {
                    int i32 = i18 | 65;
                    i3 = (i32 << 1) - ((~(i18 & 65)) & i32);
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else if ((i20 & 128) == 128) {
                int i212 = i18 & 113;
                int i33 = (i212 - (~((i18 ^ 113) | i212))) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
                int i213 = ((i18 & 64) + (i18 | 64)) - 1;
                b = i213 % 128;
                int i214 = i213 % 2;
                z = true;
            } else {
                int i35 = i18 | 65;
                i3 = (i35 << 1) - ((~(i18 & 65)) & i35);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        i iVar = this.al;
        Objects.requireNonNull(iVar);
        iVar.l = false;
        if (i20 != 0) {
            int i36 = a + 57;
            b = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = 38 / 0;
                if (z) {
                    iVar.l = true;
                    int i38 = a;
                    int i39 = ((i38 & (-44)) | ((~i38) & 43)) + ((i38 & 43) << 1);
                    b = i39 % 128;
                    int i40 = i39 % 2;
                }
            } else if (z) {
                iVar.l = true;
                int i310 = a;
                int i311 = ((i310 & (-44)) | ((~i310) & 43)) + ((i310 & 43) << 1);
                b = i311 % 128;
                int i41 = i311 % 2;
            }
        }
        int[] iArr = this.M;
        int i42 = iArr[1];
        int i43 = iArr[0];
        ArrayList<C0087m> arrayList = this.ag;
        if (k() != 2) {
            int i44 = b;
            int i45 = i44 & 33;
            int i46 = -(-((i44 ^ 33) | i45));
            int i47 = (i45 & i46) + (i46 | i45);
            a = i47 % 128;
            if (i47 % 2 == 0 ? n() == 2 : n() == 5) {
                z2 = true;
            } else {
                int i48 = a + 15;
                int i49 = i48 % 128;
                b = i49;
                int i50 = i48 % 2;
                int i51 = (((i49 ^ 45) | (i49 & 45)) << 1) - (((~i49) & 45) | (i49 & (-46)));
                a = i51 % 128;
                int i52 = i51 % 2;
                z2 = false;
            }
        } else {
            z2 = true;
        }
        this.am = 0;
        this.an = 0;
        ArrayList<C0087m> arrayList2 = this.ag;
        int i53 = a;
        int i54 = (-2) - (((i53 ^ 66) + ((i53 & 66) << 1)) ^ (-1));
        b = i54 % 128;
        int i55 = i54 % 2;
        int size = arrayList2.size();
        for (int i56 = 0; i56 < size; i56 = ((i56 | 1) << 1) - (i56 ^ 1)) {
            int i57 = a;
            int i58 = i57 & 81;
            int i59 = (i57 ^ 81) | i58;
            int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
            b = i60 % 128;
            int i61 = i60 % 2;
            C0087m c0087m2 = this.ag.get(i56);
            int i62 = a;
            int i63 = i62 & 9;
            int i64 = (i63 - (~(-(-((i62 ^ 9) | i63))))) - 1;
            b = i64 % 128;
            if (i64 % 2 == 0) {
                boolean z7 = c0087m2 instanceof R;
                throw null;
            }
            if (c0087m2 instanceof R) {
                ((R) c0087m2).F();
            }
        }
        int i65 = b + 103;
        a = i65 % 128;
        int i66 = i65 % 2;
        int i67 = 0;
        boolean z8 = false;
        int i68 = 1;
        boolean z9 = z2;
        while (i68 != 0) {
            int i69 = a;
            int i70 = ((i69 | 99) << 1) - (i69 ^ 99);
            b = i70 % 128;
            int i71 = i70 % 2;
            int i72 = ((i67 | 1) << i8) - (i67 ^ i8);
            try {
                this.al.v();
                this.am = i7;
                this.an = i7;
                int i73 = a;
                int i74 = (((i73 & (-62)) | ((~i73) & 61)) - (~((i73 & 61) << i8))) - i8;
                b = i74 % 128;
                int i75 = i74 % i4;
                h(this.al);
                int i76 = a;
                int i77 = ((((~i76) & 115) | (i76 & (-116))) - (~((i76 & 115) << i8))) - i8;
                b = i77 % 128;
                int i78 = i77 % 2;
                int i79 = 0;
                while (i79 < size) {
                    this.ag.get(i79).h(this.al);
                    int i80 = ((i79 & 28) - (~(-(-(i79 | 28))))) - i8;
                    int i81 = i80 & (-27);
                    i79 = i81 + ((i80 ^ (-27)) | i81);
                }
                I(this.al);
                try {
                    i iVar2 = this.al;
                    int i82 = a;
                    int i83 = i82 & 61;
                    int i84 = i83 + ((i82 ^ 61) | i83);
                    b = i84 % 128;
                    int i85 = i84 % 2;
                    Objects.requireNonNull(iVar2);
                    if (((iVar2.l ? 1 : 0) ^ i8) != i8) {
                        int i86 = a;
                        int i87 = i86 & 81;
                        int i88 = (((i86 ^ 81) | i87) << i8) - ((i86 | 81) & (~i87));
                        b = i88 % 128;
                        int i89 = i88 % 2;
                        int i90 = 0;
                        while (true) {
                            if (i90 >= iVar2.g) {
                                iVar2.l();
                                break;
                            }
                            r rVar = iVar2.m[i90];
                            int i91 = a;
                            int i92 = i91 & 31;
                            int i93 = (i91 ^ 31) | i92;
                            int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                            b = i94 % 128;
                            if (i94 % 2 == 0) {
                                boolean z10 = rVar.g;
                                throw null;
                            }
                            if (!rVar.g) {
                                int i95 = a;
                                int i96 = ((i95 & (-44)) | ((~i95) & 43)) + ((i95 & 43) << i8);
                                b = i96 % 128;
                                int i97 = i96 % 2;
                                iVar2.t(iVar2.i);
                                break;
                            }
                            int i98 = i90 & 62;
                            int i99 = (i90 | 62) & (~i98);
                            int i100 = i98 << i8;
                            int i101 = ((i99 | i100) << i8) - (i99 ^ i100);
                            i90 = ((((i101 ^ (-61)) | (i101 & (-61))) << i8) - (~(-((i101 & 60) | ((~i101) & (-61)))))) - i8;
                        }
                    } else {
                        iVar2.t(iVar2.i);
                    }
                    i68 = i8;
                } catch (Exception e) {
                    e = e;
                    i68 = i8;
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("EXCEPTION : ");
                    sb.append(e);
                    printStream.println(sb.toString());
                }
            } catch (Exception e2) {
                e = e2;
            }
            if ((i68 ^ 1) != 0) {
                E(this.al);
                int i102 = 0;
                while (i102 < size) {
                    C0087m c0087m3 = this.ag.get(i102);
                    i iVar3 = this.al;
                    int i103 = b;
                    boolean z11 = z8;
                    int i104 = i103 & 69;
                    int i105 = ((i103 ^ 69) | i104) << i8;
                    int i106 = -((i103 | 69) & (~i104));
                    int i107 = (i105 ^ i106) + ((i106 & i105) << i8);
                    a = i107 % 128;
                    if (i107 % 2 != 0) {
                        c0087m3.E(iVar3);
                        int i108 = i102 & 74;
                        int i109 = -(-((i102 ^ 74) | i108));
                        i102 = ((i109 & i108) << i8) + (i108 ^ i109);
                    } else {
                        c0087m3.E(iVar3);
                        i102++;
                    }
                    z8 = z11;
                }
                z3 = z8;
            } else {
                z3 = z8;
                int i110 = b + 41;
                a = i110 % 128;
                int i111 = i110 % 2;
                i iVar4 = this.al;
                h.G[2] = false;
                E(iVar4);
                int i112 = a;
                int i113 = i112 & 19;
                int i114 = i113 + ((i112 ^ 19) | i113);
                b = i114 % 128;
                int i115 = i114 % 2;
                int size2 = this.ag.size();
                for (int i116 = 0; i116 < size2; i116 = ((i116 & 33) + (i116 | 33)) - 32) {
                    int i117 = a;
                    int i118 = i117 ^ 47;
                    int i119 = ((((i117 & 47) | i118) << i8) - (~(-i118))) - i8;
                    b = i119 % 128;
                    if (i119 % 2 == 0) {
                        this.ag.get(i116).E(iVar4);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    this.ag.get(i116).E(iVar4);
                    int i120 = a;
                    int i121 = (-2) - ((((i120 | 96) << i8) - (i120 ^ 96)) ^ (-1));
                    b = i121 % 128;
                    int i122 = i121 % 2;
                }
            }
            if (z9) {
                int i123 = a;
                int i124 = (i123 & 103) + (i123 | 103);
                b = i124 % 128;
                int i125 = i124 % 2;
                if (i72 >= 8 || !h.G[2]) {
                    z4 = z9;
                    int i126 = b;
                    int i127 = i126 & 99;
                    int i128 = (((i126 | 99) & (~i127)) - (~(i127 << 1))) - 1;
                    a = i128 % 128;
                    int i129 = i128 % 2;
                    z5 = z3;
                    i = 0;
                } else {
                    int i130 = b;
                    int i131 = ((i130 | 13) << i8) - (((~i130) & 13) | (i130 & (-14)));
                    a = i131 % 128;
                    int i132 = i131 % 2;
                    int i133 = 0;
                    int iMax3 = 0;
                    int iMax4 = 0;
                    while (i133 < size) {
                        int i134 = a;
                        int i135 = i134 & 31;
                        int i136 = (((i134 ^ 31) | i135) << i8) - ((~i135) & (i134 | 31));
                        b = i136 % 128;
                        if (i136 % 2 == 0) {
                            c0087m = this.ag.get(i133);
                            int i137 = 83 / 0;
                        } else {
                            c0087m = this.ag.get(i133);
                        }
                        int i138 = c0087m.H;
                        int iP2 = c0087m.p();
                        int i139 = b;
                        int i140 = i139 & 15;
                        z9 = z9;
                        int i141 = (~i140) & (i139 | 15);
                        int i142 = -(-(i140 << 1));
                        int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
                        a = i143 % 128;
                        if (i143 % 2 != 0) {
                            int i144 = -i138;
                            iMax3 = Math.max(iMax3, ((iP2 | i144) << 1) - (i144 ^ iP2));
                        } else {
                            int i145 = -(-i138);
                            int i146 = iP2 | i145;
                            int i147 = i146 << 1;
                            int i148 = -((~(i145 & iP2)) & i146);
                            iMax3 = Math.max(iMax3, (i147 & i148) + (i148 | i147));
                        }
                        iMax4 = Math.max(iMax4, (c0087m.c() - (~(-(-c0087m.U)))) - 1);
                        int i149 = b + 11;
                        a = i149 % 128;
                        if (i149 % 2 != 0) {
                            int i150 = i133 & 113;
                            int i151 = i133 | 113;
                            i133 = (i150 & i151) + (i150 | i151);
                            i8 = 1;
                        } else {
                            i8 = 1;
                            int i152 = (((i133 | (-114)) << 1) - (i133 ^ (-114))) - 1;
                            i133 = ((i152 & 117) + (i152 | 117)) - 1;
                        }
                    }
                    z4 = z9;
                    int iMax5 = Math.max(this.V, iMax3);
                    int iMax6 = Math.max(this.S, iMax4);
                    int i153 = 2;
                    if (i43 != 2) {
                        z5 = z3;
                        i = 0;
                    } else if (p() < iMax5) {
                        int i154 = a;
                        int i155 = (((i154 | 8) << 1) - (i154 ^ 8)) - 1;
                        b = i155 % 128;
                        if (i155 % 2 == 0) {
                            D(iMax5);
                            this.M[0] = 5;
                            i = 0;
                        } else {
                            D(iMax5);
                            this.M[0] = 2;
                            i = 1;
                        }
                        int i156 = b;
                        int i157 = i156 & 119;
                        int i158 = ((i156 ^ 119) | i157) << 1;
                        int i159 = -((i156 | 119) & (~i157));
                        int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                        a = i160 % 128;
                        i153 = 2;
                        if (i160 % 2 != 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        z5 = true;
                    } else {
                        i153 = 2;
                        z5 = z3;
                        i = 0;
                    }
                    if (i42 == i153) {
                        int i161 = b;
                        int i162 = ((i161 ^ 90) + ((i161 & 90) << 1)) - 1;
                        a = i162 % 128;
                        if (i162 % 2 != 0) {
                            c();
                            throw null;
                        }
                        if (c() < iMax6) {
                            y(iMax6);
                            int[] iArr2 = this.M;
                            int i163 = a;
                            int i164 = ((i163 ^ 93) - (~((i163 & 93) << 1))) - 1;
                            b = i164 % 128;
                            if (i164 % 2 == 0) {
                                iArr2[1] = 2;
                                i = 1;
                                z5 = true;
                            } else {
                                iArr2[1] = 2;
                                i = 1;
                                z5 = true;
                            }
                        }
                    }
                }
            } else {
                z4 = z9;
                int i1210 = b;
                int i1211 = i1210 & 99;
                int i1212 = (((i1210 | 99) & (~i1211)) - (~(i1211 << 1))) - 1;
                a = i1212 % 128;
                int i1213 = i1212 % 2;
                z5 = z3;
                i = 0;
            }
            int iMax7 = Math.max(this.V, p());
            if (iMax7 > p()) {
                D(iMax7);
                this.M[0] = 1;
                int i165 = a;
                int i166 = (i165 ^ 67) + ((i165 & 67) << 1);
                b = i166 % 128;
                int i167 = i166 % 2;
                i = 1;
                z5 = true;
            }
            int iMax8 = Math.max(this.S, c());
            if (iMax8 > c()) {
                y(iMax8);
                this.M[1] = 1;
                int i168 = a;
                int i169 = (i168 & 103) + (i168 | 103);
                b = i169 % 128;
                z6 = i169 % 2 != 0;
                i2 = 1;
            } else {
                i2 = i;
                z6 = z5;
            }
            if (!(!z6)) {
                z8 = z6;
                i68 = i2;
            } else {
                int i170 = (-2) - ((a + 52) ^ (-1));
                b = i170 % 128;
                if (i170 % 2 != 0 ? this.M[0] == 2 : this.M[0] == 3) {
                    int i171 = b + 11;
                    a = i171 % 128;
                    if (i171 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (i12 > 0 && p() > i12) {
                        int i172 = b;
                        int i173 = i172 & 105;
                        int i174 = ((i172 ^ 105) | i173) << 1;
                        int i175 = -((i172 | 105) & (~i173));
                        int i176 = (i174 ^ i175) + ((i175 & i174) << 1);
                        a = i176 % 128;
                        if (i176 % 2 != 0) {
                            this.at = false;
                            this.M[1] = 1;
                        } else {
                            this.at = true;
                            this.M[0] = 1;
                        }
                        int i177 = b;
                        int i178 = (((i177 & (-40)) | ((~i177) & 39)) - (~(-(-((i177 & 39) << 1))))) - 1;
                        a = i178 % 128;
                        int i179 = i178 % 2;
                        D(i12);
                        z6 = true;
                        i2 = 1;
                    }
                }
                int[] iArr3 = this.M;
                int i180 = a;
                int i181 = i180 & 117;
                int i182 = -(-((i180 ^ 117) | i181));
                int i183 = (i181 ^ i182) + ((i182 & i181) << 1);
                int i184 = i183 % 128;
                b = i184;
                int i185 = i183 % 2;
                if (iArr3[1] != 2 || i11 <= 0) {
                    z8 = z6;
                    i68 = i2;
                } else {
                    int i186 = (i184 ^ 37) + ((i184 & 37) << 1);
                    a = i186 % 128;
                    if (i186 % 2 != 0) {
                        int i187 = 37 / 0;
                        if (c() > i11) {
                            int i188 = b;
                            int i189 = i188 & 115;
                            int i190 = (i189 - (~((i188 ^ 115) | i189))) - 1;
                            a = i190 % 128;
                            int i191 = i190 % 2;
                            this.aq = true;
                            this.M[1] = 1;
                            y(i11);
                            i68 = 1;
                            z8 = true;
                        } else {
                            z8 = z6;
                            i68 = i2;
                        }
                    } else if (c() > i11) {
                        int i1810 = b;
                        int i1811 = i1810 & 115;
                        int i192 = (i1811 - (~((i1810 ^ 115) | i1811))) - 1;
                        a = i192 % 128;
                        int i193 = i192 % 2;
                        this.aq = true;
                        this.M[1] = 1;
                        y(i11);
                        i68 = 1;
                        z8 = true;
                    } else {
                        z8 = z6;
                        i68 = i2;
                    }
                }
            }
            int i194 = a;
            int i195 = i194 & 85;
            int i196 = (i194 | 85) & (~i195);
            int i197 = i195 << 1;
            int i198 = (i196 ^ i197) + ((i196 & i197) << 1);
            b = i198 % 128;
            int i199 = i198 % 2;
            i67 = i72;
            z9 = z4;
            i4 = 2;
            i7 = 0;
            i8 = 1;
        }
        boolean z12 = z8;
        this.ag = arrayList;
        if (z12) {
            int[] iArr4 = this.M;
            iArr4[0] = i43;
            int i200 = b;
            int i201 = (i200 & 57) + (i200 | 57);
            a = i201 % 128;
            if (i201 % 2 != 0) {
                iArr4[1] = i42;
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            iArr4[1] = i42;
        }
        x(this.al.q);
        int i202 = a;
        int i203 = i202 & 43;
        int i204 = -(-((i202 ^ 43) | i203));
        int i205 = ((i203 | i204) << 1) - (i204 ^ i203);
        b = i205 % 128;
        int i206 = i205 % 2;
    }
}
