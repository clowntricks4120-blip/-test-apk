package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o0000Ooo;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Y implements X {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.aD.X
    public Map<?, ?> a(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = (i2 ^ 91) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        C0057n c0057n = (C0057n) obj;
        int i7 = i2 & 15;
        int i8 = -(-(i2 | 15));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return c0057n;
    }

    @Override // ivas.gov.bisp.enumeration.aD.X
    public Map<?, ?> e(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((((i2 | 58) << 1) - (i2 ^ 58)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        C0057n c0057n = (C0057n) obj;
        int i5 = i2 + 117;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return c0057n;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ivas.gov.bisp.enumeration.aD.X
    public boolean f(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = -(-(i2 | 61));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return !((C0057n) obj).d;
        }
        boolean z = ((C0057n) obj).d;
        int i6 = ((z ? 1 : 0) & (-2)) | ((~(z ? 1 : 0)) & 1);
        int i7 = (z ? 1 : 0) & 1;
        return (i7 & i6) | (i6 ^ i7);
    }

    @Override // ivas.gov.bisp.enumeration.aD.X
    public o0000Ooo.OooO00o<?, ?> n(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 81;
        int i4 = ((((i2 & 81) | i3) << 1) - (~(-i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            Objects.requireNonNull((D) obj);
            return null;
        }
        Objects.requireNonNull((D) obj);
        int i5 = 96 / 0;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.X
    public Object c(Object obj) {
        C0057n c0057n;
        int i = 2 % 2;
        int i2 = b + 35;
        a = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            C0057n.c.isEmpty();
            obj2.hashCode();
            throw null;
        }
        C0057n c0057n2 = C0057n.c;
        if (c0057n2.isEmpty()) {
            c0057n = new C0057n();
            int i3 = b;
            int i4 = ((i3 | 77) << 1) - (i3 ^ 77);
            a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            C0057n c0057n3 = new C0057n(c0057n2);
            int i6 = b;
            int i7 = (i6 & (-114)) | ((~i6) & 113);
            int i8 = -(-((i6 & 113) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            c0057n = c0057n3;
        }
        int i11 = a;
        int i12 = (i11 ^ 121) + ((i11 & 121) << 1);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return c0057n;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.X
    public Object g(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 123) - (~((i2 & 123) << 1))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ((C0057n) obj).d = false;
        int i5 = a;
        int i6 = i5 | 115;
        int i7 = (i6 << 1) - ((~(i5 & 115)) & i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        return obj;
    }

    @Override // ivas.gov.bisp.enumeration.aD.X
    public int d(int i, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 117) + (i3 | 117);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        C0057n c0057n = (C0057n) obj;
        D d = (D) obj2;
        int i7 = ((i5 | 101) << 1) - (i5 ^ 101);
        a = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        Object obj3 = null;
        if (!c0057n.isEmpty()) {
            int i10 = a;
            int i11 = (i10 & (-124)) | ((~i10) & 123);
            int i12 = (i10 & 123) << 1;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                c0057n.entrySet().iterator();
                throw null;
            }
            Iterator it = c0057n.entrySet().iterator();
            int i14 = b;
            int i15 = i14 & 123;
            int i16 = i14 | 123;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            while (it.hasNext()) {
                int i19 = a;
                int i20 = ((i19 ^ 39) - (~(-(-((i19 & 39) << 1))))) - 1;
                b = i20 % 128;
                int i21 = i20 % 2;
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                int i22 = b;
                int i23 = ((i22 ^ 62) + ((i22 & 62) << 1)) - 1;
                a = i23 % 128;
                int i24 = i23 % 2;
                Object value = entry.getValue();
                Objects.requireNonNull(d);
                int i25 = a;
                int i26 = i25 & 91;
                int i27 = (i26 - (~(-(-((i25 ^ 91) | i26))))) - 1;
                b = i27 % 128;
                int i28 = i27 % 2;
                int iBT = AbstractC0064u.bT(i);
                int iB = D.b(key, value);
                int i29 = a;
                int i30 = ((i29 | 29) << 1) - (i29 ^ 29);
                b = i30 % 128;
                int i31 = i30 % 2;
                int iBK = AbstractC0064u.bK(iB);
                if (i31 != 0) {
                    i9 *= iBK >>> iBT;
                } else {
                    int i32 = -(-iBT);
                    int i33 = iBK & i32;
                    int i34 = ((((iBK ^ i32) | i33) << 1) - (~(-((iBK | i32) & (~i33))))) - 1;
                    int i35 = i9 & i34;
                    int i36 = -(-((i9 ^ i34) | i35));
                    i9 = (i35 ^ i36) + ((i35 & i36) << 1);
                }
            }
        }
        int i37 = b;
        int i38 = i37 ^ 3;
        int i39 = (((i37 & 3) | i38) << 1) - i38;
        a = i39 % 128;
        if (i39 % 2 != 0) {
            return i9;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r7 r8
  0x002c: PHI (r7v2 ivas.gov.bisp.enumeration.aD.n) = (r7v1 ivas.gov.bisp.enumeration.aD.n), (r7v14 ivas.gov.bisp.enumeration.aD.n) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r8v2 ivas.gov.bisp.enumeration.aD.n) = (r8v1 ivas.gov.bisp.enumeration.aD.n), (r8v9 ivas.gov.bisp.enumeration.aD.n) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    @Override // ivas.gov.bisp.enumeration.aD.X
    public Object b(Object obj, Object obj2) {
        C0057n c0057n;
        C0057n c0057n2;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 13;
        a = i3 % 128;
        Object obj3 = null;
        if (i3 % 2 == 0) {
            c0057n = (C0057n) obj;
            c0057n2 = (C0057n) obj2;
            int i4 = 92 / 0;
            if (!c0057n2.isEmpty()) {
                int i5 = b;
                int i6 = i5 & 77;
                i = (i6 - (~((i5 ^ 77) | i6))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    boolean z = c0057n.d;
                    obj3.hashCode();
                    throw null;
                }
                if (!c0057n.d) {
                    if (c0057n.isEmpty()) {
                        c0057n = new C0057n();
                        int i7 = a;
                        int i8 = ((i7 ^ 25) | (i7 & 25)) << 1;
                        int i9 = -(((~i7) & 25) | (i7 & (-26)));
                        int i10 = (i8 & i9) + (i9 | i8);
                        b = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        C0057n c0057n3 = new C0057n(c0057n);
                        int i12 = a;
                        int i13 = i12 & 43;
                        int i14 = ((((i12 ^ 43) | i13) << 1) - (~(-((i12 | 43) & (~i13))))) - 1;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                        c0057n = c0057n3;
                    }
                }
                c0057n.e();
                if (!c0057n2.isEmpty()) {
                    int i16 = b;
                    int i17 = ((i16 | 69) << 1) - (i16 ^ 69);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    c0057n.putAll(c0057n2);
                    int i19 = a;
                    int i20 = (((i19 | 90) << 1) - (i19 ^ 90)) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
        } else {
            c0057n = (C0057n) obj;
            c0057n2 = (C0057n) obj2;
            if (!c0057n2.isEmpty()) {
                int i22 = b;
                int i23 = i22 & 77;
                i = (i23 - (~((i22 ^ 77) | i23))) - 1;
                a = i % 128;
                if (i % 2 != 0) {
                    boolean z2 = c0057n.d;
                    obj3.hashCode();
                    throw null;
                }
                if (!c0057n.d) {
                    if (c0057n.isEmpty()) {
                        c0057n = new C0057n();
                        int i24 = a;
                        int i25 = ((i24 ^ 25) | (i24 & 25)) << 1;
                        int i26 = -(((~i24) & 25) | (i24 & (-26)));
                        int i110 = (i25 & i26) + (i26 | i25);
                        b = i110 % 128;
                        int i111 = i110 % 2;
                    } else {
                        C0057n c0057n4 = new C0057n(c0057n);
                        int i112 = a;
                        int i113 = i112 & 43;
                        int i114 = ((((i112 ^ 43) | i113) << 1) - (~(-((i112 | 43) & (~i113))))) - 1;
                        b = i114 % 128;
                        int i115 = i114 % 2;
                        c0057n = c0057n4;
                    }
                }
                c0057n.e();
                if (!c0057n2.isEmpty()) {
                    int i116 = b;
                    int i117 = ((i116 | 69) << 1) - (i116 ^ 69);
                    a = i117 % 128;
                    int i118 = i117 % 2;
                    c0057n.putAll(c0057n2);
                    int i119 = a;
                    int i27 = (((i119 | 90) << 1) - (i119 ^ 90)) - 1;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        }
        int i29 = b + 97;
        a = i29 % 128;
        if (i29 % 2 != 0) {
            return c0057n;
        }
        obj3.hashCode();
        throw null;
    }
}
