package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cS.AbstractC0255p;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0255p {
    private static int a = 0;
    private static int b = 1;
    public final h f;
    public final int g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(h hVar) {
        super(AbstractC0246t.c, hVar.bB());
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        this.f = hVar;
        this.h = 12;
        this.g = 2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final /* bridge */ /* synthetic */ int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 19) | (i2 & 19)) << 1;
        int i4 = -(((~i2) & 19) | (i2 & (-20)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = (i6 ^ 72) + ((i6 & 72) << 1);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return 1;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (i3 - (~((i2 ^ 65) | i3))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = this.h;
        int i8 = i5 & 51;
        int i9 = (i5 | 51) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        return i7;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long t(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = (((i2 | 11) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        return i4 % 2 == 0 ? j % y(j) : j - y(j);
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final /* bridge */ /* synthetic */ boolean w() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 4) + ((i2 & 4) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 43;
        int i7 = -(-((i2 ^ 43) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-106)) | ((~i2) & 105)) - (~(-(-((i2 & 105) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f;
        int iBK = hVar.bK(j, hVar.bU(j));
        int i5 = a;
        int i6 = i5 & 35;
        int i7 = (i5 | 35) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 69 / 0;
        }
        return iBK;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final String g(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 12) + (i3 | 12)) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        String str = C0250o.d(locale).j[i];
        int i6 = a;
        int i7 = i6 & 101;
        int i8 = ((i6 ^ 101) | i7) << 1;
        int i9 = -((i6 | 101) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final String j(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 1;
        int i5 = (((i3 & 1) | i4) << 1) - i4;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return C0250o.d(locale).h[i];
        }
        String str = C0250o.d(locale).h[i];
        int i6 = 89 / 0;
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 101) << 1) - (~(-(i2 ^ 101)))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f.k;
        }
        int i4 = 60 / 0;
        return this.f.k;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final int p(Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 40) + (i2 | 40)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = C0250o.d(locale).f84o;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = C0250o.d(locale).f84o;
        int i6 = a;
        int i7 = i6 | 121;
        int i8 = i7 << 1;
        int i9 = -((~(i6 & 121)) & i7);
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return i5;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 49;
        int i4 = (i2 & 49) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.f.n;
        }
        ivas.gov.bisp.enumeration.cP.J j = this.f.n;
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f.bU(j);
            obj.hashCode();
            throw null;
        }
        int iBU = this.f.bU(j);
        int iBK = this.f.bK(j, iBU);
        h hVar = this.f;
        int i4 = (-2) - ((b + 30) ^ (-1));
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return hVar.cb(iBU, iBK);
        }
        hVar.cb(iBU, iBK);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006f A[PHI: r12 r13
  0x006f: PHI (r12v10 int) = (r12v9 int), (r12v31 int) binds: [B:11:0x006d, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r13v9 int) = (r13v8 int), (r13v44 int) binds: [B:11:0x006d, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x007f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:25:0x014f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0179  */
    /* JADX WARN: Code duplicated, block: B:28:0x0181  */
    /* JADX WARN: Code duplicated, block: B:29:0x0186  */
    /* JADX WARN: Code duplicated, block: B:31:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:40:0x020c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0210  */
    /* JADX WARN: Code duplicated, block: B:45:0x0227  */
    /* JADX WARN: Code duplicated, block: B:47:0x022f  */
    /* JADX WARN: Code duplicated, block: B:49:0x023f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0241  */
    /* JADX WARN: Code duplicated, block: B:54:0x025d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0261  */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long d(long j, int i) {
        int i2;
        int i3;
        int i4;
        float f;
        float fSignum;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iCa;
        int i17;
        int iBI;
        int i18;
        int i19;
        int i20;
        int i21;
        long jBW = j;
        int i22 = 2 % 2;
        int i23 = b;
        int i24 = ((i23 & 81) - (~(-(-(i23 | 81))))) - 1;
        a = i24 % 128;
        if (i24 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            long jBM = this.f.bM(jBW);
            h hVar = this.f;
            int i25 = a;
            int i26 = i25 & 43;
            int i27 = (i25 ^ 43) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            b = i28 % 128;
            int i29 = i28 % 2;
            int iBU = hVar.bU(jBW);
            int iBK = this.f.bK(jBW, iBU);
            int i30 = b;
            int i31 = i30 + 106;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                i2 = iBK >>> 1;
                i3 = (i2 ^ i) + ((i2 & i) << 1);
                if (iBK > 0) {
                    int i33 = (i30 & 18) + (i30 | 18);
                    int i34 = (i33 ^ (-1)) + (i33 << 1);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    if (i3 < 0) {
                        i4 = i30 + 93;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            f = this.h << i;
                        } else {
                            int i36 = this.h;
                            int i37 = ((i36 ^ i) | (i36 & i)) << 1;
                            int i38 = -(((~i36) & i) | ((~i) & i36));
                            f = (i37 & i38) + (i38 | i37);
                        }
                        fSignum = Math.signum(f);
                        int i39 = b;
                        int i40 = (i39 & 121) + (i39 | 121);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                        if (fSignum == Math.signum(i)) {
                            int i42 = a;
                            int i43 = i42 & 69;
                            int i44 = -(-((i42 ^ 69) | i43));
                            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                            int i46 = i45 % 128;
                            b = i46;
                            int i47 = i45 % 2;
                            int i48 = (iBU ^ (-1)) | iBU;
                            i5 = (iBU ^ i48) + ((i48 & iBU) << 1);
                            int i49 = -(-this.h);
                            int i50 = i & i49;
                            int i51 = -(-((i ^ i49) | i50));
                            i6 = (i50 & i51) + (i51 | i50);
                            int i52 = i46 + 77;
                            a = i52 % 128;
                            int i53 = i52 % 2;
                            int i54 = i46 & 79;
                            int i55 = (i46 ^ 79) | i54;
                            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                            a = i56 % 128;
                            int i57 = i56 % 2;
                        } else {
                            int i58 = iBU | 1;
                            i5 = ((i58 << 1) - (~(-(i58 & (~(iBU & 1)))))) - 1;
                            int i59 = this.h;
                            int i60 = a;
                            int i61 = (i60 ^ 17) + ((i60 & 17) << 1);
                            int i62 = i61 % 128;
                            b = i62;
                            int i63 = i61 % 2;
                            int i64 = -i59;
                            int i65 = ((i | i64) << 1) - (i ^ i64);
                            int i66 = ((i62 | 113) << 1) - (i62 ^ 113);
                            a = i66 % 128;
                            int i67 = i66 % 2;
                            i6 = i65;
                        }
                        i3 = i6 + i2;
                        int i68 = a;
                        int i69 = ((i68 ^ 115) - (~(-(-((i68 & 115) << 1))))) - 1;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                    }
                }
                if (i3 >= 0) {
                    int i71 = a;
                    int i72 = i71 & 1;
                    int i73 = (i71 ^ 1) | i72;
                    int i74 = (i72 & i73) + (i73 | i72);
                    int i75 = i74 % 128;
                    b = i75;
                    int i76 = i74 % 2;
                    i20 = this.h;
                    int i77 = i3 / i20;
                    int i78 = -(-i5);
                    int i79 = i77 & i78;
                    int i80 = (~i79) & (i77 | i78);
                    int i81 = i79 << 1;
                    i7 = (i80 ^ i81) + ((i80 & i81) << 1);
                    i21 = i75 + 83;
                    a = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i82 = -i20;
                        i11 = (i3 ^ i82) + ((i82 & i3) << 1);
                    } else {
                        i11 = (i3 % i20) + 1;
                    }
                } else {
                    int i83 = i3 / this.h;
                    int i84 = -(~(-(-i5)));
                    int i85 = ((i83 ^ i84) + ((i83 & i84) << 1)) - 1;
                    i7 = ((i85 ^ (-1)) - (~(-(-(i85 << 1))))) - 1;
                    int iAbs = Math.abs(i3);
                    i8 = b;
                    int i86 = i8 ^ 87;
                    int i87 = ((((i8 & 87) | i86) << 1) - (~(-i86))) - 1;
                    a = i87 % 128;
                    int i88 = i87 % 2;
                    i9 = this.h;
                    i10 = iAbs % i9;
                    if (i10 == 0) {
                        int i89 = i8 & 71;
                        int i90 = (i8 | 71) & (~i89);
                        int i91 = -(-(i89 << 1));
                        i15 = (i90 & i91) + (i91 | i90);
                        i16 = i15 % 128;
                        a = i16;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        int i92 = i16 + 45;
                        b = i92 % 128;
                        int i93 = i92 % 2;
                        i10 = i9;
                    }
                    int i94 = -i10;
                    int i95 = (i9 ^ i94) + ((i94 & i9) << 1);
                    int i96 = i95 ^ 1;
                    int i97 = (i95 & 1) << 1;
                    i11 = ((i96 | i97) << 1) - (i96 ^ i97);
                    i12 = b;
                    int i98 = ((i12 | 13) << 1) - (i12 ^ 13);
                    a = i98 % 128;
                    int i99 = i98 % 2;
                    if (i11 == 1) {
                        i13 = (((i12 & (-64)) | ((~i12) & 63)) - (~(-(-((i12 & 63) << 1))))) - 1;
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            i14 = -(-i7);
                        } else {
                            i14 = (i7 & 1) + (i7 | 1);
                        }
                        i7 = i14;
                    }
                }
                iCa = this.f.ca(jBW, iBU, iBK);
                i17 = b + 55;
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    this.f.bI(i7, i11);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                iBI = this.f.bI(i7, i11);
                if (iCa > iBI) {
                    int i100 = b;
                    i19 = ((i100 ^ 114) + ((i100 & 114) << 1)) - 1;
                    a = i19 % 128;
                    if (i19 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    iCa = iBI;
                }
                jBW = this.f.bW(i7, i11, iCa) + jBM;
                int i101 = a;
                i18 = ((i101 ^ 122) + ((i101 & 122) << 1)) - 1;
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    int i102 = 3 % 5;
                }
            } else {
                i2 = (-3) - (~(-(~iBK)));
                int i103 = ((~i) & i2) | ((~i2) & i);
                int i104 = (i2 & i) << 1;
                i3 = ((i103 & i104) << 1) + (i103 ^ i104);
                if (iBK > 0) {
                    int i310 = (i30 & 18) + (i30 | 18);
                    int i311 = (i310 ^ (-1)) + (i310 << 1);
                    a = i311 % 128;
                    int i312 = i311 % 2;
                    if (i3 < 0) {
                        i4 = i30 + 93;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            f = this.h << i;
                        } else {
                            int i313 = this.h;
                            int i314 = ((i313 ^ i) | (i313 & i)) << 1;
                            int i315 = -(((~i313) & i) | ((~i) & i313));
                            f = (i314 & i315) + (i315 | i314);
                        }
                        fSignum = Math.signum(f);
                        int i316 = b;
                        int i410 = (i316 & 121) + (i316 | 121);
                        a = i410 % 128;
                        int i411 = i410 % 2;
                        if (fSignum == Math.signum(i)) {
                            int i412 = a;
                            int i413 = i412 & 69;
                            int i414 = -(-((i412 ^ 69) | i413));
                            int i415 = ((i413 | i414) << 1) - (i414 ^ i413);
                            int i416 = i415 % 128;
                            b = i416;
                            int i417 = i415 % 2;
                            int i418 = (iBU ^ (-1)) | iBU;
                            i5 = (iBU ^ i418) + ((i418 & iBU) << 1);
                            int i419 = -(-this.h);
                            int i510 = i & i419;
                            int i511 = -(-((i ^ i419) | i510));
                            i6 = (i510 & i511) + (i511 | i510);
                            int i512 = i416 + 77;
                            a = i512 % 128;
                            int i513 = i512 % 2;
                            int i514 = i416 & 79;
                            int i515 = (i416 ^ 79) | i514;
                            int i516 = ((i514 | i515) << 1) - (i514 ^ i515);
                            a = i516 % 128;
                            int i517 = i516 % 2;
                        } else {
                            int i518 = iBU | 1;
                            i5 = ((i518 << 1) - (~(-(i518 & (~(iBU & 1)))))) - 1;
                            int i519 = this.h;
                            int i610 = a;
                            int i611 = (i610 ^ 17) + ((i610 & 17) << 1);
                            int i612 = i611 % 128;
                            b = i612;
                            int i613 = i611 % 2;
                            int i614 = -i519;
                            int i615 = ((i | i614) << 1) - (i ^ i614);
                            int i616 = ((i612 | 113) << 1) - (i612 ^ 113);
                            a = i616 % 128;
                            int i617 = i616 % 2;
                            i6 = i615;
                        }
                        i3 = i6 + i2;
                        int i618 = a;
                        int i619 = ((i618 ^ 115) - (~(-(-((i618 & 115) << 1))))) - 1;
                        b = i619 % 128;
                        int i710 = i619 % 2;
                    }
                }
                if (i3 >= 0) {
                    int i711 = a;
                    int i712 = i711 & 1;
                    int i713 = (i711 ^ 1) | i712;
                    int i714 = (i712 & i713) + (i713 | i712);
                    int i715 = i714 % 128;
                    b = i715;
                    int i716 = i714 % 2;
                    i20 = this.h;
                    int i717 = i3 / i20;
                    int i718 = -(-i5);
                    int i719 = i717 & i718;
                    int i810 = (~i719) & (i717 | i718);
                    int i811 = i719 << 1;
                    i7 = (i810 ^ i811) + ((i810 & i811) << 1);
                    i21 = i715 + 83;
                    a = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i812 = -i20;
                        i11 = (i3 ^ i812) + ((i812 & i3) << 1);
                    } else {
                        i11 = (i3 % i20) + 1;
                    }
                } else {
                    int i813 = i3 / this.h;
                    int i814 = -(~(-(-i5)));
                    int i815 = ((i813 ^ i814) + ((i813 & i814) << 1)) - 1;
                    i7 = ((i815 ^ (-1)) - (~(-(-(i815 << 1))))) - 1;
                    int iAbs2 = Math.abs(i3);
                    i8 = b;
                    int i816 = i8 ^ 87;
                    int i817 = ((((i8 & 87) | i816) << 1) - (~(-i816))) - 1;
                    a = i817 % 128;
                    int i818 = i817 % 2;
                    i9 = this.h;
                    i10 = iAbs2 % i9;
                    if (i10 == 0) {
                        int i819 = i8 & 71;
                        int i910 = (i8 | 71) & (~i819);
                        int i911 = -(-(i819 << 1));
                        i15 = (i910 & i911) + (i911 | i910);
                        i16 = i15 % 128;
                        a = i16;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        int i912 = i16 + 45;
                        b = i912 % 128;
                        int i913 = i912 % 2;
                        i10 = i9;
                    }
                    int i914 = -i10;
                    int i915 = (i9 ^ i914) + ((i914 & i9) << 1);
                    int i916 = i915 ^ 1;
                    int i917 = (i915 & 1) << 1;
                    i11 = ((i916 | i917) << 1) - (i916 ^ i917);
                    i12 = b;
                    int i918 = ((i12 | 13) << 1) - (i12 ^ 13);
                    a = i918 % 128;
                    int i919 = i918 % 2;
                    if (i11 == 1) {
                        i13 = (((i12 & (-64)) | ((~i12) & 63)) - (~(-(-((i12 & 63) << 1))))) - 1;
                        a = i13 % 128;
                        if (i13 % 2 != 0) {
                            i14 = -(-i7);
                        } else {
                            i14 = (i7 & 1) + (i7 | 1);
                        }
                        i7 = i14;
                    }
                }
                iCa = this.f.ca(jBW, iBU, iBK);
                i17 = b + 55;
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    this.f.bI(i7, i11);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                iBI = this.f.bI(i7, i11);
                if (iCa > iBI) {
                    int i105 = b;
                    i19 = ((i105 ^ 114) + ((i105 & 114) << 1)) - 1;
                    a = i19 % 128;
                    if (i19 % 2 != 0) {
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    iCa = iBI;
                }
                jBW = this.f.bW(i7, i11, iCa) + jBM;
                int i106 = a;
                i18 = ((i106 ^ 122) + ((i106 & 122) << 1)) - 1;
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    int i107 = 3 % 5;
                }
            }
            int i108 = a;
            int i109 = ((i108 | 70) << 1) - (i108 ^ 70);
            int i110 = (i109 ^ (-1)) + (i109 << 1);
            b = i110 % 128;
            int i111 = i110 % 2;
            i5 = iBU;
            if (i3 >= 0) {
                int i7110 = a;
                int i7111 = i7110 & 1;
                int i7112 = (i7110 ^ 1) | i7111;
                int i7113 = (i7111 & i7112) + (i7112 | i7111);
                int i7114 = i7113 % 128;
                b = i7114;
                int i7115 = i7113 % 2;
                i20 = this.h;
                int i7116 = i3 / i20;
                int i7117 = -(-i5);
                int i7118 = i7116 & i7117;
                int i8110 = (~i7118) & (i7116 | i7117);
                int i8111 = i7118 << 1;
                i7 = (i8110 ^ i8111) + ((i8110 & i8111) << 1);
                i21 = i7114 + 83;
                a = i21 % 128;
                if (i21 % 2 != 0) {
                    int i8112 = -i20;
                    i11 = (i3 ^ i8112) + ((i8112 & i3) << 1);
                } else {
                    i11 = (i3 % i20) + 1;
                }
            } else {
                int i8113 = i3 / this.h;
                int i8114 = -(~(-(-i5)));
                int i8115 = ((i8113 ^ i8114) + ((i8113 & i8114) << 1)) - 1;
                i7 = ((i8115 ^ (-1)) - (~(-(-(i8115 << 1))))) - 1;
                int iAbs3 = Math.abs(i3);
                i8 = b;
                int i8116 = i8 ^ 87;
                int i8117 = ((((i8 & 87) | i8116) << 1) - (~(-i8116))) - 1;
                a = i8117 % 128;
                int i8118 = i8117 % 2;
                i9 = this.h;
                i10 = iAbs3 % i9;
                if (i10 == 0) {
                    int i8119 = i8 & 71;
                    int i9110 = (i8 | 71) & (~i8119);
                    int i9111 = -(-(i8119 << 1));
                    i15 = (i9110 & i9111) + (i9111 | i9110);
                    i16 = i15 % 128;
                    a = i16;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    int i9112 = i16 + 45;
                    b = i9112 % 128;
                    int i9113 = i9112 % 2;
                    i10 = i9;
                }
                int i9114 = -i10;
                int i9115 = (i9 ^ i9114) + ((i9114 & i9) << 1);
                int i9116 = i9115 ^ 1;
                int i9117 = (i9115 & 1) << 1;
                i11 = ((i9116 | i9117) << 1) - (i9116 ^ i9117);
                i12 = b;
                int i9118 = ((i12 | 13) << 1) - (i12 ^ 13);
                a = i9118 % 128;
                int i9119 = i9118 % 2;
                if (i11 == 1) {
                    i13 = (((i12 & (-64)) | ((~i12) & 63)) - (~(-(-((i12 & 63) << 1))))) - 1;
                    a = i13 % 128;
                    if (i13 % 2 != 0) {
                        i14 = -(-i7);
                    } else {
                        i14 = (i7 & 1) + (i7 | 1);
                    }
                    i7 = i14;
                }
            }
            iCa = this.f.ca(jBW, iBU, iBK);
            i17 = b + 55;
            a = i17 % 128;
            if (i17 % 2 != 0) {
                this.f.bI(i7, i11);
                Object obj6 = null;
                obj6.hashCode();
                throw null;
            }
            iBI = this.f.bI(i7, i11);
            if (iCa > iBI) {
                int i1010 = b;
                i19 = ((i1010 ^ 114) + ((i1010 & 114) << 1)) - 1;
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    Object obj7 = null;
                    obj7.hashCode();
                    throw null;
                }
                iCa = iBI;
            }
            jBW = this.f.bW(i7, i11, iCa) + jBM;
            int i1011 = a;
            i18 = ((i1011 ^ 122) + ((i1011 & 122) << 1)) - 1;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                int i1012 = 3 % 5;
            }
        }
        int i112 = b;
        int i113 = i112 & 13;
        int i114 = ((i112 ^ 13) | i113) << 1;
        int i115 = -((i112 | 13) & (~i113));
        int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
        a = i116 % 128;
        int i117 = i116 % 2;
        return jBW;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x01de  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a4  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e5, code lost:
    
        if (r9 <= r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01eb, code lost:
    
        if (r9 <= r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ed, code lost:
    
        r3 = (int) r9;
        r4 = (int) r12;
        r5 = r28.f;
        r6 = ((r11 ^ 57) | (r11 & 57)) << 1;
        r7 = -((r11 & (-58)) | ((~r11) & 57));
        r9 = (r6 & r7) + (r6 | r7);
        ivas.gov.bisp.enumeration.cR.J.b = r9 % 128;
        r9 = r9 % 2;
        r1 = r5.ca(r29, r8, r20);
        r2 = r28.f;
        r5 = ivas.gov.bisp.enumeration.cR.J.b;
        r6 = r5 & 93;
        r6 = r6 + ((r5 ^ 93) | r6);
        ivas.gov.bisp.enumeration.cR.J.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021f, code lost:
    
        if ((r6 % 2) != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0221, code lost:
    
        r2 = r2.bI(r3, r4);
        r5 = ivas.gov.bisp.enumeration.cR.J.a;
        r6 = r5 & 3;
        r7 = (~r6) & (r5 | 3);
        r6 = r6 << 1;
        r8 = (r7 & r6) + (r6 | r7);
        ivas.gov.bisp.enumeration.cR.J.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0239, code lost:
    
        if (r1 <= r2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023b, code lost:
    
        r1 = r5 + 99;
        ivas.gov.bisp.enumeration.cR.J.b = r1 % 128;
        r1 = r1 % 2;
        r1 = r5 & 21;
        r5 = (r5 | 21) & (~r1);
        r1 = -(-(r1 << 1));
        r6 = (r5 & r1) + (r1 | r5);
        ivas.gov.bisp.enumeration.cR.J.b = r6 % 128;
        r6 = r6 % 2;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0257, code lost:
    
        r1 = r28.f.bW(r3, r4, r1) + r22;
        r3 = ivas.gov.bisp.enumeration.cR.J.b;
        r4 = ((r3 ^ 15) | (r3 & 15)) << 1;
        r3 = -((15 & (~r3)) | (r3 & (-16)));
        r5 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.cR.J.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027b, code lost:
    
        if ((r5 % 2) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027d, code lost:
    
        r3 = 5 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029f, code lost:
    
        r2.bI(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a3, code lost:
    
        throw null;
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r29, long r31) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.J.e(long, long):long");
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final boolean u(long j) {
        int iBU;
        h hVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 65) | (i2 & 65)) << 1) - (((~i2) & 65) | (i2 & (-66)));
        a = i3 % 128;
        boolean z = false;
        if (i3 % 2 != 0) {
            iBU = this.f.bU(j);
            hVar = this.f;
            int i4 = 91 / 0;
        } else {
            iBU = this.f.bU(j);
            hVar = this.f;
        }
        if (hVar.bX(iBU)) {
            int i5 = b + 17;
            a = i5 % 128;
            if (i5 % 2 == 0 ? this.f.bK(j, iBU) == this.g : this.f.bK(j, iBU) == this.g) {
                int i6 = a + 43;
                int i7 = i6 % 128;
                b = i7;
                z = i6 % 2 != 0;
                int i8 = ((i7 | 31) << 1) - (((~i7) & 31) | (i7 & (-32)));
                a = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        int i10 = a;
        int i11 = (((i10 ^ 87) | (i10 & 87)) << 1) - (((~i10) & 87) | (i10 & (-88)));
        b = i11 % 128;
        int i12 = i11 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j
    public final int D(String str, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = i3 + ((i2 ^ 95) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            C0250o.d(locale).d.get(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = C0250o.d(locale).d.get(str);
        if (num == null) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.c, str);
        }
        int i5 = a;
        int i6 = (i5 & (-54)) | ((~i5) & 53);
        int i7 = (i5 & 53) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        int iIntValue = num.intValue();
        int i10 = a;
        int i11 = (i10 & 19) + (i10 | 19);
        b = i11 % 128;
        int i12 = i11 % 2;
        return iIntValue;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 86) + (i3 | 86)) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, this.h);
        } else {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 1, this.h);
        }
        int iBU = this.f.bU(j);
        int i5 = a;
        int i6 = ((i5 ^ 96) + ((i5 & 96) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        h hVar = this.f;
        int iBK = hVar.bK(j, iBU);
        int i8 = b;
        int i9 = i8 & 29;
        int i10 = (i9 - (~(-(-((i8 ^ 29) | i9))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            hVar.ca(j, iBU, iBK);
            throw null;
        }
        int iCa = hVar.ca(j, iBU, iBK);
        int iBI = this.f.bI(iBU, i);
        if (iCa > iBI) {
            int i11 = b;
            int i12 = i11 & 15;
            int i13 = i11 | 15;
            int i14 = (i12 & i13) + (i12 | i13);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 57 / 0;
            }
            int i16 = (((i11 & (-90)) | ((~i11) & 89)) - (~((i11 & 89) << 1))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            iCa = iBI;
        }
        long jBW = this.f.bW(iBU, i, iCa);
        int i18 = a;
        int i19 = i18 & 53;
        int i20 = (i19 - (~(-(-((i18 ^ 53) | i19))))) - 1;
        int i21 = i20 % 128;
        b = i21;
        if (i20 % 2 == 0) {
            throw null;
        }
        h hVar2 = this.f;
        int i22 = ((i21 ^ 56) + ((i21 & 56) << 1)) - 1;
        a = i22 % 128;
        long jBM = i22 % 2 != 0 ? jBW / ((long) hVar2.bM(j)) : jBW + ((long) hVar2.bM(j));
        int i23 = a;
        int i24 = i23 & 13;
        int i25 = (i23 ^ 13) | i24;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        b = i26 % 128;
        int i27 = i26 % 2;
        return jBM;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long n(long j, long j2) {
        long j3;
        h hVar;
        long jA = j2;
        int i = 2 % 2;
        int i2 = b + 27;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (j < jA) {
            j3 = -l(jA, j);
            int i3 = a;
            int i4 = i3 & 35;
            int i5 = -(-((i3 ^ 35) | i4));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int iBU = this.f.bU(j);
            h hVar2 = this.f;
            int i8 = a;
            int i9 = i8 & 9;
            int i10 = -(-((i8 ^ 9) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                hVar2.bK(j, iBU);
                this.f.bU(jA);
                obj.hashCode();
                throw null;
            }
            int iBK = hVar2.bK(j, iBU);
            int iBU2 = this.f.bU(jA);
            int i12 = b;
            int i13 = i12 ^ 37;
            int i14 = -(-((i12 & 37) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            int iBK2 = this.f.bK(jA, iBU2);
            int i17 = b;
            int i18 = i17 + 91;
            a = i18 % 128;
            int i19 = i18 % 2;
            long j4 = ((long) ((iBU - (~(-iBU2))) - 1)) * ((long) this.h);
            int i20 = i17 + 77;
            a = i20 % 128;
            long j5 = (i20 % 2 != 0 ? j4 % ((long) iBK) : j4 + ((long) iBK)) - ((long) iBK2);
            int iCa = this.f.ca(j, iBU, iBK);
            h hVar3 = this.f;
            int i21 = b;
            int i22 = i21 ^ 29;
            int i23 = (((i21 & 29) | i22) << 1) - i22;
            a = i23 % 128;
            int i24 = i23 % 2;
            if (iCa == hVar3.bI(iBU, iBK)) {
                int i25 = b;
                int i26 = i25 & 77;
                int i27 = (((i25 ^ 77) | i26) << 1) - ((~i26) & (i25 | 77));
                a = i27 % 128;
                if (i27 % 2 != 0) {
                    hVar = this.f;
                    int i28 = 53 / 0;
                } else {
                    hVar = this.f;
                }
                int i29 = i25 + 65;
                a = i29 % 128;
                int i30 = i29 % 2;
                if (hVar.ca(jA, iBU2, iBK2) > iCa) {
                    int i31 = a + 101;
                    b = i31 % 128;
                    if (i31 % 2 == 0) {
                        jA = this.f.C.A(jA, iCa);
                        int i32 = 26 / 0;
                    } else {
                        jA = this.f.C.A(jA, iCa);
                    }
                    int i33 = a;
                    int i34 = ((i33 ^ 79) | (i33 & 79)) << 1;
                    int i35 = -((i33 & (-80)) | ((~i33) & 79));
                    int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = (((i33 | 22) << 1) - (i33 ^ 22)) - 1;
                    b = i38 % 128;
                    int i39 = i38 % 2;
                }
            }
            long jCb = this.f.cb(iBU, iBK);
            h hVar4 = this.f;
            int i40 = b;
            int i41 = ((i40 ^ 42) + ((i40 & 42) << 1)) - 1;
            a = i41 % 128;
            if ((i41 % 2 != 0 ? j + jCb : j - jCb) < jA - hVar4.cb(iBU2, iBK2)) {
                int i42 = a;
                int i43 = i42 ^ 111;
                int i44 = (i42 & 111) << 1;
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                int i46 = i45 % 128;
                b = i46;
                int i47 = i45 % 2;
                j5--;
                int i48 = i46 & 69;
                int i49 = (((i46 ^ 69) | i48) << 1) - ((i46 | 69) & (~i48));
                a = i49 % 128;
                int i50 = i49 % 2;
            }
            j3 = j5;
            int i51 = b + 53;
            a = i51 % 128;
            int i52 = i51 % 2;
        }
        int i53 = a + 3;
        b = i53 % 128;
        int i54 = i53 % 2;
        return j3;
    }
}
