package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class am extends o0OOO0o<am, bcR> implements ab {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final am DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile o000O0<am> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private static int e = 1;
    private static int f;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = BuildConfig.FLAVOR;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private String catalogueName_ = BuildConfig.FLAVOR;

    public static final class bcR extends o0OOO0o.OooO00o<am, bcR> implements ab {
        public bcR(bcQ bcq) {
            super(am.t());
        }
    }

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        int i = f;
        int i2 = ((i ^ 37) | (i & 37)) << 1;
        int i3 = -(((~i) & 37) | (i & (-38)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        e = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(am.class, amVar);
        int i6 = f;
        int i7 = i6 ^ 31;
        int i8 = -(-((i6 & 31) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        e = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ am t() {
        int i = 2 % 2;
        int i2 = f;
        int i3 = i2 + 81;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        am amVar = DEFAULT_INSTANCE;
        int i4 = ((((i2 ^ 117) | (i2 & 117)) << 1) - (~(-(((~i2) & 117) | (i2 & (-118)))))) - 1;
        e = i4 % 128;
        int i5 = i4 % 2;
        return amVar;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new am();
            case 4:
                return new bcR(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<am> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (am.class) {
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
