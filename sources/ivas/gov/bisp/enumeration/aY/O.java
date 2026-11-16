package ivas.gov.bisp.enumeration.aY;

import ivas.gov.bisp.enumeration.aC.C0043x;
import ivas.gov.bisp.enumeration.aC.M;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.InterfaceC0081t;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.z;
import ivas.gov.bisp.enumeration.p091n.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Oooo0<C0043x> {
    private static int a = 0;
    private static int b = 1;

    public class bhy extends Oooo0.OooO0O0<InterfaceC0081t, C0043x> {
        private static int b = 1;
        private static int c;

        public bhy(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            z zVar = new z(((C0043x) obj).z().n());
            int i2 = c;
            int i3 = ((i2 ^ 27) | (i2 & 27)) << 1;
            int i4 = -(((~i2) & 27) | (i2 & (-28)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return zVar;
        }
    }

    public class bhz extends Oooo0.OooO00o<M, C0043x> {
        private static int b = 1;
        private static int c;

        public bhz(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 43;
            int i4 = (((i2 | 43) & (~i3)) - (~(i3 << 1))) - 1;
            c = i4 % 128;
            int i5 = i4 % 2;
            M mW = M.w(abstractC0069z, J.d());
            int i6 = c + 37;
            b = i6 % 128;
            int i7 = i6 % 2;
            return mW;
        }

        public void e(aa aaVar) throws InvalidAlgorithmParameterException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
            c = i3 % 128;
            int i4 = i3 % 2;
            M m = (M) aaVar;
            if (m.y() != 64) {
                StringBuilder sbW = j.w("invalid key size: ");
                sbW.append(m.y());
                sbW.append(". Valid keys must have 64 bytes.");
                throw new InvalidAlgorithmParameterException(sbW.toString());
            }
            int i5 = c;
            int i6 = (i5 ^ 21) + ((i5 & 21) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
        }

        public Object c(aa aaVar) {
            C0043x.bdu bduVarX;
            byte[] bArrB;
            C0043x c0043x;
            int i = 2 % 2;
            int i2 = b + 105;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                bduVarX = C0043x.x();
                bArrB = ivas.gov.bisp.enumeration.p053bz.Q.b(((M) aaVar).y());
                int i3 = 97 / 0;
            } else {
                bduVarX = C0043x.x();
                bArrB = ivas.gov.bisp.enumeration.p053bz.Q.b(((M) aaVar).y());
            }
            int i4 = b;
            int i5 = ((i4 ^ 46) + ((i4 & 46) << 1)) - 1;
            c = i5 % 128;
            AbstractC0069z abstractC0069zE = i5 % 2 != 0 ? AbstractC0069z.e(bArrB, 1, bArrB.length) : AbstractC0069z.e(bArrB, 0, bArrB.length);
            bduVarX.f();
            C0043x.v(bduVarX.d, abstractC0069zE);
            O o2 = O.this;
            int i6 = b;
            int i7 = i6 & 125;
            int i8 = (i7 - (~((i6 ^ 125) | i7))) - 1;
            c = i8 % 128;
            if (i8 % 2 != 0) {
                Objects.requireNonNull(o2);
                bduVarX.f();
                c0043x = bduVarX.d;
                int i9 = 24 / 0;
            } else {
                Objects.requireNonNull(o2);
                bduVarX.f();
                c0043x = bduVarX.d;
            }
            int i10 = (-2) - ((c + 62) ^ (-1));
            b = i10 % 128;
            if (i10 % 2 == 0) {
                C0043x.t(c0043x, 0);
            } else {
                C0043x.t(c0043x, 0);
            }
            return (C0043x) bduVarX.c();
        }
    }

    public O() {
        super(C0043x.class, new bhy(InterfaceC0081t.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 41;
        int i4 = i3 + ((i2 ^ 41) | i3);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 == 0) {
            int i6 = 94 / 0;
        }
        int i7 = i5 + 79;
        a = i7 % 128;
        if (i7 % 2 == 0) {
            return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Oooo0.OooO00o<M, C0043x> e() {
        int i = 2 % 2;
        bhz bhzVar = new bhz(M.class);
        int i2 = b + 85;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return bhzVar;
        }
        throw null;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 83) | (i2 & 83)) << 1) - (~(-(((~i2) & 83) | (i2 & (-84)))))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            R.bdl bdlVar = R.bdl.e;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        R.bdl bdlVar2 = R.bdl.e;
        int i4 = b;
        int i5 = i4 & 1;
        int i6 = ((((i4 ^ 1) | i5) << 1) - (~(-((i4 | 1) & (~i5))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return bdlVar2;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b + 117;
        a = i2 % 128;
        int i3 = i2 % 2;
        C0043x c0043xW = C0043x.w(abstractC0069z, J.d());
        int i4 = b;
        int i5 = i4 & 75;
        int i6 = (((i4 | 75) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        a = i6 % 128;
        int i7 = i6 % 2;
        return c0043xW;
    }

    public final void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 24) << 1) - (i2 ^ 24)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        C0043x c0043x = (C0043x) aaVar;
        ivas.gov.bisp.enumeration.p053bz.T.d(c0043x.A(), 0);
        int i5 = a;
        int i6 = (((i5 & (-118)) | ((~i5) & 117)) - (~(-(-((i5 & 117) << 1))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0 ? c0043x.z().size() != 64 : c0043x.z().size() != 7) {
            StringBuilder sbW = j.w("invalid key size: ");
            sbW.append(c0043x.z().size());
            sbW.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sbW.toString());
        }
        int i7 = a;
        int i8 = (((i7 | 6) << 1) - (i7 ^ 6)) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
    }
}
