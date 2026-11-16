package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0277w extends O {
    private static int a = 0;
    private static int b = 1;
    public final byte[] c;

    public C0277w(byte[] bArr) {
        this.c = bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 104) << 1) - (i2 ^ 104)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (!(o2 instanceof C0277w)) {
            int i6 = i2 & 115;
            int i7 = (i2 ^ 115) | i6;
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (-2) - ((i2 + 64) ^ (-1));
            b = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 16 / 0;
            }
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((C0277w) o2).c;
        int i12 = ((i4 ^ 8) + ((i4 & 8) << 1)) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i14 = a + 49;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 17 / 0;
        }
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 19) + (i2 | 19);
        a = i3 % 128;
        int i4 = i3 % 2;
        int iH = j.h(this.c);
        int i5 = b + 87;
        a = i5 % 128;
        int i6 = i5 % 2;
        return iH;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = ((i2 ^ 93) | i3) << 1;
        int i5 = -((i2 | 93) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        aVar.v(z, 26, this.c);
        int i8 = a;
        int i9 = i8 ^ 11;
        int i10 = ((i8 & 11) | i9) << 1;
        int i11 = -i9;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 52) << 1) - (i2 ^ 52)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 != 0) {
            return (az.b(bArr.length) >> 1) >> this.c.length;
        }
        int iB = az.b(bArr.length);
        int i5 = (((iB ^ 1) | (iB & 1)) << 1) - (((~iB) & 1) | (iB & (-2)));
        int length = this.c.length;
        int i6 = i5 & length;
        return ((length ^ i5) | i6) + i6;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 79) | (i2 & 79)) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        int i8 = i6 & 7;
        int i9 = (i6 ^ 7) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public String toString() {
        String strB;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 == 0) {
            strB = p.b(bArr);
            int i5 = 20 / 0;
        } else {
            strB = p.b(bArr);
        }
        int i6 = a + 46;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        return strB;
    }
}
