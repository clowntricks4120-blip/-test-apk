package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class H extends AbstractC0264h {
    private static int a = 0;
    private static int b = 1;

    public H(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.AbstractC0264h, ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 117;
        int i5 = -(-((i3 ^ 117) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.c) {
            int i8 = a;
            int i9 = i8 ^ 41;
            int i10 = (i8 & 41) << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            int i12 = i11 % 128;
            b = i12;
            int i13 = i11 % 2;
            int i14 = (i12 ^ 21) + ((i12 & 21) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            i = 96;
        } else {
            int i16 = a + 29;
            b = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 3 / 2;
            }
            i = 64;
        }
        int i18 = this.d;
        byte[] bArr = this.e;
        int i19 = b + 121;
        a = i19 % 128;
        int i20 = i19 % 2;
        aVar.u(z, i, i18, bArr);
        if (i20 != 0) {
            throw null;
        }
    }
}
