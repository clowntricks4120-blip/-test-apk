package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class J extends o0OOO0o<J, bcU> implements ab {
    private static final J DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile o000O0<J> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 0;
    private static int d = 1;
    private int keySize_;
    private int version_;

    public static final class bcU extends o0OOO0o.OooO00o<J, bcU> implements ab {
        public bcU(bcT bct) {
            super(J.t());
        }
    }

    static {
        J j = new J();
        DEFAULT_INSTANCE = j;
        int i = c;
        int i2 = (i ^ 11) + ((i & 11) << 1);
        d = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(J.class, j);
        int i4 = c;
        int i5 = i4 ^ 3;
        int i6 = ((i4 & 3) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        d = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ J t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 45) + (i2 | 45);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public static J u(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 73;
        int i4 = (((i2 | 73) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        J j2 = (J) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i6 = c;
        int i7 = (((i6 & (-80)) | ((~i6) & 79)) - (~((i6 & 79) << 1))) - 1;
        d = i7 % 128;
        if (i7 % 2 != 0) {
            return j2;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 3:
                return new J();
            case 4:
                return new bcU(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<J> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (J.class) {
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
        int i3 = (i2 & (-126)) | ((~i2) & 125);
        int i4 = (i2 & 125) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        c = i6;
        int i7 = i5 % 2;
        int i8 = this.keySize_;
        int i9 = ((i6 ^ 12) + ((i6 & 12) << 1)) - 1;
        d = i9 % 128;
        if (i9 % 2 != 0) {
            return i8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
