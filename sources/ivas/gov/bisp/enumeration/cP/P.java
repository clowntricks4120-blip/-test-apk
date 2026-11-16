package ivas.gov.bisp.enumeration.cP;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    private static int a = 0;
    private static int b = 1;

    public abstract long A(long j, int i);

    public long B(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 84) + (i3 | 84);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        long jA = A(j, i);
        int i7 = b;
        int i8 = (i7 & (-90)) | ((~i7) & 89);
        int i9 = (i7 & 89) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
        return jA;
    }

    public abstract long C(long j, String str, Locale locale);

    public abstract String c(long j, Locale locale);

    public abstract long d(long j, int i);

    public abstract long e(long j, long j2);

    public abstract int f(long j);

    public abstract String g(int i, Locale locale);

    public abstract String h(long j, Locale locale);

    public abstract String i(A a2, Locale locale);

    public abstract String j(int i, Locale locale);

    public abstract String k(A a2, Locale locale);

    public abstract int l(long j, long j2);

    public abstract J m();

    public abstract long n(long j, long j2);

    public abstract J o();

    public abstract int p(Locale locale);

    public abstract int q();

    public abstract int r();

    public abstract J s();

    public abstract long t(long j);

    public abstract boolean u(long j);

    public abstract AbstractC0246t v();

    public abstract boolean w();

    public abstract boolean x();

    public abstract long y(long j);

    public abstract long z(long j);
}
