package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class E extends O {
    private static int a = 1;
    private static int b;
    public final byte[] c;

    public E(byte[] bArr) {
        this.c = j.c(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            boolean z = o2 instanceof E;
            throw null;
        }
        if (!(o2 instanceof E)) {
            int i7 = i2 & 119;
            int i8 = -(-((i2 ^ 119) | i7));
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((E) o2).c;
        int i11 = i6 & 7;
        int i12 = (i11 - (~(-(-((i6 ^ 7) | i11))))) - 1;
        b = i12 % 128;
        int i13 = i12 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i14 = a + 45;
        b = i14 % 128;
        int i15 = i14 % 2;
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 123;
        int i4 = (i2 ^ 123) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        int iH = j.h(this.c);
        int i7 = b;
        int i8 = i7 ^ 79;
        int i9 = (i7 & 79) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return iH;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.c;
        if (i3 != 0) {
            aVar.v(z, 92, bArr);
        } else {
            aVar.v(z, 25, bArr);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 25) << 1) - (i3 ^ 25);
        a = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.c;
        if (i5 == 0) {
            int iB = az.b(bArr.length);
            i = (-2) - (((iB & 2) + (iB | 2)) ^ (-1));
        } else {
            int iB2 = az.b(bArr.length);
            int i6 = iB2 & 1;
            int i7 = (iB2 ^ 1) | i6;
            i = ((i6 | i7) << 1) - (i7 ^ i6);
        }
        byte[] bArr2 = this.c;
        int i8 = a;
        int i9 = (-2) - ((((i8 | 6) << 1) - (i8 ^ 6)) ^ (-1));
        b = i9 % 128;
        int i10 = i9 % 2;
        int length = bArr2.length;
        if (i10 != 0) {
            return i * length;
        }
        int i11 = i & length;
        return (i11 - (~((length ^ i) | i11))) - 1;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 43;
        int i4 = (i2 & 43) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 & 75;
        int i8 = ((((i2 ^ 75) | i7) << 1) - (~(-((i2 | 75) & (~i7))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
