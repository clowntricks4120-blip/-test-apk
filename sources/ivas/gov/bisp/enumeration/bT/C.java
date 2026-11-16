package ivas.gov.bisp.enumeration.bT;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Iterable<Object> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ A c;

    public C(A a2) {
        this.c = a2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        A a2 = this.c;
        if (i4 == 0) {
            return a2.iterator();
        }
        a2.iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
