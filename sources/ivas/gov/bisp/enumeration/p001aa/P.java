package ivas.gov.bisp.enumeration.p001aa;

import ivas.gov.bisp.enumeration.OooOOoo.OooOOO;
import ivas.gov.bisp.enumeration.p006af.h;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class P<K, V> {
    private static int a = 0;
    private static int b = 1;
    public OooOOO<K, V>.OooO0O0 c;
    public OooOOO<K, V>.OooO0OO d;
    public OooOOO<K, V>.OooO e;

    public final class aTv<T> implements Iterator<T> {
        private static int a = 1;
        private static int b;
        public final int c;
        public int d;
        public int e;
        public boolean g = false;

        public aTv(int i) {
            this.c = i;
            this.d = P.this.i();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = 2 % 2;
            int i2 = b;
            boolean z = true;
            int i3 = (i2 ^ 108) + ((i2 & 108) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.e < this.d) {
                int i6 = i5 & 85;
                int i7 = ((i5 | 85) & (~i6)) + (i6 << 1);
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                int i10 = i8 | 117;
                int i11 = i10 << 1;
                int i12 = -((~(i8 & 117)) & i10);
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = i2 & 7;
                int i16 = (i2 ^ 7) | i15;
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                z = false;
            }
            int i19 = a;
            int i20 = (i19 & 97) + (i19 | 97);
            b = i20 % 128;
            if (i20 % 2 == 0) {
                return z;
            }
            throw null;
        }

        @Override // java.util.Iterator
        public final T next() {
            T t;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 113) + (i2 | 113);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i5 = a;
            int i6 = i5 & 63;
            int i7 = (i5 | 63) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            int i10 = i9 % 128;
            b = i10;
            if (i9 % 2 != 0) {
                throw null;
            }
            P p = P.this;
            int i11 = this.e;
            int i12 = this.c;
            int i13 = ((i10 ^ 81) - (~((i10 & 81) << 1))) - 1;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                t = (T) p.g(i11, i12);
                this.e >>>= 1;
            } else {
                t = (T) p.g(i11, i12);
                int i14 = this.e;
                int i15 = i14 & 1;
                int i16 = -(-((i14 ^ 1) | i15));
                this.e = (i15 & i16) + (i16 | i15);
            }
            this.g = true;
            int i17 = b;
            int i18 = (i17 | 75) << 1;
            int i19 = -(i17 ^ 75);
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                return t;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            if ((r4 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r2 = r6.e << 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        
            r6.e = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            r2 = r6.e - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            r6.d--;
            r4 = r1 | 21;
            r5 = (r4 << 1) - ((~(r1 & 21)) & r4);
            ivas.gov.bisp.enumeration.aa.P.aTv.b = r5 % 128;
            r5 = r5 % 2;
            r6.g = false;
            r6.f.m(r2);
            r1 = ivas.gov.bisp.enumeration.aa.P.aTv.b + 103;
            ivas.gov.bisp.enumeration.aa.P.aTv.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        
            throw new java.lang.IllegalStateException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r6.g != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            if (r6.g != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            r2 = r1 & 71;
            r1 = -(-(r1 | 71));
            r4 = (r2 ^ r1) + ((r1 & r2) << 1);
            r1 = r4 % 128;
            ivas.gov.bisp.enumeration.aa.P.aTv.a = r1;
         */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void remove() {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.aa.P.aTv.b
                r2 = r1 | 123(0x7b, float:1.72E-43)
                int r2 = r2 << 1
                r3 = r1 ^ 123(0x7b, float:1.72E-43)
                int r2 = r2 - r3
                int r3 = r2 % 128
                ivas.gov.bisp.enumeration.aa.P.aTv.a = r3
                int r2 = r2 % r0
                r3 = 0
                if (r2 != 0) goto L1c
                boolean r2 = r6.g
                r4 = 15
                int r4 = r4 / r3
                if (r2 == 0) goto L64
                goto L20
            L1c:
                boolean r2 = r6.g
                if (r2 == 0) goto L64
            L20:
                r2 = r1 & 71
                r1 = r1 | 71
                int r1 = -r1
                int r1 = -r1
                r4 = r2 ^ r1
                r1 = r1 & r2
                int r1 = r1 << 1
                int r4 = r4 + r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.aa.P.aTv.a = r1
                int r4 = r4 % r0
                if (r4 != 0) goto L3a
                int r2 = r6.e
                int r2 = r2 << 1
            L37:
                r6.e = r2
                goto L3f
            L3a:
                int r2 = r6.e
                int r2 = r2 + (-1)
                goto L37
            L3f:
                int r4 = r6.d
                int r4 = r4 + (-1)
                r6.d = r4
                r4 = r1 | 21
                int r5 = r4 << 1
                r1 = r1 & 21
                int r1 = ~r1
                r1 = r1 & r4
                int r5 = r5 - r1
                int r1 = r5 % 128
                ivas.gov.bisp.enumeration.aa.P.aTv.b = r1
                int r5 = r5 % r0
                r6.g = r3
                ivas.gov.bisp.enumeration.aa.P r1 = ivas.gov.bisp.enumeration.p001aa.P.this
                r1.m(r2)
                int r1 = ivas.gov.bisp.enumeration.aa.P.aTv.b
                int r1 = r1 + 103
                int r2 = r1 % 128
                ivas.gov.bisp.enumeration.aa.P.aTv.a = r2
                int r1 = r1 % r0
                return
            L64:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aa.P.aTv.remove():void");
        }
    }

    public final class aTw implements Set<Map.Entry<K, V>> {
        private static int a = 1;
        private static int b;

        public aTw() {
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 113) + (i2 | 113);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                P.this.f();
            } else {
                P.this.f();
                throw null;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 27) << 1) - (((~i2) & 27) | (i2 & (-28)));
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean zC = P.c(this, obj);
            int i5 = a;
            int i6 = ((i5 & 17) - (~(i5 | 17))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return zC;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x007b A[PHI: r6
  0x007b: PHI (r6v3 java.lang.Object) = (r6v2 java.lang.Object), (r6v14 java.lang.Object) binds: [B:13:0x0079, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0092  */
        /* JADX WARN: Code duplicated, block: B:17:0x0094  */
        /* JADX WARN: Code duplicated, block: B:18:0x0096 A[PHI: r6
  0x0096: PHI (r6v13 java.lang.Object) = (r6v2 java.lang.Object), (r6v14 java.lang.Object) binds: [B:13:0x0079, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x00ac  */
        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            Object objG;
            int i;
            int iHashCode;
            int iHashCode2;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 & 119;
            int i6 = (i4 ^ 119) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            int i9 = P.this.i();
            int i10 = ((i9 ^ (-1)) | i9) << 1;
            int i11 = -(~i9);
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = a;
            int i14 = (i13 & 37) + (i13 | 37);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 & 51;
            int i17 = -(-(i13 | 51));
            int i18 = (i16 & i17) + (i17 | i16);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 4 % 2;
            }
            int i20 = 0;
            while (i12 >= 0) {
                int i21 = b;
                int i22 = i21 & 125;
                int i23 = (i21 ^ 125) | i22;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                a = i24 % 128;
                int i25 = i24 % 2;
                Object objG2 = P.this.g(i12, 0);
                P p = P.this;
                int i26 = a + 85;
                b = i26 % 128;
                if (i26 % 2 != 0) {
                    objG = p.g(i12, 1);
                    if (objG2 == null) {
                        int i27 = b;
                        int i28 = i27 & 75;
                        int i29 = (i27 | 75) & (~i28);
                        int i30 = -(-(i28 << 1));
                        i = ((i29 | i30) << 1) - (i29 ^ i30);
                        a = i % 128;
                        if (i % 2 == 0) {
                            iHashCode = 1;
                        } else {
                            iHashCode = 0;
                        }
                    } else {
                        iHashCode = objG2.hashCode();
                        int i31 = b;
                        int i32 = i31 & 101;
                        int i33 = (i31 ^ 101) | i32;
                        i2 = (i32 & i33) + (i33 | i32);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i34 = 2 / 4;
                        }
                    }
                } else {
                    objG = p.g(i12, 1);
                    if (objG2 == null) {
                        int i210 = b;
                        int i211 = i210 & 75;
                        int i212 = (i210 | 75) & (~i211);
                        int i35 = -(-(i211 << 1));
                        i = ((i212 | i35) << 1) - (i212 ^ i35);
                        a = i % 128;
                        if (i % 2 == 0) {
                            iHashCode = 1;
                        } else {
                            iHashCode = 0;
                        }
                    } else {
                        iHashCode = objG2.hashCode();
                        int i36 = b;
                        int i37 = i36 & 101;
                        int i38 = (i36 ^ 101) | i37;
                        i2 = (i37 & i38) + (i38 | i37);
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i39 = 2 / 4;
                        }
                    }
                }
                if (objG == null) {
                    int i40 = a;
                    int i41 = ((i40 | 41) << 1) - (i40 ^ 41);
                    b = i41 % 128;
                    int i42 = i41 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = objG.hashCode();
                    int i43 = a;
                    int i44 = ((i43 & (-2)) | ((~i43) & 1)) + ((i43 & 1) << 1);
                    b = i44 % 128;
                    int i45 = i44 % 2;
                }
                int i46 = -(-(((~iHashCode) & iHashCode2) | ((~iHashCode2) & iHashCode)));
                int i47 = i20 & i46;
                int i48 = i20 | i46;
                i20 = (i48 | i47) + (i47 & i48);
                i12--;
                int i49 = (-2) - ((b + 110) ^ (-1));
                a = i49 % 128;
                int i50 = i49 % 2;
            }
            int i51 = a;
            int i52 = (i51 | 95) << 1;
            int i53 = -(((~i51) & 95) | (i51 & (-96)));
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            b = i54 % 128;
            int i55 = i54 % 2;
            return i20;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 11) + (i2 | 11);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (P.this.i() == 0) {
                int i5 = b;
                z = true;
                int i6 = ((i5 ^ 5) | (i5 & 5)) << 1;
                int i7 = -((i5 & (-6)) | ((~i5) & 5));
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = (i5 & 39) + (i5 | 39);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 / 2;
                }
            } else {
                int i12 = a;
                int i13 = (i12 & 53) + (i12 | 53);
                b = i13 % 128;
                int i14 = i13 % 2;
                z = false;
            }
            int i15 = b;
            int i16 = (i15 & 33) + (i15 | 33);
            a = i16 % 128;
            int i17 = i16 % 2;
            return z;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            int i = 2 % 2;
            aTy aty = new aTy();
            int i2 = b;
            int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
            a = i3 % 128;
            int i4 = i3 % 2;
            return aty;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = P.this.i();
            int i6 = a;
            int i7 = i6 & 5;
            int i8 = i7 + ((i6 ^ 5) | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            return i5;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            boolean z;
            int i = 2 % 2;
            int i2 = b + 7;
            a = i2 % 128;
            int i3 = i2 % 2;
            int i4 = P.this.i();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            int i5 = b;
            int i6 = (((i5 & (-120)) | ((~i5) & 119)) - (~(-(-((i5 & 119) << 1))))) - 1;
            int i7 = i6 % 128;
            a = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = (i7 & 62) + (i7 | 62);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 % 2;
            }
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                int i11 = a;
                int i12 = (((i11 ^ 79) | (i11 & 79)) << 1) - (((~i11) & 79) | (i11 & (-80)));
                b = i12 % 128;
                int i13 = i12 % 2;
                Map.Entry<K, V> next = it.next();
                P p = P.this;
                int i14 = a;
                int i15 = i14 & 71;
                int i16 = (71 ^ i14) | i15;
                int i17 = (i15 & i16) + (i16 | i15);
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    p.l(next.getKey(), next.getValue());
                    int i18 = 64 / 0;
                } else {
                    p.l(next.getKey(), next.getValue());
                }
                int i19 = a;
                int i20 = ((i19 & 110) + (i19 | 110)) - 1;
                b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 3 % 5;
                }
            }
            if (i4 != P.this.i()) {
                int i22 = b;
                int i23 = (i22 & (-72)) | ((~i22) & 71);
                int i24 = (i22 & 71) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                a = i25 % 128;
                if (i25 % 2 != 0) {
                    z = true;
                }
            } else {
                int i26 = a;
                int i27 = i26 & 15;
                int i28 = -(-(i26 | 15));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i29 % 128;
                int i30 = i29 % 2;
            }
            int i31 = b;
            int i32 = i31 ^ 3;
            int i33 = -(-((i31 & 3) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            a = i34 % 128;
            if (i34 % 2 != 0) {
                return z;
            }
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 93;
            int i4 = ((i2 & 93) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                collection.iterator();
                obj.hashCode();
                throw null;
            }
            Iterator<?> it = collection.iterator();
            int i7 = a;
            int i8 = i7 & 95;
            int i9 = -(-((i7 ^ 95) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            while (true) {
                if (it.hasNext()) {
                    int i12 = a;
                    int i13 = (i12 ^ 81) + ((i12 & 81) << 1);
                    b = i13 % 128;
                    if (i13 % 2 == 0) {
                        if (!contains(it.next())) {
                            break;
                        }
                    } else {
                        int i14 = 66 / 0;
                        if (!contains(it.next())) {
                            break;
                        }
                    }
                } else {
                    int i15 = a + 103;
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        return true;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            int i16 = a;
            int i17 = (i16 & (-82)) | ((~i16) & 81);
            int i18 = (i16 & 81) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 34) + ((i2 & 34) << 1);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            if (!(obj instanceof Map.Entry)) {
                int i7 = i5 & 9;
                int i8 = i7 + ((i5 ^ 9) | i7);
                b = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            P p = P.this;
            Object key = entry.getKey();
            int i10 = b + 61;
            a = i10 % 128;
            int i11 = i10 % 2;
            int iK = p.k(key);
            if (iK < 0) {
                int i12 = b;
                int i13 = i12 | 83;
                int i14 = ((i13 << 1) - (~(-(i13 & (~(i12 & 83)))))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
                int i16 = (i12 ^ 95) + ((i12 & 95) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            Object objG = P.this.g(iK, 1);
            Object value = entry.getValue();
            int i18 = a;
            int i19 = ((i18 ^ 27) - (~(-(-((i18 & 27) << 1))))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            boolean zH = h.h(objG, value);
            int i21 = a;
            int i22 = i21 & 105;
            int i23 = (i22 - (~((i21 ^ 105) | i22))) - 1;
            b = i23 % 128;
            if (i23 % 2 == 0) {
                return zH;
            }
            throw null;
        }
    }

    public final class aTx implements Set<K> {
        private static int a = 0;
        private static int b = 1;

        public aTx() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
            a = i3 % 128;
            int i4 = i3 % 2;
            P.this.f();
            int i5 = a;
            int i6 = ((i5 & (-64)) | ((~i5) & 63)) + ((i5 & 63) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            int i = 2 % 2;
            int i2 = a + 103;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean z = false;
            if (P.this.k(obj) >= 0) {
                int i4 = b;
                int i5 = (i4 & 63) + (i4 | 63);
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
            } else {
                int i6 = a;
                int i7 = ((i6 ^ 61) | (i6 & 61)) << 1;
                int i8 = -(((~i6) & 61) | (i6 & (-62)));
                int i9 = (i7 & i8) + (i8 | i7);
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = a;
            int i12 = i11 & 11;
            int i13 = (((i11 ^ 11) | i12) << 1) - ((i11 | 11) & (~i12));
            b = i13 % 128;
            int i14 = i13 % 2;
            return z;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            boolean z;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-48)) | ((~i2) & 47)) + ((i2 & 47) << 1);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                P.this.h();
                collection.iterator();
                throw null;
            }
            Map<K, V> mapH = P.this.h();
            Iterator<?> it = collection.iterator();
            int i4 = a;
            int i5 = (i4 & 30) + (i4 | 30);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            while (true) {
                if (!it.hasNext()) {
                    int i8 = b;
                    int i9 = ((i8 ^ 26) + ((i8 & 26) << 1)) - 1;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    z = true;
                    break;
                }
                int i11 = a;
                int i12 = (i11 ^ 33) + ((i11 & 33) << 1);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    mapH.containsKey(it.next());
                    throw null;
                }
                if (!mapH.containsKey(it.next())) {
                    int i13 = a;
                    int i14 = ((i13 | 89) << 1) - (i13 ^ 89);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    z = false;
                    break;
                }
            }
            int i16 = b;
            int i17 = ((i16 ^ 41) - (~((i16 & 41) << 1))) - 1;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
            a = i3 % 128;
            if (i3 % 2 != 0) {
                P.c(this, obj);
                throw null;
            }
            boolean zC = P.c(this, obj);
            int i4 = a;
            int i5 = i4 & 9;
            int i6 = -(-((i4 ^ 9) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            return zC;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i;
            int i2;
            int iHashCode;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (i4 & 35) + (i4 | 35);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                i = P.this.i();
                i2 = 1;
            } else {
                i = (-2) - (P.this.i() ^ (-1));
                i2 = 0;
            }
            int i6 = a;
            int i7 = (i6 & (-102)) | ((~i6) & 101);
            int i8 = -(-((i6 & 101) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            int i10 = i9 % 128;
            b = i10;
            int i11 = i9 % 2;
            int i12 = (i10 & (-14)) | ((~i10) & 13);
            int i13 = -(-((i10 & 13) << 1));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            while (i >= 0) {
                int i16 = a;
                int i17 = i16 & 97;
                int i18 = (i16 ^ 97) | i17;
                int i19 = (i17 & i18) + (i18 | i17);
                b = i19 % 128;
                int i20 = i19 % 2;
                Object objG = P.this.g(i, 0);
                if (objG == null) {
                    int i21 = b + 75;
                    a = i21 % 128;
                    iHashCode = i21 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = objG.hashCode();
                    int i22 = b;
                    int i23 = (-2) - (((i22 & 32) + (i22 | 32)) ^ (-1));
                    a = i23 % 128;
                    int i24 = i23 % 2;
                }
                int i25 = -(-iHashCode);
                int i26 = i2 & i25;
                i2 = ((((i2 ^ i25) | i26) << 1) - (~(-((i2 | i25) & (~i26))))) - 1;
                i = (i & (-56)) + (i | (-56)) + 55;
                int i27 = b + 76;
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                a = i28 % 128;
                int i29 = i28 % 2;
            }
            int i30 = a;
            int i31 = i30 & 61;
            int i32 = -(-((i30 ^ 61) | i31));
            int i33 = (i31 & i32) + (i32 | i31);
            b = i33 % 128;
            if (i33 % 2 == 0) {
                int i34 = 88 / 0;
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 51) << 1) - (~(-(((~i2) & 51) | (i2 & (-52)))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (P.this.i() == 0) {
                int i5 = b;
                int i6 = i5 & 39;
                int i7 = ((~i6) & (i5 | 39)) + (i6 << 1);
                a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = (i5 & 112) + (i5 | 112);
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                int i12 = b + 99;
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 / 2;
                }
                z = false;
            }
            int i14 = b;
            int i15 = i14 & 1;
            int i16 = (i14 | 1) & (~i15);
            int i17 = i15 << 1;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            return z;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            int i = 2 % 2;
            aTv atv = new aTv(0);
            int i2 = b + 32;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return atv;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int i = 2 % 2;
            int i2 = b + 87;
            a = i2 % 128;
            int i3 = i2 % 2;
            int iK = P.this.k(obj);
            if (iK < 0) {
                int i4 = b;
                int i5 = (i4 ^ 78) + ((i4 & 78) << 1);
                int i6 = (i5 ^ (-1)) + (i5 << 1);
                a = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = b;
            int i8 = i7 & 7;
            int i9 = ((i7 ^ 7) | i8) << 1;
            int i10 = -((i7 | 7) & (~i8));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            int i12 = i11 % 2;
            P.this.m(iK);
            int i13 = b;
            int i14 = (i13 ^ 45) + ((i13 & 45) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            boolean zD;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 95;
            int i4 = (i3 - (~((i2 ^ 95) | i3))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            Map<K, V> mapH = P.this.h();
            if (i5 == 0) {
                zD = P.d(mapH, collection);
                int i6 = 19 / 0;
            } else {
                zD = P.d(mapH, collection);
            }
            int i7 = b;
            int i8 = i7 ^ 21;
            int i9 = -(-((i7 & 21) << 1));
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            return zD;
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 59) | (i2 & 59)) << 1;
            int i4 = -(((~i2) & 59) | (i2 & (-60)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = P.this.i();
            int i8 = b + 25;
            a = i8 % 128;
            int i9 = i8 % 2;
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & (-26)) | ((~i2) & 25);
            int i4 = -(-((i2 & 25) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            Object[] objArrN = i5 % 2 == 0 ? P.this.n(1) : P.this.n(0);
            int i6 = a;
            int i7 = (i6 | 97) << 1;
            int i8 = -(((~i6) & 97) | (i6 & (-98)));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return objArrN;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 & (-8)) | ((~i2) & 7)) - (~(-(-((i2 & 7) << 1))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            T[] tArr2 = (T[]) P.this.o(tArr, 0);
            int i5 = a;
            int i6 = (i5 & (-32)) | ((~i5) & 31);
            int i7 = (i5 & 31) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                return tArr2;
            }
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapH;
            int size;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 95) | (i2 & 95)) << 1;
            int i4 = -(((~i2) & 95) | (i2 & (-96)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            boolean z = false;
            if (i5 % 2 == 0) {
                mapH = P.this.h();
                size = mapH.size();
                int i6 = 74 / 0;
            } else {
                mapH = P.this.h();
                size = mapH.size();
            }
            int i7 = a;
            int i8 = ((i7 | 117) << 1) - (i7 ^ 117);
            b = i8 % 128;
            Object obj = null;
            if (i8 % 2 == 0) {
                collection.iterator();
                obj.hashCode();
                throw null;
            }
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                int i9 = b;
                int i10 = (i9 & 47) + (i9 | 47);
                a = i10 % 128;
                if (i10 % 2 != 0) {
                    mapH.remove(it.next());
                    throw null;
                }
                mapH.remove(it.next());
                int i11 = a;
                int i12 = (((i11 ^ 33) | (i11 & 33)) << 1) - (((~i11) & 33) | (i11 & (-34)));
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 5;
                }
            }
            if (size != mapH.size()) {
                int i14 = b;
                int i15 = i14 ^ 71;
                int i16 = ((i14 & 71) | i15) << 1;
                int i17 = -i15;
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
                int i20 = (i14 & (-118)) | ((~i14) & 117);
                int i21 = -(-((i14 & 117) << 1));
                int i22 = (i20 & i21) + (i21 | i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                z = true;
            } else {
                int i24 = a;
                int i25 = (((i24 & (-122)) | ((~i24) & 121)) - (~((i24 & 121) << 1))) - 1;
                b = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = a;
            int i28 = ((i27 & 122) + (i27 | 122)) - 1;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final class aTz implements Collection<V> {
        private static int a = 1;
        private static int b;

        public aTz() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            int i = 2 % 2;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 75) - (~(i2 | 75))) - 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                P.this.f();
            } else {
                P.this.f();
                int i4 = 87 / 0;
            }
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            boolean z = true;
            int i3 = ((i2 ^ 91) | (i2 & 91)) << 1;
            int i4 = -(((~i2) & 91) | (i2 & (-92)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            if (P.this.j(obj) >= 0) {
                int i7 = b;
                int i8 = i7 & 99;
                int i9 = (i8 - (~(-(-((i7 ^ 99) | i8))))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                int i11 = (i7 & 45) + (i7 | 45);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = a;
                int i14 = i13 & 75;
                int i15 = i13 | 75;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                b = i16 % 128;
                int i17 = i16 % 2;
                z = false;
            }
            int i18 = a;
            int i19 = (i18 & 59) + (i18 | 59);
            b = i19 % 128;
            int i20 = i19 % 2;
            return z;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-26)) | ((~i2) & 25)) + ((i2 & 25) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                collection.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                int i4 = a;
                int i5 = (-2) - (((i4 & 16) + (i4 | 16)) ^ (-1));
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 71 / 0;
                    if (!contains(it.next())) {
                        int i7 = b;
                        int i8 = i7 & 19;
                        int i9 = i8 + ((i7 ^ 19) | i8);
                        int i10 = i9 % 128;
                        a = i10;
                        int i11 = i9 % 2;
                        int i12 = i10 + 83;
                        b = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }
                } else if (!contains(it.next())) {
                    int i14 = b;
                    int i15 = i14 & 19;
                    int i16 = i15 + ((i14 ^ 19) | i15);
                    int i17 = i16 % 128;
                    a = i17;
                    int i18 = i16 % 2;
                    int i19 = i17 + 83;
                    b = i19 % 128;
                    int i110 = i19 % 2;
                    return false;
                }
            }
            int i20 = a + 107;
            b = i20 % 128;
            int i21 = i20 % 2;
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 17) - (~(i2 | 17))) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                P.this.i();
                throw null;
            }
            if (P.this.i() == 0) {
                int i4 = a;
                int i5 = (((i4 ^ 121) | (i4 & 121)) << 1) - (((~i4) & 121) | (i4 & (-122)));
                int i6 = i5 % 128;
                b = i6;
                int i7 = i5 % 2;
                int i8 = ((i6 | 9) << 1) - (i6 ^ 9);
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 / 4;
                }
                z = true;
            } else {
                int i10 = b;
                int i11 = i10 & 23;
                int i12 = -(-((i10 ^ 23) | i11));
                int i13 = (i11 & i12) + (i12 | i11);
                a = i13 % 128;
                int i14 = i13 % 2;
                z = false;
            }
            int i15 = b;
            int i16 = ((i15 ^ 13) | (i15 & 13)) << 1;
            int i17 = -(((~i15) & 13) | (i15 & (-14)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            return z;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            int i = 2 % 2;
            aTv atv = new aTv(1);
            int i2 = b;
            int i3 = i2 ^ 51;
            int i4 = ((((i2 & 51) | i3) << 1) - (~(-i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            return atv;
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 111;
            int i4 = i3 + ((i2 ^ 111) | i3);
            a = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0) {
                P.this.j(obj);
                obj2.hashCode();
                throw null;
            }
            int iJ = P.this.j(obj);
            if (iJ >= 0) {
                P.this.m(iJ);
                int i5 = b;
                int i6 = (i5 ^ 99) + ((i5 & 99) << 1);
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i7 = a;
            int i8 = i7 & 57;
            int i9 = (i7 ^ 57) | i8;
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        @Override // java.util.Collection
        public final int size() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 83) + (i2 | 83);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                P.this.i();
                throw null;
            }
            int i4 = P.this.i();
            int i5 = b;
            int i6 = ((i5 ^ 33) | (i5 & 33)) << 1;
            int i7 = -(((~i5) & 33) | (i5 & (-34)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            return i4;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            int i = 2 % 2;
            int i2 = b + 117;
            a = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArrN = P.this.n(1);
            int i4 = a;
            int i5 = ((((i4 ^ 103) | (i4 & 103)) << 1) - (~(-(((~i4) & 103) | (i4 & (-104)))))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return objArrN;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int i = 2 % 2;
            int i2 = a + 73;
            b = i2 % 128;
            int i3 = i2 % 2;
            T[] tArr2 = (T[]) P.this.o(tArr, 1);
            int i4 = b;
            int i5 = (i4 & 53) + (i4 | 53);
            a = i5 % 128;
            int i6 = i5 % 2;
            return tArr2;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i;
            boolean z;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (-2) - (((i3 ^ 36) + ((i3 & 36) << 1)) ^ (-1));
            b = i4 % 128;
            int i5 = 0;
            if (i4 % 2 != 0) {
                i = P.this.i();
                z = true;
            } else {
                i = P.this.i();
                z = false;
            }
            while (i5 < i) {
                int i6 = b + 25;
                a = i6 % 128;
                int i7 = i6 % 2;
                Object objG = P.this.g(i5, 1);
                int i8 = a;
                int i9 = ((i8 | 58) << 1) - (i8 ^ 58);
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    collection.contains(objG);
                    throw null;
                }
                if (collection.contains(objG)) {
                    P.this.m(i5);
                    i5--;
                    int i11 = a;
                    int i12 = i11 ^ 81;
                    int i13 = (((i11 & 81) | i12) << 1) - i12;
                    b = i13 % 128;
                    i = i13 % 2 != 0 ? i >> 1 : i - 1;
                    z = true;
                }
                int i14 = i5 & 1;
                i5 = (i14 - (~((i5 ^ 1) | i14))) - 1;
                int i15 = a;
                int i16 = i15 & 41;
                int i17 = (i15 ^ 41) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                b = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = a;
            int i21 = ((i20 | 61) << 1) - (i20 ^ 61);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                return z;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = i4 ^ 99;
            int i6 = (((i4 & 99) | i5) << 1) - i5;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                i = P.this.i();
                i2 = 1;
            } else {
                i = P.this.i();
                i2 = 0;
            }
            boolean z = i2;
            int i7 = b + 109;
            a = i7 % 128;
            int i8 = i7 % 2;
            while (i2 < i) {
                int i9 = a;
                int i10 = (((i9 | 22) << 1) - (i9 ^ 22)) - 1;
                b = i10 % 128;
                int i11 = i10 % 2;
                Object objG = P.this.g(i2, 1);
                int i12 = a;
                int i13 = (i12 & (-44)) | ((~i12) & 43);
                int i14 = (i12 & 43) << 1;
                int i15 = (i13 & i14) + (i14 | i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                if (!collection.contains(objG)) {
                    int i17 = b;
                    int i18 = (i17 & 89) + (i17 | 89);
                    a = i18 % 128;
                    int i19 = i18 % 2;
                    P.this.m(i2);
                    if (i19 == 0) {
                        z = z;
                        i2 %= 1;
                    } else {
                        z = z;
                        i2 = ((~i2) - (~(i2 << 1))) - 1;
                    }
                    int i20 = b;
                    int i21 = i20 & 111;
                    int i22 = -(-((i20 ^ 111) | i21));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    a = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i24 = ~i;
                        int i25 = -(-(i << 1));
                        i = ((i25 & i24) << 1) + (i24 ^ i25);
                    }
                    z = 1;
                }
                z = z;
                i2 = ((i2 | 1) << 1) - (((~i2) & 1) | (i2 & (-2)));
                int i26 = b;
                int i27 = ((i26 ^ 125) - (~(-(-((i26 & 125) << 1))))) - 1;
                a = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 4 / 2;
                }
            }
            int i29 = a;
            int i30 = ((i29 | 114) << 1) - (i29 ^ 114);
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public abstract V e(int i, V v);

    public abstract void f();

    public abstract Object g(int i, int i2);

    public abstract Map<K, V> h();

    public abstract int i();

    public abstract int j(Object obj);

    public abstract int k(Object obj);

    public abstract void l(K k, V v);

    public abstract void m(int i);

    public final class aTy implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        private static int a = 1;
        private static int b;
        public int c;
        public int d;
        public boolean e = false;

        public aTy() {
            int i = P.this.i();
            int i2 = ((i ^ (-1)) | i) << 1;
            int i3 = -(~i);
            this.c = ((i2 | i3) << 1) - (i3 ^ i2);
            this.d = -1;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 91) + ((i2 & 91) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (!this.e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i5 = i2 & 97;
            int i6 = (i2 | 97) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            K k = i8 % 2 == 0 ? (K) P.this.g(this.d, 1) : (K) P.this.g(this.d, 0);
            int i9 = a;
            int i10 = i9 & 33;
            int i11 = (i9 ^ 33) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            return k;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 120) + (i2 | 120)) - 1;
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            if (this.d < this.c) {
                int i6 = i4 & 53;
                int i7 = (i6 - (~(-(-((i4 ^ 53) | i6))))) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                int i9 = (i2 | 119) << 1;
                int i10 = -(i2 ^ 119);
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                z = false;
            }
            int i13 = a + 74;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            int i2 = a;
            int i3 = i2 & 123;
            int i4 = (i2 ^ 123) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                sb.append("=");
                sb.append(getValue());
                throw null;
            }
            sb.append("=");
            sb.append(getValue());
            String string = sb.toString();
            int i6 = a;
            int i7 = i6 & 7;
            int i8 = ((i6 ^ 7) | i7) << 1;
            int i9 = -((i6 | 7) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 59 / 0;
            }
            return string;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 115) | (i2 & 115)) << 1) - (((~i2) & 115) | (i2 & (-116)));
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (!this.e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            V v = (V) P.this.g(this.d, 1);
            int i4 = a;
            int i5 = i4 & 7;
            int i6 = ((i4 ^ 7) | i5) << 1;
            int i7 = -((i4 | 7) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return v;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = 2 % 2;
            int i2 = b + 57;
            a = i2 % 128;
            int i3 = i2 % 2;
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i4 = b;
            int i5 = i4 & 29;
            int i6 = (((i4 ^ 29) | i5) << 1) - ((i4 | 29) & (~i5));
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            int i9 = this.d;
            this.d = (((i9 & (-2)) | ((~i9) & 1)) - (~((i9 & 1) << 1))) - 1;
            this.e = true;
            int i10 = i7 & 125;
            int i11 = (i10 - (~(-(-((i7 ^ 125) | i10))))) - 1;
            int i12 = i11 % 128;
            b = i12;
            if (i11 % 2 != 0) {
                int i13 = 39 / 0;
            }
            int i14 = (i12 & (-40)) | ((~i12) & 39);
            int i15 = -(-((i12 & 39) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            if (!this.e) {
                throw new IllegalStateException();
            }
            int i6 = (i4 ^ 123) + ((i4 & 123) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            P.this.m(this.d);
            int i8 = this.d;
            int i9 = b;
            int i10 = i9 & 77;
            int i11 = (~i10) & (i9 | 77);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                this.d = i8 >> 1;
                this.c <<= 1;
            } else {
                this.d = i8 - 1;
                int i14 = this.c;
                int i15 = ((i14 ^ (-1)) | i14) << 1;
                int i16 = -(~i14);
                this.c = (i15 & i16) + (i16 | i15);
            }
            this.e = false;
            int i17 = i9 + 71;
            a = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 98 / 0;
            }
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 45) | (i2 & 45)) << 1;
            int i4 = -(((~i2) & 45) | (i2 & (-46)));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!this.e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i7 = i6 & 49;
            int i8 = -(-((i6 ^ 49) | i7));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            V v2 = (V) P.this.e(this.d, v);
            int i11 = b;
            int i12 = i11 & 111;
            int i13 = (i12 - (~((i11 ^ 111) | i12))) - 1;
            a = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 97 / 0;
            }
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 73;
            int i4 = -(-(i2 | 73));
            int i5 = (i3 & i4) + (i3 | i4);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (!this.e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            boolean z = false;
            if (!(obj instanceof Map.Entry)) {
                int i6 = i2 + 65;
                a = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            P p = P.this;
            int i8 = b;
            int i9 = i8 & 115;
            int i10 = -(-((i8 ^ 115) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0 ? !(!h.h(key, p.g(this.d, 0))) : h.h(key, p.g(this.d, 0))) {
                int i12 = a;
                int i13 = ((i12 ^ 5) | (i12 & 5)) << 1;
                int i14 = -(((~i12) & 5) | (i12 & (-6)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                b = i15 % 128;
                int i16 = i15 % 2;
                Object value = entry.getValue();
                P p2 = P.this;
                int i17 = a;
                int i18 = (((i17 & (-48)) | ((~i17) & 47)) - (~(-(-((i17 & 47) << 1))))) - 1;
                b = i18 % 128;
                if (i18 % 2 == 0 ? h.h(value, p2.g(this.d, 1)) : h.h(value, p2.g(this.d, 0))) {
                    int i19 = a;
                    int i20 = i19 & 97;
                    int i21 = -(-(i19 | 97));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    b = i22 % 128;
                    if (i22 % 2 == 0) {
                        z = true;
                    }
                }
            }
            int i23 = a;
            int i24 = i23 & 35;
            int i25 = (i23 | 35) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            b = i27 % 128;
            int i28 = i27 % 2;
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0061  */
        /* JADX WARN: Code duplicated, block: B:14:0x0074  */
        /* JADX WARN: Code duplicated, block: B:15:0x0076  */
        /* JADX WARN: Code duplicated, block: B:16:0x0078  */
        @Override // java.util.Map.Entry
        public final int hashCode() {
            int i;
            int iHashCode;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (-2) - (((i3 & 94) + (i3 | 94)) ^ (-1));
            int i5 = i4 % 128;
            b = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!this.e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i6 = i5 + 111;
            a = i6 % 128;
            int i7 = i6 % 2;
            P p = P.this;
            int i8 = this.d;
            int i9 = (((i5 ^ 35) | (i5 & 35)) << 1) - (((~i5) & 35) | (i5 & (-36)));
            a = i9 % 128;
            int i10 = i9 % 2;
            int iHashCode2 = 0;
            Object objG = p.g(i8, 0);
            Object objG2 = P.this.g(this.d, 1);
            int i11 = b;
            int i12 = (((i11 & (-2)) | ((~i11) & 1)) - (~((i11 & 1) << 1))) - 1;
            int i13 = i12 % 128;
            a = i13;
            if (i12 % 2 == 0) {
                int i14 = 57 / 0;
                if (objG == null) {
                    int i15 = i13 | 55;
                    i = ((i15 << 1) - (~(-(i15 & (~(i13 & 55)))))) - 1;
                    b = i % 128;
                    if (i % 2 != 0) {
                        iHashCode = 1;
                    } else {
                        iHashCode = 0;
                    }
                } else {
                    iHashCode = objG.hashCode();
                    int i16 = a;
                    int i17 = (((i16 | 40) << 1) - (i16 ^ 40)) - 1;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                }
            } else if (objG == null) {
                int i19 = i13 | 55;
                i = ((i19 << 1) - (~(-(i19 & (~(i13 & 55)))))) - 1;
                b = i % 128;
                if (i % 2 != 0) {
                    iHashCode = 1;
                } else {
                    iHashCode = 0;
                }
            } else {
                iHashCode = objG.hashCode();
                int i110 = a;
                int i111 = (((i110 | 40) << 1) - (i110 ^ 40)) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
            }
            if (objG2 != null) {
                int i20 = a;
                int i21 = ((i20 & 76) + (i20 | 76)) - 1;
                b = i21 % 128;
                if (i21 % 2 != 0) {
                    objG2.hashCode();
                    throw null;
                }
                iHashCode2 = objG2.hashCode();
                int i22 = a + 91;
                b = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 4 / 5;
                }
            }
            int i24 = (iHashCode | iHashCode2) & (~(iHashCode & iHashCode2));
            int i25 = b;
            int i26 = (i25 & (-28)) | ((~i25) & 27);
            int i27 = (i25 & 27) << 1;
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            a = i28 % 128;
            if (i28 % 2 != 0) {
                return i24;
            }
            throw null;
        }
    }

    public Object[] n(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (i5 ^ 63) + ((i5 & 63) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i();
        Object[] objArr = new Object[i8];
        int i9 = a;
        int i10 = ((i9 & 64) + (i9 | 64)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < i8) {
            int i13 = b;
            int i14 = (((i13 ^ 103) | (i13 & 103)) << 1) - (((~i13) & 103) | (i13 & (-104)));
            a = i14 % 128;
            int i15 = i14 % 2;
            Object objG = g(i12, i);
            if (i15 != 0) {
                objArr[i12] = objG;
                int i16 = i12 + 120;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                i2 = i17 & (-90);
                i3 = -(-(i17 | (-90)));
            } else {
                objArr[i12] = objG;
                int i18 = i12 & 1;
                i2 = (i12 | 1) & (~i18);
                i3 = i18 << 1;
            }
            i12 = (i2 - (~i3)) - 1;
        }
        int i19 = b;
        int i20 = i19 ^ 37;
        int i21 = (i19 & 37) << 1;
        int i22 = (i20 & i21) + (i21 | i20);
        a = i22 % 128;
        if (i22 % 2 == 0) {
            return objArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: ClassCastException | NullPointerException -> 0x008b, ClassCastException | NullPointerException -> 0x008b, PHI: r7
  0x0058: PHI (r7v6 java.util.Set) = (r7v5 java.util.Set), (r7v13 java.util.Set) binds: [B:20:0x0056, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {ClassCastException | NullPointerException -> 0x008b, blocks: (B:11:0x003c, B:13:0x0046, B:13:0x0046, B:21:0x0058, B:21:0x0058, B:19:0x004e, B:19:0x004e), top: B:32:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    public static <T> boolean c(Set<T> set, Object obj) {
        Set set2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (set == obj) {
            int i5 = i2 + 35;
            a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 104;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        boolean z = false;
        if (!(!(obj instanceof Set))) {
            int i10 = ((i2 | 75) << 1) - (i2 ^ 75);
            a = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    set2 = (Set) obj;
                    if (set.size() == set2.size()) {
                        if (!set.containsAll(set2)) {
                            z = true;
                        }
                    }
                    int i11 = a;
                    int i12 = (((i11 & (-4)) | ((~i11) & 3)) - (~(-(-((i11 & 3) << 1))))) - 1;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    return z;
                }
                set2 = (Set) obj;
                int i14 = 30 / 0;
                if (set.size() == set2.size()) {
                    if (!set.containsAll(set2)) {
                        z = true;
                    }
                }
                int i15 = a;
                int i16 = (((i15 & (-4)) | ((~i15) & 3)) - (~(-(-((i15 & 3) << 1))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                return z;
                int i18 = b;
                int i19 = i18 & 109;
                int i20 = -(-((i18 ^ 109) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i21 % 128;
                int i22 = i21 % 2;
                int i110 = a;
                int i111 = (((i110 & (-4)) | ((~i110) & 3)) - (~(-(-((i110 & 3) << 1))))) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        int i23 = a;
        int i24 = ((i23 & 48) + (i23 | 48)) - 1;
        b = i24 % 128;
        int i25 = i24 % 2;
        return false;
    }

    public static <K, V> boolean d(Map<K, V> map, Collection<?> collection) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = -(-((i2 ^ 17) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int size = map.size();
        Set<K> setKeySet = map.keySet();
        int i7 = b;
        int i8 = i7 & 19;
        int i9 = -(-(i7 | 19));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            setKeySet.iterator();
            throw null;
        }
        Iterator<K> it = setKeySet.iterator();
        while (!(!it.hasNext())) {
            int i11 = a;
            int i12 = i11 & 43;
            int i13 = -(-(i11 | 43));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            if (i14 % 2 == 0) {
                collection.contains(it.next());
                obj.hashCode();
                throw null;
            }
            if (!collection.contains(it.next())) {
                it.remove();
                int i15 = b;
                int i16 = i15 ^ 99;
                int i17 = -(-((i15 & 99) << 1));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        if (size != map.size()) {
            int i20 = a;
            int i21 = ((i20 | 47) << 1) - (i20 ^ 47);
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 & 125;
            int i24 = ((i20 ^ 125) | i23) << 1;
            int i25 = -((i20 | 125) & (~i23));
            int i26 = (i24 & i25) + (i25 | i24);
            b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 5 % 3;
            }
            z = true;
        } else {
            int i28 = b;
            int i29 = i28 & 89;
            int i30 = (((i28 ^ 89) | i29) << 1) - ((i28 | 89) & (~i29));
            a = i30 % 128;
            int i31 = i30 % 2;
            z = false;
        }
        int i32 = a;
        int i33 = i32 | 55;
        int i34 = i33 << 1;
        int i35 = -((~(i32 & 55)) & i33);
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        b = i36 % 128;
        int i37 = i36 % 2;
        return z;
    }

    public <T> T[] o(T[] tArr, int i) {
        int i2;
        Object[] objArr;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 ^ 61) + ((i4 & 61) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i();
        int length = tArr.length;
        int i8 = 0;
        Object obj = null;
        Object[] objArr2 = tArr;
        if (length < i7) {
            int i9 = a;
            int i10 = i9 & 111;
            int i11 = (((i9 ^ 111) | i10) << 1) - ((i9 | 111) & (~i10));
            b = i11 % 128;
            int i12 = i11 % 2;
            Class<?> componentType = tArr.getClass().getComponentType();
            if (i12 == 0) {
                int i13 = 46 / 0;
                objArr = (T[]) ((Object[]) Array.newInstance(componentType, i7));
            } else {
                objArr = (Object[]) Array.newInstance(componentType, i7);
            }
            int i14 = b;
            int i15 = (i14 & 79) + (i14 | 79);
            int i16 = i15 % 128;
            a = i16;
            if (i15 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i17 = ((i16 & (-100)) | ((~i16) & 99)) + ((i16 & 99) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            objArr2 = objArr;
        }
        int i19 = b;
        int i20 = ((i19 & 124) + (i19 | 124)) - 1;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 5 % 3;
        }
        while (i8 < i7) {
            int i22 = a;
            int i23 = (i22 & 91) + (i22 | 91);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                objArr2[i8] = g(i8, i);
                int i24 = ((i8 ^ 126) | (i8 & 126)) << 1;
                int i25 = -(((~i8) & 126) | (i8 & (-127)));
                i2 = (i24 & i25) + (i24 | i25);
            } else {
                objArr2[i8] = g(i8, i);
                int i26 = ((i8 ^ 1) | (i8 & 1)) << 1;
                int i27 = -(((~i8) & 1) | (i8 & (-2)));
                i2 = ((i26 | i27) << 1) - (i26 ^ i27);
            }
            i8 = i2;
            int i28 = a;
            int i29 = i28 ^ 47;
            int i30 = ((((i28 & 47) | i29) << 1) - (~(-i29))) - 1;
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        if (objArr2.length > i7) {
            int i32 = b;
            int i33 = i32 & 89;
            int i34 = (i32 | 89) & (~i33);
            int i35 = -(-(i33 << 1));
            int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
            a = i36 % 128;
            if (i36 % 2 != 0) {
                objArr2[i7] = null;
                obj.hashCode();
                throw null;
            }
            objArr2[i7] = null;
        }
        int i37 = b;
        int i38 = (i37 | 67) << 1;
        int i39 = -(((~i37) & 67) | (i37 & (-68)));
        int i40 = (i38 & i39) + (i39 | i38);
        a = i40 % 128;
        int i41 = i40 % 2;
        return (T[]) objArr2;
    }
}
