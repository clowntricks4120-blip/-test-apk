package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class N extends o0OOO0o<N, bda> implements ab {
    private static final N DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile o000O0<N> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private int version_;

    public static final class bda extends o0OOO0o.OooO00o<N, bda> implements ab {
        public bda() {
            super(N.u());
        }

        public bda(bcZ bcz) {
            super(N.u());
        }
    }

    static {
        N n = new N();
        DEFAULT_INSTANCE = n;
        ivas.gov.bisp.enumeration.aD.S.s(N.class, n);
        int i = c;
        int i2 = i & 41;
        int i3 = (i2 - (~((i ^ 41) | i2))) - 1;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static void t(N n, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 + 119;
        d = i4 % 128;
        int i5 = i4 % 2;
        n.version_ = i;
        int i6 = i3 & 49;
        int i7 = i6 + ((i3 ^ 49) | i6);
        d = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ N u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 99;
        int i4 = i3 + ((i2 ^ 99) | i3);
        c = i4 % 128;
        int i5 = i4 % 2;
        N n = DEFAULT_INSTANCE;
        if (i5 == 0) {
            int i6 = 11 / 0;
        }
        return n;
    }

    public static N w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & (-112)) | ((~i2) & 111);
        int i4 = (i2 & 111) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        c = i5 % 128;
        int i6 = i5 % 2;
        N n = (N) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i7 = d + 105;
        c = i7 % 128;
        if (i7 % 2 != 0) {
            return n;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bda x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        d = i6 % 128;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        bda bdaVar = (bda) DEFAULT_INSTANCE.B();
        int i7 = c + 123;
        d = i7 % 128;
        int i8 = i7 % 2;
        return bdaVar;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 93) + (i2 | 93);
        int i4 = i3 % 128;
        d = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.version_;
        int i6 = i4 ^ 83;
        int i7 = (i4 & 83) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        c = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 39 / 0;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new N();
            case 4:
                return new bda(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<N> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (N.class) {
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
        AbstractC0069z abstractC0069z;
        int i = 2 % 2;
        int i2 = d + 35;
        int i3 = i2 % 128;
        c = i3;
        if (i2 % 2 == 0) {
            abstractC0069z = this.keyValue_;
            int i4 = 55 / 0;
        } else {
            abstractC0069z = this.keyValue_;
        }
        int i5 = (i3 & 35) + (i3 | 35);
        d = i5 % 128;
        int i6 = i5 % 2;
        return abstractC0069z;
    }

    public static void v(N n, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 | 5) << 1) - (~(-(((~i2) & 5) | (i2 & (-6)))))) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(n);
        Objects.requireNonNull(abstractC0069z);
        n.keyValue_ = abstractC0069z;
        int i5 = d + 5;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
