package ivas.gov.bisp.enumeration.cT;

import ivas.gov.bisp.enumeration.cJ.P;
import ivas.gov.bisp.enumeration.p096p.h;

/* JADX INFO: loaded from: classes.dex */
public class X extends S implements V {
    private static int a = 0;
    private static int b = 1;
    public static final X c = new X();

    static {
        int i = b;
        int i2 = ((i & 114) + (i | 114)) - 1;
        a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cT.R
    public Class<?> b() {
        int i = 2 % 2;
        int i2 = a + 67;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return String.class;
        }
        int i3 = 85 / 0;
        return String.class;
    }

    @Override // ivas.gov.bisp.enumeration.cT.S
    public long d(Object obj, h hVar) {
        int i = 2 % 2;
        int i2 = a + 44;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        long jE = P.af.j(hVar).e((String) obj);
        int i5 = (-2) - ((a + 6) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        return jE;
    }
}
