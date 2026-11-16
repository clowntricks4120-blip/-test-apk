package ivas.gov.bisp.enumeration.p002ab;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class Q {
    private static int a = 1;
    private static int b;

    public static String c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (((i3 ^ 65) | (i3 & 65)) << 1) - (((~i3) & 65) | (i3 & (-66)));
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            d(xmlPullParser, str);
            obj.hashCode();
            throw null;
        }
        if (d(xmlPullParser, str)) {
            String string = typedArray.getString(i);
            int i5 = a + 87;
            b = i5 % 128;
            int i6 = i5 % 2;
            return string;
        }
        int i7 = b;
        int i8 = ((i7 ^ 21) - (~(-(-((i7 & 21) << 1))))) - 1;
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        int i11 = i9 & 49;
        int i12 = (i9 ^ 49) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 5;
        int i4 = -(-(i2 | 5));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            int i7 = b;
            int i8 = i7 + 99;
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((i7 & (-54)) | ((~i7) & 53)) + ((i7 & 53) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            int i12 = b;
            int i13 = (i12 ^ 121) + ((i12 & 121) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        int i15 = a;
        int i16 = ((i15 & 39) - (~(-(-(i15 | 39))))) - 1;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 64) + (i2 | 64);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (theme != null) {
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i5 = b;
            int i6 = (i5 & (-32)) | ((~i5) & 31);
            int i7 = -(-((i5 & 31) << 1));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            a = i8 % 128;
            int i9 = i8 % 2;
            return typedArrayObtainStyledAttributes;
        }
        int i10 = (i2 | 45) << 1;
        int i11 = -(i2 ^ 45);
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        int i14 = a;
        int i15 = (i14 ^ 69) + ((i14 & 69) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        return typedArrayObtainAttributes;
    }

    public static x b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        x xVarC;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 | 65;
        int i6 = (i5 << 1) - ((~(i4 & 65)) & i5);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            d(xmlPullParser, str);
            throw null;
        }
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            int i7 = b;
            int i8 = (-2) - ((((i7 | 126) << 1) - (i7 ^ 126)) ^ (-1));
            a = i8 % 128;
            if (i8 % 2 == 0) {
                typedArray.getValue(i, typedValue);
                int i9 = typedValue.type;
                obj.hashCode();
                throw null;
            }
            typedArray.getValue(i, typedValue);
            int i10 = typedValue.type;
            int i11 = b;
            int i12 = i11 & 45;
            int i13 = (i11 ^ 45) | i12;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            a = i14 % 128;
            if (i14 % 2 != 0 ? i10 >= 28 : i10 >= 2) {
                if (i10 <= 31) {
                    x xVar = new x(null, null, typedValue.data);
                    int i15 = a + 69;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 90 / 0;
                    }
                    return xVar;
                }
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(i, 0);
            int i17 = a;
            int i18 = ((i17 & 80) + (i17 | 80)) - 1;
            b = i18 % 128;
            try {
                if (i18 % 2 != 0) {
                    x.c(resources, resourceId, theme);
                    throw null;
                }
                xVarC = x.c(resources, resourceId, theme);
                if (xVarC != null) {
                    int i19 = b;
                    int i20 = ((i19 | 111) << 1) - (i19 ^ 111);
                    int i21 = i20 % 128;
                    a = i21;
                    int i22 = i20 % 2;
                    int i23 = i21 ^ 29;
                    int i24 = ((((i21 & 29) | i23) << 1) - (~(-i23))) - 1;
                    b = i24 % 128;
                    if (i24 % 2 == 0) {
                        return xVarC;
                    }
                    obj.hashCode();
                    throw null;
                }
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                xVarC = null;
            }
        }
        x xVar2 = new x(null, null, i2);
        int i25 = b;
        int i26 = i25 & 1;
        int i27 = (i25 ^ 1) | i26;
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        a = i28 % 128;
        int i29 = i28 % 2;
        return xVar2;
    }
}
