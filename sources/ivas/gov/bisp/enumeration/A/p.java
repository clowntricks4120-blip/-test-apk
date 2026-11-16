package ivas.gov.bisp.enumeration.A;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class p extends Drawable {
    private static int a = 0;
    private static int b = 1;
    public static final double c = Math.cos(Math.toRadians(45.0d));

    static {
        int i = b;
        int i2 = i ^ 91;
        int i3 = ((i & 91) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static float b(float f, float f2, boolean z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = (((i2 ^ 67) | i3) << 1) - ((i2 | 67) & (~i3));
        int i5 = i4 % 128;
        a = i5;
        int i6 = i4 % 2;
        if (z) {
            int i7 = ((i5 ^ 86) + ((i5 & 86) << 1)) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
            double d = f;
            double d2 = (1.0d - c) * ((double) f2);
            int i9 = (i5 & 21) + (i5 | 21);
            int i10 = i9 % 128;
            b = i10;
            f = (float) (i9 % 2 == 0 ? d2 % d : d2 + d);
            int i11 = i10 + 107;
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = b;
        int i14 = (((i13 & (-56)) | ((~i13) & 55)) - (~(-(-((i13 & 55) << 1))))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static float c(float f, float f2, boolean z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 ^ 73) | (i2 & 73)) << 1) - ((i2 & (-74)) | ((~i2) & 73));
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f3 = f * 1.5f;
        if (!z) {
            int i5 = (-2) - (((i2 & 120) + (i2 | 120)) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            return f3;
        }
        int i7 = i4 ^ 97;
        int i8 = ((((i4 & 97) | i7) << 1) - (~(-i7))) - 1;
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        float f4 = (float) (((1.0d - c) * ((double) f2)) + ((double) f3));
        int i11 = (i9 ^ 57) + ((i9 & 57) << 1);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            return f4;
        }
        throw null;
    }
}
