package ivas.gov.bisp.enumeration.p053bz;

import ivas.gov.bisp.enumeration.p030bc.A;
import ivas.gov.bisp.enumeration.p100w.r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public class O implements ivas.gov.bisp.enumeration.aS.O {
    private static int a = 0;
    private static int b = 1;
    public final A c;
    public final int d;

    public O(A a2, int i) throws InvalidAlgorithmParameterException {
        this.c = a2;
        this.d = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        a2.b(new byte[0], i);
        int i2 = b + 32;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 55;
        int i7 = (i4 | 55) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.aS.O
    public byte[] e(byte[] bArr) {
        int i = 2 % 2;
        int i2 = b + 49;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.c.b(bArr, this.d);
        }
        this.c.b(bArr, this.d);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.aS.O
    public void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 79) + (i2 | 79);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.c.b(bArr2, this.d);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!r.C(this.c.b(bArr2, this.d), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int i4 = b;
        int i5 = i4 & 21;
        int i6 = (i5 - (~(-(-((i4 ^ 21) | i5))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
