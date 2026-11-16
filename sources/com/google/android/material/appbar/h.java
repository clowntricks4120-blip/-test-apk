package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ivas.gov.bisp.enumeration.M.n;

/* JADX INFO: loaded from: classes.dex */
public class h implements n {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public h(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    @Override // ivas.gov.bisp.enumeration.M.n
    public boolean b(View view, n.aXs axs) {
        this.e.X(this.a, this.b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
