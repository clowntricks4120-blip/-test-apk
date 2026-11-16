package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;

/* JADX INFO: loaded from: classes.dex */
public class B extends M {
    private static int a = 1;
    private static int b;

    public B(i iVar) {
        super(iVar.f().g("DER"));
    }

    public B(byte[] bArr) {
        super(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        aVar.v(z, 4, this.c);
        int i4 = a;
        int i5 = (i4 & 19) + (i4 | 19);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int iB;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 113) | (i2 & 113)) << 1;
        int i4 = -(((~i2) & 113) | (i2 & (-114)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.c;
        if (i6 != 0) {
            iB = az.b(bArr.length);
        } else {
            int iB2 = az.b(bArr.length);
            int i7 = iB2 ^ 1;
            int i8 = -(-((iB2 & 1) << 1));
            iB = ((i7 | i8) << 1) - (i8 ^ i7);
        }
        int i9 = b;
        int i10 = i9 & 121;
        int i11 = -(-(i9 | 121));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = -(-this.c.length);
        int i15 = (((~i14) & iB) | ((~iB) & i14)) + ((iB & i14) << 1);
        int i16 = a;
        int i17 = i16 & 85;
        int i18 = ((i16 ^ 85) | i17) << 1;
        int i19 = -((i16 | 85) & (~i17));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        return i15;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 121) << 1;
        int i4 = -(i2 ^ 121);
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 113;
        int i9 = i6 | 113;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.M, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 79) | (i2 & 79)) << 1) - (((~i2) & 79) | (i2 & (-80)));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 105;
        int i7 = -(-(i4 | 105));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        return this;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.M, ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 44) + (i2 | 44)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = i2 + 81;
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
