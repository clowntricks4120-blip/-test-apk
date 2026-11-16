package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {
    public static final ThreadLocal<q> a = new ThreadLocal<>();
    public static Comparator<aNg> b = new aNe();
    public long d;
    public long e;
    public ArrayList<RecyclerView> c = new ArrayList<>();
    public ArrayList<aNg> f = new ArrayList<>();

    public class aNe implements Comparator<aNg> {
        @Override // java.util.Comparator
        public int compare(aNg ang, aNg ang2) {
            aNg ang3 = ang;
            aNg ang4 = ang2;
            RecyclerView recyclerView = ang3.d;
            if ((recyclerView == null) == (ang4.d == null)) {
                boolean z = ang3.a;
                if (z == ang4.a) {
                    int i = ang4.b - ang3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = ang3.c - ang4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (!z) {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            }
            return -1;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class aNf implements RecyclerView.Oooo000.OooO0OO {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public void b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.Oooo000 oooo000 = recyclerView.f25o;
            if (recyclerView.p == null || oooo000 == null || !oooo000.a) {
                return;
            }
            if (z) {
                if (!recyclerView.i.i()) {
                    oooo000.m(recyclerView.p.b(), this);
                }
            } else if (!recyclerView.P()) {
                oooo000.f(this.a, this.b, recyclerView.ai, this);
            }
            int i = this.d;
            if (i > oooo000.j) {
                oooo000.j = i;
                oooo000.k = z;
                recyclerView.f.m();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d;
                for (int i3 = 0; i3 < i2 * 2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class aNg {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.d == 0) {
            this.d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        aNf anf = recyclerView.ah;
        anf.a = i;
        anf.b = i2;
    }

    public final void d(long j) {
        aNg ang;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        aNg ang2;
        int size = this.c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.c.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.ah.c(recyclerView3, false);
                i += recyclerView3.ah.d;
            }
        }
        this.f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.c.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                aNf anf = recyclerView4.ah;
                int iAbs = Math.abs(anf.b) + Math.abs(anf.a);
                for (int i5 = 0; i5 < anf.d * 2; i5 += 2) {
                    if (i3 >= this.f.size()) {
                        ang2 = new aNg();
                        this.f.add(ang2);
                    } else {
                        ang2 = this.f.get(i3);
                    }
                    int[] iArr = anf.c;
                    int i6 = iArr[i5 + 1];
                    ang2.a = i6 <= iAbs;
                    ang2.b = iAbs;
                    ang2.c = i6;
                    ang2.d = recyclerView4;
                    ang2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f, b);
        for (int i7 = 0; i7 < this.f.size() && (recyclerView = (ang = this.f.get(i7)).d) != null; i7++) {
            RecyclerView.o0O0O00 o0o0o00E = e(recyclerView, ang.e, ang.a ? Long.MAX_VALUE : j);
            if (o0o0o00E != null && o0o0o00E.d != null && o0o0o00E.l() && !o0o0o00E.m() && (recyclerView2 = o0o0o00E.d.get()) != null) {
                if (recyclerView2.F && recyclerView2.h.j() != 0) {
                    recyclerView2.ab();
                }
                aNf anf2 = recyclerView2.ah;
                anf2.c(recyclerView2, true);
                if (anf2.d != 0) {
                    try {
                        int i8 = ivas.gov.bisp.enumeration.H.h.c;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.o0Oo0oo o0oo0oo = recyclerView2.ai;
                        RecyclerView.OooO oooO = recyclerView2.p;
                        o0oo0oo.e = 1;
                        o0oo0oo.g = oooO.b();
                        o0oo0oo.h = false;
                        o0oo0oo.i = false;
                        o0oo0oo.a = false;
                        for (int i9 = 0; i9 < anf2.d * 2; i9 += 2) {
                            e(recyclerView2, anf2.c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = ivas.gov.bisp.enumeration.H.h.c;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            ang.a = false;
            ang.b = 0;
            ang.c = 0;
            ang.d = null;
            ang.e = 0;
        }
    }

    public final RecyclerView.o0O0O00 e(RecyclerView recyclerView, int i, long j) {
        int iJ = recyclerView.h.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(recyclerView.h.i(i2));
            if (o0o0o00J.e == i && !o0o0o00J.m()) {
                return null;
            }
        }
        RecyclerView.o00Ooo o00ooo = recyclerView.f;
        try {
            recyclerView.W();
            RecyclerView.o0O0O00 o0o0o00K = o00ooo.k(i, false, j);
            if (o0o0o00K != null) {
                if (!o0o0o00K.l() || o0o0o00K.m()) {
                    o00ooo.c(o0o0o00K, false);
                } else {
                    o00ooo.i(o0o0o00K.c);
                }
            }
            return o0o0o00K;
        } finally {
            recyclerView.T(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = ivas.gov.bisp.enumeration.H.h.c;
            Trace.beginSection("RV Prefetch");
            if (this.c.isEmpty()) {
                this.d = 0L;
                return;
            }
            int size = this.c.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.c.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.d = 0L;
            } else {
                d(TimeUnit.MILLISECONDS.toNanos(jMax) + this.e);
                this.d = 0L;
            }
        } finally {
            this.d = 0L;
            int i3 = ivas.gov.bisp.enumeration.H.h.c;
            Trace.endSection();
        }
    }
}
