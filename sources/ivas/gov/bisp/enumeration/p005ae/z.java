package ivas.gov.bisp.enumeration.p005ae;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class z {
    private static int a = 1;
    private static int b;
    public static final ThreadLocal<Matrix> c = new ThreadLocal<>();
    public static final ThreadLocal<RectF> d;

    static {
        ThreadLocal<RectF> threadLocal = new ThreadLocal<>();
        int i = b;
        int i2 = i & 29;
        int i3 = -(-((i ^ 29) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        a = i4 % 128;
        int i5 = i4 % 2;
        d = threadLocal;
        if (i5 == 0) {
            throw null;
        }
    }

    public static void b(ViewParent viewParent, View view, Matrix matrix) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 109) + (i2 | 109);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = view.getParent() instanceof View;
            obj.hashCode();
            throw null;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            int i4 = b + 23;
            a = i4 % 128;
            int i5 = i4 % 2;
            View view2 = (View) parent;
            b(viewParent, view2, matrix);
            int scrollX = view2.getScrollX();
            int i6 = b;
            int i7 = i6 & 23;
            int i8 = (i6 ^ 23) | i7;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            matrix.preTranslate(-scrollX, -view2.getScrollY());
            int i11 = b;
            int i12 = (i11 & (-66)) | ((~i11) & 65);
            int i13 = -(-((i11 & 65) << 1));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        int i16 = a;
        int i17 = (i16 & 61) + (i16 | 61);
        b = i17 % 128;
        int i18 = i17 % 2;
        if (!view.getMatrix().isIdentity()) {
            int i19 = a;
            int i20 = i19 & 99;
            int i21 = (i19 ^ 99) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            b = i22 % 128;
            int i23 = i22 % 2;
            matrix.preConcat(view.getMatrix());
            int i24 = a;
            int i25 = ((i24 | 55) << 1) - (i24 ^ 55);
            b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = b;
        int i28 = (i27 ^ 59) + ((i27 & 59) << 1);
        a = i28 % 128;
        if (i28 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
