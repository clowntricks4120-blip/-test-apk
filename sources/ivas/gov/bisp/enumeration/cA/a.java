package ivas.gov.bisp.enumeration.cA;

import ivas.gov.bisp.enumeration.p064cj.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends u {
    private static int a = 0;
    private static int b = 1;
    public final byte[] T;

    public a(byte[] bArr, String str) {
        super(false, str, 0);
        this.T = j.c(bArr);
    }

    public byte[] c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & (-18)) | ((~i2) & 17)) + ((i2 & 17) << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrC = j.c(this.T);
        int i5 = b;
        int i6 = i5 & 111;
        int i7 = (i6 - (~((i5 ^ 111) | i6))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return bArrC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
