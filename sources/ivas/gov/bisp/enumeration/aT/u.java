package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0040s;
import ivas.gov.bisp.enumeration.aC.C0044y;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.C0079m;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class u extends Oooo0<C0040s> {
    private static int a = 0;
    private static int b = 1;

    public u() {
        super(C0040s.class, new bgz(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 85;
        int i4 = (i2 ^ 85) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        int i7 = i2 & 67;
        int i8 = (i2 ^ 67) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
        }
        throw null;
    }

    public Oooo0.OooO00o<C0044y, C0040s> e() {
        int i = 2 % 2;
        bgA bga = new bgA(C0044y.class);
        int i2 = a;
        int i3 = i2 ^ 83;
        int i4 = (i2 & 83) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return bga;
    }

    public R.bdl f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 29) | (i2 & 29)) << 1) - (((~i2) & 29) | (i2 & (-30)));
        a = i3 % 128;
        int i4 = i3 % 2;
        R.bdl bdlVar = R.bdl.h;
        if (i4 != 0) {
            int i5 = 37 / 0;
        }
        int i6 = b;
        int i7 = (((i6 | 36) << 1) - (i6 ^ 36)) - 1;
        a = i7 % 128;
        int i8 = i7 % 2;
        return bdlVar;
    }

    public aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 19;
        int i4 = ((i2 ^ 19) | i3) << 1;
        int i5 = -((i2 | 19) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        C0040s c0040sW = C0040s.w(abstractC0069z, J.d());
        int i8 = a;
        int i9 = (i8 ^ 69) + ((i8 & 69) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return c0040sW;
    }

    public class bgz extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, C0040s> {
        private static int b = 1;
        private static int c;

        public bgz(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 1;
            int i4 = (i2 ^ 1) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            String strX = ((C0040s) obj).z().x();
            int i7 = b;
            int i8 = ((i7 & 10) + (i7 | 10)) - 1;
            c = i8 % 128;
            if (i8 % 2 != 0) {
                C0079m.b(strX).b(strX);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            ivas.gov.bisp.enumeration.aS.z zVarB = C0079m.b(strX).b(strX);
            int i9 = c + 105;
            b = i9 % 128;
            int i10 = i9 % 2;
            return zVarB;
        }
    }

    public void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b + 87;
        a = i2 % 128;
        if (i2 % 2 != 0) {
            T.d(((C0040s) aaVar).A(), 1);
        } else {
            T.d(((C0040s) aaVar).A(), 0);
        }
        int i3 = a + 15;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    public class bgA extends Oooo0.OooO00o<C0044y, C0040s> {
        private static int b = 0;
        private static int c = 1;

        public bgA(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 93;
            int i4 = (i3 << 1) - ((~(i2 & 93)) & i3);
            c = i4 % 128;
            int i5 = i4 % 2;
            J jD = J.d();
            if (i5 != 0) {
                return C0044y.v(abstractC0069z, jD);
            }
            C0044y.v(abstractC0069z, jD);
            throw null;
        }

        public /* bridge */ /* synthetic */ void e(aa aaVar) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = (i2 & 50) + (i2 | 50);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            int i7 = i5 & 113;
            int i8 = (~i7) & (i5 | 113);
            int i9 = i7 << 1;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            c = i10 % 128;
            int i11 = i10 % 2;
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            int i2 = b + 83;
            c = i2 % 128;
            int i3 = i2 % 2;
            C0044y c0044y = (C0044y) aaVar;
            C0040s.bcm bcmVarX = C0040s.x();
            bcmVarX.f();
            int i4 = c;
            int i5 = (i4 ^ 121) + ((i4 & 121) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                C0040s.v(bcmVarX.d, c0044y);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            C0040s.v(bcmVarX.d, c0044y);
            int i6 = b;
            int i7 = (((i6 | 7) << 1) - (~(-(i6 ^ 7)))) - 1;
            c = i7 % 128;
            if (i7 % 2 == 0) {
                Objects.requireNonNull(u.this);
                bcmVarX.f();
                int i8 = 36 / 0;
            } else {
                Objects.requireNonNull(u.this);
                bcmVarX.f();
            }
            int i9 = b;
            int i10 = ((i9 ^ 17) | (i9 & 17)) << 1;
            int i11 = -(((~i9) & 17) | (i9 & (-18)));
            int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
            c = i12 % 128;
            if (i12 % 2 == 0) {
                C0040s.t(bcmVarX.d, 1);
            } else {
                C0040s.t(bcmVarX.d, 0);
            }
            int i13 = c;
            int i14 = i13 & 25;
            int i15 = ((((i13 ^ 25) | i14) << 1) - (~(-((i13 | 25) & (~i14))))) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            C0040s c0040s = (C0040s) bcmVarX.c();
            int i17 = c;
            int i18 = (i17 & 15) + (i17 | 15);
            b = i18 % 128;
            int i19 = i18 % 2;
            return c0040s;
        }
    }
}
