package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class M extends o0OOO0o<M, bcX> implements ab {
    private static final M DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile o000O0<M> PARSER = null;
    private static int c = 0;
    private static int d = 1;
    private int keySize_;

    public static final class bcX extends o0OOO0o.OooO00o<M, bcX> implements ab {
        public bcX() {
            super(M.u());
        }

        public bcX(bcW bcw) {
            super(M.u());
        }
    }

    static {
        M m = new M();
        DEFAULT_INSTANCE = m;
        ivas.gov.bisp.enumeration.aD.S.s(M.class, m);
        int i = c;
        int i2 = (i ^ 48) + ((i & 48) << 1);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void t(M m, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (i3 & 81) + (i3 | 81);
        c = i4 % 128;
        int i5 = i4 % 2;
        m.keySize_ = i;
        if (i5 != 0) {
            int i6 = 0 / 0;
        }
    }

    public static /* synthetic */ M u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        M m = DEFAULT_INSTANCE;
        int i5 = i2 + 7;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return m;
        }
        throw null;
    }

    public static bcX v() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 4) << 1) - (i2 ^ 4);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        c = i4 % 128;
        if (i4 % 2 == 0) {
            return (bcX) DEFAULT_INSTANCE.B();
        }
        throw null;
    }

    public static M w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & (-38)) | ((~i2) & 37);
        int i4 = (i2 & 37) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return (M) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 3:
                return new M();
            case 4:
                return new bcX(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<M> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (M.class) {
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

    public final int y() {
        int i = 2 % 2;
        int i2 = d + 88;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.keySize_;
        }
        throw null;
    }
}
