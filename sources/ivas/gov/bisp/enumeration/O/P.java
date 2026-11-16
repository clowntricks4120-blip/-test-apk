package ivas.gov.bisp.enumeration.O;

/* JADX INFO: loaded from: classes.dex */
public class P extends r {
    private static int a = 1;
    private static int b;

    @Override // ivas.gov.bisp.enumeration.O.r
    public void H(a aVar, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 121;
        int i4 = ((i2 ^ 121) | i3) << 1;
        int i5 = -((i2 | 121) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        aVar.g(0.0f, f3 * f2, 180.0f, 180.0f - f);
        int i8 = a;
        int i9 = i8 & 87;
        int i10 = (((i8 ^ 87) | i9) << 1) - ((i8 | 87) & (~i9));
        b = i10 % 128;
        float f4 = i10 % 2 != 0 ? (f3 - 0.0f) + f2 : f3 * 2.0f * f2;
        aVar.c(0.0f, 0.0f, f4, f4, 180.0f, f);
    }
}
