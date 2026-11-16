package ivas.gov.bisp.enumeration.aT;

import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aC.X;
import ivas.gov.bisp.enumeration.aC.Y;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.Q;
import ivas.gov.bisp.enumeration.p053bz.T;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o extends Oooo0<X> {
    private static int a = 1;
    private static int b;

    public class bgD extends Oooo0.OooO0O0<ivas.gov.bisp.enumeration.aS.z, X> {
        private static int b = 0;
        private static int c = 1;

        public bgD(Class cls) {
            super(cls);
        }

        public Object c(Object obj) {
            int i = 2 % 2;
            ivas.gov.bisp.enumeration.p053bz.l lVar = new ivas.gov.bisp.enumeration.p053bz.l(((X) obj).z().n(), 1);
            int i2 = b;
            int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
            c = i3 % 128;
            int i4 = i3 % 2;
            return lVar;
        }
    }

    public class bgE extends Oooo0.OooO00o<Y, X> {
        private static int b = 0;
        private static int c = 1;

        public bgE(Class cls) {
            super(cls);
        }

        public /* synthetic */ void e(aa aaVar) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 ^ 11;
            int i4 = -(-((i2 & 11) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            int i6 = i5 % 128;
            b = i6;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = i6 & 9;
            int i8 = ((i6 ^ 9) | i7) << 1;
            int i9 = -((i6 | 9) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            c = i10 % 128;
            int i11 = i10 % 2;
        }

        public Object c(aa aaVar) {
            X.bcI bciX;
            o oVar;
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 41;
            int i5 = (i3 | 41) & (~i4);
            int i6 = i4 << 1;
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            c = i7 % 128;
            if (i7 % 2 == 0) {
                bciX = X.x();
                oVar = o.this;
                int i8 = 66 / 0;
            } else {
                bciX = X.x();
                oVar = o.this;
            }
            int i9 = c;
            int i10 = ((((i9 ^ 111) | (i9 & 111)) << 1) - (~(-(((~i9) & 111) | (i9 & (-112)))))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            Objects.requireNonNull(oVar);
            bciX.f();
            X x = bciX.d;
            int i12 = b;
            int i13 = i12 & 109;
            int i14 = ((((i12 ^ 109) | i13) << 1) - (~(-((i12 | 109) & (~i13))))) - 1;
            c = i14 % 128;
            if (i14 % 2 == 0) {
                X.t(x, 0);
                i = 44;
            } else {
                X.t(x, 0);
                i = 32;
            }
            byte[] bArrB = Q.b(i);
            AbstractC0069z abstractC0069zE = AbstractC0069z.e(bArrB, 0, bArrB.length);
            bciX.f();
            int i15 = b;
            int i16 = i15 ^ 121;
            int i17 = -(-((i15 & 121) << 1));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            c = i18 % 128;
            Object obj = null;
            if (i18 % 2 == 0) {
                X.v(bciX.d, abstractC0069zE);
                obj.hashCode();
                throw null;
            }
            X.v(bciX.d, abstractC0069zE);
            X x2 = (X) bciX.c();
            int i19 = c;
            int i20 = i19 & 11;
            int i21 = ((i19 | 11) & (~i20)) + (i20 << 1);
            b = i21 % 128;
            if (i21 % 2 == 0) {
                return x2;
            }
            throw null;
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = c + 63;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return Y.t(abstractC0069z, J.d());
            }
            int i3 = 66 / 0;
            return Y.t(abstractC0069z, J.d());
        }
    }

    public o() {
        super(X.class, new bgD(ivas.gov.bisp.enumeration.aS.z.class));
    }

    public String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((((i2 ^ 33) | (i2 & 33)) << 1) - (~(-((i2 & (-34)) | ((~i2) & 33))))) - 1;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ((i2 | 27) << 1) - (i2 ^ 27);
        a = i4 % 128;
        int i5 = i4 % 2;
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public Oooo0.OooO00o<Y, X> e() {
        int i = 2 % 2;
        bgE bge = new bgE(Y.class);
        int i2 = b;
        int i3 = ((i2 | 75) << 1) - (i2 ^ 75);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return bge;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public R.bdl f() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 13) + ((i2 & 13) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        R.bdl bdlVar = R.bdl.e;
        int i5 = b + 15;
        a = i5 % 128;
        int i6 = i5 % 2;
        return bdlVar;
    }

    public aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        a = i3 % 128;
        int i4 = i3 % 2;
        X xW = X.w(abstractC0069z, J.d());
        int i5 = b;
        int i6 = i5 & 11;
        int i7 = (i5 ^ 11) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0) {
            return xW;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = i2 | 109;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        X x = (X) aaVar;
        T.d(x.A(), 0);
        int i7 = b;
        int i8 = ((i7 & 68) + (i7 | 68)) - 1;
        a = i8 % 128;
        int i9 = i8 % 2;
        int size = x.z().size();
        if (i9 != 0 ? size != 32 : size != 62) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
        int i10 = a;
        int i11 = ((i10 ^ 97) | (i10 & 97)) << 1;
        int i12 = -(((~i10) & 97) | (i10 & (-98)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 78 / 0;
        }
    }
}
