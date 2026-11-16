package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0041t;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aT.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0082p extends Oooo0<ivas.gov.bisp.enumeration.aC.P> {
    private static int a = 0;
    private static int b = 1;

    public C0082p() {
        super(ivas.gov.bisp.enumeration.aC.P.class, new bgn(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-54)) | ((~i2) & 53);
        int i4 = (i2 & 53) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 & 81;
        int i8 = (i2 ^ 81) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return "type.googleapis.com/google.crypto.tink.AesEaxKey";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Oooo0.OooO00o<C0041t, ivas.gov.bisp.enumeration.aC.P> e() {
        int i = 2 % 2;
        bgo bgoVar = new bgo(C0041t.class);
        int i2 = a;
        int i3 = ((i2 | 102) << 1) - (i2 ^ 102);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return bgoVar;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
        b = i3 % 128;
        int i4 = i3 % 2;
        R.bdl bdlVar = R.bdl.e;
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
        return bdlVar;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        a = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aC.P pY = ivas.gov.bisp.enumeration.aC.P.y(abstractC0069z, J.d());
        int i5 = a;
        int i6 = ((i5 & 81) - (~(-(-(i5 | 81))))) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return pY;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aT.p$bgn */
    public class bgn extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, ivas.gov.bisp.enumeration.aC.P> {
        private static int b = 1;
        private static int c;

        public bgn(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.aC.P p = (ivas.gov.bisp.enumeration.aC.P) obj;
            ivas.gov.bisp.enumeration.p053bz.i iVar = new ivas.gov.bisp.enumeration.p053bz.i(p.A().n(), p.F().w());
            int i2 = b + 85;
            c = i2 % 128;
            int i3 = i2 % 2;
            return iVar;
        }
    }

    public final void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = (i2 | 77) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        b = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.aC.P p = (ivas.gov.bisp.enumeration.aC.P) aaVar;
        T.d(p.E(), 0);
        int i8 = b;
        int i9 = i8 ^ 111;
        int i10 = ((((i8 & 111) | i9) << 1) - (~(-i9))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        T.b(p.A().size());
        ivas.gov.bisp.enumeration.aC.u uVarF = p.F();
        int i12 = a;
        int i13 = i12 & 31;
        int i14 = -(-((i12 ^ 31) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        b = i15 % 128;
        if (i15 % 2 != 0 ? uVarF.w() != 12 : uVarF.w() != 112) {
            if (p.F().w() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
        int i16 = a;
        int i17 = i16 & 119;
        int i18 = (((i16 ^ 119) | i17) << 1) - ((i16 | 119) & (~i17));
        b = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aT.p$bgo */
    public class bgo extends Oooo0.OooO00o<C0041t, ivas.gov.bisp.enumeration.aC.P> {
        private static int b = 1;
        private static int c;

        public bgo(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 121;
            int i4 = -(-((i2 ^ 121) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            c = i5 % 128;
            if (i5 % 2 != 0) {
                C0041t.u(abstractC0069z, J.d());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            C0041t c0041tU = C0041t.u(abstractC0069z, J.d());
            int i6 = c;
            int i7 = (i6 & 125) + (i6 | 125);
            b = i7 % 128;
            int i8 = i7 % 2;
            return c0041tU;
        }

        public void e(aa aaVar) throws GeneralSecurityException {
            C0041t c0041t;
            ivas.gov.bisp.enumeration.aC.u uVarX;
            int i = 2 % 2;
            int i2 = b + 27;
            c = i2 % 128;
            if (i2 % 2 != 0) {
                c0041t = (C0041t) aaVar;
                T.b(c0041t.w());
                uVarX = c0041t.x();
                int i3 = 71 / 0;
            } else {
                c0041t = (C0041t) aaVar;
                T.b(c0041t.w());
                uVarX = c0041t.x();
            }
            if (uVarX.w() != 12) {
                int i4 = b;
                int i5 = i4 & 89;
                int i6 = ((((i4 ^ 89) | i5) << 1) - (~(-((i4 | 89) & (~i5))))) - 1;
                c = i6 % 128;
                int i7 = i6 % 2;
                if (c0041t.x().w() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
            }
            int i8 = c;
            int i9 = i8 & 59;
            int i10 = (i9 - (~(-(-((i8 ^ 59) | i9))))) - 1;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 79;
            int i4 = (i2 ^ 79) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            c = i5 % 128;
            int i6 = i5 % 2;
            C0041t c0041t = (C0041t) aaVar;
            ivas.gov.bisp.enumeration.aC.P.bbO bboX = ivas.gov.bisp.enumeration.aC.P.x();
            byte[] bArrB = Q.b(c0041t.w());
            int i7 = c;
            int i8 = i7 & 37;
            int i9 = (((i7 ^ 37) | i8) << 1) - ((i7 | 37) & (~i8));
            b = i9 % 128;
            int i10 = i9 % 2;
            AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArrB, 0, bArrB.length);
            bboX.f();
            int i11 = b + 50;
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            c = i12 % 128;
            if (i12 % 2 != 0) {
                ivas.gov.bisp.enumeration.aC.P.v(bboX.d, abstractC0069zE);
                c0041t.x();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ivas.gov.bisp.enumeration.aC.P.v(bboX.d, abstractC0069zE);
            ivas.gov.bisp.enumeration.aC.u uVarX = c0041t.x();
            int i13 = b + 85;
            c = i13 % 128;
            int i14 = i13 % 2;
            bboX.f();
            ivas.gov.bisp.enumeration.aC.P.w(bboX.d, uVarX);
            int i15 = c;
            int i16 = (i15 & (-104)) | ((~i15) & 103);
            int i17 = -(-((i15 & 103) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            b = i18 % 128;
            int i19 = i18 % 2;
            Objects.requireNonNull(C0082p.this);
            bboX.f();
            ivas.gov.bisp.enumeration.aC.P p = bboX.d;
            int i20 = c + 97;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                ivas.gov.bisp.enumeration.aC.P.t(p, 1);
            } else {
                ivas.gov.bisp.enumeration.aC.P.t(p, 0);
            }
            return (ivas.gov.bisp.enumeration.aC.P) bboX.c();
        }
    }
}
