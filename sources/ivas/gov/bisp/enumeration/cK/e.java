package ivas.gov.bisp.enumeration.cK;

import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static int a = 1;
    private static int b;
    public c c;
    public int d;
    public int[] e;

    public e(c cVar, int i) {
        this.c = cVar;
        this.d = i;
        int i2 = i ^ 1;
        int i3 = ((i & 1) | i2) << 1;
        int i4 = -i2;
        int[] iArr = new int[((i3 | i4) << 1) - (i4 ^ i3)];
        this.e = iArr;
        iArr[i] = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b5, code lost:
    
        if (r9[r9.length] != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01bf, code lost:
    
        if (r9[(r1 ^ (-1)) + (r1 << 1)] != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c7, code lost:
    
        throw new java.lang.IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(ivas.gov.bisp.enumeration.cK.c r17, byte[] r18) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cK.e.<init>(ivas.gov.bisp.enumeration.cK.c, byte[]):void");
    }

    public e(e eVar) {
        this.c = eVar.c;
        this.d = eVar.d;
        this.e = ivas.gov.bisp.enumeration.p100w.r.j(eVar.e);
    }

    public static int f(int[] iArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 53;
        int i5 = (i4 - (~(-(-((i3 ^ 53) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int length = (-2) - (iArr.length ^ (-1));
        int i7 = i3 ^ 95;
        int i8 = ((i3 & 95) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        while (length >= 0) {
            int i12 = b;
            int i13 = ((i12 ^ 28) + ((i12 & 28) << 1)) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            if (iArr[length] != 0) {
                break;
            }
            int i15 = i12 & 9;
            int i16 = -(-((i12 ^ 9) | i15));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                i = (length ^ 90) + ((length & 90) << 1);
            } else {
                int i18 = length & 94;
                i = (i18 + ((length ^ 94) | i18)) - 95;
            }
            length = i;
            int i19 = ((i12 | 37) << 1) - (i12 ^ 37);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a;
        int i22 = i21 & 59;
        int i23 = (((i21 | 59) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
        b = i23 % 128;
        int i24 = i23 % 2;
        return length;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e4 A[EDGE_INSN: B:28:0x00e4->B:32:0x0105 BREAK  A[LOOP:0: B:20:0x00aa->B:46:0x00aa]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa A[SYNTHETIC] */
    public boolean equals(Object obj) {
        e eVar;
        int i;
        int[] iArr;
        int[] iArr2;
        int iF;
        Object obj2;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = b;
        int i9 = (i8 | 115) << 1;
        int i10 = -((i8 & (-116)) | ((~i8) & 115));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        if (obj != null) {
            int i13 = i8 & 89;
            int i14 = i13 + ((i8 ^ 89) | i13);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 / 0;
                if (!(!(obj instanceof e))) {
                    int i16 = i8 & 67;
                    int i17 = -(-((i8 ^ 67) | i16));
                    int i18 = (i16 & i17) + (i17 | i16);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    eVar = (e) obj;
                    if (this.c.equals(eVar.c)) {
                        int i20 = a;
                        int i21 = (i20 & (-92)) | ((~i20) & 91);
                        int i22 = -(-((i20 & 91) << 1));
                        int i23 = (i21 & i22) + (i22 | i21);
                        i = i23 % 128;
                        b = i;
                        int i24 = i23 % 2;
                        if (this.d == eVar.d) {
                            int i25 = i + 65;
                            a = i25 % 128;
                            int i26 = i25 % 2;
                            iArr = this.e;
                            iArr2 = eVar.e;
                            iF = f(iArr);
                            int i27 = b;
                            int i28 = i27 & 61;
                            int i29 = (((i27 | 61) & (~i28)) - (~(i28 << 1))) - 1;
                            a = i29 % 128;
                            int i30 = i29 % 2;
                            obj2 = null;
                            if (iF != f(iArr2)) {
                                int i31 = b;
                                int i32 = ((i31 | 19) << 1) - (((~i31) & 19) | (i31 & (-20)));
                                a = i32 % 128;
                                int i33 = i32 % 2;
                                i3 = 0;
                                while (true) {
                                    if (i3 <= iF) {
                                        int i34 = a + 117;
                                        b = i34 % 128;
                                        int i35 = i34 % 2;
                                        z = true;
                                        break;
                                    }
                                    i4 = b;
                                    int i36 = i4 & 55;
                                    int i37 = -(-((i4 ^ 55) | i36));
                                    i5 = ((i36 | i37) << 1) - (i36 ^ i37);
                                    a = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        int i38 = iArr[i3];
                                        int i39 = iArr2[i3];
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (iArr[i3] == iArr2[i3]) {
                                        int i40 = a;
                                        int i41 = (i40 ^ 5) + ((i40 & 5) << 1);
                                        b = i41 % 128;
                                        int i42 = i41 % 2;
                                        z = false;
                                        break;
                                    }
                                    int i43 = ((i3 | (-89)) << 1) - (i3 ^ (-89));
                                    i3 = (i43 & 90) + (i43 | 90);
                                    i6 = ((i4 ^ 106) + ((i4 & 106) << 1)) - 1;
                                    a = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        int i44 = 3 % 5;
                                    }
                                }
                            } else {
                                int i45 = a;
                                int i46 = (i45 ^ 5) + ((i45 & 5) << 1);
                                b = i46 % 128;
                                int i47 = i46 % 2;
                                z = false;
                                break;
                            }
                            if (z) {
                                int i48 = a;
                                int i49 = (i48 ^ 59) + ((i48 & 59) << 1);
                                int i50 = i49 % 128;
                                b = i50;
                                int i51 = i49 % 2;
                                int i52 = i50 & 121;
                                int i53 = (i50 | 121) & (~i52);
                                int i54 = -(-(i52 << 1));
                                i2 = (i53 & i54) + (i53 | i54);
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return true;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            } else if (obj instanceof e) {
                int i110 = i8 & 67;
                int i111 = -(-((i8 ^ 67) | i110));
                int i112 = (i110 & i111) + (i111 | i110);
                a = i112 % 128;
                int i113 = i112 % 2;
                eVar = (e) obj;
                if (this.c.equals(eVar.c)) {
                    int i210 = a;
                    int i211 = (i210 & (-92)) | ((~i210) & 91);
                    int i212 = -(-((i210 & 91) << 1));
                    int i213 = (i211 & i212) + (i212 | i211);
                    i = i213 % 128;
                    b = i;
                    int i214 = i213 % 2;
                    if (this.d == eVar.d) {
                        int i215 = i + 65;
                        a = i215 % 128;
                        int i216 = i215 % 2;
                        iArr = this.e;
                        iArr2 = eVar.e;
                        iF = f(iArr);
                        int i217 = b;
                        int i218 = i217 & 61;
                        int i219 = (((i217 | 61) & (~i218)) - (~(i218 << 1))) - 1;
                        a = i219 % 128;
                        int i310 = i219 % 2;
                        obj2 = null;
                        if (iF != f(iArr2)) {
                            int i311 = b;
                            int i312 = ((i311 | 19) << 1) - (((~i311) & 19) | (i311 & (-20)));
                            a = i312 % 128;
                            int i313 = i312 % 2;
                            i3 = 0;
                            while (true) {
                                if (i3 <= iF) {
                                    int i314 = a + 117;
                                    b = i314 % 128;
                                    int i315 = i314 % 2;
                                    z = true;
                                    break;
                                }
                                i4 = b;
                                int i316 = i4 & 55;
                                int i317 = -(-((i4 ^ 55) | i316));
                                i5 = ((i316 | i317) << 1) - (i316 ^ i317);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i318 = iArr[i3];
                                    int i319 = iArr2[i3];
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (iArr[i3] == iArr2[i3]) {
                                    int i410 = a;
                                    int i411 = (i410 ^ 5) + ((i410 & 5) << 1);
                                    b = i411 % 128;
                                    int i412 = i411 % 2;
                                    z = false;
                                    break;
                                }
                                int i413 = ((i3 | (-89)) << 1) - (i3 ^ (-89));
                                i3 = (i413 & 90) + (i413 | 90);
                                i6 = ((i4 ^ 106) + ((i4 & 106) << 1)) - 1;
                                a = i6 % 128;
                                if (i6 % 2 == 0) {
                                    int i414 = 3 % 5;
                                }
                            }
                        } else {
                            int i415 = a;
                            int i416 = (i415 ^ 5) + ((i415 & 5) << 1);
                            b = i416 % 128;
                            int i417 = i416 % 2;
                            z = false;
                            break;
                        }
                        if (z) {
                            int i418 = a;
                            int i419 = (i418 ^ 59) + ((i418 & 59) << 1);
                            int i55 = i419 % 128;
                            b = i55;
                            int i56 = i419 % 2;
                            int i57 = i55 & 121;
                            int i58 = (i55 | 121) & (~i57);
                            int i59 = -(-(i57 << 1));
                            i2 = (i58 & i59) + (i58 | i59);
                            a = i2 % 128;
                            if (i2 % 2 != 0) {
                                return true;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }
        int i60 = b;
        int i61 = i60 & 63;
        int i62 = ((((i60 ^ 63) | i61) << 1) - (~(-((i60 | 63) & (~i61))))) - 1;
        a = i62 % 128;
        if (i62 % 2 == 0) {
            int i63 = 46 / 0;
        }
        return false;
    }

    public final int[] h(int[] iArr, int[] iArr2) {
        int[] iArr3;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 & 30) + (i4 | 30)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        if (iArr.length < iArr2.length) {
            int i7 = i4 + 91;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            iArr3 = new int[iArr2.length];
            int i10 = i8 + 41;
            a = i10 % 128;
            int i11 = i10 % 2;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            int i12 = b;
            int i13 = i12 & 77;
            int i14 = (i12 ^ 77) | i13;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int[] iArr4 = new int[iArr.length];
            int i17 = i4 + 121;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                throw null;
            }
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            iArr = iArr2;
            iArr3 = iArr4;
        }
        int length = iArr.length;
        int i18 = b;
        int i19 = i18 | 49;
        int i20 = i19 << 1;
        int i21 = -((~(i18 & 49)) & i19);
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        while (true) {
            int i23 = i22 % 2;
            length = (((length | 115) << 1) - (length ^ 115)) - 116;
            if (length < 0) {
                int i24 = b;
                int i25 = i24 ^ 43;
                int i26 = ((i24 & 43) | i25) << 1;
                int i27 = -i25;
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                a = i28 % 128;
                int i29 = i28 % 2;
                return iArr3;
            }
            int i30 = b;
            int i31 = (i30 ^ 65) + ((i30 & 65) << 1);
            a = i31 % 128;
            int i32 = i31 % 2;
            c cVar = this.c;
            if (i32 == 0) {
                i = iArr3[length];
                i2 = iArr[length];
                int i33 = 62 / 0;
            } else {
                i = iArr3[length];
                i2 = iArr[length];
            }
            Objects.requireNonNull(cVar);
            int i34 = i & i2;
            iArr3[length] = (i34 | (i ^ i2)) & (~i34);
            int i35 = a;
            int i36 = i35 & 61;
            i22 = (((i35 ^ 61) | i36) << 1) - ((i35 | 61) & (~i36));
            b = i22 % 128;
        }
    }

    public final void i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 105) | (i2 & 105)) << 1;
        int i4 = -(((~i2) & 105) | (i2 & (-106)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int length = this.e.length;
        int i8 = ((i6 & 70) + (i6 | 70)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        do {
            length--;
            this.d = length;
            int i10 = b;
            int i11 = i10 ^ 97;
            int i12 = ((i10 & 97) | i11) << 1;
            int i13 = -i11;
            int i14 = (i12 & i13) + (i12 | i13);
            int i15 = i14 % 128;
            a = i15;
            int i16 = i14 % 2;
            if (length < 0) {
                break;
            }
            int i17 = i15 + 29;
            b = i17 % 128;
            int i18 = i17 % 2;
        } while (this.e[length] == 0);
        int i19 = b + 101;
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    public int j(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 42) + ((i3 & 42) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (i >= 0) {
            int i7 = (i3 & (-124)) | ((~i3) & 123);
            int i8 = (i3 & 123) << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            int i10 = i9 % 128;
            a = i10;
            if (i9 % 2 == 0) {
                throw null;
            }
            if (i <= this.d) {
                int i11 = i10 ^ 19;
                int i12 = -(-((i10 & 19) << 1));
                int i13 = (i11 & i12) + (i11 | i12);
                int i14 = i13 % 128;
                b = i14;
                int i15 = i13 % 2;
                int i16 = this.e[i];
                int i17 = i14 & 25;
                int i18 = (i14 | 25) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                return i16;
            }
        }
        int i22 = ((i3 ^ 86) + ((i3 & 86) << 1)) - 1;
        a = i22 % 128;
        int i23 = i22 % 2;
        return 0;
    }

    public int l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = (i2 ^ 19) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int[] iArr = this.e;
        int length = iArr.length;
        int i7 = length + ((length ^ (-1)) | length);
        int i8 = i2 & 67;
        int i9 = i2 | 67;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        b = i11;
        if (i10 % 2 != 0) {
            int i12 = iArr[i7];
            throw null;
        }
        if (iArr[i7] == 0) {
            int i13 = (-2) - (((i11 & 94) + (i11 | 94)) ^ (-1));
            a = i13 % 128;
            int i14 = i13 % 2;
            return -1;
        }
        int i15 = i11 & 13;
        int i16 = (i11 ^ 13) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        a = i17 % 128;
        int i18 = i17 % 2;
        return i7;
    }

    public void m(int i) {
        int i2 = 2 % 2;
        int i3 = b + 113;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!this.c.e(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        int i5 = b;
        int i6 = ((i5 ^ 77) | (i5 & 77)) << 1;
        int i7 = -(((~i5) & 77) | (i5 & (-78)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        this.e = g(this.e, i);
        int i10 = a;
        int i11 = i10 & 89;
        int i12 = i11 + ((i10 ^ 89) | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        i();
        int i14 = b;
        int i15 = i14 & 39;
        int i16 = (i14 | 39) & (~i15);
        int i17 = i15 << 1;
        int i18 = (i16 & i17) + (i16 | i17);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    public e n(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 109;
        int i5 = (((i3 | 109) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.c.e(i);
            throw null;
        }
        if (!this.c.e(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        e eVar = new e(this.c, g(this.e, i));
        int i6 = b;
        int i7 = (i6 ^ 117) + ((i6 & 117) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return eVar;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i;
        int i2;
        StringBuilder sb;
        String str;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 29;
        int i6 = ((i4 & 29) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            ivas.gov.bisp.enumeration.p091n.j.w(" Polynomial over ");
            throw null;
        }
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(" Polynomial over ");
        c cVar = this.c;
        int i9 = b;
        int i10 = i9 & 105;
        int i11 = (i9 ^ 105) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        sbW.append(cVar.toString());
        sbW.append(": \n");
        int i14 = b;
        int i15 = (i14 ^ 19) + ((i14 & 19) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        String string = sbW.toString();
        int i17 = a + 53;
        b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < this.e.length) {
            int i20 = a;
            int i21 = (i20 | 65) << 1;
            int i22 = -(i20 ^ 65);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            b = i23 % 128;
            int i24 = i23 % 2;
            StringBuilder sbW2 = ivas.gov.bisp.enumeration.p091n.j.w(string);
            c cVar2 = this.c;
            int[] iArr = this.e;
            int i25 = a;
            int i26 = ((i25 | 11) << 1) - (i25 ^ 11);
            b = i26 % 128;
            int i27 = i26 % 2 != 0 ? iArr[i19] : iArr[i19];
            String strU = BuildConfig.FLAVOR;
            int i28 = 0;
            while (i28 < cVar2.c) {
                int i29 = b + 71;
                a = i29 % 128;
                int i30 = i29 % 2;
                if ((((byte) i27) & 1) == 0) {
                    sb = new StringBuilder();
                    int i31 = b;
                    int i32 = ((i31 ^ 30) + ((i31 & 30) << 1)) - 1;
                    a = i32 % 128;
                    int i33 = i32 % 2;
                    str = "0";
                } else {
                    sb = new StringBuilder();
                    int i34 = a + 81;
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    str = "1";
                }
                strU = ivas.gov.bisp.enumeration.p091n.j.u(sb, str, strU);
                int i36 = b;
                int i37 = (i36 & (-90)) | ((~i36) & 89);
                int i38 = -(-((i36 & 89) << 1));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                a = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = i27 & 1;
                    int i41 = (i40 - (~((i27 ^ 1) | i40))) - 1;
                    int i42 = i28 & 17;
                    int i43 = (i28 | 17) & (~i42);
                    int i44 = -(-(i42 << 1));
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    int i46 = i45 & 3;
                    i28 = i46 + ((i45 ^ 3) | i46);
                    i27 = i41;
                } else {
                    i27 >>>= 1;
                    int i47 = (i28 & 2) + (i28 | 2);
                    i28 = (i47 ^ (-1)) + (i47 << 1);
                }
            }
            sbW2.append(strU);
            sbW2.append("Y^");
            int i48 = b + 61;
            a = i48 % 128;
            int i49 = i48 % 2;
            sbW2.append(i19);
            sbW2.append("+");
            int i50 = a;
            int i51 = ((i50 & 60) + (i50 | 60)) - 1;
            b = i51 % 128;
            if (i51 % 2 != 0) {
                string = sbW2.toString();
                int i52 = (i19 & 14) | ((~i19) & (-15));
                int i53 = -(-((i19 & (-15)) << 1));
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                int i55 = i54 ^ 128;
                int i56 = -(-((i54 & 128) << 1));
                i = i55 & i56;
                i2 = i55 | i56;
            } else {
                string = sbW2.toString();
                int i57 = i19 & (-95);
                int i58 = ((i19 | (-95)) & (~i57)) + (i57 << 1);
                int i59 = i58 ^ 96;
                int i60 = ((i58 & 96) | i59) << 1;
                int i61 = -i59;
                i = i60 ^ i61;
                i2 = (i60 & i61) << 1;
            }
            i19 = i + i2;
            int i62 = a;
            int i63 = (i62 ^ 81) + ((i62 & 81) << 1);
            b = i63 % 128;
            if (i63 % 2 != 0) {
                int i64 = 2 / 5;
            }
        }
        String strR = ivas.gov.bisp.enumeration.p091n.j.r(string, ";");
        int i65 = a;
        int i66 = ((i65 | 65) << 1) - (i65 ^ 65);
        b = i66 % 128;
        int i67 = i66 % 2;
        return strR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r11 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r11 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r11 = (r5 ^ 111) + ((r5 & 111) << 1);
        r1 = r11 % 128;
        ivas.gov.bisp.enumeration.cK.e.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if ((r11 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r11 = new int[r10.length];
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r11 = new int[r10.length];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r5 = r1 & 117;
        r5 = (r5 - (~(-(-((r1 ^ 117) | r5))))) - 1;
        ivas.gov.bisp.enumeration.cK.e.a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if ((r5 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        java.lang.System.arraycopy(r10, 0, r11, r3, r10.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        java.lang.System.arraycopy(r10, 0, r11, r3, r10.length);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        r3 = new int[((r1 & 2) + (r1 | 2)) - 1];
        r6 = ((r5 & (-26)) | ((~r5) & 25)) + ((r5 & 25) << 1);
        ivas.gov.bisp.enumeration.cK.e.b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r1 < 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r5 = ivas.gov.bisp.enumeration.cK.e.b;
        r6 = ((r5 ^ 73) | (r5 & 73)) << 1;
        r5 = -(((~r5) & 73) | (r5 & (-74)));
        r7 = (r6 ^ r5) + ((r5 & r6) << 1);
        ivas.gov.bisp.enumeration.cK.e.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if ((r7 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r3[r1] = r9.c.f(r10[r1], r11);
        r5 = ivas.gov.bisp.enumeration.cK.e.b;
        r6 = r5 + 15;
        ivas.gov.bisp.enumeration.cK.e.a = r6 % 128;
        r6 = r6 % 2;
        r1 = ((r1 ^ (-76)) + ((r1 & (-76)) << 1)) + 75;
        r6 = r5 & 11;
        r6 = r6 + ((r5 ^ 11) | r6);
        ivas.gov.bisp.enumeration.cK.e.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r3[r1] = r9.c.f(r10[r1], r11);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        r10 = ivas.gov.bisp.enumeration.cK.e.b + 17;
        ivas.gov.bisp.enumeration.cK.e.a = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        if ((r10 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r11 != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] g(int[] r10, int r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cK.e.g(int[], int):int[]");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = ((i2 ^ 21) | i3) << 1;
        int i5 = -((i2 | 21) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.c.d;
        int i9 = a + 101;
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (true) {
            int[] iArr = this.e;
            if (i11 >= iArr.length) {
                int i12 = b;
                int i13 = (i12 & 25) + (i12 | 25);
                a = i13 % 128;
                int i14 = i13 % 2;
                return i8;
            }
            int i15 = b + 63;
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            int i18 = i8 * 31;
            int i19 = iArr[i11];
            int i20 = i18 & i19;
            int i21 = (i18 | i19) & (~i20);
            int i22 = i20 << 1;
            i8 = ((i21 | i22) << 1) - (i21 ^ i22);
            int i23 = i11 & 1;
            i11 = ((i11 | 1) & (~i23)) + (i23 << 1);
            int i24 = (-2) - (((i16 & 52) + (i16 | 52)) ^ (-1));
            b = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    public byte[] k() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 | 33;
        int i6 = i5 << 1;
        int i7 = -(i5 & (~(i4 & 33)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            i = 112;
            i2 = 0;
        } else {
            i = 8;
            i2 = 1;
        }
        int i9 = i4 & 27;
        int i10 = (i4 ^ 27) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        while (true) {
            b = i11 % 128;
            int i12 = i11 % 2;
            if (this.c.c <= i) {
                break;
            }
            int i13 = a;
            int i14 = i13 + 23;
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((i2 & 127) - (~(-(-(i2 | 127))))) - 1;
            int i17 = i16 & (-126);
            int i18 = -(-((i16 ^ (-126)) | i17));
            i2 = ((i17 | i18) << 1) - (i17 ^ i18);
            i += 8;
            int i19 = i13 ^ 57;
            int i20 = ((i13 & 57) | i19) << 1;
            int i21 = -i19;
            i11 = ((i20 | i21) << 1) - (i20 ^ i21);
        }
        byte[] bArr = new byte[this.e.length * i2];
        int i22 = a;
        int i23 = i22 & 123;
        int i24 = ((i22 | 123) & (~i23)) + (i23 << 1);
        int i25 = i24 % 128;
        b = i25;
        int i26 = i24 % 2;
        int i27 = i25 & 49;
        int i28 = (i25 ^ 49) | i27;
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        a = i29 % 128;
        int i30 = i29 % 2;
        int i31 = 0;
        int i32 = 0;
        while (i31 < this.e.length) {
            int i33 = b;
            int i34 = i33 & 119;
            int i35 = i33 | 119;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            a = i36 % 128;
            int i37 = i36 % 2 == 0 ? 1 : 0;
            int i38 = ((i33 ^ 39) - (~(-(-((i33 & 39) << 1))))) - 1;
            a = i38 % 128;
            int i39 = i38 % 2;
            while (i37 < i) {
                int i40 = b;
                int i41 = i40 & 79;
                int i42 = ((((i40 ^ 79) | i41) << 1) - (~(-((i40 | 79) & (~i41))))) - 1;
                int i43 = i42 % 128;
                a = i43;
                if (i42 % 2 == 0) {
                    bArr[i32] = (byte) (this.e[i31] / i37);
                    int i44 = i37 ^ 196;
                    int i45 = ((i37 & 196) | i44) << 1;
                    int i46 = -i44;
                    int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                    int i48 = i47 & (-116);
                    int i49 = (~i48) & (i47 | (-116));
                    int i50 = -(-(i48 << 1));
                    i37 = (i49 & i50) + (i50 | i49);
                } else {
                    bArr[i32] = (byte) (this.e[i31] >>> i37);
                    i37 += 8;
                }
                int i51 = ((i43 ^ 19) - (~(-(-((i43 & 19) << 1))))) - 1;
                int i52 = i51 % 128;
                b = i52;
                int i53 = i51 % 2;
                i32 = (((i32 | 2) << 1) - (i32 ^ 2)) - 1;
                int i54 = (((i52 | 66) << 1) - (i52 ^ 66)) - 1;
                a = i54 % 128;
                int i55 = i54 % 2;
            }
            int i56 = (i31 & (-118)) + (i31 | (-118));
            int i57 = (i56 ^ (-1)) + (i56 << 1);
            int i58 = i57 ^ 120;
            i31 = (((i57 & 120) | i58) << 1) - i58;
            int i59 = b;
            int i60 = ((i59 & (-108)) | ((~i59) & 107)) + ((i59 & 107) << 1);
            a = i60 % 128;
            int i61 = i60 % 2;
        }
        int i62 = a;
        int i63 = i62 & 65;
        int i64 = i63 + ((i62 ^ 65) | i63);
        b = i64 % 128;
        if (i64 % 2 == 0) {
            return bArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0090 A[PHI: r0
  0x0090: PHI (r0v4 int[]) = (r0v2 int[]), (r0v11 int[]) binds: [B:14:0x008d, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    public e(c cVar, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        this.c = cVar;
        int iF = f(iArr);
        if (iF == -1) {
            iArr3 = new int[1];
            int i = a;
            int i2 = i ^ 9;
            int i3 = (i & 9) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } else {
            int i6 = ((iF ^ 109) + ((iF & 109) << 1)) - 108;
            if (iArr.length == i6) {
                int i7 = b;
                int i8 = i7 & 83;
                int i9 = ((i7 | 83) & (~i8)) + (i8 << 1);
                int i10 = i9 % 128;
                a = i10;
                int i11 = i9 % 2;
                iArr2 = new int[iArr.length];
                int length = iArr.length;
                int i12 = i10 & 119;
                int i13 = (i10 ^ 119) | i12;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int i16 = b;
                int i17 = i16 & 9;
                int i18 = (((i16 | 9) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
                a = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 2 % 2;
                }
            } else {
                iArr2 = new int[i6];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                int i20 = a;
                int i21 = ((i20 ^ 87) | (i20 & 87)) << 1;
                int i22 = -(((~i20) & 87) | (i20 & (-88)));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    int i110 = 2 % 2;
                }
            }
            iArr3 = iArr2;
        }
        this.e = iArr3;
        i();
        int i24 = b;
        int i25 = (((i24 & (-116)) | ((~i24) & 115)) - (~((i24 & 115) << 1))) - 1;
        a = i25 % 128;
        int i26 = i25 % 2;
    }
}
