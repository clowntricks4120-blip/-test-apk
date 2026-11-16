package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.cK.j;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;

/* JADX INFO: loaded from: classes.dex */
public class z extends J {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final int d;
    public final j e;

    public z(int i, int i2, j jVar) {
        this.c = i;
        this.d = i2;
        this.e = new j(jVar);
    }

    public z(Q q) {
        this.c = ((C0258a) q.u(0)).y();
        this.d = ((C0258a) q.u(1)).y();
        this.e = new j(((M) q.u(2)).c);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(new C0258a(this.c));
        c0270p.c(new C0258a(this.d));
        c0270p.c(new B(this.e.e()));
        ac acVar = new ac(c0270p);
        int i2 = b;
        int i3 = ((i2 ^ 101) | (i2 & 101)) << 1;
        int i4 = -(((~i2) & 101) | (i2 & (-102)));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return acVar;
    }
}
