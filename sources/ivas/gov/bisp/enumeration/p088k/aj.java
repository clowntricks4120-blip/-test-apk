package ivas.gov.bisp.enumeration.p088k;

import android.graphics.Rect;
import android.view.View;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class aj {
    private static int a = 0;
    private static int b = 1;
    public static Method c;

    static {
        try {
            Class[] clsArr = new Class[2];
            clsArr[0] = Rect.class;
            int i = (1 - (-26)) - 1;
            a = i % 128;
            int i2 = i % 2;
            clsArr[1] = Rect.class;
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", clsArr);
            c = declaredMethod;
            int i3 = b;
            int i4 = i3 | 109;
            int i5 = i4 << 1;
            int i6 = -((~(i3 & 109)) & i4);
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            if (!declaredMethod.isAccessible()) {
                int i9 = b + 71;
                a = i9 % 128;
                int i10 = i9 % 2;
                c.setAccessible(true);
                int i11 = a;
                int i12 = ((i11 ^ 53) | (i11 & 53)) << 1;
                int i13 = -(((~i11) & 53) | (i11 & (-54)));
                int i14 = (i12 & i13) + (i13 | i12);
                b = i14 % 128;
                int i15 = i14 % 2;
                int i16 = 2 % 2;
            }
            int i17 = a + 69;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public static boolean b(View view) {
        boolean z;
        int i = 2 % 2;
        int i2 = a + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            WeakHashMap<View, R> weakHashMap = T.c;
            if (T.aWY.f(view) != 1) {
                int i3 = a + 96;
                int i4 = (i3 ^ (-1)) + (i3 << 1);
                int i5 = i4 % 128;
                b = i5;
                int i6 = i4 % 2;
                int i7 = ((i5 ^ 113) | (i5 & 113)) << 1;
                int i8 = -(((~i5) & 113) | (i5 & (-114)));
                int i9 = (i7 & i8) + (i8 | i7);
                a = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            } else {
                z = true;
            }
        } else {
            WeakHashMap<View, R> weakHashMap2 = T.c;
            if (T.aWY.f(view) != 1) {
                int i11 = a + 96;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                int i13 = i12 % 128;
                b = i13;
                int i14 = i12 % 2;
                int i15 = ((i13 ^ 113) | (i13 & 113)) << 1;
                int i16 = -(((~i13) & 113) | (i13 & (-114)));
                int i17 = (i15 & i16) + (i16 | i15);
                a = i17 % 128;
                int i18 = i17 % 2;
                z = false;
            } else {
                z = true;
            }
        }
        int i19 = a;
        int i20 = ((i19 ^ 81) | (i19 & 81)) << 1;
        int i21 = -(((~i19) & 81) | (i19 & (-82)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        int i23 = i22 % 2;
        return z;
    }
}
