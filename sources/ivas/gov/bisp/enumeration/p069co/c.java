package ivas.gov.bisp.enumeration.p069co;

import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.K;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.i;
import ivas.gov.bisp.enumeration.p091n.j;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public class c extends J {
    private static int a = 1;
    private static int b;
    public j c;
    public K d;

    public c(Q q) {
        if (q.size() != 2) {
            StringBuilder sbW = j.w("Bad sequence size: ");
            sbW.append(q.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        Enumeration enumerationR = q.r();
        j jVarH = j.h(enumerationR.nextElement());
        int i = b;
        int i2 = (i & 61) + (i | 61);
        a = i2 % 128;
        int i3 = i2 % 2;
        this.c = jVarH;
        Object objNextElement = enumerationR.nextElement();
        if (i3 == 0) {
            this.d = K.q(objNextElement);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.d = K.q(objNextElement);
        int i4 = b;
        int i5 = ((i4 & 11) - (~(-(-(i4 | 11))))) - 1;
        a = i5 % 128;
        int i6 = i5 % 2;
    }

    public c(j jVar, i iVar) {
        this.d = new K(iVar);
        this.c = jVar;
    }

    public c(j jVar, byte[] bArr) {
        this.d = new K(bArr);
        this.c = jVar;
    }

    public static c h(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 83;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (obj instanceof c) {
            int i6 = (((i4 ^ 17) | (i4 & 17)) << 1) - ((i4 & (-18)) | ((~i4) & 17));
            b = i6 % 128;
            int i7 = i6 % 2;
            c cVar = (c) obj;
            int i8 = i4 ^ 109;
            int i9 = -(-((i4 & 109) << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 32 / 0;
            }
            return cVar;
        }
        if (obj == null) {
            int i12 = i2 + 121;
            a = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 52 / 0;
            }
            return null;
        }
        c cVar2 = new c(Q.o(obj));
        int i14 = b;
        int i15 = ((i14 | 121) << 1) - (i14 ^ 121);
        a = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 2 / 0;
        }
        return cVar2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(2);
        c0270p.c(this.c);
        c0270p.c(this.d);
        ac acVar = new ac(c0270p);
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = ((i2 | 49) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        return acVar;
    }

    public O j() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            O.c(this.d.p());
            throw null;
        }
        O oC = O.c(this.d.p());
        int i4 = b + 113;
        a = i4 % 128;
        int i5 = i4 % 2;
        return oC;
    }
}
