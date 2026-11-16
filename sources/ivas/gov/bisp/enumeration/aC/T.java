package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class T extends o0OOO0o<T, bdx> implements ab {
    private static final T DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile o000O0<T> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private L params_;
    private int version_;

    public static final class bdx extends o0OOO0o.OooO00o<T, bdx> implements ab {
        public bdx() {
            super(T.u());
        }

        public bdx(bdw bdwVar) {
            super(T.u());
        }
    }

    static {
        T t = new T();
        DEFAULT_INSTANCE = t;
        int i = d;
        int i2 = (i ^ 101) + ((i & 101) << 1);
        c = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(T.class, t);
        int i4 = c;
        int i5 = i4 & 19;
        int i6 = (i4 | 19) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i6 | i7);
        d = i8 % 128;
        int i9 = i8 % 2;
    }

    public static void t(T t, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 47;
        int i5 = (i3 ^ 47) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        d = i7;
        int i8 = i6 % 2;
        t.version_ = i;
        int i9 = ((i7 ^ 54) + ((i7 & 54) << 1)) - 1;
        c = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 97 / 0;
        }
    }

    public static /* synthetic */ T u() {
        T t;
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            t = DEFAULT_INSTANCE;
            int i4 = 42 / 0;
        } else {
            t = DEFAULT_INSTANCE;
        }
        int i5 = i2 & 11;
        int i6 = -(-((i2 ^ 11) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        d = i7 % 128;
        int i8 = i7 % 2;
        return t;
    }

    public static T x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 93) + (i2 | 93);
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        T t = DEFAULT_INSTANCE;
        int i4 = (-2) - ((i2 + 34) ^ (-1));
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return t;
        }
        obj.hashCode();
        throw null;
    }

    public static bdx y() {
        bdx bdxVar;
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((((i2 ^ 19) | (i2 & 19)) << 1) - (~(-(((~i2) & 19) | (i2 & (-20)))))) - 1;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            bdxVar = (bdx) DEFAULT_INSTANCE.B();
            int i4 = 98 / 0;
        } else {
            bdxVar = (bdx) DEFAULT_INSTANCE.B();
        }
        int i5 = c;
        int i6 = (i5 & (-80)) | ((~i5) & 79);
        int i7 = -(-((i5 & 79) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        d = i8 % 128;
        int i9 = i8 % 2;
        return bdxVar;
    }

    public static T z(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & (-36)) | ((~i2) & 35);
        int i4 = -(-((i2 & 35) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        T t = (T) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i6 = c;
        int i7 = i6 & 125;
        int i8 = ((i6 ^ 125) | i7) << 1;
        int i9 = -((i6 | 125) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        d = i10 % 128;
        if (i10 % 2 == 0) {
            return t;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new T();
            case 4:
                return new bdx(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<T> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (T.class) {
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

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public final L E() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 55;
        int i4 = (i2 | 55) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        d = i6 % 128;
        int i7 = i6 % 2;
        L lT = this.params_;
        if (i7 != 0) {
            int i8 = 42 / 0;
            if (lT == null) {
                lT = L.t();
                int i9 = d;
                int i10 = i9 & 7;
                int i11 = i10 + ((i9 ^ 7) | i10);
                c = i11 % 128;
                int i12 = i11 % 2;
            }
        } else if (lT == null) {
            lT = L.t();
            int i13 = d;
            int i14 = i13 & 7;
            int i15 = i14 + ((i13 ^ 7) | i14);
            c = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = c;
        int i18 = i17 & 75;
        int i19 = ((i17 | 75) & (~i18)) + (i18 << 1);
        d = i19 % 128;
        int i20 = i19 % 2;
        return lT;
    }

    public final AbstractC0069z F() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 51;
        int i4 = (((i2 | 51) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        c = i5;
        int i6 = i4 % 2;
        AbstractC0069z abstractC0069z = this.keyValue_;
        int i7 = ((i5 ^ 75) | (i5 & 75)) << 1;
        int i8 = -(((~i5) & 75) | (i5 & (-76)));
        int i9 = (i7 & i8) + (i8 | i7);
        d = i9 % 128;
        int i10 = i9 % 2;
        return abstractC0069z;
    }

    public final int G() {
        int i = 2 % 2;
        int i2 = c + 73;
        int i3 = i2 % 128;
        d = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.version_;
        int i5 = i3 + 43;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public static void v(T t, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 | 40) << 1) - (i2 ^ 40)) - 1;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            Objects.requireNonNull(t);
            Objects.requireNonNull(abstractC0069z);
            t.keyValue_ = abstractC0069z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(t);
        Objects.requireNonNull(abstractC0069z);
        t.keyValue_ = abstractC0069z;
        int i4 = d;
        int i5 = (i4 & (-72)) | ((~i4) & 71);
        int i6 = -(-((i4 & 71) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void w(T t, L l) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 105) + (i2 | 105);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            Objects.requireNonNull(t);
            Objects.requireNonNull(l);
            t.params_ = l;
            int i4 = 54 / 0;
        } else {
            Objects.requireNonNull(t);
            Objects.requireNonNull(l);
            t.params_ = l;
        }
        int i5 = c;
        int i6 = i5 & 83;
        int i7 = (i5 | 83) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 & i8) + (i7 | i8);
        d = i9 % 128;
        int i10 = i9 % 2;
    }
}
