package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class M extends ivas.gov.bisp.enumeration.cP.P implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public static HashMap<AbstractC0246t, M> c;
    public final AbstractC0246t d;
    public final ivas.gov.bisp.enumeration.cP.J e;

    public M(AbstractC0246t abstractC0246t, ivas.gov.bisp.enumeration.cP.J j) {
        if (abstractC0246t == null || j == null) {
            throw new IllegalArgumentException();
        }
        int i = a;
        int i2 = i & 31;
        int i3 = (i ^ 31) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        this.d = abstractC0246t;
        this.e = j;
        int i6 = i & 25;
        int i7 = ((((i ^ 25) | i6) << 1) - (~(-((~i6) & (i | 25))))) - 1;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x001f, B:7:0x0010, B:9:0x0018), top: B:19:0x0003 }] */
    public static M D(AbstractC0246t abstractC0246t, ivas.gov.bisp.enumeration.cP.J j) {
        M m;
        synchronized (M.class) {
            HashMap<AbstractC0246t, M> map = c;
            if (map == null) {
                c = new HashMap<>(7);
            } else {
                m = map.get(abstractC0246t);
                if (m != null && m.e != j) {
                }
                if (m == null) {
                    m = new M(abstractC0246t, j);
                    c.put(abstractC0246t, m);
                }
            }
            m = null;
            if (m == null) {
                m = new M(abstractC0246t, j);
                c.put(abstractC0246t, m);
            }
        }
        return m;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 53) + ((i3 & 53) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long C(long j, String str, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 104) + (i2 | 104);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw ae();
        }
        int i5 = 59 / 0;
        throw ae();
    }

    public final UnsupportedOperationException ae() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(" field is unsupported");
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(sb.toString());
        int i2 = b;
        int i3 = (i2 ^ 30) + ((i2 & 30) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        return unsupportedOperationException;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String c(long j, Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-56)) | ((~i2) & 55)) + ((i2 & 55) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw ae();
        }
        ae();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = a + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.e.d(j, j2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jD = this.e.d(j, j2);
        int i3 = b + 5;
        a = i3 % 128;
        int i4 = i3 % 2;
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = (((i2 | 37) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw ae();
        }
        int i5 = 64 / 0;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String g(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 123) << 1) - (i3 ^ 123);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw ae();
        }
        ae();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String h(long j, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 57) << 1;
        int i4 = -(((~i2) & 57) | (i2 & (-58)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String i(A a2, Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = (((i2 | 9) & (~i3)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String j(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a + 67;
        b = i3 % 128;
        int i4 = i3 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String k(A a2, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 51) | (i2 & 51)) << 1;
        int i4 = -(((~i2) & 51) | (i2 & (-52)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int l(long j, long j2) {
        int i = 2 % 2;
        int i2 = a + 44;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iE = this.e.e(j, j2);
        int i5 = a;
        int i6 = i5 & 49;
        int i7 = (i5 | 49) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return iE;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = a + 35;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.e;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (((i2 | 51) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = i5 & 17;
        int i8 = ((i5 ^ 17) | i7) << 1;
        int i9 = -((i5 | 17) & (~i7));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int p(Locale locale) {
        int i = 2 % 2;
        int i2 = b + 77;
        a = i2 % 128;
        int i3 = i2 % 2;
        UnsupportedOperationException unsupportedOperationExceptionAe = ae();
        if (i3 == 0) {
            throw unsupportedOperationExceptionAe;
        }
        int i4 = 1 / 0;
        throw unsupportedOperationExceptionAe;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = b + 57;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            throw ae();
        }
        ae();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = b + 39;
        a = i2 % 128;
        int i3 = i2 % 2;
        UnsupportedOperationException unsupportedOperationExceptionAe = ae();
        if (i3 == 0) {
            throw unsupportedOperationExceptionAe;
        }
        int i4 = 25 / 0;
        throw unsupportedOperationExceptionAe;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 17;
        int i4 = (((i2 & 17) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 ^ 13;
        int i7 = (i2 & 13) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long t(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = i3 + ((i2 ^ 1) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        throw ae();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i4 & 13;
        int i6 = (((i4 ^ 13) | i5) << 1) - ((i4 | 13) & (~i5));
        a = i6 % 128;
        int i7 = i6 % 2;
        return "UnsupportedDateTimeField";
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean u(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 82) << 1) - (i2 ^ 82);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final AbstractC0246t v() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = (((i2 ^ 5) | i3) << 1) - ((i2 | 5) & (~i3));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        AbstractC0246t abstractC0246t = this.d;
        int i7 = (-2) - ((i5 + 124) ^ (-1));
        a = i7 % 128;
        int i8 = i7 % 2;
        return abstractC0246t;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean w() {
        int i = 2 % 2;
        int i2 = b + 119;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = ((i3 ^ 54) + ((i3 & 54) << 1)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean x() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 31) + ((i2 & 31) << 1);
        b = i3 % 128;
        return !(i3 % 2 != 0);
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = (i2 | 37) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw ae();
        }
        ae();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long z(long j) {
        int i = 2 % 2;
        int i2 = a + 95;
        b = i2 % 128;
        int i3 = i2 % 2;
        throw ae();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 75;
        int i5 = ((i3 | 75) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.e.c(j, i);
            throw null;
        }
        long jC = this.e.c(j, i);
        int i6 = (-2) - ((a + 102) ^ (-1));
        b = i6 % 128;
        int i7 = i6 % 2;
        return jC;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long n(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        b = i3 % 128;
        int i4 = i3 % 2;
        long jF = this.e.f(j, j2);
        int i5 = b;
        int i6 = i5 & 79;
        int i7 = ((i5 ^ 79) | i6) << 1;
        int i8 = -((i5 | 79) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return jF;
    }
}
