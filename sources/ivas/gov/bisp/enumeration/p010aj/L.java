package ivas.gov.bisp.enumeration.p010aj;

/* JADX INFO: loaded from: classes.dex */
public class L<T> extends S {
    public final Object a;

    public L(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // ivas.gov.bisp.enumeration.p010aj.S
    public T e() {
        T t;
        synchronized (this.a) {
            t = (T) super.e();
        }
        return t;
    }

    @Override // ivas.gov.bisp.enumeration.p010aj.S
    public boolean g(T t) {
        boolean zG;
        synchronized (this.a) {
            zG = super.g(t);
        }
        return zG;
    }
}
