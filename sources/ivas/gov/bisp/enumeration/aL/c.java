package ivas.gov.bisp.enumeration.aL;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 0;
    private static int b = 1;

    public static TypedValue b(Context context, int i) {
        int i2 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        int i3 = b;
        int i4 = i3 ^ 35;
        int i5 = -(-((i3 & 35) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (!theme.resolveAttribute(i, typedValue, true)) {
            int i8 = a;
            int i9 = i8 & 13;
            int i10 = (((i8 | 13) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = a;
        int i13 = i12 + 5;
        b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((i12 ^ 87) | (i12 & 87)) << 1;
        int i16 = -(((~i12) & 87) | (i12 & (-88)));
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 25 / 0;
        }
        return typedValue;
    }

    public static boolean c(Context context, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 119) + ((i3 & 119) << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            b(context, i);
            throw null;
        }
        TypedValue typedValueB = b(context, i);
        if (typedValueB != null && typedValueB.type == 18) {
            int i5 = b;
            int i6 = i5 & 25;
            int i7 = (i6 - (~((i5 ^ 25) | i6))) - 1;
            a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = typedValueB.data;
                obj.hashCode();
                throw null;
            }
            if (typedValueB.data != 0) {
                int i9 = b;
                int i10 = i9 & 107;
                int i11 = (i9 ^ 107) | i10;
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                int i14 = a;
                int i15 = (-2) - (((i14 ^ 8) + ((i14 & 8) << 1)) ^ (-1));
                b = i15 % 128;
                int i16 = i15 % 2;
                z = false;
            }
        }
        int i17 = b;
        int i18 = i17 & 87;
        int i19 = (i17 ^ 87) | i18;
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        return z;
    }

    public static int d(Context context, int i, String str) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 ^ 103) | (i3 & 103)) << 1;
        int i5 = -(((~i3) & 103) | (i3 & (-104)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            b(context, i);
            obj.hashCode();
            throw null;
        }
        TypedValue typedValueB = b(context, i);
        if (typedValueB == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        int i7 = typedValueB.data;
        int i8 = a;
        int i9 = i8 & 17;
        int i10 = ((i8 | 17) & (~i9)) + (i9 << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return i7;
        }
        throw null;
    }
}
