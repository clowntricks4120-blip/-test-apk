package ivas.gov.bisp.enumeration.p081d;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class L {
    private static int a = 0;
    private static int b = 1;
    public static Method c;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            int i = b;
            int i2 = (i & (-126)) | ((~i) & 125);
            int i3 = -(-((i & 125) << 1));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            try {
                Method declaredMethod = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
                int i6 = a;
                int i7 = (i6 & 35) + (i6 | 35);
                int i8 = i7 % 128;
                b = i8;
                int i9 = i7 % 2;
                c = declaredMethod;
                int i10 = (i8 ^ 125) + ((i8 & 125) << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            } catch (Exception unused) {
                return;
            }
        }
        int i13 = b;
        int i14 = (-2) - (((i13 ^ 66) + ((i13 & 66) << 1)) ^ (-1));
        a = i14 % 128;
        int i15 = i14 % 2;
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 115;
        int i4 = ((i2 & 115) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (Build.VERSION.SDK_INT >= 25) {
            int i8 = a;
            int i9 = i8 & 125;
            int i10 = -(-(i8 | 125));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            Method method = c;
            if (method != null) {
                try {
                    Integer num = (Integer) method.invoke(viewConfiguration, new Object[0]);
                    int i12 = (-2) - ((b + 90) ^ (-1));
                    a = i12 % 128;
                    if (i12 % 2 == 0) {
                        return num.intValue();
                    }
                    num.intValue();
                    throw null;
                } catch (Exception unused) {
                }
            }
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        int i13 = a + 23;
        b = i13 % 128;
        if (i13 % 2 != 0 ? (!theme.resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) : !theme.resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            int i14 = b;
            int i15 = i14 ^ 61;
            int i16 = ((((i14 & 61) | i15) << 1) - (~(-i15))) - 1;
            a = i16 % 128;
            int i17 = i16 % 2;
            return 0.0f;
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        int i18 = a;
        int i19 = i18 ^ 91;
        int i20 = (((i18 & 91) | i19) << 1) - i19;
        b = i20 % 128;
        if (i20 % 2 != 0) {
            return dimension;
        }
        throw null;
    }
}
