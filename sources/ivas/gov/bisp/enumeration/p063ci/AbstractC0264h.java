package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.cO.c;
import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p064cj.p;
import ivas.gov.bisp.enumeration.p086i.a;
import ivas.gov.bisp.enumeration.p088k.C0321u;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264h extends O {
    private static int a = 1;
    private static int b;
    public final boolean c;
    public final int d;
    public final byte[] e;

    public AbstractC0264h(boolean z, int i, byte[] bArr) {
        this.c = z;
        this.d = i;
        this.e = j.c(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i;
        int i2;
        byte[] bArr;
        byte[] bArr2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 5) + (i4 | 5);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            boolean z = o2 instanceof AbstractC0264h;
            throw null;
        }
        boolean z2 = false;
        if (!(o2 instanceof AbstractC0264h)) {
            int i6 = (((i4 & (-56)) | ((~i4) & 55)) - (~(-(-((i4 & 55) << 1))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        AbstractC0264h abstractC0264h = (AbstractC0264h) o2;
        boolean z3 = this.c;
        int i8 = (((i4 | 68) << 1) - (i4 ^ 68)) - 1;
        int i9 = i8 % 128;
        a = i9;
        if (i8 % 2 == 0) {
            int i10 = 2 / 0;
            if (z3 == abstractC0264h.c) {
                int i11 = i9 ^ 57;
                int i12 = (i9 & 57) << 1;
                int i13 = (i11 & i12) + (i12 | i11);
                i = i13 % 128;
                b = i;
                int i14 = i13 % 2;
                if (this.d == abstractC0264h.d) {
                    int i15 = i & 65;
                    i2 = ((~i15) & (i | 65)) + (i15 << 1);
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        bArr = this.e;
                        bArr2 = abstractC0264h.e;
                        z2 = true;
                    } else {
                        bArr = this.e;
                        bArr2 = abstractC0264h.e;
                    }
                    int i16 = ((i | 77) << 1) - (i ^ 77);
                    a = i16 % 128;
                    int i17 = i16 % 2;
                    if (Arrays.equals(bArr, bArr2)) {
                        int i18 = b;
                        int i19 = ((i18 ^ 45) | (i18 & 45)) << 1;
                        int i20 = -((i18 & (-46)) | ((~i18) & 45));
                        int i21 = (i19 & i20) + (i19 | i20);
                        a = i21 % 128;
                        int i22 = i21 % 2;
                        int i23 = i18 + 61;
                        a = i23 % 128;
                        int i24 = i23 % 2;
                        z2 = true;
                    }
                }
            }
        } else if (z3 == abstractC0264h.c) {
            int i110 = i9 ^ 57;
            int i111 = (i9 & 57) << 1;
            int i112 = (i110 & i111) + (i111 | i110);
            i = i112 % 128;
            b = i;
            int i113 = i112 % 2;
            if (this.d == abstractC0264h.d) {
                int i114 = i & 65;
                i2 = ((~i114) & (i | 65)) + (i114 << 1);
                a = i2 % 128;
                if (i2 % 2 == 0) {
                    bArr = this.e;
                    bArr2 = abstractC0264h.e;
                    z2 = true;
                } else {
                    bArr = this.e;
                    bArr2 = abstractC0264h.e;
                }
                int i115 = ((i | 77) << 1) - (i ^ 77);
                a = i115 % 128;
                int i116 = i115 % 2;
                if (Arrays.equals(bArr, bArr2)) {
                    int i117 = b;
                    int i118 = ((i117 ^ 45) | (i117 & 45)) << 1;
                    int i25 = -((i117 & (-46)) | ((~i117) & 45));
                    int i26 = (i118 & i25) + (i118 | i25);
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    int i28 = i117 + 61;
                    a = i28 % 128;
                    int i29 = i28 % 2;
                    z2 = true;
                }
            }
        }
        int i30 = b;
        int i31 = (i30 ^ 106) + ((i30 & 106) << 1);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        a = i32 % 128;
        int i33 = i32 % 2;
        return z2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 11;
        int i4 = i3 + ((i2 ^ 11) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.c;
        int i6 = this.d;
        int i7 = ((z ? 1 : 0) | i6) & (~((z ? 1 : 0) & i6));
        int iH = j.h(this.e);
        int i8 = a;
        int i9 = i8 & 33;
        int i10 = i8 | 33;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        int i12 = i11 % 128;
        b = i12;
        int i13 = i11 % 2;
        int i14 = (~iH) & i7;
        int i15 = (~i7) & iH;
        int i16 = (i15 & i14) | (i14 ^ i15);
        int i17 = (i12 ^ 83) + ((i12 & 83) << 1);
        a = i17 % 128;
        if (i17 % 2 != 0) {
            return i16;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 | 69) << 1) - (~(-(i3 ^ 69)))) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (!this.c) {
            int i6 = ((i3 ^ 105) | (i3 & 105)) << 1;
            int i7 = -(((~i3) & 105) | (i3 & (-106)));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            i = 64;
        } else {
            int i10 = i5 & 19;
            int i11 = ((i5 ^ 19) | i10) << 1;
            int i12 = -((~i10) & (i5 | 19));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            i = 96;
        }
        aVar.u(z, i, this.d, this.e);
        int i15 = b;
        int i16 = i15 | 53;
        int i17 = i16 << 1;
        int i18 = -((~(i15 & 53)) & i16);
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 76) << 1) - (i2 ^ 76)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iC = az.c(this.d);
        int iB = az.b(this.e.length);
        int i5 = a;
        int i6 = i5 & 21;
        int i7 = ((i5 ^ 21) | i6) << 1;
        int i8 = -((~i6) & (i5 | 21));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = iB & iC;
        int i12 = (((iB ^ iC) | i11) << 1) - ((iC | iB) & (~i11));
        int length = this.e.length;
        int i13 = i12 & length;
        int i14 = (length ^ i12) | i13;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        int i16 = i5 & 105;
        int i17 = -(-((i5 ^ 105) | i16));
        int i18 = (i16 & i17) + (i16 | i17);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return i15;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = (-2) - ((a + 100) ^ (-1));
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        boolean z = this.c;
        int i5 = i3 & 71;
        int i6 = ((i3 ^ 71) | i5) << 1;
        int i7 = -((i3 | 71) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public String toString() {
        String strB;
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int i2 = a + 121;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (this.c) {
            int i5 = i3 ^ 29;
            int i6 = (((i3 & 29) | i5) << 1) - i5;
            a = i6 % 128;
            int i7 = i6 % 2;
            stringBuffer.append("CONSTRUCTED ");
            int i8 = b;
            int i9 = i8 & 9;
            int i10 = (i8 | 9) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            int i13 = i12 % 2;
        }
        stringBuffer.append("APPLICATION ");
        int i14 = this.d;
        int i15 = a;
        int i16 = i15 & 75;
        int i17 = -(-((i15 ^ 75) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            stringBuffer.append(Integer.toString(i14));
            throw null;
        }
        stringBuffer.append(Integer.toString(i14));
        stringBuffer.append("]");
        if (this.e != null) {
            int i19 = b;
            int i20 = (i19 ^ 109) + ((i19 & 109) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            stringBuffer.append(" #");
            byte[] bArr = this.e;
            int i22 = b;
            int i23 = (i22 & (-4)) | ((~i22) & 3);
            int i24 = -(-((i22 & 3) << 1));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                C0321u c0321u = c.c;
            } else {
                C0321u c0321u2 = c.c;
            }
            byte[] bArrB = c.b(bArr, 0, bArr.length);
            int i26 = a;
            int i27 = ((i26 ^ 49) - (~(-(-((i26 & 49) << 1))))) - 1;
            b = i27 % 128;
            if (i27 % 2 != 0) {
                strB = p.b(bArrB);
                int i28 = 47 / 0;
            } else {
                strB = p.b(bArrB);
            }
            int i29 = a + 81;
            b = i29 % 128;
            int i30 = i29 % 2;
        } else {
            int i31 = b + 41;
            a = i31 % 128;
            int i32 = i31 % 2;
            strB = " #null";
        }
        stringBuffer.append(strB);
        stringBuffer.append(" ");
        String string = stringBuffer.toString();
        int i33 = a;
        int i34 = i33 & 87;
        int i35 = ((i33 ^ 87) | i34) << 1;
        int i36 = -((i33 | 87) & (~i34));
        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
        b = i37 % 128;
        if (i37 % 2 != 0) {
            int i38 = 38 / 0;
        }
        return string;
    }
}
