package ivas.gov.bisp.enumeration.p022av;

import android.os.Handler;
import android.os.Looper;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class N {
    public i a;
    public final AtomicInteger b;
    public final Set<o00O0O<?>> c;
    public final PriorityBlockingQueue<o00O0O<?>> d;
    public final PriorityBlockingQueue<o00O0O<?>> e;
    public final u f;
    public final r g;
    public final O h;
    public final C0093l[] i;
    public final List<bKi> j;
    public final List<bKh> k;

    public interface bKh {
        void b(o00O0O<?> o00o0o, int i);
    }

    @Deprecated
    public interface bKi<T> {
        void b(o00O0O<T> o00o0o);
    }

    public <T> o00O0O<T> c(o00O0O<T> o00o0o) {
        o00o0o.c = this;
        synchronized (this.c) {
            this.c.add(o00o0o);
        }
        o00o0o.j = Integer.valueOf(this.b.incrementAndGet());
        o00o0o.c("add-to-queue");
        d(o00o0o, 0);
        if (o00o0o.k) {
            this.d.add(o00o0o);
        } else {
            this.e.add(o00o0o);
        }
        return o00o0o;
    }

    public void d(o00O0O<?> o00o0o, int i) {
        synchronized (this.k) {
            Iterator<bKh> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().b(o00o0o, i);
            }
        }
    }

    public N(r rVar, u uVar) {
        P p = new P(new Handler(Looper.getMainLooper()));
        this.b = new AtomicInteger();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue<>();
        this.e = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.g = rVar;
        this.f = uVar;
        this.i = new C0093l[4];
        this.h = p;
    }
}
