package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038p extends o0OOO0o<C0038p, bbL> implements ab {
    private static final C0038p DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile o000O0<C0038p> PARSER = null;
    private static int c = 1;
    private static int d;
    private int keySize_;
    private z params_;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.p$bbL */
    public static final class bbL extends o0OOO0o.OooO00o<C0038p, bbL> implements ab {
        public bbL(bbK bbk) {
            super(C0038p.u());
        }
    }

    static {
        C0038p c0038p = new C0038p();
        DEFAULT_INSTANCE = c0038p;
        int i = c;
        int i2 = (i ^ 19) + ((i & 19) << 1);
        d = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0038p.class, c0038p);
        int i4 = d;
        int i5 = ((i4 & 106) + (i4 | 106)) - 1;
        c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static C0038p t() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 97;
        int i4 = (~i3) & (i2 | 97);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        d = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            throw null;
        }
        C0038p c0038p = DEFAULT_INSTANCE;
        int i7 = i2 ^ 11;
        int i8 = ((i2 & 11) | i7) << 1;
        int i9 = -i7;
        int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
        d = i10 % 128;
        if (i10 % 2 == 0) {
            return c0038p;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ C0038p u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 | 97;
        int i4 = (i3 << 1) - ((~(i2 & 97)) & i3);
        int i5 = i4 % 128;
        c = i5;
        int i6 = i4 % 2;
        C0038p c0038p = DEFAULT_INSTANCE;
        int i7 = i5 ^ 85;
        int i8 = ((i5 & 85) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 & i9) + (i8 | i9);
        d = i10 % 128;
        int i11 = i10 % 2;
        return c0038p;
    }

    public static C0038p v(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 49) + (i2 | 49);
        d = i3 % 128;
        int i4 = i3 % 2;
        C0038p c0038p = (C0038p) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i5 = d;
        int i6 = i5 & 57;
        int i7 = ((i5 | 57) & (~i6)) + (i6 << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        return c0038p;
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
                return new C0038p();
            case 4:
                return new bbL(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0038p> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0038p.class) {
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

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final z x() {
        z zVarT;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 101;
        int i4 = (i2 | 101) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = i6 % 128;
        c = i7;
        if (i6 % 2 == 0) {
            zVarT = this.params_;
            int i8 = 20 / 0;
            if (zVarT == null) {
                int i9 = (((i7 | 112) << 1) - (i7 ^ 112)) - 1;
                d = i9 % 128;
                int i10 = i9 % 2;
                zVarT = z.t();
                int i11 = d;
                int i12 = ((i11 ^ 39) - (~(-(-((i11 & 39) << 1))))) - 1;
                c = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            zVarT = this.params_;
            if (zVarT == null) {
                int i14 = (((i7 | 112) << 1) - (i7 ^ 112)) - 1;
                d = i14 % 128;
                int i15 = i14 % 2;
                zVarT = z.t();
                int i16 = d;
                int i17 = ((i16 ^ 39) - (~(-(-((i16 & 39) << 1))))) - 1;
                c = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = d;
        int i20 = i19 & 13;
        int i21 = (i20 - (~((i19 ^ 13) | i20))) - 1;
        c = i21 % 128;
        if (i21 % 2 != 0) {
            return zVarT;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int y() {
        int i = 2 % 2;
        int i2 = d + 69;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            return this.keySize_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
