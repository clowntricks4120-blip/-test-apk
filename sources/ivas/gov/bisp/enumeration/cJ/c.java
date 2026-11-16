package ivas.gov.bisp.enumeration.cJ;

import ivas.gov.bisp.enumeration.cP.AbstractC0242a;
import ivas.gov.bisp.enumeration.cP.R;
import ivas.gov.bisp.enumeration.cR.N;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static int a = 1;
    private static int b;
    public final l c;
    public final t d;
    public final Locale e;
    public final boolean f;
    public final AbstractC0242a g;
    public final ivas.gov.bisp.enumeration.p096p.h h;
    public final Integer i;
    public final int j;

    public c(l lVar, t tVar) {
        this.c = lVar;
        this.d = tVar;
        this.e = null;
        this.f = false;
        this.h = null;
        this.g = null;
        this.i = null;
        this.j = 2000;
    }

    public r d() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
        b = i3 % 128;
        int i4 = i3 % 2;
        r rVarC = u.c(this.d);
        int i5 = a;
        int i6 = ((i5 ^ 10) + ((i5 & 10) << 1)) - 1;
        b = i6 % 128;
        int i7 = i6 % 2;
        return rVarC;
    }

    public String f(R r) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(i().p());
        int i2 = a;
        int i3 = (i2 & (-118)) | ((~i2) & 117);
        int i4 = (i2 & 117) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        b = i5 % 128;
        Object obj = null;
        try {
            if (i5 % 2 != 0) {
                AtomicReference<Map<String, AbstractC0242a>> atomicReference = ivas.gov.bisp.enumeration.cP.u.c;
                r.s();
                r.b();
                throw null;
            }
            AtomicReference<Map<String, AbstractC0242a>> atomicReference2 = ivas.gov.bisp.enumeration.cP.u.c;
            long jS = r.s();
            ivas.gov.bisp.enumeration.p096p.h hVarB = r.b();
            int i6 = b;
            int i7 = i6 + 65;
            a = i7 % 128;
            int i8 = i7 % 2;
            if (hVarB == null) {
                int i9 = i6 & 81;
                int i10 = -(-((i6 ^ 81) | i9));
                int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                a = i11 % 128;
                if (i11 % 2 == 0) {
                    N.bz();
                    throw null;
                }
                hVarB = N.bz();
                int i12 = a + 55;
                b = i12 % 128;
                int i13 = i12 % 2;
            }
            g(sb, jS, hVarB);
            int i14 = b;
            int i15 = i14 ^ 33;
            int i16 = (((i14 & 33) | i15) << 1) - i15;
            a = i16 % 128;
            int i17 = i16 % 2;
            String string = sb.toString();
            int i18 = a;
            int i19 = (((i18 | 26) << 1) - (i18 ^ 26)) - 1;
            b = i19 % 128;
            if (i19 % 2 == 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r12 = null;
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r10 = new ivas.gov.bisp.enumeration.cJ.c(r11.c, r11.d, r11.e, r11.f, r12, r11.g, r11.i, r11.j);
        r12 = ivas.gov.bisp.enumeration.cJ.c.b + 85;
        ivas.gov.bisp.enumeration.cJ.c.a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r2 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r2 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r12 = (r1 & 117) + (r1 | 117);
        ivas.gov.bisp.enumeration.cJ.c.b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if ((r12 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ivas.gov.bisp.enumeration.cJ.c j(ivas.gov.bisp.enumeration.p096p.h r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cJ.c.b
            r2 = r1 & 119(0x77, float:1.67E-43)
            r1 = r1 ^ 119(0x77, float:1.67E-43)
            r1 = r1 | r2
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cJ.c.a = r1
            int r3 = r3 % r0
            ivas.gov.bisp.enumeration.p.h r2 = r11.h
            if (r3 != 0) goto L20
            r3 = 55
            int r3 = r3 / 0
            if (r2 != r12) goto L34
            goto L22
        L20:
            if (r2 != r12) goto L34
        L22:
            r12 = r1 & 117(0x75, float:1.64E-43)
            r1 = r1 | 117(0x75, float:1.64E-43)
            int r12 = r12 + r1
            int r1 = r12 % 128
            ivas.gov.bisp.enumeration.cJ.c.b = r1
            int r12 = r12 % r0
            if (r12 != 0) goto L2f
            return r11
        L2f:
            r12 = 0
            r12.hashCode()
            throw r12
        L34:
            ivas.gov.bisp.enumeration.cJ.c r10 = new ivas.gov.bisp.enumeration.cJ.c
            ivas.gov.bisp.enumeration.cJ.l r2 = r11.c
            ivas.gov.bisp.enumeration.cJ.t r3 = r11.d
            java.util.Locale r4 = r11.e
            boolean r5 = r11.f
            ivas.gov.bisp.enumeration.cP.a r7 = r11.g
            java.lang.Integer r8 = r11.i
            int r9 = r11.j
            r1 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            int r12 = ivas.gov.bisp.enumeration.cJ.c.b
            int r12 = r12 + 85
            int r1 = r12 % 128
            ivas.gov.bisp.enumeration.cJ.c.a = r1
            int r12 = r12 % r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.c.j(ivas.gov.bisp.enumeration.p.h):ivas.gov.bisp.enumeration.cJ.c");
    }

    public final ivas.gov.bisp.enumeration.p096p.h h(ivas.gov.bisp.enumeration.p096p.h hVar) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 61) | (i2 & 61)) << 1;
        int i4 = -(((~i2) & 61) | (i2 & (-62)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        if (i5 % 2 != 0) {
            ivas.gov.bisp.enumeration.cP.u.b(hVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ivas.gov.bisp.enumeration.p096p.h hVarB = ivas.gov.bisp.enumeration.cP.u.b(hVar);
        ivas.gov.bisp.enumeration.p096p.h hVar2 = this.h;
        if (hVar2 != null) {
            int i6 = a + 109;
            b = i6 % 128;
            int i7 = i6 % 2;
            hVarB = hVar2;
        }
        AbstractC0242a abstractC0242a = this.g;
        if (abstractC0242a != null) {
            int i8 = a;
            int i9 = (i8 & 67) + (i8 | 67);
            b = i9 % 128;
            if (i9 % 2 != 0) {
                hVarB = hVarB.be(abstractC0242a);
                int i10 = 72 / 0;
            } else {
                hVarB = hVarB.be(abstractC0242a);
            }
            int i11 = a;
            int i12 = (i11 ^ 81) + ((i11 & 81) << 1);
            b = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = b;
        int i15 = ((i14 & 39) - (~(-(-(i14 | 39))))) - 1;
        a = i15 % 128;
        int i16 = i15 % 2;
        return hVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        throw new java.lang.UnsupportedOperationException("Printing not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r3 = r1 & 59;
        r3 = (r3 - (~(-(-((r1 ^ 59) | r3))))) - 1;
        ivas.gov.bisp.enumeration.cJ.c.a = r3 % 128;
        r3 = r3 % 2;
        r3 = r1 | 9;
        r4 = ((r3 << 1) - (~(-((~(r1 & 9)) & r3)))) - 1;
        ivas.gov.bisp.enumeration.cJ.c.a = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ivas.gov.bisp.enumeration.cJ.l i() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cJ.c.a
            r2 = r1 & 43
            r1 = r1 ^ 43
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            r3 = r2 ^ r1
            r1 = r1 & r2
            int r1 = r1 << 1
            int r3 = r3 + r1
            int r1 = r3 % 128
            ivas.gov.bisp.enumeration.cJ.c.b = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L22
            ivas.gov.bisp.enumeration.cJ.l r2 = r5.c
            r3 = 48
            int r3 = r3 / 0
            if (r2 == 0) goto L49
            goto L26
        L22:
            ivas.gov.bisp.enumeration.cJ.l r2 = r5.c
            if (r2 == 0) goto L49
        L26:
            r3 = r1 & 59
            r4 = r1 ^ 59
            r4 = r4 | r3
            int r4 = -r4
            int r4 = -r4
            int r4 = ~r4
            int r3 = r3 - r4
            int r3 = r3 + (-1)
            int r4 = r3 % 128
            ivas.gov.bisp.enumeration.cJ.c.a = r4
            int r3 = r3 % r0
            r3 = r1 | 9
            int r4 = r3 << 1
            r1 = r1 & 9
            int r1 = ~r1
            r1 = r1 & r3
            int r1 = -r1
            int r1 = ~r1
            int r4 = r4 - r1
            int r4 = r4 + (-1)
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.cJ.c.a = r1
            int r4 = r4 % r0
            return r2
        L49:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Printing not supported"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.c.i():ivas.gov.bisp.enumeration.cJ.l");
    }

    public c k() {
        c cVar;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 | 105;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 105)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        a = i6 % 128;
        int i7 = i6 % 2;
        AbstractC0242a abstractC0242a = AbstractC0242a.c;
        if (this.g == abstractC0242a) {
            int i8 = b;
            int i9 = ((i8 & 67) - (~(-(-(i8 | 67))))) - 1;
            a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 & 95;
            int i12 = (i8 | 95) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            a = i14 % 128;
            int i15 = i14 % 2;
            cVar = this;
        } else {
            cVar = new c(this.c, this.d, this.e, false, this.h, abstractC0242a, this.i, this.j);
            int i16 = b;
            int i17 = (-2) - (((i16 ^ 26) + ((i16 & 26) << 1)) ^ (-1));
            a = i17 % 128;
            if (i17 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i18 = a;
        int i19 = ((i18 | 89) << 1) - (i18 ^ 89);
        b = i19 % 128;
        int i20 = i19 % 2;
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c7  */
    public final void g(Appendable appendable, long j, ivas.gov.bisp.enumeration.p096p.h hVar) {
        long j2;
        AbstractC0242a abstractC0242a;
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 97;
        int i4 = (i2 ^ 97) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        l lVarI = i();
        ivas.gov.bisp.enumeration.p096p.h hVarH = h(hVar);
        int i7 = a;
        int i8 = (i7 | 15) << 1;
        int i9 = -(i7 ^ 15);
        int i10 = (i8 & i9) + (i9 | i8);
        b = i10 % 128;
        int i11 = i10 % 2;
        AbstractC0242a abstractC0242aAp = hVarH.ap();
        int iN = abstractC0242aAp.n(j);
        int i12 = a;
        int i13 = i12 & 79;
        int i14 = ((i12 ^ 79) | i13) << 1;
        int i15 = -((i12 | 79) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 % 128;
        b = i17;
        int i18 = i16 % 2;
        long j3 = iN;
        long j4 = j + j3;
        int i19 = i17 & 85;
        int i20 = -(-((i17 ^ 85) | i19));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((i17 | 118) << 1) - (i17 ^ 118);
        int i24 = (i23 ^ (-1)) + (i23 << 1);
        int i25 = i24 % 128;
        a = i25;
        if (i24 % 2 != 0 ? (j ^ j4) >= 0 : j - j4 >= 0) {
            abstractC0242a = abstractC0242aAp;
            j2 = j4;
        } else if ((j3 ^ j) >= 0) {
            int i26 = (i25 & (-32)) | ((~i25) & 31);
            int i27 = -(-((i25 & 31) << 1));
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            b = i28 % 128;
            int i29 = i28 % 2;
            AbstractC0242a abstractC0242a2 = AbstractC0242a.c;
            int i30 = b;
            int i31 = i30 & 111;
            int i32 = (i30 | 111) & (~i31);
            int i33 = i31 << 1;
            int i34 = (i32 & i33) + (i32 | i33);
            a = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = 2 % 4;
            }
            iN = 0;
            j2 = j;
            abstractC0242a = abstractC0242a2;
        } else {
            abstractC0242a = abstractC0242aAp;
            j2 = j4;
        }
        int i36 = iN;
        ivas.gov.bisp.enumeration.p096p.h hVarBa = hVarH.ba();
        int i37 = a;
        int i38 = i37 & 121;
        int i39 = (((i37 | 121) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
        b = i39 % 128;
        if (i39 % 2 == 0) {
            lVarI.q(appendable, j2, hVarBa, i36, abstractC0242a, this.e);
            return;
        }
        lVarI.q(appendable, j2, hVarBa, i36, abstractC0242a, this.e);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public c(l lVar, t tVar, Locale locale, boolean z, ivas.gov.bisp.enumeration.p096p.h hVar, AbstractC0242a abstractC0242a, Integer num, int i) {
        this.c = lVar;
        this.d = tVar;
        this.e = locale;
        this.f = z;
        this.h = hVar;
        this.g = abstractC0242a;
        this.i = num;
        this.j = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        if (r2 >= r14.length()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        if (r2 >= r14.length()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        r1 = r3.d(true, r14);
        r14 = ivas.gov.bisp.enumeration.cJ.c.b;
        r3 = (((r14 & (-118)) | ((~r14) & 117)) - (~((r14 & 117) << 1))) - 1;
        ivas.gov.bisp.enumeration.cJ.c.a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        if ((r3 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        r14 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long e(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cJ.c.e(java.lang.String):long");
    }
}
