package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ivas.gov.bisp.enumeration.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int a = 0;
    public final Paint b;
    public ValueAnimator c;
    public float d;
    public float e;
    public final List<OooO0OO> f;
    public int g;
    public final int h;
    public final float i;
    public final RectF j;
    public final int k;
    public float l;
    public double m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f40o;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface OooO0OO {
        void b(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f = new ArrayList();
        Paint paint = new Paint();
        this.b = paint;
        this.j = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.r.q, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f40o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.k = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.i = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(0.0f, false);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.t(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int b(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            d(f, false);
            return;
        }
        float f2 = this.l;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.c.addUpdateListener(new OooO00o());
        this.c.addListener(new OooO0O0(this));
        this.c.start();
    }

    public final void d(float f, boolean z) {
        float f2 = f % 360.0f;
        this.l = f2;
        this.m = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.f40o * ((float) Math.cos(this.m))) + (getWidth() / 2);
        float fSin = (this.f40o * ((float) Math.sin(this.m))) + height;
        RectF rectF = this.j;
        float f3 = this.h;
        rectF.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator<OooO0OO> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float f2 = this.f40o;
        float fCos = (float) Math.cos(this.m);
        float f3 = height;
        float f4 = this.f40o;
        float fSin = (float) Math.sin(this.m);
        this.b.setStrokeWidth(0.0f);
        canvas.drawCircle((f2 * fCos) + f, (f4 * fSin) + f3, this.h, this.b);
        double dSin = Math.sin(this.m);
        double dCos = Math.cos(this.m);
        double d = this.f40o - this.h;
        this.b.setStrokeWidth(this.k);
        canvas.drawLine(f, f3, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.b);
        canvas.drawCircle(f, f3, this.i, this.b);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c(this.l, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.d = x;
            this.e = y;
            this.n = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.n;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.n;
        float fB = b(x, y);
        boolean z5 = this.l != fB;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            c(fB, false);
            z3 = true;
        }
        this.n = z4 | z3;
        return true;
    }
}
