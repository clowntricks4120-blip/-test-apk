package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class e extends ivas.gov.bisp.enumeration.cP.P implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.cP.P c;
    public final ivas.gov.bisp.enumeration.cP.J d;
    public final AbstractC0246t e;

    public e(ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.J j, AbstractC0246t abstractC0246t) {
        if (p == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.c = p;
        this.d = j;
        if (abstractC0246t == null) {
            int i = a;
            int i2 = (i | 11) << 1;
            int i3 = -(((~i) & 11) | (i & (-12)));
            int i4 = (i2 & i3) + (i3 | i2);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                p.v();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            abstractC0246t = p.v();
            int i5 = 2 % 2;
        }
        this.e = abstractC0246t;
        int i6 = b;
        int i7 = (i6 & (-50)) | ((~i6) & 49);
        int i8 = (i6 & 49) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((((i3 ^ 67) | (i3 & 67)) << 1) - (~(-(((~i3) & 67) | (i3 & (-68)))))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.c.A(j, i);
        }
        this.c.A(j, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long C(long j, String str, Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 3;
        int i4 = -(-((i2 ^ 3) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        long jC = this.c.C(j, str, locale);
        int i7 = b + 85;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 45 / 0;
        }
        return jC;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String c(long j, Locale locale) {
        int i = 2 % 2;
        int i2 = b + 61;
        a = i2 % 128;
        int i3 = i2 % 2;
        String strC = this.c.c(j, locale);
        int i4 = b;
        int i5 = i4 & 71;
        int i6 = i5 + ((i4 ^ 71) | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return strC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long d(long j, int i) {
        long jD;
        int i2 = 2 % 2;
        int i3 = a + 120;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            jD = this.c.d(j, i);
            int i5 = 5 / 0;
        } else {
            jD = this.c.d(j, i);
        }
        int i6 = a + 75;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (i3 - (~((i2 ^ 103) | i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        long jE = this.c.e(j, j2);
        int i6 = b;
        int i7 = i6 & 103;
        int i8 = -(-((i6 ^ 103) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return jE;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int f(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = (i2 | 27) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        int iF = this.c.f(j);
        int i8 = b;
        int i9 = (i8 & 71) + (i8 | 71);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 49 / 0;
        }
        return iF;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String g(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 ^ 75;
        int i5 = ((i3 & 75) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.c.g(i, locale);
            throw null;
        }
        String strG = this.c.g(i, locale);
        int i8 = b;
        int i9 = (-2) - (((i8 ^ 34) + ((i8 & 34) << 1)) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 79 / 0;
        }
        return strG;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String h(long j, Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-126)) | ((~i2) & 125)) - (~(-(-((i2 & 125) << 1))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.c;
        if (i4 == 0) {
            return p.h(j, locale);
        }
        p.h(j, locale);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String i(A a2, Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 29) - (~(i2 | 29))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        String strI = this.c.i(a2, locale);
        int i5 = b;
        int i6 = ((i5 & 64) + (i5 | 64)) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return strI;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String j(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & 31) - (~(-(-(i3 | 31))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        String strJ = this.c.j(i, locale);
        int i6 = a;
        int i7 = i6 & 37;
        int i8 = (i6 ^ 37) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        int i10 = i9 % 2;
        return strJ;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String k(A a2, Locale locale) {
        int i = 2 % 2;
        int i2 = a + 104;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        String strK = this.c.k(a2, locale);
        int i5 = b;
        int i6 = (i5 & 74) + (i5 | 74);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 23 / 0;
        }
        return strK;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iL = this.c.l(j, j2);
        int i5 = b;
        int i6 = i5 ^ 35;
        int i7 = ((i5 & 35) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 & i8) + (i7 | i8);
        a = i9 % 128;
        int i10 = i9 % 2;
        return iL;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 44) + ((i2 & 44) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.c;
        if (i4 == 0) {
            return p.m();
        }
        p.m();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long n(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.c.n(j, j2);
        }
        long jN = this.c.n(j, j2);
        int i4 = 77 / 0;
        return jN;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 51;
        int i4 = (i2 & 51) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.J jO = this.c.o();
        int i7 = b;
        int i8 = i7 & 1;
        int i9 = (i8 - (~(-(-((i7 ^ 1) | i8))))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        return jO;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int p(Locale locale) {
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.c.p(locale);
        }
        this.c.p(locale);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 121;
        int i4 = (i2 | 121) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            this.c.q();
            throw null;
        }
        int iQ = this.c.q();
        int i7 = b;
        int i8 = ((i7 | 25) << 1) - (i7 ^ 25);
        a = i8 % 128;
        int i9 = i8 % 2;
        return iQ;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 89;
        int i4 = (i2 ^ 89) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.c;
        if (i6 == 0) {
            return p.r();
        }
        p.r();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = a + 115;
        b = i2 % 128;
        int i3 = i2 % 2;
        long jT = this.c.t(j);
        int i4 = a;
        int i5 = (i4 & 61) + (i4 | 61);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return jT;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean u(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 95) | (i2 & 95)) << 1;
        int i4 = -(((~i2) & 95) | (i2 & (-96)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        boolean zU = this.c.u(j);
        int i7 = b;
        int i8 = i7 ^ 87;
        int i9 = -(-((i7 & 87) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return zU;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public AbstractC0246t v() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 117) - (~(-(-((i2 & 117) << 1))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        AbstractC0246t abstractC0246t = this.e;
        int i6 = i4 & 83;
        int i7 = (i4 ^ 83) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return abstractC0246t;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean w() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 75) + ((i2 & 75) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.c.w();
            throw null;
        }
        boolean zW = this.c.w();
        int i4 = a;
        int i5 = (i4 & 55) + (i4 | 55);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return zW;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean x() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.c;
        if (i4 != 0) {
            return p.x();
        }
        p.x();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long y(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = -(-((i2 ^ 63) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.P p = this.c;
        if (i6 == 0) {
            return p.y(j);
        }
        p.y(j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = -(-((i2 ^ 19) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.c.z(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZ = this.c.z(j);
        int i6 = b;
        int i7 = ((i6 & 98) + (i6 | 98)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return jZ;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 39;
        int i4 = ((i2 ^ 39) | i3) << 1;
        int i5 = -((i2 | 39) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        ivas.gov.bisp.enumeration.cP.J j = this.d;
        if (j != null) {
            int i9 = (i7 & 65) + (i7 | 65);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 26 / 0;
            }
            int i11 = i7 & 121;
            int i12 = i11 + ((i7 ^ 121) | i11);
            a = i12 % 128;
            int i13 = i12 % 2;
            return j;
        }
        ivas.gov.bisp.enumeration.cP.J jS = this.c.s();
        int i14 = b;
        int i15 = ((i14 ^ 99) | (i14 & 99)) << 1;
        int i16 = -(((~i14) & 99) | (i14 & (-100)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        a = i17 % 128;
        int i18 = i17 % 2;
        return jS;
    }

    public String toString() {
        StringBuilder sbW;
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 61;
        int i4 = (i2 | 61) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            sbW = ivas.gov.bisp.enumeration.p091n.j.w("DateTimeField[");
            str = this.e.z;
            int i7 = 34 / 0;
        } else {
            sbW = ivas.gov.bisp.enumeration.p091n.j.w("DateTimeField[");
            str = this.e.z;
        }
        sbW.append(str);
        sbW.append(']');
        String string = sbW.toString();
        int i8 = b;
        int i9 = i8 & 35;
        int i10 = (i8 ^ 35) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
