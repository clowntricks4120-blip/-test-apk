package ivas.gov.bisp.enumeration.p050bw;

import com.google.gson.reflect.TypeToken;
import ivas.gov.bisp.enumeration.o000O0O.o0OoOo0;
import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import ivas.gov.bisp.enumeration.p035bh.C;
import ivas.gov.bisp.enumeration.p035bh.C0144q;
import ivas.gov.bisp.enumeration.p035bh.E;
import ivas.gov.bisp.enumeration.p035bh.W;
import ivas.gov.bisp.enumeration.p035bh.X;
import ivas.gov.bisp.enumeration.p035bh.Y;
import ivas.gov.bisp.enumeration.p035bh.Z;
import ivas.gov.bisp.enumeration.p035bh.ad;
import ivas.gov.bisp.enumeration.p035bh.n;
import ivas.gov.bisp.enumeration.p096p.h;
import ivas.gov.bisp.enumeration.p102y.C0328j;
import ivas.gov.bisp.enumeration.p102y.r;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228p implements E {
    private static int a = 0;
    private static int b = 1;
    public final r c;
    public final boolean d;

    public C0228p(r rVar, boolean z) {
        this.c = rVar;
        this.d = z;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bw.p$bsd */
    public final class bsd<K, V> extends o000O000<Map<K, V>> {
        private static int a = 0;
        private static int b = 1;
        public final o000O000<K> c;
        public final o000O000<V> d;
        public final o0OoOo0<? extends Map<K, V>> e;

        public bsd(C c, Type type, o000O000<K> o000o000, Type type2, o000O000<V> o000o001, o0OoOo0<? extends Map<K, V>> o0oooo0) {
            this.c = new o(c, o000o000, type);
            this.d = new o(c, o000o001, type2);
            this.e = o0oooo0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object c(j jVar) {
            int iY;
            int i = 2 % 2;
            int i2 = a + 45;
            b = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0 ? (iY = jVar.y()) != 9 : (iY = jVar.y()) != 123) {
                Map map = (Map) this.e.d();
                int i3 = b;
                int i4 = (i3 & (-92)) | ((~i3) & 91);
                int i5 = (i3 & 91) << 1;
                int i6 = (i4 & i5) + (i4 | i5);
                a = i6 % 128;
                if (i6 % 2 == 0 ? iY != 1 : iY != 1) {
                    jVar.e();
                    int i7 = b;
                    int i8 = ((i7 & 108) + (i7 | 108)) - 1;
                    a = i8 % 128;
                    int i9 = i8 % 2;
                    while (jVar.c()) {
                        int i10 = b;
                        int i11 = i10 & 125;
                        int i12 = -(-((i10 ^ 125) | i11));
                        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                        a = i13 % 128;
                        int i14 = i13 % 2;
                        h.c.aL(jVar);
                        Object objC = this.c.c(jVar);
                        int i15 = a;
                        int i16 = ((i15 ^ 21) - (~(-(-((i15 & 21) << 1))))) - 1;
                        b = i16 % 128;
                        if (i16 % 2 == 0) {
                            this.d.c(jVar);
                            throw null;
                        }
                        Object objC2 = this.d.c(jVar);
                        int i17 = b;
                        int i18 = i17 & 1;
                        int i19 = (i17 | 1) & (~i18);
                        int i20 = -(-(i18 << 1));
                        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        if (map.put(objC, objC2) != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("duplicate key: ");
                            sb.append(objC);
                            throw new X(sb.toString());
                        }
                    }
                    jVar.h();
                    int i23 = b + 101;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    int i25 = i3 + 67;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    jVar.d();
                    int i27 = a;
                    int i28 = (-2) - (((i27 ^ 2) + ((i27 & 2) << 1)) ^ (-1));
                    b = i28 % 128;
                    int i29 = i28 % 2;
                    while (jVar.c()) {
                        int i30 = a;
                        int i31 = ((i30 ^ 37) | (i30 & 37)) << 1;
                        int i32 = -(((~i30) & 37) | (i30 & (-38)));
                        int i33 = (i31 & i32) + (i32 | i31);
                        b = i33 % 128;
                        int i34 = i33 % 2;
                        jVar.d();
                        Object objC3 = this.c.c(jVar);
                        int i35 = a;
                        int i36 = ((i35 | 79) << 1) - (i35 ^ 79);
                        b = i36 % 128;
                        int i37 = i36 % 2;
                        Object objC4 = this.d.c(jVar);
                        int i38 = a;
                        int i39 = (i38 & 65) + (i38 | 65);
                        b = i39 % 128;
                        int i40 = i39 % 2;
                        if (map.put(objC3, objC4) != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("duplicate key: ");
                            sb2.append(objC3);
                            throw new X(sb2.toString());
                        }
                        int i41 = b;
                        int i42 = (i41 & (-12)) | ((~i41) & 11);
                        int i43 = (i41 & 11) << 1;
                        int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                        jVar.i();
                        int i46 = a;
                        int i47 = ((i46 | 93) << 1) - (i46 ^ 93);
                        b = i47 % 128;
                        if (i47 % 2 == 0) {
                            int i48 = 4 % 2;
                        }
                    }
                    jVar.i();
                    int i49 = b;
                    int i50 = (i49 | 11) << 1;
                    int i51 = -(i49 ^ 11);
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                }
                int i54 = a;
                int i55 = (i54 & 10) + (i54 | 10);
                int i56 = (i55 ^ (-1)) + (i55 << 1);
                b = i56 % 128;
                int i57 = i56 % 2;
                obj = map;
            } else {
                jVar.s();
                int i58 = b;
                int i59 = i58 & 9;
                int i60 = i59 + ((i58 ^ 9) | i59);
                a = i60 % 128;
                int i61 = i60 % 2;
            }
            int i62 = b;
            int i63 = i62 & 67;
            int i64 = (i62 ^ 67) | i63;
            int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
            a = i65 % 128;
            if (i65 % 2 != 0) {
                int i66 = 57 / 0;
            }
            return obj;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0408  */
        public final void d(c cVar, Object obj) throws IOException {
            String string;
            int size;
            V value;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = ((i3 & (-118)) | ((~i3) & 117)) + ((i3 & 117) << 1);
            a = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            Map map = (Map) obj;
            if (map == null) {
                int i5 = (i3 & 53) + (i3 | 53);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    cVar.c();
                    return;
                } else {
                    cVar.c();
                    int i6 = 81 / 0;
                    return;
                }
            }
            if (!C0228p.this.d) {
                int i7 = a;
                int i8 = ((i7 ^ 52) + ((i7 & 52) << 1)) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    cVar.f();
                    map.entrySet().iterator();
                    throw null;
                }
                cVar.f();
                Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
                int i9 = a;
                int i10 = ((i9 | 17) << 1) - (i9 ^ 17);
                b = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 23;
                b = i12 % 128;
                int i13 = i12 % 2;
                while (it.hasNext()) {
                    int i14 = b;
                    int i15 = i14 & 47;
                    int i16 = (i14 ^ 47) | i15;
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    a = i17 % 128;
                    if (i17 % 2 != 0) {
                        it.next();
                        throw null;
                    }
                    Map.Entry<K, V> next = it.next();
                    int i18 = a + 51;
                    b = i18 % 128;
                    if (i18 % 2 == 0) {
                        cVar.j(String.valueOf(next.getKey()));
                        obj2.hashCode();
                        throw null;
                    }
                    cVar.j(String.valueOf(next.getKey()));
                    this.d.d(cVar, next.getValue());
                    int i19 = b;
                    int i20 = ((i19 | 27) << 1) - (i19 ^ 27);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                }
                cVar.h();
                int i22 = b;
                int i23 = ((i22 & (-112)) | ((~i22) & 111)) + ((i22 & 111) << 1);
                a = i23 % 128;
                int i24 = i23 % 2;
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i25 = a;
            int i26 = (i25 | 111) << 1;
            int i27 = -(((~i25) & 111) | (i25 & (-112)));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            b = i28 % 128;
            int i29 = i28 % 2;
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            int i30 = a;
            int i31 = i30 & 37;
            int i32 = (((i30 | 37) & (~i31)) - (~(-(-(i31 << 1))))) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
            int i34 = 0;
            while (it2.hasNext()) {
                int i35 = a;
                int i36 = i35 & 101;
                int i37 = -(-((i35 ^ 101) | i36));
                int i38 = (i36 & i37) + (i37 | i36);
                b = i38 % 128;
                if (i38 % 2 == 0) {
                    it2.next();
                    throw null;
                }
                Map.Entry<K, V> next2 = it2.next();
                ad adVar = (o000O000<K>) this.c;
                K key = next2.getKey();
                Objects.requireNonNull(adVar);
                try {
                    i iVar = new i();
                    int i39 = a;
                    int i40 = (i39 & 9) + (i39 | 9);
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    adVar.d(iVar, key);
                    n nVarW = iVar.w();
                    int i42 = a;
                    int i43 = i42 & 7;
                    int i44 = i43 + ((i42 ^ 7) | i43);
                    b = i44 % 128;
                    if (i44 % 2 == 0) {
                        arrayList.add(nVarW);
                        value = next2.getValue();
                        int i45 = 61 / 0;
                    } else {
                        arrayList.add(nVarW);
                        value = next2.getValue();
                    }
                    arrayList2.add(value);
                    Objects.requireNonNull(nVarW);
                    if (nVarW instanceof W) {
                        int i46 = b;
                        int i47 = i46 ^ 83;
                        int i48 = ((i46 & 83) | i47) << 1;
                        int i49 = -i47;
                        int i50 = (i48 & i49) + (i48 | i49);
                        a = i50 % 128;
                        int i51 = i50 % 2;
                        i = 1;
                    } else {
                        int i52 = a;
                        int i53 = i52 & 125;
                        int i54 = ((i52 ^ 125) | i53) << 1;
                        int i55 = -((i52 | 125) & (~i53));
                        int i56 = (i54 & i55) + (i55 | i54);
                        int i57 = i56 % 128;
                        b = i57;
                        int i58 = i56 % 2;
                        if (nVarW instanceof C0144q) {
                            int i410 = b;
                            int i411 = i410 ^ 83;
                            int i412 = ((i410 & 83) | i411) << 1;
                            int i413 = -i411;
                            int i59 = (i412 & i413) + (i412 | i413);
                            a = i59 % 128;
                            int i510 = i59 % 2;
                            i = 1;
                        } else {
                            int i60 = (i57 & (-70)) | ((~i57) & 69);
                            int i61 = (i57 & 69) << 1;
                            int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                            a = i62 % 128;
                            int i63 = i62 % 2;
                            int i64 = i57 + 47;
                            a = i64 % 128;
                            int i65 = i64 % 2;
                            i = 0;
                        }
                    }
                    int i66 = i34 & i;
                    int i67 = (i34 | i) & (~i66);
                    i34 = (i67 & i66) | (i67 ^ i66);
                    int i68 = b;
                    int i69 = (i68 & 121) + (i68 | 121);
                    a = i69 % 128;
                    int i70 = i69 % 2;
                } catch (IOException e) {
                    throw new X(e);
                }
            }
            if (i34 != 0) {
                int i71 = a + 111;
                b = i71 % 128;
                if (i71 % 2 == 0) {
                    cVar.e();
                    size = arrayList.size();
                    int i72 = 9 / 0;
                } else {
                    cVar.e();
                    size = arrayList.size();
                }
                int i73 = b;
                int i74 = ((i73 ^ 4) + ((i73 & 4) << 1)) - 1;
                a = i74 % 128;
                int i75 = i74 % 2;
                int i76 = 0;
                while (i76 < size) {
                    int i77 = b;
                    int i78 = i77 | 61;
                    int i79 = i78 << 1;
                    int i80 = -((~(i77 & 61)) & i78);
                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                    a = i81 % 128;
                    int i82 = i81 % 2;
                    cVar.e();
                    n nVar = (n) arrayList.get(i76);
                    int i83 = a;
                    int i84 = (-2) - ((((i83 | 40) << 1) - (i83 ^ 40)) ^ (-1));
                    b = i84 % 128;
                    if (i84 % 2 == 0) {
                        J.D.d(cVar, nVar);
                        throw null;
                    }
                    J.D.d(cVar, nVar);
                    this.d.d(cVar, arrayList2.get(i76));
                    cVar.i();
                    int i85 = ((i76 ^ 128) + ((i76 & 128) << 1)) - 1;
                    i76 = (-2) - ((((i85 | (-125)) << 1) - (i85 ^ (-125))) ^ (-1));
                    int i86 = b;
                    int i87 = (-2) - (((i86 & 96) + (i86 | 96)) ^ (-1));
                    a = i87 % 128;
                    int i88 = i87 % 2;
                }
                cVar.i();
                int i89 = b;
                int i90 = (i89 ^ 35) + ((i89 & 35) << 1);
                a = i90 % 128;
                if (i90 % 2 != 0) {
                    int i91 = 49 / 0;
                    return;
                }
                return;
            }
            cVar.f();
            int size2 = arrayList.size();
            int i92 = b;
            int i93 = ((i92 & (-42)) | ((~i92) & 41)) + ((i92 & 41) << 1);
            a = i93 % 128;
            int i94 = i93 % 2;
            int i95 = (((i92 | 37) << 1) - (~(-(((~i92) & 37) | (i92 & (-38)))))) - 1;
            a = i95 % 128;
            int i96 = i95 % 2;
            int i97 = 0;
            while (i97 < size2) {
                int i98 = b + 79;
                a = i98 % 128;
                if (i98 % 2 != 0) {
                    throw null;
                }
                n nVar2 = (n) arrayList.get(i97);
                int i99 = a;
                int i100 = ((i99 | 9) << 1) - (i99 ^ 9);
                b = i100 % 128;
                if (i100 % 2 == 0) {
                    Objects.requireNonNull(nVar2);
                    boolean z = nVar2 instanceof Z;
                    obj2.hashCode();
                    throw null;
                }
                Objects.requireNonNull(nVar2);
                if (!(!(nVar2 instanceof Z))) {
                    int i101 = a;
                    int i102 = ((i101 & 22) + (i101 | 22)) - 1;
                    b = i102 % 128;
                    int i103 = i102 % 2;
                    Z zD = nVar2.d();
                    Object obj3 = zD.c;
                    int i104 = a;
                    int i105 = i104 & 117;
                    int i106 = (((i104 ^ 117) | i105) << 1) - ((~i105) & (i104 | 117));
                    b = i106 % 128;
                    int i107 = i106 % 2;
                    if (obj3 instanceof Number) {
                        int i108 = i104 & 81;
                        int i109 = (i104 ^ 81) | i108;
                        int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                        b = i110 % 128;
                        if (i110 % 2 == 0) {
                            string = String.valueOf(zD.g());
                            int i111 = 33 / 0;
                        } else {
                            string = String.valueOf(zD.g());
                        }
                    } else if (obj3 instanceof Boolean) {
                        int i112 = i104 & 5;
                        int i113 = (((i104 | 5) & (~i112)) - (~(i112 << 1))) - 1;
                        b = i113 % 128;
                        int i114 = i113 % 2;
                        string = Boolean.toString(zD.f());
                        int i115 = a;
                        int i116 = i115 & 5;
                        int i117 = -(-((i115 ^ 5) | i116));
                        int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                        b = i118 % 128;
                        int i119 = i118 % 2;
                    } else {
                        if (!(obj3 instanceof String)) {
                            throw new AssertionError();
                        }
                        int i120 = i104 + 15;
                        b = i120 % 128;
                        int i121 = i120 % 2;
                        string = zD.h();
                        int i122 = b + 19;
                        a = i122 % 128;
                        int i123 = i122 % 2;
                    }
                } else {
                    if (!(nVar2 instanceof Y)) {
                        throw new AssertionError();
                    }
                    int i124 = b;
                    int i125 = i124 ^ 35;
                    int i126 = ((i124 & 35) | i125) << 1;
                    int i127 = -i125;
                    int i128 = (i126 & i127) + (i126 | i127);
                    int i129 = i128 % 128;
                    a = i129;
                    int i130 = i128 % 2;
                    int i131 = i129 + 55;
                    b = i131 % 128;
                    int i132 = i131 % 2;
                    string = "null";
                }
                cVar.j(string);
                o000O000<V> o000o000 = this.d;
                int i133 = a;
                int i134 = (i133 ^ 115) + ((i133 & 115) << 1);
                b = i134 % 128;
                if (i134 % 2 == 0) {
                    o000o000.d(cVar, arrayList2.get(i97));
                    int i135 = i97 & 98;
                    int i136 = (i97 | 98) & (~i135);
                    int i137 = -(-(i135 << 1));
                    i97 = ((i136 | i137) << 1) - (i136 ^ i137);
                } else {
                    o000o000.d(cVar, arrayList2.get(i97));
                    int i138 = ((i97 ^ (-23)) + ((i97 & (-23)) << 1)) - 1;
                    i97 = ((i138 ^ 26) + ((i138 & 26) << 1)) - 1;
                }
            }
            cVar.h();
            int i139 = a;
            int i140 = (-2) - (((i139 ^ 24) + ((i139 & 24) << 1)) ^ (-1));
            b = i140 % 128;
            int i141 = i140 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0130  */
    /* JADX WARN: Code duplicated, block: B:33:0x0141  */
    @Override // ivas.gov.bisp.enumeration.p035bh.E
    public final <T> o000O000<T> b(C c, TypeToken<T> typeToken) throws Throwable {
        Type[] actualTypeArguments;
        ad adVarH;
        int i;
        Class<String> cls;
        char c2;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 97;
        int i5 = i3 | 97;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        Type type = typeToken.b;
        Class<? super T> cls2 = typeToken.a;
        int i8 = b;
        int i9 = i8 ^ 117;
        int i10 = ((i8 & 117) | i9) << 1;
        int i11 = -i9;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        Object obj = null;
        if (!Map.class.isAssignableFrom(cls2)) {
            int i14 = a;
            int i15 = i14 & 73;
            int i16 = -(-((i14 ^ 73) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Class<?> clsH = C0328j.h(type);
        if (type == Properties.class) {
            int i18 = b;
            int i19 = (i18 | 27) << 1;
            int i20 = -(((~i18) & 27) | (i18 & (-28)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = i21 % 128;
            a = i22;
            actualTypeArguments = new Type[2];
            if (i21 % 2 != 0) {
                actualTypeArguments[0] = String.class;
                cls = String.class;
                c2 = 0;
            } else {
                actualTypeArguments[0] = String.class;
                cls = String.class;
                c2 = 1;
            }
            int i23 = i22 ^ 45;
            int i24 = -(-((i22 & 45) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            int i26 = i25 % 128;
            b = i26;
            int i27 = i25 % 2;
            actualTypeArguments[c2] = cls;
            int i28 = (i26 & 1) + (i26 | 1);
            a = i28 % 128;
            int i29 = i28 % 2;
        } else {
            Type typeG = C0328j.g(type, clsH, Map.class);
            if (typeG instanceof ParameterizedType) {
                int i30 = a;
                int i31 = (i30 | 35) << 1;
                int i32 = -(i30 ^ 35);
                int i33 = (i31 & i32) + (i32 | i31);
                b = i33 % 128;
                if (i33 % 2 == 0) {
                    ((ParameterizedType) typeG).getActualTypeArguments();
                    obj.hashCode();
                    throw null;
                }
                actualTypeArguments = ((ParameterizedType) typeG).getActualTypeArguments();
                int i34 = a + 31;
                b = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 2 % 5;
                }
            } else {
                actualTypeArguments = new Type[]{Object.class, Object.class};
                int i36 = a;
                int i37 = (i36 & 24) + (i36 | 24);
                int i38 = (i37 ^ (-1)) + (i37 << 1);
                b = i38 % 128;
                int i39 = i38 % 2;
            }
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE) {
            int i40 = b;
            int i41 = i40 & 81;
            int i42 = (i40 ^ 81) | i41;
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            a = i43 % 128;
            int i44 = i43 % 2;
            if (type2 != Boolean.class) {
                adVarH = c.h(new TypeToken<>(type2));
                int i45 = a;
                int i46 = (((i45 | 88) << 1) - (i45 ^ 88)) - 1;
                int i47 = i46 % 128;
                b = i47;
                int i48 = i46 % 2;
                int i49 = i47 & 109;
                int i50 = ((i47 | 109) & (~i49)) + (i49 << 1);
                a = i50 % 128;
                int i51 = i50 % 2;
            } else {
                adVarH = J.f;
                int i52 = b;
                int i53 = i52 & 37;
                i = i53 + ((i52 ^ 37) | i53);
                a = i % 128;
                if (i % 2 != 0) {
                    int i54 = 2 / 3;
                }
            }
        } else {
            adVarH = J.f;
            int i55 = b;
            int i56 = i55 & 37;
            i = i56 + ((i55 ^ 37) | i56);
            a = i % 128;
            if (i % 2 != 0) {
                int i57 = 2 / 3;
            }
        }
        ad adVar = adVarH;
        TypeToken<T> typeToken2 = new TypeToken<>(actualTypeArguments[1]);
        int i58 = b;
        int i59 = i58 & 73;
        int i60 = -(-((i58 ^ 73) | i59));
        int i61 = (i59 & i60) + (i60 | i59);
        a = i61 % 128;
        if (i61 % 2 != 0) {
            c.h(typeToken2);
            throw null;
        }
        bsd bsdVar = new bsd(c, actualTypeArguments[0], adVar, actualTypeArguments[1], c.h(typeToken2), this.c.c(typeToken));
        int i62 = a;
        int i63 = i62 & 3;
        int i64 = i63 + ((i62 ^ 3) | i63);
        b = i64 % 128;
        int i65 = i64 % 2;
        return bsdVar;
    }
}
