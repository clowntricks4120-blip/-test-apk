package ivas.gov.bisp.enumeration.cS;

/* JADX INFO: loaded from: classes.dex */
public final class x extends e {
    private static int a = 0;
    private static int b = 1;
    public transient int f;

    public x(ivas.gov.bisp.enumeration.p096p.h hVar, ivas.gov.bisp.enumeration.cP.P p) {
        super(p, null, null);
        int iQ = super.q();
        if (iQ < 0) {
            int i = iQ & 1;
            this.f = (((iQ ^ 1) | i) << 1) - ((iQ | 1) & (~i));
            int i2 = b + 27;
            a = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (iQ != 1) {
            this.f = iQ;
            int i4 = b + 121;
            a = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = b;
        int i7 = i6 ^ 125;
        int i8 = (i6 & 125) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        this.f = 0;
        int i12 = i10 + 116;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cS.e, ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 58) << 1) - (i3 ^ 58)) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.f, r());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.f, r());
        int i5 = a;
        int i6 = i5 & 125;
        int i7 = (((~i6) & (i5 | 125)) - (~(i6 << 1))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        if (i <= 0) {
            int i9 = ((((i5 ^ 105) | (i5 & 105)) << 1) - (~(-((i5 & (-106)) | ((~i5) & 105))))) - 1;
            b = i9 % 128;
            i = (i9 % 2 == 0 ? ~i : i ^ (-1)) + (i << 1);
            int i10 = i5 & 83;
            int i11 = ((i5 ^ 83) | i10) << 1;
            int i12 = -((i5 | 83) & (~i10));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        long jA = this.c.A(j, i);
        int i15 = a;
        int i16 = i15 & 11;
        int i17 = (i15 ^ 11) | i16;
        int i18 = (i16 & i17) + (i17 | i16);
        b = i18 % 128;
        int i19 = i18 % 2;
        return jA;
    }

    @Override // ivas.gov.bisp.enumeration.cS.e, ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b + 111;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.c.f(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iF = this.c.f(j);
        if (iF < 0) {
            int i3 = iF & 1;
            iF = ((iF ^ 1) | i3) + i3;
            int i4 = b;
            int i5 = i4 ^ 77;
            int i6 = ((i4 & 77) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = (((i10 | 79) << 1) - (~(-(i10 ^ 79)))) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 40 / 0;
        }
        return iF;
    }

    @Override // ivas.gov.bisp.enumeration.cS.e, ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = a + 67;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.f;
        int i6 = (i3 & 37) + (i3 | 37);
        a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
