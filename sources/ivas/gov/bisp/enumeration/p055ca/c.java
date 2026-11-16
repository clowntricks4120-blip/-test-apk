package ivas.gov.bisp.enumeration.p055ca;

import ivas.gov.bisp.enumeration.cN.i;
import ivas.gov.bisp.enumeration.p063ci.ae;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p076cv.P;
import ivas.gov.bisp.enumeration.p076cv.u;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes.dex */
public class c implements PublicKey {
    private static int a = 1;
    private static int b;
    public short[][] c;
    public short[][] d;
    public short[] e;
    public int f;

    public c(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f = i;
        this.c = sArr;
        this.d = sArr2;
        this.e = sArr3;
    }

    public c(i iVar) {
        int i = iVar.d;
        short[][] sArr = iVar.a;
        short[][] sArr2 = iVar.b;
        short[] sArr3 = iVar.c;
        this.f = i;
        this.c = sArr;
        this.d = sArr2;
        this.e = sArr3;
    }

    public short[][] d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 93;
        int i4 = (i2 & 93) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        short[][] sArr = new short[this.d.length][];
        int i8 = ((i6 ^ 115) | (i6 & 115)) << 1;
        int i9 = -(((~i6) & 115) | (i6 & (-116)));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            short[][] sArr2 = this.d;
            if (i12 == sArr2.length) {
                int i13 = a + 113;
                b = i13 % 128;
                int i14 = i13 % 2;
                return sArr;
            }
            int i15 = b + 39;
            a = i15 % 128;
            if (i15 % 2 == 0) {
                sArr[i12] = j.d(sArr2[i12]);
                int i16 = i12 + 125;
                i12 = (i16 ^ (-10)) + ((i16 & (-10)) << 1);
            } else {
                sArr[i12] = j.d(sArr2[i12]);
                int i17 = i12 & 77;
                int i18 = (i17 - (~((i12 ^ 77) | i17))) - 1;
                i12 = (i18 & (-76)) + (i18 | (-76));
            }
            int i19 = b;
            int i20 = i19 & 1;
            int i21 = (i20 - (~((i19 ^ 1) | i20))) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 117) << 1;
        int i4 = -(((~i2) & 117) | (i2 & (-118)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 5;
        int i9 = i8 + ((i6 ^ 5) | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return "Rainbow";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArrG;
        int i = 2 % 2;
        Object obj = null;
        try {
            ivas.gov.bisp.enumeration.p069co.c cVar = new ivas.gov.bisp.enumeration.p069co.c(new ivas.gov.bisp.enumeration.p069co.j(P.b, ae.c), new u(this.f, this.c, this.d, this.e));
            int i2 = a;
            int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                cVar.g("DER");
                obj.hashCode();
                throw null;
            }
            bArrG = cVar.g("DER");
            int i4 = b;
            int i5 = i4 & 107;
            int i6 = (i4 | 107) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = a;
            int i11 = (i10 & (-4)) | ((~i10) & 3);
            int i12 = -(-((i10 & 3) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return bArrG;
            }
            throw null;
        } catch (Exception unused) {
            bArrG = null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 50) + ((i2 & 50) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 25;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return "X.509";
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = ((i2 ^ 109) | i3) << 1;
        int i5 = -((i2 | 109) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.f;
        int iJ = j.j(this.c);
        int i9 = b;
        int i10 = i9 & 7;
        int i11 = (i9 ^ 7) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        int iJ2 = j.j(this.d);
        int i14 = j.i(this.e);
        int i15 = b;
        int i16 = i15 & 111;
        int i17 = (((i15 | 111) & (~i16)) - (~(i16 << 1))) - 1;
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        int i20 = -(-(i8 * 37));
        int i21 = iJ ^ i20;
        int i22 = (i20 & iJ) << 1;
        int i23 = -(-((((i21 | i22) << 1) - (i22 ^ i21)) * 37));
        int i24 = ((iJ2 & i23) + (i23 | iJ2)) * 37;
        int i25 = ((i18 | 71) << 1) - (i18 ^ 71);
        b = i25 % 128;
        int i26 = i25 % 2;
        int i27 = -(-i24);
        int i28 = i14 & i27;
        int i29 = -(-((i27 ^ i14) | i28));
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = (i18 ^ 105) + ((i18 & 105) << 1);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            return i30;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public boolean equals(Object obj) {
        int i;
        c cVar;
        int i2;
        short[] sArr;
        short[] sArrD;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 17;
        int i7 = (i5 | 17) & (~i6);
        boolean z = true;
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        int i10 = i9 % 128;
        a = i10;
        if (i9 % 2 != 0) {
            if (obj != null) {
                i = ((i10 & (-82)) | ((~i10) & 81)) + ((i10 & 81) << 1);
                b = i % 128;
                if (i % 2 == 0) {
                    boolean z2 = obj instanceof c;
                    throw null;
                }
                if (!(obj instanceof c)) {
                    cVar = (c) obj;
                    if (this.f == cVar.f) {
                        int i11 = i10 + 48;
                        int i12 = (i11 ^ (-1)) + (i11 << 1);
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        if (!(!r.I(this.c, cVar.c))) {
                            int i14 = a;
                            int i15 = ((i14 | 20) << 1) - (i14 ^ 20);
                            int i16 = (i15 ^ (-1)) + (i15 << 1);
                            b = i16 % 128;
                            int i17 = i16 % 2;
                            if (!r.I(this.d, cVar.d())) {
                                int i18 = a;
                                int i19 = i18 & 55;
                                i2 = (((i18 | 55) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    sArr = this.e;
                                    sArrD = j.d(cVar.e);
                                    int i20 = 14 / 0;
                                } else {
                                    sArr = this.e;
                                    sArrD = j.d(cVar.e);
                                }
                                int i21 = a;
                                int i22 = i21 & 83;
                                int i23 = (i22 - (~(-(-((i21 ^ 83) | i22))))) - 1;
                                b = i23 % 128;
                                int i24 = i23 % 2;
                                if (!r.H(sArr, sArrD)) {
                                    int i25 = a;
                                    int i26 = i25 & 21;
                                    int i27 = ((i25 ^ 21) | i26) << 1;
                                    int i28 = -((i25 | 21) & (~i26));
                                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                                    int i30 = i29 % 128;
                                    b = i30;
                                    int i31 = i29 % 2;
                                    int i32 = i30 + 1;
                                    a = i32 % 128;
                                    int i33 = i32 % 2;
                                }
                            }
                        }
                    }
                }
            }
            i3 = b + 107;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return z;
            }
            throw null;
        }
        int i34 = 37 / 0;
        if (obj != null) {
            i = ((i10 & (-82)) | ((~i10) & 81)) + ((i10 & 81) << 1);
            b = i % 128;
            if (i % 2 == 0) {
                boolean z3 = obj instanceof c;
                throw null;
            }
            if (!(obj instanceof c)) {
                cVar = (c) obj;
                if (this.f == cVar.f) {
                    int i110 = i10 + 48;
                    int i111 = (i110 ^ (-1)) + (i110 << 1);
                    b = i111 % 128;
                    int i112 = i111 % 2;
                    if (!(!r.I(this.c, cVar.c))) {
                        int i113 = a;
                        int i114 = ((i113 | 20) << 1) - (i113 ^ 20);
                        int i115 = (i114 ^ (-1)) + (i114 << 1);
                        b = i115 % 128;
                        int i116 = i115 % 2;
                        if (!r.I(this.d, cVar.d())) {
                            int i117 = a;
                            int i118 = i117 & 55;
                            i2 = (((i117 | 55) & (~i118)) - (~(-(-(i118 << 1))))) - 1;
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                sArr = this.e;
                                sArrD = j.d(cVar.e);
                                int i210 = 14 / 0;
                            } else {
                                sArr = this.e;
                                sArrD = j.d(cVar.e);
                            }
                            int i211 = a;
                            int i212 = i211 & 83;
                            int i213 = (i212 - (~(-(-((i211 ^ 83) | i212))))) - 1;
                            b = i213 % 128;
                            int i214 = i213 % 2;
                            if (!r.H(sArr, sArrD)) {
                                int i215 = a;
                                int i216 = i215 & 21;
                                int i217 = ((i215 ^ 21) | i216) << 1;
                                int i218 = -((i215 | 21) & (~i216));
                                int i219 = (i217 ^ i218) + ((i218 & i217) << 1);
                                int i35 = i219 % 128;
                                b = i35;
                                int i36 = i219 % 2;
                                int i37 = i35 + 1;
                                a = i37 % 128;
                                int i38 = i37 % 2;
                            }
                        }
                    }
                }
            }
        }
        i3 = b + 107;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
        int i39 = b;
        int i40 = i39 & 5;
        int i41 = i40 + ((i39 ^ 5) | i40);
        a = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 3 / 4;
        }
        z = false;
        i3 = b + 107;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
