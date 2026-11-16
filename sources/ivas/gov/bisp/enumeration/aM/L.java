package ivas.gov.bisp.enumeration.aM;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import ivas.gov.bisp.enumeration.p006af.h;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class L {
    private static int a = 1;
    private static int b;
    public static final h c;
    public static final Property<View, Float> d;

    public static final class bHL extends Property<View, Float> {
        private static int a = 1;
        private static int b;

        public bHL(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 15;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 15)) & i3);
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            Float fValueOf = Float.valueOf(L.b(view));
            int i8 = b;
            int i9 = ((i8 & (-10)) | ((~i8) & 9)) + ((i8 & 9) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return fValueOf;
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2;
            float fFloatValue;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 41;
            int i4 = (i2 ^ 41) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                view2 = view;
                fFloatValue = f.floatValue();
                int i6 = 9 / 0;
            } else {
                view2 = view;
                fFloatValue = f.floatValue();
            }
            L.c.q(view2, fFloatValue);
            int i7 = b;
            int i8 = i7 & 79;
            int i9 = (i8 - (~((i7 ^ 79) | i8))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static final class bHM extends Property<View, Rect> {
        private static int a = 0;
        private static int b = 1;

        public bHM(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            int i = 2 % 2;
            int i2 = b + 35;
            a = i2 % 128;
            int i3 = i2 % 2;
            View view2 = view;
            Rect rect2 = rect;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
            int i4 = b;
            int i5 = ((i4 & 86) + (i4 | 86)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                ivas.gov.bisp.enumeration.d.T.aWZ.d(view2, rect2);
                return;
            }
            ivas.gov.bisp.enumeration.d.T.aWZ.d(view2, rect2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 19;
            int i4 = ((i2 ^ 19) | i3) << 1;
            int i5 = -((i2 | 19) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = ivas.gov.bisp.enumeration.p081d.T.c;
            Rect rectB = ivas.gov.bisp.enumeration.d.T.aWZ.b(view);
            int i8 = b;
            int i9 = i8 & 13;
            int i10 = (i9 - (~((i8 ^ 13) | i9))) - 1;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return rectB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            c = new V();
            int i = a;
            int i2 = (-2) - ((((i | 44) << 1) - (i ^ 44)) ^ (-1));
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            c = new am();
            int i5 = b;
            int i6 = (i5 & 101) + (i5 | 101);
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        d = new bHL(Float.class, "translationAlpha");
        new bHM(Rect.class, "clipBounds");
        int i9 = a;
        int i10 = ((i9 | 105) << 1) - (i9 ^ 105);
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public static float b(View view) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 | 117) << 1;
        int i4 = -(i2 ^ 117);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        float fM = c.m(view);
        int i7 = b;
        int i8 = ((i7 & 88) + (i7 | 88)) - 1;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 38 / 0;
        }
        return fM;
    }

    public static void c(View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (((i6 & (-10)) | ((~i6) & 9)) - (~(-(-((i6 & 9) << 1))))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            c.o(view, i, i2, i3, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        c.o(view, i, i2, i3, i4);
        int i8 = a;
        int i9 = i8 & 109;
        int i10 = (i9 - (~(-(-((i8 ^ 109) | i9))))) - 1;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 65 / 0;
        }
    }
}
