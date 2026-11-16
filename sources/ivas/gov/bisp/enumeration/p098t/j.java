package ivas.gov.bisp.enumeration.p098t;

import android.animation.ObjectAnimator;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 0;
    private static int b = 1;

    public static void b(ObjectAnimator objectAnimator, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 13) | (i2 & 13)) << 1;
        int i4 = -(((~i2) & 13) | (i2 & (-14)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        objectAnimator.setAutoCancel(z);
        int i7 = b;
        int i8 = i7 & 83;
        int i9 = (i7 ^ 83) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
    }
}
