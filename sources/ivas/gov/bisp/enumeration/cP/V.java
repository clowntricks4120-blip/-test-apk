package ivas.gov.bisp.enumeration.cP;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0242a {
    private static int a = 1;
    private static int b;
    public static final AbstractC0242a h = new V();

    static {
        int i = a;
        int i2 = ((i | 64) << 1) - (i ^ 64);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public V() {
        super("UTC");
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-60)) | ((~i2) & 59);
        int i4 = -(-((i2 & 59) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        boolean z = obj instanceof V;
        int i7 = (i2 & (-96)) | ((~i2) & 95);
        int i8 = -(-((i2 & 95) << 1));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final String m(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 67;
        int i4 = -(-((i2 ^ 67) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return "UTC";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int n(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 107;
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 62;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int o(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 101;
        int i4 = (i2 & 101) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = ((i6 ^ 6) + ((i6 & 6) << 1)) - 1;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int p(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i3 - (~((i2 ^ 45) | i3))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = i5 & 113;
        int i8 = -(-((i5 ^ 113) | i7));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 98 / 0;
        }
        return 0;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final boolean q() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (((i2 ^ 55) | i3) << 1) - ((i2 | 55) & (~i3));
        a = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final long r(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 111;
        int i4 = ((i2 & 111) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        int i8 = ((i2 ^ 31) - (~(-(-((i2 & 31) << 1))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final long s(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 97;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (i2 & 7) + (i2 | 7);
        b = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = (i2 ^ 47) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            this.g.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.g.hashCode();
        int i6 = b;
        int i7 = ((i6 | 103) << 1) - (i6 ^ 103);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 59 / 0;
        }
        return iHashCode;
    }
}
