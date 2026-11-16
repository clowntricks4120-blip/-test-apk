package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class z extends o0OOO0o<z, bbR> implements ab {
    private static final z DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile o000O0<z> PARSER = null;
    private static int c = 1;
    private static int d;
    private int ivSize_;

    public static final class bbR extends o0OOO0o.OooO00o<z, bbR> implements ab {
        public bbR(bbQ bbq) {
            super(z.u());
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        ivas.gov.bisp.enumeration.aD.S.s(z.class, zVar);
        int i = d;
        int i2 = (i & 12) + (i | 12);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
    }

    public static z t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 73;
        d = i3 % 128;
        int i4 = i3 % 2;
        z zVar = DEFAULT_INSTANCE;
        int i5 = i2 & 97;
        int i6 = i5 + ((i2 ^ 97) | i5);
        d = i6 % 128;
        if (i6 % 2 == 0) {
            return zVar;
        }
        throw null;
    }

    public static /* synthetic */ z u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 99;
        c = i3 % 128;
        int i4 = i3 % 2;
        z zVar = DEFAULT_INSTANCE;
        int i5 = i2 & 41;
        int i6 = -(-((i2 ^ 41) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        c = i7 % 128;
        int i8 = i7 % 2;
        return zVar;
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
                return new z();
            case 4:
                return new bbR(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<z> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (z.class) {
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
        int i2 = c;
        int i3 = i2 & 61;
        int i4 = (i2 ^ 61) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return this.ivSize_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
