package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class X extends o0OOO0o<X, bcI> implements ab {
    private static final X DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile o000O0<X> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 0;
    private static int d = 1;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private int version_;

    public static final class bcI extends o0OOO0o.OooO00o<X, bcI> implements ab {
        public bcI() {
            super(X.u());
        }

        public bcI(bcH bch) {
            super(X.u());
        }
    }

    static {
        X x = new X();
        DEFAULT_INSTANCE = x;
        int i = c;
        int i2 = (((i | 9) << 1) - (~(-(((~i) & 9) | (i & (-10)))))) - 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(X.class, x);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void t(X x, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = (i3 ^ 25) + ((i3 & 25) << 1);
        d = i4 % 128;
        int i5 = i4 % 2;
        x.version_ = i;
        if (i5 == 0) {
            int i6 = 6 / 0;
        }
    }

    public static /* synthetic */ X u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((((i2 ^ 65) | (i2 & 65)) << 1) - (~(-((i2 & (-66)) | ((~i2) & 65))))) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        X x = DEFAULT_INSTANCE;
        int i5 = i2 + 63;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return x;
        }
        throw null;
    }

    public static X w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 31;
        int i4 = (((i2 | 31) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        X x = (X) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i5 = d;
        int i6 = ((i5 ^ 23) | (i5 & 23)) << 1;
        int i7 = -(((~i5) & 23) | (i5 & (-24)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        c = i8 % 128;
        int i9 = i8 % 2;
        return x;
    }

    public static bcI x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        bcI bci = (bcI) DEFAULT_INSTANCE.B();
        int i5 = d;
        int i6 = (i5 & (-126)) | ((~i5) & 125);
        int i7 = (i5 & 125) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        c = i8 % 128;
        int i9 = i8 % 2;
        return bci;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 117) + (i2 | 117);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.version_;
        }
        throw null;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new X();
            case 4:
                return new bcI(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<X> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (X.class) {
                    bki = PARSER;
                    if (bki == null) {
                        bki = new ivas.gov.bisp.enumeration.aD.S.bkI(DEFAULT_INSTANCE);
                        PARSER = bki;
                    }
                    break;
                }
                return bki;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final AbstractC0069z z() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 ^ 42) + ((i2 & 42) << 1)) - 1;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.keyValue_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void v(X x, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 117;
        int i4 = -(-(i2 | 117));
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(x);
        Objects.requireNonNull(abstractC0069z);
        int i7 = d;
        int i8 = i7 & 93;
        int i9 = -(-(i7 | 93));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int i11 = i10 % 128;
        c = i11;
        int i12 = i10 % 2;
        x.keyValue_ = abstractC0069z;
        int i13 = (((i11 | 72) << 1) - (i11 ^ 72)) - 1;
        d = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
