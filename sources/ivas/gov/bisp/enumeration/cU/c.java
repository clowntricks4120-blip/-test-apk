package ivas.gov.bisp.enumeration.cU;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.P;
import ivas.gov.bisp.enumeration.cR.AbstractC0248j;
import ivas.gov.bisp.enumeration.cR.N;
import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 0;
    private static int b = 1;

    public static final class bGF extends AbstractC0242a {
        private static int a = 1;
        private static int b;
        public final bGI h;
        public final int i;
        public final bGI j;

        public bGF(String str, int i, bGI bgi, bGI bgi2) {
            super(str);
            this.i = i;
            this.j = bgi;
            this.h = bgi2;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final int p(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-84)) | ((~i2) & 83);
            int i4 = -(-((i2 & 83) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            a = i6;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i7 = this.i;
            int i8 = (i6 & (-80)) | ((~i6) & 79);
            int i9 = -(-((i6 & 79) << 1));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return i7;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final boolean q() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = (i2 & 85) + (i2 | 85);
            a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final String m(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-16)) | ((~i2) & 15);
            int i4 = -(-((i2 & 15) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return t(j).d;
            }
            String str = t(j).d;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final int n(long j) {
            int i = 2 % 2;
            int i2 = b + 31;
            a = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                int i3 = t(j).e;
                throw null;
            }
            int i4 = this.i;
            int i5 = t(j).e;
            int i6 = b;
            int i7 = i6 & 53;
            int i8 = (i7 - (~(-(-((i6 ^ 53) | i7))))) - 1;
            int i9 = i8 % 128;
            a = i9;
            int i10 = i8 % 2;
            int i11 = -(-i5);
            int i12 = i4 & i11;
            int i13 = (i12 - (~((i11 ^ i4) | i12))) - 1;
            int i14 = ((i9 ^ 93) | (i9 & 93)) << 1;
            int i15 = -(((~i9) & 93) | (i9 & (-94)));
            int i16 = (i14 & i15) + (i14 | i15);
            b = i16 % 128;
            if (i16 % 2 == 0) {
                return i13;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0050  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final long r(long j) {
            long jD;
            int i;
            int i2 = 2 % 2;
            int i3 = a + 104;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = this.i;
            bGI bgi = this.j;
            bGI bgi2 = this.h;
            try {
                int i6 = bgi2.e;
                int i7 = b;
                int i8 = i7 ^ 67;
                int i9 = ((i7 & 67) | i8) << 1;
                int i10 = -i8;
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                a = i11 % 128;
                int i12 = i11 % 2;
                jD = bgi.d(j, i5, i6);
                int i13 = a;
                int i14 = (i13 ^ 19) + ((i13 & 19) << 1);
                int i15 = i14 % 128;
                b = i15;
                if (i14 % 2 != 0) {
                    int i16 = 38 / 0;
                    if (j > 0) {
                        i = i15 + 61;
                        a = i % 128;
                        if (i % 2 == 0 ? jD < 0 : jD < 0) {
                            int i17 = a;
                            int i18 = ((((i17 ^ 1) | (i17 & 1)) << 1) - (~(-(((~i17) & 1) | (i17 & (-2)))))) - 1;
                            b = i18 % 128;
                            int i19 = i18 % 2;
                            jD = j;
                        }
                    }
                } else if (j > 0) {
                    i = i15 + 61;
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i110 = a;
                        int i111 = ((((i110 ^ 1) | (i110 & 1)) << 1) - (~(-(((~i110) & 1) | (i110 & (-2)))))) - 1;
                        b = i111 % 128;
                        int i112 = i111 % 2;
                        jD = j;
                    } else {
                        int i113 = a;
                        int i114 = ((((i113 ^ 1) | (i113 & 1)) << 1) - (~(-(((~i113) & 1) | (i113 & (-2)))))) - 1;
                        b = i114 % 128;
                        int i115 = i114 % 2;
                        jD = j;
                    }
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                int i20 = bgi.e;
                int i21 = a;
                int i22 = (i21 ^ 27) + ((i21 & 27) << 1);
                b = i22 % 128;
                int i23 = i22 % 2;
                long jD2 = bgi2.d(j, i5, i20);
                if (j > 0) {
                    int i24 = a + 125;
                    b = i24 % 128;
                    if (i24 % 2 == 0 ? jD2 >= 0 : jD2 >= 1) {
                        int i25 = b;
                        int i26 = ((i25 & 79) - (~(-(-(i25 | 79))))) - 1;
                        a = i26 % 128;
                        int i27 = i26 % 2;
                        j = jD2;
                    }
                } else {
                    int i28 = b;
                    int i29 = ((i28 & 79) - (~(-(-(i28 | 79))))) - 1;
                    a = i29 % 128;
                    int i210 = i29 % 2;
                    j = jD2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jD > j) {
                int i30 = a;
                int i31 = (((i30 | 32) << 1) - (i30 ^ 32)) - 1;
                b = i31 % 128;
                int i32 = i31 % 2;
                int i33 = ((i30 | 105) << 1) - (i30 ^ 105);
                b = i33 % 128;
                int i34 = i33 % 2;
                jD = j;
            }
            int i35 = a;
            int i36 = (i35 ^ 75) + ((i35 & 75) << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            return jD;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v36, types: [ivas.gov.bisp.enumeration.cU.c$bGI] */
        /* JADX WARN: Type inference failed for: r2v5, types: [int] */
        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final long s(long j) {
            bGI bgi;
            long jE;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 80;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            int i5 = i4 % 2;
            long j2 = j + 1;
            int i6 = this.i;
            bGI bgi2 = this.j;
            int i7 = (i2 & 32) + (i2 | 32);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            a = i8 % 128;
            ?? r2 = i8 % 2;
            try {
                if (r2 == 0) {
                    try {
                        int i9 = this.h.e;
                        throw null;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                r2 = this.h;
                int i10 = r2.e;
                int i11 = a;
                int i12 = i11 & 89;
                int i13 = (i11 | 89) & (~i12);
                int i14 = i12 << 1;
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                b = i15 % 128;
                int i16 = i15 % 2;
                long jE2 = bgi2.e(j2, i6, i10);
                int i17 = b;
                int i18 = (i17 & (-32)) | (31 & (~i17));
                int i19 = -(-((i17 & 31) << 1));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = i20 % 128;
                a = i21;
                if (i20 % 2 != 0 ? j2 < 0 : j2 < 0) {
                    bgi = r2;
                    bgi = r2;
                    int i22 = i21 & 101;
                    int i23 = (((i21 ^ 101) | i22) << 1) - ((i21 | 101) & (~i22));
                    b = i23 % 128;
                    if (i23 % 2 == 0 ? jE2 > 0 : jE2 > 1) {
                        bgi = r2;
                        bgi = r2;
                        int i24 = b;
                        int i25 = (i24 ^ 21) + ((i24 & 21) << 1);
                        a = i25 % 128;
                        int i26 = i25 % 2;
                        jE2 = j2;
                        bgi = r2;
                    }
                }
                try {
                    bgi = r2;
                    bgi = r2;
                    bgi = r2;
                    bgi = r2;
                    int i27 = bgi2.e;
                    int i28 = a;
                    int i29 = ((i28 & 111) - (~(i28 | 111))) - 1;
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        jE = bgi.e(j2, i6, i27);
                        if (j2 < 1) {
                            int i30 = b;
                            int i31 = ((i30 & 96) + (i30 | 96)) - 1;
                            a = i31 % 128;
                            int i32 = i31 % 2;
                            if (jE <= 0) {
                            }
                        }
                        if (jE2 <= j2) {
                            int i33 = a;
                            int i34 = i33 ^ 1;
                            int i35 = -(-((i33 & 1) << 1));
                            int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            int i38 = (-2) - ((i33 + 64) ^ (-1));
                            b = i38 % 128;
                            int i39 = i38 % 2;
                            jE2 = j2;
                        }
                        long j3 = jE2 - 1;
                        int i40 = b;
                        int i41 = i40 & 27;
                        int i42 = (i40 | 27) & (~i41);
                        int i43 = i41 << 1;
                        int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                        a = i44 % 128;
                        int i45 = i44 % 2;
                        return j3;
                    }
                    jE = bgi.e(j2, i6, i27);
                    if (j2 < 0) {
                        int i310 = b;
                        int i311 = ((i310 & 96) + (i310 | 96)) - 1;
                        a = i311 % 128;
                        int i312 = i311 % 2;
                        if (jE <= 0) {
                        }
                    }
                    if (jE2 <= j2) {
                        int i313 = a;
                        int i314 = i313 ^ 1;
                        int i315 = -(-((i313 & 1) << 1));
                        int i316 = (i314 ^ i315) + ((i314 & i315) << 1);
                        b = i316 % 128;
                        int i317 = i316 % 2;
                        int i318 = (-2) - ((i313 + 64) ^ (-1));
                        b = i318 % 128;
                        int i319 = i318 % 2;
                        jE2 = j2;
                    }
                    long j4 = jE2 - 1;
                    int i46 = b;
                    int i47 = i46 & 27;
                    int i48 = (i46 | 27) & (~i47);
                    int i49 = i47 << 1;
                    int i410 = ((i48 | i49) << 1) - (i48 ^ i49);
                    a = i410 % 128;
                    int i411 = i410 % 2;
                    return j4;
                    j2 = jE;
                    int i50 = a;
                    int i51 = i50 & 59;
                    int i52 = -(-((i50 ^ 59) | i51));
                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                    b = i53 % 128;
                    int i54 = i53 % 2;
                } catch (ArithmeticException | IllegalArgumentException unused) {
                }
                if (jE2 <= j2) {
                    int i3110 = a;
                    int i3111 = i3110 ^ 1;
                    int i3112 = -(-((i3110 & 1) << 1));
                    int i3113 = (i3111 ^ i3112) + ((i3111 & i3112) << 1);
                    b = i3113 % 128;
                    int i3114 = i3113 % 2;
                    int i3115 = (-2) - ((i3110 + 64) ^ (-1));
                    b = i3115 % 128;
                    int i3116 = i3115 % 2;
                    jE2 = j2;
                }
                long j5 = jE2 - 1;
                int i412 = b;
                int i413 = i412 & 27;
                int i414 = (i412 | 27) & (~i413);
                int i415 = i413 << 1;
                int i416 = ((i414 | i415) << 1) - (i414 ^ i415);
                a = i416 % 128;
                int i417 = i416 % 2;
                return j5;
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0083  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 117;
            int i4 = (((i2 ^ 117) | i3) << 1) - ((~i3) & (i2 | 117));
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            boolean z = false;
            if (this == obj) {
                int i7 = i2 & 23;
                int i8 = (~i7) & (i2 | 23);
                int i9 = i7 << 1;
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                b = i10 % 128;
                boolean z2 = i10 % 2 == 0;
                int i11 = i2 + 123;
                b = i11 % 128;
                int i12 = i11 % 2;
                return z2;
            }
            if (!(obj instanceof bGF)) {
                int i13 = i5 & 53;
                int i14 = (i5 ^ 53) | i13;
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                a = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            int i17 = ((i2 | 49) << 1) - (i2 ^ 49);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                String str = this.g;
                String str2 = ((bGF) obj).g;
                throw null;
            }
            bGF bgf = (bGF) obj;
            if (this.g.equals(bgf.g)) {
                int i18 = b;
                int i19 = i18 + 123;
                a = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 71 / 0;
                    if (this.i == bgf.i) {
                        int i21 = i18 & 29;
                        int i22 = i21 + ((i18 ^ 29) | i21);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        if (!(!this.j.equals(bgf.j))) {
                            int i24 = b;
                            int i25 = i24 & 79;
                            int i26 = ((i24 ^ 79) | i25) << 1;
                            int i27 = -((i24 | 79) & (~i25));
                            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                            a = i28 % 128;
                            int i29 = i28 % 2;
                            if (!this.h.equals(bgf.h)) {
                                z = true;
                            }
                        }
                    }
                } else if (this.i == bgf.i) {
                    int i210 = i18 & 29;
                    int i211 = i210 + ((i18 ^ 29) | i210);
                    a = i211 % 128;
                    int i212 = i211 % 2;
                    if (!(!this.j.equals(bgf.j))) {
                        int i213 = b;
                        int i214 = i213 & 79;
                        int i215 = ((i213 ^ 79) | i214) << 1;
                        int i216 = -((i213 | 79) & (~i214));
                        int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
                        a = i217 % 128;
                        int i218 = i217 % 2;
                        if (!this.h.equals(bgf.h)) {
                            z = true;
                        }
                    }
                }
                int i30 = b;
                int i31 = i30 | 19;
                int i32 = i31 << 1;
                int i33 = -((~(i30 & 19)) & i31);
                int i34 = (i32 & i33) + (i33 | i32);
                a = i34 % 128;
                int i35 = i34 % 2;
            } else {
                int i36 = b;
                int i37 = i36 | 19;
                int i38 = i37 << 1;
                int i39 = -((~(i36 & 19)) & i37);
                int i310 = (i38 & i39) + (i39 | i38);
                a = i310 % 128;
                int i311 = i310 % 2;
            }
            int i40 = a;
            int i41 = i40 & 91;
            int i42 = (i41 - (~((i40 ^ 91) | i41))) - 1;
            b = i42 % 128;
            int i43 = i42 % 2;
            return z;
        }

        public final bGI t(long j) {
            long jD;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 15;
            int i4 = (i2 & 15) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = this.i;
            bGI bgi = this.j;
            bGI bgi2 = this.h;
            try {
                jD = bgi.d(j, i6, bgi2.e);
                int i7 = b;
                int i8 = (i7 ^ 17) + ((i7 & 17) << 1);
                int i9 = i8 % 128;
                a = i9;
                if (i8 % 2 == 0) {
                    int i10 = 87 / 0;
                }
                int i11 = i9 & 119;
                int i12 = (i11 - (~((i9 ^ 119) | i11))) - 1;
                b = i12 % 128;
                int i13 = i12 % 2;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                jD = j;
            }
            try {
                j = bgi2.d(j, i6, bgi.e);
                int i14 = a;
                int i15 = (i14 ^ 85) + ((i14 & 85) << 1);
                b = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                int i16 = (((i14 | 39) << 1) - (~(-(i14 ^ 39)))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
                if (jD <= j) {
                    int i18 = b;
                    int i19 = i18 & 25;
                    int i20 = (i18 ^ 25) | i19;
                    int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                    a = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = (i18 ^ 23) + ((i18 & 23) << 1);
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    bgi = bgi2;
                }
                int i25 = b;
                int i26 = (i25 & 67) + (i25 | 67);
                a = i26 % 128;
                int i27 = i26 % 2;
                return bgi;
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
        }
    }

    public static final class bGH extends AbstractC0242a {
        private static int a = 1;
        private static int b;
        public final int[] h;
        public final long[] i;
        public final int[] j;
        public final String[] k;
        public final bGF l;

        public bGH(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, bGF bgf) {
            super(str);
            this.i = jArr;
            this.j = iArr;
            this.h = iArr2;
            this.k = strArr;
            this.l = bgf;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final boolean q() {
            int i = 2 % 2;
            int i2 = a + 105;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            int i5 = i3 & 31;
            int i6 = -(-((i3 ^ 31) | i5));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final int p(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-10)) | ((~i2) & 9);
            int i4 = (i2 & 9) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                Arrays.binarySearch(this.i, j);
                throw null;
            }
            long[] jArr = this.i;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                int i6 = this.h[iBinarySearch];
                int i7 = b + 49;
                a = i7 % 128;
                int i8 = i7 % 2;
                return i6;
            }
            int i9 = (iBinarySearch | (~iBinarySearch)) & (~iBinarySearch);
            if (i9 >= jArr.length) {
                bGF bgf = this.l;
                if (bgf != null) {
                    int i10 = bgf.i;
                    int i11 = a + 23;
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        return i10;
                    }
                    throw null;
                }
                int i12 = b;
                int i13 = (((i12 & (-2)) | ((~i12) & 1)) - (~(-(-((i12 & 1) << 1))))) - 1;
                a = i13 % 128;
                int i14 = i13 % 2;
                int i15 = this.h[(~i9) + (i9 << 1)];
                int i16 = i12 & 125;
                int i17 = (((i12 ^ 125) | i16) << 1) - ((i12 | 125) & (~i16));
                a = i17 % 128;
                if (i17 % 2 != 0) {
                    return i15;
                }
                obj.hashCode();
                throw null;
            }
            int i18 = a;
            int i19 = i18 + 35;
            int i20 = i19 % 128;
            b = i20;
            int i21 = i19 % 2;
            if (i9 <= 0) {
                int i22 = i20 + 41;
                a = i22 % 128;
                if (i22 % 2 != 0) {
                    return 0;
                }
                obj.hashCode();
                throw null;
            }
            int i23 = (i18 & (-44)) | ((~i18) & 43);
            int i24 = (i18 & 43) << 1;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            b = i25 % 128;
            int i26 = i25 % 2;
            int i27 = this.h[(-2) - (~i9)];
            int i28 = i18 + 69;
            b = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 15 / 0;
            }
            return i27;
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final int n(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 & (-32)) | ((~i2) & 31)) + ((i2 & 31) << 1);
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Arrays.binarySearch(this.i, j);
                throw null;
            }
            long[] jArr = this.i;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                int i4 = a + 72;
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                int i6 = i5 % 128;
                b = i6;
                int i7 = i5 % 2;
                int i8 = this.j[iBinarySearch];
                int i9 = i6 ^ 79;
                int i10 = (i6 & 79) << 1;
                int i11 = (i9 & i10) + (i10 | i9);
                a = i11 % 128;
                int i12 = i11 % 2;
                return i8;
            }
            int i13 = ~iBinarySearch;
            if (i13 >= jArr.length) {
                bGF bgf = this.l;
                if (bgf != null) {
                    int iN = bgf.n(j);
                    int i14 = b;
                    int i15 = i14 & 63;
                    int i16 = i14 | 63;
                    int i17 = (i15 & i16) + (i16 | i15);
                    a = i17 % 128;
                    int i18 = i17 % 2;
                    return iN;
                }
                int i19 = b;
                int i20 = (i19 ^ 61) + ((i19 & 61) << 1);
                int i21 = i20 % 128;
                a = i21;
                int i22 = i20 % 2;
                int i23 = this.j[(((i13 ^ (-1)) | i13) << 1) - (~i13)];
                int i24 = i21 + 51;
                b = i24 % 128;
                int i25 = i24 % 2;
                return i23;
            }
            int i26 = b;
            int i27 = ((i26 & (-70)) | ((~i26) & 69)) + ((i26 & 69) << 1);
            int i28 = i27 % 128;
            a = i28;
            if (i27 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i13 <= 0) {
                int i29 = i28 | 109;
                int i30 = (i29 << 1) - (i29 & (~(i28 & 109)));
                b = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 72 / 0;
                }
                return 0;
            }
            int i32 = -(-((i13 ^ (-1)) | i13));
            int i33 = this.j[(i13 & i32) + (i32 | i13)];
            int i34 = i26 | 75;
            int i35 = i34 << 1;
            int i36 = -((~(i26 & 75)) & i34);
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            a = i37 % 128;
            int i38 = i37 % 2;
            return i33;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        
            r2 = (r2 | (~r2)) & (~r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        
            if (r2 >= r1.length) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            r6 = ivas.gov.bisp.enumeration.cU.c.bGH.b;
            r7 = (r6 & (-126)) | ((~r6) & 125);
            r1 = -(-((r6 & 125) << 1));
            r3 = (r7 ^ r1) + ((r7 & r1) << 1);
            r7 = r3 % 128;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r7;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        
            if (r2 <= 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        
            r6 = ((r7 & (-8)) | ((~r7) & 7)) + ((r7 & 7) << 1);
            r7 = r6 % 128;
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r7;
            r6 = r6 % 2;
            r6 = r5.k[r2 - 1];
            r1 = (r7 ^ 17) + ((r7 & 17) << 1);
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        
            if ((r1 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        
            r7 = 24 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        
            r7 = r6 & 117;
            r7 = r7 + ((r6 ^ 117) | r7);
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        
            return "UTC";
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        
            r1 = r5.l;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
        
            if (r1 != null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
        
            r6 = ivas.gov.bisp.enumeration.cU.c.bGH.a + 53;
            r7 = r6 % 128;
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
        
            if ((r6 % 2) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
        
            r6 = r5.k[r2 >>> 1];
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
        
            r6 = r5.k[r2 - 1];
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
        
            r1 = r7 & 59;
            r1 = (r1 - (~(-(-((r7 ^ 59) | r1))))) - 1;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        
            r6 = r1.t(r6).d;
            r7 = ivas.gov.bisp.enumeration.cU.c.bGH.b;
            r2 = r7 & 43;
            r1 = ((((r7 ^ 43) | r2) << 1) - (~(-((r7 | 43) & (~r2))))) - 1;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
        
            if ((r1 % 2) == 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        
            if (r2 >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r2 >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        
            r6 = r5.k[r2];
            r7 = ivas.gov.bisp.enumeration.cU.c.bGH.a;
            r1 = ((r7 & (-110)) | ((~r7) & 109)) + ((r7 & 109) << 1);
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r1 % 128;
            r1 = r1 % 2;
         */
        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m(long r6) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cU.c.bGH.m(long):java.lang.String");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            if (r13 <= Long.MIN_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            r2 = ((r1 & 105) - (~(r1 | 105))) - 1;
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r2 % 128;
            r2 = r2 % 2;
            r13 = r13 - 1;
            r1 = r1 + 63;
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
        
            if ((r1 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
        
            r1 = 2 % 5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            r1 = ivas.gov.bisp.enumeration.cU.c.bGH.b;
            r2 = ((r1 ^ 42) + ((r1 & 42) << 1)) - 1;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        
            if ((r2 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        
            r7.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        
            r8 = ~r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (r8 >= r1.length) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            r2 = (-2) - ((ivas.gov.bisp.enumeration.cU.c.bGH.b + 34) ^ (-1));
            r7 = r2 % 128;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r7;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        
            if (r8 <= 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        
            r2 = r7 ^ 61;
            r9 = -(-((r7 & 61) << 1));
            r10 = (r2 & r9) + (r2 | r9);
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r10 % 128;
            r10 = r10 % 2;
            r8 = r1[r8 - 1];
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
        
            if (r8 <= Long.MIN_VALUE) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
        
            r13 = r7 & 17;
            r14 = (~r13) & (r7 | 17);
            r13 = r13 << 1;
            r1 = ((r14 | r13) << 1) - (r13 ^ r14);
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
        
            if ((r1 % 2) == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
        
            return r8 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        
            r1 = r7 & 101;
            r2 = (r7 ^ 101) | r1;
            r3 = ((r1 | r2) << 1) - (r1 ^ r2);
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
        
            r9 = r12.l;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
        
            if (r9 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
        
            r10 = ivas.gov.bisp.enumeration.cU.c.bGH.a;
            r11 = r10 & 99;
            r11 = r11 + ((r10 ^ 99) | r11);
            ivas.gov.bisp.enumeration.cU.c.bGH.b = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        
            if ((r11 % 2) != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
        
            r9 = r9.s(r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
        
            if (r9 >= r13) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
        
            r13 = ivas.gov.bisp.enumeration.cU.c.bGH.b;
            r14 = r13 ^ 67;
            r13 = (r13 & 67) << 1;
            r1 = ((r14 | r13) << 1) - (r13 ^ r14);
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
        
            if ((r1 % 2) != 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
        
            r2 = 53 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
        
            r9.s(r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
        
            r8 = r1[((~r8) - (~(r8 << 1))) - 1];
            r1 = ivas.gov.bisp.enumeration.cU.c.bGH.b;
            r2 = (r1 ^ 113) + ((r1 & 113) << 1);
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
        
            if ((r2 % 2) == 0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
        
            if (r8 <= Long.MIN_VALUE) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
        
            r8 = r8 - 1;
            r1 = r1 + 54;
            r13 = (r1 ^ (-1)) + (r1 << 1);
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
        
            r1 = r1 + 31;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
        
            if ((r1 % 2) == 0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        
            if (r8 >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        
            if (r8 >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        
            r1 = ivas.gov.bisp.enumeration.cU.c.bGH.b;
            r8 = r1 & 53;
            r1 = r1 | 53;
            r2 = (r8 & r1) + (r1 | r8);
            r1 = r2 % 128;
            ivas.gov.bisp.enumeration.cU.c.bGH.a = r1;
            r2 = r2 % 2;
         */
        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long s(long r13) {
            /*
                Method dump skipped, instruction units count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cU.c.bGH.s(long):long");
        }

        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final long r(long j) {
            int i;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = (((i3 ^ 15) | (i3 & 15)) << 1) - (((~i3) & 15) | (i3 & (-16)));
            a = i4 % 128;
            int i5 = i4 % 2;
            long[] jArr = this.i;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                int i6 = b;
                int i7 = i6 & 115;
                int i8 = (((i6 ^ 115) | i7) << 1) - ((i6 | 115) & (~i7));
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = ((iBinarySearch | 166) << 1) - (iBinarySearch ^ 166);
                    int i10 = (i9 ^ (-1)) + (i9 << 1);
                    int i11 = ((i10 | (-104)) << 1) - (i10 ^ (-104));
                    i = (i11 ^ (-1)) + (i11 << 1);
                } else {
                    i = (iBinarySearch | 1) + (iBinarySearch & 1);
                }
            } else {
                i = (iBinarySearch | (~iBinarySearch)) & (~iBinarySearch);
                int i12 = a + 27;
                b = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 / 2;
                }
            }
            if (i < jArr.length) {
                int i14 = a;
                int i15 = ((i14 ^ 37) - (~((i14 & 37) << 1))) - 1;
                b = i15 % 128;
                int i16 = i15 % 2;
                long j2 = jArr[i];
                int i17 = (i14 & 33) + (i14 | 33);
                b = i17 % 128;
                int i18 = i17 % 2;
                return j2;
            }
            bGF bgf = this.l;
            Object obj = null;
            if (bgf == null) {
                int i19 = b;
                int i20 = i19 & 37;
                int i21 = (((~i20) & (i19 | 37)) - (~(i20 << 1))) - 1;
                a = i21 % 128;
                if (i21 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i22 = i19 | 119;
                int i23 = (i22 << 1) - ((~(i19 & 119)) & i22);
                a = i23 % 128;
                int i24 = i23 % 2;
                return j;
            }
            long j3 = jArr[jArr.length - 1];
            int i25 = b + 93;
            int i26 = i25 % 128;
            a = i26;
            int i27 = i25 % 2;
            if (j < j3) {
                int i28 = ((i26 | 52) << 1) - (i26 ^ 52);
                int i29 = (i28 ^ (-1)) + (i28 << 1);
                b = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
                j = j3;
            }
            long jR = bgf.r(j);
            int i30 = b;
            int i31 = (-2) - (((i30 & 12) + (i30 | 12)) ^ (-1));
            a = i31 % 128;
            if (i31 % 2 != 0) {
                return jR;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0032  */
        /* JADX WARN: Code duplicated, block: B:15:0x003c  */
        /* JADX WARN: Code duplicated, block: B:17:0x006f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0099  */
        /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:30:0x0110  */
        /* JADX WARN: Code duplicated, block: B:32:0x0128  */
        /* JADX WARN: Code duplicated, block: B:34:0x012e  */
        /* JADX WARN: Code duplicated, block: B:36:0x0143  */
        /* JADX WARN: Code duplicated, block: B:37:0x0155  */
        /* JADX WARN: Code duplicated, block: B:40:0x015d  */
        /* JADX WARN: Code duplicated, block: B:41:0x015f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0162  */
        /* JADX WARN: Code duplicated, block: B:46:0x0180  */
        /* JADX WARN: Code duplicated, block: B:48:0x0189 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x018a  */
        @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
        public final boolean equals(Object obj) {
            boolean z;
            int i;
            Object obj2;
            int i2;
            bGH bgh;
            String str;
            String str2;
            long[] jArr;
            long[] jArr2;
            int i3;
            String[] strArr;
            String[] strArr2;
            int[] iArr;
            int[] iArr2;
            int[] iArr3;
            int[] iArr4;
            int i4;
            int i5;
            bGF bgf;
            bGF bgf2;
            int i6;
            int i7 = 2 % 2;
            int i8 = b;
            int i9 = (i8 & (-102)) | ((~i8) & 101);
            int i10 = -(-((i8 & 101) << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            int i12 = i11 % 128;
            a = i12;
            boolean z2 = false;
            if (i11 % 2 == 0) {
                if (this != obj) {
                    z = false;
                    obj2 = null;
                    if (obj instanceof bGH) {
                        i2 = i8 + 43;
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            return false;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    int i13 = (i12 & (-86)) | ((~i12) & 85);
                    int i14 = -(-((i12 & 85) << 1));
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    bgh = (bGH) obj;
                    str = this.g;
                    str2 = bgh.g;
                    int i17 = b;
                    int i18 = i17 & 19;
                    int i19 = -(-((i17 ^ 19) | i18));
                    int i20 = (i18 & i19) + (i19 | i18);
                    a = i20 % 128;
                    int i21 = i20 % 2;
                    if (str.equals(str2)) {
                        int i22 = a;
                        int i23 = i22 & 95;
                        int i24 = (i22 | 95) & (~i23);
                        int i25 = -(-(i23 << 1));
                        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                        int i27 = i26 % 128;
                        b = i27;
                        int i28 = i26 % 2;
                        jArr = this.i;
                        jArr2 = bgh.i;
                        int i29 = ((i27 | 15) << 1) - (i27 ^ 15);
                        a = i29 % 128;
                        int i30 = i29 % 2;
                        if (Arrays.equals(jArr, jArr2)) {
                            int i31 = b;
                            i3 = ((i31 ^ 122) + ((i31 & 122) << 1)) - 1;
                            int i32 = i3 % 128;
                            a = i32;
                            if (i3 % 2 == 0) {
                                strArr = this.k;
                                strArr2 = bgh.k;
                                int i33 = 31 / 0;
                            } else {
                                strArr = this.k;
                                strArr2 = bgh.k;
                            }
                            int i34 = i32 & 59;
                            int i35 = i32 | 59;
                            int i36 = (i34 & i35) + (i35 | i34);
                            b = i36 % 128;
                            int i37 = i36 % 2;
                            if (Arrays.equals(strArr, strArr2)) {
                                int i38 = a;
                                int i39 = i38 & 33;
                                int i40 = i38 | 33;
                                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                                int i42 = i41 % 128;
                                b = i42;
                                int i43 = i41 % 2;
                                iArr = this.j;
                                iArr2 = bgh.j;
                                int i44 = i42 + 95;
                                a = i44 % 128;
                                int i45 = i44 % 2;
                                if (Arrays.equals(iArr, iArr2)) {
                                    int i46 = a;
                                    int i47 = ((i46 | 12) << 1) - (i46 ^ 12);
                                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                                    int i49 = i48 % 128;
                                    b = i49;
                                    int i50 = i48 % 2;
                                    iArr3 = this.h;
                                    iArr4 = bgh.h;
                                    int i51 = (i49 ^ 125) + ((i49 & 125) << 1);
                                    a = i51 % 128;
                                    int i52 = i51 % 2;
                                    if (!Arrays.equals(iArr3, iArr4)) {
                                        int i53 = b;
                                        int i54 = (i53 ^ 35) + ((i53 & 35) << 1);
                                        a = i54 % 128;
                                        int i55 = i54 % 2;
                                    } else {
                                        int i56 = b;
                                        int i57 = i56 & 101;
                                        int i58 = ((i56 ^ 101) | i57) << 1;
                                        int i59 = -((i56 | 101) & (~i57));
                                        i4 = (i58 & i59) + (i59 | i58);
                                        i5 = i4 % 128;
                                        a = i5;
                                        if (i4 % 2 != 0) {
                                            bGF bgf3 = bgh.l;
                                            throw null;
                                        }
                                        bgf = this.l;
                                        bgf2 = bgh.l;
                                        if (bgf == null) {
                                            int i60 = i5 & 103;
                                            int i61 = ((((i5 ^ 103) | i60) << 1) - (~(-((i5 | 103) & (~i60))))) - 1;
                                            i6 = i61 % 128;
                                            b = i6;
                                            int i62 = i61 % 2;
                                            if (bgf2 == null) {
                                                int i63 = i6 | 3;
                                                int i64 = ((i63 << 1) - (~(-(i63 & (~(i6 & 3)))))) - 1;
                                                a = i64 % 128;
                                                int i65 = i64 % 2;
                                                z2 = z;
                                            } else {
                                                int i510 = b;
                                                int i511 = (i510 ^ 35) + ((i510 & 35) << 1);
                                                a = i511 % 128;
                                                int i512 = i511 % 2;
                                            }
                                        } else if (!bgf.equals(bgf2)) {
                                            int i513 = b;
                                            int i514 = (i513 ^ 35) + ((i513 & 35) << 1);
                                            a = i514 % 128;
                                            int i515 = i514 % 2;
                                        } else {
                                            z2 = z;
                                        }
                                    }
                                } else {
                                    int i516 = b;
                                    int i517 = (i516 ^ 35) + ((i516 & 35) << 1);
                                    a = i517 % 128;
                                    int i518 = i517 % 2;
                                }
                            } else {
                                int i519 = b;
                                int i5110 = (i519 ^ 35) + ((i519 & 35) << 1);
                                a = i5110 % 128;
                                int i5111 = i5110 % 2;
                            }
                        } else {
                            int i5112 = b;
                            int i5113 = (i5112 ^ 35) + ((i5112 & 35) << 1);
                            a = i5113 % 128;
                            int i5114 = i5113 % 2;
                        }
                    } else {
                        int i5115 = b;
                        int i5116 = (i5115 ^ 35) + ((i5115 & 35) << 1);
                        a = i5116 % 128;
                        int i5117 = i5116 % 2;
                    }
                    int i66 = b;
                    int i67 = i66 & 21;
                    int i68 = (i66 ^ 21) | i67;
                    int i69 = (i67 & i68) + (i68 | i67);
                    a = i69 % 128;
                    int i70 = i69 % 2;
                    return z2;
                }
                i = ((i8 | 67) << 1) - (i8 ^ 67);
                a = i % 128;
                if (i % 2 == 0) {
                    int i71 = 70 / 0;
                }
                return true;
            }
            if (this != obj) {
                z = true;
                obj2 = null;
                if (obj instanceof bGH) {
                    i2 = i8 + 43;
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                int i110 = (i12 & (-86)) | ((~i12) & 85);
                int i111 = -(-((i12 & 85) << 1));
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                b = i112 % 128;
                int i113 = i112 % 2;
                bgh = (bGH) obj;
                str = this.g;
                str2 = bgh.g;
                int i114 = b;
                int i115 = i114 & 19;
                int i116 = -(-((i114 ^ 19) | i115));
                int i210 = (i115 & i116) + (i116 | i115);
                a = i210 % 128;
                int i211 = i210 % 2;
                if (str.equals(str2)) {
                    int i212 = a;
                    int i213 = i212 & 95;
                    int i214 = (i212 | 95) & (~i213);
                    int i215 = -(-(i213 << 1));
                    int i216 = (i214 ^ i215) + ((i214 & i215) << 1);
                    int i217 = i216 % 128;
                    b = i217;
                    int i218 = i216 % 2;
                    jArr = this.i;
                    jArr2 = bgh.i;
                    int i219 = ((i217 | 15) << 1) - (i217 ^ 15);
                    a = i219 % 128;
                    int i310 = i219 % 2;
                    if (Arrays.equals(jArr, jArr2)) {
                        int i311 = b;
                        i3 = ((i311 ^ 122) + ((i311 & 122) << 1)) - 1;
                        int i312 = i3 % 128;
                        a = i312;
                        if (i3 % 2 == 0) {
                            strArr = this.k;
                            strArr2 = bgh.k;
                            int i313 = 31 / 0;
                        } else {
                            strArr = this.k;
                            strArr2 = bgh.k;
                        }
                        int i314 = i312 & 59;
                        int i315 = i312 | 59;
                        int i316 = (i314 & i315) + (i315 | i314);
                        b = i316 % 128;
                        int i317 = i316 % 2;
                        if (Arrays.equals(strArr, strArr2)) {
                            int i318 = a;
                            int i319 = i318 & 33;
                            int i410 = i318 | 33;
                            int i411 = (i319 ^ i410) + ((i410 & i319) << 1);
                            int i412 = i411 % 128;
                            b = i412;
                            int i413 = i411 % 2;
                            iArr = this.j;
                            iArr2 = bgh.j;
                            int i414 = i412 + 95;
                            a = i414 % 128;
                            int i415 = i414 % 2;
                            if (Arrays.equals(iArr, iArr2)) {
                                int i416 = a;
                                int i417 = ((i416 | 12) << 1) - (i416 ^ 12);
                                int i418 = (i417 ^ (-1)) + (i417 << 1);
                                int i419 = i418 % 128;
                                b = i419;
                                int i520 = i418 % 2;
                                iArr3 = this.h;
                                iArr4 = bgh.h;
                                int i521 = (i419 ^ 125) + ((i419 & 125) << 1);
                                a = i521 % 128;
                                int i522 = i521 % 2;
                                if (!Arrays.equals(iArr3, iArr4)) {
                                    int i5118 = b;
                                    int i5119 = (i5118 ^ 35) + ((i5118 & 35) << 1);
                                    a = i5119 % 128;
                                    int i51110 = i5119 % 2;
                                } else {
                                    int i523 = b;
                                    int i524 = i523 & 101;
                                    int i525 = ((i523 ^ 101) | i524) << 1;
                                    int i526 = -((i523 | 101) & (~i524));
                                    i4 = (i525 & i526) + (i526 | i525);
                                    i5 = i4 % 128;
                                    a = i5;
                                    if (i4 % 2 != 0) {
                                        bGF bgf4 = bgh.l;
                                        throw null;
                                    }
                                    bgf = this.l;
                                    bgf2 = bgh.l;
                                    if (bgf == null) {
                                        int i610 = i5 & 103;
                                        int i611 = ((((i5 ^ 103) | i610) << 1) - (~(-((i5 | 103) & (~i610))))) - 1;
                                        i6 = i611 % 128;
                                        b = i6;
                                        int i612 = i611 % 2;
                                        if (bgf2 == null) {
                                            int i613 = i6 | 3;
                                            int i614 = ((i613 << 1) - (~(-(i613 & (~(i6 & 3)))))) - 1;
                                            a = i614 % 128;
                                            int i615 = i614 % 2;
                                            z2 = z;
                                        } else {
                                            int i51111 = b;
                                            int i51112 = (i51111 ^ 35) + ((i51111 & 35) << 1);
                                            a = i51112 % 128;
                                            int i51113 = i51112 % 2;
                                        }
                                    } else if (!bgf.equals(bgf2)) {
                                        int i51114 = b;
                                        int i51115 = (i51114 ^ 35) + ((i51114 & 35) << 1);
                                        a = i51115 % 128;
                                        int i51116 = i51115 % 2;
                                    } else {
                                        z2 = z;
                                    }
                                }
                            } else {
                                int i51117 = b;
                                int i51118 = (i51117 ^ 35) + ((i51117 & 35) << 1);
                                a = i51118 % 128;
                                int i51119 = i51118 % 2;
                            }
                        } else {
                            int i511110 = b;
                            int i511111 = (i511110 ^ 35) + ((i511110 & 35) << 1);
                            a = i511111 % 128;
                            int i511112 = i511111 % 2;
                        }
                    } else {
                        int i511113 = b;
                        int i511114 = (i511113 ^ 35) + ((i511113 & 35) << 1);
                        a = i511114 % 128;
                        int i511115 = i511114 % 2;
                    }
                } else {
                    int i511116 = b;
                    int i511117 = (i511116 ^ 35) + ((i511116 & 35) << 1);
                    a = i511117 % 128;
                    int i511118 = i511117 % 2;
                }
                int i616 = b;
                int i617 = i616 & 21;
                int i618 = (i616 ^ 21) | i617;
                int i619 = (i617 & i618) + (i618 | i617);
                a = i619 % 128;
                int i72 = i619 % 2;
                return z2;
            }
            i = ((i8 | 67) << 1) - (i8 ^ 67);
            a = i % 128;
            if (i % 2 == 0) {
                int i73 = 70 / 0;
            }
            return true;
        }

        public static bGH t(DataInput dataInput, String str) throws IOException {
            bGF bgf;
            int unsignedShort;
            int i;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (-2) - (((i3 ^ 72) + ((i3 & 72) << 1)) ^ (-1));
            b = i4 % 128;
            int i5 = i4 % 2;
            int unsignedShort2 = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort2];
            int i6 = a;
            int i7 = ((i6 | 123) << 1) - (((~i6) & 123) | (i6 & (-124)));
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 17;
            int i11 = ((i8 ^ 17) | i10) << 1;
            int i12 = -((i8 | 17) & (~i10));
            int i13 = (i11 & i12) + (i12 | i11);
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            int i16 = 0;
            while (i16 < unsignedShort2) {
                int i17 = b;
                int i18 = i17 & 25;
                int i19 = i18 + ((i17 ^ 25) | i18);
                a = i19 % 128;
                int i20 = i19 % 2;
                strArr[i16] = dataInput.readUTF();
                int i21 = i16 & 1;
                i16 = (i21 - (~(-(-((i16 ^ 1) | i21))))) - 1;
                int i22 = a;
                int i23 = i22 ^ 73;
                int i24 = (((i22 & 73) | i23) << 1) - i23;
                b = i24 % 128;
                int i25 = i24 % 2;
            }
            int i26 = dataInput.readInt();
            long[] jArr = new long[i26];
            int[] iArr = new int[i26];
            int i27 = a;
            int i28 = i27 + 75;
            b = i28 % 128;
            int i29 = i28 % 2;
            int[] iArr2 = new int[i26];
            String[] strArr2 = new String[i26];
            int i30 = ((i27 & (-104)) | ((~i27) & 103)) + ((i27 & 103) << 1);
            b = i30 % 128;
            Object obj = null;
            if (i30 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i31 = i27 & 7;
            int i32 = -(-((i27 ^ 7) | i31));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            b = i33 % 128;
            int i34 = i33 % 2;
            while (i15 < i26) {
                int i35 = a;
                int i36 = i35 | 21;
                int i37 = i36 << 1;
                int i38 = -((~(i35 & 21)) & i36);
                int i39 = (i37 & i38) + (i38 | i37);
                b = i39 % 128;
                int i40 = i39 % 2;
                jArr[i15] = c.c(dataInput);
                int iC = (int) c.c(dataInput);
                int i41 = b;
                int i42 = ((i41 | 113) << 1) - (i41 ^ 113);
                a = i42 % 128;
                int i43 = i42 % 2;
                iArr[i15] = iC;
                iArr2[i15] = (int) c.c(dataInput);
                if (unsignedShort2 < 256) {
                    int i44 = a + 49;
                    b = i44 % 128;
                    int i45 = i44 % 2;
                    try {
                        unsignedShort = dataInput.readUnsignedByte();
                        int i46 = a;
                        int i47 = i46 & 37;
                        int i48 = (i46 | 37) & (~i47);
                        int i49 = -(-(i47 << 1));
                        i = (i48 & i49) + (i48 | i49);
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedShort = dataInput.readUnsignedShort();
                    int i50 = a;
                    int i51 = i50 ^ 9;
                    int i52 = -(-((i50 & 9) << 1));
                    i = ((i51 | i52) << 1) - (i52 ^ i51);
                }
                b = i % 128;
                int i53 = i % 2;
                strArr2[i15] = strArr[unsignedShort];
                int i54 = (-2) - ((i15 + 106) ^ (-1));
                i15 = (((i54 | (-103)) << 1) - (i54 ^ (-103))) - 1;
                int i55 = b;
                int i56 = ((i55 | 49) << 1) - (i55 ^ 49);
                a = i56 % 128;
                int i57 = i56 % 2;
            }
            if (dataInput.readBoolean()) {
                bGF bgf2 = new bGF(str, (int) c.c(dataInput), bGI.c(dataInput), bGI.c(dataInput));
                int i58 = a + 25;
                int i59 = i58 % 128;
                b = i59;
                int i60 = i58 % 2;
                int i61 = i59 & 31;
                int i62 = (((i59 | 31) & (~i61)) - (~(i61 << 1))) - 1;
                a = i62 % 128;
                int i63 = i62 % 2;
                bgf = bgf2;
            } else {
                bgf = null;
            }
            bGH bgh = new bGH(str, jArr, iArr, iArr2, strArr2, bgf);
            int i64 = b;
            int i65 = i64 & 65;
            int i66 = i65 + ((i64 ^ 65) | i65);
            a = i66 % 128;
            if (i66 % 2 != 0) {
                return bgh;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e A[PHI: r7
  0x009e: PHI (r7v11 java.lang.Object) = (r7v10 java.lang.Object), (r7v25 java.lang.Object) binds: [B:23:0x009c, B:20:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    public static AbstractC0242a b(DataInput dataInput, String str) throws IOException {
        Object obj;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            bGH bghT = bGH.t(dataInput, str);
            int i5 = j.h;
            j jVar = new j(bghT);
            int i6 = b;
            int i7 = ((i6 & 78) + (i6 | 78)) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return jVar;
        }
        int i9 = b;
        int i10 = ((i9 | 81) << 1) - (i9 ^ 81);
        int i11 = i10 % 128;
        a = i11;
        int i12 = i10 % 2;
        if (unsignedByte != 70) {
            int i13 = (i11 & (-20)) | ((~i11) & 19);
            int i14 = (i11 & 19) << 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 != 0 ? unsignedByte != 80 : unsignedByte != 126) {
                throw new IOException("Invalid encoding");
            }
            bGH bghT2 = bGH.t(dataInput, str);
            int i16 = a;
            int i17 = i16 & 125;
            int i18 = -(-((i16 ^ 125) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            return bghT2;
        }
        r rVar = new r(str, dataInput.readUTF(), (int) c(dataInput), (int) c(dataInput));
        int i21 = a;
        int i22 = i21 & 95;
        int i23 = i22 + ((i21 ^ 95) | i22);
        b = i23 % 128;
        if (i23 % 2 == 0) {
            obj = AbstractC0242a.c;
            int i24 = 36 / 0;
            if (rVar.equals(obj)) {
                rVar = obj;
                int i25 = b;
                int i26 = ((i25 ^ 41) | (i25 & 41)) << 1;
                int i27 = -(((~i25) & 41) | (i25 & (-42)));
                i = (i26 & i27) + (i27 | i26);
                a = i % 128;
                if (i % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
        } else {
            obj = AbstractC0242a.c;
            if (rVar.equals(obj)) {
                rVar = obj;
                int i28 = b;
                int i29 = ((i28 ^ 41) | (i28 & 41)) << 1;
                int i210 = -(((~i28) & 41) | (i28 & (-42)));
                i = (i29 & i210) + (i210 | i29);
                a = i % 128;
                if (i % 2 != 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }
        }
        int i30 = b;
        int i31 = ((i30 | 70) << 1) - (i30 ^ 70);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        a = i32 % 128;
        int i33 = i32 % 2;
        return rVar;
    }

    public static long c(DataInput dataInput) throws IOException {
        int unsignedByte;
        int i;
        int i2;
        long unsignedByte2;
        long j;
        long j2;
        long j3;
        int i3 = 2 % 2;
        int i4 = b;
        int i5 = (i4 & (-106)) | ((~i4) & 105);
        int i6 = (i4 & 105) << 1;
        int i7 = (i5 & i6) + (i6 | i5);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            unsignedByte = dataInput.readUnsignedByte();
            i = unsignedByte - 36;
        } else {
            unsignedByte = dataInput.readUnsignedByte();
            i = unsignedByte >> 6;
        }
        if (i != 1) {
            int i8 = a;
            int i9 = i8 & 75;
            int i10 = -(-(i8 | 75));
            int i11 = (i9 & i10) + (i9 | i10);
            b = i11 % 128;
            if (i11 % 2 != 0 ? i == 2 : i == 5) {
                long j4 = unsignedByte;
                long unsignedByte3 = dataInput.readUnsignedByte() << 24;
                int i12 = b;
                int i13 = (i12 ^ 65) + ((i12 & 65) << 1);
                a = i13 % 128;
                int i14 = i13 % 2;
                long unsignedByte4 = dataInput.readUnsignedByte() << 16;
                int unsignedByte5 = dataInput.readUnsignedByte();
                int i15 = b + 101;
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    j3 = unsignedByte5 * 108;
                    j2 = j4 << 59;
                } else {
                    j2 = (j4 << 58) >> 26;
                    j3 = unsignedByte5 << 8;
                }
                unsignedByte2 = ((long) dataInput.readUnsignedByte()) | j2 | unsignedByte3 | unsignedByte4 | j3;
                int i16 = b;
                int i17 = i16 + 55;
                a = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i16 & 37;
                int i20 = -(-(i16 | 37));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                a = i21 % 128;
                int i22 = i21 % 2;
                j = 1000;
            } else {
                if (i == 3) {
                    long j5 = dataInput.readLong();
                    int i23 = a;
                    int i24 = i23 & 45;
                    int i25 = -(-((i23 ^ 45) | i24));
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    b = i26 % 128;
                    if (i26 % 2 != 0) {
                        return j5;
                    }
                    throw null;
                }
                int i27 = ((i8 | 103) << 1) - (i8 ^ 103);
                int i28 = i27 % 128;
                b = i28;
                unsignedByte2 = i27 % 2 == 0 ? (unsignedByte + 100) % 30 : (unsignedByte << 26) >> 26;
                int i29 = ((i28 & (-38)) | ((~i28) & 37)) + ((i28 & 37) << 1);
                a = i29 % 128;
                int i30 = i29 % 2;
                j = 1800000;
            }
        } else {
            int unsignedByte6 = dataInput.readUnsignedByte();
            int unsignedByte7 = dataInput.readUnsignedByte();
            int unsignedByte8 = dataInput.readUnsignedByte();
            int i31 = (-2) - ((b + 124) ^ (-1));
            int i32 = i31 % 128;
            a = i32;
            if (i31 % 2 != 0) {
                int i33 = (unsignedByte << 82) % 5;
                int i34 = unsignedByte6 << 71;
                int i35 = ((~i33) & i34) | ((~i34) & i33);
                int i36 = unsignedByte7 % 4;
                i2 = (i35 & i36) | (i35 ^ i36);
            } else {
                int i37 = (unsignedByte << 26) >> 2;
                int i38 = unsignedByte6 << 16;
                int i39 = i37 ^ i38;
                int i40 = i37 & i38;
                int i41 = (i40 & i39) | (i39 ^ i40);
                int i42 = unsignedByte7 << 8;
                i2 = (i41 & i42) | (i41 ^ i42);
            }
            int i43 = ((~i2) & unsignedByte8) | ((~unsignedByte8) & i2);
            int i44 = unsignedByte8 & i2;
            unsignedByte2 = (i44 & i43) | (i43 ^ i44);
            int i45 = ((((i32 ^ 45) | (i32 & 45)) << 1) - (~(-((i32 & (-46)) | ((~i32) & 45))))) - 1;
            b = i45 % 128;
            int i46 = i45 % 2;
            j = 60000;
        }
        long j6 = unsignedByte2 * j;
        int i47 = a;
        int i48 = (((i47 & (-104)) | ((~i47) & 103)) - (~(-(-((i47 & 103) << 1))))) - 1;
        b = i48 % 128;
        if (i48 % 2 != 0) {
            return j6;
        }
        throw null;
    }

    public static final class bGG {
        private static int a = 0;
        private static int b = 1;
        public final char c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;

        public bGG(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c != 'u' && c != 'w') {
                int i5 = b;
                int i6 = i5 & 125;
                int i7 = -(-(i5 | 125));
                int i8 = (i6 & i7) + (i7 | i6);
                a = i8 % 128;
                int i9 = i8 % 2;
                if (c != 's') {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown mode: ");
                    sb.append(c);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.c = c;
            this.d = i;
            this.e = i2;
            int i10 = a;
            int i11 = (-2) - ((i10 + 116) ^ (-1));
            b = i11 % 128;
            int i12 = i11 % 2;
            this.f = i3;
            this.h = z;
            this.g = i4;
            int i13 = i10 ^ 3;
            int i14 = -(-((i10 & 3) << 1));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            b = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
        }

        public final long e(ivas.gov.bisp.enumeration.p096p.h hVar, long j) {
            long jC;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 89;
            int i4 = i3 + ((i2 ^ 89) | i3);
            a = i4 % 128;
            int i5 = i4 % 2;
            try {
                jC = c(hVar, j);
                int i6 = b;
                int i7 = ((i6 ^ 35) | (i6 & 35)) << 1;
                int i8 = -(((~i6) & 35) | (i6 & (-36)));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            } catch (IllegalArgumentException e) {
                if (this.d != 2 || this.e != 29) {
                    throw e;
                }
                while (true) {
                    AbstractC0248j abstractC0248j = (AbstractC0248j) hVar;
                    if (abstractC0248j.G.u(j)) {
                        break;
                    }
                    int i11 = a;
                    int i12 = (i11 & (-20)) | ((~i11) & 19);
                    int i13 = (i11 & 19) << 1;
                    int i14 = (i12 & i13) + (i13 | i12);
                    b = i14 % 128;
                    if (i14 % 2 == 0) {
                        j = abstractC0248j.G.d(j, -1);
                        int i15 = 42 / 0;
                    } else {
                        j = abstractC0248j.G.d(j, -1);
                    }
                    int i16 = a;
                    int i17 = i16 & 87;
                    int i18 = ((i16 ^ 87) | i17) << 1;
                    int i19 = -((i16 | 87) & (~i17));
                    int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                    b = i20 % 128;
                    int i21 = i20 % 2;
                }
                jC = c(hVar, j);
                int i22 = b;
                int i23 = i22 ^ 79;
                int i24 = ((i22 & 79) | i23) << 1;
                int i25 = -i23;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                a = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = (-2) - ((b + 62) ^ (-1));
            a = i28 % 128;
            if (i28 % 2 == 0) {
                return jC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 119) - (~(-(-((i2 & 119) << 1))))) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("[OfYear]\nMode: ");
            sbW.append(this.c);
            int i5 = a;
            int i6 = i5 & 5;
            int i7 = -(-((i5 ^ 5) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                sbW.append('\n');
                sbW.append("MonthOfYear: ");
                sbW.append(this.d);
                int i9 = 9 / 0;
            } else {
                sbW.append('\n');
                sbW.append("MonthOfYear: ");
                sbW.append(this.d);
            }
            sbW.append('\n');
            sbW.append("DayOfMonth: ");
            int i10 = this.e;
            int i11 = b;
            int i12 = i11 & 7;
            int i13 = -(-((i11 ^ 7) | i12));
            int i14 = (i12 & i13) + (i13 | i12);
            a = i14 % 128;
            int i15 = i14 % 2;
            sbW.append(i10);
            sbW.append('\n');
            sbW.append("DayOfWeek: ");
            int i16 = a;
            int i17 = i16 & 39;
            int i18 = (i16 | 39) & (~i17);
            int i19 = i17 << 1;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            b = i20 % 128;
            int i21 = i20 % 2;
            sbW.append(this.f);
            if (i21 == 0) {
                sbW.append('W');
            } else {
                sbW.append('\n');
            }
            sbW.append("AdvanceDayOfWeek: ");
            sbW.append(this.h);
            sbW.append('\n');
            int i22 = b;
            int i23 = (i22 ^ 109) + ((i22 & 109) << 1);
            a = i23 % 128;
            int i24 = i23 % 2;
            sbW.append("MillisOfDay: ");
            sbW.append(this.g);
            int i25 = a;
            int i26 = i25 & 11;
            int i27 = (i26 - (~(-(-((i25 ^ 11) | i26))))) - 1;
            b = i27 % 128;
            int i28 = i27 % 2;
            sbW.append('\n');
            String string = sbW.toString();
            int i29 = b;
            int i30 = (i29 | 45) << 1;
            int i31 = -(((~i29) & 45) | (i29 & (-46)));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            a = i32 % 128;
            if (i32 % 2 == 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
            b = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i5 = (i2 & 117) + (i2 | 117);
                int i6 = i5 % 128;
                b = i6;
                int i7 = i5 % 2;
                int i8 = ((i6 & 9) - (~(i6 | 9))) - 1;
                a = i8 % 128;
                if (i8 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            boolean z = false;
            if (!(obj instanceof bGG)) {
                int i9 = i2 + 67;
                b = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = ((i2 | 93) << 1) - (i2 ^ 93);
            b = i11 % 128;
            if (i11 % 2 == 0) {
                char c = ((bGG) obj).c;
                obj2.hashCode();
                throw null;
            }
            bGG bgg = (bGG) obj;
            if (this.c == bgg.c) {
                int i12 = ((i2 & 21) - (~(i2 | 21))) - 1;
                int i13 = i12 % 128;
                b = i13;
                if (i12 % 2 == 0) {
                    int i14 = bgg.d;
                    obj2.hashCode();
                    throw null;
                }
                if (this.d == bgg.d && this.e == bgg.e) {
                    int i15 = i13 & 9;
                    int i16 = ((i13 ^ 9) | i15) << 1;
                    int i17 = -((i13 | 9) & (~i15));
                    int i18 = (i16 & i17) + (i17 | i16);
                    int i19 = i18 % 128;
                    a = i19;
                    if (i18 % 2 != 0) {
                        int i20 = bgg.f;
                        throw null;
                    }
                    if (this.f == bgg.f) {
                        int i21 = i19 + 43;
                        int i22 = i21 % 128;
                        b = i22;
                        int i23 = i21 % 2;
                        if (this.h == bgg.h) {
                            int i24 = (i22 ^ 25) + ((i22 & 25) << 1);
                            a = i24 % 128;
                            int i25 = i24 % 2;
                            if (this.g != bgg.g) {
                                int i26 = b + 43;
                                a = i26 % 128;
                                int i27 = i26 % 2;
                            } else {
                                z = true;
                            }
                        } else {
                            int i28 = b + 43;
                            a = i28 % 128;
                            int i29 = i28 % 2;
                        }
                    } else {
                        int i210 = b + 43;
                        a = i210 % 128;
                        int i211 = i210 % 2;
                    }
                } else {
                    int i212 = b + 43;
                    a = i212 % 128;
                    int i213 = i212 % 2;
                }
            } else {
                int i214 = b + 43;
                a = i214 % 128;
                int i215 = i214 % 2;
            }
            int i30 = a;
            int i31 = i30 ^ 25;
            int i32 = -(-((i30 & 25) << 1));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            b = i33 % 128;
            int i34 = i33 % 2;
            return z;
        }

        public final long f(ivas.gov.bisp.enumeration.p096p.h hVar, long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 67;
            int i4 = (i2 | 67) & (~i3);
            int i5 = i3 << 1;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                ((AbstractC0248j) hVar).D.f(j);
                throw null;
            }
            AbstractC0248j abstractC0248j = (AbstractC0248j) hVar;
            int iF = abstractC0248j.D.f(j);
            int i7 = this.f;
            int i8 = -iF;
            int i9 = i7 & i8;
            int i10 = i9 + ((i8 ^ i7) | i9);
            int i11 = b;
            int i12 = i11 & 45;
            int i13 = (i12 - (~((i11 ^ 45) | i12))) - 1;
            a = i13 % 128;
            int i14 = i13 % 2;
            if (i10 != 0) {
                int i15 = (i11 & 3) + (i11 | 3);
                int i16 = i15 % 128;
                a = i16;
                int i17 = i15 % 2;
                if (!(!this.h)) {
                    int i18 = (((i16 & (-14)) | ((~i16) & 13)) - (~(-(-((i16 & 13) << 1))))) - 1;
                    b = i18 % 128;
                    if (i18 % 2 == 0) {
                        throw null;
                    }
                    if (i10 < 0) {
                        int i19 = ((i16 & 60) + (i16 | 60)) - 1;
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        i10 = (((i10 ^ 7) | (i10 & 7)) << 1) - ((i10 & (-8)) | ((~i10) & 7));
                        int i21 = i16 & 107;
                        int i22 = (i16 ^ 107) | i21;
                        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                    }
                } else if (i10 > 0) {
                    int i25 = i16 + 101;
                    int i26 = i25 % 128;
                    b = i26;
                    if (i25 % 2 == 0) {
                        i10 >>= 7;
                    } else {
                        int i27 = i10 & (-7);
                        int i28 = (~i27) & (i10 | (-7));
                        int i29 = i27 << 1;
                        i10 = ((i28 | i29) << 1) - (i29 ^ i28);
                    }
                    int i30 = ((i26 | 67) << 1) - (i26 ^ 67);
                    a = i30 % 128;
                    int i31 = i30 % 2;
                }
                j = abstractC0248j.D.d(j, i10);
                int i32 = b;
                int i33 = ((i32 | 67) << 1) - (i32 ^ 67);
                a = i33 % 128;
                int i34 = i33 % 2;
            }
            int i35 = b;
            int i36 = (i35 & (-78)) | ((~i35) & 77);
            int i37 = -(-((i35 & 77) << 1));
            int i38 = (i36 & i37) + (i37 | i36);
            a = i38 % 128;
            int i39 = i38 % 2;
            return j;
        }

        public final long c(ivas.gov.bisp.enumeration.p096p.h hVar, long j) {
            long jD;
            P pX;
            long jD2;
            int i = 2 % 2;
            int i2 = b + 41;
            int i3 = i2 % 128;
            a = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.e >= 0) {
                int i4 = i3 + 70;
                int i5 = (i4 ^ (-1)) + (i4 << 1);
                b = i5 % 128;
                int i6 = i5 % 2;
                jD2 = hVar.x().A(j, this.e);
                int i7 = b;
                int i8 = i7 & 101;
                int i9 = (((i7 | 101) & (~i8)) - (~(i8 << 1))) - 1;
                a = i9 % 128;
                int i10 = i9 % 2;
            } else {
                long jA = hVar.x().A(j, 1);
                P pAD = hVar.aD();
                int i11 = a;
                int i12 = (i11 & 11) + (i11 | 11);
                b = i12 % 128;
                if (i12 % 2 == 0) {
                    jD = pAD.d(jA, 1);
                    pX = hVar.x();
                } else {
                    jD = pAD.d(jA, 1);
                    pX = hVar.x();
                }
                jD2 = pX.d(jD, this.e);
                int i13 = b;
                int i14 = i13 & 73;
                int i15 = i14 + ((i13 ^ 73) | i14);
                a = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
            }
            int i16 = b;
            int i17 = ((i16 ^ 11) | (i16 & 11)) << 1;
            int i18 = -(((~i16) & 11) | (i16 & (-12)));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            a = i19 % 128;
            if (i19 % 2 == 0) {
                return jD2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final long d(ivas.gov.bisp.enumeration.p096p.h hVar, long j) {
            long j2;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 123;
            int i4 = (i2 ^ 123) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            int i6 = 0;
            try {
                if (i5 % 2 == 0) {
                    int i7 = 93 / 0;
                    hVar = c(hVar, j);
                } else {
                    hVar = c(hVar, j);
                }
                int i8 = a;
                int i9 = i8 & 47;
                int i10 = (i9 - (~(-(-((i8 ^ 47) | i9))))) - 1;
                b = i10 % 128;
                i6 = i10 % 2;
                j2 = hVar;
            } catch (IllegalArgumentException e) {
                if (this.d != 2 || this.e != 29) {
                    throw e;
                }
                while (true) {
                    AbstractC0248j abstractC0248j = (AbstractC0248j) hVar;
                    if (abstractC0248j.G.u(j)) {
                        break;
                    }
                    int i11 = a;
                    int i12 = i11 ^ 109;
                    int i13 = ((i11 & 109) | i12) << 1;
                    int i14 = -i12;
                    int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                    b = i15 % 128;
                    j = i15 % 2 == 0 ? abstractC0248j.G.d(j, i6) : abstractC0248j.G.d(j, 1);
                }
                long jC = c(hVar, j);
                int i16 = a + 77;
                b = i16 % 128;
                int i17 = i16 % 2;
                j2 = jC;
            }
            int i18 = b;
            int i19 = (i18 & (-86)) | ((~i18) & 85);
            int i20 = -(-((i18 & 85) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            a = i21 % 128;
            if (i21 % 2 == 0) {
                return j2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class bGI {
        private static int a = 1;
        private static int b;
        public final bGG c;
        public final String d;
        public final int e;

        public bGI(bGG bgg, String str, int i) {
            this.c = bgg;
            this.d = str;
            this.e = i;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            int i2 = a;
            int i3 = (i2 & 27) + (i2 | 27);
            b = i3 % 128;
            int i4 = i3 % 2;
            sb.append(" named ");
            sb.append(this.d);
            int i5 = b;
            int i6 = ((i5 | 67) << 1) - (i5 ^ 67);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                sb.append(" at ");
                sb.append(this.e);
                int i7 = 20 / 0;
            } else {
                sb.append(" at ");
                sb.append(this.e);
            }
            String string = sb.toString();
            int i8 = b;
            int i9 = i8 & 75;
            int i10 = ((i8 ^ 75) | i9) << 1;
            int i11 = -((i8 | 75) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return string;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0038 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0039  */
        /* JADX WARN: Code duplicated, block: B:16:0x0042  */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:25:0x007d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Code duplicated, block: B:30:0x0097  */
        /* JADX WARN: Code duplicated, block: B:31:0x0099  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
        public final boolean equals(Object obj) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            bGI bgi;
            String str;
            String str2;
            int i5;
            boolean zEquals;
            int i6 = 2 % 2;
            int i7 = a;
            int i8 = i7 ^ 27;
            int i9 = ((i7 & 27) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            int i12 = i11 % 128;
            b = i12;
            Object obj2 = null;
            boolean z2 = false;
            if (i11 % 2 != 0) {
                if (this != obj) {
                    z = false;
                    if (obj instanceof bGI) {
                        int i13 = i12 & 115;
                        i2 = (i13 - (~((i12 ^ 115) | i13))) - 1;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i14 = 73 / 0;
                        }
                        return false;
                    }
                    i3 = (i12 & 115) + (i12 | 115);
                    i4 = i3 % 128;
                    a = i4;
                    if (i3 % 2 != 0) {
                        int i15 = ((bGI) obj).e;
                        obj2.hashCode();
                        throw null;
                    }
                    bgi = (bGI) obj;
                    if (this.e == bgi.e) {
                        str = this.d;
                        str2 = bgi.d;
                        int i16 = ((i4 ^ 101) | (i4 & 101)) << 1;
                        int i17 = -(((~i4) & 101) | (i4 & (-102)));
                        i5 = ((i16 | i17) << 1) - (i17 ^ i16);
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            zEquals = str.equals(str2);
                            int i18 = 23 / 0;
                            if (zEquals) {
                                int i19 = a + 55;
                                b = i19 % 128;
                                int i20 = i19 % 2;
                                if (!this.c.equals(bgi.c)) {
                                    z2 = z;
                                }
                            }
                        } else if (str.equals(str2)) {
                            int i110 = a + 55;
                            b = i110 % 128;
                            int i21 = i110 % 2;
                            if (!this.c.equals(bgi.c)) {
                                z2 = z;
                            }
                        }
                        int i22 = a;
                        int i23 = (i22 ^ 21) + ((i22 & 21) << 1);
                        b = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        int i25 = a;
                        int i26 = (i25 ^ 21) + ((i25 & 21) << 1);
                        b = i26 % 128;
                        int i27 = i26 % 2;
                    }
                    int i28 = b;
                    int i29 = i28 ^ 1;
                    int i30 = (((i28 & 1) | i29) << 1) - i29;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    return z2;
                }
                int i32 = ((i7 ^ 72) + ((i7 & 72) << 1)) - 1;
                b = i32 % 128;
                int i33 = i32 % 2;
                i = i7 + 25;
                b = i % 128;
                if (i % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (this != obj) {
                z = true;
                if (obj instanceof bGI) {
                    int i111 = i12 & 115;
                    i2 = (i111 - (~((i12 ^ 115) | i111))) - 1;
                    a = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i112 = 73 / 0;
                    }
                    return false;
                }
                i3 = (i12 & 115) + (i12 | 115);
                i4 = i3 % 128;
                a = i4;
                if (i3 % 2 != 0) {
                    int i113 = ((bGI) obj).e;
                    obj2.hashCode();
                    throw null;
                }
                bgi = (bGI) obj;
                if (this.e == bgi.e) {
                    str = this.d;
                    str2 = bgi.d;
                    int i114 = ((i4 ^ 101) | (i4 & 101)) << 1;
                    int i115 = -(((~i4) & 101) | (i4 & (-102)));
                    i5 = ((i114 | i115) << 1) - (i115 ^ i114);
                    b = i5 % 128;
                    if (i5 % 2 != 0) {
                        zEquals = str.equals(str2);
                        int i116 = 23 / 0;
                        if (zEquals) {
                            int i117 = a + 55;
                            b = i117 % 128;
                            int i210 = i117 % 2;
                            if (!this.c.equals(bgi.c)) {
                                z2 = z;
                            }
                        }
                    } else if (str.equals(str2)) {
                        int i118 = a + 55;
                        b = i118 % 128;
                        int i211 = i118 % 2;
                        if (!this.c.equals(bgi.c)) {
                            z2 = z;
                        }
                    }
                    int i212 = a;
                    int i213 = (i212 ^ 21) + ((i212 & 21) << 1);
                    b = i213 % 128;
                    int i214 = i213 % 2;
                } else {
                    int i215 = a;
                    int i216 = (i215 ^ 21) + ((i215 & 21) << 1);
                    b = i216 % 128;
                    int i217 = i216 % 2;
                }
                int i218 = b;
                int i219 = i218 ^ 1;
                int i34 = (((i218 & 1) | i219) << 1) - i219;
                a = i34 % 128;
                int i35 = i34 % 2;
                return z2;
            }
            int i36 = ((i7 ^ 72) + ((i7 & 72) << 1)) - 1;
            b = i36 % 128;
            int i37 = i36 % 2;
            i = i7 + 25;
            b = i % 128;
            if (i % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public static bGI c(DataInput dataInput) throws IOException {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 ^ 75) | (i2 & 75)) << 1;
            int i4 = -(((~i2) & 75) | (i2 & (-76)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                dataInput.readUnsignedByte();
                dataInput.readUnsignedByte();
                obj.hashCode();
                throw null;
            }
            char unsignedByte = (char) dataInput.readUnsignedByte();
            int unsignedByte2 = dataInput.readUnsignedByte();
            int i6 = b;
            int i7 = i6 & 105;
            int i8 = (i6 ^ 105) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                dataInput.readByte();
                dataInput.readUnsignedByte();
                dataInput.readBoolean();
                obj.hashCode();
                throw null;
            }
            bGI bgi = new bGI(new bGG(unsignedByte, unsignedByte2, dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) c.c(dataInput)), dataInput.readUTF(), (int) c.c(dataInput));
            int i10 = a;
            int i11 = i10 & 49;
            int i12 = i10 | 49;
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 == 0) {
                return bgi;
            }
            throw null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final long d(long j, int i, int i2) {
            int i3;
            int i4 = 2 % 2;
            int i5 = (-2) - ((a + 52) ^ (-1));
            b = i5 % 128;
            int i6 = i5 % 2;
            bGG bgg = this.c;
            char c = bgg.c;
            if (c == 'w') {
                int i7 = a;
                int i8 = i7 + 105;
                b = i8 % 128;
                int i9 = i8 % 2;
                int i10 = -(-i2);
                int i11 = i & i10;
                i3 = ((((i ^ i10) | i11) << 1) - (~(-((i | i10) & (~i11))))) - 1;
                int i12 = i7 + 121;
                b = i12 % 128;
                int i13 = i12 % 2;
            } else if (c != 's') {
                int i14 = a + 10;
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                int i16 = i15 % 128;
                b = i16;
                int i17 = i15 % 2;
                int i18 = i16 & 85;
                int i19 = (i16 ^ 85) | i18;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                i3 = 0;
            } else {
                i3 = i;
            }
            long j2 = i3;
            long j3 = j + j2;
            N n = N.Q;
            int i22 = a;
            int i23 = i22 ^ 57;
            int i24 = ((((i22 & 57) | i23) << 1) - (~(-i23))) - 1;
            b = i24 % 128;
            int i25 = i24 % 2;
            P p = n.J;
            int i26 = bgg.d;
            int i27 = a + 80;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            b = i28 % 128;
            int i29 = i28 % 2;
            long jA = n.r.A(p.A(j3, i26), 0);
            int i30 = b;
            int i31 = (i30 & (-112)) | ((~i30) & 111);
            int i32 = -(-((i30 & 111) << 1));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            a = i33 % 128;
            int i34 = i33 % 2;
            P p2 = n.r;
            int i35 = bgg.g;
            int i36 = a;
            int i37 = (i36 | 93) << 1;
            int i38 = -(i36 ^ 93);
            int i39 = (i37 & i38) + (i38 | i37);
            b = i39 % 128;
            int i40 = i39 % 2;
            long jD = p2.d(jA, Math.min(i35, 86399999));
            int i41 = a;
            int i42 = i41 & 97;
            int i43 = ((((i41 ^ 97) | i42) << 1) - (~(-((i41 | 97) & (~i42))))) - 1;
            b = i43 % 128;
            int i44 = i43 % 2;
            long jD2 = bgg.d(n, jD);
            if (bgg.f == 0) {
                int i45 = a;
                int i46 = ((i45 ^ 51) - (~(-(-((i45 & 51) << 1))))) - 1;
                b = i46 % 128;
                if (i46 % 2 != 0) {
                    throw null;
                }
                if (jD2 <= j3) {
                    int i47 = i45 & 9;
                    int i48 = -(-((i45 ^ 9) | i47));
                    int i49 = (i47 & i48) + (i47 | i48);
                    b = i49 % 128;
                    int i50 = i49 % 2;
                    jD2 = bgg.d(n, n.G.d(jD2, 1));
                    int i51 = a;
                    int i52 = (i51 & (-98)) | ((~i51) & 97);
                    int i53 = (i51 & 97) << 1;
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    b = i54 % 128;
                    int i55 = i54 % 2;
                }
            } else {
                jD2 = bgg.f(n, jD2);
                int i56 = b;
                int i57 = i56 & 47;
                int i58 = ((i56 ^ 47) | i57) << 1;
                int i59 = -((i56 | 47) & (~i57));
                int i60 = (i58 & i59) + (i59 | i58);
                int i61 = i60 % 128;
                a = i61;
                int i62 = i60 % 2;
                if (jD2 <= j3) {
                    int i63 = i61 & 71;
                    int i64 = (((i61 | 71) & (~i63)) - (~(-(-(i63 << 1))))) - 1;
                    b = i64 % 128;
                    int i65 = i64 % 2;
                    long jD3 = n.G.d(jD2, 1);
                    P p3 = n.J;
                    int i66 = b;
                    int i67 = (-2) - (((i66 & 24) + (i66 | 24)) ^ (-1));
                    a = i67 % 128;
                    if (i67 % 2 == 0) {
                        bgg.d(n, p3.A(jD3, bgg.d));
                        throw null;
                    }
                    long jD4 = bgg.d(n, p3.A(jD3, bgg.d));
                    int i68 = a;
                    int i69 = i68 & 43;
                    int i70 = (i69 - (~(-(-((i68 ^ 43) | i69))))) - 1;
                    b = i70 % 128;
                    int i71 = i70 % 2;
                    jD2 = bgg.f(n, jD4);
                    int i72 = a;
                    int i73 = i72 & 53;
                    int i74 = i73 + ((i72 ^ 53) | i73);
                    b = i74 % 128;
                    int i75 = i74 % 2;
                }
            }
            long jA2 = n.r.A(jD2, 0);
            P p4 = n.r;
            int i76 = a + 103;
            b = i76 % 128;
            int i77 = i76 % 2;
            long jD5 = p4.d(jA2, bgg.g) - j2;
            int i78 = a;
            int i79 = (-2) - (((i78 & 118) + (i78 | 118)) ^ (-1));
            b = i79 % 128;
            int i80 = i79 % 2;
            return jD5;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final long e(long j, int i, int i2) {
            long jA;
            P p;
            int i3 = 2 % 2;
            int i4 = a + 21;
            b = i4 % 128;
            int i5 = i4 % 2;
            bGG bgg = this.c;
            char c = bgg.c;
            if (c == 'w') {
                int i6 = a + 43;
                b = i6 % 128;
                i = i6 % 2 != 0 ? i >> i2 : (i ^ i2) + ((i & i2) << 1);
            } else if (c != 's') {
                int i7 = b;
                int i8 = (-2) - ((i7 + 2) ^ (-1));
                a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 & 115;
                int i11 = -(-((i7 ^ 115) | i10));
                int i12 = (i10 & i11) + (i11 | i10);
                a = i12 % 128;
                int i13 = i12 % 2;
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            N n = N.Q;
            P p2 = n.J;
            int i14 = b;
            int i15 = i14 & 55;
            int i16 = (i14 | 55) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            if (i18 % 2 == 0) {
                jA = p2.A(j3, bgg.d);
                p = n.r;
                int i19 = 91 / 0;
            } else {
                jA = p2.A(j3, bgg.d);
                p = n.r;
            }
            long jD = n.r.d(p.A(jA, 0), bgg.g);
            int i20 = a;
            int i21 = (i20 & (-68)) | ((~i20) & 67);
            int i22 = -(-((i20 & 67) << 1));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            b = i23 % 128;
            int i24 = i23 % 2;
            long jE = bgg.e(n, jD);
            Object obj = null;
            if (bgg.f == 0) {
                int i25 = a + 81;
                int i26 = i25 % 128;
                b = i26;
                if (i25 % 2 != 0) {
                    throw null;
                }
                if (jE >= j3) {
                    int i27 = i26 + 75;
                    a = i27 % 128;
                    if (i27 % 2 == 0) {
                        n.G.d(jE, -1);
                        obj.hashCode();
                        throw null;
                    }
                    jE = bgg.e(n, n.G.d(jE, -1));
                    int i28 = a + 81;
                    b = i28 % 128;
                    int i29 = i28 % 2;
                }
            } else {
                jE = bgg.f(n, jE);
                int i30 = b;
                int i31 = ((i30 ^ 125) - (~(-(-((i30 & 125) << 1))))) - 1;
                a = i31 % 128;
                if (i31 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (jE >= j3) {
                    long jD2 = n.G.d(jE, -1);
                    int i32 = a;
                    int i33 = (i32 ^ 31) + ((i32 & 31) << 1);
                    b = i33 % 128;
                    if (i33 % 2 != 0) {
                        n.J.A(jD2, bgg.d);
                        obj.hashCode();
                        throw null;
                    }
                    long jA2 = n.J.A(jD2, bgg.d);
                    int i34 = b;
                    int i35 = i34 & 103;
                    int i36 = ((i34 ^ 103) | i35) << 1;
                    int i37 = -((i34 | 103) & (~i35));
                    int i38 = (i36 & i37) + (i37 | i36);
                    a = i38 % 128;
                    int i39 = i38 % 2;
                    long jE2 = bgg.e(n, jA2);
                    int i40 = a;
                    int i41 = i40 & 107;
                    int i42 = (i40 | 107) & (~i41);
                    int i43 = i41 << 1;
                    int i44 = (i42 & i43) + (i42 | i43);
                    b = i44 % 128;
                    int i45 = i44 % 2;
                    jE = bgg.f(n, jE2);
                    int i46 = b;
                    int i47 = (i46 & 65) + (i46 | 65);
                    a = i47 % 128;
                    int i48 = i47 % 2;
                }
            }
            long jA3 = n.r.A(jE, 0);
            P p3 = n.r;
            int i49 = a + 9;
            b = i49 % 128;
            return i49 % 2 != 0 ? p3.d(jA3, bgg.g) * j2 : p3.d(jA3, bgg.g) - j2;
        }
    }
}
