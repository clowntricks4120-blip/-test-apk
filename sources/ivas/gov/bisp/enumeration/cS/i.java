package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {
    private static int a = 0;
    private static int b = 1;
    public final int e;
    public final ivas.gov.bisp.enumeration.cP.J f;
    public final int g;
    public final ivas.gov.bisp.enumeration.cP.J h;
    public final int i;

    public i(ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.J j, AbstractC0246t abstractC0246t, int i) {
        int i2;
        int i3;
        super(p, abstractC0246t);
        if (i < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        ivas.gov.bisp.enumeration.cP.J jM = p.m();
        if (jM == null) {
            int i4 = b;
            int i5 = i4 & 75;
            int i6 = ((i4 ^ 75) | i5) << 1;
            int i7 = -((~i5) & (i4 | 75));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                this.f = null;
                int i9 = 55 / 0;
            } else {
                this.f = null;
            }
            int i10 = i4 & 75;
            int i11 = -(-(i4 | 75));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 2;
            }
        } else {
            o oVar = new o(jM, ((AbstractC0246t.bFe) abstractC0246t).B, i);
            int i14 = a;
            int i15 = ((i14 & (-70)) | ((~i14) & 69)) + ((i14 & 69) << 1);
            int i16 = i15 % 128;
            b = i16;
            int i17 = i15 % 2;
            this.f = oVar;
            int i18 = i16 & 79;
            int i19 = (i16 | 79) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 & i20) + (i19 | i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 2 % 2;
        }
        this.h = j;
        this.e = i;
        int iQ = p.q();
        int i24 = a;
        int i25 = i24 ^ 41;
        int i26 = ((((i24 & 41) | i25) << 1) - (~(-i25))) - 1;
        int i27 = i26 % 128;
        b = i27;
        int i28 = i26 % 2;
        if (iQ >= 0) {
            int i29 = ((i24 | 55) << 1) - (i24 ^ 55);
            int i30 = i29 % 128;
            b = i30;
            int i31 = i29 % 2;
            i2 = iQ / i;
            int i32 = i30 & 55;
            int i33 = ((i30 ^ 55) | i32) << 1;
            int i34 = -((i30 | 55) & (~i32));
            int i35 = (i33 & i34) + (i34 | i33);
            a = i35 % 128;
            if (i35 % 2 == 0) {
                int i36 = 2 % 2;
            }
        } else {
            int i37 = (iQ | 1) << 1;
            int i38 = -(iQ ^ 1);
            int i39 = ((i37 ^ i38) + ((i38 & i37) << 1)) / i;
            int i40 = i39 ^ (-1);
            int i41 = -(-(i39 << 1));
            i2 = (i40 | i41) + (i40 & i41);
            int i42 = i27 + 33;
            a = i42 % 128;
            int i43 = i42 % 2;
            int i44 = 2 % 2;
        }
        int iR = p.r();
        if (iR >= 0) {
            int i45 = a;
            int i46 = i45 & 93;
            int i47 = (((i45 ^ 93) | i46) << 1) - ((~i46) & (i45 | 93));
            b = i47 % 128;
            int i48 = i47 % 2;
            i3 = iR / i;
            int i49 = ((i45 & 14) + (i45 | 14)) - 1;
            b = i49 % 128;
            if (i49 % 2 == 0) {
                int i50 = 2 / 5;
            } else {
                int i51 = 2 % 2;
            }
        } else {
            int i52 = iR & 1;
            int i53 = -(-((iR ^ 1) | i52));
            i3 = (((i52 ^ i53) + ((i53 & i52) << 1)) / i) - 1;
            int i54 = a;
            int i55 = i54 & 69;
            int i56 = -(-((i54 ^ 69) | i55));
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            b = i57 % 128;
            if (i57 % 2 != 0) {
                int i58 = 2 % 2;
            }
        }
        this.g = i2;
        this.i = i3;
        int i59 = a;
        int i60 = i59 & 3;
        int i61 = i60 + ((i59 ^ 3) | i60);
        b = i61 % 128;
        if (i61 % 2 == 0) {
            int i62 = 81 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 51) | (i2 & 51)) << 1;
        int i4 = -(((~i2) & 51) | (i2 & (-52)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.f;
        int i8 = ((((i6 ^ 49) | (i6 & 49)) << 1) - (~(-(((~i6) & 49) | (i6 & (-50)))))) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long n(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 59;
        int i4 = ((i2 ^ 59) | i3) << 1;
        int i5 = -((i2 | 59) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        long jN = this.d.n(j, j2);
        int i8 = this.e;
        int i9 = b + 87;
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        long j3 = jN / ((long) i8);
        int i12 = (i10 ^ 65) + ((i10 & 65) << 1);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return j3;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & 113) + (i3 | 113);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            i = this.g;
            int i6 = 31 / 0;
        } else {
            i = this.g;
        }
        int i7 = (-2) - ((i5 + 124) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 75 / 0;
        }
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i = 2 % 2;
        int i2 = b + 55;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.i;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 43;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.h;
        if (j != null) {
            int i5 = ((i2 ^ 29) | (i2 & 29)) << 1;
            int i6 = -((i2 & (-30)) | ((~i2) & 29));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 50 / 0;
            }
            int i9 = ((i2 | 61) << 1) - (i2 ^ 61);
            a = i9 % 128;
            int i10 = i9 % 2;
            return j;
        }
        ivas.gov.bisp.enumeration.cP.J jS = super.s();
        int i11 = b;
        int i12 = ((i11 ^ 51) | (i11 & 51)) << 1;
        int i13 = -(((~i11) & 51) | (i11 & (-52)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return jS;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long d(long j, int i) {
        long jD;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 25;
        int i5 = ((i3 ^ 25) | i4) << 1;
        int i6 = -((i3 | 25) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i8 = this.e;
            int i9 = i & i8;
            int i10 = -(-(i | i8));
            jD = p.d(j, (i9 & i10) + (i10 | i9));
        } else {
            jD = this.d.d(j, i * this.e);
        }
        int i11 = b + 67;
        a = i11 % 128;
        int i12 = i11 % 2;
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = i3 + ((i2 ^ 49) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        long jE = this.d.e(j, j2 * ((long) this.e));
        int i6 = b;
        int i7 = (i6 & (-124)) | ((~i6) & 123);
        int i8 = -(-((i6 & 123) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 98 / 0;
        }
        return jE;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iL = this.d.l(j, j2);
        int i7 = this.e;
        int i8 = b;
        int i9 = ((i8 & 40) + (i8 | 40)) - 1;
        a = i9 % 128;
        return i9 % 2 != 0 ? iL % i7 : iL / i7;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iF = f(this.d.t(j));
        int i5 = a;
        int i6 = i5 & 13;
        int i7 = i6 + ((i5 ^ 13) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        long jA = A(j, iF);
        int i9 = b;
        int i10 = (i9 & (-16)) | ((~i9) & 15);
        int i11 = (i9 & 15) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return jA;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = -(-((i2 ^ 111) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.d;
        int iF = f(j) * this.e;
        int i7 = b + 53;
        a = i7 % 128;
        int i8 = i7 % 2;
        long jY = p.y(p.A(j, iF));
        int i9 = a;
        int i10 = ((i9 ^ 105) - (~(-(-((i9 & 105) << 1))))) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iF = this.d.f(j);
        if (iF < 0) {
            int i5 = (((((iF & (-2)) | ((~iF) & 1)) - (~((iF & 1) << 1))) - 1) / this.e) - 1;
            int i6 = b + 73;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }
        int i7 = b;
        int i8 = ((i7 | 65) << 1) - (i7 ^ 65);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2 != 0 ? iF * this.e : iF / this.e;
        int i11 = i9 + 35;
        b = i11 % 128;
        int i12 = i11 % 2;
        return i10;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        ivas.gov.bisp.enumeration.cP.P p;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = (((i5 ^ 3) | (i5 & 3)) << 1) - (((~i5) & 3) | (i5 & (-4)));
        b = i6 % 128;
        if (i6 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.g, this.i);
            p = this.d;
            int i7 = 86 / 0;
        } else {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.g, this.i);
            p = this.d;
        }
        int i8 = b;
        int i9 = i8 ^ 55;
        int i10 = -(-((i8 & 55) << 1));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        int iF = p.f(j);
        if (iF >= 0) {
            int i13 = a;
            int i14 = i13 & 17;
            int i15 = (i13 | 17) & (~i14);
            int i16 = i14 << 1;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            int i18 = i17 % 128;
            b = i18;
            i3 = i17 % 2 == 0 ? iF / this.e : iF % this.e;
            int i19 = i18 & 5;
            int i20 = (i19 - (~((i18 ^ 5) | i19))) - 1;
            a = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int i22 = this.e;
            int i23 = (((iF ^ 1) - (~(-(-((iF & 1) << 1))))) - 1) % i22;
            int i24 = a;
            int i25 = i24 + 39;
            b = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = i22 & 1;
                int i27 = (((i22 ^ 1) | i26) << 1) - ((i22 | 1) & (~i26));
                int i28 = i23 & i27;
                int i29 = (i23 ^ i27) | i28;
                i2 = ((i28 | i29) << 1) - (i28 ^ i29);
            } else {
                i2 = (i23 - (~(-(~(-(-((-2) - (i22 ^ (-1))))))))) - 2;
            }
            int i30 = i24 & 27;
            int i31 = ((i24 ^ 27) | i30) << 1;
            int i32 = -((i24 | 27) & (~i30));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
            i3 = i2;
        }
        ivas.gov.bisp.enumeration.cP.P p2 = this.d;
        int i35 = i * this.e;
        int i36 = i35 & i3;
        int i37 = (i35 ^ i3) | i36;
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        int i39 = b + 93;
        a = i39 % 128;
        if (i39 % 2 == 0) {
            return p2.A(j, i38);
        }
        p2.A(j, i38);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
