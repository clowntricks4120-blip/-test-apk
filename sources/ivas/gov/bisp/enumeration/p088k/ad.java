package ivas.gov.bisp.enumeration.p088k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import ivas.gov.bisp.enumeration.Y.A;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p007ag.j;

/* JADX INFO: loaded from: classes.dex */
public class ad {
    private static int a = 0;
    private static int b = 1;
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;

    static {
        int[] iArr;
        int[] iArr2 = new int[1];
        int i2 = b;
        int i3 = i2 + 101;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            iArr2[0] = -16842910;
        } else {
            iArr2[0] = -16842910;
        }
        d = iArr2;
        int[] iArr3 = new int[1];
        int i4 = i2 & 95;
        int i5 = (~i4) & (i2 | 95);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        int i8 = i7 % 2;
        iArr3[0] = 16842908;
        e = iArr3;
        int[] iArr4 = new int[1];
        int i9 = (-2) - (((i2 ^ 50) + ((i2 & 50) << 1)) ^ (-1));
        a = i9 % 128;
        if (i9 % 2 != 0) {
            iArr4[0] = 16842919;
            f = iArr4;
            iArr = new int[0];
        } else {
            iArr4[0] = 16842919;
            f = iArr4;
            iArr = new int[1];
        }
        int i10 = i2 & 19;
        int i11 = (i2 | 19) & (~i10);
        int i12 = -(-(i10 << 1));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        iArr[0] = 16842912;
        h = iArr;
        int i16 = i14 + 51;
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        g = new int[0];
        i = new int[1];
        int i19 = i17 + 89;
        a = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 36 / 0;
        }
    }

    public static int d(Context context, int i2) {
        int[] iArr;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & 115) + (i4 | 115);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            iArr = i;
            iArr[0] = i2;
        } else {
            iArr = i;
            iArr[0] = i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            int i6 = a + 51;
            b = i6 % 128;
            int i7 = i6 % 2;
            typedArrayObtainStyledAttributes.recycle();
            int i8 = a + 39;
            b = i8 % 128;
            int i9 = i8 % 2;
            return color;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0026, PHI: r5
  0x0035: PHI (r5v2 android.content.res.TypedArray) = (r5v1 android.content.res.TypedArray), (r5v5 android.content.res.TypedArray) binds: [B:12:0x0033, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:5:0x001f, B:13:0x0035, B:15:0x004d, B:18:0x006a, B:19:0x0075, B:11:0x002f), top: B:25:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x006a A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #0 {all -> 0x0026, blocks: (B:5:0x001f, B:13:0x0035, B:15:0x004d, B:18:0x006a, B:19:0x0075, B:11:0x002f), top: B:25:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0075 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:5:0x001f, B:13:0x0035, B:15:0x004d, B:18:0x006a, B:19:0x0075, B:11:0x002f), top: B:25:0x0017 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes;
        StringBuilder sb;
        int i2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (-2) - ((((i4 | 56) << 1) - (i4 ^ 56)) ^ (-1));
        a = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.l);
                if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                    sb = new StringBuilder();
                    sb.append("View ");
                    int i6 = a;
                    int i7 = (i6 ^ 15) + ((i6 & 15) << 1);
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    sb.append(view.getClass());
                    sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                    int i9 = b;
                    int i10 = i9 & 77;
                    i2 = i10 + ((i9 ^ 77) | i10);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        Log.e("ThemeUtils", sb.toString());
                        int i11 = 6 / 0;
                    } else {
                        Log.e("ThemeUtils", sb.toString());
                    }
                    int i12 = b;
                    int i13 = (i12 & (-10)) | ((~i12) & 9);
                    int i14 = -(-((i12 & 9) << 1));
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    a = i15 % 128;
                    int i16 = i15 % 2;
                }
            } else {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.l);
                if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                    sb = new StringBuilder();
                    sb.append("View ");
                    int i17 = a;
                    int i18 = (i17 ^ 15) + ((i17 & 15) << 1);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    sb.append(view.getClass());
                    sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                    int i20 = b;
                    int i110 = i20 & 77;
                    i2 = i110 + ((i20 ^ 77) | i110);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        Log.e("ThemeUtils", sb.toString());
                        int i111 = 6 / 0;
                    } else {
                        Log.e("ThemeUtils", sb.toString());
                    }
                    int i112 = b;
                    int i113 = (i112 & (-10)) | ((~i112) & 9);
                    int i114 = -(-((i112 & 9) << 1));
                    int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                    a = i115 % 128;
                    int i116 = i115 % 2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i21 = a + 17;
            b = i21 % 128;
            int i22 = i21 % 2;
        } catch (Throwable th) {
            context.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    public static ColorStateList e(Context context, int i2) {
        int[] iArr;
        ColorStateList colorStateList;
        int resourceId;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 11;
        int i6 = -(-((i4 ^ 11) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            iArr = i;
            iArr[0] = i2;
        } else {
            iArr = i;
            iArr[0] = i2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!(!typedArrayObtainStyledAttributes.hasValue(0))) {
                int i8 = b;
                int i9 = i8 & 3;
                int i10 = i8 | 3;
                int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                a = i11 % 128;
                if (i11 % 2 != 0) {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    if (resourceId != 0) {
                        int i12 = a;
                        int i13 = i12 & 105;
                        int i14 = (i12 | 105) & (~i13);
                        int i15 = -(-(i13 << 1));
                        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                        b = i16 % 128;
                        int i17 = i16 % 2;
                        colorStateList = A.b(context, resourceId);
                        if (colorStateList != null) {
                            int i18 = a;
                            int i19 = ((i18 & 28) + (i18 | 28)) - 1;
                            b = i19 % 128;
                            int i20 = i19 % 2;
                        }
                    }
                } else {
                    resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        int i110 = a;
                        int i111 = i110 & 105;
                        int i112 = (i110 | 105) & (~i111);
                        int i113 = -(-(i111 << 1));
                        int i114 = (i112 ^ i113) + ((i112 & i113) << 1);
                        b = i114 % 128;
                        int i115 = i114 % 2;
                        colorStateList = A.b(context, resourceId);
                        if (colorStateList != null) {
                            int i116 = a;
                            int i117 = ((i116 & 28) + (i116 | 28)) - 1;
                            b = i117 % 128;
                            int i21 = i117 % 2;
                        }
                    }
                }
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
                int i22 = b + 117;
                a = i22 % 128;
                int i23 = i22 % 2;
            } else {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
                int i24 = b + 117;
                a = i24 % 128;
                int i25 = i24 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i26 = a;
            int i27 = (((i26 | 8) << 1) - (i26 ^ 8)) - 1;
            b = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 7 / 0;
            }
            return colorStateList;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static int c(Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 122) + ((i4 & 122) << 1)) - 1;
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            e(context, i2);
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateListE = e(context, i2);
        if (colorStateListE != null) {
            int i6 = a;
            int i7 = i6 & 27;
            int i8 = ((i6 | 27) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (colorStateListE.isStateful()) {
                int i10 = a;
                int i11 = ((i10 & 18) + (i10 | 18)) - 1;
                b = i11 % 128;
                if (i11 % 2 != 0) {
                    return colorStateListE.getColorForState(d, colorStateListE.getDefaultColor());
                }
                int i12 = 59 / 0;
                return colorStateListE.getColorForState(d, colorStateListE.getDefaultColor());
            }
        }
        ThreadLocal<TypedValue> threadLocal = c;
        TypedValue typedValue = threadLocal.get();
        int i13 = b;
        int i14 = ((i13 ^ 15) | (i13 & 15)) << 1;
        int i15 = -(((~i13) & 15) | (i13 & (-16)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        if (typedValue == null) {
            typedValue = new TypedValue();
            int i18 = b;
            int i19 = (i18 & 13) + (i18 | 13);
            a = i19 % 128;
            int i20 = i19 % 2;
            threadLocal.set(typedValue);
            int i21 = a;
            int i22 = i21 & 111;
            int i23 = -(-(i21 | 111));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            b = i24 % 128;
            int i25 = i24 % 2;
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        int i26 = a;
        int i27 = (((i26 | 38) << 1) - (i26 ^ 38)) - 1;
        b = i27 % 128;
        if (i27 % 2 == 0) {
            typedValue.getFloat();
            d(context, i2);
            obj.hashCode();
            throw null;
        }
        float f2 = typedValue.getFloat();
        int iD = d(context, i2);
        float fAlpha = Color.alpha(iD) * f2;
        int i28 = b;
        int i29 = ((i28 & (-42)) | ((~i28) & 41)) + ((i28 & 41) << 1);
        a = i29 % 128;
        int i30 = i29 % 2;
        int iRound = Math.round(fAlpha);
        if (i30 == 0) {
            return j.f(iD, iRound);
        }
        j.f(iD, iRound);
        throw null;
    }
}
