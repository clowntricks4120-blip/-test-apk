package ivas.gov.bisp.enumeration.p089l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import ivas.gov.bisp.enumeration.H.j;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static int a = 1;
    private static int b;

    public static class aVe {
        private static int a = 0;
        private static int b = 1;

        public static EdgeEffect b(Context context, AttributeSet attributeSet) {
            int i = 2 % 2;
            try {
                EdgeEffect edgeEffect = new EdgeEffect(context, attributeSet);
                int i2 = b;
                int i3 = i2 ^ 39;
                int i4 = -(-((i2 & 39) << 1));
                int i5 = (i3 & i4) + (i4 | i3);
                a = i5 % 128;
                int i6 = i5 % 2;
                return edgeEffect;
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float c(EdgeEffect edgeEffect) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-28)) | ((~i2) & 27);
            int i4 = -(-((i2 & 27) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            try {
                float distance = edgeEffect.getDistance();
                int i7 = b;
                int i8 = i7 & 109;
                int i9 = (((i7 | 109) & (~i8)) - (~(i8 << 1))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float d(EdgeEffect edgeEffect, float f, float f2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-68)) | ((~i2) & 67)) + ((i2 & 67) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            try {
                float fOnPullDistance = edgeEffect.onPullDistance(f, f2);
                int i5 = b;
                int i6 = i5 & 27;
                int i7 = (((i5 | 27) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
                a = i7 % 128;
                int i8 = i7 % 2;
                return fOnPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        int i = 2 % 2;
        int i2 = a + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (!j.b()) {
            int i4 = a;
            int i5 = i4 & 115;
            int i6 = ((i4 | 115) & (~i5)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return 0.0f;
        }
        int i8 = a + 19;
        b = i8 % 128;
        int i9 = i8 % 2;
        float fC = aVe.c(edgeEffect);
        int i10 = b;
        int i11 = ((i10 & (-72)) | ((~i10) & 71)) + ((i10 & 71) << 1);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 69 / 0;
        }
        return fC;
    }

    public static float c(EdgeEffect edgeEffect, float f, float f2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - (((i2 ^ 68) + ((i2 & 68) << 1)) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (!j.b()) {
            edgeEffect.onPull(f, f2);
            int i5 = a;
            int i6 = i5 & 27;
            int i7 = i6 + ((i5 ^ 27) | i6);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return f;
            }
            obj.hashCode();
            throw null;
        }
        int i8 = b;
        int i9 = (((i8 | 114) << 1) - (i8 ^ 114)) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            aVe.d(edgeEffect, f, f2);
            obj.hashCode();
            throw null;
        }
        float fD = aVe.d(edgeEffect, f, f2);
        int i10 = a;
        int i11 = i10 ^ 57;
        int i12 = (((i10 & 57) | i11) << 1) - i11;
        b = i12 % 128;
        int i13 = i12 % 2;
        return fD;
    }
}
