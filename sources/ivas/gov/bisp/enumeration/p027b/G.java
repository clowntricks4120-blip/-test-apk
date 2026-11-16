package ivas.gov.bisp.enumeration.p027b;

/* JADX INFO: loaded from: classes.dex */
public class G {
    private static int a = 0;
    private static int b = 1;

    public void c(ap apVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 47;
        int i4 = ((i2 & 47) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }
}
