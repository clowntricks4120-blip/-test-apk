package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p064cj.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Q {
    private static int a = 1;
    private static int b;

    public static O b(a aVar, ivas.gov.bisp.enumeration.p086i.a aVar2, u uVar) {
        double d;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 9;
        int i6 = (i4 ^ 9) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        int iCeil = aVar.c.e;
        Object obj = aVar2.c;
        int i9 = a + 77;
        b = i9 % 128;
        int i10 = i9 % 2;
        byte[][] bArrE = v.e((byte[][]) obj);
        O[] oArr = new O[bArrE.length];
        int i11 = b + 15;
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 87;
        int i15 = -(-((i12 ^ 87) | i14));
        int i16 = (i14 & i15) + (i14 | i15);
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < bArrE.length) {
            O o2 = new O(0, bArrE[i18]);
            int i19 = b;
            int i20 = (i19 & 126) + (i19 | 126);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            int i22 = i21 % 128;
            a = i22;
            int i23 = i21 % 2;
            oArr[i18] = o2;
            int i24 = i18 ^ (-19);
            int i25 = ((i18 & (-19)) | i24) << 1;
            int i26 = -i24;
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            int i28 = (i27 & 21) + (i27 | 21);
            i18 = (i28 << 1) + (i28 ^ (-1));
            int i29 = i22 & 99;
            int i30 = ((~i29) & (i22 | 99)) + (i29 << 1);
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        u.bCW bcw = new u.bCW();
        int i32 = uVar.c;
        int i33 = b;
        int i34 = (-2) - (((i33 & 58) + (i33 | 58)) ^ (-1));
        a = i34 % 128;
        int i35 = i34 % 2;
        u.bCW bcw2 = (u.bCW) bcw.e(i32);
        long j = uVar.d;
        int i36 = a;
        int i37 = ((i36 | 63) << 1) - (i36 ^ 63);
        b = i37 % 128;
        int i38 = i37 % 2;
        u.bCW bcw3 = (u.bCW) bcw2.f(j);
        int i39 = uVar.h;
        int i40 = b;
        int i41 = (i40 & 35) + (i40 | 35);
        a = i41 % 128;
        int i42 = i41 % 2;
        bcw3.h = i39;
        bcw3.g = 0;
        int i43 = b + 65;
        a = i43 % 128;
        Object obj2 = null;
        if (i43 % 2 == 0) {
            bcw3.i = uVar.i;
            int i44 = uVar.f;
            obj2.hashCode();
            throw null;
        }
        bcw3.i = uVar.i;
        int i45 = uVar.f;
        int i46 = b + 9;
        a = i46 % 128;
        int i47 = i46 % 2;
        x.bCP bcpD = bcw3.d(i45);
        int i48 = a;
        int i49 = i48 & 101;
        int i50 = ((((i48 ^ 101) | i49) << 1) - (~(-((i48 | 101) & (~i49))))) - 1;
        b = i50 % 128;
        int i51 = i50 % 2;
        while (true) {
            u uVar2 = (u) ((u.bCW) bcpD).g();
            int i52 = b;
            int i53 = i52 & 19;
            int i54 = i53 + ((i52 ^ 19) | i53);
            int i55 = i54 % 128;
            a = i55;
            int i56 = i54 % 2;
            if (iCeil <= 1) {
                O o3 = oArr[0];
                int i57 = i52 & 35;
                int i58 = -(-(i52 | 35));
                int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                a = i59 % 128;
                if (i59 % 2 != 0) {
                    return o3;
                }
                throw null;
            }
            int i60 = i55 ^ 49;
            int i61 = (i55 & 49) << 1;
            int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
            b = i62 % 128;
            int i63 = i62 % 2;
            int i64 = i55 & 83;
            int i65 = i55 | 83;
            int i66 = (i64 & i65) + (i64 | i65);
            b = i66 % 128;
            int i67 = i66 % 2;
            int i68 = 0;
            while (true) {
                d = iCeil / 2;
                if (i68 < ((int) Math.floor(d))) {
                    u.bCW bcw4 = new u.bCW();
                    int i69 = uVar2.c;
                    int i70 = a;
                    int i71 = i70 ^ 77;
                    int i72 = ((((i70 & 77) | i71) << 1) - (~(-i71))) - 1;
                    b = i72 % 128;
                    if (i72 % 2 != 0) {
                        long j2 = uVar2.d;
                        throw null;
                    }
                    u.bCW bcw5 = (u.bCW) bcw4.e(i69);
                    long j3 = uVar2.d;
                    int i73 = b;
                    int i74 = i73 & 81;
                    int i75 = -(-(i73 | 81));
                    int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                    a = i76 % 128;
                    if (i76 % 2 == 0) {
                        ((u.bCW) bcw5.f(j3)).h = uVar2.h;
                        throw null;
                    }
                    u.bCW bcw6 = (u.bCW) bcw5.f(j3);
                    bcw6.h = uVar2.h;
                    bcw6.g = uVar2.g;
                    bcw6.i = i68;
                    int i77 = a;
                    int i78 = (i77 | 55) << 1;
                    int i79 = -(i77 ^ 55);
                    int i80 = (i78 & i79) + (i79 | i78);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                    x xVarG = ((u.bCW) bcw6.d(uVar2.f)).g();
                    int i82 = b;
                    int i83 = i82 & 41;
                    int i84 = -(-((i82 ^ 41) | i83));
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    int i86 = i85 % 128;
                    a = i86;
                    if (i85 % 2 == 0) {
                        uVar2 = (u) xVarG;
                        i = i68 % 2;
                    } else {
                        uVar2 = (u) xVarG;
                        i = i68 * 2;
                    }
                    int i87 = (i86 & (-48)) | ((~i86) & 47);
                    int i88 = (i86 & 47) << 1;
                    int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                    b = i89 % 128;
                    if (i89 % 2 != 0) {
                        oArr[i68] = c(aVar, oArr[i], oArr[i], uVar2);
                        i2 = ((i68 | 63) << 1) - (i68 ^ 63);
                    } else {
                        oArr[i68] = c(aVar, oArr[i], oArr[((i & 2) + (i | 2)) - 1], uVar2);
                        i2 = (i68 & 1) + (i68 | 1);
                    }
                    i68 = i2;
                    int i90 = b + 121;
                    a = i90 % 128;
                    int i91 = i90 % 2;
                }
            }
            if (iCeil % 2 == 1) {
                int i92 = b;
                int i93 = (i92 & 118) + (i92 | 118);
                int i94 = (i93 ^ (-1)) + (i93 << 1);
                a = i94 % 128;
                if (i94 % 2 == 0) {
                    oArr[(int) Math.floor(d)] = oArr[(-2) - (((iCeil << 1) - iCeil) ^ (-1))];
                } else {
                    int i95 = iCeil ^ (-1);
                    oArr[(int) Math.floor(d)] = oArr[(((i95 | iCeil) << 1) - (~(-i95))) - 1];
                }
                int i96 = b + 53;
                a = i96 % 128;
                int i97 = i96 % 2;
            }
            iCeil = (int) Math.ceil(((double) iCeil) / 2.0d);
            u.bCW bcw7 = new u.bCW();
            int i98 = b + 87;
            a = i98 % 128;
            if (i98 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            u.bCW bcw8 = (u.bCW) bcw7.e(uVar2.c);
            int i99 = a;
            int i100 = i99 & 3;
            int i101 = ((i99 ^ 3) | i100) << 1;
            int i102 = -((i99 | 3) & (~i100));
            int i103 = (i101 & i102) + (i102 | i101);
            b = i103 % 128;
            int i104 = i103 % 2;
            u.bCW bcw9 = (u.bCW) bcw8.f(uVar2.d);
            int i105 = b;
            int i106 = i105 & 67;
            int i107 = -(-((i105 ^ 67) | i106));
            int i108 = (i106 & i107) + (i107 | i106);
            a = i108 % 128;
            int i109 = i108 % 2;
            bcw9.h = uVar2.h;
            int i110 = b;
            int i111 = i110 ^ 11;
            int i112 = (i110 & 11) << 1;
            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
            a = i113 % 128;
            int i114 = i113 % 2;
            bcw9.g = uVar2.g + 1;
            int i115 = b;
            int i116 = i115 & 27;
            int i117 = ((i115 ^ 27) | i116) << 1;
            int i118 = -((i115 | 27) & (~i116));
            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
            a = i119 % 128;
            if (i119 % 2 == 0) {
                bcw9.i = uVar2.i;
                int i120 = uVar2.f;
                throw null;
            }
            bcw9.i = uVar2.i;
            bcpD = bcw9.d(uVar2.f);
            int i121 = a;
            int i122 = i121 & 95;
            int i123 = -(-((i121 ^ 95) | i122));
            int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
            b = i124 % 128;
            int i125 = i124 % 2;
        }
    }

    public static O c(a aVar, O o2, O o3, x xVar) {
        C0239t.bCQ bcq;
        long j;
        x.bCP bcpE;
        int i;
        int i2;
        x xVar2 = xVar;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 ^ 27) | (i4 & 27)) << 1;
        int i6 = -(((~i4) & 27) | (i4 & (-28)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            Objects.requireNonNull(o2, "left == null");
            Objects.requireNonNull(o3, "right == null");
            int i8 = 87 / 0;
        } else {
            Objects.requireNonNull(o2, "left == null");
            Objects.requireNonNull(o3, "right == null");
        }
        if (o2.c != o3.c) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        int i9 = a;
        int i10 = i9 & 109;
        int i11 = i10 + ((i9 ^ 109) | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArrC = j.c(aVar.f);
        Object obj = null;
        if (xVar2 instanceof u) {
            u uVar = (u) xVar2;
            u.bCW bcw = new u.bCW();
            int i13 = b;
            int i14 = i13 ^ 13;
            int i15 = -(-((i13 & 13) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            u.bCW bcw2 = (u.bCW) bcw.e(uVar.c);
            int i18 = a;
            int i19 = (((i18 | 6) << 1) - (i18 ^ 6)) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            x.bCP bcpF = bcw2.f(uVar.d);
            int i21 = b + 5;
            a = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = uVar.h;
                throw null;
            }
            u.bCW bcw3 = (u.bCW) bcpF;
            bcw3.h = uVar.h;
            bcw3.g = uVar.g;
            int i23 = a;
            int i24 = (i23 ^ 71) + ((i23 & 71) << 1);
            b = i24 % 128;
            if (i24 % 2 != 0) {
                bcw3.i = uVar.i;
                throw null;
            }
            bcw3.i = uVar.i;
            xVar2 = (u) ((u.bCW) bcw3.d(0)).g();
            int i25 = b + 85;
            a = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 5 / 3;
            }
        } else if (xVar2 instanceof C0239t) {
            C0239t c0239t = (C0239t) xVar2;
            C0239t.bCQ bcq2 = new C0239t.bCQ();
            int i27 = c0239t.c;
            int i28 = a;
            int i29 = i28 & 9;
            int i30 = -(-((i28 ^ 9) | i29));
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            b = i31 % 128;
            if (i31 % 2 != 0) {
                bcq = (C0239t.bCQ) bcq2.e(i27);
                j = c0239t.d;
                int i32 = 23 / 0;
            } else {
                bcq = (C0239t.bCQ) bcq2.e(i27);
                j = c0239t.d;
            }
            int i33 = b;
            int i34 = i33 & 97;
            int i35 = (((~i34) & (i33 | 97)) - (~(i34 << 1))) - 1;
            a = i35 % 128;
            if (i35 % 2 == 0) {
                int i36 = c0239t.h;
                throw null;
            }
            C0239t.bCQ bcq3 = (C0239t.bCQ) bcq.f(j);
            bcq3.h = c0239t.h;
            int i37 = c0239t.g;
            int i38 = b;
            int i39 = ((i38 ^ 43) | (i38 & 43)) << 1;
            int i40 = -(((~i38) & 43) | (i38 & (-44)));
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            a = i41 % 128;
            if (i41 % 2 == 0) {
                bcq3.g = i37;
            } else {
                bcq3.g = i37;
            }
            x xVarG = ((C0239t.bCQ) bcq3.d(0)).g();
            int i42 = a;
            int i43 = (-2) - (((i42 ^ 68) + ((i42 & 68) << 1)) ^ (-1));
            int i44 = i43 % 128;
            b = i44;
            int i45 = i43 % 2;
            xVar2 = (C0239t) xVarG;
            int i46 = (((i44 & (-118)) | ((~i44) & 117)) - (~((i44 & 117) << 1))) - 1;
            a = i46 % 128;
            int i47 = i46 % 2;
        }
        ivas.gov.bisp.enumeration.p010aj.S s = aVar.d;
        byte[] bArrC2 = xVar2.c();
        int i48 = b + 55;
        a = i48 % 128;
        if (i48 % 2 == 0) {
            s.d(bArrC, bArrC2);
            boolean z = xVar2 instanceof u;
            obj.hashCode();
            throw null;
        }
        byte[] bArrD = s.d(bArrC, bArrC2);
        if (xVar2 instanceof u) {
            u uVar2 = (u) xVar2;
            u.bCW bcw4 = new u.bCW();
            int i49 = a;
            int i50 = ((i49 ^ 94) + ((i49 & 94) << 1)) - 1;
            b = i50 % 128;
            int i51 = i50 % 2;
            u.bCW bcw5 = (u.bCW) bcw4.e(uVar2.c);
            int i52 = a;
            int i53 = (i52 & (-20)) | ((~i52) & 19);
            int i54 = (i52 & 19) << 1;
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            b = i55 % 128;
            int i56 = i55 % 2;
            u.bCW bcw6 = (u.bCW) bcw5.f(uVar2.d);
            int i57 = a;
            int i58 = ((i57 ^ 92) + ((i57 & 92) << 1)) - 1;
            b = i58 % 128;
            if (i58 % 2 != 0) {
                bcw6.h = uVar2.h;
                obj.hashCode();
                throw null;
            }
            bcw6.h = uVar2.h;
            bcw6.g = uVar2.g;
            int i59 = uVar2.i;
            int i60 = a;
            int i61 = i60 & 61;
            int i62 = (i60 ^ 61) | i61;
            int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
            b = i63 % 128;
            int i64 = i63 % 2;
            bcw6.i = i59;
            u.bCW bcw7 = (u.bCW) bcw6.d(1);
            int i65 = b + 15;
            a = i65 % 128;
            if (i65 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            xVar2 = (u) bcw7.g();
        } else if (xVar2 instanceof C0239t) {
            C0239t c0239t2 = (C0239t) xVar2;
            C0239t.bCQ bcq4 = new C0239t.bCQ();
            int i66 = b;
            int i67 = (i66 | 117) << 1;
            int i68 = -((117 & (~i66)) | (i66 & (-118)));
            int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
            a = i69 % 128;
            if (i69 % 2 == 0) {
                bcpE = bcq4.e(c0239t2.c);
                int i70 = 34 / 0;
            } else {
                bcpE = bcq4.e(c0239t2.c);
            }
            C0239t.bCQ bcq5 = (C0239t.bCQ) bcpE;
            long j2 = c0239t2.d;
            int i71 = b + 85;
            a = i71 % 128;
            if (i71 % 2 == 0) {
                int i72 = c0239t2.h;
                obj.hashCode();
                throw null;
            }
            C0239t.bCQ bcq6 = (C0239t.bCQ) bcq5.f(j2);
            int i73 = c0239t2.h;
            int i74 = b;
            int i75 = (i74 & 17) + (i74 | 17);
            a = i75 % 128;
            int i76 = i75 % 2;
            bcq6.h = i73;
            int i77 = c0239t2.g;
            int i78 = b;
            int i79 = (i78 ^ 67) + ((i78 & 67) << 1);
            a = i79 % 128;
            int i80 = i79 % 2;
            bcq6.g = i77;
            x.bCP bcpD = bcq6.d(1);
            int i81 = a;
            int i82 = i81 & 53;
            int i83 = -(-((i81 ^ 53) | i82));
            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
            b = i84 % 128;
            if (i84 % 2 != 0) {
                throw null;
            }
            xVar2 = (C0239t) ((C0239t.bCQ) bcpD).g();
        }
        byte[] bArrD2 = aVar.d.d(bArrC, xVar2.c());
        int i85 = a + 75;
        b = i85 % 128;
        if (i85 % 2 != 0) {
            boolean z2 = xVar2 instanceof u;
            obj.hashCode();
            throw null;
        }
        if (xVar2 instanceof u) {
            u uVar3 = (u) xVar2;
            u.bCW bcw8 = new u.bCW();
            int i86 = b;
            int i87 = i86 & 13;
            int i88 = (i86 | 13) & (~i87);
            int i89 = -(-(i87 << 1));
            int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
            a = i90 % 128;
            if (i90 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            u.bCW bcw9 = (u.bCW) bcw8.e(uVar3.c);
            int i91 = b + 57;
            a = i91 % 128;
            if (i91 % 2 == 0) {
                bcw9.f(uVar3.d);
                obj.hashCode();
                throw null;
            }
            u.bCW bcw10 = (u.bCW) bcw9.f(uVar3.d);
            int i92 = uVar3.h;
            int i93 = a;
            int i94 = i93 & 49;
            int i95 = (i93 | 49) & (~i94);
            int i96 = -(-(i94 << 1));
            int i97 = (i95 & i96) + (i95 | i96);
            b = i97 % 128;
            int i98 = i97 % 2;
            bcw10.h = i92;
            bcw10.g = uVar3.g;
            int i99 = a;
            int i100 = ((i99 | 113) << 1) - (i99 ^ 113);
            b = i100 % 128;
            int i101 = i100 % 2;
            bcw10.i = uVar3.i;
            int i102 = b;
            int i103 = (((i102 | 110) << 1) - (i102 ^ 110)) - 1;
            a = i103 % 128;
            int i104 = i103 % 2;
            xVar2 = (u) ((u.bCW) bcw10.d(2)).g();
            int i105 = b;
            int i106 = i105 & 63;
            int i107 = (i105 ^ 63) | i106;
            int i108 = (i106 & i107) + (i107 | i106);
            a = i108 % 128;
            int i109 = i108 % 2;
        } else if (xVar2 instanceof C0239t) {
            C0239t c0239t3 = (C0239t) xVar2;
            C0239t.bCQ bcq7 = new C0239t.bCQ();
            int i110 = a;
            int i111 = i110 & 25;
            int i112 = ((i110 | 25) & (~i111)) + (i111 << 1);
            b = i112 % 128;
            int i113 = i112 % 2;
            C0239t.bCQ bcq8 = (C0239t.bCQ) bcq7.e(c0239t3.c);
            int i114 = b;
            int i115 = ((i114 & 91) - (~(i114 | 91))) - 1;
            a = i115 % 128;
            if (i115 % 2 == 0) {
                bcq8.f(c0239t3.d);
                obj.hashCode();
                throw null;
            }
            x.bCP bcpF2 = bcq8.f(c0239t3.d);
            int i116 = a;
            int i117 = ((i116 ^ 67) | (i116 & 67)) << 1;
            int i118 = -(((~i116) & 67) | (i116 & (-68)));
            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
            b = i119 % 128;
            int i120 = i119 % 2;
            C0239t.bCQ bcq9 = (C0239t.bCQ) bcpF2;
            int i121 = c0239t3.h;
            int i122 = a;
            int i123 = ((i122 ^ 65) | (i122 & 65)) << 1;
            int i124 = -((65 & (~i122)) | (i122 & (-66)));
            int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
            b = i125 % 128;
            if (i125 % 2 != 0) {
                bcq9.h = i121;
                bcq9.g = c0239t3.g;
                obj.hashCode();
                throw null;
            }
            bcq9.h = i121;
            bcq9.g = c0239t3.g;
            int i126 = a;
            int i127 = i126 & 25;
            int i128 = (i126 | 25) & (~i127);
            int i129 = -(-(i127 << 1));
            int i130 = (i128 & i129) + (i128 | i129);
            b = i130 % 128;
            xVar2 = (C0239t) (i130 % 2 != 0 ? ((C0239t.bCQ) bcq9.d(3)).g() : ((C0239t.bCQ) bcq9.d(2)).g());
            int i131 = b + 33;
            a = i131 % 128;
            if (i131 % 2 == 0) {
                int i132 = 4 / 3;
            }
        }
        byte[] bArrD3 = aVar.d.d(bArrC, xVar2.c());
        int i133 = b;
        int i134 = (i133 ^ 27) + ((i133 & 27) << 1);
        a = i134 % 128;
        if (i134 % 2 == 0) {
            i = aVar.c.c;
            i2 = i % 3;
        } else {
            i = aVar.c.c;
            i2 = i * 2;
        }
        byte[] bArr = new byte[i2];
        int i135 = b;
        int i136 = (-2) - (((i135 & 70) + (i135 | 70)) ^ (-1));
        a = i136 % 128;
        if (i136 % 2 == 0) {
            int i137 = 4 / 3;
        }
        int i138 = 0;
        while (i138 < i) {
            int i139 = a;
            int i140 = (i139 ^ 5) + ((i139 & 5) << 1);
            b = i140 % 128;
            if (i140 % 2 != 0) {
                byte b2 = o2.c()[i138];
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            byte b3 = o2.c()[i138];
            byte b4 = bArrD2[i138];
            int i141 = b3 & b4;
            bArr[i138] = (byte) ((i141 | (b3 ^ b4)) & (~i141));
            int i142 = i138 & 6;
            int i143 = -(-((i138 ^ 6) | i142));
            int i144 = ((i142 | i143) << 1) - (i142 ^ i143);
            int i145 = i144 ^ (-5);
            int i146 = -(-((i144 & (-5)) << 1));
            i138 = (i145 & i146) + (i145 | i146);
            int i147 = a + 39;
            b = i147 % 128;
            int i148 = i147 % 2;
        }
        int i149 = 0;
        while (i149 < i) {
            int i150 = a;
            int i151 = i150 & 23;
            int i152 = ((i150 ^ 23) | i151) << 1;
            int i153 = -((i150 | 23) & (~i151));
            int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
            b = i154 % 128;
            int i155 = i154 % 2;
            int i156 = (i149 - (~(-(-i)))) - 1;
            byte[] bArrC3 = o3.c();
            int i157 = b;
            int i158 = (i157 ^ 67) + ((i157 & 67) << 1);
            a = i158 % 128;
            if (i158 % 2 == 0) {
                byte b5 = bArrC3[i149];
                byte b6 = bArrD3[i149];
                bArr[i156] = (byte) ((b5 | b6) & (~(b5 & b6)));
                int i159 = i149 & 45;
                int i160 = -(-((i149 ^ 45) | i159));
                int i161 = (i159 ^ i160) + ((i159 & i160) << 1);
                i149 = ((i161 & 71) - (~(i161 | 71))) - 1;
            } else {
                byte b7 = bArrC3[i149];
                byte b8 = bArrD3[i149];
                bArr[i156] = (byte) ((b7 | b8) & (~(b7 & b8)));
                int i162 = (-2) - ((((i149 | 75) << 1) - (i149 ^ 75)) ^ (-1));
                int i163 = i162 & (-73);
                int i164 = ((i162 ^ (-73)) | i163) << 1;
                int i165 = -((i162 | (-73)) & (~i163));
                i149 = (i164 & i165) + (i165 | i164);
            }
        }
        ivas.gov.bisp.enumeration.p010aj.S s2 = aVar.d;
        Objects.requireNonNull(s2);
        int length = bArrD.length;
        int i166 = a;
        int i167 = (i166 & (-102)) | ((~i166) & 101);
        int i168 = -(-((i166 & 101) << 1));
        int i169 = (i167 & i168) + (i168 | i167);
        b = i169 % 128;
        int i170 = i169 % 2;
        int i171 = s2.c;
        if (length != i171) {
            throw new IllegalArgumentException("wrong key length");
        }
        int i172 = b;
        int i173 = i172 ^ 49;
        int i174 = ((i172 & 49) | i173) << 1;
        int i175 = -i173;
        int i176 = ((i174 | i175) << 1) - (i174 ^ i175);
        int i177 = i176 % 128;
        a = i177;
        int i178 = i176 % 2;
        if (i2 != i171 * 2) {
            throw new IllegalArgumentException("wrong in length");
        }
        int i179 = i177 + 33;
        b = i179 % 128;
        int i180 = i179 % 2;
        O o4 = new O(o2.c, s2.f(1, bArrD, bArr));
        int i181 = (-2) - ((b + 56) ^ (-1));
        a = i181 % 128;
        if (i181 % 2 != 0) {
            return o4;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
