package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class u implements Runnable {
    public final /* synthetic */ w.aLv a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ ivas.gov.bisp.enumeration.H.c c;

    public u(w.aLv alv, Fragment fragment, ivas.gov.bisp.enumeration.H.c cVar) {
        this.a = alv;
        this.b = fragment;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((h.aLC) this.a).b(this.b, this.c);
    }
}
