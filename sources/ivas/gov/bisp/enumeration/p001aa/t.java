package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.p006af.h;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t<K, V> {
    private static int a = 0;
    private static int b = 1;
    public static int c;
    public static Object[] d;
    public static Object[] e;
    public static int f;
    public int[] g;
    public Object[] h;
    public int i;

    public t() {
        this.g = h.E;
        this.h = h.F;
        this.i = 0;
    }

    private void d(int i) {
        if (i == 8) {
            synchronized (t.class) {
                Object[] objArr = e;
                if (objArr != null) {
                    this.h = objArr;
                    e = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    int i2 = f;
                    int i3 = ~i2;
                    int i4 = i2 << 1;
                    f = ((i3 | i4) << 1) - (i4 ^ i3);
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (t.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.h = objArr2;
                    d = (Object[]) objArr2[0];
                    this.g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    int i5 = c;
                    int i6 = ((i5 ^ (-1)) | i5) << 1;
                    int i7 = -(~i5);
                    c = (i6 & i7) + (i7 | i6);
                    return;
                }
            }
        }
        this.g = new int[i];
        this.h = new Object[i << 1];
    }

    public static void e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (t.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    int i3 = f;
                    int i4 = i3 ^ 1;
                    int i5 = ((i3 & 1) | i4) << 1;
                    int i6 = -i4;
                    f = (i5 & i6) + (i5 | i6);
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (t.class) {
                if (c < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i7 = (i << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    d = objArr;
                    int i8 = c;
                    int i9 = i8 & 1;
                    int i10 = ((i8 ^ 1) | i9) << 1;
                    int i11 = -((i8 | 1) & (~i9));
                    c = ((i10 | i11) << 1) - (i11 ^ i10);
                }
            }
        }
    }

    public boolean containsKey(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = (i3 - (~(-(-((i2 ^ 105) | i3))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            i(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (i(obj) >= 0) {
            int i5 = b;
            int i6 = i5 & 39;
            int i7 = i6 + ((i5 ^ 39) | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = b;
            int i10 = i9 & 7;
            int i11 = (((i9 | 7) & (~i10)) - (~(i10 << 1))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        int i13 = a;
        int i14 = (((i13 ^ 33) | (i13 & 33)) << 1) - (((~i13) & 33) | (i13 & (-34)));
        b = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 48 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public boolean containsValue(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = (i2 | 11) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
            if (f(obj) >= 0) {
                int i8 = b;
                int i9 = i8 & 55;
                int i10 = (((i8 ^ 55) | i9) << 1) - ((i8 | 55) & (~i9));
                int i11 = i10 % 128;
                a = i11;
                int i12 = i10 % 2;
                int i13 = (i11 & 67) + (i11 | 67);
                b = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                int i15 = a;
                int i16 = ((i15 & (-92)) | ((~i15) & 91)) + ((i15 & 91) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                z = false;
            }
        } else if (f(obj) >= 0) {
            int i18 = b;
            int i19 = i18 & 55;
            int i110 = (((i18 ^ 55) | i19) << 1) - ((i18 | 55) & (~i19));
            int i111 = i110 % 128;
            a = i111;
            int i112 = i110 % 2;
            int i113 = (i111 & 67) + (i111 | 67);
            b = i113 % 128;
            int i114 = i113 % 2;
            z = true;
        } else {
            int i115 = a;
            int i116 = ((i115 & (-92)) | ((~i115) & 91)) + ((i115 & 91) << 1);
            b = i116 % 128;
            int i117 = i116 % 2;
            z = false;
        }
        int i20 = a;
        int i21 = i20 & 109;
        int i22 = (i21 - (~(-(-((i20 ^ 109) | i21))))) - 1;
        b = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 44 / 0;
        }
        return z;
    }

    public V get(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = (i2 & 87) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            getOrDefault(obj, null);
            throw null;
        }
        V orDefault = getOrDefault(obj, null);
        int i6 = b;
        int i7 = ((i6 | 63) << 1) - (i6 ^ 63);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return orDefault;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r4
  0x001f: PHI (r4v2 int) = (r4v1 int), (r4v16 int) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public V getOrDefault(Object obj, V v) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 25;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            i = i(obj);
            int i4 = 80 / 0;
            if (i >= 0) {
                Object[] objArr = this.h;
                int i5 = i << 1;
                int i6 = (i5 & (-2)) | ((~i5) & 1);
                int i7 = (i5 & 1) << 1;
                v = (V) objArr[(i6 & i7) + (i7 | i6)];
                int i8 = b;
                int i9 = i8 & 125;
                int i10 = ((i8 | 125) & (~i9)) + (i9 << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            i = i(obj);
            if (i >= 0) {
                Object[] objArr2 = this.h;
                int i12 = i << 1;
                int i13 = (i12 & (-2)) | ((~i12) & 1);
                int i14 = (i12 & 1) << 1;
                v = (V) objArr2[(i13 & i14) + (i14 | i13)];
                int i15 = b;
                int i16 = i15 & 125;
                int i17 = ((i15 | 125) & (~i16)) + (i16 << 1);
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = a + 37;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            return v;
        }
        throw null;
    }

    public int i(Object obj) {
        int iH;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 7) << 1;
        int i4 = -(((~i2) & 7) | (i2 & (-8)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (obj == null) {
            iH = j();
            int i6 = b + 105;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 3;
            }
        } else {
            iH = h(obj, obj.hashCode());
            int i8 = a;
            int i9 = i8 & 49;
            int i10 = i8 | 49;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b + 39;
        a = i13 % 128;
        int i14 = i13 % 2;
        return iH;
    }

    public boolean isEmpty() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 77;
        int i4 = ((i2 & 77) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        boolean z = false;
        if (this.i <= 0) {
            int i9 = i7 + 13;
            b = i9 % 128;
            z = i9 % 2 != 0;
            int i10 = (i7 ^ 45) + ((i7 & 45) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = (((i7 | 114) << 1) - (i7 ^ 114)) - 1;
            b = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 5;
            }
        }
        int i14 = b + 97;
        a = i14 % 128;
        int i15 = i14 % 2;
        return z;
    }

    public K k(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 90) + ((i3 & 90) << 1)) ^ (-1));
        a = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = this.h;
        return i5 != 0 ? (K) objArr[i - 1] : (K) objArr[i << 1];
    }

    public V m(int i, V v) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 75;
        int i6 = (((i4 & 75) | i5) << 1) - i5;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            i2 = i >>> 1;
        } else {
            int i7 = i << 1;
            i2 = (((i7 & (-2)) | ((~i7) & 1)) - (~(-(-((i7 & 1) << 1))))) - 1;
        }
        Object[] objArr = this.h;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        int i8 = i4 & 69;
        int i9 = -(-((i4 ^ 69) | i8));
        int i10 = (i8 & i9) + (i8 | i9);
        b = i10 % 128;
        int i11 = i10 % 2;
        return v2;
    }

    public V n(int i) {
        V v;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 89;
        int i5 = (((i3 ^ 89) | i4) << 1) - ((~i4) & (i3 | 89));
        b = i5 % 128;
        if (i5 % 2 == 0) {
            v = (V) this.h[i % 1];
        } else {
            int i6 = i << 1;
            v = (V) this.h[(((i6 | 2) << 1) - (i6 ^ 2)) - 1];
        }
        int i7 = (i3 ^ 3) + ((i3 & 3) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 22 / 0;
        }
        return v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r6 = ivas.gov.bisp.enumeration.p001aa.t.a;
        r1 = r6 & 19;
        r6 = (r6 | 19) & (~r1);
        r1 = r1 << 1;
        r2 = ((r6 | r1) << 1) - (r6 ^ r1);
        ivas.gov.bisp.enumeration.p001aa.t.b = r2 % 128;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r6 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r6 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r6 = l(r6);
        r1 = ivas.gov.bisp.enumeration.p001aa.t.b;
        r2 = r1 ^ 15;
        r1 = ((((r1 & 15) | r2) << 1) - (~(-r2))) - 1;
        ivas.gov.bisp.enumeration.p001aa.t.a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V remove(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p001aa.t.a
            r2 = r1 & (-114(0xffffffffffffff8e, float:NaN))
            int r3 = ~r1
            r4 = 113(0x71, float:1.58E-43)
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            int r1 = r1 << 1
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p001aa.t.b = r1
            int r2 = r2 % r0
            int r6 = r5.i(r6)
            if (r2 != 0) goto L27
            r1 = 77
            int r1 = r1 / 0
            if (r6 < 0) goto L41
            goto L29
        L27:
            if (r6 < 0) goto L41
        L29:
            java.lang.Object r6 = r5.l(r6)
            int r1 = ivas.gov.bisp.enumeration.p001aa.t.b
            r2 = r1 ^ 15
            r1 = r1 & 15
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            int r2 = ~r2
            int r1 = r1 - r2
            int r1 = r1 + (-1)
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r2
            int r1 = r1 % r0
            return r6
        L41:
            int r6 = ivas.gov.bisp.enumeration.p001aa.t.a
            r1 = r6 & 19
            int r2 = ~r1
            r6 = r6 | 19
            r6 = r6 & r2
            int r1 = r1 << 1
            r2 = r6 | r1
            int r2 = r2 << 1
            r6 = r6 ^ r1
            int r2 = r2 - r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.p001aa.t.b = r6
            int r2 = r2 % r0
            r6 = 0
            if (r2 == 0) goto L5a
            return r6
        L5a:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p001aa.t.remove(java.lang.Object):java.lang.Object");
    }

    public V replace(K k, V v) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 35;
        int i4 = (i3 - (~(-(-((i2 ^ 35) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i(k);
        Object obj = null;
        if (i6 < 0) {
            int i7 = a;
            int i8 = i7 & 63;
            int i9 = ((i7 | 63) & (~i8)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }
        int i11 = b;
        int i12 = i11 & 21;
        int i13 = (i12 - (~((i11 ^ 21) | i12))) - 1;
        a = i13 % 128;
        if (i13 % 2 != 0) {
            m(i6, v);
            obj.hashCode();
            throw null;
        }
        V vM = m(i6, v);
        int i14 = b;
        int i15 = ((i14 & (-18)) | ((~i14) & 17)) + ((i14 & 17) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        return vM;
    }

    public int size() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.i;
        }
        int i4 = 81 / 0;
        return this.i;
    }

    public V putIfAbsent(K k, V v) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = (i3 - (~(-(-((i2 ^ 59) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        V orDefault = getOrDefault(k, null);
        if (orDefault == null) {
            int i6 = a;
            int i7 = i6 & 25;
            int i8 = (i7 - (~(-(-((i6 ^ 25) | i7))))) - 1;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                put(k, v);
                throw null;
            }
            orDefault = put(k, v);
            int i9 = a;
            int i10 = ((i9 | 63) << 1) - (i9 ^ 63);
            b = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a + 37;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 76 / 0;
        }
        return orDefault;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[LOOP:1: B:13:0x003f->B:20:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x009f A[PHI: r2 r6
  0x009f: PHI (r2v20 int) = (r2v6 int), (r2v26 int) binds: [B:8:0x002a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r6v3 java.lang.Object[]) = (r6v1 java.lang.Object[]), (r6v4 java.lang.Object[]) binds: [B:8:0x002a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r2 r6
  0x002c: PHI (r2v7 int) = (r2v6 int), (r2v26 int) binds: [B:8:0x002a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r6v2 java.lang.Object[]) = (r6v1 java.lang.Object[]), (r6v4 java.lang.Object[]) binds: [B:8:0x002a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    int f(Object obj) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = b;
        int i12 = (((i11 | 43) << 1) - (~(-((i11 & (-44)) | ((~i11) & 43))))) - 1;
        int i13 = i12 % 128;
        a = i13;
        if (i12 % 2 != 0) {
            i = this.i << 4;
            objArr = this.h;
            if (obj == null) {
                int i14 = i13 & 75;
                i2 = (i14 - (~((i13 ^ 75) | i14))) - 1;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i15 = 3 / 5;
                }
                i3 = 1;
                while (i3 < i) {
                    i4 = b + 33;
                    i5 = i4 % 128;
                    a = i5;
                    if (i4 % 2 == 0) {
                        Object obj2 = objArr[i3];
                        throw null;
                    }
                    if (objArr[i3] == null) {
                        int i16 = i5 ^ 103;
                        int i17 = ((((i5 & 103) | i16) << 1) - (~(-i16))) - 1;
                        b = i17 % 128;
                        int i18 = i17 % 2;
                        int i19 = i3 >> 1;
                        int i20 = i5 & 105;
                        int i21 = (i20 - (~(-(-((i5 ^ 105) | i20))))) - 1;
                        b = i21 % 128;
                        int i22 = i21 % 2;
                        return i19;
                    }
                    int i23 = (i3 & (-125)) | ((~i3) & 124);
                    int i24 = -(-((i3 & 124) << 1));
                    int i25 = (i23 & i24) + (i24 | i23);
                    int i26 = i25 & (-122);
                    int i27 = (~i26) & (i25 | (-122));
                    int i28 = -(-(i26 << 1));
                    i3 = ((i27 | i28) << 1) - (i28 ^ i27);
                    int i29 = (((i5 | 88) << 1) - (i5 ^ 88)) - 1;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                }
            } else {
                int i31 = (i11 ^ 101) + ((i11 & 101) << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                i6 = 1;
                while (true) {
                    if (i6 < i) {
                        int i33 = a;
                        i7 = ((i33 ^ 88) + ((i33 & 88) << 1)) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i34 = 32 / 0;
                            if (obj.equals(objArr[i6])) {
                                i8 = i6 >> 1;
                                int i35 = a;
                                i9 = ((i35 | 11) << 1) - (i35 ^ 11);
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return i8;
                                }
                                throw null;
                            }
                            int i36 = i6 + 128;
                            i6 = ((i36 & (-126)) << 1) + (i36 ^ (-126));
                            int i37 = a;
                            int i38 = ((i37 | 39) << 1) - (i37 ^ 39);
                            b = i38 % 128;
                            int i39 = i38 % 2;
                        } else {
                            if (obj.equals(objArr[i6])) {
                                i8 = i6 >> 1;
                                int i310 = a;
                                i9 = ((i310 | 11) << 1) - (i310 ^ 11);
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return i8;
                                }
                                throw null;
                            }
                            int i311 = i6 + 128;
                            i6 = ((i311 & (-126)) << 1) + (i311 ^ (-126));
                            int i312 = a;
                            int i313 = ((i312 | 39) << 1) - (i312 ^ 39);
                            b = i313 % 128;
                            int i314 = i313 % 2;
                        }
                    }
                }
            }
        } else {
            i = this.i * 2;
            objArr = this.h;
            if (obj == null) {
                int i110 = i13 & 75;
                i2 = (i110 - (~((i13 ^ 75) | i110))) - 1;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i111 = 3 / 5;
                }
                i3 = 1;
                while (i3 < i) {
                    i4 = b + 33;
                    i5 = i4 % 128;
                    a = i5;
                    if (i4 % 2 == 0) {
                        Object obj3 = objArr[i3];
                        throw null;
                    }
                    if (objArr[i3] == null) {
                        int i112 = i5 ^ 103;
                        int i113 = ((((i5 & 103) | i112) << 1) - (~(-i112))) - 1;
                        b = i113 % 128;
                        int i114 = i113 % 2;
                        int i115 = i3 >> 1;
                        int i210 = i5 & 105;
                        int i211 = (i210 - (~(-(-((i5 ^ 105) | i210))))) - 1;
                        b = i211 % 128;
                        int i212 = i211 % 2;
                        return i115;
                    }
                    int i213 = (i3 & (-125)) | ((~i3) & 124);
                    int i214 = -(-((i3 & 124) << 1));
                    int i215 = (i213 & i214) + (i214 | i213);
                    int i216 = i215 & (-122);
                    int i217 = (~i216) & (i215 | (-122));
                    int i218 = -(-(i216 << 1));
                    i3 = ((i217 | i218) << 1) - (i218 ^ i217);
                    int i219 = (((i5 | 88) << 1) - (i5 ^ 88)) - 1;
                    b = i219 % 128;
                    int i315 = i219 % 2;
                }
            } else {
                int i316 = (i11 ^ 101) + ((i11 & 101) << 1);
                a = i316 % 128;
                int i317 = i316 % 2;
                i6 = 1;
                while (true) {
                    if (i6 < i) {
                        int i318 = a;
                        i7 = ((i318 ^ 88) + ((i318 & 88) << 1)) - 1;
                        b = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i319 = 32 / 0;
                            if (obj.equals(objArr[i6])) {
                                i8 = i6 >> 1;
                                int i3110 = a;
                                i9 = ((i3110 | 11) << 1) - (i3110 ^ 11);
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return i8;
                                }
                                throw null;
                            }
                            int i3111 = i6 + 128;
                            i6 = ((i3111 & (-126)) << 1) + (i3111 ^ (-126));
                            int i3112 = a;
                            int i3113 = ((i3112 | 39) << 1) - (i3112 ^ 39);
                            b = i3113 % 128;
                            int i3114 = i3113 % 2;
                        } else {
                            if (obj.equals(objArr[i6])) {
                                i8 = i6 >> 1;
                                int i3115 = a;
                                i9 = ((i3115 | 11) << 1) - (i3115 ^ 11);
                                b = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return i8;
                                }
                                throw null;
                            }
                            int i3116 = i6 + 128;
                            i6 = ((i3116 & (-126)) << 1) + (i3116 ^ (-126));
                            int i3117 = a;
                            int i3118 = ((i3117 | 39) << 1) - (i3117 ^ 39);
                            b = i3118 % 128;
                            int i3119 = i3118 % 2;
                        }
                    }
                }
            }
        }
        int i40 = a;
        int i41 = i40 & 75;
        int i42 = i41 + ((i40 ^ 75) | i41);
        b = i42 % 128;
        if (i42 % 2 == 0) {
            int i43 = 78 / 0;
        }
        return -1;
    }

    public int hashCode() {
        int i;
        int i2;
        int iHashCode;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-78)) | ((~i4) & 77);
        int i6 = (i4 & 77) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        int[] iArr = this.g;
        Object[] objArr = this.h;
        int i10 = this.i;
        int i11 = i8 + 113;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            i2 = 1;
            i = 0;
        } else {
            i = 1;
            i2 = 0;
        }
        int i12 = (i8 | 85) << 1;
        int i13 = -(((~i8) & 85) | (i8 & (-86)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (true) {
            Object obj = null;
            if (i16 >= i10) {
                int i17 = a;
                int i18 = (i17 & 1) + (i17 | 1);
                b = i18 % 128;
                if (i18 % 2 != 0) {
                    return i2;
                }
                obj.hashCode();
                throw null;
            }
            int i19 = b;
            int i20 = (-2) - ((i19 + 90) ^ (-1));
            a = i20 % 128;
            if (i20 % 2 != 0) {
                Object obj2 = objArr[i];
                int i21 = iArr[i16];
                obj.hashCode();
                throw null;
            }
            Object obj3 = objArr[i];
            int i22 = iArr[i16];
            if (obj3 == null) {
                int i23 = i19 & 11;
                int i24 = i19 | 11;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                int i26 = i25 % 128;
                a = i26;
                int i27 = i25 % 2;
                int i28 = (i26 ^ 53) + ((i26 & 53) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                iHashCode = 0;
            } else {
                iHashCode = obj3.hashCode();
                int i30 = a;
                int i31 = (i30 & 11) + (i30 | 11);
                b = i31 % 128;
                int i32 = i31 % 2;
            }
            int i33 = (~i22) & iHashCode;
            int i34 = (~iHashCode) & i22;
            int i35 = -(-((i34 & i33) | (i33 ^ i34)));
            int i36 = i2 ^ i35;
            int i37 = (i2 & i35) << 1;
            i2 = ((i36 | i37) << 1) - (i37 ^ i36);
            int i38 = ((i16 & 111) - (~(-(-(i16 | 111))))) - 1;
            i16 = (-2) - ((((i38 | (-109)) << 1) - (i38 ^ (-109))) ^ (-1));
            int i39 = i | 31;
            int i40 = i39 << 1;
            int i41 = -((~(i & 31)) & i39);
            int i42 = (i40 & i41) + (i41 | i40);
            int i43 = i42 & (-29);
            i = (i43 << 1) + ((i42 | (-29)) & (~i43));
            int i44 = b;
            int i45 = ((i44 ^ 35) | (i44 & 35)) << 1;
            int i46 = -(((~i44) & 35) | (i44 & (-36)));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            a = i47 % 128;
            if (i47 % 2 != 0) {
                int i48 = 5 % 4;
            }
        }
    }

    public void clear() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 35;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.i;
        if (i5 > 0) {
            int i6 = (((i2 | 28) << 1) - (i2 ^ 28)) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = this.g;
            Object[] objArr = this.h;
            int[] iArr2 = h.E;
            int i8 = b;
            int i9 = ((((i8 ^ 33) | (i8 & 33)) << 1) - (~(-(((~i8) & 33) | (i8 & (-34)))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            this.g = iArr2;
            this.h = h.F;
            this.i = 0;
            int i11 = b;
            int i12 = i11 & 115;
            int i13 = (i11 ^ 115) | i12;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            e(iArr, objArr, i5);
            if (i15 != 0) {
                int i16 = 75 / 0;
            }
        }
        if (this.i > 0) {
            throw new ConcurrentModificationException();
        }
        int i17 = b;
        int i18 = ((i17 | 19) << 1) - (i17 ^ 19);
        a = i18 % 128;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0186  */
    /* JADX WARN: Code duplicated, block: B:55:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8 A[EDGE_INSN: B:78:0x01b8->B:58:0x01b8 BREAK  A[LOOP:1: B:42:0x0150->B:57:0x019f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8 A[EDGE_INSN: B:79:0x01b8->B:58:0x01b8 BREAK  A[LOOP:1: B:42:0x0150->B:57:0x019f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x019f A[SYNTHETIC] */
    public int h(Object obj, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 17) | (i4 & 17)) << 1;
        int i6 = -(((~i4) & 17) | (i4 & (-18)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        int i10 = this.i;
        Object obj2 = null;
        if (i10 == 0) {
            int i11 = ((i8 & 88) + (i8 | 88)) - 1;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            int i12 = i8 ^ 31;
            int i13 = (i8 & 31) << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            a = i14 % 128;
            int i15 = i14 % 2;
            return -1;
        }
        try {
            int iE = h.e(this.g, i10, i);
            int i16 = b + 91;
            int i17 = i16 % 128;
            a = i17;
            int i18 = i16 % 2;
            if (iE < 0) {
                int i19 = (i17 & 79) + (i17 | 79);
                int i20 = i19 % 128;
                b = i20;
                if (i19 % 2 == 0) {
                    int i21 = 22 / 0;
                }
                int i22 = ((((i20 ^ 59) | (i20 & 59)) << 1) - (~(-(((~i20) & 59) | (i20 & (-60)))))) - 1;
                a = i22 % 128;
                int i23 = i22 % 2;
                return iE;
            }
            if (obj.equals(this.h[iE << 1])) {
                int i24 = b;
                int i25 = ((i24 ^ 36) + ((i24 & 36) << 1)) - 1;
                int i26 = i25 % 128;
                a = i26;
                if (i25 % 2 != 0) {
                    throw null;
                }
                int i27 = i26 & 107;
                int i28 = -(-((i26 ^ 107) | i27));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    return iE;
                }
                throw null;
            }
            int i30 = iE + 1;
            int i31 = a;
            int i32 = i31 & 119;
            int i33 = ((i31 ^ 119) | i32) << 1;
            int i34 = -((i31 | 119) & (~i32));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            b = i35 % 128;
            int i36 = i35 % 2;
            while (i30 < i10) {
                int i37 = a;
                int i38 = i37 & 67;
                int i39 = i38 + ((i37 ^ 67) | i38);
                int i40 = i39 % 128;
                b = i40;
                int i41 = i39 % 2;
                if (this.g[i30] != i) {
                    break;
                }
                int i42 = i40 & 107;
                int i43 = i40 | 107;
                int i44 = (i42 & i43) + (i43 | i42);
                a = i44 % 128;
                if (i44 % 2 != 0) {
                    if (obj.equals(this.h[i30 >>> 1])) {
                        int i45 = a;
                        int i46 = ((i45 | 101) << 1) - (i45 ^ 101);
                        b = i46 % 128;
                        int i47 = i46 % 2;
                        return i30;
                    }
                    int i48 = ((i30 & (-103)) | ((~i30) & 102)) + ((i30 & 102) << 1);
                    int i49 = i48 & (-101);
                    i30 = (((i48 | (-101)) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
                    int i50 = a;
                    int i51 = ((i50 | 119) << 1) - (i50 ^ 119);
                    b = i51 % 128;
                    int i52 = i51 % 2;
                } else {
                    if (!(!obj.equals(this.h[i30 << 1]))) {
                        int i410 = a;
                        int i411 = ((i410 | 101) << 1) - (i410 ^ 101);
                        b = i411 % 128;
                        int i412 = i411 % 2;
                        return i30;
                    }
                    int i413 = ((i30 & (-103)) | ((~i30) & 102)) + ((i30 & 102) << 1);
                    int i414 = i413 & (-101);
                    i30 = (((i413 | (-101)) & (~i414)) - (~(-(-(i414 << 1))))) - 1;
                    int i53 = a;
                    int i54 = ((i53 | 119) << 1) - (i53 ^ 119);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                }
            }
            int i56 = ((iE ^ (-1)) | iE) << 1;
            int i57 = -(~iE);
            int i58 = (i56 & i57) + (i57 | i56);
            int i59 = b;
            int i60 = i59 & 87;
            int i61 = (i59 ^ 87) | i60;
            int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
            a = i62 % 128;
            int i63 = i62 % 2;
            while (true) {
                if (i58 >= 0) {
                    int i64 = a;
                    int i65 = ((i64 & 75) - (~(-(-(i64 | 75))))) - 1;
                    int i66 = i65 % 128;
                    b = i66;
                    if (i65 % 2 != 0) {
                        if (this.g[i58] != i) {
                        }
                        int i67 = i66 & 63;
                        i2 = (i67 - (~(-(-((i66 ^ 63) | i67))))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            if (!obj.equals(this.h[i58 << 1])) {
                                break;
                                break;
                            }
                            int i68 = (i58 & 73) + (i58 | 73);
                            i58 = (i68 ^ (-74)) + ((i68 & (-74)) << 1);
                            int i69 = a;
                            int i70 = (i69 & 79) + (i69 | 79);
                            b = i70 % 128;
                            int i71 = i70 % 2;
                        } else {
                            if (obj.equals(this.h[i58 >> 1])) {
                                break;
                                break;
                            }
                            int i610 = (i58 & 73) + (i58 | 73);
                            i58 = (i610 ^ (-74)) + ((i610 & (-74)) << 1);
                            int i611 = a;
                            int i72 = (i611 & 79) + (i611 | 79);
                            b = i72 % 128;
                            int i73 = i72 % 2;
                        }
                    } else {
                        int i74 = 85 / 0;
                        if (this.g[i58] != i) {
                        }
                        int i612 = i66 & 63;
                        i2 = (i612 - (~(-(-((i66 ^ 63) | i612))))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            if (!obj.equals(this.h[i58 << 1])) {
                                break;
                            }
                            int i613 = (i58 & 73) + (i58 | 73);
                            i58 = (i613 ^ (-74)) + ((i613 & (-74)) << 1);
                            int i614 = a;
                            int i75 = (i614 & 79) + (i614 | 79);
                            b = i75 % 128;
                            int i76 = i75 % 2;
                        } else {
                            if (obj.equals(this.h[i58 >> 1])) {
                                break;
                            }
                            int i615 = (i58 & 73) + (i58 | 73);
                            i58 = (i615 ^ (-74)) + ((i615 & (-74)) << 1);
                            int i616 = a;
                            int i77 = (i616 & 79) + (i616 | 79);
                            b = i77 % 128;
                            int i78 = i77 % 2;
                        }
                    }
                }
                int i79 = ~i30;
                int i80 = a;
                int i81 = ((i80 | 11) << 1) - (i80 ^ 11);
                b = i81 % 128;
                int i82 = i81 % 2;
                return i79;
            }
            int i83 = a;
            int i84 = i83 & 109;
            int i85 = (i84 - (~((i83 ^ 109) | i84))) - 1;
            b = i85 % 128;
            if (i85 % 2 != 0) {
                return i58;
            }
            obj2.hashCode();
            throw null;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r10.equals(r3) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean replace(K r9, V r10, V r11) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p001aa.t.b
            int r1 = r1 + 3
            int r2 = r1 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r2
            int r1 = r1 % r0
            int r9 = r8.i(r9)
            if (r9 < 0) goto L69
            int r1 = ivas.gov.bisp.enumeration.p001aa.t.a
            r2 = r1 | 121(0x79, float:1.7E-43)
            int r3 = r2 << 1
            r1 = r1 & 121(0x79, float:1.7E-43)
            int r1 = ~r1
            r1 = r1 & r2
            int r1 = -r1
            int r1 = ~r1
            int r3 = r3 - r1
            r1 = 1
            int r3 = r3 - r1
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.p001aa.t.b = r2
            int r3 = r3 % r0
            r2 = 0
            if (r3 == 0) goto L62
            java.lang.Object r3 = r8.n(r9)
            if (r3 == r10) goto L4e
            if (r10 == 0) goto L69
            int r4 = ivas.gov.bisp.enumeration.p001aa.t.b
            r5 = r4 & (-12)
            int r6 = ~r4
            r7 = 11
            r6 = r6 & r7
            r5 = r5 | r6
            r4 = r4 & r7
            int r4 = r4 << r1
            int r4 = -r4
            int r4 = -r4
            r6 = r5 | r4
            int r6 = r6 << r1
            r4 = r4 ^ r5
            int r6 = r6 - r4
            int r4 = r6 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r4
            int r6 = r6 % r0
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L69
        L4e:
            r8.m(r9, r11)
            int r9 = ivas.gov.bisp.enumeration.p001aa.t.b
            r10 = r9 & 80
            r9 = r9 | 80
            int r10 = r10 + r9
            int r10 = r10 - r1
            int r9 = r10 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r9
            int r10 = r10 % r0
            if (r10 != 0) goto L61
            return r1
        L61:
            throw r2
        L62:
            r8.n(r9)
            r2.hashCode()
            throw r2
        L69:
            int r9 = ivas.gov.bisp.enumeration.p001aa.t.a
            r10 = r9 & 119(0x77, float:1.67E-43)
            r9 = r9 ^ 119(0x77, float:1.67E-43)
            r9 = r9 | r10
            int r9 = -r9
            int r9 = -r9
            r11 = r10 & r9
            r9 = r9 | r10
            int r11 = r11 + r9
            int r9 = r11 % 128
            ivas.gov.bisp.enumeration.p001aa.t.b = r9
            int r11 = r11 % r0
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p001aa.t.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    public t(int i) {
        if (i == 0) {
            this.g = h.E;
            this.h = h.F;
            int i2 = b;
            int i3 = ((i2 ^ 50) + ((i2 & 50) << 1)) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            d(i);
            int i5 = a;
            int i6 = ((i5 & 65) - (~(-(-(i5 | 65))))) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        }
        this.i = 0;
        int i8 = a;
        int i9 = (((i8 | 78) << 1) - (i8 ^ 78)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    public void g(int i) {
        Object[] objArr;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 87;
        int i7 = ((~i6) & (i5 | 87)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = this.i;
        int[] iArr = this.g;
        int length = iArr.length;
        int i10 = i5 & 39;
        int i11 = ((i5 ^ 39) | i10) << 1;
        int i12 = -((i5 | 39) & (~i10));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 12 / 0;
            if (length < i) {
                objArr = this.h;
                d(i);
                int i15 = a + 70;
                i2 = (i15 ^ (-1)) + (i15 << 1);
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i16 = 45 / 0;
                    if (this.i > 0) {
                        System.arraycopy(iArr, 0, this.g, 0, i9);
                        int i17 = b;
                        int i18 = i17 & 103;
                        i3 = (i18 - (~(-(-((i17 ^ 103) | i18))))) - 1;
                        a = i3 % 128;
                        if (i3 % 2 != 0) {
                            System.arraycopy(objArr, 0, this.h, 0, i9);
                        } else {
                            System.arraycopy(objArr, 0, this.h, 0, i9 << 1);
                        }
                        int i19 = a;
                        int i20 = (i19 & 25) + (i19 | 25);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                    }
                } else if (this.i > 0) {
                    System.arraycopy(iArr, 0, this.g, 0, i9);
                    int i110 = b;
                    int i111 = i110 & 103;
                    i3 = (i111 - (~(-(-((i110 ^ 103) | i111))))) - 1;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        System.arraycopy(objArr, 0, this.h, 0, i9);
                    } else {
                        System.arraycopy(objArr, 0, this.h, 0, i9 << 1);
                    }
                    int i112 = a;
                    int i22 = (i112 & 25) + (i112 | 25);
                    b = i22 % 128;
                    int i23 = i22 % 2;
                }
                e(iArr, objArr, i9);
                int i24 = b + 69;
                a = i24 % 128;
                int i25 = i24 % 2;
            }
        } else if (length < i) {
            objArr = this.h;
            d(i);
            int i113 = a + 70;
            i2 = (i113 ^ (-1)) + (i113 << 1);
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i114 = 45 / 0;
                if (this.i > 0) {
                    System.arraycopy(iArr, 0, this.g, 0, i9);
                    int i115 = b;
                    int i116 = i115 & 103;
                    i3 = (i116 - (~(-(-((i115 ^ 103) | i116))))) - 1;
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        System.arraycopy(objArr, 0, this.h, 0, i9);
                    } else {
                        System.arraycopy(objArr, 0, this.h, 0, i9 << 1);
                    }
                    int i117 = a;
                    int i26 = (i117 & 25) + (i117 | 25);
                    b = i26 % 128;
                    int i27 = i26 % 2;
                }
            } else if (this.i > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i9);
                int i118 = b;
                int i119 = i118 & 103;
                i3 = (i119 - (~(-(-((i118 ^ 103) | i119))))) - 1;
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    System.arraycopy(objArr, 0, this.h, 0, i9);
                } else {
                    System.arraycopy(objArr, 0, this.h, 0, i9 << 1);
                }
                int i1110 = a;
                int i28 = (i1110 & 25) + (i1110 | 25);
                b = i28 % 128;
                int i29 = i28 % 2;
            }
            e(iArr, objArr, i9);
            int i210 = b + 69;
            a = i210 % 128;
            int i211 = i210 % 2;
        }
        if (this.i != i9) {
            throw new ConcurrentModificationException();
        }
        int i30 = b;
        int i31 = i30 & 91;
        int i32 = -(-((i30 ^ 91) | i31));
        int i33 = (i31 & i32) + (i32 | i31);
        a = i33 % 128;
        int i34 = i33 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r9 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r9.equals(r4) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p001aa.t.a
            r2 = r1 & (-106(0xffffffffffffff96, float:NaN))
            int r3 = ~r1
            r4 = 105(0x69, float:1.47E-43)
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p001aa.t.b = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 == 0) goto L81
            int r8 = r7.i(r8)
            r2 = 0
            if (r8 < 0) goto L74
            int r4 = ivas.gov.bisp.enumeration.p001aa.t.b
            r5 = r4 ^ 65
            r4 = r4 & 65
            r4 = r4 | r5
            int r4 = r4 << r3
            int r5 = -r5
            int r5 = ~r5
            int r4 = r4 - r5
            int r4 = r4 - r3
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L6d
            java.lang.Object r4 = r7.n(r8)
            if (r9 == r4) goto L55
            if (r9 == 0) goto L74
            int r5 = ivas.gov.bisp.enumeration.p001aa.t.a
            int r5 = r5 + 57
            int r6 = r5 % 128
            ivas.gov.bisp.enumeration.p001aa.t.b = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L4f
            boolean r9 = r9.equals(r4)
            r4 = 47
            int r4 = r4 / r2
            if (r9 == 0) goto L74
            goto L55
        L4f:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L74
        L55:
            r7.l(r8)
            int r8 = ivas.gov.bisp.enumeration.p001aa.t.b
            r9 = r8 & 73
            r8 = r8 ^ 73
            r8 = r8 | r9
            int r8 = ~r8
            int r9 = r9 - r8
            int r9 = r9 - r3
            int r8 = r9 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r8
            int r9 = r9 % r0
            if (r9 == 0) goto L6c
            r8 = 12
            int r8 = r8 / r2
        L6c:
            return r3
        L6d:
            r7.n(r8)
            r1.hashCode()
            throw r1
        L74:
            int r8 = ivas.gov.bisp.enumeration.p001aa.t.b
            int r8 = r8 + 109
            int r9 = r8 % 128
            ivas.gov.bisp.enumeration.p001aa.t.a = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L80
            return r2
        L80:
            throw r1
        L81:
            r7.i(r8)
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p001aa.t.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145 A[SYNTHETIC] */
    public int j() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 25;
        int i8 = (i7 - (~((i6 ^ 25) | i7))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        int i9 = this.i;
        if (i9 == 0) {
            int i10 = i6 & 123;
            int i11 = -(-((i6 ^ 123) | i10));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
            return -1;
        }
        try {
            int iE = h.e(this.g, i9, 0);
            int i14 = a;
            int i15 = i14 + 67;
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            if (iE < 0) {
                int i18 = ((i16 ^ 2) + ((i16 & 2) << 1)) - 1;
                int i19 = i18 % 128;
                a = i19;
                int i20 = i18 % 2;
                int i21 = i19 & 57;
                int i22 = (i21 - (~(-(-((i19 ^ 57) | i21))))) - 1;
                b = i22 % 128;
                int i23 = i22 % 2;
                return iE;
            }
            if (this.h[iE << 1] == null) {
                int i24 = i14 + 17;
                b = i24 % 128;
                if (i24 % 2 != 0) {
                    return iE;
                }
                throw null;
            }
            int i25 = (iE & (-2)) | ((~iE) & 1);
            int i26 = -(-((iE & 1) << 1));
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            int i28 = i14 & 9;
            int i29 = -(-((i14 ^ 9) | i28));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            b = i30 % 128;
            int i31 = i30 % 2;
            while (true) {
                if (i27 < i9) {
                    int i32 = a;
                    int i33 = (i32 & 41) + (i32 | 41);
                    int i34 = i33 % 128;
                    b = i34;
                    int i35 = i33 % 2;
                    if (this.g[i27] == 0) {
                        int i36 = i34 + 35;
                        int i37 = i36 % 128;
                        a = i37;
                        if (i36 % 2 != 0) {
                            if (this.h[(i27 ^ 1) + ((i27 & 1) << 1)] == null) {
                                i4 = (-2) - (((i37 & 64) + (i37 | 64)) ^ (-1));
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i38 = 53 / 0;
                                }
                                return i27;
                            }
                            int i39 = i27 ^ 1;
                            int i40 = ((i27 & 1) | i39) << 1;
                            int i41 = -i39;
                            i27 = (i40 & i41) + (i41 | i40);
                            int i42 = (i34 | 95) << 1;
                            int i43 = -(i34 ^ 95);
                            int i44 = (i42 & i43) + (i43 | i42);
                            a = i44 % 128;
                            int i45 = i44 % 2;
                        } else {
                            if (this.h[i27 << 1] == null) {
                                i4 = (-2) - (((i37 & 64) + (i37 | 64)) ^ (-1));
                                b = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i310 = 53 / 0;
                                }
                                return i27;
                            }
                            int i311 = i27 ^ 1;
                            int i46 = ((i27 & 1) | i311) << 1;
                            int i47 = -i311;
                            i27 = (i46 & i47) + (i47 | i46);
                            int i48 = (i34 | 95) << 1;
                            int i49 = -(i34 ^ 95);
                            int i410 = (i48 & i49) + (i49 | i48);
                            a = i410 % 128;
                            int i411 = i410 % 2;
                        }
                    }
                }
                int i50 = iE - 1;
                int i51 = a;
                int i52 = i51 & 17;
                int i53 = ((i51 | 17) & (~i52)) + (i52 << 1);
                b = i53 % 128;
                loop1: while (true) {
                    int i54 = i53 % 2;
                    do {
                        if (i50 < 0) {
                            break loop1;
                        }
                        int i55 = a;
                        int i56 = i55 ^ 17;
                        int i57 = (i55 & 17) << 1;
                        int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                        int i59 = i58 % 128;
                        b = i59;
                        if (i58 % 2 == 0) {
                            int i60 = 45 / 0;
                            if (this.g[i50] != 0) {
                                break loop1;
                            }
                            int i61 = i59 & 5;
                            int i62 = i61 + ((i59 ^ 5) | i61);
                            i = i62 % 128;
                            a = i;
                            int i63 = i62 % 2;
                            if (this.h[i50 << 1] == null) {
                                int i64 = ((i & 28) + (i | 28)) - 1;
                                int i65 = i64 % 128;
                                b = i65;
                                int i66 = i64 % 2;
                                i2 = i65 + 109;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i67 = 94 / 0;
                                }
                                return i50;
                            }
                            i50 = (i50 ^ (-46)) + ((i50 & (-46)) << 1) + 45;
                            i3 = i + 121;
                            b = i3 % 128;
                        } else {
                            if (this.g[i50] != 0) {
                                break loop1;
                            }
                            int i68 = i59 & 5;
                            int i69 = i68 + ((i59 ^ 5) | i68);
                            i = i69 % 128;
                            a = i;
                            int i610 = i69 % 2;
                            if (this.h[i50 << 1] == null) {
                                int i611 = ((i & 28) + (i | 28)) - 1;
                                int i612 = i611 % 128;
                                b = i612;
                                int i613 = i611 % 2;
                                i2 = i612 + 109;
                                a = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i614 = 94 / 0;
                                }
                                return i50;
                            }
                            i50 = (i50 ^ (-46)) + ((i50 & (-46)) << 1) + 45;
                            i3 = i + 121;
                            b = i3 % 128;
                        }
                    } while (i3 % 2 != 0);
                    i53 = 3;
                }
                int i70 = (~i27) & ((~i27) | i27);
                int i71 = b;
                int i72 = ((i71 & 126) + (i71 | 126)) - 1;
                a = i72 % 128;
                if (i72 % 2 == 0) {
                    return i70;
                }
                throw null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public String toString() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 ^ 28) + ((i3 & 28) << 1)) ^ (-1));
        b = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!(!isEmpty())) {
            int i6 = b;
            int i7 = (((i6 | 80) << 1) - (i6 ^ 80)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (i6 & 119) + (i6 | 119);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return "{}";
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        int i10 = b;
        int i11 = ((i10 & 15) - (~(i10 | 15))) - 1;
        a = i11 % 128;
        if (i11 % 2 != 0) {
            sb.append((char) 25);
            i = 1;
        } else {
            sb.append('{');
            i = 0;
        }
        while (i < this.i) {
            int i12 = b;
            int i13 = (i12 | 111) << 1;
            int i14 = -(((~i12) & 111) | (i12 & (-112)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i > 0) {
                sb.append(", ");
                int i16 = a;
                int i17 = i16 & 101;
                int i18 = i17 + ((i16 ^ 101) | i17);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
            K k = k(i);
            if (k != this) {
                int i20 = b;
                int i21 = (i20 & 101) + (i20 | 101);
                a = i21 % 128;
                int i22 = i21 % 2;
                sb.append(k);
                int i23 = b;
                int i24 = ((i23 & 98) + (i23 | 98)) - 1;
                a = i24 % 128;
                int i25 = i24 % 2;
            } else {
                sb.append("(this Map)");
                int i26 = b;
                int i27 = (i26 & (-86)) | ((~i26) & 85);
                int i28 = (i26 & 85) << 1;
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
            }
            sb.append('=');
            V vN = n(i);
            int i31 = b;
            int i32 = i31 ^ 95;
            int i33 = ((i31 & 95) | i32) << 1;
            int i34 = -i32;
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            a = i35 % 128;
            if (i35 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (vN != this) {
                int i36 = i31 & 41;
                int i37 = ((i31 | 41) & (~i36)) + (i36 << 1);
                a = i37 % 128;
                int i38 = i37 % 2;
                sb.append(vN);
                int i39 = a + 105;
                b = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 2 % 4;
                }
            } else {
                sb.append("(this Map)");
                int i41 = b;
                int i42 = i41 | 107;
                int i43 = i42 << 1;
                int i44 = -((~(i41 & 107)) & i42);
                int i45 = (i43 & i44) + (i44 | i43);
                a = i45 % 128;
                int i46 = i45 % 2;
            }
            int i47 = ((i ^ (-84)) | (i & (-84))) << 1;
            int i48 = -(((~i) & (-84)) | (i & 83));
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            int i50 = (i49 | 85) << 1;
            int i51 = -(i49 ^ 85);
            i = (i50 | i51) + (i50 & i51);
            int i52 = b;
            int i53 = (i52 | 33) << 1;
            int i54 = -(i52 ^ 33);
            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
            a = i55 % 128;
            int i56 = i55 % 2;
        }
        sb.append('}');
        String string = sb.toString();
        int i57 = b;
        int i58 = i57 & 35;
        int i59 = (i58 - (~((i57 ^ 35) | i58))) - 1;
        a = i59 % 128;
        if (i59 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3 A[EDGE_INSN: B:100:0x01f3->B:67:0x01f3 BREAK  A[LOOP:1: B:91:0x019f->B:106:0x019f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ec A[Catch: ClassCastException | NullPointerException -> 0x0256, ClassCastException | NullPointerException -> 0x0256, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ClassCastException | NullPointerException -> 0x0256, blocks: (B:51:0x019f, B:54:0x01bb, B:54:0x01bb, B:56:0x01cf, B:56:0x01cf, B:64:0x01ec, B:64:0x01ec, B:72:0x0206, B:72:0x0206), top: B:91:0x019f }] */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 104) ^ (-1));
        b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 ^ 73;
            int i5 = -(-((i2 & 73) << 1));
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof t) {
            int i7 = i2 & 119;
            int i8 = ((i2 ^ 119) | i7) << 1;
            int i9 = -((~i7) & (i2 | 119));
            int i10 = (i8 & i9) + (i8 | i9);
            int i11 = i10 % 128;
            b = i11;
            int i12 = i10 % 2;
            t tVar = (t) obj;
            if (this.i != tVar.i) {
                int i13 = i11 & 109;
                int i14 = ((i11 ^ 109) | i13) << 1;
                int i15 = -((~i13) & (i11 | 109));
                int i16 = (i14 & i15) + (i14 | i15);
                int i17 = i16 % 128;
                a = i17;
                int i18 = i16 % 2;
                int i19 = (i17 & (-76)) | ((~i17) & 75);
                int i20 = (i17 & 75) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
                return false;
            }
            int i23 = i2 & 13;
            int i24 = (i23 - (~((i2 ^ 13) | i23))) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (i26 < this.i) {
                try {
                    int i27 = b;
                    int i28 = (i27 & 111) + (i27 | 111);
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    K k = k(i26);
                    V vN = n(i26);
                    int i30 = b;
                    int i31 = (i30 & 67) + (i30 | 67);
                    a = i31 % 128;
                    int i32 = i31 % 2;
                    Object obj3 = tVar.get(k);
                    if (vN == null) {
                        int i33 = b;
                        int i34 = i33 & 33;
                        int i35 = -(-((i33 ^ 33) | i34));
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        a = i36 % 128;
                        if (i36 % 2 != 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        if (obj3 != null || !tVar.containsKey(k)) {
                            int i37 = b;
                            int i38 = i37 ^ 3;
                            int i39 = ((((i37 & 3) | i38) << 1) - (~(-i38))) - 1;
                            a = i39 % 128;
                            int i40 = i39 % 2;
                            return false;
                        }
                    } else if (!vN.equals(obj3)) {
                        int i41 = b;
                        int i42 = i41 & 123;
                        int i43 = ((((i41 ^ 123) | i42) << 1) - (~(-((~i42) & (i41 | 123))))) - 1;
                        a = i43 % 128;
                        int i44 = i43 % 2;
                        int i45 = ((i41 | 3) << 1) - (((~i41) & 3) | (i41 & (-4)));
                        a = i45 % 128;
                        int i46 = i45 % 2;
                        return false;
                    }
                    int i47 = i26 & (-12);
                    int i48 = ((((i26 ^ (-12)) | i47) << 1) - (~(-((i26 | (-12)) & (~i47))))) - 1;
                    int i49 = i48 & 13;
                    int i50 = -(-((i48 ^ 13) | i49));
                    i26 = (i49 | i50) + (i49 & i50);
                    int i51 = a;
                    int i52 = i51 & 39;
                    int i53 = -(-((i51 ^ 39) | i52));
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            int i56 = b;
            int i57 = i56 ^ 119;
            int i58 = -(-((i56 & 119) << 1));
            int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
            a = i59 % 128;
            if (i59 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof Map) {
            int i60 = ((i2 & (-10)) | ((~i2) & 9)) + ((i2 & 9) << 1);
            b = i60 % 128;
            int i61 = i60 % 2;
            Map map = (Map) obj;
            if (this.i != map.size()) {
                int i62 = a;
                int i63 = (i62 ^ 101) + ((i62 & 101) << 1);
                int i64 = i63 % 128;
                b = i64;
                int i65 = i63 % 2;
                int i66 = i64 & 107;
                int i67 = (((i64 | 107) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                a = i67 % 128;
                int i68 = i67 % 2;
                return false;
            }
            int i69 = a;
            int i70 = ((i69 | 91) << 1) - (i69 ^ 91);
            b = i70 % 128;
            int i71 = i70 % 2;
            int i72 = 0;
            while (true) {
                try {
                    if (i72 >= this.i) {
                        int i73 = a;
                        int i74 = i73 & 33;
                        int i75 = (i73 ^ 33) | i74;
                        int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                        b = i76 % 128;
                        if (i76 % 2 != 0) {
                            return true;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    int i77 = a;
                    int i78 = ((i77 ^ 33) | (i77 & 33)) << 1;
                    int i79 = -(((~i77) & 33) | (i77 & (-34)));
                    int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                    b = i80 % 128;
                    int i81 = i80 % 2;
                    K k2 = k(i72);
                    V vN2 = n(i72);
                    int i82 = b;
                    int i83 = (i82 & 65) + (i82 | 65);
                    a = i83 % 128;
                    int i84 = i83 % 2;
                    Object obj4 = map.get(k2);
                    if (vN2 == null) {
                        int i85 = b;
                        int i86 = ((i85 | 111) << 1) - (i85 ^ 111);
                        a = i86 % 128;
                        if (i86 % 2 == 0) {
                            if (obj4 != null) {
                                break;
                            }
                            if (!map.containsKey(k2)) {
                                break;
                                break;
                            }
                        } else {
                            int i87 = 52 / 0;
                            if (obj4 != null) {
                                break;
                            }
                            if (!map.containsKey(k2)) {
                                break;
                            }
                        }
                    } else if (!vN2.equals(obj4)) {
                        int i88 = a;
                        int i89 = (i88 ^ 80) + ((i88 & 80) << 1);
                        int i90 = (i89 ^ (-1)) + (i89 << 1);
                        b = i90 % 128;
                        int i91 = i90 % 2;
                        return false;
                    }
                    int i92 = ((i72 & (-39)) - (~(-(-(i72 | (-39)))))) - 1;
                    int i93 = i92 & 40;
                    int i94 = (i92 ^ 40) | i93;
                    i72 = (i93 | i94) + (i93 & i94);
                    int i95 = a + 45;
                    b = i95 % 128;
                    if (i95 % 2 == 0) {
                        int i96 = 2 / 2;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            int i97 = a;
            int i98 = (i97 ^ 1) + ((i97 & 1) << 1);
            b = i98 % 128;
            if (i98 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        int i99 = a;
        int i100 = i99 & 75;
        int i101 = ((i99 | 75) & (~i100)) + (i100 << 1);
        b = i101 % 128;
        int i102 = i101 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:27:0x0131  */
    /* JADX WARN: Code duplicated, block: B:29:0x0135  */
    /* JADX WARN: Code duplicated, block: B:31:0x0147  */
    /* JADX WARN: Code duplicated, block: B:32:0x014e  */
    /* JADX WARN: Code duplicated, block: B:35:0x017f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0199  */
    /* JADX WARN: Code duplicated, block: B:38:0x019e  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ad  */
    public V l(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        Object[] objArr;
        int i14;
        int i15;
        int i16 = 2 % 2;
        int i17 = b;
        int i18 = (i17 & (-124)) | ((~i17) & 123);
        int i19 = (i17 & 123) << 1;
        int i20 = (i18 & i19) + (i18 | i19);
        a = i20 % 128;
        int i21 = i20 % 2;
        Object[] objArr2 = this.h;
        int i22 = i << 1;
        int i23 = i17 & 15;
        int i24 = i17 | 15;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        int i26 = i25 % 128;
        a = i26;
        int i27 = i25 % 2;
        int i28 = i22 & 1;
        int i29 = -(-((i22 ^ 1) | i28));
        V v = (V) objArr2[(i28 ^ i29) + ((i28 & i29) << 1)];
        int i30 = this.i;
        int i31 = (((i26 | 116) << 1) - (i26 ^ 116)) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
        if (i30 <= 1) {
            int i33 = ((i26 | 1) << 1) - (i26 ^ 1);
            b = i33 % 128;
            int i34 = i33 % 2;
            e(this.g, objArr2, i30);
            int i35 = b + 103;
            a = i35 % 128;
            int i36 = i35 % 2;
            this.g = h.E;
            Object[] objArr3 = h.F;
            int i37 = a;
            int i38 = i37 & 27;
            int i39 = i37 | 27;
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            int i41 = i40 % 128;
            b = i41;
            int i42 = i40 % 2;
            this.h = objArr3;
            int i43 = ((i41 | 37) << 1) - (i41 ^ 37);
            a = i43 % 128;
            int i44 = i43 % 2;
            i5 = 0;
        } else {
            int i45 = (i30 ^ (-1)) + (i30 << 1);
            int[] iArr2 = this.g;
            int i46 = (((i26 | 92) << 1) - (i26 ^ 92)) - 1;
            int i47 = i46 % 128;
            b = i47;
            if (i46 % 2 == 0) {
                if (iArr2.length > 105) {
                    i2 = 44;
                    if (i30 < iArr2.length / 3) {
                        int i48 = i26 & 97;
                        i6 = ((((i26 ^ 97) | i48) << 1) - (~(-((i26 | 97) & (~i48))))) - 1;
                        i7 = i6 % 128;
                        b = i7;
                        if (i6 % 2 == 0 ? i30 > 8 : i30 > 2) {
                            int i49 = i30 >> 1;
                            i2 = (i30 & i49) + (i49 | i30);
                            int i50 = ((i7 | 67) << 1) - (i7 ^ 67);
                            a = i50 % 128;
                            int i51 = i50 % 2;
                        }
                        d(i2);
                        if (i30 == this.i) {
                            throw new ConcurrentModificationException();
                        }
                        int i52 = a + 41;
                        i8 = i52 % 128;
                        b = i8;
                        int i53 = i52 % 2;
                        if (i > 0) {
                            int i54 = i8 & 15;
                            int i55 = i54 + ((i8 ^ 15) | i54);
                            a = i55 % 128;
                            int i56 = i55 % 2;
                            System.arraycopy(iArr2, 0, this.g, 0, i);
                            int i57 = a;
                            int i58 = i57 & 51;
                            int i59 = -(-(i57 | 51));
                            int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                            b = i60 % 128;
                            int i61 = i60 % 2;
                            System.arraycopy(objArr2, 0, this.h, 0, i22);
                            int i62 = a;
                            int i63 = i62 & 3;
                            int i64 = -(-((i62 ^ 3) | i63));
                            i15 = ((i63 | i64) << 1) - (i64 ^ i63);
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i65 = 3 / 3;
                            }
                        }
                        if (i < i45) {
                            int i66 = b;
                            i9 = ((i66 & 95) - (~(-(-(i66 | 95))))) - 1;
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                i10 = i >>> 1;
                                iArr = this.g;
                                i11 = i45 >>> i;
                            } else {
                                int i67 = ((i ^ 1) | (i & 1)) << 1;
                                int i68 = -((i & (-2)) | ((~i) & 1));
                                i10 = (i67 | i68) + (i67 & i68);
                                iArr = this.g;
                                int i69 = -i;
                                int i70 = i45 & i69;
                                int i71 = ((i45 ^ i69) | i70) << 1;
                                int i72 = -((i69 | i45) & (~i70));
                                i11 = ((i72 & i71) << 1) + (i71 ^ i72);
                            }
                            int i73 = i66 & 63;
                            i12 = (i73 - (~((i66 ^ 63) | i73))) - 1;
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                System.arraycopy(iArr2, i10, iArr, i, i11);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            System.arraycopy(iArr2, i10, iArr, i, i11);
                            i13 = i10 << 1;
                            objArr = this.h;
                            int i74 = b;
                            int i75 = i74 & 109;
                            i14 = (i75 - (~(-(-((i74 ^ 109) | i75))))) - 1;
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                System.arraycopy(objArr2, i13, objArr, i22, i11);
                            } else {
                                System.arraycopy(objArr2, i13, objArr, i22, i11 << 1);
                            }
                        }
                    }
                }
                int i76 = b;
                int i77 = (i76 & (-42)) | ((~i76) & 41);
                int i78 = -(-((i76 & 41) << 1));
                int i79 = (i77 & i78) + (i78 | i77);
                a = i79 % 128;
                int i80 = i79 % 2;
                i5 = i45;
            } else {
                if (iArr2.length > 8) {
                    i2 = 8;
                    if (i30 < iArr2.length / 3) {
                        int i410 = i26 & 97;
                        i6 = ((((i26 ^ 97) | i410) << 1) - (~(-((i26 | 97) & (~i410))))) - 1;
                        i7 = i6 % 128;
                        b = i7;
                        if (i6 % 2 == 0) {
                            int i411 = i30 >> 1;
                            i2 = (i30 & i411) + (i411 | i30);
                            int i510 = ((i7 | 67) << 1) - (i7 ^ 67);
                            a = i510 % 128;
                            int i511 = i510 % 2;
                        } else {
                            int i412 = i30 >> 1;
                            i2 = (i30 & i412) + (i412 | i30);
                            int i512 = ((i7 | 67) << 1) - (i7 ^ 67);
                            a = i512 % 128;
                            int i513 = i512 % 2;
                        }
                        d(i2);
                        if (i30 == this.i) {
                            throw new ConcurrentModificationException();
                        }
                        int i514 = a + 41;
                        i8 = i514 % 128;
                        b = i8;
                        int i515 = i514 % 2;
                        if (i > 0) {
                            int i516 = i8 & 15;
                            int i517 = i516 + ((i8 ^ 15) | i516);
                            a = i517 % 128;
                            int i518 = i517 % 2;
                            System.arraycopy(iArr2, 0, this.g, 0, i);
                            int i519 = a;
                            int i520 = i519 & 51;
                            int i521 = -(-(i519 | 51));
                            int i610 = ((i520 | i521) << 1) - (i521 ^ i520);
                            b = i610 % 128;
                            int i611 = i610 % 2;
                            System.arraycopy(objArr2, 0, this.h, 0, i22);
                            int i612 = a;
                            int i613 = i612 & 3;
                            int i614 = -(-((i612 ^ 3) | i613));
                            i15 = ((i613 | i614) << 1) - (i614 ^ i613);
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i615 = 3 / 3;
                            }
                        }
                        if (i < i45) {
                            int i616 = b;
                            i9 = ((i616 & 95) - (~(-(-(i616 | 95))))) - 1;
                            a = i9 % 128;
                            if (i9 % 2 != 0) {
                                i10 = i >>> 1;
                                iArr = this.g;
                                i11 = i45 >>> i;
                            } else {
                                int i617 = ((i ^ 1) | (i & 1)) << 1;
                                int i618 = -((i & (-2)) | ((~i) & 1));
                                i10 = (i617 | i618) + (i617 & i618);
                                iArr = this.g;
                                int i619 = -i;
                                int i710 = i45 & i619;
                                int i711 = ((i45 ^ i619) | i710) << 1;
                                int i712 = -((i619 | i45) & (~i710));
                                i11 = ((i712 & i711) << 1) + (i711 ^ i712);
                            }
                            int i713 = i616 & 63;
                            i12 = (i713 - (~((i616 ^ 63) | i713))) - 1;
                            a = i12 % 128;
                            if (i12 % 2 == 0) {
                                System.arraycopy(iArr2, i10, iArr, i, i11);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            System.arraycopy(iArr2, i10, iArr, i, i11);
                            i13 = i10 << 1;
                            objArr = this.h;
                            int i714 = b;
                            int i715 = i714 & 109;
                            i14 = (i715 - (~(-(-((i714 ^ 109) | i715))))) - 1;
                            a = i14 % 128;
                            if (i14 % 2 != 0) {
                                System.arraycopy(objArr2, i13, objArr, i22, i11);
                            } else {
                                System.arraycopy(objArr2, i13, objArr, i22, i11 << 1);
                            }
                        }
                    }
                }
                int i716 = b;
                int i717 = (i716 & (-42)) | ((~i716) & 41);
                int i718 = -(-((i716 & 41) << 1));
                int i719 = (i717 & i718) + (i718 | i717);
                a = i719 % 128;
                int i81 = i719 % 2;
                i5 = i45;
            }
            if (i < i45) {
                int i82 = i47 + 79;
                a = i82 % 128;
                if (i82 % 2 != 0) {
                    i3 = i >>> 1;
                    i4 = i45 % i;
                } else {
                    i3 = (i ^ 1) + ((i & 1) << 1);
                    int i83 = -i;
                    int i84 = (i45 | i83) << 1;
                    int i85 = -(i83 ^ i45);
                    i4 = (i85 | i84) + (i84 & i85);
                }
                System.arraycopy(iArr2, i3, iArr2, i, i4);
                Object[] objArr4 = this.h;
                int i86 = a;
                int i87 = (i86 & 115) + (i86 | 115);
                b = i87 % 128;
                if (i87 % 2 == 0) {
                    int i88 = ((i4 ^ (-1)) | i4) << 1;
                    int i89 = -(~i4);
                    System.arraycopy(objArr4, i3, objArr4, i22, (i88 ^ i89) + ((i89 & i88) << 1));
                } else {
                    System.arraycopy(objArr4, i3 << 1, objArr4, i22, i4 << 1);
                }
                int i90 = a;
                int i91 = i90 & 15;
                int i92 = ((((i90 ^ 15) | i91) << 1) - (~(-((i90 | 15) & (~i91))))) - 1;
                b = i92 % 128;
                int i93 = i92 % 2;
            }
            Object[] objArr5 = this.h;
            int i94 = i45 << 1;
            objArr5[i94] = null;
            int i95 = b;
            int i96 = (((i95 | 25) << 1) - (~(-((i95 & (-26)) | ((~i95) & 25))))) - 1;
            a = i96 % 128;
            if (i96 % 2 != 0) {
                objArr5[0] = null;
            } else {
                objArr5[(((i94 | 1) << 1) - (~(-(((~i94) & 1) | (i94 & (-2)))))) - 1] = null;
            }
            int i97 = i95 & 35;
            int i98 = i97 + ((i95 ^ 35) | i97);
            a = i98 % 128;
            int i99 = i98 % 2;
            int i7110 = b;
            int i7111 = (i7110 & (-42)) | ((~i7110) & 41);
            int i7112 = -(-((i7110 & 41) << 1));
            int i7113 = (i7111 & i7112) + (i7112 | i7111);
            a = i7113 % 128;
            int i810 = i7113 % 2;
            i5 = i45;
        }
        if (i30 != this.i) {
            throw new ConcurrentModificationException();
        }
        int i100 = b;
        int i101 = i100 & 81;
        int i102 = -(-((i100 ^ 81) | i101));
        int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
        a = i103 % 128;
        int i104 = i103 % 2;
        this.i = i5;
        if (i104 == 0) {
            return v;
        }
        throw null;
    }

    public V put(K k, V v) {
        int i;
        int iJ;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 & 80) + (i5 | 80)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.i;
        if (k == null) {
            int i9 = ((i5 & 56) + (i5 | 56)) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            iJ = j();
            int i11 = a;
            int i12 = i11 & 87;
            int i13 = (i11 ^ 87) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            int iH = h(k, iHashCode);
            int i16 = b + 45;
            a = i16 % 128;
            int i17 = i16 % 2;
            i = iHashCode;
            iJ = iH;
        }
        if (iJ >= 0) {
            int i18 = b;
            int i19 = i18 & 19;
            int i20 = (i18 ^ 19) | i19;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = iJ << 1;
            int i24 = i23 ^ 1;
            int i25 = ((i23 & 1) | i24) << 1;
            int i26 = -i24;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            Object[] objArr = this.h;
            int i28 = ((i18 ^ 113) | (i18 & 113)) << 1;
            int i29 = -(((~i18) & 113) | (i18 & (-114)));
            int i30 = (i28 & i29) + (i29 | i28);
            int i31 = i30 % 128;
            a = i31;
            int i32 = i30 % 2;
            V v2 = (V) objArr[i27];
            objArr[i27] = v;
            int i33 = i31 & 27;
            int i34 = ((i31 ^ 27) | i33) << 1;
            int i35 = -((i31 | 27) & (~i33));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            return v2;
        }
        int i38 = ~iJ;
        int[] iArr = this.g;
        Object obj = null;
        if (i8 >= iArr.length) {
            int i39 = b;
            int i40 = (((i39 | 44) << 1) - (i39 ^ 44)) - 1;
            a = i40 % 128;
            int i41 = i40 % 2;
            if (i8 >= 8) {
                int i42 = (i39 & 51) + (i39 | 51);
                a = i42 % 128;
                int i43 = i42 % 2;
                i3 = (i8 >> 1) + i8;
                int i44 = (i39 & (-40)) | ((~i39) & 39);
                int i45 = -(-((i39 & 39) << 1));
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                a = i46 % 128;
                int i47 = i46 % 2;
            } else if (i8 >= 4) {
                int i48 = i39 & 39;
                int i49 = ((i39 ^ 39) | i48) << 1;
                int i50 = -((i39 | 39) & (~i48));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                int i52 = i51 % 128;
                a = i52;
                i3 = i51 % 2 == 0 ? 8 : 27;
                int i53 = (i52 ^ 12) + ((i52 & 12) << 1);
                int i54 = (i53 ^ (-1)) + (i53 << 1);
                b = i54 % 128;
                int i55 = i54 % 2;
            } else {
                i3 = 4;
            }
            Object[] objArr2 = this.h;
            d(i3);
            int i56 = (-2) - ((b + 80) ^ (-1));
            int i57 = i56 % 128;
            a = i57;
            if (i56 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i8 != this.i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.g;
            if (iArr2.length > 0) {
                int i58 = i57 & 45;
                int i59 = (i57 | 45) & (~i58);
                int i60 = -(-(i58 << 1));
                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                b = i61 % 128;
                int i62 = i61 % 2;
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                Object[] objArr3 = this.h;
                int i63 = a;
                int i64 = ((i63 | 11) << 1) - (i63 ^ 11);
                b = i64 % 128;
                int i65 = i64 % 2;
                System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                int i66 = a + 67;
                b = i66 % 128;
                int i67 = i66 % 2;
            }
            e(iArr, objArr2, i8);
            int i68 = b;
            int i69 = (i68 & 57) + (i68 | 57);
            a = i69 % 128;
            int i70 = i69 % 2;
        }
        if (i38 < i8) {
            int i71 = b;
            int i72 = i71 + 121;
            a = i72 % 128;
            int i73 = i72 % 2;
            int[] iArr3 = this.g;
            int i74 = ((i38 & (-2)) | ((~i38) & 1)) + ((i38 & 1) << 1);
            int i75 = (((i71 | 18) << 1) - (i71 ^ 18)) - 1;
            a = i75 % 128;
            if (i75 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i76 = -i38;
            int i77 = -(~i76);
            System.arraycopy(iArr3, i38, iArr3, i74, ((i8 ^ i77) + ((i77 & i8) << 1)) - 1);
            Object[] objArr4 = this.h;
            int i78 = a;
            int i79 = ((i78 | 39) << 1) - (i78 ^ 39);
            b = i79 % 128;
            int i80 = i79 % 2;
            int i81 = i38 << 1;
            int i82 = i74 << 1;
            int i83 = this.i;
            int i84 = i78 & 43;
            int i85 = (i78 | 43) & (~i84);
            int i86 = i84 << 1;
            int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
            b = i87 % 128;
            if (i87 % 2 == 0) {
                int i88 = -i76;
                int i89 = i83 & i88;
                int i90 = (i88 | i83) & (~i89);
                int i91 = -(-(i89 << 1));
                System.arraycopy(objArr4, i81, objArr4, i82, (((i90 | i91) << 1) - (i90 ^ i91)) / 0);
            } else {
                int i92 = i83 ^ i76;
                int i93 = -(-((i76 & i83) << 1));
                System.arraycopy(objArr4, i81, objArr4, i82, (((i92 | i93) << 1) - (i92 ^ i93)) << 1);
            }
        }
        int i94 = this.i;
        if (i8 == i94) {
            int i95 = a;
            int i96 = (i95 & (-42)) | ((~i95) & 41);
            int i97 = -(-((i95 & 41) << 1));
            int i98 = (i96 & i97) + (i96 | i97);
            b = i98 % 128;
            int i99 = i98 % 2;
            int[] iArr4 = this.g;
            if (i38 < iArr4.length) {
                int i100 = i95 & 83;
                int i101 = i100 + ((i95 ^ 83) | i100);
                b = i101 % 128;
                int i102 = i101 % 2;
                iArr4[i38] = i;
                Object[] objArr5 = this.h;
                int i103 = i95 & 97;
                int i104 = i103 + ((i95 ^ 97) | i103);
                b = i104 % 128;
                if (i104 % 2 == 0) {
                    int i105 = i38 % 1;
                    objArr5[i105] = k;
                    int i106 = i105 & 1;
                    i2 = (((i105 ^ 1) | i106) << 1) - ((i105 | 1) & (~i106));
                } else {
                    int i107 = i38 << 1;
                    objArr5[i107] = k;
                    int i108 = i107 & 1;
                    i2 = (i108 << 1) + ((i107 | 1) & (~i108));
                }
                int i109 = ((i95 | 7) << 1) - (i95 ^ 7);
                int i110 = i109 % 128;
                b = i110;
                int i111 = i109 % 2;
                objArr5[i2] = v;
                int i112 = i94 & 1;
                int i113 = (i94 ^ 1) | i112;
                this.i = (i112 ^ i113) + ((i112 & i113) << 1);
                int i114 = i110 & 25;
                int i115 = i114 + ((i110 ^ 25) | i114);
                a = i115 % 128;
                if (i115 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        throw new ConcurrentModificationException();
    }
}
