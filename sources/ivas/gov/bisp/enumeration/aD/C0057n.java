package ivas.gov.bisp.enumeration.aD;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057n<K, V> extends LinkedHashMap<K, V> {
    private static int a = 0;
    private static int b = 1;
    public static final C0057n c;
    public boolean d;

    static {
        C0057n c0057n = new C0057n();
        c = c0057n;
        int i = b;
        int i2 = ((i & (-108)) | ((~i) & 107)) + ((i & 107) << 1);
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 != 0) {
            c0057n.d = false;
        } else {
            c0057n.d = false;
        }
        int i4 = i3 + 74;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    public C0057n() {
        this.d = true;
    }

    public final void e() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = ((~i3) & (i2 | 53)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.d) {
            throw new UnsupportedOperationException();
        }
        int i5 = i2 | 31;
        int i6 = i5 << 1;
        int i7 = -((~(i2 & 31)) & i5);
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> setEntrySet;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 89;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            isEmpty();
            throw null;
        }
        if (isEmpty()) {
            int i5 = b;
            int i6 = i5 & 119;
            int i7 = (i5 ^ 119) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            setEntrySet = Collections.emptySet();
            int i10 = b;
            int i11 = i10 & 71;
            int i12 = -(-((i10 ^ 71) | i11));
            i = (i11 ^ i12) + ((i12 & i11) << 1);
            i2 = i % 128;
        } else {
            setEntrySet = super.entrySet();
            int i13 = b;
            int i14 = i13 & 69;
            int i15 = ((i13 ^ 69) | i14) << 1;
            int i16 = -((i13 | 69) & (~i14));
            i = (i15 & i16) + (i16 | i15);
            i2 = i % 128;
        }
        a = i2;
        int i17 = i % 2;
        int i18 = b;
        int i19 = i18 & 95;
        int i20 = (i19 - (~((i18 ^ 95) | i19))) - 1;
        a = i20 % 128;
        if (i20 % 2 == 0) {
            return setEntrySet;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[PHI: r7
  0x00b5: PHI (r7v16 java.lang.Object) = (r7v15 java.lang.Object), (r7v22 java.lang.Object) binds: [B:27:0x00b3, B:24:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    /* JADX WARN: Code duplicated, block: B:46:0x0162  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:13:0x004b->B:57:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        int i;
        boolean z;
        Map.Entry<K, V> next;
        Object obj2;
        int i2;
        boolean zEquals;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 89;
        int i6 = ((i4 & 89) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        Object obj3 = null;
        if (i8 % 2 == 0) {
            boolean z2 = obj instanceof Map;
            obj3.hashCode();
            throw null;
        }
        boolean z3 = false;
        if (!(obj instanceof Map)) {
            int i9 = b;
            int i10 = i9 & 43;
            int i11 = (i9 ^ 43) | i10;
            i = (i10 & i11) + (i11 | i10);
            a = i % 128;
            if (i % 2 != 0) {
                int i12 = 3 / 3;
            }
        } else {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    int i13 = b + 38;
                    int i14 = (i13 ^ (-1)) + (i13 << 1);
                    a = i14 % 128;
                    int i15 = i14 % 2;
                    while (true) {
                        if (it.hasNext()) {
                            int i16 = b;
                            int i17 = (((i16 & (-64)) | ((~i16) & 63)) - (~((i16 & 63) << 1))) - 1;
                            a = i17 % 128;
                            if (i17 % 2 != 0) {
                                next = it.next();
                                int i18 = 96 / 0;
                            } else {
                                next = it.next();
                            }
                            if (map.containsKey(next.getKey())) {
                                int i19 = a + 93;
                                b = i19 % 128;
                                int i20 = i19 % 2;
                                V value = next.getValue();
                                K key = next.getKey();
                                int i21 = a;
                                int i22 = ((i21 & 22) + (i21 | 22)) - 1;
                                b = i22 % 128;
                                if (i22 % 2 == 0) {
                                    obj2 = map.get(key);
                                    int i23 = 25 / 0;
                                    if (value instanceof byte[]) {
                                        int i24 = b;
                                        int i25 = i24 & 35;
                                        int i26 = ((i24 ^ 35) | i25) << 1;
                                        int i27 = -((i24 | 35) & (~i25));
                                        i2 = (i26 ^ i27) + ((i27 & i26) << 1);
                                        a = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            boolean z4 = obj2 instanceof byte[];
                                            throw null;
                                        }
                                        if (!(obj2 instanceof byte[])) {
                                            zEquals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                            int i28 = b + 91;
                                            a = i28 % 128;
                                            int i29 = i28 % 2;
                                        }
                                    }
                                    if (!zEquals) {
                                        int i30 = a;
                                        int i31 = ((((i30 ^ 107) | (i30 & 107)) << 1) - (~(-(((~i30) & 107) | (i30 & (-108)))))) - 1;
                                        b = i31 % 128;
                                        int i32 = i31 % 2;
                                    }
                                } else {
                                    obj2 = map.get(key);
                                    if (!(!(value instanceof byte[]))) {
                                        int i210 = b;
                                        int i211 = i210 & 35;
                                        int i212 = ((i210 ^ 35) | i211) << 1;
                                        int i213 = -((i210 | 35) & (~i211));
                                        i2 = (i212 ^ i213) + ((i213 & i212) << 1);
                                        a = i2 % 128;
                                        if (i2 % 2 == 0) {
                                            boolean z5 = obj2 instanceof byte[];
                                            throw null;
                                        }
                                        if (!(obj2 instanceof byte[])) {
                                            zEquals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                            int i214 = b + 91;
                                            a = i214 % 128;
                                            int i215 = i214 % 2;
                                        }
                                    }
                                    if (!zEquals) {
                                        int i33 = a;
                                        int i34 = ((((i33 ^ 107) | (i33 & 107)) << 1) - (~(-(((~i33) & 107) | (i33 & (-108)))))) - 1;
                                        b = i34 % 128;
                                        int i35 = i34 % 2;
                                    }
                                }
                                zEquals = value.equals(obj2);
                                int i36 = b + 105;
                                a = i36 % 128;
                                int i37 = i36 % 2;
                                if (!zEquals) {
                                    int i38 = a;
                                    int i39 = ((((i38 ^ 107) | (i38 & 107)) << 1) - (~(-(((~i38) & 107) | (i38 & (-108)))))) - 1;
                                    b = i39 % 128;
                                    int i310 = i39 % 2;
                                }
                            }
                        } else {
                            int i40 = a + 107;
                            b = i40 % 128;
                            int i41 = i40 % 2;
                            z = true;
                        }
                    }
                }
                int i42 = b;
                int i43 = (i42 & 125) + (i42 | 125);
                a = i43 % 128;
                int i44 = i43 % 2;
                z = false;
            } else {
                int i45 = a + 107;
                b = i45 % 128;
                int i46 = i45 % 2;
                z = true;
            }
            if (!(!z)) {
                int i47 = b;
                int i48 = i47 & 115;
                int i49 = (~i48) & (i47 | 115);
                int i50 = -(-(i48 << 1));
                int i51 = (i49 & i50) + (i50 | i49);
                a = i51 % 128;
                int i52 = i51 % 2;
                int i53 = i47 & 63;
                int i54 = ((((i47 ^ 63) | i53) << 1) - (~(-((i47 | 63) & (~i53))))) - 1;
                a = i54 % 128;
                int i55 = i54 % 2;
                z3 = true;
            } else {
                int i56 = b;
                int i110 = i56 & 43;
                int i111 = (i56 ^ 43) | i110;
                i = (i110 & i111) + (i111 | i110);
                a = i % 128;
                if (i % 2 != 0) {
                    int i112 = 3 / 3;
                }
            }
        }
        int i57 = a;
        int i58 = (i57 | 25) << 1;
        int i59 = -(((~i57) & 25) | (i57 & (-26)));
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        b = i60 % 128;
        int i61 = i60 % 2;
        return z3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = ((i2 ^ 15) | i3) << 1;
        int i5 = -((i2 | 15) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i7 == 0 ? 1 : 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            int i9 = a;
            int i10 = ((i9 & 122) + (i9 | 122)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            K key = entry.getKey();
            int i12 = b;
            int i13 = i12 & 37;
            int i14 = (i12 ^ 37) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            int iD2 = d(key);
            V value = entry.getValue();
            if (i16 != 0) {
                iD = d(value);
                int i17 = 1 / 0;
            } else {
                iD = d(value);
            }
            int i18 = a;
            int i19 = (((i18 | 45) << 1) - (~(-(((~i18) & 45) | (i18 & (-46)))))) - 1;
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            int i22 = (~iD2) & iD;
            int i23 = (~iD) & iD2;
            int i24 = (i23 & i22) | (i22 ^ i23);
            int i25 = i8 & i24;
            int i26 = -(-((i8 ^ i24) | i25));
            i8 = ((i26 & i25) << 1) + (i25 ^ i26);
            int i27 = i20 & 97;
            int i28 = -(-((i20 ^ 97) | i27));
            int i29 = (i27 & i28) + (i27 | i28);
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b + 5;
        a = i31 % 128;
        int i32 = i31 % 2;
        return i8;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = -(-((i2 ^ 115) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        e();
        V v = (V) super.remove(obj);
        int i7 = a;
        int i8 = (-2) - (((i7 ^ 108) + ((i7 & 108) << 1)) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        return v;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 103;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 103)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            e();
            super.clear();
        } else {
            e();
            super.clear();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public C0057n(Map<K, V> map) {
        super(map);
        this.d = true;
    }

    public static int d(Object obj) {
        int iHashCode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 75) + (i2 | 75);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof byte[];
            throw null;
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof R.bcK) {
                throw new UnsupportedOperationException();
            }
            int i5 = i2 ^ 61;
            int i6 = ((((i2 & 61) | i5) << 1) - (~(-i5))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode = obj.hashCode();
                int i7 = 68 / 0;
            } else {
                iHashCode = obj.hashCode();
            }
            int i8 = a + 5;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }
        int i9 = ((i4 & (-48)) | ((~i4) & 47)) + ((i4 & 47) << 1);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            Charset charset = R.c;
            int length = ((byte[]) obj).length;
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset2 = R.c;
        int length2 = bArr.length;
        int i10 = b;
        int i11 = i10 & 123;
        int i12 = ((((i10 ^ 123) | i11) << 1) - (~(-((i10 | 123) & (~i11))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = length2;
        int i15 = 0;
        while (true) {
            int i16 = -(-length2);
            if (i15 >= (i16 << 1) - i16) {
                break;
            }
            int i17 = a;
            int i18 = i17 | 87;
            int i19 = (i18 << 1) - ((~(i17 & 87)) & i18);
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            int i22 = i14 * 31;
            int i23 = -(~(-(-bArr[i15])));
            i14 = ((i22 & i23) + (i22 | i23)) - 1;
            int i24 = (i15 & 43) | ((~i15) & (-44));
            int i25 = -(-((i15 & (-44)) << 1));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            i15 = (((i26 | 46) << 1) - (i26 ^ 46)) - 1;
            int i27 = i20 & 97;
            int i28 = ((i20 ^ 97) | i27) << 1;
            int i29 = -((i20 | 97) & (~i27));
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        if (i14 == 0) {
            int i32 = a;
            int i33 = i32 & 41;
            int i34 = (((i32 | 41) & (~i33)) - (~(i33 << 1))) - 1;
            b = i34 % 128;
            i14 = i34 % 2 != 0 ? 1 : 0;
        }
        int i35 = b + 107;
        a = i35 % 128;
        int i36 = i35 % 2;
        return i14;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 | 91) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            e();
            Charset charset = R.c;
            Objects.requireNonNull(k);
            int i7 = 58 / 0;
        } else {
            e();
            Charset charset2 = R.c;
            Objects.requireNonNull(k);
        }
        Objects.requireNonNull(v);
        V v2 = (V) super.put(k, v);
        int i8 = b;
        int i9 = i8 & 75;
        int i10 = (i8 | 75) & (~i9);
        int i11 = i9 << 1;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        a = i12 % 128;
        int i13 = i12 % 2;
        return v2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 40) + ((i2 & 40) << 1)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            e();
            map.keySet().iterator();
            obj.hashCode();
            throw null;
        }
        e();
        int i4 = b;
        int i5 = (-2) - ((i4 + 6) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 & 17;
        int i8 = (((i4 | 17) & (~i7)) - (~(i7 << 1))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        for (K k : map.keySet()) {
            int i10 = a;
            int i11 = i10 & 1;
            int i12 = (i10 ^ 1) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            Charset charset = R.c;
            Objects.requireNonNull(k);
            int i15 = a;
            int i16 = i15 & 111;
            int i17 = (i15 ^ 111) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            Objects.requireNonNull(map.get(k));
            int i20 = a + 11;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 2 / 4;
            }
        }
        super.putAll(map);
        int i22 = a;
        int i23 = ((i22 | 83) << 1) - (i22 ^ 83);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
