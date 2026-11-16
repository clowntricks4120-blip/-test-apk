package ivas.gov.bisp.enumeration.p063ci;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.ci.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0267m extends IllegalStateException {
    private static int a = 0;
    private static int b = 1;
    public Throwable c;

    public C0267m(String str) {
        super(str);
    }

    public C0267m(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = i2 | 85;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Throwable th = this.c;
        int i6 = (i2 & 25) + (i2 | 25);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return th;
        }
        throw null;
    }
}
