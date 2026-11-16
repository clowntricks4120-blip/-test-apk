package androidx.media;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class h implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 b;

    public h(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO) {
        this.b = oooOOO0;
        this.a = oooOOO;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderB = ((MediaBrowserServiceCompat.OooOOOO) this.a).b();
        MediaBrowserServiceCompat.OooO00o oooO00o = (MediaBrowserServiceCompat.OooO00o) MediaBrowserServiceCompat.this.c.remove(iBinderB);
        if (oooO00o != null) {
            iBinderB.unlinkToDeath(oooO00o, 0);
        }
    }
}
