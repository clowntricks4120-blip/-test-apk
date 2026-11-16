package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import ivas.gov.bisp.enumeration.F.K;
import ivas.gov.bisp.enumeration.OooOOoo.OooO0o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class v implements Runnable {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ K b;
    public final /* synthetic */ ivas.gov.bisp.enumeration.p001aa.r c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ w.aLw f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Rect l;

    public v(K k, ivas.gov.bisp.enumeration.p001aa.r rVar, Object obj, w.aLw alw, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.b = k;
        this.c = rVar;
        this.d = obj;
        this.f = alw;
        this.e = arrayList;
        this.g = view;
        this.h = fragment;
        this.a = fragment2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        OooO0o<String, View> oooO0oH = w.h(this.b, this.c, this.d, this.f);
        if (oooO0oH != null) {
            this.e.addAll(oooO0oH.values());
            this.e.add(this.g);
        }
        w.e(this.h, this.a, this.i, oooO0oH, false);
        Object obj = this.d;
        if (obj != null) {
            this.b.v(obj, this.j, this.e);
            View viewL = w.l(oooO0oH, this.f, this.k, this.i);
            if (viewL != null) {
                this.b.m(viewL, this.l);
            }
        }
    }
}
