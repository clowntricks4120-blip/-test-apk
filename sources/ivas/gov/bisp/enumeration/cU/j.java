package ivas.gov.bisp.enumeration.cU;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;

/* JADX INFO: loaded from: classes.dex */
public class j extends AbstractC0242a {
    private static int a = 0;
    private static int b = 1;
    public static final int h;
    public final AbstractC0242a i;
    public final transient bGD[] j;

    public static final class bGD {
        private static int a = 1;
        private static int b;
        public final long c;
        public final AbstractC0242a d;
        public bGD e;
        public String f;
        public int h = Integer.MIN_VALUE;
        public int g = Integer.MIN_VALUE;

        public bGD(AbstractC0242a abstractC0242a, long j) {
            this.c = j;
            this.d = abstractC0242a;
        }

        public final int d(long j) {
            int i = 2 % 2;
            bGD bgd = this;
            while (true) {
                bGD bgd2 = bgd.e;
                if (bgd2 == null) {
                    break;
                }
                int i2 = a + 23;
                int i3 = i2 % 128;
                b = i3;
                int i4 = i2 % 2;
                if (j < bgd2.c) {
                    break;
                }
                int i5 = i3 & 47;
                int i6 = ((~i5) & (i3 | 47)) + (i5 << 1);
                int i7 = i6 % 128;
                a = i7;
                int i8 = i6 % 2;
                int i9 = ((i7 ^ 104) + ((i7 & 104) << 1)) - 1;
                b = i9 % 128;
                int i10 = i9 % 2;
                bgd = bgd2;
            }
            if (bgd.h == Integer.MIN_VALUE) {
                int i11 = b + 55;
                a = i11 % 128;
                int i12 = i11 % 2;
                bgd.h = bgd.d.n(bgd.c);
                int i13 = a + 93;
                b = i13 % 128;
                int i14 = i13 % 2;
            }
            int i15 = bgd.h;
            int i16 = a + 51;
            b = i16 % 128;
            int i17 = i16 % 2;
            return i15;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0043 A[LOOP:0: B:3:0x0004->B:13:0x0043, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x0045 A[SYNTHETIC] */
        public final int e(long j) {
            int i;
            int i2 = 2 % 2;
            bGD bgd = this;
            while (true) {
                bGD bgd2 = bgd.e;
                if (bgd2 == null) {
                    break;
                }
                int i3 = a;
                int i4 = i3 & 87;
                int i5 = ((i3 ^ 87) | i4) << 1;
                int i6 = -((~i4) & (i3 | 87));
                int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                b = i7 % 128;
                int i8 = i7 % 2;
                long j2 = bgd2.c;
                if (i8 != 0) {
                    int i9 = 87 / 0;
                    if (j < j2) {
                        break;
                    }
                    int i10 = i3 & 101;
                    i = (((i3 ^ 101) | i10) << 1) - ((i3 | 101) & (~i10));
                    b = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    bgd = bgd2;
                } else {
                    if (j < j2) {
                        break;
                    }
                    int i11 = i3 & 101;
                    i = (((i3 ^ 101) | i11) << 1) - ((i3 | 101) & (~i11));
                    b = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    bgd = bgd2;
                }
            }
            if (bgd.g == Integer.MIN_VALUE) {
                int i12 = b + 111;
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    bgd.g = bgd.d.p(bgd.c);
                    int i13 = 92 / 0;
                } else {
                    bgd.g = bgd.d.p(bgd.c);
                }
            }
            int i14 = bgd.g;
            int i15 = b;
            int i16 = (-2) - ((((i15 | 44) << 1) - (i15 ^ 44)) ^ (-1));
            a = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 8 / 0;
            }
            return i14;
        }

        public final String c(long j) {
            Object obj;
            int i = 2 % 2;
            bGD bgd = this;
            while (true) {
                bGD bgd2 = bgd.e;
                obj = null;
                if (bgd2 == null) {
                    break;
                }
                int i2 = b;
                int i3 = i2 & 37;
                int i4 = ((i2 | 37) & (~i3)) + (i3 << 1);
                int i5 = i4 % 128;
                a = i5;
                if (i4 % 2 == 0) {
                    long j2 = bgd2.c;
                    throw null;
                }
                if (j < bgd2.c) {
                    break;
                }
                int i6 = (i5 & 29) + (i5 | 29);
                b = i6 % 128;
                int i7 = i6 % 2;
                int i8 = (((i5 ^ 85) | (i5 & 85)) << 1) - ((i5 & (-86)) | ((~i5) & 85));
                b = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 2;
                }
                bgd = bgd2;
            }
            if (bgd.f == null) {
                int i10 = a;
                int i11 = i10 & 119;
                int i12 = -(-((i10 ^ 119) | i11));
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                b = i13 % 128;
                if (i13 % 2 != 0) {
                    bgd.f = bgd.d.m(bgd.c);
                    obj.hashCode();
                    throw null;
                }
                bgd.f = bgd.d.m(bgd.c);
            }
            String str = bgd.f;
            int i14 = a;
            int i15 = ((i14 | 107) << 1) - (i14 ^ 107);
            b = i15 % 128;
            int i16 = i15 % 2;
            return str;
        }
    }

    static {
        Integer integer;
        int i;
        Object obj = null;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
            int i2 = b;
            int i3 = ((i2 ^ 21) - (~((i2 & 21) << 1))) - 1;
            a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 5;
            } else {
                int i5 = 2 % 2;
            }
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            int i6 = b;
            int i7 = (i6 & 9) + (i6 | 9);
            int i8 = i7 % 128;
            a = i8;
            i = i7 % 2 != 0 ? 27465 : 512;
            int i9 = (i8 | 99) << 1;
            int i10 = -(i8 ^ 99);
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            b = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 2;
            }
        } else {
            int iIntValue = (-2) - (integer.intValue() ^ (-1));
            int i13 = a + 75;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 2;
            }
            int i15 = 0;
            while (iIntValue > 0) {
                int i16 = a;
                int i17 = i16 + 101;
                b = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i15 & 1;
                int i20 = ((i15 ^ 1) | i19) << 1;
                int i21 = -((i15 | 1) & (~i19));
                i15 = ((i21 & i20) << 1) + (i20 ^ i21);
                iIntValue >>= 1;
                int i22 = i16 & 39;
                int i23 = (((i16 ^ 39) | i22) << 1) - ((i16 | 39) & (~i22));
                b = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 4 / 2;
                } else {
                    int i25 = 2 % 2;
                }
            }
            i = 1 << i15;
            int i26 = a;
            int i27 = i26 & 73;
            int i28 = (((i26 ^ 73) | i27) << 1) - ((i26 | 73) & (~i27));
            b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = 2 % 2;
        }
        h = i - 1;
        int i31 = b;
        int i32 = i31 & 3;
        int i33 = (i32 - (~(-(-((i31 ^ 3) | i32))))) - 1;
        a = i33 % 128;
        if (i33 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public j(AbstractC0242a abstractC0242a) {
        super(abstractC0242a.g);
        int i = h;
        int i2 = ((i ^ 1) | (i & 1)) << 1;
        int i3 = -(((~i) & 1) | (i & (-2)));
        this.j = new bGD[(i2 ^ i3) + ((i3 & i2) << 1)];
        this.i = abstractC0242a;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public int hashCode() {
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.i.hashCode();
        int i4 = a;
        int i5 = ((i4 ^ 33) | (i4 & 33)) << 1;
        int i6 = -(((~i4) & 33) | (i4 & (-34)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public String m(long j) {
        String strC;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            strC = t(j).c(j);
            int i4 = 78 / 0;
        } else {
            strC = t(j).c(j);
        }
        int i5 = a;
        int i6 = i5 & 61;
        int i7 = (i5 | 61) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return strC;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public int n(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 81;
        int i4 = i3 + ((i2 ^ 81) | i3);
        a = i4 % 128;
        if (i4 % 2 != 0) {
            t(j).d(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iD = t(j).d(j);
        int i5 = a;
        int i6 = i5 ^ 33;
        int i7 = (i5 & 33) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        b = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 29 / 0;
        }
        return iD;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public int p(long j) {
        int i = 2 % 2;
        int i2 = b + 35;
        a = i2 % 128;
        int i3 = i2 % 2;
        int iE = t(j).e(j);
        int i4 = a;
        int i5 = (((i4 | 74) << 1) - (i4 ^ 74)) - 1;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return iE;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public boolean q() {
        int i = 2 % 2;
        int i2 = a + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zQ = this.i.q();
        int i4 = b + 71;
        a = i4 % 128;
        int i5 = i4 % 2;
        return zQ;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public long r(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 69) + ((i2 & 69) << 1);
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.i.r(j);
        }
        this.i.r(j);
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public long s(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 109;
        int i4 = -(-((i2 ^ 109) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        long jS = this.i.s(j);
        if (i6 != 0) {
            int i7 = 89 / 0;
        }
        return jS;
    }

    @Override // ivas.gov.bisp.enumeration.cP.AbstractC0242a
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 93;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 & 125;
            int i9 = (((i2 | 125) & (~i8)) - (~(-(-(i8 << 1))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }
        if (!(obj instanceof j)) {
            int i11 = i4 + 1;
            b = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = (i4 & 95) + (i4 | 95);
        b = i13 % 128;
        int i14 = i13 % 2;
        AbstractC0242a abstractC0242a = this.i;
        j jVar = (j) obj;
        if (i14 != 0) {
            return abstractC0242a.equals(jVar.i);
        }
        boolean zEquals = abstractC0242a.equals(jVar.i);
        int i15 = 37 / 0;
        return zEquals;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049  */
    /* JADX WARN: Code duplicated, block: B:13:0x0085  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b8 A[LOOP:0: B:11:0x007b->B:17:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0 A[EDGE_INSN: B:24:0x00d0->B:20:0x00d0 BREAK  A[LOOP:0: B:11:0x007b->B:17:0x00b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0 A[EDGE_INSN: B:25:0x00d0->B:20:0x00d0 BREAK  A[LOOP:0: B:11:0x007b->B:17:0x00b8], SYNTHETIC] */
    public final bGD t(long j) {
        long j2;
        long j3;
        bGD bgd;
        long jR;
        bGD bgd2;
        int i;
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 57;
        int i5 = ((i3 ^ 57) | i4) << 1;
        int i6 = -((~i4) & (i3 | 57));
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = (int) (i7 % 2 == 0 ? j << 114 : j >> 32);
        bGD[] bgdArr = this.j;
        int i9 = h;
        int i10 = i3 + 113;
        int i11 = i10 % 128;
        b = i11;
        int i12 = i10 % 2;
        int i13 = i9 & i8;
        bGD bgd3 = bgdArr[i13];
        if (bgd3 != null) {
            int i14 = ((i11 | 99) << 1) - (i11 ^ 99);
            a = i14 % 128;
            int i15 = i14 % 2;
            if (((int) (bgd3.c >> 32)) != i8) {
                j2 = j & (-4294967296L);
                bgd3 = new bGD(this.i, j2);
                int i16 = b;
                int i17 = i16 & 77;
                int i18 = ((i16 ^ 77) | i17) << 1;
                int i19 = -((~i17) & (i16 | 77));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                a = i20 % 128;
                int i21 = i20 % 2;
                int i22 = (i16 & 25) + (i16 | 25);
                a = i22 % 128;
                int i23 = i22 % 2;
                j3 = j2;
                bgd = bgd3;
                while (true) {
                    jR = this.i.r(j3);
                    if (jR != j3) {
                        break;
                    }
                    int i24 = a;
                    int i25 = i24 & 65;
                    int i26 = i24 | 65;
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    b = i27 % 128;
                    int i28 = i27 % 2;
                    if (jR <= (4294967295L | j2)) {
                        break;
                    }
                    bgd2 = new bGD(this.i, jR);
                    int i29 = b;
                    int i30 = i29 & 95;
                    i = i30 + ((i29 ^ 95) | i30);
                    a = i % 128;
                    if (i % 2 == 0) {
                        bgd.e = bgd2;
                        throw null;
                    }
                    bgd.e = bgd2;
                    int i31 = a;
                    int i32 = i31 & 43;
                    int i33 = i31 | 43;
                    int i34 = (i32 & i33) + (i33 | i32);
                    b = i34 % 128;
                    int i35 = i34 % 2;
                    bgd = bgd2;
                    j3 = jR;
                }
                bgdArr[i13] = bgd3;
                int i36 = b;
                int i37 = i36 & 39;
                int i38 = ((i36 | 39) & (~i37)) + (i37 << 1);
                a = i38 % 128;
                int i39 = i38 % 2;
            }
        } else {
            j2 = j & (-4294967296L);
            bgd3 = new bGD(this.i, j2);
            int i110 = b;
            int i111 = i110 & 77;
            int i112 = ((i110 ^ 77) | i111) << 1;
            int i113 = -((~i111) & (i110 | 77));
            int i210 = (i112 ^ i113) + ((i112 & i113) << 1);
            a = i210 % 128;
            int i211 = i210 % 2;
            int i212 = (i110 & 25) + (i110 | 25);
            a = i212 % 128;
            int i213 = i212 % 2;
            j3 = j2;
            bgd = bgd3;
            while (true) {
                jR = this.i.r(j3);
                if (jR != j3) {
                    break;
                    break;
                }
                int i214 = a;
                int i215 = i214 & 65;
                int i216 = i214 | 65;
                int i217 = (i215 ^ i216) + ((i216 & i215) << 1);
                b = i217 % 128;
                int i218 = i217 % 2;
                if (jR <= (4294967295L | j2)) {
                    break;
                    break;
                }
                bgd2 = new bGD(this.i, jR);
                int i219 = b;
                int i310 = i219 & 95;
                i = i310 + ((i219 ^ 95) | i310);
                a = i % 128;
                if (i % 2 == 0) {
                    bgd.e = bgd2;
                    throw null;
                }
                bgd.e = bgd2;
                int i311 = a;
                int i312 = i311 & 43;
                int i313 = i311 | 43;
                int i314 = (i312 & i313) + (i313 | i312);
                b = i314 % 128;
                int i315 = i314 % 2;
                bgd = bgd2;
                j3 = jR;
            }
            bgdArr[i13] = bgd3;
            int i316 = b;
            int i317 = i316 & 39;
            int i318 = ((i316 | 39) & (~i317)) + (i317 << 1);
            a = i318 % 128;
            int i319 = i318 % 2;
        }
        int i40 = a + 48;
        int i41 = (i40 ^ (-1)) + (i40 << 1);
        b = i41 % 128;
        int i42 = i41 % 2;
        return bgd3;
    }
}
