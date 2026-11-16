package ivas.gov.bisp.enumeration.p022av;

import ivas.gov.bisp.enumeration.o0ooOO0.o00O0O;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class L implements M.bKf {
    public final Map<String, List<o00O0O<?>>> a = new HashMap();
    public final O b;
    public final i c;
    public final BlockingQueue<o00O0O<?>> d;

    public L(i iVar, BlockingQueue<o00O0O<?>> blockingQueue, O o2) {
        this.b = o2;
        this.c = iVar;
        this.d = blockingQueue;
    }

    public boolean c(o00O0O<?> o00o0o) {
        synchronized (this) {
            String strH = o00o0o.h();
            if (!this.a.containsKey(strH)) {
                this.a.put(strH, null);
                synchronized (o00o0o.g) {
                    o00o0o.n = this;
                }
                if (S.c) {
                    S.c("new request, sending to network %s", strH);
                }
                return false;
            }
            List<o00O0O<?>> arrayList = this.a.get(strH);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            o00o0o.c("waiting-for-response");
            arrayList.add(o00o0o);
            this.a.put(strH, arrayList);
            if (S.c) {
                S.c("Request for cacheKey=%s is in flight, putting on hold.", strH);
            }
            return true;
        }
    }

    public void d(o00O0O<?> o00o0o) {
        BlockingQueue<o00O0O<?>> blockingQueue;
        synchronized (this) {
            String strH = o00o0o.h();
            List<o00O0O<?>> listRemove = this.a.remove(strH);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (S.c) {
                    S.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strH);
                }
                o00O0O<?> o00o0o2 = (M) listRemove.remove(0);
                this.a.put(strH, listRemove);
                synchronized (o00o0o2.g) {
                    o00o0o2.n = this;
                }
                if (this.c != null && (blockingQueue = this.d) != null) {
                    try {
                        blockingQueue.put(o00o0o2);
                    } catch (InterruptedException e) {
                        S.d("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        i iVar = this.c;
                        iVar.g = true;
                        iVar.interrupt();
                    }
                }
            }
        }
    }
}
