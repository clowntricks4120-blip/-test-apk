package ivas.gov.bisp.enumeration.p022av;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.av.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0094m<T> {
    public final T a;
    public final r.bJP b;
    public final T c;
    public boolean d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.av.m$bar */
    public interface bar<T> {
        void b(T t);
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.av.m$bas */
    public interface bas {
        void b(T t);
    }

    public C0094m(T t, r.bJP bjp) {
        this.d = false;
        this.a = t;
        this.b = bjp;
        this.c = null;
    }

    public C0094m(T t) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = t;
    }
}
