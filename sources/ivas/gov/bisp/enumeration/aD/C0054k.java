package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o00oOoo;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0054k<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private static int a = 0;
    private static int b = 1;
    public static final /* synthetic */ int c = 0;
    public final int d;
    public volatile o00oOoo<K, V>.OooO0o g;
    public boolean h;
    public List<o00oOoo<K, V>.OooO0O0> e = Collections.emptyList();
    public Map<K, V> f = Collections.emptyMap();
    public Map<K, V> i = Collections.emptyMap();

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k$bkE */
    public class bkE extends AbstractSet<Map.Entry<K, V>> {
        private static int a = 0;
        private static int b = 1;

        public bkE(ap apVar) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = ((i2 | 121) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            C0054k.this.clear();
            int i6 = a + 91;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            int i = 2 % 2;
            bkD bkd = new bkD(null);
            int i2 = b;
            int i3 = (((i2 | 82) << 1) - (i2 ^ 82)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return bkd;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 2 % 2;
            int i2 = a + 7;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                C0054k.this.size();
                throw null;
            }
            int size = C0054k.this.size();
            int i3 = b;
            int i4 = (i3 & 91) + (i3 | 91);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return size;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x007e  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            boolean z;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 57;
            int i5 = (((i3 ^ 57) | i4) << 1) - ((i3 | 57) & (~i4));
            b = i5 % 128;
            if (i5 % 2 == 0) {
                contains((Map.Entry) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                int i6 = a;
                int i7 = i6 ^ 99;
                int i8 = ((((i6 & 99) | i7) << 1) - (~(-i7))) - 1;
                b = i8 % 128;
                int i9 = i8 % 2;
                C0054k c0054k = C0054k.this;
                Comparable comparable = (Comparable) entry.getKey();
                Object value = entry.getValue();
                int i10 = a;
                int i11 = i10 & 9;
                int i12 = (i11 - (~((i10 ^ 9) | i11))) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
                c0054k.j(comparable, value);
                if (i13 != 0) {
                    z = true;
                }
                int i14 = b;
                int i15 = i14 & 59;
                int i16 = (i14 | 59) & (~i15);
                int i17 = -(-(i15 << 1));
                i = (i16 ^ i17) + ((i16 & i17) << 1);
                a = i % 128;
                if (i % 2 != 0) {
                    int i18 = 62 / 0;
                }
                return z;
            }
            int i19 = a;
            int i20 = (-2) - (((i19 ^ 124) + ((i19 & 124) << 1)) ^ (-1));
            b = i20 % 128;
            int i21 = i20 % 2;
            z = false;
            int i110 = b;
            int i111 = i110 & 59;
            int i112 = (i110 | 59) & (~i111);
            int i113 = -(-(i111 << 1));
            i = (i112 ^ i113) + ((i112 & i113) << 1);
            a = i % 128;
            if (i % 2 != 0) {
                int i114 = 62 / 0;
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 98) + ((i2 & 98) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                int i5 = a;
                int i6 = ((i5 ^ 73) | (i5 & 73)) << 1;
                int i7 = -(((~i5) & 73) | (i5 & (-74)));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                b = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = a;
            int i11 = i10 & 43;
            int i12 = i11 + ((i10 ^ 43) | i11);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                C0054k.this.remove(entry.getKey());
                int i13 = 59 / 0;
            } else {
                C0054k.this.remove(entry.getKey());
            }
            int i14 = b;
            int i15 = ((i14 & 86) + (i14 | 86)) - 1;
            a = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 19 / 0;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = a + 13;
            b = i2 % 128;
            int i3 = i2 % 2;
            Map.Entry entry = (Map.Entry) obj;
            C0054k c0054k = C0054k.this;
            Object key = entry.getKey();
            int i4 = b;
            int i5 = i4 & 3;
            int i6 = ((((i4 ^ 3) | i5) << 1) - (~(-((i4 | 3) & (~i5))))) - 1;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                c0054k.get(key);
                entry.getValue();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            V v = c0054k.get(key);
            Object value = entry.getValue();
            if (v != value) {
                int i7 = b + 3;
                int i8 = i7 % 128;
                a = i8;
                int i9 = i7 % 2;
                z = false;
                if (v != null) {
                    int i10 = i8 + 81;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    boolean zEquals = v.equals(value);
                    if (i11 == 0) {
                        int i12 = 52 / 0;
                        if (!(!zEquals)) {
                            int i13 = b;
                            int i14 = i13 & 33;
                            int i15 = ((i13 ^ 33) | i14) << 1;
                            int i16 = -((i13 | 33) & (~i14));
                            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                            a = i17 % 128;
                            int i18 = i17 % 2;
                            z = true;
                        }
                    } else if (!(!zEquals)) {
                        int i19 = b;
                        int i110 = i19 & 33;
                        int i111 = ((i19 ^ 33) | i110) << 1;
                        int i112 = -((i19 | 33) & (~i110));
                        int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                        a = i113 % 128;
                        int i114 = i113 % 2;
                        z = true;
                    }
                }
                int i20 = a;
                int i21 = ((i20 | 43) << 1) - (i20 ^ 43);
                b = i21 % 128;
                int i22 = i21 % 2;
            } else {
                int i115 = b;
                int i116 = i115 & 33;
                int i117 = ((i115 ^ 33) | i116) << 1;
                int i118 = -((i115 | 33) & (~i116));
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                a = i119 % 128;
                int i1110 = i119 % 2;
                z = true;
            }
            int i23 = b;
            int i24 = (((i23 | 19) << 1) - (~(-(((~i23) & 19) | (i23 & (-20)))))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            return z;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k$bkz */
    public static class bkz {
        private static int a = 1;
        private static int b;
        public static final Iterator<Object> c = new bkA();
        public static final Iterable<Object> d;

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k$bkz$bkA */
        public class bkA implements Iterator<Object> {
            private static int a = 0;
            private static int b = 1;

            @Override // java.util.Iterator
            public boolean hasNext() {
                int i = 2 % 2;
                int i2 = b;
                int i3 = i2 ^ 121;
                int i4 = (i2 & 121) << 1;
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                a = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                int i = 2 % 2;
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i = 2 % 2;
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k$bkz$bkB */
        public class bkB implements Iterable<Object> {
            private static int a = 1;
            private static int b;

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
                b = i3 % 128;
                int i4 = i3 % 2;
                Iterator<Object> it = bkz.c;
                int i5 = b;
                int i6 = ((i5 | 115) << 1) - (i5 ^ 115);
                a = i6 % 128;
                int i7 = i6 % 2;
                return it;
            }
        }

        static {
            bkB bkb = new bkB();
            int i = a;
            int i2 = (-2) - ((((i | 16) << 1) - (i ^ 16)) ^ (-1));
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            d = bkb;
            int i5 = ((i3 ^ 29) | (i3 & 29)) << 1;
            int i6 = -((i3 & (-30)) | ((~i3) & 29));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            a = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public C0054k(int i, ap apVar) {
        this.d = i;
    }

    public void c() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-100)) | ((~i2) & 99);
        int i4 = (i2 & 99) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!this.h) {
            if (this.f.isEmpty()) {
                int i6 = b;
                int i7 = (i6 | 71) << 1;
                int i8 = -(((~i6) & 71) | (i6 & (-72)));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    Collections.emptyMap();
                    throw null;
                }
                mapUnmodifiableMap = Collections.emptyMap();
                int i10 = b;
                int i11 = (((i10 & (-72)) | ((~i10) & 71)) - (~(-(-((i10 & 71) << 1))))) - 1;
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(this.f);
                int i13 = a;
                int i14 = ((i13 ^ 100) + ((i13 & 100) << 1)) - 1;
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            this.f = mapUnmodifiableMap;
            if (this.i.isEmpty()) {
                int i16 = b;
                int i17 = i16 & 33;
                int i18 = i17 + ((i16 ^ 33) | i17);
                a = i18 % 128;
                int i19 = i18 % 2;
                mapUnmodifiableMap2 = Collections.emptyMap();
                int i20 = a;
                int i21 = i20 & 21;
                int i22 = i21 + ((i20 ^ 21) | i21);
                b = i22 % 128;
                int i23 = i22 % 2;
            } else {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(this.i);
                int i24 = b;
                int i25 = (((i24 & (-52)) | ((~i24) & 51)) - (~((i24 & 51) << 1))) - 1;
                a = i25 % 128;
                int i26 = i25 % 2;
            }
            this.i = mapUnmodifiableMap2;
            this.h = true;
            int i27 = b;
            int i28 = i27 ^ 91;
            int i29 = (i27 & 91) << 1;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            a = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = b;
        int i33 = ((i32 ^ 20) + ((i32 & 20) << 1)) - 1;
        a = i33 % 128;
        int i34 = i33 % 2;
    }

    public final void e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (this.h) {
            throw new UnsupportedOperationException();
        }
        int i5 = i2 & 125;
        int i6 = (((i2 | 125) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = i3 + ((i2 ^ 107) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.g == null) {
            this.g = new bkE(null);
            int i6 = a + 13;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        o00oOoo<K, V>.OooO0o oooO0o = this.g;
        int i8 = a + 115;
        b = i8 % 128;
        int i9 = i8 % 2;
        return oooO0o;
    }

    public int f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int size = this.e.size();
        int i5 = a + 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return size;
        }
        throw null;
    }

    public Map.Entry<K, V> g(int i) {
        int i2 = 2 % 2;
        int i3 = a + 75;
        b = i3 % 128;
        int i4 = i3 % 2;
        Map.Entry<K, V> entry = this.e.get(i);
        int i5 = b;
        int i6 = i5 & 41;
        int i7 = i6 + ((i5 ^ 41) | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return entry;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-48)) | ((~i2) & 47)) - (~(-(-((i2 & 47) << 1))))) - 1;
        b = i3 % 128;
        Comparable comparable = (Comparable) obj;
        if (i3 % 2 != 0) {
            return j(comparable, obj2);
        }
        j(comparable, obj2);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        int size;
        Map<K, V> map;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = (i3 - (~(-(-((i2 ^ 113) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            size = this.e.size();
            map = this.f;
            int i5 = 24 / 0;
        } else {
            size = this.e.size();
            map = this.f;
        }
        int i6 = b;
        int i7 = i6 & 13;
        int i8 = ((((i6 ^ 13) | i7) << 1) - (~(-((i6 | 13) & (~i7))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        int size2 = map.size();
        int i10 = size2 & size;
        int i11 = i10 + ((size ^ size2) | i10);
        int i12 = a;
        int i13 = i12 & 63;
        int i14 = (i12 | 63) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            return i11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k$bkC */
    public class bkC implements Map.Entry<K, V>, Comparable<o00oOoo<K, V>.OooO0O0> {
        private static int a = 1;
        private static int b;
        public final K c;
        public V d;

        public bkC(C0054k c0054k, Map.Entry<K, V> entry) {
            K key = entry.getKey();
            V value = entry.getValue();
            C0054k.this = c0054k;
            this.c = key;
            this.d = value;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 105;
            int i4 = (((i2 | 105) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            K k = this.c;
            int i7 = ((i5 ^ 12) + ((i5 & 12) << 1)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V v;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 25) - (~(-(-(i2 | 25))))) - 1;
            int i4 = i3 % 128;
            a = i4;
            if (i3 % 2 == 0) {
                v = this.d;
                int i5 = 55 / 0;
            } else {
                v = this.d;
            }
            int i6 = (i4 ^ 102) + ((i4 & 102) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return v;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 5;
            int i4 = (i3 - (~((i2 ^ 5) | i3))) - 1;
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            K k = this.c;
            int iHashCode2 = 0;
            if (k == null) {
                int i7 = ((i5 | 43) << 1) - (i5 ^ 43);
                b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i5 + 45;
                b = i9 % 128;
                int i10 = i9 % 2;
                iHashCode = 0;
            } else {
                iHashCode = k.hashCode();
                int i11 = b;
                int i12 = (i11 | 51) << 1;
                int i13 = -(((~i11) & 51) | (i11 & (-52)));
                int i14 = (i12 & i13) + (i13 | i12);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            V v = this.d;
            Object obj = null;
            if (v != null) {
                int i16 = b;
                int i17 = i16 & 29;
                int i18 = ((i16 ^ 29) | i17) << 1;
                int i19 = -((i16 | 29) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    v.hashCode();
                    obj.hashCode();
                    throw null;
                }
                iHashCode2 = v.hashCode();
            }
            int i21 = ((~iHashCode) & iHashCode2) | ((~iHashCode2) & iHashCode);
            int i22 = b;
            int i23 = i22 & 115;
            int i24 = (i22 | 115) & (~i23);
            int i25 = i23 << 1;
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            a = i26 % 128;
            if (i26 % 2 != 0) {
                return i21;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            int i2 = a + 6;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            sb.append("=");
            if (i4 != 0) {
                sb.append(this.d);
                obj.hashCode();
                throw null;
            }
            sb.append(this.d);
            int i5 = a;
            int i6 = (((i5 | 86) << 1) - (i5 ^ 86)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            String string = sb.toString();
            int i8 = b;
            int i9 = i8 & 95;
            int i10 = (i8 | 95) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 19) | (i2 & 19)) << 1) - ((i2 & (-20)) | ((~i2) & 19));
            a = i3 % 128;
            int i4 = i3 % 2;
            K k = this.c;
            int i5 = i2 | 125;
            int i6 = i5 << 1;
            int i7 = -((~(i2 & 125)) & i5);
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            int iCompareTo = k.compareTo(((bkC) obj).c);
            int i10 = b + 80;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return iCompareTo;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0157  */
        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 115;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (obj == this) {
                int i5 = (i2 & 81) + (i2 | 81);
                a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = (i2 | 75) << 1;
                int i8 = -(((~i2) & 75) | (i2 & (-76)));
                int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                int i11 = i2 & 75;
                int i12 = ((i2 | 75) & (~i11)) + (i11 << 1);
                int i13 = i12 % 128;
                a = i13;
                int i14 = i12 % 2;
                int i15 = i13 & 21;
                int i16 = ((i13 | 21) & (~i15)) + (i15 << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.c;
            Object key = entry.getKey();
            int i18 = b;
            int i19 = (((i18 ^ 13) | (i18 & 13)) << 1) - ((i18 & (-14)) | ((~i18) & 13));
            a = i19 % 128;
            if (i19 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (k != null) {
                zEquals = k.equals(key);
                int i20 = a;
                int i21 = i20 & 19;
                int i22 = (i20 | 19) & (~i21);
                int i23 = -(-(i21 << 1));
                int i24 = (i22 & i23) + (i22 | i23);
                b = i24 % 128;
                int i25 = i24 % 2;
            } else if (key == null) {
                int i26 = ((i18 ^ 105) | (i18 & 105)) << 1;
                int i27 = -((i18 & (-106)) | ((~i18) & 105));
                int i28 = (i26 & i27) + (i26 | i27);
                a = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i18 & 91;
                int i31 = -(-((i18 ^ 91) | i30));
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                a = i32 % 128;
                int i33 = i32 % 2;
                zEquals = true;
            } else {
                int i34 = ((i18 ^ 125) - (~((i18 & 125) << 1))) - 1;
                a = i34 % 128;
                int i35 = i34 % 2;
                zEquals = false;
            }
            if (!(!zEquals)) {
                int i36 = b;
                int i37 = (i36 ^ 59) + ((i36 & 59) << 1);
                a = i37 % 128;
                int i38 = i37 % 2;
                V v = this.d;
                Object value = entry.getValue();
                int i39 = a;
                int i40 = (i39 & (-76)) | ((~i39) & 75);
                int i41 = (75 & i39) << 1;
                int i42 = (i40 & i41) + (i41 | i40);
                int i43 = i42 % 128;
                b = i43;
                int i44 = i42 % 2;
                if (v == null) {
                    int i45 = i43 & 65;
                    int i46 = (~i45) & (i43 | 65);
                    int i47 = i45 << 1;
                    int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                    int i49 = i48 % 128;
                    a = i49;
                    int i50 = i48 % 2;
                    if (value == null) {
                        int i51 = i49 + 49;
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        int i53 = i49 & 21;
                        int i54 = ((i49 ^ 21) | i53) << 1;
                        int i55 = -((i49 | 21) & (~i53));
                        int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                        b = i56 % 128;
                        int i57 = i56 % 2;
                        int i58 = a;
                        int i59 = (-2) - ((i58 + 10) ^ (-1));
                        b = i59 % 128;
                        int i60 = i59 % 2;
                        int i61 = ((i58 | 17) << 1) - (((~i58) & 17) | (i58 & (-18)));
                        b = i61 % 128;
                        int i62 = i61 % 2;
                        z = true;
                    } else {
                        int i63 = i43 + 123;
                        a = i63 % 128;
                        int i64 = i63 % 2;
                        int i65 = b + 19;
                        a = i65 % 128;
                        int i66 = i65 % 2;
                        z = false;
                    }
                } else {
                    boolean zEquals2 = v.equals(value);
                    int i67 = a;
                    int i68 = ((i67 & 111) - (~(i67 | 111))) - 1;
                    b = i68 % 128;
                    int i69 = i68 % 2;
                    if (!zEquals2) {
                        int i610 = b + 19;
                        a = i610 % 128;
                        int i611 = i610 % 2;
                        z = false;
                    } else {
                        int i510 = a;
                        int i511 = (-2) - ((i510 + 10) ^ (-1));
                        b = i511 % 128;
                        int i612 = i511 % 2;
                        int i613 = ((i510 | 17) << 1) - (((~i510) & 17) | (i510 & (-18)));
                        b = i613 % 128;
                        int i614 = i613 % 2;
                        z = true;
                    }
                }
            } else {
                int i615 = b + 19;
                a = i615 % 128;
                int i616 = i615 % 2;
                z = false;
            }
            int i70 = b;
            int i71 = i70 & 61;
            int i72 = ((((i70 ^ 61) | i71) << 1) - (~(-((i70 | 61) & (~i71))))) - 1;
            a = i72 % 128;
            if (i72 % 2 == 0) {
                int i73 = 28 / 0;
            }
            return z;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                C0054k c0054k = C0054k.this;
                int i4 = C0054k.c;
                c0054k.e();
                int i5 = 51 / 0;
            } else {
                C0054k c0054k2 = C0054k.this;
                int i6 = C0054k.c;
                c0054k2.e();
            }
            int i7 = a;
            int i8 = i7 & 87;
            int i9 = -(-(i7 | 87));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                V v2 = this.d;
                this.d = v;
                return v2;
            }
            this.d = v;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public bkC(K k, V v) {
            this.c = k;
            this.d = v;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x007b  */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 109;
        int i5 = -(-((i3 ^ 109) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        Comparable comparable = (Comparable) obj;
        if (d(comparable) < 0) {
            int i8 = a;
            int i9 = i8 & 87;
            int i10 = -(-((i8 ^ 87) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            if (this.f.containsKey(comparable)) {
                int i13 = a;
                int i14 = i13 ^ 123;
                int i15 = ((i13 & 123) | i14) << 1;
                int i16 = -i14;
                i = (i15 & i16) + (i15 | i16);
                b = i % 128;
                if (i % 2 == 0) {
                    int i17 = 3 / 4;
                }
                z = true;
            } else {
                int i18 = a;
                int i19 = i18 & 41;
                int i20 = ((i18 ^ 41) | i19) << 1;
                int i21 = -((~i19) & (i18 | 41));
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = ((((i18 ^ 85) | (i18 & 85)) << 1) - (~(-(((~i18) & 85) | (i18 & (-86)))))) - 1;
                b = i24 % 128;
                int i25 = i24 % 2;
                z = false;
            }
        } else {
            int i110 = a;
            int i111 = i110 ^ 123;
            int i112 = ((i110 & 123) | i111) << 1;
            int i113 = -i111;
            i = (i112 & i113) + (i112 | i113);
            b = i % 128;
            if (i % 2 == 0) {
                int i114 = 3 / 4;
            }
            z = true;
        }
        int i26 = a;
        int i27 = (i26 ^ 11) + ((i26 & 11) << 1);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int i = 2 % 2;
        int i2 = b + 73;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            d((Comparable) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        if (iD >= 0) {
            V v = this.e.get(iD).d;
            int i3 = b + 31;
            a = i3 % 128;
            int i4 = i3 % 2;
            return v;
        }
        V v2 = this.f.get(comparable);
        int i5 = b;
        int i6 = i5 ^ 15;
        int i7 = (i5 & 15) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 70 / 0;
        }
        return v2;
    }

    public Iterable<Map.Entry<K, V>> h() {
        Set<Map.Entry<K, V>> setEntrySet;
        int i = 2 % 2;
        int i2 = a + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this.f.isEmpty()) {
            int i4 = a;
            int i5 = (i4 ^ 38) + ((i4 & 38) << 1);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                setEntrySet = (Iterable<Map.Entry<K, V>>) bkz.d;
                int i7 = 99 / 0;
            } else {
                setEntrySet = (Iterable<Map.Entry<K, V>>) bkz.d;
            }
        } else {
            setEntrySet = this.f.entrySet();
            int i8 = a;
            int i9 = (i8 & (-112)) | ((~i8) & 111);
            int i10 = (111 & i8) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 4 / 2;
            }
        }
        int i13 = b;
        int i14 = ((i13 | 22) << 1) - (i13 ^ 22);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        return setEntrySet;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final SortedMap<K, V> i() {
        TreeMap treeMap;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-16)) | ((~i3) & 15);
        int i5 = -(-((i3 & 15) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            e();
            int i7 = 9 / 0;
            if (!(!this.f.isEmpty())) {
                if (!(this.f instanceof TreeMap)) {
                    treeMap = new TreeMap();
                    this.f = treeMap;
                    int i8 = a;
                    i = ((i8 | 39) << 1) - (i8 ^ 39);
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.i = treeMap.descendingMap();
                        throw null;
                    }
                    this.i = treeMap.descendingMap();
                }
            }
        } else {
            e();
            if (this.f.isEmpty()) {
                if (!(this.f instanceof TreeMap)) {
                    treeMap = new TreeMap();
                    this.f = treeMap;
                    int i9 = a;
                    i = ((i9 | 39) << 1) - (i9 ^ 39);
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.i = treeMap.descendingMap();
                        throw null;
                    }
                    this.i = treeMap.descendingMap();
                }
            }
        }
        SortedMap<K, V> sortedMap = (SortedMap) this.f;
        int i10 = b + 121;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return sortedMap;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 71) + (i2 | 71);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            e();
            this.e.isEmpty();
            throw null;
        }
        e();
        if (!this.e.isEmpty()) {
            this.e.clear();
            int i4 = b;
            int i5 = i4 ^ 11;
            int i6 = ((i4 & 11) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        if (!this.f.isEmpty()) {
            int i10 = a;
            int i11 = (i10 ^ 57) + ((i10 & 57) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            this.f.clear();
            int i13 = a;
            int i14 = ((i13 & (-6)) | ((~i13) & 5)) + ((i13 & 5) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = (i16 & (-6)) | ((~i16) & 5);
        int i18 = (i16 & 5) << 1;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iF = f();
        int i5 = b;
        int i6 = (i5 & 72) + (i5 | 72);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        while (i9 < iF) {
            int i11 = a;
            int i12 = (i11 ^ 53) + ((i11 & 53) << 1);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                this.e.get(i9).hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.e.get(i9).hashCode();
            int i13 = a;
            int i14 = i13 & 105;
            int i15 = (i13 | 105) & (~i14);
            int i16 = i14 << 1;
            int i17 = (i15 & i16) + (i15 | i16);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                i10 >>>= iHashCode;
                int i18 = (i9 & (-23)) | ((~i9) & 22);
                int i19 = (i9 & 22) << 1;
                i9 = (i18 ^ i19) + ((i19 & i18) << 1);
            } else {
                int i20 = -(-iHashCode);
                int i21 = i10 & i20;
                int i22 = (((i10 ^ i20) | i21) << 1) - ((i10 | i20) & (~i21));
                int i23 = i9 & 1;
                int i24 = -(-((i9 ^ 1) | i23));
                i9 = ((i23 | i24) << 1) - (i24 ^ i23);
                i10 = i22;
            }
        }
        if (this.f.size() > 0) {
            int i25 = b + 91;
            a = i25 % 128;
            int i26 = i25 % 2;
            int iHashCode2 = this.f.hashCode();
            int i27 = i10 & iHashCode2;
            int i28 = (iHashCode2 ^ i10) | i27;
            i10 = (i27 & i28) + (i28 | i27);
            int i29 = b + 69;
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = b;
        int i32 = i31 ^ 117;
        int i33 = ((i31 & 117) | i32) << 1;
        int i34 = -i32;
        int i35 = (i33 & i34) + (i33 | i34);
        a = i35 % 128;
        if (i35 % 2 != 0) {
            int i36 = 89 / 0;
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int i = 2 % 2;
        int i2 = b + 87;
        a = i2 % 128;
        int i3 = i2 % 2;
        e();
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        int i4 = a;
        int i5 = i4 + 99;
        b = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (iD >= 0) {
            int i6 = ((i4 ^ 41) | (i4 & 41)) << 1;
            int i7 = -(((~i4) & 41) | (i4 & (-42)));
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                k(iD);
                throw null;
            }
            V vK = k(iD);
            int i9 = a;
            int i10 = (i9 & 55) + (i9 | 55);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return vK;
            }
            throw null;
        }
        if (this.f.isEmpty()) {
            int i11 = a;
            int i12 = (i11 ^ 26) + ((i11 & 26) << 1);
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
        V vRemove = this.f.remove(comparable);
        int i14 = a;
        int i15 = i14 & 125;
        int i16 = i15 + ((i14 ^ 125) | i15);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 90 / 0;
        }
        return vRemove;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.k$bkD */
    public class bkD implements Iterator<Map.Entry<K, V>> {
        private static int a = 0;
        private static int b = 1;
        public int c = -1;
        public boolean d;
        public Iterator<Map.Entry<K, V>> e;

        public bkD(ap apVar) {
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, V> next;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 115;
            a = i3 % 128;
            int i4 = i3 % 2;
            this.d = true;
            int i5 = this.c;
            int i6 = i5 & 1;
            int i7 = i5 | 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            int i9 = ((i2 | 91) << 1) - (i2 ^ 91);
            a = i9 % 128;
            int i10 = i9 % 2;
            this.c = i8;
            if (i8 < C0054k.this.e.size()) {
                int i11 = a + 33;
                b = i11 % 128;
                int i12 = i11 % 2;
                o00oOoo<K, V>.OooO0O0 oooO0O0 = C0054k.this.e.get(this.c);
                int i13 = a;
                int i14 = i13 ^ 49;
                int i15 = (i13 & 49) << 1;
                int i16 = (i14 & i15) + (i15 | i14);
                int i17 = i16 % 128;
                b = i17;
                int i18 = i16 % 2;
                next = (Map.Entry) oooO0O0;
                int i19 = i17 + 125;
                a = i19 % 128;
                int i20 = i19 % 2;
            } else {
                next = c().next();
                int i21 = a;
                int i22 = (i21 ^ 37) + ((i21 & 37) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = b + 45;
            a = i24 % 128;
            if (i24 % 2 == 0) {
                return next;
            }
            throw null;
        }

        public final Iterator<Map.Entry<K, V>> c() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-60)) | ((~i2) & 59);
            int i4 = (i2 & 59) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.e == null) {
                Set<Map.Entry<K, V>> setEntrySet = C0054k.this.f.entrySet();
                int i6 = b;
                int i7 = i6 & 77;
                int i8 = ((i6 ^ 77) | i7) << 1;
                int i9 = -((i6 | 77) & (~i7));
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    this.e = setEntrySet.iterator();
                    int i11 = 46 / 0;
                } else {
                    this.e = setEntrySet.iterator();
                }
                int i12 = b;
                int i13 = ((i12 | 101) << 1) - (i12 ^ 101);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
            Iterator<Map.Entry<K, V>> it = this.e;
            int i15 = b + 19;
            a = i15 % 128;
            int i16 = i15 % 2;
            return it;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0083  */
        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 & (-92)) | ((~i2) & 91)) - (~((i2 & 91) << 1))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.c;
            List<o00oOoo<K, V>.OooO0O0> list = C0054k.this.e;
            int i6 = b;
            int i7 = (i6 ^ 61) + ((i6 & 61) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = ((i5 ^ 1) | (i5 & 1)) << 1;
            int i10 = -(((~i5) & 1) | (i5 & (-2)));
            if ((i9 & i10) + (i10 | i9) >= list.size()) {
                int i11 = a + 85;
                b = i11 % 128;
                int i12 = i11 % 2;
                z = false;
                if (!C0054k.this.f.isEmpty()) {
                    int i13 = a;
                    int i14 = (i13 & (-38)) | ((~i13) & 37);
                    int i15 = (i13 & 37) << 1;
                    int i16 = (i14 & i15) + (i15 | i14);
                    b = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 14 / 0;
                        if (c().hasNext()) {
                            int i18 = b;
                            int i19 = i18 ^ 83;
                            int i20 = (((i18 & 83) | i19) << 1) - i19;
                            a = i20 % 128;
                            int i21 = i20 % 2;
                            z = true;
                        }
                    } else if (c().hasNext()) {
                        int i110 = b;
                        int i111 = i110 ^ 83;
                        int i22 = (((i110 & 83) | i111) << 1) - i111;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        z = true;
                    }
                }
                int i24 = a + 49;
                b = i24 % 128;
                int i25 = i24 % 2;
            } else {
                z = true;
            }
            int i26 = b;
            int i27 = i26 & 93;
            int i28 = -(-(i26 | 93));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            a = i29 % 128;
            int i30 = i29 % 2;
            return z;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i;
            C0054k c0054k;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 & (-36)) | ((~i3) & 35);
            int i5 = (i3 & 35) << 1;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            if (!this.d) {
                throw new IllegalStateException("remove() was called before next()");
            }
            int i9 = i7 & 117;
            int i10 = ((i7 ^ 117) | i9) << 1;
            int i11 = -((i7 | 117) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                this.d = true;
            } else {
                this.d = false;
            }
            C0054k c0054k2 = C0054k.this;
            int i13 = C0054k.c;
            int i14 = b;
            int i15 = i14 & 91;
            int i16 = (((i14 ^ 91) | i15) << 1) - ((i14 | 91) & (~i15));
            a = i16 % 128;
            if (i16 % 2 != 0) {
                c0054k2.e();
                i = this.c;
                c0054k = C0054k.this;
                int i17 = 68 / 0;
            } else {
                c0054k2.e();
                i = this.c;
                c0054k = C0054k.this;
            }
            int i18 = a;
            int i19 = i18 & 21;
            int i20 = (i18 ^ 21) | i19;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            b = i21 % 128;
            int i22 = i21 % 2;
            if (i >= c0054k.e.size()) {
                c().remove();
                int i23 = b;
                int i24 = ((i23 | 107) << 1) - (i23 ^ 107);
                a = i24 % 128;
                int i25 = i24 % 2;
                return;
            }
            int i26 = b;
            int i27 = i26 ^ 61;
            int i28 = (((i26 & 61) | i27) << 1) - i27;
            a = i28 % 128;
            int i29 = i28 % 2;
            C0054k c0054k3 = C0054k.this;
            int i30 = this.c;
            int i31 = i26 & 125;
            int i32 = (i26 ^ 125) | i31;
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            a = i33 % 128;
            int i34 = i33 % 2;
            int i35 = ~i30;
            int i36 = -(-(i30 << 1));
            this.c = (i35 & i36) + (i35 | i36);
            c0054k3.k(i30);
            int i37 = a;
            int i38 = ((i37 & 35) - (~(-(-(i37 | 35))))) - 1;
            b = i38 % 128;
            if (i38 % 2 == 0) {
                int i39 = 14 / 0;
            }
        }
    }

    public final V k(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 11;
        int i5 = (i3 | 11) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        e();
        bkC bkcRemove = this.e.remove(i);
        int i9 = b;
        int i10 = i9 & 59;
        int i11 = (((i9 | 59) & (~i10)) - (~(i10 << 1))) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            V v = bkcRemove.d;
            this.f.isEmpty();
            throw null;
        }
        V v2 = bkcRemove.d;
        if (!this.f.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = i().entrySet().iterator();
            List<o00oOoo<K, V>.OooO0O0> list = this.e;
            bkC bkc = new bkC(this, it.next());
            int i12 = a;
            int i13 = (i12 ^ 3) + ((i12 & 3) << 1);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                list.add(bkc);
                it.remove();
                int i14 = 24 / 0;
            } else {
                list.add(bkc);
                it.remove();
            }
        }
        int i15 = a;
        int i16 = i15 & 29;
        int i17 = i16 + ((i15 ^ 29) | i16);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 21 / 0;
        }
        return v2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:18:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0099  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00af  */
    public final int d(K k) {
        int size;
        int iCompareTo;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 & (-104)) | ((~i5) & 103);
        int i7 = -(-((i5 & 103) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            size = this.e.size() + 1;
        } else {
            int size2 = this.e.size();
            int i9 = -(-((size2 ^ (-1)) | size2));
            size = ((size2 | i9) << 1) - (size2 ^ i9);
        }
        int i10 = b;
        int i11 = ((i10 | 31) << 1) - (i10 ^ 31);
        a = i11 % 128;
        int i12 = 0;
        Object obj = null;
        if (i11 % 2 != 0) {
            int i13 = 41 / 0;
            if (size >= 0) {
                K k2 = this.e.get(size).c;
                int i14 = a + 121;
                b = i14 % 128;
                int i15 = i14 % 2;
                iCompareTo = k.compareTo(k2);
                if (iCompareTo > 0) {
                    int i16 = b;
                    int i17 = ((i16 ^ 122) + ((i16 & 122) << 1)) - 1;
                    int i18 = i17 % 128;
                    a = i18;
                    int i19 = i17 % 2;
                    i2 = -(((size | 2) << 1) - (((~size) & 2) | (size & (-3))));
                    i3 = (i18 ^ 109) + ((i18 & 109) << 1);
                    b = i3 % 128;
                    if (i3 % 2 != 0) {
                        return i2;
                    }
                    throw null;
                }
                if (iCompareTo == 0) {
                    int i20 = b;
                    int i21 = (i20 ^ 20) + ((i20 & 20) << 1);
                    i = (i21 ^ (-1)) + (i21 << 1);
                    a = i % 128;
                    if (i % 2 == 0) {
                        return size;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (size >= 0) {
            K k3 = this.e.get(size).c;
            int i110 = a + 121;
            b = i110 % 128;
            int i111 = i110 % 2;
            iCompareTo = k.compareTo(k3);
            if (iCompareTo > 0) {
                int i112 = b;
                int i113 = ((i112 ^ 122) + ((i112 & 122) << 1)) - 1;
                int i114 = i113 % 128;
                a = i114;
                int i115 = i113 % 2;
                i2 = -(((size | 2) << 1) - (((~size) & 2) | (size & (-3))));
                i3 = (i114 ^ 109) + ((i114 & 109) << 1);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    return i2;
                }
                throw null;
            }
            if (iCompareTo == 0) {
                int i22 = b;
                int i23 = (i22 ^ 20) + ((i22 & 20) << 1);
                i = (i23 ^ (-1)) + (i23 << 1);
                a = i % 128;
                if (i % 2 == 0) {
                    return size;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i24 = b + 7;
        a = i24 % 128;
        int i25 = i24 % 2;
        while (i12 <= size) {
            int i26 = a;
            int i27 = (i26 ^ 125) + ((i26 & 125) << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i12 & size;
            int i30 = ((i29 - (~((i12 ^ size) | i29))) - 1) / 2;
            bkC bkc = this.e.get(i30);
            int i31 = b;
            int i32 = i31 & 93;
            int i33 = -(-((i31 ^ 93) | i32));
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                k.compareTo(bkc.c);
                obj.hashCode();
                throw null;
            }
            int iCompareTo2 = k.compareTo(bkc.c);
            int i35 = a;
            int i36 = i35 & 107;
            int i37 = -(-((i35 ^ 107) | i36));
            int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
            int i39 = i38 % 128;
            b = i39;
            int i40 = i38 % 2;
            if (iCompareTo2 < 0) {
                int i41 = (i35 & 27) + (i35 | 27);
                int i42 = i41 % 128;
                b = i42;
                size = i41 % 2 == 0 ? i30 % 1 : (((i30 ^ (-1)) | i30) << 1) - (~i30);
                int i43 = i42 & 93;
                int i44 = -(-(i42 | 93));
                int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                a = i45 % 128;
                int i46 = i45 % 2;
            } else {
                if (iCompareTo2 <= 0) {
                    int i47 = i39 & 25;
                    int i48 = -(-((i39 ^ 25) | i47));
                    int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                    a = i49 % 128;
                    int i50 = i49 % 2;
                    return i30;
                }
                int i51 = (((i39 & (-116)) | ((~i39) & 115)) - (~((i39 & 115) << 1))) - 1;
                a = i51 % 128;
                if (i51 % 2 != 0) {
                    i12 = i30 - 1;
                } else {
                    int i52 = i30 | 1;
                    i12 = ((i52 << 1) - (~(-(i52 & (~(i30 & 1)))))) - 1;
                }
            }
        }
        int i53 = i12 & 1;
        int i54 = -((((~i53) & (i12 | 1)) - (~(i53 << 1))) - 1);
        int i55 = b;
        int i56 = i55 & 27;
        int i57 = (i56 - (~((i55 ^ 27) | i56))) - 1;
        a = i57 % 128;
        int i58 = i57 % 2;
        return i54;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r12 instanceof ivas.gov.bisp.enumeration.aD.C0054k) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r4 = r2 & 57;
        r1 = ((r2 ^ 57) | r4) << 1;
        r2 = -((r2 | 57) & (~r4));
        r4 = (r1 ^ r2) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.aD.C0054k.a = r4 % 128;
        r4 = r4 % 2;
        r12 = super.equals(r12);
        r1 = ivas.gov.bisp.enumeration.aD.C0054k.a;
        r2 = r1 | 69;
        r4 = r2 << 1;
        r1 = -((~(r1 & 69)) & r2);
        r2 = (r4 ^ r1) + ((r1 & r4) << 1);
        ivas.gov.bisp.enumeration.aD.C0054k.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r12 = (ivas.gov.bisp.enumeration.aD.C0054k) r12;
        r1 = size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r1 == r12.size()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r12 = ivas.gov.bisp.enumeration.aD.C0054k.b;
        r1 = r12 + 111;
        ivas.gov.bisp.enumeration.aD.C0054k.a = r1 % 128;
        r1 = r1 % 2;
        r1 = r12 & 13;
        r1 = (r1 - (~((r12 ^ 13) | r1))) - 1;
        ivas.gov.bisp.enumeration.aD.C0054k.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if ((r1 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        r2 = f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r2 == r12.f()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.C0054k.a;
        r4 = r1 & 109;
        r2 = ((r1 ^ 109) | r4) << 1;
        r1 = -((r1 | 109) & (~r4));
        r4 = ((r2 | r1) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.aD.C0054k.b = r4 % 128;
        r4 = r4 % 2;
        r12 = entrySet().equals(r12.entrySet());
        r1 = ivas.gov.bisp.enumeration.aD.C0054k.b;
        r2 = ((r1 ^ 69) | (r1 & 69)) << 1;
        r1 = -(((~r1) & 69) | (r1 & (-70)));
        r3 = (r2 & r1) + (r1 | r2);
        ivas.gov.bisp.enumeration.aD.C0054k.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if ((r3 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        r5 = ivas.gov.bisp.enumeration.aD.C0054k.b;
        r7 = r5 & 11;
        r7 = (r7 - (~(-(-((r5 ^ 11) | r7))))) - 1;
        ivas.gov.bisp.enumeration.aD.C0054k.a = r7 % 128;
        r7 = r7 % 2;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (r5 >= r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
    
        r7 = ivas.gov.bisp.enumeration.aD.C0054k.b;
        r8 = (r7 | 105) << 1;
        r7 = -(((~r7) & 105) | (r7 & (-106)));
        r9 = (r8 ^ r7) + ((r7 & r8) << 1);
        ivas.gov.bisp.enumeration.aD.C0054k.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        if ((r9 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
    
        if ((!g(r5).equals(r12.g(r5))) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        r12 = ivas.gov.bisp.enumeration.aD.C0054k.b;
        r2 = r12 & 95;
        r1 = ((r12 ^ 95) | r2) << 1;
        r12 = -((r12 | 95) & (~r2));
        r2 = ((r1 | r12) << 1) - (r12 ^ r1);
        ivas.gov.bisp.enumeration.aD.C0054k.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013d, code lost:
    
        if ((r2 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        r5 = (((r5 | 2) << 1) - (r5 ^ 2)) - 1;
        r7 = ivas.gov.bisp.enumeration.aD.C0054k.a;
        r8 = r7 ^ 39;
        r7 = -(-((r7 & 39) << 1));
        r9 = ((r8 | r7) << 1) - (r7 ^ r8);
        ivas.gov.bisp.enumeration.aD.C0054k.b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015d, code lost:
    
        g(r5).equals(r12.g(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0169, code lost:
    
        if (r2 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016b, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aD.C0054k.a;
        r2 = r1 & 81;
        r1 = (r1 | 81) & (~r2);
        r2 = -(-(r2 << 1));
        r4 = ((r1 | r2) << 1) - (r1 ^ r2);
        ivas.gov.bisp.enumeration.aD.C0054k.b = r4 % 128;
        r4 = r4 % 2;
        r12 = r11.f.equals(r12.f);
        r1 = ivas.gov.bisp.enumeration.aD.C0054k.a;
        r2 = r1 ^ 17;
        r1 = ((r1 & 17) | r2) << 1;
        r2 = -r2;
        r4 = (r1 ^ r2) + ((r1 & r2) << 1);
        ivas.gov.bisp.enumeration.aD.C0054k.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019b, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019c, code lost:
    
        r12 = ivas.gov.bisp.enumeration.aD.C0054k.a + 119;
        ivas.gov.bisp.enumeration.aD.C0054k.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        if ((r12 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a7, code lost:
    
        r12 = 4 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r1 = r1 + 9;
        r12 = r1 % 128;
        ivas.gov.bisp.enumeration.aD.C0054k.b = r12;
        r1 = r1 % 2;
        r1 = (((r12 ^ 27) | (r12 & 27)) << 1) - (((~r12) & 27) | (r12 & (-28)));
        ivas.gov.bisp.enumeration.aD.C0054k.a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aD.C0054k.equals(java.lang.Object):boolean");
    }

    public V j(K k, V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 18) + (i2 | 18)) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            e();
            d(k);
            obj.hashCode();
            throw null;
        }
        e();
        int iD = d(k);
        if (iD >= 0) {
            bkC bkc = this.e.get(iD);
            int i4 = a;
            int i5 = ((i4 | 49) << 1) - (i4 ^ 49);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                C0054k.this.e();
                V v2 = bkc.d;
                throw null;
            }
            C0054k.this.e();
            V v3 = bkc.d;
            int i6 = a;
            int i7 = i6 ^ 29;
            int i8 = ((i6 & 29) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            bkc.d = v;
            int i12 = a;
            int i13 = (i12 & (-86)) | ((~i12) & 85);
            int i14 = (i12 & 85) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            int i16 = i15 % 2;
            return v3;
        }
        e();
        if (!(!this.e.isEmpty())) {
            int i17 = b;
            int i18 = i17 & 51;
            int i19 = (i17 ^ 51) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            int i21 = i20 % 2;
            if (!(this.e instanceof ArrayList)) {
                this.e = new ArrayList(this.d);
                int i22 = b + 65;
                a = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        int i24 = -(iD + 1);
        if (i24 >= this.d) {
            int i25 = a;
            int i26 = (i25 ^ 98) + ((i25 & 98) << 1);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            b = i27 % 128;
            int i28 = i27 % 2;
            V vPut = i().put(k, v);
            int i29 = a;
            int i30 = i29 & 55;
            int i31 = i29 | 55;
            int i32 = (i30 & i31) + (i31 | i30);
            b = i32 % 128;
            if (i32 % 2 != 0) {
                return vPut;
            }
            throw null;
        }
        int size = this.e.size();
        int i33 = this.d;
        int i34 = a + 121;
        int i35 = i34 % 128;
        b = i35;
        int i36 = i34 % 2;
        if (size == i33) {
            int i37 = i35 + 9;
            a = i37 % 128;
            int i38 = i37 % 2;
            bkC bkcRemove = this.e.remove((-2) - (i33 ^ (-1)));
            int i39 = a;
            int i40 = i39 & 73;
            int i41 = -(-((i39 ^ 73) | i40));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            b = i42 % 128;
            if (i42 % 2 == 0) {
                i();
                obj.hashCode();
                throw null;
            }
            bkC bkc2 = bkcRemove;
            SortedMap<K, V> sortedMapI = i();
            int i43 = b;
            int i44 = i43 & 3;
            int i45 = (i44 - (~((i43 ^ 3) | i44))) - 1;
            a = i45 % 128;
            if (i45 % 2 != 0) {
                K k2 = bkc2.c;
                V v4 = bkc2.d;
                obj.hashCode();
                throw null;
            }
            K k3 = bkc2.c;
            V v5 = bkc2.d;
            int i46 = a;
            int i47 = ((i46 ^ 61) | (i46 & 61)) << 1;
            int i48 = -(((~i46) & 61) | (i46 & (-62)));
            int i49 = (i47 & i48) + (i48 | i47);
            b = i49 % 128;
            if (i49 % 2 == 0) {
                sortedMapI.put(k3, v5);
                int i50 = 22 / 0;
            } else {
                sortedMapI.put(k3, v5);
            }
            int i51 = b;
            int i52 = i51 & 21;
            int i53 = -(-((i51 ^ 21) | i52));
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            a = i54 % 128;
            if (i54 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        List<o00oOoo<K, V>.OooO0O0> list = this.e;
        bkC bkc3 = new bkC(k, v);
        int i55 = a;
        int i56 = (i55 & (-104)) | ((~i55) & 103);
        int i57 = -(-((i55 & 103) << 1));
        int i58 = (i56 & i57) + (i57 | i56);
        b = i58 % 128;
        if (i58 % 2 == 0) {
            list.add(i24, bkc3);
            obj.hashCode();
            throw null;
        }
        list.add(i24, bkc3);
        int i59 = a + 61;
        b = i59 % 128;
        int i60 = i59 % 2;
        return null;
    }
}
