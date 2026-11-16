package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041t extends o0OOO0o<C0041t, bbU> implements ab {
    private static final C0041t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile o000O0<C0041t> PARSER = null;
    private static int c = 0;
    private static int d = 1;
    private int keySize_;
    private u params_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.t$bbU */
    public static final class bbU extends o0OOO0o.OooO00o<C0041t, bbU> implements ab {
        public bbU(bbT bbt) {
            super(C0041t.t());
        }
    }

    static {
        C0041t c0041t = new C0041t();
        DEFAULT_INSTANCE = c0041t;
        int i = c;
        int i2 = (i & (-16)) | ((~i) & 15);
        int i3 = (i & 15) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        d = i4 % 128;
        if (i4 % 2 != 0) {
            ivas.gov.bisp.enumeration.aD.S.s(C0041t.class, c0041t);
            return;
        }
        ivas.gov.bisp.enumeration.aD.S.s(C0041t.class, c0041t);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ C0041t t() {
        int i = 2 % 2;
        int i2 = d + 121;
        int i3 = i2 % 128;
        c = i3;
        int i4 = i2 % 2;
        C0041t c0041t = DEFAULT_INSTANCE;
        int i5 = i3 + 55;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return c0041t;
        }
        throw null;
    }

    public static C0041t u(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 5;
        int i4 = i2 | 5;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        int i6 = i5 % 2;
        C0041t c0041t = (C0041t) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i7 = d;
        int i8 = (i7 & 37) + (i7 | 37);
        c = i8 % 128;
        if (i8 % 2 == 0) {
            return c0041t;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0041t();
            case 4:
                return new bbU(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0041t> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0041t.class) {
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

    public final int w() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 & (-84)) | ((~i2) & 83);
        int i4 = -(-((i2 & 83) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        c = i6;
        int i7 = i5 % 2;
        int i8 = this.keySize_;
        int i9 = i6 + 73;
        d = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public final u x() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (((i2 ^ 111) | (i2 & 111)) << 1) - ((i2 & (-112)) | ((~i2) & 111));
        c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        u uVar = this.params_;
        if (uVar == null) {
            int i4 = i2 & 91;
            int i5 = (i4 - (~((i2 ^ 91) | i4))) - 1;
            c = i5 % 128;
            int i6 = i5 % 2;
            u uVarT = u.t();
            if (i6 != 0) {
                int i7 = 43 / 0;
            }
            uVar = uVarT;
        }
        int i8 = c + 89;
        d = i8 % 128;
        if (i8 % 2 != 0) {
            return uVar;
        }
        obj.hashCode();
        throw null;
    }
}
