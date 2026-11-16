package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p063ci.C0278x;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class e implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public final Map<Integer, C0238r> c = new TreeMap();
    public transient long d;

    public e(long j) {
        this.d = j;
    }

    public e(e eVar, long j) {
        Iterator<Integer> it = eVar.c.keySet().iterator();
        int i = 2 % 2;
        while (it.hasNext()) {
            int i2 = a;
            int i3 = (i2 & (-114)) | ((~i2) & 113);
            int i4 = -(-((i2 & 113) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                it.next();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Integer next = it.next();
            Map<Integer, C0238r> map = this.c;
            C0238r c0238r = new C0238r(eVar.c.get(next));
            int i6 = b;
            int i7 = (((i6 | 56) << 1) - (i6 ^ 56)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            map.put(next, c0238r);
            int i9 = a;
            int i10 = (-2) - (((i9 & 70) + (i9 | 70)) ^ (-1));
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        this.d = j;
        int i12 = a;
        int i13 = i12 & 51;
        int i14 = -(-((i12 ^ 51) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    public e f(C0278x c0278x) {
        Integer next;
        int i = 2 % 2;
        e eVar = new e(this.d);
        int i2 = b;
        int i3 = ((i2 ^ 36) + ((i2 & 36) << 1)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.c.keySet().iterator();
            throw null;
        }
        Iterator<Integer> it = this.c.keySet().iterator();
        int i4 = b;
        int i5 = ((i4 ^ 113) - (~(-(-((i4 & 113) << 1))))) - 1;
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = (i6 & (-106)) | ((~i6) & 105);
        int i9 = -(-((i6 & 105) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        while (it.hasNext()) {
            int i12 = (-2) - ((b + 40) ^ (-1));
            a = i12 % 128;
            if (i12 % 2 != 0) {
                next = it.next();
                int i13 = 67 / 0;
            } else {
                next = it.next();
            }
            Map<Integer, C0238r> map = eVar.c;
            C0238r c0238r = this.c.get(next);
            Objects.requireNonNull(c0238r);
            C0238r c0238r2 = new C0238r(c0238r, c0278x);
            int i14 = b;
            int i15 = i14 ^ 91;
            int i16 = ((i14 & 91) | i15) << 1;
            int i17 = -i15;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            map.put(next, c0238r2);
            if (i19 != 0) {
                obj.hashCode();
                throw null;
            }
            int i20 = a;
            int i21 = (i20 & 33) + (i20 | 33);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((i20 ^ 88) + ((i20 & 88) << 1)) - 1;
            b = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = b;
        int i26 = i25 & 55;
        int i27 = ((((i25 ^ 55) | i26) << 1) - (~(-((i25 | 55) & (~i26))))) - 1;
        a = i27 % 128;
        if (i27 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    public C0238r e(int i, byte[] bArr, byte[] bArr2, C0234l c0234l) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 89) + ((i3 & 89) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        Map<Integer, C0238r> map = this.c;
        C0238r c0238r = new C0238r(map.get(Integer.valueOf(i)), bArr, bArr2, c0234l);
        int i6 = a + 59;
        b = i6 % 128;
        int i7 = i6 % 2;
        C0238r c0238rPut = map.put(Integer.valueOf(i), c0238r);
        int i8 = b;
        int i9 = (i8 & (-12)) | ((~i8) & 11);
        int i10 = -(-((i8 & 11) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return c0238rPut;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x03e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:30:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x0329  */
    /* JADX WARN: Code duplicated, block: B:61:0x033e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0345  */
    /* JADX WARN: Code duplicated, block: B:76:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x03ef  */
    public e(M m, long j, byte[] bArr, byte[] bArr2) {
        C0234l c0234l;
        int i;
        long j2;
        long j3;
        int i2;
        int i3;
        int i4;
        int i5;
        S s;
        int i6;
        boolean z;
        int i7;
        int i8;
        C0238r c0238r;
        int i9;
        int i10;
        int i11;
        M m2 = m;
        long j4 = 1;
        this.d = (1 << m2.f) - 1;
        int i12 = 2;
        int i13 = 2 % 2;
        long j5 = 0;
        while (j5 < j) {
            int i14 = b + 11;
            a = i14 % 128;
            if (i14 % i12 != 0) {
                int i15 = m2.e.e;
                throw null;
            }
            S s2 = m2.e;
            int i16 = s2.e;
            long j6 = j5 >> i16;
            long j7 = (j4 << i16) - j4;
            int i17 = (int) (j5 & j7);
            C0234l.bCT bct = new C0234l.bCT();
            int i18 = b;
            int i19 = (i18 & 124) + (i18 | 124);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            if (i20 % i12 != 0) {
                ((C0234l.bCT) bct.f(j6)).h = i17;
                throw null;
            }
            C0234l.bCT bct2 = (C0234l.bCT) bct.f(j6);
            bct2.h = i17;
            int i21 = a;
            int i22 = (i21 ^ 87) + ((i21 & 87) << 1);
            b = i22 % 128;
            if (i22 % i12 == 0) {
                c0234l = (C0234l) bct2.g();
                i = 1 >>> i16;
            } else {
                c0234l = (C0234l) bct2.g();
                i = 1 << i16;
            }
            int i23 = (-2) - (~i);
            if (i17 < i23) {
                int i24 = b;
                int i25 = i24 & 23;
                int i26 = (((~i25) & (i24 | 23)) - (~(-(-(i25 << 1))))) - 1;
                a = i26 % 128;
                int i27 = i26 % 2;
                if (this.c.get(0) != null) {
                    int i28 = b;
                    int i29 = i28 & 77;
                    int i30 = ((i28 | 77) & (~i29)) + (i29 << 1);
                    a = i30 % 128;
                    if (i30 % 2 != 0) {
                        int i31 = 46 / 0;
                        if (i17 == 0) {
                            a aVarC = s2.c();
                            int i32 = s2.e;
                            j2 = j6;
                            c0238r = new C0238r(aVarC, i32, s2.f, (1 << i32) - 1);
                            int i33 = b;
                            i9 = (i33 ^ 23) + ((i33 & 23) << 1);
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                Object obj = null;
                                c0238r.f(bArr, bArr2, c0234l);
                                obj.hashCode();
                                throw null;
                            }
                            c0238r.f(bArr, bArr2, c0234l);
                            int i34 = a;
                            int i35 = i34 ^ 9;
                            int i36 = ((((i34 & 9) | i35) << 1) - (~(-i35))) - 1;
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            this.c.put(0, c0238r);
                            int i38 = a;
                            i10 = (i38 ^ 97) + ((i38 & 97) << 1);
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                i11 = 0;
                                int i39 = 98 / 0;
                            }
                        } else {
                            j2 = j6;
                        }
                        i11 = 0;
                    } else {
                        if (i17 == 0) {
                            a aVarC2 = s2.c();
                            int i310 = s2.e;
                            j2 = j6;
                            c0238r = new C0238r(aVarC2, i310, s2.f, (1 << i310) - 1);
                            int i311 = b;
                            i9 = (i311 ^ 23) + ((i311 & 23) << 1);
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                Object obj2 = null;
                                c0238r.f(bArr, bArr2, c0234l);
                                obj2.hashCode();
                                throw null;
                            }
                            c0238r.f(bArr, bArr2, c0234l);
                            int i312 = a;
                            int i313 = i312 ^ 9;
                            int i314 = ((((i312 & 9) | i313) << 1) - (~(-i313))) - 1;
                            b = i314 % 128;
                            int i315 = i314 % 2;
                            this.c.put(0, c0238r);
                            int i316 = a;
                            i10 = (i316 ^ 97) + ((i316 & 97) << 1);
                            b = i10 % 128;
                            if (i10 % 2 == 0) {
                                i11 = 0;
                                int i317 = 98 / 0;
                            }
                        } else {
                            j2 = j6;
                        }
                        i11 = 0;
                    }
                } else {
                    a aVarC3 = s2.c();
                    int i318 = s2.e;
                    j2 = j6;
                    c0238r = new C0238r(aVarC3, i318, s2.f, (1 << i318) - 1);
                    int i319 = b;
                    i9 = (i319 ^ 23) + ((i319 & 23) << 1);
                    a = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object obj3 = null;
                        c0238r.f(bArr, bArr2, c0234l);
                        obj3.hashCode();
                        throw null;
                    }
                    c0238r.f(bArr, bArr2, c0234l);
                    int i3110 = a;
                    int i3111 = i3110 ^ 9;
                    int i3112 = ((((i3110 & 9) | i3111) << 1) - (~(-i3111))) - 1;
                    b = i3112 % 128;
                    int i3113 = i3112 % 2;
                    this.c.put(0, c0238r);
                    int i3114 = a;
                    i10 = (i3114 ^ 97) + ((i3114 & 97) << 1);
                    b = i10 % 128;
                    if (i10 % 2 == 0) {
                        i11 = 0;
                        int i3115 = 98 / 0;
                    } else {
                        i11 = 0;
                    }
                }
                e(i11, bArr, bArr2, c0234l);
                int i40 = a;
                int i41 = ((((i40 ^ 45) | (i40 & 45)) << 1) - (~(-(((~i40) & 45) | (i40 & (-46)))))) - 1;
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            } else {
                j2 = j6;
            }
            int i42 = b;
            int i43 = ((i42 & (-94)) | ((~i42) & 93)) + ((i42 & 93) << 1);
            a = i43 % 128;
            int i44 = i43 % 2;
            long j8 = j2;
            int i45 = 1;
            while (i45 < m2.g) {
                int i46 = b;
                int i47 = i46 & 51;
                int i48 = ((i46 ^ 51) | i47) << 1;
                int i49 = -((i46 | 51) & (~i47));
                int i50 = (i48 & i49) + (i49 | i48);
                a = i50 % 128;
                int i51 = i50 % 2;
                int i52 = (int) (j8 & j7);
                long j9 = j8 >> i16;
                C0234l.bCT bct3 = (C0234l.bCT) new C0234l.bCT().e(i45);
                int i53 = b;
                int i54 = i53 ^ 77;
                int i55 = -(-((i53 & 77) << 1));
                int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                a = i56 % 128;
                if (i56 % 2 != 0) {
                    Object obj5 = null;
                    ((C0234l.bCT) bct3.f(j9)).h = i52;
                    obj5.hashCode();
                    throw null;
                }
                C0234l.bCT bct4 = (C0234l.bCT) bct3.f(j9);
                bct4.h = i52;
                int i57 = a;
                int i58 = ((i57 ^ 5) | (i57 & 5)) << 1;
                int i59 = -((i57 & (-6)) | ((~i57) & 5));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                b = i60 % 128;
                if (i60 % 2 == 0) {
                    throw null;
                }
                C0234l c0234l2 = (C0234l) bct4.g();
                if (this.c.get(Integer.valueOf(i45)) != null) {
                    int i61 = a;
                    int i62 = i61 & 69;
                    i3 = i16;
                    int i63 = (((~i62) & (i61 | 69)) - (~(-(-(i62 << 1))))) - 1;
                    b = i63 % 128;
                    int i64 = i63 % 2;
                    int i65 = i23;
                    if (j5 != 0) {
                        int i66 = i61 ^ 99;
                        int i67 = -(-((i61 & 99) << 1));
                        int i68 = (i66 & i67) + (i66 | i67);
                        b = i68 % 128;
                        int i69 = i68 % 2;
                        j3 = j9;
                        double d = i;
                        int i70 = i45 & 1;
                        int i71 = (~i70) & (i45 | 1);
                        int i72 = i70 << 1;
                        i2 = i;
                        i4 = i65;
                        double d2 = (i71 & i72) + (i72 | i71);
                        int i73 = (i61 & 61) + (i61 | 61);
                        b = i73 % 128;
                        int i74 = i73 % 2;
                        if (j5 % ((long) Math.pow(d, d2)) == 0) {
                            int i75 = a;
                            int i76 = ((i75 | 1) << 1) - (i75 ^ 1);
                            int i77 = i76 % 128;
                            b = i77;
                            int i78 = i76 % 2;
                            int i79 = ((i77 | 45) << 1) - (i77 ^ 45);
                            a = i79 % 128;
                            int i80 = i79 % 2;
                        }
                        i5 = i4;
                        if (i52 < i5) {
                            int i81 = b;
                            int i82 = i81 & 115;
                            int i83 = (i81 ^ 115) | i82;
                            i6 = ((i82 | i83) << 1) - (i82 ^ i83);
                            a = i6 % 128;
                            if (i6 % 2 != 0 ? j5 == 0 : j5 == 1) {
                                s = s2;
                                i = i2;
                            } else {
                                i = i2;
                                s = s2;
                                int i84 = (i81 ^ 93) + ((i81 & 93) << 1);
                                a = i84 % 128;
                                int i85 = i84 % 2;
                                long jPow = (j5 + 1) % ((long) Math.pow(i, i45));
                                int i86 = b;
                                int i87 = i86 & 71;
                                int i88 = -(-((i86 ^ 71) | i87));
                                int i89 = (i87 & i88) + (i88 | i87);
                                int i90 = i89 % 128;
                                a = i90;
                                int i91 = i89 % 2;
                                if (jPow == 0) {
                                    int i92 = ((i90 ^ 50) + ((i90 & 50) << 1)) - 1;
                                    int i93 = i92 % 128;
                                    b = i93;
                                    boolean z2 = i92 % 2 != 0;
                                    int i94 = (i93 & 89) + (i93 | 89);
                                    a = i94 % 128;
                                    int i95 = i94 % 2;
                                    z = z2;
                                }
                                if (z) {
                                    int i96 = a;
                                    int i97 = ((i96 | 38) << 1) - (i96 ^ 38);
                                    i7 = (i97 ^ (-1)) + (i97 << 1);
                                    b = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        e(i45, bArr, bArr2, c0234l2);
                                        throw null;
                                    }
                                    e(i45, bArr, bArr2, c0234l2);
                                    i8 = b + 49;
                                    a = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        Object obj6 = null;
                                        obj6.hashCode();
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            int i98 = a;
                            int i99 = i98 ^ 77;
                            int i100 = -(-((i98 & 77) << 1));
                            int i101 = (i99 & i100) + (i100 | i99);
                            b = i101 % 128;
                            int i102 = i101 % 2;
                            z = false;
                            if (z) {
                                int i910 = a;
                                int i911 = ((i910 | 38) << 1) - (i910 ^ 38);
                                i7 = (i911 ^ (-1)) + (i911 << 1);
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    e(i45, bArr, bArr2, c0234l2);
                                    throw null;
                                }
                                e(i45, bArr, bArr2, c0234l2);
                                i8 = b + 49;
                                a = i8 % 128;
                                if (i8 % 2 == 0) {
                                    Object obj7 = null;
                                    obj7.hashCode();
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            s = s2;
                            i = i2;
                        }
                        int i103 = ((i45 | 98) << 1) - (i45 ^ 98);
                        i45 = (i103 ^ (-97)) + ((i103 & (-97)) << 1);
                        int i104 = b + 35;
                        a = i104 % 128;
                        int i105 = i104 % 2;
                        i23 = i5;
                        s2 = s;
                        j8 = j3;
                        i16 = i3;
                        m2 = m;
                    } else {
                        j3 = j9;
                        i2 = i;
                        i4 = i65;
                    }
                    int i106 = b + 68;
                    int i107 = (i106 ^ (-1)) + (i106 << 1);
                    a = i107 % 128;
                    int i108 = i107 % 2;
                    i5 = i4;
                    if (i52 < i5) {
                        int i810 = b;
                        int i811 = i810 & 115;
                        int i812 = (i810 ^ 115) | i811;
                        i6 = ((i811 | i812) << 1) - (i811 ^ i812);
                        a = i6 % 128;
                        if (i6 % 2 != 0) {
                            s = s2;
                            i = i2;
                            int i912 = a;
                            int i913 = i912 ^ 77;
                            int i109 = -(-((i912 & 77) << 1));
                            int i1010 = (i913 & i109) + (i109 | i913);
                            b = i1010 % 128;
                            int i1011 = i1010 % 2;
                            z = false;
                            if (z) {
                                int i914 = a;
                                int i915 = ((i914 | 38) << 1) - (i914 ^ 38);
                                i7 = (i915 ^ (-1)) + (i915 << 1);
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    e(i45, bArr, bArr2, c0234l2);
                                    throw null;
                                }
                                e(i45, bArr, bArr2, c0234l2);
                                i8 = b + 49;
                                a = i8 % 128;
                                if (i8 % 2 == 0) {
                                    Object obj8 = null;
                                    obj8.hashCode();
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            s = s2;
                            i = i2;
                            int i916 = a;
                            int i917 = i916 ^ 77;
                            int i1012 = -(-((i916 & 77) << 1));
                            int i1013 = (i917 & i1012) + (i1012 | i917);
                            b = i1013 % 128;
                            int i1014 = i1013 % 2;
                            z = false;
                            if (z) {
                                int i918 = a;
                                int i919 = ((i918 | 38) << 1) - (i918 ^ 38);
                                i7 = (i919 ^ (-1)) + (i919 << 1);
                                b = i7 % 128;
                                if (i7 % 2 != 0) {
                                    e(i45, bArr, bArr2, c0234l2);
                                    throw null;
                                }
                                e(i45, bArr, bArr2, c0234l2);
                                i8 = b + 49;
                                a = i8 % 128;
                                if (i8 % 2 == 0) {
                                    Object obj9 = null;
                                    obj9.hashCode();
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        s = s2;
                        i = i2;
                    }
                    int i1015 = ((i45 | 98) << 1) - (i45 ^ 98);
                    i45 = (i1015 ^ (-97)) + ((i1015 & (-97)) << 1);
                    int i1016 = b + 35;
                    a = i1016 % 128;
                    int i1017 = i1016 % 2;
                    i23 = i5;
                    s2 = s;
                    j8 = j3;
                    i16 = i3;
                    m2 = m;
                } else {
                    j3 = j9;
                    i2 = i;
                    i3 = i16;
                    i4 = i23;
                }
                Map<Integer, C0238r> map = this.c;
                a aVarC4 = s2.c();
                int i110 = a;
                int i111 = i110 & 31;
                int i112 = (i110 ^ 31) | i111;
                int i113 = (i111 & i112) + (i112 | i111);
                b = i113 % 128;
                int i114 = i113 % 2;
                int i115 = s2.e;
                C0238r c0238r2 = new C0238r(aVarC4, i115, s2.f, (1 << i115) - 1);
                int i116 = b;
                int i117 = ((i116 ^ 43) | (i116 & 43)) << 1;
                int i118 = -(((~i116) & 43) | (i116 & (-44)));
                int i119 = (i117 & i118) + (i118 | i117);
                a = i119 % 128;
                int i120 = i119 % 2;
                c0238r2.f(bArr, bArr2, c0234l2);
                int i121 = a;
                int i122 = ((i121 ^ 65) | (i121 & 65)) << 1;
                int i123 = -(((~i121) & 65) | (i121 & (-66)));
                int i124 = (i122 & i123) + (i123 | i122);
                b = i124 % 128;
                int i125 = i124 % 2;
                map.put(Integer.valueOf(i45), c0238r2);
                int i126 = b;
                int i127 = ((((i126 ^ 45) | (i126 & 45)) << 1) - (~(-(((~i126) & 45) | (i126 & (-46)))))) - 1;
                int i128 = i127 % 128;
                a = i128;
                int i129 = i127 % 2;
                int i130 = (((i128 | 110) << 1) - (i128 ^ 110)) - 1;
                b = i130 % 128;
                int i131 = i130 % 2;
                i5 = i4;
                if (i52 < i5) {
                    int i813 = b;
                    int i814 = i813 & 115;
                    int i815 = (i813 ^ 115) | i814;
                    i6 = ((i814 | i815) << 1) - (i814 ^ i815);
                    a = i6 % 128;
                    if (i6 % 2 != 0) {
                        s = s2;
                        i = i2;
                        int i9110 = a;
                        int i9111 = i9110 ^ 77;
                        int i1018 = -(-((i9110 & 77) << 1));
                        int i1019 = (i9111 & i1018) + (i1018 | i9111);
                        b = i1019 % 128;
                        int i10110 = i1019 % 2;
                        z = false;
                        if (z) {
                            int i9112 = a;
                            int i9113 = ((i9112 | 38) << 1) - (i9112 ^ 38);
                            i7 = (i9113 ^ (-1)) + (i9113 << 1);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                e(i45, bArr, bArr2, c0234l2);
                                throw null;
                            }
                            e(i45, bArr, bArr2, c0234l2);
                            i8 = b + 49;
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                Object obj10 = null;
                                obj10.hashCode();
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        s = s2;
                        i = i2;
                        int i9114 = a;
                        int i9115 = i9114 ^ 77;
                        int i10111 = -(-((i9114 & 77) << 1));
                        int i10112 = (i9115 & i10111) + (i10111 | i9115);
                        b = i10112 % 128;
                        int i10113 = i10112 % 2;
                        z = false;
                        if (z) {
                            int i9116 = a;
                            int i9117 = ((i9116 | 38) << 1) - (i9116 ^ 38);
                            i7 = (i9117 ^ (-1)) + (i9117 << 1);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                e(i45, bArr, bArr2, c0234l2);
                                throw null;
                            }
                            e(i45, bArr, bArr2, c0234l2);
                            i8 = b + 49;
                            a = i8 % 128;
                            if (i8 % 2 == 0) {
                                Object obj11 = null;
                                obj11.hashCode();
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    s = s2;
                    i = i2;
                }
                int i10114 = ((i45 | 98) << 1) - (i45 ^ 98);
                i45 = (i10114 ^ (-97)) + ((i10114 & (-97)) << 1);
                int i10115 = b + 35;
                a = i10115 % 128;
                int i10116 = i10115 % 2;
                i23 = i5;
                s2 = s;
                j8 = j3;
                i16 = i3;
                m2 = m;
            }
            j5++;
            int i132 = a;
            int i133 = (((i132 | 48) << 1) - (i132 ^ 48)) - 1;
            b = i133 % 128;
            if (i133 % 2 == 0) {
                int i134 = 2 % 3;
            }
            m2 = m;
            j4 = 1;
            i12 = 2;
        }
        int i135 = b;
        int i136 = ((i135 & 4) + (i135 | 4)) - 1;
        a = i136 % 128;
        int i137 = i136 % 2;
    }
}
