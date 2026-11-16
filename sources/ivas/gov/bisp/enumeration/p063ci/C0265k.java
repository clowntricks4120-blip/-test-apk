package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;
import java.util.Arrays;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0265k extends O {
    private static int a = 0;
    private static int b = 1;
    public final byte[] c;

    public C0265k(byte[] bArr) {
        this.c = j.c(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 106) + ((i2 & 106) << 1)) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        if (!(o2 instanceof C0265k)) {
            int i5 = i2 & 105;
            int i6 = (i2 ^ 105) | i5;
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            return i7 % 2 != 0;
        }
        byte[] bArr = this.c;
        byte[] bArr2 = ((C0265k) o2).c;
        int i8 = i2 + 115;
        a = i8 % 128;
        int i9 = i8 % 2;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        int i10 = b + 69;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 56) << 1) - (i2 ^ 56)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.c;
        if (i4 != 0) {
            return j.h(bArr);
        }
        j.h(bArr);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = (i2 | 23) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        byte[] bArr = this.c;
        if (i7 == 0) {
            aVar.v(z, 121, bArr);
        } else {
            aVar.v(z, 21, bArr);
        }
        int i8 = a;
        int i9 = ((i8 ^ 31) - (~(-(-((i8 & 31) << 1))))) - 1;
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int iB;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 9;
        int i4 = ((i2 | 9) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            iB = az.b(this.c.length) % 0;
        } else {
            int iB2 = az.b(this.c.length);
            iB = ((iB2 & 1) << 1) + (iB2 ^ 1);
        }
        int i5 = -(-this.c.length);
        int i6 = iB & i5;
        int i7 = (iB ^ i5) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        int i9 = b;
        int i10 = ((i9 | 25) << 1) - (i9 ^ 25);
        a = i10 % 128;
        int i11 = i10 % 2;
        return i8;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 59;
        int i4 = (((~i3) & (i2 | 59)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 & 29;
        int i7 = (i6 - (~(-(-((i2 ^ 29) | i6))))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }
}
