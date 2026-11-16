package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cR.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0249m extends ivas.gov.bisp.enumeration.cS.h {
    private static int a = 1;
    private static int b;
    public static final ivas.gov.bisp.enumeration.cP.P e = new C0249m();

    static {
        int i = b;
        int i2 = ((i & 64) + (i | 64)) - 1;
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0249m() {
        ivas.gov.bisp.enumeration.cP.P p = M.an.G;
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        super(p, AbstractC0246t.e);
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        long jD = this.d.d(j, i);
        int i6 = a;
        int i7 = ((((i6 ^ 111) | (i6 & 111)) << 1) - (~(-(((~i6) & 111) | (i6 & (-112)))))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return jD;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 63;
        int i4 = i2 | 63;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iL = this.d.l(j, j2);
        int i7 = a;
        int i8 = i7 & 33;
        int i9 = -(-((i7 ^ 33) | i8));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 18 / 0;
        }
        return iL;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = b + 3;
        a = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i = 2 % 2;
        int i2 = a + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iR = this.d.r();
        int i4 = a;
        int i5 = i4 ^ 87;
        int i6 = ((i4 & 87) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        return iR;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 50) << 1) - (i2 ^ 50)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        long jT = this.d.t(j);
        int i5 = a;
        int i6 = ((i5 ^ 43) | (i5 & 43)) << 1;
        int i7 = -(((~i5) & 43) | (i5 & (-44)));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return jT;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 111) + (i3 | 111);
        b = i4 % 128;
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, i4 % 2 != 0 ? r() : r());
        if (this.d.f(j) < 0) {
            int i5 = b;
            int i6 = i5 & 41;
            int i7 = (i5 | 41) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                i = -i;
                int i10 = 9 / 0;
            } else {
                i = -i;
            }
        }
        long jA = super.A(j, i);
        int i11 = a;
        int i12 = (((i11 & (-36)) | ((~i11) & 35)) - (~(-(-((i11 & 35) << 1))))) - 1;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return jA;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 7) << 1;
        int i4 = -(((~i2) & 7) | (i2 & (-8)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this.d.e(j, j2);
        }
        this.d.e(j, j2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int i = 2 % 2;
        int i2 = a + 81;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.d.f(j);
            throw null;
        }
        int iF = this.d.f(j);
        if (iF < 0) {
            int i3 = a;
            int i4 = i3 & 119;
            int i5 = (i3 ^ 119) | i4;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            b = i6 % 128;
            int i7 = i6 % 2;
            iF = -iF;
            int i8 = i3 + 87;
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = ((i10 ^ 115) - (~((i10 & 115) << 1))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        return iF;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long n(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 63;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 63)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        long jN = this.d.n(j, j2);
        int i8 = a;
        int i9 = i8 ^ 79;
        int i10 = -(-((i8 & 79) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return jN;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = (i2 & 125) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return M.an.q;
        }
        ivas.gov.bisp.enumeration.cP.J j = M.an.q;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 59) | (i2 & 59)) << 1) - (~(-(((~i2) & 59) | (i2 & (-60)))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        long jY = this.d.y(j);
        int i5 = a;
        int i6 = (i5 & 115) + (i5 | 115);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return jY;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 23;
        int i4 = ((((i2 & 23) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            this.d.z(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZ = this.d.z(j);
        int i5 = b;
        int i6 = (i5 ^ 3) + ((i5 & 3) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return jZ;
    }
}
