package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o0OOO0o<i, bbI> implements ab {
    private static final i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile o000O0<i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private AbstractC0069z keyValue_ = AbstractC0069z.c;
    private z params_;
    private int version_;

    public static final class bbI extends o0OOO0o.OooO00o<i, bbI> implements ab {
        public bbI() {
            super(i.u());
        }

        public bbI(bbH bbh) {
            super(i.u());
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        ivas.gov.bisp.enumeration.aD.S.s(i.class, iVar);
        int i = d;
        int i2 = i & 1;
        int i3 = ((i ^ 1) | i2) << 1;
        int i4 = -((i | 1) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void t(i iVar, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 & 19;
        int i5 = ((i3 ^ 19) | i4) << 1;
        int i6 = -((i3 | 19) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int i8 = i7 % 128;
        c = i8;
        int i9 = i7 % 2;
        iVar.version_ = i;
        int i10 = i8 & 15;
        int i11 = ((i8 ^ 15) | i10) << 1;
        int i12 = -((~i10) & (i8 | 15));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        d = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ i u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = (i2 & 1) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return DEFAULT_INSTANCE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void v(i iVar, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = d + 101;
        c = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(iVar);
        Objects.requireNonNull(abstractC0069z);
        int i4 = d;
        int i5 = ((i4 ^ 5) | (i4 & 5)) << 1;
        int i6 = -((i4 & (-6)) | ((~i4) & 5));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        iVar.keyValue_ = abstractC0069z;
        int i9 = i4 + 51;
        c = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static i x() {
        int i = 2 % 2;
        int i2 = (-2) - ((c + 20) ^ (-1));
        d = i2 % 128;
        int i3 = i2 % 2;
        i iVar = DEFAULT_INSTANCE;
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return iVar;
    }

    public static bbI y() {
        int i = 2 % 2;
        int i2 = c + 1;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        bbI bbi = (bbI) DEFAULT_INSTANCE.B();
        int i3 = c;
        int i4 = ((i3 | 85) << 1) - (i3 ^ 85);
        d = i4 % 128;
        int i5 = i4 % 2;
        return bbi;
    }

    public static i z(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & (-60)) | ((~i2) & 59);
        int i4 = (i2 & 59) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        i iVar = (i) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i6 = d;
        int i7 = (i6 ^ 113) + ((i6 & 113) << 1);
        c = i7 % 128;
        int i8 = i7 % 2;
        return iVar;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new i();
            case 4:
                return new bbI(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<i> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (i.class) {
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

    public final z E() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 & (-96)) | ((~i2) & 95)) - (~((i2 & 95) << 1))) - 1;
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        z zVarT = this.params_;
        if (zVarT == null) {
            int i6 = (i4 & 77) + (i4 | 77);
            c = i6 % 128;
            int i7 = i6 % 2;
            zVarT = z.t();
            int i8 = d + 115;
            c = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = d + 59;
        c = i10 % 128;
        int i11 = i10 % 2;
        return zVarT;
    }

    public final AbstractC0069z F() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        int i5 = i4 % 128;
        d = i5;
        int i6 = i4 % 2;
        AbstractC0069z abstractC0069z = this.keyValue_;
        int i7 = (i5 & 12) + (i5 | 12);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        c = i8 % 128;
        if (i8 % 2 != 0) {
            return abstractC0069z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int G() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 81;
        int i4 = i3 + ((i2 ^ 81) | i3);
        int i5 = i4 % 128;
        c = i5;
        int i6 = i4 % 2;
        int i7 = this.version_;
        int i8 = (i5 & (-22)) | ((~i5) & 21);
        int i9 = (i5 & 21) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        d = i10 % 128;
        int i11 = i10 % 2;
        return i7;
    }

    public static void w(i iVar, z zVar) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = ((i2 | 98) << 1) - (i2 ^ 98);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        d = i4 % 128;
        int i5 = i4 % 2;
        Objects.requireNonNull(iVar);
        Objects.requireNonNull(zVar);
        iVar.params_ = zVar;
        int i6 = c + 75;
        d = i6 % 128;
        int i7 = i6 % 2;
    }
}
