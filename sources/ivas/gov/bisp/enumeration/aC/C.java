package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.C0048d;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class C extends o0OOO0o<C, bcu> implements ab {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile o000O0<C> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private o0OO00O.OooO0OO<bcv> keyInfo_ = C0048d.d;
    private int primaryKeyId_;

    public static final class bcu extends o0OOO0o.OooO00o<C, bcu> implements ab {
        public bcu() {
            super(C.u());
        }

        public bcu(bct bctVar) {
            super(C.u());
        }
    }

    public static final class bcv extends o0OOO0o<bcv, bcw> implements ab {
        private static final bcv DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile o000O0<bcv> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private static int c = 1;
        private static int d;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = BuildConfig.FLAVOR;

        public static final class bcw extends o0OOO0o.OooO00o<bcv, bcw> implements ab {
            public bcw() {
                super(bcv.u());
            }

            public bcw(bct bctVar) {
                super(bcv.u());
            }
        }

        static {
            bcv bcvVar = new bcv();
            DEFAULT_INSTANCE = bcvVar;
            int i = d;
            int i2 = i & 89;
            int i3 = -(-((i ^ 89) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            c = i4 % 128;
            int i5 = i4 % 2;
            ivas.gov.bisp.enumeration.aD.S.s(bcv.class, bcvVar);
            if (i5 == 0) {
                throw null;
            }
            int i6 = d;
            int i7 = ((i6 ^ 109) | (i6 & 109)) << 1;
            int i8 = -(((~i6) & 109) | (i6 & (-110)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            c = i9 % 128;
            int i10 = i9 % 2;
        }

        public static /* synthetic */ bcv u() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = (i2 & 67) + (i2 | 67);
            int i4 = i3 % 128;
            c = i4;
            int i5 = i3 % 2;
            bcv bcvVar = DEFAULT_INSTANCE;
            int i6 = ((i4 ^ 75) - (~(-(-((i4 & 75) << 1))))) - 1;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                return bcvVar;
            }
            throw null;
        }

        public static void v(bcv bcvVar, EnumC0042v enumC0042v) {
            int i = 2 % 2;
            int i2 = d + 13;
            c = i2 % 128;
            int i3 = i2 % 2;
            Objects.requireNonNull(bcvVar);
            bcvVar.status_ = enumC0042v.c();
            int i4 = c;
            int i5 = i4 & 97;
            int i6 = ((i4 | 97) & (~i5)) + (i5 << 1);
            d = i6 % 128;
            int i7 = i6 % 2;
        }

        public static void x(bcv bcvVar, int i) {
            int i2 = 2 % 2;
            int i3 = c;
            int i4 = i3 & 55;
            int i5 = i4 + ((i3 ^ 55) | i4);
            d = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            bcvVar.keyId_ = i;
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = (i3 | 13) << 1;
            int i8 = -(i3 ^ 13);
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            d = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static bcw y() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 21;
            int i4 = -(-((i2 ^ 21) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            c = i5 % 128;
            int i6 = i5 % 2;
            bcw bcwVar = (bcw) DEFAULT_INSTANCE.B();
            int i7 = d;
            int i8 = i7 ^ 39;
            int i9 = -(-((i7 & 39) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            c = i10 % 128;
            if (i10 % 2 != 0) {
                return bcwVar;
            }
            throw null;
        }

        public final int A() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = (-2) - ((((i2 | 110) << 1) - (i2 ^ 110)) ^ (-1));
            c = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.keyId_;
            int i6 = (i2 | 41) << 1;
            int i7 = -(((~i2) & 41) | (i2 & (-42)));
            int i8 = (i6 & i7) + (i7 | i6);
            c = i8 % 128;
            if (i8 % 2 != 0) {
                return i5;
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
                    return new ac(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new bcv();
                case 4:
                    return new bcw(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    o000O0<bcv> o000o0 = PARSER;
                    if (o000o0 != null) {
                        return o000o0;
                    }
                    synchronized (bcv.class) {
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

        public static void w(bcv bcvVar, D d2) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = (i2 & 59) + (i2 | 59);
            c = i3 % 128;
            int i4 = i3 % 2;
            Objects.requireNonNull(bcvVar);
            bcvVar.outputPrefixType_ = d2.c();
            int i5 = c;
            int i6 = i5 & 65;
            int i7 = ((i5 ^ 65) | i6) << 1;
            int i8 = -((i5 | 65) & (~i6));
            int i9 = (i7 & i8) + (i8 | i7);
            d = i9 % 128;
            int i10 = i9 % 2;
        }

        public static void t(bcv bcvVar, String str) {
            int i = 2 % 2;
            int i2 = c;
            int i3 = i2 & 117;
            int i4 = (i2 | 117) & (~i3);
            int i5 = -(-(i3 << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            d = i6 % 128;
            if (i6 % 2 != 0) {
                Objects.requireNonNull(bcvVar);
                Objects.requireNonNull(str);
                bcvVar.typeUrl_ = str;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Objects.requireNonNull(bcvVar);
            Objects.requireNonNull(str);
            bcvVar.typeUrl_ = str;
            int i7 = d;
            int i8 = (i7 ^ 72) + ((i7 & 72) << 1);
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            c = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    static {
        C c2 = new C();
        DEFAULT_INSTANCE = c2;
        int i = c;
        int i2 = i ^ 55;
        int i3 = ((i & 55) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        d = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(C.class, c2);
        int i7 = d;
        int i8 = i7 & 113;
        int i9 = ((((i7 ^ 113) | i8) << 1) - (~(-((i7 | 113) & (~i8))))) - 1;
        c = i9 % 128;
        int i10 = i9 % 2;
    }

    public static void t(C c2, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = ((i3 ^ 121) | (i3 & 121)) << 1;
        int i5 = -((i3 & (-122)) | ((~i3) & 121));
        int i6 = (i4 & i5) + (i4 | i5);
        c = i6 % 128;
        int i7 = i6 % 2;
        c2.primaryKeyId_ = i;
        if (i7 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i3 & 111;
        int i9 = ((~i8) & (i3 | 111)) + (i8 << 1);
        c = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 16 / 0;
        }
    }

    public static /* synthetic */ C u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 ^ 97;
        int i4 = -(-((i2 & 97) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        c = i5 % 128;
        if (i5 % 2 != 0) {
            return DEFAULT_INSTANCE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bcu w() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 79;
        int i4 = (i2 | 79) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        c = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        bcu bcuVar = (bcu) DEFAULT_INSTANCE.B();
        int i7 = c + 91;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            return bcuVar;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", bcv.class});
            case 3:
                return new C();
            case 4:
                return new bcu(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<C> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (C.class) {
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

    public final bcv y(int i) {
        bcv bcvVar;
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = i3 & 37;
        int i5 = ((i3 ^ 37) | i4) << 1;
        int i6 = -((i3 | 37) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        d = i7 % 128;
        int i8 = i7 % 2;
        Object obj = this.keyInfo_.get(i);
        if (i8 != 0) {
            bcvVar = (bcv) obj;
            int i9 = 50 / 0;
        } else {
            bcvVar = (bcv) obj;
        }
        int i10 = c + 109;
        d = i10 % 128;
        if (i10 % 2 == 0) {
            return bcvVar;
        }
        throw null;
    }

    public static void v(C c2, bcv bcvVar) {
        int i;
        int i2 = 2 % 2;
        int i3 = d + 79;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            Objects.requireNonNull(c2);
            Objects.requireNonNull(bcvVar);
            o0OO00O.OooO0OO<bcv> oooO0OO = c2.keyInfo_;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(c2);
        Objects.requireNonNull(bcvVar);
        o0OO00O.OooO0OO<bcv> oooO0OO2 = c2.keyInfo_;
        int i4 = d;
        int i5 = i4 & 85;
        int i6 = (i4 ^ 85) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        c = i7 % 128;
        int i8 = i7 % 2;
        if (!oooO0OO2.o()) {
            int i9 = d;
            int i10 = i9 & 117;
            int i11 = -(-((i9 ^ 117) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            c = i12 % 128;
            int i13 = i12 % 2;
            o0OO00O.OooO0OO<bcv> oooO0OO3 = c2.keyInfo_;
            int size = oooO0OO3.size();
            if (size == 0) {
                int i14 = c;
                int i15 = (((i14 | 120) << 1) - (i14 ^ 120)) - 1;
                d = i15 % 128;
                i = i15 % 2 != 0 ? 98 : 10;
            } else {
                i = size * 2;
                int i16 = c;
                int i17 = (i16 & 38) + (i16 | 38);
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                d = i18 % 128;
                int i19 = i18 % 2;
            }
            c2.keyInfo_ = oooO0OO3.g(i);
            int i20 = c;
            int i21 = ((i20 & (-14)) | ((~i20) & 13)) + ((i20 & 13) << 1);
            d = i21 % 128;
            int i22 = i21 % 2;
        }
        c2.keyInfo_.add(bcvVar);
        int i23 = c;
        int i24 = i23 & 39;
        int i25 = (((i23 | 39) & (~i24)) - (~(i24 << 1))) - 1;
        d = i25 % 128;
        int i26 = i25 % 2;
    }
}
