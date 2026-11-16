package ivas.gov.bisp.enumeration.bN;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.o000oOoo.o0000O;
import ivas.gov.bisp.enumeration.o000oo0o.o0OoOoOo;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ab<K, V> implements o0000O<K, V> {
    private static int a = 0;
    private static int b = 1;
    public final Map<K, V> c;
    public final o0OoOoOo<K, V> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ab(Map<K, V> map, o0OoOoOo<? super K, ? extends V> o0oooooo) {
        this.c = map;
        this.d = o0oooooo;
    }

    public final Map<K, V> b() {
        int i = 2 % 2;
        int i2 = a + 93;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Map<K, V> map = this.c;
        int i5 = ((i3 ^ 31) | (i3 & 31)) << 1;
        int i6 = -(((~i3) & 31) | (i3 & (-32)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return map;
    }

    public final void clear() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 117;
        int i4 = ((i2 ^ 117) | i3) << 1;
        int i5 = -((i2 | 117) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        this.c.clear();
        int i8 = b + 9;
        a = i8 % 128;
        int i9 = i8 % 2;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        int i = 2 % 2;
        int i2 = a + 51;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.c.entrySet();
        }
        this.c.entrySet();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 42) << 1) - (i2 ^ 42)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.c.hashCode();
        int i5 = b;
        int i6 = i5 & 17;
        int i7 = (i5 ^ 17) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return iHashCode;
    }

    public final boolean containsKey(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-64)) | ((~i2) & 63);
        int i4 = (i2 & 63) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean zContainsKey = this.c.containsKey(obj);
        int i7 = a;
        int i8 = i7 & 87;
        int i9 = i8 + ((i7 ^ 87) | i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return zContainsKey;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final boolean containsValue(Object obj) {
        int i = 2 % 2;
        int i2 = a + 7;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.c.containsValue(obj);
        }
        int i3 = 26 / 0;
        return this.c.containsValue(obj);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = (((i2 | 65) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.c.equals(obj);
            throw null;
        }
        boolean zEquals = this.c.equals(obj);
        int i5 = a;
        int i6 = ((i5 | 23) << 1) - (i5 ^ 23);
        b = i6 % 128;
        int i7 = i6 % 2;
        return zEquals;
    }

    public final V get(Object obj) {
        V v;
        int i = 2 % 2;
        int i2 = a + 101;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            v = this.c.get(obj);
            int i3 = 42 / 0;
        } else {
            v = this.c.get(obj);
        }
        int i4 = a + 88;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return v;
    }

    public final boolean isEmpty() {
        boolean zIsEmpty;
        int i = 2 % 2;
        int i2 = a + 43;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zIsEmpty = this.c.isEmpty();
            int i3 = 61 / 0;
        } else {
            zIsEmpty = this.c.isEmpty();
        }
        int i4 = b + 121;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return zIsEmpty;
    }

    public final Set<K> keySet() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 65) | (i2 & 65)) << 1;
        int i4 = -(((~i2) & 65) | (i2 & (-66)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Set<K> setKeySet = this.c.keySet();
        int i7 = a;
        int i8 = i7 ^ 9;
        int i9 = (i7 & 9) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return setKeySet;
    }

    public final V put(K k, V v) {
        V vPut;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = (i2 ^ 93) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            vPut = this.c.put(k, v);
            int i6 = 21 / 0;
        } else {
            vPut = this.c.put(k, v);
        }
        int i7 = b;
        int i8 = (i7 & (-122)) | ((~i7) & 121);
        int i9 = (i7 & 121) << 1;
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
        return vPut;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = ((i2 ^ 63) | i3) << 1;
        int i5 = -((i2 | 63) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        r.n(map, "from");
        this.c.putAll(map);
        int i8 = a;
        int i9 = i8 & 27;
        int i10 = -(-((i8 ^ 27) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
    }

    public final V remove(Object obj) {
        int i = 2 % 2;
        int i2 = b + 109;
        a = i2 % 128;
        int i3 = i2 % 2;
        V vRemove = this.c.remove(obj);
        int i4 = a;
        int i5 = ((i4 ^ 121) | (i4 & 121)) << 1;
        int i6 = -(((~i4) & 121) | (i4 & (-122)));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 54 / 0;
        }
        return vRemove;
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 111;
        int i4 = (i2 & 111) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.c.size();
        }
        this.c.size();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 111;
        int i4 = ((((i2 ^ 111) | i3) << 1) - (~(-((i2 | 111) & (~i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.c.toString();
        }
        this.c.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Collection<V> values() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 7) | (i2 & 7)) << 1) - (((~i2) & 7) | (i2 & (-8)));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.values();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Collection<V> collectionValues = this.c.values();
        int i4 = b;
        int i5 = (-2) - ((((i4 | 18) << 1) - (i4 ^ 18)) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        return collectionValues;
    }

    public final V e(K k) {
        Map<K, V> map;
        V v;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 62) + ((i2 & 62) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            map = this.c;
            v = map.get(k);
            int i5 = 38 / 0;
        } else {
            map = this.c;
            v = map.get(k);
        }
        if (v == null) {
            int i6 = b + 93;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                map.containsKey(k);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!map.containsKey(k)) {
                v = (V) this.d.e(k);
                int i7 = b;
                int i8 = i7 & 93;
                int i9 = i8 + ((i7 ^ 93) | i8);
                a = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        int i11 = b + 25;
        a = i11 % 128;
        int i12 = i11 % 2;
        return v;
    }
}
