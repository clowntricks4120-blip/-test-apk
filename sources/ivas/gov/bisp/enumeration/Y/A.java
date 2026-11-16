package ivas.gov.bisp.enumeration.Y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p002ab.J;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p088k.K;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class A {
    private static int a = 0;
    private static int b = 1;

    public static ColorStateList b(Context context, int i) {
        ColorStateList colorStateListB;
        ColorStateList colorStateList;
        C0084m.aUS aus;
        Object obj = l.c;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = C0084m.c;
        C0084m.aUT aut = new C0084m.aUT(resources, theme);
        synchronized (C0084m.e) {
            SparseArray<C0084m.aUS> sparseArray = C0084m.d.get(aut);
            colorStateListB = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (aus = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (aus.b.equals(resources.getConfiguration())) {
                colorStateList = aus.a;
            } else {
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal2 = C0084m.c;
        TypedValue typedValue = threadLocal2.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal2.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListB = J.b(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListB == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (C0084m.e) {
            WeakHashMap<C0084m.aUT, SparseArray<C0084m.aUS>> weakHashMap = C0084m.d;
            SparseArray<C0084m.aUS> sparseArray2 = weakHashMap.get(aut);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(aut, sparseArray2);
            }
            sparseArray2.append(i, new C0084m.aUS(colorStateListB, aut.c.getConfiguration()));
        }
        return colorStateListB;
    }

    public static Drawable c(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 115) << 1) - (i3 ^ 115);
        b = i4 % 128;
        int i5 = i4 % 2;
        Drawable drawableJ = K.c().j(context, i);
        int i6 = a;
        int i7 = i6 ^ 119;
        int i8 = (i6 & 119) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return drawableJ;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
