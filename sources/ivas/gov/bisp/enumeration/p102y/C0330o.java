package ivas.gov.bisp.enumeration.p102y;

import java.math.BigDecimal;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0330o extends Number {
    private static int a = 1;
    private static int b;
    public final String c;

    public C0330o(String str) {
        this.c = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = -(-((i2 & 1) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        double d = Double.parseDouble(this.c);
        int i7 = a;
        int i8 = i7 & 27;
        int i9 = (((i7 ^ 27) | i8) << 1) - ((i7 | 27) & (~i8));
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return d;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    public final boolean equals(Object obj) {
        String str;
        String str2;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-106)) | ((~i3) & 105)) + ((i3 & 105) << 1);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean z2 = false;
        if (this == obj) {
            int i6 = ((i3 ^ 2) + ((i3 & 2) << 1)) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 38 / 0;
            }
            return true;
        }
        if (!(obj instanceof C0330o)) {
            int i8 = i5 | 109;
            int i9 = ((i8 << 1) - (~(-(i8 & (~(i5 & 109)))))) - 1;
            a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 87 / 0;
            }
            return false;
        }
        int i11 = (i5 ^ 3) + ((i5 & 3) << 1);
        int i12 = i11 % 128;
        a = i12;
        if (i11 % 2 == 0) {
            str = this.c;
            str2 = ((C0330o) obj).c;
            z = false;
        } else {
            str = this.c;
            str2 = ((C0330o) obj).c;
            z = true;
        }
        int i13 = i12 & 57;
        int i14 = ((i12 ^ 57) | i13) << 1;
        int i15 = -((~i13) & (i12 | 57));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 17 / 0;
            if (str != str2) {
                int i18 = ((i12 ^ 11) - (~(-(-((i12 & 11) << 1))))) - 1;
                b = i18 % 128;
                int i19 = i18 % 2;
                if (str.equals(str2)) {
                    int i20 = a;
                    int i21 = i20 & 1;
                    int i22 = (i20 ^ 1) | i21;
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    z2 = true;
                } else {
                    i = (-2) - ((b + 94) ^ (-1));
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i25 = 4 % 2;
                    }
                }
            } else {
                z2 = z;
            }
        } else if (str != str2) {
            int i110 = ((i12 ^ 11) - (~(-(-((i12 & 11) << 1))))) - 1;
            b = i110 % 128;
            int i111 = i110 % 2;
            if (str.equals(str2)) {
                int i26 = a;
                int i27 = i26 & 1;
                int i28 = (i26 ^ 1) | i27;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i29 % 128;
                int i210 = i29 % 2;
                z2 = true;
            } else {
                i = (-2) - ((b + 94) ^ (-1));
                a = i % 128;
                if (i % 2 == 0) {
                    int i211 = 4 % 2;
                }
            }
        } else {
            z2 = z;
        }
        int i30 = a;
        int i31 = ((i30 & 69) - (~(i30 | 69))) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
        return z2;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 41;
        int i4 = i2 | 41;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        float f = Float.parseFloat(this.c);
        int i7 = a;
        int i8 = i7 ^ 109;
        int i9 = -(-((i7 & 109) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        return f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a + 79;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.c.hashCode();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return iHashCode;
    }

    @Override // java.lang.Number
    public final long longValue() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        a = i3 % 128;
        int i4 = i3 % 2;
        try {
            long j = Long.parseLong(this.c);
            int i5 = a;
            int i6 = i5 & 79;
            int i7 = (((i5 ^ 79) | i6) << 1) - ((i5 | 79) & (~i6));
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.c).longValue();
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = a + 25;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.c;
        int i4 = (i3 ^ 73) + ((i3 & 73) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 35;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 35)) & i3)))) - 1;
        b = i4 % 128;
        try {
            try {
                if (i4 % 2 == 0) {
                    return Integer.parseInt(this.c);
                }
                Integer.parseInt(this.c);
                throw null;
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.c).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.c);
        }
    }
}
