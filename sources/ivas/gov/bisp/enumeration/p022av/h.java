package ivas.gov.bisp.enumeration.p022av;

/* JADX INFO: loaded from: classes.dex */
public class h extends T {
    private static int b = 1;
    private static int c;

    public h(C0095o c0095o) {
        super(c0095o);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 29;
        int i4 = ((((i2 & 29) | i3) << 1) - (~(-i3))) - 1;
        c = i4 % 128;
        int i5 = i4 % 2;
        String message = super.getMessage();
        if (i5 != 0) {
            int i6 = 68 / 0;
        }
        return message;
    }
}
