package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public final class x extends ivas.gov.bisp.enumeration.cS.h {
    private static int a = 0;
    private static int b = 1;
    public final h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ivas.gov.bisp.enumeration.cP.P p, h hVar) {
        super(p, AbstractC0246t.e);
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        this.e = hVar;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-74)) | ((~i2) & 73);
        int i4 = (i2 & 73) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iF = this.d.f(j);
        if (iF <= 0) {
            int i7 = b + 43;
            int i8 = i7 % 128;
            a = i8;
            int i9 = i7 % 2;
            int i10 = -iF;
            int i11 = ((~i10) & 1) | (i10 & (-2));
            int i12 = -(-((i10 & 1) << 1));
            iF = ((i12 & i11) << 1) + (i11 ^ i12);
            int i13 = i8 & 15;
            int i14 = ((i8 ^ 15) | i13) << 1;
            int i15 = -((i8 | 15) & (~i13));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = b;
        int i19 = ((i18 ^ 7) | (i18 & 7)) << 1;
        int i20 = -(((~i18) & 7) | (i18 & (-8)));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            return iF;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 7) << 1) - (((~i2) & 7) | (i2 & (-8)));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.d.l(j, j2);
        }
        this.d.l(j, j2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-30)) | ((~i2) & 29)) + ((i2 & 29) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 37;
        int i7 = -(-((i4 ^ 37) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = b + 85;
        a = i2 % 128;
        int i3 = i2 % 2;
        long jY = this.d.y(j);
        int i4 = a;
        int i5 = (i4 | 51) << 1;
        int i6 = -(((~i4) & 51) | (i4 & (-52)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 41 / 0;
        }
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long z(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 87;
        int i4 = (((i2 & 87) | i3) << 1) - i3;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.d.z(j);
        }
        this.d.z(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 19;
        int i5 = (i3 | 19) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return this.d.d(j, i);
        }
        this.d.d(j, i);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = (((i2 | 65) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        long jE = this.d.e(j, j2);
        int i6 = b + 79;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return jE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long n(long j, long j2) {
        int i = 2 % 2;
        int i2 = a + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        long jN = this.d.n(j, j2);
        int i4 = a;
        int i5 = ((i4 & 30) + (i4 | 30)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        return jN;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iR = this.d.r();
        int i5 = a;
        int i6 = (i5 & 122) + (i5 | 122);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return iR;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 45;
        int i4 = (((i2 | 45) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.cP.J j = this.e.q;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.J j2 = this.e.q;
        int i5 = a;
        int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long t(long j) {
        long jT;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            jT = this.d.t(j);
            int i4 = 72 / 0;
        } else {
            jT = this.d.t(j);
        }
        int i5 = a;
        int i6 = i5 & 109;
        int i7 = -(-((i5 ^ 109) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return jT;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a + 89;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, r());
        } else {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 1, r());
        }
        if (this.e.bU(j) <= 0) {
            int i5 = a + 37;
            b = i5 % 128;
            int i6 = -i;
            if (i5 % 2 == 0) {
                i2 = (i6 << 1) - i6;
            } else {
                int i7 = -(~i6);
                i2 = (((i7 | 1) << 1) - (i7 ^ 1)) - 1;
            }
            i = i2;
        }
        long jA = this.d.A(j, i);
        int i8 = a + 71;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return jA;
        }
        throw null;
    }
}
