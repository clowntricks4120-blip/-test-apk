package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043x extends o0OOO0o<C0043x, bdu> implements ab {
    private static final C0043x DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile o000O0<C0043x> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 0;
    private static int d = 1;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.x$bdu */
    public static final class bdu extends o0OOO0o.OooO00o<C0043x, bdu> implements ab {
        public bdu() {
            super(C0043x.u());
        }

        public bdu(bdt bdtVar) {
            super(C0043x.u());
        }
    }

    static {
        C0043x c0043x = new C0043x();
        DEFAULT_INSTANCE = c0043x;
        ivas.gov.bisp.enumeration.aD.S.s(C0043x.class, c0043x);
        int i = d;
        int i2 = (i ^ 57) + ((i & 57) << 1);
        c = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void t(C0043x c0043x, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 & 21;
        int i5 = (i3 ^ 21) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        c = i6 % 128;
        int i7 = i6 % 2;
        c0043x.version_ = i;
        if (i7 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ C0043x u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 4) + ((i2 & 4) << 1)) - 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        C0043x c0043x = DEFAULT_INSTANCE;
        int i5 = i2 & 15;
        int i6 = ((i2 ^ 15) | i5) << 1;
        int i7 = -((i2 | 15) & (~i5));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        c = i8 % 128;
        if (i8 % 2 == 0) {
            return c0043x;
        }
        throw null;
    }

    public static C0043x w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 ^ 9;
        int i4 = ((i2 & 9) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        d = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.aD.S sP = ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        if (i7 != 0) {
            return (C0043x) sP;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bdu x() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 25;
        int i4 = (i3 - (~(-(-((i2 ^ 25) | i3))))) - 1;
        c = i4 % 128;
        int i5 = i4 % 2;
        bdu bduVar = (bdu) DEFAULT_INSTANCE.B();
        int i6 = (-2) - ((d + 96) ^ (-1));
        c = i6 % 128;
        int i7 = i6 % 2;
        return bduVar;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 119;
        int i4 = (i3 - (~((i2 ^ 119) | i3))) - 1;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return this.version_;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C0043x();
            case 4:
                return new bdu(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0043x> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0043x.class) {
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
        int i3 = i2 ^ 93;
        int i4 = (i2 & 93) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return this.keyValue_;
        }
        throw null;
    }

    public static void v(C0043x c0043x, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 55;
        int i4 = (i2 | 55) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        d = i6 % 128;
        if (i6 % 2 != 0) {
            Objects.requireNonNull(c0043x);
            Objects.requireNonNull(abstractC0069z);
            c0043x.keyValue_ = abstractC0069z;
        } else {
            Objects.requireNonNull(c0043x);
            Objects.requireNonNull(abstractC0069z);
            c0043x.keyValue_ = abstractC0069z;
            int i7 = 51 / 0;
        }
    }
}
