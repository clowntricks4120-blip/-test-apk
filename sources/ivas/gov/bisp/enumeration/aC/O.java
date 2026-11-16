package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class O extends o0OOO0o<O, bdA> implements ab {
    private static final O DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile o000O0<O> PARSER = null;
    private static int d = 1;
    private static int e;
    private AbstractC0069z encryptedKeyset_ = AbstractC0069z.c;
    private C keysetInfo_;

    public static final class bdA extends o0OOO0o.OooO00o<O, bdA> implements ab {
        public bdA() {
            super(O.u());
        }

        public bdA(bdz bdzVar) {
            super(O.u());
        }
    }

    static {
        O o2 = new O();
        DEFAULT_INSTANCE = o2;
        int i = (-2) - ((d + 60) ^ (-1));
        e = i % 128;
        int i2 = i % 2;
        ivas.gov.bisp.enumeration.aD.S.s(O.class, o2);
        int i3 = d;
        int i4 = (i3 ^ 33) + ((i3 & 33) << 1);
        e = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ O u() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 | 123;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 123)));
        int i6 = (i4 & i5) + (i5 | i4);
        d = i6 % 128;
        int i7 = i6 % 2;
        O o2 = DEFAULT_INSTANCE;
        int i8 = i2 & 65;
        int i9 = -(-((i2 ^ 65) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        d = i10 % 128;
        int i11 = i10 % 2;
        return o2;
    }

    public static bdA w() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 9;
        int i4 = (i3 - (~(-(-((i2 ^ 9) | i3))))) - 1;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        bdA bda = (bdA) DEFAULT_INSTANCE.B();
        int i5 = d;
        int i6 = (-2) - ((((i5 | 24) << 1) - (i5 ^ 24)) ^ (-1));
        e = i6 % 128;
        int i7 = i6 % 2;
        return bda;
    }

    public static O x(byte[] bArr, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = e + 32;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aD.S sR = ivas.gov.bisp.enumeration.aD.S.r(DEFAULT_INSTANCE, bArr, j);
        if (i4 != 0) {
            return (O) sR;
        }
        int i5 = 95 / 0;
        return (O) sR;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new O();
            case 4:
                return new bdA(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<O> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (O.class) {
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
        int i2 = d;
        int i3 = i2 & 81;
        int i4 = -(-((i2 ^ 81) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        e = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0069z abstractC0069z = this.encryptedKeyset_;
        if (i6 != 0) {
            int i7 = 72 / 0;
        }
        return abstractC0069z;
    }

    public static void t(O o2, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = ((i2 ^ 17) | (i2 & 17)) << 1;
        int i4 = -(((~i2) & 17) | (i2 & (-18)));
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(o2);
        Objects.requireNonNull(abstractC0069z);
        o2.encryptedKeyset_ = abstractC0069z;
        int i7 = d + 126;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        e = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static void v(O o2, C c) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 41;
        int i4 = i3 + ((i2 ^ 41) | i3);
        d = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Objects.requireNonNull(o2);
            Objects.requireNonNull(c);
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(o2);
        Objects.requireNonNull(c);
        o2.keysetInfo_ = c;
        int i5 = e;
        int i6 = ((i5 ^ 14) + ((i5 & 14) << 1)) - 1;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
