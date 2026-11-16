package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p069co.j;

/* JADX INFO: loaded from: classes.dex */
public class l extends J {
    private static int a = 1;
    private static int b;
    public final C0258a c;
    public final j d;

    public l(Q q) {
        this.c = C0258a.p(q.u(0));
        this.d = j.h(q.u(1));
    }

    public l(j jVar) {
        this.c = new C0258a(0L);
        this.d = jVar;
    }

    public static final l h(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 49) | (i2 & 49)) << 1;
        int i4 = -((i2 & (-50)) | ((~i2) & 49));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            boolean z = obj instanceof l;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            int i6 = i2 & 111;
            int i7 = i6 + ((i2 ^ 111) | i6);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return lVar;
            }
            throw null;
        }
        if (obj == null) {
            int i8 = i2 + 32;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }
        l lVar2 = new l(Q.o(obj));
        int i11 = a;
        int i12 = (((i11 ^ 19) | (i11 & 19)) << 1) - (((~i11) & 19) | (i11 & (-20)));
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return lVar2;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(this.c);
        c0270p.c(this.d);
        ac acVar = new ac(c0270p);
        int i2 = a;
        int i3 = ((i2 | 67) << 1) - (i2 ^ 67);
        b = i3 % 128;
        int i4 = i3 % 2;
        return acVar;
    }
}
