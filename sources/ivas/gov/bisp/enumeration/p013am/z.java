package ivas.gov.bisp.enumeration.p013am;

import android.content.Intent;
import android.os.Bundle;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.a;
import androidx.emoji2.text.b;
import androidx.emoji2.text.d;
import androidx.emoji2.text.e;
import ivas.gov.bisp.enumeration.aB.r;
import ivas.gov.bisp.enumeration.p053bz.N;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import org.acra.sender.LegacySenderService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            LegacySenderService legacySenderService = (LegacySenderService) this.b;
            r rVar = (r) this.c;
            Intent intent = (Intent) this.d;
            int i = LegacySenderService.a;
            ivas.gov.bisp.enumeration.O.r.n(legacySenderService, "this$0");
            ivas.gov.bisp.enumeration.O.r.n(intent, "$intent");
            N n = new N(legacySenderService, rVar);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            n.f(false, extras);
            legacySenderService.stopSelf();
            return;
        }
        EmojiCompatInitializer.OooO0O0 oooO0O0 = (EmojiCompatInitializer.OooO0O0) this.b;
        b.aKk akk = (b.aKk) this.c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
        Objects.requireNonNull(oooO0O0);
        try {
            d dVarA = a.a(oooO0O0.a);
            if (dVarA == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            d.aKf akf = (d.aKf) dVarA.a;
            synchronized (akf.e) {
                akf.f = threadPoolExecutor;
            }
            dVarA.a.b(new e(oooO0O0, akk, threadPoolExecutor));
        } catch (Throwable th) {
            akk.b(th);
            threadPoolExecutor.shutdown();
        }
    }
}
