package ivas.gov.bisp.enumeration.p022av;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import ivas.gov.bisp.enumeration.o0ooOO0.o00Ooo;
import ivas.gov.bisp.enumeration.o0ooOO0.o0ooOOo;
import ivas.gov.bisp.enumeration.p023aw.h;
import ivas.gov.bisp.enumeration.p023aw.j;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.av.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0093l extends Thread {
    private static int a = 1;
    private static int b;
    public final BlockingQueue<o00O0O<?>> c;
    public final u d;
    public final r e;
    public volatile boolean f = false;
    public final O g;

    public C0093l(BlockingQueue<o00O0O<?>> blockingQueue, u uVar, r rVar, O o2) {
        this.c = blockingQueue;
        this.d = uVar;
        this.e = rVar;
        this.g = o2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 & 37;
        int i5 = (i3 ^ 37) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        Process.setThreadPriority(i6 % 2 == 0 ? 5 : 10);
        while (true) {
            try {
                c();
                int i7 = a;
                int i8 = (i7 & 51) + (i7 | 51);
                b = i8 % 128;
                int i9 = i8 % 2;
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    int i10 = b;
                    i = (i10 & 61) + (i10 | 61);
                    a = i % 128;
                    if (i % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                S.d("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                int i11 = b;
                int i12 = ((i11 | 62) << 1) - (i11 ^ 62);
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        Thread.currentThread().interrupt();
        int i15 = b;
        i = (i15 & 61) + (i15 | 61);
        a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b4 A[Catch: all -> 0x015e, Exception -> 0x0160, o0ooOOo -> 0x0199, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0160, o0ooOOo -> 0x0199, blocks: (B:5:0x0035, B:6:0x0038, B:13:0x005d, B:15:0x006f, B:18:0x0085, B:22:0x00a1, B:24:0x00b4, B:29:0x00d6, B:32:0x00f1, B:35:0x0115, B:36:0x0121, B:37:0x0129, B:40:0x0146, B:41:0x014d, B:42:0x0153, B:43:0x0154, B:44:0x015d, B:9:0x0040), top: B:55:0x0030, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x0115 A[Catch: all -> 0x015e, Exception -> 0x0160, o0ooOOo -> 0x0199, TRY_ENTER, TryCatch #3 {Exception -> 0x0160, o0ooOOo -> 0x0199, blocks: (B:5:0x0035, B:6:0x0038, B:13:0x005d, B:15:0x006f, B:18:0x0085, B:22:0x00a1, B:24:0x00b4, B:29:0x00d6, B:32:0x00f1, B:35:0x0115, B:36:0x0121, B:37:0x0129, B:40:0x0146, B:41:0x014d, B:42:0x0153, B:43:0x0154, B:44:0x015d, B:9:0x0040), top: B:55:0x0030, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0121 A[Catch: all -> 0x015e, Exception -> 0x0160, o0ooOOo -> 0x0199, TryCatch #3 {Exception -> 0x0160, o0ooOOo -> 0x0199, blocks: (B:5:0x0035, B:6:0x0038, B:13:0x005d, B:15:0x006f, B:18:0x0085, B:22:0x00a1, B:24:0x00b4, B:29:0x00d6, B:32:0x00f1, B:35:0x0115, B:36:0x0121, B:37:0x0129, B:40:0x0146, B:41:0x014d, B:42:0x0153, B:43:0x0154, B:44:0x015d, B:9:0x0040), top: B:55:0x0030, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0146 A[Catch: all -> 0x015e, Exception -> 0x0160, o0ooOOo -> 0x0199, TRY_ENTER, TryCatch #3 {Exception -> 0x0160, o0ooOOo -> 0x0199, blocks: (B:5:0x0035, B:6:0x0038, B:13:0x005d, B:15:0x006f, B:18:0x0085, B:22:0x00a1, B:24:0x00b4, B:29:0x00d6, B:32:0x00f1, B:35:0x0115, B:36:0x0121, B:37:0x0129, B:40:0x0146, B:41:0x014d, B:42:0x0153, B:43:0x0154, B:44:0x015d, B:9:0x0040), top: B:55:0x0030, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x014d A[Catch: all -> 0x015e, Exception -> 0x0160, o0ooOOo -> 0x0199, TryCatch #3 {Exception -> 0x0160, o0ooOOo -> 0x0199, blocks: (B:5:0x0035, B:6:0x0038, B:13:0x005d, B:15:0x006f, B:18:0x0085, B:22:0x00a1, B:24:0x00b4, B:29:0x00d6, B:32:0x00f1, B:35:0x0115, B:36:0x0121, B:37:0x0129, B:40:0x0146, B:41:0x014d, B:42:0x0153, B:43:0x0154, B:44:0x015d, B:9:0x0040), top: B:55:0x0030, outer: #2 }] */
    private void c() {
        o00Ooo<?> o00oooP;
        P p;
        int i;
        r rVar;
        String strH;
        r.bJP bjp;
        int i2;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 | 1) << 1) - (i4 ^ 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        o00O0O<?> o00o0o = (M) this.c.take();
        SystemClock.elapsedRealtime();
        int i7 = a;
        int i8 = ((i7 ^ 126) + ((i7 & 126) << 1)) - 1;
        b = i8 % 128;
        try {
            try {
                if (i8 % 2 != 0) {
                    o00o0o.q(2);
                    o00o0o.c("network-queue-take");
                } else {
                    o00o0o.q(3);
                    o00o0o.c("network-queue-take");
                }
                o00o0o.m();
                int i9 = b;
                int i10 = (i9 & (-40)) | ((~i9) & 39);
                int i11 = -(-((i9 & 39) << 1));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    TrafficStats.setThreadStatsTag(o00o0o.h);
                    throw null;
                }
                TrafficStats.setThreadStatsTag(o00o0o.h);
                j jVar = (j) this.d;
                int i13 = b + 25;
                a = i13 % 128;
                int i14 = i13 % 2;
                C0095o c0095oC = jVar.c(o00o0o);
                o00o0o.c("network-http-complete");
                if (c0095oC.g) {
                    int i15 = b + 103;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    if (!(!o00o0o.l())) {
                        int i17 = a;
                        int i18 = (i17 & (-68)) | ((~i17) & 67);
                        int i19 = (i17 & 67) << 1;
                        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                        b = i20 % 128;
                        int i21 = i20 % 2;
                        o00o0o.d("not-modified");
                        o00o0o.o();
                        int i22 = a + 63;
                        b = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        o00oooP = o00o0o.p(c0095oC);
                        o00o0o.c("network-parse-complete");
                        if (!(!o00o0o.k)) {
                            int i24 = b;
                            int i25 = i24 & 17;
                            int i26 = -(-((i24 ^ 17) | i25));
                            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                            a = i27 % 128;
                            int i28 = i27 % 2;
                            if (o00oooP.b != null) {
                                int i29 = a;
                                int i30 = ((i29 ^ 39) | (i29 & 39)) << 1;
                                int i31 = -(((~i29) & 39) | (i29 & (-40)));
                                int i32 = (i30 & i31) + (i31 | i30);
                                b = i32 % 128;
                                int i33 = i32 % 2;
                                rVar = this.e;
                                strH = o00o0o.h();
                                bjp = o00oooP.b;
                                int i34 = b;
                                i2 = ((((i34 ^ 23) | (i34 & 23)) << 1) - (~(-(((~i34) & 23) | (i34 & (-24)))))) - 1;
                                a = i2 % 128;
                                if (i2 % 2 == 0) {
                                    ((h) rVar).o(strH, bjp);
                                    o00o0o.c("network-cache-written");
                                    int i35 = 50 / 0;
                                } else {
                                    ((h) rVar).o(strH, bjp);
                                    o00o0o.c("network-cache-written");
                                }
                            }
                        }
                        o00o0o.j();
                        p = (P) this.g;
                        int i36 = b;
                        i = (((i36 ^ 71) | (i36 & 71)) << 1) - (((~i36) & 71) | (i36 & (-72)));
                        a = i % 128;
                        if (i % 2 != 0) {
                            p.c(o00o0o, o00oooP, null);
                            o00o0o.n(o00oooP);
                            throw null;
                        }
                        p.c(o00o0o, o00oooP, null);
                        o00o0o.n(o00oooP);
                    }
                } else {
                    o00oooP = o00o0o.p(c0095oC);
                    o00o0o.c("network-parse-complete");
                    if (!(!o00o0o.k)) {
                        int i210 = b;
                        int i211 = i210 & 17;
                        int i212 = -(-((i210 ^ 17) | i211));
                        int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                        a = i213 % 128;
                        int i214 = i213 % 2;
                        if (o00oooP.b != null) {
                            int i215 = a;
                            int i37 = ((i215 ^ 39) | (i215 & 39)) << 1;
                            int i38 = -(((~i215) & 39) | (i215 & (-40)));
                            int i39 = (i37 & i38) + (i38 | i37);
                            b = i39 % 128;
                            int i310 = i39 % 2;
                            rVar = this.e;
                            strH = o00o0o.h();
                            bjp = o00oooP.b;
                            int i311 = b;
                            i2 = ((((i311 ^ 23) | (i311 & 23)) << 1) - (~(-(((~i311) & 23) | (i311 & (-24)))))) - 1;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                ((h) rVar).o(strH, bjp);
                                o00o0o.c("network-cache-written");
                                int i312 = 50 / 0;
                            } else {
                                ((h) rVar).o(strH, bjp);
                                o00o0o.c("network-cache-written");
                            }
                        }
                    }
                    o00o0o.j();
                    p = (P) this.g;
                    int i313 = b;
                    i = (((i313 ^ 71) | (i313 & 71)) << 1) - (((~i313) & 71) | (i313 & (-72)));
                    a = i % 128;
                    if (i % 2 != 0) {
                        p.c(o00o0o, o00oooP, null);
                        o00o0o.n(o00oooP);
                        throw null;
                    }
                    p.c(o00o0o, o00oooP, null);
                    o00o0o.n(o00oooP);
                }
                o00o0o.q(4);
                int i40 = b;
                int i41 = i40 & 31;
                int i42 = i41 + ((i40 ^ 31) | i41);
                a = i42 % 128;
                int i43 = i42 % 2;
            } catch (Exception e) {
                Log.e("Volley", S.c("Unhandled exception %s", e.toString()), e);
                T t = new T(e);
                SystemClock.elapsedRealtime();
                P p2 = (P) this.g;
                Objects.requireNonNull(p2);
                o00o0o.c("post-error");
                p2.a.execute(new P.bJX(o00o0o, new C0094m(t), null));
                o00o0o.o();
            } catch (o0ooOOo e2) {
                SystemClock.elapsedRealtime();
                P p3 = (P) this.g;
                Objects.requireNonNull(p3);
                o00o0o.c("post-error");
                p3.a.execute(new P.bJX(o00o0o, new C0094m(e2), null));
                o00o0o.o();
            }
        } catch (Throwable th) {
            o00o0o.q(4);
            throw th;
        }
    }
}
