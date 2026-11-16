package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class L extends o0OOO0o<L, bdr> implements ab {
    private static final L DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile o000O0<L> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private static int c = 0;
    private static int d = 1;
    private int hash_;
    private int tagSize_;

    public static final class bdr extends o0OOO0o.OooO00o<L, bdr> implements ab {
        public bdr(bdq bdqVar) {
            super(L.u());
        }
    }

    static {
        L l = new L();
        DEFAULT_INSTANCE = l;
        int i = (-2) - ((d + 92) ^ (-1));
        c = i % 128;
        if (i % 2 != 0) {
            ivas.gov.bisp.enumeration.aD.S.s(L.class, l);
            int i2 = 28 / 0;
        } else {
            ivas.gov.bisp.enumeration.aD.S.s(L.class, l);
        }
        int i3 = c;
        int i4 = i3 & 117;
        int i5 = (((i3 | 117) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static L t() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 71;
        int i4 = ((((i2 ^ 71) | i3) << 1) - (~(-((~i3) & (i2 | 71))))) - 1;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        L l = DEFAULT_INSTANCE;
        int i5 = (i2 & 108) + (i2 | 108);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        c = i6 % 128;
        int i7 = i6 % 2;
        return l;
    }

    public static /* synthetic */ L u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (((i2 | 78) << 1) - (i2 ^ 78)) - 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        L l = DEFAULT_INSTANCE;
        int i5 = ((i2 & 120) + (i2 | 120)) - 1;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return l;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new L();
            case 4:
                return new bdr(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<L> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (L.class) {
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
        int i;
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 + 67;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.tagSize_;
            int i5 = 40 / 0;
        } else {
            i = this.tagSize_;
        }
        int i6 = (i3 & 49) + (i3 | 49);
        d = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final Q x() {
        int i = 2 % 2;
        int i2 = d + 97;
        c = i2 % 128;
        int i3 = i2 % 2;
        Q qD = Q.d(this.hash_);
        if (qD == null) {
            int i4 = c + 5;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                Q q = Q.i;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            qD = Q.i;
        }
        int i5 = c;
        int i6 = ((i5 ^ 43) | (i5 & 43)) << 1;
        int i7 = -(((~i5) & 43) | (i5 & (-44)));
        int i8 = (i6 & i7) + (i7 | i6);
        d = i8 % 128;
        int i9 = i8 % 2;
        return qD;
    }
}
