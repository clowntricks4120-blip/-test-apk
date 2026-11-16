package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class F extends O {
    private static int a = 1;
    private static int b;
    public final byte[] c;

    public F(byte[] bArr) {
        this.c = bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 53;
        int i4 = (((i2 ^ 53) | i3) << 1) - ((~i3) & (i2 | 53));
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        if (!(o2 instanceof F)) {
            int i7 = i2 ^ 67;
            int i8 = (((i2 & 67) | i7) << 1) - i7;
            b = i8 % 128;
            boolean z = i8 % 2 != 0;
            int i9 = i2 + 69;
            b = i9 % 128;
            int i10 = i9 % 2;
            return z;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((F) o2).c;
        int i11 = (-2) - (((i5 & 64) + (i5 | 64)) ^ (-1));
        a = i11 % 128;
        int i12 = i11 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i13 = a;
        int i14 = (i13 & (-46)) | ((~i13) & 45);
        int i15 = (i13 & 45) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 51;
        int i4 = (((i2 | 51) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.c;
        if (i5 == 0) {
            return j.h(bArr);
        }
        j.h(bArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.c;
        if (i6 != 0) {
            aVar.v(z, 98, bArr);
        } else {
            aVar.v(z, 18, bArr);
        }
        int i7 = b;
        int i8 = i7 & 39;
        int i9 = (i8 - (~((i7 ^ 39) | i8))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 111;
        int i5 = (i4 - (~((i3 ^ 111) | i4))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
        int iB = az.b(this.c.length) + 1;
        byte[] bArr = this.c;
        int i7 = a;
        int i8 = i7 & 77;
        int i9 = (~i8) & (i7 | 77);
        int i10 = i8 << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = -(-bArr.length);
        if (i12 != 0) {
            i = ((iB | i13) << 1) - (iB ^ i13);
        } else {
            int i14 = iB ^ i13;
            int i15 = -(-((iB & i13) << 1));
            i = (i14 & i15) + (i15 | i14);
        }
        int i16 = i7 + 97;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 6 / 0;
        }
        return i;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 121;
        int i4 = (((i2 & 121) | i3) << 1) - i3;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 33;
        int i7 = ((i2 | 33) & (~i6)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 99) << 1;
        int i4 = -(((~i2) & 99) | (i2 & (-100)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            p.b(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strB = p.b(this.c);
        int i6 = a;
        int i7 = i6 & 81;
        int i8 = (i6 | 81) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return strB;
    }
}
