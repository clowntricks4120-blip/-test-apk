package ivas.gov.bisp.enumeration.cU;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0242a {
    private static int a = 0;
    private static int b = 1;
    public final int h;
    public final String i;
    public final int j;

    public r(String str, String str2, int i, int i2) {
        super(str);
        this.i = str2;
        this.j = i;
        this.h = i2;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final String m(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 29;
        int i4 = (i3 << 1) - ((~(i2 & 29)) & i3);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this.i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int n(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 3) + (i2 | 3);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = this.j;
        int i7 = (((i4 ^ 71) | (i4 & 71)) << 1) - (((~i4) & 71) | (i4 & (-72)));
        b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int o(long j) {
        int i = 2 % 2;
        int i2 = a + 105;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.j;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int p(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 116) + ((i2 & 116) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.h;
        if (i4 == 0) {
            int i6 = 36 / 0;
        }
        return i5;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final boolean q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 47;
        int i4 = ((i2 & 47) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        a = i7;
        boolean z = i6 % 2 == 0;
        int i8 = i7 + 49;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final long r(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 113;
        int i4 = i3 + ((i2 ^ 113) | i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = (i5 ^ 41) + ((i5 & 41) << 1);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final long s(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 51) << 1) - (i2 ^ 51);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int hashCode() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 17) + (i4 | 17);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            this.g.hashCode();
            throw null;
        }
        int iHashCode = this.g.hashCode();
        int i6 = this.h;
        int i7 = b;
        int i8 = (i7 & 27) + (i7 | 27);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            i = this.j * 52;
            i2 = i6 * 56;
        } else {
            i = this.j * 31;
            i2 = i6 * 37;
        }
        int i9 = -(~(-(-iHashCode)));
        int i10 = ((i2 & i9) + (i9 | i2)) - 1;
        int i11 = (i & i10) + (i | i10);
        int i12 = (i7 ^ 61) + ((i7 & 61) << 1);
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return i11;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = ((i2 ^ 31) | i3) << 1;
        int i5 = -((~i3) & (i2 | 31));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (this == obj) {
            int i9 = i2 + 75;
            b = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        boolean z = false;
        if (!(obj instanceof r)) {
            int i11 = i7 & 69;
            int i12 = ((i7 ^ 69) | i11) << 1;
            int i13 = -((~i11) & (i7 | 69));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            a = i14 % 128;
            if (i14 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i15 = i2 & 7;
        int i16 = i2 | 7;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        int i18 = i17 % 2;
        r rVar = (r) obj;
        String str = this.g;
        String str2 = rVar.g;
        int i19 = a;
        int i20 = (-2) - (((i19 & 120) + (i19 | 120)) ^ (-1));
        b = i20 % 128;
        int i21 = i20 % 2;
        if (!str.equals(str2)) {
            int i22 = b;
            int i23 = i22 & 61;
            int i24 = ((((i22 ^ 61) | i23) << 1) - (~(-((i22 | 61) & (~i23))))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
        } else {
            int i26 = b + 39;
            a = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 63 / 0;
                if (this.h == rVar.h) {
                    if (this.j != rVar.j) {
                        z = true;
                    }
                }
            } else if (this.h == rVar.h) {
                if (this.j != rVar.j) {
                    z = true;
                }
            }
            int i28 = b;
            int i29 = i28 & 61;
            int i210 = ((((i28 ^ 61) | i29) << 1) - (~(-((i28 | 61) & (~i29))))) - 1;
            a = i210 % 128;
            int i211 = i210 % 2;
        }
        int i30 = a;
        int i31 = (i30 ^ 48) + ((i30 & 48) << 1);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        b = i32 % 128;
        int i33 = i32 % 2;
        return z;
    }
}
