package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ivas.gov.bisp.enumeration.cS.u {
    private static int a = 1;
    private static int b;
    public final /* synthetic */ int f;
    public final h g;

    @Override // ivas.gov.bisp.enumeration.cS.u, ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 73;
        int i4 = ((i2 & 73) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i5 | i4);
        b = i6 % 128;
        int i7 = i6 % 2;
        int i8 = (i2 | 113) << 1;
        int i9 = -(((~i2) & 113) | (i2 & (-114)));
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
        return 1;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (((i2 | 99) << 1) - (~(-(((~i2) & 99) | (i2 & (-100)))))) - 1;
        int i4 = i3 % 128;
        b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f != 0) {
            int i5 = i4 + 101;
            a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 23 / 0;
            }
            return 7;
        }
        Objects.requireNonNull(this.g);
        int i7 = b + 49;
        a = i7 % 128;
        int i8 = i7 % 2;
        return 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r6 = r5.g.bY(r6);
        r7 = ivas.gov.bisp.enumeration.cR.r.a;
        r1 = ((r7 | 71) << 1) - (((~r7) & 71) | (r7 & (-72)));
        ivas.gov.bisp.enumeration.cR.r.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5.f != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5.f != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r6 = ((r1 | 23) << 1) - (r1 ^ 23);
        ivas.gov.bisp.enumeration.cR.r.a = r6 % 128;
        r6 = r6 % 2;
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(long r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.r.a
            r2 = r1 | 31
            int r2 = r2 << 1
            r1 = r1 ^ 31
            int r2 = r2 - r1
            int r1 = r2 % 128
            ivas.gov.bisp.enumeration.cR.r.b = r1
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L1c
            int r2 = r5.f
            r4 = 52
            int r4 = r4 / r3
            if (r2 == 0) goto L2d
            goto L20
        L1c:
            int r2 = r5.f
            if (r2 == 0) goto L2d
        L20:
            r6 = r1 | 23
            int r6 = r6 << 1
            r7 = r1 ^ 23
            int r6 = r6 - r7
            int r7 = r6 % 128
            ivas.gov.bisp.enumeration.cR.r.a = r7
            int r6 = r6 % r0
            return r3
        L2d:
            ivas.gov.bisp.enumeration.cR.h r1 = r5.g
            boolean r6 = r1.bY(r6)
            int r7 = ivas.gov.bisp.enumeration.cR.r.a
            r1 = r7 | 71
            int r1 = r1 << 1
            r2 = r7 & (-72)
            int r7 = ~r7
            r7 = r7 & 71
            r7 = r7 | r2
            int r1 = r1 - r7
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.cR.r.b = r7
            int r1 = r1 % r0
            if (r1 != 0) goto L48
            return r6
        L48:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.r.u(long):boolean");
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j
    public final int D(String str, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
        int i4 = i3 % 128;
        b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.f != 1) {
            int i5 = i4 & 13;
            int i6 = (((~i5) & (i4 | 13)) - (~(i5 << 1))) - 1;
            a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = (i4 & 85) + (i4 | 85);
            a = i8 % 128;
            int i9 = i8 % 2;
            try {
                int i10 = Integer.parseInt(str);
                int i11 = a;
                int i12 = ((i11 ^ 37) | (i11 & 37)) << 1;
                int i13 = -(((~i11) & 37) | (i11 & (-38)));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                b = i14 % 128;
                int i15 = i14 % 2;
                return i10;
            } catch (NumberFormatException unused) {
                throw new ivas.gov.bisp.enumeration.cP.M(this.c, str);
            }
        }
        Integer num = C0250o.d(locale).l.get(str);
        int i16 = b;
        int i17 = i16 + 99;
        a = i17 % 128;
        if (i17 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (num == null) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.m, str);
        }
        int i18 = i16 + 43;
        a = i18 % 128;
        if (i18 % 2 != 0) {
            return num.intValue();
        }
        int iIntValue = num.intValue();
        int i19 = 16 / 0;
        return iIntValue;
    }

    @Override // ivas.gov.bisp.enumeration.cS.u
    public final int F(long j, int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = ((i3 | 73) << 1) - (i3 ^ 73);
        int i5 = i4 % 128;
        b = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (this.f == 0) {
            int iBH = this.g.bH(j, i);
            int i6 = a;
            int i7 = i6 & 113;
            int i8 = (i6 | 113) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            b = i10 % 128;
            int i11 = i10 % 2;
            return iBH;
        }
        int i12 = i5 & 1;
        int i13 = ((i5 | 1) & (~i12)) + (i12 << 1);
        int i14 = i13 % 128;
        a = i14;
        int i15 = i13 % 2;
        int i16 = (i14 & (-50)) | ((~i14) & 49);
        int i17 = (i14 & 49) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        b = i18 % 128;
        int i19 = i18 % 2;
        int iE = E(j);
        int i20 = a;
        int i21 = ((i20 & 70) + (i20 | 70)) - 1;
        b = i21 % 128;
        int i22 = i21 % 2;
        return iE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r7 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cR.C0250o.d(r7).f[r6];
        r7 = ivas.gov.bisp.enumeration.cR.r.a;
        r1 = (r7 | 17) << 1;
        r7 = -(((~r7) & 17) | (r7 & (-18)));
        r2 = (r1 & r7) + (r7 | r1);
        ivas.gov.bisp.enumeration.cR.r.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r5.f != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r5.f != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r7 = ((r1 | 97) << 1) - (r1 ^ 97);
        ivas.gov.bisp.enumeration.cR.r.b = r7 % 128;
        r7 = r7 % 2;
        r6 = java.lang.Integer.toString(r6);
        r7 = ivas.gov.bisp.enumeration.cR.r.a;
        r1 = (r7 & 111) + (r7 | 111);
        ivas.gov.bisp.enumeration.cR.r.b = r1 % 128;
     */
    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String j(int r6, java.util.Locale r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.r.a
            int r2 = r1 + 31
            int r3 = r2 % 128
            ivas.gov.bisp.enumeration.cR.r.b = r3
            int r2 = r2 % r0
            r3 = 1
            if (r2 == 0) goto L18
            int r2 = r5.f
            r4 = 32
            int r4 = r4 / 0
            if (r2 == r3) goto L3e
            goto L1c
        L18:
            int r2 = r5.f
            if (r2 == r3) goto L3e
        L1c:
            r7 = r1 | 97
            int r7 = r7 << r3
            r1 = r1 ^ 97
            int r7 = r7 - r1
            int r1 = r7 % 128
            ivas.gov.bisp.enumeration.cR.r.b = r1
            int r7 = r7 % r0
            java.lang.String r6 = java.lang.Integer.toString(r6)
            int r7 = ivas.gov.bisp.enumeration.cR.r.a
            r1 = r7 & 111(0x6f, float:1.56E-43)
            r7 = r7 | 111(0x6f, float:1.56E-43)
            int r1 = r1 + r7
            int r7 = r1 % 128
            ivas.gov.bisp.enumeration.cR.r.b = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L3d
            r7 = 44
            int r7 = r7 / 0
        L3d:
            return r6
        L3e:
            ivas.gov.bisp.enumeration.cR.o r7 = ivas.gov.bisp.enumeration.cR.C0250o.d(r7)
            java.lang.String[] r7 = r7.f
            r6 = r7[r6]
            int r7 = ivas.gov.bisp.enumeration.cR.r.a
            r1 = r7 | 17
            int r1 = r1 << r3
            r2 = r7 & (-18)
            int r7 = ~r7
            r7 = r7 & 17
            r7 = r7 | r2
            int r7 = -r7
            r2 = r1 & r7
            r7 = r7 | r1
            int r2 = r2 + r7
            int r7 = r2 % 128
            ivas.gov.bisp.enumeration.cR.r.b = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L5e
            return r6
        L5e:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.r.j(int, java.util.Locale):java.lang.String");
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final int p(Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 5) + ((i2 & 5) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.f != 1) {
            int iP = super.p(locale);
            int i5 = a;
            int i6 = (((i5 | 68) << 1) - (i5 ^ 68)) - 1;
            b = i6 % 128;
            if (i6 % 2 == 0) {
                return iP;
            }
            throw null;
        }
        int i7 = C0250o.d(locale).n;
        int i8 = a;
        int i9 = ((i8 | 125) << 1) - (i8 ^ 125);
        b = i9 % 128;
        if (i9 % 2 == 0) {
            return i7;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (((i2 ^ 79) | (i2 & 79)) << 1) - ((i2 & (-80)) | ((~i2) & 79));
        a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.f == 0) {
            ivas.gov.bisp.enumeration.cP.J j = this.g.f82o;
            int i4 = a;
            int i5 = ((i4 & 91) - (~(-(-(i4 | 91))))) - 1;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                return j;
            }
            throw null;
        }
        int i6 = i2 + 41;
        a = i6 % 128;
        int i7 = i6 % 2;
        ivas.gov.bisp.enumeration.cP.J j2 = this.g.l;
        int i8 = a;
        int i9 = ((i8 & 16) + (i8 | 16)) - 1;
        b = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 55 / 0;
        }
        return j2;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final String g(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 9;
        int i5 = -(-(i3 | 9));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        b = i7;
        int i8 = i6 % 2;
        if (this.f == 1) {
            String str = C0250o.d(locale).g[i];
            int i9 = b;
            int i10 = (i9 ^ 23) + ((i9 & 23) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return str;
        }
        int i12 = i7 + 43;
        a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i7 ^ 61;
        int i15 = ((((i7 & 61) | i14) << 1) - (~(-i14))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        String strJ = j(i, locale);
        int i17 = b + 27;
        a = i17 % 128;
        int i18 = i17 % 2;
        return strJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h hVar, ivas.gov.bisp.enumeration.cP.J j, int i) {
        super(AbstractC0246t.j, j);
        this.f = i;
        if (i != 1) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            this.g = hVar;
        } else {
            AbstractC0246t abstractC0246t2 = AbstractC0246t.d;
            super(AbstractC0246t.m, j);
            this.g = hVar;
        }
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j
    public final int E(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (-2) - ((i2 + 22) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.f == 0) {
            h hVar = this.g;
            int iBU = hVar.bU(j);
            int i5 = a;
            int i6 = ((i5 | 121) << 1) - (i5 ^ 121);
            b = i6 % 128;
            if (i6 % 2 != 0) {
                hVar.bI(iBU, hVar.bK(j, iBU));
                throw null;
            }
            int iBI = hVar.bI(iBU, hVar.bK(j, iBU));
            int i7 = b + 39;
            a = i7 % 128;
            int i8 = i7 % 2;
            return iBI;
        }
        int i9 = i2 + 105;
        int i10 = i9 % 128;
        b = i10;
        int i11 = i9 % 2;
        int i12 = i10 & 9;
        int i13 = (i10 ^ 9) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        a = i14 % 128;
        int i15 = i14 % 2;
        int iR = r();
        int i16 = a + 77;
        b = i16 % 128;
        if (i16 % 2 == 0) {
            return iR;
        }
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int f(long j) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 & 37;
        int i4 = -(-((i2 ^ 37) | i3));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        a = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (this.f == 0) {
            h hVar = this.g;
            int iBU = hVar.bU(j);
            int i7 = b;
            int i8 = i7 & 119;
            int i9 = ((i7 ^ 119) | i8) << 1;
            int i10 = -((i7 | 119) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            a = i11 % 128;
            if (i11 % 2 == 0) {
                hVar.bK(j, iBU);
                obj.hashCode();
                throw null;
            }
            int iCa = hVar.ca(j, iBU, hVar.bK(j, iBU));
            int i12 = a;
            int i13 = i12 & 121;
            int i14 = i12 | 121;
            int i15 = (i13 & i14) + (i14 | i13);
            b = i15 % 128;
            int i16 = i15 % 2;
            return iCa;
        }
        int i17 = (i2 & (-60)) | ((~i2) & 59);
        int i18 = -(-((i2 & 59) << 1));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        int i20 = i19 % 128;
        a = i20;
        int i21 = i19 % 2;
        int i22 = i20 | 71;
        int i23 = i22 << 1;
        int i24 = -((~(i20 & 71)) & i22);
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        b = i25 % 128;
        int i26 = i25 % 2;
        int iBG = this.g.bG(j);
        int i27 = a;
        int i28 = i27 & 73;
        int i29 = (i27 | 73) & (~i28);
        int i30 = -(-(i28 << 1));
        int i31 = (i29 & i30) + (i29 | i30);
        b = i31 % 128;
        if (i31 % 2 == 0) {
            return iBG;
        }
        obj.hashCode();
        throw null;
    }
}
