package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static int a(RecyclerView.o0Oo0oo o0oo0oo, g gVar, View view, View view2, RecyclerView.Oooo000 oooo000, boolean z) {
        if (oooo000.w() == 0 || o0oo0oo.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oooo000.T(view) - oooo000.T(view2)) + 1;
        }
        return Math.min(gVar.m(), gVar.d(view2) - gVar.h(view));
    }

    public static int b(RecyclerView.o0Oo0oo o0oo0oo, g gVar, View view, View view2, RecyclerView.Oooo000 oooo000, boolean z, boolean z2) {
        if (oooo000.w() == 0 || o0oo0oo.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (o0oo0oo.c() - Math.max(oooo000.T(view), oooo000.T(view2))) - 1) : Math.max(0, Math.min(oooo000.T(view), oooo000.T(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(gVar.d(view2) - gVar.h(view)) / (Math.abs(oooo000.T(view) - oooo000.T(view2)) + 1))) + (gVar.l() - gVar.h(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.o0Oo0oo o0oo0oo, g gVar, View view, View view2, RecyclerView.Oooo000 oooo000, boolean z) {
        if (oooo000.w() == 0 || o0oo0oo.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return o0oo0oo.c();
        }
        return (int) (((gVar.d(view2) - gVar.h(view)) / (Math.abs(oooo000.T(view) - oooo000.T(view2)) + 1)) * o0oo0oo.c());
    }
}
