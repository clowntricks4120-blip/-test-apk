package ivas.gov.bisp.enumeration.cQ;

import org.joda.convert.ToString;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends e {
    private static int a = 0;
    private static int b = 1;

    @Override // ivas.gov.bisp.enumeration.cQ.e
    @ToString
    public String toString() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 35;
        int i4 = (i3 - (~(-(-((i2 ^ 35) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        String string = super.toString();
        int i6 = a + 74;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 72 / 0;
        }
        return string;
    }
}
