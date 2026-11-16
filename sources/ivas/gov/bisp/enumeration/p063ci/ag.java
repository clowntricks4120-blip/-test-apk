package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ag extends L {
    private static int a = 1;
    private static int b;
    public int e;

    public ag() {
        this.e = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(boolean z, i[] iVarArr) {
        super(z, iVarArr);
        if (!z) {
            throw new IllegalStateException("DERSet elements should always be in sorted order");
        }
        this.e = -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x008d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a5 A[LOOP:0: B:18:0x0091->B:21:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0108  */
    /* JADX WARN: Code duplicated, block: B:28:0x0114  */
    /* JADX WARN: Code duplicated, block: B:29:0x0134  */
    /* JADX WARN: Code duplicated, block: B:40:0x01dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x01de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2;
        O[] oArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = a;
        int i11 = (i10 ^ 107) + ((i10 & 107) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        if (!(!z)) {
            int i13 = (i10 | 31) << 1;
            int i14 = -(((~i10) & 31) | (i10 & (-32)));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            aVar.r(49);
            int i17 = a;
            int i18 = ((i17 & (-6)) | ((~i17) & 5)) + ((i17 & 5) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
        }
        C0259b c0259bO = aVar.o();
        int length = this.c.length;
        int i20 = this.e;
        int i21 = b;
        int i22 = i21 & 69;
        int i23 = -(-((i21 ^ 69) | i22));
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        a = i24 % 128;
        Object obj = null;
        int i25 = 0;
        if (i24 % 2 == 0) {
            if (i20 < 0) {
                i = 1;
                if (length <= 16) {
                    int i26 = i21 & 75;
                    int i27 = -(-((i21 ^ 75) | i26));
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    int i29 = i28 % 128;
                    a = i29;
                    int i30 = i28 % 2;
                    oArr = new O[length];
                    i3 = ((i29 | 93) << 1) - (i29 ^ 93);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i31 = 2 / 2;
                    }
                    i4 = 0;
                    i5 = 0;
                    while (i4 < length) {
                        int i32 = b;
                        int i33 = (i32 & 72) + (i32 | 72);
                        i8 = (i33 ^ (-1)) + (i33 << 1);
                        a = i8 % 128;
                        if (i8 % 2 != 0) {
                            this.c[i4].f().n();
                            obj.hashCode();
                            throw null;
                        }
                        O oN = this.c[i4].f().n();
                        oArr[i4] = oN;
                        int i34 = -(-oN.j());
                        int i35 = i5 ^ i34;
                        int i36 = -(-((i5 & i34) << 1));
                        i5 = ((i35 | i36) << 1) - (i36 ^ i35);
                        i4 = (-2) - (((i4 ^ 2) + ((i4 & 2) << 1)) ^ (-1));
                        int i37 = b;
                        int i38 = ((i37 & (-98)) | ((~i37) & 97)) + ((i37 & 97) << 1);
                        a = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    this.e = i5;
                    aVar.w(i5);
                    int i40 = a;
                    int i41 = i40 & 73;
                    int i42 = (i40 ^ 73) | i41;
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    b = i43 % 128;
                    int i44 = i43 % 2;
                    while (i25 < length) {
                        i6 = a + 43;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            oArr[i25].i(c0259bO, true);
                            int i45 = (i25 | 43) << 1;
                            int i46 = -((i25 & (-44)) | ((~i25) & 43));
                            int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                            i7 = ((i47 & (-65)) | ((~i47) & 64)) + ((i47 & 64) << 1);
                        } else {
                            oArr[i25].i(c0259bO, true);
                            int i48 = i25 & 1;
                            i7 = (i48 - (~((i25 ^ 1) | i48))) - 1;
                        }
                        i25 = i7;
                        int i49 = b;
                        int i50 = i49 & 95;
                        int i51 = (((i49 | 95) & (~i50)) - (~(-(-(i50 << 1))))) - 1;
                        a = i51 % 128;
                        int i52 = i51 % 2;
                    }
                }
                int i53 = b;
                int i54 = i53 & 55;
                int i55 = ((i53 ^ 55) | i54) << 1;
                int i56 = -((i53 | 55) & (~i54));
                i2 = ((i55 | i56) << 1) - (i56 ^ i55);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
            i = 1;
        } else {
            if (i20 < 0) {
                i = 0;
                if (length <= 16) {
                    int i210 = i21 & 75;
                    int i211 = -(-((i21 ^ 75) | i210));
                    int i212 = (i210 ^ i211) + ((i210 & i211) << 1);
                    int i213 = i212 % 128;
                    a = i213;
                    int i310 = i212 % 2;
                    oArr = new O[length];
                    i3 = ((i213 | 93) << 1) - (i213 ^ 93);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i311 = 2 / 2;
                    }
                    i4 = 0;
                    i5 = 0;
                    while (i4 < length) {
                        int i312 = b;
                        int i313 = (i312 & 72) + (i312 | 72);
                        i8 = (i313 ^ (-1)) + (i313 << 1);
                        a = i8 % 128;
                        if (i8 % 2 != 0) {
                            this.c[i4].f().n();
                            obj.hashCode();
                            throw null;
                        }
                        O oN2 = this.c[i4].f().n();
                        oArr[i4] = oN2;
                        int i314 = -(-oN2.j());
                        int i315 = i5 ^ i314;
                        int i316 = -(-((i5 & i314) << 1));
                        i5 = ((i315 | i316) << 1) - (i316 ^ i315);
                        i4 = (-2) - (((i4 ^ 2) + ((i4 & 2) << 1)) ^ (-1));
                        int i317 = b;
                        int i318 = ((i317 & (-98)) | ((~i317) & 97)) + ((i317 & 97) << 1);
                        a = i318 % 128;
                        int i319 = i318 % 2;
                    }
                    this.e = i5;
                    aVar.w(i5);
                    int i410 = a;
                    int i411 = i410 & 73;
                    int i412 = (i410 ^ 73) | i411;
                    int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
                    b = i413 % 128;
                    int i414 = i413 % 2;
                    while (i25 < length) {
                        i6 = a + 43;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            oArr[i25].i(c0259bO, true);
                            int i415 = (i25 | 43) << 1;
                            int i416 = -((i25 & (-44)) | ((~i25) & 43));
                            int i417 = ((i415 | i416) << 1) - (i415 ^ i416);
                            i7 = ((i417 & (-65)) | ((~i417) & 64)) + ((i417 & 64) << 1);
                        } else {
                            oArr[i25].i(c0259bO, true);
                            int i418 = i25 & 1;
                            i7 = (i418 - (~((i25 ^ 1) | i418))) - 1;
                        }
                        i25 = i7;
                        int i419 = b;
                        int i57 = i419 & 95;
                        int i58 = (((i419 | 95) & (~i57)) - (~(-(-(i57 << 1))))) - 1;
                        a = i58 % 128;
                        int i59 = i58 % 2;
                    }
                }
                int i510 = b;
                int i511 = i510 & 55;
                int i512 = ((i510 ^ 55) | i511) << 1;
                int i513 = -((i510 | 55) & (~i511));
                i2 = ((i512 | i513) << 1) - (i513 ^ i512);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
            i = 0;
        }
        aVar.w(r());
        int i60 = b;
        int i61 = ((((i60 ^ 15) | (i60 & 15)) << 1) - (~(-(((~i60) & 15) | (i60 & (-16)))))) - 1;
        a = i61 % 128;
        int i62 = i61 % 2;
        while (i < length) {
            int i63 = a;
            int i64 = (i63 & 117) + (i63 | 117);
            b = i64 % 128;
            int i65 = i64 % 2;
            O oF = this.c[i].f();
            int i66 = a;
            int i67 = (((i66 | 26) << 1) - (i66 ^ 26)) - 1;
            b = i67 % 128;
            int i68 = i67 % 2;
            O oN3 = oF.n();
            if (i68 != 0) {
                oN3.i(c0259bO, false);
                int i69 = (i & (-100)) | ((~i) & 99);
                int i70 = -(-((i & 99) << 1));
                i = (i69 & i70) + (i69 | i70);
            } else {
                oN3.i(c0259bO, true);
                int i71 = i + 93;
                int i72 = i71 & (-92);
                i = (i72 - (~((i71 ^ (-92)) | i72))) - 1;
            }
        }
        int i514 = b;
        int i515 = i514 & 55;
        int i516 = ((i514 ^ 55) | i515) << 1;
        int i517 = -((i514 | 55) & (~i515));
        i2 = ((i516 | i517) << 1) - (i517 ^ i516);
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b + 103;
        a = i2 % 128;
        int i3 = i2 % 2;
        int iR = r();
        if (i3 == 0) {
            return az.b(iR) % iR;
        }
        int iB = (-2) - ((az.b(iR) + 2) ^ (-1));
        int i4 = iB & iR;
        int i5 = (iR | iB) & (~i4);
        int i6 = i4 << 1;
        return (i5 & i6) + (i5 | i6);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.L, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 17) | (i2 & 17)) << 1) - ((i2 & (-18)) | ((~i2) & 17));
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 87;
        int i6 = (i2 ^ 87) | i5;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // ivas.gov.bisp.enumeration.p063ci.L, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        O oN;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.d;
        if (i4 != 0) {
            int i5 = 54 / 0;
            if (z) {
                int i6 = a + 45;
                b = i6 % 128;
                int i7 = i6 % 2;
                oN = this;
            } else {
                oN = super.n();
                int i8 = a;
                int i9 = (i8 & 105) + (i8 | 105);
                b = i9 % 128;
                int i10 = i9 % 2;
            }
        } else if (z) {
            int i11 = a + 45;
            b = i11 % 128;
            int i12 = i11 % 2;
            oN = this;
        } else {
            oN = super.n();
            int i13 = a;
            int i14 = (i13 & 105) + (i13 | 105);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 & 29;
        int i18 = (i16 | 29) & (~i17);
        int i19 = i17 << 1;
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        a = i20 % 128;
        int i21 = i20 % 2;
        return oN;
    }

    public final int r() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 15) + ((i3 & 15) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this.e < 0) {
            int i6 = i3 + 33;
            a = i6 % 128;
            int length = i6 % 2 == 0 ? this.c.length : this.c.length;
            int i7 = a;
            int i8 = (((i7 ^ 103) | (i7 & 103)) << 1) - (((~i7) & 103) | (i7 & (-104)));
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = a;
                int i13 = i12 ^ 69;
                int i14 = ((i12 & 69) | i13) << 1;
                int i15 = -i13;
                int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
                b = i16 % 128;
                int i17 = i16 % 2;
                int iJ = this.c[i10].f().n().j();
                int i18 = a;
                int i19 = ((i18 ^ 25) | (i18 & 25)) << 1;
                int i20 = -(((~i18) & 25) | (i18 & (-26)));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = i21 % 128;
                b = i22;
                int i23 = i11 & iJ;
                int i24 = -(-((i11 ^ iJ) | i23));
                if (i21 % 2 != 0) {
                    i = ((i23 | i24) << 1) - (i24 ^ i23);
                    i10 = ((i10 | 30) << 1) - (i10 ^ 30);
                } else {
                    i = (i23 ^ i24) + ((i24 & i23) << 1);
                    i10++;
                }
                i11 = i;
                int i25 = ((i22 & 118) + (i22 | 118)) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
            }
            this.e = i11;
            int i27 = b;
            int i28 = (i27 & (-110)) | ((~i27) & 109);
            int i29 = (i27 & 109) << 1;
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = this.e;
        int i33 = b;
        int i34 = (i33 | 95) << 1;
        int i35 = -(((~i33) & 95) | (i33 & (-96)));
        int i36 = (i34 & i35) + (i35 | i34);
        a = i36 % 128;
        int i37 = i36 % 2;
        return i32;
    }
}
