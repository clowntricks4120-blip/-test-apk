package ivas.gov.bisp.enumeration.p029bb;

import ivas.gov.bisp.enumeration.aC.L;
import ivas.gov.bisp.enumeration.aC.Q;
import ivas.gov.bisp.enumeration.aC.R;
import ivas.gov.bisp.enumeration.aC.S;
import ivas.gov.bisp.enumeration.aC.T;
import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.J;
import ivas.gov.bisp.enumeration.aD.aa;
import ivas.gov.bisp.enumeration.aS.O;
import ivas.gov.bisp.enumeration.o0000o0o.Oooo0;
import ivas.gov.bisp.enumeration.p053bz.C0230m;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class N extends Oooo0<T> {
    private static int a = 1;
    private static int b;

    public class bhM extends Oooo0.OooO0O0<O, T> {
        private static int b = 0;
        private static int c = 1;

        public bhM(Class cls) {
            super(cls);
        }

        public Object c(Object obj) throws GeneralSecurityException {
            ivas.gov.bisp.enumeration.p053bz.O o2;
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 3;
            int i4 = (i2 ^ 3) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj2 = null;
            if (i5 % 2 != 0) {
                T t = (T) obj;
                t.E().x();
                t.F();
                obj2.hashCode();
                throw null;
            }
            T t2 = (T) obj;
            Q qX = t2.E().x();
            SecretKeySpec secretKeySpec = new SecretKeySpec(t2.F().n(), "HMAC");
            int i6 = b;
            int i7 = i6 & 51;
            int i8 = -(-((i6 ^ 51) | i7));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            c = i9 % 128;
            int i10 = i9 % 2;
            int iW = t2.E().w();
            int iOrdinal = qX.ordinal();
            if (iOrdinal != 1) {
                int i11 = b;
                int i12 = (i11 ^ 89) + ((i11 & 89) << 1);
                c = i12 % 128;
                int i13 = i12 % 2;
                if (iOrdinal != 3) {
                    int i14 = i11 & 47;
                    int i15 = -(-((i11 ^ 47) | i14));
                    int i16 = (i14 & i15) + (i14 | i15);
                    c = i16 % 128;
                    int i17 = i16 % 2;
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown hash");
                    }
                    o2 = new ivas.gov.bisp.enumeration.p053bz.O(new C0230m("HMACSHA512", secretKeySpec), iW);
                    int i18 = c;
                    int i19 = i18 ^ 101;
                    int i20 = ((i18 & 101) | i19) << 1;
                    int i21 = -i19;
                    int i22 = (i20 & i21) + (i20 | i21);
                    int i23 = i22 % 128;
                    b = i23;
                    int i24 = i22 % 2;
                    int i25 = (i23 ^ 1) + ((i23 & 1) << 1);
                    c = i25 % 128;
                    int i26 = i25 % 2;
                } else {
                    ivas.gov.bisp.enumeration.p053bz.O o3 = new ivas.gov.bisp.enumeration.p053bz.O(new C0230m("HMACSHA256", secretKeySpec), iW);
                    int i27 = (-2) - ((b + 30) ^ (-1));
                    int i28 = i27 % 128;
                    c = i28;
                    if (i27 % 2 == 0) {
                        throw null;
                    }
                    int i29 = i28 & 115;
                    int i30 = (~i29) & (i28 | 115);
                    int i31 = i29 << 1;
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    b = i32 % 128;
                    int i33 = i32 % 2;
                    o2 = o3;
                }
            } else {
                o2 = new ivas.gov.bisp.enumeration.p053bz.O(new C0230m("HMACSHA1", secretKeySpec), iW);
                int i34 = b;
                int i35 = i34 + 59;
                c = i35 % 128;
                int i36 = i35 % 2;
                int i37 = i34 | 105;
                int i38 = i37 << 1;
                int i39 = -((~(i34 & 105)) & i37);
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                c = i40 % 128;
                int i41 = i40 % 2;
            }
            int i42 = c;
            int i43 = i42 & 125;
            int i44 = (i42 | 125) & (~i43);
            int i45 = -(-(i43 << 1));
            int i46 = (i44 & i45) + (i44 | i45);
            b = i46 % 128;
            int i47 = i46 % 2;
            return o2;
        }
    }

    public class bhN extends Oooo0.OooO00o<S, T> {
        private static int b = 0;
        private static int c = 1;

        public bhN(Class cls) {
            super(cls);
        }

        public aa d(AbstractC0069z abstractC0069z) {
            int i = 2 % 2;
            int i2 = (-2) - ((b + 58) ^ (-1));
            c = i2 % 128;
            int i3 = i2 % 2;
            S sV = S.v(abstractC0069z, J.d());
            int i4 = c;
            int i5 = (i4 & (-4)) | ((~i4) & 3);
            int i6 = (i4 & 3) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return sV;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void e(aa aaVar) throws GeneralSecurityException {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 11;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 11)) & i3);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            c = i6 % 128;
            int i7 = i6 % 2;
            S s = (S) aaVar;
            if (s.y() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            int i8 = c;
            int i9 = i8 & 27;
            int i10 = (i9 - (~((i8 ^ 27) | i9))) - 1;
            b = i10 % 128;
            int i11 = i10 % 2;
            N.i(s.x());
            int i12 = c;
            int i13 = i12 ^ 65;
            int i14 = (i12 & 65) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            b = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        }

        public Object c(aa aaVar) {
            AbstractC0069z abstractC0069zE;
            int i = 2 % 2;
            int i2 = b + 121;
            c = i2 % 128;
            int i3 = i2 % 2;
            S s = (S) aaVar;
            T.bdx bdxVarY = T.y();
            N n = N.this;
            int i4 = b;
            int i5 = ((i4 ^ 9) | (i4 & 9)) << 1;
            int i6 = -(((~i4) & 9) | (i4 & (-10)));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            c = i7 % 128;
            int i8 = i7 % 2;
            Objects.requireNonNull(n);
            bdxVarY.f();
            T t = bdxVarY.d;
            int i9 = b + 46;
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            c = i10 % 128;
            if (i10 % 2 == 0) {
                T.t(t, 1);
            } else {
                T.t(t, 0);
            }
            L lX = s.x();
            bdxVarY.f();
            int i11 = c;
            int i12 = (i11 ^ 93) + ((i11 & 93) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            T.w(bdxVarY.d, lX);
            int iY = s.y();
            int i14 = c;
            int i15 = i14 & 21;
            int i16 = (i14 ^ 21) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                byte[] bArrB = ivas.gov.bisp.enumeration.p053bz.Q.b(iY);
                abstractC0069zE = AbstractC0069z.e(bArrB, 0, bArrB.length);
            } else {
                byte[] bArrB2 = ivas.gov.bisp.enumeration.p053bz.Q.b(iY);
                abstractC0069zE = AbstractC0069z.e(bArrB2, 0, bArrB2.length);
            }
            bdxVarY.f();
            T.v(bdxVarY.d, abstractC0069zE);
            int i18 = b;
            int i19 = (i18 & 33) + (i18 | 33);
            c = i19 % 128;
            int i20 = i19 % 2;
            T t2 = (T) bdxVarY.c();
            int i21 = c + 13;
            b = i21 % 128;
            int i22 = i21 % 2;
            return t2;
        }
    }

    public N() {
        super(T.class, new bhM(O.class));
    }

    public final String c() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 105;
        a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ((i2 & 3) - (~(i2 | 3))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final Oooo0.OooO00o<S, T> e() {
        int i = 2 % 2;
        bhN bhn = new bhN(S.class);
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = -(-((i2 ^ 65) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        return bhn;
    }

    public final R.bdl f() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = ((i2 | 93) << 1) - (i2 ^ 93);
        a = i3 % 128;
        if (i3 % 2 != 0) {
            return R.bdl.e;
        }
        int i4 = 73 / 0;
        return R.bdl.e;
    }

    public final /* synthetic */ void g(aa aaVar) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - (((i2 & 26) + (i2 | 26)) ^ (-1));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            o((T) aaVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o((T) aaVar);
        int i4 = a;
        int i5 = i4 & 125;
        int i6 = (((i4 | 125) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
    }

    public final aa h(AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = a + 107;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            T.z(abstractC0069z, J.d());
            throw null;
        }
        T tZ = T.z(abstractC0069z, J.d());
        int i3 = a;
        int i4 = i3 & 103;
        int i5 = (i3 ^ 103) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            return tZ;
        }
        throw null;
    }

    public static void i(L l) throws GeneralSecurityException {
        int iOrdinal;
        int i = 2 % 2;
        int i2 = a + 70;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        if (l.w() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i5 = b;
        int i6 = (i5 & (-122)) | ((~i5) & 121);
        int i7 = (i5 & 121) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        a = i8 % 128;
        if (i8 % 2 != 0 ? (iOrdinal = l.x().ordinal()) == 1 : (iOrdinal = l.x().ordinal()) == 1) {
            if (l.w() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal != 3) {
            int i9 = b;
            int i10 = i9 + 81;
            a = i10 % 128;
            int i11 = i10 % 2;
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            int i12 = i9 & 45;
            int i13 = ((i9 | 45) & (~i12)) + (i12 << 1);
            a = i13 % 128;
            if (i13 % 2 != 0 ? l.w() > 64 : l.w() > 105) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (l.w() > 32) {
            throw new GeneralSecurityException("tag size too big");
        }
        int i14 = a;
        int i15 = ((((i14 ^ 97) | (i14 & 97)) << 1) - (~(-(((~i14) & 97) | (i14 & (-98)))))) - 1;
        b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final void o(T t) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (i3 - (~(-(-((i2 ^ 17) | i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.p053bz.T.d(t.G(), 0);
        int size = t.F().size();
        int i6 = a;
        int i7 = i6 + 61;
        b = i7 % 128;
        if (i7 % 2 == 0 ? size < 16 : size < 79) {
            throw new GeneralSecurityException("key too short");
        }
        int i8 = (-2) - ((i6 + 124) ^ (-1));
        b = i8 % 128;
        int i9 = i8 % 2;
        i(t.E());
        int i10 = b + 39;
        a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 58 / 0;
        }
    }
}
