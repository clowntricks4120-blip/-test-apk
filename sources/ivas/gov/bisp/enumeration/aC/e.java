package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o0OOO0o<e, bbt> implements ab {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile o000O0<e> PARSER = null;
    private static int d = 0;
    private static int e = 1;
    private C0038p aesCtrKeyFormat_;
    private S hmacKeyFormat_;

    public static final class bbt extends o0OOO0o.OooO00o<e, bbt> implements ab {
        public bbt(bbp bbpVar) {
            super(e.t());
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        ivas.gov.bisp.enumeration.aD.S.s(e.class, eVar);
        int i = d + 57;
        e = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ e t() {
        int i = 2 % 2;
        int i2 = e + 3;
        int i3 = i2 % 128;
        d = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        e eVar = DEFAULT_INSTANCE;
        int i4 = i3 & 43;
        int i5 = (i3 ^ 43) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        e = i6 % 128;
        if (i6 % 2 != 0) {
            return eVar;
        }
        obj.hashCode();
        throw null;
    }

    public static e u(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 23;
        int i4 = i3 + ((i2 ^ 23) | i3);
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return (e) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        }
        e eVar = (e) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i5 = 74 / 0;
        return eVar;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new e();
            case 4:
                return new bbt(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<e> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (e.class) {
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

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    public final C0038p w() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = ((i2 ^ 81) | (i2 & 81)) << 1;
        int i4 = -(((~i2) & 81) | (i2 & (-82)));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        d = i6;
        int i7 = i5 % 2;
        C0038p c0038pT = this.aesCtrKeyFormat_;
        if (i7 != 0) {
            int i8 = 83 / 0;
            if (c0038pT == null) {
                int i9 = (i6 ^ 63) + ((i6 & 63) << 1);
                e = i9 % 128;
                int i10 = i9 % 2;
                c0038pT = C0038p.t();
                int i11 = d;
                int i12 = i11 ^ 103;
                int i13 = -(-((i11 & 103) << 1));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                e = i14 % 128;
                int i15 = i14 % 2;
            }
        } else if (c0038pT == null) {
            int i16 = (i6 ^ 63) + ((i6 & 63) << 1);
            e = i16 % 128;
            int i17 = i16 % 2;
            c0038pT = C0038p.t();
            int i18 = d;
            int i19 = i18 ^ 103;
            int i110 = -(-((i18 & 103) << 1));
            int i111 = ((i19 | i110) << 1) - (i110 ^ i19);
            e = i111 % 128;
            int i112 = i111 % 2;
        }
        int i20 = e + 55;
        d = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 35 / 0;
        }
        return c0038pT;
    }

    public final S x() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = (((i2 | 66) << 1) - (i2 ^ 66)) - 1;
        d = i3 % 128;
        int i4 = i3 % 2;
        S sT = this.hmacKeyFormat_;
        if (sT == null) {
            int i5 = (i2 & 93) + (i2 | 93);
            d = i5 % 128;
            int i6 = i5 % 2;
            sT = S.t();
            int i7 = e;
            int i8 = (-2) - ((((i7 | 84) << 1) - (i7 ^ 84)) ^ (-1));
            d = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = d;
        int i11 = ((i10 & 31) - (~(i10 | 31))) - 1;
        e = i11 % 128;
        if (i11 % 2 != 0) {
            return sT;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
