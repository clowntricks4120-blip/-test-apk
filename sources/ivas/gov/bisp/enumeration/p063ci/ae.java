package ivas.gov.bisp.enumeration.p063ci;

import ivas.gov.bisp.enumeration.p086i.a;

/* JADX INFO: loaded from: classes.dex */
public class ae extends AbstractC0269o {
    private static int a = 0;
    private static int b = 1;
    public static final ae c = new ae();
    public static final byte[] d;

    static {
        int i = a;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        b = i2 % 128;
        int i3 = i2 % 2;
        d = new byte[0];
        if (i3 == 0) {
            throw null;
        }
        int i4 = i & 3;
        int i5 = (i | 3) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 4 / 0;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public void i(a aVar, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 125;
        int i4 = ((i2 ^ 125) | i3) << 1;
        int i5 = -((i2 | 125) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        aVar.v(z, 5, d);
        int i8 = b;
        int i9 = i8 & 91;
        int i10 = (i9 - (~(-(-((i8 ^ 91) | i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public int j() {
        int i = 2 % 2;
        int i2 = b + 115;
        a = i2 % 128;
        return i2 % 2 != 0 ? 3 : 2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.O
    public boolean l() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = ((i2 | 5) & (~i3)) + (i3 << 1);
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = i5 & 109;
        int i8 = i7 + ((i5 ^ 109) | i7);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 3 / 0;
        }
        return false;
    }
}
