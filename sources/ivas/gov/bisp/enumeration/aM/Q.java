package ivas.gov.bisp.enumeration.aM;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class Q {
    private static int a = 1;
    private static int b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        c = true;
        d = true;
        int i2 = a;
        int i3 = i2 | 63;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 63)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (i < 28) {
            int i9 = (((i7 & (-2)) | ((~i7) & 1)) - (~((i7 & 1) << 1))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i7 ^ 95;
            int i12 = ((i7 & 95) | i11) << 1;
            int i13 = -i11;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 2 % 2;
            }
            z = false;
        }
        e = z;
        int i16 = i7 + 29;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }
}
