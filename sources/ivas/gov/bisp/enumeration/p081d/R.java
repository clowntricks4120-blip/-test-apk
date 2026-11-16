package ivas.gov.bisp.enumeration.p081d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import ivas.gov.bisp.enumeration.p087j.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class R {
    private static int a = 0x00000001;
    private static int b;
    public WeakReference<View> c;

    public class aWQ extends AnimatorListenerAdapter {
        private static int a = 0x00000001;
        private static int b;
        public final /* synthetic */ v c;
        public final /* synthetic */ View d;

        public aWQ(R r, v vVar, View view) {
            this.c = vVar;
            this.d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 29;
            int i4 = -(-((i2 & 29) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                this.c.a(this.d);
            } else {
                this.c.a(this.d);
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = a + 97;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                this.c.e(this.d);
                throw null;
            }
            this.c.e(this.d);
            int i3 = b + 34;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & 108) + (i2 | 108)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            v vVar = this.c;
            View view = this.d;
            if (i4 == 0) {
                vVar.c(view);
            } else {
                vVar.c(view);
                int i5 = 5 / 0;
            }
        }
    }

    public class aWR implements ValueAnimator.AnimatorUpdateListener {
        private static int a = 0x00000001;
        private static int b;
        public final /* synthetic */ A c;

        public aWR(R r, A a2, View view) {
            this.c = a2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i = 2 % 2;
            int i2 = b + 11;
            a = i2 % 128;
            int i3 = i2 % 2;
            Object parent = v.this.i.getParent();
            int i4 = b;
            int i5 = i4 & 111;
            int i6 = -(-((i4 ^ 111) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                ((View) parent).invalidate();
                throw null;
            }
            ((View) parent).invalidate();
            int i8 = a;
            int i9 = i8 & 63;
            int i10 = i9 + ((i8 ^ 63) | i9);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    public R(View view) {
        this.c = new WeakReference<>(view);
    }

    public final void d() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (i2 | 103) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            this.c.get();
            throw null;
        }
        View view = this.c.get();
        if (view != null) {
            view.animate().cancel();
            int i7 = a;
            int i8 = ((i7 & (-56)) | ((~i7) & 55)) + ((i7 & 55) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = b;
        int i11 = ((i10 | 69) << 1) - (i10 ^ 69);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public final R e(long j) {
        int i = 2 % 2;
        int i2 = b + 119;
        a = i2 % 128;
        int i3 = i2 % 2;
        View view = this.c.get();
        Object obj = null;
        if (view != null) {
            int i4 = b;
            int i5 = (((i4 ^ 11) | (i4 & 11)) << 1) - (((~i4) & 11) | (i4 & (-12)));
            a = i5 % 128;
            if (i5 % 2 == 0) {
                view.animate().setDuration(j);
                throw null;
            }
            view.animate().setDuration(j);
        }
        int i6 = a;
        int i7 = i6 & 21;
        int i8 = i6 | 21;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public final R g(A a2) {
        aWR awr;
        int i = 2 % 2;
        int i2 = b + 13;
        a = i2 % 128;
        int i3 = i2 % 2;
        View view = this.c.get();
        if (view != null) {
            int i4 = b;
            int i5 = i4 & 1;
            int i6 = (((i4 ^ 1) | i5) << 1) - ((i4 | 1) & (~i5));
            a = i6 % 128;
            int i7 = i6 % 2;
            if (a2 != null) {
                awr = new aWR(this, a2, view);
                int i8 = b;
                int i9 = i8 ^ 39;
                int i10 = (((i8 & 39) | i9) << 1) - i9;
                a = i10 % 128;
                int i11 = i10 % 2;
            } else {
                awr = null;
            }
            view.animate().setUpdateListener(awr);
            int i12 = a + 102;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 5 % 5;
            }
        }
        int i15 = b;
        int i16 = i15 & 3;
        int i17 = -(-((i15 ^ 3) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        a = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 79 / 0;
        }
        return this;
    }

    public final void h(View view, v vVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-26)) | ((~i2) & 25);
        int i4 = -(-((i2 & 25) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (vVar == null) {
            view.animate().setListener(null);
            int i7 = a;
            int i8 = i7 & 15;
            int i9 = -(-((i7 ^ 15) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 93 / 0;
                return;
            }
            return;
        }
        view.animate().setListener(new aWQ(this, vVar, view));
        int i12 = b;
        int i13 = i12 & 47;
        int i14 = ((i12 | 47) & (~i13)) + (i13 << 1);
        int i15 = i14 % 128;
        a = i15;
        int i16 = i14 % 2;
        int i17 = i15 & 99;
        int i18 = i15 | 99;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        b = i19 % 128;
        int i20 = i19 % 2;
    }

    public final R c(float f) {
        int i = 2 % 2;
        int i2 = b + 33;
        a = i2 % 128;
        int i3 = i2 % 2;
        View view = this.c.get();
        if (view != null) {
            int i4 = b;
            int i5 = i4 ^ 41;
            int i6 = ((i4 & 41) | i5) << 1;
            int i7 = -i5;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            view.animate().alpha(f);
            int i10 = b + 89;
            a = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = a;
        int i13 = i12 & 21;
        int i14 = ((((i12 ^ 21) | i13) << 1) - (~(-((i12 | 21) & (~i13))))) - 1;
        b = i14 % 128;
        if (i14 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final R f(v vVar) {
        int i = 2 % 2;
        int i2 = b + 87;
        a = i2 % 128;
        int i3 = i2 % 2;
        View view = this.c.get();
        if (view != null) {
            int i4 = b;
            int i5 = i4 & 123;
            int i6 = i4 | 123;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            a = i7 % 128;
            int i8 = i7 % 2;
            h(view, vVar);
            if (i8 == 0) {
                int i9 = 98 / 0;
            }
        }
        int i10 = a + 105;
        b = i10 % 128;
        int i11 = i10 % 2;
        return this;
    }

    public final R i(float f) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = i3 + ((i2 ^ 65) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        View view = this.c.get();
        if (view != null) {
            int i6 = b;
            int i7 = ((((i6 ^ 11) | (i6 & 11)) << 1) - (~(-(((~i6) & 11) | (i6 & (-12)))))) - 1;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                view.animate().translationY(f);
                throw null;
            }
            view.animate().translationY(f);
        }
        int i8 = b;
        int i9 = (((i8 & (-40)) | ((~i8) & 39)) - (~(-(-((i8 & 39) << 1))))) - 1;
        a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 72 / 0;
        }
        return this;
    }
}
