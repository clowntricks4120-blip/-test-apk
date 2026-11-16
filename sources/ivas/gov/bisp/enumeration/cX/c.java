package ivas.gov.bisp.enumeration.cX;

import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public class c extends r {
    private static int a = 0;
    private static int b = 1;
    public final byte[] R;

    public c(byte[] bArr) {
        super(false);
        this.R = ivas.gov.bisp.enumeration.p064cj.j.c(bArr);
    }

    public byte[] c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 63;
        int i4 = (i2 ^ 63) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            ivas.gov.bisp.enumeration.p064cj.j.c(this.R);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte[] bArrC = ivas.gov.bisp.enumeration.p064cj.j.c(this.R);
        int i6 = b;
        int i7 = ((i6 & (-120)) | ((~i6) & 119)) + ((i6 & 119) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return bArrC;
    }
}
