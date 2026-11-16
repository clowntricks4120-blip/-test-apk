package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Y implements i, av {
    private static int a = 1;
    private static int b;
    public boolean c;
    public int d;
    public R e;

    public Y(boolean z, int i, R r) {
        this.c = z;
        this.d = i;
        this.e = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-80)) | ((~i2) & 79)) - (~(-(-((i2 & 79) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        O oE = this.e.e(this.c, this.d);
        int i5 = (-2) - ((a + 76) ^ (-1));
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return oE;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            O oE = e();
            int i5 = b;
            int i6 = (i5 | 101) << 1;
            int i7 = -(((~i5) & 101) | (i5 & (-102)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            if (i8 % 2 != 0) {
                return oE;
            }
            throw null;
        } catch (IOException e) {
            throw new C0267m(e.getMessage());
        }
    }
}
