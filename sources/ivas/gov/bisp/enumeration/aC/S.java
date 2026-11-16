package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class S extends o0OOO0o<S, bdo> implements ab {
    private static final S DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile o000O0<S> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private static int c = 0;
    private static int d = 1;
    private int keySize_;
    private L params_;
    private int version_;

    public static final class bdo extends o0OOO0o.OooO00o<S, bdo> implements ab {
        public bdo(bdn bdnVar) {
            super(S.u());
        }
    }

    static {
        S s = new S();
        DEFAULT_INSTANCE = s;
        int i = d;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        c = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(S.class, s);
        int i6 = d;
        int i7 = (i6 & 95) + (i6 | 95);
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    public static S t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 | 107;
        int i4 = (i3 << 1) - (i3 & (~(i2 & 107)));
        d = i4 % 128;
        int i5 = i4 % 2;
        S s = DEFAULT_INSTANCE;
        int i6 = i2 & 25;
        int i7 = ((i2 ^ 25) | i6) << 1;
        int i8 = -((i2 | 25) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        d = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 7 / 0;
        }
        return s;
    }

    public static /* synthetic */ S u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 ^ 29) | (i2 & 29)) << 1;
        int i4 = -(((~i2) & 29) | (i2 & (-30)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        d = i6;
        int i7 = i5 % 2;
        S s = DEFAULT_INSTANCE;
        int i8 = i6 ^ 9;
        int i9 = -(-((i6 & 9) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        c = i10 % 128;
        int i11 = i10 % 2;
        return s;
    }

    public static S v(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d + 65;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            return (S) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new S();
            case 4:
                return new bdo(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<S> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (S.class) {
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

    public final L x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 115) + (i2 | 115);
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        L lT = this.params_;
        if (lT == null) {
            int i6 = (i4 & 125) + (i4 | 125);
            c = i6 % 128;
            if (i6 % 2 != 0) {
                L.t();
                throw null;
            }
            lT = L.t();
            int i7 = d;
            int i8 = i7 & 11;
            int i9 = (i7 | 11) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            c = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = c;
        int i14 = i13 & 107;
        int i15 = -(-((i13 ^ 107) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        d = i16 % 128;
        int i17 = i16 % 2;
        return lT;
    }

    public final int y() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.keySize_;
        int i6 = ((i2 ^ 53) | (i2 & 53)) << 1;
        int i7 = -(((~i2) & 53) | (i2 & (-54)));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        c = i8 % 128;
        int i9 = i8 % 2;
        return i5;
    }
}
