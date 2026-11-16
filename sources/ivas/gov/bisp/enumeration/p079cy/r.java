package ivas.gov.bisp.enumeration.p079cy;

import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ivas.gov.bisp.enumeration.O.r {
    private static int a = 0;
    private static int b = 1;
    public byte[] R;
    public int S;

    public r(int i, byte[] bArr) {
        int i2;
        super(false);
        int length = bArr.length;
        if (i == 5) {
            int i3 = a;
            int i4 = (((i3 | 78) << 1) - (i3 ^ 78)) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i2 = 14880;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(j.o("unknown security category: ", i));
            }
            int i7 = b;
            int i8 = i7 ^ 19;
            int i9 = (i7 & 19) << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = (i11 & (-112)) | ((~i11) & 111);
            int i14 = (i11 & 111) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
            i2 = 38432;
        }
        if (length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        int i17 = a + 17;
        b = i17 % 128;
        int i18 = i17 % 2;
        this.S = i;
        this.R = ivas.gov.bisp.enumeration.p064cj.j.c(bArr);
        int i19 = a + 61;
        b = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public final byte[] c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 79) << 1) - (i2 ^ 79);
        a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrC = ivas.gov.bisp.enumeration.p064cj.j.c(this.R);
        int i5 = a;
        int i6 = i5 & 51;
        int i7 = -(-((i5 ^ 51) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return bArrC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
