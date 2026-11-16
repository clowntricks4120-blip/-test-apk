package ivas.gov.bisp.enumeration.P;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<Matrix> c = new ThreadLocal<>();
    public static final ThreadLocal<RectF> d;

    static {
        ThreadLocal<RectF> threadLocal = new ThreadLocal<>();
        int i = a;
        int i2 = ((i | 91) << 1) - (i ^ 91);
        b = i2 % 128;
        int i3 = i2 % 2;
        d = threadLocal;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
    }

    public static void c(ViewParent viewParent, View view, Matrix matrix) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 51;
        int i4 = ((i2 & 51) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            int i8 = a;
            int i9 = i8 & 7;
            int i10 = (i8 | 7) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (parent != viewParent) {
                View view2 = (View) parent;
                c(viewParent, view2, matrix);
                int i13 = b + 35;
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
                    throw null;
                }
                matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
                int i14 = b;
                int i15 = i14 ^ 1;
                int i16 = (i14 & 1) << 1;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                int i18 = i17 % 128;
                a = i18;
                int i19 = i17 % 2;
                int i20 = i18 + 26;
                int i21 = (i20 ^ (-1)) + (i20 << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        int i23 = a;
        int i24 = i23 & 79;
        int i25 = ((i23 ^ 79) | i24) << 1;
        int i26 = -((i23 | 79) & (~i24));
        int i27 = (i25 & i26) + (i26 | i25);
        b = i27 % 128;
        int i28 = i27 % 2;
        if (!view.getMatrix().isIdentity()) {
            int i29 = a;
            int i30 = ((i29 | 51) << 1) - (i29 ^ 51);
            b = i30 % 128;
            if (i30 % 2 != 0) {
                matrix.preConcat(view.getMatrix());
                int i31 = 66 / 0;
            } else {
                matrix.preConcat(view.getMatrix());
            }
        }
        int i32 = b;
        int i33 = ((i32 & (-44)) | ((~i32) & 43)) + ((i32 & 43) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
    }

    public static void b(ViewGroup viewGroup, View view, Rect rect) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 29;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 29)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int width = view.getWidth();
        int height = view.getHeight();
        int i8 = a + 61;
        b = i8 % 128;
        int i9 = i8 % 2;
        rect.set(0, 0, width, height);
        ThreadLocal<Matrix> threadLocal = c;
        Matrix matrix = threadLocal.get();
        int i10 = a;
        int i11 = i10 ^ 23;
        int i12 = -(-((i10 & 23) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        Object obj = null;
        if (i13 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Matrix matrix2 = matrix;
        if (matrix2 == null) {
            matrix2 = new Matrix();
            threadLocal.set(matrix2);
            int i14 = a;
            int i15 = i14 & 9;
            int i16 = ((i14 ^ 9) | i15) << 1;
            int i17 = -((i14 | 9) & (~i15));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
        } else {
            matrix2.reset();
            int i20 = b;
            int i21 = (i20 ^ 39) + ((i20 & 39) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
        }
        c(viewGroup, view, matrix2);
        ThreadLocal<RectF> threadLocal2 = d;
        RectF rectF = threadLocal2.get();
        int i23 = b;
        int i24 = i23 & 27;
        int i25 = ((i23 | 27) & (~i24)) + (i24 << 1);
        a = i25 % 128;
        int i26 = i25 % 2;
        RectF rectF2 = rectF;
        if (rectF2 == null) {
            rectF2 = new RectF();
            threadLocal2.set(rectF2);
            int i27 = a;
            int i28 = i27 & 19;
            int i29 = ((i27 | 19) & (~i28)) + (i28 << 1);
            b = i29 % 128;
            int i30 = i29 % 2;
        }
        rectF2.set(rect);
        matrix2.mapRect(rectF2);
        float f = rectF2.left;
        int i31 = b;
        int i32 = (i31 ^ 79) + ((i31 & 79) << 1);
        a = i32 % 128;
        int i33 = i32 % 2;
        int i34 = (int) (rectF2.top + 0.5f);
        float f2 = rectF2.right;
        int i35 = b;
        int i36 = i35 & 75;
        int i37 = (i35 ^ 75) | i36;
        int i38 = (i36 & i37) + (i37 | i36);
        a = i38 % 128;
        int i39 = i38 % 2;
        rect.set((int) (f + 0.5f), i34, (int) (f2 + 0.5f), (int) (rectF2.bottom + 0.5f));
        int i40 = a;
        int i41 = ((i40 ^ 36) + ((i40 & 36) << 1)) - 1;
        b = i41 % 128;
        if (i41 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
