package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public class t extends u {
    private static int a = 0;
    private static int b = 1;
    public final int f;
    public final ivas.gov.bisp.enumeration.cP.J g;

    public t(AbstractC0246t abstractC0246t, ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.J j2) {
        super(abstractC0246t, j);
        if (!j2.i()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        long jH = j2.h();
        long j3 = this.d;
        int i = b;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = (int) (jH / j3);
        this.f = i5;
        if (i5 < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        int i6 = i3 + 95;
        b = i6 % 128;
        int i7 = i6 % 2;
        this.g = j2;
        int i8 = i3 & 113;
        int i9 = ((~i8) & (i3 | 113)) + (i8 << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 57 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cS.u, ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-10)) | ((~i3) & 9)) + ((i3 & 9) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, this.f - 1);
        int i6 = -f(j);
        int i7 = i & i6;
        long j2 = i7 + ((i ^ i6) | i7);
        int i8 = (-2) - ((a + 42) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        long j3 = (j2 * this.d) + j;
        int i10 = b + 109;
        a = i10 % 128;
        int i11 = i10 % 2;
        return j3;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 33) | (i2 & 33)) << 1) - (~(-(((~i2) & 33) | (i2 & (-34)))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0 ? j < 0 : j < 0) {
            int i4 = this.f;
            long j2 = this.d;
            int i5 = a;
            int i6 = i5 & 117;
            int i7 = (i5 ^ 117) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            return i8 % 2 == 0 ? i4 >>> ((int) ((j / j2) % ((long) i4))) : ((i4 - 1) - (~(-(-((int) (((j + 1) / j2) % ((long) i4))))))) - 1;
        }
        long j3 = j / this.d;
        int i9 = this.f;
        int i10 = b;
        int i11 = i10 & 125;
        int i12 = (((i10 ^ 125) | i11) << 1) - ((i10 | 125) & (~i11));
        a = i12 % 128;
        long j4 = i9;
        return (int) (i12 % 2 != 0 ? j3 ^ j4 : j3 % j4);
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = i3 + ((i2 ^ 45) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (-2) - (this.f ^ (-1));
        int i7 = i2 & 115;
        int i8 = (i2 ^ 115) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        return i6;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b + 43;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.g;
        int i5 = (i3 & 59) + (i3 | 59);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
