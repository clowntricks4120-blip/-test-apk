package ivas.gov.bisp.enumeration.cS;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z extends ivas.gov.bisp.enumeration.cP.J implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public static final ivas.gov.bisp.enumeration.cP.J c = new z();

    static {
        int i = a;
        int i2 = i ^ 121;
        int i3 = ((i & 121) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long c(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 63;
        int i5 = (i4 - (~(-(-((i3 ^ 63) | i4))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        long jY = ivas.gov.bisp.enumeration.p100w.r.Y(j, i);
        int i7 = a;
        int i8 = i7 & 49;
        int i9 = (i8 - (~((i7 ^ 49) | i8))) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return jY;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long d(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = ((i2 ^ 67) | i3) << 1;
        int i5 = -((i2 | 67) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        long jY = ivas.gov.bisp.enumeration.p100w.r.Y(j, j2);
        int i8 = a;
        int i9 = i8 & 59;
        int i10 = -(-(i8 | 59));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return jY;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final int e(long j, long j2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = (i2 ^ 125) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iAa = ivas.gov.bisp.enumeration.p100w.r.aa(ivas.gov.bisp.enumeration.p100w.r.Z(j, j2));
        int i7 = a;
        int i8 = i7 & 89;
        int i9 = i8 + ((i7 ^ 89) | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return iAa;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = i3 + ((i2 ^ 59) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!(obj instanceof z)) {
            int i6 = i2 + 19;
            a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = (i2 & 61) + (i2 | 61);
        a = i8 % 128;
        int i9 = i8 % 2;
        Objects.requireNonNull((z) obj);
        int i10 = b + 69;
        a = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final long f(long j, long j2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 1) + (i2 | 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        long jZ = ivas.gov.bisp.enumeration.p100w.r.Z(j, j2);
        int i5 = b + 81;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return jZ;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final ivas.gov.bisp.enumeration.cP.x g() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 121) - (~(-(-(i2 | 121))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.x xVar = ivas.gov.bisp.enumeration.cP.x.m;
        int i5 = a;
        int i6 = (((i5 | 60) << 1) - (i5 ^ 60)) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
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
        int i3 = i2 & 109;
        int i4 = -(-((i2 ^ 109) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i2 & 58) + (i2 | 58);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return 1L;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = (((i2 ^ 3) | i3) << 1) - ((i2 | 3) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final boolean i() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 51) + (i2 | 51);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (-2) - ((i2 + 44) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // ivas.gov.bisp.enumeration.cP.J
    public final boolean j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 39) | (i2 & 39)) << 1;
        int i4 = -(((~i2) & 39) | (i2 & (-40)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = (-2) - ((i6 + 84) ^ (-1));
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 29 / 0;
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return "DurationField[millis]";
        }
        int i6 = 11 / 0;
        return "DurationField[millis]";
    }

    @Override // java.lang.Comparable
    public final int compareTo(ivas.gov.bisp.enumeration.cP.J j) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = 1;
        int i5 = (((i3 ^ 73) | (i3 & 73)) << 1) - (((~i3) & 73) | (i3 & (-74)));
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0 ? 1 == j.h() : 0 == j.h()) {
            int i6 = a + 76;
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = (i8 ^ 71) + ((i8 & 71) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            i4 = 0;
        } else if (i < 0) {
            int i12 = a;
            int i13 = (i12 ^ 54) + ((i12 & 54) << 1);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            int i15 = i14 % 128;
            b = i15;
            if (i14 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i16 = i15 ^ 37;
            int i17 = -(-((i15 & 37) << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            int i19 = i18 % 2;
            i4 = -1;
        } else {
            int i20 = b;
            int i21 = ((i20 ^ 35) | (i20 & 35)) << 1;
            int i22 = -(((~i20) & 35) | (i20 & (-36)));
            int i23 = (i21 & i22) + (i22 | i21);
            a = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 5 % 2;
            }
        }
        int i25 = b + 7;
        a = i25 % 128;
        if (i25 % 2 == 0) {
            return i4;
        }
        throw null;
    }
}
