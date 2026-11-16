package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044y extends o0OOO0o<C0044y, bcC> implements ab {
    private static final C0044y DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile o000O0<C0044y> PARSER = null;
    private static int c = 0;
    private static int d = 1;
    private String keyUri_ = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.y$bcC */
    public static final class bcC extends o0OOO0o.OooO00o<C0044y, bcC> implements ab {
        public bcC(bcB bcb) {
            super(C0044y.u());
        }
    }

    static {
        C0044y c0044y = new C0044y();
        DEFAULT_INSTANCE = c0044y;
        int i = d;
        int i2 = (((i & (-108)) | ((~i) & 107)) - (~(-(-((i & 107) << 1))))) - 1;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            ivas.gov.bisp.enumeration.aD.S.s(C0044y.class, c0044y);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.aD.S.s(C0044y.class, c0044y);
        int i3 = d;
        int i4 = (((i3 ^ 1) | (i3 & 1)) << 1) - (((~i3) & 1) | (i3 & (-2)));
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    public static C0044y t() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & (-124)) | ((~i2) & 123);
        int i4 = (i2 & 123) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        c = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        C0044y c0044y = DEFAULT_INSTANCE;
        int i7 = (i6 & 74) + (i6 | 74);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        d = i8 % 128;
        int i9 = i8 % 2;
        return c0044y;
    }

    public static /* synthetic */ C0044y u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 59) | (i2 & 59)) << 1;
        int i4 = -(((~i2) & 59) | (i2 & (-60)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        c = i6;
        int i7 = i5 % 2;
        C0044y c0044y = DEFAULT_INSTANCE;
        if (i7 != 0) {
            int i8 = 25 / 0;
        }
        int i9 = (-2) - ((i6 + 34) ^ (-1));
        d = i9 % 128;
        int i10 = i9 % 2;
        return c0044y;
    }

    public static C0044y v(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 123;
        int i4 = (i2 | 123) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        c = i6 % 128;
        int i7 = i6 % 2;
        C0044y c0044y = (C0044y) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i8 = d;
        int i9 = i8 & 79;
        int i10 = i8 | 79;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        c = i11 % 128;
        if (i11 % 2 == 0) {
            return c0044y;
        }
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new C0044y();
            case 4:
                return new bcC(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0044y> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0044y.class) {
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

    public final String x() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 37;
        int i4 = ((~i3) & (i2 | 37)) + (i3 << 1);
        c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.keyUri_;
        int i6 = (i2 & 100) + (i2 | 100);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }
}
