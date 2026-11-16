package ivas.gov.bisp.enumeration.p087j;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class T {
    private static int a = 1;
    private static int b;
    public static Field c;
    public static boolean d;
    public static Class<?> e;
    public static boolean f;
    public static boolean g;
    public static Field h;
    public static Field i;
    public static boolean j;

    public static void b(Object obj) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 43;
        int i5 = (i3 ^ 43) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        LongSparseArray longSparseArray = null;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (!f) {
            try {
                e = Class.forName("android.content.res.ThemedResourceCache");
                int i7 = a + 45;
                b = i7 % 128;
                int i8 = i7 % 2;
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f = true;
            int i9 = b + 95;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
        Class<?> cls = e;
        if (cls == null) {
            int i11 = b;
            int i12 = i11 ^ 109;
            int i13 = ((i11 & 109) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 86 / 0;
                return;
            }
            return;
        }
        if (!g) {
            int i17 = b + 27;
            a = i17 % 128;
            int i18 = i17 % 2;
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                h = declaredField;
                int i19 = a;
                int i20 = ((i19 | 79) << 1) - (i19 ^ 79);
                b = i20 % 128;
                int i21 = i20 % 2;
                declaredField.setAccessible(true);
                int i22 = a;
                int i23 = ((i22 | 75) << 1) - (i22 ^ 75);
                b = i23 % 128;
                int i24 = i23 % 2;
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            g = true;
            int i25 = (-2) - ((a + 124) ^ (-1));
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        Field field = h;
        if (field == null) {
            int i27 = a;
            int i28 = i27 & 41;
            int i29 = (((i27 ^ 41) | i28) << 1) - ((i27 | 41) & (~i28));
            b = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 56 / 0;
                return;
            }
            return;
        }
        try {
            LongSparseArray longSparseArray2 = (LongSparseArray) field.get(obj);
            int i31 = b;
            int i32 = i31 ^ 59;
            int i33 = (((i31 & 59) | i32) << 1) - i32;
            a = i33 % 128;
            int i34 = i33 % 2;
            longSparseArray = longSparseArray2;
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            int i35 = a;
            int i36 = ((i35 & 114) + (i35 | 114)) - 1;
            b = i36 % 128;
            int i37 = i36 % 2;
            longSparseArray.clear();
            int i38 = a;
            int i39 = (((i38 | 18) << 1) - (i38 ^ 18)) - 1;
            b = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = a;
        int i42 = ((i41 ^ 121) | (i41 & 121)) << 1;
        int i43 = -(((~i41) & 121) | (i41 & (-122)));
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        b = i44 % 128;
        int i45 = i44 % 2;
    }
}
