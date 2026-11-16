package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0275u extends O {
    private static int a = 0;
    private static int b = 1;
    public byte[] c;

    public C0275u(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.c = bArr;
        if (o(0)) {
            int i = a;
            int i2 = (-2) - (((i ^ 12) + ((i & 12) << 1)) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            if (o(1)) {
                int i4 = b;
                int i5 = i4 & 47;
                int i6 = ((i4 | 47) & (~i5)) + (i5 << 1);
                a = i6 % 128;
                if (i6 % 2 == 0 ? o(2) : o(3)) {
                    int i7 = a + 17;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    if (o(3)) {
                        int i9 = a + 33;
                        b = i9 % 128;
                        int i10 = i9 % 2;
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (!(o2 instanceof C0275u)) {
            int i6 = (i4 ^ 51) + ((i4 & 51) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i4 | 9) << 1) - (i4 ^ 9);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((C0275u) o2).c;
        int i9 = (((i4 | 3) << 1) - (~(-(i4 ^ 3)))) - 1;
        a = i9 % 128;
        int i10 = i9 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i11 = b;
        int i12 = (((i11 ^ 55) | (i11 & 55)) << 1) - (((~i11) & 55) | (i11 & (-56)));
        a = i12 % 128;
        if (i12 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a + 45;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            j.h(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iH = j.h(this.c);
        int i3 = b;
        int i4 = i3 & 71;
        int i5 = (i3 | 71) & (~i4);
        int i6 = i4 << 1;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        a = i7 % 128;
        int i8 = i7 % 2;
        return iH;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = i3 + ((i2 ^ 81) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = this.c;
        if (i5 != 0) {
            aVar.v(z, 51, bArr);
        } else {
            aVar.v(z, 24, bArr);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 16) ^ (-1));
        b = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.c;
        if (i3 == 0) {
            int length = bArr.length;
            return (az.b(length) << 1) * length;
        }
        int length2 = bArr.length;
        int iB = az.b(length2);
        int i4 = (iB & 1) + (iB | 1);
        int i5 = -(-length2);
        int i6 = i4 & i5;
        int i7 = (i5 | i4) & (~i6);
        int i8 = -(-(i6 << 1));
        return (i7 ^ i8) + ((i7 & i8) << 1);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 25;
        int i4 = (((i2 & 25) | i3) << 1) - i3;
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        int i7 = ((i5 ^ 113) | (i5 & 113)) << 1;
        int i8 = -(((~i5) & 113) | (i5 & (-114)));
        int i9 = (i7 & i8) + (i7 | i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O m() {
        int i = 2 % 2;
        ad adVar = new ad(this.c);
        int i2 = a + 97;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return adVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public O n() {
        int i = 2 % 2;
        ad adVar = new ad(this.c);
        int i2 = b;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        return adVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r4
  0x002a: PHI (r4v5 byte[] A[IMMUTABLE_TYPE]) = (r4v4 byte[]), (r4v10 byte[]) binds: [B:8:0x0028, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean o(int i) {
        byte[] bArr;
        byte b2;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = (i4 & (-40)) | ((~i4) & 39);
        boolean z = true;
        int i6 = (i4 & 39) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 != 0) {
            bArr = this.c;
            if (bArr.length > i) {
                b2 = bArr[i];
                if (b2 >= 48) {
                    int i9 = i8 & 71;
                    int i10 = i8 | 71;
                    i2 = ((i9 | i10) << 1) - (i10 ^ i9);
                    int i11 = i2 % 128;
                    a = i11;
                    if (i2 % 2 != 0) {
                    }
                }
            }
            int i12 = b;
            int i13 = (i12 & 55) + (i12 | 55);
            a = i13 % 128;
            int i14 = i13 % 2;
            return z;
        }
        bArr = this.c;
        int i15 = 26 / 0;
        if (bArr.length > i) {
            b2 = bArr[i];
            if (b2 >= 48) {
                int i16 = i8 & 71;
                int i17 = i8 | 71;
                i2 = ((i16 | i17) << 1) - (i17 ^ i16);
                int i18 = i2 % 128;
                a = i18;
                if (i2 % 2 != 0 ? b2 <= 57 : b2 <= 15) {
                    int i19 = i18 & 3;
                    int i20 = -(-(i18 | 3));
                    int i21 = (i19 & i20) + (i19 | i20);
                    int i22 = i21 % 128;
                    b = i22;
                    int i23 = i21 % 2;
                    int i24 = i22 ^ 111;
                    int i25 = ((i22 & 111) | i24) << 1;
                    int i26 = -i24;
                    int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                    a = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        }
        int i110 = b;
        int i111 = (i110 & 55) + (i110 | 55);
        a = i111 % 128;
        int i112 = i111 % 2;
        return z;
        int i29 = a + 31;
        b = i29 % 128;
        int i30 = i29 % 2;
        z = false;
        int i113 = b;
        int i114 = (i113 & 55) + (i113 | 55);
        a = i114 % 128;
        int i115 = i114 % 2;
        return z;
    }
}
