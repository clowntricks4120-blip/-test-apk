package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends AbstractC0253j {
    private static int a = 0;
    private static int b = 1;
    public final long d;
    public final ivas.gov.bisp.enumeration.cP.J e;

    public u(AbstractC0246t abstractC0246t, ivas.gov.bisp.enumeration.cP.J j) {
        super(abstractC0246t);
        if (!j.i()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long jH = j.h();
        this.d = jH;
        if (jH < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        int i = a;
        int i2 = i & 3;
        int i3 = -(-((i ^ 3) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        this.e = j;
        int i7 = i5 + 38;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public int F(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 3;
        int i5 = (i4 - (~(-(-((i3 ^ 3) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        int iE = E(j);
        int i7 = a;
        int i8 = i7 | 87;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 87)) & i8);
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return iE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-28)) | ((~i2) & 27)) + ((i2 & 27) << 1);
        int i4 = i3 % 128;
        a = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.J j = this.e;
        int i5 = i4 & 55;
        int i6 = ((i4 | 55) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 83;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ((i2 | 91) << 1) - (i2 ^ 91);
        a = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean w() {
        int i = 2 % 2;
        int i2 = b + 107;
        a = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int iQ;
        int iF;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 79;
        int i5 = -(-((i3 & 79) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            iQ = q();
            iF = F(j, i);
            int i7 = 91 / 0;
        } else {
            iQ = q();
            iF = F(j, i);
        }
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, iQ, iF);
        int i8 = b;
        int i9 = i8 & 81;
        int i10 = i9 + ((i8 ^ 81) | i9);
        a = i10 % 128;
        long jF = i10 % 2 != 0 ? i << f(j) : i - f(j);
        long j2 = this.d;
        int i11 = a;
        int i12 = i11 ^ 21;
        int i13 = (i11 & 21) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        b = i15;
        int i16 = i14 % 2;
        Long.signum(jF);
        long j3 = (jF * j2) + j;
        int i17 = i15 + 45;
        a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 85 / 0;
        }
        return j3;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = i3 + ((i2 ^ 21) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (j >= 0) {
            int i7 = (i2 | 23) << 1;
            int i8 = -(i2 ^ 23);
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return j % this.d;
        }
        long j2 = this.d;
        long j3 = (((j + 1) % j2) + j2) - 1;
        int i11 = i5 + 113;
        a = i11 % 128;
        int i12 = i11 % 2;
        return j3;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        long j2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 99;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (j >= 0) {
            int i5 = (-2) - ((((i2 | 8) << 1) - (i2 ^ 8)) ^ (-1));
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            j2 = j % this.d;
            int i8 = ((i6 | 23) << 1) - (((~i6) & 23) | (i6 & (-24)));
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 3;
            }
        } else {
            long j3 = j + 1;
            j2 = this.d;
            j = j3 - (j3 % j2);
            int i10 = i2 & 45;
            int i11 = (i2 ^ 45) | i10;
            int i12 = (i10 & i11) + (i11 | i10);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        long j4 = j - j2;
        int i14 = a;
        int i15 = (i14 ^ 19) + ((i14 & 19) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        return j4;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 116) + (i2 | 116)) - 1;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0 ? j <= 0 : j <= 1) {
            long j2 = j - (j % this.d);
            int i5 = i4 & 101;
            int i6 = (~i5) & (i4 | 101);
            int i7 = -(-(i5 << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return j2;
        }
        long j3 = j - 1;
        long j4 = this.d;
        long j5 = j3 % j4;
        int i10 = i2 & 115;
        int i11 = (i10 - (~(-(-((i2 ^ 115) | i10))))) - 1;
        int i12 = i11 % 128;
        b = i12;
        long j6 = i11 % 2 == 0 ? (j3 / j5) & j4 : (j3 - j5) + j4;
        int i13 = i12 ^ 53;
        int i14 = ((((i12 & 53) | i13) << 1) - (~(-i13))) - 1;
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 65 / 0;
        }
        return j6;
    }
}
