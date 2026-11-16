package ivas.gov.bisp.enumeration.cC;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Serializable {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final byte[] d;

    public O(int i, byte[] bArr) {
        this.c = i;
        this.d = bArr;
    }

    public final byte[] c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 94) << 1) - (i2 ^ 94)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.d;
        if (i4 != 0) {
            return v.d(bArr);
        }
        v.d(bArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
