package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040s extends o0OOO0o<C0040s, bcm> implements ab {
    private static final C0040s DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile o000O0<C0040s> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int b = 0;
    private static int c = 1;
    private C0044y params_;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.s$bcm */
    public static final class bcm extends o0OOO0o.OooO00o<C0040s, bcm> implements ab {
        public bcm() {
            super(C0040s.u());
        }

        public bcm(bcl bclVar) {
            super(C0040s.u());
        }
    }

    static {
        C0040s c0040s = new C0040s();
        DEFAULT_INSTANCE = c0040s;
        ivas.gov.bisp.enumeration.aD.S.s(C0040s.class, c0040s);
        int i = c + 35;
        b = i % 128;
        int i2 = i % 2;
    }

    public static void t(C0040s c0040s, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 ^ 59) + ((i3 & 59) << 1);
        c = i4 % 128;
        int i5 = i4 % 2;
        c0040s.version_ = i;
        if (i5 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ C0040s u() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 45;
        int i4 = -(-(i2 | 45));
        int i5 = (i3 & i4) + (i3 | i4);
        c = i5 % 128;
        int i6 = i5 % 2;
        C0040s c0040s = DEFAULT_INSTANCE;
        int i7 = i2 & 109;
        int i8 = ((((i2 ^ 109) | i7) << 1) - (~(-((i2 | 109) & (~i7))))) - 1;
        c = i8 % 128;
        int i9 = i8 % 2;
        return c0040s;
    }

    public static void v(C0040s c0040s, C0044y c0044y) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & 41) + (i2 | 41);
        c = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(c0040s);
        Objects.requireNonNull(c0044y);
        c0040s.params_ = c0044y;
        int i5 = c;
        int i6 = i5 & 73;
        int i7 = ((i5 | 73) & (~i6)) + (i6 << 1);
        b = i7 % 128;
        int i8 = i7 % 2;
    }

    public static C0040s w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (i2 ^ 87) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        c = i5 % 128;
        int i6 = i5 % 2;
        C0040s c0040s = (C0040s) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i7 = c;
        int i8 = i7 & 97;
        int i9 = (i7 | 97) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            return c0040s;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bcm x() {
        int i = 2 % 2;
        int i2 = c + 57;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        bcm bcmVar = (bcm) DEFAULT_INSTANCE.B();
        int i3 = b;
        int i4 = (i3 & (-110)) | ((~i3) & 109);
        int i5 = -(-((i3 & 109) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        c = i6 % 128;
        int i7 = i6 % 2;
        return bcmVar;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 111;
        c = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.version_;
        int i6 = i2 ^ 119;
        int i7 = -(-((i2 & 119) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        c = i8 % 128;
        if (i8 % 2 != 0) {
            return i5;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new C0040s();
            case 4:
                return new bcm(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0040s> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0040s.class) {
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

    public final C0044y z() {
        int i = 2 % 2;
        int i2 = c + 97;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        C0044y c0044yT = this.params_;
        if (c0044yT == null) {
            c0044yT = C0044y.t();
            int i3 = c;
            int i4 = ((i3 | 63) << 1) - (i3 ^ 63);
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = c;
        int i7 = ((i6 | 1) << 1) - (i6 ^ 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return c0044yT;
        }
        throw null;
    }
}
