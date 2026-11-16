package ivas.gov.bisp.enumeration.p004ad;

/* JADX INFO: loaded from: classes.dex */
public class L extends S {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.p004ad.S, ivas.gov.bisp.enumeration.p004ad.T
    public void b(O o2) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 111;
        int i4 = ((i2 ^ 111) | i3) << 1;
        int i5 = -((i2 | 111) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        a = i7;
        int i8 = i6 % 2;
        int i9 = (i7 ^ 25) + ((i7 & 25) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < this.ah) {
            int i12 = b + 25;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                C0087m c0087m = this.ag[i11];
                int i13 = (i11 ^ 109) + ((i11 & 109) << 1);
                i11 = (i13 & (-100)) + (i13 | (-100));
            } else {
                C0087m c0087m2 = this.ag[i11];
                i11++;
            }
            int i14 = b;
            int i15 = (i14 ^ 59) + ((i14 & 59) << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = i17 | 101;
        int i19 = i18 << 1;
        int i20 = -((~(i17 & 101)) & i18);
        int i21 = (i19 & i20) + (i20 | i19);
        b = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 78 / 0;
        }
    }
}
