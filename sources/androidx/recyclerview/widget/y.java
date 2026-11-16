package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class y extends r {
    public final /* synthetic */ u p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u uVar, Context context) {
        super(context);
        this.p = uVar;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.o0OOO0o
    public void c(View view, RecyclerView.o0Oo0oo o0oo0oo, RecyclerView.o0OOO0o.OooO00o oooO00o) {
        u uVar = this.p;
        int[] iArrB = uVar.b(uVar.a.getLayoutManager(), view);
        int i = iArrB[0];
        int i2 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) f(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            oooO00o.c(i, i2, iCeil, this.h);
        }
    }

    @Override // androidx.recyclerview.widget.r
    public int f(int i) {
        return Math.min(100, super.f(i));
    }

    @Override // androidx.recyclerview.widget.r
    public float g(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
