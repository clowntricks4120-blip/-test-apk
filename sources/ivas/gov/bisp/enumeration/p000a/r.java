package ivas.gov.bisp.enumeration.p000a;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r extends MediaBrowserService {
    private static int a = 0;
    private static int b = 1;
    public final i c;

    public r(Context context, i iVar) {
        attachBaseContext(context);
        this.c = iVar;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        int i = 2 % 2;
        this.c.c(str, new e(result));
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = i3 + ((i2 ^ 101) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 93;
        int i5 = (i4 - (~(-(-((i3 ^ 93) | i4))))) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            MediaSessionCompat.ensureClassLoader(bundle);
            throw null;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        i iVar = this.c;
        if (bundle == null) {
            int i6 = a;
            int i7 = (((i6 | 62) << 1) - (i6 ^ 62)) - 1;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 99;
            int i11 = (i8 ^ 99) | i10;
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 / 5;
            }
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
            int i14 = a;
            int i15 = i14 & 103;
            int i16 = (i14 | 103) & (~i15);
            int i17 = i15 << 1;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 3 / 5;
            }
        }
        iVar.d(str, i, bundle2);
        int i20 = b;
        int i21 = (i20 & 1) + (i20 | 1);
        int i22 = i21 % 128;
        a = i22;
        int i23 = i21 % 2;
        int i24 = i22 + 79;
        b = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }
}
