package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends MediaBrowserServiceCompat.OooOO0O<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ MediaBrowserServiceCompat e;
    public final /* synthetic */ String f;
    public final /* synthetic */ MediaBrowserServiceCompat.OooO00o g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ Bundle i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, MediaBrowserServiceCompat.OooO00o oooO00o, String str, Bundle bundle, Bundle bundle2) {
        super(obj);
        this.e = mediaBrowserServiceCompat;
        this.g = oooO00o;
        this.f = str;
        this.h = bundle;
        this.i = bundle2;
    }
}
