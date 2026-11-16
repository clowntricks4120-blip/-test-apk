package ivas.gov.bisp.enumeration.B;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private static int a = 0;
    private static int b = 1;
    public static int c;
    public Y d;
    public ArrayList<Y> e = new ArrayList<>();

    public n(Y y, int i) {
        this.d = null;
        int i2 = c;
        c = (i2 & 1) + (i2 | 1);
        this.d = y;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad A[PHI: r10
  0x00ad: PHI (r10v28 ivas.gov.bisp.enumeration.B.s) = (r10v22 ivas.gov.bisp.enumeration.B.s), (r10v37 ivas.gov.bisp.enumeration.B.s) binds: [B:16:0x0094, B:13:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1 A[SYNTHETIC] */
    public final long d(s sVar, long j) {
        s sVar2;
        int i;
        long jD;
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 83;
        a = i4 % 128;
        int i5 = i4 % 2;
        Y y = sVar.g;
        Object obj = null;
        if (!(!(y instanceof al))) {
            int i6 = a;
            int i7 = i6 & 53;
            int i8 = ((i6 | 53) & (~i7)) + (i7 << 1);
            int i9 = i8 % 128;
            b = i9;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i10 = ((i9 | 17) << 1) - (i9 ^ 17);
            a = i10 % 128;
            int i11 = i10 % 2;
            return j;
        }
        int size = sVar.m.size();
        int i12 = b;
        int i13 = i12 & 7;
        int i14 = -(-((i12 ^ 7) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        int i16 = i15 % 128;
        a = i16;
        if (i15 % 2 != 0) {
            throw null;
        }
        int i17 = i16 + 29;
        b = i17 % 128;
        int i18 = i17 % 2;
        long jMax = j;
        int i19 = 0;
        while (i19 < size) {
            int i20 = a;
            int i21 = i20 & 25;
            int i22 = (i20 | 25) & (~i21);
            int i23 = i21 << 1;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            b = i24 % 128;
            int i25 = i24 % 2;
            V v = sVar.m.get(i19);
            int i26 = b;
            int i27 = i26 & 123;
            int i28 = (i26 ^ 123) | i27;
            int i29 = (i27 & i28) + (i28 | i27);
            int i30 = i29 % 128;
            a = i30;
            int i31 = i29 % 2;
            if (v instanceof s) {
                int i32 = i30 & 77;
                int i33 = (i30 | 77) & (~i32);
                int i34 = i32 << 1;
                int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                b = i35 % 128;
                if (i35 % 2 == 0) {
                    sVar2 = (s) v;
                    int i36 = 75 / 0;
                    if (sVar2.g == y) {
                        int i37 = b;
                        int i38 = ((i37 | 32) << 1) - (i37 ^ 32);
                        i = (i38 ^ (-1)) + (i38 << 1);
                        a = i % 128;
                        if (i % 2 == 0) {
                            throw null;
                        }
                    } else {
                        jD = d(sVar2, ((long) sVar2.h) + j);
                        int i39 = b;
                        int i40 = (i39 & (-92)) | ((~i39) & 91);
                        int i41 = -(-((i39 & 91) << 1));
                        i2 = (i40 & i41) + (i41 | i40);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            Math.max(jMax, jD);
                            throw null;
                        }
                        jMax = Math.max(jMax, jD);
                        int i42 = b;
                        int i43 = i42 & 73;
                        int i44 = ((i42 ^ 73) | i43) << 1;
                        int i45 = -((i42 | 73) & (~i43));
                        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                    }
                } else {
                    sVar2 = (s) v;
                    if (sVar2.g == y) {
                        int i310 = b;
                        int i311 = ((i310 | 32) << 1) - (i310 ^ 32);
                        i = (i311 ^ (-1)) + (i311 << 1);
                        a = i % 128;
                        if (i % 2 == 0) {
                            throw null;
                        }
                    } else {
                        jD = d(sVar2, ((long) sVar2.h) + j);
                        int i312 = b;
                        int i48 = (i312 & (-92)) | ((~i312) & 91);
                        int i49 = -(-((i312 & 91) << 1));
                        i2 = (i48 & i49) + (i49 | i48);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            Math.max(jMax, jD);
                            throw null;
                        }
                        jMax = Math.max(jMax, jD);
                        int i410 = b;
                        int i411 = i410 & 73;
                        int i412 = ((i410 ^ 73) | i411) << 1;
                        int i413 = -((i410 | 73) & (~i411));
                        int i414 = (i412 ^ i413) + ((i413 & i412) << 1);
                        a = i414 % 128;
                        int i415 = i414 % 2;
                    }
                }
            }
            i19 = ((((i19 ^ 1) | (i19 & 1)) << 1) - (~(-(((~i19) & 1) | (i19 & (-2)))))) - 1;
            int i50 = a;
            int i51 = (i50 ^ 29) + ((i50 & 29) << 1);
            b = i51 % 128;
            int i52 = i51 % 2;
        }
        if (sVar == y.k) {
            int i53 = b;
            int i54 = (-2) - (((i53 ^ 34) + ((i53 & 34) << 1)) ^ (-1));
            a = i54 % 128;
            int i55 = i54 % 2;
            long jL = y.l();
            s sVar3 = y.c;
            int i56 = b;
            int i57 = ((i56 | 94) << 1) - (i56 ^ 94);
            int i58 = (i57 ^ (-1)) + (i57 << 1);
            a = i58 % 128;
            int i59 = i58 % 2;
            long j2 = j + jL;
            long jD2 = d(sVar3, j2);
            int i60 = b;
            int i61 = i60 | 3;
            int i62 = i61 << 1;
            int i63 = -((~(i60 & 3)) & i61);
            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
            a = i64 % 128;
            if (i64 % 2 != 0) {
                Math.max(jMax, jD2);
                int i65 = y.c.h;
                obj.hashCode();
                throw null;
            }
            jMax = Math.max(Math.max(jMax, jD2), j2 - ((long) y.c.h));
            int i66 = b + 53;
            a = i66 % 128;
            int i67 = i66 % 2;
        }
        int i68 = b;
        int i69 = i68 & 25;
        int i70 = i69 + ((i68 ^ 25) | i69);
        a = i70 % 128;
        int i71 = i70 % 2;
        return jMax;
    }

    public final long c(s sVar, long j) {
        long jMin;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 85;
        int i5 = (i3 ^ 85) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            boolean z = sVar.g instanceof al;
            obj.hashCode();
            throw null;
        }
        Y y = sVar.g;
        if (!(!(y instanceof al))) {
            int i7 = b;
            int i8 = i7 & 59;
            int i9 = (~i8) & (i7 | 59);
            int i10 = i8 << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i7 + 101;
            a = i13 % 128;
            int i14 = i13 % 2;
            return j;
        }
        int size = sVar.m.size();
        int i15 = a;
        int i16 = (i15 ^ 16) + ((i15 & 16) << 1);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        int i18 = i17 % 128;
        b = i18;
        int i19 = i17 % 2;
        int i20 = i18 & 37;
        int i21 = -(-((i18 ^ 37) | i20));
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        a = i22 % 128;
        int i23 = i22 % 2;
        int i24 = 0;
        long jMin2 = j;
        int i25 = 0;
        while (i25 < size) {
            int i26 = b;
            int i27 = ((i26 & 85) - (~(i26 | 85))) - 1;
            a = i27 % 128;
            int i28 = i27 % 2;
            V v = sVar.m.get(i25);
            int i29 = b;
            int i30 = i29 & 95;
            int i31 = i30 + ((i29 ^ 95) | i30);
            a = i31 % 128;
            int i32 = i31 % 2;
            if (v instanceof s) {
                int i33 = (i29 & (-26)) | ((~i29) & 25);
                int i34 = (i29 & 25) << 1;
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                a = i35 % 128;
                if (i35 % 2 != 0) {
                    Y y2 = ((s) v).g;
                    throw null;
                }
                s sVar2 = (s) v;
                if (sVar2.g == y) {
                    int i36 = a + 89;
                    int i37 = i36 % 128;
                    b = i37;
                    if (i36 % 2 == 0) {
                        int i38 = 55 / i24;
                    }
                    int i39 = i37 + 9;
                    a = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    long j2 = sVar2.h;
                    int i41 = b;
                    int i42 = ((~i41) & 41) | (i41 & (-42));
                    int i43 = -(-((i41 & 41) << 1));
                    int i44 = (i42 & i43) + (i42 | i43);
                    a = i44 % 128;
                    int i45 = i44 % 2;
                    jMin2 = Math.min(jMin2, c(sVar2, j2 + j));
                    int i46 = b;
                    int i47 = (i46 & 105) + (i46 | 105);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                }
            }
            int i49 = i25 ^ 120;
            int i50 = (i25 & 120) << 1;
            int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
            int i52 = i51 & (-119);
            int i53 = -(-((i51 ^ (-119)) | i52));
            i25 = ((i52 | i53) << 1) - (i52 ^ i53);
            int i54 = b;
            int i55 = i54 & 93;
            int i56 = -(-((i54 ^ 93) | i55));
            int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
            a = i57 % 128;
            int i58 = i57 % 2;
            i24 = 0;
        }
        if (sVar == y.c) {
            int i59 = a;
            int i60 = i59 & 29;
            int i61 = (((i59 ^ 29) | i60) << 1) - ((i59 | 29) & (~i60));
            b = i61 % 128;
            int i62 = i61 % 2;
            long jL = y.l();
            s sVar3 = y.k;
            int i63 = a;
            int i64 = (i63 ^ 5) + ((i63 & 5) << 1);
            b = i64 % 128;
            int i65 = i64 % 2;
            long j3 = j - jL;
            long jC = c(sVar3, j3);
            int i66 = a;
            int i67 = i66 & 115;
            int i68 = (i67 - (~((i66 ^ 115) | i67))) - 1;
            b = i68 % 128;
            if (i68 % 2 == 0) {
                jMin = Math.min(jMin2, jC);
                i = y.k.h;
                int i69 = 80 / 0;
            } else {
                jMin = Math.min(jMin2, jC);
                i = y.k.h;
            }
            int i70 = a + 63;
            b = i70 % 128;
            int i71 = i70 % 2;
            jMin2 = Math.min(jMin, j3 - ((long) i));
            int i72 = b;
            int i73 = (-2) - ((((i72 | 112) << 1) - (i72 ^ 112)) ^ (-1));
            a = i73 % 128;
            if (i73 % 2 != 0) {
                int i74 = 2 % 3;
            }
        }
        int i75 = b;
        int i76 = ((i75 ^ 20) + ((i75 & 20) << 1)) - 1;
        a = i76 % 128;
        int i77 = i76 % 2;
        return jMin2;
    }
}
