package ivas.gov.bisp.enumeration.aC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements ivas.gov.bisp.enumeration.aD.R.bcK {
    private static int a = 1;
    private static int b;
    public static final /* synthetic */ Q[] c;
    public static final Q d;
    public static final Q e;
    public static final Q f;
    public static final Q g;
    public static final Q h;
    public static final Q i;
    public final int j;

    static {
        Q q = new Q("UNKNOWN_HASH", 0, 0);
        d = q;
        Q q2 = new Q("SHA1", 1, 1);
        e = q2;
        Q q3 = new Q("SHA384", 2, 2);
        g = q3;
        Q q4 = new Q("SHA256", 3, 3);
        f = q4;
        Q q5 = new Q("SHA512", 4, 4);
        h = q5;
        Q q6 = new Q("UNRECOGNIZED", 5, -1);
        int i2 = b;
        int i3 = (i2 & 11) + (i2 | 11);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        i = q6;
        Q[] qArr = new Q[6];
        qArr[0] = q;
        int i6 = i4 & 11;
        int i7 = ((i4 ^ 11) | i6) << 1;
        int i8 = -((~i6) & (i4 | 11));
        int i9 = (i7 & i8) + (i7 | i8);
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        qArr[1] = q2;
        qArr[2] = q3;
        qArr[3] = q4;
        int i12 = ((i10 & (-4)) | ((~i10) & 3)) + ((i10 & 3) << 1);
        int i13 = i12 % 128;
        a = i13;
        if (i12 % 2 == 0) {
            qArr[4] = q5;
            qArr[5] = q6;
        } else {
            qArr[4] = q5;
            qArr[5] = q6;
        }
        c = qArr;
        int i14 = ((i13 | 33) << 1) - (i13 ^ 33);
        b = i14 % 128;
        int i15 = i14 % 2;
    }

    public Q(String str, int i2, int i3) {
        super(str, i2);
        this.j = i3;
    }

    public static Q valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 55;
        int i5 = i4 + ((i3 ^ 55) | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return (Q) Enum.valueOf(Q.class, str);
        }
        throw null;
    }

    public static Q[] values() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 37;
        int i5 = (i3 & 37) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        Q[] qArr = (Q[]) c.clone();
        int i8 = b;
        int i9 = (-2) - (((i8 & 76) + (i8 | 76)) ^ (-1));
        a = i9 % 128;
        int i10 = i9 % 2;
        return qArr;
    }

    @Override // ivas.gov.bisp.enumeration.aD.R.bcK
    public final int c() {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 82) << 1) - (i3 ^ 82);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        if (this == i) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i8 = i6 & 105;
        int i9 = (i8 - (~((i6 ^ 105) | i8))) - 1;
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return this.j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Q d(int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 35;
        int i6 = (i4 & 35) << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        int i8 = i7 % 128;
        b = i8;
        int i9 = i7 % 2;
        if (i2 == 0) {
            Q q = d;
            int i10 = i8 & 107;
            int i11 = (((i8 ^ 107) | i10) << 1) - ((i8 | 107) & (~i10));
            a = i11 % 128;
            int i12 = i11 % 2;
            return q;
        }
        int i13 = i4 & 33;
        int i14 = (i13 - (~((i4 ^ 33) | i13))) - 1;
        int i15 = i14 % 128;
        b = i15;
        if (i14 % 2 == 0 ? i2 == 1 : i2 == 1) {
            Q q2 = e;
            int i16 = i4 + 107;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 91 / 0;
            }
            return q2;
        }
        if (i2 == 2) {
            Q q3 = g;
            int i18 = i4 & 73;
            int i19 = -(-((i4 ^ 73) | i18));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            b = i20 % 128;
            int i21 = i20 % 2;
            return q3;
        }
        int i22 = i15 & 113;
        int i23 = -(-(i15 | 113));
        int i24 = (i22 & i23) + (i22 | i23);
        int i25 = i24 % 128;
        a = i25;
        int i26 = i24 % 2;
        Object obj = null;
        if (i2 == 3) {
            Q q4 = f;
            int i27 = (i25 | 15) << 1;
            int i28 = -(((~i25) & 15) | (i25 & (-16)));
            int i29 = (i27 & i28) + (i28 | i27);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                return q4;
            }
            throw null;
        }
        int i30 = i15 & 101;
        int i31 = -(-((i15 ^ 101) | i30));
        int i32 = (i30 & i31) + (i30 | i31);
        int i33 = i32 % 128;
        a = i33;
        int i34 = i32 % 2;
        if (i2 == 4) {
            Q q5 = h;
            int i35 = (i33 & 43) + (i33 | 43);
            b = i35 % 128;
            if (i35 % 2 == 0) {
                return q5;
            }
            obj.hashCode();
            throw null;
        }
        int i36 = i33 & 7;
        int i37 = ((i33 ^ 7) | i36) << 1;
        int i38 = -((~i36) & (i33 | 7));
        int i39 = (i37 & i38) + (i37 | i38);
        b = i39 % 128;
        int i40 = i39 % 2;
        int i41 = i33 & 7;
        int i42 = (i41 - (~((i33 ^ 7) | i41))) - 1;
        b = i42 % 128;
        int i43 = i42 % 2;
        return null;
    }
}
