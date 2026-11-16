package ivas.gov.bisp.enumeration.T;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r extends Property<Drawable, Integer> {
    private static int a = 1;
    private static int b;
    public static final Property<Drawable, Integer> c = new r();

    static {
        int i = a + 61;
        b = i % 128;
        int i2 = i % 2;
    }

    public r() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 67;
        int i4 = ((((i2 ^ 67) | i3) << 1) - (~(-((i2 | 67) & (~i3))))) - 1;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            Integer.valueOf(drawable.getAlpha());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer numValueOf = Integer.valueOf(drawable.getAlpha());
        int i5 = a;
        int i6 = i5 ^ 37;
        int i7 = ((i5 & 37) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return numValueOf;
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 | 67;
        int i6 = ((i5 << 1) - (~(-((~(i2 & 67)) & i5)))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        drawable.setAlpha(num.intValue());
        int i8 = b + 13;
        a = i8 % 128;
        int i9 = i8 % 2;
    }
}
