package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039r extends o0OOO0o<C0039r, bbF> implements ab {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0039r DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile o000O0<C0039r> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int d = 0;
    private static int e = 1;
    private i aesCtrKey_;
    private T hmacKey_;
    private int version_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.r$bbF */
    public static final class bbF extends o0OOO0o.OooO00o<C0039r, bbF> implements ab {
        public bbF() {
            super(C0039r.u());
        }

        public bbF(bbE bbe) {
            super(C0039r.u());
        }
    }

    static {
        C0039r c0039r = new C0039r();
        DEFAULT_INSTANCE = c0039r;
        int i = e + 95;
        d = i % 128;
        int i2 = i % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0039r.class, c0039r);
        if (i2 != 0) {
            throw null;
        }
    }

    public static void t(C0039r c0039r, int i) {
        int i2 = 2 % 2;
        int i3 = e + 29;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        c0039r.version_ = i;
        int i6 = (((i4 | 73) << 1) - (~(-((i4 & (-74)) | ((~i4) & 73))))) - 1;
        e = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ C0039r u() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (i2 & (-120)) | ((~i2) & 119);
        int i4 = (i2 & 119) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public static void v(C0039r c0039r, T t) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 43;
        int i4 = (((i2 ^ 43) | i3) << 1) - ((i2 | 43) & (~i3));
        d = i4 % 128;
        int i5 = i4 % 2;
        Objects.requireNonNull(c0039r);
        Objects.requireNonNull(t);
        c0039r.hmacKey_ = t;
        int i6 = d;
        int i7 = i6 & 117;
        int i8 = (((i6 ^ 117) | i7) << 1) - ((i6 | 117) & (~i7));
        e = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 66 / 0;
        }
    }

    public static bbF x() {
        int i = 2 % 2;
        int i2 = (-2) - ((d + 74) ^ (-1));
        e = i2 % 128;
        int i3 = i2 % 2;
        bbF bbf = (bbF) DEFAULT_INSTANCE.B();
        int i4 = d;
        int i5 = i4 & 105;
        int i6 = (i4 | 105) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        e = i8 % 128;
        if (i8 % 2 != 0) {
            return bbf;
        }
        throw null;
    }

    public static C0039r y(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 13;
        int i4 = -(-((i2 ^ 13) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        e = i5 % 128;
        if (i5 % 2 != 0) {
            return (C0039r) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        }
        throw null;
    }

    public final i A() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = ((((i2 ^ 67) | (i2 & 67)) << 1) - (~(-(((~i2) & 67) | (i2 & (-68)))))) - 1;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        i iVarX = this.aesCtrKey_;
        if (iVarX == null) {
            int i6 = ((i4 | 11) << 1) - (i4 ^ 11);
            e = i6 % 128;
            int i7 = i6 % 2;
            iVarX = i.x();
            int i8 = d;
            int i9 = (i8 & (-64)) | ((~i8) & 63);
            int i10 = -(-((i8 & 63) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            e = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = d;
        int i14 = (i13 & 43) + (i13 | 43);
        e = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 36 / 0;
        }
        return iVarX;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C0039r();
            case 4:
                return new bbF(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0039r> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0039r.class) {
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

    public final int E() {
        int i = 2 % 2;
        int i2 = e + 102;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        int i6 = this.version_;
        int i7 = (i4 & 67) + (i4 | 67);
        e = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final T F() {
        T tX;
        int i = 2 % 2;
        int i2 = e;
        int i3 = (i2 | 23) << 1;
        int i4 = -(((~i2) & 23) | (i2 & (-24)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        d = i6;
        int i7 = i5 % 2;
        T t = this.hmacKey_;
        if (t == null) {
            int i8 = i6 & 55;
            int i9 = ((((i6 ^ 55) | i8) << 1) - (~(-((i6 | 55) & (~i8))))) - 1;
            e = i9 % 128;
            if (i9 % 2 == 0) {
                tX = T.x();
                int i10 = 74 / 0;
            } else {
                tX = T.x();
            }
            t = tX;
        }
        int i11 = e;
        int i12 = (i11 & (-126)) | ((~i11) & 125);
        int i13 = (i11 & 125) << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        d = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 59 / 0;
        }
        return t;
    }

    public static void w(C0039r c0039r, i iVar) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 117;
        int i4 = (i2 | 117) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        e = i6 % 128;
        if (i6 % 2 == 0) {
            Objects.requireNonNull(c0039r);
            Objects.requireNonNull(iVar);
            c0039r.aesCtrKey_ = iVar;
            throw null;
        }
        Objects.requireNonNull(c0039r);
        Objects.requireNonNull(iVar);
        c0039r.aesCtrKey_ = iVar;
        int i7 = d + 27;
        e = i7 % 128;
        int i8 = i7 % 2;
    }
}
