package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.Handler;
import ivas.gov.bisp.enumeration.O.r;
import ivas.gov.bisp.enumeration.p009ai.M;
import ivas.gov.bisp.enumeration.p009ai.N;
import ivas.gov.bisp.enumeration.p009ai.t;
import ivas.gov.bisp.enumeration.p009ai.u;
import ivas.gov.bisp.enumeration.p013am.C0092p;
import ivas.gov.bisp.enumeration.p088k.af;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class d extends b.aKa {
    public static final aKe d = new aKe();

    public static class aKe {
    }

    public static class aKf implements b.aKb {
        public ContentObserver a;
        public final Context b;
        public final u c;
        public final aKe d;
        public final Object e = new Object();
        public Executor f;
        public Handler g;
        public ThreadPoolExecutor h;
        public b.aKk i;
        public Runnable j;

        public aKf(Context context, u uVar, aKe ake) {
            r.k(context, "Context cannot be null");
            r.k(uVar, "FontRequest cannot be null");
            this.b = context.getApplicationContext();
            this.c = uVar;
            this.d = ake;
        }

        @Override // androidx.emoji2.text.b.aKb
        public void b(b.aKk akk) {
            synchronized (this.e) {
                this.i = akk;
            }
            d();
        }

        public final void c() {
            synchronized (this.e) {
                this.i = null;
                ContentObserver contentObserver = this.a;
                if (contentObserver != null) {
                    aKe ake = this.d;
                    Context context = this.b;
                    Objects.requireNonNull(ake);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.a = null;
                }
                Handler handler = this.g;
                if (handler != null) {
                    handler.removeCallbacks(this.j);
                }
                this.g = null;
                ThreadPoolExecutor threadPoolExecutor = this.h;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.h = null;
            }
        }

        public void d() {
            synchronized (this.e) {
                if (this.i == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutorB = C0092p.b("emojiCompat");
                    this.h = threadPoolExecutorB;
                    this.f = threadPoolExecutorB;
                }
                this.f.execute(new af(this, 1));
            }
        }

        public final N e() throws Throwable {
            try {
                aKe ake = this.d;
                Context context = this.b;
                u uVar = this.c;
                Objects.requireNonNull(ake);
                M mB = t.b(context, uVar, null);
                if (mB.a != 0) {
                    throw new RuntimeException(j.s(j.w("fetchFonts failed ("), mB.a, ")"));
                }
                N[] nArr = mB.b;
                if (nArr == null || nArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return nArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public d(Context context, u uVar) {
        super(new aKf(context, uVar, d));
    }
}
