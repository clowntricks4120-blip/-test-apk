package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class n extends RecyclerView.OooOo implements RecyclerView.o0OoOo0 {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = new int[0];
    public final ValueAnimator A;
    public int C;
    public final RecyclerView.o00O0O D;
    public final Runnable E;
    public final int c;
    public final int d;
    public final int e;
    public final StateListDrawable f;
    public final Drawable g;
    public final int h;
    public final int i;
    public final StateListDrawable j;
    public final Drawable k;
    public final int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28o;
    public float p;
    public int q;
    public float r;
    public RecyclerView u;
    public int t = 0;
    public int s = 0;
    public boolean x = false;
    public boolean w = false;
    public int y = 0;
    public int z = 0;
    public final int[] v = new int[2];
    public final int[] B = new int[2];

    public class aMV implements Runnable {
        public aMV() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            int i = nVar.C;
            if (i == 1) {
                nVar.A.cancel();
            } else if (i != 2) {
                return;
            }
            nVar.C = 3;
            ValueAnimator valueAnimator = nVar.A;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            nVar.A.setDuration(500L);
            nVar.A.start();
        }
    }

    public class aMW extends RecyclerView.o00O0O {
        public aMW() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public void c(RecyclerView recyclerView, int i, int i2) {
            n nVar = n.this;
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = nVar.u.computeVerticalScrollRange();
            int i3 = nVar.s;
            nVar.x = iComputeVerticalScrollRange - i3 > 0 && i3 >= nVar.d;
            int iComputeHorizontalScrollRange = nVar.u.computeHorizontalScrollRange();
            int i4 = nVar.t;
            boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= nVar.d;
            nVar.w = z;
            boolean z2 = nVar.x;
            if (!z2 && !z) {
                if (nVar.y != 0) {
                    nVar.n(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                nVar.n = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                nVar.m = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (nVar.w) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i4;
                nVar.q = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                nVar.f28o = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
            }
            int i5 = nVar.y;
            if (i5 == 0 || i5 == 1) {
                nVar.n(1);
            }
        }
    }

    public class aMX extends AnimatorListenerAdapter {
        public boolean a = false;

        public aMX() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            if (((Float) n.this.A.getAnimatedValue()).floatValue() == 0.0f) {
                n nVar = n.this;
                nVar.C = 0;
                nVar.n(0);
            } else {
                n nVar2 = n.this;
                nVar2.C = 2;
                nVar2.u.invalidate();
            }
        }
    }

    public class aMY implements ValueAnimator.AnimatorUpdateListener {
        public aMY() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            n.this.f.setAlpha(iFloatValue);
            n.this.g.setAlpha(iFloatValue);
            n.this.u.invalidate();
        }
    }

    public n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = valueAnimatorOfFloat;
        this.C = 0;
        this.E = new aMV();
        aMW amw = new aMW();
        this.D = amw;
        this.f = stateListDrawable;
        this.g = drawable;
        this.j = stateListDrawable2;
        this.k = drawable2;
        this.i = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.h = Math.max(i, drawable.getIntrinsicWidth());
        this.c = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.l = Math.max(i, drawable2.getIntrinsicWidth());
        this.d = i2;
        this.e = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new aMX());
        valueAnimatorOfFloat.addUpdateListener(new aMY());
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.Oooo000 oooo000 = recyclerView2.f25o;
                if (oooo000 != null) {
                    oooo000.i("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.t.remove(this);
                if (recyclerView2.t.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.V();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.u;
                recyclerView3.s.remove(this);
                if (recyclerView3.u == this) {
                    recyclerView3.u = null;
                }
                List<RecyclerView.o00O0O> list = this.u.al;
                if (list != null) {
                    list.remove(amw);
                }
                k();
            }
            this.u = recyclerView;
            recyclerView.n(this);
            this.u.s.add(this);
            this.u.o(amw);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.y;
        if (i == 1) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zL = l(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zF || zL)) {
                if (zL) {
                    this.z = 1;
                    this.r = (int) motionEvent.getX();
                } else if (zF) {
                    this.z = 2;
                    this.p = (int) motionEvent.getY();
                }
                n(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0Oo0oo o0oo0oo) {
        if (this.t != this.u.getWidth() || this.s != this.u.getHeight()) {
            this.t = this.u.getWidth();
            this.s = this.u.getHeight();
            n(0);
            return;
        }
        if (this.C != 0) {
            if (this.x) {
                int i = this.t;
                int i2 = this.i;
                int i3 = i - i2;
                int i4 = this.n;
                int i5 = this.m;
                int i6 = i4 - (i5 / 2);
                this.f.setBounds(0, 0, i2, i5);
                this.g.setBounds(0, 0, this.h, this.s);
                RecyclerView recyclerView2 = this.u;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                if (T.aWY.f(recyclerView2) != 1) {
                    canvas.translate(i3, 0.0f);
                    this.g.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f.draw(canvas);
                    canvas.translate(-i3, -i6);
                } else {
                    this.g.draw(canvas);
                    canvas.translate(this.i, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.i, -i6);
                }
            }
            if (this.w) {
                int i7 = this.s;
                int i8 = this.c;
                int i9 = i7 - i8;
                int i10 = this.q;
                int i11 = this.f28o;
                int i12 = i10 - (i11 / 2);
                this.j.setBounds(0, 0, i11, i8);
                this.k.setBounds(0, 0, this.t, this.l);
                canvas.translate(0.0f, i9);
                this.k.draw(canvas);
                canvas.translate(i12, 0.0f);
                this.j.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public void c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public void e(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.y == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zL = l(motionEvent.getX(), motionEvent.getY());
            if (zF || zL) {
                if (zL) {
                    this.z = 1;
                    this.r = (int) motionEvent.getX();
                } else if (zF) {
                    this.z = 2;
                    this.p = (int) motionEvent.getY();
                }
                n(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.y == 2) {
            this.p = 0.0f;
            this.r = 0.0f;
            n(1);
            this.z = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.y == 2) {
            o();
            if (this.z == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.B;
                int i = this.e;
                iArr[0] = i;
                int i2 = this.t - i;
                iArr[1] = i2;
                float fMax = Math.max(i, Math.min(i2, x));
                if (Math.abs(this.q - fMax) >= 2.0f) {
                    int iM = m(this.r, fMax, iArr, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.t);
                    if (iM != 0) {
                        this.u.scrollBy(iM, 0);
                    }
                    this.r = fMax;
                }
            }
            if (this.z == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.v;
                int i3 = this.e;
                iArr2[0] = i3;
                int i4 = this.s - i3;
                iArr2[1] = i4;
                float fMax2 = Math.max(i3, Math.min(i4, y));
                if (Math.abs(this.n - fMax2) >= 2.0f) {
                    int iM2 = m(this.p, fMax2, iArr2, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.s);
                    if (iM2 != 0) {
                        this.u.scrollBy(0, iM2);
                    }
                    this.p = fMax2;
                }
            }
        }
    }

    public boolean f(float f, float f2) {
        RecyclerView recyclerView = this.u;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if (T.aWY.f(recyclerView) == 1) {
            if (f > this.i) {
                return false;
            }
        } else if (f < this.t - this.i) {
            return false;
        }
        int i = this.n;
        int i2 = this.m / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    public final void k() {
        this.u.removeCallbacks(this.E);
    }

    public boolean l(float f, float f2) {
        if (f2 >= this.s - this.c) {
            int i = this.q;
            int i2 = this.f28o / 2;
            if (f >= i - i2 && f <= i2 + i) {
                return true;
            }
        }
        return false;
    }

    public final int m(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void n(int i) {
        if (i == 2 && this.y != 2) {
            this.f.setState(a);
            k();
        }
        if (i == 0) {
            this.u.invalidate();
        } else {
            o();
        }
        if (this.y == 2 && i != 2) {
            this.f.setState(b);
            k();
            this.u.postDelayed(this.E, 1200L);
        } else if (i == 1) {
            k();
            this.u.postDelayed(this.E, 1500L);
        }
        this.y = i;
    }

    public void o() {
        int i = this.C;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.A.cancel();
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.A;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.A.setDuration(500L);
        this.A.setStartDelay(0L);
        this.A.start();
    }
}
