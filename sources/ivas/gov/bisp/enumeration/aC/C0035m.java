package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035m extends o0OOO0o<C0035m, bdd> implements ab {
    private static final C0035m DEFAULT_INSTANCE;
    private static volatile o000O0<C0035m> PARSER = null;
    private static int b = 0;
    private static int c = 1;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.m$bdd */
    public static final class bdd extends o0OOO0o.OooO00o<C0035m, bdd> implements ab {
        public bdd(bdc bdcVar) {
            super(C0035m.u());
        }
    }

    static {
        C0035m c0035m = new C0035m();
        DEFAULT_INSTANCE = c0035m;
        int i = c;
        int i2 = i & 97;
        int i3 = (i ^ 97) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        b = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0035m.class, c0035m);
        int i6 = b;
        int i7 = ((i6 & 34) + (i6 | 34)) - 1;
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    public static C0035m t(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 79;
        int i4 = ((i2 ^ 79) | i3) << 1;
        int i5 = -((i2 | 79) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        C0035m c0035m = (C0035m) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i8 = b;
        int i9 = ((i8 ^ 5) - (~((i8 & 5) << 1))) - 1;
        c = i9 % 128;
        if (i9 % 2 != 0) {
            return c0035m;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ C0035m u() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = (i2 ^ 45) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        c = i6;
        int i7 = i5 % 2;
        C0035m c0035m = DEFAULT_INSTANCE;
        int i8 = ((i6 | 47) << 1) - (i6 ^ 47);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            return c0035m;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C0035m();
            case 4:
                return new bdd(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0035m> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0035m.class) {
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
