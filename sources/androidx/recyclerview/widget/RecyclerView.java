package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import ivas.gov.bisp.enumeration.M.al;
import ivas.gov.bisp.enumeration.p081d.C0283j;
import ivas.gov.bisp.enumeration.p081d.L;
import ivas.gov.bisp.enumeration.p081d.P;
import ivas.gov.bisp.enumeration.p081d.T;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ivas.gov.bisp.enumeration.p081d.z {
    public static final Class<?>[] a;
    public static final int[] b = {R.attr.nestedScrollingEnabled};
    public static final Interpolator c;
    public boolean A;
    public boolean B;
    public int C;
    public final AccessibilityManager D;
    public boolean E;
    public boolean F;
    public boolean G;
    public VelocityTracker H;
    public EdgeEffect I;
    public int J;
    public int K;
    public OooOOO L;
    public EdgeEffect M;
    public EdgeEffect N;
    public OooOOOO O;
    public EdgeEffect P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int aA;
    public final int[] aB;
    public w aC;
    public final int aa;
    public final int ab;
    public float ac;
    public float ad;
    public boolean ae;
    public final oo0o0Oo af;
    public q ag;
    public q.aNf ah;
    public final o0Oo0oo ai;
    public o00O0O aj;
    public boolean ak;
    public List<o00O0O> al;
    public boolean am;
    public OooOOOO.OooO0O0 an;
    public o000oOoO ao;
    public OooOOO0 ap;
    public final int[] aq;
    public P ar;
    public final int[] as;
    public Runnable at;
    public final List<o0O0O00> au;
    public final int[] av;
    public final A.aNj aw;
    public boolean ax;
    public boolean ay;
    public int az;
    public final Runnable d;
    public final o00oO0o e;
    public final o00Ooo f;
    public o0ooOOo g;
    public C0012b h;
    public C0011a i;
    public final A j;
    public boolean k;
    public final Rect l;
    public final Rect m;
    public final RectF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Oooo000 f25o;
    public OooO p;
    public oo000o q;
    public final List<oo000o> r;
    public final ArrayList<o0OoOo0> s;
    public final ArrayList<OooOo> t;
    public o0OoOo0 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public static abstract class OooO<VH extends o0O0O00> {
        public final OooOO0 a = new OooOO0();
        public boolean b = false;
        public int c = 1;

        public abstract int b();

        public long c(int i) {
            return -1L;
        }

        public int d(int i) {
            return 0;
        }

        public final void e(int i) {
            this.a.e(i, 1);
        }

        public abstract VH f(ViewGroup viewGroup, int i);

        public abstract void g(VH vh, int i);
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.y || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.x) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.B) {
                recyclerView2.v = true;
            } else {
                recyclerView2.r();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OooOOOO oooOOOO = RecyclerView.this.O;
            if (oooOOOO != null) {
                o oVar = (o) oooOOOO;
                boolean z = !oVar.j.isEmpty();
                boolean z2 = !oVar.k.isEmpty();
                boolean z3 = !oVar.l.isEmpty();
                boolean z4 = !oVar.i.isEmpty();
                if (z || z2 || z4 || z3) {
                    for (o0O0O00 o0o0o00 : oVar.j) {
                        View view = o0o0o00.c;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        oVar.s.add(o0o0o00);
                        viewPropertyAnimatorAnimate.setDuration(oVar.d).alpha(0.0f).setListener(new f(oVar, o0o0o00, viewPropertyAnimatorAnimate, view)).start();
                    }
                    oVar.j.clear();
                    if (z2) {
                        ArrayList<o.aNc> arrayList = new ArrayList<>();
                        arrayList.addAll(oVar.k);
                        oVar.f29o.add(arrayList);
                        oVar.k.clear();
                        e eVar = new e(oVar, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).a.c;
                            long j = oVar.d;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                            T.aWX.n(view2, eVar, j);
                        } else {
                            eVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<o.aNb> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(oVar.l);
                        oVar.n.add(arrayList2);
                        oVar.l.clear();
                        RunnableC0013c runnableC0013c = new RunnableC0013c(oVar, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).a.c;
                            long j2 = oVar.d;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                            T.aWX.n(view3, runnableC0013c, j2);
                        } else {
                            runnableC0013c.run();
                        }
                    }
                    if (z4) {
                        ArrayList<o0O0O00> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(oVar.i);
                        oVar.m.add(arrayList3);
                        oVar.i.clear();
                        d dVar = new d(oVar, arrayList3);
                        if (z || z2 || z3) {
                            long j3 = z ? oVar.d : 0L;
                            long jMax = Math.max(z2 ? oVar.f : 0L, z3 ? oVar.e : 0L);
                            View view4 = arrayList3.get(0).c;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                            T.aWX.n(view4, dVar, jMax + j3);
                        } else {
                            dVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.ax = false;
        }
    }

    public class OooO0OO implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0o implements A.aNj {
        public OooO0o() {
        }

        public void b(o0O0O00 o0o0o00, OooOOOO.OooO0OO oooO0OO, OooOOOO.OooO0OO oooO0OO2) {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            o0o0o00.w(false);
            z zVar = (z) recyclerView.O;
            Objects.requireNonNull(zVar);
            if (oooO0OO == null || ((i = oooO0OO.a) == (i2 = oooO0OO2.a) && oooO0OO.b == oooO0OO2.b)) {
                o oVar = (o) zVar;
                oVar.n(o0o0o00);
                o0o0o00.c.setAlpha(0.0f);
                oVar.i.add(o0o0o00);
            } else if (!zVar.j(o0o0o00, i, oooO0OO.b, i2, oooO0OO2.b)) {
                return;
            }
            recyclerView.bc();
        }

        public void c(o0O0O00 o0o0o00, OooOOOO.OooO0OO oooO0OO, OooOOOO.OooO0OO oooO0OO2) {
            RecyclerView.this.f.l(o0o0o00);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m(o0o0o00);
            o0o0o00.w(false);
            z zVar = (z) recyclerView.O;
            Objects.requireNonNull(zVar);
            int i = oooO0OO.a;
            int i2 = oooO0OO.b;
            View view = o0o0o00.c;
            int left = oooO0OO2 == null ? view.getLeft() : oooO0OO2.a;
            int top = oooO0OO2 == null ? view.getTop() : oooO0OO2.b;
            if (o0o0o00.p() || (i == left && i2 == top)) {
                o oVar = (o) zVar;
                oVar.n(o0o0o00);
                oVar.j.add(o0o0o00);
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                if (!zVar.j(o0o0o00, i, i2, left, top)) {
                    return;
                }
            }
            recyclerView.bc();
        }
    }

    public static class OooOO0 extends Observable<OooOO0O> {
        public boolean b() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void c() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOO0O) ((Observable) this).mObservers.get(size)).b();
            }
        }

        public void d(int i, int i2) {
            int size = ((Observable) this).mObservers.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                } else {
                    ((OooOO0O) ((Observable) this).mObservers.get(size)).c(i, i2, null);
                }
            }
        }

        public void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOO0O) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }
    }

    public static abstract class OooOO0O {
        public void b() {
        }

        public void c(int i, int i2, Object obj) {
        }

        public void d(int i, int i2) {
        }
    }

    public static class OooOOO {
        public EdgeEffect b(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public interface OooOOO0 {
        int b(int i, int i2);
    }

    public static abstract class OooOOOO {
        public OooO0O0 a = null;
        public ArrayList<OooO00o> b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long f = 250;
        public long e = 250;

        public interface OooO00o {
            void b();
        }

        public interface OooO0O0 {
        }

        public static class OooO0OO {
            public int a;
            public int b;
        }

        public static int b(o0O0O00 o0o0o00) {
            int i = o0o0o00.k;
            int i2 = i & 14;
            if (o0o0o00.m()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i2;
            }
            int i3 = o0o0o00.f;
            int i4 = o0o0o00.i();
            return (i3 == -1 || i4 == -1 || i3 == i4) ? i2 : i2 | 2048;
        }

        public abstract boolean c(o0O0O00 o0o0o00, o0O0O00 o0o0o01, OooO0OO oooO0OO, OooO0OO oooO0OO2);

        public final void d(o0O0O00 o0o0o00) {
            OooO0O0 oooO0O0 = this.a;
            if (oooO0O0 != null) {
                OooOo00 oooOo00 = (OooOo00) oooO0O0;
                Objects.requireNonNull(oooOo00);
                boolean z = true;
                o0o0o00.w(true);
                if (o0o0o00.j != null && o0o0o00.b == null) {
                    o0o0o00.j = null;
                }
                o0o0o00.b = null;
                if ((o0o0o00.k & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = o0o0o00.c;
                recyclerView.ai();
                C0012b c0012b = recyclerView.h;
                int iIndexOfChild = ((x) c0012b.a).a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    c0012b.m(view);
                } else if (c0012b.b.e(iIndexOfChild)) {
                    c0012b.b.f(iIndexOfChild);
                    c0012b.m(view);
                    ((x) c0012b.a).d(iIndexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    o0O0O00 o0o0o00J = RecyclerView.j(view);
                    recyclerView.f.l(o0o0o00J);
                    recyclerView.f.j(o0o0o00J);
                }
                recyclerView.al(!z);
                if (z || !o0o0o00.q()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(o0o0o00.c, false);
            }
        }

        public final void e() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).b();
            }
            this.b.clear();
        }

        public abstract void f();

        public abstract void g(o0O0O00 o0o0o00);

        public abstract boolean h();

        public OooO0OO i(o0O0O00 o0o0o00) {
            OooO0OO oooO0OO = new OooO0OO();
            View view = o0o0o00.c;
            oooO0OO.a = view.getLeft();
            oooO0OO.b = view.getTop();
            view.getRight();
            view.getBottom();
            return oooO0OO;
        }
    }

    public static abstract class OooOo {
        public void b(Rect rect, View view, RecyclerView recyclerView, o0Oo0oo o0oo0oo) {
            ((Oooo0) view.getLayoutParams()).f();
            rect.set(0, 0, 0, 0);
        }

        public void c(Canvas canvas, RecyclerView recyclerView, o0Oo0oo o0oo0oo) {
        }

        public void d(Canvas canvas, RecyclerView recyclerView, o0Oo0oo o0oo0oo) {
        }
    }

    public class OooOo00 implements OooOOOO.OooO0O0 {
        public OooOo00() {
        }
    }

    public static abstract class Oooo000 {
        public boolean a;
        public C0012b b;
        public RecyclerView c;
        public B d;
        public B e;
        public boolean f;
        public o0OOO0o g;
        public boolean h;
        public boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f26o;

        public class OooO00o implements B.aNl {
            public OooO00o() {
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int a(View view) {
                return Oooo000.this.D(view) - ((ViewGroup.MarginLayoutParams) ((Oooo0) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public View b(int i) {
                return Oooo000.this.A(i);
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int c() {
                return Oooo000.this.Q();
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int d(View view) {
                return Oooo000.this.J(view) + ((ViewGroup.MarginLayoutParams) ((Oooo0) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int e() {
                Oooo000 oooo000 = Oooo000.this;
                return oooo000.m - oooo000.R();
            }
        }

        public class OooO0O0 implements B.aNl {
            public OooO0O0() {
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int a(View view) {
                return Oooo000.this.K(view) - ((ViewGroup.MarginLayoutParams) ((Oooo0) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public View b(int i) {
                return Oooo000.this.A(i);
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int c() {
                return Oooo000.this.H();
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int d(View view) {
                return Oooo000.this.C(view) + ((ViewGroup.MarginLayoutParams) ((Oooo0) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.B.aNl
            public int e() {
                Oooo000 oooo000 = Oooo000.this;
                return oooo000.f26o - oooo000.O();
            }
        }

        public interface OooO0OO {
        }

        public static class OooO0o {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public Oooo000() {
            OooO00o oooO00o = new OooO00o();
            OooO0O0 oooO0O0 = new OooO0O0();
            this.d = new B(oooO00o);
            this.e = new B(oooO0O0);
            this.f = false;
            this.h = false;
            this.i = true;
            this.a = true;
        }

        public static int b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001a  */
        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:20:0x002d  */
        public static int c(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static OooO0o d(Context context, AttributeSet attributeSet, int i, int i2) {
            OooO0o oooO0o = new OooO0o();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ivas.gov.bisp.enumeration.O.i.i, i, i2);
            oooO0o.a = typedArrayObtainStyledAttributes.getInt(0, 1);
            oooO0o.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            oooO0o.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            oooO0o.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return oooO0o;
        }

        public static boolean e(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public View A(int i) {
            C0012b c0012b = this.b;
            if (c0012b == null) {
                return null;
            }
            return ((x) c0012b.a).b(c0012b.g(i));
        }

        public int B(o00Ooo o00ooo, o0Oo0oo o0oo0oo) {
            return -1;
        }

        public int C(View view) {
            return view.getBottom() + ((Oooo0) view.getLayoutParams()).b.bottom;
        }

        public int D(View view) {
            return view.getLeft() - ((Oooo0) view.getLayoutParams()).b.left;
        }

        public void E(View view, Rect rect) {
            int[] iArr = RecyclerView.b;
            Oooo0 oooo0 = (Oooo0) view.getLayoutParams();
            Rect rect2 = oooo0.b;
            int left = view.getLeft();
            int i = rect2.left;
            int i2 = ((ViewGroup.MarginLayoutParams) oooo0).leftMargin;
            int top = view.getTop();
            int i3 = rect2.top;
            int i4 = ((ViewGroup.MarginLayoutParams) oooo0).topMargin;
            int right = view.getRight();
            int i5 = rect2.right;
            rect.set((left - i) - i2, (top - i3) - i4, right + i5 + ((ViewGroup.MarginLayoutParams) oooo0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oooo0).bottomMargin);
        }

        public int F(View view) {
            Rect rect = ((Oooo0) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int G(View view) {
            Rect rect = ((Oooo0) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int H() {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int I() {
            RecyclerView recyclerView = this.c;
            OooO adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.b();
            }
            return 0;
        }

        public int J(View view) {
            return view.getRight() + ((Oooo0) view.getLayoutParams()).b.right;
        }

        public int K(View view) {
            return view.getTop() - ((Oooo0) view.getLayoutParams()).b.top;
        }

        public View L() {
            View focusedChild;
            RecyclerView recyclerView = this.c;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.b.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int M() {
            RecyclerView recyclerView = this.c;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            return T.aWY.f(recyclerView);
        }

        public int N() {
            RecyclerView recyclerView = this.c;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            return T.aWX.f(recyclerView);
        }

        public int O() {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int P() {
            RecyclerView recyclerView = this.c;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            return T.aWX.h(recyclerView);
        }

        public int Q() {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int R() {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void S(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((Oooo0) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.c != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.c.n;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int T(View view) {
            return ((Oooo0) view.getLayoutParams()).f();
        }

        public int U(o00Ooo o00ooo, o0Oo0oo o0oo0oo) {
            return -1;
        }

        public boolean V() {
            return false;
        }

        public void W(View view, int i, int i2, int i3, int i4) {
            Oooo0 oooo0 = (Oooo0) view.getLayoutParams();
            Rect rect = oooo0.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) oooo0).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) oooo0).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) oooo0).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) oooo0).bottomMargin);
        }

        public void X(int i) {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                int iH = recyclerView.h.h();
                for (int i2 = 0; i2 < iH; i2++) {
                    recyclerView.h.f(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void Y(int i) {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                int iH = recyclerView.h.h();
                for (int i2 = 0; i2 < iH; i2++) {
                    recyclerView.h.f(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void Z(OooO oooO, OooO oooO2) {
        }

        public void aA(RecyclerView recyclerView) {
            aI(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void aB(int i) {
        }

        public int aC(int i, o00Ooo o00ooo, o0Oo0oo o0oo0oo) {
            return 0;
        }

        public void aD(o00Ooo o00ooo, o0Oo0oo o0oo0oo) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* JADX WARN: Code duplicated, block: B:11:0x006c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0072  */
        /* JADX WARN: Code duplicated, block: B:15:0x0078  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:24:0x00ab A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        public boolean aE(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int i;
            View focusedChild;
            int i2;
            int iR;
            Rect rect2;
            int iQ = Q();
            int iH = H();
            int i3 = this.m;
            int iR2 = R();
            int i4 = this.f26o;
            int iO = O();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i5 = left - iQ;
            int iMin = Math.min(0, i5);
            int i6 = top - iH;
            int iMin2 = Math.min(0, i6);
            int i7 = (iWidth + left) - (i3 - iR2);
            int iMax = Math.max(0, i7);
            int iMax2 = Math.max(0, (iHeight + top) - (i4 - iO));
            if (M() == 1) {
                if (iMax != 0) {
                    i = iMax;
                } else {
                    iMin = Math.max(iMin, i7);
                }
                if (iMin2 == 0) {
                    iMin2 = Math.min(i6, iMax2);
                }
                if (z2) {
                    focusedChild = recyclerView.getFocusedChild();
                    if (focusedChild != null) {
                        int iQ2 = Q();
                        int iH2 = H();
                        i2 = this.m;
                        iR = R();
                        int i8 = this.f26o;
                        int iO2 = O();
                        rect2 = this.c.l;
                        E(focusedChild, rect2);
                        if (rect2.left - i < i2 - iR && rect2.right - i > iQ2 && rect2.top - iMin2 < i8 - iO2 && rect2.bottom - iMin2 > iH2) {
                            if (i == 0) {
                            }
                            if (z) {
                                recyclerView.scrollBy(i, iMin2);
                            } else {
                                recyclerView.aj(i, iMin2, null, Integer.MIN_VALUE, false);
                            }
                            return true;
                        }
                    }
                } else if (i == 0 || iMin2 != 0) {
                    if (z) {
                        recyclerView.scrollBy(i, iMin2);
                    } else {
                        recyclerView.aj(i, iMin2, null, Integer.MIN_VALUE, false);
                    }
                    return true;
                }
                return false;
            }
            if (iMin == 0) {
                iMin = Math.min(i5, iMax);
            }
            i = iMin;
            if (iMin2 == 0) {
                iMin2 = Math.min(i6, iMax2);
            }
            if (z2) {
                if (i == 0) {
                }
                if (z) {
                    recyclerView.scrollBy(i, iMin2);
                } else {
                    recyclerView.aj(i, iMin2, null, Integer.MIN_VALUE, false);
                }
                return true;
            }
            focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iQ3 = Q();
                int iH3 = H();
                i2 = this.m;
                iR = R();
                int i9 = this.f26o;
                int iO3 = O();
                rect2 = this.c.l;
                E(focusedChild, rect2);
                if (rect2.left - i < i2 - iR) {
                    if (i == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i, iMin2);
                    } else {
                        recyclerView.aj(i, iMin2, null, Integer.MIN_VALUE, false);
                    }
                    return true;
                }
            }
            return false;
        }

        public void aF() {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int aG(int i, o00Ooo o00ooo, o0Oo0oo o0oo0oo) {
            return 0;
        }

        public void aH(View view, o00Ooo o00ooo) {
            C0012b c0012b = this.b;
            int iIndexOfChild = ((x) c0012b.a).a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (c0012b.b.f(iIndexOfChild)) {
                    c0012b.m(view);
                }
                ((x) c0012b.a).d(iIndexOfChild);
            }
            o00ooo.i(view);
        }

        public void aI(int i, int i2) {
            this.m = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.b;
            }
            this.f26o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.b;
            }
        }

        public void aJ(o0Oo0oo o0oo0oo) {
        }

        public void aa(RecyclerView recyclerView, o00Ooo o00ooo) {
        }

        public View ab(View view, int i, o00Ooo o00ooo, o0Oo0oo o0oo0oo) {
            return null;
        }

        public void ac(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.c;
            o00Ooo o00ooo = recyclerView.f;
            o0Oo0oo o0oo0oo = recyclerView.ai;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.c.canScrollVertically(-1) && !this.c.canScrollHorizontally(-1) && !this.c.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            OooO oooO = this.c.p;
            if (oooO != null) {
                accessibilityEvent.setItemCount(oooO.b());
            }
        }

        public void ad(View view, al alVar) {
            o0O0O00 o0o0o00J = RecyclerView.j(view);
            if (o0o0o00J == null || o0o0o00J.p() || this.b.l(o0o0o00J.c)) {
                return;
            }
            RecyclerView recyclerView = this.c;
            ae(recyclerView.f, recyclerView.ai, view, alVar);
        }

        public void ae(o00Ooo o00ooo, o0Oo0oo o0oo0oo, View view, al alVar) {
        }

        public void af(RecyclerView recyclerView, int i, int i2) {
        }

        public void ag(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void ah(RecyclerView recyclerView) {
        }

        public void ai(RecyclerView recyclerView, int i, int i2) {
        }

        public void aj(RecyclerView recyclerView, int i, int i2, Object obj) {
        }

        public boolean ak(View view, int i, int i2, Oooo0 oooo0) {
            return (this.i && e(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) oooo0).width) && e(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) oooo0).height)) ? false : true;
        }

        public void al(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.c = null;
                this.b = null;
                this.m = 0;
                this.f26o = 0;
            } else {
                this.c = recyclerView;
                this.b = recyclerView.h;
                this.m = recyclerView.getWidth();
                this.f26o = recyclerView.getHeight();
            }
            this.l = 1073741824;
            this.n = 1073741824;
        }

        public boolean am(View view, int i, int i2, Oooo0 oooo0) {
            return (!view.isLayoutRequested() && this.i && e(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) oooo0).width) && e(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) oooo0).height)) ? false : true;
        }

        public boolean an() {
            return false;
        }

        public void ao(o0OOO0o o0ooo0o) {
            o0OOO0o o0ooo0o2 = this.g;
            if (o0ooo0o2 != null && o0ooo0o != o0ooo0o2 && o0ooo0o2.f) {
                o0ooo0o2.d();
            }
            this.g = o0ooo0o;
            RecyclerView recyclerView = this.c;
            recyclerView.af.d();
            o0ooo0o.b = recyclerView;
            o0ooo0o.c = this;
            int i = o0ooo0o.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.ai.b = i;
            o0ooo0o.f = true;
            o0ooo0o.d = true;
            o0ooo0o.e = recyclerView.f25o.v(i);
            o0ooo0o.b.af.b();
        }

        public void ap(RecyclerView recyclerView, o0Oo0oo o0oo0oo, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public boolean aq() {
            return false;
        }

        public void ar(int i, int i2) {
            int iW = w();
            if (iW == 0) {
                this.c.t(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < iW; i7++) {
                View viewA = A(i7);
                Rect rect = this.c.l;
                E(viewA, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i6) {
                    i6 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.c.l.set(i3, i5, i6, i4);
            az(this.c.l, i, i2);
        }

        public void as(Parcelable parcelable) {
        }

        public Parcelable at() {
            return null;
        }

        public void au(int i) {
        }

        public void av(o00Ooo o00ooo) {
            for (int iW = w() - 1; iW >= 0; iW--) {
                if (!RecyclerView.j(A(iW)).v()) {
                    ax(iW, o00ooo);
                }
            }
        }

        public void aw(int i) {
            C0012b c0012b;
            int iG;
            View viewB;
            if (A(i) == null || (viewB = ((x) c0012b.a).b((iG = (c0012b = this.b).g(i)))) == null) {
                return;
            }
            if (c0012b.b.f(iG)) {
                c0012b.m(viewB);
            }
            ((x) c0012b.a).d(iG);
        }

        public void ax(int i, o00Ooo o00ooo) {
            View viewA = A(i);
            aw(i);
            o00ooo.i(viewA);
        }

        public void ay(o00Ooo o00ooo) {
            int size = o00ooo.a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = o00ooo.a.get(i).c;
                o0O0O00 o0o0o00J = RecyclerView.j(view);
                if (!o0o0o00J.v()) {
                    o0o0o00J.w(false);
                    if (o0o0o00J.q()) {
                        this.c.removeDetachedView(view, false);
                    }
                    OooOOOO oooOOOO = this.c.O;
                    if (oooOOOO != null) {
                        oooOOOO.g(o0o0o00J);
                    }
                    o0o0o00J.w(true);
                    o0O0O00 o0o0o00J2 = RecyclerView.j(view);
                    o0o0o00J2.n = null;
                    o0o0o00J2.p = false;
                    o0o0o00J2.g();
                    o00ooo.j(o0o0o00J2);
                }
            }
            o00ooo.a.clear();
            ArrayList<o0O0O00> arrayList = o00ooo.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.c.invalidate();
            }
        }

        public void az(Rect rect, int i, int i2) {
            int iWidth = rect.width();
            int iQ = Q();
            int iR = R();
            int iHeight = rect.height();
            int iH = H();
            int iO = O();
            this.c.setMeasuredDimension(b(i, iR + iQ + iWidth, P()), b(i2, iO + iH + iHeight, N()));
        }

        public void f(int i, int i2, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
        }

        public void g(View view) {
            h(view, -1, false);
        }

        public final void h(View view, int i, boolean z) {
            o0O0O00 o0o0o00J = RecyclerView.j(view);
            if (z || o0o0o00J.p()) {
                this.c.j.b(o0o0o00J);
            } else {
                this.c.j.f(o0o0o00J);
            }
            Oooo0 oooo0 = (Oooo0) view.getLayoutParams();
            if (o0o0o00J.x() || o0o0o00J.o()) {
                if (o0o0o00J.o()) {
                    o0o0o00J.n.l(o0o0o00J);
                } else {
                    o0o0o00J.g();
                }
                this.b.d(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.c) {
                    int iK = this.b.k(view);
                    if (i == -1) {
                        i = this.b.h();
                    }
                    if (iK == -1) {
                        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sbW.append(this.c.indexOfChild(view));
                        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this.c, sbW));
                    }
                    if (iK != i) {
                        Oooo000 oooo000 = this.c.f25o;
                        View viewA = oooo000.A(iK);
                        if (viewA == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot move a child from non-existing index:");
                            sb.append(iK);
                            sb.append(oooo000.c.toString());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        oooo000.A(iK);
                        oooo000.b.e(iK);
                        Oooo0 oooo1 = (Oooo0) viewA.getLayoutParams();
                        o0O0O00 o0o0o00J2 = RecyclerView.j(viewA);
                        if (o0o0o00J2.p()) {
                            oooo000.c.j.b(o0o0o00J2);
                        } else {
                            oooo000.c.j.f(o0o0o00J2);
                        }
                        oooo000.b.d(viewA, i, oooo1, o0o0o00J2.p());
                    }
                } else {
                    this.b.c(view, i, false);
                    oooo0.c = true;
                    o0OOO0o o0ooo0o = this.g;
                    if (o0ooo0o != null && o0ooo0o.f) {
                        Objects.requireNonNull(o0ooo0o.b);
                        o0O0O00 o0o0o00J3 = RecyclerView.j(view);
                        if ((o0o0o00J3 != null ? o0o0o00J3.h() : -1) == o0ooo0o.a) {
                            o0ooo0o.e = view;
                        }
                    }
                }
            }
            if (oooo0.d) {
                o0o0o00J.c.invalidate();
                oooo0.d = false;
            }
        }

        public void i(String str) {
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                recyclerView.l(str);
            }
        }

        public boolean j() {
            return false;
        }

        public boolean k() {
            return false;
        }

        public boolean l(Oooo0 oooo0) {
            return oooo0 != null;
        }

        public void m(int i, OooO0OO oooO0OO) {
        }

        public int n(o0Oo0oo o0oo0oo) {
            return 0;
        }

        public int o(o0Oo0oo o0oo0oo) {
            return 0;
        }

        public int p(o0Oo0oo o0oo0oo) {
            return 0;
        }

        public int q(o0Oo0oo o0oo0oo) {
            return 0;
        }

        public int r(o0Oo0oo o0oo0oo) {
            return 0;
        }

        public int s(o0Oo0oo o0oo0oo) {
            return 0;
        }

        public View t(View view) {
            View viewG;
            RecyclerView recyclerView = this.c;
            if (recyclerView == null || (viewG = recyclerView.G(view)) == null || this.b.c.contains(viewG)) {
                return null;
            }
            return viewG;
        }

        public void u(o00Ooo o00ooo) {
            int iW = w();
            while (true) {
                iW--;
                if (iW < 0) {
                    return;
                }
                View viewA = A(iW);
                o0O0O00 o0o0o00J = RecyclerView.j(viewA);
                if (!o0o0o00J.v()) {
                    if (!o0o0o00J.m() || o0o0o00J.p() || this.c.p.b) {
                        A(iW);
                        this.b.e(iW);
                        o00ooo.b(viewA);
                        this.c.j.f(o0o0o00J);
                    } else {
                        aw(iW);
                        o00ooo.j(o0o0o00J);
                    }
                }
            }
        }

        public View v(int i) {
            int iW = w();
            for (int i2 = 0; i2 < iW; i2++) {
                View viewA = A(i2);
                o0O0O00 o0o0o00J = RecyclerView.j(viewA);
                if (o0o0o00J != null && o0o0o00J.h() == i && !o0o0o00J.v() && (this.c.ai.h || !o0o0o00J.p())) {
                    return viewA;
                }
            }
            return null;
        }

        public int w() {
            C0012b c0012b = this.b;
            if (c0012b != null) {
                return c0012b.h();
            }
            return 0;
        }

        public Oooo0 x(Context context, AttributeSet attributeSet) {
            return new Oooo0(context, attributeSet);
        }

        public abstract Oooo0 y();

        public Oooo0 z(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof Oooo0) {
                return new Oooo0((Oooo0) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new Oooo0((ViewGroup.MarginLayoutParams) layoutParams) : new Oooo0(layoutParams);
        }
    }

    public static abstract class o000oOoO {
    }

    public static abstract class o00O0O {
        public void b(RecyclerView recyclerView, int i) {
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class o00Oo0 {
        public SparseArray<OooO00o> a = new SparseArray<>();
        public int b = 0;

        public static class OooO00o {
            public final ArrayList<o0O0O00> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                this.a.valueAt(i).a.clear();
            }
        }

        public final OooO00o c(int i) {
            OooO00o oooO00o = this.a.get(i);
            if (oooO00o != null) {
                return oooO00o;
            }
            OooO00o oooO00o2 = new OooO00o();
            this.a.put(i, oooO00o2);
            return oooO00o2;
        }

        public long d(long j, long j2) {
            return j == 0 ? j2 : (j2 / 4) + ((j / 4) * 3);
        }

        public void e(int i, int i2) {
            OooO00o oooO00oC = c(i);
            oooO00oC.b = i2;
            ArrayList<o0O0O00> arrayList = oooO00oC.a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public final class o00Ooo {
        public final ArrayList<o0O0O00> a;
        public ArrayList<o0O0O00> b;
        public final ArrayList<o0O0O00> c;
        public final List<o0O0O00> d;
        public int e;
        public int f;
        public o00Oo0 g;

        public o00Ooo() {
            ArrayList<o0O0O00> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.f = 2;
            this.e = 2;
        }

        public final void b(View view) {
            OooOOOO oooOOOO;
            o0O0O00 o0o0o00J = RecyclerView.j(view);
            if (!o0o0o00J.k(12) && o0o0o00J.r() && (oooOOOO = RecyclerView.this.O) != null) {
                o oVar = (o) oooOOOO;
                if (o0o0o00J.j().isEmpty() && oVar.g && !o0o0o00J.m()) {
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    o0o0o00J.n = this;
                    o0o0o00J.p = true;
                    this.b.add(o0o0o00J);
                    return;
                }
            }
            if (o0o0o00J.m() && !o0o0o00J.p() && !RecyclerView.this.p.b) {
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, ivas.gov.bisp.enumeration.p091n.j.w("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            o0o0o00J.n = this;
            o0o0o00J.p = false;
            this.a.add(o0o0o00J);
        }

        public final void c(o0O0O00 o0o0o00, boolean z) {
            RecyclerView.h(o0o0o00);
            View view = o0o0o00.c;
            w wVar = RecyclerView.this.aC;
            if (wVar != null) {
                w.aNy any = wVar.b;
                T.q(view, any instanceof w.aNy ? any.b.remove(view) : null);
            }
            if (z) {
                oo000o oo000oVar = RecyclerView.this.q;
                if (oo000oVar != null) {
                    oo000oVar.b(o0o0o00);
                }
                int size = RecyclerView.this.r.size();
                for (int i = 0; i < size; i++) {
                    RecyclerView.this.r.get(i).b(o0o0o00);
                }
                RecyclerView recyclerView = RecyclerView.this;
                OooO oooO = recyclerView.p;
                if (recyclerView.ai != null) {
                    recyclerView.j.h(o0o0o00);
                }
            }
            o0o0o00.t = null;
            o0o0o00.r = null;
            o00Oo0 o00oo0F = f();
            Objects.requireNonNull(o00oo0F);
            int i2 = o0o0o00.g;
            ArrayList<o0O0O00> arrayList = o00oo0F.c(i2).a;
            if (o00oo0F.a.get(i2).b > arrayList.size()) {
                o0o0o00.s();
                arrayList.add(o0o0o00);
            }
        }

        public final void d() {
            this.a.clear();
            h();
        }

        public final int e(int i) {
            if (i >= 0 && i < RecyclerView.this.ai.c()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.ai.h ? i : recyclerView.i.g(i, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.ai.c());
            throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb));
        }

        public final o00Oo0 f() {
            if (this.g == null) {
                this.g = new o00Oo0();
            }
            return this.g;
        }

        public final void g(int i) {
            c(this.c.get(i), true);
            this.c.remove(i);
        }

        public final void h() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                g(size);
            }
            this.c.clear();
            int[] iArr = RecyclerView.b;
            q.aNf anf = RecyclerView.this.ah;
            int[] iArr2 = anf.c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            anf.d = 0;
        }

        public final void i(View view) {
            o0O0O00 o0o0o00J = RecyclerView.j(view);
            if (o0o0o00J.q()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (o0o0o00J.o()) {
                o0o0o00J.n.l(o0o0o00J);
            } else if (o0o0o00J.x()) {
                o0o0o00J.g();
            }
            j(o0o0o00J);
            if (RecyclerView.this.O == null || o0o0o00J.n()) {
                return;
            }
            RecyclerView.this.O.g(o0o0o00J);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002e  */
        public final void j(o0O0O00 o0o0o00) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            boolean z4 = false;
            if (o0o0o00.o() || o0o0o00.c.getParent() != null) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Scrapped or attached views may not be recycled. isScrap:");
                sbW.append(o0o0o00.o());
                sbW.append(" isAttached:");
                sbW.append(o0o0o00.c.getParent() != null);
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sbW));
            }
            if (o0o0o00.q()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(o0o0o00);
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb));
            }
            if (o0o0o00.v()) {
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, ivas.gov.bisp.enumeration.p091n.j.w("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            if ((o0o0o00.k & 16) == 0) {
                View view = o0o0o00.c;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                if (T.aWX.b(view)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            OooO oooO = RecyclerView.this.p;
            if (o0o0o00.n()) {
                if (this.e <= 0 || o0o0o00.k(526)) {
                    z2 = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.e && size > 0) {
                        g(0);
                        size--;
                    }
                    int[] iArr = RecyclerView.b;
                    if (size > 0 && !RecyclerView.this.ah.d(o0o0o00.e)) {
                        while (true) {
                            int i = size - 1;
                            if (i < 0) {
                                break;
                            }
                            if (!RecyclerView.this.ah.d(this.c.get(i).e)) {
                                break;
                            } else {
                                size = i;
                            }
                        }
                    }
                    this.c.add(size, o0o0o00);
                    z2 = true;
                }
                if (z2) {
                    z3 = false;
                } else {
                    c(o0o0o00, true);
                }
                z4 = z2;
            } else {
                z3 = false;
            }
            RecyclerView.this.j.h(o0o0o00);
            if (z4 || z3 || !z) {
                return;
            }
            o0o0o00.t = null;
            o0o0o00.r = null;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:110:0x0201 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:111:0x0203  */
        /* JADX WARN: Code duplicated, block: B:113:0x020d  */
        /* JADX WARN: Code duplicated, block: B:114:0x021a  */
        /* JADX WARN: Code duplicated, block: B:116:0x0220  */
        /* JADX WARN: Code duplicated, block: B:119:0x0228  */
        /* JADX WARN: Code duplicated, block: B:124:0x0246  */
        /* JADX WARN: Code duplicated, block: B:209:0x040a  */
        /* JADX WARN: Code duplicated, block: B:215:0x042e  */
        /* JADX WARN: Code duplicated, block: B:217:0x0434  */
        /* JADX WARN: Code duplicated, block: B:222:0x0440  */
        /* JADX WARN: Code duplicated, block: B:224:0x045d  */
        /* JADX WARN: Code duplicated, block: B:226:0x046b  */
        /* JADX WARN: Code duplicated, block: B:231:0x047e  */
        /* JADX WARN: Code duplicated, block: B:232:0x0480  */
        /* JADX WARN: Code duplicated, block: B:234:0x0483  */
        /* JADX WARN: Code duplicated, block: B:236:0x0489  */
        /* JADX WARN: Code duplicated, block: B:240:0x04a5  */
        /* JADX WARN: Code duplicated, block: B:242:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:245:0x04bc  */
        /* JADX WARN: Code duplicated, block: B:249:0x04e2  */
        /* JADX WARN: Code duplicated, block: B:253:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:256:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:258:0x0501  */
        /* JADX WARN: Code duplicated, block: B:260:0x050a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:265:0x051c  */
        /* JADX WARN: Code duplicated, block: B:269:0x0527  */
        /* JADX WARN: Code duplicated, block: B:270:0x0535  */
        /* JADX WARN: Code duplicated, block: B:272:0x053d  */
        /* JADX WARN: Code duplicated, block: B:273:0x054b  */
        /* JADX WARN: Code duplicated, block: B:276:0x0551 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:278:0x0554  */
        /* JADX WARN: Code duplicated, block: B:290:0x00c8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:295:0x00ff A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:300:0x01b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:302:0x01b6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x0086 A[EDGE_INSN: B:34:0x0086->B:35:0x0087 BREAK  A[LOOP:0: B:13:0x0028->B:19:0x0042]] */
        /* JADX WARN: Code duplicated, block: B:40:0x008f  */
        /* JADX WARN: Code duplicated, block: B:42:0x0098  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:66:0x0102  */
        /* JADX WARN: Code duplicated, block: B:68:0x0116  */
        /* JADX WARN: Code duplicated, block: B:70:0x011e  */
        /* JADX WARN: Code duplicated, block: B:72:0x0131 A[EDGE_INSN: B:72:0x0131->B:92:0x01ba BREAK  A[LOOP:1: B:41:0x0096->B:53:0x00c5]] */
        /* JADX WARN: Code duplicated, block: B:73:0x0143  */
        /* JADX WARN: Code duplicated, block: B:75:0x015c  */
        /* JADX WARN: Code duplicated, block: B:77:0x0173  */
        /* JADX WARN: Code duplicated, block: B:79:0x018a  */
        /* JADX WARN: Code duplicated, block: B:81:0x0193  */
        /* JADX WARN: Code duplicated, block: B:83:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:93:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:95:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
        public final o0O0O00 k(int i, boolean z, long j) {
            o0O0O00 o0o0o00;
            boolean z2;
            int iG;
            int i2;
            OooO<? extends o0O0O00> oooO;
            boolean z3;
            AccessibilityManager accessibilityManager;
            boolean z4;
            View view;
            w wVar;
            w.aNy any;
            C0283j c0283jH;
            List<Object> list;
            ViewGroup.LayoutParams layoutParams;
            long j2;
            ViewGroup.LayoutParams layoutParams2;
            Oooo0 oooo0;
            int iG2;
            o0O0O00 o0o0o00Remove;
            int size;
            int i3;
            int size2;
            int i4;
            o0O0O00 o0o0o01;
            C0012b c0012b;
            int size3;
            int i5;
            View view2;
            o0O0O00 o0o0o00J;
            C0012b c0012b2;
            int iIndexOfChild;
            int iK;
            o0O0O00 o0o0o00J2;
            int i6;
            int size4;
            int iG3;
            if (i < 0 || i >= RecyclerView.this.ai.c()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid item position ");
                sb.append(i);
                sb.append("(");
                sb.append(i);
                sb.append("). Item count:");
                sb.append(RecyclerView.this.ai.c());
                throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb));
            }
            if (RecyclerView.this.ai.h) {
                ArrayList<o0O0O00> arrayList = this.b;
                if (arrayList != null && (size4 = arrayList.size()) != 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            RecyclerView recyclerView = RecyclerView.this;
                            if (recyclerView.p.b && (iG3 = recyclerView.i.g(i, 0)) > 0 && iG3 < RecyclerView.this.p.b()) {
                                long jC = RecyclerView.this.p.c(iG3);
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        o0o0o00 = null;
                                        break;
                                    }
                                    o0O0O00 o0o0o02 = this.b.get(i8);
                                    if (!o0o0o02.x() && o0o0o02.h == jC) {
                                        o0o0o02.e(32);
                                        o0o0o00 = o0o0o02;
                                        break;
                                    }
                                    i8++;
                                }
                            } else {
                                o0o0o00 = null;
                                break;
                            }
                        } else {
                            o0o0o00 = this.b.get(i7);
                            if (!o0o0o00.x() && o0o0o00.h() == i) {
                                o0o0o00.e(32);
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    o0o0o00 = null;
                    break;
                }
                if (o0o0o00 != null) {
                    z2 = true;
                }
                if (o0o0o00 == null) {
                    size = this.a.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            if (z) {
                                c0012b = RecyclerView.this.h;
                                size3 = c0012b.c.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        view2 = null;
                                        break;
                                    }
                                    view2 = c0012b.c.get(i5);
                                    Objects.requireNonNull((x) c0012b.a);
                                    o0o0o00J2 = RecyclerView.j(view2);
                                    if (o0o0o00J2.h() != i && !o0o0o00J2.m() && !o0o0o00J2.p()) {
                                        break;
                                    }
                                    i5++;
                                }
                                if (view2 != null) {
                                    size2 = this.c.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size2) {
                                            o0o0o00 = null;
                                            break;
                                        }
                                        o0o0o01 = this.c.get(i4);
                                        if (!o0o0o01.m() || o0o0o01.h() != i || o0o0o01.c()) {
                                            i4++;
                                        } else if (!z) {
                                            this.c.remove(i4);
                                        }
                                    }
                                } else {
                                    o0o0o00J = RecyclerView.j(view2);
                                    c0012b2 = RecyclerView.this.h;
                                    iIndexOfChild = ((x) c0012b2.a).a.indexOfChild(view2);
                                    if (iIndexOfChild >= 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("view is not a child, cannot hide ");
                                        sb2.append(view2);
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                    if (c0012b2.b.e(iIndexOfChild)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("trying to unhide a view that was not hidden");
                                        sb3.append(view2);
                                        throw new RuntimeException(sb3.toString());
                                    }
                                    c0012b2.b.b(iIndexOfChild);
                                    c0012b2.m(view2);
                                    iK = RecyclerView.this.h.k(view2);
                                    if (iK != -1) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("layout index should not be -1 after unhiding a view:");
                                        sb4.append(o0o0o00J);
                                        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb4));
                                    }
                                    RecyclerView.this.h.e(iK);
                                    b(view2);
                                    o0o0o00J.e(8224);
                                    o0o0o00 = o0o0o00J;
                                    break;
                                }
                            } else {
                                size2 = this.c.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        o0o0o00 = null;
                                        break;
                                    }
                                    o0o0o01 = this.c.get(i4);
                                    if (!o0o0o01.m()) {
                                    }
                                    i4++;
                                }
                            }
                        } else {
                            o0o0o01 = this.a.get(i3);
                            if (!o0o0o01.x() || o0o0o01.h() != i || o0o0o01.m() || (!RecyclerView.this.ai.h && o0o0o01.p())) {
                                i3++;
                            } else {
                                o0o0o01.e(32);
                            }
                        }
                        o0o0o00 = o0o0o01;
                        break;
                    }
                    if (o0o0o00 != null) {
                        if (!o0o0o00.p()) {
                            i6 = o0o0o00.e;
                            if (i6 >= 0 || i6 >= RecyclerView.this.p.b()) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Inconsistency detected. Invalid view holder adapter position");
                                sb5.append(o0o0o00);
                                throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb5));
                            }
                            RecyclerView recyclerView2 = RecyclerView.this;
                            if (recyclerView2.ai.h || recyclerView2.p.d(o0o0o00.e) == o0o0o00.g) {
                                OooO oooO2 = RecyclerView.this.p;
                                if (!oooO2.b || o0o0o00.h == oooO2.c(o0o0o00.e)) {
                                    z2 = true;
                                }
                            }
                            if (!z) {
                                o0o0o00.e(4);
                                if (o0o0o00.o()) {
                                    RecyclerView.this.removeDetachedView(o0o0o00.c, false);
                                    o0o0o00.n.l(o0o0o00);
                                } else if (o0o0o00.x()) {
                                    o0o0o00.g();
                                }
                                j(o0o0o00);
                            }
                            o0o0o00 = null;
                        } else if (RecyclerView.this.ai.h) {
                            z2 = true;
                        } else {
                            if (!z) {
                                o0o0o00.e(4);
                                if (o0o0o00.o()) {
                                    RecyclerView.this.removeDetachedView(o0o0o00.c, false);
                                    o0o0o00.n.l(o0o0o00);
                                } else if (o0o0o00.x()) {
                                    o0o0o00.g();
                                }
                                j(o0o0o00);
                            }
                            o0o0o00 = null;
                        }
                    }
                }
                if (o0o0o00 == null) {
                    iG2 = RecyclerView.this.i.g(i, 0);
                    if (iG2 >= 0 || iG2 >= RecyclerView.this.p.b()) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Inconsistency detected. Invalid item position ");
                        sb6.append(i);
                        sb6.append("(offset:");
                        sb6.append(iG2);
                        sb6.append(").state:");
                        sb6.append(RecyclerView.this.ai.c());
                        throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb6));
                    }
                    int iD = RecyclerView.this.p.d(iG2);
                    OooO oooO3 = RecyclerView.this.p;
                    if (oooO3.b) {
                        long jC2 = oooO3.c(iG2);
                        int size5 = this.a.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = this.c.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        o0O0O00 o0o0o03 = this.c.get(size6);
                                        if (o0o0o03.h == jC2 && !o0o0o03.c()) {
                                            if (iD == o0o0o03.g) {
                                                if (!z) {
                                                    this.c.remove(size6);
                                                }
                                                o0o0o00 = o0o0o03;
                                                break;
                                            }
                                            if (!z) {
                                                g(size6);
                                            }
                                        }
                                        size6--;
                                    }
                                    o0o0o00 = null;
                                    break;
                                }
                            }
                            o0O0O00 o0o0o04 = this.a.get(size5);
                            if (o0o0o04.h == jC2 && !o0o0o04.x()) {
                                if (iD == o0o0o04.g) {
                                    o0o0o04.e(32);
                                    if (o0o0o04.p() && !RecyclerView.this.ai.h) {
                                        o0o0o04.u(2, 14);
                                    }
                                    o0o0o00 = o0o0o04;
                                    break;
                                }
                                if (!z) {
                                    this.a.remove(size5);
                                    RecyclerView.this.removeDetachedView(o0o0o04.c, false);
                                    o0O0O00 o0o0o00J3 = RecyclerView.j(o0o0o04.c);
                                    o0o0o00J3.n = null;
                                    o0o0o00J3.p = false;
                                    o0o0o00J3.g();
                                    j(o0o0o00J3);
                                }
                            }
                            size5--;
                        }
                        if (o0o0o00 != null) {
                            o0o0o00.e = iG2;
                            z2 = true;
                        }
                    }
                    if (o0o0o00 == null) {
                        o00Oo0.OooO00o oooO00o = f().a.get(iD);
                        if (oooO00o != null && !oooO00o.a.isEmpty()) {
                            ArrayList<o0O0O00> arrayList2 = oooO00o.a;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    o0o0o00Remove = null;
                                    break;
                                }
                                if (!arrayList2.get(size7).c()) {
                                    o0o0o00Remove = arrayList2.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            o0o0o00Remove = null;
                            break;
                        }
                        if (o0o0o00Remove != null) {
                            o0o0o00Remove.s();
                            int[] iArr = RecyclerView.b;
                        }
                        o0o0o00 = o0o0o00Remove;
                    }
                    if (o0o0o00 == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j3 = this.g.c(iD).c;
                            if (j3 != 0 && j3 + nanoTime >= j) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView3 = RecyclerView.this;
                        OooO oooO4 = recyclerView3.p;
                        Objects.requireNonNull(oooO4);
                        try {
                            int i9 = ivas.gov.bisp.enumeration.H.h.c;
                            Trace.beginSection("RV CreateView");
                            o0O0O00 o0o0o00F = oooO4.f(recyclerView3, iD);
                            if (o0o0o00F.c.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            o0o0o00F.g = iD;
                            Trace.endSection();
                            int[] iArr2 = RecyclerView.b;
                            RecyclerView recyclerViewI = RecyclerView.i(o0o0o00F.c);
                            if (recyclerViewI != null) {
                                o0o0o00F.d = new WeakReference<>(recyclerViewI);
                            }
                            long nanoTime2 = RecyclerView.this.getNanoTime();
                            o00Oo0 o00oo0 = this.g;
                            o00Oo0.OooO00o oooO00oC = o00oo0.c(iD);
                            oooO00oC.c = o00oo0.d(oooO00oC.c, nanoTime2 - nanoTime);
                            o0o0o00 = o0o0o00F;
                        } catch (Throwable th) {
                            int i10 = ivas.gov.bisp.enumeration.H.h.c;
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
                if (z2 && !RecyclerView.this.ai.h && o0o0o00.k(8192)) {
                    o0o0o00.u(0, 8192);
                    if (RecyclerView.this.ai.j) {
                        OooOOOO.b(o0o0o00);
                        OooOOOO oooOOOO = RecyclerView.this.O;
                        o0o0o00.j();
                        RecyclerView.this.aa(o0o0o00, oooOOOO.i(o0o0o00));
                    }
                }
                if (RecyclerView.this.ai.h || !o0o0o00.l()) {
                    if (o0o0o00.l() || (o0o0o00.k & 2) != 0 || o0o0o00.m()) {
                        iG = RecyclerView.this.i.g(i, 0);
                        o0o0o00.t = null;
                        RecyclerView recyclerView4 = RecyclerView.this;
                        o0o0o00.r = recyclerView4;
                        i2 = o0o0o00.g;
                        long nanoTime3 = recyclerView4.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j2 = this.g.c(i2).d;
                            if (j2 != 0 || j2 + nanoTime3 < j) {
                            }
                        }
                        oooO = RecyclerView.this.p;
                        Objects.requireNonNull(oooO);
                        if (o0o0o00.t == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            o0o0o00.e = iG;
                            if (oooO.b) {
                                o0o0o00.h = oooO.c(iG);
                            }
                            o0o0o00.u(1, 519);
                            int i11 = ivas.gov.bisp.enumeration.H.h.c;
                            Trace.beginSection("RV OnBindView");
                        }
                        o0o0o00.t = oooO;
                        o0o0o00.j();
                        oooO.g(o0o0o00, iG);
                        if (z3) {
                            list = o0o0o00.l;
                            if (list != null) {
                                list.clear();
                            }
                            o0o0o00.k &= -1025;
                            layoutParams = o0o0o00.c.getLayoutParams();
                            if (layoutParams instanceof Oooo0) {
                                ((Oooo0) layoutParams).c = true;
                            }
                            int i12 = ivas.gov.bisp.enumeration.H.h.c;
                            Trace.endSection();
                        }
                        long nanoTime4 = RecyclerView.this.getNanoTime();
                        o00Oo0 o00oo1 = this.g;
                        o00Oo0.OooO00o oooO00oC2 = o00oo1.c(o0o0o00.g);
                        oooO00oC2.d = o00oo1.d(oooO00oC2.d, nanoTime4 - nanoTime3);
                        accessibilityManager = RecyclerView.this.D;
                        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                            view = o0o0o00.c;
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                            if (T.aWX.e(view) == 0) {
                                T.aWX.t(view, 1);
                            }
                            wVar = RecyclerView.this.aC;
                            if (wVar != null) {
                                any = wVar.b;
                                if (any instanceof w.aNy) {
                                    Objects.requireNonNull(any);
                                    c0283jH = T.h(view);
                                    if (c0283jH != null && c0283jH != any) {
                                        any.b.put(view, c0283jH);
                                    }
                                }
                                T.q(view, any);
                            }
                        }
                        if (RecyclerView.this.ai.h) {
                            o0o0o00.i = i;
                        }
                        z4 = true;
                    }
                    layoutParams2 = o0o0o00.c.getLayoutParams();
                    if (layoutParams2 == null) {
                        oooo0 = (Oooo0) RecyclerView.this.generateDefaultLayoutParams();
                        o0o0o00.c.setLayoutParams(oooo0);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                        oooo0 = (Oooo0) layoutParams2;
                    } else {
                        oooo0 = (Oooo0) RecyclerView.this.generateLayoutParams(layoutParams2);
                        o0o0o00.c.setLayoutParams(oooo0);
                    }
                    oooo0.a = o0o0o00;
                    oooo0.d = !z2 && z4;
                    return o0o0o00;
                }
                o0o0o00.i = i;
                z4 = false;
                layoutParams2 = o0o0o00.c.getLayoutParams();
                if (layoutParams2 == null) {
                    oooo0 = (Oooo0) RecyclerView.this.generateDefaultLayoutParams();
                    o0o0o00.c.setLayoutParams(oooo0);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                    oooo0 = (Oooo0) RecyclerView.this.generateLayoutParams(layoutParams2);
                    o0o0o00.c.setLayoutParams(oooo0);
                } else {
                    oooo0 = (Oooo0) layoutParams2;
                }
                oooo0.a = o0o0o00;
                oooo0.d = !z2 && z4;
                return o0o0o00;
            }
            o0o0o00 = null;
            z2 = false;
            if (o0o0o00 == null) {
                size = this.a.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        o0o0o01 = this.a.get(i3);
                        if (o0o0o01.x()) {
                        }
                        i3++;
                    } else {
                        if (z) {
                            size2 = this.c.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    o0o0o00 = null;
                                    break;
                                }
                                o0o0o01 = this.c.get(i4);
                                if (!o0o0o01.m()) {
                                }
                                i4++;
                            }
                        } else {
                            c0012b = RecyclerView.this.h;
                            size3 = c0012b.c.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size3) {
                                    view2 = null;
                                    break;
                                }
                                view2 = c0012b.c.get(i5);
                                Objects.requireNonNull((x) c0012b.a);
                                o0o0o00J2 = RecyclerView.j(view2);
                                if (o0o0o00J2.h() != i) {
                                }
                                i5++;
                            }
                            if (view2 != null) {
                                size2 = this.c.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        o0o0o00 = null;
                                        break;
                                    }
                                    o0o0o01 = this.c.get(i4);
                                    if (!o0o0o01.m()) {
                                    }
                                    i4++;
                                }
                            } else {
                                o0o0o00J = RecyclerView.j(view2);
                                c0012b2 = RecyclerView.this.h;
                                iIndexOfChild = ((x) c0012b2.a).a.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("view is not a child, cannot hide ");
                                    sb7.append(view2);
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                if (c0012b2.b.e(iIndexOfChild)) {
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("trying to unhide a view that was not hidden");
                                    sb8.append(view2);
                                    throw new RuntimeException(sb8.toString());
                                }
                                c0012b2.b.b(iIndexOfChild);
                                c0012b2.m(view2);
                                iK = RecyclerView.this.h.k(view2);
                                if (iK != -1) {
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append("layout index should not be -1 after unhiding a view:");
                                    sb9.append(o0o0o00J);
                                    throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb9));
                                }
                                RecyclerView.this.h.e(iK);
                                b(view2);
                                o0o0o00J.e(8224);
                                o0o0o00 = o0o0o00J;
                                break;
                            }
                        }
                        if (o0o0o00 != null) {
                            if (!o0o0o00.p()) {
                                i6 = o0o0o00.e;
                                if (i6 >= 0) {
                                }
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("Inconsistency detected. Invalid view holder adapter position");
                                sb10.append(o0o0o00);
                                throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb10));
                            }
                            if (RecyclerView.this.ai.h) {
                                if (!z) {
                                    o0o0o00.e(4);
                                    if (o0o0o00.o()) {
                                        RecyclerView.this.removeDetachedView(o0o0o00.c, false);
                                        o0o0o00.n.l(o0o0o00);
                                    } else if (o0o0o00.x()) {
                                        o0o0o00.g();
                                    }
                                    j(o0o0o00);
                                }
                                o0o0o00 = null;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    o0o0o00 = o0o0o01;
                    if (o0o0o00 != null) {
                        if (!o0o0o00.p()) {
                            i6 = o0o0o00.e;
                            if (i6 >= 0) {
                            }
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("Inconsistency detected. Invalid view holder adapter position");
                            sb11.append(o0o0o00);
                            throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb11));
                        }
                        if (RecyclerView.this.ai.h) {
                            if (!z) {
                                o0o0o00.e(4);
                                if (o0o0o00.o()) {
                                    RecyclerView.this.removeDetachedView(o0o0o00.c, false);
                                    o0o0o00.n.l(o0o0o00);
                                } else if (o0o0o00.x()) {
                                    o0o0o00.g();
                                }
                                j(o0o0o00);
                            }
                            o0o0o00 = null;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            if (o0o0o00 == null) {
                iG2 = RecyclerView.this.i.g(i, 0);
                if (iG2 >= 0) {
                }
                StringBuilder sb12 = new StringBuilder();
                sb12.append("Inconsistency detected. Invalid item position ");
                sb12.append(i);
                sb12.append("(offset:");
                sb12.append(iG2);
                sb12.append(").state:");
                sb12.append(RecyclerView.this.ai.c());
                throw new IndexOutOfBoundsException(ivas.gov.bisp.enumeration.p091n.j.n(RecyclerView.this, sb12));
            }
            if (z2) {
                o0o0o00.u(0, 8192);
                if (RecyclerView.this.ai.j) {
                    OooOOOO.b(o0o0o00);
                    OooOOOO oooOOOO2 = RecyclerView.this.O;
                    o0o0o00.j();
                    RecyclerView.this.aa(o0o0o00, oooOOOO2.i(o0o0o00));
                }
            }
            if (RecyclerView.this.ai.h) {
                if (o0o0o00.l()) {
                    iG = RecyclerView.this.i.g(i, 0);
                    o0o0o00.t = null;
                    RecyclerView recyclerView5 = RecyclerView.this;
                    o0o0o00.r = recyclerView5;
                    i2 = o0o0o00.g;
                    long nanoTime5 = recyclerView5.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j2 = this.g.c(i2).d;
                        if (j2 != 0) {
                        }
                    }
                    oooO = RecyclerView.this.p;
                    Objects.requireNonNull(oooO);
                    if (o0o0o00.t == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        o0o0o00.e = iG;
                        if (oooO.b) {
                            o0o0o00.h = oooO.c(iG);
                        }
                        o0o0o00.u(1, 519);
                        int i13 = ivas.gov.bisp.enumeration.H.h.c;
                        Trace.beginSection("RV OnBindView");
                    }
                    o0o0o00.t = oooO;
                    o0o0o00.j();
                    oooO.g(o0o0o00, iG);
                    if (z3) {
                        list = o0o0o00.l;
                        if (list != null) {
                            list.clear();
                        }
                        o0o0o00.k &= -1025;
                        layoutParams = o0o0o00.c.getLayoutParams();
                        if (layoutParams instanceof Oooo0) {
                            ((Oooo0) layoutParams).c = true;
                        }
                        int i14 = ivas.gov.bisp.enumeration.H.h.c;
                        Trace.endSection();
                    }
                    long nanoTime6 = RecyclerView.this.getNanoTime();
                    o00Oo0 o00oo2 = this.g;
                    o00Oo0.OooO00o oooO00oC3 = o00oo2.c(o0o0o00.g);
                    oooO00oC3.d = o00oo2.d(oooO00oC3.d, nanoTime6 - nanoTime5);
                    accessibilityManager = RecyclerView.this.D;
                    if (accessibilityManager != null) {
                        view = o0o0o00.c;
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                        if (T.aWX.e(view) == 0) {
                            T.aWX.t(view, 1);
                        }
                        wVar = RecyclerView.this.aC;
                        if (wVar != null) {
                            any = wVar.b;
                            if (any instanceof w.aNy) {
                                Objects.requireNonNull(any);
                                c0283jH = T.h(view);
                                if (c0283jH != null) {
                                    any.b.put(view, c0283jH);
                                }
                            }
                            T.q(view, any);
                        }
                    }
                    if (RecyclerView.this.ai.h) {
                        o0o0o00.i = i;
                    }
                    z4 = true;
                } else {
                    iG = RecyclerView.this.i.g(i, 0);
                    o0o0o00.t = null;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    o0o0o00.r = recyclerView6;
                    i2 = o0o0o00.g;
                    long nanoTime7 = recyclerView6.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j2 = this.g.c(i2).d;
                        if (j2 != 0) {
                        }
                    }
                    oooO = RecyclerView.this.p;
                    Objects.requireNonNull(oooO);
                    if (o0o0o00.t == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        o0o0o00.e = iG;
                        if (oooO.b) {
                            o0o0o00.h = oooO.c(iG);
                        }
                        o0o0o00.u(1, 519);
                        int i15 = ivas.gov.bisp.enumeration.H.h.c;
                        Trace.beginSection("RV OnBindView");
                    }
                    o0o0o00.t = oooO;
                    o0o0o00.j();
                    oooO.g(o0o0o00, iG);
                    if (z3) {
                        list = o0o0o00.l;
                        if (list != null) {
                            list.clear();
                        }
                        o0o0o00.k &= -1025;
                        layoutParams = o0o0o00.c.getLayoutParams();
                        if (layoutParams instanceof Oooo0) {
                            ((Oooo0) layoutParams).c = true;
                        }
                        int i16 = ivas.gov.bisp.enumeration.H.h.c;
                        Trace.endSection();
                    }
                    long nanoTime8 = RecyclerView.this.getNanoTime();
                    o00Oo0 o00oo3 = this.g;
                    o00Oo0.OooO00o oooO00oC4 = o00oo3.c(o0o0o00.g);
                    oooO00oC4.d = o00oo3.d(oooO00oC4.d, nanoTime8 - nanoTime7);
                    accessibilityManager = RecyclerView.this.D;
                    if (accessibilityManager != null) {
                        view = o0o0o00.c;
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap3 = T.c;
                        if (T.aWX.e(view) == 0) {
                            T.aWX.t(view, 1);
                        }
                        wVar = RecyclerView.this.aC;
                        if (wVar != null) {
                            any = wVar.b;
                            if (any instanceof w.aNy) {
                                Objects.requireNonNull(any);
                                c0283jH = T.h(view);
                                if (c0283jH != null) {
                                    any.b.put(view, c0283jH);
                                }
                            }
                            T.q(view, any);
                        }
                    }
                    if (RecyclerView.this.ai.h) {
                        o0o0o00.i = i;
                    }
                    z4 = true;
                }
            } else if (o0o0o00.l()) {
                iG = RecyclerView.this.i.g(i, 0);
                o0o0o00.t = null;
                RecyclerView recyclerView7 = RecyclerView.this;
                o0o0o00.r = recyclerView7;
                i2 = o0o0o00.g;
                long nanoTime9 = recyclerView7.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j2 = this.g.c(i2).d;
                    if (j2 != 0) {
                    }
                }
                oooO = RecyclerView.this.p;
                Objects.requireNonNull(oooO);
                if (o0o0o00.t == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    o0o0o00.e = iG;
                    if (oooO.b) {
                        o0o0o00.h = oooO.c(iG);
                    }
                    o0o0o00.u(1, 519);
                    int i17 = ivas.gov.bisp.enumeration.H.h.c;
                    Trace.beginSection("RV OnBindView");
                }
                o0o0o00.t = oooO;
                o0o0o00.j();
                oooO.g(o0o0o00, iG);
                if (z3) {
                    list = o0o0o00.l;
                    if (list != null) {
                        list.clear();
                    }
                    o0o0o00.k &= -1025;
                    layoutParams = o0o0o00.c.getLayoutParams();
                    if (layoutParams instanceof Oooo0) {
                        ((Oooo0) layoutParams).c = true;
                    }
                    int i18 = ivas.gov.bisp.enumeration.H.h.c;
                    Trace.endSection();
                }
                long nanoTime10 = RecyclerView.this.getNanoTime();
                o00Oo0 o00oo4 = this.g;
                o00Oo0.OooO00o oooO00oC5 = o00oo4.c(o0o0o00.g);
                oooO00oC5.d = o00oo4.d(oooO00oC5.d, nanoTime10 - nanoTime9);
                accessibilityManager = RecyclerView.this.D;
                if (accessibilityManager != null) {
                    view = o0o0o00.c;
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap4 = T.c;
                    if (T.aWX.e(view) == 0) {
                        T.aWX.t(view, 1);
                    }
                    wVar = RecyclerView.this.aC;
                    if (wVar != null) {
                        any = wVar.b;
                        if (any instanceof w.aNy) {
                            Objects.requireNonNull(any);
                            c0283jH = T.h(view);
                            if (c0283jH != null) {
                                any.b.put(view, c0283jH);
                            }
                        }
                        T.q(view, any);
                    }
                }
                if (RecyclerView.this.ai.h) {
                    o0o0o00.i = i;
                }
                z4 = true;
            } else {
                iG = RecyclerView.this.i.g(i, 0);
                o0o0o00.t = null;
                RecyclerView recyclerView8 = RecyclerView.this;
                o0o0o00.r = recyclerView8;
                i2 = o0o0o00.g;
                long nanoTime11 = recyclerView8.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j2 = this.g.c(i2).d;
                    if (j2 != 0) {
                    }
                }
                oooO = RecyclerView.this.p;
                Objects.requireNonNull(oooO);
                if (o0o0o00.t == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    o0o0o00.e = iG;
                    if (oooO.b) {
                        o0o0o00.h = oooO.c(iG);
                    }
                    o0o0o00.u(1, 519);
                    int i19 = ivas.gov.bisp.enumeration.H.h.c;
                    Trace.beginSection("RV OnBindView");
                }
                o0o0o00.t = oooO;
                o0o0o00.j();
                oooO.g(o0o0o00, iG);
                if (z3) {
                    list = o0o0o00.l;
                    if (list != null) {
                        list.clear();
                    }
                    o0o0o00.k &= -1025;
                    layoutParams = o0o0o00.c.getLayoutParams();
                    if (layoutParams instanceof Oooo0) {
                        ((Oooo0) layoutParams).c = true;
                    }
                    int i110 = ivas.gov.bisp.enumeration.H.h.c;
                    Trace.endSection();
                }
                long nanoTime12 = RecyclerView.this.getNanoTime();
                o00Oo0 o00oo5 = this.g;
                o00Oo0.OooO00o oooO00oC6 = o00oo5.c(o0o0o00.g);
                oooO00oC6.d = o00oo5.d(oooO00oC6.d, nanoTime12 - nanoTime11);
                accessibilityManager = RecyclerView.this.D;
                if (accessibilityManager != null) {
                    view = o0o0o00.c;
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap5 = T.c;
                    if (T.aWX.e(view) == 0) {
                        T.aWX.t(view, 1);
                    }
                    wVar = RecyclerView.this.aC;
                    if (wVar != null) {
                        any = wVar.b;
                        if (any instanceof w.aNy) {
                            Objects.requireNonNull(any);
                            c0283jH = T.h(view);
                            if (c0283jH != null) {
                                any.b.put(view, c0283jH);
                            }
                        }
                        T.q(view, any);
                    }
                }
                if (RecyclerView.this.ai.h) {
                    o0o0o00.i = i;
                }
                z4 = true;
            }
            layoutParams2 = o0o0o00.c.getLayoutParams();
            if (layoutParams2 == null) {
                oooo0 = (Oooo0) RecyclerView.this.generateDefaultLayoutParams();
                o0o0o00.c.setLayoutParams(oooo0);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                oooo0 = (Oooo0) RecyclerView.this.generateLayoutParams(layoutParams2);
                o0o0o00.c.setLayoutParams(oooo0);
            } else {
                oooo0 = (Oooo0) layoutParams2;
            }
            oooo0.a = o0o0o00;
            oooo0.d = !z2 && z4;
            return o0o0o00;
        }

        public final void l(o0O0O00 o0o0o00) {
            if (o0o0o00.p) {
                this.b.remove(o0o0o00);
            } else {
                this.a.remove(o0o0o00);
            }
            o0o0o00.n = null;
            o0o0o00.p = false;
            o0o0o00.g();
        }

        public final void m() {
            Oooo000 oooo000 = RecyclerView.this.f25o;
            this.e = this.f + (oooo000 != null ? oooo000.j : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.e; size--) {
                g(size);
            }
        }
    }

    public class o00oO0o extends OooOO0O {
        public o00oO0o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOO0O
        public void b() {
            RecyclerView.this.l(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.ai.f = true;
            recyclerView.Z(true);
            if (RecyclerView.this.i.i()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOO0O
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.l(null);
            C0011a c0011a = RecyclerView.this.i;
            Objects.requireNonNull(c0011a);
            if (i2 <= 0) {
                return;
            }
            c0011a.b.add(c0011a.j(4, i, i2, obj));
            c0011a.e |= 4;
            if (c0011a.b.size() == 1) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOO0O
        public void d(int i, int i2) {
            RecyclerView.this.l(null);
            C0011a c0011a = RecyclerView.this.i;
            Objects.requireNonNull(c0011a);
            if (i2 <= 0) {
                return;
            }
            c0011a.b.add(c0011a.j(2, i, i2, null));
            c0011a.e |= 2;
            if (c0011a.b.size() == 1) {
                e();
            }
        }

        public void e() {
            int[] iArr = RecyclerView.b;
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.w || !recyclerView.x) {
                recyclerView.E = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.d;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                T.aWX.o(recyclerView, runnable);
            }
        }
    }

    public static abstract class o0O0O00 {
        public static final List<Object> a = Collections.emptyList();
        public final View c;
        public WeakReference<RecyclerView> d;
        public int k;
        public RecyclerView r;
        public OooO<? extends o0O0O00> t;
        public int e = -1;
        public int f = -1;
        public long h = -1;
        public int g = -1;
        public int i = -1;
        public o0O0O00 j = null;
        public o0O0O00 b = null;
        public List<Object> l = null;
        public List<Object> m = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27o = 0;
        public o00Ooo n = null;
        public boolean p = false;
        public int q = 0;
        public int s = -1;

        public o0O0O00(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.c = view;
        }

        public boolean c() {
            return (this.c.getParent() == null || this.c.getParent() == this.r) ? false : true;
        }

        public void d(Object obj) {
            if (obj == null) {
                e(1024);
                return;
            }
            if ((1024 & this.k) == 0) {
                if (this.l == null) {
                    ArrayList arrayList = new ArrayList();
                    this.l = arrayList;
                    this.m = Collections.unmodifiableList(arrayList);
                }
                this.l.add(obj);
            }
        }

        public void e(int i) {
            this.k = i | this.k;
        }

        public void f() {
            this.f = -1;
            this.i = -1;
        }

        public void g() {
            this.k &= -33;
        }

        public final int h() {
            int i = this.i;
            return i == -1 ? this.e : i;
        }

        public final int i() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.N(this);
        }

        public List<Object> j() {
            if ((this.k & 1024) != 0) {
                return a;
            }
            List<Object> list = this.l;
            return (list == null || list.size() == 0) ? a : this.m;
        }

        public boolean k(int i) {
            return (i & this.k) != 0;
        }

        public boolean l() {
            return (this.k & 1) != 0;
        }

        public boolean m() {
            return (this.k & 4) != 0;
        }

        public final boolean n() {
            if ((this.k & 16) == 0) {
                View view = this.c;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                if (!T.aWX.b(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean o() {
            return this.n != null;
        }

        public boolean p() {
            return (this.k & 8) != 0;
        }

        public boolean q() {
            return (this.k & 256) != 0;
        }

        public boolean r() {
            return (this.k & 2) != 0;
        }

        public void s() {
            this.k = 0;
            this.e = -1;
            this.f = -1;
            this.h = -1L;
            this.i = -1;
            this.f27o = 0;
            this.j = null;
            this.b = null;
            List<Object> list = this.l;
            if (list != null) {
                list.clear();
            }
            this.k &= -1025;
            this.q = 0;
            this.s = -1;
            RecyclerView.h(this);
        }

        public void t(int i, boolean z) {
            if (this.f == -1) {
                this.f = this.e;
            }
            if (this.i == -1) {
                this.i = this.e;
            }
            if (z) {
                this.i += i;
            }
            this.e += i;
            if (this.c.getLayoutParams() != null) {
                ((Oooo0) this.c.getLayoutParams()).c = true;
            }
        }

        public String toString() {
            StringBuilder sbB = ivas.gov.bisp.enumeration.p003ac.P.b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbB.append(Integer.toHexString(hashCode()));
            sbB.append(" position=");
            sbB.append(this.e);
            sbB.append(" id=");
            sbB.append(this.h);
            sbB.append(", oldPos=");
            sbB.append(this.f);
            sbB.append(", pLpos:");
            sbB.append(this.i);
            StringBuilder sb = new StringBuilder(sbB.toString());
            if (o()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m()) {
                sb.append(" invalid");
            }
            if (!l()) {
                sb.append(" unbound");
            }
            if ((this.k & 2) != 0) {
                sb.append(" update");
            }
            if (p()) {
                sb.append(" removed");
            }
            if (v()) {
                sb.append(" ignored");
            }
            if (q()) {
                sb.append(" tmpDetached");
            }
            if (!n()) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(" not recyclable(");
                sbW.append(this.f27o);
                sbW.append(")");
                sb.append(sbW.toString());
            }
            if ((this.k & 512) != 0 || m()) {
                sb.append(" undefined adapter position");
            }
            if (this.c.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void u(int i, int i2) {
            this.k = (i & i2) | ((~i2) & this.k);
        }

        public boolean v() {
            return (this.k & 128) != 0;
        }

        public final void w(boolean z) {
            int i = this.f27o;
            int i2 = z ? i - 1 : i + 1;
            this.f27o = i2;
            if (i2 < 0) {
                this.f27o = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
                return;
            }
            if (!z && i2 == 1) {
                this.k |= 16;
            } else if (z && i2 == 0) {
                this.k &= -17;
            }
        }

        public boolean x() {
            return (this.k & 32) != 0;
        }
    }

    public static abstract class o0OO00O {
    }

    public static abstract class o0OOO0o {
        public RecyclerView b;
        public Oooo000 c;
        public boolean d;
        public View e;
        public boolean f;
        public int a = -1;
        public final OooO00o g = new OooO00o(0, 0);

        public static class OooO00o {
            public int a;
            public int b;
            public int d = -1;
            public boolean e = false;
            public int g = 0;
            public int c = Integer.MIN_VALUE;
            public Interpolator f = null;

            public OooO00o(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public void b(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.K(i);
                    this.e = false;
                    return;
                }
                if (!this.e) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.f;
                if (interpolator != null && this.c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.c;
                if (i2 <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.af.c(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.e = false;
            }

            public void c(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.f = interpolator;
                this.e = true;
            }
        }

        public interface OooO0O0 {
            PointF b(int i);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x0106  */
        public void b(int i, int i2) {
            Object obj;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.d && this.e == null && (obj = this.c) != null) {
                PointF pointFB = obj instanceof OooO0O0 ? ((OooO0O0) obj).b(this.a) : null;
                if (pointFB != null) {
                    float f = pointFB.x;
                    if (f != 0.0f || pointFB.y != 0.0f) {
                        recyclerView.af((int) Math.signum(f), (int) Math.signum(pointFB.y), null);
                    }
                }
            }
            this.d = false;
            View view = this.e;
            if (view != null) {
                Objects.requireNonNull(this.b);
                o0O0O00 o0o0o00J = RecyclerView.j(view);
                if ((o0o0o00J != null ? o0o0o00J.h() : -1) == this.a) {
                    c(this.e, recyclerView.ai, this.g);
                    this.g.b(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.e = null;
                }
            }
            if (this.f) {
                o0Oo0oo o0oo0oo = recyclerView.ai;
                OooO00o oooO00o = this.g;
                r rVar = (r) this;
                if (rVar.b.f25o.w() == 0) {
                    rVar.d();
                } else {
                    int i3 = rVar.m;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    rVar.m = i4;
                    int i5 = rVar.f30o;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    rVar.f30o = i6;
                    if (i4 == 0 && i6 == 0) {
                        int i7 = rVar.a;
                        Object obj2 = rVar.c;
                        PointF pointFB2 = obj2 instanceof OooO0O0 ? ((OooO0O0) obj2).b(i7) : null;
                        if (pointFB2 != null) {
                            float f2 = pointFB2.x;
                            if (f2 == 0.0f && pointFB2.y == 0.0f) {
                                oooO00o.d = rVar.a;
                                rVar.d();
                            } else {
                                float f3 = pointFB2.y;
                                float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                                float f4 = pointFB2.x / fSqrt;
                                pointFB2.x = f4;
                                float f5 = pointFB2.y / fSqrt;
                                pointFB2.y = f5;
                                rVar.j = pointFB2;
                                rVar.m = (int) (f4 * 10000.0f);
                                rVar.f30o = (int) (f5 * 10000.0f);
                                oooO00o.c((int) (rVar.m * 1.2f), (int) (rVar.f30o * 1.2f), (int) (rVar.f(10000) * 1.2f), rVar.i);
                            }
                        } else {
                            oooO00o.d = rVar.a;
                            rVar.d();
                        }
                    }
                }
                OooO00o oooO00o2 = this.g;
                boolean z = oooO00o2.d >= 0;
                oooO00o2.b(recyclerView);
                if (z && this.f) {
                    this.d = true;
                    recyclerView.af.b();
                }
            }
        }

        public abstract void c(View view, o0Oo0oo o0oo0oo, OooO00o oooO00o);

        public final void d() {
            if (this.f) {
                this.f = false;
                r rVar = (r) this;
                rVar.f30o = 0;
                rVar.m = 0;
                rVar.j = null;
                this.b.ai.b = -1;
                this.e = null;
                this.a = -1;
                this.d = false;
                Oooo000 oooo000 = this.c;
                if (oooo000.g == this) {
                    oooo000.g = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class o0Oo0oo {
        public int l;
        public int m;
        public long n;
        public int b = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int g = 0;
        public boolean f = false;
        public boolean h = false;
        public boolean i = false;
        public boolean a = false;
        public boolean j = false;
        public boolean k = false;

        public void b(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Layout state should be one of ");
            sbW.append(Integer.toBinaryString(i));
            sbW.append(" but it is ");
            sbW.append(Integer.toBinaryString(this.e));
            throw new IllegalStateException(sbW.toString());
        }

        public int c() {
            return this.h ? this.c - this.d : this.g;
        }

        public String toString() {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("State{mTargetPosition=");
            sbW.append(this.b);
            sbW.append(", mData=");
            sbW.append((Object) null);
            sbW.append(", mItemCount=");
            sbW.append(this.g);
            sbW.append(", mIsMeasuring=");
            sbW.append(this.a);
            sbW.append(", mPreviousLayoutItemCount=");
            sbW.append(this.c);
            sbW.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sbW.append(this.d);
            sbW.append(", mStructureChanged=");
            sbW.append(this.f);
            sbW.append(", mInPreLayout=");
            sbW.append(this.h);
            sbW.append(", mRunSimpleAnimations=");
            sbW.append(this.j);
            sbW.append(", mRunPredictiveAnimations=");
            sbW.append(this.k);
            sbW.append('}');
            return sbW.toString();
        }
    }

    public interface o0OoOo0 {
        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);

        void e(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public interface oo000o {
        void b(o0O0O00 o0o0o00);
    }

    public class oo0o0Oo implements Runnable {
        public int a;
        public int b;
        public OverScroller c;
        public boolean d;
        public Interpolator e;
        public boolean f;

        public oo0o0Oo() {
            Interpolator interpolator = RecyclerView.c;
            this.e = interpolator;
            this.d = false;
            this.f = false;
            this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void b() {
            if (this.d) {
                this.f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWX.o(recyclerView, this);
        }

        public void c(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.c;
            }
            if (this.e != interpolator) {
                this.e = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            RecyclerView.this.setScrollState(2);
            this.c.startScroll(0, 0, i, i2, i4);
            b();
        }

        public void d() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f25o == null) {
                d();
                return;
            }
            this.f = false;
            this.d = true;
            recyclerView.r();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.a;
                int i5 = currY - this.b;
                this.a = currX;
                this.b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.aB;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.A(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.aB;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.s(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.p != null) {
                    int[] iArr3 = recyclerView3.aB;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.af(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.aB;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    o0OOO0o o0ooo0o = recyclerView4.f25o.g;
                    if (o0ooo0o != null && !o0ooo0o.d && o0ooo0o.f) {
                        int iC = recyclerView4.ai.c();
                        if (iC == 0) {
                            o0ooo0o.d();
                        } else if (o0ooo0o.a >= iC) {
                            o0ooo0o.a = iC - 1;
                            o0ooo0o.b(i2, i);
                        } else {
                            o0ooo0o.b(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.t.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.aB;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.z(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.aB;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.B(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                o0OOO0o o0ooo0o2 = recyclerView7.f25o.g;
                if ((o0ooo0o2 == null || !o0ooo0o2.d) && z) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView8 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView8);
                        if (i3 < 0) {
                            recyclerView8.y();
                            if (recyclerView8.I.isFinished()) {
                                recyclerView8.I.onAbsorb(-i3);
                            }
                        } else if (i3 > 0) {
                            recyclerView8.E();
                            if (recyclerView8.N.isFinished()) {
                                recyclerView8.N.onAbsorb(i3);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView8.D();
                            if (recyclerView8.M.isFinished()) {
                                recyclerView8.M.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView8.C();
                            if (recyclerView8.P.isFinished()) {
                                recyclerView8.P.onAbsorb(currVelocity);
                            }
                        }
                        if (i3 != 0 || currVelocity != 0) {
                            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                            T.aWX.l(recyclerView8);
                        }
                    }
                    int[] iArr7 = RecyclerView.b;
                    q.aNf anf = RecyclerView.this.ah;
                    int[] iArr8 = anf.c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    anf.d = 0;
                } else {
                    b();
                    RecyclerView recyclerView9 = RecyclerView.this;
                    q qVar = recyclerView9.ag;
                    if (qVar != null) {
                        qVar.c(recyclerView9, i2, i);
                    }
                }
            }
            o0OOO0o o0ooo0o3 = RecyclerView.this.f25o.g;
            if (o0ooo0o3 != null && o0ooo0o3.d) {
                o0ooo0o3.b(0, 0);
            }
            this.d = false;
            if (!this.f) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.bd(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                T.aWX.o(recyclerView10, this);
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        a = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new OooO0OO();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ivas.gov.bisp.enumeration.R.attr.recyclerViewStyle);
    }

    private P getScrollingChildHelper() {
        if (this.ar == null) {
            this.ar = new P(this);
        }
        return this.ar;
    }

    public static void h(o0O0O00 o0o0o00) {
        WeakReference<RecyclerView> weakReference = o0o0o00.d;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == o0o0o00.c) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            o0o0o00.d = null;
        }
    }

    public static RecyclerView i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewI = i(viewGroup.getChildAt(i));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static o0O0O00 j(View view) {
        if (view == null) {
            return null;
        }
        return ((Oooo0) view.getLayoutParams()).a;
    }

    public boolean A(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().f(i, i2, iArr, iArr2, i3);
    }

    public void B(int i, int i2) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        o00O0O o00o0o = this.aj;
        if (o00o0o != null) {
            o00o0o.c(this, i, i2);
        }
        List<o00O0O> list = this.al;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.al.get(size).c(this, i, i2);
            }
        }
        this.K--;
    }

    public void C() {
        if (this.P != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.L.b(this);
        this.P = edgeEffectB;
        if (!this.k) {
            edgeEffectB.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        edgeEffectB.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
    }

    public void D() {
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.L.b(this);
        this.M = edgeEffectB;
        if (!this.k) {
            edgeEffectB.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        edgeEffectB.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
    }

    public void E() {
        if (this.N != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.L.b(this);
        this.N = edgeEffectB;
        if (!this.k) {
            edgeEffectB.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        edgeEffectB.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public String F() {
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w(" ");
        sbW.append(super.toString());
        sbW.append(", adapter:");
        sbW.append(this.p);
        sbW.append(", layout:");
        sbW.append(this.f25o);
        sbW.append(", context:");
        sbW.append(getContext());
        return sbW.toString();
    }

    public View G(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public final void H(o0Oo0oo o0oo0oo) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(o0oo0oo);
            return;
        }
        OverScroller overScroller = this.af.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(o0oo0oo);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final boolean I(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            o0OoOo0 o0oooo0 = this.s.get(i);
            if (o0oooo0.b(this, motionEvent) && action != 3) {
                this.u = o0oooo0;
                return true;
            }
        }
        return false;
    }

    public final void J(int[] iArr) {
        int iH = this.h.h();
        if (iH == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iH; i3++) {
            o0O0O00 o0o0o00J = j(this.h.f(i3));
            if (!o0o0o00J.v()) {
                int iH2 = o0o0o00J.h();
                if (iH2 < i) {
                    i = iH2;
                }
                if (iH2 > i2) {
                    i2 = iH2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void K(int i) {
        if (this.f25o == null) {
            return;
        }
        setScrollState(2);
        this.f25o.aB(i);
        awakenScrollBars();
    }

    public long L(o0O0O00 o0o0o00) {
        return this.p.b ? o0o0o00.h : o0o0o00.e;
    }

    public o0O0O00 M(int i) {
        o0O0O00 o0o0o00 = null;
        if (this.F) {
            return null;
        }
        int iJ = this.h.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            o0O0O00 o0o0o00J = j(this.h.i(i2));
            if (o0o0o00J != null && !o0o0o00J.p() && N(o0o0o00J) == i) {
                if (!this.h.l(o0o0o00J.c)) {
                    return o0o0o00J;
                }
                o0o0o00 = o0o0o00J;
            }
        }
        return o0o0o00;
    }

    public int N(o0O0O00 o0o0o00) {
        if (!o0o0o00.k(524) && o0o0o00.l()) {
            C0011a c0011a = this.i;
            int i = o0o0o00.e;
            int size = c0011a.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0011a.aMI ami = c0011a.b.get(i2);
                int i3 = ami.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = ami.b;
                        if (i4 <= i) {
                            int i5 = ami.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = ami.b;
                        if (i6 == i) {
                            i = ami.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (ami.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (ami.b <= i) {
                    i += ami.d;
                }
            }
            return i;
        }
        return -1;
    }

    public o0O0O00 O(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return j(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean P() {
        return !this.y || this.F || this.i.i();
    }

    public Rect Q(View view) {
        Oooo0 oooo0 = (Oooo0) view.getLayoutParams();
        if (!oooo0.c) {
            return oooo0.b;
        }
        if (this.ai.h && (oooo0.g() || oooo0.a.m())) {
            return oooo0.b;
        }
        Rect rect = oooo0.b;
        rect.set(0, 0, 0, 0);
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            this.l.set(0, 0, 0, 0);
            this.t.get(i).b(this.l, view, this, this.ai);
            int i2 = rect.left;
            Rect rect2 = this.l;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oooo0.c = false;
        return rect;
    }

    public void R() {
        this.P = null;
        this.M = null;
        this.N = null;
        this.I = null;
    }

    public boolean S() {
        return this.J > 0;
    }

    public void T(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.J - 1;
        this.J = i2;
        if (i2 <= 0) {
            this.J = 0;
            if (z) {
                int i3 = this.C;
                this.C = 0;
                if (i3 != 0 && (accessibilityManager = this.D) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                for (int size = this.au.size() - 1; size >= 0; size--) {
                    o0O0O00 o0o0o00 = this.au.get(size);
                    if (o0o0o00.c.getParent() == this && !o0o0o00.v() && (i = o0o0o00.s) != -1) {
                        View view = o0o0o00.c;
                        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                        T.aWX.t(view, i);
                        o0o0o00.s = -1;
                    }
                }
                this.au.clear();
            }
        }
    }

    public void U(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iJ = this.h.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            o0O0O00 o0o0o00J = j(this.h.i(i4));
            if (o0o0o00J != null && !o0o0o00J.v()) {
                int i5 = o0o0o00J.e;
                if (i5 >= i3) {
                    o0o0o00J.t(-i2, z);
                    this.ai.f = true;
                } else if (i5 >= i) {
                    o0o0o00J.e(8);
                    o0o0o00J.t(-i2, z);
                    o0o0o00J.e = i - 1;
                    this.ai.f = true;
                }
            }
        }
        o00Ooo o00ooo = this.f;
        int size = o00ooo.c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            o0O0O00 o0o0o00 = o00ooo.c.get(size);
            if (o0o0o00 != null) {
                int i6 = o0o0o00.e;
                if (i6 >= i3) {
                    o0o0o00.t(-i2, z);
                } else if (i6 >= i) {
                    o0o0o00.e(8);
                    o00ooo.g(size);
                }
            }
        }
    }

    public void V() {
        int iJ = this.h.j();
        for (int i = 0; i < iJ; i++) {
            ((Oooo0) this.h.i(i).getLayoutParams()).c = true;
        }
        o00Ooo o00ooo = this.f;
        int size = o00ooo.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Oooo0 oooo0 = (Oooo0) o00ooo.c.get(i2).c.getLayoutParams();
            if (oooo0 != null) {
                oooo0.c = true;
            }
        }
    }

    public void W() {
        this.J++;
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.V = x;
            this.U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.S = y;
            this.T = y;
        }
    }

    public final void Y() {
        boolean z;
        boolean z2 = false;
        if (this.F) {
            C0011a c0011a = this.i;
            c0011a.m(c0011a.b);
            c0011a.m(c0011a.c);
            c0011a.e = 0;
            if (this.G) {
                this.f25o.ah(this);
            }
        }
        if (this.O == null || !this.f25o.aq()) {
            this.i.e();
        } else {
            this.i.k();
        }
        boolean z3 = this.ak || this.am;
        o0Oo0oo o0oo0oo = this.ai;
        boolean z4 = this.y && this.O != null && ((z = this.F) || z3 || this.f25o.f) && (!z || this.p.b);
        o0oo0oo.j = z4;
        if (z4 && z3 && !this.F) {
            if (this.O != null && this.f25o.aq()) {
                z2 = true;
            }
        }
        o0oo0oo.k = z2;
    }

    public void Z(boolean z) {
        this.G = z | this.G;
        this.F = true;
        int iJ = this.h.j();
        for (int i = 0; i < iJ; i++) {
            o0O0O00 o0o0o00J = j(this.h.i(i));
            if (o0o0o00J != null && !o0o0o00J.v()) {
                o0o0o00J.e(6);
            }
        }
        V();
        o00Ooo o00ooo = this.f;
        int size = o00ooo.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0O0O00 o0o0o00 = o00ooo.c.get(i2);
            if (o0o0o00 != null) {
                o0o0o00.e(6);
                o0o0o00.d(null);
            }
        }
        OooO oooO = RecyclerView.this.p;
        if (oooO == null || !oooO.b) {
            o00ooo.h();
        }
    }

    public void aa(o0O0O00 o0o0o00, OooOOOO.OooO0OO oooO0OO) {
        o0o0o00.u(0, 8192);
        if (this.ai.i && o0o0o00.r() && !o0o0o00.p() && !o0o0o00.v()) {
            this.j.b.j(L(o0o0o00), o0o0o00);
        }
        this.j.d(o0o0o00, oooO0OO);
    }

    public void ab() {
        OooOOOO oooOOOO = this.O;
        if (oooOOOO != null) {
            oooOOOO.f();
        }
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            oooo000.av(this.f);
            this.f25o.ay(this.f);
        }
        this.f.d();
    }

    public final void ac(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof Oooo0) {
            Oooo0 oooo0 = (Oooo0) layoutParams;
            if (!oooo0.c) {
                Rect rect = oooo0.b;
                Rect rect2 = this.l;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.l);
            offsetRectIntoDescendantCoords(view, this.l);
        }
        this.f25o.aE(this, view, this.l, !this.y, view2 == null);
    }

    public final void ad() {
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        bd(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.P.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWX.l(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            Objects.requireNonNull(oooo000);
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    public boolean ae(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        r();
        if (this.p != null) {
            int[] iArr = this.aB;
            iArr[0] = 0;
            iArr[1] = 0;
            af(i, i2, iArr);
            int[] iArr2 = this.aB;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.t.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.aB;
        iArr3[0] = 0;
        iArr3[1] = 0;
        z(i5, i4, i6, i7, this.as, i3, iArr3);
        int[] iArr4 = this.aB;
        int i10 = iArr4[0];
        int i11 = iArr4[1];
        boolean z2 = (i10 == 0 && i11 == 0) ? false : true;
        int i12 = this.V;
        int[] iArr5 = this.as;
        int i13 = iArr5[0];
        this.V = i12 - i13;
        int i14 = this.S;
        int i15 = iArr5[1];
        this.S = i14 - i15;
        int[] iArr6 = this.av;
        iArr6[0] = iArr6[0] + i13;
        iArr6[1] = iArr6[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f = i6 - i10;
                float y = motionEvent.getY();
                float f2 = i7 - i11;
                if (f < 0.0f) {
                    y();
                    this.I.onPull((-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    if (f > 0.0f) {
                        E();
                        this.N.onPull(f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f2 < 0.0f) {
                        D();
                        this.M.onPull((-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        C();
                        this.P.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (!z || f != 0.0f || f2 != 0.0f) {
                    }
                    WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
                    T.aWX.l(this);
                }
                z = true;
                if (f2 < 0.0f) {
                    D();
                    this.M.onPull((-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    C();
                    this.P.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (!z) {
                }
                WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap2 = T.c;
                T.aWX.l(this);
            }
            s(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            B(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    public void af(int i, int i2, int[] iArr) {
        o0O0O00 o0o0o00;
        ai();
        W();
        int i3 = ivas.gov.bisp.enumeration.H.h.c;
        Trace.beginSection("RV Scroll");
        H(this.ai);
        int iAG = i != 0 ? this.f25o.aG(i, this.f, this.ai) : 0;
        int iAC = i2 != 0 ? this.f25o.aC(i2, this.f, this.ai) : 0;
        Trace.endSection();
        int iH = this.h.h();
        for (int i4 = 0; i4 < iH; i4++) {
            View viewF = this.h.f(i4);
            o0O0O00 o0o0o00O = O(viewF);
            if (o0o0o00O != null && (o0o0o00 = o0o0o00O.b) != null) {
                View view = o0o0o00.c;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        al(false);
        if (iArr != null) {
            iArr[0] = iAG;
            iArr[1] = iAC;
        }
    }

    public void ag(int i) {
        if (this.B) {
            return;
        }
        bq();
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oooo000.aB(i);
            awakenScrollBars();
        }
    }

    public boolean ah(o0O0O00 o0o0o00, int i) {
        if (S()) {
            o0o0o00.s = i;
            this.au.add(o0o0o00);
            return false;
        }
        View view = o0o0o00.c;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.t(view, i);
        return true;
    }

    public void ai() {
        int i = this.z + 1;
        this.z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.v = false;
    }

    public void aj(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!oooo000.k()) {
            i = 0;
        }
        if (!this.f25o.j()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            ak(i4, 1);
        }
        this.af.c(i, i2, i3, interpolator);
    }

    public boolean ak(int i, int i2) {
        return getScrollingChildHelper().c(i, i2);
    }

    public void al(boolean z) {
        if (this.z <= 0) {
            this.z = 1;
        }
        if (!z && !this.B) {
            this.v = false;
        }
        if (this.z == 1) {
            if (z && this.v && !this.B && this.f25o != null && this.p != null) {
                w();
            }
            if (!this.B) {
                this.v = false;
            }
        }
        this.z--;
    }

    public void bc() {
        if (this.ax || !this.x) {
            return;
        }
        Runnable runnable = this.at;
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.o(this, runnable);
        this.ax = true;
    }

    public void bd(int i) {
        getScrollingChildHelper().l(i);
    }

    public void bq() {
        o0OOO0o o0ooo0o;
        setScrollState(0);
        this.af.d();
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null || (o0ooo0o = oooo000.g) == null) {
            return;
        }
        o0ooo0o.d();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Oooo0) && this.f25o.l((Oooo0) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null && oooo000.k()) {
            return this.f25o.n(this.ai);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null && oooo000.k()) {
            return this.f25o.o(this.ai);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null && oooo000.k()) {
            return this.f25o.q(this.ai);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null && oooo000.j()) {
            return this.f25o.p(this.ai);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null && oooo000.j()) {
            return this.f25o.r(this.ai);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null && oooo000.j()) {
            return this.f25o.s(this.ai);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().d(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().e(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().f(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().i(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.t.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.t.get(i).c(canvas, this, this.ai);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.k) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.M;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.N;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.k) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.O == null || this.t.size() <= 0 || !this.O.h()) && !z) {
            return;
        }
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        T.aWX.l(this);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewAb;
        int i2;
        byte b2;
        boolean z;
        Objects.requireNonNull(this.f25o);
        boolean z2 = (this.p == null || this.f25o == null || S() || this.B) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f25o.j()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                if (z) {
                    r();
                    if (G(view) == null) {
                        return null;
                    }
                    ai();
                    this.f25o.ab(view, i, this.f, this.ai);
                    al(false);
                }
            } else if (this.f25o.k()) {
                if (focusFinder.findNextFocus(this, view, (this.f25o.M() == 1) ^ (i == 2) ? 66 : 17) == null) {
                    r();
                    if (G(view) == null) {
                        return null;
                    }
                    ai();
                    this.f25o.ab(view, i, this.f, this.ai);
                    al(false);
                }
            }
            viewAb = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                r();
                if (G(view) == null) {
                    return null;
                }
                ai();
                viewAb = this.f25o.ab(view, i, this.f, this.ai);
                al(false);
            } else {
                viewAb = viewFindNextFocus;
            }
        }
        if (viewAb != null && !viewAb.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            ac(viewAb, null);
            return view;
        }
        if (viewAb != null && viewAb != this && viewAb != view && G(viewAb) != null) {
            if (view == null || G(view) == null) {
                return viewAb;
            }
            this.l.set(0, 0, view.getWidth(), view.getHeight());
            this.m.set(0, 0, viewAb.getWidth(), viewAb.getHeight());
            offsetDescendantRectToMyCoords(view, this.l);
            offsetDescendantRectToMyCoords(viewAb, this.m);
            int i3 = this.f25o.M() == 1 ? -1 : 1;
            Rect rect = this.l;
            int i4 = rect.left;
            Rect rect2 = this.m;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b2 = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b2 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Invalid direction: ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(this, sb));
                                }
                                if (b2 > 0) {
                                    return viewAb;
                                }
                            } else if (i2 > 0) {
                                return viewAb;
                            }
                        } else if (b2 < 0) {
                            return viewAb;
                        }
                    } else if (i2 < 0) {
                        return viewAb;
                    }
                } else {
                    if (b2 > 0) {
                        return viewAb;
                    }
                    if (b2 == 0 && i2 * i3 > 0) {
                        return viewAb;
                    }
                }
            } else {
                if (b2 < 0) {
                    return viewAb;
                }
                if (b2 == 0 && i2 * i3 < 0) {
                    return viewAb;
                }
            }
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            return oooo000.y();
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, ivas.gov.bisp.enumeration.p091n.j.w("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            return oooo000.x(getContext(), attributeSet);
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, ivas.gov.bisp.enumeration.p091n.j.w("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public OooO getAdapter() {
        return this.p;
    }

    @Override // android.view.View
    public int getBaseline() {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(oooo000);
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        OooOOO0 oooOOO0 = this.ap;
        return oooOOO0 == null ? super.getChildDrawingOrder(i, i2) : oooOOO0.b(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.k;
    }

    public w getCompatAccessibilityDelegate() {
        return this.aC;
    }

    public OooOOO getEdgeEffectFactory() {
        return this.L;
    }

    public OooOOOO getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public Oooo000 getLayoutManager() {
        return this.f25o;
    }

    public int getMaxFlingVelocity() {
        return this.ab;
    }

    public int getMinFlingVelocity() {
        return this.aa;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public o000oOoO getOnFlingListener() {
        return this.ao;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.ae;
    }

    public o00Oo0 getRecycledViewPool() {
        return this.f.f();
    }

    public int getScrollState() {
        return this.Q;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k(0);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f;
    }

    public void l(String str) {
        if (S()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, ivas.gov.bisp.enumeration.p091n.j.w("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.K > 0) {
            new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, ivas.gov.bisp.enumeration.p091n.j.w(BuildConfig.FLAVOR)));
        }
    }

    public final void m(o0O0O00 o0o0o00) {
        View view = o0o0o00.c;
        boolean z = view.getParent() == this;
        this.f.l(O(view));
        if (o0o0o00.q()) {
            this.h.d(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.h.c(view, -1, true);
            return;
        }
        C0012b c0012b = this.h;
        int iIndexOfChild = ((x) c0012b.a).a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c0012b.b.i(iIndexOfChild);
            c0012b.b(view);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void n(OooOo oooOo) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            oooo000.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.t.isEmpty()) {
            setWillNotDraw(false);
        }
        this.t.add(oooOo);
        V();
        requestLayout();
    }

    public void o(o00O0O o00o0o) {
        if (this.al == null) {
            this.al = new ArrayList();
        }
        this.al.add(o00o0o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = 0;
        this.x = true;
        this.y = this.y && !isLayoutRequested();
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            oooo000.h = true;
        }
        this.ax = false;
        ThreadLocal<q> threadLocal = q.a;
        q qVar = threadLocal.get();
        this.ag = qVar;
        if (qVar == null) {
            this.ag = new q();
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            Display displayD = T.aWY.d(this);
            float f = 60.0f;
            if (!isInEditMode() && displayD != null) {
                float refreshRate = displayD.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            q qVar2 = this.ag;
            qVar2.e = (long) (1.0E9f / f);
            threadLocal.set(qVar2);
        }
        this.ag.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOOOO oooOOOO = this.O;
        if (oooOOOO != null) {
            oooOOOO.f();
        }
        bq();
        this.x = false;
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            o00Ooo o00ooo = this.f;
            oooo000.h = false;
            oooo000.aa(this, o00ooo);
        }
        this.au.clear();
        removeCallbacks(this.at);
        Objects.requireNonNull(this.j);
        while (A.aNm.a.e() != null) {
        }
        q qVar = this.ag;
        if (qVar != null) {
            qVar.c.remove(this);
            this.ag = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            this.t.get(i).d(canvas, this, this.ai);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f25o != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f25o.j() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f25o.k() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f25o.j()) {
                    f = -axisValue;
                } else if (this.f25o.k()) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.ac);
                int i2 = (int) (f * this.ad);
                Oooo000 oooo000 = this.f25o;
                if (oooo000 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.B) {
                    int[] iArr = this.aB;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zK = oooo000.k();
                    boolean zJ = this.f25o.j();
                    ak(zJ ? (zK ? 1 : 0) | 2 : zK ? 1 : 0, 1);
                    if (A(zK ? i : 0, zJ ? i2 : 0, this.aB, this.as, 1)) {
                        int[] iArr2 = this.aB;
                        i -= iArr2[0];
                        i2 -= iArr2[1];
                    }
                    ae(zK ? i : 0, zJ ? i2 : 0, motionEvent, 1);
                    q qVar = this.ag;
                    if (qVar != null && (i != 0 || i2 != 0)) {
                        qVar.c(this, i, i2);
                    }
                    getScrollingChildHelper().l(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.B) {
            return false;
        }
        this.u = null;
        if (I(motionEvent)) {
            p();
            return true;
        }
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null) {
            return false;
        }
        boolean zK = oooo000.k();
        boolean zJ = this.f25o.j();
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.R = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.V = x;
            this.U = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.S = y;
            this.T = y;
            if (this.Q == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                bd(1);
            }
            int[] iArr = this.av;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zK;
            if (zJ) {
                i = (zK ? 1 : 0) | 2;
            }
            ak(i, 0);
        } else if (actionMasked == 1) {
            this.H.clear();
            bd(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.R);
            if (iFindPointerIndex < 0) {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Error processing scroll; pointer index for id ");
                sbW.append(this.R);
                sbW.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sbW.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.Q != 1) {
                int i2 = this.U;
                int i3 = this.T;
                if (!zK || Math.abs(x2 - i2) <= this.W) {
                    z = false;
                } else {
                    this.V = x2;
                    z = true;
                }
                if (zJ && Math.abs(y2 - i3) > this.W) {
                    this.S = y2;
                } else if (z) {
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            p();
        } else if (actionMasked == 5) {
            this.R = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.V = x3;
            this.U = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.S = y3;
            this.T = y3;
        } else if (actionMasked == 6) {
            X(motionEvent);
        }
        return this.Q == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ivas.gov.bisp.enumeration.H.h.c;
        Trace.beginSection("RV OnLayout");
        w();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null) {
            t(i, i2);
            return;
        }
        boolean z = false;
        if (oooo000.V()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f25o.c.t(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.ay = z;
            if (z || this.p == null) {
                return;
            }
            if (this.ai.e == 1) {
                v();
            }
            this.f25o.aI(i, i2);
            this.ai.a = true;
            x();
            this.f25o.ar(i, i2);
            if (this.f25o.an()) {
                this.f25o.aI(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.ai.a = true;
                x();
                this.f25o.ar(i, i2);
            }
            this.az = getMeasuredWidth();
            this.aA = getMeasuredHeight();
            return;
        }
        if (this.w) {
            this.f25o.c.t(i, i2);
            return;
        }
        if (this.E) {
            ai();
            W();
            Y();
            T(true);
            o0Oo0oo o0oo0oo = this.ai;
            if (o0oo0oo.k) {
                o0oo0oo.h = true;
            } else {
                this.i.e();
                this.ai.h = false;
            }
            this.E = false;
            al(false);
        } else if (this.ai.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        OooO oooO = this.p;
        if (oooO != null) {
            this.ai.g = oooO.b();
        } else {
            this.ai.g = 0;
        }
        ai();
        this.f25o.c.t(i, i2);
        al(false);
        this.ai.h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (S()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o0ooOOo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0ooOOo o0ooooo = (o0ooOOo) parcelable;
        this.g = o0ooooo;
        super.onRestoreInstanceState(o0ooooo.e);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o0ooOOo o0ooooo = new o0ooOOo(super.onSaveInstanceState());
        o0ooOOo o0ooooo2 = this.g;
        if (o0ooooo2 != null) {
            o0ooooo.b = o0ooooo2.b;
        } else {
            Oooo000 oooo000 = this.f25o;
            if (oooo000 != null) {
                o0ooooo.b = oooo000.at();
            } else {
                o0ooooo.b = null;
            }
        }
        return o0ooooo;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        R();
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0261  */
    /* JADX WARN: Code duplicated, block: B:156:0x0277  */
    /* JADX WARN: Code duplicated, block: B:158:0x027f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0282  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x02bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:200:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:208:0x0308  */
    /* JADX WARN: Code duplicated, block: B:210:0x0310 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x0312  */
    /* JADX WARN: Code duplicated, block: B:212:0x0317  */
    /* JADX WARN: Code duplicated, block: B:215:0x0348  */
    /* JADX WARN: Code duplicated, block: B:217:0x036c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3 A[PHI: r0
  0x00e3: PHI (r0v61 int) = (r0v51 int), (r0v65 int) binds: [B:43:0x00cc, B:47:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.recyclerview.widget.RecyclerView$Oooo000] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.recyclerview.widget.C, androidx.recyclerview.widget.u] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ?? r10;
        MotionEvent motionEvent2;
        ?? r2;
        ?? r20;
        boolean z2;
        MotionEvent motionEvent3;
        RecyclerView recyclerView;
        ?? r4;
        oo0o0Oo oo0o0oo;
        Interpolator interpolator;
        Interpolator interpolator2;
        int minFlingVelocity;
        boolean z3;
        boolean z4;
        int iT;
        boolean z5;
        g gVar;
        g gVarG;
        int iW;
        int i;
        View view;
        View view2;
        int i2;
        boolean z6;
        boolean z7;
        int i3;
        PointF pointFB;
        View viewA;
        boolean z8;
        int iD;
        int i4;
        boolean z9;
        if (this.B || this.A) {
            return false;
        }
        o0OoOo0 o0oooo0 = this.u;
        if (o0oooo0 != null) {
            z = true;
            o0oooo0.e(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.u = null;
            }
        } else {
            if (motionEvent.getAction() == 0 || !I(motionEvent)) {
                Oooo000 oooo000 = this.f25o;
                if (oooo000 == null) {
                    return false;
                }
                boolean zK = oooo000.k();
                boolean zJ = this.f25o.j();
                if (this.H == null) {
                    this.H = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.av;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.av;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int iFindPointerIndex = motionEvent.findPointerIndex(this.R);
                            if (iFindPointerIndex < 0) {
                                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Error processing scroll; pointer index for id ");
                                sbW.append(this.R);
                                sbW.append(" not found. Did any MotionEvents get skipped?");
                                Log.e("RecyclerView", sbW.toString());
                                return false;
                            }
                            int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            int iMax = this.V - x;
                            int iMax2 = this.S - y;
                            if (this.Q != 1) {
                                if (zK) {
                                    iMax = iMax > 0 ? Math.max(0, iMax - this.W) : Math.min(0, iMax + this.W);
                                    if (iMax != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                } else {
                                    z9 = false;
                                }
                                if (zJ) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.W) : Math.min(0, iMax2 + this.W);
                                    if (iMax2 != 0) {
                                        z9 = true;
                                    }
                                }
                                if (z9) {
                                    setScrollState(1);
                                }
                            }
                            int i5 = iMax;
                            int i6 = iMax2;
                            if (this.Q == 1) {
                                int[] iArr3 = this.aB;
                                iArr3[0] = 0;
                                iArr3[1] = 0;
                                if (A(zK ? i5 : 0, zJ ? i6 : 0, iArr3, this.as, 0)) {
                                    int[] iArr4 = this.aB;
                                    i5 -= iArr4[0];
                                    i6 -= iArr4[1];
                                    int[] iArr5 = this.av;
                                    int i7 = iArr5[0];
                                    int[] iArr6 = this.as;
                                    iArr5[0] = i7 + iArr6[0];
                                    iArr5[1] = iArr5[1] + iArr6[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i8 = i6;
                                int[] iArr7 = this.as;
                                this.V = x - iArr7[0];
                                this.S = y - iArr7[1];
                                if (ae(zK ? i5 : 0, zJ ? i8 : 0, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                q qVar = this.ag;
                                if (qVar != null && (i5 != 0 || i8 != 0)) {
                                    qVar.c(this, i5, i8);
                                }
                            }
                        } else if (actionMasked == 3) {
                            p();
                        } else if (actionMasked == 5) {
                            this.R = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.V = x2;
                            this.U = x2;
                            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.S = y2;
                            this.T = y2;
                        } else if (actionMasked == 6) {
                            X(motionEvent);
                        }
                        r2 = this;
                    } else {
                        this.H.addMovement(motionEventObtain);
                        this.H.computeCurrentVelocity(1000, this.ab);
                        float f = zK ? -this.H.getXVelocity(this.R) : 0.0f;
                        float f2 = zJ ? -this.H.getYVelocity(this.R) : 0.0f;
                        if (f == 0.0f && f2 == 0.0f) {
                            recyclerView = this;
                            i4 = 0;
                            motionEvent3 = motionEventObtain;
                        } else {
                            int i9 = (int) f;
                            int i10 = (int) f2;
                            Oooo000 oooo001 = this.f25o;
                            if (oooo001 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else {
                                if (!this.B) {
                                    boolean zK2 = oooo001.k();
                                    boolean zJ2 = this.f25o.j();
                                    if (!zK2 || Math.abs(i9) < this.aa) {
                                        i9 = 0;
                                    }
                                    if (!zJ2 || Math.abs(i10) < this.aa) {
                                        i10 = 0;
                                    }
                                    if (i9 != 0 || i10 != 0) {
                                        float f3 = i9;
                                        float f4 = i10;
                                        if (!dispatchNestedPreFling(f3, f4)) {
                                            boolean z10 = zK2 || zJ2;
                                            dispatchNestedFling(f3, f4, z10);
                                            o000oOoO o000oooo = this.ao;
                                            if (o000oooo != null) {
                                                C c2 = (C) o000oooo;
                                                ?? layoutManager = c2.a.getLayoutManager();
                                                if (layoutManager == 0 || c2.a.getAdapter() == null || ((Math.abs(i10) <= (minFlingVelocity = c2.a.getMinFlingVelocity()) && Math.abs(i9) <= minFlingVelocity) || !((z3 = layoutManager instanceof o0OOO0o.OooO0O0)))) {
                                                    r20 = zK2;
                                                    z2 = zJ2;
                                                    motionEvent3 = motionEventObtain;
                                                    if (z10) {
                                                        if (z2) {
                                                            r4 = r20 | 2;
                                                        } else {
                                                            r4 = r20;
                                                        }
                                                        ak(r4, 1);
                                                        int i11 = this.ab;
                                                        int iMax3 = Math.max(-i11, Math.min(i9, i11));
                                                        int i12 = this.ab;
                                                        int iMax4 = Math.max(-i12, Math.min(i10, i12));
                                                        oo0o0oo = this.af;
                                                        RecyclerView.this.setScrollState(2);
                                                        oo0o0oo.b = 0;
                                                        oo0o0oo.a = 0;
                                                        interpolator = oo0o0oo.e;
                                                        interpolator2 = c;
                                                        if (interpolator != interpolator2) {
                                                            oo0o0oo.e = interpolator2;
                                                            oo0o0oo.c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                                                        }
                                                        oo0o0oo.c.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        oo0o0oo.b();
                                                    } else {
                                                        recyclerView = this;
                                                    }
                                                } else {
                                                    ?? r7 = (u) c2;
                                                    y yVar = z3 ? new y(r7, r7.a.getContext()) : null;
                                                    if (yVar == null) {
                                                        r20 = zK2;
                                                        z2 = zJ2;
                                                        motionEvent3 = motionEventObtain;
                                                    } else {
                                                        int I = layoutManager.I();
                                                        if (I == 0) {
                                                            z4 = zK2;
                                                            z2 = zJ2;
                                                            motionEvent3 = motionEventObtain;
                                                            iT = -1;
                                                            z5 = z4;
                                                        } else {
                                                            if (layoutManager.j()) {
                                                                gVarG = r7.f(layoutManager);
                                                            } else {
                                                                if (layoutManager.k()) {
                                                                    gVarG = r7.g(layoutManager);
                                                                } else {
                                                                    gVar = null;
                                                                }
                                                                if (gVar == null) {
                                                                    z4 = zK2;
                                                                    z2 = zJ2;
                                                                    motionEvent3 = motionEventObtain;
                                                                } else {
                                                                    iW = layoutManager.w();
                                                                    z4 = zK2;
                                                                    i = Integer.MIN_VALUE;
                                                                    int i13 = Integer.MAX_VALUE;
                                                                    view = null;
                                                                    view2 = null;
                                                                    motionEvent3 = motionEventObtain;
                                                                    i2 = 0;
                                                                    while (i2 < iW) {
                                                                        int i14 = iW;
                                                                        viewA = layoutManager.A(i2);
                                                                        if (viewA == null) {
                                                                            z8 = zJ2;
                                                                        } else {
                                                                            z8 = zJ2;
                                                                            iD = r7.d(viewA, gVar);
                                                                            if (iD <= 0 && iD > i) {
                                                                                i = iD;
                                                                                view = viewA;
                                                                            }
                                                                            if (iD < 0 && iD < i13) {
                                                                                i13 = iD;
                                                                                view2 = viewA;
                                                                            }
                                                                        }
                                                                        i2++;
                                                                        iW = i14;
                                                                        zJ2 = z8;
                                                                    }
                                                                    z2 = zJ2;
                                                                    z6 = layoutManager.k() ? i10 > 0 : i9 > 0;
                                                                    if (!z6 && view2 != null) {
                                                                        iT = layoutManager.T(view2);
                                                                        z5 = z4;
                                                                    } else if (!z6 || view == null) {
                                                                        if (!z6) {
                                                                            view = view2;
                                                                        }
                                                                        if (view != null) {
                                                                            int iT2 = layoutManager.T(view);
                                                                            int I2 = layoutManager.I();
                                                                            if (z3 || (pointFB = ((o0OOO0o.OooO0O0) layoutManager).b(I2 - 1)) == null || (pointFB.x >= 0.0f && pointFB.y >= 0.0f)) {
                                                                                z7 = false;
                                                                            } else {
                                                                                z7 = true;
                                                                            }
                                                                            if (z7 == z6) {
                                                                                i3 = -1;
                                                                            } else {
                                                                                i3 = 1;
                                                                            }
                                                                            iT = iT2 + i3;
                                                                            z5 = z4;
                                                                            if (iT >= 0 || iT >= I) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        iT = layoutManager.T(view);
                                                                        z5 = z4;
                                                                    }
                                                                }
                                                                iT = -1;
                                                                z5 = z4;
                                                            }
                                                            gVar = gVarG;
                                                            if (gVar == null) {
                                                                z4 = zK2;
                                                                z2 = zJ2;
                                                                motionEvent3 = motionEventObtain;
                                                            } else {
                                                                iW = layoutManager.w();
                                                                z4 = zK2;
                                                                i = Integer.MIN_VALUE;
                                                                int i15 = Integer.MAX_VALUE;
                                                                view = null;
                                                                view2 = null;
                                                                motionEvent3 = motionEventObtain;
                                                                i2 = 0;
                                                                while (i2 < iW) {
                                                                    int i16 = iW;
                                                                    viewA = layoutManager.A(i2);
                                                                    if (viewA == null) {
                                                                        z8 = zJ2;
                                                                    } else {
                                                                        z8 = zJ2;
                                                                        iD = r7.d(viewA, gVar);
                                                                        if (iD <= 0) {
                                                                            i = iD;
                                                                            view = viewA;
                                                                        }
                                                                        if (iD < 0) {
                                                                        }
                                                                    }
                                                                    i2++;
                                                                    iW = i16;
                                                                    zJ2 = z8;
                                                                }
                                                                z2 = zJ2;
                                                                if (layoutManager.k()) {
                                                                }
                                                                if (!z6) {
                                                                    if (z6) {
                                                                        if (!z6) {
                                                                            view = view2;
                                                                        }
                                                                        if (view != null) {
                                                                            int iT3 = layoutManager.T(view);
                                                                            int I3 = layoutManager.I();
                                                                            if (z3) {
                                                                                z7 = false;
                                                                            } else {
                                                                                z7 = false;
                                                                            }
                                                                            if (z7 == z6) {
                                                                                i3 = -1;
                                                                            } else {
                                                                                i3 = 1;
                                                                            }
                                                                            iT = iT3 + i3;
                                                                            z5 = z4;
                                                                            if (iT >= 0) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (!z6) {
                                                                            view = view2;
                                                                        }
                                                                        if (view != null) {
                                                                            int iT4 = layoutManager.T(view);
                                                                            int I4 = layoutManager.I();
                                                                            if (z3) {
                                                                                z7 = false;
                                                                            } else {
                                                                                z7 = false;
                                                                            }
                                                                            if (z7 == z6) {
                                                                                i3 = -1;
                                                                            } else {
                                                                                i3 = 1;
                                                                            }
                                                                            iT = iT4 + i3;
                                                                            z5 = z4;
                                                                            if (iT >= 0) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (z6) {
                                                                    if (!z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        int iT5 = layoutManager.T(view);
                                                                        int I5 = layoutManager.I();
                                                                        if (z3) {
                                                                            z7 = false;
                                                                        } else {
                                                                            z7 = false;
                                                                        }
                                                                        if (z7 == z6) {
                                                                            i3 = -1;
                                                                        } else {
                                                                            i3 = 1;
                                                                        }
                                                                        iT = iT5 + i3;
                                                                        z5 = z4;
                                                                        if (iT >= 0) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        int iT6 = layoutManager.T(view);
                                                                        int I6 = layoutManager.I();
                                                                        if (z3) {
                                                                            z7 = false;
                                                                        } else {
                                                                            z7 = false;
                                                                        }
                                                                        if (z7 == z6) {
                                                                            i3 = -1;
                                                                        } else {
                                                                            i3 = 1;
                                                                        }
                                                                        iT = iT6 + i3;
                                                                        z5 = z4;
                                                                        if (iT >= 0) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            iT = -1;
                                                            z5 = z4;
                                                        }
                                                        r20 = z5;
                                                        if (iT != -1) {
                                                            yVar.a = iT;
                                                            layoutManager.ao(yVar);
                                                        }
                                                    }
                                                    if (z10) {
                                                        if (z2) {
                                                            r4 = r20 | 2;
                                                        } else {
                                                            r4 = r20;
                                                        }
                                                        ak(r4, 1);
                                                        int i17 = this.ab;
                                                        int iMax5 = Math.max(-i17, Math.min(i9, i17));
                                                        int i18 = this.ab;
                                                        int iMax6 = Math.max(-i18, Math.min(i10, i18));
                                                        oo0o0oo = this.af;
                                                        RecyclerView.this.setScrollState(2);
                                                        oo0o0oo.b = 0;
                                                        oo0o0oo.a = 0;
                                                        interpolator = oo0o0oo.e;
                                                        interpolator2 = c;
                                                        if (interpolator != interpolator2) {
                                                            oo0o0oo.e = interpolator2;
                                                            oo0o0oo.c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                                                        }
                                                        oo0o0oo.c.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        oo0o0oo.b();
                                                    } else {
                                                        recyclerView = this;
                                                    }
                                                }
                                            } else {
                                                r20 = zK2;
                                                z2 = zJ2;
                                                motionEvent3 = motionEventObtain;
                                                if (z10) {
                                                    if (z2) {
                                                        r4 = r20 | 2;
                                                    } else {
                                                        r4 = r20;
                                                    }
                                                    ak(r4, 1);
                                                    int i19 = this.ab;
                                                    int iMax7 = Math.max(-i19, Math.min(i9, i19));
                                                    int i110 = this.ab;
                                                    int iMax8 = Math.max(-i110, Math.min(i10, i110));
                                                    oo0o0oo = this.af;
                                                    RecyclerView.this.setScrollState(2);
                                                    oo0o0oo.b = 0;
                                                    oo0o0oo.a = 0;
                                                    interpolator = oo0o0oo.e;
                                                    interpolator2 = c;
                                                    if (interpolator != interpolator2) {
                                                        oo0o0oo.e = interpolator2;
                                                        oo0o0oo.c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                                                    }
                                                    oo0o0oo.c.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                    oo0o0oo.b();
                                                } else {
                                                    recyclerView = this;
                                                }
                                            }
                                        }
                                        i4 = 0;
                                    }
                                }
                                ad();
                                motionEvent2 = motionEvent3;
                            }
                            recyclerView = this;
                            motionEvent3 = motionEventObtain;
                            i4 = 0;
                        }
                        recyclerView.setScrollState(i4);
                        ad();
                        motionEvent2 = motionEvent3;
                    }
                    motionEvent2.recycle();
                    return true;
                }
                ?? r3 = this;
                r3.R = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                r3.V = x3;
                r3.U = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                r3.S = y3;
                r3.T = y3;
                if (zJ) {
                    r10 = zK;
                    r10 = (zK ? 1 : 0) | 2;
                }
                r10 = zK;
                r3.ak(r10, 0);
                r2 = r3;
                motionEvent2 = motionEventObtain;
                r2.H.addMovement(motionEvent2);
                motionEvent2.recycle();
                return true;
            }
            z = true;
        }
        p();
        return z;
    }

    public final void p() {
        ad();
        setScrollState(0);
    }

    public void q() {
        int iJ = this.h.j();
        for (int i = 0; i < iJ; i++) {
            o0O0O00 o0o0o00J = j(this.h.i(i));
            if (!o0o0o00J.v()) {
                o0o0o00J.f();
            }
        }
        o00Ooo o00ooo = this.f;
        int size = o00ooo.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00ooo.c.get(i2).f();
        }
        int size2 = o00ooo.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o00ooo.a.get(i3).f();
        }
        ArrayList<o0O0O00> arrayList = o00ooo.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                o00ooo.b.get(i4).f();
            }
        }
    }

    public void r() {
        if (!this.y || this.F) {
            int i = ivas.gov.bisp.enumeration.H.h.c;
            Trace.beginSection("RV FullInvalidate");
            w();
            Trace.endSection();
            return;
        }
        if (this.i.i()) {
            C0011a c0011a = this.i;
            int i2 = c0011a.e;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c0011a.i()) {
                    int i3 = ivas.gov.bisp.enumeration.H.h.c;
                    Trace.beginSection("RV FullInvalidate");
                    w();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = ivas.gov.bisp.enumeration.H.h.c;
            Trace.beginSection("RV PartialInvalidate");
            ai();
            W();
            this.i.k();
            if (!this.v) {
                int iH = this.h.h();
                for (int i5 = 0; i5 < iH; i5++) {
                    o0O0O00 o0o0o00J = j(this.h.f(i5));
                    if (o0o0o00J != null && !o0o0o00J.v() && o0o0o00J.r()) {
                        w();
                    }
                }
                this.i.d();
            }
            al(true);
            T(true);
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        o0O0O00 o0o0o00J = j(view);
        if (o0o0o00J != null) {
            if (o0o0o00J.q()) {
                o0o0o00J.k &= -257;
            } else if (!o0o0o00J.v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(o0o0o00J);
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(this, sb));
            }
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        o0OOO0o o0ooo0o = this.f25o.g;
        if (!(o0ooo0o != null && o0ooo0o.f) && !S() && view2 != null) {
            ac(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f25o.aE(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            this.s.get(i).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.z != 0 || this.B) {
            this.v = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.P.onRelease();
            zIsFinished |= this.P.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aWX.l(this);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean zK = oooo000.k();
        boolean zJ = this.f25o.j();
        if (zK || zJ) {
            if (!zK) {
                i = 0;
            }
            if (!zJ) {
                i2 = 0;
            }
            ae(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!S()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.C |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(w wVar) {
        this.aC = wVar;
        T.q(this, wVar);
    }

    public void setAdapter(OooO oooO) {
        setLayoutFrozen(false);
        OooO oooO2 = this.p;
        if (oooO2 != null) {
            oooO2.a.unregisterObserver(this.e);
            Objects.requireNonNull(this.p);
        }
        ab();
        C0011a c0011a = this.i;
        c0011a.m(c0011a.b);
        c0011a.m(c0011a.c);
        c0011a.e = 0;
        OooO oooO3 = this.p;
        this.p = oooO;
        if (oooO != null) {
            oooO.a.registerObserver(this.e);
        }
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            oooo000.Z(oooO3, this.p);
        }
        o00Ooo o00ooo = this.f;
        OooO oooO4 = this.p;
        o00ooo.d();
        o00Oo0 o00oo0F = o00ooo.f();
        Objects.requireNonNull(o00oo0F);
        if (oooO3 != null) {
            o00oo0F.b--;
        }
        if (o00oo0F.b == 0) {
            o00oo0F.b();
        }
        if (oooO4 != null) {
            o00oo0F.b++;
        }
        this.ai.f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(OooOOO0 oooOOO0) {
        if (oooOOO0 == this.ap) {
            return;
        }
        this.ap = oooOOO0;
        setChildrenDrawingOrderEnabled(oooOOO0 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.k) {
            R();
        }
        this.k = z;
        super.setClipToPadding(z);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(OooOOO oooOOO) {
        Objects.requireNonNull(oooOOO);
        this.L = oooOOO;
        R();
    }

    public void setHasFixedSize(boolean z) {
        this.w = z;
    }

    public void setItemAnimator(OooOOOO oooOOOO) {
        OooOOOO oooOOOO2 = this.O;
        if (oooOOOO2 != null) {
            oooOOOO2.f();
            this.O.a = null;
        }
        this.O = oooOOOO;
        if (oooOOOO != null) {
            oooOOOO.a = this.an;
        }
    }

    public void setItemViewCacheSize(int i) {
        o00Ooo o00ooo = this.f;
        o00ooo.f = i;
        o00ooo.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(Oooo000 oooo000) {
        if (oooo000 == this.f25o) {
            return;
        }
        bq();
        if (this.f25o != null) {
            OooOOOO oooOOOO = this.O;
            if (oooOOOO != null) {
                oooOOOO.f();
            }
            this.f25o.av(this.f);
            this.f25o.ay(this.f);
            this.f.d();
            if (this.x) {
                Oooo000 oooo001 = this.f25o;
                o00Ooo o00ooo = this.f;
                oooo001.h = false;
                oooo001.aa(this, o00ooo);
            }
            this.f25o.al(null);
            this.f25o = null;
        } else {
            this.f.d();
        }
        C0012b c0012b = this.h;
        C0012b.aMK amk = c0012b.b;
        amk.a = 0L;
        C0012b.aMK amk2 = amk.b;
        if (amk2 != null) {
            amk2.h();
        }
        int size = c0012b.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0012b.aML aml = c0012b.a;
            View view = c0012b.c.get(size);
            x xVar = (x) aml;
            Objects.requireNonNull(xVar);
            o0O0O00 o0o0o00J = j(view);
            if (o0o0o00J != null) {
                xVar.a.ah(o0o0o00J, o0o0o00J.q);
                o0o0o00J.q = 0;
            }
            c0012b.c.remove(size);
        }
        x xVar2 = (x) c0012b.a;
        int iC = xVar2.c();
        for (int i = 0; i < iC; i++) {
            View viewB = xVar2.b(i);
            xVar2.a.u(viewB);
            viewB.clearAnimation();
        }
        xVar2.a.removeAllViews();
        this.f25o = oooo000;
        if (oooo000 != null) {
            if (oooo000.c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(oooo000);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(oooo000.c, sb));
            }
            oooo000.al(this);
            if (this.x) {
                this.f25o.h = true;
            }
        }
        this.f.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        P scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f) {
            View view = scrollingChildHelper.e;
            WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
            T.aXb.z(view);
        }
        scrollingChildHelper.f = z;
    }

    public void setOnFlingListener(o000oOoO o000oooo) {
        this.ao = o000oooo;
    }

    @Deprecated
    public void setOnScrollListener(o00O0O o00o0o) {
        this.aj = o00o0o;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.ae = z;
    }

    public void setRecycledViewPool(o00Oo0 o00oo0) {
        o00Ooo o00ooo = this.f;
        o00Oo0 o00oo1 = o00ooo.g;
        if (o00oo1 != null) {
            o00oo1.b--;
        }
        o00ooo.g = o00oo0;
        if (o00oo0 == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        o00ooo.g.b++;
    }

    @Deprecated
    public void setRecyclerListener(oo000o oo000oVar) {
        this.q = oo000oVar;
    }

    public void setScrollState(int i) {
        o0OOO0o o0ooo0o;
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        if (i != 2) {
            this.af.d();
            Oooo000 oooo000 = this.f25o;
            if (oooo000 != null && (o0ooo0o = oooo000.g) != null) {
                o0ooo0o.d();
            }
        }
        Oooo000 oooo001 = this.f25o;
        if (oooo001 != null) {
            oooo001.au(i);
        }
        o00O0O o00o0o = this.aj;
        if (o00o0o != null) {
            o00o0o.b(this, i);
        }
        List<o00O0O> list = this.al;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.al.get(size).b(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.W = viewConfiguration.getScaledTouchSlop();
        } else {
            this.W = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(o0OO00O o0oo00o) {
        Objects.requireNonNull(this.f);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().c(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().l(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.B) {
            l("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.B = true;
                this.A = true;
                bq();
                return;
            }
            this.B = false;
            if (this.v && this.f25o != null && this.p != null) {
                requestLayout();
            }
            this.v = false;
        }
    }

    public void t(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        int iB = Oooo000.b(i, paddingRight + paddingLeft, T.aWX.h(this));
        int paddingTop = getPaddingTop();
        setMeasuredDimension(iB, Oooo000.b(i2, getPaddingBottom() + paddingTop, T.aWX.f(this)));
    }

    public void u(View view) {
        o0O0O00 o0o0o00J = j(view);
        OooO oooO = this.p;
        if (oooO == null || o0o0o00J == null) {
            return;
        }
        Objects.requireNonNull(oooO);
    }

    public final void v() {
        A.aNm anm;
        View viewG;
        this.ai.b(1);
        H(this.ai);
        this.ai.a = false;
        ai();
        A a2 = this.j;
        a2.a.clear();
        a2.b.e();
        W();
        Y();
        View focusedChild = (this.ae && hasFocus() && this.p != null) ? getFocusedChild() : null;
        o0O0O00 o0o0o00O = (focusedChild == null || (viewG = G(focusedChild)) == null) ? null : O(viewG);
        if (o0o0o00O == null) {
            o0Oo0oo o0oo0oo = this.ai;
            o0oo0oo.n = -1L;
            o0oo0oo.l = -1;
            o0oo0oo.m = -1;
        } else {
            o0Oo0oo o0oo0oo2 = this.ai;
            o0oo0oo2.n = this.p.b ? o0o0o00O.h : -1L;
            o0oo0oo2.l = this.F ? -1 : o0o0o00O.p() ? o0o0o00O.f : o0o0o00O.i();
            o0Oo0oo o0oo0oo3 = this.ai;
            View focusedChild2 = o0o0o00O.c;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            o0oo0oo3.m = id;
        }
        o0Oo0oo o0oo0oo4 = this.ai;
        o0oo0oo4.i = o0oo0oo4.j && this.am;
        this.am = false;
        this.ak = false;
        o0oo0oo4.h = o0oo0oo4.k;
        o0oo0oo4.g = this.p.b();
        J(this.aq);
        if (this.ai.j) {
            int iH = this.h.h();
            for (int i = 0; i < iH; i++) {
                o0O0O00 o0o0o00J = j(this.h.f(i));
                if (!o0o0o00J.v() && (!o0o0o00J.m() || this.p.b)) {
                    OooOOOO oooOOOO = this.O;
                    OooOOOO.b(o0o0o00J);
                    o0o0o00J.j();
                    this.j.d(o0o0o00J, oooOOOO.i(o0o0o00J));
                    if (this.ai.i && o0o0o00J.r() && !o0o0o00J.p() && !o0o0o00J.v() && !o0o0o00J.m()) {
                        this.j.b.j(L(o0o0o00J), o0o0o00J);
                    }
                }
            }
        }
        if (this.ai.k) {
            int iJ = this.h.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                o0O0O00 o0o0o00J2 = j(this.h.i(i2));
                if (!o0o0o00J2.v() && o0o0o00J2.f == -1) {
                    o0o0o00J2.f = o0o0o00J2.e;
                }
            }
            o0Oo0oo o0oo0oo5 = this.ai;
            boolean z = o0oo0oo5.f;
            o0oo0oo5.f = false;
            this.f25o.aD(this.f, o0oo0oo5);
            this.ai.f = z;
            for (int i3 = 0; i3 < this.h.h(); i3++) {
                o0O0O00 o0o0o00J3 = j(this.h.f(i3));
                if (!o0o0o00J3.v() && ((anm = (A.aNm) this.j.a.getOrDefault(o0o0o00J3, null)) == null || (anm.b & 4) == 0)) {
                    OooOOOO.b(o0o0o00J3);
                    boolean zK = o0o0o00J3.k(8192);
                    OooOOOO oooOOOO2 = this.O;
                    o0o0o00J3.j();
                    OooOOOO.OooO0OO oooO0OOI = oooOOOO2.i(o0o0o00J3);
                    if (zK) {
                        aa(o0o0o00J3, oooO0OOI);
                    } else {
                        A a3 = this.j;
                        A.aNm anmC = (A.aNm) a3.a.getOrDefault(o0o0o00J3, null);
                        if (anmC == null) {
                            anmC = A.aNm.c();
                            a3.a.put(o0o0o00J3, anmC);
                        }
                        anmC.b |= 2;
                        anmC.c = oooO0OOI;
                    }
                }
            }
            q();
        } else {
            q();
        }
        T(true);
        al(false);
        this.ai.e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0260  */
    /* JADX WARN: Code duplicated, block: B:104:0x026f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0275  */
    /* JADX WARN: Code duplicated, block: B:107:0x0279  */
    /* JADX WARN: Code duplicated, block: B:108:0x0282  */
    /* JADX WARN: Code duplicated, block: B:110:0x0286  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0324  */
    /* JADX WARN: Code duplicated, block: B:139:0x0330  */
    /* JADX WARN: Code duplicated, block: B:141:0x0338  */
    /* JADX WARN: Code duplicated, block: B:158:0x0374  */
    /* JADX WARN: Code duplicated, block: B:160:0x0377  */
    /* JADX WARN: Code duplicated, block: B:165:0x038c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0394  */
    /* JADX WARN: Code duplicated, block: B:169:0x039b  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:177:0x03b4 A[LOOP:3: B:171:0x03a1->B:177:0x03b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:190:0x03db  */
    /* JADX WARN: Code duplicated, block: B:201:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0297 A[EDGE_INSN: B:208:0x0297->B:112:0x0297 BREAK  A[LOOP:2: B:76:0x01c3->B:111:0x0290], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x03d0 A[ADDED_TO_REGION, EDGE_INSN: B:224:0x03d0->B:187:0x03d0 BREAK  A[LOOP:4: B:179:0x03bb->B:227:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01de  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0206  */
    /* JADX WARN: Code duplicated, block: B:87:0x0210  */
    /* JADX WARN: Code duplicated, block: B:89:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x0222  */
    /* JADX WARN: Code duplicated, block: B:92:0x0228  */
    /* JADX WARN: Code duplicated, block: B:94:0x023b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0243  */
    /* JADX WARN: Code duplicated, block: B:97:0x0249  */
    public void w() {
        int i;
        o0Oo0oo o0oo0oo;
        int i2;
        View view;
        ArrayList<o0O0O00> arrayList;
        Oooo000 oooo000;
        int i3;
        int[] iArr;
        long j;
        o0O0O00 o0o0o00J;
        int i4;
        int iC;
        int i5;
        int iMin;
        o0O0O00 o0o0o00M;
        o0O0O00 o0o0o00M2;
        int i6;
        View viewFindViewById;
        boolean z;
        o0O0O00 o0o0o00;
        int iH;
        A a2;
        A.aNj anj;
        int i7;
        o0O0O00 o0o0o01;
        A.aNm anm;
        int i8;
        OooOOOO.OooO0OO oooO0OO;
        OooOOOO.OooO0OO oooO0OO2;
        OooO0o oooO0o;
        RecyclerView recyclerView;
        z zVar;
        int i9;
        int i10;
        OooOOOO.OooO0OO oooO0OO3;
        o0O0O00 o0o0o00J2;
        OooOOOO.OooO0OO oooO0OO4;
        o0O0O00 o0o0o02;
        if (this.p == null) {
            return;
        }
        if (this.f25o == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.ai.a = false;
        boolean z2 = this.ay && !(this.az == getWidth() && this.aA == getHeight());
        this.az = 0;
        this.aA = 0;
        this.ay = false;
        if (this.ai.e != 1) {
            C0011a c0011a = this.i;
            if ((c0011a.c.isEmpty() || c0011a.b.isEmpty()) && !z2 && this.f25o.m == getWidth() && this.f25o.f26o == getHeight()) {
                this.f25o.aA(this);
            }
            i = 4;
            this.ai.b(4);
            ai();
            W();
            o0oo0oo = this.ai;
            o0oo0oo.e = 1;
            i2 = -1;
            view = null;
            if (o0oo0oo.j) {
                iH = this.h.h() - 1;
                while (iH >= 0) {
                    o0o0o00J2 = j(this.h.f(iH));
                    if (!o0o0o00J2.v()) {
                        long jL = L(o0o0o00J2);
                        Objects.requireNonNull(this.O);
                        oooO0OO4 = new OooOOOO.OooO0OO();
                        View view2 = o0o0o00J2.c;
                        oooO0OO4.a = view2.getLeft();
                        oooO0OO4.b = view2.getTop();
                        view2.getRight();
                        view2.getBottom();
                        o0o0o02 = (o0O0O00) this.j.b.h(jL, null);
                        if (o0o0o02 != null || o0o0o02.v()) {
                            this.j.c(o0o0o00J2, oooO0OO4);
                        } else {
                            boolean zE = this.j.e(o0o0o02);
                            boolean zE2 = this.j.e(o0o0o00J2);
                            if (zE && o0o0o02 == o0o0o00J2) {
                                this.j.c(o0o0o00J2, oooO0OO4);
                            } else {
                                OooOOOO.OooO0OO oooO0OOG = this.j.g(o0o0o02, i);
                                this.j.c(o0o0o00J2, oooO0OO4);
                                OooOOOO.OooO0OO oooO0OOG2 = this.j.g(o0o0o00J2, 8);
                                if (oooO0OOG == null) {
                                    int iH2 = this.h.h();
                                    for (int i11 = 0; i11 < iH2; i11++) {
                                        o0O0O00 o0o0o00J3 = j(this.h.f(i11));
                                        if (o0o0o00J3 != o0o0o00J2 && L(o0o0o00J3) == jL) {
                                            OooO oooO = this.p;
                                            if (oooO == null || !oooO.b) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                sb.append(o0o0o00J3);
                                                sb.append(" \n View Holder 2:");
                                                sb.append(o0o0o00J2);
                                                throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, sb));
                                            }
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                            sb2.append(o0o0o00J3);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(o0o0o00J2);
                                            throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, sb2));
                                        }
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                                    sb3.append(o0o0o02);
                                    sb3.append(" cannot be found but it is necessary for ");
                                    sb3.append(o0o0o00J2);
                                    sb3.append(F());
                                    Log.e("RecyclerView", sb3.toString());
                                } else {
                                    o0o0o02.w(false);
                                    if (zE) {
                                        m(o0o0o02);
                                    }
                                    if (o0o0o02 != o0o0o00J2) {
                                        if (zE2) {
                                            m(o0o0o00J2);
                                        }
                                        o0o0o02.j = o0o0o00J2;
                                        m(o0o0o02);
                                        this.f.l(o0o0o02);
                                        o0o0o00J2.w(false);
                                        o0o0o00J2.b = o0o0o02;
                                    }
                                    if (this.O.c(o0o0o02, o0o0o00J2, oooO0OOG, oooO0OOG2)) {
                                        bc();
                                    }
                                }
                            }
                        }
                    }
                    iH--;
                    i = 4;
                }
                a2 = this.j;
                anj = this.aw;
                i7 = a2.a.i;
                while (true) {
                    i7 += i2;
                    if (i7 >= 0) {
                        break;
                    }
                    o0o0o01 = (o0O0O00) a2.a.k(i7);
                    anm = (A.aNm) a2.a.l(i7);
                    i8 = anm.b;
                    if ((i8 & 3) == 3) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.f25o.aH(o0o0o01.c, recyclerView2.f);
                    } else if ((i8 & 1) != 0) {
                        oooO0OO3 = anm.c;
                        if (oooO0OO3 == null) {
                            RecyclerView recyclerView3 = RecyclerView.this;
                            recyclerView3.f25o.aH(o0o0o01.c, recyclerView3.f);
                        } else {
                            ((OooO0o) anj).c(o0o0o01, oooO0OO3, anm.d);
                        }
                    } else if ((i8 & 14) == 14) {
                        ((OooO0o) anj).b(o0o0o01, anm.c, anm.d);
                    } else if ((i8 & 12) == 12) {
                        oooO0OO = anm.c;
                        oooO0OO2 = anm.d;
                        oooO0o = (OooO0o) anj;
                        Objects.requireNonNull(oooO0o);
                        o0o0o01.w(false);
                        recyclerView = RecyclerView.this;
                        if (recyclerView.F) {
                            zVar = (z) recyclerView.O;
                            Objects.requireNonNull(zVar);
                            i9 = oooO0OO.a;
                            i10 = oooO0OO2.a;
                            if (i9 != i10 && oooO0OO.b == oooO0OO2.b) {
                                zVar.d(o0o0o01);
                            } else if (zVar.j(o0o0o01, i9, oooO0OO.b, i10, oooO0OO2.b)) {
                                RecyclerView.this.bc();
                            }
                        } else if (recyclerView.O.c(o0o0o01, o0o0o01, oooO0OO, oooO0OO2)) {
                            RecyclerView.this.bc();
                        }
                    } else if ((i8 & 4) != 0) {
                        ((OooO0o) anj).c(o0o0o01, anm.c, null);
                    } else if ((i8 & 8) != 0) {
                        ((OooO0o) anj).b(o0o0o01, anm.c, anm.d);
                    }
                    A.aNm.d(anm);
                    i2 = -1;
                }
            }
            this.f25o.ay(this.f);
            o0Oo0oo o0oo0oo2 = this.ai;
            o0oo0oo2.c = o0oo0oo2.g;
            this.F = false;
            this.G = false;
            o0oo0oo2.j = false;
            o0oo0oo2.k = false;
            this.f25o.f = false;
            arrayList = this.f.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            oooo000 = this.f25o;
            if (oooo000.k) {
                oooo000.j = 0;
                oooo000.k = false;
                this.f.m();
            }
            this.f25o.aJ(this.ai);
            T(true);
            al(false);
            A a3 = this.j;
            a3.a.clear();
            a3.b.e();
            int[] iArr2 = this.aq;
            i3 = iArr2[0];
            int i12 = iArr2[1];
            J(iArr2);
            iArr = this.aq;
            if (iArr[0] == i3 || iArr[1] != i12) {
                B(0, 0);
            }
            if (this.ae && this.p != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                if (!isFocused()) {
                    j = this.ai.n;
                    if (j == -1) {
                        o0o0o00J = null;
                    } else {
                        o0o0o00J = null;
                    }
                    if (o0o0o00J != null) {
                        if (this.h.h() > 0) {
                            o0Oo0oo o0oo0oo3 = this.ai;
                            int i13 = o0oo0oo3.l;
                            if (i13 != -1) {
                            }
                            iC = o0oo0oo3.c();
                            i5 = i4;
                            while (true) {
                                if (i5 < iC) {
                                    o0o0o00M2 = M(i5);
                                    if (o0o0o00M2 != null) {
                                        if (o0o0o00M2.c.hasFocusable()) {
                                            view = o0o0o00M2.c;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                iMin = Math.min(iC, i4);
                                while (true) {
                                    iMin--;
                                    if (iMin >= 0) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                            }
                        }
                    } else if (this.h.h() > 0) {
                        o0Oo0oo o0oo0oo4 = this.ai;
                        int i14 = o0oo0oo4.l;
                        if (i14 != -1) {
                        }
                        iC = o0oo0oo4.c();
                        i5 = i4;
                        while (true) {
                            if (i5 < iC) {
                                o0o0o00M2 = M(i5);
                                if (o0o0o00M2 != null) {
                                    if (o0o0o00M2.c.hasFocusable()) {
                                        view = o0o0o00M2.c;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            iMin = Math.min(iC, i4);
                            while (true) {
                                iMin--;
                                if (iMin >= 0) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    if (view != null) {
                        i6 = this.ai.m;
                        if (i6 != -1) {
                            view = viewFindViewById;
                        }
                        view.requestFocus();
                    }
                } else if (this.h.l(getFocusedChild())) {
                    j = this.ai.n;
                    if (j == -1 && (z = this.p.b)) {
                        if (z) {
                            int iJ = this.h.j();
                            int i15 = 0;
                            o0o0o00 = null;
                            while (true) {
                                if (i15 < iJ) {
                                    o0o0o00J = j(this.h.i(i15));
                                    if (o0o0o00J != null && !o0o0o00J.p() && o0o0o00J.h == j) {
                                        if (!this.h.l(o0o0o00J.c)) {
                                            break;
                                        } else {
                                            o0o0o00 = o0o0o00J;
                                        }
                                    }
                                    i15++;
                                }
                            }
                        } else {
                            o0o0o00 = null;
                        }
                        o0o0o00J = o0o0o00;
                        break;
                    } else {
                        o0o0o00J = null;
                    }
                    if (o0o0o00J != null || this.h.l(o0o0o00J.c) || !o0o0o00J.c.hasFocusable()) {
                        if (this.h.h() > 0) {
                            o0Oo0oo o0oo0oo5 = this.ai;
                            int i16 = o0oo0oo5.l;
                            i4 = i16 != -1 ? i16 : 0;
                            iC = o0oo0oo5.c();
                            i5 = i4;
                            while (true) {
                                if (i5 < iC) {
                                    o0o0o00M2 = M(i5);
                                    if (o0o0o00M2 != null) {
                                        if (o0o0o00M2.c.hasFocusable()) {
                                            view = o0o0o00M2.c;
                                        } else {
                                            i5++;
                                        }
                                    }
                                }
                                iMin = Math.min(iC, i4);
                                while (true) {
                                    iMin--;
                                    if (iMin >= 0 && (o0o0o00M = M(iMin)) != null) {
                                        if (o0o0o00M.c.hasFocusable()) {
                                            view = o0o0o00M.c;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view = o0o0o00J.c;
                    }
                    if (view != null) {
                        i6 = this.ai.m;
                        if (i6 != -1 && (viewFindViewById = view.findViewById(i6)) != null && viewFindViewById.isFocusable()) {
                            view = viewFindViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            o0Oo0oo o0oo0oo6 = this.ai;
            o0oo0oo6.n = -1L;
            o0oo0oo6.l = -1;
            o0oo0oo6.m = -1;
        }
        v();
        this.f25o.aA(this);
        x();
        i = 4;
        this.ai.b(4);
        ai();
        W();
        o0oo0oo = this.ai;
        o0oo0oo.e = 1;
        i2 = -1;
        view = null;
        if (o0oo0oo.j) {
            iH = this.h.h() - 1;
            while (iH >= 0) {
                o0o0o00J2 = j(this.h.f(iH));
                if (!o0o0o00J2.v()) {
                    long jL2 = L(o0o0o00J2);
                    Objects.requireNonNull(this.O);
                    oooO0OO4 = new OooOOOO.OooO0OO();
                    View view3 = o0o0o00J2.c;
                    oooO0OO4.a = view3.getLeft();
                    oooO0OO4.b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
                    o0o0o02 = (o0O0O00) this.j.b.h(jL2, null);
                    if (o0o0o02 != null) {
                        this.j.c(o0o0o00J2, oooO0OO4);
                    } else {
                        this.j.c(o0o0o00J2, oooO0OO4);
                    }
                }
                iH--;
                i = 4;
            }
            a2 = this.j;
            anj = this.aw;
            i7 = a2.a.i;
            while (true) {
                i7 += i2;
                if (i7 >= 0) {
                    break;
                    break;
                }
                o0o0o01 = (o0O0O00) a2.a.k(i7);
                anm = (A.aNm) a2.a.l(i7);
                i8 = anm.b;
                if ((i8 & 3) == 3) {
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.f25o.aH(o0o0o01.c, recyclerView4.f);
                } else if ((i8 & 1) != 0) {
                    oooO0OO3 = anm.c;
                    if (oooO0OO3 == null) {
                        RecyclerView recyclerView5 = RecyclerView.this;
                        recyclerView5.f25o.aH(o0o0o01.c, recyclerView5.f);
                    } else {
                        ((OooO0o) anj).c(o0o0o01, oooO0OO3, anm.d);
                    }
                } else if ((i8 & 14) == 14) {
                    ((OooO0o) anj).b(o0o0o01, anm.c, anm.d);
                } else if ((i8 & 12) == 12) {
                    oooO0OO = anm.c;
                    oooO0OO2 = anm.d;
                    oooO0o = (OooO0o) anj;
                    Objects.requireNonNull(oooO0o);
                    o0o0o01.w(false);
                    recyclerView = RecyclerView.this;
                    if (recyclerView.F) {
                        zVar = (z) recyclerView.O;
                        Objects.requireNonNull(zVar);
                        i9 = oooO0OO.a;
                        i10 = oooO0OO2.a;
                        if (i9 != i10) {
                            if (zVar.j(o0o0o01, i9, oooO0OO.b, i10, oooO0OO2.b)) {
                                RecyclerView.this.bc();
                            }
                        } else if (zVar.j(o0o0o01, i9, oooO0OO.b, i10, oooO0OO2.b)) {
                            RecyclerView.this.bc();
                        }
                    } else if (recyclerView.O.c(o0o0o01, o0o0o01, oooO0OO, oooO0OO2)) {
                        RecyclerView.this.bc();
                    }
                } else if ((i8 & 4) != 0) {
                    ((OooO0o) anj).c(o0o0o01, anm.c, null);
                } else if ((i8 & 8) != 0) {
                    ((OooO0o) anj).b(o0o0o01, anm.c, anm.d);
                }
                A.aNm.d(anm);
                i2 = -1;
            }
        }
        this.f25o.ay(this.f);
        o0Oo0oo o0oo0oo7 = this.ai;
        o0oo0oo7.c = o0oo0oo7.g;
        this.F = false;
        this.G = false;
        o0oo0oo7.j = false;
        o0oo0oo7.k = false;
        this.f25o.f = false;
        arrayList = this.f.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        oooo000 = this.f25o;
        if (oooo000.k) {
            oooo000.j = 0;
            oooo000.k = false;
            this.f.m();
        }
        this.f25o.aJ(this.ai);
        T(true);
        al(false);
        A a4 = this.j;
        a4.a.clear();
        a4.b.e();
        int[] iArr3 = this.aq;
        i3 = iArr3[0];
        int i17 = iArr3[1];
        J(iArr3);
        iArr = this.aq;
        if (iArr[0] == i3) {
            B(0, 0);
        } else {
            B(0, 0);
        }
        if (this.ae) {
            if (!isFocused()) {
                j = this.ai.n;
                if (j == -1) {
                    o0o0o00J = null;
                } else {
                    o0o0o00J = null;
                }
                if (o0o0o00J != null) {
                    if (this.h.h() > 0) {
                        o0Oo0oo o0oo0oo8 = this.ai;
                        int i18 = o0oo0oo8.l;
                        if (i18 != -1) {
                        }
                        iC = o0oo0oo8.c();
                        i5 = i4;
                        while (true) {
                            if (i5 < iC) {
                                o0o0o00M2 = M(i5);
                                if (o0o0o00M2 != null) {
                                    if (o0o0o00M2.c.hasFocusable()) {
                                        view = o0o0o00M2.c;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            iMin = Math.min(iC, i4);
                            while (true) {
                                iMin--;
                                if (iMin >= 0) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.h() > 0) {
                    o0Oo0oo o0oo0oo9 = this.ai;
                    int i19 = o0oo0oo9.l;
                    if (i19 != -1) {
                    }
                    iC = o0oo0oo9.c();
                    i5 = i4;
                    while (true) {
                        if (i5 < iC) {
                            o0o0o00M2 = M(i5);
                            if (o0o0o00M2 != null) {
                                if (o0o0o00M2.c.hasFocusable()) {
                                    view = o0o0o00M2.c;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        iMin = Math.min(iC, i4);
                        while (true) {
                            iMin--;
                            if (iMin >= 0) {
                                break;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i6 = this.ai.m;
                    if (i6 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.h.l(getFocusedChild())) {
                j = this.ai.n;
                if (j == -1) {
                    o0o0o00J = null;
                } else {
                    o0o0o00J = null;
                }
                if (o0o0o00J != null) {
                    if (this.h.h() > 0) {
                        o0Oo0oo o0oo0oo10 = this.ai;
                        int i110 = o0oo0oo10.l;
                        if (i110 != -1) {
                        }
                        iC = o0oo0oo10.c();
                        i5 = i4;
                        while (true) {
                            if (i5 < iC) {
                                o0o0o00M2 = M(i5);
                                if (o0o0o00M2 != null) {
                                    if (o0o0o00M2.c.hasFocusable()) {
                                        view = o0o0o00M2.c;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            iMin = Math.min(iC, i4);
                            while (true) {
                                iMin--;
                                if (iMin >= 0) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.h() > 0) {
                    o0Oo0oo o0oo0oo11 = this.ai;
                    int i111 = o0oo0oo11.l;
                    if (i111 != -1) {
                    }
                    iC = o0oo0oo11.c();
                    i5 = i4;
                    while (true) {
                        if (i5 < iC) {
                            o0o0o00M2 = M(i5);
                            if (o0o0o00M2 != null) {
                                if (o0o0o00M2.c.hasFocusable()) {
                                    view = o0o0o00M2.c;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        iMin = Math.min(iC, i4);
                        while (true) {
                            iMin--;
                            if (iMin >= 0) {
                                break;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i6 = this.ai.m;
                    if (i6 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        o0Oo0oo o0oo0oo12 = this.ai;
        o0oo0oo12.n = -1L;
        o0oo0oo12.l = -1;
        o0oo0oo12.m = -1;
    }

    public final void x() {
        ai();
        W();
        this.ai.b(6);
        this.i.e();
        this.ai.g = this.p.b();
        this.ai.d = 0;
        if (this.g != null) {
            OooO oooO = this.p;
            int iC = ivas.gov.bisp.enumeration.p003ac.P.c(oooO.c);
            if (iC == 1 ? oooO.b() > 0 : iC != 2) {
                Parcelable parcelable = this.g.b;
                if (parcelable != null) {
                    this.f25o.as(parcelable);
                }
                this.g = null;
            }
        }
        o0Oo0oo o0oo0oo = this.ai;
        o0oo0oo.h = false;
        this.f25o.aD(this.f, o0oo0oo);
        o0Oo0oo o0oo0oo2 = this.ai;
        o0oo0oo2.f = false;
        o0oo0oo2.j = o0oo0oo2.j && this.O != null;
        o0oo0oo2.e = 4;
        T(true);
        al(false);
    }

    public void y() {
        if (this.I != null) {
            return;
        }
        EdgeEffect edgeEffectB = this.L.b(this);
        this.I = edgeEffectB;
        if (!this.k) {
            edgeEffectB.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        edgeEffectB.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX WARN: Failed to calculate best type for var: r3v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v21 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v21 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v21 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v21 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v24 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v24 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v24 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v24 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v28 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v28 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v29 ??, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 java.lang.reflect.Constructor, new type: java.lang.reflect.Constructor
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        int i2;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.e = new o00oO0o();
        this.f = new o00Ooo();
        this.j = new A();
        this.d = new OooO00o();
        this.l = new Rect();
        this.m = new Rect();
        this.n = new RectF();
        this.r = new ArrayList();
        this.t = new ArrayList<>();
        this.s = new ArrayList<>();
        this.z = 0;
        this.F = false;
        this.G = false;
        this.J = 0;
        this.K = 0;
        this.L = new OooOOO();
        this.O = new o();
        this.Q = 0;
        this.R = -1;
        this.ac = Float.MIN_VALUE;
        this.ad = Float.MIN_VALUE;
        this.ae = true;
        this.af = new oo0o0Oo();
        this.ah = new q.aNf();
        this.ai = new o0Oo0oo();
        this.ak = false;
        this.am = false;
        this.an = new OooOo00();
        this.ax = false;
        this.aq = new int[2];
        this.as = new int[2];
        this.av = new int[2];
        this.aB = new int[2];
        this.au = new ArrayList();
        this.at = new OooO0O0();
        this.az = 0;
        this.aA = 0;
        this.aw = new OooO0o();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        Method method = L.c;
        int i3 = Build.VERSION.SDK_INT;
        this.ac = i3 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : L.b(viewConfiguration, context);
        this.ad = i3 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : L.b(viewConfiguration, context);
        this.aa = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ab = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.a = this.an;
        this.i = new C0011a(new v(this));
        this.h = new C0012b(new x(this));
        WeakHashMap<View, ivas.gov.bisp.enumeration.p081d.R> weakHashMap = T.c;
        if ((i3 < 26 || T.aXg.d(this) == 0) && i3 >= 26) {
            T.aXg.m(this, 8);
        }
        if (T.aWX.e(this) == 0) {
            T.aWX.t(this, 1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new w(this));
        int[] iArr = ivas.gov.bisp.enumeration.O.i.i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        T.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.k = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(this, ivas.gov.bisp.enumeration.p091n.j.w("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            new n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ivas.gov.bisp.enumeration.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ivas.gov.bisp.enumeration.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(strTrim);
                    strTrim = sb.toString();
                } else if (!strTrim.contains(".")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(RecyclerView.class.getPackage().getName());
                    sb2.append('.');
                    sb2.append(strTrim);
                    strTrim = sb2.toString();
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(Oooo000.class);
                    try {
                        GenericDeclaration constructor2 = clsAsSubclass.getConstructor(a);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[r9] = attributeSet;
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = 0;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(attributeSet.getPositionDescription());
                            sb3.append(": Error creating LayoutManager ");
                            sb3.append(strTrim);
                            throw new IllegalStateException(sb3.toString(), e2);
                        }
                    }
                    constructor.setAccessible(r9);
                    setLayoutManager((Oooo000) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Class is not a LayoutManager ");
                    sb4.append(strTrim);
                    throw new IllegalStateException(sb4.toString(), e3);
                } catch (ClassNotFoundException e4) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Unable to find LayoutManager ");
                    sb5.append(strTrim);
                    throw new IllegalStateException(sb5.toString(), e4);
                } catch (IllegalAccessException e5) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Cannot access non-public constructor ");
                    sb6.append(strTrim);
                    throw new IllegalStateException(sb6.toString(), e5);
                } catch (InstantiationException e6) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(attributeSet.getPositionDescription());
                    sb7.append(": Could not instantiate the LayoutManager: ");
                    sb7.append(strTrim);
                    throw new IllegalStateException(sb7.toString(), e6);
                } catch (InvocationTargetException e7) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(attributeSet.getPositionDescription());
                    sb8.append(": Could not instantiate the LayoutManager: ");
                    sb8.append(strTrim);
                    throw new IllegalStateException(sb8.toString(), e7);
                }
            }
        }
        int[] iArr2 = b;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        T.p(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    public static class o0ooOOo extends ivas.gov.bisp.enumeration.p103z.l {
        public static final Parcelable.Creator<o0ooOOo> CREATOR = new OooO00o();
        public Parcelable b;

        public class OooO00o implements Parcelable.ClassLoaderCreator<o0ooOOo> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public o0ooOOo createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o0ooOOo(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new o0ooOOo[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o0ooOOo(parcel, null);
            }
        }

        public o0ooOOo(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = parcel.readParcelable(classLoader == null ? Oooo000.class.getClassLoader() : classLoader);
        }

        @Override // ivas.gov.bisp.enumeration.p103z.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.b, 0);
        }

        public o0ooOOo(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class Oooo0 extends ViewGroup.MarginLayoutParams {
        public o0O0O00 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public Oooo0(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int f() {
            return this.a.h();
        }

        public boolean g() {
            return this.a.r();
        }

        public boolean h() {
            return this.a.p();
        }

        public Oooo0(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public Oooo0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public Oooo0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public Oooo0(Oooo0 oooo0) {
            super((ViewGroup.LayoutParams) oooo0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Oooo000 oooo000 = this.f25o;
        if (oooo000 != null) {
            return oooo000.z(layoutParams);
        }
        throw new IllegalStateException(ivas.gov.bisp.enumeration.p091n.j.n(this, ivas.gov.bisp.enumeration.p091n.j.w("RecyclerView has no LayoutManager")));
    }
}
