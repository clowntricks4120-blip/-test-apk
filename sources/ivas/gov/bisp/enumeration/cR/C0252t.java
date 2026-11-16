package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.concurrent.ConcurrentHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cR.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0252t extends AbstractC0248j {
    public static final C0252t R;
    private static int a = 1;
    private static int b;
    public static final ivas.gov.bisp.enumeration.cP.P Q = new C0251p("BE");
    public static final ConcurrentHashMap<AbstractC0242a, C0252t> P = new ConcurrentHashMap<>();

    static {
        AbstractC0242a abstractC0242a = AbstractC0242a.c;
        int i = b + 31;
        a = i % 128;
        int i2 = i % 2;
        R = by(abstractC0242a);
        int i3 = b;
        int i4 = i3 & 69;
        int i5 = i4 + ((i3 ^ 69) | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public C0252t(ivas.gov.bisp.enumeration.p096p.h hVar, Object obj) {
        super(hVar, obj);
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 89;
        int i4 = ((i2 & 89) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return R;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 37;
        a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = ap().hashCode();
        int i4 = (iHashCode ^ 499287079) + ((iHashCode & 499287079) << 1);
        int i5 = a;
        int i6 = i5 | 1;
        int i7 = (i6 << 1) - ((~(i5 & 1)) & i6);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 7 / 0;
        }
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            ap();
            throw null;
        }
        AbstractC0242a abstractC0242aAp = ap();
        String string = "BuddhistChronology";
        if (abstractC0242aAp != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BuddhistChronology");
            int i4 = a + 39;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append('\b');
            } else {
                sb.append('[');
            }
            sb.append(abstractC0242aAp.g);
            int i5 = b;
            int i6 = i5 & 101;
            int i7 = (i5 | 101) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            sb.append(']');
            string = sb.toString();
            int i11 = a;
            int i12 = i11 & 11;
            int i13 = (i12 - (~(-(-((i11 ^ 11) | i12))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a + 13;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 44 / 0;
        }
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = -(-((i2 ^ 119) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (abstractC0242a == null) {
            int i7 = i2 & 19;
            int i8 = -(-((i2 ^ 19) | i7));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            abstractC0242a = AbstractC0242a.f();
            int i11 = a;
            int i12 = i11 & 111;
            int i13 = ((i11 | 111) & (~i12)) + (i12 << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        if (abstractC0242a != ap()) {
            C0252t c0252tBy = by(abstractC0242a);
            int i15 = a + 5;
            b = i15 % 128;
            int i16 = i15 % 2;
            return c0252tBy;
        }
        int i17 = a;
        int i18 = (i17 ^ 123) + ((i17 & 123) << 1);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 79 / 0;
        }
        int i20 = ((i17 | 107) << 1) - (i17 ^ 107);
        b = i20 % 128;
        int i21 = i20 % 2;
        return this;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = (i2 & 75) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        b = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i7 = i2 | 11;
            int i8 = (i7 << 1) - (i7 & (~(i2 & 11)));
            b = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof C0252t)) {
            int i10 = (i6 & 9) + (i6 | 9);
            a = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = i6 + 6;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            ap();
            ((C0252t) obj).ap();
            throw null;
        }
        boolean zEquals = ap().equals(((C0252t) obj).ap());
        int i14 = a;
        int i15 = i14 & 79;
        int i16 = i14 | 79;
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public static C0252t by(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 22) + (i2 | 22);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (abstractC0242a == null) {
            int i6 = (((i5 | 64) << 1) - (i5 ^ 64)) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                abstractC0242a = AbstractC0242a.f();
                int i7 = 58 / 0;
            } else {
                abstractC0242a = AbstractC0242a.f();
            }
        }
        ConcurrentHashMap<AbstractC0242a, C0252t> concurrentHashMap = P;
        C0252t c0252tPutIfAbsent = concurrentHashMap.get(abstractC0242a);
        int i8 = b;
        int i9 = (i8 & (-122)) | ((~i8) & 121);
        int i10 = (i8 & 121) << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (c0252tPutIfAbsent == null) {
            C0252t c0252t = new C0252t(l.bz(abstractC0242a, null, 4), null);
            C0252t c0252t2 = new C0252t(Q.by(c0252t, new ivas.gov.bisp.enumeration.cP.z(1, 1, 1, 0, 0, 0, 0, c0252t), null), BuildConfig.FLAVOR);
            int i12 = a + 83;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                concurrentHashMap.putIfAbsent(abstractC0242a, c0252t2);
                throw null;
            }
            c0252tPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC0242a, c0252t2);
            if (c0252tPutIfAbsent != null) {
                int i13 = b;
                int i14 = (i13 ^ 41) + ((i13 & 41) << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
            } else {
                c0252tPutIfAbsent = c0252t2;
            }
        }
        int i16 = a;
        int i17 = (i16 & (-28)) | ((~i16) & 27);
        int i18 = -(-((i16 & 27) << 1));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            return c0252tPutIfAbsent;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 77) << 1) - (i2 ^ 77);
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this.f == null) {
            bfa.n = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.d);
            ivas.gov.bisp.enumeration.cS.P p = new ivas.gov.bisp.enumeration.cS.P(new ivas.gov.bisp.enumeration.cS.x(this, bfa.G), 543);
            bfa.G = p;
            ivas.gov.bisp.enumeration.cP.J j = bfa.n;
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            bfa.I = new ivas.gov.bisp.enumeration.cS.e(p, j, AbstractC0246t.e);
            bfa.E = new ivas.gov.bisp.enumeration.cS.P(new ivas.gov.bisp.enumeration.cS.x(this, bfa.E), 543);
            ivas.gov.bisp.enumeration.cS.i iVar = new ivas.gov.bisp.enumeration.cS.i(new ivas.gov.bisp.enumeration.cS.P(bfa.I, 99), bfa.n, AbstractC0246t.g, 100);
            bfa.K = iVar;
            bfa.m = iVar.f;
            bfa.J = new ivas.gov.bisp.enumeration.cS.P(new ivas.gov.bisp.enumeration.cS.a(iVar, iVar.c), AbstractC0246t.f, 1);
            ivas.gov.bisp.enumeration.cP.P p2 = bfa.E;
            ivas.gov.bisp.enumeration.cP.J j2 = bfa.m;
            AbstractC0246t abstractC0246t2 = AbstractC0246t.k;
            ivas.gov.bisp.enumeration.cS.P p3 = new ivas.gov.bisp.enumeration.cS.P(new ivas.gov.bisp.enumeration.cS.a(p2, j2, abstractC0246t2, 100), abstractC0246t2, 1);
            int i5 = a + 7;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                bfa.D = p3;
                bfa.H = Q;
                throw null;
            }
            bfa.D = p3;
            bfa.H = Q;
        }
        int i6 = a;
        int i7 = i6 & 47;
        int i8 = (((i6 ^ 47) | i7) << 1) - ((i6 | 47) & (~i7));
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 18 / 0;
        }
    }
}
