package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p069co.j;

/* JADX INFO: loaded from: classes.dex */
public class o extends J {
    private static int a = 1;
    private static int b;
    public final C0258a c;
    public final int d;
    public final int e;
    public final j f;

    public o(int i, int i2, j jVar) {
        this.c = new C0258a(0L);
        this.d = i;
        this.e = i2;
        this.f = jVar;
    }

    public o(Q q) {
        this.c = C0258a.p(q.u(0));
        this.d = C0258a.p(q.u(1)).y();
        this.e = C0258a.p(q.u(2)).y();
        this.f = j.h(q.u(3));
    }

    public static o h(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-82)) | ((~i2) & 81);
        int i4 = (i2 & 81) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (obj instanceof o) {
            int i8 = (i6 | 79) << 1;
            int i9 = -(i6 ^ 79);
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            o oVar = (o) obj;
            int i12 = i6 & 41;
            int i13 = (((i6 | 41) & (~i12)) - (~(-(-(i12 << 1))))) - 1;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 99 / 0;
            }
            return oVar;
        }
        Object obj2 = null;
        if (obj != null) {
            o oVar2 = new o(Q.o(obj));
            int i15 = a;
            int i16 = (-2) - (((i15 & 96) + (i15 | 96)) ^ (-1));
            b = i16 % 128;
            if (i16 % 2 == 0) {
                return oVar2;
            }
            obj2.hashCode();
            throw null;
        }
        int i17 = ((i6 ^ 41) | (i6 & 41)) << 1;
        int i18 = -(((~i6) & 41) | (i6 & (-42)));
        int i19 = (i17 & i18) + (i17 | i18);
        b = i19 % 128;
        if (i19 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(this.c);
        c0270p.c(new C0258a(this.d));
        c0270p.c(new C0258a(this.e));
        c0270p.c(this.f);
        ac acVar = new ac(c0270p);
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = -(-(i2 | 113));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return acVar;
    }
}
