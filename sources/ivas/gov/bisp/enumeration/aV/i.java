package ivas.gov.bisp.enumeration.aV;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static int a = 0;
    private static int b = 1;

    public static int b(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 103;
        int i6 = ((i4 & 103) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = i8 % 128;
        b = i9;
        Object obj = null;
        if (i8 % 2 != 0 ? i >= 3 : i >= 4) {
            if (i >= 1073741824) {
                int i10 = (i4 & 91) + (i4 | 91);
                b = i10 % 128;
                if (i10 % 2 != 0) {
                    return Integer.MAX_VALUE;
                }
                throw null;
            }
            int i11 = i4 + 35;
            int i12 = i11 % 128;
            b = i12;
            float f = i / 0.75f;
            int i13 = (int) (i11 % 2 == 0 ? f % 1.0f : f + 1.0f);
            int i14 = ((i12 ^ 61) | (i12 & 61)) << 1;
            int i15 = -(((~i12) & 61) | (i12 & (-62)));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            a = i16 % 128;
            if (i16 % 2 == 0) {
                return i13;
            }
            throw null;
        }
        int i17 = i9 ^ 15;
        int i18 = -(-((i9 & 15) << 1));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        int i20 = i19 % 128;
        a = i20;
        int i21 = i19 % 2;
        if (i < 0) {
            StringBuilder sb = new StringBuilder(52);
            int i22 = b;
            int i23 = i22 & 1;
            int i24 = (i22 | 1) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            a = i26 % 128;
            int i27 = i26 % 2;
            sb.append("expectedSize");
            sb.append(" cannot be negative but was: ");
            if (i27 != 0) {
                obj.hashCode();
                throw null;
            }
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i28 = i20 & 97;
        int i29 = ((i20 ^ 97) | i28) << 1;
        int i30 = -((i20 | 97) & (~i28));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        int i32 = i31 % 128;
        b = i32;
        if (i31 % 2 == 0) {
            i2 = (-2) - (~i);
        } else {
            int i33 = i & 1;
            i2 = ((i ^ 1) | i33) + i33;
        }
        int i34 = i32 & 107;
        int i35 = (i32 | 107) & (~i34);
        int i36 = i34 << 1;
        int i37 = (i35 & i36) + (i35 | i36);
        a = i37 % 128;
        if (i37 % 2 == 0) {
            return i2;
        }
        throw null;
    }
}
