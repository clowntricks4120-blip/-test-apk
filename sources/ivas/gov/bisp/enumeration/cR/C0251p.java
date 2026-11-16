package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cS.AbstractC0253j;
import java.util.Locale;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cR.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251p extends AbstractC0253j {
    private static int a = 0;
    private static int b = 1;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251p(String str) {
        super(AbstractC0246t.d);
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        this.d = str;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 77) | (i3 & 77)) << 1) - (((~i3) & 77) | (i3 & (-78)));
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 1, 1);
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 7;
        int i4 = -(-((i2 & 7) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final String j(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a + 97;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.d;
        }
        int i4 = 16 / 0;
        return this.d;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-126)) | ((~i2) & 125)) + ((i2 & 125) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cS.N nK = ivas.gov.bisp.enumeration.cS.N.k(ivas.gov.bisp.enumeration.cP.x.d);
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = a;
        int i7 = i6 & 15;
        int i8 = ((i6 ^ 15) | i7) << 1;
        int i9 = -((i6 | 15) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return nK;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final int p(Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 70) + ((i2 & 70) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int length = this.d.length();
        int i5 = (-2) - ((a + 120) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return length;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = ((i2 ^ 19) | i3) << 1;
        int i5 = -((i2 | 19) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 112) + (i2 | 112)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 15;
        int i4 = -(-((i2 ^ 15) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean w() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 103) | (i2 & 103)) << 1;
        int i4 = -(((~i2) & 103) | (i2 & (-104)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = ((i6 | 15) << 1) - (i6 ^ 15);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 120) + (i2 | 120)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return Long.MIN_VALUE;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long z(long j) {
        int i = 2 % 2;
        int i2 = a + 83;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.MAX_VALUE;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long C(long j, String str, Locale locale) {
        int i = 2 % 2;
        int i2 = b + 21;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.d.equals(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.d.equals(str) && !"1".equals(str)) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.d, str);
        }
        int i3 = a;
        int i4 = i3 & 85;
        int i5 = ((((i3 ^ 85) | i4) << 1) - (~(-((i3 | 85) & (~i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return j;
    }
}
