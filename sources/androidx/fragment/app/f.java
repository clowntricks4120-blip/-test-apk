package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class f implements ivas.gov.bisp.enumeration.H.c.aKS {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ e.aKO c;

    public f(e eVar, View view, ViewGroup viewGroup, e.aKO ako) {
        this.a = view;
        this.b = viewGroup;
        this.c = ako;
    }

    @Override // ivas.gov.bisp.enumeration.H.c.aKS
    public void onCancel() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.b();
    }
}
