package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class g implements ivas.gov.bisp.enumeration.p027b.d {
    public static final g a = new g();
    public Handler f;
    public int c = 0;
    public int d = 0;
    public boolean e = true;
    public boolean g = true;
    public final c h = new c(this);
    public Runnable i = new aMd();
    public ReportFragment.OooO00o b = new aMe();

    public class aMd implements Runnable {
        public aMd() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if (gVar.d == 0) {
                gVar.e = true;
                gVar.h.j(d.aLZ.ON_PAUSE);
            }
            g gVar2 = g.this;
            if (gVar2.c == 0 && gVar2.e) {
                gVar2.h.j(d.aLZ.ON_STOP);
                gVar2.g = true;
            }
        }
    }

    public class aMe implements ReportFragment.OooO00o {
        public aMe() {
        }
    }

    public void c() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            if (!this.e) {
                this.f.removeCallbacks(this.i);
            } else {
                this.h.j(d.aLZ.ON_RESUME);
                this.e = false;
            }
        }
    }

    public void d() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1 && this.g) {
            this.h.j(d.aLZ.ON_START);
            this.g = false;
        }
    }

    @Override // ivas.gov.bisp.enumeration.p027b.d
    public d getLifecycle() {
        return this.h;
    }
}
