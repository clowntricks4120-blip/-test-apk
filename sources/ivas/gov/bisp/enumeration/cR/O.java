package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O extends i {
    private static int a = 1;
    public static final ConcurrentHashMap<AbstractC0242a, O[]> am = new ConcurrentHashMap<>();
    public static final O an;
    private static int b;

    static {
        AbstractC0242a abstractC0242a = AbstractC0242a.c;
        int i = b;
        int i2 = i & 55;
        int i3 = ((i | 55) & (~i2)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        an = bA(abstractC0242a);
        int i5 = b;
        int i6 = (i5 & (-44)) | ((~i5) & 43);
        int i7 = -(-((i5 & 43) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 20 / 0;
        }
    }

    public O(ivas.gov.bisp.enumeration.p096p.h hVar, Object obj, int i) {
        super(hVar, null, i);
    }

    public static O bA(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        O oCc = cc(abstractC0242a, 4);
        int i7 = a;
        int i8 = i7 & 45;
        int i9 = (i7 | 45) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return oCc;
        }
        throw null;
    }

    public static O cc(AbstractC0242a abstractC0242a, int i) {
        O[] oArrPutIfAbsent;
        if (abstractC0242a == null) {
            abstractC0242a = AbstractC0242a.f();
        }
        ConcurrentHashMap<AbstractC0242a, O[]> concurrentHashMap = am;
        O[] oArr = concurrentHashMap.get(abstractC0242a);
        if (oArr == null && (oArrPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC0242a, (oArr = new O[7]))) != null) {
            oArr = oArrPutIfAbsent;
        }
        int i2 = i - 1;
        try {
            O o2 = oArr[i2];
            if (o2 == null) {
                synchronized (oArr) {
                    o2 = oArr[i2];
                    if (o2 == null) {
                        AbstractC0242a abstractC0242a2 = AbstractC0242a.c;
                        O o3 = abstractC0242a == abstractC0242a2 ? new O(null, null, i) : new O(T.by(cc(abstractC0242a2, i), abstractC0242a), null, i);
                        oArr[i2] = o3;
                        o2 = o3;
                    }
                }
            }
            return o2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Invalid min days in first week: ", i));
        }
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bB() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = (((i4 & (-106)) | ((~i4) & 105)) - (~(-(-((i4 & 105) << 1))))) - 1;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return 2629800000L;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bC() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 35;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (((i2 | 34) << 1) - (i2 ^ 34)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return 31557600000L;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bD() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 31;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = (i2 & 119) + (i2 | 119);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return 15778800000L;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bF(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 23;
        int i7 = i6 + ((i5 ^ 23) | i6);
        b = i7 % 128;
        if (i7 % 2 == 0 ? (i2 = (i ^ (-1968)) + ((i & (-1968)) << 1)) > 0 : (i2 = i * 1968) > 0) {
            i3 = i2 >> 2;
            if (!bX(i)) {
                int i8 = a;
                int i9 = i8 & 75;
                int i10 = (i8 ^ 75) | i9;
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    i3 = 0;
                } else {
                    int i12 = i3 & 1;
                    int i13 = (i3 ^ 1) | i12;
                    i3 = ((i12 | i13) << 1) - (i12 ^ i13);
                }
            } else {
                int i14 = a;
                int i15 = i14 ^ 117;
                int i16 = ((((i14 & 117) | i15) << 1) - (~(-i15))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
            }
        } else {
            int i18 = i5 & 61;
            int i19 = ((i5 | 61) & (~i18)) + (i18 << 1);
            int i20 = i19 % 128;
            b = i20;
            if (i19 % 2 != 0) {
                int i21 = i2 & (-3);
                int i22 = (~i21) & (i2 | (-3));
                int i23 = i21 << 1;
                i3 = ((i22 ^ i23) + ((i23 & i22) << 1)) << 5;
            } else {
                int i24 = i2 & 3;
                i3 = (i24 + ((i2 ^ 3) | i24)) >> 2;
            }
            int i25 = i20 + 101;
            a = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 3 / 4;
            }
        }
        long j = ((((long) i2) * 365) + ((long) i3)) * 86400000;
        int i27 = b;
        int i28 = (i27 & (-46)) | ((~i27) & 45);
        int i29 = (i27 & 45) << 1;
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = i30 % 128;
        a = i31;
        int i32 = i30 % 2;
        long j2 = j - 62035200000L;
        int i33 = ((i31 & (-66)) | ((~i31) & 65)) + ((i31 & 65) << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
        return j2;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final int bL() {
        int i = 2 % 2;
        int i2 = b + 45;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 & 51;
        int i5 = (i4 - (~((i3 ^ 51) | i4))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return 292272992;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final int bN() {
        int i = 2 % 2;
        int i2 = a + 11;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return -292269054;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final boolean bX(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        boolean z = true;
        int i4 = ((i3 & (-28)) | ((~i3) & 27)) + ((i3 & 27) << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if ((i & 3) == 0) {
            int i7 = ((i5 & (-78)) | ((~i5) & 77)) + ((i5 & 77) << 1);
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = (((i8 | 124) << 1) - (i8 ^ 124)) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i5 & 39;
            int i13 = (i5 | 39) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            int i16 = i15 % 2;
            z = false;
        }
        int i17 = b;
        int i18 = i17 & 15;
        int i19 = -(-((i17 ^ 15) | i18));
        int i20 = (i18 & i19) + (i19 | i18);
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 83) + (i2 | 83);
        b = i3 % 128;
        int i4 = i3 % 2;
        O o2 = an;
        int i5 = i2 & 65;
        int i6 = (i5 - (~((i2 ^ 65) | i5))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return o2;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h, ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-90)) | ((~i2) & 89);
        int i4 = -(-((i2 & 89) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
            throw null;
        }
        if (this.e == null) {
            super.bx(bfa);
            bfa.G = new ivas.gov.bisp.enumeration.cS.J(this, bfa.G);
            ivas.gov.bisp.enumeration.cS.J j = new ivas.gov.bisp.enumeration.cS.J(this, bfa.E);
            int i6 = b + 119;
            a = i6 % 128;
            int i7 = i6 % 2;
            bfa.E = j;
            int i8 = b;
            int i9 = ((((i8 ^ 41) | (i8 & 41)) << 1) - (~(-(((~i8) & 41) | (i8 & (-42)))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = a;
        int i12 = i11 & 19;
        int i13 = ((i11 ^ 19) | i12) << 1;
        int i14 = -((i11 | 19) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long bz() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-76)) | ((~i2) & 75);
        int i4 = (i2 & 75) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i2 | 93) << 1;
        int i8 = -(i2 ^ 93);
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return 31083663600000L;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.h
    public final long by(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 + 77;
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i <= 0) {
            int i7 = (i5 & (-54)) | ((~i5) & 53);
            int i8 = (i5 & 53) << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            if (i == 0) {
                AbstractC0246t abstractC0246t = AbstractC0246t.d;
                throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.h, Integer.valueOf(i), null, null);
            }
            int i12 = ((i10 | 45) << 1) - (i10 ^ 45);
            int i13 = i12 % 128;
            b = i13;
            if (i12 % 2 == 0) {
                int i14 = i & 1;
                int i15 = ((i ^ 1) | i14) << 1;
                int i16 = -((i | 1) & (~i14));
                i = (i15 & i16) + (i16 | i15);
            }
            int i17 = (((i13 ^ 103) | (i13 & 103)) << 1) - (((~i13) & 103) | (i13 & (-104)));
            a = i17 % 128;
            int i18 = i17 % 2;
        }
        long jBy = super.by(i, i2, i3);
        int i19 = b;
        int i20 = ((i19 ^ 22) + ((i19 & 22) << 1)) - 1;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return jBy;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a + 103;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (abstractC0242a == null) {
            int i5 = i3 & 65;
            int i6 = ((~i5) & (i3 | 65)) + (i5 << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                AbstractC0242a.f();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            abstractC0242a = AbstractC0242a.f();
            int i7 = a + 37;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        if (abstractC0242a != ap()) {
            O oBA = bA(abstractC0242a);
            int i9 = b;
            int i10 = i9 & 33;
            int i11 = ((i9 ^ 33) | i10) << 1;
            int i12 = -((i9 | 33) & (~i10));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            return oBA;
        }
        int i15 = a;
        int i16 = i15 ^ 67;
        int i17 = -(-((i15 & 67) << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = i15 & 113;
        int i21 = (i15 | 113) & (~i20);
        int i22 = i20 << 1;
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        b = i23 % 128;
        int i24 = i23 % 2;
        return this;
    }
}
