package ivas.gov.bisp.enumeration.H;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public boolean a;
    public aKS b;
    public boolean c;

    public interface aKS {
        void onCancel();
    }

    public final void c() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            aKS aks = this.b;
            if (aks != null) {
                try {
                    aks.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.c = false;
                notifyAll();
            }
        }
    }

    public final void d(aKS aks) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.b == aks) {
                return;
            }
            this.b = aks;
            if (this.a) {
                aks.onCancel();
            }
        }
    }
}
