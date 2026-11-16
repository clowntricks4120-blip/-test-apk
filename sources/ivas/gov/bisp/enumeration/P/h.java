package ivas.gov.bisp.enumeration.P;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import ivas.gov.bisp.enumeration.o0000O00.OooOOO;
import ivas.gov.bisp.enumeration.p011ak.C;
import ivas.gov.bisp.enumeration.p011ak.s;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static int a = 0;
    private static int b = 1;
    public boolean A;
    public CharSequence B;
    public Bitmap C;
    public float D;
    public float E;
    public int[] F;
    public boolean G;
    public float H;
    public TimeInterpolator I;
    public final TextPaint J;
    public final TextPaint K;
    public TimeInterpolator L;
    public float M;
    public float N;
    public ColorStateList O;
    public float P;
    public float Q;
    public StaticLayout R;
    public float S;
    public float T;
    public CharSequence U;
    public final View d;
    public boolean e;
    public float f;
    public float g;
    public final Rect h;
    public final Rect i;
    public final RectF j;
    public ColorStateList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f51o;
    public ColorStateList p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public CharSequence v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public ivas.gov.bisp.enumeration.aL.j z;
    public int k = 16;
    public int c = 16;
    public float l = 15.0f;
    public float m = 15.0f;

    public h(View view) {
        this.d = view;
        TextPaint textPaint = new TextPaint(129);
        this.J = textPaint;
        this.K = new TextPaint(textPaint);
        this.h = new Rect();
        this.i = new Rect();
        this.j = new RectF();
        this.g = 0.5f;
    }

    public static float d(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 113;
        int i4 = ((i2 & 113) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        if (timeInterpolator != null) {
            int i8 = i2 & 83;
            int i9 = (i2 | 83) & (~i8);
            int i10 = i8 << 1;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                timeInterpolator.getInterpolation(f3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f3 = timeInterpolator.getInterpolation(f3);
        }
        float fB = ivas.gov.bisp.enumeration.T.j.b(f, f2, f3);
        int i12 = b;
        int i13 = ((i12 & 42) + (i12 | 42)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        return fB;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    public static boolean e(Rect rect, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 63;
        boolean z = true;
        int i8 = ((i6 | 63) & (~i7)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        if (rect.left == i) {
            int i10 = a;
            int i11 = i10 & 93;
            int i12 = -(-((i10 ^ 93) | i11));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            int i14 = i13 % 2;
            if (rect.top == i2) {
                int i15 = b;
                int i16 = i15 & 19;
                int i17 = ((i15 ^ 19) | i16) << 1;
                int i18 = -((i15 | 19) & (~i16));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                a = i19 % 128;
                Object obj = null;
                if (i19 % 2 != 0) {
                    int i20 = rect.right;
                    obj.hashCode();
                    throw null;
                }
                if (rect.right == i3) {
                    int i21 = b;
                    int i22 = (i21 & 63) + (i21 | 63);
                    a = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = rect.bottom;
                    if (i23 != 0) {
                        throw null;
                    }
                    if (i24 == i4) {
                        int i25 = a;
                        int i26 = ((i25 ^ 22) + ((i25 & 22) << 1)) - 1;
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    } else {
                        int i28 = a;
                        int i29 = ((i28 ^ 57) | (i28 & 57)) << 1;
                        int i30 = -(((~i28) & 57) | (i28 & (-58)));
                        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                        b = i31 % 128;
                        int i32 = i31 % 2;
                        z = false;
                    }
                } else {
                    int i210 = a;
                    int i211 = ((i210 ^ 57) | (i210 & 57)) << 1;
                    int i33 = -(((~i210) & 57) | (i210 & (-58)));
                    int i34 = ((i211 | i33) << 1) - (i33 ^ i211);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    z = false;
                }
            } else {
                int i212 = a;
                int i213 = ((i212 ^ 57) | (i212 & 57)) << 1;
                int i36 = -(((~i212) & 57) | (i212 & (-58)));
                int i37 = ((i213 | i36) << 1) - (i36 ^ i213);
                b = i37 % 128;
                int i38 = i37 % 2;
                z = false;
            }
        } else {
            int i214 = a;
            int i215 = ((i214 ^ 57) | (i214 & 57)) << 1;
            int i39 = -(((~i214) & 57) | (i214 & (-58)));
            int i310 = ((i215 | i39) << 1) - (i39 ^ i215);
            b = i310 % 128;
            int i311 = i310 % 2;
            z = false;
        }
        int i40 = b + 95;
        a = i40 % 128;
        int i41 = i40 % 2;
        return z;
    }

    public final int j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 67) + (i2 | 67);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iL = l(this.p);
        int i5 = b;
        int i6 = ((i5 ^ 34) + ((i5 & 34) << 1)) - 1;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return iL;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int l(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 66) + (i2 | 66)) - 1;
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (colorStateList == null) {
            int i5 = (((i4 | 12) << 1) - (i4 ^ 12)) - 1;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        int[] iArr = this.F;
        if (iArr == null) {
            int defaultColor = colorStateList.getDefaultColor();
            int i6 = b + 55;
            a = i6 % 128;
            int i7 = i6 % 2;
            return defaultColor;
        }
        int i8 = i2 + 5;
        b = i8 % 128;
        int i9 = i8 % 2;
        int colorForState = colorStateList.getColorForState(iArr, 0);
        int i10 = a;
        int i11 = i10 & 83;
        int i12 = (i11 - (~((i10 ^ 83) | i11))) - 1;
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return colorForState;
        }
        obj.hashCode();
        throw null;
    }

    public final void n(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 85;
        int i4 = ((((i2 ^ 85) | i3) << 1) - (~(-((~i3) & (i2 | 85))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.p != colorStateList) {
            int i6 = (-2) - (((i2 & 58) + (i2 | 58)) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            this.p = colorStateList;
            m();
            int i8 = b;
            int i9 = i8 & 63;
            int i10 = i9 + ((i8 ^ 63) | i9);
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = b;
        int i13 = i12 ^ 119;
        int i14 = ((i12 & 119) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 & i15) + (i14 | i15);
        a = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0091  */
    public final void o(float f) {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 82;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = 1.0f;
            if (f > 1.0f) {
                int i7 = i3 ^ 11;
                int i8 = -(-((i3 & 11) << 1));
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                b = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i3 & 105;
                int i12 = (~i11) & (i3 | 105);
                int i13 = i11 << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
            }
            if (f != this.f) {
                int i16 = (i3 ^ 123) + ((i3 & 123) << 1);
                b = i16 % 128;
                int i17 = i16 % 2;
                this.f = f;
                h(f);
                int i18 = b + 41;
                a = i18 % 128;
                int i19 = i18 % 2;
            }
            i = a + 103;
            b = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
        int i20 = ((i3 & 59) - (~(-(-(i3 | 59))))) - 1;
        b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i3 & 57;
        int i23 = (((i3 ^ 57) | i22) << 1) - ((~i22) & (i3 | 57));
        b = i23 % 128;
        int i24 = i23 % 2;
        f = f2;
        if (f != this.f) {
            int i110 = (i3 ^ 123) + ((i3 & 123) << 1);
            b = i110 % 128;
            int i111 = i110 % 2;
            this.f = f;
            h(f);
            int i112 = b + 41;
            a = i112 % 128;
            int i113 = i112 % 2;
        }
        i = a + 103;
        b = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void q(float f) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 33;
        int i4 = (i3 - (~(-(-((i2 ^ 33) | i3))))) - 1;
        b = i4 % 128;
        int i5 = i4 % 2;
        i(f, false);
        View view = this.d;
        int i6 = a;
        int i7 = (i6 ^ 77) + ((i6 & 77) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        WeakHashMap<View, R> weakHashMap = T.c;
        T.aWX.l(view);
        int i9 = b;
        int i10 = i9 & 11;
        int i11 = (i10 - (~((i9 ^ 11) | i10))) - 1;
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public final float k() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 29) - (~(i2 | 29))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            this.K.setTextSize(this.m);
            throw null;
        }
        TextPaint textPaint = this.K;
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.x);
        int i4 = a + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        textPaint.setLetterSpacing(this.Q);
        float fAscent = this.K.ascent();
        int i6 = b;
        int i7 = i6 & 9;
        int i8 = i7 + ((i6 ^ 9) | i7);
        int i9 = i8 % 128;
        a = i9;
        int i10 = i8 % 2;
        float f = -fAscent;
        int i11 = (((i9 | 34) << 1) - (i9 ^ 34)) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00b2  */
    public final void r(Typeface typeface) {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 73) - (~(-(-(i2 | 73))))) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aL.j jVar = this.z;
        if (jVar != null) {
            int i5 = (i2 & 63) + (i2 | 63);
            a = i5 % 128;
            int i6 = i5 % 2;
            jVar.f = true;
            int i7 = a;
            int i8 = i7 & 65;
            int i9 = ((i7 ^ 65) | i8) << 1;
            int i10 = -((i7 | 65) & (~i8));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            b = i11 % 128;
            int i12 = i11 % 2;
        }
        boolean z2 = false;
        if (this.x != typeface) {
            int i13 = a + 35;
            b = i13 % 128;
            int i14 = i13 % 2;
            this.x = typeface;
            z = true;
        } else {
            int i15 = a;
            int i16 = (i15 ^ 68) + ((i15 & 68) << 1);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            b = i17 % 128;
            int i18 = i17 % 2;
            z = false;
        }
        if (this.w != typeface) {
            int i19 = a;
            int i20 = (i19 | 39) << 1;
            int i21 = -(i19 ^ 39);
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            b = i22 % 128;
            int i23 = i22 % 2;
            this.w = typeface;
            int i24 = (((i19 & (-100)) | ((~i19) & 99)) - (~((i19 & 99) << 1))) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
            z2 = true;
        } else {
            int i26 = b;
            int i27 = i26 & 63;
            int i28 = -(-(i26 | 63));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            a = i29 % 128;
            int i30 = i29 % 2;
        }
        if (z) {
            m();
            int i31 = b;
            int i32 = i31 | 107;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 107)) & i32);
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            a = i35 % 128;
            int i36 = i35 % 2;
        } else {
            int i37 = b;
            int i38 = i37 & 97;
            int i39 = (((i37 ^ 97) | i38) << 1) - ((i37 | 97) & (~i38));
            a = i39 % 128;
            int i40 = i39 % 2;
            if (z2) {
                m();
                int i310 = b;
                int i311 = i310 | 107;
                int i312 = i311 << 1;
                int i313 = -((~(i310 & 107)) & i311);
                int i314 = (i312 ^ i313) + ((i313 & i312) << 1);
                a = i314 % 128;
                int i315 = i314 % 2;
            }
        }
        int i41 = a;
        int i42 = i41 & 69;
        int i43 = (i42 - (~((i41 ^ 69) | i42))) - 1;
        b = i43 % 128;
        int i44 = i43 % 2;
    }

    public final void p(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (i3 & 51) + (i3 | 51);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.c != i) {
            int i6 = i3 | 95;
            int i7 = i6 << 1;
            int i8 = -((~(i3 & 95)) & i6);
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
            this.c = i;
            m();
            int i11 = b;
            int i12 = i11 & 73;
            int i13 = (i11 | 73) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            a = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = a;
        int i18 = ((i17 | 91) << 1) - (i17 ^ 91);
        b = i18 % 128;
        if (i18 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    public final void f() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.h.width();
            throw null;
        }
        if (this.h.width() > 0) {
            int i4 = b;
            int i5 = i4 & 85;
            int i6 = i5 + ((i4 ^ 85) | i5);
            a = i6 % 128;
            int i7 = i6 % 2;
            if (this.h.height() > 0) {
                int i8 = b;
                int i9 = i8 & 123;
                int i10 = ((i8 ^ 123) | i9) << 1;
                int i11 = -((i8 | 123) & (~i9));
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    this.i.width();
                    throw null;
                }
                if (this.i.width() <= 0 || this.i.height() <= 0) {
                    int i13 = b + 33;
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                } else {
                    int i15 = a;
                    int i16 = i15 & 69;
                    int i17 = -(-((i15 ^ 69) | i16));
                    int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = ((i15 ^ 54) + ((i15 & 54) << 1)) - 1;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    z = true;
                }
            } else {
                int i110 = b + 33;
                a = i110 % 128;
                int i111 = i110 % 2;
                z = false;
            }
        } else {
            int i112 = b + 33;
            a = i112 % 128;
            int i113 = i112 % 2;
            z = false;
        }
        this.e = z;
        int i22 = a;
        int i23 = (((i22 ^ 79) | (i22 & 79)) << 1) - (((~i22) & 79) | (i22 & (-80)));
        b = i23 % 128;
        if (i23 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    public final boolean g(CharSequence charSequence) {
        boolean z;
        C c;
        int i;
        int i2;
        int length;
        s.aWd awd;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 75;
        int i7 = ((i5 ^ 75) | i6) << 1;
        int i8 = -((i5 | 75) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            View view = this.d;
            WeakHashMap<View, R> weakHashMap = T.c;
            T.aWY.f(view);
            throw null;
        }
        View view2 = this.d;
        WeakHashMap<View, R> weakHashMap2 = T.c;
        int iF = T.aWY.f(view2);
        int i10 = b;
        int i11 = (i10 ^ 17) + ((i10 & 17) << 1);
        int i12 = i11 % 128;
        a = i12;
        if (i11 % 2 != 0) {
            if (iF != 0) {
            }
            z = false;
            if (z) {
                int i13 = b;
                int i14 = i13 & 91;
                int i15 = ((((i13 ^ 91) | i14) << 1) - (~(-((i13 | 91) & (~i14))))) - 1;
                a = i15 % 128;
                int i16 = i15 % 2;
                c = s.f;
                int i17 = b;
                int i18 = i17 & 87;
                int i19 = (i17 ^ 87) | i18;
                i = (i18 & i19) + (i19 | i18);
                i2 = i % 128;
            } else {
                c = s.e;
                int i20 = b;
                int i21 = i20 & 83;
                int i22 = -(-((i20 ^ 83) | i21));
                i = (i21 ^ i22) + ((i22 & i21) << 1);
                i2 = i % 128;
            }
            a = i2;
            int i23 = i % 2;
            length = charSequence.length();
            awd = (s.aWd) c;
            int i24 = b;
            int i25 = i24 ^ 79;
            i3 = ((((i24 & 79) | i25) << 1) - (~(-i25))) - 1;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                return awd.d(charSequence, 0, length);
            }
            int i26 = 4 / 0;
            return awd.d(charSequence, 0, length);
        }
        if (iF == 1) {
            z = true;
        }
        if (z) {
            int i110 = b;
            int i111 = i110 & 91;
            int i112 = ((((i110 ^ 91) | i111) << 1) - (~(-((i110 | 91) & (~i111))))) - 1;
            a = i112 % 128;
            int i113 = i112 % 2;
            c = s.f;
            int i114 = b;
            int i115 = i114 & 87;
            int i116 = (i114 ^ 87) | i115;
            i = (i115 & i116) + (i116 | i115);
            i2 = i % 128;
        } else {
            c = s.e;
            int i27 = b;
            int i28 = i27 & 83;
            int i29 = -(-((i27 ^ 83) | i28));
            i = (i28 ^ i29) + ((i29 & i28) << 1);
            i2 = i % 128;
        }
        a = i2;
        int i210 = i % 2;
        length = charSequence.length();
        awd = (s.aWd) c;
        int i211 = b;
        int i212 = i211 ^ 79;
        i3 = ((((i211 & 79) | i212) << 1) - (~(-i212))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return awd.d(charSequence, 0, length);
        }
        int i213 = 4 / 0;
        return awd.d(charSequence, 0, length);
        int i30 = i12 & 29;
        int i31 = (i12 | 29) & (~i30);
        int i32 = -(-(i30 << 1));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        b = i33 % 128;
        int i34 = i33 % 2;
        z = false;
        if (z) {
            int i117 = b;
            int i118 = i117 & 91;
            int i119 = ((((i117 ^ 91) | i118) << 1) - (~(-((i117 | 91) & (~i118))))) - 1;
            a = i119 % 128;
            int i1110 = i119 % 2;
            c = s.f;
            int i1111 = b;
            int i1112 = i1111 & 87;
            int i1113 = (i1111 ^ 87) | i1112;
            i = (i1112 & i1113) + (i1113 | i1112);
            i2 = i % 128;
        } else {
            c = s.e;
            int i214 = b;
            int i215 = i214 & 83;
            int i216 = -(-((i214 ^ 83) | i215));
            i = (i215 ^ i216) + ((i216 & i215) << 1);
            i2 = i % 128;
        }
        a = i2;
        int i217 = i % 2;
        length = charSequence.length();
        awd = (s.aWd) c;
        int i218 = b;
        int i219 = i218 ^ 79;
        i3 = ((((i218 & 79) | i219) << 1) - (~(-i219))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return awd.d(charSequence, 0, length);
        }
        int i2110 = 4 / 0;
        return awd.d(charSequence, 0, length);
    }

    public static int c(int i, int i2, float f) {
        float f2;
        int iAlpha;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 & (-110)) | ((~i4) & 109)) + ((i4 & 109) << 1);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            f2 = 1.0f % f;
            iAlpha = Color.alpha(i);
        } else {
            f2 = 1.0f - f;
            iAlpha = Color.alpha(i);
        }
        float f3 = iAlpha;
        float fAlpha = Color.alpha(i2);
        float fRed = Color.red(i);
        float fRed2 = Color.red(i2);
        int i6 = a;
        int i7 = (i6 ^ 43) + ((i6 & 43) << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
        float fGreen = Color.green(i);
        float fGreen2 = Color.green(i2);
        int i9 = b + 37;
        a = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            Color.blue(i);
            Color.blue(i2);
            obj.hashCode();
            throw null;
        }
        float fBlue = Color.blue(i);
        float fBlue2 = Color.blue(i2);
        int i10 = (int) ((fAlpha * f) + (f3 * f2));
        int i11 = b;
        int i12 = (((i11 & (-40)) | ((~i11) & 39)) - (~(-(-((i11 & 39) << 1))))) - 1;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = (int) ((fRed2 * f) + (fRed * f2));
        int i15 = (int) ((fGreen2 * f) + (fGreen * f2));
        int i16 = ((i11 | 1) << 1) - (i11 ^ 1);
        a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = (int) ((fBlue2 * f) + (fBlue * f2));
        int i19 = i11 & 119;
        int i20 = ((i11 ^ 119) | i19) << 1;
        int i21 = -((~i19) & (i11 | 119));
        int i22 = (i20 & i21) + (i20 | i21);
        a = i22 % 128;
        if (i22 % 2 != 0) {
            Color.argb(i10, i14, i15, i18);
            throw null;
        }
        int iArgb = Color.argb(i10, i14, i15, i18);
        int i23 = b;
        int i24 = i23 ^ 61;
        int i25 = (i23 & 61) << 1;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        a = i26 % 128;
        if (i26 % 2 == 0) {
            return iArgb;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0417  */
    /* JADX WARN: Code duplicated, block: B:123:0x0462  */
    /* JADX WARN: Code duplicated, block: B:126:0x048d  */
    /* JADX WARN: Code duplicated, block: B:128:0x049e  */
    /* JADX WARN: Code duplicated, block: B:129:0x04a4  */
    public final void m() {
        float height;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        Bitmap bitmap;
        int i5;
        int i6;
        TextPaint textPaint;
        int length;
        int i7;
        float fDescent;
        float fAscent;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 69;
        int i11 = -(-((i9 ^ 69) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        a = i12 % 128;
        Object obj = null;
        if (i12 % 2 != 0) {
            this.d.getHeight();
            obj.hashCode();
            throw null;
        }
        if (this.d.getHeight() > 0 && this.d.getWidth() > 0) {
            int i13 = a;
            int i14 = i13 & 43;
            int i15 = (i13 ^ 43) | i14;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = i16 % 128;
            b = i17;
            int i18 = i16 % 2;
            float f2 = this.D;
            float f3 = this.m;
            int i19 = i17 & 125;
            int i20 = (i17 ^ 125) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            int i22 = i21 % 2;
            i(f3, false);
            CharSequence charSequence = this.B;
            if (charSequence != null) {
                int i23 = a;
                int i24 = i23 + 33;
                b = i24 % 128;
                int i25 = i24 % 2;
                StaticLayout staticLayout = this.R;
                if (staticLayout != null) {
                    int i26 = i23 & 85;
                    int i27 = ((i23 ^ 85) | i26) << 1;
                    int i28 = -((i23 | 85) & (~i26));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    b = i29 % 128;
                    if (i29 % 2 == 0) {
                        staticLayout.getWidth();
                        throw null;
                    }
                    this.U = TextUtils.ellipsize(charSequence, this.J, staticLayout.getWidth(), TextUtils.TruncateAt.END);
                    int i30 = a;
                    int i31 = i30 & 31;
                    int i32 = i31 + ((i30 ^ 31) | i31);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                }
            }
            if (this.U != null) {
                TextPaint textPaint2 = new TextPaint(this.J);
                int i34 = b;
                int i35 = i34 & 97;
                int i36 = -(-(i34 | 97));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                a = i37 % 128;
                int i38 = i37 % 2;
                textPaint2.setLetterSpacing(this.Q);
                CharSequence charSequence2 = this.U;
                int i39 = a;
                int i40 = ((i39 & 56) + (i39 | 56)) - 1;
                b = i40 % 128;
                int i41 = i40 % 2;
                int length2 = charSequence2.length();
                int i42 = b + 59;
                a = i42 % 128;
                int i43 = i42 % 2;
                this.H = textPaint2.measureText(charSequence2, 0, length2);
            } else {
                this.H = 0.0f;
                int i44 = b;
                int i45 = i44 & 93;
                int i46 = (i44 ^ 93) | i45;
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                a = i47 % 128;
                if (i47 % 2 != 0) {
                    int i48 = 5 / 5;
                }
            }
            int i49 = this.c;
            boolean z = this.A;
            int i50 = a;
            int i51 = i50 & 45;
            int i52 = (i50 ^ 45) | i51;
            int i53 = (i51 & i52) + (i52 | i51);
            b = i53 % 128;
            int i54 = i53 % 2;
            int absoluteGravity = Gravity.getAbsoluteGravity(i49, z ? 1 : 0);
            int i55 = absoluteGravity & 112;
            if (i55 != 48) {
                int i56 = a;
                int i57 = (i56 ^ 89) + ((i56 & 89) << 1);
                int i58 = i57 % 128;
                b = i58;
                if (i57 % 2 != 0 ? i55 == 80 : i55 == 2) {
                    float f4 = this.h.bottom;
                    TextPaint textPaint3 = this.J;
                    int i59 = b;
                    int i60 = i59 & 13;
                    int i61 = i60 + ((i59 ^ 13) | i60);
                    a = i61 % 128;
                    int i62 = i61 % 2;
                    this.q = textPaint3.ascent() + f4;
                    int i63 = b;
                    int i64 = (i63 & (-34)) | ((~i63) & 33);
                    int i65 = -(-((i63 & 33) << 1));
                    int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                    a = i66 % 128;
                    int i67 = i66 % 2;
                } else {
                    int i68 = (i58 ^ 87) + ((i58 & 87) << 1);
                    a = i68 % 128;
                    if (i68 % 2 != 0) {
                        fDescent = this.J.descent();
                        fAscent = this.J.ascent();
                        int i69 = 30 / 0;
                    } else {
                        fDescent = this.J.descent();
                        fAscent = this.J.ascent();
                    }
                    float f5 = (fDescent - fAscent) / 2.0f;
                    float fCenterY = this.h.centerY();
                    int i70 = b + 55;
                    a = i70 % 128;
                    if (i70 % 2 != 0) {
                        this.q = fCenterY / f5;
                    } else {
                        this.q = fCenterY - f5;
                    }
                }
            } else {
                this.q = this.h.top;
                int i71 = b;
                int i72 = (i71 | 41) << 1;
                int i73 = -(((~i71) & 41) | (i71 & (-42)));
                int i74 = (i72 & i73) + (i73 | i72);
                a = i74 % 128;
                int i75 = i74 % 2;
            }
            int i76 = absoluteGravity & 8388615;
            if (i76 != 1) {
                int i77 = b;
                int i78 = (i77 | 85) << 1;
                int i79 = -(((~i77) & 85) | (i77 & (-86)));
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                a = i80 % 128;
                int i81 = i80 % 2;
                if (i76 != 5) {
                    int i82 = ((i77 & 34) + (i77 | 34)) - 1;
                    a = i82 % 128;
                    if (i82 % 2 != 0) {
                        this.t = this.h.left;
                        obj.hashCode();
                        throw null;
                    }
                    this.t = this.h.left;
                } else {
                    float f6 = this.h.right;
                    float f7 = this.H;
                    int i83 = b;
                    int i84 = (i83 & 5) + (i83 | 5);
                    a = i84 % 128;
                    if (i84 % 2 != 0) {
                        this.t = f6 % f7;
                    } else {
                        this.t = f6 - f7;
                    }
                    int i85 = i83 & 11;
                    int i86 = (i83 ^ 11) | i85;
                    int i87 = (i85 & i86) + (i85 | i86);
                    a = i87 % 128;
                    int i88 = i87 % 2;
                }
            } else {
                float fCenterX = this.h.centerX();
                float f8 = this.H / 2.0f;
                int i89 = a;
                int i90 = (i89 & 63) + (i89 | 63);
                b = i90 % 128;
                int i91 = i90 % 2;
                this.t = fCenterX - f8;
            }
            i(this.l, false);
            StaticLayout staticLayout2 = this.R;
            int i92 = b;
            int i93 = i92 & 53;
            int i94 = (((i92 ^ 53) | i93) << 1) - ((~i93) & (i92 | 53));
            int i95 = i94 % 128;
            a = i95;
            int i96 = i94 % 2;
            if (staticLayout2 != null) {
                int i97 = ((i95 & 34) + (i95 | 34)) - 1;
                b = i97 % 128;
                if (i97 % 2 == 0) {
                    staticLayout2.getHeight();
                    obj.hashCode();
                    throw null;
                }
                height = staticLayout2.getHeight();
                int i98 = b;
                int i99 = i98 & 25;
                int i100 = (i98 | 25) & (~i99);
                int i101 = -(-(i99 << 1));
                int i102 = ((i100 | i101) << 1) - (i100 ^ i101);
                a = i102 % 128;
                int i103 = i102 % 2;
            } else {
                int i104 = i92 & 21;
                int i105 = (i104 - (~((i92 ^ 21) | i104))) - 1;
                a = i105 % 128;
                if (i105 % 2 != 0) {
                    int i106 = 5 % 4;
                }
                height = 0.0f;
            }
            StaticLayout staticLayout3 = this.R;
            if (staticLayout3 != null) {
                int i107 = a;
                int i108 = i107 ^ 61;
                int i109 = ((i107 & 61) | i108) << 1;
                int i110 = -i108;
                int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                b = i111 % 128;
                if (i111 % 2 == 0) {
                    staticLayout3.getLineCount();
                    int i112 = 30 / 0;
                } else {
                    staticLayout3.getLineCount();
                }
            }
            CharSequence charSequence3 = this.B;
            if (charSequence3 != null) {
                int i113 = a;
                int i114 = ((i113 ^ 73) | (i113 & 73)) << 1;
                int i115 = -(((~i113) & 73) | (i113 & (-74)));
                int i116 = (i114 & i115) + (i115 | i114);
                b = i116 % 128;
                if (i116 % 2 == 0) {
                    textPaint = this.J;
                    length = charSequence3.length();
                    i7 = 1;
                } else {
                    textPaint = this.J;
                    length = charSequence3.length();
                    i7 = 0;
                }
                float fMeasureText = textPaint.measureText(charSequence3, i7, length);
                int i117 = b;
                int i118 = ((i117 ^ 12) + ((i117 & 12) << 1)) - 1;
                a = i118 % 128;
                if (i118 % 2 != 0) {
                    int i119 = 5 % 4;
                }
                f = fMeasureText;
            } else {
                f = 0.0f;
            }
            StaticLayout staticLayout4 = this.R;
            if (staticLayout4 != null) {
                int i120 = a;
                int i121 = (((i120 ^ 11) | (i120 & 11)) << 1) - (((~i120) & 11) | (i120 & (-12)));
                b = i121 % 128;
                int i122 = i121 % 2;
                staticLayout4.getLineLeft(0);
                int i123 = a;
                int i124 = i123 & 105;
                int i125 = ((((i123 ^ 105) | i124) << 1) - (~(-((i123 | 105) & (~i124))))) - 1;
                b = i125 % 128;
                if (i125 % 2 == 0) {
                    int i126 = 2 / 4;
                }
            }
            int i127 = this.k;
            boolean z2 = this.A;
            int i128 = a;
            int i129 = (((i128 ^ 113) | (i128 & 113)) << 1) - ((113 & (~i128)) | (i128 & (-114)));
            b = i129 % 128;
            int i130 = i129 % 2;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(i127, z2 ? 1 : 0);
            int i131 = a;
            int i132 = (i131 & 46) + (i131 | 46);
            int i133 = (i132 ^ (-1)) + (i132 << 1);
            int i134 = i133 % 128;
            b = i134;
            if (i133 % 2 != 0 ? (i = absoluteGravity2 & 112) == 48 : (i = absoluteGravity2 & 112) == 110) {
                this.f51o = this.i.top;
                int i135 = b;
                i2 = i135 & 111;
                i3 = i135 ^ 111;
            } else {
                int i136 = i134 + 73;
                a = i136 % 128;
                int i137 = i136 % 2;
                if (i != 80) {
                    int i138 = ((i134 ^ 77) | (i134 & 77)) << 1;
                    int i139 = -(((~i134) & 77) | (i134 & (-78)));
                    int i140 = (i138 & i139) + (i138 | i139);
                    a = i140 % 128;
                    int i141 = i140 % 2;
                    float f9 = height / 2.0f;
                    float fCenterY2 = this.i.centerY();
                    int i142 = a;
                    int i143 = i142 & 17;
                    int i144 = (((i142 | 17) & (~i143)) - (~(i143 << 1))) - 1;
                    int i145 = i144 % 128;
                    b = i145;
                    this.f51o = i144 % 2 == 0 ? fCenterY2 * f9 : fCenterY2 - f9;
                    int i146 = i145 + 65;
                    a = i146 % 128;
                    int i147 = i146 % 2;
                } else {
                    float f10 = this.i.bottom;
                    int i148 = b;
                    int i149 = i148 & 15;
                    int i150 = ((((i148 ^ 15) | i149) << 1) - (~(-((i148 | 15) & (~i149))))) - 1;
                    a = i150 % 128;
                    if (i150 % 2 != 0) {
                        this.f51o = this.J.descent() / (f10 / height);
                    } else {
                        this.f51o = this.J.descent() + (f10 - height);
                    }
                    int i151 = b;
                    i2 = i151 & 21;
                    i3 = i151 ^ 21;
                }
                i4 = absoluteGravity2 & 8388615;
                if (i4 != 1) {
                    int i152 = b;
                    i6 = (-2) - (((i152 ^ 64) + ((i152 & 64) << 1)) ^ (-1));
                    a = i6 % 128;
                    if (i6 % 2 != 0 ? i4 == 5 : i4 == 3) {
                        this.r = this.i.right - f;
                        int i153 = b + 45;
                        a = i153 % 128;
                        int i154 = i153 % 2;
                    } else {
                        int i155 = (i152 & 95) + (i152 | 95);
                        a = i155 % 128;
                        if (i155 % 2 != 0) {
                            this.r = this.i.left;
                            obj.hashCode();
                            throw null;
                        }
                        this.r = this.i.left;
                    }
                } else {
                    float fCenterX2 = this.i.centerX();
                    int i156 = b;
                    int i157 = i156 + 97;
                    a = i157 % 128;
                    int i158 = i157 % 2;
                    this.r = fCenterX2 - (f / 2.0f);
                    int i159 = i156 ^ 93;
                    int i160 = ((i156 & 93) | i159) << 1;
                    int i161 = -i159;
                    int i162 = ((i160 | i161) << 1) - (i161 ^ i160);
                    a = i162 % 128;
                    int i163 = i162 % 2;
                }
                bitmap = this.C;
                if (bitmap != null) {
                    int i164 = b;
                    i5 = ((i164 ^ 96) + ((i164 & 96) << 1)) - 1;
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        bitmap.recycle();
                        this.C = null;
                        obj.hashCode();
                        throw null;
                    }
                    bitmap.recycle();
                    this.C = null;
                }
                q(f2);
                h(this.f);
                int i165 = a + 13;
                b = i165 % 128;
                int i166 = i165 % 2;
            }
            int i167 = i2 + (i3 | i2);
            a = i167 % 128;
            int i168 = i167 % 2;
            i4 = absoluteGravity2 & 8388615;
            if (i4 != 1) {
                int i1510 = b;
                i6 = (-2) - (((i1510 ^ 64) + ((i1510 & 64) << 1)) ^ (-1));
                a = i6 % 128;
                if (i6 % 2 != 0) {
                    this.r = this.i.right - f;
                    int i1511 = b + 45;
                    a = i1511 % 128;
                    int i1512 = i1511 % 2;
                } else {
                    this.r = this.i.right - f;
                    int i1513 = b + 45;
                    a = i1513 % 128;
                    int i1514 = i1513 % 2;
                }
            } else {
                float fCenterX3 = this.i.centerX();
                int i1515 = b;
                int i1516 = i1515 + 97;
                a = i1516 % 128;
                int i1517 = i1516 % 2;
                this.r = fCenterX3 - (f / 2.0f);
                int i1518 = i1515 ^ 93;
                int i169 = ((i1515 & 93) | i1518) << 1;
                int i1610 = -i1518;
                int i1611 = ((i169 | i1610) << 1) - (i1610 ^ i169);
                a = i1611 % 128;
                int i1612 = i1611 % 2;
            }
            bitmap = this.C;
            if (bitmap != null) {
                int i1613 = b;
                i5 = ((i1613 ^ 96) + ((i1613 & 96) << 1)) - 1;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    bitmap.recycle();
                    this.C = null;
                    obj.hashCode();
                    throw null;
                }
                bitmap.recycle();
                this.C = null;
            }
            q(f2);
            h(this.f);
            int i1614 = a + 13;
            b = i1614 % 128;
            int i1615 = i1614 % 2;
        }
        int i170 = a;
        int i171 = i170 ^ 41;
        int i172 = ((i170 & 41) | i171) << 1;
        int i173 = -i171;
        int i174 = ((i172 | i173) << 1) - (i172 ^ i173);
        b = i174 % 128;
        if (i174 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0392  */
    /* JADX WARN: Code duplicated, block: B:107:0x03a8 A[Catch: OooOOO -> 0x046a, TRY_ENTER, TryCatch #2 {OooOOO -> 0x046a, blocks: (B:90:0x0322, B:92:0x0333, B:95:0x0350, B:98:0x036a, B:113:0x03b1, B:116:0x03c6, B:121:0x03ef, B:126:0x0412, B:130:0x0428, B:132:0x043d, B:133:0x0440, B:137:0x0444, B:125:0x0410, B:117:0x03cd, B:107:0x03a8, B:108:0x03ab, B:109:0x03ad, B:139:0x0459, B:140:0x045c, B:141:0x045f, B:144:0x0462, B:145:0x0466), top: B:157:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x03ab A[Catch: OooOOO -> 0x046a, TRY_LEAVE, TryCatch #2 {OooOOO -> 0x046a, blocks: (B:90:0x0322, B:92:0x0333, B:95:0x0350, B:98:0x036a, B:113:0x03b1, B:116:0x03c6, B:121:0x03ef, B:126:0x0412, B:130:0x0428, B:132:0x043d, B:133:0x0440, B:137:0x0444, B:125:0x0410, B:117:0x03cd, B:107:0x03a8, B:108:0x03ab, B:109:0x03ad, B:139:0x0459, B:140:0x045c, B:141:0x045f, B:144:0x0462, B:145:0x0466), top: B:157:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d9 A[PHI: r8
  0x00d9: PHI (r8v56 android.graphics.Typeface) = (r8v55 android.graphics.Typeface), (r8v58 android.graphics.Typeface) binds: [B:24:0x00d7, B:21:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0267  */
    public final void i(float f, boolean z) {
        float f2;
        float f3;
        boolean z2;
        boolean z3;
        float f4;
        boolean z4;
        int i;
        TextDirectionHeuristic textDirectionHeuristic;
        Typeface typeface;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 99;
        int i6 = (((i4 ^ 99) | i5) << 1) - ((i4 | 99) & (~i5));
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (this.v == null) {
            int i9 = i7 & 69;
            int i10 = -(-((i7 ^ 69) | i9));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 46 / 0;
                return;
            }
            return;
        }
        float fWidth = this.h.width();
        int iWidth = this.i.width();
        int i13 = b;
        int i14 = ((i13 ^ 55) | (i13 & 55)) << 1;
        int i15 = -(((~i13) & 55) | (i13 & (-56)));
        int i16 = (i14 & i15) + (i15 | i14);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            f2 = iWidth;
            f3 = f % this.m;
        } else {
            f2 = iWidth;
            f3 = f - this.m;
        }
        float fAbs = Math.abs(f3);
        int i17 = b;
        int i18 = i17 + 21;
        int i19 = i18 % 128;
        a = i19;
        int i20 = i18 % 2;
        if (fAbs < 0.001f) {
            int i21 = i19 & 25;
            int i22 = ((((i19 ^ 25) | i21) << 1) - (~(-((~i21) & (i19 | 25))))) - 1;
            int i23 = i22 % 128;
            b = i23;
            int i24 = i22 % 2;
            int i25 = i23 & 5;
            int i26 = i23 | 5;
            int i27 = (i25 & i26) + (i25 | i26);
            a = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 5 / 5;
            }
            int i29 = i23 & 103;
            int i30 = ((i23 ^ 103) | i29) << 1;
            int i31 = -((~i29) & (i23 | 103));
            int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
            a = i32 % 128;
            int i33 = i32 % 2;
            f4 = this.m;
            this.E = 1.0f;
            Typeface typeface2 = this.y;
            int i34 = ((i23 & (-86)) | ((~i23) & 85)) + ((i23 & 85) << 1);
            int i35 = i34 % 128;
            a = i35;
            if (i34 % 2 != 0) {
                typeface = this.x;
                int i36 = 35 / 0;
                if (typeface2 != typeface) {
                    int i37 = i35 & 13;
                    i2 = (((~i37) & (i35 | 13)) - (~(-(-(i37 << 1))))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.y = typeface;
                        z2 = false;
                    } else {
                        this.y = typeface;
                        z2 = true;
                    }
                    int i38 = i35 + 29;
                    b = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    z2 = false;
                }
            } else {
                typeface = this.x;
                if (typeface2 != typeface) {
                    int i310 = i35 & 13;
                    i2 = (((~i310) & (i35 | 13)) - (~(-(-(i310 << 1))))) - 1;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        this.y = typeface;
                        z2 = false;
                    } else {
                        this.y = typeface;
                        z2 = true;
                    }
                    int i311 = i35 + 29;
                    b = i311 % 128;
                    int i312 = i311 % 2;
                } else {
                    z2 = false;
                }
            }
        } else {
            int i40 = i17 ^ 107;
            int i41 = ((i17 & 107) | i40) << 1;
            int i42 = -i40;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            a = i43 % 128;
            int i44 = i43 % 2;
            float f5 = this.l;
            Typeface typeface3 = this.y;
            Typeface typeface4 = this.w;
            int i45 = ((i17 | 117) << 1) - (i17 ^ 117);
            a = i45 % 128;
            int i46 = i45 % 2;
            if (typeface3 != typeface4) {
                int i47 = i17 | 43;
                int i48 = i47 << 1;
                int i49 = -(i47 & (~(i17 & 43)));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                a = i50 % 128;
                int i51 = i50 % 2;
                this.y = typeface4;
                int i52 = i17 ^ 53;
                int i53 = (((i17 & 53) | i52) << 1) - i52;
                a = i53 % 128;
                int i54 = i53 % 2;
                z2 = true;
            } else {
                int i55 = i17 + 115;
                a = i55 % 128;
                int i56 = i55 % 2;
                z2 = false;
            }
            if (Math.abs(f - f5) < 0.001f) {
                int i57 = a;
                int i58 = ((i57 ^ 43) | (i57 & 43)) << 1;
                int i59 = -((i57 & (-44)) | ((~i57) & 43));
                int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                b = i60 % 128;
                int i61 = i60 % 2;
                int i62 = i57 ^ 113;
                int i63 = (((i57 & 113) | i62) << 1) - i62;
                b = i63 % 128;
                int i64 = i63 % 2;
                z3 = true;
            } else {
                int i65 = b;
                int i66 = i65 & 113;
                int i67 = (i65 ^ 113) | i66;
                int i68 = (i66 & i67) + (i67 | i66);
                a = i68 % 128;
                int i69 = i68 % 2;
                z3 = false;
            }
            if (!(!z3)) {
                int i70 = a;
                int i71 = (i70 & 48) + (i70 | 48);
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                int i73 = i72 % 128;
                b = i73;
                int i74 = i72 % 2;
                this.E = 1.0f;
                int i75 = i73 & 65;
                int i76 = i73 | 65;
                int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                a = i77 % 128;
                if (i77 % 2 != 0) {
                    int i78 = 5 % 3;
                }
            } else {
                this.E = f / this.l;
            }
            float f6 = this.m / this.l;
            if (z) {
                int i79 = b;
                int i80 = i79 & 19;
                int i81 = -(-(i79 | 19));
                int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                a = i82 % 128;
                int i83 = i82 % 2;
                fWidth = f2;
            } else {
                int i84 = b + 55;
                a = i84 % 128;
                if (i84 % 2 == 0 ? f2 * f6 <= fWidth : f2 * f6 <= fWidth) {
                    int i710 = b;
                    int i85 = i710 & 19;
                    int i86 = -(-(i710 | 19));
                    int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                    a = i87 % 128;
                    int i88 = i87 % 2;
                    fWidth = f2;
                } else {
                    fWidth = Math.min(fWidth / f6, f2);
                }
            }
            f4 = f5;
        }
        StaticLayout staticLayoutBuild = null;
        if (fWidth > 0.0f) {
            int i89 = b;
            int i90 = ((((i89 ^ 25) | (i89 & 25)) << 1) - (~(-((i89 & (-26)) | ((~i89) & 25))))) - 1;
            a = i90 % 128;
            int i91 = i90 % 2;
            if (this.D == f4) {
                int i92 = i89 & 113;
                int i93 = (i89 | 113) & (~i92);
                int i94 = -(-(i92 << 1));
                int i95 = (i93 & i94) + (i93 | i94);
                int i96 = i95 % 128;
                a = i96;
                int i97 = i95 % 2;
                if (this.G) {
                    z2 = true;
                } else {
                    int i98 = i96 & 49;
                    int i99 = ((i96 | 49) & (~i98)) + (i98 << 1);
                    int i100 = i99 % 128;
                    b = i100;
                    int i101 = i99 % 2;
                    if (z2) {
                        z2 = true;
                    } else {
                        int i102 = i100 & 111;
                        int i103 = (i100 ^ 111) | i102;
                        int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
                        a = i104 % 128;
                        boolean z5 = i104 % 2 != 0;
                        int i105 = (i100 ^ 33) + ((i100 & 33) << 1);
                        a = i105 % 128;
                        if (i105 % 2 != 0) {
                            int i106 = 5 % 2;
                        }
                        z2 = z5;
                    }
                }
            } else {
                z2 = true;
            }
            this.D = f4;
            this.G = false;
            int i107 = b;
            int i108 = i107 & 95;
            int i109 = ((i107 ^ 95) | i108) << 1;
            int i110 = -((~i108) & (i107 | 95));
            int i111 = (i109 & i110) + (i109 | i110);
            a = i111 % 128;
            if (i111 % 2 != 0) {
                staticLayoutBuild.hashCode();
                throw null;
            }
            int i112 = i107 & 61;
            int i113 = (((i107 | 61) & (~i112)) - (~(-(-(i112 << 1))))) - 1;
            a = i113 % 128;
            int i114 = i113 % 2;
        }
        if (this.B != null) {
            int i115 = b + 82;
            int i116 = (i115 ^ (-1)) + (i115 << 1);
            a = i116 % 128;
            int i117 = i116 % 2;
            if (!z2) {
                return;
            }
        }
        this.J.setTextSize(this.D);
        TextPaint textPaint = this.J;
        int i118 = b;
        int i119 = ((i118 | 117) << 1) - (((~i118) & 117) | (i118 & (-118)));
        a = i119 % 128;
        int i120 = i119 % 2;
        textPaint.setTypeface(this.y);
        TextPaint textPaint2 = this.J;
        float f7 = this.E;
        int i121 = b;
        int i122 = (i121 & 119) + (i121 | 119);
        int i123 = i122 % 128;
        a = i123;
        int i124 = i122 % 2;
        if (f7 != 1.0f) {
            int i125 = i123 & 119;
            int i126 = i125 + ((i123 ^ 119) | i125);
            b = i126 % 128;
            int i127 = i126 % 2;
            int i128 = ((i123 ^ 86) + ((i123 & 86) << 1)) - 1;
            b = i128 % 128;
            int i129 = i128 % 2;
            z4 = true;
        } else {
            int i130 = (i121 & 43) + (i121 | 43);
            a = i130 % 128;
            int i131 = i130 % 2;
            z4 = false;
        }
        textPaint2.setLinearText(z4);
        boolean zG = g(this.v);
        int i132 = b;
        int i133 = i132 & 81;
        int i134 = (((i132 | 81) & (~i133)) - (~(i133 << 1))) - 1;
        int i135 = i134 % 128;
        a = i135;
        int i136 = i134 % 2;
        this.A = zG;
        try {
            CharSequence charSequence = this.v;
            int i137 = i135 & 3;
            int i138 = (((i135 | 3) & (~i137)) - (~(i137 << 1))) - 1;
            b = i138 % 128;
            int i139 = i138 % 2;
            TextPaint textPaint3 = this.J;
            int i140 = (int) fWidth;
            int length = charSequence.length();
            int i141 = b;
            int i142 = (i141 & (-102)) | ((~i141) & 101);
            int i143 = (i141 & 101) << 1;
            int i144 = (i142 & i143) + (i143 | i142);
            a = i144 % 128;
            if (i144 % 2 != 0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            int iMax = Math.max(0, i140);
            float f8 = iMax;
            int i145 = a;
            int i146 = i145 & 7;
            int i147 = (i146 - (~((i145 ^ 7) | i146))) - 1;
            b = i147 % 128;
            if (i147 % 2 == 0) {
                TextUtils.ellipsize(charSequence, textPaint3, f8, truncateAt2);
                try {
                    staticLayoutBuild.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequence, textPaint3, f8, truncateAt2);
            int iMin = Math.min(charSequenceEllipsize.length(), length);
            int i148 = a;
            int i149 = i148 & 57;
            int i150 = (i148 ^ 57) | i149;
            int i151 = (i149 ^ i150) + ((i149 & i150) << 1);
            b = i151 % 128;
            if (i151 % 2 == 0) {
                int i152 = 23 / 0;
                if (zG) {
                    int i153 = i148 & 1;
                    int i154 = ((i148 ^ 1) | i153) << 1;
                    int i155 = -((i148 | 1) & (~i153));
                    i = (i154 ^ i155) + ((i154 & i155) << 1);
                    b = i % 128;
                    if (i % 2 != 0) {
                        Layout.Alignment alignment3 = Layout.Alignment.ALIGN_OPPOSITE;
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else if (zG) {
                int i156 = i148 & 1;
                int i157 = ((i148 ^ 1) | i156) << 1;
                int i158 = -((i148 | 1) & (~i156));
                i = (i157 ^ i158) + ((i157 & i158) << 1);
                b = i % 128;
                if (i % 2 != 0) {
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_OPPOSITE;
                    throw null;
                }
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint3, iMax);
            int i159 = a;
            int i160 = (((i159 | 28) << 1) - (i159 ^ 28)) - 1;
            b = i160 % 128;
            if (i160 % 2 == 0) {
                builderObtain.setAlignment(alignment2);
                builderObtain.setIncludePad(true);
            } else {
                builderObtain.setAlignment(alignment2);
                builderObtain.setIncludePad(false);
            }
            int i161 = a;
            int i162 = i161 + 91;
            b = i162 % 128;
            int i163 = i162 % 2;
            if (zG) {
                int i164 = i161 ^ 95;
                int i165 = ((i161 & 95) | i164) << 1;
                int i166 = -i164;
                int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                b = i167 % 128;
                int i168 = i167 % 2;
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
                int i169 = a;
                int i170 = ((i169 ^ 9) | (i169 & 9)) << 1;
                int i171 = -(((~i169) & 9) | (i169 & (-10)));
                int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                b = i172 % 128;
                if (i172 % 2 == 0) {
                    int i173 = 5 / 2;
                }
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            builderObtain.setTextDirection(textDirectionHeuristic);
            if (truncateAt2 != null) {
                int i174 = b;
                int i175 = ((i174 & (-56)) | ((~i174) & 55)) + ((i174 & 55) << 1);
                a = i175 % 128;
                if (i175 % 2 != 0) {
                    builderObtain.setEllipsize(truncateAt2);
                    try {
                        throw null;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } else {
                    builderObtain.setEllipsize(truncateAt2);
                    int i176 = a;
                    int i177 = (-2) - (((i176 ^ 94) + ((i176 & 94) << 1)) ^ (-1));
                    b = i177 % 128;
                    int i178 = i177 % 2;
                }
            }
            builderObtain.setMaxLines(1);
            staticLayoutBuild = builderObtain.build();
            int i179 = b;
            int i180 = i179 & 29;
            int i181 = i180 + ((i179 ^ 29) | i180);
            a = i181 % 128;
            int i182 = i181 % 2;
            Objects.requireNonNull(staticLayoutBuild);
            this.R = staticLayoutBuild;
            CharSequence text = staticLayoutBuild.getText();
            int i183 = b;
            int i184 = (i183 & 125) + (i183 | 125);
            a = i184 % 128;
            int i185 = i184 % 2;
            this.B = text;
            int i186 = i183 & 19;
            int i187 = (i183 ^ 19) | i186;
            int i188 = ((i186 | i187) << 1) - (i186 ^ i187);
            a = i188 % 128;
            int i189 = i188 % 2;
        } catch (OooOOO e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
    }

    public final void h(float f) {
        RectF rectF;
        Rect rect;
        int iL;
        ColorStateList colorStateList;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = -(-((i2 ^ 33) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            int i6 = this.i.left;
            int i7 = this.h.left;
            throw null;
        }
        RectF rectF2 = this.j;
        float f2 = this.i.left;
        float f3 = this.h.left;
        TimeInterpolator timeInterpolator = this.L;
        int i8 = b;
        int i9 = i8 & 77;
        int i10 = ((((i8 ^ 77) | i9) << 1) - (~(-((i8 | 77) & (~i9))))) - 1;
        a = i10 % 128;
        if (i10 % 2 != 0) {
            rectF2.left = d(f2, f3, f, timeInterpolator);
            this.j.top = d(this.f51o, this.q, f, this.L);
            rectF = this.j;
            rect = this.i;
            int i11 = 8 / 0;
        } else {
            rectF2.left = d(f2, f3, f, timeInterpolator);
            this.j.top = d(this.f51o, this.q, f, this.L);
            rectF = this.j;
            rect = this.i;
        }
        int i12 = b;
        int i13 = ((i12 & 8) + (i12 | 8)) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        rectF.right = d(rect.right, this.h.right, f, this.L);
        RectF rectF3 = this.j;
        int i15 = b;
        int i16 = i15 & 63;
        int i17 = -(-((i15 ^ 63) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        if (i18 % 2 != 0) {
            rectF3.bottom = d(this.i.bottom, this.h.bottom, f, this.L);
            obj.hashCode();
            throw null;
        }
        rectF3.bottom = d(this.i.bottom, this.h.bottom, f, this.L);
        this.s = d(this.r, this.t, f, this.L);
        float fD = d(this.f51o, this.q, f, this.L);
        int i19 = a;
        int i20 = ((i19 | 5) << 1) - (i19 ^ 5);
        b = i20 % 128;
        if (i20 % 2 == 0) {
            this.u = fD;
            q(d(this.l, this.m, f, this.I));
            TimeInterpolator timeInterpolator2 = ivas.gov.bisp.enumeration.T.j.d;
            obj.hashCode();
            throw null;
        }
        this.u = fD;
        q(d(this.l, this.m, f, this.I));
        TimeInterpolator timeInterpolator3 = ivas.gov.bisp.enumeration.T.j.d;
        this.T = 1.0f - d(0.0f, 1.0f, 1.0f - f, timeInterpolator3);
        View view = this.d;
        WeakHashMap<View, R> weakHashMap = T.c;
        T.aWX.l(view);
        int i21 = b + 25;
        a = i21 % 128;
        int i22 = i21 % 2;
        this.S = d(1.0f, 0.0f, f, timeInterpolator3);
        T.aWX.l(this.d);
        ColorStateList colorStateList2 = this.p;
        ColorStateList colorStateList3 = this.n;
        if (colorStateList2 != colorStateList3) {
            int i23 = b;
            int i24 = ((i23 ^ 7) | (i23 & 7)) << 1;
            int i25 = -(((~i23) & 7) | (i23 & (-8)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            TextPaint textPaint = this.J;
            int iL2 = l(colorStateList3);
            int iJ = j();
            int i28 = b;
            int i29 = ((i28 ^ 91) | (i28 & 91)) << 1;
            int i30 = -(((~i28) & 91) | (i28 & (-92)));
            int i31 = (i29 & i30) + (i30 | i29);
            a = i31 % 128;
            int i32 = i31 % 2;
            textPaint.setColor(c(iL2, iJ, f));
            int i33 = b;
            int i34 = i33 ^ 45;
            int i35 = -(-((i33 & 45) << 1));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            a = i36 % 128;
            int i37 = i36 % 2;
        } else {
            this.J.setColor(j());
            int i38 = b + 49;
            a = i38 % 128;
            int i39 = i38 % 2;
        }
        float f4 = this.Q;
        if (f4 != 0.0f) {
            int i40 = a;
            int i41 = (-2) - (((i40 & 2) + (i40 | 2)) ^ (-1));
            b = i41 % 128;
            int i42 = i41 % 2;
            TextPaint textPaint2 = this.J;
            float fD2 = d(0.0f, f4, f, timeInterpolator3);
            int i43 = b;
            int i44 = i43 & 41;
            int i45 = -(-((i43 ^ 41) | i44));
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            a = i46 % 128;
            if (i46 % 2 != 0) {
                textPaint2.setLetterSpacing(fD2);
                throw null;
            }
            textPaint2.setLetterSpacing(fD2);
        } else {
            this.J.setLetterSpacing(f4);
            int i47 = a;
            int i48 = i47 & 35;
            int i49 = i47 | 35;
            int i50 = (i48 & i49) + (i49 | i48);
            b = i50 % 128;
            int i51 = i50 % 2;
        }
        TextPaint textPaint3 = this.J;
        float f5 = this.M;
        int i52 = b;
        int i53 = ((i52 & 79) - (~(i52 | 79))) - 1;
        a = i53 % 128;
        int i54 = i53 % 2;
        float fD3 = d(0.0f, f5, f, null);
        float f6 = this.N;
        int i55 = a;
        int i56 = ((i55 ^ 67) | (i55 & 67)) << 1;
        int i57 = -(((~i55) & 67) | (i55 & (-68)));
        int i58 = (i56 & i57) + (i57 | i56);
        b = i58 % 128;
        int i59 = i58 % 2;
        float fD4 = d(0.0f, f6, f, null);
        float f7 = this.P;
        int i60 = a + 107;
        b = i60 % 128;
        float fD5 = d(i60 % 2 == 0 ? 2.0f : 0.0f, f7, f, null);
        int i61 = b + 109;
        a = i61 % 128;
        if (i61 % 2 != 0) {
            iL = l(null);
            colorStateList = this.O;
            int i62 = 20 / 0;
        } else {
            iL = l(null);
            colorStateList = this.O;
        }
        int i63 = b;
        int i64 = (((i63 | 6) << 1) - (i63 ^ 6)) - 1;
        a = i64 % 128;
        if (i64 % 2 != 0) {
            c(iL, l(colorStateList), f);
            obj.hashCode();
            throw null;
        }
        int iC = c(iL, l(colorStateList), f);
        int i65 = b;
        int i66 = ((((i65 ^ 19) | (i65 & 19)) << 1) - (~(-(((~i65) & 19) | (i65 & (-20)))))) - 1;
        a = i66 % 128;
        int i67 = i66 % 2;
        textPaint3.setShadowLayer(fD3, fD4, fD5, iC);
        int i68 = a;
        int i69 = (i68 & (-22)) | ((~i68) & 21);
        int i70 = (i68 & 21) << 1;
        int i71 = (i69 & i70) + (i70 | i69);
        b = i71 % 128;
        if (i71 % 2 != 0) {
            T.aWX.l(this.d);
        } else {
            T.aWX.l(this.d);
            throw null;
        }
    }
}
