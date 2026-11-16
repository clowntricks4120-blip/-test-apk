package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.Oooo0o0.o0ooOOo;
import ivas.gov.bisp.enumeration.p010aj.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 d;
    public final /* synthetic */ Bundle e;

    public a(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, IBinder iBinder, Bundle bundle) {
        this.d = oooOOO0;
        this.a = oooOOO;
        this.b = str;
        this.c = iBinder;
        this.e = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        MediaBrowserServiceCompat.OooO00o oooO00o = (MediaBrowserServiceCompat.OooO00o) MediaBrowserServiceCompat.this.c.get(((MediaBrowserServiceCompat.OooOOOO) this.a).b());
        if (oooO00o == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.b;
        IBinder iBinder = this.c;
        Bundle bundle = this.e;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        List<o0ooOOo<IBinder, Bundle>> arrayList = oooO00o.c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (T t : arrayList) {
            if (iBinder == t.c && r.g(bundle, (Bundle) t.d)) {
                return;
            }
        }
        arrayList.add(new T(iBinder, bundle));
        oooO00o.c.put(str, arrayList);
        b bVar = new b(mediaBrowserServiceCompat, str, oooO00o, str, bundle, null);
        if (bundle == null) {
            mediaBrowserServiceCompat.d(str, bVar);
        } else {
            bVar.d = 1;
            mediaBrowserServiceCompat.d(str, bVar);
        }
        if (bVar.b()) {
            return;
        }
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("onLoadChildren must call detach() or sendResult() before returning for package=");
        sbW.append(oooO00o.a);
        sbW.append(" id=");
        sbW.append(str);
        throw new IllegalStateException(sbW.toString());
    }
}
