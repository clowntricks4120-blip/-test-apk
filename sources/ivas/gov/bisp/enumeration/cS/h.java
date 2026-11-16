package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractC0253j {
    private static int a = 1;
    private static int b;
    public final ivas.gov.bisp.enumeration.cP.P d;

    public h(ivas.gov.bisp.enumeration.cP.P p, AbstractC0246t abstractC0246t) {
        super(abstractC0246t);
        if (p == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!p.x()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        int i = a;
        int i2 = i & 35;
        int i3 = -(-(i | 35));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d = p;
        int i6 = i & 11;
        int i7 = ((((i ^ 11) | i6) << 1) - (~(-((i | 11) & (~i6))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 107) - (~(-(-((i3 & 107) << 1))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        long jA = this.d.A(j, i);
        if (i5 == 0) {
            int i6 = 89 / 0;
        }
        int i7 = a;
        int i8 = i7 & 79;
        int i9 = -(-((i7 ^ 79) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            return jA;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = (((i2 | 11) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 != 0) {
            return this.d.m();
        }
        int i5 = 31 / 0;
        return this.d.m();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 120) + ((i2 & 120) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int iQ = this.d.q();
        int i5 = a;
        int i6 = i5 & 13;
        int i7 = i6 + ((i5 ^ 13) | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        return iQ;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int iR;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = (((i2 | 71) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            iR = this.d.r();
            int i5 = 13 / 0;
        } else {
            iR = this.d.r();
        }
        int i6 = a + 37;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return iR;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 45) + (i2 | 45);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.J jS = this.d.s();
        int i5 = a;
        int i6 = i5 & 31;
        int i7 = (i5 | 31) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return jS;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean w() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 57;
        int i4 = i3 + ((i2 ^ 57) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        boolean zW = this.d.w();
        int i6 = a;
        int i7 = ((i6 ^ 101) | (i6 & 101)) << 1;
        int i8 = -(((~i6) & 101) | (i6 & (-102)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return zW;
    }
}
