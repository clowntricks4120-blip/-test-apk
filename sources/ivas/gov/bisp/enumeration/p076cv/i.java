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
public class i extends J {
    private static int a = 0;
    private static int b = 1;
    public final int c;
    public final int d;
    public final j e;
    public final ivas.gov.bisp.enumeration.p069co.j f;

    public i(int i, int i2, j jVar, ivas.gov.bisp.enumeration.p069co.j jVar2) {
        this.c = i;
        this.d = i2;
        this.e = new j(jVar.e());
        this.f = jVar2;
    }

    public i(Q q) {
        this.c = ((C0258a) q.u(0)).y();
        this.d = ((C0258a) q.u(1)).y();
        this.e = new j(((M) q.u(2)).c);
        this.f = ivas.gov.bisp.enumeration.p069co.j.h(q.u(3));
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(new C0258a(this.c));
        c0270p.c(new C0258a(this.d));
        c0270p.c(new B(this.e.e()));
        c0270p.c(this.f);
        ac acVar = new ac(c0270p);
        int i2 = a + 14;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        return acVar;
    }
}
