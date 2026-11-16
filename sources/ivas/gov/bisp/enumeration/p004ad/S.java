package ivas.gov.bisp.enumeration.p004ad;

/* JADX INFO: loaded from: classes.dex */
public class S extends C0087m implements T {
    private static int a = 0;
    private static int b = 1;
    public C0087m[] ag = new C0087m[4];
    public int ah = 0;

    public void b(O o2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 | 63) << 1;
        int i4 = -(((~i2) & 63) | (i2 & (-64)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }
}
