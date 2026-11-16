package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements Z {
    private static int a = 0;
    private static int b = 1;
    public final aa c;
    public final String d;
    public final Object[] e;
    public final int f;

    public ac(aa aaVar, String str, Object[] objArr) {
        char cCharAt;
        this.c = aaVar;
        this.d = str;
        this.e = objArr;
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 < 55296) {
            this.f = cCharAt2;
            int i = b;
            int i2 = i & 101;
            int i3 = -(-((i ^ 101) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
                return;
            }
            return;
        }
        int i6 = cCharAt2 & 8191;
        int i7 = b;
        int i8 = ((i7 & (-20)) | ((~i7) & 19)) + ((i7 & 19) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 2 % 2;
        }
        int i10 = 13;
        int i11 = 1;
        while (true) {
            cCharAt = str.charAt(i11);
            if (cCharAt < 55296) {
                break;
            }
            int i12 = b;
            int i13 = ((i12 ^ 26) + ((i12 & 26) << 1)) - 1;
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = (cCharAt & 8191) << i10;
            int i17 = ((~i16) & i6) | ((~i6) & i16);
            int i18 = i6 & i16;
            i6 = (i18 & i17) | (i17 ^ i18);
            int i19 = ((((i10 ^ 123) | (i10 & 123)) << 1) - (~(-(((~i10) & 123) | (i10 & (-124)))))) - 1;
            i10 = ((i19 ^ (-110)) - (~(-(-((i19 & (-110)) << 1))))) - 1;
            int i20 = (i14 & 98) + (i14 | 98);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            int i22 = i21 % 128;
            b = i22;
            if (i21 % 2 == 0) {
                i11 = (i11 ^ (-35)) + ((i11 & (-35)) << 1) + 43;
            } else {
                int i23 = ((i11 ^ 1) | (i11 & 1)) << 1;
                int i24 = -(((~i11) & 1) | (i11 & (-2)));
                i11 = (i23 & i24) + (i24 | i23);
            }
            int i25 = (((i22 | 72) << 1) - (i22 ^ 72)) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
            int i27 = 2 % 2;
        }
        int i28 = cCharAt << i10;
        this.f = (i6 & i28) | (i6 ^ i28);
        int i29 = a;
        int i30 = i29 ^ 91;
        int i31 = ((((i29 & 91) | i30) << 1) - (~(-i30))) - 1;
        b = i31 % 128;
        if (i31 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.Z
    public final int b() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 37;
        int i4 = 1;
        int i5 = -(-((i2 & 37) << 1));
        int i6 = (i3 ^ i5) + ((i3 & i5) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0 || (this.f & 1) != 1) {
            int i7 = ((i2 ^ 58) + ((i2 & 58) << 1)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            i4 = 2;
        }
        int i9 = i2 + 29;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.Z
    public final boolean c() {
        int i = 2 % 2;
        int i2 = a;
        boolean z = true;
        int i3 = ((i2 | 34) << 1) - (i2 ^ 34);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if ((this.f & 2) == 2) {
            int i7 = ((i5 | 38) << 1) - (i5 ^ 38);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((i5 & (-24)) | ((~i5) & 23)) + ((i5 & 23) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i2 & 89;
            int i13 = i2 | 89;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            b = i14 % 128;
            int i15 = i14 % 2;
            z = false;
        }
        int i16 = a;
        int i17 = i16 & 123;
        int i18 = (i16 ^ 123) | i17;
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        int i20 = i19 % 2;
        return z;
    }

    @Override // ivas.gov.bisp.enumeration.aD.Z
    public final aa e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 55;
        int i4 = -(-((i2 & 55) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        aa aaVar = this.c;
        int i7 = i2 & 113;
        int i8 = (i2 ^ 113) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return aaVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
