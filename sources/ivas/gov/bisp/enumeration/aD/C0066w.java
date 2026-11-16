package ivas.gov.bisp.enumeration.aD;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aD.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066w implements Z {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.aD.Z
    public final int b() {
        int i = 2 % 2;
        int i2 = a + 73;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        a = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // ivas.gov.bisp.enumeration.aD.Z
    public final boolean c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((i2 + 84) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 101;
        int i6 = -(-((i2 ^ 101) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aD.Z
    public final aa e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-88)) | ((~i2) & 87)) - (~((i2 & 87) << 1))) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 61;
        a = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }
}
