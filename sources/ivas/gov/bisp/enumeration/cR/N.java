package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0248j {
    public static final ConcurrentHashMap<AbstractC0242a, N> P;
    public static final N Q;
    private static int a = 0;
    private static int b = 1;

    static {
        ConcurrentHashMap<AbstractC0242a, N> concurrentHashMap = new ConcurrentHashMap<>();
        P = concurrentHashMap;
        N n = new N(M.an);
        Q = n;
        int i = b;
        int i2 = (i & 103) + (i | 103);
        a = i2 % 128;
        if (i2 % 2 != 0) {
            concurrentHashMap.put(AbstractC0242a.c, n);
            int i3 = 56 / 0;
        } else {
            concurrentHashMap.put(AbstractC0242a.c, n);
        }
        int i4 = a;
        int i5 = (i4 ^ 18) + ((i4 & 18) << 1);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public N(ivas.gov.bisp.enumeration.p096p.h hVar) {
        super(hVar, null);
    }

    public static N by(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-50)) | ((~i2) & 49)) - (~((i2 & 49) << 1))) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (abstractC0242a == null) {
            int i6 = i4 ^ 117;
            int i7 = -(-((i4 & 117) << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            abstractC0242a = AbstractC0242a.f();
            int i10 = b;
            int i11 = i10 & 63;
            int i12 = (i11 - (~((i10 ^ 63) | i11))) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        ConcurrentHashMap<AbstractC0242a, N> concurrentHashMap = P;
        N n = concurrentHashMap.get(abstractC0242a);
        int i14 = b;
        int i15 = ((i14 & 8) + (i14 | 8)) - 1;
        a = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            throw null;
        }
        if (n == null) {
            n = new N(T.by(Q, abstractC0242a));
            int i16 = b + 93;
            a = i16 % 128;
            int i17 = i16 % 2;
            N nPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC0242a, n);
            if (nPutIfAbsent != null) {
                int i18 = b;
                int i19 = ((i18 | 101) << 1) - (i18 ^ 101);
                a = i19 % 128;
                if (i19 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                n = nPutIfAbsent;
            }
        }
        int i20 = b;
        int i21 = ((i20 ^ 79) | (i20 & 79)) << 1;
        int i22 = -(((~i20) & 79) | (i20 & (-80)));
        int i23 = (i21 & i22) + (i22 | i21);
        a = i23 % 128;
        int i24 = i23 % 2;
        return n;
    }

    public static N bz() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = ((i2 | 123) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            by(AbstractC0242a.f());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        N nBy = by(AbstractC0242a.f());
        int i5 = a + 55;
        b = i5 % 128;
        int i6 = i5 % 2;
        return nBy;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 15) - (~(-(-((i2 & 15) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        N n = Q;
        int i5 = i2 & 95;
        int i6 = (((i2 | 95) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return n;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 47;
        int i4 = (i3 - (~(-(-((i2 ^ 47) | i3))))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (abstractC0242a == null) {
            abstractC0242a = AbstractC0242a.f();
            int i5 = a;
            int i6 = i5 & 125;
            int i7 = -(-((i5 ^ 125) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        if (abstractC0242a != ap()) {
            N nBy = by(abstractC0242a);
            int i10 = b;
            int i11 = ((i10 ^ 62) + ((i10 & 62) << 1)) - 1;
            a = i11 % 128;
            if (i11 % 2 == 0) {
                return nBy;
            }
            throw null;
        }
        int i12 = a;
        int i13 = i12 & 73;
        int i14 = -(-(i12 | 73));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        int i18 = (((i16 | 126) << 1) - (i16 ^ 126)) - 1;
        a = i18 % 128;
        int i19 = i18 % 2;
        return this;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 40) + ((i2 & 40) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = ap().hashCode();
        return i4 != 0 ? iHashCode % 800855 : (-2) - (((iHashCode & 800856) + (iHashCode | 800856)) ^ (-1));
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ap();
            throw null;
        }
        AbstractC0242a abstractC0242aAp = ap();
        String str = "ISOChronology";
        if (abstractC0242aAp != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ISOChronology");
            int i4 = a;
            int i5 = (i4 | 33) << 1;
            int i6 = -(((~i4) & 33) | (i4 & (-34)));
            int i7 = (i5 & i6) + (i6 | i5);
            b = i7 % 128;
            int i8 = i7 % 2;
            sb.append('[');
            String str2 = abstractC0242aAp.g;
            int i9 = b;
            int i10 = i9 & 31;
            int i11 = (i9 | 31) & (~i10);
            int i12 = i10 << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                sb.append(str2);
                sb.append(')');
                string = sb.toString();
            } else {
                sb.append(str2);
                sb.append(']');
                string = sb.toString();
            }
            str = string;
            int i14 = a;
            int i15 = ((((i14 ^ 83) | (i14 & 83)) << 1) - (~(-(((~i14) & 83) | (i14 & (-84)))))) - 1;
            b = i15 % 128;
            if (i15 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i16 = b;
        int i17 = (i16 & 42) + (i16 | 42);
        int i18 = (i17 ^ (-1)) + (i17 << 1);
        a = i18 % 128;
        int i19 = i18 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-28)) | ((~i2) & 27);
        int i4 = (i2 & 27) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i7 = i6 + 77;
            a = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof N)) {
            int i9 = i2 + 35;
            b = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i6 ^ 33;
        int i12 = (((i6 & 33) | i11) << 1) - i11;
        a = i12 % 128;
        int i13 = i12 % 2;
        AbstractC0242a abstractC0242aAp = ap();
        AbstractC0242a abstractC0242aAp2 = ((N) obj).ap();
        int i14 = a;
        int i15 = i14 & 97;
        int i16 = (i14 | 97) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        b = i18 % 128;
        int i19 = i18 % 2;
        boolean zEquals = abstractC0242aAp.equals(abstractC0242aAp2);
        int i20 = a;
        int i21 = i20 & 29;
        int i22 = (i20 ^ 29) | i21;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        ivas.gov.bisp.enumeration.cP.P p;
        AbstractC0246t abstractC0246t;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 87;
        int i4 = i2 | 87;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (this.e.ap() == AbstractC0242a.c) {
            int i7 = b + 15;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                p = C0249m.e;
                AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
                abstractC0246t = AbstractC0246t.g;
                int i8 = 24 / 0;
            } else {
                p = C0249m.e;
                AbstractC0246t abstractC0246t3 = AbstractC0246t.d;
                abstractC0246t = AbstractC0246t.g;
            }
            Objects.requireNonNull((C0249m) p);
            ivas.gov.bisp.enumeration.cS.i iVar = new ivas.gov.bisp.enumeration.cS.i(p, M.an.q, abstractC0246t, 100);
            int i9 = a + 11;
            b = i9 % 128;
            Object obj = null;
            if (i9 % 2 == 0) {
                bfa.K = iVar;
                ivas.gov.bisp.enumeration.cP.J j = iVar.f;
                obj.hashCode();
                throw null;
            }
            bfa.K = iVar;
            bfa.m = iVar.f;
            ivas.gov.bisp.enumeration.cS.a aVar = new ivas.gov.bisp.enumeration.cS.a(iVar, AbstractC0246t.f);
            int i10 = b;
            int i11 = i10 & 69;
            int i12 = i10 | 69;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            if (i13 % 2 != 0) {
                bfa.J = aVar;
                ivas.gov.bisp.enumeration.cP.J j2 = bfa.k;
                obj.hashCode();
                throw null;
            }
            bfa.J = aVar;
            ivas.gov.bisp.enumeration.cS.a aVar2 = new ivas.gov.bisp.enumeration.cS.a((ivas.gov.bisp.enumeration.cS.i) bfa.K, bfa.k, AbstractC0246t.k);
            int i14 = b;
            int i15 = (i14 & (-110)) | ((~i14) & 109);
            int i16 = -(-((i14 & 109) << 1));
            int i17 = (i15 & i16) + (i16 | i15);
            a = i17 % 128;
            int i18 = i17 % 2;
            bfa.D = aVar2;
            int i19 = a;
            int i20 = (i19 & 5) + (i19 | 5);
            b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = b;
        int i23 = i22 & 95;
        int i24 = (((i22 | 95) & (~i23)) - (~(i23 << 1))) - 1;
        a = i24 % 128;
        int i25 = i24 % 2;
    }
}
