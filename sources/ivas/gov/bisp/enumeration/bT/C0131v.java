package ivas.gov.bisp.enumeration.bT;

import ivas.gov.bisp.enumeration.o000ooO.o0O0O00;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.bT.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131v<T> implements o0O0O00<T> {
    private static int a = 1;
    private static int b;
    public final AtomicReference<o0O0O00<T>> c;

    public C0131v(o0O0O00<? extends T> o0o0o00) {
        this.c = new AtomicReference<>(o0o0o00);
    }

    public final Iterator<T> iterator() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 83;
        int i4 = (i2 | 83) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        a = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            this.c.getAndSet(null);
            obj.hashCode();
            throw null;
        }
        A andSet = this.c.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        Iterator<T> it = andSet.iterator();
        int i7 = b;
        int i8 = (i7 & 37) + (i7 | 37);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return it;
        }
        throw null;
    }
}
