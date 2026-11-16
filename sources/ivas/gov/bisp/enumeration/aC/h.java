package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o0OOO0o<h, bbC> implements ab {
    private static final h DEFAULT_INSTANCE;
    private static volatile o000O0<h> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private static int b = 0;
    private static int c = 1;
    private int tagSize_;

    public static final class bbC extends o0OOO0o.OooO00o<h, bbC> implements ab {
        public bbC(bbB bbb) {
            super(h.u());
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        int i = c;
        int i2 = i & 3;
        int i3 = (i ^ 3) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(h.class, hVar);
        if (i5 != 0) {
            int i6 = 71 / 0;
        }
        int i7 = c;
        int i8 = (i7 ^ 45) + ((i7 & 45) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    public static h t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 49;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        h hVar = DEFAULT_INSTANCE;
        int i4 = i2 + 71;
        b = i4 % 128;
        int i5 = i4 % 2;
        return hVar;
    }

    public static /* synthetic */ h u() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        h hVar = DEFAULT_INSTANCE;
        if (i4 == 0) {
            int i5 = 27 / 0;
        }
        return hVar;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new h();
            case 4:
                return new bbC(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<h> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (h.class) {
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
        int i2 = b;
        int i3 = i2 & 13;
        int i4 = i3 + ((i2 ^ 13) | i3);
        c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.tagSize_;
        int i7 = i2 ^ 81;
        int i8 = -(-((i2 & 81) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        c = i9 % 128;
        if (i9 % 2 != 0) {
            return i6;
        }
        throw null;
    }
}
