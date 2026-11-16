package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import ivas.gov.bisp.enumeration.p081d.R;
import ivas.gov.bisp.enumeration.p081d.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0012b {
    public final aML a;
    public final aMK b = new aMK();
    public final List<View> c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$aMK */
    public static class aMK {
        public long a = 0;
        public aMK b;

        public void b(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            aMK amk = this.b;
            if (amk != null) {
                amk.b(i - 64);
            }
        }

        public int c(int i) {
            aMK amk = this.b;
            if (amk == null) {
                return i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            }
            return Long.bitCount(this.a) + amk.c(i - 64);
        }

        public final void d() {
            if (this.b == null) {
                this.b = new aMK();
            }
        }

        public boolean e(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            d();
            return this.b.e(i - 64);
        }

        public boolean f(int i) {
            if (i >= 64) {
                d();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = Long.rotateRight((~j4) & j3, 1) | (j4 & j3);
            aMK amk = this.b;
            if (amk != null) {
                if (amk.e(0)) {
                    i(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g(int i, boolean z) {
            if (i >= 64) {
                d();
                this.b.g(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = (j & j2) | (((~j2) & j) << 1);
            if (z) {
                i(i);
            } else {
                b(i);
            }
            if (z2 || this.b != null) {
                d();
                this.b.g(0, z2);
            }
        }

        public void h() {
            this.a = 0L;
            aMK amk = this.b;
            if (amk != null) {
                amk.h();
            }
        }

        public void i(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                d();
                this.b.i(i - 64);
            }
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.a));
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$aML */
    public interface aML {
    }

    public C0012b(aML aml) {
        this.a = aml;
    }

    public final void b(View view) {
        this.c.add(view);
        x xVar = (x) this.a;
        Objects.requireNonNull(xVar);
        RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(view);
        if (o0o0o00J != null) {
            RecyclerView recyclerView = xVar.a;
            int i = o0o0o00J.s;
            if (i != -1) {
                o0o0o00J.q = i;
            } else {
                View view2 = o0o0o00J.c;
                WeakHashMap<View, R> weakHashMap = T.c;
                o0o0o00J.q = T.aWX.e(view2);
            }
            recyclerView.ah(o0o0o00J, 4);
        }
    }

    public void c(View view, int i, boolean z) {
        int iC = i < 0 ? ((x) this.a).c() : g(i);
        this.b.g(iC, z);
        if (z) {
            b(view);
        }
        x xVar = (x) this.a;
        xVar.a.addView(view, iC);
        Objects.requireNonNull(xVar.a);
        RecyclerView.j(view);
    }

    public void d(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iC = i < 0 ? ((x) this.a).c() : g(i);
        this.b.g(iC, z);
        if (z) {
            b(view);
        }
        x xVar = (x) this.a;
        Objects.requireNonNull(xVar);
        RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(view);
        if (o0o0o00J != null) {
            if (!o0o0o00J.q() && !o0o0o00J.v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(o0o0o00J);
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(xVar.a, sb));
            }
            o0o0o00J.k &= -257;
        }
        xVar.a.attachViewToParent(view, iC, layoutParams);
    }

    public void e(int i) {
        RecyclerView.o0O0O00 o0o0o00J;
        int iG = g(i);
        this.b.f(iG);
        x xVar = (x) this.a;
        View childAt = xVar.a.getChildAt(iG);
        if (childAt != null && (o0o0o00J = RecyclerView.j(childAt)) != null) {
            if (o0o0o00J.q() && !o0o0o00J.v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(o0o0o00J);
                throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.n(xVar.a, sb));
            }
            o0o0o00J.e(256);
        }
        xVar.a.detachViewFromParent(iG);
    }

    public View f(int i) {
        return ((x) this.a).b(g(i));
    }

    public final int g(int i) {
        if (i < 0) {
            return -1;
        }
        int iC = ((x) this.a).c();
        int i2 = i;
        while (i2 < iC) {
            int iC2 = i - (i2 - this.b.c(i2));
            if (iC2 == 0) {
                while (this.b.e(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iC2;
        }
        return -1;
    }

    public int h() {
        return ((x) this.a).c() - this.c.size();
    }

    public View i(int i) {
        return ((x) this.a).a.getChildAt(i);
    }

    public int j() {
        return ((x) this.a).c();
    }

    public int k(View view) {
        int iIndexOfChild = ((x) this.a).a.indexOfChild(view);
        if (iIndexOfChild == -1 || this.b.e(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.b.c(iIndexOfChild);
    }

    public boolean l(View view) {
        return this.c.contains(view);
    }

    public final boolean m(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        x xVar = (x) this.a;
        Objects.requireNonNull(xVar);
        RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(view);
        if (o0o0o00J == null) {
            return true;
        }
        xVar.a.ah(o0o0o00J, o0o0o00J.q);
        o0o0o00J.q = 0;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(", hidden list:");
        sb.append(this.c.size());
        return sb.toString();
    }
}
