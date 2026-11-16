package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cS.AbstractC0253j;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0248j {
    private static int a = 1;
    private static int b;

    public static final class bGj extends AbstractC0253j {
        private static int a = 1;
        private static int b;
        public final ivas.gov.bisp.enumeration.cP.P d;
        public final AbstractC0242a e;
        public final ivas.gov.bisp.enumeration.cP.J f;
        public final ivas.gov.bisp.enumeration.cP.J g;
        public final boolean h;
        public final ivas.gov.bisp.enumeration.cP.J i;

        /* JADX WARN: Code duplicated, block: B:13:0x0040  */
        /* JADX WARN: Code duplicated, block: B:16:0x006c  */
        /* JADX WARN: Code duplicated, block: B:18:0x0070  */
        /* JADX WARN: Code duplicated, block: B:20:0x0085  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        public bGj(ivas.gov.bisp.enumeration.cP.P p, AbstractC0242a abstractC0242a, ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.J j2, ivas.gov.bisp.enumeration.cP.J j3) {
            int i;
            boolean z;
            int i2;
            super(p.v());
            if (!p.x()) {
                throw new IllegalArgumentException();
            }
            this.d = p;
            this.e = abstractC0242a;
            this.f = j;
            if (j != null) {
                int i3 = a;
                int i4 = i3 & 107;
                int i5 = ((i3 | 107) & (~i4)) + (i4 << 1);
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 79 / 0;
                    if (j.h() < 43200000) {
                        int i7 = b;
                        int i8 = i7 | 111;
                        int i9 = i8 << 1;
                        int i10 = -(i8 & (~(i7 & 111)));
                        int i11 = (i9 & i10) + (i10 | i9);
                        a = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = (i7 & (-80)) | ((~i7) & 79);
                        int i14 = -(-((i7 & 79) << 1));
                        i2 = ((i13 | i14) << 1) - (i14 ^ i13);
                        a = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i15 = 2 % 2;
                        }
                        z = true;
                    } else {
                        int i16 = b;
                        i = (((i16 ^ 1) | (i16 & 1)) << 1) - (((~i16) & 1) | (i16 & (-2)));
                        a = i % 128;
                        if (i % 2 == 0) {
                            int i17 = 3 / 3;
                        } else {
                            int i18 = 2 % 2;
                        }
                        z = false;
                    }
                } else if (j.h() < 43200000) {
                    int i19 = b;
                    int i20 = i19 | 111;
                    int i21 = i20 << 1;
                    int i110 = -(i20 & (~(i19 & 111)));
                    int i111 = (i21 & i110) + (i110 | i21);
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    int i113 = (i19 & (-80)) | ((~i19) & 79);
                    int i114 = -(-((i19 & 79) << 1));
                    i2 = ((i113 | i114) << 1) - (i114 ^ i113);
                    a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i115 = 2 % 2;
                    }
                    z = true;
                } else {
                    int i116 = b;
                    i = (((i116 ^ 1) | (i116 & 1)) << 1) - (((~i116) & 1) | (i116 & (-2)));
                    a = i % 128;
                    if (i % 2 == 0) {
                        int i117 = 3 / 3;
                    } else {
                        int i118 = 2 % 2;
                    }
                    z = false;
                }
            } else {
                int i119 = b;
                i = (((i119 ^ 1) | (i119 & 1)) << 1) - (((~i119) & 1) | (i119 & (-2)));
                a = i % 128;
                if (i % 2 == 0) {
                    int i1110 = 3 / 3;
                } else {
                    int i1111 = 2 % 2;
                }
                z = false;
            }
            this.h = z;
            this.g = j2;
            int i22 = b;
            int i23 = i22 & 93;
            int i24 = (i22 | 93) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i27 = i26 % 128;
            a = i27;
            int i28 = i26 % 2;
            this.i = j3;
            if (i28 == 0) {
                int i29 = 14 / 0;
            }
            int i30 = i27 & 11;
            int i31 = ((i27 | 11) & (~i30)) + (i30 << 1);
            b = i31 % 128;
            int i32 = i31 % 2;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long e(long j, long j2) {
            long jE;
            AbstractC0242a abstractC0242a;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.h) {
                int iF = F(j);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                int i4 = a;
                int i5 = ((i4 ^ 95) | (i4 & 95)) << 1;
                int i6 = -(((~i4) & 95) | (i4 & (-96)));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                long j3 = iF;
                long jE2 = p.e(j + j3, j2);
                int i9 = a;
                int i10 = (i9 & 125) + (i9 | 125);
                b = i10 % 128;
                int i11 = i10 % 2;
                return jE2 - j3;
            }
            long jK = this.e.k(j);
            ivas.gov.bisp.enumeration.cP.P p2 = this.d;
            int i12 = b;
            int i13 = (((i12 ^ 3) | (i12 & 3)) << 1) - (((~i12) & 3) | (i12 & (-4)));
            a = i13 % 128;
            if (i13 % 2 == 0) {
                jE = p2.e(jK, j2);
                abstractC0242a = this.e;
            } else {
                jE = p2.e(jK, j2);
                abstractC0242a = this.e;
            }
            long j4 = abstractC0242a.j(jE, false, j);
            int i14 = a + 13;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return j4;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final int f(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 | 93;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 93)) & i3);
            int i6 = (i4 & i5) + (i5 | i4);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                this.d.f(this.e.k(j));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iF = this.d.f(this.e.k(j));
            int i7 = a + 111;
            b = i7 % 128;
            int i8 = i7 % 2;
            return iF;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final String g(int i, Locale locale) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 | 57) << 1;
            int i5 = -(((~i3) & 57) | (i3 & (-58)));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            String strG = this.d.g(i, locale);
            int i8 = b;
            int i9 = (i8 & 77) + (i8 | 77);
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return strG;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 & (-8)) | ((~i4) & 7);
            int i6 = -(-((i4 & 7) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            int iHashCode = this.d.hashCode();
            int iHashCode2 = this.e.hashCode();
            int i9 = a;
            int i10 = i9 & 37;
            int i11 = i10 + ((i9 ^ 37) | i10);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                i = iHashCode ^ iHashCode2;
                i2 = iHashCode & iHashCode2;
            } else {
                i = (~iHashCode2) & iHashCode;
                i2 = (~iHashCode) & iHashCode2;
            }
            return (i & i2) | (i ^ i2);
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final String j(int i, Locale locale) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = (i3 | 103) << 1;
            int i5 = -(((~i3) & 103) | (i3 & (-104)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            String strJ = this.d.j(i, locale);
            if (i7 != 0) {
                int i8 = 46 / 0;
            }
            int i9 = a;
            int i10 = (-2) - (((i9 & 78) + (i9 | 78)) ^ (-1));
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return strJ;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final ivas.gov.bisp.enumeration.cP.J m() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 123) + (i2 | 123);
            a = i3 % 128;
            int i4 = i3 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.f;
            int i5 = ((i2 | 21) << 1) - (i2 ^ 21);
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
            return j;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long n(long j, long j2) {
            int iF;
            int i = 2 % 2;
            int i2 = a + 17;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                F(j2);
                throw null;
            }
            int iF2 = F(j2);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            if (this.h) {
                int i3 = b;
                int i4 = i3 ^ 125;
                int i5 = (i3 & 125) << 1;
                int i6 = (i4 & i5) + (i5 | i4);
                int i7 = i6 % 128;
                a = i7;
                int i8 = i6 % 2;
                int i9 = i7 & 83;
                int i10 = -(-(i7 | 83));
                int i11 = (i9 & i10) + (i10 | i9);
                b = i11 % 128;
                int i12 = i11 % 2;
                iF = iF2;
            } else {
                iF = F(j);
                int i13 = a + 29;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            long j3 = j + ((long) iF);
            long j4 = iF2;
            int i15 = a;
            int i16 = ((i15 ^ 126) + ((i15 & 126) << 1)) - 1;
            b = i16 % 128;
            long jN = p.n(j3, i16 % 2 != 0 ? j2 & j4 : j2 + j4);
            int i17 = b + 7;
            a = i17 % 128;
            int i18 = i17 % 2;
            return jN;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final ivas.gov.bisp.enumeration.cP.J o() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 125;
            int i4 = ((i2 | 125) & (~i3)) + (i3 << 1);
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.i;
            int i7 = ((i5 | 91) << 1) - (i5 ^ 91);
            a = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 70 / 0;
            }
            return j;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final int p(Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 98) + (i2 | 98)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int iP = this.d.p(locale);
            int i5 = a;
            int i6 = ((i5 ^ 49) | (i5 & 49)) << 1;
            int i7 = -(((~i5) & 49) | (i5 & (-50)));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return iP;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final int q() {
            int i = 2 % 2;
            int i2 = a + 61;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                this.d.q();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iQ = this.d.q();
            int i3 = b;
            int i4 = ((i3 ^ 29) | (i3 & 29)) << 1;
            int i5 = -(((~i3) & 29) | (i3 & (-30)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            a = i6 % 128;
            int i7 = i6 % 2;
            return iQ;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final int r() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 73;
            int i4 = (i2 | 73) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return this.d.r();
            }
            this.d.r();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final ivas.gov.bisp.enumeration.cP.J s() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 75;
            int i4 = (~i3) & (i2 | 75);
            int i5 = -(-(i3 << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.g;
            int i8 = ((i2 ^ 31) | (i2 & 31)) << 1;
            int i9 = -(((~i2) & 31) | (i2 & (-32)));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 88 / 0;
            }
            return j;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long t(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 118) << 1) - (i2 ^ 118)) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.d.t(this.e.k(j));
            }
            this.d.t(this.e.k(j));
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final boolean w() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 37;
            int i4 = ((i2 & 37) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            if (i7 == 0) {
                return p.w();
            }
            p.w();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if ((r6 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        
            r1 = r10.d.z(r1);
            r4 = 22 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        
            r1 = r10.d.z(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r11 = r10.e.j(r1, false, r11);
            r1 = ivas.gov.bisp.enumeration.cR.T.bGj.b;
            r2 = (r1 & (-106)) | ((~r1) & 105);
            r1 = (r1 & 105) << 1;
            r4 = (r2 ^ r1) + ((r1 & r2) << 1);
            ivas.gov.bisp.enumeration.cR.T.bGj.a = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        
            r2 = r1 & 29;
            r2 = r2 + ((r1 ^ 29) | r2);
            ivas.gov.bisp.enumeration.cR.T.bGj.b = r2 % 128;
            r2 = r2 % 2;
            r1 = F(r11);
            r2 = r10.d;
            r4 = ivas.gov.bisp.enumeration.cR.T.bGj.a;
            r5 = r4 & 109;
            r4 = (r4 ^ 109) | r5;
            r6 = (r5 ^ r4) + ((r4 & r5) << 1);
            ivas.gov.bisp.enumeration.cR.T.bGj.b = r6 % 128;
            r6 = r6 % 2;
            r4 = r1;
            r11 = r2.z(r11 + r4);
            r1 = ivas.gov.bisp.enumeration.cR.T.bGj.b;
            r2 = r1 ^ 35;
            r1 = (r1 & 35) << 1;
            r3 = (r2 & r1) + (r1 | r2);
            ivas.gov.bisp.enumeration.cR.T.bGj.a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
        
            if ((r3 % 2) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
        
            return r11 - r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        
            return r11 / r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r10.h != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            if (r10.h != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            r1 = r10.e.k(r11);
            r4 = ivas.gov.bisp.enumeration.cR.T.bGj.a;
            r5 = r4 & 97;
            r4 = (r4 ^ 97) | r5;
            r6 = ((r5 | r4) << 1) - (r4 ^ r5);
            ivas.gov.bisp.enumeration.cR.T.bGj.b = r6 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long z(long r11) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.cR.T.bGj.b
                r2 = r1 | 37
                r3 = 1
                int r2 = r2 << r3
                r1 = r1 ^ 37
                int r2 = r2 - r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.cR.T.bGj.a = r1
                int r2 = r2 % r0
                if (r2 != 0) goto L1c
                boolean r2 = r10.h
                r4 = 72
                int r4 = r4 / 0
                if (r2 == 0) goto L20
                goto L69
            L1c:
                boolean r2 = r10.h
                if (r2 == r3) goto L69
            L20:
                ivas.gov.bisp.enumeration.cP.a r1 = r10.e
                long r1 = r1.k(r11)
                int r4 = ivas.gov.bisp.enumeration.cR.T.bGj.a
                r5 = r4 & 97
                r4 = r4 ^ 97
                r4 = r4 | r5
                r6 = r5 | r4
                int r6 = r6 << r3
                r4 = r4 ^ r5
                int r6 = r6 - r4
                int r4 = r6 % 128
                ivas.gov.bisp.enumeration.cR.T.bGj.b = r4
                int r6 = r6 % r0
                if (r6 == 0) goto L44
                ivas.gov.bisp.enumeration.cP.P r4 = r10.d
                long r1 = r4.z(r1)
                r4 = 22
                int r4 = r4 / 0
                goto L4a
            L44:
                ivas.gov.bisp.enumeration.cP.P r4 = r10.d
                long r1 = r4.z(r1)
            L4a:
                r5 = r1
                ivas.gov.bisp.enumeration.cP.a r4 = r10.e
                r7 = 0
                r8 = r11
                long r11 = r4.j(r5, r7, r8)
                int r1 = ivas.gov.bisp.enumeration.cR.T.bGj.b
                r2 = r1 & (-106(0xffffffffffffff96, float:NaN))
                int r4 = ~r1
                r4 = r4 & 105(0x69, float:1.47E-43)
                r2 = r2 | r4
                r1 = r1 & 105(0x69, float:1.47E-43)
                int r1 = r1 << r3
                r4 = r2 ^ r1
                r1 = r1 & r2
                int r1 = r1 << r3
                int r4 = r4 + r1
                int r1 = r4 % 128
                ivas.gov.bisp.enumeration.cR.T.bGj.a = r1
                int r4 = r4 % r0
                return r11
            L69:
                r2 = r1 & 29
                r1 = r1 ^ 29
                r1 = r1 | r2
                int r2 = r2 + r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.cR.T.bGj.b = r1
                int r2 = r2 % r0
                int r1 = r10.F(r11)
                ivas.gov.bisp.enumeration.cP.P r2 = r10.d
                int r4 = ivas.gov.bisp.enumeration.cR.T.bGj.a
                r5 = r4 & 109(0x6d, float:1.53E-43)
                r4 = r4 ^ 109(0x6d, float:1.53E-43)
                r4 = r4 | r5
                r6 = r5 ^ r4
                r4 = r4 & r5
                int r4 = r4 << r3
                int r6 = r6 + r4
                int r4 = r6 % 128
                ivas.gov.bisp.enumeration.cR.T.bGj.b = r4
                int r6 = r6 % r0
                long r4 = (long) r1
                long r11 = r11 + r4
                long r11 = r2.z(r11)
                int r1 = ivas.gov.bisp.enumeration.cR.T.bGj.b
                r2 = r1 ^ 35
                r1 = r1 & 35
                int r1 = r1 << r3
                r3 = r2 & r1
                r1 = r1 | r2
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.cR.T.bGj.a = r1
                int r3 = r3 % r0
                if (r3 != 0) goto La5
                long r11 = r11 / r4
                goto La6
            La5:
                long r11 = r11 - r4
            La6:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.T.bGj.z(long):long");
        }

        public final int F(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 5;
            int i4 = (((i2 ^ 5) | i3) << 1) - ((i2 | 5) & (~i3));
            b = i4 % 128;
            int i5 = i4 % 2;
            int iN = this.e.n(j);
            long j2 = iN;
            int i6 = a;
            int i7 = ((i6 | 75) << 1) - (i6 ^ 75);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            if (((j + j2) ^ j) < 0) {
                int i10 = i8 + 45;
                a = i10 % 128;
                int i11 = i10 % 2;
                if ((j ^ j2) >= 0) {
                    throw new ArithmeticException("Adding time zone offset caused overflow");
                }
            }
            int i12 = a + 57;
            b = i12 % 128;
            int i13 = i12 % 2;
            return iN;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final String c(long j, Locale locale) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 63) + (i2 | 63);
            b = i3 % 128;
            int i4 = i3 % 2;
            long jK = this.e.k(j);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i5 = a;
            int i6 = (i5 & (-26)) | ((~i5) & 25);
            int i7 = (i5 & 25) << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            b = i8 % 128;
            int i9 = i8 % 2;
            String strC = p.c(jK, locale);
            int i10 = a + 119;
            b = i10 % 128;
            int i11 = i10 % 2;
            return strC;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final String h(long j, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 107;
            int i4 = ((i2 ^ 107) | i3) << 1;
            int i5 = -((i2 | 107) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                this.e.k(j);
                throw null;
            }
            String strH = this.d.h(this.e.k(j), locale);
            int i7 = a;
            int i8 = ((i7 & 76) + (i7 | 76)) - 1;
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 10 / 0;
            }
            return strH;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final int l(long j, long j2) {
            int iF;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 57) << 1;
            int i4 = -(((~i2) & 57) | (i2 & (-58)));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int iF2 = F(j2);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i7 = a;
            int i8 = i7 & 107;
            int i9 = ((i7 ^ 107) | i8) << 1;
            int i10 = -((i7 | 107) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            int i12 = i11 % 128;
            b = i12;
            if (i11 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!this.h)) {
                int i13 = (i12 & 29) + (i12 | 29);
                int i14 = i13 % 128;
                a = i14;
                int i15 = i13 % 2;
                int i16 = i14 & 103;
                int i17 = -(-((i14 ^ 103) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                b = i18 % 128;
                int i19 = i18 % 2;
                iF = iF2;
            } else {
                iF = F(j);
                int i20 = a;
                int i21 = (i20 ^ 5) + ((i20 & 5) << 1);
                b = i21 % 128;
                int i22 = i21 % 2;
            }
            int iL = p.l(j + ((long) iF), j2 + ((long) iF2));
            int i23 = a;
            int i24 = i23 & 109;
            int i25 = (((i23 | 109) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            b = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 50 / 0;
            }
            return iL;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final boolean u(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 85;
            int i4 = (i3 - (~((i2 ^ 85) | i3))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            long jK = this.e.k(j);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i6 = a;
            int i7 = i6 & 73;
            int i8 = (i6 ^ 73) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            b = i9 % 128;
            if (i9 % 2 == 0) {
                return p.u(jK);
            }
            int i10 = 42 / 0;
            return p.u(jK);
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long C(long j, String str, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 ^ 17) | (i2 & 17)) << 1) - (((~i2) & 17) | (i2 & (-18)));
            a = i3 % 128;
            int i4 = i3 % 2;
            long jK = this.e.k(j);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i5 = a;
            int i6 = (i5 & (-10)) | ((~i5) & 9);
            int i7 = -(-((i5 & 9) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                p.C(jK, str, locale);
                throw null;
            }
            long j2 = this.e.j(p.C(jK, str, locale), false, j);
            int i9 = b;
            int i10 = ((i9 | 97) << 1) - (i9 ^ 97);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 56 / 0;
            }
            return j2;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final long y(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 83) << 1;
            int i4 = -(i2 ^ 83);
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            if (this.h) {
                int i7 = i2 & 5;
                int i8 = (i2 | 5) & (~i7);
                int i9 = -(-(i7 << 1));
                int i10 = (i8 & i9) + (i8 | i9);
                b = i10 % 128;
                int i11 = i10 % 2;
                int iF = F(j);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                long j2 = iF;
                int i12 = a;
                int i13 = (i12 ^ 109) + ((i12 & 109) << 1);
                b = i13 % 128;
                return i13 % 2 != 0 ? p.y(j | j2) + j2 : p.y(j + j2) - j2;
            }
            long jK = this.e.k(j);
            ivas.gov.bisp.enumeration.cP.P p2 = this.d;
            int i14 = b + 125;
            a = i14 % 128;
            Object obj = null;
            if (i14 % 2 == 0) {
                p2.y(jK);
                throw null;
            }
            long jY = p2.y(jK);
            AbstractC0242a abstractC0242a = this.e;
            int i15 = a;
            int i16 = (i15 & (-118)) | ((~i15) & 117);
            int i17 = (i15 & 117) << 1;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            b = i18 % 128;
            int i19 = i18 % 2;
            long j3 = abstractC0242a.j(jY, false, j);
            int i20 = a + 11;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                return j3;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
        public final boolean equals(Object obj) {
            bGj bgj;
            ivas.gov.bisp.enumeration.cP.P p;
            ivas.gov.bisp.enumeration.cP.P p2;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 + 25;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            boolean z = true;
            if (this == obj) {
                int i6 = i2 & 39;
                int i7 = (((~i6) & (i2 | 39)) - (~(i6 << 1))) - 1;
                b = i7 % 128;
                boolean z2 = i7 % 2 == 0;
                int i8 = ((i2 ^ 121) | (i2 & 121)) << 1;
                int i9 = -(((~i2) & 121) | (i2 & (-122)));
                int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                b = i10 % 128;
                int i11 = i10 % 2;
                return z2;
            }
            if (!(obj instanceof bGj)) {
                int i12 = ((((i4 ^ 125) | (i4 & 125)) << 1) - (~(-((i4 & (-126)) | ((~i4) & 125))))) - 1;
                a = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            int i14 = i4 + 55;
            a = i14 % 128;
            if (i14 % 2 == 0) {
                bgj = (bGj) obj;
                p = this.d;
                p2 = bgj.d;
                int i15 = 86 / 0;
            } else {
                bgj = (bGj) obj;
                p = this.d;
                p2 = bgj.d;
            }
            if (p.equals(p2)) {
                int i16 = a;
                int i17 = (i16 ^ 73) + ((i16 & 73) << 1);
                b = i17 % 128;
                int i18 = i17 % 2;
                if (!(!this.e.equals(bgj.e))) {
                    int i19 = b;
                    int i20 = i19 ^ 125;
                    int i21 = ((((i19 & 125) | i20) << 1) - (~(-i20))) - 1;
                    a = i21 % 128;
                    if (i21 % 2 == 0) {
                        this.f.equals(bgj.f);
                        throw null;
                    }
                    if (this.f.equals(bgj.f)) {
                        int i22 = a;
                        int i23 = i22 & 93;
                        int i24 = ((i22 ^ 93) | i23) << 1;
                        int i25 = -((i22 | 93) & (~i23));
                        int i26 = (i24 & i25) + (i25 | i24);
                        int i27 = i26 % 128;
                        b = i27;
                        int i28 = i26 % 2;
                        ivas.gov.bisp.enumeration.cP.J j = this.g;
                        ivas.gov.bisp.enumeration.cP.J j2 = bgj.g;
                        int i29 = i27 & 71;
                        int i30 = (i29 - (~(-(-((i27 ^ 71) | i29))))) - 1;
                        a = i30 % 128;
                        int i31 = i30 % 2;
                        if (!j.equals(j2)) {
                            int i32 = a;
                            int i33 = i32 & 75;
                            int i34 = (i33 - (~((i32 ^ 75) | i33))) - 1;
                            b = i34 % 128;
                            int i35 = i34 % 2;
                            z = false;
                        }
                    } else {
                        int i36 = a;
                        int i37 = i36 & 75;
                        int i38 = (i37 - (~((i36 ^ 75) | i37))) - 1;
                        b = i38 % 128;
                        int i39 = i38 % 2;
                        z = false;
                    }
                } else {
                    int i310 = a;
                    int i311 = i310 & 75;
                    int i312 = (i311 - (~((i310 ^ 75) | i311))) - 1;
                    b = i312 % 128;
                    int i313 = i312 % 2;
                    z = false;
                }
            } else {
                int i314 = a;
                int i315 = i314 & 75;
                int i316 = (i315 - (~((i314 ^ 75) | i315))) - 1;
                b = i316 % 128;
                int i317 = i316 % 2;
                z = false;
            }
            int i40 = b;
            int i41 = i40 & 31;
            int i42 = i41 + ((i40 ^ 31) | i41);
            a = i42 % 128;
            if (i42 % 2 == 0) {
                int i43 = 41 / 0;
            }
            return z;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long d(long j, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((((i3 ^ 93) | (i3 & 93)) << 1) - (~(-(((~i3) & 93) | (i3 & (-94)))))) - 1;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!this.h) {
                long jK = this.e.k(j);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                int i5 = a;
                int i6 = i5 & 115;
                int i7 = ((((i5 ^ 115) | i6) << 1) - (~(-((i5 | 115) & (~i6))))) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    return this.e.j(p.d(jK, i), false, j);
                }
                return this.e.j(p.d(jK, i), false, j);
            }
            int iF = F(j);
            ivas.gov.bisp.enumeration.cP.P p2 = this.d;
            int i8 = b;
            int i9 = (i8 & 85) + (i8 | 85);
            int i10 = i9 % 128;
            a = i10;
            int i11 = i9 % 2;
            long j2 = iF;
            long j3 = j + j2;
            int i12 = i10 + 85;
            b = i12 % 128;
            long jD = i12 % 2 != 0 ? p2.d(j3, i) + j2 : p2.d(j3, i) - j2;
            int i13 = a;
            int i14 = i13 & 83;
            int i15 = ((((i13 ^ 83) | i14) << 1) - (~(-((i13 | 83) & (~i14))))) - 1;
            b = i15 % 128;
            int i16 = i15 % 2;
            return jD;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public final long A(long j, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((((i3 ^ 125) | (i3 & 125)) << 1) - (~(-(((~i3) & 125) | (i3 & (-126)))))) - 1;
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                this.e.k(j);
                obj.hashCode();
                throw null;
            }
            long jA = this.d.A(this.e.k(j), i);
            long j2 = this.e.j(jA, false, j);
            int i5 = b;
            int i6 = i5 & 97;
            int i7 = (i5 | 97) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            a = i9 % 128;
            if (i9 % 2 == 0) {
                f(j2);
                obj.hashCode();
                throw null;
            }
            if (f(j2) == i) {
                int i10 = a;
                int i11 = (i10 ^ 103) + ((i10 & 103) << 1);
                b = i11 % 128;
                int i12 = i11 % 2;
                return j2;
            }
            ivas.gov.bisp.enumeration.cP.N n = new ivas.gov.bisp.enumeration.cP.N(jA, this.e.g);
            ivas.gov.bisp.enumeration.cP.M m = new ivas.gov.bisp.enumeration.cP.M(this.d.v(), Integer.valueOf(i), n.getMessage());
            int i13 = b;
            int i14 = (i13 & 114) + (i13 | 114);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            a = i15 % 128;
            int i16 = i15 % 2;
            m.initCause(n);
            throw m;
        }
    }

    public static class bGk extends ivas.gov.bisp.enumeration.cS.c {
        private static int a = 0;
        private static int b = 1;
        public final ivas.gov.bisp.enumeration.cP.J d;
        public final boolean e;
        public final AbstractC0242a f;

        public bGk(ivas.gov.bisp.enumeration.cP.J j, AbstractC0242a abstractC0242a) {
            boolean z;
            super(j.g());
            if (!j.j()) {
                throw new IllegalArgumentException();
            }
            this.d = j;
            if (j.h() < 43200000) {
                int i = a;
                int i2 = (((i | 1) << 1) - (~(-((i & (-2)) | ((~i) & 1))))) - 1;
                b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = i & 115;
                int i5 = i | 115;
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                z = true;
            } else {
                int i8 = (-2) - ((b + 80) ^ (-1));
                a = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
                z = false;
            }
            this.e = z;
            this.f = abstractC0242a;
            int i11 = b + 34;
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long d(long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 89;
            int i4 = (i2 ^ 89) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                n(j);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iN = n(j);
            ivas.gov.bisp.enumeration.cP.J j3 = this.d;
            int i6 = a + 5;
            b = i6 % 128;
            int i7 = i6 % 2;
            long jD = j3.d(j + ((long) iN), j2);
            if (!this.e) {
                int i8 = b;
                int i9 = i8 & 51;
                int i10 = (i9 - (~(-(-((i8 ^ 51) | i9))))) - 1;
                a = i10 % 128;
                int i11 = i10 % 2;
                int iK = k(jD);
                if (i11 != 0) {
                    int i12 = 86 / 0;
                }
                iN = iK;
            }
            long j4 = jD - ((long) iN);
            int i13 = b;
            int i14 = i13 & 47;
            int i15 = (i13 | 47) & (~i14);
            int i16 = i14 << 1;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            return j4;
        }

        @Override // ivas.gov.bisp.enumeration.cS.c, ivas.gov.bisp.enumeration.cP.J
        public int e(long j, long j2) {
            int iN;
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iN2 = n(j2);
            ivas.gov.bisp.enumeration.cP.J j3 = this.d;
            if (this.e) {
                int i5 = b;
                int i6 = (i5 & 21) + (i5 | 21);
                a = i6 % 128;
                int i7 = i6 % 2;
                int i8 = (i5 & 79) + (i5 | 79);
                a = i8 % 128;
                int i9 = i8 % 2;
                iN = iN2;
            } else {
                iN = n(j);
                int i10 = a + 71;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 % 3;
                }
            }
            int iE = j3.e(j + ((long) iN), j2 + ((long) iN2));
            int i12 = a;
            int i13 = (i12 & 65) + (i12 | 65);
            b = i13 % 128;
            int i14 = i13 % 2;
            return iE;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0032  */
        /* JADX WARN: Code duplicated, block: B:15:0x003f  */
        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:19:0x0069  */
        /* JADX WARN: Code duplicated, block: B:21:0x0081  */
        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x008e  */
        /* JADX WARN: Code duplicated, block: B:27:0x009a  */
        public boolean equals(Object obj) {
            boolean z;
            bGk bgk;
            ivas.gov.bisp.enumeration.cP.J j;
            ivas.gov.bisp.enumeration.cP.J j2;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
            int i6 = i5 % 128;
            a = i6;
            boolean z2 = false;
            if (i5 % 2 != 0) {
                if (this != obj) {
                    z = false;
                    if (!(obj instanceof bGk)) {
                        i2 = ((i6 | 101) << 1) - (i6 ^ 101);
                        b = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i7 = 50 / 0;
                        }
                        return false;
                    }
                    int i8 = i4 + 110;
                    int i9 = (i8 ^ (-1)) + (i8 << 1);
                    int i10 = i9 % 128;
                    a = i10;
                    int i11 = i9 % 2;
                    bgk = (bGk) obj;
                    j = this.d;
                    j2 = bgk.d;
                    int i12 = i10 & 43;
                    int i13 = (i10 ^ 43) | i12;
                    int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    if (j.equals(j2)) {
                        int i16 = a;
                        int i17 = (i16 & (-32)) | ((~i16) & 31);
                        int i18 = -(-((i16 & 31) << 1));
                        i = (i17 & i18) + (i18 | i17);
                        b = i % 128;
                        if (i % 2 != 0) {
                            this.f.equals(bgk.f);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (this.f.equals(bgk.f)) {
                            z2 = z;
                        } else {
                            int i19 = b + 49;
                            a = i19 % 128;
                            int i20 = i19 % 2;
                        }
                    } else {
                        int i110 = b + 49;
                        a = i110 % 128;
                        int i21 = i110 % 2;
                    }
                    int i22 = b;
                    int i23 = (((i22 ^ 37) | (i22 & 37)) << 1) - (((~i22) & 37) | (i22 & (-38)));
                    a = i23 % 128;
                    int i24 = i23 % 2;
                    return z2;
                }
                int i25 = i4 & 101;
                int i26 = (i4 | 101) & (~i25);
                int i27 = i25 << 1;
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                a = i28 % 128;
                int i29 = i28 % 2;
                return true;
            }
            if (this != obj) {
                z = true;
                if (!(obj instanceof bGk)) {
                    i2 = ((i6 | 101) << 1) - (i6 ^ 101);
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i30 = 50 / 0;
                    }
                    return false;
                }
                int i31 = i4 + 110;
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                int i111 = i32 % 128;
                a = i111;
                int i112 = i32 % 2;
                bgk = (bGk) obj;
                j = this.d;
                j2 = bgk.d;
                int i113 = i111 & 43;
                int i114 = (i111 ^ 43) | i113;
                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                b = i115 % 128;
                int i116 = i115 % 2;
                if (j.equals(j2)) {
                    int i117 = a;
                    int i118 = (i117 & (-32)) | ((~i117) & 31);
                    int i119 = -(-((i117 & 31) << 1));
                    i = (i118 & i119) + (i119 | i118);
                    b = i % 128;
                    if (i % 2 != 0) {
                        this.f.equals(bgk.f);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (this.f.equals(bgk.f)) {
                        int i1110 = b + 49;
                        a = i1110 % 128;
                        int i210 = i1110 % 2;
                    } else {
                        z2 = z;
                    }
                } else {
                    int i1111 = b + 49;
                    a = i1111 % 128;
                    int i211 = i1111 % 2;
                }
                int i212 = b;
                int i213 = (((i212 ^ 37) | (i212 & 37)) << 1) - (((~i212) & 37) | (i212 & (-38)));
                a = i213 % 128;
                int i214 = i213 % 2;
                return z2;
            }
            int i215 = i4 & 101;
            int i216 = (i4 | 101) & (~i215);
            int i217 = i215 << 1;
            int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
            a = i218 % 128;
            int i219 = i218 % 2;
            return true;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long h() {
            long jH;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 119) | (i2 & 119)) << 1;
            int i4 = -(((~i2) & 119) | (i2 & (-120)));
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                jH = this.d.h();
                int i6 = 1 / 0;
            } else {
                jH = this.d.h();
            }
            int i7 = b;
            int i8 = (-2) - (((i7 & 34) + (i7 | 34)) ^ (-1));
            a = i8 % 128;
            if (i8 % 2 == 0) {
                return jH;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 13) | (i2 & 13)) << 1;
            int i4 = -(((~i2) & 13) | (i2 & (-14)));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            a = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode = this.d.hashCode();
            int iHashCode2 = this.f.hashCode();
            int i7 = iHashCode & iHashCode2;
            int i8 = ((iHashCode ^ iHashCode2) | i7) & (~i7);
            int i9 = b;
            int i10 = i9 & 125;
            int i11 = i10 + ((i9 ^ 125) | i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            return i8;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x005b  */
        /* JADX WARN: Code duplicated, block: B:15:0x007b  */
        @Override // ivas.gov.bisp.enumeration.cP.J
        public boolean i() {
            boolean zI;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 29) + (i2 | 29);
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            if (this.e) {
                int i6 = (-2) - ((i4 + 122) ^ (-1));
                a = i6 % 128;
                int i7 = i6 % 2;
                zI = this.d.i();
                int i8 = b + 95;
                a = i8 % 128;
                int i9 = i8 % 2;
            } else if (this.d.i()) {
                int i10 = a;
                int i11 = i10 ^ 27;
                int i12 = ((i10 & 27) | i11) << 1;
                int i13 = -i11;
                int i14 = (i12 & i13) + (i12 | i13);
                b = i14 % 128;
                int i15 = i14 % 2;
                boolean zQ = this.f.q();
                if (i15 == 0) {
                    int i16 = 4 / 0;
                    if (zQ) {
                        int i17 = b;
                        int i18 = (i17 & (-30)) | (29 & (~i17));
                        int i19 = (i17 & 29) << 1;
                        int i20 = (i18 & i19) + (i18 | i19);
                        a = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = (i17 ^ 63) + ((i17 & 63) << 1);
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        zI = true;
                    } else {
                        int i24 = b;
                        int i25 = i24 & 29;
                        int i26 = (i24 | 29) & (~i25);
                        int i27 = -(-(i25 << 1));
                        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                        a = i28 % 128;
                        int i29 = i28 % 2;
                        zI = false;
                    }
                } else if (!zQ) {
                    int i210 = b;
                    int i211 = i210 & 29;
                    int i212 = (i210 | 29) & (~i211);
                    int i213 = -(-(i211 << 1));
                    int i214 = ((i212 | i213) << 1) - (i212 ^ i213);
                    a = i214 % 128;
                    int i215 = i214 % 2;
                    zI = false;
                } else {
                    int i110 = b;
                    int i111 = (i110 & (-30)) | (29 & (~i110));
                    int i112 = (i110 & 29) << 1;
                    int i216 = (i111 & i112) + (i111 | i112);
                    a = i216 % 128;
                    int i217 = i216 % 2;
                    int i218 = (i110 ^ 63) + ((i110 & 63) << 1);
                    a = i218 % 128;
                    int i219 = i218 % 2;
                    zI = true;
                }
            } else {
                int i2110 = b;
                int i2111 = i2110 & 29;
                int i2112 = (i2110 | 29) & (~i2111);
                int i2113 = -(-(i2111 << 1));
                int i2114 = ((i2112 | i2113) << 1) - (i2112 ^ i2113);
                a = i2114 % 128;
                int i2115 = i2114 % 2;
                zI = false;
            }
            int i30 = (-2) - ((a + 62) ^ (-1));
            b = i30 % 128;
            int i31 = i30 % 2;
            return zI;
        }

        public final int n(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 | 121) << 1) - (i2 ^ 121);
            a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.f.n(j);
                throw null;
            }
            int iN = this.f.n(j);
            long j2 = iN;
            int i4 = a + 15;
            int i5 = i4 % 128;
            b = i5;
            if (i4 % 2 != 0 ? ((j + j2) ^ j) < 0 : (j ^ j2) % j < 0) {
                if ((j ^ j2) >= 0) {
                    throw new ArithmeticException("Adding time zone offset caused overflow");
                }
            }
            int i6 = ((i5 ^ 87) - (~((i5 & 87) << 1))) - 1;
            a = i6 % 128;
            if (i6 % 2 == 0) {
                return iN;
            }
            obj.hashCode();
            throw null;
        }

        public final int k(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 103;
            int i4 = (((i2 | 103) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
            b = i4 % 128;
            int i5 = i4 % 2;
            int iO = this.f.o(j);
            long j2 = iO;
            int i6 = a;
            int i7 = i6 + 95;
            b = i7 % 128;
            if (i7 % 2 != 0 ? ((j - j2) ^ j) < 0 : (j & j2) * j < 1) {
                if ((j ^ j2) < 0) {
                    throw new ArithmeticException("Subtracting time zone offset caused overflow");
                }
            }
            int i8 = i6 & 75;
            int i9 = (~i8) & (i6 | 75);
            int i10 = i8 << 1;
            int i11 = (i9 & i10) + (i10 | i9);
            b = i11 % 128;
            int i12 = i11 % 2;
            return iO;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long c(long j, int i) {
            int i2 = 2 % 2;
            int i3 = a + 3;
            b = i3 % 128;
            int i4 = i3 % 2;
            int iN = n(j);
            ivas.gov.bisp.enumeration.cP.J j2 = this.d;
            int i5 = a;
            int i6 = (i5 & 119) + (i5 | 119);
            b = i6 % 128;
            long jC = i6 % 2 == 0 ? j2.c(j | ((long) iN), i) : j2.c(j + ((long) iN), i);
            int i7 = a;
            int i8 = i7 + 107;
            b = i8 % 128;
            int i9 = i8 % 2;
            if (!this.e) {
                iN = k(jC);
                int i10 = b;
                int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = i7 + 79;
                int i14 = i13 % 128;
                b = i14;
                if (i13 % 2 == 0) {
                    int i15 = 67 / 0;
                }
                int i16 = (i14 ^ 81) + ((i14 & 81) << 1);
                a = i16 % 128;
                int i17 = i16 % 2;
            }
            long j3 = jC - ((long) iN);
            int i18 = b;
            int i19 = (i18 & 100) + (i18 | 100);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            return j3;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long f(long j, long j2) {
            int iN;
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 121) + (i2 | 121);
            b = i3 % 128;
            int i4 = i3 % 2;
            int iN2 = n(j2);
            ivas.gov.bisp.enumeration.cP.J j3 = this.d;
            int i5 = a;
            int i6 = ((i5 ^ 79) | (i5 & 79)) << 1;
            int i7 = -((i5 & (-80)) | ((~i5) & 79));
            int i8 = (i6 & i7) + (i6 | i7);
            b = i8 % 128;
            int i9 = i8 % 2;
            if (!this.e) {
                iN = n(j);
                int i10 = a;
                int i11 = ((i10 ^ 3) | (i10 & 3)) << 1;
                int i12 = -(((~i10) & 3) | (i10 & (-4)));
                int i13 = (i11 & i12) + (i12 | i11);
                b = i13 % 128;
                int i14 = i13 % 2;
            } else {
                int i15 = i5 + 111;
                int i16 = i15 % 128;
                b = i16;
                if (i15 % 2 == 0) {
                    throw null;
                }
                int i17 = i16 ^ 43;
                int i18 = ((i16 & 43) | i17) << 1;
                int i19 = -i17;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                a = i20 % 128;
                int i21 = i20 % 2;
                iN = iN2;
            }
            long j4 = j + ((long) iN);
            long j5 = iN2;
            int i22 = b + 83;
            a = i22 % 128;
            int i23 = i22 % 2;
            long jF = j3.f(j4, j2 + j5);
            int i24 = b;
            int i25 = (((i24 & (-4)) | ((~i24) & 3)) - (~((i24 & 3) << 1))) - 1;
            a = i25 % 128;
            int i26 = i25 % 2;
            return jF;
        }
    }

    public T(ivas.gov.bisp.enumeration.p096p.h hVar, AbstractC0242a abstractC0242a) {
        super(hVar, abstractC0242a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cR.T.a;
        r2 = (((r1 & (-84)) | ((~r1) & 83)) - (~(-(-((r1 & 83) << 1))))) - 1;
        ivas.gov.bisp.enumeration.cR.T.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1 = new ivas.gov.bisp.enumeration.cR.T(r5, r6);
        r5 = ivas.gov.bisp.enumeration.cR.T.a;
        r6 = ((r5 | 85) << 1) - (r5 ^ 85);
        ivas.gov.bisp.enumeration.cR.T.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("DateTimeZone must not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        throw new java.lang.IllegalArgumentException("UTC chronology must not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        throw new java.lang.IllegalArgumentException("Must supply a chronology");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r5 = r5.ba();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r5 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.cR.T by(ivas.gov.bisp.enumeration.p096p.h r5, ivas.gov.bisp.enumeration.cP.AbstractC0242a r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.T.a
            r2 = r1 ^ 99
            r1 = r1 & 99
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            r3 = r1 ^ r2
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cR.T.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L21
            r1 = 71
            int r1 = r1 / 0
            if (r5 == 0) goto L6d
            goto L23
        L21:
            if (r5 == 0) goto L6d
        L23:
            ivas.gov.bisp.enumeration.p.h r5 = r5.ba()
            if (r5 == 0) goto L65
            int r1 = ivas.gov.bisp.enumeration.cR.T.a
            r2 = r1 & (-84)
            int r3 = ~r1
            r4 = 83
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            int r1 = r1 << 1
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cR.T.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L60
            if (r6 == 0) goto L58
            ivas.gov.bisp.enumeration.cR.T r1 = new ivas.gov.bisp.enumeration.cR.T
            r1.<init>(r5, r6)
            int r5 = ivas.gov.bisp.enumeration.cR.T.a
            r6 = r5 | 85
            int r6 = r6 << 1
            r5 = r5 ^ 85
            int r6 = r6 - r5
            int r5 = r6 % 128
            ivas.gov.bisp.enumeration.cR.T.b = r5
            int r6 = r6 % r0
            return r1
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "DateTimeZone must not be null"
            r5.<init>(r6)
            throw r5
        L60:
            r5 = 0
            r5.hashCode()
            throw r5
        L65:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "UTC chronology must not be null"
            r5.<init>(r6)
            throw r5
        L6d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Must supply a chronology"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.T.by(ivas.gov.bisp.enumeration.p.h, ivas.gov.bisp.enumeration.cP.a):ivas.gov.bisp.enumeration.cR.T");
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((((i2 ^ 27) | (i2 & 27)) << 1) - (~(-(((~i2) & 27) | (i2 & (-28)))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        int i5 = b + 37;
        a = i5 % 128;
        int i6 = i5 % 2;
        return hVar;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final long ae(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ivas.gov.bisp.enumeration.p096p.h hVar;
        long jBH;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = ((i9 | 67) << 1) - (i9 ^ 67);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            hVar = this.e;
            int i11 = 63 / 0;
        } else {
            hVar = this.e;
        }
        long jAe = hVar.ae(i, i2, i3, i4, i5, i6, i7);
        int i12 = b;
        int i13 = i12 ^ 83;
        int i14 = ((i12 & 83) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        a = i16 % 128;
        if (i16 % 2 == 0) {
            jBH = bH(jAe);
            int i17 = 25 / 0;
        } else {
            jBH = bH(jAe);
        }
        int i18 = b;
        int i19 = i18 & 77;
        int i20 = (i18 ^ 77) | i19;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        a = i21 % 128;
        int i22 = i21 % 2;
        return jBH;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.p096p.h
    public final AbstractC0242a ap() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (i2 ^ 103) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        AbstractC0242a abstractC0242a = (AbstractC0242a) this.f;
        int i6 = b;
        int i7 = (i6 & 99) + (i6 | 99);
        a = i7 % 128;
        int i8 = i7 % 2;
        return abstractC0242a;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final long aa(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = (-2) - (((i6 & 112) + (i6 | 112)) ^ (-1));
        b = i7 % 128;
        if (i7 % 2 != 0) {
            this.e.aa(i, i2, i3, i4);
            throw null;
        }
        long jBH = bH(this.e.aa(i, i2, i3, i4));
        int i8 = a;
        int i9 = i8 & 51;
        int i10 = ((i8 ^ 51) | i9) << 1;
        int i11 = -((i8 | 51) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        b = i12 % 128;
        if (i12 % 2 == 0) {
            return jBH;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r0 = ((r4 & 108) + (r4 | 108)) - 1;
        r1 = r0 % 128;
        ivas.gov.bisp.enumeration.cR.T.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if ((r0 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r0 = (r1 ^ 19) + ((r1 & 19) << 1);
        ivas.gov.bisp.enumeration.cR.T.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if ((r0 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r4 = (ivas.gov.bisp.enumeration.cP.AbstractC0242a) r17.f;
        r10 = r4.o(r18);
        r11 = ivas.gov.bisp.enumeration.cR.T.b;
        r13 = r11 & 89;
        r12 = ((r11 ^ 89) | r13) << 1;
        r13 = -((~r13) & (r11 | 89));
        r14 = (r12 ^ r13) + ((r12 & r13) << 1);
        ivas.gov.bisp.enumeration.cR.T.a = r14 % 128;
        r14 = r14 % 2;
        r12 = r18 - ((long) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r18 <= 604800000) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        r14 = r11 + 113;
        ivas.gov.bisp.enumeration.cR.T.a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if ((r14 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r12 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r12 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r0 = r11 & 55;
        r1 = (r11 ^ 55) | r0;
        r4 = ((r0 | r1) << 1) - (r0 ^ r1);
        ivas.gov.bisp.enumeration.cR.T.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        return Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r18 >= (-604800000)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        r5 = ivas.gov.bisp.enumeration.cR.T.a;
        r6 = ((r5 | 61) << 1) - (r5 ^ 61);
        ivas.gov.bisp.enumeration.cR.T.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r12 <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        r0 = ((((r5 ^ 115) | (r5 & 115)) << 1) - (~(-((r5 & (-116)) | ((~r5) & 115))))) - 1;
        ivas.gov.bisp.enumeration.cR.T.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if ((r0 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        r0 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        return Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (r10 != r4.n(r12)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        r0 = (-2) - ((ivas.gov.bisp.enumeration.cR.T.b + 8) ^ (-1));
        r1 = r0 % 128;
        ivas.gov.bisp.enumeration.cR.T.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        if ((r0 % 2) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r0 = ((r1 | 97) << 1) - (r1 ^ 97);
        ivas.gov.bisp.enumeration.cR.T.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        throw new ivas.gov.bisp.enumeration.cP.N(r18, r4.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r18 == Long.MAX_VALUE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r18 == Long.MAX_VALUE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r0 = ((r4 & 10) + (r4 | 10)) - 1;
        ivas.gov.bisp.enumeration.cR.T.a = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long bH(long r18) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.T.bH(long):long");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 87;
        int i4 = (i3 - (~(-(-((i2 ^ 87) | i3))))) - 1;
        int i5 = i4 % 128;
        a = i5;
        if (i4 % 2 != 0 ? this == obj : this == obj) {
            int i6 = i5 ^ 9;
            int i7 = (((i5 & 9) | i6) << 1) - i6;
            b = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        boolean z = false;
        if (!(obj instanceof T)) {
            int i9 = i2 | 95;
            int i10 = ((i9 << 1) - (~(-(i9 & (~(i2 & 95)))))) - 1;
            int i11 = i10 % 128;
            a = i11;
            int i12 = i10 % 2;
            int i13 = ((i11 & (-6)) | ((~i11) & 5)) + ((i11 & 5) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        T t = (T) obj;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        ivas.gov.bisp.enumeration.p096p.h hVar2 = t.e;
        int i15 = a;
        int i16 = ((((i15 ^ 117) | (i15 & 117)) << 1) - (~(-(((~i15) & 117) | (i15 & (-118)))))) - 1;
        b = i16 % 128;
        if (i16 % 2 != 0) {
            hVar.equals(hVar2);
            throw null;
        }
        if (hVar.equals(hVar2)) {
            int i17 = a;
            int i18 = i17 & 81;
            int i19 = ((i17 | 81) & (~i18)) + (i18 << 1);
            b = i19 % 128;
            int i20 = i19 % 2;
            AbstractC0242a abstractC0242a = (AbstractC0242a) this.f;
            AbstractC0242a abstractC0242a2 = (AbstractC0242a) t.f;
            int i21 = a;
            int i22 = ((i21 ^ 13) - (~(-(-((i21 & 13) << 1))))) - 1;
            b = i22 % 128;
            if (i22 % 2 != 0) {
                boolean zEquals = abstractC0242a.equals(abstractC0242a2);
                int i23 = 4 / 0;
                if (!zEquals) {
                    int i24 = a;
                    int i25 = i24 & 29;
                    int i26 = ((i24 ^ 29) | i25) << 1;
                    int i27 = -((i24 | 29) & (~i25));
                    int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                    b = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    z = true;
                }
            } else if (!abstractC0242a.equals(abstractC0242a2)) {
                int i210 = a;
                int i211 = i210 & 29;
                int i212 = ((i210 ^ 29) | i211) << 1;
                int i213 = -((i210 | 29) & (~i211));
                int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                b = i214 % 128;
                int i215 = i214 % 2;
            } else {
                z = true;
            }
        } else {
            int i216 = a;
            int i217 = i216 & 29;
            int i218 = ((i216 ^ 29) | i217) << 1;
            int i219 = -((i216 | 29) & (~i217));
            int i2110 = (i218 ^ i219) + ((i219 & i218) << 1);
            b = i2110 % 128;
            int i2111 = i2110 % 2;
        }
        int i30 = b;
        int i31 = (i30 | 71) << 1;
        int i32 = -(((~i30) & 71) | (i30 & (-72)));
        int i33 = (i31 & i32) + (i32 | i31);
        a = i33 % 128;
        int i34 = i33 % 2;
        return z;
    }

    public final String toString() {
        char c;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 119;
        int i4 = i3 + ((i2 ^ 119) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("ZonedChronology[");
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        int i6 = b;
        int i7 = i6 & 55;
        int i8 = ((i6 | 55) & (~i7)) + (i7 << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        sbW.append(hVar);
        sbW.append(", ");
        if (i9 == 0) {
            int i10 = 67 / 0;
        }
        String str = ((AbstractC0242a) this.f).g;
        int i11 = (-2) - ((a + 76) ^ (-1));
        b = i11 % 128;
        if (i11 % 2 != 0) {
            sbW.append(str);
            c = 19;
        } else {
            sbW.append(str);
            c = ']';
        }
        sbW.append(c);
        String string = sbW.toString();
        int i12 = (-2) - ((a + 54) ^ (-1));
        b = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 & (-4)) | ((~i2) & 3)) - (~(-(-((i2 & 3) << 1))))) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (abstractC0242a == null) {
            int i5 = i2 & 97;
            int i6 = (i2 | 97) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                AbstractC0242a.f();
                throw null;
            }
            abstractC0242a = AbstractC0242a.f();
        }
        if (abstractC0242a == this.f) {
            int i9 = a;
            int i10 = (i9 & (-74)) | ((~i9) & 73);
            int i11 = -(-((i9 & 73) << 1));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            int i13 = i12 % 128;
            b = i13;
            if (i12 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i14 = (i13 & 101) + (i13 | 101);
            a = i14 % 128;
            int i15 = i14 % 2;
            return this;
        }
        if (abstractC0242a == AbstractC0242a.c) {
            int i16 = b;
            int i17 = (i16 & 14) + (i16 | 14);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            a = i18 % 128;
            if (i18 % 2 != 0) {
                return this.e;
            }
            int i19 = 83 / 0;
            return this.e;
        }
        T t = new T(this.e, abstractC0242a);
        int i20 = b;
        int i21 = (i20 & 25) + (i20 | 25);
        a = i21 % 128;
        if (i21 % 2 != 0) {
            return t;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        ivas.gov.bisp.enumeration.p096p.h hVar;
        int iHashCode2;
        int i;
        int i2 = 2 % 2;
        int i3 = a + 30;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 != 0) {
            iHashCode = ((AbstractC0242a) this.f).hashCode();
            hVar = this.e;
            int i5 = 13 / 0;
        } else {
            iHashCode = ((AbstractC0242a) this.f).hashCode();
            hVar = this.e;
        }
        int i6 = b;
        int i7 = i6 & 49;
        int i8 = (i6 ^ 49) | i7;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        a = i9 % 128;
        if (i9 % 2 == 0) {
            iHashCode2 = hVar.hashCode() / 125;
            int i10 = iHashCode & 20;
            int i11 = i10 + ((iHashCode ^ 20) | i10);
            int i12 = i11 & 326565;
            int i13 = (326565 ^ i11) | i12;
            i = ((i12 | i13) << 1) - (i12 ^ i13);
        } else {
            iHashCode2 = hVar.hashCode() * 7;
            int i14 = iHashCode * 11;
            int i15 = i14 & 326565;
            int i16 = -(-((i14 ^ 326565) | i15));
            i = (i15 & i16) + (i16 | i15);
        }
        int i17 = a;
        int i18 = i17 + 71;
        b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = iHashCode2 & i;
        int i21 = ((iHashCode2 ^ i) | i20) << 1;
        int i22 = -((iHashCode2 | i) & (~i20));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        int i24 = (i17 ^ 33) + ((i17 & 33) << 1);
        b = i24 % 128;
        int i25 = i24 % 2;
        return i23;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        int i = 2 % 2;
        HashMap<Object, Object> map = new HashMap<>();
        bfa.n = bF(bfa.n, map);
        bfa.m = bF(bfa.m, map);
        bfa.l = bF(bfa.l, map);
        bfa.c = bF(bfa.c, map);
        int i2 = a;
        int i3 = ((i2 ^ 58) + ((i2 & 58) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        bfa.k = bF(bfa.k, map);
        bfa.j = bF(bfa.j, map);
        bfa.h = bF(bfa.h, map);
        bfa.i = bF(bfa.i, map);
        ivas.gov.bisp.enumeration.cP.J j = bfa.g;
        int i5 = b;
        int i6 = (i5 | 63) << 1;
        int i7 = -(i5 ^ 63);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        a = i8 % 128;
        int i9 = i8 % 2;
        bfa.g = bF(j, map);
        bfa.f = bF(bfa.f, map);
        bfa.e = bF(bfa.e, map);
        bfa.d = bF(bfa.d, map);
        bfa.G = bI(bfa.G, map);
        int i10 = a + 63;
        b = i10 % 128;
        int i11 = i10 % 2;
        bfa.I = bI(bfa.I, map);
        bfa.J = bI(bfa.J, map);
        bfa.K = bI(bfa.K, map);
        bfa.H = bI(bfa.H, map);
        ivas.gov.bisp.enumeration.cP.P p = bfa.v;
        int i12 = a + 99;
        b = i12 % 128;
        int i13 = i12 % 2;
        bfa.v = bI(p, map);
        bfa.B = bI(bfa.B, map);
        bfa.A = bI(bfa.A, map);
        bfa.F = bI(bfa.F, map);
        bfa.C = bI(bfa.C, map);
        int i14 = b;
        int i15 = (i14 & 123) + (i14 | 123);
        a = i15 % 128;
        int i16 = i15 % 2;
        bfa.E = bI(bfa.E, map);
        bfa.D = bI(bfa.D, map);
        bfa.p = bI(bfa.p, map);
        bfa.f83o = bI(bfa.f83o, map);
        ivas.gov.bisp.enumeration.cP.P p2 = bfa.q;
        int i17 = a;
        int i18 = (i17 & 1) + (i17 | 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        bfa.q = bI(p2, map);
        bfa.r = bI(bfa.r, map);
        bfa.t = bI(bfa.t, map);
        bfa.s = bI(bfa.s, map);
        bfa.u = bI(bfa.u, map);
        int i20 = a;
        int i21 = ((i20 | 69) << 1) - (i20 ^ 69);
        b = i21 % 128;
        int i22 = i21 % 2;
        bfa.w = bI(bfa.w, map);
        bfa.x = bI(bfa.x, map);
        bfa.y = bI(bfa.y, map);
        bfa.z = bI(bfa.z, map);
        int i23 = a + 81;
        b = i23 % 128;
        int i24 = i23 % 2;
    }

    public final ivas.gov.bisp.enumeration.cP.J bF(ivas.gov.bisp.enumeration.cP.J j, HashMap<Object, Object> map) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 5;
        int i4 = -(-((i2 ^ 5) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        a = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (j != null) {
            int i7 = i6 & 11;
            int i8 = (i6 | 11) & (~i7);
            int i9 = i7 << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            if (!(!j.j())) {
                int i12 = b + 89;
                a = i12 % 128;
                int i13 = i12 % 2;
                if (!(!map.containsKey(j))) {
                    int i14 = a;
                    int i15 = (i14 & 59) + (i14 | 59);
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    ivas.gov.bisp.enumeration.cP.J j2 = (ivas.gov.bisp.enumeration.cP.J) map.get(j);
                    int i17 = a;
                    int i18 = i17 & 115;
                    int i19 = i18 + ((i17 ^ 115) | i18);
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    return j2;
                }
                bGk bgk = new bGk(j, (AbstractC0242a) this.f);
                int i21 = b;
                int i22 = i21 & 121;
                int i23 = i22 + ((i21 ^ 121) | i22);
                a = i23 % 128;
                int i24 = i23 % 2;
                map.put(j, bgk);
                if (i24 == 0) {
                    int i25 = 6 / 0;
                }
                int i26 = a + 103;
                b = i26 % 128;
                if (i26 % 2 == 0) {
                    return bgk;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i27 = b;
        int i28 = i27 & 11;
        int i29 = -(-(i27 | 11));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        a = i30 % 128;
        int i31 = i30 % 2;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r11.x() != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cR.T.b;
        r3 = r1 & 125;
        r1 = -(-((r1 ^ 125) | r3));
        r4 = (r3 ^ r1) + ((r1 & r3) << 1);
        ivas.gov.bisp.enumeration.cR.T.a = r4 % 128;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((r4 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r12.containsKey(r11) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r1 = ivas.gov.bisp.enumeration.cR.T.b;
        r3 = ((r1 & (-126)) | ((~r1) & 125)) + ((r1 & 125) << 1);
        ivas.gov.bisp.enumeration.cR.T.a = r3 % 128;
        r3 = r3 % 2;
        r11 = (ivas.gov.bisp.enumeration.cP.P) r12.get(r11);
        r12 = ivas.gov.bisp.enumeration.cR.T.a;
        r1 = r12 & 101;
        r12 = (r12 ^ 101) | r1;
        r2 = ((r1 | r12) << 1) - (r12 ^ r1);
        ivas.gov.bisp.enumeration.cR.T.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        r3 = new ivas.gov.bisp.enumeration.cR.T.bGj(r11, (ivas.gov.bisp.enumeration.cP.AbstractC0242a) r10.f, bF(r11.m(), r12), bF(r11.s(), r12), bF(r11.o(), r12));
        r4 = ivas.gov.bisp.enumeration.cR.T.b;
        r5 = r4 & 69;
        r4 = (r4 | 69) & (~r5);
        r2 = -(-(r5 << 1));
        r5 = (r4 & r2) + (r2 | r4);
        ivas.gov.bisp.enumeration.cR.T.a = r5 % 128;
        r5 = r5 % 2;
        r12.put(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        if (r5 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        r12.containsKey(r11);
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r11.x() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.cP.P bI(ivas.gov.bisp.enumeration.cP.P r11, java.util.HashMap<java.lang.Object, java.lang.Object> r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.T.bI(ivas.gov.bisp.enumeration.cP.P, java.util.HashMap):ivas.gov.bisp.enumeration.cP.P");
    }
}
