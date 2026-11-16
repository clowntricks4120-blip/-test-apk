package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.C0048d;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OO00O;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class V extends o0OOO0o<V, bcp> implements ab {
    private static final V DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile o000O0<V> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private static int c = 1;
    private static int d;
    private o0OO00O.OooO0OO<bcq> key_ = C0048d.d;
    private int primaryKeyId_;

    public static final class bcp extends o0OOO0o.OooO00o<V, bcp> implements ab {
        public bcp() {
            super(V.u());
        }

        public bcp(bco bcoVar) {
            super(V.u());
        }
    }

    public static final class bcq extends o0OOO0o<bcq, bcr> implements ab {
        private static final bcq DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile o000O0<bcq> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static int d = 1;
        private static int e;
        private R keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class bcr extends o0OOO0o.OooO00o<bcq, bcr> implements ab {
            public bcr() {
                super(bcq.u());
            }

            public bcr(bco bcoVar) {
                super(bcq.u());
            }
        }

        static {
            bcq bcqVar = new bcq();
            DEFAULT_INSTANCE = bcqVar;
            int i = d;
            int i2 = (-2) - (((i ^ 46) + ((i & 46) << 1)) ^ (-1));
            e = i2 % 128;
            int i3 = i2 % 2;
            ivas.gov.bisp.enumeration.aD.S.s(bcq.class, bcqVar);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = e;
            int i5 = ((i4 | 121) << 1) - (i4 ^ 121);
            d = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ bcq u() {
            int i = 2 % 2;
            int i2 = e + 29;
            int i3 = i2 % 128;
            d = i3;
            int i4 = i2 % 2;
            bcq bcqVar = DEFAULT_INSTANCE;
            int i5 = i3 & 47;
            int i6 = (i3 ^ 47) | i5;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            e = i7 % 128;
            if (i7 % 2 == 0) {
                return bcqVar;
            }
            throw null;
        }

        public static void x(bcq bcqVar, int i) {
            int i2 = 2 % 2;
            int i3 = d;
            int i4 = (i3 & 107) + (i3 | 107);
            e = i4 % 128;
            int i5 = i4 % 2;
            bcqVar.keyId_ = i;
            int i6 = i3 ^ 115;
            int i7 = -(-((i3 & 115) << 1));
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            e = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        public static bcr y() {
            int i = 2 % 2;
            int i2 = e;
            int i3 = i2 & 47;
            int i4 = (i2 ^ 47) | i3;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            d = i5 % 128;
            if (i5 % 2 != 0) {
                return (bcr) DEFAULT_INSTANCE.B();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int A() {
            int i = 2 % 2;
            int i2 = e;
            int i3 = i2 & 49;
            int i4 = -(-((i2 ^ 49) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            d = i5 % 128;
            if (i5 % 2 != 0) {
                return this.keyId_;
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
                    return new ac(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new bcq();
                case 4:
                    return new bcr(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    o000O0<bcq> o000o0 = PARSER;
                    if (o000o0 != null) {
                        return o000o0;
                    }
                    synchronized (bcq.class) {
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

        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        public final R E() {
            R rX;
            int i = 2 % 2;
            int i2 = e;
            int i3 = (-2) - (((i2 ^ 112) + ((i2 & 112) << 1)) ^ (-1));
            d = i3 % 128;
            if (i3 % 2 == 0) {
                rX = this.keyData_;
                int i4 = 82 / 0;
                if (rX == null) {
                    rX = R.x();
                    int i5 = e;
                    int i6 = (i5 ^ 99) + ((i5 & 99) << 1);
                    d = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                rX = this.keyData_;
                if (rX == null) {
                    rX = R.x();
                    int i8 = e;
                    int i9 = (i8 ^ 99) + ((i8 & 99) << 1);
                    d = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            int i11 = e;
            int i12 = i11 ^ 123;
            int i13 = -(-((i11 & 123) << 1));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            d = i14 % 128;
            if (i14 % 2 != 0) {
                return rX;
            }
            throw null;
        }

        public final D F() {
            int i = 2 % 2;
            int i2 = e;
            int i3 = i2 & 79;
            int i4 = (i2 ^ 79) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            d = i5 % 128;
            int i6 = i5 % 2;
            D d2 = D.d(this.outputPrefixType_);
            if (d2 == null) {
                int i7 = e;
                int i8 = i7 & 109;
                int i9 = i8 + ((i7 ^ 109) | i8);
                d = i9 % 128;
                if (i9 % 2 == 0) {
                    D d3 = D.i;
                    throw null;
                }
                d2 = D.i;
                int i10 = d;
                int i11 = i10 & 63;
                int i12 = ((i10 | 63) & (~i11)) + (i11 << 1);
                e = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = (-2) - ((d + 110) ^ (-1));
            e = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 13 / 0;
            }
            return d2;
        }

        public final EnumC0042v G() {
            int i = 2 % 2;
            int i2 = e;
            int i3 = ((i2 & (-80)) | ((~i2) & 79)) + ((i2 & 79) << 1);
            d = i3 % 128;
            int i4 = i3 % 2;
            EnumC0042v enumC0042vD = EnumC0042v.d(this.status_);
            if (enumC0042vD == null) {
                int i5 = d;
                int i6 = i5 & 43;
                int i7 = i5 | 43;
                int i8 = (i6 & i7) + (i7 | i6);
                e = i8 % 128;
                int i9 = i8 % 2;
                enumC0042vD = EnumC0042v.g;
                int i10 = e;
                int i11 = i10 ^ 19;
                int i12 = (((i10 & 19) | i11) << 1) - i11;
                d = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = d;
            int i15 = i14 & 17;
            int i16 = -(-((i14 ^ 17) | i15));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            e = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 15 / 0;
            }
            return enumC0042vD;
        }

        public final boolean H() {
            boolean z;
            int i = 2 % 2;
            int i2 = e;
            int i3 = i2 & 123;
            int i4 = i3 + ((i2 ^ 123) | i3);
            d = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.keyData_ != null) {
                int i5 = (i2 & (-74)) | ((~i2) & 73);
                z = true;
                int i6 = -(-((i2 & 73) << 1));
                int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                d = i7 % 128;
                int i8 = i7 % 2;
            } else {
                int i9 = (i2 & 71) + (i2 | 71);
                d = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            int i11 = (i2 & 95) + (i2 | 95);
            d = i11 % 128;
            if (i11 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        public static void v(bcq bcqVar, EnumC0042v enumC0042v) {
            int i = 2 % 2;
            int i2 = e;
            int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
            d = i3 % 128;
            int i4 = i3 % 2;
            Objects.requireNonNull(bcqVar);
            bcqVar.status_ = enumC0042v.c();
            int i5 = d;
            int i6 = (-2) - ((((i5 | 16) << 1) - (i5 ^ 16)) ^ (-1));
            e = i6 % 128;
            int i7 = i6 % 2;
        }

        public static void w(bcq bcqVar, D d2) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = (-2) - ((((i2 | 60) << 1) - (i2 ^ 60)) ^ (-1));
            e = i3 % 128;
            int i4 = i3 % 2;
            Objects.requireNonNull(bcqVar);
            bcqVar.outputPrefixType_ = d2.c();
            int i5 = e + 37;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void t(bcq bcqVar, R r) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 & 101;
            int i4 = -(-(i2 | 101));
            int i5 = (i3 & i4) + (i4 | i3);
            e = i5 % 128;
            int i6 = i5 % 2;
            Objects.requireNonNull(bcqVar);
            Objects.requireNonNull(r);
            bcqVar.keyData_ = r;
            int i7 = e;
            int i8 = i7 ^ 77;
            int i9 = ((i7 & 77) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            d = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    static {
        V v = new V();
        DEFAULT_INSTANCE = v;
        int i = d;
        int i2 = i & 35;
        int i3 = i2 + ((i ^ 35) | i2);
        c = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(V.class, v);
        int i5 = c;
        int i6 = (i5 & 45) + (i5 | 45);
        d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 96 / 0;
        }
    }

    public static void t(V v, int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = (i3 ^ 108) + ((i3 & 108) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        d = i5 % 128;
        int i6 = i5 % 2;
        v.primaryKeyId_ = i;
        int i7 = ((i3 | 77) << 1) - (i3 ^ 77);
        d = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ V u() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 | 87) << 1) - (i2 ^ 87);
        c = i3 % 128;
        int i4 = i3 % 2;
        V v = DEFAULT_INSTANCE;
        int i5 = i2 + 68;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        c = i6 % 128;
        int i7 = i6 % 2;
        return v;
    }

    public static bcp w() {
        int i = 2 % 2;
        int i2 = d + 121;
        c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        bcp bcpVar = (bcp) DEFAULT_INSTANCE.B();
        int i3 = d;
        int i4 = i3 & 9;
        int i5 = -(-((i3 ^ 9) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        c = i6 % 128;
        int i7 = i6 % 2;
        return bcpVar;
    }

    public static V x(byte[] bArr, ivas.gov.bisp.enumeration.aD.J j) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = (i2 | 101) << 1;
        int i4 = -(((~i2) & 101) | (i2 & (-102)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.aD.S sR = ivas.gov.bisp.enumeration.aD.S.r(DEFAULT_INSTANCE, bArr, j);
        if (i6 != 0) {
            return (V) sR;
        }
        throw null;
    }

    public final int A() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 ^ 61;
        int i4 = (i2 & 61) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        int i6 = i5 % 2;
        int size = this.key_.size();
        if (i6 == 0) {
            int i7 = 28 / 0;
        }
        int i8 = d;
        int i9 = (i8 & (-104)) | ((~i8) & 103);
        int i10 = (i8 & 103) << 1;
        int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
        c = i11 % 128;
        int i12 = i11 % 2;
        return size;
    }

    public final Object C(ivas.gov.bisp.enumeration.aD.S.bkM bkm, Object obj, Object obj2) {
        ivas.gov.bisp.enumeration.aD.S.bkI bki;
        switch (bkm.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ac(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", bcq.class});
            case 3:
                return new V();
            case 4:
                return new bcp(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<V> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (V.class) {
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
        int i2 = c;
        int i3 = i2 & 85;
        int i4 = ((((i2 ^ 85) | i3) << 1) - (~(-((i2 | 85) & (~i3))))) - 1;
        int i5 = i4 % 128;
        d = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = this.primaryKeyId_;
        int i7 = (i5 ^ 115) + ((i5 & 115) << 1);
        c = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 39 / 0;
        }
        return i6;
    }

    public final List<bcq> F() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        d = i3 % 128;
        int i4 = i3 % 2;
        o0OO00O.OooO0OO<bcq> oooO0OO = this.key_;
        int i5 = i2 + 101;
        d = i5 % 128;
        int i6 = i5 % 2;
        return oooO0OO;
    }

    public final bcq z(int i) {
        int i2 = 2 % 2;
        int i3 = c;
        int i4 = ((i3 & (-106)) | ((~i3) & 105)) + ((i3 & 105) << 1);
        d = i4 % 128;
        int i5 = i4 % 2;
        bcq bcqVar = (bcq) this.key_.get(i);
        int i6 = d;
        int i7 = (((i6 | 104) << 1) - (i6 ^ 104)) - 1;
        c = i7 % 128;
        int i8 = i7 % 2;
        return bcqVar;
    }

    public static void v(V v, bcq bcqVar) {
        int i = 2 % 2;
        int i2 = d + 58;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        c = i3 % 128;
        if (i3 % 2 == 0) {
            Objects.requireNonNull(v);
            Objects.requireNonNull(bcqVar);
            o0OO00O.OooO0OO<bcq> oooO0OO = v.key_;
            throw null;
        }
        Objects.requireNonNull(v);
        Objects.requireNonNull(bcqVar);
        if (!v.key_.o()) {
            int i4 = c;
            int i5 = i4 & 11;
            int i6 = -(-((i4 ^ 11) | i5));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            d = i7 % 128;
            int i8 = i7 % 2;
            o0OO00O.OooO0OO<bcq> oooO0OO2 = v.key_;
            int size = oooO0OO2.size();
            int i9 = c;
            int i10 = 10;
            int i11 = (((i9 | 10) << 1) - (i9 ^ 10)) - 1;
            int i12 = i11 % 128;
            d = i12;
            int i13 = i11 % 2;
            if (size == 0) {
                int i14 = i12 + 29;
                c = i14 % 128;
                if (i14 % 2 == 0) {
                    i10 = 40;
                }
            } else {
                i10 = size * 2;
                int i15 = i12 & 89;
                int i16 = ((i12 | 89) & (~i15)) + (i15 << 1);
                c = i16 % 128;
                int i17 = i16 % 2;
            }
            v.key_ = oooO0OO2.g(i10);
            int i18 = c;
            int i19 = i18 ^ 51;
            int i20 = -(-((i18 & 51) << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            d = i21 % 128;
            int i22 = i21 % 2;
        }
        v.key_.add(bcqVar);
        int i23 = c;
        int i24 = i23 & 107;
        int i25 = -(-((i23 ^ 107) | i24));
        int i26 = (i24 & i25) + (i25 | i24);
        d = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 42 / 0;
        }
    }
}
