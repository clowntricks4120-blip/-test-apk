package androidx.media;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import ivas.gov.bisp.enumeration.p000a.u;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ int e;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f;

    public e(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, int i, int i2, Bundle bundle) {
        this.f = oooOOO0;
        this.a = oooOOO;
        this.b = str;
        this.c = i;
        this.e = i2;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.this.c.remove(((MediaBrowserServiceCompat.OooOOOO) this.a).b());
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.b;
        int i = this.c;
        int i2 = this.e;
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            new u(str, i, i2);
        }
        Objects.requireNonNull(MediaBrowserServiceCompat.this);
        MediaBrowserServiceCompat.this.c(this.b, this.e, this.d);
        Objects.requireNonNull(MediaBrowserServiceCompat.this);
        try {
            ((MediaBrowserServiceCompat.OooOOOO) this.a).c(2, null);
        } catch (RemoteException unused) {
        }
    }
}
