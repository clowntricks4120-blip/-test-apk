package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o000OOo0;
import ivas.gov.bisp.enumeration.o000O000.o00O00;
import ivas.gov.bisp.enumeration.o000O000.o0OoOo0;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046b {
    private static int a = 1;
    private static int b;
    public static final C0046b c = new C0046b();
    public final ConcurrentMap<Class<?>, o000OOo0<?>> e = new ConcurrentHashMap();
    public final aj d = new al();

    static {
        int i = a;
        int i2 = i & 67;
        int i3 = i2 + ((i ^ 67) | i2);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public final <T> o000OOo0<T> d(T t) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = (i2 ^ 63) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        Class<?> cls = t.getClass();
        if (i6 != 0) {
            c(cls);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ah ahVarC = c(cls);
        int i7 = a;
        int i8 = ((i7 | 102) << 1) - (i7 ^ 102);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return ahVarC;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0132  */
    /* JADX WARN: Code duplicated, block: B:32:0x0136  */
    /* JADX WARN: Code duplicated, block: B:34:0x013c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0162  */
    public final <T> o000OOo0<T> c(Class<T> cls) {
        boolean z;
        X x;
        boolean z2;
        ai aiVar;
        AbstractC0068y abstractC0068y;
        o00O00<?, ?> o00o00;
        o00O00<?, ?> o00o01;
        o0OoOo0<?> o0oooo0;
        E e;
        int i;
        Object obj = null;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 109;
        int i5 = (i4 - (~(-(-((i3 ^ 109) | i4))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        Charset charset = R.c;
        Objects.requireNonNull(cls, "messageType");
        ConcurrentMap<Class<?>, o000OOo0<?>> concurrentMap = this.e;
        int i7 = a;
        int i8 = i7 & 9;
        int i9 = (i7 | 9) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        ah ahVarK = concurrentMap.get(cls);
        if (ahVarK == null) {
            int i13 = b;
            int i14 = (((i13 | 110) << 1) - (i13 ^ 110)) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            al alVar = (al) this.d;
            Objects.requireNonNull(alVar);
            int i16 = a;
            int i17 = ((i16 ^ 63) | (i16 & 63)) << 1;
            int i18 = -(((~i16) & 63) | (i16 & (-64)));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            Class<?> cls2 = ak.c;
            if (!S.class.isAssignableFrom(cls)) {
                int i21 = a;
                int i22 = i21 & 27;
                int i23 = ((i21 | 27) & (~i22)) + (i22 << 1);
                b = i23 % 128;
                int i24 = i23 % 2;
                Class<?> cls3 = ak.c;
                if (cls3 != null) {
                    int i25 = b;
                    int i26 = i25 & 45;
                    int i27 = (i26 - (~(-(-((i25 ^ 45) | i26))))) - 1;
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        cls3.isAssignableFrom(cls);
                        obj.hashCode();
                        throw null;
                    }
                    if (!cls3.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    }
                }
            }
            Z zE = alVar.d.e(cls);
            int i28 = b + 109;
            a = i28 % 128;
            int i29 = i28 % 2;
            if (zE.c()) {
                int i30 = a;
                int i31 = (i30 | 71) << 1;
                int i32 = -(i30 ^ 71);
                int i33 = (i31 & i32) + (i32 | i31);
                b = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 37 / 0;
                    if (!S.class.isAssignableFrom(cls)) {
                        o00o01 = ak.d;
                        o0oooo0 = N.d;
                        if (o0oooo0 != null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        e = new E(o00o01, o0oooo0, zE.e());
                        int i35 = a;
                        int i36 = i35 & 105;
                        int i37 = -(-((i35 ^ 105) | i36));
                        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        int i40 = i35 + 79;
                        b = i40 % 128;
                        int i41 = i40 % 2;
                    } else {
                        int i42 = a;
                        int i43 = i42 & 69;
                        int i44 = ((i42 | 69) & (~i43)) + (i43 << 1);
                        b = i44 % 128;
                        int i45 = i44 % 2;
                        o00O00<?, ?> o00o02 = ak.f;
                        o0OoOo0<?> o0oooo1 = N.c;
                        e = new E(o00o02, N.c, zE.e());
                        int i46 = a;
                        int i47 = ((i46 ^ 53) | (i46 & 53)) << 1;
                        int i48 = -(((~i46) & 53) | (i46 & (-54)));
                        i = ((i47 | i48) << 1) - (i48 ^ i47);
                        b = i % 128;
                        if (i % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                    }
                } else if (S.class.isAssignableFrom(cls)) {
                    int i49 = a;
                    int i410 = i49 & 69;
                    int i411 = ((i49 | 69) & (~i410)) + (i410 << 1);
                    b = i411 % 128;
                    int i412 = i411 % 2;
                    o00O00<?, ?> o00o03 = ak.f;
                    o0OoOo0<?> o0oooo2 = N.c;
                    e = new E(o00o03, N.c, zE.e());
                    int i413 = a;
                    int i414 = ((i413 ^ 53) | (i413 & 53)) << 1;
                    int i415 = -(((~i413) & 53) | (i413 & (-54)));
                    i = ((i414 | i415) << 1) - (i415 ^ i414);
                    b = i % 128;
                    if (i % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    o00o01 = ak.d;
                    o0oooo0 = N.d;
                    if (o0oooo0 != null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    e = new E(o00o01, o0oooo0, zE.e());
                    int i310 = a;
                    int i311 = i310 & 105;
                    int i312 = -(-((i310 ^ 105) | i311));
                    int i313 = (i311 ^ i312) + ((i311 & i312) << 1);
                    b = i313 % 128;
                    int i314 = i313 % 2;
                    int i416 = i310 + 79;
                    b = i416 % 128;
                    int i417 = i416 % 2;
                }
                ahVarK = e;
            } else if (S.class.isAssignableFrom(cls)) {
                int i50 = b;
                int i51 = (((i50 | 52) << 1) - (i50 ^ 52)) - 1;
                a = i51 % 128;
                int i52 = i51 % 2;
                if (zE.b() == 1) {
                    int i53 = a;
                    int i54 = ((i53 ^ 12) + ((i53 & 12) << 1)) - 1;
                    int i55 = i54 % 128;
                    b = i55;
                    int i56 = i54 % 2;
                    int i57 = i55 & 103;
                    int i58 = -(-(i55 | 103));
                    int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                    a = i59 % 128;
                    int i60 = i59 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i61 = b;
                    int i62 = i61 & 95;
                    int i63 = (i61 | 95) & (~i62);
                    int i64 = i62 << 1;
                    int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                    a = i65 % 128;
                    if (i65 % 2 == 0) {
                        aiVar = F.d;
                        abstractC0068y = AbstractC0068y.d;
                        o00o00 = ak.f;
                        int i66 = 58 / 0;
                    } else {
                        aiVar = F.d;
                        abstractC0068y = AbstractC0068y.d;
                        o00o00 = ak.f;
                    }
                    ai aiVar2 = aiVar;
                    AbstractC0068y abstractC0068y2 = abstractC0068y;
                    o00O00<?, ?> o00o04 = o00o00;
                    o0OoOo0<?> o0oooo3 = N.c;
                    o0OoOo0<?> o0oooo4 = N.c;
                    int i67 = a;
                    int i68 = ((i67 | 81) << 1) - (i67 ^ 81);
                    b = i68 % 128;
                    int i69 = i68 % 2;
                    X x2 = C0060q.d;
                    int i70 = a;
                    int i71 = (((i70 & (-92)) | ((~i70) & 91)) - (~((i70 & 91) << 1))) - 1;
                    b = i71 % 128;
                    if (i71 % 2 != 0) {
                        ad.k(zE, aiVar2, abstractC0068y2, o00o04, o0oooo4, x2);
                        obj.hashCode();
                        throw null;
                    }
                    ahVarK = ad.k(zE, aiVar2, abstractC0068y2, o00o04, o0oooo4, x2);
                } else {
                    ai aiVar3 = F.d;
                    AbstractC0068y abstractC0068y3 = AbstractC0068y.d;
                    o00O00<?, ?> o00o05 = ak.f;
                    int i72 = b;
                    int i73 = (-2) - (((i72 ^ 22) + ((i72 & 22) << 1)) ^ (-1));
                    a = i73 % 128;
                    if (i73 % 2 == 0) {
                        X x3 = C0060q.d;
                        throw null;
                    }
                    ahVarK = ad.k(zE, aiVar3, abstractC0068y3, o00o05, null, C0060q.d);
                    int i74 = a;
                    int i75 = i74 ^ 41;
                    int i76 = (i74 & 41) << 1;
                    int i77 = (i75 & i76) + (i76 | i75);
                    b = i77 % 128;
                    int i78 = i77 % 2;
                }
            } else {
                if (zE.b() == 1) {
                    int i79 = b;
                    int i80 = i79 + 29;
                    a = i80 % 128;
                    int i81 = i80 % 2;
                    int i82 = i79 & 79;
                    int i83 = i82 + ((i79 ^ 79) | i82);
                    a = i83 % 128;
                    int i84 = i83 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    int i85 = a + 19;
                    b = i85 % 128;
                    int i86 = i85 % 2;
                    ai aiVar4 = F.c;
                    AbstractC0068y abstractC0068y4 = AbstractC0068y.c;
                    o00O00<?, ?> o00o06 = ak.d;
                    o0OoOo0<?> o0oooo5 = N.d;
                    int i87 = a;
                    int i88 = (-2) - ((((i87 | 12) << 1) - (i87 ^ 12)) ^ (-1));
                    b = i88 % 128;
                    int i89 = i88 % 2;
                    if (o0oooo5 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    int i90 = ((((i87 ^ 61) | (i87 & 61)) << 1) - (~(-(((~i87) & 61) | (i87 & (-62)))))) - 1;
                    b = i90 % 128;
                    int i91 = i90 % 2;
                    X x4 = C0060q.c;
                    int i92 = b;
                    int i93 = (i92 ^ 97) + ((i92 & 97) << 1);
                    a = i93 % 128;
                    int i94 = i93 % 2;
                    ahVarK = ad.k(zE, aiVar4, abstractC0068y4, o00o06, o0oooo5, x4);
                    int i95 = b + 9;
                    a = i95 % 128;
                    int i96 = i95 % 2;
                } else {
                    ai aiVar5 = F.c;
                    AbstractC0068y abstractC0068y5 = AbstractC0068y.c;
                    o00O00<?, ?> o00o07 = ak.e;
                    int i97 = b + 15;
                    a = i97 % 128;
                    if (i97 % 2 == 0) {
                        x = C0060q.c;
                        int i98 = 65 / 0;
                    } else {
                        x = C0060q.c;
                    }
                    ahVarK = ad.k(zE, aiVar5, abstractC0068y5, o00o07, null, x);
                    int i99 = a;
                    int i100 = (i99 ^ 9) + ((i99 & 9) << 1);
                    b = i100 % 128;
                    if (i100 % 2 != 0) {
                        int i101 = 3 % 4;
                    }
                }
            }
            ah ahVarPutIfAbsent = this.e.putIfAbsent(cls, ahVarK);
            int i102 = b;
            int i103 = i102 & 61;
            int i104 = (i102 ^ 61) | i103;
            int i105 = (i103 ^ i104) + ((i103 & i104) << 1);
            a = i105 % 128;
            int i106 = i105 % 2;
            ah ahVar = ahVarPutIfAbsent;
            if (ahVar != null) {
                int i107 = (i102 | 3) << 1;
                int i108 = -(i102 ^ 3);
                int i109 = ((i107 | i108) << 1) - (i107 ^ i108);
                int i110 = i109 % 128;
                a = i110;
                int i111 = i109 % 2;
                int i112 = i110 + 69;
                b = i112 % 128;
                int i113 = i112 % 2;
                ahVarK = ahVar;
            }
        }
        int i114 = b + 41;
        a = i114 % 128;
        if (i114 % 2 == 0) {
            int i115 = 24 / 0;
        }
        return ahVarK;
    }
}
