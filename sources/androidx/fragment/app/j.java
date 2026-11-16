package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {
    public final /* synthetic */ i.aLo a;
    public final /* synthetic */ i.aLo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ivas.gov.bisp.enumeration.p001aa.r d;

    public j(e eVar, i.aLo alo, i.aLo alo2, boolean z, ivas.gov.bisp.enumeration.p001aa.r rVar) {
        this.a = alo;
        this.b = alo2;
        this.c = z;
        this.d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w.e(this.a.c, this.b.c, this.c, this.d, false);
    }
}
