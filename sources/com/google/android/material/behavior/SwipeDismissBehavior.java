package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.N.K;
import ivas.gov.bisp.enumeration.di.j;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.OooO0OO<V> {
    public K a;
    public boolean b;
    public int c = 2;
    public float d = 0.5f;
    public float f = 0.0f;
    public float e = 0.5f;
    public final K.aNN g = new OooO00o();

    public class OooO00o extends K.aNN {
        public int a;
        public int b = -1;

        public OooO00o() {
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public boolean c(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.u(view);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public int d(View view, int i, int i2) {
            int width;
            int width2;
            WeakHashMap<View, R> weakHashMap = T.c;
            boolean z = T.aWY.f(view) == 1;
            int i3 = SwipeDismissBehavior.this.c;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width2 = view.getWidth() + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width2 = view.getWidth() + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public int e(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public int f(View view) {
            return view.getWidth();
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void h(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void j(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f) + this.a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.e) + this.a;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0053  */
        /* JADX WARN: Code duplicated, block: B:28:0x005b  */
        /* JADX WARN: Code duplicated, block: B:29:0x005d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0060  */
        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void k(View view, float f, float f2) {
            int left;
            int i;
            int i2;
            this.b = -1;
            int width = view.getWidth();
            boolean z = false;
            if (f != 0.0f) {
                WeakHashMap<View, R> weakHashMap = T.c;
                boolean z2 = T.aWY.f(view) == 1;
                int i3 = SwipeDismissBehavior.this.c;
                if (i3 == 2 || (i3 != 0 ? !(i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f)) : !(!z2 ? f > 0.0f : f < 0.0f))) {
                    left = view.getLeft();
                    i = this.a;
                    if (left < i) {
                        i2 = i - width;
                    } else {
                        i2 = i + width;
                    }
                    z = true;
                } else {
                    i2 = this.a;
                }
            } else {
                if (Math.abs(view.getLeft() - this.a) >= Math.round(view.getWidth() * SwipeDismissBehavior.this.d)) {
                    left = view.getLeft();
                    i = this.a;
                    if (left < i) {
                        i2 = i - width;
                    } else {
                        i2 = i + width;
                    }
                    z = true;
                } else {
                    i2 = this.a;
                }
            }
            if (SwipeDismissBehavior.this.a.w(i2, view.getTop())) {
                OooO0O0 oooO0O0 = new OooO0O0(view, z);
                WeakHashMap<View, R> weakHashMap2 = T.c;
                T.aWX.o(view, oooO0O0);
            } else if (z) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public final View a;
        public final boolean b;

        public OooO0O0(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            K k = SwipeDismissBehavior.this.a;
            if (k == null || !k.c(true)) {
                if (this.b) {
                    Objects.requireNonNull(SwipeDismissBehavior.this);
                }
            } else {
                View view = this.a;
                WeakHashMap<View, R> weakHashMap = T.c;
                T.aWX.o(view, this);
            }
        }
    }

    public static float b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zY = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zY = coordinatorLayout.y(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zY;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!zY) {
            return false;
        }
        if (this.a == null) {
            this.a = new K(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return this.a.v(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aWX.e(v) == 0) {
            T.aWX.t(v, 1);
            T.o(1048576, v);
            T.k(v, 0);
            if (u(v)) {
                T.n(v, al.aXC.h, null, new j(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        K k = this.a;
        if (k == null) {
            return false;
        }
        k.o(motionEvent);
        return true;
    }

    public boolean u(View view) {
        return true;
    }
}
