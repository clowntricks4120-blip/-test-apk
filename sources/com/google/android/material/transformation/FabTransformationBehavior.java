package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ivas.gov.bisp.enumeration.O.i;
import ivas.gov.bisp.enumeration.T.C0026p;
import ivas.gov.bisp.enumeration.T.z;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p094o0000OoO.o00O0O;
import ivas.gov.bisp.enumeration.p094o0000OoO.o00Oo0;
import ivas.gov.bisp.enumeration.p100w.r;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final int[] e;
    public final RectF f;
    public float g;
    public float h;

    public class OooO00o extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public OooO00o(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    public static class OooO0O0 {
        public C0026p a;
        public r b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.f = new RectF();
        this.e = new int[2];
    }

    public final float A(View view, View view2, r rVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.f;
        B(view, rectF);
        rectF.offset(this.g, this.h);
        B(view2, rectF2);
        Objects.requireNonNull(rVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final void B(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.e;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final float C(OooO0O0 oooO0O0, z zVar, float f, float f2) {
        long j = zVar.c;
        long j2 = zVar.d;
        z zVarF = oooO0O0.a.f("expansion");
        return ivas.gov.bisp.enumeration.T.j.b(f, f2, zVar.e().getInterpolation((((zVarF.c + zVarF.d) + 17) - j) / j2));
    }

    public abstract OooO0O0 D(Context context, boolean z);

    public final ViewGroup E(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void f(CoordinatorLayout.OooOO0 oooOO0) {
        if (oooOO0.i == 0) {
            oooOO0.i = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03d6 A[LOOP:0: B:110:0x03d4->B:111:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet w(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        ivas.gov.bisp.enumeration.aH.r rVar;
        ArrayList arrayList2;
        Animator animatorB;
        z zVar;
        ArrayList arrayList3;
        OooO0O0 oooO0O0;
        FabTransformationBehavior fabTransformationBehavior;
        ViewGroup viewGroupE;
        int i;
        ObjectAnimator objectAnimatorOfFloat4;
        AnimatorSet animatorSet;
        int size;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        OooO0O0 oooO0O0D = D(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        WeakHashMap<View, R> weakHashMap = T.c;
        float fB = T.aXb.b(view2) - T.aXb.b(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fB);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fB);
        }
        oooO0O0D.a.f("elevation").d(objectAnimatorOfFloat);
        arrayList4.add(objectAnimatorOfFloat);
        RectF rectF = this.d;
        float fA = A(view, view2, oooO0O0D.b);
        float fX = x(view, view2, oooO0O0D.b);
        Pair<z, z> pairZ = z(fA, fX, z, oooO0O0D);
        z zVar2 = (z) pairZ.first;
        z zVar3 = (z) pairZ.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fA);
                view2.setTranslationY(-fX);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fC = C(oooO0O0D, zVar2, -fA, 0.0f);
            float fC2 = C(oooO0O0D, zVar3, -fX, 0.0f);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.d;
            rectF2.set(rect);
            RectF rectF3 = this.f;
            B(view2, rectF3);
            rectF3.offset(fC, fC2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fA);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fX);
        }
        zVar2.d(objectAnimatorOfFloat2);
        zVar3.d(objectAnimatorOfFloat3);
        arrayList4.add(objectAnimatorOfFloat2);
        arrayList4.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fA2 = A(view, view2, oooO0O0D.b);
        float fX2 = x(view, view2, oooO0O0D.b);
        Pair<z, z> pairZ2 = z(fA2, fX2, z, oooO0O0D);
        z zVar4 = (z) pairZ2.first;
        z zVar5 = (z) pairZ2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fA2 = this.g;
        }
        fArr[0] = fA2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fX2 = this.h;
        }
        fArr2[0] = fX2;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        zVar4.d(objectAnimatorOfFloat7);
        zVar5.d(objectAnimatorOfFloat8);
        arrayList4.add(objectAnimatorOfFloat7);
        arrayList4.add(objectAnimatorOfFloat8);
        boolean z3 = view2 instanceof ivas.gov.bisp.enumeration.aH.r;
        if (z3 && (view instanceof ImageView)) {
            ivas.gov.bisp.enumeration.aH.r rVar2 = (ivas.gov.bisp.enumeration.aH.r) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, ivas.gov.bisp.enumeration.T.r.c, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, ivas.gov.bisp.enumeration.T.r.c, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new j(this, view2));
                oooO0O0D.a.f("iconFade").d(objectAnimatorOfInt2);
                arrayList4.add(objectAnimatorOfInt2);
                c cVar = new c(this, rVar2, drawable);
                arrayList = arrayList5;
                arrayList.add(cVar);
            } else {
                arrayList = arrayList5;
            }
        } else {
            arrayList = arrayList5;
        }
        if (z3) {
            ivas.gov.bisp.enumeration.aH.r rVar3 = (ivas.gov.bisp.enumeration.aH.r) view2;
            r rVar4 = oooO0O0D.b;
            RectF rectF4 = this.d;
            RectF rectF5 = this.f;
            B(view, rectF4);
            rectF4.offset(this.g, this.h);
            B(view2, rectF5);
            rectF5.offset(-A(view, view2, rVar4), 0.0f);
            float fCenterX = rectF4.centerX() - rectF5.left;
            r rVar5 = oooO0O0D.b;
            RectF rectF6 = this.d;
            RectF rectF7 = this.f;
            B(view, rectF6);
            rectF6.offset(this.g, this.h);
            B(view2, rectF7);
            rectF7.offset(0.0f, -x(view, view2, rVar5));
            float fCenterY = rectF6.centerY() - rectF7.top;
            ((FloatingActionButton) view).l(this.c);
            float fWidth2 = this.c.width() / 2.0f;
            z zVarF = oooO0O0D.a.f("expansion");
            if (z) {
                if (!z2) {
                    rVar3.setRevealInfo(new ivas.gov.bisp.enumeration.aH.r.bdX(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = rVar3.getRevealInfo().c;
                }
                float fR = ivas.gov.bisp.enumeration.O.r.r(fCenterX, fCenterY, 0.0f, 0.0f);
                float fR2 = ivas.gov.bisp.enumeration.O.r.r(fCenterX, fCenterY, fWidth, 0.0f);
                float fR3 = ivas.gov.bisp.enumeration.O.r.r(fCenterX, fCenterY, fWidth, fHeight);
                float fR4 = ivas.gov.bisp.enumeration.O.r.r(fCenterX, fCenterY, 0.0f, fHeight);
                if (fR <= fR2 || fR <= fR3 || fR <= fR4) {
                    if (fR2 <= fR3 || fR2 <= fR4) {
                        fR = fR3 > fR4 ? fR3 : fR4;
                    } else {
                        fR = fR2;
                    }
                }
                animatorB = ivas.gov.bisp.enumeration.aH.c.b(rVar3, fCenterX, fCenterY, fR);
                animatorB.addListener(new h(this, rVar3));
                long j = zVarF.c;
                int i2 = (int) fCenterX;
                int i3 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList4.add(animatorCreateCircularReveal);
                }
                arrayList2 = arrayList4;
                rVar = rVar3;
                zVar = zVarF;
            } else {
                float f = rVar3.getRevealInfo().c;
                Animator animatorB2 = ivas.gov.bisp.enumeration.aH.c.b(rVar3, fCenterX, fCenterY, fWidth2);
                long j2 = zVarF.c;
                int i4 = (int) fCenterX;
                int i5 = (int) fCenterY;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f, f);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList4.add(animatorCreateCircularReveal2);
                }
                long j3 = zVarF.c;
                long j4 = zVarF.d;
                C0026p c0026p = oooO0O0D.a;
                int i6 = c0026p.c.i;
                long jMax = 0;
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i6;
                    z zVar6 = (z) c0026p.c.n(i7);
                    jMax = Math.max(jMax, zVar6.c + zVar6.d);
                    i7++;
                    i6 = i8;
                    rVar3 = rVar3;
                    zVarF = zVarF;
                    arrayList4 = arrayList4;
                }
                ArrayList arrayList6 = arrayList4;
                rVar = rVar3;
                z zVar7 = zVarF;
                long j5 = j3 + j4;
                if (j5 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j5);
                    animatorCreateCircularReveal3.setDuration(jMax - j5);
                    arrayList2 = arrayList6;
                    arrayList2.add(animatorCreateCircularReveal3);
                } else {
                    arrayList2 = arrayList6;
                }
                animatorB = animatorB2;
                zVar = zVar7;
            }
            zVar.d(animatorB);
            arrayList2.add(animatorB);
            arrayList3 = arrayList;
            arrayList3.add(new ivas.gov.bisp.enumeration.aH.j(rVar));
        } else {
            oooO0O0D = oooO0O0D;
            arrayList2 = arrayList4;
            arrayList3 = arrayList;
        }
        if (z3) {
            ivas.gov.bisp.enumeration.aH.r rVar6 = (ivas.gov.bisp.enumeration.aH.r) view2;
            WeakHashMap<View, R> weakHashMap2 = T.c;
            ColorStateList colorStateListI = T.aXb.i(view);
            int colorForState = colorStateListI != null ? colorStateListI.getColorForState(view.getDrawableState(), colorStateListI.getDefaultColor()) : 0;
            if (z != 0) {
                if (!z2) {
                    rVar6.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(rVar6, ivas.gov.bisp.enumeration.aH.r.bdW.c, colorForState & 16777215);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(rVar6, ivas.gov.bisp.enumeration.aH.r.bdW.c, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(ivas.gov.bisp.enumeration.T.c.c);
            oooO0O0 = oooO0O0D;
            oooO0O0.a.f("color").d(objectAnimatorOfInt);
            arrayList2.add(objectAnimatorOfInt);
        } else {
            z = z;
            oooO0O0 = oooO0O0D;
        }
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(ivas.gov.bisp.enumeration.R.id.mtrl_child_content_container);
            if (viewFindViewById != null) {
                fabTransformationBehavior = this;
                viewGroupE = fabTransformationBehavior.E(viewFindViewById);
            } else {
                fabTransformationBehavior = this;
                viewGroupE = ((view2 instanceof o00Oo0) || (view2 instanceof o00O0O)) ? fabTransformationBehavior.E(((ViewGroup) view2).getChildAt(0)) : fabTransformationBehavior.E(view2);
            }
            if (viewGroupE != null) {
                if (z) {
                    if (!z2) {
                        ivas.gov.bisp.enumeration.T.h.c.set(viewGroupE, Float.valueOf(0.0f));
                    }
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroupE, ivas.gov.bisp.enumeration.T.h.c, 1.0f);
                } else {
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroupE, ivas.gov.bisp.enumeration.T.h.c, 0.0f);
                }
                oooO0O0.a.f("contentFade").d(objectAnimatorOfFloat4);
                arrayList2.add(objectAnimatorOfFloat4);
            }
            animatorSet = new AnimatorSet();
            i.p(animatorSet, arrayList2);
            animatorSet.addListener(new OooO00o(fabTransformationBehavior, z, view2, view));
            size = arrayList3.size();
            while (i < size) {
                animatorSet.addListener((Animator.AnimatorListener) arrayList3.get(i));
                i++;
            }
            return animatorSet;
        }
        fabTransformationBehavior = this;
        i = 0;
        animatorSet = new AnimatorSet();
        i.p(animatorSet, arrayList2);
        animatorSet.addListener(new OooO00o(fabTransformationBehavior, z, view2, view));
        size = arrayList3.size();
        while (i < size) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList3.get(i));
            i++;
        }
        return animatorSet;
    }

    public final float x(View view, View view2, r rVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.f;
        B(view, rectF);
        rectF.offset(this.g, this.h);
        B(view2, rectF2);
        Objects.requireNonNull(rVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final Pair<z, z> z(float f, float f2, boolean z, OooO0O0 oooO0O0) {
        z zVarF;
        z zVarF2;
        if (f == 0.0f || f2 == 0.0f) {
            zVarF = oooO0O0.a.f("translationXLinear");
            zVarF2 = oooO0O0.a.f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            zVarF = oooO0O0.a.f("translationXCurveDownwards");
            zVarF2 = oooO0O0.a.f("translationYCurveDownwards");
        } else {
            zVarF = oooO0O0.a.f("translationXCurveUpwards");
            zVarF2 = oooO0O0.a.f("translationYCurveUpwards");
        }
        return new Pair<>(zVarF, zVarF2);
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.f = new RectF();
        this.e = new int[2];
    }
}
