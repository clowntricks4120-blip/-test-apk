package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class A extends O {
    private static int a = 1;
    private static int b;
    public byte[] c;

    public A(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.c = bArr;
        if (o(0)) {
            int i = a;
            int i2 = i & 27;
            int i3 = ((i | 27) & (~i2)) + (i2 << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            if (o(1)) {
                int i5 = a + 93;
                b = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        throw new IllegalArgumentException("illegal characters in UTCTime string");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-30)) | ((~i2) & 29)) - (~(-(-((i2 & 29) << 1))))) - 1;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = o2 instanceof A;
            throw null;
        }
        if (!(o2 instanceof A)) {
            int i4 = i2 + 103;
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 & 105;
            int i7 = (i2 | 105) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((A) o2).c;
        int i11 = (-2) - ((((i2 | 106) << 1) - (i2 ^ 106)) ^ (-1));
        b = i11 % 128;
        int i12 = i11 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i13 = a;
        int i14 = (((i13 | 82) << 1) - (i13 ^ 82)) - 1;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return zEquals;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 27) + (i2 | 27);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iH = j.h(this.c);
        int i5 = b;
        int i6 = i5 & 9;
        int i7 = ((i5 ^ 9) | i6) << 1;
        int i8 = -((i5 | 9) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        if (i9 % 2 != 0) {
            return iH;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = this.c;
        if (i6 != 0) {
            aVar.v(z, 40, bArr);
        } else {
            aVar.v(z, 23, bArr);
        }
        int i7 = a;
        int i8 = (i7 & 35) + (i7 | 35);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 119;
        int i4 = -(-((i2 & 119) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int length = this.c.length;
        int iB = az.b(length);
        int i7 = ((((iB | 1) << 1) - (iB ^ 1)) - (~(-(~length)))) - 2;
        int i8 = a + 35;
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 42) + ((i2 & 42) << 1)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r2
  0x0028: PHI (r2v5 byte[] A[IMMUTABLE_TYPE]) = (r2v4 byte[]), (r2v18 byte[]) binds: [B:8:0x0026, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean o(int i) {
        byte[] bArr;
        byte b2;
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = ((i5 | 55) << 1) - ((i5 & (-56)) | ((~i5) & 55));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            bArr = this.c;
            if (bArr.length > i) {
                b2 = bArr[i];
                if (b2 >= 48) {
                    i2 = (i5 & 35) + (i5 | 35);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                }
            }
            int i7 = b;
            int i8 = (i7 | 37) << 1;
            int i9 = -(((~i7) & 37) | (i7 & (-38)));
            i3 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i3 % 128;
            if (i3 % 2 == 0) {
                int i10 = 35 / 0;
            }
            return z;
        }
        bArr = this.c;
        int i11 = 28 / 0;
        if (bArr.length > i) {
            b2 = bArr[i];
            if (b2 >= 48) {
                i2 = (i5 & 35) + (i5 | 35);
                a = i2 % 128;
                if (i2 % 2 == 0 ? b2 <= 57 : b2 <= 21) {
                    int i12 = i5 & 35;
                    int i13 = (i5 | 35) & (~i12);
                    int i14 = -(-(i12 << 1));
                    int i15 = (i13 & i14) + (i14 | i13);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                }
            }
        }
        int i17 = b;
        int i18 = (i17 | 37) << 1;
        int i19 = -(((~i17) & 37) | (i17 & (-38)));
        i3 = (i18 ^ i19) + ((i19 & i18) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i110 = 35 / 0;
        }
        return z;
        int i20 = a;
        int i21 = (i20 & 87) + (i20 | 87);
        b = i21 % 128;
        int i22 = i21 % 2;
        z = false;
        int i111 = b;
        int i112 = (i111 | 37) << 1;
        int i113 = -(((~i111) & 37) | (i111 & (-38)));
        i3 = (i112 ^ i113) + ((i113 & i112) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            int i114 = 35 / 0;
        }
        return z;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 115;
        int i4 = i3 + ((i2 ^ 115) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        String strB = p.b(this.c);
        int i6 = b;
        int i7 = ((i6 ^ 64) + ((i6 & 64) << 1)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return strB;
    }
}
