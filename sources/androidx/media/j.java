package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import ivas.gov.bisp.enumeration.p000a.C0030p;
import ivas.gov.bisp.enumeration.p000a.z;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static Field a;

    public static class aMC extends C0030p {
        public aMC(Context context, aMp amp) {
            super(context, amp);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((aMp) this.c).a(str, new aMD(result), bundle);
        }
    }

    public static class aMD {
        public MediaBrowserService.Result a;

        public aMD(MediaBrowserService.Result result) {
            this.a = result;
        }
    }

    public interface aMp extends z {
        void a(String str, aMD amd, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
