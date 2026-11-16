package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class af implements N {
    private static int a = 0;
    private static int b = 1;
    public C0263g c;

    public af(C0263g c0263g) {
        this.c = c0263g;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.N
    public InputStream a() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        C0263g c0263g = this.c;
        int i6 = (i4 ^ 95) + ((i4 & 95) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
        return c0263g;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        B b2 = new B(this.c.d());
        int i2 = a;
        int i3 = (-2) - (((i2 & 18) + (i2 | 18)) ^ (-1));
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return b2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        try {
            B b2 = new B(this.c.d());
            int i2 = a;
            int i3 = i2 & 53;
            int i4 = -(-(i2 | 53));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i7 = (((i6 | 94) << 1) - (i6 ^ 94)) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 29 / 0;
            }
            return b2;
        } catch (IOException e) {
            StringBuilder sbW = j.w("IOException converting stream to byte array: ");
            sbW.append(e.getMessage());
            throw new C0267m(sbW.toString(), e);
        }
    }
}
