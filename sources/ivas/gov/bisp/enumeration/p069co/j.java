package ivas.gov.bisp.enumeration.p069co;

import ivas.gov.bisp.enumeration.p063ci.C0270p;
import ivas.gov.bisp.enumeration.p063ci.C0278x;
import ivas.gov.bisp.enumeration.p063ci.J;
import ivas.gov.bisp.enumeration.p063ci.O;
import ivas.gov.bisp.enumeration.p063ci.Q;
import ivas.gov.bisp.enumeration.p063ci.ac;
import ivas.gov.bisp.enumeration.p063ci.i;

/* JADX INFO: loaded from: classes.dex */
public class j extends J {
    private static int a = 1;
    private static int b;
    public C0278x c;
    public i d;

    public j(Q q) {
        i iVarU;
        if (q.size() <= 0 || q.size() > 2) {
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("Bad sequence size: ");
            sbW.append(q.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        int i = a;
        int i2 = ((i ^ 23) - (~((i & 23) << 1))) - 1;
        b = i2 % 128;
        this.c = i2 % 2 != 0 ? C0278x.o(q.u(1)) : C0278x.o(q.u(0));
        int size = q.size();
        int i3 = b;
        int i4 = (i3 ^ 65) + ((i3 & 65) << 1);
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0 ? size != 2 : size != 2) {
            int i6 = (-2) - ((i5 + 40) ^ (-1));
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            iVarU = null;
        } else {
            iVarU = q.u(1);
            int i9 = b;
            int i10 = ((i9 ^ 31) - (~((i9 & 31) << 1))) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        }
        this.d = iVarU;
        int i12 = a;
        int i13 = i12 | 109;
        int i14 = i13 << 1;
        int i15 = -((~(i12 & 109)) & i13);
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
    }

    public j(C0278x c0278x) {
        this.c = c0278x;
    }

    public j(C0278x c0278x, i iVar) {
        this.c = c0278x;
        this.d = iVar;
    }

    public static j h(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = -(-((i2 ^ 53) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        a = i6;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            boolean z = obj instanceof j;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof j) {
            int i7 = i6 + 1;
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            j jVar = (j) obj;
            int i10 = i8 | 67;
            int i11 = (i10 << 1) - ((~(i8 & 67)) & i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            return jVar;
        }
        if (obj == null) {
            int i13 = ((i2 ^ 95) - (~(-(-((i2 & 95) << 1))))) - 1;
            a = i13 % 128;
            if (i13 % 2 != 0) {
                return null;
            }
            throw null;
        }
        j jVar2 = new j(Q.o(obj));
        int i14 = a;
        int i15 = i14 & 107;
        int i16 = (i14 ^ 107) | i15;
        int i17 = (i15 & i16) + (i16 | i15);
        b = i17 % 128;
        int i18 = i17 % 2;
        return jVar2;
    }

    @Override // ivas.gov.bisp.enumeration.p063ci.J, ivas.gov.bisp.enumeration.p063ci.i
    public O f() {
        int i = 2 % 2;
        C0270p c0270p = new C0270p(2);
        C0278x c0278x = this.c;
        int i2 = b + 102;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        a = i3 % 128;
        int i4 = i3 % 2;
        c0270p.c(c0278x);
        i iVar = this.d;
        if (iVar != null) {
            int i5 = a;
            int i6 = i5 & 109;
            int i7 = (i5 | 109) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            c0270p.c(iVar);
            if (i10 != 0) {
                throw null;
            }
        }
        ac acVar = new ac(c0270p);
        int i11 = a;
        int i12 = (i11 & (-2)) | ((~i11) & 1);
        int i13 = -(-((i11 & 1) << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 10 / 0;
        }
        return acVar;
    }
}
