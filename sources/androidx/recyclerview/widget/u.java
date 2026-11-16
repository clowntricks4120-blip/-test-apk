package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class u extends C {
    public g c;
    public g d;

    @Override // androidx.recyclerview.widget.C
    public int[] b(RecyclerView.Oooo000 oooo000, View view) {
        int[] iArr = new int[2];
        if (oooo000.k()) {
            iArr[0] = d(view, g(oooo000));
        } else {
            iArr[0] = 0;
        }
        if (oooo000.j()) {
            iArr[1] = d(view, f(oooo000));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int d(View view, g gVar) {
        int iH = gVar.h(view);
        return ((gVar.e(view) / 2) + iH) - ((gVar.m() / 2) + gVar.l());
    }

    public final View e(RecyclerView.Oooo000 oooo000, g gVar) {
        int iW = oooo000.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iL = gVar.l();
        int iM = gVar.m() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewA = oooo000.A(i2);
            int iAbs = Math.abs(((gVar.e(viewA) / 2) + gVar.h(viewA)) - (iM + iL));
            if (iAbs < i) {
                view = viewA;
                i = iAbs;
            }
        }
        return view;
    }

    public final g f(RecyclerView.Oooo000 oooo000) {
        g gVar = this.c;
        if (gVar == null || gVar.a != oooo000) {
            this.c = new t(oooo000);
        }
        return this.c;
    }

    public final g g(RecyclerView.Oooo000 oooo000) {
        g gVar = this.d;
        if (gVar == null || gVar.a != oooo000) {
            this.d = new s(oooo000);
        }
        return this.d;
    }
}
