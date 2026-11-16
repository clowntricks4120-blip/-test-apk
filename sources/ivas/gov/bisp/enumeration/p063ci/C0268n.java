package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0268n implements i, av {
    private static int a = 0;
    private static int b = 1;
    public R c;

    public C0268n(R r) {
        this.c = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        D d = new D(this.c.f());
        int i2 = a;
        int i3 = i2 & 107;
        int i4 = -(-((i2 ^ 107) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 83;
        int i4 = ((i2 & 83) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        try {
            O oE = e();
            int i8 = b;
            int i9 = (((i8 | 22) << 1) - (i8 ^ 22)) - 1;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 79 / 0;
            }
            return oE;
        } catch (IOException e) {
            throw new C0267m(e.getMessage(), e);
        }
    }
}
