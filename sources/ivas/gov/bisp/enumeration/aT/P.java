package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0037o;
import ivas.gov.bisp.enumeration.aC.J;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.S;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aX.x;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class P extends Oooo0<C0037o> {
    private static int a = 1;
    private static int b;

    public class bgq extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, C0037o> {
        private static int b = 1;
        private static int c;

        public bgq(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            x xVar = new x(((C0037o) obj).z().n());
            int i2 = c;
            int i3 = i2 | 97;
            int i4 = (i3 << 1) - ((~(i2 & 97)) & i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            return xVar;
        }
    }

    public P() {
        super(C0037o.class, new bgq(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-46)) | ((~i2) & 45)) - (~(-(-((i2 & 45) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 19;
        int i6 = (i2 ^ 19) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        int i8 = i7 % 2;
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final Oooo0.OooO00o<J, C0037o> e() {
        int i = 2 % 2;
        bgr bgrVar = new bgr(J.class);
        int i2 = a;
        int i3 = i2 & 27;
        int i4 = ((i2 ^ 27) | i3) << 1;
        int i5 = -((i2 | 27) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        return bgrVar;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            R.bdl bdlVar = R.bdl.e;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        R.bdl bdlVar2 = R.bdl.e;
        int i4 = b + 11;
        a = i4 % 128;
        int i5 = i4 % 2;
        return bdlVar2;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        a = i3 % 128;
        int i4 = i3 % 2;
        C0037o c0037oW = C0037o.w(abstractC0069z, ivas.gov.bisp.enumeration.aD.J.d());
        int i5 = b;
        int i6 = ((i5 & (-78)) | ((~i5) & 77)) + ((i5 & 77) << 1);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            return c0037oW;
        }
        throw null;
    }

    public final void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 & 90) + (i2 | 90)) - 1;
        a = i3 % 128;
        int i4 = i3 % 2;
        C0037o c0037o = (C0037o) aaVar;
        T.d(c0037o.A(), 0);
        int i5 = b;
        int i6 = i5 ^ 107;
        int i7 = -(-((i5 & 107) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        T.b(c0037o.z().size());
        int i10 = (-2) - ((a + 92) ^ (-1));
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    public class bgr extends Oooo0.OooO00o<J, C0037o> {
        private static int b = 0;
        private static int c = 1;

        public bgr(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = c + 62;
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                J.u(abstractC0069z, ivas.gov.bisp.enumeration.aD.J.d());
                obj.hashCode();
                throw null;
            }
            J jU = J.u(abstractC0069z, ivas.gov.bisp.enumeration.aD.J.d());
            int i4 = b;
            int i5 = i4 & 67;
            int i6 = -(-(i4 | 67));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            c = i7 % 128;
            if (i7 % 2 != 0) {
                return jU;
            }
            throw null;
        }

        public void e(aa aaVar) throws InvalidAlgorithmParameterException {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 ^ 39;
            int i4 = (((i2 & 39) | i3) << 1) - i3;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                T.b(((J) aaVar).w());
                int i5 = 45 / 0;
            } else {
                T.b(((J) aaVar).w());
            }
            int i6 = b;
            int i7 = (i6 & 13) + (i6 | 13);
            c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 64 / 0;
            }
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            int i2 = b + 73;
            c = i2 % 128;
            int i3 = i2 % 2;
            C0037o.bcd bcdVarX = C0037o.x();
            byte[] bArrB = Q.b(((J) aaVar).w());
            int i4 = b;
            int i5 = i4 & 59;
            int i6 = (i5 - (~((i4 ^ 59) | i5))) - 1;
            c = i6 % 128;
            AbstractC0069z abstractC0069zE = i6 % 2 == 0 ? AbstractC0069z.e(bArrB, 1, bArrB.length) : AbstractC0069z.e(bArrB, 0, bArrB.length);
            bcdVarX.f();
            C0037o c0037o = bcdVarX.d;
            int i7 = b + 105;
            c = i7 % 128;
            int i8 = i7 % 2;
            C0037o.v(c0037o, abstractC0069zE);
            Objects.requireNonNull(P.this);
            int i9 = c;
            int i10 = ((i9 | 34) << 1) - (i9 ^ 34);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            b = i11 % 128;
            int i12 = i11 % 2;
            bcdVarX.f();
            C0037o.t(bcdVarX.d, 0);
            S sC = bcdVarX.c();
            int i13 = b;
            int i14 = (i13 | 1) << 1;
            int i15 = -(i13 ^ 1);
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            c = i16 % 128;
            int i17 = i16 % 2;
            C0037o c0037o2 = (C0037o) sC;
            int i18 = i13 + 79;
            c = i18 % 128;
            int i19 = i18 % 2;
            return c0037o2;
        }
    }
}
