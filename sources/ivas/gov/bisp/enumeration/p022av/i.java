package ivas.gov.bisp.enumeration.p022av;

import android.os.Process;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.p023aw.h;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class i extends Thread {
    private static int a = 0;
    private static int b = 1;
    public static final boolean c = S.c;
    public final BlockingQueue<o00O0O<?>> d;
    public final BlockingQueue<o00O0O<?>> e;
    public final r f;
    public volatile boolean g = false;
    public final O h;
    public final L i;

    static {
        int i = a;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public i(BlockingQueue<o00O0O<?>> blockingQueue, BlockingQueue<o00O0O<?>> blockingQueue2, r rVar, O o2) {
        this.d = blockingQueue;
        this.e = blockingQueue2;
        this.f = rVar;
        this.h = o2;
        this.i = new L(this, blockingQueue2, o2);
    }

    private void c() {
        o00O0O<?> o00o0o = (M) this.d.take();
        o00o0o.c("cache-queue-take");
        o00o0o.q(1);
        try {
            o00o0o.m();
            r.bJP bjpK = ((h) this.f).k(o00o0o.h());
            if (bjpK == null) {
                o00o0o.c("cache-miss");
                if (!this.i.c(o00o0o)) {
                    this.e.put(o00o0o);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (bjpK.f < jCurrentTimeMillis) {
                    o00o0o.c("cache-hit-expired");
                    o00o0o.f68o = bjpK;
                    if (!this.i.c(o00o0o)) {
                        this.e.put(o00o0o);
                    }
                } else {
                    o00o0o.c("cache-hit");
                    o00Ooo<?> o00oooP = o00o0o.p(new C0095o(bjpK.a, bjpK.g));
                    o00o0o.c("cache-hit-parsed");
                    if (o00oooP.c != null) {
                        o00o0o.c("cache-parsing-failed");
                        r rVar = this.f;
                        String strH = o00o0o.h();
                        h hVar = (h) rVar;
                        synchronized (hVar) {
                            r.bJP bjpK2 = hVar.k(strH);
                            if (bjpK2 != null) {
                                bjpK2.e = 0L;
                                bjpK2.f = 0L;
                                hVar.o(strH, bjpK2);
                            }
                        }
                        o00o0o.f68o = null;
                        if (!this.i.c(o00o0o)) {
                            this.e.put(o00o0o);
                        }
                    } else if (bjpK.e < jCurrentTimeMillis) {
                        o00o0o.c("cache-hit-refresh-needed");
                        o00o0o.f68o = bjpK;
                        o00oooP.d = true;
                        if (this.i.c(o00o0o)) {
                            ((P) this.h).c(o00o0o, o00oooP, null);
                        } else {
                            ((P) this.h).c(o00o0o, o00oooP, new e(this, o00o0o));
                        }
                    } else {
                        ((P) this.h).c(o00o0o, o00oooP, null);
                    }
                }
            }
            o00o0o.q(2);
        } catch (Throwable th) {
            o00o0o.q(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 ^ 2) + ((i2 & 2) << 1)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (c) {
            int i6 = (i4 ^ 115) + ((i4 & 115) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            S.e("start new dispatcher", new Object[0]);
            int i8 = b;
            int i9 = i8 & 115;
            int i10 = -(-((i8 ^ 115) | i9));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            int i12 = i11 % 2;
        }
        Process.setThreadPriority(10);
        ((h) this.f).n();
        int i13 = a;
        int i14 = ((i13 | 119) << 1) - (i13 ^ 119);
        b = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            try {
                c();
                int i16 = b;
                int i17 = i16 & 41;
                int i18 = ((i16 ^ 41) | i17) << 1;
                int i19 = -((i16 | 41) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
            } catch (InterruptedException unused) {
                if (this.g) {
                    Thread.currentThread().interrupt();
                    int i22 = b;
                    int i23 = ((i22 & 121) - (~(i22 | 121))) - 1;
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    return;
                }
                S.d("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                int i25 = a;
                int i26 = i25 & 55;
                int i27 = ((i25 ^ 55) | i26) << 1;
                int i28 = -((i25 | 55) & (~i26));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                b = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 2 / 2;
                }
            }
        }
    }
}
