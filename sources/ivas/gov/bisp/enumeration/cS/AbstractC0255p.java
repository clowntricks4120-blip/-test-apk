package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cS.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0255p extends AbstractC0253j {
    private static int a = 1;
    private static int b;
    public final long d;
    public final ivas.gov.bisp.enumeration.cP.J e;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cS.p$bKR */
    public final class bKR extends c {
        private static int a = 0;
        private static int b = 1;

        public bKR(ivas.gov.bisp.enumeration.cP.x xVar) {
            super(xVar);
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public final long c(long j, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 23;
            int i5 = (i3 | 23) & (~i4);
            int i6 = -(-(i4 << 1));
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            long jD = AbstractC0255p.this.d(j, i);
            if (i8 != 0) {
                int i9 = 17 / 0;
            }
            return jD;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public final long d(long j, long j2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 5;
            int i4 = (i2 ^ 5) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            AbstractC0255p abstractC0255p = AbstractC0255p.this;
            if (i6 != 0) {
                return abstractC0255p.e(j, j2);
            }
            abstractC0255p.e(j, j2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public final long f(long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 47;
            int i4 = ((i2 | 47) & (~i3)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            long jN = AbstractC0255p.this.n(j, j2);
            int i6 = a;
            int i7 = (i6 & 125) + (i6 | 125);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return jN;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public final long h() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 61;
            int i4 = i2 | 61;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            long j = AbstractC0255p.this.d;
            int i7 = a;
            int i8 = (i7 ^ 27) + ((i7 & 27) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 50 / 0;
            }
            return j;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public final boolean i() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 65) - (~(i2 | 65))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.cS.c, ivas.gov.bisp.enumeration.cP.J
        public final int e(long j, long j2) {
            int i = 2 % 2;
            int i2 = b + 107;
            a = i2 % 128;
            int i3 = i2 % 2;
            int iAa = ivas.gov.bisp.enumeration.p100w.r.aa(AbstractC0255p.this.n(j, j2));
            int i4 = a;
            int i5 = ((i4 & 100) + (i4 | 100)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return iAa;
            }
            throw null;
        }
    }

    public AbstractC0255p(AbstractC0246t abstractC0246t, long j) {
        super(abstractC0246t);
        this.d = j;
        this.e = new bKR(((AbstractC0246t.bFe) abstractC0246t).B);
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-4)) | ((~i2) & 3)) + ((i2 & 3) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        long jN = n(j, j2);
        if (i4 != 0) {
            return ivas.gov.bisp.enumeration.p100w.r.aa(jN);
        }
        ivas.gov.bisp.enumeration.p100w.r.aa(jN);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J m() {
        ivas.gov.bisp.enumeration.cP.J j;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.e;
            int i4 = 29 / 0;
        } else {
            j = this.e;
        }
        int i5 = i2 + 88;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
