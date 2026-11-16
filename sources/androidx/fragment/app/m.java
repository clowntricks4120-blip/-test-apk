package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class m implements Runnable {
    public final /* synthetic */ e.aKP a;

    public m(e eVar, e.aKP akp) {
        this.a = akp;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b();
    }
}
