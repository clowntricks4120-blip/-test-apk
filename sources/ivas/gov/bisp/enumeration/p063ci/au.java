package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class au implements i, av {
    private static int a = 1;
    private static int b;
    public R c;

    public au(R r) {
        this.c = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        aq aqVar = new aq(this.c.f());
        int i2 = a;
        int i3 = (i2 ^ 83) + ((i2 & 83) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        return aqVar;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        try {
            aq aqVar = new aq(this.c.f());
            int i2 = (-2) - ((b + 58) ^ (-1));
            int i3 = i2 % 128;
            a = i3;
            int i4 = i2 % 2;
            int i5 = i3 & 109;
            int i6 = (i5 - (~(-(-((i3 ^ 109) | i5))))) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
            return aqVar;
        } catch (IOException e) {
            throw new C0267m(e.getMessage(), e);
        }
    }
}
