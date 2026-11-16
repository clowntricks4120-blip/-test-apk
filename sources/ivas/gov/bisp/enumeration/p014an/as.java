package ivas.gov.bisp.enumeration.p014an;

/* JADX INFO: loaded from: classes.dex */
public final class as extends aq {
    private static int a = 0;
    private static int b = 1;

    public final int e() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 15;
        int i5 = ((i3 | 15) & (~i4)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iC = c(6);
        if (iC != 0) {
            int i7 = a + 71;
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (iC - (~(-(-this.c)))) - 1;
            int i10 = this.d.getInt(i9);
            int i11 = a;
            int i12 = ((i11 | 13) << 1) - (i11 ^ 13);
            b = i12 % 128;
            int i13 = i12 % 2;
            i = this.d.getInt((i10 - (~(-(-i9)))) - 1);
            int i14 = a;
            int i15 = i14 & 55;
            int i16 = (i14 ^ 55) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = b;
            int i20 = (-2) - ((((i19 | 110) << 1) - (i19 ^ 110)) ^ (-1));
            a = i20 % 128;
            int i21 = i20 % 2;
            i = 0;
        }
        int i22 = a;
        int i23 = ((i22 ^ 95) | (i22 & 95)) << 1;
        int i24 = -(((~i22) & 95) | (i22 & (-96)));
        int i25 = (i23 & i24) + (i24 | i23);
        b = i25 % 128;
        if (i25 % 2 != 0) {
            return i;
        }
        throw null;
    }
}
