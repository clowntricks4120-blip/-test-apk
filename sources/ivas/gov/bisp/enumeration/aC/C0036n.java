package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.C0048d;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import net.sqlcipher.BuildConfig;

/* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0036n extends o0OOO0o<C0036n, bcj> implements ab {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C0036n DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile o000O0<C0036n> PARSER = null;
    private static int d = 0;
    private static int e = 1;
    private String configName_ = BuildConfig.FLAVOR;
    private o0OO00O.OooO0OO<am> entry_ = C0048d.d;

    /* JADX INFO: renamed from: ivas.gov.bisp.enumeration.aC.n$bcj */
    public static final class bcj extends o0OOO0o.OooO00o<C0036n, bcj> implements ab {
        public bcj(bci bciVar) {
            super(C0036n.t());
        }
    }

    static {
        C0036n c0036n = new C0036n();
        DEFAULT_INSTANCE = c0036n;
        int i = d;
        int i2 = ((i & (-36)) | ((~i) & 35)) + ((i & 35) << 1);
        e = i2 % 128;
        int i3 = i2 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C0036n.class, c0036n);
        int i4 = d;
        int i5 = i4 & 35;
        int i6 = -(-((i4 ^ 35) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        e = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ C0036n t() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        int i6 = i5 % 2;
        C0036n c0036n = DEFAULT_INSTANCE;
        if (i6 != 0) {
            int i7 = 87 / 0;
        }
        return c0036n;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", am.class});
            case 3:
                return new C0036n();
            case 4:
                return new bcj(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C0036n> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C0036n.class) {
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
}
