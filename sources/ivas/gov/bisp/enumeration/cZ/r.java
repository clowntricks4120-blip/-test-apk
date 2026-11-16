package ivas.gov.bisp.enumeration.cZ;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import ivas.gov.bisp.enumeration.p002ab.Q;
import ivas.gov.bisp.enumeration.p091n.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import net.sqlcipher.BuildConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 1;
    private static int b;

    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    public static boolean e(int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 13;
        int i5 = (i3 | 13) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        int i8 = i7 % 128;
        b = i8;
        if (i7 % 2 == 0 ? i < 28 : i < 48) {
            int i9 = i8 + 31;
            a = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        } else {
            int i11 = i8 & 77;
            int i12 = (i11 - (~((i8 ^ 77) | i11))) - 1;
            int i13 = i12 % 128;
            a = i13;
            int i14 = i12 % 2;
            if (i <= 31) {
                int i15 = (i13 & (-70)) | ((~i13) & 69);
                int i16 = -(-((i13 & 69) << 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                int i18 = i17 % 128;
                b = i18;
                int i19 = i17 % 2;
                int i20 = ((i18 | 21) << 1) - (i18 ^ 21);
                a = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                int i22 = i8 + 31;
                a = i22 % 128;
                int i110 = i22 % 2;
                z = false;
            }
        }
        int i23 = b;
        int i24 = i23 & 35;
        int i25 = ((((i23 ^ 35) | i24) << 1) - (~(-((i23 | 35) & (~i24))))) - 1;
        a = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 10 / 0;
        }
        return z;
    }

    public static Keyframe c(Keyframe keyframe, float f) {
        Keyframe keyframeOfObject;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 3;
        int i4 = -(-((i2 ^ 3) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            keyframe.getType();
            Class cls = Float.TYPE;
            obj.hashCode();
            throw null;
        }
        if (keyframe.getType() == Float.TYPE) {
            keyframeOfObject = Keyframe.ofFloat(f);
            int i6 = b + 117;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 4;
            }
        } else if (keyframe.getType() == Integer.TYPE) {
            int i8 = b + 23;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                Keyframe.ofInt(f);
                throw null;
            }
            keyframeOfObject = Keyframe.ofInt(f);
            int i9 = b;
            int i10 = ((i9 & (-46)) | ((~i9) & 45)) + ((i9 & 45) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            keyframeOfObject = Keyframe.ofObject(f);
            int i12 = a;
            int i13 = (i12 ^ 25) + ((i12 & 25) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = a;
        int i16 = ((i15 & 71) - (~(i15 | 71))) - 1;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return keyframeOfObject;
        }
        obj.hashCode();
        throw null;
    }

    public static class bIh implements TypeEvaluator<ivas.gov.bisp.enumeration.ag.r.aVv[]> {
        private static int a = 1;
        private static int b;
        public ivas.gov.bisp.enumeration.ag.r.aVv[] c;

        @Override // android.animation.TypeEvaluator
        public ivas.gov.bisp.enumeration.ag.r.aVv[] evaluate(float f, ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr, ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr2) throws Throwable {
            float f2;
            float f3;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 14) + ((i2 & 14) << 1)) ^ (-1));
            a = i3 % 128;
            Throwable th = null;
            if (i3 % 2 == 0) {
                ivas.gov.bisp.enumeration.p007ag.r.b(avvArr, avvArr2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr3 = avvArr;
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr4 = avvArr2;
            if (!ivas.gov.bisp.enumeration.p007ag.r.b(avvArr3, avvArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!ivas.gov.bisp.enumeration.p007ag.r.b(this.c, avvArr3)) {
                int i4 = a;
                int i5 = (i4 ^ 55) + ((i4 & 55) << 1);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    this.c = ivas.gov.bisp.enumeration.p007ag.r.f(avvArr3);
                    throw null;
                }
                this.c = ivas.gov.bisp.enumeration.p007ag.r.f(avvArr3);
                int i6 = b;
                int i7 = (i6 & 26) + (i6 | 26);
                int i8 = (i7 ^ (-1)) + (i7 << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = b;
            int i11 = (((i10 | 53) << 1) - (~(-(((~i10) & 53) | (i10 & (-54)))))) - 1;
            a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < avvArr3.length) {
                int i14 = b;
                int i15 = (((i14 | 56) << 1) - (i14 ^ 56)) - 1;
                int i16 = i15 % 128;
                a = i16;
                if (i15 % 2 == 0) {
                    Throwable th2 = th;
                    ivas.gov.bisp.enumeration.ag.r.aVv avv = this.c[i13];
                    ivas.gov.bisp.enumeration.ag.r.aVv avv2 = avvArr3[i13];
                    throw th2;
                }
                ivas.gov.bisp.enumeration.ag.r.aVv avv3 = this.c[i13];
                ivas.gov.bisp.enumeration.ag.r.aVv avv4 = avvArr3[i13];
                int i17 = ((i16 ^ 58) + ((i16 & 58) << 1)) - 1;
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    ivas.gov.bisp.enumeration.ag.r.aVv avv5 = avvArr4[i13];
                    Objects.requireNonNull(avv3);
                    char c = avv4.c;
                    throw null;
                }
                ivas.gov.bisp.enumeration.ag.r.aVv avv6 = avvArr4[i13];
                Objects.requireNonNull(avv3);
                char c2 = avv4.c;
                int i18 = b;
                int i19 = i18 & 33;
                int i20 = (i18 | 33) & (~i19);
                int i21 = i19 << 1;
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
                avv3.c = c2;
                int i24 = a;
                int i25 = i24 ^ 55;
                int i26 = ((i24 & 55) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                int i30 = 0;
                while (true) {
                    float[] fArr = avv4.d;
                    if (i30 < fArr.length) {
                        int i31 = b;
                        int i32 = (i31 ^ 121) + ((i31 & 121) << 1);
                        a = i32 % 128;
                        if (i32 % 2 == 0) {
                            float[] fArr2 = avv3.d;
                            float f4 = fArr[i30];
                            throw null;
                        }
                        float[] fArr3 = avv3.d;
                        float f5 = fArr[i30];
                        int i33 = b;
                        int i34 = ((i33 & 99) - (~(i33 | 99))) - 1;
                        a = i34 % 128;
                        if (i34 % 2 == 0) {
                            f2 = avv6.d[i30] / f;
                            f3 = 2.0f / f;
                        } else {
                            f2 = avv6.d[i30] * f;
                            f3 = 1.0f - f;
                        }
                        int i35 = a;
                        int i36 = (i35 ^ 39) + ((i35 & 39) << 1);
                        b = i36 % 128;
                        if (i36 % 2 != 0) {
                            fArr3[i30] = f2 * (f3 - f5);
                            i30 = (i30 & 89) + (i30 | 89);
                        } else {
                            fArr3[i30] = f2 + (f3 * f5);
                            int i37 = i30 & (-106);
                            int i38 = (~i37) & (i30 | (-106));
                            int i39 = i37 << 1;
                            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                            int i41 = i40 & 107;
                            int i42 = -(-((i40 ^ 107) | i41));
                            i30 = ((i41 | i42) << 1) - (i41 ^ i42);
                        }
                    }
                }
                i13++;
                int i43 = b;
                int i44 = (i43 & (-94)) | ((~i43) & 93);
                int i45 = (i43 & 93) << 1;
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                a = i46 % 128;
                int i47 = i46 % 2;
                th = null;
            }
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArr5 = this.c;
            int i48 = b + 33;
            a = i48 % 128;
            if (i48 % 2 == 0) {
                int i49 = 39 / 0;
            }
            return avvArr5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:160:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
    public static PropertyValuesHolder d(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        e eVar;
        PropertyValuesHolder propertyValuesHolderOfInt;
        int dimension;
        int color;
        int color2;
        int i5;
        float dimension2;
        float dimension3;
        float dimension4;
        int i6 = 2 % 2;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i7 = a;
            int i8 = i7 & 37;
            int i9 = -(-((i7 ^ 37) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            b = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            int i12 = b;
            int i13 = ((((i12 ^ 91) | (i12 & 91)) << 1) - (~(-(((~i12) & 91) | (i12 & (-92)))))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        int i15 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        if (typedValuePeekValue2 != null) {
            int i16 = a;
            int i17 = (i16 ^ 47) + ((i16 & 47) << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((((i16 ^ 91) | (i16 & 91)) << 1) - (~(-((91 & (~i16)) | (i16 & (-92)))))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
            z2 = true;
        } else {
            int i21 = a;
            int i22 = (((i21 ^ 87) | (i21 & 87)) << 1) - (((~i21) & 87) | (i21 & (-88)));
            b = i22 % 128;
            int i23 = i22 % 2;
            z2 = false;
        }
        if (z2) {
            int i24 = a;
            int i25 = (i24 ^ 101) + ((i24 & 101) << 1);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                i4 = typedValuePeekValue2.type;
                int i26 = 60 / 0;
            } else {
                i4 = typedValuePeekValue2.type;
            }
        } else {
            i4 = 0;
        }
        Object obj = null;
        int i27 = i;
        if (i27 == 4) {
            int i28 = b;
            int i29 = i28 & 101;
            int i30 = ((~i29) & (i28 | 101)) + (i29 << 1);
            a = i30 % 128;
            if (i30 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                int i31 = (((i28 | 124) << 1) - (i28 ^ 124)) - 1;
                a = i31 % 128;
                int i32 = i31 % 2;
                if (e(i15)) {
                    i27 = 3;
                } else {
                    if (z2) {
                        int i33 = b;
                        int i34 = i33 | 105;
                        int i35 = i34 << 1;
                        int i36 = -((~(i33 & 105)) & i34);
                        int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                        a = i37 % 128;
                        int i38 = i37 % 2;
                        if (!e(i4)) {
                            i27 = 3;
                        }
                    }
                    i27 = 0;
                }
            } else {
                if (z2) {
                    int i39 = b;
                    int i310 = i39 | 105;
                    int i311 = i310 << 1;
                    int i312 = -((~(i39 & 105)) & i310);
                    int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                    a = i313 % 128;
                    int i314 = i313 % 2;
                    if (!e(i4)) {
                        i27 = 3;
                    }
                }
                i27 = 0;
            }
        }
        if (i27 == 0) {
            int i40 = b;
            int i41 = i40 & 59;
            int i42 = (i40 ^ 59) | i41;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            int i44 = i43 % 128;
            a = i44;
            int i45 = i43 % 2;
            int i46 = i44 & 23;
            int i47 = (~i46) & (i44 | 23);
            int i48 = i46 << 1;
            int i49 = (i47 & i48) + (i48 | i47);
            b = i49 % 128;
            int i50 = i49 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (i27 == 2) {
            int i51 = a;
            int i52 = i51 & 113;
            int i53 = (i51 ^ 113) | i52;
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            b = i54 % 128;
            int i55 = i54 % 2;
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArrD = ivas.gov.bisp.enumeration.p007ag.r.d(string);
            int i56 = a;
            int i57 = ((i56 & 71) - (~(-(-(i56 | 71))))) - 1;
            b = i57 % 128;
            int i58 = i57 % 2;
            ivas.gov.bisp.enumeration.ag.r.aVv[] avvArrD2 = ivas.gov.bisp.enumeration.p007ag.r.d(string2);
            if (avvArrD == null) {
                int i59 = a;
                int i60 = i59 ^ 75;
                int i61 = ((i59 & 75) | i60) << 1;
                int i62 = -i60;
                int i63 = (i61 & i62) + (i61 | i62);
                b = i63 % 128;
                int i64 = i63 % 2;
                if (avvArrD2 == null) {
                    return null;
                }
            }
            if (avvArrD == null) {
                if (avvArrD2 == null) {
                    return null;
                }
                bIh bih = new bIh();
                int i65 = b;
                int i66 = i65 + 21;
                a = i66 % 128;
                int i67 = i66 % 2;
                Object[] objArr = {avvArrD2};
                int i68 = (i65 & 95) + (i65 | 95);
                a = i68 % 128;
                int i69 = i68 % 2;
                PropertyValuesHolder propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, bih, objArr);
                int i70 = b;
                int i71 = (i70 & (-98)) | ((~i70) & 97);
                int i72 = -(-((i70 & 97) << 1));
                int i73 = (i71 & i72) + (i72 | i71);
                a = i73 % 128;
                int i74 = i73 % 2;
                return propertyValuesHolderOfObject;
            }
            bIh bih2 = new bIh();
            if (avvArrD2 == null) {
                Object[] objArr2 = {avvArrD};
                int i75 = a;
                int i76 = ((i75 ^ 79) | (i75 & 79)) << 1;
                int i77 = -(((~i75) & 79) | (i75 & (-80)));
                int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                b = i78 % 128;
                if (i78 % 2 == 0) {
                    return PropertyValuesHolder.ofObject(str, bih2, objArr2);
                }
                PropertyValuesHolder.ofObject(str, bih2, objArr2);
                throw null;
            }
            int i79 = a + 65;
            b = i79 % 128;
            if (i79 % 2 != 0) {
                ivas.gov.bisp.enumeration.p007ag.r.b(avvArrD, avvArrD2);
                obj.hashCode();
                throw null;
            }
            if (!ivas.gov.bisp.enumeration.p007ag.r.b(avvArrD, avvArrD2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Can't morph from ");
                sb.append(string);
                sb.append(" to ");
                sb.append(string2);
                throw new InflateException(sb.toString());
            }
            int i80 = b;
            int i81 = (i80 ^ 23) + ((i80 & 23) << 1);
            a = i81 % 128;
            int i82 = i81 % 2;
            Object[] objArr3 = new Object[2];
            objArr3[0] = avvArrD;
            int i83 = i80 & 107;
            int i84 = i83 + ((i80 ^ 107) | i83);
            a = i84 % 128;
            if (i84 % 2 != 0) {
                objArr3[1] = avvArrD2;
                return PropertyValuesHolder.ofObject(str, bih2, objArr3);
            }
            objArr3[1] = avvArrD2;
            PropertyValuesHolder.ofObject(str, bih2, objArr3);
            throw null;
        }
        if (i27 == 3) {
            int i85 = b;
            int i86 = i85 & 89;
            int i87 = ((i85 | 89) & (~i86)) + (i86 << 1);
            a = i87 % 128;
            int i88 = i87 % 2;
            eVar = e.c;
        } else {
            eVar = null;
        }
        if (z3) {
            int i89 = b + 99;
            int i90 = i89 % 128;
            a = i90;
            if (i89 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (z) {
                int i91 = ((i90 | 23) << 1) - (i90 ^ 23);
                b = i91 % 128;
                if (i91 % 2 == 0 ? i15 != 5 : i15 != 2) {
                    dimension3 = typedArray.getFloat(i2, 0.0f);
                } else {
                    int i92 = ((i90 | 5) << 1) - (i90 ^ 5);
                    b = i92 % 128;
                    dimension3 = i92 % 2 != 0 ? typedArray.getDimension(i2, 1.0f) : typedArray.getDimension(i2, 0.0f);
                }
                if (!(!z2)) {
                    int i93 = a;
                    int i94 = i93 & 125;
                    int i95 = -(-((i93 ^ 125) | i94));
                    int i96 = ((i94 | i95) << 1) - (i94 ^ i95);
                    b = i96 % 128;
                    int i97 = i96 % 2;
                    if (i4 == 5) {
                        int i98 = i93 & 65;
                        int i99 = i98 + ((i93 ^ 65) | i98);
                        b = i99 % 128;
                        int i100 = i99 % 2;
                        dimension4 = typedArray.getDimension(i3, 0.0f);
                        int i101 = a;
                        int i102 = (i101 ^ 11) + ((i101 & 11) << 1);
                        b = i102 % 128;
                        int i103 = i102 % 2;
                    } else {
                        dimension4 = typedArray.getFloat(i3, 0.0f);
                        int i104 = b + 101;
                        a = i104 % 128;
                        if (i104 % 2 == 0) {
                            int i105 = 5 / 4;
                        }
                    }
                    float[] fArr = new float[2];
                    fArr[0] = dimension3;
                    int i106 = (-2) - ((b + 82) ^ (-1));
                    a = i106 % 128;
                    if (i106 % 2 == 0) {
                        fArr[1] = dimension4;
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, fArr);
                        int i107 = 17 / 0;
                    } else {
                        fArr[1] = dimension4;
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, fArr);
                    }
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension3);
                }
            } else {
                if (i4 == 5) {
                    dimension2 = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i3, 0.0f);
                    int i108 = a;
                    int i109 = ((i108 | 9) << 1) - (i108 ^ 9);
                    b = i109 % 128;
                    int i110 = i109 % 2;
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension2);
                int i111 = b;
                int i112 = i111 & 59;
                int i113 = (i111 ^ 59) | i112;
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                a = i114 % 128;
                if (i114 % 2 == 0) {
                    throw null;
                }
            }
        } else if (z) {
            int i115 = a;
            int i116 = i115 & 119;
            int i117 = (i115 | 119) & (~i116);
            int i118 = -(-(i116 << 1));
            int i119 = (i117 & i118) + (i117 | i118);
            b = i119 % 128;
            int i120 = i119 % 2;
            if (i15 == 5) {
                color = (int) typedArray.getDimension(i2, 0.0f);
                int i121 = a + 99;
                b = i121 % 128;
                int i122 = i121 % 2;
            } else if (!e(i15)) {
                color = typedArray.getInt(i2, 0);
            } else {
                int i123 = a;
                int i124 = ((i123 & 66) + (i123 | 66)) - 1;
                b = i124 % 128;
                int i125 = i124 % 2;
                color = typedArray.getColor(i2, 0);
            }
            if (z2) {
                int i126 = b;
                int i127 = (i126 ^ 81) + ((i126 & 81) << 1);
                int i128 = i127 % 128;
                a = i128;
                int i129 = i127 % 2;
                if (i4 == 5) {
                    int i130 = i128 + 63;
                    b = i130 % 128;
                    int i131 = i130 % 2;
                    color2 = (int) typedArray.getDimension(i3, 0.0f);
                    int i132 = a;
                    int i133 = ((i132 ^ 55) | (i132 & 55)) << 1;
                    int i134 = -(((~i132) & 55) | (i132 & (-56)));
                    int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                    b = i135 % 128;
                    int i136 = i135 % 2;
                } else if (e(i4)) {
                    int i137 = b + 48;
                    int i138 = (i137 ^ (-1)) + (i137 << 1);
                    a = i138 % 128;
                    color2 = i138 % 2 == 0 ? typedArray.getColor(i3, 1) : typedArray.getColor(i3, 0);
                    int i139 = b;
                    int i140 = i139 ^ 107;
                    int i141 = (i139 & 107) << 1;
                    int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                    a = i142 % 128;
                    if (i142 % 2 == 0) {
                        int i143 = 5 / 3;
                    }
                } else {
                    color2 = typedArray.getInt(i3, 0);
                }
                int[] iArr = new int[2];
                iArr[0] = color;
                int i144 = a;
                int i145 = (i144 & 49) + (i144 | 49);
                b = i145 % 128;
                if (i145 % 2 != 0) {
                    iArr[1] = color2;
                    PropertyValuesHolder.ofInt(str, iArr);
                    throw null;
                }
                iArr[1] = color2;
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, iArr);
                int i146 = a;
                int i147 = i146 & 61;
                int i148 = -(-(i146 | 61));
                int i149 = ((i147 | i148) << 1) - (i148 ^ i147);
                b = i149 % 128;
                int i150 = i149 % 2;
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
                int i151 = b;
                int i152 = i151 & 57;
                int i153 = i152 + ((i151 ^ 57) | i152);
                a = i153 % 128;
                int i154 = i153 % 2;
            }
        } else if (z2) {
            int i155 = a;
            int i156 = ((i155 | 5) << 1) - (i155 ^ 5);
            b = i156 % 128;
            if (i156 % 2 == 0 ? i4 == 5 : i4 == 5) {
                int i157 = ((i155 ^ 114) + ((i155 & 114) << 1)) - 1;
                b = i157 % 128;
                int i158 = i157 % 2;
                dimension = (int) typedArray.getDimension(i3, 0.0f);
            } else if (e(i4)) {
                int i159 = b;
                int i160 = i159 ^ 109;
                int i161 = ((i159 & 109) | i160) << 1;
                int i162 = -i160;
                int i163 = (i161 ^ i162) + ((i161 & i162) << 1);
                a = i163 % 128;
                int i164 = i163 % 2;
                dimension = typedArray.getColor(i3, 0);
                int i165 = b;
                int i166 = i165 & 25;
                int i167 = i166 + ((i165 ^ 25) | i166);
                a = i167 % 128;
                if (i167 % 2 == 0) {
                    int i168 = 2 % 3;
                }
            } else {
                dimension = typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension);
            int i169 = a;
            int i170 = i169 & 3;
            int i171 = (i170 - (~(-(-((i169 ^ 3) | i170))))) - 1;
            b = i171 % 128;
            int i172 = i171 % 2;
        } else {
            propertyValuesHolderOfInt = null;
        }
        if (propertyValuesHolderOfInt != null) {
            int i173 = b;
            int i174 = i173 ^ 47;
            int i175 = (i173 & 47) << 1;
            int i176 = ((i174 | i175) << 1) - (i175 ^ i174);
            a = i176 % 128;
            if (i176 % 2 == 0) {
                int i177 = 99 / 0;
                if (eVar != null) {
                    propertyValuesHolderOfInt.setEvaluator(eVar);
                    int i178 = a;
                    i5 = ((i178 ^ 124) + ((i178 & 124) << 1)) - 1;
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i179 = 3 / 5;
                    }
                }
            } else if (eVar != null) {
                propertyValuesHolderOfInt.setEvaluator(eVar);
                int i1710 = a;
                i5 = ((i1710 ^ 124) + ((i1710 & 124) << 1)) - 1;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i1711 = 3 / 5;
                }
            }
        }
        return propertyValuesHolderOfInt;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x04ca A[PHI: r3
  0x04ca: PHI (r3v34 float) = (r3v33 float), (r3v45 float) binds: [B:160:0x04c8, B:157:0x04c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x04ce A[PHI: r3
  0x04ce: PHI (r3v35 float) = (r3v33 float), (r3v45 float) binds: [B:160:0x04c8, B:157:0x04c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:236:0x0784  */
    /* JADX WARN: Code duplicated, block: B:238:0x0790  */
    /* JADX WARN: Code duplicated, block: B:240:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02fb  */
    public static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        int i2;
        int i3;
        int i4;
        PropertyValuesHolder propertyValuesHolderD;
        int size;
        float f2;
        int i5;
        Keyframe keyframe;
        Keyframe keyframe2;
        float f3;
        int i6;
        int i7;
        TypedValue typedValuePeekValue;
        boolean z;
        int i8;
        int i9;
        int i10;
        Keyframe keyframeOfInt;
        float f4;
        int i11;
        TypedValue typedValuePeekValue2;
        int i12;
        int i13;
        Animator animator;
        Animator animator2;
        resources = resources;
        theme = theme;
        int i14 = 2;
        int i15 = 2 % 2;
        int depth = xmlPullParser.getDepth();
        int i16 = a;
        int i17 = i16 & 29;
        int i18 = 1;
        int i19 = ((i16 | 29) & (~i17)) + (i17 << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
        Animator animator3 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i21 = 3;
            boolean z2 = false;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == i18) {
                break;
            }
            if (next == i14) {
                int i22 = a + 51;
                b = i22 % 128;
                int i23 = i22 % i14;
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    f(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
                    int i24 = a;
                    int i25 = i24 & 121;
                    int i26 = ((~i25) & (i24 | 121)) + (i25 << i18);
                    b = i26 % 128;
                    int i27 = i26 % i14;
                    int i28 = i24 & 81;
                    int i29 = (i28 - (~(-(-((i24 ^ 81) | i28))))) - i18;
                    b = i29 % 128;
                    int i30 = i29 % i14;
                    animator2 = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        ValueAnimator valueAnimatorF = f(context, resources, theme, attributeSet, null, f, xmlPullParser);
                        int i31 = b;
                        int i32 = ((i31 ^ 113) - (~(-(-((i31 & 113) << i18))))) - i18;
                        a = i32 % 128;
                        int i33 = i32 % i14;
                        animator = valueAnimatorF;
                        animator3 = animator;
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayE = Q.e(resources, theme, attributeSet, c.k);
                        if (((Q.d(xmlPullParser, "ordering") ? 1 : 0) ^ i18) != 0) {
                            int i34 = b;
                            int i35 = ((i34 | 28) << i18) - (i34 ^ 28);
                            int i36 = (i35 ^ (-1)) + (i35 << i18);
                            a = i36 % 128;
                            int i37 = i36 % i14;
                            i12 = 0;
                        } else {
                            i12 = typedArrayE.getInt(0, 0);
                        }
                        b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, i12, f);
                        int i38 = b;
                        int i39 = i38 & 81;
                        int i40 = (i38 ^ 81) | i39;
                        int i41 = (i39 ^ i40) + ((i40 & i39) << i18);
                        a = i41 % 128;
                        int i42 = i41 % i14;
                        typedArrayE.recycle();
                        z2 = false;
                        animator2 = animatorSet2;
                    } else {
                        int i43 = 0;
                        String str2 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            StringBuilder sbW = j.w("Unknown animator name: ");
                            sbW.append(xmlPullParser.getName());
                            throw new RuntimeException(sbW.toString());
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType == i21 || eventType == i18) {
                                break;
                            }
                            if (eventType != i14) {
                                xmlPullParser.next();
                            } else {
                                if (xmlPullParser.getName().equals(str2)) {
                                    int i44 = a + 89;
                                    b = i44 % 128;
                                    int i45 = i44 % i14;
                                    TypedArray typedArrayE2 = Q.e(resources, theme, attributeSetAsAttributeSet, c.c);
                                    String strC = Q.c(typedArrayE2, xmlPullParser, "propertyName", i21);
                                    boolean zD = Q.d(xmlPullParser, "valueType");
                                    int i46 = a;
                                    int i47 = (i46 ^ 66) + ((i46 & 66) << 1);
                                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                                    b = i48 % 128;
                                    if (i48 % i14 == 0 ? !zD : !zD) {
                                        i4 = 4;
                                    } else {
                                        int i49 = i46 & 105;
                                        int i50 = ((i46 ^ 105) | i49) << i18;
                                        int i51 = -((~i49) & (i46 | 105));
                                        int i52 = (i50 ^ i51) + ((i50 & i51) << i18);
                                        b = i52 % 128;
                                        int i53 = i52 % i14;
                                        i4 = typedArrayE2.getInt(i14, 4);
                                    }
                                    int i54 = i4;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlPullParser.next();
                                        if (next2 == 3 || next2 == i18) {
                                            break;
                                        }
                                        int i55 = a;
                                        int i56 = (i55 & 67) + (i55 | 67);
                                        b = i56 % 128;
                                        if (i56 % 2 != 0) {
                                            xmlPullParser.getName().equals("keyframe");
                                            throw null;
                                        }
                                        if (xmlPullParser.getName().equals("keyframe")) {
                                            int i57 = i54;
                                            if (i57 == 4) {
                                                TypedArray typedArrayE3 = Q.e(resources, theme, Xml.asAttributeSet(xmlPullParser), c.l);
                                                int i58 = a;
                                                int i59 = (((i58 & (-90)) | ((~i58) & 89)) - (~((i58 & 89) << 1))) - 1;
                                                b = i59 % 128;
                                                int i60 = i59 % 2;
                                                if (Q.d(xmlPullParser, "value")) {
                                                    typedValuePeekValue2 = typedArrayE3.peekValue(0);
                                                } else {
                                                    int i61 = a;
                                                    int i62 = ((i61 | 114) << 1) - (i61 ^ 114);
                                                    int i63 = (i62 ^ (-1)) + (i62 << 1);
                                                    b = i63 % 128;
                                                    int i64 = i63 % 2;
                                                    typedValuePeekValue2 = null;
                                                }
                                                int i65 = (typedValuePeekValue2 == null || !e(typedValuePeekValue2.type)) ? 0 : 3;
                                                typedArrayE3.recycle();
                                                i57 = i65;
                                            }
                                            TypedArray typedArrayE4 = Q.e(resources, theme, Xml.asAttributeSet(xmlPullParser), c.l);
                                            boolean zD2 = Q.d(xmlPullParser, "fraction");
                                            int i66 = b;
                                            int i67 = i66 & 69;
                                            String str3 = str2;
                                            int i68 = -(-((i66 ^ 69) | i67));
                                            int i69 = (i67 & i68) + (i67 | i68);
                                            a = i69 % 128;
                                            if (i69 % 2 == 0) {
                                                Object obj = null;
                                                obj.hashCode();
                                                throw null;
                                            }
                                            float f5 = zD2 ? typedArrayE4.getFloat(3, -1.0f) : -1.0f;
                                            if (!(!Q.d(xmlPullParser, "value"))) {
                                                typedValuePeekValue = typedArrayE4.peekValue(0);
                                            } else {
                                                int i70 = a;
                                                int i71 = (i70 & 43) + (i70 | 43);
                                                b = i71 % 128;
                                                int i72 = i71 % 2;
                                                typedValuePeekValue = null;
                                            }
                                            if (typedValuePeekValue != null) {
                                                z = true;
                                            } else {
                                                int i73 = a + 55;
                                                b = i73 % 128;
                                                int i74 = i73 % 2;
                                                z = false;
                                            }
                                            if (i57 == 4) {
                                                if (!z) {
                                                    i8 = i57;
                                                } else {
                                                    int i75 = a;
                                                    int i76 = i75 ^ 121;
                                                    int i77 = (i76 | (i75 & 121)) << 1;
                                                    int i78 = -i76;
                                                    int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                                                    i8 = i57;
                                                    b = i79 % 128;
                                                    if (i79 % 2 != 0) {
                                                        e(typedValuePeekValue.type);
                                                        throw null;
                                                    }
                                                    if (e(typedValuePeekValue.type)) {
                                                        i9 = 2;
                                                        i10 = 3;
                                                    }
                                                }
                                                i9 = 2;
                                                i10 = 0;
                                            } else {
                                                i8 = i57;
                                                int i80 = b;
                                                int i81 = (i80 ^ 93) + ((i80 & 93) << 1);
                                                a = i81 % 128;
                                                i9 = 2;
                                                int i82 = i81 % 2;
                                                i10 = i8;
                                            }
                                            if (z) {
                                                if (i10 != 0) {
                                                    int i83 = a + 103;
                                                    int i84 = i83 % 128;
                                                    b = i84;
                                                    if (i83 % i9 != 0) {
                                                        if (i10 != 0) {
                                                            int i85 = (i84 & (-54)) | ((~i84) & 53);
                                                            int i86 = -(-((i84 & 53) << 1));
                                                            int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                                                            a = i87 % 128;
                                                            int i88 = i87 % 2;
                                                            if (i10 != 3) {
                                                                keyframeOfInt = null;
                                                            }
                                                        }
                                                    } else if (i10 != 1) {
                                                        int i89 = (i84 & (-54)) | ((~i84) & 53);
                                                        int i810 = -(-((i84 & 53) << 1));
                                                        int i811 = (i89 ^ i810) + ((i89 & i810) << 1);
                                                        a = i811 % 128;
                                                        int i812 = i811 % 2;
                                                        if (i10 != 3) {
                                                            keyframeOfInt = null;
                                                        }
                                                    }
                                                    if (Q.d(xmlPullParser, "value")) {
                                                        i11 = typedArrayE4.getInt(0, 0);
                                                    } else {
                                                        int i90 = a + 53;
                                                        b = i90 % 128;
                                                        int i91 = i90 % 2;
                                                        i11 = 0;
                                                    }
                                                    keyframeOfInt = Keyframe.ofInt(f5, i11);
                                                } else {
                                                    if (Q.d(xmlPullParser, "value")) {
                                                        f4 = typedArrayE4.getFloat(0, 0.0f);
                                                        int i92 = a;
                                                        int i93 = i92 & 47;
                                                        int i94 = ((i92 | 47) & (~i93)) + (i93 << 1);
                                                        b = i94 % 128;
                                                        int i95 = i94 % 2;
                                                    } else {
                                                        int i96 = a;
                                                        int i97 = (-2) - ((((i96 | 110) << 1) - (i96 ^ 110)) ^ (-1));
                                                        b = i97 % 128;
                                                        int i98 = i97 % 2;
                                                        f4 = 0.0f;
                                                    }
                                                    keyframeOfInt = Keyframe.ofFloat(f5, f4);
                                                }
                                            } else if (i10 == 0) {
                                                int i99 = b;
                                                int i100 = i99 & 13;
                                                int i101 = i99 | 13;
                                                int i102 = (i100 & i101) + (i101 | i100);
                                                a = i102 % 128;
                                                int i103 = i102 % 2;
                                                keyframeOfInt = Keyframe.ofFloat(f5);
                                            } else {
                                                keyframeOfInt = Keyframe.ofInt(f5);
                                                int i104 = b;
                                                int i105 = (-2) - (((i104 ^ 108) + ((i104 & 108) << 1)) ^ (-1));
                                                a = i105 % 128;
                                                int i106 = i105 % 2;
                                            }
                                            int resourceId = !Q.d(xmlPullParser, "interpolator") ? 0 : typedArrayE4.getResourceId(1, 0);
                                            if (resourceId > 0) {
                                                keyframeOfInt.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            typedArrayE4.recycle();
                                            if (keyframeOfInt != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                    int i107 = a;
                                                    int i108 = (((i107 | 84) << 1) - (i107 ^ 84)) - 1;
                                                    b = i108 % 128;
                                                    int i109 = i108 % 2;
                                                }
                                                arrayList3.add(keyframeOfInt);
                                            }
                                            xmlPullParser.next();
                                            i54 = i8;
                                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                            str2 = str3;
                                            i18 = 1;
                                        } else {
                                            str2 = str2;
                                        }
                                    }
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    str = str2;
                                    int i110 = i54;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i3 = 3;
                                        propertyValuesHolderD = null;
                                    } else {
                                        int i111 = a + 105;
                                        b = i111 % 128;
                                        int i112 = i111 % 2;
                                        Keyframe keyframe3 = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe4 = (Keyframe) arrayList3.get(size - 1);
                                        int i113 = a + 4;
                                        int i114 = (i113 ^ (-1)) + (i113 << 1);
                                        b = i114 % 128;
                                        if (i114 % 2 != 0) {
                                            keyframe4.getFraction();
                                            throw null;
                                        }
                                        float fraction = keyframe4.getFraction();
                                        if (fraction < 1.0f) {
                                            int i115 = a;
                                            int i116 = i115 & 125;
                                            int i117 = ((((i115 ^ 125) | i116) << 1) - (~(-((~i116) & (i115 | 125))))) - 1;
                                            b = i117 % 128;
                                            if (i117 % 2 == 0 ? fraction >= 0.0f : fraction >= 0.0f) {
                                                arrayList3.add(arrayList3.size(), c(keyframe4, 1.0f));
                                                int i118 = (-2) - ((b + 30) ^ (-1));
                                                a = i118 % 128;
                                                int i119 = i118 % 2;
                                                int i120 = size & 1;
                                                int i121 = (size ^ 1) | i120;
                                                size = ((i120 | i121) << 1) - (i121 ^ i120);
                                            } else {
                                                keyframe4.setFraction(1.0f);
                                            }
                                        }
                                        float fraction2 = keyframe3.getFraction();
                                        int i122 = a;
                                        int i123 = (i122 ^ 9) + ((i122 & 9) << 1);
                                        b = i123 % 128;
                                        if (i123 % 2 == 0 ? fraction2 != 0.0f : fraction2 != 1.0f) {
                                            int i124 = ((i122 ^ 57) - (~(-(-((i122 & 57) << 1))))) - 1;
                                            b = i124 % 128;
                                            if (i124 % 2 != 0) {
                                                f2 = 0.0f;
                                                if (fraction2 < 2.0f) {
                                                    keyframe3.setFraction(f2);
                                                } else {
                                                    arrayList3.add(0, c(keyframe3, f2));
                                                    int i125 = a;
                                                    int i126 = (i125 ^ 80) + ((i125 & 80) << 1);
                                                    i5 = (i126 ^ (-1)) + (i126 << 1);
                                                    b = i5 % 128;
                                                    if (i5 % 2 != 0) {
                                                        size <<= 1;
                                                    } else {
                                                        int i127 = ((size ^ 1) | (size & 1)) << 1;
                                                        int i128 = -(((~size) & 1) | (size & (-2)));
                                                        size = ((i127 | i128) << 1) - (i128 ^ i127);
                                                    }
                                                }
                                            } else {
                                                f2 = 0.0f;
                                                if (fraction2 < 0.0f) {
                                                    keyframe3.setFraction(f2);
                                                } else {
                                                    arrayList3.add(0, c(keyframe3, f2));
                                                    int i129 = a;
                                                    int i1210 = (i129 ^ 80) + ((i129 & 80) << 1);
                                                    i5 = (i1210 ^ (-1)) + (i1210 << 1);
                                                    b = i5 % 128;
                                                    if (i5 % 2 != 0) {
                                                        size <<= 1;
                                                    } else {
                                                        int i1211 = ((size ^ 1) | (size & 1)) << 1;
                                                        int i1212 = -(((~size) & 1) | (size & (-2)));
                                                        size = ((i1211 | i1212) << 1) - (i1212 ^ i1211);
                                                    }
                                                }
                                            }
                                        }
                                        Keyframe[] keyframeArr = new Keyframe[size];
                                        arrayList3.toArray(keyframeArr);
                                        int i130 = 0;
                                        while (i130 < size) {
                                            int i131 = a;
                                            int i132 = ((i131 & 36) + (i131 | 36)) - 1;
                                            b = i132 % 128;
                                            if (i132 % 2 != 0) {
                                                keyframe = keyframeArr[i130];
                                                int i133 = 34 / 0;
                                            } else {
                                                keyframe = keyframeArr[i130];
                                            }
                                            if (keyframe.getFraction() < 0.0f) {
                                                if (i130 == 0) {
                                                    keyframe.setFraction(0.0f);
                                                    int i134 = a;
                                                    int i135 = i134 | 11;
                                                    int i136 = i135 << 1;
                                                    int i137 = -((~(i134 & 11)) & i135);
                                                    int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                                    b = i138 % 128;
                                                    int i139 = i138 % 2;
                                                } else {
                                                    int i140 = ~size;
                                                    int i141 = size << 1;
                                                    int i142 = (i140 ^ i141) + ((i140 & i141) << 1);
                                                    if (i130 == i142) {
                                                        keyframe.setFraction(1.0f);
                                                    } else {
                                                        int i143 = i130 ^ 1;
                                                        int i144 = -(-((i130 & 1) << 1));
                                                        int i145 = (i143 & i144) + (i143 | i144);
                                                        int i146 = i130;
                                                        while (i145 < i142 && keyframeArr[i145].getFraction() < 0.0f) {
                                                            int i147 = b + 87;
                                                            a = i147 % 128;
                                                            if (i147 % 2 == 0) {
                                                                int i148 = (-2) - ((i145 + 227) ^ (-1));
                                                                int i149 = i145;
                                                                i145 = (-2) - ((((i148 | (-102)) << 1) - (i148 ^ (-102))) ^ (-1));
                                                                i146 = i149;
                                                            } else {
                                                                int i150 = (i145 | (-116)) << 1;
                                                                int i151 = size;
                                                                int i152 = -(((~i145) & (-116)) | (i145 & 115));
                                                                int i153 = (i150 ^ i152) + ((i152 & i150) << 1);
                                                                int i154 = i153 & 117;
                                                                int i155 = (~i154) & (i153 | 117);
                                                                int i156 = -(-(i154 << 1));
                                                                int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
                                                                i146 = i145;
                                                                i145 = i157;
                                                                size = i151;
                                                            }
                                                        }
                                                        int i158 = ~i146;
                                                        int i159 = (i146 & (-2)) | (1 & i158);
                                                        int i160 = -(-((i146 & 1) << 1));
                                                        float fraction3 = keyframeArr[(i159 ^ i160) + ((i159 & i160) << 1)].getFraction();
                                                        int i161 = b + 87;
                                                        a = i161 % 128;
                                                        if (i161 % 2 == 0) {
                                                            keyframe2 = keyframeArr[i130 % 1];
                                                        } else {
                                                            int i162 = ((i130 ^ (-1)) | i130) << 1;
                                                            int i163 = -(~i130);
                                                            keyframe2 = keyframeArr[((i162 | i163) << 1) - (i162 ^ i163)];
                                                        }
                                                        float fraction4 = fraction3 - keyframe2.getFraction();
                                                        int i164 = -i130;
                                                        int i165 = (i158 & i164) | ((~i164) & i146);
                                                        int i166 = (i164 & i146) << 1;
                                                        int i167 = ((i165 | i166) << 1) - (i165 ^ i166);
                                                        int i168 = b;
                                                        int i169 = i168 & 67;
                                                        int i170 = -(-((i168 ^ 67) | i169));
                                                        int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                                                        a = i171 % 128;
                                                        if (i171 % 2 == 0) {
                                                            f3 = i167 - 4;
                                                        } else {
                                                            int i172 = i167 & 2;
                                                            int i173 = (i167 ^ 2) | i172;
                                                            f3 = (i172 & i173) + (i172 | i173);
                                                        }
                                                        float f6 = fraction4 / f3;
                                                        int i174 = i130;
                                                        while (i174 <= i146) {
                                                            int i175 = i146;
                                                            keyframeArr[i174].setFraction(keyframeArr[((((i174 ^ (-1)) | i174) << 1) - (~(-(~i174)))) - 1].getFraction() + f6);
                                                            int i176 = b;
                                                            int i177 = i176 & 39;
                                                            int i178 = i177 + ((i176 ^ 39) | i177);
                                                            a = i178 % 128;
                                                            if (i178 % 2 == 0) {
                                                                int i179 = i174 ^ 30;
                                                                int i180 = ((i174 & 30) | i179) << 1;
                                                                int i181 = -i179;
                                                                i6 = i180 & i181;
                                                                i7 = i181 | i180;
                                                            } else {
                                                                int i182 = (-2) - ((((i174 | (-3)) << 1) - (i174 ^ (-3))) ^ (-1));
                                                                int i183 = (i182 & (-6)) | ((~i182) & 5);
                                                                int i184 = (i182 & 5) << 1;
                                                                i6 = i183 ^ i184;
                                                                i7 = (i184 & i183) << 1;
                                                            }
                                                            i174 = i6 + i7;
                                                            i146 = i175;
                                                        }
                                                    }
                                                }
                                                size = size;
                                            } else {
                                                size = size;
                                            }
                                            int i185 = i130 | (-70);
                                            int i186 = i185 << 1;
                                            int i187 = -(i185 & (~(i130 & (-70))));
                                            int i188 = ((i186 | i187) << 1) - (i187 ^ i186);
                                            i130 = ((i188 & 72) + (i188 | 72)) - 1;
                                            size = size;
                                        }
                                        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strC, keyframeArr);
                                        i3 = 3;
                                        if (i110 == 3) {
                                            propertyValuesHolderOfKeyframe.setEvaluator(e.c);
                                        }
                                        propertyValuesHolderD = propertyValuesHolderOfKeyframe;
                                    }
                                    if (propertyValuesHolderD == null) {
                                        int i189 = b;
                                        int i190 = i189 | 115;
                                        int i191 = i190 << 1;
                                        int i192 = -((~(i189 & 115)) & i190);
                                        int i193 = ((i191 | i192) << 1) - (i192 ^ i191);
                                        a = i193 % 128;
                                        int i194 = i193 % 2;
                                        i2 = 0;
                                        propertyValuesHolderD = d(typedArrayE2, i4, 0, 1, strC);
                                    } else {
                                        i2 = 0;
                                    }
                                    if (propertyValuesHolderD != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolderD);
                                    }
                                    typedArrayE2.recycle();
                                } else {
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    str = str2;
                                    i2 = i43;
                                    i3 = i21;
                                }
                                xmlPullParser.next();
                                theme = theme;
                                i21 = i3;
                                i43 = i2;
                                attributeSetAsAttributeSet = attributeSet2;
                                str2 = str;
                                i14 = 2;
                                i18 = 1;
                                resources = resources;
                            }
                        }
                        int i195 = i43;
                        if (arrayList2 != null) {
                            int i196 = a;
                            int i197 = (i196 & 106) + (i196 | 106);
                            int i198 = (i197 ^ (-1)) + (i197 << 1);
                            b = i198 % 128;
                            int i199 = i198 % 2;
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i200 = i195; i200 < size2; i200 = (((i200 | 2) << 1) - (i200 ^ 2)) - 1) {
                                propertyValuesHolderArr[i200] = (PropertyValuesHolder) arrayList2.get(i200);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null) {
                            int i201 = a;
                            int i202 = i201 & 15;
                            int i203 = (i201 ^ 15) | i202;
                            int i204 = (i202 & i203) + (i202 | i203);
                            b = i204 % 128;
                            int i205 = i204 % 2;
                            if (animator3 instanceof ValueAnimator) {
                                int i206 = i201 ^ 59;
                                int i207 = ((i201 & 59) | i206) << 1;
                                int i208 = -i206;
                                int i209 = (i207 & i208) + (i207 | i208);
                                b = i209 % 128;
                                int i210 = i209 % 2;
                                ((ValueAnimator) animator3).setValues(propertyValuesHolderArr);
                            }
                        }
                        z2 = true;
                        animator3 = animator3;
                    }
                    if (animatorSet != null) {
                        i13 = b;
                        int i211 = i13 + 65;
                        a = i211 % 128;
                        int i212 = i211 % 2;
                        if (!z2) {
                            int i213 = (((i13 | 18) << 1) - (i13 ^ 18)) - 1;
                            a = i213 % 128;
                            int i214 = i213 % 2;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(animator3);
                            arrayList = arrayList4;
                        }
                    }
                    i14 = 2;
                    i18 = 1;
                }
                animator = animator2;
                animator3 = animator;
                if (animatorSet != null) {
                    i13 = b;
                    int i215 = i13 + 65;
                    a = i215 % 128;
                    int i216 = i215 % 2;
                    if (!z2) {
                        int i217 = (((i13 | 18) << 1) - (i13 ^ 18)) - 1;
                        a = i217 % 128;
                        int i218 = i217 % 2;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ArrayList arrayList5 = arrayList;
                        arrayList5.add(animator3);
                        arrayList = arrayList5;
                    }
                }
                i14 = 2;
                i18 = 1;
            }
        }
        if (animatorSet != null) {
            int i219 = b;
            int i220 = ((i219 ^ 119) | (i219 & 119)) << 1;
            int i221 = -(((~i219) & 119) | (i219 & (-120)));
            int i222 = (i220 & i221) + (i221 | i220);
            a = i222 % 128;
            int i223 = i222 % 2;
            if (arrayList != null) {
                Animator[] animatorArr = new Animator[arrayList.size()];
                int i224 = a;
                int i225 = i224 & 91;
                int i226 = i225 + ((i224 ^ 91) | i225);
                b = i226 % 128;
                int i227 = i226 % 2;
                Iterator it = arrayList.iterator();
                int i228 = 0;
                while (it.hasNext()) {
                    int i229 = a;
                    int i230 = i229 & 35;
                    int i231 = i229 | 35;
                    int i232 = (i230 & i231) + (i231 | i230);
                    b = i232 % 128;
                    int i233 = i232 % 2;
                    animatorArr[i228] = (Animator) it.next();
                    int i234 = b + 39;
                    a = i234 % 128;
                    if (i234 % 2 == 0) {
                        int i235 = i228 & 118;
                        int i236 = (~i235) & (i228 | 118);
                        int i237 = i235 << 1;
                        i228 = ((i236 | i237) << 1) - (i237 ^ i236);
                    } else {
                        int i238 = i228 + 2;
                        i228 = (i238 ^ (-1)) + (i238 << 1);
                    }
                }
                if (i == 0) {
                    int i239 = b + 33;
                    a = i239 % 128;
                    int i240 = i239 % 2;
                    animatorSet.playTogether(animatorArr);
                } else {
                    animatorSet.playSequentially(animatorArr);
                }
            }
        }
        return animator3;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0307 A[DONT_INVERT, PHI: r8
  0x0307: PHI (r8v13 java.lang.String) = (r8v12 java.lang.String), (r8v21 java.lang.String) binds: [B:106:0x0305, B:103:0x02fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x030a  */
    /* JADX WARN: Code duplicated, block: B:144:0x04be A[PHI: r1
  0x04be: PHI (r1v86 int) = (r1v80 int), (r1v87 int) binds: [B:143:0x04bc, B:140:0x04ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:201:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0200  */
    /* JADX WARN: Code duplicated, block: B:76:0x0205  */
    public static ValueAnimator f(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        int i;
        int i2;
        int i3;
        int i4;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator3;
        String strC;
        float length;
        int iMin;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder[] propertyValuesHolderArr;
        Float f2;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        TypedArray typedArrayE = Q.e(resources, theme, attributeSet, c.j);
        int[] iArr = c.m;
        int i11 = a + 115;
        b = i11 % 128;
        if (i11 % 2 != 0) {
            Q.e(resources, theme, attributeSet, iArr);
            throw null;
        }
        TypedArray typedArrayE2 = Q.e(resources, theme, attributeSet, iArr);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        boolean zD = Q.d(xmlPullParser, "duration");
        int i12 = a;
        int i13 = i12 & 87;
        int i14 = (i12 | 87) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        int i19 = 300;
        if (zD) {
            int i20 = (i17 & 33) + (i17 | 33);
            a = i20 % 128;
            i19 = i20 % 2 == 0 ? typedArrayE.getInt(1, 7815) : typedArrayE.getInt(1, 300);
        }
        long j = i19;
        if (Q.d(xmlPullParser, "startOffset")) {
            i = typedArrayE.getInt(2, 0);
            int i21 = b;
            int i22 = i21 & 87;
            int i23 = (((i21 ^ 87) | i22) << 1) - ((i21 | 87) & (~i22));
            a = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = a;
            int i26 = (i25 | 69) << 1;
            int i27 = -((i25 & (-70)) | ((~i25) & 69));
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = i25 + 115;
            b = i30 % 128;
            int i31 = i30 % 2;
            i = 0;
        }
        long j2 = i;
        if (Q.d(xmlPullParser, "valueType")) {
            i2 = typedArrayE.getInt(7, 4);
        } else {
            int i32 = a;
            int i33 = ((i32 ^ 63) | (i32 & 63)) << 1;
            int i34 = -((i32 & (-64)) | (63 & (~i32)));
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            int i36 = i35 % 128;
            b = i36;
            i2 = i35 % 2 != 0 ? 5 : 4;
            int i37 = ((i36 & (-16)) | ((~i36) & 15)) + ((i36 & 15) << 1);
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        if (Q.d(xmlPullParser, "valueFrom")) {
            int i39 = a;
            int i40 = ((i39 & (-104)) | (103 & (~i39))) + ((i39 & 103) << 1);
            b = i40 % 128;
            if (i40 % 2 != 0) {
                Q.d(xmlPullParser, "valueTo");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Q.d(xmlPullParser, "valueTo")) {
                int i41 = b + 95;
                a = i41 % 128;
                if (i41 % 2 != 0 ? i2 == 4 : i2 == 3) {
                    TypedValue typedValuePeekValue = typedArrayE.peekValue(5);
                    if (typedValuePeekValue != null) {
                        int i42 = a;
                        int i43 = i42 ^ 113;
                        int i44 = -(-((i42 & 113) << 1));
                        int i45 = (i43 & i44) + (i44 | i43);
                        b = i45 % 128;
                        z = i45 % 2 == 0;
                        int i46 = i42 + 119;
                        b = i46 % 128;
                        int i47 = i46 % 2;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i48 = a;
                        int i49 = ((((i48 ^ 87) | (i48 & 87)) << 1) - (~(-((i48 & (-88)) | (87 & (~i48)))))) - 1;
                        b = i49 % 128;
                        if (i49 % 2 != 0) {
                            i6 = typedValuePeekValue.type;
                            int i50 = 57 / 0;
                        } else {
                            i6 = typedValuePeekValue.type;
                        }
                        int i51 = b;
                        int i52 = i51 & 75;
                        int i53 = i51 | 75;
                        int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                        a = i54 % 128;
                        int i55 = i54 % 2;
                    } else {
                        i6 = 0;
                    }
                    TypedValue typedValuePeekValue2 = typedArrayE.peekValue(6);
                    if (typedValuePeekValue2 != null) {
                        int i56 = b;
                        int i57 = (i56 | 81) << 1;
                        int i58 = -((i56 & (-82)) | ((~i56) & 81));
                        int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                        a = i59 % 128;
                        int i60 = i59 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        int i61 = a + 119;
                        b = i61 % 128;
                        int i62 = i61 % 2;
                        i7 = typedValuePeekValue2.type;
                    } else {
                        i7 = 0;
                    }
                    if (z) {
                        int i63 = a + 97;
                        b = i63 % 128;
                        if (i63 % 2 != 0) {
                            e(i6);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (e(i6)) {
                            int i64 = b;
                            int i65 = i64 & 125;
                            int i66 = ((i64 ^ 125) | i65) << 1;
                            int i67 = -((i64 | 125) & (~i65));
                            i9 = (i66 & i67) + (i67 | i66);
                            a = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i68 = 2 % 3;
                            }
                            i2 = 3;
                        } else {
                            if (z2) {
                                int i69 = b;
                                i8 = (i69 ^ 7) + ((i69 & 7) << 1);
                                a = i8 % 128;
                                if (i8 % 2 != 0) {
                                    e(i7);
                                    throw null;
                                }
                                if (e(i7)) {
                                    int i610 = b;
                                    int i611 = i610 & 125;
                                    int i612 = ((i610 ^ 125) | i611) << 1;
                                    int i613 = -((i610 | 125) & (~i611));
                                    i9 = (i612 & i613) + (i613 | i612);
                                    a = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        int i614 = 2 % 3;
                                    }
                                    i2 = 3;
                                }
                            }
                            i2 = 0;
                        }
                    } else {
                        if (z2) {
                            int i615 = b;
                            i8 = (i615 ^ 7) + ((i615 & 7) << 1);
                            a = i8 % 128;
                            if (i8 % 2 != 0) {
                                e(i7);
                                throw null;
                            }
                            if (e(i7)) {
                                int i616 = b;
                                int i617 = i616 & 125;
                                int i618 = ((i616 ^ 125) | i617) << 1;
                                int i619 = -((i616 | 125) & (~i617));
                                i9 = (i618 & i619) + (i619 | i618);
                                a = i9 % 128;
                                if (i9 % 2 == 0) {
                                    int i6110 = 2 % 3;
                                }
                                i2 = 3;
                            }
                        }
                        i2 = 0;
                    }
                }
                PropertyValuesHolder propertyValuesHolderD = d(typedArrayE, i2, 5, 6, BuildConfig.FLAVOR);
                if (propertyValuesHolderD != null) {
                    int i70 = b + 25;
                    a = i70 % 128;
                    int i71 = i70 % 2;
                    valueAnimator4.setValues(propertyValuesHolderD);
                }
            }
        }
        valueAnimator4.setDuration(j);
        valueAnimator4.setStartDelay(j2);
        int i72 = a;
        int i73 = i72 & 17;
        int i74 = i73 + ((i72 ^ 17) | i73);
        b = i74 % 128;
        if (i74 % 2 != 0) {
            Object obj3 = null;
            Q.d(xmlPullParser, "repeatCount");
            obj3.hashCode();
            throw null;
        }
        if (!Q.d(xmlPullParser, "repeatCount")) {
            int i75 = b;
            int i76 = (-2) - (((i75 ^ 10) + ((i75 & 10) << 1)) ^ (-1));
            a = i76 % 128;
            int i77 = i76 % 2;
            i3 = 0;
        } else {
            i3 = typedArrayE.getInt(3, 0);
        }
        valueAnimator4.setRepeatCount(i3);
        if (Q.d(xmlPullParser, "repeatMode")) {
            i4 = typedArrayE.getInt(4, 1);
            int i78 = a;
            int i79 = (i78 ^ 33) + ((i78 & 33) << 1);
            b = i79 % 128;
            int i80 = i79 % 2;
        } else {
            int i81 = (-2) - ((a + 38) ^ (-1));
            b = i81 % 128;
            int i82 = i81 % 2;
            i4 = 1;
        }
        valueAnimator4.setRepeatMode(i4);
        if (typedArrayE2 != null) {
            int i83 = a;
            int i84 = i83 & 125;
            int i85 = ((((i83 ^ 125) | i84) << 1) - (~(-((i83 | 125) & (~i84))))) - 1;
            b = i85 % 128;
            if (i85 % 2 != 0) {
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String strC2 = Q.c(typedArrayE2, xmlPullParser, "pathData", 1);
            if (strC2 != null) {
                int i86 = b;
                int i87 = i86 & 57;
                int i88 = ((((i86 ^ 57) | i87) << 1) - (~(-((i86 | 57) & (~i87))))) - 1;
                a = i88 % 128;
                int i89 = i88 % 2;
                String strC3 = Q.c(typedArrayE2, xmlPullParser, "propertyXName", 2);
                int i90 = a;
                int i91 = ((i90 ^ 69) | (i90 & 69)) << 1;
                int i92 = -(((~i90) & 69) | (i90 & (-70)));
                int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                b = i93 % 128;
                if (i93 % 2 != 0) {
                    strC = Q.c(typedArrayE2, xmlPullParser, "propertyYName", 5);
                    if (strC3 == null) {
                        if (strC == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(typedArrayE2.getPositionDescription());
                            sb.append(" propertyXName or propertyYName is needed for PathData");
                            throw new InflateException(sb.toString());
                        }
                    }
                } else {
                    strC = Q.c(typedArrayE2, xmlPullParser, "propertyYName", 3);
                    if (strC3 == null) {
                        if (strC == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(typedArrayE2.getPositionDescription());
                            sb2.append(" propertyXName or propertyYName is needed for PathData");
                            throw new InflateException(sb2.toString());
                        }
                    }
                }
                Path pathE = ivas.gov.bisp.enumeration.p007ag.r.e(strC2);
                PathMeasure pathMeasure = new PathMeasure(pathE, false);
                ArrayList arrayList = new ArrayList();
                int i94 = a;
                int i95 = ((i94 ^ 64) + ((i94 & 64) << 1)) - 1;
                b = i95 % 128;
                if (i95 % 2 != 0) {
                    arrayList.add(Float.valueOf(2.0f));
                    length = 1.0f;
                } else {
                    arrayList.add(Float.valueOf(0.0f));
                    length = 0.0f;
                }
                int i96 = a;
                int i97 = (i96 & 37) + (i96 | 37);
                b = i97 % 128;
                int i98 = i97 % 2;
                do {
                    length += pathMeasure.getLength();
                    int i99 = a + 15;
                    b = i99 % 128;
                    int i100 = i99 % 2;
                    arrayList.add(Float.valueOf(length));
                    int i101 = a + 31;
                    b = i101 % 128;
                    int i102 = i101 % 2;
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathE, false);
                int i103 = a;
                int i104 = (((i103 ^ 55) | (i103 & 55)) << 1) - (((~i103) & 55) | (i103 & (-56)));
                int i105 = i104 % 128;
                b = i105;
                int i106 = (int) (i104 % 2 != 0 ? f + 0.5f + length : length / (0.5f * f));
                int i107 = i105 ^ 29;
                int i108 = (i105 & 29) << 1;
                int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
                a = i109 % 128;
                if (i109 % 2 == 0) {
                    iMin = Math.min(51, i106 % 1);
                } else {
                    int i110 = i106 & 1;
                    int i111 = -(-((i106 ^ 1) | i110));
                    iMin = Math.min(100, (i110 ^ i111) + ((i110 & i111) << 1));
                }
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                int i112 = b;
                int i113 = i112 & 63;
                int i114 = -(-(i112 | 63));
                int i115 = (i113 & i114) + (i113 | i114);
                typedArray = typedArrayE;
                a = i115 % 128;
                int i116 = i115 % 2;
                float[] fArr3 = new float[2];
                float f3 = length / ((iMin ^ (-1)) + (iMin << 1));
                int i117 = ((((~i112) & 115) | (i112 & (-116))) - (~((i112 & 115) << 1))) - 1;
                a = i117 % 128;
                int i118 = i117 % 2;
                int i119 = 0;
                int i120 = 0;
                float f4 = 0.0f;
                while (i119 < iMin) {
                    int i121 = iMin;
                    int i122 = (-2) - ((b + 38) ^ (-1));
                    ValueAnimator valueAnimator5 = valueAnimator4;
                    a = i122 % 128;
                    if (i122 % 2 == 0) {
                        f2 = (Float) arrayList.get(i120);
                        int i123 = 65 / 0;
                    } else {
                        f2 = (Float) arrayList.get(i120);
                    }
                    pathMeasure2.getPosTan(f4 - f2.floatValue(), fArr3, null);
                    int i124 = b;
                    int i125 = i124 ^ 119;
                    int i126 = ((((i124 & 119) | i125) << 1) - (~(-i125))) - 1;
                    int i127 = i126 % 128;
                    a = i127;
                    int i128 = i126 % 2;
                    fArr[i119] = fArr3[0];
                    int i129 = i127 & 13;
                    int i130 = (i127 ^ 13) | i129;
                    int i131 = (i129 & i130) + (i129 | i130);
                    int i132 = i131 % 128;
                    b = i132;
                    if (i131 % 2 != 0) {
                        fArr2[i119] = fArr3[1];
                        f4 *= f3;
                    } else {
                        fArr2[i119] = fArr3[1];
                        f4 += f3;
                    }
                    float[] fArr4 = fArr3;
                    int i133 = i132 & 95;
                    int i134 = ((((i132 ^ 95) | i133) << 1) - (~(-((~i133) & (i132 | 95))))) - 1;
                    a = i134 % 128;
                    if (i134 % 2 == 0) {
                        i5 = i120 << 1;
                        if (i5 < arrayList.size()) {
                            if (f4 > ((Float) arrayList.get(i5)).floatValue()) {
                                int i135 = a;
                                int i136 = i135 & 75;
                                int i137 = -(-((i135 ^ 75) | i136));
                                int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                b = i138 % 128;
                                int i139 = i138 % 2;
                                pathMeasure2.nextContour();
                                int i140 = b;
                                int i141 = (i140 | 47) << 1;
                                int i142 = -((i140 & (-48)) | (47 & (~i140)));
                                int i143 = (i141 ^ i142) + ((i142 & i141) << 1);
                                a = i143 % 128;
                                int i144 = i143 % 2;
                                i120 = i5;
                            }
                        }
                    } else {
                        i5 = (((i120 | 2) << 1) - (i120 ^ 2)) - 1;
                        if (i5 < arrayList.size()) {
                            if (f4 > ((Float) arrayList.get(i5)).floatValue()) {
                                int i1310 = a;
                                int i1311 = i1310 & 75;
                                int i1312 = -(-((i1310 ^ 75) | i1311));
                                int i1313 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                                b = i1313 % 128;
                                int i1314 = i1313 % 2;
                                pathMeasure2.nextContour();
                                int i145 = b;
                                int i146 = (i145 | 47) << 1;
                                int i147 = -((i145 & (-48)) | (47 & (~i145)));
                                int i148 = (i146 ^ i147) + ((i147 & i146) << 1);
                                a = i148 % 128;
                                int i149 = i148 % 2;
                                i120 = i5;
                            }
                        }
                    }
                    int i150 = ((i119 ^ 62) - (~(-(-((i119 & 62) << 1))))) - 1;
                    i119 = (((i150 | (-60)) << 1) - (i150 ^ (-60))) - 1;
                    iMin = i121;
                    valueAnimator4 = valueAnimator5;
                    fArr3 = fArr4;
                }
                valueAnimator2 = valueAnimator4;
                if (strC3 != null) {
                    int i151 = a;
                    int i152 = i151 ^ 15;
                    int i153 = (i151 & 15) << 1;
                    int i154 = (i152 ^ i153) + ((i153 & i152) << 1);
                    b = i154 % 128;
                    if (i154 % 2 != 0) {
                        PropertyValuesHolder.ofFloat(strC3, fArr);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(strC3, fArr);
                } else {
                    propertyValuesHolderOfFloat = null;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strC != null ? PropertyValuesHolder.ofFloat(strC, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    int i155 = a;
                    int i156 = (i155 & (-40)) | ((~i155) & 39);
                    int i157 = (i155 & 39) << 1;
                    int i158 = ((i156 | i157) << 1) - (i156 ^ i157);
                    b = i158 % 128;
                    if (i158 % 2 != 0) {
                        propertyValuesHolderArr = new PropertyValuesHolder[0];
                        propertyValuesHolderArr[0] = propertyValuesHolderOfFloat2;
                    } else {
                        propertyValuesHolderArr = new PropertyValuesHolder[]{propertyValuesHolderOfFloat2};
                    }
                    int i159 = i155 & 97;
                    int i160 = i159 + ((i155 ^ 97) | i159);
                    b = i160 % 128;
                    if (i160 % 2 != 0) {
                        objectAnimator.setValues(propertyValuesHolderArr);
                        int i161 = 99 / 0;
                    } else {
                        objectAnimator.setValues(propertyValuesHolderArr);
                    }
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator.setValues(propertyValuesHolderOfFloat);
                } else {
                    PropertyValuesHolder[] propertyValuesHolderArr2 = {propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2};
                    int i162 = b;
                    int i163 = i162 ^ 91;
                    int i164 = (((i162 & 91) | i163) << 1) - i163;
                    a = i164 % 128;
                    int i165 = i164 % 2;
                    objectAnimator.setValues(propertyValuesHolderArr2);
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayE;
                String strC4 = Q.c(typedArrayE2, xmlPullParser, "propertyName", 0);
                int i166 = b;
                int i167 = i166 ^ 47;
                int i168 = ((i166 & 47) | i167) << 1;
                int i169 = -i167;
                int i170 = (i168 & i169) + (i168 | i169);
                a = i170 % 128;
                int i171 = i170 % 2;
                objectAnimator.setPropertyName(strC4);
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = typedArrayE;
        }
        if (Q.d(xmlPullParser, "interpolator")) {
            int i172 = b;
            int i173 = i172 ^ 75;
            int i174 = ((i172 & 75) | i173) << 1;
            int i175 = -i173;
            int i176 = ((i174 | i175) << 1) - (i174 ^ i175);
            a = i176 % 128;
            int i177 = i176 % 2;
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(0, 0);
        } else {
            typedArray2 = typedArray;
            resourceId = 0;
        }
        if (resourceId > 0) {
            int i178 = b;
            int i179 = (i178 & 111) + (i178 | 111);
            a = i179 % 128;
            int i180 = i179 % 2;
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (typedArrayE2 != null) {
            int i181 = b;
            int i182 = ((i181 ^ 42) + ((i181 & 42) << 1)) - 1;
            a = i182 % 128;
            if (i182 % 2 == 0) {
                typedArrayE2.recycle();
                throw null;
            }
            typedArrayE2.recycle();
            int i183 = a;
            int i184 = (((i183 | 28) << 1) - (i183 ^ 28)) - 1;
            b = i184 % 128;
            int i185 = i184 % 2;
        }
        return valueAnimator3;
    }
}
