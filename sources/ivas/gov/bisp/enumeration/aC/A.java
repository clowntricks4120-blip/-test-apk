package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class A extends o0OOO0o<A, bdh> implements ab {
    private static final A DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile o000O0<A> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static int b = 1;
    private static int c;
    private int outputPrefixType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private AbstractC0069z value_ = AbstractC0069z.c;

    public static final class bdh extends o0OOO0o.OooO00o<A, bdh> implements ab {
        public bdh() {
            super(A.u());
        }

        public bdh(bdg bdgVar) {
            super(A.u());
        }
    }

    static {
        A a = new A();
        DEFAULT_INSTANCE = a;
        int i = c;
        int i2 = ((((i ^ 71) | (i & 71)) << 1) - (~(-(((~i) & 71) | (i & (-72)))))) - 1;
        b = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(A.class, a);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ A u() {
        A a;
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 == 0) {
            a = DEFAULT_INSTANCE;
            int i5 = 22 / 0;
        } else {
            a = DEFAULT_INSTANCE;
        }
        int i6 = i4 & 89;
        int i7 = ((((i4 ^ 89) | i6) << 1) - (~(-((i4 | 89) & (~i6))))) - 1;
        c = i7 % 128;
        if (i7 % 2 == 0) {
            return a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void w(A a, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 119) + ((i2 & 119) << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(a);
        Objects.requireNonNull(abstractC0069z);
        int i5 = c;
        int i6 = (i5 ^ 13) + ((i5 & 13) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        a.value_ = abstractC0069z;
        if (i7 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static A x() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        A a = DEFAULT_INSTANCE;
        int i4 = i2 & 105;
        int i5 = (i2 ^ 105) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        return a;
    }

    public static bdh y() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = (i2 | 109) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        c = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.aD.S.bbs bbsVarB = DEFAULT_INSTANCE.B();
        if (i7 == 0) {
            return (bdh) bbsVarB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String A() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 15;
        int i4 = ((((i2 ^ 15) | i3) << 1) - (~(-((i2 | 15) & (~i3))))) - 1;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        String str = this.typeUrl_;
        int i7 = i5 ^ 41;
        int i8 = -(-((i5 & 41) << 1));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        c = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new A();
            case 4:
                return new bdh(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<A> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (A.class) {
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

    public final D E() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 83) + (i2 | 83);
        b = i3 % 128;
        int i4 = i3 % 2;
        D d = D.d(this.outputPrefixType_);
        if (d == null) {
            int i5 = c + 51;
            b = i5 % 128;
            int i6 = i5 % 2;
            d = D.i;
            int i7 = c;
            int i8 = i7 & 117;
            int i9 = i8 + ((i7 ^ 117) | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = b;
        int i12 = i11 & 27;
        int i13 = (i11 | 27) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 & i14) + (i13 | i14);
        c = i15 % 128;
        int i16 = i15 % 2;
        return d;
    }

    public final AbstractC0069z F() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.value_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void v(A a, D d) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        c = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(a);
        a.outputPrefixType_ = d.c();
        int i5 = c;
        int i6 = (i5 & 121) + (i5 | 121);
        b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static void t(A a, String str) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 ^ 116) + ((i2 & 116) << 1)) - 1;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            Objects.requireNonNull(a);
            Objects.requireNonNull(str);
            a.typeUrl_ = str;
        } else {
            Objects.requireNonNull(a);
            Objects.requireNonNull(str);
            a.typeUrl_ = str;
            throw null;
        }
    }
}
