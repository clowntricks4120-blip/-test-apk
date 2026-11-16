package ivas.gov.bisp.enumeration.p079cy;

import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends r {
    private static int a = 0;
    private static int b = 1;
    public byte[] R;
    public int S;

    public h(int i, byte[] bArr) {
        int i2;
        super(true);
        int length = bArr.length;
        if (i == 5) {
            int i3 = (-2) - ((a + 124) ^ (-1));
            b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            i2 = 5224;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(j.o("unknown security category: ", i));
            }
            int i5 = a;
            int i6 = i5 & 97;
            int i7 = (~i6) & (i5 | 97);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = (-2) - ((i5 + 50) ^ (-1));
            b = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            i2 = 12392;
        }
        if (length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        int i14 = b;
        int i15 = i14 & 35;
        int i16 = i14 | 35;
        int i17 = (i15 & i16) + (i16 | i15);
        a = i17 % 128;
        if (i17 % 2 == 0) {
            this.S = i;
            this.R = ivas.gov.bisp.enumeration.p064cj.j.c(bArr);
        } else {
            this.S = i;
            this.R = ivas.gov.bisp.enumeration.p064cj.j.c(bArr);
            throw null;
        }
    }

    public final byte[] c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 119;
        int i4 = i3 + ((i2 ^ 119) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArrC = ivas.gov.bisp.enumeration.p064cj.j.c(this.R);
        int i6 = b + 47;
        a = i6 % 128;
        int i7 = i6 % 2;
        return bArrC;
    }
}
