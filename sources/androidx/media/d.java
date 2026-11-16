package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class d implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 b;

    public d(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO) {
        this.b = oooOOO0;
        this.a = oooOOO;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.OooO00o oooO00o = (MediaBrowserServiceCompat.OooO00o) MediaBrowserServiceCompat.this.c.remove(((MediaBrowserServiceCompat.OooOOOO) this.a).b());
        if (oooO00o != null) {
            ((MediaBrowserServiceCompat.OooOOOO) oooO00o.b).b().unlinkToDeath(oooO00o, 0);
        }
    }
}
