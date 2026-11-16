package ivas.gov.bisp.enumeration.p081d;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.d.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0284l {
    private static int a = 1;
    private static int b;
    public int c;
    public int d;

    public /* synthetic */ C0284l(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public int d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.c;
        int i6 = this.d;
        int i7 = i5 ^ i6;
        int i8 = i5 & i6;
        int i9 = (i8 & i7) | (i7 ^ i8);
        int i10 = i2 + 73;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            return i9;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ C0284l() {
    }
}
