package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class P extends o0OOO0o<P, bbO> implements ab {
    private static final P DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile o000O0<P> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private u params_;
    private int version_;

    public static final class bbO extends o0OOO0o.OooO00o<P, bbO> implements ab {
        public bbO() {
            super(P.u());
        }

        public bbO(bbN bbn) {
            super(P.u());
        }
    }

    static {
        P p = new P();
        DEFAULT_INSTANCE = p;
        int i = d;
        int i2 = i & 11;
        int i3 = (i ^ 11) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        c = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(P.class, p);
        if (i5 == 0) {
            throw null;
        }
    }

    public static void t(P p, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = (i3 ^ 65) + ((i3 & 65) << 1);
        d = i4 % 128;
        int i5 = i4 % 2;
        p.version_ = i;
        int i6 = i3 & 113;
        int i7 = ((i3 ^ 113) | i6) << 1;
        int i8 = -((~i6) & (i3 | 113));
        int i9 = (i7 & i8) + (i7 | i8);
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ P u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (-2) - ((i2 + 24) ^ (-1));
        d = i3 % 128;
        int i4 = i3 % 2;
        P p = DEFAULT_INSTANCE;
        int i5 = ((i2 ^ 105) | (i2 & 105)) << 1;
        int i6 = -(((~i2) & 105) | (i2 & (-106)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        d = i7 % 128;
        if (i7 % 2 == 0) {
            return p;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void v(P p, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 113;
        int i4 = ((i2 ^ 113) | i3) << 1;
        int i5 = -((i2 | 113) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        c = i6 % 128;
        int i7 = i6 % 2;
        Objects.requireNonNull(p);
        Objects.requireNonNull(abstractC0069z);
        int i8 = c;
        int i9 = ((i8 ^ 119) | (i8 & 119)) << 1;
        int i10 = -((i8 & (-120)) | ((~i8) & 119));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        d = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            p.keyValue_ = abstractC0069z;
            throw null;
        }
        p.keyValue_ = abstractC0069z;
        int i12 = (-2) - ((i8 + 94) ^ (-1));
        d = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static bbO x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & 102) + (i2 | 102)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        bbO bbo = (bbO) DEFAULT_INSTANCE.B();
        int i5 = c;
        int i6 = i5 & 55;
        int i7 = (i5 | 55) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        d = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 38 / 0;
        }
        return bbo;
    }

    public static P y(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c + 27;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return (P) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AbstractC0069z A() {
        AbstractC0069z abstractC0069z;
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 & 38) + (i2 | 38)) - 1;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            abstractC0069z = this.keyValue_;
            int i4 = 63 / 0;
        } else {
            abstractC0069z = this.keyValue_;
        }
        int i5 = i2 & 33;
        int i6 = -(-((i2 ^ 33) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        c = i7 % 128;
        if (i7 % 2 != 0) {
            return abstractC0069z;
        }
        Object obj = null;
        obj.hashCode();
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
                return new P();
            case 4:
                return new bbO(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<P> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (P.class) {
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

    public final int E() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 ^ 123) | (i2 & 123)) << 1;
        int i4 = -((i2 & (-124)) | ((~i2) & 123));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        d = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.version_;
        int i8 = (i2 ^ 71) + ((i2 & 71) << 1);
        d = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final u F() {
        u uVarT;
        int i = 2 % 2;
        int i2 = c + 27;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            uVarT = this.params_;
            int i3 = 34 / 0;
            if (uVarT == null) {
                uVarT = u.t();
                int i4 = d + 67;
                c = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            uVarT = this.params_;
            if (uVarT == null) {
                uVarT = u.t();
                int i6 = d + 67;
                c = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = c;
        int i9 = i8 ^ 69;
        int i10 = -(-((i8 & 69) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        d = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 38 / 0;
        }
        return uVarT;
    }

    public static void w(P p, u uVar) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(p);
        Objects.requireNonNull(uVar);
        int i5 = c;
        int i6 = (i5 ^ 53) + ((i5 & 53) << 1);
        d = i6 % 128;
        int i7 = i6 % 2;
        p.params_ = uVar;
        int i8 = i5 & 81;
        int i9 = (~i8) & (i5 | 81);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        d = i11 % 128;
        int i12 = i11 % 2;
    }
}
