package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class as implements T {
    private static int a = 1;
    private static int b;
    public R c;

    public as(R r) {
        this.c = r;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.av
    public O e() {
        int i = 2 % 2;
        ar arVar = new ar(this.c.f());
        int i2 = b;
        int i3 = i2 & 19;
        int i4 = -(-((i2 ^ 19) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        return arVar;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        try {
            ar arVar = new ar(this.c.f());
            int i2 = b + 1;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                return arVar;
            }
            throw null;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
