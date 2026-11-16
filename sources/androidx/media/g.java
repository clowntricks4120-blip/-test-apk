package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class g implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ int e;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f;

    public g(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, int i, int i2, Bundle bundle) {
        this.f = oooOOO0;
        this.a = oooOOO;
        this.b = str;
        this.c = i;
        this.e = i2;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderB = ((MediaBrowserServiceCompat.OooOOOO) this.a).b();
        MediaBrowserServiceCompat.this.c.remove(iBinderB);
        MediaBrowserServiceCompat.OooO00o oooO00o = MediaBrowserServiceCompat.this.new OooO00o(this.b, this.c, this.e, this.d, this.a);
        MediaBrowserServiceCompat.this.c.put(iBinderB, oooO00o);
        try {
            iBinderB.linkToDeath(oooO00o, 0);
        } catch (RemoteException unused) {
        }
    }
}
