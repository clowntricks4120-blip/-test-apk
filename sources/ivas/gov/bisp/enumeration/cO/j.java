package ivas.gov.bisp.enumeration.cO;

/* JADX INFO: loaded from: classes.dex */
public class j extends IllegalStateException {
    private static int a = 0;
    private static int b = 1;
    public Throwable c;

    public j(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = (i2 | 119) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Throwable th = this.c;
        if (i7 != 0) {
            int i8 = 26 / 0;
        }
        return th;
    }
}
