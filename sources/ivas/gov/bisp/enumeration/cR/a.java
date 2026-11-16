package ivas.gov.bisp.enumeration.cR;

import ivas.gov.bisp.enumeration.cP.AbstractC0246t;
import ivas.gov.bisp.enumeration.cS.AbstractC0253j;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0253j {
    private static int a = 0;
    private static int b = 1;
    public final h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar) {
        super(AbstractC0246t.d);
        AbstractC0246t abstractC0246t = AbstractC0246t.d;
        this.d = hVar;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long A(long j, int i) {
        int i2 = 2 % 2;
        int i3 = (-2) - ((a + 38) ^ (-1));
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.p100w.r.ag(this, i, 0, 1);
        Object obj = null;
        if (f(j) != i) {
            int i5 = b;
            int i6 = (i5 ^ 49) + ((i5 & 49) << 1);
            a = i6 % 128;
            int i7 = i6 % 2;
            int iBU = this.d.bU(j);
            h hVar = this.d;
            int i8 = b;
            int i9 = i8 ^ 63;
            int i10 = -(-((i8 & 63) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            a = i11 % 128;
            if (i11 % 2 != 0) {
                hVar.bZ(j, -iBU);
                obj.hashCode();
                throw null;
            }
            j = hVar.bZ(j, -iBU);
        }
        int i12 = b;
        int i13 = i12 & 59;
        int i14 = ((((i12 ^ 59) | i13) << 1) - (~(-((i12 | 59) & (~i13))))) - 1;
        a = i14 % 128;
        if (i14 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r2 = ((r6 ^ 57) - (~(-(-((r6 & 57) << 1))))) - 1;
        ivas.gov.bisp.enumeration.cR.a.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if ((r2 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r6 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cR.a.b;
        r7 = ((r6 ^ 20) + ((r6 & 20) << 1)) - 1;
        ivas.gov.bisp.enumeration.cR.a.a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if ((r7 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r6 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r6 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r6 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r6 = ivas.gov.bisp.enumeration.cR.a.a;
        r7 = r6 & 19;
        r7 = (r7 - (~((r6 ^ 19) | r7))) - 1;
        ivas.gov.bisp.enumeration.cR.a.b = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if ((r7 % 2) != 0) goto L11;
     */
    @Override // ivas.gov.bisp.enumeration.cP.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(long r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = ivas.gov.bisp.enumeration.cR.a.b
            r2 = r1 ^ 21
            r1 = r1 & 21
            r1 = r1 | r2
            r3 = 1
            int r1 = r1 << r3
            int r2 = -r2
            r4 = r1 ^ r2
            r1 = r1 & r2
            int r1 = r1 << r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            ivas.gov.bisp.enumeration.cR.a.a = r1
            int r4 = r4 % r0
            r1 = 0
            ivas.gov.bisp.enumeration.cR.h r2 = r5.d
            int r6 = r2.bU(r6)
            if (r4 == 0) goto L25
            r7 = 1
            int r7 = r7 / r1
            if (r6 > 0) goto L50
            goto L27
        L25:
            if (r6 > 0) goto L50
        L27:
            int r6 = ivas.gov.bisp.enumeration.cR.a.a
            r7 = r6 & 19
            r2 = r6 ^ 19
            r2 = r2 | r7
            int r2 = ~r2
            int r7 = r7 - r2
            int r7 = r7 - r3
            int r2 = r7 % 128
            ivas.gov.bisp.enumeration.cR.a.b = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L3a
            r7 = r3
            goto L3b
        L3a:
            r7 = r1
        L3b:
            r2 = r6 ^ 57
            r6 = r6 & 57
            int r6 = r6 << r3
            int r6 = -r6
            int r6 = -r6
            int r6 = ~r6
            int r2 = r2 - r6
            int r2 = r2 - r3
            int r6 = r2 % 128
            ivas.gov.bisp.enumeration.cR.a.b = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L4f
            r6 = 17
            int r6 = r6 / r1
        L4f:
            return r7
        L50:
            int r6 = ivas.gov.bisp.enumeration.cR.a.b
            r7 = r6 ^ 20
            r6 = r6 & 20
            int r6 = r6 << r3
            int r7 = r7 + r6
            int r7 = r7 + (-1)
            int r6 = r7 % 128
            ivas.gov.bisp.enumeration.cR.a.a = r6
            int r7 = r7 % r0
            if (r7 == 0) goto L64
            r6 = 95
            int r6 = r6 / r1
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ivas.gov.bisp.enumeration.cR.a.f(long):int");
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J m() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & 9) + (i2 | 9);
        b = i3 % 128;
        int i4 = i3 % 2;
        ivas.gov.bisp.enumeration.cP.x xVar = ivas.gov.bisp.enumeration.cP.x.d;
        if (i4 != 0) {
            return ivas.gov.bisp.enumeration.cS.N.k(xVar);
        }
        ivas.gov.bisp.enumeration.cS.N.k(xVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int q() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 ^ 109;
        int i4 = -(-((i2 & 109) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (-2) - ((i2 + 120) ^ (-1));
        b = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final int r() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = (-2) - ((((i2 | 56) << 1) - (i2 ^ 56)) ^ (-1));
        int i4 = i3 % 128;
        a = i4;
        int i5 = i3 % 2 != 0 ? 0 : 1;
        int i6 = ((i4 ^ 106) + ((i4 & 106) << 1)) - 1;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 99 / 0;
        }
        return i5;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final ivas.gov.bisp.enumeration.cP.J s() {
        int i = 2 % 2;
        int i2 = b + 41;
        a = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        int i3 = 16 / 0;
        return null;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final boolean w() {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-44)) | ((~i2) & 43);
        int i4 = (i2 & 43) << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        b = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 & 65;
        int i8 = (((i2 | 65) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
        b = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    @Override // ivas.gov.bisp.enumeration.cP.P
    public final long y(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = (i2 & (-78)) | ((~i2) & 77);
        int i4 = (i2 & 77) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        int i6 = i5 % 2;
        if (f(j) != 1) {
            int i7 = b;
            int i8 = i7 & 113;
            int i9 = -(-((i7 ^ 113) | i8));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            a = i10 % 128;
            int i11 = i10 % 2;
            return Long.MIN_VALUE;
        }
        int i12 = b;
        int i13 = (i12 & (-40)) | ((~i12) & 39);
        int i14 = -(-((i12 & 39) << 1));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        a = i15 % 128;
        int i16 = i15 % 2;
        long jBZ = this.d.bZ(0L, 1);
        int i17 = a;
        int i18 = i17 & 47;
        int i19 = ((((i17 ^ 47) | i18) << 1) - (~(-((i17 | 47) & (~i18))))) - 1;
        b = i19 % 128;
        int i20 = i19 % 2;
        return jBZ;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long z(long j) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 17;
        int i4 = (((i2 | 17) & (~i3)) - (~(i3 << 1))) - 1;
        b = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            f(j);
            obj.hashCode();
            throw null;
        }
        if (f(j) != 0) {
            int i5 = b;
            int i6 = ((i5 & (-32)) | ((~i5) & 31)) + ((i5 & 31) << 1);
            a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
            return Long.MAX_VALUE;
        }
        long jBZ = this.d.bZ(0L, 1);
        int i8 = a;
        int i9 = (i8 ^ 81) + ((i8 & 81) << 1);
        b = i9 % 128;
        if (i9 % 2 != 0) {
            return jBZ;
        }
        throw null;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final String j(int i, Locale locale) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 & 31;
        int i5 = (i4 - (~(-(-((i3 ^ 31) | i4))))) - 1;
        b = i5 % 128;
        int i6 = i5 % 2;
        String str = C0250o.d(locale).e[i];
        int i7 = a + 85;
        b = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final int p(Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 & 1;
        int i4 = (i2 ^ 1) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = C0250o.d(locale).m;
            throw null;
        }
        int i7 = C0250o.d(locale).m;
        int i8 = a;
        int i9 = ((i8 & (-32)) | ((~i8) & 31)) + ((i8 & 31) << 1);
        b = i9 % 128;
        int i10 = i9 % 2;
        return i7;
    }

    @Override // ivas.gov.bisp.enumeration.cS.AbstractC0253j, ivas.gov.bisp.enumeration.cP.P
    public final long C(long j, String str, Locale locale) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = ((i2 ^ 110) + ((i2 & 110) << 1)) - 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        Integer num = C0250o.d(locale).k.get(str);
        int i5 = b;
        int i6 = ((i5 | 91) << 1) - (i5 ^ 91);
        a = i6 % 128;
        if (i6 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num2 = num;
        if (num2 == null) {
            AbstractC0246t abstractC0246t = AbstractC0246t.d;
            throw new ivas.gov.bisp.enumeration.cP.M(AbstractC0246t.d, str);
        }
        long jA = A(j, num2.intValue());
        int i7 = b;
        int i8 = i7 ^ 39;
        int i9 = -(-((i7 & 39) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        a = i10 % 128;
        int i11 = i10 % 2;
        return jA;
    }
}
