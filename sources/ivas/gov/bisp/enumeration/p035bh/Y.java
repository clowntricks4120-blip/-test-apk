package ivas.gov.bisp.enumeration.p035bh;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends n {
    private static int a = 1;
    private static int b;
    public static final Y c = new Y();

    static {
        int i = b;
        int i2 = i & 77;
        int i3 = ((i ^ 77) | i2) << 1;
        int i4 = -((i | 77) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    @Deprecated
    public Y() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    public final boolean equals(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 79;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            int i5 = i2 & 29;
            int i6 = (~i5) & (i2 | 29);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            if (obj instanceof Y) {
                int i11 = (i2 & 123) + (i2 | 123);
                a = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                int i13 = i9 & 9;
                int i14 = -(-(i9 | 9));
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                int i16 = i15 % 128;
                b = i16;
                z = i15 % 2 != 0;
                int i17 = i16 + 121;
                a = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            int i19 = (i2 & 123) + (i2 | 123);
            a = i19 % 128;
            int i110 = i19 % 2;
            z = true;
        }
        int i20 = a;
        int i21 = i20 & 59;
        int i22 = (i20 | 59) & (~i21);
        int i23 = i21 << 1;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        b = i24 % 128;
        int i25 = i24 % 2;
        return z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Y.class.hashCode();
        int i5 = a;
        int i6 = i5 & 9;
        int i7 = (i6 - (~((i5 ^ 9) | i6))) - 1;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 64 / 0;
        }
        return iHashCode;
    }
}
