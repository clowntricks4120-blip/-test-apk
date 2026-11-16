package ivas.gov.bisp.enumeration.F;

import ivas.gov.bisp.enumeration.OoooOOo.o000000O;

/* JADX INFO: loaded from: classes.dex */
public class V {
    private static int a = 0;
    private static int b = 1;
    public final o000000O<?> c;

    public V(o000000O<?> o000000o) {
        this.c = o000000o;
    }

    public void c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 53) << 1) - (i2 ^ 53);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            this.c.d.V();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.c.d.V();
        int i4 = a + 39;
        b = i4 % 128;
        int i5 = i4 % 2;
    }
}
