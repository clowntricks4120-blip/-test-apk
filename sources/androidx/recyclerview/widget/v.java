package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class v implements C0011a.aMH {
    public final /* synthetic */ RecyclerView a;

    public v(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void b(C0011a.aMI ami) {
        int i = ami.a;
        if (i == 1) {
            RecyclerView recyclerView = this.a;
            recyclerView.f25o.af(recyclerView, ami.b, ami.d);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView2 = this.a;
            recyclerView2.f25o.ai(recyclerView2, ami.b, ami.d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.a;
            recyclerView3.f25o.aj(recyclerView3, ami.b, ami.d, ami.c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.a;
            recyclerView4.f25o.ag(recyclerView4, ami.b, ami.d, 1);
        }
    }

    public RecyclerView.o0O0O00 c(int i) {
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.h.j();
        RecyclerView.o0O0O00 o0o0o00 = null;
        for (int i2 = 0; i2 < iJ; i2++) {
            RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(recyclerView.h.i(i2));
            if (o0o0o00J != null && !o0o0o00J.p() && o0o0o00J.e == i) {
                if (!recyclerView.h.l(o0o0o00J.c)) {
                    o0o0o00 = o0o0o00J;
                    break;
                }
                o0o0o00 = o0o0o00J;
            }
        }
        if (o0o0o00 == null || this.a.h.l(o0o0o00.c)) {
            return null;
        }
        return o0o0o00;
    }

    public void d(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.h.j();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = recyclerView.h.i(i6);
            RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(viewI);
            if (o0o0o00J != null && !o0o0o00J.v() && (i4 = o0o0o00J.e) >= i && i4 < i5) {
                o0o0o00J.e(2);
                o0o0o00J.d(obj);
                ((RecyclerView.Oooo0) viewI.getLayoutParams()).c = true;
            }
        }
        RecyclerView.o00Ooo o00ooo = recyclerView.f;
        int size = o00ooo.c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.a.am = true;
                return;
            }
            RecyclerView.o0O0O00 o0o0o00 = o00ooo.c.get(size);
            if (o0o0o00 != null && (i3 = o0o0o00.e) >= i && i3 < i5) {
                o0o0o00.e(2);
                o00ooo.g(size);
            }
        }
    }

    public void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.h.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(recyclerView.h.i(i3));
            if (o0o0o00J != null && !o0o0o00J.v() && o0o0o00J.e >= i) {
                o0o0o00J.t(i2, false);
                recyclerView.ai.f = true;
            }
        }
        RecyclerView.o00Ooo o00ooo = recyclerView.f;
        int size = o00ooo.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.o0O0O00 o0o0o00 = o00ooo.c.get(i4);
            if (o0o0o00 != null && o0o0o00.e >= i) {
                o0o0o00.t(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.a.ak = true;
    }

    public void f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.h.j();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.o0O0O00 o0o0o00J = RecyclerView.j(recyclerView.h.i(i11));
            if (o0o0o00J != null && (i9 = o0o0o00J.e) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    o0o0o00J.t(i2 - i, false);
                } else {
                    o0o0o00J.t(i5, false);
                }
                recyclerView.ai.f = true;
            }
        }
        RecyclerView.o00Ooo o00ooo = recyclerView.f;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = o00ooo.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.o0O0O00 o0o0o00 = o00ooo.c.get(i12);
            if (o0o0o00 != null && (i8 = o0o0o00.e) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    o0o0o00.t(i2 - i, false);
                } else {
                    o0o0o00.t(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.ak = true;
    }
}
