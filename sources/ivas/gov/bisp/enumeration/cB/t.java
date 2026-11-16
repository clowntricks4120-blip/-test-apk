package ivas.gov.bisp.enumeration.cB;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p100w.r;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public int d;
    public int e;
    public short[][][] f;
    public short[][] g;
    public short[][][] h;
    public short[] i;

    public t(byte b2, byte b3, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b2 & 255;
        this.c = i;
        int i2 = b3 & 255;
        this.d = i2;
        int i3 = -i;
        int i4 = i2 & i3;
        int i5 = ((i2 ^ i3) | i4) << 1;
        int i6 = -((i3 | i2) & (~i4));
        this.e = (i5 ^ i6) + ((i6 & i5) << 1);
        this.f = sArr;
        this.h = sArr2;
        this.g = sArr3;
        this.i = sArr4;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 15) << 1) - (i3 ^ 15);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = this.c;
        int i8 = this.d;
        int i9 = (-2) - ((i5 + 62) ^ (-1));
        b = i9 % 128;
        if (i9 % 2 == 0) {
            j.b(this.f);
            throw null;
        }
        int i10 = this.e;
        int iB = j.b(this.f);
        int iB2 = j.b(this.h);
        int i11 = a;
        int i12 = (((i11 | 32) << 1) - (i11 ^ 32)) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            j.j(this.g);
            throw null;
        }
        int iJ = j.j(this.g);
        short[] sArr = this.i;
        int i13 = b;
        int i14 = i13 & 81;
        int i15 = (i13 | 81) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 & i16) + (i15 | i16);
        a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = j.i(sArr);
        int i20 = b;
        int i21 = (i20 & (-98)) | ((~i20) & 97);
        int i22 = (i20 & 97) << 1;
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        int i25 = i7 * 37;
        int i26 = -(-i8);
        int i27 = i25 & i26;
        int i28 = (((((i25 ^ i26) | i27) << 1) - (~(-((i25 | i26) & (~i27))))) - 1) * 37;
        int i29 = i28 & i10;
        int i30 = (((i10 | i28) & (~i29)) + (i29 << 1)) * 37;
        int i31 = i20 + 93;
        int i32 = i31 % 128;
        a = i32;
        int i33 = i31 % 2;
        int i34 = -(-i30);
        int i35 = iB & i34;
        int i36 = -(-((i35 + ((i34 ^ iB) | i35)) * 37));
        int i37 = (((iB2 & i36) - (~(-(-(i36 | iB2))))) - 1) * 37;
        int i38 = (((iJ ^ i37) | (iJ & i37)) << 1) - ((i37 & (~iJ)) | ((~i37) & iJ));
        int i39 = ((i32 & (-112)) | ((~i32) & 111)) + ((i32 & 111) << 1);
        b = i39 % 128;
        int i40 = i38 * 37;
        if (i39 % 2 == 0) {
            i = i19 >>> i40;
        } else {
            int i41 = i19 & i40;
            int i42 = (i40 ^ i19) | i41;
            i = (i42 | i41) + (i41 & i42);
        }
        int i43 = i32 & 41;
        int i44 = i43 + ((i32 ^ 41) | i43);
        b = i44 % 128;
        int i45 = i44 % 2;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054 A[PHI: r8
  0x0054: PHI (r8v11 ivas.gov.bisp.enumeration.cB.t) = (r8v10 ivas.gov.bisp.enumeration.cB.t), (r8v21 ivas.gov.bisp.enumeration.cB.t) binds: [B:12:0x0052, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:34:0x0102  */
    public boolean equals(Object obj) {
        t tVar;
        int i;
        short[][][] sArr;
        short[][][] sArr2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 37;
        int i7 = i6 - (~((i5 ^ 37) | i6));
        boolean z = true;
        int i8 = i7 - 1;
        int i9 = i8 % 128;
        b = i9;
        int i10 = i8 % 2;
        if (obj != null) {
            int i11 = i9 & 57;
            int i12 = ((i9 ^ 57) | i11) << 1;
            int i13 = -((~i11) & (i9 | 57));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            if (obj instanceof t) {
                int i16 = i9 & 97;
                int i17 = (i9 | 97) & (~i16);
                int i18 = i16 << 1;
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = i19 % 128;
                a = i20;
                if (i19 % 2 != 0) {
                    tVar = (t) obj;
                    int i21 = 5 / 0;
                    if (this.c == tVar.c) {
                        if (this.d == tVar.d) {
                            int i22 = (((i20 | 16) << 1) - (i20 ^ 16)) - 1;
                            i = i22 % 128;
                            b = i;
                            int i23 = i22 % 2;
                            if (this.e == tVar.e) {
                                int i24 = i & 109;
                                int i25 = (i | 109) & (~i24);
                                int i26 = i24 << 1;
                                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                                int i28 = i27 % 128;
                                a = i28;
                                int i29 = i27 % 2;
                                sArr = this.f;
                                sArr2 = tVar.f;
                                int i30 = (i28 & 15) + (i28 | 15);
                                b = i30 % 128;
                                int i31 = i30 % 2;
                                if (r.J(sArr, sArr2)) {
                                    int i32 = b + 61;
                                    a = i32 % 128;
                                    int i33 = i32 % 2;
                                    if (!(!r.J(this.h, tVar.h))) {
                                        int i34 = a;
                                        int i35 = i34 & 3;
                                        int i36 = -(-(i34 | 3));
                                        i2 = (i35 & i36) + (i36 | i35);
                                        b = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            r.I(this.g, tVar.g);
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (!(!r.I(this.g, tVar.g)) && r.H(this.i, tVar.i)) {
                                            int i37 = a;
                                            int i38 = (((i37 & (-28)) | ((~i37) & 27)) - (~(-(-((i37 & 27) << 1))))) - 1;
                                            b = i38 % 128;
                                            int i39 = i38 % 2;
                                            i3 = (((i37 | 100) << 1) - (i37 ^ 100)) - 1;
                                            b = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                int i40 = 5 / 5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    tVar = (t) obj;
                    if (this.c == tVar.c) {
                        if (this.d == tVar.d) {
                            int i210 = (((i20 | 16) << 1) - (i20 ^ 16)) - 1;
                            i = i210 % 128;
                            b = i;
                            int i211 = i210 % 2;
                            if (this.e == tVar.e) {
                                int i212 = i & 109;
                                int i213 = (i | 109) & (~i212);
                                int i214 = i212 << 1;
                                int i215 = (i213 ^ i214) + ((i213 & i214) << 1);
                                int i216 = i215 % 128;
                                a = i216;
                                int i217 = i215 % 2;
                                sArr = this.f;
                                sArr2 = tVar.f;
                                int i310 = (i216 & 15) + (i216 | 15);
                                b = i310 % 128;
                                int i311 = i310 % 2;
                                if (r.J(sArr, sArr2)) {
                                    int i312 = b + 61;
                                    a = i312 % 128;
                                    int i313 = i312 % 2;
                                    if (!(!r.J(this.h, tVar.h))) {
                                        int i314 = a;
                                        int i315 = i314 & 3;
                                        int i316 = -(-(i314 | 3));
                                        i2 = (i315 & i316) + (i316 | i315);
                                        b = i2 % 128;
                                        if (i2 % 2 != 0) {
                                            r.I(this.g, tVar.g);
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        if (!(!r.I(this.g, tVar.g))) {
                                            int i317 = a;
                                            int i318 = (((i317 & (-28)) | ((~i317) & 27)) - (~(-(-((i317 & 27) << 1))))) - 1;
                                            b = i318 % 128;
                                            int i319 = i318 % 2;
                                            i3 = (((i317 | 100) << 1) - (i317 ^ 100)) - 1;
                                            b = i3 % 128;
                                            if (i3 % 2 == 0) {
                                                int i41 = 5 / 5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i42 = b;
                int i43 = ((i42 & 97) - (~(-(-(i42 | 97))))) - 1;
                a = i43 % 128;
                int i44 = i43 % 2;
                z = false;
            } else {
                int i45 = b;
                int i46 = ((i45 & 97) - (~(-(-(i45 | 97))))) - 1;
                a = i46 % 128;
                int i47 = i46 % 2;
                z = false;
            }
        } else {
            int i48 = b;
            int i49 = ((i48 & 97) - (~(-(-(i48 | 97))))) - 1;
            a = i49 % 128;
            int i410 = i49 % 2;
            z = false;
        }
        int i50 = b + 81;
        a = i50 % 128;
        int i51 = i50 % 2;
        return z;
    }
}
