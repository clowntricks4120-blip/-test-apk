package ivas.gov.bisp.enumeration.aD;

import ivas.gov.bisp.enumeration.o000O000.o00O00;
import ivas.gov.bisp.enumeration.o000O000.o00Ooo;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import ivas.gov.bisp.enumeration.o000O000.o0OoOo0;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class M extends o0OoOo0<S.bkK> {
    private static int a = 0;
    private static int b = 1;

    public final int d(Map.Entry<?, ?> entry) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 21;
        int i4 = (i2 | 21) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        Objects.requireNonNull((S.bkK) entry.getKey());
        int i8 = b;
        int i9 = ((i8 ^ 5) | (i8 & 5)) << 1;
        int i10 = -(((~i8) & 5) | (i8 & (-6)));
        int i11 = (i9 & i10) + (i10 | i9);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        int i14 = ((i12 | 19) << 1) - (i12 ^ 19);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final o00Ooo<S.bkK> f(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 89;
        int i4 = -(-((i2 ^ 89) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        o00Ooo<S.bkK> o00ooo = ((S.bkJ) obj).extensions;
        if (i6 == 0) {
            int i7 = 63 / 0;
        }
        return o00ooo;
    }

    public final o00Ooo<S.bkK> g(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 32) + ((i2 & 32) << 1)) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            return ((S.bkJ) obj).t();
        }
        ((S.bkJ) obj).t();
        throw null;
    }

    public final boolean i(aa aaVar) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 51;
        int i4 = ((~i3) & (i2 | 51)) + (i3 << 1);
        a = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            boolean z = aaVar instanceof S.bkJ;
            obj.hashCode();
            throw null;
        }
        boolean z2 = aaVar instanceof S.bkJ;
        int i5 = (-2) - (((i2 ^ 122) + ((i2 & 122) << 1)) ^ (-1));
        a = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    public final void c(AbstractC0069z abstractC0069z, Object obj, J j, o00Ooo<S.bkK> o00ooo) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 101;
        int i4 = i3 + ((i2 ^ 101) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        throw null;
    }

    public final Object e(J j, aa aaVar, int i) {
        int i2 = 2 % 2;
        Map<J.bjX, o0OOO0o.OooO<?, ?>> map = j.e;
        J.bjX bjx = new J.bjX(aaVar, i);
        int i3 = a;
        int i4 = (i3 & 97) + (i3 | 97);
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            map.get(bjx);
            obj.hashCode();
            throw null;
        }
        S.bkL bkl = map.get(bjx);
        int i5 = a;
        int i6 = (i5 & 115) + (i5 | 115);
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return bkl;
        }
        throw null;
    }

    public final void h(Object obj) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & 74) + (i2 | 74)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ((S.bkJ) obj).extensions.o();
        int i5 = a;
        int i6 = i5 & 5;
        int i7 = -(-((i5 ^ 5) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 33 / 0;
        }
    }

    public final <UT, UB> UB j(ag agVar, Object obj, J j, o00Ooo<S.bkK> o00ooo, UB ub, o00O00<UT, UB> o00o00) {
        int i = 2 % 2;
        int i2 = a + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(null);
        throw null;
    }

    public final void k(ag agVar, Object obj, J j, o00Ooo<S.bkK> o00ooo) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 111;
        int i4 = (((i2 ^ 111) | i3) << 1) - ((i2 | 111) & (~i3));
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = 78 / 0;
        throw null;
    }

    public final void l(InterfaceC0051g interfaceC0051g, Map.Entry<?, ?> entry) {
        int i = 2 % 2;
        int i2 = b + 103;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull((S.bkK) entry.getKey());
            throw null;
        }
        Objects.requireNonNull((S.bkK) entry.getKey());
        throw null;
    }
}
