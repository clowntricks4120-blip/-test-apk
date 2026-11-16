package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import ivas.gov.bisp.enumeration.F.K;

/* JADX INFO: loaded from: classes.dex */
public class k implements Runnable {
    public final /* synthetic */ K a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Rect c;

    public k(e eVar, K k, View view, Rect rect) {
        this.a = k;
        this.b = view;
        this.c = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.m(this.b, this.c);
    }
}
