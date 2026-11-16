package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037o extends o0OOO0o<C0037o, bcd> implements ab {
    private static final C0037o DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile o000O0<C0037o> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.o$bcd */
    public static final class bcd extends o0OOO0o.OooO00o<C0037o, bcd> implements ab {
        public bcd() {
            super(C0037o.u());
        }

        public bcd(bcc bccVar) {
            super(C0037o.u());
        }
    }

    static {
        C0037o c0037o = new C0037o();
        DEFAULT_INSTANCE = c0037o;
        int i = d;
        int i2 = i & 123;
        int i3 = -(-((i ^ 123) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        c = i4 % 128;
        if (i4 % 2 == 0) {
            ivas.gov.bisp.enumeration.aD.S.s(C0037o.class, c0037o);
            int i5 = 57 / 0;
        } else {
            ivas.gov.bisp.enumeration.aD.S.s(C0037o.class, c0037o);
        }
        int i6 = c + 115;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void t(C0037o c0037o, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 25;
        int i5 = (i4 - (~(-(-((i3 ^ 25) | i4))))) - 1;
        d = i5 % 128;
        int i6 = i5 % 2;
        c0037o.version_ = i;
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ C0037o u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 | 47;
        int i4 = ((i3 << 1) - (~(-((~(i2 & 47)) & i3)))) - 1;
        int i5 = i4 % 128;
        d = i5;
        int i6 = i4 % 2;
        C0037o c0037o = DEFAULT_INSTANCE;
        int i7 = (((i5 & (-66)) | ((~i5) & 65)) - (~((i5 & 65) << 1))) - 1;
        c = i7 % 128;
        if (i7 % 2 != 0) {
            return c0037o;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void v(C0037o c0037o, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((((i2 ^ 51) | (i2 & 51)) << 1) - (~(-(((~i2) & 51) | (i2 & (-52)))))) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(c0037o);
        Objects.requireNonNull(abstractC0069z);
        int i5 = d;
        int i6 = ((i5 | 126) << 1) - (i5 ^ 126);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        c0037o.keyValue_ = abstractC0069z;
        int i9 = i5 & 97;
        int i10 = (((~i9) & (i5 | 97)) - (~(-(-(i9 << 1))))) - 1;
        c = i10 % 128;
        int i11 = i10 % 2;
    }

    public static C0037o w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 47;
        int i4 = -(-((i2 ^ 47) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        C0037o c0037o = (C0037o) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i7 = d;
        int i8 = i7 & 43;
        int i9 = (i7 ^ 43) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        c = i10 % 128;
        if (i10 % 2 != 0) {
            return c0037o;
        }
        throw null;
    }

    public static bcd x() {
        int i = 2 % 2;
        int i2 = c + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        bcd bcdVar = (bcd) DEFAULT_INSTANCE.B();
        int i4 = d;
        int i5 = (((i4 | 48) << 1) - (i4 ^ 48)) - 1;
        c = i5 % 128;
        int i6 = i5 % 2;
        return bcdVar;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 24;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.version_;
        int i7 = i2 & 89;
        int i8 = i7 + ((i2 ^ 89) | i7);
        d = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 93 / 0;
        }
        return i6;
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
                return new C0037o();
            case 4:
                return new bcd(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0037o> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0037o.class) {
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
        int i3 = (-2) - (((i2 & 122) + (i2 | 122)) ^ (-1));
        d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        AbstractC0069z abstractC0069z = this.keyValue_;
        int i4 = ((i2 & 20) + (i2 | 20)) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        return abstractC0069z;
    }
}
