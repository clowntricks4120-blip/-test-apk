package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0035m;
import ivas.gov.bisp.enumeration.aC.N;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t extends Oooo0<N> {
    private static int a = 0;
    private static int b = 1;

    public class bgw extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, N> {
        private static int b = 0;
        private static int c = 1;

        public bgw(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.p053bz.l lVar = new ivas.gov.bisp.enumeration.p053bz.l(((N) obj).z().n(), 0);
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 64) + ((i2 & 64) << 1)) ^ (-1));
            c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 53 / 0;
            }
            return lVar;
        }
    }

    public t() {
        super(N.class, new bgw(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 7) << 1) - (((~i2) & 7) | (i2 & (-8)));
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        int i6 = i4 & 99;
        int i7 = (i6 - (~(-(-((i4 ^ 99) | i6))))) - 1;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
        }
        throw null;
    }

    public Oooo0.OooO00o<C0035m, N> e() {
        int i = 2 % 2;
        bgx bgxVar = new bgx(C0035m.class);
        int i2 = a;
        int i3 = i2 ^ 67;
        int i4 = ((i2 & 67) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        return bgxVar;
    }

    public R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 | 65;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 65)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        R.bdl bdlVar = R.bdl.e;
        int i8 = a;
        int i9 = i8 & 87;
        int i10 = -(-((i8 ^ 87) | i9));
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        b = i11 % 128;
        int i12 = i11 % 2;
        return bdlVar;
    }

    public aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 25;
        int i4 = ((i2 ^ 25) | i3) << 1;
        int i5 = -((i2 | 25) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            return N.w(abstractC0069z, J.d());
        }
        N.w(abstractC0069z, J.d());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
        b = i3 % 128;
        int i4 = i3 % 2;
        N n = (N) aaVar;
        T.d(n.A(), 0);
        int i5 = b;
        int i6 = i5 & 11;
        int i7 = (i5 ^ 11) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        a = i8 % 128;
        if (i8 % 2 == 0 ? n.z().size() != 32 : n.z().size() != 52) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        int i9 = b;
        int i10 = i9 & 99;
        int i11 = ((i9 | 99) & (~i10)) + (i10 << 1);
        a = i11 % 128;
        int i12 = i11 % 2;
    }

    public class bgx extends Oooo0.OooO00o<C0035m, N> {
        private static int b = 0;
        private static int c = 1;

        public bgx(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = b + 65;
            c = i2 % 128;
            int i3 = i2 % 2;
            C0035m c0035mT = C0035m.t(abstractC0069z, J.d());
            int i4 = c;
            int i5 = i4 & 61;
            int i6 = (i5 - (~(-(-((i4 ^ 61) | i5))))) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return c0035mT;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ /* synthetic */ void e(aa aaVar) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = ((i2 | 107) << 1) - (i2 ^ 107);
            int i4 = i3 % 128;
            b = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 & 39;
            int i6 = (i5 - (~((i4 ^ 39) | i5))) - 1;
            c = i6 % 128;
            int i7 = i6 % 2;
        }

        public Object c(aa aaVar) {
            AbstractC0069z abstractC0069zE;
            int i = 2 % 2;
            int i2 = c;
            int i3 = ((i2 ^ 126) + ((i2 & 126) << 1)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            N.bda bdaVarX = N.x();
            Objects.requireNonNull(t.this);
            int i5 = c;
            int i6 = ((((i5 ^ 31) | (i5 & 31)) << 1) - (~(-(((~i5) & 31) | (i5 & (-32)))))) - 1;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                bdaVarX.f();
                N.t(bdaVarX.d, 1);
            } else {
                bdaVarX.f();
                N.t(bdaVarX.d, 0);
            }
            int i7 = b;
            int i8 = i7 & 21;
            int i9 = -(-(i7 | 21));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            c = i10 % 128;
            if (i10 % 2 == 0) {
                byte[] bArrB = Q.b(57);
                abstractC0069zE = AbstractC0069z.e(bArrB, 0, bArrB.length);
            } else {
                byte[] bArrB2 = Q.b(32);
                abstractC0069zE = AbstractC0069z.e(bArrB2, 0, bArrB2.length);
            }
            bdaVarX.f();
            N.v(bdaVarX.d, abstractC0069zE);
            int i11 = b;
            int i12 = i11 ^ 89;
            int i13 = ((i11 & 89) | i12) << 1;
            int i14 = -i12;
            int i15 = (i13 & i14) + (i13 | i14);
            c = i15 % 128;
            int i16 = i15 % 2;
            N n = (N) bdaVarX.c();
            int i17 = c;
            int i18 = ((i17 & 39) - (~(i17 | 39))) - 1;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                return n;
            }
            throw null;
        }
    }
}
