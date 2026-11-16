package androidx.media;

import android.support.v4.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ ResultReceiver b;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 c;

    public f(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, ResultReceiver resultReceiver) {
        this.c = oooOOO0;
        this.a = oooOOO;
        this.b = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((MediaBrowserServiceCompat.OooO00o) MediaBrowserServiceCompat.this.c.get(((MediaBrowserServiceCompat.OooOOOO) this.a).b())) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        ResultReceiver resultReceiver = this.b;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        resultReceiver.send(-1, null);
    }
}
