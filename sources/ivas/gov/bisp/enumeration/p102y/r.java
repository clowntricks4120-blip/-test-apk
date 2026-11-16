package ivas.gov.bisp.enumeration.p102y;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.o000O0o.o00000O0;
import ivas.gov.bisp.enumeration.p034bg.c;
import ivas.gov.bisp.enumeration.p035bh.InterfaceC0147y;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static int a = 0;
    private static int b = 1;
    public final Map<Type, o00000O0<?>> c;
    public final c d = c.c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class blj<T> implements o0OoOo0<T> {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ InterfaceC0147y c;
        public final /* synthetic */ Type d;

        public blj(r rVar, InterfaceC0147y interfaceC0147y, Type type) {
            this.c = interfaceC0147y;
            this.d = type;
        }

        public T d() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 115) + (i2 | 115);
            b = i3 % 128;
            int i4 = i3 % 2;
            T t = (T) this.c.b(this.d);
            int i5 = a;
            int i6 = (i5 & 15) + (i5 | 15);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return t;
            }
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class blk<T> implements o0OoOo0<T> {
        private static int a = 1;
        private static int b;
        public final /* synthetic */ InterfaceC0147y c;
        public final /* synthetic */ Type d;

        public blk(r rVar, InterfaceC0147y interfaceC0147y, Type type) {
            this.c = interfaceC0147y;
            this.d = type;
        }

        public T d() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 36) + ((i2 & 36) << 1)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                this.c.b(this.d);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            T t = (T) this.c.b(this.d);
            int i4 = b;
            int i5 = i4 & 125;
            int i6 = -(-((i4 ^ 125) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            return t;
        }
    }

    public r(Map<Type, o00000O0<?>> map) {
        this.c = map;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 69;
        int i4 = ((i2 & 69) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        String string = this.c.toString();
        int i8 = a;
        int i9 = (((i8 | 94) << 1) - (i8 ^ 94)) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    /* JADX WARN: Code duplicated, block: B:45:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0172  */
    /* JADX WARN: Code duplicated, block: B:51:0x018b  */
    public final <T> o0OoOo0<T> c(TypeToken<T> typeToken) {
        e eVar;
        o0OoOo0<T> rVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        Type type = typeToken.b;
        Class<? super T> cls = typeToken.a;
        Map<Type, o00000O0<?>> map = this.c;
        int i5 = a;
        int i6 = i5 & 65;
        int i7 = -(-((i5 ^ 65) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        o0OoOo0<T> iVar = null;
        if (i8 % 2 == 0) {
            map.get(type);
            throw null;
        }
        InterfaceC0147y interfaceC0147y = map.get(type);
        if (interfaceC0147y != null) {
            blj bljVar = new blj(this, interfaceC0147y, type);
            int i9 = b;
            int i10 = (i9 ^ 13) + ((i9 & 13) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 90 / 0;
            }
            return bljVar;
        }
        InterfaceC0147y interfaceC0147y2 = this.c.get(cls);
        if (interfaceC0147y2 != null) {
            blk blkVar = new blk(this, interfaceC0147y2, type);
            int i12 = a + 29;
            b = i12 % 128;
            int i13 = i12 % 2;
            return blkVar;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            int i14 = a + 63;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                declaredConstructor.isAccessible();
                throw null;
            }
            if (!declaredConstructor.isAccessible()) {
                int i15 = a;
                int i16 = (i15 ^ 91) + ((i15 & 91) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                this.d.c(declaredConstructor);
                int i18 = a;
                int i19 = i18 & 25;
                int i20 = -(-((i18 ^ 25) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            eVar = new e(this, declaredConstructor);
            int i23 = a;
            int i24 = ((i23 | 79) << 1) - (i23 ^ 79);
            b = i24 % 128;
            int i25 = i24 % 2;
            if (eVar != null) {
                int i26 = b;
                int i27 = i26 ^ 93;
                int i28 = (i26 & 93) << 1;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                a = i29 % 128;
                int i30 = i29 % 2;
                int i31 = i26 & 97;
                int i32 = ((i26 | 97) & (~i31)) + (i31 << 1);
                a = i32 % 128;
                int i33 = i32 % 2;
                return eVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                int i34 = b;
                int i35 = (i34 & (-52)) | ((~i34) & 51);
                int i36 = -(-((i34 & 51) << 1));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                a = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = 40 / 0;
                    if (SortedSet.class.isAssignableFrom(cls)) {
                        iVar = new i(this);
                        int i39 = b + 111;
                        a = i39 % 128;
                        int i40 = i39 % 2;
                    } else if (EnumSet.class.isAssignableFrom(cls)) {
                        iVar = new C0331p(this, type);
                        int i41 = b;
                        int i42 = ((i41 & 8) + (i41 | 8)) - 1;
                        a = i42 % 128;
                        int i43 = i42 % 2;
                    } else if (Set.class.isAssignableFrom(cls)) {
                        iVar = new z(this);
                        int i44 = b;
                        int i45 = (i44 & 32) + (i44 | 32);
                        int i46 = (i45 ^ (-1)) + (i45 << 1);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                    } else if (Queue.class.isAssignableFrom(cls)) {
                        iVar = new P(this);
                        int i48 = a;
                        int i49 = (-2) - ((((i48 | 52) << 1) - (i48 ^ 52)) ^ (-1));
                        b = i49 % 128;
                        int i50 = i49 % 2;
                    } else {
                        iVar = new t(this);
                        int i51 = a;
                        int i52 = ((i51 & 12) + (i51 | 12)) - 1;
                        b = i52 % 128;
                        int i53 = i52 % 2;
                    }
                } else if (SortedSet.class.isAssignableFrom(cls)) {
                    iVar = new i(this);
                    int i310 = b + 111;
                    a = i310 % 128;
                    int i410 = i310 % 2;
                } else if (EnumSet.class.isAssignableFrom(cls)) {
                    iVar = new C0331p(this, type);
                    int i411 = b;
                    int i412 = ((i411 & 8) + (i411 | 8)) - 1;
                    a = i412 % 128;
                    int i413 = i412 % 2;
                } else if (Set.class.isAssignableFrom(cls)) {
                    iVar = new z(this);
                    int i414 = b;
                    int i415 = (i414 & 32) + (i414 | 32);
                    int i416 = (i415 ^ (-1)) + (i415 << 1);
                    a = i416 % 128;
                    int i417 = i416 % 2;
                } else if (Queue.class.isAssignableFrom(cls)) {
                    iVar = new P(this);
                    int i418 = a;
                    int i419 = (-2) - ((((i418 | 52) << 1) - (i418 ^ 52)) ^ (-1));
                    b = i419 % 128;
                    int i54 = i419 % 2;
                } else {
                    iVar = new t(this);
                    int i55 = a;
                    int i56 = ((i55 & 12) + (i55 | 12)) - 1;
                    b = i56 % 128;
                    int i57 = i56 % 2;
                }
            } else if (Map.class.isAssignableFrom(cls)) {
                int i58 = b;
                int i59 = i58 & 33;
                int i60 = -(-((i58 ^ 33) | i59));
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                a = i61 % 128;
                int i62 = i61 % 2;
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    iVar = new u(this);
                    int i63 = b;
                    int i64 = (i63 & 81) + (i63 | 81);
                    a = i64 % 128;
                    int i65 = i64 % 2;
                } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                    iVar = new c(this);
                    int i66 = a;
                    int i67 = ((i66 | 103) << 1) - (i66 ^ 103);
                    b = i67 % 128;
                    int i68 = i67 % 2;
                } else {
                    if (SortedMap.class.isAssignableFrom(cls)) {
                        rVar = new ivas.gov.bisp.enumeration.p100w.r(this);
                        int i69 = a;
                        int i70 = ((i69 & (-8)) | ((~i69) & 7)) + ((7 & i69) << 1);
                        b = i70 % 128;
                        int i71 = i70 % 2;
                    } else {
                        if (type instanceof ParameterizedType) {
                            TypeToken typeToken2 = new TypeToken(((ParameterizedType) type).getActualTypeArguments()[0]);
                            int i72 = a + 63;
                            b = i72 % 128;
                            int i73 = i72 % 2;
                            if (!String.class.isAssignableFrom(typeToken2.a)) {
                                rVar = new ivas.gov.bisp.enumeration.O.r(this);
                                int i74 = b;
                                int i75 = ((i74 | 7) << 1) - (7 ^ i74);
                                a = i75 % 128;
                                int i76 = i75 % 2;
                            }
                        }
                        iVar = new i(this);
                        int i77 = b;
                        int i78 = i77 & 123;
                        int i79 = ((i77 ^ 123) | i78) << 1;
                        int i80 = -((i77 | 123) & (~i78));
                        int i81 = (i79 & i80) + (i80 | i79);
                        a = i81 % 128;
                        int i82 = i81 % 2;
                    }
                    iVar = rVar;
                }
            }
            if (iVar == null) {
                h hVar = new h(this, cls, type);
                int i83 = b;
                int i84 = ((((i83 ^ 47) | (i83 & 47)) << 1) - (~(-(((~i83) & 47) | (i83 & (-48)))))) - 1;
                a = i84 % 128;
                int i85 = i84 % 2;
                return hVar;
            }
            int i86 = b;
            int i87 = i86 ^ 49;
            int i88 = ((i86 & 49) | i87) << 1;
            int i89 = -i87;
            int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
            int i91 = i90 % 128;
            a = i91;
            int i92 = i90 % 2;
            int i93 = i91 & 29;
            int i94 = -(-((i91 ^ 29) | i93));
            int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
            b = i95 % 128;
            int i96 = i95 % 2;
            return iVar;
        } catch (NoSuchMethodException unused) {
            eVar = null;
        }
    }
}
