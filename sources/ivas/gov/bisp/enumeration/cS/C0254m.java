package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cS.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254m extends h {
    private static int a = 1;
    private static int b;

    public C0254m(ivas.gov.bisp.enumeration.cP.P p, AbstractC0246t abstractC0246t) {
        super(p, abstractC0246t);
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 89;
        int i4 = ((i2 & 89) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        long jE = this.d.e(j, j2);
        int i8 = a;
        int i9 = i8 & 97;
        int i10 = (((i8 | 97) & (~i9)) - (~(i9 << 1))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return jE;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            this.d.l(j, j2);
            throw null;
        }
        int iL = this.d.l(j, j2);
        int i6 = a;
        int i7 = ((i6 | 69) << 1) - (i6 ^ 69);
        b = i7 % 128;
        int i8 = i7 % 2;
        return iL;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long n(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 111) - (~((i2 & 111) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            this.d.n(j, j2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jN = this.d.n(j, j2);
        int i4 = b;
        int i5 = (((i4 | 124) << 1) - (i4 ^ 124)) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        return jN;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 109;
        int i4 = ((i2 & 109) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            this.d.o();
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.J jO = this.d.o();
        int i7 = b + 43;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            return jO;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 76) << 1) - (i2 ^ 76)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 & (-70)) | ((~i2) & 69);
        int i6 = -(-((i2 & 69) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 56) << 1) - (i2 ^ 56)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        long jY = this.d.y(j);
        int i5 = a;
        int i6 = i5 & 5;
        int i7 = ((i5 | 5) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int iR;
        int i2 = 2 % 2;
        int i3 = a + 27;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            iR = r();
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, iR);
        } else {
            iR = r();
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 1, iR);
        }
        int i4 = a;
        int i5 = (i4 ^ 35) + ((i4 & 35) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (i == iR) {
            int i6 = ((i4 & (-12)) | ((~i4) & 11)) + ((i4 & 11) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            int i9 = ((i7 ^ 3) | (i7 & 3)) << 1;
            int i10 = -(((~i7) & 3) | (i7 & (-4)));
            int i11 = (i9 & i10) + (i9 | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            i = 0;
        }
        long jA = this.d.A(j, i);
        int i13 = a;
        int i14 = ((i13 & (-28)) | ((~i13) & 27)) + ((i13 & 27) << 1);
        b = i14 % 128;
        int i15 = i14 % 2;
        return jA;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a + 71;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.d.d(j, i);
        }
        this.d.d(j, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = i2 | 9;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return this.d.r() / 0;
        }
        int iR = this.d.r();
        int i6 = iR & 1;
        int i7 = (iR ^ 1) | i6;
        return ((i7 & i6) << 1) + (i6 ^ i7);
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long t(long j) {
        long jT;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            jT = this.d.t(j);
            int i6 = 61 / 0;
        } else {
            jT = this.d.t(j);
        }
        int i7 = b;
        int i8 = i7 & 91;
        int i9 = i8 + ((i7 ^ 91) | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        return jT;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final boolean u(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 77;
        int i4 = (i3 - (~(-(-((i2 ^ 77) | i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.d.u(j);
        }
        int i5 = 93 / 0;
        return this.d.u(j);
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long z(long j) {
        int i = 2 % 2;
        int i2 = b + 31;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.d.z(j);
        }
        this.d.z(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int iF;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 115;
        int i5 = (i3 ^ 115) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            iF = this.d.f(j);
            int i7 = 81 / 0;
            if (iF == 0) {
                int i8 = a;
                i = ((i8 & 32) + (i8 | 32)) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    r();
                    throw null;
                }
                iF = r();
            }
        } else {
            iF = this.d.f(j);
            if (iF == 0) {
                int i9 = a;
                i = ((i9 & 32) + (i9 | 32)) - 1;
                b = i % 128;
                if (i % 2 == 0) {
                    r();
                    throw null;
                }
                iF = r();
            }
        }
        int i10 = b;
        int i11 = i10 ^ 75;
        int i12 = (i10 & 75) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        a = i13 % 128;
        if (i13 % 2 != 0) {
            return iF;
        }
        obj.hashCode();
        throw null;
    }
}
