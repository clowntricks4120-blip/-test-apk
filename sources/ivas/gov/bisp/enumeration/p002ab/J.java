package ivas.gov.bisp.enumeration.p002ab;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import ivas.gov.bisp.enumeration.H.j;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    private static int a = 0;
    private static int b = 1;
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();

    static {
        int i = a;
        int i2 = i & 15;
        int i3 = ((i | 15) & (~i2)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet;
        int next;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((i2 | 11) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            int i7 = 0 / 0;
        } else {
            attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        }
        int i8 = a + 31;
        b = i8 % 128;
        int i9 = i8 % 2;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
            int i10 = b;
            int i11 = i10 & 51;
            int i12 = (i10 ^ 51) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            a = i13 % 128;
            int i14 = i13 % 2;
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        int i15 = b;
        int i16 = ((i15 ^ 104) + ((i15 & 104) << 1)) - 1;
        a = i16 % 128;
        int i17 = i16 % 2;
        ColorStateList colorStateListC = c(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        int i18 = b;
        int i19 = i18 & 89;
        int i20 = (((i18 | 89) & (~i19)) - (~(i19 << 1))) - 1;
        a = i20 % 128;
        int i21 = i20 % 2;
        return colorStateListC;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0529  */
    /* JADX WARN: Code duplicated, block: B:152:0x0534 A[PHI: r0
  0x0534: PHI (r0v45 float) = (r0v44 float), (r0v47 float) binds: [B:151:0x0532, B:147:0x0526] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x0545  */
    /* JADX WARN: Code duplicated, block: B:155:0x0549  */
    /* JADX WARN: Code duplicated, block: B:161:0x055d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0565  */
    /* JADX WARN: Code duplicated, block: B:167:0x057e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0585  */
    /* JADX WARN: Code duplicated, block: B:189:0x0634  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203 A[PHI: r3
  0x0203: PHI (r3v82 int) = (r3v77 int), (r3v86 int) binds: [B:80:0x0201, B:77:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0219  */
    /* JADX WARN: Code duplicated, block: B:84:0x021d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r11v61, types: [int] */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static ColorStateList c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int[] iArr;
        int[][] iArr2;
        int i;
        int i2;
        int color;
        float f;
        float f2;
        boolean z;
        float fMin;
        int i3;
        C0085o c0085o;
        float f3;
        boolean z2;
        float f4;
        float f5;
        float fCbrt;
        int i4;
        float f6;
        int i5;
        boolean z3;
        int i6;
        int i7;
        ?? r11;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        int i8 = 2;
        int i9 = 2 % 2;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            StringBuilder sb = new StringBuilder();
            String positionDescription = xmlPullParser.getPositionDescription();
            int i10 = b + 45;
            a = i10 % 128;
            if (i10 % 2 == 0) {
                sb.append(positionDescription);
                sb.append(": invalid color state list tag ");
                sb.append(name);
                throw new XmlPullParserException(sb.toString());
            }
            sb.append(positionDescription);
            sb.append(": invalid color state list tag ");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int depth = xmlPullParser.getDepth();
        int i11 = depth ^ (-104);
        ?? r7 = 1;
        int i12 = ((((depth & (-104)) | i11) << 1) - (~(-i11))) - 1;
        int i13 = i12 ^ 105;
        int i14 = ((i12 & 105) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = a;
        int i18 = ((i17 | 55) << 1) - (i17 ^ 55);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            iArr2 = new int[103][];
            iArr = new int[13];
        } else {
            iArr = new int[20];
            iArr2 = new int[20][];
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            int next = xmlPullParser.next();
            int i21 = b;
            int i22 = (i21 ^ 23) + ((i21 & 23) << r7);
            int i23 = i22 % 128;
            a = i23;
            int i24 = i22 % i8;
            if (next == r7) {
                break;
            }
            ?? r14 = (((i23 | 35) << r7) - (~(-(((~i23) & 35) | (i23 & (-36)))))) - r7;
            b = r14 % 128;
            int i25 = r14 % i8;
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < i16) {
                int i26 = a + 45;
                b = i26 % 128;
                if (i26 % i8 != 0) {
                    if (next == 3) {
                        break;
                    }
                } else if (next == 4) {
                    break;
                }
            }
            if (next == i8 && depth2 <= i16) {
                int i27 = b;
                int i28 = i27 & 71;
                int i29 = ((i27 ^ 71) | i28) << r7;
                int i30 = -((i27 | 71) & (~i28));
                int i31 = ((i29 | i30) << r7) - (i30 ^ i29);
                a = i31 % 128;
                int i32 = i31 % i8;
                if (xmlPullParser.getName().equals("item")) {
                    int[] iArr3 = r.e;
                    ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i19, i19);
                    int resourceId = ObtainAttributes.getResourceId(i19, -1);
                    if (resourceId != -1) {
                        ThreadLocal<TypedValue> threadLocal = c;
                        TypedValue typedValue = threadLocal.get();
                        int i33 = b;
                        int i34 = (i33 & 55) + (i33 | 55);
                        a = i34 % 128;
                        if (i34 % i8 != 0) {
                            int i35 = 64 / i19;
                            if (typedValue == null) {
                                typedValue = new TypedValue();
                                threadLocal.set(typedValue);
                            }
                        } else if (typedValue == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        }
                        resources.getValue(resourceId, typedValue, r7);
                        int i36 = typedValue.type;
                        int i37 = b;
                        int i38 = (i37 & 121) + (i37 | 121);
                        int i39 = i38 % 128;
                        a = i39;
                        int i40 = i38 % i8;
                        if (i36 < 28 || i36 > 31) {
                            int i41 = i39 ^ 125;
                            int i42 = ((i39 & 125) | i41) << r7;
                            int i43 = -i41;
                            int i44 = (i42 ^ i43) + ((i43 & i42) << r7);
                            b = i44 % 128;
                            int i45 = i44 % i8;
                            r11 = i19;
                        } else {
                            int i46 = i37 + 103;
                            a = i46 % 128;
                            int i47 = i46 % i8;
                            r11 = r7;
                        }
                        if ((r11 ^ r7) != 0) {
                            int i48 = a + 55;
                            b = i48 % 128;
                            int i49 = i48 % i8;
                            try {
                                ColorStateList colorStateListB = b(resources, resources.getXml(resourceId), theme);
                                int i50 = a;
                                int i51 = ((i50 ^ 75) | (i50 & 75)) << r7;
                                int i52 = -(((~i50) & 75) | (i50 & (-76)));
                                int i53 = ((i51 | i52) << r7) - (i52 ^ i51);
                                b = i53 % 128;
                                int i54 = i53 % i8;
                                color = colorStateListB.getDefaultColor();
                            } catch (Exception unused) {
                                color = ObtainAttributes.getColor(i19, -65281);
                            }
                        } else {
                            color = ObtainAttributes.getColor(i19, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i19, -65281);
                    }
                    if (((ObtainAttributes.hasValue(r7) ? 1 : 0) ^ r7) == 0) {
                        f = ObtainAttributes.getFloat(r7, 1.0f);
                    } else if (ObtainAttributes.hasValue(3)) {
                        int i55 = a + 33;
                        b = i55 % 128;
                        int i56 = i55 % i8;
                        f = ObtainAttributes.getFloat(3, 1.0f);
                    } else {
                        f = 1.0f;
                    }
                    if (j.b()) {
                        int i57 = a + 109;
                        b = i57 % 128;
                        int i58 = i57 % i8;
                        if (ObtainAttributes.hasValue(i8)) {
                            int i59 = b;
                            int i60 = ((i59 | 3) << r7) - (i59 ^ 3);
                            a = i60 % 128;
                            int i61 = i60 % i8;
                            f2 = ObtainAttributes.getFloat(i8, -1.0f);
                        } else {
                            f2 = ObtainAttributes.getFloat(4, -1.0f);
                        }
                    } else {
                        f2 = ObtainAttributes.getFloat(4, -1.0f);
                    }
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i62 = i19;
                    int i63 = i62;
                    while (i62 < attributeCount) {
                        int i64 = b + 101;
                        a = i64 % 128;
                        if (i64 % i8 != 0) {
                            attributeSet.getAttributeNameResource(i62);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        int attributeNameResource = attributeSet.getAttributeNameResource(i62);
                        if (attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha || attributeNameResource == R.attr.lStar) {
                            i63 = i63;
                        } else {
                            int i65 = a + 17;
                            b = i65 % 128;
                            if (i65 % i8 == 0) {
                                i6 = 1;
                                if (!attributeSet.getAttributeBooleanValue(i62, false)) {
                                    attributeNameResource = -attributeNameResource;
                                } else {
                                    int i66 = a;
                                    int i67 = i66 ^ 93;
                                    int i68 = (i66 & 93) << i6;
                                    i7 = ((i67 | i68) << 1) - (i68 ^ i67);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        int i69 = 6 / 0;
                                    }
                                }
                            } else {
                                i6 = 1;
                                if (attributeSet.getAttributeBooleanValue(i62, false)) {
                                    int i610 = a;
                                    int i611 = i610 ^ 93;
                                    int i612 = (i610 & 93) << i6;
                                    i7 = ((i611 | i612) << 1) - (i612 ^ i611);
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        int i613 = 6 / 0;
                                    }
                                } else {
                                    attributeNameResource = -attributeNameResource;
                                }
                            }
                            int i70 = i63;
                            iArr4[i70] = attributeNameResource;
                            int i71 = (i70 & (-2)) | ((~i70) & 1);
                            int i72 = (i70 & 1) << 1;
                            i63 = (i71 & i72) + (i71 | i72);
                        }
                        i62 = (((i62 ^ 1) | (i62 & 1)) << 1) - ((i62 & (-2)) | ((~i62) & 1));
                        i8 = 2;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i63);
                    if (f2 >= 0.0f) {
                        int i73 = a;
                        int i74 = i73 & 39;
                        int i75 = i74 + ((i73 ^ 39) | i74);
                        b = i75 % 128;
                        int i76 = i75 % 2;
                        if (f2 <= 100.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (f != 1.0f || z) {
                        int iQ = r.q((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                        if (z) {
                            C0085o c0085oC = C0085o.c(color);
                            float f7 = c0085oC.c;
                            float f8 = c0085oC.d;
                            T t = T.c;
                            if (f8 >= 1.0d && Math.round(f2) > 0.0d) {
                                int i77 = b;
                                int i78 = i77 | 25;
                                int i79 = (i78 << 1) - ((~(i77 & 25)) & i78);
                                a = i79 % 128;
                                int i80 = i79 % 2;
                                if (Math.round(f2) < 100.0d) {
                                    int i81 = b;
                                    int i82 = i81 & 63;
                                    int i83 = ((i81 ^ 63) | i82) << 1;
                                    int i84 = -((~i82) & (i81 | 63));
                                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                                    a = i85 % 128;
                                    int i86 = i85 % 2;
                                    if (f7 < 0.0f) {
                                        fMin = 0.0f;
                                        i3 = 1;
                                    } else {
                                        fMin = Math.min(360.0f, f7);
                                        int i87 = b;
                                        int i88 = i87 ^ 61;
                                        i3 = 1;
                                        int i89 = ((((i87 & 61) | i88) << 1) - (~(-i88))) - 1;
                                        a = i89 % 128;
                                        int i90 = i89 % 2;
                                    }
                                    int i91 = b;
                                    int i92 = (-2) - ((((i91 | 66) << i3) - (i91 ^ 66)) ^ (-1));
                                    a = i92 % 128;
                                    if (i92 % 2 != 0) {
                                        int i93 = 2 / 2;
                                    }
                                    float f9 = 0.0f;
                                    float f10 = f8;
                                    C0085o c0085o2 = null;
                                    boolean z4 = true;
                                    while (true) {
                                        if (Math.abs(f9 - f8) < 0.4f) {
                                            iArrTrimStateSet = iArrTrimStateSet;
                                            iArr2 = iArr2;
                                            i16 = i16;
                                            if (c0085o2 != null) {
                                                color = c0085o2.e(t);
                                                break;
                                            }
                                        } else {
                                            int i94 = b;
                                            int i95 = (i94 & (-48)) | ((~i94) & 47);
                                            int i96 = (i94 & 47) << 1;
                                            int i97 = (i95 ^ i96) + ((i95 & i96) << 1);
                                            a = i97 % 128;
                                            int i98 = i97 % 2;
                                            int i99 = i94 & 91;
                                            int i100 = -(-((i94 ^ 91) | i99));
                                            int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                                            a = i101 % 128;
                                            int i102 = i101 % 2;
                                            float f11 = 1000.0f;
                                            float f12 = 1000.0f;
                                            C0085o c0085o3 = null;
                                            float f13 = 0.0f;
                                            float f14 = 100.0f;
                                            while (true) {
                                                if (Math.abs(f13 - f14) <= 0.01f) {
                                                    iArrTrimStateSet = iArrTrimStateSet;
                                                    c0085o = c0085o3;
                                                    iArr2 = iArr2;
                                                    fMin = fMin;
                                                    i16 = i16;
                                                    f3 = f10;
                                                    z2 = false;
                                                    break;
                                                }
                                                int i103 = b;
                                                float f15 = f11;
                                                int i104 = (-2) - (((i103 & 82) + (i103 | 82)) ^ (-1));
                                                float f16 = f12;
                                                a = i104 % 128;
                                                float f17 = i104 % 2 != 0 ? ((f14 * f13) / 0.0f) % f13 : ((f14 - f13) / 2.0f) + f13;
                                                float f18 = f17;
                                                int iE = C0085o.d(f17, f10, fMin).e(T.c);
                                                int i105 = b;
                                                c0085o = c0085o3;
                                                int i106 = (i105 & (-34)) | ((~i105) & 33);
                                                int i107 = -(-((i105 & 33) << 1));
                                                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                                a = i108 % 128;
                                                int i109 = i108 % 2;
                                                float fO = i.o(Color.red(iE));
                                                float fO2 = i.o(Color.green(iE));
                                                int i110 = a;
                                                i16 = i16;
                                                int i111 = i110 ^ 29;
                                                int i112 = (((i111 | (i110 & 29)) << 1) - (~(-i111))) - 1;
                                                f3 = f10;
                                                b = i112 % 128;
                                                int i113 = i112 % 2;
                                                float fO3 = i.o(Color.blue(iE));
                                                float[] fArr = i.f[1];
                                                float f19 = fArr[0];
                                                int i114 = b;
                                                iArrTrimStateSet = iArrTrimStateSet;
                                                int i115 = (((i114 | 58) << 1) - (i114 ^ 58)) - 1;
                                                iArr2 = iArr2;
                                                a = i115 % 128;
                                                if (i115 % 2 != 0) {
                                                    f4 = fArr[1];
                                                    f5 = fO3 / fArr[4];
                                                } else {
                                                    f4 = fArr[1];
                                                    f5 = fO3 * fArr[2];
                                                }
                                                float f20 = (f5 + ((fO2 * f4) + (fO * f19))) / 100.0f;
                                                if (f20 <= 0.008856452f) {
                                                    int i116 = i114 + 5;
                                                    int i117 = i116 % 128;
                                                    a = i117;
                                                    fCbrt = i116 % 2 != 0 ? f20 + 903.2963f : f20 * 903.2963f;
                                                    int i118 = i117 & 13;
                                                    int i119 = (i117 ^ 13) | i118;
                                                    int i120 = (i118 ^ i119) + ((i118 & i119) << 1);
                                                    b = i120 % 128;
                                                    int i121 = i120 % 2;
                                                } else {
                                                    fCbrt = (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                                }
                                                float fAbs = Math.abs(f2 - fCbrt);
                                                if (fAbs < 0.2f) {
                                                    C0085o c0085oC2 = C0085o.c(iE);
                                                    float f21 = c0085oC2.e;
                                                    float f22 = c0085oC2.d;
                                                    int i122 = a + 111;
                                                    b = i122 % 128;
                                                    int i123 = i122 % 2;
                                                    C0085o c0085oD = C0085o.d(f21, f22, fMin);
                                                    float f23 = c0085oC2.f - c0085oD.f;
                                                    float f24 = c0085oC2.h;
                                                    float f25 = c0085oD.h;
                                                    int i124 = a;
                                                    int i125 = (i124 ^ 98) + ((i124 & 98) << 1);
                                                    int i126 = (i125 ^ (-1)) + (i125 << 1);
                                                    fMin = fMin;
                                                    b = i126 % 128;
                                                    float f26 = i126 % 2 == 0 ? f24 + f25 : f24 - f25;
                                                    float f27 = c0085oC2.g;
                                                    float f28 = c0085oD.g;
                                                    int i127 = b;
                                                    int i128 = ((i127 | 45) << 1) - (i127 ^ 45);
                                                    a = i128 % 128;
                                                    int i129 = i128 % 2;
                                                    float f29 = f27 - f28;
                                                    float f30 = (f29 * f29) + (f26 * f26) + (f23 * f23);
                                                    int i130 = i127 & 111;
                                                    int i131 = -(-((i127 ^ 111) | i130));
                                                    int i132 = (i130 & i131) + (i130 | i131);
                                                    a = i132 % 128;
                                                    int i133 = i132 % 2;
                                                    double dPow = Math.pow(Math.sqrt(f30), 0.63d);
                                                    int i134 = b;
                                                    int i135 = i134 & 117;
                                                    int i136 = ((((i134 ^ 117) | i135) << 1) - (~(-((~i135) & (i134 | 117))))) - 1;
                                                    a = i136 % 128;
                                                    if (i136 % 2 != 0) {
                                                        f6 = (float) (dPow + 1.41d);
                                                        if (f6 <= 1.0f) {
                                                            int i137 = i134 & 103;
                                                            i5 = ((i134 | 103) & (~i137)) + (i137 << 1);
                                                            a = i5 % 128;
                                                            if (i5 % 2 != 0) {
                                                                int i138 = 2 % 3;
                                                            }
                                                            f16 = f6;
                                                            c0085o = c0085oC2;
                                                            f11 = fAbs;
                                                        }
                                                        z2 = false;
                                                        if (f11 != 0.0f && f16 == 0.0f) {
                                                            break;
                                                        }
                                                        if (fCbrt < f2) {
                                                            int i139 = b;
                                                            int i140 = (i139 & (-116)) | ((~i139) & 115);
                                                            int i141 = (i139 & 115) << 1;
                                                            i4 = (i140 ^ i141) + ((i141 & i140) << 1);
                                                            a = i4 % 128;
                                                            if (i4 % 2 != 0) {
                                                                int i142 = 87 / 0;
                                                            }
                                                            f13 = f18;
                                                        } else {
                                                            f14 = f18;
                                                        }
                                                        f12 = f16;
                                                        f10 = f3;
                                                        c0085o3 = c0085o;
                                                        i16 = i16;
                                                        fMin = fMin;
                                                        iArr2 = iArr2;
                                                        iArrTrimStateSet = iArrTrimStateSet;
                                                    } else {
                                                        f6 = (float) (dPow * 1.41d);
                                                        if (f6 <= 1.0f) {
                                                            int i1310 = i134 & 103;
                                                            i5 = ((i134 | 103) & (~i1310)) + (i1310 << 1);
                                                            a = i5 % 128;
                                                            if (i5 % 2 != 0) {
                                                                int i1311 = 2 % 3;
                                                            }
                                                            f16 = f6;
                                                            c0085o = c0085oC2;
                                                            f11 = fAbs;
                                                        }
                                                        z2 = false;
                                                        if (f11 != 0.0f) {
                                                        }
                                                        if (fCbrt < f2) {
                                                            int i1312 = b;
                                                            int i143 = (i1312 & (-116)) | ((~i1312) & 115);
                                                            int i144 = (i1312 & 115) << 1;
                                                            i4 = (i143 ^ i144) + ((i144 & i143) << 1);
                                                            a = i4 % 128;
                                                            if (i4 % 2 != 0) {
                                                                int i145 = 87 / 0;
                                                            }
                                                            f13 = f18;
                                                        } else {
                                                            f14 = f18;
                                                        }
                                                        f12 = f16;
                                                        f10 = f3;
                                                        c0085o3 = c0085o;
                                                        i16 = i16;
                                                        fMin = fMin;
                                                        iArr2 = iArr2;
                                                        iArrTrimStateSet = iArrTrimStateSet;
                                                    }
                                                } else {
                                                    fMin = fMin;
                                                }
                                                f11 = f15;
                                                z2 = false;
                                                if (f11 != 0.0f) {
                                                }
                                                if (fCbrt < f2) {
                                                    int i1313 = b;
                                                    int i146 = (i1313 & (-116)) | ((~i1313) & 115);
                                                    int i147 = (i1313 & 115) << 1;
                                                    i4 = (i146 ^ i147) + ((i147 & i146) << 1);
                                                    a = i4 % 128;
                                                    if (i4 % 2 != 0) {
                                                        int i148 = 87 / 0;
                                                    }
                                                    f13 = f18;
                                                } else {
                                                    f14 = f18;
                                                }
                                                f12 = f16;
                                                f10 = f3;
                                                c0085o3 = c0085o;
                                                i16 = i16;
                                                fMin = fMin;
                                                iArr2 = iArr2;
                                                iArrTrimStateSet = iArrTrimStateSet;
                                            }
                                            C0085o c0085o4 = c0085o;
                                            if (z4) {
                                                int i149 = a;
                                                int i150 = i149 & 83;
                                                int i151 = -(-((i149 ^ 83) | i150));
                                                int i152 = (i150 & i151) + (i151 | i150);
                                                b = i152 % 128;
                                                int i153 = i152 % 2;
                                                if (c0085o4 != null) {
                                                    color = c0085o4.e(t);
                                                    break;
                                                }
                                                f10 = ((f8 - f9) / 2.0f) + f9;
                                                z4 = false;
                                            } else {
                                                if (c0085o4 == null) {
                                                    int i154 = b;
                                                    int i155 = (-2) - ((((i154 | 36) << 1) - (i154 ^ 36)) ^ (-1));
                                                    a = i155 % 128;
                                                    if (i155 % 2 != 0) {
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    f8 = f3;
                                                } else {
                                                    int i156 = b;
                                                    int i157 = i156 & 101;
                                                    int i158 = (i156 | 101) & (~i157);
                                                    int i159 = i157 << 1;
                                                    int i160 = (i158 & i159) + (i158 | i159);
                                                    a = i160 % 128;
                                                    int i161 = i160 % 2;
                                                    c0085o2 = c0085o4;
                                                    f9 = f3;
                                                }
                                                f10 = ((f8 - f9) / 2.0f) + f9;
                                            }
                                        }
                                    }
                                } else {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    iArr2 = iArr2;
                                    i16 = i16;
                                }
                                color = i.m(f2);
                                int i162 = a;
                                int i163 = i162 & 105;
                                int i164 = i163 + ((i162 ^ 105) | i163);
                                b = i164 % 128;
                                int i165 = i164 % 2;
                                break;
                            }
                            iArrTrimStateSet = iArrTrimStateSet;
                            iArr2 = iArr2;
                            i16 = i16;
                            color = i.m(f2);
                            int i166 = a;
                            int i167 = i166 & 105;
                            int i168 = i167 + ((i166 ^ 105) | i167);
                            b = i168 % 128;
                            int i169 = i168 % 2;
                            break;
                        }
                        iArrTrimStateSet = iArrTrimStateSet;
                        iArr2 = iArr2;
                        i16 = i16;
                        int i170 = 16777215 & color;
                        int i171 = iQ << 24;
                        int i172 = a;
                        int i173 = (i172 & (-126)) | ((~i172) & 125);
                        int i174 = -(-((i172 & 125) << 1));
                        int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
                        b = i175 % 128;
                        if (i175 % 2 == 0) {
                            color = i170 & i171;
                        } else {
                            int i176 = ((~i171) & i170) | ((~i170) & i171);
                            int i177 = i170 & i171;
                            color = (i176 ^ i177) | (i177 & i176);
                        }
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        iArr2 = iArr2;
                        i16 = i16;
                    }
                    int i178 = i20 & 1;
                    int i179 = -(-((i20 ^ 1) | i178));
                    int i180 = ((i178 | i179) << 1) - (i178 ^ i179);
                    int length = iArr.length;
                    int i181 = a;
                    int i182 = i181 & 105;
                    int i183 = (i182 - (~((i181 ^ 105) | i182))) - 1;
                    int i184 = i183 % 128;
                    b = i184;
                    if (i183 % 2 == 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    if (i180 > length) {
                        int i185 = (-2) - (((i184 ^ 76) + ((i184 & 76) << 1)) ^ (-1));
                        a = i185 % 128;
                        int[] iArr5 = new int[(i185 % 2 == 0 ? i20 > 4 : i20 > 5) ? i20 * 2 : 8];
                        System.arraycopy(iArr, 0, iArr5, 0, i20);
                        iArr = iArr5;
                    }
                    iArr[i20] = color;
                    int i186 = a;
                    int i187 = ((i186 ^ 23) | (i186 & 23)) << 1;
                    int i188 = -((i186 & (-24)) | ((~i186) & 23));
                    int i189 = ((i187 | i188) << 1) - (i187 ^ i188);
                    b = i189 % 128;
                    int i190 = i189 % 2;
                    Object[] objArr = iArr2;
                    if (i180 > objArr.length) {
                        int i191 = (i186 & 21) + (i186 | 21);
                        b = i191 % 128;
                        int i192 = i191 % 2;
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i20 <= 4 ? 8 : i20 * 2);
                        System.arraycopy(objArr, 0, objArr2, 0, i20);
                        int i193 = a;
                        int i194 = i193 & 53;
                        int i195 = -(-((i193 ^ 53) | i194));
                        int i196 = i194 ^ i195;
                        int i197 = i195 & i194;
                        z3 = true;
                        int i198 = i196 + (i197 << 1);
                        b = i198 % 128;
                        int i199 = i198 % 2;
                        objArr = objArr2;
                    } else {
                        z3 = true;
                    }
                    objArr[i20] = iArrTrimStateSet;
                    iArr2 = (int[][]) objArr;
                    int i200 = a;
                    int i201 = i200 & 11;
                    int i202 = (i200 ^ 11) | i201;
                    int i203 = (i201 & i202) + (i202 | i201);
                    b = i203 % 128;
                    int i204 = i203 % 2;
                    i20 = i180;
                    r7 = z3;
                    i16 = i16;
                    i8 = 2;
                    i19 = 0;
                }
            }
            r7 = r7 == true ? 1 : 0;
            i16 = i16;
            i8 = 2;
            i19 = 0;
        }
        ?? r3 = r7;
        int[] iArr6 = new int[i20];
        int[][] iArr7 = new int[i20][];
        int i205 = (-2) - ((b + 92) ^ (-1));
        a = i205 % 128;
        if (i205 % 2 != 0) {
            i = 0;
            System.arraycopy(iArr, 0, iArr6, 0, i20);
            i2 = r3 == true ? 1 : 0;
        } else {
            i = 0;
            System.arraycopy(iArr, 0, iArr6, 0, i20);
            i2 = 0;
        }
        System.arraycopy(iArr2, i, iArr7, i2, i20);
        return new ColorStateList(iArr7, iArr6);
    }
}
