package ivas.gov.bisp.enumeration.B;

import ivas.gov.bisp.enumeration.p004ad.C0087m;
import ivas.gov.bisp.enumeration.p004ad.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y implements V {
    private static int a = 0;
    private static int b = 1;
    public int d;
    public C0087m e;
    public n f;
    public int g;
    public C0015y i = new C0015y(this);
    public int h = 0;
    public boolean j = false;
    public s k = new s(this);
    public s c = new s(this);
    public int l = 1;

    public Y(C0087m c0087m) {
        this.e = c0087m;
    }

    @Override // ivas.gov.bisp.enumeration.B.V
    public void b(V v) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 115) + (i2 | 115);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void f(s sVar, s sVar2, int i, C0015y c0015y) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 33) << 1;
        int i5 = -(((~i3) & 33) | (i3 & (-34)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            sVar.n.add(sVar2);
            int i7 = 33 / 0;
        } else {
            sVar.n.add(sVar2);
        }
        sVar.n.add(this.i);
        int i8 = a + 89;
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            sVar.k = i;
            sVar.c = c0015y;
            throw null;
        }
        sVar.k = i;
        sVar.c = c0015y;
        sVar2.m.add(sVar);
        int i9 = b;
        int i10 = i9 ^ 113;
        int i11 = (((i9 & 113) | i10) << 1) - i10;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            c0015y.m.add(sVar);
            obj.hashCode();
            throw null;
        }
        c0015y.m.add(sVar);
        int i12 = b;
        int i13 = i12 | 121;
        int i14 = i13 << 1;
        int i15 = -((~(i12 & 121)) & i13);
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 70 / 0;
        }
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public final s k(N n) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 65) + (i2 | 65);
        b = i3 % 128;
        s sVar = null;
        if (i3 % 2 == 0) {
            N n2 = n.f;
            throw null;
        }
        N n3 = n.f;
        if (n3 == null) {
            int i4 = b + 49;
            a = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        C0087m c0087m = n3.d;
        int iOrdinal = n3.e.ordinal();
        int i6 = a;
        int i7 = i6 & 39;
        int i8 = (~i7) & (i6 | 39);
        int i9 = i7 << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        if (iOrdinal != 1) {
            int i12 = (i6 ^ 89) + ((i6 & 89) << 1);
            int i13 = i12 % 128;
            b = i13;
            if (i12 % 2 != 0 ? iOrdinal == 2 : iOrdinal == 4) {
                sVar = c0087m.i.k;
                int i14 = a;
                int i15 = (i14 & 99) + (i14 | 99);
                b = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = i13 & 119;
                int i18 = (((i13 ^ 119) | i17) << 1) - ((~i17) & (i13 | 119));
                a = i18 % 128;
                int i19 = i18 % 2;
                if (iOrdinal != 3) {
                    int i20 = i13 ^ 113;
                    int i21 = -(-((i13 & 113) << 1));
                    int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    if (iOrdinal != 4) {
                        int i24 = i13 ^ 109;
                        int i25 = ((i13 & 109) | i24) << 1;
                        int i26 = -i24;
                        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                        if (iOrdinal == 5) {
                            int i29 = (i13 ^ 1) + ((i13 & 1) << 1);
                            a = i29 % 128;
                            if (i29 % 2 != 0) {
                                s sVar2 = c0087m.i.m;
                                throw null;
                            }
                            sVar = c0087m.i.m;
                            int i30 = a;
                            int i31 = i30 ^ 71;
                            int i32 = ((i30 & 71) | i31) << 1;
                            int i33 = -i31;
                            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                            b = i34 % 128;
                            if (i34 % 2 == 0) {
                                int i35 = 2 % 3;
                            }
                        }
                    } else {
                        sVar = c0087m.i.c;
                        int i36 = b + 105;
                        a = i36 % 128;
                        int i37 = i36 % 2;
                    }
                } else {
                    sVar = c0087m.g.c;
                    int i38 = a;
                    int i39 = (i38 & 120) + (i38 | 120);
                    int i40 = (i39 ^ (-1)) + (i39 << 1);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                }
            }
        } else {
            sVar = c0087m.g.k;
            int i42 = b;
            int i43 = (i42 & (-30)) | ((~i42) & 29);
            int i44 = (i42 & 29) << 1;
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            a = i45 % 128;
            if (i45 % 2 != 0) {
                int i46 = 5 % 3;
            }
        }
        int i47 = a;
        int i48 = (((i47 & (-2)) | ((~i47) & 1)) - (~(-(-((i47 & 1) << 1))))) - 1;
        b = i48 % 128;
        if (i48 % 2 == 0) {
            int i49 = 11 / 0;
        }
        return sVar;
    }

    public long l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 19) | (i2 & 19)) << 1) - (~(-(((~i2) & 19) | (i2 & (-20)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = this.i.l;
            throw null;
        }
        C0015y c0015y = this.i;
        if (!c0015y.l) {
            int i4 = a;
            int i5 = i4 & 93;
            int i6 = (((i4 ^ 93) | i5) << 1) - ((i4 | 93) & (~i5));
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return 0L;
            }
            throw null;
        }
        int i7 = b + 17;
        a = i7 % 128;
        int i8 = i7 % 2;
        long j = c0015y.j;
        int i9 = a;
        int i10 = i9 | 69;
        int i11 = i10 << 1;
        int i12 = -((~(i9 & 69)) & i10);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 22 / 0;
        }
        return j;
    }

    public abstract boolean m();

    public final void e(s sVar, s sVar2, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 59;
        int i5 = ((i3 ^ 59) | i4) << 1;
        int i6 = -((i3 | 59) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            sVar.n.add(sVar2);
            sVar.h = i;
            throw null;
        }
        sVar.n.add(sVar2);
        sVar.h = i;
        int i8 = b;
        int i9 = i8 & 25;
        int i10 = -(-((i8 ^ 25) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        sVar2.m.add(sVar);
        int i13 = b + 95;
        a = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bc A[PHI: r13 r15
  0x00bc: PHI (r13v9 int) = (r13v8 int), (r13v11 int) binds: [B:23:0x00ba, B:20:0x00a5] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r15v4 ivas.gov.bisp.enumeration.B.y) = (r15v3 ivas.gov.bisp.enumeration.B.y), (r15v5 ivas.gov.bisp.enumeration.B.y) binds: [B:23:0x00ba, B:20:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0193  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01df  */
    /* JADX WARN: Code duplicated, block: B:67:0x0214  */
    /* JADX WARN: Code duplicated, block: B:69:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0229  */
    /* JADX WARN: Code duplicated, block: B:72:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
    /* JADX WARN: Code duplicated, block: B:74:0x0263  */
    /* JADX WARN: Code duplicated, block: B:77:0x027c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0291  */
    /* JADX WARN: Code duplicated, block: B:82:0x0298 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x029a  */
    /* JADX WARN: Code duplicated, block: B:84:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0300  */
    /* JADX WARN: Code duplicated, block: B:90:0x0302  */
    /* JADX WARN: Code duplicated, block: B:92:0x031e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0326  */
    /* JADX WARN: Code duplicated, block: B:95:0x032f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0341  */
    public void n(N n, N n2, int i) {
        s sVarK;
        s sVarK2;
        int iD;
        int i2;
        C0015y c0015y;
        int i3;
        int i4;
        int i5;
        int i6;
        int iJ;
        C0015y c0015y2;
        int i7;
        C0087m c0087m;
        C0087m c0087m2;
        int i8;
        int i9;
        int i10;
        Y y;
        C0015y c0015y3;
        int i11;
        int i12;
        float f;
        int i13;
        int i14;
        C0087m c0087m3;
        Y y2;
        int i15;
        int i16;
        C0015y c0015y4;
        float f2;
        int i17;
        int i18;
        int i19;
        int i20;
        float f3;
        float f4;
        int i21 = 2 % 2;
        int i22 = a;
        int i23 = i22 | 61;
        int i24 = (i23 << 1) - ((~(i22 & 61)) & i23);
        b = i24 % 128;
        if (i24 % 2 == 0) {
            sVarK = k(n);
            sVarK2 = k(n2);
            int i25 = 6 / 0;
        } else {
            sVarK = k(n);
            sVarK2 = k(n2);
        }
        int i26 = a;
        int i27 = i26 & 119;
        int i28 = (i27 - (~((i26 ^ 119) | i27))) - 1;
        b = i28 % 128;
        if (i28 % 2 == 0) {
            Object obj = null;
            boolean z = sVarK.l;
            obj.hashCode();
            throw null;
        }
        if (sVarK.l && sVarK2.l) {
            int i29 = a;
            int i30 = i29 & 115;
            int i31 = (i30 - (~(-(-((i29 ^ 115) | i30))))) - 1;
            b = i31 % 128;
            if (i31 % 2 == 0) {
                iD = n.d() / sVarK.j;
            } else {
                int i32 = sVarK.j;
                int iD2 = n.d();
                int i33 = -(-i32);
                iD = (((~i33) & iD2) | ((~iD2) & i33)) + ((i33 & iD2) << 1);
            }
            int i34 = sVarK2.j;
            int i35 = -(~(-n2.d()));
            int i36 = (i34 & i35) + (i35 | i34);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            int i38 = a;
            int i39 = i38 & 45;
            int i40 = -(-((i38 ^ 45) | i39));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            b = i41 % 128;
            if (i41 % 2 == 0) {
                i2 = i37 / iD;
                c0015y = this.i;
                if (!c0015y.l) {
                    i3 = b;
                    int i42 = ((i3 | 83) << 1) - (i3 ^ 83);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                    if (this.g == 3) {
                        int i44 = i3 | 73;
                        i4 = (i44 << 1) - ((~(i3 & 73)) & i44);
                        i5 = i4 % 128;
                        a = i5;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        i6 = this.d;
                        if (i6 != 0) {
                            c0015y.e(j(i2, i));
                            int i45 = a + 83;
                            b = i45 % 128;
                            int i46 = i45 % 2;
                        } else if (i6 != 1) {
                            int i47 = i5 ^ 109;
                            int i48 = (i5 & 109) << 1;
                            int i49 = (i47 & i48) + (i47 | i48);
                            b = i49 % 128;
                            int i50 = i49 % 2;
                            if (i6 != 2) {
                                i13 = ((i5 & 112) + (i5 | 112)) - 1;
                                i14 = i13 % 128;
                                b = i14;
                                if (i13 % 2 == 0 ? i6 == 3 : i6 == 3) {
                                    int i51 = i14 ^ 17;
                                    int i52 = (((i14 & 17) | i51) << 1) - i51;
                                    a = i52 % 128;
                                    int i53 = i52 % 2;
                                    c0087m3 = this.e;
                                    y2 = c0087m3.g;
                                    i15 = y2.g;
                                    int i54 = b;
                                    int i55 = i54 & 69;
                                    int i56 = -(-((i54 ^ 69) | i55));
                                    int i57 = (i55 & i56) + (i55 | i56);
                                    i16 = i57 % 128;
                                    a = i16;
                                    int i58 = i57 % 2;
                                    if (i15 == 3) {
                                        int i59 = (i16 & (-68)) | (67 & (~i16));
                                        int i60 = (i16 & 67) << 1;
                                        i20 = ((i59 | i60) << 1) - (i60 ^ i59);
                                        b = i20 % 128;
                                        if (i20 % 2 == 0 ? y2.d != 3 : y2.d != 5) {
                                            if (i == 0) {
                                                int i61 = b;
                                                int i62 = i61 & 109;
                                                i19 = (i62 - (~((i61 ^ 109) | i62))) - 1;
                                                a = i19 % 128;
                                                if (i19 % 2 == 0) {
                                                    X x = c0087m3.i;
                                                    Object obj2 = null;
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                y2 = c0087m3.i;
                                                int i63 = b;
                                                int i64 = i63 ^ 123;
                                                int i65 = -(-((i63 & 123) << 1));
                                                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                                                a = i66 % 128;
                                                int i67 = i66 % 2;
                                            }
                                            c0015y4 = y2.i;
                                            if (!(!c0015y4.l)) {
                                                int i68 = a + 11;
                                                b = i68 % 128;
                                                int i69 = i68 % 2;
                                                f2 = c0087m3.Q;
                                                if (i == 1) {
                                                    int i70 = a;
                                                    int i71 = (i70 & (-22)) | ((~i70) & 21);
                                                    int i72 = (i70 & 21) << 1;
                                                    int i73 = (i71 & i72) + (i72 | i71);
                                                    b = i73 % 128;
                                                    int i74 = i73 % 2;
                                                    i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                    int i75 = b;
                                                    i18 = ((i75 & 23) - (~(i75 | 23))) - 1;
                                                    a = i18 % 128;
                                                    if (i18 % 2 != 0) {
                                                        int i76 = 4 / 2;
                                                    }
                                                } else {
                                                    i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                    int i77 = b;
                                                    int i78 = i77 & 113;
                                                    int i79 = ((i77 ^ 113) | i78) << 1;
                                                    int i80 = -((i77 | 113) & (~i78));
                                                    int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                                                    a = i81 % 128;
                                                    int i82 = i81 % 2;
                                                }
                                                c0015y.e(i17);
                                                int i83 = a;
                                                int i84 = ((i83 ^ 29) - (~(-(-((i83 & 29) << 1))))) - 1;
                                                b = i84 % 128;
                                                int i85 = i84 % 2;
                                            }
                                        } else {
                                            X x2 = c0087m3.i;
                                            if (x2.g == 3) {
                                                int i86 = a + 61;
                                                b = i86 % 128;
                                                int i87 = i86 % 2;
                                                if (x2.d != 3) {
                                                    if (i == 0) {
                                                        int i610 = b;
                                                        int i611 = i610 & 109;
                                                        i19 = (i611 - (~((i610 ^ 109) | i611))) - 1;
                                                        a = i19 % 128;
                                                        if (i19 % 2 == 0) {
                                                            X x3 = c0087m3.i;
                                                            Object obj3 = null;
                                                            obj3.hashCode();
                                                            throw null;
                                                        }
                                                        y2 = c0087m3.i;
                                                        int i612 = b;
                                                        int i613 = i612 ^ 123;
                                                        int i614 = -(-((i612 & 123) << 1));
                                                        int i615 = ((i613 | i614) << 1) - (i614 ^ i613);
                                                        a = i615 % 128;
                                                        int i616 = i615 % 2;
                                                    }
                                                    c0015y4 = y2.i;
                                                    if (!(!c0015y4.l)) {
                                                        int i617 = a + 11;
                                                        b = i617 % 128;
                                                        int i618 = i617 % 2;
                                                        f2 = c0087m3.Q;
                                                        if (i == 1) {
                                                            int i710 = a;
                                                            int i711 = (i710 & (-22)) | ((~i710) & 21);
                                                            int i712 = (i710 & 21) << 1;
                                                            int i713 = (i711 & i712) + (i712 | i711);
                                                            b = i713 % 128;
                                                            int i714 = i713 % 2;
                                                            i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                            int i715 = b;
                                                            i18 = ((i715 & 23) - (~(i715 | 23))) - 1;
                                                            a = i18 % 128;
                                                            if (i18 % 2 != 0) {
                                                                int i716 = 4 / 2;
                                                            }
                                                        } else {
                                                            i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                            int i717 = b;
                                                            int i718 = i717 & 113;
                                                            int i719 = ((i717 ^ 113) | i718) << 1;
                                                            int i88 = -((i717 | 113) & (~i718));
                                                            int i89 = (i719 ^ i88) + ((i88 & i719) << 1);
                                                            a = i89 % 128;
                                                            int i810 = i89 % 2;
                                                        }
                                                        c0015y.e(i17);
                                                        int i811 = a;
                                                        int i812 = ((i811 ^ 29) - (~(-(-((i811 & 29) << 1))))) - 1;
                                                        b = i812 % 128;
                                                        int i813 = i812 % 2;
                                                    }
                                                }
                                            } else {
                                                if (i == 0) {
                                                    int i619 = b;
                                                    int i6110 = i619 & 109;
                                                    i19 = (i6110 - (~((i619 ^ 109) | i6110))) - 1;
                                                    a = i19 % 128;
                                                    if (i19 % 2 == 0) {
                                                        X x4 = c0087m3.i;
                                                        Object obj4 = null;
                                                        obj4.hashCode();
                                                        throw null;
                                                    }
                                                    y2 = c0087m3.i;
                                                    int i6111 = b;
                                                    int i6112 = i6111 ^ 123;
                                                    int i6113 = -(-((i6111 & 123) << 1));
                                                    int i6114 = ((i6112 | i6113) << 1) - (i6113 ^ i6112);
                                                    a = i6114 % 128;
                                                    int i6115 = i6114 % 2;
                                                }
                                                c0015y4 = y2.i;
                                                if (!(!c0015y4.l)) {
                                                    int i6116 = a + 11;
                                                    b = i6116 % 128;
                                                    int i6117 = i6116 % 2;
                                                    f2 = c0087m3.Q;
                                                    if (i == 1) {
                                                        int i7110 = a;
                                                        int i7111 = (i7110 & (-22)) | ((~i7110) & 21);
                                                        int i7112 = (i7110 & 21) << 1;
                                                        int i7113 = (i7111 & i7112) + (i7112 | i7111);
                                                        b = i7113 % 128;
                                                        int i7114 = i7113 % 2;
                                                        i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                        int i7115 = b;
                                                        i18 = ((i7115 & 23) - (~(i7115 | 23))) - 1;
                                                        a = i18 % 128;
                                                        if (i18 % 2 != 0) {
                                                            int i7116 = 4 / 2;
                                                        }
                                                    } else {
                                                        i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                        int i7117 = b;
                                                        int i7118 = i7117 & 113;
                                                        int i7119 = ((i7117 ^ 113) | i7118) << 1;
                                                        int i814 = -((i7117 | 113) & (~i7118));
                                                        int i815 = (i7119 ^ i814) + ((i814 & i7119) << 1);
                                                        a = i815 % 128;
                                                        int i816 = i815 % 2;
                                                    }
                                                    c0015y.e(i17);
                                                    int i817 = a;
                                                    int i818 = ((i817 ^ 29) - (~(-(-((i817 & 29) << 1))))) - 1;
                                                    b = i818 % 128;
                                                    int i819 = i818 % 2;
                                                }
                                            }
                                        }
                                    } else {
                                        if (i == 0) {
                                            int i6118 = b;
                                            int i6119 = i6118 & 109;
                                            i19 = (i6119 - (~((i6118 ^ 109) | i6119))) - 1;
                                            a = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                X x5 = c0087m3.i;
                                                Object obj5 = null;
                                                obj5.hashCode();
                                                throw null;
                                            }
                                            y2 = c0087m3.i;
                                            int i61110 = b;
                                            int i61111 = i61110 ^ 123;
                                            int i61112 = -(-((i61110 & 123) << 1));
                                            int i61113 = ((i61111 | i61112) << 1) - (i61112 ^ i61111);
                                            a = i61113 % 128;
                                            int i61114 = i61113 % 2;
                                        }
                                        c0015y4 = y2.i;
                                        if (!(!c0015y4.l)) {
                                            int i61115 = a + 11;
                                            b = i61115 % 128;
                                            int i61116 = i61115 % 2;
                                            f2 = c0087m3.Q;
                                            if (i == 1) {
                                                int i71110 = a;
                                                int i71111 = (i71110 & (-22)) | ((~i71110) & 21);
                                                int i71112 = (i71110 & 21) << 1;
                                                int i71113 = (i71111 & i71112) + (i71112 | i71111);
                                                b = i71113 % 128;
                                                int i71114 = i71113 % 2;
                                                i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                int i71115 = b;
                                                i18 = ((i71115 & 23) - (~(i71115 | 23))) - 1;
                                                a = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    int i71116 = 4 / 2;
                                                }
                                            } else {
                                                i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                int i71117 = b;
                                                int i71118 = i71117 & 113;
                                                int i71119 = ((i71117 ^ 113) | i71118) << 1;
                                                int i8110 = -((i71117 | 113) & (~i71118));
                                                int i8111 = (i71119 ^ i8110) + ((i8110 & i71119) << 1);
                                                a = i8111 % 128;
                                                int i8112 = i8111 % 2;
                                            }
                                            c0015y.e(i17);
                                            int i8113 = a;
                                            int i8114 = ((i8113 ^ 29) - (~(-(-((i8113 & 29) << 1))))) - 1;
                                            b = i8114 % 128;
                                            int i8115 = i8114 % 2;
                                        }
                                    }
                                }
                            } else {
                                c0087m = this.e;
                                c0087m2 = c0087m.N;
                                int i90 = a;
                                i8 = (i90 ^ 37) + ((i90 & 37) << 1);
                                i9 = i8 % 128;
                                b = i9;
                                if (i8 % 2 != 0) {
                                    throw null;
                                }
                                if (c0087m2 != null) {
                                    i10 = (((i9 & (-100)) | (99 & (~i9))) - (~((i9 & 99) << 1))) - 1;
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        Object obj6 = null;
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    if (i == 0) {
                                        int i91 = i9 & 79;
                                        int i92 = -(-((i9 ^ 79) | i91));
                                        int i93 = (i91 & i92) + (i92 | i91);
                                        a = i93 % 128;
                                        int i94 = i93 % 2;
                                        y = c0087m2.g;
                                        int i95 = a;
                                        int i96 = i95 | 89;
                                        int i97 = (i96 << 1) - ((~(i95 & 89)) & i96);
                                        b = i97 % 128;
                                        int i98 = i97 % 2;
                                    } else {
                                        y = c0087m2.i;
                                        int i99 = a;
                                        int i100 = ((i99 & (-48)) | ((~i99) & 47)) + ((i99 & 47) << 1);
                                        b = i100 % 128;
                                        int i101 = i100 % 2;
                                    }
                                    c0015y3 = y.i;
                                    if (c0015y3.l) {
                                        i11 = a;
                                        int i102 = i11 & 35;
                                        int i103 = (i11 ^ 35) | i102;
                                        i12 = ((i102 | i103) << 1) - (i102 ^ i103);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            int i104 = 48 / 0;
                                            if (i == 0) {
                                                int i105 = i11 + 55;
                                                b = i105 % 128;
                                                int i106 = i105 % 2;
                                                f = c0087m.q;
                                                int i107 = a;
                                                int i108 = (i107 & (-44)) | ((~i107) & 43);
                                                int i109 = -(-((i107 & 43) << 1));
                                                int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                                                b = i110 % 128;
                                                int i111 = i110 % 2;
                                            } else {
                                                f = c0087m.s;
                                                int i112 = b;
                                                int i113 = i112 & 3;
                                                int i114 = i112 | 3;
                                                int i115 = (i113 & i114) + (i114 | i113);
                                                a = i115 % 128;
                                                int i116 = i115 % 2;
                                            }
                                        } else if (i == 0) {
                                            int i1010 = i11 + 55;
                                            b = i1010 % 128;
                                            int i1011 = i1010 % 2;
                                            f = c0087m.q;
                                            int i1012 = a;
                                            int i1013 = (i1012 & (-44)) | ((~i1012) & 43);
                                            int i1014 = -(-((i1012 & 43) << 1));
                                            int i117 = ((i1013 | i1014) << 1) - (i1014 ^ i1013);
                                            b = i117 % 128;
                                            int i118 = i117 % 2;
                                        } else {
                                            f = c0087m.s;
                                            int i119 = b;
                                            int i1110 = i119 & 3;
                                            int i1111 = i119 | 3;
                                            int i1112 = (i1110 & i1111) + (i1111 | i1110);
                                            a = i1112 % 128;
                                            int i1113 = i1112 % 2;
                                        }
                                        int i120 = (int) ((c0015y3.j * f) + 0.5f);
                                        int i121 = b;
                                        int i122 = ((i121 | 9) << 1) - (i121 ^ 9);
                                        a = i122 % 128;
                                        int i123 = i122 % 2;
                                        c0015y.e(j(i120, i));
                                        int i124 = a;
                                        int i125 = i124 & 11;
                                        int i126 = (i124 | 11) & (~i125);
                                        int i127 = i125 << 1;
                                        int i128 = ((i126 | i127) << 1) - (i126 ^ i127);
                                        b = i128 % 128;
                                        int i129 = i128 % 2;
                                    }
                                }
                            }
                        } else {
                            iJ = j(c0015y.f41o, i);
                            c0015y2 = this.i;
                            int i130 = a;
                            int i131 = i130 & 121;
                            int i132 = -(-((i130 ^ 121) | i131));
                            i7 = (i131 & i132) + (i132 | i131);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                c0015y2.e(Math.min(iJ, i2));
                                throw null;
                            }
                            c0015y2.e(Math.min(iJ, i2));
                        }
                    }
                }
            } else {
                int i133 = -iD;
                int i134 = ((~i133) & i37) | ((~i37) & i133);
                int i135 = (i133 & i37) << 1;
                i2 = (i134 ^ i135) + ((i135 & i134) << 1);
                c0015y = this.i;
                if (!c0015y.l) {
                    i3 = b;
                    int i410 = ((i3 | 83) << 1) - (i3 ^ 83);
                    a = i410 % 128;
                    int i411 = i410 % 2;
                    if (this.g == 3) {
                        int i412 = i3 | 73;
                        i4 = (i412 << 1) - ((~(i3 & 73)) & i412);
                        i5 = i4 % 128;
                        a = i5;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        i6 = this.d;
                        if (i6 != 0) {
                            c0015y.e(j(i2, i));
                            int i413 = a + 83;
                            b = i413 % 128;
                            int i414 = i413 % 2;
                        } else if (i6 != 1) {
                            int i415 = i5 ^ 109;
                            int i416 = (i5 & 109) << 1;
                            int i417 = (i415 & i416) + (i415 | i416);
                            b = i417 % 128;
                            int i510 = i417 % 2;
                            if (i6 != 2) {
                                i13 = ((i5 & 112) + (i5 | 112)) - 1;
                                i14 = i13 % 128;
                                b = i14;
                                if (i13 % 2 == 0) {
                                    int i511 = i14 ^ 17;
                                    int i512 = (((i14 & 17) | i511) << 1) - i511;
                                    a = i512 % 128;
                                    int i513 = i512 % 2;
                                    c0087m3 = this.e;
                                    y2 = c0087m3.g;
                                    i15 = y2.g;
                                    int i514 = b;
                                    int i515 = i514 & 69;
                                    int i516 = -(-((i514 ^ 69) | i515));
                                    int i517 = (i515 & i516) + (i515 | i516);
                                    i16 = i517 % 128;
                                    a = i16;
                                    int i518 = i517 % 2;
                                    if (i15 == 3) {
                                        int i519 = (i16 & (-68)) | (67 & (~i16));
                                        int i620 = (i16 & 67) << 1;
                                        i20 = ((i519 | i620) << 1) - (i620 ^ i519);
                                        b = i20 % 128;
                                        if (i20 % 2 == 0) {
                                        }
                                        if (i == 0) {
                                            int i61117 = b;
                                            int i61118 = i61117 & 109;
                                            i19 = (i61118 - (~((i61117 ^ 109) | i61118))) - 1;
                                            a = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                X x6 = c0087m3.i;
                                                Object obj7 = null;
                                                obj7.hashCode();
                                                throw null;
                                            }
                                            y2 = c0087m3.i;
                                            int i61119 = b;
                                            int i611110 = i61119 ^ 123;
                                            int i611111 = -(-((i61119 & 123) << 1));
                                            int i611112 = ((i611110 | i611111) << 1) - (i611111 ^ i611110);
                                            a = i611112 % 128;
                                            int i611113 = i611112 % 2;
                                        }
                                        c0015y4 = y2.i;
                                        if (!(!c0015y4.l)) {
                                            int i611114 = a + 11;
                                            b = i611114 % 128;
                                            int i611115 = i611114 % 2;
                                            f2 = c0087m3.Q;
                                            if (i == 1) {
                                                int i711110 = a;
                                                int i711111 = (i711110 & (-22)) | ((~i711110) & 21);
                                                int i711112 = (i711110 & 21) << 1;
                                                int i711113 = (i711111 & i711112) + (i711112 | i711111);
                                                b = i711113 % 128;
                                                int i711114 = i711113 % 2;
                                                i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                int i711115 = b;
                                                i18 = ((i711115 & 23) - (~(i711115 | 23))) - 1;
                                                a = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    int i711116 = 4 / 2;
                                                }
                                            } else {
                                                i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                int i711117 = b;
                                                int i711118 = i711117 & 113;
                                                int i711119 = ((i711117 ^ 113) | i711118) << 1;
                                                int i8116 = -((i711117 | 113) & (~i711118));
                                                int i8117 = (i711119 ^ i8116) + ((i8116 & i711119) << 1);
                                                a = i8117 % 128;
                                                int i8118 = i8117 % 2;
                                            }
                                            c0015y.e(i17);
                                            int i8119 = a;
                                            int i81110 = ((i8119 ^ 29) - (~(-(-((i8119 & 29) << 1))))) - 1;
                                            b = i81110 % 128;
                                            int i81111 = i81110 % 2;
                                        }
                                    } else {
                                        if (i == 0) {
                                            int i611116 = b;
                                            int i611117 = i611116 & 109;
                                            i19 = (i611117 - (~((i611116 ^ 109) | i611117))) - 1;
                                            a = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                X x7 = c0087m3.i;
                                                Object obj8 = null;
                                                obj8.hashCode();
                                                throw null;
                                            }
                                            y2 = c0087m3.i;
                                            int i611118 = b;
                                            int i611119 = i611118 ^ 123;
                                            int i6111110 = -(-((i611118 & 123) << 1));
                                            int i6111111 = ((i611119 | i6111110) << 1) - (i6111110 ^ i611119);
                                            a = i6111111 % 128;
                                            int i6111112 = i6111111 % 2;
                                        }
                                        c0015y4 = y2.i;
                                        if (!(!c0015y4.l)) {
                                            int i6111113 = a + 11;
                                            b = i6111113 % 128;
                                            int i6111114 = i6111113 % 2;
                                            f2 = c0087m3.Q;
                                            if (i == 1) {
                                                int i7111110 = a;
                                                int i7111111 = (i7111110 & (-22)) | ((~i7111110) & 21);
                                                int i7111112 = (i7111110 & 21) << 1;
                                                int i7111113 = (i7111111 & i7111112) + (i7111112 | i7111111);
                                                b = i7111113 % 128;
                                                int i7111114 = i7111113 % 2;
                                                i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                int i7111115 = b;
                                                i18 = ((i7111115 & 23) - (~(i7111115 | 23))) - 1;
                                                a = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    int i7111116 = 4 / 2;
                                                }
                                            } else {
                                                i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                int i7111117 = b;
                                                int i7111118 = i7111117 & 113;
                                                int i7111119 = ((i7111117 ^ 113) | i7111118) << 1;
                                                int i81112 = -((i7111117 | 113) & (~i7111118));
                                                int i81113 = (i7111119 ^ i81112) + ((i81112 & i7111119) << 1);
                                                a = i81113 % 128;
                                                int i81114 = i81113 % 2;
                                            }
                                            c0015y.e(i17);
                                            int i81115 = a;
                                            int i81116 = ((i81115 ^ 29) - (~(-(-((i81115 & 29) << 1))))) - 1;
                                            b = i81116 % 128;
                                            int i81117 = i81116 % 2;
                                        }
                                    }
                                } else {
                                    int i5110 = i14 ^ 17;
                                    int i5111 = (((i14 & 17) | i5110) << 1) - i5110;
                                    a = i5111 % 128;
                                    int i5112 = i5111 % 2;
                                    c0087m3 = this.e;
                                    y2 = c0087m3.g;
                                    i15 = y2.g;
                                    int i5113 = b;
                                    int i5114 = i5113 & 69;
                                    int i5115 = -(-((i5113 ^ 69) | i5114));
                                    int i5116 = (i5114 & i5115) + (i5114 | i5115);
                                    i16 = i5116 % 128;
                                    a = i16;
                                    int i5117 = i5116 % 2;
                                    if (i15 == 3) {
                                        int i5118 = (i16 & (-68)) | (67 & (~i16));
                                        int i621 = (i16 & 67) << 1;
                                        i20 = ((i5118 | i621) << 1) - (i621 ^ i5118);
                                        b = i20 % 128;
                                        if (i20 % 2 == 0) {
                                        }
                                        if (i == 0) {
                                            int i6111115 = b;
                                            int i6111116 = i6111115 & 109;
                                            i19 = (i6111116 - (~((i6111115 ^ 109) | i6111116))) - 1;
                                            a = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                X x8 = c0087m3.i;
                                                Object obj9 = null;
                                                obj9.hashCode();
                                                throw null;
                                            }
                                            y2 = c0087m3.i;
                                            int i6111117 = b;
                                            int i6111118 = i6111117 ^ 123;
                                            int i6111119 = -(-((i6111117 & 123) << 1));
                                            int i61111110 = ((i6111118 | i6111119) << 1) - (i6111119 ^ i6111118);
                                            a = i61111110 % 128;
                                            int i61111111 = i61111110 % 2;
                                        }
                                        c0015y4 = y2.i;
                                        if (!(!c0015y4.l)) {
                                            int i61111112 = a + 11;
                                            b = i61111112 % 128;
                                            int i61111113 = i61111112 % 2;
                                            f2 = c0087m3.Q;
                                            if (i == 1) {
                                                int i71111110 = a;
                                                int i71111111 = (i71111110 & (-22)) | ((~i71111110) & 21);
                                                int i71111112 = (i71111110 & 21) << 1;
                                                int i71111113 = (i71111111 & i71111112) + (i71111112 | i71111111);
                                                b = i71111113 % 128;
                                                int i71111114 = i71111113 % 2;
                                                i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                int i71111115 = b;
                                                i18 = ((i71111115 & 23) - (~(i71111115 | 23))) - 1;
                                                a = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    int i71111116 = 4 / 2;
                                                }
                                            } else {
                                                i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                int i71111117 = b;
                                                int i71111118 = i71111117 & 113;
                                                int i71111119 = ((i71111117 ^ 113) | i71111118) << 1;
                                                int i81118 = -((i71111117 | 113) & (~i71111118));
                                                int i81119 = (i71111119 ^ i81118) + ((i81118 & i71111119) << 1);
                                                a = i81119 % 128;
                                                int i811110 = i81119 % 2;
                                            }
                                            c0015y.e(i17);
                                            int i811111 = a;
                                            int i811112 = ((i811111 ^ 29) - (~(-(-((i811111 & 29) << 1))))) - 1;
                                            b = i811112 % 128;
                                            int i811113 = i811112 % 2;
                                        }
                                    } else {
                                        if (i == 0) {
                                            int i61111114 = b;
                                            int i61111115 = i61111114 & 109;
                                            i19 = (i61111115 - (~((i61111114 ^ 109) | i61111115))) - 1;
                                            a = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                X x9 = c0087m3.i;
                                                Object obj10 = null;
                                                obj10.hashCode();
                                                throw null;
                                            }
                                            y2 = c0087m3.i;
                                            int i61111116 = b;
                                            int i61111117 = i61111116 ^ 123;
                                            int i61111118 = -(-((i61111116 & 123) << 1));
                                            int i61111119 = ((i61111117 | i61111118) << 1) - (i61111118 ^ i61111117);
                                            a = i61111119 % 128;
                                            int i611111110 = i61111119 % 2;
                                        }
                                        c0015y4 = y2.i;
                                        if (!(!c0015y4.l)) {
                                            int i611111111 = a + 11;
                                            b = i611111111 % 128;
                                            int i611111112 = i611111111 % 2;
                                            f2 = c0087m3.Q;
                                            if (i == 1) {
                                                int i711111110 = a;
                                                int i711111111 = (i711111110 & (-22)) | ((~i711111110) & 21);
                                                int i711111112 = (i711111110 & 21) << 1;
                                                int i711111113 = (i711111111 & i711111112) + (i711111112 | i711111111);
                                                b = i711111113 % 128;
                                                int i711111114 = i711111113 % 2;
                                                i17 = (int) ((c0015y4.j / f2) + 0.5f);
                                                int i711111115 = b;
                                                i18 = ((i711111115 & 23) - (~(i711111115 | 23))) - 1;
                                                a = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    int i711111116 = 4 / 2;
                                                }
                                            } else {
                                                i17 = (int) ((f2 * c0015y4.j) + 0.5f);
                                                int i711111117 = b;
                                                int i711111118 = i711111117 & 113;
                                                int i711111119 = ((i711111117 ^ 113) | i711111118) << 1;
                                                int i811114 = -((i711111117 | 113) & (~i711111118));
                                                int i811115 = (i711111119 ^ i811114) + ((i811114 & i711111119) << 1);
                                                a = i811115 % 128;
                                                int i811116 = i811115 % 2;
                                            }
                                            c0015y.e(i17);
                                            int i811117 = a;
                                            int i811118 = ((i811117 ^ 29) - (~(-(-((i811117 & 29) << 1))))) - 1;
                                            b = i811118 % 128;
                                            int i811119 = i811118 % 2;
                                        }
                                    }
                                }
                            } else {
                                c0087m = this.e;
                                c0087m2 = c0087m.N;
                                int i910 = a;
                                i8 = (i910 ^ 37) + ((i910 & 37) << 1);
                                i9 = i8 % 128;
                                b = i9;
                                if (i8 % 2 != 0) {
                                    throw null;
                                }
                                if (c0087m2 != null) {
                                    i10 = (((i9 & (-100)) | (99 & (~i9))) - (~((i9 & 99) << 1))) - 1;
                                    a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        Object obj11 = null;
                                        obj11.hashCode();
                                        throw null;
                                    }
                                    if (i == 0) {
                                        int i911 = i9 & 79;
                                        int i912 = -(-((i9 ^ 79) | i911));
                                        int i913 = (i911 & i912) + (i912 | i911);
                                        a = i913 % 128;
                                        int i914 = i913 % 2;
                                        y = c0087m2.g;
                                        int i915 = a;
                                        int i916 = i915 | 89;
                                        int i917 = (i916 << 1) - ((~(i915 & 89)) & i916);
                                        b = i917 % 128;
                                        int i918 = i917 % 2;
                                    } else {
                                        y = c0087m2.i;
                                        int i919 = a;
                                        int i1015 = ((i919 & (-48)) | ((~i919) & 47)) + ((i919 & 47) << 1);
                                        b = i1015 % 128;
                                        int i1016 = i1015 % 2;
                                    }
                                    c0015y3 = y.i;
                                    if (c0015y3.l) {
                                        i11 = a;
                                        int i1017 = i11 & 35;
                                        int i1018 = (i11 ^ 35) | i1017;
                                        i12 = ((i1017 | i1018) << 1) - (i1017 ^ i1018);
                                        b = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            int i1019 = 48 / 0;
                                            if (i == 0) {
                                                int i10110 = i11 + 55;
                                                b = i10110 % 128;
                                                int i10111 = i10110 % 2;
                                                f = c0087m.q;
                                                int i10112 = a;
                                                int i10113 = (i10112 & (-44)) | ((~i10112) & 43);
                                                int i10114 = -(-((i10112 & 43) << 1));
                                                int i1114 = ((i10113 | i10114) << 1) - (i10114 ^ i10113);
                                                b = i1114 % 128;
                                                int i1115 = i1114 % 2;
                                            } else {
                                                f = c0087m.s;
                                                int i1116 = b;
                                                int i1117 = i1116 & 3;
                                                int i1118 = i1116 | 3;
                                                int i1119 = (i1117 & i1118) + (i1118 | i1117);
                                                a = i1119 % 128;
                                                int i11110 = i1119 % 2;
                                            }
                                        } else if (i == 0) {
                                            int i10115 = i11 + 55;
                                            b = i10115 % 128;
                                            int i10116 = i10115 % 2;
                                            f = c0087m.q;
                                            int i10117 = a;
                                            int i10118 = (i10117 & (-44)) | ((~i10117) & 43);
                                            int i10119 = -(-((i10117 & 43) << 1));
                                            int i11111 = ((i10118 | i10119) << 1) - (i10119 ^ i10118);
                                            b = i11111 % 128;
                                            int i11112 = i11111 % 2;
                                        } else {
                                            f = c0087m.s;
                                            int i11113 = b;
                                            int i11114 = i11113 & 3;
                                            int i11115 = i11113 | 3;
                                            int i11116 = (i11114 & i11115) + (i11115 | i11114);
                                            a = i11116 % 128;
                                            int i11117 = i11116 % 2;
                                        }
                                        int i1210 = (int) ((c0015y3.j * f) + 0.5f);
                                        int i1211 = b;
                                        int i1212 = ((i1211 | 9) << 1) - (i1211 ^ 9);
                                        a = i1212 % 128;
                                        int i1213 = i1212 % 2;
                                        c0015y.e(j(i1210, i));
                                        int i1214 = a;
                                        int i1215 = i1214 & 11;
                                        int i1216 = (i1214 | 11) & (~i1215);
                                        int i1217 = i1215 << 1;
                                        int i1218 = ((i1216 | i1217) << 1) - (i1216 ^ i1217);
                                        b = i1218 % 128;
                                        int i1219 = i1218 % 2;
                                    }
                                }
                            }
                        } else {
                            iJ = j(c0015y.f41o, i);
                            c0015y2 = this.i;
                            int i136 = a;
                            int i137 = i136 & 121;
                            int i138 = -(-((i136 ^ 121) | i137));
                            i7 = (i137 & i138) + (i138 | i137);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                c0015y2.e(Math.min(iJ, i2));
                                throw null;
                            }
                            c0015y2.e(Math.min(iJ, i2));
                        }
                    }
                }
            }
            C0015y c0015y5 = this.i;
            if (!c0015y5.l) {
                int i139 = b;
                int i140 = ((i139 | 117) << 1) - (i139 ^ 117);
                a = i140 % 128;
                int i141 = i140 % 2;
                return;
            }
            int i142 = c0015y5.j;
            if (i142 == i2) {
                int i143 = a;
                int i144 = (i143 & 21) + (i143 | 21);
                b = i144 % 128;
                int i145 = i144 % 2;
                this.k.e(iD);
                s sVar = this.c;
                int i146 = b + 2;
                int i147 = (i146 ^ (-1)) + (i146 << 1);
                a = i147 % 128;
                if (i147 % 2 == 0) {
                    sVar.e(i37);
                    return;
                } else {
                    sVar.e(i37);
                    int i148 = 61 / 0;
                    return;
                }
            }
            C0087m c0087m4 = this.e;
            if (i == 0) {
                int i149 = a;
                int i150 = i149 & 53;
                int i151 = (i149 ^ 53) | i150;
                int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
                b = i152 % 128;
                if (i152 % 2 == 0) {
                    f3 = c0087m4.W;
                    int i153 = 97 / 0;
                } else {
                    f3 = c0087m4.W;
                }
                int i154 = a;
                int i155 = (i154 ^ 57) + ((i154 & 57) << 1);
                b = i155 % 128;
                int i156 = i155 % 2;
            } else {
                f3 = c0087m4.af;
                int i157 = a;
                int i158 = i157 ^ 7;
                int i159 = (((i157 & 7) | i158) << 1) - i158;
                b = i159 % 128;
                if (i159 % 2 == 0) {
                    int i160 = 2 % 4;
                }
            }
            if (sVarK == sVarK2) {
                int i161 = a;
                int i162 = i161 & 123;
                int i163 = (((i161 ^ 123) | i162) << 1) - ((i161 | 123) & (~i162));
                b = i163 % 128;
                int i164 = i163 % 2;
                iD = sVarK.j;
                i37 = sVarK2.j;
                int i165 = b;
                int i166 = i165 & 75;
                int i167 = (((i165 | 75) & (~i166)) - (~(-(-(i166 << 1))))) - 1;
                a = i167 % 128;
                int i168 = i167 % 2;
                f4 = 0.5f;
            } else {
                f4 = f3;
            }
            s sVar2 = this.k;
            float f5 = iD;
            int i169 = -iD;
            int i170 = i37 & i169;
            int i171 = (((i37 ^ i169) | i170) << 1) - ((i37 | i169) & (~i170));
            int i172 = a;
            int i173 = ((((i172 ^ 83) | (i172 & 83)) << 1) - (~(-(((~i172) & 83) | (i172 & (-84)))))) - 1;
            b = i173 % 128;
            if (i173 % 2 == 0) {
                sVar2.e((int) (((i171 >> i142) - f4) - (f5 * 0.5f)));
            } else {
                int i174 = -(~(-i142));
                int i175 = (i171 & i174) + (i174 | i171);
                sVar2.e((int) ((((i175 ^ (-1)) + (i175 << 1)) * f4) + f5 + 0.5f));
            }
            int i176 = b;
            int i177 = (i176 ^ 63) + ((i176 & 63) << 1);
            a = i177 % 128;
            if (i177 % 2 != 0) {
                int i178 = this.k.j;
                int i179 = this.i.j;
                throw null;
            }
            s sVar3 = this.c;
            int i180 = this.k.j;
            int i181 = this.i.j;
            int i182 = b;
            int i183 = (i182 ^ 97) + ((i182 & 97) << 1);
            a = i183 % 128;
            int i184 = i183 % 2;
            int i185 = i180 & i181;
            int i186 = (i180 | i181) & (~i185);
            int i187 = i185 << 1;
            sVar3.e((i186 & i187) + (i186 | i187));
            int i188 = a;
            int i189 = ((i188 ^ 54) + ((i188 & 54) << 1)) - 1;
            b = i189 % 128;
            int i190 = i189 % 2;
        }
        int i191 = b;
        int i192 = i191 & 97;
        int i193 = (i191 ^ 97) | i192;
        int i194 = ((i192 | i193) << 1) - (i193 ^ i192);
        a = i194 % 128;
        if (i194 % 2 == 0) {
            return;
        }
        Object obj12 = null;
        obj12.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    public final s c(N n, int i) {
        Y y;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 ^ 95;
        int i7 = ((((i5 & 95) | i6) << 1) - (~(-i6))) - 1;
        b = i7 % 128;
        s sVar = null;
        if (i7 % 2 == 0) {
            N n2 = n.f;
            throw null;
        }
        N n3 = n.f;
        if (n3 == null) {
            int i8 = (-2) - ((b + 60) ^ (-1));
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return null;
            }
            sVar.hashCode();
            throw null;
        }
        C0087m c0087m = n3.d;
        if (i == 0) {
            int i9 = a;
            int i10 = (((i9 | 14) << 1) - (i9 ^ 14)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            y = c0087m.g;
            int i12 = b + 59;
            a = i12 % 128;
            int i13 = i12 % 2;
        } else {
            y = c0087m.i;
            int i14 = b;
            int i15 = i14 ^ 73;
            int i16 = ((((i14 & 73) | i15) << 1) - (~(-i15))) - 1;
            a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 4 % 5;
            }
        }
        int iOrdinal = n3.e.ordinal();
        if (iOrdinal != 1) {
            int i18 = b;
            int i19 = i18 & 121;
            int i20 = i19 + ((i18 ^ 121) | i19);
            a = i20 % 128;
            if (i20 % 2 == 0 ? iOrdinal == 2 : iOrdinal == 5) {
                sVar = y.k;
                int i21 = b;
                int i22 = i21 & 79;
                int i23 = (i22 - (~(-(-((i21 ^ 79) | i22))))) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
            } else {
                int i25 = ((i18 | 71) << 1) - (i18 ^ 71);
                a = i25 % 128;
                int i26 = i25 % 2;
                if (iOrdinal != 3) {
                    int i27 = i18 + 5;
                    int i28 = i27 % 128;
                    a = i28;
                    if (i27 % 2 == 0 ? iOrdinal == 4 : iOrdinal == 2) {
                        sVar = y.c;
                        int i29 = a;
                        int i30 = (i29 ^ 90) + ((i29 & 90) << 1);
                        i2 = (i30 ^ (-1)) + (i30 << 1);
                        i3 = i2 % 128;
                    } else {
                        int i31 = i28 + 122;
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = i28 & 117;
                        i2 = (((i28 ^ 117) | i34) << 1) - ((~i34) & (i28 | 117));
                        i3 = i2 % 128;
                    }
                } else {
                    sVar = y.c;
                    int i210 = a;
                    int i35 = (i210 ^ 90) + ((i210 & 90) << 1);
                    i2 = (i35 ^ (-1)) + (i35 << 1);
                    i3 = i2 % 128;
                }
                b = i3;
                int i36 = i2 % 2;
            }
        } else {
            sVar = y.k;
            int i211 = b;
            int i212 = i211 & 79;
            int i213 = (i212 - (~(-(-((i211 ^ 79) | i212))))) - 1;
            a = i213 % 128;
            int i214 = i213 % 2;
        }
        int i37 = a;
        int i38 = i37 & 43;
        int i39 = ((((i37 ^ 43) | i38) << 1) - (~(-((i37 | 43) & (~i38))))) - 1;
        b = i39 % 128;
        int i40 = i39 % 2;
        return sVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    public final int j(int i, int i2) {
        int iMax;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 & (-62)) | ((~i4) & 61)) + ((i4 & 61) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 == 0) {
            C0087m c0087m = this.e;
            int i6 = c0087m.f65o;
            int i7 = c0087m.p;
            int i8 = a;
            int i9 = ((i8 & 40) + (i8 | 40)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            iMax = Math.max(i7, i);
            if (i6 > 0) {
                int i11 = a;
                int i12 = i11 & 21;
                int i13 = -(-((i11 ^ 21) | i12));
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    iMax = Math.min(i6, i);
                    int i15 = 45 / 0;
                } else {
                    iMax = Math.min(i6, i);
                }
                int i16 = a + 105;
                b = i16 % 128;
                int i17 = i16 % 2;
            }
            if (iMax != i) {
                int i18 = a;
                int i19 = (i18 | 27) << 1;
                int i20 = -(i18 ^ 27);
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                int i22 = i21 % 2;
                i = iMax;
                int i23 = a;
                int i24 = (i23 & 75) + (i23 | 75);
                b = i24 % 128;
                int i25 = i24 % 2;
            }
        } else {
            C0087m c0087m2 = this.e;
            int i26 = c0087m2.t;
            int i27 = c0087m2.r;
            int i28 = b;
            int i29 = (((i28 & (-46)) | ((~i28) & 45)) - (~(-(-((45 & i28) << 1))))) - 1;
            a = i29 % 128;
            if (i29 % 2 != 0) {
                iMax = Math.max(i27, i);
                int i30 = 24 / 0;
                if (i26 > 0) {
                    int i31 = a;
                    int i32 = ((i31 ^ 91) - (~((i31 & 91) << 1))) - 1;
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    iMax = Math.min(i26, i);
                    int i34 = b;
                    int i35 = i34 & 123;
                    int i36 = i35 + ((i34 ^ 123) | i35);
                    a = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else {
                iMax = Math.max(i27, i);
                if (i26 > 0) {
                    int i38 = a;
                    int i39 = ((i38 ^ 91) - (~((i38 & 91) << 1))) - 1;
                    b = i39 % 128;
                    int i310 = i39 % 2;
                    iMax = Math.min(i26, i);
                    int i311 = b;
                    int i312 = i311 & 123;
                    int i313 = i312 + ((i311 ^ 123) | i312);
                    a = i313 % 128;
                    int i314 = i313 % 2;
                }
            }
            if (iMax != i) {
                i = iMax;
                int i210 = a;
                int i211 = (i210 & 75) + (i210 | 75);
                b = i211 % 128;
                int i212 = i211 % 2;
            }
        }
        int i40 = b;
        int i41 = (i40 & 93) + (i40 | 93);
        a = i41 % 128;
        int i42 = i41 % 2;
        return i;
    }
}
