package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class W extends o0OOO0o<W, bcz> implements ab {
    private static final W DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile o000O0<W> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static int b = 1;
    private static int c;
    private al params_;
    private int version_;

    public static final class bcz extends o0OOO0o.OooO00o<W, bcz> implements ab {
        public bcz() {
            super(W.u());
        }

        public bcz(bcy bcyVar) {
            super(W.u());
        }
    }

    static {
        W w = new W();
        DEFAULT_INSTANCE = w;
        int i = b;
        int i2 = i & 113;
        int i3 = i | 113;
        int i4 = (i2 & i3) + (i3 | i2);
        c = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(W.class, w);
        int i6 = b;
        int i7 = i6 & 103;
        int i8 = (i6 ^ 103) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        c = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void t(W w, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 29;
        c = i4 % 128;
        int i5 = i4 % 2;
        w.version_ = i;
        int i6 = (((i3 & (-86)) | ((~i3) & 85)) - (~(-(-((i3 & 85) << 1))))) - 1;
        c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
    }

    public static /* synthetic */ W u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 | 77;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 77)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        W w = DEFAULT_INSTANCE;
        int i9 = i7 & 67;
        int i10 = ((i7 | 67) & (~i9)) + (i9 << 1);
        c = i10 % 128;
        if (i10 % 2 == 0) {
            return w;
        }
        throw null;
    }

    public static W w(AbstractC0069z abstractC0069z, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (((i2 ^ 69) | (i2 & 69)) << 1) - (((~i2) & 69) | (i2 & (-70)));
        b = i3 % 128;
        int i4 = i3 % 2;
        W w = (W) ivas.gov.bisp.enumeration.aD.S.p(DEFAULT_INSTANCE, abstractC0069z, j);
        int i5 = c;
        int i6 = i5 & 15;
        int i7 = -(-((i5 ^ 15) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        int i9 = i8 % 2;
        return w;
    }

    public static bcz x() {
        int i = 2 % 2;
        int i2 = b + 37;
        c = i2 % 128;
        int i3 = i2 % 2;
        bcz bczVar = (bcz) DEFAULT_INSTANCE.B();
        int i4 = b;
        int i5 = i4 ^ 25;
        int i6 = ((i4 & 25) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        c = i8 % 128;
        if (i8 % 2 == 0) {
            return bczVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 107;
        int i4 = ((i2 ^ 107) | i3) << 1;
        int i5 = -((i2 | 107) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        c = i6 % 128;
        if (i6 % 2 == 0) {
            return this.version_;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new W();
            case 4:
                return new bcz(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<W> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (W.class) {
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

    public final al z() {
        al alVarT;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 17;
        int i4 = (((i2 ^ 17) | i3) << 1) - ((i2 | 17) & (~i3));
        int i5 = i4 % 128;
        c = i5;
        int i6 = i4 % 2;
        al alVar = this.params_;
        if (alVar == null) {
            int i7 = i5 + 83;
            b = i7 % 128;
            if (i7 % 2 == 0) {
                alVarT = al.t();
                int i8 = 23 / 0;
            } else {
                alVarT = al.t();
            }
            alVar = alVarT;
        }
        int i9 = c;
        int i10 = (i9 ^ 43) + ((i9 & 43) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 22 / 0;
        }
        return alVar;
    }

    public static void v(W w, al alVar) {
        int i = 2 % 2;
        int i2 = b + 3;
        c = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(w);
            Objects.requireNonNull(alVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(w);
        Objects.requireNonNull(alVar);
        w.params_ = alVar;
        int i3 = b + 39;
        c = i3 % 128;
        int i4 = i3 % 2;
    }
}
