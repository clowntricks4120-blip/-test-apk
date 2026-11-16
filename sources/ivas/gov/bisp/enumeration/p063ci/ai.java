package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ai extends O {
    private static int a = 1;
    private static int b;
    public final byte[] c;

    public ai(byte[] bArr) {
        this.c = bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 19;
        int i4 = ((((i2 & 19) | i3) << 1) - (~(-i3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        if (!(o2 instanceof ai)) {
            int i6 = ((i2 & 14) + (i2 | 14)) - 1;
            int i7 = i6 % 128;
            a = i7;
            int i8 = i6 % 2;
            int i9 = i7 | 55;
            int i10 = i9 << 1;
            int i11 = -(i9 & (~(i7 & 55)));
            int i12 = (i10 & i11) + (i11 | i10);
            b = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((ai) o2).c;
        int i14 = ((i2 & 4) + (i2 | 4)) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i16 = b;
        int i17 = ((i16 | 73) << 1) - (i16 ^ 73);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 96 / 0;
        }
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 31) - (~(i2 | 31))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 == 0) {
            return j.h(bArr);
        }
        j.h(bArr);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 125;
        int i4 = (i2 & 125) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        aVar.v(z, 22, this.c);
        int i7 = b + 9;
        a = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-18)) | ((~i2) & 17);
        int i4 = -(-((i2 & 17) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.c;
        int iB = i6 != 0 ? az.b(bArr.length) % 0 : (-2) - ((az.b(bArr.length) + 2) ^ (-1));
        int i7 = a;
        int i8 = i7 & 105;
        int i9 = ((i7 ^ 105) | i8) << 1;
        int i10 = -((~i8) & (i7 | 105));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        int length = this.c.length;
        int i13 = ((((iB ^ length) | (iB & length)) << 1) - (~(-(((~iB) & length) | ((~length) & iB))))) - 1;
        int i14 = ((i7 ^ 119) | (i7 & 119)) << 1;
        int i15 = -(((~i7) & 119) | (i7 & (-120)));
        int i16 = (i14 & i15) + (i14 | i15);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return i13;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 61;
        int i4 = (i2 | 61) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = i7 & 59;
        int i10 = -(-(i7 | 59));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        a = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 77;
        int i4 = -(-((i2 & 77) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return p.b(this.c);
        }
        p.b(this.c);
        throw null;
    }
}
