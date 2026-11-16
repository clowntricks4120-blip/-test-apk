package ivas.gov.bisp.enumeration.p063ci;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class ax extends InputStream {
    private static int a = 1;
    private static int b;
    public final InputStream c;
    public int d;

    public ax(InputStream inputStream, int i) {
        this.c = inputStream;
        this.d = i;
    }

    public void c(boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 19;
        int i4 = (i3 << 1) - ((~(i2 & 19)) & i3);
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        InputStream inputStream = this.c;
        if (inputStream instanceof at) {
            int i7 = (((i5 & (-86)) | ((~i5) & 85)) - (~(-(-((i5 & 85) << 1))))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            at atVar = (at) inputStream;
            atVar.h = z;
            int i9 = a;
            int i10 = i9 & 119;
            int i11 = -(-(i9 | 119));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            atVar.d();
            if (i13 != 0) {
                int i14 = 27 / 0;
            }
            int i15 = b;
            int i16 = i15 & 77;
            int i17 = (i15 | 77) & (~i16);
            int i18 = i16 << 1;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = a;
        int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
        b = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }
}
