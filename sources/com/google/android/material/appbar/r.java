package com.google.android.material.appbar;

import android.view.View;
import ivas.gov.bisp.enumeration.M.n;

/* JADX INFO: loaded from: classes.dex */
public class r implements n {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public r(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // ivas.gov.bisp.enumeration.M.n
    public boolean b(View view, n.aXs axs) {
        this.a.setExpanded(this.b);
        return true;
    }
}
