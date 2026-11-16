package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o00O00;
import ivas.gov.bisp.enumeration.o000O000.o00Ooo;
import ivas.gov.bisp.enumeration.o000O000.o0OoOo0;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ak {
    private static int a = 1;
    private static int b;
    public static final Class<?> c;
    public static final o00O00<?, ?> d;
    public static final o00O00<?, ?> e;
    public static final o00O00<?, ?> f;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
            int i = a;
            int i2 = i & 51;
            int i3 = (i ^ 51) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (Throwable unused) {
            cls = null;
        }
        c = cls;
        d = z(false);
        e = z(true);
        C0050f c0050f = new C0050f();
        int i7 = (-2) - ((a + 40) ^ (-1));
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        f = c0050f;
        int i10 = (i8 & 63) + (i8 | 63);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public static <UT, UB> UB C(int i, int i2, UB ub, o00O00<UT, UB> o00o00) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-84)) | ((~i4) & 83);
        int i6 = (i4 & 83) << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (ub == null) {
            ub = (UB) o00o00.p();
            int i8 = a;
            int i9 = i8 & 125;
            int i10 = (i8 ^ 125) | i9;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        o00o00.i(ub, i, i2);
        int i13 = a;
        int i14 = i13 & 7;
        int i15 = ((~i14) & (i13 | 7)) + (i14 << 1);
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 15 / 0;
        }
        int i17 = ((i13 & 100) + (i13 | 100)) - 1;
        b = i17 % 128;
        int i18 = i17 % 2;
        return ub;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    public static boolean D(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 93) + ((i2 & 93) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        Object obj3 = null;
        if (obj != obj2) {
            int i6 = i4 + 77;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            if (obj != null) {
                int i9 = i7 & 83;
                int i10 = i7 | 83;
                int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    obj.equals(obj2);
                    obj3.hashCode();
                    throw null;
                }
                if (!(!obj.equals(obj2))) {
                    int i12 = b + 105;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                }
            }
            int i14 = a + 25;
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 4 % 5;
            }
            z = false;
        } else {
            int i16 = b + 105;
            a = i16 % 128;
            int i17 = i16 % 2;
            z = true;
        }
        int i18 = a;
        int i19 = i18 & 121;
        int i20 = (i18 ^ 121) | i19;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static void F(int i, List<AbstractC0069z> list, InterfaceC0051g interfaceC0051g) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 ^ 5;
        int i6 = ((i4 & 5) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        if (list != null) {
            int i9 = (i4 | 39) << 1;
            int i10 = -(((~i4) & 39) | (i4 & (-40)));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            if (!list.isEmpty()) {
                int i13 = a;
                int i14 = (i13 ^ 61) + ((i13 & 61) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i16 = a;
                int i17 = i16 & 11;
                int i18 = (i16 | 11) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 3 / 2;
                }
                int i22 = 0;
                while (i22 < list.size()) {
                    int i23 = a;
                    int i24 = (-2) - (((i23 ^ 92) + ((i23 & 92) << 1)) ^ (-1));
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    AbstractC0064u abstractC0064u = c0055l.c;
                    AbstractC0069z abstractC0069z = list.get(i22);
                    int i26 = b;
                    int i27 = (i26 & 51) + (i26 | 51);
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        abstractC0064u.cc(i, abstractC0069z);
                        i2 = ((i22 & 118) + (i22 | 118)) - 1;
                    } else {
                        abstractC0064u.cc(i, abstractC0069z);
                        i2 = ((i22 | 1) << 1) - (i22 ^ 1);
                    }
                    i22 = i2;
                }
            }
        }
        int i28 = b;
        int i29 = i28 & 21;
        int i30 = (((i28 | 21) & (~i29)) - (~(i29 << 1))) - 1;
        a = i30 % 128;
        if (i30 % 2 == 0) {
            throw null;
        }
    }

    public static int d(int i, List<AbstractC0069z> list) {
        int i2 = 2 % 2;
        int i3 = a + 55;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            list.size();
            obj.hashCode();
            throw null;
        }
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            int i5 = a;
            int i6 = i5 & 69;
            int i7 = (i5 ^ 69) | i6;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return 0;
        }
        int iBT = AbstractC0064u.bT(i) * size;
        int i10 = a;
        int i11 = (((i10 | 74) << 1) - (i10 ^ 74)) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        while (i4 < list.size()) {
            int i13 = b;
            int i14 = ((i13 | 89) << 1) - (i13 ^ 89);
            a = i14 % 128;
            int i15 = i14 % 2;
            int iBy = AbstractC0064u.by(list.get(i4));
            int i16 = a;
            int i17 = i16 + 112;
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = -(-iBy);
            int i21 = iBT & i20;
            iBT = (((iBT | i20) & (~i21)) - (~(i21 << 1))) - 1;
            i4 = (((i4 | 2) << 1) - (i4 ^ 2)) - 1;
            int i22 = ((i16 | 113) << 1) - (i16 ^ 113);
            b = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a + 75;
        b = i24 % 128;
        if (i24 % 2 == 0) {
            return iBT;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8 A[LOOP:1: B:25:0x00d6->B:26:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x014e  */
    public static int f(List<Integer> list) {
        int size;
        int i;
        int i2;
        int i3;
        L l;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = (i7 & (-82)) | ((~i7) & 81);
        int i9 = -(-((i7 & 81) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int iBG = 0;
        if (i10 % 2 == 0) {
            size = list.size();
            if (size != 0) {
                i = 1;
                if (!(!(list instanceof L))) {
                    int i11 = a;
                    int i12 = i11 & 1;
                    int i13 = -(-((i11 ^ 1) | i12));
                    int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                    int i15 = i14 % 128;
                    b = i15;
                    int i16 = i14 % 2;
                    l = (L) list;
                    i4 = i15 + 109;
                    a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i17 = 3 % 2;
                    }
                    while (i < size) {
                        i5 = a + 71;
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            iBG /= AbstractC0064u.bG(l.h(i));
                        } else {
                            int iBG2 = AbstractC0064u.bG(l.h(i));
                            iBG = (iBG ^ iBG2) + ((iBG & iBG2) << 1);
                        }
                        int i18 = a;
                        int i19 = (i18 & 39) + (i18 | 39);
                        int i20 = i19 % 128;
                        b = i20;
                        int i21 = i19 % 2;
                        i = ((i & 1) << 1) + (i ^ 1);
                        int i22 = i20 & 61;
                        int i23 = ((i20 ^ 61) | i22) << 1;
                        int i24 = -((i20 | 61) & (~i22));
                        int i25 = (i23 & i24) + (i24 | i23);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                    }
                } else {
                    int i27 = a;
                    int i28 = i27 & 105;
                    int i29 = ((i27 ^ 105) | i28) << 1;
                    int i30 = -((i27 | 105) & (~i28));
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    b = i31 % 128;
                    int i32 = i31 % 2;
                    i2 = 0;
                    while (i2 < size) {
                        int i33 = b;
                        int i34 = i33 & 75;
                        int i35 = (i33 ^ 75) | i34;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        a = i36 % 128;
                        int i37 = i36 % 2;
                        int iIntValue = list.get(i2).intValue();
                        int i38 = b + 47;
                        a = i38 % 128;
                        int i39 = i38 % 2;
                        int i40 = iBG - (~(-(-AbstractC0064u.bG(iIntValue))));
                        iBG = (i40 << 1) + (i40 ^ (-1));
                        int i41 = (-2) - ((i2 - 33) ^ (-1));
                        int i42 = i41 & 35;
                        int i43 = -(-((i41 ^ 35) | i42));
                        i2 = ((i42 | i43) << 1) - (i43 ^ i42);
                        int i44 = a;
                        int i45 = ((i44 ^ 81) | (i44 & 81)) << 1;
                        int i46 = -(((~i44) & 81) | (i44 & (-82)));
                        int i47 = (i45 & i46) + (i46 | i45);
                        b = i47 % 128;
                        int i48 = i47 % 2;
                    }
                }
                int i49 = a;
                int i50 = ((i49 ^ 125) | (i49 & 125)) << 1;
                int i51 = -(((~i49) & 125) | (i49 & (-126)));
                i3 = (i50 & i51) + (i51 | i50);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    return iBG;
                }
                throw null;
            }
            int i52 = a;
            int i53 = i52 & 35;
            int i54 = (i53 - (~((i52 ^ 35) | i53))) - 1;
            b = i54 % 128;
            int i55 = i54 % 2;
            int i56 = (((i52 & (-78)) | ((~i52) & 77)) - (~((i52 & 77) << 1))) - 1;
            b = i56 % 128;
            int i57 = i56 % 2;
            return 0;
        }
        size = list.size();
        if (size != 0) {
            i = 0;
            if (!(!(list instanceof L))) {
                int i110 = a;
                int i111 = i110 & 1;
                int i112 = -(-((i110 ^ 1) | i111));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                int i114 = i113 % 128;
                b = i114;
                int i115 = i113 % 2;
                l = (L) list;
                i4 = i114 + 109;
                a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i116 = 3 % 2;
                }
                while (i < size) {
                    i5 = a + 71;
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        iBG /= AbstractC0064u.bG(l.h(i));
                    } else {
                        int iBG3 = AbstractC0064u.bG(l.h(i));
                        iBG = (iBG ^ iBG3) + ((iBG & iBG3) << 1);
                    }
                    int i117 = a;
                    int i118 = (i117 & 39) + (i117 | 39);
                    int i210 = i118 % 128;
                    b = i210;
                    int i211 = i118 % 2;
                    i = ((i & 1) << 1) + (i ^ 1);
                    int i212 = i210 & 61;
                    int i213 = ((i210 ^ 61) | i212) << 1;
                    int i214 = -((i210 | 61) & (~i212));
                    int i215 = (i213 & i214) + (i214 | i213);
                    a = i215 % 128;
                    int i216 = i215 % 2;
                }
            } else {
                int i217 = a;
                int i218 = i217 & 105;
                int i219 = ((i217 ^ 105) | i218) << 1;
                int i310 = -((i217 | 105) & (~i218));
                int i311 = ((i219 | i310) << 1) - (i310 ^ i219);
                b = i311 % 128;
                int i312 = i311 % 2;
                i2 = 0;
                while (i2 < size) {
                    int i313 = b;
                    int i314 = i313 & 75;
                    int i315 = (i313 ^ 75) | i314;
                    int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
                    a = i316 % 128;
                    int i317 = i316 % 2;
                    int iIntValue2 = list.get(i2).intValue();
                    int i318 = b + 47;
                    a = i318 % 128;
                    int i319 = i318 % 2;
                    int i410 = iBG - (~(-(-AbstractC0064u.bG(iIntValue2))));
                    iBG = (i410 << 1) + (i410 ^ (-1));
                    int i411 = (-2) - ((i2 - 33) ^ (-1));
                    int i412 = i411 & 35;
                    int i413 = -(-((i411 ^ 35) | i412));
                    i2 = ((i412 | i413) << 1) - (i413 ^ i412);
                    int i414 = a;
                    int i415 = ((i414 ^ 81) | (i414 & 81)) << 1;
                    int i416 = -(((~i414) & 81) | (i414 & (-82)));
                    int i417 = (i415 & i416) + (i416 | i415);
                    b = i417 % 128;
                    int i418 = i417 % 2;
                }
            }
            int i419 = a;
            int i58 = ((i419 ^ 125) | (i419 & 125)) << 1;
            int i59 = -(((~i419) & 125) | (i419 & (-126)));
            i3 = (i58 & i59) + (i59 | i58);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return iBG;
            }
            throw null;
        }
        int i510 = a;
        int i511 = i510 & 35;
        int i512 = (i511 - (~((i510 ^ 35) | i511))) - 1;
        b = i512 % 128;
        int i513 = i512 % 2;
        int i514 = (((i510 & (-78)) | ((~i510) & 77)) - (~((i510 & 77) << 1))) - 1;
        b = i514 % 128;
        int i515 = i514 % 2;
        return 0;
    }

    public static int g(List<?> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = (((i2 ^ 99) | i3) << 1) - ((i2 | 99) & (~i3));
        a = i4 % 128;
        return i4 % 2 == 0 ? list.size() >> 5 : list.size() * 4;
    }

    public static int h(int i, List<?> list, boolean z) {
        int iBK;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((((i3 ^ 57) | (i3 & 57)) << 1) - (~(-(((~i3) & 57) | (i3 & (-58)))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        if (size == 0) {
            int i6 = a;
            int i7 = ((i6 | 29) << 1) - (i6 ^ 29);
            b = i7 % 128;
            int i8 = i7 % 2;
            return 0;
        }
        if (!z) {
            int iBC = AbstractC0064u.bC(i, 0) * size;
            int i9 = b;
            int i10 = i9 ^ 45;
            int i11 = ((((i9 & 45) | i10) << 1) - (~(-i10))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            return iBC;
        }
        int i13 = a;
        int i14 = (i13 & 13) + (i13 | 13);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = size & 2;
            iBK = AbstractC0064u.bK((((size ^ 2) | i15) << 1) - ((size | 2) & (~i15))) / AbstractC0064u.bT(i);
        } else {
            int iBT = AbstractC0064u.bT(i);
            int iBK2 = AbstractC0064u.bK(size * 4);
            int i16 = -(-iBT);
            int i17 = (iBK2 | i16) << 1;
            int i18 = -((i16 & (~iBK2)) | ((~i16) & iBK2));
            iBK = (i17 ^ i18) + ((i18 & i17) << 1);
        }
        int i19 = b + 81;
        a = i19 % 128;
        if (i19 % 2 != 0) {
            return iBK;
        }
        throw null;
    }

    public static int i(int i, List<?> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-80)) | ((~i3) & 79);
        int i5 = -(-((i3 & 79) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int size = list.size();
        Object obj = null;
        if (size == 0) {
            int i8 = b;
            int i9 = (i8 ^ 31) + ((i8 & 31) << 1);
            a = i9 % 128;
            int i10 = (i9 % 2 != 0 ? 1 : 0) ^ 1;
            int i11 = ((i8 | 71) << 1) - (i8 ^ 71);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return i10;
            }
            throw null;
        }
        if (!z) {
            int iBx = AbstractC0064u.bx(i, 0L) * size;
            int i12 = b;
            int i13 = i12 & 41;
            int i14 = (((i12 | 41) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            a = i14 % 128;
            if (i14 % 2 != 0) {
                return iBx;
            }
            obj.hashCode();
            throw null;
        }
        int i15 = a;
        int i16 = ((i15 | 55) << 1) - (i15 ^ 55);
        b = i16 % 128;
        int iBK = i16 % 2 != 0 ? AbstractC0064u.bK(size * 44) % AbstractC0064u.bT(i) : (AbstractC0064u.bK(size * 8) - (~AbstractC0064u.bT(i))) - 1;
        int i17 = b;
        int i18 = ((i17 & 46) + (i17 | 46)) - 1;
        a = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 32 / 0;
        }
        return iBK;
    }

    public static int j(List<?> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = ((((i2 ^ 67) | i3) << 1) - (~(-((i2 | 67) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        return i5 == 0 ? size / 107 : size * 8;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007f A[PHI: r5
  0x007f: PHI (r5v29 java.lang.Object) = (r5v10 java.lang.Object), (r5v35 java.lang.Object) binds: [B:17:0x007d, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x00af A[PHI: r5
  0x00af: PHI (r5v11 java.lang.Object) = (r5v10 java.lang.Object), (r5v35 java.lang.Object) binds: [B:17:0x007d, B:14:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    public static int p(int i, List<?> list, ah ahVar) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = b + 11;
        a = i3 % 128;
        int i4 = i3 % 2;
        int size = list.size();
        if (size == 0) {
            int i5 = b;
            int i6 = i5 & 29;
            int i7 = (i5 | 29) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            int i12 = i10 & 87;
            int i13 = -(-(i10 | 87));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int iBT = AbstractC0064u.bT(i) * size;
        int i15 = b;
        int i16 = (-2) - (((i15 & 64) + (i15 | 64)) ^ (-1));
        a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < size) {
            int i19 = b;
            int i20 = i19 & 103;
            int i21 = -(-(i19 | 103));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                obj = list.get(i18);
                int i23 = 51 / 0;
                if (!(obj instanceof V)) {
                    int i24 = b + 25;
                    a = i24 % 128;
                    int i25 = i24 % 2;
                    int iBK = AbstractC0064u.bK(((AbstractC0053j) ((aa) obj)).k(ahVar));
                    int i26 = iBT ^ iBK;
                    int i27 = (iBT & iBK) << 1;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    int i29 = a;
                    int i30 = i29 ^ 93;
                    int i31 = ((i29 & 93) | i30) << 1;
                    int i32 = -i30;
                    int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                    b = i33 % 128;
                    int i34 = i33 % 2;
                    iBT = i28;
                } else {
                    int i35 = a + 111;
                    b = i35 % 128;
                    int i36 = i35 % 2;
                    int iBI = AbstractC0064u.bI((V) obj);
                    int i37 = ((iBI | iBT) << 1) - (iBT ^ iBI);
                    int i38 = a;
                    int i39 = ((i38 ^ 81) | (i38 & 81)) << 1;
                    int i40 = -(((~i38) & 81) | (i38 & (-82)));
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    iBT = i37;
                }
            } else {
                obj = list.get(i18);
                if (obj instanceof V) {
                    int i310 = a + 111;
                    b = i310 % 128;
                    int i311 = i310 % 2;
                    int iBI2 = AbstractC0064u.bI((V) obj);
                    int i312 = ((iBI2 | iBT) << 1) - (iBT ^ iBI2);
                    int i313 = a;
                    int i314 = ((i313 ^ 81) | (i313 & 81)) << 1;
                    int i43 = -(((~i313) & 81) | (i313 & (-82)));
                    int i44 = ((i314 | i43) << 1) - (i43 ^ i314);
                    b = i44 % 128;
                    int i45 = i44 % 2;
                    iBT = i312;
                } else {
                    int i210 = b + 25;
                    a = i210 % 128;
                    int i211 = i210 % 2;
                    int iBK2 = AbstractC0064u.bK(((AbstractC0053j) ((aa) obj)).k(ahVar));
                    int i212 = iBT ^ iBK2;
                    int i213 = (iBT & iBK2) << 1;
                    int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                    int i215 = a;
                    int i315 = i215 ^ 93;
                    int i316 = ((i215 & 93) | i315) << 1;
                    int i317 = -i315;
                    int i318 = (i316 ^ i317) + ((i316 & i317) << 1);
                    b = i318 % 128;
                    int i319 = i318 % 2;
                    iBT = i214;
                }
            }
            int i46 = i18 ^ (-35);
            int i47 = (i18 & (-35)) << 1;
            int i48 = (i46 & i47) + (i47 | i46);
            int i49 = i48 & 36;
            i18 = (((~i49) & (i48 | 36)) - (~(i49 << 1))) - 1;
            int i50 = b;
            int i51 = i50 & 21;
            int i52 = ((i50 ^ 21) | i51) << 1;
            int i53 = -((i50 | 21) & (~i51));
            int i54 = (i52 & i53) + (i53 | i52);
            a = i54 % 128;
            int i55 = i54 % 2;
        }
        int i56 = b;
        int i57 = i56 & 75;
        int i58 = (i56 | 75) & (~i57);
        int i59 = i57 << 1;
        int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
        a = i60 % 128;
        int i61 = i60 % 2;
        return iBT;
    }

    public static int q(int i, List<Integer> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 93) << 1) - (i3 ^ 93);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            list.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = list.size();
        if (size == 0) {
            int i5 = a;
            int i6 = i5 & 73;
            int i7 = (i5 ^ 73) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (i5 ^ 77) + ((i5 & 77) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return 0;
        }
        int iS = s(list);
        if (!z) {
            int iBT = (-2) - (((AbstractC0064u.bT(i) * size) - (~(-(-iS)))) ^ (-1));
            int i12 = a;
            int i13 = (((i12 ^ 49) | (i12 & 49)) << 1) - (((~i12) & 49) | (i12 & (-50)));
            b = i13 % 128;
            int i14 = i13 % 2;
            return iBT;
        }
        int i15 = b;
        int i16 = i15 & 97;
        int i17 = (i15 ^ 97) | i16;
        int i18 = (i16 & i17) + (i17 | i16);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            return AbstractC0064u.bK(iS) >> AbstractC0064u.bT(i);
        }
        return (-2) - ((AbstractC0064u.bK(iS) - (~(-(-AbstractC0064u.bT(i))))) ^ (-1));
    }

    public static <T, FT extends o00Ooo.OooO00o<FT>> void B(o0OoOo0<FT> o0oooo0, T t, T t2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = (i2 | 3) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            o0oooo0.f(t2).m();
            throw null;
        }
        C0056m c0056mF = o0oooo0.f(t2);
        if (!c0056mF.m()) {
            int i7 = a;
            int i8 = i7 ^ 25;
            int i9 = (i7 & 25) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            C0056m c0056mG = o0oooo0.g(t);
            Objects.requireNonNull(c0056mG);
            int i12 = b;
            int i13 = ((i12 ^ 32) + ((i12 & 32) << 1)) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (i15 < c0056mF.d.f()) {
                int i16 = b;
                int i17 = (i16 & (-100)) | ((~i16) & 99);
                int i18 = -(-((i16 & 99) << 1));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                c0056mG.q(c0056mF.d.g(i15));
                int i21 = ((i15 ^ 96) - (~(-(-((i15 & 96) << 1))))) - 1;
                int i22 = i21 & (-95);
                int i23 = i21 | (-95);
                i15 = ((i22 | i23) << 1) - (i22 ^ i23);
                int i24 = a + 57;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            Iterator<T> it = c0056mF.d.h().iterator();
            int i26 = b + 35;
            int i27 = i26 % 128;
            a = i27;
            int i28 = i26 % 2;
            int i29 = i27 & 67;
            int i30 = i29 + ((i27 ^ 67) | i29);
            b = i30 % 128;
            int i31 = i30 % 2;
            while (it.hasNext()) {
                int i32 = b + 86;
                int i33 = (i32 ^ (-1)) + (i32 << 1);
                a = i33 % 128;
                int i34 = i33 % 2;
                c0056mG.q((Map.Entry) it.next());
                int i35 = b;
                int i36 = i35 & 67;
                int i37 = (i36 - (~((i35 ^ 67) | i36))) - 1;
                a = i37 % 128;
                int i38 = i37 % 2;
            }
        }
        int i39 = b;
        int i40 = i39 & 21;
        int i41 = (i39 | 21) & (~i40);
        int i42 = -(-(i40 << 1));
        int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
        a = i43 % 128;
        if (i43 % 2 == 0) {
            int i44 = 34 / 0;
        }
    }

    public static void M(int i, List<?> list, InterfaceC0051g interfaceC0051g, ah ahVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 31;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (list != null) {
            int i5 = (i3 ^ 9) + ((i3 & 9) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (!list.isEmpty()) {
                int i7 = a + 119;
                b = i7 % 128;
                int i8 = i7 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i9 = a;
                int i10 = i9 & 115;
                int i11 = -(-((i9 ^ 115) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                b = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                while (i14 < list.size()) {
                    int i15 = a;
                    int i16 = (i15 & 53) + (i15 | 53);
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    Object obj2 = list.get(i14);
                    int i18 = a + 81;
                    b = i18 % 128;
                    if (i18 % 2 != 0) {
                        c0055l.e(i, obj2, ahVar);
                        int i19 = i14 & 10;
                        int i20 = (((i14 ^ 10) | i19) << 1) - ((i14 | 10) & (~i19));
                        int i21 = i20 & 107;
                        i14 = ((i20 | 107) & (~i21)) + (i21 << 1);
                    } else {
                        c0055l.e(i, obj2, ahVar);
                        int i22 = i14 & (-102);
                        int i23 = -(-((i14 ^ (-102)) | i22));
                        int i24 = (i22 & i23) + (i23 | i22);
                        int i25 = i24 & 103;
                        int i26 = -(-((i24 ^ 103) | i25));
                        i14 = ((i25 | i26) << 1) - (i25 ^ i26);
                    }
                    int i27 = b + 53;
                    a = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        }
        int i29 = b;
        int i30 = i29 & 67;
        int i31 = (((i29 ^ 67) | i30) << 1) - ((i29 | 67) & (~i30));
        a = i31 % 128;
        int i32 = i31 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[LOOP:2: B:19:0x0056->B:21:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a4 A[PHI: r10
  0x00a4: PHI (r10v3 ivas.gov.bisp.enumeration.aD.l) = (r10v1 ivas.gov.bisp.enumeration.aD.l), (r10v5 ivas.gov.bisp.enumeration.aD.l) binds: [B:17:0x0053, B:14:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x0137  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c A[LOOP:1: B:35:0x0131->B:39:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[PHI: r5 r10
  PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:18:0x0055, B:14:0x004b] A[DONT_GENERATE, DONT_INLINE]
  PHI (r10v2 ivas.gov.bisp.enumeration.aD.l) = (r10v1 ivas.gov.bisp.enumeration.aD.l), (r10v5 ivas.gov.bisp.enumeration.aD.l) binds: [B:18:0x0055, B:14:0x004b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static void O(int i, List<Integer> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2;
        C0055l c0055l;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iIntValue;
        int i9 = 2 % 2;
        int i10 = b + 125;
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        if (list != null) {
            int i13 = i11 & 119;
            int i14 = (i11 | 119) & (~i13);
            int i15 = 1;
            int i16 = i13 << 1;
            int i17 = (i14 & i16) + (i14 | i16);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 10 / 0;
                if (!list.isEmpty()) {
                    int i19 = b;
                    i2 = (((i19 | 124) << 1) - (i19 ^ 124)) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        c0055l = (C0055l) interfaceC0051g;
                        Objects.requireNonNull(c0055l);
                        if (!z) {
                            while (i15 < list.size()) {
                                int i20 = b + 95;
                                a = i20 % 128;
                                int i21 = i20 % 2;
                                AbstractC0064u abstractC0064u = c0055l.c;
                                Integer num = list.get(i15);
                                int i22 = a;
                                int i23 = i22 & 41;
                                int i24 = -(-((i22 ^ 41) | i23));
                                int i25 = (i23 & i24) + (i24 | i23);
                                b = i25 % 128;
                                int i26 = i25 % 2;
                                abstractC0064u.ci(i, num.intValue());
                                int i27 = i15 & 1;
                                int i28 = -(-((i15 ^ 1) | i27));
                                i15 = (i27 & i28) + (i27 | i28);
                                int i29 = a;
                                int i30 = i29 & 125;
                                int i31 = (i29 ^ 125) | i30;
                                int i32 = (i30 & i31) + (i31 | i30);
                                b = i32 % 128;
                                int i33 = i32 % 2;
                            }
                        } else {
                            int i34 = b;
                            int i35 = i34 & 105;
                            int i36 = (i34 | 105) & (~i35);
                            int i37 = -(-(i35 << 1));
                            i3 = ((i36 | i37) << 1) - (i36 ^ i37);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                c0055l.c.co(i, 5);
                                i4 = 1;
                            } else {
                                c0055l.c.co(i, 2);
                                i4 = 0;
                            }
                            i5 = i4;
                            while (i4 < list.size()) {
                                i8 = a + 85;
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    iIntValue = list.get(i4).intValue();
                                    int i38 = 37 / 0;
                                } else {
                                    iIntValue = list.get(i4).intValue();
                                }
                                int i39 = -(-AbstractC0064u.bG(iIntValue));
                                i5 = ((i5 | i39) << 1) - (i5 ^ i39);
                                i4++;
                                int i40 = a;
                                int i41 = i40 | 119;
                                int i42 = i41 << 1;
                                int i43 = -((~(i40 & 119)) & i41);
                                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                                b = i44 % 128;
                                int i45 = i44 % 2;
                            }
                            c0055l.c.cp(i5);
                            int i46 = a;
                            int i47 = i46 & 23;
                            int i48 = -(-(i46 | 23));
                            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                            b = i49 % 128;
                            int i50 = i49 % 2;
                            i6 = 0;
                            while (i6 < list.size()) {
                                int i51 = b;
                                i7 = (((i51 & (-92)) | ((~i51) & 91)) - (~(-(-((i51 & 91) << 1))))) - 1;
                                a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    AbstractC0064u abstractC0064u2 = c0055l.c;
                                    list.get(i6);
                                    throw null;
                                }
                                c0055l.c.ck(list.get(i6).intValue());
                                int i52 = i6 & 10;
                                int i53 = ((((i6 ^ 10) | i52) << 1) - (~(-((i6 | 10) & (~i52))))) - 1;
                                int i54 = i53 & (-9);
                                i6 = (i54 - (~(-(-((i53 ^ (-9)) | i54))))) - 1;
                                int i55 = a;
                                int i56 = (i55 & (-12)) | ((~i55) & 11);
                                int i57 = -(-((i55 & 11) << 1));
                                int i58 = (i56 & i57) + (i57 | i56);
                                b = i58 % 128;
                                int i59 = i58 % 2;
                            }
                        }
                    } else {
                        c0055l = (C0055l) interfaceC0051g;
                        Objects.requireNonNull(c0055l);
                        if (!z) {
                            i15 = 0;
                            while (i15 < list.size()) {
                                int i210 = b + 95;
                                a = i210 % 128;
                                int i211 = i210 % 2;
                                AbstractC0064u abstractC0064u3 = c0055l.c;
                                Integer num2 = list.get(i15);
                                int i212 = a;
                                int i213 = i212 & 41;
                                int i214 = -(-((i212 ^ 41) | i213));
                                int i215 = (i213 & i214) + (i214 | i213);
                                b = i215 % 128;
                                int i216 = i215 % 2;
                                abstractC0064u3.ci(i, num2.intValue());
                                int i217 = i15 & 1;
                                int i218 = -(-((i15 ^ 1) | i217));
                                i15 = (i217 & i218) + (i217 | i218);
                                int i219 = a;
                                int i310 = i219 & 125;
                                int i311 = (i219 ^ 125) | i310;
                                int i312 = (i310 & i311) + (i311 | i310);
                                b = i312 % 128;
                                int i313 = i312 % 2;
                            }
                        } else {
                            int i314 = b;
                            int i315 = i314 & 105;
                            int i316 = (i314 | 105) & (~i315);
                            int i317 = -(-(i315 << 1));
                            i3 = ((i316 | i317) << 1) - (i316 ^ i317);
                            a = i3 % 128;
                            if (i3 % 2 == 0) {
                                c0055l.c.co(i, 5);
                                i4 = 1;
                            } else {
                                c0055l.c.co(i, 2);
                                i4 = 0;
                            }
                            i5 = i4;
                            while (i4 < list.size()) {
                                i8 = a + 85;
                                b = i8 % 128;
                                if (i8 % 2 != 0) {
                                    iIntValue = list.get(i4).intValue();
                                    int i318 = 37 / 0;
                                } else {
                                    iIntValue = list.get(i4).intValue();
                                }
                                int i319 = -(-AbstractC0064u.bG(iIntValue));
                                i5 = ((i5 | i319) << 1) - (i5 ^ i319);
                                i4++;
                                int i410 = a;
                                int i411 = i410 | 119;
                                int i412 = i411 << 1;
                                int i413 = -((~(i410 & 119)) & i411);
                                int i414 = ((i412 | i413) << 1) - (i413 ^ i412);
                                b = i414 % 128;
                                int i415 = i414 % 2;
                            }
                            c0055l.c.cp(i5);
                            int i416 = a;
                            int i417 = i416 & 23;
                            int i418 = -(-(i416 | 23));
                            int i419 = ((i417 | i418) << 1) - (i418 ^ i417);
                            b = i419 % 128;
                            int i510 = i419 % 2;
                            i6 = 0;
                            while (i6 < list.size()) {
                                int i511 = b;
                                i7 = (((i511 & (-92)) | ((~i511) & 91)) - (~(-(-((i511 & 91) << 1))))) - 1;
                                a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    AbstractC0064u abstractC0064u4 = c0055l.c;
                                    list.get(i6);
                                    throw null;
                                }
                                c0055l.c.ck(list.get(i6).intValue());
                                int i512 = i6 & 10;
                                int i513 = ((((i6 ^ 10) | i512) << 1) - (~(-((i6 | 10) & (~i512))))) - 1;
                                int i514 = i513 & (-9);
                                i6 = (i514 - (~(-(-((i513 ^ (-9)) | i514))))) - 1;
                                int i515 = a;
                                int i516 = (i515 & (-12)) | ((~i515) & 11);
                                int i517 = -(-((i515 & 11) << 1));
                                int i518 = (i516 & i517) + (i517 | i516);
                                b = i518 % 128;
                                int i519 = i518 % 2;
                            }
                        }
                    }
                }
            } else if (!list.isEmpty()) {
                int i110 = b;
                i2 = (((i110 | 124) << 1) - (i110 ^ 124)) - 1;
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    c0055l = (C0055l) interfaceC0051g;
                    Objects.requireNonNull(c0055l);
                    if (!z) {
                        while (i15 < list.size()) {
                            int i2110 = b + 95;
                            a = i2110 % 128;
                            int i2111 = i2110 % 2;
                            AbstractC0064u abstractC0064u5 = c0055l.c;
                            Integer num3 = list.get(i15);
                            int i2112 = a;
                            int i2113 = i2112 & 41;
                            int i2114 = -(-((i2112 ^ 41) | i2113));
                            int i2115 = (i2113 & i2114) + (i2114 | i2113);
                            b = i2115 % 128;
                            int i2116 = i2115 % 2;
                            abstractC0064u5.ci(i, num3.intValue());
                            int i2117 = i15 & 1;
                            int i2118 = -(-((i15 ^ 1) | i2117));
                            i15 = (i2117 & i2118) + (i2117 | i2118);
                            int i2119 = a;
                            int i3110 = i2119 & 125;
                            int i3111 = (i2119 ^ 125) | i3110;
                            int i3112 = (i3110 & i3111) + (i3111 | i3110);
                            b = i3112 % 128;
                            int i3113 = i3112 % 2;
                        }
                    } else {
                        int i3114 = b;
                        int i3115 = i3114 & 105;
                        int i3116 = (i3114 | 105) & (~i3115);
                        int i3117 = -(-(i3115 << 1));
                        i3 = ((i3116 | i3117) << 1) - (i3116 ^ i3117);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            c0055l.c.co(i, 5);
                            i4 = 1;
                        } else {
                            c0055l.c.co(i, 2);
                            i4 = 0;
                        }
                        i5 = i4;
                        while (i4 < list.size()) {
                            i8 = a + 85;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                iIntValue = list.get(i4).intValue();
                                int i3118 = 37 / 0;
                            } else {
                                iIntValue = list.get(i4).intValue();
                            }
                            int i3119 = -(-AbstractC0064u.bG(iIntValue));
                            i5 = ((i5 | i3119) << 1) - (i5 ^ i3119);
                            i4++;
                            int i4110 = a;
                            int i4111 = i4110 | 119;
                            int i4112 = i4111 << 1;
                            int i4113 = -((~(i4110 & 119)) & i4111);
                            int i4114 = ((i4112 | i4113) << 1) - (i4113 ^ i4112);
                            b = i4114 % 128;
                            int i4115 = i4114 % 2;
                        }
                        c0055l.c.cp(i5);
                        int i4116 = a;
                        int i4117 = i4116 & 23;
                        int i4118 = -(-(i4116 | 23));
                        int i4119 = ((i4117 | i4118) << 1) - (i4118 ^ i4117);
                        b = i4119 % 128;
                        int i5110 = i4119 % 2;
                        i6 = 0;
                        while (i6 < list.size()) {
                            int i5111 = b;
                            i7 = (((i5111 & (-92)) | ((~i5111) & 91)) - (~(-(-((i5111 & 91) << 1))))) - 1;
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                AbstractC0064u abstractC0064u6 = c0055l.c;
                                list.get(i6);
                                throw null;
                            }
                            c0055l.c.ck(list.get(i6).intValue());
                            int i5112 = i6 & 10;
                            int i5113 = ((((i6 ^ 10) | i5112) << 1) - (~(-((i6 | 10) & (~i5112))))) - 1;
                            int i5114 = i5113 & (-9);
                            i6 = (i5114 - (~(-(-((i5113 ^ (-9)) | i5114))))) - 1;
                            int i5115 = a;
                            int i5116 = (i5115 & (-12)) | ((~i5115) & 11);
                            int i5117 = -(-((i5115 & 11) << 1));
                            int i5118 = (i5116 & i5117) + (i5117 | i5116);
                            b = i5118 % 128;
                            int i5119 = i5118 % 2;
                        }
                    }
                } else {
                    c0055l = (C0055l) interfaceC0051g;
                    Objects.requireNonNull(c0055l);
                    if (!z) {
                        i15 = 0;
                        while (i15 < list.size()) {
                            int i21110 = b + 95;
                            a = i21110 % 128;
                            int i21111 = i21110 % 2;
                            AbstractC0064u abstractC0064u7 = c0055l.c;
                            Integer num4 = list.get(i15);
                            int i21112 = a;
                            int i21113 = i21112 & 41;
                            int i21114 = -(-((i21112 ^ 41) | i21113));
                            int i21115 = (i21113 & i21114) + (i21114 | i21113);
                            b = i21115 % 128;
                            int i21116 = i21115 % 2;
                            abstractC0064u7.ci(i, num4.intValue());
                            int i21117 = i15 & 1;
                            int i21118 = -(-((i15 ^ 1) | i21117));
                            i15 = (i21117 & i21118) + (i21117 | i21118);
                            int i21119 = a;
                            int i31110 = i21119 & 125;
                            int i31111 = (i21119 ^ 125) | i31110;
                            int i31112 = (i31110 & i31111) + (i31111 | i31110);
                            b = i31112 % 128;
                            int i31113 = i31112 % 2;
                        }
                    } else {
                        int i31114 = b;
                        int i31115 = i31114 & 105;
                        int i31116 = (i31114 | 105) & (~i31115);
                        int i31117 = -(-(i31115 << 1));
                        i3 = ((i31116 | i31117) << 1) - (i31116 ^ i31117);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            c0055l.c.co(i, 5);
                            i4 = 1;
                        } else {
                            c0055l.c.co(i, 2);
                            i4 = 0;
                        }
                        i5 = i4;
                        while (i4 < list.size()) {
                            i8 = a + 85;
                            b = i8 % 128;
                            if (i8 % 2 != 0) {
                                iIntValue = list.get(i4).intValue();
                                int i31118 = 37 / 0;
                            } else {
                                iIntValue = list.get(i4).intValue();
                            }
                            int i31119 = -(-AbstractC0064u.bG(iIntValue));
                            i5 = ((i5 | i31119) << 1) - (i5 ^ i31119);
                            i4++;
                            int i41110 = a;
                            int i41111 = i41110 | 119;
                            int i41112 = i41111 << 1;
                            int i41113 = -((~(i41110 & 119)) & i41111);
                            int i41114 = ((i41112 | i41113) << 1) - (i41113 ^ i41112);
                            b = i41114 % 128;
                            int i41115 = i41114 % 2;
                        }
                        c0055l.c.cp(i5);
                        int i41116 = a;
                        int i41117 = i41116 & 23;
                        int i41118 = -(-(i41116 | 23));
                        int i41119 = ((i41117 | i41118) << 1) - (i41118 ^ i41117);
                        b = i41119 % 128;
                        int i51110 = i41119 % 2;
                        i6 = 0;
                        while (i6 < list.size()) {
                            int i51111 = b;
                            i7 = (((i51111 & (-92)) | ((~i51111) & 91)) - (~(-(-((i51111 & 91) << 1))))) - 1;
                            a = i7 % 128;
                            if (i7 % 2 != 0) {
                                AbstractC0064u abstractC0064u8 = c0055l.c;
                                list.get(i6);
                                throw null;
                            }
                            c0055l.c.ck(list.get(i6).intValue());
                            int i51112 = i6 & 10;
                            int i51113 = ((((i6 ^ 10) | i51112) << 1) - (~(-((i6 | 10) & (~i51112))))) - 1;
                            int i51114 = i51113 & (-9);
                            i6 = (i51114 - (~(-(-((i51113 ^ (-9)) | i51114))))) - 1;
                            int i51115 = a;
                            int i51116 = (i51115 & (-12)) | ((~i51115) & 11);
                            int i51117 = -(-((i51115 & 11) << 1));
                            int i51118 = (i51116 & i51117) + (i51117 | i51116);
                            b = i51118 % 128;
                            int i51119 = i51118 % 2;
                        }
                    }
                }
            }
        }
        int i60 = a + 91;
        b = i60 % 128;
        if (i60 % 2 != 0) {
            int i61 = 19 / 0;
        }
    }

    public static int b(int i, List<aa> list, ah ahVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 33) << 1) - (i3 ^ 33);
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        int i6 = 0;
        Object obj = null;
        if (size == 0) {
            int i7 = a + 23;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 ^ 53;
            int i11 = ((i8 & 53) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        int i14 = a;
        int i15 = (-2) - (((i14 & 70) + (i14 | 70)) ^ (-1));
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i6 < size) {
            int i18 = b;
            int i19 = i18 & 33;
            int i20 = (((i18 ^ 33) | i19) << 1) - ((i18 | 33) & (~i19));
            a = i20 % 128;
            if (i20 % 2 == 0) {
                AbstractC0064u.bY(i, list.get(i6), ahVar);
                obj.hashCode();
                throw null;
            }
            int iBY = AbstractC0064u.bY(i, list.get(i6), ahVar);
            int i21 = b;
            int i22 = ((i21 ^ 97) | (i21 & 97)) << 1;
            int i23 = -(((~i21) & 97) | (i21 & (-98)));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            a = i24 % 128;
            if (i24 % 2 == 0) {
                i17 /= iBY;
                i6 = ((i6 ^ 29) + ((i6 & 29) << 1)) - 1;
            } else {
                int i25 = -(-iBY);
                int i26 = i17 & i25;
                int i27 = -(-((i17 ^ i25) | i26));
                i6 = (i6 & 1) + (i6 | 1);
                i17 = ((i26 | i27) << 1) - (i27 ^ i26);
            }
        }
        int i28 = a;
        int i29 = i28 & 41;
        int i30 = (((i28 ^ 41) | i29) << 1) - ((i28 | 41) & (~i29));
        b = i30 % 128;
        int i31 = i30 % 2;
        return i17;
    }

    public static int e(int i, List<Integer> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = b + 51;
        a = i3 % 128;
        int i4 = i3 % 2;
        int size = list.size();
        if (size == 0) {
            int i5 = b + 17;
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = i6 & 7;
            int i9 = (i8 - (~(-(-((i6 ^ 7) | i8))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return 0;
        }
        int iF = f(list);
        if (!z) {
            int iBT = AbstractC0064u.bT(i) * size;
            int i11 = ((iBT ^ iF) - (~((iBT & iF) << 1))) - 1;
            int i12 = b + 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return i11;
            }
            throw null;
        }
        int i13 = a;
        int i14 = (i13 & 59) + (i13 | 59);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return AbstractC0064u.bK(iF) << AbstractC0064u.bT(i);
        }
        int iBT2 = AbstractC0064u.bT(i);
        int iBK = AbstractC0064u.bK(iF);
        int i15 = -(~iBT2);
        return (((iBK | i15) << 1) - (i15 ^ iBK)) - 1;
    }

    public static int r(int i, List<Long> list, boolean z) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 37;
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        if (size == 0) {
            int i6 = a;
            int i7 = i6 & 49;
            int i8 = (~i7) & (i6 | 49);
            int i9 = i7 << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2 == 0 ? 0 : 1;
            int i12 = i6 & 69;
            int i13 = (i6 ^ 69) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 89 / 0;
            }
            return i11;
        }
        int iT = t(list);
        if (!z) {
            int iBT = ((AbstractC0064u.bT(i) * size) - (~(-(-iT)))) - 1;
            int i16 = a;
            int i17 = i16 ^ 23;
            int i18 = -(-((i16 & 23) << 1));
            int i19 = (i17 & i18) + (i18 | i17);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return iBT;
            }
            throw null;
        }
        int i20 = b;
        int i21 = i20 & 115;
        int i22 = (i20 | 115) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 & i23) + (i22 | i23);
        a = i24 % 128;
        if (i24 % 2 == 0) {
            int iBT2 = AbstractC0064u.bT(i);
            int iBK = AbstractC0064u.bK(iT);
            int i25 = -(~(-iBT2));
            i2 = ((iBK & i25) + (i25 | iBK)) - 1;
        } else {
            int iBT3 = AbstractC0064u.bT(i);
            int iBK2 = AbstractC0064u.bK(iT);
            int i26 = iBK2 & iBT3;
            i2 = i26 + ((iBT3 ^ iBK2) | i26);
        }
        int i27 = b;
        int i28 = i27 & 71;
        int i29 = (i27 | 71) & (~i28);
        int i30 = i28 << 1;
        int i31 = (i29 & i30) + (i29 | i30);
        a = i31 % 128;
        if (i31 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    public static o00O00<?, ?> z(boolean z) {
        Class<?> cls;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = -(-((i2 ^ 123) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        Object obj = null;
        try {
            if (i5 % 2 == 0) {
                cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
                int i6 = 18 / 0;
            } else {
                cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            }
            int i7 = b;
            int i8 = (i7 & (-86)) | ((~i7) & 85);
            int i9 = (i7 & 85) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            int i12 = b;
            int i13 = i12 & 121;
            int i14 = (i12 ^ 121) | i13;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            int i16 = i15 % 128;
            a = i16;
            int i17 = i15 % 2;
            int i18 = (((i16 ^ 1) | (i16 & 1)) << 1) - (((~i16) & 1) | (i16 & (-2)));
            b = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        try {
            Class<?>[] clsArr = {Boolean.TYPE};
            int i20 = b;
            int i21 = (((i20 | 100) << 1) - (i20 ^ 100)) - 1;
            a = i21 % 128;
            int i22 = i21 % 2;
            Constructor<?> constructor = cls.getConstructor(clsArr);
            Object[] objArr = new Object[1];
            int i23 = a;
            int i24 = i23 & 89;
            int i25 = (i24 - (~((i23 ^ 89) | i24))) - 1;
            b = i25 % 128;
            int i26 = i25 % 2;
            objArr[0] = Boolean.valueOf(z);
            G g = (G) constructor.newInstance(objArr);
            int i27 = (-2) - ((b + 66) ^ (-1));
            int i28 = i27 % 128;
            a = i28;
            if (i27 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i29 = (i28 ^ 101) + ((i28 & 101) << 1);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                return g;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int n(int i, Object obj, ah ahVar) {
        int iBT;
        int iBK;
        int i2 = 2 % 2;
        int i3 = a + 23;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if (obj instanceof V) {
            int i6 = ((i4 ^ 51) | (i4 & 51)) << 1;
            int i7 = -((i4 & (-52)) | ((~i4) & 51));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                AbstractC0064u.bT(i);
                AbstractC0064u.bI((V) obj);
                obj2.hashCode();
                throw null;
            }
            iBT = AbstractC0064u.bT(i);
            iBK = AbstractC0064u.bI((V) obj);
            int i9 = b;
            int i10 = (((i9 | 85) << 1) - (~(-(i9 ^ 85)))) - 1;
            a = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 & 77;
            int i13 = (i9 ^ 77) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        } else {
            iBT = AbstractC0064u.bT(i);
            AbstractC0053j abstractC0053j = (AbstractC0053j) ((aa) obj);
            int i16 = b;
            int i17 = i16 & 63;
            int i18 = (i16 | 63) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                AbstractC0064u.bK(abstractC0053j.k(ahVar));
                obj2.hashCode();
                throw null;
            }
            iBK = AbstractC0064u.bK(abstractC0053j.k(ahVar));
            int i21 = b + 101;
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        int i23 = (iBK - (~(-(~(-(-iBT)))))) - 2;
        int i24 = a;
        int i25 = i24 | 61;
        int i26 = i25 << 1;
        int i27 = -((~(i24 & 61)) & i25);
        int i28 = (i26 & i27) + (i27 | i26);
        b = i28 % 128;
        if (i28 % 2 == 0) {
            return i23;
        }
        obj2.hashCode();
        throw null;
    }

    public static int s(List<Integer> list) {
        int size;
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0 ? (size = list.size()) == 0 : (size = list.size()) == 0) {
            int i4 = b;
            int i5 = (i4 & 77) + (i4 | 77);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 95;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (list instanceof L) {
            int i9 = b;
            int i10 = i9 & 109;
            int i11 = i9 | 109;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            L l = (L) list;
            int i14 = i9 & 19;
            int i15 = i9 | 19;
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < size) {
                int i19 = b + 29;
                a = i19 % 128;
                int i20 = i19 % 2;
                int iBN = AbstractC0064u.bN(l.h(i18));
                int i21 = i3 ^ iBN;
                int i22 = ((i3 & iBN) | i21) << 1;
                int i23 = -i21;
                i3 = ((i22 | i23) << 1) - (i22 ^ i23);
                int i24 = ((i18 | 100) << 1) - (i18 ^ 100);
                i18 = ((i24 | (-99)) << 1) - (i24 ^ (-99));
                int i25 = a;
                int i26 = i25 & 17;
                int i27 = ((i25 | 17) & (~i26)) + (i26 << 1);
                b = i27 % 128;
                int i28 = i27 % 2;
            }
        } else {
            int i29 = a;
            int i30 = ((i29 ^ 30) + ((i29 & 30) << 1)) - 1;
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 0;
            while (i32 < size) {
                int i33 = a;
                int i34 = i33 ^ 15;
                int i35 = (i33 & 15) << 1;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                b = i36 % 128;
                int i37 = i36 % 2;
                int iBN2 = AbstractC0064u.bN(list.get(i32).intValue());
                int i38 = a;
                int i39 = ((i38 ^ 54) + ((i38 & 54) << 1)) - 1;
                b = i39 % 128;
                if (i39 % 2 != 0) {
                    i3 += iBN2;
                    int i40 = ((i32 ^ 38) | (i32 & 38)) << 1;
                    int i41 = -(((~i32) & 38) | (i32 & (-39)));
                    i32 = (i40 ^ i41) + ((i41 & i40) << 1);
                } else {
                    int i42 = i3 ^ iBN2;
                    int i43 = (i3 & iBN2) << 1;
                    i32 = (((i32 | 79) << 1) - (i32 ^ 79)) - 78;
                    i3 = (i42 & i43) + (i43 | i42);
                }
            }
        }
        int i44 = b;
        int i45 = i44 & 103;
        int i46 = ((i44 ^ 103) | i45) << 1;
        int i47 = -((i44 | 103) & (~i45));
        int i48 = (i46 & i47) + (i47 | i46);
        a = i48 % 128;
        int i49 = i48 % 2;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[LOOP:1: B:26:0x00bb->B:29:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x010f A[SYNTHETIC] */
    public static int u(List<Long> list) {
        int size;
        int i;
        int i2;
        int i3;
        int i4;
        W w;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 47;
        int i9 = (i8 - (~(-(-((i7 ^ 47) | i8))))) - 1;
        b = i9 % 128;
        int iBZ = 0;
        if (i9 % 2 != 0) {
            size = list.size();
            if (size != 0) {
                i = 1;
                if (list instanceof W) {
                    int i10 = a;
                    int i11 = i10 | 81;
                    int i12 = (i11 << 1) - (i11 & (~(i10 & 81)));
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    w = (W) list;
                    int i14 = i10 + 81;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    while (i < size) {
                        int i16 = a;
                        int i17 = (i16 & (-102)) | ((~i16) & 101);
                        int i18 = -(-((i16 & 101) << 1));
                        i5 = (i17 ^ i18) + ((i18 & i17) << 1);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            iBZ /= AbstractC0064u.bZ(w.h(i));
                        } else {
                            int iBZ2 = AbstractC0064u.bZ(w.h(i));
                            iBZ = (iBZ & iBZ2) + (iBZ | iBZ2);
                        }
                        int i19 = (-2) - ((a + 100) ^ (-1));
                        int i20 = i19 % 128;
                        b = i20;
                        int i21 = i19 % 2;
                        i++;
                        int i22 = i20 + 103;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                    }
                } else {
                    int i24 = b;
                    int i25 = i24 & 41;
                    i2 = i25 + ((i24 ^ 41) | i25);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i26 = 3 / 4;
                    }
                    i3 = 0;
                    while (i3 < size) {
                        i4 = b + 103;
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            list.get(i3).longValue();
                            throw null;
                        }
                        long jLongValue = list.get(i3).longValue();
                        int i27 = a;
                        int i28 = (((i27 ^ 13) | (i27 & 13)) << 1) - (((~i27) & 13) | (i27 & (-14)));
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = -(~(-(-AbstractC0064u.bZ(jLongValue))));
                        iBZ = ((iBZ & i30) + (iBZ | i30)) - 1;
                        int i31 = i3 & 123;
                        int i32 = i31 + ((i3 ^ 123) | i31);
                        i3 = ((i32 & (-122)) - (~(i32 | (-122)))) - 1;
                        int i33 = (-2) - ((b + 56) ^ (-1));
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                }
                int i35 = a;
                int i36 = ((i35 | 111) << 1) - (i35 ^ 111);
                b = i36 % 128;
                int i37 = i36 % 2;
                return iBZ;
            }
            int i38 = a;
            int i39 = (i38 ^ 67) + ((i38 & 67) << 1);
            b = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i38 + 64;
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            b = i42 % 128;
            int i43 = i42 % 2;
            return 0;
        }
        size = list.size();
        if (size != 0) {
            i = 0;
            if (list instanceof W) {
                int i110 = a;
                int i111 = i110 | 81;
                int i112 = (i111 << 1) - (i111 & (~(i110 & 81)));
                b = i112 % 128;
                int i113 = i112 % 2;
                w = (W) list;
                int i114 = i110 + 81;
                b = i114 % 128;
                int i115 = i114 % 2;
                while (i < size) {
                    int i116 = a;
                    int i117 = (i116 & (-102)) | ((~i116) & 101);
                    int i118 = -(-((i116 & 101) << 1));
                    i5 = (i117 ^ i118) + ((i118 & i117) << 1);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        iBZ /= AbstractC0064u.bZ(w.h(i));
                    } else {
                        int iBZ3 = AbstractC0064u.bZ(w.h(i));
                        iBZ = (iBZ & iBZ3) + (iBZ | iBZ3);
                    }
                    int i119 = (-2) - ((a + 100) ^ (-1));
                    int i210 = i119 % 128;
                    b = i210;
                    int i211 = i119 % 2;
                    i++;
                    int i212 = i210 + 103;
                    a = i212 % 128;
                    int i213 = i212 % 2;
                }
            } else {
                int i214 = b;
                int i215 = i214 & 41;
                i2 = i215 + ((i214 ^ 41) | i215);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i216 = 3 / 4;
                }
                i3 = 0;
                while (i3 < size) {
                    i4 = b + 103;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        list.get(i3).longValue();
                        throw null;
                    }
                    long jLongValue2 = list.get(i3).longValue();
                    int i217 = a;
                    int i218 = (((i217 ^ 13) | (i217 & 13)) << 1) - (((~i217) & 13) | (i217 & (-14)));
                    b = i218 % 128;
                    int i219 = i218 % 2;
                    int i310 = -(~(-(-AbstractC0064u.bZ(jLongValue2))));
                    iBZ = ((iBZ & i310) + (iBZ | i310)) - 1;
                    int i311 = i3 & 123;
                    int i312 = i311 + ((i3 ^ 123) | i311);
                    i3 = ((i312 & (-122)) - (~(i312 | (-122)))) - 1;
                    int i313 = (-2) - ((b + 56) ^ (-1));
                    a = i313 % 128;
                    int i314 = i313 % 2;
                }
            }
            int i315 = a;
            int i316 = ((i315 | 111) << 1) - (i315 ^ 111);
            b = i316 % 128;
            int i317 = i316 % 2;
            return iBZ;
        }
        int i318 = a;
        int i319 = (i318 ^ 67) + ((i318 & 67) << 1);
        b = i319 % 128;
        int i44 = i319 % 2;
        int i45 = i318 + 64;
        int i46 = (i45 ^ (-1)) + (i45 << 1);
        b = i46 % 128;
        int i47 = i46 % 2;
        return 0;
    }

    public static void R(int i, List<Integer> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2;
        Integer num;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 15;
        int i6 = i5 + ((i4 ^ 15) | i5);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        if (list != null) {
            int i9 = i7 + 7;
            b = i9 % 128;
            int i10 = i9 % 2;
            if (!list.isEmpty()) {
                int i11 = a;
                int i12 = i11 & 31;
                int i13 = ((i11 ^ 31) | i12) << 1;
                int i14 = -((i11 | 31) & (~i12));
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i17 = b;
                int i18 = ((i17 & 88) + (i17 | 88)) - 1;
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                Object obj = null;
                int i21 = 0;
                if (z) {
                    int i22 = (i19 & 117) + (i19 | 117);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    c0055l.c.co(i, 2);
                    int i24 = a;
                    int i25 = (i24 & (-42)) | ((~i24) & 41);
                    int i26 = -(-((i24 & 41) << 1));
                    int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = ((i24 ^ 100) + ((i24 & 100) << 1)) - 1;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = 0;
                    int iBU = 0;
                    while (i31 < list.size()) {
                        int i32 = a;
                        int i33 = (i32 ^ 93) + ((i32 & 93) << 1);
                        b = i33 % 128;
                        if (i33 % 2 != 0) {
                            num = list.get(i31);
                            int i34 = 21 / 0;
                        } else {
                            num = list.get(i31);
                        }
                        int i35 = a;
                        int i36 = i35 & 85;
                        int i37 = -(-(i35 | 85));
                        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                        b = i38 % 128;
                        if (i38 % 2 != 0) {
                            iBU >>>= AbstractC0064u.bU(num.intValue());
                            i31 += 70;
                        } else {
                            int iBU2 = AbstractC0064u.bU(num.intValue());
                            int i39 = iBU & iBU2;
                            int i40 = (iBU ^ iBU2) | i39;
                            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                            int i42 = ((i31 | 41) << 1) - (i31 ^ 41);
                            i31 = ((i42 | (-40)) << 1) - (i42 ^ (-40));
                            iBU = i41;
                        }
                        int i43 = b;
                        int i44 = (i43 & 57) + (i43 | 57);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    }
                    c0055l.c.cp(iBU);
                    int i46 = a;
                    int i47 = (i46 ^ 93) + ((i46 & 93) << 1);
                    b = i47 % 128;
                    if (i47 % 2 != 0) {
                        int i48 = 2 / 2;
                    }
                    while (i21 < list.size()) {
                        int i49 = a;
                        int i50 = ((((i49 ^ 27) | (i49 & 27)) << 1) - (~(-(((~i49) & 27) | (i49 & (-28)))))) - 1;
                        b = i50 % 128;
                        if (i50 % 2 != 0) {
                            AbstractC0064u abstractC0064u = c0055l.c;
                            list.get(i21);
                            throw null;
                        }
                        c0055l.c.cp(list.get(i21).intValue());
                        int i51 = ((i21 & 12) | ((~i21) & (-13))) + ((i21 & (-13)) << 1);
                        int i52 = i51 & 14;
                        int i53 = (i51 ^ 14) | i52;
                        i21 = (i52 ^ i53) + ((i53 & i52) << 1);
                        int i54 = a;
                        int i55 = i54 & 19;
                        int i56 = -(-((i54 ^ 19) | i55));
                        int i57 = (i55 & i56) + (i56 | i55);
                        b = i57 % 128;
                        int i58 = i57 % 2;
                    }
                } else {
                    while (i21 < list.size()) {
                        int i59 = b;
                        int i60 = (i59 & (-46)) | ((~i59) & 45);
                        int i61 = -(-((i59 & 45) << 1));
                        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                        a = i62 % 128;
                        if (i62 % 2 == 0) {
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            list.get(i21);
                            obj.hashCode();
                            throw null;
                        }
                        AbstractC0064u abstractC0064u3 = c0055l.c;
                        Integer num2 = list.get(i21);
                        int i63 = b;
                        int i64 = (i63 & 55) + (i63 | 55);
                        a = i64 % 128;
                        if (i64 % 2 == 0) {
                            abstractC0064u3.cq(i, num2.intValue());
                            int i65 = i21 & 27;
                            int i66 = (i21 ^ 27) | i65;
                            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                            i2 = (((i67 & (-58)) | ((~i67) & 57)) - (~(-(-((i67 & 57) << 1))))) - 1;
                        } else {
                            abstractC0064u3.cq(i, num2.intValue());
                            i2 = ((i21 | 1) << 1) - ((i21 & (-2)) | ((~i21) & 1));
                        }
                        i21 = i2;
                        int i68 = b;
                        int i69 = i68 & 115;
                        int i70 = (i68 | 115) & (~i69);
                        int i71 = i69 << 1;
                        int i72 = (i70 & i71) + (i70 | i71);
                        a = i72 % 128;
                        int i73 = i72 % 2;
                    }
                }
            }
        }
        int i74 = a;
        int i75 = (-2) - (((i74 ^ 50) + ((i74 & 50) << 1)) ^ (-1));
        b = i75 % 128;
        int i76 = i75 % 2;
    }

    public static int c(int i, List<?> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 61;
        int i5 = ((i3 | 61) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int size = list.size();
        if (size == 0) {
            int i7 = b;
            int i8 = i7 + 77;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 ^ 89;
            int i11 = (i7 & 89) << 1;
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            return 0;
        }
        if (!z) {
            int iBz = AbstractC0064u.bz(i, true) * size;
            int i14 = b;
            int i15 = ((i14 ^ 63) | (i14 & 63)) << 1;
            int i16 = -(((~i14) & 63) | (i14 & (-64)));
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 92 / 0;
            }
            return iBz;
        }
        int i19 = b;
        int i20 = i19 & 11;
        int i21 = -(-((i19 ^ 11) | i20));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        int iBT = AbstractC0064u.bT(i);
        int iBK = AbstractC0064u.bK(size);
        int i24 = iBK & iBT;
        int i25 = (((iBK ^ iBT) | i24) << 1) - ((iBT | iBK) & (~i24));
        int i26 = a;
        int i27 = ((i26 ^ 30) + ((i26 & 30) << 1)) - 1;
        b = i27 % 128;
        int i28 = i27 % 2;
        return i25;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r6 = l(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aD.ak.b;
        r1 = (r7 & (-126)) | ((~r7) & 125);
        r7 = (r7 & 125) << 1;
        r2 = (r1 ^ r7) + ((r7 & r1) << 1);
        ivas.gov.bisp.enumeration.aD.ak.a = r2 % 128;
        r2 = r2 % 2;
        r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r5);
        r6 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bK(r6);
        r7 = ((r6 | r5) << 1) - (r5 ^ r6);
        r5 = ivas.gov.bisp.enumeration.aD.ak.b;
        r6 = (((r5 | 102) << 1) - (r5 ^ 102)) - 1;
        ivas.gov.bisp.enumeration.aD.ak.a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if ((r6 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r5) * r2;
        r6 = -(-r6);
        r7 = ((r5 ^ r6) | (r5 & r6)) << 1;
        r5 = -(((~r5) & r6) | ((~r6) & r5));
        r6 = (r7 & r5) + (r5 | r7);
        r5 = ivas.gov.bisp.enumeration.aD.ak.b;
        r7 = r5 & 93;
        r5 = (r5 ^ 93) | r7;
        r1 = (r7 ^ r5) + ((r5 & r7) << 1);
        ivas.gov.bisp.enumeration.aD.ak.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.ak.a;
        r6 = r5 & 103;
        r5 = (r5 | 103) & (~r6);
        r6 = r6 << 1;
        r7 = (r5 ^ r6) + ((r5 & r6) << 1);
        ivas.gov.bisp.enumeration.aD.ak.b = r7 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(int r5, java.util.List<java.lang.Integer> r6, boolean r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.aD.ak.a
            r2 = r1 & (-30)
            int r3 = ~r1
            r4 = 29
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            r3 = 1
            int r1 = r1 << r3
            r4 = r2 | r1
            int r4 = r4 << r3
            r1 = r1 ^ r2
            int r4 = r4 - r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.aD.ak.b = r1
            int r4 = r4 % r0
            r1 = 0
            if (r4 == 0) goto L26
            int r2 = r6.size()
            r4 = 66
            int r4 = r4 / r1
            if (r2 != 0) goto L44
            goto L2c
        L26:
            int r2 = r6.size()
            if (r2 != 0) goto L44
        L2c:
            int r5 = ivas.gov.bisp.enumeration.aD.ak.a
            r6 = r5 & 103(0x67, float:1.44E-43)
            int r7 = ~r6
            r5 = r5 | 103(0x67, float:1.44E-43)
            r5 = r5 & r7
            int r6 = r6 << r3
            r7 = r5 ^ r6
            r5 = r5 & r6
            int r5 = r5 << r3
            int r7 = r7 + r5
            int r5 = r7 % 128
            ivas.gov.bisp.enumeration.aD.ak.b = r5
            int r7 = r7 % r0
            if (r7 == 0) goto L42
            goto L43
        L42:
            r3 = r1
        L43:
            return r3
        L44:
            int r6 = l(r6)
            if (r7 == 0) goto L7f
            int r7 = ivas.gov.bisp.enumeration.aD.ak.b
            r1 = r7 & (-126(0xffffffffffffff82, float:NaN))
            int r2 = ~r7
            r4 = 125(0x7d, float:1.75E-43)
            r2 = r2 & r4
            r1 = r1 | r2
            r7 = r7 & r4
            int r7 = r7 << r3
            r2 = r1 ^ r7
            r7 = r7 & r1
            int r7 = r7 << r3
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.aD.ak.a = r7
            int r2 = r2 % r0
            int r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r5)
            int r6 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bK(r6)
            r7 = r6 | r5
            int r7 = r7 << r3
            r5 = r5 ^ r6
            int r7 = r7 - r5
            int r5 = ivas.gov.bisp.enumeration.aD.ak.b
            r6 = r5 | 102(0x66, float:1.43E-43)
            int r6 = r6 << r3
            r5 = r5 ^ 102(0x66, float:1.43E-43)
            int r6 = r6 - r5
            int r6 = r6 - r3
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.aD.ak.a = r5
            int r6 = r6 % r0
            if (r6 == 0) goto L7d
            return r7
        L7d:
            r5 = 0
            throw r5
        L7f:
            int r5 = ivas.gov.bisp.enumeration.aD.AbstractC0064u.bT(r5)
            int r5 = r5 * r2
            int r6 = -r6
            int r6 = -r6
            r7 = r5 ^ r6
            r1 = r5 & r6
            r7 = r7 | r1
            int r7 = r7 << r3
            int r1 = ~r6
            r1 = r1 & r5
            int r5 = ~r5
            r5 = r5 & r6
            r5 = r5 | r1
            int r5 = -r5
            r6 = r7 & r5
            r5 = r5 | r7
            int r6 = r6 + r5
            int r5 = ivas.gov.bisp.enumeration.aD.ak.b
            r7 = r5 & 93
            r5 = r5 ^ 93
            r5 = r5 | r7
            r1 = r7 ^ r5
            r5 = r5 & r7
            int r5 = r5 << r3
            int r1 = r1 + r5
            int r5 = r1 % 128
            ivas.gov.bisp.enumeration.aD.ak.a = r5
            int r1 = r1 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.ak.k(int, java.util.List, boolean):int");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:29:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0131  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0059 A[SYNTHETIC] */
    public static int l(List<Integer> list) {
        int size;
        int i;
        L l;
        int i2;
        int i3;
        int iBG;
        int i4;
        int i5;
        int i6;
        int iBG2;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 111;
        int i11 = (((i9 | 111) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
        a = i11 % 128;
        int i12 = 0;
        if (i11 % 2 == 0) {
            size = list.size();
            if (size != 0) {
                i = 1;
                if (!(list instanceof L)) {
                    int i13 = a;
                    int i14 = i13 & 33;
                    int i15 = ((i13 ^ 33) | i14) << 1;
                    int i16 = -((i13 | 33) & (~i14));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    i2 = 0;
                    i5 = 0;
                    while (i5 < size) {
                        i6 = b + 1;
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            iBG2 = AbstractC0064u.bG(list.get(i5).intValue());
                            int i19 = 68 / 0;
                        } else {
                            iBG2 = AbstractC0064u.bG(list.get(i5).intValue());
                        }
                        int i20 = -(-iBG2);
                        int i21 = ((~i20) & i2) | ((~i2) & i20);
                        int i22 = -(-((i2 & i20) << 1));
                        i2 = ((i22 & i21) << 1) + (i21 ^ i22);
                        int i23 = (i5 & (-2)) | ((~i5) & 1);
                        int i24 = -(-((i5 & 1) << 1));
                        i5 = ((i23 | i24) << 1) - (i24 ^ i23);
                        int i25 = a;
                        int i26 = (i25 & (-36)) | ((~i25) & 35);
                        int i27 = (i25 & 35) << 1;
                        i7 = (i26 ^ i27) + ((i27 & i26) << 1);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i28 = 2 % 3;
                        }
                    }
                } else {
                    int i29 = a;
                    int i30 = ((((i29 ^ 63) | (i29 & 63)) << 1) - (~(-(((~i29) & 63) | (i29 & (-64)))))) - 1;
                    int i31 = i30 % 128;
                    b = i31;
                    int i32 = i30 % 2;
                    l = (L) list;
                    int i33 = i31 & 121;
                    int i34 = i33 + ((i31 ^ 121) | i33);
                    a = i34 % 128;
                    int i35 = i34 % 2;
                    while (i < size) {
                        int i36 = a;
                        int i37 = ((i36 ^ 76) + ((i36 & 76) << 1)) - 1;
                        b = i37 % 128;
                        i3 = i37 % 2;
                        iBG = AbstractC0064u.bG(l.h(i));
                        if (i3 != 0) {
                            i12 >>= iBG;
                        } else {
                            i12 = (i12 - (~(-(-iBG)))) - 1;
                        }
                        int i38 = b;
                        int i39 = ((i38 & (-36)) | ((~i38) & 35)) + ((i38 & 35) << 1);
                        int i40 = i39 % 128;
                        a = i40;
                        int i41 = i39 % 2;
                        i++;
                        int i42 = i40 & 101;
                        int i43 = ((i40 | 101) & (~i42)) + (i42 << 1);
                        b = i43 % 128;
                        int i44 = i43 % 2;
                    }
                    i2 = i12;
                }
                i4 = a + 83;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    return i2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i45 = a;
            int i46 = ((i45 & 124) + (i45 | 124)) - 1;
            b = i46 % 128;
            int i47 = i46 % 2;
            return 0;
        }
        size = list.size();
        if (size != 0) {
            i = 0;
            if (!(list instanceof L)) {
                int i110 = a;
                int i111 = i110 & 33;
                int i112 = ((i110 ^ 33) | i111) << 1;
                int i113 = -((i110 | 33) & (~i111));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                b = i114 % 128;
                int i115 = i114 % 2;
                i2 = 0;
                i5 = 0;
                while (i5 < size) {
                    i6 = b + 1;
                    a = i6 % 128;
                    if (i6 % 2 == 0) {
                        iBG2 = AbstractC0064u.bG(list.get(i5).intValue());
                        int i116 = 68 / 0;
                    } else {
                        iBG2 = AbstractC0064u.bG(list.get(i5).intValue());
                    }
                    int i210 = -(-iBG2);
                    int i211 = ((~i210) & i2) | ((~i2) & i210);
                    int i212 = -(-((i2 & i210) << 1));
                    i2 = ((i212 & i211) << 1) + (i211 ^ i212);
                    int i213 = (i5 & (-2)) | ((~i5) & 1);
                    int i214 = -(-((i5 & 1) << 1));
                    i5 = ((i213 | i214) << 1) - (i214 ^ i213);
                    int i215 = a;
                    int i216 = (i215 & (-36)) | ((~i215) & 35);
                    int i217 = (i215 & 35) << 1;
                    i7 = (i216 ^ i217) + ((i217 & i216) << 1);
                    b = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i218 = 2 % 3;
                    }
                }
            } else {
                int i219 = a;
                int i310 = ((((i219 ^ 63) | (i219 & 63)) << 1) - (~(-(((~i219) & 63) | (i219 & (-64)))))) - 1;
                int i311 = i310 % 128;
                b = i311;
                int i312 = i310 % 2;
                l = (L) list;
                int i313 = i311 & 121;
                int i314 = i313 + ((i311 ^ 121) | i313);
                a = i314 % 128;
                int i315 = i314 % 2;
                while (i < size) {
                    int i316 = a;
                    int i317 = ((i316 ^ 76) + ((i316 & 76) << 1)) - 1;
                    b = i317 % 128;
                    i3 = i317 % 2;
                    iBG = AbstractC0064u.bG(l.h(i));
                    if (i3 != 0) {
                        i12 >>= iBG;
                    } else {
                        i12 = (i12 - (~(-(-iBG)))) - 1;
                    }
                    int i318 = b;
                    int i319 = ((i318 & (-36)) | ((~i318) & 35)) + ((i318 & 35) << 1);
                    int i48 = i319 % 128;
                    a = i48;
                    int i49 = i319 % 2;
                    i++;
                    int i410 = i48 & 101;
                    int i411 = ((i48 | 101) & (~i410)) + (i410 << 1);
                    b = i411 % 128;
                    int i412 = i411 % 2;
                }
                i2 = i12;
            }
            i4 = a + 83;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return i2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i413 = a;
        int i414 = ((i413 & 124) + (i413 | 124)) - 1;
        b = i414 % 128;
        int i415 = i414 % 2;
        return 0;
    }

    public static int t(List<Long> list) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 23;
        int i4 = i3 + ((i2 ^ 23) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        Object obj = null;
        int iBP = 0;
        if (size == 0) {
            int i6 = a;
            int i7 = i6 & 75;
            int i8 = (i6 | 75) & (~i7);
            int i9 = i7 << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            int i13 = (i11 & 9) + (i11 | 9);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        if (list instanceof W) {
            int i14 = a;
            int i15 = i14 & 75;
            int i16 = -(-(i14 | 75));
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = i17 % 128;
            b = i18;
            int i19 = i17 % 2;
            W w = (W) list;
            int i20 = i18 & 65;
            int i21 = i20 + ((i18 ^ 65) | i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (i23 < size) {
                int i24 = a + 87;
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    iBP >>>= AbstractC0064u.bP(w.h(i23));
                    int i25 = i23 & 91;
                    i23 = (((i23 ^ 91) | i25) << 1) - ((i23 | 91) & (~i25));
                } else {
                    int iBP2 = AbstractC0064u.bP(w.h(i23));
                    int i26 = (iBP ^ iBP2) + ((iBP & iBP2) << 1);
                    int i27 = (-2) - ((i23 + 32) ^ (-1));
                    int i28 = ((i27 ^ (-30)) | (i27 & (-30))) << 1;
                    int i29 = -(((~i27) & (-30)) | (i27 & 29));
                    i23 = (i28 ^ i29) + ((i29 & i28) << 1);
                    iBP = i26;
                }
                int i30 = a + 79;
                b = i30 % 128;
                int i31 = i30 % 2;
            }
        } else {
            int i32 = b;
            int i33 = ((i32 ^ 23) | (i32 & 23)) << 1;
            int i34 = -(((~i32) & 23) | (i32 & (-24)));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            a = i35 % 128;
            int i36 = i35 % 2;
            int i37 = 0;
            while (i37 < size) {
                int i38 = b;
                int i39 = i38 & 11;
                int i40 = i39 + ((i38 ^ 11) | i39);
                a = i40 % 128;
                if (i40 % 2 == 0) {
                    list.get(i37).longValue();
                    throw null;
                }
                int iBP3 = AbstractC0064u.bP(list.get(i37).longValue());
                iBP = ((iBP | iBP3) << 1) - (iBP ^ iBP3);
                int i41 = ((i37 | (-48)) << 1) - (i37 ^ (-48));
                int i42 = (i41 ^ (-1)) + (i41 << 1);
                int i43 = (i42 & 51) + (i42 | 51);
                i37 = (i43 ^ (-1)) + (i43 << 1);
                int i44 = a;
                int i45 = (i44 & (-78)) | ((~i44) & 77);
                int i46 = (i44 & 77) << 1;
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                b = i47 % 128;
                int i48 = i47 % 2;
            }
        }
        int i49 = b;
        int i50 = i49 ^ 99;
        int i51 = ((((i49 & 99) | i50) << 1) - (~(-i50))) - 1;
        a = i51 % 128;
        if (i51 % 2 != 0) {
            return iBP;
        }
        obj.hashCode();
        throw null;
    }

    public static int y(int i, List<Long> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 95;
        int i5 = -(-(i3 | 95));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int size = list.size();
        if (size == 0) {
            int i8 = b;
            int i9 = ((i8 ^ 69) | (i8 & 69)) << 1;
            int i10 = -((i8 & (-70)) | ((~i8) & 69));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i8 ^ 29;
            int i14 = (i8 & 29) << 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            return 0;
        }
        int iU = u(list);
        if (!z) {
            int iBT = AbstractC0064u.bT(i) * size;
            int i17 = -(-iU);
            int i18 = iBT ^ i17;
            int i19 = -(-((iBT & i17) << 1));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = b;
            int i22 = ((i21 | 7) << 1) - (i21 ^ 7);
            a = i22 % 128;
            int i23 = i22 % 2;
            return i20;
        }
        int i24 = a;
        int i25 = i24 ^ 123;
        int i26 = -(-((i24 & 123) << 1));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        b = i27 % 128;
        int i28 = i27 % 2;
        int iBT2 = AbstractC0064u.bT(i);
        int iBK = AbstractC0064u.bK(iU);
        int i29 = -(-iBT2);
        int i30 = (((~i29) & iBK) | ((~iBK) & i29)) + ((i29 & iBK) << 1);
        int i31 = b;
        int i32 = ((i31 ^ 81) | (i31 & 81)) << 1;
        int i33 = -(((~i31) & 81) | (i31 & (-82)));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        a = i34 % 128;
        int i35 = i34 % 2;
        return i30;
    }

    public static void H(int i, List<Long> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = ((i4 | 69) << 1) - (i4 ^ 69);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (list != null) {
            int i6 = ((i4 & 109) - (~(-(-(i4 | 109))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            if (!list.isEmpty()) {
                int i8 = a;
                int i9 = (i8 & 63) + (i8 | 63);
                b = i9 % 128;
                int i10 = i9 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                if (!(!z)) {
                    int i11 = a;
                    int i12 = ((i11 | 125) << 1) - (((~i11) & 125) | (i11 & (-126)));
                    b = i12 % 128;
                    if (i12 % 2 != 0) {
                        c0055l.c.co(i, 5);
                        i2 = 1;
                    } else {
                        c0055l.c.co(i, 2);
                        i2 = 0;
                    }
                    int i13 = 0;
                    while (i2 < list.size()) {
                        int i14 = b + 111;
                        a = i14 % 128;
                        if (i14 % 2 == 0) {
                            list.get(i2);
                            throw null;
                        }
                        list.get(i2);
                        Logger logger = AbstractC0064u.d;
                        int i15 = i13 & (-54);
                        int i16 = -(-((i13 ^ (-54)) | i15));
                        int i17 = (i15 & i16) + (i16 | i15);
                        i13 = (((i17 & (-63)) | ((~i17) & 62)) - (~(-(-((i17 & 62) << 1))))) - 1;
                        int i18 = i2 & 1;
                        i2 = (i18 - (~(-(-((i2 ^ 1) | i18))))) - 1;
                        int i19 = a;
                        int i20 = (i19 & 69) + (i19 | 69);
                        b = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 5 / 2;
                        }
                    }
                    c0055l.c.cp(i13);
                    int i22 = a;
                    int i23 = (i22 ^ 74) + ((i22 & 74) << 1);
                    int i24 = (i23 ^ (-1)) + (i23 << 1);
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = 0;
                    while (i26 < list.size()) {
                        int i27 = a;
                        int i28 = i27 & 87;
                        int i29 = (i27 | 87) & (~i28);
                        int i30 = i28 << 1;
                        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                        b = i31 % 128;
                        if (i31 % 2 != 0) {
                            AbstractC0064u abstractC0064u = c0055l.c;
                            list.get(i26);
                            throw null;
                        }
                        c0055l.c.cj(list.get(i26).longValue());
                        int i32 = i26 ^ 98;
                        int i33 = (i26 & 98) << 1;
                        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                        i26 = (i34 & (-97)) + (i34 | (-97));
                        int i35 = b;
                        int i36 = i35 & 51;
                        int i37 = (((i35 ^ 51) | i36) << 1) - ((i35 | 51) & (~i36));
                        a = i37 % 128;
                        int i38 = i37 % 2;
                    }
                } else {
                    int i39 = 0;
                    while (i39 < list.size()) {
                        int i40 = a;
                        int i41 = i40 & 107;
                        int i42 = (i40 ^ 107) | i41;
                        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                        b = i43 % 128;
                        if (i43 % 2 != 0) {
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            list.get(i39);
                            obj.hashCode();
                            throw null;
                        }
                        c0055l.c.cg(i, list.get(i39).longValue());
                        i39 = ((i39 ^ 2) + ((i39 & 2) << 1)) - 1;
                        int i44 = a + 7;
                        b = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
            }
        }
        int i46 = a;
        int i47 = ((i46 | 9) << 1) - (i46 ^ 9);
        b = i47 % 128;
        if (i47 % 2 != 0) {
            int i48 = 52 / 0;
        }
    }

    public static void I(int i, List<Double> list, InterfaceC0051g interfaceC0051g, boolean z) {
        AbstractC0064u abstractC0064u;
        Double d2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 79) | (i3 & 79)) << 1;
        int i5 = -((i3 & (-80)) | ((~i3) & 79));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (list != null) {
            int i8 = i3 + 5;
            b = i8 % 128;
            int i9 = i8 % 2;
            if (!list.isEmpty()) {
                int i10 = a;
                int i11 = i10 | 125;
                int i12 = (i11 << 1) - ((~(i10 & 125)) & i11);
                b = i12 % 128;
                int i13 = i12 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i14 = 0;
                if (z) {
                    int i15 = a;
                    int i16 = i15 & 45;
                    int i17 = -(-((i15 ^ 45) | i16));
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    c0055l.c.co(i, 2);
                    int i20 = a + 107;
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        throw null;
                    }
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < list.size()) {
                        int i23 = b + 95;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        list.get(i21);
                        Logger logger = AbstractC0064u.d;
                        int i25 = a;
                        int i26 = i25 ^ 41;
                        int i27 = (((i25 & 41) | i26) << 1) - i26;
                        b = i27 % 128;
                        if (i27 % 2 != 0) {
                            int i28 = i22 & 25;
                            int i29 = ((i22 ^ 25) | i28) << 1;
                            int i30 = -((i22 | 25) & (~i28));
                            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                            int i32 = i21 & 66;
                            int i33 = (i32 - (~(-(-((i21 ^ 66) | i32))))) - 1;
                            i21 = (-2) - ((((i33 | 49) << 1) - (i33 ^ 49)) ^ (-1));
                            i22 = i31;
                        } else {
                            int i34 = ((i22 ^ 59) + ((i22 & 59) << 1)) - 51;
                            int i35 = ((i21 ^ 1) | (i21 & 1)) << 1;
                            int i36 = -(((~i21) & 1) | (i21 & (-2)));
                            int i37 = (i35 & i36) + (i36 | i35);
                            i22 = i34;
                            i21 = i37;
                        }
                        int i38 = (((i25 ^ 91) | (i25 & 91)) << 1) - (((~i25) & 91) | (i25 & (-92)));
                        b = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    c0055l.c.cp(i22);
                    int i40 = b;
                    int i41 = ((i40 & (-16)) | ((~i40) & 15)) + ((i40 & 15) << 1);
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = 0;
                    while (i43 < list.size()) {
                        int i44 = a;
                        int i45 = i44 & 29;
                        int i46 = -(-((i44 ^ 29) | i45));
                        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                        b = i47 % 128;
                        if (i47 % 2 != 0) {
                            abstractC0064u = c0055l.c;
                            d2 = list.get(i43);
                            int i48 = 89 / 0;
                        } else {
                            abstractC0064u = c0055l.c;
                            d2 = list.get(i43);
                        }
                        double dDoubleValue = d2.doubleValue();
                        Objects.requireNonNull(abstractC0064u);
                        int i49 = a;
                        int i50 = i49 & 3;
                        int i51 = ((((i49 ^ 3) | i50) << 1) - (~(-((i49 | 3) & (~i50))))) - 1;
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        abstractC0064u.cj(Double.doubleToRawLongBits(dDoubleValue));
                        int i53 = ((i43 ^ 122) - (~(-(-((i43 & 122) << 1))))) - 1;
                        int i54 = i53 & (-121);
                        int i55 = (i53 | (-121)) & (~i54);
                        int i56 = i54 << 1;
                        i43 = ((i56 & i55) << 1) + (i55 ^ i56);
                        int i57 = a;
                        int i58 = ((i57 | 1) << 1) - (i57 ^ 1);
                        b = i58 % 128;
                        int i59 = i58 % 2;
                    }
                } else {
                    while (i14 < list.size()) {
                        int i60 = a;
                        int i61 = i60 & 55;
                        int i62 = (i61 - (~(-(-((i60 ^ 55) | i61))))) - 1;
                        b = i62 % 128;
                        if (i62 % 2 != 0) {
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            list.get(i14);
                            obj.hashCode();
                            throw null;
                        }
                        AbstractC0064u abstractC0064u3 = c0055l.c;
                        Double d3 = list.get(i14);
                        int i63 = b;
                        int i64 = i63 & 89;
                        int i65 = -(-((i63 ^ 89) | i64));
                        int i66 = (i64 & i65) + (i65 | i64);
                        a = i66 % 128;
                        int i67 = i66 % 2;
                        double dDoubleValue2 = d3.doubleValue();
                        Objects.requireNonNull(abstractC0064u3);
                        int i68 = b;
                        int i69 = ((i68 & 18) + (i68 | 18)) - 1;
                        a = i69 % 128;
                        int i70 = i69 % 2;
                        abstractC0064u3.cg(i, Double.doubleToRawLongBits(dDoubleValue2));
                        i14 = (i14 | 1) + (i14 & 1);
                        int i71 = b;
                        int i72 = i71 ^ 5;
                        int i73 = (i71 & 5) << 1;
                        int i74 = (i72 & i73) + (i73 | i72);
                        a = i74 % 128;
                        int i75 = i74 % 2;
                    }
                }
            }
        }
        int i76 = b;
        int i77 = (i76 & 43) + (i76 | 43);
        a = i77 % 128;
        if (i77 % 2 == 0) {
            throw null;
        }
    }

    public static void J(int i, List<Integer> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 79;
        int i6 = -(-((i4 ^ 79) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        a = i8;
        Object obj = null;
        if (i7 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (list != null) {
            int i9 = (-2) - (((i8 ^ 6) + ((i8 & 6) << 1)) ^ (-1));
            b = i9 % 128;
            if (i9 % 2 != 0) {
                list.isEmpty();
                throw null;
            }
            if (!list.isEmpty()) {
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                if (!z) {
                    int i10 = 0;
                    while (i10 < list.size()) {
                        int i11 = b + 45;
                        a = i11 % 128;
                        int i12 = i11 % 2;
                        AbstractC0064u abstractC0064u = c0055l.c;
                        Integer num = list.get(i10);
                        int i13 = a;
                        int i14 = (((i13 ^ 75) | (i13 & 75)) << 1) - (((~i13) & 75) | (i13 & (-76)));
                        b = i14 % 128;
                        if (i14 % 2 != 0) {
                            abstractC0064u.ci(i, num.intValue());
                            int i15 = 63 / 0;
                        } else {
                            abstractC0064u.ci(i, num.intValue());
                        }
                        i10++;
                        int i16 = a;
                        int i17 = (i16 & (-94)) | ((~i16) & 93);
                        int i18 = -(-((i16 & 93) << 1));
                        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                        b = i19 % 128;
                        int i20 = i19 % 2;
                    }
                } else {
                    int i21 = b;
                    int i22 = i21 & 81;
                    int i23 = (i21 | 81) & (~i22);
                    int i24 = -(-(i22 << 1));
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    a = i25 % 128;
                    if (i25 % 2 == 0) {
                        c0055l.c.co(i, 3);
                        i2 = 1;
                    } else {
                        c0055l.c.co(i, 2);
                        i2 = 0;
                    }
                    int i26 = a + 67;
                    int i27 = i26 % 128;
                    b = i27;
                    int i28 = i26 % 2;
                    int i29 = ((i27 ^ 24) + ((i27 & 24) << 1)) - 1;
                    a = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = 0;
                    while (i2 < list.size()) {
                        int i32 = b;
                        int i33 = ((i32 | 93) << 1) - (i32 ^ 93);
                        a = i33 % 128;
                        if (i33 % 2 == 0) {
                            list.get(i2).intValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i34 = -(~AbstractC0064u.bG(list.get(i2).intValue()));
                        i31 = (((i31 | i34) << 1) - (i31 ^ i34)) - 1;
                        int i35 = i2 & (-38);
                        int i36 = (i35 - (~((i2 ^ (-38)) | i35))) - 1;
                        int i37 = i36 ^ 39;
                        int i38 = ((i36 & 39) | i37) << 1;
                        int i39 = -i37;
                        i2 = ((i39 & i38) << 1) + (i38 ^ i39);
                        int i40 = a;
                        int i41 = i40 & 11;
                        int i42 = (i41 - (~(-(-((i40 ^ 11) | i41))))) - 1;
                        b = i42 % 128;
                        int i43 = i42 % 2;
                    }
                    c0055l.c.cp(i31);
                    int i44 = b;
                    int i45 = i44 & 9;
                    int i46 = (i44 ^ 9) | i45;
                    int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = 0;
                    while (i49 < list.size()) {
                        int i50 = b;
                        int i51 = (i50 ^ 85) + ((i50 & 85) << 1);
                        a = i51 % 128;
                        if (i51 % 2 == 0) {
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            list.get(i49);
                            obj.hashCode();
                            throw null;
                        }
                        c0055l.c.ck(list.get(i49).intValue());
                        int i52 = i49 & (-41);
                        int i53 = ((i49 ^ (-41)) | i52) << 1;
                        int i54 = -((i49 | (-41)) & (~i52));
                        int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                        int i56 = ((i55 ^ 42) | (i55 & 42)) << 1;
                        int i57 = -((i55 & (-43)) | ((~i55) & 42));
                        i49 = (i56 | i57) + (i56 & i57);
                        int i58 = a;
                        int i59 = ((i58 & (-114)) | ((~i58) & 113)) + ((i58 & 113) << 1);
                        b = i59 % 128;
                        int i60 = i59 % 2;
                    }
                }
            }
        }
        int i61 = b;
        int i62 = i61 ^ 71;
        int i63 = ((i61 & 71) | i62) << 1;
        int i64 = -i62;
        int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
        a = i65 % 128;
        if (i65 % 2 == 0) {
            int i66 = 2 / 0;
        }
    }

    public static void K(int i, List<Integer> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 39;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (list != null) {
            int i6 = (((i3 | 90) << 1) - (i3 ^ 90)) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                list.isEmpty();
                throw null;
            }
            if (!list.isEmpty()) {
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i7 = a;
                int i8 = i7 ^ 73;
                int i9 = -(-((i7 & 73) << 1));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    c0055l.c.co(i, 2);
                    int i11 = b;
                    int i12 = i11 & 79;
                    int i13 = (i11 | 79) & (~i12);
                    int i14 = -(-(i12 << 1));
                    int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < list.size()) {
                        int i19 = b;
                        int i20 = i19 ^ 25;
                        int i21 = ((i19 & 25) | i20) << 1;
                        int i22 = -i20;
                        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        list.get(i17);
                        Logger logger = AbstractC0064u.d;
                        int i25 = ((i18 & (-117)) + (i18 | (-117))) - 1;
                        int i26 = i25 & 122;
                        int i27 = -(-((i25 ^ 122) | i26));
                        i18 = (i26 | i27) + (i26 & i27);
                        int i28 = a;
                        int i29 = i28 & 87;
                        int i30 = (((i28 | 87) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
                        int i31 = i30 % 128;
                        b = i31;
                        if (i30 % 2 != 0) {
                            int i32 = i17 & 127;
                            int i33 = i32 + ((i17 ^ 127) | i32);
                            int i34 = i33 & (-46);
                            int i35 = (i33 | (-46)) & (~i34);
                            int i36 = -(-(i34 << 1));
                            i17 = (i35 ^ i36) + ((i36 & i35) << 1);
                        } else {
                            int i37 = ((i17 | 69) << 1) - (i17 ^ 69);
                            i17 = (i37 & (-68)) + (i37 | (-68));
                        }
                        int i38 = (((i31 | 80) << 1) - (i31 ^ 80)) - 1;
                        a = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    c0055l.c.cp(i18);
                    int i40 = a;
                    int i41 = i40 & 99;
                    int i42 = ((((i40 ^ 99) | i41) << 1) - (~(-((i40 | 99) & (~i41))))) - 1;
                    b = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = 0;
                    while (i44 < list.size()) {
                        int i45 = b;
                        int i46 = ((i45 & (-6)) | ((~i45) & 5)) + ((i45 & 5) << 1);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        AbstractC0064u abstractC0064u = c0055l.c;
                        Integer num = list.get(i44);
                        int i48 = a;
                        int i49 = i48 & 41;
                        int i50 = -(-((i48 ^ 41) | i49));
                        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        abstractC0064u.cf(num.intValue());
                        int i53 = i44 & 10;
                        int i54 = i53 + ((i44 ^ 10) | i53);
                        int i55 = i54 & (-9);
                        i44 = (i55 - (~((i54 ^ (-9)) | i55))) - 1;
                        int i56 = b;
                        int i57 = i56 & 23;
                        int i58 = -(-((i56 ^ 23) | i57));
                        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                        a = i59 % 128;
                        int i60 = i59 % 2;
                    }
                } else {
                    int i61 = 0;
                    while (i61 < list.size()) {
                        int i62 = a;
                        int i63 = i62 & 107;
                        int i64 = (i62 ^ 107) | i63;
                        int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                        b = i65 % 128;
                        if (i65 % 2 != 0) {
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            list.get(i61);
                            throw null;
                        }
                        AbstractC0064u abstractC0064u3 = c0055l.c;
                        Integer num2 = list.get(i61);
                        int i66 = a;
                        int i67 = (((i66 & (-94)) | ((~i66) & 93)) - (~(-(-((i66 & 93) << 1))))) - 1;
                        b = i67 % 128;
                        int i68 = i67 % 2;
                        abstractC0064u3.ce(i, num2.intValue());
                        int i69 = i61 ^ 1;
                        int i70 = -(-((i61 & 1) << 1));
                        i61 = ((i70 & i69) << 1) + (i69 ^ i70);
                        int i71 = a + 11;
                        b = i71 % 128;
                        int i72 = i71 % 2;
                    }
                }
            }
        }
        int i73 = b + 47;
        a = i73 % 128;
        if (i73 % 2 == 0) {
            int i74 = 97 / 0;
        }
    }

    public static void P(int i, List<?> list, InterfaceC0051g interfaceC0051g, ah ahVar) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 113;
        int i5 = (i3 | 113) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (list != null && !list.isEmpty()) {
            int i8 = b;
            int i9 = (i8 ^ 106) + ((i8 & 106) << 1);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            C0055l c0055l = (C0055l) interfaceC0051g;
            Objects.requireNonNull(c0055l);
            int i12 = i11 == 0 ? 1 : 0;
            while (i12 < list.size()) {
                int i13 = a;
                int i14 = (i13 & (-72)) | ((~i13) & 71);
                int i15 = (i13 & 71) << 1;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i16 % 128;
                if (i16 % 2 != 0) {
                    list.get(i12);
                    AbstractC0064u abstractC0064u = c0055l.c;
                    throw null;
                }
                c0055l.c.cl(i, (aa) list.get(i12), ahVar);
                int i17 = (i12 ^ 85) + ((i12 & 85) << 1);
                i12 = ((i17 | (-84)) << 1) - (i17 ^ (-84));
                int i18 = b + 61;
                a = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        int i20 = a;
        int i21 = i20 & 13;
        int i22 = (((i20 ^ 13) | i21) << 1) - ((i20 | 13) & (~i21));
        b = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:16:0x008d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0098 A[LOOP:0: B:14:0x0087->B:18:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0102  */
    /* JADX WARN: Code duplicated, block: B:26:0x012a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0180 A[LOOP:2: B:31:0x0180->B:33:0x0186, LOOP_START, PHI: r1
  0x0180: PHI (r1v5 int) = (r1v4 int), (r1v12 int) binds: [B:12:0x005d, B:33:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0186 A[LOOP:2: B:31:0x0180->B:33:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[SYNTHETIC] */
    public static void Q(int i, List<Integer> list, InterfaceC0051g interfaceC0051g, boolean z) {
        C0055l c0055l;
        int i2;
        int i3;
        int i4;
        AbstractC0064u abstractC0064u;
        Integer num;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = (i9 & (-108)) | ((~i9) & 107);
        int i11 = -(-((i9 & 107) << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        Object obj = null;
        if (list != null) {
            int i14 = (((i9 | 22) << 1) - (i9 ^ 22)) - 1;
            a = i14 % 128;
            int i15 = 0;
            if (i14 % 2 == 0) {
                int i16 = 75 / 0;
                if (!list.isEmpty()) {
                    c0055l = (C0055l) interfaceC0051g;
                    Objects.requireNonNull(c0055l);
                    int i17 = a;
                    int i18 = i17 & 33;
                    int i19 = ((i17 ^ 33) | i18) << 1;
                    int i20 = -((i17 | 33) & (~i18));
                    int i21 = (i19 & i20) + (i20 | i19);
                    i2 = i21 % 128;
                    b = i2;
                    int i22 = i21 % 2;
                    if (z) {
                        int i23 = (-2) - (((i2 ^ 84) + ((i2 & 84) << 1)) ^ (-1));
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        c0055l.c.co(i, 2);
                        int i25 = a;
                        int i26 = i25 & 69;
                        int i27 = i25 | 69;
                        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        i3 = 0;
                        i4 = 0;
                        while (i3 < list.size()) {
                            i7 = a + 117;
                            b = i7 % 128;
                            if (i7 % 2 == 0) {
                                list.get(i3);
                                Logger logger = AbstractC0064u.d;
                                obj.hashCode();
                                throw null;
                            }
                            list.get(i3);
                            Logger logger2 = AbstractC0064u.d;
                            int i30 = i4 & 41;
                            int i31 = (i4 | 41) & (~i30);
                            int i32 = i30 << 1;
                            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                            int i34 = i33 & (-37);
                            int i35 = -(-((i33 ^ (-37)) | i34));
                            i4 = ((i34 | i35) << 1) - (i34 ^ i35);
                            int i36 = i3 & 1;
                            int i37 = (i3 ^ 1) | i36;
                            i3 = ((i36 | i37) << 1) - (i37 ^ i36);
                            int i38 = b;
                            int i39 = ((i38 & (-86)) | ((~i38) & 85)) + ((i38 & 85) << 1);
                            a = i39 % 128;
                            int i40 = i39 % 2;
                        }
                        c0055l.c.cp(i4);
                        int i41 = b;
                        int i42 = i41 & 59;
                        int i43 = (i42 - (~((i41 ^ 59) | i42))) - 1;
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        while (i15 < list.size()) {
                            int i45 = b;
                            int i46 = (i45 & 5) + (i45 | 5);
                            a = i46 % 128;
                            int i47 = i46 % 2;
                            abstractC0064u = c0055l.c;
                            num = list.get(i15);
                            int i48 = a;
                            int i49 = i48 ^ 101;
                            int i50 = -(-((i48 & 101) << 1));
                            i5 = (i49 & i50) + (i50 | i49);
                            b = i5 % 128;
                            if (i5 % 2 == 0) {
                                num.intValue();
                                obj.hashCode();
                                throw null;
                            }
                            int iIntValue = num.intValue();
                            int i51 = b;
                            int i52 = i51 & 109;
                            int i53 = -(-((i51 ^ 109) | i52));
                            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                            a = i54 % 128;
                            int i55 = i54 % 2;
                            abstractC0064u.cf(iIntValue);
                            int i56 = i15 & (-23);
                            int i57 = -(-((i15 ^ (-23)) | i56));
                            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                            int i59 = i58 & 24;
                            int i60 = (i58 ^ 24) | i59;
                            i15 = (i59 ^ i60) + ((i59 & i60) << 1);
                            int i61 = b;
                            int i62 = i61 & 3;
                            i6 = (((i61 ^ 3) | i62) << 1) - ((i61 | 3) & (~i62));
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i63 = 4 / 2;
                            }
                        }
                    } else {
                        while (i15 < list.size()) {
                            int i64 = b;
                            int i65 = i64 & 77;
                            int i66 = (((i64 ^ 77) | i65) << 1) - ((i64 | 77) & (~i65));
                            a = i66 % 128;
                            int i67 = i66 % 2;
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            Integer num2 = list.get(i15);
                            int i68 = b;
                            int i69 = (i68 & 109) + (i68 | 109);
                            a = i69 % 128;
                            int i70 = i69 % 2;
                            abstractC0064u2.ce(i, num2.intValue());
                            int i71 = a;
                            int i72 = i71 & 81;
                            int i73 = -(-((i71 ^ 81) | i72));
                            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                            int i75 = i74 % 128;
                            b = i75;
                            int i76 = i74 % 2;
                            int i77 = i15 & (-42);
                            int i78 = (i15 ^ (-42)) | i77;
                            int i79 = (i77 & i78) + (i78 | i77);
                            int i80 = i79 ^ 43;
                            int i81 = ((i79 & 43) | i80) << 1;
                            int i82 = -i80;
                            i15 = ((i81 | i82) << 1) - (i82 ^ i81);
                            int i83 = ((i75 | 13) << 1) - (i75 ^ 13);
                            a = i83 % 128;
                            int i84 = i83 % 2;
                        }
                    }
                }
            } else if (!list.isEmpty()) {
                c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i110 = a;
                int i111 = i110 & 33;
                int i112 = ((i110 ^ 33) | i111) << 1;
                int i210 = -((i110 | 33) & (~i111));
                int i211 = (i112 & i210) + (i210 | i112);
                i2 = i211 % 128;
                b = i2;
                int i212 = i211 % 2;
                if (z) {
                    int i213 = (-2) - (((i2 ^ 84) + ((i2 & 84) << 1)) ^ (-1));
                    a = i213 % 128;
                    int i214 = i213 % 2;
                    c0055l.c.co(i, 2);
                    int i215 = a;
                    int i216 = i215 & 69;
                    int i217 = i215 | 69;
                    int i218 = (i216 ^ i217) + ((i217 & i216) << 1);
                    b = i218 % 128;
                    int i219 = i218 % 2;
                    i3 = 0;
                    i4 = 0;
                    while (i3 < list.size()) {
                        i7 = a + 117;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            list.get(i3);
                            Logger logger3 = AbstractC0064u.d;
                            obj.hashCode();
                            throw null;
                        }
                        list.get(i3);
                        Logger logger4 = AbstractC0064u.d;
                        int i310 = i4 & 41;
                        int i311 = (i4 | 41) & (~i310);
                        int i312 = i310 << 1;
                        int i313 = (i311 ^ i312) + ((i311 & i312) << 1);
                        int i314 = i313 & (-37);
                        int i315 = -(-((i313 ^ (-37)) | i314));
                        i4 = ((i314 | i315) << 1) - (i314 ^ i315);
                        int i316 = i3 & 1;
                        int i317 = (i3 ^ 1) | i316;
                        i3 = ((i316 | i317) << 1) - (i317 ^ i316);
                        int i318 = b;
                        int i319 = ((i318 & (-86)) | ((~i318) & 85)) + ((i318 & 85) << 1);
                        a = i319 % 128;
                        int i410 = i319 % 2;
                    }
                    c0055l.c.cp(i4);
                    int i411 = b;
                    int i412 = i411 & 59;
                    int i413 = (i412 - (~((i411 ^ 59) | i412))) - 1;
                    a = i413 % 128;
                    int i414 = i413 % 2;
                    while (i15 < list.size()) {
                        int i415 = b;
                        int i416 = (i415 & 5) + (i415 | 5);
                        a = i416 % 128;
                        int i417 = i416 % 2;
                        abstractC0064u = c0055l.c;
                        num = list.get(i15);
                        int i418 = a;
                        int i419 = i418 ^ 101;
                        int i510 = -(-((i418 & 101) << 1));
                        i5 = (i419 & i510) + (i510 | i419);
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            num.intValue();
                            obj.hashCode();
                            throw null;
                        }
                        int iIntValue2 = num.intValue();
                        int i511 = b;
                        int i512 = i511 & 109;
                        int i513 = -(-((i511 ^ 109) | i512));
                        int i514 = ((i512 | i513) << 1) - (i513 ^ i512);
                        a = i514 % 128;
                        int i515 = i514 % 2;
                        abstractC0064u.cf(iIntValue2);
                        int i516 = i15 & (-23);
                        int i517 = -(-((i15 ^ (-23)) | i516));
                        int i518 = (i516 ^ i517) + ((i516 & i517) << 1);
                        int i519 = i518 & 24;
                        int i610 = (i518 ^ 24) | i519;
                        i15 = (i519 ^ i610) + ((i519 & i610) << 1);
                        int i611 = b;
                        int i612 = i611 & 3;
                        i6 = (((i611 ^ 3) | i612) << 1) - ((i611 | 3) & (~i612));
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i613 = 4 / 2;
                        }
                    }
                } else {
                    while (i15 < list.size()) {
                        int i614 = b;
                        int i615 = i614 & 77;
                        int i616 = (((i614 ^ 77) | i615) << 1) - ((i614 | 77) & (~i615));
                        a = i616 % 128;
                        int i617 = i616 % 2;
                        AbstractC0064u abstractC0064u3 = c0055l.c;
                        Integer num3 = list.get(i15);
                        int i618 = b;
                        int i619 = (i618 & 109) + (i618 | 109);
                        a = i619 % 128;
                        int i710 = i619 % 2;
                        abstractC0064u3.ce(i, num3.intValue());
                        int i711 = a;
                        int i712 = i711 & 81;
                        int i713 = -(-((i711 ^ 81) | i712));
                        int i714 = ((i712 | i713) << 1) - (i713 ^ i712);
                        int i715 = i714 % 128;
                        b = i715;
                        int i716 = i714 % 2;
                        int i717 = i15 & (-42);
                        int i718 = (i15 ^ (-42)) | i717;
                        int i719 = (i717 & i718) + (i718 | i717);
                        int i85 = i719 ^ 43;
                        int i86 = ((i719 & 43) | i85) << 1;
                        int i87 = -i85;
                        i15 = ((i86 | i87) << 1) - (i87 ^ i86);
                        int i88 = ((i715 | 13) << 1) - (i715 ^ 13);
                        a = i88 % 128;
                        int i89 = i88 % 2;
                    }
                }
            }
        }
        int i90 = a;
        int i91 = (i90 | 105) << 1;
        int i92 = -(i90 ^ 105);
        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
        b = i93 % 128;
        if (i93 % 2 != 0) {
            throw null;
        }
    }

    public static void S(int i, List<Long> list, InterfaceC0051g interfaceC0051g, boolean z) {
        AbstractC0064u abstractC0064u;
        Long l;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 87) + ((i3 & 87) << 1);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (list != null && (!list.isEmpty())) {
            int i5 = b;
            int i6 = i5 ^ 27;
            int i7 = (((i5 & 27) | i6) << 1) - i6;
            a = i7 % 128;
            int i8 = i7 % 2;
            C0055l c0055l = (C0055l) interfaceC0051g;
            Objects.requireNonNull(c0055l);
            if (z) {
                int i9 = b;
                int i10 = i9 & 5;
                int i11 = (i9 | 5) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                c0055l.c.co(i, 2);
                int i15 = a + 43;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 2 / 5;
                }
                int i17 = 0;
                int i18 = 0;
                while (i17 < list.size()) {
                    int i19 = b;
                    int i20 = i19 & 9;
                    int i21 = -(-((i19 ^ 9) | i20));
                    int i22 = (i20 & i21) + (i21 | i20);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    long jLongValue = list.get(i17).longValue();
                    if (i23 == 0) {
                        int i24 = 1 / 0;
                    }
                    int i25 = -(~(-(-AbstractC0064u.bP(jLongValue))));
                    i18 = (((i18 | i25) << 1) - (i18 ^ i25)) - 1;
                    i17 = ((i17 | 1) << 1) - (i17 ^ 1);
                    int i26 = b;
                    int i27 = i26 & 53;
                    int i28 = (((i26 | 53) & (~i27)) - (~(i27 << 1))) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                }
                c0055l.c.cp(i18);
                int i30 = b;
                int i31 = (i30 ^ 125) + ((i30 & 125) << 1);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 5 % 4;
                }
                int i33 = 0;
                while (i33 < list.size()) {
                    int i34 = a;
                    int i35 = ((i34 & 48) + (i34 | 48)) - 1;
                    b = i35 % 128;
                    if (i35 % 2 != 0) {
                        AbstractC0064u abstractC0064u2 = c0055l.c;
                        list.get(i33);
                        obj.hashCode();
                        throw null;
                    }
                    AbstractC0064u abstractC0064u3 = c0055l.c;
                    Long l2 = list.get(i33);
                    int i36 = a;
                    int i37 = ((i36 & (-116)) | ((~i36) & 115)) + ((i36 & 115) << 1);
                    b = i37 % 128;
                    if (i37 % 2 != 0) {
                        l2.longValue();
                        obj.hashCode();
                        throw null;
                    }
                    abstractC0064u3.cs(AbstractC0064u.bW(l2.longValue()));
                    i33++;
                    int i38 = a;
                    int i39 = (i38 | 73) << 1;
                    int i40 = -(((~i38) & 73) | (i38 & (-74)));
                    int i41 = (i39 & i40) + (i40 | i39);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                }
            } else {
                int i43 = 0;
                while (i43 < list.size()) {
                    int i44 = b;
                    int i45 = ((i44 ^ 5) | (i44 & 5)) << 1;
                    int i46 = -(((~i44) & 5) | (i44 & (-6)));
                    int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                    a = i47 % 128;
                    if (i47 % 2 == 0) {
                        abstractC0064u = c0055l.c;
                        l = list.get(i43);
                        int i48 = 6 / 0;
                    } else {
                        abstractC0064u = c0055l.c;
                        l = list.get(i43);
                    }
                    abstractC0064u.cr(i, AbstractC0064u.bW(l.longValue()));
                    int i49 = b;
                    int i50 = ((i49 | 59) << 1) - (i49 ^ 59);
                    a = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = i43 & 9;
                    int i53 = ((i43 ^ 9) | i52) << 1;
                    int i54 = -((i43 | 9) & (~i52));
                    int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                    int i56 = i55 & (-8);
                    int i57 = (i55 ^ (-8)) | i56;
                    i43 = (i56 | i57) + (i56 & i57);
                    int i58 = (i49 & (-54)) | ((~i49) & 53);
                    int i59 = -(-((i49 & 53) << 1));
                    int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                    a = i60 % 128;
                    int i61 = i60 % 2;
                }
            }
        }
        int i62 = b;
        int i63 = i62 & 95;
        int i64 = ((i62 ^ 95) | i63) << 1;
        int i65 = -((i62 | 95) & (~i63));
        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
        a = i66 % 128;
        if (i66 % 2 == 0) {
            int i67 = 17 / 0;
        }
    }

    public static int m(int i, List<Long> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = a + 45;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            list.size();
            throw null;
        }
        if (list.size() == 0) {
            int i4 = a;
            int i5 = i4 & 63;
            int i6 = ((i4 ^ 63) | i5) << 1;
            int i7 = -((i4 | 63) & (~i5));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 9;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        int iO = o(list);
        if (!z) {
            int iBT = (AbstractC0064u.bT(i) * list.size()) + iO;
            int i12 = b;
            int i13 = i12 & 61;
            int i14 = (i12 | 61) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 & i15) + (i14 | i15);
            a = i16 % 128;
            if (i16 % 2 != 0) {
                return iBT;
            }
            throw null;
        }
        int i17 = a;
        int i18 = i17 & 109;
        int i19 = i18 + ((i17 ^ 109) | i18);
        b = i19 % 128;
        int i20 = i19 % 2;
        int iBT2 = AbstractC0064u.bT(i);
        int iBK = AbstractC0064u.bK(iO);
        int i21 = iBK ^ iBT2;
        int i22 = -(-((iBT2 & iBK) << 1));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        int i24 = a;
        int i25 = i24 ^ 7;
        int i26 = (((i24 & 7) | i25) << 1) - i25;
        b = i26 % 128;
        if (i26 % 2 == 0) {
            return i23;
        }
        throw null;
    }

    public static int o(List<Long> list) {
        long jLongValue;
        int i = 2 % 2;
        int i2 = a + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            int i5 = a;
            int i6 = ((i5 | 65) << 1) - (i5 ^ 65);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 | 107;
            int i9 = ((i8 << 1) - (~(-((~(i5 & 107)) & i8)))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return 0;
        }
        if (list instanceof W) {
            int i11 = b;
            int i12 = (i11 ^ 107) + ((i11 & 107) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            W w = (W) list;
            int i14 = ((i11 & (-90)) | ((~i11) & 89)) + ((i11 & 89) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < size) {
                int i17 = a;
                int i18 = i17 & 21;
                int i19 = ((i17 ^ 21) | i18) << 1;
                int i20 = -((i17 | 21) & (~i18));
                int i21 = (i19 & i20) + (i20 | i19);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    int iBZ = AbstractC0064u.bZ(w.h(i16));
                    i4 = ((i4 | iBZ) << 1) - (i4 ^ iBZ);
                } else {
                    int i22 = -(~(-(-AbstractC0064u.bZ(w.h(i16)))));
                    int i23 = (i4 ^ i22) + ((i4 & i22) << 1);
                    i4 = (i23 ^ (-1)) + (i23 << 1);
                }
                i16++;
                int i24 = b + 93;
                a = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 3 % 2;
                }
            }
        } else {
            int i26 = a;
            int i27 = i26 & 103;
            int i28 = ((i26 ^ 103) | i27) << 1;
            int i29 = -((i26 | 103) & (~i27));
            int i30 = (i28 & i29) + (i29 | i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 0;
            int i33 = 0;
            while (i33 < size) {
                int i34 = b;
                int i35 = i34 & 25;
                int i36 = (i34 | 25) & (~i35);
                int i37 = i35 << 1;
                int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                a = i38 % 128;
                if (i38 % 2 == 0) {
                    jLongValue = list.get(i33).longValue();
                    int i39 = 33 / 0;
                } else {
                    jLongValue = list.get(i33).longValue();
                }
                int i40 = a;
                int i41 = i40 & 91;
                int i42 = (i40 ^ 91) | i41;
                int i43 = (i41 & i42) + (i42 | i41);
                b = i43 % 128;
                int i44 = i43 % 2;
                int i45 = -(~(-(-AbstractC0064u.bZ(jLongValue))));
                i32 = ((i32 & i45) + (i32 | i45)) - 1;
                i33++;
                int i46 = a;
                int i47 = (-2) - (((i46 ^ 102) + ((i46 & 102) << 1)) ^ (-1));
                b = i47 % 128;
                int i48 = i47 % 2;
            }
            i4 = i32;
        }
        int i49 = a;
        int i50 = i49 & 53;
        int i51 = (i49 | 53) & (~i50);
        int i52 = i50 << 1;
        int i53 = (i51 & i52) + (i51 | i52);
        b = i53 % 128;
        if (i53 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public static int v(int i, List<Integer> list, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 43;
        int i5 = (i4 - (~(-(-((i3 ^ 43) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int size = list.size();
        if (size == 0) {
            int i7 = b + 33;
            a = i7 % 128;
            int i8 = i7 % 2;
            return 0;
        }
        int iX = x(list);
        if (!z) {
            int iBT = AbstractC0064u.bT(i) * size;
            int i9 = iBT & iX;
            int i10 = ((iBT ^ iX) | i9) << 1;
            int i11 = -((iBT | iX) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = b;
            int i14 = i13 & 89;
            int i15 = i14 + ((i13 ^ 89) | i14);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return i12;
            }
            throw null;
        }
        int i16 = b;
        int i17 = ((((i16 ^ 47) | (i16 & 47)) << 1) - (~(-(((~i16) & 47) | (i16 & (-48)))))) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
        int iBT2 = AbstractC0064u.bT(i);
        int iBK = AbstractC0064u.bK(iX);
        int i19 = -(-iBT2);
        int i20 = iBK | i19;
        int i21 = (i20 << 1) - ((~(i19 & iBK)) & i20);
        int i22 = b;
        int i23 = i22 & 81;
        int i24 = ((i22 ^ 81) | i23) << 1;
        int i25 = -((i22 | 81) & (~i23));
        int i26 = (i24 & i25) + (i25 | i24);
        a = i26 % 128;
        int i27 = i26 % 2;
        return i21;
    }

    public static int x(List<Integer> list) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = (i3 - (~(-(-((i2 ^ 25) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        int iBU = 0;
        if (size == 0) {
            int i6 = b;
            int i7 = i6 ^ 87;
            int i8 = -(-((i6 & 87) << 1));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            return i9 % 2 == 0 ? 1 : 0;
        }
        if (!(list instanceof L)) {
            int i10 = b;
            int i11 = ((i10 & 100) + (i10 | 100)) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < size) {
                int i14 = b + 41;
                a = i14 % 128;
                int i15 = i14 % 2;
                Integer num = list.get(i13);
                int i16 = b;
                int i17 = i16 & 91;
                int i18 = (((i16 ^ 91) | i17) << 1) - ((i16 | 91) & (~i17));
                a = i18 % 128;
                if (i18 % 2 == 0) {
                    iBU <<= AbstractC0064u.bU(num.intValue());
                    i13 += 49;
                } else {
                    int i19 = -(-AbstractC0064u.bU(num.intValue()));
                    int i20 = iBU ^ i19;
                    int i21 = ((iBU & i19) | i20) << 1;
                    int i22 = -i20;
                    i13++;
                    iBU = (i21 & i22) + (i21 | i22);
                }
                int i23 = a;
                int i24 = (i23 ^ 11) + ((i23 & 11) << 1);
                b = i24 % 128;
                int i25 = i24 % 2;
            }
        } else {
            int i26 = a + 55;
            int i27 = i26 % 128;
            b = i27;
            int i28 = i26 % 2;
            L l = (L) list;
            int i29 = i27 ^ 121;
            int i30 = ((i27 & 121) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
            int i34 = 0;
            while (i34 < size) {
                int i35 = a;
                int i36 = ((i35 ^ 8) + ((i35 & 8) << 1)) - 1;
                b = i36 % 128;
                int i37 = i36 % 2;
                iBU = (iBU - (~AbstractC0064u.bU(l.h(i34)))) - 1;
                int i38 = i34 & (-106);
                int i39 = (i34 ^ (-106)) | i38;
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                int i41 = i40 & 107;
                i34 = (i41 - (~(-(-((i40 ^ 107) | i41))))) - 1;
                int i42 = a + 75;
                b = i42 % 128;
                int i43 = i42 % 2;
            }
        }
        int i44 = a;
        int i45 = (-2) - (((i44 ^ 46) + ((i44 & 46) << 1)) ^ (-1));
        b = i45 % 128;
        int i46 = i45 % 2;
        return iBU;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b A[PHI: r5
  0x008b: PHI (r5v35 java.lang.Object) = (r5v34 java.lang.Object), (r5v55 java.lang.Object) binds: [B:21:0x0089, B:18:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4 A[PHI: r5
  0x00a4: PHI (r5v52 java.lang.Object) = (r5v34 java.lang.Object), (r5v55 java.lang.Object) binds: [B:21:0x0089, B:18:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    public static int w(int i, List<?> list) {
        int iBR;
        InterfaceC0062s interfaceC0062s;
        int i2;
        Object objD;
        int iBR2;
        int i3 = 2 % 2;
        int i4 = b + 23;
        a = i4 % 128;
        int i5 = i4 % 2;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            int i7 = b;
            int i8 = (((i7 & (-62)) | ((~i7) & 61)) - (~((i7 & 61) << 1))) - 1;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 ^ 95;
            int i11 = ((i7 & 95) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 & i12) + (i11 | i12);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 38 / 0;
            }
            return 0;
        }
        int iBT = AbstractC0064u.bT(i) * size;
        if (list instanceof InterfaceC0062s) {
            int i15 = a;
            int i16 = i15 & 79;
            int i17 = i16 + ((i15 ^ 79) | i16);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                interfaceC0062s = (InterfaceC0062s) list;
                i2 = 1;
            } else {
                interfaceC0062s = (InterfaceC0062s) list;
                i2 = 0;
            }
            while (i2 < size) {
                int i18 = a;
                int i19 = i18 | 47;
                int i20 = i19 << 1;
                int i21 = -((~(i18 & 47)) & i19);
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    objD = interfaceC0062s.d(i2);
                    int i23 = 65 / 0;
                    if (!(objD instanceof AbstractC0069z)) {
                        iBR2 = AbstractC0064u.bR((String) objD);
                        int i24 = a;
                        int i25 = i24 & 89;
                        int i26 = (((i24 ^ 89) | i25) << 1) - ((i24 | 89) & (~i25));
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    } else {
                        iBR2 = AbstractC0064u.by((AbstractC0069z) objD);
                        int i28 = a;
                        int i29 = i28 & 121;
                        int i30 = ((((i28 ^ 121) | i29) << 1) - (~(-((i28 | 121) & (~i29))))) - 1;
                        b = i30 % 128;
                        int i31 = i30 % 2;
                    }
                } else {
                    objD = interfaceC0062s.d(i2);
                    if (!(objD instanceof AbstractC0069z)) {
                        iBR2 = AbstractC0064u.bR((String) objD);
                        int i210 = a;
                        int i211 = i210 & 89;
                        int i212 = (((i210 ^ 89) | i211) << 1) - ((i210 | 89) & (~i211));
                        b = i212 % 128;
                        int i213 = i212 % 2;
                    } else {
                        iBR2 = AbstractC0064u.by((AbstractC0069z) objD);
                        int i214 = a;
                        int i215 = i214 & 121;
                        int i32 = ((((i214 ^ 121) | i215) << 1) - (~(-((i214 | 121) & (~i215))))) - 1;
                        b = i32 % 128;
                        int i33 = i32 % 2;
                    }
                }
                iBT = (iBT | iBR2) + (iBR2 & iBT);
                int i34 = ((i2 & (-67)) + (i2 | (-67))) - 1;
                int i35 = i34 ^ 69;
                int i36 = -(-((i34 & 69) << 1));
                i2 = ((i35 & i36) << 1) + (i35 ^ i36);
                int i37 = b;
                int i38 = i37 & 111;
                int i39 = (i37 ^ 111) | i38;
                int i40 = (i38 & i39) + (i39 | i38);
                a = i40 % 128;
                if (i40 % 2 == 0) {
                    int i41 = 2 / 3;
                }
            }
        } else {
            while (i6 < size) {
                int i42 = b;
                int i43 = ((i42 | 61) << 1) - (((~i42) & 61) | (i42 & (-62)));
                a = i43 % 128;
                int i44 = i43 % 2;
                Object obj = list.get(i6);
                if (obj instanceof AbstractC0069z) {
                    int i45 = b;
                    int i46 = (i45 | 39) << 1;
                    int i47 = -(((~i45) & 39) | (i45 & (-40)));
                    int i48 = (i46 & i47) + (i47 | i46);
                    a = i48 % 128;
                    int i49 = i48 % 2;
                    iBR = AbstractC0064u.by((AbstractC0069z) obj);
                    int i50 = a;
                    int i51 = i50 & 111;
                    int i52 = ((i50 ^ 111) | i51) << 1;
                    int i53 = -((i50 | 111) & (~i51));
                    int i54 = (i52 & i53) + (i53 | i52);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                } else {
                    iBR = AbstractC0064u.bR((String) obj);
                    int i56 = b;
                    int i57 = ((i56 & 24) + (i56 | 24)) - 1;
                    a = i57 % 128;
                    int i58 = i57 % 2;
                }
                int i59 = ((~iBT) & iBR) | ((~iBR) & iBT);
                int i60 = (iBT & iBR) << 1;
                iBT = ((i59 | i60) << 1) - (i60 ^ i59);
                int i61 = i6 & 1;
                i6 = ((i6 ^ 1) | i61) + i61;
                int i62 = b;
                int i63 = i62 & 57;
                int i64 = -(-((i62 ^ 57) | i63));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                a = i65 % 128;
                int i66 = i65 % 2;
            }
        }
        int i67 = b;
        int i68 = ((i67 ^ 72) + ((i67 & 72) << 1)) - 1;
        a = i68 % 128;
        if (i68 % 2 != 0) {
            return iBT;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x010b A[LOOP:1: B:26:0x0105->B:28:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0178 A[LOOP:2: B:29:0x0178->B:33:0x0189, LOOP_START, PHI: r1
  0x0178: PHI (r1v13 int) = (r1v12 int), (r1v15 int) binds: [B:12:0x0043, B:33:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x017e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0189 A[LOOP:2: B:29:0x0178->B:33:0x0189, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x01c1 A[SYNTHETIC] */
    public static void T(int i, List<Integer> list, InterfaceC0051g interfaceC0051g, boolean z) {
        C0055l c0055l;
        int i2;
        int i3;
        int i4;
        int iBN;
        int iIntValue;
        int i5;
        int i6 = 2 % 2;
        int i7 = a;
        int i8 = i7 & 23;
        int i9 = (i7 | 23) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        if (list != null) {
            int i14 = i12 & 71;
            int i15 = -(-(i12 | 71));
            int i16 = (i14 & i15) + (i15 | i14);
            a = i16 % 128;
            int i17 = 0;
            if (i16 % 2 == 0) {
                int i18 = 44 / 0;
                if (!list.isEmpty()) {
                    c0055l = (C0055l) interfaceC0051g;
                    Objects.requireNonNull(c0055l);
                    if (z) {
                        int i19 = b;
                        int i20 = i19 & 113;
                        i3 = i20 + ((i19 ^ 113) | i20);
                        a = i3 % 128;
                        if (i3 % 2 == 0) {
                            c0055l.c.co(i, 3);
                        } else {
                            c0055l.c.co(i, 2);
                        }
                        int i21 = b + 16;
                        int i22 = (i21 ^ (-1)) + (i21 << 1);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        i4 = 0;
                        iBN = 0;
                        while (i4 < list.size()) {
                            int i24 = a + 41;
                            b = i24 % 128;
                            int i25 = i24 % 2;
                            iIntValue = list.get(i4).intValue();
                            int i26 = a;
                            i5 = (i26 & 47) + (i26 | 47);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                iBN *= AbstractC0064u.bN(iIntValue);
                                int i27 = (i4 | (-14)) << 1;
                                int i28 = -(((~i4) & (-14)) | (i4 & 13));
                                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                                int i30 = i29 & 19;
                                i4 = (((~i30) & (i29 | 19)) - (~(-(-(i30 << 1))))) - 1;
                            } else {
                                int i31 = -(-AbstractC0064u.bN(iIntValue));
                                int i32 = iBN & i31;
                                int i33 = (iBN | i31) & (~i32);
                                int i34 = -(-(i32 << 1));
                                int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                                int i36 = i4 & 1;
                                int i37 = -(-(i4 | 1));
                                i4 = (i36 & i37) + (i37 | i36);
                                iBN = i35;
                            }
                            int i38 = b;
                            int i39 = (i38 & (-38)) | ((~i38) & 37);
                            int i40 = (i38 & 37) << 1;
                            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                            a = i41 % 128;
                            int i42 = i41 % 2;
                        }
                        c0055l.c.cp(iBN);
                        int i43 = b;
                        int i44 = i43 & 59;
                        int i45 = -(-(i43 | 59));
                        int i46 = (i44 & i45) + (i45 | i44);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        while (i17 < list.size()) {
                            int i48 = b;
                            int i49 = ((((i48 ^ 101) | (i48 & 101)) << 1) - (~(-(((~i48) & 101) | (i48 & (-102)))))) - 1;
                            a = i49 % 128;
                            int i50 = i49 % 2;
                            AbstractC0064u abstractC0064u = c0055l.c;
                            Integer num = list.get(i17);
                            int i51 = a;
                            int i52 = i51 & 115;
                            int i53 = ((i51 | 115) & (~i52)) + (i52 << 1);
                            b = i53 % 128;
                            int i54 = i53 % 2;
                            int iIntValue2 = num.intValue();
                            int i55 = a;
                            int i56 = i55 | 115;
                            int i57 = i56 << 1;
                            int i58 = -((~(i55 & 115)) & i56);
                            int i59 = (i57 & i58) + (i58 | i57);
                            b = i59 % 128;
                            int i60 = i59 % 2;
                            abstractC0064u.cp(AbstractC0064u.bX(iIntValue2));
                            int i61 = ((i17 | 22) << 1) - (i17 ^ 22);
                            int i62 = (i61 ^ (-1)) + (i61 << 1);
                            i17 = (i62 & (-20)) + (i62 | (-20));
                            int i63 = b;
                            int i64 = ((i63 | 105) << 1) - (i63 ^ 105);
                            a = i64 % 128;
                            int i65 = i64 % 2;
                        }
                    } else {
                        while (i17 < list.size()) {
                            i2 = a + 45;
                            b = i2 % 128;
                            if (i2 % 2 == 0) {
                                AbstractC0064u abstractC0064u2 = c0055l.c;
                                list.get(i17);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            AbstractC0064u abstractC0064u3 = c0055l.c;
                            Integer num2 = list.get(i17);
                            int i66 = a + 97;
                            b = i66 % 128;
                            int i67 = i66 % 2;
                            abstractC0064u3.cq(i, AbstractC0064u.bX(num2.intValue()));
                            i17 = (i17 | 1) + (i17 & 1);
                            int i68 = b;
                            int i69 = i68 & 25;
                            int i70 = (i68 | 25) & (~i69);
                            int i71 = -(-(i69 << 1));
                            int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                            a = i72 % 128;
                            int i73 = i72 % 2;
                        }
                    }
                }
            } else if (!list.isEmpty()) {
                c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                if (z) {
                    int i110 = b;
                    int i210 = i110 & 113;
                    i3 = i210 + ((i110 ^ 113) | i210);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        c0055l.c.co(i, 3);
                    } else {
                        c0055l.c.co(i, 2);
                    }
                    int i211 = b + 16;
                    int i212 = (i211 ^ (-1)) + (i211 << 1);
                    a = i212 % 128;
                    int i213 = i212 % 2;
                    i4 = 0;
                    iBN = 0;
                    while (i4 < list.size()) {
                        int i214 = a + 41;
                        b = i214 % 128;
                        int i215 = i214 % 2;
                        iIntValue = list.get(i4).intValue();
                        int i216 = a;
                        i5 = (i216 & 47) + (i216 | 47);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            iBN *= AbstractC0064u.bN(iIntValue);
                            int i217 = (i4 | (-14)) << 1;
                            int i218 = -(((~i4) & (-14)) | (i4 & 13));
                            int i219 = ((i217 | i218) << 1) - (i218 ^ i217);
                            int i310 = i219 & 19;
                            i4 = (((~i310) & (i219 | 19)) - (~(-(-(i310 << 1))))) - 1;
                        } else {
                            int i311 = -(-AbstractC0064u.bN(iIntValue));
                            int i312 = iBN & i311;
                            int i313 = (iBN | i311) & (~i312);
                            int i314 = -(-(i312 << 1));
                            int i315 = ((i313 | i314) << 1) - (i313 ^ i314);
                            int i316 = i4 & 1;
                            int i317 = -(-(i4 | 1));
                            i4 = (i316 & i317) + (i317 | i316);
                            iBN = i315;
                        }
                        int i318 = b;
                        int i319 = (i318 & (-38)) | ((~i318) & 37);
                        int i410 = (i318 & 37) << 1;
                        int i411 = ((i319 | i410) << 1) - (i410 ^ i319);
                        a = i411 % 128;
                        int i412 = i411 % 2;
                    }
                    c0055l.c.cp(iBN);
                    int i413 = b;
                    int i414 = i413 & 59;
                    int i415 = -(-(i413 | 59));
                    int i416 = (i414 & i415) + (i415 | i414);
                    a = i416 % 128;
                    int i417 = i416 % 2;
                    while (i17 < list.size()) {
                        int i418 = b;
                        int i419 = ((((i418 ^ 101) | (i418 & 101)) << 1) - (~(-(((~i418) & 101) | (i418 & (-102)))))) - 1;
                        a = i419 % 128;
                        int i510 = i419 % 2;
                        AbstractC0064u abstractC0064u4 = c0055l.c;
                        Integer num3 = list.get(i17);
                        int i511 = a;
                        int i512 = i511 & 115;
                        int i513 = ((i511 | 115) & (~i512)) + (i512 << 1);
                        b = i513 % 128;
                        int i514 = i513 % 2;
                        int iIntValue3 = num3.intValue();
                        int i515 = a;
                        int i516 = i515 | 115;
                        int i517 = i516 << 1;
                        int i518 = -((~(i515 & 115)) & i516);
                        int i519 = (i517 & i518) + (i518 | i517);
                        b = i519 % 128;
                        int i610 = i519 % 2;
                        abstractC0064u4.cp(AbstractC0064u.bX(iIntValue3));
                        int i611 = ((i17 | 22) << 1) - (i17 ^ 22);
                        int i612 = (i611 ^ (-1)) + (i611 << 1);
                        i17 = (i612 & (-20)) + (i612 | (-20));
                        int i613 = b;
                        int i614 = ((i613 | 105) << 1) - (i613 ^ 105);
                        a = i614 % 128;
                        int i615 = i614 % 2;
                    }
                } else {
                    while (i17 < list.size()) {
                        i2 = a + 45;
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            AbstractC0064u abstractC0064u5 = c0055l.c;
                            list.get(i17);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        AbstractC0064u abstractC0064u6 = c0055l.c;
                        Integer num4 = list.get(i17);
                        int i616 = a + 97;
                        b = i616 % 128;
                        int i617 = i616 % 2;
                        abstractC0064u6.cq(i, AbstractC0064u.bX(num4.intValue()));
                        i17 = (i17 | 1) + (i17 & 1);
                        int i618 = b;
                        int i619 = i618 & 25;
                        int i74 = (i618 | 25) & (~i619);
                        int i75 = -(-(i619 << 1));
                        int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                        a = i76 % 128;
                        int i77 = i76 % 2;
                    }
                }
            }
        }
        int i78 = a;
        int i79 = (i78 ^ 87) + ((i78 & 87) << 1);
        b = i79 % 128;
        int i80 = i79 % 2;
    }

    public static void E(int i, List<Boolean> list, InterfaceC0051g interfaceC0051g, boolean z) {
        C0055l c0055l;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & 93) + (i5 | 93);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (list != null && !list.isEmpty()) {
            int i7 = a + 17;
            b = i7 % 128;
            int i8 = 0;
            if (i7 % 2 != 0) {
                c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                i2 = 1;
            } else {
                c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                i2 = 0;
            }
            if (!z) {
                while (i2 < list.size()) {
                    int i9 = b;
                    int i10 = ((i9 & 8) + (i9 | 8)) - 1;
                    a = i10 % 128;
                    if (i10 % 2 == 0) {
                        AbstractC0064u abstractC0064u = c0055l.c;
                        list.get(i2);
                        throw null;
                    }
                    c0055l.c.cd(i, list.get(i2).booleanValue());
                    int i11 = i2 ^ 1;
                    int i12 = -(-((i2 & 1) << 1));
                    i2 = (i11 ^ i12) + ((i11 & i12) << 1);
                    int i13 = b;
                    int i14 = i13 & 73;
                    int i15 = (((i13 | 73) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                }
            } else {
                int i17 = a + 53;
                b = i17 % 128;
                int i18 = i17 % 2;
                c0055l.c.co(i, 2);
                int i19 = b;
                int i20 = i19 & 113;
                int i21 = -(-((i19 ^ 113) | i20));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
                int i24 = 0;
                int i25 = 0;
                while (i24 < list.size()) {
                    int i26 = a + 49;
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        list.get(i24);
                        Logger logger = AbstractC0064u.d;
                        i3 = (i25 & 47) + (i25 | 47);
                    } else {
                        list.get(i24);
                        Logger logger2 = AbstractC0064u.d;
                        i3 = ((i25 ^ 2) + ((i25 & 2) << 1)) - 1;
                    }
                    i25 = i3;
                    int i27 = b;
                    int i28 = (((i27 | 14) << 1) - (i27 ^ 14)) - 1;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = i24 & 1;
                    int i31 = -(-((i24 ^ 1) | i30));
                    i24 = ((i30 | i31) << 1) - (i31 ^ i30);
                    int i32 = (((i27 ^ 39) | (i27 & 39)) << 1) - (((~i27) & 39) | (i27 & (-40)));
                    a = i32 % 128;
                    int i33 = i32 % 2;
                }
                c0055l.c.cp(i25);
                int i34 = b + 25;
                a = i34 % 128;
                int i35 = i34 % 2;
                while (i8 < list.size()) {
                    int i36 = b;
                    int i37 = (i36 & 31) + (i36 | 31);
                    a = i37 % 128;
                    if (i37 % 2 == 0) {
                        AbstractC0064u abstractC0064u2 = c0055l.c;
                        list.get(i8);
                        obj.hashCode();
                        throw null;
                    }
                    c0055l.c.cb(list.get(i8).booleanValue() ? (byte) 1 : (byte) 0);
                    i8 = (i8 ^ 1) + ((i8 & 1) << 1);
                    int i38 = b;
                    int i39 = i38 & 87;
                    int i40 = ((i38 ^ 87) | i39) << 1;
                    int i41 = -((i38 | 87) & (~i39));
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    a = i42 % 128;
                    int i43 = i42 % 2;
                }
            }
        }
        int i44 = b + 33;
        a = i44 % 128;
        int i45 = i44 % 2;
    }

    public static void L(int i, List<Float> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2;
        AbstractC0064u abstractC0064u;
        Float f2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 33;
        int i6 = (i4 ^ 33) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        if (list != null) {
            int i9 = i4 + 67;
            b = i9 % 128;
            int i10 = i9 % 2;
            if (!list.isEmpty()) {
                int i11 = b + 29;
                a = i11 % 128;
                int i12 = i11 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                Object obj = null;
                int i13 = 0;
                if (z) {
                    int i14 = b;
                    int i15 = (i14 & (-62)) | ((~i14) & 61);
                    int i16 = -(-((i14 & 61) << 1));
                    int i17 = (i15 & i16) + (i16 | i15);
                    a = i17 % 128;
                    if (i17 % 2 == 0) {
                        c0055l.c.co(i, 5);
                        i2 = 1;
                    } else {
                        c0055l.c.co(i, 2);
                        i2 = 0;
                    }
                    int i18 = 0;
                    while (i2 < list.size()) {
                        int i19 = a;
                        int i20 = i19 & 91;
                        int i21 = i20 + ((i19 ^ 91) | i20);
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        list.get(i2);
                        Logger logger = AbstractC0064u.d;
                        int i23 = i18 & 4;
                        i18 = (((i18 ^ 4) | i23) << 1) - ((i18 | 4) & (~i23));
                        int i24 = a;
                        int i25 = i24 ^ 89;
                        int i26 = ((i24 & 89) | i25) << 1;
                        int i27 = -i25;
                        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                        b = i28 % 128;
                        i2 = i28 % 2 != 0 ? (-2) - ((((i2 | 123) << 1) - (i2 ^ 123)) ^ (-1)) : i2 + 1;
                    }
                    c0055l.c.cp(i18);
                    int i29 = b;
                    int i30 = i29 & 119;
                    int i31 = ((i29 ^ 119) | i30) << 1;
                    int i32 = -((i29 | 119) & (~i30));
                    int i33 = (i31 & i32) + (i32 | i31);
                    a = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = 0;
                    while (i35 < list.size()) {
                        int i36 = a;
                        int i37 = (((i36 | 84) << 1) - (i36 ^ 84)) - 1;
                        b = i37 % 128;
                        if (i37 % 2 != 0) {
                            abstractC0064u = c0055l.c;
                            f2 = list.get(i35);
                            int i38 = 24 / 0;
                        } else {
                            abstractC0064u = c0055l.c;
                            f2 = list.get(i35);
                        }
                        int i39 = b;
                        int i40 = (i39 & 81) + (i39 | 81);
                        a = i40 % 128;
                        if (i40 % 2 == 0) {
                            float fFloatValue = f2.floatValue();
                            Objects.requireNonNull(abstractC0064u);
                            Float.floatToRawIntBits(fFloatValue);
                            obj.hashCode();
                            throw null;
                        }
                        float fFloatValue2 = f2.floatValue();
                        Objects.requireNonNull(abstractC0064u);
                        abstractC0064u.cf(Float.floatToRawIntBits(fFloatValue2));
                        int i41 = i35 & 29;
                        int i42 = ((i35 ^ 29) | i41) << 1;
                        int i43 = -((i35 | 29) & (~i41));
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        int i45 = i44 & (-28);
                        i35 = (((i44 ^ (-28)) | i45) << 1) - ((~i45) & (i44 | (-28)));
                        int i46 = b;
                        int i47 = i46 & 29;
                        int i48 = (((i46 | 29) & (~i47)) - (~(i47 << 1))) - 1;
                        a = i48 % 128;
                        int i49 = i48 % 2;
                    }
                } else {
                    while (i13 < list.size()) {
                        int i50 = b;
                        int i51 = (i50 & (-70)) | ((~i50) & 69);
                        int i52 = (i50 & 69) << 1;
                        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                        a = i53 % 128;
                        if (i53 % 2 == 0) {
                            AbstractC0064u abstractC0064u2 = c0055l.c;
                            list.get(i13);
                            throw null;
                        }
                        AbstractC0064u abstractC0064u3 = c0055l.c;
                        float fFloatValue3 = list.get(i13).floatValue();
                        Objects.requireNonNull(abstractC0064u3);
                        int i54 = a;
                        int i55 = (i54 ^ 75) + ((i54 & 75) << 1);
                        b = i55 % 128;
                        if (i55 % 2 != 0) {
                            abstractC0064u3.ce(i, Float.floatToRawIntBits(fFloatValue3));
                            int i56 = i13 & 56;
                            i13 = (((i13 ^ 56) | i56) << 1) - ((i13 | 56) & (~i56));
                        } else {
                            abstractC0064u3.ce(i, Float.floatToRawIntBits(fFloatValue3));
                            int i57 = i13 & 1;
                            int i58 = (i13 | 1) & (~i57);
                            int i59 = -(-(i57 << 1));
                            i13 = (i58 ^ i59) + ((i59 & i58) << 1);
                        }
                        int i60 = a;
                        int i61 = ((i60 ^ 44) + ((i60 & 44) << 1)) - 1;
                        b = i61 % 128;
                        int i62 = i61 % 2;
                    }
                }
            }
        }
        int i63 = b;
        int i64 = i63 ^ 47;
        int i65 = (i63 & 47) << 1;
        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
        a = i66 % 128;
        int i67 = i66 % 2;
    }

    public static void N(int i, List<Long> list, InterfaceC0051g interfaceC0051g, boolean z) {
        AbstractC0064u abstractC0064u;
        Long l;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 55;
        int i5 = -(-(i3 | 55));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (list != null && !list.isEmpty()) {
            int i7 = b;
            int i8 = (i7 & 1) + (i7 | 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            C0055l c0055l = (C0055l) interfaceC0051g;
            Objects.requireNonNull(c0055l);
            int i10 = a;
            int i11 = i10 & 3;
            int i12 = -(-((i10 ^ 3) | i11));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            if (z) {
                int i16 = i10 & 31;
                int i17 = ((i10 ^ 31) | i16) << 1;
                int i18 = -((i10 | 31) & (~i16));
                int i19 = (i17 & i18) + (i17 | i18);
                b = i19 % 128;
                if (i19 % 2 != 0) {
                    c0055l.c.co(i, 5);
                } else {
                    c0055l.c.co(i, 2);
                }
                int i20 = a;
                int i21 = (i20 ^ 113) + ((i20 & 113) << 1);
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 5 / 4;
                }
                int i23 = 0;
                int i24 = 0;
                while (i23 < list.size()) {
                    int i25 = b;
                    int i26 = i25 | 21;
                    int i27 = (i26 << 1) - ((~(i25 & 21)) & i26);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                    long jLongValue = list.get(i23).longValue();
                    int i29 = b;
                    int i30 = (i29 & 51) + (i29 | 51);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    int iBZ = AbstractC0064u.bZ(jLongValue);
                    if (i31 == 0) {
                        i24 >>>= iBZ;
                    } else {
                        int i32 = -(-iBZ);
                        int i33 = (i24 | i32) << 1;
                        int i34 = -(((~i24) & i32) | ((~i32) & i24));
                        i24 = (i33 & i34) + (i34 | i33);
                    }
                    int i35 = b + 97;
                    a = i35 % 128;
                    if (i35 % 2 == 0) {
                        i23 = (-2) - ((i23 + 79) ^ (-1));
                    } else {
                        int i36 = ((i23 ^ 1) | (i23 & 1)) << 1;
                        int i37 = -(((~i23) & 1) | (i23 & (-2)));
                        i23 = (i36 ^ i37) + ((i37 & i36) << 1);
                    }
                }
                c0055l.c.cp(i24);
                int i38 = a;
                int i39 = (i38 & 27) + (i38 | 27);
                b = i39 % 128;
                while (true) {
                    int i40 = i39 % 2;
                    if (i15 >= list.size()) {
                        break;
                    }
                    int i41 = a;
                    int i42 = i41 & 21;
                    int i43 = ((i41 ^ 21) | i42) << 1;
                    int i44 = -((i41 | 21) & (~i42));
                    int i45 = (i43 & i44) + (i44 | i43);
                    b = i45 % 128;
                    int i46 = i45 % 2;
                    AbstractC0064u abstractC0064u2 = c0055l.c;
                    Long l2 = list.get(i15);
                    int i47 = b + 103;
                    a = i47 % 128;
                    int i48 = i47 % 2;
                    abstractC0064u2.cs(l2.longValue());
                    i15++;
                    int i49 = b;
                    int i50 = i49 & 117;
                    i39 = (((i49 ^ 117) | i50) << 1) - ((i49 | 117) & (~i50));
                    a = i39 % 128;
                }
            } else {
                int i51 = 0;
                while (i51 < list.size()) {
                    int i52 = a + 19;
                    b = i52 % 128;
                    if (i52 % 2 != 0) {
                        abstractC0064u = c0055l.c;
                        l = list.get(i51);
                        int i53 = 18 / 0;
                    } else {
                        abstractC0064u = c0055l.c;
                        l = list.get(i51);
                    }
                    abstractC0064u.cr(i, l.longValue());
                    i51 = ((i51 & 1) << 1) + ((i51 & (-2)) | ((~i51) & 1));
                    int i54 = b;
                    int i55 = (i54 & (-90)) | ((~i54) & 89);
                    int i56 = (i54 & 89) << 1;
                    int i57 = (i55 & i56) + (i56 | i55);
                    a = i57 % 128;
                    if (i57 % 2 == 0) {
                        int i58 = 5 / 3;
                    }
                }
            }
        }
        int i59 = a;
        int i60 = i59 ^ 93;
        int i61 = ((((i59 & 93) | i60) << 1) - (~(-i60))) - 1;
        b = i61 % 128;
        int i62 = i61 % 2;
    }

    public static void V(int i, List<Long> list, InterfaceC0051g interfaceC0051g, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 101) + ((i3 & 101) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (list != null) {
            int i6 = (((i3 & (-64)) | ((~i3) & 63)) - (~(-(-((i3 & 63) << 1))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            if (!list.isEmpty()) {
                int i8 = b;
                int i9 = ((((i8 ^ 15) | (i8 & 15)) << 1) - (~(-(((~i8) & 15) | (i8 & (-16)))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                C0055l c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                int i11 = b;
                int i12 = i11 & 55;
                int i13 = (i11 | 55) & (~i12);
                int i14 = i12 << 1;
                int i15 = (i13 & i14) + (i13 | i14);
                int i16 = i15 % 128;
                a = i16;
                if (i15 % 2 == 0) {
                    throw null;
                }
                int i17 = 0;
                if (!z) {
                    while (i17 < list.size()) {
                        int i18 = b;
                        int i19 = (i18 | 85) << 1;
                        int i20 = -(((~i18) & 85) | (i18 & (-86)));
                        int i21 = (i19 & i20) + (i20 | i19);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        AbstractC0064u abstractC0064u = c0055l.c;
                        Long l = list.get(i17);
                        int i23 = b;
                        int i24 = i23 & 115;
                        int i25 = i24 + ((i23 ^ 115) | i24);
                        a = i25 % 128;
                        if (i25 % 2 == 0) {
                            abstractC0064u.cr(i, l.longValue());
                            int i26 = i17 & 34;
                            int i27 = i26 + ((i17 ^ 34) | i26);
                            int i28 = i27 & (-13);
                            int i29 = (i27 | (-13)) & (~i28);
                            int i30 = -(-(i28 << 1));
                            i17 = (i29 & i30) + (i29 | i30);
                        } else {
                            abstractC0064u.cr(i, l.longValue());
                            int i31 = ((i17 ^ 5) + ((i17 & 5) << 1)) - 1;
                            i17 = (-2) - (((i31 ^ (-2)) + ((i31 & (-2)) << 1)) ^ (-1));
                        }
                        int i32 = b;
                        int i33 = i32 ^ 9;
                        int i34 = (i32 & 9) << 1;
                        int i35 = (i33 & i34) + (i34 | i33);
                        a = i35 % 128;
                        int i36 = i35 % 2;
                    }
                } else {
                    int i37 = i16 + 99;
                    b = i37 % 128;
                    int i38 = i37 % 2;
                    c0055l.c.co(i, 2);
                    int i39 = b;
                    int i40 = ((i39 ^ 28) + ((i39 & 28) << 1)) - 1;
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = 0;
                    int iBZ = 0;
                    while (i42 < list.size()) {
                        int i43 = a;
                        int i44 = ((i43 | 9) << 1) - (((~i43) & 9) | (i43 & (-10)));
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        long jLongValue = list.get(i42).longValue();
                        int i46 = b;
                        int i47 = i46 & 99;
                        int i48 = -(-((i46 ^ 99) | i47));
                        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                        a = i49 % 128;
                        if (i49 % 2 == 0) {
                            iBZ %= AbstractC0064u.bZ(jLongValue);
                            i42 += 91;
                        } else {
                            int i50 = -(-AbstractC0064u.bZ(jLongValue));
                            int i51 = iBZ & i50;
                            int i52 = ((((iBZ ^ i50) | i51) << 1) - (~(-((iBZ | i50) & (~i51))))) - 1;
                            int i53 = i42 & 1;
                            i42 = (i53 - (~(-(-((i42 ^ 1) | i53))))) - 1;
                            iBZ = i52;
                        }
                        int i54 = a;
                        int i55 = ((i54 & 18) + (i54 | 18)) - 1;
                        b = i55 % 128;
                        int i56 = i55 % 2;
                    }
                    c0055l.c.cp(iBZ);
                    int i57 = a;
                    int i58 = (i57 & (-94)) | ((~i57) & 93);
                    int i59 = (i57 & 93) << 1;
                    int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    while (i17 < list.size()) {
                        int i62 = a;
                        int i63 = (i62 | 39) << 1;
                        int i64 = -(i62 ^ 39);
                        int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                        b = i65 % 128;
                        int i66 = i65 % 2;
                        AbstractC0064u abstractC0064u2 = c0055l.c;
                        long jLongValue2 = list.get(i17).longValue();
                        int i67 = a;
                        int i68 = i67 & 85;
                        int i69 = ((((i67 ^ 85) | i68) << 1) - (~(-((i67 | 85) & (~i68))))) - 1;
                        b = i69 % 128;
                        int i70 = i69 % 2;
                        abstractC0064u2.cs(jLongValue2);
                        int i71 = i17 & 1;
                        i17 = i71 + ((i17 ^ 1) | i71);
                        int i72 = b;
                        int i73 = ((i72 ^ 62) + ((i72 & 62) << 1)) - 1;
                        a = i73 % 128;
                        int i74 = i73 % 2;
                    }
                }
            }
        }
        int i75 = b;
        int i76 = i75 & 91;
        int i77 = -(-((i75 ^ 91) | i76));
        int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
        a = i78 % 128;
        int i79 = i78 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb A[SYNTHETIC] */
    public static <UT, UB> UB A(int i, List<Integer> list, R.bkH bkh, UB ub, o00O00<UT, UB> o00o00) {
        int size;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 & 61) + (i5 | 61);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = 0;
        if (bkh == null) {
            int i10 = (i7 | 87) << 1;
            int i11 = -(i7 ^ 87);
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            int i15 = i13 & 87;
            int i16 = (((i13 ^ 87) | i15) << 1) - ((i13 | 87) & (~i15));
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 48 / 0;
            }
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            int i18 = b;
            int i19 = ((i18 & 56) + (i18 | 56)) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
            while (it.hasNext()) {
                int i21 = a + 81;
                b = i21 % 128;
                int i22 = i21 % 2;
                int iIntValue = it.next().intValue();
                int i23 = a;
                int i24 = ((i23 ^ 23) | (i23 & 23)) << 1;
                int i25 = -(((~i23) & 23) | (i23 & (-24)));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 89 / 0;
                    if (bkh.b(iIntValue)) {
                        continue;
                    } else {
                        if (ub == null) {
                            int i28 = a;
                            int i29 = (i28 & 19) + (i28 | 19);
                            b = i29 % 128;
                            int i30 = i29 % 2;
                            ub = (UB) o00o00.p();
                            int i31 = a;
                            int i32 = (-2) - ((((i31 | 52) << 1) - (i31 ^ 52)) ^ (-1));
                            b = i32 % 128;
                            int i33 = i32 % 2;
                        }
                        o00o00.i(ub, i, iIntValue);
                        i3 = a + 83;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            it.remove();
                            throw null;
                        }
                        it.remove();
                    }
                } else if (bkh.b(iIntValue)) {
                    continue;
                } else {
                    if (ub == null) {
                        int i210 = a;
                        int i211 = (i210 & 19) + (i210 | 19);
                        b = i211 % 128;
                        int i34 = i211 % 2;
                        ub = (UB) o00o00.p();
                        int i35 = a;
                        int i36 = (-2) - ((((i35 | 52) << 1) - (i35 ^ 52)) ^ (-1));
                        b = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    o00o00.i(ub, i, iIntValue);
                    i3 = a + 83;
                    b = i3 % 128;
                    if (i3 % 2 == 0) {
                        it.remove();
                        throw null;
                    }
                    it.remove();
                }
            }
        } else {
            int i38 = i7 & 99;
            int i39 = ((i7 | 99) & (~i38)) + (i38 << 1);
            a = i39 % 128;
            if (i39 % 2 == 0) {
                size = list.size();
                i2 = 1;
            } else {
                size = list.size();
                i2 = 0;
            }
            while (i2 < size) {
                int i40 = a;
                int i41 = (i40 ^ 3) + ((i40 & 3) << 1);
                b = i41 % 128;
                int i42 = i41 % 2;
                Integer num = list.get(i2);
                int i43 = a;
                int i44 = (((i43 ^ 93) | (i43 & 93)) << 1) - (((~i43) & 93) | (i43 & (-94)));
                b = i44 % 128;
                int i45 = i44 % 2;
                int iIntValue2 = num.intValue();
                if (!bkh.b(iIntValue2)) {
                    if (ub == null) {
                        int i46 = b;
                        int i47 = ((i46 | 9) << 1) - (i46 ^ 9);
                        a = i47 % 128;
                        int i48 = i47 % 2;
                        ub = (UB) o00o00.p();
                        int i49 = b;
                        int i50 = ((i49 ^ 112) + ((i49 & 112) << 1)) - 1;
                        a = i50 % 128;
                        int i51 = i50 % 2;
                    }
                    o00o00.i(ub, i, iIntValue2);
                    int i52 = b;
                    int i53 = i52 & 35;
                    int i54 = -(-(i52 | 35));
                    int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                    a = i55 % 128;
                    if (i55 % 2 == 0) {
                        throw null;
                    }
                    int i56 = ((i52 | 121) << 1) - (i52 ^ 121);
                    a = i56 % 128;
                    int i57 = i56 % 2;
                } else {
                    int i58 = b;
                    int i59 = i58 & 113;
                    int i60 = (~i59) & (i58 | 113);
                    int i61 = i59 << 1;
                    int i62 = (i60 & i61) + (i61 | i60);
                    a = i62 % 128;
                    int i63 = i62 % 2;
                    if (i2 != i9) {
                        int i64 = ((i58 & 50) + (i58 | 50)) - 1;
                        a = i64 % 128;
                        int i65 = i64 % 2;
                        list.set(i9, Integer.valueOf(iIntValue2));
                        int i66 = a;
                        int i67 = (i66 ^ 53) + ((i66 & 53) << 1);
                        b = i67 % 128;
                        int i68 = i67 % 2;
                    }
                    int i69 = i9 & 98;
                    int i70 = (i9 | 98) & (~i69);
                    int i71 = -(-(i69 << 1));
                    int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                    int i73 = i72 ^ (-97);
                    int i74 = ((i72 & (-97)) | i73) << 1;
                    int i75 = -i73;
                    int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                    int i77 = a;
                    int i78 = i77 & 29;
                    int i79 = (i77 | 29) & (~i78);
                    int i80 = -(-(i78 << 1));
                    int i81 = (i79 & i80) + (i79 | i80);
                    b = i81 % 128;
                    int i82 = i81 % 2;
                    i9 = i76;
                }
                i2++;
                int i83 = a + 75;
                b = i83 % 128;
                int i84 = i83 % 2;
            }
            if (i9 != size) {
                int i85 = b;
                int i86 = (i85 ^ 45) + ((i85 & 45) << 1);
                a = i86 % 128;
                if (i86 % 2 == 0) {
                    list.subList(i9, size).clear();
                    throw null;
                }
                list.subList(i9, size).clear();
                int i87 = b;
                int i88 = ((i87 | 55) << 1) - (i87 ^ 55);
                a = i88 % 128;
                int i89 = i88 % 2;
            }
        }
        int i90 = a;
        int i91 = i90 ^ 41;
        int i92 = ((i90 & 41) | i91) << 1;
        int i93 = -i91;
        int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
        b = i94 % 128;
        int i95 = i94 % 2;
        return ub;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e A[LOOP:0: B:13:0x003e->B:20:0x008e, LOOP_START, PHI: r2
  0x003e: PHI (r2v2 int) = (r2v1 int), (r2v6 int) binds: [B:12:0x003c, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x014c  */
    /* JADX WARN: Code duplicated, block: B:38:0x015f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:42:0x0183  */
    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static void G(int i, List<Long> list, InterfaceC0051g interfaceC0051g, boolean z) {
        C0055l c0055l;
        int i2;
        AbstractC0064u abstractC0064u;
        int i3;
        int i4;
        int i5;
        int i6;
        AbstractC0064u abstractC0064u2;
        Long l;
        int i7;
        int i8;
        int i9;
        int i10;
        AbstractC0064u abstractC0064u3;
        Long l2;
        int i11;
        int i12;
        int i13 = 2 % 2;
        int i14 = a + 101;
        b = i14 % 128;
        int i15 = 0;
        if (i14 % 2 != 0) {
            int i16 = 45 / 0;
            if (list != null) {
                if (!list.isEmpty()) {
                    int i17 = b;
                    int i18 = (i17 | 49) << 1;
                    int i19 = -(((~i17) & 49) | (i17 & (-50)));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    c0055l = (C0055l) interfaceC0051g;
                    Objects.requireNonNull(c0055l);
                    if (!z) {
                        while (i15 < list.size()) {
                            int i22 = a;
                            int i23 = ((i22 | 27) << 1) - (i22 ^ 27);
                            b = i23 % 128;
                            int i24 = i23 % 2;
                            abstractC0064u3 = c0055l.c;
                            l2 = list.get(i15);
                            i11 = b + 115;
                            a = i11 % 128;
                            if (i11 % 2 == 0) {
                                abstractC0064u3.cg(i, l2.longValue());
                                i12 = ((i15 & 4) + (i15 | 4)) - 1;
                            } else {
                                abstractC0064u3.cg(i, l2.longValue());
                                int i25 = i15 & 75;
                                int i26 = -(-((i15 ^ 75) | i25));
                                i12 = (-2) - ((((i25 ^ i26) + ((i25 & i26) << 1)) - 73) ^ (-1));
                            }
                            i15 = i12;
                            int i27 = b;
                            int i28 = (i27 & 115) + (i27 | 115);
                            a = i28 % 128;
                            int i29 = i28 % 2;
                        }
                    } else {
                        int i30 = a;
                        int i31 = i30 & 107;
                        int i32 = (i30 | 107) & (~i31);
                        int i33 = -(-(i31 << 1));
                        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                        b = i34 % 128;
                        i2 = i34 % 2;
                        abstractC0064u = c0055l.c;
                        if (i2 != 0) {
                            abstractC0064u.co(i, 5);
                            i3 = 1;
                        } else {
                            abstractC0064u.co(i, 2);
                            i3 = 0;
                        }
                        i4 = 0;
                        while (i3 < list.size()) {
                            i10 = a + 111;
                            b = i10 % 128;
                            if (i10 % 2 != 0) {
                                list.get(i3);
                                Logger logger = AbstractC0064u.d;
                                int i35 = 70 / 0;
                            } else {
                                list.get(i3);
                                Logger logger2 = AbstractC0064u.d;
                            }
                            int i36 = a;
                            int i37 = ((((i36 ^ 77) | (i36 & 77)) << 1) - (~(-((i36 & (-78)) | ((~i36) & 77))))) - 1;
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            int i39 = i4 & 8;
                            int i40 = -(-((i4 ^ 8) | i39));
                            i4 = ((i39 | i40) << 1) - (i40 ^ i39);
                            int i41 = (((i3 & 28) | ((~i3) & (-29))) - (~((i3 & (-29)) << 1))) - 1;
                            i3 = ((i41 ^ 31) + ((i41 & 31) << 1)) - 1;
                            int i42 = i36 & 17;
                            int i43 = ((i36 ^ 17) | i42) << 1;
                            int i44 = -((i36 | 17) & (~i42));
                            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                            b = i45 % 128;
                            int i46 = i45 % 2;
                        }
                        c0055l.c.cp(i4);
                        int i47 = b;
                        int i48 = (i47 ^ 103) + ((i47 & 103) << 1);
                        a = i48 % 128;
                        int i49 = i48 % 2;
                        i5 = 0;
                        while (i5 < list.size()) {
                            int i50 = a;
                            i6 = ((i50 ^ 95) - (~(-(-((i50 & 95) << 1))))) - 1;
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                abstractC0064u2 = c0055l.c;
                                l = list.get(i5);
                                int i51 = 54 / 0;
                            } else {
                                abstractC0064u2 = c0055l.c;
                                l = list.get(i5);
                            }
                            int i52 = a;
                            int i53 = i52 & 73;
                            int i54 = -(-((i52 ^ 73) | i53));
                            i7 = (i53 & i54) + (i54 | i53);
                            b = i7 % 128;
                            if (i7 % 2 != 0) {
                                abstractC0064u2.cj(l.longValue());
                                int i55 = 81 / 0;
                            } else {
                                abstractC0064u2.cj(l.longValue());
                            }
                            i8 = a + 47;
                            int i56 = i8 % 128;
                            b = i56;
                            if (i8 % 2 != 0) {
                                i9 = (i5 ^ 28) + ((i5 & 28) << 1);
                            } else {
                                int i57 = i5 & 1;
                                i9 = (((i5 ^ 1) | i57) << 1) - ((i5 | 1) & (~i57));
                            }
                            i5 = i9;
                            int i58 = i56 & 109;
                            int i59 = (i56 | 109) & (~i58);
                            int i60 = i58 << 1;
                            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                            a = i61 % 128;
                            int i62 = i61 % 2;
                        }
                    }
                }
            }
        } else if (list != null) {
            if (!list.isEmpty()) {
                int i110 = b;
                int i111 = (i110 | 49) << 1;
                int i112 = -(((~i110) & 49) | (i110 & (-50)));
                int i210 = ((i111 | i112) << 1) - (i112 ^ i111);
                a = i210 % 128;
                int i211 = i210 % 2;
                c0055l = (C0055l) interfaceC0051g;
                Objects.requireNonNull(c0055l);
                if (!z) {
                    while (i15 < list.size()) {
                        int i212 = a;
                        int i213 = ((i212 | 27) << 1) - (i212 ^ 27);
                        b = i213 % 128;
                        int i214 = i213 % 2;
                        abstractC0064u3 = c0055l.c;
                        l2 = list.get(i15);
                        i11 = b + 115;
                        a = i11 % 128;
                        if (i11 % 2 == 0) {
                            abstractC0064u3.cg(i, l2.longValue());
                            i12 = ((i15 & 4) + (i15 | 4)) - 1;
                        } else {
                            abstractC0064u3.cg(i, l2.longValue());
                            int i215 = i15 & 75;
                            int i216 = -(-((i15 ^ 75) | i215));
                            i12 = (-2) - ((((i215 ^ i216) + ((i215 & i216) << 1)) - 73) ^ (-1));
                        }
                        i15 = i12;
                        int i217 = b;
                        int i218 = (i217 & 115) + (i217 | 115);
                        a = i218 % 128;
                        int i219 = i218 % 2;
                    }
                } else {
                    int i310 = a;
                    int i311 = i310 & 107;
                    int i312 = (i310 | 107) & (~i311);
                    int i313 = -(-(i311 << 1));
                    int i314 = ((i312 | i313) << 1) - (i312 ^ i313);
                    b = i314 % 128;
                    i2 = i314 % 2;
                    abstractC0064u = c0055l.c;
                    if (i2 != 0) {
                        abstractC0064u.co(i, 5);
                        i3 = 1;
                    } else {
                        abstractC0064u.co(i, 2);
                        i3 = 0;
                    }
                    i4 = 0;
                    while (i3 < list.size()) {
                        i10 = a + 111;
                        b = i10 % 128;
                        if (i10 % 2 != 0) {
                            list.get(i3);
                            Logger logger3 = AbstractC0064u.d;
                            int i315 = 70 / 0;
                        } else {
                            list.get(i3);
                            Logger logger4 = AbstractC0064u.d;
                        }
                        int i316 = a;
                        int i317 = ((((i316 ^ 77) | (i316 & 77)) << 1) - (~(-((i316 & (-78)) | ((~i316) & 77))))) - 1;
                        b = i317 % 128;
                        int i318 = i317 % 2;
                        int i319 = i4 & 8;
                        int i410 = -(-((i4 ^ 8) | i319));
                        i4 = ((i319 | i410) << 1) - (i410 ^ i319);
                        int i411 = (((i3 & 28) | ((~i3) & (-29))) - (~((i3 & (-29)) << 1))) - 1;
                        i3 = ((i411 ^ 31) + ((i411 & 31) << 1)) - 1;
                        int i412 = i316 & 17;
                        int i413 = ((i316 ^ 17) | i412) << 1;
                        int i414 = -((i316 | 17) & (~i412));
                        int i415 = (i413 ^ i414) + ((i414 & i413) << 1);
                        b = i415 % 128;
                        int i416 = i415 % 2;
                    }
                    c0055l.c.cp(i4);
                    int i417 = b;
                    int i418 = (i417 ^ 103) + ((i417 & 103) << 1);
                    a = i418 % 128;
                    int i419 = i418 % 2;
                    i5 = 0;
                    while (i5 < list.size()) {
                        int i510 = a;
                        i6 = ((i510 ^ 95) - (~(-(-((i510 & 95) << 1))))) - 1;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            abstractC0064u2 = c0055l.c;
                            l = list.get(i5);
                            int i511 = 54 / 0;
                        } else {
                            abstractC0064u2 = c0055l.c;
                            l = list.get(i5);
                        }
                        int i512 = a;
                        int i513 = i512 & 73;
                        int i514 = -(-((i512 ^ 73) | i513));
                        i7 = (i513 & i514) + (i514 | i513);
                        b = i7 % 128;
                        if (i7 % 2 != 0) {
                            abstractC0064u2.cj(l.longValue());
                            int i515 = 81 / 0;
                        } else {
                            abstractC0064u2.cj(l.longValue());
                        }
                        i8 = a + 47;
                        int i516 = i8 % 128;
                        b = i516;
                        if (i8 % 2 != 0) {
                            i9 = (i5 ^ 28) + ((i5 & 28) << 1);
                        } else {
                            int i517 = i5 & 1;
                            i9 = (((i5 ^ 1) | i517) << 1) - ((i5 | 1) & (~i517));
                        }
                        i5 = i9;
                        int i518 = i516 & 109;
                        int i519 = (i516 | 109) & (~i518);
                        int i63 = i518 << 1;
                        int i64 = (i519 ^ i63) + ((i63 & i519) << 1);
                        a = i64 % 128;
                        int i65 = i64 % 2;
                    }
                }
            }
        }
        int i66 = b;
        int i67 = (i66 | 117) << 1;
        int i68 = -(((~i66) & 117) | (i66 & (-118)));
        int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
        a = i69 % 128;
        if (i69 % 2 == 0) {
            throw null;
        }
    }

    public static void U(int i, List<String> list, InterfaceC0051g interfaceC0051g) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 41;
        int i5 = (i3 & 41) << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (list != null && (!list.isEmpty())) {
            int i7 = a;
            int i8 = i7 & 19;
            int i9 = -(-((i7 ^ 19) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            C0055l c0055l = (C0055l) interfaceC0051g;
            Objects.requireNonNull(c0055l);
            boolean z = list instanceof InterfaceC0062s;
            int i12 = a;
            int i13 = (i12 & 69) + (i12 | 69);
            b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            if (z) {
                int i16 = ((i12 & 64) + (i12 | 64)) - 1;
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                InterfaceC0062s interfaceC0062s = (InterfaceC0062s) list;
                int i19 = i17 & 19;
                int i20 = (i17 ^ 19) | i19;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i21 % 128;
                while (true) {
                    int i22 = i21 % 2;
                    if (i15 >= list.size()) {
                        break;
                    }
                    int i23 = a;
                    int i24 = i23 & 85;
                    int i25 = -(-((i23 ^ 85) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        boolean z2 = interfaceC0062s.d(i15) instanceof String;
                        throw null;
                    }
                    Object objD = interfaceC0062s.d(i15);
                    if (objD instanceof String) {
                        c0055l.c.cm(i, (String) objD);
                        int i27 = a;
                        int i28 = (((i27 ^ 123) | (i27 & 123)) << 1) - (((~i27) & 123) | (i27 & (-124)));
                        b = i28 % 128;
                        int i29 = i28 % 2;
                    } else {
                        c0055l.c.cc(i, (AbstractC0069z) objD);
                        int i30 = b;
                        int i31 = ((i30 ^ 99) | (i30 & 99)) << 1;
                        int i32 = -(((~i30) & 99) | (i30 & (-100)));
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        a = i33 % 128;
                        int i34 = i33 % 2;
                    }
                    i15 = ((i15 & 1) << 1) + (i15 ^ 1);
                    int i35 = b;
                    int i36 = i35 ^ 77;
                    int i37 = (i35 & 77) << 1;
                    i21 = ((i36 | i37) << 1) - (i37 ^ i36);
                    a = i21 % 128;
                }
            } else {
                while (i15 < list.size()) {
                    int i38 = a;
                    int i39 = i38 & 55;
                    int i40 = i39 + ((i38 ^ 55) | i39);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    AbstractC0064u abstractC0064u = c0055l.c;
                    String str = list.get(i15);
                    int i42 = a;
                    int i43 = i42 & 65;
                    int i44 = (((i42 ^ 65) | i43) << 1) - ((i42 | 65) & (~i43));
                    b = i44 % 128;
                    if (i44 % 2 != 0) {
                        abstractC0064u.cm(i, str);
                        int i45 = ((i15 & 135) + (i15 | 135)) - 1;
                        int i46 = i45 & (-35);
                        int i47 = (i45 ^ (-35)) | i46;
                        i15 = ((i46 | i47) << 1) - (i47 ^ i46);
                    } else {
                        abstractC0064u.cm(i, str);
                        int i48 = ((i15 ^ (-32)) + ((i15 & (-32)) << 1)) - 1;
                        int i49 = i48 & 34;
                        i15 = ((((i48 ^ 34) | i49) << 1) - (~(-((i48 | 34) & (~i49))))) - 1;
                    }
                    int i50 = a;
                    int i51 = i50 & 85;
                    int i52 = (((i50 | 85) & (~i51)) - (~(-(-(i51 << 1))))) - 1;
                    b = i52 % 128;
                    int i53 = i52 % 2;
                }
            }
        }
        int i54 = b;
        int i55 = i54 & 51;
        int i56 = i54 | 51;
        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
        a = i57 % 128;
        if (i57 % 2 == 0) {
            throw null;
        }
    }
}
