package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034l extends o0OOO0o<C0034l, bbX> implements ab {
    private static final C0034l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile o000O0<C0034l> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.l$bbX */
    public static final class bbX extends o0OOO0o.OooO00o<C0034l, bbX> implements ab {
        public bbX() {
            super(C0034l.u());
        }

        public bbX(bbW bbw) {
            super(C0034l.u());
        }
    }

    static {
        C0034l c0034l = new C0034l();
        DEFAULT_INSTANCE = c0034l;
        int i = d;
        int i2 = i & 7;
        int i3 = i2 + ((i ^ 7) | i2);
        c = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0034l.class, c0034l);
        int i5 = c;
        int i6 = i5 & 1;
        int i7 = (((i5 | 1) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
        d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 25 / 0;
        }
    }

    public static void t(C0034l c0034l, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = (((i3 & (-110)) | ((~i3) & 109)) - (~(-(-((i3 & 109) << 1))))) - 1;
        int i5 = i4 % 128;
        d = i5;
        int i6 = i4 % 2;
        c0034l.version_ = i;
        int i7 = (-2) - ((i5 + 94) ^ (-1));
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ C0034l u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        c = i3 % 128;
        int i4 = i3 % 2;
        C0034l c0034l = DEFAULT_INSTANCE;
        int i5 = i2 & 107;
        int i6 = -(-((i2 ^ 107) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        c = i7 % 128;
        int i8 = i7 % 2;
        return c0034l;
    }

    public static C0034l w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & 9) + (i2 | 9);
        c = i3 % 128;
        int i4 = i3 % 2;
        C0034l c0034l = (C0034l) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i5 = c + 71;
        d = i5 % 128;
        int i6 = i5 % 2;
        return c0034l;
    }

    public static bbX x() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 15;
        int i4 = (i2 | 15) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        c = i6 % 128;
        int i7 = i6 % 2;
        bbX bbx = (bbX) DEFAULT_INSTANCE.B();
        int i8 = d;
        int i9 = i8 & 61;
        int i10 = (i8 ^ 61) | i9;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        c = i11 % 128;
        if (i11 % 2 != 0) {
            return bbx;
        }
        throw null;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.version_;
        int i6 = i2 ^ 59;
        int i7 = -(-((i2 & 59) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        c = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 23 / 0;
        }
        return i5;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C0034l();
            case 4:
                return new bbX(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0034l> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0034l.class) {
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

    public final AbstractC0069z z() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 45;
        int i4 = (i2 ^ 45) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return this.keyValue_;
        }
        int i6 = 89 / 0;
        return this.keyValue_;
    }

    public static void v(C0034l c0034l, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 51;
        int i4 = (i3 - (~(-(-((i2 ^ 51) | i3))))) - 1;
        c = i4 % 128;
        int i5 = i4 % 2;
        Objects.requireNonNull(c0034l);
        Objects.requireNonNull(abstractC0069z);
        c0034l.keyValue_ = abstractC0069z;
        int i6 = d;
        int i7 = i6 & 31;
        int i8 = (i6 ^ 31) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        c = i9 % 128;
        int i10 = i9 % 2;
    }
}
