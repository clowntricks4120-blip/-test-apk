package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0031a extends o0OOO0o<C0031a, bcg> implements ab {
    private static final C0031a DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile o000O0<C0031a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private static int c = 0;
    private static int d = 1;
    private int keySize_;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.a$bcg */
    public static final class bcg extends o0OOO0o.OooO00o<C0031a, bcg> implements ab {
        public bcg() {
            super(C0031a.u());
        }

        public bcg(bcf bcfVar) {
            super(C0031a.u());
        }
    }

    static {
        C0031a c0031a = new C0031a();
        DEFAULT_INSTANCE = c0031a;
        int i = d + 117;
        c = i % 128;
        if (i % 2 == 0) {
            ivas.gov.bisp.enumeration.aD.S.s(C0031a.class, c0031a);
        } else {
            ivas.gov.bisp.enumeration.aD.S.s(C0031a.class, c0031a);
            int i2 = 31 / 0;
        }
    }

    public static void t(C0031a c0031a, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = (i3 | 33) << 1;
        int i5 = -(i3 ^ 33);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        c = i6 % 128;
        int i7 = i6 % 2;
        c0031a.keySize_ = i;
        if (i7 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ C0031a u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 | 4) << 1) - (i2 ^ 4)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        C0031a c0031a = DEFAULT_INSTANCE;
        int i5 = (i2 & (-116)) | ((~i2) & 115);
        int i6 = (i2 & 115) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        d = i7 % 128;
        int i8 = i7 % 2;
        return c0031a;
    }

    public static bcg v() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 ^ 1) + ((i2 & 1) << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aD.S.bbs bbsVarB = DEFAULT_INSTANCE.B();
        if (i4 == 0) {
            return (bcg) bbsVarB;
        }
        throw null;
    }

    public static C0031a w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 & 110) + (i2 | 110)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        C0031a c0031a = (C0031a) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i5 = c;
        int i6 = ((i5 & 28) + (i5 | 28)) - 1;
        d = i6 % 128;
        int i7 = i6 % 2;
        return c0031a;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new C0031a();
            case 4:
                return new bcg(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0031a> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0031a.class) {
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
        int i2 = d;
        int i3 = i2 | 83;
        int i4 = (i3 << 1) - ((~(i2 & 83)) & i3);
        int i5 = i4 % 128;
        c = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = this.keySize_;
        int i7 = (i5 & 111) + (i5 | 111);
        d = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }
}
