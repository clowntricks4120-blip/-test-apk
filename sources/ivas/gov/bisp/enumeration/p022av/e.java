package ivas.gov.bisp.enumeration.p022av;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    private static int a = 0;
    private static int b = 1;
    public final /* synthetic */ M c;
    public final /* synthetic */ i d;

    public e(i iVar, M m) {
        this.d = iVar;
        this.c = m;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 23;
        int i4 = (i2 ^ 23) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                this.d.e.put(this.c);
                return;
            }
            this.d.e.put(this.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
