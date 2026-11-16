package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p064cj.j;
import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ap extends O {
    private static int a = 1;
    private static int b;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] d;

    static {
        int i = 1 ^ 13;
        int i2 = (1 & 13) << 1;
        int i3 = ((i | i2) << 1) - (i ^ i2);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
    }

    public ap(byte[] bArr) {
        this.d = j.c(bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean h(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 49;
        int i4 = (i2 & 49) << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        int i6 = i5 % 2;
        if (o2 instanceof ap) {
            boolean zEquals = Arrays.equals(this.d, ((ap) o2).d);
            int i7 = a;
            int i8 = i7 & 53;
            int i9 = -(-(i7 | 53));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return zEquals;
            }
            throw null;
        }
        int i11 = i2 & 55;
        int i12 = (((i2 ^ 55) | i11) << 1) - ((i2 | 55) & (~i11));
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        int i15 = ((i13 ^ 7) | (i13 & 7)) << 1;
        int i16 = -(((~i13) & 7) | (i13 & (-8)));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 2 / 0;
        }
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J
    public int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 49;
        int i4 = ((i2 | 49) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        int iH = j.h(this.d);
        int i6 = b;
        int i7 = i6 & 109;
        int i8 = i7 + ((i6 ^ 109) | i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return iH;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 23) << 1;
        int i4 = -(((~i2) & 23) | (i2 & (-24)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        aVar.v(z, 28, this.d);
        int i7 = b;
        int i8 = (((i7 & (-110)) | ((~i7) & 109)) - (~((i7 & 109) << 1))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 96) + (i2 | 96)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        int iB = az.b(this.d.length);
        int i5 = (iB ^ 1) + ((iB & 1) << 1);
        byte[] bArr = this.d;
        int i6 = a;
        int i7 = (i6 ^ 101) + ((i6 & 101) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        int length = bArr.length;
        if (i8 != 0) {
            return i5 * length;
        }
        int i9 = -(-length);
        return (((i5 | i9) << 1) - (~(-((i9 & (~i5)) | ((~i9) & i5))))) - 1;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 79;
        int i4 = (i2 | 79) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public String toString() {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            int i3 = a;
            int i4 = (i3 | 119) << 1;
            int i5 = -(i3 ^ 119);
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 != encoded.length) {
                int i9 = a;
                int i10 = (i9 & (-2)) | ((~i9) & 1);
                int i11 = (i9 & 1) << 1;
                int i12 = (i10 & i11) + (i11 | i10);
                int i13 = i12 % 128;
                b = i13;
                if (i12 % 2 != 0) {
                    cArr = c;
                    int i14 = encoded[i8] >>> 4;
                    i = ((~i14) & 113) ^ (i14 & (-114));
                } else {
                    cArr = c;
                    i = (encoded[i8] >>> 4) & 15;
                }
                int i15 = (i13 & 79) + (i13 | 79);
                a = i15 % 128;
                int i16 = i15 % 2;
                stringBuffer.append(cArr[i]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
                int i17 = b;
                int i18 = i17 & 113;
                int i19 = ((i17 ^ 113) | i18) << 1;
                int i20 = -((~i18) & (i17 | 113));
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                a = i21 % 128;
                int i22 = i21 % 2;
                int i23 = (i8 ^ 46) + ((i8 & 46) << 1);
                i8 = (i23 ^ (-45)) + ((i23 & (-45)) << 1);
                int i24 = (i17 & (-116)) | ((~i17) & 115);
                int i25 = -(-((i17 & 115) << 1));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                a = i26 % 128;
                int i27 = i26 % 2;
            }
            String string = stringBuffer.toString();
            int i28 = b;
            int i29 = i28 ^ 111;
            int i30 = ((i28 & 111) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
            a = i32 % 128;
            if (i32 % 2 != 0) {
                return string;
            }
            throw null;
        } catch (IOException unused) {
            throw new C0267m("internal error encoding UniversalString");
        }
    }
}
