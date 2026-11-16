package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class i extends c {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int b(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-92)) | ((~i3) & 91);
        int i5 = -(-((i3 & 91) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        n();
        h.l(this.j, bArr, i);
        long j = this.i;
        int i8 = b;
        int i9 = i8 & 85;
        int i10 = i9 + ((i8 ^ 85) | i9);
        a = i10 % 128;
        int i11 = i10 % 2;
        h.l(j, bArr, i + 8);
        long j2 = this.k;
        int i12 = b;
        int i13 = i12 & 85;
        int i14 = (i12 | 85) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 & i15) + (i14 | i15);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = i | (-16);
            int i18 = i17 << 1;
            int i19 = -(i17 & (~(i & (-16))));
            h.l(j2, bArr, ((i18 | i19) << 1) - (i19 ^ i18));
            int i20 = i & (-118);
            h.l(this.l, bArr, (((i ^ (-118)) | i20) << 1) - ((~i20) & (i | (-118))));
        } else {
            int i21 = ((i ^ 16) | (i & 16)) << 1;
            int i22 = -((i & (-17)) | ((~i) & 16));
            h.l(j2, bArr, (i21 ^ i22) + ((i21 & i22) << 1));
            int i23 = i & 24;
            int i24 = i | 24;
            h.l(this.l, bArr, (i23 ^ i24) + ((i23 & i24) << 1));
        }
        long j3 = this.d;
        int i25 = i & 32;
        int i26 = (~i25) & (i | 32);
        int i27 = -(-(i25 << 1));
        h.l(j3, bArr, (i26 & i27) + (i27 | i26));
        long j4 = this.m;
        int i28 = a;
        int i29 = i28 & 85;
        int i30 = (((i28 | 85) & (~i29)) - (~(-(-(i29 << 1))))) - 1;
        b = i30 % 128;
        int i31 = i30 % 2;
        h.l(j4, bArr, ((i & (-41)) | ((~i) & 40)) + ((i & 40) << 1));
        q();
        int i32 = b;
        int i33 = (i32 ^ 59) + ((i32 & 59) << 1);
        a = i33 % 128;
        if (i33 % 2 == 0) {
            return 48;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public String c() {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return "SHA-384";
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 93;
        int i4 = ((i2 & 93) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        return i6 % 2 == 0 ? 3 : 48;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.c
    public void q() {
        int i = 2 % 2;
        int i2 = a + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.q();
        this.j = -3766243637369397544L;
        int i4 = a;
        int i5 = i4 & 23;
        int i6 = (i4 | 23) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        b = i8 % 128;
        int i9 = i8 % 2;
        this.i = 7105036623409894663L;
        if (i9 == 0) {
            throw null;
        }
        this.k = -7973340178411365097L;
        this.l = 1526699215303891257L;
        int i10 = b;
        int i11 = i10 ^ 69;
        int i12 = ((i10 & 69) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        a = i14 % 128;
        int i15 = i14 % 2;
        this.d = 7436329637833083697L;
        this.m = -8163818279084223215L;
        int i16 = a + 75;
        b = i16 % 128;
        int i17 = i16 % 2;
        this.n = -2662702644619276377L;
        int i18 = b;
        int i19 = i18 & 55;
        int i20 = (((i18 | 55) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
        this.f90o = 5167115440072839076L;
        int i22 = a + 43;
        b = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 1 / 0;
        }
    }
}
