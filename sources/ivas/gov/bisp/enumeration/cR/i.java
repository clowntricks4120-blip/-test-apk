package ivas.gov.bisp.enumeration.cR;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h {
    private static int a = 1;
    public static final int[] ai = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] aj = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final long[] ak = new long[12];
    public static final long[] al;
    private static int b;

    public i(ivas.gov.bisp.enumeration.p096p.h hVar, Object obj, int i) {
        super(hVar, obj, i);
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public int bI(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 21;
        int i6 = -(-(i4 | 21));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            bX(i);
            throw null;
        }
        if (!bX(i)) {
            int i8 = -(-((i2 ^ (-1)) | i2));
            int i9 = ai[(i2 ^ i8) + ((i2 & i8) << 1)];
            int i10 = b;
            int i11 = i10 & 83;
            int i12 = (i10 | 83) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            return i9;
        }
        int i16 = a;
        int i17 = i16 & 121;
        int i18 = (i16 | 121) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        int[] iArr = aj;
        if (i21 != 0) {
            return iArr[i2];
        }
        int i22 = ~i2;
        int i23 = -(-(i2 << 1));
        return iArr[(i22 & i23) + (i23 | i22)];
    }

    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x017f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0194  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0218  */
    /* JADX WARN: Code duplicated, block: B:84:0x0268  */
    @Override // ivas.gov.bisp.enumeration.cR.h
    public int bK(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 74) << 1) - (i3 ^ 74)) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 10;
        int iBV = (int) ((j - bV(i)) >> 10);
        int i7 = 5;
        int i8 = a + 5;
        b = i8 % 128;
        int i9 = i8 % 2;
        if (bX(i)) {
            int i10 = a;
            int i11 = i10 & 67;
            int i12 = -(-((i10 ^ 67) | i11));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            int i14 = i13 % 128;
            b = i14;
            Object obj = null;
            if (i13 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (iBV < 15356250) {
                if (iBV < 7678125) {
                    int i15 = i14 + 103;
                    int i16 = i15 % 128;
                    a = i16;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    if (iBV < 2615625) {
                        int i17 = b + 3;
                        a = i17 % 128;
                        int i18 = i17 % 2;
                        i7 = 1;
                    } else if (iBV < 5062500) {
                        int i19 = i16 & 71;
                        int i20 = ((i16 ^ 71) | i19) << 1;
                        int i21 = -((i16 | 71) & (~i19));
                        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                        b = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i23 = 4 % 5;
                        }
                        int i24 = b;
                        int i25 = i24 | 15;
                        int i26 = ((i25 << 1) - (~(-((~(i24 & 15)) & i25)))) - 1;
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        i7 = 2;
                    } else {
                        int i28 = a;
                        int i29 = (i28 ^ 71) + ((i28 & 71) << 1);
                        b = i29 % 128;
                        int i30 = i29 % 2;
                        i7 = 3;
                    }
                } else if (iBV >= 10209375) {
                    int i31 = (((i10 | 90) << 1) - (i10 ^ 90)) - 1;
                    b = i31 % 128;
                    if (i31 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iBV < 12825000) {
                        int i32 = i10 & 123;
                        int i33 = ((i10 ^ 123) | i32) << 1;
                        int i34 = -((i10 | 123) & (~i32));
                        int i35 = (i33 & i34) + (i33 | i34);
                        b = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = a;
                        int i38 = ((i37 & 49) - (~(-(-(i37 | 49))))) - 1;
                        b = i38 % 128;
                        int i39 = i38 % 2;
                    } else {
                        int i40 = b;
                        int i41 = i40 & 125;
                        int i42 = (i40 ^ 125) | i41;
                        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        i7 = 6;
                    }
                } else {
                    int i45 = b;
                    int i46 = i45 & 71;
                    int i47 = ((((i45 ^ 71) | i46) << 1) - (~(-((i45 | 71) & (~i46))))) - 1;
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    i7 = 4;
                }
            } else if (iBV < 23118750) {
                int i49 = i10 & 87;
                int i50 = (((~i49) & (i10 | 87)) - (~(i49 << 1))) - 1;
                b = i50 % 128;
                int i51 = i50 % 2;
                if (iBV >= 17971875) {
                    int i52 = i10 ^ 77;
                    int i53 = -(-((i10 & 77) << 1));
                    int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                    if (iBV < 20587500) {
                        int i56 = ((i10 ^ 1) | (i10 & 1)) << 1;
                        int i57 = -(((~i10) & 1) | (i10 & (-2)));
                        int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                        b = i58 % 128;
                        int i59 = i58 % 2;
                        int i60 = b;
                        int i61 = (i60 & 61) + (i60 | 61);
                        a = i61 % 128;
                        int i62 = i61 % 2;
                        i7 = 8;
                    } else {
                        int i63 = b;
                        int i64 = i63 & 69;
                        int i65 = (((i63 | 69) & (~i64)) - (~(i64 << 1))) - 1;
                        a = i65 % 128;
                        int i66 = i65 % 2;
                        i7 = 9;
                    }
                } else {
                    int i67 = a;
                    int i68 = ((i67 | 79) << 1) - (i67 ^ 79);
                    b = i68 % 128;
                    int i69 = i68 % 2;
                    i7 = 7;
                }
            } else if (iBV < 25734375) {
                int i70 = (((i10 | 72) << 1) - (i10 ^ 72)) - 1;
                b = i70 % 128;
                if (i70 % 2 != 0) {
                    i6 = 43;
                }
                i7 = i6;
            } else if (iBV < 28265625) {
                int i71 = ((i10 ^ 2) + ((i10 & 2) << 1)) - 1;
                b = i71 % 128;
                if (i71 % 2 != 0) {
                    int i72 = 5 / 2;
                }
                int i73 = b;
                int i74 = i73 & 101;
                int i75 = (((i73 | 101) & (~i74)) - (~(-(-(i74 << 1))))) - 1;
                a = i75 % 128;
                int i76 = i75 % 2;
                i7 = 11;
            } else {
                int i77 = b;
                int i78 = (i77 ^ 82) + ((i77 & 82) << 1);
                int i79 = (i78 ^ (-1)) + (i78 << 1);
                a = i79 % 128;
                int i80 = i79 % 2;
                i7 = 12;
            }
        } else if (iBV < 15271875) {
            int i81 = a;
            int i82 = i81 & 91;
            int i83 = ((i81 ^ 91) | i82) << 1;
            int i84 = -((i81 | 91) & (~i82));
            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
            int i86 = i85 % 128;
            b = i86;
            int i87 = i85 % 2;
            if (iBV < 7593750) {
                int i88 = i86 & 31;
                int i89 = -(-((i86 ^ 31) | i88));
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                a = i90 % 128;
                int i91 = i90 % 2;
                if (iBV < 2615625) {
                    int i110 = b + 3;
                    a = i110 % 128;
                    int i111 = i110 % 2;
                    i7 = 1;
                } else if (iBV < 4978125) {
                    int i210 = b;
                    int i211 = i210 | 15;
                    int i212 = ((i211 << 1) - (~(-((~(i210 & 15)) & i211)))) - 1;
                    a = i212 % 128;
                    int i213 = i212 % 2;
                    i7 = 2;
                } else {
                    int i214 = a;
                    int i215 = (i214 ^ 71) + ((i214 & 71) << 1);
                    b = i215 % 128;
                    int i310 = i215 % 2;
                    i7 = 3;
                }
            } else if (iBV < 10125000) {
                int i410 = b;
                int i411 = i410 & 71;
                int i412 = ((((i410 ^ 71) | i411) << 1) - (~(-((i410 | 71) & (~i411))))) - 1;
                a = i412 % 128;
                int i413 = i412 % 2;
                i7 = 4;
            } else if (iBV < 12740625) {
                int i311 = a;
                int i312 = ((i311 & 49) - (~(-(-(i311 | 49))))) - 1;
                b = i312 % 128;
                int i313 = i312 % 2;
            } else {
                int i414 = b;
                int i415 = i414 & 125;
                int i416 = (i414 ^ 125) | i415;
                int i417 = (i415 ^ i416) + ((i416 & i415) << 1);
                a = i417 % 128;
                int i418 = i417 % 2;
                i7 = 6;
            }
        } else if (iBV < 23034375) {
            int i92 = b;
            int i93 = (((i92 & (-20)) | ((~i92) & 19)) - (~((i92 & 19) << 1))) - 1;
            a = i93 % 128;
            int i94 = i93 % 2;
            if (iBV < 17887500) {
                int i610 = a;
                int i611 = ((i610 | 79) << 1) - (i610 ^ 79);
                b = i611 % 128;
                int i612 = i611 % 2;
                i7 = 7;
            } else if (iBV < 20503125) {
                int i613 = b;
                int i614 = (i613 & 61) + (i613 | 61);
                a = i614 % 128;
                int i615 = i614 % 2;
                i7 = 8;
            } else {
                int i616 = b;
                int i617 = i616 & 69;
                int i618 = (((i616 | 69) & (~i617)) - (~(i617 << 1))) - 1;
                a = i618 % 128;
                int i619 = i618 % 2;
                i7 = 9;
            }
        } else if (iBV < 25650000) {
            int i95 = a;
            int i96 = (i95 & 35) + (i95 | 35);
            int i97 = i96 % 128;
            b = i97;
            i6 = i96 % 2 != 0 ? 15 : 10;
            int i98 = (i97 ^ 91) + ((i97 & 91) << 1);
            a = i98 % 128;
            int i99 = i98 % 2;
            i7 = i6;
        } else if (iBV < 28181250) {
            int i710 = b;
            int i711 = i710 & 101;
            int i712 = (((i710 | 101) & (~i711)) - (~(-(-(i711 << 1))))) - 1;
            a = i712 % 128;
            int i713 = i712 % 2;
            i7 = 11;
        } else {
            int i714 = b;
            int i715 = (i714 ^ 82) + ((i714 & 82) << 1);
            int i716 = (i715 ^ (-1)) + (i715 << 1);
            a = i716 % 128;
            int i810 = i716 % 2;
            i7 = 12;
        }
        int i100 = b;
        int i101 = ((i100 & 110) + (i100 | 110)) - 1;
        a = i101 % 128;
        int i102 = i101 % 2;
        return i7;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public long bO(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (((i4 ^ 99) | (i4 & 99)) << 1) - (((~i4) & 99) | (i4 & (-100)));
        a = i5 % 128;
        int i6 = i5 % 2;
        if (!bX(i)) {
            long j = ak[(-2) - (i2 ^ (-1))];
            int i7 = b;
            int i8 = i7 & 17;
            int i9 = i8 + ((i7 ^ 17) | i8);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return j;
            }
            throw null;
        }
        int i10 = b;
        int i11 = (i10 ^ 47) + ((i10 & 47) << 1);
        int i12 = i11 % 128;
        a = i12;
        long j2 = i11 % 2 == 0 ? al[i2] : al[i2 - 1];
        int i13 = i12 + 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // ivas.gov.bisp.enumeration.cR.h
    public boolean bY(long j) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = i3 + ((i2 ^ 15) | i3);
        b = i4 % 128;
        if (i4 % 2 == 0 ? this.C.f(j) != 29 : this.C.f(j) != 98) {
            int i5 = b;
            int i6 = ((i5 & (-26)) | ((~i5) & 25)) + ((i5 & 25) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        } else {
            int i8 = a;
            int i9 = i8 ^ 13;
            int i10 = (i8 & 13) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                this.J.u(j);
                throw null;
            }
            if (this.J.u(j)) {
                int i12 = a;
                int i13 = i12 & 91;
                int i14 = (i12 ^ 91) | i13;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 4 / 3;
                }
                z = true;
            } else {
                int i17 = b;
                int i18 = ((i17 & (-26)) | ((~i17) & 25)) + ((i17 & 25) << 1);
                a = i18 % 128;
                int i19 = i18 % 2;
                z = false;
            }
        }
        int i20 = b;
        int i21 = i20 & 111;
        int i22 = (i20 | 111) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 & i23) + (i22 | i23);
        a = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x006d  */
    @Override // ivas.gov.bisp.enumeration.cR.h
    public int bH(long j, int i) {
        int iBU;
        int iBK;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 10) + ((i4 & 10) << 1);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBI = 28;
        Object obj = null;
        if (i <= 28) {
            int i8 = ((i4 ^ 53) | (i4 & 53)) << 1;
            int i9 = -(((~i4) & 53) | (i4 & (-54)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i <= 0) {
                iBU = bU(j);
                iBK = bK(j, iBU);
                int i11 = b;
                i2 = ((i11 | 15) << 1) - (i11 ^ 15);
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    bI(iBU, iBK);
                    throw null;
                }
                iBI = bI(iBU, iBK);
            }
        } else {
            iBU = bU(j);
            iBK = bK(j, iBU);
            int i12 = b;
            i2 = ((i12 | 15) << 1) - (i12 ^ 15);
            a = i2 % 128;
            if (i2 % 2 != 0) {
                bI(iBU, iBK);
                throw null;
            }
            iBI = bI(iBU, iBK);
        }
        int i13 = a;
        int i14 = i13 & 91;
        int i15 = (i13 ^ 91) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        return iBI;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public long bZ(long j, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-94)) | ((~i4) & 93);
        int i6 = (i4 & 93) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int iBU = bU(j);
        long jBV = bV(iBU);
        int i9 = b + 93;
        int i10 = i9 % 128;
        a = i10;
        if (i9 % 2 == 0) {
            i2 = (int) ((j - jBV) & 86400000);
        } else {
            int i11 = (int) ((j - jBV) / 86400000);
            i2 = (i11 | 1) + (i11 & 1);
        }
        int i12 = ((i10 & (-4)) | ((~i10) & 3)) + ((i10 & 3) << 1);
        b = i12 % 128;
        int i13 = i12 % 2;
        int iBM = bM(j);
        if (i2 > 59) {
            int i14 = b;
            int i15 = ((i14 ^ 105) | (i14 & 105)) << 1;
            int i16 = -(((~i14) & 105) | (i14 & (-106)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            if (bX(iBU)) {
                int i19 = a;
                int i20 = ((i19 | 23) << 1) - (i19 ^ 23);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    bX(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!bX(i)) {
                    i2--;
                    int i21 = b;
                    int i22 = i21 & 103;
                    int i23 = (((i21 | 103) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                }
            } else if (!(!bX(i))) {
                int i25 = b;
                int i26 = (i25 ^ 79) + ((i25 & 79) << 1);
                int i27 = i26 % 128;
                a = i27;
                int i28 = i26 % 2;
                i2 = (((i2 ^ 1) | (i2 & 1)) << 1) - (((~i2) & 1) | (i2 & (-2)));
                int i29 = ((((i27 ^ 97) | (i27 & 97)) << 1) - (~(-(((~i27) & 97) | (i27 & (-98)))))) - 1;
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 4 / 5;
                }
            }
        }
        long jBW = bW(i, 1, i2) + ((long) iBM);
        int i31 = a;
        int i32 = ((i31 | 41) << 1) - (i31 ^ 41);
        b = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 92 / 0;
        }
        return jBW;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public long bT(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 75;
        int i4 = i3 + ((i2 ^ 75) | i3);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            bU(j);
            bU(j2);
            obj.hashCode();
            throw null;
        }
        int iBU = bU(j);
        int iBU2 = bU(j2);
        int i5 = b;
        int i6 = (i5 ^ 94) + ((i5 & 94) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        long jBV = j - bV(iBU);
        int i9 = a;
        int i10 = i9 & 41;
        int i11 = (((i9 | 41) & (~i10)) - (~(i10 << 1))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        long jBV2 = j2 - bV(iBU2);
        int i13 = a;
        int i14 = i13 & 59;
        int i15 = (i13 | 59) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
        if (jBV2 >= 5097600000L) {
            if (!(!bX(iBU2))) {
                int i18 = a;
                int i19 = i18 & 51;
                int i20 = ((i18 | 51) & (~i19)) + (i19 << 1);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    bX(iBU);
                    throw null;
                }
                if (!bX(iBU)) {
                    int i21 = b;
                    int i22 = (((i21 | 36) << 1) - (i21 ^ 36)) - 1;
                    a = i22 % 128;
                    jBV2 = i22 % 2 == 0 ? jBV2 / 86400000 : jBV2 - 86400000;
                }
            } else if (jBV >= 5097600000L) {
                int i23 = a;
                int i24 = (i23 | 21) << 1;
                int i25 = -(((~i23) & 21) | (i23 & (-22)));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
                if (bX(iBU)) {
                    int i28 = a;
                    int i29 = (i28 & 113) + (i28 | 113);
                    b = i29 % 128;
                    jBV = i29 % 2 != 0 ? jBV % 86400000 : jBV - 86400000;
                    int i30 = (((i28 & (-104)) | ((~i28) & 103)) - (~((i28 & 103) << 1))) - 1;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
            }
        }
        int i32 = iBU - (~(-iBU2));
        int i33 = (i32 ^ (-1)) + (i32 << 1);
        if (jBV < jBV2) {
            int i34 = b;
            int i35 = i34 ^ 47;
            int i36 = ((i34 & 47) | i35) << 1;
            int i37 = -i35;
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            a = i38 % 128;
            int i39 = i38 % 2;
            i33 = (((i33 ^ (-1)) | i33) << 1) - (~i33);
            int i40 = i34 ^ 41;
            int i41 = ((i34 & 41) | i40) << 1;
            int i42 = -i40;
            int i43 = (i41 & i42) + (i41 | i42);
            a = i43 % 128;
            int i44 = i43 % 2;
        }
        long j3 = i33;
        int i45 = b;
        int i46 = (i45 & 11) + (i45 | 11);
        a = i46 % 128;
        int i47 = i46 % 2;
        return j3;
    }

    static {
        int i;
        int i2 = 1 & 83;
        int i3 = (1 ^ 83) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            al = new long[7];
            i = 1;
        } else {
            al = new long[12];
            i = 0;
        }
        int i5 = 2 % 2;
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            int i6 = a;
            int i7 = ((i6 | 91) << 1) - (i6 ^ 91);
            b = i7 % 128;
            int i8 = i7 % 2;
            long j3 = ai[i];
            int i9 = (i6 & 37) + (i6 | 37);
            int i10 = i9 % 128;
            b = i10;
            if (i9 % 2 != 0) {
                j *= j3 * 86400000;
            } else {
                Long.signum(j3);
                j += j3 * 86400000;
            }
            long[] jArr = ak;
            int i11 = (i & (-2)) | ((~i) & 1);
            int i12 = (i & 1) << 1;
            int i13 = (i11 | i12) + (i11 & i12);
            jArr[i13] = j;
            int[] iArr = aj;
            int i14 = (i10 & (-124)) | ((~i10) & 123);
            int i15 = (i10 & 123) << 1;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            a = i16 % 128;
            j2 = i16 % 2 == 0 ? j2 / (((long) iArr[i]) % 86400000) : j2 + (((long) iArr[i]) * 86400000);
            long[] jArr2 = al;
            int i17 = (((i10 ^ 87) | (i10 & 87)) << 1) - (((~i10) & 87) | (i10 & (-88)));
            a = i17 % 128;
            if (i17 % 2 == 0) {
                jArr2[i13] = j2;
                int i18 = 30 / 0;
            } else {
                jArr2[i13] = j2;
            }
            i = i13;
        }
        int i19 = a;
        int i20 = i19 & 57;
        int i21 = (i20 - (~((i19 ^ 57) | i20))) - 1;
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
