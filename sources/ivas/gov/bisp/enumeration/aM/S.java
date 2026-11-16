package ivas.gov.bisp.enumeration.aM;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class S {
    private static int a = 0;
    private static int b = 1;
    public static boolean c = true;

    public static void b(ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 29;
        int i4 = ((i2 ^ 29) | i3) << 1;
        int i5 = -((i2 | 29) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        if (i6 % 2 == 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 3) {
            viewGroup.suppressLayout(z);
            int i7 = a;
            int i8 = i7 & 41;
            int i9 = ((((i7 ^ 41) | i8) << 1) - (~(-((i7 | 41) & (~i8))))) - 1;
            b = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        if (c) {
            int i11 = b;
            int i12 = i11 & 37;
            int i13 = (((i11 ^ 37) | i12) << 1) - ((i11 | 37) & (~i12));
            a = i13 % 128;
            int i14 = i13 % 2;
            try {
                viewGroup.suppressLayout(z);
                int i15 = a + 47;
                b = i15 % 128;
                int i16 = i15 % 2;
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        int i17 = b;
        int i18 = (i17 & 43) + (i17 | 43);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 63 / 0;
        }
    }
}
