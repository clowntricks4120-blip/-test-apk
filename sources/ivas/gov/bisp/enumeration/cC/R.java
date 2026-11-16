package ivas.gov.bisp.enumeration.cC;

import ivas.gov.bisp.enumeration.p064cj.h;

/* JADX INFO: loaded from: classes.dex */
public final class R extends ivas.gov.bisp.enumeration.cA.u implements h {
    private static int a = 0x00000000;
    private static int b = 0x00000001;
    public final int T;
    public final S U;
    public final byte[] V;
    public final byte[] W;

    public static class bDk {
        public final S a;
        public byte[] b = null;
        public byte[] c = null;
        public byte[] d = null;

        public bDk(S s) {
            this.a = s;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public R(bDk bdk, bDj bdj) {
        S s = bdk.a;
        super(false, s.h, 1);
        this.U = s;
        int i = s.j;
        byte[] bArr = bdk.d;
        Object obj = null;
        if (bArr != null) {
            if (bArr.length == (i ^ i) + ((i & i) << 1)) {
                int i2 = a;
                int i3 = i2 & 105;
                int i4 = -(-((i2 ^ 105) | i3));
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                b = i5 % 128;
                int i6 = i5 % 2;
                this.T = 0;
                this.V = i6 == 0 ? v.g(bArr, 1, i) : v.g(bArr, 0, i);
                byte[] bArrG = v.g(bArr, i, i);
                int i7 = b;
                int i8 = ((i7 | 55) << 1) - (i7 ^ 55);
                int i9 = i8 % 128;
                a = i9;
                if (i8 % 2 != 0) {
                    this.W = bArrG;
                    throw null;
                }
                this.W = bArrG;
                int i10 = ((i9 | 65) << 1) - (i9 ^ 65);
                b = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = i + 4;
            int i13 = i12 & i;
            if (bArr.length != i13 + ((i12 ^ i) | i13)) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            int i14 = b;
            int i15 = i14 & 51;
            int i16 = (i15 - (~(-(-((i14 ^ 51) | i15))))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            this.T = ivas.gov.bisp.enumeration.p096p.h.e(bArr, 0);
            int i18 = a;
            int i19 = i18 & 99;
            int i20 = (i18 | 99) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 & i21) + (i20 | i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            this.V = v.g(bArr, 4, i);
            int i24 = b + 79;
            a = i24 % 128;
            int i25 = i24 % 2;
            this.W = v.g(bArr, i12, i);
            int i26 = a + 89;
            b = i26 % 128;
            int i27 = i26 % 2;
            return;
        }
        T t = s.d;
        if (t != null) {
            int i28 = a;
            int i29 = (i28 & (-110)) | ((~i28) & 109);
            int i30 = (i28 & 109) << 1;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            b = i31 % 128;
            if (i31 % 2 == 0) {
                this.T = t.b();
                throw null;
            }
            this.T = t.b();
            int i32 = b;
            int i33 = ((i32 | 15) << 1) - (i32 ^ 15);
            a = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 4 % 5;
            } else {
                int i35 = 2 % 2;
            }
        } else {
            this.T = 0;
            int i36 = a;
            int i37 = (i36 ^ 69) + ((i36 & 69) << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 2 % 2;
        }
        byte[] bArr2 = bdk.b;
        if (bArr2 != null) {
            int i40 = b;
            int i41 = ((i40 ^ 84) + ((i40 & 84) << 1)) - 1;
            int i42 = i41 % 128;
            a = i42;
            int i43 = i41 % 2;
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            int i44 = i42 & 11;
            int i45 = ((i42 ^ 11) | i44) << 1;
            int i46 = -((~i44) & (i42 | 11));
            int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
            b = i47 % 128;
            int i48 = i47 % 2;
            this.V = bArr2;
            int i49 = i42 & 113;
            int i50 = (((i42 | 113) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
            b = i50 % 128;
            if (i50 % 2 != 0) {
                int i51 = 2 % 2;
            }
        } else {
            this.V = new byte[i];
            int i52 = a;
            int i53 = i52 ^ 5;
            int i54 = ((i52 & 5) | i53) << 1;
            int i55 = -i53;
            int i56 = (i54 & i55) + (i54 | i55);
            b = i56 % 128;
            int i57 = i56 % 2;
            int i58 = 2 % 2;
        }
        byte[] bArr3 = bdk.c;
        if (bArr3 == null) {
            this.W = new byte[i];
            int i59 = a;
            int i60 = (i59 & (-102)) | ((~i59) & 101);
            int i61 = -(-((i59 & 101) << 1));
            int i62 = (i60 & i61) + (i61 | i60);
            b = i62 % 128;
            int i63 = i62 % 2;
            return;
        }
        int i64 = a;
        int i65 = i64 & 107;
        int i66 = -(-((i64 ^ 107) | i65));
        int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
        b = i67 % 128;
        int i68 = i67 % 2;
        if (bArr3.length != i) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        }
        int i69 = i64 & 87;
        int i70 = i69 + ((i64 ^ 87) | i69);
        int i71 = i70 % 128;
        b = i71;
        int i72 = i70 % 2;
        this.W = bArr3;
        int i73 = (((i71 & (-78)) | ((~i71) & 77)) - (~(-(-((i71 & 77) << 1))))) - 1;
        a = i73 % 128;
        if (i73 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p064cj.h
    public final byte[] getEncoded() {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = a + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.U.j;
        int i5 = this.T;
        int i6 = b;
        int i7 = i6 & 57;
        int i8 = (i6 ^ 57) | i7;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = i9 % 128;
        a = i10;
        if (i9 % 2 != 0) {
            throw null;
        }
        int i11 = 0;
        if (i5 != 0) {
            int i12 = (i10 ^ 15) + ((i10 & 15) << 1);
            b = i12 % 128;
            if (i12 % 2 == 0) {
                bArr = new byte[(i4 >>> 4) >>> i4];
            } else {
                int i13 = i4 & 4;
                int i14 = -(-((i4 ^ 4) | i13));
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                int i16 = ((~i4) & i15) | ((~i15) & i4);
                int i17 = (i15 & i4) << 1;
                bArr = new byte[(i16 & i17) + (i16 | i17)];
            }
            int i18 = (i10 ^ 59) + ((i10 & 59) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            ivas.gov.bisp.enumeration.p096p.h.i(i5, bArr, 0);
            int i20 = a;
            int i21 = (i20 & 55) + (i20 | 55);
            b = i21 % 128;
            int i22 = i21 % 2;
            i11 = 4;
        } else {
            int i23 = i4 & i4;
            int i24 = ((i4 ^ i4) | i23) << 1;
            int i25 = -((~i23) & (i4 | i4));
            byte[] bArr2 = new byte[(i24 & i25) + (i24 | i25)];
            int i26 = (i6 & 5) + (i6 | 5);
            a = i26 % 128;
            int i27 = i26 % 2;
            bArr = bArr2;
        }
        v.f(bArr, this.V, i11);
        byte[] bArr3 = this.W;
        int i28 = b;
        int i29 = ((i28 & (-62)) | ((~i28) & 61)) + ((i28 & 61) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
        v.f(bArr, bArr3, ((i11 | i4) << 1) - (i4 ^ i11));
        int i31 = b;
        int i32 = (((i31 | 58) << 1) - (i31 ^ 58)) - 1;
        a = i32 % 128;
        int i33 = i32 % 2;
        return bArr;
    }
}
