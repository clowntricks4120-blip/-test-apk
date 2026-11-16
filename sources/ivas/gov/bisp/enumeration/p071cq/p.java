package ivas.gov.bisp.enumeration.p071cq;

import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class p extends c {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int b(byte[] bArr, int i) {
        long j;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (((i4 | 98) << 1) - (i4 ^ 98)) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        n();
        h.l(this.j, bArr, i);
        int i7 = a;
        int i8 = (i7 ^ 93) + ((i7 & 93) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i ^ 8;
        int i11 = (i & 8) << 1;
        h.l(this.i, bArr, (i10 ^ i11) + ((i10 & i11) << 1));
        int i12 = b;
        int i13 = i12 & 77;
        int i14 = -(-((i12 ^ 77) | i13));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i & 16;
        int i18 = (i ^ 16) | i17;
        h.l(this.k, bArr, (i17 ^ i18) + ((i17 & i18) << 1));
        long j2 = this.l;
        int i19 = b;
        int i20 = (i19 & 93) + (i19 | 93);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            h.l(j2, bArr, (((i & 81) | ((~i) & (-82))) - (~((i & (-82)) << 1))) - 1);
        } else {
            int i21 = i & 24;
            int i22 = ((i ^ 24) | i21) << 1;
            int i23 = -((~i21) & (i | 24));
            h.l(j2, bArr, ((i22 | i23) << 1) - (i22 ^ i23));
        }
        long j3 = this.d;
        int i24 = a;
        int i25 = ((i24 & (-74)) | ((~i24) & 73)) + ((i24 & 73) << 1);
        b = i25 % 128;
        int i26 = i25 % 2;
        h.l(j3, bArr, (i ^ 32) + ((i & 32) << 1));
        long j4 = this.m;
        int i27 = a;
        int i28 = i27 ^ 15;
        int i29 = ((i27 & 15) | i28) << 1;
        int i30 = -i28;
        int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
        b = i31 % 128;
        if (i31 % 2 != 0) {
            h.l(j4, bArr, i << 103);
            j = this.n;
            i2 = 88;
        } else {
            int i32 = i ^ 40;
            int i33 = ((i & 40) | i32) << 1;
            int i34 = -i32;
            h.l(j4, bArr, (i33 & i34) + (i34 | i33));
            j = this.n;
            i2 = 48;
        }
        int i35 = i & i2;
        int i36 = (i2 ^ i) | i35;
        h.l(j, bArr, (i35 ^ i36) + ((i36 & i35) << 1));
        long j5 = this.f90o;
        int i37 = (i & (-57)) | ((~i) & 56);
        int i38 = -(-((i & 56) << 1));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        int i40 = b;
        int i41 = i40 ^ 117;
        int i42 = ((((i40 & 117) | i41) << 1) - (~(-i41))) - 1;
        a = i42 % 128;
        int i43 = i42 % 2;
        h.l(j5, bArr, i39);
        q();
        int i44 = a;
        int i45 = ((i44 | 39) << 1) - (((~i44) & 39) | (i44 & (-40)));
        b = i45 % 128;
        if (i45 % 2 == 0) {
            return 64;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 43;
        int i4 = ((((i2 & 43) | i3) << 1) - (~(-i3))) - 1;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = ((i5 ^ 70) + ((i5 & 70) << 1)) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return "SHA-512";
    }

    @Override // ivas.gov.bisp.enumeration.p101x.i
    public int d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 63) << 1;
        int i4 = -(i2 ^ 63);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 89;
        int i9 = ((i6 ^ 89) | i8) << 1;
        int i10 = -((i6 | 89) & (~i8));
        int i11 = (i9 & i10) + (i10 | i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return 64;
    }

    @Override // ivas.gov.bisp.enumeration.p071cq.c
    public void q() {
        int i = 2 % 2;
        int i2 = b + 79;
        a = i2 % 128;
        int i3 = i2 % 2;
        super.q();
        this.j = 7640891576956012808L;
        int i4 = b;
        int i5 = i4 & 43;
        int i6 = -(-((i4 ^ 43) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        Object obj = null;
        this.i = -4942790177534073029L;
        this.k = 4354685564936845355L;
        if (i8 == 0) {
            throw null;
        }
        this.l = -6534734903238641935L;
        this.d = 5840696475078001361L;
        int i9 = b;
        int i10 = i9 & 123;
        int i11 = (((i9 ^ 123) | i10) << 1) - ((i9 | 123) & (~i10));
        a = i11 % 128;
        int i12 = i11 % 2;
        this.m = -7276294671716946913L;
        this.n = 2270897969802886507L;
        if (i12 == 0) {
            throw null;
        }
        this.f90o = 6620516959819538809L;
        int i13 = a;
        int i14 = i13 & 63;
        int i15 = (i13 ^ 63) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
