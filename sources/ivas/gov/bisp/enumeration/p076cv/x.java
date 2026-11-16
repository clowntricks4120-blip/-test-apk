package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p064cj.j;

/* JADX INFO: loaded from: classes.dex */
public class x extends J {
    private static int a = 1;
    private static int b;
    public final byte[] c;
    public final byte[] d;

    public x(byte[] bArr, byte[] bArr2) {
        this.c = j.c(bArr);
        this.d = j.c(bArr2);
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        c0270p.c(new C0258a(0L));
        c0270p.c(new B(this.c));
        c0270p.c(new B(this.d));
        ac acVar = new ac(c0270p);
        int i2 = a;
        int i3 = i2 & 83;
        int i4 = i3 + ((i2 ^ 83) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        return acVar;
    }
}
