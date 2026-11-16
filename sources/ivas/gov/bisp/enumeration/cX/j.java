package ivas.gov.bisp.enumeration.cX;

import ivas.gov.bisp.enumeration.O.r;

/* JADX INFO: loaded from: classes.dex */
public class j extends r {
    private static int a = 1;
    private static int b;
    public final short[] R;

    public j(short[] sArr) {
        super(true);
        this.R = ivas.gov.bisp.enumeration.p064cj.j.d(sArr);
    }

    public short[] c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
        a = i3 % 128;
        if (i3 % 2 == 0) {
            ivas.gov.bisp.enumeration.p064cj.j.d(this.R);
            throw null;
        }
        short[] sArrD = ivas.gov.bisp.enumeration.p064cj.j.d(this.R);
        int i4 = a + 3;
        b = i4 % 128;
        int i5 = i4 % 2;
        return sArrD;
    }
}
