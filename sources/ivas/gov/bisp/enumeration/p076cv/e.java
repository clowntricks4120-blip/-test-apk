package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.cK.c;
import ivas.gov.bisp.enumeration.cK.r;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p069co.j;

/* JADX INFO: loaded from: classes.dex */
public class e extends J {
    private static int a = 1;
    private static int b;
    public int c;
    public int d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public j h;

    public e(int i, int i2, c cVar, ivas.gov.bisp.enumeration.cK.e eVar, r rVar, j jVar) {
        this.c = i;
        this.d = i2;
        this.e = cVar.c();
        this.g = eVar.k();
        this.f = rVar.c();
        this.h = jVar;
    }

    public e(Q q) {
        this.c = ((C0258a) q.u(0)).y();
        this.d = ((C0258a) q.u(1)).y();
        this.e = ((M) q.u(2)).c;
        this.g = ((M) q.u(3)).c;
        this.f = ((M) q.u(4)).c;
        this.h = j.h(q.u(5));
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(new C0258a(this.c));
        c0270p.c(new C0258a(this.d));
        c0270p.c(new B(this.e));
        c0270p.c(new B(this.g));
        c0270p.c(new B(this.f));
        c0270p.c(this.h);
        ac acVar = new ac(c0270p);
        int i2 = a;
        int i3 = (((i2 | 54) << 1) - (i2 ^ 54)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        return acVar;
    }
}
