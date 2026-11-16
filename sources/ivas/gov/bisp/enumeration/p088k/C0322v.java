package ivas.gov.bisp.enumeration.p088k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import ivas.gov.bisp.enumeration.p002ab.C0084m;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p089l.InterfaceC0325p;
import ivas.gov.bisp.enumeration.p091n.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0322v {
    private static int a = 1;
    private static int b;
    public final V c;
    public final TextView d;
    public ae e;
    public ae f;
    public ae g;
    public ae h;
    public ae i;
    public ae j;
    public ae k;
    public int l = 0;
    public int m = -1;
    public Typeface n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f103o;

    public C0322v(TextView textView) {
        this.d = textView;
        this.c = new V(textView);
    }

    public final void e(Drawable drawable, ae aeVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 39) + (i2 | 39);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (drawable != null) {
            int i5 = (i2 & (-114)) | ((~i2) & 113);
            int i6 = (i2 & 113) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            int i8 = i7 % 128;
            b = i8;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (aeVar != null) {
                int i9 = (i8 ^ 86) + ((i8 & 86) << 1);
                int i10 = (i9 ^ (-1)) + (i9 << 1);
                a = i10 % 128;
                if (i10 % 2 == 0) {
                    P.e(drawable, aeVar, this.d.getDrawableState());
                    int i11 = 72 / 0;
                } else {
                    P.e(drawable, aeVar, this.d.getDrawableState());
                }
                int i12 = b;
                int i13 = i12 & 93;
                int i14 = ((i12 | 93) & (~i13)) + (i13 << 1);
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        int i16 = a;
        int i17 = ((i16 & 11) - (~(-(-(i16 | 11))))) - 1;
        b = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    public boolean g() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 10) + (i2 | 10)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        V v = this.c;
        if (!v.e()) {
            int i5 = b;
            int i6 = i5 ^ 13;
            int i7 = (i5 & 13) << 1;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        } else {
            int i10 = a;
            int i11 = i10 & 123;
            int i12 = ((i10 | 123) & (~i11)) + (i11 << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            if (v.g != 0) {
                int i14 = b + 25;
                int i15 = i14 % 128;
                a = i15;
                int i16 = i14 % 2;
                int i17 = i15 + 95;
                b = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 5 % 4;
                }
                z = true;
            } else {
                int i19 = b;
                int i20 = i19 ^ 13;
                int i21 = (i19 & 13) << 1;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                a = i22 % 128;
                int i23 = i22 % 2;
                z = false;
            }
        }
        int i24 = a;
        int i25 = i24 & 63;
        int i26 = (i24 ^ 63) | i25;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        b = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 54 / 0;
        }
        return z;
    }

    public static ae c(Context context, P p, int i) {
        int i2 = 2 % 2;
        int i3 = a + 5;
        b = i3 % 128;
        int i4 = i3 % 2;
        ColorStateList colorStateListH = p.h(context, i);
        if (colorStateListH == null) {
            int i5 = b;
            int i6 = i5 & 91;
            int i7 = -(-((i5 ^ 91) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        ae aeVar = new ae();
        aeVar.d = true;
        int i10 = b;
        int i11 = ((i10 | 93) << 1) - (i10 ^ 93);
        a = i11 % 128;
        int i12 = i11 % 2;
        aeVar.a = colorStateListH;
        int i13 = a;
        int i14 = (i13 & (-44)) | ((~i13) & 43);
        int i15 = (i13 & 43) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 58 / 0;
        }
        return aeVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0109  */
    /* JADX WARN: Code duplicated, block: B:30:0x0133  */
    /* JADX WARN: Code duplicated, block: B:32:0x0136  */
    /* JADX WARN: Code duplicated, block: B:35:0x014a  */
    /* JADX WARN: Code duplicated, block: B:37:0x015c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0160  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v5 ivas.gov.bisp.enumeration.k.V) = (r1v4 ivas.gov.bisp.enumeration.k.V), (r1v11 ivas.gov.bisp.enumeration.k.V) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public void d(int[] iArr, int i) {
        V v;
        int length;
        int i2;
        int i3;
        int i4;
        int[] iArrCopyOf;
        DisplayMetrics displayMetrics;
        float fApplyDimension;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = a + 19;
        b = i8 % 128;
        int i9 = 0;
        Object obj = null;
        if (i8 % 2 != 0) {
            v = this.c;
            int i10 = 97 / 0;
            if (v.e()) {
                length = iArr.length;
                if (length > 0) {
                    i3 = a + 17;
                    i4 = i3 % 128;
                    b = i4;
                    if (i3 % 2 == 0) {
                        int[] iArr2 = new int[length];
                        throw null;
                    }
                    iArrCopyOf = new int[length];
                    if (i == 0) {
                        int i11 = i4 & 93;
                        int i12 = ((i4 ^ 93) | i11) << 1;
                        int i13 = -((~i11) & (i4 | 93));
                        int i14 = (i12 & i13) + (i12 | i13);
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        iArrCopyOf = Arrays.copyOf(iArr, length);
                        int i16 = b + 51;
                        a = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        displayMetrics = v.f101o.getResources().getDisplayMetrics();
                        int i18 = b + 14;
                        int i19 = (i18 ^ (-1)) + (i18 << 1);
                        a = i19 % 128;
                        int i20 = i19 % 2;
                        while (i9 < length) {
                            int i21 = a;
                            int i22 = (i21 | 3) << 1;
                            int i23 = -(((~i21) & 3) | (i21 & (-4)));
                            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                            b = i24 % 128;
                            int i25 = i24 % 2;
                            fApplyDimension = TypedValue.applyDimension(i, iArr[i9], displayMetrics);
                            int i26 = b;
                            int i27 = i26 & 87;
                            int i28 = ((i26 ^ 87) | i27) << 1;
                            int i29 = -((i26 | 87) & (~i27));
                            i5 = (i28 ^ i29) + ((i29 & i28) << 1);
                            a = i5 % 128;
                            if (i5 % 2 == 0) {
                                iArrCopyOf[i9] = Math.round(fApplyDimension);
                                int i30 = i9 & 188;
                                int i31 = (i9 | 188) & (~i30);
                                int i32 = -(-(i30 << 1));
                                i9 = ((i31 ^ i32) + ((i31 & i32) << 1)) - 77;
                            } else {
                                iArrCopyOf[i9] = Math.round(fApplyDimension);
                                int i33 = i9 & 97;
                                int i34 = -(-((i9 ^ 97) | i33));
                                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                                int i36 = i35 & (-96);
                                i9 = i36 + ((i35 ^ (-96)) | i36);
                            }
                            int i37 = a;
                            int i38 = (i37 | 115) << 1;
                            int i39 = -(i37 ^ 115);
                            i6 = (i38 ^ i39) + ((i39 & i38) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i40 = 3 % 3;
                            }
                        }
                    }
                    v.k = v.g(iArrCopyOf);
                    if (!v.k()) {
                        int i41 = a;
                        int i42 = i41 & 33;
                        int i43 = (((i41 ^ 33) | i42) << 1) - ((i41 | 33) & (~i42));
                        b = i43 % 128;
                        int i44 = i43 % 2;
                        StringBuilder sbW = j.w("None of the preset sizes is valid: ");
                        sbW.append(Arrays.toString(iArr));
                        throw new IllegalArgumentException(sbW.toString());
                    }
                } else {
                    v.m = false;
                    int i45 = b;
                    int i46 = (i45 & 7) + (i45 | 7);
                    a = i46 % 128;
                    int i47 = i46 % 2;
                }
                if (v.j()) {
                    int i48 = b;
                    int i49 = i48 & 111;
                    i2 = (i49 - (~((i48 ^ 111) | i49))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        v.f();
                        obj.hashCode();
                        throw null;
                    }
                    v.f();
                }
            }
        } else {
            v = this.c;
            if (v.e()) {
                length = iArr.length;
                if (length > 0) {
                    i3 = a + 17;
                    i4 = i3 % 128;
                    b = i4;
                    if (i3 % 2 == 0) {
                        int[] iArr3 = new int[length];
                        throw null;
                    }
                    iArrCopyOf = new int[length];
                    if (i == 0) {
                        int i110 = i4 & 93;
                        int i111 = ((i4 ^ 93) | i110) << 1;
                        int i112 = -((~i110) & (i4 | 93));
                        int i113 = (i111 & i112) + (i111 | i112);
                        a = i113 % 128;
                        int i114 = i113 % 2;
                        iArrCopyOf = Arrays.copyOf(iArr, length);
                        int i115 = b + 51;
                        a = i115 % 128;
                        int i116 = i115 % 2;
                    } else {
                        displayMetrics = v.f101o.getResources().getDisplayMetrics();
                        int i117 = b + 14;
                        int i118 = (i117 ^ (-1)) + (i117 << 1);
                        a = i118 % 128;
                        int i210 = i118 % 2;
                        while (i9 < length) {
                            int i211 = a;
                            int i212 = (i211 | 3) << 1;
                            int i213 = -(((~i211) & 3) | (i211 & (-4)));
                            int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                            b = i214 % 128;
                            int i215 = i214 % 2;
                            fApplyDimension = TypedValue.applyDimension(i, iArr[i9], displayMetrics);
                            int i216 = b;
                            int i217 = i216 & 87;
                            int i218 = ((i216 ^ 87) | i217) << 1;
                            int i219 = -((i216 | 87) & (~i217));
                            i5 = (i218 ^ i219) + ((i219 & i218) << 1);
                            a = i5 % 128;
                            if (i5 % 2 == 0) {
                                iArrCopyOf[i9] = Math.round(fApplyDimension);
                                int i310 = i9 & 188;
                                int i311 = (i9 | 188) & (~i310);
                                int i312 = -(-(i310 << 1));
                                i9 = ((i311 ^ i312) + ((i311 & i312) << 1)) - 77;
                            } else {
                                iArrCopyOf[i9] = Math.round(fApplyDimension);
                                int i313 = i9 & 97;
                                int i314 = -(-((i9 ^ 97) | i313));
                                int i315 = ((i313 | i314) << 1) - (i314 ^ i313);
                                int i316 = i315 & (-96);
                                i9 = i316 + ((i315 ^ (-96)) | i316);
                            }
                            int i317 = a;
                            int i318 = (i317 | 115) << 1;
                            int i319 = -(i317 ^ 115);
                            i6 = (i318 ^ i319) + ((i319 & i318) << 1);
                            b = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i410 = 3 % 3;
                            }
                        }
                    }
                    v.k = v.g(iArrCopyOf);
                    if (!v.k()) {
                        int i411 = a;
                        int i412 = i411 & 33;
                        int i413 = (((i411 ^ 33) | i412) << 1) - ((i411 | 33) & (~i412));
                        b = i413 % 128;
                        int i414 = i413 % 2;
                        StringBuilder sbW2 = j.w("None of the preset sizes is valid: ");
                        sbW2.append(Arrays.toString(iArr));
                        throw new IllegalArgumentException(sbW2.toString());
                    }
                } else {
                    v.m = false;
                    int i415 = b;
                    int i416 = (i415 & 7) + (i415 | 7);
                    a = i416 % 128;
                    int i417 = i416 % 2;
                }
                if (v.j()) {
                    int i418 = b;
                    int i419 = i418 & 111;
                    i2 = (i419 - (~((i418 ^ 111) | i419))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        v.f();
                        obj.hashCode();
                        throw null;
                    }
                    v.f();
                }
            }
        }
        int i50 = a;
        int i51 = i50 ^ 63;
        int i52 = ((((i50 & 63) | i51) << 1) - (~(-i51))) - 1;
        b = i52 % 128;
        if (i52 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.k.v$aTc */
    public class aTc extends C0084m.aTa {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ WeakReference e;

        public aTc(int i, int i2, WeakReference weakReference) {
            this.c = i;
            this.d = i2;
            this.e = weakReference;
        }

        @Override // ivas.gov.bisp.enumeration.p002ab.C0084m.aTa
        public void f(int i) {
            int i2 = 2 % 2;
            int i3 = a + 45;
            b = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p002ab.C0084m.aTa
        public void g(Typeface typeface) {
            boolean z;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (Build.VERSION.SDK_INT >= 28) {
                int i5 = a;
                int i6 = i5 & 73;
                int i7 = (i5 | 73) & (~i6);
                int i8 = i6 << 1;
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                int i12 = this.c;
                if (i12 != -1) {
                    int i13 = i10 & 79;
                    int i14 = ((~i13) & (i10 | 79)) + (i13 << 1);
                    int i15 = i14 % 128;
                    a = i15;
                    int i16 = i14 % 2;
                    if ((this.d & 2) != 0) {
                        int i17 = i10 ^ 97;
                        int i18 = ((i10 & 97) | i17) << 1;
                        int i19 = -i17;
                        int i20 = (i18 & i19) + (i19 | i18);
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = (i10 & 35) + (i10 | 35);
                        a = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i23 = 2 / 3;
                        }
                        z = true;
                    } else {
                        int i24 = i15 & 35;
                        int i25 = i24 + ((i15 ^ 35) | i24);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        z = false;
                    }
                    typeface = Typeface.create(typeface, i12, z);
                    int i27 = a + 111;
                    b = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
            C0322v c0322v = C0322v.this;
            WeakReference weakReference = this.e;
            if (!(!c0322v.f103o)) {
                int i29 = a;
                int i30 = i29 & 89;
                int i31 = (i29 ^ 89) | i30;
                int i32 = (i30 & i31) + (i31 | i30);
                b = i32 % 128;
                Object obj = null;
                if (i32 % 2 == 0) {
                    c0322v.n = typeface;
                    obj.hashCode();
                    throw null;
                }
                c0322v.n = typeface;
                TextView textView = (TextView) weakReference.get();
                int i33 = a;
                int i34 = i33 & 45;
                int i35 = (~i34) & (i33 | 45);
                int i36 = i34 << 1;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                b = i37 % 128;
                int i38 = i37 % 2;
                if (textView != null) {
                    int i39 = (i33 ^ 39) + ((i33 & 39) << 1);
                    b = i39 % 128;
                    if (i39 % 2 == 0) {
                        WeakHashMap<View, R> weakHashMap = T.c;
                        T.aXa.c(textView);
                        throw null;
                    }
                    WeakHashMap<View, R> weakHashMap2 = T.c;
                    if (T.aXa.c(textView)) {
                        A a2 = new A(c0322v, textView, typeface, c0322v.l);
                        int i40 = a + 105;
                        b = i40 % 128;
                        int i41 = i40 % 2;
                        textView.post(a2);
                        int i42 = b;
                        int i43 = i42 & 115;
                        int i44 = (i43 - (~((i42 ^ 115) | i43))) - 1;
                        a = i44 % 128;
                        int i45 = i44 % 2;
                        return;
                    }
                    textView.setTypeface(typeface, c0322v.l);
                    int i46 = b;
                    int i47 = (i46 & (-72)) | ((~i46) & 71);
                    int i48 = (i46 & 71) << 1;
                    int i49 = (i47 & i48) + (i48 | i47);
                    a = i49 % 128;
                    int i50 = i49 % 2;
                }
            }
            int i51 = a + 73;
            b = i51 % 128;
            int i52 = i51 % 2;
        }
    }

    public void k(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & 103) + (i6 | 103);
        a = i7 % 128;
        int i8 = i7 % 2;
        V v = this.c;
        if (v.e()) {
            int i9 = a;
            int i10 = i9 & 69;
            int i11 = i9 | 69;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                v.f101o.getResources().getDisplayMetrics();
                throw null;
            }
            DisplayMetrics displayMetrics = v.f101o.getResources().getDisplayMetrics();
            int i13 = a;
            int i14 = (i13 ^ 21) + ((i13 & 21) << 1);
            b = i14 % 128;
            int i15 = i14 % 2;
            float fApplyDimension = TypedValue.applyDimension(i4, i, displayMetrics);
            int i16 = b;
            int i17 = i16 ^ 121;
            int i18 = (((i16 & 121) | i17) << 1) - i17;
            a = i18 % 128;
            if (i18 % 2 == 0) {
                TypedValue.applyDimension(i4, i2, displayMetrics);
                throw null;
            }
            float fApplyDimension2 = TypedValue.applyDimension(i4, i2, displayMetrics);
            int i19 = a;
            int i20 = ((i19 | 67) << 1) - (i19 ^ 67);
            b = i20 % 128;
            int i21 = i20 % 2;
            float fApplyDimension3 = TypedValue.applyDimension(i4, i3, displayMetrics);
            int i22 = b + 119;
            a = i22 % 128;
            if (i22 % 2 == 0) {
                v.l(fApplyDimension, fApplyDimension2, fApplyDimension3);
                int i23 = 88 / 0;
            } else {
                v.l(fApplyDimension, fApplyDimension2, fApplyDimension3);
            }
            if (v.j()) {
                int i24 = b + 39;
                a = i24 % 128;
                int i25 = i24 % 2;
                v.f();
                int i26 = b;
                int i27 = (i26 & 73) + (i26 | 73);
                a = i27 % 128;
                int i28 = i27 % 2;
            }
        }
        int i29 = b;
        int i30 = ((i29 | 39) << 1) - (i29 ^ 39);
        a = i30 % 128;
        int i31 = i30 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    public void f() {
        Drawable[] compoundDrawables;
        Drawable drawable;
        int i;
        Drawable drawable2;
        int i2;
        Drawable[] compoundDrawablesRelative;
        Drawable drawable3;
        int i3;
        Drawable drawable4;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = i5 & 1;
        int i7 = (i5 ^ 1) | i6;
        int i8 = (i6 & i7) + (i6 | i7);
        a = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.e == null && this.f == null) {
            int i9 = (i5 ^ 87) + ((i5 & 87) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.g != null || this.i != null) {
                compoundDrawables = this.d.getCompoundDrawables();
                drawable = compoundDrawables[0];
                int i10 = b;
                int i11 = i10 & 55;
                i = i11 + ((i10 ^ 55) | i11);
                a = i % 128;
                if (i % 2 == 0) {
                    e(drawable, this.e);
                    drawable2 = compoundDrawables[1];
                } else {
                    e(drawable, this.e);
                    drawable2 = compoundDrawables[1];
                }
                e(drawable2, this.f);
                e(compoundDrawables[2], this.g);
                int i12 = b;
                int i13 = i12 & 39;
                int i14 = ((i12 ^ 39) | i13) << 1;
                int i15 = -((i12 | 39) & (~i13));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                a = i16 % 128;
                int i17 = i16 % 2;
                e(compoundDrawables[3], this.i);
                int i18 = a;
                i2 = (((i18 & (-54)) | ((~i18) & 53)) - (~(-(-((i18 & 53) << 1))))) - 1;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i19 = 2 / 4;
                }
            }
        } else {
            compoundDrawables = this.d.getCompoundDrawables();
            drawable = compoundDrawables[0];
            int i110 = b;
            int i111 = i110 & 55;
            i = i111 + ((i110 ^ 55) | i111);
            a = i % 128;
            if (i % 2 == 0) {
                e(drawable, this.e);
                drawable2 = compoundDrawables[1];
            } else {
                e(drawable, this.e);
                drawable2 = compoundDrawables[1];
            }
            e(drawable2, this.f);
            e(compoundDrawables[2], this.g);
            int i112 = b;
            int i113 = i112 & 39;
            int i114 = ((i112 ^ 39) | i113) << 1;
            int i115 = -((i112 | 39) & (~i113));
            int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
            a = i116 % 128;
            int i117 = i116 % 2;
            e(compoundDrawables[3], this.i);
            int i118 = a;
            i2 = (((i118 & (-54)) | ((~i118) & 53)) - (~(-(-((i118 & 53) << 1))))) - 1;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i119 = 2 / 4;
            }
        }
        if (this.h == null) {
            int i20 = b;
            int i21 = i20 ^ 69;
            int i22 = ((i20 & 69) | i21) << 1;
            int i23 = -i21;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            a = i24 % 128;
            int i25 = i24 % 2;
            if (this.j != null) {
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                drawable3 = compoundDrawablesRelative[0];
                int i26 = a;
                int i27 = i26 & 21;
                int i28 = -(-((i26 ^ 21) | i27));
                i3 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    e(drawable3, this.h);
                    drawable4 = compoundDrawablesRelative[2];
                } else {
                    e(drawable3, this.h);
                    drawable4 = compoundDrawablesRelative[2];
                }
                e(drawable4, this.j);
                int i29 = (-2) - ((a + 52) ^ (-1));
                b = i29 % 128;
                int i30 = i29 % 2;
            }
        } else {
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            drawable3 = compoundDrawablesRelative[0];
            int i210 = a;
            int i211 = i210 & 21;
            int i212 = -(-((i210 ^ 21) | i211));
            i3 = ((i211 | i212) << 1) - (i212 ^ i211);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                e(drawable3, this.h);
                drawable4 = compoundDrawablesRelative[2];
            } else {
                e(drawable3, this.h);
                drawable4 = compoundDrawablesRelative[2];
            }
            e(drawable4, this.j);
            int i213 = (-2) - ((a + 52) ^ (-1));
            b = i213 % 128;
            int i31 = i213 % 2;
        }
        int i32 = a;
        int i33 = i32 ^ 7;
        int i34 = ((i32 & 7) | i33) << 1;
        int i35 = -i33;
        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
        b = i36 % 128;
        if (i36 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0382, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0383, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r3 = ((r2 & 22) + (r2 | 22)) - 1;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0390, code lost:
    
        ivas.gov.bisp.enumeration.p012al.X.c(r22, null, 0, 0);
        r0 = (-2) - ((ivas.gov.bisp.enumeration.p088k.C0322v.b + 118) ^ (-1));
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r2 >= 30) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p088k.C0322v.b + 97;
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r2 % 128;
        r2 = r2 % 2;
        r22.setInitialSurroundingSubText(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        java.util.Objects.requireNonNull(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r2 < 30) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r3 = (r2 & (-46)) | ((~r2) & 45);
        r2 = (r2 & 45) << 1;
        r4 = ((r3 | r2) << 1) - (r2 ^ r3);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if ((r4 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r22.setInitialSurroundingSubText(r6, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r22.setInitialSurroundingSubText(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r0 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r3 = r0 & 107;
        r2 = ((r0 ^ 107) | r3) << 1;
        r0 = -((r0 | 107) & (~r3));
        r3 = (r2 ^ r0) + ((r0 & r2) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r2 = r22.initialSelStart;
        r3 = r22.initialSelEnd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r2 <= r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p088k.C0322v.a + 29;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r8 % 128;
        r8 = r8 % 2;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r8 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r9 = (r8 ^ 67) + ((r8 & 67) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r9 % 128;
        r9 = r9 % 2;
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r2 <= r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r10 = r3 & 35;
        r10 = r10 + ((r3 ^ 35) | r10);
        r3 = r10 % 128;
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if ((r10 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        r10 = r2 & 114;
        r2 = r10 + ((r2 ^ 114) | r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        r2 = (-2) - (((r2 ^ 1) + ((r2 & 1) << 1)) ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        r3 = (-2) - (((r3 & 124) + (r3 | 124)) ^ (-1));
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r3 % 128;
        r3 = r3 % 2;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r10 = r2 & 119;
        r2 = (r2 | 119) & (~r10);
        r10 = -(-(r10 << 1));
        r11 = (r2 ^ r10) + ((r2 & r10) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        r2 = r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (r8 < 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        r10 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r11 = (r10 & (-62)) | ((~r10) & 61);
        r10 = (r10 & 61) << 1;
        r12 = (r11 ^ r10) + ((r10 & r11) << 1);
        r10 = r12 % 128;
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r10;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        if (r3 > r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
    
        r11 = (r10 & 107) + (r10 | 107);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r11 % 128;
        r11 = r11 % 2;
        r10 = r22.inputType & 4095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        if (r10 == 129) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011a, code lost:
    
        r11 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r12 = ((r11 & 86) + (r11 | 86)) - 1;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        if ((r12 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        if (r10 == 6070) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0130, code lost:
    
        if (r10 == 225) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r10 == 18) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
    
        r10 = (((r11 | 88) << 1) - (r11 ^ 88)) - 1;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r10 % 128;
        r10 = r10 % 2;
        r13 = r11 & 13;
        r10 = (((r11 ^ 13) | r13) << 1) - ((~r13) & (r11 | 13));
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r10 % 128;
        r10 = r10 % 2;
        r10 = ((r11 | 117) << 1) - (r11 ^ 117);
        r13 = r10 % 128;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r13;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015f, code lost:
    
        if (r2 > 2048) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0161, code lost:
    
        r4 = r11 & 65;
        r2 = (((r11 ^ 65) | r4) << 1) - ((~r4) & (r11 | 65));
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
    
        if ((r2 % 2) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        ivas.gov.bisp.enumeration.p012al.X.c(r22, r6, r8, r3);
        r0 = 85 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017a, code lost:
    
        ivas.gov.bisp.enumeration.p012al.X.c(r22, r6, r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017e, code lost:
    
        r2 = (r3 - (~(-r8))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0185, code lost:
    
        if (r2 <= 1024) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0187, code lost:
    
        r13 = r11 & 69;
        r14 = (r11 ^ 69) | r13;
        r15 = (r13 ^ r14) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r15 % 128;
        r15 = r15 % 2;
        r13 = r11 ^ 75;
        r11 = (r11 & 75) << 1;
        r14 = (r13 & r11) + (r11 | r13);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r14 % 128;
        r14 = r14 % 2;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a6, code lost:
    
        r13 = r13 + 25;
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r13 % 128;
        r13 = r13 % 2;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ae, code lost:
    
        r13 = r6.length();
        r14 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r15 = (r14 ^ 41) + ((r14 & 41) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r15 % 128;
        r15 = r15 % 2;
        r4 = -r11;
        r15 = 2048 & r4;
        r15 = r15 + ((2048 ^ r4) | r15);
        r9 = (int) (((double) r15) * 0.8d);
        r14 = r14 + 59;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d7, code lost:
    
        if ((r14 % 2) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d9, code lost:
    
        r9 = java.lang.Math.min(r8, r9);
        r10 = r13 << r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e0, code lost:
    
        r9 = java.lang.Math.min(r8, r9);
        r10 = -(~(-r3));
        r10 = (-2) - (((r13 & r10) + (r10 | r13)) ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ef, code lost:
    
        r9 = -r9;
        r13 = r15 & r9;
        r9 = (r9 | r15) & (~r13);
        r13 = r13 << 1;
        r9 = java.lang.Math.min(r10, (r9 ^ r13) + ((r9 & r13) << 1));
        r10 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r13 = (r10 & 109) + (r10 | 109);
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020b, code lost:
    
        if ((r13 % 2) != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020d, code lost:
    
        r10 = java.lang.Math.min(r8, r15 >> r9);
        r8 = r8 % r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0215, code lost:
    
        r10 = -r9;
        r10 = java.lang.Math.min(r8, (r15 ^ r10) + ((r10 & r15) << 1));
        r13 = -r10;
        r14 = ((~r13) & r8) | ((~r8) & r13);
        r8 = (r8 & r13) << 1;
        r8 = (r8 | r14) + (r14 & r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022b, code lost:
    
        r13 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r14 = (((r13 | 105) << 1) - (~(-(r13 ^ 105)))) - 1;
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023b, code lost:
    
        if ((r14 % 2) != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0241, code lost:
    
        if (ivas.gov.bisp.enumeration.p012al.X.b(r6, r8, 0) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0249, code lost:
    
        if ((!ivas.gov.bisp.enumeration.p012al.X.b(r6, r8, 0)) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024c, code lost:
    
        r13 = r8 & 1;
        r8 = ((r8 ^ 1) | r13) + r13;
        r10 = r10 - 1;
        r13 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r14 = r13 & 69;
        r13 = -(-((r13 ^ 69) | r14));
        r15 = (r14 ^ r13) + ((r13 & r14) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r15 % 128;
        r15 = r15 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0267, code lost:
    
        r13 = -(-r9);
        r14 = ((r3 ^ r13) + ((r13 & r3) << 1)) - 1;
        r13 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r12 = (((~r13) & 69) | (r13 & (-70))) + ((r13 & 69) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0281, code lost:
    
        if ((r12 % 2) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0287, code lost:
    
        if (ivas.gov.bisp.enumeration.p012al.X.b(r6, r14, 0) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028e, code lost:
    
        if (ivas.gov.bisp.enumeration.p012al.X.b(r6, r14, 1) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0290, code lost:
    
        r12 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r13 = (r12 & 123) + (r12 | 123);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029c, code lost:
    
        if ((r13 % 2) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029e, code lost:
    
        r9 = r9 >>> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a1, code lost:
    
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a3, code lost:
    
        if (r11 == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a5, code lost:
    
        r2 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r4 = (r2 & 62) + (r2 | 62);
        r2 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r2 % 128;
        r2 = r2 % 2;
        r2 = (r8 - (~(-(~r10)))) - 1;
        r2 = r6.subSequence(r8, (r2 ^ (-1)) + (r2 << 1));
        r4 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r8 = ((r4 ^ 106) + ((r4 & 106) << 1)) - 1;
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d1, code lost:
    
        if ((r8 % 2) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d3, code lost:
    
        r3 = r6.subSequence(r3, r9 << r3);
        r4 = new java.lang.CharSequence[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02dd, code lost:
    
        r4 = -(~(-(-r3)));
        r3 = r6.subSequence(r3, ((r9 & r4) + (r4 | r9)) - 1);
        r4 = new java.lang.CharSequence[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ec, code lost:
    
        r4[0] = r2;
        r4[1] = r3;
        r2 = android.text.TextUtils.concat(r4);
        r3 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r4 = (r3 & (-56)) | ((~r3) & 55);
        r3 = -(-((r3 & 55) << 1));
        r6 = (r4 ^ r3) + ((r3 & r4) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x030c, code lost:
    
        r2 = -r4;
        r3 = (r10 ^ r2) + ((r2 & r10) << 1);
        r2 = r6.subSequence(r8, ((((((r3 ^ r9) | (r3 & r9)) << 1) - (~(-(((~r3) & r9) | ((~r9) & r3))))) - 1) - (~(-(-r8)))) - 1);
        r3 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r4 = r3 & 83;
        r4 = (r4 - (~((r3 ^ 83) | r4))) - 1;
        r3 = r4 % 128;
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r3;
        r4 = r4 % 2;
        r4 = ((r3 | 18) << 1) - (r3 ^ 18);
        r3 = (r4 ^ (-1)) + (r4 << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0349, code lost:
    
        r3 = ivas.gov.bisp.enumeration.p088k.C0322v.b;
        r6 = r3 & 99;
        r4 = ((r3 ^ 99) | r6) << 1;
        r3 = -((r3 | 99) & (~r6));
        r6 = ((r4 | r3) << 1) - (r3 ^ r4);
        ivas.gov.bisp.enumeration.p088k.C0322v.a = r6 % 128;
        r6 = r6 % 2;
        ivas.gov.bisp.enumeration.p012al.X.c(r22, r2, r10, (r11 - (~r10)) - 1);
        r0 = ivas.gov.bisp.enumeration.p088k.C0322v.a;
        r2 = (r0 & (-120)) | ((~r0) & 119);
        r0 = (r0 & 119) << 1;
        r3 = (r2 ^ r0) + ((r0 & r2) << 1);
        ivas.gov.bisp.enumeration.p088k.C0322v.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x037b, code lost:
    
        if ((r3 % 2) != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x037d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x037e, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r2 >= 16) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(android.widget.TextView r20, android.view.inputmethod.InputConnection r21, android.view.inputmethod.EditorInfo r22) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p088k.C0322v.j(android.widget.TextView, android.view.inputmethod.InputConnection, android.view.inputmethod.EditorInfo):void");
    }

    public void l(int i) {
        float fApplyDimension;
        int i2;
        float fApplyDimension2;
        float f;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 17) | (i4 & 17)) << 1;
        int i6 = -(((~i4) & 17) | (i4 & (-18)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        V v = this.c;
        if (v.e()) {
            int i9 = a;
            int i10 = i9 & 15;
            int i11 = ((~i10) & (i9 | 15)) + (i10 << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (i != 0) {
                int i12 = (-2) - ((((i9 | 12) << 1) - (i9 ^ 12)) ^ (-1));
                b = i12 % 128;
                if (i12 % 2 == 0 ? i != 1 : i != 1) {
                    throw new IllegalArgumentException(j.o("Unknown auto-size text type: ", i));
                }
                DisplayMetrics displayMetrics = v.f101o.getResources().getDisplayMetrics();
                int i13 = a + 19;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    fApplyDimension = TypedValue.applyDimension(5, 12.0f, displayMetrics);
                    i2 = 4;
                } else {
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    i2 = 2;
                }
                int i14 = b;
                int i15 = (((i14 ^ 25) | (i14 & 25)) << 1) - (((~i14) & 25) | (i14 & (-26)));
                a = i15 % 128;
                if (i15 % 2 == 0) {
                    fApplyDimension2 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                    f = 2.0f;
                } else {
                    fApplyDimension2 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                    f = 1.0f;
                }
                v.l(fApplyDimension, fApplyDimension2, f);
                if (v.j()) {
                    int i16 = a;
                    int i17 = i16 & 79;
                    int i18 = (((i16 | 79) & (~i17)) - (~(i17 << 1))) - 1;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    v.f();
                    int i20 = b;
                    int i21 = ((i20 ^ 114) + ((i20 & 114) << 1)) - 1;
                    a = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 41 / 0;
                        return;
                    }
                    return;
                }
            } else {
                v.g = 0;
                v.j = -1.0f;
                int i23 = b;
                int i24 = i23 ^ 29;
                int i25 = (i23 & 29) << 1;
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                a = i26 % 128;
                int i27 = i26 % 2;
                v.l = -1.0f;
                v.i = -1.0f;
                int[] iArr = new int[0];
                int i28 = b;
                int i29 = i28 & 27;
                int i30 = -(-(i28 | 27));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    v.k = iArr;
                } else {
                    v.k = iArr;
                }
                v.h = false;
            }
        }
        int i32 = b;
        int i33 = i32 & 95;
        int i34 = (i32 ^ 95) | i33;
        int i35 = (i33 & i34) + (i34 | i33);
        a = i35 % 128;
        int i36 = i35 % 2;
    }

    public void m(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (i2 | 33) & (~i3);
        boolean z = true;
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        if (this.k == null) {
            this.k = new ae();
            int i8 = b;
            int i9 = i8 ^ 119;
            int i10 = (i8 & 119) << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        ae aeVar = this.k;
        aeVar.a = colorStateList;
        if (colorStateList != null) {
            int i13 = b;
            int i14 = (((i13 | 38) << 1) - (i13 ^ 38)) - 1;
            a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = (i13 & (-30)) | ((~i13) & 29);
            int i17 = (i13 & 29) << 1;
            int i18 = (i16 & i17) + (i17 | i16);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 5 % 4;
            }
        } else {
            int i20 = b + 98;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            z = false;
        }
        aeVar.d = z;
        this.e = aeVar;
        this.f = aeVar;
        int i23 = b;
        int i24 = (-2) - ((i23 + 86) ^ (-1));
        a = i24 % 128;
        if (i24 % 2 == 0) {
            this.g = aeVar;
            this.i = aeVar;
            this.h = aeVar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.g = aeVar;
        this.i = aeVar;
        this.h = aeVar;
        this.j = aeVar;
        int i25 = i23 + 23;
        a = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 60 / 0;
        }
    }

    public void n(PorterDuff.Mode mode) {
        boolean z;
        int i = 2 % 2;
        int i2 = b + 91;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.k == null) {
            this.k = new ae();
            int i3 = b;
            int i4 = (i3 ^ 101) + ((i3 & 101) << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
        }
        ae aeVar = this.k;
        aeVar.b = mode;
        if (mode != null) {
            int i6 = a;
            int i7 = i6 ^ 23;
            int i8 = (((i6 & 23) | i7) << 1) - i7;
            int i9 = i8 % 128;
            b = i9;
            int i10 = i8 % 2;
            int i11 = (i9 ^ 77) + ((i9 & 77) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            int i13 = b;
            int i14 = i13 & 99;
            int i15 = -(-(i13 | 99));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            a = i16 % 128;
            int i17 = i16 % 2;
            z = false;
        }
        aeVar.c = z;
        this.e = aeVar;
        this.f = aeVar;
        int i18 = a;
        int i19 = i18 & 99;
        int i20 = (~i19) & (i18 | 99);
        int i21 = -(-(i19 << 1));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        b = i22 % 128;
        if (i22 % 2 != 0) {
            this.g = aeVar;
            this.i = aeVar;
            this.h = aeVar;
            obj.hashCode();
            throw null;
        }
        this.g = aeVar;
        this.i = aeVar;
        this.h = aeVar;
        this.j = aeVar;
        int i23 = ((i18 | 42) << 1) - (i18 ^ 42);
        int i24 = (i23 ^ (-1)) + (i23 << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
    }

    public void h(Context context, int i) {
        String strQ;
        int i2 = 2 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, h.z);
        B b2 = new B(context, typedArrayObtainStyledAttributes);
        int i3 = (-2) - ((b + 74) ^ (-1));
        a = i3 % 128;
        int i4 = i3 % 2;
        if (b2.t(14)) {
            int i5 = b;
            int i6 = i5 & 43;
            int i7 = (i5 | 43) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            boolean zF = b2.f(14, false);
            TextView textView = this.d;
            int i11 = a;
            int i12 = ((((i11 ^ 65) | (i11 & 65)) << 1) - (~(-(((~i11) & 65) | (i11 & (-66)))))) - 1;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                textView.setAllCaps(zF);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            textView.setAllCaps(zF);
            int i13 = b + 120;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = Build.VERSION.SDK_INT;
        if (!(!b2.t(0))) {
            int i17 = (-2) - ((b + 30) ^ (-1));
            a = i17 % 128;
            int i18 = i17 % 2;
            if (b2.j(0, -1) == 0) {
                int i19 = a + 57;
                b = i19 % 128;
                int i20 = i19 % 2;
                this.d.setTextSize(0, 0.0f);
                int i21 = b;
                int i22 = (i21 ^ 111) + ((i21 & 111) << 1);
                a = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        o(context, b2);
        if (i16 >= 26) {
            int i24 = a;
            int i25 = ((i24 & 48) + (i24 | 48)) - 1;
            b = i25 % 128;
            if (i25 % 2 == 0 ? b2.t(13) : b2.t(32)) {
                int i26 = a;
                int i27 = i26 ^ 15;
                int i28 = (i26 & 15) << 1;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i29 % 128;
                if (i29 % 2 == 0 ? (strQ = b2.q(13)) != null : (strQ = b2.q(91)) != null) {
                    this.d.setFontVariationSettings(strQ);
                    int i30 = a + 39;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.n;
        if (typeface != null) {
            int i32 = a;
            int i33 = (i32 & 15) + (i32 | 15);
            b = i33 % 128;
            int i34 = i33 % 2;
            this.d.setTypeface(typeface, this.l);
            int i35 = a;
            int i36 = ((i35 | 110) << 1) - (i35 ^ 110);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = b + 29;
        a = i39 % 128;
        int i40 = i39 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x022b  */
    /* JADX WARN: Code duplicated, block: B:76:0x023e  */
    /* JADX WARN: Code duplicated, block: B:79:0x026b A[Catch: NotFoundException | UnsupportedOperationException -> 0x02be, NotFoundException | UnsupportedOperationException -> 0x02be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NotFoundException | UnsupportedOperationException -> 0x02be, blocks: (B:51:0x01ca, B:79:0x026b, B:79:0x026b, B:60:0x01f1, B:60:0x01f1, B:64:0x0205, B:64:0x0205, B:65:0x0209, B:65:0x0209, B:77:0x0251, B:77:0x0251, B:66:0x020e, B:66:0x020e, B:81:0x0278, B:81:0x0278, B:89:0x02a2, B:89:0x02a2, B:91:0x02b3, B:91:0x02b3, B:92:0x02b8, B:92:0x02b8, B:93:0x02bb, B:93:0x02bb), top: B:127:0x01c8 }] */
    public final void o(Context context, B b2) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = b + 126;
        boolean z3 = true;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        this.l = b2.n(2, this.l);
        int i5 = b;
        int i6 = i5 & 35;
        int i7 = (i5 | 35) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        int i11 = Build.VERSION.SDK_INT;
        Object obj = null;
        if (i11 >= 28) {
            int i12 = b + 73;
            a = i12 % 128;
            int i13 = i12 % 2;
            int iN = b2.n(11, -1);
            this.m = iN;
            int i14 = b;
            int i15 = (-2) - (((i14 ^ 32) + ((i14 & 32) << 1)) ^ (-1));
            a = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            if (iN != -1) {
                this.l &= 2;
                int i16 = ((i14 ^ 102) + ((i14 & 102) << 1)) - 1;
                a = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        int i18 = 10;
        if (!b2.t(10)) {
            int i19 = b;
            int i20 = i19 ^ 7;
            int i21 = (((i19 & 7) | i20) << 1) - i20;
            a = i21 % 128;
            if (i21 % 2 != 0 ? (!b2.t(12)) : !b2.t(117)) {
                if (!(!b2.t(1))) {
                    int i22 = b + 21;
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    this.f103o = false;
                    int iN2 = b2.n(1, 1);
                    int i24 = a;
                    int i25 = ((i24 ^ 103) | (i24 & 103)) << 1;
                    int i26 = -(((~i24) & 103) | (i24 & (-104)));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    int i28 = i27 % 128;
                    b = i28;
                    if (i27 % 2 == 0 ? iN2 == 1 : iN2 == 1) {
                        this.n = Typeface.SANS_SERIF;
                        int i29 = b;
                        int i30 = ((i29 & (-68)) | ((~i29) & 67)) + ((i29 & 67) << 1);
                        a = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        if (iN2 == 2) {
                            this.n = Typeface.SERIF;
                            int i32 = a;
                            int i33 = i32 & 85;
                            int i34 = -(-((i32 ^ 85) | i33));
                            int i35 = (i33 & i34) + (i34 | i33);
                            b = i35 % 128;
                            if (i35 % 2 != 0) {
                                int i36 = 28 / 0;
                                return;
                            }
                            return;
                        }
                        int i37 = (i28 | 27) << 1;
                        int i38 = -(i28 ^ 27);
                        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                        a = i39 % 128;
                        int i40 = i39 % 2;
                        if (iN2 == 3) {
                            int i41 = (((i28 | 16) << 1) - (i28 ^ 16)) - 1;
                            a = i41 % 128;
                            int i42 = i41 % 2;
                            this.n = Typeface.MONOSPACE;
                            int i43 = a;
                            int i44 = i43 & 5;
                            int i45 = ((i43 ^ 5) | i44) << 1;
                            int i46 = -((i43 | 5) & (~i44));
                            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                            b = i47 % 128;
                            int i48 = i47 % 2;
                            return;
                        }
                    }
                }
                int i49 = b;
                int i50 = ((i49 ^ 123) | (i49 & 123)) << 1;
                int i51 = -(((~i49) & 123) | (i49 & (-124)));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                a = i52 % 128;
                int i53 = i52 % 2;
                return;
            }
        }
        this.n = null;
        if (!(!b2.t(12))) {
            int i54 = b;
            int i55 = ((((i54 ^ 95) | (i54 & 95)) << 1) - (~(-(((~i54) & 95) | (i54 & (-96)))))) - 1;
            int i56 = i55 % 128;
            a = i56;
            int i57 = i55 % 2 == 0 ? 126 : 12;
            int i58 = i56 & 95;
            int i59 = ((i56 ^ 95) | i58) << 1;
            int i60 = -((i56 | 95) & (~i58));
            int i61 = (i59 & i60) + (i60 | i59);
            b = i61 % 128;
            int i62 = i61 % 2;
            i18 = i57;
        }
        int i63 = this.m;
        int i64 = this.l;
        int i65 = a;
        int i66 = (i65 ^ 83) + ((i65 & 83) << 1);
        b = i66 % 128;
        if (i66 % 2 != 0) {
            context.isRestricted();
            obj.hashCode();
            throw null;
        }
        if (!context.isRestricted()) {
            aTc atc = new aTc(i63, i64, new WeakReference(this.d));
            int i67 = (-2) - ((a + 56) ^ (-1));
            b = i67 % 128;
            try {
                if (i67 % 2 != 0) {
                    b2.e(i18, this.l, atc);
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Typeface typefaceE = b2.e(i18, this.l, atc);
                if (typefaceE != null) {
                    int i68 = a;
                    int i69 = ((11 & (~i68)) | (i68 & (-12))) + ((i68 & 11) << 1);
                    b = i69 % 128;
                    if (i69 % 2 == 0 ? i11 < 28 : i11 < 4) {
                        this.n = typefaceE;
                        int i70 = (i68 ^ 9) + ((i68 & 9) << 1);
                        b = i70 % 128;
                        int i71 = i70 % 2;
                    } else {
                        int i72 = i68 + 115;
                        b = i72 % 128;
                        int i73 = i72 % 2;
                        if (this.m != -1) {
                            int i74 = i68 | 43;
                            int i75 = (i74 << 1) - (i74 & (~(i68 & 43)));
                            b = i75 % 128;
                            Typeface typefaceCreate = i75 % 2 != 0 ? Typeface.create(typefaceE, 1) : Typeface.create(typefaceE, 0);
                            int i76 = this.m;
                            int i77 = this.l;
                            int i78 = a + 115;
                            int i79 = i78 % 128;
                            b = i79;
                            if (i78 % 2 != 0) {
                                int i80 = i77 & 5;
                                if ((((i77 ^ 5) | i80) & (~i80)) != 0) {
                                    int i81 = i79 & 73;
                                    int i82 = -(-((i79 ^ 73) | i81));
                                    int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                                    a = i83 % 128;
                                    int i84 = i83 % 2;
                                    z2 = true;
                                } else {
                                    int i85 = (i79 & (-8)) | ((~i79) & 7);
                                    int i86 = (i79 & 7) << 1;
                                    int i87 = (i85 ^ i86) + ((i85 & i86) << 1);
                                    a = i87 % 128;
                                    int i88 = i87 % 2;
                                    z2 = false;
                                }
                            } else if ((i77 & 2) != 0) {
                                int i89 = i79 & 73;
                                int i810 = -(-((i79 ^ 73) | i89));
                                int i811 = ((i89 | i810) << 1) - (i89 ^ i810);
                                a = i811 % 128;
                                int i812 = i811 % 2;
                                z2 = true;
                            } else {
                                int i813 = (i79 & (-8)) | ((~i79) & 7);
                                int i814 = (i79 & 7) << 1;
                                int i815 = (i813 ^ i814) + ((i813 & i814) << 1);
                                a = i815 % 128;
                                int i816 = i815 % 2;
                                z2 = false;
                            }
                            this.n = Typeface.create(typefaceCreate, i76, z2);
                            int i90 = a;
                            int i91 = i90 | 95;
                            int i92 = ((i91 << 1) - (~(-((~(i90 & 95)) & i91)))) - 1;
                            b = i92 % 128;
                            int i93 = i92 % 2;
                        } else {
                            this.n = typefaceE;
                            int i710 = (i68 ^ 9) + ((i68 & 9) << 1);
                            b = i710 % 128;
                            int i711 = i710 % 2;
                        }
                    }
                }
                if (this.n == null) {
                    int i94 = a;
                    int i95 = i94 & 51;
                    int i96 = -(-((i94 ^ 51) | i95));
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    b = i97 % 128;
                    if (i97 % 2 == 0) {
                        z = true;
                    }
                    this.f103o = z;
                    int i98 = b;
                    int i99 = ((i98 ^ 108) + ((i98 & 108) << 1)) - 1;
                    a = i99 % 128;
                    int i100 = i99 % 2;
                } else {
                    int i101 = b;
                    int i102 = ((i101 & 100) + (i101 | 100)) - 1;
                    a = i102 % 128;
                    int i103 = i102 % 2;
                }
                z = false;
                this.f103o = z;
                int i910 = b;
                int i911 = ((i910 ^ 108) + ((i910 & 108) << 1)) - 1;
                a = i911 % 128;
                int i104 = i911 % 2;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.n == null) {
            int i105 = b;
            int i106 = i105 & 19;
            int i107 = (i106 - (~((i105 ^ 19) | i106))) - 1;
            a = i107 % 128;
            if (i107 % 2 == 0) {
                b2.q(i18);
                throw null;
            }
            String strQ = b2.q(i18);
            if (strQ != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    int i108 = b;
                    int i109 = i108 & 71;
                    int i110 = i108 | 71;
                    int i111 = ((i109 | i110) << 1) - (i109 ^ i110);
                    a = i111 % 128;
                    if (i111 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.m != -1) {
                        int i112 = i108 + 101;
                        a = i112 % 128;
                        int i113 = i112 % 2;
                        Typeface typefaceCreate2 = Typeface.create(strQ, 0);
                        int i114 = this.m;
                        int i115 = b;
                        int i116 = i115 & 7;
                        int i117 = -(-((i115 ^ 7) | i116));
                        int i118 = (i116 & i117) + (i117 | i116);
                        int i119 = i118 % 128;
                        a = i119;
                        int i120 = i118 % 2;
                        if ((this.l & 2) != 0) {
                            int i121 = i119 & 109;
                            int i122 = (i119 ^ 109) | i121;
                            int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                            int i124 = i123 % 128;
                            b = i124;
                            int i125 = i123 % 2;
                            int i126 = i124 ^ 91;
                            int i127 = -(-((i124 & 91) << 1));
                            int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                            a = i128 % 128;
                            int i129 = i128 % 2;
                        } else {
                            z3 = false;
                        }
                        this.n = Typeface.create(typefaceCreate2, i114, z3);
                        int i130 = b;
                        int i131 = i130 & 123;
                        int i132 = i130 | 123;
                        int i133 = (i131 & i132) + (i132 | i131);
                        a = i133 % 128;
                        if (i133 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                this.n = Typeface.create(strQ, this.l);
                int i134 = b;
                int i135 = i134 ^ 123;
                int i136 = ((((i134 & 123) | i135) << 1) - (~(-i135))) - 1;
                a = i136 % 128;
                int i137 = i136 % 2;
            }
        }
        int i138 = a;
        int i139 = (i138 ^ 23) + ((i138 & 23) << 1);
        b = i139 % 128;
        int i140 = i139 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:216:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x0609  */
    /* JADX WARN: Code duplicated, block: B:235:0x060d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0614  */
    /* JADX WARN: Code duplicated, block: B:273:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public void i(AttributeSet attributeSet, int i) {
        boolean zF;
        boolean z;
        String strQ;
        String strQ2;
        int i2;
        Throwable th;
        int i3;
        float fApplyDimension;
        int i4;
        int resourceId;
        Drawable drawableG;
        Drawable drawableG2;
        Drawable drawableG3;
        char c;
        int i5;
        int i6;
        ColorStateList colorStateList;
        int resourceId2;
        Drawable[] compoundDrawablesRelative;
        Drawable drawable;
        int resourceId3;
        int i7;
        int i8 = 2 % 2;
        Context context = this.d.getContext();
        P pC = P.c();
        int[] iArr = h.k;
        int i9 = a + 3;
        b = i9 % 128;
        int i10 = i9 % 2;
        B bC = B.c(context, attributeSet, iArr, i, 0);
        TextView textView = this.d;
        T.p(textView, textView.getContext(), iArr, attributeSet, bC.d, i, 0);
        int i11 = a;
        int i12 = ((i11 | 63) << 1) - (i11 ^ 63);
        b = i12 % 128;
        int i13 = i12 % 2;
        int iR = bC.r(0, -1);
        if (!(!bC.t(3))) {
            int i14 = b;
            int i15 = (i14 | 43) << 1;
            int i16 = -(i14 ^ 43);
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            a = i17 % 128;
            int i18 = i17 % 2;
            int iR2 = bC.r(3, 0);
            int i19 = a;
            int i20 = ((i19 | 41) << 1) - (i19 ^ 41);
            b = i20 % 128;
            int i21 = i20 % 2;
            this.e = c(context, pC, iR2);
        }
        if (bC.t(1)) {
            this.f = c(context, pC, bC.r(1, 0));
        }
        if (bC.t(4)) {
            int i22 = b;
            int i23 = i22 & 51;
            int i24 = (i23 - (~((i22 ^ 51) | i23))) - 1;
            a = i24 % 128;
            int i25 = i24 % 2;
            this.g = c(context, pC, bC.r(4, 0));
        }
        if (bC.t(2)) {
            ae aeVarC = c(context, pC, bC.r(2, 0));
            int i26 = b;
            int i27 = ((i26 ^ 112) + ((i26 & 112) << 1)) - 1;
            a = i27 % 128;
            if (i27 % 2 == 0) {
                this.i = aeVarC;
                throw null;
            }
            this.i = aeVarC;
        }
        int i28 = Build.VERSION.SDK_INT;
        if (!(!bC.t(5))) {
            int i29 = b;
            int i30 = i29 ^ 73;
            int i31 = (i29 & 73) << 1;
            int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
            a = i32 % 128;
            int i33 = i32 % 2;
            this.h = c(context, pC, bC.r(5, 0));
        }
        if (bC.t(6)) {
            int i34 = b;
            int i35 = (i34 & 103) + (i34 | 103);
            a = i35 % 128;
            this.j = c(context, pC, i35 % 2 == 0 ? bC.r(93, 0) : bC.r(6, 0));
        }
        bC.d.recycle();
        boolean z2 = this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iR != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iR, h.z);
            B b2 = new B(context, typedArrayObtainStyledAttributes);
            int i36 = a;
            int i37 = (i36 ^ 23) + ((i36 & 23) << 1);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z2) {
                zF = false;
                z = false;
            } else {
                int i38 = i36 + 23;
                b = i38 % 128;
                int i39 = i38 % 2;
                if (b2.t(14)) {
                    zF = b2.f(14, false);
                    z = true;
                } else {
                    zF = false;
                    z = false;
                }
            }
            o(context, b2);
            if (!b2.t(15)) {
                i7 = 26;
                strQ2 = null;
            } else {
                strQ2 = b2.q(15);
                i7 = 26;
            }
            if (i28 < i7 || !b2.t(13)) {
                strQ = null;
            } else {
                int i40 = b;
                int i41 = ((i40 & 106) + (i40 | 106)) - 1;
                a = i41 % 128;
                int i42 = i41 % 2;
                strQ = b2.q(13);
            }
            typedArrayObtainStyledAttributes.recycle();
        } else {
            zF = false;
            z = false;
            strQ = null;
            strQ2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.z, i, 0);
        B b3 = new B(context, typedArrayObtainStyledAttributes2);
        int i43 = a;
        int i44 = i43 ^ 29;
        int i45 = ((i44 | (i43 & 29)) << 1) - i44;
        b = i45 % 128;
        int i46 = i45 % 2;
        if ((!z2) && b3.t(14)) {
            int i47 = b + 107;
            a = i47 % 128;
            int i48 = i47 % 2;
            zF = b3.f(14, false);
            i2 = 15;
            z = true;
        } else {
            i2 = 15;
        }
        if (b3.t(i2)) {
            int i49 = b;
            int i50 = ((i49 | 39) << 1) - (i49 ^ 39);
            a = i50 % 128;
            int i51 = i50 % 2;
            strQ2 = b3.q(15);
            int i52 = b;
            int i53 = ((i52 & 38) + (i52 | 38)) - 1;
            a = i53 % 128;
            int i54 = i53 % 2;
        }
        if (i28 >= 26) {
            int i55 = a;
            int i56 = ((i55 & 67) - (~(-(-(i55 | 67))))) - 1;
            b = i56 % 128;
            int i57 = i56 % 2;
            if (b3.t(13)) {
                strQ = b3.q(13);
            }
        }
        if (i28 >= 28 && b3.t(0) && b3.j(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
            int i58 = b;
            int i59 = i58 & 123;
            int i60 = (i58 ^ 123) | i59;
            int i61 = (i59 & i60) + (i60 | i59);
            a = i61 % 128;
            if (i61 % 2 == 0) {
                int i62 = 5 / 2;
            }
        }
        o(context, b3);
        typedArrayObtainStyledAttributes2.recycle();
        int i63 = a;
        int i64 = ((i63 | 21) << 1) - (i63 ^ 21);
        b = i64 % 128;
        int i65 = i64 % 2;
        if (!z2 && z) {
            this.d.setAllCaps(zF);
        }
        Typeface typeface = this.n;
        if (typeface != null) {
            if (this.m == -1) {
                this.d.setTypeface(typeface, this.l);
            } else {
                this.d.setTypeface(typeface);
            }
        }
        if (strQ != null) {
            int i66 = b;
            int i67 = (i66 ^ 91) + ((i66 & 91) << 1);
            a = i67 % 128;
            if (i67 % 2 == 0) {
                this.d.setFontVariationSettings(strQ);
                throw null;
            }
            this.d.setFontVariationSettings(strQ);
            th = null;
        } else {
            th = null;
        }
        if (strQ2 == null) {
            i3 = 0;
        } else if (i28 >= 24) {
            this.d.setTextLocales(LocaleList.forLanguageTags(strQ2));
            i3 = 0;
        } else {
            i3 = 0;
            this.d.setTextLocale(Locale.forLanguageTag(strQ2.substring(0, strQ2.indexOf(44))));
        }
        V v = this.c;
        Context context2 = v.f101o;
        int[] iArr2 = h.c;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i3);
        TextView textView2 = v.f;
        Throwable th2 = th;
        T.p(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            int i68 = b;
            int i69 = i68 & 15;
            int i70 = (i68 | 15) & (~i69);
            int i71 = i69 << 1;
            int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
            a = i72 % 128;
            v.g = i72 % 2 == 0 ? typedArrayObtainStyledAttributes3.getInt(3, 1) : typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(2)) {
            int i73 = a;
            int i74 = ((i73 | 35) << 1) - (i73 ^ 35);
            b = i74 % 128;
            int i75 = i74 % 2;
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            fApplyDimension = -1.0f;
        }
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId3 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId3);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                int i76 = b;
                int i77 = i76 & 13;
                int i78 = (~i77) & (i76 | 13);
                int i79 = i77 << 1;
                int i80 = (i78 ^ i79) + ((i78 & i79) << 1);
                a = i80 % 128;
                int i81 = i80 % 2 == 0 ? 1 : 0;
                while (i81 < length) {
                    iArr3[i81] = typedArrayObtainTypedArray.getDimensionPixelSize(i81, -1);
                    int i82 = i81 | 125;
                    int i83 = i82 << 1;
                    int i84 = -((~(i81 & 125)) & i82);
                    int i85 = (i83 & i84) + (i83 | i84);
                    int i86 = i85 | (-124);
                    i81 = ((i86 << 1) - (~(-(i86 & (~(i85 & (-124))))))) - 1;
                }
                v.k = v.g(iArr3);
                v.k();
                int i87 = a;
                int i88 = i87 & 65;
                int i89 = -(-((i87 ^ 65) | i88));
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                b = i90 % 128;
                if (i90 % 2 != 0) {
                    th2.hashCode();
                    throw th2;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!v.e()) {
            v.g = 0;
        } else if (v.g == 1) {
            if (!v.m) {
                int i91 = a + 93;
                b = i91 % 128;
                int i92 = i91 % 2;
                DisplayMetrics displayMetrics = v.f101o.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    int i93 = b;
                    int i94 = ((i93 | 15) << 1) - (((~i93) & 15) | (i93 & (-16)));
                    a = i94 % 128;
                    i4 = 2;
                    fApplyDimension = i94 % 2 == 0 ? TypedValue.applyDimension(5, 12.0f, displayMetrics) : TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                v.l(fApplyDimension, dimension2, dimension);
            }
            v.j();
        }
        if (!(!InterfaceC0325p.a)) {
            V v2 = this.c;
            if (v2.g != 0) {
                int[] iArr4 = v2.k;
                if (iArr4.length > 0) {
                    float autoSizeStepGranularity = this.d.getAutoSizeStepGranularity();
                    int i95 = b;
                    int i96 = ((i95 | 63) << 1) - (i95 ^ 63);
                    a = i96 % 128;
                    if (i96 % 2 == 0) {
                        
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04bf: INVOKE (r28v1 android.graphics.drawable.Drawable) VIRTUAL call: java.lang.Object.hashCode():int A[MD:():int (c)] (LINE:93) in method: ivas.gov.bisp.enumeration.k.v.i(android.util.AttributeSet, int):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v1 android.graphics.drawable.Drawable
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 2072
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p088k.C0322v.i(android.util.AttributeSet, int):void");
                    }
                }
