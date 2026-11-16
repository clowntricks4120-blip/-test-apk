package ivas.gov.bisp.enumeration.cS;

import ivas.gov.bisp.enumeration.cP.A;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.Locale;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cS.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0253j extends ivas.gov.bisp.enumeration.cP.P {
    private static int a = 0;
    private static int b = 1;
    public final AbstractC0246t c;

    public AbstractC0253j(AbstractC0246t abstractC0246t) {
        if (abstractC0246t == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.c = abstractC0246t;
        int i = a;
        int i2 = (i & 93) + (i | 93);
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long C(long j, String str, Locale locale) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 69;
        int i4 = (i3 - (~(-(-((i2 ^ 69) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        long jA = A(j, D(str, locale));
        int i6 = a;
        int i7 = i6 & 49;
        int i8 = i6 | 49;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return jA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int D(String str, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-98)) | ((~i2) & 97);
        int i4 = -(-((i2 & 97) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                Integer.parseInt(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = Integer.parseInt(str);
            int i7 = b;
            int i8 = i7 ^ 123;
            int i9 = ((i7 & 123) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            return i6;
        } catch (NumberFormatException unused) {
            throw new ivas.gov.bisp.enumeration.cP.M(this.c, str);
        }
    }

    public int E(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-4)) | ((~i2) & 3);
        int i4 = -(-((i2 & 3) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return r();
        }
        int i6 = 89 / 0;
        return r();
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String c(long j, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 124) + (i2 | 124);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        String strJ = j(f(j), locale);
        int i6 = b;
        int i7 = ((i6 & (-56)) | ((~i6) & 55)) + ((i6 & 55) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return strJ;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long d(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 ^ 99) + ((i3 & 99) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        long jC = m().c(j, i);
        int i6 = b;
        int i7 = i6 & 3;
        int i8 = i7 + ((i6 ^ 3) | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        return jC;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long e(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 25;
        int i4 = i3 + ((i2 ^ 25) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        long jD = m().d(j, j2);
        int i6 = a;
        int i7 = (i6 | 117) << 1;
        int i8 = -(((~i6) & 117) | (i6 & (-118)));
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 71 / 0;
        }
        return jD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String g(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = b + 22;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        String strJ = j(i, locale);
        if (i5 != 0) {
            int i6 = 44 / 0;
        }
        return strJ;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String h(long j, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 39;
        int i4 = -(-((i2 ^ 39) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        String strG = g(f(j), locale);
        int i7 = b;
        int i8 = ((i7 ^ 75) | (i7 & 75)) << 1;
        int i9 = -(((~i7) & 75) | (i7 & (-76)));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return strG;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public String j(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (-2) - (((i3 ^ 20) + ((i3 & 20) << 1)) ^ (-1));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.toString(i);
        }
        int i5 = 75 / 0;
        return Integer.toString(i);
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int l(long j, long j2) {
        int iE;
        int i = 2 % 2;
        int i2 = b + 77;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            iE = m().e(j, j2);
            int i3 = 54 / 0;
        } else {
            iE = m().e(j, j2);
        }
        int i4 = b;
        int i5 = i4 & 7;
        int i6 = (i4 ^ 7) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
        return iE;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long n(long j, long j2) {
        long jF;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 61;
        int i4 = -(-((i2 & 61) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            jF = m().f(j, j2);
            int i6 = 89 / 0;
        } else {
            jF = m().f(j, j2);
        }
        int i7 = a;
        int i8 = i7 & 43;
        int i9 = i8 + ((i7 ^ 43) | i8);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 47 / 0;
        }
        return jF;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public ivas.gov.bisp.enumeration.cP.J o() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = -(-(i2 | 25));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i2 & 119;
        int i7 = (i2 ^ 119) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long t(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 & (-122)) | ((~i2) & 121)) - (~((i2 & 121) << 1))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        long jY = j - y(j);
        int i5 = a + 97;
        b = i5 % 128;
        int i6 = i5 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public boolean u(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 67;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 67)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        return !(i6 % 2 == 0);
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final AbstractC0246t v() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 85;
        a = i3 % 128;
        int i4 = i3 % 2;
        AbstractC0246t abstractC0246t = this.c;
        int i5 = i2 + 48;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        return abstractC0246t;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean x() {
        int i = 2 % 2;
        int i2 = a + 29;
        b = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public long z(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        long jY = y(j);
        if (jY != j) {
            int i5 = a + 43;
            b = i5 % 128;
            j = i5 % 2 == 0 ? d(jY, 0) : d(jY, 1);
            int i6 = b;
            int i7 = i6 & 9;
            int i8 = i7 + ((i6 ^ 9) | i7);
            a = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = a;
        int i11 = i10 & 11;
        int i12 = (i10 | 11) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public int p(Locale locale) {
        int i = 2 % 2;
        int i2 = a + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iR = r();
        if (iR >= 0) {
            int i4 = b;
            int i5 = (i4 ^ 41) + ((i4 & 41) << 1);
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 == 0 ? iR < 10 : iR < 68) {
                int i7 = (i6 & (-72)) | ((~i6) & 71);
                int i8 = (i6 & 71) << 1;
                int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                b = i9 % 128;
                int i10 = i9 % 2;
                return 1;
            }
            if (iR < 100) {
                int i11 = i4 & 113;
                int i12 = i11 + ((i4 ^ 113) | i11);
                int i13 = i12 % 128;
                a = i13;
                int i14 = i12 % 2 == 0 ? 2 : 5;
                int i15 = i13 + 91;
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    return i14;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iR < 1000) {
                int i16 = (i6 & (-6)) | ((~i6) & 5);
                int i17 = (i6 & 5) << 1;
                int i18 = (i16 & i17) + (i16 | i17);
                b = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((i6 & 89) - (~(i6 | 89))) - 1;
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 64 / 0;
                }
                return 3;
            }
        }
        int length = Integer.toString(iR).length();
        int i22 = b;
        int i23 = (i22 ^ 29) + ((i22 & 29) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        return length;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String i(A a2, Locale locale) {
        int i = 2 % 2;
        int i2 = a + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iV = a2.v(this.c);
        int i4 = b;
        int i5 = i4 ^ 13;
        int i6 = ((i4 & 13) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        String strG = g(iV, locale);
        if (i9 != 0) {
            int i10 = 90 / 0;
        }
        int i11 = a + 11;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 74 / 0;
        }
        return strG;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final String k(A a2, Locale locale) {
        int i = 2 % 2;
        int i2 = a + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iV = a2.v(this.c);
        int i4 = a;
        int i5 = ((i4 | 104) << 1) - (i4 ^ 104);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        String strJ = j(iV, locale);
        int i8 = a;
        int i9 = ((i8 ^ 76) + ((i8 & 76) << 1)) - 1;
        b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 97 / 0;
        }
        return strJ;
    }

    public String toString() {
        char c;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 101;
        int i4 = ((i2 & 101) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("DateTimeField[");
        String str = this.c.z;
        int i8 = a;
        int i9 = ((i8 | 7) << 1) - (((~i8) & 7) | (i8 & (-8)));
        b = i9 % 128;
        if (i9 % 2 == 0) {
            sbW.append(str);
            c = ':';
        } else {
            sbW.append(str);
            c = ']';
        }
        sbW.append(c);
        String string = sbW.toString();
        int i10 = b;
        int i11 = (i10 ^ 43) + ((i10 & 43) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return string;
    }
}
