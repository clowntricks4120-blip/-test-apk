package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import ivas.gov.bisp.enumeration.F.K;

/* JADX INFO: loaded from: classes.dex */
public class x implements Runnable {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ivas.gov.bisp.enumeration.p001aa.r e;
    public final /* synthetic */ K f;
    public final /* synthetic */ Rect g;

    public x(Fragment fragment, Fragment fragment2, boolean z, ivas.gov.bisp.enumeration.p001aa.r rVar, View view, K k, Rect rect) {
        this.a = fragment;
        this.b = fragment2;
        this.c = z;
        this.e = rVar;
        this.d = view;
        this.f = k;
        this.g = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        w.e(this.a, this.b, this.c, this.e, false);
        View view = this.d;
        if (view != null) {
            this.f.m(view, this.g);
        }
    }
}
