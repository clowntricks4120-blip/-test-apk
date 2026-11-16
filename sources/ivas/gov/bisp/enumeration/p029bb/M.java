package ivas.gov.bisp.enumeration.p029bb;

import ivas.gov.bisp.enumeration.aC.C0032c;
import ivas.gov.bisp.enumeration.aC.C0033j;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aC.h;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.O;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.N;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class M extends Oooo0<C0033j> {
    private static int a = 1;
    private static int b;

    public M() {
        super(C0033j.class, new bhJ(O.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 119) | (i2 & 119)) << 1;
        int i4 = -((i2 & (-120)) | ((~i2) & 119));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 & 61;
        int i8 = ((i2 | 61) & (~i7)) + (i7 << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final Oooo0.OooO00o<C0032c, C0033j> e() {
        int i = 2 % 2;
        bhK bhk = new bhK(this, C0032c.class);
        int i2 = a;
        int i3 = (((i2 | 76) << 1) - (i2 ^ 76)) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return bhk;
        }
        throw null;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 ^ 79) | (i2 & 79)) << 1;
        int i4 = -(((~i2) & 79) | (i2 & (-80)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return R.bdl.e;
        }
        int i6 = 6 / 0;
        return R.bdl.e;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 85;
        int i4 = -(-((i2 & 85) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            return C0033j.y(abstractC0069z, J.d());
        }
        int i6 = 70 / 0;
        return C0033j.y(abstractC0069z, J.d());
    }

    public class bhJ extends Oooo0.OooO0O0<O, C0033j> {
        private static int b = 1;
        private static int c;

        public bhJ(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            C0033j c0033j = (C0033j) obj;
            ivas.gov.bisp.enumeration.p053bz.O o2 = new ivas.gov.bisp.enumeration.p053bz.O(new N(c0033j.A().n()), c0033j.F().w());
            int i2 = c;
            int i3 = (((i2 ^ 33) | (i2 & 33)) << 1) - (((~i2) & 33) | (i2 & (-34)));
            b = i3 % 128;
            int i4 = i3 % 2;
            return o2;
        }
    }

    public final void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = (i2 ^ 49) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        C0033j c0033j = (C0033j) aaVar;
        T.d(c0033j.E(), 0);
        AbstractC0069z abstractC0069zA = c0033j.A();
        int i7 = b + 99;
        a = i7 % 128;
        int i8 = i7 % 2;
        int size = abstractC0069zA.size();
        if (i8 != 0 ? size != 32 : size != 30) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        i(c0033j.F());
        int i9 = b + 123;
        a = i9 % 128;
        int i10 = i9 % 2;
    }

    public class bhK extends Oooo0.OooO00o<C0032c, C0033j> {
        private static int b = 0;
        private static int c = 1;

        public bhK(M m, Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 97;
            int i4 = -(-((i2 ^ 97) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            c = i5 % 128;
            int i6 = i5 % 2;
            C0032c c0032cU = C0032c.u(abstractC0069z, J.d());
            int i7 = c + 100;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            return c0032cU;
        }

        public void e(aa aaVar) throws GeneralSecurityException {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 69;
            int i4 = ((i2 ^ 69) | i3) << 1;
            int i5 = -((i2 | 69) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                C0032c c0032c = (C0032c) aaVar;
                M.i(c0032c.x());
                c0032c.w();
                throw null;
            }
            C0032c c0032c2 = (C0032c) aaVar;
            M.i(c0032c2.x());
            if (c0032c2.w() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
            int i7 = c;
            int i8 = (((i7 | 52) << 1) - (i7 ^ 52)) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        public Object c(aa aaVar) {
            byte[] bArrB;
            int i;
            h hVarX;
            int i2 = 2 % 2;
            int i3 = c;
            int i4 = i3 & 27;
            int i5 = (i4 - (~((i3 ^ 27) | i4))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            C0032c c0032c = (C0032c) aaVar;
            C0033j.bbw bbwVarX = C0033j.x();
            bbwVarX.f();
            int i7 = b;
            int i8 = i7 & 39;
            int i9 = (i8 - (~((i7 ^ 39) | i8))) - 1;
            c = i9 % 128;
            if (i9 % 2 == 0) {
                C0033j.t(bbwVarX.d, 1);
            } else {
                C0033j.t(bbwVarX.d, 0);
            }
            int i10 = b;
            int i11 = (-2) - ((((i10 | 90) << 1) - (i10 ^ 90)) ^ (-1));
            c = i11 % 128;
            if (i11 % 2 == 0) {
                bArrB = Q.b(c0032c.w());
                i = 1;
            } else {
                bArrB = Q.b(c0032c.w());
                i = 0;
            }
            AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArrB, i, bArrB.length);
            bbwVarX.f();
            C0033j c0033j = bbwVarX.d;
            int i12 = b;
            int i13 = ((((i12 ^ 115) | (i12 & 115)) << 1) - (~(-(((~i12) & 115) | (i12 & (-116)))))) - 1;
            c = i13 % 128;
            if (i13 % 2 == 0) {
                C0033j.w(c0033j, abstractC0069zE);
                hVarX = c0032c.x();
                int i14 = 60 / 0;
            } else {
                C0033j.w(c0033j, abstractC0069zE);
                hVarX = c0032c.x();
            }
            int i15 = c + 21;
            b = i15 % 128;
            int i16 = i15 % 2;
            bbwVarX.f();
            C0033j c0033j2 = bbwVarX.d;
            int i17 = c;
            int i18 = i17 & 57;
            int i19 = (((i17 ^ 57) | i18) << 1) - ((i17 | 57) & (~i18));
            b = i19 % 128;
            if (i19 % 2 == 0) {
                C0033j.v(c0033j2, hVarX);
                return (C0033j) bbwVarX.c();
            }
            C0033j.v(c0033j2, hVarX);
            throw null;
        }
    }

    public static void i(h hVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 115;
        int i4 = -(-(i2 | 115));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        if (i5 % 2 != 0 ? hVar.w() < 10 : hVar.w() < 34) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (hVar.w() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
        int i6 = a;
        int i7 = (((i6 & (-12)) | ((~i6) & 11)) - (~((i6 & 11) << 1))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
    }
}
