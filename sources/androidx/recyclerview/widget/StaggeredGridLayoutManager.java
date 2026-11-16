package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.Oooo000 implements RecyclerView.o0OOO0o.OooO0O0 {
    public boolean D;
    public boolean E;
    public OooO G;
    public int[] J;
    public int p;
    public g q;
    public OooOO0[] r;
    public g s;
    public int u;
    public int v;
    public final p w;
    public boolean x;
    public BitSet z;
    public boolean t = false;
    public int y = -1;
    public int A = Integer.MIN_VALUE;
    public OooO0o C = new OooO0o();
    public int B = 2;
    public final Rect H = new Rect();
    public final OooO0O0 I = new OooO0O0();
    public boolean F = true;
    public final Runnable K = new OooO00o();

    @SuppressLint({"BanParcelableUsage"})
    public static class OooO implements Parcelable {
        public static final Parcelable.Creator<OooO> CREATOR = new OooO00o();
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int[] g;
        public int[] h;
        public List<OooO0o.OooO00o> i;
        public boolean j;
        public boolean k;

        public class OooO00o implements Parcelable.Creator<OooO> {
            @Override // android.os.Parcelable.Creator
            public OooO createFromParcel(Parcel parcel) {
                return new OooO(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public OooO[] newArray(int i) {
                return new OooO[i];
            }
        }

        public OooO() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.h);
            }
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.i);
        }

        public OooO(Parcel parcel) {
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            int i = parcel.readInt();
            this.e = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.g = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.h = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.b = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1;
            this.i = parcel.readArrayList(OooO0o.OooO00o.class.getClassLoader());
        }

        public OooO(OooO oooO) {
            this.e = oooO.e;
            this.c = oooO.c;
            this.d = oooO.d;
            this.g = oooO.g;
            this.f = oooO.f;
            this.h = oooO.h;
            this.b = oooO.b;
            this.j = oooO.j;
            this.k = oooO.k;
            this.i = oooO.i;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.aP();
        }
    }

    public class OooO0O0 {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public int[] e;
        public boolean f;

        public OooO0O0() {
            c();
        }

        public void b() {
            this.b = this.c ? StaggeredGridLayoutManager.this.q.i() : StaggeredGridLayoutManager.this.q.l();
        }

        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.f = false;
            int[] iArr = this.e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class OooO0OO extends RecyclerView.Oooo0 {
        public OooOO0 e;

        public OooO0OO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public OooO0OO(int i, int i2) {
            super(i, i2);
        }

        public OooO0OO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public OooO0OO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class OooOO0 {
        public ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int f;

        public OooOO0(int i) {
            this.f = i;
        }

        public View b(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.x && staggeredGridLayoutManager.T(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.x && staggeredGridLayoutManager2.T(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.x && staggeredGridLayoutManager3.T(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.x && staggeredGridLayoutManager4.T(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public void c(View view) {
            OooO0OO oooO0OOK = k(view);
            oooO0OOK.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (oooO0OOK.h() || oooO0OOK.g()) {
                this.d = StaggeredGridLayoutManager.this.q.e(view) + this.d;
            }
        }

        public void d() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            OooO0OO oooO0OOK = k(view);
            this.c = StaggeredGridLayoutManager.this.q.d(view);
            Objects.requireNonNull(oooO0OOK);
        }

        public void e() {
            View view = this.a.get(0);
            OooO0OO oooO0OOK = k(view);
            this.b = StaggeredGridLayoutManager.this.q.h(view);
            Objects.requireNonNull(oooO0OOK);
        }

        public void f() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public int g() {
            return StaggeredGridLayoutManager.this.x ? i(0, this.a.size(), true) : i(this.a.size() - 1, -1, true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.x ? i(this.a.size() - 1, -1, true) : i(0, this.a.size(), true);
        }

        public int i(int i, int i2, boolean z) {
            int iL = StaggeredGridLayoutManager.this.q.l();
            int i3 = StaggeredGridLayoutManager.this.q.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int iH = StaggeredGridLayoutManager.this.q.h(view);
                int iD = StaggeredGridLayoutManager.this.q.d(view);
                boolean z2 = false;
                boolean z3 = !z ? iH >= i3 : iH > i3;
                if (!z ? iD > iL : iD >= iL) {
                    z2 = true;
                }
                if (z3 && z2 && (iH < iL || iD > i3)) {
                    return StaggeredGridLayoutManager.this.T(view);
                }
                i += i4;
            }
            return -1;
        }

        public int j(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.c;
        }

        public OooO0OO k(View view) {
            return (OooO0OO) view.getLayoutParams();
        }

        public int l(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            e();
            return this.b;
        }

        public void m() {
            int size = this.a.size();
            View viewRemove = this.a.remove(size - 1);
            OooO0OO oooO0OOK = k(viewRemove);
            oooO0OOK.e = null;
            if (oooO0OOK.h() || oooO0OOK.g()) {
                this.d -= StaggeredGridLayoutManager.this.q.e(viewRemove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void n(View view) {
            OooO0OO oooO0OOK = k(view);
            oooO0OOK.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (oooO0OOK.h() || oooO0OOK.g()) {
                this.d = StaggeredGridLayoutManager.this.q.e(view) + this.d;
            }
        }

        public void o() {
            View viewRemove = this.a.remove(0);
            OooO0OO oooO0OOK = k(viewRemove);
            oooO0OOK.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (oooO0OOK.h() || oooO0OOK.g()) {
                this.d -= StaggeredGridLayoutManager.this.q.e(viewRemove);
            }
            this.b = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.x = false;
        RecyclerView.Oooo000.OooO0o oooO0oD = RecyclerView.Oooo000.d(context, attributeSet, i, i2);
        int i3 = oooO0oD.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        i(null);
        if (i3 != this.v) {
            this.v = i3;
            g gVar = this.q;
            this.q = this.s;
            this.s = gVar;
            aF();
        }
        int i4 = oooO0oD.b;
        i(null);
        if (i4 != this.p) {
            this.C.b();
            aF();
            this.p = i4;
            this.z = new BitSet(this.p);
            this.r = new OooOO0[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.r[i5] = new OooOO0(i5);
            }
            aF();
        }
        boolean z = oooO0oD.c;
        i(null);
        OooO oooO = this.G;
        if (oooO != null && oooO.b != z) {
            oooO.b = z;
        }
        this.x = z;
        aF();
        this.w = new p();
        this.q = g.b(this, this.v);
        this.s = g.b(this, 1 - this.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean V() {
        return this.B != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void X(int i) {
        super.X(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            OooOO0 oooOO0 = this.r[i2];
            int i3 = oooOO0.b;
            if (i3 != Integer.MIN_VALUE) {
                oooOO0.b = i3 + i;
            }
            int i4 = oooOO0.c;
            if (i4 != Integer.MIN_VALUE) {
                oooOO0.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void Y(int i) {
        super.Y(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            OooOO0 oooOO0 = this.r[i2];
            int i3 = oooOO0.b;
            if (i3 != Integer.MIN_VALUE) {
                oooOO0.b = i3 + i;
            }
            int i4 = oooOO0.c;
            if (i4 != Integer.MIN_VALUE) {
                oooOO0.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void Z(RecyclerView.OooO oooO, RecyclerView.OooO oooO2) {
        this.C.b();
        for (int i = 0; i < this.p; i++) {
            this.r[i].f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aB(int i) {
        OooO oooO = this.G;
        if (oooO != null && oooO.c != i) {
            oooO.g = null;
            oooO.e = 0;
            oooO.c = -1;
            oooO.d = -1;
        }
        this.y = i;
        this.A = Integer.MIN_VALUE;
        aF();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int aC(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        return bk(i, o00ooo, o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aD(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        ba(o00ooo, o0oo0oo, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int aG(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        return bk(i, o00ooo, o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aJ(RecyclerView.o0Oo0oo o0oo0oo) {
        this.y = -1;
        this.A = Integer.MIN_VALUE;
        this.G = null;
        this.I.c();
    }

    public final void aK(OooOO0 oooOO0, int i, int i2) {
        int i3 = oooOO0.d;
        if (i == -1) {
            int i4 = oooOO0.b;
            if (i4 == Integer.MIN_VALUE) {
                oooOO0.e();
                i4 = oooOO0.b;
            }
            if (i4 + i3 <= i2) {
                this.z.set(oooOO0.f, false);
                return;
            }
            return;
        }
        int i5 = oooOO0.c;
        if (i5 == Integer.MIN_VALUE) {
            oooOO0.d();
            i5 = oooOO0.c;
        }
        if (i5 - i3 >= i2) {
            this.z.set(oooOO0.f, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.recyclerview.widget.RecyclerView$Oooo000, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    public final int aL(RecyclerView.o00Ooo o00ooo, p pVar, RecyclerView.o0Oo0oo o0oo0oo) {
        int i;
        int iAS;
        OooOO0 oooOO0;
        ?? r2;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        boolean z;
        int i2;
        ?? r3;
        int i3;
        ?? r4;
        ?? r5;
        boolean z2 = false;
        this.z.set(0, this.p, true);
        if (this.w.a) {
            i = pVar.g == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = pVar.g == 1 ? pVar.h + pVar.c : pVar.f - pVar.c;
        }
        bn(pVar.g, i);
        int i4 = this.t ? this.q.i() : this.q.l();
        boolean z3 = false;
        while (true) {
            int i5 = pVar.d;
            if (i5 < 0 || i5 >= o0oo0oo.c() || (!this.w.a && this.z.isEmpty())) {
                break;
            }
            View view = o00ooo.k(pVar.d, z2, Long.MAX_VALUE).c;
            pVar.d += pVar.e;
            OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
            int iF = oooO0OO.f();
            int[] iArr = this.C.a;
            int i6 = (iArr == null || iF >= iArr.length) ? -1 : iArr[iF];
            if (i6 == -1) {
                if (bc(pVar.g)) {
                    i2 = -1;
                    i3 = -1;
                    r3 = this.p - 1;
                } else {
                    i2 = this.p;
                    r3 = z2;
                    i3 = 1;
                }
                OooOO0 oooOO1 = null;
                if (pVar.g == 1) {
                    int iL = this.q.l();
                    int i7 = Integer.MAX_VALUE;
                    while (r5 != i2) {
                        OooOO0 oooOO2 = this.r[r5];
                        int iJ = oooOO2.j(iL);
                        if (iJ < i7) {
                            r5 = r3;
                            oooOO1 = oooOO2;
                            i7 = iJ;
                        } else {
                            r5 = r3;
                        }
                        r5 += i3;
                    }
                    r5 = r3;
                } else {
                    int i8 = this.q.i();
                    int i9 = Integer.MIN_VALUE;
                    while (r4 != i2) {
                        OooOO0 oooOO3 = this.r[r4];
                        int iL2 = oooOO3.l(i8);
                        if (iL2 > i9) {
                            r4 = r3;
                            oooOO1 = oooOO3;
                            i9 = iL2;
                        } else {
                            r4 = r3;
                        }
                        r4 += i3;
                    }
                    r4 = r3;
                }
                oooOO0 = oooOO1;
                OooO0o oooO0o = this.C;
                oooO0o.c(iF);
                oooO0o.a[iF] = oooOO0.f;
            } else {
                oooOO0 = this.r[i6];
            }
            OooOO0 oooOO4 = oooOO0;
            oooO0OO.e = oooOO4;
            if (pVar.g == 1) {
                r2 = 0;
                h(view, -1, false);
            } else {
                r2 = 0;
                h(view, 0, false);
            }
            if (this.v == 1) {
                bb(view, RecyclerView.Oooo000.c(this.u, this.l, r2, ((ViewGroup.MarginLayoutParams) oooO0OO).width, r2), RecyclerView.Oooo000.c(this.f26o, this.n, O() + H(), ((ViewGroup.MarginLayoutParams) oooO0OO).height, true), r2);
            } else {
                bb(view, RecyclerView.Oooo000.c(this.m, this.l, R() + Q(), ((ViewGroup.MarginLayoutParams) oooO0OO).width, true), RecyclerView.Oooo000.c(this.u, this.n, 0, ((ViewGroup.MarginLayoutParams) oooO0OO).height, false), false);
            }
            if (pVar.g == 1) {
                int iJ2 = oooOO4.j(i4);
                iE2 = iJ2;
                iE = this.q.e(view) + iJ2;
            } else {
                int iL3 = oooOO4.l(i4);
                iE = iL3;
                iE2 = iL3 - this.q.e(view);
            }
            if (pVar.g == 1) {
                oooO0OO.e.c(view);
            } else {
                oooO0OO.e.n(view);
            }
            if (aZ() && this.v == 1) {
                int i10 = this.s.i() - (((this.p - 1) - oooOO4.f) * this.u);
                iE3 = i10;
                iE4 = i10 - this.s.e(view);
            } else {
                int iL4 = this.s.l() + (oooOO4.f * this.u);
                iE3 = this.s.e(view) + iL4;
                iE4 = iL4;
            }
            if (this.v == 1) {
                W(view, iE4, iE2, iE3, iE);
            } else {
                W(view, iE2, iE4, iE, iE3);
            }
            aK(oooOO4, this.w.g, i);
            bg(o00ooo, this.w);
            if (this.w.i && view.hasFocusable()) {
                z = false;
                this.z.set(oooOO4.f, false);
            } else {
                z = false;
            }
            z2 = z;
            z3 = true;
        }
        boolean z4 = z2;
        if (!z3) {
            bg(o00ooo, this.w);
        }
        if (this.w.g == -1) {
            iAS = this.q.l() - aX(this.q.l());
        } else {
            iAS = aS(this.q.i()) - this.q.i();
        }
        return iAS > 0 ? Math.min(pVar.c, iAS) : z4 ? 1 : 0;
    }

    public final int aO(int i) {
        if (w() == 0) {
            return this.t ? 1 : -1;
        }
        return (i < aV()) == this.t ? 1 : -1;
    }

    public boolean aP() {
        int iAV;
        if (w() == 0 || this.B == 0 || !this.h) {
            return false;
        }
        if (this.t) {
            iAV = bq();
            aV();
        } else {
            iAV = aV();
            bq();
        }
        if (iAV != 0 || aY() == null) {
            return false;
        }
        this.C.b();
        this.f = true;
        aF();
        return true;
    }

    public final int aQ(RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0) {
            return 0;
        }
        return i.b(o0oo0oo, this.q, bm(!this.F), aU(!this.F), this, this.F, this.t);
    }

    public final int aR(RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0) {
            return 0;
        }
        return i.c(o0oo0oo, this.q, bm(!this.F), aU(!this.F), this, this.F);
    }

    public final int aS(int i) {
        int iJ = this.r[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iJ2 = this.r[i2].j(i);
            if (iJ2 > iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    public final void aT(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z) {
        int iL;
        int iAX = aX(Integer.MAX_VALUE);
        if (iAX != Integer.MAX_VALUE && (iL = iAX - this.q.l()) > 0) {
            int iBk = iL - bk(iL, o00ooo, o0oo0oo);
            if (!z || iBk <= 0) {
                return;
            }
            this.q.q(-iBk);
        }
    }

    public View aU(boolean z) {
        int iL = this.q.l();
        int i = this.q.i();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewA = A(iW);
            int iH = this.q.h(viewA);
            int iD = this.q.d(viewA);
            if (iD > iL && iH < i) {
                if (iD <= i || !z) {
                    return viewA;
                }
                if (view == null) {
                    view = viewA;
                }
            }
        }
        return view;
    }

    public int aV() {
        if (w() != 0) {
            return T(A(0));
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public final void aW(int i, int i2, int i3) {
        int i4;
        int i5;
        int iBq;
        int iBq2 = this.t ? bq() : aV();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.C.e(i5);
            if (i3 != 1) {
                this.C.g(i, i2);
            } else if (i3 != 2) {
                this.C.f(i, i2);
            } else if (i3 == 8) {
                this.C.f(i, 1);
                this.C.g(i2, 1);
            }
            if (i4 <= iBq2) {
                return;
            }
            if (this.t) {
                iBq = aV();
            } else {
                iBq = bq();
            }
            if (i5 <= iBq) {
                aF();
            }
        }
        i4 = i + i2;
        i5 = i;
        this.C.e(i5);
        if (i3 != 1) {
            this.C.g(i, i2);
        } else if (i3 != 2) {
            this.C.f(i, i2);
        } else if (i3 == 8) {
            this.C.f(i, 1);
            this.C.g(i2, 1);
        }
        if (i4 <= iBq2) {
            return;
        }
        if (this.t) {
            iBq = aV();
        } else {
            iBq = bq();
        }
        if (i5 <= iBq) {
            aF();
        }
    }

    public final int aX(int i) {
        int iL = this.r[0].l(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iL2 = this.r[i2].l(i);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x002c A[SYNTHETIC] */
    public View aY() {
        boolean z;
        boolean z2;
        int iW = w();
        int i = iW - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        byte b = (this.v == 1 && aZ()) ? (byte) 1 : (byte) -1;
        if (this.t) {
            iW = -1;
        } else {
            i = 0;
        }
        int i2 = i < iW ? 1 : -1;
        while (i != iW) {
            View viewA = A(i);
            OooO0OO oooO0OO = (OooO0OO) viewA.getLayoutParams();
            if (bitSet.get(oooO0OO.e.f)) {
                OooOO0 oooOO0 = oooO0OO.e;
                if (this.t) {
                    int i3 = oooOO0.c;
                    if (i3 == Integer.MIN_VALUE) {
                        oooOO0.d();
                        i3 = oooOO0.c;
                    }
                    if (i3 < this.q.i()) {
                        ArrayList<View> arrayList = oooOO0.a;
                        Objects.requireNonNull(oooOO0.k(arrayList.get(arrayList.size() - 1)));
                        return viewA;
                    }
                    bitSet.clear(oooO0OO.e.f);
                } else {
                    int i4 = oooOO0.b;
                    if (i4 == Integer.MIN_VALUE) {
                        oooOO0.e();
                        i4 = oooOO0.b;
                    }
                    if (i4 > this.q.l()) {
                        Objects.requireNonNull(oooOO0.k(oooOO0.a.get(0)));
                        return viewA;
                    }
                    bitSet.clear(oooO0OO.e.f);
                }
            }
            i += i2;
            if (i != iW) {
                View viewA2 = A(i);
                if (this.t) {
                    int iD = this.q.d(viewA);
                    int iD2 = this.q.d(viewA2);
                    if (iD < iD2) {
                        return viewA;
                    }
                    if (iD == iD2) {
                        if (oooO0OO.e.f - ((OooO0OO) viewA2.getLayoutParams()).e.f < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return viewA;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iH = this.q.h(viewA);
                    int iH2 = this.q.h(viewA2);
                    if (iH > iH2) {
                        return viewA;
                    }
                    if (iH == iH2) {
                        if (oooO0OO.e.f - ((OooO0OO) viewA2.getLayoutParams()).e.f < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return viewA;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public boolean aZ() {
        return M() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aa(RecyclerView recyclerView, RecyclerView.o00Ooo o00ooo) {
        Runnable runnable = this.K;
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.p; i++) {
            this.r[i].f();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0055  */
    /* JADX WARN: Code duplicated, block: B:42:0x0057  */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public View ab(View view, int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        View viewT;
        int i2;
        if (w() == 0 || (viewT = t(view)) == null) {
            return null;
        }
        bj();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.v == 0 : !(i != 130 || this.v != 1)) {
                            i2 = 1;
                        }
                    } else if (this.v == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.v != 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = -1;
                }
            } else if (this.v == 1 || !aZ()) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else if (this.v == 1 || !aZ()) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        OooO0OO oooO0OO = (OooO0OO) viewT.getLayoutParams();
        Objects.requireNonNull(oooO0OO);
        OooOO0 oooOO0 = oooO0OO.e;
        int iBq = i2 == 1 ? bq() : aV();
        bo(iBq, o0oo0oo);
        bl(i2);
        p pVar = this.w;
        pVar.d = pVar.e + iBq;
        pVar.c = (int) (this.q.m() * 0.33333334f);
        p pVar2 = this.w;
        pVar2.i = true;
        pVar2.b = false;
        aL(o00ooo, pVar2, o0oo0oo);
        this.D = this.t;
        View viewB = oooOO0.b(iBq, i2);
        if (viewB != null && viewB != viewT) {
            return viewB;
        }
        if (bc(i2)) {
            for (int i3 = this.p - 1; i3 >= 0; i3--) {
                View viewB2 = this.r[i3].b(iBq, i2);
                if (viewB2 != null && viewB2 != viewT) {
                    return viewB2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.p; i4++) {
                View viewB3 = this.r[i4].b(iBq, i2);
                if (viewB3 != null && viewB3 != viewT) {
                    return viewB3;
                }
            }
        }
        boolean z = (this.x ^ true) == (i2 == -1);
        View viewV = v(z ? oooOO0.h() : oooOO0.g());
        if (viewV != null && viewV != viewT) {
            return viewV;
        }
        if (bc(i2)) {
            for (int i5 = this.p - 1; i5 >= 0; i5--) {
                if (i5 != oooOO0.f) {
                    View viewV2 = v(z ? this.r[i5].h() : this.r[i5].g());
                    if (viewV2 != null && viewV2 != viewT) {
                        return viewV2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.p; i6++) {
                View viewV3 = v(z ? this.r[i6].h() : this.r[i6].g());
                if (viewV3 != null && viewV3 != viewT) {
                    return viewV3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ac(AccessibilityEvent accessibilityEvent) {
        super.ac(accessibilityEvent);
        if (w() > 0) {
            View viewBm = bm(false);
            View viewAU = aU(false);
            if (viewBm == null || viewAU == null) {
                return;
            }
            int iT = T(viewBm);
            int iT2 = T(viewAU);
            if (iT < iT2) {
                accessibilityEvent.setFromIndex(iT);
                accessibilityEvent.setToIndex(iT2);
            } else {
                accessibilityEvent.setFromIndex(iT2);
                accessibilityEvent.setToIndex(iT);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void af(RecyclerView recyclerView, int i, int i2) {
        aW(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ag(RecyclerView recyclerView, int i, int i2, int i3) {
        aW(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ah(RecyclerView recyclerView) {
        this.C.b();
        aF();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ai(RecyclerView recyclerView, int i, int i2) {
        aW(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void aj(RecyclerView recyclerView, int i, int i2, Object obj) {
        aW(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void ap(RecyclerView recyclerView, RecyclerView.o0Oo0oo o0oo0oo, int i) {
        r rVar = new r(recyclerView.getContext());
        rVar.a = i;
        ao(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean aq() {
        return this.G == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void as(Parcelable parcelable) {
        if (parcelable instanceof OooO) {
            OooO oooO = (OooO) parcelable;
            this.G = oooO;
            if (this.y != -1) {
                oooO.g = null;
                oooO.e = 0;
                oooO.c = -1;
                oooO.d = -1;
                oooO.g = null;
                oooO.e = 0;
                oooO.f = 0;
                oooO.h = null;
                oooO.i = null;
            }
            aF();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public Parcelable at() {
        int iL;
        int iL2;
        int[] iArr;
        OooO oooO = this.G;
        if (oooO != null) {
            return new OooO(oooO);
        }
        OooO oooO2 = new OooO();
        oooO2.b = this.x;
        oooO2.j = this.D;
        oooO2.k = this.E;
        OooO0o oooO0o = this.C;
        if (oooO0o == null || (iArr = oooO0o.a) == null) {
            oooO2.f = 0;
        } else {
            oooO2.h = iArr;
            oooO2.f = iArr.length;
            oooO2.i = oooO0o.b;
        }
        if (w() > 0) {
            oooO2.c = this.D ? bq() : aV();
            View viewAU = this.t ? aU(true) : bm(true);
            oooO2.d = viewAU != null ? T(viewAU) : -1;
            int i = this.p;
            oooO2.e = i;
            oooO2.g = new int[i];
            for (int i2 = 0; i2 < this.p; i2++) {
                if (this.D) {
                    iL = this.r[i2].j(Integer.MIN_VALUE);
                    if (iL != Integer.MIN_VALUE) {
                        iL2 = this.q.i();
                        iL -= iL2;
                    }
                } else {
                    iL = this.r[i2].l(Integer.MIN_VALUE);
                    if (iL != Integer.MIN_VALUE) {
                        iL2 = this.q.l();
                        iL -= iL2;
                    }
                }
                oooO2.g[i2] = iL;
            }
        } else {
            oooO2.c = -1;
            oooO2.d = -1;
            oooO2.e = 0;
        }
        return oooO2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void au(int i) {
        if (i == 0) {
            aP();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void az(Rect rect, int i, int i2) {
        int iB;
        int iB2;
        int iR = R() + Q();
        int iO = O() + H();
        if (this.v == 1) {
            iB2 = RecyclerView.Oooo000.b(i2, rect.height() + iO, N());
            iB = RecyclerView.Oooo000.b(i, (this.u * this.p) + iR, P());
        } else {
            iB = RecyclerView.Oooo000.b(i, rect.width() + iR, P());
            iB2 = RecyclerView.Oooo000.b(i2, (this.u * this.p) + iO, N());
        }
        this.c.setMeasuredDimension(iB, iB2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OOO0o.OooO0O0
    public PointF b(int i) {
        int iAO = aO(i);
        PointF pointF = new PointF();
        if (iAO == 0) {
            return null;
        }
        if (this.v == 0) {
            pointF.x = iAO;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iAO;
        }
        return pointF;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:244:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x01ea A[SYNTHETIC] */
    public final void ba(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z) {
        boolean z2;
        OooO oooO;
        int iW;
        int i;
        int iT;
        int iT2;
        int iW2;
        int i2;
        while (true) {
            OooO0O0 oooO0O0 = this.I;
            if (!(this.G == null && this.y == -1) && o0oo0oo.c() == 0) {
                av(o00ooo);
                oooO0O0.c();
                return;
            }
            boolean z3 = (oooO0O0.f && this.y == -1 && this.G == null) ? false : true;
            if (z3) {
                oooO0O0.c();
                OooO oooO2 = this.G;
                if (oooO2 != null) {
                    int i3 = oooO2.e;
                    if (i3 > 0) {
                        if (i3 == this.p) {
                            for (int i4 = 0; i4 < this.p; i4++) {
                                this.r[i4].f();
                                OooO oooO3 = this.G;
                                int i5 = oooO3.g[i4];
                                if (i5 != Integer.MIN_VALUE) {
                                    i5 += oooO3.j ? this.q.i() : this.q.l();
                                }
                                OooOO0 oooOO0 = this.r[i4];
                                oooOO0.b = i5;
                                oooOO0.c = i5;
                            }
                        } else {
                            oooO2.g = null;
                            oooO2.e = 0;
                            oooO2.f = 0;
                            oooO2.h = null;
                            oooO2.i = null;
                            oooO2.c = oooO2.d;
                        }
                    }
                    OooO oooO4 = this.G;
                    this.E = oooO4.k;
                    boolean z4 = oooO4.b;
                    i(null);
                    OooO oooO5 = this.G;
                    if (oooO5 != null && oooO5.b != z4) {
                        oooO5.b = z4;
                    }
                    this.x = z4;
                    aF();
                    bj();
                    OooO oooO6 = this.G;
                    int i6 = oooO6.c;
                    if (i6 != -1) {
                        this.y = i6;
                        oooO0O0.c = oooO6.j;
                    } else {
                        oooO0O0.c = this.t;
                    }
                    if (oooO6.f > 1) {
                        OooO0o oooO0o = this.C;
                        oooO0o.a = oooO6.h;
                        oooO0o.b = oooO6.i;
                    }
                } else {
                    bj();
                    oooO0O0.c = this.t;
                }
                if (o0oo0oo.h || (i2 = this.y) == -1) {
                    if (this.D) {
                        int iC = o0oo0oo.c();
                        iW2 = w();
                        while (true) {
                            iW2--;
                            if (iW2 >= 0) {
                                iT2 = 0;
                                break;
                            }
                            iT2 = T(A(iW2));
                            if (iT2 < 0 && iT2 < iC) {
                                break;
                            }
                        }
                    } else {
                        int iC2 = o0oo0oo.c();
                        iW = w();
                        i = 0;
                        while (true) {
                            if (i >= iW) {
                                iT2 = 0;
                                break;
                            }
                            iT = T(A(i));
                            if (iT < 0 && iT < iC2) {
                                iT2 = iT;
                                break;
                            }
                            i++;
                        }
                    }
                    oooO0O0.a = iT2;
                    oooO0O0.b = Integer.MIN_VALUE;
                } else if (i2 < 0 || i2 >= o0oo0oo.c()) {
                    this.y = -1;
                    this.A = Integer.MIN_VALUE;
                    if (this.D) {
                        int iC3 = o0oo0oo.c();
                        iW2 = w();
                        while (true) {
                            iW2--;
                            if (iW2 >= 0) {
                                iT2 = 0;
                                break;
                            } else {
                                iT2 = T(A(iW2));
                                if (iT2 < 0) {
                                }
                            }
                        }
                    } else {
                        int iC4 = o0oo0oo.c();
                        iW = w();
                        i = 0;
                        while (true) {
                            if (i >= iW) {
                                iT2 = 0;
                                break;
                            } else {
                                iT = T(A(i));
                                if (iT < 0) {
                                }
                                i++;
                            }
                        }
                    }
                    oooO0O0.a = iT2;
                    oooO0O0.b = Integer.MIN_VALUE;
                } else {
                    OooO oooO7 = this.G;
                    if (oooO7 == null || oooO7.c == -1 || oooO7.e <= 0) {
                        View viewV = v(this.y);
                        if (viewV != null) {
                            oooO0O0.a = this.t ? bq() : aV();
                            if (this.A != Integer.MIN_VALUE) {
                                if (oooO0O0.c) {
                                    oooO0O0.b = (this.q.i() - this.A) - this.q.d(viewV);
                                } else {
                                    oooO0O0.b = (this.q.l() + this.A) - this.q.h(viewV);
                                }
                            } else if (this.q.e(viewV) > this.q.m()) {
                                oooO0O0.b = oooO0O0.c ? this.q.i() : this.q.l();
                            } else {
                                int iH = this.q.h(viewV) - this.q.l();
                                if (iH < 0) {
                                    oooO0O0.b = -iH;
                                } else {
                                    int i7 = this.q.i() - this.q.d(viewV);
                                    if (i7 < 0) {
                                        oooO0O0.b = i7;
                                    } else {
                                        oooO0O0.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i8 = this.y;
                            oooO0O0.a = i8;
                            int i9 = this.A;
                            if (i9 == Integer.MIN_VALUE) {
                                oooO0O0.c = aO(i8) == 1;
                                oooO0O0.b();
                            } else if (oooO0O0.c) {
                                oooO0O0.b = StaggeredGridLayoutManager.this.q.i() - i9;
                            } else {
                                oooO0O0.b = StaggeredGridLayoutManager.this.q.l() + i9;
                            }
                            oooO0O0.d = true;
                        }
                    } else {
                        oooO0O0.b = Integer.MIN_VALUE;
                        oooO0O0.a = this.y;
                    }
                }
                oooO0O0.f = true;
            }
            if (this.G == null && this.y == -1 && (oooO0O0.c != this.D || aZ() != this.E)) {
                this.C.b();
                oooO0O0.d = true;
            }
            if (w() > 0 && ((oooO = this.G) == null || oooO.e <= 0)) {
                if (oooO0O0.d) {
                    for (int i10 = 0; i10 < this.p; i10++) {
                        this.r[i10].f();
                        int i11 = oooO0O0.b;
                        if (i11 != Integer.MIN_VALUE) {
                            OooOO0 oooOO1 = this.r[i10];
                            oooOO1.b = i11;
                            oooOO1.c = i11;
                        }
                    }
                } else if (z3 || this.I.e == null) {
                    for (int i12 = 0; i12 < this.p; i12++) {
                        OooOO0 oooOO2 = this.r[i12];
                        boolean z5 = this.t;
                        int i13 = oooO0O0.b;
                        int iJ = z5 ? oooOO2.j(Integer.MIN_VALUE) : oooOO2.l(Integer.MIN_VALUE);
                        oooOO2.f();
                        if (iJ != Integer.MIN_VALUE && ((!z5 || iJ >= StaggeredGridLayoutManager.this.q.i()) && (z5 || iJ <= StaggeredGridLayoutManager.this.q.l()))) {
                            if (i13 != Integer.MIN_VALUE) {
                                iJ += i13;
                            }
                            oooOO2.c = iJ;
                            oooOO2.b = iJ;
                        }
                    }
                    OooO0O0 oooO0O1 = this.I;
                    OooOO0[] oooOO0Arr = this.r;
                    Objects.requireNonNull(oooO0O1);
                    int length = oooOO0Arr.length;
                    int[] iArr = oooO0O1.e;
                    if (iArr == null || iArr.length < length) {
                        oooO0O1.e = new int[StaggeredGridLayoutManager.this.r.length];
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        oooO0O1.e[i14] = oooOO0Arr[i14].l(Integer.MIN_VALUE);
                    }
                } else {
                    for (int i15 = 0; i15 < this.p; i15++) {
                        OooOO0 oooOO3 = this.r[i15];
                        oooOO3.f();
                        int i16 = this.I.e[i15];
                        oooOO3.b = i16;
                        oooOO3.c = i16;
                    }
                }
            }
            u(o00ooo);
            this.w.b = false;
            int iM = this.s.m();
            this.u = iM / this.p;
            View.MeasureSpec.makeMeasureSpec(iM, this.s.c());
            bo(oooO0O0.a, o0oo0oo);
            if (oooO0O0.c) {
                bl(-1);
                aL(o00ooo, this.w, o0oo0oo);
                bl(1);
                p pVar = this.w;
                pVar.d = oooO0O0.a + pVar.e;
                aL(o00ooo, pVar, o0oo0oo);
            } else {
                bl(1);
                aL(o00ooo, this.w, o0oo0oo);
                bl(-1);
                p pVar2 = this.w;
                pVar2.d = oooO0O0.a + pVar2.e;
                aL(o00ooo, pVar2, o0oo0oo);
            }
            if (this.s.c() != 1073741824) {
                int iW3 = w();
                float fMax = 0.0f;
                for (int i17 = 0; i17 < iW3; i17++) {
                    View viewA = A(i17);
                    float fE = this.s.e(viewA);
                    if (fE >= fMax) {
                        Objects.requireNonNull((OooO0OO) viewA.getLayoutParams());
                        fMax = Math.max(fMax, fE);
                    }
                }
                int i18 = this.u;
                int iRound = Math.round(fMax * this.p);
                if (this.s.c() == Integer.MIN_VALUE) {
                    iRound = Math.min(iRound, this.s.m());
                }
                this.u = iRound / this.p;
                View.MeasureSpec.makeMeasureSpec(iRound, this.s.c());
                if (this.u != i18) {
                    for (int i19 = 0; i19 < iW3; i19++) {
                        View viewA2 = A(i19);
                        OooO0OO oooO0OO = (OooO0OO) viewA2.getLayoutParams();
                        Objects.requireNonNull(oooO0OO);
                        if (aZ() && this.v == 1) {
                            int i20 = -((this.p - 1) - oooO0OO.e.f);
                            viewA2.offsetLeftAndRight((this.u * i20) - (i20 * i18));
                        } else {
                            int i21 = oooO0OO.e.f;
                            int i22 = this.u * i21;
                            int i23 = i21 * i18;
                            if (this.v == 1) {
                                viewA2.offsetLeftAndRight(i22 - i23);
                            } else {
                                viewA2.offsetTopAndBottom(i22 - i23);
                            }
                        }
                    }
                }
            }
            if (w() > 0) {
                if (this.t) {
                    bi(o00ooo, o0oo0oo, true);
                    aT(o00ooo, o0oo0oo, false);
                } else {
                    aT(o00ooo, o0oo0oo, true);
                    bi(o00ooo, o0oo0oo, false);
                }
            }
            if (z && !o0oo0oo.h && this.B != 0 && w() > 0 && aY() != null) {
                Runnable runnable = this.K;
                RecyclerView recyclerView = this.c;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
                z2 = aP();
            }
            if (o0oo0oo.h) {
                this.I.c();
            }
            this.D = oooO0O0.c;
            this.E = aZ();
            if (!z2) {
                return;
            }
            this.I.c();
            z = false;
        }
    }

    public final void bb(View view, int i, int i2, boolean z) {
        Rect rect = this.H;
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Q(view));
        }
        OooO0OO oooO0OO = (OooO0OO) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) oooO0OO).leftMargin;
        Rect rect2 = this.H;
        int iBp = bp(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) oooO0OO).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) oooO0OO).topMargin;
        Rect rect3 = this.H;
        int iBp2 = bp(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) oooO0OO).bottomMargin + rect3.bottom);
        if (z ? ak(view, iBp, iBp2, oooO0OO) : am(view, iBp, iBp2, oooO0OO)) {
            view.measure(iBp, iBp2);
        }
    }

    public final boolean bc(int i) {
        if (this.v == 0) {
            return (i == -1) != this.t;
        }
        return ((i == -1) == this.t) == aZ();
    }

    public final int bd(RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0) {
            return 0;
        }
        return i.a(o0oo0oo, this.q, bm(!this.F), aU(!this.F), this, this.F);
    }

    public final void be(RecyclerView.o00Ooo o00ooo, int i) {
        while (w() > 0) {
            View viewA = A(0);
            if (this.q.d(viewA) > i || this.q.n(viewA) > i) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) viewA.getLayoutParams();
            Objects.requireNonNull(oooO0OO);
            if (oooO0OO.e.a.size() == 1) {
                return;
            }
            oooO0OO.e.o();
            aH(viewA, o00ooo);
        }
    }

    public void bf(int i, RecyclerView.o0Oo0oo o0oo0oo) {
        int iAV;
        int i2;
        if (i > 0) {
            iAV = bq();
            i2 = 1;
        } else {
            iAV = aV();
            i2 = -1;
        }
        this.w.b = true;
        bo(iAV, o0oo0oo);
        bl(i2);
        p pVar = this.w;
        pVar.d = iAV + pVar.e;
        pVar.c = Math.abs(i);
    }

    public final void bg(RecyclerView.o00Ooo o00ooo, p pVar) {
        int iMin;
        if (!pVar.b || pVar.a) {
            return;
        }
        if (pVar.c == 0) {
            if (pVar.g == -1) {
                bh(o00ooo, pVar.h);
                return;
            } else {
                be(o00ooo, pVar.f);
                return;
            }
        }
        int i = 1;
        if (pVar.g == -1) {
            int i2 = pVar.f;
            int iL = this.r[0].l(i2);
            while (i < this.p) {
                int iL2 = this.r[i].l(i2);
                if (iL2 > iL) {
                    iL = iL2;
                }
                i++;
            }
            int i3 = i2 - iL;
            bh(o00ooo, i3 < 0 ? pVar.h : pVar.h - Math.min(i3, pVar.c));
            return;
        }
        int i4 = pVar.h;
        int iJ = this.r[0].j(i4);
        while (i < this.p) {
            int iJ2 = this.r[i].j(i4);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
            i++;
        }
        int i5 = iJ - pVar.h;
        if (i5 < 0) {
            iMin = pVar.f;
        } else {
            iMin = Math.min(i5, pVar.c) + pVar.f;
        }
        be(o00ooo, iMin);
    }

    public final void bh(RecyclerView.o00Ooo o00ooo, int i) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewA = A(iW);
            if (this.q.h(viewA) < i || this.q.p(viewA) < i) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) viewA.getLayoutParams();
            Objects.requireNonNull(oooO0OO);
            if (oooO0OO.e.a.size() == 1) {
                return;
            }
            oooO0OO.e.m();
            aH(viewA, o00ooo);
        }
    }

    public final void bi(RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo, boolean z) {
        int i;
        int iAS = aS(Integer.MIN_VALUE);
        if (iAS != Integer.MIN_VALUE && (i = this.q.i() - iAS) > 0) {
            int i2 = i - (-bk(-i, o00ooo, o0oo0oo));
            if (!z || i2 <= 0) {
                return;
            }
            this.q.q(i2);
        }
    }

    public final void bj() {
        if (this.v == 1 || !aZ()) {
            this.t = this.x;
        } else {
            this.t = !this.x;
        }
    }

    public int bk(int i, RecyclerView.o00Ooo o00ooo, RecyclerView.o0Oo0oo o0oo0oo) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        bf(i, o0oo0oo);
        int iAL = aL(o00ooo, this.w, o0oo0oo);
        if (this.w.c >= iAL) {
            i = i < 0 ? -iAL : iAL;
        }
        this.q.q(-i);
        this.D = this.t;
        p pVar = this.w;
        pVar.c = 0;
        bg(o00ooo, pVar);
        return i;
    }

    public final void bl(int i) {
        p pVar = this.w;
        pVar.g = i;
        pVar.e = this.t != (i == -1) ? -1 : 1;
    }

    public View bm(boolean z) {
        int iL = this.q.l();
        int i = this.q.i();
        int iW = w();
        View view = null;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewA = A(i2);
            int iH = this.q.h(viewA);
            if (this.q.d(viewA) > iL && iH < i) {
                if (iH >= iL || !z) {
                    return viewA;
                }
                if (view == null) {
                    view = viewA;
                }
            }
        }
        return view;
    }

    public final void bn(int i, int i2) {
        for (int i3 = 0; i3 < this.p; i3++) {
            if (!this.r[i3].a.isEmpty()) {
                aK(this.r[i3], i, i2);
            }
        }
    }

    public final void bo(int i, RecyclerView.o0Oo0oo o0oo0oo) {
        int iM;
        int iM2;
        int i2;
        p pVar = this.w;
        boolean z = false;
        pVar.c = 0;
        pVar.d = i;
        RecyclerView.o0OOO0o o0ooo0o = this.g;
        if (o0ooo0o == null || !o0ooo0o.f || (i2 = o0oo0oo.b) == -1) {
            iM = 0;
            iM2 = 0;
        } else {
            if (this.t == (i2 < i)) {
                iM = this.q.m();
                iM2 = 0;
            } else {
                iM2 = this.q.m();
                iM = 0;
            }
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView == null || !recyclerView.k) {
            this.w.h = this.q.g() + iM;
            this.w.f = -iM2;
        } else {
            this.w.f = this.q.l() - iM2;
            this.w.h = this.q.i() + iM;
        }
        p pVar2 = this.w;
        pVar2.i = false;
        pVar2.b = true;
        if (this.q.c() == 0 && this.q.g() == 0) {
            z = true;
        }
        pVar2.a = z;
    }

    public final int bp(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public int bq() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return T(A(iW - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void f(int i, int i2, RecyclerView.o0Oo0oo o0oo0oo, RecyclerView.Oooo000.OooO0OO oooO0OO) {
        int iJ;
        int iL;
        if (this.v != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        bf(i, o0oo0oo);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.p; i4++) {
            p pVar = this.w;
            if (pVar.e == -1) {
                iJ = pVar.f;
                iL = this.r[i4].l(iJ);
            } else {
                iJ = this.r[i4].j(pVar.h);
                iL = this.w.h;
            }
            int i5 = iJ - iL;
            if (i5 >= 0) {
                this.J[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.J, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.w.d;
            if (i7 < 0 || i7 >= o0oo0oo.c()) {
                return;
            }
            ((q.aNf) oooO0OO).b(this.w.d, this.J[i6]);
            p pVar2 = this.w;
            pVar2.d += pVar2.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public void i(String str) {
        RecyclerView recyclerView;
        if (this.G != null || (recyclerView = this.c) == null) {
            return;
        }
        recyclerView.l(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean j() {
        return this.v == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean k() {
        return this.v == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public boolean l(RecyclerView.Oooo0 oooo0) {
        return oooo0 instanceof OooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int n(RecyclerView.o0Oo0oo o0oo0oo) {
        return bd(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int o(RecyclerView.o0Oo0oo o0oo0oo) {
        return aQ(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int p(RecyclerView.o0Oo0oo o0oo0oo) {
        return bd(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int q(RecyclerView.o0Oo0oo o0oo0oo) {
        return aR(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int r(RecyclerView.o0Oo0oo o0oo0oo) {
        return aQ(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public int s(RecyclerView.o0Oo0oo o0oo0oo) {
        return aR(o0oo0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 x(Context context, AttributeSet attributeSet) {
        return new OooO0OO(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 y() {
        return this.v == 0 ? new OooO0OO(-2, -1) : new OooO0OO(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public RecyclerView.Oooo0 z(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new OooO0OO((ViewGroup.MarginLayoutParams) layoutParams) : new OooO0OO(layoutParams);
    }

    public static class OooO0o {
        public int[] a;
        public List<OooO00o> b;

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public OooO00o d(int i) {
            List<OooO00o> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                OooO00o oooO00o = this.b.get(size);
                if (oooO00o.b == i) {
                    return oooO00o;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        public int e(int i) {
            int i2;
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.b != null) {
                OooO00o oooO00oD = d(i);
                if (oooO00oD != null) {
                    this.b.remove(oooO00oD);
                }
                int size = this.b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    }
                    if (this.b.get(i3).b >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    OooO00o oooO00o = this.b.get(i3);
                    this.b.remove(i3);
                    i2 = oooO00o.b;
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int iMin = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, iMin, -1);
            return iMin;
        }

        public void f(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<OooO00o> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    OooO00o oooO00o = this.b.get(size);
                    int i4 = oooO00o.b;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.b.remove(size);
                        } else {
                            oooO00o.b = i4 - i2;
                        }
                    }
                }
            }
        }

        public void g(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            List<OooO00o> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    OooO00o oooO00o = this.b.get(size);
                    int i4 = oooO00o.b;
                    if (i4 >= i) {
                        oooO00o.b = i4 + i2;
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class OooO00o implements Parcelable {
            public static final Parcelable.Creator<OooO00o> CREATOR = new C0003OooO00o();
            public int b;
            public int c;
            public int[] d;
            public boolean e;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C0003OooO00o implements Parcelable.Creator<OooO00o> {
                @Override // android.os.Parcelable.Creator
                public OooO00o createFromParcel(Parcel parcel) {
                    return new OooO00o(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public OooO00o[] newArray(int i) {
                    return new OooO00o[i];
                }
            }

            public OooO00o(Parcel parcel) {
                this.b = parcel.readInt();
                this.c = parcel.readInt();
                this.e = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("FullSpanItem{mPosition=");
                sbW.append(this.b);
                sbW.append(", mGapDir=");
                sbW.append(this.c);
                sbW.append(", mHasUnwantedGapAfter=");
                sbW.append(this.e);
                sbW.append(", mGapPerSpan=");
                sbW.append(Arrays.toString(this.d));
                sbW.append('}');
                return sbW.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c);
                parcel.writeInt(this.e ? 1 : 0);
                int[] iArr = this.d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.d);
                }
            }

            public OooO00o() {
            }
        }
    }
}
