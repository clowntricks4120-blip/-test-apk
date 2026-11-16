package ivas.gov.bisp.enumeration.p035bh;

import ivas.gov.bisp.enumeration.o000O0o.o000O000;
import ivas.gov.bisp.enumeration.p032be.c;
import ivas.gov.bisp.enumeration.p032be.j;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class am extends o000O000<AtomicLong> {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ ad c;

    public am(ad adVar) {
        this.c = adVar;
    }

    public Object c(j jVar) {
        int i = 2 % 2;
        AtomicLong atomicLong = new AtomicLong(((Number) this.c.c(jVar)).longValue());
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = (i3 - (~((i2 ^ 97) | i3))) - 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return atomicLong;
        }
        throw null;
    }

    public void d(c cVar, Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        ad adVar = this.c;
        int i6 = (i4 & 43) + (i4 | 43);
        a = i6 % 128;
        int i7 = i6 % 2;
        Long lValueOf = Long.valueOf(((AtomicLong) obj).get());
        if (i7 != 0) {
            adVar.d(cVar, lValueOf);
            return;
        }
        adVar.d(cVar, lValueOf);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
