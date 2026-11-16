package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.cK.c;
import ivas.gov.bisp.enumeration.cK.e;
import ivas.gov.bisp.enumeration.cK.j;
import ivas.gov.bisp.enumeration.cK.r;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.cv.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0281p extends J {
    private static int a = 0;
    private static int b = 1;
    public int c;
    public int d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;

    public C0281p(int i, int i2, c cVar, e eVar, r rVar, r rVar2, j jVar) {
        this.c = i;
        this.d = i2;
        this.e = cVar.c();
        this.g = eVar.k();
        this.f = jVar.e();
        this.h = rVar.c();
        this.i = rVar2.c();
    }

    public C0281p(Q q) {
        this.c = ((C0258a) q.u(0)).y();
        this.d = ((C0258a) q.u(1)).y();
        this.e = ((M) q.u(2)).c;
        this.g = ((M) q.u(3)).c;
        this.h = ((M) q.u(4)).c;
        this.i = ((M) q.u(5)).c;
        this.f = ((M) q.u(6)).c;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(new C0258a(this.c));
        c0270p.c(new C0258a(this.d));
        c0270p.c(new B(this.e));
        c0270p.c(new B(this.g));
        c0270p.c(new B(this.h));
        c0270p.c(new B(this.i));
        c0270p.c(new B(this.f));
        ac acVar = new ac(c0270p);
        int i2 = a;
        int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return acVar;
        }
        throw null;
    }
}
