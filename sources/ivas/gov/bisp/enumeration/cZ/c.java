package ivas.gov.bisp.enumeration.cZ;

import android.R;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;
    public static final int[] c;
    public static final int[] d = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] e = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] f = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;

    static {
        int[] iArr = {R.attr.name, R.attr.pathData, R.attr.fillType};
        int i2 = (0 - (-36)) - 1;
        int i3 = i2 % 128;
        a = i3;
        if (i2 % 2 == 0) {
            g = iArr;
            int[] iArr2 = new int[0];
            iArr2[1] = 16843161;
            i = iArr2;
        } else {
            g = iArr;
            i = new int[]{R.attr.drawable};
        }
        int i4 = (i3 & (-12)) | ((~i3) & 11);
        int i5 = (i3 & 11) << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        h = new int[]{R.attr.name, R.attr.animation};
        j = new int[]{R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
        int[] iArr3 = new int[1];
        int i8 = ((i3 | 83) << 1) - (i3 ^ 83);
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 != 0) {
            iArr3[0] = 16843490;
            k = iArr3;
            c = new int[]{R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
            l = new int[]{R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        iArr3[0] = 16843490;
        k = iArr3;
        c = new int[]{R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
        l = new int[]{R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
        int i10 = ((i9 ^ 87) | (i9 & 87)) << 1;
        int i11 = -((i9 & (-88)) | ((~i9) & 87));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        m = new int[]{R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
        n = new int[]{R.attr.controlX1, R.attr.controlY1, R.attr.controlX2, R.attr.controlY2, R.attr.pathData};
        int i15 = i13 & 109;
        int i16 = (i15 - (~(-(-((i13 ^ 109) | i15))))) - 1;
        b = i16 % 128;
        int i17 = i16 % 2;
    }
}
