package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ivas.gov.bisp.enumeration.p096p.h implements Serializable {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P O() {
        ivas.gov.bisp.enumeration.cS.M mD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = -(-((i2 ^ 65) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.d, R());
            int i6 = 49 / 0;
        } else {
            AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
            mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.d, R());
        }
        int i7 = b;
        int i8 = i7 & 49;
        int i9 = ((((i7 ^ 49) | i8) << 1) - (~(-((i7 | 49) & (~i8))))) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 52 / 0;
        }
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J R() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 89) | (i2 & 89)) << 1;
        int i4 = -(((~i2) & 89) | (i2 & (-90)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.d);
        int i7 = b;
        int i8 = (((i7 ^ 113) | (i7 & 113)) << 1) - (((~i7) & 113) | (i7 & (-114)));
        a = i8 % 128;
        int i9 = i8 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J aA() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 41) + (i2 | 41);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.m);
        int i5 = b + 53;
        a = i5 % 128;
        int i6 = i5 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aB() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = i2 | 3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.t, aA());
        int i7 = b + 75;
        a = i7 % 128;
        int i8 = i7 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aD() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 125) - (~(-(-(i2 | 125))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        AbstractC0246t abstractC0246t2 = AbstractC0246t.c;
        if (i4 != 0) {
            return ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, aF());
        }
        int i5 = 18 / 0;
        return ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, aF());
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aE() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 79) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        AbstractC0246t abstractC0246t2 = AbstractC0246t.v;
        if (i6 != 0) {
            return ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, aR());
        }
        int i7 = 5 / 0;
        return ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, aR());
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J aF() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 117;
        int i4 = i3 + ((i2 ^ 117) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.h);
            throw null;
        }
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.h);
        int i5 = (-2) - ((b + 30) ^ (-1));
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aK() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-78)) | ((~i2) & 77);
        int i4 = -(-((i2 & 77) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.w, aO());
        int i7 = b;
        int i8 = i7 ^ 35;
        int i9 = (((i7 & 35) | i8) << 1) - i8;
        a = i9 % 128;
        int i10 = i9 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aM() {
        int i = 2 % 2;
        int i2 = b + 89;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.x, aO());
            obj.hashCode();
            throw null;
        }
        AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.x, aO());
        int i3 = a;
        int i4 = i3 & 109;
        int i5 = (i3 ^ 109) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return mD;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J aO() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-122)) | ((~i2) & 121);
        int i4 = (i2 & 121) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.n);
        int i7 = b + 85;
        a = i7 % 128;
        int i8 = i7 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public long aP(A a2, long j) {
        ivas.gov.bisp.enumeration.cP.P pC;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        int i4 = i2 | 123;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int size = a2.size();
        int i7 = b;
        int i8 = i7 & 9;
        int i9 = (i7 | 9) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < size) {
            int i14 = a;
            int i15 = (((i14 ^ 75) | (i14 & 75)) << 1) - (((~i14) & 75) | (i14 & (-76)));
            b = i15 % 128;
            if (i15 % 2 == 0) {
                pC = a2.n(i13).c(this);
                int i16 = 90 / 0;
            } else {
                pC = a2.n(i13).c(this);
            }
            j = pC.A(j, a2.e(i13));
            int i17 = i13 & (-111);
            int i18 = i17 + ((i13 ^ (-111)) | i17);
            i13 = (((i18 | 113) << 1) - (i18 ^ 113)) - 1;
            int i19 = b;
            int i20 = i19 ^ 85;
            int i21 = -(-((i19 & 85) << 1));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            a = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = a;
        int i25 = i24 & 107;
        int i26 = i25 + ((i24 ^ 107) | i25);
        b = i26 % 128;
        int i27 = i26 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J aR() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.l);
        int i7 = a;
        int i8 = (i7 & 69) + (i7 | 69);
        b = i8 % 128;
        int i9 = i8 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aT() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-64)) | ((~i2) & 63);
        int i4 = (i2 & 63) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        AbstractC0246t abstractC0246t2 = AbstractC0246t.n;
        if (i6 == 0) {
            return ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, aU());
        }
        ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, aU());
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J aU() {
        int i = 2 % 2;
        int i2 = b + 101;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.i);
        int i3 = a;
        int i4 = (i3 ^ 33) + ((i3 & 33) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aV() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 62) + (i2 | 62)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            return ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.u, aR());
        }
        AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.u, aR());
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aW() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = ((i2 ^ 51) | i3) << 1;
        int i5 = -((i2 | 51) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        AbstractC0246t abstractC0246t2 = AbstractC0246t.l;
        if (i7 != 0) {
            return ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, at());
        }
        ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, at());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aX() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 84) + ((i2 & 84) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.k, at());
        int i5 = b;
        int i6 = i5 ^ 73;
        int i7 = ((((i5 & 73) | i6) << 1) - (~(-i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 22 / 0;
        }
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J aY() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = i3 + ((i2 ^ 35) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.f);
        int i6 = a + 77;
        b = i6 % 128;
        int i7 = i6 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P aZ() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = (i3 - (~((i2 ^ 13) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.f, aY());
        int i6 = b;
        int i7 = i6 ^ 75;
        int i8 = ((i6 & 75) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 & i9) + (i8 | i9);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return mD;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public long aa(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a + 125;
        b = i6 % 128;
        int i7 = i6 % 2;
        long jA = bd().A(0L, i);
        int i8 = b;
        int i9 = ((i8 ^ 94) + ((i8 & 94) << 1)) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        long jA2 = aD().A(jA, i2);
        int i11 = a;
        int i12 = i11 & 29;
        int i13 = (i11 | 29) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        long jA3 = x().A(jA2, i3);
        int i17 = b + 33;
        a = i17 % 128;
        Object obj = null;
        if (i17 % 2 != 0) {
            aB().A(jA3, i4);
            throw null;
        }
        long jA4 = aB().A(jA3, i4);
        int i18 = a;
        int i19 = i18 & 69;
        int i20 = ((i18 | 69) & (~i19)) + (i19 << 1);
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return jA4;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P as() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = -(-(i2 | 47));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.f80o, bq());
        int i7 = b;
        int i8 = i7 & 123;
        int i9 = (i7 | 123) & (~i8);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return mD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J at() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-68)) | ((~i2) & 67);
        int i4 = (i2 & 67) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.g);
        int i7 = b;
        int i8 = ((i7 & 10) + (i7 | 10)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P au() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = i3 + ((i2 ^ 115) | i3);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            AbstractC0246t abstractC0246t2 = AbstractC0246t.y;
            aA();
            throw null;
        }
        AbstractC0246t abstractC0246t3 = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.y, aA());
        int i5 = a + 101;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return mD;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P bb() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 50) << 1) - (i2 ^ 50)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.e, aY());
        int i5 = a;
        int i6 = i5 ^ 23;
        int i7 = ((i5 & 23) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return mD;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P bd() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 43;
        int i4 = (i2 & 43) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.h, aY());
        int i7 = b;
        int i8 = (i7 ^ 57) + ((i7 & 57) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P bg() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 97;
        int i4 = (i3 << 1) - ((~(i2 & 97)) & i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.p, bh());
        int i6 = a + 125;
        b = i6 % 128;
        int i7 = i6 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J bh() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 125) | (i2 & 125)) << 1) - (~(-(((~i2) & 125) | (i2 & (-126)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.x xVar = ivas.gov.bisp.enumeration.cP.x.k;
        if (i4 != 0) {
            return ivas.gov.bisp.enumeration.cS.N.k(xVar);
        }
        ivas.gov.bisp.enumeration.cS.N.k(xVar);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J bq() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 97) + (i2 | 97);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.j);
        int i5 = a;
        int i6 = i5 & 95;
        int i7 = -(-((i5 ^ 95) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return nK;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P bw() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 47;
        int i4 = ((i2 & 47) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.s, bh());
            throw null;
        }
        AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.s, bh());
        int i7 = a + 87;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return mD;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-28)) | ((~i2) & 27)) - (~(-(-((i2 & 27) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.x xVar = ivas.gov.bisp.enumeration.cP.x.e;
        if (i4 == 0) {
            return ivas.gov.bisp.enumeration.cS.N.k(xVar);
        }
        ivas.gov.bisp.enumeration.cS.N.k(xVar);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P t() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 59;
        int i4 = i3 + ((i2 ^ 59) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.g, s());
        int i6 = a + 103;
        b = i6 % 128;
        int i7 = i6 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P u() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.q, bh());
        int i5 = a + 73;
        b = i5 % 128;
        int i6 = i5 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P v() {
        ivas.gov.bisp.enumeration.cS.M mD;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        AbstractC0246t abstractC0246t2 = AbstractC0246t.r;
        if (i4 == 0) {
            mD = ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, bh());
            int i5 = 40 / 0;
        } else {
            mD = ivas.gov.bisp.enumeration.cS.M.D(abstractC0246t2, bh());
        }
        int i6 = b;
        int i7 = ((i6 & 43) - (~(-(-(i6 | 43))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 27) + (i2 | 27);
        a = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.m, z());
        int i5 = b;
        int i6 = i5 & 107;
        int i7 = (i6 - (~((i5 ^ 107) | i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return mD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P x() {
        ivas.gov.bisp.enumeration.cS.M mD;
        int i = 2 % 2;
        int i2 = a + 3;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.j, z());
            int i3 = 70 / 0;
        } else {
            AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
            mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.j, z());
        }
        int i4 = b;
        int i5 = (-2) - ((((i4 | 18) << 1) - (i4 ^ 18)) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        return mD;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.P y() {
        int i = 2 % 2;
        int i2 = b + 111;
        a = i2 % 128;
        int i3 = i2 % 2;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.M mD = ivas.gov.bisp.enumeration.cS.M.D(AbstractC0246t.i, z());
        int i4 = a;
        int i5 = ((i4 ^ 12) + ((i4 & 12) << 1)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return mD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public ivas.gov.bisp.enumeration.cP.J z() {
        ivas.gov.bisp.enumeration.cS.N nK;
        int i = 2 % 2;
        int i2 = b + 69;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.c);
            int i3 = 42 / 0;
        } else {
            nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.c);
        }
        int i4 = b;
        int i5 = (((i4 | 80) << 1) - (i4 ^ 80)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public long ae(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ivas.gov.bisp.enumeration.cP.P pBd;
        long j;
        long jA;
        ivas.gov.bisp.enumeration.cP.P pX;
        long jA2;
        ivas.gov.bisp.enumeration.cP.P pBw;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 61;
        int i11 = ((i9 | 61) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            pBd = bd();
            j = 1;
        } else {
            pBd = bd();
            j = 0;
        }
        long jA3 = pBd.A(j, i);
        ivas.gov.bisp.enumeration.cP.P pAD = aD();
        int i12 = b;
        int i13 = i12 & 33;
        int i14 = (i13 - (~((i12 ^ 33) | i13))) - 1;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            jA = pAD.A(jA3, i2);
            pX = x();
            int i15 = 35 / 0;
        } else {
            jA = pAD.A(jA3, i2);
            pX = x();
        }
        int i16 = b;
        int i17 = ((i16 | 47) << 1) - (i16 ^ 47);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            jA2 = pX.A(jA, i3);
            pBw = bw();
            int i18 = 83 / 0;
        } else {
            jA2 = pX.A(jA, i3);
            pBw = bw();
        }
        long jA4 = pBw.A(jA2, i4);
        ivas.gov.bisp.enumeration.cP.P pAV = aV();
        int i19 = b;
        int i20 = (i19 & 7) + (i19 | 7);
        a = i20 % 128;
        int i21 = i20 % 2;
        long jA5 = pAV.A(jA4, i5);
        ivas.gov.bisp.enumeration.cP.P pAM = aM();
        int i22 = b;
        int i23 = (i22 ^ 107) + ((i22 & 107) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        long jA6 = pAM.A(jA5, i6);
        ivas.gov.bisp.enumeration.cP.P pAu = au();
        int i25 = a;
        int i26 = i25 & 55;
        int i27 = ((i25 ^ 55) | i26) << 1;
        int i28 = -((i25 | 55) & (~i26));
        int i29 = (i27 & i28) + (i28 | i27);
        b = i29 % 128;
        int i30 = i29 % 2;
        long jA7 = pAu.A(jA6, i7);
        int i31 = a;
        int i32 = i31 & 109;
        int i33 = -(-((i31 ^ 109) | i32));
        int i34 = (i32 & i33) + (i33 | i32);
        b = i34 % 128;
        if (i34 % 2 != 0) {
            return jA7;
        }
        throw null;
    }
}
