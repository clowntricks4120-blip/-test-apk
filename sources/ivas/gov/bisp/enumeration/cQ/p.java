package ivas.gov.bisp.enumeration.cQ;

import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cP.O;
import ivas.gov.bisp.enumeration.cP.P;
import ivas.gov.bisp.enumeration.p091n.j;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements A, Comparable {
    private static int a = 1;
    private static int b;

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 1;
        int i5 = (~i4) & (i3 | 1);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2 == 0 ? 8546 : 157;
        int i9 = i3 & 37;
        int i10 = (i9 - (~((i3 ^ 37) | i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < 3) {
            int i13 = b;
            int i14 = (((i13 & (-90)) | ((~i13) & 89)) - (~(-(-((i13 & 89) << 1))))) - 1;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                ((O) this).e(i12);
                n(i12);
                throw null;
            }
            int iE = ((O) this).e(i12);
            AbstractC0246t abstractC0246tN = n(i12);
            int i15 = b;
            int i16 = ((i15 | 63) << 1) - (i15 ^ 63);
            a = i16 % 128;
            int i17 = i16 % 2;
            int iHashCode = abstractC0246tN.hashCode();
            if (i17 == 0) {
                i = (iE << (i8 % 112)) / 22;
            } else {
                int i18 = -(-(i8 * 23));
                int i19 = iE & i18;
                int i20 = ((iE ^ i18) | i19) << 1;
                int i21 = -((i18 | iE) & (~i19));
                i = ((i20 & i21) + (i21 | i20)) * 23;
            }
            int i22 = iHashCode & i;
            int i23 = (i | iHashCode) & (~i22);
            int i24 = -(-(i22 << 1));
            i8 = (i23 | i24) + (i23 & i24);
            i12 = ((i12 | 1) << 1) - (i12 ^ 1);
            int i25 = a;
            int i26 = ((i25 & 70) + (i25 | 70)) - 1;
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        int iHashCode2 = ((O) this).e.hashCode();
        int i28 = b;
        int i29 = i28 & 33;
        int i30 = i29 + ((i28 ^ 33) | i29);
        a = i30 % 128;
        int i31 = i30 % 2;
        int i32 = -(~(-(-i8)));
        int i33 = (((iHashCode2 | i32) << 1) - (i32 ^ iHashCode2)) - 1;
        int i34 = (i28 ^ 38) + ((i28 & 38) << 1);
        int i35 = (i34 ^ (-1)) + (i34 << 1);
        a = i35 % 128;
        if (i35 % 2 == 0) {
            int i36 = 22 / 0;
        }
        return i33;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0105 A[EDGE_INSN: B:30:0x0105->B:26:0x0105 BREAK  A[LOOP:0: B:11:0x0067->B:20:0x00a4], EDGE_INSN: B:33:0x0105->B:26:0x0105 BREAK  A[LOOP:0: B:11:0x0067->B:20:0x00a4]] */
    public boolean equals(Object obj) {
        boolean zD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 31) + (i2 | 31);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 ^ 71;
            int i6 = ((i2 & 71) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((i2 ^ 55) | (i2 & 55)) << 1;
            int i11 = -(((~i2) & 55) | (i2 & (-56)));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            int i13 = i12 % 2;
            zD = true;
        } else {
            zD = false;
            if (obj instanceof A) {
                A a2 = (A) obj;
                if (3 == a2.size()) {
                    int i14 = b;
                    int i15 = i14 & 25;
                    int i16 = (((i14 ^ 25) | i15) << 1) - ((~i15) & (i14 | 25));
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = i14 + 15;
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = 0;
                    while (true) {
                        if (i20 < 3) {
                            int i21 = a;
                            int i22 = i21 ^ 17;
                            int i23 = (((i21 & 17) | i22) << 1) - i22;
                            b = i23 % 128;
                            Object obj2 = null;
                            if (i23 % 2 != 0) {
                                ((O) this).e(i20);
                                a2.e(i20);
                                obj2.hashCode();
                                throw null;
                            }
                            if (((O) this).e(i20) != a2.e(i20)) {
                                break;
                            }
                            int i24 = a;
                            int i25 = ((i24 & (-76)) | ((~i24) & 75)) + ((i24 & 75) << 1);
                            b = i25 % 128;
                            if (i25 % 2 != 0) {
                                n(i20);
                                a2.n(i20);
                                throw null;
                            }
                            if (n(i20) != a2.n(i20)) {
                                break;
                            }
                            int i26 = i20 & (-56);
                            int i27 = (i26 - (~(-(-((i20 ^ (-56)) | i26))))) - 1;
                            i20 = ((i27 ^ 58) + ((i27 & 58) << 1)) - 1;
                            int i28 = a;
                            int i29 = i28 & 79;
                            int i30 = (i29 - (~((i28 ^ 79) | i29))) - 1;
                            b = i30 % 128;
                            int i31 = i30 % 2;
                        } else {
                            zD = ivas.gov.bisp.enumeration.p100w.r.D(((O) this).e, a2.b());
                            int i32 = b;
                            int i33 = i32 & 49;
                            int i34 = -(-((i32 ^ 49) | i33));
                            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                            int i36 = i35 % 128;
                            a = i36;
                            int i37 = i35 % 2;
                            int i38 = (-2) - ((i36 + 36) ^ (-1));
                            b = i38 % 128;
                            int i39 = i38 % 2;
                        }
                    }
                    int i40 = b;
                    int i41 = i40 ^ 71;
                    int i42 = (((i40 & 71) | i41) << 1) - i41;
                    a = i42 % 128;
                    int i43 = i42 % 2;
                } else {
                    int i44 = b;
                    int i45 = i44 ^ 71;
                    int i46 = (((i44 & 71) | i45) << 1) - i45;
                    a = i46 % 128;
                    int i47 = i46 % 2;
                }
            } else {
                int i48 = b;
                int i49 = i48 ^ 71;
                int i410 = (((i48 & 71) | i49) << 1) - i49;
                a = i410 % 128;
                int i411 = i410 % 2;
            }
        }
        int i50 = a;
        int i51 = i50 ^ 21;
        int i52 = -(-((i50 & 21) << 1));
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        b = i53 % 128;
        int i54 = i53 % 2;
        return zD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.A
    public AbstractC0246t n(int i) {
        P pBd;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 81) + ((i4 & 81) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        h hVar = ((O) this).e;
        if (i != 0) {
            int i7 = a;
            int i8 = i7 + 33;
            b = i8 % 128;
            int i9 = i8 % 2;
            if (i != 1) {
                int i10 = i7 & 51;
                int i11 = (i7 | 51) & (~i10);
                int i12 = i10 << 1;
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                int i14 = i13 % 128;
                b = i14;
                int i15 = i13 % 2;
                if (i != 2) {
                    throw new IndexOutOfBoundsException(j.o("Invalid index: ", i));
                }
                int i16 = (i14 & 107) + (i14 | 107);
                a = i16 % 128;
                int i17 = i16 % 2;
                pBd = hVar.x();
                int i18 = b;
                int i19 = i18 & 65;
                int i20 = -(-((i18 ^ 65) | i19));
                i2 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i2 % 128;
            } else {
                pBd = hVar.aD();
                int i21 = a;
                int i22 = i21 & 67;
                int i23 = -(-(i21 | 67));
                i2 = (i22 ^ i23) + ((i23 & i22) << 1);
                b = i2 % 128;
            }
            int i24 = i2 % 2;
        } else {
            pBd = hVar.bd();
            int i25 = a;
            int i26 = (i25 ^ 63) + ((i25 & 63) << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
        }
        AbstractC0246t abstractC0246tV = pBd.v();
        int i28 = a;
        int i29 = ((((i28 ^ 33) | (i28 & 33)) << 1) - (~(-(((~i28) & 33) | (i28 & (-34)))))) - 1;
        b = i29 % 128;
        int i30 = i29 % 2;
        return abstractC0246tV;
    }
}
