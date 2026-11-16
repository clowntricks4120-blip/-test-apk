package ivas.gov.bisp.enumeration.p076cv;

import ivas.gov.bisp.enumeration.p063ci.AbstractC0276v;
import ivas.gov.bisp.enumeration.p063ci.B;
import ivas.gov.bisp.enumeration.p063ci.C0258a;
import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.aj;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p064cj.c;
import ivas.gov.bisp.enumeration.p064cj.j;

/* JADX INFO: loaded from: classes.dex */
public class M extends J {
    private static int a = 0;
    private static int b = 1;
    public final byte[] c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final int j;

    public M(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = 0;
        this.e = i;
        this.f = j.c(bArr);
        this.h = j.c(bArr2);
        this.g = j.c(bArr3);
        this.i = j.c(bArr4);
        this.c = j.c(bArr5);
        this.j = -1;
    }

    public M(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.d = 1;
        this.e = i;
        this.f = j.c(bArr);
        this.h = j.c(bArr2);
        this.g = j.c(bArr3);
        this.i = j.c(bArr4);
        this.c = j.c(bArr5);
        this.j = i2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        C0258a c0258a;
        int i;
        int i2 = 2 % 2;
        C0270p c0270p = new C0270p(10);
        if (this.j >= 0) {
            c0258a = new C0258a(1L);
            i = b + 83;
            a = i % 128;
        } else {
            c0258a = new C0258a(0L);
            int i3 = a;
            int i4 = i3 & 5;
            i = ((i3 | 5) & (~i4)) + (i4 << 1);
            b = i % 128;
        }
        int i5 = i % 2;
        c0270p.c(c0258a);
        C0270p c0270p2 = new C0270p(10);
        c0270p2.c(new C0258a(this.e));
        c0270p2.c(new B(this.f));
        c0270p2.c(new B(this.h));
        c0270p2.c(new B(this.g));
        c0270p2.c(new B(this.i));
        int i6 = a;
        int i7 = (i6 ^ 118) + ((i6 & 118) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        int i9 = this.j;
        if (i9 >= 0) {
            aj ajVar = new aj(false, 0, new C0258a(i9), 0);
            int i10 = b;
            int i11 = (i10 ^ 73) + ((i10 & 73) << 1);
            a = i11 % 128;
            int i12 = i11 % 2;
            c0270p2.c(ajVar);
            int i13 = a;
            int i14 = (((i13 | 120) << 1) - (i13 ^ 120)) - 1;
            b = i14 % 128;
            int i15 = i14 % 2;
        }
        c0270p.c(new ac(c0270p2));
        c0270p.c(new aj(true, 0, new B(this.c), 0));
        ac acVar = new ac(c0270p);
        int i16 = b;
        int i17 = i16 & 31;
        int i18 = (i16 | 31) & (~i17);
        int i19 = -(-(i17 << 1));
        int i20 = (i18 & i19) + (i18 | i19);
        a = i20 % 128;
        int i21 = i20 % 2;
        return acVar;
    }

    public M(Q q) {
        i iVarU;
        int i;
        int iY;
        C0258a c0258aP = C0258a.p(q.u(0));
        if (!c0258aP.x(c.c) && !c0258aP.x(c.d)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.d = c0258aP.y();
        if (q.size() != 2) {
            int i2 = a;
            int i3 = i2 & 107;
            int i4 = ((((i2 ^ 107) | i3) << 1) - (~(-((i2 | 107) & (~i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (q.size() != 3) {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        }
        Q qO = Q.o(q.u(1));
        i iVarU2 = qO.u(0);
        int i6 = b;
        int i7 = ((i6 & 41) - (~(-(-(i6 | 41))))) - 1;
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.e = C0258a.p(iVarU2).y();
            iVarU = qO.u(0);
        } else {
            this.e = C0258a.p(iVarU2).y();
            iVarU = qO.u(1);
        }
        this.f = j.c(ivas.gov.bisp.enumeration.p063ci.M.p(iVarU).c);
        int i8 = b;
        int i9 = i8 | 43;
        int i10 = ((i9 << 1) - (~(-((~(i8 & 43)) & i9)))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = ivas.gov.bisp.enumeration.p063ci.M.p(qO.u(2)).c;
        int i12 = b;
        int i13 = (i12 & 49) + (i12 | 49);
        a = i13 % 128;
        int i14 = i13 % 2;
        this.h = j.c(bArr);
        ivas.gov.bisp.enumeration.p063ci.M mP = ivas.gov.bisp.enumeration.p063ci.M.p(qO.u(3));
        int i15 = b;
        int i16 = (i15 ^ 13) + ((i15 & 13) << 1);
        a = i16 % 128;
        if (i16 % 2 != 0) {
            this.g = j.c(mP.c);
            i = 3;
        } else {
            this.g = j.c(mP.c);
            i = 4;
        }
        int i17 = a;
        int i18 = i17 & 73;
        int i19 = (i18 - (~((i17 ^ 73) | i18))) - 1;
        b = i19 % 128;
        Object obj = null;
        if (i19 % 2 == 0) {
            j.c(ivas.gov.bisp.enumeration.p063ci.M.p(qO.u(i)).c);
            obj.hashCode();
            throw null;
        }
        this.i = j.c(ivas.gov.bisp.enumeration.p063ci.M.p(qO.u(i)).c);
        if (qO.size() == 6) {
            int i20 = b;
            int i21 = (i20 ^ 123) + ((i20 & 123) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            AbstractC0276v abstractC0276vO = AbstractC0276v.o(qO.u(5));
            if (abstractC0276vO.c != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            int i23 = b;
            int i24 = ((i23 ^ 107) | (i23 & 107)) << 1;
            int i25 = -((107 & (~i23)) | (i23 & (-108)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            a = i26 % 128;
            int i27 = i26 % 2;
            iY = C0258a.o(abstractC0276vO, false).y();
            int i28 = 2 % 2;
        } else {
            if (qO.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            int i29 = b;
            int i30 = ((i29 | 111) << 1) - (i29 ^ 111);
            a = i30 % 128;
            int i31 = i30 % 2;
            int i32 = (i29 & 65) + (i29 | 65);
            a = i32 % 128;
            int i33 = i32 % 2;
            int i34 = 2 % 2;
            iY = -1;
        }
        this.j = iY;
        if (q.size() != 3) {
            this.c = null;
            int i35 = a;
            int i36 = i35 & 65;
            int i37 = i36 + ((i35 ^ 65) | i36);
            b = i37 % 128;
            if (i37 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i38 = b;
        int i39 = (i38 & (-74)) | ((~i38) & 73);
        int i40 = (i38 & 73) << 1;
        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
        a = i41 % 128;
        int i42 = i41 % 2;
        ivas.gov.bisp.enumeration.p063ci.M mO = ivas.gov.bisp.enumeration.p063ci.M.o(AbstractC0276v.o(q.u(2)), true);
        int i43 = b;
        int i44 = i43 & 85;
        int i45 = (i43 | 85) & (~i44);
        int i46 = i44 << 1;
        int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
        a = i47 % 128;
        if (i47 % 2 != 0) {
            this.c = j.c(mO.c);
            throw null;
        }
        this.c = j.c(mO.c);
        int i48 = a;
        int i49 = (i48 & (-20)) | ((~i48) & 19);
        int i50 = -(-((i48 & 19) << 1));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        b = i51 % 128;
        int i52 = i51 % 2;
    }
}
