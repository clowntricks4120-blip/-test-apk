package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cS.C0254m;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractC0248j {
    public static final ivas.gov.bisp.enumeration.cP.J P;
    public static final ivas.gov.bisp.enumeration.cP.J Q;
    public static final ivas.gov.bisp.enumeration.cP.J R;
    public static final ivas.gov.bisp.enumeration.cP.J S;
    public static final ivas.gov.bisp.enumeration.cP.J T;
    public static final ivas.gov.bisp.enumeration.cP.P U;
    public static final ivas.gov.bisp.enumeration.cP.P V;
    public static final ivas.gov.bisp.enumeration.cP.P W;
    public static final ivas.gov.bisp.enumeration.cP.P X;
    public static final ivas.gov.bisp.enumeration.cP.P Y;
    public static final ivas.gov.bisp.enumeration.cP.P Z;
    private static int a = 0;
    public static final ivas.gov.bisp.enumeration.cP.P aa;
    public static final ivas.gov.bisp.enumeration.cP.P ab;
    public static final ivas.gov.bisp.enumeration.cP.P ac;
    public static final ivas.gov.bisp.enumeration.cP.P ad;
    public static final ivas.gov.bisp.enumeration.cP.P ae;
    public static final ivas.gov.bisp.enumeration.cP.J af;
    private static int b = 1;
    public final int ag;
    public final transient bFG[] ah;

    public static class bFF extends ivas.gov.bisp.enumeration.cS.t {
        private static int a = 0;
        private static int b = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public bFF() {
            super(AbstractC0246t.f80o, h.P, h.T);
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public String j(int i, Locale locale) {
            int i2 = 2 % 2;
            int i3 = a + 9;
            b = i3 % 128;
            int i4 = i3 % 2;
            String str = C0250o.d(locale).i[i];
            int i5 = a + 115;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
            return str;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public int p(Locale locale) {
            int i = 2 % 2;
            int i2 = a;
            int i3 = i2 & 87;
            int i4 = (i2 ^ 87) | i3;
            int i5 = (i3 & i4) + (i4 | i3);
            b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = C0250o.d(locale).p;
            int i8 = a;
            int i9 = i8 & 7;
            int i10 = ((i8 ^ 7) | i9) << 1;
            int i11 = -((i8 | 7) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            b = i12 % 128;
            if (i12 % 2 != 0) {
                return i7;
            }
            throw null;
        }

        @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
        public long C(long j, String str, Locale locale) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 & 71;
            int i4 = i2 | 71;
            int i5 = (i3 & i4) + (i4 | i3);
            a = i5 % 128;
            if (i5 % 2 != 0) {
                int length = C0250o.d(locale).i.length;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String[] strArr = C0250o.d(locale).i;
            int length2 = strArr.length;
            do {
                length2 = (-2) - (length2 ^ (-1));
                if (length2 < 0) {
                    AbstractC0246t abstractC0246t = AbstractC0246t.d;
                    throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.f80o, str);
                }
                int i6 = b;
                int i7 = i6 ^ 85;
                int i8 = -(-((i6 & 85) << 1));
                int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                a = i9 % 128;
                int i10 = i9 % 2;
            } while (!strArr[length2].equalsIgnoreCase(str));
            int i11 = b;
            int i12 = i11 & 105;
            int i13 = (i11 | 105) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            a = i15 % 128;
            if (i15 % 2 == 0) {
                return A(j, length2);
            }
            int i16 = 51 / 0;
            return A(j, length2);
        }
    }

    public static class bFG {
        public final int a;
        public final long b;

        public bFG(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    static {
        ivas.gov.bisp.enumeration.cP.J j = ivas.gov.bisp.enumeration.cS.z.c;
        ivas.gov.bisp.enumeration.cS.l lVar = new ivas.gov.bisp.enumeration.cS.l(ivas.gov.bisp.enumeration.cP.x.n, 1000L);
        R = lVar;
        ivas.gov.bisp.enumeration.cS.l lVar2 = new ivas.gov.bisp.enumeration.cS.l(ivas.gov.bisp.enumeration.cP.x.l, 60000L);
        Q = lVar2;
        ivas.gov.bisp.enumeration.cS.l lVar3 = new ivas.gov.bisp.enumeration.cS.l(ivas.gov.bisp.enumeration.cP.x.k, 3600000L);
        S = lVar3;
        ivas.gov.bisp.enumeration.cS.l lVar4 = new ivas.gov.bisp.enumeration.cS.l(ivas.gov.bisp.enumeration.cP.x.j, 43200000L);
        P = lVar4;
        ivas.gov.bisp.enumeration.cS.l lVar5 = new ivas.gov.bisp.enumeration.cS.l(ivas.gov.bisp.enumeration.cP.x.c, 86400000L);
        T = lVar5;
        af = new ivas.gov.bisp.enumeration.cS.l(ivas.gov.bisp.enumeration.cP.x.i, 604800000L);
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        U = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.y, j, lVar);
        V = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.t, j, lVar5);
        W = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.x, lVar, lVar2);
        X = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.w, lVar, lVar5);
        Y = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.u, lVar2, lVar3);
        Z = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.v, lVar2, lVar5);
        ivas.gov.bisp.enumeration.cS.t tVar = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.s, lVar3, lVar5);
        aa = tVar;
        ivas.gov.bisp.enumeration.cS.t tVar2 = new ivas.gov.bisp.enumeration.cS.t(AbstractC0246t.p, lVar3, lVar4);
        ab = tVar2;
        ac = new C0254m(tVar, AbstractC0246t.q);
        ad = new C0254m(tVar2, AbstractC0246t.r);
        ae = new bFF();
        int i = b;
        int i2 = (i & (-70)) | ((~i) & 69);
        int i3 = (i & 69) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        a = i4 % 128;
        int i5 = i4 % 2;
    }

    public h(ivas.gov.bisp.enumeration.p096p.h hVar, Object obj, int i) {
        super(hVar, obj);
        this.ah = new bFG[1024];
        if (i <= 0 || i > 7) {
            throw new IllegalArgumentException(ivas.gov.bisp.enumeration.p091n.j.o("Invalid min days in first week: ", i));
        }
        int i2 = b;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        a = i6;
        int i7 = i5 % 2;
        this.ag = i;
        int i8 = (i6 & 17) + (i6 | 17);
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.p096p.h
    public AbstractC0242a ap() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 50) << 1) - (i2 ^ 50)) - 1;
        a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p096p.h hVar2 = this.e;
        if (hVar2 == null) {
            AbstractC0242a abstractC0242a = AbstractC0242a.c;
            int i4 = b;
            int i5 = ((i4 & (-112)) | ((~i4) & 111)) + ((i4 & 111) << 1);
            a = i5 % 128;
            int i6 = i5 % 2;
            return abstractC0242a;
        }
        int i7 = b;
        int i8 = i7 & 23;
        int i9 = (i7 | 23) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        if (i11 % 2 == 0) {
            return hVar2.ap();
        }
        hVar2.ap();
        obj.hashCode();
        throw null;
    }

    public abstract long bB();

    public abstract long bC();

    public abstract long bD();

    public abstract long bF(int i);

    public int bH(long j, int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = (i3 | 113) << 1;
        int i5 = -(((~i3) & 113) | (i3 & (-114)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        a = i6 % 128;
        int i7 = i6 % 2;
        int iBU = bU(j);
        int iBK = bK(j, iBU);
        int i8 = b;
        int i9 = i8 ^ 75;
        int i10 = (i8 & 75) << 1;
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        a = i11 % 128;
        if (i11 % 2 != 0) {
            bI(iBU, iBK);
            throw null;
        }
        int iBI = bI(iBU, iBK);
        int i12 = b;
        int i13 = i12 & 15;
        int i14 = -(-((i12 ^ 15) | i13));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        return iBI;
    }

    public abstract int bI(int i, int i2);

    public abstract int bK(long j, int i);

    public abstract int bL();

    public abstract int bN();

    public abstract long bO(int i, int i2);

    public int bP(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (i2 & (-2)) | ((~i2) & 1);
        int i4 = (i2 & 1) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        a = i5 % 128;
        int i6 = i5 % 2;
        int iBQ = bQ(j, bU(j));
        int i7 = b;
        int i8 = (i7 & 45) + (i7 | 45);
        a = i8 % 128;
        int i9 = i8 % 2;
        return iBQ;
    }

    public int bR(int i) {
        long jBJ;
        int i2 = 2 % 2;
        int i3 = b + 93;
        a = i3 % 128;
        if (i3 % 2 != 0) {
            jBJ = bJ(i) + bJ(i);
        } else {
            jBJ = bJ((-2) - ((i + 2) ^ (-1))) - bJ(i);
        }
        int i4 = (int) (jBJ / 604800000);
        int i5 = a + 71;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public abstract long bT(long j, long j2);

    public abstract boolean bX(int i);

    public boolean bY(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 109;
        int i4 = (i3 - (~((i2 ^ 109) | i3))) - 1;
        b = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i2 & 47;
        int i6 = i2 | 47;
        int i7 = (i5 & i6) + (i6 | i5);
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public abstract long bZ(long j, int i);

    public abstract long bz();

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public long aa(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = i6 & 77;
        int i8 = i7 + ((i6 ^ 77) | i7);
        a = i8 % 128;
        int i9 = i8 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        if (hVar == null) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            ivas.gov.bisp.enumeration.p100w.r.af(AbstractC0246t.t, i4, 0, 86399999);
            int i10 = b;
            int i11 = ((i10 ^ 48) + ((i10 & 48) << 1)) - 1;
            a = i11 % 128;
            if (i11 % 2 != 0) {
                bE(i, i2, i3, i4);
                throw null;
            }
            long jBE = bE(i, i2, i3, i4);
            int i12 = b;
            int i13 = (i12 & 59) + (i12 | 59);
            a = i13 % 128;
            int i14 = i13 % 2;
            return jBE;
        }
        int i15 = b;
        int i16 = i15 & 25;
        int i17 = ((((i15 ^ 25) | i16) << 1) - (~(-((i15 | 25) & (~i16))))) - 1;
        a = i17 % 128;
        int i18 = i17 % 2;
        long jAa = hVar.aa(i, i2, i3, i4);
        int i19 = a;
        int i20 = i19 & 59;
        int i21 = (i19 ^ 59) | i20;
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        b = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 0 / 0;
        }
        return jAa;
    }

    public final long bE(int i, int i2, int i3, int i4) {
        long jBy;
        int i5 = 2 % 2;
        int i6 = b;
        int i7 = ((i6 ^ 115) | (i6 & 115)) << 1;
        int i8 = -(((~i6) & 115) | (i6 & (-116)));
        int i9 = (i7 & i8) + (i8 | i7);
        a = i9 % 128;
        int i10 = i9 % 2;
        long jBy2 = by(i, i2, i3);
        int i11 = a;
        int i12 = i11 & 99;
        int i13 = -(-((i11 ^ 99) | i12));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (jBy2 == Long.MIN_VALUE) {
            int i15 = i11 & 13;
            int i16 = (i11 ^ 13) | i15;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            b = i17 % 128;
            if (i17 % 2 == 0) {
                jBy = by(i, i2, i3);
            } else {
                int i18 = i3 & 1;
                jBy = by(i, i2, (i18 - (~((i3 ^ 1) | i18))) - 1);
            }
            jBy2 = jBy;
            int i19 = i4 & (-86400000);
            i4 = ((((-86400000) | i4) & (~i19)) - (~(i19 << 1))) - 1;
            int i20 = b + 89;
            a = i20 % 128;
            int i21 = i20 % 2;
        }
        long j = ((long) i4) + jBy2;
        if (j < 0) {
            int i22 = a;
            int i23 = (-2) - (((i22 ^ 112) + ((i22 & 112) << 1)) ^ (-1));
            int i24 = i23 % 128;
            b = i24;
            if (i23 % 2 != 0 ? jBy2 > 0 : jBy2 > 1) {
                int i25 = i24 & 43;
                int i26 = ((i24 ^ 43) | i25) << 1;
                int i27 = -((~i25) & (i24 | 43));
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                a = i28 % 128;
                int i29 = i28 % 2;
                int i30 = (i24 & 71) + (i24 | 71);
                a = i30 % 128;
                int i31 = i30 % 2;
                return Long.MAX_VALUE;
            }
        }
        if (j > 0) {
            int i32 = a;
            int i33 = (-2) - (((i32 & 116) + (i32 | 116)) ^ (-1));
            b = i33 % 128;
            int i34 = i33 % 2;
            if (jBy2 < 0) {
                int i35 = ((i32 | 107) << 1) - (i32 ^ 107);
                b = i35 % 128;
                int i36 = i35 % 2;
                int i37 = ((i32 | 53) << 1) - (i32 ^ 53);
                b = i37 % 128;
                if (i37 % 2 != 0) {
                    return Long.MIN_VALUE;
                }
                throw null;
            }
        }
        int i38 = b;
        int i39 = i38 & 93;
        int i40 = ((((i38 ^ 93) | i39) << 1) - (~(-((i38 | 93) & (~i39))))) - 1;
        a = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = 16 / 0;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if (r11 > (((r6 | r5) << 1) - (r5 ^ r6))) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        r11 = -r11;
        r3 = r11 & 8;
        r11 = -(-(r11 | 8));
        r5 = (((long) (((r3 | r11) << 1) - (r11 ^ r3))) * 86400000) + r1;
        r4 = r4 + 119;
        ivas.gov.bisp.enumeration.cR.h.b = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        r1 = r1 - (((long) (((((r11 ^ (-1)) | r11) << 1) - (~(-(~r11)))) - 1)) * 86400000);
        r4 = r3 & 27;
        r11 = ((r3 ^ 27) | r4) << 1;
        r3 = -((r3 | 27) & (~r4));
        r4 = (r11 & r3) + (r11 | r3);
        ivas.gov.bisp.enumeration.cR.h.a = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        if (r11 > ((r6 ^ r5) + ((r5 & r6) << 1))) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long bJ(int r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.h.b
            r2 = r1 | 55
            int r2 = r2 << 1
            r3 = r1 & (-56)
            int r1 = ~r1
            r1 = r1 & 55
            r1 = r1 | r3
            int r1 = -r1
            r3 = r2 | r1
            int r3 = r3 << 1
            r1 = r1 ^ r2
            int r3 = r3 - r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cR.h.a = r1
            int r3 = r3 % r0
            if (r3 != 0) goto La4
            long r1 = r10.bV(r11)
            int r11 = r10.bG(r1)
            int r3 = ivas.gov.bisp.enumeration.cR.h.b
            r4 = r3 & 91
            int r5 = ~r4
            r6 = r3 | 91
            r5 = r5 & r6
            int r4 = r4 << 1
            r6 = r5 & r4
            r4 = r4 | r5
            int r6 = r6 + r4
            int r4 = r6 % 128
            ivas.gov.bisp.enumeration.cR.h.a = r4
            int r6 = r6 % r0
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r6 == 0) goto L4f
            int r5 = r10.ag
            int r5 = -r5
            r6 = r5 & 92
            r5 = r5 | 92
            int r5 = -r5
            int r5 = -r5
            r9 = r6 ^ r5
            r5 = r5 & r6
            int r5 = r5 << 1
            int r9 = r9 + r5
            if (r11 <= r9) goto L80
            goto L68
        L4f:
            int r5 = r10.ag
            int r5 = -r5
            r6 = r5 ^ 8
            r9 = r5 & 8
            r6 = r6 | r9
            int r6 = r6 << 1
            int r9 = ~r5
            r9 = r9 & 8
            r5 = r5 & (-9)
            r5 = r5 | r9
            int r5 = -r5
            r9 = r6 | r5
            int r9 = r9 << 1
            r5 = r5 ^ r6
            int r9 = r9 - r5
            if (r11 <= r9) goto L80
        L68:
            int r11 = -r11
            r3 = r11 & 8
            r11 = r11 | 8
            int r11 = -r11
            int r11 = -r11
            r5 = r3 | r11
            int r5 = r5 << 1
            r11 = r11 ^ r3
            int r5 = r5 - r11
            long r5 = (long) r5
            long r5 = r5 * r7
            long r5 = r5 + r1
            int r4 = r4 + 119
            int r11 = r4 % 128
            ivas.gov.bisp.enumeration.cR.h.b = r11
            int r4 = r4 % r0
            return r5
        L80:
            r4 = r11 ^ (-1)
            r4 = r4 | r11
            int r4 = r4 << 1
            int r11 = ~r11
            int r11 = -r11
            int r11 = ~r11
            int r4 = r4 - r11
            int r4 = r4 + (-1)
            long r4 = (long) r4
            long r4 = r4 * r7
            long r1 = r1 - r4
            r11 = r3 ^ 27
            r4 = r3 & 27
            r11 = r11 | r4
            int r11 = r11 << 1
            int r4 = ~r4
            r3 = r3 | 27
            r3 = r3 & r4
            int r3 = -r3
            r4 = r11 & r3
            r11 = r11 | r3
            int r4 = r4 + r11
            int r11 = r4 % 128
            ivas.gov.bisp.enumeration.cR.h.a = r11
            int r4 = r4 % r0
            return r1
        La4:
            long r0 = r10.bV(r11)
            r10.bG(r0)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.h.bJ(int):long");
    }

    public int bM(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 103;
        a = i3 % 128;
        int i4 = i3 % 2;
        if (j < 0) {
            int i5 = ((int) ((j + 1) % 86400000)) - (-86399999);
            int i6 = (i2 ^ 125) + ((i2 & 125) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
        int i8 = i2 & 109;
        int i9 = ((i2 ^ 109) | i8) << 1;
        int i10 = -((~i8) & (i2 | 109));
        int i11 = (i9 & i10) + (i9 | i10);
        a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (int) (j % 86400000);
        int i14 = (i2 ^ 103) + ((i2 & 103) << 1);
        a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 3 / 0;
        }
        return i13;
    }

    public int bQ(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 77;
        int i5 = (i3 | 77) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        b = i7 % 128;
        int i8 = i7 % 2;
        long jBJ = bJ(i);
        if (j < jBJ) {
            int i9 = a;
            int i10 = i9 & 97;
            int i11 = ((i9 ^ 97) | i10) << 1;
            int i12 = -((i9 | 97) & (~i10));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            b = i13 % 128;
            return i13 % 2 == 0 ? bR((i ^ (-1)) + (i << 1)) : bR(i - 1);
        }
        if (j < bJ((i & 1) + (i | 1))) {
            int i14 = (int) ((j - jBJ) / 604800000);
            int i15 = i14 & 1;
            int i16 = i14 | 1;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            int i18 = b + 1;
            a = i18 % 128;
            int i19 = i18 % 2;
            return i17;
        }
        int i20 = b;
        int i21 = i20 & 1;
        int i22 = (i20 ^ 1) | i21;
        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
        a = i23 % 128;
        int i24 = i23 % 2;
        int i25 = i20 + 53;
        a = i25 % 128;
        if (i25 % 2 == 0) {
            return 1;
        }
        throw null;
    }

    public long bW(int i, int i2, int i3) {
        long jBV;
        long jBO;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = i5 & 19;
        int i7 = i6 + ((i5 ^ 19) | i6);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            jBV = bV(i);
            jBO = bO(i, i2);
            int i8 = 92 / 0;
        } else {
            jBV = bV(i);
            jBO = bO(i, i2);
        }
        int i9 = b;
        int i10 = ((i9 & 4) + (i9 | 4)) - 1;
        a = i10 % 128;
        int i11 = i10 % 2;
        long j = ((long) (i3 - 1)) * 86400000;
        int i12 = (i9 ^ 7) + ((i9 & 7) << 1);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        long j2 = j + jBO + jBV;
        int i15 = i13 + 35;
        b = i15 % 128;
        int i16 = i15 % 2;
        return j2;
    }

    public int ca(long j, int i, int i2) {
        long jBV;
        long jBO;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 9;
        int i6 = -(-((i4 ^ 9) | i5));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        b = i7 % 128;
        if (i7 % 2 == 0) {
            jBV = bV(i);
            jBO = bO(i, i2);
            int i8 = 87 / 0;
        } else {
            jBV = bV(i);
            jBO = bO(i, i2);
        }
        int i9 = b;
        int i10 = (i9 & (-40)) | ((~i9) & 39);
        int i11 = (i9 & 39) << 1;
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = i12 % 128;
        a = i13;
        int i14 = i12 % 2;
        int i15 = (int) ((j - (jBO + jBV)) / 86400000);
        int i16 = i15 & 1;
        int i17 = -(-((i15 ^ 1) | i16));
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (i13 ^ 112) + ((i13 & 112) << 1);
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        b = i20 % 128;
        int i21 = i20 % 2;
        return i18;
    }

    public long cb(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = ((i4 ^ 6) + ((i4 & 6) << 1)) - 1;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return bO(i, i2) & bV(i);
        }
        return bO(i, i2) + bV(i);
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 85) + (i2 | 85);
        b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = getClass().getName().hashCode();
        int i5 = a + 31;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            iHashCode = ap().hashCode() << (iHashCode2 * 41);
        } else {
            int iHashCode3 = ap().hashCode();
            int i6 = -(-(iHashCode2 * 11));
            int i7 = iHashCode3 & i6;
            iHashCode = ((i6 | iHashCode3) & (~i7)) + (i7 << 1);
        }
        int i8 = -(-this.ag);
        int i9 = (iHashCode & i8) + (iHashCode | i8);
        int i10 = a;
        int i11 = i10 & 103;
        int i12 = ((i10 ^ 103) | i11) << 1;
        int i13 = -((i10 | 103) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        b = i14 % 128;
        if (i14 % 2 != 0) {
            return i9;
        }
        throw null;
    }

    public int bG(long j) {
        long j2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 | 94) << 1) - (i2 ^ 94)) - 1;
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2;
        if (j >= 0) {
            int i6 = i4 & 121;
            int i7 = (i4 ^ 121) | i6;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            b = i8 % 128;
            j2 = i8 % 2 == 0 ? j & 86400000 : j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            int i9 = (i2 ^ 45) + ((i2 & 45) << 1);
            a = i9 % 128;
            int i10 = i9 % 2;
            if (j2 < -3) {
                int i11 = i2 + 12;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                a = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = (int) ((j2 + 4) % 7);
                    return (((i13 ^ 7) | (i13 & 7)) << 1) - (((~i13) & 7) | (i13 & (-8)));
                }
                int i14 = (int) ((j2 / 4) | 7);
                int i15 = i14 & 36;
                int i16 = (i14 ^ 36) | i15;
                return ((i15 | i16) << 1) - (i16 ^ i15);
            }
        }
        int i17 = (int) ((j2 + 3) % 7);
        int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
        int i19 = b;
        int i20 = i19 & 49;
        int i21 = -(-(i19 | 49));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        a = i22 % 128;
        int i23 = i22 % 2;
        return i18;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j, ivas.gov.bisp.enumeration.cR.c, ivas.gov.bisp.enumeration.p096p.h
    public long ae(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        AbstractC0246t abstractC0246t;
        int i9;
        int i10 = 2 % 2;
        int i11 = b;
        int i12 = i11 ^ 35;
        int i13 = (i11 & 35) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        a = i14 % 128;
        int i15 = i14 % 2;
        ivas.gov.bisp.enumeration.p096p.h hVar = this.e;
        Object obj = null;
        if (hVar != null) {
            int i16 = b;
            int i17 = i16 & 71;
            int i18 = (~i17) & (i16 | 71);
            int i19 = i17 << 1;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            a = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i16 + 35;
            a = i22 % 128;
            int i23 = i22 % 2;
            long jAe = hVar.ae(i, i2, i3, i4, i5, i6, i7);
            int i24 = a;
            int i25 = ((i24 & (-20)) | ((~i24) & 19)) + ((i24 & 19) << 1);
            b = i25 % 128;
            if (i25 % 2 != 0) {
                return jAe;
            }
            obj.hashCode();
            throw null;
        }
        AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.p100w.r.af(AbstractC0246t.s, i4, 0, 23);
        AbstractC0246t abstractC0246t3 = AbstractC0246t.u;
        int i26 = b;
        int i27 = ((i26 & (-76)) | ((~i26) & 75)) + ((i26 & 75) << 1);
        a = i27 % 128;
        if (i27 % 2 != 0) {
            ivas.gov.bisp.enumeration.p100w.r.af(abstractC0246t3, i5, 0, 32);
            abstractC0246t = AbstractC0246t.x;
            i8 = 76;
        } else {
            i8 = 59;
            ivas.gov.bisp.enumeration.p100w.r.af(abstractC0246t3, i5, 0, 59);
            abstractC0246t = AbstractC0246t.x;
        }
        ivas.gov.bisp.enumeration.p100w.r.af(abstractC0246t, i6, 0, i8);
        ivas.gov.bisp.enumeration.p100w.r.af(AbstractC0246t.y, i7, 0, 999);
        int i28 = b;
        int i29 = ((i28 ^ 33) | (i28 & 33)) << 1;
        int i30 = -(((~i28) & 33) | (i28 & (-34)));
        int i31 = (i29 & i30) + (i30 | i29);
        int i32 = i31 % 128;
        a = i32;
        if (i31 % 2 != 0) {
            int i33 = i5 & (-60000);
            int i34 = (i5 ^ (-60000)) | i33;
            i9 = (i6 * 20606) / (((i33 ^ i34) + ((i34 & i33) << 1)) / (i4 / 3600000));
        } else {
            int i35 = i5 * 60000;
            int i36 = 3600000 * i4;
            i9 = (i6 * 1000) + (i35 ^ i36) + ((i36 & i35) << 1);
        }
        int i37 = i32 + 1;
        b = i37 % 128;
        int i38 = i37 % 2;
        int i39 = i9 ^ i7;
        long jBE = bE(i, i2, i3, (((i9 & i7) | i39) << 1) - i39);
        int i40 = a;
        int i41 = ((((i40 ^ 23) | (i40 & 23)) << 1) - (~(-((23 & (~i40)) | (i40 & (-24)))))) - 1;
        b = i41 % 128;
        if (i41 % 2 != 0) {
            return jBE;
        }
        throw null;
    }

    public int bS(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 77;
        int i4 = ((i2 ^ 77) | i3) << 1;
        int i5 = -((i2 | 77) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int iBU = bU(j);
        int iBQ = bQ(j, iBU);
        int i8 = a;
        int i9 = i8 ^ 73;
        int i10 = ((i8 & 73) | i9) << 1;
        int i11 = -i9;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        b = i13;
        int i14 = i12 % 2;
        if (iBQ == 1) {
            int i15 = (i13 | 93) << 1;
            int i16 = -(i13 ^ 93);
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            a = i17 % 128;
            int i18 = i17 % 2;
            int iBU2 = bU(j + 604800000);
            int i19 = b;
            int i20 = ((i19 & (-92)) | ((~i19) & 91)) + ((i19 & 91) << 1);
            a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 45 / 0;
            }
            return iBU2;
        }
        if (iBQ <= 51) {
            int i22 = (i13 ^ 71) + ((i13 & 71) << 1);
            a = i22 % 128;
            if (i22 % 2 == 0) {
                return iBU;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i23 = ((i13 & 62) + (i13 | 62)) - 1;
        a = i23 % 128;
        int iBU3 = bU(i23 % 2 != 0 ? j | 1209600000 : j - 1209600000);
        int i24 = b;
        int i25 = (i24 & 3) + (i24 | 3);
        a = i25 % 128;
        int i26 = i25 % 2;
        return iBU3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051 A[PHI: r7
  0x0051: PHI (r7v3 long) = (r7v2 long), (r7v27 long) binds: [B:12:0x004f, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[PHI: r8
  0x00a1: PHI (r8v6 long) = (r8v5 long), (r8v15 long) binds: [B:22:0x0085, B:19:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104  */
    public int bU(long j) {
        long jBD;
        long jBz;
        char c;
        long j2;
        int i;
        long j3;
        long j4;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = a;
        int i6 = ((i5 ^ 94) + ((i5 & 94) << 1)) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            jBD = bD();
            jBz = bz();
            c = 0;
        } else {
            jBD = bD();
            jBz = bz();
            c = 1;
        }
        int i7 = a;
        int i8 = ((i7 & 10) + (i7 | 10)) - 1;
        int i9 = i8 % 128;
        b = i9;
        if (i8 % 2 == 0) {
            j2 = jBz * (j >>> c);
            if (j2 < 0) {
                j2 = (j2 - jBD) + 1;
                i = i9 + 81;
                a = i % 128;
                if (i % 2 != 0) {
                    int i10 = 3 / 3;
                }
            }
        } else {
            j2 = jBz + (j >> c);
            if (j2 < 0) {
                j2 = (j2 - jBD) + 1;
                i = i9 + 81;
                a = i % 128;
                if (i % 2 != 0) {
                    int i11 = 3 / 3;
                }
            }
        }
        int i12 = (int) (j2 / jBD);
        long jBV = bV(i12);
        int i13 = b;
        int i14 = (((i13 ^ 103) | (i13 & 103)) << 1) - (((~i13) & 103) | (i13 & (-104)));
        int i15 = i14 % 128;
        a = i15;
        if (i14 % 2 != 0) {
            j3 = j * jBV;
            if (j3 < 1) {
                i12--;
                int i16 = ((((i15 ^ 93) | (i15 & 93)) << 1) - (~(-((i15 & (-94)) | ((~i15) & 93))))) - 1;
                b = i16 % 128;
                int i17 = i16 % 2;
            } else {
                j4 = 31536000000L;
                if (j3 >= 31536000000L) {
                    i2 = i15 + 61;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i18 = 35 / 0;
                        if (bX(i12)) {
                            int i19 = a;
                            int i20 = i19 & 99;
                            int i21 = i20 + ((i19 ^ 99) | i20);
                            b = i21 % 128;
                            int i22 = i21 % 2;
                            int i23 = i19 | 3;
                            int i24 = i23 << 1;
                            int i25 = -((~(i19 & 3)) & i23);
                            int i26 = (i24 & i25) + (i25 | i24);
                            b = i26 % 128;
                            int i27 = i26 % 2;
                            j4 = 31622400000L;
                        }
                    } else if (!(!bX(i12))) {
                        int i110 = a;
                        int i28 = i110 & 99;
                        int i29 = i28 + ((i110 ^ 99) | i28);
                        b = i29 % 128;
                        int i210 = i29 % 2;
                        int i211 = i110 | 3;
                        int i212 = i211 << 1;
                        int i213 = -((~(i110 & 3)) & i211);
                        int i214 = (i212 & i213) + (i213 | i212);
                        b = i214 % 128;
                        int i215 = i214 % 2;
                        j4 = 31622400000L;
                    }
                    if (jBV + j4 <= j) {
                        int i30 = a;
                        int i31 = i30 & 105;
                        int i32 = -(-(i30 | 105));
                        i3 = (i31 ^ i32) + ((i31 & i32) << 1);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            i12 %= 1;
                        } else {
                            i12 = (i12 & 1) + (i12 | 1);
                        }
                        int i33 = i30 & 69;
                        int i34 = ((((i30 ^ 69) | i33) << 1) - (~(-((i30 | 69) & (~i33))))) - 1;
                        b = i34 % 128;
                        int i35 = i34 % 2;
                    }
                }
            }
        } else {
            j3 = j - jBV;
            if (j3 < 0) {
                i12--;
                int i111 = ((((i15 ^ 93) | (i15 & 93)) << 1) - (~(-((i15 & (-94)) | ((~i15) & 93))))) - 1;
                b = i111 % 128;
                int i112 = i111 % 2;
            } else {
                j4 = 31536000000L;
                if (j3 >= 31536000000L) {
                    i2 = i15 + 61;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i113 = 35 / 0;
                        if (bX(i12)) {
                            int i114 = a;
                            int i216 = i114 & 99;
                            int i217 = i216 + ((i114 ^ 99) | i216);
                            b = i217 % 128;
                            int i218 = i217 % 2;
                            int i219 = i114 | 3;
                            int i2110 = i219 << 1;
                            int i2111 = -((~(i114 & 3)) & i219);
                            int i2112 = (i2110 & i2111) + (i2111 | i2110);
                            b = i2112 % 128;
                            int i2113 = i2112 % 2;
                            j4 = 31622400000L;
                        }
                    } else if (!(!bX(i12))) {
                        int i115 = a;
                        int i2114 = i115 & 99;
                        int i2115 = i2114 + ((i115 ^ 99) | i2114);
                        b = i2115 % 128;
                        int i2116 = i2115 % 2;
                        int i2117 = i115 | 3;
                        int i2118 = i2117 << 1;
                        int i2119 = -((~(i115 & 3)) & i2117);
                        int i21110 = (i2118 & i2119) + (i2119 | i2118);
                        b = i21110 % 128;
                        int i21111 = i21110 % 2;
                        j4 = 31622400000L;
                    }
                    if (jBV + j4 <= j) {
                        int i36 = a;
                        int i37 = i36 & 105;
                        int i38 = -(-(i36 | 105));
                        i3 = (i37 ^ i38) + ((i37 & i38) << 1);
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            i12 %= 1;
                        } else {
                            i12 = (i12 & 1) + (i12 | 1);
                        }
                        int i39 = i36 & 69;
                        int i310 = ((((i36 ^ 69) | i39) << 1) - (~(-((i36 | 69) & (~i39))))) - 1;
                        b = i310 % 128;
                        int i311 = i310 % 2;
                    }
                }
            }
        }
        int i40 = b + 61;
        a = i40 % 128;
        int i41 = i40 % 2;
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    public long bV(int i) {
        int i2;
        bFG bfg;
        int i3 = 2 % 2;
        int i4 = a;
        int i5 = i4 & 15;
        int i6 = ((i4 | 15) & (~i5)) + (i5 << 1);
        int i7 = i6 % 128;
        b = i7;
        if (i6 % 2 == 0) {
            i2 = i & 12973;
            bfg = this.ah[i2];
        } else {
            i2 = i & 1023;
            bfg = this.ah[i2];
        }
        int i8 = i7 & 19;
        int i9 = i8 + ((i7 ^ 19) | i8);
        int i10 = i9 % 128;
        a = i10;
        int i11 = i9 % 2;
        if (bfg != null) {
            int i12 = (((i10 ^ 27) | (i10 & 27)) << 1) - (((~i10) & 27) | (i10 & (-28)));
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = bfg.a;
            if (i13 == 0) {
                int i15 = 5 / 0;
                if (i14 != i) {
                    bfg = new bFG(i, bF(i));
                    int i16 = a;
                    int i17 = i16 & 15;
                    int i18 = (i16 | 15) & (~i17);
                    int i19 = i17 << 1;
                    int i20 = (i18 & i19) + (i18 | i19);
                    int i21 = i20 % 128;
                    b = i21;
                    int i22 = i20 % 2;
                    this.ah[i2] = bfg;
                    int i23 = i21 & 43;
                    int i24 = i23 + ((i21 ^ 43) | i23);
                    a = i24 % 128;
                    int i25 = i24 % 2;
                }
            } else if (i14 != i) {
                bfg = new bFG(i, bF(i));
                int i110 = a;
                int i111 = i110 & 15;
                int i112 = (i110 | 15) & (~i111);
                int i113 = i111 << 1;
                int i26 = (i112 & i113) + (i112 | i113);
                int i27 = i26 % 128;
                b = i27;
                int i28 = i26 % 2;
                this.ah[i2] = bfg;
                int i29 = i27 & 43;
                int i210 = i29 + ((i27 ^ 43) | i29);
                a = i210 % 128;
                int i211 = i210 % 2;
            }
        } else {
            bfg = new bFG(i, bF(i));
            int i114 = a;
            int i115 = i114 & 15;
            int i116 = (i114 | 15) & (~i115);
            int i117 = i115 << 1;
            int i212 = (i116 & i117) + (i116 | i117);
            int i213 = i212 % 128;
            b = i213;
            int i214 = i212 % 2;
            this.ah[i2] = bfg;
            int i215 = i213 & 43;
            int i216 = i215 + ((i213 ^ 43) | i215);
            a = i216 % 128;
            int i217 = i216 % 2;
        }
        long j = bfg.b;
        int i30 = a;
        int i31 = ((i30 ^ 58) + ((i30 & 58) << 1)) - 1;
        b = i31 % 128;
        int i32 = i31 % 2;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r2 == r7.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r2 == r7.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        r7 = (ivas.gov.bisp.enumeration.cR.h) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r6.ag != r7.ag) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        r2 = ivas.gov.bisp.enumeration.cR.h.b;
        r3 = r2 & 29;
        r3 = r3 + ((r2 ^ 29) | r3);
        ivas.gov.bisp.enumeration.cR.h.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if ((r3 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (ap().equals(r7.ap()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        ap().equals(r7.ap());
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        r7 = ivas.gov.bisp.enumeration.cR.h.a;
        r2 = r7 & 23;
        r2 = (r2 - (~((r7 ^ 23) | r2))) - 1;
        ivas.gov.bisp.enumeration.cR.h.b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r7 = ivas.gov.bisp.enumeration.cR.h.a;
        r2 = ((r7 ^ 117) | (r7 & 117)) << 1;
        r7 = -(((~r7) & 117) | (r7 & (-118)));
        r3 = ((r2 | r7) << 1) - (r7 ^ r2);
        ivas.gov.bisp.enumeration.cR.h.b = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.h.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        if (r8 == ((r2 ^ r1) + ((r1 & r2) << 1))) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
    
        if (r8 == ((r2 ^ (-1)) + (r2 << 1))) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        r8 = ivas.gov.bisp.enumeration.cR.h.a;
        r9 = (r8 & 19) + (r8 | 19);
        r8 = r9 % 128;
        ivas.gov.bisp.enumeration.cR.h.b = r8;
        r9 = r9 % 2;
        r9 = ((r8 | 93) << 1) - (r8 ^ 93);
        ivas.gov.bisp.enumeration.cR.h.a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0117, code lost:
    
        return Long.MIN_VALUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long by(int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.h.by(int, int, int):long");
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int i2 = a;
        int i3 = i2 & 113;
        int i4 = i3 + ((i2 ^ 113) | i3);
        b = i4 % 128;
        int i5 = i4 % 2;
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            int i6 = a;
            int i7 = i6 & 97;
            int i8 = ((((i6 ^ 97) | i7) << 1) - (~(-((i6 | 97) & (~i7))))) - 1;
            b = i8 % 128;
            int i9 = i8 % 2;
            name = name.substring(iLastIndexOf + 1);
            int i10 = b;
            int i11 = ((i10 ^ 73) | (i10 & 73)) << 1;
            int i12 = -(((~i10) & 73) | (i10 & (-74)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            a = i13 % 128;
            int i14 = i13 % 2;
        }
        sb.append(name);
        sb.append('[');
        int i15 = b;
        int i16 = (i15 & (-58)) | ((~i15) & 57);
        int i17 = -(-((i15 & 57) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        a = i18 % 128;
        int i19 = i18 % 2;
        AbstractC0242a abstractC0242aAp = ap();
        if (abstractC0242aAp != null) {
            int i20 = b;
            int i21 = (((i20 ^ 73) | (i20 & 73)) << 1) - (((~i20) & 73) | (i20 & (-74)));
            a = i21 % 128;
            int i22 = i21 % 2;
            sb.append(abstractC0242aAp.g);
            int i23 = (-2) - ((b + 104) ^ (-1));
            a = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 4 / 2;
            }
        }
        Object obj = null;
        if (this.ag != 4) {
            int i25 = b;
            int i26 = (i25 & 93) + (i25 | 93);
            a = i26 % 128;
            if (i26 % 2 != 0) {
                sb.append(",mdfw=");
                throw null;
            }
            sb.append(",mdfw=");
            sb.append(this.ag);
            int i27 = a + 79;
            b = i27 % 128;
            int i28 = i27 % 2;
        }
        sb.append(']');
        String string = sb.toString();
        int i29 = a;
        int i30 = ((i29 & (-54)) | ((~i29) & 53)) + ((i29 & 53) << 1);
        b = i30 % 128;
        if (i30 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cR.AbstractC0248j
    public void bx(AbstractC0248j.bFA bfa) {
        int i = 2 % 2;
        int i2 = b + 13;
        a = i2 % 128;
        int i3 = i2 % 2;
        bfa.d = ivas.gov.bisp.enumeration.cS.z.c;
        bfa.e = R;
        bfa.f = Q;
        bfa.g = S;
        bfa.i = P;
        bfa.h = T;
        bfa.j = af;
        ivas.gov.bisp.enumeration.cP.P p = U;
        int i4 = a;
        int i5 = (-2) - (((i4 ^ 122) + ((i4 & 122) << 1)) ^ (-1));
        b = i5 % 128;
        int i6 = i5 % 2;
        bfa.p = p;
        bfa.f83o = V;
        bfa.q = W;
        bfa.r = X;
        bfa.t = Y;
        bfa.s = Z;
        bfa.u = aa;
        bfa.w = ab;
        bfa.x = ac;
        bfa.y = ad;
        bfa.z = ae;
        P p2 = new P(this);
        bfa.G = p2;
        x xVar = new x(p2, this);
        bfa.I = xVar;
        ivas.gov.bisp.enumeration.cS.P p3 = new ivas.gov.bisp.enumeration.cS.P(xVar, 99);
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        ivas.gov.bisp.enumeration.cS.i iVar = new ivas.gov.bisp.enumeration.cS.i(p3, p3.s(), AbstractC0246t.g, 100);
        bfa.K = iVar;
        bfa.m = iVar.f;
        bfa.J = new ivas.gov.bisp.enumeration.cS.P(new ivas.gov.bisp.enumeration.cS.a(iVar, iVar.c), AbstractC0246t.f, 1);
        bfa.H = new a(this);
        bfa.v = new r(this, bfa.h, 1);
        bfa.B = new r(this, bfa.h, 0);
        bfa.A = new e(this, bfa.h, 0);
        bfa.F = new J(this);
        bfa.E = new z(this);
        bfa.C = new e(this, bfa.j, 1);
        ivas.gov.bisp.enumeration.cP.P p4 = bfa.E;
        ivas.gov.bisp.enumeration.cP.J j = bfa.m;
        AbstractC0246t abstractC0246t2 = AbstractC0246t.k;
        bfa.D = new ivas.gov.bisp.enumeration.cS.P(new ivas.gov.bisp.enumeration.cS.a(p4, j, abstractC0246t2, 100), abstractC0246t2, 1);
        ivas.gov.bisp.enumeration.cP.J jM = bfa.G.m();
        int i7 = a;
        int i8 = i7 & 71;
        int i9 = (i7 ^ 71) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        b = i10 % 128;
        if (i10 % 2 == 0) {
            bfa.l = jM;
            bfa.c = bfa.F.m();
            bfa.k = bfa.E.m();
            int i11 = 13 / 0;
        } else {
            bfa.l = jM;
            bfa.c = bfa.F.m();
            bfa.k = bfa.E.m();
        }
        int i12 = b;
        int i13 = (i12 & 43) + (i12 | 43);
        a = i13 % 128;
        int i14 = i13 % 2;
    }
}
