package ivas.gov.bisp.enumeration.aL;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p088k.B;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static int a = 0;
    private static int b = 1;

    public static boolean e(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = ((((i2 ^ 29) | i3) << 1) - (~(-((i2 | 29) & (~i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        float f = context.getResources().getConfiguration().fontScale;
        int i6 = b;
        int i7 = (((i6 & (-60)) | ((~i6) & 59)) - (~(-(-((i6 & 59) << 1))))) - 1;
        int i8 = i7 % 128;
        a = i8;
        if (i7 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = false;
        if (f >= 1.3f) {
            int i9 = i8 + 43;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                z = true;
            }
        } else {
            int i10 = ((i8 | 64) << 1) - (i8 ^ 64);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 4 % 2;
            }
        }
        int i13 = ((i8 ^ 59) - (~((i8 & 59) << 1))) - 1;
        b = i13 % 128;
        int i14 = i13 % 2;
        return z;
    }

    public static boolean f(Context context) {
        float f;
        float f2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 123;
        boolean z = true;
        int i4 = ((i2 | 123) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        Configuration configuration = context.getResources().getConfiguration();
        if (i5 != 0) {
            f = configuration.fontScale;
            f2 = 0.0f;
        } else {
            f = configuration.fontScale;
            f2 = 2.0f;
        }
        if (f >= f2) {
            int i6 = b;
            int i7 = (i6 | 113) << 1;
            int i8 = -(((~i6) & 113) | (i6 & (-114)));
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = b;
            int i12 = ((i11 | 21) << 1) - (i11 ^ 21);
            a = i12 % 128;
            int i13 = i12 % 2;
            z = false;
        }
        int i14 = b + 121;
        a = i14 % 128;
        int i15 = i14 % 2;
        return z;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 & (-48)) | ((~i3) & 47)) + ((i3 & 47) << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            typedArray.hasValue(i);
            obj.hashCode();
            throw null;
        }
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            int i5 = (-2) - ((b + 40) ^ (-1));
            a = i5 % 128;
            if (i5 % 2 != 0) {
                A.b(context, resourceId);
                throw null;
            }
            ColorStateList colorStateListB = A.b(context, resourceId);
            if (colorStateListB != null) {
                int i6 = b;
                int i7 = i6 & 99;
                int i8 = (i6 ^ 99) | i7;
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
                return colorStateListB;
            }
        }
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        int i11 = b;
        int i12 = (i11 ^ 3) + ((i11 & 3) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        return colorStateList;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 109) + (i3 | 109);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (typedArray.hasValue(i)) {
            int i6 = a;
            int i7 = ((i6 & (-100)) | ((~i6) & 99)) + ((i6 & 99) << 1);
            b = i7 % 128;
            int i8 = i7 % 2;
            int resourceId = typedArray.getResourceId(i, 0);
            if (i8 != 0 ? resourceId != 0 : resourceId != 0) {
                int i9 = b;
                int i10 = (i9 ^ 65) + ((i9 & 65) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                Drawable drawableC = A.c(context, resourceId);
                if (drawableC != null) {
                    int i12 = a;
                    int i13 = ((i12 | 87) << 1) - (i12 ^ 87);
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = i12 & 57;
                    int i16 = (i12 | 57) & (~i15);
                    int i17 = i15 << 1;
                    int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    return drawableC;
                }
            }
        }
        Drawable drawable = typedArray.getDrawable(i);
        int i20 = a;
        int i21 = i20 ^ 11;
        int i22 = ((i20 & 11) | i21) << 1;
        int i23 = -i21;
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        return drawable;
    }

    public static ColorStateList c(Context context, B b2, int i) {
        int resourceId;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-104)) | ((~i3) & 103)) + ((i3 & 103) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (b2.d.hasValue(i)) {
            int i6 = b + 81;
            a = i6 % 128;
            if (i6 % 2 == 0 ? (resourceId = b2.d.getResourceId(i, 0)) != 0 : (resourceId = b2.d.getResourceId(i, 0)) != 0) {
                int i7 = a;
                int i8 = ((i7 ^ 87) | (i7 & 87)) << 1;
                int i9 = -(((~i7) & 87) | (i7 & (-88)));
                int i10 = (i8 & i9) + (i9 | i8);
                b = i10 % 128;
                int i11 = i10 % 2;
                ColorStateList colorStateListB = A.b(context, resourceId);
                if (colorStateListB != null) {
                    int i12 = a;
                    int i13 = i12 & 27;
                    int i14 = -(-((i12 ^ 27) | i13));
                    int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        return colorStateListB;
                    }
                    throw null;
                }
            }
        }
        ColorStateList colorStateListH = b2.h(i);
        int i16 = b + 91;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            return colorStateListH;
        }
        throw null;
    }
}
