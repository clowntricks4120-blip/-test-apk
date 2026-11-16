package ivas.gov.bisp.enumeration.aC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0042v implements ivas.gov.bisp.enumeration.aD.R.bcK {
    private static int a = 0;
    private static int b = 1;
    public static final EnumC0042v c;
    public static final EnumC0042v d;
    public static final EnumC0042v e;
    public static final EnumC0042v f;
    public static final EnumC0042v g;
    public static final /* synthetic */ EnumC0042v[] h;
    public final int i;

    static {
        EnumC0042v enumC0042v = new EnumC0042v("UNKNOWN_STATUS", 0, 0);
        c = enumC0042v;
        EnumC0042v enumC0042v2 = new EnumC0042v("ENABLED", 1, 1);
        d = enumC0042v2;
        EnumC0042v enumC0042v3 = new EnumC0042v("DISABLED", 2, 2);
        f = enumC0042v3;
        EnumC0042v enumC0042v4 = new EnumC0042v("DESTROYED", 3, 3);
        e = enumC0042v4;
        EnumC0042v enumC0042v5 = new EnumC0042v("UNRECOGNIZED", 4, -1);
        g = enumC0042v5;
        int i = a;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        b = i2 % 128;
        int i3 = i2 % 2;
        EnumC0042v[] enumC0042vArr = new EnumC0042v[5];
        enumC0042vArr[0] = enumC0042v;
        enumC0042vArr[1] = enumC0042v2;
        int i4 = ((i | 69) << 1) - (i ^ 69);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            enumC0042vArr[2] = enumC0042v3;
            enumC0042vArr[5] = enumC0042v4;
        } else {
            enumC0042vArr[2] = enumC0042v3;
            enumC0042vArr[3] = enumC0042v4;
        }
        enumC0042vArr[4] = enumC0042v5;
        h = enumC0042vArr;
        int i5 = i + 55;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
    }

    public EnumC0042v(String str, int i, int i2) {
        super(str, i);
        this.i = i2;
    }

    public static EnumC0042v valueOf(String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 99) << 1) - (~(-(((~i2) & 99) | (i2 & (-100)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        EnumC0042v enumC0042v = (EnumC0042v) Enum.valueOf(EnumC0042v.class, str);
        int i5 = b + 77;
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return enumC0042v;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumC0042v[] values() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 99) << 1) - (i2 ^ 99);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumC0042v[] enumC0042vArr = (EnumC0042v[]) h.clone();
        int i4 = b;
        int i5 = i4 & 113;
        int i6 = ((i4 ^ 113) | i5) << 1;
        int i7 = -((i4 | 113) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return enumC0042vArr;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.R.bcK
    public final int c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = (i3 - (~((i2 ^ 109) | i3))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (this == g) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i7 = i5 + 31;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return this.i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumC0042v d(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 77) << 1) - (i3 ^ 77);
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            EnumC0042v enumC0042v = c;
            int i6 = (i5 ^ 43) + ((i5 & 43) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return enumC0042v;
        }
        int i8 = (i3 & (-118)) | ((~i3) & 117);
        int i9 = -(-((i3 & 117) << 1));
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        if (i == 1) {
            EnumC0042v enumC0042v2 = d;
            int i13 = i3 & 71;
            int i14 = (((i3 | 71) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            return enumC0042v2;
        }
        int i16 = (i11 ^ 67) + ((i11 & 67) << 1);
        int i17 = i16 % 128;
        a = i17;
        int i18 = i16 % 2;
        if (i == 2) {
            EnumC0042v enumC0042v3 = f;
            int i19 = ((i11 & 50) + (i11 | 50)) - 1;
            a = i19 % 128;
            int i20 = i19 % 2;
            return enumC0042v3;
        }
        int i21 = (((i17 & (-44)) | ((~i17) & 43)) - (~(-(-((i17 & 43) << 1))))) - 1;
        int i22 = i21 % 128;
        b = i22;
        int i23 = i21 % 2;
        if (i == 3) {
            EnumC0042v enumC0042v4 = e;
            int i24 = (-2) - (((i17 ^ 78) + ((i17 & 78) << 1)) ^ (-1));
            b = i24 % 128;
            if (i24 % 2 != 0) {
                return enumC0042v4;
            }
            obj.hashCode();
            throw null;
        }
        int i25 = (i22 & 39) + (i22 | 39);
        a = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 81 / 0;
        }
        int i27 = i22 + 87;
        a = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 25 / 0;
        }
        return null;
    }
}
