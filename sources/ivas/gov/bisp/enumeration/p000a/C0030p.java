package ivas.gov.bisp.enumeration.p000a;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.a.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0030p extends r {
    private static int a = 0;
    private static int b = 1;

    public C0030p(Context context, z zVar) {
        super(context, zVar);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        int i = 2 % 2;
        z zVar = (z) this.c;
        e eVar = new e(result);
        int i2 = a;
        int i3 = (i2 ^ 39) + ((i2 & 39) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        zVar.e(str, eVar);
        int i5 = b;
        int i6 = (((i5 | 85) << 1) - (~(-(((~i5) & 85) | (i5 & (-86)))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
    }
}
