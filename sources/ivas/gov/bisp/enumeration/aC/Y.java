package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends o0OOO0o<Y, bcO> implements ab {
    private static final Y DEFAULT_INSTANCE;
    private static volatile o000O0<Y> PARSER = null;
    private static int b = 1;
    private static int c;

    public static final class bcO extends o0OOO0o.OooO00o<Y, bcO> implements ab {
        public bcO(bcN bcn) {
            super(Y.u());
        }
    }

    static {
        Y y = new Y();
        DEFAULT_INSTANCE = y;
        int i = b;
        int i2 = ((((i ^ 111) | (i & 111)) << 1) - (~(-(((~i) & 111) | (i & (-112)))))) - 1;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            ivas.gov.bisp.enumeration.aD.S.s(Y.class, y);
            int i3 = 15 / 0;
        } else {
            ivas.gov.bisp.enumeration.aD.S.s(Y.class, y);
        }
        int i4 = b;
        int i5 = (i4 & (-36)) | ((~i4) & 35);
        int i6 = -(-((i4 & 35) << 1));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    public static Y t(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        Y y;
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & (-42)) | ((~i2) & 41)) + ((i2 & 41) << 1);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            y = (Y) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
            int i4 = 65 / 0;
        } else {
            y = (Y) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        }
        int i5 = c;
        int i6 = i5 & 19;
        int i7 = -(-((i5 ^ 19) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        b = i8 % 128;
        int i9 = i8 % 2;
        return y;
    }

    public static /* synthetic */ Y u() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 69) | (i2 & 69)) << 1) - (((~i2) & 69) | (i2 & (-70)));
        int i4 = i3 % 128;
        c = i4;
        int i5 = i3 % 2;
        Y y = DEFAULT_INSTANCE;
        int i6 = i4 & 23;
        int i7 = (i4 | 23) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        b = i9 % 128;
        int i10 = i9 % 2;
        return y;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new Y();
            case 4:
                return new bcO(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<Y> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (Y.class) {
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
}
