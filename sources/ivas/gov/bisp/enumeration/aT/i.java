package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0038p;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.M;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i extends Oooo0<ivas.gov.bisp.enumeration.aC.i> {
    private static int a = 0;
    private static int b = 1;

    public class bgk extends Oooo0.OooO0O0<M, ivas.gov.bisp.enumeration.aC.i> {
        private static int b = 1;
        private static int c;

        public bgk(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.aC.i iVar = (ivas.gov.bisp.enumeration.aC.i) obj;
            ivas.gov.bisp.enumeration.p053bz.e eVar = new ivas.gov.bisp.enumeration.p053bz.e(iVar.F().n(), iVar.E().w());
            int i2 = b;
            int i3 = ((i2 ^ 105) | (i2 & 105)) << 1;
            int i4 = -(((~i2) & 105) | (i2 & (-106)));
            int i5 = (i3 & i4) + (i4 | i3);
            c = i5 % 128;
            if (i5 % 2 == 0) {
                return eVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public i() {
        super(ivas.gov.bisp.enumeration.aC.i.class, new bgk(M.class));
    }

    public String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (~i3) & (i2 | 17);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 + 69;
        a = i8 % 128;
        if (i8 % 2 == 0) {
            return "type.googleapis.com/google.crypto.tink.AesCtrKey";
        }
        throw null;
    }

    public Oooo0.OooO00o<C0038p, ivas.gov.bisp.enumeration.aC.i> e() {
        int i = 2 % 2;
        bgl bglVar = new bgl(C0038p.class);
        int i2 = b + 97;
        a = i2 % 128;
        int i3 = i2 % 2;
        return bglVar;
    }

    public R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 38) + ((i2 & 38) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return R.bdl.e;
        }
        R.bdl bdlVar = R.bdl.e;
        throw null;
    }

    public /* synthetic */ void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 47;
        int i4 = ((((i2 ^ 47) | i3) << 1) - (~(-((i2 | 47) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        i((ivas.gov.bisp.enumeration.aC.i) aaVar);
        int i6 = a;
        int i7 = i6 ^ 17;
        int i8 = (i6 & 17) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aC.i iVarZ = ivas.gov.bisp.enumeration.aC.i.z(abstractC0069z, J.d());
        int i5 = a;
        int i6 = (((i5 | 4) << 1) - (i5 ^ 4)) - 1;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return iVarZ;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void j(ivas.gov.bisp.enumeration.aC.z zVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (zVar.w() >= 12) {
            int i5 = a;
            int i6 = ((i5 | 105) << 1) - (i5 ^ 105);
            b = i6 % 128;
            int i7 = i6 % 2;
            if (zVar.w() <= 16) {
                int i8 = b;
                int i9 = (-2) - (((i8 & 120) + (i8 | 120)) ^ (-1));
                a = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    public class bgl extends Oooo0.OooO00o<C0038p, ivas.gov.bisp.enumeration.aC.i> {
        private static int b = 1;
        private static int c;

        public bgl(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = (((i2 | 42) << 1) - (i2 ^ 42)) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                C0038p.v(abstractC0069z, J.d());
                obj.hashCode();
                throw null;
            }
            C0038p c0038pV = C0038p.v(abstractC0069z, J.d());
            int i4 = b;
            int i5 = (i4 ^ 86) + ((i4 & 86) << 1);
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            c = i6 % 128;
            if (i6 % 2 == 0) {
                return c0038pV;
            }
            obj.hashCode();
            throw null;
        }

        public void e(aa aaVar) throws GeneralSecurityException {
            int i = 2 % 2;
            int i2 = b + 71;
            c = i2 % 128;
            int i3 = i2 % 2;
            C0038p c0038p = (C0038p) aaVar;
            T.b(c0038p.y());
            i iVar = i.this;
            int i4 = c;
            int i5 = ((i4 & (-98)) | ((~i4) & 97)) + ((i4 & 97) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            iVar.j(c0038p.x());
            int i7 = b;
            int i8 = i7 ^ 35;
            int i9 = -(-((i7 & 35) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            c = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
            c = i3 % 128;
            int i4 = i3 % 2;
            C0038p c0038p = (C0038p) aaVar;
            ivas.gov.bisp.enumeration.aC.i.bbI bbiY = ivas.gov.bisp.enumeration.aC.i.y();
            ivas.gov.bisp.enumeration.aC.z zVarX = c0038p.x();
            int i5 = c;
            int i6 = ((i5 ^ 121) | (i5 & 121)) << 1;
            int i7 = -(((~i5) & 121) | (i5 & (-122)));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            Object obj = null;
            if (i8 % 2 == 0) {
                bbiY.f();
                ivas.gov.bisp.enumeration.aC.i.w(bbiY.d, zVarX);
                obj.hashCode();
                throw null;
            }
            bbiY.f();
            ivas.gov.bisp.enumeration.aC.i.w(bbiY.d, zVarX);
            byte[] bArrB = Q.b(c0038p.y());
            AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArrB, 0, bArrB.length);
            int i9 = c + 37;
            b = i9 % 128;
            if (i9 % 2 == 0) {
                bbiY.f();
                ivas.gov.bisp.enumeration.aC.i.v(bbiY.d, abstractC0069zE);
                obj.hashCode();
                throw null;
            }
            bbiY.f();
            ivas.gov.bisp.enumeration.aC.i.v(bbiY.d, abstractC0069zE);
            Objects.requireNonNull(i.this);
            bbiY.f();
            ivas.gov.bisp.enumeration.aC.i iVar = bbiY.d;
            int i10 = c + 109;
            b = i10 % 128;
            int i11 = i10 % 2;
            ivas.gov.bisp.enumeration.aC.i.t(iVar, 0);
            ivas.gov.bisp.enumeration.aC.i iVar2 = (ivas.gov.bisp.enumeration.aC.i) bbiY.c();
            int i12 = b;
            int i13 = (i12 ^ 29) + ((i12 & 29) << 1);
            c = i13 % 128;
            int i14 = i13 % 2;
            return iVar2;
        }
    }

    public void i(ivas.gov.bisp.enumeration.aC.i iVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 94) << 1) - (i2 ^ 94);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
        T.d(iVar.G(), 0);
        int size = iVar.F().size();
        int i6 = b;
        int i7 = ((i6 & 79) - (~(i6 | 79))) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        T.b(size);
        j(iVar.E());
        int i9 = a;
        int i10 = i9 & 47;
        int i11 = (((i9 | 47) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
        b = i11 % 128;
        int i12 = i11 % 2;
    }
}
