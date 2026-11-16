package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ac extends Q {
    private static int a = 1;
    private static int b;
    public int d;

    public ac(C0270p c0270p) {
        super(c0270p);
        this.d = -1;
    }

    public ac(i[] iVarArr, boolean z) {
        super(iVarArr, z);
        this.d = -1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:32:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0132  */
    /* JADX WARN: Code duplicated, block: B:37:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0164 A[SYNTHETIC] */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        O oN;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 + 73;
        a = i7 % 128;
        int i8 = i7 % 2;
        if (z) {
            int i9 = i6 & 31;
            int i10 = ((i6 ^ 31) | i9) << 1;
            int i11 = -((i6 | 31) & (~i9));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                aVar.r(89);
            } else {
                aVar.r(48);
            }
        }
        C0259b c0259bO = aVar.o();
        int length = this.c.length;
        int i13 = b;
        int i14 = (i13 & 71) + (i13 | 71);
        a = i14 % 128;
        int i15 = i14 % 2;
        Object obj = null;
        int i16 = 0;
        if (this.d < 0) {
            int i17 = i13 + 113;
            int i18 = i17 % 128;
            a = i18;
            int i19 = i17 % 2;
            if (length <= 16) {
                int i20 = i18 & 45;
                int i21 = -(-((i18 ^ 45) | i20));
                int i22 = (i20 & i21) + (i20 | i21);
                b = i22 % 128;
                O[] oArr = new O[length];
                int i23 = i22 % 2 != 0 ? 1 : 0;
                int i24 = 0;
                while (i24 < length) {
                    int i25 = a;
                    int i26 = (i25 ^ 77) + ((i25 & 77) << 1);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        this.c[i24].f();
                        obj.hashCode();
                        throw null;
                    }
                    O oF = this.c[i24].f();
                    int i27 = a;
                    int i28 = i27 & 101;
                    int i29 = (i27 ^ 101) | i28;
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    O oN2 = oF.n();
                    oArr[i24] = oN2;
                    int i32 = a + 1;
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    int iJ = oN2.j();
                    if (i33 != 0) {
                        int i34 = -(~(-(-iJ)));
                        int i35 = ((i23 ^ i34) + ((i23 & i34) << 1)) - 1;
                        int i36 = i24 & 88;
                        i24 = (i36 - (~(-(-((i24 ^ 88) | i36))))) - 1;
                        i23 = i35;
                    } else {
                        int i37 = i23 & iJ;
                        int i38 = -(-((i23 ^ iJ) | i37));
                        i24 = ((i24 & (-30)) - (~(i24 | (-30)))) + 30;
                        i23 = ((i37 | i38) << 1) - (i38 ^ i37);
                    }
                }
                this.d = i23;
                aVar.w(i23);
                int i39 = b + 69;
                a = i39 % 128;
                while (true) {
                    int i40 = i39 % 2;
                    if (i16 >= length) {
                        break;
                    }
                    int i41 = a + 115;
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    oArr[i16].i(c0259bO, true);
                    i16++;
                    i39 = a + 87;
                    b = i39 % 128;
                }
            } else {
                aVar.w(p());
                int i43 = a;
                int i44 = i43 & 7;
                int i45 = ((i43 ^ 7) | i44) << 1;
                int i46 = -((i43 | 7) & (~i44));
                i = (i45 & i46) + (i46 | i45);
                b = i % 128;
                if (i % 2 != 0) {
                    int i47 = 4 % 3;
                }
                i2 = 0;
                while (i2 < length) {
                    i3 = (-2) - ((a + 26) ^ (-1));
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.c[i2].f().n();
                        obj.hashCode();
                        throw null;
                    }
                    oN = this.c[i2].f().n();
                    int i48 = b;
                    i4 = (((i48 & (-34)) | ((~i48) & 33)) - (~(-(-((i48 & 33) << 1))))) - 1;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        oN.i(c0259bO, false);
                        i2 += 123;
                    } else {
                        oN.i(c0259bO, true);
                        int i49 = (((i2 | (-87)) << 1) - (i2 ^ (-87))) - 1;
                        int i50 = ((i49 ^ 89) | (i49 & 89)) << 1;
                        int i51 = -(((~i49) & 89) | (i49 & (-90)));
                        i2 = (i50 ^ i51) + ((i50 & i51) << 1);
                    }
                }
            }
        } else {
            aVar.w(p());
            int i410 = a;
            int i411 = i410 & 7;
            int i412 = ((i410 ^ 7) | i411) << 1;
            int i413 = -((i410 | 7) & (~i411));
            i = (i412 & i413) + (i413 | i412);
            b = i % 128;
            if (i % 2 != 0) {
                int i414 = 4 % 3;
            }
            i2 = 0;
            while (i2 < length) {
                i3 = (-2) - ((a + 26) ^ (-1));
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    this.c[i2].f().n();
                    obj.hashCode();
                    throw null;
                }
                oN = this.c[i2].f().n();
                int i415 = b;
                i4 = (((i415 & (-34)) | ((~i415) & 33)) - (~(-(-((i415 & 33) << 1))))) - 1;
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    oN.i(c0259bO, false);
                    i2 += 123;
                } else {
                    oN.i(c0259bO, true);
                    int i416 = (((i2 | (-87)) << 1) - (i2 ^ (-87))) - 1;
                    int i52 = ((i416 ^ 89) | (i416 & 89)) << 1;
                    int i53 = -(((~i416) & 89) | (i416 & (-90)));
                    i2 = (i52 ^ i53) + ((i52 & i53) << 1);
                }
            }
        }
        int i54 = a;
        int i55 = i54 & 61;
        int i56 = ((i54 ^ 61) | i55) << 1;
        int i57 = -((i54 | 61) & (~i55));
        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
        b = i58 % 128;
        int i59 = i58 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int iP;
        int iB;
        int i = 2 % 2;
        int i2 = a + 67;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            iP = p();
            iB = az.b(iP);
        } else {
            iP = p();
            int iB2 = az.b(iP);
            int i3 = iB2 & 1;
            int i4 = -(-((iB2 ^ 1) | i3));
            iB = ((i3 | i4) << 1) - (i4 ^ i3);
        }
        int i5 = iB + iP;
        int i6 = b;
        int i7 = ((i6 & (-110)) | ((~i6) & 109)) + ((i6 & 109) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 35 / 0;
        }
        return i5;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 13;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 & 17;
        int i5 = (i2 | 17) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.Q, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = (i2 ^ 119) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = ((i6 & (-112)) | ((~i6) & 111)) + ((i6 & 111) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    public final int p() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 81;
        int i4 = ((((i2 ^ 81) | i3) << 1) - (~(-((i2 | 81) & (~i3))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.d < 0) {
            int length = this.c.length;
            int i5 = b;
            int i6 = (((i5 & (-98)) | ((~i5) & 97)) - (~((i5 & 97) << 1))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = b;
                int i11 = ((i10 | 83) << 1) - (i10 ^ 83);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    this.c[i8].f().n().j();
                    obj.hashCode();
                    throw null;
                }
                int i12 = i9 - (~this.c[i8].f().n().j());
                i9 = (i12 << 1) + (i12 ^ (-1));
                int i13 = ((i8 | (-66)) << 1) - (i8 ^ (-66));
                i8 = (i13 ^ 67) + ((i13 & 67) << 1);
                int i14 = a + 101;
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            this.d = i9;
            int i16 = a;
            int i17 = i16 & 123;
            int i18 = i16 | 123;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 4 / 3;
            }
        }
        int i21 = this.d;
        int i22 = (-2) - ((a + 68) ^ (-1));
        b = i22 % 128;
        if (i22 % 2 == 0) {
            return i21;
        }
        throw null;
    }
}
