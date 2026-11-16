package ivas.gov.bisp.enumeration.p063ci;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class P extends IOException {
    private static int a = 0;
    private static int b = 1;
    public Throwable c;

    public P(String str) {
        super(str);
    }

    public P(String str, Throwable th) {
        super(str);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 95;
        int i4 = i3 + ((i2 ^ 95) | i3);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        Throwable th = this.c;
        int i6 = ((i5 ^ 15) | (i5 & 15)) << 1;
        int i7 = -(((~i5) & 15) | (i5 & (-16)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return th;
    }
}
