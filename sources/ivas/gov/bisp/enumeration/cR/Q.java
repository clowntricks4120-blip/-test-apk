package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0248j {
    private static int a = 0;
    private static int b = 1;
    public final ivas.gov.bisp.enumeration.cP.z P;
    public final ivas.gov.bisp.enumeration.cP.z Q;
    public transient Q R;

    public class bGe extends ivas.gov.bisp.enumeration.cS.h {
        private static int a = 1;
        private static int b;
        public final ivas.gov.bisp.enumeration.cP.J e;
        public final ivas.gov.bisp.enumeration.cP.J f;
        public final ivas.gov.bisp.enumeration.cP.J h;

        public bGe(ivas.gov.bisp.enumeration.cP.P p, ivas.gov.bisp.enumeration.cP.J j, ivas.gov.bisp.enumeration.cP.J j2, ivas.gov.bisp.enumeration.cP.J j3) {
            super(p, p.v());
            this.e = j;
            this.f = j2;
            this.h = j3;
        }

        @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
        public final ivas.gov.bisp.enumeration.cP.J m() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 93) + (i2 | 93);
            a = i3 % 128;
            int i4 = i3 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.e;
            int i5 = i2 + 31;
            a = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public final ivas.gov.bisp.enumeration.cP.J o() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 113;
            int i4 = (((~i3) & (i2 | 113)) - (~(-(-(i3 << 1))))) - 1;
            a = i4 % 128;
            int i5 = i4 % 2;
            ivas.gov.bisp.enumeration.cP.J j = this.h;
            int i6 = i2 & 41;
            int i7 = (i6 - (~((i2 ^ 41) | i6))) - 1;
            a = i7 % 128;
            int i8 = i7 % 2;
            return j;
        }

        @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
        public final ivas.gov.bisp.enumeration.cP.J s() {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-28)) | ((~i2) & 27);
            int i4 = -(-((i2 & 27) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            int i6 = i5 % 128;
            a = i6;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            ivas.gov.bisp.enumeration.cP.J j = this.f;
            int i7 = i6 & 57;
            int i8 = ((i6 | 57) & (~i7)) + (i7 << 1);
            b = i8 % 128;
            if (i8 % 2 == 0) {
                return j;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long z(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 ^ 114) + ((i2 & 114) << 1)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i5 = b + 73;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                p.z(j);
                throw null;
            }
            long jZ = p.z(j);
            Q.this.bH(jZ, "resulting");
            int i6 = b;
            int i7 = i6 & 115;
            int i8 = (i6 ^ 115) | i7;
            int i9 = (i7 & i8) + (i8 | i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            return jZ;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String h(long j, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 39;
            int i4 = ((((i2 ^ 39) | i3) << 1) - (~(-((i2 | 39) & (~i3))))) - 1;
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                Q.this.bH(j, null);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                obj.hashCode();
                throw null;
            }
            Q.this.bH(j, null);
            String strH = this.d.h(j, locale);
            int i5 = a;
            int i6 = (i5 & 72) + (i5 | 72);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            b = i7 % 128;
            if (i7 % 2 == 0) {
                return strH;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public int l(long j, long j2) {
            int i = 2 % 2;
            int i2 = a + 55;
            b = i2 % 128;
            int i3 = i2 % 2;
            Q.this.bH(j, "minuend");
            Q q = Q.this;
            int i4 = b;
            int i5 = i4 & 23;
            int i6 = i4 | 23;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                q.bH(j2, "subtrahend");
                this.d.l(j, j2);
                obj.hashCode();
                throw null;
            }
            q.bH(j2, "subtrahend");
            int iL = this.d.l(j, j2);
            int i8 = a;
            int i9 = (i8 ^ 62) + ((i8 & 62) << 1);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                return iL;
            }
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public int p(Locale locale) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 105;
            int i4 = ((i2 ^ 105) | i3) << 1;
            int i5 = -((i2 | 105) & (~i3));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return this.d.p(locale);
            }
            int i7 = 41 / 0;
            return this.d.p(locale);
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long C(long j, String str, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = ((i2 & 14) + (i2 | 14)) - 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i5 = a;
            int i6 = i5 ^ 125;
            int i7 = ((i5 & 125) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            b = i9 % 128;
            int i10 = i9 % 2;
            long jC = p.C(j, str, locale);
            Q q = Q.this;
            int i11 = b;
            int i12 = (-2) - ((((i11 | 116) << 1) - (i11 ^ 116)) ^ (-1));
            a = i12 % 128;
            if (i12 % 2 != 0) {
                q.bH(jC, "resulting");
                return jC;
            }
            q.bH(jC, "resulting");
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String c(long j, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (-2) - (((i2 & 20) + (i2 | 20)) ^ (-1));
            a = i3 % 128;
            int i4 = i3 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i5 = b + 51;
            a = i5 % 128;
            int i6 = i5 % 2;
            String strC = p.c(j, locale);
            int i7 = a;
            int i8 = i7 & 97;
            int i9 = (i7 ^ 97) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            return strC;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long e(long j, long j2) {
            int i = 2 % 2;
            int i2 = a + 67;
            b = i2 % 128;
            int i3 = i2 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i4 = b;
            int i5 = i4 & 123;
            int i6 = (((i4 | 123) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            long jE = p.e(j, j2);
            Q.this.bH(jE, "resulting");
            int i8 = b;
            int i9 = (i8 ^ 111) + ((i8 & 111) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            return jE;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public int f(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & 32) + (i2 | 32);
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                Q.this.bH(j, null);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                obj.hashCode();
                throw null;
            }
            Q.this.bH(j, null);
            int iF = this.d.f(j);
            int i5 = a;
            int i6 = i5 ^ 65;
            int i7 = ((i5 & 65) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 77 / 0;
            }
            return iF;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long t(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 98) << 1) - (i2 ^ 98)) - 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i5 = a;
            int i6 = i5 ^ 45;
            int i7 = ((i5 & 45) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            b = i9 % 128;
            int i10 = i9 % 2;
            long jT = p.t(j);
            Q.this.bH(jT, "resulting");
            int i11 = b;
            int i12 = (((i11 & (-2)) | ((~i11) & 1)) - (~((i11 & 1) << 1))) - 1;
            a = i12 % 128;
            if (i12 % 2 != 0) {
                return jT;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public boolean u(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = (((i2 | 126) << 1) - (i2 ^ 126)) - 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Q.this.bH(j, null);
                ivas.gov.bisp.enumeration.cP.P p = this.d;
                obj.hashCode();
                throw null;
            }
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p2 = this.d;
            int i4 = b;
            int i5 = ((i4 ^ 118) + ((i4 & 118) << 1)) - 1;
            a = i5 % 128;
            if (i5 % 2 != 0) {
                return p2.u(j);
            }
            p2.u(j);
            obj.hashCode();
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cP.P
        public long y(long j) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 59;
            int i4 = i3 + ((i2 ^ 59) | i3);
            b = i4 % 128;
            int i5 = i4 % 2;
            Q.this.bH(j, null);
            long jY = this.d.y(j);
            int i6 = b;
            int i7 = ((i6 ^ 29) | (i6 & 29)) << 1;
            int i8 = -(((~i6) & 29) | (i6 & (-30)));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            a = i9 % 128;
            int i10 = i9 % 2;
            Q.this.bH(jY, "resulting");
            int i11 = a;
            int i12 = i11 & 95;
            int i13 = (i12 - (~(-(-((i11 ^ 95) | i12))))) - 1;
            b = i13 % 128;
            int i14 = i13 % 2;
            return jY;
        }

        @Override // ivas.gov.bisp.enumeration.cS.h, ivas.gov.bisp.enumeration.cP.P
        public long A(long j, int i) {
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 51;
            int i5 = (i3 | 51) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            a = i7 % 128;
            int i8 = i7 % 2;
            Object obj = null;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i9 = a;
            int i10 = (i9 | 105) << 1;
            int i11 = -(((~i9) & 105) | (i9 & (-106)));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
            long jA = p.A(j, i);
            Q q = Q.this;
            int i14 = b;
            int i15 = i14 & 3;
            int i16 = (i14 | 3) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            a = i18 % 128;
            int i19 = i18 % 2;
            q.bH(jA, "resulting");
            if (i19 == 0) {
                obj.hashCode();
                throw null;
            }
            int i20 = b + 125;
            a = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 49 / 0;
            }
            return jA;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long d(long j, int i) {
            int i2 = 2 % 2;
            int i3 = a;
            int i4 = ((i3 ^ 69) | (i3 & 69)) << 1;
            int i5 = -(((~i3) & 69) | (i3 & (-70)));
            int i6 = (i4 & i5) + (i5 | i4);
            b = i6 % 128;
            int i7 = i6 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.P p = this.d;
            int i8 = a;
            int i9 = (-2) - (((i8 & 90) + (i8 | 90)) ^ (-1));
            b = i9 % 128;
            int i10 = i9 % 2;
            long jD = p.d(j, i);
            Q q = Q.this;
            int i11 = b;
            int i12 = (((i11 | 16) << 1) - (i11 ^ 16)) - 1;
            a = i12 % 128;
            int i13 = i12 % 2;
            q.bH(jD, "resulting");
            if (i13 == 0) {
                int i14 = 28 / 0;
            }
            int i15 = a;
            int i16 = ((i15 & 98) + (i15 | 98)) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
            return jD;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long n(long j, long j2) {
            long jN;
            int i = 2 % 2;
            int i2 = a + 1;
            b = i2 % 128;
            int i3 = i2 % 2;
            Q.this.bH(j, "minuend");
            Q q = Q.this;
            int i4 = a;
            int i5 = (((i4 | 18) << 1) - (i4 ^ 18)) - 1;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                q.bH(j2, "subtrahend");
                jN = this.d.n(j, j2);
                int i6 = 3 / 0;
            } else {
                q.bH(j2, "subtrahend");
                jN = this.d.n(j, j2);
            }
            int i7 = b;
            int i8 = (-2) - ((((i7 | 126) << 1) - (i7 ^ 126)) ^ (-1));
            a = i8 % 128;
            int i9 = i8 % 2;
            return jN;
        }
    }

    public class bGf extends ivas.gov.bisp.enumeration.cS.r {
        private static int a = 1;
        private static int b;

        public bGf(ivas.gov.bisp.enumeration.cP.J j) {
            super(j, j.g());
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long d(long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = (i2 & (-94)) | ((~i2) & 93);
            int i4 = (i2 & 93) << 1;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                Q.this.bH(j, null);
                ivas.gov.bisp.enumeration.cP.J j3 = this.d;
                obj.hashCode();
                throw null;
            }
            Q.this.bH(j, null);
            long jD = this.d.d(j, j2);
            Q q = Q.this;
            int i6 = b;
            int i7 = i6 & 89;
            int i8 = (i6 ^ 89) | i7;
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            q.bH(jD, "resulting");
            if (i10 == 0) {
                int i11 = 72 / 0;
            }
            int i12 = b;
            int i13 = i12 & 105;
            int i14 = ((i12 | 105) & (~i13)) + (i13 << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            return jD;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long f(long j, long j2) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 ^ 61;
            int i4 = (((i2 & 61) | i3) << 1) - i3;
            a = i4 % 128;
            if (i4 % 2 == 0) {
                Q.this.bH(j, "minuend");
                throw null;
            }
            Q.this.bH(j, "minuend");
            Q.this.bH(j2, "subtrahend");
            long jF = this.d.f(j, j2);
            int i5 = a + 4;
            int i6 = (i5 ^ (-1)) + (i5 << 1);
            b = i6 % 128;
            int i7 = i6 % 2;
            return jF;
        }

        @Override // ivas.gov.bisp.enumeration.cP.J
        public long c(long j, int i) {
            long jC;
            int i2 = 2 % 2;
            int i3 = b;
            int i4 = i3 & 71;
            int i5 = ((i3 ^ 71) | i4) << 1;
            int i6 = -((i3 | 71) & (~i4));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            a = i7 % 128;
            int i8 = i7 % 2;
            Q.this.bH(j, null);
            ivas.gov.bisp.enumeration.cP.J j2 = this.d;
            int i9 = b;
            int i10 = ((i9 | 25) << 1) - (i9 ^ 25);
            a = i10 % 128;
            if (i10 % 2 == 0) {
                jC = j2.c(j, i);
                Q.this.bH(jC, "resulting");
                int i11 = 33 / 0;
            } else {
                jC = j2.c(j, i);
                Q.this.bH(jC, "resulting");
            }
            int i12 = b;
            int i13 = i12 ^ 75;
            int i14 = (i12 & 75) << 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 35 / 0;
            }
            return jC;
        }

        @Override // ivas.gov.bisp.enumeration.cS.c, ivas.gov.bisp.enumeration.cP.J
        public int e(long j, long j2) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 93;
            int i4 = (i2 | 93) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                Q.this.bH(j, "minuend");
                throw null;
            }
            Q.this.bH(j, "minuend");
            Q q = Q.this;
            int i7 = a;
            int i8 = ((i7 ^ 15) | (i7 & 15)) << 1;
            int i9 = -(((~i7) & 15) | (i7 & (-16)));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            b = i10 % 128;
            if (i10 % 2 == 0) {
                q.bH(j2, "subtrahend");
                return this.d.e(j, j2);
            }
            q.bH(j2, "subtrahend");
            this.d.e(j, j2);
            throw null;
        }
    }

    public Q(ivas.gov.bisp.enumeration.p096p.h hVar, ivas.gov.bisp.enumeration.cP.z zVar, ivas.gov.bisp.enumeration.cP.z zVar2) {
        super(hVar, null);
        this.Q = zVar;
        this.P = zVar2;
    }

    public final ivas.gov.bisp.enumeration.cP.J bG(ivas.gov.bisp.enumeration.cP.J j, HashMap<Object, Object> map) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 & (-66)) | ((~i2) & 65)) + ((i2 & 65) << 1);
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (j == null || !j.j()) {
            int i4 = a;
            int i5 = (i4 & 11) + (i4 | 11);
            b = i5 % 128;
            if (i5 % 2 != 0) {
                return j;
            }
            throw null;
        }
        int i6 = a;
        int i7 = (i6 ^ 121) + ((i6 & 121) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            map.containsKey(j);
            obj.hashCode();
            throw null;
        }
        if (!(!map.containsKey(j))) {
            ivas.gov.bisp.enumeration.cP.J j2 = (ivas.gov.bisp.enumeration.cP.J) map.get(j);
            int i8 = b;
            int i9 = (-2) - (((i8 & 72) + (i8 | 72)) ^ (-1));
            a = i9 % 128;
            if (i9 % 2 == 0) {
                return j2;
            }
            obj.hashCode();
            throw null;
        }
        bGf bgf = new bGf(j);
        int i10 = a + 95;
        b = i10 % 128;
        int i11 = i10 % 2;
        map.put(j, bgf);
        int i12 = b;
        int i13 = ((i12 & 83) - (~(-(-(i12 | 83))))) - 1;
        a = i13 % 128;
        int i14 = i13 % 2;
        return bgf;
    }

    @Override // ivas.gov.bisp.enumeration.p096p.h
    public final ivas.gov.bisp.enumeration.p096p.h ba() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 65;
        int i4 = ((((i2 ^ 65) | i3) << 1) - (~(-((i2 | 65) & (~i3))))) - 1;
        a = i4 % 128;
        int i5 = i4 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVarBe = be(AbstractC0242a.c);
        int i6 = b;
        int i7 = (i6 ^ 93) + ((i6 & 93) << 1);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 19 / 0;
        }
        return hVarBe;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 27;
        int i4 = -(-((i2 ^ 27) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        ivas.gov.bisp.enumeration.cP.z zVar = this.Q;
        int iHashCode2 = 0;
        if (zVar != null) {
            int i8 = i6 & 87;
            int i9 = -(-((i6 ^ 87) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            b = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = zVar.hashCode();
            int i12 = b;
            int i13 = (-2) - (((i12 & 54) + (i12 | 54)) ^ (-1));
            a = i13 % 128;
            int i14 = i13 % 2;
        } else {
            int i15 = i6 & 75;
            int i16 = -(-((i6 ^ 75) | i15));
            int i17 = (i15 & i16) + (i16 | i15);
            b = i17 % 128;
            int i18 = i17 % 2;
            iHashCode = 0;
        }
        ivas.gov.bisp.enumeration.cP.z zVar2 = this.P;
        if (zVar2 != null) {
            int i19 = a;
            int i20 = ((i19 ^ 8) + ((i19 & 8) << 1)) - 1;
            b = i20 % 128;
            if (i20 % 2 == 0) {
                zVar2.hashCode();
                throw null;
            }
            iHashCode2 = zVar2.hashCode();
        }
        int iHashCode3 = this.e.hashCode() * 7;
        int i21 = b;
        int i22 = (i21 & 31) + (i21 | 31);
        int i23 = i22 % 128;
        a = i23;
        int i24 = i22 % 2;
        int i25 = iHashCode - (-317351877);
        int i26 = (((i25 ^ iHashCode2) | (i25 & iHashCode2)) << 1) - (((~i25) & iHashCode2) | ((~iHashCode2) & i25));
        int i27 = iHashCode3 ^ i26;
        int i28 = (((iHashCode3 & i26) | i27) << 1) - i27;
        int i29 = i23 & 109;
        int i30 = ((i23 ^ 109) | i29) << 1;
        int i31 = -((~i29) & (i23 | 109));
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        b = i32 % 128;
        int i33 = i32 % 2;
        return i28;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final long aa(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = (i6 & 51) + (i6 | 51);
        a = i7 % 128;
        if (i7 % 2 != 0) {
            this.e.aa(i, i2, i3, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jAa = this.e.aa(i, i2, i3, i4);
        bH(jAa, "resulting");
        int i8 = b;
        int i9 = (i8 ^ 25) + ((i8 & 25) << 1);
        a = i9 % 128;
        int i10 = i9 % 2;
        return jAa;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public final long ae(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 2 % 2;
        int i9 = b;
        int i10 = i9 & 55;
        int i11 = (((i9 ^ 55) | i10) << 1) - ((i9 | 55) & (~i10));
        a = i11 % 128;
        int i12 = i11 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        int i13 = b;
        int i14 = ((i13 ^ 90) + ((i13 & 90) << 1)) - 1;
        a = i14 % 128;
        int i15 = i14 % 2;
        long jAe = hVar.ae(i, i2, i3, i4, i5, i6, i7);
        bH(jAe, "resulting");
        int i16 = b;
        int i17 = (-2) - (((i16 & 84) + (i16 | 84)) ^ (-1));
        int i18 = i17 % 128;
        a = i18;
        int i19 = i17 % 2;
        int i20 = ((i18 | 7) << 1) - (i18 ^ 7);
        b = i20 % 128;
        int i21 = i20 % 2;
        return jAe;
    }

    public final ivas.gov.bisp.enumeration.cP.P bE(ivas.gov.bisp.enumeration.cP.P p, HashMap<Object, Object> map) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 103;
        int i4 = (i2 ^ 103) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        if (p != null) {
            int i8 = (-2) - ((((i6 | 26) << 1) - (i6 ^ 26)) ^ (-1));
            b = i8 % 128;
            int i9 = i8 % 2;
            if (!(!p.x())) {
                int i10 = a;
                int i11 = (i10 & (-44)) | ((~i10) & 43);
                int i12 = -(-((i10 & 43) << 1));
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                b = i13 % 128;
                Object obj = null;
                if (i13 % 2 == 0) {
                    map.containsKey(p);
                    throw null;
                }
                if (!(!map.containsKey(p))) {
                    ivas.gov.bisp.enumeration.cP.P p2 = (ivas.gov.bisp.enumeration.cP.P) map.get(p);
                    int i14 = b;
                    int i15 = (((i14 | 11) << 1) - (~(-(((~i14) & 11) | (i14 & (-12)))))) - 1;
                    a = i15 % 128;
                    int i16 = i15 % 2;
                    return p2;
                }
                bGe bge = new bGe(p, bG(p.m(), map), bG(p.s(), map), bG(p.o(), map));
                int i17 = b;
                int i18 = i17 & 27;
                int i19 = -(-((i17 ^ 27) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                a = i20 % 128;
                if (i20 % 2 != 0) {
                    map.put(p, bge);
                    int i21 = 63 / 0;
                } else {
                    map.put(p, bge);
                }
                int i22 = b;
                int i23 = ((i22 ^ 77) | (i22 & 77)) << 1;
                int i24 = -(((~i22) & 77) | (i22 & (-78)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                a = i25 % 128;
                if (i25 % 2 == 0) {
                    return bge;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i26 = a;
        int i27 = (i26 ^ 121) + ((i26 & 121) << 1);
        b = i27 % 128;
        int i28 = i27 % 2;
        return p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r4 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r4 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r9 = r2 & 77;
        r9 = r9 + ((r2 ^ 77) | r9);
        ivas.gov.bisp.enumeration.cR.Q.a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if ((r9 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r9 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        return r4;
     */
    @Override // ivas.gov.bisp.enumeration.p096p.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.p096p.h be(ivas.gov.bisp.enumeration.cP.AbstractC0242a r9) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.Q.be(ivas.gov.bisp.enumeration.cP.a):ivas.gov.bisp.enumeration.p.h");
    }

    public final void bH(long j, String str) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 105;
        int i4 = ((i2 | 105) & (~i3)) + (i3 << 1);
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        ivas.gov.bisp.enumeration.cP.z zVar = this.Q;
        if (zVar != null && j < zVar.c) {
            throw new bGg(str, true);
        }
        ivas.gov.bisp.enumeration.cP.z zVar2 = this.P;
        if (zVar2 != null) {
            int i5 = b;
            int i6 = i5 & 67;
            int i7 = -(-((i5 ^ 67) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            a = i8 % 128;
            int i9 = i8 % 2;
            if (j >= zVar2.c) {
                throw new bGg(str, false);
            }
        }
        int i10 = a;
        int i11 = ((i10 | 9) << 1) - (i10 ^ 9);
        b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public final void bx(AbstractC0248j.bFA bfa) {
        int i = 2 % 2;
        HashMap<Object, Object> map = new HashMap<>();
        bfa.n = bG(bfa.n, map);
        bfa.m = bG(bfa.m, map);
        bfa.l = bG(bfa.l, map);
        bfa.c = bG(bfa.c, map);
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (i2 ^ 17) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        bfa.k = bG(bfa.k, map);
        bfa.j = bG(bfa.j, map);
        bfa.h = bG(bfa.h, map);
        bfa.i = bG(bfa.i, map);
        ivas.gov.bisp.enumeration.cP.J j = bfa.g;
        int i7 = a;
        int i8 = i7 ^ 41;
        int i9 = ((i7 & 41) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        b = i11 % 128;
        int i12 = i11 % 2;
        bfa.g = bG(j, map);
        bfa.f = bG(bfa.f, map);
        bfa.e = bG(bfa.e, map);
        bfa.d = bG(bfa.d, map);
        bfa.G = bE(bfa.G, map);
        int i13 = a;
        int i14 = i13 & 13;
        int i15 = ((i13 | 13) & (~i14)) + (i14 << 1);
        b = i15 % 128;
        int i16 = i15 % 2;
        bfa.I = bE(bfa.I, map);
        bfa.J = bE(bfa.J, map);
        bfa.K = bE(bfa.K, map);
        bfa.H = bE(bfa.H, map);
        ivas.gov.bisp.enumeration.cP.P p = bfa.v;
        int i17 = b;
        int i18 = i17 & 35;
        int i19 = ((i17 ^ 35) | i18) << 1;
        int i20 = -((i17 | 35) & (~i18));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        a = i21 % 128;
        int i22 = i21 % 2;
        bfa.v = bE(p, map);
        bfa.B = bE(bfa.B, map);
        bfa.A = bE(bfa.A, map);
        bfa.F = bE(bfa.F, map);
        bfa.C = bE(bfa.C, map);
        int i23 = b;
        int i24 = ((i23 | 13) << 1) - (i23 ^ 13);
        a = i24 % 128;
        int i25 = i24 % 2;
        bfa.E = bE(bfa.E, map);
        bfa.D = bE(bfa.D, map);
        bfa.p = bE(bfa.p, map);
        bfa.f83o = bE(bfa.f83o, map);
        ivas.gov.bisp.enumeration.cP.P p2 = bfa.q;
        int i26 = b;
        int i27 = ((i26 | 86) << 1) - (i26 ^ 86);
        int i28 = (i27 ^ (-1)) + (i27 << 1);
        a = i28 % 128;
        int i29 = i28 % 2;
        bfa.q = bE(p2, map);
        bfa.r = bE(bfa.r, map);
        bfa.t = bE(bfa.t, map);
        bfa.s = bE(bfa.s, map);
        bfa.u = bE(bfa.u, map);
        int i30 = b;
        int i31 = (i30 & 77) + (i30 | 77);
        a = i31 % 128;
        int i32 = i31 % 2;
        bfa.w = bE(bfa.w, map);
        bfa.x = bE(bfa.x, map);
        bfa.y = bE(bfa.y, map);
        bfa.z = bE(bfa.z, map);
        int i33 = a + 21;
        b = i33 % 128;
        int i34 = i33 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0099  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 53;
        int i4 = i3 + ((i2 ^ 53) | i3);
        a = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            int i6 = (i2 & (-18)) | ((~i2) & 17);
            int i7 = (i2 & 17) << 1;
            int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
            a = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i2 & 11;
            int i11 = i2 | 11;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            a = i12 % 128;
            if (i12 % 2 == 0) {
                return true;
            }
            throw null;
        }
        boolean z = false;
        if (!(obj instanceof Q)) {
            int i13 = i2 + 45;
            a = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((i2 & 92) + (i2 | 92)) - 1;
            a = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        Q q = (Q) obj;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        ivas.gov.bisp.enumeration.p096p.h hVar2 = q.e;
        int i17 = a;
        int i18 = (i17 & (-24)) | ((~i17) & 23);
        int i19 = (i17 & 23) << 1;
        int i20 = (i18 & i19) + (i19 | i18);
        b = i20 % 128;
        int i21 = i20 % 2;
        if (!hVar.equals(hVar2)) {
            int i22 = b;
            int i23 = (i22 & 67) + (i22 | 67);
            a = i23 % 128;
            int i24 = i23 % 2;
        } else {
            int i25 = b;
            int i26 = (i25 | 33) << 1;
            int i27 = -(((~i25) & 33) | (i25 & (-34)));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            a = i28 % 128;
            int i29 = i28 % 2;
            if (!ivas.gov.bisp.enumeration.p100w.r.D(this.Q, q.Q)) {
                int i210 = b;
                int i211 = (i210 & 67) + (i210 | 67);
                a = i211 % 128;
                int i212 = i211 % 2;
            } else {
                int i30 = b;
                int i31 = (i30 ^ 99) + ((i30 & 99) << 1);
                a = i31 % 128;
                int i32 = i31 % 2;
                if (ivas.gov.bisp.enumeration.p100w.r.D(this.P, q.P)) {
                    z = true;
                } else {
                    int i213 = b;
                    int i214 = (i213 & 67) + (i213 | 67);
                    a = i214 % 128;
                    int i215 = i214 % 2;
                }
            }
        }
        int i33 = b;
        int i34 = i33 & 33;
        int i35 = (i33 ^ 33) | i34;
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        a = i36 % 128;
        int i37 = i36 % 2;
        return z;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 107;
        int i4 = ((i2 & 107) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        b = i6 % 128;
        int i7 = i6 % 2;
        StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("LimitChronology[");
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        int i8 = a + 119;
        b = i8 % 128;
        int i9 = i8 % 2;
        sbW.append(hVar.toString());
        sbW.append(", ");
        int i10 = b;
        int i11 = ((i10 | 29) << 1) - (i10 ^ 29);
        int i12 = i11 % 128;
        a = i12;
        int i13 = i11 % 2;
        ivas.gov.bisp.enumeration.cP.z zVar = this.Q;
        String string2 = "NoLimit";
        if (zVar == null) {
            int i14 = ((i12 | 19) << 1) - (i12 ^ 19);
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((((i12 ^ 107) | (i12 & 107)) << 1) - (~(-((107 & (~i12)) | (i12 & (-108)))))) - 1;
            b = i16 % 128;
            int i17 = i16 % 2;
            string = "NoLimit";
        } else {
            string = zVar.toString();
            int i18 = a;
            int i19 = ((((i18 ^ 85) | (i18 & 85)) << 1) - (~(-(((~i18) & 85) | (i18 & (-86)))))) - 1;
            b = i19 % 128;
            int i20 = i19 % 2;
        }
        sbW.append(string);
        sbW.append(", ");
        ivas.gov.bisp.enumeration.cP.z zVar2 = this.P;
        int i21 = b;
        int i22 = i21 & 45;
        int i23 = (((~i22) & (i21 | 45)) - (~(i22 << 1))) - 1;
        a = i23 % 128;
        int i24 = i23 % 2;
        if (zVar2 == null) {
            int i25 = ((i21 | 55) << 1) - (i21 ^ 55);
            a = i25 % 128;
            int i26 = i25 % 2;
            int i27 = i21 ^ 17;
            int i28 = ((i21 & 17) | i27) << 1;
            int i29 = -i27;
            int i30 = (i28 & i29) + (i29 | i28);
            a = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 3 / 3;
            }
        } else {
            string2 = zVar2.toString();
            int i32 = a;
            int i33 = i32 & 51;
            int i34 = (i32 | 51) & (~i33);
            int i35 = -(-(i33 << 1));
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            b = i36 % 128;
            int i37 = i36 % 2;
        }
        sbW.append(string2);
        sbW.append(']');
        String string3 = sbW.toString();
        int i38 = a;
        int i39 = i38 & 1;
        int i40 = (i39 - (~(-(-((i38 ^ 1) | i39))))) - 1;
        b = i40 % 128;
        int i41 = i40 % 2;
        return string3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if (r2 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ivas.gov.bisp.enumeration.cR.Q by(ivas.gov.bisp.enumeration.p096p.h r11, ivas.gov.bisp.enumeration.cQ.r r12, ivas.gov.bisp.enumeration.cQ.r r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.Q.by(ivas.gov.bisp.enumeration.p.h, ivas.gov.bisp.enumeration.cQ.r, ivas.gov.bisp.enumeration.cQ.r):ivas.gov.bisp.enumeration.cR.Q");
    }

    public class bGg extends IllegalArgumentException {
        private static int a = 1;
        private static int b;
        public final boolean c;

        public bGg(String str, boolean z) {
            super(str);
            this.c = z;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 15;
            int i4 = -(-((i2 ^ 15) | i3));
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            StringBuilder sbW = ivas.gov.bisp.enumeration.p091n.j.w("IllegalArgumentException: ");
            sbW.append(getMessage());
            int i7 = a;
            int i8 = ((i7 ^ 25) - (~(-(-((i7 & 25) << 1))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            String string = sbW.toString();
            int i10 = a;
            int i11 = (i10 | 29) << 1;
            int i12 = -(i10 ^ 29);
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            b = i13 % 128;
            int i14 = i13 % 2;
            return string;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String string;
            int i = 2 % 2;
            StringBuffer stringBuffer = new StringBuffer(85);
            int i2 = a;
            int i3 = i2 & 107;
            int i4 = i3 + ((i2 ^ 107) | i3);
            b = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                stringBuffer.append("The");
                super.getMessage();
                obj.hashCode();
                throw null;
            }
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                int i5 = b;
                int i6 = (i5 ^ 67) + ((i5 & 67) << 1);
                a = i6 % 128;
                int i7 = i6 % 2;
                stringBuffer.append(' ');
                stringBuffer.append(message);
                int i8 = b;
                int i9 = i8 & 49;
                int i10 = ((i8 | 49) & (~i9)) + (i9 << 1);
                a = i10 % 128;
                int i11 = i10 % 2;
            }
            stringBuffer.append(" instant is ");
            ivas.gov.bisp.enumeration.cJ.c cVar = ivas.gov.bisp.enumeration.cJ.P.G;
            Q q = Q.this;
            int i12 = b;
            int i13 = (i12 & (-70)) | ((~i12) & 69);
            int i14 = (i12 & 69) << 1;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                cVar.j(q.e);
                throw null;
            }
            ivas.gov.bisp.enumeration.cJ.c cVarJ = cVar.j(q.e);
            try {
                if (this.c) {
                    stringBuffer.append("below the supported minimum of ");
                    ivas.gov.bisp.enumeration.cP.z zVar = Q.this.Q;
                    int i16 = a;
                    int i17 = (((i16 & (-108)) | ((~i16) & 107)) - (~((107 & i16) << 1))) - 1;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    cVarJ.g(stringBuffer, zVar.c, null);
                    int i19 = b;
                    int i20 = ((i19 ^ 40) + ((i19 & 40) << 1)) - 1;
                    a = i20 % 128;
                    int i21 = i20 % 2;
                } else {
                    stringBuffer.append("above the supported maximum of ");
                    ivas.gov.bisp.enumeration.cP.z zVar2 = Q.this.P;
                    int i22 = a;
                    int i23 = i22 & 37;
                    int i24 = (((i22 | 37) & (~i23)) - (~(i23 << 1))) - 1;
                    b = i24 % 128;
                    int i25 = i24 % 2;
                    cVarJ.g(stringBuffer, zVar2.c, null);
                    int i26 = a;
                    int i27 = i26 & 107;
                    int i28 = (i26 ^ 107) | i27;
                    int i29 = (i27 & i28) + (i28 | i27);
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = 2 % 5;
                    }
                }
            } catch (IOException unused) {
            }
            stringBuffer.append(" (");
            ivas.gov.bisp.enumeration.p096p.h hVar = Q.this.e;
            int i31 = a;
            int i32 = (i31 & 33) + (i31 | 33);
            b = i32 % 128;
            if (i32 % 2 != 0) {
                stringBuffer.append(hVar);
                stringBuffer.append('G');
            } else {
                stringBuffer.append(hVar);
                stringBuffer.append(')');
            }
            int i33 = b;
            int i34 = ((i33 ^ 41) | (i33 & 41)) << 1;
            int i35 = -(((~i33) & 41) | (i33 & (-42)));
            int i36 = (i34 & i35) + (i35 | i34);
            a = i36 % 128;
            if (i36 % 2 == 0) {
                string = stringBuffer.toString();
                int i37 = 19 / 0;
            } else {
                string = stringBuffer.toString();
            }
            int i38 = a;
            int i39 = i38 & 101;
            int i40 = (i38 | 101) & (~i39);
            int i41 = -(-(i39 << 1));
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            b = i42 % 128;
            int i43 = i42 % 2;
            return string;
        }
    }
}
