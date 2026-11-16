package ivas.gov.bisp.enumeration.p072cr;

import ivas.gov.bisp.enumeration.p101x.r;

/* JADX INFO: loaded from: classes.dex */
public class c implements r {
    public byte[] a;

    public c(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }
}
