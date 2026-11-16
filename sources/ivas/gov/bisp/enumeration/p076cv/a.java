package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p069co.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends J {
    private static int a = 0;
    private static int b = 1;
    public final C0258a c;
    public final int d;
    public final j e;

    public a(int i, j jVar) {
        this.c = new C0258a(0L);
        this.d = i;
        this.e = jVar;
    }

    public a(Q q) {
        this.c = C0258a.p(q.u(0));
        this.d = C0258a.p(q.u(1)).y();
        this.e = j.h(q.u(2));
    }

    public static a h(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 37) + (i2 | 37);
        b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof a;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i4 = (i2 & 102) + (i2 | 102);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }
        if (obj == null) {
            int i7 = i2 & 95;
            int i8 = (i7 - (~(-(-((i2 ^ 95) | i7))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        a aVar2 = new a(Q.o(obj));
        int i10 = a;
        int i11 = i10 & 37;
        int i12 = i11 + ((i10 ^ 37) | i11);
        b = i12 % 128;
        if (i12 % 2 != 0) {
            return aVar2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(this.c);
        c0270p.c(new C0258a(this.d));
        c0270p.c(this.e);
        ac acVar = new ac(c0270p);
        int i2 = b;
        int i3 = i2 ^ 79;
        int i4 = (i2 & 79) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return acVar;
    }
}
