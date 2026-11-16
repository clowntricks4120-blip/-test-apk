package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public class P extends h {
    private static int a = 1;
    private static int b;
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    public P(ivas.gov.bisp.enumeration.cP.P p, int i) {
        AbstractC0246t abstractC0246tV;
        if (p == null) {
            int i2 = a;
            int i3 = (i2 & (-76)) | ((~i2) & 75);
            int i4 = -(-((i2 & 75) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            abstractC0246tV = null;
            if (i5 % 2 != 0) {
                abstractC0246tV.hashCode();
                throw null;
            }
        } else {
            abstractC0246tV = p.v();
            int i6 = a;
            int i7 = ((i6 ^ 79) - (~((i6 & 79) << 1))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = 2 % 2;
        this(p, abstractC0246tV, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 23;
        int i4 = (i3 << 1) - ((~(i2 & 23)) & i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        long jE = super.e(j, j2);
        int iF = f(jE);
        int i6 = b + 53;
        a = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.p100w.r.ag(this, iF, this.f, this.g);
        int i8 = a;
        int i9 = i8 & 77;
        int i10 = (i9 - (~((i8 ^ 77) | i9))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = ((i8 ^ 43) | (i8 & 43)) << 1;
        int i13 = -(((~i8) & 43) | (i8 & (-44)));
        int i14 = (i12 & i13) + (i13 | i12);
        b = i14 % 128;
        int i15 = i14 % 2;
        return jE;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = -(-((i2 ^ 65) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.J jO = this.d.o();
        int i7 = a;
        int i8 = i7 & 41;
        int i9 = (i7 | 41) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        return jO;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 9) + (i2 | 9);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 111) + ((i3 & 111) << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.g;
            int i5 = 19 / 0;
        } else {
            i = this.g;
        }
        int i6 = i3 & 43;
        int i7 = (i3 ^ 43) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        long jT;
        int i = 2 % 2;
        int i2 = b + 83;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            jT = this.d.t(j);
            int i3 = 46 / 0;
        } else {
            jT = this.d.t(j);
        }
        int i4 = b + 97;
        a = i4 % 128;
        int i5 = i4 % 2;
        return jT;
    }

    public P(ivas.gov.bisp.enumeration.cP.P p, AbstractC0246t abstractC0246t, int i) {
        this(p, abstractC0246t, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 102) << 1) - (i3 ^ 102)) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.f, this.g);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.f, this.g);
        long jA = super.A(j, (-2) - (((i - (~(-(~(-this.e))))) - 1) ^ (-1)));
        int i5 = b + 77;
        a = i5 % 128;
        int i6 = i5 % 2;
        return jA;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 19;
        int i5 = (((i3 | 19) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        long jD = super.d(j, i);
        int iF = f(jD);
        int i7 = b;
        int i8 = i7 & 41;
        int i9 = (i7 | 41) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, iF, this.f, this.g);
            int i12 = 25 / 0;
        } else {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, iF, this.f, this.g);
        }
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int iF;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 7;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            iF = this.d.f(j);
            i = this.e;
            int i4 = 60 / 0;
        } else {
            iF = this.d.f(j);
            i = this.e;
        }
        int i5 = b;
        int i6 = (i5 & 24) + (i5 | 24);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        int i8 = i7 % 128;
        a = i8;
        int i9 = i7 % 2;
        int i10 = ((iF | i) << 1) - (iF ^ i);
        int i11 = ((i8 ^ 91) | (i8 & 91)) << 1;
        int i12 = -((i8 & (-92)) | ((~i8) & 91));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        return i10;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public boolean u(long j) {
        boolean zU;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            zU = this.d.u(j);
            int i4 = 74 / 0;
        } else {
            zU = this.d.u(j);
        }
        int i5 = a;
        int i6 = i5 & 113;
        int i7 = ((i5 | 113) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return zU;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = -(-((i2 ^ 5) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this.d.y(j);
        }
        this.d.y(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 67) + (i2 | 67);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            this.d.z(j);
            throw null;
        }
        long jZ = this.d.z(j);
        int i4 = a;
        int i5 = (((i4 | 58) << 1) - (i4 ^ 58)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return jZ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    public P(ivas.gov.bisp.enumeration.cP.P p, AbstractC0246t abstractC0246t, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        super(p, abstractC0246t);
        if (i == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.e = i;
        int iQ = p.q();
        int i7 = a;
        int i8 = ((i7 ^ 115) | (i7 & 115)) << 1;
        int i9 = -((i7 & (-116)) | ((~i7) & 115));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = -(-i);
            int i12 = iQ ^ i11;
            int i13 = -(-((iQ & i11) << 1));
            if (i2 < (i12 & i13) + (i13 | i12)) {
                i4 = i7 + 97;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    this.f = p.q() / i;
                } else {
                    int iQ2 = (p.q() - (~(-(~(-(-i)))))) - 1;
                    this.f = (iQ2 ^ (-1)) + (iQ2 << 1);
                }
                int i14 = b;
                i5 = (-2) - (((i14 & 124) + (i14 | 124)) ^ (-1));
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i15 = 3 / 2;
                } else {
                    int i16 = 2 % 2;
                }
            } else {
                this.f = i2;
                i6 = i7 + 107;
                b = i6 % 128;
                if (i6 % 2 == 0) {
                    int i17 = 2 % 2;
                }
            }
        } else if (i2 < iQ * i) {
            i4 = i7 + 97;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                this.f = p.q() / i;
            } else {
                int iQ3 = (p.q() - (~(-(~(-(-i)))))) - 1;
                this.f = (iQ3 ^ (-1)) + (iQ3 << 1);
            }
            int i18 = b;
            i5 = (-2) - (((i18 & 124) + (i18 | 124)) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i19 = 3 / 2;
            } else {
                int i110 = 2 % 2;
            }
        } else {
            this.f = i2;
            i6 = i7 + 107;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i111 = 2 % 2;
            }
        }
        int iR = p.r();
        int i20 = -(~i);
        int i21 = ((iR & i20) + (iR | i20)) - 1;
        Object obj = null;
        if (i3 <= i21) {
            this.g = i3;
            int i22 = a;
            int i23 = i22 & 119;
            int i24 = -(-((i22 ^ 119) | i23));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            b = i25 % 128;
            if (i25 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i26 = b + 107;
        a = i26 % 128;
        if (i26 % 2 == 0) {
            this.g = p.r() * i;
        } else {
            int iR2 = p.r();
            int i27 = -(-i);
            this.g = ((((iR2 ^ i27) | (iR2 & i27)) << 1) - (~(-(((~iR2) & i27) | ((~i27) & iR2))))) - 1;
        }
        int i28 = b;
        int i29 = i28 & 113;
        int i30 = i28 | 113;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        a = i31 % 128;
        if (i31 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
