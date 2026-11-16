package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.C0031a;
import ivas.gov.bisp.enumeration.aC.C0034l;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.C0232p;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Oooo0<C0034l> {
    private static int a = 1;
    private static int b;

    public class bgt extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, C0034l> {
        private static int b = 1;
        private static int c;

        public bgt(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            C0232p c0232p = new C0232p(((C0034l) obj).z().n());
            int i2 = c;
            int i3 = i2 & 115;
            int i4 = -(-((i2 ^ 115) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            return c0232p;
        }
    }

    public class bgu extends Oooo0.OooO00o<C0031a, C0034l> {
        private static int b = 1;
        private static int c;

        public bgu(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 93;
            int i4 = (i2 ^ 93) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            C0031a c0031aW = C0031a.w(abstractC0069z, J.d());
            int i7 = b + 65;
            c = i7 % 128;
            int i8 = i7 % 2;
            return c0031aW;
        }

        public void e(aa aaVar) throws InvalidAlgorithmParameterException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 7;
            int i4 = ((i2 ^ 7) | i3) << 1;
            int i5 = -((i2 | 7) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            c = i6 % 128;
            if (i6 % 2 == 0) {
                T.b(((C0031a) aaVar).y());
                return;
            }
            T.b(((C0031a) aaVar).y());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Object c(aa aaVar) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 75;
            int i4 = (i2 | 75) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                C0034l.x();
                Q.b(((C0031a) aaVar).y());
                throw null;
            }
            C0034l.bbX bbxX = C0034l.x();
            byte[] bArrB = Q.b(((C0031a) aaVar).y());
            AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArrB, 0, bArrB.length);
            bbxX.f();
            C0034l c0034l = bbxX.d;
            int i7 = c + 97;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                C0034l.v(c0034l, abstractC0069zE);
                Objects.requireNonNull(z.this);
                throw null;
            }
            C0034l.v(c0034l, abstractC0069zE);
            Objects.requireNonNull(z.this);
            int i8 = b;
            int i9 = i8 & 59;
            int i10 = -(-((i8 ^ 59) | i9));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            c = i11 % 128;
            int i12 = i11 % 2;
            bbxX.f();
            C0034l.t(bbxX.d, 0);
            int i13 = c;
            int i14 = (((i13 ^ 5) | (i13 & 5)) << 1) - (((~i13) & 5) | (i13 & (-6)));
            b = i14 % 128;
            int i15 = i14 % 2;
            C0034l c0034l2 = (C0034l) bbxX.c();
            int i16 = c + 25;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                return c0034l2;
            }
            throw null;
        }
    }

    public z() {
        super(C0034l.class, new bgt(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 ^ 61;
        int i4 = (i2 & 61) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i7 = ((((i6 ^ 125) | (i6 & 125)) << 1) - (~(-(((~i6) & 125) | (i6 & (-126)))))) - 1;
        b = i7 % 128;
        int i8 = i7 % 2;
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final Oooo0.OooO00o<C0031a, C0034l> e() {
        int i = 2 % 2;
        bgu bguVar = new bgu(C0031a.class);
        int i2 = a;
        int i3 = ((i2 ^ 57) - (~((i2 & 57) << 1))) - 1;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return bguVar;
        }
        throw null;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 55;
        int i4 = (((i2 & 55) | i3) << 1) - i3;
        b = i4 % 128;
        int i5 = i4 % 2;
        R.bdl bdlVar = R.bdl.e;
        int i6 = b + 7;
        a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return bdlVar;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 49;
        int i4 = -(-((i2 ^ 49) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        C0034l c0034lW = C0034l.w(abstractC0069z, J.d());
        int i7 = a;
        int i8 = i7 & 31;
        int i9 = (i7 | 31) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        return c0034lW;
    }

    public final void g(aa aaVar) throws GeneralSecurityException {
        C0034l c0034l;
        int iA;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 1;
        int i4 = (i2 | 1) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        a = i6 % 128;
        if (i6 % 2 == 0) {
            c0034l = (C0034l) aaVar;
            iA = c0034l.A();
        } else {
            c0034l = (C0034l) aaVar;
            iA = c0034l.A();
        }
        T.d(iA, 0);
        T.b(c0034l.z().size());
        int i7 = a;
        int i8 = (i7 & (-16)) | ((~i7) & 15);
        int i9 = (i7 & 15) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        int i11 = i10 % 2;
    }
}
