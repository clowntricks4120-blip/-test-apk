package ivas.gov.bisp.enumeration.cA;

import ivas.gov.bisp.enumeration.p064cj.j;

/* JADX INFO: loaded from: classes.dex */
public class l extends u {
    private static int a = 0;
    private static int b = 1;
    public final byte[] T;

    public l(byte[] bArr, String str) {
        super(true, str, 0);
        this.T = j.c(bArr);
    }

    public byte[] c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = -(-((i2 ^ 7) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArrC = j.c(this.T);
        int i7 = a;
        int i8 = (i7 & 59) + (i7 | 59);
        b = i8 % 128;
        int i9 = i8 % 2;
        return bArrC;
    }
}
