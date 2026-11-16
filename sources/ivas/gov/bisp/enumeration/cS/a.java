package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {
    private static int a = 1;
    private static int b;
    public final int e;
    public final ivas.gov.bisp.enumeration.cP.J f;
    public final ivas.gov.bisp.enumeration.cP.J g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, AbstractC0246t abstractC0246t) {
        super(iVar.d, abstractC0246t);
        ivas.gov.bisp.enumeration.cP.J jM = iVar.d.m();
        this.e = iVar.e;
        this.f = jM;
        this.g = iVar.f;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 123) | (i2 & 123)) << 1) - (~(-((i2 & (-124)) | ((~i2) & 123))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.f;
        int i5 = i2 & 61;
        int i6 = (((i2 | 61) & (~i5)) - (~(i5 << 1))) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 39 / 0;
        }
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = a + 43;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = ((((i3 ^ 101) | (i3 & 101)) << 1) - (~(-(((~i3) & 101) | (i3 & (-102)))))) - 1;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return i4;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i = 2 % 2;
        int i2 = b + 63;
        a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.e;
        if (i3 == 0) {
            return i4;
        }
        int i5 = ~i4;
        int i6 = i4 << 1;
        return ((i5 | i6) << 1) - (i6 ^ i5);
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 95) | (i2 & 95)) << 1;
        int i4 = -((i2 & (-96)) | ((~i2) & 95));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.J j = this.g;
        int i6 = ((i2 & 85) - (~(-(-(i2 | 85))))) - 1;
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 48) ^ (-1));
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.d.t(j);
        }
        int i3 = 63 / 0;
        return this.d.t(j);
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 31) << 1;
        int i4 = -(((~i2) & 31) | (i2 & (-32)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        long jY = this.d.y(j);
        int i7 = a + 67;
        b = i7 % 128;
        int i8 = i7 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = -(-((i2 ^ 111) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.d.z(j);
            throw null;
        }
        long jZ = this.d.z(j);
        int i6 = a;
        int i7 = (i6 ^ 21) + ((i6 & 21) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return jZ;
    }

    @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = b + 11;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, this.e << 1);
        } else {
            int i5 = this.e;
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, (i5 ^ (-1)) + (i5 << 1));
        }
        int iF = this.d.f(j);
        if (iF >= 0) {
            int i6 = a + 3;
            b = i6 % 128;
            int i7 = i6 % 2;
            i2 = iF / this.e;
        } else {
            int i8 = iF ^ 1;
            int i9 = ((iF & 1) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 ^ i10) + ((i9 & i10) << 1)) / this.e;
            int i12 = b;
            int i13 = (((i12 & (-126)) | ((~i12) & 125)) - (~(-(-((i12 & 125) << 1))))) - 1;
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = (-2) - (i11 ^ (-1));
            int i17 = ((i14 | 13) << 1) - (i14 ^ 13);
            b = i17 % 128;
            int i18 = i17 % 2;
            i2 = i16;
        }
        ivas.gov.bisp.enumeration.cP.P p = this.d;
        int i19 = i2 * this.e;
        int i20 = b;
        int i21 = ((i20 ^ 52) + ((i20 & 52) << 1)) - 1;
        a = i21 % 128;
        int i22 = i21 % 2;
        long jA = p.A(j, (i19 ^ i) + ((i & i19) << 1));
        int i23 = a;
        int i24 = i23 & 43;
        int i25 = (i23 ^ 43) | i24;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        b = i26 % 128;
        int i27 = i26 % 2;
        return jA;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 51;
        int i4 = (i2 & 51) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iF = this.d.f(j);
        if (iF >= 0) {
            int i7 = (-2) - ((a + 116) ^ (-1));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return iF % this.e;
            }
            int i8 = -(-this.e);
            int i9 = ((~i8) & iF) | ((~iF) & i8);
            int i10 = -(-((iF & i8) << 1));
            return ((i9 | i10) << 1) - (i10 ^ i9);
        }
        int i11 = this.e;
        int i12 = ((((iF | 2) << 1) - (iF ^ 2)) - 1) % i11;
        int i13 = a;
        int i14 = i13 & 53;
        int i15 = i14 + ((i13 ^ 53) | i14);
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((i11 ^ (-1)) | i11) << 1;
        int i18 = -(~i11);
        int i19 = -(~(-(-(((i17 | i18) << 1) - (i18 ^ i17)))));
        int i20 = ((i12 ^ i19) + ((i19 & i12) << 1)) - 1;
        int i21 = ((i13 | 37) << 1) - (i13 ^ 37);
        b = i21 % 128;
        int i22 = i21 % 2;
        return i20;
    }

    public a(i iVar, ivas.gov.bisp.enumeration.cP.J j, AbstractC0246t abstractC0246t) {
        super(iVar.d, abstractC0246t);
        this.e = iVar.e;
        this.f = j;
        this.g = iVar.f;
    }

    public a(ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.J j, AbstractC0246t abstractC0246t, int i) {
        super(p, abstractC0246t);
        if (i >= 2) {
            this.g = j;
            this.f = p.m();
            int i2 = b + 101;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                this.e = i;
                return;
            } else {
                this.e = i;
                int i3 = 70 / 0;
                return;
            }
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }
}
