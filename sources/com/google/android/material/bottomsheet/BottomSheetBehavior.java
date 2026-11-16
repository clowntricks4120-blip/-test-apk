package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.N.K;
import ivas.gov.bisp.enumeration.O.C0019p;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.O.t;
import ivas.gov.bisp.enumeration.P.J;
import ivas.gov.bisp.enumeration.aF.c;
import ivas.gov.bisp.enumeration.aF.h;
import ivas.gov.bisp.enumeration.aF.j;
import ivas.gov.bisp.enumeration.aK.S;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import ivas.gov.bisp.enumeration.p103z.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.OooO0OO<V> {
    public float A;
    public float B;
    public int C;
    public boolean D;
    public boolean E;
    public WeakReference<View> F;
    public boolean G;
    public boolean H;
    public int I;
    public K J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public WeakReference<V> P;
    public int Q;
    public VelocityTracker R;
    public final ArrayList<OooO0OO> S;
    public int T;
    public boolean U;
    public int V;
    public final K.aNN W;
    public Map<View, Integer> X;
    public C0019p a;
    public int b;
    public boolean c;
    public float d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public t v;
    public BottomSheetBehavior<V>.OooO w;
    public ValueAnimator x;
    public int y;
    public int z;

    public class OooO implements Runnable {
        public final View a;
        public boolean b;
        public int c;

        public OooO(View view, int i) {
            this.a = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            K k = BottomSheetBehavior.this.J;
            if (k == null || !k.c(true)) {
                BottomSheetBehavior.this.D(this.c);
            } else {
                View view = this.a;
                WeakHashMap<View, R> weakHashMap = T.c;
                T.aWX.o(view, this);
            }
            this.b = false;
        }
    }

    public class OooO00o implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;

        public OooO00o(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.F(this.a, this.b);
        }
    }

    public class OooO0O0 extends K.aNN {
        public OooO0O0() {
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public boolean c(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.I;
            if (i2 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.T == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.F;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.P;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public int d(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public int e(View view, int i, int i2) {
            int iB = BottomSheetBehavior.this.B();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return r.q(i, iB, bottomSheetBehavior.D ? bottomSheetBehavior.O : bottomSheetBehavior.C);
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public int g(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.D ? bottomSheetBehavior.O : bottomSheetBehavior.C;
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void h(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.H) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void j(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.y(i2);
        }

        @Override // ivas.gov.bisp.enumeration.N.K.aNN
        public void k(View view, float f, float f2) {
            int iB;
            int i;
            int i2;
            if (f2 < 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.c) {
                    iB = bottomSheetBehavior.z;
                } else {
                    int top = view.getTop();
                    Objects.requireNonNull(BottomSheetBehavior.this);
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    i = bottomSheetBehavior2.y;
                    if (top <= i) {
                        iB = bottomSheetBehavior2.B();
                    } else {
                        i2 = 6;
                        iB = i;
                    }
                }
                i2 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.D && bottomSheetBehavior3.I(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (top2 <= (bottomSheetBehavior4.B() + bottomSheetBehavior4.O) / 2) {
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (bottomSheetBehavior5.c) {
                                iB = bottomSheetBehavior5.z;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.B()) < Math.abs(view.getTop() - BottomSheetBehavior.this.y)) {
                                iB = BottomSheetBehavior.this.B();
                            } else {
                                i = BottomSheetBehavior.this.y;
                                i2 = 6;
                                iB = i;
                            }
                            i2 = 3;
                        }
                    }
                    iB = BottomSheetBehavior.this.O;
                    i2 = 5;
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior6.c) {
                        int i3 = bottomSheetBehavior6.y;
                        if (top3 < i3) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior6.C)) {
                                iB = BottomSheetBehavior.this.B();
                                i2 = 3;
                            } else {
                                Objects.requireNonNull(BottomSheetBehavior.this);
                                i = BottomSheetBehavior.this.y;
                            }
                        } else if (Math.abs(top3 - i3) < Math.abs(top3 - BottomSheetBehavior.this.C)) {
                            Objects.requireNonNull(BottomSheetBehavior.this);
                            i = BottomSheetBehavior.this.y;
                        } else {
                            iB = BottomSheetBehavior.this.C;
                            i2 = 4;
                        }
                        i2 = 6;
                        iB = i;
                    } else if (Math.abs(top3 - bottomSheetBehavior6.z) < Math.abs(top3 - BottomSheetBehavior.this.C)) {
                        iB = BottomSheetBehavior.this.z;
                        i2 = 3;
                    } else {
                        iB = BottomSheetBehavior.this.C;
                        i2 = 4;
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior7.c) {
                        iB = bottomSheetBehavior7.C;
                    } else {
                        int top4 = view.getTop();
                        if (Math.abs(top4 - BottomSheetBehavior.this.y) < Math.abs(top4 - BottomSheetBehavior.this.C)) {
                            Objects.requireNonNull(BottomSheetBehavior.this);
                            i = BottomSheetBehavior.this.y;
                            i2 = 6;
                            iB = i;
                        } else {
                            iB = BottomSheetBehavior.this.C;
                        }
                    }
                    i2 = 4;
                }
            }
            BottomSheetBehavior bottomSheetBehavior8 = BottomSheetBehavior.this;
            Objects.requireNonNull(bottomSheetBehavior8);
            bottomSheetBehavior8.J(view, i2, iB, true);
        }
    }

    public static abstract class OooO0OO {
        public abstract void b(View view, float f);

        public abstract void c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.b = 0;
        this.c = true;
        this.j = -1;
        this.k = -1;
        this.w = null;
        this.A = 0.5f;
        this.B = -1.0f;
        this.H = true;
        this.I = 4;
        this.S = new ArrayList<>();
        this.V = -1;
        this.W = new OooO0O0();
    }

    public final void A(V v, al.aXC axc, int i) {
        T.n(v, axc, null, new h(this, i));
    }

    public int B() {
        if (this.c) {
            return this.z;
        }
        return Math.max(this.t, this.r ? 0 : this.s);
    }

    public void C(int i) {
        if (i == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.e == i) {
                return;
            }
            this.g = false;
            this.e = Math.max(0, i);
        }
        M(false);
    }

    public void D(int i) {
        V v;
        if (this.I == i) {
            return;
        }
        this.I = i;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            L(true);
        } else if (i == 6 || i == 5 || i == 4) {
            L(false);
        }
        H(i);
        for (int i2 = 0; i2 < this.S.size(); i2++) {
            this.S.get(i2).c(v, i);
        }
        K();
    }

    public void E(int i) {
        if (i == this.I) {
            return;
        }
        if (this.P != null) {
            G(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.D && i == 5)) {
            this.I = i;
        }
    }

    public void F(View view, int i) {
        int iB;
        int i2;
        if (i == 4) {
            iB = this.C;
        } else if (i == 6) {
            iB = this.y;
            if (this.c && iB <= (i2 = this.z)) {
                i = 3;
                iB = i2;
            }
        } else if (i == 3) {
            iB = B();
        } else if (!this.D || i != 5) {
            return;
        } else {
            iB = this.O;
        }
        J(view, i, iB, false);
    }

    public final void G(int i) {
        V v = this.P.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, R> weakHashMap = T.c;
            if (T.aXa.c(v)) {
                v.post(new OooO00o(v, i));
                return;
            }
        }
        F(v, i);
    }

    public final void H(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.u != z) {
            this.u = z;
            if (this.a == null || (valueAnimator = this.x) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.x.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.x.setFloatValues(1.0f - f, f);
            this.x.start();
        }
    }

    public boolean I(View view, float f) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.C) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.C)) / ((float) x()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        D(2);
        H(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r2.w != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r2.w = new com.google.android.material.bottomsheet.BottomSheetBehavior.OooO(r2, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r5 = r2.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5.b != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5.c = r4;
        r4 = ivas.gov.bisp.enumeration.p081d.T.c;
        ivas.gov.bisp.enumeration.d.T.aWX.o(r3, r5);
        r2.w.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r5.c = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0.w(r3.getLeft(), r5) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J(android.view.View r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            ivas.gov.bisp.enumeration.N.K r0 = r2.J
            if (r0 == 0) goto L56
            if (r6 == 0) goto L11
            int r6 = r3.getLeft()
            boolean r5 = r0.w(r6, r5)
            if (r5 == 0) goto L56
            goto L2e
        L11:
            int r6 = r3.getLeft()
            r0.t = r3
            r1 = -1
            r0.g = r1
            r1 = 0
            boolean r5 = r0.n(r6, r5, r1, r1)
            if (r5 != 0) goto L2c
            int r6 = r0.e
            if (r6 != 0) goto L2c
            android.view.View r6 = r0.t
            if (r6 == 0) goto L2c
            r6 = 0
            r0.t = r6
        L2c:
            if (r5 == 0) goto L56
        L2e:
            r5 = 2
            r2.D(r5)
            r2.H(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$OooO r5 = r2.w
            if (r5 != 0) goto L40
            com.google.android.material.bottomsheet.BottomSheetBehavior$OooO r5 = new com.google.android.material.bottomsheet.BottomSheetBehavior$OooO
            r5.<init>(r3, r4)
            r2.w = r5
        L40:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$OooO r5 = r2.w
            boolean r6 = r5.b
            if (r6 != 0) goto L53
            r5.c = r4
            java.util.WeakHashMap<android.view.View, ivas.gov.bisp.enumeration.d.R> r4 = ivas.gov.bisp.enumeration.p081d.T.c
            ivas.gov.bisp.enumeration.d.T.aWX.o(r3, r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$OooO r3 = r2.w
            r4 = 1
            r3.b = r4
            return
        L53:
            r5.c = r4
            return
        L56:
            r2.D(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.J(android.view.View, int, int, boolean):void");
    }

    public final void K() {
        V v;
        int iE;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        T.o(524288, v);
        T.k(v, 0);
        T.o(262144, v);
        T.k(v, 0);
        T.o(1048576, v);
        T.k(v, 0);
        int i = this.V;
        if (i != -1) {
            T.o(i, v);
            T.k(v, 0);
        }
        if (!this.c && this.I != 6) {
            String string = v.getResources().getString(ivas.gov.bisp.enumeration.R.string.bottomsheet_action_expand_halfway);
            h hVar = new h(this, 6);
            List<al.aXC> listJ = T.j(v);
            int i2 = 0;
            while (true) {
                if (i2 >= listJ.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = T.f;
                        if (i3 >= iArr.length || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < listJ.size(); i6++) {
                            z &= listJ.get(i6).e() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iE = i4;
                    break;
                }
                if (TextUtils.equals(string, listJ.get(i2).f())) {
                    iE = listJ.get(i2).e();
                    break;
                }
                i2++;
            }
            if (iE != -1) {
                T.c(v, new al.aXC(null, iE, string, hVar, null));
            }
            this.V = iE;
        }
        if (this.D && this.I != 5) {
            A(v, al.aXC.h, 5);
        }
        int i7 = this.I;
        if (i7 == 3) {
            A(v, al.aXC.c, this.c ? 4 : 6);
            return;
        }
        if (i7 == 4) {
            A(v, al.aXC.g, this.c ? 3 : 6);
        } else if (i7 == 6) {
            A(v, al.aXC.c, 4);
            A(v, al.aXC.g, 3);
        }
    }

    public final void L(boolean z) {
        WeakReference<V> weakReference = this.P;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.X != null) {
                    return;
                } else {
                    this.X = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.P.get() && z) {
                    this.X.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.X = null;
        }
    }

    public final void M(boolean z) {
        V v;
        if (this.P != null) {
            u();
            if (this.I != 4 || (v = this.P.get()) == null) {
                return;
            }
            if (z) {
                G(this.I);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean c(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int iV = v(i, paddingRight + paddingLeft + i5 + marginLayoutParams.rightMargin + i2, this.j, marginLayoutParams.width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        v.measure(iV, v(i3, paddingBottom + paddingTop + i6 + marginLayoutParams.bottomMargin + i4, this.k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void f(CoordinatorLayout.OooOO0 oooOO0) {
        this.P = null;
        this.J = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void h() {
        this.P = null;
        this.J = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        K k;
        if (!v.isShown() || !this.H) {
            this.G = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.Q = (int) motionEvent.getY();
            if (this.I != 2) {
                WeakReference<View> weakReference = this.F;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.y(view, x, this.Q)) {
                    this.T = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U = true;
                }
            }
            this.G = this.T == -1 && !coordinatorLayout.y(v, x, this.Q);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
            this.T = -1;
            if (this.G) {
                this.G = false;
                return false;
            }
        }
        if (!this.G && (k = this.J) != null && k.v(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.F;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.G || this.I == 1 || coordinatorLayout.y(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.J == null || Math.abs(((float) this.Q) - motionEvent.getY()) <= ((float) this.J.f)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        C0019p c0019p;
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aWX.d(coordinatorLayout) && !T.aWX.d(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.P == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.g) ? false : true;
            if (this.m || this.f32o || this.p || z) {
                J.b(v, new c(this, z));
            }
            this.P = new WeakReference<>(v);
            if (this.i && (c0019p = this.a) != null) {
                T.aWX.s(v, c0019p);
            }
            C0019p c0019p2 = this.a;
            if (c0019p2 != null) {
                float fB = this.B;
                if (fB == -1.0f) {
                    fB = T.aXb.b(v);
                }
                c0019p2.s(fB);
                boolean z2 = this.I == 3;
                this.u = z2;
                this.a.t(z2 ? 0.0f : 1.0f);
            }
            K();
            if (T.aWX.e(v) == 0) {
                T.aWX.t(v, 1);
            }
        }
        if (this.J == null) {
            this.J = new K(coordinatorLayout.getContext(), coordinatorLayout, this.W);
        }
        int top = v.getTop();
        coordinatorLayout.z(v, i);
        this.M = coordinatorLayout.getWidth();
        this.O = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.N = height;
        int i2 = this.O;
        int i3 = this.s;
        if (i2 - height < i3) {
            if (this.r) {
                this.N = i2;
            } else {
                this.N = i2 - i3;
            }
        }
        this.z = Math.max(0, i2 - this.N);
        this.y = (int) ((1.0f - this.A) * this.O);
        u();
        int i4 = this.I;
        if (i4 == 3) {
            v.offsetTopAndBottom(B());
        } else if (i4 == 6) {
            v.offsetTopAndBottom(this.y);
        } else if (this.D && i4 == 5) {
            v.offsetTopAndBottom(this.O);
        } else if (i4 == 4) {
            v.offsetTopAndBottom(this.C);
        } else if (i4 == 1 || i4 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.F = new WeakReference<>(z(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean l(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.F;
        return (weakReference == null || view != weakReference.get() || this.I == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void m(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.F;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < B()) {
                int iB = top - B();
                iArr[1] = iB;
                int i5 = -iB;
                WeakHashMap<View, R> weakHashMap = T.c;
                v.offsetTopAndBottom(i5);
                D(3);
            } else {
                if (!this.H) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, R> weakHashMap2 = T.c;
                v.offsetTopAndBottom(-i2);
                D(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.C;
            if (i4 > i6 && !this.D) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap<View, R> weakHashMap3 = T.c;
                v.offsetTopAndBottom(i8);
                D(4);
            } else {
                if (!this.H) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, R> weakHashMap4 = T.c;
                v.offsetTopAndBottom(-i2);
                D(1);
            }
        }
        y(v.getTop());
        this.K = i2;
        this.L = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void n(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void o(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        OooO0o oooO0o = (OooO0o) parcelable;
        int i = this.b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = oooO0o.f;
            }
            if (i == -1 || (i & 2) == 2) {
                this.c = oooO0o.c;
            }
            if (i == -1 || (i & 4) == 4) {
                this.D = oooO0o.g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.E = oooO0o.h;
            }
        }
        int i2 = oooO0o.b;
        if (i2 == 1 || i2 == 2) {
            this.I = 4;
        } else {
            this.I = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean r(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.K = 0;
        this.L = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.I;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        K k = this.J;
        if (k != null && (this.H || i == 1)) {
            k.o(motionEvent);
        }
        if (actionMasked == 0) {
            this.T = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (this.J != null && ((this.H || this.I == 1) && actionMasked == 2 && !this.G)) {
            float fAbs = Math.abs(this.Q - motionEvent.getY());
            K k2 = this.J;
            if (fAbs > k2.f) {
                k2.e(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.G;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int iB;
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == B()) {
            D(3);
            return;
        }
        WeakReference<View> weakReference = this.F;
        if (weakReference != null && view == weakReference.get() && this.L) {
            if (this.K > 0) {
                if (this.c) {
                    iB = this.z;
                } else {
                    int top3 = v.getTop();
                    int i4 = this.y;
                    if (top3 <= i4) {
                        iB = B();
                    } else {
                        iB = i4;
                        i3 = 6;
                    }
                }
            } else if (this.D) {
                VelocityTracker velocityTracker = this.R;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.d);
                    yVelocity = this.R.getYVelocity(this.T);
                }
                if (I(v, yVelocity)) {
                    iB = this.O;
                    i3 = 5;
                } else if (this.K == 0) {
                    top2 = v.getTop();
                    if (this.c) {
                        i2 = this.y;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.C)) {
                                iB = B();
                            } else {
                                iB = this.y;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.C)) {
                            iB = this.y;
                        } else {
                            iB = this.C;
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.z) < Math.abs(top2 - this.C)) {
                        iB = this.z;
                    } else {
                        iB = this.C;
                        i3 = 4;
                    }
                } else {
                    if (!this.c) {
                        top = v.getTop();
                        if (Math.abs(top - this.y) < Math.abs(top - this.C)) {
                            iB = this.y;
                            i3 = 6;
                        }
                    }
                    iB = this.C;
                    i3 = 4;
                }
            } else if (this.K == 0) {
                top2 = v.getTop();
                if (this.c) {
                    i2 = this.y;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.C)) {
                            iB = B();
                        } else {
                            iB = this.y;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.C)) {
                        iB = this.y;
                    } else {
                        iB = this.C;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.z) < Math.abs(top2 - this.C)) {
                    iB = this.z;
                } else {
                    iB = this.C;
                    i3 = 4;
                }
            } else {
                if (!this.c) {
                    top = v.getTop();
                    if (Math.abs(top - this.y) < Math.abs(top - this.C)) {
                        iB = this.y;
                        i3 = 6;
                    }
                }
                iB = this.C;
                i3 = 4;
            }
            J(v, i3, iB, false);
            this.L = false;
        }
    }

    public final void u() {
        int iX = x();
        if (this.c) {
            this.C = Math.max(this.O - iX, this.z);
        } else {
            this.C = this.O - iX;
        }
    }

    public final int v(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void w(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.i) {
            this.v = t.e(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.bottomSheetStyle, ivas.gov.bisp.enumeration.R.style.Widget_Design_BottomSheet_Modal).e();
            C0019p c0019p = new C0019p(this.v);
            this.a = c0019p;
            c0019p.e.e = new S(context);
            c0019p.w();
            if (z && colorStateList != null) {
                this.a.u(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.a.setTint(typedValue.data);
        }
    }

    public final int x() {
        int i;
        if (this.g) {
            return Math.min(Math.max(this.f, this.O - ((this.M * 9) / 16)), this.N) + this.q;
        }
        return (this.n || this.m || (i = this.l) <= 0) ? this.e + this.q : Math.max(this.e, i + this.h);
    }

    public void y(int i) {
        float f;
        float fB;
        V v = this.P.get();
        if (v == null || this.S.isEmpty()) {
            return;
        }
        int i2 = this.C;
        if (i > i2 || i2 == B()) {
            int i3 = this.C;
            f = i3 - i;
            fB = this.O - i3;
        } else {
            int i4 = this.C;
            f = i4 - i;
            fB = i4 - B();
        }
        float f2 = f / fB;
        for (int i5 = 0; i5 < this.S.size(); i5++) {
            this.S.get(i5).b(v, f2);
        }
    }

    public View z(View view) {
        WeakHashMap<View, R> weakHashMap = T.c;
        if (T.aXb.q(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewZ = z(viewGroup.getChildAt(i));
            if (viewZ != null) {
                return viewZ;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.OooO0OO
    public Parcelable q(CoordinatorLayout coordinatorLayout, V v) {
        return new OooO0o((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public static class OooO0o extends l {
        public static final Parcelable.Creator<OooO0o> CREATOR = new OooO00o();
        public final int b;
        public boolean c;
        public int f;
        public boolean g;
        public boolean h;

        public static final class OooO00o implements Parcelable.ClassLoaderCreator<OooO0o> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final OooO0o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new OooO0o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OooO0o[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new OooO0o(parcel, (ClassLoader) null);
            }
        }

        public OooO0o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readInt();
            this.f = parcel.readInt();
            this.c = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public OooO0o(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.b = bottomSheetBehavior.I;
            this.f = bottomSheetBehavior.e;
            this.c = bottomSheetBehavior.c;
            this.g = bottomSheetBehavior.D;
            this.h = bottomSheetBehavior.E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.b = 0;
        this.c = true;
        this.j = -1;
        this.k = -1;
        this.w = null;
        this.A = 0.5f;
        this.B = -1.0f;
        this.H = true;
        this.I = 4;
        this.S = new ArrayList<>();
        this.V = -1;
        this.W = new OooO0O0();
        this.h = context.getResources().getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.m);
        this.i = typedArrayObtainStyledAttributes.hasValue(17);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        if (zHasValue) {
            w(context, attributeSet, zHasValue, ivas.gov.bisp.enumeration.aL.h.b(context, typedArrayObtainStyledAttributes, 3));
        } else {
            w(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.x.addUpdateListener(new j(this));
        this.B = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            C(i);
        } else {
            C(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.D != z) {
            this.D = z;
            if (!z && this.I == 5) {
                E(4);
            }
            K();
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(12, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.c != z2) {
            this.c = z2;
            if (this.P != null) {
                u();
            }
            D((this.c && this.I == 6) ? 3 : this.I);
            K();
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.H = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.b = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.A = f;
            if (this.P != null) {
                this.y = (int) ((1.0f - f) * this.O);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.t = i2;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.t = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.m = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.f32o = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(16, true);
            typedArrayObtainStyledAttributes.recycle();
            this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
