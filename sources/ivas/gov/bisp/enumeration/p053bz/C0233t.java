package ivas.gov.bisp.enumeration.p053bz;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bz.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0233t extends u {
    private static int a = 1;
    private static int b;

    public C0233t(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.u
    public int o() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 103;
        int i4 = ((i2 & 103) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        return i6 % 2 != 0 ? 10 : 12;
    }

    @Override // ivas.gov.bisp.enumeration.p053bz.u
    public int[] l(int[] iArr, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 | 121) << 1;
        int i5 = -(i3 ^ 121);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int length = iArr.length;
        if (i7 == 0 ? length != 3 : length != 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        u.f(iArr2, this.d);
        int i8 = b;
        int i9 = (i8 & 5) + (i8 | 5);
        a = i9 % 128;
        int i10 = i9 % 2;
        iArr2[12] = i;
        int i11 = i8 & 75;
        int i12 = (i8 | 75) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        if (i14 % 2 == 0) {
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            throw null;
        }
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        int i15 = b + 90;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            return iArr2;
        }
        throw null;
    }
}
