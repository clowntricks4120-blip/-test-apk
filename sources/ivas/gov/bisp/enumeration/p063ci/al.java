package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class al implements T {
    private static int a = 0;
    private static int b = 1;
    public R c;

    public al(R r) {
        this.c = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        W w = new W(this.c.f());
        int i2 = b;
        int i3 = (i2 ^ 74) + ((i2 & 74) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        if (i4 % 2 == 0) {
            return w;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 14) + ((i2 & 14) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        try {
            O oE = e();
            int i6 = a;
            int i7 = i6 & 17;
            int i8 = -(-((i6 ^ 17) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                return oE;
            }
            throw null;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
