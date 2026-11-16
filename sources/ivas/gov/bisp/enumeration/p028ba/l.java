package ivas.gov.bisp.enumeration.p028ba;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.animation.PathInterpolator;
import ivas.gov.bisp.enumeration.aL.c;
import ivas.gov.bisp.enumeration.p007ag.r;
import ivas.gov.bisp.enumeration.p091n.j;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v3 float) = (r3v2 float), (r3v7 float) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static float b(String[] strArr, int i) {
        float f;
        int i2;
        int i3;
        Object obj;
        int i4;
        int i5 = 2 % 2;
        int i6 = a + 39;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            f = Float.parseFloat(strArr[i]);
            if (f >= 0.0f) {
                if (f <= 1.0f) {
                    int i7 = a;
                    int i8 = i7 ^ 67;
                    int i9 = (i7 & 67) << 1;
                    i2 = ((i8 | i9) << 1) - (i9 ^ i8);
                    i3 = i2 % 128;
                    b = i3;
                    obj = null;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    i4 = i3 + 13;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return f;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            f = Float.parseFloat(strArr[i]);
            if (f >= 0.0f) {
                if (f <= 1.0f) {
                    int i10 = a;
                    int i11 = i10 ^ 67;
                    int i12 = (i10 & 67) << 1;
                    i2 = ((i11 | i12) << 1) - (i12 ^ i11);
                    i3 = i2 % 128;
                    b = i3;
                    obj = null;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    i4 = i3 + 13;
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        return f;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean c(String str, String str2) {
        boolean z;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        int i2 = a;
        int i3 = i2 & 93;
        int i4 = -(-((i2 ^ 93) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            sb.append("(");
            str.startsWith(sb.toString());
            throw null;
        }
        sb.append("(");
        if ((!str.startsWith(sb.toString())) || !str.endsWith(")")) {
            int i6 = a;
            int i7 = i6 & 83;
            int i8 = (i6 | 83) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        } else {
            int i12 = b;
            int i13 = ((i12 & (-110)) | ((~i12) & 109)) + ((i12 & 109) << 1);
            int i14 = i13 % 128;
            a = i14;
            int i15 = i13 % 2;
            int i16 = i14 & 45;
            int i17 = (i16 - (~((i14 ^ 45) | i16))) - 1;
            b = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 3 % 3;
            }
            z = true;
        }
        int i19 = b;
        int i20 = (i19 ^ 89) + ((i19 & 89) << 1);
        a = i20 % 128;
        int i21 = i20 % 2;
        return z;
    }

    public static int d(Context context, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = b + 51;
        a = i4 % 128;
        int i5 = i4 % 2;
        TypedValue typedValueB = c.b(context, i);
        if (typedValueB != null) {
            int i6 = (-2) - ((a + 114) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            if (typedValueB.type == 16) {
                int i8 = a;
                int i9 = ((i8 | 5) << 1) - (i8 ^ 5);
                b = i9 % 128;
                int i10 = i9 % 2;
                i2 = typedValueB.data;
                int i11 = b;
                int i12 = i11 & 21;
                int i13 = (i11 | 21) & (~i12);
                int i14 = i12 << 1;
                int i15 = (i13 & i14) + (i13 | i14);
                a = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        int i17 = a;
        int i18 = i17 & 83;
        int i19 = (((i17 ^ 83) | i18) << 1) - ((i17 | 83) & (~i18));
        b = i19 % 128;
        int i20 = i19 % 2;
        return i2;
    }

    public static TimeInterpolator e(Context context, int i, TimeInterpolator timeInterpolator) {
        String strSubstring;
        int i2 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        int i3 = b;
        int i4 = (-2) - (((i3 ^ 110) + ((i3 & 110) << 1)) ^ (-1));
        a = i4 % 128;
        if (i4 % 2 != 0 ? !theme.resolveAttribute(i, typedValue, true) : (!theme.resolveAttribute(i, typedValue, false))) {
            int i5 = b;
            int i6 = i5 & 115;
            int i7 = (i5 | 115) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return timeInterpolator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i10 = a;
        int i11 = i10 & 27;
        int i12 = (i10 ^ 27) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        int i15 = b;
        int i16 = i15 & 65;
        int i17 = ((i15 ^ 65) | i16) << 1;
        int i18 = -((i15 | 65) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        String strValueOf = String.valueOf(typedValue.string);
        int i21 = b;
        int i22 = i21 & 69;
        int i23 = (i21 ^ 69) | i22;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        a = i24 % 128;
        int i25 = i24 % 2;
        if (!c(strValueOf, "cubic-bezier")) {
            if (!c(strValueOf, "path")) {
                throw new IllegalArgumentException(j.r("Invalid motion easing type: ", strValueOf));
            }
            int i26 = b + 31;
            a = i26 % 128;
            if (i26 % 2 == 0) {
                int length = strValueOf.length();
                strSubstring = strValueOf.substring(2, (((length ^ (-1)) | length) << 1) - (~length));
            } else {
                int length2 = strValueOf.length();
                int i27 = length2 ^ (-1);
                strSubstring = strValueOf.substring(5, (((length2 | i27) << 1) - (~(-i27))) - 1);
            }
            PathInterpolator pathInterpolator = new PathInterpolator(r.e(strSubstring));
            int i28 = a + 9;
            b = i28 % 128;
            int i29 = i28 % 2;
            return pathInterpolator;
        }
        int i30 = a + 19;
        b = i30 % 128;
        int i31 = i30 % 2;
        String strSubstring2 = strValueOf.substring(13, strValueOf.length() - 1);
        int i32 = a;
        int i33 = ((i32 ^ 63) | (i32 & 63)) << 1;
        int i34 = -(((~i32) & 63) | (i32 & (-64)));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        b = i35 % 128;
        int i36 = i35 % 2;
        String[] strArrSplit = strSubstring2.split(",");
        if (strArrSplit.length != 4) {
            StringBuilder sbW = j.w("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            sbW.append(strArrSplit.length);
            throw new IllegalArgumentException(sbW.toString());
        }
        int i37 = b;
        int i38 = (i37 & 96) + (i37 | 96);
        int i39 = (i38 ^ (-1)) + (i38 << 1);
        a = i39 % 128;
        int i40 = i39 % 2;
        PathInterpolator pathInterpolator2 = new PathInterpolator(b(strArrSplit, 0), b(strArrSplit, 1), b(strArrSplit, 2), b(strArrSplit, 3));
        int i41 = a;
        int i42 = (i41 & 55) + (i41 | 55);
        b = i42 % 128;
        int i43 = i42 % 2;
        return pathInterpolator2;
    }
}
