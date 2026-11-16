package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0038p;
import ivas.gov.bisp.enumeration.aC.C0039r;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aC.T;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.S;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.O;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p029bb.N;
import ivas.gov.bisp.enumeration.p053bz.C0231o;
import ivas.gov.bisp.enumeration.p053bz.M;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Oooo0<C0039r> {
    private static int a = 1;
    private static int b;

    public class bgc extends Oooo0.OooO00o<ivas.gov.bisp.enumeration.aC.e, C0039r> {
        private static int b = 1;
        private static int c;

        public bgc(Class cls) {
            super(cls);
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.aC.e eVar = (ivas.gov.bisp.enumeration.aC.e) aaVar;
            ivas.gov.bisp.enumeration.aC.i iVar = (ivas.gov.bisp.enumeration.aC.i) new i().e().c(eVar.w());
            N n = new N();
            int i2 = c;
            int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            T t = (T) n.e().c(eVar.x());
            int i5 = c + 35;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                C0039r.bbF bbfX = C0039r.x();
                bbfX.f();
                C0039r c0039r = bbfX.d;
                throw null;
            }
            C0039r.bbF bbfX2 = C0039r.x();
            bbfX2.f();
            C0039r c0039r2 = bbfX2.d;
            int i6 = b;
            int i7 = i6 & 117;
            int i8 = (i6 ^ 117) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            c = i9 % 128;
            int i10 = i9 % 2;
            C0039r.w(c0039r2, iVar);
            bbfX2.f();
            C0039r c0039r3 = bbfX2.d;
            int i11 = (-2) - ((b + 2) ^ (-1));
            c = i11 % 128;
            int i12 = i11 % 2;
            C0039r.v(c0039r3, t);
            Objects.requireNonNull(e.this);
            bbfX2.f();
            int i13 = c;
            int i14 = i13 & 27;
            int i15 = i13 | 27;
            int i16 = (i14 & i15) + (i15 | i14);
            b = i16 % 128;
            int i17 = i16 % 2;
            C0039r.t(bbfX2.d, 0);
            S sC = bbfX2.c();
            int i18 = c;
            int i19 = i18 & 103;
            int i20 = i19 + ((i18 ^ 103) | i19);
            int i21 = i20 % 128;
            b = i21;
            int i22 = i20 % 2;
            C0039r c0039r4 = (C0039r) sC;
            int i23 = (i21 & 103) + (i21 | 103);
            c = i23 % 128;
            int i24 = i23 % 2;
            return c0039r4;
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 95;
            int i4 = (i3 - (~(-(-((i2 ^ 95) | i3))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            ivas.gov.bisp.enumeration.aC.e eVarU = ivas.gov.bisp.enumeration.aC.e.u(abstractC0069z, J.d());
            int i6 = c + 27;
            b = i6 % 128;
            if (i6 % 2 != 0) {
                return eVarU;
            }
            throw null;
        }

        public void e(aa aaVar) throws InvalidAlgorithmParameterException {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.aC.e eVar = (ivas.gov.bisp.enumeration.aC.e) aaVar;
            new i().e().e(eVar.w());
            N n = new N();
            int i2 = c + 15;
            b = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                n.e().e(eVar.x());
                eVar.w();
                obj.hashCode();
                throw null;
            }
            n.e().e(eVar.x());
            C0038p c0038pW = eVar.w();
            int i3 = c;
            int i4 = i3 & 15;
            int i5 = (((i3 | 15) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            ivas.gov.bisp.enumeration.p053bz.T.b(c0038pW.y());
            int i7 = c + 61;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
    }

    public e() {
        super(C0039r.class, new bga(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 117;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 1;
        int i6 = (((i2 ^ 1) | i5) << 1) - ((i2 | 1) & (~i5));
        b = i6 % 128;
        int i7 = i6 % 2;
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final Oooo0.OooO00o<ivas.gov.bisp.enumeration.aC.e, C0039r> e() {
        int i = 2 % 2;
        bgc bgcVar = new bgc(ivas.gov.bisp.enumeration.aC.e.class);
        int i2 = b;
        int i3 = i2 & 71;
        int i4 = ((i2 | 71) & (~i3)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        return bgcVar;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 95;
        int i4 = ((i2 ^ 95) | i3) << 1;
        int i5 = -((i2 | 95) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        R.bdl bdlVar = R.bdl.e;
        if (i7 == 0) {
            return bdlVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 71;
        int i4 = -(-((i2 ^ 71) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        C0039r c0039rY = C0039r.y(abstractC0069z, J.d());
        int i7 = a;
        int i8 = (((i7 & (-46)) | ((~i7) & 45)) - (~(-(-((i7 & 45) << 1))))) - 1;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 37 / 0;
        }
        return c0039rY;
    }

    public class bga extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, C0039r> {
        private static int b = 0;
        private static int c = 1;

        public bga(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            C0039r c0039r = (C0039r) obj;
            M m = (M) new i().d(c0039r.A(), M.class);
            N n = new N();
            int i2 = b + 85;
            c = i2 % 128;
            int i3 = i2 % 2;
            C0231o c0231o = new C0231o(m, (O) n.d(c0039r.F(), O.class), c0039r.F().E().w());
            int i4 = b;
            int i5 = i4 & 47;
            int i6 = ((i4 ^ 47) | i5) << 1;
            int i7 = -((i4 | 47) & (~i5));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            c = i8 % 128;
            if (i8 % 2 != 0) {
                return c0231o;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        C0039r c0039r = (C0039r) aaVar;
        ivas.gov.bisp.enumeration.p053bz.T.d(c0039r.E(), 0);
        new i().i(c0039r.A());
        N n = new N();
        int i2 = b;
        int i3 = (-2) - ((((i2 | 68) << 1) - (i2 ^ 68)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            n.o(c0039r.F());
            throw null;
        }
        n.o(c0039r.F());
        int i4 = a;
        int i5 = ((i4 | 69) << 1) - (i4 ^ 69);
        b = i5 % 128;
        int i6 = i5 % 2;
    }
}
