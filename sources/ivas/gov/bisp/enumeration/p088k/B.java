package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p002ab.C0084m;

/* JADX INFO: loaded from: classes.dex */
public class B {
    private static int a = 0;
    private static int b = 1;
    public final Context c;
    public final TypedArray d;
    public TypedValue e;

    public B(Context context, TypedArray typedArray) {
        this.c = context;
        this.d = typedArray;
    }

    public static B d(Context context, AttributeSet attributeSet, int[] iArr) {
        int i = 2 % 2;
        B b2 = new B(context, context.obtainStyledAttributes(attributeSet, iArr));
        int i2 = b + 125;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return b2;
        }
        throw null;
    }

    public Typeface e(int i, int i2, C0084m.aTa ata) {
        int resourceId;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 15;
        int i6 = -(-((i4 ^ 15) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        Typeface typefaceC = null;
        if (i7 % 2 != 0 ? (resourceId = this.d.getResourceId(i, 0)) == 0 : (resourceId = this.d.getResourceId(i, 1)) == 0) {
            int i8 = a;
            int i9 = (i8 & (-110)) | ((~i8) & 109);
            int i10 = -(-((i8 & 109) << 1));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            typefaceC.hashCode();
            throw null;
        }
        int i12 = resourceId;
        if (this.e == null) {
            this.e = new TypedValue();
            int i13 = b;
            int i14 = i13 & 39;
            int i15 = (((i13 ^ 39) | i14) << 1) - ((i13 | 39) & (~i14));
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        Context context = this.c;
        TypedValue typedValue = this.e;
        int i17 = b;
        int i18 = i17 & 53;
        int i19 = -(-((i17 ^ 53) | i18));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        int i21 = i20 % 2;
        ThreadLocal<TypedValue> threadLocal = C0084m.c;
        if (!context.isRestricted()) {
            typefaceC = C0084m.c(context, i12, typedValue, i2, ata, null, true, false);
            int i22 = a;
            int i23 = (i22 & 17) + (i22 | 17);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 3 % 2;
            }
        } else {
            int i25 = b;
            int i26 = (-2) - ((i25 + 20) ^ (-1));
            a = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 41 / 0;
            }
            int i28 = ((i25 ^ 4) + ((i25 & 4) << 1)) - 1;
            a = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 5 % 4;
            }
        }
        int i30 = a;
        int i31 = i30 & 27;
        int i32 = (i31 - (~((i30 ^ 27) | i31))) - 1;
        b = i32 % 128;
        int i33 = i32 % 2;
        return typefaceC;
    }

    public boolean f(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 & (-10)) | ((~i3) & 9)) + ((i3 & 9) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.d.getBoolean(i, z);
        if (i5 == 0) {
            int i6 = 44 / 0;
        }
        return z2;
    }

    public int g(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 51;
        int i6 = -(-((i4 & 51) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int color = this.d.getColor(i, i2);
        int i9 = b;
        int i10 = (i9 ^ 10) + ((i9 & 10) << 1);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        return color;
    }

    public float i(int i, float f) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-70)) | ((~i3) & 69);
        int i5 = (i3 & 69) << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        float dimension = this.d.getDimension(i, f);
        int i8 = a;
        int i9 = i8 & 123;
        int i10 = ((i8 | 123) & (~i9)) + (i9 << 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            return dimension;
        }
        throw null;
    }

    public int j(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 69;
        int i6 = ((i4 & 69) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        int dimensionPixelSize = this.d.getDimensionPixelSize(i, i2);
        if (i9 == 0) {
            int i10 = 5 / 0;
        }
        return dimensionPixelSize;
    }

    public int k(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 ^ 97;
        int i6 = (i4 & 97) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        int dimensionPixelOffset = this.d.getDimensionPixelOffset(i, i2);
        int i9 = a;
        int i10 = ((i9 & 98) + (i9 | 98)) - 1;
        b = i10 % 128;
        int i11 = i10 % 2;
        return dimensionPixelOffset;
    }

    public Drawable m(int i) {
        int resourceId;
        Drawable drawableL;
        if (!this.d.hasValue(i) || (resourceId = this.d.getResourceId(i, 0)) == 0) {
            return null;
        }
        P pC = P.c();
        Context context = this.c;
        synchronized (pC) {
            drawableL = pC.e.l(context, resourceId, true);
        }
        return drawableL;
    }

    public int n(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 29;
        int i6 = ((i4 | 29) & (~i5)) + (i5 << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.d.getInt(i, i2);
        int i9 = a;
        int i10 = (i9 & 101) + (i9 | 101);
        b = i10 % 128;
        int i11 = i10 % 2;
        return i8;
    }

    public int o(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        TypedArray typedArray = this.d;
        if (i5 != 0) {
            return typedArray.getInteger(i, i2);
        }
        typedArray.getInteger(i, i2);
        throw null;
    }

    public int p(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (-2) - ((((i4 | 116) << 1) - (i4 ^ 116)) ^ (-1));
        a = i5 % 128;
        int i6 = i5 % 2;
        int layoutDimension = this.d.getLayoutDimension(i, i2);
        int i7 = b;
        int i8 = i7 ^ 19;
        int i9 = -(-((i7 & 19) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        a = i10 % 128;
        if (i10 % 2 == 0) {
            return layoutDimension;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String q(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & (-122)) | ((~i3) & 121);
        int i5 = -(-((i3 & 121) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        String string = this.d.getString(i);
        int i8 = b;
        int i9 = i8 & 15;
        int i10 = (i9 - (~(-(-((i8 ^ 15) | i9))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public int r(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 75;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            this.d.getResourceId(i, i2);
            throw null;
        }
        int resourceId = this.d.getResourceId(i, i2);
        int i5 = a + 9;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return resourceId;
    }

    public CharSequence s(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 ^ 17) | (i3 & 17)) << 1;
        int i5 = -(((~i3) & 17) | (i3 & (-18)));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        CharSequence text = this.d.getText(i);
        if (i7 != 0) {
            int i8 = 18 / 0;
        }
        return text;
    }

    public boolean t(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 13;
        int i5 = -(-(i3 | 13));
        int i6 = (i4 & i5) + (i5 | i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        boolean zHasValue = this.d.hasValue(i);
        if (i7 != 0) {
            int i8 = 9 / 0;
        }
        int i9 = a;
        int i10 = (i9 & (-68)) | ((~i9) & 67);
        int i11 = -(-((i9 & 67) << 1));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return zHasValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static B c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int i3 = 2 % 2;
        B b2 = new B(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
        int i4 = b;
        int i5 = i4 & 57;
        int i6 = -(-((i4 ^ 57) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        a = i7 % 128;
        int i8 = i7 % 2;
        return b2;
    }

    public Drawable l(int i) {
        int resourceId;
        int i2 = 2 % 2;
        int i3 = b + 45;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.d.hasValue(i);
            obj.hashCode();
            throw null;
        }
        if ((!this.d.hasValue(i)) || (resourceId = this.d.getResourceId(i, 0)) == 0) {
            Drawable drawable = this.d.getDrawable(i);
            int i4 = a;
            int i5 = i4 & 57;
            int i6 = (((i4 | 57) & (~i5)) - (~(i5 << 1))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 0;
            }
            return drawable;
        }
        int i8 = b;
        int i9 = i8 ^ 69;
        int i10 = (i8 & 69) << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
        Drawable drawableC = A.c(this.c, resourceId);
        int i13 = a;
        int i14 = ((i13 & 25) - (~(i13 | 25))) - 1;
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return drawableC;
        }
        throw null;
    }

    public ColorStateList h(int i) {
        int resourceId;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 ^ 87;
        int i5 = ((((i3 & 87) | i4) << 1) - (~(-i4))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            this.d.hasValue(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!this.d.hasValue(i))) {
            int i6 = a;
            int i7 = ((i6 | 63) << 1) - (i6 ^ 63);
            b = i7 % 128;
            if (i7 % 2 != 0 ? (resourceId = this.d.getResourceId(i, 0)) != 0 : (resourceId = this.d.getResourceId(i, 0)) != 0) {
                ColorStateList colorStateListB = A.b(this.c, resourceId);
                if (colorStateListB != null) {
                    int i8 = b;
                    int i9 = (i8 | 1) << 1;
                    int i10 = -(i8 ^ 1);
                    int i11 = (i9 & i10) + (i9 | i10);
                    a = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = i8 + 69;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    return colorStateListB;
                }
            }
        }
        ColorStateList colorStateList = this.d.getColorStateList(i);
        int i15 = a;
        int i16 = (i15 ^ 23) + ((i15 & 23) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        return colorStateList;
    }
}
