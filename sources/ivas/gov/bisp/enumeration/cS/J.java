package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public final class J extends e {
    private static int a = 1;
    private static int b;
    public transient int f;

    public J(ivas.gov.bisp.enumeration.p096p.h hVar, ivas.gov.bisp.enumeration.cP.P p) {
        super(p, null, null);
        int iQ = super.q();
        if (iQ < 0) {
            int i = ~iQ;
            int i2 = -(-(iQ << 1));
            this.f = (i ^ i2) + ((i2 & i) << 1);
            int i3 = a;
            int i4 = i3 & 17;
            int i5 = (i4 - (~(-(-((i3 ^ 17) | i4))))) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (iQ != 0) {
            this.f = iQ;
            int i6 = a;
            int i7 = (((i6 & (-24)) | ((~i6) & 23)) - (~(-(-((i6 & 23) << 1))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = a;
        int i10 = i9 + 69;
        b = i10 % 128;
        int i11 = i10 % 2;
        this.f = 1;
        int i12 = i9 + 39;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cS.e, ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b + 77;
        a = i2 % 128;
        int i3 = i2 % 2;
        int iF = this.c.f(j);
        if (iF <= 0) {
            int i4 = a;
            int i5 = i4 & 69;
            int i6 = i5 + ((i4 ^ 69) | i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                iF = (iF - (~(-(-((iF ^ (-1)) | iF))))) - 1;
            }
        }
        int i7 = a;
        int i8 = ((((i7 ^ 5) | (i7 & 5)) << 1) - (~(-(((~i7) & 5) | (i7 & (-6)))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 31 / 0;
        }
        return iF;
    }

    @Override // ivas.gov.bisp.enumeration.cS.e, ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 108) + (i2 | 108)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.e, ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 57) | (i3 & 57)) << 1;
        int i5 = -(((~i3) & 57) | (i3 & (-58)));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.f, r());
            throw null;
        }
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, this.f, r());
        if (i <= 0) {
            int i7 = b;
            int i8 = i7 + 73;
            a = i8 % 128;
            int i9 = i8 % 2;
            if (i == 0) {
                AbstractC0246t abstractC0246t = AbstractC0246t.d;
                throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.h, Integer.valueOf(i), null, null);
            }
            int i10 = i7 + 23;
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = ((i ^ 1) | (i & 1)) << 1;
            int i14 = -(((~i) & 1) | (i & (-2)));
            i = ((i14 & i13) << 1) + (i13 ^ i14);
            int i15 = i11 & 119;
            int i16 = -(-(i11 | 119));
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            int i18 = i17 % 2;
        }
        long jA = this.c.A(j, i);
        int i19 = b;
        int i20 = (i19 & 53) + (i19 | 53);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 12 / 0;
        }
        return jA;
    }
}
