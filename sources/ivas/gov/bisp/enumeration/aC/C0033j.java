package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.C0065v;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0033j extends o0OOO0o<C0033j, bbw> implements ab {
    private static final C0033j DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile o000O0<C0033j> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private h params_;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.j$bbw */
    public static final class bbw extends o0OOO0o.OooO00o<C0033j, bbw> implements ab {
        public bbw() {
            super(C0033j.u());
        }

        public bbw(bbv bbvVar) {
            super(C0033j.u());
        }
    }

    static {
        C0033j c0033j = new C0033j();
        DEFAULT_INSTANCE = c0033j;
        int i = c;
        int i2 = ((i | 11) << 1) - (i ^ 11);
        d = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0033j.class, c0033j);
        int i4 = c;
        int i5 = i4 & 61;
        int i6 = (i4 ^ 61) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        d = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void t(C0033j c0033j, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = (i3 ^ 57) + ((i3 & 57) << 1);
        int i5 = i4 % 128;
        d = i5;
        int i6 = i4 % 2;
        c0033j.version_ = i;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 & 41;
        int i8 = i5 | 41;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        c = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ C0033j u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        d = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0033j c0033j = DEFAULT_INSTANCE;
        int i6 = (i2 & 69) + (i2 | 69);
        d = i6 % 128;
        int i7 = i6 % 2;
        return c0033j;
    }

    public static bbw x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & 100) + (i2 | 100)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        bbw bbwVar = (bbw) DEFAULT_INSTANCE.B();
        int i5 = c + 95;
        d = i5 % 128;
        int i6 = i5 % 2;
        return bbwVar;
    }

    public static C0033j y(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) throws C0065v {
        C0033j c0033j;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 7;
        int i4 = ((i2 ^ 7) | i3) << 1;
        int i5 = -((i2 | 7) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        c = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.aD.S sP = ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        if (i7 == 0) {
            c0033j = (C0033j) sP;
            int i8 = 82 / 0;
        } else {
            c0033j = (C0033j) sP;
        }
        int i9 = c + 51;
        d = i9 % 128;
        int i10 = i9 % 2;
        return c0033j;
    }

    public final AbstractC0069z A() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 51;
        int i4 = i3 + ((i2 ^ 51) | i3);
        int i5 = i4 % 128;
        c = i5;
        int i6 = i4 % 2;
        AbstractC0069z abstractC0069z = this.keyValue_;
        int i7 = (i5 ^ 1) + ((i5 & 1) << 1);
        d = i7 % 128;
        if (i7 % 2 == 0) {
            return abstractC0069z;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0033j();
            case 4:
                return new bbw(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0033j> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0033j.class) {
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
        int i2 = (-2) - ((d + 84) ^ (-1));
        c = i2 % 128;
        if (i2 % 2 != 0) {
            return this.version_;
        }
        throw null;
    }

    public final h F() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 33;
        int i4 = -(-((i2 ^ 33) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        c = i5 % 128;
        int i6 = i5 % 2;
        h hVarT = this.params_;
        if (hVarT == null) {
            int i7 = i2 + 115;
            c = i7 % 128;
            int i8 = i7 % 2;
            hVarT = h.t();
            int i9 = d;
            int i10 = ((i9 & 26) + (i9 | 26)) - 1;
            c = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = c;
        int i13 = (((i12 ^ 19) | (i12 & 19)) << 1) - (((~i12) & 19) | (i12 & (-20)));
        d = i13 % 128;
        int i14 = i13 % 2;
        return hVarT;
    }

    public static void v(C0033j c0033j, h hVar) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (-2) - (((i2 & 124) + (i2 | 124)) ^ (-1));
        c = i3 % 128;
        if (i3 % 2 == 0) {
            Objects.requireNonNull(c0033j);
            Objects.requireNonNull(hVar);
            c0033j.params_ = hVar;
            throw null;
        }
        Objects.requireNonNull(c0033j);
        Objects.requireNonNull(hVar);
        c0033j.params_ = hVar;
        int i4 = c;
        int i5 = i4 & 29;
        int i6 = (i5 - (~(-(-((i4 ^ 29) | i5))))) - 1;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void w(C0033j c0033j, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 77;
        int i4 = ((i2 | 77) & (~i3)) + (i3 << 1);
        d = i4 % 128;
        if (i4 % 2 != 0) {
            Objects.requireNonNull(c0033j);
            Objects.requireNonNull(abstractC0069z);
            int i5 = 34 / 0;
        } else {
            Objects.requireNonNull(c0033j);
            Objects.requireNonNull(abstractC0069z);
        }
        int i6 = c;
        int i7 = i6 & 93;
        int i8 = ((i6 ^ 93) | i7) << 1;
        int i9 = -((i6 | 93) & (~i7));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        d = i10 % 128;
        int i11 = i10 % 2;
        c0033j.keyValue_ = abstractC0069z;
        if (i11 != 0) {
            int i12 = 71 / 0;
        }
    }
}
