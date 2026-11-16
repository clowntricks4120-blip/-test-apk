package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class G extends AbstractC0272r {
    private static int a = 0;
    private static int b = 1;

    public G(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 57) << 1) - (~(-(i2 ^ 57)))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        byte b2 = (byte) this.e;
        byte[] bArr = this.d;
        int i5 = a;
        int i6 = (i5 & 3) + (i5 | 3);
        b = i6 % 128;
        int i7 = i6 % 2;
        aVar.s(z, 3, b2, bArr);
        int i8 = a;
        int i9 = ((i8 | 55) << 1) - (i8 ^ 55);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int iB;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 33;
        int i5 = -(-((i3 & 33) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        byte[] bArr = this.d;
        if (i7 == 0) {
            iB = az.b(bArr.length);
            i = 0;
        } else {
            int length = bArr.length;
            int i8 = length ^ 1;
            iB = az.b((((length & 1) | i8) << 1) - i8);
            i = 1;
        }
        int i9 = b;
        int i10 = (i9 & 103) + (i9 | 103);
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return (iB % i) % this.d.length;
        }
        int i11 = -(-i);
        int i12 = ((iB & i11) - (~(i11 | iB))) - 1;
        int i13 = -(-this.d.length);
        int i14 = ((~i13) & i12) | ((~i12) & i13);
        int i15 = -(-((i13 & i12) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 | 1;
        int i18 = i17 << 1;
        int i19 = -(i17 & (~(i16 & 1)));
        return (i18 ^ i19) + ((i19 & i18) << 1);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0272r, ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 91;
        int i4 = ((~i3) & (i2 | 91)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 53;
        int i7 = -(-((i2 ^ 53) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
