package ivas.gov.bisp.enumeration.aL;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.p002ab.C0084m;

/* JADX INFO: loaded from: classes.dex */
public class r {
    private static int a = 1;
    private static int b;
    public final float c;
    public final ColorStateList d;
    public final String e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public ColorStateList l;
    public float m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Typeface f60o;
    public boolean p = false;

    public r(Context context, int i) {
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ivas.gov.bisp.enumeration.O.r.N);
        this.m = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.l = h.b(context, typedArrayObtainStyledAttributes, 3);
        h.b(context, typedArrayObtainStyledAttributes, 4);
        h.b(context, typedArrayObtainStyledAttributes, 5);
        this.f = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.g = typedArrayObtainStyledAttributes.getInt(1, 1);
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            i2 = 12;
        } else {
            int i4 = a + 102;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            i2 = 10;
        }
        this.n = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        int i7 = a + 61;
        b = i7 % 128;
        int i8 = i7 % 2;
        this.e = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        int i9 = a + 5;
        b = i9 % 128;
        this.d = h.b(context, typedArrayObtainStyledAttributes, i9 % 2 != 0 ? 117 : 6);
        int i10 = b;
        int i11 = i10 & 91;
        int i12 = (i10 ^ 91) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        a = i13 % 128;
        if (i13 % 2 == 0) {
            this.i = typedArrayObtainStyledAttributes.getFloat(114, 1.0f);
            i3 = 32;
            f = 2.0f;
        } else {
            this.i = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            i3 = 8;
            f = 0.0f;
        }
        int i14 = a;
        int i15 = ((i14 ^ 89) | (i14 & 89)) << 1;
        int i16 = -((89 & (~i14)) | (i14 & (-90)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        b = i17 % 128;
        if (i17 % 2 != 0) {
            this.h = typedArrayObtainStyledAttributes.getFloat(i3, f);
            f2 = typedArrayObtainStyledAttributes.getFloat(112, 2.0f);
        } else {
            this.h = typedArrayObtainStyledAttributes.getFloat(i3, f);
            f2 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        }
        int i18 = a;
        int i19 = i18 & 13;
        int i20 = i19 + ((i18 ^ 13) | i19);
        b = i20 % 128;
        int i21 = i20 % 2;
        this.j = f2;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, ivas.gov.bisp.enumeration.O.r.E);
        int i22 = a + 11;
        b = i22 % 128;
        if (i22 % 2 != 0) {
            this.k = typedArrayObtainStyledAttributes2.hasValue(0);
            f3 = typedArrayObtainStyledAttributes2.getFloat(0, 1.0f);
        } else {
            this.k = typedArrayObtainStyledAttributes2.hasValue(0);
            f3 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        }
        int i23 = a;
        int i24 = i23 & 97;
        int i25 = -(-((i23 ^ 97) | i24));
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        b = i26 % 128;
        int i27 = i26 % 2;
        this.c = f3;
        typedArrayObtainStyledAttributes2.recycle();
        int i28 = b;
        int i29 = i28 ^ 39;
        int i30 = (i28 & 39) << 1;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 12 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r2
  0x0020: PHI (r2v4 int) = (r2v3 int), (r2v37 int) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(Context context) {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = b;
        int i6 = (i5 & 49) + (i5 | 49);
        a = i6 % 128;
        boolean z = false;
        Typeface typefaceC = null;
        if (i6 % 2 == 0) {
            i = this.n;
            int i7 = 37 / 0;
            if (i != 0) {
                i2 = i;
                ThreadLocal<TypedValue> threadLocal = C0084m.c;
                if (context.isRestricted()) {
                    int i8 = b;
                    int i9 = i8 & 31;
                    int i10 = -(-((i8 ^ 31) | i9));
                    i3 = ((i9 | i10) << 1) - (i9 ^ i10);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i11 = 83 / 0;
                    }
                    int i12 = (((i8 | 62) << 1) - (i8 ^ 62)) - 1;
                    a = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    TypedValue typedValue = new TypedValue();
                    int i14 = a;
                    int i15 = ((i14 ^ 117) | (i14 & 117)) << 1;
                    int i16 = -(((~i14) & 117) | (i14 & (-118)));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    typefaceC = C0084m.c(context, i2, typedValue, 0, null, null, false, true);
                }
            }
        } else {
            i = this.n;
            if (i != 0) {
                i2 = i;
                ThreadLocal<TypedValue> threadLocal2 = C0084m.c;
                if (context.isRestricted()) {
                    int i19 = b;
                    int i20 = i19 & 31;
                    int i110 = -(-((i19 ^ 31) | i20));
                    i3 = ((i20 | i110) << 1) - (i20 ^ i110);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i111 = 83 / 0;
                    }
                    int i112 = (((i19 | 62) << 1) - (i19 ^ 62)) - 1;
                    a = i112 % 128;
                    int i113 = i112 % 2;
                } else {
                    TypedValue typedValue2 = new TypedValue();
                    int i114 = a;
                    int i115 = ((i114 ^ 117) | (i114 & 117)) << 1;
                    int i116 = -(((~i114) & 117) | (i114 & (-118)));
                    int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                    b = i117 % 128;
                    int i118 = i117 % 2;
                    typefaceC = C0084m.c(context, i2, typedValue2, 0, null, null, false, true);
                }
            }
        }
        int i21 = a;
        if (typefaceC != null) {
            int i22 = (((i21 | 100) << 1) - (i21 ^ 100)) - 1;
            int i23 = i22 % 128;
            b = i23;
            int i24 = i22 % 2;
            int i25 = (i23 & (-78)) | ((~i23) & 77);
            int i26 = -(-((i23 & 77) << 1));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            a = i27 % 128;
            int i28 = i27 % 2;
            z = true;
        } else {
            int i29 = i21 & 123;
            int i30 = i29 + ((i21 ^ 123) | i29);
            b = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = b;
        int i33 = (i32 ^ 115) + ((i32 & 115) << 1);
        a = i33 % 128;
        int i34 = i33 % 2;
        return z;
    }

    public void h(Context context, TextPaint textPaint, ivas.gov.bisp.enumeration.p096p.h hVar) {
        int colorForState;
        int colorForState2;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 65;
        int i4 = ((i2 ^ 65) | i3) << 1;
        int i5 = -((i2 | 65) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            g(context, textPaint, hVar);
            throw null;
        }
        g(context, textPaint, hVar);
        ColorStateList colorStateList = this.l;
        if (colorStateList != null) {
            int i7 = a;
            int i8 = ((i7 | 5) << 1) - (((~i7) & 5) | (i7 & (-6)));
            b = i8 % 128;
            if (i8 % 2 != 0) {
                colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
                throw null;
            }
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
            int i9 = b;
            int i10 = i9 & 49;
            int i11 = (i9 | 49) & (~i10);
            int i12 = -(-(i10 << 1));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            a = i13 % 128;
            int i14 = i13 % 2;
        } else {
            int i15 = a;
            int i16 = i15 & 123;
            int i17 = (((i15 | 123) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
            b = i17 % 128;
            int i18 = i17 % 2;
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        float f = this.j;
        int i19 = b;
        int i20 = i19 + 89;
        a = i20 % 128;
        if (i20 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f2 = this.i;
        float f3 = this.h;
        int i21 = ((i19 & (-84)) | ((~i19) & 83)) + ((i19 & 83) << 1);
        a = i21 % 128;
        if (i21 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ColorStateList colorStateList2 = this.d;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
            int i22 = a;
            int i23 = i22 & 67;
            int i24 = (i22 ^ 67) | i23;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            int i27 = ((i22 | 105) << 1) - (i22 ^ 105);
            b = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 5 / 3;
            }
        } else {
            int i29 = (i19 & (-90)) | ((~i19) & 89);
            int i30 = (i19 & 89) << 1;
            int i31 = (i29 & i30) + (i29 | i30);
            a = i31 % 128;
            int i32 = i31 % 2;
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, colorForState2);
        int i33 = b;
        int i34 = ((i33 & 108) + (i33 | 108)) - 1;
        a = i34 % 128;
        if (i34 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[PHI: r10
  0x0047: PHI (r10v5 int) = (r10v4 int), (r10v41 int) binds: [B:10:0x0045, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x005a A[PHI: r10
  0x005a: PHI (r10v37 int) = (r10v4 int), (r10v41 int) binds: [B:10:0x0045, B:7:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c5  */
    public void i(TextPaint textPaint, Typeface typeface) {
        int i;
        boolean z;
        float f;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 123;
        int i5 = (i3 | 123) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 & i6) + (i5 | i6);
        a = i7 % 128;
        if (i7 % 2 == 0) {
            textPaint.setTypeface(typeface);
            typeface.getStyle();
            throw null;
        }
        textPaint.setTypeface(typeface);
        int i8 = this.f;
        int style = typeface.getStyle();
        int i9 = a;
        int i10 = (i9 & 1) + (i9 | 1);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = ~style;
            int i12 = i11 & i8;
            i = ((i11 | i8) & (~i12)) | i12;
            if (i != 0) {
                int i13 = (((i9 & (-50)) | ((~i9) & 49)) - (~((i9 & 49) << 1))) - 1;
                b = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                int i15 = i9 & 45;
                int i16 = (i9 | 45) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                b = i18 % 128;
                int i19 = i18 % 2;
                z = false;
            }
        } else {
            i = (style | (~style)) & (~style) & i8;
            if ((i & 1) != 0) {
                int i110 = (((i9 & (-50)) | ((~i9) & 49)) - (~((i9 & 49) << 1))) - 1;
                b = i110 % 128;
                int i111 = i110 % 2;
                z = true;
            } else {
                int i112 = i9 & 45;
                int i113 = (i9 | 45) & (~i112);
                int i114 = -(-(i112 << 1));
                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                b = i115 % 128;
                int i116 = i115 % 2;
                z = false;
            }
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            int i20 = b + 77;
            int i21 = i20 % 128;
            a = i21;
            int i22 = i20 % 2;
            int i23 = (i21 ^ 121) + ((i21 & 121) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            f = -0.25f;
        } else {
            int i25 = b;
            int i26 = (((i25 | 74) << 1) - (i25 ^ 74)) - 1;
            a = i26 % 128;
            int i27 = i26 % 2;
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.m);
        int i28 = b;
        int i29 = (i28 & (-36)) | ((~i28) & 35);
        int i30 = (i28 & 35) << 1;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        a = i31 % 128;
        if (i31 % 2 == 0) {
            int i32 = 71 / 0;
            if (this.k) {
                textPaint.setLetterSpacing(this.c);
                int i33 = b;
                int i34 = (i33 & 21) + (i33 | 21);
                a = i34 % 128;
                int i35 = i34 % 2;
            }
        } else if (this.k) {
            textPaint.setLetterSpacing(this.c);
            int i36 = b;
            int i37 = (i36 & 21) + (i36 | 21);
            a = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = a;
        int i40 = ((i39 | 42) << 1) - (i39 ^ 42);
        int i41 = (i40 ^ (-1)) + (i40 << 1);
        b = i41 % 128;
        if (i41 % 2 != 0) {
            int i42 = 45 / 0;
        }
    }

    public Typeface d(Context context) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 119) + (i2 | 119);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.p) {
            int i4 = (i2 ^ 35) + ((i2 & 35) << 1);
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return this.f60o;
            }
            int i5 = 56 / 0;
            return this.f60o;
        }
        if (!context.isRestricted()) {
            int i6 = a;
            int i7 = i6 & 3;
            int i8 = ((i6 | 3) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            try {
                Typeface typefaceB = C0084m.b(context, this.n);
                this.f60o = typefaceB;
                int i10 = a;
                int i11 = i10 + 51;
                b = i11 % 128;
                int i12 = i11 % 2;
                if (typefaceB != null) {
                    int i13 = i10 & 103;
                    int i14 = i13 + ((i10 ^ 103) | i13);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    this.f60o = Typeface.create(typefaceB, this.f);
                    int i16 = a + 120;
                    int i17 = (i16 ^ (-1)) + (i16 << 1);
                    b = i17 % 128;
                    int i18 = i17 % 2;
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        c();
        this.p = true;
        Typeface typeface = this.f60o;
        int i19 = b;
        int i20 = (((i19 & (-12)) | ((~i19) & 11)) - (~((i19 & 11) << 1))) - 1;
        a = i20 % 128;
        if (i20 % 2 != 0) {
            return typeface;
        }
        obj.hashCode();
        throw null;
    }

    public class beX extends C0084m.aTa {
        private static int a = 0;
        private static int b = 1;
        public final /* synthetic */ ivas.gov.bisp.enumeration.p096p.h c;

        public beX(ivas.gov.bisp.enumeration.p096p.h hVar) {
            this.c = hVar;
        }

        @Override // ivas.gov.bisp.enumeration.p002ab.C0084m.aTa
        public void f(int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (i3 & 91) + (i3 | 91);
            a = i4 % 128;
            int i5 = i4 % 2;
            r.this.p = true;
            this.c.aH(i);
            int i6 = a;
            int i7 = ((i6 ^ 29) | (i6 & 29)) << 1;
            int i8 = -(((~i6) & 29) | (i6 & (-30)));
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.p002ab.C0084m.aTa
        public void g(Typeface typeface) {
            r rVar;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 89) | (i2 & 89)) << 1;
            int i4 = -(((~i2) & 89) | (i2 & (-90)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            r rVar2 = r.this;
            Typeface typefaceCreate = Typeface.create(typeface, rVar2.f);
            int i7 = a;
            int i8 = i7 & 109;
            int i9 = -(-((i7 ^ 109) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                rVar2.f60o = typefaceCreate;
                rVar = r.this;
                rVar.p = false;
            } else {
                rVar2.f60o = typefaceCreate;
                rVar = r.this;
                rVar.p = true;
            }
            ivas.gov.bisp.enumeration.p096p.h hVar = this.c;
            int i11 = a;
            int i12 = i11 & 77;
            int i13 = (i12 - (~((i11 ^ 77) | i12))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            hVar.aG(rVar.f60o, false);
            int i15 = a;
            int i16 = i15 & 31;
            int i17 = -(-((i15 ^ 31) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            if (i18 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void g(Context context, TextPaint textPaint, ivas.gov.bisp.enumeration.p096p.h hVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 119) + (i2 | 119);
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            f(context);
            obj.hashCode();
            throw null;
        }
        if (!f(context)) {
            c();
            i(textPaint, this.f60o);
            e eVar = new e(this, textPaint, hVar);
            int i4 = b;
            int i5 = i4 ^ 95;
            int i6 = (i4 & 95) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            e(context, eVar);
            int i9 = a;
            int i10 = ((i9 | 111) << 1) - (i9 ^ 111);
            b = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        int i12 = a;
        int i13 = i12 & 85;
        int i14 = (i13 - (~(-(-((i12 ^ 85) | i13))))) - 1;
        b = i14 % 128;
        int i15 = i14 % 2;
        i(textPaint, d(context));
        int i16 = b;
        int i17 = i16 & 41;
        int i18 = ((i16 ^ 41) | i17) << 1;
        int i19 = -((i16 | 41) & (~i17));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        a = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
    }

    public final void c() {
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = (((i3 ^ 29) | (i3 & 29)) << 1) - ((i3 & (-30)) | ((~i3) & 29));
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.f60o == null) {
            int i6 = i3 + 63;
            b = i6 % 128;
            int i7 = i6 % 2;
            String str = this.e;
            if (str != null) {
                int i8 = i3 & 9;
                int i9 = (i3 | 9) & (~i8);
                int i10 = i8 << 1;
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                b = i11 % 128;
                int i12 = i11 % 2;
                this.f60o = Typeface.create(str, this.f);
                int i13 = b;
                int i14 = ((i13 | 77) << 1) - (((~i13) & 77) | (i13 & (-78)));
                a = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        if (this.f60o == null) {
            int i16 = a;
            int i17 = (i16 & 3) + (i16 | 3);
            b = i17 % 128;
            if (i17 % 2 == 0 ? (i = this.g) == 1 : (i = this.g) == 1) {
                this.f60o = Typeface.SANS_SERIF;
                int i18 = b;
                int i19 = ((i18 | 19) << 1) - (i18 ^ 19);
                a = i19 % 128;
                int i20 = i19 % 2;
            } else if (i != 2) {
                int i21 = i16 + 51;
                b = i21 % 128;
                if (i21 % 2 == 0 ? i == 3 : i == 4) {
                    this.f60o = Typeface.MONOSPACE;
                    int i22 = b;
                    int i23 = ((i22 ^ 30) + ((i22 & 30) << 1)) - 1;
                    a = i23 % 128;
                    if (i23 % 2 == 0) {
                        int i24 = 2 / 3;
                    }
                } else {
                    this.f60o = Typeface.DEFAULT;
                    int i25 = b + 119;
                    a = i25 % 128;
                    int i26 = i25 % 2;
                }
            } else {
                this.f60o = Typeface.SERIF;
                int i27 = a;
                int i28 = ((i27 | 77) << 1) - (i27 ^ 77);
                b = i28 % 128;
                int i29 = i28 % 2;
            }
            Typeface typefaceCreate = Typeface.create(this.f60o, this.f);
            int i30 = a;
            int i31 = ((i30 ^ 35) | (i30 & 35)) << 1;
            int i32 = -((i30 & (-36)) | ((~i30) & 35));
            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
            b = i33 % 128;
            int i34 = i33 % 2;
            this.f60o = typefaceCreate;
            int i35 = i30 & 49;
            int i36 = (i30 ^ 49) | i35;
            int i37 = (i35 & i36) + (i35 | i36);
            b = i37 % 128;
            if (i37 % 2 != 0) {
                int i38 = 2 / 4;
            }
        }
        int i39 = a + 43;
        b = i39 % 128;
        if (i39 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r14.isRestricted() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r14.isRestricted() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r9.d(-4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        r14 = ivas.gov.bisp.enumeration.aL.r.b;
        r15 = (r14 ^ 57) + ((r14 & 57) << 1);
        ivas.gov.bisp.enumeration.aL.r.a = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if ((r15 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r14 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        r7 = new android.util.TypedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        r1 = ivas.gov.bisp.enumeration.aL.r.a;
        r2 = ((r1 & 63) - (~(r1 | 63))) - 1;
        ivas.gov.bisp.enumeration.aL.r.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        ivas.gov.bisp.enumeration.p002ab.C0084m.c(r14, r6, r7, 0, r9, null, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        r14 = ivas.gov.bisp.enumeration.aL.r.a;
        r15 = r14 & 95;
        r1 = -(-((r14 ^ 95) | r15));
        r2 = ((r15 | r1) << 1) - (r15 ^ r1);
        ivas.gov.bisp.enumeration.aL.r.b = r2 % 128;
        r2 = r2 % 2;
        r14 = r14 + 49;
        ivas.gov.bisp.enumeration.aL.r.b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.content.Context r14, ivas.gov.bisp.enumeration.p096p.h r15) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aL.r.e(android.content.Context, ivas.gov.bisp.enumeration.p.h):void");
    }
}
