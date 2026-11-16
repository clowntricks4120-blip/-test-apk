package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class u extends o0OOO0o<u, bca> implements ab {
    private static final u DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile o000O0<u> PARSER = null;
    private static int c = 0;
    private static int d = 1;
    private int ivSize_;

    public static final class bca extends o0OOO0o.OooO00o<u, bca> implements ab {
        public bca(bbZ bbz) {
            super(u.u());
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        int i = d;
        int i2 = ((i & (-72)) | ((~i) & 71)) + ((i & 71) << 1);
        c = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(u.class, uVar);
        int i4 = d;
        int i5 = (((i4 | 10) << 1) - (i4 ^ 10)) - 1;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static u t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 ^ 68) + ((i2 & 68) << 1)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        u uVar = DEFAULT_INSTANCE;
        int i5 = i2 & 69;
        int i6 = -(-(i2 | 69));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        d = i7 % 128;
        if (i7 % 2 != 0) {
            return uVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ u u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 15) | (i2 & 15)) << 1;
        int i4 = -(((~i2) & 15) | (i2 & (-16)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        c = i6;
        int i7 = i5 % 2;
        u uVar = DEFAULT_INSTANCE;
        int i8 = i6 + 53;
        d = i8 % 128;
        if (i8 % 2 != 0) {
            return uVar;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new u();
            case 4:
                return new bca(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<u> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (u.class) {
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

    public final int w() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 7) - (~((i2 & 7) << 1))) - 1;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.ivSize_;
        }
        throw null;
    }
}
