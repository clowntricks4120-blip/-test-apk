package ivas.gov.bisp.enumeration.p088k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import ivas.gov.bisp.enumeration.OooOOoo.OooOO0O;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOO0;
import ivas.gov.bisp.enumeration.OooOOoo.OooOOOO;
import ivas.gov.bisp.enumeration.OooOOoo.OooOo00;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.cZ.p;
import ivas.gov.bisp.enumeration.p001aa.C0083p;
import ivas.gov.bisp.enumeration.p001aa.t;
import ivas.gov.bisp.enumeration.p001aa.u;
import ivas.gov.bisp.enumeration.p006af.h;
import ivas.gov.bisp.enumeration.p086i.l;
import ivas.gov.bisp.enumeration.p098t.c;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    private static int a = 0;
    private static int b = 1;
    public static K c;
    public static final PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    public static final aSA e;
    public WeakHashMap<Context, OooOo00<ColorStateList>> f;
    public OooOOOO<String, aSw> g;
    public OooOo00<String> h;
    public final WeakHashMap<Context, OooOO0O<WeakReference<Drawable.ConstantState>>> i = new WeakHashMap<>(0);
    public boolean j;
    public TypedValue k;
    public aRF l;

    public interface aRF {
    }

    public static class aSA extends OooOOO0<Integer, PorterDuffColorFilter> {
        public aSA(int i) {
            super(i);
        }
    }

    public static class aSB implements aSw {
        private static int a = 1;
        private static int b;

        @Override // ivas.gov.bisp.enumeration.k.K.aSw
        public Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 33;
            int i4 = (i3 << 1) - ((~(i2 & 33)) & i3);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                attributeSet.getClassAttribute();
                throw null;
            }
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                int i5 = b + 123;
                a = i5 % 128;
                try {
                    if (i5 % 2 == 0) {
                        aSB.class.getClassLoader().loadClass(classAttribute);
                        obj.hashCode();
                        throw null;
                    }
                    Class<?> clsLoadClass = aSB.class.getClassLoader().loadClass(classAttribute);
                    int i6 = b + 63;
                    a = i6 % 128;
                    int i7 = i6 % 2;
                    Class<? extends U> clsAsSubclass = clsLoadClass.asSubclass(Drawable.class);
                    Class<?>[] clsArr = new Class[0];
                    int i8 = a;
                    int i9 = ((i8 ^ 79) | (i8 & 79)) << 1;
                    int i10 = -(((~i8) & 79) | (i8 & (-80)));
                    int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    Drawable drawable = (Drawable) clsAsSubclass.getDeclaredConstructor(clsArr).newInstance(new Object[0]);
                    int i13 = a + 7;
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        c.d(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                        throw null;
                    }
                    c.d(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    int i14 = b;
                    int i15 = i14 & 7;
                    int i16 = (i14 ^ 7) | i15;
                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            int i19 = b;
            int i20 = i19 | 65;
            int i21 = (i20 << 1) - ((~(i19 & 65)) & i20);
            a = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
    }

    public static class aSC implements aSw {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.k.K.aSw
        public Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 61) | (i2 & 61)) << 1) - (((~i2) & 61) | (i2 & (-62)));
            a = i3 % 128;
            Object obj = null;
            try {
                if (i3 % 2 != 0) {
                    p.d(context.getResources(), xmlPullParser, attributeSet, theme);
                    obj.hashCode();
                    throw null;
                }
                p pVarD = p.d(context.getResources(), xmlPullParser, attributeSet, theme);
                int i4 = b;
                int i5 = i4 & 97;
                int i6 = (i4 ^ 97) | i5;
                int i7 = (i5 & i6) + (i6 | i5);
                a = i7 % 128;
                if (i7 % 2 == 0) {
                    return pVarD;
                }
                obj.hashCode();
                throw null;
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public interface aSw {
        Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static class aSx implements aSw {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.k.K.aSw
        public Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            int i = 2 % 2;
            int i2 = b + 85;
            a = i2 % 128;
            Object obj = null;
            try {
                if (i2 % 2 == 0) {
                    return ivas.gov.bisp.enumeration.p091n.c.i(context, context.getResources(), xmlPullParser, attributeSet, theme);
                }
                ivas.gov.bisp.enumeration.p091n.c.i(context, context.getResources(), xmlPullParser, attributeSet, theme);
                obj.hashCode();
                throw null;
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    static {
        aSA asa = new aSA(6);
        int i = a;
        int i2 = i & 3;
        int i3 = ((i ^ 3) | i2) << 1;
        int i4 = -((i | 3) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        b = i6;
        int i7 = i5 % 2;
        e = asa;
        int i8 = (((i6 & (-124)) | ((~i6) & 123)) - (~(-(-((i6 & 123) << 1))))) - 1;
        a = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static K c() {
        K k;
        synchronized (K.class) {
            if (c == null) {
                K k2 = new K();
                c = k2;
                e(k2);
            }
            k = c;
        }
        return k;
    }

    public static PorterDuffColorFilter d(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (K.class) {
            aSA asa = e;
            Objects.requireNonNull(asa);
            int i2 = i & 31;
            int i3 = (~i2) & (i | 31);
            int i4 = -(-(i2 << 1));
            int i5 = ((i3 & i4) + (i4 | i3)) * 31;
            int iHashCode = mode.hashCode();
            int i6 = -(-i5);
            porterDuffColorFilter = (PorterDuffColorFilter) asa.c(Integer.valueOf((iHashCode & i6) + (iHashCode | i6)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                Objects.requireNonNull(asa);
                int iHashCode2 = mode.hashCode();
                int i7 = iHashCode2 & i5;
                int i8 = -(-((iHashCode2 ^ i5) | i7));
            }
        }
        return porterDuffColorFilter;
    }

    public static void e(K k) {
        int i = 2 % 2;
        int i2 = b + 73;
        a = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT < 24 : Build.VERSION.SDK_INT < 23) {
            k.g("vector", new aSC());
            k.g("animated-vector", new aSy());
            k.g("animated-selector", new aSx());
            k.g("drawable", new aSB());
            int i3 = b + 1;
            a = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = b;
        int i6 = (-2) - (((i5 ^ 30) + ((i5 & 30) << 1)) ^ (-1));
        a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 42 / 0;
        }
    }

    public final ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        u uVar;
        synchronized (this) {
            WeakHashMap<Context, OooOo00<ColorStateList>> weakHashMap = this.f;
            ColorStateList colorStateListF = null;
            colorStateList = (weakHashMap == null || (uVar = weakHashMap.get(context)) == null) ? null : (ColorStateList) uVar.f(i, null);
            if (colorStateList == null) {
                aRF arf = this.l;
                if (arf != null) {
                    colorStateListF = ((P.aRH) arf).f(context, i);
                }
                if (colorStateListF != null) {
                    if (this.f == null) {
                        this.f = new WeakHashMap<>();
                    }
                    OooOo00<ColorStateList> uVar2 = (u) this.f.get(context);
                    if (uVar2 == null) {
                        uVar2 = new u<>();
                        this.f.put(context, uVar2);
                    }
                    uVar2.c(i, colorStateListF);
                }
                colorStateList = colorStateListF;
            }
        }
        return colorStateList;
    }

    public final void g(String str, aSw asw) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 29;
        int i4 = (((i2 ^ 29) | i3) << 1) - ((i2 | 29) & (~i3));
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.g == null) {
            this.g = new t();
            int i6 = a;
            int i7 = (((i6 | 121) << 1) - (~(-(i6 ^ 121)))) - 1;
            b = i7 % 128;
            int i8 = i7 % 2;
        }
        this.g.put(str, asw);
        int i9 = a;
        int i10 = (i9 | 101) << 1;
        int i11 = -(((~i9) & 101) | (i9 & (-102)));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final boolean h(Context context, long j, Drawable drawable) {
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            OooOO0O<WeakReference<Drawable.ConstantState>> c0083p = (C0083p) this.i.get(context);
            if (c0083p == null) {
                c0083p = new C0083p<>();
                this.i.put(context, c0083p);
            }
            c0083p.j(j, new WeakReference(constantState));
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x0108  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116 A[PHI: r10
  0x0116: PHI (r10v22 ivas.gov.bisp.enumeration.k.P$aRH) = (r10v12 ivas.gov.bisp.enumeration.k.P$aRH), (r10v31 ivas.gov.bisp.enumeration.k.P$aRH) binds: [B:23:0x00b7, B:20:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x011b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0134  */
    /* JADX WARN: Code duplicated, block: B:38:0x014f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0152  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    /* JADX WARN: Code duplicated, block: B:43:0x015c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0183  */
    /* JADX WARN: Code duplicated, block: B:46:0x0188  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    public final Drawable i(Context context, int i) {
        LayerDrawable layerDrawable;
        P.aRH arh;
        int i2;
        Drawable[] drawableArr;
        Drawable drawableJ;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = a;
        int i9 = i8 & 95;
        int i10 = (i8 | 95) & (~i9);
        int i11 = i9 << 1;
        int i12 = (i10 & i11) + (i10 | i11);
        b = i12 % 128;
        int i13 = i12 % 2;
        TypedValue typedValue = this.k;
        if (i13 == 0) {
            int i14 = 61 / 0;
            if (typedValue == null) {
                this.k = new TypedValue();
                int i15 = b;
                int i16 = (i15 & 9) + (i15 | 9);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
        } else if (typedValue == null) {
            this.k = new TypedValue();
            int i18 = b;
            int i19 = (i18 & 9) + (i18 | 9);
            a = i19 % 128;
            int i110 = i19 % 2;
        }
        TypedValue typedValue2 = this.k;
        Resources resources = context.getResources();
        int i20 = b;
        int i21 = ((i20 & (-40)) | ((~i20) & 39)) + ((i20 & 39) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        resources.getValue(i, typedValue2, true);
        long j = ((long) typedValue2.assetCookie) << 32;
        int i23 = a;
        int i24 = ((i23 & 88) + (i23 | 88)) - 1;
        b = i24 % 128;
        int i25 = i24 % 2;
        long j2 = j | ((long) typedValue2.data);
        Drawable drawableK = k(context, j2);
        if (drawableK != null) {
            int i26 = a;
            int i27 = ((i26 | 115) << 1) - (i26 ^ 115);
            int i28 = i27 % 128;
            b = i28;
            int i29 = i27 % 2;
            int i30 = i28 & 29;
            int i31 = (i28 | 29) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
            a = i33 % 128;
            if (i33 % 2 == 0) {
                return drawableK;
            }
            throw null;
        }
        aRF arf = this.l;
        if (arf != null) {
            int i34 = b;
            int i35 = i34 + 69;
            int i36 = i35 % 128;
            a = i36;
            if (i35 % 2 != 0) {
                arh = (P.aRH) arf;
                int i37 = 8 / 0;
                if (i == R.drawable.abc_cab_background_top_material) {
                    int i38 = i36 & 49;
                    int i39 = -(-((i36 ^ 49) | i38));
                    i2 = ((i38 | i39) << 1) - (i38 ^ i39);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        drawableArr = new Drawable[4];
                        drawableJ = j(context, R.drawable.abc_cab_background_internal_bg);
                        c2 = 1;
                    } else {
                        drawableArr = new Drawable[2];
                        drawableJ = j(context, R.drawable.abc_cab_background_internal_bg);
                        c2 = 0;
                    }
                    drawableArr[c2] = drawableJ;
                    drawableArr[1] = j(context, R.drawable.abc_cab_background_top_mtrl_alpha);
                    layerDrawable = new LayerDrawable(drawableArr);
                    int i40 = b;
                    int i41 = i40 & 109;
                    int i42 = ((i40 ^ 109) | i41) << 1;
                    int i43 = -((~i41) & (i40 | 109));
                    i3 = (i42 ^ i43) + ((i42 & i43) << 1);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i44 = 48 / 0;
                    }
                    int i45 = (i40 & 95) + (95 | i40);
                    a = i45 % 128;
                    int i46 = i45 % 2;
                } else if (i == R.drawable.abc_ratingbar_material) {
                    int i47 = (i34 & (-96)) | ((~i34) & 95);
                    int i48 = -(-((i34 & 95) << 1));
                    i5 = ((i47 | i48) << 1) - (i47 ^ i48);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        arh.e(this, context, R.dimen.abc_star_big);
                        throw null;
                    }
                    layerDrawable = arh.e(this, context, R.dimen.abc_star_big);
                    int i49 = a;
                    int i50 = i49 & 25;
                    i6 = ((((i49 ^ 25) | i50) << 1) - (~(-((i49 | 25) & (~i50))))) - 1;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i51 = 3 / 3;
                    }
                } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                    int i52 = (i34 & 85) + (i34 | 85);
                    a = i52 % 128;
                    int i53 = i52 % 2;
                    layerDrawable = arh.e(this, context, R.dimen.abc_star_medium);
                    int i54 = b;
                    int i55 = (i54 & (-50)) | ((~i54) & 49);
                    int i56 = -(-((i54 & 49) << 1));
                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                    a = i57 % 128;
                    int i58 = i57 % 2;
                } else if (i == R.drawable.abc_ratingbar_small_material) {
                    int i59 = i36 | 19;
                    int i60 = i59 << 1;
                    int i61 = -(i59 & (~(i36 & 19)));
                    i4 = ((i60 | i61) << 1) - (i61 ^ i60);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        arh.e(this, context, R.dimen.abc_star_small);
                        throw null;
                    }
                    layerDrawable = arh.e(this, context, R.dimen.abc_star_small);
                } else {
                    layerDrawable = null;
                }
            } else {
                arh = (P.aRH) arf;
                if (i == R.drawable.abc_cab_background_top_material) {
                    int i310 = i36 & 49;
                    int i311 = -(-((i36 ^ 49) | i310));
                    i2 = ((i310 | i311) << 1) - (i310 ^ i311);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        drawableArr = new Drawable[4];
                        drawableJ = j(context, R.drawable.abc_cab_background_internal_bg);
                        c2 = 1;
                    } else {
                        drawableArr = new Drawable[2];
                        drawableJ = j(context, R.drawable.abc_cab_background_internal_bg);
                        c2 = 0;
                    }
                    drawableArr[c2] = drawableJ;
                    drawableArr[1] = j(context, R.drawable.abc_cab_background_top_mtrl_alpha);
                    layerDrawable = new LayerDrawable(drawableArr);
                    int i410 = b;
                    int i411 = i410 & 109;
                    int i412 = ((i410 ^ 109) | i411) << 1;
                    int i413 = -((~i411) & (i410 | 109));
                    i3 = (i412 ^ i413) + ((i412 & i413) << 1);
                    a = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i414 = 48 / 0;
                    }
                    int i415 = (i410 & 95) + (95 | i410);
                    a = i415 % 128;
                    int i416 = i415 % 2;
                } else if (i == R.drawable.abc_ratingbar_material) {
                    int i417 = (i34 & (-96)) | ((~i34) & 95);
                    int i418 = -(-((i34 & 95) << 1));
                    i5 = ((i417 | i418) << 1) - (i417 ^ i418);
                    a = i5 % 128;
                    if (i5 % 2 == 0) {
                        arh.e(this, context, R.dimen.abc_star_big);
                        throw null;
                    }
                    layerDrawable = arh.e(this, context, R.dimen.abc_star_big);
                    int i419 = a;
                    int i510 = i419 & 25;
                    i6 = ((((i419 ^ 25) | i510) << 1) - (~(-((i419 | 25) & (~i510))))) - 1;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i511 = 3 / 3;
                    }
                } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                    int i512 = (i34 & 85) + (i34 | 85);
                    a = i512 % 128;
                    int i513 = i512 % 2;
                    layerDrawable = arh.e(this, context, R.dimen.abc_star_medium);
                    int i514 = b;
                    int i515 = (i514 & (-50)) | ((~i514) & 49);
                    int i516 = -(-((i514 & 49) << 1));
                    int i517 = ((i515 | i516) << 1) - (i516 ^ i515);
                    a = i517 % 128;
                    int i518 = i517 % 2;
                } else if (i == R.drawable.abc_ratingbar_small_material) {
                    int i519 = i36 | 19;
                    int i62 = i519 << 1;
                    int i63 = -(i519 & (~(i36 & 19)));
                    i4 = ((i62 | i63) << 1) - (i63 ^ i62);
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        arh.e(this, context, R.dimen.abc_star_small);
                        throw null;
                    }
                    layerDrawable = arh.e(this, context, R.dimen.abc_star_small);
                } else {
                    layerDrawable = null;
                }
            }
        } else {
            layerDrawable = null;
        }
        if (layerDrawable != null) {
            int i64 = a + 43;
            b = i64 % 128;
            int i65 = i64 % 2;
            layerDrawable.setChangingConfigurations(typedValue2.changingConfigurations);
            int i66 = a + 21;
            b = i66 % 128;
            if (i66 % 2 == 0) {
                h(context, j2, layerDrawable);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            h(context, j2, layerDrawable);
        }
        int i67 = b;
        int i68 = i67 & 21;
        int i69 = ((i67 | 21) & (~i68)) + (i68 << 1);
        a = i69 % 128;
        int i70 = i69 % 2;
        return layerDrawable;
    }

    public final Drawable j(Context context, int i) {
        Drawable drawableL;
        synchronized (this) {
            drawableL = l(context, i, false);
        }
        return drawableL;
    }

    public final Drawable k(Context context, long j) {
        synchronized (this) {
            C0083p c0083p = this.i.get(context);
            if (c0083p == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) c0083p.h(j, null);
            if (weakReference != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                int iF = h.f(c0083p.e, c0083p.g, j);
                if (iF >= 0) {
                    Object[] objArr = c0083p.f;
                    Object obj = objArr[iF];
                    Object obj2 = C0083p.c;
                    if (obj != obj2) {
                        objArr[iF] = obj2;
                        c0083p.d = true;
                    }
                }
            }
            return null;
        }
    }

    public final Drawable l(Context context, int i, boolean z) {
        Drawable drawableM;
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                Drawable drawableJ = j(context, R.drawable.abc_vector_test);
                if (drawableJ == null || (!(drawableJ instanceof p) && !"android.graphics.drawable.VectorDrawable".equals(drawableJ.getClass().getName()))) {
                    this.j = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM = m(context, i);
            if (drawableM == null) {
                drawableM = i(context, i);
            }
            if (drawableM == null) {
                Object obj = l.c;
                drawableM = l.aUH.c(context, i);
            }
            if (drawableM != null) {
                drawableM = n(context, i, z, drawableM);
            }
            if (drawableM != null) {
                W.c(drawableM);
            }
        }
        return drawableM;
    }

    public static class aSy implements aSw {
        private static int a = 0;
        private static int b = 1;

        @Override // ivas.gov.bisp.enumeration.k.K.aSw
        public Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            int i = 2 % 2;
            Object obj = null;
            try {
                Resources resources = context.getResources();
                ivas.gov.bisp.enumeration.cZ.h hVar = new ivas.gov.bisp.enumeration.cZ.h(context, null, null);
                int i2 = a + 31;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    hVar.inflate(resources, xmlPullParser, attributeSet, theme);
                    obj.hashCode();
                    throw null;
                }
                hVar.inflate(resources, xmlPullParser, attributeSet, theme);
                int i3 = a;
                int i4 = i3 & 95;
                int i5 = ((i3 ^ 95) | i4) << 1;
                int i6 = -((i3 | 95) & (~i4));
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    return hVar;
                }
                obj.hashCode();
                throw null;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r18.g.getOrDefault(r4, null) == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r18.g.getOrDefault(r4, null) == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m(android.content.Context r19, int r20) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.p088k.K.m(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:29:0x010d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0111  */
    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:39:0x0174  */
    /* JADX WARN: Code duplicated, block: B:40:0x0186  */
    /* JADX WARN: Code duplicated, block: B:42:0x0198  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01db  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x020d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0217  */
    public final boolean o(Context context, int i, Drawable drawable) {
        boolean z;
        int i2;
        int iRound;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = (i9 | 39) << 1;
        int i11 = -(i9 ^ 39);
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        a = i12 % 128;
        int i13 = i12 % 2;
        aRF arf = this.l;
        if (arf != null) {
            int i14 = (i9 ^ 1) + ((i9 & 1) << 1);
            a = i14 % 128;
            if (i14 % 2 != 0) {
                Objects.requireNonNull((P.aRH) arf);
                PorterDuff.Mode mode = P.c;
                throw null;
            }
            P.aRH arh = (P.aRH) arf;
            Objects.requireNonNull(arh);
            PorterDuff.Mode mode2 = P.c;
            int i15 = b;
            int i16 = (((i15 ^ 19) | (i15 & 19)) << 1) - (((~i15) & 19) | (i15 & (-20)));
            a = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 6 / 0;
                if (arh.c(arh.c, i)) {
                    int i18 = b;
                    int i19 = i18 ^ 53;
                    int i20 = (((i18 & 53) | i19) << 1) - i19;
                    int i21 = i20 % 128;
                    a = i21;
                    int i22 = i20 % 2;
                    int i23 = i21 + 79;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    i2 = R.attr.colorControlNormal;
                } else if (arh.c(arh.e, i)) {
                    int i25 = a;
                    int i26 = i25 ^ 53;
                    int i27 = ((i25 & 53) | i26) << 1;
                    int i28 = -i26;
                    int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                    int i30 = i29 % 128;
                    b = i30;
                    int i31 = i29 % 2;
                    int i32 = i30 & 123;
                    i7 = i32 + ((i30 ^ 123) | i32);
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i33 = 4 / 3;
                    }
                    i2 = R.attr.colorControlActivated;
                } else {
                    if (!(!arh.c(arh.f, i))) {
                        int i34 = a;
                        int i35 = i34 ^ 57;
                        int i36 = ((i34 & 57) | i35) << 1;
                        int i37 = -i35;
                        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        mode2 = PorterDuff.Mode.MULTIPLY;
                        int i40 = a;
                        int i41 = (i40 | 19) << 1;
                        int i42 = -(i40 ^ 19);
                        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                        b = i43 % 128;
                        int i44 = i43 % 2;
                    } else {
                        if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                            int i45 = b;
                            i6 = (i45 ^ 83) + ((i45 & 83) << 1);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                Math.round(40.8f);
                                throw null;
                            }
                            iRound = Math.round(40.8f);
                            int i46 = a;
                            int i47 = (((i46 ^ 11) | (i46 & 11)) << 1) - (((~i46) & 11) | (i46 & (-12)));
                            b = i47 % 128;
                            int i48 = i47 % 2;
                            i3 = android.R.attr.colorForeground;
                            int i49 = b;
                            int i50 = ((i49 & (-64)) | ((~i49) & 63)) + ((i49 & 63) << 1);
                            a = i50 % 128;
                            int i51 = i50 % 2;
                            z2 = true;
                        } else if (i == R.drawable.abc_dialog_material_background) {
                            int i52 = b;
                            int i53 = ((i52 ^ 33) | (i52 & 33)) << 1;
                            int i54 = -((i52 & (-34)) | ((~i52) & 33));
                            int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                            a = i55 % 128;
                            int i56 = i55 % 2;
                            int i57 = (i52 & 41) + (i52 | 41);
                            a = i57 % 128;
                            int i58 = i57 % 2;
                        } else {
                            int i59 = b;
                            int i60 = ((i59 | 117) << 1) - (i59 ^ 117);
                            a = i60 % 128;
                            int i61 = i60 % 2;
                            i3 = 0;
                            z2 = false;
                            iRound = -1;
                        }
                        if (!z2) {
                            int i62 = b;
                            int i63 = i62 & 107;
                            int i64 = ((i62 | 107) & (~i63)) + (i63 << 1);
                            a = i64 % 128;
                            int i65 = i64 % 2;
                            z3 = false;
                        } else {
                            int i66 = b;
                            int i67 = i66 & 61;
                            int i68 = (i66 ^ 61) | i67;
                            i4 = (i67 & i68) + (i68 | i67);
                            a = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i69 = 36 / 0;
                                if (W.b(drawable)) {
                                    drawable = drawable.mutate();
                                    int i70 = b;
                                    int i71 = (((i70 ^ 79) | (i70 & 79)) << 1) - (((~i70) & 79) | (i70 & (-80)));
                                    a = i71 % 128;
                                    int i72 = i71 % 2;
                                }
                            } else if (W.b(drawable)) {
                                drawable = drawable.mutate();
                                int i73 = b;
                                int i74 = (((i73 ^ 79) | (i73 & 79)) << 1) - (((~i73) & 79) | (i73 & (-80)));
                                a = i74 % 128;
                                int i75 = i74 % 2;
                            }
                            PorterDuffColorFilter porterDuffColorFilterD = P.d(ad.d(context, i3), mode2);
                            int i76 = b;
                            int i77 = ((i76 ^ 50) + ((i76 & 50) << 1)) - 1;
                            a = i77 % 128;
                            int i78 = i77 % 2;
                            drawable.setColorFilter(porterDuffColorFilterD);
                            if (iRound != -1) {
                                int i79 = a + 97;
                                b = i79 % 128;
                                int i80 = i79 % 2;
                                drawable.setAlpha(iRound);
                                int i81 = b;
                                int i82 = i81 & 67;
                                i5 = i82 + ((i81 ^ 67) | i82);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i83 = 5 / 5;
                                }
                            }
                            int i84 = b;
                            int i85 = i84 & 1;
                            int i86 = -(-((i84 ^ 1) | i85));
                            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                            a = i87 % 128;
                            int i88 = i87 % 2;
                            z3 = true;
                        }
                        if (z3) {
                            z = true;
                        } else {
                            int i89 = b + 111;
                            a = i89 % 128;
                            int i90 = i89 % 2;
                            z = false;
                        }
                    }
                    i2 = 16842801;
                }
                int i91 = a;
                int i92 = i91 & 93;
                int i93 = (i92 - (~(-(-((i91 ^ 93) | i92))))) - 1;
                b = i93 % 128;
                int i94 = i93 % 2;
                i3 = i2;
                iRound = -1;
                int i410 = b;
                int i510 = ((i410 & (-64)) | ((~i410) & 63)) + ((i410 & 63) << 1);
                a = i510 % 128;
                int i511 = i510 % 2;
                z2 = true;
                if (!z2) {
                    int i610 = b;
                    int i611 = i610 & 107;
                    int i612 = ((i610 | 107) & (~i611)) + (i611 << 1);
                    a = i612 % 128;
                    int i613 = i612 % 2;
                    z3 = false;
                } else {
                    int i614 = b;
                    int i615 = i614 & 61;
                    int i616 = (i614 ^ 61) | i615;
                    i4 = (i615 & i616) + (i616 | i615);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i617 = 36 / 0;
                        if (W.b(drawable)) {
                            drawable = drawable.mutate();
                            int i710 = b;
                            int i711 = (((i710 ^ 79) | (i710 & 79)) << 1) - (((~i710) & 79) | (i710 & (-80)));
                            a = i711 % 128;
                            int i712 = i711 % 2;
                        }
                    } else if (W.b(drawable)) {
                        drawable = drawable.mutate();
                        int i713 = b;
                        int i714 = (((i713 ^ 79) | (i713 & 79)) << 1) - (((~i713) & 79) | (i713 & (-80)));
                        a = i714 % 128;
                        int i715 = i714 % 2;
                    }
                    PorterDuffColorFilter porterDuffColorFilterD2 = P.d(ad.d(context, i3), mode2);
                    int i716 = b;
                    int i717 = ((i716 ^ 50) + ((i716 & 50) << 1)) - 1;
                    a = i717 % 128;
                    int i718 = i717 % 2;
                    drawable.setColorFilter(porterDuffColorFilterD2);
                    if (iRound != -1) {
                        int i719 = a + 97;
                        b = i719 % 128;
                        int i810 = i719 % 2;
                        drawable.setAlpha(iRound);
                        int i811 = b;
                        int i812 = i811 & 67;
                        i5 = i812 + ((i811 ^ 67) | i812);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i813 = 5 / 5;
                        }
                    }
                    int i814 = b;
                    int i815 = i814 & 1;
                    int i816 = -(-((i814 ^ 1) | i815));
                    int i817 = ((i815 | i816) << 1) - (i816 ^ i815);
                    a = i817 % 128;
                    int i818 = i817 % 2;
                    z3 = true;
                }
                if (z3) {
                    z = true;
                } else {
                    int i819 = b + 111;
                    a = i819 % 128;
                    int i95 = i819 % 2;
                    z = false;
                }
            } else {
                if (!(!arh.c(arh.c, i))) {
                    int i110 = b;
                    int i111 = i110 ^ 53;
                    int i210 = (((i110 & 53) | i111) << 1) - i111;
                    int i211 = i210 % 128;
                    a = i211;
                    int i212 = i210 % 2;
                    int i213 = i211 + 79;
                    b = i213 % 128;
                    int i214 = i213 % 2;
                    i2 = R.attr.colorControlNormal;
                } else if (arh.c(arh.e, i)) {
                    int i215 = a;
                    int i216 = i215 ^ 53;
                    int i217 = ((i215 & 53) | i216) << 1;
                    int i218 = -i216;
                    int i219 = ((i217 | i218) << 1) - (i217 ^ i218);
                    int i310 = i219 % 128;
                    b = i310;
                    int i311 = i219 % 2;
                    int i312 = i310 & 123;
                    i7 = i312 + ((i310 ^ 123) | i312);
                    a = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i313 = 4 / 3;
                    }
                    i2 = R.attr.colorControlActivated;
                } else {
                    if (!(!arh.c(arh.f, i))) {
                        int i314 = a;
                        int i315 = i314 ^ 57;
                        int i316 = ((i314 & 57) | i315) << 1;
                        int i317 = -i315;
                        int i318 = (i316 ^ i317) + ((i316 & i317) << 1);
                        b = i318 % 128;
                        int i319 = i318 % 2;
                        mode2 = PorterDuff.Mode.MULTIPLY;
                        int i411 = a;
                        int i412 = (i411 | 19) << 1;
                        int i413 = -(i411 ^ 19);
                        int i414 = (i412 ^ i413) + ((i413 & i412) << 1);
                        b = i414 % 128;
                        int i415 = i414 % 2;
                    } else {
                        if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                            int i416 = b;
                            i6 = (i416 ^ 83) + ((i416 & 83) << 1);
                            a = i6 % 128;
                            if (i6 % 2 == 0) {
                                Math.round(40.8f);
                                throw null;
                            }
                            iRound = Math.round(40.8f);
                            int i417 = a;
                            int i418 = (((i417 ^ 11) | (i417 & 11)) << 1) - (((~i417) & 11) | (i417 & (-12)));
                            b = i418 % 128;
                            int i419 = i418 % 2;
                            i3 = android.R.attr.colorForeground;
                            int i4110 = b;
                            int i512 = ((i4110 & (-64)) | ((~i4110) & 63)) + ((i4110 & 63) << 1);
                            a = i512 % 128;
                            int i513 = i512 % 2;
                            z2 = true;
                        } else if (i == R.drawable.abc_dialog_material_background) {
                            int i514 = b;
                            int i515 = ((i514 ^ 33) | (i514 & 33)) << 1;
                            int i516 = -((i514 & (-34)) | ((~i514) & 33));
                            int i517 = (i515 ^ i516) + ((i515 & i516) << 1);
                            a = i517 % 128;
                            int i518 = i517 % 2;
                            int i519 = (i514 & 41) + (i514 | 41);
                            a = i519 % 128;
                            int i520 = i519 % 2;
                        } else {
                            int i521 = b;
                            int i618 = ((i521 | 117) << 1) - (i521 ^ 117);
                            a = i618 % 128;
                            int i619 = i618 % 2;
                            i3 = 0;
                            z2 = false;
                            iRound = -1;
                        }
                        if (!z2) {
                            int i6110 = b;
                            int i6111 = i6110 & 107;
                            int i6112 = ((i6110 | 107) & (~i6111)) + (i6111 << 1);
                            a = i6112 % 128;
                            int i6113 = i6112 % 2;
                            z3 = false;
                        } else {
                            int i6114 = b;
                            int i6115 = i6114 & 61;
                            int i6116 = (i6114 ^ 61) | i6115;
                            i4 = (i6115 & i6116) + (i6116 | i6115);
                            a = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i6117 = 36 / 0;
                                if (W.b(drawable)) {
                                    drawable = drawable.mutate();
                                    int i7110 = b;
                                    int i7111 = (((i7110 ^ 79) | (i7110 & 79)) << 1) - (((~i7110) & 79) | (i7110 & (-80)));
                                    a = i7111 % 128;
                                    int i7112 = i7111 % 2;
                                }
                            } else if (W.b(drawable)) {
                                drawable = drawable.mutate();
                                int i7113 = b;
                                int i7114 = (((i7113 ^ 79) | (i7113 & 79)) << 1) - (((~i7113) & 79) | (i7113 & (-80)));
                                a = i7114 % 128;
                                int i7115 = i7114 % 2;
                            }
                            PorterDuffColorFilter porterDuffColorFilterD3 = P.d(ad.d(context, i3), mode2);
                            int i7116 = b;
                            int i7117 = ((i7116 ^ 50) + ((i7116 & 50) << 1)) - 1;
                            a = i7117 % 128;
                            int i7118 = i7117 % 2;
                            drawable.setColorFilter(porterDuffColorFilterD3);
                            if (iRound != -1) {
                                int i7119 = a + 97;
                                b = i7119 % 128;
                                int i8110 = i7119 % 2;
                                drawable.setAlpha(iRound);
                                int i8111 = b;
                                int i8112 = i8111 & 67;
                                i5 = i8112 + ((i8111 ^ 67) | i8112);
                                a = i5 % 128;
                                if (i5 % 2 != 0) {
                                    int i8113 = 5 / 5;
                                }
                            }
                            int i8114 = b;
                            int i8115 = i8114 & 1;
                            int i8116 = -(-((i8114 ^ 1) | i8115));
                            int i8117 = ((i8115 | i8116) << 1) - (i8116 ^ i8115);
                            a = i8117 % 128;
                            int i8118 = i8117 % 2;
                            z3 = true;
                        }
                        if (z3) {
                            z = true;
                        } else {
                            int i8119 = b + 111;
                            a = i8119 % 128;
                            int i96 = i8119 % 2;
                            z = false;
                        }
                    }
                    i2 = 16842801;
                }
                int i97 = a;
                int i98 = i97 & 93;
                int i99 = (i98 - (~(-(-((i97 ^ 93) | i98))))) - 1;
                b = i99 % 128;
                int i910 = i99 % 2;
                i3 = i2;
                iRound = -1;
                int i4111 = b;
                int i5110 = ((i4111 & (-64)) | ((~i4111) & 63)) + ((i4111 & 63) << 1);
                a = i5110 % 128;
                int i5111 = i5110 % 2;
                z2 = true;
                if (!z2) {
                    int i6118 = b;
                    int i6119 = i6118 & 107;
                    int i61110 = ((i6118 | 107) & (~i6119)) + (i6119 << 1);
                    a = i61110 % 128;
                    int i61111 = i61110 % 2;
                    z3 = false;
                } else {
                    int i61112 = b;
                    int i61113 = i61112 & 61;
                    int i61114 = (i61112 ^ 61) | i61113;
                    i4 = (i61113 & i61114) + (i61114 | i61113);
                    a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i61115 = 36 / 0;
                        if (W.b(drawable)) {
                            drawable = drawable.mutate();
                            int i71110 = b;
                            int i71111 = (((i71110 ^ 79) | (i71110 & 79)) << 1) - (((~i71110) & 79) | (i71110 & (-80)));
                            a = i71111 % 128;
                            int i71112 = i71111 % 2;
                        }
                    } else if (W.b(drawable)) {
                        drawable = drawable.mutate();
                        int i71113 = b;
                        int i71114 = (((i71113 ^ 79) | (i71113 & 79)) << 1) - (((~i71113) & 79) | (i71113 & (-80)));
                        a = i71114 % 128;
                        int i71115 = i71114 % 2;
                    }
                    PorterDuffColorFilter porterDuffColorFilterD4 = P.d(ad.d(context, i3), mode2);
                    int i71116 = b;
                    int i71117 = ((i71116 ^ 50) + ((i71116 & 50) << 1)) - 1;
                    a = i71117 % 128;
                    int i71118 = i71117 % 2;
                    drawable.setColorFilter(porterDuffColorFilterD4);
                    if (iRound != -1) {
                        int i71119 = a + 97;
                        b = i71119 % 128;
                        int i81110 = i71119 % 2;
                        drawable.setAlpha(iRound);
                        int i81111 = b;
                        int i81112 = i81111 & 67;
                        i5 = i81112 + ((i81111 ^ 67) | i81112);
                        a = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i81113 = 5 / 5;
                        }
                    }
                    int i81114 = b;
                    int i81115 = i81114 & 1;
                    int i81116 = -(-((i81114 ^ 1) | i81115));
                    int i81117 = ((i81115 | i81116) << 1) - (i81116 ^ i81115);
                    a = i81117 % 128;
                    int i81118 = i81117 % 2;
                    z3 = true;
                }
                if (z3) {
                    z = true;
                } else {
                    int i81119 = b + 111;
                    a = i81119 % 128;
                    int i911 = i81119 % 2;
                    z = false;
                }
            }
        } else {
            int i811110 = b + 111;
            a = i811110 % 128;
            int i912 = i811110 % 2;
            z = false;
        }
        int i100 = b;
        int i101 = (i100 ^ 93) + ((i100 & 93) << 1);
        a = i101 % 128;
        if (i101 % 2 != 0) {
            int i102 = 85 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x030d  */
    public final Drawable n(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        Drawable drawableMutate;
        int iD;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = i4 & 107;
        int i6 = ((i4 ^ 107) | i5) << 1;
        int i7 = -((i4 | 107) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        ColorStateList colorStateListF = f(context, i);
        PorterDuff.Mode mode3 = null;
        if (colorStateListF != null) {
            int i10 = a + 51;
            b = i10 % 128;
            int i11 = i10 % 2;
            if (W.b(drawable)) {
                int i12 = a;
                int i13 = ((i12 & 12) + (i12 | 12)) - 1;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    drawable.mutate();
                    throw null;
                }
                drawableMutate = drawable.mutate();
                int i14 = b + 89;
                a = i14 % 128;
                int i15 = i14 % 2;
            } else {
                drawableMutate = drawable;
            }
            drawableMutate.setTintList(colorStateListF);
            if (this.l == null) {
                int i16 = a;
                int i17 = ((i16 | 29) << 1) - (i16 ^ 29);
                b = i17 % 128;
                if (i17 % 2 == 0) {
                    mode3.hashCode();
                    throw null;
                }
                int i18 = (i16 & (-122)) | ((~i16) & 121);
                int i19 = -(-((i16 & 121) << 1));
                int i20 = (i18 & i19) + (i19 | i18);
                b = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 2 / 2;
                }
            } else if (i == R.drawable.abc_switch_thumb_material) {
                int i22 = b;
                int i23 = i22 & 121;
                int i24 = ((((i22 ^ 121) | i23) << 1) - (~(-((i22 | 121) & (~i23))))) - 1;
                a = i24 % 128;
                if (i24 % 2 != 0) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                    int i25 = 13 / 0;
                } else {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                }
                mode3 = mode2;
                int i26 = b;
                int i27 = ((i26 | 119) << 1) - (i26 ^ 119);
                a = i27 % 128;
                int i28 = i27 % 2;
            }
            if (mode3 != null) {
                int i29 = b;
                int i30 = (((i29 ^ 57) | (i29 & 57)) << 1) - (((~i29) & 57) | (i29 & (-58)));
                a = i30 % 128;
                int i31 = i30 % 2;
                drawableMutate.setTintMode(mode3);
                int i32 = b + 55;
                a = i32 % 128;
                int i33 = i32 % 2;
            }
        } else {
            aRF arf = this.l;
            if (arf != null) {
                int i34 = a;
                int i35 = ((i34 | 123) << 1) - (i34 ^ 123);
                int i36 = i35 % 128;
                b = i36;
                int i37 = i35 % 2;
                P.aRH arh = (P.aRH) arf;
                if (i == R.drawable.abc_seekbar_track_material) {
                    int i38 = i36 ^ 93;
                    int i39 = (i36 & 93) << 1;
                    int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                    a = i40 % 128;
                    int i41 = i40 % 2;
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int i42 = b;
                    int i43 = (i42 | 45) << 1;
                    int i44 = -(i42 ^ 45);
                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                    a = i45 % 128;
                    if (i45 % 2 != 0) {
                        iD = ad.d(context, R.attr.colorControlNormal);
                        mode = P.c;
                        int i46 = 66 / 0;
                    } else {
                        iD = ad.d(context, R.attr.colorControlNormal);
                        mode = P.c;
                    }
                    arh.g(drawableFindDrawableByLayerId, iD, mode);
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress);
                    int i47 = a;
                    int i48 = (i47 & 95) + (i47 | 95);
                    b = i48 % 128;
                    int i49 = i48 % 2;
                    int iD2 = ad.d(context, R.attr.colorControlNormal);
                    int i50 = a;
                    int i51 = i50 & 43;
                    int i52 = (i50 ^ 43) | i51;
                    int i53 = (i51 & i52) + (i52 | i51);
                    b = i53 % 128;
                    if (i53 % 2 == 0) {
                        arh.g(drawableFindDrawableByLayerId2, iD2, mode);
                        layerDrawable.findDrawableByLayerId(android.R.id.progress);
                        mode3.hashCode();
                        throw null;
                    }
                    arh.g(drawableFindDrawableByLayerId2, iD2, mode);
                    Drawable drawableFindDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(android.R.id.progress);
                    int i54 = a;
                    int i55 = ((i54 ^ 69) | (i54 & 69)) << 1;
                    int i56 = -(((~i54) & 69) | (i54 & (-70)));
                    int i57 = (i55 & i56) + (i56 | i55);
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    int iD3 = ad.d(context, R.attr.colorControlActivated);
                    int i59 = a;
                    int i60 = i59 & 123;
                    int i61 = (i60 - (~(-(-((i59 ^ 123) | i60))))) - 1;
                    b = i61 % 128;
                    if (i61 % 2 == 0) {
                        arh.g(drawableFindDrawableByLayerId3, iD3, mode);
                        int i62 = 78 / 0;
                    } else {
                        arh.g(drawableFindDrawableByLayerId3, iD3, mode);
                    }
                } else {
                    if (i != R.drawable.abc_ratingbar_material) {
                        int i63 = i36 & 11;
                        int i64 = ((((i36 ^ 11) | i63) << 1) - (~(-((~i63) & (i36 | 11))))) - 1;
                        a = i64 % 128;
                        int i65 = i64 % 2;
                        if (i != R.drawable.abc_ratingbar_indicator_material) {
                            int i66 = i36 + 15;
                            a = i66 % 128;
                            if (i66 % 2 != 0) {
                                mode3.hashCode();
                                throw null;
                            }
                            if (i != R.drawable.abc_ratingbar_small_material) {
                                int i67 = (((i36 & (-72)) | ((~i36) & 71)) - (~((i36 & 71) << 1))) - 1;
                                a = i67 % 128;
                                int i68 = i67 % 2;
                                if (o(context, i, drawable)) {
                                    drawableMutate = drawable;
                                } else {
                                    int i69 = a;
                                    int i70 = ((i69 & 95) - (~(-(-(i69 | 95))))) - 1;
                                    i2 = i70 % 128;
                                    b = i2;
                                    int i71 = i70 % 2;
                                    if (z) {
                                        int i72 = i2 ^ 65;
                                        int i73 = (((i2 & 65) | i72) << 1) - i72;
                                        a = i73 % 128;
                                        int i74 = i73 % 2;
                                        int i75 = i2 + 23;
                                        a = i75 % 128;
                                        int i76 = i75 % 2;
                                        drawableMutate = null;
                                    } else {
                                        drawableMutate = drawable;
                                    }
                                }
                            }
                        }
                    }
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable drawableFindDrawableByLayerId4 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int i77 = b;
                    int i78 = i77 & 7;
                    int i79 = (i77 ^ 7) | i78;
                    int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                    a = i80 % 128;
                    if (i80 % 2 != 0) {
                        ad.c(context, R.attr.colorControlNormal);
                        PorterDuff.Mode mode4 = P.c;
                        throw null;
                    }
                    int iC = ad.c(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode5 = P.c;
                    arh.g(drawableFindDrawableByLayerId4, iC, mode5);
                    int i81 = a;
                    int i82 = ((i81 & (-92)) | ((~i81) & 91)) + ((i81 & 91) << 1);
                    b = i82 % 128;
                    int i83 = i82 % 2;
                    Drawable drawableFindDrawableByLayerId5 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
                    int i84 = a + 103;
                    b = i84 % 128;
                    if (i84 % 2 == 0) {
                        ad.d(context, R.attr.colorControlActivated);
                        throw null;
                    }
                    int iD4 = ad.d(context, R.attr.colorControlActivated);
                    int i85 = b + 107;
                    a = i85 % 128;
                    int i86 = i85 % 2;
                    arh.g(drawableFindDrawableByLayerId5, iD4, mode5);
                    Drawable drawableFindDrawableByLayerId6 = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
                    int i87 = a;
                    int i88 = ((i87 | 125) << 1) - (i87 ^ 125);
                    b = i88 % 128;
                    int i89 = i88 % 2;
                    int iD5 = ad.d(context, R.attr.colorControlActivated);
                    int i90 = (-2) - ((b + 32) ^ (-1));
                    a = i90 % 128;
                    int i91 = i90 % 2;
                    arh.g(drawableFindDrawableByLayerId6, iD5, mode5);
                    int i92 = a;
                    int i93 = i92 & 15;
                    int i94 = (i92 | 15) & (~i93);
                    int i95 = i93 << 1;
                    int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
                    b = i96 % 128;
                    if (i96 % 2 == 0) {
                        int i97 = 5 / 3;
                    }
                }
                int i98 = a;
                int i99 = ((((i98 ^ 73) | (i98 & 73)) << 1) - (~(-((i98 & (-74)) | ((~i98) & 73))))) - 1;
                b = i99 % 128;
                int i100 = i99 % 2;
                int i101 = i98 & 7;
                int i102 = (((i98 ^ 7) | i101) << 1) - ((i98 | 7) & (~i101));
                b = i102 % 128;
                int i103 = i102 % 2;
                drawableMutate = drawable;
            } else if (o(context, i, drawable)) {
                int i610 = a;
                int i710 = ((i610 & 95) - (~(-(-(i610 | 95))))) - 1;
                i2 = i710 % 128;
                b = i2;
                int i711 = i710 % 2;
                if (z) {
                    int i712 = i2 ^ 65;
                    int i713 = (((i2 & 65) | i712) << 1) - i712;
                    a = i713 % 128;
                    int i714 = i713 % 2;
                    int i715 = i2 + 23;
                    a = i715 % 128;
                    int i716 = i715 % 2;
                    drawableMutate = null;
                } else {
                    drawableMutate = drawable;
                }
            } else {
                drawableMutate = drawable;
            }
        }
        int i104 = a;
        int i105 = (((i104 & (-54)) | ((~i104) & 53)) - (~(-(-((i104 & 53) << 1))))) - 1;
        b = i105 % 128;
        if (i105 % 2 == 0) {
            int i106 = 30 / 0;
        }
        return drawableMutate;
    }
}
