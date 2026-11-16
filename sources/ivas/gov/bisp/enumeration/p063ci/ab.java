package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ab implements i, av {
    private static int a = 1;
    private static int b;
    public R c;

    public ab(R r) {
        this.c = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() throws P {
        int i = 2 % 2;
        try {
            an anVar = new an(this.c.f());
            int i2 = a;
            int i3 = (i2 & (-10)) | ((~i2) & 9);
            int i4 = -(-((i2 & 9) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = i6 & 43;
            int i9 = -(-((i6 ^ 43) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return anVar;
        } catch (IllegalArgumentException e) {
            throw new P(e.getMessage(), e);
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 5;
        int i4 = ((i2 & 5) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        try {
            O oE = e();
            int i8 = b;
            int i9 = ((i8 ^ 95) | (i8 & 95)) << 1;
            int i10 = -(((~i8) & 95) | (i8 & (-96)));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return oE;
            }
            throw null;
        } catch (IOException e) {
            throw new C0267m("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C0267m("unable to get DER object", e2);
        }
    }
}
