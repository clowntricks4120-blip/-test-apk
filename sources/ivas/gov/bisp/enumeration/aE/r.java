package ivas.gov.bisp.enumeration.aE;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p086i.l;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r extends com.google.android.material.floatingactionbutton.r {
    private static int K = 1;
    private static int L;

    public static class bdI extends C0019p {
        private static int a = 0;
        private static int b = 1;

        public bdI(t tVar) {
            super(tVar);
        }

        @Override // ivas.gov.bisp.enumeration.O.C0019p, android.graphics.drawable.Drawable
        public boolean isStateful() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 63;
            int i4 = (i2 ^ 63) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            int i8 = i6 ^ 13;
            int i9 = -(-((i6 & 13) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }
    }

    public r(FloatingActionButton floatingActionButton, ivas.gov.bisp.enumeration.R.c cVar) {
        super(floatingActionButton, cVar);
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public float i() {
        int i = 2 % 2;
        int i2 = K;
        int i3 = i2 & 15;
        int i4 = i3 + ((i2 ^ 15) | i3);
        L = i4 % 128;
        if (i4 % 2 == 0) {
            return this.E.getElevation();
        }
        this.E.getElevation();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void l() {
        int i = 2 % 2;
        int i2 = L;
        int i3 = (i2 & 117) + (i2 | 117);
        K = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void m() {
        int i = 2 % 2;
        int i2 = L;
        int i3 = (i2 & (-38)) | ((~i2) & 37);
        int i4 = (i2 & 37) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        K = i5 % 128;
        int i6 = i5 % 2;
        z();
        if (i6 == 0) {
            throw null;
        }
        int i7 = K;
        int i8 = ((((i7 ^ 31) | (i7 & 31)) << 1) - (~(-(((~i7) & 31) | (i7 & (-32)))))) - 1;
        L = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void n(int[] iArr) {
        int i = 2 % 2;
        int i2 = K;
        int i3 = (((i2 | 19) << 1) - (~(-(((~i2) & 19) | (i2 & (-20)))))) - 1;
        L = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void y() {
        int i = 2 % 2;
        int i2 = L + 52;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        K = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Animator A(float f, float f2) {
        float[] fArr;
        float[] fArr2;
        int i = 2 % 2;
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.E;
        int i2 = K;
        int i3 = i2 & 97;
        int i4 = (~i3) & (i2 | 97);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        L = i6 % 128;
        if (i6 % 2 != 0) {
            fArr = new float[0];
            fArr[0] = f;
        } else {
            fArr = new float[]{f};
        }
        int i7 = i2 + 85;
        L = i7 % 128;
        int i8 = i7 % 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L);
        int i9 = K;
        int i10 = ((i9 | 35) << 1) - (i9 ^ 35);
        L = i10 % 128;
        int i11 = i10 % 2;
        AnimatorSet.Builder builderPlay = animatorSet.play(duration);
        FloatingActionButton floatingActionButton2 = this.E;
        Property property = View.TRANSLATION_Z;
        int i12 = K + 93;
        L = i12 % 128;
        if (i12 % 2 != 0) {
            fArr2 = new float[0];
            fArr2[1] = f2;
        } else {
            fArr2 = new float[]{f2};
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(floatingActionButton2, (Property<FloatingActionButton, Float>) property, fArr2).setDuration(100L);
        int i13 = K;
        int i14 = i13 & 57;
        int i15 = ((i13 ^ 57) | i14) << 1;
        int i16 = -((i13 | 57) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        L = i17 % 128;
        int i18 = i17 % 2;
        builderPlay.with(duration2);
        TimeInterpolator timeInterpolator = com.google.android.material.floatingactionbutton.r.a;
        int i19 = K + 65;
        L = i19 % 128;
        if (i19 % 2 != 0) {
            animatorSet.setInterpolator(timeInterpolator);
            int i20 = 68 / 0;
        } else {
            animatorSet.setInterpolator(timeInterpolator);
        }
        int i21 = K;
        int i22 = (i21 ^ 35) + ((i21 & 35) << 1);
        L = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 89 / 0;
        }
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void h(Rect rect) {
        int i = 2 % 2;
        int i2 = K;
        int i3 = i2 & 21;
        int i4 = (i3 - (~(-(-((i2 ^ 21) | i3))))) - 1;
        L = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            boolean z = FloatingActionButton.this.m;
            obj.hashCode();
            throw null;
        }
        if (FloatingActionButton.this.m) {
            super.h(rect);
            int i5 = L;
            int i6 = ((i5 ^ 5) | (i5 & 5)) << 1;
            int i7 = -(((~i5) & 5) | (i5 & (-6)));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            K = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (w()) {
            rect.set(0, 0, 0, 0);
            int i9 = K + 125;
            L = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 98 / 0;
                return;
            }
            return;
        }
        int i11 = K;
        int i12 = (i11 | 15) << 1;
        int i13 = -(i11 ^ 15);
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        L = i14 % 128;
        int i15 = i14 % 2;
        int i16 = this.r;
        int i17 = -this.E.getSizeDimension();
        int i18 = i16 ^ i17;
        int i19 = (i16 & i17) << 1;
        int i20 = (i18 & i19) + (i19 | i18);
        int i21 = K;
        int i22 = i21 & 75;
        int i23 = i21 | 75;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        L = i24 % 128;
        int i25 = i24 % 2;
        int i26 = i20 / 2;
        rect.set(i26, i26, i26, i26);
        int i27 = L;
        int i28 = i27 & 109;
        int i29 = -(-((i27 ^ 109) | i28));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        K = i30 % 128;
        if (i30 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void t(ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = K;
        int i3 = (((i2 & (-16)) | ((~i2) & 15)) - (~((i2 & 15) << 1))) - 1;
        L = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = this.k instanceof RippleDrawable;
            throw null;
        }
        Drawable drawable = this.k;
        if (drawable instanceof RippleDrawable) {
            int i4 = (-2) - ((L + 120) ^ (-1));
            K = i4 % 128;
            if (i4 % 2 != 0) {
                ((RippleDrawable) drawable).setColor(ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList));
                return;
            } else {
                ((RippleDrawable) drawable).setColor(ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList));
                obj.hashCode();
                throw null;
            }
        }
        if (drawable != null) {
            int i5 = K;
            int i6 = ((i5 ^ 63) - (~(-(-((i5 & 63) << 1))))) - 1;
            L = i6 % 128;
            if (i6 % 2 != 0) {
                drawable.setTintList(ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList));
                throw null;
            }
            drawable.setTintList(ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList));
        }
        int i7 = L + 75;
        K = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public boolean u() {
        boolean z;
        int i = 2 % 2;
        int i2 = L + 98;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        K = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z2 = FloatingActionButton.this.m;
            throw null;
        }
        if ((!FloatingActionButton.this.m) && w()) {
            int i4 = K;
            int i5 = ((i4 ^ 101) - (~((i4 & 101) << 1))) - 1;
            int i6 = i5 % 128;
            L = i6;
            int i7 = i5 % 2;
            int i8 = i6 & 5;
            int i9 = (i6 ^ 5) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            K = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        } else {
            int i12 = L + 43;
            K = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 / 2;
            }
            z = true;
        }
        int i14 = K;
        int i15 = i14 & 1;
        int i16 = ((((i14 ^ 1) | i15) << 1) - (~(-((i14 | 1) & (~i15))))) - 1;
        L = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 52 / 0;
        }
        return z;
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void j(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        Context context;
        t tVar;
        j jVar;
        Paint paint;
        int i2 = 2 % 2;
        t tVar2 = this.i;
        Objects.requireNonNull(tVar2);
        bdI bdi = new bdI(tVar2);
        int i3 = L;
        int i4 = i3 ^ 119;
        int i5 = ((i3 & 119) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        K = i7 % 128;
        int i8 = i7 % 2;
        this.j = bdi;
        bdi.setTintList(colorStateList);
        char c = 0;
        if (mode != null) {
            int i9 = K;
            int i10 = i9 & 87;
            int i11 = (i10 - (~((i9 ^ 87) | i10))) - 1;
            L = i11 % 128;
            if (i11 % 2 != 0) {
                this.j.setTintMode(mode);
                int i12 = 22 / 0;
            } else {
                this.j.setTintMode(mode);
            }
            int i13 = L;
            int i14 = (((i13 & (-90)) | ((~i13) & 89)) - (~((i13 & 89) << 1))) - 1;
            K = i14 % 128;
            int i15 = i14 % 2;
        }
        this.j.r(this.E.getContext());
        if (i > 0) {
            int i16 = L;
            int i17 = i16 & 65;
            int i18 = (i16 ^ 65) | i17;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            K = i19 % 128;
            if (i19 % 2 == 0) {
                context = this.E.getContext();
                tVar = this.i;
                int i20 = 78 / 0;
            } else {
                context = this.E.getContext();
                tVar = this.i;
            }
            Objects.requireNonNull(tVar);
            j jVar2 = new j(tVar);
            int i21 = L;
            int i22 = ((i21 & (-116)) | ((~i21) & 115)) + ((i21 & 115) << 1);
            K = i22 % 128;
            int i23 = i22 % 2;
            Object obj = l.c;
            int iB = l.aUI.b(context, R.color.design_fab_stroke_top_outer_color);
            int i24 = L + 119;
            K = i24 % 128;
            int i25 = i24 % 2;
            int iB2 = l.aUI.b(context, R.color.design_fab_stroke_top_inner_color);
            int iB3 = l.aUI.b(context, R.color.design_fab_stroke_end_inner_color);
            int i26 = K + 17;
            L = i26 % 128;
            int i27 = i26 % 2;
            int iB4 = l.aUI.b(context, R.color.design_fab_stroke_end_outer_color);
            int i28 = L + 63;
            K = i28 % 128;
            int i29 = i28 % 2;
            jVar2.c = iB;
            jVar2.l = iB2;
            int i30 = L;
            int i31 = ((i30 & 124) + (i30 | 124)) - 1;
            K = i31 % 128;
            int i32 = i31 % 2;
            jVar2.m = iB3;
            jVar2.n = iB4;
            float f = i;
            int i33 = K;
            int i34 = i33 & 103;
            int i35 = -(-(i33 | 103));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            L = i36 % 128;
            int i37 = i36 % 2;
            if (jVar2.k != f) {
                int i38 = L;
                int i39 = ((((i38 ^ 23) | (i38 & 23)) << 1) - (~(-(((~i38) & 23) | (i38 & (-24)))))) - 1;
                K = i39 % 128;
                if (i39 % 2 == 0) {
                    jVar2.k = f;
                    paint = jVar2.e;
                    int i40 = 23 / 0;
                } else {
                    jVar2.k = f;
                    paint = jVar2.e;
                }
                paint.setStrokeWidth(f * 1.3333f);
                jVar2.f58o = true;
                int i41 = K;
                int i42 = i41 & 67;
                int i43 = (i41 | 67) & (~i42);
                int i44 = i42 << 1;
                int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                L = i45 % 128;
                if (i45 % 2 != 0) {
                    jVar2.invalidateSelf();
                    int i46 = 10 / 0;
                } else {
                    jVar2.invalidateSelf();
                }
                int i47 = L + 41;
                K = i47 % 128;
                int i48 = i47 % 2;
            }
            jVar2.d(colorStateList);
            this.l = jVar2;
            Drawable[] drawableArr = new Drawable[2];
            int i49 = L;
            int i50 = i49 & 97;
            int i51 = (i49 | 97) & (~i50);
            int i52 = -(-(i50 << 1));
            int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
            K = i53 % 128;
            if (i53 % 2 == 0) {
                jVar = this.l;
                Objects.requireNonNull(jVar);
                c = 1;
            } else {
                jVar = this.l;
                Objects.requireNonNull(jVar);
            }
            int i54 = L;
            int i55 = i54 ^ 61;
            int i56 = -(-((i54 & 61) << 1));
            int i57 = (i55 & i56) + (i56 | i55);
            K = i57 % 128;
            int i58 = i57 % 2;
            drawableArr[c] = jVar;
            C0019p c0019p = this.j;
            Objects.requireNonNull(c0019p);
            drawableArr[1] = c0019p;
            layerDrawable = new LayerDrawable(drawableArr);
            int i59 = K + 39;
            L = i59 % 128;
            int i60 = i59 % 2;
        } else {
            this.l = null;
            layerDrawable = this.j;
            int i61 = L;
            int i62 = i61 & 51;
            int i63 = -(-((i61 ^ 51) | i62));
            int i64 = (i62 & i63) + (i63 | i62);
            K = i64 % 128;
            int i65 = i64 % 2;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ivas.gov.bisp.enumeration.p041bn.j.c(colorStateList2), layerDrawable, null);
        int i66 = L;
        int i67 = (-2) - (((i66 ^ 12) + ((i66 & 12) << 1)) ^ (-1));
        K = i67 % 128;
        int i68 = i67 % 2;
        this.k = rippleDrawable;
        this.n = rippleDrawable;
        int i69 = K;
        int i70 = ((i69 & (-110)) | ((~i69) & 109)) + ((i69 & 109) << 1);
        L = i70 % 128;
        int i71 = i70 % 2;
    }

    @Override // com.google.android.material.floatingactionbutton.r
    public void p(float f, float f2, float f3) {
        int[] iArr;
        FloatingActionButton floatingActionButton;
        Property property;
        float[] fArr;
        int i = 2 % 2;
        int i2 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr2 = com.google.android.material.floatingactionbutton.r.b;
        int i3 = K;
        int i4 = (i3 ^ 87) + ((i3 & 87) << 1);
        L = i4 % 128;
        int i5 = i4 % 2;
        stateListAnimator.addState(iArr2, A(f, f3));
        int[] iArr3 = com.google.android.material.floatingactionbutton.r.d;
        int i6 = L;
        int i7 = i6 & 67;
        int i8 = i6 | 67;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        K = i9 % 128;
        int i10 = i9 % 2;
        stateListAnimator.addState(iArr3, A(f, f2));
        int[] iArr4 = com.google.android.material.floatingactionbutton.r.e;
        int i11 = K;
        int i12 = i11 & 73;
        int i13 = -(-((i11 ^ 73) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        L = i14 % 128;
        int i15 = i14 % 2;
        stateListAnimator.addState(iArr4, A(f, f2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.r.f, A(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FloatingActionButton floatingActionButton2 = this.E;
        float[] fArr2 = new float[1];
        int i16 = L;
        int i17 = i16 & 37;
        int i18 = i17 + ((i16 ^ 37) | i17);
        K = i18 % 128;
        if (i18 % 2 == 0) {
            fArr2[1] = f;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton2, "elevation", fArr2).setDuration(1L));
        } else {
            fArr2[0] = f;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton2, "elevation", fArr2).setDuration(0L));
        }
        Object obj = null;
        if (i2 <= 24) {
            int i19 = L;
            int i20 = i19 & 47;
            int i21 = (i19 ^ 47) | i20;
            int i22 = (i20 & i21) + (i21 | i20);
            K = i22 % 128;
            if (i22 % 2 == 0) {
                floatingActionButton = this.E;
                property = View.TRANSLATION_Z;
                fArr = new float[0];
            } else {
                floatingActionButton = this.E;
                property = View.TRANSLATION_Z;
                fArr = new float[1];
            }
            int i23 = K;
            int i24 = ((i23 & 67) - (~(i23 | 67))) - 1;
            L = i24 % 128;
            int i25 = i24 % 2;
            fArr[0] = floatingActionButton.getTranslationZ();
            int i26 = L + 1;
            K = i26 % 128;
            int i27 = i26 % 2;
            ObjectAnimator duration = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr).setDuration(100L);
            int i28 = K;
            int i29 = i28 & 93;
            int i30 = i28 | 93;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            L = i31 % 128;
            if (i31 % 2 != 0) {
                arrayList.add(duration);
                throw null;
            }
            arrayList.add(duration);
            int i32 = K;
            int i33 = ((i32 ^ 106) + ((i32 & 106) << 1)) - 1;
            L = i33 % 128;
            int i34 = i33 % 2;
        }
        FloatingActionButton floatingActionButton3 = this.E;
        Property property2 = View.TRANSLATION_Z;
        int i35 = L;
        int i36 = i35 & 59;
        int i37 = (i35 ^ 59) | i36;
        int i38 = (i36 & i37) + (i37 | i36);
        K = i38 % 128;
        int i39 = i38 % 2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton3, (Property<FloatingActionButton, Float>) property2, 0.0f);
        int i40 = L;
        int i41 = ((i40 | 9) << 1) - (i40 ^ 9);
        K = i41 % 128;
        arrayList.add(i41 % 2 == 0 ? objectAnimatorOfFloat.setDuration(100L) : objectAnimatorOfFloat.setDuration(100L));
        Animator[] animatorArr = new Animator[0];
        int i42 = L;
        int i43 = (-2) - (((i42 & 52) + (i42 | 52)) ^ (-1));
        K = i43 % 128;
        if (i43 % 2 == 0) {
            animatorSet.playSequentially((Animator[]) arrayList.toArray(animatorArr));
            throw null;
        }
        animatorSet.playSequentially((Animator[]) arrayList.toArray(animatorArr));
        int i44 = K;
        int i45 = (i44 & (-80)) | ((~i44) & 79);
        int i46 = -(-((i44 & 79) << 1));
        int i47 = (i45 & i46) + (i46 | i45);
        L = i47 % 128;
        if (i47 % 2 != 0) {
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.r.a);
            iArr = com.google.android.material.floatingactionbutton.r.c;
            int i48 = 71 / 0;
        } else {
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.r.a);
            iArr = com.google.android.material.floatingactionbutton.r.c;
        }
        stateListAnimator.addState(iArr, animatorSet);
        int[] iArr5 = com.google.android.material.floatingactionbutton.r.g;
        int i49 = K;
        int i50 = (i49 & (-126)) | ((~i49) & 125);
        int i51 = -(-((i49 & 125) << 1));
        int i52 = (i50 & i51) + (i51 | i50);
        L = i52 % 128;
        if (i52 % 2 != 0) {
            stateListAnimator.addState(iArr5, A(0.0f, 0.0f));
            this.E.setStateListAnimator(stateListAnimator);
            obj.hashCode();
            throw null;
        }
        stateListAnimator.addState(iArr5, A(0.0f, 0.0f));
        this.E.setStateListAnimator(stateListAnimator);
        int i53 = K;
        int i54 = (i53 ^ 99) + ((i53 & 99) << 1);
        L = i54 % 128;
        int i55 = i54 % 2;
        if (u()) {
            int i56 = K;
            int i57 = ((i56 | 11) << 1) - (i56 ^ 11);
            L = i57 % 128;
            int i58 = i57 % 2;
            z();
            int i59 = K;
            int i60 = (((i59 | 8) << 1) - (i59 ^ 8)) - 1;
            L = i60 % 128;
            int i61 = i60 % 2;
        }
        int i62 = K;
        int i63 = i62 & 59;
        int i64 = (((i62 | 59) & (~i63)) - (~(i63 << 1))) - 1;
        L = i64 % 128;
        int i65 = i64 % 2;
    }
}
