package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032c extends o0OOO0o<C0032c, bbz> implements ab {
    private static final C0032c DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile o000O0<C0032c> PARSER = null;
    private static int c = 0;
    private static int d = 1;
    private int keySize_;
    private h params_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.c$bbz */
    public static final class bbz extends o0OOO0o.OooO00o<C0032c, bbz> implements ab {
        public bbz(bby bbyVar) {
            super(C0032c.t());
        }
    }

    static {
        C0032c c0032c = new C0032c();
        DEFAULT_INSTANCE = c0032c;
        int i = d;
        int i2 = i & 57;
        int i3 = ((i | 57) & (~i2)) + (i2 << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0032c.class, c0032c);
        int i5 = c;
        int i6 = i5 & 13;
        int i7 = (i5 | 13) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ C0032c t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return DEFAULT_INSTANCE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static C0032c u(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 71;
        int i4 = ((i2 ^ 71) | i3) << 1;
        int i5 = -((i2 | 71) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        c = i6 % 128;
        int i7 = i6 % 2;
        C0032c c0032c = (C0032c) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i8 = d;
        int i9 = i8 & 73;
        int i10 = (i8 | 73) & (~i9);
        int i11 = i9 << 1;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        c = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 61 / 0;
        }
        return c0032c;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C0032c();
            case 4:
                return new bbz(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0032c> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0032c.class) {
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
        int i3 = i2 + 35;
        c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.keySize_;
        int i6 = (i2 ^ 32) + ((i2 & 32) << 1);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    public final h x() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 79;
        int i4 = i3 + ((i2 ^ 79) | i3);
        c = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        h hVarT = this.params_;
        if (hVarT == null) {
            hVarT = h.t();
            int i5 = c;
            int i6 = (i5 ^ 87) + ((i5 & 87) << 1);
            d = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = d;
        int i9 = ((i8 ^ 84) + ((i8 & 84) << 1)) - 1;
        c = i9 % 128;
        if (i9 % 2 == 0) {
            return hVarT;
        }
        obj.hashCode();
        throw null;
    }
}
