package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 d;

    public c(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, IBinder iBinder) {
        this.d = oooOOO0;
        this.a = oooOOO;
        this.b = str;
        this.c = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.OooO00o oooO00o = (MediaBrowserServiceCompat.OooO00o) MediaBrowserServiceCompat.this.c.get(((MediaBrowserServiceCompat.OooOOOO) this.a).b());
        if (oooO00o == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.b;
        IBinder iBinder = this.c;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        if (iBinder == null) {
            oooO00o.c.remove(str);
            return;
        }
        List<o0ooOOo<IBinder, Bundle>> list = oooO00o.c.get(str);
        if (list != null) {
            Iterator<o0ooOOo<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().c) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                oooO00o.c.remove(str);
            }
        }
    }
}
