package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.AbstractC0276v;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.M;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.aj;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p064cj.c;
import ivas.gov.bisp.enumeration.p064cj.j;

/* JADX INFO: loaded from: classes.dex */
public class J extends ivas.gov.bisp.enumeration.p063ci.J {
    private static int a = 1;
    private static int b;
    public final byte[] c;
    public final int d;
    public final long e;
    public final long f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;

    public J(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = 0;
        this.e = j;
        this.h = j.c(bArr);
        this.g = j.c(bArr2);
        this.i = j.c(bArr3);
        this.j = j.c(bArr4);
        this.c = j.c(bArr5);
        this.f = -1L;
    }

    public J(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.d = 1;
        this.e = j;
        this.h = j.c(bArr);
        this.g = j.c(bArr2);
        this.i = j.c(bArr3);
        this.j = j.c(bArr4);
        this.c = j.c(bArr5);
        this.f = j2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        C0258a c0258a;
        int i = 2 % 2;
        C0270p c0270p = new C0270p(10);
        long j = this.f;
        int i2 = a;
        int i3 = i2 & 37;
        int i4 = (((i2 | 37) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (j >= 0) {
            c0258a = new C0258a(1L);
            int i5 = a;
            int i6 = ((i5 & 104) + (i5 | 104)) - 1;
            b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            c0258a = new C0258a(0L);
            int i8 = b + 51;
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 5;
            }
        }
        c0270p.c(c0258a);
        C0270p c0270p2 = new C0270p(10);
        c0270p2.c(new C0258a(this.e));
        c0270p2.c(new B(this.h));
        c0270p2.c(new B(this.g));
        c0270p2.c(new B(this.i));
        B b2 = new B(this.j);
        int i10 = a + 117;
        b = i10 % 128;
        int i11 = i10 % 2;
        c0270p2.c(b2);
        long j2 = this.f;
        if (j2 >= 0) {
            aj ajVar = new aj(false, 0, new C0258a(j2), 0);
            int i12 = b;
            int i13 = (i12 ^ 25) + ((i12 & 25) << 1);
            a = i13 % 128;
            if (i13 % 2 == 0) {
                c0270p2.c(ajVar);
                throw null;
            }
            c0270p2.c(ajVar);
        }
        c0270p.c(new ac(c0270p2));
        c0270p.c(new aj(true, 0, new B(this.c), 0));
        ac acVar = new ac(c0270p);
        int i14 = a;
        int i15 = i14 & 123;
        int i16 = (i14 | 123) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        b = i18 % 128;
        if (i18 % 2 == 0) {
            return acVar;
        }
        throw null;
    }

    public J(Q q) {
        i iVarU;
        long jZ;
        C0258a c0258aP = C0258a.p(q.u(0));
        if (!c0258aP.x(c.c) && !c0258aP.x(c.d)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.d = c0258aP.y();
        int size = q.size();
        int i = a;
        int i2 = i & 15;
        int i3 = i | 15;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        if (size != 2) {
            int i6 = i & 83;
            int i7 = (((i ^ 83) | i6) << 1) - ((i | 83) & (~i6));
            b = i7 % 128;
            if (i7 % 2 == 0 ? q.size() != 3 : q.size() != 2) {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        }
        Q qO = Q.o(q.u(1));
        i iVarU2 = qO.u(0);
        int i8 = a;
        int i9 = (i8 | 75) << 1;
        int i10 = -(((~i8) & 75) | (i8 & (-76)));
        int i11 = (i9 & i10) + (i10 | i9);
        b = i11 % 128;
        if (i11 % 2 != 0) {
            this.e = C0258a.p(iVarU2).z();
            iVarU = qO.u(1);
        } else {
            this.e = C0258a.p(iVarU2).z();
            iVarU = qO.u(1);
        }
        this.h = j.c(M.p(iVarU).c);
        int i12 = b + 79;
        a = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArr = M.p(qO.u(2)).c;
        int i14 = (-2) - ((a + 58) ^ (-1));
        b = i14 % 128;
        int i15 = i14 % 2;
        this.g = j.c(bArr);
        M mP = M.p(qO.u(3));
        int i16 = b + 125;
        a = i16 % 128;
        if (i16 % 2 == 0) {
            this.i = j.c(mP.c);
        } else {
            this.i = j.c(mP.c);
        }
        byte[] bArrC = j.c(M.p(qO.u(4)).c);
        int i17 = b;
        int i18 = (i17 & 53) + (i17 | 53);
        a = i18 % 128;
        int i19 = i18 % 2;
        this.j = bArrC;
        Object obj = null;
        if (qO.size() == 6) {
            int i20 = b;
            int i21 = i20 ^ 7;
            int i22 = -(-((i20 & 7) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            AbstractC0276v abstractC0276vO = AbstractC0276v.o(qO.u(5));
            if (abstractC0276vO.c != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            int i25 = a + 10;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            b = i26 % 128;
            int i27 = i26 % 2;
            jZ = C0258a.o(abstractC0276vO, false).z();
            int i28 = a;
            int i29 = (i28 ^ 117) + ((i28 & 117) << 1);
            b = i29 % 128;
            if (i29 % 2 == 0) {
                int i30 = 2 % 2;
            }
        } else {
            if (qO.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            int i31 = b;
            int i32 = (i31 ^ 33) + ((i31 & 33) << 1);
            int i33 = i32 % 128;
            a = i33;
            if (i32 % 2 == 0) {
                throw null;
            }
            int i34 = i33 & 1;
            int i35 = (i33 | 1) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
            b = i37 % 128;
            int i38 = i37 % 2;
            int i39 = 2 % 2;
            jZ = -1;
        }
        this.f = jZ;
        if (q.size() != 3) {
            this.c = null;
            int i40 = b;
            int i41 = i40 & 51;
            int i42 = -(-((i40 ^ 51) | i41));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            a = i43 % 128;
            int i44 = i43 % 2;
            return;
        }
        int i45 = b;
        int i46 = ((i45 | 77) << 1) - (i45 ^ 77);
        a = i46 % 128;
        int i47 = i46 % 2;
        byte[] bArr2 = M.o(AbstractC0276v.o(q.u(2)), true).c;
        int i48 = a;
        int i49 = (i48 ^ 23) + ((i48 & 23) << 1);
        b = i49 % 128;
        int i50 = i49 % 2;
        byte[] bArrC2 = j.c(bArr2);
        if (i50 != 0) {
            this.c = bArrC2;
            obj.hashCode();
            throw null;
        }
        this.c = bArrC2;
        int i51 = b;
        int i52 = ((i51 | 95) << 1) - (i51 ^ 95);
        a = i52 % 128;
        int i53 = i52 % 2;
    }
}
