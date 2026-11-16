package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ah extends O {
    private static int a = 0;
    private static int b = 1;
    public byte[] c;

    public ah(byte[] bArr) {
        this.c = j.c(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 93;
        int i4 = (~i3) & (i2 | 93);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        if (i6 % 2 != 0) {
            boolean z = o2 instanceof ah;
            throw null;
        }
        if (!(o2 instanceof ah)) {
            int i8 = i7 ^ 17;
            int i9 = -(-((i7 & 17) << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((ah) o2).c;
        int i12 = i2 + 23;
        a = i12 % 128;
        int i13 = i12 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i14 = b;
        int i15 = ((i14 ^ 119) - (~(-(-((i14 & 119) << 1))))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iH = j.h(this.c);
        int i4 = b + 87;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return iH;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 95) << 1;
        int i4 = -(((~i2) & 95) | (i2 & (-96)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.c;
        if (i6 == 0) {
            aVar.v(z, 52, bArr);
        } else {
            aVar.v(z, 20, bArr);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = ((i2 | 119) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int iB = az.b(this.c.length);
        int i6 = (((iB & (-2)) | ((~iB) & 1)) - (~(-(-((iB & 1) << 1))))) - 1;
        byte[] bArr = this.c;
        int i7 = a;
        int i8 = (i7 ^ 93) + ((i7 & 93) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int length = bArr.length;
        if (i9 == 0) {
            int i10 = -length;
            return ((i6 | i10) << 1) - (i10 ^ i6);
        }
        int i11 = i6 ^ length;
        int i12 = ((length & i6) | i11) << 1;
        int i13 = -i11;
        return ((i12 | i13) << 1) - (i12 ^ i13);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b + 109;
        a = i2 % 128;
        return true ^ (i2 % 2 == 0);
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 23;
        int i4 = (i2 & 23) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        String strB = p.b(this.c);
        int i7 = b + 25;
        a = i7 % 128;
        int i8 = i7 % 2;
        return strB;
    }
}
