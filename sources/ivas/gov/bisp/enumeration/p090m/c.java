package ivas.gov.bisp.enumeration.p090m;

import ivas.gov.bisp.enumeration.OooOOOO.OooO0O0;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c<K, V> implements Iterable<Map.Entry<K, V>> {
    private static int a = 1;
    private static int b;
    public OooO0O0.OooO0OO<K, V> c;
    public OooO0O0.OooO0OO<K, V> d;
    public WeakHashMap<OooO0O0.OooOO0<K, V>, Boolean> e = new WeakHashMap<>();
    public int f = 0;

    public interface aTf<K, V> {
        void b(OooO0O0.OooO0OO<K, V> oooO0OO);
    }

    public static class aTh<K, V> extends OooO0O0.OooO<K, V> {
        private static int a = 0;
        private static int b = 1;

        public aTh(OooO0O0.OooO0OO<K, V> oooO0OO, OooO0O0.OooO0OO<K, V> oooO0OO2) {
            super(oooO0OO, oooO0OO2);
        }

        public OooO0O0.OooO0OO<K, V> d(OooO0O0.OooO0OO<K, V> oooO0OO) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-60)) | ((~i2) & 59)) + ((i2 & 59) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO0OO.f;
            if (i4 != 0) {
                return oooO0OO2;
            }
            throw null;
        }

        public OooO0O0.OooO0OO<K, V> e(OooO0O0.OooO0OO<K, V> oooO0OO) {
            int i = 2 % 2;
            int i2 = a + 3;
            b = i2 % 128;
            int i3 = i2 % 2;
            OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO0OO.e;
            int i4 = b;
            int i5 = i4 & 59;
            int i6 = (i4 ^ 59) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                return oooO0OO2;
            }
            throw null;
        }
    }

    public static class aTi<K, V> extends OooO0O0.OooO<K, V> {
        private static int a = 0;
        private static int b = 1;

        public aTi(OooO0O0.OooO0OO<K, V> oooO0OO, OooO0O0.OooO0OO<K, V> oooO0OO2) {
            super(oooO0OO, oooO0OO2);
        }

        public OooO0O0.OooO0OO<K, V> d(OooO0O0.OooO0OO<K, V> oooO0OO) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 43;
            int i4 = ((i2 & 43) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO0OO.e;
            if (i7 == 0) {
                return oooO0OO2;
            }
            throw null;
        }

        public OooO0O0.OooO0OO<K, V> e(OooO0O0.OooO0OO<K, V> oooO0OO) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 73;
            int i4 = ((i2 & 73) | i3) << 1;
            int i5 = -i3;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO0OO.f;
                throw null;
            }
            OooO0O0.OooO0OO<K, V> oooO0OO3 = oooO0OO.f;
            int i7 = a;
            int i8 = i7 & 105;
            int i9 = -(-((i7 ^ 105) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return oooO0OO3;
            }
            obj.hashCode();
            throw null;
        }
    }

    public class aTk implements Iterator<Map.Entry<K, V>>, OooO0O0.OooOO0<K, V> {
        private static int a = 0;
        private static int b = 1;
        public OooO0O0.OooO0OO<K, V> c;
        public boolean d = true;

        public aTk() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0031  */
        /* JADX WARN: Code duplicated, block: B:14:0x004a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0062  */
        /* JADX WARN: Code duplicated, block: B:22:0x0067  */
        /* JADX WARN: Code duplicated, block: B:24:0x0078  */
        /* JADX WARN: Code duplicated, block: B:26:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x008f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z;
            OooO0O0.OooO0OO<K, V> oooO0OO;
            int i;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = b;
            int i6 = ((i5 & 50) + (i5 | 50)) - 1;
            int i7 = i6 % 128;
            a = i7;
            boolean z2 = false;
            Object obj = null;
            if (i6 % 2 != 0) {
                if (this.d) {
                    z = false;
                    int i8 = ((i7 & 24) + (i7 | 24)) - 1;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    if (c.this.c == null) {
                        int i10 = b;
                        int i11 = (i10 & (-14)) | ((~i10) & 13);
                        int i12 = -(-((i10 & 13) << 1));
                        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                        a = i13 % 128;
                        z = i13 % 2 != 0;
                    }
                    int i14 = b;
                    int i15 = i14 ^ 71;
                    int i16 = ((i14 & 71) | i15) << 1;
                    int i17 = -i15;
                    i3 = (i16 ^ i17) + ((i16 & i17) << 1);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        return z;
                    }
                    throw null;
                }
                oooO0OO = this.c;
                if (oooO0OO != null) {
                    int i18 = i5 & 87;
                    int i19 = (i5 ^ 87) | i18;
                    i2 = (i18 ^ i19) + ((i19 & i18) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO0OO.e;
                        obj.hashCode();
                        throw null;
                    }
                    if (oooO0OO.e != null) {
                        int i20 = a;
                        int i21 = i20 ^ 31;
                        int i22 = (i20 & 31) << 1;
                        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                        z2 = true;
                    } else {
                        int i25 = a + 45;
                        b = i25 % 128;
                        int i26 = i25 % 2;
                    }
                } else {
                    int i27 = a + 45;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
                int i29 = a;
                int i30 = i29 & 13;
                i = (((i29 ^ 13) | i30) << 1) - ((i29 | 13) & (~i30));
                b = i % 128;
                if (i % 2 != 0) {
                    return z2;
                }
                obj.hashCode();
                throw null;
            }
            if (this.d) {
                z = true;
                int i31 = ((i7 & 24) + (i7 | 24)) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
                if (c.this.c == null) {
                    int i110 = b;
                    int i111 = (i110 & (-14)) | ((~i110) & 13);
                    int i112 = -(-((i110 & 13) << 1));
                    int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                    a = i113 % 128;
                    z = i113 % 2 != 0;
                }
                int i114 = b;
                int i115 = i114 ^ 71;
                int i116 = ((i114 & 71) | i115) << 1;
                int i117 = -i115;
                i3 = (i116 ^ i117) + ((i116 & i117) << 1);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    return z;
                }
                throw null;
            }
            oooO0OO = this.c;
            if (oooO0OO != null) {
                int i118 = i5 & 87;
                int i119 = (i5 ^ 87) | i118;
                i2 = (i118 ^ i119) + ((i119 & i118) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    OooO0O0.OooO0OO<K, V> oooO0OO3 = oooO0OO.e;
                    obj.hashCode();
                    throw null;
                }
                if (oooO0OO.e != null) {
                    int i210 = a;
                    int i211 = i210 ^ 31;
                    int i212 = (i210 & 31) << 1;
                    int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                    b = i213 % 128;
                    int i214 = i213 % 2;
                    z2 = true;
                } else {
                    int i215 = a + 45;
                    b = i215 % 128;
                    int i216 = i215 % 2;
                }
            } else {
                int i217 = a + 45;
                b = i217 % 128;
                int i218 = i217 % 2;
            }
            int i219 = a;
            int i33 = i219 & 13;
            i = (((i219 ^ 13) | i33) << 1) - ((i219 | 13) & (~i33));
            b = i % 128;
            if (i % 2 != 0) {
                return z2;
            }
            obj.hashCode();
            throw null;
        }

        public void b(OooO0O0.OooO0OO<K, V> oooO0OO) {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-54)) | ((~i2) & 53);
            int i4 = -(-((i2 & 53) << 1));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            OooO0O0.OooO0OO<K, V> oooO0OO2 = this.c;
            if (oooO0OO == oooO0OO2) {
                int i7 = (i2 & 57) + (i2 | 57);
                a = i7 % 128;
                int i8 = i7 % 2;
                OooO0O0.OooO0OO<K, V> oooO0OO3 = oooO0OO2.f;
                this.c = oooO0OO3;
                if (oooO0OO3 == null) {
                    int i9 = a;
                    int i10 = ((i9 | 57) << 1) - (i9 ^ 57);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    int i12 = b + 79;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    z = false;
                }
                this.d = z;
                int i14 = b;
                int i15 = i14 & 85;
                int i16 = ((i14 ^ 85) | i15) << 1;
                int i17 = -((i14 | 85) & (~i15));
                int i18 = (i16 & i17) + (i17 | i16);
                a = i18 % 128;
                int i19 = i18 % 2;
            }
            int i20 = b;
            int i21 = ((i20 | 81) << 1) - (i20 ^ 81);
            a = i21 % 128;
            if (i21 % 2 != 0) {
                throw null;
            }
        }

        @Override // java.util.Iterator
        public Object next() {
            OooO0O0.OooO0OO<K, V> oooO0OO;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
            int i4 = i3 % 128;
            b = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.d) {
                int i5 = i4 + 51;
                a = i5 % 128;
                int i6 = i5 % 2;
                this.d = false;
                OooO0O0.OooO0OO<K, V> oooO0OO2 = c.this.c;
                int i7 = b;
                int i8 = ((((i7 ^ 43) | (i7 & 43)) << 1) - (~(-(((~i7) & 43) | (i7 & (-44)))))) - 1;
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    this.c = oooO0OO2;
                    obj.hashCode();
                    throw null;
                }
                this.c = oooO0OO2;
            } else {
                OooO0O0.OooO0OO<K, V> oooO0OO3 = this.c;
                if (oooO0OO3 != null) {
                    int i9 = ((i2 | 55) << 1) - (i2 ^ 55);
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        OooO0O0.OooO0OO<K, V> oooO0OO4 = oooO0OO3.e;
                        throw null;
                    }
                    oooO0OO = oooO0OO3.e;
                } else {
                    int i10 = i2 + 57;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    oooO0OO = null;
                }
                this.c = oooO0OO;
                int i12 = b;
                int i13 = i12 & 55;
                int i14 = (i13 - (~((i12 ^ 55) | i13))) - 1;
                a = i14 % 128;
                int i15 = i14 % 2;
            }
            OooO0O0.OooO0OO<K, V> oooO0OO5 = this.c;
            int i16 = b;
            int i17 = (i16 & 53) + (i16 | 53);
            a = i17 % 128;
            if (i17 % 2 == 0) {
                return oooO0OO5;
            }
            obj.hashCode();
            throw null;
        }
    }

    public OooO0O0<K, V>.OooO0o e() {
        int i = 2 % 2;
        OooO0O0.OooOO0<K, V> atk = new aTk();
        WeakHashMap<OooO0O0.OooOO0<K, V>, Boolean> weakHashMap = this.e;
        Boolean bool = Boolean.FALSE;
        int i2 = b;
        int i3 = (i2 & (-108)) | ((~i2) & 107);
        int i4 = -(-((i2 & 107) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        weakHashMap.put(atk, bool);
        int i7 = a;
        int i8 = i7 ^ 35;
        int i9 = ((i7 & 35) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        int i12 = i11 % 2;
        return atk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r6 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r5 = r2.d;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        d(r5, r6);
        r5 = ivas.gov.bisp.enumeration.p090m.c.b;
        r6 = (r5 & (-82)) | ((~r5) & 81);
        r5 = (r5 & 81) << 1;
        r2 = ((r6 | r5) << 1) - (r5 ^ r6);
        ivas.gov.bisp.enumeration.p090m.c.a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        r5 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r5 = ivas.gov.bisp.enumeration.p090m.c.b;
        r6 = ((r5 | 59) << 1) - (r5 ^ 59);
        ivas.gov.bisp.enumeration.p090m.c.a = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V f(K r5, V r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.p090m.c.a
            r2 = r1 & 17
            r1 = r1 | 17
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.p090m.c.b = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 == 0) goto L22
            ivas.gov.bisp.enumeration.m.c$aTj r2 = r4.c(r5)
            r3 = 71
            int r3 = r3 / 0
            if (r2 == 0) goto L41
            goto L28
        L22:
            ivas.gov.bisp.enumeration.m.c$aTj r2 = r4.c(r5)
            if (r2 == 0) goto L41
        L28:
            int r5 = ivas.gov.bisp.enumeration.p090m.c.b
            r6 = r5 | 59
            int r6 = r6 << 1
            r5 = r5 ^ 59
            int r6 = r6 - r5
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.p090m.c.a = r5
            int r6 = r6 % r0
            if (r6 == 0) goto L3b
            V r5 = r2.d
            return r5
        L3b:
            V r5 = r2.d
            r1.hashCode()
            throw r1
        L41:
            r4.d(r5, r6)
            int r5 = ivas.gov.bisp.enumeration.p090m.c.b
            r6 = r5 & (-82)
            int r2 = ~r5
            r3 = 81
            r2 = r2 & r3
            r6 = r6 | r2
            r5 = r5 & r3
            int r5 = r5 << 1
            r2 = r6 | r5
            int r2 = r2 << 1
            r5 = r5 ^ r6
            int r2 = r2 - r5
            int r5 = r2 % 128
            ivas.gov.bisp.enumeration.p090m.c.a = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L61
            r5 = 35
            int r5 = r5 / 0
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p090m.c.f(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = -(-((i2 ^ 25) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            aTg atg = (aTg) it;
            if (!atg.hasNext()) {
                int i7 = b;
                int i8 = ((i7 ^ 53) | (i7 & 53)) << 1;
                int i9 = -(((~i7) & 53) | (i7 & (-54)));
                int i10 = (i8 & i9) + (i9 | i8);
                a = i10 % 128;
                int i11 = i10 % 2;
                return iHashCode;
            }
            int i12 = b;
            int i13 = ((i12 ^ 49) | (i12 & 49)) << 1;
            int i14 = -(((~i12) & 49) | (i12 & (-50)));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                iHashCode %= ((Map.Entry) atg.next()).hashCode();
            } else {
                int iHashCode2 = ((Map.Entry) atg.next()).hashCode();
                int i16 = iHashCode & iHashCode2;
                int i17 = -(-((iHashCode ^ iHashCode2) | i16));
                iHashCode = (i16 & i17) + (i17 | i16);
            }
            int i18 = a;
            int i19 = (i18 ^ 95) + ((i18 & 95) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        int i = 2 % 2;
        OooO0O0.OooOO0<K, V> ath = new aTh<>(this.c, this.d);
        int i2 = a + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.e.put(ath, Boolean.FALSE);
        int i4 = b;
        int i5 = (i4 & 63) + (i4 | 63);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return ath;
    }

    public static abstract class aTg<K, V> implements Iterator<Map.Entry<K, V>>, OooO0O0.OooOO0<K, V> {
        private static int a = 1;
        private static int b;
        public OooO0O0.OooO0OO<K, V> c;
        public OooO0O0.OooO0OO<K, V> d;

        public aTg(OooO0O0.OooO0OO<K, V> oooO0OO, OooO0O0.OooO0OO<K, V> oooO0OO2) {
            this.c = oooO0OO2;
            this.d = oooO0OO;
        }

        public abstract OooO0O0.OooO0OO<K, V> d(OooO0O0.OooO0OO<K, V> oooO0OO);

        public abstract OooO0O0.OooO0OO<K, V> e(OooO0O0.OooO0OO<K, V> oooO0OO);

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 111;
            a = i3 % 128;
            int i4 = i3 % 2;
            boolean z = true;
            if (this.d != null) {
                int i5 = i2 & 7;
                int i6 = -(-(i2 | 7));
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                int i8 = i7 % 128;
                a = i8;
                int i9 = i7 % 2;
                int i10 = i8 & 15;
                int i11 = (i8 ^ 15) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                b = i12 % 128;
                int i13 = i12 % 2;
            } else {
                int i14 = (-2) - ((((i2 | 58) << 1) - (i2 ^ 58)) ^ (-1));
                a = i14 % 128;
                int i15 = i14 % 2;
                z = false;
            }
            int i16 = a;
            int i17 = i16 & 7;
            int i18 = i17 + ((i16 ^ 7) | i17);
            b = i18 % 128;
            int i19 = i18 % 2;
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0039  */
        /* JADX WARN: Code duplicated, block: B:11:0x0057  */
        @Override // java.util.Iterator
        public Object next() {
            OooO0O0.OooO0OO<K, V> oooO0OOE;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 29;
            int i4 = (i2 ^ 29) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            OooO0O0.OooO0OO<K, V> oooO0OO = this.d;
            OooO0O0.OooO0OO<K, V> oooO0OO2 = this.c;
            if (oooO0OO != oooO0OO2) {
                int i8 = (((i6 ^ 37) | (i6 & 37)) << 1) - ((i6 & (-38)) | ((~i6) & 37));
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 40 / 0;
                    if (oooO0OO2 != null) {
                        oooO0OOE = e(oooO0OO);
                        int i10 = b;
                        int i11 = i10 & 25;
                        int i12 = ((i10 ^ 25) | i11) << 1;
                        int i13 = -((i10 | 25) & (~i11));
                        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        int i16 = i6 + 89;
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        oooO0OOE = null;
                    }
                } else if (oooO0OO2 != null) {
                    oooO0OOE = e(oooO0OO);
                    int i18 = b;
                    int i19 = i18 & 25;
                    int i110 = ((i18 ^ 25) | i19) << 1;
                    int i111 = -((i18 | 25) & (~i19));
                    int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                    a = i112 % 128;
                    int i113 = i112 % 2;
                } else {
                    int i114 = i6 + 89;
                    b = i114 % 128;
                    int i115 = i114 % 2;
                    oooO0OOE = null;
                }
            } else {
                int i116 = i6 + 89;
                b = i116 % 128;
                int i117 = i116 % 2;
                oooO0OOE = null;
            }
            this.d = oooO0OOE;
            int i20 = b;
            int i21 = ((i20 ^ 45) | (i20 & 45)) << 1;
            int i22 = -(((~i20) & 45) | (i20 & (-46)));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            return oooO0OO;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0038  */
        /* JADX WARN: Code duplicated, block: B:13:0x0046  */
        /* JADX WARN: Code duplicated, block: B:14:0x0057  */
        /* JADX WARN: Code duplicated, block: B:9:0x001f  */
        public void b(OooO0O0.OooO0OO<K, V> oooO0OO) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (i4 & 91) + (i4 | 91);
            b = i5 % 128;
            OooO0O0.OooO0OO<K, V> oooO0OOE = null;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
                if (this.c == oooO0OO) {
                    int i7 = i4 & 27;
                    int i8 = (~i7) & (i4 | 27);
                    int i9 = -(-(i7 << 1));
                    int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                    b = i10 % 128;
                    int i11 = i10 % 2;
                    if (oooO0OO == this.d) {
                        i = (i4 ^ 103) + ((i4 & 103) << 1);
                        i2 = i % 128;
                        b = i2;
                        if (i % 2 == 0) {
                            this.d = null;
                            this.c = null;
                            throw null;
                        }
                        this.d = null;
                        this.c = null;
                        int i12 = (i2 ^ 101) + ((i2 & 101) << 1);
                        a = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
            } else if (this.c == oooO0OO) {
                int i14 = i4 & 27;
                int i15 = (~i14) & (i4 | 27);
                int i16 = -(-(i14 << 1));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                if (oooO0OO == this.d) {
                    i = (i4 ^ 103) + ((i4 & 103) << 1);
                    i2 = i % 128;
                    b = i2;
                    if (i % 2 == 0) {
                        this.d = null;
                        this.c = null;
                        throw null;
                    }
                    this.d = null;
                    this.c = null;
                    int i19 = (i2 ^ 101) + ((i2 & 101) << 1);
                    a = i19 % 128;
                    int i110 = i19 % 2;
                }
            }
            OooO0O0.OooO0OO<K, V> oooO0OO2 = this.c;
            if (oooO0OO2 == oooO0OO) {
                int i20 = b + 57;
                a = i20 % 128;
                if (i20 % 2 == 0) {
                    this.c = d(oooO0OO2);
                    int i21 = 64 / 0;
                } else {
                    this.c = d(oooO0OO2);
                }
            }
            OooO0O0.OooO0OO<K, V> oooO0OO3 = this.d;
            if (oooO0OO3 == oooO0OO) {
                int i22 = a;
                int i23 = i22 + 35;
                b = i23 % 128;
                if (i23 % 2 != 0) {
                    oooO0OOE.hashCode();
                    throw null;
                }
                OooO0O0.OooO0OO<K, V> oooO0OO4 = this.c;
                if (oooO0OO3 != oooO0OO4) {
                    int i24 = i22 + 67;
                    int i25 = i24 % 128;
                    b = i25;
                    if (i24 % 2 != 0) {
                        throw null;
                    }
                    if (oooO0OO4 == null) {
                        int i26 = i25 + 33;
                        a = i26 % 128;
                        if (i26 % 2 == 0) {
                            oooO0OOE.hashCode();
                            throw null;
                        }
                    } else {
                        oooO0OOE = e(oooO0OO3);
                        int i27 = a + 25;
                        b = i27 % 128;
                        int i28 = i27 % 2;
                    }
                }
                this.d = oooO0OOE;
                int i29 = a + 83;
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 4 / 5;
                }
            }
            int i31 = a;
            int i32 = ((i31 ^ 50) + ((i31 & 50) << 1)) - 1;
            b = i32 % 128;
            int i33 = i32 % 2;
        }
    }

    public static class aTj<K, V> implements Map.Entry<K, V> {
        private static int a = 1;
        private static int b;
        public final K c;
        public final V d;
        public OooO0O0.OooO0OO<K, V> e;
        public OooO0O0.OooO0OO<K, V> f;

        public aTj(K k, V v) {
            this.c = k;
            this.d = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 121;
            b = i3 % 128;
            int i4 = i3 % 2;
            K k = this.c;
            int i5 = (i2 ^ 99) + ((i2 & 99) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 31;
            int i4 = (i3 - (~(-(-((i2 ^ 31) | i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            V v = this.d;
            int i6 = i2 + 113;
            b = i6 % 128;
            if (i6 % 2 == 0) {
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
            int i3 = i2 & 97;
            int i4 = (i2 ^ 97) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode2 = this.c.hashCode();
            if (i6 == 0) {
                iHashCode = iHashCode2 ^ this.d.hashCode();
            } else {
                int iHashCode3 = this.d.hashCode();
                int i7 = (~iHashCode3) & iHashCode2;
                int i8 = (~iHashCode2) & iHashCode3;
                iHashCode = (i8 & i7) | (i7 ^ i8);
            }
            int i9 = a;
            int i10 = ((i9 | 103) << 1) - (i9 ^ 103);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            K k = this.c;
            int i2 = b;
            int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
            a = i3 % 128;
            int i4 = i3 % 2;
            sb.append(k);
            sb.append("=");
            int i5 = a + 11;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                sb.append(this.d);
                return sb.toString();
            }
            sb.append(this.d);
            sb.toString();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:25:0x006d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0093  */
        /* JADX WARN: Code duplicated, block: B:31:0x0097  */
        /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean z;
            int i;
            K k;
            K k2;
            int i2;
            Object obj2;
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 & 21) + (i5 | 21);
            b = i6 % 128;
            boolean z2 = false;
            if (i6 % 2 != 0) {
                if (obj != this) {
                    z = false;
                    if (!(obj instanceof aTj)) {
                        int i7 = ((i5 ^ 63) - (~((i5 & 63) << 1))) - 1;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                    aTj atj = (aTj) obj;
                    k = this.c;
                    k2 = atj.c;
                    i2 = (i5 ^ 77) + ((i5 & 77) << 1);
                    b = i2 % 128;
                    obj2 = null;
                    if (i2 % 2 == 0) {
                        k.equals(k2);
                        throw null;
                    }
                    if (k.equals(k2) || !this.d.equals(atj.d)) {
                        int i9 = b;
                        int i10 = i9 & 93;
                        int i11 = -(-(i9 | 93));
                        int i12 = (i10 & i11) + (i11 | i10);
                        a = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        z2 = z;
                    }
                    int i14 = b;
                    int i15 = i14 & 109;
                    int i16 = -(-((i14 ^ 109) | i15));
                    i3 = (i15 & i16) + (i16 | i15);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        return z2;
                    }
                    obj2.hashCode();
                    throw null;
                }
                int i17 = (i5 & (-80)) | ((~i5) & 79);
                int i18 = -(-((i5 & 79) << 1));
                i = ((i17 | i18) << 1) - (i17 ^ i18);
                b = i % 128;
                if (i % 2 != 0) {
                    return false;
                }
                return true;
            }
            if (obj != this) {
                z = true;
                if (!(obj instanceof aTj)) {
                    int i19 = ((i5 ^ 63) - (~((i5 & 63) << 1))) - 1;
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    return false;
                }
                aTj atj2 = (aTj) obj;
                k = this.c;
                k2 = atj2.c;
                i2 = (i5 ^ 77) + ((i5 & 77) << 1);
                b = i2 % 128;
                obj2 = null;
                if (i2 % 2 == 0) {
                    k.equals(k2);
                    throw null;
                }
                if (k.equals(k2)) {
                    int i21 = b;
                    int i110 = i21 & 93;
                    int i111 = -(-(i21 | 93));
                    int i112 = (i110 & i111) + (i111 | i110);
                    a = i112 % 128;
                    int i113 = i112 % 2;
                } else {
                    int i22 = b;
                    int i114 = i22 & 93;
                    int i115 = -(-(i22 | 93));
                    int i116 = (i114 & i115) + (i115 | i114);
                    a = i116 % 128;
                    int i117 = i116 % 2;
                }
                int i118 = b;
                int i119 = i118 & 109;
                int i120 = -(-((i118 ^ 109) | i119));
                i3 = (i119 & i120) + (i120 | i119);
                a = i3 % 128;
                if (i3 % 2 != 0) {
                    return z2;
                }
                obj2.hashCode();
                throw null;
            }
            int i121 = (i5 & (-80)) | ((~i5) & 79);
            int i122 = -(-((i5 & 79) << 1));
            i = ((i121 | i122) << 1) - (i121 ^ i122);
            b = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            return true;
        }
    }

    public OooO0O0.OooO0OO<K, V> c(K k) {
        Object obj;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 57;
        int i4 = (i2 ^ 57) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        OooO0O0.OooO0OO<K, V> oooO0OO = this.c;
        int i8 = i6 & 21;
        int i9 = (i6 | 21) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        while (true) {
            obj = null;
            if (oooO0OO == null) {
                break;
            }
            int i13 = a;
            int i14 = (i13 ^ 25) + ((i13 & 25) << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                oooO0OO.c.equals(k);
                obj.hashCode();
                throw null;
            }
            if (oooO0OO.c.equals(k)) {
                break;
            }
            int i15 = b;
            int i16 = i15 & 91;
            int i17 = (i16 - (~((i15 ^ 91) | i16))) - 1;
            a = i17 % 128;
            int i18 = i17 % 2;
            oooO0OO = oooO0OO.e;
            int i19 = b;
            int i20 = ((i19 & (-26)) | ((~i19) & 25)) + ((i19 & 25) << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 2 / 4;
            }
        }
        int i22 = b;
        int i23 = i22 & 11;
        int i24 = -(-((i22 ^ 11) | i23));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            return oooO0OO;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        StringBuilder sbW;
        Iterator<Map.Entry<K, V>> it;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = ((i2 ^ 95) | i3) << 1;
        int i5 = -((i2 | 95) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            sbW = j.w("[");
            it = iterator();
            int i7 = 55 / 0;
        } else {
            sbW = j.w("[");
            it = iterator();
        }
        while (true) {
            aTg atg = (aTg) it;
            if (!atg.hasNext()) {
                sbW.append("]");
                String string = sbW.toString();
                int i8 = b + 5;
                a = i8 % 128;
                int i9 = i8 % 2;
                return string;
            }
            int i10 = a + 121;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                sbW.append(((Map.Entry) atg.next()).toString());
                int i11 = 31 / 0;
            } else {
                sbW.append(((Map.Entry) atg.next()).toString());
            }
            if (!(!atg.hasNext())) {
                int i12 = a;
                int i13 = (i12 ^ 11) + ((i12 & 11) << 1);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    sbW.append(", ");
                    int i14 = 98 / 0;
                } else {
                    sbW.append(", ");
                }
                int i15 = a + 109;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 2 / 3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 9) << 1) - (i2 ^ 9);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (obj == this) {
            int i6 = i2 ^ 53;
            int i7 = -(-((i2 & 53) << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i2 + 92;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        boolean z = false;
        if (!(obj instanceof c)) {
            int i13 = (i4 ^ 13) + ((i4 & 13) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        c cVar = (c) obj;
        if (this.f != cVar.f) {
            int i15 = i4 & 51;
            int i16 = -(-((i4 ^ 51) | i15));
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = (i4 | 17) << 1;
            int i20 = -((i4 & (-18)) | ((~i4) & 17));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            b = i21 % 128;
            int i22 = i21 % 2;
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = cVar.iterator();
        int i23 = a;
        int i24 = i23 & 97;
        int i25 = -(-((i23 ^ 97) | i24));
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        b = i26 % 128;
        int i27 = i26 % 2;
        while (true) {
            aTg atg = (aTg) it;
            if (!(!atg.hasNext())) {
                int i28 = a;
                int i29 = (-2) - (((i28 ^ 8) + ((i28 & 8) << 1)) ^ (-1));
                b = i29 % 128;
                Object obj2 = null;
                if (i29 % 2 != 0) {
                    ((aTg) it2).hasNext();
                    obj2.hashCode();
                    throw null;
                }
                aTg atg2 = (aTg) it2;
                if (atg2.hasNext()) {
                    int i30 = a + 97;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    Map.Entry entry = (Map.Entry) atg.next();
                    Object next = atg2.next();
                    int i32 = b;
                    int i33 = i32 ^ 7;
                    int i34 = ((i32 & 7) | i33) << 1;
                    int i35 = -i33;
                    int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                    a = i36 % 128;
                    if (i36 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    if (entry == null) {
                        int i37 = i32 + 77;
                        a = i37 % 128;
                        if (i37 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        if (next == null) {
                            if (entry != null) {
                                int i38 = i32 ^ 25;
                                int i39 = -(-((i32 & 25) << 1));
                                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                                a = i40 % 128;
                                int i41 = i40 % 2;
                                if (!entry.equals(next)) {
                                }
                            }
                        }
                    } else if (entry != null) {
                        int i310 = i32 ^ 25;
                        int i311 = -(-((i32 & 25) << 1));
                        int i42 = ((i310 | i311) << 1) - (i311 ^ i310);
                        a = i42 % 128;
                        int i43 = i42 % 2;
                        if (!entry.equals(next)) {
                        }
                    }
                    int i44 = b;
                    int i45 = i44 & 123;
                    int i46 = (i44 ^ 123) | i45;
                    int i47 = (i45 & i46) + (i46 | i45);
                    a = i47 % 128;
                    if (i47 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
            }
            if (atg.hasNext()) {
                int i48 = a;
                int i49 = i48 & 29;
                int i50 = i48 | 29;
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                b = i51 % 128;
                int i52 = i51 % 2;
            } else {
                int i53 = b + 93;
                a = i53 % 128;
                int i54 = i53 % 2;
                if (!((aTg) it2).hasNext()) {
                    z = true;
                } else {
                    int i410 = a;
                    int i411 = i410 & 29;
                    int i55 = i410 | 29;
                    int i56 = ((i411 | i55) << 1) - (i55 ^ i411);
                    b = i56 % 128;
                    int i57 = i56 % 2;
                }
            }
            int i58 = a;
            int i59 = i58 ^ 99;
            int i60 = -(-((i58 & 99) << 1));
            int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
            b = i61 % 128;
            int i62 = i61 % 2;
            return z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[SYNTHETIC] */
    public V g(K k) {
        Iterator<OooO0O0.OooOO0<K, V>> it;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 41;
        a = i3 % 128;
        int i4 = i3 % 2;
        OooO0O0.OooO0OO<K, V> oooO0OOC = c(k);
        if (oooO0OOC == null) {
            int i5 = b;
            int i6 = ((i5 & 26) + (i5 | 26)) - 1;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            int i9 = (i7 & 53) + (i7 | 53);
            b = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }
        this.f--;
        int i11 = b;
        int i12 = (i11 & 114) + (i11 | 114);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 59 / 0;
            if (!this.e.isEmpty()) {
                it = this.e.keySet().iterator();
                int i15 = a;
                int i16 = i15 & 99;
                int i17 = -(-((i15 ^ 99) | i16));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                while (it.hasNext()) {
                    int i20 = a;
                    i = (-2) - ((((i20 | 72) << 1) - (i20 ^ 72)) ^ (-1));
                    b = i % 128;
                    if (i % 2 != 0) {
                        it.next().b(oooO0OOC);
                        int i21 = 72 / 0;
                    } else {
                        it.next().b(oooO0OOC);
                    }
                }
            }
        } else if (!this.e.isEmpty()) {
            it = this.e.keySet().iterator();
            int i110 = a;
            int i111 = i110 & 99;
            int i112 = -(-((i110 ^ 99) | i111));
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            b = i113 % 128;
            int i114 = i113 % 2;
            while (it.hasNext()) {
                int i22 = a;
                i = (-2) - ((((i22 | 72) << 1) - (i22 ^ 72)) ^ (-1));
                b = i % 128;
                if (i % 2 != 0) {
                    it.next().b(oooO0OOC);
                    int i23 = 72 / 0;
                } else {
                    it.next().b(oooO0OOC);
                }
            }
        }
        OooO0O0.OooO0OO<K, V> oooO0OO = oooO0OOC.f;
        if (oooO0OO != null) {
            int i24 = b;
            int i25 = i24 & 107;
            int i26 = (i25 - (~((i24 ^ 107) | i25))) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
            oooO0OO.e = oooO0OOC.e;
            int i28 = a;
            int i29 = ((i28 | 39) << 1) - (i28 ^ 39);
            b = i29 % 128;
            int i30 = i29 % 2;
        } else {
            this.c = oooO0OOC.e;
            int i31 = b;
            int i32 = i31 & 51;
            int i33 = ((i31 ^ 51) | i32) << 1;
            int i34 = -((i31 | 51) & (~i32));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            a = i35 % 128;
            int i36 = i35 % 2;
        }
        OooO0O0.OooO0OO<K, V> oooO0OO2 = oooO0OOC.e;
        if (oooO0OO2 != null) {
            int i37 = b + 35;
            a = i37 % 128;
            if (i37 % 2 == 0) {
                oooO0OO2.f = oooO0OO;
                throw null;
            }
            oooO0OO2.f = oooO0OO;
            int i38 = a;
            int i39 = ((i38 ^ 75) | (i38 & 75)) << 1;
            int i40 = -(((~i38) & 75) | (i38 & (-76)));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            b = i41 % 128;
            int i42 = i41 % 2;
        } else {
            this.d = oooO0OO;
            int i43 = b;
            int i44 = (i43 ^ 41) + ((i43 & 41) << 1);
            a = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = 4 / 4;
            }
        }
        oooO0OOC.e = null;
        oooO0OOC.f = null;
        V v = oooO0OOC.d;
        int i46 = b;
        int i47 = (i46 ^ 8) + ((i46 & 8) << 1);
        int i48 = (i47 ^ (-1)) + (i47 << 1);
        a = i48 % 128;
        if (i48 % 2 != 0) {
            return v;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r7.e = r1;
        r1.f = r7;
        r5.d = r1;
        r6 = ivas.gov.bisp.enumeration.p090m.c.a;
        r7 = r6 | 115;
        r2 = (r7 << 1) - (r7 & (~(r6 & 115)));
        ivas.gov.bisp.enumeration.p090m.c.b = r2 % 128;
        r2 = r2 % 2;
        r6 = r6 + 69;
        ivas.gov.bisp.enumeration.p090m.c.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r7 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r5.c = r1;
        r5.d = r1;
        r7 = r6 & 101;
        r6 = (r6 | 101) & (~r7);
        r7 = r7 << 1;
        r2 = (r6 ^ r7) + ((r6 & r7) << 1);
        ivas.gov.bisp.enumeration.p090m.c.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.OooOOOO.OooO0O0.OooO0OO<K, V> d(K r6, V r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            ivas.gov.bisp.enumeration.m.c$aTj r1 = new ivas.gov.bisp.enumeration.m.c$aTj
            r1.<init>(r6, r7)
            int r6 = ivas.gov.bisp.enumeration.p090m.c.a
            r7 = r6 & 55
            int r2 = ~r7
            r3 = r6 | 55
            r2 = r2 & r3
            int r7 = r7 << 1
            int r7 = -r7
            int r7 = -r7
            int r7 = ~r7
            int r2 = r2 - r7
            int r2 = r2 + (-1)
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p090m.c.b = r7
            int r2 = r2 % r0
            int r7 = r5.f
            int r7 = r7 + 1
            r5.f = r7
            ivas.gov.bisp.enumeration.OooOOOO.OooO0O0$OooO0OO<K, V> r7 = r5.d
            r2 = r6 ^ 65
            r3 = r6 & 65
            r2 = r2 | r3
            int r2 = r2 << 1
            r3 = r6 & (-66)
            int r4 = ~r6
            r4 = r4 & 65
            r3 = r3 | r4
            int r2 = r2 - r3
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.p090m.c.b = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L40
            r2 = 4
            int r2 = r2 / 0
            if (r7 != 0) goto L5a
            goto L42
        L40:
            if (r7 != 0) goto L5a
        L42:
            r5.c = r1
            r5.d = r1
            r7 = r6 & 101(0x65, float:1.42E-43)
            int r2 = ~r7
            r6 = r6 | 101(0x65, float:1.42E-43)
            r6 = r6 & r2
            int r7 = r7 << 1
            r2 = r6 ^ r7
            r6 = r6 & r7
            int r6 = r6 << 1
            int r2 = r2 + r6
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.p090m.c.b = r6
            int r2 = r2 % r0
            return r1
        L5a:
            r7.e = r1
            r1.f = r7
            r5.d = r1
            int r6 = ivas.gov.bisp.enumeration.p090m.c.a
            r7 = r6 | 115(0x73, float:1.61E-43)
            int r2 = r7 << 1
            r3 = r6 & 115(0x73, float:1.61E-43)
            int r3 = ~r3
            r7 = r7 & r3
            int r2 = r2 - r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.p090m.c.b = r7
            int r2 = r2 % r0
            int r6 = r6 + 69
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.p090m.c.b = r7
            int r6 = r6 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p090m.c.d(java.lang.Object, java.lang.Object):ivas.gov.bisp.enumeration.m.c$aTj");
    }
}
