package ivas.gov.bisp.enumeration.p102y;

import ivas.gov.bisp.enumeration.o000O0O.o000oOoO;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class J<K, V> extends AbstractMap<K, V> implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public static final Comparator<Comparable> c = new blz();
    public Comparator<? super K> d;
    public o000oOoO.OooO<K, V> e;
    public int f;
    public final o000oOoO.OooO<K, V> g;
    public int h;
    public o000oOoO<K, V>.OooO0O0 i;
    public o000oOoO<K, V>.OooO0OO j;

    public class blB extends AbstractSet<Map.Entry<K, V>> {
        private static int a = 0;
        private static int b = 1;

        public class blC extends blA {
            private static int a = 1;
            private static int b;

            public blC(blB blb) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = i2 & 85;
                int i4 = ((i2 | 85) & (~i3)) + (i3 << 1);
                b = i4 % 128;
                int i5 = i4 % 2;
                blF blfC = c();
                int i6 = a;
                int i7 = i6 & 21;
                int i8 = (((i6 | 21) & (~i7)) - (~(i7 << 1))) - 1;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    return blfC;
                }
                throw null;
            }
        }

        public blB() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            int i = 2 % 2;
            int i2 = b + 11;
            a = i2 % 128;
            int i3 = i2 % 2;
            J.this.clear();
            int i4 = b;
            int i5 = (i4 ^ 115) + ((i4 & 115) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x005c  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 12) + ((i2 & 12) << 1)) ^ (-1));
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            boolean z = false;
            if (obj instanceof Map.Entry) {
                int i6 = i4 & 77;
                int i7 = (i4 | 77) & (~i6);
                int i8 = -(-(i6 << 1));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                if (J.this.e((Map.Entry) obj) != null) {
                    int i11 = b;
                    int i12 = (i11 & 96) + (i11 | 96);
                    int i13 = (i12 ^ (-1)) + (i12 << 1);
                    a = i13 % 128;
                    z = i13 % 2 == 0;
                    int i14 = i11 & 71;
                    int i15 = (((i11 ^ 71) | i14) << 1) - ((i11 | 71) & (~i14));
                    a = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    int i17 = a;
                    int i18 = ((i17 ^ 124) + ((i17 & 124) << 1)) - 1;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }
            } else {
                int i110 = a;
                int i111 = ((i110 ^ 124) + ((i110 & 124) << 1)) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
            }
            int i20 = a;
            int i21 = ((((i20 ^ 69) | (i20 & 69)) << 1) - (~(-(((~i20) & 69) | (i20 & (-70)))))) - 1;
            b = i21 % 128;
            if (i21 % 2 != 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            int i = 2 % 2;
            blC blc = new blC(this);
            int i2 = a;
            int i3 = (i2 & 121) + (i2 | 121);
            b = i3 % 128;
            int i4 = i3 % 2;
            return blc;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 37;
            int i4 = ((i3 << 1) - (~(-((~(i2 & 37)) & i3)))) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return J.this.f;
            }
            int i5 = 70 / 0;
            return J.this.f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof Map.Entry)) {
                int i5 = i2 + 87;
                a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i2 + 88;
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            o000oOoO.OooO<K, V> oooOE = J.this.e((Map.Entry) obj);
            int i10 = a;
            int i11 = i10 & 27;
            int i12 = (i10 ^ 27) | i11;
            int i13 = (i11 & i12) + (i12 | i11);
            int i14 = i13 % 128;
            b = i14;
            int i15 = i13 % 2;
            if (oooOE == null) {
                int i16 = ((i14 ^ 40) + ((i14 & 40) << 1)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            J.this.h(oooOE, true);
            int i18 = b;
            int i19 = ((i18 | 53) << 1) - (i18 ^ 53);
            a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 63 / 0;
            }
            return true;
        }
    }

    public final class blD extends AbstractSet<K> {
        private static int a = 1;
        private static int b;

        public class blE extends blA {
            private static int a = 1;
            private static int b;

            public blE(blD bld) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                int i = 2 % 2;
                int i2 = a;
                int i3 = i2 ^ 25;
                int i4 = ((i2 & 25) | i3) << 1;
                int i5 = -i3;
                int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                b = i6 % 128;
                int i7 = i6 % 2;
                K k = c().i;
                int i8 = a;
                int i9 = i8 & 115;
                int i10 = (i8 ^ 115) | i9;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                return k;
            }
        }

        public blD() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            J.this.clear();
            int i5 = b + 91;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            int i = 2 % 2;
            blE ble = new blE(this);
            int i2 = b;
            int i3 = i2 & 47;
            int i4 = i2 | 47;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 95 / 0;
            }
            return ble;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 23;
            int i4 = i2 | 23;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = J.this.f;
            int i8 = a;
            int i9 = ((((i8 ^ 91) | (i8 & 91)) << 1) - (~(-(((~i8) & 91) | (i8 & (-92)))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return i7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 109) + (i2 | 109);
            a = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                J.this.f(obj);
                obj2.hashCode();
                throw null;
            }
            if (J.this.f(obj) != null) {
                int i4 = a;
                int i5 = i4 & 119;
                int i6 = i5 + ((i4 ^ 119) | i5);
                b = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                int i8 = a;
                int i9 = i8 & 7;
                int i10 = ((((i8 ^ 7) | i9) << 1) - (~(-((i8 | 7) & (~i9))))) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                z = false;
            }
            int i12 = b;
            int i13 = i12 & 11;
            int i14 = i12 | 11;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                return z;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            boolean z = true;
            int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
            a = i3 % 128;
            int i4 = i3 % 2;
            J j = J.this;
            blF blfF = j.f(obj);
            if (blfF != null) {
                int i5 = a;
                int i6 = ((i5 | 73) << 1) - (i5 ^ 73);
                b = i6 % 128;
                int i7 = i6 % 2;
                j.h(blfF, true);
                int i8 = b;
                int i9 = ((i8 & 123) - (~(i8 | 123))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
            }
            if (blfF == null) {
                int i11 = b;
                int i12 = i11 & 125;
                int i13 = ((i11 ^ 125) | i12) << 1;
                int i14 = -((~i12) & (i11 | 125));
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                int i17 = i11 & 103;
                int i18 = -(-((i11 ^ 103) | i17));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                a = i19 % 128;
                int i20 = i19 % 2;
                z = false;
            }
            int i21 = b + 123;
            a = i21 % 128;
            if (i21 % 2 != 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class blF<K, V> implements Map.Entry<K, V> {
        private static int a = 1;
        private static int b;
        public int c;
        public o000oOoO.OooO<K, V> d;
        public o000oOoO.OooO<K, V> e;
        public o000oOoO.OooO<K, V> f;
        public o000oOoO.OooO<K, V> g;
        public o000oOoO.OooO<K, V> h;
        public final K i;
        public V j;

        public blF() {
            this.i = null;
            this.g = this;
            this.h = this;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005c  */
        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:25:0x0083  */
        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            V v;
            int i = 2 % 2;
            int i2 = a + 53;
            int i3 = i2 % 128;
            b = i3;
            boolean z = false;
            if (i2 % 2 == 0 ? (obj instanceof Map.Entry) : (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.i;
                if (k == null) {
                    int i4 = (((i3 & (-40)) | ((~i3) & 39)) - (~(-(-((i3 & 39) << 1))))) - 1;
                    a = i4 % 128;
                    int i5 = i4 % 2;
                    if (entry.getKey() == null) {
                        int i6 = b;
                        int i7 = ((i6 & (-34)) | ((~i6) & 33)) + ((i6 & 33) << 1);
                        a = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 2 % 3;
                        }
                        v = this.j;
                        if (v == null) {
                            int i9 = (-2) - ((a + 68) ^ (-1));
                            b = i9 % 128;
                            int i10 = i9 % 2;
                            if (entry.getValue() == null) {
                                int i11 = a + 41;
                                b = i11 % 128;
                                int i12 = i11 % 2;
                                int i13 = b;
                                int i14 = (((i13 | 102) << 1) - (i13 ^ 102)) - 1;
                                a = i14 % 128;
                                int i15 = i14 % 2;
                                z = true;
                            }
                        } else if (v.equals(entry.getValue())) {
                            int i16 = b;
                            int i17 = (((i16 | 102) << 1) - (i16 ^ 102)) - 1;
                            a = i17 % 128;
                            int i18 = i17 % 2;
                            z = true;
                        }
                    }
                } else if (k.equals(entry.getKey())) {
                    v = this.j;
                    if (v == null) {
                        int i19 = (-2) - ((a + 68) ^ (-1));
                        b = i19 % 128;
                        int i110 = i19 % 2;
                        if (entry.getValue() == null) {
                            int i111 = a + 41;
                            b = i111 % 128;
                            int i112 = i111 % 2;
                            int i113 = b;
                            int i114 = (((i113 | 102) << 1) - (i113 ^ 102)) - 1;
                            a = i114 % 128;
                            int i115 = i114 % 2;
                            z = true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        int i116 = b;
                        int i117 = (((i116 | 102) << 1) - (i116 ^ 102)) - 1;
                        a = i117 % 128;
                        int i118 = i117 % 2;
                        z = true;
                    }
                }
            }
            int i20 = a;
            int i21 = i20 ^ 91;
            int i22 = -(-((i20 & 91) << 1));
            int i23 = (i21 & i22) + (i22 | i21);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 103;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            K k = this.i;
            int i4 = (((i2 | 10) << 1) - (i2 ^ 10)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            return k;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 102) << 1) - (i2 ^ 102);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            V v = this.j;
            int i5 = i2 & 79;
            int i6 = (((i2 ^ 79) | i5) << 1) - ((i2 | 79) & (~i5));
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return v;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 90) << 1) - (i2 ^ 90);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            K k = this.i;
            int iHashCode2 = 0;
            if (k == null) {
                int i7 = (i5 & (-62)) | ((~i5) & 61);
                int i8 = (i5 & 61) << 1;
                int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = (((i5 ^ 125) | (i5 & 125)) << 1) - (((~i5) & 125) | (i5 & (-126)));
                b = i11 % 128;
                int i12 = i11 % 2;
                iHashCode = 0;
            } else {
                iHashCode = k.hashCode();
                int i13 = b;
                int i14 = ((i13 ^ 46) + ((i13 & 46) << 1)) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            V v = this.j;
            if (v != null) {
                int i16 = b + 118;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
                iHashCode2 = v.hashCode();
                int i19 = a;
                int i20 = (i19 & 5) + (i19 | 5);
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 3 % 4;
                }
            }
            int i22 = (iHashCode | iHashCode2) & (~(iHashCode & iHashCode2));
            int i23 = a;
            int i24 = (i23 ^ 25) + ((i23 & 25) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
            return i22;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            K k = this.i;
            int i2 = b + 27;
            a = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(k);
                sb.append("=");
                int i3 = 21 / 0;
            } else {
                sb.append(k);
                sb.append("=");
            }
            int i4 = b;
            int i5 = (i4 & (-102)) | ((~i4) & 101);
            int i6 = (i4 & 101) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            sb.append(this.j);
            String string = sb.toString();
            int i9 = a;
            int i10 = i9 & 83;
            int i11 = (i9 ^ 83) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 81 / 0;
            }
            return string;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 17;
            int i4 = (i3 - (~((i2 ^ 17) | i3))) - 1;
            int i5 = i4 % 128;
            a = i5;
            if (i4 % 2 == 0) {
                v2 = this.j;
                this.j = v;
                int i6 = 14 / 0;
            } else {
                v2 = this.j;
                this.j = v;
            }
            int i7 = (i5 & (-8)) | ((~i5) & 7);
            int i8 = (i5 & 7) << 1;
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 35 / 0;
            }
            return v2;
        }

        public blF(o000oOoO.OooO<K, V> oooO, K k, o000oOoO.OooO<K, V> oooO2, o000oOoO.OooO<K, V> oooO3) {
            this.d = oooO;
            this.i = k;
            this.c = 1;
            this.h = oooO2;
            this.g = oooO3;
            oooO3.h = this;
            oooO2.g = this;
        }
    }

    public class blz implements Comparator<Comparable> {
        private static int a = 0;
        private static int b = 1;

        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 93) | (i2 & 93)) << 1) - (~(-(((~i2) & 93) | (i2 & (-94)))))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                comparable.compareTo(comparable2);
                throw null;
            }
            int iCompareTo = comparable.compareTo(comparable2);
            int i4 = b + 75;
            a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return iCompareTo;
        }
    }

    public J() {
        Comparator<Comparable> comparator = c;
        this.f = 0;
        this.h = 0;
        this.g = new blF();
        this.d = comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 16;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (f(obj) != null) {
            int i5 = a;
            int i6 = (i5 & (-50)) | ((~i5) & 49);
            int i7 = -(-((i5 & 49) << 1));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            int i9 = i8 % 128;
            b = i9;
            z = i8 % 2 != 0;
            int i10 = i9 & 79;
            int i11 = i10 + ((i9 ^ 79) | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = b;
            int i14 = ((i13 & 53) - (~(i13 | 53))) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = a;
        int i17 = ((i16 & 80) + (i16 | 80)) - 1;
        b = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 40 / 0;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = i3 + ((i2 ^ 19) | i3);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        blB blb = this.i;
        if (blb == null) {
            blb = new blB();
            this.i = blb;
            int i5 = a;
            int i6 = i5 & 79;
            int i7 = ((((i5 ^ 79) | i6) << 1) - (~(-((i5 | 79) & (~i6))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = b;
        int i10 = (((i9 & (-18)) | ((~i9) & 17)) - (~((i9 & 17) << 1))) - 1;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return blb;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o000oOoO.OooO<K, V> f(Object obj) {
        o000oOoO.OooO<K, V> oooOD;
        int i = 2 % 2;
        int i2 = b + 5;
        int i3 = i2 % 128;
        a = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != 0) {
            int i4 = i3 & 65;
            int i5 = -(-((i3 ^ 65) | i4));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            try {
                oooOD = d(obj, false);
            } catch (ClassCastException unused) {
                oooOD = null;
            }
        } else {
            oooOD = null;
        }
        int i8 = b;
        int i9 = i8 & 75;
        int i10 = (((i8 ^ 75) | i9) << 1) - ((i8 | 75) & (~i9));
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return oooOD;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        V v;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = ((i2 ^ 41) | i3) << 1;
        int i5 = -((i2 | 41) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        o000oOoO.OooO<K, V> oooOF = f(obj);
        if (oooOF != null) {
            int i8 = a;
            int i9 = ((i8 ^ 72) + ((i8 & 72) << 1)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            h(oooOF, true);
            int i11 = b;
            int i12 = (i11 & 113) + (i11 | 113);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        if (oooOF != null) {
            int i14 = a;
            int i15 = i14 & 15;
            int i16 = (i14 ^ 15) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            v = oooOF.j;
            int i19 = a;
            int i20 = (-2) - (((i19 ^ 32) + ((i19 & 32) << 1)) ^ (-1));
            b = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int i22 = b;
            int i23 = (i22 ^ 3) + ((i22 & 3) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            v = null;
        }
        int i25 = b;
        int i26 = (i25 & 55) + (i25 | 55);
        a = i26 % 128;
        int i27 = i26 % 2;
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 29) << 1;
        int i4 = -(i2 ^ 29);
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.f;
        if (i6 != 0) {
            int i8 = 40 / 0;
        }
        int i9 = (i2 ^ 27) + ((i2 & 27) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i7;
    }

    public abstract class blA<T> implements Iterator<T> {
        private static int a = 0;
        private static int b = 1;
        public o000oOoO.OooO<K, V> c;
        public o000oOoO.OooO<K, V> d = null;
        public int e;

        public blA() {
            this.c = J.this.g.h;
            this.e = J.this.h;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            boolean z;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 66) + ((i2 & 66) << 1)) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                o000oOoO.OooO<K, V> oooO = J.this.g;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.c != J.this.g) {
                int i4 = a;
                int i5 = i4 & 121;
                int i6 = (((i4 ^ 121) | i5) << 1) - ((i4 | 121) & (~i5));
                b = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                int i8 = b;
                int i9 = (((i8 | 53) << 1) - (~(-(((~i8) & 53) | (i8 & (-54)))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            int i11 = a;
            int i12 = ((i11 | 25) << 1) - (i11 ^ 25);
            b = i12 % 128;
            int i13 = i12 % 2;
            return z;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 97) + ((i2 & 97) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            o000oOoO.OooO<K, V> oooO = this.d;
            if (oooO == null) {
                throw new IllegalStateException();
            }
            int i5 = i2 & 87;
            int i6 = i5 + ((i2 ^ 87) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            J.this.h(oooO, true);
            this.d = null;
            int i8 = J.this.h;
            int i9 = a;
            int i10 = i9 & 93;
            int i11 = i10 + ((i9 ^ 93) | i10);
            b = i11 % 128;
            int i12 = i11 % 2;
            this.e = i8;
            int i13 = i9 & 11;
            int i14 = (i9 ^ 11) | i13;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            b = i15 % 128;
            int i16 = i15 % 2;
        }

        public final o000oOoO.OooO<K, V> c() {
            int i = 2 % 2;
            int i2 = (-2) - ((a + 48) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            o000oOoO.OooO<K, V> oooO = this.c;
            J j = J.this;
            if (oooO == j.g) {
                throw new NoSuchElementException();
            }
            int i4 = a;
            int i5 = i4 & 65;
            int i6 = i5 + ((i4 ^ 65) | i5);
            b = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                int i7 = j.h;
                throw null;
            }
            if (j.h != this.e) {
                throw new ConcurrentModificationException();
            }
            int i8 = b;
            int i9 = ((i8 ^ 69) | (i8 & 69)) << 1;
            int i10 = -(((~i8) & 69) | (i8 & (-70)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                this.c = oooO.h;
                this.d = oooO;
                obj.hashCode();
                throw null;
            }
            this.c = oooO.h;
            this.d = oooO;
            int i12 = a;
            int i13 = i12 & 47;
            int i14 = ((i12 ^ 47) | i13) << 1;
            int i15 = -((i12 | 47) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            int i17 = i16 % 128;
            b = i17;
            int i18 = i16 % 2;
            int i19 = (i17 ^ 1) + ((i17 & 1) << 1);
            a = i19 % 128;
            int i20 = i19 % 2;
            return oooO;
        }
    }

    static {
        int i = a;
        int i2 = (((i | 82) << 1) - (i ^ 82)) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v;
        int i = 2 % 2;
        int i2 = a + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        o000oOoO.OooO<K, V> oooOF = f(obj);
        if (oooOF != null) {
            int i4 = b;
            int i5 = ((i4 & (-56)) | ((~i4) & 55)) + ((i4 & 55) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                v = oooOF.j;
                int i6 = 1 / 0;
            } else {
                v = oooOF.j;
            }
        } else {
            int i7 = b;
            int i8 = (i7 ^ 26) + ((i7 & 26) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            v = null;
        }
        int i11 = b;
        int i12 = i11 & 95;
        int i13 = -(-((i11 ^ 95) | i12));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-50)) | ((~i2) & 49);
        int i4 = -(-((i2 & 49) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        blD bld = this.j;
        if (bld == null) {
            bld = new blD();
            int i7 = a;
            int i8 = ((i7 & 34) + (i7 | 34)) - 1;
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            this.j = bld;
            int i11 = (((i9 | 113) << 1) - (~(-(i9 ^ 113)))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = a;
        int i14 = i13 ^ 35;
        int i15 = -(-((i13 & 35) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        int i17 = i16 % 2;
        return bld;
    }

    public final void c(o000oOoO.OooO<K, V> oooO, o000oOoO.OooO<K, V> oooO2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 70) << 1) - (i2 ^ 70)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        o000oOoO.OooO<K, V> oooO3 = oooO.d;
        Object obj = null;
        oooO.d = null;
        if (oooO2 != null) {
            int i5 = a;
            int i6 = i5 & 49;
            int i7 = -(-(i5 | 49));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            oooO2.d = oooO3;
            if (i9 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        if (oooO3 == null) {
            this.e = oooO2;
            int i10 = b;
            int i11 = (i10 | 109) << 1;
            int i12 = -(((~i10) & 109) | (i10 & (-110)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        int i15 = a;
        int i16 = (i15 & 47) + (i15 | 47);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            o000oOoO.OooO<K, V> oooO4 = oooO3.e;
            throw null;
        }
        if (oooO3.e != oooO) {
            oooO3.f = oooO2;
            int i17 = b;
            int i18 = i17 & 13;
            int i19 = (((i17 | 13) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
            a = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i20 = b;
        int i21 = (((i20 ^ 47) | (i20 & 47)) << 1) - (((~i20) & 47) | (i20 & (-48)));
        a = i21 % 128;
        int i22 = i21 % 2;
        oooO3.e = oooO2;
        int i23 = a;
        int i24 = i23 & 39;
        int i25 = (i24 - (~((i23 ^ 39) | i24))) - 1;
        b = i25 % 128;
        int i26 = i25 % 2;
    }

    public final o000oOoO.OooO<K, V> e(Map.Entry<?, ?> entry) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 19) << 1) - (i2 ^ 19);
        a = i3 % 128;
        int i4 = i3 % 2;
        o000oOoO.OooO<K, V> oooOF = f(entry.getKey());
        if (oooOF != null) {
            int i5 = a + 55;
            b = i5 % 128;
            int i6 = i5 % 2;
            V v = oooOF.j;
            Object value = entry.getValue();
            int i7 = b + 35;
            int i8 = i7 % 128;
            a = i8;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (v != value) {
                if (v != null) {
                    int i9 = (-2) - ((i8 + 46) ^ (-1));
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        boolean zEquals = v.equals(value);
                        int i10 = 66 / 0;
                        if (!zEquals) {
                        }
                    } else if (!v.equals(value)) {
                    }
                }
                int i11 = a;
                int i12 = i11 & 103;
                int i13 = i11 | 103;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                int i16 = a;
                int i17 = i16 & 51;
                int i18 = -(-((i16 ^ 51) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                int i20 = i19 % 128;
                b = i20;
                int i21 = i19 % 2;
                int i22 = (i20 & (-54)) | ((~i20) & 53);
                int i23 = (i20 & 53) << 1;
                int i24 = (i22 & i23) + (i23 | i22);
                a = i24 % 128;
                int i25 = i24 % 2;
                oooOF = null;
            }
            int i26 = a;
            int i27 = i26 + 27;
            b = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i26 & 77;
            int i30 = ((i26 ^ 77) | i29) << 1;
            int i31 = -((i26 | 77) & (~i29));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i33 = i32 % 128;
            b = i33;
            int i34 = i32 % 2;
            int i35 = ((i33 ^ 48) + ((i33 & 48) << 1)) - 1;
            a = i35 % 128;
            int i36 = i35 % 2;
            int i37 = i33 + 58;
            int i38 = (i37 ^ (-1)) + (i37 << 1);
            a = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 91 / 0;
            }
        } else {
            int i110 = a;
            int i111 = i110 & 51;
            int i112 = -(-((i110 ^ 51) | i111));
            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
            int i210 = i113 % 128;
            b = i210;
            int i211 = i113 % 2;
            int i212 = (i210 & (-54)) | ((~i210) & 53);
            int i213 = (i210 & 53) << 1;
            int i214 = (i212 & i213) + (i213 | i212);
            a = i214 % 128;
            int i215 = i214 % 2;
            oooOF = null;
        }
        int i40 = b;
        int i41 = (-2) - ((((i40 | 40) << 1) - (i40 ^ 40)) ^ (-1));
        a = i41 % 128;
        int i42 = i41 % 2;
        return oooOF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = 2 % 2;
        int i2 = a + 37;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.e = null;
        this.f = 0;
        int i5 = ((i3 | 114) << 1) - (i3 ^ 114);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.h /= 0;
        } else {
            this.h++;
        }
        o000oOoO.OooO<K, V> oooO = this.g;
        oooO.g = oooO;
        oooO.h = oooO;
        int i7 = (-2) - ((b + 24) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 112) << 1) - (i2 ^ 112)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(k, "key == null");
        o000oOoO.OooO<K, V> oooOD = d(k, true);
        int i5 = a + 99;
        b = i5 % 128;
        int i6 = i5 % 2;
        V v2 = oooOD.j;
        oooOD.j = v;
        int i7 = b;
        int i8 = (((i7 | 78) << 1) - (i7 ^ 78)) - 1;
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        int i11 = i9 & 39;
        int i12 = ((i9 ^ 39) | i11) << 1;
        int i13 = -((i9 | 39) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        return v2;
    }

    public final void i(o000oOoO.OooO<K, V> oooO) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 103;
        int i7 = (i5 | 103) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        o000oOoO.OooO<K, V> oooO2 = oooO.e;
        o000oOoO.OooO<K, V> oooO3 = oooO.f;
        o000oOoO.OooO<K, V> oooO4 = oooO3.e;
        int i11 = b;
        int i12 = (i11 ^ 79) + ((i11 & 79) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        o000oOoO.OooO<K, V> oooO5 = oooO3.f;
        oooO.f = oooO4;
        if (oooO4 != null) {
            int i14 = a;
            int i15 = i14 & 73;
            int i16 = ((i14 | 73) & (~i15)) + (i15 << 1);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                oooO4.d = oooO;
                throw null;
            }
            oooO4.d = oooO;
        }
        c(oooO, oooO3);
        oooO3.e = oooO;
        int i17 = b;
        int i18 = (i17 & (-2)) | ((~i17) & 1);
        int i19 = (i17 & 1) << 1;
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        oooO.d = oooO3;
        int i22 = 0;
        if (oooO2 != null) {
            int i23 = a + 122;
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            b = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = oooO2.c;
                throw null;
            }
            i = oooO2.c;
            int i26 = b + 3;
            a = i26 % 128;
            int i27 = i26 % 2;
        } else {
            int i28 = a;
            int i29 = i28 & 19;
            int i30 = i28 | 19;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            b = i31 % 128;
            int i32 = i31 % 2;
            i = 0;
        }
        if (oooO4 != null) {
            int i33 = b;
            int i34 = i33 ^ 59;
            int i35 = ((i33 & 59) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            a = i37 % 128;
            if (i37 % 2 != 0) {
                i2 = oooO4.c;
                int i38 = 45 / 0;
            } else {
                i2 = oooO4.c;
            }
        } else {
            int i39 = b;
            int i40 = (((i39 | 54) << 1) - (i39 ^ 54)) - 1;
            a = i40 % 128;
            int i41 = i40 % 2;
            i2 = 0;
        }
        int iMax = Math.max(i, i2);
        int i42 = iMax & 1;
        int i43 = (i42 - (~(-(-((iMax ^ 1) | i42))))) - 1;
        oooO.c = i43;
        int i44 = b;
        int i45 = (i44 | 57) << 1;
        int i46 = -(i44 ^ 57);
        int i47 = (i45 & i46) + (i46 | i45);
        int i48 = i47 % 128;
        a = i48;
        int i49 = i47 % 2;
        if (oooO5 != null) {
            int i50 = i48 + 47;
            b = i50 % 128;
            if (i50 % 2 == 0) {
                i3 = oooO5.c;
                int i51 = 53 / 0;
            } else {
                i3 = oooO5.c;
            }
            i22 = i3;
        }
        int iMax2 = Math.max(i43, i22);
        oooO3.c = ((iMax2 ^ 2) + ((iMax2 & 2) << 1)) - 1;
        int i52 = b;
        int i53 = (-2) - (((i52 & 112) + (i52 | 112)) ^ (-1));
        a = i53 % 128;
        if (i53 % 2 != 0) {
            throw null;
        }
    }

    public final void h(o000oOoO.OooO<K, V> oooO, boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 ^ 107) + ((i4 & 107) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (z) {
            o000oOoO.OooO<K, V> oooO2 = oooO.g;
            oooO2.h = oooO.h;
            int i6 = a;
            int i7 = (-2) - ((((i6 | 54) << 1) - (i6 ^ 54)) ^ (-1));
            b = i7 % 128;
            int i8 = i7 % 2;
            oooO.h.g = oooO2;
            int i9 = b + 59;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        o000oOoO.OooO<K, V> oooO3 = oooO.e;
        o000oOoO.OooO<K, V> oooO4 = oooO.f;
        int i11 = b;
        int i12 = i11 & 3;
        int i13 = (i11 ^ 3) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        o000oOoO.OooO<K, V> oooO5 = oooO.d;
        if (oooO3 != null) {
            int i16 = b;
            int i17 = i16 & 69;
            int i18 = (i17 - (~(-(-((i16 ^ 69) | i17))))) - 1;
            int i19 = i18 % 128;
            a = i19;
            int i20 = i18 % 2;
            if (oooO4 != null) {
                int i21 = (i19 ^ 15) + ((i19 & 15) << 1);
                b = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = oooO3.c;
                    int i23 = oooO4.c;
                    obj.hashCode();
                    throw null;
                }
                if (oooO3.c <= oooO4.c) {
                    o000oOoO.OooO<K, V> oooO6 = oooO4.e;
                    int i24 = b;
                    int i25 = ((i24 & 102) + (i24 | 102)) - 1;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                    while (true) {
                        o000oOoO.OooO<K, V> oooO7 = oooO4;
                        oooO4 = oooO6;
                        oooO3 = oooO7;
                        if (oooO4 == null) {
                            int i27 = b;
                            int i28 = i27 & 25;
                            int i29 = (((i27 | 25) & (~i28)) - (~(i28 << 1))) - 1;
                            a = i29 % 128;
                            int i30 = i29 % 2;
                            break;
                        }
                        int i31 = b;
                        int i32 = ((i31 ^ 109) - (~((i31 & 109) << 1))) - 1;
                        a = i32 % 128;
                        if (i32 % 2 != 0) {
                            o000oOoO.OooO<K, V> oooO8 = oooO4.e;
                            throw null;
                        }
                        oooO6 = oooO4.e;
                        int i33 = a;
                        int i34 = ((i33 ^ 107) | (i33 & 107)) << 1;
                        int i35 = -((i33 & (-108)) | ((~i33) & 107));
                        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                        b = i36 % 128;
                        if (i36 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        int i37 = i33 + 95;
                        b = i37 % 128;
                        int i38 = i37 % 2;
                    }
                } else {
                    o000oOoO.OooO<K, V> oooO9 = oooO3.f;
                    int i39 = b;
                    int i40 = ((i39 & (-10)) | ((~i39) & 9)) + ((i39 & 9) << 1);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    while (oooO9 != null) {
                        int i42 = b;
                        int i43 = i42 & 105;
                        int i44 = ((i42 | 105) & (~i43)) + (i43 << 1);
                        a = i44 % 128;
                        if (i44 % 2 != 0) {
                            o000oOoO.OooO<K, V> oooO10 = oooO9.f;
                            throw null;
                        }
                        o000oOoO.OooO<K, V> oooO11 = oooO9.f;
                        int i45 = a;
                        int i46 = i45 & 73;
                        int i47 = i45 | 73;
                        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                        b = i48 % 128;
                        int i49 = i48 % 2;
                        o000oOoO.OooO<K, V> oooO12 = oooO9;
                        oooO9 = oooO11;
                        oooO3 = oooO12;
                    }
                }
                h(oooO3, false);
                o000oOoO.OooO<K, V> oooO13 = oooO.e;
                if (oooO13 != null) {
                    int i50 = a;
                    int i51 = ((i50 | 75) << 1) - (i50 ^ 75);
                    b = i51 % 128;
                    if (i51 % 2 == 0) {
                        int i52 = oooO13.c;
                        oooO3.e = oooO13;
                        obj.hashCode();
                        throw null;
                    }
                    i = oooO13.c;
                    oooO3.e = oooO13;
                    oooO13.d = oooO3;
                    oooO.e = null;
                    int i53 = a + 109;
                    b = i53 % 128;
                    int i54 = i53 % 2;
                } else {
                    int i55 = a;
                    int i56 = ((i55 ^ 99) | (i55 & 99)) << 1;
                    int i57 = -(((~i55) & 99) | (i55 & (-100)));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    b = i58 % 128;
                    int i59 = i58 % 2;
                    i = 0;
                }
                o000oOoO.OooO<K, V> oooO14 = oooO.f;
                if (oooO14 != null) {
                    int i60 = a;
                    int i61 = ((i60 | 50) << 1) - (i60 ^ 50);
                    int i62 = (i61 ^ (-1)) + (i61 << 1);
                    b = i62 % 128;
                    int i63 = i62 % 2;
                    i2 = oooO14.c;
                    oooO3.f = oooO14;
                    int i64 = b;
                    int i65 = (i64 & 5) + (i64 | 5);
                    a = i65 % 128;
                    if (i65 % 2 != 0) {
                        oooO14.d = oooO3;
                        oooO.f = null;
                        int i66 = 80 / 0;
                    } else {
                        oooO14.d = oooO3;
                        oooO.f = null;
                    }
                } else {
                    i2 = 0;
                }
                int iMax = Math.max(i, i2);
                oooO3.c = ((iMax | 1) << 1) - (iMax ^ 1);
                int i67 = b + 9;
                a = i67 % 128;
                int i68 = i67 % 2;
                c(oooO, oooO3);
                int i69 = a;
                int i70 = (((i69 | 42) << 1) - (i69 ^ 42)) - 1;
                b = i70 % 128;
                if (i70 % 2 == 0) {
                    int i71 = 70 / 0;
                    return;
                }
                return;
            }
        }
        if (oooO3 != null) {
            int i72 = a + 23;
            b = i72 % 128;
            int i73 = i72 % 2;
            c(oooO, oooO3);
            oooO.e = null;
            int i74 = b;
            int i75 = i74 & 49;
            int i76 = i75 + ((i74 ^ 49) | i75);
            a = i76 % 128;
            int i77 = i76 % 2;
        } else if (oooO4 != null) {
            int i78 = b;
            int i79 = i78 ^ 107;
            int i80 = -(-((i78 & 107) << 1));
            int i81 = (i79 & i80) + (i80 | i79);
            a = i81 % 128;
            if (i81 % 2 != 0) {
                c(oooO, oooO4);
                oooO.f = null;
                obj.hashCode();
                throw null;
            }
            c(oooO, oooO4);
            oooO.f = null;
        } else {
            c(oooO, null);
            int i82 = a;
            int i83 = i82 ^ 77;
            int i84 = (((i82 & 77) | i83) << 1) - i83;
            b = i84 % 128;
            int i85 = i84 % 2;
        }
        g(oooO5, false);
        int i86 = this.f;
        int i87 = (i86 ^ (-1)) | i86;
        this.f = (i86 & i87) + (i86 | i87);
        int i88 = b;
        int i89 = ((i88 | 52) << 1) - (i88 ^ 52);
        int i90 = (i89 ^ (-1)) + (i89 << 1);
        a = i90 % 128;
        int i91 = i90 % 2;
        int i92 = this.h;
        int i93 = i92 & 1;
        this.h = ((((i92 ^ 1) | i93) << 1) - (~(-((i92 | 1) & (~i93))))) - 1;
        int i94 = i88 & 7;
        int i95 = -(-((i88 ^ 7) | i94));
        int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
        a = i96 % 128;
        if (i96 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[PHI: r5
  0x0047: PHI (r5v7 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>) = 
  (r5v6 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>)
  (r5v24 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>)
 binds: [B:8:0x0045, B:5:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void j(o000oOoO.OooO<K, V> oooO) {
        o000oOoO.OooO<K, V> oooO2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (-2) - (((i4 ^ 58) + ((i4 & 58) << 1)) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        o000oOoO.OooO<K, V> oooO3 = oooO.e;
        o000oOoO.OooO<K, V> oooO4 = oooO.f;
        o000oOoO.OooO<K, V> oooO5 = oooO3.e;
        int i7 = a;
        int i8 = ((((i7 ^ 19) | (i7 & 19)) << 1) - (~(-(((~i7) & 19) | (i7 & (-20)))))) - 1;
        b = i8 % 128;
        int i9 = 0;
        if (i8 % 2 == 0) {
            oooO2 = oooO3.f;
            oooO.e = oooO2;
            int i10 = 0 / 0;
            if (oooO2 != null) {
                oooO2.d = oooO;
                int i11 = a;
                int i12 = (i11 ^ 43) + ((i11 & 43) << 1);
                b = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            oooO2 = oooO3.f;
            oooO.e = oooO2;
            if (oooO2 != null) {
                oooO2.d = oooO;
                int i14 = a;
                int i15 = (i14 ^ 43) + ((i14 & 43) << 1);
                b = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        c(oooO, oooO3);
        oooO3.f = oooO;
        int i17 = b;
        int i18 = i17 & 13;
        int i19 = ((i17 ^ 13) | i18) << 1;
        int i20 = -((i17 | 13) & (~i18));
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        oooO.d = oooO3;
        if (oooO4 != null) {
            int i23 = a;
            int i24 = (-2) - (((i23 & 18) + (i23 | 18)) ^ (-1));
            b = i24 % 128;
            int i25 = i24 % 2;
            i = oooO4.c;
            int i26 = b;
            int i27 = i26 ^ 81;
            int i28 = -(-((i26 & 81) << 1));
            int i29 = (i27 & i28) + (i28 | i27);
            a = i29 % 128;
            int i30 = i29 % 2;
        } else {
            int i31 = a;
            int i32 = (i31 & (-4)) | ((~i31) & 3);
            int i33 = (i31 & 3) << 1;
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            b = i34 % 128;
            int i35 = i34 % 2;
            i = 0;
        }
        Object obj = null;
        if (oooO2 != null) {
            int i36 = a;
            int i37 = i36 & 73;
            int i38 = ((i36 ^ 73) | i37) << 1;
            int i39 = -((i36 | 73) & (~i37));
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            b = i40 % 128;
            if (i40 % 2 == 0) {
                int i41 = oooO2.c;
                throw null;
            }
            i2 = oooO2.c;
            int i42 = a;
            int i43 = i42 | 111;
            int i44 = i43 << 1;
            int i45 = -((~(i42 & 111)) & i43);
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            b = i46 % 128;
            int i47 = i46 % 2;
        } else {
            int i48 = b + 101;
            a = i48 % 128;
            int i49 = i48 % 2;
            i2 = 0;
        }
        int iMax = Math.max(i, i2) + 1;
        oooO.c = iMax;
        int i50 = a;
        int i51 = i50 & 115;
        int i52 = (i51 - (~(-(-((i50 ^ 115) | i51))))) - 1;
        b = i52 % 128;
        if (i52 % 2 != 0 ? oooO5 != null : oooO5 != null) {
            int i53 = (i50 & (-24)) | ((~i50) & 23);
            int i54 = (i50 & 23) << 1;
            int i55 = (i53 & i54) + (i54 | i53);
            b = i55 % 128;
            int i56 = i55 % 2;
            i9 = oooO5.c;
            int i57 = b + 49;
            a = i57 % 128;
            int i58 = i57 % 2;
        }
        int iMax2 = Math.max(iMax, i9);
        int i59 = iMax2 & 1;
        oooO3.c = ((iMax2 | 1) & (~i59)) + (i59 << 1);
        int i60 = a;
        int i61 = i60 & 41;
        int i62 = (i60 | 41) & (~i61);
        int i63 = i61 << 1;
        int i64 = (i62 & i63) + (i62 | i63);
        b = i64 % 128;
        if (i64 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:45:0x013d A[PHI: r2 r7
  0x013d: PHI (r2v24 java.util.Comparator<? super K>) = (r2v3 java.util.Comparator<? super K>), (r2v25 java.util.Comparator<? super K>) binds: [B:8:0x0024, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x013d: PHI (r7v10 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>) = 
  (r7v0 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>)
  (r7v11 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>)
 binds: [B:8:0x0024, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:61:0x0187  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0145 A[EDGE_INSN: B:81:0x0145->B:46:0x0145 BREAK  A[LOOP:0: B:17:0x0065->B:43:0x0139], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r2 r7
  0x0026: PHI (r2v4 java.util.Comparator<? super K>) = (r2v3 java.util.Comparator<? super K>), (r2v25 java.util.Comparator<? super K>) binds: [B:8:0x0024, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r7v1 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>) = 
  (r7v0 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>)
  (r7v11 ivas.gov.bisp.enumeration.o000O0O.o000oOoO$OooO<K, V>)
 binds: [B:8:0x0024, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public final o000oOoO.OooO<K, V> d(K k, boolean z) {
        Comparator<? super K> comparator;
        o000oOoO.OooO<K, V> oooO;
        Comparable comparable;
        int iCompare;
        int i;
        int i2;
        int i3;
        o000oOoO.OooO<K, V> oooO2;
        int i4;
        int i5;
        int i6;
        int i7;
        blF blf;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = (i9 & 109) + (i9 | 109);
        int i11 = i10 % 128;
        a = i11;
        Object obj = null;
        if (i10 % 2 != 0) {
            comparator = this.d;
            oooO = this.e;
            int i12 = 8 / 0;
            if (oooO != null) {
                if (comparator == c) {
                    int i13 = i11 & 57;
                    int i14 = -(-(i11 | 57));
                    i7 = (i13 & i14) + (i14 | i13);
                    int i15 = i7 % 128;
                    b = i15;
                    if (i7 % 2 == 0) {
                        comparable = (Comparable) k;
                        int i16 = 89 / 0;
                    } else {
                        comparable = (Comparable) k;
                    }
                    int i17 = i15 & 41;
                    int i18 = -(-((i15 ^ 41) | i17));
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    int i21 = i11 & 71;
                    int i22 = ((i11 | 71) & (~i21)) + (i21 << 1);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    comparable = null;
                }
                while (true) {
                    if (comparable != null) {
                        int i24 = b;
                        i6 = (i24 ^ 49) + ((i24 & 49) << 1);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            comparable.compareTo(oooO.i);
                            throw null;
                        }
                        iCompare = comparable.compareTo(oooO.i);
                        int i25 = a;
                        int i26 = i25 & 123;
                        int i27 = -(-((i25 ^ 123) | i26));
                        int i28 = (i26 & i27) + (i26 | i27);
                        b = i28 % 128;
                        int i29 = i28 % 2;
                        int i30 = i25 & 51;
                        int i31 = -(-((i25 ^ 51) | i30));
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        b = i32 % 128;
                        int i33 = i32 % 2;
                    } else {
                        iCompare = comparator.compare(k, oooO.i);
                        int i34 = a;
                        int i35 = i34 & 59;
                        i = i35 + ((i34 ^ 59) | i35);
                        i2 = i % 128;
                        b = i2;
                        if (i % 2 != 0) {
                            throw null;
                        }
                        int i36 = i2 + 51;
                        a = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    if (iCompare == 0) {
                        if (iCompare < 0) {
                            int i38 = a;
                            int i39 = i38 & 15;
                            int i40 = -(-((i38 ^ 15) | i39));
                            i5 = ((i39 | i40) << 1) - (i40 ^ i39);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                o000oOoO.OooO<K, V> oooO3 = oooO.e;
                                obj.hashCode();
                                throw null;
                            }
                            oooO2 = oooO.e;
                        } else {
                            oooO2 = oooO.f;
                            int i41 = a;
                            int i42 = (-2) - ((((i41 | 18) << 1) - (i41 ^ 18)) ^ (-1));
                            b = i42 % 128;
                            int i43 = i42 % 2;
                        }
                        if (oooO2 != null) {
                            break;
                        }
                        int i44 = b;
                        int i45 = (i44 & 110) + (i44 | 110);
                        int i46 = (i45 ^ (-1)) + (i45 << 1);
                        a = i46 % 128;
                        int i47 = i46 % 2;
                        int i48 = i44 & 67;
                        int i49 = i44 | 67;
                        i4 = ((i48 | i49) << 1) - (i49 ^ i48);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i50 = 4 % 3;
                        }
                        oooO = oooO2;
                    } else {
                        int i51 = a;
                        i3 = (i51 ^ 97) + ((i51 & 97) << 1);
                        int i52 = i3 % 128;
                        b = i52;
                        if (i3 % 2 == 0) {
                            int i53 = 13 / 0;
                        }
                        int i54 = i52 & 125;
                        int i55 = i54 + ((i52 ^ 125) | i54);
                        a = i55 % 128;
                        int i56 = i55 % 2;
                        return oooO;
                    }
                }
            } else {
                int i57 = i11 + 25;
                b = i57 % 128;
                int i58 = i57 % 2;
                iCompare = 0;
            }
        } else {
            comparator = this.d;
            oooO = this.e;
            if (oooO != null) {
                if (comparator == c) {
                    int i110 = i11 & 57;
                    int i111 = -(-(i11 | 57));
                    i7 = (i110 & i111) + (i111 | i110);
                    int i112 = i7 % 128;
                    b = i112;
                    if (i7 % 2 == 0) {
                        comparable = (Comparable) k;
                        int i113 = 89 / 0;
                    } else {
                        comparable = (Comparable) k;
                    }
                    int i114 = i112 & 41;
                    int i115 = -(-((i112 ^ 41) | i114));
                    int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                    a = i116 % 128;
                    int i210 = i116 % 2;
                } else {
                    int i211 = i11 & 71;
                    int i212 = ((i11 | 71) & (~i211)) + (i211 << 1);
                    b = i212 % 128;
                    int i213 = i212 % 2;
                    comparable = null;
                }
                while (true) {
                    if (comparable != null) {
                        int i214 = b;
                        i6 = (i214 ^ 49) + ((i214 & 49) << 1);
                        a = i6 % 128;
                        if (i6 % 2 == 0) {
                            comparable.compareTo(oooO.i);
                            throw null;
                        }
                        iCompare = comparable.compareTo(oooO.i);
                        int i215 = a;
                        int i216 = i215 & 123;
                        int i217 = -(-((i215 ^ 123) | i216));
                        int i218 = (i216 & i217) + (i216 | i217);
                        b = i218 % 128;
                        int i219 = i218 % 2;
                        int i310 = i215 & 51;
                        int i311 = -(-((i215 ^ 51) | i310));
                        int i312 = ((i310 | i311) << 1) - (i311 ^ i310);
                        b = i312 % 128;
                        int i313 = i312 % 2;
                    } else {
                        iCompare = comparator.compare(k, oooO.i);
                        int i314 = a;
                        int i315 = i314 & 59;
                        i = i315 + ((i314 ^ 59) | i315);
                        i2 = i % 128;
                        b = i2;
                        if (i % 2 != 0) {
                            throw null;
                        }
                        int i316 = i2 + 51;
                        a = i316 % 128;
                        int i317 = i316 % 2;
                    }
                    if (iCompare == 0) {
                        if (iCompare < 0) {
                            int i318 = a;
                            int i319 = i318 & 15;
                            int i410 = -(-((i318 ^ 15) | i319));
                            i5 = ((i319 | i410) << 1) - (i410 ^ i319);
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                o000oOoO.OooO<K, V> oooO4 = oooO.e;
                                obj.hashCode();
                                throw null;
                            }
                            oooO2 = oooO.e;
                        } else {
                            oooO2 = oooO.f;
                            int i411 = a;
                            int i412 = (-2) - ((((i411 | 18) << 1) - (i411 ^ 18)) ^ (-1));
                            b = i412 % 128;
                            int i413 = i412 % 2;
                        }
                        if (oooO2 != null) {
                            break;
                            break;
                        }
                        int i414 = b;
                        int i415 = (i414 & 110) + (i414 | 110);
                        int i416 = (i415 ^ (-1)) + (i415 << 1);
                        a = i416 % 128;
                        int i417 = i416 % 2;
                        int i418 = i414 & 67;
                        int i419 = i414 | 67;
                        i4 = ((i418 | i419) << 1) - (i419 ^ i418);
                        a = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i59 = 4 % 3;
                        }
                        oooO = oooO2;
                    } else {
                        int i510 = a;
                        i3 = (i510 ^ 97) + ((i510 & 97) << 1);
                        int i511 = i3 % 128;
                        b = i511;
                        if (i3 % 2 == 0) {
                            int i512 = 13 / 0;
                        }
                        int i513 = i511 & 125;
                        int i514 = i513 + ((i511 ^ 125) | i513);
                        a = i514 % 128;
                        int i515 = i514 % 2;
                        return oooO;
                    }
                }
            } else {
                int i516 = i11 + 25;
                b = i516 % 128;
                int i517 = i516 % 2;
                iCompare = 0;
            }
        }
        if (!z) {
            int i60 = a;
            int i61 = i60 & 123;
            int i62 = i61 + ((i60 ^ 123) | i61);
            int i63 = i62 % 128;
            b = i63;
            int i64 = i62 % 2;
            int i65 = ((i63 ^ 42) + ((i63 & 42) << 1)) - 1;
            a = i65 % 128;
            int i66 = i65 % 2;
            return null;
        }
        o000oOoO.OooO<K, V> oooO5 = this.g;
        if (oooO == null) {
            int i67 = a;
            int i68 = i67 ^ 41;
            int i69 = (((i67 & 41) | i68) << 1) - i68;
            b = i69 % 128;
            if (i69 % 2 == 0) {
                int i70 = 20 / 0;
                if (comparator == c) {
                    if (!(k instanceof Comparable)) {
                        StringBuilder sb = new StringBuilder();
                        int i71 = b;
                        int i72 = i71 & 101;
                        int i73 = -(-((i71 ^ 101) | i72));
                        int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                        a = i74 % 128;
                        int i75 = i74 % 2;
                        sb.append(k.getClass().getName());
                        sb.append(" is not Comparable");
                        throw new ClassCastException(sb.toString());
                    }
                }
            } else if (comparator == c) {
                if (!(k instanceof Comparable)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i76 = b;
                    int i77 = i76 & 101;
                    int i78 = -(-((i76 ^ 101) | i77));
                    int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                    a = i79 % 128;
                    int i710 = i79 % 2;
                    sb2.append(k.getClass().getName());
                    sb2.append(" is not Comparable");
                    throw new ClassCastException(sb2.toString());
                }
            }
            blf = new blF(oooO, k, oooO5, oooO5.g);
            int i80 = b;
            int i81 = i80 & 13;
            int i82 = ((i80 ^ 13) | i81) << 1;
            int i83 = -((i80 | 13) & (~i81));
            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
            int i85 = i84 % 128;
            a = i85;
            int i86 = i84 % 2;
            this.e = blf;
            int i87 = (i85 & 97) + (i85 | 97);
            b = i87 % 128;
            if (i87 % 2 == 0) {
                int i88 = 2 / 3;
            }
        } else {
            blF blf2 = new blF(oooO, k, oooO5, oooO5.g);
            int i89 = a;
            int i90 = (i89 & 12) + (i89 | 12);
            int i91 = (i90 ^ (-1)) + (i90 << 1);
            int i92 = i91 % 128;
            b = i92;
            if (i91 % 2 == 0) {
                throw null;
            }
            if (iCompare < 0) {
                int i93 = i92 ^ 69;
                int i94 = -(-((i92 & 69) << 1));
                int i95 = (i93 ^ i94) + ((i93 & i94) << 1);
                a = i95 % 128;
                int i96 = i95 % 2;
                oooO.e = blf2;
                int i97 = a;
                int i98 = ((i97 & 107) - (~(-(-(i97 | 107))))) - 1;
                b = i98 % 128;
                if (i98 % 2 == 0) {
                    int i99 = 2 % 5;
                }
            } else {
                oooO.f = blf2;
                int i100 = a + 91;
                b = i100 % 128;
                int i101 = i100 % 2;
            }
            g(oooO, true);
            int i102 = b + 97;
            a = i102 % 128;
            int i103 = i102 % 2;
            blf = blf2;
        }
        int i104 = this.f;
        int i105 = i104 & 1;
        int i106 = -(-((i104 ^ 1) | i105));
        this.f = ((i105 | i106) << 1) - (i106 ^ i105);
        int i107 = b;
        int i108 = (i107 & (-68)) | ((~i107) & 67);
        int i109 = -(-((i107 & 67) << 1));
        int i117 = ((i108 | i109) << 1) - (i109 ^ i108);
        a = i117 % 128;
        if (i117 % 2 != 0) {
            this.h >>= 1;
        } else {
            int i118 = this.h;
            this.h = ((i118 ^ 1) - (~((i118 & 1) << 1))) - 1;
        }
        return blf;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0130  */
    public final void g(o000oOoO.OooO<K, V> oooO, boolean z) {
        int i;
        int i2;
        o000oOoO.OooO<K, V> oooO2;
        o000oOoO.OooO<K, V> oooO3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        while (true) {
            int i6 = 0;
            if (oooO == null) {
                break;
            }
            int i7 = b;
            int i8 = i7 & 39;
            int i9 = (i7 ^ 39) | i8;
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            Object obj = null;
            if (i10 % 2 != 0) {
                o000oOoO.OooO<K, V> oooO4 = oooO.e;
                o000oOoO.OooO<K, V> oooO5 = oooO.f;
                throw null;
            }
            o000oOoO.OooO<K, V> oooO6 = oooO.e;
            o000oOoO.OooO<K, V> oooO7 = oooO.f;
            if (oooO6 != null) {
                i = oooO6.c;
                int i11 = a + 75;
                b = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = a;
                int i14 = ((i13 & (-68)) | ((~i13) & 67)) + ((i13 & 67) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                i = 0;
            }
            if (oooO7 != null) {
                int i16 = a;
                int i17 = ((i16 & (-72)) | ((~i16) & 71)) + ((i16 & 71) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                i2 = oooO7.c;
                int i19 = b + 48;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
            } else {
                int i22 = a;
                int i23 = i22 | 21;
                int i24 = i23 << 1;
                int i25 = -((~(i22 & 21)) & i23);
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                b = i26 % 128;
                int i27 = i26 % 2;
                i2 = 0;
            }
            int i28 = (i - (~(-i2))) - 1;
            if (i28 != -2) {
                if (i28 != 2) {
                    if (i28 != 0) {
                        int iMax = Math.max(i, i2);
                        int i29 = ((iMax ^ 1) | (iMax & 1)) << 1;
                        int i30 = -(((~iMax) & 1) | (iMax & (-2)));
                        oooO.c = ((i29 | i30) << 1) - (i30 ^ i29);
                        if (!z) {
                            break;
                        }
                    } else {
                        int i31 = b;
                        int i32 = (-2) - ((((i31 | 6) << 1) - (i31 ^ 6)) ^ (-1));
                        a = i32 % 128;
                        if (i32 % 2 != 0) {
                            oooO.c = i % 0;
                            if (z) {
                                int i33 = a;
                                int i34 = (i33 ^ 71) + ((i33 & 71) << 1);
                                b = i34 % 128;
                                int i35 = i34 % 2;
                                return;
                            }
                        } else {
                            oooO.c = ((i ^ 2) + ((i & 2) << 1)) - 1;
                            if (z) {
                                int i36 = a;
                                int i37 = (i36 ^ 71) + ((i36 & 71) << 1);
                                b = i37 % 128;
                                int i38 = i37 % 2;
                                return;
                            }
                        }
                    }
                } else {
                    int i39 = a;
                    int i40 = (i39 & 19) + (i39 | 19);
                    b = i40 % 128;
                    if (i40 % 2 == 0) {
                        oooO2 = oooO6.e;
                        oooO3 = oooO6.f;
                        int i41 = 49 / 0;
                    } else {
                        oooO2 = oooO6.e;
                        oooO3 = oooO6.f;
                    }
                    if (oooO3 != null) {
                        int i42 = a;
                        int i43 = i42 & 69;
                        int i44 = ((i42 | 69) & (~i43)) + (i43 << 1);
                        b = i44 % 128;
                        if (i44 % 2 == 0) {
                            int i45 = oooO3.c;
                            obj.hashCode();
                            throw null;
                        }
                        i3 = oooO3.c;
                        int i46 = b;
                        int i47 = (i46 & 16) + (i46 | 16);
                        int i48 = (i47 ^ (-1)) + (i47 << 1);
                        a = i48 % 128;
                        int i49 = i48 % 2;
                    } else {
                        int i50 = a;
                        int i51 = ((i50 | 39) << 1) - ((39 & (~i50)) | (i50 & (-40)));
                        b = i51 % 128;
                        int i52 = i51 % 2;
                        i3 = 0;
                    }
                    if (oooO2 != null) {
                        int i53 = b + 15;
                        a = i53 % 128;
                        int i54 = i53 % 2;
                        i6 = oooO2.c;
                        int i55 = a;
                        int i56 = (((i55 | 126) << 1) - (i55 ^ 126)) - 1;
                        b = i56 % 128;
                        int i57 = i56 % 2;
                    }
                    int i58 = i6 - i3;
                    if (i58 != 1) {
                        int i59 = a;
                        int i60 = ((i59 & (-90)) | ((~i59) & 89)) + ((i59 & 89) << 1);
                        b = i60 % 128;
                        if (i60 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (i58 != 0 || z) {
                            i(oooO6);
                            int i61 = a;
                            int i62 = (i61 & 21) + (i61 | 21);
                            b = i62 % 128;
                            int i63 = i62 % 2;
                        }
                    }
                    j(oooO);
                    if (z) {
                        int i64 = a;
                        int i65 = i64 & 55;
                        int i66 = (((i64 ^ 55) | i65) << 1) - ((i64 | 55) & (~i65));
                        b = i66 % 128;
                        if (i66 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                }
            } else {
                int i67 = b;
                int i68 = i67 & 97;
                int i69 = ((i67 | 97) & (~i68)) + (i68 << 1);
                a = i69 % 128;
                if (i69 % 2 != 0) {
                    o000oOoO.OooO<K, V> oooO8 = oooO7.e;
                    o000oOoO.OooO<K, V> oooO9 = oooO7.f;
                    throw null;
                }
                o000oOoO.OooO<K, V> oooO10 = oooO7.e;
                o000oOoO.OooO<K, V> oooO11 = oooO7.f;
                int i70 = b;
                int i71 = ((((i70 ^ 75) | (i70 & 75)) << 1) - (~(-((i70 & (-76)) | ((~i70) & 75))))) - 1;
                int i72 = i71 % 128;
                a = i72;
                int i73 = i71 % 2;
                if (oooO11 != null) {
                    int i74 = i70 & 123;
                    int i75 = (i74 - (~((i70 ^ 123) | i74))) - 1;
                    a = i75 % 128;
                    if (i75 % 2 != 0) {
                        int i76 = oooO11.c;
                        throw null;
                    }
                    i4 = oooO11.c;
                } else {
                    int i77 = i72 & 75;
                    int i78 = i77 + ((i72 ^ 75) | i77);
                    b = i78 % 128;
                    int i79 = i78 % 2;
                    i4 = 0;
                }
                if (oooO10 != null) {
                    int i80 = b;
                    int i81 = i80 & 57;
                    int i82 = (i80 | 57) & (~i81);
                    int i83 = i81 << 1;
                    int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                    a = i84 % 128;
                    if (i84 % 2 != 0) {
                        int i85 = 44 / 0;
                        i6 = oooO10.c;
                    } else {
                        i6 = oooO10.c;
                    }
                    int i86 = a;
                    int i87 = i86 | 3;
                    int i88 = i87 << 1;
                    int i89 = -((~(i86 & 3)) & i87);
                    int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                    b = i90 % 128;
                    int i91 = i90 % 2;
                }
                int i92 = -i4;
                int i93 = i6 & i92;
                int i94 = (((i6 | i92) & (~i93)) - (~(i93 << 1))) - 1;
                if (i94 != -1) {
                    int i95 = a;
                    int i96 = ((i95 | 113) << 1) - (i95 ^ 113);
                    int i97 = i96 % 128;
                    b = i97;
                    int i98 = i96 % 2;
                    if (i94 == 0) {
                        int i99 = i97 + 119;
                        a = i99 % 128;
                        int i100 = i99 % 2;
                        if (z) {
                            j(oooO7);
                            int i101 = b;
                            int i102 = (i101 ^ 73) + ((i101 & 73) << 1);
                            a = i102 % 128;
                            int i103 = i102 % 2;
                        }
                    } else {
                        j(oooO7);
                        int i104 = b;
                        int i105 = (i104 ^ 73) + ((i104 & 73) << 1);
                        a = i105 % 128;
                        int i106 = i105 % 2;
                    }
                }
                i(oooO);
                if (z) {
                    int i107 = b;
                    int i108 = i107 & 125;
                    int i109 = (((i107 | 125) & (~i108)) - (~(i108 << 1))) - 1;
                    a = i109 % 128;
                    if (i109 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
            oooO = oooO.d;
            int i110 = (-2) - ((a + 108) ^ (-1));
            b = i110 % 128;
            int i111 = i110 % 2;
        }
        int i112 = a;
        int i113 = ((i112 ^ 109) | (i112 & 109)) << 1;
        int i114 = -(((~i112) & 109) | (i112 & (-110)));
        int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
        b = i115 % 128;
        if (i115 % 2 == 0) {
            int i116 = 78 / 0;
        }
    }
}
