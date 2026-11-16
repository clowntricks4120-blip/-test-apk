package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class V implements i, av {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final R d;

    public V(int i, R r) {
        this.c = i;
        this.d = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        am amVar = new am(this.c, this.d.f());
        int i2 = b;
        int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return amVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        O oE;
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 119) << 1) - (i2 ^ 119);
        b = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                oE = e();
                int i4 = 31 / 0;
            } else {
                oE = e();
            }
            int i5 = a;
            int i6 = i5 & 15;
            int i7 = (i6 - (~((i5 ^ 15) | i6))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            return oE;
        } catch (IOException e) {
            throw new C0267m(e.getMessage(), e);
        }
    }
}
