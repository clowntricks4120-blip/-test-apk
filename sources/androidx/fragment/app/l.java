package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {
    public final /* synthetic */ ArrayList a;

    public l(e eVar, ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        w.q(this.a, 4);
    }
}
