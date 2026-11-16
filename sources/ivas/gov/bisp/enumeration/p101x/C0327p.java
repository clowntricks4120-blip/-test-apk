package ivas.gov.bisp.enumeration.p101x;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.x.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0327p extends Exception {
    private static int a = 0;
    private static int b = 1;

    public C0327p(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public /* bridge */ /* synthetic */ Throwable getCause() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        int i6 = ((i4 ^ 26) + ((i4 & 26) << 1)) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
