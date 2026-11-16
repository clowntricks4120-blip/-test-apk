package ivas.gov.bisp.enumeration.O;

/* JADX INFO: loaded from: classes.dex */
public class e extends r {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.O.r
    public void H(a aVar, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = (~i3) & (i2 | 21);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 & 99;
        int i9 = (i2 ^ 99) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
        aVar.g(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double dSin = Math.sin(Math.toRadians(f));
        int i12 = a + 67;
        int i13 = i12 % 128;
        b = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        double d = f3;
        double d2 = f2;
        float f4 = (float) (dSin * d * d2);
        int i14 = (i13 ^ 107) + ((i13 & 107) << 1);
        a = i14 % 128;
        aVar.f(f4, (float) (Math.sin(Math.toRadians(i14 % 2 != 0 ? f * 90.0f : 90.0f - f)) * d * d2));
        int i15 = a;
        int i16 = i15 & 49;
        int i17 = ((i15 ^ 49) | i16) << 1;
        int i18 = -((i15 | 49) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }
}
