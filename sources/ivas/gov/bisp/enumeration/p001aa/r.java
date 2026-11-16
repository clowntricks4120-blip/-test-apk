package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.OooOOoo.OooOOO;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r<K, V> extends OooOOOO<K, V> implements Map<K, V> {
    private static int a = 1;
    private static int b;
    public OooOOO<K, V> j;

    public class aTr extends OooOOO<K, V> {
        private static int a = 0;
        private static int b = 1;

        public aTr() {
        }

        public void f() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 125;
            int i4 = ((i2 & 125) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                r.this.clear();
                return;
            }
            r.this.clear();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Object g(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 31;
            int i6 = (i4 | 31) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr = r.this.h;
            return i9 != 0 ? objArr[i << i2] : objArr[(i << 1) + i2];
        }

        public Map<K, V> h() {
            r rVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                rVar = r.this;
                int i4 = 1 / 0;
            } else {
                rVar = r.this;
            }
            int i5 = i2 & 87;
            int i6 = ((i2 ^ 87) | i5) << 1;
            int i7 = -((i2 | 87) & (~i5));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return rVar;
        }

        public int i() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = r.this.i;
            int i6 = b;
            int i7 = (i6 & (-72)) | ((~i6) & 71);
            int i8 = -(-((i6 & 71) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int j(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 11;
            int i4 = ((i2 ^ 11) | i3) << 1;
            int i5 = -((i2 | 11) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            Object obj2 = null;
            if (i6 % 2 == 0) {
                r.this.f(obj);
                obj2.hashCode();
                throw null;
            }
            int iF = r.this.f(obj);
            int i7 = (-2) - ((b + 44) ^ (-1));
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return iF;
            }
            throw null;
        }

        public int k(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 9;
            int i4 = i2 | 9;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = r.this.i(obj);
            int i8 = a;
            int i9 = ((i8 ^ 89) | (i8 & 89)) << 1;
            int i10 = -(((~i8) & 89) | (i8 & (-90)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 93 / 0;
            }
            return i7;
        }

        public void l(K k, V v) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-80)) | ((~i2) & 79)) + ((i2 & 79) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            r.this.put(k, v);
            int i5 = b;
            int i6 = (i5 ^ 25) + ((i5 & 25) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
        }

        public void m(int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 43) | (i3 & 43)) << 1;
            int i5 = -(((~i3) & 43) | (i3 & (-44)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                r.this.l(i);
                throw null;
            }
            r.this.l(i);
            int i7 = b + 55;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        public V e(int i, V v) {
            r rVar;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = ((i4 ^ 92) + ((i4 & 92) << 1)) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                rVar = r.this;
                i2 = ((((i | 1) << 1) - (i ^ 1)) - 1) >> 1;
            } else {
                rVar = r.this;
                int i6 = i << 1;
                i2 = ((i6 & 1) << 1) + (i6 ^ 1);
            }
            Object[] objArr = rVar.h;
            int i7 = b;
            int i8 = (i7 ^ 35) + ((i7 & 35) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            int i11 = i9 & 71;
            int i12 = (i9 ^ 71) | i11;
            int i13 = (i11 & i12) + (i11 | i12);
            b = i13 % 128;
            int i14 = i13 % 2;
            return v2;
        }
    }

    public r() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = -(-((i2 & 75) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        OooOOO<K, V> oooOOOO = o();
        if (oooOOOO.c == null) {
            oooOOOO.c = new P.aTw();
            int i7 = a;
            int i8 = ((i7 | 68) << 1) - (i7 ^ 68);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 / 4;
            }
        }
        OooOOO<K, V>.OooO0O0 oooO0O0 = oooOOOO.c;
        int i11 = b;
        int i12 = i11 & 85;
        int i13 = ((i11 | 85) & (~i12)) + (i12 << 1);
        a = i13 % 128;
        int i14 = i13 % 2;
        return oooO0O0;
    }

    public final OooOOO<K, V> o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-82)) | ((~i2) & 81);
        int i4 = (i2 & 81) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (this.j == null) {
            this.j = new aTr();
            int i7 = a;
            int i8 = (((i7 ^ 67) | (i7 & 67)) << 1) - (((~i7) & 67) | (i7 & (-68)));
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        OooOOO<K, V> oooOOO = this.j;
        int i10 = a;
        int i11 = (i10 & (-66)) | ((~i10) & 65);
        int i12 = -(-((i10 & 65) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 48 / 0;
        }
        return oooOOO;
    }

    public r(int i) {
        super(i);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 73;
        int i4 = (i2 | 73) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        OooOOO<K, V> oooOOOO = o();
        if (oooOOOO.e == null) {
            oooOOOO.e = new P.aTz();
            int i8 = b;
            int i9 = i8 & 55;
            int i10 = (((i8 ^ 55) | i9) << 1) - ((i8 | 55) & (~i9));
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        OooOOO<K, V>.OooO oooO = oooOOOO.e;
        int i12 = b;
        int i13 = ((i12 ^ 25) - (~((i12 & 25) << 1))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        return oooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(t tVar) {
        if (tVar != null) {
            int i = tVar.i;
            int i2 = this.i;
            int i3 = -(~i);
            int i4 = ((i2 & i3) + (i2 | i3)) - 1;
            int i5 = a;
            int i6 = i5 & 23;
            int i7 = i6 + ((i5 ^ 23) | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
            g(i4);
            if (this.i == 0) {
                int i9 = b;
                int i10 = (i9 ^ 55) + ((i9 & 55) << 1);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                if (i > 0) {
                    int i11 = i9 ^ 97;
                    int i12 = (i9 & 97) << 1;
                    int i13 = (i11 & i12) + (i12 | i11);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    System.arraycopy(tVar.g, 0, this.g, 0, i);
                    int i15 = b;
                    int i16 = (i15 ^ 88) + ((i15 & 88) << 1);
                    int i17 = (i16 ^ (-1)) + (i16 << 1);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    int i19 = a;
                    int i20 = i19 & 97;
                    int i21 = (i19 ^ 97) | i20;
                    int i22 = (i20 & i21) + (i21 | i20);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                    System.arraycopy(tVar.h, 0, this.h, 0, i << 1);
                    this.i = i;
                    int i24 = a;
                    int i25 = (i24 & (-40)) | ((~i24) & 39);
                    int i26 = -(-((i24 & 39) << 1));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    return;
                }
            } else {
                int i29 = 0;
                while (i29 < i) {
                    int i30 = b;
                    int i31 = ((i30 | 23) << 1) - (i30 ^ 23);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    Object objK = tVar.k(i29);
                    Object objN = tVar.n(i29);
                    int i33 = a;
                    int i34 = i33 & 47;
                    int i35 = (i33 ^ 47) | i34;
                    int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                    b = i36 % 128;
                    int i37 = i36 % 2;
                    put(objK, objN);
                    int i38 = i29 & 113;
                    int i39 = -(-(i29 | 113));
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    i29 = ((i40 & (-111)) + (i40 | (-111))) - 1;
                    int i41 = b + 87;
                    a = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = 2 % 2;
                }
            }
        }
        int i44 = b;
        int i45 = i44 & 77;
        int i46 = ((i44 ^ 77) | i45) << 1;
        int i47 = -((i44 | 77) & (~i45));
        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
        a = i48 % 128;
        if (i48 % 2 == 0) {
            int i49 = 19 / 0;
        }
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 15;
        int i4 = (i2 | 15) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        OooOOO<K, V> oooOOOO = o();
        if (oooOOOO.d == null) {
            oooOOOO.d = new P.aTx();
            int i8 = a + 35;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        OooOOO<K, V>.OooO0OO oooO0OO = oooOOOO.d;
        int i10 = a;
        int i11 = (i10 & 103) + (i10 | 103);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 3 / 0;
        }
        return oooO0OO;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        K key;
        V value;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.i;
        int size = map.size();
        int i6 = b;
        int i7 = (i6 & 9) + (i6 | 9);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = -(~(-(-i5)));
        int i10 = (size & i9) + (i9 | size);
        g((i10 ^ (-1)) + (i10 << 1));
        int i11 = b;
        int i12 = ((i11 | 111) << 1) - (i11 ^ 111);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 115;
        b = i15 % 128;
        int i16 = i15 % 2;
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            int i17 = b + 55;
            a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = a + 59;
            b = i19 % 128;
            if (i19 % 2 != 0) {
                key = entry.getKey();
                value = entry.getValue();
                int i20 = 11 / 0;
            } else {
                key = entry.getKey();
                value = entry.getValue();
            }
            put(key, value);
            int i21 = b;
            int i22 = i21 ^ 31;
            int i23 = (i21 & 31) << 1;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = b;
        int i27 = (i26 & 109) + (i26 | 109);
        a = i27 % 128;
        int i28 = i27 % 2;
    }
}
