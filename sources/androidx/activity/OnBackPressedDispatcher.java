package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.a;
import androidx.lifecycle.d;
import ivas.gov.bisp.enumeration.p083f.c;
import ivas.gov.bisp.enumeration.p083f.j;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<c> b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements a, j {
        public final d a;
        public final c b;
        public j c;

        public LifecycleOnBackPressedCancellable(d dVar, c cVar) {
            this.a = dVar;
            this.b = cVar;
            dVar.b(this);
        }

        @Override // androidx.lifecycle.a
        public void a(ivas.gov.bisp.enumeration.p027b.d dVar, d.aLZ alz) {
            if (alz == d.aLZ.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                c cVar = this.b;
                onBackPressedDispatcher.b.add(cVar);
                OooO00o oooO00o = onBackPressedDispatcher.new OooO00o(cVar);
                cVar.b.add(oooO00o);
                this.c = oooO00o;
                return;
            }
            if (alz != d.aLZ.ON_STOP) {
                if (alz == d.aLZ.ON_DESTROY) {
                    cancel();
                }
            } else {
                j jVar = this.c;
                if (jVar != null) {
                    jVar.cancel();
                }
            }
        }

        @Override // ivas.gov.bisp.enumeration.p083f.j
        public void cancel() {
            androidx.lifecycle.c cVar = (androidx.lifecycle.c) this.a;
            cVar.i("removeObserver");
            cVar.a.g(this);
            this.b.b.remove(this);
            j jVar = this.c;
            if (jVar != null) {
                jVar.cancel();
                this.c = null;
            }
        }
    }

    public class OooO00o implements j {
        public final c a;

        public OooO00o(c cVar) {
            this.a = cVar;
        }

        @Override // ivas.gov.bisp.enumeration.p083f.j
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public final void b(ivas.gov.bisp.enumeration.p027b.d dVar, c cVar) {
        d lifecycle = dVar.getLifecycle();
        if (((androidx.lifecycle.c) lifecycle).b == d.aMa.DESTROYED) {
            return;
        }
        cVar.b.add(new LifecycleOnBackPressedCancellable(lifecycle, cVar));
    }

    public final void c() {
        Iterator<c> itDescendingIterator = this.b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            c next = itDescendingIterator.next();
            if (next.a) {
                next.c();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
