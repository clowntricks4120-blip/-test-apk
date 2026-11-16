package ivas.gov.bisp.enumeration.aC;

import ivas.gov.bisp.enumeration.aD.AbstractC0069z;
import ivas.gov.bisp.enumeration.aD.ab;
import ivas.gov.bisp.enumeration.aD.ac;
import ivas.gov.bisp.enumeration.o000O000.o000O0;
import ivas.gov.bisp.enumeration.o000O000.o0OOO0o;
import java.util.Objects;
import net.sqlcipher.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class R extends o0OOO0o<R, bdk> implements ab {
    private static final R DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 0x00000003;
    private static volatile o000O0<R> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 0x00000001;
    public static final int VALUE_FIELD_NUMBER = 0x00000002;
    private static int c = 0x00000001;
    private static int d;
    private int keyMaterialType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private AbstractC0069z value_ = AbstractC0069z.c;

    public static final class bdk extends o0OOO0o.OooO00o<R, bdk> implements ab {
        public bdk() {
            super(R.u());
        }

        public bdk(bdj bdjVar) {
            super(R.u());
        }
    }

    static {
        R r = new R();
        DEFAULT_INSTANCE = r;
        int i = d;
        int i2 = i & 59;
        int i3 = (i2 - (~((i ^ 59) | i2))) - 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.aD.S.s(R.class, r);
        int i5 = d;
        int i6 = ((i5 ^ 69) | (i5 & 69)) << 1;
        int i7 = -(((~i5) & 69) | (i5 & (-70)));
        int i8 = (i6 & i7) + (i7 | i6);
        c = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public static void t(R r, String str) {
        int i = 2 % 2;
        int i2 = c + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(r);
        Objects.requireNonNull(str);
        r.typeUrl_ = str;
        int i4 = d;
        int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
        c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ R u() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 & 115) + (i2 | 115);
        int i4 = i3 % 128;
        d = i4;
        int i5 = i3 % 2;
        R r = DEFAULT_INSTANCE;
        int i6 = i4 & 99;
        int i7 = ((i4 ^ 99) | i6) << 1;
        int i8 = -((i4 | 99) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        c = i9 % 128;
        int i10 = i9 % 2;
        return r;
    }

    public static R x() {
        int i = 2 % 2;
        int i2 = c + 35;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        R r = DEFAULT_INSTANCE;
        int i5 = ((i3 | 125) << 1) - (i3 ^ 125);
        c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return r;
    }

    public static bdk y() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 105;
        int i4 = ((((i2 ^ 105) | i3) << 1) - (~(-((i2 | 105) & (~i3))))) - 1;
        d = i4 % 128;
        int i5 = i4 % 2;
        bdk bdkVar = (bdk) DEFAULT_INSTANCE.B();
        int i6 = d;
        int i7 = i6 & 105;
        int i8 = -(-(i6 | 105));
        int i9 = (i7 & i8) + (i8 | i7);
        c = i9 % 128;
        int i10 = i9 % 2;
        return bdkVar;
    }

    public final String A() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = (i2 ^ 123) + ((i2 & 123) << 1);
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.typeUrl_;
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
                return new ac(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new R();
            case 4:
                return new bdk(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o000O0<R> o000o0 = PARSER;
                if (o000o0 != null) {
                    return o000o0;
                }
                synchronized (R.class) {
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

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public final bdl E() {
        bdl bdlVarD;
        int i = 2 % 2;
        int i2 = d;
        int i3 = ((i2 ^ 125) | (i2 & 125)) << 1;
        int i4 = -(((~i2) & 125) | (i2 & (-126)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        c = i5 % 128;
        if (i5 % 2 == 0) {
            bdlVarD = bdl.d(this.keyMaterialType_);
            int i6 = 51 / 0;
            if (bdlVarD == null) {
                bdlVarD = R.bdl.i;
                int i7 = d;
                int i8 = (i7 & (-70)) | ((~i7) & 69);
                int i9 = (i7 & 69) << 1;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                c = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            bdlVarD = bdl.d(this.keyMaterialType_);
            if (bdlVarD == null) {
                bdlVarD = R.bdl.i;
                int i12 = d;
                int i13 = (i12 & (-70)) | ((~i12) & 69);
                int i14 = (i12 & 69) << 1;
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                c = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        int i17 = d;
        int i18 = i17 ^ 43;
        int i19 = ((i17 & 43) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        c = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 14 / 0;
        }
        return bdlVarD;
    }

    public final AbstractC0069z F() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 | 39;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 39)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        c = i7;
        int i8 = i6 % 2;
        AbstractC0069z abstractC0069z = this.value_;
        int i9 = i7 & 9;
        int i10 = ((i7 | 9) & (~i9)) + (i9 << 1);
        d = i10 % 128;
        if (i10 % 2 == 0) {
            return abstractC0069z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class bdl implements ivas.gov.bisp.enumeration.aD.R.bcK {
        private static int a = 0x00000000;
        private static int b = 0x00000001;
        public static final /* synthetic */ bdl[] c;
        public static final bdl d;
        public static final bdl e;
        public static final bdl f;
        public static final bdl g;
        public static final bdl h;
        public static final bdl i;
        public final int j;

        static {
            bdl[] bdlVarArr;
            bdl bdlVar = new bdl("UNKNOWN_KEYMATERIAL", 0, 0);
            d = bdlVar;
            bdl bdlVar2 = new bdl("SYMMETRIC", 1, 1);
            e = bdlVar2;
            bdl bdlVar3 = new bdl("ASYMMETRIC_PRIVATE", 2, 2);
            g = bdlVar3;
            bdl bdlVar4 = new bdl("ASYMMETRIC_PUBLIC", 3, 3);
            f = bdlVar4;
            bdl bdlVar5 = new bdl("REMOTE", 4, 4);
            h = bdlVar5;
            bdl bdlVar6 = new bdl("UNRECOGNIZED", 5, -1);
            int i2 = a;
            int i3 = i2 + 55;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                i = bdlVar6;
                bdlVarArr = new bdl[67];
                bdlVarArr[1] = bdlVar;
            } else {
                i = bdlVar6;
                bdl[] bdlVarArr2 = new bdl[6];
                bdlVarArr2[0] = bdlVar;
                bdlVarArr = bdlVarArr2;
            }
            bdlVarArr[1] = bdlVar2;
            bdlVarArr[2] = bdlVar3;
            bdlVarArr[3] = bdlVar4;
            int i4 = i2 & 101;
            int i5 = (i4 - (~((i2 ^ 101) | i4))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                bdlVarArr[4] = bdlVar5;
                bdlVarArr[5] = bdlVar6;
            } else {
                bdlVarArr[4] = bdlVar5;
                bdlVarArr[5] = bdlVar6;
            }
            c = bdlVarArr;
            int i6 = i2 & 15;
            int i7 = (~i6) & (i2 | 15);
            int i8 = -(-(i6 << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            b = i9 % 128;
            int i10 = i9 % 2;
        }

        public bdl(String str, int i2, int i3) {
            super(str, i2);
            this.j = i3;
        }

        public static bdl valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 99;
            int i5 = -(-((i3 ^ 99) | i4));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            bdl bdlVar = (bdl) Enum.valueOf(bdl.class, str);
            if (i7 != 0) {
                throw null;
            }
            int i8 = a;
            int i9 = (i8 ^ 22) + ((i8 & 22) << 1);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return bdlVar;
        }

        public static bdl[] values() {
            bdl[] bdlVarArr;
            int i2 = 2 % 2;
            int i3 = b + 45;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                bdlVarArr = (bdl[]) c.clone();
                int i4 = 84 / 0;
            } else {
                bdlVarArr = (bdl[]) c.clone();
            }
            int i5 = b;
            int i6 = (-2) - ((((i5 | 62) << 1) - (i5 ^ 62)) ^ (-1));
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 69 / 0;
            }
            return bdlVarArr;
        }

        @Override // ivas.gov.bisp.enumeration.aD.R.bcK
        public final int c() {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 | 52) << 1) - (i3 ^ 52);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (this == i) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            int i7 = i3 ^ 99;
            int i8 = ((i3 & 99) | i7) << 1;
            int i9 = -i7;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                return this.j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        
            r3 = r2 + 75;
            r5 = r3 % 128;
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
        
            if ((r3 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            if (r9 == 4) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r9 == 2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if (r9 == 3) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            r5 = r2 & 39;
            r3 = ((r2 ^ 39) | r5) << 1;
            r5 = -((~r5) & (r2 | 39));
            r8 = (r3 ^ r5) + ((r3 & r5) << 1);
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r8 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        
            if ((r8 % 2) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        
            if (r9 == 4) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r9 == 4) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            r9 = r2 & 75;
            r9 = r9 + ((r2 ^ 75) | r9);
            r2 = r9 % 128;
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r2;
            r9 = r9 % 2;
            r9 = (((r2 ^ 97) | (r2 & 97)) << 1) - ((97 & (~r2)) | (r2 & (-98)));
            ivas.gov.bisp.enumeration.aC.R.bdl.b = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aC.R.bdl.h;
            r1 = r2 ^ 15;
            r2 = ((r2 & 15) | r1) << 1;
            r1 = -r1;
            r3 = (r2 ^ r1) + ((r1 & r2) << 1);
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        
            if ((r3 % 2) == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        
            r0 = 59 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aC.R.bdl.f;
            r1 = ((r5 ^ 37) | (r5 & 37)) << 1;
            r2 = -((r5 & (-38)) | ((~r5) & 37));
            r3 = (r1 & r2) + (r1 | r2);
            ivas.gov.bisp.enumeration.aC.R.bdl.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
        
            if ((r3 % 2) == 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aC.R.bdl.g;
            r1 = ((r2 | 83) << 1) - (r2 ^ 83);
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aC.R.bdl.e;
            r3 = r2 & 97;
            r1 = (97 ^ r2) | r3;
            r2 = (r3 ^ r1) + ((r1 & r3) << 1);
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
        
            if ((r2 % 2) == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
        
            r0 = 80 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
        
            r9 = ivas.gov.bisp.enumeration.aC.R.bdl.d;
            r2 = r1 & 99;
            r1 = -(-(r1 | 99));
            r3 = ((r2 | r1) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.aC.R.bdl.a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            if (r9 != 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            if (r9 != 0) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            r1 = ((((r3 ^ 25) | (r3 & 25)) << 1) - (~(-((r3 & (-26)) | ((~r3) & 25))))) - 1;
            r2 = r1 % 128;
            ivas.gov.bisp.enumeration.aC.R.bdl.b = r2;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        
            if (r9 == 1) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static ivas.gov.bisp.enumeration.aC.R.bdl d(int r9) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.aC.R.bdl.d(int):ivas.gov.bisp.enumeration.aC.R$bdl");
        }
    }

    public static void v(R r, bdl bdlVar) {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 & 65;
        int i4 = (i2 ^ 65) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        d = i5 % 128;
        if (i5 % 2 == 0) {
            Objects.requireNonNull(r);
            r.keyMaterialType_ = bdlVar.c();
        } else {
            Objects.requireNonNull(r);
            r.keyMaterialType_ = bdlVar.c();
            throw null;
        }
    }

    public static void w(R r, AbstractC0069z abstractC0069z) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 & 69;
        int i4 = -(-(i2 | 69));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        c = i5 % 128;
        int i6 = i5 % 2;
        Objects.requireNonNull(r);
        Objects.requireNonNull(abstractC0069z);
        r.value_ = abstractC0069z;
        int i7 = d;
        int i8 = i7 & 59;
        int i9 = (((i7 ^ 59) | i8) << 1) - ((i7 | 59) & (~i8));
        c = i9 % 128;
        int i10 = i9 % 2;
    }
}
