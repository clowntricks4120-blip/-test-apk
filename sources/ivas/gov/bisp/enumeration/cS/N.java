package ivas.gov.bisp.enumeration.cS;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class N extends ivas.gov.bisp.enumeration.cP.J implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public static HashMap<ivas.gov.bisp.enumeration.cP.x, N> c;
    public final ivas.gov.bisp.enumeration.cP.x d;

    public N(ivas.gov.bisp.enumeration.cP.x xVar) {
        this.d = xVar;
    }

    public static N k(ivas.gov.bisp.enumeration.cP.x xVar) {
        N n;
        synchronized (N.class) {
            HashMap<ivas.gov.bisp.enumeration.cP.x, N> map = c;
            if (map == null) {
                c = new HashMap<>(7);
                n = null;
            } else {
                n = map.get(xVar);
            }
            if (n == null) {
                n = new N(xVar);
                c.put(xVar, n);
            }
        }
        return n;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long c(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 89;
        int i5 = ((i3 & 89) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        UnsupportedOperationException unsupportedOperationExceptionT = t();
        if (i8 != 0) {
            throw unsupportedOperationExceptionT;
        }
        int i9 = 24 / 0;
        throw unsupportedOperationExceptionT;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ivas.gov.bisp.enumeration.cP.J j) {
        int i = 2 % 2;
        int i2 = b + 103;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        int i5 = (i3 & 111) + (i3 | 111);
        b = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long d(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-56)) | ((~i2) & 55);
        int i4 = -(-((i2 & 55) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        UnsupportedOperationException unsupportedOperationExceptionT = t();
        if (i6 != 0) {
            throw unsupportedOperationExceptionT;
        }
        int i7 = 0 / 0;
        throw unsupportedOperationExceptionT;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final int e(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 75) | (i2 & 75)) << 1;
        int i4 = -(((~i2) & 75) | (i2 & (-76)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        throw t();
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long f(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = ((i2 ^ 99) | i3) << 1;
        int i5 = -((i2 | 99) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        throw t();
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final ivas.gov.bisp.enumeration.cP.x g() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = -(-((i2 & 125) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.x xVar = this.d;
        int i8 = i6 & 23;
        int i9 = (i8 - (~(-(-((i6 ^ 23) | i8))))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return xVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long h() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((~i3) & (i2 | 11));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 & 5;
        int i9 = -(-((i2 ^ 5) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return 0L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 111;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            this.d.f81o.hashCode();
            throw null;
        }
        int iHashCode = this.d.f81o.hashCode();
        int i3 = a;
        int i4 = i3 & 123;
        int i5 = (i3 | 123) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 80 / 0;
        }
        return iHashCode;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final boolean i() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-30)) | ((~i2) & 29);
        int i4 = (i2 & 29) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final boolean j() {
        int i = 2 % 2;
        int i2 = a + 39;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = (i3 & 51) + (i3 | 51);
        a = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final UnsupportedOperationException t() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(" field is unsupported");
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(sb.toString());
        int i2 = b + 5;
        a = i2 % 128;
        int i3 = i2 % 2;
        return unsupportedOperationException;
    }

    public final String toString() {
        char c2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 65) + ((i2 & 65) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ivas.gov.bisp.enumeration.p091n.j.w("UnsupportedDurationField[");
            String str = this.d.f81o;
            obj.hashCode();
            throw null;
        }
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("UnsupportedDurationField[");
        String str2 = this.d.f81o;
        int i4 = a;
        int i5 = i4 & 27;
        int i6 = ((i4 | 27) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            sbW.append(str2);
            c2 = 'L';
        } else {
            sbW.append(str2);
            c2 = ']';
        }
        sbW.append(c2);
        int i7 = a + 73;
        b = i7 % 128;
        int i8 = i7 % 2;
        String string = sbW.toString();
        int i9 = a + 15;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = i3 + ((i2 ^ 71) | i3);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        boolean z = true;
        if (this == obj) {
            int i7 = (i2 & 125) + (i2 | 125);
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i2 + 17;
            b = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        if (!(obj instanceof N)) {
            int i11 = (i5 ^ 49) + ((i5 & 49) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 95 / 0;
            }
            return false;
        }
        int i13 = ((i5 | 25) << 1) - (i5 ^ 25);
        a = i13 % 128;
        int i14 = i13 % 2;
        String str = ((N) obj).d.f81o;
        int i15 = a + 9;
        int i16 = i15 % 128;
        b = i16;
        int i17 = i15 % 2;
        Object obj2 = null;
        if (str != null) {
            boolean zEquals = str.equals(this.d.f81o);
            int i18 = b + 34;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                return zEquals;
            }
            obj2.hashCode();
            throw null;
        }
        int i20 = (i16 ^ 99) + ((i16 & 99) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        if (this.d.f81o != null) {
            int i22 = a;
            int i23 = i22 & 35;
            int i24 = (i22 ^ 35) | i23;
            int i25 = (i23 & i24) + (i23 | i24);
            b = i25 % 128;
            int i26 = i25 % 2;
            int i27 = i22 & 119;
            int i28 = (i27 - (~((i22 ^ 119) | i27))) - 1;
            b = i28 % 128;
            int i29 = i28 % 2;
            z = false;
        }
        int i30 = a;
        int i31 = (i30 & 17) + (i30 | 17);
        b = i31 % 128;
        if (i31 % 2 != 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }
}
