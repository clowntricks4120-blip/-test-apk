package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.o;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.P.z;
import ivas.gov.bisp.enumeration.T.C0026p;
import ivas.gov.bisp.enumeration.T.e;
import ivas.gov.bisp.enumeration.T.i;
import ivas.gov.bisp.enumeration.p028ba.l;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public final ivas.gov.bisp.enumeration.R.c A;
    public ArrayList<Animator.AnimatorListener> B;
    public ArrayList<Animator.AnimatorListener> C;
    public ArrayList<aOz> D;
    public final FloatingActionButton E;
    public ViewTreeObserver.OnPreDrawListener I;
    public float h;
    public t i;
    public C0019p j;
    public Drawable k;
    public ivas.gov.bisp.enumeration.aE.j l;
    public boolean m;
    public Drawable n;
    public float p;
    public float q;
    public int r;
    public final z s;
    public C0026p t;
    public Animator u;
    public C0026p v;
    public float w;
    public int x;
    public static final TimeInterpolator a = ivas.gov.bisp.enumeration.T.j.e;
    public static final int[] b = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] d = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] e = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] f = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] c = {R.attr.state_enabled};
    public static final int[] g = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37o = true;
    public float y = 1.0f;
    public int z = 0;
    public final Rect G = new Rect();
    public final RectF F = new RectF();
    public final RectF H = new RectF();
    public final Matrix J = new Matrix();

    public interface aOB {
    }

    public class aOG extends i {
        public aOG() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            r.this.y = f;
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.b;
                float f2 = fArr[i];
                float f3 = this.a[i];
                fArr[i] = ((f2 - f3) * f) + f3;
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }

    public class aOH implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;
        public final /* synthetic */ Matrix i;

        public aOH(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.g = f5;
            this.f = f6;
            this.h = f7;
            this.i = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            r.this.E.setAlpha(ivas.gov.bisp.enumeration.T.j.c(this.b, this.c, 0.0f, 0.2f, fFloatValue));
            r.this.E.setScaleX(ivas.gov.bisp.enumeration.T.j.b(this.d, this.e, fFloatValue));
            r.this.E.setScaleY(ivas.gov.bisp.enumeration.T.j.b(this.g, this.e, fFloatValue));
            r.this.y = ivas.gov.bisp.enumeration.T.j.b(this.f, this.h, fFloatValue);
            r.this.d(ivas.gov.bisp.enumeration.T.j.b(this.f, this.h, fFloatValue), this.i);
            r.this.E.setImageMatrix(this.i);
        }
    }

    public abstract class aOI extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;
        public float b;
        public float c;

        public aOI(c cVar) {
        }

        public abstract float b();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r.this.v((int) this.c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                C0019p c0019p = r.this.j;
                this.b = c0019p == null ? 0.0f : c0019p.e.q;
                this.c = b();
                this.a = true;
            }
            r rVar = r.this;
            float f = this.b;
            rVar.v((int) ((valueAnimator.getAnimatedFraction() * (this.c - f)) + f));
        }
    }

    public class aOJ extends aOI {
        public aOJ(r rVar) {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.r.aOI
        public float b() {
            return 0.0f;
        }
    }

    public class aOK extends aOI {
        public aOK() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.r.aOI
        public float b() {
            r rVar = r.this;
            return rVar.p + rVar.h;
        }
    }

    public class aOL extends aOI {
        public aOL() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.r.aOI
        public float b() {
            r rVar = r.this;
            return rVar.p + rVar.q;
        }
    }

    public class aOM extends aOI {
        public aOM() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.r.aOI
        public float b() {
            return r.this.p;
        }
    }

    public interface aOz {
        void b();

        void e();
    }

    public r(FloatingActionButton floatingActionButton, ivas.gov.bisp.enumeration.R.c cVar) {
        this.E = floatingActionButton;
        this.A = cVar;
        z zVar = new z();
        this.s = zVar;
        zVar.c(b, g(new aOL()));
        zVar.c(d, g(new aOK()));
        zVar.c(e, g(new aOK()));
        zVar.c(f, g(new aOK()));
        zVar.c(c, g(new aOM()));
        zVar.c(g, g(new aOJ(this)));
        this.w = floatingActionButton.getRotation();
    }

    public boolean c() {
        if (this.E.getVisibility() != 0) {
            return this.z == 2;
        }
        return this.z != 1;
    }

    public final void d(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.E.getDrawable();
        if (drawable == null || this.x == 0) {
            return;
        }
        RectF rectF = this.F;
        RectF rectF2 = this.H;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f3 = this.x;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.x / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public final AnimatorSet e(C0026p c0026p, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.E, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        c0026p.f("opacity").d(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.E, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        c0026p.f("scale").d(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new ivas.gov.bisp.enumeration.aE.c(this));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.E, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        c0026p.f("scale").d(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new ivas.gov.bisp.enumeration.aE.c(this));
        }
        arrayList.add(objectAnimatorOfFloat3);
        d(f4, this.J);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.E, new e(), new aOG(), new Matrix(this.J));
        c0026p.f("iconScale").d(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ivas.gov.bisp.enumeration.O.i.p(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet f(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new aOH(this.E.getAlpha(), f2, this.E.getScaleX(), f3, this.E.getScaleY(), this.y, f4, new Matrix(this.J)));
        arrayList.add(valueAnimatorOfFloat);
        ivas.gov.bisp.enumeration.O.i.p(animatorSet, arrayList);
        animatorSet.setDuration(l.d(this.E.getContext(), ivas.gov.bisp.enumeration.R.attr.motionDurationLong1, this.E.getContext().getResources().getInteger(ivas.gov.bisp.enumeration.R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(l.e(this.E.getContext(), ivas.gov.bisp.enumeration.R.attr.motionEasingStandard, ivas.gov.bisp.enumeration.T.j.d));
        return animatorSet;
    }

    public final ValueAnimator g(aOI aoi) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(aoi);
        valueAnimator.addUpdateListener(aoi);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public void h(Rect rect) {
        int sizeDimension = this.m ? (this.r - this.E.getSizeDimension()) / 2 : 0;
        float fI = this.f37o ? i() + this.q : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fI));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fI * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float i() {
        throw null;
    }

    public void j(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    public boolean k() {
        if (this.E.getVisibility() == 0) {
            return this.z == 1;
        }
        return this.z != 2;
    }

    public void l() {
        throw null;
    }

    public void m() {
        throw null;
    }

    public void n(int[] iArr) {
        throw null;
    }

    public void o() {
        ArrayList<aOz> arrayList = this.D;
        if (arrayList != null) {
            Iterator<aOz> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void p(float f2, float f3, float f4) {
        throw null;
    }

    public void q() {
        ArrayList<aOz> arrayList = this.D;
        if (arrayList != null) {
            Iterator<aOz> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
    }

    public final void r(float f2) {
        this.y = f2;
        Matrix matrix = this.J;
        d(f2, matrix);
        this.E.setImageMatrix(matrix);
    }

    public final void s(t tVar) {
        this.i = tVar;
        C0019p c0019p = this.j;
        if (c0019p != null) {
            c0019p.e.d = tVar;
            c0019p.invalidateSelf();
        }
        Object obj = this.k;
        if (obj instanceof o) {
            ((o) obj).setShapeAppearanceModel(tVar);
        }
        ivas.gov.bisp.enumeration.aE.j jVar = this.l;
        if (jVar != null) {
            jVar.q = tVar;
            jVar.invalidateSelf();
        }
    }

    public void t(ColorStateList colorStateList) {
        throw null;
    }

    public boolean u() {
        throw null;
    }

    public void v(float f2) {
        C0019p c0019p = this.j;
        if (c0019p != null) {
            C0019p.bfp bfpVar = c0019p.e;
            if (bfpVar.q != f2) {
                bfpVar.q = f2;
                c0019p.w();
            }
        }
    }

    public final boolean w() {
        return !this.m || this.E.getSizeDimension() >= this.r;
    }

    public final boolean x() {
        FloatingActionButton floatingActionButton = this.E;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        return T.aXa.d(floatingActionButton) && !this.E.isInEditMode();
    }

    public void y() {
        throw null;
    }

    public final void z() {
        Rect rect = this.G;
        h(rect);
        ivas.gov.bisp.enumeration.O.r.k(this.n, "Didn't initialize content background");
        if (u()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.n, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.OooO0O0 oooO0O0 = (FloatingActionButton.OooO0O0) this.A;
            Objects.requireNonNull(oooO0O0);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            ivas.gov.bisp.enumeration.R.c cVar = this.A;
            Drawable drawable = this.n;
            FloatingActionButton.OooO0O0 oooO0O1 = (FloatingActionButton.OooO0O0) cVar;
            Objects.requireNonNull(oooO0O1);
            if (drawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
            }
        }
        ivas.gov.bisp.enumeration.R.c cVar2 = this.A;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton.OooO0O0 oooO0O2 = (FloatingActionButton.OooO0O0) cVar2;
        FloatingActionButton.this.l.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i5 = floatingActionButton.j;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
