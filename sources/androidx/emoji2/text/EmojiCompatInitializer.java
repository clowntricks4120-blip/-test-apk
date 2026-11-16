package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.lifecycle.ProcessLifecycleInitializer;
import ivas.gov.bisp.enumeration.E.i;
import ivas.gov.bisp.enumeration.H.h;
import ivas.gov.bisp.enumeration.o00Oo0.OooOO0O;
import ivas.gov.bisp.enumeration.p013am.C0092p;
import ivas.gov.bisp.enumeration.p013am.z;
import ivas.gov.bisp.enumeration.p027b.B;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements OooOO0O<Boolean> {

    public static class OooO00o extends b.aKa {
        public OooO00o(Context context) {
            super(new OooO0O0(context));
            this.b = 1;
        }
    }

    public static class OooO0O0 implements b.aKb {
        public final Context a;

        public OooO0O0(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.b.aKb
        public void b(b.aKk akk) {
            ThreadPoolExecutor threadPoolExecutorB = C0092p.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new z(this, akk, threadPoolExecutorB, 0));
        }
    }

    public static class OooO0OO implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                int i = h.c;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (b.d()) {
                    b.c().i();
                }
            } finally {
                int i2 = h.c;
                Trace.endSection();
            }
        }
    }

    public List<Class<? extends OooOO0O<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public Boolean c(Context context) {
        OooO00o oooO00o = new OooO00o(context);
        if (b.b == null) {
            synchronized (b.a) {
                if (b.b == null) {
                    b.b = new b(oooO00o);
                }
            }
        }
        i iVarC = i.c(context);
        Objects.requireNonNull(iVarC);
        final androidx.lifecycle.d lifecycle = ((ivas.gov.bisp.enumeration.p027b.d) iVarC.d(ProcessLifecycleInitializer.class, new HashSet())).getLifecycle();
        lifecycle.b(new B() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // ivas.gov.bisp.enumeration.p027b.B
            public /* synthetic */ void b(ivas.gov.bisp.enumeration.p027b.d dVar) {
            }

            @Override // ivas.gov.bisp.enumeration.p027b.B
            public /* synthetic */ void c(ivas.gov.bisp.enumeration.p027b.d dVar) {
            }

            @Override // ivas.gov.bisp.enumeration.p027b.B
            public /* synthetic */ void d(ivas.gov.bisp.enumeration.p027b.d dVar) {
            }

            @Override // ivas.gov.bisp.enumeration.p027b.B
            public /* synthetic */ void e(ivas.gov.bisp.enumeration.p027b.d dVar) {
            }

            @Override // ivas.gov.bisp.enumeration.p027b.B
            public /* synthetic */ void f(ivas.gov.bisp.enumeration.p027b.d dVar) {
            }

            @Override // ivas.gov.bisp.enumeration.p027b.B
            public void g(ivas.gov.bisp.enumeration.p027b.d dVar) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                C0092p.c().postDelayed(new OooO0OO(), 500L);
                androidx.lifecycle.c cVar = (androidx.lifecycle.c) lifecycle;
                cVar.i("removeObserver");
                cVar.a.g(this);
            }
        });
        return Boolean.TRUE;
    }

    public /* synthetic */ Object create(Context context) {
        c(context);
        return Boolean.TRUE;
    }
}
