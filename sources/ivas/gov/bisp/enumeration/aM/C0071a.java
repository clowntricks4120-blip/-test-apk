package ivas.gov.bisp.enumeration.aM;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aM.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0071a {
    private static int a = 0;
    private static int b = 1;

    public static <T> ObjectAnimator b(T t, Property<T, PointF> property, Path path) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        int i5 = b;
        int i6 = (i5 ^ 74) + ((i5 & 74) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return objectAnimatorOfObject;
    }
}
