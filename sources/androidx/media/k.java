package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 d;

    public k(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.d = oooOOO0;
        this.a = oooOOO;
        this.b = bundle;
        this.c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((MediaBrowserServiceCompat.OooO00o) MediaBrowserServiceCompat.this.c.get(((MediaBrowserServiceCompat.OooOOOO) this.a).b())) == null) {
            Objects.toString(this.b);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        ResultReceiver resultReceiver = this.c;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        resultReceiver.send(-1, null);
    }
}
