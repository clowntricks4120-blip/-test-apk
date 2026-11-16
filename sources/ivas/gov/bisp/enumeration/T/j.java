package ivas.gov.bisp.enumeration.T;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import ivas.gov.bisp.enumeration.p015ao.au;
import ivas.gov.bisp.enumeration.p015ao.av;
import ivas.gov.bisp.enumeration.p015ao.g;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static int a = 1;
    private static int b;
    public static final TimeInterpolator c = new LinearInterpolator();
    public static final TimeInterpolator d = new g();
    public static final TimeInterpolator e = new au();
    public static final TimeInterpolator f = new av();
    public static final TimeInterpolator g;

    static {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        int i = a;
        int i2 = i & 79;
        int i3 = (i | 79) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        g = decelerateInterpolator;
        int i8 = i6 & 33;
        int i9 = -(-((i6 ^ 33) | i8));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        a = i10 % 128;
        int i11 = i10 % 2;
    }

    public static float b(float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = -(-((i2 ^ 5) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        float fE = ivas.gov.bisp.enumeration.p091n.j.e(f3, f2, f4, f2);
        int i7 = b + 55;
        a = i7 % 128;
        int i8 = i7 % 2;
        return fE;
    }

    public static float c(float f2, float f3, float f4, float f5, float f6) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (((~i3) & (i2 | 87)) - (~(i3 << 1))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (f6 < f4) {
            int i5 = (i2 ^ 124) + ((i2 & 124) << 1);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return f2;
            }
            throw null;
        }
        if (f6 > f5) {
            int i7 = (i2 ^ 67) + ((i2 & 67) << 1);
            int i8 = i7 % 128;
            a = i8;
            if (i7 % 2 == 0) {
                int i9 = 27 / 0;
            }
            int i10 = ((i8 ^ 94) + ((i8 & 94) << 1)) - 1;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return f3;
            }
            throw null;
        }
        float fB = b(f2, f3, (f6 - f4) / (f5 - f4));
        int i11 = a;
        int i12 = i11 & 49;
        int i13 = ((i11 ^ 49) | i12) << 1;
        int i14 = -((i11 | 49) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        if (i15 % 2 == 0) {
            return fB;
        }
        throw null;
    }
}
