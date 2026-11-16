package ivas.gov.bisp.enumeration.bU;

/* JADX INFO: loaded from: classes.dex */
public final class z extends i {
    private static int a = 1;
    private static int b;
    public static final z f = new z(1, 0);
    public static final z g = null;

    static {
        int i = b + 7;
        a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public z(int i, int i2) {
        super(i, i2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    @Override // ivas.gov.bisp.enumeration.bU.i
    public final boolean equals(Object obj) {
        boolean z;
        int i;
        z zVar;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 73) << 1) - (i4 ^ 73);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (!(!(obj instanceof z))) {
            int i8 = i6 ^ 43;
            int i9 = (i6 & 43) << 1;
            int i10 = (i8 & i9) + (i9 | i8);
            a = i10 % 128;
            int i11 = i10 % 2;
            if (isEmpty()) {
                int i12 = b + 81;
                a = i12 % 128;
                int i13 = i12 % 2;
                if (!((z) obj).isEmpty()) {
                    i = this.c;
                    zVar = (z) obj;
                    int i14 = b;
                    int i15 = i14 & 17;
                    int i16 = (i14 | 17) & (~i15);
                    int i17 = -(-(i15 << 1));
                    i2 = (i16 ^ i17) + ((i16 & i17) << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i18 = 66 / 0;
                        if (i == zVar.c) {
                            if (this.d == zVar.d) {
                            }
                        }
                    } else if (i == zVar.c) {
                        if (this.d == zVar.d) {
                        }
                    }
                    int i19 = b;
                    int i20 = i19 & 37;
                    int i21 = (i19 ^ 37) | i20;
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    z = false;
                }
                int i24 = a;
                int i25 = ((((i24 ^ 9) | (i24 & 9)) << 1) - (~(-(((~i24) & 9) | (i24 & (-10)))))) - 1;
                b = i25 % 128;
                int i26 = i25 % 2;
                z = true;
            } else {
                i = this.c;
                zVar = (z) obj;
                int i110 = b;
                int i111 = i110 & 17;
                int i112 = (i110 | 17) & (~i111);
                int i113 = -(-(i111 << 1));
                i2 = (i112 ^ i113) + ((i112 & i113) << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    int i114 = 66 / 0;
                    if (i == zVar.c) {
                        if (this.d == zVar.d) {
                            int i27 = a;
                            int i28 = ((((i27 ^ 9) | (i27 & 9)) << 1) - (~(-(((~i27) & 9) | (i27 & (-10)))))) - 1;
                            b = i28 % 128;
                            int i29 = i28 % 2;
                            z = true;
                        }
                    }
                } else if (i == zVar.c) {
                    if (this.d == zVar.d) {
                        int i210 = a;
                        int i211 = ((((i210 ^ 9) | (i210 & 9)) << 1) - (~(-(((~i210) & 9) | (i210 & (-10)))))) - 1;
                        b = i211 % 128;
                        int i212 = i211 % 2;
                        z = true;
                    }
                }
                int i115 = b;
                int i213 = i115 & 37;
                int i214 = (i115 ^ 37) | i213;
                int i215 = ((i213 | i214) << 1) - (i214 ^ i213);
                a = i215 % 128;
                int i216 = i215 % 2;
                z = false;
            }
        } else {
            int i116 = b;
            int i217 = i116 & 37;
            int i218 = (i116 ^ 37) | i217;
            int i219 = ((i217 | i218) << 1) - (i218 ^ i217);
            a = i219 % 128;
            int i2110 = i219 % 2;
            z = false;
        }
        int i30 = b;
        int i31 = i30 & 15;
        int i32 = (i30 | 15) & (~i31);
        int i33 = -(-(i31 << 1));
        int i34 = (i32 & i33) + (i32 | i33);
        a = i34 % 128;
        if (i34 % 2 == 0) {
            int i35 = 98 / 0;
        }
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.bU.i
    public final boolean isEmpty() {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 63) | (i2 & 63)) << 1;
        int i4 = -(((~i2) & 63) | (i2 & (-64)));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = this.c;
            int i7 = this.d;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.c > this.d) {
            int i8 = a;
            int i9 = i8 & 85;
            int i10 = i8 | 85;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            int i13 = a;
            int i14 = i13 ^ 63;
            int i15 = ((i13 & 63) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            z = false;
        }
        int i19 = b;
        int i20 = i19 & 79;
        int i21 = (i19 ^ 79) | i20;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.bU.i
    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 47;
        int i5 = (i4 - (~(-(-((i3 ^ 47) | i4))))) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            isEmpty();
            obj.hashCode();
            throw null;
        }
        if (isEmpty()) {
            int i6 = a;
            int i7 = ((i6 & 69) - (~(-(-(i6 | 69))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            i = -1;
        } else {
            int i9 = this.c * 31;
            int i10 = -(-this.d);
            int i11 = i9 & i10;
            int i12 = (i9 ^ i10) | i11;
            i = ((i11 | i12) << 1) - (i12 ^ i11);
            int i13 = a;
            int i14 = (((i13 & (-66)) | ((~i13) & 65)) - (~(-(-((i13 & 65) << 1))))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = b;
        int i17 = i16 & 47;
        int i18 = -(-((i16 ^ 47) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        a = i19 % 128;
        if (i19 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.bU.i
    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = this.c;
        int i3 = b;
        int i4 = i3 ^ 69;
        int i5 = ((i3 & 69) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        sb.append(i2);
        sb.append("..");
        int i9 = a + 25;
        b = i9 % 128;
        int i10 = i9 % 2;
        sb.append(this.d);
        String string = sb.toString();
        int i11 = a;
        int i12 = i11 ^ 29;
        int i13 = (((i11 & 29) | i12) << 1) - i12;
        b = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }
}
