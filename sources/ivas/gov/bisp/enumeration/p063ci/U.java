package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class U extends O {
    private static int a = 0;
    private static int b = 1;
    public final byte[] c;

    public U(byte[] bArr) {
        this.c = bArr;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = ((((i2 ^ 81) | i3) << 1) - (~(-((~i3) & (i2 | 81))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            boolean z = o2 instanceof U;
            obj.hashCode();
            throw null;
        }
        if (!(o2 instanceof U)) {
            int i6 = (i2 & 51) + (i2 | 51);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((U) o2).c;
        int i7 = (i5 ^ 103) + ((i5 & 103) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i9 = a;
        int i10 = i9 & 1;
        int i11 = (i10 - (~((i9 ^ 1) | i10))) - 1;
        b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 94 / 0;
        }
        return zEquals;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 55;
        int i4 = (i2 ^ 55) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iH = j.h(this.c);
        int i7 = b + 45;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return iH;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = b + 25;
        a = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.c;
        if (i3 != 0) {
            aVar.v(z, 78, bArr);
        } else {
            aVar.v(z, 27, bArr);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int iB;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 3;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 3)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        byte[] bArr = this.c;
        if (i7 != 0) {
            iB = az.b(bArr.length) + 1;
        } else {
            int iB2 = az.b(bArr.length);
            int i8 = iB2 & 1;
            int i9 = (iB2 | 1) & (~i8);
            int i10 = i8 << 1;
            iB = ((i9 & i10) << 1) + (i9 ^ i10);
        }
        int i11 = a;
        int i12 = i11 & 39;
        int i13 = -(-((i11 ^ 39) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        b = i15;
        int i16 = i14 % 2;
        int i17 = (-2) - ((iB - (~this.c.length)) ^ (-1));
        int i18 = i15 & 77;
        int i19 = (((i15 | 77) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
        a = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 79 / 0;
        }
        return i17;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 97;
        int i4 = ((i2 & 97) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        int i9 = (i7 ^ 116) + ((i7 & 116) << 1);
        int i10 = (i9 ^ (-1)) + (i9 << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public String toString() {
        String strB;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 15) + (i2 | 15);
        a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 != 0) {
            strB = p.b(bArr);
            int i5 = 78 / 0;
        } else {
            strB = p.b(bArr);
        }
        int i6 = a;
        int i7 = (i6 & (-56)) | ((~i6) & 55);
        int i8 = (i6 & 55) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return strB;
        }
        throw null;
    }
}
