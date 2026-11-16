package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.C0244m;
import ivas.gov.bisp.enumeration.cP.R;
import ivas.gov.bisp.enumeration.cS.AbstractC0253j;
import ivas.gov.bisp.enumeration.o00OO0o0.o00O0O;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0248j {
    public static final C0244m P = new C0244m(-12219292800000L);
    public static final ConcurrentHashMap<u, l> Q = new ConcurrentHashMap<>();
    private static int a = 1;
    private static int b;
    public M R;
    public O S;
    public long T;
    public C0244m U;
    public long V;

    public class bFQ extends AbstractC0253j {
        private static int a = 1;
        private static int b;
        public final ivas.gov.bisp.enumeration.cP.P d;
        public final ivas.gov.bisp.enumeration.cP.P e;
        public final long f;
        public ivas.gov.bisp.enumeration.cP.J g;
        public final boolean h;
        public ivas.gov.bisp.enumeration.cP.J i;

        public bFQ(l lVar, ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.P p2, long j) {
            this(p, p2, null, j, false);
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long C(long j, String str, Locale locale) {
            long jC;
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 113;
            int i4 = i3 + ((i2 ^ 113) | i3);
            int i5 = i4 % 128;
            a = i5;
            int i6 = i4 % 2;
            if (j >= this.f) {
                int i7 = ((i5 & 20) + (i5 | 20)) - 1;
                b = i7 % 128;
                int i8 = i7 % 2;
                jC = this.e.C(j, str, locale);
                int i9 = a;
                int i10 = i9 & 121;
                int i11 = ((i9 ^ 121) | i10) << 1;
                int i12 = -((i9 | 121) & (~i10));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                int i14 = i13 % 128;
                b = i14;
                int i15 = i13 % 2;
                long j2 = this.f;
                if (jC < j2) {
                    int i16 = i14 & 105;
                    int i17 = ((i14 ^ 105) | i16) << 1;
                    int i18 = -((i14 | 105) & (~i16));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    a = i19 % 128;
                    int i20 = i19 % 2;
                    if (l.this.V + jC < j2) {
                        int i21 = b;
                        int i22 = ((((i21 ^ 45) | (i21 & 45)) << 1) - (~(-(((~i21) & 45) | (i21 & (-46)))))) - 1;
                        a = i22 % 128;
                        int i23 = i22 % 2;
                        jC = F(jC);
                        int i24 = b;
                        int i25 = i24 & 37;
                        int i26 = -(-(i24 | 37));
                        int i27 = (i25 & i26) + (i26 | i25);
                        a = i27 % 128;
                        int i28 = i27 % 2;
                    }
                }
            } else {
                jC = this.d.C(j, str, locale);
                int i29 = a;
                int i30 = i29 & 71;
                int i31 = (i29 ^ 71) | i30;
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                int i33 = i32 % 128;
                b = i33;
                int i34 = i32 % 2;
                long j3 = this.f;
                if (jC >= j3) {
                    int i35 = i33 ^ 47;
                    int i36 = -(-((i33 & 47) << 1));
                    int i37 = (i35 & i36) + (i36 | i35);
                    a = i37 % 128;
                    int i38 = i37 % 2;
                    long j4 = jC - l.this.V;
                    int i39 = a;
                    int i40 = i39 + 1;
                    b = i40 % 128;
                    int i41 = i40 % 2;
                    if (j4 >= j3) {
                        int i42 = (i39 & 49) + (i39 | 49);
                        b = i42 % 128;
                        int i43 = i42 % 2;
                        jC = G(jC);
                        int i44 = b + 15;
                        a = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
            }
            int i46 = b;
            int i47 = i46 & 115;
            int i48 = -(-(i46 | 115));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            a = i49 % 128;
            if (i49 % 2 != 0) {
                return jC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long d(long j, int i) {
            int i2 = 2 % 2;
            int i3 = b + 25;
            a = i3 % 128;
            int i4 = i3 % 2;
            long jD = this.e.d(j, i);
            int i5 = b + 122;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return jD;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long e(long j, long j2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 | 93) << 1;
            int i4 = -(i2 ^ 93);
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            b = i5 % 128;
            int i6 = i5 % 2;
            ivas.gov.bisp.enumeration.cP.P p = this.e;
            if (i6 == 0) {
                return p.e(j, j2);
            }
            p.e(j, j2);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        
            if ((r3 % 2) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        
            r6 = r5.e.f(r6);
            r7 = ivas.gov.bisp.enumeration.cR.l.bFQ.b + 98;
            r1 = (r7 ^ (-1)) + (r7 << 1);
            ivas.gov.bisp.enumeration.cR.l.bFQ.a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r7 = 16 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        
            r5.e.f(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            r6 = r5.d.f(r6);
            r7 = ivas.gov.bisp.enumeration.cR.l.bFQ.b;
            r1 = r7 & 27;
            r7 = (r7 | 27) & (~r1);
            r1 = -(-(r1 << 1));
            r3 = ((r7 | r1) << 1) - (r7 ^ r1);
            ivas.gov.bisp.enumeration.cR.l.bFQ.a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            if ((r3 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if (r6 >= r5.f) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r6 >= r5.f) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r3 = r1 & 1;
            r3 = r3 + ((r1 ^ 1) | r3);
            ivas.gov.bisp.enumeration.cR.l.bFQ.a = r3 % 128;
         */
        @Override // ivas.gov.bisp.enumeration.cP.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int f(long r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.cR.l.bFQ.b
                r2 = r1 & 63
                r3 = r1 ^ 63
                r3 = r3 | r2
                r4 = r2 & r3
                r2 = r2 | r3
                int r4 = r4 + r2
                int r2 = r4 % 128
                ivas.gov.bisp.enumeration.cR.l.bFQ.a = r2
                int r4 = r4 % r0
                r2 = 0
                if (r4 != 0) goto L21
                long r3 = r5.f
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                r4 = 72
                int r4 = r4 / 0
                if (r3 < 0) goto L55
                goto L27
            L21:
                long r3 = r5.f
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 < 0) goto L55
            L27:
                r3 = r1 & 1
                r1 = r1 ^ 1
                r1 = r1 | r3
                int r3 = r3 + r1
                int r1 = r3 % 128
                ivas.gov.bisp.enumeration.cR.l.bFQ.a = r1
                int r3 = r3 % r0
                if (r3 == 0) goto L4f
                ivas.gov.bisp.enumeration.cP.P r1 = r5.e
                int r6 = r1.f(r6)
                int r7 = ivas.gov.bisp.enumeration.cR.l.bFQ.b
                int r7 = r7 + 98
                r1 = r7 ^ (-1)
                int r7 = r7 << 1
                int r1 = r1 + r7
                int r7 = r1 % 128
                ivas.gov.bisp.enumeration.cR.l.bFQ.a = r7
                int r1 = r1 % r0
                if (r1 != 0) goto L4e
                r7 = 16
                int r7 = r7 / 0
            L4e:
                return r6
            L4f:
                ivas.gov.bisp.enumeration.cP.P r0 = r5.e
                r0.f(r6)
                throw r2
            L55:
                ivas.gov.bisp.enumeration.cP.P r1 = r5.d
                int r6 = r1.f(r6)
                int r7 = ivas.gov.bisp.enumeration.cR.l.bFQ.b
                r1 = r7 & 27
                int r3 = ~r1
                r7 = r7 | 27
                r7 = r7 & r3
                int r1 = r1 << 1
                int r1 = -r1
                int r1 = -r1
                r3 = r7 | r1
                int r3 = r3 << 1
                r7 = r7 ^ r1
                int r3 = r3 - r7
                int r7 = r3 % 128
                ivas.gov.bisp.enumeration.cR.l.bFQ.a = r7
                int r3 = r3 % r0
                if (r3 == 0) goto L75
                return r6
            L75:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.l.bFQ.f(long):int");
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String g(int i, Locale locale) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 ^ 69;
            int i5 = (((i3 & 69) | i4) << 1) - i4;
            b = i5 % 128;
            int i6 = i5 % 2;
            String strG = this.e.g(i, locale);
            int i7 = a;
            int i8 = ((i7 | 41) << 1) - (i7 ^ 41);
            b = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 8 / 0;
            }
            return strG;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String j(int i, Locale locale) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 111;
            int i5 = i4 + ((i3 ^ 111) | i4);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                this.e.j(i, locale);
                throw null;
            }
            String strJ = this.e.j(i, locale);
            int i6 = b + 107;
            a = i6 % 128;
            if (i6 % 2 != 0) {
                return strJ;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public int l(long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 15;
            int i4 = (i3 - (~(-(-((i2 ^ 15) | i3))))) - 1;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                this.e.l(j, j2);
                throw null;
            }
            int iL = this.e.l(j, j2);
            int i5 = b;
            int i6 = (((i5 ^ 61) | (i5 & 61)) << 1) - (((~i5) & 61) | (i5 & (-62)));
            a = i6 % 128;
            int i7 = i6 % 2;
            return iL;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public ivas.gov.bisp.enumeration.cP.J m() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & (-92)) | ((~i2) & 91)) + ((i2 & 91) << 1);
            int i4 = i3 % 128;
            a = i4;
            int i5 = i3 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.g;
            int i6 = ((i4 | 27) << 1) - (i4 ^ 27);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long n(long j, long j2) {
            long jN;
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((((i2 ^ 51) | (i2 & 51)) << 1) - (~(-(((~i2) & 51) | (i2 & (-52)))))) - 1;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                jN = this.e.n(j, j2);
                int i4 = 22 / 0;
            } else {
                jN = this.e.n(j, j2);
            }
            int i5 = a + 73;
            b = i5 % 128;
            int i6 = i5 % 2;
            return jN;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public ivas.gov.bisp.enumeration.cP.J o() {
            int i = 2 % 2;
            int i2 = a + 83;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                this.e.o();
                throw null;
            }
            ivas.gov.bisp.enumeration.cP.J jO = this.e.o();
            int i3 = b + 15;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                return jO;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public int q() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (((i2 | 48) << 1) - (i2 ^ 48)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int iQ = this.d.q();
            int i5 = b;
            int i6 = i5 & 121;
            int i7 = -(-((i5 ^ 121) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            return iQ;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public int r() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (i2 & 103) + (i2 | 103);
            b = i3 % 128;
            int i4 = i3 % 2;
            int iR = this.e.r();
            int i5 = b;
            int i6 = (i5 ^ 125) + ((i5 & 125) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return iR;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public ivas.gov.bisp.enumeration.cP.J s() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 43;
            int i4 = i2 | 43;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.i;
            int i7 = i2 & 49;
            int i8 = (i2 | 49) & (~i7);
            int i9 = i7 << 1;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public boolean w() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 32) << 1) - (i2 ^ 32)) - 1;
            int i4 = i3 % 128;
            b = i4;
            int i5 = i3 % 2;
            int i6 = ((i4 & (-50)) | ((~i4) & 49)) + ((i4 & 49) << 1);
            a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 92 / 0;
            }
            return false;
        }

        public bFQ(ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.P p2, ivas.gov.bisp.enumeration.cP.J j, long j2, boolean z) {
            super(p2.v());
            this.d = p;
            this.e = p2;
            this.f = j2;
            this.h = z;
            this.g = p2.m();
            if (j == null && (j = p2.s()) == null) {
                int i = a;
                int i2 = (((i ^ 27) | (i & 27)) << 1) - (((~i) & 27) | (i & (-28)));
                b = i2 % 128;
                int i3 = i2 % 2;
                j = p.s();
                int i4 = a;
                int i5 = i4 & 17;
                int i6 = (i4 | 17) & (~i5);
                int i7 = -(-(i5 << 1));
                int i8 = (i6 & i7) + (i6 | i7);
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            }
            this.i = j;
            int i10 = a;
            int i11 = i10 & 13;
            int i12 = i10 | 13;
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String h(long j, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            if (j < this.f) {
                String strH = this.d.h(j, locale);
                int i5 = a + 103;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    return strH;
                }
                throw null;
            }
            int i6 = (-2) - (((i2 & 44) + (i2 | 44)) ^ (-1));
            a = i6 % 128;
            int i7 = i6 % 2;
            String strH2 = this.e.h(j, locale);
            int i8 = (-2) - ((a + 68) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
            return strH2;
        }

        public long F(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 ^ 13;
            int i4 = ((i2 & 13) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            int i7 = i6 % 128;
            b = i7;
            int i8 = i6 % 2;
            if (!this.h) {
                l lVar = l.this;
                M m = lVar.R;
                O o2 = lVar.S;
                int i9 = b;
                int i10 = (i9 ^ 118) + ((i9 & 118) << 1);
                int i11 = (i10 ^ (-1)) + (i10 << 1);
                a = i11 % 128;
                int i12 = i11 % 2;
                long jBy = l.by(j, m, o2);
                int i13 = a + 103;
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 60 / 0;
                }
                return jBy;
            }
            int i15 = i7 & 29;
            int i16 = (i7 | 29) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            a = i18 % 128;
            int i19 = i18 % 2;
            l lVar2 = l.this;
            M m2 = lVar2.R;
            int i20 = a;
            int i21 = (i20 & 35) + (i20 | 35);
            b = i21 % 128;
            int i22 = i21 % 2;
            long jBA = l.bA(j, m2, lVar2.S);
            int i23 = a;
            int i24 = i23 & 19;
            int i25 = i23 | 19;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            b = i26 % 128;
            int i27 = i26 % 2;
            return jBA;
        }

        public long G(long j) {
            long jBy;
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 ^ 105) | (i2 & 105)) << 1;
            int i4 = -(((~i2) & 105) | (i2 & (-106)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            int i6 = i5 % 128;
            a = i6;
            int i7 = i5 % 2;
            if (this.h) {
                int i8 = i6 & 125;
                int i9 = (i6 ^ 125) | i8;
                int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    l lVar = l.this;
                    return l.bA(j, lVar.S, lVar.R);
                }
                l lVar2 = l.this;
                long jBA = l.bA(j, lVar2.S, lVar2.R);
                int i11 = 4 / 0;
                return jBA;
            }
            l lVar3 = l.this;
            O o2 = lVar3.S;
            M m = lVar3.R;
            int i12 = a;
            int i13 = i12 & 105;
            int i14 = ((i12 | 105) & (~i13)) + (i13 << 1);
            b = i14 % 128;
            if (i14 % 2 != 0) {
                jBy = l.by(j, o2, m);
                int i15 = 17 / 0;
            } else {
                jBy = l.by(j, o2, m);
            }
            int i16 = b;
            int i17 = i16 & 105;
            int i18 = (i16 | 105) & (~i17);
            int i19 = i17 << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 36 / 0;
            }
            return jBy;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String c(long j, Locale locale) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 26) << 1) - (i2 ^ 26)) - 1;
            int i4 = i3 % 128;
            b = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (j < this.f) {
                String strC = this.d.c(j, locale);
                int i5 = b;
                int i6 = i5 & 63;
                int i7 = (i5 ^ 63) | i6;
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                a = i8 % 128;
                int i9 = i8 % 2;
                return strC;
            }
            int i10 = ((((i4 ^ 55) | (i4 & 55)) << 1) - (~(-(((~i4) & 55) | (i4 & (-56)))))) - 1;
            a = i10 % 128;
            if (i10 % 2 != 0) {
                return this.e.c(j, locale);
            }
            this.e.c(j, locale);
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public int p(Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 47;
            int i4 = i3 + ((i2 ^ 47) | i3);
            a = i4 % 128;
            if (i4 % 2 == 0) {
                this.d.p(locale);
                this.e.p(locale);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iP = this.d.p(locale);
            int iP2 = this.e.p(locale);
            int i5 = a;
            int i6 = i5 ^ 31;
            int i7 = (i5 & 31) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            b = i8 % 128;
            int i9 = i8 % 2;
            int iMax = Math.max(iP, iP2);
            int i10 = a;
            int i11 = (i10 & (-42)) | ((~i10) & 41);
            int i12 = -(-((i10 & 41) << 1));
            int i13 = (i11 & i12) + (i12 | i11);
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 / 0;
            }
            return iMax;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public boolean u(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 19) - (~(-(-(i2 | 19))))) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            if (j < this.f) {
                boolean zU = this.d.u(j);
                int i5 = a;
                int i6 = i5 & 95;
                int i7 = -(-((i5 ^ 95) | i6));
                int i8 = (i6 & i7) + (i7 | i6);
                b = i8 % 128;
                int i9 = i8 % 2;
                return zU;
            }
            int i10 = i2 & 43;
            int i11 = ((((i2 ^ 43) | i10) << 1) - (~(-((i2 | 43) & (~i10))))) - 1;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                return this.e.u(j);
            }
            this.e.u(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x0054  */
        /* JADX WARN: Code duplicated, block: B:15:0x006b  */
        /* JADX WARN: Code duplicated, block: B:16:0x0074  */
        /* JADX WARN: Code duplicated, block: B:18:0x0090  */
        /* JADX WARN: Code duplicated, block: B:20:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // ivas.gov.bisp.enumeration.cP.P
        public long y(long j) {
            long jY;
            long j2;
            int i;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = a;
            int i6 = (i5 & 30) + (i5 | 30);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 7 / 0;
                if (j >= this.f) {
                    jY = this.e.y(j);
                    j2 = this.f;
                    i = b;
                    int i9 = (i ^ 53) + ((i & 53) << 1);
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    if (jY < j2) {
                        int i11 = (-2) - ((i + 80) ^ (-1));
                        a = i11 % 128;
                        int i12 = i11 % 2;
                        if (l.this.V + jY < j2) {
                            int i13 = a;
                            int i14 = i13 & 65;
                            i2 = (((i13 | 65) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                jY = F(jY);
                                int i15 = 55 / 0;
                            } else {
                                jY = F(jY);
                            }
                            int i16 = b;
                            int i17 = i16 & 81;
                            int i18 = ((i16 ^ 81) | i17) << 1;
                            int i19 = -((i16 | 81) & (~i17));
                            int i20 = (i18 & i19) + (i19 | i18);
                            a = i20 % 128;
                            int i21 = i20 % 2;
                        }
                    }
                } else {
                    jY = this.d.y(j);
                    int i22 = b;
                    int i23 = i22 & 79;
                    i3 = i23 + ((i22 ^ 79) | i23);
                    a = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i24 = 5 % 5;
                    }
                }
            } else if (j >= this.f) {
                jY = this.e.y(j);
                j2 = this.f;
                i = b;
                int i25 = (i ^ 53) + ((i & 53) << 1);
                a = i25 % 128;
                int i110 = i25 % 2;
                if (jY < j2) {
                    int i111 = (-2) - ((i + 80) ^ (-1));
                    a = i111 % 128;
                    int i112 = i111 % 2;
                    if (l.this.V + jY < j2) {
                        int i113 = a;
                        int i114 = i113 & 65;
                        i2 = (((i113 | 65) & (~i114)) - (~(-(-(i114 << 1))))) - 1;
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            jY = F(jY);
                            int i115 = 55 / 0;
                        } else {
                            jY = F(jY);
                        }
                        int i116 = b;
                        int i117 = i116 & 81;
                        int i118 = ((i116 ^ 81) | i117) << 1;
                        int i119 = -((i116 | 81) & (~i117));
                        int i26 = (i118 & i119) + (i119 | i118);
                        a = i26 % 128;
                        int i27 = i26 % 2;
                    }
                }
            } else {
                jY = this.d.y(j);
                int i28 = b;
                int i29 = i28 & 79;
                i3 = i29 + ((i28 ^ 79) | i29);
                a = i3 % 128;
                if (i3 % 2 == 0) {
                    int i210 = 5 % 5;
                }
            }
            int i30 = b;
            int i31 = i30 & 17;
            int i32 = -(-((i30 ^ 17) | i31));
            int i33 = (i31 & i32) + (i32 | i31);
            a = i33 % 128;
            if (i33 % 2 != 0) {
                return jY;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long z(long j) {
            long jZ;
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 33;
            int i4 = (((i2 ^ 33) | i3) << 1) - ((i2 | 33) & (~i3));
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (j >= this.f) {
                jZ = this.e.z(j);
                int i5 = b;
                int i6 = ((((i5 ^ 35) | (i5 & 35)) << 1) - (~(-(((~i5) & 35) | (i5 & (-36)))))) - 1;
                a = i6 % 128;
                int i7 = i6 % 2;
            } else {
                jZ = this.d.z(j);
                long j2 = this.f;
                int i8 = a;
                int i9 = (((i8 & (-38)) | ((~i8) & 37)) - (~((i8 & 37) << 1))) - 1;
                int i10 = i9 % 128;
                b = i10;
                int i11 = i9 % 2;
                if (jZ >= j2) {
                    int i12 = (-2) - ((((i10 | 114) << 1) - (i10 ^ 114)) ^ (-1));
                    a = i12 % 128;
                    int i13 = i12 % 2;
                    if (jZ - l.this.V >= j2) {
                        int i14 = (-2) - ((b + 14) ^ (-1));
                        a = i14 % 128;
                        int i15 = i14 % 2;
                        jZ = G(jZ);
                        if (i15 == 0) {
                            int i16 = 3 / 0;
                        }
                    }
                }
            }
            int i17 = a;
            int i18 = ((i17 | 63) << 1) - (i17 ^ 63);
            b = i18 % 128;
            if (i18 % 2 == 0) {
                return jZ;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0056  */
        /* JADX WARN: Code duplicated, block: B:15:0x005f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0089  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:34:0x0104  */
        @Override // ivas.gov.bisp.enumeration.cP.P
        public long A(long j, int i) {
            long jA;
            int i2;
            int i3 = 2 % 2;
            int i4 = a;
            int i5 = (i4 & (-32)) | ((~i4) & 31);
            int i6 = (i4 & 31) << 1;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            int i8 = i7 % 128;
            b = i8;
            int i9 = i7 % 2;
            Object obj = null;
            if (j >= this.f) {
                int i10 = i8 ^ 123;
                int i11 = (i8 & 123) << 1;
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    this.e.A(j, i);
                    obj.hashCode();
                    throw null;
                }
                jA = this.e.A(j, i);
                long j2 = this.f;
                int i13 = b + 39;
                a = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 55 / 0;
                    if (jA < j2) {
                        if (l.this.V + jA < j2) {
                            int i15 = a;
                            int i16 = i15 ^ 37;
                            int i17 = (i15 & 37) << 1;
                            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                            b = i18 % 128;
                            int i19 = i18 % 2;
                            jA = F(jA);
                            int i20 = a;
                            int i21 = (i20 & 95) + (i20 | 95);
                            b = i21 % 128;
                            int i22 = i21 % 2;
                        }
                        if (f(jA) != i) {
                            throw new ivas.gov.bisp.enumeration.cP.M(this.e.v(), Integer.valueOf(i), null, null);
                        }
                    }
                } else if (jA < j2) {
                    if (l.this.V + jA < j2) {
                        int i110 = a;
                        int i111 = i110 ^ 37;
                        int i112 = (i110 & 37) << 1;
                        int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                        b = i113 % 128;
                        int i114 = i113 % 2;
                        jA = F(jA);
                        int i23 = a;
                        int i24 = (i23 & 95) + (i23 | 95);
                        b = i24 % 128;
                        int i25 = i24 % 2;
                    }
                    if (f(jA) != i) {
                        throw new ivas.gov.bisp.enumeration.cP.M(this.e.v(), Integer.valueOf(i), null, null);
                    }
                }
            } else {
                jA = this.d.A(j, i);
                long j3 = this.f;
                int i26 = b;
                int i27 = ((i26 ^ 34) + ((i26 & 34) << 1)) - 1;
                a = i27 % 128;
                int i28 = i27 % 2;
                if (jA >= j3) {
                    int i29 = i26 ^ 15;
                    int i30 = (((i26 & 15) | i29) << 1) - i29;
                    a = i30 % 128;
                    int i31 = i30 % 2;
                    long j4 = jA - l.this.V;
                    int i32 = b;
                    int i33 = (i32 | 95) << 1;
                    int i34 = -((95 & (~i32)) | (i32 & (-96)));
                    int i35 = (i33 & i34) + (i34 | i33);
                    a = i35 % 128;
                    if (i35 % 2 == 0) {
                        int i36 = 71 / 0;
                        if (j4 >= j3) {
                            jA = G(jA);
                            i2 = b + 57;
                            a = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i37 = 2 / 4;
                            }
                        }
                    } else if (j4 >= j3) {
                        jA = G(jA);
                        i2 = b + 57;
                        a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i38 = 2 / 4;
                        }
                    }
                    if (f(jA) != i) {
                        throw new ivas.gov.bisp.enumeration.cP.M(this.d.v(), Integer.valueOf(i), null, null);
                    }
                }
            }
            int i39 = b;
            int i40 = (i39 ^ 33) + ((i39 & 33) << 1);
            a = i40 % 128;
            if (i40 % 2 != 0) {
                return jA;
            }
            throw null;
        }
    }

    public static class bFU extends ivas.gov.bisp.enumeration.cS.r {
        private static int a = 1;
        private static int b;
        public final bFR e;

        public bFU(ivas.gov.bisp.enumeration.cP.J j, bFR bfr) {
            super(j, j.g());
            this.e = bfr;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long c(long j, int i) {
            int i2 = 2 % 2;
            int i3 = a + 35;
            b = i3 % 128;
            int i4 = i3 % 2;
            long jD = this.e.d(j, i);
            int i5 = b + 83;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return jD;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long d(long j, long j2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 | 19;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 19)) & i3);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                this.e.e(j, j2);
                throw null;
            }
            long jE = this.e.e(j, j2);
            int i7 = b;
            int i8 = (i7 & 83) + (i7 | 83);
            a = i8 % 128;
            int i9 = i8 % 2;
            return jE;
        }

        @Override // ivas.gov.bisp.enumeration.cS.c, ivas.gov.bisp.enumeration.cP.J
        public int e(long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 ^ 69) + ((i2 & 69) << 1);
            a = i3 % 128;
            int i4 = i3 % 2;
            int iL = this.e.l(j, j2);
            int i5 = b;
            int i6 = i5 & 27;
            int i7 = -(-((i5 ^ 27) | i6));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 55 / 0;
            }
            return iL;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long f(long j, long j2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
            b = i3 % 128;
            int i4 = i3 % 2;
            long jN = this.e.n(j, j2);
            int i5 = b;
            int i6 = i5 ^ 75;
            int i7 = ((i5 & 75) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            a = i9 % 128;
            int i10 = i9 % 2;
            return jN;
        }
    }

    static {
        int i = a + 51;
        b = i % 128;
        int i2 = i % 2;
    }

    public l(O o2, M m, C0244m c0244m) {
        super(null, new Object[]{o2, m, c0244m});
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.p096p.h
    public final AbstractC0242a ap() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 7;
        int i4 = (i2 ^ 7) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        if (hVar == null) {
            AbstractC0242a abstractC0242a = AbstractC0242a.c;
            int i7 = b;
            int i8 = i7 & 57;
            int i9 = (i7 | 57) & (~i8);
            int i10 = i8 << 1;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            a = i11 % 128;
            int i12 = i11 % 2;
            return abstractC0242a;
        }
        int i13 = b + 31;
        a = i13 % 128;
        int i14 = i13 % 2;
        AbstractC0242a abstractC0242aAp = hVar.ap();
        int i15 = b;
        int i16 = i15 & 111;
        int i17 = ((i15 ^ 111) | i16) << 1;
        int i18 = -((i15 | 111) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        a = i19 % 128;
        int i20 = i19 % 2;
        return abstractC0242aAp;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 99) + ((i2 & 99) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            be(AbstractC0242a.c);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p096p.h hVarBe = be(AbstractC0242a.c);
        int i4 = b;
        int i5 = i4 & 73;
        int i6 = (i4 | 73) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        return hVarBe;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
    public final boolean equals(Object obj) {
        boolean z;
        Object obj2;
        int i;
        l lVar;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        M m;
        int i5 = 2 % 2;
        int i6 = a;
        int i7 = i6 & 7;
        int i8 = -(-((i6 ^ 7) | i7));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = i9 % 128;
        b = i10;
        boolean z2 = false;
        if (i9 % 2 != 0) {
            if (this != obj) {
                z = false;
                obj2 = null;
                if (obj instanceof l) {
                    i = i10 + 63;
                    a = i % 128;
                    if (i % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                int i11 = i10 & 75;
                int i12 = -(-((i10 ^ 75) | i11));
                int i13 = (i11 & i12) + (i11 | i12);
                a = i13 % 128;
                int i14 = i13 % 2;
                lVar = (l) obj;
                j = this.T;
                j2 = lVar.T;
                int i15 = i10 ^ 105;
                int i16 = (i10 & 105) << 1;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                i2 = i17 % 128;
                a = i2;
                int i18 = i17 % 2;
                if (j == j2) {
                    int i19 = (-2) - (((i2 ^ 28) + ((i2 & 28) << 1)) ^ (-1));
                    b = i19 % 128;
                    int i20 = i19 % 2;
                    i4 = this.R.ag;
                    m = lVar.R;
                    int i21 = a + 13;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    if (i4 == m.ag) {
                        int i23 = a;
                        int i24 = i23 & 71;
                        int i25 = (((i23 ^ 71) | i24) << 1) - ((i23 | 71) & (~i24));
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        if (!ap().equals(lVar.ap())) {
                            int i27 = a + 99;
                            b = i27 % 128;
                            int i28 = i27 % 2;
                        } else {
                            z2 = z;
                        }
                    } else {
                        int i29 = a + 99;
                        b = i29 % 128;
                        int i210 = i29 % 2;
                    }
                } else {
                    int i211 = a + 99;
                    b = i211 % 128;
                    int i212 = i211 % 2;
                }
                int i30 = a;
                int i31 = i30 & 13;
                int i32 = (i30 ^ 13) | i31;
                i3 = ((i31 | i32) << 1) - (i32 ^ i31);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    return z2;
                }
                obj2.hashCode();
                throw null;
            }
            int i33 = (i6 & 45) + (i6 | 45);
            b = i33 % 128;
            int i34 = i33 % 2;
            int i35 = i6 + 98;
            int i36 = (i35 ^ (-1)) + (i35 << 1);
            b = i36 % 128;
            int i37 = i36 % 2;
            return true;
        }
        if (this != obj) {
            z = true;
            obj2 = null;
            if (obj instanceof l) {
                i = i10 + 63;
                a = i % 128;
                if (i % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i110 = i10 & 75;
            int i111 = -(-((i10 ^ 75) | i110));
            int i112 = (i110 & i111) + (i110 | i111);
            a = i112 % 128;
            int i113 = i112 % 2;
            lVar = (l) obj;
            j = this.T;
            j2 = lVar.T;
            int i114 = i10 ^ 105;
            int i115 = (i10 & 105) << 1;
            int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
            i2 = i116 % 128;
            a = i2;
            int i117 = i116 % 2;
            if (j == j2) {
                int i118 = (-2) - (((i2 ^ 28) + ((i2 & 28) << 1)) ^ (-1));
                b = i118 % 128;
                int i213 = i118 % 2;
                i4 = this.R.ag;
                m = lVar.R;
                int i214 = a + 13;
                b = i214 % 128;
                int i215 = i214 % 2;
                if (i4 == m.ag) {
                    int i216 = a;
                    int i217 = i216 & 71;
                    int i218 = (((i216 ^ 71) | i217) << 1) - ((i216 | 71) & (~i217));
                    b = i218 % 128;
                    int i219 = i218 % 2;
                    if (!ap().equals(lVar.ap())) {
                        int i2110 = a + 99;
                        b = i2110 % 128;
                        int i2111 = i2110 % 2;
                    } else {
                        z2 = z;
                    }
                } else {
                    int i2112 = a + 99;
                    b = i2112 % 128;
                    int i2113 = i2112 % 2;
                }
            } else {
                int i2114 = a + 99;
                b = i2114 % 128;
                int i2115 = i2114 % 2;
            }
            int i38 = a;
            int i39 = i38 & 13;
            int i310 = (i38 ^ 13) | i39;
            i3 = ((i39 | i310) << 1) - (i310 ^ i39);
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return z2;
            }
            obj2.hashCode();
            throw null;
        }
        int i311 = (i6 & 45) + (i6 | 45);
        b = i311 % 128;
        int i312 = i311 % 2;
        int i313 = i6 + 98;
        int i314 = (i313 ^ (-1)) + (i313 << 1);
        b = i314 % 128;
        int i315 = i314 % 2;
        return true;
    }

    public final class bFR extends bFQ {
        private static int a = 1;
        private static int b;

        public bFR(l lVar, ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.P p2, ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.J j2, long j3) {
            this(p, p2, j, j3, false);
            this.i = j2;
        }

        @Override // ivas.gov.bisp.enumeration.cR.l.bFQ, ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long d(long j, int i) {
            long jD;
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = i3 & 65;
            int i5 = (i3 | 65) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            b = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                long j2 = this.f;
                obj.hashCode();
                throw null;
            }
            if (j >= this.f) {
                int i8 = a + 21;
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    this.e.d(j, i);
                    obj.hashCode();
                    throw null;
                }
                jD = this.e.d(j, i);
                long j3 = this.f;
                if (jD < j3) {
                    int i9 = a;
                    int i10 = i9 ^ 83;
                    int i11 = (i9 & 83) << 1;
                    int i12 = (i10 & i11) + (i11 | i10);
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    l lVar = l.this;
                    if (lVar.V + jD < j3) {
                        int i14 = a + 15;
                        b = i14 % 128;
                        if (i14 % 2 != 0) {
                            boolean z = this.h;
                            obj.hashCode();
                            throw null;
                        }
                        if (this.h) {
                            int i15 = a + 63;
                            b = i15 % 128;
                            int i16 = i15 % 2;
                            if (lVar.R.H.f(jD) <= 0) {
                                int i17 = b;
                                int i18 = i17 & 55;
                                int i19 = (((i17 | 55) & (~i18)) - (~(-(-(i18 << 1))))) - 1;
                                a = i19 % 128;
                                int i20 = i19 % 2;
                                jD = l.this.R.H.d(jD, -1);
                                int i21 = b;
                                int i22 = ((i21 ^ 75) - (~(-(-((i21 & 75) << 1))))) - 1;
                                a = i22 % 128;
                                int i23 = i22 % 2;
                                int i24 = ((i21 | 13) << 1) - (i21 ^ 13);
                                a = i24 % 128;
                                int i25 = i24 % 2;
                            }
                        } else if (lVar.R.G.f(jD) <= 0) {
                            int i26 = a;
                            int i27 = ((i26 | 1) << 1) - (((~i26) & 1) | (i26 & (-2)));
                            b = i27 % 128;
                            int i28 = i27 % 2;
                            jD = l.this.R.G.d(jD, -1);
                            int i29 = a;
                            int i30 = ((i29 | 114) << 1) - (i29 ^ 114);
                            int i31 = (i30 ^ (-1)) + (i30 << 1);
                            b = i31 % 128;
                            int i32 = i31 % 2;
                        }
                        jD = F(jD);
                        int i33 = b;
                        int i34 = i33 ^ 17;
                        int i35 = -(-((i33 & 17) << 1));
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        a = i36 % 128;
                        if (i36 % 2 == 0) {
                            int i37 = 5 % 3;
                        }
                    }
                }
            } else {
                jD = this.d.d(j, i);
                long j4 = this.f;
                int i38 = b + 71;
                int i39 = i38 % 128;
                a = i39;
                int i40 = i38 % 2;
                if (jD >= j4) {
                    int i41 = i39 & 9;
                    int i42 = ((i39 ^ 9) | i41) << 1;
                    int i43 = -((i39 | 9) & (~i41));
                    int i44 = (i42 & i43) + (i42 | i43);
                    b = i44 % 128;
                    if ((i44 % 2 != 0 ? jD % l.this.V : jD - l.this.V) >= j4) {
                        int i45 = a;
                        int i46 = i45 & 59;
                        int i47 = i45 | 59;
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        b = i48 % 128;
                        if (i48 % 2 != 0) {
                            G(jD);
                            throw null;
                        }
                        jD = G(jD);
                        int i49 = b;
                        int i50 = ((i49 ^ 75) | (i49 & 75)) << 1;
                        int i51 = -(((~i49) & 75) | (i49 & (-76)));
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        a = i52 % 128;
                        if (i52 % 2 == 0) {
                            int i53 = 2 / 2;
                        }
                    }
                }
            }
            int i54 = a;
            int i55 = i54 & 33;
            int i56 = -(-((i54 ^ 33) | i55));
            int i57 = (i55 & i56) + (i56 | i55);
            b = i57 % 128;
            if (i57 % 2 == 0) {
                return jD;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        /* JADX WARN: Code duplicated, block: B:23:0x008a  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:28:0x00be  */
        /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
        @Override // ivas.gov.bisp.enumeration.cR.l.bFQ, ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long e(long j, long j2) {
            long jE;
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = b;
            int i5 = ((i4 | 101) << 1) - (i4 ^ 101);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                long j3 = this.f;
                obj.hashCode();
                throw null;
            }
            if (j >= this.f) {
                int i6 = a;
                int i7 = ((i6 & 48) + (i6 | 48)) - 1;
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    this.e.e(j, j2);
                    long j4 = this.f;
                    throw null;
                }
                jE = this.e.e(j, j2);
                long j5 = this.f;
                int i8 = a + 125;
                int i9 = i8 % 128;
                b = i9;
                int i10 = i8 % 2;
                if (jE < j5) {
                    int i11 = i9 & 25;
                    int i12 = (i9 ^ 25) | i11;
                    int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                    a = i13 % 128;
                    int i14 = i13 % 2;
                    l lVar = l.this;
                    if (lVar.V + jE < j5) {
                        int i15 = b;
                        int i16 = ((i15 ^ 102) + ((i15 & 102) << 1)) - 1;
                        a = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 62 / 0;
                            if (this.h) {
                                if (lVar.R.H.f(jE) <= 0) {
                                    i = b + 55;
                                    a = i % 128;
                                    if (i % 2 != 0) {
                                        l.this.R.H.d(jE, -1);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    jE = l.this.R.H.d(jE, -1);
                                    int i18 = a;
                                    int i19 = i18 & 11;
                                    int i20 = (((i18 ^ 11) | i19) << 1) - ((i18 | 11) & (~i19));
                                    b = i20 % 128;
                                    int i21 = i20 % 2;
                                }
                            } else if (lVar.R.G.f(jE) <= 0) {
                                int i22 = b + 19;
                                a = i22 % 128;
                                int i23 = i22 % 2;
                                ivas.gov.bisp.enumeration.cP.P p = l.this.R.G;
                                int i24 = a;
                                int i25 = i24 & 25;
                                int i26 = ((i24 ^ 25) | i25) << 1;
                                int i27 = -((i24 | 25) & (~i25));
                                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                                b = i28 % 128;
                                int i29 = i28 % 2;
                                jE = p.d(jE, -1);
                                int i30 = a;
                                int i31 = (i30 ^ 52) + ((i30 & 52) << 1);
                                i2 = (i31 ^ (-1)) + (i31 << 1);
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i32 = 2 / 2;
                                }
                            }
                        } else if (!(!this.h)) {
                            if (lVar.R.H.f(jE) <= 0) {
                                i = b + 55;
                                a = i % 128;
                                if (i % 2 != 0) {
                                    l.this.R.H.d(jE, -1);
                                    obj.hashCode();
                                    throw null;
                                }
                                jE = l.this.R.H.d(jE, -1);
                                int i110 = a;
                                int i111 = i110 & 11;
                                int i210 = (((i110 ^ 11) | i111) << 1) - ((i110 | 11) & (~i111));
                                b = i210 % 128;
                                int i211 = i210 % 2;
                            }
                        } else if (lVar.R.G.f(jE) <= 0) {
                            int i212 = b + 19;
                            a = i212 % 128;
                            int i213 = i212 % 2;
                            ivas.gov.bisp.enumeration.cP.P p2 = l.this.R.G;
                            int i214 = a;
                            int i215 = i214 & 25;
                            int i216 = ((i214 ^ 25) | i215) << 1;
                            int i217 = -((i214 | 25) & (~i215));
                            int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
                            b = i218 % 128;
                            int i219 = i218 % 2;
                            jE = p2.d(jE, -1);
                            int i33 = a;
                            int i34 = (i33 ^ 52) + ((i33 & 52) << 1);
                            i2 = (i34 ^ (-1)) + (i34 << 1);
                            b = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i35 = 2 / 2;
                            }
                        }
                        jE = F(jE);
                        int i36 = b;
                        int i37 = i36 & 87;
                        int i38 = ((i36 ^ 87) | i37) << 1;
                        int i39 = -((i36 | 87) & (~i37));
                        int i40 = (i38 & i39) + (i39 | i38);
                        a = i40 % 128;
                        int i41 = i40 % 2;
                    }
                }
            } else {
                jE = this.d.e(j, j2);
                long j6 = this.f;
                int i42 = a;
                int i43 = (i42 | 47) << 1;
                int i44 = -(i42 ^ 47);
                int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                b = i45 % 128;
                int i46 = i45 % 2;
                if (jE >= j6) {
                    int i47 = i42 ^ 21;
                    int i48 = (i42 & 21) << 1;
                    int i49 = (i47 & i48) + (i48 | i47);
                    b = i49 % 128;
                    long j7 = i49 % 2 != 0 ? l.this.V | jE : jE - l.this.V;
                    int i50 = b + 53;
                    int i51 = i50 % 128;
                    a = i51;
                    int i52 = i50 % 2;
                    if (j7 >= j6) {
                        int i53 = i51 & 115;
                        int i54 = i53 + ((i51 ^ 115) | i53);
                        b = i54 % 128;
                        if (i54 % 2 != 0) {
                            jE = G(jE);
                            int i55 = 69 / 0;
                        } else {
                            jE = G(jE);
                        }
                        int i56 = a;
                        int i57 = i56 & 41;
                        int i58 = (i56 ^ 41) | i57;
                        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                        b = i59 % 128;
                        if (i59 % 2 != 0) {
                            int i60 = 2 % 5;
                        }
                    }
                }
            }
            int i61 = b;
            int i62 = ((i61 & 79) - (~(i61 | 79))) - 1;
            a = i62 % 128;
            int i63 = i62 % 2;
            return jE;
        }

        @Override // ivas.gov.bisp.enumeration.cR.l.bFQ, ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final long n(long j, long j2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = ((i2 | 120) << 1) - (i2 ^ 120);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                long j3 = this.f;
                obj.hashCode();
                throw null;
            }
            long j4 = this.f;
            if (j >= j4) {
                if (j2 >= j4) {
                    int i5 = a;
                    int i6 = i5 & 99;
                    int i7 = i6 + ((i5 ^ 99) | i6);
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        return this.e.n(j, j2);
                    }
                    this.e.n(j, j2);
                    obj.hashCode();
                    throw null;
                }
                long jF = F(j);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                int i8 = a;
                int i9 = (((i8 | 90) << 1) - (i8 ^ 90)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                long jN = p.n(jF, j2);
                int i11 = b + 54;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                a = i12 % 128;
                if (i12 % 2 != 0) {
                    return jN;
                }
                obj.hashCode();
                throw null;
            }
            if (j2 >= j4) {
                long jG = G(j);
                ivas.gov.bisp.enumeration.cP.P p2 = this.e;
                int i13 = (-2) - ((b + 70) ^ (-1));
                a = i13 % 128;
                int i14 = i13 % 2;
                long jN2 = p2.n(jG, j2);
                int i15 = b;
                int i16 = (((i15 & (-48)) | ((~i15) & 47)) - (~(-(-((i15 & 47) << 1))))) - 1;
                a = i16 % 128;
                if (i16 % 2 != 0) {
                    return jN2;
                }
                obj.hashCode();
                throw null;
            }
            int i17 = b;
            int i18 = i17 & 3;
            int i19 = (i17 | 3) & (~i18);
            int i20 = i18 << 1;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            a = i21 % 128;
            int i22 = i21 % 2;
            long jN3 = this.d.n(j, j2);
            if (i22 == 0) {
                int i23 = 21 / 0;
            }
            int i24 = a;
            int i25 = (i24 & 9) + (i24 | 9);
            b = i25 % 128;
            int i26 = i25 % 2;
            return jN3;
        }

        public bFR(ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.P p2, ivas.gov.bisp.enumeration.cP.J j, long j2, boolean z) {
            super(p, p2, null, j2, z);
            if (j == null) {
                j = new bFU(this.g, this);
                int i = a;
                int i2 = i & 51;
                int i3 = (((i | 51) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            }
            this.g = j;
            int i5 = a;
            int i6 = i5 & 89;
            int i7 = i6 + ((i5 ^ 89) | i6);
            b = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            if (r9 < r2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r2 = ivas.gov.bisp.enumeration.cR.l.bFR.a + 123;
            ivas.gov.bisp.enumeration.cR.l.bFR.b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            if ((r2 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            r7 = r6.e.l(r7, r9);
            r8 = ivas.gov.bisp.enumeration.cR.l.bFR.a;
            r9 = r8 & 79;
            r8 = r8 | 79;
            r10 = (r9 & r8) + (r8 | r9);
            ivas.gov.bisp.enumeration.cR.l.bFR.b = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            r6.e.l(r7, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            r7 = r6.d.l(F(r7), r9);
            r8 = ivas.gov.bisp.enumeration.cR.l.bFR.b;
            r9 = ((r8 & 14) + (r8 | 14)) - 1;
            ivas.gov.bisp.enumeration.cR.l.bFR.a = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
        
            if ((r9 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r9 >= r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        
            r2 = ivas.gov.bisp.enumeration.cR.l.bFR.a;
            r3 = r2 & 99;
            r2 = -(-((r2 ^ 99) | r3));
            r4 = (r3 ^ r2) + ((r2 & r3) << 1);
            ivas.gov.bisp.enumeration.cR.l.bFR.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if ((r4 % 2) != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        
            return r6.d.l(r7, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            r6.d.l(r7, r9);
            r1.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            r7 = G(r7);
            r2 = r6.e;
            r3 = ivas.gov.bisp.enumeration.cR.l.bFR.a;
            r4 = (((r3 | 116) << 1) - (r3 ^ 116)) - 1;
            ivas.gov.bisp.enumeration.cR.l.bFR.b = r4 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        
            if ((r4 % 2) != 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
        
            return r2.l(r7, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        
            r2.l(r7, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r7 >= r2) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r7 >= r2) goto L9;
         */
        @Override // ivas.gov.bisp.enumeration.cR.l.bFQ, ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int l(long r7, long r9) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = ivas.gov.bisp.enumeration.cR.l.bFR.b
                r2 = r1 & 83
                r1 = r1 | 83
                int r2 = r2 + r1
                int r1 = r2 % 128
                ivas.gov.bisp.enumeration.cR.l.bFR.a = r1
                int r2 = r2 % r0
                r1 = 0
                if (r2 != 0) goto L1c
                long r2 = r6.f
                int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                r5 = 6
                int r5 = r5 / 0
                if (r4 < 0) goto L69
                goto L22
            L1c:
                long r2 = r6.f
                int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r4 < 0) goto L69
            L22:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 < 0) goto L4d
                int r2 = ivas.gov.bisp.enumeration.cR.l.bFR.a
                int r2 = r2 + 123
                int r3 = r2 % 128
                ivas.gov.bisp.enumeration.cR.l.bFR.b = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L47
                ivas.gov.bisp.enumeration.cP.P r1 = r6.e
                int r7 = r1.l(r7, r9)
                int r8 = ivas.gov.bisp.enumeration.cR.l.bFR.a
                r9 = r8 & 79
                r8 = r8 | 79
                r10 = r9 & r8
                r8 = r8 | r9
                int r10 = r10 + r8
                int r8 = r10 % 128
                ivas.gov.bisp.enumeration.cR.l.bFR.b = r8
                int r10 = r10 % r0
                return r7
            L47:
                ivas.gov.bisp.enumeration.cP.P r0 = r6.e
                r0.l(r7, r9)
                throw r1
            L4d:
                long r7 = r6.F(r7)
                ivas.gov.bisp.enumeration.cP.P r2 = r6.d
                int r7 = r2.l(r7, r9)
                int r8 = ivas.gov.bisp.enumeration.cR.l.bFR.b
                r9 = r8 & 14
                r8 = r8 | 14
                int r9 = r9 + r8
                int r9 = r9 + (-1)
                int r8 = r9 % 128
                ivas.gov.bisp.enumeration.cR.l.bFR.a = r8
                int r9 = r9 % r0
                if (r9 == 0) goto L68
                return r7
            L68:
                throw r1
            L69:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 >= 0) goto L93
                int r2 = ivas.gov.bisp.enumeration.cR.l.bFR.a
                r3 = r2 & 99
                r2 = r2 ^ 99
                r2 = r2 | r3
                int r2 = -r2
                int r2 = -r2
                r4 = r3 ^ r2
                r2 = r2 & r3
                int r2 = r2 << 1
                int r4 = r4 + r2
                int r2 = r4 % 128
                ivas.gov.bisp.enumeration.cR.l.bFR.b = r2
                int r4 = r4 % r0
                if (r4 != 0) goto L8a
                ivas.gov.bisp.enumeration.cP.P r0 = r6.d
                int r7 = r0.l(r7, r9)
                return r7
            L8a:
                ivas.gov.bisp.enumeration.cP.P r0 = r6.d
                r0.l(r7, r9)
                r1.hashCode()
                throw r1
            L93:
                long r7 = r6.G(r7)
                ivas.gov.bisp.enumeration.cP.P r2 = r6.e
                int r3 = ivas.gov.bisp.enumeration.cR.l.bFR.a
                r4 = r3 | 116(0x74, float:1.63E-43)
                int r4 = r4 << 1
                r3 = r3 ^ 116(0x74, float:1.63E-43)
                int r4 = r4 - r3
                int r4 = r4 + (-1)
                int r3 = r4 % 128
                ivas.gov.bisp.enumeration.cR.l.bFR.b = r3
                int r4 = r4 % r0
                if (r4 != 0) goto Lb0
                int r7 = r2.l(r7, r9)
                return r7
            Lb0:
                r2.l(r7, r9)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.l.bFR.l(long, long):int");
        }
    }

    public l(ivas.gov.bisp.enumeration.p096p.h hVar, O o2, M m, C0244m c0244m) {
        super(hVar, new Object[]{o2, m, c0244m});
    }

    public static l bz(AbstractC0242a abstractC0242a, R r, int i) {
        C0244m c0244mY;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = ((i3 | 56) << 1) - (i3 ^ 56);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        AbstractC0242a abstractC0242aD = ivas.gov.bisp.enumeration.cP.u.d(abstractC0242a);
        Object obj = null;
        if (r == null) {
            int i7 = b;
            int i8 = i7 + 22;
            int i9 = (i8 ^ (-1)) + (i8 << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            c0244mY = P;
            if (i10 == 0) {
                int i11 = 3 / 0;
            }
            int i12 = ((i7 & 108) + (i7 | 108)) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
        } else {
            c0244mY = r.y();
            ivas.gov.bisp.enumeration.cP.O o2 = new ivas.gov.bisp.enumeration.cP.O(c0244mY.c, M.bA(abstractC0242aD));
            int i14 = a;
            int i15 = (-2) - (((i14 ^ 82) + ((i14 & 82) << 1)) ^ (-1));
            b = i15 % 128;
            if (i15 % 2 != 0) {
                o2.e.bd();
                long j = o2.d;
                throw null;
            }
            ivas.gov.bisp.enumeration.cP.P pBd = o2.e.bd();
            long j2 = o2.d;
            int i16 = a + 33;
            b = i16 % 128;
            if (i16 % 2 != 0) {
                pBd.f(j2);
                throw null;
            }
            if (pBd.f(j2) <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        u uVar = new u(abstractC0242aD, c0244mY, i);
        int i17 = a;
        int i18 = i17 & 13;
        int i19 = (i18 - (~((i17 ^ 13) | i18))) - 1;
        b = i19 % 128;
        if (i19 % 2 != 0) {
            Q.get(uVar);
            throw null;
        }
        ConcurrentHashMap<u, l> concurrentHashMap = Q;
        l lVar = concurrentHashMap.get(uVar);
        if (lVar == null) {
            int i20 = b + 25;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                AbstractC0242a abstractC0242a2 = AbstractC0242a.c;
                obj.hashCode();
                throw null;
            }
            AbstractC0242a abstractC0242a3 = AbstractC0242a.c;
            if (abstractC0242aD == abstractC0242a3) {
                l lVar2 = new l(O.cc(abstractC0242aD, i), M.cc(abstractC0242aD, i), c0244mY);
                int i21 = b;
                int i22 = (i21 & 11) + (i21 | 11);
                int i23 = i22 % 128;
                a = i23;
                int i24 = i22 % 2;
                int i25 = (-2) - ((i23 + 48) ^ (-1));
                b = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 5 / 5;
                }
                lVar = lVar2;
            } else {
                l lVarBz = bz(abstractC0242a3, c0244mY, i);
                l lVar3 = new l(T.by(lVarBz, abstractC0242aD), lVarBz.S, lVarBz.R, lVarBz.U);
                int i27 = b;
                int i28 = i27 + 95;
                a = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i27 + 96;
                int i31 = (i30 ^ (-1)) + (i30 << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                lVar = lVar3;
            }
            l lVarPutIfAbsent = concurrentHashMap.putIfAbsent(uVar, lVar);
            if (lVarPutIfAbsent != null) {
                int i33 = b;
                int i34 = ((i33 & (-60)) | ((~i33) & 59)) + ((i33 & 59) << 1);
                a = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 78 / 0;
                }
                lVar = lVarPutIfAbsent;
            }
        }
        int i36 = b;
        int i37 = ((i36 ^ 71) - (~((i36 & 71) << 1))) - 1;
        a = i37 % 128;
        if (i37 % 2 != 0) {
            return lVar;
        }
        throw null;
    }

    public final String toString() {
        ivas.gov.bisp.enumeration.p096p.h hVarBa;
        ivas.gov.bisp.enumeration.cJ.c cVar;
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer(60);
        int i2 = a;
        int i3 = ((i2 ^ 47) | (i2 & 47)) << 1;
        int i4 = -(((~i2) & 47) | (i2 & (-48)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        AbstractC0242a abstractC0242aAp = ap();
        int i7 = b;
        int i8 = ((i7 & (-108)) | ((~i7) & 107)) + ((i7 & 107) << 1);
        a = i8 % 128;
        int i9 = i8 % 2;
        stringBuffer.append(abstractC0242aAp.g);
        long j = this.T;
        int i10 = a;
        int i11 = i10 & 25;
        int i12 = ((i10 ^ 25) | i11) << 1;
        int i13 = -((~i11) & (i10 | 25));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (j != -12219292800000L) {
            int i15 = ((i10 ^ 19) | (i10 & 19)) << 1;
            int i16 = -((i10 & (-20)) | ((~i10) & 19));
            int i17 = (i15 & i16) + (i15 | i16);
            b = i17 % 128;
            if (i17 % 2 != 0) {
                stringBuffer.append(",cutover=");
                hVarBa = ba();
                int i18 = 36 / 0;
            } else {
                stringBuffer.append(",cutover=");
                hVarBa = ba();
            }
            long jT = ((AbstractC0248j) hVarBa).E.t(this.T);
            int i19 = b;
            int i20 = i19 & 113;
            int i21 = (~i20) & (i19 | 113);
            int i22 = i20 << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            a = i23 % 128;
            int i24 = i23 % 2;
            if (jT == 0) {
                int i25 = ((i19 | 77) << 1) - ((i19 & (-78)) | ((~i19) & 77));
                a = i25 % 128;
                int i26 = i25 % 2;
                cVar = ivas.gov.bisp.enumeration.cJ.P.q;
                int i27 = b;
                int i28 = (i27 | 121) << 1;
                int i29 = -(i27 ^ 121);
                int i30 = (i28 & i29) + (i29 | i28);
                a = i30 % 128;
                int i31 = i30 % 2;
            } else {
                cVar = ivas.gov.bisp.enumeration.cJ.P.G;
                int i32 = a;
                int i33 = ((i32 ^ 32) + ((i32 & 32) << 1)) - 1;
                b = i33 % 128;
                int i34 = i33 % 2;
            }
            ivas.gov.bisp.enumeration.cJ.c cVarJ = cVar.j(ba());
            long j2 = this.T;
            int i35 = a;
            int i36 = i35 & 113;
            int i37 = ((((i35 ^ 113) | i36) << 1) - (~(-((i35 | 113) & (~i36))))) - 1;
            b = i37 % 128;
            try {
                if (i37 % 2 != 0) {
                    cVarJ.g(stringBuffer, j2, null);
                    int i38 = 57 / 0;
                } else {
                    cVarJ.g(stringBuffer, j2, null);
                }
                int i39 = b;
                int i40 = (((i39 | 96) << 1) - (i39 ^ 96)) - 1;
                a = i40 % 128;
                int i41 = i40 % 2;
            } catch (IOException unused) {
            }
        }
        if (this.R.ag != 4) {
            int i42 = b;
            int i43 = ((i42 | 15) << 1) - (i42 ^ 15);
            a = i43 % 128;
            int i44 = i43 % 2;
            stringBuffer.append(",mdfw=");
            int i45 = this.R.ag;
            int i46 = a + 111;
            b = i46 % 128;
            int i47 = i46 % 2;
            stringBuffer.append(i45);
            int i48 = b;
            int i49 = i48 & 49;
            int i50 = (i48 ^ 49) | i49;
            int i51 = (i49 & i50) + (i50 | i49);
            a = i51 % 128;
            int i52 = i51 % 2;
        }
        stringBuffer.append(']');
        String string = stringBuffer.toString();
        int i53 = a;
        int i54 = (i53 & 18) + (i53 | 18);
        int i55 = (i54 ^ (-1)) + (i54 << 1);
        b = i55 % 128;
        int i56 = i55 % 2;
        return string;
    }

    public static long by(long j, ivas.gov.bisp.enumeration.p096p.h hVar, ivas.gov.bisp.enumeration.p096p.h hVar2) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-104)) | ((~i2) & 103);
        int i4 = (i2 & 103) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            ((AbstractC0248j) hVar).G.f(j);
            obj.hashCode();
            throw null;
        }
        int iF = ((AbstractC0248j) hVar).G.f(j);
        AbstractC0248j abstractC0248j = (AbstractC0248j) hVar;
        int iF2 = abstractC0248j.J.f(j);
        int i6 = b;
        int i7 = (i6 & 93) + (i6 | 93);
        a = i7 % 128;
        int i8 = i7 % 2;
        int iF3 = abstractC0248j.C.f(j);
        int i9 = b;
        int i10 = ((((i9 ^ 59) | (i9 & 59)) << 1) - (~(-(((~i9) & 59) | (i9 & (-60)))))) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        int iF4 = abstractC0248j.r.f(j);
        int i12 = a + 102;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        b = i13 % 128;
        int i14 = i13 % 2;
        long jAa = hVar2.aa(iF, iF2, iF3, iF4);
        int i15 = a;
        int i16 = ((i15 & (-4)) | ((~i15) & 3)) + ((i15 & 3) << 1);
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return jAa;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = ap().hashCode();
        int i5 = this.R.ag;
        int i6 = b;
        int i7 = i6 & 65;
        int i8 = (i6 ^ 65) | i7;
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        int iHashCode2 = this.U.hashCode();
        int i11 = i10 == 0 ? iHashCode % 29321 : (((iHashCode | 25025) << 1) - (~(-(iHashCode ^ 25025)))) - 1;
        int i12 = -(-i5);
        int i13 = -(-(((i11 | i12) << 1) - (i11 ^ i12)));
        int i14 = iHashCode2 & i13;
        int i15 = -(-(i13 | iHashCode2));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = b;
        int i18 = i17 & 105;
        int i19 = i18 + ((i17 ^ 105) | i18);
        a = i19 % 128;
        int i20 = i19 % 2;
        return i16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r1 < r7.T) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        if (r1 < r7.T) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        throw new java.lang.IllegalArgumentException("Specified date does not exist");
     */
    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long aa(int r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.l.a
            r2 = r1 ^ 47
            r1 = r1 & 47
            r1 = r1 | r2
            int r1 = r1 << 1
            int r2 = -r2
            r3 = r1 | r2
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cR.l.b = r1
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.p.h r1 = r7.e
            if (r1 == 0) goto L41
            int r2 = ivas.gov.bisp.enumeration.cR.l.b
            r3 = r2 & 37
            r2 = r2 | 37
            int r3 = r3 + r2
            int r2 = r3 % 128
            ivas.gov.bisp.enumeration.cR.l.a = r2
            int r3 = r3 % r0
            long r8 = r1.aa(r8, r9, r10, r11)
            int r10 = ivas.gov.bisp.enumeration.cR.l.b
            r11 = r10 & 7
            r10 = r10 ^ 7
            r10 = r10 | r11
            r1 = r11 & r10
            r10 = r10 | r11
            int r1 = r1 + r10
            int r10 = r1 % 128
            ivas.gov.bisp.enumeration.cR.l.a = r10
            int r1 = r1 % r0
            if (r1 == 0) goto L3f
            return r8
        L3f:
            r8 = 0
            throw r8
        L41:
            ivas.gov.bisp.enumeration.cR.M r1 = r7.R
            long r1 = r1.aa(r8, r9, r10, r11)
            int r3 = ivas.gov.bisp.enumeration.cR.l.a
            r4 = r3 ^ 109(0x6d, float:1.53E-43)
            r5 = r3 & 109(0x6d, float:1.53E-43)
            r4 = r4 | r5
            int r4 = r4 << 1
            int r5 = ~r5
            r6 = r3 | 109(0x6d, float:1.53E-43)
            r5 = r5 & r6
            int r4 = r4 - r5
            int r5 = r4 % 128
            ivas.gov.bisp.enumeration.cR.l.b = r5
            int r4 = r4 % r0
            long r4 = r7.T
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lb6
            r1 = r3 & 73
            int r2 = ~r1
            r3 = r3 | 73
            r2 = r2 & r3
            int r1 = r1 << 1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cR.l.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L7e
            ivas.gov.bisp.enumeration.cR.O r1 = r7.S
            long r8 = r1.aa(r8, r9, r10, r11)
            r10 = 36
            int r10 = r10 / 0
            goto L84
        L7e:
            ivas.gov.bisp.enumeration.cR.O r1 = r7.S
            long r8 = r1.aa(r8, r9, r10, r11)
        L84:
            r1 = r8
            int r8 = ivas.gov.bisp.enumeration.cR.l.b
            r9 = r8 ^ 13
            r10 = r8 & 13
            r9 = r9 | r10
            int r9 = r9 << 1
            int r10 = ~r10
            r8 = r8 | 13
            r8 = r8 & r10
            int r8 = -r8
            int r8 = ~r8
            int r9 = r9 - r8
            int r9 = r9 + (-1)
            int r8 = r9 % 128
            ivas.gov.bisp.enumeration.cR.l.a = r8
            int r9 = r9 % r0
            if (r9 != 0) goto La7
            long r8 = r7.T
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            int r9 = r0 / 0
            if (r8 >= 0) goto Lae
            goto Lb6
        La7:
            long r8 = r7.T
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto Lae
            goto Lb6
        Lae:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Specified date does not exist"
            r8.<init>(r9)
            throw r8
        Lb6:
            int r8 = ivas.gov.bisp.enumeration.cR.l.b
            r9 = r8 & 123(0x7b, float:1.72E-43)
            int r10 = ~r9
            r8 = r8 | 123(0x7b, float:1.72E-43)
            r8 = r8 & r10
            int r9 = r9 << 1
            int r8 = r8 + r9
            int r9 = r8 % 128
            ivas.gov.bisp.enumeration.cR.l.a = r9
            int r8 = r8 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.l.aa(int, int, int, int):long");
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h be(AbstractC0242a abstractC0242a) {
        int i = 2 % 2;
        int i2 = b + 109;
        int i3 = i2 % 128;
        a = i3;
        int i4 = i2 % 2;
        if (abstractC0242a == null) {
            int i5 = (i3 ^ 59) + ((i3 & 59) << 1);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                abstractC0242a = AbstractC0242a.f();
                int i6 = 20 / 0;
            } else {
                abstractC0242a = AbstractC0242a.f();
            }
            int i7 = a;
            int i8 = ((i7 | 93) << 1) - (i7 ^ 93);
            b = i8 % 128;
            int i9 = i8 % 2;
        }
        if (abstractC0242a == ap()) {
            int i10 = b;
            int i11 = (i10 ^ 125) + ((i10 & 125) << 1);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 57 / 0;
            }
            return this;
        }
        C0244m c0244m = this.U;
        int i13 = this.R.ag;
        int i14 = a;
        int i15 = (i14 ^ 77) + ((i14 & 77) << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        l lVarBz = bz(abstractC0242a, c0244m, i13);
        int i17 = b;
        int i18 = i17 & 123;
        int i19 = ((i17 ^ 123) | i18) << 1;
        int i20 = -((i17 | 123) & (~i18));
        int i21 = (i19 & i20) + (i20 | i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        return lVarBz;
    }

    public static long bA(long j, ivas.gov.bisp.enumeration.p096p.h hVar, ivas.gov.bisp.enumeration.p096p.h hVar2) {
        int i = 2 % 2;
        int i2 = a + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        AbstractC0248j abstractC0248j = (AbstractC0248j) hVar2;
        ivas.gov.bisp.enumeration.cP.P p = abstractC0248j.H;
        ivas.gov.bisp.enumeration.cP.P p2 = ((AbstractC0248j) hVar).H;
        int i4 = a;
        int i5 = i4 & 111;
        int i6 = (((i4 | 111) & (~i5)) - (~(i5 << 1))) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        long jA = p.A(0L, p2.f(j));
        int i8 = a + 41;
        b = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            ivas.gov.bisp.enumeration.cP.P p3 = abstractC0248j.F;
            throw null;
        }
        AbstractC0248j abstractC0248j2 = (AbstractC0248j) hVar2;
        ivas.gov.bisp.enumeration.cP.P p4 = abstractC0248j2.F;
        AbstractC0248j abstractC0248j3 = (AbstractC0248j) hVar;
        int iF = abstractC0248j3.F.f(j);
        int i9 = a + 37;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            p4.A(jA, iF);
            ivas.gov.bisp.enumeration.cP.P p5 = abstractC0248j2.D;
            ivas.gov.bisp.enumeration.cP.P p6 = abstractC0248j3.D;
            obj.hashCode();
            throw null;
        }
        long jA2 = p4.A(jA, iF);
        ivas.gov.bisp.enumeration.cP.P p7 = abstractC0248j2.D;
        ivas.gov.bisp.enumeration.cP.P p8 = abstractC0248j3.D;
        int i10 = b;
        int i11 = (i10 & 113) + (i10 | 113);
        a = i11 % 128;
        int i12 = i11 % 2;
        long jA3 = p7.A(jA2, p8.f(j));
        int i13 = b;
        int i14 = i13 & 45;
        int i15 = i14 + ((i13 ^ 45) | i14);
        a = i15 % 128;
        int i16 = i15 % 2;
        ivas.gov.bisp.enumeration.cP.P p9 = abstractC0248j2.r;
        ivas.gov.bisp.enumeration.cP.P p10 = abstractC0248j3.r;
        int i17 = a;
        int i18 = (((i17 | 86) << 1) - (i17 ^ 86)) - 1;
        b = i18 % 128;
        int i19 = i18 % 2;
        long jA4 = p9.A(jA3, p10.f(j));
        int i20 = a;
        int i21 = i20 & 27;
        int i22 = -(-((i20 ^ 27) | i21));
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        b = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 34 / 0;
        }
        return jA4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ivas.gov.bisp.enumeration.o00OO0o0.o00O0O */
    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final long ae(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws o00O0O {
        long jAe;
        int i8 = 2 % 2;
        int i9 = a;
        int i10 = (-2) - ((((i9 | 80) << 1) - (i9 ^ 80)) ^ (-1));
        b = i10 % 128;
        int i11 = i10 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        if (hVar != null) {
            int i12 = b + 71;
            a = i12 % 128;
            int i13 = i12 % 2;
            long jAe2 = hVar.ae(i, i2, i3, i4, i5, i6, i7);
            int i14 = a + 117;
            b = i14 % 128;
            if (i14 % 2 == 0) {
                return jAe2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        try {
            M m = this.R;
            int i15 = a;
            int i16 = i15 & 55;
            int i17 = i16 + ((i15 ^ 55) | i16);
            b = i17 % 128;
            int i18 = i17 % 2;
            long jAe3 = m.ae(i, i2, i3, i4, i5, i6, i7);
            int i19 = b;
            int i20 = (i19 ^ 53) + ((i19 & 53) << 1);
            int i21 = i20 % 128;
            a = i21;
            int i22 = i20 % 2;
            int i23 = ((i21 ^ 69) | (i21 & 69)) << 1;
            int i24 = -(((~i21) & 69) | (i21 & (-70)));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            b = i25 % 128;
            int i26 = i25 % 2;
            jAe = jAe3;
        } catch (o00O0O e) {
            if (i2 != 2 || i3 != 29) {
                throw e;
            }
            int i27 = a;
            int i28 = i27 + 73;
            b = i28 % 128;
            int i29 = i28 % 2;
            M m2 = this.R;
            int i30 = i27 & 1;
            int i31 = i30 + ((i27 ^ 1) | i30);
            b = i31 % 128;
            int i32 = i31 % 2;
            jAe = m2.ae(i, i2, 28, i4, i5, i6, i7);
            if (jAe >= this.T) {
                throw e;
            }
        }
        if (jAe < this.T) {
            int i33 = a;
            int i34 = (((i33 | 30) << 1) - (i33 ^ 30)) - 1;
            b = i34 % 128;
            int i35 = i34 % 2;
            jAe = this.S.ae(i, i2, i3, i4, i5, i6, i7);
            int i36 = b;
            int i37 = i36 & 55;
            int i38 = -(-(i36 | 55));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            a = i39 % 128;
            int i40 = i39 % 2;
            if (jAe >= this.T) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        int i41 = a;
        int i42 = i41 & 89;
        int i43 = ((i41 ^ 89) | i42) << 1;
        int i44 = -((i41 | 89) & (~i42));
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        b = i45 % 128;
        int i46 = i45 % 2;
        return jAe;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0106  */
    /* JADX WARN: Code duplicated, block: B:27:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x01c4  */
    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        O o2;
        Object obj;
        bFQ bfq;
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 & (-58)) | ((~i3) & 57);
        int i5 = -(-((i3 & 57) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = (Object[]) this.f;
        Object obj2 = objArr[0];
        int i8 = b;
        int i9 = i8 & 9;
        int i10 = ((i8 ^ 9) | i9) << 1;
        int i11 = -((i8 | 9) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        int i13 = i12 % 128;
        a = i13;
        if (i12 % 2 == 0) {
            o2 = (O) obj2;
            obj = objArr[1];
        } else {
            o2 = (O) obj2;
            obj = objArr[1];
        }
        M m = (M) obj;
        O o3 = o2;
        int i14 = ((i13 ^ 51) | (i13 & 51)) << 1;
        int i15 = -((i13 & (-52)) | ((~i13) & 51));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        b = i16 % 128;
        int i17 = i16 % 2;
        C0244m c0244m = (C0244m) objArr[2];
        int i18 = (i13 | 71) << 1;
        int i19 = -(i13 ^ 71);
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        b = i20 % 128;
        Object obj3 = null;
        if (i20 % 2 != 0) {
            this.T = c0244m.c;
            obj3.hashCode();
            throw null;
        }
        long j = c0244m.c;
        this.T = j;
        this.S = o3;
        this.R = m;
        int i21 = a + 111;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            this.U = c0244m;
            ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
            throw null;
        }
        this.U = c0244m;
        if (this.e != null) {
            int i22 = b;
            int i23 = i22 & 75;
            int i24 = -(-((i22 ^ 75) | i23));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            a = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (o3.ag != m.ag) {
            throw new IllegalArgumentException();
        }
        int i26 = a;
        int i27 = i26 ^ 93;
        int i28 = -(-((i26 & 93) << 1));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        b = i29 % 128;
        int i30 = i29 % 2;
        long jBy = by(j, o3, m);
        int i31 = a;
        int i32 = i31 & 31;
        int i33 = -(-(i31 | 31));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        b = i34 % 128;
        int i35 = i34 % 2;
        this.V = j - jBy;
        bfa.e(m);
        ivas.gov.bisp.enumeration.cP.P p = m.r;
        int i36 = (-2) - ((a + 86) ^ (-1));
        b = i36 % 128;
        if (i36 % 2 != 0) {
            int i37 = 92 / 0;
            if (p.f(this.T) == 0) {
                bfa.p = new bFQ(this, o3.s, bfa.p, this.T);
                bfa.f83o = new bFQ(this, o3.r, bfa.f83o, this.T);
                bfa.q = new bFQ(this, o3.t, bfa.q, this.T);
                bfa.r = new bFQ(this, o3.w, bfa.r, this.T);
                bfa.t = new bFQ(this, o3.v, bfa.t, this.T);
                bfa.s = new bFQ(this, o3.x, bfa.s, this.T);
                bfa.u = new bFQ(this, o3.y, bfa.u, this.T);
                bfa.w = new bFQ(this, o3.A, bfa.w, this.T);
                bfa.x = new bFQ(this, o3.u, bfa.x, this.T);
                bfa.y = new bFQ(this, o3.z, bfa.y, this.T);
                bfq = new bFQ(this, o3.B, bfa.z, this.T);
                int i38 = a;
                int i39 = i38 & 69;
                int i40 = (i38 | 69) & (~i39);
                int i41 = i39 << 1;
                i = ((i40 | i41) << 1) - (i40 ^ i41);
                b = i % 128;
                if (i % 2 == 0) {
                    bfa.z = bfq;
                    throw null;
                }
                bfa.z = bfq;
            }
        } else if (p.f(this.T) == 0) {
            bfa.p = new bFQ(this, o3.s, bfa.p, this.T);
            bfa.f83o = new bFQ(this, o3.r, bfa.f83o, this.T);
            bfa.q = new bFQ(this, o3.t, bfa.q, this.T);
            bfa.r = new bFQ(this, o3.w, bfa.r, this.T);
            bfa.t = new bFQ(this, o3.v, bfa.t, this.T);
            bfa.s = new bFQ(this, o3.x, bfa.s, this.T);
            bfa.u = new bFQ(this, o3.y, bfa.u, this.T);
            bfa.w = new bFQ(this, o3.A, bfa.w, this.T);
            bfa.x = new bFQ(this, o3.u, bfa.x, this.T);
            bfa.y = new bFQ(this, o3.z, bfa.y, this.T);
            bfq = new bFQ(this, o3.B, bfa.z, this.T);
            int i310 = a;
            int i311 = i310 & 69;
            int i42 = (i310 | 69) & (~i311);
            int i43 = i311 << 1;
            i = ((i42 | i43) << 1) - (i42 ^ i43);
            b = i % 128;
            if (i % 2 == 0) {
                bfa.z = bfq;
                throw null;
            }
            bfa.z = bfq;
        }
        bfa.H = new bFQ(this, o3.M, bfa.H, this.T);
        bFR bfr = new bFR(o3.G, bfa.G, (ivas.gov.bisp.enumeration.cP.J) null, this.T, false);
        bfa.G = bfr;
        ivas.gov.bisp.enumeration.cP.J j2 = bfr.g;
        bfa.l = j2;
        bfa.I = new bFR(o3.K, bfa.I, j2, this.T, false);
        bFR bfr2 = new bFR(o3.N, bfa.K, (ivas.gov.bisp.enumeration.cP.J) null, this.T, false);
        bfa.K = bfr2;
        ivas.gov.bisp.enumeration.cP.J j3 = bfr2.g;
        bfa.m = j3;
        bfa.J = new bFR(this, o3.L, bfa.J, bfa.l, j3, this.T);
        bFR bfr3 = new bFR(this, o3.J, bfa.F, (ivas.gov.bisp.enumeration.cP.J) null, bfa.l, this.T);
        bfa.F = bfr3;
        bfa.c = bfr3.g;
        bFR bfr4 = new bFR(o3.H, bfa.E, (ivas.gov.bisp.enumeration.cP.J) null, this.T, true);
        bfa.E = bfr4;
        ivas.gov.bisp.enumeration.cP.J j4 = bfr4.g;
        bfa.k = j4;
        bfa.D = new bFR(this, o3.I, bfa.D, j4, bfa.m, this.T);
        bfa.A = new bFQ(o3.E, bfa.A, bfa.l, m.G.z(this.T), false);
        bfa.C = new bFQ(o3.F, bfa.C, bfa.k, m.H.z(this.T), true);
        bFQ bfq2 = new bFQ(this, o3.C, bfa.B, this.T);
        bfq2.i = bfa.c;
        bfa.B = bfq2;
        int i44 = b;
        int i45 = (i44 | 9) << 1;
        int i46 = -(((~i44) & 9) | (i44 & (-10)));
        int i47 = (i45 & i46) + (i46 | i45);
        a = i47 % 128;
        if (i47 % 2 == 0) {
            int i48 = 41 / 0;
        }
    }
}
